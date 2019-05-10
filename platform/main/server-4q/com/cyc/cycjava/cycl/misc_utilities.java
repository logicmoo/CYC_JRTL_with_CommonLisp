package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class misc_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.misc_utilities";
  public static final String myFingerPrint = "510ff1a9068391f9985ba249f4b86d21919ae59a88eec4b3ea0be8bd72ab2ec2";
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 948L)
  private static SubLSymbol $kb_content_copyright_notice$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 2169L)
  private static SubLSymbol $system_code_initializations_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 2367L)
  private static SubLSymbol $system_code_initializations_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 3985L)
  private static SubLSymbol $system_code_version_string$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 4040L)
  private static SubLSymbol $system_code_release_string$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 12073L)
  private static SubLSymbol $id_space_fixnum_range_problem$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 12900L)
  private static SubLSymbol $hl_store_caches_directory$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13066L)
  private static SubLSymbol $hl_store_caches_shared_symbols$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13233L)
  private static SubLSymbol $hl_store_caches_shared_symbols_simple$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 16202L)
  public static SubLSymbol $standard_hl_store_cache_file_extension$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27067L)
  private static SubLSymbol $hostname_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27712L)
  private static SubLSymbol $machine_bogomips$;
  private static final SubLString $str0$Copyright__c__1995___2014_Cycorp_;
  private static final SubLString $str1$___Copyright__c__1998___2014_Cyco;
  private static final SubLSymbol $sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_;
  private static final SubLSymbol $sym3$_SYSTEM_CODE_INITIALIZATIONS_LOCK_;
  private static final SubLString $str4$System_Code_Initializations_Lock;
  private static final SubLString $str5$Initializing_Cyc__A_A__;
  private static final SubLString $str6$__;
  private static final SubLString $str7$_;
  private static final SubLString $str8$;
  private static final SubLString $str9$No_KB_is_loaded___System_KB_initi;
  private static final SubLString $str10$_;
  private static final SubLSymbol $kw11$CYC_RESEARCHCYC;
  private static final SubLSymbol $kw12$CYC_DREAMCATCHER;
  private static final SubLString $str13$Dreamcatcher;
  private static final SubLSymbol $kw14$CYC_MAINT;
  private static final SubLString $str15$Cyc_Maint;
  private static final SubLList $list16;
  private static final SubLString $str17$OpenCyc;
  private static final SubLSymbol $kw18$CYC_OPENCYC;
  private static final SubLString $str19$OpenCyc__custom_;
  private static final SubLList $list20;
  private static final SubLString $str21$ResearchCyc;
  private static final SubLSymbol $kw22$CYC_RESEARCHCYC_DEBUG;
  private static final SubLString $str23$ResearchCyc__custom_;
  private static final SubLList $list24;
  private static final SubLString $str25$Cyc_Unknown;
  private static final SubLSymbol $sym26$SYSTEM_CODE_INITIALIZATIONS_RUN_P;
  private static final SubLString $str27$hack_;
  private static final SubLSymbol $kw28$IGNORE_ERRORS_TARGET;
  private static final SubLSymbol $sym29$IGNORE_ERRORS_HANDLER;
  private static final SubLString $str30$file_backed_cache_initializer;
  private static final SubLSymbol $sym31$INITIALIZE_ALL_FILE_BACKED_CACHES;
  private static final SubLFloat $float32$0_5;
  private static final SubLString $str33$__Your_KB_object_ID_space_has_out;
  private static final SubLString $str34$__Performance__and_most_likely_co;
  private static final SubLString $str35$__Relaunch_your_image_with_more_F;
  private static final SubLString $str36$Accept_the_risks;
  private static final SubLSymbol $kw37$VALIDATED;
  private static final SubLSymbol $sym38$_HL_STORE_CACHES_DIRECTORY_;
  private static final SubLSymbol $sym39$_HL_STORE_CACHES_SHARED_SYMBOLS_;
  private static final SubLSymbol $sym40$_HL_STORE_CACHES_SHARED_SYMBOLS_SIMPLE_;
  private static final SubLString $str41$Cannot_initialize_HL_KB_object_ca;
  private static final SubLString $str42$Do_not_have_a_valid_location_for_;
  private static final SubLString $str43$Could_not_initialize_HL_store_cac;
  private static final SubLString $str44$Initializing_HL_backing_store_cac;
  private static final SubLSymbol $sym45$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str46$Could_not_initialize_shared_symbo;
  private static final SubLSymbol $sym47$VECTOR;
  private static final SubLString $str48$cfasl;
  private static final SubLString $str49$_;
  private static final SubLString $str50$units__A_;
  private static final SubLString $str51$Guessing_HL_Store_location_of__A;
  private static final SubLSymbol $kw52$CONS;
  private static final SubLList $list53;
  private static final SubLSymbol $kw54$ADJOIN;
  private static final SubLSymbol $kw55$APPEND;
  private static final SubLSymbol $kw56$UNION;
  private static final SubLSymbol $kw57$CDR;
  private static final SubLSymbol $kw58$CAR;
  private static final SubLSymbol $kw59$REMOVE;
  private static final SubLSymbol $kw60$RPLACA;
  private static final SubLSymbol $kw61$RPLACD;
  private static final SubLSymbol $kw62$REVERSE;
  private static final SubLSymbol $kw63$INC;
  private static final SubLSymbol $kw64$DEC;
  private static final SubLList $list65;
  private static final SubLSymbol $sym66$LISTP;
  private static final SubLSymbol $sym67$PROPER_LIST_P;
  private static final SubLSymbol $sym68$POSITIVE_INTEGER_P;
  private static final SubLSymbol $kw69$TRUE;
  private static final SubLSymbol $kw70$FALSE;
  private static final SubLList $list71;
  private static final SubLSymbol $sym72$HOSTNAME;
  private static final SubLSymbol $sym73$STRINGP;
  private static final SubLSymbol $sym74$_HOSTNAME_CACHING_STATE_;
  private static final SubLString $str75$Could_not_get_hostname_;
  private static final SubLSymbol $kw76$UNINITIALIZED;
  private static final SubLString $str77$_proc_cpuinfo;
  private static final SubLSymbol $kw78$INPUT;
  private static final SubLString $str79$Unable_to_open__S;
  private static final SubLString $str80$bogomips;
  private static final SubLString $str81$_;
  private static final SubLList $list82;
  private static final SubLSymbol $sym83$PUNLESS;
  private static final SubLSymbol $sym84$WARN;
  private static final SubLSymbol $sym85$WARN_UNLESS;
  private static final SubLSymbol $kw86$DEFAULT;
  private static final SubLSymbol $sym87$SUBL_VARIABLE_BINDING_P;
  private static final SubLSymbol $sym88$SUBL_VARIABLE_BINDING_LIST_P;
  private static final SubLSymbol $sym89$FIRST;
  private static final SubLSymbol $sym90$SECOND;
  private static final SubLSymbol $sym91$FLUSH_ALL_LOGS;
  private static final SubLSymbol $kw92$DONE;
  private static final SubLSymbol $sym93$FBOUNDP;
  private static final SubLSymbol $sym94$BOUNDP;
  private static final SubLSymbol $sym95$SEARCH;
  private static final SubLString $str96$Unexpected_name_spec____S;
  private static final SubLSymbol $sym97$STRING_UPCASE;
  private static final SubLSymbol $sym98$STRING_LESSP;
  private static final SubLSymbol $sym99$SYMBOL_NAME;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLString $str102$___S_;
  private static final SubLString $str103$_S;
  private static final SubLString $str104$__;
  private static final SubLString $str105$_____S__;
  private static final SubLList $list106;
  private static final SubLString $str107$___S__S;
  private static final SubLSymbol $sym108$NON_EMPTY_STRING_P;
  private static final SubLSymbol $sym109$TRUE;
  private static final SubLSymbol $sym110$STRING_IS_PREFIX_OF;
  private static final SubLSymbol $sym111$MEMOIZATION_STATE_P;
  private static final SubLList $list112;
  private static final SubLList $list113;
  private static final SubLList $list114;
  private static final SubLSymbol $sym115$TERM__;
  private static final SubLString $str116$____Method____S;
  private static final SubLList $list117;
  private static final SubLString $str118$_S_;
  private static final SubLString $str119$___;
  private static final SubLString $str120$values__S;

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 777L)
  public static SubLObject copyright_notice()
  {
    return $str0$Copyright__c__1995___2014_Cycorp_;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 1978L)
  public static SubLObject kb_content_copyright_notice()
  {
    return $kb_content_copyright_notice$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 2057L)
  public static SubLObject write_kb_content_copyright_notice(final SubLObject stream)
  {
    print_high.princ( kb_content_copyright_notice(), stream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 2564L)
  public static SubLObject system_code_initializations(SubLObject perform_app_specific_initializationsP)
  {
    if( perform_app_specific_initializationsP == UNPROVIDED )
    {
      perform_app_specific_initializationsP = T;
    }
    SubLObject release = NIL;
    try
    {
      release = Locks.seize_lock( $system_code_initializations_lock$.getGlobalValue() );
      system_code_initializations_internal( perform_app_specific_initializationsP );
    }
    finally
    {
      if( NIL != release )
      {
        Locks.release_lock( $system_code_initializations_lock$.getGlobalValue() );
      }
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 2810L)
  public static SubLObject system_code_initializations_internal(final SubLObject perform_app_specific_initializationsP)
  {
    system_code_version_initialization( UNPROVIDED );
    PrintLow.format( T, $str5$Initializing_Cyc__A_A__, system_info.cyc_revision_string(), ( NIL != string_utilities.non_empty_string_p( cyc_system_code_string() ) ) ? Sequences.cconcatenate( $str6$__, new SubLObject[] {
      format_nil.format_nil_a_no_copy( cyc_system_code_string() ), $str7$_
    } ) : $str8$ );
    builder_utilities.initialize_cyc_product();
    research_cyc_init.research_cyc_pre_initializations();
    system_code_image_initializations();
    system_code_hl_initializations();
    system_code_inference_initializations();
    system_code_api_initializations();
    if( NIL != perform_app_specific_initializationsP )
    {
      system_code_application_initializations();
    }
    if( NIL != subl_promotions.positive_integer_p( control_vars.kb_loaded() ) )
    {
      system_kb_initializations();
    }
    else
    {
      Errors.warn( $str9$No_KB_is_loaded___System_KB_initi );
    }
    $system_code_initializations_marker$.setGlobalValue( Environment.get_process_id( UNPROVIDED ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 4094L)
  public static SubLObject cyc_system_code_string()
  {
    if( $system_code_version_string$.getGlobalValue().isString() && $system_code_release_string$.getGlobalValue().isString() )
    {
      return Sequences.cconcatenate( format_nil.format_nil_a_no_copy( $system_code_version_string$.getGlobalValue() ), new SubLObject[] { $str10$_, format_nil.format_nil_a_no_copy( $system_code_release_string$
          .getGlobalValue() )
      } );
    }
    if( $system_code_version_string$.getGlobalValue().isString() )
    {
      return $system_code_version_string$.getGlobalValue();
    }
    return $str8$;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 4432L)
  public static SubLObject system_code_version_initialization(SubLObject features)
  {
    if( features == UNPROVIDED )
    {
      features = reader.$features$.getDynamicValue();
    }
    if( NIL != list_utilities.member_eqP( $kw11$CYC_RESEARCHCYC, features ) && NIL != list_utilities.member_eqP( $kw12$CYC_DREAMCATCHER, features ) )
    {
      $system_code_version_string$.setGlobalValue( $str13$Dreamcatcher );
    }
    else if( NIL != list_utilities.member_eqP( $kw14$CYC_MAINT, features ) )
    {
      $system_code_version_string$.setGlobalValue( $str15$Cyc_Maint );
    }
    else if( NIL != list_utilities.sets_equalP( features, $list16, UNPROVIDED ) )
    {
      $system_code_version_string$.setGlobalValue( $str17$OpenCyc );
    }
    else if( NIL != list_utilities.member_eqP( $kw18$CYC_OPENCYC, features ) )
    {
      $system_code_version_string$.setGlobalValue( $str19$OpenCyc__custom_ );
    }
    else if( NIL != list_utilities.sets_equalP( features, $list20, UNPROVIDED ) )
    {
      $system_code_version_string$.setGlobalValue( $str21$ResearchCyc );
    }
    else if( NIL != list_utilities.member_eqP( $kw22$CYC_RESEARCHCYC_DEBUG, features ) )
    {
      $system_code_version_string$.setGlobalValue( $str23$ResearchCyc__custom_ );
    }
    else if( NIL != list_utilities.sets_equalP( features, $list24, UNPROVIDED ) )
    {
      $system_code_version_string$.setGlobalValue( $str21$ResearchCyc );
    }
    else if( NIL != list_utilities.member_eqP( $kw11$CYC_RESEARCHCYC, features ) )
    {
      $system_code_version_string$.setGlobalValue( $str23$ResearchCyc__custom_ );
    }
    else
    {
      $system_code_version_string$.setGlobalValue( $str25$Cyc_Unknown );
    }
    return cyc_system_code_string();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 6460L)
  public static SubLObject system_code_initializations_run_p()
  {
    return Numbers.numE( $system_code_initializations_marker$.getGlobalValue(), Environment.get_process_id( UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 6582L)
  public static SubLObject redo_system_code_initializations()
  {
    $system_code_initializations_marker$.setGlobalValue( NIL );
    return system_code_initializations( UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 6842L)
  public static SubLObject system_code_image_initializations()
  {
    clear_hostname();
    random.seed_random( UNPROVIDED );
    system_info.reset_cycl_start_time( UNPROVIDED );
    control_vars.set_cyc_image_id();
    clear_machine_bogomips();
    agenda.halt_agenda( UNPROVIDED );
    tcp_server_utilities.validate_all_tcp_servers();
    os_process_utilities.clear_active_os_processes();
    event_broker.remove_stale_core_event_customers();
    process_utilities.note_active_processes_at_startup();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 8095L)
  public static SubLObject system_code_hl_initializations()
  {
    sbhl_module_declarations.initialize_sbhl_modules( UNPROVIDED );
    sbhl_time_modules.cleanly_initialize_sbhl_time_modules();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 8500L)
  public static SubLObject system_code_inference_initializations()
  {
    inference_modules.reclassify_removal_modules();
    hl_storage_modules.reclassify_hl_storage_modules();
    somewhere_cache.reclassify_somewhere_cached_preds();
    inference_datastructures_problem_store.destroy_all_problem_stores();
    forward.clear_currently_forward_propagating_supports();
    inference_datastructures_inference.initialize_pad_table( $str27$hack_ );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 8925L)
  public static SubLObject system_code_api_initializations()
  {
    eval_in_api.eval_in_api_initialize();
    java_api_kernel.reset_java_api_kernel();
    api_widgets.reset_api_widget_sessions_resources();
    kb_modification_event_filters.reset_external_kb_modification_event_filters_and_listeners();
    kb_modification_event_filters.clear_kb_modification_event_mailboxes();
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 9415L)
  public static SubLObject system_code_application_initializations()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    html_kernel.clear_all_html_state();
    delayed_processor.reset_delayed_processor( pph_phrase.pph_phrase_destroyer() );
    sksi_sks_interaction.sksi_close_resourced_connections();
    semantic_etl_bus.initialize_semantic_etl_infrastructure();
    inference_analysis.clear_asked_query_queue();
    commander.clear_commander_queues();
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          linkage.initialize_pos_tags();
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw28$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 10244L)
  public static SubLObject system_kb_initializations()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    initialize_hl_store_caches();
    validate_hl_and_kb_settings();
    operation_communication.set_the_cyclist( system_parameters.$default_cyclist_name$.getDynamicValue( thread ) );
    transcript_utilities.initialize_transcript_handling();
    agenda.initialize_agenda();
    utilities_macros.initialize_global_locks();
    cyc_testing_initialization.perform_cyc_testing_initializations();
    kct_utils.initialize_kct();
    Threads.make_process( $str30$file_backed_cache_initializer, $sym31$INITIALIZE_ALL_FILE_BACKED_CACHES );
    Threads.sleep( $float32$0_5 );
    initialize_file_backed_nl_datastructures();
    fact_sheets.maybe_start_new_fact_sheet_updater_default_screensaver_for_user( UNPROVIDED );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 12380L)
  public static SubLObject validate_hl_and_kb_settings()
  {
    if( !Numbers.max( deduction_handles.next_deduction_id(), assertion_handles.next_assertion_id() ).isFixnum() )
    {
      Errors.cerror( $str36$Accept_the_risks, $id_space_fixnum_range_problem$.getGlobalValue() );
    }
    return $kw37$VALIDATED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 12634L)
  public static SubLObject initialize_file_backed_nl_datastructures()
  {
    final SubLObject directory = hl_store_caches_directory();
    final SubLObject symbols = get_hl_store_caches_shared_symbols_simple();
    nl_trie.reconnect_nl_trie_backing( directory, symbols );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13362L)
  public static SubLObject get_hl_store_caches_shared_symbols()
  {
    return $hl_store_caches_shared_symbols$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13461L)
  public static SubLObject get_hl_store_caches_shared_symbols_simple()
  {
    return $hl_store_caches_shared_symbols_simple$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13574L)
  public static SubLObject initialize_hl_store_caches()
  {
    if( NIL == hl_store_content_completely_cachedP() )
    {
      return initialize_hl_store_caches_from_directory( hl_store_caches_directory(), UNPROVIDED );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 13756L)
  public static SubLObject initialize_hl_store_caches_from_directory(final SubLObject direname, SubLObject symbols)
  {
    if( symbols == UNPROVIDED )
    {
      symbols = NIL;
    }
    if( NIL != initialize_hl_store_cache_directory_and_shared_symbols( direname, symbols ) )
    {
      deduction_manager.initialize_deduction_hl_store_cache();
      assertion_manager.initialize_assertion_hl_store_cache();
      constant_index_manager.initialize_constant_index_hl_store_cache();
      nart_index_manager.initialize_nart_index_hl_store_cache();
      nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
      unrepresented_terms.initialize_unrepresented_term_caches();
      unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
      kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
      sbhl_graphs.initialize_sbhl_graph_caches();
      tva_cache.reconnect_tva_cache_registry( direname, get_hl_store_caches_shared_symbols_simple() );
    }
    else
    {
      Errors.warn( $str41$Cannot_initialize_HL_KB_object_ca );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 14664L)
  public static SubLObject initialize_hl_store_cache_directory_and_shared_symbols(final SubLObject direname, SubLObject symbols)
  {
    if( symbols == UNPROVIDED )
    {
      symbols = NIL;
    }
    if( NIL != Filesys.directory_p( direname ) )
    {
      set_hl_store_caches_directory( direname );
    }
    else
    {
      Errors.warn( $str42$Do_not_have_a_valid_location_for_, direname );
    }
    if( NIL != Filesys.directory_p( hl_store_caches_directory() ) )
    {
      initialize_hl_store_cache_shared_symbols( symbols );
      return T;
    }
    Errors.warn( $str43$Could_not_initialize_HL_store_cac, direname );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 15213L)
  public static SubLObject initialize_hl_store_cache_shared_symbols(SubLObject symbols)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    PrintLow.format( T, $str44$Initializing_HL_backing_store_cac, hl_store_caches_directory() );
    if( NIL == symbols )
    {
      SubLObject error = NIL;
      try
      {
        thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
        final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
        try
        {
          Errors.$error_handler$.bind( $sym45$CATCH_ERROR_MESSAGE_HANDLER, thread );
          try
          {
            symbols = dumper.load_kb_product_shared_symbols( hl_store_caches_directory() );
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
        error = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      }
      finally
      {
        thread.throwStack.pop();
      }
      if( error.isString() )
      {
        Errors.warn( $str46$Could_not_initialize_shared_symbo, hl_store_caches_directory() );
      }
    }
    if( NIL != symbols )
    {
      $hl_store_caches_shared_symbols$.setGlobalValue( symbols );
      $hl_store_caches_shared_symbols_simple$.setGlobalValue( Functions.apply( $sym47$VECTOR, symbols ) );
      return $hl_store_caches_shared_symbols$.getGlobalValue();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 15854L)
  public static SubLObject hl_store_content_completely_cachedP()
  {
    return makeBoolean( NIL != deduction_manager.deduction_content_completely_cachedP() && NIL != assertion_manager.assertion_content_completely_cachedP() && NIL != constant_index_manager
        .constant_indices_completely_cachedP() && NIL != nart_index_manager.nart_indices_completely_cachedP() && NIL != unrepresented_term_index_manager.unrepresented_term_indices_completely_cachedP()
        && NIL != sbhl_graphs.sbhl_graph_completely_cachedP() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 16275L)
  public static SubLObject get_hl_store_cache_filename(final SubLObject filename, SubLObject extension)
  {
    if( extension == UNPROVIDED )
    {
      extension = $standard_hl_store_cache_file_extension$.getGlobalValue();
    }
    return Sequences.cconcatenate( $hl_store_caches_directory$.getGlobalValue(), new SubLObject[] { filename, $str49$_, extension
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 16482L)
  public static SubLObject set_hl_store_caches_directory(final SubLObject directory)
  {
    $hl_store_caches_directory$.setGlobalValue( directory );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 16822L)
  public static SubLObject generic_caches_directory()
  {
    return hl_store_caches_directory();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 17011L)
  public static SubLObject hl_store_caches_directory()
  {
    if( $hl_store_caches_directory$.getGlobalValue().isString() )
    {
      return $hl_store_caches_directory$.getGlobalValue();
    }
    set_hl_store_caches_directory( compute_hl_store_caches_directory() );
    return $hl_store_caches_directory$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 17289L)
  public static SubLObject compute_hl_store_caches_directory()
  {
    final SubLObject kb_num = control_vars.build_kb_loaded().isFixnum() ? control_vars.build_kb_loaded() : control_vars.kb_loaded();
    final SubLObject directory = PrintLow.format( NIL, $str50$units__A_, operation_communication.kb_number_string( kb_num ) );
    Errors.warn( $str51$Guessing_HL_Store_location_of__A, directory );
    return directory;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 17702L)
  public static SubLObject cdr_eqlP(final SubLObject list, final SubLObject value)
  {
    return Equality.eql( list.rest(), value );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 19821L)
  public static SubLObject not_member_equal(final SubLObject obj, final SubLObject list)
  {
    return makeBoolean( NIL == subl_promotions.memberP( obj, list, Symbols.symbol_function( EQUAL ), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 19901L)
  public static SubLObject get_indexed_obj(final SubLObject key, final SubLObject alist, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    return conses_high.assoc( key, alist, test, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 20406L)
  public static SubLObject update_vector_indexed_val(final SubLObject vector_key, final SubLObject vector_alist, final SubLObject index_key, final SubLObject index_alist, final SubLObject v_new, SubLObject method,
      SubLObject test1, SubLObject test2, SubLObject test3)
  {
    if( method == UNPROVIDED )
    {
      method = $kw52$CONS;
    }
    if( test1 == UNPROVIDED )
    {
      test1 = Symbols.symbol_function( EQL );
    }
    if( test2 == UNPROVIDED )
    {
      test2 = Symbols.symbol_function( EQL );
    }
    if( test3 == UNPROVIDED )
    {
      test3 = Symbols.symbol_function( EQL );
    }
    final SubLObject vec = get_indexed_obj( vector_key, vector_alist, test1 );
    final SubLObject index = get_indexed_obj( index_key, index_alist, test2 );
    if( !vec.isVector() || !index.isInteger() )
    {
      return NIL;
    }
    if( NIL != Sequences.find( method, $list53, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject old_val = Vectors.aref( vec, index );
      final SubLObject pcase_var = method;
      if( pcase_var.eql( $kw52$CONS ) )
      {
        Vectors.set_aref( vec, index, ConsesLow.cons( v_new, old_val ) );
        return vec;
      }
      if( pcase_var.eql( $kw54$ADJOIN ) )
      {
        if( old_val.isList() )
        {
          Vectors.set_aref( vec, index, conses_high.adjoin( v_new, old_val, test3, UNPROVIDED ) );
        }
        return vec;
      }
      if( pcase_var.eql( $kw55$APPEND ) )
      {
        if( v_new.isList() && old_val.isList() )
        {
          Vectors.set_aref( vec, index, ConsesLow.append( v_new, old_val ) );
        }
        return vec;
      }
      if( pcase_var.eql( $kw56$UNION ) )
      {
        if( v_new.isList() && old_val.isList() )
        {
          Vectors.set_aref( vec, index, conses_high.union( v_new, old_val, test3, UNPROVIDED ) );
        }
        return vec;
      }
      if( pcase_var.eql( $kw57$CDR ) )
      {
        if( old_val.isList() )
        {
          Vectors.set_aref( vec, index, old_val.rest() );
        }
        return vec;
      }
      if( pcase_var.eql( $kw58$CAR ) )
      {
        if( old_val.isList() )
        {
          Vectors.set_aref( vec, index, old_val.first() );
        }
        return vec;
      }
      if( pcase_var.eql( $kw59$REMOVE ) )
      {
        if( old_val.isList() )
        {
          Vectors.set_aref( vec, index, Sequences.remove( v_new, old_val, test3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
        }
        return vec;
      }
      if( pcase_var.eql( $kw60$RPLACA ) )
      {
        if( old_val.isCons() )
        {
          ConsesLow.rplaca( old_val, v_new );
          Vectors.set_aref( vec, index, old_val );
        }
        return vec;
      }
      if( pcase_var.eql( $kw61$RPLACD ) )
      {
        if( old_val.isCons() )
        {
          ConsesLow.rplacd( old_val, v_new );
          Vectors.set_aref( vec, index, old_val );
        }
        return vec;
      }
      if( pcase_var.eql( $kw62$REVERSE ) )
      {
        if( old_val.isSequence() )
        {
          Vectors.set_aref( vec, index, Sequences.nreverse( old_val ) );
        }
        return vec;
      }
      if( pcase_var.eql( $kw63$INC ) )
      {
        if( old_val.isInteger() )
        {
          if( NIL == v_new )
          {
            Vectors.set_aref( vec, index, Numbers.add( old_val, ONE_INTEGER ) );
          }
          else if( v_new.isInteger() && v_new.numG( ZERO_INTEGER ) )
          {
            Vectors.set_aref( vec, index, Numbers.add( old_val, v_new ) );
          }
        }
        return vec;
      }
      if( pcase_var.eql( $kw64$DEC ) )
      {
        if( old_val.isInteger() )
        {
          if( NIL == v_new && old_val.numG( ZERO_INTEGER ) )
          {
            Vectors.set_aref( vec, index, Numbers.subtract( old_val, ONE_INTEGER ) );
          }
          else if( v_new.isInteger() && v_new.numG( ZERO_INTEGER ) && old_val.numG( ZERO_INTEGER ) )
          {
            SubLObject new_count = Numbers.subtract( old_val, v_new );
            if( !new_count.numGE( ZERO_INTEGER ) )
            {
              new_count = ZERO_INTEGER;
            }
            Vectors.set_aref( vec, index, new_count );
          }
        }
        return vec;
      }
      return NIL;
    }
    else
    {
      if( NIL != Sequences.find( method, $list65, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        Vectors.set_aref( vec, index, v_new );
        return vec;
      }
      return NIL;
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 23240L)
  public static SubLObject get_vector_indexed_val(final SubLObject vector_key, final SubLObject vector_alist, final SubLObject index_key, final SubLObject index_alist, SubLObject test1, SubLObject test2)
  {
    if( test1 == UNPROVIDED )
    {
      test1 = Symbols.symbol_function( EQL );
    }
    if( test2 == UNPROVIDED )
    {
      test2 = Symbols.symbol_function( EQL );
    }
    final SubLObject vec = get_indexed_obj( vector_key, vector_alist, test1 );
    final SubLObject index = get_indexed_obj( index_key, index_alist, test2 );
    if( vec.isVector() && index.isInteger() )
    {
      return Vectors.aref( vec, index );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 23596L)
  public static SubLObject clear_indexed_vectors(final SubLObject vector_alist)
  {
    SubLObject cdolist_list_var = vector_alist;
    SubLObject form = NIL;
    form = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject vec = form.rest();
      SubLObject len;
      SubLObject i;
      for( len = Sequences.length( vec ), i = NIL, i = ZERO_INTEGER; i.numL( len ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        Vectors.set_aref( vec, i, NIL );
      }
      cdolist_list_var = cdolist_list_var.rest();
      form = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 23791L)
  public static SubLObject make_indexed_vector(final SubLObject index_alist, SubLObject initial_element)
  {
    if( initial_element == UNPROVIDED )
    {
      initial_element = NIL;
    }
    return Vectors.make_vector( Sequences.length( index_alist ), initial_element );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 23920L)
  public static SubLObject vector_cells_filled(final SubLObject vector)
  {
    SubLObject count = ZERO_INTEGER;
    SubLObject cdotimes_end_var;
    SubLObject i;
    SubLObject val;
    for( cdotimes_end_var = Sequences.length( vector ), i = NIL, i = ZERO_INTEGER; i.numL( cdotimes_end_var ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      val = Vectors.aref( vector, i );
      if( NIL != val )
      {
        count = Numbers.add( count, ONE_INTEGER );
      }
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 24173L)
  public static SubLObject extract_until(final SubLObject obj, final SubLObject list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    return conses_high.ldiff( list, conses_high.member( obj, list, test, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 24349L)
  public static SubLObject extract_until_any(final SubLObject items, final SubLObject list, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQUALP );
    }
    SubLObject result = NIL;
    SubLObject things = NIL;
    SubLObject item = NIL;
    SubLObject v_this = NIL;
    things = items;
    item = things.first();
    v_this = conses_high.ldiff( list, conses_high.member( item, list, test, UNPROVIDED ) );
    while ( NIL != things)
    {
      if( NIL == result || ( result.isCons() && Sequences.length( v_this ).numL( Sequences.length( result ) ) ) )
      {
        result = v_this;
      }
      things = things.rest();
      item = things.first();
      v_this = conses_high.ldiff( list, conses_high.member( item, list, test, UNPROVIDED ) );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 24826L)
  public static SubLObject number_list(final SubLObject lst)
  {
    assert NIL != Types.listp( lst ) : lst;
    SubLObject counter = ZERO_INTEGER;
    SubLObject ans = NIL;
    SubLObject cdolist_list_var = lst;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      ans = ConsesLow.cons( ConsesLow.cons( counter, ConsesLow.list( elem ) ), ans );
      counter = Numbers.add( counter, ONE_INTEGER );
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    return Sequences.nreverse( ans );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 25228L)
  public static SubLObject aconsnew(final SubLObject item, final SubLObject datum, final SubLObject alist, SubLObject test, SubLObject key)
  {
    if( test == UNPROVIDED )
    {
      test = Symbols.symbol_function( EQL );
    }
    if( key == UNPROVIDED )
    {
      key = Symbols.symbol_function( IDENTITY );
    }
    if( NIL != conses_high.assoc( item, alist, test, key ) )
    {
      return alist;
    }
    return conses_high.acons( item, datum, alist );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 25506L)
  public static SubLObject print_n_per_line(final SubLObject objects, final SubLObject n, SubLObject separator)
  {
    if( separator == UNPROVIDED )
    {
      separator = Characters.CHAR_space;
    }
    assert NIL != list_utilities.proper_list_p( objects ) : objects;
    assert NIL != subl_promotions.positive_integer_p( n ) : n;
    SubLObject list_var = NIL;
    SubLObject obj = NIL;
    SubLObject i = NIL;
    list_var = objects;
    obj = list_var.first();
    for( i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), obj = list_var.first(), i = Numbers.add( ONE_INTEGER, i ) )
    {
      print_high.prin1( obj, UNPROVIDED );
      if( Numbers.mod( number_utilities.f_1X( i ), n ).isZero() )
      {
        streams_high.terpri( UNPROVIDED );
      }
      else
      {
        print_high.princ( separator, UNPROVIDED );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 25976L)
  public static SubLObject other_binary_arg(final SubLObject arg)
  {
    if( arg.eql( ONE_INTEGER ) )
    {
      return TWO_INTEGER;
    }
    if( arg.eql( TWO_INTEGER ) )
    {
      return ONE_INTEGER;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 26131L)
  public static SubLObject number_of_non_null_args(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5)
  {
    if( arg1 == UNPROVIDED )
    {
      arg1 = NIL;
    }
    if( arg2 == UNPROVIDED )
    {
      arg2 = NIL;
    }
    if( arg3 == UNPROVIDED )
    {
      arg3 = NIL;
    }
    if( arg4 == UNPROVIDED )
    {
      arg4 = NIL;
    }
    if( arg5 == UNPROVIDED )
    {
      arg5 = NIL;
    }
    SubLObject count = ZERO_INTEGER;
    if( NIL != arg1 )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    if( NIL != arg2 )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    if( NIL != arg3 )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    if( NIL != arg4 )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    if( NIL != arg5 )
    {
      count = Numbers.add( count, ONE_INTEGER );
    }
    return count;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 26465L)
  public static SubLObject boolean_to_keyword(final SubLObject v_boolean)
  {
    if( NIL != v_boolean )
    {
      return $kw69$TRUE;
    }
    return $kw70$FALSE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 26636L)
  public static SubLObject keyword_to_boolean(final SubLObject keyword)
  {
    return Equality.eq( $kw69$TRUE, keyword );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 26713L)
  public static SubLObject get_unqualified_machine_name()
  {
    return string_utilities.split_string( Environment.get_machine_name( UNPROVIDED ), $list71 ).first();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27067L)
  public static SubLObject clear_hostname()
  {
    final SubLObject cs = $hostname_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27067L)
  public static SubLObject remove_hostname()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $hostname_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27067L)
  public static SubLObject hostname_internal()
  {
    final SubLObject hostname = Environment.get_machine_name( UNPROVIDED );
    assert NIL != Types.stringp( hostname ) : hostname;
    return Strings.string_downcase( hostname, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27067L)
  public static SubLObject hostname()
  {
    SubLObject caching_state = $hostname_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym72$HOSTNAME, $sym74$_HOSTNAME_CACHING_STATE_, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( hostname_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27243L)
  public static SubLObject machine_name()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject hostname = hostname();
    final SubLObject strings = string_utilities.split_string( hostname, $list71 );
    final SubLObject machine_name = strings.first();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && NIL != string_utilities.empty_string_p( machine_name ) )
    {
      Errors.error( $str75$Could_not_get_hostname_ );
    }
    return machine_name;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27488L)
  public static SubLObject function_spec_function(final SubLObject function_spec)
  {
    return function_spec.isFunction() ? function_spec : Symbols.symbol_function( function_spec );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 27830L)
  public static SubLObject machine_bogomips()
  {
    if( $kw76$UNINITIALIZED == $machine_bogomips$.getGlobalValue() )
    {
      $machine_bogomips$.setGlobalValue( compute_machine_bogomips() );
    }
    return $machine_bogomips$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 28100L)
  public static SubLObject clear_machine_bogomips()
  {
    $machine_bogomips$.setGlobalValue( $kw76$UNINITIALIZED );
    return $machine_bogomips$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 28215L)
  public static SubLObject compute_machine_bogomips()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    SubLObject ignore_errors_tag = NIL;
    try
    {
      thread.throwStack.push( $kw28$IGNORE_ERRORS_TARGET );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $sym29$IGNORE_ERRORS_HANDLER ), thread );
        try
        {
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_text( $str77$_proc_cpuinfo, $kw78$INPUT );
            if( !stream.isStream() )
            {
              // Errors.error((SubLObject)$str79$Unable_to_open__S,
              // (SubLObject)$str77$_proc_cpuinfo);
            }
            final SubLObject s = stream;
            if( NIL != s )
            {
              while ( NIL == result)
              {
                final SubLObject line = string_utilities.network_read_line( s, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                if( NIL != Sequences.search( $str80$bogomips, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
                {
                  result = reader.read_from_string( string_utilities.substring( line, number_utilities.f_1X( Sequences.search( $str81$_, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ),
                      UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
                }
              }
            }
          }
          finally
          {
            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
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
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
            }
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
      ignore_errors_tag = Errors.handleThrowable( ccatch_env_var, $kw28$IGNORE_ERRORS_TARGET );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 28638L)
  public static SubLObject scale_by_bogomips(final SubLObject numbers, final SubLObject bogomips)
  {
    final SubLObject local_bogomips = machine_bogomips();
    if( !local_bogomips.isNumber() || local_bogomips.numE( bogomips ) )
    {
      return numbers;
    }
    final SubLObject scaling_factor = Numbers.divide( bogomips, local_bogomips );
    SubLObject scaled_numbers = NIL;
    SubLObject cdolist_list_var = numbers;
    SubLObject number = NIL;
    number = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      scaled_numbers = ConsesLow.cons( Numbers.multiply( number, scaling_factor ), scaled_numbers );
      cdolist_list_var = cdolist_list_var.rest();
      number = cdolist_list_var.first();
    }
    return Sequences.nreverse( scaled_numbers );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29303L)
  public static SubLObject uninitialized()
  {
    return $kw76$UNINITIALIZED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29425L)
  public static SubLObject uninitialized_p(final SubLObject v_object)
  {
    return Equality.eq( v_object, uninitialized() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29503L)
  public static SubLObject initialized_p(final SubLObject v_object)
  {
    return makeBoolean( NIL == uninitialized_p( v_object ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29583L)
  public static SubLObject warn_unless(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    format_string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    return ConsesLow.list( $sym83$PUNLESS, form, ConsesLow.listS( $sym84$WARN, format_string, ConsesLow.append( v_arguments, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29778L)
  public static SubLObject would_be_nice_if(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject form = NIL;
    SubLObject format_string = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    form = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list82 );
    format_string = current.first();
    final SubLObject v_arguments;
    current = ( v_arguments = current.rest() );
    return ConsesLow.listS( $sym85$WARN_UNLESS, form, format_string, ConsesLow.append( v_arguments, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 29907L)
  public static SubLObject force_room(SubLObject x)
  {
    if( x == UNPROVIDED )
    {
      x = $kw86$DEFAULT;
    }
    Storage.room( x );
    streams_high.force_output( UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 30065L)
  public static SubLObject subl_variable_binding_list_p(final SubLObject v_object)
  {
    return makeBoolean( v_object.isList() && NIL != list_utilities.every_in_list( $sym87$SUBL_VARIABLE_BINDING_P, v_object, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 30456L)
  public static SubLObject subl_variable_binding_p(final SubLObject v_object)
  {
    return makeBoolean( NIL != list_utilities.doubletonP( v_object ) && v_object.first().isSymbol() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 30750L)
  public static SubLObject subl_variable_binding_list_variables(final SubLObject subl_binding_list)
  {
    assert NIL != subl_variable_binding_list_p( subl_binding_list ) : subl_binding_list;
    return Mapping.mapcar( $sym89$FIRST, subl_binding_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 30928L)
  public static SubLObject subl_variable_binding_list_values(final SubLObject subl_binding_list)
  {
    assert NIL != subl_variable_binding_list_p( subl_binding_list ) : subl_binding_list;
    return Mapping.mapcar( $sym90$SECOND, subl_binding_list );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 31104L)
  public static SubLObject flush_all_logs()
  {
    task_processor.flush_tpool_background_msgs();
    return $kw92$DONE;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 31322L)
  public static SubLObject apropos_methods(final SubLObject name, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject v_methods = methods_matching_name( name );
    return show_apropos_methods_summary( v_methods, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 31651L)
  public static SubLObject apropos_globals(final SubLObject name, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject globals = globals_matching_name( name );
    return show_apropos_globals_summary( globals, stream );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 31925L)
  public static SubLObject show_apropos_methods_summary(final SubLObject v_methods, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = v_methods;
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject arglist = subl_promotions.function_symbol_arglist( method );
      final SubLObject doc = method_documentation( method );
      final SubLObject tuple = ConsesLow.listS( method, arglist, ConsesLow.append( ( NIL != doc ) ? ConsesLow.list( doc ) : NIL, NIL ) );
      tuples = ConsesLow.cons( tuple, tuples );
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    tuples = Sequences.nreverse( tuples );
    show_apropos_results( tuples, stream );
    return Sequences.length( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 32472L)
  public static SubLObject show_apropos_globals_summary(final SubLObject globals, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject tuples = NIL;
    SubLObject cdolist_list_var = globals;
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject doc = global_documentation( global );
      final SubLObject tuple = reader.bq_cons( global, ConsesLow.append( ( NIL != doc ) ? ConsesLow.list( doc ) : NIL, NIL ) );
      tuples = ConsesLow.cons( tuple, tuples );
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    tuples = Sequences.nreverse( tuples );
    show_apropos_results( tuples, stream );
    return Sequences.length( tuples );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 32967L)
  public static SubLObject methods_matching_name(final SubLObject name_spec)
  {
    return apropos_wrt_name_spec( name_spec, $sym93$FBOUNDP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 33286L)
  public static SubLObject globals_matching_name(final SubLObject name_spec)
  {
    return apropos_wrt_name_spec( name_spec, $sym94$BOUNDP, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 33590L)
  public static SubLObject apropos_wrt_name_spec(final SubLObject name_spec, SubLObject filter, SubLObject match)
  {
    if( filter == UNPROVIDED )
    {
      filter = IDENTITY;
    }
    if( match == UNPROVIDED )
    {
      match = $sym95$SEARCH;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !name_spec.isString() && NIL == list_utilities.list_of_type_p( $sym73$STRINGP, name_spec ) )
    {
      Errors.error( $str96$Unexpected_name_spec____S, name_spec );
    }
    final SubLObject names = name_spec.isString() ? ConsesLow.list( Strings.string_upcase( name_spec, UNPROVIDED, UNPROVIDED ) ) : Mapping.mapcar( Symbols.symbol_function( $sym97$STRING_UPCASE ), name_spec );
    SubLObject symbols = NIL;
    SubLObject cdolist_list_var = ConsesLow.list( control_vars.$sublisp_package$.getGlobalValue(), control_vars.$cyc_package$.getGlobalValue() );
    SubLObject v_package = NIL;
    v_package = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject cdo_symbols_package = v_package;
      final SubLObject cdo_symbols_iterator = NIL;
      SubLObject sym = NIL;
      final Iterator cdo_symbols_iterator_$2 = Packages.makeSymbolIterator( cdo_symbols_package );
      while ( Packages.symbolIteratorHasNext( cdo_symbols_iterator_$2 ))
      {
        sym = Packages.symbolIteratorNext( cdo_symbols_iterator_$2 );
        if( NIL != Functions.funcall( filter, sym ) )
        {
          final SubLObject symbol_name = Symbols.symbol_name( sym );
          SubLObject missing = NIL;
          if( NIL == missing )
          {
            SubLObject csome_list_var = names;
            SubLObject name = NIL;
            name = csome_list_var.first();
            while ( NIL == missing && NIL != csome_list_var)
            {
              if( NIL == Functions.funcall( match, name, symbol_name ) )
              {
                missing = name;
              }
              csome_list_var = csome_list_var.rest();
              name = csome_list_var.first();
            }
          }
          if( NIL != missing )
          {
            continue;
          }
          final SubLObject item_var = sym;
          if( NIL != conses_high.member( item_var, symbols, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            continue;
          }
          symbols = ConsesLow.cons( item_var, symbols );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      v_package = cdolist_list_var.first();
    }
    symbols = Sort.sort( symbols, Symbols.symbol_function( $sym98$STRING_LESSP ), Symbols.symbol_function( $sym99$SYMBOL_NAME ) );
    return symbols;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 34377L)
  public static SubLObject show_apropos_results(final SubLObject tuples, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    SubLObject cdolist_list_var = tuples;
    SubLObject tuple = NIL;
    tuple = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = tuple;
      SubLObject symbol = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list100 );
      symbol = current.first();
      final SubLObject rest;
      current = ( rest = current.rest() );
      if( NIL != Symbols.fboundp( symbol ) && rest.first().isList() )
      {
        SubLObject current_$4;
        final SubLObject datum_$3 = current_$4 = rest;
        SubLObject arglist = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current_$4, datum_$3, $list101 );
        arglist = current_$4.first();
        current_$4 = current_$4.rest();
        final SubLObject documentation = current_$4.isCons() ? current_$4.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current_$4, datum_$3, $list101 );
        current_$4 = current_$4.rest();
        if( NIL == current_$4 )
        {
          PrintLow.format( stream, $str102$___S_, symbol );
          if( NIL != arglist )
          {
            PrintLow.format( stream, $str103$_S, arglist );
          }
          else
          {
            PrintLow.format( stream, $str104$__ );
          }
          if( documentation.isString() )
          {
            PrintLow.format( stream, $str105$_____S__, documentation );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( datum_$3, $list101 );
        }
      }
      if( NIL != Symbols.boundp( symbol ) )
      {
        SubLObject current_$5;
        final SubLObject datum_$4 = current_$5 = rest;
        final SubLObject documentation2 = current_$5.isCons() ? current_$5.first() : NIL;
        cdestructuring_bind.destructuring_bind_must_listp( current_$5, datum_$4, $list106 );
        final SubLObject whatever;
        current_$5 = ( whatever = current_$5.rest() );
        PrintLow.format( stream, $str107$___S__S, symbol, Eval.eval( symbol ) );
        if( documentation2.isString() )
        {
          PrintLow.format( stream, $str105$_____S__, documentation2 );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      tuple = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 35111L)
  public static SubLObject method_documentation(final SubLObject method)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 35305L)
  public static SubLObject global_documentation(final SubLObject global)
  {
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 35499L)
  public static SubLObject method_complete(final SubLObject name_prefix)
  {
    assert NIL != string_utilities.non_empty_string_p( name_prefix ) : name_prefix;
    return symbol_complete( name_prefix, $sym93$FBOUNDP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 35917L)
  public static SubLObject global_complete(final SubLObject name_prefix)
  {
    assert NIL != string_utilities.non_empty_string_p( name_prefix ) : name_prefix;
    return symbol_complete( name_prefix, $sym94$BOUNDP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 36333L)
  public static SubLObject symbol_complete(SubLObject name_prefix, SubLObject filter)
  {
    if( filter == UNPROVIDED )
    {
      filter = $sym109$TRUE;
    }
    name_prefix = Strings.string_upcase( name_prefix, UNPROVIDED, UNPROVIDED );
    final SubLObject candidates = apropos_wrt_name_spec( name_prefix, filter, $sym110$STRING_IS_PREFIX_OF );
    final SubLObject symbol_names = Mapping.mapcar( Symbols.symbol_function( $sym99$SYMBOL_NAME ), candidates );
    final SubLObject shared_extension = sorted_strings_shared_extension( symbol_names, name_prefix );
    return Values.values( candidates, shared_extension );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 36736L)
  public static SubLObject string_is_prefix_of(final SubLObject prefix, final SubLObject larger_string)
  {
    return string_utilities.starts_with( larger_string, prefix );
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 36848L)
  public static SubLObject sorted_strings_shared_extension(final SubLObject strings, final SubLObject common_prefix)
  {
    if( NIL == strings )
    {
      return $str8$;
    }
    final SubLObject first_string = strings.first();
    final SubLObject last_string = list_utilities.last_one( strings );
    final SubLObject shared_extension_start = Sequences.length( common_prefix );
    if( NIL != list_utilities.singletonP( strings ) )
    {
      return Sequences.subseq( first_string, shared_extension_start, UNPROVIDED );
    }
    final SubLObject shared_extension_end = Sequences.mismatch( first_string, last_string, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), shared_extension_start, NIL, shared_extension_start, NIL );
    final SubLObject shared_extension = ( shared_extension_end.isInteger() && shared_extension_end.numGE( shared_extension_start ) ) ? Sequences.subseq( first_string, shared_extension_start, shared_extension_end )
        : $str8$;
    return shared_extension;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 37568L)
  public static SubLObject memoization_state_method_entry_tuples_for_display(final SubLObject v_memoization_state, final SubLObject method)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
    final SubLObject caching_state = memoization_state.memoization_state_lookup( v_memoization_state, method, UNPROVIDED );
    if( NIL != memoization_state.caching_state_p( caching_state ) )
    {
      final SubLObject args_length = memoization_state.caching_state_args_length( caching_state );
      SubLObject tuples = NIL;
      final SubLObject pcase_var = args_length;
      if( pcase_var.eql( ZERO_INTEGER ) )
      {
        final SubLObject values = memoization_state.caching_state_zero_arg_results( caching_state );
        if( values.isList() )
        {
          final SubLObject tuple = ConsesLow.listS( NIL, conses_high.copy_list( values ) );
          tuples = ConsesLow.cons( tuple, tuples );
        }
      }
      else if( pcase_var.eql( ONE_INTEGER ) )
      {
        final SubLObject map = memoization_state.caching_state_store( caching_state );
        final SubLObject iterator = map_utilities.new_map_iterator( map );
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
            SubLObject arg = NIL;
            SubLObject values2 = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
            arg = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list112 );
            values2 = current.first();
            current = current.rest();
            if( NIL == current )
            {
              final SubLObject tuple2 = ConsesLow.listS( ConsesLow.list( arg ), conses_high.copy_list( values2 ) );
              tuples = ConsesLow.cons( tuple2, tuples );
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list112 );
            }
          }
        }
      }
      else
      {
        final SubLObject map = memoization_state.caching_state_store( caching_state );
        final SubLObject iterator = map_utilities.new_map_iterator( map );
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
            SubLObject sxhash = NIL;
            SubLObject collisions = NIL;
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
            sxhash = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list113 );
            collisions = current.first();
            current = current.rest();
            if( NIL == current )
            {
              SubLObject cdolist_list_var = collisions;
              SubLObject collision = NIL;
              collision = cdolist_list_var.first();
              while ( NIL != cdolist_list_var)
              {
                SubLObject current_$8;
                final SubLObject datum_$7 = current_$8 = collision;
                SubLObject args = NIL;
                SubLObject values3 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list114 );
                args = current_$8.first();
                current_$8 = current_$8.rest();
                cdestructuring_bind.destructuring_bind_must_consp( current_$8, datum_$7, $list114 );
                values3 = current_$8.first();
                current_$8 = current_$8.rest();
                if( NIL == current_$8 )
                {
                  final SubLObject tuple3 = ConsesLow.listS( conses_high.copy_list( args ), conses_high.copy_list( values3 ) );
                  tuples = ConsesLow.cons( tuple3, tuples );
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( datum_$7, $list114 );
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
              }
            }
            else
            {
              cdestructuring_bind.cdestructuring_bind_error( datum, $list113 );
            }
          }
        }
      }
      tuples = Sort.sort( tuples, Symbols.symbol_function( $sym115$TERM__ ), Symbols.symbol_function( $sym89$FIRST ) );
      return tuples;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/misc-utilities.lisp", position = 38976L)
  public static SubLObject show_memoization_state(final SubLObject v_memoization_state, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != memoization_state.memoization_state_p( v_memoization_state ) : v_memoization_state;
    SubLObject v_methods = memoization_state.memoization_state_keys( v_memoization_state );
    SubLObject cdolist_list_var;
    v_methods = ( cdolist_list_var = kb_utilities.sort_terms( v_methods, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
    SubLObject method = NIL;
    method = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject tuples = memoization_state_method_entry_tuples_for_display( v_memoization_state, method );
      if( NIL != tuples )
      {
        PrintLow.format( stream, $str116$____Method____S, method );
        SubLObject cdolist_list_var_$9 = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var_$9.first();
        while ( NIL != cdolist_list_var_$9)
        {
          streams_high.terpri( stream );
          SubLObject current;
          final SubLObject datum = current = tuple;
          SubLObject args = NIL;
          SubLObject values = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list117 );
          args = current.first();
          current = ( values = current.rest() );
          if( NIL != args )
          {
            if( NIL != list_utilities.singletonP( args ) )
            {
              PrintLow.format( stream, $str118$_S_, args.first() );
            }
            else
            {
              PrintLow.format( stream, $str118$_S_, args );
            }
          }
          streams_high.write_string( $str119$___, stream, UNPROVIDED, UNPROVIDED );
          if( NIL != list_utilities.singletonP( values ) )
          {
            PrintLow.format( stream, $str103$_S, values.first() );
          }
          else
          {
            PrintLow.format( stream, $str120$values__S, values );
          }
          cdolist_list_var_$9 = cdolist_list_var_$9.rest();
          tuple = cdolist_list_var_$9.first();
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      method = cdolist_list_var.first();
    }
    return v_memoization_state;
  }

  public static SubLObject declare_misc_utilities_file()
  {
    SubLFiles.declareFunction( me, "copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false );
    SubLFiles.declareFunction( me, "kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false );
    SubLFiles.declareFunction( me, "write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false );
    SubLFiles.declareFunction( me, "system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false );
    SubLFiles.declareFunction( me, "system_code_initializations_internal", "SYSTEM-CODE-INITIALIZATIONS-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_system_code_string", "CYC-SYSTEM-CODE-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_version_initialization", "SYSTEM-CODE-VERSION-INITIALIZATION", 0, 1, false );
    SubLFiles.declareFunction( me, "system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false );
    SubLFiles.declareFunction( me, "redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "validate_hl_and_kb_settings", "VALIDATE-HL-AND-KB-SETTINGS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false );
    SubLFiles.declareFunction( me, "get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false );
    SubLFiles.declareFunction( me, "get_hl_store_caches_shared_symbols_simple", "GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false );
    SubLFiles.declareFunction( me, "initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false );
    SubLFiles.declareFunction( me, "hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 1, 1, false );
    SubLFiles.declareFunction( me, "set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false );
    SubLFiles.declareFunction( me, "generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false );
    SubLFiles.declareFunction( me, "cdr_eqlP", "CDR-EQL?", 2, 0, false );
    SubLFiles.declareFunction( me, "not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false );
    SubLFiles.declareFunction( me, "get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false );
    SubLFiles.declareFunction( me, "update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false );
    SubLFiles.declareFunction( me, "get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false );
    SubLFiles.declareFunction( me, "clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false );
    SubLFiles.declareFunction( me, "make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false );
    SubLFiles.declareFunction( me, "vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_until", "EXTRACT-UNTIL", 2, 1, false );
    SubLFiles.declareFunction( me, "extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false );
    SubLFiles.declareFunction( me, "number_list", "NUMBER-LIST", 1, 0, false );
    SubLFiles.declareFunction( me, "aconsnew", "ACONSNEW", 3, 2, false );
    SubLFiles.declareFunction( me, "print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false );
    SubLFiles.declareFunction( me, "other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false );
    SubLFiles.declareFunction( me, "number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false );
    SubLFiles.declareFunction( me, "boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false );
    SubLFiles.declareFunction( me, "keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false );
    SubLFiles.declareFunction( me, "get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_hostname", "CLEAR-HOSTNAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_hostname", "REMOVE-HOSTNAME", 0, 0, false );
    SubLFiles.declareFunction( me, "hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "hostname", "HOSTNAME", 0, 0, false );
    SubLFiles.declareFunction( me, "machine_name", "MACHINE-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false );
    SubLFiles.declareFunction( me, "compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false );
    SubLFiles.declareFunction( me, "scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false );
    SubLFiles.declareFunction( me, "uninitialized", "UNINITIALIZED", 0, 0, false );
    SubLFiles.declareFunction( me, "uninitialized_p", "UNINITIALIZED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "initialized_p", "INITIALIZED-P", 1, 0, false );
    SubLFiles.declareMacro( me, "warn_unless", "WARN-UNLESS" );
    SubLFiles.declareMacro( me, "would_be_nice_if", "WOULD-BE-NICE-IF" );
    SubLFiles.declareFunction( me, "force_room", "FORCE-ROOM", 0, 1, false );
    SubLFiles.declareFunction( me, "subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false );
    SubLFiles.declareFunction( me, "subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false );
    SubLFiles.declareFunction( me, "flush_all_logs", "FLUSH-ALL-LOGS", 0, 0, false );
    SubLFiles.declareFunction( me, "apropos_methods", "APROPOS-METHODS", 1, 1, false );
    SubLFiles.declareFunction( me, "apropos_globals", "APROPOS-GLOBALS", 1, 1, false );
    SubLFiles.declareFunction( me, "show_apropos_methods_summary", "SHOW-APROPOS-METHODS-SUMMARY", 1, 1, false );
    SubLFiles.declareFunction( me, "show_apropos_globals_summary", "SHOW-APROPOS-GLOBALS-SUMMARY", 1, 1, false );
    SubLFiles.declareFunction( me, "methods_matching_name", "METHODS-MATCHING-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "globals_matching_name", "GLOBALS-MATCHING-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "apropos_wrt_name_spec", "APROPOS-WRT-NAME-SPEC", 1, 2, false );
    SubLFiles.declareFunction( me, "show_apropos_results", "SHOW-APROPOS-RESULTS", 1, 1, false );
    SubLFiles.declareFunction( me, "method_documentation", "METHOD-DOCUMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "global_documentation", "GLOBAL-DOCUMENTATION", 1, 0, false );
    SubLFiles.declareFunction( me, "method_complete", "METHOD-COMPLETE", 1, 0, false );
    SubLFiles.declareFunction( me, "global_complete", "GLOBAL-COMPLETE", 1, 0, false );
    SubLFiles.declareFunction( me, "symbol_complete", "SYMBOL-COMPLETE", 1, 1, false );
    SubLFiles.declareFunction( me, "string_is_prefix_of", "STRING-IS-PREFIX-OF", 2, 0, false );
    SubLFiles.declareFunction( me, "sorted_strings_shared_extension", "SORTED-STRINGS-SHARED-EXTENSION", 2, 0, false );
    SubLFiles.declareFunction( me, "memoization_state_method_entry_tuples_for_display", "MEMOIZATION-STATE-METHOD-ENTRY-TUPLES-FOR-DISPLAY", 2, 0, false );
    SubLFiles.declareFunction( me, "show_memoization_state", "SHOW-MEMOIZATION-STATE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_misc_utilities_file()
  {
    $kb_content_copyright_notice$ = SubLFiles.defconstant( "*KB-CONTENT-COPYRIGHT-NOTICE*", $str1$___Copyright__c__1998___2014_Cyco );
    $system_code_initializations_marker$ = SubLFiles.deflexical( "*SYSTEM-CODE-INITIALIZATIONS-MARKER*", maybeDefault( $sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_, $system_code_initializations_marker$, () -> ( Environment
        .get_process_id( UNPROVIDED ) ) ) );
    $system_code_initializations_lock$ = SubLFiles.deflexical( "*SYSTEM-CODE-INITIALIZATIONS-LOCK*", maybeDefault( $sym3$_SYSTEM_CODE_INITIALIZATIONS_LOCK_, $system_code_initializations_lock$, () -> ( Locks.make_lock(
        $str4$System_Code_Initializations_Lock ) ) ) );
    $system_code_version_string$ = SubLFiles.deflexical( "*SYSTEM-CODE-VERSION-STRING*", NIL );
    $system_code_release_string$ = SubLFiles.deflexical( "*SYSTEM-CODE-RELEASE-STRING*", NIL );
    $id_space_fixnum_range_problem$ = SubLFiles.deflexical( "*ID-SPACE-FIXNUM-RANGE-PROBLEM*", Sequences.cconcatenate( $str33$__Your_KB_object_ID_space_has_out, new SubLObject[] {
      $str34$__Performance__and_most_likely_co, $str35$__Relaunch_your_image_with_more_F
    } ) );
    $hl_store_caches_directory$ = SubLFiles.deflexical( "*HL-STORE-CACHES-DIRECTORY*", ( maybeDefault( $sym38$_HL_STORE_CACHES_DIRECTORY_, $hl_store_caches_directory$, NIL ) ) );
    $hl_store_caches_shared_symbols$ = SubLFiles.deflexical( "*HL-STORE-CACHES-SHARED-SYMBOLS*", ( maybeDefault( $sym39$_HL_STORE_CACHES_SHARED_SYMBOLS_, $hl_store_caches_shared_symbols$, NIL ) ) );
    $hl_store_caches_shared_symbols_simple$ = SubLFiles.deflexical( "*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*", ( maybeDefault( $sym40$_HL_STORE_CACHES_SHARED_SYMBOLS_SIMPLE_, $hl_store_caches_shared_symbols_simple$,
        NIL ) ) );
    $standard_hl_store_cache_file_extension$ = SubLFiles.deflexical( "*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*", $str48$cfasl );
    $hostname_caching_state$ = SubLFiles.deflexical( "*HOSTNAME-CACHING-STATE*", NIL );
    $machine_bogomips$ = SubLFiles.deflexical( "*MACHINE-BOGOMIPS*", $kw76$UNINITIALIZED );
    return NIL;
  }

  public static SubLObject setup_misc_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_ );
    subl_macro_promotions.declare_defglobal( $sym3$_SYSTEM_CODE_INITIALIZATIONS_LOCK_ );
    access_macros.register_external_symbol( $sym26$SYSTEM_CODE_INITIALIZATIONS_RUN_P );
    subl_macro_promotions.declare_defglobal( $sym38$_HL_STORE_CACHES_DIRECTORY_ );
    subl_macro_promotions.declare_defglobal( $sym39$_HL_STORE_CACHES_SHARED_SYMBOLS_ );
    subl_macro_promotions.declare_defglobal( $sym40$_HL_STORE_CACHES_SHARED_SYMBOLS_SIMPLE_ );
    memoization_state.note_globally_cached_function( $sym72$HOSTNAME );
    access_macros.register_external_symbol( $sym91$FLUSH_ALL_LOGS );
    utilities_macros.note_funcall_helper_function( $sym110$STRING_IS_PREFIX_OF );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_misc_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_misc_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_misc_utilities_file();
  }
  static
  {
    me = new misc_utilities();
    $kb_content_copyright_notice$ = null;
    $system_code_initializations_marker$ = null;
    $system_code_initializations_lock$ = null;
    $system_code_version_string$ = null;
    $system_code_release_string$ = null;
    $id_space_fixnum_range_problem$ = null;
    $hl_store_caches_directory$ = null;
    $hl_store_caches_shared_symbols$ = null;
    $hl_store_caches_shared_symbols_simple$ = null;
    $standard_hl_store_cache_file_extension$ = null;
    $hostname_caching_state$ = null;
    $machine_bogomips$ = null;
    $str0$Copyright__c__1995___2014_Cycorp_ = makeString( "Copyright (c) 1995 - 2014 Cycorp.  All rights reserved." );
    $str1$___Copyright__c__1998___2014_Cyco = makeString(
        ";; Copyright (c) 1998 - 2014 Cycorp, Inc., All Rights Reserved.\n;; This file and its contents are products of Cycorp, Inc.  They are\n;; released only under specific license agreement with Cycorp, and\n;; must be treated as Cycorp Confidential Information, as per that\n;; license agreement, including translations into another language\n;; (including but not limited to Conceptual Graphs, KIF, Ontolingua,\n;; GFP, LOOM, PowerLOOM, CycL, C, C++, IDL, predicate logic, and\n;; English) and any logically equivalent rearrangement or renaming of\n;; assertion components, terms, or variables.  This paragraph shall\n;; not be altered or removed. This file is provided \"AS IS\", without\n;; any warranty; the cumulative liability of Cycorp for all claims\n;; relating to this file shall not exceed the amount of one dollar.\n;; Cycorp, 7718 Wood Hollow Drive, Suite 250, Austin, TX 78731, USA; \n;; Website: www.cyc.com, Tel: (512) 342-4000." );
    $sym2$_SYSTEM_CODE_INITIALIZATIONS_MARKER_ = makeSymbol( "*SYSTEM-CODE-INITIALIZATIONS-MARKER*" );
    $sym3$_SYSTEM_CODE_INITIALIZATIONS_LOCK_ = makeSymbol( "*SYSTEM-CODE-INITIALIZATIONS-LOCK*" );
    $str4$System_Code_Initializations_Lock = makeString( "System Code Initializations Lock" );
    $str5$Initializing_Cyc__A_A__ = makeString( "Initializing Cyc ~A~A~%" );
    $str6$__ = makeString( " (" );
    $str7$_ = makeString( ")" );
    $str8$ = makeString( "" );
    $str9$No_KB_is_loaded___System_KB_initi = makeString( "No KB is loaded.  System KB initializations will not be run." );
    $str10$_ = makeString( " " );
    $kw11$CYC_RESEARCHCYC = makeKeyword( "CYC-RESEARCHCYC" );
    $kw12$CYC_DREAMCATCHER = makeKeyword( "CYC-DREAMCATCHER" );
    $str13$Dreamcatcher = makeString( "Dreamcatcher" );
    $kw14$CYC_MAINT = makeKeyword( "CYC-MAINT" );
    $str15$Cyc_Maint = makeString( "Cyc-Maint" );
    $list16 = ConsesLow.list( new SubLObject[] { makeKeyword( "CYC-WORDNET" ), makeKeyword( "CYC-TIME" ), makeKeyword( "CYC-REGEX" ), makeKeyword( "CYC-REFORMULATOR" ), makeKeyword( "CYC-QUANT" ), makeKeyword(
        "CYC-PPH" ), makeKeyword( "CYC-OPENCYC" ), makeKeyword( "CYC-LEXICON" ), makeKeyword( "CYC-HTML" ), makeKeyword( "CYC-GRAPHER" ), makeKeyword( "CYC-EVENT" ), makeKeyword( "CYC-DATE" ), makeKeyword(
            "CYC-BROWSER" ), makeKeyword( "CYC-API-LOCKDOWN" ), makeKeyword( "SL2JAVA" )
    } );
    $str17$OpenCyc = makeString( "OpenCyc" );
    $kw18$CYC_OPENCYC = makeKeyword( "CYC-OPENCYC" );
    $str19$OpenCyc__custom_ = makeString( "OpenCyc (custom)" );
    $list20 = ConsesLow.list( new SubLObject[] { makeKeyword( "CYC-YAHOO" ), makeKeyword( "CYC-WORDNET" ), makeKeyword( "CYC-TIME" ), makeKeyword( "CYC-TESTING" ), makeKeyword( "CYC-SUBLOOP" ), makeKeyword( "CYC-SKSI" ),
      makeKeyword( "CYC-SCENGEN" ), makeKeyword( "CYC-RTP" ), makeKeyword( "CYC-RKF" ), makeKeyword( "CYC-RESEARCHCYC-DEBUG" ), makeKeyword( "CYC-RESEARCHCYC" ), makeKeyword( "CYC-REGEX" ), makeKeyword(
          "CYC-REFORMULATOR" ), makeKeyword( "CYC-QUIRK" ), makeKeyword( "CYC-QUANT" ), makeKeyword( "CYC-PPH" ), makeKeyword( "CYC-PLANNER" ), makeKeyword( "CYC-NL" ), makeKeyword( "CYC-LEXICON" ), makeKeyword(
              "CYC-JAVAFRAMEWORK" ), makeKeyword( "CYC-HTML" ), makeKeyword( "CYC-GRAPHER" ), makeKeyword( "CYC-EXTERNAL" ), makeKeyword( "CYC-EVENT" ), makeKeyword( "CYC-DATE" ), makeKeyword( "CYC-BUTLER" ),
      makeKeyword( "CYC-BROWSER" ), makeKeyword( "SL2JAVA" )
    } );
    $str21$ResearchCyc = makeString( "ResearchCyc" );
    $kw22$CYC_RESEARCHCYC_DEBUG = makeKeyword( "CYC-RESEARCHCYC-DEBUG" );
    $str23$ResearchCyc__custom_ = makeString( "ResearchCyc (custom)" );
    $list24 = ConsesLow.list( new SubLObject[] { makeKeyword( "CYC-YAHOO" ), makeKeyword( "CYC-WORDNET" ), makeKeyword( "CYC-TIME" ), makeKeyword( "CYC-TESTING" ), makeKeyword( "CYC-SUBLOOP" ), makeKeyword( "CYC-SKSI" ),
      makeKeyword( "CYC-SCENGEN" ), makeKeyword( "CYC-RTP" ), makeKeyword( "CYC-RKF" ), makeKeyword( "CYC-RESEARCHCYC" ), makeKeyword( "CYC-REGEX" ), makeKeyword( "CYC-REFORMULATOR" ), makeKeyword( "CYC-QUIRK" ),
      makeKeyword( "CYC-QUANT" ), makeKeyword( "CYC-PPH" ), makeKeyword( "CYC-PLANNER" ), makeKeyword( "CYC-NL" ), makeKeyword( "CYC-LEXICON" ), makeKeyword( "CYC-JAVAFRAMEWORK" ), makeKeyword( "CYC-HTML" ), makeKeyword(
          "CYC-GRAPHER" ), makeKeyword( "CYC-EXTERNAL" ), makeKeyword( "CYC-EVENT" ), makeKeyword( "CYC-DATE" ), makeKeyword( "CYC-BUTLER" ), makeKeyword( "CYC-BROWSER" ), makeKeyword( "SL2JAVA" )
    } );
    $str25$Cyc_Unknown = makeString( "Cyc-Unknown" );
    $sym26$SYSTEM_CODE_INITIALIZATIONS_RUN_P = makeSymbol( "SYSTEM-CODE-INITIALIZATIONS-RUN-P" );
    $str27$hack_ = makeString( "hack!" );
    $kw28$IGNORE_ERRORS_TARGET = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $sym29$IGNORE_ERRORS_HANDLER = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $str30$file_backed_cache_initializer = makeString( "file-backed cache initializer" );
    $sym31$INITIALIZE_ALL_FILE_BACKED_CACHES = makeSymbol( "INITIALIZE-ALL-FILE-BACKED-CACHES" );
    $float32$0_5 = makeDouble( 0.5 );
    $str33$__Your_KB_object_ID_space_has_out = makeString( "~%Your KB object ID space has outstripped your FIXNUM range." );
    $str34$__Performance__and_most_likely_co = makeString( "~%Performance (and most likely correctness) will suffer." );
    $str35$__Relaunch_your_image_with_more_F = makeString( "~%Relaunch your image with more FIXNUM bits (-DFIX_NUM_BITS=xx).~%" );
    $str36$Accept_the_risks = makeString( "Accept the risks" );
    $kw37$VALIDATED = makeKeyword( "VALIDATED" );
    $sym38$_HL_STORE_CACHES_DIRECTORY_ = makeSymbol( "*HL-STORE-CACHES-DIRECTORY*" );
    $sym39$_HL_STORE_CACHES_SHARED_SYMBOLS_ = makeSymbol( "*HL-STORE-CACHES-SHARED-SYMBOLS*" );
    $sym40$_HL_STORE_CACHES_SHARED_SYMBOLS_SIMPLE_ = makeSymbol( "*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*" );
    $str41$Cannot_initialize_HL_KB_object_ca = makeString( "Cannot initialize HL KB object caches." );
    $str42$Do_not_have_a_valid_location_for_ = makeString( "Do not have a valid location for the HL store caches; ~A is not accessible" );
    $str43$Could_not_initialize_HL_store_cac = makeString( "Could not initialize HL store caches from ~A." );
    $str44$Initializing_HL_backing_store_cac = makeString( "Initializing HL backing store caches from ~A.~%" );
    $sym45$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str46$Could_not_initialize_shared_symbo = makeString( "Could not initialize shared symbols from ~A." );
    $sym47$VECTOR = makeSymbol( "VECTOR" );
    $str48$cfasl = makeString( "cfasl" );
    $str49$_ = makeString( "." );
    $str50$units__A_ = makeString( "units/~A/" );
    $str51$Guessing_HL_Store_location_of__A = makeString( "Guessing HL Store location of ~A" );
    $kw52$CONS = makeKeyword( "CONS" );
    $list53 = ConsesLow.list( new SubLObject[] { makeKeyword( "CONS" ), makeKeyword( "ADJOIN" ), makeKeyword( "APPEND" ), makeKeyword( "UNION" ), makeKeyword( "CDR" ), makeKeyword( "CAR" ), makeKeyword( "RPLACA" ),
      makeKeyword( "REMOVE" ), makeKeyword( "RPLACD" ), makeKeyword( "REVERSE" ), makeKeyword( "INC" ), makeKeyword( "DEC" )
    } );
    $kw54$ADJOIN = makeKeyword( "ADJOIN" );
    $kw55$APPEND = makeKeyword( "APPEND" );
    $kw56$UNION = makeKeyword( "UNION" );
    $kw57$CDR = makeKeyword( "CDR" );
    $kw58$CAR = makeKeyword( "CAR" );
    $kw59$REMOVE = makeKeyword( "REMOVE" );
    $kw60$RPLACA = makeKeyword( "RPLACA" );
    $kw61$RPLACD = makeKeyword( "RPLACD" );
    $kw62$REVERSE = makeKeyword( "REVERSE" );
    $kw63$INC = makeKeyword( "INC" );
    $kw64$DEC = makeKeyword( "DEC" );
    $list65 = ConsesLow.list( makeKeyword( "REPLACE" ) );
    $sym66$LISTP = makeSymbol( "LISTP" );
    $sym67$PROPER_LIST_P = makeSymbol( "PROPER-LIST-P" );
    $sym68$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $kw69$TRUE = makeKeyword( "TRUE" );
    $kw70$FALSE = makeKeyword( "FALSE" );
    $list71 = ConsesLow.list( Characters.CHAR_period );
    $sym72$HOSTNAME = makeSymbol( "HOSTNAME" );
    $sym73$STRINGP = makeSymbol( "STRINGP" );
    $sym74$_HOSTNAME_CACHING_STATE_ = makeSymbol( "*HOSTNAME-CACHING-STATE*" );
    $str75$Could_not_get_hostname_ = makeString( "Could not get hostname." );
    $kw76$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $str77$_proc_cpuinfo = makeString( "/proc/cpuinfo" );
    $kw78$INPUT = makeKeyword( "INPUT" );
    $str79$Unable_to_open__S = makeString( "Unable to open ~S" );
    $str80$bogomips = makeString( "bogomips" );
    $str81$_ = makeString( ":" );
    $list82 = ConsesLow.list( makeSymbol( "FORM" ), makeSymbol( "FORMAT-STRING" ), makeSymbol( "&REST" ), makeSymbol( "ARGUMENTS" ) );
    $sym83$PUNLESS = makeSymbol( "PUNLESS" );
    $sym84$WARN = makeSymbol( "WARN" );
    $sym85$WARN_UNLESS = makeSymbol( "WARN-UNLESS" );
    $kw86$DEFAULT = makeKeyword( "DEFAULT" );
    $sym87$SUBL_VARIABLE_BINDING_P = makeSymbol( "SUBL-VARIABLE-BINDING-P" );
    $sym88$SUBL_VARIABLE_BINDING_LIST_P = makeSymbol( "SUBL-VARIABLE-BINDING-LIST-P" );
    $sym89$FIRST = makeSymbol( "FIRST" );
    $sym90$SECOND = makeSymbol( "SECOND" );
    $sym91$FLUSH_ALL_LOGS = makeSymbol( "FLUSH-ALL-LOGS" );
    $kw92$DONE = makeKeyword( "DONE" );
    $sym93$FBOUNDP = makeSymbol( "FBOUNDP" );
    $sym94$BOUNDP = makeSymbol( "BOUNDP" );
    $sym95$SEARCH = makeSymbol( "SEARCH" );
    $str96$Unexpected_name_spec____S = makeString( "Unexpected name-spec : ~S" );
    $sym97$STRING_UPCASE = makeSymbol( "STRING-UPCASE" );
    $sym98$STRING_LESSP = makeSymbol( "STRING-LESSP" );
    $sym99$SYMBOL_NAME = makeSymbol( "SYMBOL-NAME" );
    $list100 = ConsesLow.list( makeSymbol( "SYMBOL" ), makeSymbol( "&REST" ), makeSymbol( "REST" ) );
    $list101 = ConsesLow.list( makeSymbol( "ARGLIST" ), makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ) );
    $str102$___S_ = makeString( "~&~S " );
    $str103$_S = makeString( "~S" );
    $str104$__ = makeString( "()" );
    $str105$_____S__ = makeString( "~%  ~S~%" );
    $list106 = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "DOCUMENTATION" ), makeSymbol( "&REST" ), makeSymbol( "WHATEVER" ) );
    $str107$___S__S = makeString( "~&~S ~S" );
    $sym108$NON_EMPTY_STRING_P = makeSymbol( "NON-EMPTY-STRING-P" );
    $sym109$TRUE = makeSymbol( "TRUE" );
    $sym110$STRING_IS_PREFIX_OF = makeSymbol( "STRING-IS-PREFIX-OF" );
    $sym111$MEMOIZATION_STATE_P = makeSymbol( "MEMOIZATION-STATE-P" );
    $list112 = ConsesLow.list( makeSymbol( "ARG" ), makeSymbol( "VALUES" ) );
    $list113 = ConsesLow.list( makeSymbol( "SXHASH" ), makeSymbol( "COLLISIONS" ) );
    $list114 = ConsesLow.list( makeSymbol( "ARGS" ), makeSymbol( "VALUES" ) );
    $sym115$TERM__ = makeSymbol( "TERM-<" );
    $str116$____Method____S = makeString( "~%~%Method : ~S" );
    $list117 = ConsesLow.cons( makeSymbol( "ARGS" ), makeSymbol( "VALUES" ) );
    $str118$_S_ = makeString( "~S " );
    $str119$___ = makeString( "-> " );
    $str120$values__S = makeString( "values ~S" );
  }
}
/*
 * 
 * Total time: 651 ms
 * 
 */