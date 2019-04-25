package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class oc_cycml_generator extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.oc_cycml_generator";
  public static final String myFingerPrint = "828d82d47942b2e957ee9b208a90bd86ecef91657e1b04964f00769c15e9462d";
  public static SubLSymbol $g6372$;
  private static SubLSymbol $g6373$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLString $ic3$;
  private static final SubLString $ic4$;
  private static final SubLString $ic5$;
  private static final SubLString $ic6$;
  private static final SubLString $ic7$;
  private static final SubLString $ic8$;
  private static final SubLString $ic9$;
  private static final SubLString $ic10$;
  private static final SubLString $ic11$;
  private static final SubLString $ic12$;
  private static final SubLString $ic13$;
  private static final SubLString $ic14$;
  private static final SubLString $ic15$;
  private static final SubLString $ic16$;
  private static final SubLString $ic17$;
  private static final SubLString $ic18$;
  private static final SubLString $ic19$;
  private static final SubLString $ic20$;
  private static final SubLString $ic21$;
  private static final SubLString $ic22$;
  private static final SubLString $ic23$;
  private static final SubLString $ic24$;
  private static final SubLString $ic25$;
  private static final SubLString $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLSymbol $ic28$;
  private static final SubLList $ic29$;
  private static final SubLList $ic30$;
  private static final SubLList $ic31$;
  private static final SubLList $ic32$;
  private static final SubLSymbol $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLList $ic35$;
  private static final SubLSymbol $ic36$;
  private static final SubLSymbol $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLString $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
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
  private static final SubLSymbol $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLSymbol $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLSymbol $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLSymbol $ic69$;
  private static final SubLString $ic70$;
  private static final SubLString $ic71$;
  private static final SubLString $ic72$;
  private static final SubLString $ic73$;
  private static final SubLList $ic74$;
  private static final SubLString $ic75$;
  private static final SubLString $ic76$;
  private static final SubLList $ic77$;
  private static final SubLString $ic78$;
  private static final SubLList $ic79$;
  private static final SubLString $ic80$;
  private static final SubLList $ic81$;
  private static final SubLString $ic82$;
  private static final SubLList $ic83$;
  private static final SubLString $ic84$;
  private static final SubLList $ic85$;
  private static final SubLString $ic86$;
  private static final SubLList $ic87$;
  private static final SubLString $ic88$;
  private static final SubLString $ic89$;
  private static final SubLList $ic90$;
  private static final SubLString $ic91$;
  private static final SubLString $ic92$;
  private static final SubLString $ic93$;
  private static final SubLString $ic94$;
  private static final SubLSymbol $ic95$;
  private static final SubLString $ic96$;
  private static final SubLString $ic97$;
  private static final SubLString $ic98$;
  private static final SubLString $ic99$;
  private static final SubLString $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLString $ic102$;
  private static final SubLString $ic103$;
  private static final SubLString $ic104$;
  private static final SubLString $ic105$;
  private static final SubLString $ic106$;
  private static final SubLSymbol $ic107$;
  private static final SubLString $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLList $ic110$;
  private static final SubLObject $ic111$;
  private static final SubLString $ic112$;
  private static final SubLObject $ic113$;
  private static final SubLString $ic114$;
  private static final SubLSymbol $ic115$;
  private static final SubLString $ic116$;
  private static final SubLString $ic117$;
  private static final SubLObject $ic118$;
  private static final SubLString $ic119$;
  private static final SubLObject $ic120$;
  private static final SubLString $ic121$;
  private static final SubLObject $ic122$;
  private static final SubLString $ic123$;
  private static final SubLObject $ic124$;
  private static final SubLString $ic125$;
  private static final SubLObject $ic126$;
  private static final SubLString $ic127$;
  private static final SubLObject $ic128$;
  private static final SubLString $ic129$;
  private static final SubLObject $ic130$;
  private static final SubLString $ic131$;
  private static final SubLObject $ic132$;
  private static final SubLString $ic133$;
  private static final SubLObject $ic134$;
  private static final SubLString $ic135$;
  private static final SubLObject $ic136$;
  private static final SubLString $ic137$;
  private static final SubLObject $ic138$;
  private static final SubLString $ic139$;
  private static final SubLSymbol $ic140$;
  private static final SubLObject $ic141$;
  private static final SubLString $ic142$;
  private static final SubLString $ic143$;
  private static final SubLString $ic144$;
  private static final SubLString $ic145$;
  private static final SubLString $ic146$;
  private static final SubLString $ic147$;
  private static final SubLString $ic148$;

  public static SubLObject f50988(final SubLObject var1)
  {
    module0797.f50953( oc_cycml_generator.UNPROVIDED );
    f50989( var1 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50990(final SubLObject var2, final SubLObject var3, final SubLObject var4, final SubLObject var5, final SubLObject var6)
  {
    final SubLThread var7 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != Types.consp( var2 ) : var2;
    assert oc_cycml_generator.NIL != Types.integerp( var3 ) : var3;
    assert oc_cycml_generator.NIL != Types.integerp( var4 ) : var4;
    assert oc_cycml_generator.NIL != Types.stringp( var5 ) : var5;
    assert oc_cycml_generator.NIL != Types.consp( var6 ) : var6;
    module0797.f50953( oc_cycml_generator.UNPROVIDED );
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var8 = oc_cycml_generator.$ic4$;
      module0601.f36758( var8, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var9 = module0601.$g4654$.currentBinding( var7 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var7 ) ), var7 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_10 = oc_cycml_generator.$ic5$;
          module0601.f36758( var8_10, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_11 = module0601.$g4654$.currentBinding( var7 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var7 ) ), var7 );
            f50991( var2 );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_11, var7 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_10 );
        }
        f50992( var3, oc_cycml_generator.UNPROVIDED );
        f50993( var4, oc_cycml_generator.UNPROVIDED );
        f50994( var5, oc_cycml_generator.UNPROVIDED );
        if( oc_cycml_generator.NIL != var6 && oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_11 = oc_cycml_generator.$ic6$;
          module0601.f36758( var8_11, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_12 = module0601.$g4654$.currentBinding( var7 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var7 ) ), var7 );
            f50991( var2 );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_12, var7 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_11 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var9, var7 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var7 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var7 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var8 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50995(final SubLObject var14)
  {
    final SubLThread var15 = SubLProcess.currentSubLThread();
    print_high.print( var14, oc_cycml_generator.UNPROVIDED );
    module0797.f50953( oc_cycml_generator.UNPROVIDED );
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var15 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var15 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var16 = oc_cycml_generator.$ic7$;
      module0601.f36758( var16, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var17 = module0601.$g4654$.currentBinding( var15 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var15 ) ), var15 );
        SubLObject var18 = var14;
        SubLObject var19 = oc_cycml_generator.NIL;
        var19 = var18.first();
        while ( oc_cycml_generator.NIL != var18)
        {
          f50996( var19 );
          var18 = var18.rest();
          var19 = var18.first();
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var17, var15 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var15 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var15 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var16 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50997(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic8$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50994(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic9$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50993(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic10$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50992(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic11$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50998(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic12$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50999(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic13$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51000(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic14$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51001(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic15$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51002(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic16$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51003(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic17$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51004(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic18$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51005(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic19$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51006(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic20$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51007(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic21$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51008(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic22$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51009(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic23$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51010(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic24$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51011(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic25$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51012(final SubLObject var17, SubLObject var18)
  {
    if( var18 == oc_cycml_generator.UNPROVIDED )
    {
      var18 = oc_cycml_generator.NIL;
    }
    module0797.f50939( oc_cycml_generator.$ic26$, var17, var18 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51013(final SubLObject var19, final SubLObject var20)
  {
    f51014( var19, var20, oc_cycml_generator.ZERO_INTEGER );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51015(final SubLObject var19)
  {
    return ( var19.getClass() == $sX55592_native.class ) ? oc_cycml_generator.T : oc_cycml_generator.NIL;
  }

  public static SubLObject f51016(final SubLObject var19)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.getField2();
  }

  public static SubLObject f51017(final SubLObject var19)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.getField3();
  }

  public static SubLObject f51018(final SubLObject var19)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.getField4();
  }

  public static SubLObject f51019(final SubLObject var19, final SubLObject var22)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.setField2( var22 );
  }

  public static SubLObject f51020(final SubLObject var19, final SubLObject var22)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.setField3( var22 );
  }

  public static SubLObject f51021(final SubLObject var19, final SubLObject var22)
  {
    assert oc_cycml_generator.NIL != f51015( var19 ) : var19;
    return var19.setField4( var22 );
  }

  public static SubLObject f51022(SubLObject var23)
  {
    if( var23 == oc_cycml_generator.UNPROVIDED )
    {
      var23 = oc_cycml_generator.NIL;
    }
    final SubLObject var24 = new $sX55592_native();
    SubLObject var25;
    SubLObject var26;
    SubLObject var27;
    SubLObject var28;
    for( var25 = oc_cycml_generator.NIL, var25 = var23; oc_cycml_generator.NIL != var25; var25 = conses_high.cddr( var25 ) )
    {
      var26 = var25.first();
      var27 = conses_high.cadr( var25 );
      var28 = var26;
      if( var28.eql( oc_cycml_generator.$ic42$ ) )
      {
        f51019( var24, var27 );
      }
      else if( var28.eql( oc_cycml_generator.$ic43$ ) )
      {
        f51020( var24, var27 );
      }
      else if( var28.eql( oc_cycml_generator.$ic44$ ) )
      {
        f51021( var24, var27 );
      }
      else
      {
        Errors.error( oc_cycml_generator.$ic45$, var26 );
      }
    }
    return var24;
  }

  public static SubLObject f51023(final SubLObject var29, final SubLObject var30)
  {
    Functions.funcall( var30, var29, oc_cycml_generator.$ic46$, oc_cycml_generator.$ic47$, oc_cycml_generator.THREE_INTEGER );
    Functions.funcall( var30, var29, oc_cycml_generator.$ic48$, oc_cycml_generator.$ic42$, f51016( var29 ) );
    Functions.funcall( var30, var29, oc_cycml_generator.$ic48$, oc_cycml_generator.$ic43$, f51017( var29 ) );
    Functions.funcall( var30, var29, oc_cycml_generator.$ic48$, oc_cycml_generator.$ic44$, f51018( var29 ) );
    Functions.funcall( var30, var29, oc_cycml_generator.$ic49$, oc_cycml_generator.$ic47$, oc_cycml_generator.THREE_INTEGER );
    return var29;
  }

  public static SubLObject f51024(final SubLObject var29, final SubLObject var30)
  {
    return f51023( var29, var30 );
  }

  public static SubLObject f51014(final SubLObject var31, final SubLObject var20, final SubLObject var32)
  {
    streams_high.write_string( oc_cycml_generator.$ic51$, var20, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED );
    print_high.prin1( f51016( var31 ), var20 );
    streams_high.terpri( var20 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51025(final SubLObject var1, final SubLObject var33, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var37, SubLObject var38)
  {
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    if( var37 == oc_cycml_generator.UNPROVIDED )
    {
      var37 = oc_cycml_generator.NIL;
    }
    if( var38 == oc_cycml_generator.UNPROVIDED )
    {
      var38 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13477( var33 ) : var33;
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != var37 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var37 ) )
    {
      throw new AssertionError( var37 );
    }
    if( oc_cycml_generator.NIL != var38 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var38 ) )
    {
      throw new AssertionError( var38 );
    }
    SubLObject var39 = f51018( var1 );
    var39 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic54$, var33, var34, var35, var36, var37, var38 ), var39 );
    f51021( var1, var39 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51026(final SubLObject var1, final SubLObject var33, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var37, SubLObject var38)
  {
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    if( var37 == oc_cycml_generator.UNPROVIDED )
    {
      var37 = oc_cycml_generator.NIL;
    }
    if( var38 == oc_cycml_generator.UNPROVIDED )
    {
      var38 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13477( var33 ) : var33;
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != var37 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var37 ) )
    {
      throw new AssertionError( var37 );
    }
    if( oc_cycml_generator.NIL != var38 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var38 ) )
    {
      throw new AssertionError( var38 );
    }
    SubLObject var39 = f51018( var1 );
    var39 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic55$, var33, var34, var35, var36, var37, var38 ), var39 );
    f51021( var1, var39 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51027(final SubLObject var1, final SubLObject var33, final SubLObject var40, SubLObject var35, SubLObject var36)
  {
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13477( var33 ) : var33;
    assert oc_cycml_generator.NIL != module0126.f8389( var40 ) : var40;
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    SubLObject var41 = f51018( var1 );
    var41 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic57$, var33, var40, var35, var36 ), var41 );
    f51021( var1, var41 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51028(final SubLObject var1, final SubLObject var41, final SubLObject var42, SubLObject var35, SubLObject var36)
  {
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13483( var41 ) : var41;
    assert oc_cycml_generator.NIL != module0206.f13483( var42 ) : var42;
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    SubLObject var43 = f51018( var1 );
    var43 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic58$, var41, var42, var35, var36 ), var43 );
    f51021( var1, var43 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51029(final SubLObject var1, final SubLObject var43, SubLObject var34, SubLObject var35, SubLObject var36)
  {
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13483( var43 ) : var43;
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    SubLObject var44 = f51018( var1 );
    var44 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic59$, var43, var34, var35, var36 ), var44 );
    f51021( var1, var44 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51030(final SubLObject var1, final SubLObject var44, SubLObject var45, SubLObject var46, SubLObject var47, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var37,
      SubLObject var38)
  {
    if( var45 == oc_cycml_generator.UNPROVIDED )
    {
      var45 = oc_cycml_generator.NIL;
    }
    if( var46 == oc_cycml_generator.UNPROVIDED )
    {
      var46 = oc_cycml_generator.NIL;
    }
    if( var47 == oc_cycml_generator.UNPROVIDED )
    {
      var47 = oc_cycml_generator.NIL;
    }
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    if( var37 == oc_cycml_generator.UNPROVIDED )
    {
      var37 = oc_cycml_generator.NIL;
    }
    if( var38 == oc_cycml_generator.UNPROVIDED )
    {
      var38 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13425( var44 ) : var44;
    if( oc_cycml_generator.NIL != var45 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var45 ) )
    {
      throw new AssertionError( var45 );
    }
    if( oc_cycml_generator.NIL != var46 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0130.f8507( var46 ) )
    {
      throw new AssertionError( var46 );
    }
    if( oc_cycml_generator.NIL != var47 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0130.f8503( var47 ) )
    {
      throw new AssertionError( var47 );
    }
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != var37 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var37 ) )
    {
      throw new AssertionError( var37 );
    }
    if( oc_cycml_generator.NIL != var38 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var38 ) )
    {
      throw new AssertionError( var38 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var45 )
    {
      var45 = module0178.f11287( var44 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var46 )
    {
      var46 = module0178.f11293( var44 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var47 )
    {
      var47 = module0178.f11291( var44 );
    }
    SubLObject var48 = f51018( var1 );
    var48 = ConsesLow.cons( ConsesLow.list( new SubLObject[] { oc_cycml_generator.$ic63$, var44, var45, var46, var47, var34, var35, var36, var37, var38
    } ), var48 );
    f51021( var1, var48 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51031(final SubLObject var1, final SubLObject var44, SubLObject var45, SubLObject var46, SubLObject var47, SubLObject var34, SubLObject var35, SubLObject var36, SubLObject var37,
      SubLObject var38)
  {
    if( var45 == oc_cycml_generator.UNPROVIDED )
    {
      var45 = oc_cycml_generator.NIL;
    }
    if( var46 == oc_cycml_generator.UNPROVIDED )
    {
      var46 = oc_cycml_generator.NIL;
    }
    if( var47 == oc_cycml_generator.UNPROVIDED )
    {
      var47 = oc_cycml_generator.NIL;
    }
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    if( var37 == oc_cycml_generator.UNPROVIDED )
    {
      var37 = oc_cycml_generator.NIL;
    }
    if( var38 == oc_cycml_generator.UNPROVIDED )
    {
      var38 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13425( var44 ) : var44;
    if( oc_cycml_generator.NIL != var45 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var45 ) )
    {
      throw new AssertionError( var45 );
    }
    if( oc_cycml_generator.NIL != var46 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0130.f8507( var46 ) )
    {
      throw new AssertionError( var46 );
    }
    if( oc_cycml_generator.NIL != var47 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0130.f8503( var47 ) )
    {
      throw new AssertionError( var47 );
    }
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != var37 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var37 ) )
    {
      throw new AssertionError( var37 );
    }
    if( oc_cycml_generator.NIL != var38 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var38 ) )
    {
      throw new AssertionError( var38 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var45 )
    {
      var45 = module0178.f11287( var44 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var46 )
    {
      var46 = module0178.f11293( var44 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var47 )
    {
      var47 = module0178.f11291( var44 );
    }
    SubLObject var48 = f51018( var1 );
    var48 = ConsesLow.cons( ConsesLow.list( new SubLObject[] { oc_cycml_generator.$ic64$, var44, var45, var46, var47, var34, var35, var36, var37, var38
    } ), var48 );
    f51021( var1, var48 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51032(final SubLObject var1, final SubLObject var44, SubLObject var45, SubLObject var34, SubLObject var35, SubLObject var36)
  {
    if( var45 == oc_cycml_generator.UNPROVIDED )
    {
      var45 = oc_cycml_generator.NIL;
    }
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13425( var44 ) : var44;
    if( oc_cycml_generator.NIL != var45 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var45 ) )
    {
      throw new AssertionError( var45 );
    }
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var45 )
    {
      var45 = module0178.f11287( var44 );
    }
    SubLObject var46 = f51018( var1 );
    var46 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic65$, var44, var45, var34, var35, var36 ), var46 );
    f51021( var1, var46 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51033(final SubLObject var1, final SubLObject var44, SubLObject var45, SubLObject var34, SubLObject var35, SubLObject var36)
  {
    if( var45 == oc_cycml_generator.UNPROVIDED )
    {
      var45 = oc_cycml_generator.NIL;
    }
    if( var34 == oc_cycml_generator.UNPROVIDED )
    {
      var34 = oc_cycml_generator.NIL;
    }
    if( var35 == oc_cycml_generator.UNPROVIDED )
    {
      var35 = oc_cycml_generator.NIL;
    }
    if( var36 == oc_cycml_generator.UNPROVIDED )
    {
      var36 = oc_cycml_generator.NIL;
    }
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != module0206.f13425( var44 ) : var44;
    if( oc_cycml_generator.NIL != var45 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var45 ) )
    {
      throw new AssertionError( var45 );
    }
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var44 ) && oc_cycml_generator.NIL == var45 )
    {
      var45 = module0178.f11287( var44 );
    }
    SubLObject var46 = f51018( var1 );
    var46 = ConsesLow.cons( ConsesLow.list( oc_cycml_generator.$ic66$, var44, var45, var34, var35, var36 ), var46 );
    f51021( var1, var46 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51034(final SubLObject var1, final SubLObject var48, final SubLObject var49, final SubLObject var45, final SubLObject var50, final SubLObject var51, final SubLObject var34,
      final SubLObject var35, final SubLObject var36)
  {
    assert oc_cycml_generator.NIL != f51015( var1 ) : var1;
    assert oc_cycml_generator.NIL != constants_high_oc.f10734( var48 ) : var48;
    assert oc_cycml_generator.NIL != Types.consp( var49 ) : var49;
    assert oc_cycml_generator.NIL != module0206.f13483( var45 ) : var45;
    assert oc_cycml_generator.NIL != Types.listp( var50 ) : var50;
    assert oc_cycml_generator.NIL != Types.listp( var51 ) : var51;
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    SubLObject var52 = f51018( var1 );
    var52 = ConsesLow.cons( ConsesLow.list( new SubLObject[] { oc_cycml_generator.$ic69$, var48, var49, var45, var50, var51, var34, var35, var36
    } ), var52 );
    f51021( var1, var52 );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50989(final SubLObject var1)
  {
    final SubLThread var2 = SubLProcess.currentSubLThread();
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var3 = oc_cycml_generator.$ic70$;
      module0601.f36758( var3, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var4 = module0601.$g4654$.currentBinding( var2 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var2 ) ), var2 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_52 = oc_cycml_generator.$ic71$;
          module0601.f36758( var8_52, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_53 = module0601.$g4654$.currentBinding( var2 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var2 ) ), var2 );
            f51004( f51016( var1 ), oc_cycml_generator.UNPROVIDED );
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
              final SubLObject var8_53 = oc_cycml_generator.$ic72$;
              module0601.f36758( var8_53, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
              final SubLObject var9_54 = module0601.$g4654$.currentBinding( var2 );
              try
              {
                module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var2 ) ), var2 );
                SubLObject var5 = f51017( var1 );
                SubLObject var6 = oc_cycml_generator.NIL;
                var6 = var5.first();
                while ( oc_cycml_generator.NIL != var5)
                {
                  f51004( var6, oc_cycml_generator.UNPROVIDED );
                  var5 = var5.rest();
                  var6 = var5.first();
                }
              }
              finally
              {
                module0601.$g4654$.rebind( var9_54, var2 );
              }
              if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
              {
                PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
                module0797.f50937();
              }
              module0601.f36760( var8_53 );
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_53, var2 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_52 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_54 = oc_cycml_generator.$ic73$;
          module0601.f36758( var8_54, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_55 = module0601.$g4654$.currentBinding( var2 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var2 ) ), var2 );
            SubLObject var7 = Sequences.reverse( f51018( var1 ) );
            SubLObject var8 = oc_cycml_generator.NIL;
            var8 = var7.first();
            while ( oc_cycml_generator.NIL != var7)
            {
              f51035( var8 );
              var7 = var7.rest();
              var8 = var7.first();
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_55, var2 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_54 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var4, var2 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var2 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var2 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var3 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51035(final SubLObject var59)
  {
    final SubLObject var61;
    final SubLObject var60 = var61 = var59.first();
    if( var61.eql( oc_cycml_generator.$ic54$ ) )
    {
      f51036( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic55$ ) )
    {
      f51037( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic57$ ) )
    {
      f51038( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic58$ ) )
    {
      f51039( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic59$ ) )
    {
      f51040( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic63$ ) )
    {
      f51041( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic64$ ) )
    {
      f51042( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic65$ ) )
    {
      f51043( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic66$ ) )
    {
      f51044( var59.rest() );
    }
    else if( var61.eql( oc_cycml_generator.$ic69$ ) )
    {
      f51045( var59.rest() );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51036(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    SubLObject var68 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic74$ );
    var63 = var61.first();
    SubLObject var69 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var64 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var65 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var66 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var67 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var68 = var69.first();
    var69 = var69.rest();
    if( oc_cycml_generator.NIL == var69 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var70 = oc_cycml_generator.$ic75$;
        module0601.f36758( var70, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var71 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51046( var63 );
          f51047( var64, var65, var66, var67, var68 );
        }
        finally
        {
          module0601.$g4654$.rebind( var71, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var70 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic74$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51037(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    SubLObject var68 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic74$ );
    var63 = var61.first();
    SubLObject var69 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var64 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var65 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var66 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var67 = var69.first();
    var69 = var69.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var69, var61, oc_cycml_generator.$ic74$ );
    var68 = var69.first();
    var69 = var69.rest();
    if( oc_cycml_generator.NIL == var69 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var70 = oc_cycml_generator.$ic76$;
        module0601.f36758( var70, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var71 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51046( var63 );
          f51047( var64, var65, var66, var67, var68 );
        }
        finally
        {
          module0601.$g4654$.rebind( var71, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var70 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic74$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51038(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic77$ );
    var63 = var61.first();
    SubLObject var67 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic77$ );
    var64 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic77$ );
    var65 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic77$ );
    var66 = var67.first();
    var67 = var67.rest();
    if( oc_cycml_generator.NIL == var67 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var68 = oc_cycml_generator.$ic78$;
        module0601.f36758( var68, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var69 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51046( var63 );
          f51000( var64, oc_cycml_generator.UNPROVIDED );
          f51047( oc_cycml_generator.NIL, var65, var66, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var69, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var68 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic77$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51039(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic79$ );
    var63 = var61.first();
    SubLObject var67 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic79$ );
    var64 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic79$ );
    var65 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic79$ );
    var66 = var67.first();
    var67 = var67.rest();
    if( oc_cycml_generator.NIL == var67 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var68 = oc_cycml_generator.$ic80$;
        module0601.f36758( var68, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var69 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51048( var63 );
          f51048( var64 );
          f51047( oc_cycml_generator.NIL, var65, var66, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var69, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var68 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic79$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51040(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic81$ );
    var63 = var61.first();
    SubLObject var67 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic81$ );
    var64 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic81$ );
    var65 = var67.first();
    var67 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var67, var61, oc_cycml_generator.$ic81$ );
    var66 = var67.first();
    var67 = var67.rest();
    if( oc_cycml_generator.NIL == var67 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var68 = oc_cycml_generator.$ic82$;
        module0601.f36758( var68, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var69 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51048( var63 );
          f51047( var64, var65, var66, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var69, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var68 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic81$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51041(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    SubLObject var68 = oc_cycml_generator.NIL;
    SubLObject var69 = oc_cycml_generator.NIL;
    SubLObject var70 = oc_cycml_generator.NIL;
    SubLObject var71 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic83$ );
    var63 = var61.first();
    SubLObject var72 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var64 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var65 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var66 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var67 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var68 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var69 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var70 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var71 = var72.first();
    var72 = var72.rest();
    if( oc_cycml_generator.NIL == var72 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var73 = oc_cycml_generator.$ic84$;
        module0601.f36758( var73, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var74 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51049( var63 );
          module0797.f50959( module0770.f49049( var63, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED,
              oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED ),
              oc_cycml_generator.$ic85$ );
          f51050( var64 );
          module0797.f50962( var65 );
          module0797.f50963( var66 );
          f51047( var67, var68, var69, var70, var71 );
        }
        finally
        {
          module0601.$g4654$.rebind( var74, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var73 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic83$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51042(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    SubLObject var68 = oc_cycml_generator.NIL;
    SubLObject var69 = oc_cycml_generator.NIL;
    SubLObject var70 = oc_cycml_generator.NIL;
    SubLObject var71 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic83$ );
    var63 = var61.first();
    SubLObject var72 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var64 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var65 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var66 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var67 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var68 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var69 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var70 = var72.first();
    var72 = var72.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var72, var61, oc_cycml_generator.$ic83$ );
    var71 = var72.first();
    var72 = var72.rest();
    if( oc_cycml_generator.NIL == var72 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var73 = oc_cycml_generator.$ic86$;
        module0601.f36758( var73, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var74 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51049( var63 );
          f51050( var64 );
          module0797.f50962( var65 );
          module0797.f50963( var66 );
          f51047( var67, var68, var69, var70, var71 );
        }
        finally
        {
          module0601.$g4654$.rebind( var74, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var73 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic83$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51043(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic87$ );
    var63 = var61.first();
    SubLObject var68 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var64 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var65 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var66 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var67 = var68.first();
    var68 = var68.rest();
    if( oc_cycml_generator.NIL == var68 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var69 = oc_cycml_generator.$ic88$;
        module0601.f36758( var69, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var70 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51049( var63 );
          f51050( var64 );
          f51047( var65, var66, var67, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var70, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var69 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic87$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51044(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic87$ );
    var63 = var61.first();
    SubLObject var68 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var64 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var65 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var66 = var68.first();
    var68 = var68.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var68, var61, oc_cycml_generator.$ic87$ );
    var67 = var68.first();
    var68 = var68.rest();
    if( oc_cycml_generator.NIL == var68 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var69 = oc_cycml_generator.$ic89$;
        module0601.f36758( var69, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var70 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          f51049( var63 );
          f51050( var64 );
          f51047( var65, var66, var67, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var70, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var69 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic87$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51045(final SubLObject var61)
  {
    final SubLThread var62 = SubLProcess.currentSubLThread();
    SubLObject var63 = oc_cycml_generator.NIL;
    SubLObject var64 = oc_cycml_generator.NIL;
    SubLObject var65 = oc_cycml_generator.NIL;
    SubLObject var66 = oc_cycml_generator.NIL;
    SubLObject var67 = oc_cycml_generator.NIL;
    SubLObject var68 = oc_cycml_generator.NIL;
    SubLObject var69 = oc_cycml_generator.NIL;
    SubLObject var70 = oc_cycml_generator.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var61, var61, oc_cycml_generator.$ic90$ );
    var63 = var61.first();
    SubLObject var71 = var61.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var64 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var65 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var66 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var67 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var68 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var69 = var71.first();
    var71 = var71.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var71, var61, oc_cycml_generator.$ic90$ );
    var70 = var71.first();
    var71 = var71.rest();
    if( oc_cycml_generator.NIL == var71 )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var72 = oc_cycml_generator.$ic91$;
        module0601.f36758( var72, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var73 = module0601.$g4654$.currentBinding( var62 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
          module0797.f50941( var63, oc_cycml_generator.UNPROVIDED );
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
            final SubLObject var8_82 = oc_cycml_generator.$ic92$;
            module0601.f36758( var8_82, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
            final SubLObject var9_83 = module0601.$g4654$.currentBinding( var62 );
            try
            {
              module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
              f50991( var64 );
            }
            finally
            {
              module0601.$g4654$.rebind( var9_83, var62 );
            }
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
            }
            module0601.f36760( var8_82 );
          }
          f51050( var65 );
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
            final SubLObject var8_83 = oc_cycml_generator.$ic93$;
            module0601.f36758( var8_83, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
            final SubLObject var9_84 = module0601.$g4654$.currentBinding( var62 );
            try
            {
              module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
              f50991( var66 );
            }
            finally
            {
              module0601.$g4654$.rebind( var9_84, var62 );
            }
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
            }
            module0601.f36760( var8_83 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
            final SubLObject var8_84 = oc_cycml_generator.$ic94$;
            module0601.f36758( var8_84, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
            final SubLObject var9_85 = module0601.$g4654$.currentBinding( var62 );
            try
            {
              module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var62 ) ), var62 );
              f50991( var67 );
            }
            finally
            {
              module0601.$g4654$.rebind( var9_85, var62 );
            }
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
            }
            module0601.f36760( var8_84 );
          }
          f51047( var68, var69, var70, oc_cycml_generator.NIL, oc_cycml_generator.NIL );
        }
        finally
        {
          module0601.$g4654$.rebind( var73, var62 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var62 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var62 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var72 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var61, oc_cycml_generator.$ic90$ );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51047(final SubLObject var34, final SubLObject var35, final SubLObject var36, final SubLObject var37, final SubLObject var38)
  {
    final SubLThread var39 = SubLProcess.currentSubLThread();
    if( oc_cycml_generator.NIL != var34 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var34 ) )
    {
      throw new AssertionError( var34 );
    }
    if( oc_cycml_generator.NIL != var35 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.stringp( var35 ) )
    {
      throw new AssertionError( var35 );
    }
    if( oc_cycml_generator.NIL != var36 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == Types.integerp( var36 ) )
    {
      throw new AssertionError( var36 );
    }
    if( oc_cycml_generator.NIL != var37 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0051.f3631( var37 ) )
    {
      throw new AssertionError( var37 );
    }
    if( oc_cycml_generator.NIL != var38 && !oc_cycml_generator.areAssertionsDisabledFor( me ) && oc_cycml_generator.NIL == module0206.f13483( var38 ) )
    {
      throw new AssertionError( var38 );
    }
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var40 = oc_cycml_generator.$ic96$;
      module0601.f36758( var40, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var41 = module0601.$g4654$.currentBinding( var39 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var39 ) ), var39 );
        if( oc_cycml_generator.NIL != var34 && oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_88 = oc_cycml_generator.$ic97$;
          module0601.f36758( var8_88, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_89 = module0601.$g4654$.currentBinding( var39 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var39 ) ), var39 );
            f51046( var34 );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_89, var39 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_88 );
        }
        if( oc_cycml_generator.NIL != var35 )
        {
          f51003( var35, oc_cycml_generator.UNPROVIDED );
        }
        if( oc_cycml_generator.NIL != var36 )
        {
          f51051( var36 );
        }
        if( oc_cycml_generator.NIL != var37 )
        {
          f51052( var37 );
        }
        if( oc_cycml_generator.NIL != var38 )
        {
          f51053( var38 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var41, var39 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var40 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51050(final SubLObject var90)
  {
    final SubLThread var91 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13483( var90 ) : var90;
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var91 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var91 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var92 = oc_cycml_generator.$ic98$;
      module0601.f36758( var92, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var93 = module0601.$g4654$.currentBinding( var91 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var91 ) ), var91 );
        if( oc_cycml_generator.NIL != module0206.f13477( var90 ) )
        {
          f51046( var90 );
        }
        else
        {
          f51054( var90 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var93, var91 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var91 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var91 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var92 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51048(final SubLObject var90)
  {
    assert oc_cycml_generator.NIL != module0206.f13483( var90 ) : var90;
    if( oc_cycml_generator.NIL != module0206.f13477( var90 ) )
    {
      f51046( var90 );
    }
    else if( oc_cycml_generator.NIL != module0167.f10813( var90 ) )
    {
      f51055( var90 );
    }
    else
    {
      f51054( var90 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51046(final SubLObject var33)
  {
    final SubLThread var34 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13477( var33 ) : var33;
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var34 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var34 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var35 = oc_cycml_generator.$ic99$;
      module0601.f36758( var35, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var36 = module0601.$g4654$.currentBinding( var34 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var34 ) ), var34 );
        module0797.f50943( constants_high_oc.f10772( var33 ), oc_cycml_generator.UNPROVIDED );
        f51010( constants_high_oc.f10771( var33 ), oc_cycml_generator.UNPROVIDED );
        module0797.f50941( constants_high_oc.f10757( var33 ), oc_cycml_generator.UNPROVIDED );
        f51009( Sequences.cconcatenate( oc_cycml_generator.$ic100$, Guids.guid_to_string( constants_high_oc.f10744( var33 ) ) ), oc_cycml_generator.UNPROVIDED );
      }
      finally
      {
        module0601.$g4654$.rebind( var36, var34 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var34 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var34 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var35 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51055(final SubLObject var91)
  {
    final SubLThread var92 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13484( var91 ) : var91;
    if( oc_cycml_generator.NIL == Errors.$ignore_mustsP$.getDynamicValue( var92 ) && oc_cycml_generator.NIL == module0167.f10813( var91 ) && ( !var91.isList() || oc_cycml_generator.NIL == module0167.f10813( var91 ) ) )
    {
      Errors.error( oc_cycml_generator.$ic102$, var91 );
    }
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var93 = oc_cycml_generator.$ic103$;
      module0601.f36758( var93, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var94 = module0601.$g4654$.currentBinding( var92 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_92 = oc_cycml_generator.$ic104$;
          module0601.f36758( var8_92, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_93 = module0601.$g4654$.currentBinding( var92 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
            f51056( module0205.f13276( var91 ) );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_93, var92 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_92 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_93 = oc_cycml_generator.$ic105$;
          module0601.f36758( var8_93, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_94 = module0601.$g4654$.currentBinding( var92 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
            SubLObject var95 = module0205.f13304( var91, oc_cycml_generator.UNPROVIDED );
            SubLObject var96 = oc_cycml_generator.NIL;
            var96 = var95.first();
            while ( oc_cycml_generator.NIL != var95)
            {
              f51056( var96 );
              var95 = var95.rest();
              var96 = var95.first();
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_94, var92 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_93 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var94, var92 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var93 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51054(final SubLObject var91)
  {
    final SubLThread var92 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13484( var91 ) : var91;
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var93 = oc_cycml_generator.$ic106$;
      module0601.f36758( var93, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var94 = module0601.$g4654$.currentBinding( var92 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_97 = oc_cycml_generator.$ic104$;
          module0601.f36758( var8_97, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_98 = module0601.$g4654$.currentBinding( var92 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
            f51056( module0205.f13276( var91 ) );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_98, var92 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_97 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_98 = oc_cycml_generator.$ic105$;
          module0601.f36758( var8_98, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_99 = module0601.$g4654$.currentBinding( var92 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var92 ) ), var92 );
            SubLObject var95 = module0205.f13304( var91, oc_cycml_generator.UNPROVIDED );
            SubLObject var96 = oc_cycml_generator.NIL;
            var96 = var95.first();
            while ( oc_cycml_generator.NIL != var95)
            {
              f51056( var96 );
              var95 = var95.rest();
              var96 = var95.first();
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_99, var92 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_98 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var94, var92 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var92 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var92 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var93 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51057(final SubLObject var101)
  {
    final SubLThread var102 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13453( var101 ) : var101;
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var103 = oc_cycml_generator.$ic108$;
      module0601.f36758( var103, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var104 = module0601.$g4654$.currentBinding( var102 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var102 ) ), var102 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_102 = oc_cycml_generator.$ic104$;
          module0601.f36758( var8_102, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_103 = module0601.$g4654$.currentBinding( var102 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var102 ) ), var102 );
            f51056( module0205.f13276( var101 ) );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_103, var102 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_102 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_103 = oc_cycml_generator.$ic105$;
          module0601.f36758( var8_103, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_104 = module0601.$g4654$.currentBinding( var102 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var102 ) ), var102 );
            SubLObject var105 = module0205.f13304( var101, oc_cycml_generator.UNPROVIDED );
            SubLObject var106 = oc_cycml_generator.NIL;
            var106 = var105.first();
            while ( oc_cycml_generator.NIL != var105)
            {
              f51056( var106 );
              var105 = var105.rest();
              var106 = var105.first();
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_104, var102 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_103 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var104, var102 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var102 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var102 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var103 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51058(final SubLObject var106, final SubLObject var107)
  {
    final SubLObject var108 = var106.rest();
    final SubLObject var110;
    final SubLObject var109 = var110 = var108;
    return ConsesLow.listS( oc_cycml_generator.$ic109$, oc_cycml_generator.$ic110$, ConsesLow.append( var110, oc_cycml_generator.NIL ) );
  }

  public static SubLObject f51056(final SubLObject var111)
  {
    if( oc_cycml_generator.NIL != module0206.f13438( var111 ) )
    {
      f51008( var111, oc_cycml_generator.UNPROVIDED );
    }
    else if( var111.isSymbol() )
    {
      f51005( var111, oc_cycml_generator.UNPROVIDED );
    }
    else if( oc_cycml_generator.NIL != module0167.f10813( var111 ) )
    {
      f51055( var111 );
    }
    else if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var111 ) )
    {
      f51049( module0178.f11303( var111 ) );
    }
    else if( oc_cycml_generator.NIL != Guids.guid_p( var111 ) )
    {
      module0797.f50941( var111, oc_cycml_generator.UNPROVIDED );
    }
    else if( var111.isNumber() )
    {
      f51007( var111, oc_cycml_generator.UNPROVIDED );
    }
    else if( var111.isString() )
    {
      f51006( var111, oc_cycml_generator.UNPROVIDED );
    }
    else if( var111.eql( oc_cycml_generator.$ic111$ ) )
    {
      f51012( oc_cycml_generator.$ic112$, oc_cycml_generator.UNPROVIDED );
    }
    else if( var111.eql( oc_cycml_generator.$ic113$ ) )
    {
      f51011( oc_cycml_generator.$ic112$, oc_cycml_generator.UNPROVIDED );
    }
    else if( oc_cycml_generator.NIL != module0206.f13477( var111 ) )
    {
      f51046( var111 );
    }
    else if( !var111.isList() && oc_cycml_generator.NIL != module0206.f13453( var111 ) )
    {
      f51054( var111 );
    }
    else if( var111.isList() && oc_cycml_generator.NIL != module0206.f13453( var111 ) )
    {
      f51057( var111 );
    }
    else if( var111.isList() && oc_cycml_generator.NIL != module0207.f13509( var111 ) )
    {
      f51049( var111 );
    }
    else if( var111.isList() )
    {
      f50991( var111 );
    }
    else
    {
      Errors.error( oc_cycml_generator.$ic114$, var111 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51059(final SubLObject var111)
  {
    final SubLThread var112 = SubLProcess.currentSubLThread();
    SubLObject var113 = oc_cycml_generator.NIL;
    SubLObject var114 = oc_cycml_generator.NIL;
    try
    {
      var114 = streams_high.make_private_string_output_stream();
      final SubLObject var115 = module0587.$g4457$.currentBinding( var112 );
      try
      {
        module0587.$g4457$.bind( var114, var112 );
        f51056( var111 );
      }
      finally
      {
        module0587.$g4457$.rebind( var115, var112 );
      }
      var113 = streams_high.get_output_stream_string( var114 );
    }
    finally
    {
      final SubLObject var116 = Threads.$is_thread_performing_cleanupP$.currentBinding( var112 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( oc_cycml_generator.T, var112 );
        streams_high.close( var114, oc_cycml_generator.UNPROVIDED );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var116, var112 );
      }
    }
    return var113;
  }

  public static SubLObject f50991(final SubLObject var114)
  {
    final SubLThread var115 = SubLProcess.currentSubLThread();
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var115 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var115 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var116 = oc_cycml_generator.$ic116$;
      module0601.f36758( var116, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var117 = module0601.$g4654$.currentBinding( var115 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var115 ) ), var115 );
        SubLObject var118;
        for( var118 = oc_cycml_generator.NIL, var118 = var114; var118.isCons(); var118 = var118.rest() )
        {
          f51056( var118.first() );
        }
        if( oc_cycml_generator.NIL != var118 && oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var115 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var115 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_116 = oc_cycml_generator.$ic117$;
          module0601.f36758( var8_116, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_117 = module0601.$g4654$.currentBinding( var115 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var115 ) ), var115 );
            f51056( var118 );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_117, var115 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var115 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var115 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_116 );
        }
      }
      finally
      {
        module0601.$g4654$.rebind( var117, var115 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var115 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var115 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var116 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51049(final SubLObject var118)
  {
    final SubLThread var119 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13425( var118 ) : var118;
    final SubLObject var120 = module0205.f13351( var118 );
    if( var120.eql( oc_cycml_generator.$ic118$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic119$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51049( module0205.f13352( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic120$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic121$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          SubLObject var123 = module0205.f13350( var118 );
          SubLObject var124 = oc_cycml_generator.NIL;
          var124 = var123.first();
          while ( oc_cycml_generator.NIL != var123)
          {
            f51049( var124 );
            var123 = var123.rest();
            var124 = var123.first();
          }
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic122$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic123$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          SubLObject var123 = module0205.f13350( var118 );
          SubLObject var124 = oc_cycml_generator.NIL;
          var124 = var123.first();
          while ( oc_cycml_generator.NIL != var123)
          {
            f51049( var124 );
            var123 = var123.rest();
            var124 = var123.first();
          }
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic124$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic125$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51049( module0205.f13352( var118 ) );
          f51049( module0205.f13353( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic126$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic127$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51049( module0205.f13352( var118 ) );
          f51049( module0205.f13353( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic128$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic129$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51049( module0205.f13352( var118 ) );
          f51049( module0205.f13353( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic130$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic131$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          module0797.f50947( module0205.f13352( var118 ), oc_cycml_generator.UNPROVIDED );
          f51049( module0205.f13353( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic132$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic133$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51008( module0205.f13352( var118 ), oc_cycml_generator.UNPROVIDED );
          f51049( module0205.f13353( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic134$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic135$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51007( module0205.f13352( var118 ), oc_cycml_generator.UNPROVIDED );
          f51008( module0205.f13353( var118 ), oc_cycml_generator.UNPROVIDED );
          f51049( module0205.f13354( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic136$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic137$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51007( module0205.f13352( var118 ), oc_cycml_generator.UNPROVIDED );
          f51008( module0205.f13353( var118 ), oc_cycml_generator.UNPROVIDED );
          f51049( module0205.f13354( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else if( var120.eql( oc_cycml_generator.$ic138$ ) )
    {
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var121 = oc_cycml_generator.$ic139$;
        module0601.f36758( var121, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var122 = module0601.$g4654$.currentBinding( var119 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var119 ) ), var119 );
          f51007( module0205.f13352( var118 ), oc_cycml_generator.UNPROVIDED );
          f51008( module0205.f13353( var118 ), oc_cycml_generator.UNPROVIDED );
          f51049( module0205.f13354( var118 ) );
        }
        finally
        {
          module0601.$g4654$.rebind( var122, var119 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var119 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var119 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var121 );
      }
    }
    else
    {
      f51060( var118 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51060(final SubLObject var121)
  {
    final SubLThread var122 = SubLProcess.currentSubLThread();
    assert oc_cycml_generator.NIL != module0206.f13433( var121 ) : var121;
    final SubLObject var123 = module0205.f13351( var121 );
    final SubLObject var124 = oc_cycml_generator.$g6373$.currentBinding( var122 );
    try
    {
      oc_cycml_generator.$g6373$.bind( oc_cycml_generator.T, var122 );
      if( oc_cycml_generator.NIL != module0259.f16854( var123, oc_cycml_generator.$ic141$, oc_cycml_generator.UNPROVIDED, oc_cycml_generator.UNPROVIDED ) )
      {
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var125 = constants_high_oc.f10743( var123 );
          module0601.f36758( var125, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_123 = module0601.$g4654$.currentBinding( var122 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var122 ) ), var122 );
            SubLObject var126 = module0205.f13350( var121 );
            SubLObject var127 = oc_cycml_generator.NIL;
            var127 = var126.first();
            while ( oc_cycml_generator.NIL != var126)
            {
              f51056( var127 );
              var126 = var126.rest();
              var127 = var126.first();
            }
          }
          finally
          {
            module0601.$g4654$.rebind( var9_123, var122 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var125 );
        }
      }
      else if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
        final SubLObject var125 = oc_cycml_generator.$ic142$;
        module0601.f36758( var125, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
        final SubLObject var9_124 = module0601.$g4654$.currentBinding( var122 );
        try
        {
          module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var122 ) ), var122 );
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
            final SubLObject var8_125 = oc_cycml_generator.$ic143$;
            module0601.f36758( var8_125, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
            final SubLObject var9_125 = module0601.$g4654$.currentBinding( var122 );
            try
            {
              module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var122 ) ), var122 );
              f51056( module0205.f13351( var121 ) );
            }
            finally
            {
              module0601.$g4654$.rebind( var9_125, var122 );
            }
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
            }
            module0601.f36760( var8_125 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
            final SubLObject var8_126 = oc_cycml_generator.$ic105$;
            module0601.f36758( var8_126, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
            final SubLObject var9_126 = module0601.$g4654$.currentBinding( var122 );
            try
            {
              module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var122 ) ), var122 );
              SubLObject var128 = module0205.f13350( var121 );
              SubLObject var129 = oc_cycml_generator.NIL;
              var129 = var128.first();
              while ( oc_cycml_generator.NIL != var128)
              {
                f51056( var129 );
                var128 = var128.rest();
                var129 = var128.first();
              }
            }
            finally
            {
              module0601.$g4654$.rebind( var9_126, var122 );
            }
            if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
            {
              PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
              module0797.f50937();
            }
            module0601.f36760( var8_126 );
          }
        }
        finally
        {
          module0601.$g4654$.rebind( var9_124, var122 );
        }
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var122 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var122 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
        }
        module0601.f36760( var125 );
      }
    }
    finally
    {
      oc_cycml_generator.$g6373$.rebind( var124, var122 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51053(final SubLObject var38)
  {
    final SubLThread var39 = SubLProcess.currentSubLThread();
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var40 = oc_cycml_generator.$ic144$;
      module0601.f36758( var40, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var41 = module0601.$g4654$.currentBinding( var39 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var39 ) ), var39 );
        f51046( var38 );
      }
      finally
      {
        module0601.$g4654$.rebind( var41, var39 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var39 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var39 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var40 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51051(final SubLObject var130)
  {
    final SubLThread var131 = SubLProcess.currentSubLThread();
    var131.resetMultipleValues();
    final SubLObject var132 = module0051.f3613( var130 );
    final SubLObject var133 = var131.secondMultipleValue();
    final SubLObject var134 = var131.thirdMultipleValue();
    var131.resetMultipleValues();
    final SubLObject var135 = PrintLow.format( oc_cycml_generator.NIL, oc_cycml_generator.$ic145$, new SubLObject[] { var134, var133, var132
    } );
    f51001( var135, oc_cycml_generator.UNPROVIDED );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51052(final SubLObject var135)
  {
    assert oc_cycml_generator.NIL != module0051.f3631( var135 ) : var135;
    final SubLObject var136 = PrintLow.format( oc_cycml_generator.NIL, oc_cycml_generator.$ic146$, var135 );
    f51002( var136, oc_cycml_generator.UNPROVIDED );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f50996(final SubLObject var16)
  {
    if( oc_cycml_generator.NIL != assertion_handles_oc.f11035( var16 ) )
    {
      f51049( module0289.f19396( var16 ) );
    }
    else
    {
      f51061( var16 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51061(final SubLObject var137)
  {
    final SubLThread var138 = SubLProcess.currentSubLThread();
    if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var138 ) )
    {
      PrintLow.format( module0587.$g4457$.getDynamicValue( var138 ), oc_cycml_generator.$ic3$ );
      module0797.f50937();
      final SubLObject var139 = oc_cycml_generator.$ic147$;
      module0601.f36758( var139, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
      final SubLObject var140 = module0601.$g4654$.currentBinding( var138 );
      try
      {
        module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var138 ) ), var138 );
        if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var138 ) )
        {
          PrintLow.format( module0587.$g4457$.getDynamicValue( var138 ), oc_cycml_generator.$ic3$ );
          module0797.f50937();
          final SubLObject var8_138 = oc_cycml_generator.$ic148$;
          module0601.f36758( var8_138, oc_cycml_generator.NIL, oc_cycml_generator.NIL, oc_cycml_generator.UNPROVIDED );
          final SubLObject var9_139 = module0601.$g4654$.currentBinding( var138 );
          try
          {
            module0601.$g4654$.bind( module0048.f_1X( module0601.$g4654$.getDynamicValue( var138 ) ), var138 );
            f51005( module0191.f11965( var137 ), oc_cycml_generator.UNPROVIDED );
          }
          finally
          {
            module0601.$g4654$.rebind( var9_139, var138 );
          }
          if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var138 ) )
          {
            PrintLow.format( module0587.$g4457$.getDynamicValue( var138 ), oc_cycml_generator.$ic3$ );
            module0797.f50937();
          }
          module0601.f36760( var8_138 );
        }
        f51049( module0191.f11967( var137 ) );
        f51050( module0191.f11976( var137 ) );
        f50997( module0191.f11978( var137 ), oc_cycml_generator.UNPROVIDED );
        module0797.f50962( module0191.f11980( var137 ) );
      }
      finally
      {
        module0601.$g4654$.rebind( var140, var138 );
      }
      if( oc_cycml_generator.NIL != module0797.$g6369$.getDynamicValue( var138 ) )
      {
        PrintLow.format( module0587.$g4457$.getDynamicValue( var138 ), oc_cycml_generator.$ic3$ );
        module0797.f50937();
      }
      module0601.f36760( var139 );
    }
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51062()
  {
    SubLFiles.declareFunction( myName, "f50988", "S#55594", 1, 0, false );
    SubLFiles.declareFunction( myName, "f50990", "S#55595", 5, 0, false );
    SubLFiles.declareFunction( myName, "f50995", "S#55596", 1, 0, false );
    SubLFiles.declareFunction( myName, "f50997", "S#55597", 1, 1, false );
    SubLFiles.declareFunction( myName, "f50994", "S#55598", 1, 1, false );
    SubLFiles.declareFunction( myName, "f50993", "S#55599", 1, 1, false );
    SubLFiles.declareFunction( myName, "f50992", "S#55600", 1, 1, false );
    SubLFiles.declareFunction( myName, "f50998", "S#55601", 1, 1, false );
    SubLFiles.declareFunction( myName, "f50999", "S#55602", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51000", "S#55603", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51001", "S#55604", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51002", "S#55605", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51003", "S#55606", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51004", "S#55607", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51005", "S#55608", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51006", "S#55609", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51007", "S#55610", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51008", "S#55611", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51009", "S#55612", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51010", "S#55613", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51011", "S#55614", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51012", "S#55615", 1, 1, false );
    SubLFiles.declareFunction( myName, "f51013", "S#55616", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51015", "S#55593", 1, 0, false );
    new $f51015$UnaryFunction();
    SubLFiles.declareFunction( myName, "f51016", "S#55617", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51017", "S#55618", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51018", "S#55619", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51019", "S#55620", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51020", "S#55621", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51021", "S#55622", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51022", "S#55623", 0, 1, false );
    SubLFiles.declareFunction( myName, "f51023", "S#55624", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51024", "S#55625", 2, 0, false );
    SubLFiles.declareFunction( myName, "f51014", "S#55626", 3, 0, false );
    SubLFiles.declareFunction( myName, "f51025", "S#55627", 2, 5, false );
    SubLFiles.declareFunction( myName, "f51026", "S#55628", 2, 5, false );
    SubLFiles.declareFunction( myName, "f51027", "S#55629", 3, 2, false );
    SubLFiles.declareFunction( myName, "f51028", "S#55630", 3, 2, false );
    SubLFiles.declareFunction( myName, "f51029", "S#55631", 2, 3, false );
    SubLFiles.declareFunction( myName, "f51030", "S#55632", 2, 8, false );
    SubLFiles.declareFunction( myName, "f51031", "S#55633", 2, 8, false );
    SubLFiles.declareFunction( myName, "f51032", "S#55634", 2, 4, false );
    SubLFiles.declareFunction( myName, "f51033", "S#55635", 2, 4, false );
    SubLFiles.declareFunction( myName, "f51034", "S#55636", 9, 0, false );
    SubLFiles.declareFunction( myName, "f50989", "S#55637", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51035", "S#55638", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51036", "S#55639", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51037", "S#55640", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51038", "S#55641", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51039", "S#55642", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51040", "S#55643", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51041", "S#55644", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51042", "S#55645", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51043", "S#55646", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51044", "S#55647", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51045", "S#55648", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51047", "S#43025", 5, 0, false );
    SubLFiles.declareFunction( myName, "f51050", "S#55649", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51048", "S#43022", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51046", "S#55650", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51055", "S#55651", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51054", "S#55652", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51057", "S#55653", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.oc_cycml_generator", "f51058", "S#55654" );
    SubLFiles.declareFunction( myName, "f51056", "S#48560", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51059", "CYCML-SERIALIZE-OBJECT-TO-STRING", 1, 0, false );
    SubLFiles.declareFunction( myName, "f50991", "S#55655", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51049", "S#55656", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51060", "S#55657", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51053", "S#55658", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51051", "S#55659", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51052", "S#55660", 1, 0, false );
    SubLFiles.declareFunction( myName, "f50996", "S#55661", 1, 0, false );
    SubLFiles.declareFunction( myName, "f51061", "S#55662", 1, 0, false );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51063()
  {
    oc_cycml_generator.$g6372$ = SubLFiles.defconstant( "S#55663", oc_cycml_generator.$ic27$ );
    oc_cycml_generator.$g6373$ = SubLFiles.defparameter( "S#55664", oc_cycml_generator.NIL );
    return oc_cycml_generator.NIL;
  }

  public static SubLObject f51064()
  {
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), oc_cycml_generator.$g6372$.getGlobalValue(), Symbols.symbol_function( oc_cycml_generator.$ic34$ ) );
    SubLSpecialOperatorDeclarations.proclaim( oc_cycml_generator.$ic35$ );
    Structures.def_csetf( oc_cycml_generator.$ic36$, oc_cycml_generator.$ic37$ );
    Structures.def_csetf( oc_cycml_generator.$ic38$, oc_cycml_generator.$ic39$ );
    Structures.def_csetf( oc_cycml_generator.$ic40$, oc_cycml_generator.$ic41$ );
    Equality.identity( oc_cycml_generator.$ic27$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), oc_cycml_generator.$g6372$.getGlobalValue(), Symbols.symbol_function( oc_cycml_generator.$ic50$ ) );
    module0002.f38( oc_cycml_generator.$ic115$ );
    return oc_cycml_generator.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f51062();
  }

  @Override
  public void initializeVariables()
  {
    f51063();
  }

  @Override
  public void runTopLevelForms()
  {
    f51064();
  }
  static
  {
    me = new oc_cycml_generator();
    oc_cycml_generator.$g6372$ = null;
    oc_cycml_generator.$g6373$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "CONSP" );
    $ic1$ = SubLObjectFactory.makeSymbol( "INTEGERP" );
    $ic2$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic3$ = SubLObjectFactory.makeString( "~&" );
    $ic4$ = SubLObjectFactory.makeString( "api-request-message" );
    $ic5$ = SubLObjectFactory.makeString( "api-request" );
    $ic6$ = SubLObjectFactory.makeString( "api-request-bindings" );
    $ic7$ = SubLObjectFactory.makeString( "justification" );
    $ic8$ = SubLObjectFactory.makeString( "truth" );
    $ic9$ = SubLObjectFactory.makeString( "api-request-requestor" );
    $ic10$ = SubLObjectFactory.makeString( "api-request-priority" );
    $ic11$ = SubLObjectFactory.makeString( "api-request-id" );
    $ic12$ = SubLObjectFactory.makeString( "nonnegativeinteger" );
    $ic13$ = SubLObjectFactory.makeString( "positiveinteger" );
    $ic14$ = SubLObjectFactory.makeString( "new-name" );
    $ic15$ = SubLObjectFactory.makeString( "date" );
    $ic16$ = SubLObjectFactory.makeString( "time" );
    $ic17$ = SubLObjectFactory.makeString( "cyc-image-id" );
    $ic18$ = SubLObjectFactory.makeString( "knowledge-package-id" );
    $ic19$ = SubLObjectFactory.makeString( "sublsymbol" );
    $ic20$ = SubLObjectFactory.makeString( "sublstring" );
    $ic21$ = SubLObjectFactory.makeString( "sublrealnumber" );
    $ic22$ = SubLObjectFactory.makeString( "cyclvariable" );
    $ic23$ = SubLObjectFactory.makeString( "uri" );
    $ic24$ = SubLObjectFactory.makeString( "namespace" );
    $ic25$ = SubLObjectFactory.makeString( "false" );
    $ic26$ = SubLObjectFactory.makeString( "true" );
    $ic27$ = SubLObjectFactory.makeSymbol( "S#55592", "CYC" );
    $ic28$ = SubLObjectFactory.makeSymbol( "S#55593", "CYC" );
    $ic29$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#55665", "CYC" ), SubLObjectFactory.makeSymbol( "S#55666", "CYC" ), SubLObjectFactory.makeSymbol( "S#55667", "CYC" ) );
    $ic30$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "KNOWLEDGE-PACKAGE-ID" ), SubLObjectFactory.makeKeyword( "KNOWLEDGE-PACKAGE-DEPENDENCIES" ), SubLObjectFactory
        .makeKeyword( "OPERATIONS" ) );
    $ic31$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#55617", "CYC" ), SubLObjectFactory.makeSymbol( "S#55618", "CYC" ), SubLObjectFactory.makeSymbol( "S#55619", "CYC" ) );
    $ic32$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#55620", "CYC" ), SubLObjectFactory.makeSymbol( "S#55621", "CYC" ), SubLObjectFactory.makeSymbol( "S#55622", "CYC" ) );
    $ic33$ = SubLObjectFactory.makeSymbol( "S#55626", "CYC" );
    $ic34$ = SubLObjectFactory.makeSymbol( "S#55616", "CYC" );
    $ic35$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "S#55593", "CYC" ) );
    $ic36$ = SubLObjectFactory.makeSymbol( "S#55617", "CYC" );
    $ic37$ = SubLObjectFactory.makeSymbol( "S#55620", "CYC" );
    $ic38$ = SubLObjectFactory.makeSymbol( "S#55618", "CYC" );
    $ic39$ = SubLObjectFactory.makeSymbol( "S#55621", "CYC" );
    $ic40$ = SubLObjectFactory.makeSymbol( "S#55619", "CYC" );
    $ic41$ = SubLObjectFactory.makeSymbol( "S#55622", "CYC" );
    $ic42$ = SubLObjectFactory.makeKeyword( "KNOWLEDGE-PACKAGE-ID" );
    $ic43$ = SubLObjectFactory.makeKeyword( "KNOWLEDGE-PACKAGE-DEPENDENCIES" );
    $ic44$ = SubLObjectFactory.makeKeyword( "OPERATIONS" );
    $ic45$ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $ic46$ = SubLObjectFactory.makeKeyword( "BEGIN" );
    $ic47$ = SubLObjectFactory.makeSymbol( "S#55623", "CYC" );
    $ic48$ = SubLObjectFactory.makeKeyword( "SLOT" );
    $ic49$ = SubLObjectFactory.makeKeyword( "END" );
    $ic50$ = SubLObjectFactory.makeSymbol( "S#55625", "CYC" );
    $ic51$ = SubLObjectFactory.makeString( "#<CYCML-KP-INFO:" );
    $ic52$ = SubLObjectFactory.makeSymbol( "CYCL-CONSTANT-P" );
    $ic53$ = SubLObjectFactory.makeSymbol( "S#16329", "CYC" );
    $ic54$ = SubLObjectFactory.makeKeyword( "CREATE" );
    $ic55$ = SubLObjectFactory.makeKeyword( "FIND-OR-CREATE" );
    $ic56$ = SubLObjectFactory.makeSymbol( "VALID-CONSTANT-NAME-P" );
    $ic57$ = SubLObjectFactory.makeKeyword( "RENAME" );
    $ic58$ = SubLObjectFactory.makeKeyword( "MERGE" );
    $ic59$ = SubLObjectFactory.makeKeyword( "KILL" );
    $ic60$ = SubLObjectFactory.makeSymbol( "CYCL-SENTENCE-P" );
    $ic61$ = SubLObjectFactory.makeSymbol( "EL-STRENGTH-P" );
    $ic62$ = SubLObjectFactory.makeSymbol( "DIRECTION-P" );
    $ic63$ = SubLObjectFactory.makeKeyword( "ASSERT" );
    $ic64$ = SubLObjectFactory.makeKeyword( "REASSERT" );
    $ic65$ = SubLObjectFactory.makeKeyword( "UNASSERT" );
    $ic66$ = SubLObjectFactory.makeKeyword( "BLAST" );
    $ic67$ = SubLObjectFactory.makeSymbol( "S#13484", "CYC" );
    $ic68$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic69$ = SubLObjectFactory.makeKeyword( "CREATE-SKOLEM" );
    $ic70$ = SubLObjectFactory.makeString( "cycml" );
    $ic71$ = SubLObjectFactory.makeString( "knowledge-package" );
    $ic72$ = SubLObjectFactory.makeString( "knowledge-package-dependencies" );
    $ic73$ = SubLObjectFactory.makeString( "operations" );
    $ic74$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ), SubLObjectFactory.makeSymbol( "S#710", "CYC" ), SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ),
        SubLObjectFactory.makeSymbol( "S#55668", "CYC" ), SubLObjectFactory.makeSymbol( "S#55669", "CYC" ), SubLObjectFactory.makeSymbol( "S#38841", "CYC" ) );
    $ic75$ = SubLObjectFactory.makeString( "create" );
    $ic76$ = SubLObjectFactory.makeString( "find-or-create" );
    $ic77$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ), SubLObjectFactory.makeSymbol( "S#13498", "CYC" ), SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ),
        SubLObjectFactory.makeSymbol( "S#55668", "CYC" ) );
    $ic78$ = SubLObjectFactory.makeString( "rename" );
    $ic79$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#12115", "CYC" ), SubLObjectFactory.makeSymbol( "S#12116", "CYC" ), SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ),
        SubLObjectFactory.makeSymbol( "S#55668", "CYC" ) );
    $ic80$ = SubLObjectFactory.makeString( "merge" );
    $ic81$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10466", "CYC" ), SubLObjectFactory.makeSymbol( "S#710", "CYC" ), SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ),
        SubLObjectFactory.makeSymbol( "S#55668", "CYC" ) );
    $ic82$ = SubLObjectFactory.makeString( "kill" );
    $ic83$ = ConsesLow.list( new SubLObject[] { SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ), SubLObjectFactory.makeSymbol( "S#13918", "CYC" ), SubLObjectFactory
        .makeSymbol( "S#5432", "CYC" ), SubLObjectFactory.makeSymbol( "S#710", "CYC" ), SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ), SubLObjectFactory.makeSymbol( "S#55668", "CYC" ), SubLObjectFactory.makeSymbol(
            "S#55669", "CYC" ), SubLObjectFactory.makeSymbol( "S#38841", "CYC" )
    } );
    $ic84$ = SubLObjectFactory.makeString( "assert" );
    $ic85$ = ConsesLow.list( SubLObjectFactory.makeString( "lang" ), SubLObjectFactory.makeString( "en" ) );
    $ic86$ = SubLObjectFactory.makeString( "reassert" );
    $ic87$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ), SubLObjectFactory.makeSymbol( "S#710", "CYC" ),
        SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ), SubLObjectFactory.makeSymbol( "S#55668", "CYC" ) );
    $ic88$ = SubLObjectFactory.makeString( "unassert" );
    $ic89$ = SubLObjectFactory.makeString( "blast" );
    $ic90$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10596", "CYC" ), SubLObjectFactory.makeSymbol( "S#21772", "CYC" ), SubLObjectFactory.makeSymbol( "S#11445", "CYC" ),
        SubLObjectFactory.makeSymbol( "S#21903", "CYC" ), SubLObjectFactory.makeSymbol( "S#17704", "CYC" ), SubLObjectFactory.makeSymbol( "S#710", "CYC" ),
        SubLObjectFactory.makeSymbol( "CYC-IMAGE-ID" ), SubLObjectFactory.makeSymbol( "S#55668", "CYC" ) );
    $ic91$ = SubLObjectFactory.makeString( "create-skolem" );
    $ic92$ = SubLObjectFactory.makeString( "skolem-unreified-term" );
    $ic93$ = SubLObjectFactory.makeString( "skolem-conjunctive-normal-form" );
    $ic94$ = SubLObjectFactory.makeString( "skolem-arg-types" );
    $ic95$ = SubLObjectFactory.makeSymbol( "S#5028", "CYC" );
    $ic96$ = SubLObjectFactory.makeString( "bookkeeping-info" );
    $ic97$ = SubLObjectFactory.makeString( "Cyclist" );
    $ic98$ = SubLObjectFactory.makeString( "Microtheory" );
    $ic99$ = SubLObjectFactory.makeString( "CycLConstant" );
    $ic100$ = SubLObjectFactory.makeString( "urn:uuid:" );
    $ic101$ = SubLObjectFactory.makeSymbol( "CYCL-NART-P" );
    $ic102$ = SubLObjectFactory.makeString( "~S is not a reified nart" );
    $ic103$ = SubLObjectFactory.makeString( "CycLReifiedNonAtomicTerm" );
    $ic104$ = SubLObjectFactory.makeString( "Function-Denotational" );
    $ic105$ = SubLObjectFactory.makeString( "argument-list" );
    $ic106$ = SubLObjectFactory.makeString( "CycLReifiableNonAtomicTerm" );
    $ic107$ = SubLObjectFactory.makeSymbol( "S#12628", "CYC" );
    $ic108$ = SubLObjectFactory.makeString( "ELNonAtomicTerm" );
    $ic109$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic110$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#55664", "CYC" ), oc_cycml_generator.T ) );
    $ic111$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "True" ) );
    $ic112$ = SubLObjectFactory.makeString( "" );
    $ic113$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "False" ) );
    $ic114$ = SubLObjectFactory.makeString( "~ is unknown type for CycML serialization." );
    $ic115$ = SubLObjectFactory.makeSymbol( "CYCML-SERIALIZE-OBJECT-TO-STRING" );
    $ic116$ = SubLObjectFactory.makeString( "SubLList" );
    $ic117$ = SubLObjectFactory.makeString( "dotted-item" );
    $ic118$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "not" ) );
    $ic119$ = SubLObjectFactory.makeString( "not" );
    $ic120$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "and" ) );
    $ic121$ = SubLObjectFactory.makeString( "and" );
    $ic122$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "or" ) );
    $ic123$ = SubLObjectFactory.makeString( "or" );
    $ic124$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "xor" ) );
    $ic125$ = SubLObjectFactory.makeString( "xor" );
    $ic126$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "implies" ) );
    $ic127$ = SubLObjectFactory.makeString( "implies" );
    $ic128$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "equiv" ) );
    $ic129$ = SubLObjectFactory.makeString( "equiv" );
    $ic130$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "forAll" ) );
    $ic131$ = SubLObjectFactory.makeString( "forAll" );
    $ic132$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "thereExists" ) );
    $ic133$ = SubLObjectFactory.makeString( "thereExists" );
    $ic134$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "thereExistExactly" ) );
    $ic135$ = SubLObjectFactory.makeString( "thereExistExactly" );
    $ic136$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "thereExistAtMost" ) );
    $ic137$ = SubLObjectFactory.makeString( "thereExistAtMost" );
    $ic138$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "thereExistAtLeast" ) );
    $ic139$ = SubLObjectFactory.makeString( "thereExistAtLeast" );
    $ic140$ = SubLObjectFactory.makeSymbol( "S#15527", "CYC" );
    $ic141$ = constant_handles_oc.f8479( SubLObjectFactory.makeString( "OpenCycDefinitionalPredicate" ) );
    $ic142$ = SubLObjectFactory.makeString( "CycLAtomicSentence" );
    $ic143$ = SubLObjectFactory.makeString( "Predicate" );
    $ic144$ = SubLObjectFactory.makeString( "purpose" );
    $ic145$ = SubLObjectFactory.makeString( "~A-~A-~A" );
    $ic146$ = SubLObjectFactory.makeString( "~6,'0D" );
    $ic147$ = SubLObjectFactory.makeString( "hl-support" );
    $ic148$ = SubLObjectFactory.makeString( "module-token" );
  }

  public static final class $sX55592_native extends SubLStructNative
  {
    public SubLObject $knowledge_package_id;
    public SubLObject $knowledge_package_dependencies;
    public SubLObject $operations;
    private static final SubLStructDeclNative structDecl;

    public $sX55592_native()
    {
      this.$knowledge_package_id = CommonSymbols.NIL;
      this.$knowledge_package_dependencies = CommonSymbols.NIL;
      this.$operations = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX55592_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$knowledge_package_id;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$knowledge_package_dependencies;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$operations;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$knowledge_package_id = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$knowledge_package_dependencies = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$operations = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sX55592_native.class, oc_cycml_generator.$ic27$, oc_cycml_generator.$ic28$, oc_cycml_generator.$ic29$, oc_cycml_generator.$ic30$, new String[] {
        "$knowledge_package_id", "$knowledge_package_dependencies", "$operations"
      }, oc_cycml_generator.$ic31$, oc_cycml_generator.$ic32$, oc_cycml_generator.$ic33$ );
    }
  }

  public static final class $f51015$UnaryFunction extends UnaryFunction
  {
    public $f51015$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#55593" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var21)
    {
      return oc_cycml_generator.f51015( var21 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/oc_cycml_generator.class Total time: 730 ms synthetic Decompiled
 * with Procyon 0.5.32.
 */