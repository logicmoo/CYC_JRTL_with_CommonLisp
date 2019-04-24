package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic0$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) module0118.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic0$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) module0118.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) module0118.NIL;
    SubLObject var10_11 = (SubLObject) module0118.NIL;
    while ( module0118.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) module0118.$ic0$ );
      var10_11 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) module0118.$ic0$ );
      if( module0118.NIL == conses_high.member( var10_11, (SubLObject) module0118.$ic1$, (SubLObject) module0118.UNPROVIDED, (SubLObject) module0118.UNPROVIDED ) )
      {
        var9 = (SubLObject) module0118.T;
      }
      if( var10_11 == module0118.$ic2$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( module0118.NIL != var9 && module0118.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0118.$ic0$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic3$, var4 );
    final SubLObject var11 = (SubLObject) ( ( module0118.NIL != var10 ) ? conses_high.cadr( var10 ) : module0118.NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic4$, var4 );
    final SubLObject var13 = (SubLObject) ( ( module0118.NIL != var12 ) ? conses_high.cadr( var12 ) : module0118.NIL );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic5$, var4 );
    final SubLObject var15 = (SubLObject) ( ( module0118.NIL != var14 ) ? conses_high.cadr( var14 ) : module0118.NIL );
    final SubLObject var16;
    var4 = ( var16 = var5 );
    if( module0118.NIL == var11 )
    {
      Errors.error( (SubLObject) module0118.$ic6$ );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic7$, var6, var11, var15 );
  }

  public static SubLObject f8175(final SubLObject var19)
  {
    if( module0118.NIL != f8176() )
    {
      SubLObject var20 = (SubLObject) module0118.NIL;
      final SubLObject var21 = module0118.$g1466$.getGlobalValue();
      SubLObject var22 = (SubLObject) module0118.NIL;
      try
      {
        var22 = Locks.seize_lock( var21 );
        var20 = module0082.f5651( var19, module0118.$g1467$.getGlobalValue() );
      }
      finally
      {
        if( module0118.NIL != var22 )
        {
          Locks.release_lock( var21 );
        }
      }
      return var20;
    }
    return (SubLObject) module0118.NIL;
  }

  public static SubLObject f8177()
  {
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8178(final SubLObject var19)
  {
    final SubLObject var20 = module0118.$g1466$.getGlobalValue();
    SubLObject var21 = (SubLObject) module0118.NIL;
    try
    {
      var21 = Locks.seize_lock( var20 );
      if( module0118.NIL == module0082.f5646( var19, module0118.$g1467$.getGlobalValue() ) )
      {
        f8179( Symbols.symbol_value( var19 ), module0117.f8146() );
      }
      if( module0118.NIL == f8176() )
      {
        f8180();
      }
    }
    finally
    {
      if( module0118.NIL != var21 )
      {
        Locks.release_lock( var20 );
      }
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8181(final SubLObject var19)
  {
    final SubLObject var20 = module0118.$g1466$.getGlobalValue();
    SubLObject var21 = (SubLObject) module0118.NIL;
    try
    {
      var21 = Locks.seize_lock( var20 );
      module0082.f5655( var19, module0118.$g1467$.getGlobalValue() );
      if( module0118.NIL == module0082.f5651( var19, module0118.$g1467$.getGlobalValue() ) )
      {
        f8182( Symbols.symbol_value( var19 ), module0117.f8146() );
      }
      if( module0118.NIL != module0082.f5648( module0118.$g1467$.getGlobalValue() ) )
      {
        f8183();
      }
    }
    finally
    {
      if( module0118.NIL != var21 )
      {
        Locks.release_lock( var20 );
      }
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8184(final SubLObject var19)
  {
    if( module0118.NIL == f8175( var19 ) )
    {
      f8178( var19 );
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8176()
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0118.NIL != module0118.$g1468$.getGlobalValue() && module0118.NIL != Threads.valid_process_p( module0118.$g1468$.getGlobalValue() ) );
  }

  public static SubLObject f8180()
  {
    final SubLObject var27 = module0118.$g1466$.getGlobalValue();
    SubLObject var28 = (SubLObject) module0118.NIL;
    try
    {
      var28 = Locks.seize_lock( var27 );
      if( module0118.NIL != f8176() )
      {
        f8183();
      }
      module0118.$g1468$.setGlobalValue( module0059.f4352( (SubLObject) module0118.$ic12$, (SubLObject) module0118.$ic13$ ) );
    }
    finally
    {
      if( module0118.NIL != var28 )
      {
        Locks.release_lock( var27 );
      }
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8183()
  {
    final SubLObject var29 = module0118.$g1466$.getGlobalValue();
    SubLObject var30 = (SubLObject) module0118.NIL;
    try
    {
      var30 = Locks.seize_lock( var29 );
      if( module0118.NIL != f8176() )
      {
        Threads.kill_process( module0118.$g1468$.getGlobalValue() );
        module0118.$g1468$.setGlobalValue( (SubLObject) module0118.NIL );
      }
    }
    finally
    {
      if( module0118.NIL != var30 )
      {
        Locks.release_lock( var29 );
      }
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8185()
  {
    if( module0118.NIL == f8176() )
    {
      f8180();
    }
    return module0118.$g1468$.getGlobalValue();
  }

  public static SubLObject f8186()
  {
    final SubLObject var31 = module0118.$g1466$.getGlobalValue();
    final SubLObject var32 = module0117.f8146();
    final SubLObject var33_34 = var31;
    SubLObject var33 = (SubLObject) module0118.NIL;
    Label_0122:
    {
      try
      {
        var33 = Locks.seize_lock( var33_34 );
        SubLObject var34 = module0082.f5665( module0118.$g1467$.getGlobalValue() );
        SubLObject var35 = (SubLObject) module0118.NIL;
        var35 = var34.first();
        while ( module0118.NIL != var34)
        {
          f8179( Symbols.symbol_value( var35 ), var32 );
          var34 = var34.rest();
          var35 = var34.first();
        }
        break Label_0122;
      }
      finally
      {
        if( module0118.NIL != var33 )
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
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) module0118.T );
        final SubLObject var38_39 = var31;
        SubLObject var40_41 = (SubLObject) module0118.NIL;
        try
        {
          var40_41 = Locks.seize_lock( var38_39 );
          SubLObject var37 = module0082.f5665( module0118.$g1467$.getGlobalValue() );
          SubLObject var38 = (SubLObject) module0118.NIL;
          var38 = var37.first();
          while ( module0118.NIL != var37)
          {
            f8182( Symbols.symbol_value( var38 ), var32 );
            var37 = var37.rest();
            var38 = var37.first();
          }
        }
        finally
        {
          if( module0118.NIL != var40_41 )
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
    SubLObject var44 = (SubLObject) module0118.NIL;
    var44 = var43.first();
    while ( module0118.NIL != var43)
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
    SubLObject var44 = (SubLObject) module0118.NIL;
    var44 = var43.first();
    while ( module0118.NIL != var43)
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
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic15$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) module0118.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic15$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = (SubLObject) module0118.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = (SubLObject) module0118.NIL;
    SubLObject var51_52 = (SubLObject) module0118.NIL;
    while ( module0118.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) module0118.$ic15$ );
      var51_52 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, (SubLObject) module0118.$ic15$ );
      if( module0118.NIL == conses_high.member( var51_52, (SubLObject) module0118.$ic16$, (SubLObject) module0118.UNPROVIDED, (SubLObject) module0118.UNPROVIDED ) )
      {
        var9 = (SubLObject) module0118.T;
      }
      if( var51_52 == module0118.$ic2$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( module0118.NIL != var9 && module0118.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0118.$ic15$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic17$, var4 );
    final SubLObject var11 = (SubLObject) ( ( module0118.NIL != var10 ) ? conses_high.cadr( var10 ) : module0118.NIL );
    final SubLObject var12 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic4$, var4 );
    final SubLObject var13 = (SubLObject) ( ( module0118.NIL != var12 ) ? conses_high.cadr( var12 ) : module0118.NIL );
    final SubLObject var14 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic18$, var4 );
    final SubLObject var15 = (SubLObject) ( ( module0118.NIL != var14 ) ? conses_high.cadr( var14 ) : module0118.$ic19$ );
    final SubLObject var16;
    var4 = ( var16 = var5 );
    return f8188( var6, var15, var11, var16 );
  }

  public static SubLObject f8188(final SubLObject var47, final SubLObject var56, final SubLObject var32, final SubLObject var18)
  {
    final SubLObject var57 = f8189( (SubLObject) module0118.$ic20$, var47, var56, (SubLObject) module0118.$ic21$ );
    final SubLObject var58 = f8190( (SubLObject) module0118.$ic20$, var47, var56, (SubLObject) module0118.$ic22$ );
    final SubLObject var59 = f8191( (SubLObject) module0118.$ic23$, var47, var56, (SubLObject) module0118.UNPROVIDED );
    final SubLObject var60 = f8191( (SubLObject) module0118.$ic24$, var47, var56, (SubLObject) module0118.UNPROVIDED );
    final SubLObject var61 = f8191( (SubLObject) module0118.$ic20$, var47, var56, (SubLObject) module0118.$ic25$ );
    final SubLObject var62 = f8191( (SubLObject) module0118.$ic26$, var47, var56, (SubLObject) module0118.$ic27$ );
    final SubLObject var63 = f8189( (SubLObject) module0118.$ic20$, var47, var56, (SubLObject) module0118.$ic28$ );
    final SubLObject var64 = f8191( (SubLObject) module0118.$ic29$, var47, var56, (SubLObject) module0118.UNPROVIDED );
    final SubLObject var65 = f8191( (SubLObject) module0118.$ic30$, var47, var56, (SubLObject) module0118.UNPROVIDED );
    return f8192( var57, var58, var59, var60, var61, var62, var63, var64, var65, var32, var18 );
  }

  public static SubLObject f8192(final SubLObject var31, final SubLObject var57, final SubLObject var58, final SubLObject var59, final SubLObject var60, final SubLObject var61, final SubLObject var42,
      final SubLObject var62, final SubLObject var63, final SubLObject var32, final SubLObject var18)
  {
    return (SubLObject) ConsesLow.listS( (SubLObject) module0118.$ic31$, new SubLObject[] { f8193( var31, var57 ), f8194( var60, var42 ), f8195( var61, var58, var60 ), f8196( var42, (SubLObject) module0118.NIL ), f8197(
        var62, var31, var42, var32, var60 ), f8198( var63, var31, var42, var32, var60 ), f8199( var59, var42 ), f8200( var58, var42 ), ConsesLow.append( var18, (SubLObject) module0118.NIL )
    } );
  }

  public static SubLObject f8201(final SubLObject var64, SubLObject var65)
  {
    if( var65 == module0118.UNPROVIDED )
    {
      var65 = (SubLObject) module0118.NIL;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic32$, var64, var65 );
  }

  public static SubLObject f8193(final SubLObject var66, final SubLObject var57)
  {
    return f8201( var66, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic33$, var57 ) );
  }

  public static SubLObject f8196(final SubLObject var64, SubLObject var65)
  {
    if( var65 == module0118.UNPROVIDED )
    {
      var65 = (SubLObject) module0118.NIL;
    }
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic34$, var64, var65 );
  }

  public static SubLObject f8200(final SubLObject var58, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic35$, var58, (SubLObject) module0118.NIL, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) module0118.$ic37$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic38$, var42 ) ) ) );
  }

  public static SubLObject f8199(final SubLObject var59, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic35$, var59, (SubLObject) module0118.NIL, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) module0118.$ic39$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic38$, var42 ) ) ) );
  }

  public static SubLObject f8194(final SubLObject var60, final SubLObject var42)
  {
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic35$, var60, (SubLObject) module0118.NIL, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic36$, (SubLObject) ConsesLow.list(
        (SubLObject) module0118.$ic40$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic38$, var42 ) ) ) );
  }

  public static SubLObject f8195(final SubLObject var61, final SubLObject var58, final SubLObject var60)
  {
    return (SubLObject) ConsesLow.listS( (SubLObject) module0118.$ic35$, var61, (SubLObject) module0118.NIL, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic41$, (SubLObject) ConsesLow.list( var60 ),
        (SubLObject) ConsesLow.list( var58 ) ), (SubLObject) module0118.$ic42$ );
  }

  public static SubLObject f8197(final SubLObject var62, final SubLObject var31, final SubLObject var42, final SubLObject var32, final SubLObject var60)
  {
    final SubLObject var63 = (SubLObject) module0118.$ic43$;
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic35$, var62, (SubLObject) ConsesLow.list( var63 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic44$, (SubLObject) ConsesLow.list( var31 ),
        (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic41$, (SubLObject) ConsesLow.listS( (SubLObject) module0118.$ic45$, var63, var42, (SubLObject) module0118.$ic46$ ), (SubLObject) ConsesLow.list(
            (SubLObject) module0118.$ic47$, var63, var42 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic48$, (SubLObject) ConsesLow.list( var60 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic49$,
                var63, var32 ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic36$, var63 ) );
  }

  public static SubLObject f8198(final SubLObject var63, final SubLObject var31, final SubLObject var42, final SubLObject var32, final SubLObject var60)
  {
    final SubLObject var64 = (SubLObject) module0118.$ic50$;
    return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic35$, var63, (SubLObject) ConsesLow.list( var64 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic44$, (SubLObject) ConsesLow.list( var31 ),
        (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic51$, var42, (SubLObject) ConsesLow.listS( (SubLObject) module0118.$ic52$, var64, var42, (SubLObject) module0118.$ic46$ ) ), (SubLObject) ConsesLow.list(
            (SubLObject) module0118.$ic48$, (SubLObject) ConsesLow.list( var60 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic53$, var64, var32 ) ) ), (SubLObject) ConsesLow.list(
                (SubLObject) module0118.$ic36$, var64 ) );
  }

  public static SubLObject f8191(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == module0118.UNPROVIDED )
    {
      var69 = (SubLObject) module0118.$ic20$;
    }
    return Packages.intern( Sequences.cconcatenate( var68, new SubLObject[] { var47, var56, var69
    } ), (SubLObject) module0118.UNPROVIDED );
  }

  public static SubLObject f8189(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == module0118.UNPROVIDED )
    {
      var69 = (SubLObject) module0118.$ic20$;
    }
    return Packages.intern( Sequences.cconcatenate( (SubLObject) module0118.$ic54$, new SubLObject[] { var68, var47, var56, var69, module0118.$ic54$
    } ), (SubLObject) module0118.UNPROVIDED );
  }

  public static SubLObject f8190(final SubLObject var68, final SubLObject var47, final SubLObject var56, SubLObject var69)
  {
    if( var69 == module0118.UNPROVIDED )
    {
      var69 = (SubLObject) module0118.$ic20$;
    }
    return Sequences.cconcatenate( var68, new SubLObject[] { var47, var56, var69
    } );
  }

  public static SubLObject f8202(final SubLObject var70)
  {
    if( var70.eql( (SubLObject) module0118.$ic55$ ) )
    {
      return (SubLObject) module0118.$ic56$;
    }
    if( var70.eql( (SubLObject) module0118.$ic57$ ) )
    {
      return (SubLObject) module0118.$ic35$;
    }
    if( var70.eql( (SubLObject) module0118.$ic58$ ) )
    {
      return (SubLObject) module0118.$ic59$;
    }
    Errors.error( (SubLObject) module0118.$ic60$, var70 );
    return (SubLObject) module0118.NIL;
  }

  public static SubLObject f8203(final SubLObject var72, final SubLObject var73)
  {
    return Packages.intern( Sequences.cconcatenate( Symbols.symbol_name( var72 ), new SubLObject[] { module0118.$ic61$, Symbols.symbol_name( var73 )
    } ), (SubLObject) module0118.UNPROVIDED );
  }

  public static SubLObject f8204(final SubLObject var74)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0116.f8053( var74 ) == module0118.$ic62$ || module0116.f8053( var74 ) == module0118.$ic63$ );
  }

  public static SubLObject f8205(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic64$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) module0118.NIL;
    SubLObject var7 = (SubLObject) module0118.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic64$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic64$ );
    var7 = var4.first();
    var4 = var4.rest();
    if( module0118.NIL == var4 )
    {
      final SubLObject var8;
      var4 = ( var8 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic31$, (SubLObject) ConsesLow.listS( (SubLObject) module0118.$ic65$, var6, (SubLObject) module0118.$ic66$ ), (SubLObject) ConsesLow.list(
          (SubLObject) module0118.$ic41$, (SubLObject) ConsesLow.list( (SubLObject) module0118.EQ, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic67$, var6 ), var7 ), (SubLObject) ConsesLow.list(
              (SubLObject) module0118.$ic41$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic68$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic69$, (SubLObject) module0118.$ic70$, var6,
                  (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic67$, var6 ), var7 ) ) ), reader.bq_cons( (SubLObject) module0118.$ic31$, ConsesLow.append( var8, (SubLObject) module0118.NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0118.$ic64$ );
    return (SubLObject) module0118.NIL;
  }

  public static SubLObject f8206(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic71$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) module0118.NIL;
    SubLObject var7 = (SubLObject) module0118.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic71$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0118.$ic71$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = (SubLObject) module0118.NIL;
    SubLObject var9 = var4;
    SubLObject var10 = (SubLObject) module0118.NIL;
    SubLObject var86_87 = (SubLObject) module0118.NIL;
    while ( module0118.NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) module0118.$ic71$ );
      var86_87 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, (SubLObject) module0118.$ic71$ );
      if( module0118.NIL == conses_high.member( var86_87, (SubLObject) module0118.$ic72$, (SubLObject) module0118.UNPROVIDED, (SubLObject) module0118.UNPROVIDED ) )
      {
        var10 = (SubLObject) module0118.T;
      }
      if( var86_87 == module0118.$ic2$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( module0118.NIL != var10 && module0118.NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0118.$ic71$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( (SubLObject) module0118.$ic73$, var4 );
    final SubLObject var12 = (SubLObject) ( ( module0118.NIL != var11 ) ? conses_high.cadr( var11 ) : module0118.$ic55$ );
    var4 = var5;
    if( module0118.NIL == var4 )
    {
      SubLObject var13 = (SubLObject) module0118.NIL;
      final SubLObject var14 = (SubLObject) module0118.$ic74$;
      SubLObject var15 = var7;
      SubLObject var16 = (SubLObject) module0118.NIL;
      var16 = var15.first();
      while ( module0118.NIL != var15)
      {
        final SubLObject var17 = f8202( var12 );
        final SubLObject var18 = (SubLObject) ConsesLow.list( var17, f8203( var6, var16 ), (SubLObject) ConsesLow.list( var14 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic75$, (SubLObject) ConsesLow.list(
            var14, var6 ), (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic36$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic76$, (SubLObject) ConsesLow.list( (SubLObject) module0118.$ic77$, var14 ),
                var16 ) ) ) );
        var13 = (SubLObject) ConsesLow.cons( var18, var13 );
        var15 = var15.rest();
        var16 = var15.first();
      }
      return reader.bq_cons( (SubLObject) module0118.$ic31$, ConsesLow.append( var13, (SubLObject) module0118.NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0118.$ic71$ );
    return (SubLObject) module0118.NIL;
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
    return (SubLObject) module0118.NIL;
  }

  public static SubLObject f8208()
  {
    module0118.$g1466$ = SubLFiles.deflexical( "S#10295", ( module0118.NIL != Symbols.boundp( (SubLObject) module0118.$ic8$ ) ) ? module0118.$g1466$.getGlobalValue() : Locks.make_lock( (SubLObject) module0118.$ic9$ ) );
    module0118.$g1467$ = SubLFiles.deflexical( "S#10296", ( module0118.NIL != Symbols.boundp( (SubLObject) module0118.$ic10$ ) ) ? module0118.$g1467$.getGlobalValue()
        : module0082.f5642( (SubLObject) module0118.UNPROVIDED, (SubLObject) module0118.UNPROVIDED ) );
    module0118.$g1468$ = SubLFiles.deflexical( "S#10297", (SubLObject) ( ( module0118.NIL != Symbols.boundp( (SubLObject) module0118.$ic11$ ) ) ? module0118.$g1468$.getGlobalValue() : module0118.NIL ) );
    return (SubLObject) module0118.NIL;
  }

  public static SubLObject f8209()
  {
    module0003.f57( (SubLObject) module0118.$ic8$ );
    module0003.f57( (SubLObject) module0118.$ic10$ );
    module0003.f57( (SubLObject) module0118.$ic11$ );
    return (SubLObject) module0118.NIL;
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
    module0118.$g1466$ = null;
    module0118.$g1467$ = null;
    module0118.$g1468$ = null;
    $ic0$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10131", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&KEY" ), (SubLObject) SubLObjectFactory.makeSymbol(
        "S#10127", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10298", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10130", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic1$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "PARENT" ), (SubLObject) SubLObjectFactory.makeKeyword( "DOCSTRING" ), (SubLObject) SubLObjectFactory.makeKeyword( "HIERARCHY" ) );
    $ic2$ = SubLObjectFactory.makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic3$ = SubLObjectFactory.makeKeyword( "PARENT" );
    $ic4$ = SubLObjectFactory.makeKeyword( "DOCSTRING" );
    $ic5$ = SubLObjectFactory.makeKeyword( "HIERARCHY" );
    $ic6$ = SubLObjectFactory.makeString( "Must specify a parent class." );
    $ic7$ = SubLObjectFactory.makeSymbol( "S#10103", "CYC" );
    $ic8$ = SubLObjectFactory.makeSymbol( "S#10295", "CYC" );
    $ic9$ = SubLObjectFactory.makeString( "Generic Event Dispatcher Process Lock" );
    $ic10$ = SubLObjectFactory.makeSymbol( "S#10296", "CYC" );
    $ic11$ = SubLObjectFactory.makeSymbol( "S#10297", "CYC" );
    $ic12$ = SubLObjectFactory.makeString( "Generic Event Dispatcher Process" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#10272", "CYC" );
    $ic14$ = SubLObjectFactory.makeKeyword( "TERMINATED" );
    $ic15$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10299", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&KEY" ), (SubLObject) SubLObjectFactory.makeSymbol(
        "S#10259", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10298", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10300", "CYC" ), (SubLObject) SubLObjectFactory
            .makeString( "-EVENT-DISPATCHER" ) ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic16$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "BROKER" ), (SubLObject) SubLObjectFactory.makeKeyword( "DOCSTRING" ), (SubLObject) SubLObjectFactory.makeKeyword( "POSTFIX" ) );
    $ic17$ = SubLObjectFactory.makeKeyword( "BROKER" );
    $ic18$ = SubLObjectFactory.makeKeyword( "POSTFIX" );
    $ic19$ = SubLObjectFactory.makeString( "-EVENT-DISPATCHER" );
    $ic20$ = SubLObjectFactory.makeString( "" );
    $ic21$ = SubLObjectFactory.makeString( "-LOCK" );
    $ic22$ = SubLObjectFactory.makeString( " Lock" );
    $ic23$ = SubLObjectFactory.makeString( "START-" );
    $ic24$ = SubLObjectFactory.makeString( "STOP-" );
    $ic25$ = SubLObjectFactory.makeString( "-RUNNING?" );
    $ic26$ = SubLObjectFactory.makeString( "ENSURE-" );
    $ic27$ = SubLObjectFactory.makeString( "-RUNNING" );
    $ic28$ = SubLObjectFactory.makeString( "-LISTENERS" );
    $ic29$ = SubLObjectFactory.makeString( "REGISTER-LISTENER-WITH-" );
    $ic30$ = SubLObjectFactory.makeString( "DEREGISTER-LISTENER-WITH-" );
    $ic31$ = SubLObjectFactory.makeSymbol( "PROGN" );
    $ic32$ = SubLObjectFactory.makeSymbol( "DEFLEXICAL-PRIVATE" );
    $ic33$ = SubLObjectFactory.makeSymbol( "MAKE-LOCK" );
    $ic34$ = SubLObjectFactory.makeSymbol( "DEFGLOBAL-PRIVATE" );
    $ic35$ = SubLObjectFactory.makeSymbol( "DEFINE-PUBLIC" );
    $ic36$ = SubLObjectFactory.makeSymbol( "RET" );
    $ic37$ = SubLObjectFactory.makeSymbol( "S#10265", "CYC" );
    $ic38$ = SubLObjectFactory.makeSymbol( "QUOTE" );
    $ic39$ = SubLObjectFactory.makeSymbol( "S#10266", "CYC" );
    $ic40$ = SubLObjectFactory.makeSymbol( "S#10263", "CYC" );
    $ic41$ = SubLObjectFactory.makeSymbol( "PUNLESS" );
    $ic42$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "RET" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10264", "CYC" ) ) ) );
    $ic43$ = SubLObjectFactory.makeUninternedSymbol( "US#5169A72" );
    $ic44$ = SubLObjectFactory.makeSymbol( "WITH-LOCK-HELD" );
    $ic45$ = SubLObjectFactory.makeSymbol( "FIND" );
    $ic46$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "QUOTE" ), (SubLObject) module0118.EQUALP ) );
    $ic47$ = SubLObjectFactory.makeSymbol( "CPUSH" );
    $ic48$ = SubLObjectFactory.makeSymbol( "PWHEN" );
    $ic49$ = SubLObjectFactory.makeSymbol( "S#10227", "CYC" );
    $ic50$ = SubLObjectFactory.makeUninternedSymbol( "US#5169A72" );
    $ic51$ = SubLObjectFactory.makeSymbol( "CSETQ" );
    $ic52$ = SubLObjectFactory.makeSymbol( "REMOVE" );
    $ic53$ = SubLObjectFactory.makeSymbol( "S#10228", "CYC" );
    $ic54$ = SubLObjectFactory.makeString( "*" );
    $ic55$ = SubLObjectFactory.makeKeyword( "PROTECTED" );
    $ic56$ = SubLObjectFactory.makeSymbol( "DEFINE-PROTECTED" );
    $ic57$ = SubLObjectFactory.makeKeyword( "PUBLIC" );
    $ic58$ = SubLObjectFactory.makeKeyword( "PRIVATE" );
    $ic59$ = SubLObjectFactory.makeSymbol( "DEFINE-PRIVATE" );
    $ic60$ = SubLObjectFactory.makeString( "Unknown privacy level ~S -- not one of :protected, :public, :private." );
    $ic61$ = SubLObjectFactory.makeString( "-RETRIEVE-" );
    $ic62$ = SubLObjectFactory.makeKeyword( "EVENT-HANDLER-REGISTERED" );
    $ic63$ = SubLObjectFactory.makeKeyword( "EVENT-HANDLER-DEREGISTERED" );
    $ic64$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10058", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10301", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic65$ = SubLObjectFactory.makeSymbol( "CHECK-TYPE" );
    $ic66$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10059", "CYC" ) );
    $ic67$ = SubLObjectFactory.makeSymbol( "S#10054", "CYC" );
    $ic68$ = SubLObjectFactory.makeSymbol( "S#10292", "CYC" );
    $ic69$ = SubLObjectFactory.makeSymbol( "ERROR" );
    $ic70$ = SubLObjectFactory.makeString( "Event ~S is of type ~S, not ~S." );
    $ic71$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10301", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10302", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&KEY" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10303", "CYC" ), (SubLObject) SubLObjectFactory.makeKeyword( "PROTECTED" ) ) ) );
    $ic72$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "PRIVACY-LEVEL" ) );
    $ic73$ = SubLObjectFactory.makeKeyword( "PRIVACY-LEVEL" );
    $ic74$ = SubLObjectFactory.makeUninternedSymbol( "US#35A02DC" );
    $ic75$ = SubLObjectFactory.makeSymbol( "S#10293", "CYC" );
    $ic76$ = SubLObjectFactory.makeSymbol( "GETF" );
    $ic77$ = SubLObjectFactory.makeSymbol( "S#10113", "CYC" );
  }
}
/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/module0118.class Total time: 159 ms
 * 
 * Decompiled with Procyon 0.5.32.
 */