package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class mt_relevance_cache
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.mt_relevance_cache";
  public static final String myFingerPrint = "58a1c8dd59f16a3f6a46f274e218d29563bab55951059b2f081a01d6f1559e23";
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3528L)
  private static SubLSymbol $mt_relevance_cache_unknown$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5661L)
  private static SubLSymbol $monad_mt_fort_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6242L)
  private static SubLSymbol $monad_mt_naut_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
  private static SubLSymbol $time_mt_cache$;
  private static final SubLSymbol $kw0$UNKNOWN;
  private static final SubLString $str1$Unsupported_Mt_relevance_cache_ty;
  private static final SubLString $str2$Corrupt_entry_in_Mt_relevance_cac;
  private static final SubLString $str3$Previous_entry_for__s_corrupt___R;
  private static final SubLSymbol $sym4$_MONAD_MT_FORT_CACHE_;
  private static final SubLInteger $int5$256;
  private static final SubLSymbol $sym6$_MONAD_MT_NAUT_CACHE_;
  private static final SubLSymbol $sym7$_TIME_MT_CACHE_;
  private static final SubLInteger $int8$1024;

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1045L)
  public static SubLObject basemtP(SubLObject mt, SubLObject basemt)
  {
    if( NIL != hlmt.hlmt_temporal_mt( mt ) && NIL != hlmt.hlmt_temporal_mt( basemt ) )
    {
      mt = bind_mt_indexicals( mt );
      basemt = bind_mt_indexicals( basemt );
    }
    if( NIL != hlmt.hlmts_supportedP() )
    {
      return ( NIL != forts.fort_p( mt ) && NIL != forts.fort_p( basemt ) ) ? monad_basemtP( mt, basemt ) : hlmt_basemtP( mt, basemt );
    }
    return monad_basemtP( mt, basemt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1713L)
  public static SubLObject clear_mt_relevance_cache()
  {
    clear_monad_mt_fort_cache();
    clear_monad_mt_naut_cache();
    if( NIL != hlmt.hlmts_supportedP() )
    {
      clear_time_mt_cache();
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 1949L)
  public static SubLObject update_mt_relevance_cache(final SubLObject argument, final SubLObject assertion)
  {
    return clear_mt_relevance_cache();
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2200L)
  public static SubLObject bind_mt_indexicals(SubLObject mt)
  {
    if( NIL == forts.fort_p( mt ) )
    {
      mt = date_utilities.possibly_bind_temporal_indexical_in_object( mt );
    }
    return mt;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2402L)
  public static SubLObject monad_basemtP(final SubLObject mt, final SubLObject basemt)
  {
    if( mt.equal( basemt ) )
    {
      return T;
    }
    if( NIL != forts.fort_p( mt ) && NIL != forts.fort_p( basemt ) )
    {
      return monad_mt_fort_cache_base_mt( mt, basemt );
    }
    return monad_mt_naut_cache_base_mt( mt, basemt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2633L)
  public static SubLObject hlmt_basemtP(final SubLObject mt, final SubLObject basemt)
  {
    if( mt.equal( basemt ) )
    {
      return T;
    }
    if( NIL != hlmt.monad_mt_p( mt ) && NIL != hlmt.monad_mt_p( basemt ) )
    {
      return monad_basemtP( mt, basemt );
    }
    return makeBoolean( NIL != monad_basemtP( hlmt.hlmt_monad_mt( mt ), hlmt.hlmt_monad_mt( basemt ) ) && NIL != non_monad_basemtP( mt, basemt ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 2918L)
  public static SubLObject non_monad_basemtP(final SubLObject mt, final SubLObject basemt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject failureP = NIL;
    final SubLObject mt_time = hlmt.hlmt_temporal_mt( mt );
    final SubLObject basemt_time = hlmt.hlmt_temporal_mt( basemt );
    final SubLObject mt_monad = hlmt.hlmt_monad_mt( mt );
    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate( mt_monad );
    final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding( thread );
    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding( thread );
    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding( thread );
    try
    {
      mt_relevance_macros.$mt$.bind( mt_relevance_macros.update_inference_mt_relevance_mt( mt_var ), thread );
      mt_relevance_macros.$relevant_mt_function$.bind( mt_relevance_macros.update_inference_mt_relevance_function( mt_var ), thread );
      mt_relevance_macros.$relevant_mts$.bind( mt_relevance_macros.update_inference_mt_relevance_mt_list( mt_var ), thread );
      if( NIL == time_basemtP( mt_time, basemt_time ) )
      {
        failureP = T;
      }
    }
    finally
    {
      mt_relevance_macros.$relevant_mts$.rebind( _prev_bind_3, thread );
      mt_relevance_macros.$relevant_mt_function$.rebind( _prev_bind_2, thread );
      mt_relevance_macros.$mt$.rebind( _prev_bind_0, thread );
    }
    return makeBoolean( NIL == failureP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3337L)
  public static SubLObject time_basemtP(final SubLObject mt, final SubLObject basemt)
  {
    if( NIL == basemt )
    {
      return T;
    }
    if( mt.equal( basemt ) )
    {
      return T;
    }
    return time_mt_cache_base_mt( mt, basemt );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3706L)
  public static SubLObject mt_relevance_cache_unknown_p(final SubLObject v_object)
  {
    return Equality.eql( v_object, $mt_relevance_cache_unknown$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 3812L)
  public static SubLObject mt_relevance_cache_get(final SubLObject v_cache, final SubLObject key)
  {
    if( NIL != cache.cache_p( v_cache ) )
    {
      return cache.cache_get( v_cache, key );
    }
    if( v_cache.isHashtable() )
    {
      return Hashtables.gethash( key, v_cache, UNPROVIDED );
    }
    return Errors.error( $str1$Unsupported_Mt_relevance_cache_ty );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4041L)
  public static SubLObject mt_relevance_cache_set(final SubLObject v_cache, final SubLObject key, final SubLObject value)
  {
    if( NIL != cache.cache_p( v_cache ) )
    {
      return cache.cache_set( v_cache, key, value );
    }
    if( v_cache.isHashtable() )
    {
      return Hashtables.sethash( key, v_cache, value );
    }
    return Errors.error( $str1$Unsupported_Mt_relevance_cache_ty );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4287L)
  public static SubLObject mt_relevance_cache_remove(final SubLObject v_cache, final SubLObject key)
  {
    if( NIL != cache.cache_p( v_cache ) )
    {
      return cache.cache_remove( v_cache, key );
    }
    if( v_cache.isHashtable() )
    {
      return Hashtables.remhash( key, v_cache );
    }
    return Errors.error( $str1$Unsupported_Mt_relevance_cache_ty );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 4521L)
  public static SubLObject mt_relevance_cache_base_mt(final SubLObject mt, final SubLObject basemt, final SubLObject v_cache, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject value = mt_relevance_cache_get( v_cache, mt );
    final SubLObject entryP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !value.isVector() )
    {
      if( NIL != entryP )
      {
        Errors.warn( $str2$Corrupt_entry_in_Mt_relevance_cac, mt );
        mt_relevance_cache_remove( v_cache, mt );
      }
      return $mt_relevance_cache_unknown$.getGlobalValue();
    }
    final SubLObject v_genl_mts = Vectors.aref( value, ZERO_INTEGER );
    final SubLObject not_genl_mts = Vectors.aref( value, ONE_INTEGER );
    if( NIL != set_contents.set_contents_memberP( basemt, v_genl_mts, test ) )
    {
      return T;
    }
    if( NIL != set_contents.set_contents_memberP( basemt, not_genl_mts, test ) )
    {
      return NIL;
    }
    return $mt_relevance_cache_unknown$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5147L)
  public static SubLObject mt_relevance_cache_update(final SubLObject mt, final SubLObject basemt, final SubLObject genl_mtP, final SubLObject v_cache, final SubLObject test)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject value = mt_relevance_cache_get( v_cache, mt );
    final SubLObject entryP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( !value.isVector() )
    {
      if( NIL != entryP )
      {
        Errors.warn( $str3$Previous_entry_for__s_corrupt___R, mt );
      }
      value = Vectors.make_vector( TWO_INTEGER, UNPROVIDED );
      mt_relevance_cache_set( v_cache, mt, value );
    }
    if( NIL != genl_mtP )
    {
      Vectors.set_aref( value, ZERO_INTEGER, set_contents.set_contents_add( basemt, Vectors.aref( value, ZERO_INTEGER ), test ) );
    }
    else
    {
      Vectors.set_aref( value, ONE_INTEGER, set_contents.set_contents_add( basemt, Vectors.aref( value, ONE_INTEGER ), test ) );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 5797L)
  public static SubLObject monad_mt_fort_cache_base_mt(final SubLObject mt, final SubLObject basemt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    SubLObject v_genl_mts = cache.cache_get( $monad_mt_fort_cache$.getGlobalValue(), mt );
    final SubLObject entryP = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL == entryP )
    {
      v_genl_mts = set_utilities.construct_set_contents_from_list( genl_mts.all_genl_mts( mt, UNPROVIDED, UNPROVIDED ), Symbols.symbol_function( EQL ), UNPROVIDED );
      cache.cache_set( $monad_mt_fort_cache$.getGlobalValue(), mt, v_genl_mts );
    }
    return set_contents.set_contents_memberP( basemt, v_genl_mts, Symbols.symbol_function( EQL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6151L)
  public static SubLObject clear_monad_mt_fort_cache()
  {
    return cache.cache_clear( $monad_mt_fort_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6380L)
  public static SubLObject monad_mt_naut_cache_base_mt(final SubLObject mt, final SubLObject basemt)
  {
    SubLObject genl_mtP = mt_relevance_cache_base_mt( mt, basemt, $monad_mt_naut_cache$.getGlobalValue(), Symbols.symbol_function( EQUAL ) );
    if( NIL != mt_relevance_cache_unknown_p( genl_mtP ) )
    {
      genl_mtP = genl_mts.monad_genl_mtP( mt, basemt, UNPROVIDED, UNPROVIDED );
      mt_relevance_cache_update( mt, basemt, genl_mtP, $monad_mt_naut_cache$.getGlobalValue(), Symbols.symbol_function( EQUAL ) );
    }
    return genl_mtP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6733L)
  public static SubLObject clear_monad_mt_naut_cache()
  {
    return cache.cache_clear( $monad_mt_naut_cache$.getGlobalValue() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
  public static SubLObject time_mt_cache_base_mt(final SubLObject mt, final SubLObject basemt)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject cached_value = mt_relevance_cache_base_mt( mt, basemt, $time_mt_cache$.getGlobalValue(), Symbols.symbol_function( EQUAL ) );
    if( NIL != mt_relevance_cache_unknown_p( cached_value ) )
    {
      SubLObject mt_time_index = NIL;
      SubLObject mt_time_param = NIL;
      thread.resetMultipleValues();
      final SubLObject mt_time_index_$1 = hlmt.explode_hlmt_temporal_facets( mt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue() );
      final SubLObject mt_time_param_$2 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      mt_time_index = mt_time_index_$1;
      mt_time_param = mt_time_param_$2;
      SubLObject basemt_time_index = NIL;
      SubLObject basemt_time_param = NIL;
      thread.resetMultipleValues();
      final SubLObject basemt_time_index_$3 = hlmt.explode_hlmt_temporal_facets( basemt, hlmt.$default_mt_time_interval$.getGlobalValue(), hlmt.$default_temporal_mt_time_parameter$.getGlobalValue() );
      final SubLObject basemt_time_param_$4 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      basemt_time_index = basemt_time_index_$3;
      basemt_time_param = basemt_time_param_$4;
      final SubLObject genl_mtP = hlmt_relevance.mt_times_visible_p( mt_time_index, basemt_time_index, mt_time_param, basemt_time_param );
      mt_relevance_cache_update( mt, basemt, genl_mtP, $time_mt_cache$.getGlobalValue(), Symbols.symbol_function( EQUAL ) );
      return genl_mtP;
    }
    return cached_value;
  }

  @SubLTranslatedFile.SubL(source = "cycl/mt-relevance-cache.lisp", position = 6824L)
  public static SubLObject clear_time_mt_cache()
  {
    return cache.cache_clear( $time_mt_cache$.getGlobalValue() );
  }

  public static SubLObject declare_mt_relevance_cache_file()
  {
    SubLFiles.declareFunction( me, "basemtP", "BASEMT?", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_mt_relevance_cache", "CLEAR-MT-RELEVANCE-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "update_mt_relevance_cache", "UPDATE-MT-RELEVANCE-CACHE", 2, 0, false );
    SubLFiles.declareFunction( me, "bind_mt_indexicals", "BIND-MT-INDEXICALS", 1, 0, false );
    SubLFiles.declareFunction( me, "monad_basemtP", "MONAD-BASEMT?", 2, 0, false );
    SubLFiles.declareFunction( me, "hlmt_basemtP", "HLMT-BASEMT?", 2, 0, false );
    SubLFiles.declareFunction( me, "non_monad_basemtP", "NON-MONAD-BASEMT?", 2, 0, false );
    SubLFiles.declareFunction( me, "time_basemtP", "TIME-BASEMT?", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_unknown_p", "MT-RELEVANCE-CACHE-UNKNOWN-P", 1, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_get", "MT-RELEVANCE-CACHE-GET", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_set", "MT-RELEVANCE-CACHE-SET", 3, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_remove", "MT-RELEVANCE-CACHE-REMOVE", 2, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_base_mt", "MT-RELEVANCE-CACHE-BASE-MT", 4, 0, false );
    SubLFiles.declareFunction( me, "mt_relevance_cache_update", "MT-RELEVANCE-CACHE-UPDATE", 5, 0, false );
    SubLFiles.declareFunction( me, "monad_mt_fort_cache_base_mt", "MONAD-MT-FORT-CACHE-BASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_monad_mt_fort_cache", "CLEAR-MONAD-MT-FORT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "monad_mt_naut_cache_base_mt", "MONAD-MT-NAUT-CACHE-BASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_monad_mt_naut_cache", "CLEAR-MONAD-MT-NAUT-CACHE", 0, 0, false );
    SubLFiles.declareFunction( me, "time_mt_cache_base_mt", "TIME-MT-CACHE-BASE-MT", 2, 0, false );
    SubLFiles.declareFunction( me, "clear_time_mt_cache", "CLEAR-TIME-MT-CACHE", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_mt_relevance_cache_file()
  {
    $mt_relevance_cache_unknown$ = SubLFiles.deflexical( "*MT-RELEVANCE-CACHE-UNKNOWN*", $kw0$UNKNOWN );
    $monad_mt_fort_cache$ = SubLFiles.deflexical( "*MONAD-MT-FORT-CACHE*", maybeDefault( $sym4$_MONAD_MT_FORT_CACHE_, $monad_mt_fort_cache$, () -> ( cache.new_cache( $int5$256, Symbols.symbol_function( EQL ) ) ) ) );
    $monad_mt_naut_cache$ = SubLFiles.deflexical( "*MONAD-MT-NAUT-CACHE*", maybeDefault( $sym6$_MONAD_MT_NAUT_CACHE_, $monad_mt_naut_cache$, () -> ( cache.new_cache( $int5$256, Symbols.symbol_function( EQUAL ) ) ) ) );
    $time_mt_cache$ = SubLFiles.deflexical( "*TIME-MT-CACHE*", maybeDefault( $sym7$_TIME_MT_CACHE_, $time_mt_cache$, () -> ( cache.new_cache( $int8$1024, Symbols.symbol_function( EQUAL ) ) ) ) );
    return NIL;
  }

  public static SubLObject setup_mt_relevance_cache_file()
  {
    subl_macro_promotions.declare_defglobal( $sym4$_MONAD_MT_FORT_CACHE_ );
    subl_macro_promotions.declare_defglobal( $sym6$_MONAD_MT_NAUT_CACHE_ );
    subl_macro_promotions.declare_defglobal( $sym7$_TIME_MT_CACHE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_mt_relevance_cache_file();
  }

  @Override
  public void initializeVariables()
  {
    init_mt_relevance_cache_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_mt_relevance_cache_file();
  }
  static
  {
    me = new mt_relevance_cache();
    $mt_relevance_cache_unknown$ = null;
    $monad_mt_fort_cache$ = null;
    $monad_mt_naut_cache$ = null;
    $time_mt_cache$ = null;
    $kw0$UNKNOWN = makeKeyword( "UNKNOWN" );
    $str1$Unsupported_Mt_relevance_cache_ty = makeString( "Unsupported Mt relevance cache type." );
    $str2$Corrupt_entry_in_Mt_relevance_cac = makeString( "Corrupt entry in Mt relevance cache for ~s.  Removing entry." );
    $str3$Previous_entry_for__s_corrupt___R = makeString( "Previous entry for ~s corrupt.  Replacing entry." );
    $sym4$_MONAD_MT_FORT_CACHE_ = makeSymbol( "*MONAD-MT-FORT-CACHE*" );
    $int5$256 = makeInteger( 256 );
    $sym6$_MONAD_MT_NAUT_CACHE_ = makeSymbol( "*MONAD-MT-NAUT-CACHE*" );
    $sym7$_TIME_MT_CACHE_ = makeSymbol( "*TIME-MT-CACHE*" );
    $int8$1024 = makeInteger( 1024 );
  }
}
/*
 * 
 * Total time: 131 ms
 * 
 */