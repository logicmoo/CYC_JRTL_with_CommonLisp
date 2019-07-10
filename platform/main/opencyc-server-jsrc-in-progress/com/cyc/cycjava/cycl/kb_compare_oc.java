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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_compare_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.kb_compare_oc";
  public static final String myFingerPrint = "b2ea731310b46a25dd148004efbdcdcb07362e5689e648fc304f1cf0a573d814";
  private static SubLSymbol $g4556$;
  public static SubLSymbol $g4557$;
  private static SubLSymbol $g4558$;
  public static SubLSymbol $g4559$;
  private static final SubLList $ic0$;
  private static final SubLList $ic1$;
  private static final SubLList $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLList $ic5$;
  private static final SubLList $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLSymbol $ic9$;
  private static final SubLSymbol $ic10$;
  private static final SubLSymbol $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLSymbol $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLList $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLList $ic20$;
  private static final SubLList $ic21$;
  private static final SubLList $ic22$;
  private static final SubLList $ic23$;
  private static final SubLSymbol $ic24$;
  private static final SubLSymbol $ic25$;
  private static final SubLList $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLSymbol $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLSymbol $ic30$;
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
  private static final SubLString $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLSymbol $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLString $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLSymbol $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLSymbol $ic52$;
  private static final SubLSymbol $ic53$;
  private static final SubLSymbol $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLList $ic57$;
  private static final SubLList $ic58$;
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
  private static final SubLSymbol $ic70$;
  private static final SubLString $ic71$;
  private static final SubLSymbol $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLString $ic74$;
  private static final SubLSymbol $ic75$;
  private static final SubLString $ic76$;
  private static final SubLSymbol $ic77$;
  private static final SubLString $ic78$;
  private static final SubLSymbol $ic79$;
  private static final SubLString $ic80$;
  private static final SubLString $ic81$;
  private static final SubLString $ic82$;
  private static final SubLString $ic83$;
  private static final SubLString $ic84$;
  private static final SubLString $ic85$;
  private static final SubLSymbol $ic86$;
  private static final SubLString $ic87$;
  private static final SubLSymbol $ic88$;
  private static final SubLSymbol $ic89$;
  private static final SubLList $ic90$;
  private static final SubLList $ic91$;
  private static final SubLList $ic92$;
  private static final SubLList $ic93$;
  private static final SubLSymbol $ic94$;
  private static final SubLSymbol $ic95$;
  private static final SubLList $ic96$;
  private static final SubLSymbol $ic97$;
  private static final SubLSymbol $ic98$;
  private static final SubLSymbol $ic99$;
  private static final SubLSymbol $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLSymbol $ic102$;
  private static final SubLSymbol $ic103$;
  private static final SubLSymbol $ic104$;
  private static final SubLSymbol $ic105$;
  private static final SubLSymbol $ic106$;
  private static final SubLSymbol $ic107$;
  private static final SubLSymbol $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLSymbol $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLSymbol $ic112$;
  private static final SubLString $ic113$;
  private static final SubLSymbol $ic114$;
  private static final SubLSymbol $ic115$;
  private static final SubLSymbol $ic116$;
  private static final SubLSymbol $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLSymbol $ic119$;
  private static final SubLSymbol $ic120$;
  private static final SubLSymbol $ic121$;
  private static final SubLSymbol $ic122$;
  private static final SubLSymbol $ic123$;
  private static final SubLList $ic124$;
  private static final SubLList $ic125$;
  private static final SubLSymbol $ic126$;
  private static final SubLSymbol $ic127$;
  private static final SubLList $ic128$;
  private static final SubLSymbol $ic129$;
  private static final SubLList $ic130$;
  private static final SubLList $ic131$;
  private static final SubLList $ic132$;
  private static final SubLSymbol $ic133$;
  private static final SubLSymbol $ic134$;
  private static final SubLSymbol $ic135$;
  private static final SubLSymbol $ic136$;
  private static final SubLSymbol $ic137$;
  private static final SubLSymbol $ic138$;
  private static final SubLString $ic139$;
  private static final SubLString $ic140$;
  private static final SubLString $ic141$;
  private static final SubLList $ic142$;
  private static final SubLString $ic143$;
  private static final SubLString $ic144$;
  private static final SubLString $ic145$;
  private static final SubLString $ic146$;
  private static final SubLString $ic147$;
  private static final SubLString $ic148$;
  private static final SubLString $ic149$;
  private static final SubLString $ic150$;
  private static final SubLString $ic151$;
  private static final SubLString $ic152$;
  private static final SubLString $ic153$;
  private static final SubLString $ic154$;
  private static final SubLString $ic155$;
  private static final SubLString $ic156$;
  private static final SubLString $ic157$;
  private static final SubLString $ic158$;
  private static final SubLString $ic159$;
  private static final SubLString $ic160$;
  private static final SubLString $ic161$;
  private static final SubLString $ic162$;
  private static final SubLString $ic163$;
  private static final SubLString $ic164$;
  private static final SubLString $ic165$;
  private static final SubLSymbol $ic166$;
  private static final SubLList $ic167$;
  private static final SubLList $ic168$;
  private static final SubLSymbol $ic169$;
  private static final SubLSymbol $ic170$;
  private static final SubLList $ic171$;
  private static final SubLList $ic172$;
  private static final SubLSymbol $ic173$;
  private static final SubLList $ic174$;
  private static final SubLList $ic175$;
  private static final SubLSymbol $ic176$;
  private static final SubLList $ic177$;
  private static final SubLList $ic178$;
  private static final SubLSymbol $ic179$;

  public static SubLObject f36381(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic2$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    return ConsesLow.list( $ic3$, var5, ConsesLow.list( $ic4$, $ic5$, $ic6$, ConsesLow.listS( $ic7$, $ic8$, ConsesLow.append( var6, NIL ) ) ) );
  }

  public static SubLObject f36382()
  {
    final SubLThread var7 = SubLProcess.currentSubLThread();
    final SubLObject var8 = module0103.f7404();
    if( NIL != var8 )
    {
      final SubLObject var9 = module0103.f7401( var8 );
      if( $ic11$ == var9 )
      {
        SubLObject var10 = NIL;
        try
        {
          var7.throwStack.push( $ic12$ );
          final SubLObject var11 = Errors.$error_handler$.currentBinding( var7 );
          try
          {
            Errors.$error_handler$.bind( Symbols.symbol_function( $ic13$ ), var7 );
            try
            {
              module0103.f7398( var8, ConsesLow.listS( $ic14$, ConsesLow.list( $ic15$, ConsesLow.list( $ic16$, $g4556$.getDynamicValue( var7 ) ) ), $ic17$ ) );
            }
            catch( final Throwable var12 )
            {
              Errors.handleThrowable( var12, NIL );
            }
          }
          finally
          {
            Errors.$error_handler$.rebind( var11, var7 );
          }
        }
        catch( final Throwable var13 )
        {
          var10 = Errors.handleThrowable( var13, $ic12$ );
        }
        finally
        {
          var7.throwStack.pop();
        }
      }
      else
      {
        $g4556$.setDynamicValue( NIL, var7 );
      }
    }
    return NIL;
  }

  public static SubLObject f36383(final SubLObject var14, final SubLObject var15)
  {
    f36384( var14, var15, ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject f36385(final SubLObject var14)
  {
    return ( var14.getClass() == $sX40105_native.class ) ? T : NIL;
  }

  public static SubLObject f36386(final SubLObject var14)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.getField2();
  }

  public static SubLObject f36387(final SubLObject var14)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.getField3();
  }

  public static SubLObject f36388(final SubLObject var14)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.getField4();
  }

  public static SubLObject f36389(final SubLObject var14)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.getField5();
  }

  public static SubLObject f36390(final SubLObject var14)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.getField6();
  }

  public static SubLObject f36391(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.setField2( var17 );
  }

  public static SubLObject f36392(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.setField3( var17 );
  }

  public static SubLObject f36393(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.setField4( var17 );
  }

  public static SubLObject f36394(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.setField5( var17 );
  }

  public static SubLObject f36395(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36385( var14 ) : var14;
    return var14.setField6( var17 );
  }

  public static SubLObject f36396(SubLObject var18)
  {
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    final SubLObject var19 = new $sX40105_native();
    SubLObject var20;
    SubLObject var21;
    SubLObject var22;
    SubLObject var23;
    for( var20 = NIL, var20 = var18; NIL != var20; var20 = conses_high.cddr( var20 ) )
    {
      var21 = var20.first();
      var22 = conses_high.cadr( var20 );
      var23 = var21;
      if( var23.eql( $ic37$ ) )
      {
        f36391( var19, var22 );
      }
      else if( var23.eql( $ic38$ ) )
      {
        f36392( var19, var22 );
      }
      else if( var23.eql( $ic39$ ) )
      {
        f36393( var19, var22 );
      }
      else if( var23.eql( $ic40$ ) )
      {
        f36394( var19, var22 );
      }
      else if( var23.eql( $ic41$ ) )
      {
        f36395( var19, var22 );
      }
      else
      {
        Errors.error( $ic42$, var21 );
      }
    }
    return var19;
  }

  public static SubLObject f36397(final SubLObject var24, final SubLObject var25)
  {
    Functions.funcall( var25, var24, $ic43$, $ic44$, FIVE_INTEGER );
    Functions.funcall( var25, var24, $ic45$, $ic37$, f36386( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic38$, f36387( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic39$, f36388( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic40$, f36389( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic41$, f36390( var24 ) );
    Functions.funcall( var25, var24, $ic46$, $ic44$, FIVE_INTEGER );
    return var24;
  }

  public static SubLObject f36398(final SubLObject var24, final SubLObject var25)
  {
    return f36397( var24, var25 );
  }

  public static SubLObject f36384(final SubLObject var26, final SubLObject var15, final SubLObject var27)
  {
    PrintLow.format( var15, $ic48$, f36399( var26 ) );
    return NIL;
  }

  public static SubLObject f36400(final SubLObject var5)
  {
    final SubLObject var6 = f36396( UNPROVIDED );
    f36391( var6, var5 );
    f36392( var6, constant_handles_oc.f8432() );
    f36393( var6, module0167.f10795() );
    f36394( var6, assertion_handles_oc.f11018() );
    f36395( var6, deduction_handles_oc.f11642() );
    return var6;
  }

  public static SubLObject f36401(final SubLObject var28)
  {
    module0065.f4762( f36387( var28 ) );
    module0065.f4762( f36388( var28 ) );
    module0065.f4762( f36389( var28 ) );
    module0065.f4762( f36390( var28 ) );
    f36391( var28, $ic49$ );
    f36392( var28, NIL );
    f36393( var28, NIL );
    f36394( var28, NIL );
    f36395( var28, NIL );
    return var28;
  }

  public static SubLObject f36399(final SubLObject var8)
  {
    return f36386( var8 );
  }

  public static SubLObject f36402(final SubLObject var28)
  {
    return f36387( var28 );
  }

  public static SubLObject f36403(final SubLObject var28, final SubLObject var29, final SubLObject var30)
  {
    assert NIL != constant_handles_oc.f8449( var29 ) : var29;
    assert NIL != module0004.f106( var30 ) : var30;
    module0065.f4753( f36387( var28 ), constants_high_oc.f10749( var29 ), var30 );
    return var28;
  }

  public static SubLObject f36404(final SubLObject var28, final SubLObject var31, final SubLObject var30)
  {
    assert NIL != module0167.f10813( var31 ) : var31;
    assert NIL != module0004.f106( var30 ) : var30;
    module0065.f4753( f36388( var28 ), module0167.f10803( var31 ), var30 );
    return var28;
  }

  public static SubLObject f36405(final SubLObject var28, final SubLObject var32, final SubLObject var30)
  {
    assert NIL != assertion_handles_oc.f11035( var32 ) : var32;
    assert NIL != module0004.f106( var30 ) : var30;
    module0065.f4753( f36389( var28 ), assertion_handles_oc.f11025( var32 ), var30 );
    return var28;
  }

  public static SubLObject f36406(final SubLObject var28, final SubLObject var33, final SubLObject var30)
  {
    assert NIL != deduction_handles_oc.f11659( var33 ) : var33;
    assert NIL != module0004.f106( var30 ) : var30;
    module0065.f4753( f36390( var28 ), deduction_handles_oc.f11649( var33 ), var30 );
    return var28;
  }

  public static SubLObject f36407(final SubLObject var28)
  {
    return module0103.f7377( f36399( var28 ) );
  }

  public static SubLObject f36408(final SubLObject var28)
  {
    return module0103.f7378( f36399( var28 ) );
  }

  public static SubLObject f36409(final SubLObject var28)
  {
    return module0103.f7379( f36399( var28 ) );
  }

  public static SubLObject f36410(final SubLObject var28, final SubLObject var29)
  {
    return makeBoolean( NIL != constant_handles_oc.f8449( var29 ) && NIL != module0035.sublisp_boolean( f36411( var28, var29 ) ) );
  }

  public static SubLObject f36411(final SubLObject var28, final SubLObject var29)
  {
    final SubLObject var30 = f36387( var28 );
    final SubLObject var31 = constants_high_oc.f10749( var29 );
    if( NIL != var31 )
    {
      return module0065.f4750( var30, var31, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject f36412(final SubLObject var28, final SubLObject var31)
  {
    return makeBoolean( NIL != module0167.f10813( var31 ) && NIL != module0035.sublisp_boolean( f36413( var28, var31 ) ) );
  }

  public static SubLObject f36413(final SubLObject var28, final SubLObject var31)
  {
    final SubLObject var32 = f36388( var28 );
    final SubLObject var33 = module0167.f10803( var31 );
    if( NIL != var33 )
    {
      return module0065.f4750( var32, var33, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject f36414(final SubLObject var28, final SubLObject var32)
  {
    return makeBoolean( NIL != assertion_handles_oc.f11035( var32 ) && NIL != module0035.sublisp_boolean( f36415( var28, var32 ) ) );
  }

  public static SubLObject f36415(final SubLObject var28, final SubLObject var32)
  {
    final SubLObject var33 = f36389( var28 );
    final SubLObject var34 = assertion_handles_oc.f11025( var32 );
    if( NIL != var34 )
    {
      return module0065.f4750( var33, var34, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject f36416(final SubLObject var28, final SubLObject var33)
  {
    return makeBoolean( NIL != deduction_handles_oc.f11659( var33 ) && NIL != module0035.sublisp_boolean( f36417( var28, var33 ) ) );
  }

  public static SubLObject f36417(final SubLObject var28, final SubLObject var33)
  {
    final SubLObject var34 = f36390( var28 );
    final SubLObject var35 = deduction_handles_oc.f11649( var33 );
    if( NIL != var35 )
    {
      return module0065.f4750( var34, var35, UNPROVIDED );
    }
    return NIL;
  }

  public static SubLObject f36418(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic57$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic57$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic57$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var42_43 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic57$ );
      var42_43 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic57$ );
      if( NIL == conses_high.member( var42_43, $ic58$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var42_43 == $ic59$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic57$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic60$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    final SubLObject var14 = $ic61$;
    final SubLObject var15 = $ic62$;
    return ConsesLow.list( $ic63$, ConsesLow.list( var14, var15, ConsesLow.list( $ic50$, var7 ), $ic60$, var12 ), ConsesLow.list( $ic64$, var15 ), ConsesLow.listS( $ic4$, ConsesLow.list( ConsesLow.list( var6, ConsesLow
        .list( $ic65$, var14 ) ) ), ConsesLow.append( var13, NIL ) ) );
  }

  public static SubLObject f36419(final SubLObject var28, final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    SubLObject var33 = NIL;
    try
    {
      var32.throwStack.push( $ic66$ );
      final SubLObject var34 = $g4558$.currentBinding( var32 );
      try
      {
        $g4558$.bind( var28, var32 );
        module0035.f2424( $ic67$, module0205.f13218( var31 ), UNPROVIDED );
      }
      finally
      {
        $g4558$.rebind( var34, var32 );
      }
    }
    catch( final Throwable var35 )
    {
      var33 = Errors.handleThrowable( var35, $ic66$ );
    }
    finally
    {
      var32.throwStack.pop();
    }
    return var33;
  }

  public static SubLObject f36420(final SubLObject var26)
  {
    final SubLThread var27 = SubLProcess.currentSubLThread();
    if( ( NIL != constant_handles_oc.f8449( var26 ) && NIL == f36410( $g4558$.getDynamicValue( var27 ), var26 ) ) || ( NIL != module0167.f10813( var26 ) && NIL != f36419( $g4558$.getDynamicValue( var27 ), var26 ) ) )
    {
      Dynamic.sublisp_throw( $ic66$, T );
    }
    return NIL;
  }

  public static SubLObject f36421(final SubLObject var28, final SubLObject var32)
  {
    final SubLThread var33 = SubLProcess.currentSubLThread();
    SubLObject var34 = NIL;
    try
    {
      var33.throwStack.push( $ic66$ );
      final SubLObject var35 = $g4558$.currentBinding( var33 );
      try
      {
        $g4558$.bind( var28, var33 );
        module0035.f2424( $ic68$, module0178.f11289( var32 ), UNPROVIDED );
        module0205.f13228( $ic68$, module0178.f11287( var32 ), T, UNPROVIDED );
      }
      finally
      {
        $g4558$.rebind( var35, var33 );
      }
    }
    catch( final Throwable var36 )
    {
      var34 = Errors.handleThrowable( var36, $ic66$ );
    }
    finally
    {
      var33.throwStack.pop();
    }
    return var34;
  }

  public static SubLObject f36422(final SubLObject var26)
  {
    final SubLThread var27 = SubLProcess.currentSubLThread();
    if( ( NIL != constant_handles_oc.f8449( var26 ) && NIL == f36410( $g4558$.getDynamicValue( var27 ), var26 ) ) || ( NIL != module0167.f10813( var26 ) && NIL == f36412( $g4558$.getDynamicValue( var27 ), var26 ) )
        || ( NIL != assertion_handles_oc.f11035( var26 ) && NIL != f36421( $g4558$.getDynamicValue( var27 ), var26 ) ) )
    {
      Dynamic.sublisp_throw( $ic66$, T );
    }
    return NIL;
  }

  public static SubLObject f36423(final SubLObject var28, final SubLObject var33)
  {
    final SubLThread var34 = SubLProcess.currentSubLThread();
    SubLObject var35 = NIL;
    try
    {
      var34.throwStack.push( $ic66$ );
      final SubLObject var36 = $g4558$.currentBinding( var34 );
      try
      {
        $g4558$.bind( var28, var34 );
        f36424( module0188.f11781( var33 ) );
        SubLObject var37 = module0188.f11770( var33 );
        SubLObject var38 = NIL;
        var38 = var37.first();
        while ( NIL != var37)
        {
          if( NIL != assertion_handles_oc.f11035( var38 ) )
          {
            f36424( var38 );
          }
          else
          {
            module0035.f2424( $ic69$, module0191.f11975( var38 ), UNPROVIDED );
            module0205.f13228( $ic69$, module0191.f11976( var38 ), T, UNPROVIDED );
          }
          var37 = var37.rest();
          var38 = var37.first();
        }
      }
      finally
      {
        $g4558$.rebind( var36, var34 );
      }
    }
    catch( final Throwable var39 )
    {
      var35 = Errors.handleThrowable( var39, $ic66$ );
    }
    finally
    {
      var34.throwStack.pop();
    }
    return var35;
  }

  public static SubLObject f36424(final SubLObject var26)
  {
    final SubLThread var27 = SubLProcess.currentSubLThread();
    if( ( NIL != constant_handles_oc.f8449( var26 ) && NIL == f36410( $g4558$.getDynamicValue( var27 ), var26 ) ) || ( NIL != module0167.f10813( var26 ) && NIL == f36412( $g4558$.getDynamicValue( var27 ), var26 ) )
        || ( NIL != assertion_handles_oc.f11035( var26 ) && NIL == f36414( $g4558$.getDynamicValue( var27 ), var26 ) ) )
    {
      Dynamic.sublisp_throw( $ic66$, T );
    }
    return NIL;
  }

  public static SubLObject f36425(final SubLObject var50, final SubLObject var51)
  {
    final SubLThread var52 = SubLProcess.currentSubLThread();
    SubLObject var53 = NIL;
    try
    {
      final SubLObject var54 = stream_macros.$stream_requires_locking$.currentBinding( var52 );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, var52 );
        var53 = compatibility.open_text( var51, $ic70$ );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( var54, var52 );
      }
      if( !var53.isStream() )
      {
        Errors.error( $ic71$, var51 );
      }
      final SubLObject var55 = var53;
      f36426( var50, var55 );
    }
    finally
    {
      final SubLObject var56 = Threads.$is_thread_performing_cleanupP$.currentBinding( var52 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, var52 );
        if( var53.isStream() )
        {
          streams_high.close( var53, UNPROVIDED );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var56, var52 );
      }
    }
    return var50;
  }

  public static SubLObject f36427(final SubLObject var5, final SubLObject var51)
  {
    final SubLThread var52 = SubLProcess.currentSubLThread();
    SubLObject var53 = NIL;
    SubLObject var54 = NIL;
    try
    {
      final SubLObject var55 = stream_macros.$stream_requires_locking$.currentBinding( var52 );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, var52 );
        var54 = compatibility.open_text( var51, $ic72$ );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( var55, var52 );
      }
      if( !var54.isStream() )
      {
        Errors.error( $ic71$, var51 );
      }
      final SubLObject var56 = var54;
      var53 = f36428( var5, var56 );
    }
    finally
    {
      final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding( var52 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, var52 );
        if( var54.isStream() )
        {
          streams_high.close( var54, UNPROVIDED );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var57, var52 );
      }
    }
    return var53;
  }

  public static SubLObject f36426(final SubLObject var50, final SubLObject var15)
  {
    dumper_oc.f38021( var15 );
    module0021.f1038( $ic73$, var15 );
    f36429( f36387( var50 ), var15, $ic74$ );
    module0021.f1038( $ic75$, var15 );
    f36429( f36388( var50 ), var15, $ic76$ );
    module0021.f1038( $ic77$, var15 );
    f36429( f36389( var50 ), var15, $ic78$ );
    module0021.f1038( $ic79$, var15 );
    f36429( f36390( var50 ), var15, $ic80$ );
    return var50;
  }

  public static SubLObject f36428(final SubLObject var5, final SubLObject var15)
  {
    final SubLObject var16 = f36400( var5 );
    dumper_oc.f38022( var15 );
    f36392( var16, f36430( $ic73$, var15 ) );
    f36393( var16, f36430( $ic75$, var15 ) );
    f36394( var16, f36430( $ic77$, var15 ) );
    f36395( var16, f36430( $ic79$, var15 ) );
    return var16;
  }

  public static SubLObject f36429(final SubLObject var55, final SubLObject var15, final SubLObject var56)
  {
    final SubLThread var57 = SubLProcess.currentSubLThread();
    final SubLObject var59;
    final SubLObject var58 = var59 = Sequences.cconcatenate( $ic81$, new SubLObject[] { module0006.f203( var56 ), $ic82$
    } );
    final SubLObject var60 = module0012.$g73$.currentBinding( var57 );
    final SubLObject var61 = module0012.$g65$.currentBinding( var57 );
    final SubLObject var62 = module0012.$g67$.currentBinding( var57 );
    final SubLObject var63 = module0012.$g68$.currentBinding( var57 );
    final SubLObject var64 = module0012.$g66$.currentBinding( var57 );
    final SubLObject var65 = module0012.$g69$.currentBinding( var57 );
    final SubLObject var66 = module0012.$g70$.currentBinding( var57 );
    final SubLObject var67 = module0012.$silent_progressP$.currentBinding( var57 );
    try
    {
      module0012.$g73$.bind( Time.get_universal_time(), var57 );
      module0012.$g65$.bind( module0012.$g73$.getDynamicValue( var57 ), var57 );
      module0012.$g67$.bind( ONE_INTEGER, var57 );
      module0012.$g68$.bind( ZERO_INTEGER, var57 );
      module0012.$g66$.bind( ZERO_INTEGER, var57 );
      module0012.$g69$.bind( ZERO_INTEGER, var57 );
      module0012.$g70$.bind( T, var57 );
      module0012.$silent_progressP$.bind( ( NIL != var59 ) ? module0012.$silent_progressP$.getDynamicValue( var57 ) : T, var57 );
      module0012.f474( var59 );
      module0021.f1038( f36431( var55 ), var15 );
      module0012.f475();
    }
    finally
    {
      module0012.$silent_progressP$.rebind( var67, var57 );
      module0012.$g70$.rebind( var66, var57 );
      module0012.$g69$.rebind( var65, var57 );
      module0012.$g66$.rebind( var64, var57 );
      module0012.$g68$.rebind( var63, var57 );
      module0012.$g67$.rebind( var62, var57 );
      module0012.$g65$.rebind( var61, var57 );
      module0012.$g73$.rebind( var60, var57 );
    }
    return var55;
  }

  public static SubLObject f36430(final SubLObject var56, final SubLObject var15)
  {
    final SubLThread var57 = SubLProcess.currentSubLThread();
    final SubLObject var58 = Sequences.cconcatenate( $ic83$, new SubLObject[] { module0006.f203( var56 ), $ic82$
    } );
    final SubLObject var59 = module0021.f1060( var15, UNPROVIDED, UNPROVIDED );
    SubLObject var60 = NIL;
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var57 ) && !var56.eql( var59 ) )
    {
      Errors.error( $ic84$, var56, var59 );
    }
    final SubLObject var61 = var58;
    final SubLObject var62 = module0012.$g73$.currentBinding( var57 );
    final SubLObject var63 = module0012.$g65$.currentBinding( var57 );
    final SubLObject var64 = module0012.$g67$.currentBinding( var57 );
    final SubLObject var65 = module0012.$g68$.currentBinding( var57 );
    final SubLObject var66 = module0012.$g66$.currentBinding( var57 );
    final SubLObject var67 = module0012.$g69$.currentBinding( var57 );
    final SubLObject var68 = module0012.$g70$.currentBinding( var57 );
    final SubLObject var69 = module0012.$silent_progressP$.currentBinding( var57 );
    try
    {
      module0012.$g73$.bind( Time.get_universal_time(), var57 );
      module0012.$g65$.bind( module0012.$g73$.getDynamicValue( var57 ), var57 );
      module0012.$g67$.bind( ONE_INTEGER, var57 );
      module0012.$g68$.bind( ZERO_INTEGER, var57 );
      module0012.$g66$.bind( ZERO_INTEGER, var57 );
      module0012.$g69$.bind( ZERO_INTEGER, var57 );
      module0012.$g70$.bind( T, var57 );
      module0012.$silent_progressP$.bind( ( NIL != var61 ) ? module0012.$silent_progressP$.getDynamicValue( var57 ) : T, var57 );
      module0012.f474( var61 );
      var60 = module0021.f1060( var15, UNPROVIDED, UNPROVIDED );
      if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var57 ) && NIL == module0065.f4719( var60 ) )
      {
        Errors.error( $ic85$, var60 );
      }
      module0012.f475();
    }
    finally
    {
      module0012.$silent_progressP$.rebind( var69, var57 );
      module0012.$g70$.rebind( var68, var57 );
      module0012.$g69$.rebind( var67, var57 );
      module0012.$g66$.rebind( var66, var57 );
      module0012.$g68$.rebind( var65, var57 );
      module0012.$g67$.rebind( var64, var57 );
      module0012.$g65$.rebind( var63, var57 );
      module0012.$g73$.rebind( var62, var57 );
    }
    return var60;
  }

  public static SubLObject f36431(final SubLObject var55)
  {
    final SubLThread var56 = SubLProcess.currentSubLThread();
    final SubLObject var57 = module0065.f4797( var55 );
    if( NIL == module0065.f4772( var55, $ic86$ ) )
    {
      if( NIL == module0065.f4775( var55, $ic86$ ) )
      {
        final SubLObject var58 = module0065.f4740( var55 );
        final SubLObject var59 = NIL;
        SubLObject var60;
        SubLObject var61;
        SubLObject var62;
        SubLObject var63;
        for( var60 = Sequences.length( var58 ), var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var60 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
        {
          var62 = ( ( NIL != var59 ) ? Numbers.subtract( var60, var61, ONE_INTEGER ) : var61 );
          var63 = Vectors.aref( var58, var62 );
          if( NIL == module0065.f4749( var63 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            if( NIL != module0065.f4749( var63 ) )
            {
              var63 = $ic86$;
            }
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var56 ) && NIL == module0004.f106( var63 ) )
            {
              Errors.error( $ic87$, var62, var63 );
            }
            module0065.f4753( var57, var63, var62 );
          }
        }
      }
      if( NIL == module0065.f4777( var55 ) )
      {
        final SubLObject var64 = module0065.f4738( var55 );
        SubLObject var65 = NIL;
        SubLObject var66 = NIL;
        final Iterator var67 = Hashtables.getEntrySetIterator( var64 );
        try
        {
          while ( Hashtables.iteratorHasNext( var67 ))
          {
            final Map.Entry var68 = Hashtables.iteratorNextEntry( var67 );
            var65 = Hashtables.getEntryKey( var68 );
            var66 = Hashtables.getEntryValue( var68 );
            if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var56 ) && NIL == module0004.f106( var66 ) )
            {
              Errors.error( $ic87$, var65, var66 );
            }
            module0065.f4753( var57, var66, var65 );
          }
        }
        finally
        {
          Hashtables.releaseEntrySetIterator( var67 );
        }
      }
    }
    return var57;
  }

  public static SubLObject f36432(final SubLObject var14, final SubLObject var15)
  {
    f36433( var14, var15, ZERO_INTEGER );
    return NIL;
  }

  public static SubLObject f36434(final SubLObject var14)
  {
    return ( var14.getClass() == $sX40109_native.class ) ? T : NIL;
  }

  public static SubLObject f36435(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField2();
  }

  public static SubLObject f36436(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField3();
  }

  public static SubLObject f36437(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField4();
  }

  public static SubLObject f36438(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField5();
  }

  public static SubLObject f36439(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField6();
  }

  public static SubLObject f36440(final SubLObject var14)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.getField7();
  }

  public static SubLObject f36441(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField2( var17 );
  }

  public static SubLObject f36442(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField3( var17 );
  }

  public static SubLObject f36443(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField4( var17 );
  }

  public static SubLObject f36444(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField5( var17 );
  }

  public static SubLObject f36445(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField6( var17 );
  }

  public static SubLObject f36446(final SubLObject var14, final SubLObject var17)
  {
    assert NIL != f36434( var14 ) : var14;
    return var14.setField7( var17 );
  }

  public static SubLObject f36447(SubLObject var18)
  {
    if( var18 == UNPROVIDED )
    {
      var18 = NIL;
    }
    final SubLObject var19 = new $sX40109_native();
    SubLObject var20;
    SubLObject var21;
    SubLObject var22;
    SubLObject var23;
    for( var20 = NIL, var20 = var18; NIL != var20; var20 = conses_high.cddr( var20 ) )
    {
      var21 = var20.first();
      var22 = conses_high.cadr( var20 );
      var23 = var21;
      if( var23.eql( $ic109$ ) )
      {
        f36441( var19, var22 );
      }
      else if( var23.eql( $ic110$ ) )
      {
        f36442( var19, var22 );
      }
      else if( var23.eql( $ic73$ ) )
      {
        f36443( var19, var22 );
      }
      else if( var23.eql( $ic75$ ) )
      {
        f36444( var19, var22 );
      }
      else if( var23.eql( $ic77$ ) )
      {
        f36445( var19, var22 );
      }
      else if( var23.eql( $ic79$ ) )
      {
        f36446( var19, var22 );
      }
      else
      {
        Errors.error( $ic42$, var21 );
      }
    }
    return var19;
  }

  public static SubLObject f36448(final SubLObject var24, final SubLObject var25)
  {
    Functions.funcall( var25, var24, $ic43$, $ic111$, SIX_INTEGER );
    Functions.funcall( var25, var24, $ic45$, $ic109$, f36435( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic110$, f36436( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic73$, f36437( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic75$, f36438( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic77$, f36439( var24 ) );
    Functions.funcall( var25, var24, $ic45$, $ic79$, f36440( var24 ) );
    Functions.funcall( var25, var24, $ic46$, $ic111$, SIX_INTEGER );
    return var24;
  }

  public static SubLObject f36449(final SubLObject var24, final SubLObject var25)
  {
    return f36448( var24, var25 );
  }

  public static SubLObject f36433(final SubLObject var26, final SubLObject var15, final SubLObject var27)
  {
    PrintLow.format( var15, $ic113$, f36450( var26 ) );
    return NIL;
  }

  public static SubLObject f36451(final SubLObject var28)
  {
    final SubLObject var29 = f36447( UNPROVIDED );
    f36441( var29, var28 );
    f36442( var29, module0067.f4880( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    f36443( var29, module0077.f5313( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    f36444( var29, module0077.f5313( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    f36445( var29, module0077.f5313( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    f36446( var29, module0077.f5313( Symbols.symbol_function( EQL ), UNPROVIDED ) );
    return var29;
  }

  public static SubLObject f36452(final SubLObject var84)
  {
    module0067.f4881( f36436( var84 ) );
    module0077.f5328( f36437( var84 ) );
    module0077.f5328( f36438( var84 ) );
    module0077.f5328( f36439( var84 ) );
    module0077.f5328( f36440( var84 ) );
    f36441( var84, $ic49$ );
    f36442( var84, NIL );
    f36443( var84, NIL );
    f36444( var84, NIL );
    f36445( var84, NIL );
    f36446( var84, NIL );
    return var84;
  }

  public static SubLObject f36450(final SubLObject var84)
  {
    return f36435( var84 );
  }

  public static SubLObject f36453(final SubLObject var84)
  {
    return f36436( var84 );
  }

  public static SubLObject f36454(final SubLObject var84)
  {
    return f36437( var84 );
  }

  public static SubLObject f36455(final SubLObject var84)
  {
    return f36438( var84 );
  }

  public static SubLObject f36456(final SubLObject var84)
  {
    return f36439( var84 );
  }

  public static SubLObject f36457(final SubLObject var84)
  {
    return f36440( var84 );
  }

  public static SubLObject f36458(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic124$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    SubLObject var8 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic124$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic124$ );
    var7 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic124$ );
    var8 = var4.first();
    var4 = var4.rest();
    SubLObject var9 = NIL;
    SubLObject var10 = var4;
    SubLObject var11 = NIL;
    SubLObject var92_93 = NIL;
    while ( NIL != var10)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var10, var3, $ic124$ );
      var92_93 = var10.first();
      var10 = var10.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var10, var3, $ic124$ );
      if( NIL == conses_high.member( var92_93, $ic125$, UNPROVIDED, UNPROVIDED ) )
      {
        var11 = T;
      }
      if( var92_93 == $ic59$ )
      {
        var9 = var10.first();
      }
      var10 = var10.rest();
    }
    if( NIL != var11 && NIL == var9 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic124$ );
    }
    final SubLObject var12 = cdestructuring_bind.property_list_member( $ic126$, var4 );
    final SubLObject var13 = ( NIL != var12 ) ? conses_high.cadr( var12 ) : NIL;
    final SubLObject var14;
    var4 = ( var14 = var5 );
    return ConsesLow.listS( $ic127$, ConsesLow.list( var6, var7, ConsesLow.list( $ic114$, var8 ), $ic126$, var13 ), ConsesLow.append( var14, NIL ) );
  }

  public static SubLObject f36459(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic128$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic128$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic128$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var102_103 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic128$ );
      var102_103 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic128$ );
      if( NIL == conses_high.member( var102_103, $ic125$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var102_103 == $ic59$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic128$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic126$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( $ic129$, ConsesLow.list( var6, ConsesLow.list( $ic116$, var7 ), $ic126$, var12 ), ConsesLow.append( var13, NIL ) );
  }

  public static SubLObject f36460(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic130$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic130$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic130$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var111_112 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic130$ );
      var111_112 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic130$ );
      if( NIL == conses_high.member( var111_112, $ic125$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var111_112 == $ic59$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic130$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic126$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( $ic129$, ConsesLow.list( var6, ConsesLow.list( $ic118$, var7 ), $ic126$, var12 ), ConsesLow.append( var13, NIL ) );
  }

  public static SubLObject f36461(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic131$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic131$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic131$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var120_121 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic131$ );
      var120_121 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic131$ );
      if( NIL == conses_high.member( var120_121, $ic125$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var120_121 == $ic59$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic131$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic126$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( $ic129$, ConsesLow.list( var6, ConsesLow.list( $ic120$, var7 ), $ic126$, var12 ), ConsesLow.append( var13, NIL ) );
  }

  public static SubLObject f36462(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic132$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = NIL;
    SubLObject var7 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic132$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, $ic132$ );
    var7 = var4.first();
    var4 = var4.rest();
    SubLObject var8 = NIL;
    SubLObject var9 = var4;
    SubLObject var10 = NIL;
    SubLObject var129_130 = NIL;
    while ( NIL != var9)
    {
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic132$ );
      var129_130 = var9.first();
      var9 = var9.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var9, var3, $ic132$ );
      if( NIL == conses_high.member( var129_130, $ic125$, UNPROVIDED, UNPROVIDED ) )
      {
        var10 = T;
      }
      if( var129_130 == $ic59$ )
      {
        var8 = var9.first();
      }
      var9 = var9.rest();
    }
    if( NIL != var10 && NIL == var8 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var3, $ic132$ );
    }
    final SubLObject var11 = cdestructuring_bind.property_list_member( $ic126$, var4 );
    final SubLObject var12 = ( NIL != var11 ) ? conses_high.cadr( var11 ) : NIL;
    final SubLObject var13;
    var4 = ( var13 = var5 );
    return ConsesLow.listS( $ic129$, ConsesLow.list( var6, ConsesLow.list( $ic122$, var7 ), $ic126$, var12 ), ConsesLow.append( var13, NIL ) );
  }

  public static SubLObject f36463(final SubLObject var84, final SubLObject var29, final SubLObject var88)
  {
    assert NIL != constant_handles_oc.f8449( var29 ) : var29;
    assert NIL != Types.stringp( var88 ) : var88;
    module0067.f4886( f36436( var84 ), var29, var88 );
    return var84;
  }

  public static SubLObject f36464(final SubLObject var84, final SubLObject var29)
  {
    assert NIL != constant_handles_oc.f8449( var29 ) : var29;
    module0077.f5326( var29, f36437( var84 ) );
    return var84;
  }

  public static SubLObject f36465(final SubLObject var84, final SubLObject var31)
  {
    assert NIL != module0167.f10813( var31 ) : var31;
    module0077.f5326( var31, f36438( var84 ) );
    return var84;
  }

  public static SubLObject f36466(final SubLObject var84, final SubLObject var32)
  {
    assert NIL != assertion_handles_oc.f11035( var32 ) : var32;
    module0077.f5326( var32, f36439( var84 ) );
    return var84;
  }

  public static SubLObject f36467(final SubLObject var84, final SubLObject var33)
  {
    assert NIL != deduction_handles_oc.f11659( var33 ) : var33;
    module0077.f5326( var33, f36440( var84 ) );
    return var84;
  }

  public static SubLObject f36468(final SubLObject var84)
  {
    return f36399( f36450( var84 ) );
  }

  public static SubLObject f36469(final SubLObject var84)
  {
    return f36407( f36450( var84 ) );
  }

  public static SubLObject f36470(final SubLObject var84)
  {
    return f36408( f36450( var84 ) );
  }

  public static SubLObject f36471(final SubLObject var84)
  {
    return f36409( f36450( var84 ) );
  }

  public static SubLObject f36472(final SubLObject var84, final SubLObject var29)
  {
    return module0067.f4884( f36436( var84 ), var29, constants_high_oc.f10743( var29 ) );
  }

  public static SubLObject f36473(final SubLObject var84)
  {
    return Sort.sort( module0067.f4902( f36436( var84 ) ), Symbols.symbol_function( $ic134$ ), $ic135$ );
  }

  public static SubLObject f36474(final SubLObject var84)
  {
    return Sort.sort( module0077.f5312( f36437( var84 ) ), Symbols.symbol_function( $ic134$ ), $ic135$ );
  }

  public static SubLObject f36475(final SubLObject var84)
  {
    return Sort.sort( module0077.f5312( f36438( var84 ) ), Symbols.symbol_function( $ic134$ ), $ic136$ );
  }

  public static SubLObject f36476(final SubLObject var84)
  {
    return Sort.sort( module0077.f5312( f36439( var84 ) ), Symbols.symbol_function( $ic134$ ), $ic137$ );
  }

  public static SubLObject f36477(final SubLObject var84)
  {
    return Sort.sort( module0077.f5312( f36440( var84 ) ), Symbols.symbol_function( $ic134$ ), $ic138$ );
  }

  public static SubLObject f36478(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    assert NIL != f36385( var28 ) : var28;
    final SubLObject var30 = f36399( var28 );
    final SubLObject var31 = module0103.f7393( var30 );
    try
    {
      module0103.f7394( var31 );
      final SubLObject var32 = module0103.$g1343$.currentBinding( var29 );
      final SubLObject var33 = $g4556$.currentBinding( var29 );
      try
      {
        module0103.$g1343$.bind( var31, var29 );
        $g4556$.bind( $g4556$.getDynamicValue( var29 ), var29 );
        f36382();
        final SubLObject var11_133 = module0021.$g777$.currentBinding( var29 );
        try
        {
          module0021.$g777$.bind( NIL, var29 );
          module0021.f1149( $g4556$.getDynamicValue( var29 ) );
          f36479( var28 );
          f36480( var28 );
          f36481( var28 );
          f36482( var28 );
        }
        finally
        {
          module0021.$g777$.rebind( var11_133, var29 );
        }
      }
      finally
      {
        $g4556$.rebind( var33, var29 );
        module0103.$g1343$.rebind( var32, var29 );
      }
    }
    finally
    {
      final SubLObject var34 = Threads.$is_thread_performing_cleanupP$.currentBinding( var29 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, var29 );
        module0103.f7397( var31 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var34, var29 );
      }
    }
    return var28;
  }

  public static SubLObject f36479(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f36483() )
    {
      f36484( var28 );
      final SubLObject var30 = Numbers.add( ONE_INTEGER, module0164.f10677() );
      final SubLObject var31 = constant_handles_oc.f8425();
      final SubLObject var32 = $ic139$;
      final SubLObject var33 = module0065.f4733( var31 );
      SubLObject var34 = ZERO_INTEGER;
      assert NIL != Types.stringp( var32 ) : var32;
      final SubLObject var35 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var36 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var37 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var38 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var32 );
        final SubLObject var68_139 = var31;
        if( NIL == module0065.f4772( var68_139, $ic86$ ) )
        {
          final SubLObject var69_140 = var68_139;
          if( NIL == module0065.f4775( var69_140, $ic86$ ) )
          {
            final SubLObject var39 = module0065.f4740( var69_140 );
            final SubLObject var40 = NIL;
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for( var41 = Sequences.length( var39 ), var42 = NIL, var42 = ZERO_INTEGER; var42.numL( var41 ); var42 = Numbers.add( var42, ONE_INTEGER ) )
            {
              var43 = ( ( NIL != var40 ) ? Numbers.subtract( var41, var42, ONE_INTEGER ) : var42 );
              var44 = Vectors.aref( var39, var43 );
              if( NIL == module0065.f4749( var44 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var44 ) )
                {
                  var44 = $ic86$;
                }
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var43.numL( var30 ) )
                {
                  f36485( var28, var44 );
                }
              }
            }
          }
          final SubLObject var142_143 = var68_139;
          if( NIL == module0065.f4777( var142_143 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var45 = module0065.f4738( var142_143 );
            SubLObject var46 = module0065.f4739( var142_143 );
            final SubLObject var47 = module0065.f4734( var142_143 );
            final SubLObject var48 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var46.numL( var47 ))
            {
              final SubLObject var49 = Hashtables.gethash_without_values( var46, var45, var48 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var49 ) )
              {
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var46.numL( var30 ) )
                {
                  f36485( var28, var49 );
                }
              }
              var46 = Numbers.add( var46, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var38, var29 );
        module0012.$g77$.rebind( var37, var29 );
        module0012.$g76$.rebind( var36, var29 );
        module0012.$g75$.rebind( var35, var29 );
      }
    }
    else
    {
      final SubLObject var50 = constant_handles_oc.f8425();
      final SubLObject var51 = $ic140$;
      final SubLObject var52 = module0065.f4733( var50 );
      SubLObject var53 = ZERO_INTEGER;
      assert NIL != Types.stringp( var51 ) : var51;
      final SubLObject var54 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var55 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var56 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var57 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var51 );
        final SubLObject var68_140 = var50;
        if( NIL == module0065.f4772( var68_140, $ic86$ ) )
        {
          final SubLObject var69_141 = var68_140;
          if( NIL == module0065.f4775( var69_141, $ic86$ ) )
          {
            final SubLObject var58 = module0065.f4740( var69_141 );
            final SubLObject var59 = NIL;
            SubLObject var49;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            for( var60 = Sequences.length( var58 ), var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var60 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
            {
              var62 = ( ( NIL != var59 ) ? Numbers.subtract( var60, var61, ONE_INTEGER ) : var61 );
              var49 = Vectors.aref( var58, var62 );
              if( NIL == module0065.f4749( var49 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var49 ) )
                {
                  var49 = $ic86$;
                }
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36485( var28, var49 );
              }
            }
          }
          final SubLObject var142_144 = var68_140;
          if( NIL == module0065.f4777( var142_144 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var63 = module0065.f4738( var142_144 );
            SubLObject var64 = module0065.f4739( var142_144 );
            final SubLObject var65 = module0065.f4734( var142_144 );
            final SubLObject var66 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var64.numL( var65 ))
            {
              final SubLObject var67 = Hashtables.gethash_without_values( var64, var63, var66 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var67 ) )
              {
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36485( var28, var67 );
              }
              var64 = Numbers.add( var64, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var57, var29 );
        module0012.$g77$.rebind( var56, var29 );
        module0012.$g76$.rebind( var55, var29 );
        module0012.$g75$.rebind( var54, var29 );
      }
    }
    return var28;
  }

  public static SubLObject f36484(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    final SubLObject var30 = f36486();
    final SubLObject var31 = module0078.f5367( var30, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject var32 = module0164.f10677();
    final SubLObject var33 = NIL;
    SubLObject var34 = NIL;
    final SubLObject var35 = constant_handles_oc.f8425();
    final SubLObject var36 = $ic141$;
    final SubLObject var37 = module0065.f4733( var35 );
    SubLObject var38 = ZERO_INTEGER;
    assert NIL != Types.stringp( var36 ) : var36;
    final SubLObject var39 = module0012.$g75$.currentBinding( var29 );
    final SubLObject var40 = module0012.$g76$.currentBinding( var29 );
    final SubLObject var41 = module0012.$g77$.currentBinding( var29 );
    final SubLObject var42 = module0012.$g78$.currentBinding( var29 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var29 );
      module0012.$g76$.bind( NIL, var29 );
      module0012.$g77$.bind( T, var29 );
      module0012.$g78$.bind( Time.get_universal_time(), var29 );
      module0012.f478( var36 );
      final SubLObject var68_156 = var35;
      if( NIL == module0065.f4772( var68_156, $ic86$ ) )
      {
        final SubLObject var69_157 = var68_156;
        if( NIL == module0065.f4775( var69_157, $ic86$ ) )
        {
          final SubLObject var43 = module0065.f4740( var69_157 );
          final SubLObject var44 = NIL;
          final SubLObject var45 = Sequences.length( var43 );
          SubLObject var47;
          final SubLObject var46 = var47 = ( NIL != var44 ) ? ConsesLow.list( Numbers.subtract( var45, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, var45, ONE_INTEGER );
          SubLObject var48 = NIL;
          SubLObject var49 = NIL;
          SubLObject var50 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var48 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var49 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var50 = var47.first();
          var47 = var47.rest();
          if( NIL == var47 )
          {
            if( NIL == var34 )
            {
              SubLObject var51;
              SubLObject var52;
              SubLObject var53;
              SubLObject var154_165;
              SubLObject var54;
              for( var51 = var49, var52 = NIL, var52 = var48; NIL == var34 && NIL == module0005.f124( var52, var50, var51 ); var52 = Numbers.add( var52, var50 ) )
              {
                var53 = Vectors.aref( var43, var52 );
                if( NIL == module0065.f4749( var53 ) || NIL == module0065.f4773( $ic86$ ) )
                {
                  if( NIL != module0065.f4749( var53 ) )
                  {
                    var53 = $ic86$;
                  }
                  module0012.note_percent_progress( var38, var37 );
                  var38 = Numbers.add( var38, ONE_INTEGER );
                  var154_165 = Numbers.numL( var32, var52 );
                  if( NIL == var154_165 )
                  {
                    var54 = constants_high_oc.f10749( var53 );
                    if( NIL == module0077.f5320( var54, var31 ) )
                    {
                      f36403( var28, var53, var54 );
                    }
                  }
                  var34 = var154_165;
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var46, $ic142$ );
          }
        }
        final SubLObject var142_166 = var68_156;
        if( NIL == module0065.f4777( var142_166 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var55 = module0065.f4738( var142_166 );
          SubLObject var56 = module0065.f4739( var142_166 );
          final SubLObject var57 = module0065.f4734( var142_166 );
          final SubLObject var58 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var56.numL( var57 ) && NIL == var34)
          {
            final SubLObject var59 = Hashtables.gethash_without_values( var56, var55, var58 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var59 ) )
            {
              module0012.note_percent_progress( var38, var37 );
              var38 = Numbers.add( var38, ONE_INTEGER );
              final SubLObject var154_166 = Numbers.numL( var32, var56 );
              if( NIL == var154_166 )
              {
                final SubLObject var60 = constants_high_oc.f10749( var59 );
                if( NIL == module0077.f5320( var60, var31 ) )
                {
                  f36403( var28, var59, var60 );
                }
              }
              var34 = var154_166;
            }
            var56 = Numbers.add( var56, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var42, var29 );
      module0012.$g77$.rebind( var41, var29 );
      module0012.$g76$.rebind( var40, var29 );
      module0012.$g75$.rebind( var39, var29 );
    }
    return NIL;
  }

  public static SubLObject f36485(final SubLObject var28, final SubLObject var29)
  {
    final SubLObject var30 = f36487( var29 );
    if( NIL != var30 )
    {
      f36403( var28, var29, var30 );
    }
    return NIL;
  }

  public static SubLObject f36480(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f36488() )
    {
      f36489( var28 );
      final SubLObject var30 = Numbers.add( ONE_INTEGER, module0167.f10810() );
      final SubLObject var31 = module0167.f10788();
      final SubLObject var32 = $ic143$;
      final SubLObject var33 = module0065.f4733( var31 );
      SubLObject var34 = ZERO_INTEGER;
      assert NIL != Types.stringp( var32 ) : var32;
      final SubLObject var35 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var36 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var37 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var38 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var32 );
        final SubLObject var68_169 = var31;
        if( NIL == module0065.f4772( var68_169, $ic86$ ) )
        {
          final SubLObject var69_170 = var68_169;
          if( NIL == module0065.f4775( var69_170, $ic86$ ) )
          {
            final SubLObject var39 = module0065.f4740( var69_170 );
            final SubLObject var40 = NIL;
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for( var41 = Sequences.length( var39 ), var42 = NIL, var42 = ZERO_INTEGER; var42.numL( var41 ); var42 = Numbers.add( var42, ONE_INTEGER ) )
            {
              var43 = ( ( NIL != var40 ) ? Numbers.subtract( var41, var42, ONE_INTEGER ) : var42 );
              var44 = Vectors.aref( var39, var43 );
              if( NIL == module0065.f4749( var44 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var44 ) )
                {
                  var44 = $ic86$;
                }
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var43.numL( var30 ) )
                {
                  f36490( var28, var44 );
                }
              }
            }
          }
          final SubLObject var142_171 = var68_169;
          if( NIL == module0065.f4777( var142_171 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var45 = module0065.f4738( var142_171 );
            SubLObject var46 = module0065.f4739( var142_171 );
            final SubLObject var47 = module0065.f4734( var142_171 );
            final SubLObject var48 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var46.numL( var47 ))
            {
              final SubLObject var49 = Hashtables.gethash_without_values( var46, var45, var48 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var49 ) )
              {
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var46.numL( var30 ) )
                {
                  f36490( var28, var49 );
                }
              }
              var46 = Numbers.add( var46, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var38, var29 );
        module0012.$g77$.rebind( var37, var29 );
        module0012.$g76$.rebind( var36, var29 );
        module0012.$g75$.rebind( var35, var29 );
      }
    }
    else
    {
      final SubLObject var50 = module0167.f10788();
      final SubLObject var51 = $ic144$;
      final SubLObject var52 = module0065.f4733( var50 );
      SubLObject var53 = ZERO_INTEGER;
      assert NIL != Types.stringp( var51 ) : var51;
      final SubLObject var54 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var55 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var56 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var57 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var51 );
        final SubLObject var68_170 = var50;
        if( NIL == module0065.f4772( var68_170, $ic86$ ) )
        {
          final SubLObject var69_171 = var68_170;
          if( NIL == module0065.f4775( var69_171, $ic86$ ) )
          {
            final SubLObject var58 = module0065.f4740( var69_171 );
            final SubLObject var59 = NIL;
            SubLObject var49;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            for( var60 = Sequences.length( var58 ), var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var60 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
            {
              var62 = ( ( NIL != var59 ) ? Numbers.subtract( var60, var61, ONE_INTEGER ) : var61 );
              var49 = Vectors.aref( var58, var62 );
              if( NIL == module0065.f4749( var49 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var49 ) )
                {
                  var49 = $ic86$;
                }
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36490( var28, var49 );
              }
            }
          }
          final SubLObject var142_172 = var68_170;
          if( NIL == module0065.f4777( var142_172 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var63 = module0065.f4738( var142_172 );
            SubLObject var64 = module0065.f4739( var142_172 );
            final SubLObject var65 = module0065.f4734( var142_172 );
            final SubLObject var66 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var64.numL( var65 ))
            {
              final SubLObject var67 = Hashtables.gethash_without_values( var64, var63, var66 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var67 ) )
              {
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36490( var28, var67 );
              }
              var64 = Numbers.add( var64, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var57, var29 );
        module0012.$g77$.rebind( var56, var29 );
        module0012.$g76$.rebind( var55, var29 );
        module0012.$g75$.rebind( var54, var29 );
      }
    }
    return var28;
  }

  public static SubLObject f36489(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    final SubLObject var30 = f36491();
    final SubLObject var31 = module0078.f5367( var30, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject var32 = module0167.f10810();
    final SubLObject var33 = NIL;
    SubLObject var34 = NIL;
    final SubLObject var35 = module0167.f10788();
    final SubLObject var36 = $ic145$;
    final SubLObject var37 = module0065.f4733( var35 );
    SubLObject var38 = ZERO_INTEGER;
    assert NIL != Types.stringp( var36 ) : var36;
    final SubLObject var39 = module0012.$g75$.currentBinding( var29 );
    final SubLObject var40 = module0012.$g76$.currentBinding( var29 );
    final SubLObject var41 = module0012.$g77$.currentBinding( var29 );
    final SubLObject var42 = module0012.$g78$.currentBinding( var29 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var29 );
      module0012.$g76$.bind( NIL, var29 );
      module0012.$g77$.bind( T, var29 );
      module0012.$g78$.bind( Time.get_universal_time(), var29 );
      module0012.f478( var36 );
      final SubLObject var68_176 = var35;
      if( NIL == module0065.f4772( var68_176, $ic86$ ) )
      {
        final SubLObject var69_177 = var68_176;
        if( NIL == module0065.f4775( var69_177, $ic86$ ) )
        {
          final SubLObject var43 = module0065.f4740( var69_177 );
          final SubLObject var44 = NIL;
          final SubLObject var45 = Sequences.length( var43 );
          SubLObject var47;
          final SubLObject var46 = var47 = ( NIL != var44 ) ? ConsesLow.list( Numbers.subtract( var45, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, var45, ONE_INTEGER );
          SubLObject var48 = NIL;
          SubLObject var49 = NIL;
          SubLObject var50 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var48 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var49 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var50 = var47.first();
          var47 = var47.rest();
          if( NIL == var47 )
          {
            if( NIL == var34 )
            {
              SubLObject var51;
              SubLObject var52;
              SubLObject var53;
              SubLObject var154_180;
              SubLObject var54;
              for( var51 = var49, var52 = NIL, var52 = var48; NIL == var34 && NIL == module0005.f124( var52, var50, var51 ); var52 = Numbers.add( var52, var50 ) )
              {
                var53 = Vectors.aref( var43, var52 );
                if( NIL == module0065.f4749( var53 ) || NIL == module0065.f4773( $ic86$ ) )
                {
                  if( NIL != module0065.f4749( var53 ) )
                  {
                    var53 = $ic86$;
                  }
                  module0012.note_percent_progress( var38, var37 );
                  var38 = Numbers.add( var38, ONE_INTEGER );
                  var154_180 = Numbers.numL( var32, var52 );
                  if( NIL == var154_180 )
                  {
                    var54 = module0167.f10803( var53 );
                    if( NIL == module0077.f5320( var54, var31 ) )
                    {
                      f36404( var28, var53, var54 );
                    }
                  }
                  var34 = var154_180;
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var46, $ic142$ );
          }
        }
        final SubLObject var142_181 = var68_176;
        if( NIL == module0065.f4777( var142_181 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var55 = module0065.f4738( var142_181 );
          SubLObject var56 = module0065.f4739( var142_181 );
          final SubLObject var57 = module0065.f4734( var142_181 );
          final SubLObject var58 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var56.numL( var57 ) && NIL == var34)
          {
            final SubLObject var59 = Hashtables.gethash_without_values( var56, var55, var58 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var59 ) )
            {
              module0012.note_percent_progress( var38, var37 );
              var38 = Numbers.add( var38, ONE_INTEGER );
              final SubLObject var154_181 = Numbers.numL( var32, var56 );
              if( NIL == var154_181 )
              {
                final SubLObject var60 = module0167.f10803( var59 );
                if( NIL == module0077.f5320( var60, var31 ) )
                {
                  f36404( var28, var59, var60 );
                }
              }
              var34 = var154_181;
            }
            var56 = Numbers.add( var56, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var42, var29 );
      module0012.$g77$.rebind( var41, var29 );
      module0012.$g76$.rebind( var40, var29 );
      module0012.$g75$.rebind( var39, var29 );
    }
    return NIL;
  }

  public static SubLObject f36490(final SubLObject var28, final SubLObject var31)
  {
    if( NIL == f36419( var28, var31 ) )
    {
      final SubLObject var32 = f36492( var31 );
      if( NIL != var32 )
      {
        f36404( var28, var31, var32 );
      }
    }
    return NIL;
  }

  public static SubLObject f36481(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f36493() )
    {
      f36494( var28 );
      final SubLObject var30 = Numbers.add( ONE_INTEGER, assertion_handles_oc.f11032() );
      final SubLObject var31 = assertion_handles_oc.f11010();
      final SubLObject var32 = $ic146$;
      final SubLObject var33 = module0065.f4733( var31 );
      SubLObject var34 = ZERO_INTEGER;
      assert NIL != Types.stringp( var32 ) : var32;
      final SubLObject var35 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var36 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var37 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var38 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var32 );
        final SubLObject var68_184 = var31;
        if( NIL == module0065.f4772( var68_184, $ic86$ ) )
        {
          final SubLObject var69_185 = var68_184;
          if( NIL == module0065.f4775( var69_185, $ic86$ ) )
          {
            final SubLObject var39 = module0065.f4740( var69_185 );
            final SubLObject var40 = NIL;
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for( var41 = Sequences.length( var39 ), var42 = NIL, var42 = ZERO_INTEGER; var42.numL( var41 ); var42 = Numbers.add( var42, ONE_INTEGER ) )
            {
              var43 = ( ( NIL != var40 ) ? Numbers.subtract( var41, var42, ONE_INTEGER ) : var42 );
              var44 = Vectors.aref( var39, var43 );
              if( NIL == module0065.f4749( var44 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var44 ) )
                {
                  var44 = $ic86$;
                }
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var43.numL( var30 ) )
                {
                  f36495( var28, var44 );
                }
              }
            }
          }
          final SubLObject var142_186 = var68_184;
          if( NIL == module0065.f4777( var142_186 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var45 = module0065.f4738( var142_186 );
            SubLObject var46 = module0065.f4739( var142_186 );
            final SubLObject var47 = module0065.f4734( var142_186 );
            final SubLObject var48 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var46.numL( var47 ))
            {
              final SubLObject var49 = Hashtables.gethash_without_values( var46, var45, var48 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var49 ) )
              {
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var46.numL( var30 ) )
                {
                  f36495( var28, var49 );
                }
              }
              var46 = Numbers.add( var46, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var38, var29 );
        module0012.$g77$.rebind( var37, var29 );
        module0012.$g76$.rebind( var36, var29 );
        module0012.$g75$.rebind( var35, var29 );
      }
    }
    else
    {
      final SubLObject var50 = assertion_handles_oc.f11010();
      final SubLObject var51 = $ic147$;
      final SubLObject var52 = module0065.f4733( var50 );
      SubLObject var53 = ZERO_INTEGER;
      assert NIL != Types.stringp( var51 ) : var51;
      final SubLObject var54 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var55 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var56 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var57 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var51 );
        final SubLObject var68_185 = var50;
        if( NIL == module0065.f4772( var68_185, $ic86$ ) )
        {
          final SubLObject var69_186 = var68_185;
          if( NIL == module0065.f4775( var69_186, $ic86$ ) )
          {
            final SubLObject var58 = module0065.f4740( var69_186 );
            final SubLObject var59 = NIL;
            SubLObject var49;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            for( var60 = Sequences.length( var58 ), var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var60 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
            {
              var62 = ( ( NIL != var59 ) ? Numbers.subtract( var60, var61, ONE_INTEGER ) : var61 );
              var49 = Vectors.aref( var58, var62 );
              if( NIL == module0065.f4749( var49 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var49 ) )
                {
                  var49 = $ic86$;
                }
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36495( var28, var49 );
              }
            }
          }
          final SubLObject var142_187 = var68_185;
          if( NIL == module0065.f4777( var142_187 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var63 = module0065.f4738( var142_187 );
            SubLObject var64 = module0065.f4739( var142_187 );
            final SubLObject var65 = module0065.f4734( var142_187 );
            final SubLObject var66 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var64.numL( var65 ))
            {
              final SubLObject var67 = Hashtables.gethash_without_values( var64, var63, var66 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var67 ) )
              {
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                f36495( var28, var67 );
              }
              var64 = Numbers.add( var64, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var57, var29 );
        module0012.$g77$.rebind( var56, var29 );
        module0012.$g76$.rebind( var55, var29 );
        module0012.$g75$.rebind( var54, var29 );
      }
    }
    return var28;
  }

  public static SubLObject f36494(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    final SubLObject var30 = f36496();
    final SubLObject var31 = module0078.f5367( var30, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject var32 = assertion_handles_oc.f11032();
    final SubLObject var33 = NIL;
    SubLObject var34 = NIL;
    final SubLObject var35 = assertion_handles_oc.f11010();
    final SubLObject var36 = $ic148$;
    final SubLObject var37 = module0065.f4733( var35 );
    SubLObject var38 = ZERO_INTEGER;
    assert NIL != Types.stringp( var36 ) : var36;
    final SubLObject var39 = module0012.$g75$.currentBinding( var29 );
    final SubLObject var40 = module0012.$g76$.currentBinding( var29 );
    final SubLObject var41 = module0012.$g77$.currentBinding( var29 );
    final SubLObject var42 = module0012.$g78$.currentBinding( var29 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var29 );
      module0012.$g76$.bind( NIL, var29 );
      module0012.$g77$.bind( T, var29 );
      module0012.$g78$.bind( Time.get_universal_time(), var29 );
      module0012.f478( var36 );
      final SubLObject var68_191 = var35;
      if( NIL == module0065.f4772( var68_191, $ic86$ ) )
      {
        final SubLObject var69_192 = var68_191;
        if( NIL == module0065.f4775( var69_192, $ic86$ ) )
        {
          final SubLObject var43 = module0065.f4740( var69_192 );
          final SubLObject var44 = NIL;
          final SubLObject var45 = Sequences.length( var43 );
          SubLObject var47;
          final SubLObject var46 = var47 = ( NIL != var44 ) ? ConsesLow.list( Numbers.subtract( var45, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, var45, ONE_INTEGER );
          SubLObject var48 = NIL;
          SubLObject var49 = NIL;
          SubLObject var50 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var48 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var49 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var50 = var47.first();
          var47 = var47.rest();
          if( NIL == var47 )
          {
            if( NIL == var34 )
            {
              SubLObject var51;
              SubLObject var52;
              SubLObject var53;
              SubLObject var154_195;
              SubLObject var54;
              for( var51 = var49, var52 = NIL, var52 = var48; NIL == var34 && NIL == module0005.f124( var52, var50, var51 ); var52 = Numbers.add( var52, var50 ) )
              {
                var53 = Vectors.aref( var43, var52 );
                if( NIL == module0065.f4749( var53 ) || NIL == module0065.f4773( $ic86$ ) )
                {
                  if( NIL != module0065.f4749( var53 ) )
                  {
                    var53 = $ic86$;
                  }
                  module0012.note_percent_progress( var38, var37 );
                  var38 = Numbers.add( var38, ONE_INTEGER );
                  var154_195 = Numbers.numL( var32, var52 );
                  if( NIL == var154_195 )
                  {
                    var54 = assertion_handles_oc.f11025( var53 );
                    if( NIL == module0077.f5320( var54, var31 ) )
                    {
                      f36405( var28, var53, var54 );
                    }
                  }
                  var34 = var154_195;
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var46, $ic142$ );
          }
        }
        final SubLObject var142_196 = var68_191;
        if( NIL == module0065.f4777( var142_196 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var55 = module0065.f4738( var142_196 );
          SubLObject var56 = module0065.f4739( var142_196 );
          final SubLObject var57 = module0065.f4734( var142_196 );
          final SubLObject var58 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var56.numL( var57 ) && NIL == var34)
          {
            final SubLObject var59 = Hashtables.gethash_without_values( var56, var55, var58 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var59 ) )
            {
              module0012.note_percent_progress( var38, var37 );
              var38 = Numbers.add( var38, ONE_INTEGER );
              final SubLObject var154_196 = Numbers.numL( var32, var56 );
              if( NIL == var154_196 )
              {
                final SubLObject var60 = assertion_handles_oc.f11025( var59 );
                if( NIL == module0077.f5320( var60, var31 ) )
                {
                  f36405( var28, var59, var60 );
                }
              }
              var34 = var154_196;
            }
            var56 = Numbers.add( var56, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var42, var29 );
      module0012.$g77$.rebind( var41, var29 );
      module0012.$g76$.rebind( var40, var29 );
      module0012.$g75$.rebind( var39, var29 );
    }
    return NIL;
  }

  public static SubLObject f36495(final SubLObject var28, final SubLObject var32)
  {
    if( NIL == f36421( var28, var32 ) )
    {
      final SubLObject var33 = f36497( var32 );
      if( NIL != var33 )
      {
        f36405( var28, var32, var33 );
      }
    }
    return NIL;
  }

  public static SubLObject f36482(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    if( NIL != f36498() )
    {
      f36499( var28 );
      final SubLObject var30 = Numbers.add( ONE_INTEGER, deduction_handles_oc.f11656() );
      final SubLObject var31 = deduction_handles_oc.f11634();
      final SubLObject var32 = $ic149$;
      final SubLObject var33 = module0065.f4733( var31 );
      SubLObject var34 = ZERO_INTEGER;
      assert NIL != Types.stringp( var32 ) : var32;
      final SubLObject var35 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var36 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var37 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var38 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var32 );
        final SubLObject var68_199 = var31;
        if( NIL == module0065.f4772( var68_199, $ic86$ ) )
        {
          final SubLObject var69_200 = var68_199;
          if( NIL == module0065.f4775( var69_200, $ic86$ ) )
          {
            final SubLObject var39 = module0065.f4740( var69_200 );
            final SubLObject var40 = NIL;
            SubLObject var41;
            SubLObject var42;
            SubLObject var43;
            SubLObject var44;
            for( var41 = Sequences.length( var39 ), var42 = NIL, var42 = ZERO_INTEGER; var42.numL( var41 ); var42 = Numbers.add( var42, ONE_INTEGER ) )
            {
              var43 = ( ( NIL != var40 ) ? Numbers.subtract( var41, var42, ONE_INTEGER ) : var42 );
              var44 = Vectors.aref( var39, var43 );
              if( NIL == module0065.f4749( var44 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var44 ) )
                {
                  var44 = $ic86$;
                }
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var43.numL( var30 ) )
                {
                  f36500( var28, var44 );
                }
              }
            }
          }
          final SubLObject var142_201 = var68_199;
          if( NIL == module0065.f4777( var142_201 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var45 = module0065.f4738( var142_201 );
            SubLObject var46 = module0065.f4739( var142_201 );
            final SubLObject var47 = module0065.f4734( var142_201 );
            final SubLObject var48 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var46.numL( var47 ))
            {
              final SubLObject var49 = Hashtables.gethash_without_values( var46, var45, var48 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var49 ) )
              {
                module0012.note_percent_progress( var34, var33 );
                var34 = Numbers.add( var34, ONE_INTEGER );
                if( !var46.numL( var30 ) )
                {
                  f36500( var28, var49 );
                }
              }
              var46 = Numbers.add( var46, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var38, var29 );
        module0012.$g77$.rebind( var37, var29 );
        module0012.$g76$.rebind( var36, var29 );
        module0012.$g75$.rebind( var35, var29 );
      }
    }
    else
    {
      final SubLObject var50 = deduction_handles_oc.f11634();
      final SubLObject var51 = $ic150$;
      final SubLObject var52 = module0065.f4733( var50 );
      SubLObject var53 = ZERO_INTEGER;
      assert NIL != Types.stringp( var51 ) : var51;
      final SubLObject var54 = module0012.$g75$.currentBinding( var29 );
      final SubLObject var55 = module0012.$g76$.currentBinding( var29 );
      final SubLObject var56 = module0012.$g77$.currentBinding( var29 );
      final SubLObject var57 = module0012.$g78$.currentBinding( var29 );
      try
      {
        module0012.$g75$.bind( ZERO_INTEGER, var29 );
        module0012.$g76$.bind( NIL, var29 );
        module0012.$g77$.bind( T, var29 );
        module0012.$g78$.bind( Time.get_universal_time(), var29 );
        module0012.f478( var51 );
        final SubLObject var68_200 = var50;
        if( NIL == module0065.f4772( var68_200, $ic86$ ) )
        {
          final SubLObject var69_201 = var68_200;
          if( NIL == module0065.f4775( var69_201, $ic86$ ) )
          {
            final SubLObject var58 = module0065.f4740( var69_201 );
            final SubLObject var59 = NIL;
            SubLObject var49;
            SubLObject var60;
            SubLObject var61;
            SubLObject var62;
            for( var60 = Sequences.length( var58 ), var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var60 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
            {
              var62 = ( ( NIL != var59 ) ? Numbers.subtract( var60, var61, ONE_INTEGER ) : var61 );
              var49 = Vectors.aref( var58, var62 );
              if( NIL == module0065.f4749( var49 ) || NIL == module0065.f4773( $ic86$ ) )
              {
                if( NIL != module0065.f4749( var49 ) )
                {
                  var49 = $ic86$;
                }
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                if( NIL != deduction_handles_oc.f11665( var49, T ) )
                {
                  f36500( var28, var49 );
                }
              }
            }
          }
          final SubLObject var142_202 = var68_200;
          if( NIL == module0065.f4777( var142_202 ) || NIL == module0065.f4773( $ic86$ ) )
          {
            final SubLObject var63 = module0065.f4738( var142_202 );
            SubLObject var64 = module0065.f4739( var142_202 );
            final SubLObject var65 = module0065.f4734( var142_202 );
            final SubLObject var66 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
            while ( var64.numL( var65 ))
            {
              final SubLObject var67 = Hashtables.gethash_without_values( var64, var63, var66 );
              if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var67 ) )
              {
                module0012.note_percent_progress( var53, var52 );
                var53 = Numbers.add( var53, ONE_INTEGER );
                if( NIL != deduction_handles_oc.f11665( var67, T ) )
                {
                  f36500( var28, var67 );
                }
              }
              var64 = Numbers.add( var64, ONE_INTEGER );
            }
          }
        }
        module0012.f479();
      }
      finally
      {
        module0012.$g78$.rebind( var57, var29 );
        module0012.$g77$.rebind( var56, var29 );
        module0012.$g76$.rebind( var55, var29 );
        module0012.$g75$.rebind( var54, var29 );
      }
    }
    return var28;
  }

  public static SubLObject f36499(final SubLObject var28)
  {
    final SubLThread var29 = SubLProcess.currentSubLThread();
    final SubLObject var30 = f36501();
    final SubLObject var31 = module0078.f5367( var30, Symbols.symbol_function( EQL ), UNPROVIDED );
    final SubLObject var32 = deduction_handles_oc.f11656();
    final SubLObject var33 = NIL;
    SubLObject var34 = NIL;
    final SubLObject var35 = deduction_handles_oc.f11634();
    final SubLObject var36 = $ic151$;
    final SubLObject var37 = module0065.f4733( var35 );
    SubLObject var38 = ZERO_INTEGER;
    assert NIL != Types.stringp( var36 ) : var36;
    final SubLObject var39 = module0012.$g75$.currentBinding( var29 );
    final SubLObject var40 = module0012.$g76$.currentBinding( var29 );
    final SubLObject var41 = module0012.$g77$.currentBinding( var29 );
    final SubLObject var42 = module0012.$g78$.currentBinding( var29 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var29 );
      module0012.$g76$.bind( NIL, var29 );
      module0012.$g77$.bind( T, var29 );
      module0012.$g78$.bind( Time.get_universal_time(), var29 );
      module0012.f478( var36 );
      final SubLObject var68_206 = var35;
      if( NIL == module0065.f4772( var68_206, $ic86$ ) )
      {
        final SubLObject var69_207 = var68_206;
        if( NIL == module0065.f4775( var69_207, $ic86$ ) )
        {
          final SubLObject var43 = module0065.f4740( var69_207 );
          final SubLObject var44 = NIL;
          final SubLObject var45 = Sequences.length( var43 );
          SubLObject var47;
          final SubLObject var46 = var47 = ( NIL != var44 ) ? ConsesLow.list( Numbers.subtract( var45, ONE_INTEGER ), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER ) : ConsesLow.list( ZERO_INTEGER, var45, ONE_INTEGER );
          SubLObject var48 = NIL;
          SubLObject var49 = NIL;
          SubLObject var50 = NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var48 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var49 = var47.first();
          var47 = var47.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var47, var46, $ic142$ );
          var50 = var47.first();
          var47 = var47.rest();
          if( NIL == var47 )
          {
            if( NIL == var34 )
            {
              SubLObject var51;
              SubLObject var52;
              SubLObject var53;
              SubLObject var154_210;
              SubLObject var54;
              for( var51 = var49, var52 = NIL, var52 = var48; NIL == var34 && NIL == module0005.f124( var52, var50, var51 ); var52 = Numbers.add( var52, var50 ) )
              {
                var53 = Vectors.aref( var43, var52 );
                if( NIL == module0065.f4749( var53 ) || NIL == module0065.f4773( $ic86$ ) )
                {
                  if( NIL != module0065.f4749( var53 ) )
                  {
                    var53 = $ic86$;
                  }
                  module0012.note_percent_progress( var38, var37 );
                  var38 = Numbers.add( var38, ONE_INTEGER );
                  var154_210 = Numbers.numL( var32, var52 );
                  if( NIL == var154_210 )
                  {
                    var54 = deduction_handles_oc.f11649( var53 );
                    if( NIL == module0077.f5320( var54, var31 ) )
                    {
                      f36406( var28, var53, var54 );
                    }
                  }
                  var34 = var154_210;
                }
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var46, $ic142$ );
          }
        }
        final SubLObject var142_211 = var68_206;
        if( NIL == module0065.f4777( var142_211 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var55 = module0065.f4738( var142_211 );
          SubLObject var56 = module0065.f4739( var142_211 );
          final SubLObject var57 = module0065.f4734( var142_211 );
          final SubLObject var58 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var56.numL( var57 ) && NIL == var34)
          {
            final SubLObject var59 = Hashtables.gethash_without_values( var56, var55, var58 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var59 ) )
            {
              module0012.note_percent_progress( var38, var37 );
              var38 = Numbers.add( var38, ONE_INTEGER );
              final SubLObject var154_211 = Numbers.numL( var32, var56 );
              if( NIL == var154_211 )
              {
                final SubLObject var60 = deduction_handles_oc.f11649( var59 );
                if( NIL == module0077.f5320( var60, var31 ) )
                {
                  f36406( var28, var59, var60 );
                }
              }
              var34 = var154_211;
            }
            var56 = Numbers.add( var56, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var42, var29 );
      module0012.$g77$.rebind( var41, var29 );
      module0012.$g76$.rebind( var40, var29 );
      module0012.$g75$.rebind( var39, var29 );
    }
    return NIL;
  }

  public static SubLObject f36500(final SubLObject var28, final SubLObject var33)
  {
    if( NIL == f36423( var28, var33 ) )
    {
      final SubLObject var34 = f36502( var33 );
      if( NIL != var34 )
      {
        f36406( var28, var33, var34 );
      }
    }
    return NIL;
  }

  public static SubLObject f36503(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    assert NIL != f36434( var84 ) : var84;
    final SubLObject var86 = f36468( var84 );
    final SubLObject var87 = module0103.f7393( var86 );
    try
    {
      module0103.f7394( var87 );
      final SubLObject var88 = module0103.$g1343$.currentBinding( var85 );
      final SubLObject var89 = $g4556$.currentBinding( var85 );
      try
      {
        module0103.$g1343$.bind( var87, var85 );
        $g4556$.bind( $g4556$.getDynamicValue( var85 ), var85 );
        f36382();
        final SubLObject var11_213 = module0021.$g777$.currentBinding( var85 );
        try
        {
          module0021.$g777$.bind( NIL, var85 );
          module0021.f1149( $g4556$.getDynamicValue( var85 ) );
          f36504( var84 );
          f36505( var84 );
          f36506( var84 );
          f36507( var84 );
          f36508( var84 );
        }
        finally
        {
          module0021.$g777$.rebind( var11_213, var85 );
        }
      }
      finally
      {
        $g4556$.rebind( var89, var85 );
        module0103.$g1343$.rebind( var88, var85 );
      }
    }
    finally
    {
      final SubLObject var90 = Threads.$is_thread_performing_cleanupP$.currentBinding( var85 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, var85 );
        module0103.f7397( var87 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var90, var85 );
      }
    }
    return var84;
  }

  public static SubLObject f36504(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    final SubLObject var86 = f36450( var84 );
    final SubLObject var87 = $ic152$;
    final SubLObject var88 = f36402( var86 );
    final SubLObject var89 = var87;
    final SubLObject var90 = module0065.f4733( var88 );
    SubLObject var91 = ZERO_INTEGER;
    assert NIL != Types.stringp( var89 ) : var89;
    final SubLObject var92 = module0012.$g75$.currentBinding( var85 );
    final SubLObject var93 = module0012.$g76$.currentBinding( var85 );
    final SubLObject var94 = module0012.$g77$.currentBinding( var85 );
    final SubLObject var95 = module0012.$g78$.currentBinding( var85 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var85 );
      module0012.$g76$.bind( NIL, var85 );
      module0012.$g77$.bind( T, var85 );
      module0012.$g78$.bind( Time.get_universal_time(), var85 );
      module0012.f478( var89 );
      final SubLObject var68_214 = var88;
      if( NIL == module0065.f4772( var68_214, $ic86$ ) )
      {
        final SubLObject var69_215 = var68_214;
        if( NIL == module0065.f4775( var69_215, $ic86$ ) )
        {
          final SubLObject var96 = module0065.f4740( var69_215 );
          final SubLObject var97 = NIL;
          SubLObject var98;
          SubLObject var99;
          SubLObject var100;
          SubLObject var101;
          SubLObject var102;
          SubLObject var30_218;
          SubLObject var103;
          for( var98 = Sequences.length( var96 ), var99 = NIL, var99 = ZERO_INTEGER; var99.numL( var98 ); var99 = Numbers.add( var99, ONE_INTEGER ) )
          {
            var100 = ( ( NIL != var97 ) ? Numbers.subtract( var98, var99, ONE_INTEGER ) : var99 );
            var101 = Vectors.aref( var96, var100 );
            if( NIL == module0065.f4749( var101 ) || NIL == module0065.f4773( $ic86$ ) )
            {
              if( NIL != module0065.f4749( var101 ) )
              {
                var101 = $ic86$;
              }
              module0012.note_percent_progress( var91, var90 );
              var91 = Numbers.add( var91, ONE_INTEGER );
              var102 = constants_high_oc.f10752( var100 );
              var30_218 = f36411( var86, var102 );
              var103 = f36509( var30_218 );
              if( !var103.equal( constants_high_oc.f10743( var102 ) ) )
              {
                f36463( var84, var102, var103 );
              }
            }
          }
        }
        final SubLObject var76_219 = var68_214;
        if( NIL == module0065.f4777( var76_219 ) )
        {
          final SubLObject var104 = module0065.f4738( var76_219 );
          SubLObject var105 = NIL;
          SubLObject var106 = NIL;
          final Iterator var107 = Hashtables.getEntrySetIterator( var104 );
          try
          {
            while ( Hashtables.iteratorHasNext( var107 ))
            {
              final Map.Entry var108 = Hashtables.iteratorNextEntry( var107 );
              var105 = Hashtables.getEntryKey( var108 );
              var106 = Hashtables.getEntryValue( var108 );
              module0012.note_percent_progress( var91, var90 );
              var91 = Numbers.add( var91, ONE_INTEGER );
              final SubLObject var109 = constants_high_oc.f10752( var105 );
              final SubLObject var30_219 = f36411( var86, var109 );
              final SubLObject var110 = f36509( var30_219 );
              if( !var110.equal( constants_high_oc.f10743( var109 ) ) )
              {
                f36463( var84, var109, var110 );
              }
            }
          }
          finally
          {
            Hashtables.releaseEntrySetIterator( var107 );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var95, var85 );
      module0012.$g77$.rebind( var94, var85 );
      module0012.$g76$.rebind( var93, var85 );
      module0012.$g75$.rebind( var92, var85 );
    }
    return NIL;
  }

  public static SubLObject f36505(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    final SubLObject var86 = f36450( var84 );
    final SubLObject var87 = constant_handles_oc.f8425();
    final SubLObject var88 = $ic153$;
    final SubLObject var89 = module0065.f4733( var87 );
    SubLObject var90 = ZERO_INTEGER;
    assert NIL != Types.stringp( var88 ) : var88;
    final SubLObject var91 = module0012.$g75$.currentBinding( var85 );
    final SubLObject var92 = module0012.$g76$.currentBinding( var85 );
    final SubLObject var93 = module0012.$g77$.currentBinding( var85 );
    final SubLObject var94 = module0012.$g78$.currentBinding( var85 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var85 );
      module0012.$g76$.bind( NIL, var85 );
      module0012.$g77$.bind( T, var85 );
      module0012.$g78$.bind( Time.get_universal_time(), var85 );
      module0012.f478( var88 );
      final SubLObject var68_221 = var87;
      if( NIL == module0065.f4772( var68_221, $ic86$ ) )
      {
        final SubLObject var69_222 = var68_221;
        if( NIL == module0065.f4775( var69_222, $ic86$ ) )
        {
          final SubLObject var95 = module0065.f4740( var69_222 );
          final SubLObject var96 = NIL;
          SubLObject var97;
          SubLObject var98;
          SubLObject var99;
          SubLObject var100;
          for( var97 = Sequences.length( var95 ), var98 = NIL, var98 = ZERO_INTEGER; var98.numL( var97 ); var98 = Numbers.add( var98, ONE_INTEGER ) )
          {
            var99 = ( ( NIL != var96 ) ? Numbers.subtract( var97, var98, ONE_INTEGER ) : var98 );
            var100 = Vectors.aref( var95, var99 );
            if( NIL == module0065.f4749( var100 ) || NIL == module0065.f4773( $ic86$ ) )
            {
              if( NIL != module0065.f4749( var100 ) )
              {
                var100 = $ic86$;
              }
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36410( var86, var100 ) )
              {
                f36464( var84, var100 );
              }
            }
          }
        }
        final SubLObject var142_223 = var68_221;
        if( NIL == module0065.f4777( var142_223 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var101 = module0065.f4738( var142_223 );
          SubLObject var102 = module0065.f4739( var142_223 );
          final SubLObject var103 = module0065.f4734( var142_223 );
          final SubLObject var104 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var102.numL( var103 ))
          {
            final SubLObject var105 = Hashtables.gethash_without_values( var102, var101, var104 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var105 ) )
            {
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36410( var86, var105 ) )
              {
                f36464( var84, var105 );
              }
            }
            var102 = Numbers.add( var102, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var94, var85 );
      module0012.$g77$.rebind( var93, var85 );
      module0012.$g76$.rebind( var92, var85 );
      module0012.$g75$.rebind( var91, var85 );
    }
    return NIL;
  }

  public static SubLObject f36506(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    final SubLObject var86 = f36450( var84 );
    final SubLObject var87 = module0167.f10788();
    final SubLObject var88 = $ic154$;
    final SubLObject var89 = module0065.f4733( var87 );
    SubLObject var90 = ZERO_INTEGER;
    assert NIL != Types.stringp( var88 ) : var88;
    final SubLObject var91 = module0012.$g75$.currentBinding( var85 );
    final SubLObject var92 = module0012.$g76$.currentBinding( var85 );
    final SubLObject var93 = module0012.$g77$.currentBinding( var85 );
    final SubLObject var94 = module0012.$g78$.currentBinding( var85 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var85 );
      module0012.$g76$.bind( NIL, var85 );
      module0012.$g77$.bind( T, var85 );
      module0012.$g78$.bind( Time.get_universal_time(), var85 );
      module0012.f478( var88 );
      final SubLObject var68_224 = var87;
      if( NIL == module0065.f4772( var68_224, $ic86$ ) )
      {
        final SubLObject var69_225 = var68_224;
        if( NIL == module0065.f4775( var69_225, $ic86$ ) )
        {
          final SubLObject var95 = module0065.f4740( var69_225 );
          final SubLObject var96 = NIL;
          SubLObject var97;
          SubLObject var98;
          SubLObject var99;
          SubLObject var100;
          for( var97 = Sequences.length( var95 ), var98 = NIL, var98 = ZERO_INTEGER; var98.numL( var97 ); var98 = Numbers.add( var98, ONE_INTEGER ) )
          {
            var99 = ( ( NIL != var96 ) ? Numbers.subtract( var97, var98, ONE_INTEGER ) : var98 );
            var100 = Vectors.aref( var95, var99 );
            if( NIL == module0065.f4749( var100 ) || NIL == module0065.f4773( $ic86$ ) )
            {
              if( NIL != module0065.f4749( var100 ) )
              {
                var100 = $ic86$;
              }
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36412( var86, var100 ) )
              {
                f36465( var84, var100 );
              }
            }
          }
        }
        final SubLObject var142_226 = var68_224;
        if( NIL == module0065.f4777( var142_226 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var101 = module0065.f4738( var142_226 );
          SubLObject var102 = module0065.f4739( var142_226 );
          final SubLObject var103 = module0065.f4734( var142_226 );
          final SubLObject var104 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var102.numL( var103 ))
          {
            final SubLObject var105 = Hashtables.gethash_without_values( var102, var101, var104 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var105 ) )
            {
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36412( var86, var105 ) )
              {
                f36465( var84, var105 );
              }
            }
            var102 = Numbers.add( var102, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var94, var85 );
      module0012.$g77$.rebind( var93, var85 );
      module0012.$g76$.rebind( var92, var85 );
      module0012.$g75$.rebind( var91, var85 );
    }
    return NIL;
  }

  public static SubLObject f36507(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    final SubLObject var86 = f36450( var84 );
    final SubLObject var87 = assertion_handles_oc.f11010();
    final SubLObject var88 = $ic155$;
    final SubLObject var89 = module0065.f4733( var87 );
    SubLObject var90 = ZERO_INTEGER;
    assert NIL != Types.stringp( var88 ) : var88;
    final SubLObject var91 = module0012.$g75$.currentBinding( var85 );
    final SubLObject var92 = module0012.$g76$.currentBinding( var85 );
    final SubLObject var93 = module0012.$g77$.currentBinding( var85 );
    final SubLObject var94 = module0012.$g78$.currentBinding( var85 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var85 );
      module0012.$g76$.bind( NIL, var85 );
      module0012.$g77$.bind( T, var85 );
      module0012.$g78$.bind( Time.get_universal_time(), var85 );
      module0012.f478( var88 );
      final SubLObject var68_227 = var87;
      if( NIL == module0065.f4772( var68_227, $ic86$ ) )
      {
        final SubLObject var69_228 = var68_227;
        if( NIL == module0065.f4775( var69_228, $ic86$ ) )
        {
          final SubLObject var95 = module0065.f4740( var69_228 );
          final SubLObject var96 = NIL;
          SubLObject var97;
          SubLObject var98;
          SubLObject var99;
          SubLObject var100;
          for( var97 = Sequences.length( var95 ), var98 = NIL, var98 = ZERO_INTEGER; var98.numL( var97 ); var98 = Numbers.add( var98, ONE_INTEGER ) )
          {
            var99 = ( ( NIL != var96 ) ? Numbers.subtract( var97, var98, ONE_INTEGER ) : var98 );
            var100 = Vectors.aref( var95, var99 );
            if( NIL == module0065.f4749( var100 ) || NIL == module0065.f4773( $ic86$ ) )
            {
              if( NIL != module0065.f4749( var100 ) )
              {
                var100 = $ic86$;
              }
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36414( var86, var100 ) )
              {
                f36466( var84, var100 );
              }
            }
          }
        }
        final SubLObject var142_229 = var68_227;
        if( NIL == module0065.f4777( var142_229 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var101 = module0065.f4738( var142_229 );
          SubLObject var102 = module0065.f4739( var142_229 );
          final SubLObject var103 = module0065.f4734( var142_229 );
          final SubLObject var104 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var102.numL( var103 ))
          {
            final SubLObject var105 = Hashtables.gethash_without_values( var102, var101, var104 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var105 ) )
            {
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36414( var86, var105 ) )
              {
                f36466( var84, var105 );
              }
            }
            var102 = Numbers.add( var102, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var94, var85 );
      module0012.$g77$.rebind( var93, var85 );
      module0012.$g76$.rebind( var92, var85 );
      module0012.$g75$.rebind( var91, var85 );
    }
    return NIL;
  }

  public static SubLObject f36508(final SubLObject var84)
  {
    final SubLThread var85 = SubLProcess.currentSubLThread();
    final SubLObject var86 = f36450( var84 );
    final SubLObject var87 = deduction_handles_oc.f11634();
    final SubLObject var88 = $ic156$;
    final SubLObject var89 = module0065.f4733( var87 );
    SubLObject var90 = ZERO_INTEGER;
    assert NIL != Types.stringp( var88 ) : var88;
    final SubLObject var91 = module0012.$g75$.currentBinding( var85 );
    final SubLObject var92 = module0012.$g76$.currentBinding( var85 );
    final SubLObject var93 = module0012.$g77$.currentBinding( var85 );
    final SubLObject var94 = module0012.$g78$.currentBinding( var85 );
    try
    {
      module0012.$g75$.bind( ZERO_INTEGER, var85 );
      module0012.$g76$.bind( NIL, var85 );
      module0012.$g77$.bind( T, var85 );
      module0012.$g78$.bind( Time.get_universal_time(), var85 );
      module0012.f478( var88 );
      final SubLObject var68_230 = var87;
      if( NIL == module0065.f4772( var68_230, $ic86$ ) )
      {
        final SubLObject var69_231 = var68_230;
        if( NIL == module0065.f4775( var69_231, $ic86$ ) )
        {
          final SubLObject var95 = module0065.f4740( var69_231 );
          final SubLObject var96 = NIL;
          SubLObject var97;
          SubLObject var98;
          SubLObject var99;
          SubLObject var100;
          for( var97 = Sequences.length( var95 ), var98 = NIL, var98 = ZERO_INTEGER; var98.numL( var97 ); var98 = Numbers.add( var98, ONE_INTEGER ) )
          {
            var99 = ( ( NIL != var96 ) ? Numbers.subtract( var97, var98, ONE_INTEGER ) : var98 );
            var100 = Vectors.aref( var95, var99 );
            if( NIL == module0065.f4749( var100 ) || NIL == module0065.f4773( $ic86$ ) )
            {
              if( NIL != module0065.f4749( var100 ) )
              {
                var100 = $ic86$;
              }
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36416( var86, var100 ) )
              {
                f36467( var84, var100 );
              }
            }
          }
        }
        final SubLObject var142_232 = var68_230;
        if( NIL == module0065.f4777( var142_232 ) || NIL == module0065.f4773( $ic86$ ) )
        {
          final SubLObject var101 = module0065.f4738( var142_232 );
          SubLObject var102 = module0065.f4739( var142_232 );
          final SubLObject var103 = module0065.f4734( var142_232 );
          final SubLObject var104 = ( NIL != module0065.f4773( $ic86$ ) ) ? NIL : $ic86$;
          while ( var102.numL( var103 ))
          {
            final SubLObject var105 = Hashtables.gethash_without_values( var102, var101, var104 );
            if( NIL == module0065.f4773( $ic86$ ) || NIL == module0065.f4749( var105 ) )
            {
              module0012.note_percent_progress( var90, var89 );
              var90 = Numbers.add( var90, ONE_INTEGER );
              if( NIL == f36416( var86, var105 ) )
              {
                f36467( var84, var105 );
              }
            }
            var102 = Numbers.add( var102, ONE_INTEGER );
          }
        }
      }
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var94, var85 );
      module0012.$g77$.rebind( var93, var85 );
      module0012.$g76$.rebind( var92, var85 );
      module0012.$g75$.rebind( var91, var85 );
    }
    return NIL;
  }

  public static SubLObject f36510(final SubLObject var233, final SubLObject var234, SubLObject var9)
  {
    if( var9 == UNPROVIDED )
    {
      var9 = $ic11$;
    }
    final SubLObject var235 = module0103.f7380( var233, var234, var9 );
    final SubLObject var236 = f36478( f36400( var235 ) );
    return var236;
  }

  public static SubLObject f36511(final SubLObject var233, final SubLObject var234, SubLObject var9)
  {
    if( var9 == UNPROVIDED )
    {
      var9 = $ic11$;
    }
    final SubLObject var235 = f36510( var233, var234, var9 );
    final SubLObject var236 = f36503( f36451( var235 ) );
    return var236;
  }

  public static SubLObject f36512(final SubLObject var84, SubLObject var15)
  {
    if( var15 == UNPROVIDED )
    {
      var15 = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject var85 = f36473( var84 );
    final SubLObject var86 = f36474( var84 );
    final SubLObject var87 = f36475( var84 );
    final SubLObject var88 = f36476( var84 );
    final SubLObject var89 = f36477( var84 );
    if( NIL == var85 && NIL == var86 && NIL == var87 && NIL == var88 && NIL == var89 )
    {
      PrintLow.format( var15, $ic157$ );
    }
    else
    {
      if( NIL != var85 )
      {
        PrintLow.format( var15, $ic158$ );
        SubLObject var90 = var85;
        SubLObject var91 = NIL;
        var91 = var90.first();
        while ( NIL != var90)
        {
          final SubLObject var92 = f36472( var84, var91 );
          PrintLow.format( var15, $ic159$, var91, var92 );
          var90 = var90.rest();
          var91 = var90.first();
        }
        streams_high.terpri( var15 );
      }
      if( NIL != var86 )
      {
        PrintLow.format( var15, $ic160$ );
        SubLObject var90 = var86;
        SubLObject var91 = NIL;
        var91 = var90.first();
        while ( NIL != var90)
        {
          PrintLow.format( var15, $ic161$, var91 );
          var90 = var90.rest();
          var91 = var90.first();
        }
        streams_high.terpri( var15 );
      }
      if( NIL != var87 )
      {
        PrintLow.format( var15, $ic162$ );
        SubLObject var90 = var87;
        SubLObject var93 = NIL;
        var93 = var90.first();
        while ( NIL != var90)
        {
          PrintLow.format( var15, $ic161$, var93 );
          var90 = var90.rest();
          var93 = var90.first();
        }
        streams_high.terpri( var15 );
      }
      if( NIL != var88 )
      {
        PrintLow.format( var15, $ic163$ );
        SubLObject var90 = var88;
        SubLObject var94 = NIL;
        var94 = var90.first();
        while ( NIL != var90)
        {
          PrintLow.format( var15, $ic161$, var94 );
          var90 = var90.rest();
          var94 = var90.first();
        }
        streams_high.terpri( var15 );
      }
      if( NIL != var89 )
      {
        PrintLow.format( var15, $ic164$ );
        SubLObject var90 = var89;
        SubLObject var95 = NIL;
        var95 = var90.first();
        while ( NIL != var90)
        {
          final SubLObject var96 = module0188.f11781( var95 );
          PrintLow.format( var15, $ic165$, var96 );
          SubLObject var48_241 = module0188.f11770( var95 );
          SubLObject var97 = NIL;
          var97 = var48_241.first();
          while ( NIL != var48_241)
          {
            PrintLow.format( var15, $ic161$, var97 );
            var48_241 = var48_241.rest();
            var97 = var48_241.first();
          }
          streams_high.terpri( var15 );
          var90 = var90.rest();
          var95 = var90.first();
        }
      }
    }
    return var84;
  }

  public static SubLObject f36483()
  {
    final SubLObject var242 = constant_handles_oc.f8437();
    return module0103.f7405( ConsesLow.listS( $ic166$, var242, $ic167$ ) );
  }

  public static SubLObject f36486()
  {
    return module0103.f7405( $ic168$ );
  }

  public static SubLObject f36487(final SubLObject var29)
  {
    return module0103.f7405( ConsesLow.list( $ic169$, ConsesLow.list( $ic16$, constants_high_oc.f10757( var29 ) ) ) );
  }

  public static SubLObject f36509(final SubLObject var30)
  {
    return module0103.f7405( ConsesLow.list( $ic170$, var30 ) );
  }

  public static SubLObject f36488()
  {
    final SubLObject var243 = module0167.f10800();
    return module0103.f7405( ConsesLow.listS( $ic166$, var243, $ic171$ ) );
  }

  public static SubLObject f36491()
  {
    return module0103.f7405( $ic172$ );
  }

  public static SubLObject f36492(final SubLObject var31)
  {
    return module0103.f7405( ConsesLow.list( $ic173$, ConsesLow.list( $ic16$, module0172.f10915( var31 ) ) ) );
  }

  public static SubLObject f36493()
  {
    final SubLObject var244 = assertion_handles_oc.f11022();
    return module0103.f7405( ConsesLow.listS( $ic166$, var244, $ic174$ ) );
  }

  public static SubLObject f36496()
  {
    return module0103.f7405( $ic175$ );
  }

  public static SubLObject f36497(final SubLObject var32)
  {
    return module0103.f7405( ConsesLow.list( $ic176$, ConsesLow.list( $ic16$, module0178.f11282( var32 ) ), ConsesLow.list( $ic16$, module0178.f11287( var32 ) ) ) );
  }

  public static SubLObject f36498()
  {
    final SubLObject var245 = deduction_handles_oc.f11646();
    return module0103.f7405( ConsesLow.listS( $ic166$, var245, $ic177$ ) );
  }

  public static SubLObject f36501()
  {
    return module0103.f7405( $ic178$ );
  }

  public static SubLObject f36502(final SubLObject var33)
  {
    return module0103.f7405( ConsesLow.list( $ic179$, module0035.f2241( module0188.f11781( var33 ) ), ConsesLow.list( $ic16$, module0188.f11770( var33 ) ), module0191.f11924( var33 ) ) );
  }

  public static SubLObject f36513()
  {
    SubLFiles.declareMacro(me, "f36381", "S#40111" );
    SubLFiles.declareFunction(me, "f36382", "S#40112", 0, 0, false );
    SubLFiles.declareFunction(me, "f36383", "S#40113", 2, 0, false );
    SubLFiles.declareFunction(me, "f36385", "S#40106", 1, 0, false );
    new $f36385$UnaryFunction();
    SubLFiles.declareFunction(me, "f36386", "S#40114", 1, 0, false );
    SubLFiles.declareFunction(me, "f36387", "S#40115", 1, 0, false );
    SubLFiles.declareFunction(me, "f36388", "S#40116", 1, 0, false );
    SubLFiles.declareFunction(me, "f36389", "S#40117", 1, 0, false );
    SubLFiles.declareFunction(me, "f36390", "S#40118", 1, 0, false );
    SubLFiles.declareFunction(me, "f36391", "S#40119", 2, 0, false );
    SubLFiles.declareFunction(me, "f36392", "S#40120", 2, 0, false );
    SubLFiles.declareFunction(me, "f36393", "S#40121", 2, 0, false );
    SubLFiles.declareFunction(me, "f36394", "S#40122", 2, 0, false );
    SubLFiles.declareFunction(me, "f36395", "S#40123", 2, 0, false );
    SubLFiles.declareFunction(me, "f36396", "S#40124", 0, 1, false );
    SubLFiles.declareFunction(me, "f36397", "S#40125", 2, 0, false );
    SubLFiles.declareFunction(me, "f36398", "S#40126", 2, 0, false );
    SubLFiles.declareFunction(me, "f36384", "S#40127", 3, 0, false );
    SubLFiles.declareFunction(me, "f36400", "S#40128", 1, 0, false );
    SubLFiles.declareFunction(me, "f36401", "S#40129", 1, 0, false );
    SubLFiles.declareFunction(me, "f36399", "S#40130", 1, 0, false );
    SubLFiles.declareFunction(me, "f36402", "S#40131", 1, 0, false );
    SubLFiles.declareFunction(me, "f36403", "S#40132", 3, 0, false );
    SubLFiles.declareFunction(me, "f36404", "S#40133", 3, 0, false );
    SubLFiles.declareFunction(me, "f36405", "S#40134", 3, 0, false );
    SubLFiles.declareFunction(me, "f36406", "S#40135", 3, 0, false );
    SubLFiles.declareFunction(me, "f36407", "S#40136", 1, 0, false );
    SubLFiles.declareFunction(me, "f36408", "S#40137", 1, 0, false );
    SubLFiles.declareFunction(me, "f36409", "S#40138", 1, 0, false );
    SubLFiles.declareFunction(me, "f36410", "S#40139", 2, 0, false );
    SubLFiles.declareFunction(me, "f36411", "S#40140", 2, 0, false );
    SubLFiles.declareFunction(me, "f36412", "S#40141", 2, 0, false );
    SubLFiles.declareFunction(me, "f36413", "S#40142", 2, 0, false );
    SubLFiles.declareFunction(me, "f36414", "S#40143", 2, 0, false );
    SubLFiles.declareFunction(me, "f36415", "S#40144", 2, 0, false );
    SubLFiles.declareFunction(me, "f36416", "S#40145", 2, 0, false );
    SubLFiles.declareFunction(me, "f36417", "S#40146", 2, 0, false );
    SubLFiles.declareMacro(me, "f36418", "S#40147" );
    SubLFiles.declareFunction(me, "f36419", "S#40148", 2, 0, false );
    SubLFiles.declareFunction(me, "f36420", "S#40149", 1, 0, false );
    SubLFiles.declareFunction(me, "f36421", "S#40150", 2, 0, false );
    SubLFiles.declareFunction(me, "f36422", "S#40151", 1, 0, false );
    SubLFiles.declareFunction(me, "f36423", "S#40152", 2, 0, false );
    SubLFiles.declareFunction(me, "f36424", "S#40153", 1, 0, false );
    SubLFiles.declareFunction(me, "f36425", "S#40154", 2, 0, false );
    SubLFiles.declareFunction(me, "f36427", "S#40155", 2, 0, false );
    SubLFiles.declareFunction(me, "f36426", "S#40156", 2, 0, false );
    SubLFiles.declareFunction(me, "f36428", "S#40157", 2, 0, false );
    SubLFiles.declareFunction(me, "f36429", "S#40158", 3, 0, false );
    SubLFiles.declareFunction(me, "f36430", "S#40159", 2, 0, false );
    SubLFiles.declareFunction(me, "f36431", "S#40160", 1, 0, false );
    SubLFiles.declareFunction(me, "f36432", "S#40161", 2, 0, false );
    SubLFiles.declareFunction(me, "f36434", "S#40110", 1, 0, false );
    new $f36434$UnaryFunction();
    SubLFiles.declareFunction(me, "f36435", "S#40162", 1, 0, false );
    SubLFiles.declareFunction(me, "f36436", "S#40163", 1, 0, false );
    SubLFiles.declareFunction(me, "f36437", "S#40164", 1, 0, false );
    SubLFiles.declareFunction(me, "f36438", "S#40165", 1, 0, false );
    SubLFiles.declareFunction(me, "f36439", "S#40166", 1, 0, false );
    SubLFiles.declareFunction(me, "f36440", "S#40167", 1, 0, false );
    SubLFiles.declareFunction(me, "f36441", "S#40168", 2, 0, false );
    SubLFiles.declareFunction(me, "f36442", "S#40169", 2, 0, false );
    SubLFiles.declareFunction(me, "f36443", "S#40170", 2, 0, false );
    SubLFiles.declareFunction(me, "f36444", "S#40171", 2, 0, false );
    SubLFiles.declareFunction(me, "f36445", "S#40172", 2, 0, false );
    SubLFiles.declareFunction(me, "f36446", "S#40173", 2, 0, false );
    SubLFiles.declareFunction(me, "f36447", "S#40174", 0, 1, false );
    SubLFiles.declareFunction(me, "f36448", "S#40175", 2, 0, false );
    SubLFiles.declareFunction(me, "f36449", "S#40176", 2, 0, false );
    SubLFiles.declareFunction(me, "f36433", "S#40177", 3, 0, false );
    SubLFiles.declareFunction(me, "f36451", "S#40178", 1, 0, false );
    SubLFiles.declareFunction(me, "f36452", "S#40179", 1, 0, false );
    SubLFiles.declareFunction(me, "f36450", "S#40180", 1, 0, false );
    SubLFiles.declareFunction(me, "f36453", "S#40181", 1, 0, false );
    SubLFiles.declareFunction(me, "f36454", "S#40182", 1, 0, false );
    SubLFiles.declareFunction(me, "f36455", "S#40183", 1, 0, false );
    SubLFiles.declareFunction(me, "f36456", "S#40184", 1, 0, false );
    SubLFiles.declareFunction(me, "f36457", "S#40185", 1, 0, false );
    SubLFiles.declareMacro(me, "f36458", "S#40186" );
    SubLFiles.declareMacro(me, "f36459", "S#40187" );
    SubLFiles.declareMacro(me, "f36460", "S#40188" );
    SubLFiles.declareMacro(me, "f36461", "S#40189" );
    SubLFiles.declareMacro(me, "f36462", "S#40190" );
    SubLFiles.declareFunction(me, "f36463", "S#40191", 3, 0, false );
    SubLFiles.declareFunction(me, "f36464", "S#40192", 2, 0, false );
    SubLFiles.declareFunction(me, "f36465", "S#40193", 2, 0, false );
    SubLFiles.declareFunction(me, "f36466", "S#40194", 2, 0, false );
    SubLFiles.declareFunction(me, "f36467", "S#40195", 2, 0, false );
    SubLFiles.declareFunction(me, "f36468", "S#40196", 1, 0, false );
    SubLFiles.declareFunction(me, "f36469", "S#40197", 1, 0, false );
    SubLFiles.declareFunction(me, "f36470", "S#40198", 1, 0, false );
    SubLFiles.declareFunction(me, "f36471", "S#40199", 1, 0, false );
    SubLFiles.declareFunction(me, "f36472", "S#40200", 2, 0, false );
    SubLFiles.declareFunction(me, "f36473", "S#40201", 1, 0, false );
    SubLFiles.declareFunction(me, "f36474", "S#40202", 1, 0, false );
    SubLFiles.declareFunction(me, "f36475", "S#40203", 1, 0, false );
    SubLFiles.declareFunction(me, "f36476", "S#40204", 1, 0, false );
    SubLFiles.declareFunction(me, "f36477", "S#40205", 1, 0, false );
    SubLFiles.declareFunction(me, "f36478", "S#40206", 1, 0, false );
    SubLFiles.declareFunction(me, "f36479", "S#40207", 1, 0, false );
    SubLFiles.declareFunction(me, "f36484", "S#40208", 1, 0, false );
    SubLFiles.declareFunction(me, "f36485", "S#40209", 2, 0, false );
    SubLFiles.declareFunction(me, "f36480", "S#40210", 1, 0, false );
    SubLFiles.declareFunction(me, "f36489", "S#40211", 1, 0, false );
    SubLFiles.declareFunction(me, "f36490", "S#40212", 2, 0, false );
    SubLFiles.declareFunction(me, "f36481", "S#40213", 1, 0, false );
    SubLFiles.declareFunction(me, "f36494", "S#40214", 1, 0, false );
    SubLFiles.declareFunction(me, "f36495", "S#40215", 2, 0, false );
    SubLFiles.declareFunction(me, "f36482", "S#40216", 1, 0, false );
    SubLFiles.declareFunction(me, "f36499", "S#40217", 1, 0, false );
    SubLFiles.declareFunction(me, "f36500", "S#40218", 2, 0, false );
    SubLFiles.declareFunction(me, "f36503", "S#40219", 1, 0, false );
    SubLFiles.declareFunction(me, "f36504", "S#40220", 1, 0, false );
    SubLFiles.declareFunction(me, "f36505", "S#40221", 1, 0, false );
    SubLFiles.declareFunction(me, "f36506", "S#40222", 1, 0, false );
    SubLFiles.declareFunction(me, "f36507", "S#40223", 1, 0, false );
    SubLFiles.declareFunction(me, "f36508", "S#40224", 1, 0, false );
    SubLFiles.declareFunction(me, "f36510", "S#40225", 2, 1, false );
    SubLFiles.declareFunction(me, "f36511", "S#40226", 2, 1, false );
    SubLFiles.declareFunction(me, "f36512", "S#40227", 1, 1, false );
    SubLFiles.declareFunction(me, "f36483", "S#40228", 0, 0, false );
    SubLFiles.declareFunction(me, "f36486", "S#40229", 0, 0, false );
    SubLFiles.declareFunction(me, "f36487", "S#40230", 1, 0, false );
    SubLFiles.declareFunction(me, "f36509", "S#40231", 1, 0, false );
    SubLFiles.declareFunction(me, "f36488", "S#40232", 0, 0, false );
    SubLFiles.declareFunction(me, "f36491", "S#40233", 0, 0, false );
    SubLFiles.declareFunction(me, "f36492", "S#40234", 1, 0, false );
    SubLFiles.declareFunction(me, "f36493", "S#40235", 0, 0, false );
    SubLFiles.declareFunction(me, "f36496", "S#40236", 0, 0, false );
    SubLFiles.declareFunction(me, "f36497", "S#40237", 1, 0, false );
    SubLFiles.declareFunction(me, "f36498", "S#40238", 0, 0, false );
    SubLFiles.declareFunction(me, "f36501", "S#40239", 0, 0, false );
    SubLFiles.declareFunction(me, "f36502", "S#40240", 1, 0, false );
    return NIL;
  }

  public static SubLObject f36514()
  {
    $g4556$ = SubLFiles.defparameter( "S#40241", ConsesLow.append( $ic0$, $ic1$, ConsesLow.append( module0130.f8510(), module0130.f8519(), module0333.f22420() ) ) );
    $g4557$ = SubLFiles.defconstant( "S#40242", $ic18$ );
    $g4558$ = SubLFiles.defparameter( "S#40243", NIL );
    $g4559$ = SubLFiles.defconstant( "S#40244", $ic88$ );
    return NIL;
  }

  public static SubLObject f36515()
  {
    module0002.f50( $ic9$, $ic10$ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $g4557$.getGlobalValue(), Symbols.symbol_function( $ic25$ ) );
    SubLSpecialOperatorDeclarations.proclaim( $ic26$ );
    Structures.def_csetf( $ic27$, $ic28$ );
    Structures.def_csetf( $ic29$, $ic30$ );
    Structures.def_csetf( $ic31$, $ic32$ );
    Structures.def_csetf( $ic33$, $ic34$ );
    Structures.def_csetf( $ic35$, $ic36$ );
    Equality.identity( $ic18$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4557$.getGlobalValue(), Symbols.symbol_function( $ic47$ ) );
    module0002.f50( $ic50$, $ic51$ );
    Structures.register_method( print_high.$print_object_method_table$.getGlobalValue(), $g4559$.getGlobalValue(), Symbols.symbol_function( $ic95$ ) );
    SubLSpecialOperatorDeclarations.proclaim( $ic96$ );
    Structures.def_csetf( $ic97$, $ic98$ );
    Structures.def_csetf( $ic99$, $ic100$ );
    Structures.def_csetf( $ic101$, $ic102$ );
    Structures.def_csetf( $ic103$, $ic104$ );
    Structures.def_csetf( $ic105$, $ic106$ );
    Structures.def_csetf( $ic107$, $ic108$ );
    Equality.identity( $ic88$ );
    Structures.register_method( visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $g4559$.getGlobalValue(), Symbols.symbol_function( $ic112$ ) );
    module0002.f50( $ic114$, $ic115$ );
    module0002.f50( $ic116$, $ic117$ );
    module0002.f50( $ic118$, $ic119$ );
    module0002.f50( $ic120$, $ic121$ );
    module0002.f50( $ic122$, $ic123$ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f36513();
  }

  @Override
  public void initializeVariables()
  {
    f36514();
  }

  @Override
  public void runTopLevelForms()
  {
    f36515();
  }
  static
  {
    me = new kb_compare_oc();
    $g4556$ = null;
    $g4557$ = null;
    $g4558$ = null;
    $g4559$ = null;
    $ic0$ = ConsesLow.list( T );
    $ic1$ = ConsesLow.list( makeSymbol( "S#14155", "CYC" ), makeSymbol( "S#14588", "CYC" ), makeSymbol( "S#13563", "CYC" ), makeSymbol( "S#13568", "CYC" ), makeSymbol( "S#13747", "CYC" ) );
    $ic2$ = ConsesLow.list( makeSymbol( "S#9280", "CYC" ), makeSymbol( "&BODY" ), makeSymbol( "S#5", "CYC" ) );
    $ic3$ = makeSymbol( "S#9324", "CYC" );
    $ic4$ = makeSymbol( "CLET" );
    $ic5$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#40241", "CYC" ), makeSymbol( "S#40241", "CYC" ) ) );
    $ic6$ = ConsesLow.list( makeSymbol( "S#40112", "CYC" ) );
    $ic7$ = makeSymbol( "S#2152", "CYC" );
    $ic8$ = makeSymbol( "S#40241", "CYC" );
    $ic9$ = makeSymbol( "S#40112", "CYC" );
    $ic10$ = makeSymbol( "S#40111", "CYC" );
    $ic11$ = makeKeyword( "CFASL" );
    $ic12$ = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic13$ = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic14$ = makeSymbol( "PROGN" );
    $ic15$ = makeSymbol( "S#2151", "CYC" );
    $ic16$ = makeSymbol( "QUOTE" );
    $ic17$ = ConsesLow.list( ConsesLow.list( makeSymbol( "ERROR" ), makeString( "hack" ) ) );
    $ic18$ = makeSymbol( "S#40105", "CYC" );
    $ic19$ = makeSymbol( "S#40106", "CYC" );
    $ic20$ = ConsesLow.list( makeSymbol( "S#9280", "CYC" ), makeSymbol( "S#10522", "CYC" ), makeSymbol( "S#13605", "CYC" ), makeSymbol( "S#14048", "CYC" ), makeSymbol( "S#40245", "CYC" ) );
    $ic21$ = ConsesLow.list( makeKeyword( "REMOTE-IMAGE" ), makeKeyword( "CONSTANT-INDEX" ), makeKeyword( "NART-INDEX" ), makeKeyword( "ASSERTION-INDEX" ), makeKeyword( "DEDUCTION-INDEX" ) );
    $ic22$ = ConsesLow.list( makeSymbol( "S#40114", "CYC" ), makeSymbol( "S#40115", "CYC" ), makeSymbol( "S#40116", "CYC" ), makeSymbol( "S#40117", "CYC" ), makeSymbol( "S#40118", "CYC" ) );
    $ic23$ = ConsesLow.list( makeSymbol( "S#40119", "CYC" ), makeSymbol( "S#40120", "CYC" ), makeSymbol( "S#40121", "CYC" ), makeSymbol( "S#40122", "CYC" ), makeSymbol( "S#40123", "CYC" ) );
    $ic24$ = makeSymbol( "S#40127", "CYC" );
    $ic25$ = makeSymbol( "S#40113", "CYC" );
    $ic26$ = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "S#40106", "CYC" ) );
    $ic27$ = makeSymbol( "S#40114", "CYC" );
    $ic28$ = makeSymbol( "S#40119", "CYC" );
    $ic29$ = makeSymbol( "S#40115", "CYC" );
    $ic30$ = makeSymbol( "S#40120", "CYC" );
    $ic31$ = makeSymbol( "S#40116", "CYC" );
    $ic32$ = makeSymbol( "S#40121", "CYC" );
    $ic33$ = makeSymbol( "S#40117", "CYC" );
    $ic34$ = makeSymbol( "S#40122", "CYC" );
    $ic35$ = makeSymbol( "S#40118", "CYC" );
    $ic36$ = makeSymbol( "S#40123", "CYC" );
    $ic37$ = makeKeyword( "REMOTE-IMAGE" );
    $ic38$ = makeKeyword( "CONSTANT-INDEX" );
    $ic39$ = makeKeyword( "NART-INDEX" );
    $ic40$ = makeKeyword( "ASSERTION-INDEX" );
    $ic41$ = makeKeyword( "DEDUCTION-INDEX" );
    $ic42$ = makeString( "Invalid slot ~S for construction function" );
    $ic43$ = makeKeyword( "BEGIN" );
    $ic44$ = makeSymbol( "S#40124", "CYC" );
    $ic45$ = makeKeyword( "SLOT" );
    $ic46$ = makeKeyword( "END" );
    $ic47$ = makeSymbol( "S#40126", "CYC" );
    $ic48$ = makeString( "<KB-INTERSECTION to ~a>" );
    $ic49$ = makeKeyword( "FREE" );
    $ic50$ = makeSymbol( "S#40131", "CYC" );
    $ic51$ = makeSymbol( "S#40147", "CYC" );
    $ic52$ = makeSymbol( "CONSTANT-P" );
    $ic53$ = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic54$ = makeSymbol( "NART-P" );
    $ic55$ = makeSymbol( "ASSERTION-P" );
    $ic56$ = makeSymbol( "DEDUCTION-P" );
    $ic57$ = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT", "CYC" ), makeSymbol( "INTERSECTION" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "S#130", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "S#5", "CYC" ) );
    $ic58$ = ConsesLow.list( makeKeyword( "PROGRESS-MESSAGE" ) );
    $ic59$ = makeKeyword( "ALLOW-OTHER-KEYS" );
    $ic60$ = makeKeyword( "PROGRESS-MESSAGE" );
    $ic61$ = makeUninternedSymbol( "US#180C5F6" );
    $ic62$ = makeUninternedSymbol( "US#2A7F8B6" );
    $ic63$ = makeSymbol( "DO-ID-INDEX" );
    $ic64$ = makeSymbol( "IGNORE" );
    $ic65$ = makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $ic66$ = makeKeyword( "IMPOSSIBLE" );
    $ic67$ = makeSymbol( "S#40149", "CYC" );
    $ic68$ = makeSymbol( "S#40151", "CYC" );
    $ic69$ = makeSymbol( "S#40153", "CYC" );
    $ic70$ = makeKeyword( "OUTPUT" );
    $ic71$ = makeString( "Unable to open ~S" );
    $ic72$ = makeKeyword( "INPUT" );
    $ic73$ = makeKeyword( "CONSTANTS" );
    $ic74$ = makeString( "Constants" );
    $ic75$ = makeKeyword( "NARTS" );
    $ic76$ = makeString( "NARTs" );
    $ic77$ = makeKeyword( "ASSERTIONS" );
    $ic78$ = makeString( "Assertions" );
    $ic79$ = makeKeyword( "DEDUCTIONS" );
    $ic80$ = makeString( "Deductions" );
    $ic81$ = makeString( "Saving KB " );
    $ic82$ = makeString( " Intersection ID Index ...." );
    $ic83$ = makeString( "Loading KB " );
    $ic84$ = makeString( "Error in KB Intersection ID index format ... expected ~A, got ~A." );
    $ic85$ = makeString( "Expected a KB Intersection ID index, but got ~A instead." );
    $ic86$ = makeKeyword( "SKIP" );
    $ic87$ = makeString( "This ID index cannot be inverted, ID ~A points to non-ID ~A." );
    $ic88$ = makeSymbol( "S#40109", "CYC" );
    $ic89$ = makeSymbol( "S#40110", "CYC" );
    $ic90$ = ConsesLow.list( makeSymbol( "S#40246", "CYC" ), makeSymbol( "S#40247", "CYC" ), makeSymbol( "S#13801", "CYC" ), makeSymbol( "S#13802", "CYC" ), makeSymbol( "S#13093", "CYC" ), makeSymbol( "S#40248",
        "CYC" ) );
    $ic91$ = ConsesLow.list( makeKeyword( "COMMON-INTERSECTION" ), makeKeyword( "RENAMED-CONSTANTS" ), makeKeyword( "CONSTANTS" ), makeKeyword( "NARTS" ), makeKeyword( "ASSERTIONS" ), makeKeyword( "DEDUCTIONS" ) );
    $ic92$ = ConsesLow.list( makeSymbol( "S#40162", "CYC" ), makeSymbol( "S#40163", "CYC" ), makeSymbol( "S#40164", "CYC" ), makeSymbol( "S#40165", "CYC" ), makeSymbol( "S#40166", "CYC" ), makeSymbol( "S#40167",
        "CYC" ) );
    $ic93$ = ConsesLow.list( makeSymbol( "S#40168", "CYC" ), makeSymbol( "S#40169", "CYC" ), makeSymbol( "S#40170", "CYC" ), makeSymbol( "S#40171", "CYC" ), makeSymbol( "S#40172", "CYC" ), makeSymbol( "S#40173",
        "CYC" ) );
    $ic94$ = makeSymbol( "S#40177", "CYC" );
    $ic95$ = makeSymbol( "S#40161", "CYC" );
    $ic96$ = ConsesLow.list( makeSymbol( "OPTIMIZE-FUNCALL" ), makeSymbol( "S#40110", "CYC" ) );
    $ic97$ = makeSymbol( "S#40162", "CYC" );
    $ic98$ = makeSymbol( "S#40168", "CYC" );
    $ic99$ = makeSymbol( "S#40163", "CYC" );
    $ic100$ = makeSymbol( "S#40169", "CYC" );
    $ic101$ = makeSymbol( "S#40164", "CYC" );
    $ic102$ = makeSymbol( "S#40170", "CYC" );
    $ic103$ = makeSymbol( "S#40165", "CYC" );
    $ic104$ = makeSymbol( "S#40171", "CYC" );
    $ic105$ = makeSymbol( "S#40166", "CYC" );
    $ic106$ = makeSymbol( "S#40172", "CYC" );
    $ic107$ = makeSymbol( "S#40167", "CYC" );
    $ic108$ = makeSymbol( "S#40173", "CYC" );
    $ic109$ = makeKeyword( "COMMON-INTERSECTION" );
    $ic110$ = makeKeyword( "RENAMED-CONSTANTS" );
    $ic111$ = makeSymbol( "S#40174", "CYC" );
    $ic112$ = makeSymbol( "S#40176", "CYC" );
    $ic113$ = makeString( "<KB-DIFFERENCE using ~a>" );
    $ic114$ = makeSymbol( "S#40181", "CYC" );
    $ic115$ = makeSymbol( "S#40186", "CYC" );
    $ic116$ = makeSymbol( "S#40182", "CYC" );
    $ic117$ = makeSymbol( "S#40187", "CYC" );
    $ic118$ = makeSymbol( "S#40183", "CYC" );
    $ic119$ = makeSymbol( "S#40188", "CYC" );
    $ic120$ = makeSymbol( "S#40184", "CYC" );
    $ic121$ = makeSymbol( "S#40189", "CYC" );
    $ic122$ = makeSymbol( "S#40185", "CYC" );
    $ic123$ = makeSymbol( "S#40190", "CYC" );
    $ic124$ = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT", "CYC" ), makeSymbol( "S#40249", "CYC" ), SubLObjectFactory.makeSymbol( "S#40250", "CYC" ), makeSymbol( "&KEY" ), makeSymbol( "S#127", "CYC" ) ),
        makeSymbol( "&BODY" ), makeSymbol( "S#5", "CYC" ) );
    $ic125$ = ConsesLow.list( makeKeyword( "DONE" ) );
    $ic126$ = makeKeyword( "DONE" );
    $ic127$ = makeSymbol( "DO-DICTIONARY" );
    $ic128$ = ConsesLow.list( ConsesLow.list( makeSymbol( "CONSTANT", "CYC" ), makeSymbol( "S#40250", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "S#5", "CYC" ) );
    $ic129$ = makeSymbol( "S#708", "CYC" );
    $ic130$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#13601", "CYC" ), makeSymbol( "S#40250", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "S#5", "CYC" ) );
    $ic131$ = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION", "CYC" ), makeSymbol( "S#40250", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "S#5", "CYC" ) );
    $ic132$ = ConsesLow.list( ConsesLow.list( makeSymbol( "DEDUCTION", "CYC" ), makeSymbol( "S#40250", "CYC" ), SubLObjectFactory.makeSymbol( "&KEY" ), makeSymbol( "S#127", "CYC" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "S#5", "CYC" ) );
    $ic133$ = makeSymbol( "STRINGP" );
    $ic134$ = makeSymbol( "<" );
    $ic135$ = makeSymbol( "CONSTANT-INTERNAL-ID" );
    $ic136$ = makeSymbol( "NART-ID" );
    $ic137$ = makeSymbol( "ASSERTION-ID" );
    $ic138$ = makeSymbol( "DEDUCTION-ID" );
    $ic139$ = makeString( "KB Intersection : Examining new constants" );
    $ic140$ = makeString( "KB Intersection : Examining constants" );
    $ic141$ = makeString( "KB Intersection : Examining old constants (congruent)" );
    $ic142$ = ConsesLow.list( makeUninternedSymbol( "US#352B2C1" ), makeUninternedSymbol( "US#13A2892" ), makeUninternedSymbol( "US#1160044" ) );
    $ic143$ = makeString( "KB Intersection : Examining new narts" );
    $ic144$ = makeString( "KB Intersection : Examining narts" );
    $ic145$ = makeString( "KB Intersection : Examining old narts (congruent)" );
    $ic146$ = makeString( "KB Intersection : Examining new assertions" );
    $ic147$ = makeString( "KB Intersection : Examining assertions" );
    $ic148$ = makeString( "KB Intersection : Examining old assertions (congruent)" );
    $ic149$ = makeString( "KB Intersection : Examining new deductions" );
    $ic150$ = makeString( "KB Intersection : Examining deductions" );
    $ic151$ = makeString( "KB Intersection : Examining old deductions (congruent)" );
    $ic152$ = makeString( "KB-DIFFERENCE : Examining constant renames" );
    $ic153$ = makeString( "KB-DIFFERENCE : Examining constants" );
    $ic154$ = makeString( "KB-DIFFERENCE : Examining narts" );
    $ic155$ = makeString( "KB-DIFFERENCE : Examining assertions" );
    $ic156$ = makeString( "KB-DIFFERENCE : Examining deductions" );
    $ic157$ = makeString( ";; No Difference!~%" );
    $ic158$ = makeString( ";; Renamed Constants :~%" );
    $ic159$ = makeString( "~S renamed to ~S~%" );
    $ic160$ = makeString( ";; Constants :~%" );
    $ic161$ = makeString( "~S~%" );
    $ic162$ = makeString( ";; Narts :~%" );
    $ic163$ = makeString( ";; Assertions :~%" );
    $ic164$ = makeString( ";; Deductions :~%" );
    $ic165$ = makeString( "~S~%supports:~%" );
    $ic166$ = makeSymbol( "=" );
    $ic167$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#10544", "CYC" ) ) );
    $ic168$ = ConsesLow.list( makeSymbol( "S#10546", "CYC" ) );
    $ic169$ = makeSymbol( "S#13563", "CYC" );
    $ic170$ = makeSymbol( "S#13568", "CYC" );
    $ic171$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#13617", "CYC" ) ) );
    $ic172$ = ConsesLow.list( makeSymbol( "S#13619", "CYC" ) );
    $ic173$ = makeSymbol( "S#13747", "CYC" );
    $ic174$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#13825", "CYC" ) ) );
    $ic175$ = ConsesLow.list( makeSymbol( "S#13827", "CYC" ) );
    $ic176$ = makeSymbol( "S#14155", "CYC" );
    $ic177$ = ConsesLow.list( ConsesLow.list( makeSymbol( "S#14465", "CYC" ) ) );
    $ic178$ = ConsesLow.list( makeSymbol( "S#14467", "CYC" ) );
    $ic179$ = makeSymbol( "S#14588", "CYC" );
  }

  public static final class $sX40105_native
      extends
        SubLStructNative
  {
    public SubLObject $remote_image;
    public SubLObject $constant_index;
    public SubLObject $nart_index;
    public SubLObject $assertion_index;
    public SubLObject $deduction_index;
    public static final SubLStructDeclNative structDecl;

    public $sX40105_native()
    {
      this.$remote_image = CommonSymbols.NIL;
      this.$constant_index = CommonSymbols.NIL;
      this.$nart_index = CommonSymbols.NIL;
      this.$assertion_index = CommonSymbols.NIL;
      this.$deduction_index = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX40105_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$remote_image;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$constant_index;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$nart_index;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$assertion_index;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$deduction_index;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$remote_image = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$constant_index = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$nart_index = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$assertion_index = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$deduction_index = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sX40105_native.class, $ic18$, $ic19$, $ic20$, $ic21$, new String[] { "$remote_image", "$constant_index", "$nart_index", "$assertion_index", "$deduction_index"
      }, $ic22$, $ic23$, $ic24$ );
    }
  }

  public static final class $f36385$UnaryFunction
      extends
        UnaryFunction
  {
    public $f36385$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#40106" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var16)
    {
      return f36385( var16 );
    }
  }

  public static final class $sX40109_native
      extends
        SubLStructNative
  {
    public SubLObject $common_intersection;
    public SubLObject $renamed_constants;
    public SubLObject $constants;
    public SubLObject $narts;
    public SubLObject $assertions;
    public SubLObject $deductions;
    public static final SubLStructDeclNative structDecl;

    public $sX40109_native()
    {
      this.$common_intersection = CommonSymbols.NIL;
      this.$renamed_constants = CommonSymbols.NIL;
      this.$constants = CommonSymbols.NIL;
      this.$narts = CommonSymbols.NIL;
      this.$assertions = CommonSymbols.NIL;
      this.$deductions = CommonSymbols.NIL;
    }

    @Override
    public SubLStructDecl getStructDecl()
    {
      return $sX40109_native.structDecl;
    }

    @Override
    public SubLObject getField2()
    {
      return this.$common_intersection;
    }

    @Override
    public SubLObject getField3()
    {
      return this.$renamed_constants;
    }

    @Override
    public SubLObject getField4()
    {
      return this.$constants;
    }

    @Override
    public SubLObject getField5()
    {
      return this.$narts;
    }

    @Override
    public SubLObject getField6()
    {
      return this.$assertions;
    }

    @Override
    public SubLObject getField7()
    {
      return this.$deductions;
    }

    @Override
    public SubLObject setField2(final SubLObject value)
    {
      return this.$common_intersection = value;
    }

    @Override
    public SubLObject setField3(final SubLObject value)
    {
      return this.$renamed_constants = value;
    }

    @Override
    public SubLObject setField4(final SubLObject value)
    {
      return this.$constants = value;
    }

    @Override
    public SubLObject setField5(final SubLObject value)
    {
      return this.$narts = value;
    }

    @Override
    public SubLObject setField6(final SubLObject value)
    {
      return this.$assertions = value;
    }

    @Override
    public SubLObject setField7(final SubLObject value)
    {
      return this.$deductions = value;
    }
    static
    {
      structDecl = Structures.makeStructDeclNative( $sX40109_native.class, $ic88$, $ic89$, $ic90$, $ic91$, new String[] { "$common_intersection", "$renamed_constants", "$constants", "$narts", "$assertions", "$deductions"
      }, $ic92$, $ic93$, $ic94$ );
    }
  }

  public static final class $f36434$UnaryFunction
      extends
        UnaryFunction
  {
    public $f36434$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "S#40110" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject var16)
    {
      return f36434( var16 );
    }
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 1090 ms
 *
 * Decompiled with Procyon 0.5.32.
 */