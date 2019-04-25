package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0118 extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.module0118";
  public static final String myFingerPrint = "3b30838fbe1de9ef766645eb900981ff4d9f27bb6cfaa17c7a4fd3228b7e3b0f";
  private static SubLSymbol $g1466$;
  private static SubLSymbol $g1467$;
  private static SubLSymbol $g1468$;
  private static final SubLList $ic0$;
  private static final SubLList $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLString $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLString $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLString $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLList $ic15$;
  private static final SubLList $ic16$;
  private static final SubLSymbol $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLString $ic19$;
  private static final SubLString $ic20$;
  private static final SubLString $ic21$;
  private static final SubLString $ic22$;
  private static final SubLString $ic23$;
  private static final SubLString $ic24$;
  private static final SubLString $ic25$;
  private static final SubLString $ic26$;
  private static final SubLString $ic27$;
  private static final SubLString $ic28$;
  private static final SubLString $ic29$;
  private static final SubLString $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLSymbol $ic36$;
  private static final SubLSymbol $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLList $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLList $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLSymbol $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLSymbol $ic53$;
  private static final SubLString $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLSymbol $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLString $ic60$;
  private static final SubLString $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLList $ic64$;
  private static final SubLSymbol $ic65$;
  private static final SubLList $ic66$;
  private static final SubLSymbol $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLSymbol $ic69$;
  private static final SubLString $ic70$;
  private static final SubLList $ic71$;
  private static final SubLList $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLSymbol $ic74$;
  private static final SubLSymbol $ic75$;
  private static final SubLSymbol $ic76$;
  private static final SubLSymbol $ic77$;

  public static SubLObject f8174(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic0$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic0$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var10_11 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic0$ );
      var10_11 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic0$ );
      if( NIL == conses_high.member( var10_11, (SubLObject) $ic1$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var10_11 == $ic2$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic0$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic3$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic4$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic5$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : NIL );
    final SubLObject var16;
    var4 = ( var16 = var5 );
    if( NIL == var11 )
    {
      Errors.error( (SubLObject) $ic6$ );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic7$, var6, var11, var15 );
  }

  public static SubLObject f8175(final SubLObject var19)
  {
    if( NIL != f8176() )
    {
      SubLObject var20 = (SubLObject) NIL;
      final SubLObject var21 = $g1466$.getGlobalValue();
      SubLObject var22 = (SubLObject) NIL;
      try
      {
        var22 = Locks.seize_lock( var21 );
        var20 = module0082.f5651( var19, $g1467$.getGlobalValue() );
      }
      finally
      {
        if( NIL != var22 )
        {
          Locks.release_lock( var21 );
        }
      }
      return var20;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f8177()
  {
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8178(final SubLObject var19)
  {
    final SubLObject var20 = $g1466$.getGlobalValue();
    SubLObject var21 = (SubLObject) NIL;
    try
    {
      var21 = Locks.seize_lock( var20 );
      if( NIL == module0082.f5646( var19, $g1467$.getGlobalValue() ) )
      {
        f8179( Symbols.symbol_value( var19 ), module0117.f8146() );
      }
      if( NIL == f8176() )
      {
        f8180();
      }
    }
    finally
    {
      if( NIL != var21 )
      {
        Locks.release_lock( var20 );
      }
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8181(final SubLObject var19)
  {
    final SubLObject var20 = $g1466$.getGlobalValue();
    SubLObject var21 = (SubLObject) NIL;
    try
    {
      var21 = Locks.seize_lock( var20 );
      module0082.f5655( var19, $g1467$.getGlobalValue() );
      if( NIL == module0082.f5651( var19, $g1467$.getGlobalValue() ) )
      {
        f8182( Symbols.symbol_value( var19 ), module0117.f8146() );
      }
      if( NIL != module0082.f5648( $g1467$.getGlobalValue() ) )
      {
        f8183();
      }
    }
    finally
    {
      if( NIL != var21 )
      {
        Locks.release_lock( var20 );
      }
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8184(final SubLObject var19)
  {
    if( NIL == f8175( var19 ) )
    {
      f8178( var19 );
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8176()
  {
    return (SubLObject) makeBoolean( NIL != $g1468$.getGlobalValue() && NIL != Threads.valid_process_p( $g1468$.getGlobalValue() ) );
  }

  public static SubLObject f8180()
  {
    final SubLObject var27 = $g1466$.getGlobalValue();
    SubLObject var28 = (SubLObject) NIL;
    try
    {
      var28 = Locks.seize_lock( var27 );
      if( NIL != f8176() )
      {
        f8183();
      }
      $g1468$.setGlobalValue( module0059.f4352( (SubLObject) $ic12$, (SubLObject) $ic13$ ) );
    }
    finally
    {
      if( NIL != var28 )
      {
        Locks.release_lock( var27 );
      }
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8183()
  {
    final SubLObject var29 = $g1466$.getGlobalValue();
    SubLObject var30 = (SubLObject) NIL;
    try
    {
      var30 = Locks.seize_lock( var29 );
      if( NIL != f8176() )
      {
        Threads.kill_process( $g1468$.getGlobalValue() );
        $g1468$.setGlobalValue( (SubLObject) NIL );
      }
    }
    finally
    {
      if( NIL != var30 )
      {
        Locks.release_lock( var29 );
      }
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8185()
  {
    if( NIL == f8176() )
    {
      f8180();
    }
    return $g1468$.getGlobalValue();
  }

  public static SubLObject f8186()
  {
    final SubLObject var31 = $g1466$.getGlobalValue();
    final SubLObject var32 = module0117.f8146();
    final SubLObject var33_34 = var31;
    SubLObject var33 = (SubLObject) NIL;
    Label_0122:
    {
      try
      {
        var33 = Locks.seize_lock( var33_34 );
        SubLObject var34 = module0082.f5665( $g1467$.getGlobalValue() );
        SubLObject var35 = (SubLObject) NIL;
        var35 = var34.first();
        while ( NIL != var34)
        {
          f8179( Symbols.symbol_value( var35 ), var32 );
          var34 = var34.rest();
          var35 = var34.first();
        }
        break Label_0122;
      }
      finally
      {
        if( NIL != var33 )
        {
          Locks.release_lock( var33_34 );
        }
      }
    }
    try
    { // was while(true)
      return module0117.f8162( var32 );
    }
    finally
    {
      final SubLObject var36 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) T );
        final SubLObject var38_39 = var31;
        SubLObject var40_41 = (SubLObject) NIL;
        try
        {
          var40_41 = Locks.seize_lock( var38_39 );
          SubLObject var37 = module0082.f5665( $g1467$.getGlobalValue() );
          SubLObject var38 = (SubLObject) NIL;
          var38 = var37.first();
          while ( NIL != var37)
          {
            f8182( Symbols.symbol_value( var38 ), var32 );
            var37 = var37.rest();
            var38 = var37.first();
          }
        }
        finally
        {
          if( NIL != var40_41 )
          {
            Locks.release_lock( var38_39 );
          }
        }
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var36 );
      }
    }
  }

  public static SubLObject f8179(final SubLObject var42, final SubLObject var32)
  {
    SubLObject var43 = var42;
    SubLObject var44 = (SubLObject) NIL;
    var44 = var43.first();
    while ( NIL != var43)
    {
      module0117.f8156( var44, var32 );
      var43 = var43.rest();
      var44 = var43.first();
    }
    return var32;
  }

  public static SubLObject f8182(final SubLObject var42, final SubLObject var32)
  {
    SubLObject var43 = var42;
    SubLObject var44 = (SubLObject) NIL;
    var44 = var43.first();
    while ( NIL != var43)
    {
      module0117.f8158( var44, var32 );
      var43 = var43.rest();
      var44 = var43.first();
    }
    return var32;
  }

  public static SubLObject f8187(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic15$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic15$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) NIL;
    SubLObject var51_52 = (SubLObject) NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic15$ );
      var51_52 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) $ic15$ );
      if( NIL == conses_high.member( var51_52, (SubLObject) $ic16$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var9 = (SubLObject) T;
      }
      if( var51_52 == $ic2$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic15$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) $ic17$, var4 );
    final SubLObject var11 = (SubLObject) ( ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) $ic4$, var4 );
    final SubLObject var13 = (SubLObject) ( ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) $ic18$, var4 );
    final SubLObject var15 = (SubLObject) ( ( NIL != var14 ) ? conses_high.cadr( var14 ) : $ic19$ );
    final SubLObject var16;
    var4 = ( var16 = var5 );
    return f8188( var6, var15, var11, var16 );
  }

  public static SubLObject f8188(final SubLObject var47, final SubLObject var56, final SubLObject var32, final SubLObject var18)
  {
    final SubLObject var57 = f8189( (SubLObject) $ic20$, var47, var56, (SubLObject) $ic21$ );
    final SubLObject var58 = f8190( (SubLObject) $ic20$, var47, var56, (SubLObject) $ic22$ );
    final SubLObject var59 = f8191( (SubLObject) $ic23$, var47, var56, (SubLObject) UNPROVIDED );
    final SubLObject var60 = f8191( (SubLObject) $ic24$, var47, var56, (SubLObject) UNPROVIDED );
    final SubLObject var61 = f8191( (SubLObject) $ic20$, var47, var56, (SubLObject) $ic25$ );
    final SubLObject var62 = f8191( (SubLObject) $ic26$, var47, var56, (SubLObject) $ic27$ );
    final SubLObject var63 = f8189( (SubLObject) $ic20$, var47, var56, (SubLObject) $ic28$ );
    final SubLObject var64 = f8191( (SubLObject) $ic29$, var47, var56, (SubLObject) UNPROVIDED );
    final SubLObject var65 = f8191( (SubLObject) $ic30$, var47, var56, (SubLObject) UNPROVIDED );
    return f8192( var57, var58, var59, var60, var61, var62, var63, var64, var65, var32, var18 );
  }

  public static SubLObject f8192(final SubLObject var31, final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var42,
      final SubLObject var62, final SubLObject var63, final SubLObject var32, final SubLObject var18)
  {
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic31$, new SubLObject[] { f8193( var31, var57 ), f8194( var60, var42 ), f8195( var61, var58, var60 ), f8196( var42, (SubLObject) NIL ), f8197(
        var62, var31, var42, var32, var60 ), f8198( var63, var31, var42, var32, var60 ), f8199( var59, var42 ), f8200( var58, var42 ), ConsesLow.append( var18, (SubLObject) NIL )
    } );
  }

  public static SubLObject f8201(final SubLObject var64, SubLObject var65)
  {
    if( var65 == UNPROVIDED )
    {
      var65 = (SubLObject) NIL;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic32$, var64, var65 );
  }

  public static SubLObject f8193(final SubLObject var66, final SubLObject var57)
  {
    return f8201( var66, (SubLObject) ConsesLow.list( (SubLObject) $ic33$, var57 ) );
  }

  public static SubLObject f8196(final SubLObject var64, SubLObject var65)
  {
    if( var65 == UNPROVIDED )
    {
      var65 = (SubLObject) NIL;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic34$, var64, var65 );
  }

  public static SubLObject f8200(final SubLObject var58, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) $ic35$, var58, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) $ic37$, (SubLObject) ConsesLow.list( (SubLObject) $ic38$, var42 ) ) ) );
  }

  public static SubLObject f8199(final SubLObject var59, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) $ic35$, var59, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) $ic39$, (SubLObject) ConsesLow.list( (SubLObject) $ic38$, var42 ) ) ) );
  }

  public static SubLObject f8194(final SubLObject var60, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) $ic35$, var60, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) $ic40$, (SubLObject) ConsesLow.list( (SubLObject) $ic38$, var42 ) ) ) );
  }

  public static SubLObject f8195(final SubLObject var61, final SubLObject var58, final SubLObject var60)
  {
    return (SubLObject) ConsesLow.listS( (SubLObject) $ic35$, var61, (SubLObject) NIL, (SubLObject) ConsesLow.list( (SubLObject) $ic41$, (SubLObject) ConsesLow.list( var60 ),
        (SubLObject) ConsesLow.list( var58 ) ), (SubLObject) $ic42$ );
  }

  public static SubLObject f8197(final SubLObject var62, final SubLObject var31, final SubLObject var42, final SubLObject var32, final SubLObject var60)
  {
    final SubLObject var63 = (SubLObject) $ic43$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic35$, var62, (SubLObject) ConsesLow.list( var63 ), (SubLObject) ConsesLow.list( (SubLObject) $ic44$, (SubLObject) ConsesLow.list( var31 ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic41$, (SubLObject) ConsesLow.listS( (SubLObject) $ic45$, var63, var42, (SubLObject) $ic46$ ), (SubLObject) ConsesLow.list(
            (SubLObject) $ic47$, var63, var42 ), (SubLObject) ConsesLow.list( (SubLObject) $ic48$, (SubLObject) ConsesLow.list( var60 ), (SubLObject) ConsesLow.list( (SubLObject) $ic49$,
                var63, var32 ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic36$, var63 ) );
  }

  public static SubLObject f8198(final SubLObject var63, final SubLObject var31, final SubLObject var42, final SubLObject var32, final SubLObject var60)
  {
    final SubLObject var64 = (SubLObject) $ic50$;
    return (SubLObject) ConsesLow.list( (SubLObject) $ic35$, var63, (SubLObject) ConsesLow.list( var64 ), (SubLObject) ConsesLow.list( (SubLObject) $ic44$, (SubLObject) ConsesLow.list( var31 ),
        (SubLObject) ConsesLow.list( (SubLObject) $ic51$, var42, (SubLObject) ConsesLow.listS( (SubLObject) $ic52$, var64, var42, (SubLObject) $ic46$ ) ), (SubLObject) ConsesLow.list(
            (SubLObject) $ic48$, (SubLObject) ConsesLow.list( var60 ), (SubLObject) ConsesLow.list( (SubLObject) $ic53$, var64, var32 ) ) ), (SubLObject) ConsesLow.list(
                (SubLObject) $ic36$, var64 ) );
  }

  public static SubLObject f8191(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == UNPROVIDED )
    {
      var69 = (SubLObject) $ic20$;
    }
    return Packages.intern( Sequences.cconcatenate( var68, new SubLObject[] { var47, var56, var69
    } ), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f8189(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == UNPROVIDED )
    {
      var69 = (SubLObject) $ic20$;
    }
    return Packages.intern( Sequences.cconcatenate( (SubLObject) $ic54$, new SubLObject[] { var68, var47, var56, var69, $ic54$
    } ), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f8190(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == UNPROVIDED )
    {
      var69 = (SubLObject) $ic20$;
    }
    return Sequences.cconcatenate( var68, new SubLObject[] { var47, var56, var69
    } );
  }

  public static SubLObject f8202(final SubLObject var70)
  {
    if( var70.eql( (SubLObject) $ic55$ ) )
    {
      return (SubLObject) $ic56$;
    }
    if( var70.eql( (SubLObject) $ic57$ ) )
    {
      return (SubLObject) $ic35$;
    }
    if( var70.eql( (SubLObject) $ic58$ ) )
    {
      return (SubLObject) $ic59$;
    }
    Errors.error( (SubLObject) $ic60$, var70 );
    return (SubLObject) NIL;
  }

  public static SubLObject f8203(final SubLObject var72, final SubLObject var73)
  {
    return Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( var72 ), new SubLObject[] { $ic61$, Symbols.symbol_name( var73 )
    } ), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f8204(final SubLObject var74)
  {
    return (SubLObject) makeBoolean( module0116.f8053( var74 ) == $ic62$ || module0116.f8053( var74 ) == $ic63$ );
  }

  public static SubLObject f8205(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic64$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic64$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic64$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic31$, (SubLObject) ConsesLow.listS( (SubLObject) $ic65$, var6, (SubLObject) $ic66$ ), (SubLObject) ConsesLow.list(
          (SubLObject) $ic41$, (SubLObject) ConsesLow.list( (SubLObject) EQ, (SubLObject) ConsesLow.list( (SubLObject) $ic67$, var6 ), var7 ), (SubLObject) ConsesLow.list(
              (SubLObject) $ic41$, (SubLObject) ConsesLow.list( (SubLObject) $ic68$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic69$, (SubLObject) $ic70$, var6,
                  (SubLObject) ConsesLow.list( (SubLObject) $ic67$, var6 ), var7 ) ) ), reader.bq_cons( (SubLObject) $ic31$, ConsesLow.append( var8, (SubLObject) NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic64$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f8206(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic71$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) NIL;
    SubLObject var7 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic71$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) $ic71$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = (SubLObject) NIL;
    SubLObject var9 = var4;
    SubLObject var10 = (SubLObject) NIL;
    SubLObject var86_87 = (SubLObject) NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) $ic71$ );
      var86_87 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) $ic71$ );
      if( NIL == conses_high.member( var86_87, (SubLObject) $ic72$, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
      {
        var10 = (SubLObject) T;
      }
      if( var86_87 == $ic2$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic71$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( (SubLObject) $ic73$, var4 );
    final SubLObject var12 = (SubLObject) ( ( NIL != var11 ) ? conses_high.cadr( var11 ) : $ic55$ );
    var4 = var5;
    if( NIL == var4 )
    {
      SubLObject var13 = (SubLObject) NIL;
      final SubLObject var14 = (SubLObject) $ic74$;
      SubLObject var15 = var7;
      SubLObject var16 = (SubLObject) NIL;
      var16 = var15.first();
      while ( NIL != var15)
      {
        final SubLObject var17 = f8202( var12 );
        final SubLObject var18 = (SubLObject) ConsesLow.list( var17, f8203( var6, var16 ), (SubLObject) ConsesLow.list( var14 ), (SubLObject) ConsesLow.list( (SubLObject) $ic75$, (SubLObject) ConsesLow.list(
            var14, var6 ), (SubLObject) ConsesLow.list( (SubLObject) $ic36$, (SubLObject) ConsesLow.list( (SubLObject) $ic76$, (SubLObject) ConsesLow.list( (SubLObject) $ic77$, var14 ),
                var16 ) ) ) );
        var13 = (SubLObject) ConsesLow.cons( var18, var13 );
        var15 = var15.rest();
        var16 = var15.first();
      }
      return reader.bq_cons( (SubLObject) $ic31$, ConsesLow.append( var13, (SubLObject) NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) $ic71$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f8207()
  {
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0118", "f8174", "S#10262" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8175", "S#10263", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8177", "S#10264", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8178", "S#10265", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8181", "S#10266", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8184", "S#10267", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8176", "S#10268", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8180", "S#10269", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8183", "S#10270", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8185", "S#10271", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8186", "S#10272", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8179", "S#10273", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8182", "S#10274", 2, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0118", "f8187", "S#10275" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8188", "S#10276", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8192", "S#10277", 11, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8201", "S#10278", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8193", "S#10279", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8196", "S#10280", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8200", "S#10281", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8199", "S#10282", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8194", "S#10283", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8195", "S#10284", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8197", "S#10285", 5, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8198", "S#10286", 5, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8191", "S#10287", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8189", "S#10288", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8190", "S#10289", 3, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8202", "S#10290", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8203", "S#10291", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0118", "f8204", "S#10292", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0118", "f8205", "S#10293" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0118", "f8206", "S#10294" );
    return (SubLObject) NIL;
  }

  public static SubLObject f8208()
  {
    $g1466$ = SubLFiles.deflexical( "S#10295", ( NIL != Symbols.boundp( (SubLObject) $ic8$ ) ) ? $g1466$.getGlobalValue() : Locks.make_lock( (SubLObject) $ic9$ ) );
    $g1467$ = SubLFiles.deflexical( "S#10296", ( NIL != Symbols.boundp( (SubLObject) $ic10$ ) ) ? $g1467$.getGlobalValue()
        : module0082.f5642( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) );
    $g1468$ = SubLFiles.deflexical( "S#10297", (SubLObject) ( ( NIL != Symbols.boundp( (SubLObject) $ic11$ ) ) ? $g1468$.getGlobalValue() : NIL ) );
    return (SubLObject) NIL;
  }

  public static SubLObject f8209()
  {
    module0003.f57( (SubLObject) $ic8$ );
    module0003.f57( (SubLObject) $ic10$ );
    module0003.f57( (SubLObject) $ic11$ );
    return (SubLObject) NIL;
  }

  @Override
  public void declareFunctions()
  {
    f8207();
  }

  @Override
  public void initializeVariables()
  {
    f8208();
  }

  @Override
  public void runTopLevelForms()
  {
    f8209();
  }
  static
  {
    me = (SubLFile) new module0118();
    $g1466$ = null;
    $g1467$ = null;
    $g1468$ = null;
    $ic0$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10131", "CYC" ), (SubLObject) makeSymbol( "&KEY" ), (SubLObject) makeSymbol(
        "S#10127", "CYC" ), (SubLObject) makeSymbol( "S#10298", "CYC" ), (SubLObject) makeSymbol( "S#10130", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic1$ = ConsesLow.list( (SubLObject) makeKeyword( "PARENT" ), (SubLObject) makeKeyword( "DOCSTRING" ), (SubLObject) makeKeyword( "HIERARCHY" ) );
    $ic2$ = makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic3$ = makeKeyword( "PARENT" );
    $ic4$ = makeKeyword( "DOCSTRING" );
    $ic5$ = makeKeyword( "HIERARCHY" );
    $ic6$ = makeString( "Must specify a parent class." );
    $ic7$ = makeSymbol( "S#10103", "CYC" );
    $ic8$ = makeSymbol( "S#10295", "CYC" );
    $ic9$ = makeString( "Generic Event Dispatcher Process Lock" );
    $ic10$ = makeSymbol( "S#10296", "CYC" );
    $ic11$ = makeSymbol( "S#10297", "CYC" );
    $ic12$ = makeString( "Generic Event Dispatcher Process" );
    $ic13$ = makeSymbol( "S#10272", "CYC" );
    $ic14$ = makeKeyword( "TERMINATED" );
    $ic15$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10299", "CYC" ), (SubLObject) makeSymbol( "&KEY" ), (SubLObject) makeSymbol(
        "S#10259", "CYC" ), (SubLObject) makeSymbol( "S#10298", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10300", "CYC" ), (SubLObject) SubLObjectFactory
            .makeString( "-EVENT-DISPATCHER" ) ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic16$ = ConsesLow.list( (SubLObject) makeKeyword( "BROKER" ), (SubLObject) makeKeyword( "DOCSTRING" ), (SubLObject) makeKeyword( "POSTFIX" ) );
    $ic17$ = makeKeyword( "BROKER" );
    $ic18$ = makeKeyword( "POSTFIX" );
    $ic19$ = makeString( "-EVENT-DISPATCHER" );
    $ic20$ = makeString( "" );
    $ic21$ = makeString( "-LOCK" );
    $ic22$ = makeString( " Lock" );
    $ic23$ = makeString( "START-" );
    $ic24$ = makeString( "STOP-" );
    $ic25$ = makeString( "-RUNNING?" );
    $ic26$ = makeString( "ENSURE-" );
    $ic27$ = makeString( "-RUNNING" );
    $ic28$ = makeString( "-LISTENERS" );
    $ic29$ = makeString( "REGISTER-LISTENER-WITH-" );
    $ic30$ = makeString( "DEREGISTER-LISTENER-WITH-" );
    $ic31$ = makeSymbol( "PROGN" );
    $ic32$ = makeSymbol( "DEFLEXICAL-PRIVATE" );
    $ic33$ = makeSymbol( "MAKE-LOCK" );
    $ic34$ = makeSymbol( "DEFGLOBAL-PRIVATE" );
    $ic35$ = makeSymbol( "DEFINE-PUBLIC" );
    $ic36$ = makeSymbol( "RET" );
    $ic37$ = makeSymbol( "S#10265", "CYC" );
    $ic38$ = makeSymbol( "QUOTE" );
    $ic39$ = makeSymbol( "S#10266", "CYC" );
    $ic40$ = makeSymbol( "S#10263", "CYC" );
    $ic41$ = makeSymbol( "PUNLESS" );
    $ic42$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "RET" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10264", "CYC" ) ) ) );
    $ic43$ = makeUninternedSymbol( "US#5169A72" );
    $ic44$ = makeSymbol( "WITH-LOCK-HELD" );
    $ic45$ = makeSymbol( "FIND" );
    $ic46$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "QUOTE" ), (SubLObject) EQUALP ) );
    $ic47$ = makeSymbol( "CPUSH" );
    $ic48$ = makeSymbol( "PWHEN" );
    $ic49$ = makeSymbol( "S#10227", "CYC" );
    $ic50$ = makeUninternedSymbol( "US#5169A72" );
    $ic51$ = makeSymbol( "CSETQ" );
    $ic52$ = makeSymbol( "REMOVE" );
    $ic53$ = makeSymbol( "S#10228", "CYC" );
    $ic54$ = makeString( "*" );
    $ic55$ = makeKeyword( "PROTECTED" );
    $ic56$ = makeSymbol( "DEFINE-PROTECTED" );
    $ic57$ = makeKeyword( "PUBLIC" );
    $ic58$ = makeKeyword( "PRIVATE" );
    $ic59$ = makeSymbol( "DEFINE-PRIVATE" );
    $ic60$ = makeString( "Unknown privacy level ~S -- not one of :protected, :public, :private." );
    $ic61$ = makeString( "-RETRIEVE-" );
    $ic62$ = makeKeyword( "EVENT-HANDLER-REGISTERED" );
    $ic63$ = makeKeyword( "EVENT-HANDLER-DEREGISTERED" );
    $ic64$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10058", "CYC" ), (SubLObject) makeSymbol( "S#10301", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic65$ = makeSymbol( "CHECK-TYPE" );
    $ic66$ = ConsesLow.list( (SubLObject) makeSymbol( "S#10059", "CYC" ) );
    $ic67$ = makeSymbol( "S#10054", "CYC" );
    $ic68$ = makeSymbol( "S#10292", "CYC" );
    $ic69$ = makeSymbol( "ERROR" );
    $ic70$ = makeString( "Event ~S is of type ~S, not ~S." );
    $ic71$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10301", "CYC" ), (SubLObject) makeSymbol( "S#10302", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&KEY" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#10303", "CYC" ), (SubLObject) makeKeyword( "PROTECTED" ) ) ) );
    $ic72$ = ConsesLow.list( (SubLObject) makeKeyword( "PRIVACY-LEVEL" ) );
    $ic73$ = makeKeyword( "PRIVACY-LEVEL" );
    $ic74$ = makeUninternedSymbol( "US#35A02DC" );
    $ic75$ = makeSymbol( "S#10293", "CYC" );
    $ic76$ = makeSymbol( "GETF" );
    $ic77$ = makeSymbol( "S#10113", "CYC" );
  }
}
/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 159 ms
 * 
 * Decompiled with Procyon 0.5.32.
 */