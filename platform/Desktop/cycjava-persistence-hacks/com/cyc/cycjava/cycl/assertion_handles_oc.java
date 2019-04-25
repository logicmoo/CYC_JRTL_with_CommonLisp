package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertion_handles_oc extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertion_handles_oc";
  public static final String myFingerPrint = "116fb9c5fd729af49e850c2749a9968f076c2291b421547a52e386966eee6b74";
  private static SubLSymbol $g2193$;
  public static SubLSymbol $g2194$;
  public static SubLSymbol $g2195$;
  private static final SubLSymbol $ic0$;
  private static final SubLList $ic1$;
  private static final SubLString $ic2$;
  private static final SubLList $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLList $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLString $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLString $ic15$;
  private static final SubLList $ic16$;
  private static final SubLSymbol $ic17$;
  private static final SubLString $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLList $ic21$;
  private static final SubLList $ic22$;
  private static final SubLSymbol $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLList $ic25$;
  private static final SubLSymbol $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLList $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLInteger $ic32$;
  private static final SubLList $ic33$;
  private static final SubLList $ic34$;
  private static final SubLList $ic35$;
  private static final SubLList $ic36$;
  private static final SubLSymbol $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLList $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLString $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLString $ic49$;
  private static final SubLString $ic50$;
  private static final SubLString $ic51$;
  private static final SubLInteger $ic52$;
  private static final SubLSymbol $ic53$;
  private static final SubLList $ic54$;
  private static final SubLString $ic55$;
  private static final SubLList $ic56$;
  private static final SubLSymbol $ic57$;
  private static final SubLString $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLList $ic60$;
  private static final SubLString $ic61$;
  private static final SubLList $ic62$;
  private static final SubLSymbol $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLString $ic65$;
  private static final SubLList $ic66$;
  private static final SubLList $ic67$;

  public static SubLObject f11008()
  {
    return module0065.f4764( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11009(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic1$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = assertion_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic1$ );
    var6 = var4.first();
    var4 = var4.rest();
    final SubLObject var7 = var4.isCons() ? var4.first() : assertion_handles_oc.$ic2$;
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, assertion_handles_oc.$ic1$ );
    var4 = var4.rest();
    SubLObject var8 = assertion_handles_oc.NIL;
    SubLObject var9 = var4;
    SubLObject var10 = assertion_handles_oc.NIL;
    SubLObject var11_12 = assertion_handles_oc.NIL;
    while ( assertion_handles_oc.NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, assertion_handles_oc.$ic1$ );
      var11_12 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, assertion_handles_oc.$ic1$ );
      if( assertion_handles_oc.NIL == conses_high.member( var11_12, assertion_handles_oc.$ic3$, assertion_handles_oc.UNPROVIDED, assertion_handles_oc.UNPROVIDED ) )
      {
        var10 = assertion_handles_oc.T;
      }
      if( var11_12 == assertion_handles_oc.$ic4$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( assertion_handles_oc.NIL != var10 && assertion_handles_oc.NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, assertion_handles_oc.$ic1$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( assertion_handles_oc.$ic5$, var4 );
    final SubLObject var12 = ( assertion_handles_oc.NIL != var11 ) ? conses_high.cadr( var11 ) : assertion_handles_oc.NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( assertion_handles_oc.$ic6$, ConsesLow.list( var6, assertion_handles_oc.$ic7$, assertion_handles_oc.$ic8$, var7,
        assertion_handles_oc.$ic5$, var12 ), ConsesLow.append( var13, assertion_handles_oc.NIL ) );
  }

  public static SubLObject f11010()
  {
    return assertion_handles_oc.$g2193$.getGlobalValue();
  }

  public static SubLObject f11011(final SubLObject var16, final SubLObject var17)
  {
    if( assertion_handles_oc.NIL != assertion_handles_oc.$g2193$.getGlobalValue() )
    {
      return assertion_handles_oc.NIL;
    }
    assertion_handles_oc.$g2193$.setGlobalValue( module0065.f4745( var16, assertion_handles_oc.ZERO_INTEGER ) );
    return assertion_handles_oc.T;
  }

  public static SubLObject f11012(SubLObject var18)
  {
    if( var18 == assertion_handles_oc.UNPROVIDED )
    {
      var18 = assertion_handles_oc.NIL;
    }
    f11013( var18 );
    if( assertion_handles_oc.NIL == var18 )
    {
      f11014();
      oc_assertion_manager.f11105( f11015() );
    }
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11014()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = Storage.$current_area$.currentBinding( var19 );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), var19 );
      module0065.f4760( assertion_handles_oc.$g2193$.getGlobalValue(), assertion_handles_oc.UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( var20, var19 );
    }
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11016()
  {
    return module0065.f4762( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11017()
  {
    return module0065.f4794( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11018()
  {
    return module0065.f4797( f11010() );
  }

  public static SubLObject f11019()
  {
    if( assertion_handles_oc.NIL == assertion_handles_oc.$g2193$.getGlobalValue() )
    {
      return assertion_handles_oc.ZERO_INTEGER;
    }
    return module0065.f4733( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11020(final SubLObject var21)
  {
    return module0065.f4750( assertion_handles_oc.$g2193$.getGlobalValue(), var21, assertion_handles_oc.UNPROVIDED );
  }

  public static SubLObject f11021()
  {
    return module0065.f4734( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11015()
  {
    return module0065.f4739( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11022()
  {
    return module0065.f4736( f11010() );
  }

  public static SubLObject f11023()
  {
    return Numbers.subtract( f11019(), f11022() );
  }

  public static SubLObject f11024()
  {
    final SubLObject var22 = oc_assertion_manager.f11115();
    return module0065.f4799( f11010(), assertion_handles_oc.$ic17$, var22 );
  }

  public static SubLObject f11013(SubLObject var18)
  {
    if( var18 == assertion_handles_oc.UNPROVIDED )
    {
      var18 = assertion_handles_oc.NIL;
    }
    final SubLThread var19 = SubLProcess.currentSubLThread();
    SubLObject var20 = assertion_handles_oc.MINUS_ONE_INTEGER;
    if( assertion_handles_oc.NIL != var18 )
    {
      var20 = var18;
    }
    else
    {
      final SubLObject var21 = f11010();
      final SubLObject var22 = assertion_handles_oc.$ic18$;
      final SubLObject var23 = module0065.f4733( var21 );
      SubLObject var24 = assertion_handles_oc.ZERO_INTEGER;
      assert assertion_handles_oc.NIL != Types.stringp( var22 ) : var22;
      final SubLObject var25 = module0012.$g75$.currentBinding( var19 );
      final SubLObject var26 = module0012.$g76$.currentBinding( var19 );
      final SubLObject var27 = module0012.$g77$.currentBinding( var19 );
      final SubLObject var28 = module0012.$g78$.currentBinding( var19 );
      try
      {
        module0012.$g75$.bind( assertion_handles_oc.ZERO_INTEGER, var19 );
        module0012.$g76$.bind( assertion_handles_oc.NIL, var19 );
        module0012.$g77$.bind( assertion_handles_oc.T, var19 );
        module0012.$g78$.bind( Time.get_universal_time(), var19 );
        module0012.f478( var22 );
        final SubLObject var31_32 = var21;
        if( assertion_handles_oc.NIL == module0065.f4772( var31_32, assertion_handles_oc.$ic20$ ) )
        {
          final SubLObject var33_34 = var31_32;
          if( assertion_handles_oc.NIL == module0065.f4775( var33_34, assertion_handles_oc.$ic20$ ) )
          {
            final SubLObject var29 = module0065.f4740( var33_34 );
            final SubLObject var30 = assertion_handles_oc.NIL;
            SubLObject var31;
            SubLObject var32;
            SubLObject var33;
            SubLObject var34;
            for( var31 = Sequences.length( var29 ), var32 = assertion_handles_oc.NIL, var32 = assertion_handles_oc.ZERO_INTEGER; var32.numL( var31 ); var32 = Numbers.add( var32,
                assertion_handles_oc.ONE_INTEGER ) )
            {
              var33 = ( ( assertion_handles_oc.NIL != var30 ) ? Numbers.subtract( var31, var32, assertion_handles_oc.ONE_INTEGER ) : var32 );
              var34 = Vectors.aref( var29, var33 );
              if( assertion_handles_oc.NIL == module0065.f4749( var34 ) || assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) )
              {
                if( assertion_handles_oc.NIL != module0065.f4749( var34 ) )
                {
                  var34 = assertion_handles_oc.$ic20$;
                }
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, assertion_handles_oc.ONE_INTEGER );
                var20 = Numbers.max( var20, f11025( var34 ) );
              }
            }
          }
          final SubLObject var41_42 = var31_32;
          if( assertion_handles_oc.NIL == module0065.f4777( var41_42 ) || assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) )
          {
            final SubLObject var35 = module0065.f4738( var41_42 );
            SubLObject var36 = module0065.f4739( var41_42 );
            final SubLObject var37 = module0065.f4734( var41_42 );
            final SubLObject var38 = ( assertion_handles_oc.NIL != module0065.f4773( assertion_handles_oc.$ic20$ ) ) ? assertion_handles_oc.NIL : assertion_handles_oc.$ic20$;
            while ( var36.numL( var37 ))
            {
              final SubLObject var39 = Hashtables.gethash_without_values( var36, var35, var38 );
              if( assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) || assertion_handles_oc.NIL == module0065.f4749( var39 ) )
              {
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, assertion_handles_oc.ONE_INTEGER );
                var20 = Numbers.max( var20, f11025( var39 ) );
              }
              var36 = Numbers.add( var36, assertion_handles_oc.ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var28, var19 );
        module0012.$g77$.rebind( var27, var19 );
        module0012.$g76$.rebind( var26, var19 );
        module0012.$g75$.rebind( var25, var19 );
      }
    }
    final SubLObject var40 = Numbers.add( var20, assertion_handles_oc.ONE_INTEGER );
    module0065.f4741( assertion_handles_oc.$g2193$.getGlobalValue(), var40 );
    return var40;
  }

  public static SubLObject f11026(final SubLObject var40, final SubLObject var21)
  {
    f11027( var40, var21 );
    module0065.f4753( assertion_handles_oc.$g2193$.getGlobalValue(), var21, var40 );
    return var40;
  }

  public static SubLObject f11028(final SubLObject var21)
  {
    return module0065.f4761( assertion_handles_oc.$g2193$.getGlobalValue(), var21 );
  }

  public static SubLObject f11029()
  {
    return module0065.f4746( assertion_handles_oc.$g2193$.getGlobalValue() );
  }

  public static SubLObject f11030(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic21$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = assertion_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic21$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = assertion_handles_oc.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = assertion_handles_oc.NIL;
    SubLObject var53_54 = assertion_handles_oc.NIL;
    while ( assertion_handles_oc.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, assertion_handles_oc.$ic21$ );
      var53_54 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, assertion_handles_oc.$ic21$ );
      if( assertion_handles_oc.NIL == conses_high.member( var53_54, assertion_handles_oc.$ic22$, assertion_handles_oc.UNPROVIDED, assertion_handles_oc.UNPROVIDED ) )
      {
        var9 = assertion_handles_oc.T;
      }
      if( var53_54 == assertion_handles_oc.$ic4$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( assertion_handles_oc.NIL != var9 && assertion_handles_oc.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, assertion_handles_oc.$ic21$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( assertion_handles_oc.$ic8$, var4 );
    final SubLObject var11 = ( assertion_handles_oc.NIL != var10 ) ? conses_high.cadr( var10 ) : assertion_handles_oc.NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( assertion_handles_oc.$ic5$, var4 );
    final SubLObject var13 = ( assertion_handles_oc.NIL != var12 ) ? conses_high.cadr( var12 ) : assertion_handles_oc.NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = assertion_handles_oc.$ic23$;
    return ConsesLow.list( assertion_handles_oc.$ic24$, ConsesLow.list( reader.bq_cons( var15, assertion_handles_oc.$ic25$ ) ), ConsesLow.listS(
        assertion_handles_oc.$ic26$, ConsesLow.list( var6, assertion_handles_oc.$ic7$, var15, assertion_handles_oc.$ic8$, var11,
            assertion_handles_oc.$ic5$, var13 ), ConsesLow.append( var14, assertion_handles_oc.NIL ) ) );
  }

  public static SubLObject f11031(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic21$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = assertion_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, assertion_handles_oc.$ic21$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = assertion_handles_oc.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = assertion_handles_oc.NIL;
    SubLObject var64_65 = assertion_handles_oc.NIL;
    while ( assertion_handles_oc.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, assertion_handles_oc.$ic21$ );
      var64_65 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, assertion_handles_oc.$ic21$ );
      if( assertion_handles_oc.NIL == conses_high.member( var64_65, assertion_handles_oc.$ic22$, assertion_handles_oc.UNPROVIDED, assertion_handles_oc.UNPROVIDED ) )
      {
        var9 = assertion_handles_oc.T;
      }
      if( var64_65 == assertion_handles_oc.$ic4$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( assertion_handles_oc.NIL != var9 && assertion_handles_oc.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, assertion_handles_oc.$ic21$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( assertion_handles_oc.$ic8$, var4 );
    final SubLObject var11 = ( assertion_handles_oc.NIL != var10 ) ? conses_high.cadr( var10 ) : assertion_handles_oc.NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( assertion_handles_oc.$ic5$, var4 );
    final SubLObject var13 = ( assertion_handles_oc.NIL != var12 ) ? conses_high.cadr( var12 ) : assertion_handles_oc.NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = assertion_handles_oc.$ic27$;
    return ConsesLow.list( assertion_handles_oc.$ic24$, ConsesLow.list( reader.bq_cons( var15, assertion_handles_oc.$ic28$ ) ), ConsesLow.listS(
        assertion_handles_oc.$ic29$, ConsesLow.list( var6, assertion_handles_oc.$ic7$, var15, assertion_handles_oc.$ic8$, var11,
            assertion_handles_oc.$ic5$, var13 ), ConsesLow.append( var14, assertion_handles_oc.NIL ) ) );
  }

  public static SubLObject f11032()
  {
    if( assertion_handles_oc.NIL != Filesys.directory_p( module0107.f7598() ) )
    {
      return oc_dumper.f38047( module0107.f7598() );
    }
    return assertion_handles_oc.ZERO_INTEGER;
  }

  public static SubLObject f11033(final SubLObject var69, final SubLObject var70)
  {
    f11034( var69, var70, assertion_handles_oc.ZERO_INTEGER );
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11035(final SubLObject var69)
  {
    return ( var69.getClass() == $sX12582_native.class ) ? assertion_handles_oc.T : assertion_handles_oc.NIL;
  }

  public static SubLObject f11036(final SubLObject var69)
  {
    assert assertion_handles_oc.NIL != f11035( var69 ) : var69;
    return var69.getField2();
  }

  public static SubLObject f11037(final SubLObject var69, final SubLObject var72)
  {
    assert assertion_handles_oc.NIL != f11035( var69 ) : var69;
    return var69.setField2( var72 );
  }

  public static SubLObject f11038(SubLObject var73)
  {
    if( var73 == assertion_handles_oc.UNPROVIDED )
    {
      var73 = assertion_handles_oc.NIL;
    }
    final SubLObject var74 = new $sX12582_native();
    SubLObject var75;
    SubLObject var76;
    SubLObject var77;
    SubLObject var78;
    for( var75 = assertion_handles_oc.NIL, var75 = var73; assertion_handles_oc.NIL != var75; var75 = conses_high.cddr( var75 ) )
    {
      var76 = var75.first();
      var77 = conses_high.cadr( var75 );
      var78 = var76;
      if( var78.eql( assertion_handles_oc.$ic42$ ) )
      {
        f11037( var74, var77 );
      }
      else
      {
        Errors.error( assertion_handles_oc.$ic43$, var76 );
      }
    }
    return var74;
  }

  public static SubLObject f11039(final SubLObject var79, final SubLObject var80)
  {
    Functions.funcall( var80, var79, assertion_handles_oc.$ic44$, assertion_handles_oc.$ic45$, assertion_handles_oc.ONE_INTEGER );
    Functions.funcall( var80, var79, assertion_handles_oc.$ic46$, assertion_handles_oc.$ic42$, f11036( var79 ) );
    Functions.funcall( var80, var79, assertion_handles_oc.$ic47$, assertion_handles_oc.$ic45$, assertion_handles_oc.ONE_INTEGER );
    return var79;
  }

  public static SubLObject f11040(final SubLObject var79, final SubLObject var80)
  {
    return f11039( var79, var80 );
  }

  public static SubLObject f11034(final SubLObject var81, final SubLObject var70, final SubLObject var82)
  {
    final SubLThread var83 = SubLProcess.currentSubLThread();
    if( assertion_handles_oc.NIL != f11041( var81, assertion_handles_oc.UNPROVIDED ) )
    {
      final SubLObject var84 = module0178.f11286( var81 );
      if( assertion_handles_oc.NIL != var84 )
      {
        final SubLObject var85 = module0018.$g582$.currentBinding( var83 );
        final SubLObject var86 = module0018.$g583$.currentBinding( var83 );
        try
        {
          module0018.$g582$.bind( module0178.f11294( var81 ), var83 );
          module0018.$g583$.bind( module0178.f11292( var81 ), var83 );
          final SubLObject var87 = ( assertion_handles_oc.NIL != assertion_handles_oc.$g2195$.getDynamicValue( var83 ) ) ? module0279.f18587( var84, assertion_handles_oc.UNPROVIDED )
              : module0232.f15328( var84, module0018.$g583$.getDynamicValue( var83 ) );
          final SubLObject var88 = module0178.f11287( var81 );
          PrintLow.format( var70, assertion_handles_oc.$ic49$, var87, var88 );
        }
        finally
        {
          module0018.$g583$.rebind( var86, var83 );
          module0018.$g582$.rebind( var85, var83 );
        }
      }
      else
      {
        final SubLObject var89 = f11025( var81 );
        PrintLow.format( var70, assertion_handles_oc.$ic50$, var89 );
      }
    }
    else if( var81.eql( module0338.f22683() ) )
    {
      PrintLow.format( var70, assertion_handles_oc.$ic51$ );
    }
    else
    {
      compatibility.default_struct_print_function( var81, var70, var82 );
    }
    return var81;
  }

  public static SubLObject f11042(final SubLObject var81)
  {
    final SubLObject var82 = f11036( var81 );
    if( var82.isInteger() )
    {
      return var82;
    }
    return assertion_handles_oc.$ic52$;
  }

  public static SubLObject f11043()
  {
    SubLObject var40 = assertion_handles_oc.NIL;
    var40 = f11038( assertion_handles_oc.UNPROVIDED );
    return var40;
  }

  public static SubLObject f11044(final SubLObject var40)
  {
    f11037( var40, assertion_handles_oc.NIL );
    return var40;
  }

  public static SubLObject f11045(final SubLObject var81)
  {
    return SubLObjectFactory.makeBoolean( assertion_handles_oc.NIL != f11035( var81 ) && assertion_handles_oc.NIL != f11046( var81 ) );
  }

  public static SubLObject f11041(final SubLObject var40, SubLObject var87)
  {
    if( var87 == assertion_handles_oc.UNPROVIDED )
    {
      var87 = assertion_handles_oc.NIL;
    }
    return f11045( var40 );
  }

  public static SubLObject f11047(final SubLObject var40)
  {
    return SubLObjectFactory.makeBoolean( assertion_handles_oc.NIL != f11045( var40 ) && assertion_handles_oc.NIL != module0035.sublisp_boolean( oc_assertion_manager.f11114( f11025( var40 ) ) ) );
  }

  public static SubLObject f11048(final SubLObject var81)
  {
    return Types.integerp( var81 );
  }

  public static SubLObject f11049(SubLObject var21)
  {
    if( var21 == assertion_handles_oc.UNPROVIDED )
    {
      var21 = assertion_handles_oc.NIL;
    }
    if( assertion_handles_oc.NIL == var21 )
    {
      var21 = f11029();
    }
    assert assertion_handles_oc.NIL != Types.fixnump( var21 ) : var21;
    final SubLObject var22 = f11043();
    f11026( var22, var21 );
    return var22;
  }

  public static SubLObject f11050()
  {
    return f11043();
  }

  public static SubLObject f11051()
  {
    return f11049( assertion_handles_oc.UNPROVIDED );
  }

  public static SubLObject f11052()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = f11010();
    final SubLObject var21 = assertion_handles_oc.$ic58$;
    final SubLObject var22 = module0065.f4733( var20 );
    SubLObject var23 = assertion_handles_oc.ZERO_INTEGER;
    assert assertion_handles_oc.NIL != Types.stringp( var21 ) : var21;
    final SubLObject var24 = module0012.$g75$.currentBinding( var19 );
    final SubLObject var25 = module0012.$g76$.currentBinding( var19 );
    final SubLObject var26 = module0012.$g77$.currentBinding( var19 );
    final SubLObject var27 = module0012.$g78$.currentBinding( var19 );
    try
    {
      module0012.$g75$.bind( assertion_handles_oc.ZERO_INTEGER, var19 );
      module0012.$g76$.bind( assertion_handles_oc.NIL, var19 );
      module0012.$g77$.bind( assertion_handles_oc.T, var19 );
      module0012.$g78$.bind( Time.get_universal_time(), var19 );
      module0012.f478( var21 );
      final SubLObject var31_88 = var20;
      if( assertion_handles_oc.NIL == module0065.f4772( var31_88, assertion_handles_oc.$ic20$ ) )
      {
        final SubLObject var33_89 = var31_88;
        if( assertion_handles_oc.NIL == module0065.f4775( var33_89, assertion_handles_oc.$ic20$ ) )
        {
          final SubLObject var28 = module0065.f4740( var33_89 );
          final SubLObject var29 = assertion_handles_oc.NIL;
          SubLObject var30;
          SubLObject var31;
          SubLObject var32;
          SubLObject var33;
          for( var30 = Sequences.length( var28 ), var31 = assertion_handles_oc.NIL, var31 = assertion_handles_oc.ZERO_INTEGER; var31.numL( var30 ); var31 = Numbers.add( var31,
              assertion_handles_oc.ONE_INTEGER ) )
          {
            var32 = ( ( assertion_handles_oc.NIL != var29 ) ? Numbers.subtract( var30, var31, assertion_handles_oc.ONE_INTEGER ) : var31 );
            var33 = Vectors.aref( var28, var32 );
            if( assertion_handles_oc.NIL == module0065.f4749( var33 ) || assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) )
            {
              if( assertion_handles_oc.NIL != module0065.f4749( var33 ) )
              {
                var33 = assertion_handles_oc.$ic20$;
              }
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, assertion_handles_oc.ONE_INTEGER );
              f11044( var33 );
            }
          }
        }
        final SubLObject var41_90 = var31_88;
        if( assertion_handles_oc.NIL == module0065.f4777( var41_90 ) || assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) )
        {
          final SubLObject var34 = module0065.f4738( var41_90 );
          SubLObject var35 = module0065.f4739( var41_90 );
          final SubLObject var36 = module0065.f4734( var41_90 );
          final SubLObject var37 = ( assertion_handles_oc.NIL != module0065.f4773( assertion_handles_oc.$ic20$ ) ) ? assertion_handles_oc.NIL : assertion_handles_oc.$ic20$;
          while ( var35.numL( var36 ))
          {
            final SubLObject var38 = Hashtables.gethash_without_values( var35, var34, var37 );
            if( assertion_handles_oc.NIL == module0065.f4773( assertion_handles_oc.$ic20$ ) || assertion_handles_oc.NIL == module0065.f4749( var38 ) )
            {
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, assertion_handles_oc.ONE_INTEGER );
              f11044( var38 );
            }
            var35 = Numbers.add( var35, assertion_handles_oc.ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var27, var19 );
      module0012.$g77$.rebind( var26, var19 );
      module0012.$g76$.rebind( var25, var19 );
      module0012.$g75$.rebind( var24, var19 );
    }
    f11016();
    oc_assertion_manager.f11106();
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11025(final SubLObject var40)
  {
    assert assertion_handles_oc.NIL != f11035( var40 ) : var40;
    return f11036( var40 );
  }

  public static SubLObject f11027(final SubLObject var40, final SubLObject var91)
  {
    f11037( var40, var91 );
    return var40;
  }

  public static SubLObject f11046(final SubLObject var40)
  {
    return Types.integerp( f11036( var40 ) );
  }

  public static SubLObject f11053(final SubLObject var21)
  {
    assert assertion_handles_oc.NIL != Types.integerp( var21 ) : var21;
    return f11020( var21 );
  }

  public static SubLObject f11054()
  {
    SubLFiles.declareFunction( myName, "f11008", "S#13814", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles_oc", "f11009", "DO-ASSERTIONS" );
    SubLFiles.declareFunction( myName, "f11010", "S#13815", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11011", "S#13816", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11012", "S#13817", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11014", "S#13818", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11016", "S#13819", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11017", "S#13820", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11018", "S#13821", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11019", "ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11020", "S#13822", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11021", "S#13823", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11015", "S#13824", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11022", "S#13825", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11023", "S#13826", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11024", "S#13827", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11013", "S#13828", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11026", "S#13829", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11028", "S#13830", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11029", "S#13831", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles_oc", "f11030", "S#13832" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.assertion_handles_oc", "f11031", "S#13833" );
    SubLFiles.declareFunction( myName, "f11032", "S#13834", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11033", "S#13835", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11035", "ASSERTION-P", 1, 0, false );
    new $f11035$UnaryFunction();
    SubLFiles.declareFunction( myName, "f11036", "S#13836", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11037", "S#13837", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11038", "S#13838", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11039", "S#13839", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11040", "S#13840", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11034", "S#13841", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11042", "SXHASH-ASSERTION-METHOD", 1, 0, false );
    new $f11042$UnaryFunction();
    SubLFiles.declareFunction( myName, "f11043", "S#13842", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11044", "S#13843", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11045", "S#12757", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11041", "VALID-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction( myName, "f11047", "S#13844", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11048", "S#13845", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11049", "S#13846", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11050", "S#13847", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11051", "S#13848", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11052", "S#13849", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11025", "ASSERTION-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11027", "S#13850", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11046", "S#13851", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11053", "FIND-ASSERTION-BY-ID", 1, 0, false );
    new $f11053$UnaryFunction();
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11055()
  {
    assertion_handles_oc.$g2193$ = SubLFiles.deflexical( "S#13852", ( assertion_handles_oc.NIL != Symbols.boundp( assertion_handles_oc.$ic0$ ) ) ? assertion_handles_oc.$g2193$.getGlobalValue()
        : assertion_handles_oc.NIL );
    assertion_handles_oc.$g2194$ = SubLFiles.defconstant( "S#13853", assertion_handles_oc.$ic30$ );
    assertion_handles_oc.$g2195$ = SubLFiles.defparameter( "S#13854", assertion_handles_oc.NIL );
    return assertion_handles_oc.NIL;
  }

  public static SubLObject f11056()
  {
    module0003.f57( assertion_handles_oc.$ic0$ );
    module0012.f375( assertion_handles_oc.$ic9$, assertion_handles_oc.$ic1$, assertion_handles_oc.$ic10$ );
    module0002.f50( assertion_handles_oc.$ic11$, assertion_handles_oc.$ic9$ );
    module0002.f50( assertion_handles_oc.$ic12$, assertion_handles_oc.$ic13$ );
    module0012.f368( assertion_handles_oc.$ic14$, assertion_handles_oc.NIL, assertion_handles_oc.$ic15$, assertion_handles_oc.NIL,
        assertion_handles_oc.$ic16$ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function( assertion_handles_oc.$ic38$ ) );
    SubLSpecialOperatorDeclarations.proclaim( assertion_handles_oc.$ic39$ );
    Structures.def_csetf( assertion_handles_oc.$ic40$, assertion_handles_oc.$ic41$ );
    Equality.identity( assertion_handles_oc.$ic30$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function( assertion_handles_oc.$ic48$ ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), assertion_handles_oc.$g2194$.getGlobalValue(), Symbols.symbol_function( assertion_handles_oc.$ic53$ ) );
    module0012.f368( assertion_handles_oc.$ic31$, assertion_handles_oc.$ic54$, assertion_handles_oc.$ic55$, assertion_handles_oc.NIL,
        assertion_handles_oc.$ic56$ );
    module0012.f368( assertion_handles_oc.$ic59$, assertion_handles_oc.$ic60$, assertion_handles_oc.$ic61$, assertion_handles_oc.$ic62$,
        assertion_handles_oc.$ic16$ );
    module0012.f368( assertion_handles_oc.$ic64$, assertion_handles_oc.$ic33$, assertion_handles_oc.$ic65$, assertion_handles_oc.$ic66$,
        assertion_handles_oc.$ic67$ );
    return assertion_handles_oc.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f11054();
  }

  @Override
  public void initializeVariables()
  {
    f11055();
  }

  @Override
  public void runTopLevelForms()
  {
    f11056();
  }
  static
  {
    me = new assertion_handles_oc();
    assertion_handles_oc.$g2193$ = null;
    assertion_handles_oc.$g2194$ = null;
    assertion_handles_oc.$g2195$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "S#13852", "CYC" );
    $ic1$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "VAR", "CYC" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "S#130", "CYC" ), SubLObjectFactory.makeString( "mapping Cyc assertions" ) ), SubLObjectFactory.makeSymbol( "&KEY" ),
        SubLObjectFactory.makeSymbol( "S#127", "CYC" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic2$ = SubLObjectFactory.makeString( "mapping Cyc assertions" );
    $ic3$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "DONE" ) );
    $ic4$ = SubLObjectFactory.makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic5$ = SubLObjectFactory.makeKeyword( "DONE" );
    $ic6$ = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE" );
    $ic7$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13815", "CYC" ) );
    $ic8$ = SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" );
    $ic9$ = SubLObjectFactory.makeSymbol( "DO-ASSERTIONS" );
    $ic10$ = SubLObjectFactory.makeString(
        "Iterate over all HL assertion datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the assertion.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil." );
    $ic11$ = SubLObjectFactory.makeSymbol( "S#13815", "CYC" );
    $ic12$ = SubLObjectFactory.makeSymbol( "S#13820", "CYC" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#13855", "CYC" );
    $ic14$ = SubLObjectFactory.makeSymbol( "ASSERTION-COUNT" );
    $ic15$ = SubLObjectFactory.makeString( "Return the total number of assertions." );
    $ic16$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "INTEGERP" ) );
    $ic17$ = SubLObjectFactory.makeKeyword( "OLD" );
    $ic18$ = SubLObjectFactory.makeString( "Determining maximum assertion ID" );
    $ic19$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic20$ = SubLObjectFactory.makeKeyword( "SKIP" );
    $ic21$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol(
        "S#130", "CYC" ), SubLObjectFactory.makeSymbol( "S#127", "CYC" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic22$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeKeyword( "DONE" ) );
    $ic23$ = SubLObjectFactory.makeUninternedSymbol( "US#4D08B3F" );
    $ic24$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic25$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13834", "CYC" ) ) );
    $ic26$ = SubLObjectFactory.makeSymbol( "S#10463", "CYC" );
    $ic27$ = SubLObjectFactory.makeUninternedSymbol( "US#352B2C1" );
    $ic28$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "+" ), assertion_handles_oc.ONE_INTEGER, ConsesLow.list( SubLObjectFactory
        .makeSymbol( "S#13834", "CYC" ) ) ) );
    $ic29$ = SubLObjectFactory.makeSymbol( "S#10464", "CYC" );
    $ic30$ = SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" );
    $ic31$ = SubLObjectFactory.makeSymbol( "ASSERTION-P" );
    $ic32$ = SubLObjectFactory.makeInteger( 141 );
    $ic33$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ) );
    $ic34$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "ID" ) );
    $ic35$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13836", "CYC" ) );
    $ic36$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13837", "CYC" ) );
    $ic37$ = SubLObjectFactory.makeSymbol( "S#13841", "CYC" );
    $ic38$ = SubLObjectFactory.makeSymbol( "S#13835", "CYC" );
    $ic39$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) );
    $ic40$ = SubLObjectFactory.makeSymbol( "S#13836", "CYC" );
    $ic41$ = SubLObjectFactory.makeSymbol( "S#13837", "CYC" );
    $ic42$ = SubLObjectFactory.makeKeyword( "ID" );
    $ic43$ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $ic44$ = SubLObjectFactory.makeKeyword( "BEGIN" );
    $ic45$ = SubLObjectFactory.makeSymbol( "S#13838", "CYC" );
    $ic46$ = SubLObjectFactory.makeKeyword( "SLOT" );
    $ic47$ = SubLObjectFactory.makeKeyword( "END" );
    $ic48$ = SubLObjectFactory.makeSymbol( "S#13840", "CYC" );
    $ic49$ = SubLObjectFactory.makeString( "#<AS:~S:~S>" );
    $ic50$ = SubLObjectFactory.makeString( "#<AS:~S>" );
    $ic51$ = SubLObjectFactory.makeString( "<The CFASL invalid assertion>" );
    $ic52$ = SubLObjectFactory.makeInteger( 23 );
    $ic53$ = SubLObjectFactory.makeSymbol( "SXHASH-ASSERTION-METHOD", "CYC" );
    $ic54$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OBJECT", "CYC" ) );
    $ic55$ = SubLObjectFactory.makeString( "Return T iff OBJECT is an HL assertion" );
    $ic56$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "BOOLEANP" ) );
    $ic57$ = SubLObjectFactory.makeSymbol( "FIXNUMP" );
    $ic58$ = SubLObjectFactory.makeString( "Freeing assertions" );
    $ic59$ = SubLObjectFactory.makeSymbol( "ASSERTION-ID" );
    $ic60$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ) );
    $ic61$ = SubLObjectFactory.makeString( "Return the id of this ASSERTION." );
    $ic62$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "ASSERTION", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
    $ic63$ = SubLObjectFactory.makeSymbol( "INTEGERP" );
    $ic64$ = SubLObjectFactory.makeSymbol( "FIND-ASSERTION-BY-ID" );
    $ic65$ = SubLObjectFactory.makeString( "Return the assertion with ID, or NIL if not present." );
    $ic66$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ), SubLObjectFactory.makeSymbol( "INTEGERP" ) ) );
    $ic67$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "ASSERTION-P" ) ) );
  }

  public static final class $sX12582_native extends SubLStructNative
  {
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $sX12582_native()
    {
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX12582_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$id;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$id = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sX12582_native.class, assertion_handles_oc.$ic30$, assertion_handles_oc.$ic31$, assertion_handles_oc.$ic33$, assertion_handles_oc.$ic34$, new String[] { "$id"
      }, assertion_handles_oc.$ic35$, assertion_handles_oc.$ic36$, assertion_handles_oc.$ic37$ );
    }
  }

  public static final class $f11035$UnaryFunction extends UnaryFunction
  {
    public $f11035$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return assertion_handles_oc.f11035( var71 );
    }
  }

  public static final class $f11042$UnaryFunction extends UnaryFunction
  {
    public $f11042$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-ASSERTION-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return assertion_handles_oc.f11042( var71 );
    }
  }

  public static final class $f11053$UnaryFunction extends UnaryFunction
  {
    public $f11053$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FIND-ASSERTION-BY-ID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return assertion_handles_oc.f11053( var71 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/assertion_handles_oc.class Total time: 231 ms
 *
 * Decompiled with Procyon 0.5.32.
 */