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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class assertion_handles_oc
    extends
      SubLTranslatedFile
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
    return module0065.f4764( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11009(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic1$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic1$ );
    var6 = var4.first();
    var4 = var4.rest();
    final SubLObject var7 = var4.isCons() ? var4.first() : $ic2$;
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, $ic1$ );
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var11_12 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic1$ );
      var11_12 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic1$ );
      if( NIL == conses_high.member( var11_12, $ic3$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var11_12 == $ic4$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic1$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic5$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( $ic6$, ConsesLow.list( var6, $ic7$, $ic8$, var7, $ic5$, var12 ), ConsesLow.append( var13, NIL ) );
  }

  public static SubLObject f11010()
  {
    return $g2193$.getGlobalValue();
  }

  public static SubLObject f11011(final SubLObject var16, final SubLObject var17)
  {
    if( NIL != $g2193$.getGlobalValue() )
    {
      return NIL;
    }
    $g2193$.setGlobalValue( module0065.f4745( var16, ZERO_INTEGER ) );
    return T;
  }

  public static SubLObject f11012(SubLObject var18)
  {
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    f11013( var18 );
    if( NIL == var18 )
    {
      f11014();
      assertion_manager_oc.f11105( f11015() );
    }
    return NIL;
  }

  public static SubLObject f11014()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = Storage.$current_area$.currentBinding( var19 );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), var19 );
      module0065.f4760( $g2193$.getGlobalValue(), UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( var20, var19 );
    }
    return NIL;
  }

  public static SubLObject f11016()
  {
    return module0065.f4762( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11017()
  {
    return module0065.f4794( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11018()
  {
    return module0065.f4797( f11010() );
  }

  public static SubLObject f11019()
  {
    if( NIL == $g2193$.getGlobalValue() )
    {
      return ZERO_INTEGER;
    }
    return module0065.f4733( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11020(final SubLObject var21)
  {
    return module0065.f4750( $g2193$.getGlobalValue(), var21, UNPROVIDED );
  }

  public static SubLObject f11021()
  {
    return module0065.f4734( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11015()
  {
    return module0065.f4739( $g2193$.getGlobalValue() );
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
    final SubLObject var22 = assertion_manager_oc.f11115();
    return module0065.f4799( f11010(), $ic17$, var22 );
  }

  public static SubLObject f11013(SubLObject var18)
  {
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    final SubLThread var19 = SubLProcess.currentSubLThread();
    SubLObject var20 = MINUS_ONE_INTEGER;
    if( NIL != var18 )
    {
      var20 = var18;
    }
    else
    {
      final SubLObject var21 = f11010();
      final SubLObject var22 = $ic18$;
      final SubLObject var23 = module0065.f4733( var21 );
      SubLObject var24 = ZERO_INTEGER;
      assert NIL != Types.stringp( var22 ) : var22;
      final SubLObject var25 = module0012.$g75$.currentBinding( var19 );
      final SubLObject var26 = module0012.$g76$.currentBinding( var19 );
      final SubLObject var27 = module0012.$g77$.currentBinding( var19 );
      final SubLObject var28 = module0012.$g78$.currentBinding( var19 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var19 );
        module0012.$g76$.bind( NIL, var19 );
        module0012.$g77$.bind( T, var19 );
        module0012.$g78$.bind( Time.get_universal_time(), var19 );
        module0012.f478( var22 );
        final SubLObject var31_32 = var21;
        if( NIL == module0065.f4772( var31_32, $ic20$ ) )
        {
          final SubLObject var33_34 = var31_32;
          if( NIL == module0065.f4775( var33_34, $ic20$ ) )
          {
            final SubLObject var29 = module0065.f4740( var33_34 );
            final SubLObject var30 = NIL;
            SubLObject var31;
            SubLObject var32;
            SubLObject var33;
            SubLObject var34;
            for( var31 = Sequences.length( var29 ), var32 = NIL, var32 = ZERO_INTEGER; var32.numL( var31 ); var32 = Numbers.add( var32, ONE_INTEGER ) )
            {
              var33 = ( ( NIL != var30 ) ? Numbers.subtract( var31, var32, ONE_INTEGER ) : var32 );
              var34 = Vectors.aref( var29, var33 );
              if( NIL == module0065.f4749( var34 ) || NIL == module0065.f4773( $ic20$ ) )
              {
                if( NIL != module0065.f4749( var34 ) )
                {
                  var34 = $ic20$;
                }
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, ONE_INTEGER );
                var20 = Numbers.max( var20, f11025( var34 ) );
              }
            }
          }
          final SubLObject var41_42 = var31_32;
          if( NIL == module0065.f4777( var41_42 ) || NIL == module0065.f4773( $ic20$ ) )
          {
            final SubLObject var35 = module0065.f4738( var41_42 );
            SubLObject var36 = module0065.f4739( var41_42 );
            final SubLObject var37 = module0065.f4734( var41_42 );
            final SubLObject var38 = ( NIL != module0065.f4773( $ic20$ ) ) ? NIL : $ic20$;
            while ( var36.numL( var37 ))
            {
              final SubLObject var39 = Hashtables.gethash_without_values( var36, var35, var38 );
              if( NIL == module0065.f4773( $ic20$ ) || NIL == module0065.f4749( var39 ) )
              {
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, ONE_INTEGER );
                var20 = Numbers.max( var20, f11025( var39 ) );
              }
              var36 = Numbers.add( var36, ONE_INTEGER );
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
    final SubLObject var40 = Numbers.add( var20, ONE_INTEGER );
    module0065.f4741( $g2193$.getGlobalValue(), var40 );
    return var40;
  }

  public static SubLObject f11026(final SubLObject var40, final SubLObject var21)
  {
    f11027( var40, var21 );
    module0065.f4753( $g2193$.getGlobalValue(), var21, var40 );
    return var40;
  }

  public static SubLObject f11028(final SubLObject var21)
  {
    return module0065.f4761( $g2193$.getGlobalValue(), var21 );
  }

  public static SubLObject f11029()
  {
    return module0065.f4746( $g2193$.getGlobalValue() );
  }

  public static SubLObject f11030(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic21$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic21$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = NIL;
    SubLObject var8 = var4;
    SubLObject var9 = NIL;
    SubLObject var53_54 = NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, $ic21$ );
      var53_54 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, $ic21$ );
      if( NIL == conses_high.member( var53_54, $ic22$, UNPROVIDED, UNPROVIDED ) )
      {
        var9 = T;
      }
      if( var53_54 == $ic4$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic21$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( $ic8$, var4 );
    final SubLObject var11 = ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( $ic5$, var4 );
    final SubLObject var13 = ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = $ic23$;
    return ConsesLow.list( $ic24$, ConsesLow.list( reader.bq_cons( var15, $ic25$ ) ), ConsesLow.listS( $ic26$, ConsesLow.list( var6, $ic7$, var15, $ic8$, var11, $ic5$, var13 ), ConsesLow.append( var14, NIL ) ) );
  }

  public static SubLObject f11031(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic21$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic21$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = NIL;
    SubLObject var8 = var4;
    SubLObject var9 = NIL;
    SubLObject var64_65 = NIL;
    while ( NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, $ic21$ );
      var64_65 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, $ic21$ );
      if( NIL == conses_high.member( var64_65, $ic22$, UNPROVIDED, UNPROVIDED ) )
      {
        var9 = T;
      }
      if( var64_65 == $ic4$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( NIL != var9 && NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic21$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( $ic8$, var4 );
    final SubLObject var11 = ( NIL != var10 ) ? conses_high.cadr( var10 ) : NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( $ic5$, var4 );
    final SubLObject var13 = ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = $ic27$;
    return ConsesLow.list( $ic24$, ConsesLow.list( reader.bq_cons( var15, $ic28$ ) ), ConsesLow.listS( $ic29$, ConsesLow.list( var6, $ic7$, var15, $ic8$, var11, $ic5$, var13 ), ConsesLow.append( var14, NIL ) ) );
  }

  public static SubLObject f11032()
  {
    if( NIL != Filesys.directory_p( module0107.f7598() ) )
    {
      return dumper_oc.f38047( module0107.f7598() );
    }
    return ZERO_INTEGER;
  }

  public static SubLObject f11033(final SubLObject var69, final SubLObject var70)
  {
    f11034( var69, var70, ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject f11035(final SubLObject var69)
  {
    return ( var69.getClass() == $sX12582_native.class ) ? T : NIL;
  }

  public static SubLObject f11036(final SubLObject var69)
  {
    assert NIL != f11035( var69 ) : var69;
    return var69.getField2();
  }

  public static SubLObject f11037(final SubLObject var69, final SubLObject var72)
  {
    assert NIL != f11035( var69 ) : var69;
    return var69.setField2( var72 );
  }

  public static SubLObject f11038(SubLObject var73)
  {
    if( var73 == UNPROVIDED )
    {
      var73 = NIL;
    }
    final SubLObject var74 = new $sX12582_native();
    SubLObject var75;
    SubLObject var76;
    SubLObject var77;
    SubLObject var78;
    for( var75 = NIL, var75 = var73; NIL != var75; var75 = conses_high.cddr( var75 ) )
    {
      var76 = var75.first();
      var77 = conses_high.cadr( var75 );
      var78 = var76;
      if( var78.eql( $ic42$ ) )
      {
        f11037( var74, var77 );
      }
      else
      {
        Errors.error( $ic43$, var76 );
      }
    }
    return var74;
  }

  public static SubLObject f11039(final SubLObject var79, final SubLObject var80)
  {
    Functions.funcall( var80, var79, $ic44$, $ic45$, ONE_INTEGER );
    Functions.funcall( var80, var79, $ic46$, $ic42$, f11036( var79 ) );
    Functions.funcall( var80, var79, $ic47$, $ic45$, ONE_INTEGER );
    return var79;
  }

  public static SubLObject f11040(final SubLObject var79, final SubLObject var80)
  {
    return f11039( var79, var80 );
  }

  public static SubLObject f11034(final SubLObject var81, final SubLObject var70, final SubLObject var82)
  {
    final SubLThread var83 = SubLProcess.currentSubLThread();
    if( NIL != f11041( var81, UNPROVIDED ) )
    {
      final SubLObject var84 = module0178.f11286( var81 );
      if( NIL != var84 )
      {
        final SubLObject var85 = module0018.$g582$.currentBinding( var83 );
        final SubLObject var86 = module0018.$g583$.currentBinding( var83 );
        try
        {
          module0018.$g582$.bind( module0178.f11294( var81 ), var83 );
          module0018.$g583$.bind( module0178.f11292( var81 ), var83 );
          final SubLObject var87 = ( NIL != $g2195$.getDynamicValue( var83 ) ) ? module0279.f18587( var84, UNPROVIDED ) : module0232.f15328( var84, module0018.$g583$.getDynamicValue( var83 ) );
          final SubLObject var88 = module0178.f11287( var81 );
          PrintLow.format( var70, $ic49$, var87, var88 );
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
        PrintLow.format( var70, $ic50$, var89 );
      }
    }
    else if( var81.eql( module0338.f22683() ) )
    {
      PrintLow.format( var70, $ic51$ );
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
    return $ic52$;
  }

  public static SubLObject f11043()
  {
    SubLObject var40 = NIL;
    var40 = f11038( UNPROVIDED );
    return var40;
  }

  public static SubLObject f11044(final SubLObject var40)
  {
    f11037( var40, NIL );
    return var40;
  }

  public static SubLObject f11045(final SubLObject var81)
  {
    return makeBoolean( NIL != f11035( var81 ) && NIL != f11046( var81 ) );
  }

  public static SubLObject f11041(final SubLObject var40, SubLObject var87)
  {
    if( var87 == UNPROVIDED )
    {
      var87 = NIL;
    }
    return f11045( var40 );
  }

  public static SubLObject f11047(final SubLObject var40)
  {
    return makeBoolean( NIL != f11045( var40 ) && NIL != module0035.sublisp_boolean( assertion_manager_oc.f11114( f11025( var40 ) ) ) );
  }

  public static SubLObject f11048(final SubLObject var81)
  {
    return Types.integerp( var81 );
  }

  public static SubLObject f11049(SubLObject var21)
  {
    if( var21 == UNPROVIDED )
    {
      var21 = NIL;
    }
    if( NIL == var21 )
    {
      var21 = f11029();
    }
    assert NIL != Types.fixnump( var21 ) : var21;
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
    return f11049( UNPROVIDED );
  }

  public static SubLObject f11052()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = f11010();
    final SubLObject var21 = $ic58$;
    final SubLObject var22 = module0065.f4733( var20 );
    SubLObject var23 = ZERO_INTEGER;
    assert NIL != Types.stringp( var21 ) : var21;
    final SubLObject var24 = module0012.$g75$.currentBinding( var19 );
    final SubLObject var25 = module0012.$g76$.currentBinding( var19 );
    final SubLObject var26 = module0012.$g77$.currentBinding( var19 );
    final SubLObject var27 = module0012.$g78$.currentBinding( var19 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var19 );
      module0012.$g76$.bind( NIL, var19 );
      module0012.$g77$.bind( T, var19 );
      module0012.$g78$.bind( Time.get_universal_time(), var19 );
      module0012.f478( var21 );
      final SubLObject var31_88 = var20;
      if( NIL == module0065.f4772( var31_88, $ic20$ ) )
      {
        final SubLObject var33_89 = var31_88;
        if( NIL == module0065.f4775( var33_89, $ic20$ ) )
        {
          final SubLObject var28 = module0065.f4740( var33_89 );
          final SubLObject var29 = NIL;
          SubLObject var30;
          SubLObject var31;
          SubLObject var32;
          SubLObject var33;
          for( var30 = Sequences.length( var28 ), var31 = NIL, var31 = ZERO_INTEGER; var31.numL( var30 ); var31 = Numbers.add( var31, ONE_INTEGER ) )
          {
            var32 = ( ( NIL != var29 ) ? Numbers.subtract( var30, var31, ONE_INTEGER ) : var31 );
            var33 = Vectors.aref( var28, var32 );
            if( NIL == module0065.f4749( var33 ) || NIL == module0065.f4773( $ic20$ ) )
            {
              if( NIL != module0065.f4749( var33 ) )
              {
                var33 = $ic20$;
              }
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, ONE_INTEGER );
              f11044( var33 );
            }
          }
        }
        final SubLObject var41_90 = var31_88;
        if( NIL == module0065.f4777( var41_90 ) || NIL == module0065.f4773( $ic20$ ) )
        {
          final SubLObject var34 = module0065.f4738( var41_90 );
          SubLObject var35 = module0065.f4739( var41_90 );
          final SubLObject var36 = module0065.f4734( var41_90 );
          final SubLObject var37 = ( NIL != module0065.f4773( $ic20$ ) ) ? NIL : $ic20$;
          while ( var35.numL( var36 ))
          {
            final SubLObject var38 = Hashtables.gethash_without_values( var35, var34, var37 );
            if( NIL == module0065.f4773( $ic20$ ) || NIL == module0065.f4749( var38 ) )
            {
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, ONE_INTEGER );
              f11044( var38 );
            }
            var35 = Numbers.add( var35, ONE_INTEGER );
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
    assertion_manager_oc.f11106();
    return NIL;
  }

  public static SubLObject f11025(final SubLObject var40)
  {
    assert NIL != f11035( var40 ) : var40;
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
    assert NIL != Types.integerp( var21 ) : var21;
    return f11020( var21 );
  }

  public static SubLObject f11054()
  {
    SubLFiles.declareFunction(me, "f11008", "S#13814", 0, 0, false );
    SubLFiles.declareMacro(me, "f11009", "DO-ASSERTIONS" );
    SubLFiles.declareFunction(me, "f11010", "S#13815", 0, 0, false );
    SubLFiles.declareFunction(me, "f11011", "S#13816", 2, 0, false );
    SubLFiles.declareFunction(me, "f11012", "S#13817", 0, 1, false );
    SubLFiles.declareFunction(me, "f11014", "S#13818", 0, 0, false );
    SubLFiles.declareFunction(me, "f11016", "S#13819", 0, 0, false );
    SubLFiles.declareFunction(me, "f11017", "S#13820", 0, 0, false );
    SubLFiles.declareFunction(me, "f11018", "S#13821", 0, 0, false );
    SubLFiles.declareFunction(me, "f11019", "ASSERTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction(me, "f11020", "S#13822", 1, 0, false );
    SubLFiles.declareFunction(me, "f11021", "S#13823", 0, 0, false );
    SubLFiles.declareFunction(me, "f11015", "S#13824", 0, 0, false );
    SubLFiles.declareFunction(me, "f11022", "S#13825", 0, 0, false );
    SubLFiles.declareFunction(me, "f11023", "S#13826", 0, 0, false );
    SubLFiles.declareFunction(me, "f11024", "S#13827", 0, 0, false );
    SubLFiles.declareFunction(me, "f11013", "S#13828", 0, 1, false );
    SubLFiles.declareFunction(me, "f11026", "S#13829", 2, 0, false );
    SubLFiles.declareFunction(me, "f11028", "S#13830", 1, 0, false );
    SubLFiles.declareFunction(me, "f11029", "S#13831", 0, 0, false );
    SubLFiles.declareMacro(me, "f11030", "S#13832" );
    SubLFiles.declareMacro(me, "f11031", "S#13833" );
    SubLFiles.declareFunction(me, "f11032", "S#13834", 0, 0, false );
    SubLFiles.declareFunction(me, "f11033", "S#13835", 2, 0, false );
    SubLFiles.declareFunction(me, "f11035", "ASSERTION-P", 1, 0, false );
    new $f11035$UnaryFunction();
    SubLFiles.declareFunction(me, "f11036", "S#13836", 1, 0, false );
    SubLFiles.declareFunction(me, "f11037", "S#13837", 2, 0, false );
    SubLFiles.declareFunction(me, "f11038", "S#13838", 0, 1, false );
    SubLFiles.declareFunction(me, "f11039", "S#13839", 2, 0, false );
    SubLFiles.declareFunction(me, "f11040", "S#13840", 2, 0, false );
    SubLFiles.declareFunction(me, "f11034", "S#13841", 3, 0, false );
    SubLFiles.declareFunction(me, "f11042", "SXHASH-ASSERTION-METHOD", 1, 0, false );
    new $f11042$UnaryFunction();
    SubLFiles.declareFunction(me, "f11043", "S#13842", 0, 0, false );
    SubLFiles.declareFunction(me, "f11044", "S#13843", 1, 0, false );
    SubLFiles.declareFunction(me, "f11045", "S#12757", 1, 0, false );
    SubLFiles.declareFunction(me, "f11041", "VALID-ASSERTION?", 1, 1, false );
    SubLFiles.declareFunction(me, "f11047", "S#13844", 1, 0, false );
    SubLFiles.declareFunction(me, "f11048", "S#13845", 1, 0, false );
    SubLFiles.declareFunction(me, "f11049", "S#13846", 0, 1, false );
    SubLFiles.declareFunction(me, "f11050", "S#13847", 0, 0, false );
    SubLFiles.declareFunction(me, "f11051", "S#13848", 0, 0, false );
    SubLFiles.declareFunction(me, "f11052", "S#13849", 0, 0, false );
    SubLFiles.declareFunction(me, "f11025", "ASSERTION-ID", 1, 0, false );
    SubLFiles.declareFunction(me, "f11027", "S#13850", 2, 0, false );
    SubLFiles.declareFunction(me, "f11046", "S#13851", 1, 0, false );
    SubLFiles.declareFunction(me, "f11053", "FIND-ASSERTION-BY-ID", 1, 0, false );
    new $f11053$UnaryFunction();
    return NIL;
  }

  public static SubLObject f11055()
  {
    $g2193$ = SubLFiles.deflexical( "S#13852", ( NIL != Symbols.boundp( $ic0$ ) ) ? $g2193$.getGlobalValue() : NIL );
    $g2194$ = SubLFiles.defconstant( "S#13853", $ic30$ );
    $g2195$ = SubLFiles.defparameter( "S#13854", NIL );
    return NIL;
  }

  public static SubLObject f11056()
  {
    module0003.f57( $ic0$ );
    module0012.f375( $ic9$, $ic1$, $ic10$ );
    module0002.f50( $ic11$, $ic9$ );
    module0002.f50( $ic12$, $ic13$ );
    module0012.f368( $ic14$, NIL, $ic15$, NIL, $ic16$ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $g2194$.getGlobalValue(), Symbols.symbol_function( $ic38$ ) );
    SubLSpecialOperatorDeclarations.proclaim( $ic39$ );
    Structures.def_csetf( $ic40$, $ic41$ );
    Equality.identity( $ic30$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g2194$.getGlobalValue(), Symbols.symbol_function( $ic48$ ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), $g2194$.getGlobalValue(), Symbols.symbol_function( $ic53$ ) );
    module0012.f368( $ic31$, $ic54$, $ic55$, NIL, $ic56$ );
    module0012.f368( $ic59$, $ic60$, $ic61$, $ic62$, $ic16$ );
    module0012.f368( $ic64$, $ic33$, $ic65$, $ic66$, $ic67$ );
    return NIL;
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
    $g2193$ = null;
    $g2194$ = null;
    $g2195$ = null;
    $ic0$ = makeSymbol( "S#13852", "CYC" );
    $ic1$ = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR", "CYC" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "S#130", "CYC" ), makeString( "mapping Cyc assertions" ) ), makeSymbol( "&KEY" ), makeSymbol(
        "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol( "S#5", "CYC" ) );
    $ic2$ = makeString( "mapping Cyc assertions" );
    $ic3$ = ConsesLow.list( makeKeyword( "DONE" ) );
    $ic4$ = makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic5$ = makeKeyword( "DONE" );
    $ic6$ = makeSymbol( "DO-KB-SUID-TABLE" );
    $ic7$ = ConsesLow.list( makeSymbol( "S#13815", "CYC" ) );
    $ic8$ = makeKeyword( "PROGRESS-MESSAGE" );
    $ic9$ = makeSymbol( "DO-ASSERTIONS" );
    $ic10$ = makeString(
        "Iterate over all HL assertion datastructures, executing BODY within the scope of VAR.\n   VAR is bound to the assertion.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil." );
    $ic11$ = makeSymbol( "S#13815", "CYC" );
    $ic12$ = makeSymbol( "S#13820", "CYC" );
    $ic13$ = makeSymbol( "S#13855", "CYC" );
    $ic14$ = makeSymbol( "ASSERTION-COUNT" );
    $ic15$ = makeString( "Return the total number of assertions." );
    $ic16$ = ConsesLow.list( makeSymbol( "INTEGERP" ) );
    $ic17$ = makeKeyword( "OLD" );
    $ic18$ = makeString( "Determining maximum assertion ID" );
    $ic19$ = makeSymbol( "STRINGP" );
    $ic20$ = makeKeyword( "SKIP" );
    $ic21$ = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION", "CYC" ), makeSymbol( "&KEY" ), makeSymbol( "S#130", "CYC" ), makeSymbol( "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol( "S#5", "CYC" ) );
    $ic22$ = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ), makeKeyword( "DONE" ) );
    $ic23$ = makeUninternedSymbol( "US#4D08B3F" );
    $ic24$ = makeSymbol( "CLET" );
    $ic25$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#13834", "CYC" ) ) );
    $ic26$ = makeSymbol( "S#10463", "CYC" );
    $ic27$ = makeUninternedSymbol( "US#352B2C1" );
    $ic28$ = ConsesLow.list( ConsesLow.list( makeSymbol( "+" ), ONE_INTEGER, ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13834", "CYC" ) ) ) );
    $ic29$ = makeSymbol( "S#10464", "CYC" );
    $ic30$ = makeSymbol( "ASSERTION", "CYC" );
    $ic31$ = makeSymbol( "ASSERTION-P" );
    $ic32$ = makeInteger( 141 );
    $ic33$ = ConsesLow.list( makeSymbol( "S#1519", "CYC" ) );
    $ic34$ = ConsesLow.list( makeKeyword( "ID" ) );
    $ic35$ = ConsesLow.list( makeSymbol( "S#13836", "CYC" ) );
    $ic36$ = ConsesLow.list( makeSymbol( "S#13837", "CYC" ) );
    $ic37$ = makeSymbol( "S#13841", "CYC" );
    $ic38$ = makeSymbol( "S#13835", "CYC" );
    $ic39$ = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "ASSERTION-P" ) );
    $ic40$ = makeSymbol( "S#13836", "CYC" );
    $ic41$ = makeSymbol( "S#13837", "CYC" );
    $ic42$ = makeKeyword( "ID" );
    $ic43$ = makeString( "Invalid slot ~S for construction function" );
    $ic44$ = makeKeyword( "BEGIN" );
    $ic45$ = makeSymbol( "S#13838", "CYC" );
    $ic46$ = makeKeyword( "SLOT" );
    $ic47$ = makeKeyword( "END" );
    $ic48$ = makeSymbol( "S#13840", "CYC" );
    $ic49$ = makeString( "#<AS:~S:~S>" );
    $ic50$ = makeString( "#<AS:~S>" );
    $ic51$ = makeString( "<The CFASL invalid assertion>" );
    $ic52$ = makeInteger( 23 );
    $ic53$ = makeSymbol( "SXHASH-ASSERTION-METHOD", "CYC" );
    $ic54$ = ConsesLow.list( makeSymbol( "OBJECT", "CYC" ) );
    $ic55$ = makeString( "Return T iff OBJECT is an HL assertion" );
    $ic56$ = ConsesLow.list( makeSymbol( "BOOLEANP" ) );
    $ic57$ = makeSymbol( "FIXNUMP" );
    $ic58$ = makeString( "Freeing assertions" );
    $ic59$ = makeSymbol( "ASSERTION-ID" );
    $ic60$ = ConsesLow.list( makeSymbol( "ASSERTION", "CYC" ) );
    $ic61$ = makeString( "Return the id of this ASSERTION." );
    $ic62$ = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION", "CYC" ), makeSymbol( "ASSERTION-P" ) ) );
    $ic63$ = makeSymbol( "INTEGERP" );
    $ic64$ = makeSymbol( "FIND-ASSERTION-BY-ID" );
    $ic65$ = makeString( "Return the assertion with ID, or NIL if not present." );
    $ic66$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#1519", "CYC" ), makeSymbol( "INTEGERP" ) ) );
    $ic67$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#664", "CYC" ), makeSymbol( "ASSERTION-P" ) ) );
  }

  public static final class $sX12582_native
      extends
        SubLStructNative
  {
    public SubLObject $id;
    public static final SubLStructDeclNative structDecl;

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
      structDecl = Structures.makeStructDeclNative( $sX12582_native.class, $ic30$, $ic31$, $ic33$, $ic34$, new String[] { "$id"
      }, $ic35$, $ic36$, $ic37$ );
    }
  }

  public static final class $f11035$UnaryFunction
      extends
        UnaryFunction
  {
    public $f11035$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "ASSERTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return f11035( var71 );
    }
  }

  public static final class $f11042$UnaryFunction
      extends
        UnaryFunction
  {
    public $f11042$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "SXHASH-ASSERTION-METHOD" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return f11042( var71 );
    }
  }

  public static final class $f11053$UnaryFunction
      extends
        UnaryFunction
  {
    public $f11053$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "FIND-ASSERTION-BY-ID" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return f11053( var71 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 231 ms
 *
 * Decompiled with Procyon 0.5.32.
 */