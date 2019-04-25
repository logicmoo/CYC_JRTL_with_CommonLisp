package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class oc_assertions_interface extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.oc_assertions_interface";
  public static final String myFingerPrint = "d7c60603a43dfb4305af5dbd9aea4e748e60c3b1197915fdbf75ea35a74fcf30";
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLList $ic9$;
  private static final SubLString $ic10$;
  private static final SubLList $ic11$;
  private static final SubLList $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLList $ic17$;
  private static final SubLString $ic18$;
  private static final SubLList $ic19$;
  private static final SubLList $ic20$;
  private static final SubLSymbol $ic21$;
  private static final SubLString $ic22$;
  private static final SubLList $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLString $ic25$;
  private static final SubLList $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLString $ic28$;
  private static final SubLList $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLList $ic32$;
  private static final SubLString $ic33$;
  private static final SubLList $ic34$;
  private static final SubLList $ic35$;
  private static final SubLSymbol $ic36$;
  private static final SubLString $ic37$;
  private static final SubLList $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLString $ic41$;
  private static final SubLList $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLString $ic44$;
  private static final SubLList $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLString $ic47$;
  private static final SubLList $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLString $ic50$;
  private static final SubLList $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLString $ic53$;
  private static final SubLList $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLString $ic56$;
  private static final SubLList $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLString $ic59$;
  private static final SubLList $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLString $ic62$;
  private static final SubLList $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLString $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLString $ic67$;
  private static final SubLList $ic68$;
  private static final SubLSymbol $ic69$;
  private static final SubLList $ic70$;
  private static final SubLString $ic71$;
  private static final SubLList $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLList $ic74$;
  private static final SubLString $ic75$;
  private static final SubLList $ic76$;
  private static final SubLSymbol $ic77$;
  private static final SubLList $ic78$;
  private static final SubLString $ic79$;
  private static final SubLList $ic80$;
  private static final SubLSymbol $ic81$;
  private static final SubLList $ic82$;
  private static final SubLString $ic83$;
  private static final SubLList $ic84$;
  private static final SubLSymbol $ic85$;
  private static final SubLSymbol $ic86$;
  private static final SubLSymbol $ic87$;
  private static final SubLSymbol $ic88$;
  private static final SubLSymbol $ic89$;
  private static final SubLSymbol $ic90$;
  private static final SubLList $ic91$;
  private static final SubLString $ic92$;
  private static final SubLList $ic93$;
  private static final SubLSymbol $ic94$;
  private static final SubLString $ic95$;
  private static final SubLSymbol $ic96$;
  private static final SubLList $ic97$;
  private static final SubLString $ic98$;
  private static final SubLList $ic99$;
  private static final SubLList $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLString $ic102$;
  private static final SubLList $ic103$;
  private static final SubLSymbol $ic104$;
  private static final SubLList $ic105$;
  private static final SubLString $ic106$;
  private static final SubLList $ic107$;
  private static final SubLSymbol $ic108$;
  private static final SubLString $ic109$;
  private static final SubLList $ic110$;

  public static SubLObject f11057(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7)
  {
    assert NIL != module0232.f15320( var1 ) : var1;
    assert NIL != module0161.f10481( var2 ) : var2;
    assert NIL != Types.listp( var3 ) : var3;
    assert NIL != module0130.f8503( var4 ) : var4;
    assert NIL != module0130.f8511( var5 ) : var5;
    assert NIL != module0130.f8507( var6 ) : var6;
    if( NIL != var7 && !areAssertionsDisabledFor( me ) && NIL == module0191.f11932( var7 ) )
    {
      throw new AssertionError( var7 );
    }
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic7$, var1, var2, var3, var4, var5, var6, var7 );
    if( NIL != oc_hl_interface_infrastructure.f8289() )
    {
      final SubLObject var8 = module0018.$g573$.getGlobalValue();
      SubLObject var9 = NIL;
      try
      {
        var9 = Locks.seize_lock( var8 );
        final SubLObject var10 = ( NIL != oc_hl_interface_infrastructure.f8288() ) ? f11058( var1, var2, var3, var4, var5, var6, var7 ) : f11059( var1, var2, var3, var4, var5, var6, var7 );
        oc_hl_interface_infrastructure.f8309();
        return var10;
      }
      finally
      {
        if( NIL != var9 )
        {
          Locks.release_lock( var8 );
        }
      }
    }
    return NIL;
  }

  public static SubLObject f11058(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7)
  {
    final SubLThread var8 = SubLProcess.currentSubLThread();
    final SubLObject var9 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic13$, module0035.f2241( var1 ), module0035.f2241( var2 ), module0035.f2241( var3 ), module0035.f2241( var4 ), module0035.f2241( var5 ),
        module0035.f2241( var6 ), module0035.f2241( var7 ) ) );
    SubLObject var10 = NIL;
    final SubLObject var11 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var8 );
    try
    {
      oc_hl_interface_infrastructure.$g1483$.bind( T, var8 );
      var10 = oc_assertions_low.f11260( var9 );
      if( NIL != oc_hl_interface_infrastructure.f8287() )
      {
        oc_assertions_low.f11256( var10, var9, var1, var2, var3, var4, var5, var6, var7 );
      }
    }
    finally
    {
      oc_hl_interface_infrastructure.$g1483$.rebind( var11, var8 );
    }
    return var10;
  }

  public static SubLObject f11059(final SubLObject var1, final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6, final SubLObject var7)
  {
    final SubLObject var8 = oc_assertions_low.f11255( var1, var2, var3, var4, var5, var6, var7 );
    return assertion_handles_oc.f11053( var8 );
  }

  public static SubLObject f11060(final SubLObject var10)
  {
    final SubLThread var11 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    SubLObject var12 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic15$, var10, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var12 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic15$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var13 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var11 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var11 );
        final SubLObject var14 = module0018.$g573$.getGlobalValue();
        SubLObject var15 = NIL;
        try
        {
          var15 = Locks.seize_lock( var14 );
          return oc_assertions_low.f11264( var10 );
        }
        finally
        {
          if( NIL != var15 )
          {
            Locks.release_lock( var14 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var13, var11 );
      }
    }
    return var12;
  }

  public static SubLObject f11061(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic21$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11175( var10 );
  }

  public static SubLObject f11062(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic24$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11177( var10 );
  }

  public static SubLObject f11063(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic27$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11179( var10 );
  }

  public static SubLObject f11064(final SubLObject var1, final SubLObject var2)
  {
    assert NIL != module0232.f15320( var1 ) : var1;
    assert NIL != module0161.f10480( var2 ) : var2;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic31$, ConsesLow.list( $ic16$, var1 ), ConsesLow.list( $ic16$, var2 ) ) );
    }
    return module0217.f14416( var1, var2 );
  }

  public static SubLObject f11065(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic36$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11181( var10 );
  }

  public static SubLObject f11066(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic39$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11225( var10 );
  }

  public static SubLObject f11067(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic40$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11180( var10 );
  }

  public static SubLObject f11068(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic43$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11183( var10 );
  }

  public static SubLObject f11069(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic46$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11184( var10 );
  }

  public static SubLObject f11070(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic49$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11186( var10 );
  }

  public static SubLObject f11071(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic52$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11188( var10 );
  }

  public static SubLObject f11072(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic55$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11190( var10 );
  }

  public static SubLObject f11073(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic58$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11192( var10 );
  }

  public static SubLObject f11074(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic61$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11195( var10 );
  }

  public static SubLObject f11075(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic64$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11197( var10 );
  }

  public static SubLObject f11076(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic66$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11199( var10 );
  }

  public static SubLObject f11077(final SubLObject var10, final SubLObject var17)
  {
    final SubLThread var18 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8503( var17 ) : var17;
    SubLObject var19 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic69$, var10, var17, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var19 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic69$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var17 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var20 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var18 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var18 );
        final SubLObject var21 = module0018.$g573$.getGlobalValue();
        SubLObject var22 = NIL;
        try
        {
          var22 = Locks.seize_lock( var21 );
          final SubLObject var23 = module0178.f11291( var10 );
          final SubLObject var21_22 = oc_assertions_low.f11232( var10, var17 );
          module0197.f12273( var10, var23, var17 );
          return var21_22;
        }
        finally
        {
          if( NIL != var22 )
          {
            Locks.release_lock( var21 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var20, var18 );
      }
    }
    return var19;
  }

  public static SubLObject f11078(final SubLObject var10, final SubLObject var23)
  {
    final SubLThread var24 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8511( var23 ) : var23;
    SubLObject var25 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic73$, var10, var23, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var25 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic73$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var23 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var26 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var24 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var24 );
        final SubLObject var27 = module0018.$g573$.getGlobalValue();
        SubLObject var28 = NIL;
        try
        {
          var28 = Locks.seize_lock( var27 );
          final SubLObject var29 = module0178.f11292( var10 );
          final SubLObject var21_27 = oc_assertions_low.f11235( var10, var23 );
          module0197.f12277( var10, var29, var23 );
          return var21_27;
        }
        finally
        {
          if( NIL != var28 )
          {
            Locks.release_lock( var27 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var26, var24 );
      }
    }
    return var25;
  }

  public static SubLObject f11079(final SubLObject var10, final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8507( var28 ) : var28;
    SubLObject var30 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic77$, var10, var28, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var30 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic77$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var28 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var31 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var29 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var29 );
        final SubLObject var32 = module0018.$g573$.getGlobalValue();
        SubLObject var33 = NIL;
        try
        {
          var33 = Locks.seize_lock( var32 );
          final SubLObject var34 = module0178.f11293( var10 );
          final SubLObject var21_32 = oc_assertions_low.f11236( var10, var28 );
          module0197.f12281( var10, var34, var28 );
          return var21_32;
        }
        finally
        {
          if( NIL != var33 )
          {
            Locks.release_lock( var32 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var31, var29 );
      }
    }
    return var30;
  }

  public static SubLObject f11080(final SubLObject var10, final SubLObject var33)
  {
    final SubLThread var34 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != Types.listp( var33 ) : var33;
    SubLObject var35 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic81$, var10, var33, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var35 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic81$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var33 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var36 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var34 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var34 );
        final SubLObject var37 = module0018.$g573$.getGlobalValue();
        SubLObject var38 = NIL;
        try
        {
          var38 = Locks.seize_lock( var37 );
          final SubLObject var39 = module0178.f11294( var10 );
          final SubLObject var21_37 = oc_assertions_low.f11239( var10, var33 );
          module0197.f12285( var10, var39, var33 );
          return var21_37;
        }
        finally
        {
          if( NIL != var38 )
          {
            Locks.release_lock( var37 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var36, var34 );
      }
    }
    return var35;
  }

  public static SubLObject f11081(final SubLObject var38)
  {
    return SubLObjectFactory.makeBoolean( NIL == var38 || var38 == $ic85$ || NIL != module0173.f10955( var38 ) );
  }

  public static SubLObject f11082(final SubLObject var39)
  {
    return SubLObjectFactory.makeBoolean( NIL == var39 || var39 == $ic85$ || NIL != module0051.f3603( var39 ) );
  }

  public static SubLObject f11083(final SubLObject var40)
  {
    return SubLObjectFactory.makeBoolean( NIL == var40 || var40 == $ic85$ || NIL != module0173.f10955( var40 ) );
  }

  public static SubLObject f11084(final SubLObject var41)
  {
    return SubLObjectFactory.makeBoolean( NIL == var41 || var41 == $ic85$ || NIL != module0051.f3631( var41 ) );
  }

  public static SubLObject f11085(final SubLObject var10, final SubLObject var38, final SubLObject var39, final SubLObject var40, final SubLObject var41)
  {
    final SubLThread var42 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != f11081( var38 ) : var38;
    assert NIL != f11082( var39 ) : var39;
    assert NIL != f11083( var40 ) : var40;
    assert NIL != f11084( var41 ) : var41;
    SubLObject var43 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic90$, var10, var38, var39, var40, var41, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var43 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic90$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var38 ), ConsesLow.list( $ic16$, var39 ), ConsesLow.list( $ic16$, var40 ), ConsesLow
          .list( $ic16$, var41 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var44 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var42 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var42 );
        final SubLObject var45 = module0018.$g573$.getGlobalValue();
        SubLObject var46 = NIL;
        try
        {
          var46 = Locks.seize_lock( var45 );
          if( NIL != module0178.f11375( var10 ) )
          {
            if( var38 != $ic85$ && !module0178.f11295( var10 ).equal( var38 ) )
            {
              f11086( var10, var38 );
            }
            if( var39 != $ic85$ && !module0178.f11296( var10 ).equal( var39 ) )
            {
              f11087( var10, var39 );
            }
            if( var40 != $ic85$ && !module0178.f11297( var10 ).equal( var40 ) )
            {
              f11088( var10, var40 );
            }
            if( var41 != $ic85$ && !module0178.f11298( var10 ).equal( var41 ) )
            {
              f11089( var10, var41 );
            }
          }
          return var10;
        }
        finally
        {
          if( NIL != var46 )
          {
            Locks.release_lock( var45 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var44, var42 );
      }
    }
    return var43;
  }

  public static SubLObject f11086(final SubLObject var10, final SubLObject var44)
  {
    final SubLObject var45 = module0178.f11295( var10 );
    final SubLObject var46 = oc_assertions_low.f11250( var10, var44 );
    module0197.f12289( var10, var45, var44 );
    return var46;
  }

  public static SubLObject f11087(final SubLObject var10, final SubLObject var46)
  {
    final SubLObject var47 = module0178.f11296( var10 );
    final SubLObject var48 = oc_assertions_low.f11251( var10, var46 );
    module0197.f12293( var10, var47, var46 );
    return var48;
  }

  public static SubLObject f11088(final SubLObject var10, final SubLObject var48)
  {
    final SubLObject var49 = module0178.f11297( var10 );
    final SubLObject var50 = oc_assertions_low.f11252( var10, var48 );
    module0197.f12297( var10, var49, var48 );
    return var50;
  }

  public static SubLObject f11089(final SubLObject var10, final SubLObject var50)
  {
    final SubLObject var51 = module0178.f11298( var10 );
    final SubLObject var52 = oc_assertions_low.f11253( var10, var50 );
    module0197.f12301( var10, var51, var50 );
    return var52;
  }

  public static SubLObject f11090(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic94$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11201( var10 );
  }

  public static SubLObject f11091(final SubLObject var10, final SubLObject var5, final SubLObject var6)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8511( var5 ) : var5;
    assert NIL != module0130.f8507( var6 ) : var6;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic96$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var5 ), ConsesLow.list( $ic16$, var6 ) ) );
    }
    return f11092( var10, var5, var6 );
  }

  public static SubLObject f11092(final SubLObject var10, final SubLObject var5, final SubLObject var6)
  {
    final SubLObject var11 = module0178.f11378( var10 );
    if( NIL != var11 && var5.eql( module0191.f11936( var11 ) ) && var6.eql( module0191.f11937( var11 ) ) )
    {
      return var11;
    }
    return NIL;
  }

  public static SubLObject f11093(final SubLObject var10, final SubLObject var52)
  {
    final SubLObject var53 = module0130.f8524( var52 );
    final SubLObject var54 = module0130.f8523( var52 );
    if( NIL != f11091( var10, var53, var54 ) )
    {
      return NIL;
    }
    return f11094( var10, var53, var54, NIL );
  }

  public static SubLObject f11095(final SubLObject var10, final SubLObject var52)
  {
    final SubLObject var53 = module0130.f8524( var52 );
    final SubLObject var54 = module0130.f8523( var52 );
    return f11094( var10, var53, var54, T );
  }

  public static SubLObject f11094(final SubLObject var10, final SubLObject var23, final SubLObject var28, final SubLObject var53)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8511( var23 ) : var23;
    assert NIL != module0130.f8507( var28 ) : var28;
    final SubLObject var54 = module0178.f11378( var10 );
    if( NIL != var53 && !areAssertionsDisabledFor( me ) && NIL == module0191.f11932( var54 ) )
    {
      throw new AssertionError( var54 );
    }
    final SubLObject var55 = module0178.f11295( var10 );
    final SubLObject var56 = module0178.f11296( var10 );
    final SubLObject var57 = module0178.f11297( var10 );
    final SubLObject var58 = module0178.f11298( var10 );
    SubLObject var59 = NIL;
    if( NIL != var54 )
    {
      f11096( var10, var54 );
    }
    var59 = f11097( var10, var23, var28 );
    module0178.f11354( var10, var55, var56, var57, var58 );
    return var59;
  }

  public static SubLObject f11098(final SubLObject var10, final SubLObject var58)
  {
    final SubLObject var59 = module0130.f8524( var58 );
    final SubLObject var60 = module0130.f8523( var58 );
    return f11097( var10, var59, var60 );
  }

  public static SubLObject f11097(final SubLObject var10, final SubLObject var5, final SubLObject var6)
  {
    final SubLThread var11 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0130.f8511( var5 ) : var5;
    assert NIL != module0130.f8507( var6 ) : var6;
    SubLObject var12 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic101$, var10, var5, var6, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var12 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic101$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var5 ), ConsesLow.list( $ic16$, var6 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var13 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var11 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var11 );
        final SubLObject var14 = module0018.$g573$.getGlobalValue();
        SubLObject var15 = NIL;
        try
        {
          var15 = Locks.seize_lock( var14 );
          final SubLObject var16 = module0130.f8529( var5, var6 );
          final SubLObject var17 = module0191.f11941( var10, var16 );
          oc_assertions_low.f11259( var10, var17 );
          module0197.f12305( var10, var5, var6 );
          return var17;
        }
        finally
        {
          if( NIL != var15 )
          {
            Locks.release_lock( var14 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var13, var11 );
      }
    }
    return var12;
  }

  public static SubLObject f11096(final SubLObject var10, final SubLObject var7)
  {
    final SubLThread var11 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    assert NIL != module0191.f11932( var7 ) : var7;
    SubLObject var12 = NIL;
    oc_hl_interface_infrastructure.f8308();
    oc_hl_interface_infrastructure.f8341( $ic104$, var10, var7, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != oc_hl_interface_infrastructure.f8288() )
    {
      var12 = oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic104$, ConsesLow.list( $ic16$, var10 ), ConsesLow.list( $ic16$, var7 ) ) );
    }
    if( NIL != oc_hl_interface_infrastructure.f8287() )
    {
      final SubLObject var13 = oc_hl_interface_infrastructure.$g1483$.currentBinding( var11 );
      try
      {
        oc_hl_interface_infrastructure.$g1483$.bind( T, var11 );
        final SubLObject var14 = module0018.$g573$.getGlobalValue();
        SubLObject var15 = NIL;
        try
        {
          var15 = Locks.seize_lock( var14 );
          module0197.f12309( var10, var7 );
          oc_assertions_low.f11250( var10, NIL );
          oc_assertions_low.f11251( var10, NIL );
          oc_assertions_low.f11252( var10, NIL );
          oc_assertions_low.f11253( var10, NIL );
          oc_assertions_low.f11268( var10, var7 );
          module0191.f11944( var7 );
          return var10;
        }
        finally
        {
          if( NIL != var15 )
          {
            Locks.release_lock( var14 );
          }
        }
      }
      finally
      {
        oc_hl_interface_infrastructure.$g1483$.rebind( var13, var11 );
      }
    }
    return var12;
  }

  public static SubLObject f11099(final SubLObject var10)
  {
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    if( NIL != oc_hl_interface_infrastructure.f8291() )
    {
      return oc_hl_interface_infrastructure.f8304( ConsesLow.list( $ic108$, ConsesLow.list( $ic16$, var10 ) ) );
    }
    return oc_assertions_low.f11202( var10 );
  }

  public static SubLObject f11100(final SubLObject var10)
  {
    final SubLThread var11 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var10 ) : var10;
    var11.resetMultipleValues();
    final SubLObject var12 = oc_assertions_low.f11272( var10 );
    final SubLObject var13 = var11.secondMultipleValue();
    var11.resetMultipleValues();
    return module0030.f1625( var12 );
  }

  public static SubLObject f11101()
  {
    SubLFiles.declareFunction( myName, "f11057", "KB-CREATE-ASSERTION", 7, 0, false );
    SubLFiles.declareFunction( myName, "f11058", "S#13900", 7, 0, false );
    SubLFiles.declareFunction( myName, "f11059", "S#13901", 7, 0, false );
    SubLFiles.declareFunction( myName, "f11060", "KB-REMOVE-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11061", "KB-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11062", "KB-POSSIBLY-ASSERTION-CNF", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11063", "KB-ASSERTION-MT", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11064", "KB-LOOKUP-ASSERTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11065", "KB-GAF-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11066", "KB-RULE-ASSERTION?", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11067", "KB-ASSERTION-GAF-HL-FORMULA", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11068", "KB-ASSERTION-CONS", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11069", "KB-ASSERTION-DIRECTION", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11070", "KB-ASSERTION-TRUTH", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11071", "KB-ASSERTION-STRENGTH", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11072", "KB-ASSERTION-VARIABLE-NAMES", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11073", "KB-ASSERTION-ASSERTED-BY", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11074", "KB-ASSERTION-ASSERTED-WHEN", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11075", "KB-ASSERTION-ASSERTED-WHY", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11076", "KB-ASSERTION-ASSERTED-SECOND", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11077", "KB-SET-ASSERTION-DIRECTION", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11078", "KB-SET-ASSERTION-TRUTH", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11079", "KB-SET-ASSERTION-STRENGTH", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11080", "KB-SET-ASSERTION-VARIABLE-NAMES", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11081", "S#13902", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11082", "S#13903", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11083", "S#13904", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11084", "S#13905", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11085", "KB-TIMESTAMP-ASSERTED-ASSERTION", 5, 0, false );
    SubLFiles.declareFunction( myName, "f11086", "S#13906", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11087", "S#13907", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11088", "S#13908", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11089", "S#13909", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11090", "KB-ASSERTION-ARGUMENTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11091", "KB-LOOKUP-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11092", "S#13910", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11093", "S#13911", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11095", "S#13912", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11094", "S#13913", 4, 0, false );
    SubLFiles.declareFunction( myName, "f11098", "S#13914", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11097", "KB-CREATE-ASSERTED-ARGUMENT", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11096", "KB-REMOVE-ASSERTED-ARGUMENT", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11099", "KB-ASSERTION-DEPENDENTS", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11100", "S#13915", 1, 0, false );
    return NIL;
  }

  public static SubLObject f11102()
  {
    return NIL;
  }

  public static SubLObject f11103()
  {
    module0012.f368( $ic7$, $ic9$, $ic10$, $ic11$, $ic12$ );
    module0012.f368( $ic15$, $ic17$, $ic18$, $ic19$, $ic20$ );
    module0012.f368( $ic21$, $ic17$, $ic22$, $ic19$, $ic23$ );
    module0012.f368( $ic24$, $ic17$, $ic25$, $ic19$, $ic26$ );
    module0012.f368( $ic27$, $ic17$, $ic28$, $ic19$, $ic29$ );
    module0012.f368( $ic31$, $ic32$, $ic33$, $ic34$, $ic35$ );
    module0012.f368( $ic36$, $ic17$, $ic37$, $ic19$, $ic38$ );
    module0012.f368( $ic39$, $ic17$, $ic37$, $ic19$, $ic38$ );
    module0012.f368( $ic40$, $ic17$, $ic41$, $ic19$, $ic42$ );
    module0012.f368( $ic43$, $ic17$, $ic44$, $ic19$, $ic45$ );
    module0012.f368( $ic46$, $ic17$, $ic47$, $ic19$, $ic48$ );
    module0012.f368( $ic49$, $ic17$, $ic50$, $ic19$, $ic51$ );
    module0012.f368( $ic52$, $ic17$, $ic53$, $ic19$, $ic54$ );
    module0012.f368( $ic55$, $ic17$, $ic56$, $ic19$, $ic57$ );
    module0012.f368( $ic58$, $ic17$, $ic59$, $ic19$, $ic60$ );
    module0012.f368( $ic61$, $ic17$, $ic62$, $ic19$, $ic63$ );
    module0012.f368( $ic64$, $ic17$, $ic65$, $ic19$, $ic60$ );
    module0012.f368( $ic66$, $ic17$, $ic67$, $ic19$, $ic68$ );
    module0012.f368( $ic69$, $ic70$, $ic71$, $ic72$, $ic12$ );
    module0012.f368( $ic73$, $ic74$, $ic75$, $ic76$, $ic12$ );
    module0012.f368( $ic77$, $ic78$, $ic79$, $ic80$, $ic12$ );
    module0012.f368( $ic81$, $ic82$, $ic83$, $ic84$, $ic12$ );
    module0012.f368( $ic90$, $ic91$, $ic92$, $ic93$, $ic12$ );
    module0012.f368( $ic94$, $ic17$, $ic95$, $ic19$, $ic57$ );
    module0012.f368( $ic96$, $ic97$, $ic98$, $ic99$, $ic100$ );
    module0012.f368( $ic101$, $ic97$, $ic102$, $ic99$, $ic103$ );
    module0012.f368( $ic104$, $ic105$, $ic106$, $ic107$, $ic20$ );
    module0012.f368( $ic108$, $ic17$, $ic109$, $ic19$, $ic110$ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f11101();
  }

  @Override
  public void initializeVariables()
  {
    f11102();
  }

  @Override
  public void runTopLevelForms()
  {
    f11103();
  }
  static
  {
    me = new oc_assertions_interface();
    $ic0$ = SubLObjectFactory.makeSymbol( "CNF-P" );
    $ic1$ = SubLObjectFactory.makeSymbol( "S#12263", "CYC" );
    $ic2$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic3$ = SubLObjectFactory.makeSymbol( "DIRECTION-P" );
    $ic4$ = SubLObjectFactory.makeSymbol( "TRUTH-P" );
    $ic5$ = SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" );
    $ic6$ = SubLObjectFactory.makeSymbol( "ASSERTED-ARGUMENT-P" );
    $ic7$ = SubLObjectFactory.makeSymbol( "KB-CREATE-ASSERTION" );
    $ic8$ = SubLObjectFactory.makeSymbol( "S#5859", "CYC" );
    $ic9$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13916", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ), SubLObjectFactory.makeSymbol( "S#13917", "CYC" ), SubLObjectFactory.makeSymbol( "S#5432",
        "CYC" ), SubLObjectFactory.makeSymbol( "S#12576", "CYC" ), SubLObjectFactory.makeSymbol( "S#13918", "CYC" ), SubLObjectFactory.makeSymbol( "S#13919", "CYC" ) );
    $ic10$ = SubLObjectFactory.makeString( "Create a new assertion with CNF in MT." );
    $ic11$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13916", "CYC" ), SubLObjectFactory.makeSymbol( "CNF-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#11445", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#12263", "CYC" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13917", "CYC" ), SubLObjectFactory.makeSymbol( "LISTP" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol(
            "S#5432", "CYC" ), SubLObjectFactory.makeSymbol( "DIRECTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#12576", "CYC" ), SubLObjectFactory.makeSymbol( "TRUTH-P" ) ), ConsesLow.list(
                SubLObjectFactory.makeSymbol( "S#13918", "CYC" ), SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13919", "CYC" ), ConsesLow.list( SubLObjectFactory
                    .makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTED-ARGUMENT-P" ) ) ) );
    $ic12$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION-P" ) );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#13858", "CYC" );
    $ic14$ = SubLObjectFactory.makeSymbol( "ASSERTION-P" );
    $ic15$ = SubLObjectFactory.makeSymbol( "KB-REMOVE-ASSERTION" );
    $ic16$ = SubLObjectFactory.makeSymbol( "QUOTE" );
    $ic17$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ) );
    $ic18$ = SubLObjectFactory.makeString( "Remove ASSERTION from the KB." );
    $ic19$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
    $ic20$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "NULL" ) );
    $ic21$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-CNF" );
    $ic22$ = SubLObjectFactory.makeString( "Return the CNF for ASSERTION." );
    $ic23$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CNF-P" ) );
    $ic24$ = SubLObjectFactory.makeSymbol( "KB-POSSIBLY-ASSERTION-CNF" );
    $ic25$ = SubLObjectFactory.makeString( "Return the CNF for ASSERTION or NIL." );
    $ic26$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "CNF-P" ) ) );
    $ic27$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-MT" );
    $ic28$ = SubLObjectFactory.makeString( "Return the MT for ASSERTION." );
    $ic29$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#12263", "CYC" ) );
    $ic30$ = SubLObjectFactory.makeSymbol( "S#12265", "CYC" );
    $ic31$ = SubLObjectFactory.makeSymbol( "KB-LOOKUP-ASSERTION" );
    $ic32$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13916", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ) );
    $ic33$ = SubLObjectFactory.makeString( "Return the assertion with CNF and MT, if it exists.\n   Return NIL otherwise." );
    $ic34$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13916", "CYC" ), SubLObjectFactory.makeSymbol( "CNF-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#11445", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#12265", "CYC" ) ) );
    $ic35$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
    $ic36$ = SubLObjectFactory.makeSymbol( "KB-GAF-ASSERTION?" );
    $ic37$ = SubLObjectFactory.makeString( "Return T iff ASSERTION is a ground atomic formula (gaf)." );
    $ic38$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "BOOLEANP" ) );
    $ic39$ = SubLObjectFactory.makeSymbol( "KB-RULE-ASSERTION?" );
    $ic40$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-GAF-HL-FORMULA" );
    $ic41$ = SubLObjectFactory.makeString( "Returns the HL clause of ASSERTION if it's a gaf, otherwise returns nil.\n   Ignores the truth - i.e. returns <blah> instead of (#$not <blah>) for negated gafs." );
    $ic42$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13920", "CYC" ) );
    $ic43$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-CONS" );
    $ic44$ = SubLObjectFactory.makeString( "Returns a CNF or GAF HL formula." );
    $ic45$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSP" ) );
    $ic46$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-DIRECTION" );
    $ic47$ = SubLObjectFactory.makeString( "Return the direction of ASSERTION (either :backward, :forward or :code)." );
    $ic48$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "DIRECTION-P" ) );
    $ic49$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-TRUTH" );
    $ic50$ = SubLObjectFactory.makeString( "Return the current truth of ASSERTION -- either :true :false or :unknown." );
    $ic51$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "TRUTH-P" ) );
    $ic52$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-STRENGTH" );
    $ic53$ = SubLObjectFactory.makeString( "Return the current argumentation strength of ASSERTION -- either :monotonic, :default, or :unknown." );
    $ic54$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" ) );
    $ic55$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-VARIABLE-NAMES" );
    $ic56$ = SubLObjectFactory.makeString( "Return the variable names for ASSERTION." );
    $ic57$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "LISTP" ) );
    $ic58$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-ASSERTED-BY" );
    $ic59$ = SubLObjectFactory.makeString( "Return the asserted-by bookkeeping info for ASSERTION." );
    $ic60$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "FORT-P" ) ) );
    $ic61$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-ASSERTED-WHEN" );
    $ic62$ = SubLObjectFactory.makeString( "Return the asserted-when bookkeeping info for ASSERTION." );
    $ic63$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "S#4999", "CYC" ) ) );
    $ic64$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-ASSERTED-WHY" );
    $ic65$ = SubLObjectFactory.makeString( "Return the asserted-why bookkeeping info for ASSERTION." );
    $ic66$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-ASSERTED-SECOND" );
    $ic67$ = SubLObjectFactory.makeString( "Return the asserted-second bookkeeping info for ASSERTION." );
    $ic68$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "S#5028", "CYC" ) ) );
    $ic69$ = SubLObjectFactory.makeSymbol( "KB-SET-ASSERTION-DIRECTION" );
    $ic70$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13921", "CYC" ) );
    $ic71$ = SubLObjectFactory.makeString( "Change direction of ASSERTION to NEW-DIRECTION." );
    $ic72$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13921", "CYC" ),
        SubLObjectFactory.makeSymbol( "DIRECTION-P" ) ) );
    $ic73$ = SubLObjectFactory.makeSymbol( "KB-SET-ASSERTION-TRUTH" );
    $ic74$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13922", "CYC" ) );
    $ic75$ = SubLObjectFactory.makeString( "Change the truth of ASSERTION to NEW-TRUTH." );
    $ic76$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13922", "CYC" ),
        SubLObjectFactory.makeSymbol( "TRUTH-P" ) ) );
    $ic77$ = SubLObjectFactory.makeSymbol( "KB-SET-ASSERTION-STRENGTH" );
    $ic78$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13923", "CYC" ) );
    $ic79$ = SubLObjectFactory.makeString( "Change the strength of ASSERTION to NEW-STRENGTH." );
    $ic80$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13923", "CYC" ),
        SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" ) ) );
    $ic81$ = SubLObjectFactory.makeSymbol( "KB-SET-ASSERTION-VARIABLE-NAMES" );
    $ic82$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13924", "CYC" ) );
    $ic83$ = SubLObjectFactory.makeString( "Change the variable names for ASSERTION to NEW-VARIABLE-NAMES." );
    $ic84$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13924", "CYC" ),
        SubLObjectFactory.makeSymbol( "LISTP" ) ) );
    $ic85$ = SubLObjectFactory.makeKeyword( "UNCHANGED" );
    $ic86$ = SubLObjectFactory.makeSymbol( "S#13902", "CYC" );
    $ic87$ = SubLObjectFactory.makeSymbol( "S#13903", "CYC" );
    $ic88$ = SubLObjectFactory.makeSymbol( "S#13904", "CYC" );
    $ic89$ = SubLObjectFactory.makeSymbol( "S#13905", "CYC" );
    $ic90$ = SubLObjectFactory.makeSymbol( "KB-TIMESTAMP-ASSERTED-ASSERTION" );
    $ic91$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13925", "CYC" ), SubLObjectFactory.makeSymbol( "WHEN" ), SubLObjectFactory.makeSymbol( "S#13926", "CYC" ),
        SubLObjectFactory.makeSymbol( "SECOND" ) );
    $ic92$ = SubLObjectFactory.makeString( "Set meta data on ASSERTION." );
    $ic93$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13925", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#13902", "CYC" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "WHEN" ), SubLObjectFactory.makeSymbol( "S#13903", "CYC" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol(
            "S#13926", "CYC" ), SubLObjectFactory.makeSymbol( "S#13904", "CYC" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "SECOND" ), SubLObjectFactory.makeSymbol( "S#13905", "CYC" ) ) );
    $ic94$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-ARGUMENTS" );
    $ic95$ = SubLObjectFactory.makeString( "Return the arguments for ASSERTION." );
    $ic96$ = SubLObjectFactory.makeSymbol( "KB-LOOKUP-ASSERTED-ARGUMENT" );
    $ic97$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#12576", "CYC" ), SubLObjectFactory.makeSymbol( "S#13918", "CYC" ) );
    $ic98$ = SubLObjectFactory.makeString( "Return the asserted argument with ASSERTION, TRUTH, and STRENGTH, if it exists.\n   Return NIL otherwise." );
    $ic99$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#12576", "CYC" ),
        SubLObjectFactory.makeSymbol( "TRUTH-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13918", "CYC" ), SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" ) ) );
    $ic100$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTED-ARGUMENT-P" ) ) );
    $ic101$ = SubLObjectFactory.makeSymbol( "KB-CREATE-ASSERTED-ARGUMENT" );
    $ic102$ = SubLObjectFactory.makeString( "Create an asserted argument for ASSERTION from TRUTH and STRENGTH,\nand hook up all the indexing between them." );
    $ic103$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTED-ARGUMENT-P" ) );
    $ic104$ = SubLObjectFactory.makeSymbol( "KB-REMOVE-ASSERTED-ARGUMENT" );
    $ic105$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#13919", "CYC" ) );
    $ic106$ = SubLObjectFactory.makeString( "Remove ASSERTED-ARGUMENT for ASSERTION." );
    $ic107$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13919", "CYC" ),
        SubLObjectFactory.makeSymbol( "ASSERTED-ARGUMENT-P" ) ) );
    $ic108$ = SubLObjectFactory.makeSymbol( "KB-ASSERTION-DEPENDENTS" );
    $ic109$ = SubLObjectFactory.makeString( "Return the dependents of ASSERTION." );
    $ic110$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#2986", "CYC" ) );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 274 ms synthetic Decompiled with Procyon
 * 0.5.32.
 */