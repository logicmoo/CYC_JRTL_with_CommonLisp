package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nart_hl_formula_manager
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nart_hl_formula_manager";
  public static final String myFingerPrint = "57f8162b5328e6c283621e3319dd5d2bdad15683ffa444695cc0b10bf1fa7b12";
  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 860L)
  public static SubLSymbol $nart_hl_formula_manager$;
  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1065L)
  private static SubLSymbol $nart_hl_formula_lru_size_percentage$;
  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1181L)
  private static SubLSymbol $nart_hl_formula_lru_size_max$;
  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5817L)
  private static SubLSymbol $nart_hl_formula_table$;
  private static final SubLSymbol $sym0$_NART_HL_FORMULA_MANAGER_;
  private static final SubLSymbol $kw1$UNINITIALIZED;
  private static final SubLInteger $int2$10000;
  private static final SubLString $str3$nart_hl_formula;
  private static final SubLSymbol $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE;
  private static final SubLSymbol $kw5$NHM;
  private static final SubLSymbol $sym6$_EXIT;
  private static final SubLString $str7$nart_hl_formula_index;
  private static final SubLSymbol $sym8$_NART_HL_FORMULA_TABLE_;
  private static final SubLSymbol $sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD;
  private static final SubLInteger $int10$100;

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1367L)
  public static SubLObject setup_nart_hl_formula_table(final SubLObject size, final SubLObject exactP)
  {
    $nart_hl_formula_manager$.setGlobalValue( kb_object_manager.new_kb_object_manager( $str3$nart_hl_formula, size, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $nart_hl_formula_lru_size_max$.getGlobalValue(),
        $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE, exactP ) );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 1648L)
  public static SubLObject resize_nart_hl_formula_kbom_lru(SubLObject percentage, SubLObject max)
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
      percentage = $nart_hl_formula_lru_size_percentage$.getGlobalValue();
    }
    if( NIL == max )
    {
      max = $nart_hl_formula_lru_size_max$.getGlobalValue();
    }
    return kb_object_manager.resize_kbom_lru_cache_from_percentage_and_max( $nart_hl_formula_manager$.getGlobalValue(), percentage, max );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2068L)
  public static SubLObject optimize_nart_hl_formula_table(final SubLObject new_nart_hl_formula_id_threshold)
  {
    return kb_object_manager.optimize_kb_object_content_table( $nart_hl_formula_manager$.getGlobalValue(), new_nart_hl_formula_id_threshold );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2256L)
  public static SubLObject clear_nart_hl_formula_table()
  {
    return kb_object_manager.clear_kb_object_content_table( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2373L)
  public static SubLObject maintain_nart_hl_formula_usage_counts()
  {
    return kb_object_manager.maintain_kb_object_usage_counts( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2556L)
  public static SubLObject dont_maintain_nart_hl_formula_usage_counts()
  {
    return kb_object_manager.dont_maintain_kb_object_usage_counts( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2750L)
  public static SubLObject nart_hl_formula_usage_counts_enabled_p()
  {
    return kb_object_manager.kb_object_usage_counts_enabledP( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 2961L)
  public static SubLObject cached_nart_hl_formula_count()
  {
    return kb_object_manager.cached_kb_object_count( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3343L)
  public static SubLObject nart_hl_formula_completely_cachedP()
  {
    return Numbers.numE( nart_handles.nart_count(), cached_nart_hl_formula_count() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3457L)
  public static SubLObject lookup_nart_hl_formula(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NHM ), thread );
      return kb_object_manager.lookup_kb_object_content( $nart_hl_formula_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3605L)
  public static SubLObject get_file_backed_nart_id_threshold()
  {
    return kb_object_manager.get_file_backed_kb_object_id_threshold( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3737L)
  public static SubLObject nart_hl_formulas_unbuiltP()
  {
    if( nart_handles.nart_count().isZero() )
    {
      return NIL;
    }
    return kb_object_manager.kb_object_manager_unbuiltP( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 3894L)
  public static SubLObject register_nart_hl_formula(final SubLObject id, final SubLObject nart_hl_formula)
  {
    return kb_object_manager.register_kb_object_content( $nart_hl_formula_manager$.getGlobalValue(), id, nart_hl_formula );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4127L)
  public static SubLObject deregister_nart_hl_formula(final SubLObject id)
  {
    return kb_object_manager.deregister_kb_object_content( $nart_hl_formula_manager$.getGlobalValue(), id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4303L)
  public static SubLObject mark_nart_hl_formula_as_muted(final SubLObject id)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NHM ), thread );
      return kb_object_manager.mark_kb_object_content_as_muted( $nart_hl_formula_manager$.getGlobalValue(), id );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4489L)
  public static SubLObject meter_nart_hl_formula_swap_time()
  {
    return kb_object_manager.meter_kb_object_content_swap_time( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4670L)
  public static SubLObject dont_meter_nart_hl_formula_swap_time()
  {
    return kb_object_manager.dont_meter_kb_object_content_swap_time( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 4862L)
  public static SubLObject clear_nart_hl_formula_swap_time()
  {
    return kb_object_manager.clear_kb_object_content_swap_time( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5034L)
  public static SubLObject current_nart_hl_formula_swap_time()
  {
    return kb_object_manager.kb_object_manager_swap_time( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5305L)
  public static SubLObject swap_out_all_pristine_nart_hl_formulas()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding( thread );
    try
    {
      kb_storage_logging.$kb_storage_client$.bind( kb_storage_logging.add_kb_storage_logging_add_tag( $kw5$NHM ), thread );
      return kb_object_manager.safely_swap_out_all_pristine_kb_objects( $nart_hl_formula_manager$.getGlobalValue() );
    }
    finally
    {
      kb_storage_logging.$kb_storage_client$.rebind( _prev_bind_0, thread );
    }
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5479L)
  public static SubLObject initialize_nart_hl_formula_hl_store_cache()
  {
    return kb_object_manager.initialize_kb_object_hl_store_cache( $nart_hl_formula_manager$.getGlobalValue(), $str3$nart_hl_formula, $str7$nart_hl_formula_index, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5658L)
  public static SubLObject nart_hl_formula_table_initializedP()
  {
    return misc_utilities.initialized_p( $nart_hl_formula_manager$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/nart-hl-formula-manager.lisp", position = 5866L)
  public static SubLObject possibly_initialize_nart_hl_formula_manager_from_legacy_world()
  {
    if( $kw1$UNINITIALIZED == $nart_hl_formula_manager$.getGlobalValue() )
    {
      final SubLObject size = id_index.id_index_sparse_id_threshold( $nart_hl_formula_table$.getGlobalValue() );
      final SubLObject lru_size = Numbers.min( $nart_hl_formula_lru_size_max$.getGlobalValue(), Numbers.multiply( Numbers.integerDivide( size, $int10$100 ), $nart_hl_formula_lru_size_percentage$.getGlobalValue() ) );
      final SubLObject lru_information = cache.new_cache( lru_size, UNPROVIDED );
      $nart_hl_formula_manager$.setGlobalValue( kb_object_manager.new_legacy_kb_object_manager( $str3$nart_hl_formula, $nart_hl_formula_lru_size_percentage$.getGlobalValue(), $nart_hl_formula_lru_size_max$
          .getGlobalValue(), $nart_hl_formula_table$.getGlobalValue(), lru_information, $kw1$UNINITIALIZED, $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE ) );
      return T;
    }
    return NIL;
  }

  public static SubLObject declare_nart_hl_formula_manager_file()
  {
    SubLFiles.declareFunction( me, "setup_nart_hl_formula_table", "SETUP-NART-HL-FORMULA-TABLE", 2, 0, false );
    SubLFiles.declareFunction( me, "resize_nart_hl_formula_kbom_lru", "RESIZE-NART-HL-FORMULA-KBOM-LRU", 0, 2, false );
    SubLFiles.declareFunction( me, "optimize_nart_hl_formula_table", "OPTIMIZE-NART-HL-FORMULA-TABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_nart_hl_formula_table", "CLEAR-NART-HL-FORMULA-TABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "maintain_nart_hl_formula_usage_counts", "MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_maintain_nart_hl_formula_usage_counts", "DONT-MAINTAIN-NART-HL-FORMULA-USAGE-COUNTS", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_hl_formula_usage_counts_enabled_p", "NART-HL-FORMULA-USAGE-COUNTS-ENABLED-P", 0, 0, false );
    SubLFiles.declareFunction( me, "cached_nart_hl_formula_count", "CACHED-NART-HL-FORMULA-COUNT", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_hl_formula_completely_cachedP", "NART-HL-FORMULA-COMPLETELY-CACHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "lookup_nart_hl_formula", "LOOKUP-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "get_file_backed_nart_id_threshold", "GET-FILE-BACKED-NART-ID-THRESHOLD", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_hl_formulas_unbuiltP", "NART-HL-FORMULAS-UNBUILT?", 0, 0, false );
    SubLFiles.declareFunction( me, "register_nart_hl_formula", "REGISTER-NART-HL-FORMULA", 2, 0, false );
    SubLFiles.declareFunction( me, "deregister_nart_hl_formula", "DEREGISTER-NART-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( me, "mark_nart_hl_formula_as_muted", "MARK-NART-HL-FORMULA-AS-MUTED", 1, 0, false );
    SubLFiles.declareFunction( me, "meter_nart_hl_formula_swap_time", "METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "dont_meter_nart_hl_formula_swap_time", "DONT-METER-NART-HL-FORMULA-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "clear_nart_hl_formula_swap_time", "CLEAR-NART-HL-FORMULA-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "current_nart_hl_formula_swap_time", "CURRENT-NART-HL-FORMULA-SWAP-TIME", 0, 0, false );
    SubLFiles.declareFunction( me, "swap_out_all_pristine_nart_hl_formulas", "SWAP-OUT-ALL-PRISTINE-NART-HL-FORMULAS", 0, 0, false );
    SubLFiles.declareFunction( me, "initialize_nart_hl_formula_hl_store_cache", "INITIALIZE-NART-HL-FORMULA-HL-STORE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "nart_hl_formula_table_initializedP", "NART-HL-FORMULA-TABLE-INITIALIZED?", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_initialize_nart_hl_formula_manager_from_legacy_world", "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_nart_hl_formula_manager_file()
  {
    $nart_hl_formula_manager$ = SubLFiles.deflexical( "*NART-HL-FORMULA-MANAGER*", ( maybeDefault( $sym0$_NART_HL_FORMULA_MANAGER_, $nart_hl_formula_manager$, $kw1$UNINITIALIZED ) ) );
    $nart_hl_formula_lru_size_percentage$ = SubLFiles.deflexical( "*NART-HL-FORMULA-LRU-SIZE-PERCENTAGE*", FIVE_INTEGER );
    $nart_hl_formula_lru_size_max$ = SubLFiles.deflexical( "*NART-HL-FORMULA-LRU-SIZE-MAX*", $int2$10000 );
    $nart_hl_formula_table$ = SubLFiles.deflexical( "*NART-HL-FORMULA-TABLE*", ( maybeDefault( $sym8$_NART_HL_FORMULA_TABLE_, $nart_hl_formula_table$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_nart_hl_formula_manager_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_NART_HL_FORMULA_MANAGER_ );
    subl_macro_promotions.declare_defglobal( $sym8$_NART_HL_FORMULA_TABLE_ );
    access_macros.define_obsolete_register( $sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD, NIL );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nart_hl_formula_manager_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nart_hl_formula_manager_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nart_hl_formula_manager_file();
  }
  static
  {
    me = new nart_hl_formula_manager();
    $nart_hl_formula_manager$ = null;
    $nart_hl_formula_lru_size_percentage$ = null;
    $nart_hl_formula_lru_size_max$ = null;
    $nart_hl_formula_table$ = null;
    $sym0$_NART_HL_FORMULA_MANAGER_ = makeSymbol( "*NART-HL-FORMULA-MANAGER*" );
    $kw1$UNINITIALIZED = makeKeyword( "UNINITIALIZED" );
    $int2$10000 = makeInteger( 10000 );
    $str3$nart_hl_formula = makeString( "nart-hl-formula" );
    $sym4$LOAD_NART_HL_FORMULA_FROM_CACHE = makeSymbol( "LOAD-NART-HL-FORMULA-FROM-CACHE" );
    $kw5$NHM = makeKeyword( "NHM" );
    $sym6$_EXIT = makeSymbol( "%EXIT" );
    $str7$nart_hl_formula_index = makeString( "nart-hl-formula-index" );
    $sym8$_NART_HL_FORMULA_TABLE_ = makeSymbol( "*NART-HL-FORMULA-TABLE*" );
    $sym9$POSSIBLY_INITIALIZE_NART_HL_FORMULA_MANAGER_FROM_LEGACY_WORLD = makeSymbol( "POSSIBLY-INITIALIZE-NART-HL-FORMULA-MANAGER-FROM-LEGACY-WORLD" );
    $int10$100 = makeInteger( 100 );
  }
}
/*
 * 
 * Total time: 56 ms
 * 
 */