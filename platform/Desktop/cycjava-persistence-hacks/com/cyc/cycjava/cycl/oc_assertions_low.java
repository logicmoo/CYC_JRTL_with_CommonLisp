package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class oc_assertions_low extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.oc_assertions_low";
  public static final String myFingerPrint = "d6a28cded254899746fc5661baf502f0489f0a7ed3d58e4e10ba7ea7c33a84c9";
  public static SubLSymbol $g2199$;
  private static SubLSymbol $g2200$;
  private static SubLSymbol $g2201$;
  private static SubLSymbol $g2202$;
  private static SubLSymbol $g2203$;
  private static SubLSymbol $g2204$;
  private static SubLSymbol $g2205$;
  private static SubLSymbol $g2206$;
  private static SubLSymbol $g2207$;
  private static SubLSymbol $g2208$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLInteger $ic2$;
  private static final SubLList $ic3$;
  private static final SubLList $ic4$;
  private static final SubLList $ic5$;
  private static final SubLList $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLList $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLSymbol $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLSymbol $ic21$;
  private static final SubLSymbol $ic22$;
  private static final SubLSymbol $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLString $ic25$;
  private static final SubLSymbol $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLSymbol $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLString $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLInteger $ic36$;
  private static final SubLString $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLInteger $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLString $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLString $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLString $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLList $ic53$;
  private static final SubLSymbol $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLList $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLSymbol $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLString $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLSymbol $ic65$;

  public static SubLObject f11136(final SubLObject var1, final SubLObject var2)
  {
    compatibility.default_struct_print_function( var1, var2, oc_assertions_low.ZERO_INTEGER );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11137(final SubLObject var1)
  {
    return ( var1.getClass() == $sX13955_native.class ) ? oc_assertions_low.T : oc_assertions_low.NIL;
  }

  public static SubLObject f11138(final SubLObject var1)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.getField2();
  }

  public static SubLObject f11139(final SubLObject var1)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.getField3();
  }

  public static SubLObject f11140(final SubLObject var1)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.getField4();
  }

  public static SubLObject f11141(final SubLObject var1)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.getField5();
  }

  public static SubLObject f11142(final SubLObject var1)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.getField6();
  }

  public static SubLObject f11143(final SubLObject var1, final SubLObject var4)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.setField2( var4 );
  }

  public static SubLObject f11144(final SubLObject var1, final SubLObject var4)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.setField3( var4 );
  }

  public static SubLObject f11145(final SubLObject var1, final SubLObject var4)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.setField4( var4 );
  }

  public static SubLObject f11146(final SubLObject var1, final SubLObject var4)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.setField5( var4 );
  }

  public static SubLObject f11147(final SubLObject var1, final SubLObject var4)
  {
    assert oc_assertions_low.NIL != f11137( var1 ) : var1;
    return var1.setField6( var4 );
  }

  public static SubLObject f11148(SubLObject var5)
  {
    if( var5 == oc_assertions_low.UNPROVIDED )
    {
      var5 = oc_assertions_low.NIL;
    }
    final SubLObject var6 = new $sX13955_native();
    SubLObject var7;
    SubLObject var8;
    SubLObject var9;
    SubLObject var10;
    for( var7 = oc_assertions_low.NIL, var7 = var5; oc_assertions_low.NIL != var7; var7 = conses_high.cddr( var7 ) )
    {
      var8 = var7.first();
      var9 = conses_high.cadr( var7 );
      var10 = var8;
      if( var10.eql( oc_assertions_low.$ic20$ ) )
      {
        f11143( var6, var9 );
      }
      else if( var10.eql( oc_assertions_low.$ic21$ ) )
      {
        f11144( var6, var9 );
      }
      else if( var10.eql( oc_assertions_low.$ic22$ ) )
      {
        f11145( var6, var9 );
      }
      else if( var10.eql( oc_assertions_low.$ic23$ ) )
      {
        f11146( var6, var9 );
      }
      else if( var10.eql( oc_assertions_low.$ic24$ ) )
      {
        f11147( var6, var9 );
      }
      else
      {
        Errors.error( oc_assertions_low.$ic25$, var8 );
      }
    }
    return var6;
  }

  public static SubLObject f11149(final SubLObject var11, final SubLObject var12)
  {
    Functions.funcall( var12, var11, oc_assertions_low.$ic26$, oc_assertions_low.$ic27$, oc_assertions_low.FIVE_INTEGER );
    Functions.funcall( var12, var11, oc_assertions_low.$ic28$, oc_assertions_low.$ic20$, f11138( var11 ) );
    Functions.funcall( var12, var11, oc_assertions_low.$ic28$, oc_assertions_low.$ic21$, f11139( var11 ) );
    Functions.funcall( var12, var11, oc_assertions_low.$ic28$, oc_assertions_low.$ic22$, f11140( var11 ) );
    Functions.funcall( var12, var11, oc_assertions_low.$ic28$, oc_assertions_low.$ic23$, f11141( var11 ) );
    Functions.funcall( var12, var11, oc_assertions_low.$ic28$, oc_assertions_low.$ic24$, f11142( var11 ) );
    Functions.funcall( var12, var11, oc_assertions_low.$ic29$, oc_assertions_low.$ic27$, oc_assertions_low.FIVE_INTEGER );
    return var11;
  }

  public static SubLObject f11150(final SubLObject var11, final SubLObject var12)
  {
    return f11149( var11, var12 );
  }

  public static SubLObject f11151(final SubLObject var13)
  {
    SubLObject var14 = oc_assertions_low.NIL;
    var14 = f11148( oc_assertions_low.UNPROVIDED );
    f11143( var14, oc_assertions_low.NIL );
    f11144( var14, var13 );
    f11145( var14, oc_assertions_low.$g2200$.getGlobalValue() );
    f11146( var14, oc_assertions_low.NIL );
    f11147( var14, oc_assertions_low.NIL );
    return var14;
  }

  public static SubLObject f11152(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    if( oc_assertions_low.NIL != f11137( var16 ) )
    {
      oc_assertion_manager.f11124( var15 );
      f11143( var16, oc_assertions_low.NIL );
      f11144( var16, oc_assertions_low.NIL );
      f11145( var16, oc_assertions_low.NIL );
      f11146( var16, oc_assertions_low.NIL );
      f11147( var16, oc_assertions_low.NIL );
      return oc_assertions_low.T;
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11153(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    return ( oc_assertions_low.NIL != var16 ) ? f11138( var16 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11154(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    return ( oc_assertions_low.NIL != var16 ) ? f11139( var16 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11155(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    return ( oc_assertions_low.NIL != var16 ) ? f11140( var16 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11156(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    return ( oc_assertions_low.NIL != var16 ) ? f11141( var16 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11157(final SubLObject var15)
  {
    final SubLObject var16 = oc_assertion_manager.f11114( var15 );
    return ( oc_assertions_low.NIL != var16 ) ? f11142( var16 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11158(final SubLObject var15, final SubLObject var17)
  {
    f11143( oc_assertion_manager.f11114( var15 ), var17 );
    oc_assertion_manager.f11125( var15 );
    return var15;
  }

  public static SubLObject f11159(final SubLObject var15, final SubLObject var18)
  {
    f11145( oc_assertion_manager.f11114( var15 ), var18 );
    oc_assertion_manager.f11125( var15 );
    return var15;
  }

  public static SubLObject f11160(final SubLObject var15, final SubLObject var19)
  {
    f11146( oc_assertion_manager.f11114( var15 ), var19 );
    oc_assertion_manager.f11125( var15 );
    return var15;
  }

  public static SubLObject f11161(final SubLObject var15, final SubLObject var20)
  {
    f11147( oc_assertion_manager.f11114( var15 ), var20 );
    oc_assertion_manager.f11125( var15 );
    return var15;
  }

  public static SubLObject f11162(final SubLObject var21, final SubLObject var2)
  {
    module0021.f1038( f11163( var21 ), var2 );
    module0021.f1038( module0178.f11287( var21 ), var2 );
    module0021.f1038( f11164( var21 ), var2 );
    module0021.f1038( module0178.f11299( var21 ), var2 );
    module0021.f1038( f11165( var21 ), var2 );
    return var21;
  }

  public static SubLObject f11166(final SubLObject var21)
  {
    return f11167( f11163( var21 ), module0178.f11287( var21 ), f11164( var21 ), module0178.f11299( var21 ), f11165( var21 ) );
  }

  public static SubLObject f11165(final SubLObject var21)
  {
    SubLObject var22 = oc_assertions_low.NIL;
    SubLObject var23;
    SubLObject var24;
    SubLObject var25;
    for( var23 = oc_assertions_low.NIL, var23 = f11168( var21 ); oc_assertions_low.NIL != var23; var23 = conses_high.cddr( var23 ) )
    {
      var24 = var23.first();
      var25 = conses_high.cadr( var23 );
      if( var24 == oc_assertions_low.$ic31$ )
      {
        var22 = conses_high.putf( var22, var24, module0032.f1753( var25 ) );
      }
      else
      {
        var22 = conses_high.putf( var22, var24, var25 );
      }
    }
    return var22;
  }

  public static SubLObject f11167(final SubLObject var26, final SubLObject var13, final SubLObject var27, final SubLObject var28, final SubLObject var29)
  {
    return ConsesLow.list( var26, var13, var27, var28, var29 );
  }

  public static SubLObject f11169(final SubLObject var21, final SubLObject var30, SubLObject var15)
  {
    if( var15 == oc_assertions_low.UNPROVIDED )
    {
      var15 = oc_assertions_low.NIL;
    }
    if( oc_assertions_low.NIL == var15 )
    {
      var15 = assertion_handles_oc.f11025( var21 );
    }
    final SubLObject var31 = f11166( var21 );
    f11170( var15, var31, var30 );
    return var21;
  }

  public static SubLObject f11170(final SubLObject var15, final SubLObject var31, final SubLObject var30)
  {
    module0093.f6657( var15, var30, var31 );
    return var15;
  }

  public static SubLObject f11171(final SubLObject var21, final SubLObject var2)
  {
    final SubLObject var22 = assertion_handles_oc.f11025( var21 );
    final SubLObject var23 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var24 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var25 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var26 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var27 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    f11172( var22, var23, var24, var25, var26, var27 );
    return var21;
  }

  public static SubLObject f11173(final SubLObject var15, final SubLObject var2)
  {
    final SubLObject var16 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var17 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var18 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var19 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    final SubLObject var20 = module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED );
    return f11167( var16, var17, var18, var19, var20 );
  }

  public static SubLObject f11174(final SubLObject var21, final SubLObject var30)
  {
    final SubLThread var31 = SubLProcess.currentSubLThread();
    final SubLObject var32 = assertion_handles_oc.f11025( var21 );
    SubLObject var33 = oc_assertions_low.NIL;
    final SubLObject var34 = module0021.$g750$.currentBinding( var31 );
    try
    {
      module0021.$g750$.bind( oc_assertions_low.NIL, var31 );
      var33 = module0093.f6621( var32, var30, oc_assertions_low.$ic32$ );
    }
    finally
    {
      module0021.$g750$.rebind( var34, var31 );
    }
    if( !var33.isList() )
    {
      return oc_assertions_low.NIL;
    }
    SubLObject var36;
    final SubLObject var35 = var36 = var33;
    SubLObject var37 = oc_assertions_low.NIL;
    SubLObject var38 = oc_assertions_low.NIL;
    SubLObject var39 = oc_assertions_low.NIL;
    SubLObject var40 = oc_assertions_low.NIL;
    SubLObject var41 = oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, oc_assertions_low.$ic3$ );
    var37 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, oc_assertions_low.$ic3$ );
    var38 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, oc_assertions_low.$ic3$ );
    var39 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, oc_assertions_low.$ic3$ );
    var40 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, oc_assertions_low.$ic3$ );
    var41 = var36.first();
    var36 = var36.rest();
    if( oc_assertions_low.NIL == var36 )
    {
      return f11172( var32, var37, var38, var39, var40, var41 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var35, oc_assertions_low.$ic3$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11172(final SubLObject var15, final SubLObject var26, final SubLObject var13, final SubLObject var27, final SubLObject var28, final SubLObject var29)
  {
    final SubLObject var30 = f11151( var13 );
    f11143( var30, var26 );
    f11145( var30, var27 );
    f11146( var30, var28 );
    f11147( var30, var29 );
    oc_assertion_manager.f11123( var15, var30 );
    return var15;
  }

  public static SubLObject f11175(final SubLObject var21)
  {
    final SubLObject var22 = f11176( var21 );
    if( oc_assertions_low.NIL != module0192.f12006( var22 ) )
    {
      return module0192.f12017( var22 );
    }
    return var22;
  }

  public static SubLObject f11177(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != f11178( var21 ) ) ? f11175( var21 ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11179(final SubLObject var21)
  {
    return f11154( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11180(final SubLObject var21)
  {
    if( oc_assertions_low.NIL == f11181( var21 ) )
    {
      return oc_assertions_low.NIL;
    }
    final SubLObject var22 = f11163( var21 );
    if( oc_assertions_low.NIL != module0192.f12006( var22 ) )
    {
      return f11182( module0192.f12017( var22 ) );
    }
    return var22;
  }

  public static SubLObject f11183(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != f11181( var21 ) ) ? module0178.f11288( var21 ) : f11175( var21 );
  }

  public static SubLObject f11184(final SubLObject var21)
  {
    return module0130.f8505( f11185( f11164( var21 ) ) );
  }

  public static SubLObject f11186(final SubLObject var21)
  {
    return module0130.f8524( f11187( var21 ) );
  }

  public static SubLObject f11188(final SubLObject var21)
  {
    return module0130.f8523( f11187( var21 ) );
  }

  public static SubLObject f11187(final SubLObject var21)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11164( var21 );
    if( oc_assertions_low.NIL == var22 )
    {
      Errors.error( oc_assertions_low.$ic34$, var21, assertion_handles_oc.f11025( var21 ) );
    }
    return module0130.f8522( f11189( var22 ) );
  }

  public static SubLObject f11190(final SubLObject var21)
  {
    return f11191( var21, oc_assertions_low.$ic35$, oc_assertions_low.UNPROVIDED );
  }

  public static SubLObject f11192(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != module0178.f11375( var21 ) ) ? f11193( f11194( var21 ) ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11195(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != module0178.f11375( var21 ) ) ? f11196( f11194( var21 ) ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11197(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != module0178.f11375( var21 ) ) ? f11198( f11194( var21 ) ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11199(final SubLObject var21)
  {
    return ( oc_assertions_low.NIL != module0178.f11375( var21 ) ) ? f11200( f11194( var21 ) ) : oc_assertions_low.NIL;
  }

  public static SubLObject f11201(final SubLObject var21)
  {
    return f11156( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11202(final SubLObject var21)
  {
    SubLObject var22 = f11191( var21, oc_assertions_low.$ic31$, oc_assertions_low.UNPROVIDED );
    if( var22.isList() && oc_assertions_low.NIL != module0035.f2002( var22, oc_assertions_low.$ic36$, oc_assertions_low.UNPROVIDED ) )
    {
      var22 = module0076.f5288( module0032.f1753( var22 ), oc_assertions_low.EQL, oc_assertions_low.UNPROVIDED );
      f11203( var21, oc_assertions_low.$ic31$, var22 );
    }
    return var22;
  }

  public static SubLObject f11163(final SubLObject var21)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    return f11153( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11204(final SubLObject var21, final SubLObject var17)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    f11158( assertion_handles_oc.f11025( var21 ), var17 );
    return var21;
  }

  public static SubLObject f11176(final SubLObject var21)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11163( var21 );
    if( oc_assertions_low.NIL != module0192.f12006( var22 ) )
    {
      return var22;
    }
    if( oc_assertions_low.NIL == var22 )
    {
      return var22;
    }
    if( oc_assertions_low.NIL == f11181( var21 ) )
    {
      return var22;
    }
    return f11205( var22 );
  }

  public static SubLObject f11206(final SubLObject var21, final SubLObject var17)
  {
    if( oc_assertions_low.NIL != module0192.f12006( var17 ) )
    {
      f11207( var21, var17 );
    }
    else if( oc_assertions_low.NIL == var17 )
    {
      f11208( var21 );
    }
    else if( oc_assertions_low.NIL != module0232.f15320( var17 ) )
    {
      f11209( var21, var17 );
    }
    else
    {
      if( oc_assertions_low.NIL == module0202.f12590( var17 ) )
      {
        Errors.error( oc_assertions_low.$ic37$, var17 );
        return oc_assertions_low.NIL;
      }
      f11210( var21, var17 );
    }
    return var21;
  }

  public static SubLObject f11211(final SubLObject var21)
  {
    final SubLObject var22 = f11163( var21 );
    return ( oc_assertions_low.NIL != module0192.f12006( var22 ) ) ? var22 : oc_assertions_low.NIL;
  }

  public static SubLObject f11209(final SubLObject var21, final SubLObject var38)
  {
    final SubLObject var39 = f11212( var38 );
    f11204( var21, ( oc_assertions_low.NIL != var39 ) ? f11182( var38 ) : var38 );
    f11213( var21, var39 );
    return var21;
  }

  public static SubLObject f11207(final SubLObject var21, final SubLObject var40)
  {
    final SubLObject var41 = module0192.f12017( var40 );
    f11204( var21, var40 );
    if( oc_assertions_low.NIL == var41 )
    {
      return f11208( var21 );
    }
    f11214( var21 );
    return var21;
  }

  public static SubLObject f11210(final SubLObject var21, final SubLObject var42)
  {
    f11204( var21, var42 );
    f11213( var21, oc_assertions_low.T );
    return var21;
  }

  public static SubLObject f11208(final SubLObject var21)
  {
    f11204( var21, oc_assertions_low.NIL );
    f11213( var21, oc_assertions_low.T );
    return var21;
  }

  public static SubLObject f11164(final SubLObject var21)
  {
    final SubLObject var22 = f11155( assertion_handles_oc.f11025( var21 ) );
    return var22;
  }

  public static SubLObject f11215(final SubLObject var21, final SubLObject var18)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11164( var21 );
    if( !var22.eql( var18 ) )
    {
      f11159( assertion_handles_oc.f11025( var21 ), var18 );
    }
    return var21;
  }

  public static SubLObject f11216(final SubLObject var27)
  {
    return bytes.ldb( oc_assertions_low.$g2201$.getGlobalValue(), var27 );
  }

  public static SubLObject f11217(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, oc_assertions_low.$g2201$.getGlobalValue(), var27 );
  }

  public static SubLObject f11185(final SubLObject var27)
  {
    return bytes.ldb( oc_assertions_low.$g2202$.getGlobalValue(), var27 );
  }

  public static SubLObject f11218(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, oc_assertions_low.$g2202$.getGlobalValue(), var27 );
  }

  public static SubLObject f11189(final SubLObject var27)
  {
    return bytes.ldb( oc_assertions_low.$g2203$.getGlobalValue(), var27 );
  }

  public static SubLObject f11219(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, oc_assertions_low.$g2203$.getGlobalValue(), var27 );
  }

  public static SubLObject f11220(final SubLObject var21)
  {
    return Numbers.oddp( f11164( var21 ) );
  }

  public static SubLObject f11221(final SubLObject var21, final SubLObject var39)
  {
    final SubLObject var40 = module0048.f3276( var39 );
    if( oc_assertions_low.NIL != var40 )
    {
      f11215( var21, f11217( f11164( var21 ), var40 ) );
    }
    return var21;
  }

  public static SubLObject f11222()
  {
    return SubLObjectFactory.makeBoolean( oc_assertions_low.NIL != oc_assertions_low.$g2205$.getGlobalValue() && oc_assertions_low.NIL != oc_assertions_low.$g2204$.getGlobalValue() );
  }

  public static SubLObject f11223(final SubLObject var45)
  {
    assert oc_assertions_low.NIL != module0004.f106( var45 ) : var45;
    final SubLObject var46 = Numbers.ceiling( Numbers.divide( var45, oc_assertions_low.$g2206$.getGlobalValue() ), oc_assertions_low.UNPROVIDED );
    oc_assertions_low.$g2204$.setGlobalValue( module0031.f1685( var46, Symbols.symbol_function( oc_assertions_low.EQ ) ) );
    return oc_assertions_low.T;
  }

  public static SubLObject f11224()
  {
    return oc_assertions_low.$g2204$.getGlobalValue();
  }

  public static SubLObject f11181(final SubLObject var21)
  {
    if( oc_assertions_low.NIL != f11222() && oc_assertions_low.NIL != oc_assertion_manager.f11113( var21 ) )
    {
      return SubLObjectFactory.makeBoolean( oc_assertions_low.NIL == module0031.f1688( var21, oc_assertions_low.$g2204$.getGlobalValue() ) );
    }
    if( oc_assertions_low.NIL != assertion_handles_oc.f11047( var21 ) )
    {
      return f11220( var21 );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11225(final SubLObject var21)
  {
    if( oc_assertions_low.NIL != f11222() && oc_assertions_low.NIL != oc_assertion_manager.f11113( var21 ) )
    {
      return module0031.f1688( var21, oc_assertions_low.$g2204$.getGlobalValue() );
    }
    if( oc_assertions_low.NIL != assertion_handles_oc.f11047( var21 ) )
    {
      return SubLObjectFactory.makeBoolean( oc_assertions_low.NIL == f11220( var21 ) );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11226()
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    if( oc_assertions_low.NIL != oc_assertions_low.$g2204$.getGlobalValue() )
    {
      return module0031.f1670( oc_assertions_low.$g2204$.getGlobalValue() );
    }
    SubLObject var33 = oc_assertions_low.ZERO_INTEGER;
    final SubLObject var34 = assertion_handles_oc.f11010();
    final SubLObject var35 = oc_assertions_low.$ic44$;
    final SubLObject var36 = module0065.f4733( var34 );
    SubLObject var37 = oc_assertions_low.ZERO_INTEGER;
    assert oc_assertions_low.NIL != Types.stringp( var35 ) : var35;
    final SubLObject var38 = module0012.$g75$.currentBinding( var32 );
    final SubLObject var39 = module0012.$g76$.currentBinding( var32 );
    final SubLObject var40 = module0012.$g77$.currentBinding( var32 );
    final SubLObject var41 = module0012.$g78$.currentBinding( var32 );
    try
    {
      module0012.$g75$.bind( oc_assertions_low.ZERO_INTEGER, var32 );
      module0012.$g76$.bind( oc_assertions_low.NIL, var32 );
      module0012.$g77$.bind( oc_assertions_low.T, var32 );
      module0012.$g78$.bind( Time.get_universal_time(), var32 );
      module0012.f478( var35 );
      final SubLObject var55_56 = var34;
      if( oc_assertions_low.NIL == module0065.f4772( var55_56, oc_assertions_low.$ic46$ ) )
      {
        final SubLObject var57_58 = var55_56;
        if( oc_assertions_low.NIL == module0065.f4775( var57_58, oc_assertions_low.$ic46$ ) )
        {
          final SubLObject var42 = module0065.f4740( var57_58 );
          final SubLObject var43 = oc_assertions_low.NIL;
          SubLObject var44;
          SubLObject var45;
          SubLObject var46;
          SubLObject var47;
          for( var44 = Sequences.length( var42 ), var45 = oc_assertions_low.NIL, var45 = oc_assertions_low.ZERO_INTEGER; var45.numL( var44 ); var45 = Numbers.add( var45,
              oc_assertions_low.ONE_INTEGER ) )
          {
            var46 = ( ( oc_assertions_low.NIL != var43 ) ? Numbers.subtract( var44, var45, oc_assertions_low.ONE_INTEGER ) : var45 );
            var47 = Vectors.aref( var42, var46 );
            if( oc_assertions_low.NIL == module0065.f4749( var47 ) || oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) )
            {
              if( oc_assertions_low.NIL != module0065.f4749( var47 ) )
              {
                var47 = oc_assertions_low.$ic46$;
              }
              module0012.note_percent_progress( var37, var36 );
              var37 = Numbers.add( var37, oc_assertions_low.ONE_INTEGER );
              if( oc_assertions_low.NIL != f11225( var47 ) )
              {
                var33 = Numbers.add( var33, oc_assertions_low.ONE_INTEGER );
              }
            }
          }
        }
        final SubLObject var65_66 = var55_56;
        if( oc_assertions_low.NIL == module0065.f4777( var65_66 ) || oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) )
        {
          final SubLObject var48 = module0065.f4738( var65_66 );
          SubLObject var49 = module0065.f4739( var65_66 );
          final SubLObject var50 = module0065.f4734( var65_66 );
          final SubLObject var51 = ( oc_assertions_low.NIL != module0065.f4773( oc_assertions_low.$ic46$ ) ) ? oc_assertions_low.NIL : oc_assertions_low.$ic46$;
          while ( var49.numL( var50 ))
          {
            final SubLObject var52 = Hashtables.gethash_without_values( var49, var48, var51 );
            if( oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) || oc_assertions_low.NIL == module0065.f4749( var52 ) )
            {
              module0012.note_percent_progress( var37, var36 );
              var37 = Numbers.add( var37, oc_assertions_low.ONE_INTEGER );
              if( oc_assertions_low.NIL != f11225( var52 ) )
              {
                var33 = Numbers.add( var33, oc_assertions_low.ONE_INTEGER );
              }
            }
            var49 = Numbers.add( var49, oc_assertions_low.ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var41, var32 );
      module0012.$g77$.rebind( var40, var32 );
      module0012.$g76$.rebind( var39, var32 );
      module0012.$g75$.rebind( var38, var32 );
    }
    return var33;
  }

  public static SubLObject f11227()
  {
    return Numbers.subtract( assertion_handles_oc.f11019(), f11226() );
  }

  public static SubLObject f11213(final SubLObject var21, final SubLObject var39)
  {
    if( oc_assertions_low.NIL != oc_assertions_low.$g2204$.getGlobalValue() )
    {
      if( oc_assertions_low.NIL != var39 )
      {
        module0031.f1691( var21, oc_assertions_low.$g2204$.getGlobalValue() );
      }
      else
      {
        module0031.f1690( var21, oc_assertions_low.$g2204$.getGlobalValue() );
      }
    }
    return f11221( var21, var39 );
  }

  public static SubLObject f11228(final SubLObject var21)
  {
    if( oc_assertions_low.NIL != oc_assertions_low.$g2204$.getGlobalValue() && oc_assertions_low.NIL != f11225( var21 ) )
    {
      return module0031.f1691( var21, oc_assertions_low.$g2204$.getGlobalValue() );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11214(final SubLObject var21)
  {
    final SubLObject var22 = f11163( var21 );
    SubLObject var23 = oc_assertions_low.NIL;
    if( oc_assertions_low.NIL != module0192.f12006( var22 ) )
    {
      var23 = f11212( module0192.f12017( var22 ) );
    }
    else if( oc_assertions_low.NIL != module0232.f15320( var22 ) )
    {
      var23 = f11212( var22 );
    }
    else
    {
      var23 = oc_assertions_low.T;
    }
    return f11213( var21, var23 );
  }

  public static SubLObject f11212(final SubLObject var70)
  {
    assert oc_assertions_low.NIL != module0232.f15320( var70 ) : var70;
    return module0232.f15322( var70 );
  }

  public static SubLObject f11229(final SubLObject var2)
  {
    return module0021.f1038( oc_assertions_low.$g2204$.getGlobalValue(), var2 );
  }

  public static SubLObject f11230(final SubLObject var2)
  {
    oc_assertions_low.$g2204$.setGlobalValue( module0021.f1060( var2, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED ) );
    return module0031.f1670( oc_assertions_low.$g2204$.getGlobalValue() );
  }

  public static SubLObject f11231()
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    f11223( assertion_handles_oc.f11019() );
    final SubLObject var33 = assertion_handles_oc.f11010();
    final SubLObject var34 = oc_assertions_low.$ic48$;
    final SubLObject var35 = module0065.f4733( var33 );
    SubLObject var36 = oc_assertions_low.ZERO_INTEGER;
    assert oc_assertions_low.NIL != Types.stringp( var34 ) : var34;
    final SubLObject var37 = module0012.$g75$.currentBinding( var32 );
    final SubLObject var38 = module0012.$g76$.currentBinding( var32 );
    final SubLObject var39 = module0012.$g77$.currentBinding( var32 );
    final SubLObject var40 = module0012.$g78$.currentBinding( var32 );
    try
    {
      module0012.$g75$.bind( oc_assertions_low.ZERO_INTEGER, var32 );
      module0012.$g76$.bind( oc_assertions_low.NIL, var32 );
      module0012.$g77$.bind( oc_assertions_low.T, var32 );
      module0012.$g78$.bind( Time.get_universal_time(), var32 );
      module0012.f478( var34 );
      final SubLObject var55_71 = var33;
      if( oc_assertions_low.NIL == module0065.f4772( var55_71, oc_assertions_low.$ic46$ ) )
      {
        final SubLObject var57_72 = var55_71;
        if( oc_assertions_low.NIL == module0065.f4775( var57_72, oc_assertions_low.$ic46$ ) )
        {
          final SubLObject var41 = module0065.f4740( var57_72 );
          final SubLObject var42 = oc_assertions_low.NIL;
          SubLObject var43;
          SubLObject var44;
          SubLObject var45;
          SubLObject var46;
          SubLObject var47;
          SubLObject var33_75;
          for( var43 = Sequences.length( var41 ), var44 = oc_assertions_low.NIL, var44 = oc_assertions_low.ZERO_INTEGER; var44.numL( var43 ); var44 = Numbers.add( var44,
              oc_assertions_low.ONE_INTEGER ) )
          {
            var45 = ( ( oc_assertions_low.NIL != var42 ) ? Numbers.subtract( var43, var44, oc_assertions_low.ONE_INTEGER ) : var44 );
            var46 = Vectors.aref( var41, var45 );
            if( oc_assertions_low.NIL == module0065.f4749( var46 ) || oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) )
            {
              if( oc_assertions_low.NIL != module0065.f4749( var46 ) )
              {
                var46 = oc_assertions_low.$ic46$;
              }
              module0012.note_percent_progress( var36, var35 );
              var36 = Numbers.add( var36, oc_assertions_low.ONE_INTEGER );
              var47 = oc_assertions_low.NIL;
              try
              {
                var32.throwStack.push( module0003.$g3$.getGlobalValue() );
                var33_75 = Errors.$error_handler$.currentBinding( var32 );
                try
                {
                  Errors.$error_handler$.bind( oc_assertions_low.$ic49$, var32 );
                  try
                  {
                    if( oc_assertions_low.NIL != assertion_handles_oc.f11046( var46 ) && oc_assertions_low.NIL == f11220( var46 ) )
                    {
                      module0031.f1690( var46, oc_assertions_low.$g2204$.getGlobalValue() );
                    }
                  }
                  catch( final Throwable var48 )
                  {
                    Errors.handleThrowable( var48, oc_assertions_low.NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( var33_75, var32 );
                }
              }
              catch( final Throwable var49 )
              {
                var47 = Errors.handleThrowable( var49, module0003.$g3$.getGlobalValue() );
              }
              finally
              {
                var32.throwStack.pop();
              }
              if( var47.isString() )
              {
                Errors.warn( oc_assertions_low.$ic50$, var47 );
              }
            }
          }
        }
        final SubLObject var65_78 = var55_71;
        if( oc_assertions_low.NIL == module0065.f4777( var65_78 ) || oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) )
        {
          final SubLObject var50 = module0065.f4738( var65_78 );
          SubLObject var51 = module0065.f4739( var65_78 );
          final SubLObject var52 = module0065.f4734( var65_78 );
          final SubLObject var53 = ( oc_assertions_low.NIL != module0065.f4773( oc_assertions_low.$ic46$ ) ) ? oc_assertions_low.NIL : oc_assertions_low.$ic46$;
          while ( var51.numL( var52 ))
          {
            final SubLObject var54 = Hashtables.gethash_without_values( var51, var50, var53 );
            if( oc_assertions_low.NIL == module0065.f4773( oc_assertions_low.$ic46$ ) || oc_assertions_low.NIL == module0065.f4749( var54 ) )
            {
              module0012.note_percent_progress( var36, var35 );
              var36 = Numbers.add( var36, oc_assertions_low.ONE_INTEGER );
              SubLObject var55 = oc_assertions_low.NIL;
              try
              {
                var32.throwStack.push( module0003.$g3$.getGlobalValue() );
                final SubLObject var33_76 = Errors.$error_handler$.currentBinding( var32 );
                try
                {
                  Errors.$error_handler$.bind( oc_assertions_low.$ic49$, var32 );
                  try
                  {
                    if( oc_assertions_low.NIL != assertion_handles_oc.f11046( var54 ) && oc_assertions_low.NIL == f11220( var54 ) )
                    {
                      module0031.f1690( var54, oc_assertions_low.$g2204$.getGlobalValue() );
                    }
                  }
                  catch( final Throwable var56 )
                  {
                    Errors.handleThrowable( var56, oc_assertions_low.NIL );
                  }
                }
                finally
                {
                  Errors.$error_handler$.rebind( var33_76, var32 );
                }
              }
              catch( final Throwable var57 )
              {
                var55 = Errors.handleThrowable( var57, module0003.$g3$.getGlobalValue() );
              }
              finally
              {
                var32.throwStack.pop();
              }
              if( var55.isString() )
              {
                Errors.warn( oc_assertions_low.$ic50$, var55 );
              }
            }
            var51 = Numbers.add( var51, oc_assertions_low.ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var40, var32 );
      module0012.$g77$.rebind( var39, var32 );
      module0012.$g76$.rebind( var38, var32 );
      module0012.$g75$.rebind( var37, var32 );
    }
    return module0031.f1670( oc_assertions_low.$g2204$.getGlobalValue() );
  }

  public static SubLObject f11205(final SubLObject var80)
  {
    return module0204.f13033( var80 );
  }

  public static SubLObject f11182(final SubLObject var70)
  {
    return module0204.f13047( var70 );
  }

  public static SubLObject f11232(final SubLObject var21, final SubLObject var81)
  {
    if( oc_assertions_low.NIL != module0178.f11284( var21 ) )
    {
      f11233( var21, var81 );
    }
    else
    {
      module0217.f14367( var21, oc_assertions_low.UNPROVIDED );
      f11233( var21, var81 );
      module0217.f14364( var21, oc_assertions_low.UNPROVIDED );
    }
    return var21;
  }

  public static SubLObject f11233(final SubLObject var21, final SubLObject var81)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var82 = module0130.f8504( var81 );
    if( oc_assertions_low.NIL != var82 )
    {
      f11215( var21, f11218( f11164( var21 ), var82 ) );
    }
    return var21;
  }

  public static SubLObject f11234(final SubLObject var21, final SubLObject var83)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var84 = module0130.f8521( var83 );
    if( oc_assertions_low.NIL != var84 )
    {
      f11215( var21, f11219( f11164( var21 ), var84 ) );
    }
    return var21;
  }

  public static SubLObject f11235(final SubLObject var21, final SubLObject var85)
  {
    final SubLObject var86 = module0178.f11293( var21 );
    final SubLObject var87 = module0130.f8529( var85, var86 );
    return f11234( var21, var87 );
  }

  public static SubLObject f11236(final SubLObject var21, final SubLObject var87)
  {
    final SubLObject var88 = module0178.f11292( var21 );
    final SubLObject var89 = module0130.f8529( var88, var87 );
    return f11234( var21, var89 );
  }

  public static SubLObject f11168(final SubLObject var21)
  {
    return f11157( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11237(final SubLObject var21, final SubLObject var29)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert oc_assertions_low.NIL != Types.listp( var29 ) : var29;
    f11161( assertion_handles_oc.f11025( var21 ), var29 );
    return var21;
  }

  public static SubLObject f11191(final SubLObject var21, final SubLObject var89, SubLObject var90)
  {
    if( var90 == oc_assertions_low.UNPROVIDED )
    {
      var90 = oc_assertions_low.NIL;
    }
    return conses_high.getf( f11168( var21 ), var89, var90 );
  }

  public static SubLObject f11203(final SubLObject var21, final SubLObject var89, final SubLObject var25)
  {
    final SubLObject var90 = f11168( var21 );
    final SubLObject var91 = conses_high.putf( var90, var89, var25 );
    f11237( var21, var91 );
    return var21;
  }

  public static SubLObject f11238(final SubLObject var21, final SubLObject var89)
  {
    final SubLObject var90 = f11168( var21 );
    final SubLObject var91 = conses_high.remf( var90, var89 );
    f11237( var21, var91 );
    return var21;
  }

  public static SubLObject f11239(final SubLObject var21, final SubLObject var92)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert oc_assertions_low.NIL != module0035.f2015( var92 ) : var92;
    SubLObject var93 = var92;
    SubLObject var94 = oc_assertions_low.NIL;
    var94 = var93.first();
    while ( oc_assertions_low.NIL != var93)
    {
      assert oc_assertions_low.NIL != Types.stringp( var94 ) : var94;
      var93 = var93.rest();
      var94 = var93.first();
    }
    if( oc_assertions_low.NIL != var92 )
    {
      f11203( var21, oc_assertions_low.$ic35$, var92 );
    }
    else
    {
      f11238( var21, oc_assertions_low.$ic35$ );
    }
    return var21;
  }

  public static SubLObject f11240(final SubLObject var21)
  {
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11241(final SubLObject var21)
  {
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11242(final SubLObject var21)
  {
    return module0212.f13756( var21 );
  }

  public static SubLObject f11243(final SubLObject var21)
  {
    return oc_assertions_low.T;
  }

  public static SubLObject f11244(final SubLObject var21, final SubLObject var96)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    if( var96.eql( module0212.f13757() ) )
    {
      module0212.f13758( var21 );
    }
    else
    {
      module0212.f13759( var21, var96 );
    }
    return var21;
  }

  public static SubLObject f11245(final SubLObject var21)
  {
    return f11244( var21, module0212.f13757() );
  }

  public static SubLObject f11246(final SubLObject var97, final SubLObject var98)
  {
    SubLObject var100;
    final SubLObject var99 = var100 = var97.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
    final SubLObject var101 = var100.rest();
    var100 = var100.first();
    SubLObject var102 = oc_assertions_low.NIL;
    SubLObject var103 = oc_assertions_low.NIL;
    SubLObject var104 = oc_assertions_low.NIL;
    SubLObject var105 = oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
    var102 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
    var103 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
    var104 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
    var105 = var100.first();
    var100 = var100.rest();
    if( oc_assertions_low.NIL == var100 )
    {
      var100 = var101;
      SubLObject var106 = oc_assertions_low.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var100, var99, oc_assertions_low.$ic53$ );
      var106 = var100.first();
      final SubLObject var107;
      var100 = ( var107 = var100.rest() );
      return ConsesLow.listS( oc_assertions_low.$ic54$, ConsesLow.list( oc_assertions_low.$ic55$, var102, var103, var104, var105 ), var106, ConsesLow.append( var107,
          oc_assertions_low.NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var99, oc_assertions_low.$ic53$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11194(final SubLObject var21)
  {
    final SubLObject var22 = f11191( var21, oc_assertions_low.$ic56$, oc_assertions_low.UNPROVIDED );
    if( oc_assertions_low.NIL != var22 )
    {
      return var22;
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11247(final SubLObject var21, final SubLObject var108)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    if( oc_assertions_low.NIL != var108 )
    {
      f11203( var21, oc_assertions_low.$ic56$, var108 );
    }
    else
    {
      f11238( var21, oc_assertions_low.$ic56$ );
    }
    return var21;
  }

  public static SubLObject f11248(final SubLObject var21)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    if( oc_assertions_low.NIL != module0178.f11375( var21 ) )
    {
      return module0035.sublisp_boolean( f11194( var21 ) );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11249(SubLObject var102, SubLObject var103, SubLObject var104, SubLObject var105)
  {
    if( var102 == oc_assertions_low.UNPROVIDED )
    {
      var102 = oc_assertions_low.NIL;
    }
    if( var103 == oc_assertions_low.UNPROVIDED )
    {
      var103 = oc_assertions_low.NIL;
    }
    if( var104 == oc_assertions_low.UNPROVIDED )
    {
      var104 = oc_assertions_low.NIL;
    }
    if( var105 == oc_assertions_low.UNPROVIDED )
    {
      var105 = oc_assertions_low.NIL;
    }
    if( oc_assertions_low.NIL != var105 )
    {
      return ConsesLow.list( var102, var103, var104, var105 );
    }
    if( oc_assertions_low.NIL != var104 )
    {
      return ConsesLow.list( var102, var103, var104 );
    }
    if( oc_assertions_low.NIL != var103 )
    {
      return ConsesLow.list( var102, var103 );
    }
    if( oc_assertions_low.NIL != var102 )
    {
      return ConsesLow.list( var102 );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11193(final SubLObject var106)
  {
    return var106.first();
  }

  public static SubLObject f11196(final SubLObject var106)
  {
    return conses_high.second( var106 );
  }

  public static SubLObject f11198(final SubLObject var106)
  {
    return conses_high.third( var106 );
  }

  public static SubLObject f11200(final SubLObject var106)
  {
    return conses_high.fourth( var106 );
  }

  public static SubLObject f11250(final SubLObject var21, final SubLObject var109)
  {
    SubLObject var111;
    final SubLObject var110 = var111 = f11194( var21 );
    final SubLObject var112 = var111.isCons() ? var111.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, oc_assertions_low.$ic57$ );
    var111 = var111.rest();
    final SubLObject var113 = var111.isCons() ? var111.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, oc_assertions_low.$ic57$ );
    var111 = var111.rest();
    final SubLObject var114 = var111.isCons() ? var111.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, oc_assertions_low.$ic57$ );
    var111 = var111.rest();
    final SubLObject var115 = var111.isCons() ? var111.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, oc_assertions_low.$ic57$ );
    var111 = var111.rest();
    if( oc_assertions_low.NIL == var111 )
    {
      return f11247( var21, f11249( var109, var113, var114, var115 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, oc_assertions_low.$ic57$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11251(final SubLObject var21, final SubLObject var112)
  {
    SubLObject var114;
    final SubLObject var113 = var114 = f11194( var21 );
    final SubLObject var115 = var114.isCons() ? var114.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, oc_assertions_low.$ic57$ );
    var114 = var114.rest();
    final SubLObject var116 = var114.isCons() ? var114.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, oc_assertions_low.$ic57$ );
    var114 = var114.rest();
    final SubLObject var117 = var114.isCons() ? var114.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, oc_assertions_low.$ic57$ );
    var114 = var114.rest();
    final SubLObject var118 = var114.isCons() ? var114.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, oc_assertions_low.$ic57$ );
    var114 = var114.rest();
    if( oc_assertions_low.NIL == var114 )
    {
      return f11247( var21, f11249( var115, var112, var117, var118 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var113, oc_assertions_low.$ic57$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11252(final SubLObject var21, final SubLObject var115)
  {
    SubLObject var117;
    final SubLObject var116 = var117 = f11194( var21 );
    final SubLObject var118 = var117.isCons() ? var117.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, oc_assertions_low.$ic57$ );
    var117 = var117.rest();
    final SubLObject var119 = var117.isCons() ? var117.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, oc_assertions_low.$ic57$ );
    var117 = var117.rest();
    final SubLObject var120 = var117.isCons() ? var117.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, oc_assertions_low.$ic57$ );
    var117 = var117.rest();
    final SubLObject var121 = var117.isCons() ? var117.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, oc_assertions_low.$ic57$ );
    var117 = var117.rest();
    if( oc_assertions_low.NIL == var117 )
    {
      return f11247( var21, f11249( var118, var119, var115, var121 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var116, oc_assertions_low.$ic57$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11253(final SubLObject var21, final SubLObject var118)
  {
    SubLObject var120;
    final SubLObject var119 = var120 = f11194( var21 );
    final SubLObject var121 = var120.isCons() ? var120.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, oc_assertions_low.$ic57$ );
    var120 = var120.rest();
    final SubLObject var122 = var120.isCons() ? var120.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, oc_assertions_low.$ic57$ );
    var120 = var120.rest();
    final SubLObject var123 = var120.isCons() ? var120.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, oc_assertions_low.$ic57$ );
    var120 = var120.rest();
    final SubLObject var124 = var120.isCons() ? var120.first() : oc_assertions_low.NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, oc_assertions_low.$ic57$ );
    var120 = var120.rest();
    if( oc_assertions_low.NIL == var120 )
    {
      return f11247( var21, f11249( var121, var122, var123, var118 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var119, oc_assertions_low.$ic57$ );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11254(final SubLObject var21)
  {
    final SubLObject var22 = module0178.f11299( var21 );
    final SubLObject var23 = module0178.f11300( var21 );
    final SubLObject var24 = f11190( var21 );
    final SubLObject var25 = f11242( var21 );
    return SubLObjectFactory.makeBoolean( oc_assertions_low.NIL != module0161.f10571( f11179( var21 ), oc_assertions_low.UNPROVIDED ) && oc_assertions_low.NIL != module0130.f8520( f11187(
        var21 ) ) && var22.isCons() && oc_assertions_low.NIL != module0035.f2370( Symbols.symbol_function( oc_assertions_low.$ic58$ ), var22, oc_assertions_low.UNPROVIDED )
        && oc_assertions_low.NIL != module0032.f1724( var23 ) && oc_assertions_low.NIL != module0035.f2370( Symbols.symbol_function( oc_assertions_low.$ic58$ ), module0032.f1753( var23 ),
            oc_assertions_low.UNPROVIDED ) && var24.isList() && oc_assertions_low.NIL != module0035.f2370( Symbols.symbol_function( oc_assertions_low.$ic45$ ), var24,
                oc_assertions_low.UNPROVIDED ) && oc_assertions_low.NIL != module0130.f8503( module0178.f11291( var21 ) ) && oc_assertions_low.NIL != module0212.f13775( var25 ) );
  }

  public static SubLObject f11178(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    final SubLObject var23 = assertion_handles_oc.f11025( var21 );
    SubLObject var24 = oc_assertions_low.NIL;
    SubLObject var25 = oc_assertions_low.NIL;
    try
    {
      var22.throwStack.push( oc_assertions_low.$ic59$ );
      final SubLObject var26 = Errors.$error_handler$.currentBinding( var22 );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( oc_assertions_low.$ic60$ ), var22 );
        try
        {
          var24 = oc_assertion_manager.f11114( var23 );
        }
        catch( final Throwable var27 )
        {
          Errors.handleThrowable( var27, oc_assertions_low.NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var26, var22 );
      }
    }
    catch( final Throwable var28 )
    {
      var25 = Errors.handleThrowable( var28, oc_assertions_low.$ic59$ );
    }
    finally
    {
      var22.throwStack.pop();
    }
    return module0035.sublisp_boolean( var24 );
  }

  public static SubLObject f11255(final SubLObject var70, final SubLObject var13, final SubLObject var125, final SubLObject var126, final SubLObject var127, final SubLObject var128, final SubLObject var129)
  {
    SubLObject var130 = module0217.f14416( var70, var13 );
    if( oc_assertions_low.NIL != var130 )
    {
      return assertion_handles_oc.f11025( var130 );
    }
    final SubLObject var131 = assertion_handles_oc.f11029();
    var130 = assertion_handles_oc.f11049( var131 );
    f11256( var130, var131, var70, var13, var125, var126, var127, var128, var129 );
    return var131;
  }

  public static SubLObject f11256(final SubLObject var21, final SubLObject var130, final SubLObject var70, final SubLObject var13, final SubLObject var125, final SubLObject var126, final SubLObject var127,
      final SubLObject var128, final SubLObject var129)
  {
    final SubLObject var131 = f11151( var13 );
    oc_assertion_manager.f11123( var130, var131 );
    f11239( var21, var125 );
    f11234( var21, module0130.f8529( var127, var128 ) );
    final SubLObject var132 = f11257( var70 );
    f11258( var21, var132 );
    f11232( var21, var126 );
    if( oc_assertions_low.NIL != var129 )
    {
      f11259( var21, var129 );
    }
    if( var126 == oc_assertions_low.$ic61$ )
    {
      module0528.f32917( var21 );
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11260(final SubLObject var130)
  {
    final SubLObject var131 = assertion_handles_oc.f11053( var130 );
    return ( oc_assertions_low.NIL != var131 ) ? var131 : assertion_handles_oc.f11049( var130 );
  }

  public static SubLObject f11257(final SubLObject var70)
  {
    if( oc_assertions_low.NIL != module0232.f15322( var70 ) )
    {
      return f11261( module0204.f13047( var70 ) );
    }
    return f11262( var70 );
  }

  public static SubLObject f11262(final SubLObject var70)
  {
    final SubLObject var71 = module0217.f14418( var70 );
    if( oc_assertions_low.NIL != var71 )
    {
      final SubLObject var72 = f11211( var71 );
      return ( oc_assertions_low.NIL != var72 ) ? var72 : var71;
    }
    return var70;
  }

  public static SubLObject f11261(final SubLObject var80)
  {
    final SubLObject var81 = module0217.f14423( var80 );
    if( oc_assertions_low.NIL != var81 )
    {
      final SubLObject var82 = f11211( var81 );
      return ( oc_assertions_low.NIL != var82 ) ? var82 : var81;
    }
    return var80;
  }

  public static SubLObject f11258(final SubLObject var21, final SubLObject var131)
  {
    f11263( var21, var131 );
    module0217.f14364( var21, oc_assertions_low.UNPROVIDED );
    return var21;
  }

  public static SubLObject f11263(final SubLObject var21, final SubLObject var131)
  {
    SubLObject var132 = var131;
    if( oc_assertions_low.NIL != module0192.f12006( var131 ) )
    {
      module0192.f12039( var131, var21 );
    }
    else if( oc_assertions_low.NIL != assertion_handles_oc.f11035( var131 ) )
    {
      final SubLObject var133 = module0178.f11282( var131 );
      final SubLObject var134 = module0192.f12034( var133 );
      module0192.f12039( var134, var131 );
      module0192.f12039( var134, var21 );
      var132 = var134;
      f11207( var131, var132 );
    }
    else if( oc_assertions_low.NIL == module0232.f15320( var131 ) )
    {
      if( oc_assertions_low.NIL == module0202.f12590( var131 ) )
      {
        Errors.error( oc_assertions_low.$ic62$, var131 );
        return oc_assertions_low.NIL;
      }
    }
    f11206( var21, var132 );
    return var21;
  }

  public static SubLObject f11264(final SubLObject var21)
  {
    final SubLObject var22 = assertion_handles_oc.f11025( var21 );
    f11265( var21 );
    f11152( var22 );
    assertion_handles_oc.f11028( var22 );
    assertion_handles_oc.f11044( var21 );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11266(final SubLObject var21, final SubLObject var38)
  {
    f11265( var21 );
    final SubLObject var39 = f11262( var38 );
    f11258( var21, var39 );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11265(final SubLObject var21)
  {
    module0217.f14367( var21, oc_assertions_low.UNPROVIDED );
    f11267( var21 );
    return var21;
  }

  public static SubLObject f11267(final SubLObject var21)
  {
    final SubLObject var22 = f11211( var21 );
    if( oc_assertions_low.NIL != var22 )
    {
      module0192.f12042( var22, var21 );
    }
    f11208( var21 );
    return var21;
  }

  public static SubLObject f11259(final SubLObject var21, final SubLObject var134)
  {
    f11160( assertion_handles_oc.f11025( var21 ), ConsesLow.cons( var134, module0178.f11299( var21 ) ) );
    return var21;
  }

  public static SubLObject f11268(final SubLObject var21, final SubLObject var135)
  {
    f11160( assertion_handles_oc.f11025( var21 ), module0035.f2073( var135, module0178.f11299( var21 ), oc_assertions_low.UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11269(final SubLObject var21, final SubLObject var136)
  {
    assert oc_assertions_low.NIL != module0032.f1724( var136 ) : var136;
    if( oc_assertions_low.NIL != var136 )
    {
      f11203( var21, oc_assertions_low.$ic31$, var136 );
    }
    else
    {
      f11238( var21, oc_assertions_low.$ic31$ );
    }
    return var21;
  }

  public static SubLObject f11270(final SubLObject var21, final SubLObject var135)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert oc_assertions_low.NIL != module0191.f11910( var135 ) : var135;
    f11269( var21, module0032.f1736( var135, f11202( var21 ), oc_assertions_low.UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11271(final SubLObject var21, final SubLObject var135)
  {
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert oc_assertions_low.NIL != module0191.f11910( var135 ) : var135;
    f11269( var21, module0032.f1737( var135, f11202( var21 ), oc_assertions_low.UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11272(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    assert oc_assertions_low.NIL != assertion_handles_oc.f11035( var21 ) : var21;
    SubLObject var23 = oc_assertions_low.NIL;
    SubLObject var24 = oc_assertions_low.NIL;
    final SubLObject var25 = module0032.f1728( f11202( var21 ) );
    final SubLObject var26 = oc_assertions_low.$g2208$.currentBinding( var22 );
    final SubLObject var27 = oc_assertions_low.$g2207$.currentBinding( var22 );
    try
    {
      oc_assertions_low.$g2208$.bind( Hashtables.make_hash_table( Numbers.integerDivide( var25, oc_assertions_low.TWO_INTEGER ), oc_assertions_low.UNPROVIDED,
          oc_assertions_low.UNPROVIDED ), var22 );
      oc_assertions_low.$g2207$.bind( Hashtables.make_hash_table( var25, oc_assertions_low.UNPROVIDED, oc_assertions_low.UNPROVIDED ), var22 );
      f11273( var21 );
      var23 = oc_assertions_low.$g2208$.getDynamicValue( var22 );
      var24 = oc_assertions_low.$g2207$.getDynamicValue( var22 );
    }
    finally
    {
      oc_assertions_low.$g2207$.rebind( var27, var22 );
      oc_assertions_low.$g2208$.rebind( var26, var22 );
    }
    return Values.values( var23, var24 );
  }

  public static SubLObject f11273(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    if( oc_assertions_low.NIL == Hashtables.gethash( var21, oc_assertions_low.$g2208$.getDynamicValue( var22 ), oc_assertions_low.UNPROVIDED ) )
    {
      Hashtables.sethash( var21, oc_assertions_low.$g2208$.getDynamicValue( var22 ), oc_assertions_low.T );
      final SubLObject var23 = f11202( var21 );
      SubLObject var24;
      SubLObject var25;
      SubLObject var26;
      for( var24 = module0032.f1741( var23 ), var25 = oc_assertions_low.NIL, var25 = module0032.f1742( var24, var23 ); oc_assertions_low.NIL == module0032.f1744( var24, var25 ); var25 = module0032.f1743(
          var25 ) )
      {
        var26 = module0032.f1745( var24, var25 );
        if( oc_assertions_low.NIL != module0032.f1746( var25, var26 ) )
        {
          f11274( var26 );
        }
      }
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11274(final SubLObject var143)
  {
    final SubLThread var144 = SubLProcess.currentSubLThread();
    assert oc_assertions_low.NIL != oc_deduction_handles.f11659( var143 ) : var143;
    if( oc_assertions_low.NIL == Hashtables.gethash( var143, oc_assertions_low.$g2207$.getDynamicValue( var144 ), oc_assertions_low.UNPROVIDED ) )
    {
      Hashtables.sethash( var143, oc_assertions_low.$g2207$.getDynamicValue( var144 ), oc_assertions_low.T );
      final SubLObject var145 = module0188.f11781( var143 );
      if( oc_assertions_low.NIL != assertion_handles_oc.f11035( var145 ) )
      {
        SubLObject var146 = f11201( var145 );
        SubLObject var147 = oc_assertions_low.NIL;
        var147 = var146.first();
        while ( oc_assertions_low.NIL != var146)
        {
          if( oc_assertions_low.NIL == oc_deduction_handles.f11659( var147 ) || oc_assertions_low.NIL == Hashtables.gethash( var143, oc_assertions_low.$g2207$.getDynamicValue( var144 ),
              oc_assertions_low.UNPROVIDED ) )
          {
            return oc_assertions_low.NIL;
          }
          f11273( var145 );
          var146 = var146.rest();
          var147 = var146.first();
        }
      }
      else if( oc_assertions_low.NIL != module0179.f11424( var145 ) )
      {
      }
    }
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11275(SubLObject var145)
  {
    if( var145 == oc_assertions_low.UNPROVIDED )
    {
      var145 = oc_assertions_low.NIL;
    }
    return oc_assertion_manager.f11132( oc_assertions_low.$ic1$, var145 );
  }

  public static SubLObject f11276()
  {
    SubLFiles.declareFunction( myName, "f11136", "S#13970", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11137", "S#13956", 1, 0, false );
    new $f11137$UnaryFunction();
    SubLFiles.declareFunction( myName, "f11138", "S#13971", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11139", "S#13972", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11140", "S#13973", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11141", "S#13974", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11142", "S#13975", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11143", "S#13976", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11144", "S#13977", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11145", "S#13978", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11146", "S#13979", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11147", "S#13980", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11148", "S#13981", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11149", "S#13982", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11150", "S#13983", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11151", "S#13984", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11152", "S#13985", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11153", "S#13986", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11154", "S#13987", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11155", "S#13988", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11156", "S#13989", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11157", "S#13990", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11158", "S#13991", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11159", "S#13992", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11160", "S#13993", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11161", "S#13994", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11162", "S#13995", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11166", "S#13996", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11165", "S#13997", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11167", "S#13998", 5, 0, false );
    SubLFiles.declareFunction( myName, "f11169", "S#13999", 2, 1, false );
    SubLFiles.declareFunction( myName, "f11170", "S#14000", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11171", "S#14001", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11173", "S#14002", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11174", "S#14003", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11172", "S#14004", 6, 0, false );
    SubLFiles.declareFunction( myName, "f11175", "S#13859", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11177", "S#13860", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11179", "S#13861", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11180", "S#13865", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11183", "S#13866", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11184", "S#13867", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11186", "S#13868", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11188", "S#13869", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11187", "S#14005", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11190", "S#13870", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11192", "S#13871", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11195", "S#13872", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11197", "S#13873", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11199", "S#13874", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11201", "S#13889", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11202", "S#13899", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11163", "S#14006", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11204", "S#14007", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11176", "S#14008", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11206", "S#14009", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11211", "S#14010", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11209", "S#14011", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11207", "S#14012", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11210", "S#14013", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11208", "S#14014", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11164", "S#14015", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11215", "S#14016", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11216", "S#14017", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11217", "S#14018", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11185", "S#14019", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11218", "S#14020", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11189", "S#14021", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11219", "S#14022", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11220", "S#14023", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11221", "S#14024", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11222", "S#14025", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11223", "S#14026", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11224", "S#14027", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11181", "S#13863", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11225", "S#13864", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11226", "S#14028", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11227", "S#14029", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11213", "S#14030", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11228", "S#14031", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11214", "S#14032", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11212", "S#14033", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11229", "S#14034", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11230", "S#14035", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11231", "S#14036", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11205", "S#14037", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11182", "S#14038", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11232", "S#13875", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11233", "S#14039", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11234", "S#14040", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11235", "S#13877", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11236", "S#13879", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11168", "S#14041", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11237", "S#14042", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11191", "S#14043", 2, 1, false );
    SubLFiles.declareFunction( myName, "f11203", "S#14044", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11238", "S#14045", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11239", "S#13881", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11240", "S#14046", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11241", "S#14047", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11242", "S#14048", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11243", "S#14049", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11244", "S#14050", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11245", "S#14051", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.oc_assertions_low", "f11246", "S#14052" );
    SubLFiles.declareFunction( myName, "f11194", "S#14053", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11247", "S#14054", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11248", "S#14055", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11249", "S#14056", 0, 4, false );
    SubLFiles.declareFunction( myName, "f11193", "S#14057", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11196", "S#14058", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11198", "S#14059", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11200", "S#14060", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11250", "SET-ASSERTION-ASSERTED-BY", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11251", "S#13884", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11252", "S#13886", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11253", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11254", "S#14061", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11178", "S#14062", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11255", "S#13858", 7, 0, false );
    SubLFiles.declareFunction( myName, "f11256", "S#13857", 9, 0, false );
    SubLFiles.declareFunction( myName, "f11260", "S#13856", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11257", "S#14063", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11262", "S#14064", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11261", "S#14065", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11258", "S#14066", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11263", "S#14067", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11264", "S#13715", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11266", "S#13714", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11265", "S#14068", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11267", "S#14069", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11259", "S#13894", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11268", "S#13897", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11269", "S#14070", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11270", "S#14071", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11271", "S#14072", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11272", "S#13725", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11273", "S#14073", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11274", "S#14074", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11275", "S#14075", 0, 1, false );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11277()
  {
    oc_assertions_low.$g2199$ = SubLFiles.defconstant( "S#14076", oc_assertions_low.$ic0$ );
    oc_assertions_low.$g2200$ = SubLFiles.deflexical( "S#14077", oc_assertions_low.ZERO_INTEGER );
    oc_assertions_low.$g2201$ = SubLFiles.defconstant( "S#14078", bytes.sublisp_byte( oc_assertions_low.ONE_INTEGER, oc_assertions_low.ZERO_INTEGER ) );
    oc_assertions_low.$g2202$ = SubLFiles.defconstant( "S#14079", bytes.sublisp_byte( oc_assertions_low.TWO_INTEGER, oc_assertions_low.ONE_INTEGER ) );
    oc_assertions_low.$g2203$ = SubLFiles.defconstant( "S#14080", bytes.sublisp_byte( oc_assertions_low.THREE_INTEGER, oc_assertions_low.THREE_INTEGER ) );
    oc_assertions_low.$g2204$ = SubLFiles.deflexical( "S#14081", ( oc_assertions_low.NIL != Symbols.boundp( oc_assertions_low.$ic38$ ) ) ? oc_assertions_low.$g2204$.getGlobalValue()
        : oc_assertions_low.NIL );
    oc_assertions_low.$g2205$ = SubLFiles.deflexical( "S#14082", ( oc_assertions_low.NIL != Symbols.boundp( oc_assertions_low.$ic39$ ) ) ? oc_assertions_low.$g2205$.getGlobalValue()
        : oc_assertions_low.T );
    oc_assertions_low.$g2206$ = SubLFiles.deflexical( "S#14083", oc_assertions_low.$ic40$ );
    oc_assertions_low.$g2207$ = SubLFiles.defparameter( "S#14084", oc_assertions_low.NIL );
    oc_assertions_low.$g2208$ = SubLFiles.defparameter( "S#14085", oc_assertions_low.NIL );
    return oc_assertions_low.NIL;
  }

  public static SubLObject f11278()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), oc_assertions_low.$g2199$.getGlobalValue(), Symbols.symbol_function( oc_assertions_low.$ic8$ ) );
    SubLSpecialOperatorDeclarations.proclaim( oc_assertions_low.$ic9$ );
    Structures.def_csetf( oc_assertions_low.$ic10$, oc_assertions_low.$ic11$ );
    Structures.def_csetf( oc_assertions_low.$ic12$, oc_assertions_low.$ic13$ );
    Structures.def_csetf( oc_assertions_low.$ic14$, oc_assertions_low.$ic15$ );
    Structures.def_csetf( oc_assertions_low.$ic16$, oc_assertions_low.$ic17$ );
    Structures.def_csetf( oc_assertions_low.$ic18$, oc_assertions_low.$ic19$ );
    Equality.identity( oc_assertions_low.$ic0$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), oc_assertions_low.$g2199$.getGlobalValue(), Symbols.symbol_function( oc_assertions_low.$ic30$ ) );
    module0003.f57( oc_assertions_low.$ic38$ );
    module0003.f57( oc_assertions_low.$ic39$ );
    module0002.f50( oc_assertions_low.$ic42$, oc_assertions_low.$ic43$ );
    return oc_assertions_low.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f11276();
  }

  @Override
  public void initializeVariables()
  {
    f11277();
  }

  @Override
  public void runTopLevelForms()
  {
    f11278();
  }
  static
  {
    me = new oc_assertions_low();
    oc_assertions_low.$g2199$ = null;
    oc_assertions_low.$g2200$ = null;
    oc_assertions_low.$g2201$ = null;
    oc_assertions_low.$g2202$ = null;
    oc_assertions_low.$g2203$ = null;
    oc_assertions_low.$g2204$ = null;
    oc_assertions_low.$g2205$ = null;
    oc_assertions_low.$g2206$ = null;
    oc_assertions_low.$g2207$ = null;
    oc_assertions_low.$g2208$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "S#13955", "CYC" );
    $ic1$ = SubLObjectFactory.makeSymbol( "S#13956", "CYC" );
    $ic2$ = SubLObjectFactory.makeInteger( 148 );
    $ic3$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14086", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ), SubLObjectFactory.makeSymbol( "S#14087", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#160", "CYC" ), SubLObjectFactory.makeSymbol( "S#138", "CYC" ) );
    $ic4$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "FORMULA-DATA" ), SubLObjectFactory.makeKeyword( "MT" ), SubLObjectFactory.makeKeyword( "FLAGS" ),
        SubLObjectFactory.makeKeyword( "ARGUMENTS" ), SubLObjectFactory.makeKeyword( "PLIST" ) );
    $ic5$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13971", "CYC" ), SubLObjectFactory.makeSymbol( "S#13972", "CYC" ), SubLObjectFactory.makeSymbol( "S#13973", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#13974", "CYC" ), SubLObjectFactory.makeSymbol( "S#13975", "CYC" ) );
    $ic6$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13976", "CYC" ), SubLObjectFactory.makeSymbol( "S#13977", "CYC" ), SubLObjectFactory.makeSymbol( "S#13978", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#13979", "CYC" ), SubLObjectFactory.makeSymbol( "S#13980", "CYC" ) );
    $ic7$ = SubLObjectFactory.makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $ic8$ = SubLObjectFactory.makeSymbol( "S#13970", "CYC" );
    $ic9$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "S#13956", "CYC" ) );
    $ic10$ = SubLObjectFactory.makeSymbol( "S#13971", "CYC" );
    $ic11$ = SubLObjectFactory.makeSymbol( "S#13976", "CYC" );
    $ic12$ = SubLObjectFactory.makeSymbol( "S#13972", "CYC" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#13977", "CYC" );
    $ic14$ = SubLObjectFactory.makeSymbol( "S#13973", "CYC" );
    $ic15$ = SubLObjectFactory.makeSymbol( "S#13978", "CYC" );
    $ic16$ = SubLObjectFactory.makeSymbol( "S#13974", "CYC" );
    $ic17$ = SubLObjectFactory.makeSymbol( "S#13979", "CYC" );
    $ic18$ = SubLObjectFactory.makeSymbol( "S#13975", "CYC" );
    $ic19$ = SubLObjectFactory.makeSymbol( "S#13980", "CYC" );
    $ic20$ = SubLObjectFactory.makeKeyword( "FORMULA-DATA" );
    $ic21$ = SubLObjectFactory.makeKeyword( "MT" );
    $ic22$ = SubLObjectFactory.makeKeyword( "FLAGS" );
    $ic23$ = SubLObjectFactory.makeKeyword( "ARGUMENTS" );
    $ic24$ = SubLObjectFactory.makeKeyword( "PLIST" );
    $ic25$ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $ic26$ = SubLObjectFactory.makeKeyword( "BEGIN" );
    $ic27$ = SubLObjectFactory.makeSymbol( "S#13981", "CYC" );
    $ic28$ = SubLObjectFactory.makeKeyword( "SLOT" );
    $ic29$ = SubLObjectFactory.makeKeyword( "END" );
    $ic30$ = SubLObjectFactory.makeSymbol( "S#13983", "CYC" );
    $ic31$ = SubLObjectFactory.makeKeyword( "DEPENDENTS" );
    $ic32$ = SubLObjectFactory.makeKeyword( "NOT-FOUND" );
    $ic33$ = SubLObjectFactory.makeSymbol( "ASSERTION-P" );
    $ic34$ = SubLObjectFactory.makeString( "~a (assertion #~a) has null flags" );
    $ic35$ = SubLObjectFactory.makeKeyword( "VARIABLE-NAMES" );
    $ic36$ = SubLObjectFactory.makeInteger( 256 );
    $ic37$ = SubLObjectFactory.makeString( "Unexpected formula-data type: ~S" );
    $ic38$ = SubLObjectFactory.makeSymbol( "S#14081", "CYC" );
    $ic39$ = SubLObjectFactory.makeSymbol( "S#14082", "CYC" );
    $ic40$ = SubLObjectFactory.makeInteger( 60 );
    $ic41$ = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic42$ = SubLObjectFactory.makeSymbol( "S#14027", "CYC" );
    $ic43$ = SubLObjectFactory.makeSymbol( "S#14088", "CYC" );
    $ic44$ = SubLObjectFactory.makeString( "mapping Cyc assertions" );
    $ic45$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic46$ = SubLObjectFactory.makeKeyword( "SKIP" );
    $ic47$ = SubLObjectFactory.makeSymbol( "CNF-P" );
    $ic48$ = SubLObjectFactory.makeString( "Rebuilding the Rule Set" );
    $ic49$ = SubLObjectFactory.makeSymbol( "S#38", "CYC" );
    $ic50$ = SubLObjectFactory.makeString( "~A" );
    $ic51$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic52$ = SubLObjectFactory.makeSymbol( "S#747", "CYC" );
    $ic53$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13925", "CYC" ), SubLObjectFactory.makeSymbol( "WHEN" ), SubLObjectFactory.makeSymbol(
        "S#13926", "CYC" ), SubLObjectFactory.makeSymbol( "SECOND" ) ), SubLObjectFactory.makeSymbol( "S#14089", "CYC" ), SubLObjectFactory.makeSymbol( "&BODY" ),
        SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic54$ = SubLObjectFactory.makeSymbol( "CDESTRUCTURING-BIND" );
    $ic55$ = SubLObjectFactory.makeSymbol( "&OPTIONAL" );
    $ic56$ = SubLObjectFactory.makeKeyword( "ASSERT-INFO" );
    $ic57$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "&OPTIONAL" ), SubLObjectFactory.makeSymbol( "S#13925", "CYC" ), SubLObjectFactory.makeSymbol( "WHEN" ),
        SubLObjectFactory.makeSymbol( "S#13926", "CYC" ), SubLObjectFactory.makeSymbol( "SECOND" ) );
    $ic58$ = SubLObjectFactory.makeSymbol( "S#14090", "CYC" );
    $ic59$ = SubLObjectFactory.makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic60$ = SubLObjectFactory.makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic61$ = SubLObjectFactory.makeKeyword( "FORWARD" );
    $ic62$ = SubLObjectFactory.makeString( "Unexpected formula data hook: ~S" );
    $ic63$ = SubLObjectFactory.makeSymbol( "S#2986", "CYC" );
    $ic64$ = SubLObjectFactory.makeSymbol( "ARGUMENT-P" );
    $ic65$ = SubLObjectFactory.makeSymbol( "DEDUCTION-P" );
  }

  public static final class $sX13955_native extends SubLStructNative
  {
    public SubLObject $formula_data;
    public SubLObject $mt;
    public SubLObject $flags;
    public SubLObject $arguments;
    public SubLObject $plist;
    private static final SubLStructDeclNative structDecl;

    public $sX13955_native()
    {
      this.$formula_data = CommonSymbols.NIL;
      this.$mt = CommonSymbols.NIL;
      this.$flags = CommonSymbols.NIL;
      this.$arguments = CommonSymbols.NIL;
      this.$plist = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX13955_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$formula_data;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$mt;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$flags;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$arguments;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$plist;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$formula_data = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$mt = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$flags = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$arguments = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$plist = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sX13955_native.class, oc_assertions_low.$ic0$, oc_assertions_low.$ic1$, oc_assertions_low.$ic3$, oc_assertions_low.$ic4$, new String[] { "$formula_data",
        "$mt", "$flags", "$arguments", "$plist"
      }, oc_assertions_low.$ic5$, oc_assertions_low.$ic6$, oc_assertions_low.$ic7$ );
    }
  }

  public static final class $f11137$UnaryFunction extends UnaryFunction
  {
    public $f11137$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#13956" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var3)
    {
      return oc_assertions_low.f11137( var3 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/oc_assertions_low.class Total time: 477 ms
 *
 * Decompiled with Procyon 0.5.32.
 */