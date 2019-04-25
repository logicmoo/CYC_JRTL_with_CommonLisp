package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_interface_infrastructure_oc extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc";
  public static final String myFingerPrint = "8fd14a0cdc2ed1f3dde6fda6af7af06c786ec84d63b67cfb0b5dbafe63ca50c9";
  public static SubLSymbol $g1482$;
  public static SubLSymbol $g1483$;
  private static SubLSymbol $g1484$;
  private static SubLSymbol $g1485$;
  private static SubLSymbol $g1486$;
  private static SubLSymbol $g1487$;
  public static SubLSymbol $g1488$;
  private static SubLSymbol $g1489$;
  private static SubLSymbol $g1490$;
  private static SubLSymbol $g1491$;
  public static SubLSymbol $g1492$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLList $ic6$;
  private static final SubLList $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLString $ic10$;
  private static final SubLString $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLList $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLList $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLList $ic21$;
  private static final SubLSymbol $ic22$;
  private static final SubLList $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLList $ic25$;
  private static final SubLSymbol $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLList $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLList $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLList $ic35$;
  private static final SubLSymbol $ic36$;
  private static final SubLList $ic37$;
  private static final SubLList $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLList $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLList $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLList $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLSymbol $ic50$;
  private static final SubLString $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLSymbol $ic53$;
  private static final SubLSymbol $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLSymbol $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLList $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLList $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLSymbol $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLSymbol $ic69$;
  private static final SubLSymbol $ic70$;
  private static final SubLString $ic71$;
  private static final SubLSymbol $ic72$;

  public static SubLObject f8287()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.$ic0$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic1$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) || hl_interface_infrastructure_oc.$ic2$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue(
            var1 ) );
  }

  public static SubLObject f8288()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.$ic3$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic1$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) || hl_interface_infrastructure_oc.$ic2$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue(
            var1 ) );
  }

  public static SubLObject f8289()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.$ic0$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic3$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) || hl_interface_infrastructure_oc.$ic1$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic2$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) );
  }

  public static SubLObject f8290()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL != hl_interface_infrastructure_oc.$g1483$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic0$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) || hl_interface_infrastructure_oc.$ic1$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 )
        || hl_interface_infrastructure_oc.$ic4$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) );
  }

  public static SubLObject f8291()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL == hl_interface_infrastructure_oc.$g1483$.getDynamicValue( var1 )
        && ( hl_interface_infrastructure_oc.$ic3$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue( var1 ) || hl_interface_infrastructure_oc.$ic2$ == hl_interface_infrastructure_oc.$g1482$.getDynamicValue(
            var1 ) ) );
  }

  public static SubLObject f8292(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return ConsesLow.listS( hl_interface_infrastructure_oc.$ic5$, hl_interface_infrastructure_oc.$ic6$, ConsesLow.append( var6, hl_interface_infrastructure_oc.NIL ) );
  }

  public static SubLObject f8293(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return ConsesLow.listS( hl_interface_infrastructure_oc.$ic5$, hl_interface_infrastructure_oc.$ic7$, ConsesLow.append( var6, hl_interface_infrastructure_oc.NIL ) );
  }

  public static SubLObject f8294(final SubLObject var9, final SubLObject var10, final SubLObject var11)
  {
    hl_interface_infrastructure_oc.$g1484$.setGlobalValue( module0103.f7380( var9, var10, var11 ) );
    return module0103.f7367( hl_interface_infrastructure_oc.$g1484$.getGlobalValue() );
  }

  public static SubLObject f8295()
  {
    hl_interface_infrastructure_oc.$g1484$.setGlobalValue( hl_interface_infrastructure_oc.NIL );
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8296()
  {
    for( SubLObject var12 = hl_interface_infrastructure_oc.$g1485$.getGlobalValue(), var13 = module0055.f4019( var12 ); hl_interface_infrastructure_oc.NIL == var13; var13 = module0055.f4019( var12 ) )
    {
      final SubLObject var14 = module0055.f4023( var12 );
      module0103.f7397( var14 );
    }
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8297()
  {
    final SubLObject var14 = module0103.f7393( hl_interface_infrastructure_oc.$g1484$.getGlobalValue() );
    if( hl_interface_infrastructure_oc.NIL != module0103.f7383( var14 ) )
    {
      module0103.f7394( var14 );
      return var14;
    }
    return Errors.error( hl_interface_infrastructure_oc.$ic11$, hl_interface_infrastructure_oc.$g1484$.getGlobalValue() );
  }

  public static SubLObject f8298(final SubLObject var14)
  {
    final SubLObject var15 = hl_interface_infrastructure_oc.$g1486$.getGlobalValue();
    SubLObject var16 = hl_interface_infrastructure_oc.NIL;
    try
    {
      var16 = Locks.seize_lock( var15 );
      if( module0055.f4016( hl_interface_infrastructure_oc.$g1485$.getGlobalValue() ).numGE( hl_interface_infrastructure_oc.$g1487$.getGlobalValue() ) )
      {
        module0103.f7397( var14 );
      }
      else
      {
        module0055.f4021( var14, hl_interface_infrastructure_oc.$g1485$.getGlobalValue() );
      }
    }
    finally
    {
      if( hl_interface_infrastructure_oc.NIL != var16 )
      {
        Locks.release_lock( var15 );
      }
    }
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8299(final SubLObject var17)
  {
    return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL != module0103.f7383( var17 ) && hl_interface_infrastructure_oc.NIL != module0103.f7399( var17 ) );
  }

  public static SubLObject f8300()
  {
    SubLObject var14 = hl_interface_infrastructure_oc.NIL;
    final SubLObject var15 = hl_interface_infrastructure_oc.$g1486$.getGlobalValue();
    SubLObject var16 = hl_interface_infrastructure_oc.NIL;
    try
    {
      var16 = Locks.seize_lock( var15 );
      for( SubLObject var17 = hl_interface_infrastructure_oc.$g1485$.getGlobalValue(), var18 = SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL != var14
          || hl_interface_infrastructure_oc.NIL != module0055.f4019( var17 ) ); hl_interface_infrastructure_oc.NIL == var18; var18 = SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL != var14
              || hl_interface_infrastructure_oc.NIL != module0055.f4019( var17 ) ) )
      {
        final SubLObject var19 = module0055.f4023( var17 );
        if( hl_interface_infrastructure_oc.NIL != f8299( var19 ) )
        {
          var14 = var19;
        }
      }
      if( hl_interface_infrastructure_oc.NIL == var14 )
      {
        var14 = f8297();
      }
    }
    finally
    {
      if( hl_interface_infrastructure_oc.NIL != var16 )
      {
        Locks.release_lock( var15 );
      }
    }
    return var14;
  }

  public static SubLObject f8301()
  {
    return f8296();
  }

  public static SubLObject f8302(final SubLObject var9, final SubLObject var10, SubLObject var11)
  {
    if( var11 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var11 = hl_interface_infrastructure_oc.$ic12$;
    }
    f8294( var9, var10, var11 );
    f8296();
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8303()
  {
    f8295();
    f8296();
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8304(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    SubLObject var23 = hl_interface_infrastructure_oc.NIL;
    SubLObject var24 = hl_interface_infrastructure_oc.NIL;
    try
    {
      var22.throwStack.push( module0003.$g3$.getGlobalValue() );
      final SubLObject var25 = Errors.$error_handler$.currentBinding( var22 );
      try
      {
        Errors.$error_handler$.bind( hl_interface_infrastructure_oc.$ic13$, var22 );
        try
        {
          final SubLObject var26 = f8300();
          final SubLObject var24_25 = module0021.$g777$.currentBinding( var22 );
          try
          {
            module0021.$g777$.bind( hl_interface_infrastructure_oc.NIL, var22 );
            module0021.f1149( hl_interface_infrastructure_oc.NIL );
            final SubLObject var24_26 = module0111.$g1394$.currentBinding( var22 );
            final SubLObject var27 = module0111.$g1396$.currentBinding( var22 );
            final SubLObject var28 = module0111.$g1398$.currentBinding( var22 );
            final SubLObject var29 = module0021.$g754$.currentBinding( var22 );
            try
            {
              module0111.$g1394$.bind( hl_interface_infrastructure_oc.NIL, var22 );
              module0111.$g1396$.bind( hl_interface_infrastructure_oc.NIL, var22 );
              module0111.$g1398$.bind( hl_interface_infrastructure_oc.NIL, var22 );
              module0021.$g754$.bind( hl_interface_infrastructure_oc.NIL, var22 );
              SubLObject var30 = hl_interface_infrastructure_oc.NIL;
              try
              {
                var23 = module0103.f7398( var26, var21 );
                f8298( var26 );
                var30 = hl_interface_infrastructure_oc.T;
              }
              finally
              {
                final SubLObject var24_27 = Threads.$is_thread_performing_cleanupP$.currentBinding( var22 );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( hl_interface_infrastructure_oc.T, var22 );
                  if( hl_interface_infrastructure_oc.NIL == var30 )
                  {
                    module0103.f7397( var26 );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( var24_27, var22 );
                }
              }
            }
            finally
            {
              module0021.$g754$.rebind( var29, var22 );
              module0111.$g1398$.rebind( var28, var22 );
              module0111.$g1396$.rebind( var27, var22 );
              module0111.$g1394$.rebind( var24_26, var22 );
            }
          }
          finally
          {
            module0021.$g777$.rebind( var24_25, var22 );
          }
        }
        catch( final Throwable var31 )
        {
          Errors.handleThrowable( var31, hl_interface_infrastructure_oc.NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var25, var22 );
      }
    }
    catch( final Throwable var32 )
    {
      var24 = Errors.handleThrowable( var32, module0003.$g3$.getGlobalValue() );
    }
    finally
    {
      var22.throwStack.pop();
    }
    if( hl_interface_infrastructure_oc.NIL != var24 )
    {
      f8305( var24 );
    }
    return var23;
  }

  public static SubLObject f8306(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    SubLObject var6 = hl_interface_infrastructure_oc.NIL;
    SubLObject var7 = hl_interface_infrastructure_oc.NIL;
    SubLObject var8 = hl_interface_infrastructure_oc.NIL;
    SubLObject var9 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    final SubLObject var11 = module0034.f1900( var7 );
    return ConsesLow.list( hl_interface_infrastructure_oc.$ic15$, var6, var7, var8, var9, ConsesLow.list( hl_interface_infrastructure_oc.$ic16$,
        hl_interface_infrastructure_oc.$ic17$, ConsesLow.listS( hl_interface_infrastructure_oc.$ic18$, ConsesLow.list(
            hl_interface_infrastructure_oc.$ic19$, var6 ), ConsesLow.append( var11, hl_interface_infrastructure_oc.NIL ) ), ConsesLow.listS(
                hl_interface_infrastructure_oc.$ic20$, hl_interface_infrastructure_oc.$ic21$, reader.bq_cons( hl_interface_infrastructure_oc.$ic22$, ConsesLow.append( var10,
                    hl_interface_infrastructure_oc.NIL ) ), hl_interface_infrastructure_oc.$ic23$ ) ) );
  }

  public static SubLObject f8307(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    SubLObject var6 = hl_interface_infrastructure_oc.NIL;
    SubLObject var7 = hl_interface_infrastructure_oc.NIL;
    SubLObject var8 = hl_interface_infrastructure_oc.NIL;
    SubLObject var9 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    final SubLObject var11 = module0034.f1900( var7 );
    SubLObject var12 = hl_interface_infrastructure_oc.NIL;
    SubLObject var13 = var11;
    SubLObject var14 = hl_interface_infrastructure_oc.NIL;
    var14 = var13.first();
    while ( hl_interface_infrastructure_oc.NIL != var13)
    {
      final SubLObject var15 = ConsesLow.list( hl_interface_infrastructure_oc.$ic24$, hl_interface_infrastructure_oc.$ic25$, var14 );
      var12 = ConsesLow.cons( var15, var12 );
      var13 = var13.rest();
      var14 = var13.first();
    }
    var12 = Sequences.nreverse( var12 );
    final SubLObject var16 = hl_interface_infrastructure_oc.$ic26$;
    return ConsesLow.list( hl_interface_infrastructure_oc.$ic15$, var6, var7, var8, var9, ConsesLow.list( hl_interface_infrastructure_oc.$ic5$, ConsesLow
        .list( var16 ), hl_interface_infrastructure_oc.$ic17$, ConsesLow.listS( hl_interface_infrastructure_oc.$ic18$, ConsesLow.list(
            hl_interface_infrastructure_oc.$ic19$, var6 ), ConsesLow.append( var11, hl_interface_infrastructure_oc.NIL ) ), ConsesLow.list(
                hl_interface_infrastructure_oc.$ic27$, hl_interface_infrastructure_oc.$ic28$, ConsesLow.list( hl_interface_infrastructure_oc.$ic29$, var16,
                    ConsesLow.list( hl_interface_infrastructure_oc.$ic30$, ConsesLow.listS( hl_interface_infrastructure_oc.$ic24$, ConsesLow.list(
                        hl_interface_infrastructure_oc.$ic19$, var6 ), ConsesLow.append( var12, hl_interface_infrastructure_oc.NIL ) ) ) ) ), ConsesLow.list(
                            hl_interface_infrastructure_oc.$ic20$, hl_interface_infrastructure_oc.$ic31$, ConsesLow.list( hl_interface_infrastructure_oc.$ic32$, reader
                                .bq_cons( hl_interface_infrastructure_oc.$ic22$, ConsesLow.append( var10, hl_interface_infrastructure_oc.NIL ) ) ), ConsesLow.list(
                                    hl_interface_infrastructure_oc.$ic33$, var16 ) ) ) );
  }

  public static SubLObject f8308()
  {
    module0034.f1942();
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8309()
  {
    module0034.f1942();
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8310(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    SubLObject var6 = hl_interface_infrastructure_oc.NIL;
    SubLObject var7 = hl_interface_infrastructure_oc.NIL;
    SubLObject var8 = hl_interface_infrastructure_oc.NIL;
    SubLObject var9 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var6 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var7 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var8 = var5.first();
    var5 = var5.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic14$ );
    var9 = var5.first();
    final SubLObject var10;
    var5 = ( var10 = var5.rest() );
    final SubLObject var11 = module0034.f1900( var7 );
    SubLObject var12 = hl_interface_infrastructure_oc.NIL;
    SubLObject var13 = var11;
    SubLObject var14 = hl_interface_infrastructure_oc.NIL;
    var14 = var13.first();
    while ( hl_interface_infrastructure_oc.NIL != var13)
    {
      final SubLObject var15 = ConsesLow.list( hl_interface_infrastructure_oc.$ic24$, hl_interface_infrastructure_oc.$ic25$, var14 );
      var12 = ConsesLow.cons( var15, var12 );
      var13 = var13.rest();
      var14 = var13.first();
    }
    var12 = Sequences.nreverse( var12 );
    return ConsesLow.list( hl_interface_infrastructure_oc.$ic15$, var6, var7, var8, var9, ConsesLow.list( hl_interface_infrastructure_oc.$ic20$,
        hl_interface_infrastructure_oc.$ic37$, ConsesLow.list( hl_interface_infrastructure_oc.$ic33$, ConsesLow.list(
            hl_interface_infrastructure_oc.$ic30$, ConsesLow.listS( hl_interface_infrastructure_oc.$ic24$, ConsesLow.list(
                hl_interface_infrastructure_oc.$ic19$, var6 ), ConsesLow.append( var12, hl_interface_infrastructure_oc.NIL ) ) ) ), reader.bq_cons(
                    hl_interface_infrastructure_oc.$ic16$, ConsesLow.append( var10, hl_interface_infrastructure_oc.NIL ) ) ) );
  }

  public static SubLObject f8311(final SubLObject var49)
  {
    return module0004.f104( var49, hl_interface_infrastructure_oc.$ic38$, Symbols.symbol_function( hl_interface_infrastructure_oc.EQ ), hl_interface_infrastructure_oc.UNPROVIDED );
  }

  public static SubLObject f8312()
  {
    final SubLThread var1 = SubLProcess.currentSubLThread();
    return ( hl_interface_infrastructure_oc.NIL != hl_interface_infrastructure_oc.$g1488$.getDynamicValue( var1 ) ) ? hl_interface_infrastructure_oc.$g1488$.getDynamicValue( var1 )
        : hl_interface_infrastructure_oc.$ic39$;
  }

  public static SubLObject f8305(final SubLObject var23)
  {
    assert hl_interface_infrastructure_oc.NIL != Types.stringp( var23 ) : var23;
    final SubLObject var24 = f8312();
    if( var24.eql( hl_interface_infrastructure_oc.$ic41$ ) )
    {
      return hl_interface_infrastructure_oc.NIL;
    }
    if( var24.eql( hl_interface_infrastructure_oc.$ic42$ ) )
    {
      return Errors.warn( var23 );
    }
    if( var24.eql( hl_interface_infrastructure_oc.$ic39$ ) )
    {
      return Errors.error( var23 );
    }
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8313(final SubLObject var2, final SubLObject var3)
  {
    SubLObject var5;
    final SubLObject var4 = var5 = var2.rest();
    SubLObject var6 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var5, var4, hl_interface_infrastructure_oc.$ic43$ );
    var6 = var5.first();
    final SubLObject var7;
    var5 = ( var7 = var5.rest() );
    return ConsesLow.list( hl_interface_infrastructure_oc.$ic16$, ConsesLow.listS( hl_interface_infrastructure_oc.$ic44$, var6,
        hl_interface_infrastructure_oc.$ic45$ ), ConsesLow.listS( hl_interface_infrastructure_oc.$ic5$, ConsesLow.list( ConsesLow.list(
            hl_interface_infrastructure_oc.$ic46$, var6 ) ), ConsesLow.append( var7, hl_interface_infrastructure_oc.NIL ) ) );
  }

  public static SubLObject f8314(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return ConsesLow.listS( hl_interface_infrastructure_oc.$ic47$, hl_interface_infrastructure_oc.$ic41$, ConsesLow.append( var6,
        hl_interface_infrastructure_oc.NIL ) );
  }

  public static SubLObject f8315(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return ConsesLow.listS( hl_interface_infrastructure_oc.$ic47$, hl_interface_infrastructure_oc.$ic42$, ConsesLow.append( var6,
        hl_interface_infrastructure_oc.NIL ) );
  }

  public static SubLObject f8316(final SubLObject var2, final SubLObject var3)
  {
    final SubLObject var4 = var2.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    return ConsesLow.list( hl_interface_infrastructure_oc.$ic5$, hl_interface_infrastructure_oc.$ic48$, ConsesLow.listS(
        hl_interface_infrastructure_oc.$ic47$, hl_interface_infrastructure_oc.$ic39$, ConsesLow.append( var6, hl_interface_infrastructure_oc.NIL ) ) );
  }

  public static SubLObject f8317()
  {
    hl_interface_infrastructure_oc.$g1490$.setGlobalValue( hl_interface_infrastructure_oc.ZERO_INTEGER );
    return hl_interface_infrastructure_oc.$g1490$.getGlobalValue();
  }

  public static SubLObject f8318()
  {
    final SubLObject var59 = hl_interface_infrastructure_oc.$g1490$.getGlobalValue();
    hl_interface_infrastructure_oc.$g1490$.setGlobalValue( Numbers.add( hl_interface_infrastructure_oc.$g1490$.getGlobalValue(), hl_interface_infrastructure_oc.ONE_INTEGER ) );
    if( hl_interface_infrastructure_oc.$g1490$.getGlobalValue().numE( Numbers.$most_positive_fixnum$.getGlobalValue() ) )
    {
      hl_interface_infrastructure_oc.$g1490$.setGlobalValue( hl_interface_infrastructure_oc.ZERO_INTEGER );
    }
    return var59;
  }

  public static SubLObject f8319()
  {
    SubLObject var59;
    for( var59 = f8318(); hl_interface_infrastructure_oc.NIL != f8320( var59 ); var59 = f8318() )
    {
    }
    return var59;
  }

  public static SubLObject f8321(final SubLObject var60)
  {
    SubLObject var61 = hl_interface_infrastructure_oc.NIL;
    final SubLObject var62 = hl_interface_infrastructure_oc.$g1491$.getGlobalValue();
    SubLObject var63 = hl_interface_infrastructure_oc.NIL;
    try
    {
      var63 = Locks.seize_lock( var62 );
      var61 = f8319();
      module0067.f4886( hl_interface_infrastructure_oc.$g1489$.getGlobalValue(), var61, var60 );
    }
    finally
    {
      if( hl_interface_infrastructure_oc.NIL != var63 )
      {
        Locks.release_lock( var62 );
      }
    }
    return var61;
  }

  public static SubLObject f8320(final SubLObject var61)
  {
    return module0067.f4885( hl_interface_infrastructure_oc.$g1489$.getGlobalValue(), var61, hl_interface_infrastructure_oc.UNPROVIDED );
  }

  public static SubLObject f8322(final SubLObject var61)
  {
    SubLObject var62 = hl_interface_infrastructure_oc.NIL;
    final SubLObject var63 = hl_interface_infrastructure_oc.$g1491$.getGlobalValue();
    SubLObject var64 = hl_interface_infrastructure_oc.NIL;
    try
    {
      var64 = Locks.seize_lock( var63 );
      var62 = module0067.f4887( hl_interface_infrastructure_oc.$g1489$.getGlobalValue(), var61 );
    }
    finally
    {
      if( hl_interface_infrastructure_oc.NIL != var64 )
      {
        Locks.release_lock( var63 );
      }
    }
    return var62;
  }

  public static SubLObject f8323(final SubLObject var21)
  {
    final SubLObject var22 = Eval.eval( var21 );
    return ( hl_interface_infrastructure_oc.NIL != module0052.f3674( var22 ) ) ? f8321( var22 ) : hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8324(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    final SubLObject var63 = f8320( var61 );
    if( hl_interface_infrastructure_oc.NIL != var63 )
    {
      var62.resetMultipleValues();
      final SubLObject var64 = module0052.f3693( var63 );
      final SubLObject var65 = var62.secondMultipleValue();
      var62.resetMultipleValues();
      return ConsesLow.list( var64, var65 );
    }
    return ConsesLow.list( hl_interface_infrastructure_oc.NIL, hl_interface_infrastructure_oc.NIL );
  }

  public static SubLObject f8325(final SubLObject var61, final SubLObject var68)
  {
    final SubLThread var69 = SubLProcess.currentSubLThread();
    final SubLObject var70 = f8320( var61 );
    SubLObject var71 = hl_interface_infrastructure_oc.NIL;
    if( hl_interface_infrastructure_oc.NIL != var70 )
    {
      SubLObject var72;
      SubLObject var73;
      SubLObject var74;
      SubLObject var75;
      for( var72 = hl_interface_infrastructure_oc.NIL, var73 = hl_interface_infrastructure_oc.NIL, var73 = hl_interface_infrastructure_oc.ZERO_INTEGER; !var73.numG( var68 )
          && hl_interface_infrastructure_oc.NIL == var72; var73 = Numbers.add( var73, hl_interface_infrastructure_oc.ONE_INTEGER ) )
      {
        var69.resetMultipleValues();
        var74 = module0052.f3693( var70 );
        var75 = var69.secondMultipleValue();
        var69.resetMultipleValues();
        if( hl_interface_infrastructure_oc.NIL != var75 )
        {
          var71 = ConsesLow.cons( var74, var71 );
        }
        else
        {
          var72 = hl_interface_infrastructure_oc.T;
        }
      }
      var71 = Sequences.nreverse( var71 );
    }
    return var71;
  }

  public static SubLObject f8326(final SubLObject var61)
  {
    final SubLObject var62 = f8320( var61 );
    if( hl_interface_infrastructure_oc.NIL != var62 )
    {
      return module0052.f3687( var62 );
    }
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8327(final SubLObject var61)
  {
    final SubLObject var62 = f8320( var61 );
    if( hl_interface_infrastructure_oc.NIL != var62 )
    {
      f8322( var61 );
      return module0052.f3696( var62 );
    }
    return hl_interface_infrastructure_oc.T;
  }

  public static SubLObject f8328(final SubLObject var21, SubLObject var71)
  {
    if( var71 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var71 = hl_interface_infrastructure_oc.ONE_INTEGER;
    }
    assert hl_interface_infrastructure_oc.NIL != Types.listp( var21 ) : var21;
    assert hl_interface_infrastructure_oc.NIL != module0004.f105( var71 ) : var71;
    final SubLObject var72 = ( hl_interface_infrastructure_oc.NIL != f8291() ) ? f8304( ConsesLow.list( hl_interface_infrastructure_oc.$ic54$, ConsesLow.list(
        hl_interface_infrastructure_oc.$ic19$, var21 ) ) ) : f8323( var21 );
    return var71.numE( hl_interface_infrastructure_oc.ONE_INTEGER ) ? f8329( var72 ) : f8330( var72, var71 );
  }

  public static SubLObject f8331(final SubLObject var60)
  {
    return module0052.f3696( var60 );
  }

  public static SubLObject f8329(final SubLObject var61)
  {
    return module0052.f3689( var61, hl_interface_infrastructure_oc.$ic55$, hl_interface_infrastructure_oc.$ic56$, hl_interface_infrastructure_oc.$ic57$ );
  }

  public static SubLObject f8332(final SubLObject var61)
  {
    return ( hl_interface_infrastructure_oc.NIL != f8291() ) ? f8304( ConsesLow.list( hl_interface_infrastructure_oc.$ic58$, var61 ) ) : f8326( var61 );
  }

  public static SubLObject f8333(final SubLObject var61)
  {
    SubLObject var63;
    final SubLObject var62 = var63 = ( ( hl_interface_infrastructure_oc.NIL != f8291() ) ? f8304( ConsesLow.list( hl_interface_infrastructure_oc.$ic59$, var61 ) ) : f8324( var61 ) );
    SubLObject var64 = hl_interface_infrastructure_oc.NIL;
    SubLObject var65 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var63, var62, hl_interface_infrastructure_oc.$ic60$ );
    var64 = var63.first();
    var63 = var63.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var63, var62, hl_interface_infrastructure_oc.$ic60$ );
    var65 = var63.first();
    var63 = var63.rest();
    if( hl_interface_infrastructure_oc.NIL == var63 )
    {
      return Values.values( var64, var61, Types.sublisp_null( var65 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var62, hl_interface_infrastructure_oc.$ic60$ );
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8334(final SubLObject var61)
  {
    return ( hl_interface_infrastructure_oc.NIL != f8291() ) ? f8304( ConsesLow.list( hl_interface_infrastructure_oc.$ic61$, var61 ) ) : f8327( var61 );
  }

  public static SubLObject f8330(final SubLObject var61, final SubLObject var71)
  {
    final SubLObject var72 = ConsesLow.list( hl_interface_infrastructure_oc.NIL, var61, var71 );
    return module0052.f3689( var72, hl_interface_infrastructure_oc.$ic62$, hl_interface_infrastructure_oc.$ic63$, hl_interface_infrastructure_oc.$ic64$ );
  }

  public static SubLObject f8335(final SubLObject var75)
  {
    SubLObject var76 = hl_interface_infrastructure_oc.NIL;
    SubLObject var77 = hl_interface_infrastructure_oc.NIL;
    SubLObject var78 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var75, var75, hl_interface_infrastructure_oc.$ic65$ );
    var76 = var75.first();
    SubLObject var79 = var75.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var79, var75, hl_interface_infrastructure_oc.$ic65$ );
    var77 = var79.first();
    var79 = var79.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var79, var75, hl_interface_infrastructure_oc.$ic65$ );
    var78 = var79.first();
    var79 = var79.rest();
    if( hl_interface_infrastructure_oc.NIL == var79 )
    {
      return SubLObjectFactory.makeBoolean( hl_interface_infrastructure_oc.NIL == var76 && hl_interface_infrastructure_oc.NIL != f8332( var77 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var75, hl_interface_infrastructure_oc.$ic65$ );
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8336(final SubLObject var75)
  {
    SubLObject var76 = hl_interface_infrastructure_oc.NIL;
    SubLObject var77 = hl_interface_infrastructure_oc.NIL;
    SubLObject var78 = hl_interface_infrastructure_oc.NIL;
    SubLObject var79 = hl_interface_infrastructure_oc.NIL;
    SubLObject var80 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var75, var75, hl_interface_infrastructure_oc.$ic65$ );
    var78 = var75.first();
    SubLObject var81 = var75.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var81, var75, hl_interface_infrastructure_oc.$ic65$ );
    var79 = var81.first();
    var81 = var81.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var81, var75, hl_interface_infrastructure_oc.$ic65$ );
    var80 = var81.first();
    var81 = var81.rest();
    if( hl_interface_infrastructure_oc.NIL == var81 )
    {
      if( hl_interface_infrastructure_oc.NIL == var78 )
      {
        final SubLObject var82 = ( hl_interface_infrastructure_oc.NIL != f8291() ) ? f8304( ConsesLow.list( hl_interface_infrastructure_oc.$ic66$, var79, var80 ) ) : f8325( var79, var80 );
        if( hl_interface_infrastructure_oc.NIL != var82 )
        {
          var76 = var82.first();
          ConsesLow.set_nth( hl_interface_infrastructure_oc.ZERO_INTEGER, var75, var82.rest() );
        }
        else
        {
          var77 = hl_interface_infrastructure_oc.T;
        }
      }
      else
      {
        var76 = var78.first();
        ConsesLow.set_nth( hl_interface_infrastructure_oc.ZERO_INTEGER, var75, var78.rest() );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var75, hl_interface_infrastructure_oc.$ic65$ );
    }
    return Values.values( var76, var75, var77 );
  }

  public static SubLObject f8337(final SubLObject var75)
  {
    SubLObject var76 = hl_interface_infrastructure_oc.NIL;
    SubLObject var77 = hl_interface_infrastructure_oc.NIL;
    SubLObject var78 = hl_interface_infrastructure_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var75, var75, hl_interface_infrastructure_oc.$ic65$ );
    var76 = var75.first();
    SubLObject var79 = var75.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var79, var75, hl_interface_infrastructure_oc.$ic65$ );
    var77 = var79.first();
    var79 = var79.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var79, var75, hl_interface_infrastructure_oc.$ic65$ );
    var78 = var79.first();
    var79 = var79.rest();
    if( hl_interface_infrastructure_oc.NIL == var79 )
    {
      return f8334( var77 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var75, hl_interface_infrastructure_oc.$ic65$ );
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8338(final SubLObject var85)
  {
    final SubLObject var86 = compatibility.open_binary( var85, hl_interface_infrastructure_oc.$ic68$ );
    if( var86.isStream() )
    {
      hl_interface_infrastructure_oc.$g1492$.setGlobalValue( var86 );
      return hl_interface_infrastructure_oc.T;
    }
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8339()
  {
    if( hl_interface_infrastructure_oc.$g1492$.getGlobalValue().isStream() )
    {
      streams_high.close( hl_interface_infrastructure_oc.$g1492$.getGlobalValue(), hl_interface_infrastructure_oc.UNPROVIDED );
      hl_interface_infrastructure_oc.$g1492$.setGlobalValue( hl_interface_infrastructure_oc.NIL );
      return hl_interface_infrastructure_oc.T;
    }
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8340(final SubLObject var87, final SubLObject var72, final SubLObject var88, final SubLObject var89, final SubLObject var90, final SubLObject var91, final SubLObject var92,
      final SubLObject var93)
  {
    final SubLObject var94 = Sequences.remove( hl_interface_infrastructure_oc.$ic69$, ConsesLow.list( var72, var88, var89, var90, var91, var92, var93 ),
        hl_interface_infrastructure_oc.UNPROVIDED, hl_interface_infrastructure_oc.UNPROVIDED, hl_interface_infrastructure_oc.UNPROVIDED,
        hl_interface_infrastructure_oc.UNPROVIDED, hl_interface_infrastructure_oc.UNPROVIDED );
    return ConsesLow.listS( var87, var94 );
  }

  public static SubLObject f8341(final SubLObject var36, SubLObject var72, SubLObject var88, SubLObject var89, SubLObject var90, SubLObject var91, SubLObject var92, SubLObject var93)
  {
    if( var72 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var72 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var88 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var88 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var89 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var89 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var90 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var90 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var91 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var91 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var92 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var92 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( var93 == hl_interface_infrastructure_oc.UNPROVIDED )
    {
      var93 = hl_interface_infrastructure_oc.$ic69$;
    }
    if( hl_interface_infrastructure_oc.$g1492$.getGlobalValue().isStream() )
    {
      final SubLObject var94 = f8340( var36, var72, var88, var89, var90, var91, var92, var93 );
      module0021.f1040( var94, hl_interface_infrastructure_oc.$g1492$.getGlobalValue() );
    }
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8342(final SubLObject var85)
  {
    final SubLThread var86 = SubLProcess.currentSubLThread();
    SubLObject var87 = hl_interface_infrastructure_oc.ZERO_INTEGER;
    SubLObject var88 = hl_interface_infrastructure_oc.NIL;
    try
    {
      final SubLObject var89 = stream_macros.$stream_requires_locking$.currentBinding( var86 );
      try
      {
        stream_macros.$stream_requires_locking$.bind( hl_interface_infrastructure_oc.NIL, var86 );
        var88 = compatibility.open_binary( var85, hl_interface_infrastructure_oc.$ic70$ );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( var89, var86 );
      }
      if( !var88.isStream() )
      {
        Errors.error( hl_interface_infrastructure_oc.$ic71$, var85 );
      }
      final SubLObject var86_97 = var88;
      SubLObject var90 = hl_interface_infrastructure_oc.NIL;
      while ( hl_interface_infrastructure_oc.$ic72$ != var90)
      {
        var90 = f8343( var86_97 );
        if( hl_interface_infrastructure_oc.$ic72$ != var90 )
        {
          var87 = Numbers.add( var87, hl_interface_infrastructure_oc.ONE_INTEGER );
        }
      }
    }
    finally
    {
      final SubLObject var91 = Threads.$is_thread_performing_cleanupP$.currentBinding( var86 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( hl_interface_infrastructure_oc.T, var86 );
        if( var88.isStream() )
        {
          streams_high.close( var88, hl_interface_infrastructure_oc.UNPROVIDED );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var91, var86 );
      }
    }
    return var87;
  }

  public static SubLObject f8343(final SubLObject var86)
  {
    final SubLObject var87 = module0021.f1060( var86, hl_interface_infrastructure_oc.NIL, hl_interface_infrastructure_oc.UNPROVIDED );
    if( hl_interface_infrastructure_oc.$ic72$ == var87 )
    {
      return hl_interface_infrastructure_oc.$ic72$;
    }
    return f8344( var87 );
  }

  public static SubLObject f8344(final SubLObject var95)
  {
    final SubLObject var96 = var95.first();
    final SubLObject var97 = conses_high.second( var95 );
    final SubLObject var98 = conses_high.nthcdr( hl_interface_infrastructure_oc.TWO_INTEGER, var95 );
    return Functions.apply( var96, var97, var98 );
  }

  public static SubLObject f8345()
  {
    SubLFiles.declareFunction( myName, "f8287", "S#10391", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8288", "S#10392", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8289", "S#10393", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8290", "S#10394", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8291", "S#10395", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8292", "S#10396" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8293", "S#10397" );
    SubLFiles.declareFunction( myName, "f8294", "S#10398", 3, 0, false );
    SubLFiles.declareFunction( myName, "f8295", "S#10399", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8296", "S#10400", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8297", "S#10401", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8298", "S#10402", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8299", "S#10403", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8300", "S#10404", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8301", "S#10405", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8302", "S#10406", 2, 1, false );
    SubLFiles.declareFunction( myName, "f8303", "S#10407", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8304", "S#10408", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8306", "S#10409" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8307", "S#10410" );
    SubLFiles.declareFunction( myName, "f8308", "S#10411", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8309", "S#10412", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8310", "S#10413" );
    SubLFiles.declareFunction( myName, "f8311", "S#10414", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8312", "S#10415", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8305", "S#10416", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8313", "S#10417" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8314", "S#10418" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8315", "S#10419" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.hl_interface_infrastructure_oc", "f8316", "S#10420" );
    SubLFiles.declareFunction( myName, "f8317", "S#10421", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8318", "S#10422", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8319", "S#10423", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8321", "S#10424", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8320", "S#10425", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8322", "S#10426", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8323", "S#10427", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8324", "S#10428", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8325", "S#10429", 2, 0, false );
    SubLFiles.declareFunction( myName, "f8326", "S#10430", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8327", "S#10431", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8328", "S#10432", 1, 1, false );
    SubLFiles.declareFunction( myName, "f8331", "S#10433", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8329", "S#10434", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8332", "S#10389", 1, 0, false );
    new $f8332$UnaryFunction();
    SubLFiles.declareFunction( myName, "f8333", "S#5092", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8334", "S#10390", 1, 0, false );
    new $f8334$UnaryFunction();
    SubLFiles.declareFunction( myName, "f8330", "S#10435", 2, 0, false );
    SubLFiles.declareFunction( myName, "f8335", "S#10436", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8336", "S#10437", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8337", "S#10438", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8338", "S#10439", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8339", "S#10440", 0, 0, false );
    SubLFiles.declareFunction( myName, "f8340", "S#10441", 8, 0, false );
    SubLFiles.declareFunction( myName, "f8341", "S#10442", 1, 7, false );
    SubLFiles.declareFunction( myName, "f8342", "S#10443", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8343", "S#10444", 1, 0, false );
    SubLFiles.declareFunction( myName, "f8344", "S#10445", 1, 0, false );
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8346()
  {
    hl_interface_infrastructure_oc.$g1482$ = SubLFiles.defvar( "S#10446", hl_interface_infrastructure_oc.$ic0$ );
    hl_interface_infrastructure_oc.$g1483$ = SubLFiles.defvar( "S#10447", hl_interface_infrastructure_oc.NIL );
    hl_interface_infrastructure_oc.$g1484$ = SubLFiles.deflexical( "S#10448", ( hl_interface_infrastructure_oc.NIL != Symbols.boundp( hl_interface_infrastructure_oc.$ic8$ ) )
        ? hl_interface_infrastructure_oc.$g1484$.getGlobalValue()
        : hl_interface_infrastructure_oc.NIL );
    hl_interface_infrastructure_oc.$g1485$ = SubLFiles.deflexical( "S#10449", ( hl_interface_infrastructure_oc.NIL != Symbols.boundp( hl_interface_infrastructure_oc.$ic9$ ) )
        ? hl_interface_infrastructure_oc.$g1485$.getGlobalValue()
        : module0055.f4017() );
    hl_interface_infrastructure_oc.$g1486$ = SubLFiles.deflexical( "S#10450", Locks.make_lock( hl_interface_infrastructure_oc.$ic10$ ) );
    hl_interface_infrastructure_oc.$g1487$ = SubLFiles.deflexical( "S#10451", hl_interface_infrastructure_oc.NINE_INTEGER );
    hl_interface_infrastructure_oc.$g1488$ = SubLFiles.defparameter( "S#10452", hl_interface_infrastructure_oc.NIL );
    hl_interface_infrastructure_oc.$g1489$ = SubLFiles.deflexical( "S#10453", ( hl_interface_infrastructure_oc.NIL != Symbols.boundp( hl_interface_infrastructure_oc.$ic49$ ) )
        ? hl_interface_infrastructure_oc.$g1489$.getGlobalValue()
        : module0067.f4880( Symbols.symbol_function( hl_interface_infrastructure_oc.EQL ), hl_interface_infrastructure_oc.UNPROVIDED ) );
    hl_interface_infrastructure_oc.$g1490$ = SubLFiles.deflexical( "S#10454", ( hl_interface_infrastructure_oc.NIL != Symbols.boundp( hl_interface_infrastructure_oc.$ic50$ ) )
        ? hl_interface_infrastructure_oc.$g1490$.getGlobalValue()
        : hl_interface_infrastructure_oc.ZERO_INTEGER );
    hl_interface_infrastructure_oc.$g1491$ = SubLFiles.deflexical( "S#10455", Locks.make_lock( hl_interface_infrastructure_oc.$ic51$ ) );
    hl_interface_infrastructure_oc.$g1492$ = SubLFiles.deflexical( "S#10456", ( hl_interface_infrastructure_oc.NIL != Symbols.boundp( hl_interface_infrastructure_oc.$ic67$ ) )
        ? hl_interface_infrastructure_oc.$g1492$.getGlobalValue()
        : hl_interface_infrastructure_oc.NIL );
    return hl_interface_infrastructure_oc.NIL;
  }

  public static SubLObject f8347()
  {
    module0003.f57( hl_interface_infrastructure_oc.$ic8$ );
    module0003.f57( hl_interface_infrastructure_oc.$ic9$ );
    module0002.f50( hl_interface_infrastructure_oc.$ic34$, hl_interface_infrastructure_oc.$ic35$ );
    module0002.f50( hl_interface_infrastructure_oc.$ic36$, hl_interface_infrastructure_oc.$ic35$ );
    module0003.f57( hl_interface_infrastructure_oc.$ic49$ );
    module0003.f57( hl_interface_infrastructure_oc.$ic50$ );
    module0003.f57( hl_interface_infrastructure_oc.$ic67$ );
    return hl_interface_infrastructure_oc.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f8345();
  }

  @Override
  public void initializeVariables()
  {
    f8346();
  }

  @Override
  public void runTopLevelForms()
  {
    f8347();
  }
  static
  {
    me = new hl_interface_infrastructure_oc();
    hl_interface_infrastructure_oc.$g1482$ = null;
    hl_interface_infrastructure_oc.$g1483$ = null;
    hl_interface_infrastructure_oc.$g1484$ = null;
    hl_interface_infrastructure_oc.$g1485$ = null;
    hl_interface_infrastructure_oc.$g1486$ = null;
    hl_interface_infrastructure_oc.$g1487$ = null;
    hl_interface_infrastructure_oc.$g1488$ = null;
    hl_interface_infrastructure_oc.$g1489$ = null;
    hl_interface_infrastructure_oc.$g1490$ = null;
    hl_interface_infrastructure_oc.$g1491$ = null;
    hl_interface_infrastructure_oc.$g1492$ = null;
    $ic0$ = SubLObjectFactory.makeKeyword( "LOCAL-LOCAL" );
    $ic1$ = SubLObjectFactory.makeKeyword( "BOTH-LOCAL" );
    $ic2$ = SubLObjectFactory.makeKeyword( "BOTH-REMOTE" );
    $ic3$ = SubLObjectFactory.makeKeyword( "REMOTE-REMOTE" );
    $ic4$ = SubLObjectFactory.makeKeyword( "NONE-LOCAL" );
    $ic5$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic6$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10447", "CYC" ), hl_interface_infrastructure_oc.T ) );
    $ic7$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10447", "CYC" ), hl_interface_infrastructure_oc.NIL ) );
    $ic8$ = SubLObjectFactory.makeSymbol( "S#10448", "CYC" );
    $ic9$ = SubLObjectFactory.makeSymbol( "S#10449", "CYC" );
    $ic10$ = SubLObjectFactory.makeString( "Remote HL Store Connection Pool Lock" );
    $ic11$ = SubLObjectFactory.makeString( "Could not open a connection to ~s" );
    $ic12$ = SubLObjectFactory.makeKeyword( "CFASL" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#38", "CYC" );
    $ic14$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#29", "CYC" ), SubLObjectFactory.makeSymbol( "S#30", "CYC" ), SubLObjectFactory.makeSymbol( "S#662", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#663", "CYC" ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic15$ = SubLObjectFactory.makeSymbol( "S#369", "CYC" );
    $ic16$ = SubLObjectFactory.makeSymbol( "PROGN" );
    $ic17$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10411", "CYC" ) );
    $ic18$ = SubLObjectFactory.makeSymbol( "S#10442", "CYC" );
    $ic19$ = SubLObjectFactory.makeSymbol( "QUOTE" );
    $ic20$ = SubLObjectFactory.makeSymbol( "PIF" );
    $ic21$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10393", "CYC" ) );
    $ic22$ = SubLObjectFactory.makeSymbol( "S#1770", "CYC" );
    $ic23$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "RET" ), hl_interface_infrastructure_oc.NIL ) );
    $ic24$ = SubLObjectFactory.makeSymbol( "LIST" );
    $ic25$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "QUOTE" ), SubLObjectFactory.makeSymbol( "QUOTE" ) );
    $ic26$ = SubLObjectFactory.makeUninternedSymbol( "US#703B6C2" );
    $ic27$ = SubLObjectFactory.makeSymbol( "PWHEN" );
    $ic28$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10392", "CYC" ) );
    $ic29$ = SubLObjectFactory.makeSymbol( "CSETQ" );
    $ic30$ = SubLObjectFactory.makeSymbol( "S#10408", "CYC" );
    $ic31$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10391", "CYC" ) );
    $ic32$ = SubLObjectFactory.makeSymbol( "S#10396", "CYC" );
    $ic33$ = SubLObjectFactory.makeSymbol( "RET" );
    $ic34$ = SubLObjectFactory.makeSymbol( "S#10411", "CYC" );
    $ic35$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10410", "CYC" ), SubLObjectFactory.makeSymbol( "S#10409", "CYC" ) );
    $ic36$ = SubLObjectFactory.makeSymbol( "S#10412", "CYC" );
    $ic37$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10395", "CYC" ) );
    $ic38$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "IGNORE" ), SubLObjectFactory.makeKeyword( "WARN" ), SubLObjectFactory.makeKeyword( "BREAK" ) );
    $ic39$ = SubLObjectFactory.makeKeyword( "BREAK" );
    $ic40$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic41$ = SubLObjectFactory.makeKeyword( "IGNORE" );
    $ic42$ = SubLObjectFactory.makeKeyword( "WARN" );
    $ic43$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#4785", "CYC" ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic44$ = SubLObjectFactory.makeSymbol( "CHECK-TYPE" );
    $ic45$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10414", "CYC" ) );
    $ic46$ = SubLObjectFactory.makeSymbol( "S#10452", "CYC" );
    $ic47$ = SubLObjectFactory.makeSymbol( "S#10417", "CYC" );
    $ic48$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1860", "CYC" ), hl_interface_infrastructure_oc.T ) );
    $ic49$ = SubLObjectFactory.makeSymbol( "S#10453", "CYC" );
    $ic50$ = SubLObjectFactory.makeSymbol( "S#10454", "CYC" );
    $ic51$ = SubLObjectFactory.makeString( "HL Store Iterator Lock" );
    $ic52$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic53$ = SubLObjectFactory.makeSymbol( "POSITIVE-INTEGER-P" );
    $ic54$ = SubLObjectFactory.makeSymbol( "S#10427", "CYC" );
    $ic55$ = SubLObjectFactory.makeSymbol( "S#10389", "CYC" );
    $ic56$ = SubLObjectFactory.makeSymbol( "S#5092", "CYC" );
    $ic57$ = SubLObjectFactory.makeSymbol( "S#10390", "CYC" );
    $ic58$ = SubLObjectFactory.makeSymbol( "S#10430", "CYC" );
    $ic59$ = SubLObjectFactory.makeSymbol( "S#10428", "CYC" );
    $ic60$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#5217", "CYC" ), SubLObjectFactory.makeSymbol( "S#10457", "CYC" ) );
    $ic61$ = SubLObjectFactory.makeSymbol( "S#10431", "CYC" );
    $ic62$ = SubLObjectFactory.makeSymbol( "S#10436", "CYC" );
    $ic63$ = SubLObjectFactory.makeSymbol( "S#10437", "CYC" );
    $ic64$ = SubLObjectFactory.makeSymbol( "S#10438", "CYC" );
    $ic65$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#7542", "CYC" ), SubLObjectFactory.makeSymbol( "S#1519", "CYC" ), SubLObjectFactory.makeSymbol( "S#770", "CYC" ) );
    $ic66$ = SubLObjectFactory.makeSymbol( "S#10429", "CYC" );
    $ic67$ = SubLObjectFactory.makeSymbol( "S#10456", "CYC" );
    $ic68$ = SubLObjectFactory.makeKeyword( "OUTPUT" );
    $ic69$ = SubLObjectFactory.makeKeyword( "UNPROVIDED" );
    $ic70$ = SubLObjectFactory.makeKeyword( "INPUT" );
    $ic71$ = SubLObjectFactory.makeString( "Unable to open ~S" );
    $ic72$ = SubLObjectFactory.makeKeyword( "EOF" );
  }

  public static final class $f8332$UnaryFunction extends UnaryFunction
  {
    public $f8332$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#10389" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var72)
    {
      return hl_interface_infrastructure_oc.f8332( var72 );
    }
  }

  public static final class $f8334$UnaryFunction extends UnaryFunction
  {
    public $f8334$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#10390" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var72)
    {
      return hl_interface_infrastructure_oc.f8334( var72 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/hl_interface_infrastructure_oc.class Total time: 234 ms
 *
 * Decompiled with Procyon 0.5.32.
 */