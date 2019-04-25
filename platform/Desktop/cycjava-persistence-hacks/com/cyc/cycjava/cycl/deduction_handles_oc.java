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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class deduction_handles_oc extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.deduction_handles_oc";
  public static final String myFingerPrint = "fdacc07eb7735062cfd790db173309c6258428f0e466099a14d93f87dd43f503";
  private static SubLSymbol $g2228$;
  public static SubLSymbol $g2229$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLList $ic2$;
  private static final SubLString $ic3$;
  private static final SubLList $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLSymbol $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLList $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLString $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLString $ic16$;
  private static final SubLList $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLString $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLSymbol $ic21$;
  private static final SubLList $ic22$;
  private static final SubLList $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLSymbol $ic25$;
  private static final SubLList $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLSymbol $ic28$;
  private static final SubLList $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLInteger $ic33$;
  private static final SubLList $ic34$;
  private static final SubLList $ic35$;
  private static final SubLList $ic36$;
  private static final SubLList $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLSymbol $ic39$;
  private static final SubLList $ic40$;
  private static final SubLSymbol $ic41$;
  private static final SubLSymbol $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLString $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLString $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLString $ic53$;
  private static final SubLInteger $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLList $ic56$;
  private static final SubLString $ic57$;
  private static final SubLList $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLList $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLString $ic63$;
  private static final SubLSymbol $ic64$;
  private static final SubLList $ic65$;
  private static final SubLString $ic66$;
  private static final SubLList $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLString $ic69$;
  private static final SubLList $ic70$;
  private static final SubLList $ic71$;

  public static SubLObject f11632()
  {
    return module0052.f3724( module0065.f4763( deduction_handles_oc.$g2228$.getGlobalValue() ), Symbols.symbol_function( deduction_handles_oc.$ic1$ ), deduction_handles_oc.UNPROVIDED );
  }

  public static SubLObject f11633(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic2$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = deduction_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic2$ );
    var6 = var4.first();
    var4 = var4.rest();
    final SubLObject var7 = var4.isCons() ? var4.first() : deduction_handles_oc.$ic3$;
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, deduction_handles_oc.$ic2$ );
    var4 = var4.rest();
    SubLObject var8 = deduction_handles_oc.NIL;
    SubLObject var9 = var4;
    SubLObject var10 = deduction_handles_oc.NIL;
    SubLObject var11_12 = deduction_handles_oc.NIL;
    while ( deduction_handles_oc.NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, deduction_handles_oc.$ic2$ );
      var11_12 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, deduction_handles_oc.$ic2$ );
      if( deduction_handles_oc.NIL == conses_high.member( var11_12, deduction_handles_oc.$ic4$, deduction_handles_oc.UNPROVIDED, deduction_handles_oc.UNPROVIDED ) )
      {
        var10 = deduction_handles_oc.T;
      }
      if( var11_12 == deduction_handles_oc.$ic5$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( deduction_handles_oc.NIL != var10 && deduction_handles_oc.NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, deduction_handles_oc.$ic2$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( deduction_handles_oc.$ic6$, var4 );
    final SubLObject var12 = ( deduction_handles_oc.NIL != var11 ) ? conses_high.cadr( var11 ) : deduction_handles_oc.NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( deduction_handles_oc.$ic7$, ConsesLow.list( var6, deduction_handles_oc.$ic8$, deduction_handles_oc.$ic9$, var7,
        deduction_handles_oc.$ic6$, var12 ), ConsesLow.append( var13, deduction_handles_oc.NIL ) );
  }

  public static SubLObject f11634()
  {
    return deduction_handles_oc.$g2228$.getGlobalValue();
  }

  public static SubLObject f11635(final SubLObject var16, final SubLObject var17)
  {
    if( deduction_handles_oc.NIL != deduction_handles_oc.$g2228$.getGlobalValue() )
    {
      return deduction_handles_oc.NIL;
    }
    deduction_handles_oc.$g2228$.setGlobalValue( module0065.f4745( var16, deduction_handles_oc.ZERO_INTEGER ) );
    return deduction_handles_oc.T;
  }

  public static SubLObject f11636(SubLObject var18)
  {
    if( var18 == deduction_handles_oc.UNPROVIDED )
    {
      var18 = deduction_handles_oc.NIL;
    }
    f11637( var18 );
    if( deduction_handles_oc.NIL == var18 )
    {
      f11638();
      module0186.f11693( f11639() );
    }
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11638()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = Storage.$current_area$.currentBinding( var19 );
    try
    {
      Storage.$current_area$.bind( Storage.get_static_area(), var19 );
      module0065.f4760( deduction_handles_oc.$g2228$.getGlobalValue(), deduction_handles_oc.UNPROVIDED );
    }
    finally
    {
      Storage.$current_area$.rebind( var20, var19 );
    }
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11640()
  {
    return module0065.f4762( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11641()
  {
    return module0065.f4794( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11642()
  {
    return module0065.f4797( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11643()
  {
    if( deduction_handles_oc.NIL == deduction_handles_oc.$g2228$.getGlobalValue() )
    {
      return deduction_handles_oc.ZERO_INTEGER;
    }
    return module0065.f4733( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11644(final SubLObject var21)
  {
    return module0065.f4750( deduction_handles_oc.$g2228$.getGlobalValue(), var21, deduction_handles_oc.UNPROVIDED );
  }

  public static SubLObject f11645()
  {
    return module0065.f4734( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11639()
  {
    return module0065.f4739( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11646()
  {
    return module0065.f4736( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11647()
  {
    return Numbers.subtract( f11643(), f11646() );
  }

  public static SubLObject f11648()
  {
    final SubLObject var22 = module0186.f11709();
    return module0065.f4799( deduction_handles_oc.$g2228$.getGlobalValue(), deduction_handles_oc.$ic18$, var22 );
  }

  public static SubLObject f11637(SubLObject var18)
  {
    if( var18 == deduction_handles_oc.UNPROVIDED )
    {
      var18 = deduction_handles_oc.NIL;
    }
    final SubLThread var19 = SubLProcess.currentSubLThread();
    SubLObject var20 = deduction_handles_oc.MINUS_ONE_INTEGER;
    if( deduction_handles_oc.NIL != var18 )
    {
      var20 = var18;
    }
    else
    {
      final SubLObject var21 = f11634();
      final SubLObject var22 = deduction_handles_oc.$ic19$;
      final SubLObject var23 = module0065.f4733( var21 );
      SubLObject var24 = deduction_handles_oc.ZERO_INTEGER;
      assert deduction_handles_oc.NIL != Types.stringp( var22 ) : var22;
      final SubLObject var25 = module0012.$g75$.currentBinding( var19 );
      final SubLObject var26 = module0012.$g76$.currentBinding( var19 );
      final SubLObject var27 = module0012.$g77$.currentBinding( var19 );
      final SubLObject var28 = module0012.$g78$.currentBinding( var19 );
      try
      {
        module0012.$g75$.bind( deduction_handles_oc.ZERO_INTEGER, var19 );
        module0012.$g76$.bind( deduction_handles_oc.NIL, var19 );
        module0012.$g77$.bind( deduction_handles_oc.T, var19 );
        module0012.$g78$.bind( Time.get_universal_time(), var19 );
        module0012.f478( var22 );
        final SubLObject var31_32 = var21;
        if( deduction_handles_oc.NIL == module0065.f4772( var31_32, deduction_handles_oc.$ic21$ ) )
        {
          final SubLObject var33_34 = var31_32;
          if( deduction_handles_oc.NIL == module0065.f4775( var33_34, deduction_handles_oc.$ic21$ ) )
          {
            final SubLObject var29 = module0065.f4740( var33_34 );
            final SubLObject var30 = deduction_handles_oc.NIL;
            SubLObject var31;
            SubLObject var32;
            SubLObject var33;
            SubLObject var34;
            for( var31 = Sequences.length( var29 ), var32 = deduction_handles_oc.NIL, var32 = deduction_handles_oc.ZERO_INTEGER; var32.numL( var31 ); var32 = Numbers.add( var32,
                deduction_handles_oc.ONE_INTEGER ) )
            {
              var33 = ( ( deduction_handles_oc.NIL != var30 ) ? Numbers.subtract( var31, var32, deduction_handles_oc.ONE_INTEGER ) : var32 );
              var34 = Vectors.aref( var29, var33 );
              if( deduction_handles_oc.NIL == module0065.f4749( var34 ) || deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) )
              {
                if( deduction_handles_oc.NIL != module0065.f4749( var34 ) )
                {
                  var34 = deduction_handles_oc.$ic21$;
                }
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, deduction_handles_oc.ONE_INTEGER );
                var20 = Numbers.max( var20, f11649( var34 ) );
              }
            }
          }
          final SubLObject var41_42 = var31_32;
          if( deduction_handles_oc.NIL == module0065.f4777( var41_42 ) || deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) )
          {
            final SubLObject var35 = module0065.f4738( var41_42 );
            SubLObject var36 = module0065.f4739( var41_42 );
            final SubLObject var37 = module0065.f4734( var41_42 );
            final SubLObject var38 = ( deduction_handles_oc.NIL != module0065.f4773( deduction_handles_oc.$ic21$ ) ) ? deduction_handles_oc.NIL : deduction_handles_oc.$ic21$;
            while ( var36.numL( var37 ))
            {
              final SubLObject var39 = Hashtables.gethash_without_values( var36, var35, var38 );
              if( deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) || deduction_handles_oc.NIL == module0065.f4749( var39 ) )
              {
                module0012.note_percent_progress( var24, var23 );
                var24 = Numbers.add( var24, deduction_handles_oc.ONE_INTEGER );
                var20 = Numbers.max( var20, f11649( var39 ) );
              }
              var36 = Numbers.add( var36, deduction_handles_oc.ONE_INTEGER );
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
    final SubLObject var40 = Numbers.add( var20, deduction_handles_oc.ONE_INTEGER );
    module0065.f4741( deduction_handles_oc.$g2228$.getGlobalValue(), var40 );
    return var40;
  }

  public static SubLObject f11650(final SubLObject var40, final SubLObject var21)
  {
    f11651( var40, var21 );
    module0065.f4753( deduction_handles_oc.$g2228$.getGlobalValue(), var21, var40 );
    return var40;
  }

  public static SubLObject f11652(final SubLObject var21)
  {
    return module0065.f4761( deduction_handles_oc.$g2228$.getGlobalValue(), var21 );
  }

  public static SubLObject f11653()
  {
    return module0065.f4746( deduction_handles_oc.$g2228$.getGlobalValue() );
  }

  public static SubLObject f11654(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic22$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = deduction_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic22$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = deduction_handles_oc.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = deduction_handles_oc.NIL;
    SubLObject var53_54 = deduction_handles_oc.NIL;
    while ( deduction_handles_oc.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, deduction_handles_oc.$ic22$ );
      var53_54 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, deduction_handles_oc.$ic22$ );
      if( deduction_handles_oc.NIL == conses_high.member( var53_54, deduction_handles_oc.$ic23$, deduction_handles_oc.UNPROVIDED, deduction_handles_oc.UNPROVIDED ) )
      {
        var9 = deduction_handles_oc.T;
      }
      if( var53_54 == deduction_handles_oc.$ic5$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( deduction_handles_oc.NIL != var9 && deduction_handles_oc.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, deduction_handles_oc.$ic22$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( deduction_handles_oc.$ic9$, var4 );
    final SubLObject var11 = ( deduction_handles_oc.NIL != var10 ) ? conses_high.cadr( var10 ) : deduction_handles_oc.NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( deduction_handles_oc.$ic6$, var4 );
    final SubLObject var13 = ( deduction_handles_oc.NIL != var12 ) ? conses_high.cadr( var12 ) : deduction_handles_oc.NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = deduction_handles_oc.$ic24$;
    return ConsesLow.list( deduction_handles_oc.$ic25$, ConsesLow.list( reader.bq_cons( var15, deduction_handles_oc.$ic26$ ) ), ConsesLow.listS(
        deduction_handles_oc.$ic27$, ConsesLow.list( var6, deduction_handles_oc.$ic8$, var15, deduction_handles_oc.$ic9$, var11,
            deduction_handles_oc.$ic6$, var13 ), ConsesLow.append( var14, deduction_handles_oc.NIL ) ) );
  }

  public static SubLObject f11655(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic22$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = deduction_handles_oc.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, deduction_handles_oc.$ic22$ );
    var6 = var4.first();
    var4 = var4.rest();
    SubLObject var7 = deduction_handles_oc.NIL;
    SubLObject var8 = var4;
    SubLObject var9 = deduction_handles_oc.NIL;
    SubLObject var64_65 = deduction_handles_oc.NIL;
    while ( deduction_handles_oc.NIL != var8)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, deduction_handles_oc.$ic22$ );
      var64_65 = var8.first();
      var8 = var8.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var8, var3, deduction_handles_oc.$ic22$ );
      if( deduction_handles_oc.NIL == conses_high.member( var64_65, deduction_handles_oc.$ic23$, deduction_handles_oc.UNPROVIDED, deduction_handles_oc.UNPROVIDED ) )
      {
        var9 = deduction_handles_oc.T;
      }
      if( var64_65 == deduction_handles_oc.$ic5$ )
      {
        var7 = var8.first();
      }
      var8 = var8.rest();
    }
    if( deduction_handles_oc.NIL != var9 && deduction_handles_oc.NIL == var7 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, deduction_handles_oc.$ic22$ );
    }
    final SubLObject var10 = cdestructuring_bind.property_list_member( deduction_handles_oc.$ic9$, var4 );
    final SubLObject var11 = ( deduction_handles_oc.NIL != var10 ) ? conses_high.cadr( var10 ) : deduction_handles_oc.NIL;
    final SubLObject var12 = cdestructuring_bind.property_list_member( deduction_handles_oc.$ic6$, var4 );
    final SubLObject var13 = ( deduction_handles_oc.NIL != var12 ) ? conses_high.cadr( var12 ) : deduction_handles_oc.NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    final SubLObject var15 = deduction_handles_oc.$ic28$;
    return ConsesLow.list( deduction_handles_oc.$ic25$, ConsesLow.list( reader.bq_cons( var15, deduction_handles_oc.$ic29$ ) ), ConsesLow.listS(
        deduction_handles_oc.$ic30$, ConsesLow.list( var6, deduction_handles_oc.$ic8$, var15, deduction_handles_oc.$ic9$, var11,
            deduction_handles_oc.$ic6$, var13 ), ConsesLow.append( var14, deduction_handles_oc.NIL ) ) );
  }

  public static SubLObject f11656()
  {
    if( deduction_handles_oc.NIL != Filesys.directory_p( module0107.f7598() ) )
    {
      return dumper_oc.f38063( module0107.f7598() );
    }
    return deduction_handles_oc.ZERO_INTEGER;
  }

  public static SubLObject f11657(final SubLObject var69, final SubLObject var70)
  {
    f11658( var69, var70, deduction_handles_oc.ZERO_INTEGER );
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11659(final SubLObject var69)
  {
    return ( var69.getClass() == $sX14450_native.class ) ? deduction_handles_oc.T : deduction_handles_oc.NIL;
  }

  public static SubLObject f11660(final SubLObject var69)
  {
    assert deduction_handles_oc.NIL != f11659( var69 ) : var69;
    return var69.getField2();
  }

  public static SubLObject f11661(final SubLObject var69, final SubLObject var72)
  {
    assert deduction_handles_oc.NIL != f11659( var69 ) : var69;
    return var69.setField2( var72 );
  }

  public static SubLObject f11662(SubLObject var73)
  {
    if( var73 == deduction_handles_oc.UNPROVIDED )
    {
      var73 = deduction_handles_oc.NIL;
    }
    final SubLObject var74 = new $sX14450_native();
    SubLObject var75;
    SubLObject var76;
    SubLObject var77;
    SubLObject var78;
    for( var75 = deduction_handles_oc.NIL, var75 = var73; deduction_handles_oc.NIL != var75; var75 = conses_high.cddr( var75 ) )
    {
      var76 = var75.first();
      var77 = conses_high.cadr( var75 );
      var78 = var76;
      if( var78.eql( deduction_handles_oc.$ic43$ ) )
      {
        f11661( var74, var77 );
      }
      else
      {
        Errors.error( deduction_handles_oc.$ic44$, var76 );
      }
    }
    return var74;
  }

  public static SubLObject f11663(final SubLObject var79, final SubLObject var80)
  {
    Functions.funcall( var80, var79, deduction_handles_oc.$ic45$, deduction_handles_oc.$ic46$, deduction_handles_oc.ONE_INTEGER );
    Functions.funcall( var80, var79, deduction_handles_oc.$ic47$, deduction_handles_oc.$ic43$, f11660( var79 ) );
    Functions.funcall( var80, var79, deduction_handles_oc.$ic48$, deduction_handles_oc.$ic46$, deduction_handles_oc.ONE_INTEGER );
    return var79;
  }

  public static SubLObject f11664(final SubLObject var79, final SubLObject var80)
  {
    return f11663( var79, var80 );
  }

  public static SubLObject f11658(final SubLObject var81, final SubLObject var70, final SubLObject var82)
  {
    final SubLThread var83 = SubLProcess.currentSubLThread();
    if( deduction_handles_oc.NIL != f11665( var81, deduction_handles_oc.UNPROVIDED ) )
    {
      if( deduction_handles_oc.NIL != print_high.$print_readably$.getDynamicValue( var83 ) )
      {
        print_high.print_not_readable( var81, var70 );
      }
      else
      {
        streams_high.write_string( deduction_handles_oc.$ic50$, var70, deduction_handles_oc.UNPROVIDED, deduction_handles_oc.UNPROVIDED );
        PrintLow.write( Types.type_of( var81 ), new SubLObject[] { deduction_handles_oc.$ic51$, var70
        } );
        streams_high.write_char( Characters.CHAR_space, var70 );
        print_high.princ( f11649( var81 ), var70 );
        streams_high.write_char( Characters.CHAR_greater, var70 );
      }
    }
    else if( var81.eql( module0338.f22693() ) )
    {
      PrintLow.format( var70, deduction_handles_oc.$ic53$ );
    }
    else
    {
      compatibility.default_struct_print_function( var81, var70, var82 );
    }
    return var81;
  }

  public static SubLObject f11666(final SubLObject var81)
  {
    final SubLObject var82 = f11660( var81 );
    if( var82.isInteger() )
    {
      return var82;
    }
    return deduction_handles_oc.$ic54$;
  }

  public static SubLObject f11667()
  {
    SubLObject var40 = deduction_handles_oc.NIL;
    var40 = f11662( deduction_handles_oc.UNPROVIDED );
    return var40;
  }

  public static SubLObject f11668(final SubLObject var40)
  {
    f11661( var40, deduction_handles_oc.NIL );
    return var40;
  }

  public static SubLObject f11669(final SubLObject var81)
  {
    return SubLObjectFactory.makeBoolean( deduction_handles_oc.NIL != f11659( var81 ) && deduction_handles_oc.NIL != f11670( var81 ) );
  }

  public static SubLObject f11665(final SubLObject var40, SubLObject var87)
  {
    if( var87 == deduction_handles_oc.UNPROVIDED )
    {
      var87 = deduction_handles_oc.NIL;
    }
    return f11671( var40, var87 );
  }

  public static SubLObject f11671(final SubLObject var40, SubLObject var87)
  {
    if( var87 == deduction_handles_oc.UNPROVIDED )
    {
      var87 = deduction_handles_oc.NIL;
    }
    if( deduction_handles_oc.NIL == f11669( var40 ) )
    {
      return deduction_handles_oc.NIL;
    }
    if( deduction_handles_oc.NIL == var87 )
    {
      return deduction_handles_oc.T;
    }
    final SubLObject var88 = module0188.f11770( var40 );
    return SubLObjectFactory.makeBoolean( deduction_handles_oc.NIL != module0191.f11955( module0188.f11781( var40 ), deduction_handles_oc.UNPROVIDED ) && var88.isCons()
        && deduction_handles_oc.NIL != module0035.f2370( deduction_handles_oc.$ic61$, var88, deduction_handles_oc.UNPROVIDED ) );
  }

  public static SubLObject f11672(SubLObject var21)
  {
    if( var21 == deduction_handles_oc.UNPROVIDED )
    {
      var21 = deduction_handles_oc.NIL;
    }
    if( deduction_handles_oc.NIL == var21 )
    {
      var21 = f11653();
    }
    assert deduction_handles_oc.NIL != Types.integerp( var21 ) : var21;
    final SubLObject var22 = f11667();
    f11650( var22, var21 );
    return var22;
  }

  public static SubLObject f11673()
  {
    return f11667();
  }

  public static SubLObject f11674()
  {
    final SubLThread var19 = SubLProcess.currentSubLThread();
    final SubLObject var20 = f11634();
    final SubLObject var21 = deduction_handles_oc.$ic63$;
    final SubLObject var22 = module0065.f4733( var20 );
    SubLObject var23 = deduction_handles_oc.ZERO_INTEGER;
    assert deduction_handles_oc.NIL != Types.stringp( var21 ) : var21;
    final SubLObject var24 = module0012.$g75$.currentBinding( var19 );
    final SubLObject var25 = module0012.$g76$.currentBinding( var19 );
    final SubLObject var26 = module0012.$g77$.currentBinding( var19 );
    final SubLObject var27 = module0012.$g78$.currentBinding( var19 );
    try
    {
      module0012.$g75$.bind( deduction_handles_oc.ZERO_INTEGER, var19 );
      module0012.$g76$.bind( deduction_handles_oc.NIL, var19 );
      module0012.$g77$.bind( deduction_handles_oc.T, var19 );
      module0012.$g78$.bind( Time.get_universal_time(), var19 );
      module0012.f478( var21 );
      final SubLObject var31_89 = var20;
      if( deduction_handles_oc.NIL == module0065.f4772( var31_89, deduction_handles_oc.$ic21$ ) )
      {
        final SubLObject var33_90 = var31_89;
        if( deduction_handles_oc.NIL == module0065.f4775( var33_90, deduction_handles_oc.$ic21$ ) )
        {
          final SubLObject var28 = module0065.f4740( var33_90 );
          final SubLObject var29 = deduction_handles_oc.NIL;
          SubLObject var30;
          SubLObject var31;
          SubLObject var32;
          SubLObject var33;
          for( var30 = Sequences.length( var28 ), var31 = deduction_handles_oc.NIL, var31 = deduction_handles_oc.ZERO_INTEGER; var31.numL( var30 ); var31 = Numbers.add( var31,
              deduction_handles_oc.ONE_INTEGER ) )
          {
            var32 = ( ( deduction_handles_oc.NIL != var29 ) ? Numbers.subtract( var30, var31, deduction_handles_oc.ONE_INTEGER ) : var31 );
            var33 = Vectors.aref( var28, var32 );
            if( deduction_handles_oc.NIL == module0065.f4749( var33 ) || deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) )
            {
              if( deduction_handles_oc.NIL != module0065.f4749( var33 ) )
              {
                var33 = deduction_handles_oc.$ic21$;
              }
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, deduction_handles_oc.ONE_INTEGER );
              f11668( var33 );
            }
          }
        }
        final SubLObject var41_91 = var31_89;
        if( deduction_handles_oc.NIL == module0065.f4777( var41_91 ) || deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) )
        {
          final SubLObject var34 = module0065.f4738( var41_91 );
          SubLObject var35 = module0065.f4739( var41_91 );
          final SubLObject var36 = module0065.f4734( var41_91 );
          final SubLObject var37 = ( deduction_handles_oc.NIL != module0065.f4773( deduction_handles_oc.$ic21$ ) ) ? deduction_handles_oc.NIL : deduction_handles_oc.$ic21$;
          while ( var35.numL( var36 ))
          {
            final SubLObject var38 = Hashtables.gethash_without_values( var35, var34, var37 );
            if( deduction_handles_oc.NIL == module0065.f4773( deduction_handles_oc.$ic21$ ) || deduction_handles_oc.NIL == module0065.f4749( var38 ) )
            {
              module0012.note_percent_progress( var23, var22 );
              var23 = Numbers.add( var23, deduction_handles_oc.ONE_INTEGER );
              f11668( var38 );
            }
            var35 = Numbers.add( var35, deduction_handles_oc.ONE_INTEGER );
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
    f11640();
    module0186.f11694();
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11649(final SubLObject var40)
  {
    assert deduction_handles_oc.NIL != f11659( var40 ) : var40;
    return f11660( var40 );
  }

  public static SubLObject f11651(final SubLObject var40, final SubLObject var92)
  {
    f11661( var40, var92 );
    return var40;
  }

  public static SubLObject f11670(final SubLObject var40)
  {
    return Types.integerp( f11660( var40 ) );
  }

  public static SubLObject f11675(final SubLObject var21)
  {
    assert deduction_handles_oc.NIL != Types.integerp( var21 ) : var21;
    return f11644( var21 );
  }

  public static SubLObject f11676()
  {
    SubLFiles.declareFunction( myName, "f11632", "S#14454", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.deduction_handles_oc", "f11633", "DO-DEDUCTIONS" );
    SubLFiles.declareFunction( myName, "f11634", "S#14455", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11635", "S#14456", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11636", "S#14457", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11638", "S#14458", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11640", "S#14459", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11641", "S#14460", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11642", "S#14461", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11643", "DEDUCTION-COUNT", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11644", "S#14462", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11645", "S#14463", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11639", "S#14464", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11646", "S#14465", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11647", "S#14466", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11648", "S#14467", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11637", "S#14468", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11650", "S#14469", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11652", "S#14470", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11653", "S#14471", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.deduction_handles_oc", "f11654", "S#14472" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.deduction_handles_oc", "f11655", "S#14473" );
    SubLFiles.declareFunction( myName, "f11656", "S#14474", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11657", "S#14475", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11659", "DEDUCTION-P", 1, 0, false );
    new $f11659$UnaryFunction();
    SubLFiles.declareFunction( myName, "f11660", "S#14476", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11661", "S#14477", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11662", "S#14478", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11663", "S#14479", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11664", "S#14480", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11658", "S#14481", 3, 0, false );
    SubLFiles.declareFunction( myName, "f11666", "S#14452", 1, 0, false );
    new $f11666$UnaryFunction();
    SubLFiles.declareFunction( myName, "f11667", "S#14482", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11668", "S#14483", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11669", "S#14484", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11665", "S#14485", 1, 1, false );
    SubLFiles.declareFunction( myName, "f11671", "S#14306", 1, 1, false );
    SubLFiles.declareFunction( myName, "f11672", "S#14486", 0, 1, false );
    SubLFiles.declareFunction( myName, "f11673", "S#14487", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11674", "S#14488", 0, 0, false );
    SubLFiles.declareFunction( myName, "f11649", "DEDUCTION-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11651", "S#14489", 2, 0, false );
    SubLFiles.declareFunction( myName, "f11670", "S#14490", 1, 0, false );
    SubLFiles.declareFunction( myName, "f11675", "FIND-DEDUCTION-BY-ID", 1, 0, false );
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11677()
  {
    deduction_handles_oc.$g2228$ = SubLFiles.deflexical( "S#14491", ( deduction_handles_oc.NIL != Symbols.boundp( deduction_handles_oc.$ic0$ ) ) ? deduction_handles_oc.$g2228$.getGlobalValue()
        : deduction_handles_oc.NIL );
    deduction_handles_oc.$g2229$ = SubLFiles.defconstant( "S#14492", deduction_handles_oc.$ic31$ );
    return deduction_handles_oc.NIL;
  }

  public static SubLObject f11678()
  {
    module0003.f57( deduction_handles_oc.$ic0$ );
    module0012.f375( deduction_handles_oc.$ic10$, deduction_handles_oc.$ic2$, deduction_handles_oc.$ic11$ );
    module0002.f50( deduction_handles_oc.$ic12$, deduction_handles_oc.$ic10$ );
    module0002.f50( deduction_handles_oc.$ic13$, deduction_handles_oc.$ic14$ );
    module0012.f368( deduction_handles_oc.$ic15$, deduction_handles_oc.NIL, deduction_handles_oc.$ic16$, deduction_handles_oc.NIL,
        deduction_handles_oc.$ic17$ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), deduction_handles_oc.$g2229$.getGlobalValue(), Symbols.symbol_function( deduction_handles_oc.$ic39$ ) );
    SubLSpecialOperatorDeclarations.proclaim( deduction_handles_oc.$ic40$ );
    Structures.def_csetf( deduction_handles_oc.$ic41$, deduction_handles_oc.$ic42$ );
    Equality.identity( deduction_handles_oc.$ic31$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), deduction_handles_oc.$g2229$.getGlobalValue(), Symbols.symbol_function( deduction_handles_oc.$ic49$ ) );
    Structures.register_method( Sxhash.$sxhash_method_table$.getGlobalValue(), deduction_handles_oc.$g2229$.getGlobalValue(), Symbols.symbol_function( deduction_handles_oc.$ic55$ ) );
    module0012.f368( deduction_handles_oc.$ic32$, deduction_handles_oc.$ic56$, deduction_handles_oc.$ic57$, deduction_handles_oc.NIL,
        deduction_handles_oc.$ic58$ );
    module0002.f35( deduction_handles_oc.$ic59$, deduction_handles_oc.$ic60$ );
    module0012.f368( deduction_handles_oc.$ic64$, deduction_handles_oc.$ic65$, deduction_handles_oc.$ic66$, deduction_handles_oc.$ic67$,
        deduction_handles_oc.$ic17$ );
    module0012.f368( deduction_handles_oc.$ic68$, deduction_handles_oc.$ic34$, deduction_handles_oc.$ic69$, deduction_handles_oc.$ic70$,
        deduction_handles_oc.$ic71$ );
    return deduction_handles_oc.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f11676();
  }

  @Override
  public void initializeVariables()
  {
    f11677();
  }

  @Override
  public void runTopLevelForms()
  {
    f11678();
  }
  static
  {
    me = new deduction_handles_oc();
    deduction_handles_oc.$g2228$ = null;
    deduction_handles_oc.$g2229$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "S#14491", "CYC" );
    $ic1$ = SubLObjectFactory.makeSymbol( "SECOND" );
    $ic2$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "VAR", "CYC" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "S#130", "CYC" ), SubLObjectFactory.makeString( "mapping Cyc deductions" ) ), SubLObjectFactory.makeSymbol( "&KEY" ),
        SubLObjectFactory.makeSymbol( "S#127", "CYC" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic3$ = SubLObjectFactory.makeString( "mapping Cyc deductions" );
    $ic4$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "DONE" ) );
    $ic5$ = SubLObjectFactory.makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic6$ = SubLObjectFactory.makeKeyword( "DONE" );
    $ic7$ = SubLObjectFactory.makeSymbol( "DO-KB-SUID-TABLE" );
    $ic8$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14455", "CYC" ) );
    $ic9$ = SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" );
    $ic10$ = SubLObjectFactory.makeSymbol( "DO-DEDUCTIONS" );
    $ic11$ = SubLObjectFactory.makeString(
        "Iterate over all HL deduction datastructures, executing BODY within the scope of VAR.\n   VAR is a deduction.\n   PROGRESS-MESSAGE is a progress message string.\n   Iteration halts early as soon as DONE becomes non-nil." );
    $ic12$ = SubLObjectFactory.makeSymbol( "S#14455", "CYC" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#14460", "CYC" );
    $ic14$ = SubLObjectFactory.makeSymbol( "S#14493", "CYC" );
    $ic15$ = SubLObjectFactory.makeSymbol( "DEDUCTION-COUNT" );
    $ic16$ = SubLObjectFactory.makeString( "Return the total number of deductions." );
    $ic17$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "INTEGERP" ) );
    $ic18$ = SubLObjectFactory.makeKeyword( "OLD" );
    $ic19$ = SubLObjectFactory.makeString( "Determining maximum deduction ID" );
    $ic20$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic21$ = SubLObjectFactory.makeKeyword( "SKIP" );
    $ic22$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "DEDUCTION", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), SubLObjectFactory.makeSymbol(
        "S#130", "CYC" ), SubLObjectFactory.makeSymbol( "S#127", "CYC" ) ), SubLObjectFactory.makeSymbol( "&BODY" ), SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic23$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "PROGRESS-MESSAGE" ), SubLObjectFactory.makeKeyword( "DONE" ) );
    $ic24$ = SubLObjectFactory.makeUninternedSymbol( "US#4D08B3F" );
    $ic25$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic26$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14474", "CYC" ) ) );
    $ic27$ = SubLObjectFactory.makeSymbol( "S#10463", "CYC" );
    $ic28$ = SubLObjectFactory.makeUninternedSymbol( "US#352B2C1" );
    $ic29$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "+" ), deduction_handles_oc.ONE_INTEGER, ConsesLow.list( SubLObjectFactory
        .makeSymbol( "S#14474", "CYC" ) ) ) );
    $ic30$ = SubLObjectFactory.makeSymbol( "S#10464", "CYC" );
    $ic31$ = SubLObjectFactory.makeSymbol( "DEDUCTION", "CYC" );
    $ic32$ = SubLObjectFactory.makeSymbol( "DEDUCTION-P" );
    $ic33$ = SubLObjectFactory.makeInteger( 144 );
    $ic34$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ) );
    $ic35$ = ConsesLow.list( SubLObjectFactory.makeKeyword( "ID" ) );
    $ic36$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14476", "CYC" ) );
    $ic37$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14477", "CYC" ) );
    $ic38$ = SubLObjectFactory.makeSymbol( "S#14481", "CYC" );
    $ic39$ = SubLObjectFactory.makeSymbol( "S#14475", "CYC" );
    $ic40$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OPTIMIZE-FUNCALL" ), SubLObjectFactory.makeSymbol( "DEDUCTION-P" ) );
    $ic41$ = SubLObjectFactory.makeSymbol( "S#14476", "CYC" );
    $ic42$ = SubLObjectFactory.makeSymbol( "S#14477", "CYC" );
    $ic43$ = SubLObjectFactory.makeKeyword( "ID" );
    $ic44$ = SubLObjectFactory.makeString( "Invalid slot ~S for construction function" );
    $ic45$ = SubLObjectFactory.makeKeyword( "BEGIN" );
    $ic46$ = SubLObjectFactory.makeSymbol( "S#14478", "CYC" );
    $ic47$ = SubLObjectFactory.makeKeyword( "SLOT" );
    $ic48$ = SubLObjectFactory.makeKeyword( "END" );
    $ic49$ = SubLObjectFactory.makeSymbol( "S#14480", "CYC" );
    $ic50$ = SubLObjectFactory.makeString( "#<" );
    $ic51$ = SubLObjectFactory.makeKeyword( "STREAM" );
    $ic52$ = SubLObjectFactory.makeKeyword( "BASE" );
    $ic53$ = SubLObjectFactory.makeString( "<The CFASL invalid deduction>" );
    $ic54$ = SubLObjectFactory.makeInteger( 786 );
    $ic55$ = SubLObjectFactory.makeSymbol( "S#14452", "CYC" );
    $ic56$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "OBJECT", "CYC" ) );
    $ic57$ = SubLObjectFactory.makeString( "Return T iff OBJECT is a CycL deduction." );
    $ic58$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "BOOLEANP" ) );
    $ic59$ = SubLObjectFactory.makeSymbol( "S#14485", "CYC" );
    $ic60$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#14306", "CYC" ) );
    $ic61$ = SubLObjectFactory.makeSymbol( "VALID-SUPPORT?", "CYC" );
    $ic62$ = SubLObjectFactory.makeSymbol( "INTEGERP" );
    $ic63$ = SubLObjectFactory.makeString( "Freeing deductions" );
    $ic64$ = SubLObjectFactory.makeSymbol( "DEDUCTION-ID" );
    $ic65$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "DEDUCTION", "CYC" ) );
    $ic66$ = SubLObjectFactory.makeString( "Return the id of DEDUCTION." );
    $ic67$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "DEDUCTION", "CYC" ), SubLObjectFactory.makeSymbol( "DEDUCTION-P" ) ) );
    $ic68$ = SubLObjectFactory.makeSymbol( "FIND-DEDUCTION-BY-ID" );
    $ic69$ = SubLObjectFactory.makeString( "Return the deduction with ID, or NIL if not present." );
    $ic70$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ), SubLObjectFactory.makeSymbol( "INTEGERP" ) ) );
    $ic71$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "DEDUCTION-P" ) ) );
  }

  public static final class $sX14450_native extends SubLStructNative
  {
    public SubLObject $id;
    private static final SubLStructDeclNative structDecl;

    public $sX14450_native()
    {
      this.$id = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX14450_native.structDecl;
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
      structDecl = Structures.makeStructDeclNative( $sX14450_native.class, deduction_handles_oc.$ic31$, deduction_handles_oc.$ic32$, deduction_handles_oc.$ic34$, deduction_handles_oc.$ic35$, new String[] { "$id"
      }, deduction_handles_oc.$ic36$, deduction_handles_oc.$ic37$, deduction_handles_oc.$ic38$ );
    }
  }

  public static final class $f11659$UnaryFunction extends UnaryFunction
  {
    public $f11659$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "DEDUCTION-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return deduction_handles_oc.f11659( var71 );
    }
  }

  public static final class $f11666$UnaryFunction extends UnaryFunction
  {
    public $f11666$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#14452" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var71)
    {
      return deduction_handles_oc.f11666( var71 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/deduction_handles_oc.class Total time: 236 ms
 *
 * Decompiled with Procyon 0.5.32.
 */