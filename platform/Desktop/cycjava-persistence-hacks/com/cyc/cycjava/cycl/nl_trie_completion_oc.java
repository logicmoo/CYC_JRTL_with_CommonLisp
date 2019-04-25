package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nl_trie_completion_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.nl_trie_completion_oc";
  public static final String myFingerPrint = "4be428f604a7c3486a8223d7056594bde9559cf7c3b5b8d567c277f5ecaa2d0f";
  public static SubLSymbol $g5755$;
  private static SubLSymbol $g5874$;
  private static final SubLSymbol $ic0$;
  private static final SubLString $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLString $ic11$;
  private static final SubLString $ic12$;
  private static final SubLList $ic13$;
  private static final SubLList $ic14$;
  private static final SubLString $ic15$;
  private static final SubLString $ic16$;

  public static SubLObject f45848(final SubLObject var1, SubLObject var2)
  {
    if( var2 == UNPROVIDED )
    {
      var2 = module0585.$g4447$.getDynamicValue();
    }
    assert NIL != Types.stringp( var1 ) : var1;
    if( NIL == f45849( $g5755$.getGlobalValue() ) )
    {
      Errors.warn( $ic1$ );
      return NIL;
    }
    final SubLObject var3 = f45850( var1 );
    final SubLObject var4 = Mapping.mapcan( Symbols.symbol_function( $ic2$ ), module0087.f5984( $g5755$.getGlobalValue(), var3 ), EMPTY_SUBL_OBJECT_ARRAY );
    if( NIL != var2 )
    {
      SubLObject var5 = NIL;
      SubLObject var6 = var4;
      SubLObject var7 = NIL;
      var7 = var6.first();
      while ( NIL != var6)
      {
        if( NIL != module0038.f2675( var7, var3, Symbols.symbol_function( $ic3$ ) ) )
        {
          var5 = ConsesLow.cons( f45851( var7 ), var5 );
        }
        var6 = var6.rest();
        var7 = var6.first();
      }
      return var5;
    }
    return Mapping.mapcar( $ic4$, var4 );
  }

  public static SubLObject f45852(final SubLObject var1, final SubLObject var8)
  {
    assert NIL != Types.stringp( var1 ) : var1;
    assert NIL != Types.function_spec_p( var8 ) : var8;
    SubLObject var9 = NIL;
    SubLObject var10 = f45848( var1, UNPROVIDED );
    SubLObject var11 = NIL;
    var11 = var10.first();
    while ( NIL != var10)
    {
      if( NIL != Sequences.find_if( var8, module0731.f44783( var11, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        var9 = ConsesLow.cons( var11, var9 );
      }
      var10 = var10.rest();
      var11 = var10.first();
    }
    return var9;
  }

  public static SubLObject f45853(final SubLObject var1, final SubLObject var11, SubLObject var12, SubLObject var13)
  {
    if( var12 == UNPROVIDED )
    {
      var12 = NIL;
    }
    if( var13 == UNPROVIDED )
    {
      var13 = module0584.$g4396$.getDynamicValue();
    }
    assert NIL != Types.stringp( var1 ) : var1;
    assert NIL != module0269.f17713( var11, UNPROVIDED ) : var11;
    SubLObject var14 = NIL;
    SubLObject var15 = f45848( var1, UNPROVIDED );
    SubLObject var16 = NIL;
    var16 = var15.first();
    while ( NIL != var15)
    {
      SubLObject var17 = NIL;
      if( NIL == var17 )
      {
        SubLObject var18;
        SubLObject var19;
        for( var18 = module0731.f44783( var16, NIL, $ic7$, T, NIL, var13, $ic8$, NIL, UNPROVIDED ), var19 = NIL, var19 = var18.first(); NIL == var17 && NIL != var18; var17 = module0259.f16854( var19, var11, var12,
            UNPROVIDED ), var18 = var18.rest(), var19 = var18.first() )
        {
        }
      }
      if( NIL != var17 )
      {
        var14 = ConsesLow.cons( var16, var14 );
      }
      var15 = var15.rest();
      var16 = var15.first();
    }
    return var14;
  }

  public static SubLObject f45850(final SubLObject var1)
  {
    return ( NIL != Sequences.find( module0087.$g1177$.getGlobalValue(), var1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? module0038.f2842( $g5874$.getGlobalValue(), module0087.$g1177$.getGlobalValue(), var1 )
        : var1;
  }

  public static SubLObject f45851(final SubLObject var1)
  {
    return ( NIL != Sequences.find( $g5874$.getGlobalValue(), var1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) ) ? module0038.f2842( module0087.$g1177$.getGlobalValue(), $g5874$.getGlobalValue(), var1 ) : var1;
  }

  public static SubLObject f45854()
  {
    if( NIL != f45849( $g5755$.getGlobalValue() ) )
    {
      f45855();
    }
    else
    {
      $g5755$.setGlobalValue( f45856() );
    }
    return $g5755$.getGlobalValue();
  }

  public static SubLObject f45857()
  {
    final SubLThread var17 = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var17 ) && NIL == module0737.f45541( UNPROVIDED ) )
    {
      Errors.error( $ic11$ );
    }
    f45854();
    final SubLObject var18 = module0737.$g5846$.getGlobalValue();
    SubLObject var19 = NIL;
    try
    {
      var19 = Locks.seize_lock( var18 );
      final SubLObject var20_21 = module0737.$g5846$.getGlobalValue();
      SubLObject var22_23 = NIL;
      try
      {
        var22_23 = Locks.seize_lock( var20_21 );
        final SubLObject var20 = module0096.$g1265$.currentBinding( var17 );
        try
        {
          module0096.$g1265$.bind( module0737.$g5827$.getGlobalValue(), var17 );
          final SubLObject var21 = module0054.f3968();
          final SubLObject var22 = module0737.f45538();
          final SubLObject var23 = $ic12$;
          SubLObject var24 = ZERO_INTEGER;
          final SubLObject var25 = module0079.f5406( var22 );
          assert NIL != Types.stringp( var23 ) : var23;
          final SubLObject var24_30 = module0012.$g75$.currentBinding( var17 );
          final SubLObject var26 = module0012.$g76$.currentBinding( var17 );
          final SubLObject var27 = module0012.$g77$.currentBinding( var17 );
          final SubLObject var28 = module0012.$g78$.currentBinding( var17 );
          try
          {
            module0012.$g75$.bind( ZERO_INTEGER, var17 );
            module0012.$g76$.bind( NIL, var17 );
            module0012.$g77$.bind( T, var17 );
            module0012.$g78$.bind( Time.get_universal_time(), var17 );
            module0012.f478( var23 );
            final SubLObject var29 = module0079.f5424( var22 );
            SubLObject var32;
            for( SubLObject var30 = NIL; NIL == var30; var30 = makeBoolean( NIL == var32 ) )
            {
              var17.resetMultipleValues();
              final SubLObject var31 = module0052.f3693( var29 );
              var32 = var17.secondMultipleValue();
              var17.resetMultipleValues();
              if( NIL != var32 )
              {
                SubLObject var34;
                final SubLObject var33 = var34 = var31;
                SubLObject var35 = NIL;
                SubLObject var36 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp( var34, var33, $ic13$ );
                var35 = var34.first();
                var34 = var34.rest();
                cdestructuring_bind.destructuring_bind_must_consp( var34, var33, $ic13$ );
                var36 = var34.first();
                var34 = var34.rest();
                if( NIL == var34 )
                {
                  module0012.note_percent_progress( var24, var25 );
                  var24 = Numbers.add( var24, ONE_INTEGER );
                  if( NIL != module0079.f5404( var36 ) )
                  {
                    module0054.f3973( var36, var21 );
                    while ( NIL == module0054.f3970( var21 ))
                    {
                      final SubLObject var37 = module0054.f3974( var21 );
                      final SubLObject var34_43 = module0079.f5424( var37 );
                      SubLObject var37_46;
                      for( SubLObject var35_44 = NIL; NIL == var35_44; var35_44 = makeBoolean( NIL == var37_46 ) )
                      {
                        var17.resetMultipleValues();
                        final SubLObject var36_45 = module0052.f3693( var34_43 );
                        var37_46 = var17.secondMultipleValue();
                        var17.resetMultipleValues();
                        if( NIL != var37_46 )
                        {
                          SubLObject var49_50;
                          final SubLObject var47_48 = var49_50 = var36_45;
                          SubLObject var38 = NIL;
                          SubLObject var39 = NIL;
                          cdestructuring_bind.destructuring_bind_must_consp( var49_50, var47_48, $ic14$ );
                          var38 = var49_50.first();
                          var49_50 = var49_50.rest();
                          cdestructuring_bind.destructuring_bind_must_consp( var49_50, var47_48, $ic14$ );
                          var39 = var49_50.first();
                          var49_50 = var49_50.rest();
                          if( NIL == var49_50 )
                          {
                            if( NIL != module0079.f5404( var39 ) )
                            {
                              module0054.f3973( var39, var21 );
                            }
                            else if( var39.isCons() )
                            {
                              final SubLObject var40 = var39.first();
                              SubLObject var42;
                              final SubLObject var41 = var42 = var39.rest();
                              SubLObject var55_56 = NIL;
                              var55_56 = var42.first();
                              while ( NIL != var42)
                              {
                                final SubLObject var43 = module0737.f45336( var55_56 );
                                f45858( var43 );
                                var42 = var42.rest();
                                var55_56 = var42.first();
                              }
                            }
                          }
                          else
                          {
                            cdestructuring_bind.cdestructuring_bind_error( var47_48, $ic14$ );
                          }
                        }
                      }
                    }
                  }
                  else if( var36.isCons() )
                  {
                    final SubLObject var44 = var36.first();
                    SubLObject var46;
                    final SubLObject var45 = var46 = var36.rest();
                    SubLObject var47 = NIL;
                    var47 = var46.first();
                    while ( NIL != var46)
                    {
                      final SubLObject var48 = module0737.f45336( var47 );
                      f45858( var48 );
                      var46 = var46.rest();
                      var47 = var46.first();
                    }
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( var33, $ic13$ );
                }
              }
            }
            module0012.f479();
          }
          finally
          {
            module0012.$g78$.rebind( var28, var17 );
            module0012.$g77$.rebind( var27, var17 );
            module0012.$g76$.rebind( var26, var17 );
            module0012.$g75$.rebind( var24_30, var17 );
          }
        }
        finally
        {
          module0096.$g1265$.rebind( var20, var17 );
        }
      }
      finally
      {
        if( NIL != var22_23 )
        {
          Locks.release_lock( var20_21 );
        }
      }
    }
    finally
    {
      if( NIL != var19 )
      {
        Locks.release_lock( var18 );
      }
    }
    return $g5755$.getGlobalValue();
  }

  public static SubLObject f45858(final SubLObject var10)
  {
    final SubLObject var11 = f45850( var10 );
    if( NIL == module0087.f5969( var11 ) )
    {
      Errors.warn( $ic15$, var11 );
    }
    else if( NIL == f45849( $g5755$.getGlobalValue() ) )
    {
      Errors.warn( $ic16$, var11 );
    }
    else if( NIL == conses_high.member( var11, module0087.f5976( $g5755$.getGlobalValue(), var11 ), Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      module0087.f5971( $g5755$.getGlobalValue(), var11, var11 );
    }
    return $g5755$.getGlobalValue();
  }

  public static SubLObject f45859(final SubLObject var10)
  {
    final SubLObject var11 = f45850( var10 );
    if( NIL != module0087.f5969( var11 ) && NIL != f45849( $g5755$.getGlobalValue() ) )
    {
      module0087.f5975( $g5755$.getGlobalValue(), var11, var11 );
    }
    return $g5755$.getGlobalValue();
  }

  public static SubLObject f45855()
  {
    module0087.f5955( $g5755$.getGlobalValue() );
    return $g5755$.getGlobalValue();
  }

  public static SubLObject f45856()
  {
    return module0087.f5954( module0087.f5958( module0737.f45538() ) );
  }

  public static SubLObject f45849(final SubLObject var58)
  {
    return makeBoolean( NIL != module0087.f5956( var58, UNPROVIDED ) && NIL != module0737.f45541( UNPROVIDED ) && module0087.f5958( var58 ).eql( module0087.f5958( module0737.f45538() ) ) );
  }

  public static SubLObject f45860()
  {
    SubLFiles.declareFunction(me, "f45848", "S#44566", 1, 1, false );
    SubLFiles.declareFunction(me, "f45852", "S#50115", 2, 0, false );
    SubLFiles.declareFunction(me, "f45853", "S#44565", 2, 2, false );
    SubLFiles.declareFunction(me, "f45850", "S#50116", 1, 0, false );
    SubLFiles.declareFunction(me, "f45851", "S#50117", 1, 0, false );
    SubLFiles.declareFunction(me, "f45854", "S#49552", 0, 0, false );
    SubLFiles.declareFunction(me, "f45857", "S#50118", 0, 0, false );
    SubLFiles.declareFunction(me, "f45858", "S#49561", 1, 0, false );
    SubLFiles.declareFunction(me, "f45859", "S#49563", 1, 0, false );
    SubLFiles.declareFunction(me, "f45855", "S#50119", 0, 0, false );
    SubLFiles.declareFunction(me, "f45856", "S#50120", 0, 0, false );
    SubLFiles.declareFunction(me, "f45849", "S#50121", 1, 0, false );
    return NIL;
  }

  public static SubLObject f45861()
  {
    $g5755$ = SubLFiles.deflexical( "S#49991", ( NIL != Symbols.boundp( $ic9$ ) ) ? $g5755$.getGlobalValue() : $ic10$ );
    $g5874$ = SubLFiles.deflexical( "S#50122", Characters.code_char( SEVEN_INTEGER ) );
    return NIL;
  }

  public static SubLObject f45862()
  {
    module0003.f57( $ic9$ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f45860();
  }

  @Override
  public void initializeVariables()
  {
    f45861();
  }

  @Override
  public void runTopLevelForms()
  {
    f45862();
  }
  static
  {
    me = new nl_trie_completion_oc();
    $g5755$ = null;
    $g5874$ = null;
    $ic0$ = makeSymbol( "STRINGP" );
    $ic1$ = makeString( "NL Trie Completion Index is not initialized." );
    $ic2$ = makeSymbol( "S#3391", "CYC" );
    $ic3$ = makeSymbol( "CHAR=" );
    $ic4$ = makeSymbol( "S#50117", "CYC" );
    $ic5$ = makeSymbol( "FUNCTION-SPEC-P" );
    $ic6$ = makeSymbol( "S#17581", "CYC" );
    $ic7$ = makeKeyword( "DENOT" );
    $ic8$ = makeKeyword( "NEVER" );
    $ic9$ = makeSymbol( "S#49991", "CYC" );
    $ic10$ = makeKeyword( "UNPREPARED" );
    $ic11$ = makeString( "The NL Trie must be initialized before a completion index can be built." );
    $ic12$ = makeString( "Populating NL Trie completion index..." );
    $ic13$ = ConsesLow.list( makeUninternedSymbol( "US#6CABE02" ), makeUninternedSymbol( "US#7901B45" ) );
    $ic14$ = ConsesLow.list( makeUninternedSymbol( "US#794E61F" ), makeUninternedSymbol( "US#712B0A2" ) );
    $ic15$ = makeString( "Can't use ~S as a key for the NL Trie completion index." );
    $ic16$ = makeString( "NL Trie completion index is not prepared. Can't add ~S" );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 201 ms
 *
 * Decompiled with Procyon 0.5.32.
 */