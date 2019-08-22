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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class assertions_low_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertions_low_oc";
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
    compatibility.default_struct_print_function( var1, var2, ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject f11137(final SubLObject var1)
  {
    return ( var1.getClass() == $sX13955_native.class ) ? T : NIL;
  }

  public static SubLObject f11138(final SubLObject var1)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.getField2();
  }

  public static SubLObject f11139(final SubLObject var1)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.getField3();
  }

  public static SubLObject f11140(final SubLObject var1)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.getField4();
  }

  public static SubLObject f11141(final SubLObject var1)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.getField5();
  }

  public static SubLObject f11142(final SubLObject var1)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.getField6();
  }

  public static SubLObject f11143(final SubLObject var1, final SubLObject var4)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.setField2( var4 );
  }

  public static SubLObject f11144(final SubLObject var1, final SubLObject var4)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.setField3( var4 );
  }

  public static SubLObject f11145(final SubLObject var1, final SubLObject var4)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.setField4( var4 );
  }

  public static SubLObject f11146(final SubLObject var1, final SubLObject var4)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.setField5( var4 );
  }

  public static SubLObject f11147(final SubLObject var1, final SubLObject var4)
  {
    assert NIL != f11137( var1 ) : var1;
    return var1.setField6( var4 );
  }

  public static SubLObject f11148(SubLObject var5)
  {
    if( var5 == UNPROVIDED )
    {
      var5 = NIL;
    }
    final SubLObject var6 = new $sX13955_native();
    SubLObject var7;
    SubLObject var8;
    SubLObject var9;
    SubLObject var10;
    for( var7 = NIL, var7 = var5; NIL != var7; var7 = conses_high.cddr( var7 ) )
    {
      var8 = var7.first();
      var9 = conses_high.cadr( var7 );
      var10 = var8;
      if( var10.eql( $ic20$ ) )
      {
        f11143( var6, var9 );
      }
      else if( var10.eql( $ic21$ ) )
      {
        f11144( var6, var9 );
      }
      else if( var10.eql( $ic22$ ) )
      {
        f11145( var6, var9 );
      }
      else if( var10.eql( $ic23$ ) )
      {
        f11146( var6, var9 );
      }
      else if( var10.eql( $ic24$ ) )
      {
        f11147( var6, var9 );
      }
      else
      {
        Errors.error( $ic25$, var8 );
      }
    }
    return var6;
  }

  public static SubLObject f11149(final SubLObject var11, final SubLObject var12)
  {
    Functions.funcall( var12, var11, $ic26$, $ic27$, FIVE_INTEGER );
    Functions.funcall( var12, var11, $ic28$, $ic20$, f11138( var11 ) );
    Functions.funcall( var12, var11, $ic28$, $ic21$, f11139( var11 ) );
    Functions.funcall( var12, var11, $ic28$, $ic22$, f11140( var11 ) );
    Functions.funcall( var12, var11, $ic28$, $ic23$, f11141( var11 ) );
    Functions.funcall( var12, var11, $ic28$, $ic24$, f11142( var11 ) );
    Functions.funcall( var12, var11, $ic29$, $ic27$, FIVE_INTEGER );
    return var11;
  }

  public static SubLObject f11150(final SubLObject var11, final SubLObject var12)
  {
    return f11149( var11, var12 );
  }

  public static SubLObject f11151(final SubLObject var13)
  {
    SubLObject var14 = NIL;
    var14 = f11148( UNPROVIDED );
    f11143( var14, NIL );
    f11144( var14, var13 );
    f11145( var14, $g2200$.getGlobalValue() );
    f11146( var14, NIL );
    f11147( var14, NIL );
    return var14;
  }

  public static SubLObject f11152(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    if( NIL != f11137( var16 ) )
    {
      assertion_manager_oc.f11124( var15 );
      f11143( var16, NIL );
      f11144( var16, NIL );
      f11145( var16, NIL );
      f11146( var16, NIL );
      f11147( var16, NIL );
      return T;
    }
    return NIL;
  }

  public static SubLObject f11153(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    return ( NIL != var16 ) ? f11138( var16 ) : NIL;
  }

  public static SubLObject f11154(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    return ( NIL != var16 ) ? f11139( var16 ) : NIL;
  }

  public static SubLObject f11155(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    return ( NIL != var16 ) ? f11140( var16 ) : NIL;
  }

  public static SubLObject f11156(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    return ( NIL != var16 ) ? f11141( var16 ) : NIL;
  }

  public static SubLObject f11157(final SubLObject var15)
  {
    final SubLObject var16 = assertion_manager_oc.f11114( var15 );
    return ( NIL != var16 ) ? f11142( var16 ) : NIL;
  }

  public static SubLObject f11158(final SubLObject var15, final SubLObject var17)
  {
    f11143( assertion_manager_oc.f11114( var15 ), var17 );
    assertion_manager_oc.f11125( var15 );
    return var15;
  }

  public static SubLObject f11159(final SubLObject var15, final SubLObject var18)
  {
    f11145( assertion_manager_oc.f11114( var15 ), var18 );
    assertion_manager_oc.f11125( var15 );
    return var15;
  }

  public static SubLObject f11160(final SubLObject var15, final SubLObject var19)
  {
    f11146( assertion_manager_oc.f11114( var15 ), var19 );
    assertion_manager_oc.f11125( var15 );
    return var15;
  }

  public static SubLObject f11161(final SubLObject var15, final SubLObject var20)
  {
    f11147( assertion_manager_oc.f11114( var15 ), var20 );
    assertion_manager_oc.f11125( var15 );
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
    SubLObject var22 = NIL;
    SubLObject var23;
    SubLObject var24;
    SubLObject var25;
    for( var23 = NIL, var23 = f11168( var21 ); NIL != var23; var23 = conses_high.cddr( var23 ) )
    {
      var24 = var23.first();
      var25 = conses_high.cadr( var23 );
      if( var24 == $ic31$ )
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
    if( var15 == UNPROVIDED )
    {
      var15 = NIL;
    }
    if( NIL == var15 )
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
    final SubLObject var23 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var24 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var25 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var26 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var27 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    f11172( var22, var23, var24, var25, var26, var27 );
    return var21;
  }

  public static SubLObject f11173(final SubLObject var15, final SubLObject var2)
  {
    final SubLObject var16 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var17 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var18 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var19 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    final SubLObject var20 = module0021.f1060( var2, UNPROVIDED, UNPROVIDED );
    return f11167( var16, var17, var18, var19, var20 );
  }

  public static SubLObject f11174(final SubLObject var21, final SubLObject var30)
  {
    final SubLThread var31 = SubLProcess.currentSubLThread();
    final SubLObject var32 = assertion_handles_oc.f11025( var21 );
    SubLObject var33 = NIL;
    final SubLObject var34 = module0021.$g750$.currentBinding( var31 );
    try
    {
      module0021.$g750$.bind( NIL, var31 );
      var33 = module0093.f6621( var32, var30, $ic32$ );
    }
    finally
    {
      module0021.$g750$.rebind( var34, var31 );
    }
    if( !var33.isList() )
    {
      return NIL;
    }
    SubLObject var36;
    final SubLObject var35 = var36 = var33;
    SubLObject var37 = NIL;
    SubLObject var38 = NIL;
    SubLObject var39 = NIL;
    SubLObject var40 = NIL;
    SubLObject var41 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, $ic3$ );
    var37 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, $ic3$ );
    var38 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, $ic3$ );
    var39 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, $ic3$ );
    var40 = var36.first();
    var36 = var36.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var36, var35, $ic3$ );
    var41 = var36.first();
    var36 = var36.rest();
    if( NIL == var36 )
    {
      return f11172( var32, var37, var38, var39, var40, var41 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var35, $ic3$ );
    return NIL;
  }

  public static SubLObject f11172(final SubLObject var15, final SubLObject var26, final SubLObject var13, final SubLObject var27, final SubLObject var28, final SubLObject var29)
  {
    final SubLObject var30 = f11151( var13 );
    f11143( var30, var26 );
    f11145( var30, var27 );
    f11146( var30, var28 );
    f11147( var30, var29 );
    assertion_manager_oc.f11123( var15, var30 );
    return var15;
  }

  public static SubLObject f11175(final SubLObject var21)
  {
    final SubLObject var22 = f11176( var21 );
    if( NIL != module0192.f12006( var22 ) )
    {
      return module0192.f12017( var22 );
    }
    return var22;
  }

  public static SubLObject f11177(final SubLObject var21)
  {
    return ( NIL != f11178( var21 ) ) ? f11175( var21 ) : NIL;
  }

  public static SubLObject f11179(final SubLObject var21)
  {
    return f11154( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11180(final SubLObject var21)
  {
    if( NIL == f11181( var21 ) )
    {
      return NIL;
    }
    final SubLObject var22 = f11163( var21 );
    if( NIL != module0192.f12006( var22 ) )
    {
      return f11182( module0192.f12017( var22 ) );
    }
    return var22;
  }

  public static SubLObject f11183(final SubLObject var21)
  {
    return ( NIL != f11181( var21 ) ) ? module0178.f11288( var21 ) : f11175( var21 );
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
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11164( var21 );
    if( NIL == var22 )
    {
      Errors.error( $ic34$, var21, assertion_handles_oc.f11025( var21 ) );
    }
    return module0130.f8522( f11189( var22 ) );
  }

  public static SubLObject f11190(final SubLObject var21)
  {
    return f11191( var21, $ic35$, UNPROVIDED );
  }

  public static SubLObject f11192(final SubLObject var21)
  {
    return ( NIL != module0178.f11375( var21 ) ) ? f11193( f11194( var21 ) ) : NIL;
  }

  public static SubLObject f11195(final SubLObject var21)
  {
    return ( NIL != module0178.f11375( var21 ) ) ? f11196( f11194( var21 ) ) : NIL;
  }

  public static SubLObject f11197(final SubLObject var21)
  {
    return ( NIL != module0178.f11375( var21 ) ) ? f11198( f11194( var21 ) ) : NIL;
  }

  public static SubLObject f11199(final SubLObject var21)
  {
    return ( NIL != module0178.f11375( var21 ) ) ? f11200( f11194( var21 ) ) : NIL;
  }

  public static SubLObject f11201(final SubLObject var21)
  {
    return f11156( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11202(final SubLObject var21)
  {
    SubLObject var22 = f11191( var21, $ic31$, UNPROVIDED );
    if( var22.isList() && NIL != module0035.f2002( var22, $ic36$, UNPROVIDED ) )
    {
      var22 = module0076.f5288( module0032.f1753( var22 ), EQL, UNPROVIDED );
      f11203( var21, $ic31$, var22 );
    }
    return var22;
  }

  public static SubLObject f11163(final SubLObject var21)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    return f11153( assertion_handles_oc.f11025( var21 ) );
  }

  public static SubLObject f11204(final SubLObject var21, final SubLObject var17)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    f11158( assertion_handles_oc.f11025( var21 ), var17 );
    return var21;
  }

  public static SubLObject f11176(final SubLObject var21)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11163( var21 );
    if( NIL != module0192.f12006( var22 ) )
    {
      return var22;
    }
    if( NIL == var22 )
    {
      return var22;
    }
    if( NIL == f11181( var21 ) )
    {
      return var22;
    }
    return f11205( var22 );
  }

  public static SubLObject f11206(final SubLObject var21, final SubLObject var17)
  {
    if( NIL != module0192.f12006( var17 ) )
    {
      f11207( var21, var17 );
    }
    else if( NIL == var17 )
    {
      f11208( var21 );
    }
    else if( NIL != module0232.f15320( var17 ) )
    {
      f11209( var21, var17 );
    }
    else
    {
      if( NIL == module0202.f12590( var17 ) )
      {
        Errors.error( $ic37$, var17 );
        return NIL;
      }
      f11210( var21, var17 );
    }
    return var21;
  }

  public static SubLObject f11211(final SubLObject var21)
  {
    final SubLObject var22 = f11163( var21 );
    return ( NIL != module0192.f12006( var22 ) ) ? var22 : NIL;
  }

  public static SubLObject f11209(final SubLObject var21, final SubLObject var38)
  {
    final SubLObject var39 = f11212( var38 );
    f11204( var21, ( NIL != var39 ) ? f11182( var38 ) : var38 );
    f11213( var21, var39 );
    return var21;
  }

  public static SubLObject f11207(final SubLObject var21, final SubLObject var40)
  {
    final SubLObject var41 = module0192.f12017( var40 );
    f11204( var21, var40 );
    if( NIL == var41 )
    {
      return f11208( var21 );
    }
    f11214( var21 );
    return var21;
  }

  public static SubLObject f11210(final SubLObject var21, final SubLObject var42)
  {
    f11204( var21, var42 );
    f11213( var21, T );
    return var21;
  }

  public static SubLObject f11208(final SubLObject var21)
  {
    f11204( var21, NIL );
    f11213( var21, T );
    return var21;
  }

  public static SubLObject f11164(final SubLObject var21)
  {
    final SubLObject var22 = f11155( assertion_handles_oc.f11025( var21 ) );
    return var22;
  }

  public static SubLObject f11215(final SubLObject var21, final SubLObject var18)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var22 = f11164( var21 );
    if( !var22.eql( var18 ) )
    {
      f11159( assertion_handles_oc.f11025( var21 ), var18 );
    }
    return var21;
  }

  public static SubLObject f11216(final SubLObject var27)
  {
    return bytes.ldb( $g2201$.getGlobalValue(), var27 );
  }

  public static SubLObject f11217(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, $g2201$.getGlobalValue(), var27 );
  }

  public static SubLObject f11185(final SubLObject var27)
  {
    return bytes.ldb( $g2202$.getGlobalValue(), var27 );
  }

  public static SubLObject f11218(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, $g2202$.getGlobalValue(), var27 );
  }

  public static SubLObject f11189(final SubLObject var27)
  {
    return bytes.ldb( $g2203$.getGlobalValue(), var27 );
  }

  public static SubLObject f11219(final SubLObject var27, final SubLObject var43)
  {
    return bytes.dpb( var43, $g2203$.getGlobalValue(), var27 );
  }

  public static SubLObject f11220(final SubLObject var21)
  {
    return Numbers.oddp( f11164( var21 ) );
  }

  public static SubLObject f11221(final SubLObject var21, final SubLObject var39)
  {
    final SubLObject var40 = module0048.f3276( var39 );
    if( NIL != var40 )
    {
      f11215( var21, f11217( f11164( var21 ), var40 ) );
    }
    return var21;
  }

  public static SubLObject f11222()
  {
    return makeBoolean( NIL != $g2205$.getGlobalValue() && NIL != $g2204$.getGlobalValue() );
  }

  public static SubLObject f11223(final SubLObject var45)
  {
    assert NIL != module0004.f106( var45 ) : var45;
    final SubLObject var46 = Numbers.ceiling( Numbers.divide( var45, $g2206$.getGlobalValue() ), UNPROVIDED );
    $g2204$.setGlobalValue( module0031.f1685( var46, Symbols.symbol_function( EQ ) ) );
    return T;
  }

  public static SubLObject f11224()
  {
    return $g2204$.getGlobalValue();
  }

  public static SubLObject f11181(final SubLObject var21)
  {
    if( NIL != f11222() && NIL != assertion_manager_oc.f11113( var21 ) )
    {
      return makeBoolean( NIL == module0031.f1688( var21, $g2204$.getGlobalValue() ) );
    }
    if( NIL != assertion_handles_oc.f11047( var21 ) )
    {
      return f11220( var21 );
    }
    return NIL;
  }

  public static SubLObject f11225(final SubLObject var21)
  {
    if( NIL != f11222() && NIL != assertion_manager_oc.f11113( var21 ) )
    {
      return module0031.f1688( var21, $g2204$.getGlobalValue() );
    }
    if( NIL != assertion_handles_oc.f11047( var21 ) )
    {
      return makeBoolean( NIL == f11220( var21 ) );
    }
    return NIL;
  }

  public static SubLObject f11226()
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    if( NIL != $g2204$.getGlobalValue() )
    {
      return module0031.f1670( $g2204$.getGlobalValue() );
    }
    SubLObject var33 = ZERO_INTEGER;
    final SubLObject var34 = assertion_handles_oc.f11010();
    final SubLObject var35 = $ic44$;
    final SubLObject var36 = module0065.f4733( var34 );
    SubLObject var37 = ZERO_INTEGER;
    assert NIL != Types.stringp( var35 ) : var35;
    final SubLObject var38 = module0012.$g75$.currentBinding( var32 );
    final SubLObject var39 = module0012.$g76$.currentBinding( var32 );
    final SubLObject var40 = module0012.$g77$.currentBinding( var32 );
    final SubLObject var41 = module0012.$g78$.currentBinding( var32 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var32 );
      module0012.$g76$.bind( NIL, var32 );
      module0012.$g77$.bind( T, var32 );
      module0012.$g78$.bind( Time.get_universal_time(), var32 );
      module0012.f478( var35 );
      final SubLObject var55_56 = var34;
      if( NIL == module0065.f4772( var55_56, $ic46$ ) )
      {
        final SubLObject var57_58 = var55_56;
        if( NIL == module0065.f4775( var57_58, $ic46$ ) )
        {
          final SubLObject var42 = module0065.f4740( var57_58 );
          final SubLObject var43 = NIL;
          SubLObject var44;
          SubLObject var45;
          SubLObject var46;
          SubLObject var47;
          for( var44 = Sequences.length( var42 ), var45 = NIL, var45 = ZERO_INTEGER; var45.numL( var44 ); var45 = Numbers.add( var45, ONE_INTEGER ) )
          {
            var46 = ( ( NIL != var43 ) ? Numbers.subtract( var44, var45, ONE_INTEGER ) : var45 );
            var47 = Vectors.aref( var42, var46 );
            if( NIL == module0065.f4749( var47 ) || NIL == module0065.f4773( $ic46$ ) )
            {
              if( NIL != module0065.f4749( var47 ) )
              {
                var47 = $ic46$;
              }
              module0012.note_percent_progress( var37, var36 );
              var37 = Numbers.add( var37, ONE_INTEGER );
              if( NIL != f11225( var47 ) )
              {
                var33 = Numbers.add( var33, ONE_INTEGER );
              }
            }
          }
        }
        final SubLObject var65_66 = var55_56;
        if( NIL == module0065.f4777( var65_66 ) || NIL == module0065.f4773( $ic46$ ) )
        {
          final SubLObject var48 = module0065.f4738( var65_66 );
          SubLObject var49 = module0065.f4739( var65_66 );
          final SubLObject var50 = module0065.f4734( var65_66 );
          final SubLObject var51 = ( NIL != module0065.f4773( $ic46$ ) ) ? NIL : $ic46$;
          while ( var49.numL( var50 ))
          {
            final SubLObject var52 = Hashtables.gethash_without_values( var49, var48, var51 );
            if( NIL == module0065.f4773( $ic46$ ) || NIL == module0065.f4749( var52 ) )
            {
              module0012.note_percent_progress( var37, var36 );
              var37 = Numbers.add( var37, ONE_INTEGER );
              if( NIL != f11225( var52 ) )
              {
                var33 = Numbers.add( var33, ONE_INTEGER );
              }
            }
            var49 = Numbers.add( var49, ONE_INTEGER );
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
    if( NIL != $g2204$.getGlobalValue() )
    {
      if( NIL != var39 )
      {
        module0031.f1691( var21, $g2204$.getGlobalValue() );
      }
      else
      {
        module0031.f1690( var21, $g2204$.getGlobalValue() );
      }
    }
    return f11221( var21, var39 );
  }

  public static SubLObject f11228(final SubLObject var21)
  {
    if( NIL != $g2204$.getGlobalValue() && NIL != f11225( var21 ) )
    {
      return module0031.f1691( var21, $g2204$.getGlobalValue() );
    }
    return NIL;
  }

  public static SubLObject f11214(final SubLObject var21)
  {
    final SubLObject var22 = f11163( var21 );
    SubLObject var23 = NIL;
    if( NIL != module0192.f12006( var22 ) )
    {
      var23 = f11212( module0192.f12017( var22 ) );
    }
    else if( NIL != module0232.f15320( var22 ) )
    {
      var23 = f11212( var22 );
    }
    else
    {
      var23 = T;
    }
    return f11213( var21, var23 );
  }

  public static SubLObject f11212(final SubLObject var70)
  {
    assert NIL != module0232.f15320( var70 ) : var70;
    return module0232.f15322( var70 );
  }

  public static SubLObject f11229(final SubLObject var2)
  {
    return module0021.f1038( $g2204$.getGlobalValue(), var2 );
  }

  public static SubLObject f11230(final SubLObject var2)
  {
    $g2204$.setGlobalValue( module0021.f1060( var2, UNPROVIDED, UNPROVIDED ) );
    return module0031.f1670( $g2204$.getGlobalValue() );
  }

  public static SubLObject f11231()
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    f11223( assertion_handles_oc.f11019() );
    final SubLObject var33 = assertion_handles_oc.f11010();
    final SubLObject var34 = $ic48$;
    final SubLObject var35 = module0065.f4733( var33 );
    SubLObject var36 = ZERO_INTEGER;
    assert NIL != Types.stringp( var34 ) : var34;
    final SubLObject var37 = module0012.$g75$.currentBinding( var32 );
    final SubLObject var38 = module0012.$g76$.currentBinding( var32 );
    final SubLObject var39 = module0012.$g77$.currentBinding( var32 );
    final SubLObject var40 = module0012.$g78$.currentBinding( var32 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var32 );
      module0012.$g76$.bind( NIL, var32 );
      module0012.$g77$.bind( T, var32 );
      module0012.$g78$.bind( Time.get_universal_time(), var32 );
      module0012.f478( var34 );
      final SubLObject var55_71 = var33;
      if( NIL == module0065.f4772( var55_71, $ic46$ ) )
      {
        final SubLObject var57_72 = var55_71;
        if( NIL == module0065.f4775( var57_72, $ic46$ ) )
        {
          final SubLObject var41 = module0065.f4740( var57_72 );
          final SubLObject var42 = NIL;
          SubLObject var43;
          SubLObject var44;
          SubLObject var45;
          SubLObject var46;
          SubLObject var47;
          SubLObject var33_75;
          for( var43 = Sequences.length( var41 ), var44 = NIL, var44 = ZERO_INTEGER; var44.numL( var43 ); var44 = Numbers.add( var44, ONE_INTEGER ) )
          {
            var45 = ( ( NIL != var42 ) ? Numbers.subtract( var43, var44, ONE_INTEGER ) : var44 );
            var46 = Vectors.aref( var41, var45 );
            if( NIL == module0065.f4749( var46 ) || NIL == module0065.f4773( $ic46$ ) )
            {
              if( NIL != module0065.f4749( var46 ) )
              {
                var46 = $ic46$;
              }
              module0012.note_percent_progress( var36, var35 );
              var36 = Numbers.add( var36, ONE_INTEGER );
              var47 = NIL;
              try
              {
                var32.throwStack.push( module0003.$g3$.getGlobalValue() );
                var33_75 = Errors.$error_handler$.currentBinding( var32 );
                try
                {
                  Errors.$error_handler$.bind( $ic49$, var32 );
                  try
                  {
                    if( NIL != assertion_handles_oc.f11046( var46 ) && NIL == f11220( var46 ) )
                    {
                      module0031.f1690( var46, $g2204$.getGlobalValue() );
                    }
                  }
                  catch( final Throwable var48 )
                  {
                    Errors.handleThrowable( var48, NIL );
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
                Errors.warn( $ic50$, var47 );
              }
            }
          }
        }
        final SubLObject var65_78 = var55_71;
        if( NIL == module0065.f4777( var65_78 ) || NIL == module0065.f4773( $ic46$ ) )
        {
          final SubLObject var50 = module0065.f4738( var65_78 );
          SubLObject var51 = module0065.f4739( var65_78 );
          final SubLObject var52 = module0065.f4734( var65_78 );
          final SubLObject var53 = ( NIL != module0065.f4773( $ic46$ ) ) ? NIL : $ic46$;
          while ( var51.numL( var52 ))
          {
            final SubLObject var54 = Hashtables.gethash_without_values( var51, var50, var53 );
            if( NIL == module0065.f4773( $ic46$ ) || NIL == module0065.f4749( var54 ) )
            {
              module0012.note_percent_progress( var36, var35 );
              var36 = Numbers.add( var36, ONE_INTEGER );
              SubLObject var55 = NIL;
              try
              {
                var32.throwStack.push( module0003.$g3$.getGlobalValue() );
                final SubLObject var33_76 = Errors.$error_handler$.currentBinding( var32 );
                try
                {
                  Errors.$error_handler$.bind( $ic49$, var32 );
                  try
                  {
                    if( NIL != assertion_handles_oc.f11046( var54 ) && NIL == f11220( var54 ) )
                    {
                      module0031.f1690( var54, $g2204$.getGlobalValue() );
                    }
                  }
                  catch( final Throwable var56 )
                  {
                    Errors.handleThrowable( var56, NIL );
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
                Errors.warn( $ic50$, var55 );
              }
            }
            var51 = Numbers.add( var51, ONE_INTEGER );
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
    return module0031.f1670( $g2204$.getGlobalValue() );
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
    if( NIL != module0178.f11284( var21 ) )
    {
      f11233( var21, var81 );
    }
    else
    {
      module0217.f14367( var21, UNPROVIDED );
      f11233( var21, var81 );
      module0217.f14364( var21, UNPROVIDED );
    }
    return var21;
  }

  public static SubLObject f11233(final SubLObject var21, final SubLObject var81)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var82 = module0130.f8504( var81 );
    if( NIL != var82 )
    {
      f11215( var21, f11218( f11164( var21 ), var82 ) );
    }
    return var21;
  }

  public static SubLObject f11234(final SubLObject var21, final SubLObject var83)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    final SubLObject var84 = module0130.f8521( var83 );
    if( NIL != var84 )
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
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert NIL != Types.listp( var29 ) : var29;
    f11161( assertion_handles_oc.f11025( var21 ), var29 );
    return var21;
  }

  public static SubLObject f11191(final SubLObject var21, final SubLObject var89, SubLObject var90)
  {
    if( var90 == UNPROVIDED )
    {
      var90 = NIL;
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
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert NIL != module0035.f2015( var92 ) : var92;
    SubLObject var93 = var92;
    SubLObject var94 = NIL;
    var94 = var93.first();
    while ( NIL != var93)
    {
      assert NIL != Types.stringp( var94 ) : var94;
      var93 = var93.rest();
      var94 = var93.first();
    }
    if( NIL != var92 )
    {
      f11203( var21, $ic35$, var92 );
    }
    else
    {
      f11238( var21, $ic35$ );
    }
    return var21;
  }

  public static SubLObject f11240(final SubLObject var21)
  {
    return NIL;
  }

  public static SubLObject f11241(final SubLObject var21)
  {
    return NIL;
  }

  public static SubLObject f11242(final SubLObject var21)
  {
    return module0212.f13756( var21 );
  }

  public static SubLObject f11243(final SubLObject var21)
  {
    return T;
  }

  public static SubLObject f11244(final SubLObject var21, final SubLObject var96)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
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
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
    final SubLObject var101 = var100.rest();
    var100 = var100.first();
    SubLObject var102 = NIL;
    SubLObject var103 = NIL;
    SubLObject var104 = NIL;
    SubLObject var105 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
    var102 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
    var103 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
    var104 = var100.first();
    var100 = var100.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
    var105 = var100.first();
    var100 = var100.rest();
    if( NIL == var100 )
    {
      var100 = var101;
      SubLObject var106 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var100, var99, $ic53$ );
      var106 = var100.first();
      final SubLObject var107;
      var100 = ( var107 = var100.rest() );
      return ConsesLow.listS( $ic54$, ConsesLow.list( $ic55$, var102, var103, var104, var105 ), var106, ConsesLow.append( var107, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var99, $ic53$ );
    return NIL;
  }

  public static SubLObject f11194(final SubLObject var21)
  {
    final SubLObject var22 = f11191( var21, $ic56$, UNPROVIDED );
    if( NIL != var22 )
    {
      return var22;
    }
    return NIL;
  }

  public static SubLObject f11247(final SubLObject var21, final SubLObject var108)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    if( NIL != var108 )
    {
      f11203( var21, $ic56$, var108 );
    }
    else
    {
      f11238( var21, $ic56$ );
    }
    return var21;
  }

  public static SubLObject f11248(final SubLObject var21)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    if( NIL != module0178.f11375( var21 ) )
    {
      return module0035.sublisp_boolean( f11194( var21 ) );
    }
    return NIL;
  }

  public static SubLObject f11249(SubLObject var102, SubLObject var103, SubLObject var104, SubLObject var105)
  {
    if( var102 == UNPROVIDED )
    {
      var102 = NIL;
    }
    if( var103 == UNPROVIDED )
    {
      var103 = NIL;
    }
    if( var104 == UNPROVIDED )
    {
      var104 = NIL;
    }
    if( var105 == UNPROVIDED )
    {
      var105 = NIL;
    }
    if( NIL != var105 )
    {
      return ConsesLow.list( var102, var103, var104, var105 );
    }
    if( NIL != var104 )
    {
      return ConsesLow.list( var102, var103, var104 );
    }
    if( NIL != var103 )
    {
      return ConsesLow.list( var102, var103 );
    }
    if( NIL != var102 )
    {
      return ConsesLow.list( var102 );
    }
    return NIL;
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
    final SubLObject var112 = var111.isCons() ? var111.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, $ic57$ );
    var111 = var111.rest();
    final SubLObject var113 = var111.isCons() ? var111.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, $ic57$ );
    var111 = var111.rest();
    final SubLObject var114 = var111.isCons() ? var111.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, $ic57$ );
    var111 = var111.rest();
    final SubLObject var115 = var111.isCons() ? var111.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var111, var110, $ic57$ );
    var111 = var111.rest();
    if( NIL == var111 )
    {
      return f11247( var21, f11249( var109, var113, var114, var115 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var110, $ic57$ );
    return NIL;
  }

  public static SubLObject f11251(final SubLObject var21, final SubLObject var112)
  {
    SubLObject var114;
    final SubLObject var113 = var114 = f11194( var21 );
    final SubLObject var115 = var114.isCons() ? var114.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, $ic57$ );
    var114 = var114.rest();
    final SubLObject var116 = var114.isCons() ? var114.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, $ic57$ );
    var114 = var114.rest();
    final SubLObject var117 = var114.isCons() ? var114.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, $ic57$ );
    var114 = var114.rest();
    final SubLObject var118 = var114.isCons() ? var114.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var114, var113, $ic57$ );
    var114 = var114.rest();
    if( NIL == var114 )
    {
      return f11247( var21, f11249( var115, var112, var117, var118 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var113, $ic57$ );
    return NIL;
  }

  public static SubLObject f11252(final SubLObject var21, final SubLObject var115)
  {
    SubLObject var117;
    final SubLObject var116 = var117 = f11194( var21 );
    final SubLObject var118 = var117.isCons() ? var117.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, $ic57$ );
    var117 = var117.rest();
    final SubLObject var119 = var117.isCons() ? var117.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, $ic57$ );
    var117 = var117.rest();
    final SubLObject var120 = var117.isCons() ? var117.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, $ic57$ );
    var117 = var117.rest();
    final SubLObject var121 = var117.isCons() ? var117.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var117, var116, $ic57$ );
    var117 = var117.rest();
    if( NIL == var117 )
    {
      return f11247( var21, f11249( var118, var119, var115, var121 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var116, $ic57$ );
    return NIL;
  }

  public static SubLObject f11253(final SubLObject var21, final SubLObject var118)
  {
    SubLObject var120;
    final SubLObject var119 = var120 = f11194( var21 );
    final SubLObject var121 = var120.isCons() ? var120.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, $ic57$ );
    var120 = var120.rest();
    final SubLObject var122 = var120.isCons() ? var120.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, $ic57$ );
    var120 = var120.rest();
    final SubLObject var123 = var120.isCons() ? var120.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, $ic57$ );
    var120 = var120.rest();
    final SubLObject var124 = var120.isCons() ? var120.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( var120, var119, $ic57$ );
    var120 = var120.rest();
    if( NIL == var120 )
    {
      return f11247( var21, f11249( var121, var122, var123, var118 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var119, $ic57$ );
    return NIL;
  }

  public static SubLObject f11254(final SubLObject var21)
  {
    final SubLObject var22 = module0178.f11299( var21 );
    final SubLObject var23 = module0178.f11300( var21 );
    final SubLObject var24 = f11190( var21 );
    final SubLObject var25 = f11242( var21 );
    return makeBoolean( NIL != module0161.f10571( f11179( var21 ), UNPROVIDED ) && NIL != module0130.f8520( f11187( var21 ) ) && var22.isCons() && NIL != module0035.f2370( Symbols.symbol_function( $ic58$ ), var22,
        UNPROVIDED ) && NIL != module0032.f1724( var23 ) && NIL != module0035.f2370( Symbols.symbol_function( $ic58$ ), module0032.f1753( var23 ), UNPROVIDED ) && var24.isList() && NIL != module0035.f2370( Symbols
            .symbol_function( $ic45$ ), var24, UNPROVIDED ) && NIL != module0130.f8503( module0178.f11291( var21 ) ) && NIL != module0212.f13775( var25 ) );
  }

  public static SubLObject f11178(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    final SubLObject var23 = assertion_handles_oc.f11025( var21 );
    SubLObject var24 = NIL;
    SubLObject var25 = NIL;
    try
    {
      var22.throwStack.push( $ic59$ );
      final SubLObject var26 = Errors.$error_handler$.currentBinding( var22 );
      try
      {
        Errors.$error_handler$.bind( Symbols.symbol_function( $ic60$ ), var22 );
        try
        {
          var24 = assertion_manager_oc.f11114( var23 );
        }
        catch( final Throwable var27 )
        {
          Errors.handleThrowable( var27, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var26, var22 );
      }
    }
    catch( final Throwable var28 )
    {
      var25 = Errors.handleThrowable( var28, $ic59$ );
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
    if( NIL != var130 )
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
    assertion_manager_oc.f11123( var130, var131 );
    f11239( var21, var125 );
    f11234( var21, module0130.f8529( var127, var128 ) );
    final SubLObject var132 = f11257( var70 );
    f11258( var21, var132 );
    f11232( var21, var126 );
    if( NIL != var129 )
    {
      f11259( var21, var129 );
    }
    if( var126 == $ic61$ )
    {
      module0528.f32917( var21 );
    }
    return NIL;
  }

  public static SubLObject f11260(final SubLObject var130)
  {
    final SubLObject var131 = assertion_handles_oc.f11053( var130 );
    return ( NIL != var131 ) ? var131 : assertion_handles_oc.f11049( var130 );
  }

  public static SubLObject f11257(final SubLObject var70)
  {
    if( NIL != module0232.f15322( var70 ) )
    {
      return f11261( module0204.f13047( var70 ) );
    }
    return f11262( var70 );
  }

  public static SubLObject f11262(final SubLObject var70)
  {
    final SubLObject var71 = module0217.f14418( var70 );
    if( NIL != var71 )
    {
      final SubLObject var72 = f11211( var71 );
      return ( NIL != var72 ) ? var72 : var71;
    }
    return var70;
  }

  public static SubLObject f11261(final SubLObject var80)
  {
    final SubLObject var81 = module0217.f14423( var80 );
    if( NIL != var81 )
    {
      final SubLObject var82 = f11211( var81 );
      return ( NIL != var82 ) ? var82 : var81;
    }
    return var80;
  }

  public static SubLObject f11258(final SubLObject var21, final SubLObject var131)
  {
    f11263( var21, var131 );
    module0217.f14364( var21, UNPROVIDED );
    return var21;
  }

  public static SubLObject f11263(final SubLObject var21, final SubLObject var131)
  {
    SubLObject var132 = var131;
    if( NIL != module0192.f12006( var131 ) )
    {
      module0192.f12039( var131, var21 );
    }
    else if( NIL != assertion_handles_oc.f11035( var131 ) )
    {
      final SubLObject var133 = module0178.f11282( var131 );
      final SubLObject var134 = module0192.f12034( var133 );
      module0192.f12039( var134, var131 );
      module0192.f12039( var134, var21 );
      var132 = var134;
      f11207( var131, var132 );
    }
    else if( NIL == module0232.f15320( var131 ) )
    {
      if( NIL == module0202.f12590( var131 ) )
      {
        Errors.error( $ic62$, var131 );
        return NIL;
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
    return NIL;
  }

  public static SubLObject f11266(final SubLObject var21, final SubLObject var38)
  {
    f11265( var21 );
    final SubLObject var39 = f11262( var38 );
    f11258( var21, var39 );
    return NIL;
  }

  public static SubLObject f11265(final SubLObject var21)
  {
    module0217.f14367( var21, UNPROVIDED );
    f11267( var21 );
    return var21;
  }

  public static SubLObject f11267(final SubLObject var21)
  {
    final SubLObject var22 = f11211( var21 );
    if( NIL != var22 )
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
    f11160( assertion_handles_oc.f11025( var21 ), module0035.f2073( var135, module0178.f11299( var21 ), UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11269(final SubLObject var21, final SubLObject var136)
  {
    assert NIL != module0032.f1724( var136 ) : var136;
    if( NIL != var136 )
    {
      f11203( var21, $ic31$, var136 );
    }
    else
    {
      f11238( var21, $ic31$ );
    }
    return var21;
  }

  public static SubLObject f11270(final SubLObject var21, final SubLObject var135)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert NIL != module0191.f11910( var135 ) : var135;
    f11269( var21, module0032.f1736( var135, f11202( var21 ), UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11271(final SubLObject var21, final SubLObject var135)
  {
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    assert NIL != module0191.f11910( var135 ) : var135;
    f11269( var21, module0032.f1737( var135, f11202( var21 ), UNPROVIDED ) );
    return var21;
  }

  public static SubLObject f11272(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    assert NIL != assertion_handles_oc.f11035( var21 ) : var21;
    SubLObject var23 = NIL;
    SubLObject var24 = NIL;
    final SubLObject var25 = module0032.f1728( f11202( var21 ) );
    final SubLObject var26 = $g2208$.currentBinding( var22 );
    final SubLObject var27 = $g2207$.currentBinding( var22 );
    try
    {
      $g2208$.bind( Hashtables.make_hash_table( Numbers.integerDivide( var25, TWO_INTEGER ), UNPROVIDED, UNPROVIDED ), var22 );
      $g2207$.bind( Hashtables.make_hash_table( var25, UNPROVIDED, UNPROVIDED ), var22 );
      f11273( var21 );
      var23 = $g2208$.getDynamicValue( var22 );
      var24 = $g2207$.getDynamicValue( var22 );
    }
    finally
    {
      $g2207$.rebind( var27, var22 );
      $g2208$.rebind( var26, var22 );
    }
    return Values.values( var23, var24 );
  }

  public static SubLObject f11273(final SubLObject var21)
  {
    final SubLThread var22 = SubLProcess.currentSubLThread();
    if( NIL == Hashtables.gethash( var21, $g2208$.getDynamicValue( var22 ), UNPROVIDED ) )
    {
      Hashtables.sethash( var21, $g2208$.getDynamicValue( var22 ), T );
      final SubLObject var23 = f11202( var21 );
      SubLObject var24;
      SubLObject var25;
      SubLObject var26;
      for( var24 = module0032.f1741( var23 ), var25 = NIL, var25 = module0032.f1742( var24, var23 ); NIL == module0032.f1744( var24, var25 ); var25 = module0032.f1743( var25 ) )
      {
        var26 = module0032.f1745( var24, var25 );
        if( NIL != module0032.f1746( var25, var26 ) )
        {
          f11274( var26 );
        }
      }
    }
    return NIL;
  }

  public static SubLObject f11274(final SubLObject var143)
  {
    final SubLThread var144 = SubLProcess.currentSubLThread();
    assert NIL != deduction_handles_oc.f11659( var143 ) : var143;
    if( NIL == Hashtables.gethash( var143, $g2207$.getDynamicValue( var144 ), UNPROVIDED ) )
    {
      Hashtables.sethash( var143, $g2207$.getDynamicValue( var144 ), T );
      final SubLObject var145 = module0188.f11781( var143 );
      if( NIL != assertion_handles_oc.f11035( var145 ) )
      {
        SubLObject var146 = f11201( var145 );
        SubLObject var147 = NIL;
        var147 = var146.first();
        while ( NIL != var146)
        {
          if( NIL == deduction_handles_oc.f11659( var147 ) || NIL == Hashtables.gethash( var143, $g2207$.getDynamicValue( var144 ), UNPROVIDED ) )
          {
            return NIL;
          }
          f11273( var145 );
          var146 = var146.rest();
          var147 = var146.first();
        }
      }
      else if( NIL != module0179.f11424( var145 ) )
      {
      }
    }
    return NIL;
  }

  public static SubLObject f11275(SubLObject var145)
  {
    if( var145 == UNPROVIDED )
    {
      var145 = NIL;
    }
    return assertion_manager_oc.f11132( $ic1$, var145 );
  }

  public static SubLObject f11276()
  {
    SubLFiles.declareFunction(me, "f11136", "S#13970", 2, 0, false );
    SubLFiles.declareFunction(me, "f11137", "S#13956", 1, 0, false );
    new $f11137$UnaryFunction();
    SubLFiles.declareFunction(me, "f11138", "S#13971", 1, 0, false );
    SubLFiles.declareFunction(me, "f11139", "S#13972", 1, 0, false );
    SubLFiles.declareFunction(me, "f11140", "S#13973", 1, 0, false );
    SubLFiles.declareFunction(me, "f11141", "S#13974", 1, 0, false );
    SubLFiles.declareFunction(me, "f11142", "S#13975", 1, 0, false );
    SubLFiles.declareFunction(me, "f11143", "S#13976", 2, 0, false );
    SubLFiles.declareFunction(me, "f11144", "S#13977", 2, 0, false );
    SubLFiles.declareFunction(me, "f11145", "S#13978", 2, 0, false );
    SubLFiles.declareFunction(me, "f11146", "S#13979", 2, 0, false );
    SubLFiles.declareFunction(me, "f11147", "S#13980", 2, 0, false );
    SubLFiles.declareFunction(me, "f11148", "S#13981", 0, 1, false );
    SubLFiles.declareFunction(me, "f11149", "S#13982", 2, 0, false );
    SubLFiles.declareFunction(me, "f11150", "S#13983", 2, 0, false );
    SubLFiles.declareFunction(me, "f11151", "S#13984", 1, 0, false );
    SubLFiles.declareFunction(me, "f11152", "S#13985", 1, 0, false );
    SubLFiles.declareFunction(me, "f11153", "S#13986", 1, 0, false );
    SubLFiles.declareFunction(me, "f11154", "S#13987", 1, 0, false );
    SubLFiles.declareFunction(me, "f11155", "S#13988", 1, 0, false );
    SubLFiles.declareFunction(me, "f11156", "S#13989", 1, 0, false );
    SubLFiles.declareFunction(me, "f11157", "S#13990", 1, 0, false );
    SubLFiles.declareFunction(me, "f11158", "S#13991", 2, 0, false );
    SubLFiles.declareFunction(me, "f11159", "S#13992", 2, 0, false );
    SubLFiles.declareFunction(me, "f11160", "S#13993", 2, 0, false );
    SubLFiles.declareFunction(me, "f11161", "S#13994", 2, 0, false );
    SubLFiles.declareFunction(me, "f11162", "S#13995", 2, 0, false );
    SubLFiles.declareFunction(me, "f11166", "S#13996", 1, 0, false );
    SubLFiles.declareFunction(me, "f11165", "S#13997", 1, 0, false );
    SubLFiles.declareFunction(me, "f11167", "S#13998", 5, 0, false );
    SubLFiles.declareFunction(me, "f11169", "S#13999", 2, 1, false );
    SubLFiles.declareFunction(me, "f11170", "S#14000", 3, 0, false );
    SubLFiles.declareFunction(me, "f11171", "S#14001", 2, 0, false );
    SubLFiles.declareFunction(me, "f11173", "S#14002", 2, 0, false );
    SubLFiles.declareFunction(me, "f11174", "S#14003", 2, 0, false );
    SubLFiles.declareFunction(me, "f11172", "S#14004", 6, 0, false );
    SubLFiles.declareFunction(me, "f11175", "S#13859", 1, 0, false );
    SubLFiles.declareFunction(me, "f11177", "S#13860", 1, 0, false );
    SubLFiles.declareFunction(me, "f11179", "S#13861", 1, 0, false );
    SubLFiles.declareFunction(me, "f11180", "S#13865", 1, 0, false );
    SubLFiles.declareFunction(me, "f11183", "S#13866", 1, 0, false );
    SubLFiles.declareFunction(me, "f11184", "S#13867", 1, 0, false );
    SubLFiles.declareFunction(me, "f11186", "S#13868", 1, 0, false );
    SubLFiles.declareFunction(me, "f11188", "S#13869", 1, 0, false );
    SubLFiles.declareFunction(me, "f11187", "S#14005", 1, 0, false );
    SubLFiles.declareFunction(me, "f11190", "S#13870", 1, 0, false );
    SubLFiles.declareFunction(me, "f11192", "S#13871", 1, 0, false );
    SubLFiles.declareFunction(me, "f11195", "S#13872", 1, 0, false );
    SubLFiles.declareFunction(me, "f11197", "S#13873", 1, 0, false );
    SubLFiles.declareFunction(me, "f11199", "S#13874", 1, 0, false );
    SubLFiles.declareFunction(me, "f11201", "S#13889", 1, 0, false );
    SubLFiles.declareFunction(me, "f11202", "S#13899", 1, 0, false );
    SubLFiles.declareFunction(me, "f11163", "S#14006", 1, 0, false );
    SubLFiles.declareFunction(me, "f11204", "S#14007", 2, 0, false );
    SubLFiles.declareFunction(me, "f11176", "S#14008", 1, 0, false );
    SubLFiles.declareFunction(me, "f11206", "S#14009", 2, 0, false );
    SubLFiles.declareFunction(me, "f11211", "S#14010", 1, 0, false );
    SubLFiles.declareFunction(me, "f11209", "S#14011", 2, 0, false );
    SubLFiles.declareFunction(me, "f11207", "S#14012", 2, 0, false );
    SubLFiles.declareFunction(me, "f11210", "S#14013", 2, 0, false );
    SubLFiles.declareFunction(me, "f11208", "S#14014", 1, 0, false );
    SubLFiles.declareFunction(me, "f11164", "S#14015", 1, 0, false );
    SubLFiles.declareFunction(me, "f11215", "S#14016", 2, 0, false );
    SubLFiles.declareFunction(me, "f11216", "S#14017", 1, 0, false );
    SubLFiles.declareFunction(me, "f11217", "S#14018", 2, 0, false );
    SubLFiles.declareFunction(me, "f11185", "S#14019", 1, 0, false );
    SubLFiles.declareFunction(me, "f11218", "S#14020", 2, 0, false );
    SubLFiles.declareFunction(me, "f11189", "S#14021", 1, 0, false );
    SubLFiles.declareFunction(me, "f11219", "S#14022", 2, 0, false );
    SubLFiles.declareFunction(me, "f11220", "S#14023", 1, 0, false );
    SubLFiles.declareFunction(me, "f11221", "S#14024", 2, 0, false );
    SubLFiles.declareFunction(me, "f11222", "S#14025", 0, 0, false );
    SubLFiles.declareFunction(me, "f11223", "S#14026", 1, 0, false );
    SubLFiles.declareFunction(me, "f11224", "S#14027", 0, 0, false );
    SubLFiles.declareFunction(me, "f11181", "S#13863", 1, 0, false );
    SubLFiles.declareFunction(me, "f11225", "S#13864", 1, 0, false );
    SubLFiles.declareFunction(me, "f11226", "S#14028", 0, 0, false );
    SubLFiles.declareFunction(me, "f11227", "S#14029", 0, 0, false );
    SubLFiles.declareFunction(me, "f11213", "S#14030", 2, 0, false );
    SubLFiles.declareFunction(me, "f11228", "S#14031", 1, 0, false );
    SubLFiles.declareFunction(me, "f11214", "S#14032", 1, 0, false );
    SubLFiles.declareFunction(me, "f11212", "S#14033", 1, 0, false );
    SubLFiles.declareFunction(me, "f11229", "S#14034", 1, 0, false );
    SubLFiles.declareFunction(me, "f11230", "S#14035", 1, 0, false );
    SubLFiles.declareFunction(me, "f11231", "S#14036", 0, 0, false );
    SubLFiles.declareFunction(me, "f11205", "S#14037", 1, 0, false );
    SubLFiles.declareFunction(me, "f11182", "S#14038", 1, 0, false );
    SubLFiles.declareFunction(me, "f11232", "S#13875", 2, 0, false );
    SubLFiles.declareFunction(me, "f11233", "S#14039", 2, 0, false );
    SubLFiles.declareFunction(me, "f11234", "S#14040", 2, 0, false );
    SubLFiles.declareFunction(me, "f11235", "S#13877", 2, 0, false );
    SubLFiles.declareFunction(me, "f11236", "S#13879", 2, 0, false );
    SubLFiles.declareFunction(me, "f11168", "S#14041", 1, 0, false );
    SubLFiles.declareFunction(me, "f11237", "S#14042", 2, 0, false );
    SubLFiles.declareFunction(me, "f11191", "S#14043", 2, 1, false );
    SubLFiles.declareFunction(me, "f11203", "S#14044", 3, 0, false );
    SubLFiles.declareFunction(me, "f11238", "S#14045", 2, 0, false );
    SubLFiles.declareFunction(me, "f11239", "S#13881", 2, 0, false );
    SubLFiles.declareFunction(me, "f11240", "S#14046", 1, 0, false );
    SubLFiles.declareFunction(me, "f11241", "S#14047", 1, 0, false );
    SubLFiles.declareFunction(me, "f11242", "S#14048", 1, 0, false );
    SubLFiles.declareFunction(me, "f11243", "S#14049", 1, 0, false );
    SubLFiles.declareFunction(me, "f11244", "S#14050", 2, 0, false );
    SubLFiles.declareFunction(me, "f11245", "S#14051", 1, 0, false );
    SubLFiles.declareMacro(me, "f11246", "S#14052" );
    SubLFiles.declareFunction(me, "f11194", "S#14053", 1, 0, false );
    SubLFiles.declareFunction(me, "f11247", "S#14054", 2, 0, false );
    SubLFiles.declareFunction(me, "f11248", "S#14055", 1, 0, false );
    SubLFiles.declareFunction(me, "f11249", "S#14056", 0, 4, false );
    SubLFiles.declareFunction(me, "f11193", "S#14057", 1, 0, false );
    SubLFiles.declareFunction(me, "f11196", "S#14058", 1, 0, false );
    SubLFiles.declareFunction(me, "f11198", "S#14059", 1, 0, false );
    SubLFiles.declareFunction(me, "f11200", "S#14060", 1, 0, false );
    SubLFiles.declareFunction(me, "f11250", "SET-ASSERTION-ASSERTED-BY", 2, 0, false );
    SubLFiles.declareFunction(me, "f11251", "S#13884", 2, 0, false );
    SubLFiles.declareFunction(me, "f11252", "S#13886", 2, 0, false );
    SubLFiles.declareFunction(me, "f11253", "SET-ASSERTION-ASSERTED-SECOND", 2, 0, false );
    SubLFiles.declareFunction(me, "f11254", "S#14061", 1, 0, false );
    SubLFiles.declareFunction(me, "f11178", "S#14062", 1, 0, false );
    SubLFiles.declareFunction(me, "f11255", "S#13858", 7, 0, false );
    SubLFiles.declareFunction(me, "f11256", "S#13857", 9, 0, false );
    SubLFiles.declareFunction(me, "f11260", "S#13856", 1, 0, false );
    SubLFiles.declareFunction(me, "f11257", "S#14063", 1, 0, false );
    SubLFiles.declareFunction(me, "f11262", "S#14064", 1, 0, false );
    SubLFiles.declareFunction(me, "f11261", "S#14065", 1, 0, false );
    SubLFiles.declareFunction(me, "f11258", "S#14066", 2, 0, false );
    SubLFiles.declareFunction(me, "f11263", "S#14067", 2, 0, false );
    SubLFiles.declareFunction(me, "f11264", "S#13715", 1, 0, false );
    SubLFiles.declareFunction(me, "f11266", "S#13714", 2, 0, false );
    SubLFiles.declareFunction(me, "f11265", "S#14068", 1, 0, false );
    SubLFiles.declareFunction(me, "f11267", "S#14069", 1, 0, false );
    SubLFiles.declareFunction(me, "f11259", "S#13894", 2, 0, false );
    SubLFiles.declareFunction(me, "f11268", "S#13897", 2, 0, false );
    SubLFiles.declareFunction(me, "f11269", "S#14070", 2, 0, false );
    SubLFiles.declareFunction(me, "f11270", "S#14071", 2, 0, false );
    SubLFiles.declareFunction(me, "f11271", "S#14072", 2, 0, false );
    SubLFiles.declareFunction(me, "f11272", "S#13725", 1, 0, false );
    SubLFiles.declareFunction(me, "f11273", "S#14073", 1, 0, false );
    SubLFiles.declareFunction(me, "f11274", "S#14074", 1, 0, false );
    SubLFiles.declareFunction(me, "f11275", "S#14075", 0, 1, false );
    return NIL;
  }

  public static SubLObject f11277()
  {
    $g2199$ = SubLFiles.defconstant( "S#14076", $ic0$ );
    $g2200$ = SubLFiles.deflexical( "S#14077", ZERO_INTEGER );
    $g2201$ = SubLFiles.defconstant( "S#14078", bytes.sublisp_byte( ONE_INTEGER, ZERO_INTEGER ) );
    $g2202$ = SubLFiles.defconstant( "S#14079", bytes.sublisp_byte( TWO_INTEGER, ONE_INTEGER ) );
    $g2203$ = SubLFiles.defconstant( "S#14080", bytes.sublisp_byte( THREE_INTEGER, THREE_INTEGER ) );
    $g2204$ = SubLFiles.deflexical( "S#14081", ( NIL != Symbols.boundp( $ic38$ ) ) ? $g2204$.getGlobalValue() : NIL );
    $g2205$ = SubLFiles.deflexical( "S#14082", ( NIL != Symbols.boundp( $ic39$ ) ) ? $g2205$.getGlobalValue() : T );
    $g2206$ = SubLFiles.deflexical( "S#14083", $ic40$ );
    $g2207$ = SubLFiles.defparameter( "S#14084", NIL );
    $g2208$ = SubLFiles.defparameter( "S#14085", NIL );
    return NIL;
  }

  public static SubLObject f11278()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $g2199$.getGlobalValue(), Symbols.symbol_function( $ic8$ ) );
    SubLSpecialOperatorDeclarations.proclaim( $ic9$ );
    Structures.def_csetf( $ic10$, $ic11$ );
    Structures.def_csetf( $ic12$, $ic13$ );
    Structures.def_csetf( $ic14$, $ic15$ );
    Structures.def_csetf( $ic16$, $ic17$ );
    Structures.def_csetf( $ic18$, $ic19$ );
    Equality.identity( $ic0$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2199$.getGlobalValue(), Symbols.symbol_function( $ic30$ ) );
    module0003.f57( $ic38$ );
    module0003.f57( $ic39$ );
    module0002.f50( $ic42$, $ic43$ );
    return NIL;
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
    me = new assertions_low_oc();
    $g2199$ = null;
    $g2200$ = null;
    $g2201$ = null;
    $g2202$ = null;
    $g2203$ = null;
    $g2204$ = null;
    $g2205$ = null;
    $g2206$ = null;
    $g2207$ = null;
    $g2208$ = null;
    $ic0$ = makeSymbol( "S#13955", "CYC" );
    $ic1$ = makeSymbol( "S#13956", "CYC" );
    $ic2$ = makeInteger( 148 );
    $ic3$ = ConsesLow.list( makeSymbol( "S#14086", "CYC" ), makeSymbol( "S#11445", "CYC" ), makeSymbol( "S#14087", "CYC" ), makeSymbol( "S#160", "CYC" ), makeSymbol( "S#138", "CYC" ) );
    $ic4$ = ConsesLow.list( makeKeyword( "FORMULA-DATA" ), makeKeyword( "MT" ), makeKeyword( "FLAGS" ), makeKeyword( "ARGUMENTS" ), makeKeyword( "PLIST" ) );
    $ic5$ = ConsesLow.list( makeSymbol( "S#13971", "CYC" ), makeSymbol( "S#13972", "CYC" ), makeSymbol( "S#13973", "CYC" ), makeSymbol( "S#13974", "CYC" ), makeSymbol( "S#13975", "CYC" ) );
    $ic6$ = ConsesLow.list( makeSymbol( "S#13976", "CYC" ), makeSymbol( "S#13977", "CYC" ), makeSymbol( "S#13978", "CYC" ), makeSymbol( "S#13979", "CYC" ), makeSymbol( "S#13980", "CYC" ) );
    $ic7$ = makeSymbol( "DEFAULT-STRUCT-PRINT-FUNCTION" );
    $ic8$ = makeSymbol( "S#13970", "CYC" );
    $ic9$ = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "S#13956", "CYC" ) );
    $ic10$ = makeSymbol( "S#13971", "CYC" );
    $ic11$ = makeSymbol( "S#13976", "CYC" );
    $ic12$ = makeSymbol( "S#13972", "CYC" );
    $ic13$ = makeSymbol( "S#13977", "CYC" );
    $ic14$ = makeSymbol( "S#13973", "CYC" );
    $ic15$ = makeSymbol( "S#13978", "CYC" );
    $ic16$ = makeSymbol( "S#13974", "CYC" );
    $ic17$ = makeSymbol( "S#13979", "CYC" );
    $ic18$ = makeSymbol( "S#13975", "CYC" );
    $ic19$ = makeSymbol( "S#13980", "CYC" );
    $ic20$ = makeKeyword( "FORMULA-DATA" );
    $ic21$ = makeKeyword( "MT" );
    $ic22$ = makeKeyword( "FLAGS" );
    $ic23$ = makeKeyword( "ARGUMENTS" );
    $ic24$ = makeKeyword( "PLIST" );
    $ic25$ = makeString( "Invalid slot ~S for construction function" );
    $ic26$ = makeKeyword( "BEGIN" );
    $ic27$ = makeSymbol( "S#13981", "CYC" );
    $ic28$ = makeKeyword( "SLOT" );
    $ic29$ = makeKeyword( "END" );
    $ic30$ = makeSymbol( "S#13983", "CYC" );
    $ic31$ = makeKeyword( "DEPENDENTS" );
    $ic32$ = makeKeyword( "NOT-FOUND" );
    $ic33$ = makeSymbol( "ASSERTION-P" );
    $ic34$ = makeString( "~a (assertion #~a) has null flags" );
    $ic35$ = makeKeyword( "VARIABLE-NAMES" );
    $ic36$ = makeInteger( 256 );
    $ic37$ = makeString( "Unexpected formula-data type: ~S" );
    $ic38$ = makeSymbol( "S#14081", "CYC" );
    $ic39$ = makeSymbol( "S#14082", "CYC" );
    $ic40$ = makeInteger( 60 );
    $ic41$ = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic42$ = makeSymbol( "S#14027", "CYC" );
    $ic43$ = makeSymbol( "S#14088", "CYC" );
    $ic44$ = makeString( "mapping Cyc assertions" );
    $ic45$ = makeSymbol( "STRINGP" );
    $ic46$ = makeKeyword( "SKIP" );
    $ic47$ = makeSymbol( "CNF-P" );
    $ic48$ = makeString( "Rebuilding the Rule Set" );
    $ic49$ = makeSymbol( "S#38", "CYC" );
    $ic50$ = makeString( "~A" );
    $ic51$ = makeSymbol( "LISTP" );
    $ic52$ = makeSymbol( "S#747", "CYC" );
    $ic53$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#13925", "CYC" ), makeSymbol( "WHEN" ), makeSymbol( "S#13926", "CYC" ), makeSymbol( "SECOND" ) ), makeSymbol( "S#14089", "CYC" ), makeSymbol( "&BODY" ),
        makeSymbol( "S#5", "CYC" ) );
    $ic54$ = makeSymbol( "CDESTRUCTURING-BIND" );
    $ic55$ = makeSymbol( "&OPTIONAL" );
    $ic56$ = makeKeyword( "ASSERT-INFO" );
    $ic57$ = ConsesLow.list( makeSymbol( "&OPTIONAL" ), makeSymbol( "S#13925", "CYC" ), makeSymbol( "WHEN" ), makeSymbol( "S#13926", "CYC" ), makeSymbol( "SECOND" ) );
    $ic58$ = makeSymbol( "S#14090", "CYC" );
    $ic59$ = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic60$ = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic61$ = makeKeyword( "FORWARD" );
    $ic62$ = makeString( "Unexpected formula data hook: ~S" );
    $ic63$ = makeSymbol( "S#2986", "CYC" );
    $ic64$ = makeSymbol( "ARGUMENT-P" );
    $ic65$ = makeSymbol( "DEDUCTION-P" );
  }

  public static final class $sX13955_native
      extends
        SubLStructNative
  {
    public SubLObject $formula_data;
    public SubLObject $mt;
    public SubLObject $flags;
    public SubLObject $arguments;
    public SubLObject $plist;
    public static final SubLStructDeclNative structDecl;

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
      return $structDecl;
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
      structDecl = Structures.makeStructDeclNative( $sX13955_native.class, $ic0$, $ic1$, $ic3$, $ic4$, new String[] { "$formula_data", "$mt", "$flags", "$arguments", "$plist"
      }, $ic5$, $ic6$, $ic7$ );
    }
  }

  public static final class $f11137$UnaryFunction
      extends
        UnaryFunction
  {
    public $f11137$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#13956" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var3)
    {
      return f11137( var3 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 477 ms
 *
 * Decompiled with Procyon 0.5.32.
 */