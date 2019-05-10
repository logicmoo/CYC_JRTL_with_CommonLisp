package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deduction_manager
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.deduction_manager";
  public static final String myFingerPrint = "0d5a56fb9674e8422bdcd7dc001252619f4f18ec3c5bf4430ec38717fd4f5d0d";
  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 876L)
  public static SubLSymbol $deduction_content_manager$;
  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 1065L)
  private static SubLSymbol $deduction_lru_size_percentage$;
  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 1408L)
  private static SubLSymbol $deduction_lru_size_max$;
  private static final SubLSymbol $sym0$_DEDUCTION_CONTENT_MANAGER_;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLInteger $int2$400000;
  private static final SubLString $str3$deduction;
  private static final SubLSymbol $sym4$LOAD_DEDUCTION_DEF_FROM_CACHE;
  private static final SubLSymbol $sym5$WITH_KBOM_FULLY_LOADED;
  private static final SubLList $list6;
  private static final SubLSymbol $kw7$DM;
  private static final SubLSymbol $sym8$_EXIT;
  private static final SubLString $str9$deduction_index;

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 1586L)
  public static SubLObject setup_deduction_content_table(final SubLObject size, final SubLObject exactP)
  {
    $deduction_content_manager$.setGlobalValue( kb_object_manager.new_kb_object_manager( $str3$deduction, size, $deduction_lru_size_percentage$.getGlobalValue(), $deduction_lru_size_max$.getGlobalValue(),
        $sym4$LOAD_DEDUCTION_DEF_FROM_CACHE, exactP ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 1851L)
  public static SubLObject resize_deduction_content_kbom_lru(SubLObject percentage, SubLObject max)
  {
    if( percentage == UNPROVIDED )
    {
      percentage = NIL;
    }
    if( max == UNPROVIDED )
    {
      max = NIL;
    }
    if( NIL == percentage )
    {
      percentage = $deduction_lru_size_percentage$.getGlobalValue();
    }
    if( NIL == max )
    {
      max = $deduction_lru_size_max$.getGlobalValue();
    }
    return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max( $deduction_content_manager$.getGlobalValue(), percentage, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 2265L)
  public static SubLObject optimize_deduction_content_table(final SubLObject new_deduction_id_threshold)
  {
    return kb_object_manager.optimize_kb_object_content_table( $deduction_content_manager$.getGlobalValue(), new_deduction_id_threshold );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 2445L)
  public static SubLObject clear_deduction_content_table()
  {
    return kb_object_manager.clear_kb_object_content_table( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 2566L)
  public static SubLObject maintain_deduction_usage_counts()
  {
    return kb_object_manager.maintain_kb_object_usage_counts( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 2739L)
  public static SubLObject dont_maintain_deduction_usage_counts()
  {
    return kb_object_manager.dont_maintain_kb_object_usage_counts( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 2923L)
  public static SubLObject deduction_usage_counts_enabled_p()
  {
    return kb_object_manager.kb_object_usage_counts_enabledP( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3124L)
  public static SubLObject deduction_manager_dont_maintain_usages_counts()
  {
    return kb_object_manager.dont_maintain_kb_object_usage_counts( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3282L)
  public static SubLObject deduction_manager_maintain_usage_counts()
  {
    return kb_object_manager.maintain_kb_object_usage_counts( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3412L)
  public static SubLObject deduction_manager_usage_counts_enabledP()
  {
    return kb_object_manager.kb_object_usage_counts_enabledP( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3542L)
  public static SubLObject deduction_manager_change_stream_buffer_sizes(final SubLObject data_stream_buffer_size, final SubLObject index_stream_buffer_size)
  {
    return kb_object_manager.kb_object_manager_change_stream_buffer_sizes( $deduction_content_manager$.getGlobalValue(), data_stream_buffer_size, index_stream_buffer_size );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3787L)
  public static SubLObject deduction_manager_enable_memory_mapping()
  {
    return kb_object_manager.kb_object_manager_enable_memory_mapping( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 3925L)
  public static SubLObject deduction_manager_memory_mappedP()
  {
    return kb_object_manager.kb_object_manager_memory_mappedP( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 4049L)
  public static SubLObject with_deduction_manager_fully_loaded(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym5$WITH_KBOM_FULLY_LOADED, $list6, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 4188L)
  public static SubLObject cached_deduction_count()
  {
    return kb_object_manager.cached_kb_object_count( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 4548L)
  public static SubLObject deduction_content_completely_cachedP()
  {
    return Numbers.numE( deduction_handles.deduction_count(), cached_deduction_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 4745L)
  public static SubLObject deduction_content_cached_p(final SubLObject deduction)
  {
    return kb_object_manager.kb_object_id_cachedP( $deduction_content_manager$.getGlobalValue(), deduction_handles.deduction_id( deduction ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 4886L)
  public static SubLObject lookup_deduction_content(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw7$DM ), thread );
      return kb_object_manager.lookup_kb_object_content( $deduction_content_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5037L)
  public static SubLObject get_file_backed_deduction_id_threshold()
  {
    return kb_object_manager.get_file_backed_kb_object_id_threshold( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5176L)
  public static SubLObject register_deduction_content(final SubLObject id, final SubLObject deduction_content)
  {
    return kb_object_manager.register_kb_object_content( $deduction_content_manager$.getGlobalValue(), id, deduction_content );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5419L)
  public static SubLObject deregister_deduction_content(final SubLObject id)
  {
    return kb_object_manager.deregister_kb_object_content( $deduction_content_manager$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5618L)
  public static SubLObject mark_deduction_content_as_muted(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw7$DM ), thread );
      return kb_object_manager.mark_kb_object_content_as_muted( $deduction_content_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5807L)
  public static SubLObject meter_deduction_content_swap_time()
  {
    return kb_object_manager.meter_kb_object_content_swap_time( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 5986L)
  public static SubLObject dont_meter_deduction_content_swap_time()
  {
    return kb_object_manager.dont_meter_kb_object_content_swap_time( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 6176L)
  public static SubLObject clear_deduction_content_swap_time()
  {
    return kb_object_manager.clear_kb_object_content_swap_time( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 6346L)
  public static SubLObject current_deduction_content_swap_time()
  {
    return kb_object_manager.kb_object_manager_swap_time( $deduction_content_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 6623L)
  public static SubLObject swap_out_all_pristine_deductions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw7$DM ), thread );
      return kb_object_manager.safely_swap_out_all_pristine_kb_objects( $deduction_content_manager$.getGlobalValue() );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 6792L)
  public static SubLObject initialize_deduction_hl_store_cache()
  {
    return kb_object_manager.initialize_kb_object_hl_store_cache( $deduction_content_manager$.getGlobalValue(), $str3$deduction, $str9$deduction_index, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/deduction-manager.lisp", position = 6955L)
  public static SubLObject wide_deduction_hl_store_cacheP()
  {
    return kb_object_manager.wide_kb_object_managerP( $deduction_content_manager$.getGlobalValue() );
  }

  public static SubLObject declare_deduction_manager_file()
  {
    SubLFiles.declareFunction( me, "setup_deduction_content_table", "SETUP-DEDUCTION-CONTENT-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "resize_deduction_content_kbom_lru", "RESIZE-DEDUCTION-CONTENT-KBOM-LRU", 0, 2, false );
    SubLFiles.declareFunction( me, "optimize_deduction_content_table", "OPTIMIZE-DEDUCTION-CONTENT-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_deduction_content_table", "CLEAR-DEDUCTION-CONTENT-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "maintain_deduction_usage_counts", "MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_maintain_deduction_usage_counts", "DONT-MAINTAIN-DEDUCTION-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_usage_counts_enabled_p", "DEDUCTION-USAGE-COUNTS-ENABLED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_dont_maintain_usages_counts", "DEDUCTION-MANAGER-DONT-MAINTAIN-USAGES-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_maintain_usage_counts", "DEDUCTION-MANAGER-MAINTAIN-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_usage_counts_enabledP", "DEDUCTION-MANAGER-USAGE-COUNTS-ENABLED?", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_change_stream_buffer_sizes", "DEDUCTION-MANAGER-CHANGE-STREAM-BUFFER-SIZES", 2, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_enable_memory_mapping", "DEDUCTION-MANAGER-ENABLE-MEMORY-MAPPING", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_manager_memory_mappedP", "DEDUCTION-MANAGER-MEMORY-MAPPED?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_deduction_manager_fully_loaded", "WITH-DEDUCTION-MANAGER-FULLY-LOADED" );
    SubLFiles.declareFunction( me, "cached_deduction_count", "CACHED-DEDUCTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_content_completely_cachedP", "DEDUCTION-CONTENT-COMPLETELY-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "deduction_content_cached_p", "DEDUCTION-CONTENT-CACHED-P", 1, 0, false );
    SubLFiles.declareFunction( me, "lookup_deduction_content", "LOOKUP-DEDUCTION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "get_file_backed_deduction_id_threshold", "GET-FILE-BACKED-DEDUCTION-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( me, "register_deduction_content", "REGISTER-DEDUCTION-CONTENT", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_deduction_content", "DEREGISTER-DEDUCTION-CONTENT", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_deduction_content_as_muted", "MARK-DEDUCTION-CONTENT-AS-MUTED", 1, 0, false );
    SubLFiles.declareFunction( me, "meter_deduction_content_swap_time", "METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_meter_deduction_content_swap_time", "DONT-METER-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_deduction_content_swap_time", "CLEAR-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "current_deduction_content_swap_time", "CURRENT-DEDUCTION-CONTENT-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "swap_out_all_pristine_deductions", "SWAP-OUT-ALL-PRISTINE-DEDUCTIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_deduction_hl_store_cache", "INITIALIZE-DEDUCTION-HL-STORE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "wide_deduction_hl_store_cacheP", "WIDE-DEDUCTION-HL-STORE-CACHE?", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_deduction_manager_file()
  {
    $deduction_content_manager$ = SubLFiles.deflexical( "*DEDUCTION-CONTENT-MANAGER*", ( maybeDefault( $sym0$_DEDUCTION_CONTENT_MANAGER_, $deduction_content_manager$, $kw1$UNINITIALIZED ) ) );
    $deduction_lru_size_percentage$ = SubLFiles.deflexical( "*DEDUCTION-LRU-SIZE-PERCENTAGE*", EIGHT_INTEGER );
    $deduction_lru_size_max$ = SubLFiles.deflexical( "*DEDUCTION-LRU-SIZE-MAX*", $int2$400000 );
    return NIL;
  }

  public static SubLObject setup_deduction_manager_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_DEDUCTION_CONTENT_MANAGER_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_deduction_manager_file();
  }

  @Override
  public void initializeVariables()
  {
    init_deduction_manager_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_deduction_manager_file();
  }
  static
  {
    me = new deduction_manager();
    $deduction_content_manager$ = null;
    $deduction_lru_size_percentage$ = null;
    $deduction_lru_size_max$ = null;
    $sym0$_DEDUCTION_CONTENT_MANAGER_ = makeSymbol( "*DEDUCTION-CONTENT-MANAGER*" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $int2$400000 = makeInteger( 400000 );
    $str3$deduction = makeString( "deduction" );
    $sym4$LOAD_DEDUCTION_DEF_FROM_CACHE = makeSymbol( "LOAD-DEDUCTION-DEF-FROM-CACHE" );
    $sym5$WITH_KBOM_FULLY_LOADED = makeSymbol( "WITH-KBOM-FULLY-LOADED" );
    $list6 = ConsesLow.list( makeSymbol( "*DEDUCTION-CONTENT-MANAGER*" ) );
    $kw7$DM = makeKeyword( "DM" );
    $sym8$_EXIT = makeSymbol( "%EXIT" );
    $str9$deduction_index = makeString( "deduction-index" );
  }
}
/*
 * 
 * Total time: 100 ms
 * 
 */