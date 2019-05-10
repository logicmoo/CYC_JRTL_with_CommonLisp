package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_generation_fort_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_generation_fort_cache";
  public static final String myFingerPrint = "82d35faade12a074331d55fc015990ee7b887a0890a157e50070830614aac6da";
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 1455L)
  private static SubLSymbol $english_generation_fort_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 1876L)
  public static SubLSymbol $english_generation_fht_name$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 1982L)
  public static SubLSymbol $use_generic_singular_nl_generation_fort_cacheP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 2133L)
  public static SubLSymbol $english_generation_base_file_name$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 2379L)
  private static SubLSymbol $nl_generation_fht_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 4460L)
  private static SubLSymbol $max_kbs_backward_to_look_for_generation_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 5431L)
  private static SubLSymbol $preload_nl_generation_cachesP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10260L)
  private static SubLSymbol $nl_generation_fort_cache_generator_timestamp$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10341L)
  private static SubLSymbol $nl_generation_fort_cache_paraphrase_mt$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10523L)
  private static SubLSymbol $nl_generation_fort_cache_nl_preds$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10606L)
  public static SubLSymbol $nl_generation_fort_cache_break_on_timeoutP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10678L)
  public static SubLSymbol $nl_generation_fort_cache_retry_on_timeoutP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10747L)
  public static SubLSymbol $nl_generation_fort_cache_timeout$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10808L)
  public static SubLSymbol $nl_generation_fort_cache_generate_plotsP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10960L)
  private static SubLSymbol $nl_generation_fort_cache_median_times$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11027L)
  private static SubLSymbol $nl_generation_fort_cache_total_times$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11092L)
  private static SubLSymbol $nl_generation_fort_cache_cpu_times$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11155L)
  private static SubLSymbol $nl_generation_fort_cache_swap_times$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11219L)
  private static SubLSymbol $nl_generation_fort_cache_failed_fort_counts$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11291L)
  private static SubLSymbol $nl_generation_fort_cache_gc_times$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11353L)
  private static SubLSymbol $nl_generation_fort_cache_working_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11424L)
  private static SubLSymbol $nl_generation_fort_cache_batch_size$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11573L)
  private static SubLSymbol $nl_generation_fort_cache_assignment_size$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11759L)
  private static SubLSymbol $nl_fort_generation_task$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 11894L)
  private static SubLSymbol $nl_fort_generation_results_queue$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 14400L)
  private static SubLSymbol $rich_nl_generation_cache_styleP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 19521L)
  public static SubLSymbol $nl_generation_fort_cache_use_forked_processesP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 21044L)
  private static SubLSymbol $failed_nl_fort_generation_tasks$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 23063L)
  private static SubLSymbol $nl_generation_fort_cache_retry_failed_tasksP$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 39667L)
  private static SubLSymbol $nanoseconds_per_second$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 45855L)
  private static SubLSymbol $nart_max_sister_to_gaf_ratio$;
  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 50165L)
  private static SubLSymbol $nl_generation_cache_exceptions$;
  private static final SubLSymbol $sym0$_ENGLISH_GENERATION_FORT_CACHE_;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$_ENGLISH_GENERATION_BASE_FILE_NAME_;
  private static final SubLString $str3$generic_singular_nl_generation_fo;
  private static final SubLSymbol $kw4$LEXICAL;
  private static final SubLString $str5$nl_generation_fht_lock;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$CACHE;
  private static final SubLSymbol $sym8$BASE_FILE_NAME;
  private static final SubLSymbol $sym9$CLET;
  private static final SubLSymbol $sym10$_ENGLISH_GENERATION_FHT_NAME_;
  private static final SubLList $list11;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$CUNWIND_PROTECT;
  private static final SubLSymbol $sym14$PROGN;
  private static final SubLSymbol $sym15$SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE;
  private static final SubLSymbol $sym16$RESTORE_ENGLISH_GENERATION_FORT_CACHE;
  private static final SubLSymbol $sym17$GET_ENGLISH_GENERATION_FORT_CACHE;
  private static final SubLSymbol $sym18$WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH;
  private static final SubLString $str19$_;
  private static final SubLSymbol $sym20$INITIALIZE_NL_GENERATION_CACHES;
  private static final SubLInteger $int21$100;
  private static final SubLSymbol $kw22$HL_EXTERNALIZED_KEYS;
  private static final SubLSymbol $kw23$NL_PREDS;
  private static final SubLList $list24;
  private static final SubLSymbol $kw25$LANGUAGE_MT;
  private static final SubLSymbol $kw26$UNINITIALIZED;
  private static final SubLInteger $int27$60;
  private static final SubLInteger $int28$10000;
  private static final SubLString $str29$NL_FORT_Generation_Results_Queue;
  private static final SubLInteger $int30$255;
  private static final SubLString $str31$tmp_;
  private static final SubLString $str32$Gen_template_store_is_stale_;
  private static final SubLString $str33$Generating_nl_cache_to_file___A;
  private static final SubLSymbol $sym34$HLMT_P;
  private static final SubLString $str35$fort_count_cfasl;
  private static final SubLString $str36$Generating_FORT_paraphrases__;
  private static final SubLString $str37$____;
  private static final SubLString $str38$_S_already_exists_;
  private static final SubLSymbol $sym39$CREATE_FILTERED_NL_GENERATION_FHT_FROM_DATA;
  private static final SubLString $str40$Cannot_filter_without_a_set__got_;
  private static final SubLString $str41$Compiling_file_hashtable_from_par;
  private static final SubLSymbol $sym42$DIRECTORY_P;
  private static final SubLSymbol $sym43$STRING_;
  private static final SubLString $str44$cdolist;
  private static final SubLString $str45$_done;
  private static final SubLString $str46$Skipping_assignment_directory_wit;
  private static final SubLString $str47$build_kb_loaded_cfasl;
  private static final SubLString $str48$_results_cfasl;
  private static final SubLString $str49$_fast_results_cfasl;
  private static final SubLString $str50$Using_results_file__S;
  private static final SubLSymbol $kw51$INPUT;
  private static final SubLString $str52$Unable_to_open__S;
  private static final SubLSymbol $kw53$EOF;
  private static final SubLString $str54$Non_FORT__S_in_paraphrase_data___;
  private static final SubLString $str55$Bad_paraphrase_data_for__S_in__S_;
  private static final SubLString $str56$Skipping_black_listed_term__A___;
  private static final SubLSymbol $kw57$USE_FIRST;
  private static final SubLString $str58$nl_generation_cache_work_;
  private static final SubLString $str59$777;
  private static final SubLString $str60$assignment_size_cfasl;
  private static final SubLString $str61$paraphrase_mt_cfasl;
  private static final SubLString $str62$Assignment_size_is__S__Must_be_a_;
  private static final SubLString $str63$_;
  private static final SubLString $str64$__0D__;
  private static final SubLString $str65$__0D_;
  private static final SubLString $str66$error_output_log;
  private static final SubLString $str67$__Assigning_task__S__;
  private static final SubLSymbol $sym68$DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK;
  private static final SubLSymbol $sym69$WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER;
  private static final SubLString $str70$__Just_dequeued__S_after_enqueuei;
  private static final SubLString $str71$__Successfully_completed__S__;
  private static final SubLString $str72$Received_failure_code_on_task__S;
  private static final SubLString $str73$Didn_t_recognize_exit_code__S;
  private static final SubLString $str74$NL_FORT_Generation_subtask_report;
  private static final SubLString $str75$__About_to_enqueue_new_exit_code_;
  private static final SubLString $str76$Just_received_task_specification_;
  private static final SubLList $list77;
  private static final SubLString $str78$Returning__S;
  private static final SubLString $str79$results_cfasl;
  private static final SubLString $str80$fast_results_cfasl;
  private static final SubLSymbol $sym81$DO_FORT_PARAPHRASE_CACHE_GENERATION_FOR_DIRECTORY;
  private static final SubLString $str82$done;
  private static final SubLSymbol $kw83$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym84$IGNORE_ERRORS_HANDLER;
  private static final SubLList $list85;
  private static final SubLString $str86$prior_results_cfasl;
  private static final SubLSymbol $kw87$OUTPUT;
  private static final SubLString $str88$stats_log;
  private static final SubLSymbol $kw89$APPEND;
  private static final SubLString $str90$Generating_nl_for_forts_;
  private static final SubLString $str91$_through_;
  private static final SubLString $str92$__PPH_phrase_count___;
  private static final SubLString $str93$_____;
  private static final SubLString $str94$;
  private static final SubLSymbol $kw95$SKIP;
  private static final SubLList $list96;
  private static final SubLString $str97$Timed_out_on_first_try_after__A_g;
  private static final SubLSymbol $sym98$BREAK;
  private static final SubLSymbol $sym99$WARN;
  private static final SubLString $str100$Timed_out_after__A_generating_par;
  private static final SubLString $str101$Failed_to_generate_a_string_for__;
  private static final SubLString $str102$Generated_empty_string_for__S;
  private static final SubLString $str103$PPH_phrase_count_grew_from__D_to_;
  private static final SubLSymbol $kw104$NEW;
  private static final SubLInteger $int105$500;
  private static final SubLString $str106$Verifying_;
  private static final SubLString $str107$_constants___;
  private static final SubLString $str108$_S____Cached___S___Generated___S_;
  private static final SubLString $str109$_NARTs___;
  private static final SubLString $str110$_D_of__D_constants_verified___F__;
  private static final SubLString $str111$_D_of__D_narts_verified___F____;
  private static final SubLString $str112$__First_non_finished__missing__di;
  private static final SubLString $str113$__First_non_finished__failed__dir;
  private static final SubLInteger $int114$128;
  private static final SubLString $str115$Clearing_PPH_memoization_for__S;
  private static final SubLString $str116$__Paraphrased_batch___D_of__S_FOR;
  private static final SubLSymbol $sym117$_;
  private static final SubLString $str118$__Total_paraphrase_time___S__;
  private static final SubLString $str119$__Median_paraphrase_time___S__;
  private static final SubLString $str120$___Sth_percentile_paraphrase_time;
  private static final SubLString $str121$____SWAP_time___A___;
  private static final SubLList $list122;
  private static final SubLList $list123;
  private static final SubLList $list124;
  private static final SubLSymbol $kw125$XLABEL;
  private static final SubLString $str126$Batch__;
  private static final SubLSymbol $kw127$YLABEL;
  private static final SubLSymbol $kw128$PLOT_TITLE;
  private static final SubLSymbol $kw129$OUTPUT_FILE;
  private static final SubLString $str130$_cfasl;
  private static final SubLList $list131;
  private static final SubLSymbol $sym132$_;
  private static final SubLSymbol $sym133$FIRST;
  private static final SubLInteger $int134$1000000000;
  private static final SubLSymbol $sym135$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLList $list136;
  private static final SubLObject $const137$InferencePSC;
  private static final SubLSymbol $kw138$TEXT;
  private static final SubLString $str139$Error_in_paraphrase_fort_for_cach;
  private static final SubLString $str140$Cached_paraphrase_for__S___is__S_;
  private static final SubLFloat $float141$0_001;
  private static final SubLString $str142$__Checking_NL_Generation_cache_ba;
  private static final SubLString $str143$__Done__D__Current_estimate____3F;
  private static final SubLString $str144$Done__S__but_variance_of_approxim;
  private static final SubLString $str145$__The_estimated_staleness_percent;
  private static final SubLString $str146$F__and___;
  private static final SubLString $str147$F____;
  private static final SubLSymbol $sym148$FILE_BACKED_CACHE_P;
  private static final SubLString $str149$Looking_up_nl_generation_for_all_;
  private static final SubLSymbol $kw150$NOT_FOUND;
  private static final SubLObject $const151$EnglishParaphraseMt;
  private static final SubLString $str152$Timed_out_after__S_seconds_genera;
  private static final SubLObject $const153$LogicalFieldAttribute;
  private static final SubLSymbol $sym154$RELEVANT_MT_IS_EVERYTHING;
  private static final SubLObject $const155$EverythingPSC;
  private static final SubLSymbol $sym156$FORT_P;
  private static final SubLSymbol $sym157$CYCL_STRING_P;
  private static final SubLSymbol $sym158$_NL_GENERATION_CACHE_EXCEPTIONS_;
  private static final SubLSymbol $kw159$UNKNOWN;
  private static final SubLSymbol $kw160$IMMEDIATE_INSTANTIATIONS;
  private static final SubLSymbol $kw161$UPWARD_CLOSURE;
  private static final SubLSymbol $kw162$NONE;
  private static final SubLObject $const163$TerrorismParaphraseMt;
  private static final SubLSymbol $kw164$DEFAULT;
  private static final SubLSymbol $sym165$NL_GENERATION_CACHE_METHOD;
  private static final SubLString $str166$Finding_collections_that_don_t_us;
  private static final SubLSymbol $sym167$STRINGP;
  private static final SubLInteger $int168$50;
  private static final SubLString $str169$Testing___A__generate_cache_ratio;
  private static final SubLFloat $float170$1_2;
  private static final SubLString $str171$__Extra_cache_hits_for__S___S_per;
  private static final SubLFloat $float172$0_8;
  private static final SubLString $str173$__Insufficient_cache_hits_for__S_;

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 2554L)
  public static SubLObject with_default_nl_generation_cache_file_path(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject filename = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list6 );
    filename = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject v_cache = $sym7$CACHE;
      final SubLObject base_file_name = $sym8$BASE_FILE_NAME;
      return ConsesLow.list( $sym9$CLET, ConsesLow.list( ConsesLow.list( $sym10$_ENGLISH_GENERATION_FHT_NAME_, filename ), reader.bq_cons( v_cache, $list11 ), reader.bq_cons( base_file_name, $list12 ) ), ConsesLow.list(
          $sym13$CUNWIND_PROTECT, ConsesLow.listS( $sym14$PROGN, ConsesLow.list( $sym15$SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE, filename ), ConsesLow.append( body, NIL ) ), ConsesLow.list(
              $sym16$RESTORE_ENGLISH_GENERATION_FORT_CACHE, v_cache, base_file_name ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list6 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 3217L)
  public static SubLObject get_english_generation_fort_cache()
  {
    return $english_generation_fort_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 3371L)
  public static SubLObject set_temporary_english_generation_fort_cache(final SubLObject filename)
  {
    $english_generation_fort_cache$.setGlobalValue( NIL );
    $english_generation_base_file_name$.setGlobalValue( Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), file_utilities.deconstruct_path( filename ) ) );
    ensure_nl_generation_fort_cache_is_best_available();
    return $english_generation_fort_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 3731L)
  public static SubLObject restore_english_generation_fort_cache(final SubLObject backup, final SubLObject base_file_name)
  {
    $english_generation_fort_cache$.setGlobalValue( backup );
    $english_generation_base_file_name$.setGlobalValue( base_file_name );
    return $english_generation_fort_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 4020L)
  public static SubLObject get_default_nl_generation_cache_file_path(SubLObject kb)
  {
    if( kb == UNPROVIDED )
    {
      kb = control_vars.kb_loaded();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != subl_promotions.positive_integer_p( kb ) && ( !$english_generation_fht_name$.getDynamicValue( thread ).isString() || NIL == Filesys.probe_file( $english_generation_fht_name$.getDynamicValue( thread ) ) ) )
    {
      $english_generation_fht_name$.setDynamicValue( get_nl_generation_cache_file_path_internal( kb ), thread );
    }
    return $english_generation_fht_name$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 4693L)
  public static SubLObject get_latest_nl_generation_cache_file_path()
  {
    SubLObject kb;
    SubLObject path;
    for( kb = control_vars.kb_loaded(), path = NIL; NIL != subl_promotions.positive_integer_p( kb ) && Numbers.subtract( control_vars.kb_loaded(), kb ).numLE( $max_kbs_backward_to_look_for_generation_cache$
        .getGlobalValue() ) && ( !path.isString() || NIL == Filesys.probe_file( path ) ); path = get_nl_generation_cache_file_path_internal( kb ), kb = Numbers.subtract( kb, ONE_INTEGER ) )
    {
    }
    return path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 5139L)
  public static SubLObject get_nl_generation_cache_file_path_internal(final SubLObject kb)
  {
    final SubLObject path = Sequences.cconcatenate( file_backed_cache.$file_backed_cache_base_path$.getGlobalValue(), new SubLObject[] { operation_communication.kb_number_string( kb ), $str19$_,
      $english_generation_base_file_name$.getGlobalValue()
    } );
    return path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 5578L)
  public static SubLObject enable_nl_generation_cache_memory_mapping()
  {
    file_backed_cache.file_backed_cache_enable_memory_mapping( $english_generation_fort_cache$.getGlobalValue() );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 5728L)
  public static SubLObject disable_nl_generation_cache_memory_mapping()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    $english_generation_fort_cache$.setGlobalValue( file_backed_cache.file_backed_cache_change_stream_buffer_size( $english_generation_fort_cache$.getGlobalValue(), StreamsLow.$stream_initial_input_buffer_size$
        .getDynamicValue( thread ) ) );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 5966L)
  public static SubLObject nl_generation_cache_memory_mappedP()
  {
    return makeBoolean( NIL != $english_generation_fort_cache$.getGlobalValue() && NIL != file_backed_cache.file_backed_cache_memory_mappedP( $english_generation_fort_cache$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 6135L)
  public static SubLObject initialize_nl_generation_caches()
  {
    if( NIL == control_vars.kb_loaded() )
    {
      reconnect_english_generation_fort_cache();
    }
    else if( NIL != file_backed_cache.file_backed_cache_p( $english_generation_fort_cache$.getGlobalValue() ) && operation_communication.kb_op_number().isPositive() )
    {
      reconnect_english_generation_fort_cache();
    }
    else
    {
      ensure_nl_generation_fort_cache_is_best_available();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 6724L)
  public static SubLObject ensure_nl_generation_fort_cache_is_best_available()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != file_backed_cache.file_backed_cache_p( $english_generation_fort_cache$.getGlobalValue() ) && NIL != Filesys.probe_file( file_backed_cache.file_backed_cache_file_hash_table_path(
        $english_generation_fort_cache$.getGlobalValue() ) ) && NIL != english_generation_fort_cache_for_current_kbP() )
    {
      reconnect_english_generation_fort_cache();
    }
    else if( NIL != file_backed_cache.file_backed_cache_p( $english_generation_fort_cache$.getGlobalValue() ) && NIL != Filesys.probe_file( file_backed_cache.file_backed_cache_file_hash_table_path(
        $english_generation_fort_cache$.getGlobalValue() ) ) && NIL != english_generation_fort_cache_most_recent_availableP() )
    {
      reconnect_english_generation_fort_cache();
    }
    else
    {
      final SubLObject old = $english_generation_fort_cache$.getGlobalValue();
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $nl_generation_fht_lock$.getGlobalValue() );
        if( $english_generation_fort_cache$.getGlobalValue().eql( old ) )
        {
          final SubLObject _prev_bind_0 = file_hash_table.$fht_cache_percentage$.currentBinding( thread );
          try
          {
            file_hash_table.$fht_cache_percentage$.bind( $int21$100, thread );
            final SubLObject path = get_latest_nl_generation_cache_file_path();
            $english_generation_fort_cache$.setGlobalValue( ( NIL != Filesys.probe_file( path ) ) ? file_backed_cache.file_backed_cache_create( path, $preload_nl_generation_cachesP$.getGlobalValue(), T,
                file_hash_table.$fht_cache_percentage$.getDynamicValue( thread ), Symbols.symbol_function( EQUAL ), $kw22$HL_EXTERNALIZED_KEYS ) : NIL );
          }
          finally
          {
            file_hash_table.$fht_cache_percentage$.rebind( _prev_bind_0, thread );
          }
          if( NIL != english_generation_fort_cache_for_current_kbP() && operation_communication.kb_op_number().isZero() )
          {
            clear_nl_generation_cache_exceptions();
          }
        }
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $nl_generation_fht_lock$.getGlobalValue() );
        }
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 8101L)
  public static SubLObject reconnect_english_generation_fort_cache()
  {
    if( NIL != $english_generation_fort_cache$.getGlobalValue() )
    {
      final SubLObject fbc_fht_path = file_backed_cache.file_backed_cache_file_hash_table_path( $english_generation_fort_cache$.getGlobalValue() );
      final SubLObject path = ( NIL != Filesys.probe_file( fbc_fht_path ) ) ? fbc_fht_path : get_default_nl_generation_cache_file_path( UNPROVIDED );
      file_backed_cache.file_backed_cache_reconnect( $english_generation_fort_cache$.getGlobalValue(), path );
    }
    return $english_generation_fort_cache$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 8534L)
  public static SubLObject english_generation_fort_cache_for_current_kbP()
  {
    return makeBoolean( NIL != $english_generation_fort_cache$.getGlobalValue() && conses_high.last( file_utilities.deconstruct_path( file_backed_cache.file_backed_cache_file_hash_table_path(
        $english_generation_fort_cache$.getGlobalValue() ) ), UNPROVIDED ).equal( conses_high.last( file_utilities.deconstruct_path( get_default_nl_generation_cache_file_path( control_vars.kb_loaded() ) ),
            UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 8861L)
  public static SubLObject english_generation_fort_cache_most_recent_availableP()
  {
    return makeBoolean( NIL != $english_generation_fort_cache$.getGlobalValue() && conses_high.last( file_utilities.deconstruct_path( file_backed_cache.file_backed_cache_file_hash_table_path(
        $english_generation_fort_cache$.getGlobalValue() ) ), UNPROVIDED ).equal( conses_high.last( file_utilities.deconstruct_path( get_latest_nl_generation_cache_file_path() ), UNPROVIDED ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 9182L)
  public static SubLObject reset_nl_generation_caches()
  {
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $nl_generation_fht_lock$.getGlobalValue() );
      if( NIL != $english_generation_fort_cache$.getGlobalValue() )
      {
        $english_generation_fht_name$.setDynamicValue( NIL );
        file_backed_cache.file_backed_cache_reset( $english_generation_fort_cache$.getGlobalValue(), UNPROVIDED );
      }
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $nl_generation_fht_lock$.getGlobalValue() );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 9569L)
  public static SubLObject nl_generation_fort_cache_nl_preds(SubLObject v_cache)
  {
    if( v_cache == UNPROVIDED )
    {
      v_cache = $english_generation_fort_cache$.getGlobalValue();
    }
    final SubLObject stored = ( NIL != file_backed_cache.file_backed_cache_p( v_cache ) ) ? file_backed_cache.file_backed_cache_lookup( $kw23$NL_PREDS, v_cache, NIL, UNPROVIDED ) : NIL;
    return ( NIL != stored ) ? stored : $list24;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 9901L)
  public static SubLObject nl_generation_fort_cache_paraphrase_mt(SubLObject v_cache)
  {
    if( v_cache == UNPROVIDED )
    {
      v_cache = $english_generation_fort_cache$.getGlobalValue();
    }
    final SubLObject stored = ( NIL != file_backed_cache.file_backed_cache_p( v_cache ) ) ? file_backed_cache.file_backed_cache_lookup( $kw25$LANGUAGE_MT, v_cache, NIL, UNPROVIDED ) : NIL;
    return ( NIL != stored ) ? stored : default_nl_generation_fort_cache_paraphrase_mt();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 10421L)
  public static SubLObject default_nl_generation_fort_cache_paraphrase_mt()
  {
    return pph_vars.default_pph_language_mt( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 12091L)
  public static SubLObject nl_fort_generation_task_success_code()
  {
    return ONE_INTEGER;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 12159L)
  public static SubLObject nl_fort_generation_task_failure_code()
  {
    return $int30$255;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 12229L)
  public static SubLObject create_cached_nl_generation_for_all_forts(SubLObject filename, SubLObject tmp_dir, SubLObject paraphrase_mt, SubLObject nl_preds)
  {
    if( filename == UNPROVIDED )
    {
      filename = get_default_nl_generation_cache_file_path( UNPROVIDED );
    }
    if( tmp_dir == UNPROVIDED )
    {
      tmp_dir = $str31$tmp_;
    }
    if( paraphrase_mt == UNPROVIDED )
    {
      paraphrase_mt = default_nl_generation_fort_cache_paraphrase_mt();
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == pph_staleness_test.gen_template_store_staleness_acceptableP() && NIL != pph_staleness_test.gen_template_store_staleP() )
    {
      Errors.error( $str32$Gen_template_store_is_stale_ );
    }
    PrintLow.format( T, $str33$Generating_nl_cache_to_file___A, filename );
    assert NIL != hlmt.hlmt_p( paraphrase_mt ) : paraphrase_mt;
    final SubLObject _prev_bind_0 = $nl_generation_fort_cache_paraphrase_mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $nl_generation_fort_cache_nl_preds$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $nl_generation_fort_cache_working_directory$.currentBinding( thread );
    try
    {
      $nl_generation_fort_cache_paraphrase_mt$.bind( paraphrase_mt, thread );
      $nl_generation_fort_cache_nl_preds$.bind( nl_preds, thread );
      $nl_generation_fort_cache_working_directory$.bind( find_or_create_nl_generation_fort_cache_working_directory( tmp_dir ), thread );
      kb_cleanup.kill_duplicate_narts();
      final SubLObject fort_count = cfasl_utilities.cfasl_load( Sequences.cconcatenate( $nl_generation_fort_cache_working_directory$.getDynamicValue( thread ), $str35$fort_count_cfasl ) );
      final SubLObject progress_message = Sequences.cconcatenate( $str36$Generating_FORT_paraphrases__, new SubLObject[] { format_nil.format_nil_a_no_copy( $nl_generation_fort_cache_generator_timestamp$
          .getGlobalValue() ), $str37$____
      } );
      final SubLObject _prev_bind_0_$1 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_1_$2 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_2_$3 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( progress_message );
          while ( NIL == nl_generation_fort_cache_data_generatedP())
          {
            final SubLObject done_count = assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result();
            if( NIL != $nl_generation_fort_cache_generate_plotsP$.getDynamicValue( thread ) )
            {
              stitch_together_nl_generation_cache_time_plots();
            }
            if( done_count.isInteger() )
            {
              utilities_macros.note_percent_progress( done_count, fort_count );
            }
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
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$1, thread );
      }
      if( NIL != Filesys.probe_file( filename ) )
      {
        Errors.warn( $str38$_S_already_exists_, filename );
      }
      else
      {
        create_nl_generation_fht_from_data( filename, nl_preds, tmp_dir, $nl_generation_fort_cache_working_directory$.getDynamicValue( thread ) );
      }
    }
    finally
    {
      $nl_generation_fort_cache_working_directory$.rebind( _prev_bind_3, thread );
      $nl_generation_fort_cache_nl_preds$.rebind( _prev_bind_2, thread );
      $nl_generation_fort_cache_paraphrase_mt$.rebind( _prev_bind_0, thread );
    }
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 14460L)
  public static SubLObject create_nl_generation_fht_from_data(SubLObject filename, SubLObject nl_preds, SubLObject tmp_dir, SubLObject working_directory)
  {
    if( filename == UNPROVIDED )
    {
      filename = get_default_nl_generation_cache_file_path( UNPROVIDED );
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
    }
    if( tmp_dir == UNPROVIDED )
    {
      tmp_dir = $str31$tmp_;
    }
    if( working_directory == UNPROVIDED )
    {
      working_directory = find_or_create_nl_generation_fort_cache_working_directory( tmp_dir );
    }
    create_filtered_nl_generation_fht_from_data( set.new_set( UNPROVIDED, UNPROVIDED ), filename, nl_preds, tmp_dir, working_directory );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 14890L)
  public static SubLObject create_filtered_nl_generation_fht_from_data(final SubLObject skip_terms, SubLObject filename, SubLObject nl_preds, SubLObject tmp_dir, SubLObject working_directory)
  {
    if( filename == UNPROVIDED )
    {
      filename = get_default_nl_generation_cache_file_path( UNPROVIDED );
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
    }
    if( tmp_dir == UNPROVIDED )
    {
      tmp_dir = $str31$tmp_;
    }
    if( working_directory == UNPROVIDED )
    {
      working_directory = find_or_create_nl_generation_fort_cache_working_directory( tmp_dir );
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL == set.set_p( skip_terms ) )
    {
      Errors.error( $str40$Cannot_filter_without_a_set__got_, skip_terms );
    }
    final SubLObject fht = file_hash_table.fast_create_file_hash_table( filename, tmp_dir, Symbols.symbol_function( EQUAL ), $kw22$HL_EXTERNALIZED_KEYS );
    final SubLObject progress_message = $str41$Compiling_file_hashtable_from_par;
    assert NIL != Filesys.directory_p( working_directory ) : working_directory;
    SubLObject directory_contents_var = Filesys.directory( working_directory, T );
    final SubLObject progress_message_var = progress_message;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
      if( $sym43$STRING_.isFunctionSpec() )
      {
        directory_contents_var = Sort.sort( directory_contents_var, $sym43$STRING_, UNPROVIDED );
      }
      final SubLObject list_var = directory_contents_var;
      final SubLObject _prev_bind_0_$5 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str44$cdolist, thread );
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
          SubLObject assignment_directory = NIL;
          assignment_directory = csome_list_var.first();
          while ( NIL != csome_list_var)
          {
            if( NIL != Filesys.directory_p( assignment_directory ) )
            {
              if( NIL == Filesys.probe_file( Sequences.cconcatenate( assignment_directory, $str45$_done ) ) )
              {
                Errors.warn( $str46$Skipping_assignment_directory_wit, assignment_directory );
              }
              else
              {
                final SubLObject same_kbP = Equality.eql( control_vars.build_kb_loaded(), cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str47$build_kb_loaded_cfasl ) ) );
                final SubLObject slow_results_file = Sequences.cconcatenate( assignment_directory, $str48$_results_cfasl );
                final SubLObject fast_results_file = Sequences.cconcatenate( assignment_directory, $str49$_fast_results_cfasl );
                final SubLObject results_file = ( NIL != same_kbP && NIL != Filesys.probe_file( fast_results_file ) ) ? fast_results_file : slow_results_file;
                SubLObject fort = NIL;
                SubLObject paraphrase_data = NIL;
                SubLObject doneP = NIL;
                Errors.warn( $str50$Using_results_file__S, results_file );
                SubLObject stream = NIL;
                try
                {
                  final SubLObject _prev_bind_0_$6 = stream_macros.$stream_requires_locking$.currentBinding( thread );
                  try
                  {
                    stream_macros.$stream_requires_locking$.bind( NIL, thread );
                    stream = compatibility.open_binary( results_file, $kw51$INPUT );
                  }
                  finally
                  {
                    stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$6, thread );
                  }
                  if( !stream.isStream() )
                  {
                    Errors.error( $str52$Unable_to_open__S, results_file );
                  }
                  final SubLObject stream_$7 = stream;
                  while ( NIL == doneP)
                  {
                    fort = cfasl.cfasl_input( stream_$7, NIL, $kw53$EOF );
                    paraphrase_data = cfasl.cfasl_input( stream_$7, NIL, UNPROVIDED );
                    if( $kw53$EOF == fort )
                    {
                      doneP = T;
                    }
                    else if( NIL == forts.fort_p( fort ) )
                    {
                      Errors.warn( $str54$Non_FORT__S_in_paraphrase_data___, fort, results_file );
                    }
                    else if( !paraphrase_data.isList() || NIL == list_utilities.lengthE( paraphrase_data, FOUR_INTEGER, UNPROVIDED ) )
                    {
                      Errors.warn( $str55$Bad_paraphrase_data_for__S_in__S_, fort, results_file, paraphrase_data );
                    }
                    else if( NIL != set.set_memberP( fort, skip_terms ) )
                    {
                      Errors.warn( $str56$Skipping_black_listed_term__A___, fort );
                    }
                    else
                    {
                      final SubLObject data_to_store = ( NIL != $rich_nl_generation_cache_styleP$.getDynamicValue( thread ) ) ? paraphrase_data
                          : ConsesLow.cons( paraphrase_data.first(), conses_high.second( paraphrase_data ) );
                      file_hash_table.fast_put_file_hash_table( fort, fht, data_to_store );
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$7 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$7, thread );
                  }
                }
              }
            }
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
            csome_list_var = csome_list_var.rest();
            assignment_directory = csome_list_var.first();
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$8 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values2 = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values2 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$8, thread );
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
        utilities_macros.$progress_note$.rebind( _prev_bind_0_$5, thread );
      }
    }
    finally
    {
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    file_hash_table.fast_put_file_hash_table( $kw23$NL_PREDS, fht, nl_preds );
    file_hash_table.fast_put_file_hash_table( $kw25$LANGUAGE_MT, fht, $nl_generation_fort_cache_paraphrase_mt$.getDynamicValue( thread ) );
    file_hash_table.finalize_fast_create_file_hash_table( fht, $kw57$USE_FIRST, UNPROVIDED );
    return filename;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 17624L)
  public static SubLObject find_or_create_nl_generation_fort_cache_working_directory(final SubLObject parent_directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject working_directory = Sequences.cconcatenate( format_nil.format_nil_a_no_copy( parent_directory ), new SubLObject[] { $str58$nl_generation_cache_work_, format_nil.format_nil_a_no_copy(
        operation_communication.kb_number_string( control_vars.build_kb_loaded() ) ), $str19$_
    } );
    if( NIL == Filesys.directory_p( working_directory ) )
    {
      file_utilities.make_directory_recursive( working_directory, NIL, $str59$777 );
      cfasl_utilities.cfasl_save( $nl_generation_fort_cache_assignment_size$.getGlobalValue(), Sequences.cconcatenate( working_directory, $str60$assignment_size_cfasl ) );
      cfasl_utilities.cfasl_save( forts.fort_count(), Sequences.cconcatenate( working_directory, $str35$fort_count_cfasl ) );
      cfasl_utilities.cfasl_save( control_vars.build_kb_loaded(), Sequences.cconcatenate( working_directory, $str47$build_kb_loaded_cfasl ) );
      cfasl_utilities.cfasl_save_externalized( $nl_generation_fort_cache_paraphrase_mt$.getDynamicValue( thread ), Sequences.cconcatenate( working_directory, $str61$paraphrase_mt_cfasl ) );
    }
    return working_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 18438L)
  public static SubLObject nl_generation_fort_cache_subdirectory(final SubLObject working_directory, final SubLObject start_num, SubLObject fort_count, SubLObject assignment_size)
  {
    if( fort_count == UNPROVIDED )
    {
      fort_count = NIL;
    }
    if( assignment_size == UNPROVIDED )
    {
      assignment_size = NIL;
    }
    if( NIL == fort_count )
    {
      fort_count = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str35$fort_count_cfasl ) );
    }
    if( NIL == assignment_size )
    {
      assignment_size = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str60$assignment_size_cfasl ) );
    }
    if( !Numbers.mod( assignment_size, $nl_generation_fort_cache_batch_size$.getGlobalValue() ).isZero() )
    {
      Errors.error( $str62$Assignment_size_is__S__Must_be_a_, $nl_generation_fort_cache_batch_size$.getGlobalValue() );
    }
    final SubLObject digits = number_utilities.f_1X( Numbers.floor( Numbers.log( fort_count, TEN_INTEGER ), UNPROVIDED ) );
    final SubLObject format_string = Sequences.cconcatenate( $str63$_, new SubLObject[] { print_high.princ_to_string( digits ), $str64$__0D__, print_high.princ_to_string( digits ), $str65$__0D_
    } );
    SubLObject end_num = Numbers.add( start_num, number_utilities.f_1_( assignment_size ) );
    final SubLObject last_oneP = Numbers.numGE( end_num, fort_count );
    if( NIL != last_oneP )
    {
      end_num = fort_count;
    }
    final SubLObject subdirectory = Sequences.cconcatenate( working_directory, PrintLow.format( NIL, format_string, start_num, end_num ) );
    return Values.values( subdirectory, last_oneP, end_num );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 19600L)
  public static SubLObject assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject my_task_directory = find_nl_generation_assignment_directory();
    final SubLObject start_num = thread.secondMultipleValue();
    final SubLObject end_num = thread.thirdMultipleValue();
    final SubLObject task_id = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    if( NIL != Filesys.directory_p( my_task_directory ) )
    {
      final SubLObject task_specification = ConsesLow.list( task_id, my_task_directory, start_num, end_num );
      final SubLObject error_output_file = Sequences.cconcatenate( my_task_directory, $str66$error_output_log );
      final SubLObject _prev_bind_0 = $nl_fort_generation_task$.currentBinding( thread );
      try
      {
        $nl_fort_generation_task$.bind( task_specification, thread );
        PrintLow.format( T, $str67$__Assigning_task__S__, task_specification );
        streams_high.force_output( T );
        if( NIL != $nl_generation_fort_cache_use_forked_processesP$.getDynamicValue( thread ) )
        {
          os_process_utilities.fork_cyc_server_process( $sym68$DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK, $sym69$WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER, error_output_file );
        }
        else
        {
          final SubLObject exit_code = do_next_fort_paraphrase_cache_generation_task();
          wake_up_fort_paraphrase_cache_taskmaster( exit_code );
        }
        final SubLObject exit_code = process_utilities.ipc_dequeue( $nl_fort_generation_results_queue$.getGlobalValue(), UNPROVIDED );
        PrintLow.format( T, $str70$__Just_dequeued__S_after_enqueuei, exit_code, task_specification );
        if( task_id.eql( exit_code ) )
        {
          PrintLow.format( T, $str71$__Successfully_completed__S__, task_specification );
        }
        else if( nl_fort_generation_task_failure_code().eql( exit_code ) )
        {
          note_nl_fort_generation_task_failed( task_specification );
          Errors.sublisp_break( $str72$Received_failure_code_on_task__S, new SubLObject[] { task_specification
          } );
        }
        else
        {
          Errors.sublisp_break( $str73$Didn_t_recognize_exit_code__S, new SubLObject[] { exit_code
          } );
        }
      }
      finally
      {
        $nl_fort_generation_task$.rebind( _prev_bind_0, thread );
      }
    }
    return end_num;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 21118L)
  public static SubLObject note_nl_fort_generation_task_failed(final SubLObject specification)
  {
    final SubLObject directory = specification.first();
    Errors.warn( $str74$NL_FORT_Generation_subtask_report, specification );
    set.set_add( directory, $failed_nl_fort_generation_tasks$.getGlobalValue() );
    return $failed_nl_fort_generation_tasks$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 21410L)
  public static SubLObject nl_fort_generation_task_failedP(final SubLObject specification)
  {
    final SubLObject directory = specification.first();
    return set.set_memberP( directory, $failed_nl_fort_generation_tasks$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 21588L)
  public static SubLObject wake_up_fort_paraphrase_cache_taskmaster(final SubLObject exit_code)
  {
    PrintLow.format( T, $str75$__About_to_enqueue_new_exit_code_, exit_code );
    return process_utilities.ipc_enqueue( exit_code, $nl_fort_generation_results_queue$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 21797L)
  public static SubLObject do_next_fort_paraphrase_cache_generation_task()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject task_specification = $nl_fort_generation_task$.getDynamicValue( thread );
    SubLObject exit_code = nl_fort_generation_task_failure_code();
    Errors.warn( $str76$Just_received_task_specification_, task_specification );
    if( task_specification.isList() && NIL != list_utilities.lengthE( task_specification, FOUR_INTEGER, UNPROVIDED ) )
    {
      SubLObject current;
      final SubLObject datum = current = task_specification;
      SubLObject task_id = NIL;
      SubLObject my_task_directory = NIL;
      SubLObject start_num = NIL;
      SubLObject end_num = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
      task_id = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
      my_task_directory = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
      start_num = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list77 );
      end_num = current.first();
      current = current.rest();
      if( NIL == current )
      {
        if( NIL != Filesys.directory_p( my_task_directory ) )
        {
          do_fort_paraphrase_cache_generation_for_directory( my_task_directory, start_num, end_num );
        }
        exit_code = task_id;
        Errors.warn( $str78$Returning__S, exit_code );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list77 );
      }
    }
    return exit_code;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 22443L)
  public static SubLObject do_fort_paraphrase_cache_generation_for_directory(final SubLObject my_task_directory, final SubLObject start_num, final SubLObject end_num)
  {
    final SubLObject results_file = Sequences.cconcatenate( my_task_directory, $str79$results_cfasl );
    final SubLObject fast_results_file = Sequences.cconcatenate( my_task_directory, $str80$fast_results_cfasl );
    final SubLObject previously_done_forts = set.new_set( UNPROVIDED, UNPROVIDED );
    if( NIL != Filesys.probe_file( results_file ) )
    {
      recopy_nl_generation_fort_cache_results( my_task_directory, previously_done_forts );
    }
    do_fort_paraphrase_cache_generation_for_directory_internal( my_task_directory, start_num, end_num, results_file, fast_results_file, previously_done_forts );
    return my_task_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 23138L)
  public static SubLObject find_nl_generation_assignment_directory()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_num = ONE_INTEGER;
    SubLObject my_task_directory = NIL;
    SubLObject end_num = NIL;
    SubLObject task_id = NIL;
    final SubLObject working_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue( thread );
    final SubLObject fort_count = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str35$fort_count_cfasl ) );
    final SubLObject assignment_size = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str60$assignment_size_cfasl ) );
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      thread.resetMultipleValues();
      final SubLObject subdirectory = nl_generation_fort_cache_subdirectory( working_directory, start_num, fort_count, assignment_size );
      final SubLObject last_oneP = thread.secondMultipleValue();
      final SubLObject this_end_num = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      final SubLObject newP = list_utilities.sublisp_boolean( Filesys.make_directory( subdirectory, UNPROVIDED, UNPROVIDED ) );
      if( NIL != newP )
      {
        my_task_directory = subdirectory;
        doneP = T;
      }
      else if( NIL == Filesys.probe_file( Sequences.cconcatenate( subdirectory, $str82$done ) ) )
      {
        if( NIL != $nl_generation_fort_cache_retry_failed_tasksP$.getDynamicValue( thread ) )
        {
          SubLObject failedP = NIL;
          SubLObject ignore_errors_tag = NIL;
          try
          {
            thread.throwStack.push( $kw83$IGNORE_ERRORS_TARGET );
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
            try
            {
              Errors.$error_handler$.bind( Symbols.symbol_function( $sym84$IGNORE_ERRORS_HANDLER ), thread );
              try
              {
                failedP = cfasl_kernel.cfasl_api_remote_eval( $list85, Environment.get_machine_name( UNPROVIDED ), cfasl_kernel.cfasl_port() );
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
            ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw83$IGNORE_ERRORS_TARGET );
          }
          finally
          {
            thread.throwStack.pop();
          }
          if( NIL != failedP )
          {
            my_task_directory = subdirectory;
            doneP = T;
          }
        }
      }
      if( NIL != Filesys.directory_p( my_task_directory ) )
      {
        end_num = this_end_num;
        task_id = Numbers.mod( Numbers.ceiling( Numbers.divide( end_num, assignment_size ), UNPROVIDED ), $int30$255 );
      }
      if( NIL != last_oneP )
      {
        doneP = T;
      }
      if( NIL == doneP )
      {
        start_num = Numbers.add( start_num, assignment_size );
      }
    }
    return Values.values( my_task_directory, start_num, end_num, task_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 24588L)
  public static SubLObject recopy_nl_generation_fort_cache_results(final SubLObject my_task_directory, final SubLObject previously_done_forts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject results_file = Sequences.cconcatenate( my_task_directory, $str79$results_cfasl );
    final SubLObject fast_results_file = Sequences.cconcatenate( my_task_directory, $str80$fast_results_cfasl );
    final SubLObject prior_results_file = Sequences.cconcatenate( my_task_directory, $str86$prior_results_cfasl );
    SubLObject doneP = NIL;
    file_utilities.move_file( results_file, prior_results_file );
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_binary( prior_results_file, $kw51$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str52$Unable_to_open__S, prior_results_file );
      }
      final SubLObject stream_$10 = stream;
      SubLObject stream_$11 = NIL;
      try
      {
        final SubLObject _prev_bind_2 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream_$11 = compatibility.open_binary( results_file, $kw87$OUTPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_2, thread );
        }
        if( !stream_$11.isStream() )
        {
          Errors.error( $str52$Unable_to_open__S, results_file );
        }
        final SubLObject results_stream = stream_$11;
        SubLObject stream_$12 = NIL;
        try
        {
          final SubLObject _prev_bind_3 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$12 = compatibility.open_binary( fast_results_file, $kw87$OUTPUT );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_3, thread );
          }
          if( !stream_$12.isStream() )
          {
            Errors.error( $str52$Unable_to_open__S, fast_results_file );
          }
          final SubLObject fast_results_stream = stream_$12;
          while ( NIL == doneP)
          {
            final SubLObject fort = cfasl.cfasl_input( stream_$10, NIL, $kw53$EOF );
            final SubLObject paraphrase_data = cfasl.cfasl_input( stream_$10, NIL, UNPROVIDED );
            if( NIL != forts.fort_p( fort ) )
            {
              cfasl.cfasl_output_externalized( fort, results_stream );
              cfasl.cfasl_output_externalized( paraphrase_data, results_stream );
              cfasl.cfasl_output( fort, fast_results_stream );
              cfasl.cfasl_output( paraphrase_data, fast_results_stream );
              set.set_add( fort, previously_done_forts );
            }
            else
            {
              doneP = T;
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            if( stream_$12.isStream() )
            {
              streams_high.close( stream_$12, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_4, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_5 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          if( stream_$11.isStream() )
          {
            streams_high.close( stream_$11, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_5, thread );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_6 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values3 = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values3 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_6, thread );
      }
    }
    Filesys.delete_file( prior_results_file );
    return my_task_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 25683L)
  public static SubLObject do_fort_paraphrase_cache_generation_for_directory_internal(final SubLObject my_task_directory, final SubLObject start_num, final SubLObject end_num, final SubLObject results_file,
      final SubLObject fast_results_file, final SubLObject previously_done_forts)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject log_file = Sequences.cconcatenate( my_task_directory, $str88$stats_log );
    SubLObject doneP = NIL;
    SubLObject i = ZERO_INTEGER;
    final SubLObject batch_size = $nl_generation_fort_cache_batch_size$.getGlobalValue();
    SubLObject batch_times = NIL;
    SubLObject batch_failed_forts = NIL;
    SubLObject batch_start_time = Time.get_universal_time();
    final SubLObject batch_start_cpu_time = NIL;
    final SubLObject paraphrase_mt = $nl_generation_fort_cache_paraphrase_mt$.getDynamicValue( thread );
    final SubLObject nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue( thread );
    final SubLObject _prev_bind_0 = $nl_generation_fort_cache_median_times$.currentBinding( thread );
    final SubLObject _prev_bind_2 = $nl_generation_fort_cache_total_times$.currentBinding( thread );
    final SubLObject _prev_bind_3 = $nl_generation_fort_cache_cpu_times$.currentBinding( thread );
    final SubLObject _prev_bind_4 = $nl_generation_fort_cache_swap_times$.currentBinding( thread );
    final SubLObject _prev_bind_5 = $nl_generation_fort_cache_failed_fort_counts$.currentBinding( thread );
    final SubLObject _prev_bind_6 = $nl_generation_fort_cache_gc_times$.currentBinding( thread );
    final SubLObject _prev_bind_7 = pph_vars.$bypass_pph_phrase_destroyerP$.currentBinding( thread );
    try
    {
      $nl_generation_fort_cache_median_times$.bind( NIL, thread );
      $nl_generation_fort_cache_total_times$.bind( NIL, thread );
      $nl_generation_fort_cache_cpu_times$.bind( NIL, thread );
      $nl_generation_fort_cache_swap_times$.bind( NIL, thread );
      $nl_generation_fort_cache_failed_fort_counts$.bind( NIL, thread );
      $nl_generation_fort_cache_gc_times$.bind( NIL, thread );
      pph_vars.$bypass_pph_phrase_destroyerP$.bind( T, thread );
      SubLObject pph_phrase_count = pph_data_structures.pph_phrase_count();
      SubLObject stream = NIL;
      try
      {
        stream = compatibility.open_text( log_file, $kw89$APPEND );
        if( !stream.isStream() )
        {
          Errors.error( $str52$Unable_to_open__S, log_file );
        }
        final SubLObject log_stream = stream;
        SubLObject stream_$13 = NIL;
        try
        {
          final SubLObject _prev_bind_0_$14 = stream_macros.$stream_requires_locking$.currentBinding( thread );
          try
          {
            stream_macros.$stream_requires_locking$.bind( NIL, thread );
            stream_$13 = compatibility.open_binary( results_file, $kw89$APPEND );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$14, thread );
          }
          if( !stream_$13.isStream() )
          {
            Errors.error( $str52$Unable_to_open__S, results_file );
          }
          final SubLObject results_stream = stream_$13;
          SubLObject stream_$14 = NIL;
          try
          {
            final SubLObject _prev_bind_0_$15 = stream_macros.$stream_requires_locking$.currentBinding( thread );
            try
            {
              stream_macros.$stream_requires_locking$.bind( NIL, thread );
              stream_$14 = compatibility.open_binary( fast_results_file, $kw89$APPEND );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( _prev_bind_0_$15, thread );
            }
            if( !stream_$14.isStream() )
            {
              Errors.error( $str52$Unable_to_open__S, fast_results_file );
            }
            final SubLObject fast_results_stream = stream_$14;
            final SubLObject _prev_bind_0_$16 = pph_macros.$free_pph_problem_store_pointers$.currentBinding( thread );
            try
            {
              pph_macros.$free_pph_problem_store_pointers$.bind( NIL, thread );
              thread.resetMultipleValues();
              final SubLObject _prev_bind_0_$17 = pph_macros.$pph_problem_store_pointer$.currentBinding( thread );
              try
              {
                pph_macros.$pph_problem_store_pointer$.bind( pph_macros.find_or_create_pph_problem_store_pointer(), thread );
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try
                {
                  thread.resetMultipleValues();
                  final SubLObject _prev_bind_0_$18 = pph_macros.$pph_memoization_state$.currentBinding( thread );
                  try
                  {
                    pph_macros.$pph_memoization_state$.bind( pph_macros.find_or_create_pph_memoization_state(), thread );
                    final SubLObject new_or_reused = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$19 = pph_macros.$pph_external_memoization_state$.currentBinding( thread );
                    try
                    {
                      pph_macros.$pph_external_memoization_state$.bind( pph_macros.find_or_create_pph_external_memoization_state(), thread );
                      final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue( thread );
                      final SubLObject _prev_bind_0_$20 = memoization_state.$memoization_state$.currentBinding( thread );
                      try
                      {
                        memoization_state.$memoization_state$.bind( local_state, thread );
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process( local_state );
                        try
                        {
                          assertion_manager.clear_assertion_content_swap_time();
                          assertion_manager.meter_assertion_content_swap_time();
                          final SubLObject _prev_bind_0_$21 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                          final SubLObject _prev_bind_1_$23 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                          final SubLObject _prev_bind_2_$24 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                          final SubLObject _prev_bind_3_$25 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                          try
                          {
                            utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                            utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                            utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                            utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                            try
                            {
                              utilities_macros.noting_percent_progress_preamble( Sequences.cconcatenate( $str90$Generating_nl_for_forts_, new SubLObject[] { format_nil.format_nil_s_no_copy( start_num ), $str91$_through_,
                                format_nil.format_nil_s_no_copy( end_num ), $str92$__PPH_phrase_count___, format_nil.format_nil_d_no_copy( pph_phrase_count ), $str93$_____
                              } ) );
                              final SubLObject _prev_bind_0_$22 = utilities_macros.$silent_progressP$.currentBinding( thread );
                              try
                              {
                                utilities_macros.$silent_progressP$.bind( T, thread );
                                final SubLObject message = $str94$;
                                final SubLObject total = forts.fort_count();
                                SubLObject sofar = ZERO_INTEGER;
                                final SubLObject _prev_bind_0_$23 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
                                final SubLObject _prev_bind_1_$24 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
                                final SubLObject _prev_bind_2_$25 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
                                final SubLObject _prev_bind_3_$26 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
                                try
                                {
                                  utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
                                  utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
                                  utilities_macros.$within_noting_percent_progress$.bind( T, thread );
                                  utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
                                  try
                                  {
                                    utilities_macros.noting_percent_progress_preamble( message );
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
                                    for( rest = NIL, rest = forts.do_forts_tables(); NIL == doneP && NIL != rest; rest = rest.rest() )
                                    {
                                      table_var = ( idx = rest.first() );
                                      if( NIL == id_index.id_index_objects_empty_p( idx, $kw95$SKIP ) )
                                      {
                                        idx_$31 = idx;
                                        if( NIL == id_index.id_index_dense_objects_empty_p( idx_$31, $kw95$SKIP ) )
                                        {
                                          vector_var = id_index.id_index_dense_objects( idx_$31 );
                                          backwardP_var = NIL;
                                          length = Sequences.length( vector_var );
                                          datum = ( current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
                                              : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER ) );
                                          start = NIL;
                                          end = NIL;
                                          delta = NIL;
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                          start = current.first();
                                          current = current.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                          end = current.first();
                                          current = current.rest();
                                          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
                                          delta = current.first();
                                          current = current.rest();
                                          if( NIL == current )
                                          {
                                            if( NIL == doneP )
                                            {
                                              for( end_var = end, id = NIL, id = start; NIL == doneP && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
                                              {
                                                fort = Vectors.aref( vector_var, id );
                                                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
                                                {
                                                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                                                  {
                                                    fort = $kw95$SKIP;
                                                  }
                                                  sofar = Numbers.add( sofar, ONE_INTEGER );
                                                  utilities_macros.note_percent_progress( sofar, total );
                                                  i = Numbers.add( i, ONE_INTEGER );
                                                  _prev_bind_0_$24 = utilities_macros.$silent_progressP$.currentBinding( thread );
                                                  try
                                                  {
                                                    utilities_macros.$silent_progressP$.bind( NIL, thread );
                                                    utilities_macros.note_percent_progress( Numbers.subtract( i, start_num ), number_utilities.f_1X( Numbers.subtract( end_num, start_num ) ) );
                                                  }
                                                  finally
                                                  {
                                                    utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$24, thread );
                                                  }
                                                  if( !i.numL( start_num ) && NIL == set.set_memberP( fort, previously_done_forts ) && NIL == dont_want_to_generate_this_oneP( fort ) )
                                                  {
                                                    max_time = $nl_generation_fort_cache_timeout$.getDynamicValue( thread );
                                                    timed_outP = NIL;
                                                    time = NIL;
                                                    str = NIL;
                                                    pred = NIL;
                                                    justifications = NIL;
                                                    demerits = NIL;
                                                    time_var = Time.get_internal_real_time();
                                                    tag = subl_macro_promotions.with_timeout_make_tag();
                                                    try
                                                    {
                                                      thread.throwStack.push( tag );
                                                      _prev_bind_0_$25 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                                                      try
                                                      {
                                                        subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                                                        timer = NIL;
                                                        try
                                                        {
                                                          _prev_bind_0_$26 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                                                          try
                                                          {
                                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(
                                                                thread ) ), thread );
                                                            timer = subl_macro_promotions.with_timeout_start_timer( max_time, tag );
                                                            thread.resetMultipleValues();
                                                            str_$35 = paraphrase_fort_for_cache( fort, paraphrase_mt, nl_preds );
                                                            pred_$36 = thread.secondMultipleValue();
                                                            demerits_$37 = thread.thirdMultipleValue();
                                                            justifications_$38 = thread.fourthMultipleValue();
                                                            thread.resetMultipleValues();
                                                            str = str_$35;
                                                            pred = pred_$36;
                                                            demerits = demerits_$37;
                                                            justifications = justifications_$38;
                                                          }
                                                          finally
                                                          {
                                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$26, thread );
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                          try
                                                          {
                                                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                            _values = Values.getValuesAsVector();
                                                            subl_macro_promotions.with_timeout_stop_timer( timer );
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
                                                        subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$25, thread );
                                                      }
                                                    }
                                                    catch( final Throwable ccatch_env_var )
                                                    {
                                                      timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
                                                    }
                                                    finally
                                                    {
                                                      thread.throwStack.pop();
                                                    }
                                                    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                                    if( NIL != timed_outP && NIL != $nl_generation_fort_cache_retry_on_timeoutP$.getDynamicValue( thread ) )
                                                    {
                                                      Errors.warn( $str97$Timed_out_on_first_try_after__A_g, numeric_date_utilities.readable_elapsed_time_string( max_time, UNPROVIDED ), fort );
                                                      time_var = Time.get_internal_real_time();
                                                      tag = subl_macro_promotions.with_timeout_make_tag();
                                                      try
                                                      {
                                                        thread.throwStack.push( tag );
                                                        _prev_bind_0_$28 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                                                        try
                                                        {
                                                          subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                                                          timer = NIL;
                                                          try
                                                          {
                                                            _prev_bind_0_$29 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                                                            try
                                                            {
                                                              subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(
                                                                  thread ) ), thread );
                                                              timer = subl_macro_promotions.with_timeout_start_timer( max_time, tag );
                                                              thread.resetMultipleValues();
                                                              str_$36 = paraphrase_fort_for_cache( fort, paraphrase_mt, nl_preds );
                                                              pred_$37 = thread.secondMultipleValue();
                                                              demerits_$38 = thread.thirdMultipleValue();
                                                              justifications_$39 = thread.fourthMultipleValue();
                                                              thread.resetMultipleValues();
                                                              str = str_$36;
                                                              pred = pred_$37;
                                                              demerits = demerits_$38;
                                                              justifications = justifications_$39;
                                                            }
                                                            finally
                                                            {
                                                              subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$29, thread );
                                                            }
                                                          }
                                                          finally
                                                          {
                                                            _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                            try
                                                            {
                                                              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                              _values2 = Values.getValuesAsVector();
                                                              subl_macro_promotions.with_timeout_stop_timer( timer );
                                                              Values.restoreValuesFromVector( _values2 );
                                                            }
                                                            finally
                                                            {
                                                              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
                                                            }
                                                          }
                                                        }
                                                        finally
                                                        {
                                                          subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$28, thread );
                                                        }
                                                      }
                                                      catch( final Throwable ccatch_env_var )
                                                      {
                                                        timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
                                                      }
                                                      finally
                                                      {
                                                        thread.throwStack.pop();
                                                      }
                                                      time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                                    }
                                                    batch_times = ConsesLow.cons( time, batch_times );
                                                    if( NIL != timed_outP )
                                                    {
                                                      Functions.funcall( ( NIL != $nl_generation_fort_cache_break_on_timeoutP$.getDynamicValue( thread ) ) ? $sym98$BREAK : $sym99$WARN,
                                                          $str100$Timed_out_after__A_generating_par, numeric_date_utilities.readable_elapsed_time_string( max_time, UNPROVIDED ), fort );
                                                      batch_failed_forts = ConsesLow.cons( fort, batch_failed_forts );
                                                    }
                                                    else if( NIL == cycl_string.cycl_string_p( str ) )
                                                    {
                                                      Errors.warn( $str101$Failed_to_generate_a_string_for__, fort );
                                                      batch_failed_forts = ConsesLow.cons( fort, batch_failed_forts );
                                                    }
                                                    else if( NIL != cycl_string.cycl_string_equal( str, $str94$ ) )
                                                    {
                                                      Errors.warn( $str102$Generated_empty_string_for__S, fort );
                                                      batch_failed_forts = ConsesLow.cons( fort, batch_failed_forts );
                                                    }
                                                    else
                                                    {
                                                      paraphrase_data = ConsesLow.list( str, pred, demerits, justifications );
                                                      cfasl.cfasl_output_externalized( fort, results_stream );
                                                      cfasl.cfasl_output_externalized( paraphrase_data, results_stream );
                                                      cfasl.cfasl_output( fort, fast_results_stream );
                                                      cfasl.cfasl_output( paraphrase_data, fast_results_stream );
                                                      new_pph_phrase_count = pph_data_structures.pph_phrase_count();
                                                      if( Numbers.subtract( new_pph_phrase_count, pph_phrase_count ).numG( TEN_INTEGER ) )
                                                      {
                                                        Errors.warn( $str103$PPH_phrase_count_grew_from__D_to_, pph_phrase_count, new_pph_phrase_count, fort );
                                                        pph_phrase_count = new_pph_phrase_count;
                                                      }
                                                    }
                                                  }
                                                  if( Numbers.mod( i, batch_size ).isZero() && NIL != list_utilities.non_empty_list_p( batch_times ) )
                                                  {
                                                    trim_pph_memoization_state_caches( UNPROVIDED );
                                                    batch_number = Numbers.integerDivide( i, batch_size );
                                                    $nl_generation_fort_cache_failed_fort_counts$.setDynamicValue( list_utilities.add_to_end( ConsesLow.list( batch_number, Sequences.length( batch_failed_forts ) ),
                                                        $nl_generation_fort_cache_failed_fort_counts$.getDynamicValue( thread ) ), thread );
                                                    batch_failed_forts = NIL;
                                                    print_nl_generation_cache_times( i, batch_size, batch_start_time, batch_start_cpu_time, batch_times, my_task_directory, log_stream );
                                                    batch_start_time = Time.get_universal_time();
                                                    batch_times = NIL;
                                                  }
                                                  if( i.numGE( end_num ) )
                                                  {
                                                    doneP = T;
                                                  }
                                                }
                                              }
                                            }
                                          }
                                          else
                                          {
                                            cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
                                          }
                                        }
                                        idx_$32 = idx;
                                        if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$32 ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
                                        {
                                          sparse = id_index.id_index_sparse_objects( idx_$32 );
                                          id2 = id_index.id_index_sparse_id_threshold( idx_$32 );
                                          end_id = id_index.id_index_next_id( idx_$32 );
                                          v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw95$SKIP ) ) ? NIL : $kw95$SKIP;
                                          while ( id2.numL( end_id ) && NIL == doneP)
                                          {
                                            fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                                            if( NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                                            {
                                              sofar = Numbers.add( sofar, ONE_INTEGER );
                                              utilities_macros.note_percent_progress( sofar, total );
                                              i = Numbers.add( i, ONE_INTEGER );
                                              _prev_bind_0_$31 = utilities_macros.$silent_progressP$.currentBinding( thread );
                                              try
                                              {
                                                utilities_macros.$silent_progressP$.bind( NIL, thread );
                                                utilities_macros.note_percent_progress( Numbers.subtract( i, start_num ), number_utilities.f_1X( Numbers.subtract( end_num, start_num ) ) );
                                              }
                                              finally
                                              {
                                                utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$31, thread );
                                              }
                                              if( !i.numL( start_num ) && NIL == set.set_memberP( fort2, previously_done_forts ) && NIL == dont_want_to_generate_this_oneP( fort2 ) )
                                              {
                                                max_time2 = $nl_generation_fort_cache_timeout$.getDynamicValue( thread );
                                                timed_outP2 = NIL;
                                                time2 = NIL;
                                                str2 = NIL;
                                                pred2 = NIL;
                                                justifications2 = NIL;
                                                demerits2 = NIL;
                                                time_var2 = Time.get_internal_real_time();
                                                tag2 = subl_macro_promotions.with_timeout_make_tag();
                                                try
                                                {
                                                  thread.throwStack.push( tag2 );
                                                  _prev_bind_0_$32 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                                                  try
                                                  {
                                                    subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                                                    timer2 = NIL;
                                                    try
                                                    {
                                                      _prev_bind_0_$33 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                                                      try
                                                      {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ),
                                                            thread );
                                                        timer2 = subl_macro_promotions.with_timeout_start_timer( max_time2, tag2 );
                                                        thread.resetMultipleValues();
                                                        str_$37 = paraphrase_fort_for_cache( fort2, paraphrase_mt, nl_preds );
                                                        pred_$38 = thread.secondMultipleValue();
                                                        demerits_$39 = thread.thirdMultipleValue();
                                                        justifications_$40 = thread.fourthMultipleValue();
                                                        thread.resetMultipleValues();
                                                        str2 = str_$37;
                                                        pred2 = pred_$38;
                                                        demerits2 = demerits_$39;
                                                        justifications2 = justifications_$40;
                                                      }
                                                      finally
                                                      {
                                                        subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$33, thread );
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                      try
                                                      {
                                                        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                        _values3 = Values.getValuesAsVector();
                                                        subl_macro_promotions.with_timeout_stop_timer( timer2 );
                                                        Values.restoreValuesFromVector( _values3 );
                                                      }
                                                      finally
                                                      {
                                                        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
                                                      }
                                                    }
                                                  }
                                                  finally
                                                  {
                                                    subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$32, thread );
                                                  }
                                                }
                                                catch( final Throwable ccatch_env_var2 )
                                                {
                                                  timed_outP2 = Errors.handleThrowable( ccatch_env_var2, tag2 );
                                                }
                                                finally
                                                {
                                                  thread.throwStack.pop();
                                                }
                                                time2 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var2 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                                if( NIL != timed_outP2 && NIL != $nl_generation_fort_cache_retry_on_timeoutP$.getDynamicValue( thread ) )
                                                {
                                                  Errors.warn( $str97$Timed_out_on_first_try_after__A_g, numeric_date_utilities.readable_elapsed_time_string( max_time2, UNPROVIDED ), fort2 );
                                                  time_var2 = Time.get_internal_real_time();
                                                  tag2 = subl_macro_promotions.with_timeout_make_tag();
                                                  try
                                                  {
                                                    thread.throwStack.push( tag2 );
                                                    _prev_bind_0_$35 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
                                                    try
                                                    {
                                                      subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                                                      timer2 = NIL;
                                                      try
                                                      {
                                                        _prev_bind_0_$36 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                                                        try
                                                        {
                                                          subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ),
                                                              thread );
                                                          timer2 = subl_macro_promotions.with_timeout_start_timer( max_time2, tag2 );
                                                          thread.resetMultipleValues();
                                                          str_$38 = paraphrase_fort_for_cache( fort2, paraphrase_mt, nl_preds );
                                                          pred_$39 = thread.secondMultipleValue();
                                                          demerits_$40 = thread.thirdMultipleValue();
                                                          justifications_$41 = thread.fourthMultipleValue();
                                                          thread.resetMultipleValues();
                                                          str2 = str_$38;
                                                          pred2 = pred_$39;
                                                          demerits2 = demerits_$40;
                                                          justifications2 = justifications_$41;
                                                        }
                                                        finally
                                                        {
                                                          subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$36, thread );
                                                        }
                                                      }
                                                      finally
                                                      {
                                                        _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                                        try
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                                          _values4 = Values.getValuesAsVector();
                                                          subl_macro_promotions.with_timeout_stop_timer( timer2 );
                                                          Values.restoreValuesFromVector( _values4 );
                                                        }
                                                        finally
                                                        {
                                                          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
                                                        }
                                                      }
                                                    }
                                                    finally
                                                    {
                                                      subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$35, thread );
                                                    }
                                                  }
                                                  catch( final Throwable ccatch_env_var2 )
                                                  {
                                                    timed_outP2 = Errors.handleThrowable( ccatch_env_var2, tag2 );
                                                  }
                                                  finally
                                                  {
                                                    thread.throwStack.pop();
                                                  }
                                                  time2 = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var2 ), time_high.$internal_time_units_per_second$.getGlobalValue() );
                                                }
                                                batch_times = ConsesLow.cons( time2, batch_times );
                                                if( NIL != timed_outP2 )
                                                {
                                                  Functions.funcall( ( NIL != $nl_generation_fort_cache_break_on_timeoutP$.getDynamicValue( thread ) ) ? $sym98$BREAK : $sym99$WARN,
                                                      $str100$Timed_out_after__A_generating_par, numeric_date_utilities.readable_elapsed_time_string( max_time2, UNPROVIDED ), fort2 );
                                                  batch_failed_forts = ConsesLow.cons( fort2, batch_failed_forts );
                                                }
                                                else if( NIL == cycl_string.cycl_string_p( str2 ) )
                                                {
                                                  Errors.warn( $str101$Failed_to_generate_a_string_for__, fort2 );
                                                  batch_failed_forts = ConsesLow.cons( fort2, batch_failed_forts );
                                                }
                                                else if( NIL != cycl_string.cycl_string_equal( str2, $str94$ ) )
                                                {
                                                  Errors.warn( $str102$Generated_empty_string_for__S, fort2 );
                                                  batch_failed_forts = ConsesLow.cons( fort2, batch_failed_forts );
                                                }
                                                else
                                                {
                                                  paraphrase_data2 = ConsesLow.list( str2, pred2, demerits2, justifications2 );
                                                  cfasl.cfasl_output_externalized( fort2, results_stream );
                                                  cfasl.cfasl_output_externalized( paraphrase_data2, results_stream );
                                                  cfasl.cfasl_output( fort2, fast_results_stream );
                                                  cfasl.cfasl_output( paraphrase_data2, fast_results_stream );
                                                  new_pph_phrase_count2 = pph_data_structures.pph_phrase_count();
                                                  if( Numbers.subtract( new_pph_phrase_count2, pph_phrase_count ).numG( TEN_INTEGER ) )
                                                  {
                                                    Errors.warn( $str103$PPH_phrase_count_grew_from__D_to_, pph_phrase_count, new_pph_phrase_count2, fort2 );
                                                    pph_phrase_count = new_pph_phrase_count2;
                                                  }
                                                }
                                              }
                                              if( Numbers.mod( i, batch_size ).isZero() && NIL != list_utilities.non_empty_list_p( batch_times ) )
                                              {
                                                trim_pph_memoization_state_caches( UNPROVIDED );
                                                batch_number2 = Numbers.integerDivide( i, batch_size );
                                                $nl_generation_fort_cache_failed_fort_counts$.setDynamicValue( list_utilities.add_to_end( ConsesLow.list( batch_number2, Sequences.length( batch_failed_forts ) ),
                                                    $nl_generation_fort_cache_failed_fort_counts$.getDynamicValue( thread ) ), thread );
                                                batch_failed_forts = NIL;
                                                print_nl_generation_cache_times( i, batch_size, batch_start_time, batch_start_cpu_time, batch_times, my_task_directory, log_stream );
                                                batch_start_time = Time.get_universal_time();
                                                batch_times = NIL;
                                              }
                                              if( i.numGE( end_num ) )
                                              {
                                                doneP = T;
                                              }
                                            }
                                            id2 = Numbers.add( id2, ONE_INTEGER );
                                          }
                                        }
                                      }
                                    }
                                  }
                                  finally
                                  {
                                    final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                                    try
                                    {
                                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                      final SubLObject _values5 = Values.getValuesAsVector();
                                      utilities_macros.noting_percent_progress_postamble();
                                      Values.restoreValuesFromVector( _values5 );
                                    }
                                    finally
                                    {
                                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$38, thread );
                                    }
                                  }
                                }
                                finally
                                {
                                  utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3_$26, thread );
                                  utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$25, thread );
                                  utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$24, thread );
                                  utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$23, thread );
                                }
                              }
                              finally
                              {
                                utilities_macros.$silent_progressP$.rebind( _prev_bind_0_$22, thread );
                              }
                            }
                            finally
                            {
                              final SubLObject _prev_bind_0_$39 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                              try
                              {
                                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                                final SubLObject _values6 = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector( _values6 );
                              }
                              finally
                              {
                                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$39, thread );
                              }
                            }
                          }
                          finally
                          {
                            utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_3_$25, thread );
                            utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_2_$24, thread );
                            utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_1_$23, thread );
                            utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$21, thread );
                          }
                          if( NIL != doneP )
                          {
                            file_utilities.write_text_file( Sequences.cconcatenate( my_task_directory, $str82$done ), NIL );
                          }
                        }
                        finally
                        {
                          final SubLObject _prev_bind_0_$40 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                          try
                          {
                            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                            final SubLObject _values7 = Values.getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process( local_state, original_memoization_process );
                            Values.restoreValuesFromVector( _values7 );
                          }
                          finally
                          {
                            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$40, thread );
                          }
                        }
                      }
                      finally
                      {
                        memoization_state.$memoization_state$.rebind( _prev_bind_0_$20, thread );
                      }
                    }
                    finally
                    {
                      pph_macros.$pph_external_memoization_state$.rebind( _prev_bind_0_$19, thread );
                    }
                    if( new_or_reused == $kw104$NEW && NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
                    {
                      memoization_state.clear_all_memoization( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) );
                    }
                  }
                  finally
                  {
                    pph_macros.$pph_memoization_state$.rebind( _prev_bind_0_$18, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values8 = Values.getValuesAsVector();
                    if( NIL == reuseP )
                    {
                      pph_macros.free_pph_problem_store_pointer( pph_macros.$pph_problem_store_pointer$.getDynamicValue( thread ) );
                    }
                    Values.restoreValuesFromVector( _values8 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$41, thread );
                  }
                }
              }
              finally
              {
                pph_macros.$pph_problem_store_pointer$.rebind( _prev_bind_0_$17, thread );
              }
            }
            finally
            {
              pph_macros.$free_pph_problem_store_pointers$.rebind( _prev_bind_0_$16, thread );
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$42 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values9 = Values.getValuesAsVector();
              if( stream_$14.isStream() )
              {
                streams_high.close( stream_$14, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values9 );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$42, thread );
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values10 = Values.getValuesAsVector();
            if( stream_$13.isStream() )
            {
              streams_high.close( stream_$13, UNPROVIDED );
            }
            Values.restoreValuesFromVector( _values10 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$43, thread );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$44 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values11 = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values11 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$44, thread );
        }
      }
    }
    finally
    {
      pph_vars.$bypass_pph_phrase_destroyerP$.rebind( _prev_bind_7, thread );
      $nl_generation_fort_cache_gc_times$.rebind( _prev_bind_6, thread );
      $nl_generation_fort_cache_failed_fort_counts$.rebind( _prev_bind_5, thread );
      $nl_generation_fort_cache_swap_times$.rebind( _prev_bind_4, thread );
      $nl_generation_fort_cache_cpu_times$.rebind( _prev_bind_3, thread );
      $nl_generation_fort_cache_total_times$.rebind( _prev_bind_2, thread );
      $nl_generation_fort_cache_median_times$.rebind( _prev_bind_0, thread );
    }
    return my_task_directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 30346L)
  public static SubLObject verify_cached_paraphrases(SubLObject number_of_constants_to_check, SubLObject number_of_narts_to_check)
  {
    if( number_of_constants_to_check == UNPROVIDED )
    {
      number_of_constants_to_check = $int105$500;
    }
    if( number_of_narts_to_check == UNPROVIDED )
    {
      number_of_narts_to_check = $int105$500;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject constant_verified_count = ZERO_INTEGER;
    SubLObject nart_verified_count = ZERO_INTEGER;
    SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( Sequences.cconcatenate( $str106$Verifying_, new SubLObject[] { format_nil.format_nil_d_no_copy( number_of_constants_to_check ), $str107$_constants___
      } ), thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( number_of_constants_to_check, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject constant;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          constant = constants_high.random_constant( UNPROVIDED );
          if( NIL != verify_cached_paraphrase( constant ) )
          {
            constant_verified_count = Numbers.add( constant_verified_count, ONE_INTEGER );
          }
          else
          {
            Errors.warn( $str108$_S____Cached___S___Generated___S_, constant, Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( nl_generation_cache_lookup( constant, UNPROVIDED, UNPROVIDED ) ) ),
                Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( paraphrase_fort_for_cache( constant, UNPROVIDED, UNPROVIDED ) ) ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$70 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$70, thread );
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
      utilities_macros.$progress_note$.bind( Sequences.cconcatenate( $str106$Verifying_, new SubLObject[] { format_nil.format_nil_d_no_copy( number_of_narts_to_check ), $str109$_NARTs___
      } ), thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( number_of_narts_to_check, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject nart;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          nart = narts_high.random_nart( UNPROVIDED );
          if( NIL != verify_cached_paraphrase( nart ) )
          {
            nart_verified_count = Numbers.add( nart_verified_count, ONE_INTEGER );
          }
          else
          {
            Errors.warn( $str108$_S____Cached___S___Generated___S_, nart, Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( nl_generation_cache_lookup( nart, UNPROVIDED, UNPROVIDED ) ) ), Values
                .arg2( thread.resetMultipleValues(), Values.multiple_value_list( paraphrase_fort_for_cache( nart, UNPROVIDED, UNPROVIDED ) ) ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$71 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$71, thread );
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
    PrintLow.format( T, $str110$_D_of__D_constants_verified___F__, new SubLObject[] { constant_verified_count, number_of_constants_to_check, number_utilities.percent( constant_verified_count,
        number_of_constants_to_check, THREE_INTEGER )
    } );
    PrintLow.format( T, $str111$_D_of__D_narts_verified___F____, new SubLObject[] { nart_verified_count, number_of_narts_to_check, number_utilities.percent( nart_verified_count, number_of_narts_to_check, THREE_INTEGER )
    } );
    return makeBoolean( number_of_constants_to_check.eql( constant_verified_count ) && number_of_narts_to_check.eql( nart_verified_count ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 31982L)
  public static SubLObject verify_cached_paraphrase(final SubLObject fort)
  {
    return makeBoolean( NIL != dont_want_to_generate_this_oneP( fort ) || Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( paraphrase_fort_for_cache( fort, UNPROVIDED, UNPROVIDED ) ) ).equal( Values
        .arg2( Values.resetMultipleValues(), Values.multiple_value_list( nl_generation_cache_lookup( fort, UNPROVIDED, UNPROVIDED ) ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 32214L)
  public static SubLObject nl_generation_fort_cache_data_generatedP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject start_num = ONE_INTEGER;
    SubLObject first_nonfinished_directory = NIL;
    final SubLObject working_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue( thread );
    final SubLObject fort_count = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str35$fort_count_cfasl ) );
    final SubLObject assignment_size = cfasl_utilities.cfasl_load( Sequences.cconcatenate( working_directory, $str60$assignment_size_cfasl ) );
    SubLObject doneP = NIL;
    while ( NIL == doneP)
    {
      thread.resetMultipleValues();
      final SubLObject subdirectory = nl_generation_fort_cache_subdirectory( working_directory, start_num, fort_count, assignment_size );
      final SubLObject last_oneP = thread.secondMultipleValue();
      thread.resetMultipleValues();
      final SubLObject missingP = makeBoolean( NIL == Filesys.directory_p( subdirectory ) );
      if( NIL != missingP )
      {
        first_nonfinished_directory = subdirectory;
        PrintLow.format( T, $str112$__First_non_finished__missing__di, subdirectory );
        doneP = T;
      }
      else if( NIL == Filesys.probe_file( Sequences.cconcatenate( subdirectory, $str82$done ) ) )
      {
        if( NIL != nl_fort_generation_task_failedP( ConsesLow.list( subdirectory ) ) )
        {
          PrintLow.format( T, $str113$__First_non_finished__failed__dir, subdirectory );
          first_nonfinished_directory = subdirectory;
          doneP = T;
        }
      }
      if( NIL != last_oneP )
      {
        doneP = T;
      }
      if( NIL == doneP )
      {
        start_num = Numbers.add( start_num, assignment_size );
      }
    }
    return Types.sublisp_null( first_nonfinished_directory );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 33463L)
  public static SubLObject trim_pph_memoization_state_caches(SubLObject cutoff)
  {
    if( cutoff == UNPROVIDED )
    {
      cutoff = $int114$128;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != dictionary.dictionary_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
    {
      SubLObject iteration_state;
      for( iteration_state = dictionary_contents.do_dictionary_contents_state( dictionary.dictionary_contents( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) ); NIL == dictionary_contents
          .do_dictionary_contents_doneP( iteration_state ); iteration_state = dictionary_contents.do_dictionary_contents_next( iteration_state ) )
      {
        thread.resetMultipleValues();
        final SubLObject function_spec = dictionary_contents.do_dictionary_contents_key_value( iteration_state );
        final SubLObject v_cache = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( NIL != dictionary.dictionary_p( v_cache ) && dictionary.dictionary_length( v_cache ).numG( cutoff ) )
        {
          Errors.warn( $str115$Clearing_PPH_memoization_for__S, function_spec );
          dictionary.clear_dictionary( v_cache );
        }
      }
      dictionary_contents.do_dictionary_contents_finalize( iteration_state );
    }
    else if( NIL != memoization_state.memoization_state_p( pph_macros.$pph_memoization_state$.getDynamicValue( thread ) ) )
    {
    }
    return pph_macros.$pph_memoization_state$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 34011L)
  public static SubLObject print_nl_generation_cache_times(final SubLObject i, final SubLObject batch_size, final SubLObject batch_start_time, final SubLObject batch_start_cpu_time, final SubLObject batch_times,
      final SubLObject working_directory, final SubLObject stream)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject batch_number = Numbers.integerDivide( i, batch_size );
    final SubLObject total_real_time = Numbers.subtract( Time.get_universal_time(), batch_start_time );
    PrintLow.format( stream, $str116$__Paraphrased_batch___D_of__S_FOR, new SubLObject[] { batch_number, batch_size, numeric_date_utilities.readable_elapsed_time_string( total_real_time, ZERO_INTEGER )
    } );
    final SubLObject total_time = Functions.apply( Symbols.symbol_function( $sym117$_ ), batch_times );
    PrintLow.format( stream, $str118$__Total_paraphrase_time___S__, total_time );
    $nl_generation_fort_cache_total_times$.setDynamicValue( list_utilities.add_to_end( ConsesLow.list( batch_number, total_time ), $nl_generation_fort_cache_total_times$.getDynamicValue( thread ) ), thread );
    final SubLObject median_time = number_utilities.median( batch_times, UNPROVIDED, UNPROVIDED );
    PrintLow.format( stream, $str119$__Median_paraphrase_time___S__, median_time );
    $nl_generation_fort_cache_median_times$.setDynamicValue( list_utilities.add_to_end( ConsesLow.list( batch_number, median_time ), $nl_generation_fort_cache_median_times$.getDynamicValue( thread ) ), thread );
    SubLObject enoughP = NIL;
    if( NIL == enoughP )
    {
      SubLObject n = NIL;
      n = ONE_INTEGER;
      while ( NIL == enoughP)
      {
        if( batch_size.numGE( Numbers.divide( Numbers.expt( TEN_INTEGER, n ), TWO_INTEGER ) ) )
        {
          final SubLObject ile = Numbers.subtract( ONE_INTEGER, Numbers.expt( TEN_INTEGER, Numbers.minus( n ) ) );
          PrintLow.format( stream, $str120$___Sth_percentile_paraphrase_time, Numbers.multiply( ile, $int21$100 ), number_utilities.percentile( batch_times, ile, UNPROVIDED, UNPROVIDED ) );
        }
        else
        {
          enoughP = T;
        }
        n = number_utilities.f_1X( n );
      }
    }
    final SubLObject total_swap_seconds = assertion_manager.current_assertion_content_swap_time();
    PrintLow.format( stream, $str121$____SWAP_time___A___, numeric_date_utilities.readable_elapsed_time_string( total_swap_seconds, UNPROVIDED ) );
    $nl_generation_fort_cache_swap_times$.setDynamicValue( list_utilities.add_to_end( ConsesLow.list( batch_number, total_swap_seconds ), $nl_generation_fort_cache_swap_times$.getDynamicValue( thread ) ), thread );
    assertion_manager.clear_assertion_content_swap_time();
    if( NIL != $nl_generation_fort_cache_generate_plotsP$.getDynamicValue( thread ) )
    {
      generate_nl_generation_cache_time_plots( batch_size, working_directory );
    }
    streams_high.force_output( stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 37046L)
  public static SubLObject generate_nl_generation_cache_time_plots(final SubLObject batch_size, final SubLObject directory)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject datum = NIL;
    SubLObject datum_$72 = NIL;
    SubLObject plot_title_format_string = NIL;
    SubLObject plot_title_format_string_$73 = NIL;
    SubLObject output_file = NIL;
    SubLObject output_file_$74 = NIL;
    SubLObject ylabel = NIL;
    SubLObject ylabel_$75 = NIL;
    datum = ConsesLow.list( $nl_generation_fort_cache_total_times$.getDynamicValue( thread ), $nl_generation_fort_cache_median_times$.getDynamicValue( thread ), $nl_generation_fort_cache_cpu_times$.getDynamicValue(
        thread ), $nl_generation_fort_cache_gc_times$.getDynamicValue( thread ), $nl_generation_fort_cache_swap_times$.getDynamicValue( thread ), $nl_generation_fort_cache_failed_fort_counts$.getDynamicValue( thread ) );
    datum_$72 = datum.first();
    plot_title_format_string = $list122;
    plot_title_format_string_$73 = plot_title_format_string.first();
    output_file = $list123;
    output_file_$74 = output_file.first();
    ylabel = $list124;
    ylabel_$75 = ylabel.first();
    while ( NIL != ylabel || NIL != output_file || NIL != plot_title_format_string || NIL != datum)
    {
      if( NIL != list_utilities.lengthG( datum_$72, ONE_INTEGER, UNPROVIDED ) )
      {
        final SubLObject plot_title = PrintLow.format( NIL, plot_title_format_string_$73, batch_size );
        final SubLObject full_output_file = Sequences.cconcatenate( directory, output_file_$74 );
        plot_generation.generate_lines_graph( ConsesLow.list( datum_$72 ), ConsesLow.list( $kw125$XLABEL, $str126$Batch__, $kw127$YLABEL, ylabel_$75, $kw128$PLOT_TITLE, plot_title, $kw129$OUTPUT_FILE,
            full_output_file ) );
        cfasl_utilities.cfasl_save( datum_$72, Sequences.cconcatenate( full_output_file, $str130$_cfasl ) );
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

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 38277L)
  public static SubLObject stitch_together_nl_generation_cache_time_plots()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject plot_title = NIL;
    SubLObject plot_title_$76 = NIL;
    SubLObject output_file = NIL;
    SubLObject output_file_$77 = NIL;
    SubLObject ylabel = NIL;
    SubLObject ylabel_$78 = NIL;
    plot_title = $list131;
    plot_title_$76 = plot_title.first();
    output_file = $list123;
    output_file_$77 = output_file.first();
    ylabel = $list124;
    ylabel_$78 = ylabel.first();
    while ( NIL != ylabel || NIL != output_file || NIL != plot_title)
    {
      final SubLObject progress_message = NIL;
      final SubLObject main_directory = $nl_generation_fort_cache_working_directory$.getDynamicValue( thread );
      SubLObject datum = NIL;
      assert NIL != Filesys.directory_p( main_directory ) : main_directory;
      SubLObject directory_contents_var = Filesys.directory( main_directory, T );
      final SubLObject progress_message_var = progress_message;
      final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
      try
      {
        utilities_macros.$silent_progressP$.bind( makeBoolean( !progress_message_var.isString() ), thread );
        if( NIL.isFunctionSpec() )
        {
          directory_contents_var = Sort.sort( directory_contents_var, NIL, UNPROVIDED );
        }
        final SubLObject list_var = directory_contents_var;
        final SubLObject _prev_bind_0_$79 = utilities_macros.$progress_note$.currentBinding( thread );
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
        try
        {
          utilities_macros.$progress_note$.bind( ( NIL != progress_message_var ) ? progress_message_var : $str44$cdolist, thread );
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
            SubLObject assignment_directory = NIL;
            assignment_directory = csome_list_var.first();
            while ( NIL != csome_list_var)
            {
              if( NIL != Filesys.directory_p( assignment_directory ) && NIL != Filesys.probe_file( Sequences.cconcatenate( assignment_directory, new SubLObject[] { $str19$_, output_file_$77, $str130$_cfasl
              } ) ) )
              {
                final SubLObject subdatum = cfasl_utilities.cfasl_load( Sequences.cconcatenate( assignment_directory, new SubLObject[] { $str19$_, output_file_$77, $str130$_cfasl
                } ) );
                datum = ConsesLow.append( subdatum, datum );
              }
              utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
              utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
              csome_list_var = csome_list_var.rest();
              assignment_directory = csome_list_var.first();
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$80 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              utilities_macros.noting_percent_progress_postamble();
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$80, thread );
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
          utilities_macros.$progress_note$.rebind( _prev_bind_0_$79, thread );
        }
      }
      finally
      {
        utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
      }
      datum = Sort.sort( datum, Symbols.symbol_function( $sym132$_ ), Symbols.symbol_function( $sym133$FIRST ) );
      final SubLObject full_output_file = Sequences.cconcatenate( main_directory, output_file_$77 );
      plot_generation.generate_lines_graph( ConsesLow.list( datum ), ConsesLow.list( $kw125$XLABEL, $str126$Batch__, $kw127$YLABEL, ylabel_$78, $kw128$PLOT_TITLE, plot_title_$76, $kw129$OUTPUT_FILE, full_output_file ) );
      cfasl_utilities.cfasl_save( datum, Sequences.cconcatenate( full_output_file, $str130$_cfasl ) );
      plot_title = plot_title.rest();
      plot_title_$76 = plot_title.first();
      output_file = output_file.rest();
      output_file_$77 = output_file.first();
      ylabel = ylabel.rest();
      ylabel_$78 = ylabel.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 39736L)
  public static SubLObject nanoseconds_per_second()
  {
    return $nanoseconds_per_second$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 39815L)
  public static SubLObject paraphrase_fort_for_cache(final SubLObject fort, SubLObject paraphrase_mt, SubLObject nl_preds)
  {
    if( paraphrase_mt == UNPROVIDED )
    {
      paraphrase_mt = default_nl_generation_fort_cache_paraphrase_mt();
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $nl_generation_fort_cache_nl_preds$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject str = NIL;
    SubLObject pred = NIL;
    SubLObject justifications = NIL;
    SubLObject demerits = NIL;
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject _prev_bind_0_$81 = $use_generic_singular_nl_generation_fort_cacheP$.currentBinding( thread );
          final SubLObject _prev_bind_2 = pph_vars.$retain_pph_queriesP$.currentBinding( thread );
          final SubLObject _prev_bind_3 = pph_vars.$select_string_methods_to_omit$.currentBinding( thread );
          final SubLObject _prev_bind_4 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
          try
          {
            $use_generic_singular_nl_generation_fort_cacheP$.bind( NIL, thread );
            pph_vars.$retain_pph_queriesP$.bind( NIL, thread );
            pph_vars.$select_string_methods_to_omit$.bind( $list136, thread );
            pph_vars.$pph_track_discourse_referentsP$.bind( NIL, thread );
            SubLObject output_list = NIL;
            thread.resetMultipleValues();
            final SubLObject str_$82 = pph_main.generate_phrase_no_checks( fort, nl_preds, NIL, paraphrase_mt, $const137$InferencePSC, $kw138$TEXT, UNPROVIDED, UNPROVIDED );
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
          }
          finally
          {
            pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_4, thread );
            pph_vars.$select_string_methods_to_omit$.rebind( _prev_bind_3, thread );
            pph_vars.$retain_pph_queriesP$.rebind( _prev_bind_2, thread );
            $use_generic_singular_nl_generation_fort_cacheP$.rebind( _prev_bind_0_$81, thread );
          }
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
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != error_message )
    {
      Errors.warn( $str139$Error_in_paraphrase_fort_for_cach, fort, error_message );
    }
    return Values.values( str, pred, demerits, justifications );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 40716L)
  public static SubLObject nl_generation_fort_cache_stale_for_fortP(final SubLObject fort)
  {
    SubLObject staleP = NIL;
    final SubLObject check_justificationsP = NIL;
    if( NIL == dont_want_to_generate_this_oneP( fort ) )
    {
      final SubLObject cached = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( nl_generation_cache_lookup( fort, UNPROVIDED, UNPROVIDED ) ) );
      if( NIL != cycl_string.cycl_string_p( cached.first() ) )
      {
        final SubLObject v_new = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( paraphrase_fort_for_cache( fort, UNPROVIDED, UNPROVIDED ) ) );
        if( !list_utilities.first_n( THREE_INTEGER, v_new ).equal( list_utilities.first_n( THREE_INTEGER, cached ) ) || ( NIL != check_justificationsP && NIL == list_utilities.sets_equalP( list_utilities.last_one(
            v_new ), list_utilities.last_one( cached ), Symbols.symbol_function( EQUAL ) ) ) )
        {
          Errors.warn( $str140$Cached_paraphrase_for__S___is__S_, fort, cached, v_new );
          staleP = T;
        }
      }
    }
    return staleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 41386L)
  public static SubLObject estimate_nl_generation_cache_stale_percentage(SubLObject window, SubLObject max_variance, SubLObject minimum_to_sample)
  {
    if( window == UNPROVIDED )
    {
      window = $int21$100;
    }
    if( max_variance == UNPROVIDED )
    {
      max_variance = $float141$0_001;
    }
    if( minimum_to_sample == UNPROVIDED )
    {
      minimum_to_sample = Numbers.multiply( TWO_INTEGER, window );
    }
    PrintLow.format( T, $str142$__Checking_NL_Generation_cache_ba, new SubLObject[] { file_backed_cache.file_backed_cache_file_hash_table_path( $english_generation_fort_cache$.getGlobalValue() ), file_backed_cache
        .file_backed_cache_local_cache_count( $english_generation_fort_cache$.getGlobalValue() ), operation_communication.kb_version_string(), control_vars.build_kb_loaded()
    } );
    final SubLObject done_forts = set.new_set( UNPROVIDED, UNPROVIDED );
    SubLObject done_count = ZERO_INTEGER;
    SubLObject stale_forts = NIL;
    SubLObject stale_count = ZERO_INTEGER;
    SubLObject min_percent = NIL;
    SubLObject max_percent = NIL;
    final SubLObject variance_precision = Numbers.ceiling( Numbers.minus( Numbers.log( max_variance, TEN_INTEGER ) ), UNPROVIDED );
    SubLObject remaining_count = window;
    while ( !remaining_count.isZero())
    {
      final SubLObject fort = forts.random_fort( UNPROVIDED );
      if( NIL == set.set_memberP( fort, done_forts ) )
      {
        if( NIL != nl_generation_fort_cache_stale_for_fortP( fort ) )
        {
          stale_forts = ConsesLow.cons( fort, stale_forts );
          stale_count = Numbers.add( stale_count, ONE_INTEGER );
        }
        if( done_count.numGE( Numbers.subtract( minimum_to_sample, window ) ) )
        {
          final SubLObject current_percent = Numbers.divide( stale_count, done_count );
          if( Numbers.mod( done_count, Numbers.integerDivide( minimum_to_sample, TEN_INTEGER ) ).isZero() )
          {
            PrintLow.format( T, $str143$__Done__D__Current_estimate____3F, done_count, number_utilities.percent( current_percent, ONE_INTEGER, FOUR_INTEGER ) );
          }
          if( NIL == min_percent || current_percent.numL( min_percent ) )
          {
            min_percent = current_percent;
          }
          if( NIL == max_percent || current_percent.numG( max_percent ) )
          {
            max_percent = current_percent;
          }
          if( Numbers.subtract( max_percent, min_percent ).numG( max_variance ) )
          {
            Errors.warn( $str144$Done__S__but_variance_of_approxim, new SubLObject[] { done_count, number_utilities.significant_digits( Numbers.subtract( max_percent, min_percent ), variance_precision ), max_variance,
              window
            } );
            remaining_count = window;
            min_percent = NIL;
            max_percent = NIL;
          }
          else
          {
            remaining_count = Numbers.subtract( remaining_count, ONE_INTEGER );
          }
        }
        set.set_add( fort, done_forts );
        done_count = Numbers.add( done_count, ONE_INTEGER );
      }
    }
    final SubLObject format_precision = print_high.princ_to_string( variance_precision );
    final SubLObject format_string = Sequences.cconcatenate( $str145$__The_estimated_staleness_percent, new SubLObject[] { format_precision, $str146$F__and___, format_precision, $str147$F____
    } );
    PrintLow.format( T, format_string, new SubLObject[] { done_count, number_utilities.percent( min_percent, UNPROVIDED, UNPROVIDED ), number_utilities.percent( max_percent, UNPROVIDED, UNPROVIDED )
    } );
    return Values.values( min_percent, max_percent, done_count );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 43665L)
  public static SubLObject verify_cached_nl_generation_for_all_forts(SubLObject fbc)
  {
    if( fbc == UNPROVIDED )
    {
      fbc = $english_generation_fort_cache$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != file_backed_cache.file_backed_cache_p( fbc ) : fbc;
    SubLObject bad_forts = NIL;
    final SubLObject message = $str149$Looking_up_nl_generation_for_all_;
    final SubLObject total = forts.fort_count();
    SubLObject sofar = ZERO_INTEGER;
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
        utilities_macros.noting_percent_progress_preamble( message );
        SubLObject cdolist_list_var = forts.do_forts_tables();
        SubLObject table_var = NIL;
        table_var = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject idx = table_var;
          if( NIL == id_index.id_index_objects_empty_p( idx, $kw95$SKIP ) )
          {
            final SubLObject idx_$87 = idx;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$87, $kw95$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$87 );
              final SubLObject backwardP_var = NIL;
              SubLObject length;
              SubLObject v_iteration;
              SubLObject id;
              SubLObject fort;
              SubLObject nl_cons;
              for( length = Sequences.length( vector_var ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
              {
                id = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
                fort = Vectors.aref( vector_var, id );
                if( NIL == id_index.id_index_tombstone_p( fort ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
                {
                  if( NIL != id_index.id_index_tombstone_p( fort ) )
                  {
                    fort = $kw95$SKIP;
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  nl_cons = file_backed_cache.file_backed_cache_lookup( fort, fbc, $kw150$NOT_FOUND, UNPROVIDED );
                  if( nl_cons == $kw150$NOT_FOUND && NIL == dont_want_to_generate_this_oneP( fort ) )
                  {
                    bad_forts = ConsesLow.cons( fort, bad_forts );
                  }
                }
              }
            }
            final SubLObject idx_$88 = idx;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$88 ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$88 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$88 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$88 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw95$SKIP ) ) ? NIL : $kw95$SKIP;
              while ( id2.numL( end_id ))
              {
                final SubLObject fort2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) || NIL == id_index.id_index_tombstone_p( fort2 ) )
                {
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                  final SubLObject nl_cons2 = file_backed_cache.file_backed_cache_lookup( fort2, fbc, $kw150$NOT_FOUND, UNPROVIDED );
                  if( nl_cons2 == $kw150$NOT_FOUND && NIL == dont_want_to_generate_this_oneP( fort2 ) )
                  {
                    bad_forts = ConsesLow.cons( fort2, bad_forts );
                  }
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
          cdolist_list_var = cdolist_list_var.rest();
          table_var = cdolist_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$89 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$89, thread );
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
    return bad_forts;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 44463L)
  public static SubLObject update_cached_nl_generation_for_all_forts(final SubLObject fht_path, SubLObject paraphrase_mt, SubLObject nl_preds)
  {
    if( paraphrase_mt == UNPROVIDED )
    {
      paraphrase_mt = $const151$EnglishParaphraseMt;
    }
    if( nl_preds == UNPROVIDED )
    {
      nl_preds = $list24;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fht = file_hash_table.open_file_hash_table( fht_path, Symbols.symbol_function( EQUAL ), $kw22$HL_EXTERNALIZED_KEYS );
    final SubLObject fbc = file_backed_cache.file_backed_cache_create( fht_path, $preload_nl_generation_cachesP$.getGlobalValue(), T, $int21$100, Symbols.symbol_function( EQUAL ), $kw22$HL_EXTERNALIZED_KEYS );
    final SubLObject list_var;
    final SubLObject missing_forts = list_var = verify_cached_nl_generation_for_all_forts( fbc );
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
      utilities_macros.$progress_note$.bind( $str44$cdolist, thread );
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
        SubLObject fort = NIL;
        fort = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          if( NIL == dont_want_to_generate_this_oneP( fort ) )
          {
            final SubLObject max_time = $int27$60;
            SubLObject timed_outP = NIL;
            SubLObject str = NIL;
            SubLObject pred = NIL;
            final SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
            try
            {
              thread.throwStack.push( tag );
              final SubLObject _prev_bind_0_$90 = subl_macro_promotions.$within_with_timeout$.currentBinding( thread );
              try
              {
                subl_macro_promotions.$within_with_timeout$.bind( T, thread );
                SubLObject timer = NIL;
                try
                {
                  final SubLObject _prev_bind_0_$91 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding( thread );
                  try
                  {
                    subl_macro_promotions.$with_timeout_nesting_depth$.bind( Numbers.add( ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue( thread ) ), thread );
                    timer = subl_macro_promotions.with_timeout_start_timer( max_time, tag );
                    thread.resetMultipleValues();
                    final SubLObject str_$92 = pph_main.generate_phrase( fort, nl_preds, NIL, paraphrase_mt, $const137$InferencePSC, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                    final SubLObject pred_$93 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    str = str_$92;
                    pred = pred_$93;
                  }
                  finally
                  {
                    subl_macro_promotions.$with_timeout_nesting_depth$.rebind( _prev_bind_0_$91, thread );
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$92 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values = Values.getValuesAsVector();
                    subl_macro_promotions.with_timeout_stop_timer( timer );
                    Values.restoreValuesFromVector( _values );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$92, thread );
                  }
                }
              }
              finally
              {
                subl_macro_promotions.$within_with_timeout$.rebind( _prev_bind_0_$90, thread );
              }
            }
            catch( final Throwable ccatch_env_var )
            {
              timed_outP = Errors.handleThrowable( ccatch_env_var, tag );
            }
            finally
            {
              thread.throwStack.pop();
            }
            if( NIL != timed_outP )
            {
              Errors.warn( $str152$Timed_out_after__S_seconds_genera, max_time, fort );
            }
            else if( NIL != string_utilities.non_empty_stringP( str ) )
            {
              file_hash_table.put_file_hash_table( fort, fht, ConsesLow.cons( str, pred ) );
            }
            else if( NIL != string_utilities.empty_string_p( str ) )
            {
              Errors.warn( $str102$Generated_empty_string_for__S, fort );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          fort = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$93 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values2 = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values2 );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$93, thread );
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
    file_hash_table.finalize_file_hash_table( fht );
    return fht_path;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 46019L)
  public static SubLObject nart_sister_to_gaf_ratio(final SubLObject nart)
  {
    return Numbers.integerDivide( kb_indexing.num_function_extent_index( cycl_utilities.nat_functor( nart ) ), kb_indexing.num_gaf_arg_index( nart, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 46162L)
  public static SubLObject dont_want_to_generate_this_oneP(final SubLObject fort)
  {
    return makeBoolean( NIL != term.reified_skolem_fnP( fort ) || NIL != isa.isa_in_any_mtP( fort, $const153$LogicalFieldAttribute ) || ( NIL != nart_handles.nart_p( fort ) && ( NIL != term.skolem_nartP( fort )
        || NIL != nart_non_wffP( fort ) ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 46875L)
  public static SubLObject nart_non_wffP(final SubLObject nart)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject is_wffP = NIL;
    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$relevant_mt_function$.bind( $sym154$RELEVANT_MT_IS_EVERYTHING, thread );
      mt_relevance_macros.$mt$.bind( $const155$EverythingPSC, thread );
      is_wffP = wff.el_wft_fastP( narts_high.nart_el_formula( nart ), UNPROVIDED );
    }
    finally
    {
      mt_relevance_macros.$mt$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == is_wffP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 47037L)
  public static SubLObject nl_generation_cache_lookup(final SubLObject fort, SubLObject fbc, SubLObject warn_on_errorP)
  {
    if( fbc == UNPROVIDED )
    {
      fbc = $english_generation_fort_cache$.getGlobalValue();
    }
    if( warn_on_errorP == UNPROVIDED )
    {
      warn_on_errorP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject msg = NIL;
    SubLObject info = NIL;
    if( NIL == nl_generate_cache_exceptionP( fort ) && NIL != $use_generic_singular_nl_generation_fort_cacheP$.getDynamicValue( thread ) )
    {
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            assert NIL != forts.fort_p( fort ) : fort;
            if( fbc.eql( $english_generation_fort_cache$.getGlobalValue() ) && NIL == file_backed_cache.file_backed_cache_p( fbc ) )
            {
              initialize_nl_generation_caches();
              fbc = $english_generation_fort_cache$.getGlobalValue();
            }
            assert NIL != file_backed_cache.file_backed_cache_p( fbc ) : fbc;
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
      if( NIL != msg )
      {
        if( NIL != warn_on_errorP )
        {
          Errors.warn( msg );
        }
        return Values.values( NIL, NIL );
      }
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            info = file_backed_cache.file_backed_cache_lookup( fort, fbc, info, T );
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
      if( NIL != msg && NIL != warn_on_errorP )
      {
        Errors.warn( msg );
      }
    }
    if( NIL != list_utilities.proper_list_p( info ) && NIL != list_utilities.lengthE( info, FOUR_INTEGER, UNPROVIDED ) && NIL != cycl_string.cycl_string_p( info.first() ) && NIL == cycl_string.cycl_string_equal( $str94$,
        info.first() ) )
    {
      return subl_promotions.values_list( info );
    }
    if( info.isCons() && NIL != cycl_string.cycl_string_p( info.first() ) && NIL == cycl_string.cycl_string_equal( $str94$, info.first() ) )
    {
      return Values.values( info.first(), info.rest(), NIL, NIL );
    }
    return Values.values( NIL, NIL, NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 49062L)
  public static SubLObject nl_generation_cache_enter(final SubLObject fort, final SubLObject string, final SubLObject nl_pred, SubLObject demerits, SubLObject justification)
  {
    if( demerits == UNPROVIDED )
    {
      demerits = NIL;
    }
    if( justification == UNPROVIDED )
    {
      justification = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    assert NIL != cycl_string.cycl_string_p( string ) : string;
    if( NIL != nl_pred && !assertionsDisabledInClass && NIL == forts.fort_p( nl_pred ) )
    {
      throw new AssertionError( nl_pred );
    }
    if( NIL == $english_generation_fort_cache$.getGlobalValue() )
    {
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            initialize_nl_generation_caches();
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
      if( NIL != msg )
      {
        return Values.values( NIL, NIL );
      }
    }
    return nl_generation_cache_enter_low( fort, string, nl_pred, demerits, justification, $english_generation_fort_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 50318L)
  public static SubLObject note_nl_generate_cache_exception(final SubLObject fort)
  {
    set.set_add( fort, $nl_generation_cache_exceptions$.getGlobalValue() );
    return fort;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 50439L)
  public static SubLObject nl_generate_cache_exceptionP(final SubLObject fort)
  {
    return set.set_memberP( fort, $nl_generation_cache_exceptions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 50553L)
  public static SubLObject clear_nl_generation_cache_exceptions()
  {
    return set.clear_set( $nl_generation_cache_exceptions$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 50664L)
  public static SubLObject nl_generation_cache_clear(final SubLObject fort)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != forts.fort_p( fort ) : fort;
    SubLObject fbc = $english_generation_fort_cache$.getGlobalValue();
    if( NIL == $english_generation_fort_cache$.getGlobalValue() )
    {
      SubLObject msg = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym135$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            initialize_nl_generation_caches();
            fbc = $english_generation_fort_cache$.getGlobalValue();
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
      if( NIL != msg )
      {
        return Values.values( NIL, NIL );
      }
    }
    if( NIL == file_backed_cache.file_backed_cache_p( fbc ) )
    {
      return NIL;
    }
    note_nl_generate_cache_exception( fort );
    return nl_generation_cache_enter_low( fort, NIL, NIL, NIL, NIL, fbc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 51263L)
  public static SubLObject nl_generation_cache_enter_low(final SubLObject fort, final SubLObject string, final SubLObject nl_pred, final SubLObject demerits, final SubLObject justification, final SubLObject fbc)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject data = ( NIL != $rich_nl_generation_cache_styleP$.getDynamicValue( thread ) ) ? ConsesLow.list( string, nl_pred, demerits, justification ) : ConsesLow.cons( string, nl_pred );
    return file_backed_cache.file_backed_cache_enter( fort, data, fbc );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 53863L)
  public static SubLObject internal_test_nl_generation_of_collection_instances(final SubLObject collection, SubLObject max_number)
  {
    if( max_number == UNPROVIDED )
    {
      max_number = $int28$10000;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    final SubLObject _prev_bind_0 = pph_vars.$pph_use_bulleted_listsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = pph_vars.$pph_replace_bulleted_list_tagsP$.currentBinding( thread );
    final SubLObject _prev_bind_3 = pph_vars.$paraphrase_precision$.currentBinding( thread );
    final SubLObject _prev_bind_4 = pph_vars.$pph_terse_mt_scopeP$.currentBinding( thread );
    final SubLObject _prev_bind_5 = pph_vars.$pph_maximize_linksP$.currentBinding( thread );
    final SubLObject _prev_bind_6 = pph_vars.$pph_link_arg0P$.currentBinding( thread );
    final SubLObject _prev_bind_7 = pph_vars.$pph_use_smart_variable_replacementP$.currentBinding( thread );
    final SubLObject _prev_bind_8 = pph_vars.$pph_demerit_cutoff$.currentBinding( thread );
    final SubLObject _prev_bind_9 = pph_vars.$pph_use_title_capitalizationP$.currentBinding( thread );
    final SubLObject _prev_bind_10 = pph_vars.$pph_use_indexical_datesP$.currentBinding( thread );
    final SubLObject _prev_bind_11 = pph_vars.$pph_addressee$.currentBinding( thread );
    final SubLObject _prev_bind_12 = pph_vars.$pph_speaker$.currentBinding( thread );
    try
    {
      pph_vars.$pph_use_bulleted_listsP$.bind( T, thread );
      pph_vars.$pph_replace_bulleted_list_tagsP$.bind( NIL, thread );
      pph_vars.$paraphrase_precision$.bind( NIL, thread );
      pph_vars.$pph_terse_mt_scopeP$.bind( T, thread );
      pph_vars.$pph_maximize_linksP$.bind( T, thread );
      pph_vars.$pph_link_arg0P$.bind( T, thread );
      pph_vars.$pph_use_smart_variable_replacementP$.bind( T, thread );
      pph_vars.$pph_demerit_cutoff$.bind( number_utilities.positive_infinity(), thread );
      pph_vars.$pph_use_title_capitalizationP$.bind( NIL, thread );
      pph_vars.$pph_use_indexical_datesP$.bind( NIL, thread );
      pph_vars.$pph_addressee$.bind( $kw159$UNKNOWN, thread );
      pph_vars.$pph_speaker$.bind( $kw159$UNKNOWN, thread );
      result = api_widgets.get_example_instances_as_renderings_new( collection, max_number, $const155$EverythingPSC, $kw160$IMMEDIATE_INSTANTIATIONS, $kw161$UPWARD_CLOSURE, T, $kw162$NONE,
          $const163$TerrorismParaphraseMt, $kw164$DEFAULT );
    }
    finally
    {
      pph_vars.$pph_speaker$.rebind( _prev_bind_12, thread );
      pph_vars.$pph_addressee$.rebind( _prev_bind_11, thread );
      pph_vars.$pph_use_indexical_datesP$.rebind( _prev_bind_10, thread );
      pph_vars.$pph_use_title_capitalizationP$.rebind( _prev_bind_9, thread );
      pph_vars.$pph_demerit_cutoff$.rebind( _prev_bind_8, thread );
      pph_vars.$pph_use_smart_variable_replacementP$.rebind( _prev_bind_7, thread );
      pph_vars.$pph_link_arg0P$.rebind( _prev_bind_6, thread );
      pph_vars.$pph_maximize_linksP$.rebind( _prev_bind_5, thread );
      pph_vars.$pph_terse_mt_scopeP$.rebind( _prev_bind_4, thread );
      pph_vars.$paraphrase_precision$.rebind( _prev_bind_3, thread );
      pph_vars.$pph_replace_bulleted_list_tagsP$.rebind( _prev_bind_2, thread );
      pph_vars.$pph_use_bulleted_listsP$.rebind( _prev_bind_0, thread );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 53863L)
  public static SubLObject test_nl_generation_of_collection(final SubLObject v_const, SubLObject max_number)
  {
    if( max_number == UNPROVIDED )
    {
      max_number = $int28$10000;
    }
    final SubLObject before_cache_lookup_count = pph_methods.select_string_method_count( $sym165$NL_GENERATION_CACHE_METHOD );
    final SubLObject result = internal_test_nl_generation_of_collection_instances( v_const, max_number );
    final SubLObject after_cache_lookup_count = pph_methods.select_string_method_count( $sym165$NL_GENERATION_CACHE_METHOD );
    final SubLObject new_lookup_count = Numbers.subtract( after_cache_lookup_count, before_cache_lookup_count );
    final SubLObject result_count = Sequences.length( result );
    final SubLObject ratio = ( NIL != result ) ? Numbers.divide( new_lookup_count, result_count ) : MINUS_ONE_INTEGER;
    return ratio;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nl-generation-fort-cache.lisp", position = 53863L)
  public static SubLObject test_nl_generation_of_collection_instances(SubLObject max_count, SubLObject max_instances)
  {
    if( max_count == UNPROVIDED )
    {
      max_count = ZERO_INTEGER;
    }
    if( max_instances == UNPROVIDED )
    {
      max_instances = TEN_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject bad_forts = NIL;
    final SubLObject result = NIL;
    SubLObject doneP = NIL;
    SubLObject gc_count = ZERO_INTEGER;
    SubLObject cur_count = ZERO_INTEGER;
    final SubLObject _prev_bind_0 = pph_vars.$pph_track_discourse_referentsP$.currentBinding( thread );
    try
    {
      pph_vars.$pph_track_discourse_referentsP$.bind( NIL, thread );
      final SubLObject idx = constant_handles.do_constants_table();
      final SubLObject mess = $str166$Finding_collections_that_don_t_us;
      final SubLObject total = id_index.id_index_count( idx );
      SubLObject sofar = ZERO_INTEGER;
      assert NIL != Types.stringp( mess ) : mess;
      final SubLObject _prev_bind_0_$96 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
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
          final SubLObject idx_$97 = idx;
          if( NIL == id_index.id_index_objects_empty_p( idx_$97, $kw95$SKIP ) )
          {
            final SubLObject idx_$98 = idx_$97;
            if( NIL == id_index.id_index_dense_objects_empty_p( idx_$98, $kw95$SKIP ) )
            {
              final SubLObject vector_var = id_index.id_index_dense_objects( idx_$98 );
              final SubLObject backwardP_var = NIL;
              final SubLObject length = Sequences.length( vector_var );
              SubLObject current;
              final SubLObject datum = current = ( NIL != backwardP_var ) ? ConsesLow.list( Numbers.subtract( length, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER )
                  : ConsesLow.list( ZERO_INTEGER, length, ONE_INTEGER );
              SubLObject start = NIL;
              SubLObject end = NIL;
              SubLObject delta = NIL;
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
              start = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
              end = current.first();
              current = current.rest();
              cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list96 );
              delta = current.first();
              current = current.rest();
              if( NIL == current )
              {
                if( NIL == doneP )
                {
                  SubLObject end_var;
                  SubLObject id;
                  SubLObject v_const;
                  SubLObject new_lookup_counts_per_result;
                  for( end_var = end, id = NIL, id = start; NIL == doneP && NIL == subl_macros.do_numbers_endtest( id, delta, end_var ); id = Numbers.add( id, delta ) )
                  {
                    v_const = Vectors.aref( vector_var, id );
                    if( NIL == id_index.id_index_tombstone_p( v_const ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
                    {
                      if( NIL != id_index.id_index_tombstone_p( v_const ) )
                      {
                        v_const = $kw95$SKIP;
                      }
                      if( NIL != fort_types_interface.collection_p( v_const ) && NIL == dont_want_to_generate_this_oneP( v_const ) )
                      {
                        if( ZERO_INTEGER.numG( Sequences.length( result ) ) )
                        {
                          gc_count = Numbers.add( gc_count, ONE_INTEGER );
                          if( gc_count.numG( $int168$50 ) )
                          {
                            gc_count = ZERO_INTEGER;
                          }
                        }
                        if( max_count.numG( ZERO_INTEGER ) )
                        {
                          cur_count = Numbers.add( cur_count, ONE_INTEGER );
                          if( cur_count.numGE( max_count ) )
                          {
                            doneP = T;
                          }
                        }
                        new_lookup_counts_per_result = test_nl_generation_of_collection( v_const, max_instances );
                        PrintLow.format( T, $str169$Testing___A__generate_cache_ratio, v_const, new_lookup_counts_per_result );
                        if( !new_lookup_counts_per_result.numL( ZERO_INTEGER ) )
                        {
                          if( new_lookup_counts_per_result.numG( $float170$1_2 ) )
                          {
                            PrintLow.format( T, $str171$__Extra_cache_hits_for__S___S_per, v_const, new_lookup_counts_per_result );
                            bad_forts = ConsesLow.cons( v_const, bad_forts );
                          }
                          else if( new_lookup_counts_per_result.numL( $float172$0_8 ) )
                          {
                            PrintLow.format( T, $str173$__Insufficient_cache_hits_for__S_, v_const, new_lookup_counts_per_result );
                            bad_forts = ConsesLow.cons( v_const, bad_forts );
                          }
                        }
                      }
                      sofar = Numbers.add( sofar, ONE_INTEGER );
                      utilities_macros.note_percent_progress( sofar, total );
                    }
                  }
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( datum, $list96 );
              }
            }
            final SubLObject idx_$99 = idx_$97;
            if( NIL == id_index.id_index_sparse_objects_empty_p( idx_$99 ) || NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) )
            {
              final SubLObject sparse = id_index.id_index_sparse_objects( idx_$99 );
              SubLObject id2 = id_index.id_index_sparse_id_threshold( idx_$99 );
              final SubLObject end_id = id_index.id_index_next_id( idx_$99 );
              final SubLObject v_default = ( NIL != id_index.id_index_skip_tombstones_p( $kw95$SKIP ) ) ? NIL : $kw95$SKIP;
              while ( id2.numL( end_id ) && NIL == doneP)
              {
                final SubLObject v_const2 = Hashtables.gethash_without_values( id2, sparse, v_default );
                if( NIL == id_index.id_index_skip_tombstones_p( $kw95$SKIP ) || NIL == id_index.id_index_tombstone_p( v_const2 ) )
                {
                  if( NIL != fort_types_interface.collection_p( v_const2 ) && NIL == dont_want_to_generate_this_oneP( v_const2 ) )
                  {
                    if( ZERO_INTEGER.numG( Sequences.length( result ) ) )
                    {
                      gc_count = Numbers.add( gc_count, ONE_INTEGER );
                      if( gc_count.numG( $int168$50 ) )
                      {
                        gc_count = ZERO_INTEGER;
                      }
                    }
                    if( max_count.numG( ZERO_INTEGER ) )
                    {
                      cur_count = Numbers.add( cur_count, ONE_INTEGER );
                      if( cur_count.numGE( max_count ) )
                      {
                        doneP = T;
                      }
                    }
                    final SubLObject new_lookup_counts_per_result2 = test_nl_generation_of_collection( v_const2, max_instances );
                    PrintLow.format( T, $str169$Testing___A__generate_cache_ratio, v_const2, new_lookup_counts_per_result2 );
                    if( !new_lookup_counts_per_result2.numL( ZERO_INTEGER ) )
                    {
                      if( new_lookup_counts_per_result2.numG( $float170$1_2 ) )
                      {
                        PrintLow.format( T, $str171$__Extra_cache_hits_for__S___S_per, v_const2, new_lookup_counts_per_result2 );
                        bad_forts = ConsesLow.cons( v_const2, bad_forts );
                      }
                      else if( new_lookup_counts_per_result2.numL( $float172$0_8 ) )
                      {
                        PrintLow.format( T, $str173$__Insufficient_cache_hits_for__S_, v_const2, new_lookup_counts_per_result2 );
                        bad_forts = ConsesLow.cons( v_const2, bad_forts );
                      }
                    }
                  }
                  sofar = Numbers.add( sofar, ONE_INTEGER );
                  utilities_macros.note_percent_progress( sofar, total );
                }
                id2 = Numbers.add( id2, ONE_INTEGER );
              }
            }
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$97 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$97, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_4, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_3, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_2, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_0_$96, thread );
      }
    }
    finally
    {
      pph_vars.$pph_track_discourse_referentsP$.rebind( _prev_bind_0, thread );
    }
    return bad_forts;
  }

  public static SubLObject declare_nl_generation_fort_cache_file()
  {
    SubLFiles.declareMacro( me, "with_default_nl_generation_cache_file_path", "WITH-DEFAULT-NL-GENERATION-CACHE-FILE-PATH" );
    SubLFiles.declareFunction( me, "get_english_generation_fort_cache", "GET-ENGLISH-GENERATION-FORT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "set_temporary_english_generation_fort_cache", "SET-TEMPORARY-ENGLISH-GENERATION-FORT-CACHE", 1, 0, false );
    SubLFiles.declareFunction( me, "restore_english_generation_fort_cache", "RESTORE-ENGLISH-GENERATION-FORT-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "get_default_nl_generation_cache_file_path", "GET-DEFAULT-NL-GENERATION-CACHE-FILE-PATH", 0, 1, false );
    SubLFiles.declareFunction( me, "get_latest_nl_generation_cache_file_path", "GET-LATEST-NL-GENERATION-CACHE-FILE-PATH", 0, 0, false );
    SubLFiles.declareFunction( me, "get_nl_generation_cache_file_path_internal", "GET-NL-GENERATION-CACHE-FILE-PATH-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "enable_nl_generation_cache_memory_mapping", "ENABLE-NL-GENERATION-CACHE-MEMORY-MAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "disable_nl_generation_cache_memory_mapping", "DISABLE-NL-GENERATION-CACHE-MEMORY-MAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_memory_mappedP", "NL-GENERATION-CACHE-MEMORY-MAPPED?", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_nl_generation_caches", "INITIALIZE-NL-GENERATION-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "ensure_nl_generation_fort_cache_is_best_available", "ENSURE-NL-GENERATION-FORT-CACHE-IS-BEST-AVAILABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "reconnect_english_generation_fort_cache", "RECONNECT-ENGLISH-GENERATION-FORT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "english_generation_fort_cache_for_current_kbP", "ENGLISH-GENERATION-FORT-CACHE-FOR-CURRENT-KB?", 0, 0, false );
    SubLFiles.declareFunction( me, "english_generation_fort_cache_most_recent_availableP", "ENGLISH-GENERATION-FORT-CACHE-MOST-RECENT-AVAILABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "reset_nl_generation_caches", "RESET-NL-GENERATION-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_fort_cache_nl_preds", "NL-GENERATION-FORT-CACHE-NL-PREDS", 0, 1, false );
    SubLFiles.declareFunction( me, "nl_generation_fort_cache_paraphrase_mt", "NL-GENERATION-FORT-CACHE-PARAPHRASE-MT", 0, 1, false );
    SubLFiles.declareFunction( me, "default_nl_generation_fort_cache_paraphrase_mt", "DEFAULT-NL-GENERATION-FORT-CACHE-PARAPHRASE-MT", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_fort_generation_task_success_code", "NL-FORT-GENERATION-TASK-SUCCESS-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_fort_generation_task_failure_code", "NL-FORT-GENERATION-TASK-FAILURE-CODE", 0, 0, false );
    SubLFiles.declareFunction( me, "create_cached_nl_generation_for_all_forts", "CREATE-CACHED-NL-GENERATION-FOR-ALL-FORTS", 0, 4, false );
    SubLFiles.declareFunction( me, "create_nl_generation_fht_from_data", "CREATE-NL-GENERATION-FHT-FROM-DATA", 0, 4, false );
    SubLFiles.declareFunction( me, "create_filtered_nl_generation_fht_from_data", "CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA", 1, 4, false );
    SubLFiles.declareFunction( me, "find_or_create_nl_generation_fort_cache_working_directory", "FIND-OR-CREATE-NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_fort_cache_subdirectory", "NL-GENERATION-FORT-CACHE-SUBDIRECTORY", 2, 2, false );
    SubLFiles.declareFunction( me, "assign_next_fort_paraphrase_cache_generation_task_and_wait_for_result", "ASSIGN-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK-AND-WAIT-FOR-RESULT", 0, 0, false );
    SubLFiles.declareFunction( me, "note_nl_fort_generation_task_failed", "NOTE-NL-FORT-GENERATION-TASK-FAILED", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_fort_generation_task_failedP", "NL-FORT-GENERATION-TASK-FAILED?", 1, 0, false );
    SubLFiles.declareFunction( me, "wake_up_fort_paraphrase_cache_taskmaster", "WAKE-UP-FORT-PARAPHRASE-CACHE-TASKMASTER", 1, 0, false );
    SubLFiles.declareFunction( me, "do_next_fort_paraphrase_cache_generation_task", "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK", 0, 0, false );
    SubLFiles.declareFunction( me, "do_fort_paraphrase_cache_generation_for_directory", "DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY", 3, 0, false );
    SubLFiles.declareFunction( me, "find_nl_generation_assignment_directory", "FIND-NL-GENERATION-ASSIGNMENT-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "recopy_nl_generation_fort_cache_results", "RECOPY-NL-GENERATION-FORT-CACHE-RESULTS", 2, 0, false );
    SubLFiles.declareFunction( me, "do_fort_paraphrase_cache_generation_for_directory_internal", "DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "verify_cached_paraphrases", "VERIFY-CACHED-PARAPHRASES", 0, 2, false );
    SubLFiles.declareFunction( me, "verify_cached_paraphrase", "VERIFY-CACHED-PARAPHRASE", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_fort_cache_data_generatedP", "NL-GENERATION-FORT-CACHE-DATA-GENERATED?", 0, 0, false );
    SubLFiles.declareFunction( me, "trim_pph_memoization_state_caches", "TRIM-PPH-MEMOIZATION-STATE-CACHES", 0, 1, false );
    SubLFiles.declareFunction( me, "print_nl_generation_cache_times", "PRINT-NL-GENERATION-CACHE-TIMES", 7, 0, false );
    SubLFiles.declareFunction( me, "generate_nl_generation_cache_time_plots", "GENERATE-NL-GENERATION-CACHE-TIME-PLOTS", 2, 0, false );
    SubLFiles.declareFunction( me, "stitch_together_nl_generation_cache_time_plots", "STITCH-TOGETHER-NL-GENERATION-CACHE-TIME-PLOTS", 0, 0, false );
    SubLFiles.declareFunction( me, "nanoseconds_per_second", "NANOSECONDS-PER-SECOND", 0, 0, false );
    SubLFiles.declareFunction( me, "paraphrase_fort_for_cache", "PARAPHRASE-FORT-FOR-CACHE", 1, 2, false );
    SubLFiles.declareFunction( me, "nl_generation_fort_cache_stale_for_fortP", "NL-GENERATION-FORT-CACHE-STALE-FOR-FORT?", 1, 0, false );
    SubLFiles.declareFunction( me, "estimate_nl_generation_cache_stale_percentage", "ESTIMATE-NL-GENERATION-CACHE-STALE-PERCENTAGE", 0, 3, false );
    SubLFiles.declareFunction( me, "verify_cached_nl_generation_for_all_forts", "VERIFY-CACHED-NL-GENERATION-FOR-ALL-FORTS", 0, 1, false );
    SubLFiles.declareFunction( me, "update_cached_nl_generation_for_all_forts", "UPDATE-CACHED-NL-GENERATION-FOR-ALL-FORTS", 1, 2, false );
    SubLFiles.declareFunction( me, "nart_sister_to_gaf_ratio", "NART-SISTER-TO-GAF-RATIO", 1, 0, false );
    SubLFiles.declareFunction( me, "dont_want_to_generate_this_oneP", "DONT-WANT-TO-GENERATE-THIS-ONE?", 1, 0, false );
    SubLFiles.declareFunction( me, "nart_non_wffP", "NART-NON-WFF?", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_lookup", "NL-GENERATION-CACHE-LOOKUP", 1, 2, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_enter", "NL-GENERATION-CACHE-ENTER", 3, 2, false );
    SubLFiles.declareFunction( me, "note_nl_generate_cache_exception", "NOTE-NL-GENERATE-CACHE-EXCEPTION", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_generate_cache_exceptionP", "NL-GENERATE-CACHE-EXCEPTION?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_nl_generation_cache_exceptions", "CLEAR-NL-GENERATION-CACHE-EXCEPTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_clear", "NL-GENERATION-CACHE-CLEAR", 1, 0, false );
    SubLFiles.declareFunction( me, "nl_generation_cache_enter_low", "NL-GENERATION-CACHE-ENTER-LOW", 6, 0, false );
    SubLFiles.declareFunction( me, "internal_test_nl_generation_of_collection_instances", "INTERNAL-TEST-NL-GENERATION-OF-COLLECTION-INSTANCES", 1, 1, false );
    SubLFiles.declareFunction( me, "test_nl_generation_of_collection", "TEST-NL-GENERATION-OF-COLLECTION", 1, 1, false );
    SubLFiles.declareFunction( me, "test_nl_generation_of_collection_instances", "TEST-NL-GENERATION-OF-COLLECTION-INSTANCES", 0, 2, false );
    return NIL;
  }

  public static SubLObject init_nl_generation_fort_cache_file()
  {
    $english_generation_fort_cache$ = SubLFiles.deflexical( "*ENGLISH-GENERATION-FORT-CACHE*", ( maybeDefault( $sym0$_ENGLISH_GENERATION_FORT_CACHE_, $english_generation_fort_cache$, NIL ) ) );
    $english_generation_fht_name$ = SubLFiles.defparameter( "*ENGLISH-GENERATION-FHT-NAME*", NIL );
    $use_generic_singular_nl_generation_fort_cacheP$ = SubLFiles.defparameter( "*USE-GENERIC-SINGULAR-NL-GENERATION-FORT-CACHE?*", T );
    $english_generation_base_file_name$ = SubLFiles.deflexical( "*ENGLISH-GENERATION-BASE-FILE-NAME*", red_infrastructure_macros.red_def_helper( $list1.isSymbol() ? Symbols.symbol_value( $list1 ) : $list1,
        $sym2$_ENGLISH_GENERATION_BASE_FILE_NAME_, $str3$generic_singular_nl_generation_fo.isSymbol() ? Symbols.symbol_value( $str3$generic_singular_nl_generation_fo ) : $str3$generic_singular_nl_generation_fo,
        $kw4$LEXICAL, UNPROVIDED ) );
    $nl_generation_fht_lock$ = SubLFiles.deflexical( "*NL-GENERATION-FHT-LOCK*", Locks.make_lock( $str5$nl_generation_fht_lock ) );
    $max_kbs_backward_to_look_for_generation_cache$ = SubLFiles.deflexical( "*MAX-KBS-BACKWARD-TO-LOOK-FOR-GENERATION-CACHE*", FIVE_INTEGER );
    $preload_nl_generation_cachesP$ = SubLFiles.deflexical( "*PRELOAD-NL-GENERATION-CACHES?*", NIL );
    $nl_generation_fort_cache_generator_timestamp$ = SubLFiles.deflexical( "*NL-GENERATION-FORT-CACHE-GENERATOR-TIMESTAMP*", numeric_date_utilities.timestamp( UNPROVIDED, UNPROVIDED ) );
    $nl_generation_fort_cache_paraphrase_mt$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-PARAPHRASE-MT*", $kw26$UNINITIALIZED );
    $nl_generation_fort_cache_nl_preds$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-NL-PREDS*", $list24 );
    $nl_generation_fort_cache_break_on_timeoutP$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-BREAK-ON-TIMEOUT?*", NIL );
    $nl_generation_fort_cache_retry_on_timeoutP$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-RETRY-ON-TIMEOUT?*", T );
    $nl_generation_fort_cache_timeout$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-TIMEOUT*", $int27$60 );
    $nl_generation_fort_cache_generate_plotsP$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-GENERATE-PLOTS?*", NIL );
    $nl_generation_fort_cache_median_times$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-MEDIAN-TIMES*", NIL );
    $nl_generation_fort_cache_total_times$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-TOTAL-TIMES*", NIL );
    $nl_generation_fort_cache_cpu_times$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-CPU-TIMES*", NIL );
    $nl_generation_fort_cache_swap_times$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-SWAP-TIMES*", NIL );
    $nl_generation_fort_cache_failed_fort_counts$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-FAILED-FORT-COUNTS*", NIL );
    $nl_generation_fort_cache_gc_times$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-GC-TIMES*", NIL );
    $nl_generation_fort_cache_working_directory$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-WORKING-DIRECTORY*", NIL );
    $nl_generation_fort_cache_batch_size$ = SubLFiles.deflexical( "*NL-GENERATION-FORT-CACHE-BATCH-SIZE*", $int21$100 );
    $nl_generation_fort_cache_assignment_size$ = SubLFiles.deflexical( "*NL-GENERATION-FORT-CACHE-ASSIGNMENT-SIZE*", $int28$10000 );
    $nl_fort_generation_task$ = SubLFiles.defparameter( "*NL-FORT-GENERATION-TASK*", NIL );
    $nl_fort_generation_results_queue$ = SubLFiles.deflexical( "*NL-FORT-GENERATION-RESULTS-QUEUE*", process_utilities.new_ipc_queue( $str29$NL_FORT_Generation_Results_Queue ) );
    $rich_nl_generation_cache_styleP$ = SubLFiles.defparameter( "*RICH-NL-GENERATION-CACHE-STYLE?*", T );
    $nl_generation_fort_cache_use_forked_processesP$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-USE-FORKED-PROCESSES?*", NIL );
    $failed_nl_fort_generation_tasks$ = SubLFiles.deflexical( "*FAILED-NL-FORT-GENERATION-TASKS*", set.new_set( Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
    $nl_generation_fort_cache_retry_failed_tasksP$ = SubLFiles.defparameter( "*NL-GENERATION-FORT-CACHE-RETRY-FAILED-TASKS?*", NIL );
    $nanoseconds_per_second$ = SubLFiles.defconstant( "*NANOSECONDS-PER-SECOND*", $int134$1000000000 );
    $nart_max_sister_to_gaf_ratio$ = SubLFiles.defparameter( "*NART-MAX-SISTER-TO-GAF-RATIO*", number_utilities.positive_infinity() );
    $nl_generation_cache_exceptions$ = SubLFiles.deflexical( "*NL-GENERATION-CACHE-EXCEPTIONS*", maybeDefault( $sym158$_NL_GENERATION_CACHE_EXCEPTIONS_, $nl_generation_cache_exceptions$, () -> ( set.new_set( Symbols
        .symbol_function( EQL ), UNPROVIDED ) ) ) );
    return NIL;
  }

  public static SubLObject setup_nl_generation_fort_cache_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_ENGLISH_GENERATION_FORT_CACHE_ );
    access_macros.register_macro_helper( $sym17$GET_ENGLISH_GENERATION_FORT_CACHE, $sym18$WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH );
    access_macros.register_macro_helper( $sym15$SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE, $sym18$WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH );
    access_macros.register_macro_helper( $sym16$RESTORE_ENGLISH_GENERATION_FORT_CACHE, $sym18$WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH );
    utilities_macros.note_funcall_helper_function( $sym20$INITIALIZE_NL_GENERATION_CACHES );
    access_macros.register_external_symbol( $sym39$CREATE_FILTERED_NL_GENERATION_FHT_FROM_DATA );
    utilities_macros.note_funcall_helper_function( $sym69$WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER );
    utilities_macros.note_funcall_helper_function( $sym68$DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK );
    utilities_macros.note_funcall_helper_function( $sym81$DO_FORT_PARAPHRASE_CACHE_GENERATION_FOR_DIRECTORY );
    subl_macro_promotions.declare_defglobal( $sym158$_NL_GENERATION_CACHE_EXCEPTIONS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nl_generation_fort_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nl_generation_fort_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nl_generation_fort_cache_file();
  }
  static
  {
    me = new nl_generation_fort_cache();
    $english_generation_fort_cache$ = null;
    $english_generation_fht_name$ = null;
    $use_generic_singular_nl_generation_fort_cacheP$ = null;
    $english_generation_base_file_name$ = null;
    $nl_generation_fht_lock$ = null;
    $max_kbs_backward_to_look_for_generation_cache$ = null;
    $preload_nl_generation_cachesP$ = null;
    $nl_generation_fort_cache_generator_timestamp$ = null;
    $nl_generation_fort_cache_paraphrase_mt$ = null;
    $nl_generation_fort_cache_nl_preds$ = null;
    $nl_generation_fort_cache_break_on_timeoutP$ = null;
    $nl_generation_fort_cache_retry_on_timeoutP$ = null;
    $nl_generation_fort_cache_timeout$ = null;
    $nl_generation_fort_cache_generate_plotsP$ = null;
    $nl_generation_fort_cache_median_times$ = null;
    $nl_generation_fort_cache_total_times$ = null;
    $nl_generation_fort_cache_cpu_times$ = null;
    $nl_generation_fort_cache_swap_times$ = null;
    $nl_generation_fort_cache_failed_fort_counts$ = null;
    $nl_generation_fort_cache_gc_times$ = null;
    $nl_generation_fort_cache_working_directory$ = null;
    $nl_generation_fort_cache_batch_size$ = null;
    $nl_generation_fort_cache_assignment_size$ = null;
    $nl_fort_generation_task$ = null;
    $nl_fort_generation_results_queue$ = null;
    $rich_nl_generation_cache_styleP$ = null;
    $nl_generation_fort_cache_use_forked_processesP$ = null;
    $failed_nl_fort_generation_tasks$ = null;
    $nl_generation_fort_cache_retry_failed_tasksP$ = null;
    $nanoseconds_per_second$ = null;
    $nart_max_sister_to_gaf_ratio$ = null;
    $nl_generation_cache_exceptions$ = null;
    $sym0$_ENGLISH_GENERATION_FORT_CACHE_ = makeSymbol( "*ENGLISH-GENERATION-FORT-CACHE*" );
    $list1 = ConsesLow.list( makeString( "application.file-backed-cache.generic-singular-nl-generation-fort-cache-file-name" ) );
    $sym2$_ENGLISH_GENERATION_BASE_FILE_NAME_ = makeSymbol( "*ENGLISH-GENERATION-BASE-FILE-NAME*" );
    $str3$generic_singular_nl_generation_fo = makeString( "generic-singular-nl-generation-fort-cache.fht" );
    $kw4$LEXICAL = makeKeyword( "LEXICAL" );
    $str5$nl_generation_fht_lock = makeString( "nl-generation-fht-lock" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "FILENAME" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym7$CACHE = makeUninternedSymbol( "CACHE" );
    $sym8$BASE_FILE_NAME = makeUninternedSymbol( "BASE-FILE-NAME" );
    $sym9$CLET = makeSymbol( "CLET" );
    $sym10$_ENGLISH_GENERATION_FHT_NAME_ = makeSymbol( "*ENGLISH-GENERATION-FHT-NAME*" );
    $list11 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-ENGLISH-GENERATION-FORT-CACHE" ) ) );
    $list12 = ConsesLow.list( makeSymbol( "*ENGLISH-GENERATION-BASE-FILE-NAME*" ) );
    $sym13$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym14$PROGN = makeSymbol( "PROGN" );
    $sym15$SET_TEMPORARY_ENGLISH_GENERATION_FORT_CACHE = makeSymbol( "SET-TEMPORARY-ENGLISH-GENERATION-FORT-CACHE" );
    $sym16$RESTORE_ENGLISH_GENERATION_FORT_CACHE = makeSymbol( "RESTORE-ENGLISH-GENERATION-FORT-CACHE" );
    $sym17$GET_ENGLISH_GENERATION_FORT_CACHE = makeSymbol( "GET-ENGLISH-GENERATION-FORT-CACHE" );
    $sym18$WITH_DEFAULT_NL_GENERATION_CACHE_FILE_PATH = makeSymbol( "WITH-DEFAULT-NL-GENERATION-CACHE-FILE-PATH" );
    $str19$_ = makeString( "/" );
    $sym20$INITIALIZE_NL_GENERATION_CACHES = makeSymbol( "INITIALIZE-NL-GENERATION-CACHES" );
    $int21$100 = makeInteger( 100 );
    $kw22$HL_EXTERNALIZED_KEYS = makeKeyword( "HL-EXTERNALIZED-KEYS" );
    $kw23$NL_PREDS = makeKeyword( "NL-PREDS" );
    $list24 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "nonPlural-Generic" ) ) );
    $kw25$LANGUAGE_MT = makeKeyword( "LANGUAGE-MT" );
    $kw26$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $int27$60 = makeInteger( 60 );
    $int28$10000 = makeInteger( 10000 );
    $str29$NL_FORT_Generation_Results_Queue = makeString( "NL FORT Generation Results Queue" );
    $int30$255 = makeInteger( 255 );
    $str31$tmp_ = makeString( "tmp/" );
    $str32$Gen_template_store_is_stale_ = makeString( "Gen-template store is stale." );
    $str33$Generating_nl_cache_to_file___A = makeString( "Generating nl cache to file: ~A" );
    $sym34$HLMT_P = makeSymbol( "HLMT-P" );
    $str35$fort_count_cfasl = makeString( "fort-count.cfasl" );
    $str36$Generating_FORT_paraphrases__ = makeString( "Generating FORT paraphrases (" );
    $str37$____ = makeString( ")..." );
    $str38$_S_already_exists_ = makeString( "~S already exists." );
    $sym39$CREATE_FILTERED_NL_GENERATION_FHT_FROM_DATA = makeSymbol( "CREATE-FILTERED-NL-GENERATION-FHT-FROM-DATA" );
    $str40$Cannot_filter_without_a_set__got_ = makeString( "Cannot filter without a set, got ~A." );
    $str41$Compiling_file_hashtable_from_par = makeString( "Compiling file hashtable from paraphrase data..." );
    $sym42$DIRECTORY_P = makeSymbol( "DIRECTORY-P" );
    $sym43$STRING_ = makeSymbol( "STRING<" );
    $str44$cdolist = makeString( "cdolist" );
    $str45$_done = makeString( "/done" );
    $str46$Skipping_assignment_directory_wit = makeString( "Skipping assignment directory with no \"done\" file: ~S" );
    $str47$build_kb_loaded_cfasl = makeString( "build-kb-loaded.cfasl" );
    $str48$_results_cfasl = makeString( "/results.cfasl" );
    $str49$_fast_results_cfasl = makeString( "/fast-results.cfasl" );
    $str50$Using_results_file__S = makeString( "Using results file ~S" );
    $kw51$INPUT = makeKeyword( "INPUT" );
    $str52$Unable_to_open__S = makeString( "Unable to open ~S" );
    $kw53$EOF = makeKeyword( "EOF" );
    $str54$Non_FORT__S_in_paraphrase_data___ = makeString( "Non-FORT ~S in paraphrase data: ~S" );
    $str55$Bad_paraphrase_data_for__S_in__S_ = makeString( "Bad paraphrase data for ~S in ~S:~% ~S" );
    $str56$Skipping_black_listed_term__A___ = makeString( "Skipping black-listed term ~A.~%" );
    $kw57$USE_FIRST = makeKeyword( "USE-FIRST" );
    $str58$nl_generation_cache_work_ = makeString( "nl-generation-cache-work/" );
    $str59$777 = makeString( "777" );
    $str60$assignment_size_cfasl = makeString( "assignment-size.cfasl" );
    $str61$paraphrase_mt_cfasl = makeString( "paraphrase-mt.cfasl" );
    $str62$Assignment_size_is__S__Must_be_a_ = makeString( "Assignment size is ~S. Must be a multiple of ~D." );
    $str63$_ = makeString( "~" );
    $str64$__0D__ = makeString( ",'0D-~" );
    $str65$__0D_ = makeString( ",'0D/" );
    $str66$error_output_log = makeString( "error-output.log" );
    $str67$__Assigning_task__S__ = makeString( "~&Assigning task ~S~%" );
    $sym68$DO_NEXT_FORT_PARAPHRASE_CACHE_GENERATION_TASK = makeSymbol( "DO-NEXT-FORT-PARAPHRASE-CACHE-GENERATION-TASK" );
    $sym69$WAKE_UP_FORT_PARAPHRASE_CACHE_TASKMASTER = makeSymbol( "WAKE-UP-FORT-PARAPHRASE-CACHE-TASKMASTER" );
    $str70$__Just_dequeued__S_after_enqueuei = makeString( "~&Just dequeued ~S after enqueueing ~S~%" );
    $str71$__Successfully_completed__S__ = makeString( "~&Successfully completed ~S~%" );
    $str72$Received_failure_code_on_task__S = makeString( "Received failure code on task ~S" );
    $str73$Didn_t_recognize_exit_code__S = makeString( "Didn't recognize exit code ~S" );
    $str74$NL_FORT_Generation_subtask_report = makeString( "NL FORT Generation subtask reported failure:~% ~S" );
    $str75$__About_to_enqueue_new_exit_code_ = makeString( "~&About to enqueue new exit code ~S~%" );
    $str76$Just_received_task_specification_ = makeString( "Just received task specification ~S" );
    $list77 = ConsesLow.list( makeSymbol( "TASK-ID" ), makeSymbol( "MY-TASK-DIRECTORY" ), makeSymbol( "START-NUM" ), makeSymbol( "END-NUM" ) );
    $str78$Returning__S = makeString( "Returning ~S" );
    $str79$results_cfasl = makeString( "results.cfasl" );
    $str80$fast_results_cfasl = makeString( "fast-results.cfasl" );
    $sym81$DO_FORT_PARAPHRASE_CACHE_GENERATION_FOR_DIRECTORY = makeSymbol( "DO-FORT-PARAPHRASE-CACHE-GENERATION-FOR-DIRECTORY" );
    $str82$done = makeString( "done" );
    $kw83$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym84$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $list85 = ConsesLow.list( makeSymbol( "NL-FORT-GENERATION-TASK-FAILED?" ), ConsesLow.list( makeSymbol( "LIST" ), makeSymbol( "SUBDIRECTORY" ) ) );
    $str86$prior_results_cfasl = makeString( "prior-results.cfasl" );
    $kw87$OUTPUT = makeKeyword( "OUTPUT" );
    $str88$stats_log = makeString( "stats.log" );
    $kw89$APPEND = makeKeyword( "APPEND" );
    $str90$Generating_nl_for_forts_ = makeString( "Generating nl for forts " );
    $str91$_through_ = makeString( " through " );
    $str92$__PPH_phrase_count___ = makeString( " (PPH phrase count = " );
    $str93$_____ = makeString( ")...." );
    $str94$ = makeString( "" );
    $kw95$SKIP = makeKeyword( "SKIP" );
    $list96 = ConsesLow.list( makeUninternedSymbol( "START" ), makeUninternedSymbol( "END" ), makeUninternedSymbol( "DELTA" ) );
    $str97$Timed_out_on_first_try_after__A_g = makeString( "Timed out on first try after ~A generating paraphrase of ~S.~% Trying again..." );
    $sym98$BREAK = makeSymbol( "BREAK" );
    $sym99$WARN = makeSymbol( "WARN" );
    $str100$Timed_out_after__A_generating_par = makeString( "Timed out after ~A generating paraphrase of ~S" );
    $str101$Failed_to_generate_a_string_for__ = makeString( "Failed to generate a string for ~S" );
    $str102$Generated_empty_string_for__S = makeString( "Generated empty string for ~S" );
    $str103$PPH_phrase_count_grew_from__D_to_ = makeString( "PPH phrase count grew from ~D to ~D~% while paraphrasing ~S" );
    $kw104$NEW = makeKeyword( "NEW" );
    $int105$500 = makeInteger( 500 );
    $str106$Verifying_ = makeString( "Verifying " );
    $str107$_constants___ = makeString( " constants..." );
    $str108$_S____Cached___S___Generated___S_ = makeString( "~S:~% Cached: ~S~% Generated: ~S~%" );
    $str109$_NARTs___ = makeString( " NARTs..." );
    $str110$_D_of__D_constants_verified___F__ = makeString( "~D of ~D constants verified (~F%)~%" );
    $str111$_D_of__D_narts_verified___F____ = makeString( "~D of ~D narts verified (~F%)~%" );
    $str112$__First_non_finished__missing__di = makeString( "~&First non-finished (missing) directory: ~S" );
    $str113$__First_non_finished__failed__dir = makeString( "~&First non-finished (failed) directory: ~S" );
    $int114$128 = makeInteger( 128 );
    $str115$Clearing_PPH_memoization_for__S = makeString( "Clearing PPH memoization for ~S" );
    $str116$__Paraphrased_batch___D_of__S_FOR = makeString( "~&Paraphrased batch #~D of ~S FORTs in ~A~%" );
    $sym117$_ = makeSymbol( "+" );
    $str118$__Total_paraphrase_time___S__ = makeString( "~&Total paraphrase time: ~S~%" );
    $str119$__Median_paraphrase_time___S__ = makeString( "~&Median paraphrase time: ~S~%" );
    $str120$___Sth_percentile_paraphrase_time = makeString( "~&~Sth percentile paraphrase time: ~S~%" );
    $str121$____SWAP_time___A___ = makeString( "~& (SWAP time: ~A)~%" );
    $list122 = ConsesLow.list( makeString( "Total FORT Paraphrase Time in ~D-FORT Batches" ), makeString( "Median FORT Paraphrase Time in ~D-FORT Batches" ), makeString( "Total CPU Time per ~D-FORT Batch" ), makeString(
        "Total GC Time per ~D-FORT Batch" ), makeString( "Total Swap Time per ~D-FORT Batch" ), makeString( "Failed FORT count per ~D-FORT Batch" ) );
    $list123 = ConsesLow.list( makeString( "total" ), makeString( "median" ), makeString( "cpu" ), makeString( "gc" ), makeString( "swap" ), makeString( "failed-fort-count" ) );
    $list124 = ConsesLow.list( makeString( "Seconds" ), makeString( "Seconds" ), makeString( "Seconds" ), makeString( "Seconds" ), makeString( "Seconds" ), makeString( "FORTs" ) );
    $kw125$XLABEL = makeKeyword( "XLABEL" );
    $str126$Batch__ = makeString( "Batch #" );
    $kw127$YLABEL = makeKeyword( "YLABEL" );
    $kw128$PLOT_TITLE = makeKeyword( "PLOT-TITLE" );
    $kw129$OUTPUT_FILE = makeKeyword( "OUTPUT-FILE" );
    $str130$_cfasl = makeString( ".cfasl" );
    $list131 = ConsesLow.list( makeString( "Total FORT Paraphrase Time per Batch" ), makeString( "Median FORT Paraphrase Time by Batch" ), makeString( "Total CPU Time per Batch" ), makeString(
        "Total GC Time per Batch" ), makeString( "Total Swap Time per Batch" ), makeString( "Failed FORT Count per Batch" ) );
    $sym132$_ = makeSymbol( "<" );
    $sym133$FIRST = makeSymbol( "FIRST" );
    $int134$1000000000 = makeInteger( 1000000000 );
    $sym135$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $list136 = ConsesLow.list( makeSymbol( "NL-GENERATION-CACHE-METHOD" ) );
    $const137$InferencePSC = constant_handles.reader_make_constant_shell( makeString( "InferencePSC" ) );
    $kw138$TEXT = makeKeyword( "TEXT" );
    $str139$Error_in_paraphrase_fort_for_cach = makeString( "Error in paraphrase-fort-for-cache for ~S:~% ~S" );
    $str140$Cached_paraphrase_for__S___is__S_ = makeString( "Cached paraphrase for ~S~% is ~S.~% Should be ~S." );
    $float141$0_001 = makeDouble( 0.001 );
    $str142$__Checking_NL_Generation_cache_ba = makeString( "~%Checking NL Generation cache based on~% ~S~% with ~S local cache entries~% against KB ~A started from KB ~S~%" );
    $str143$__Done__D__Current_estimate____3F = makeString( "~&Done ~D. Current estimate: ~,3F%~%" );
    $str144$Done__S__but_variance_of_approxim = makeString( "Done ~S, but variance of approximately ~S exceeds ~S. Doing at least ~S more." );
    $str145$__The_estimated_staleness_percent = makeString( "~&The estimated staleness percentage of the NL generation FORT cache~% (based on ~D FORTs) is between ~," );
    $str146$F__and___ = makeString( "F% and ~," );
    $str147$F____ = makeString( "F%.~%" );
    $sym148$FILE_BACKED_CACHE_P = makeSymbol( "FILE-BACKED-CACHE-P" );
    $str149$Looking_up_nl_generation_for_all_ = makeString( "Looking up nl generation for all forts ...." );
    $kw150$NOT_FOUND = makeKeyword( "NOT-FOUND" );
    $const151$EnglishParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "EnglishParaphraseMt" ) );
    $str152$Timed_out_after__S_seconds_genera = makeString( "Timed out after ~S seconds generating paraphrase of ~S" );
    $const153$LogicalFieldAttribute = constant_handles.reader_make_constant_shell( makeString( "LogicalFieldAttribute" ) );
    $sym154$RELEVANT_MT_IS_EVERYTHING = makeSymbol( "RELEVANT-MT-IS-EVERYTHING" );
    $const155$EverythingPSC = constant_handles.reader_make_constant_shell( makeString( "EverythingPSC" ) );
    $sym156$FORT_P = makeSymbol( "FORT-P" );
    $sym157$CYCL_STRING_P = makeSymbol( "CYCL-STRING-P" );
    $sym158$_NL_GENERATION_CACHE_EXCEPTIONS_ = makeSymbol( "*NL-GENERATION-CACHE-EXCEPTIONS*" );
    $kw159$UNKNOWN = makeKeyword( "UNKNOWN" );
    $kw160$IMMEDIATE_INSTANTIATIONS = makeKeyword( "IMMEDIATE-INSTANTIATIONS" );
    $kw161$UPWARD_CLOSURE = makeKeyword( "UPWARD-CLOSURE" );
    $kw162$NONE = makeKeyword( "NONE" );
    $const163$TerrorismParaphraseMt = constant_handles.reader_make_constant_shell( makeString( "TerrorismParaphraseMt" ) );
    $kw164$DEFAULT = makeKeyword( "DEFAULT" );
    $sym165$NL_GENERATION_CACHE_METHOD = makeSymbol( "NL-GENERATION-CACHE-METHOD" );
    $str166$Finding_collections_that_don_t_us = makeString( "Finding collections that don't use cache when doing nl generation of instances..." );
    $sym167$STRINGP = makeSymbol( "STRINGP" );
    $int168$50 = makeInteger( 50 );
    $str169$Testing___A__generate_cache_ratio = makeString( "Testing: ~A, generate cache ratio: ~5F.~%" );
    $float170$1_2 = makeDouble( 1.2 );
    $str171$__Extra_cache_hits_for__S___S_per = makeString( "~&Extra cache hits for ~S: ~S per result.~%" );
    $float172$0_8 = makeDouble( 0.8 );
    $str173$__Insufficient_cache_hits_for__S_ = makeString( "~&Insufficient cache hits for ~S: ~S per result.~%" );
  }
}
/*
 * 
 * Total time: 3960 ms synthetic
 */