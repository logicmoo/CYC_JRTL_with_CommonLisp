package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import java.util.Map;
import java.util.Iterator;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0711 extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.module0711";
  public static final String myFingerPrint = "de5e61d9041ee31afaf6cfcb78acdbbd36ffb99a45b9de338c61af70c04911e2";
  public static SubLSymbol $g5588$;
  public static SubLSymbol $g5594$;
  public static SubLSymbol $g5595$;
  public static SubLSymbol $g5593$;
  public static SubLSymbol $g5596$;
  public static SubLSymbol $g5597$;
  private static SubLSymbol $g5598$;
  private static SubLSymbol $g5599$;
  public static SubLSymbol $g5600$;
  public static SubLSymbol $g5601$;
  public static SubLSymbol $g5602$;
  public static SubLSymbol $g5603$;
  private static SubLSymbol $g5604$;
  private static SubLSymbol $g5605$;
  private static SubLSymbol $g5606$;
  private static SubLSymbol $g5607$;
  private static SubLSymbol $g5608$;
  private static SubLSymbol $g5609$;
  private static SubLSymbol $g5610$;
  private static SubLSymbol $g5611$;
  private static SubLSymbol $g5612$;
  private static SubLSymbol $g5613$;
  private static SubLSymbol $g5614$;
  private static SubLSymbol $g5615$;
  public static SubLSymbol $g5616$;
  private static SubLSymbol $g5617$;
  private static SubLSymbol $g5618$;
  private static SubLSymbol $g5619$;
  private static SubLSymbol $g5620$;
  public static SubLSymbol $g5621$;
  private static SubLSymbol $g5622$;
  private static SubLSymbol $g5623$;
  private static SubLSymbol $g5624$;
  private static SubLSymbol $g5625$;
  private static SubLSymbol $g5626$;
  private static SubLSymbol $g5627$;
  private static SubLSymbol $g5628$;
  private static SubLSymbol $g5629$;
  private static SubLSymbol $g5630$;
  private static SubLSymbol $g5631$;
  private static final SubLList $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLString $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLObject $ic6$;
  private static final SubLList $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLList $ic9$;
  private static final SubLList $ic10$;
  private static final SubLList $ic11$;
  private static final SubLSymbol $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLList $ic14$;
  private static final SubLSymbol $ic15$;
  private static final SubLSymbol $ic16$;
  private static final SubLString $ic17$;
  private static final SubLList $ic18$;
  private static final SubLList $ic19$;
  private static final SubLSymbol $ic20$;
  private static final SubLSymbol $ic21$;
  private static final SubLSymbol $ic22$;
  private static final SubLSymbol $ic23$;
  private static final SubLList $ic24$;
  private static final SubLList $ic25$;
  private static final SubLSymbol $ic26$;
  private static final SubLSymbol $ic27$;
  private static final SubLList $ic28$;
  private static final SubLSymbol $ic29$;
  private static final SubLSymbol $ic30$;
  private static final SubLSymbol $ic31$;
  private static final SubLInteger $ic32$;
  private static final SubLList $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLList $ic35$;
  private static final SubLList $ic36$;
  private static final SubLList $ic37$;
  private static final SubLObject $ic38$;
  private static final SubLObject $ic39$;
  private static final SubLObject $ic40$;
  private static final SubLString $ic41$;
  private static final SubLString $ic42$;
  private static final SubLList $ic43$;
  private static final SubLObject $ic44$;
  private static final SubLString $ic45$;
  private static final SubLList $ic46$;
  private static final SubLSymbol $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLList $ic49$;
  private static final SubLList $ic50$;
  private static final SubLList $ic51$;
  private static final SubLList $ic52$;
  private static final SubLList $ic53$;
  private static final SubLList $ic54$;
  private static final SubLList $ic55$;
  private static final SubLList $ic56$;
  private static final SubLList $ic57$;
  private static final SubLList $ic58$;
  private static final SubLSymbol $ic59$;
  private static final SubLSymbol $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLSymbol $ic62$;
  private static final SubLString $ic63$;
  private static final SubLString $ic64$;
  private static final SubLString $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLString $ic67$;
  private static final SubLList $ic68$;
  private static final SubLString $ic69$;
  private static final SubLString $ic70$;
  private static final SubLSymbol $ic71$;
  private static final SubLString $ic72$;
  private static final SubLObject $ic73$;
  private static final SubLList $ic74$;
  private static final SubLObject $ic75$;
  private static final SubLList $ic76$;
  private static final SubLString $ic77$;
  private static final SubLObject $ic78$;
  private static final SubLString $ic79$;
  private static final SubLString $ic80$;
  private static final SubLSymbol $ic81$;
  private static final SubLObject $ic82$;
  private static final SubLString $ic83$;
  private static final SubLString $ic84$;
  private static final SubLString $ic85$;
  private static final SubLInteger $ic86$;
  private static final SubLString $ic87$;
  private static final SubLSymbol $ic88$;
  private static final SubLSymbol $ic89$;
  private static final SubLInteger $ic90$;
  private static final SubLSymbol $ic91$;
  private static final SubLList $ic92$;
  private static final SubLSymbol $ic93$;
  private static final SubLString $ic94$;
  private static final SubLString $ic95$;
  private static final SubLObject $ic96$;
  private static final SubLSymbol $ic97$;
  private static final SubLString $ic98$;
  private static final SubLList $ic99$;
  private static final SubLString $ic100$;
  private static final SubLList $ic101$;
  private static final SubLString $ic102$;
  private static final SubLSymbol $ic103$;
  private static final SubLSymbol $ic104$;
  private static final SubLSymbol $ic105$;
  private static final SubLSymbol $ic106$;
  private static final SubLSymbol $ic107$;
  private static final SubLList $ic108$;
  private static final SubLSymbol $ic109$;
  private static final SubLSymbol $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLObject $ic112$;
  private static final SubLObject $ic113$;
  private static final SubLSymbol $ic114$;
  private static final SubLObject $ic115$;
  private static final SubLObject $ic116$;
  private static final SubLSymbol $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLObject $ic119$;
  private static final SubLList $ic120$;
  private static final SubLList $ic121$;
  private static final SubLObject $ic122$;
  private static final SubLObject $ic123$;
  private static final SubLList $ic124$;
  private static final SubLList $ic125$;
  private static final SubLObject $ic126$;
  private static final SubLObject $ic127$;
  private static final SubLList $ic128$;
  private static final SubLObject $ic129$;
  private static final SubLList $ic130$;
  private static final SubLList $ic131$;
  private static final SubLList $ic132$;
  private static final SubLSymbol $ic133$;
  private static final SubLObject $ic134$;
  private static final SubLSymbol $ic135$;
  private static final SubLSymbol $ic136$;
  private static final SubLObject $ic137$;
  private static final SubLObject $ic138$;
  private static final SubLSymbol $ic139$;
  private static final SubLString $ic140$;
  private static final SubLString $ic141$;
  private static final SubLList $ic142$;
  private static final SubLString $ic143$;
  private static final SubLString $ic144$;
  private static final SubLString $ic145$;
  private static final SubLSymbol $ic146$;
  private static final SubLObject $ic147$;
  private static final SubLSymbol $ic148$;
  private static final SubLSymbol $ic149$;
  private static final SubLString $ic150$;
  private static final SubLObject $ic151$;
  private static final SubLObject $ic152$;
  private static final SubLObject $ic153$;
  private static final SubLObject $ic154$;
  private static final SubLString $ic155$;
  private static final SubLList $ic156$;
  private static final SubLString $ic157$;
  private static final SubLString $ic158$;
  private static final SubLObject $ic159$;
  private static final SubLObject $ic160$;
  private static final SubLObject $ic161$;
  private static final SubLObject $ic162$;
  private static final SubLObject $ic163$;
  private static final SubLString $ic164$;
  private static final SubLString $ic165$;
  private static final SubLString $ic166$;
  private static final SubLString $ic167$;
  private static final SubLString $ic168$;
  private static final SubLString $ic169$;
  private static final SubLString $ic170$;
  private static final SubLString $ic171$;
  private static final SubLString $ic172$;
  private static final SubLString $ic173$;
  private static final SubLString $ic174$;
  private static final SubLString $ic175$;
  private static final SubLList $ic176$;
  private static final SubLObject $ic177$;
  private static final SubLSymbol $ic178$;
  private static final SubLObject $ic179$;
  private static final SubLObject $ic180$;
  private static final SubLObject $ic181$;
  private static final SubLString $ic182$;
  private static final SubLSymbol $ic183$;
  private static final SubLObject $ic184$;
  private static final SubLList $ic185$;
  private static final SubLList $ic186$;
  private static final SubLString $ic187$;
  private static final SubLList $ic188$;
  private static final SubLSymbol $ic189$;
  private static final SubLSymbol $ic190$;
  private static final SubLString $ic191$;
  private static final SubLString $ic192$;
  private static final SubLString $ic193$;
  private static final SubLString $ic194$;
  private static final SubLString $ic195$;
  private static final SubLString $ic196$;
  private static final SubLString $ic197$;
  private static final SubLString $ic198$;
  private static final SubLString $ic199$;
  private static final SubLSymbol $ic200$;
  private static final SubLString $ic201$;
  private static final SubLObject $ic202$;
  private static final SubLObject $ic203$;
  private static final SubLObject $ic204$;
  private static final SubLObject $ic205$;
  private static final SubLString $ic206$;
  private static final SubLString $ic207$;
  private static final SubLObject $ic208$;
  private static final SubLObject $ic209$;
  private static final SubLObject $ic210$;
  private static final SubLObject $ic211$;
  private static final SubLSymbol $ic212$;
  private static final SubLObject $ic213$;
  private static final SubLObject $ic214$;
  private static final SubLSymbol $ic215$;
  private static final SubLObject $ic216$;
  private static final SubLList $ic217$;
  private static final SubLObject $ic218$;
  private static final SubLObject $ic219$;
  private static final SubLString $ic220$;
  private static final SubLSymbol $ic221$;
  private static final SubLList $ic222$;
  private static final SubLList $ic223$;
  private static final SubLString $ic224$;
  private static final SubLString $ic225$;
  private static final SubLString $ic226$;
  private static final SubLString $ic227$;
  private static final SubLString $ic228$;
  private static final SubLObject $ic229$;
  private static final SubLSymbol $ic230$;
  private static final SubLSymbol $ic231$;
  private static final SubLSymbol $ic232$;
  private static final SubLSymbol $ic233$;
  private static final SubLSymbol $ic234$;
  private static final SubLSymbol $ic235$;
  private static final SubLSymbol $ic236$;
  private static final SubLString $ic237$;
  private static final SubLList $ic238$;
  private static final SubLList $ic239$;
  private static final SubLSymbol $ic240$;
  private static final SubLSymbol $ic241$;
  private static final SubLString $ic242$;
  private static final SubLSymbol $ic243$;
  private static final SubLList $ic244$;
  private static final SubLSymbol $ic245$;
  private static final SubLString $ic246$;
  private static final SubLSymbol $ic247$;
  private static final SubLInteger $ic248$;
  private static final SubLInteger $ic249$;
  private static final SubLString $ic250$;
  private static final SubLList $ic251$;
  private static final SubLObject $ic252$;
  private static final SubLList $ic253$;
  private static final SubLList $ic254$;
  private static final SubLSymbol $ic255$;
  private static final SubLSymbol $ic256$;
  private static final SubLList $ic257$;
  private static final SubLObject $ic258$;
  private static final SubLObject $ic259$;
  private static final SubLString $ic260$;
  private static final SubLObject $ic261$;
  private static final SubLString $ic262$;
  private static final SubLString $ic263$;
  private static final SubLList $ic264$;
  private static final SubLString $ic265$;
  private static final SubLSymbol $ic266$;
  private static final SubLString $ic267$;
  private static final SubLList $ic268$;
  private static final SubLSymbol $ic269$;
  private static final SubLSymbol $ic270$;
  private static final SubLObject $ic271$;
  private static final SubLList $ic272$;
  private static final SubLList $ic273$;
  private static final SubLSymbol $ic274$;
  private static final SubLSymbol $ic275$;
  private static final SubLString $ic276$;
  private static final SubLSymbol $ic277$;
  private static final SubLSymbol $ic278$;
  private static final SubLString $ic279$;
  private static final SubLString $ic280$;
  private static final SubLString $ic281$;
  private static final SubLString $ic282$;
  private static final SubLString $ic283$;
  private static final SubLString $ic284$;
  private static final SubLString $ic285$;
  private static final SubLSymbol $ic286$;
  private static final SubLSymbol $ic287$;
  private static final SubLList $ic288$;
  private static final SubLList $ic289$;
  private static final SubLString $ic290$;
  private static final SubLSymbol $ic291$;
  private static final SubLInteger $ic292$;
  private static final SubLString $ic293$;
  private static final SubLInteger $ic294$;
  private static final SubLList $ic295$;
  private static final SubLList $ic296$;
  private static final SubLSymbol $ic297$;
  private static final SubLSymbol $ic298$;
  private static final SubLSymbol $ic299$;
  private static final SubLSymbol $ic300$;
  private static final SubLSymbol $ic301$;
  private static final SubLSymbol $ic302$;
  private static final SubLString $ic303$;
  private static final SubLObject $ic304$;
  private static final SubLList $ic305$;
  private static final SubLList $ic306$;
  private static final SubLSymbol $ic307$;
  private static final SubLString $ic308$;
  private static final SubLList $ic309$;
  private static final SubLString $ic310$;
  private static final SubLObject $ic311$;
  private static final SubLObject $ic312$;
  private static final SubLObject $ic313$;
  private static final SubLObject $ic314$;
  private static final SubLObject $ic315$;
  private static final SubLObject $ic316$;

  public static SubLObject f43496(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    SubLObject var5 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic0$ );
    var5 = var4.first();
    final SubLObject var6;
    var4 = ( var6 = var4.rest() );
    return (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic1$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic2$, var5 ) ), ConsesLow.append( var6,
        (SubLObject) module0711.NIL ) );
  }

  public static SubLObject f43497(final SubLObject var5)
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    assert module0711.NIL != Types.listp( var5 ) : var5;
    if( module0711.NIL == module0077.f5302( module0711.$g5597$.getDynamicValue( var6 ) ) )
    {
      Errors.sublisp_break( (SubLObject) module0711.$ic4$, module0711.EMPTY_SUBL_OBJECT_ARRAY );
    }
    if( module0711.NIL != module0077.f5302( module0711.$g5597$.getDynamicValue( var6 ) ) )
    {
      SubLObject var7 = var5;
      SubLObject var8 = (SubLObject) module0711.NIL;
      var8 = var7.first();
      while ( module0711.NIL != var7)
      {
        SubLObject var8_11;
        final SubLObject var9 = var8_11 = module0205.f13207( var8, (SubLObject) module0711.$ic5$ );
        SubLObject var10 = (SubLObject) module0711.NIL;
        var10 = var8_11.first();
        while ( module0711.NIL != var8_11)
        {
          if( module0711.NIL != module0173.f10955( var10 ) && module0711.NIL == module0077.f5320( var10, module0711.$g5597$.getDynamicValue( var6 ) ) )
          {
            module0077.f5326( var10, module0711.$g5597$.getDynamicValue( var6 ) );
          }
          var8_11 = var8_11.rest();
          var10 = var8_11.first();
        }
        var7 = var7.rest();
        var8 = var7.first();
      }
    }
    return module0711.$g5597$.getDynamicValue( var6 );
  }

  public static SubLObject f43498(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic7$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : module0711.$ic8$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) module0711.$ic7$ );
    var4 = var4.rest();
    if( module0711.NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic1$, (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic9$, (SubLObject) module0711.$ic10$, (SubLObject) ConsesLow.list(
          (SubLObject) module0711.$ic8$, var6 ), (SubLObject) module0711.$ic11$ ), ConsesLow.append( var7, (SubLObject) module0711.NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0711.$ic7$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43499(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic7$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : module0711.$ic8$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) module0711.$ic7$ );
    var4 = var4.rest();
    if( module0711.NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      return (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic12$, (SubLObject) ConsesLow.list( var6 ), (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic13$, (SubLObject) ConsesLow.list( var6 ), ConsesLow
          .append( var7, (SubLObject) module0711.NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0711.$ic7$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43500(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic7$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : module0711.$ic8$ );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) module0711.$ic7$ );
    var4 = var4.rest();
    if( module0711.NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic1$, (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic14$, (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic8$, var6 ) ),
          (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic15$, (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic16$, var6 ), (SubLObject) module0711.$ic17$, var6 ), ConsesLow.append( var7,
              (SubLObject) module0711.NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0711.$ic7$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43501()
  {
    SubLObject var23 = (SubLObject) module0711.NIL;
    SubLObject var24 = module0711.$g5604$.getGlobalValue();
    SubLObject var25 = (SubLObject) module0711.NIL;
    var25 = var24.first();
    while ( module0711.NIL != var24)
    {
      var23 = module0035.f2063( var23, var25, Eval.eval( var25 ), (SubLObject) module0711.UNPROVIDED );
      var24 = var24.rest();
      var25 = var24.first();
    }
    return var23;
  }

  public static SubLObject f43502(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic19$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    SubLObject var6 = (SubLObject) module0711.NIL;
    SubLObject var7 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic19$ );
    var6 = var4.first();
    var4 = var4.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic19$ );
    var7 = var4.first();
    var4 = var4.rest();
    final SubLObject var8 = (SubLObject) ( var4.isCons() ? var4.first() : module0711.NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) module0711.$ic19$ );
    var4 = var4.rest();
    if( module0711.NIL == var4 )
    {
      final SubLObject var9;
      var4 = ( var9 = var5 );
      final SubLObject var10 = (SubLObject) module0711.$ic20$;
      final SubLObject var11 = (SubLObject) module0711.$ic21$;
      return (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic1$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic22$, (SubLObject) ConsesLow.list(
          (SubLObject) module0711.$ic23$, (SubLObject) module0711.$ic24$, var8 ) ), reader.bq_cons( var11, (SubLObject) module0711.$ic25$ ) ), (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic26$,
              (SubLObject) ConsesLow.list( var10, var7 ), (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic27$, var10, (SubLObject) module0711.$ic28$ ), (SubLObject) ConsesLow.list(
                  (SubLObject) module0711.$ic29$, var10, var11 ) ), (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic26$, (SubLObject) ConsesLow.list( var6, (SubLObject) ConsesLow.list(
                      (SubLObject) module0711.$ic30$, (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic31$, var11 ) ) ), ConsesLow.append( var9, (SubLObject) module0711.NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0711.$ic19$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43503()
  {
    final SubLObject var33 = module0711.$g5607$.getGlobalValue();
    if( module0711.NIL != var33 )
    {
      module0034.f1818( var33 );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43504(SubLObject var34)
  {
    if( var34 == module0711.UNPROVIDED )
    {
      var34 = module0711.$g5588$.getDynamicValue();
    }
    return module0034.f1829( module0711.$g5607$.getGlobalValue(), (SubLObject) ConsesLow.list( var34 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43505(final SubLObject var34)
  {
    final SubLThread var35 = SubLProcess.currentSubLThread();
    SubLObject var36 = (SubLObject) module0711.NIL;
    final SubLObject var37 = module0711.$g5588$.currentBinding( var35 );
    final SubLObject var38 = module0710.$g5587$.currentBinding( var35 );
    try
    {
      module0711.$g5588$.bind( var34, var35 );
      module0710.$g5587$.bind( module0107.f7627(), var35 );
      var36 = (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic35$, new SubLObject[] { module0711.$ic36$, module0711.$ic37$, reader.bq_cons( module0711.$ic38$, f43506( module0711.$ic39$,
          (SubLObject) module0711.T, (SubLObject) module0711.UNPROVIDED ) ), reader.bq_cons( module0711.$ic40$, Sequences.cconcatenate( module0710.f43486(), new SubLObject[]
          { module0711.$ic41$, module0711.$ic42$
          } ) ), module0711.$ic43$, reader.bq_cons( module0711.$ic44$, Sequences.cconcatenate( module0710.f43486(), new SubLObject[] { module0711.$ic41$, module0711.$ic45$
          } ) ), module0711.$ic46$
      } );
    }
    finally
    {
      module0710.$g5587$.rebind( var38, var35 );
      module0711.$g5588$.rebind( var37, var35 );
    }
    return var36;
  }

  public static SubLObject f43507(SubLObject var34)
  {
    if( var34 == module0711.UNPROVIDED )
    {
      var34 = module0711.$g5588$.getDynamicValue();
    }
    SubLObject var35 = module0711.$g5607$.getGlobalValue();
    if( module0711.NIL == var35 )
    {
      var35 = module0034.f1934( (SubLObject) module0711.$ic34$, (SubLObject) module0711.$ic47$, (SubLObject) module0711.NIL, (SubLObject) module0711.EQL, (SubLObject) module0711.ONE_INTEGER,
          (SubLObject) module0711.ZERO_INTEGER );
    }
    SubLObject var36 = module0034.f1814( var35, var34, (SubLObject) module0711.$ic48$ );
    if( var36 == module0711.$ic48$ )
    {
      var36 = Values.arg2( Values.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43505( var34 ) ) );
      module0034.f1816( var35, var34, var36, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var36 );
  }

  public static SubLObject f43508(final SubLObject var1, final SubLObject var2)
  {
    SubLObject var4;
    final SubLObject var3 = var4 = var1.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var4, var3, (SubLObject) module0711.$ic57$ );
    final SubLObject var5 = var4.rest();
    var4 = var4.first();
    final SubLObject var6 = (SubLObject) ( var4.isCons() ? var4.first() : module0711.NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var4, var3, (SubLObject) module0711.$ic57$ );
    var4 = var4.rest();
    if( module0711.NIL == var4 )
    {
      final SubLObject var7;
      var4 = ( var7 = var5 );
      return (SubLObject) ConsesLow.listS( (SubLObject) module0711.$ic1$, (SubLObject) module0711.$ic58$, ConsesLow.append( var7, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic59$,
          (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic60$, var6 ), (SubLObject) ConsesLow.list( (SubLObject) module0711.$ic61$, var6 ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var3, (SubLObject) module0711.$ic57$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43509(final SubLObject var44, final SubLObject var45, SubLObject var46)
  {
    if( var46 == module0711.UNPROVIDED )
    {
      var46 = (SubLObject) module0711.$ic62$;
    }
    final SubLThread var47 = SubLProcess.currentSubLThread();
    Hashtables.sethash( (SubLObject) ConsesLow.cons( var45, var46 ), module0711.$g5616$.getDynamicValue( var47 ), var44 );
    return var45;
  }

  public static SubLObject f43510(final SubLObject var43)
  {
    final SubLThread var44 = SubLProcess.currentSubLThread();
    final SubLObject var45 = Sequences.cconcatenate( var43, new SubLObject[] { Characters.CHAR_slash.eql( module0038.f2637( var43 ) ) ? module0711.$ic63$ : module0711.$ic64$, module0711.$ic65$
    } );
    SubLObject var46 = (SubLObject) module0711.NIL;
    try
    {
      final SubLObject var47 = stream_macros.$stream_requires_locking$.currentBinding( var44 );
      try
      {
        stream_macros.$stream_requires_locking$.bind( (SubLObject) module0711.NIL, var44 );
        var46 = compatibility.open_text( var45, (SubLObject) module0711.$ic66$ );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( var47, var44 );
      }
      if( !var46.isStream() )
      {
        Errors.error( (SubLObject) module0711.$ic67$, var45 );
      }
      final SubLObject var49_50 = var46;
      final SubLObject var48 = module0711.$g5616$.getDynamicValue( var44 );
      SubLObject var49 = (SubLObject) module0711.NIL;
      SubLObject var50 = (SubLObject) module0711.NIL;
      final Iterator var51 = Hashtables.getEntrySetIterator( var48 );
      try
      {
        while ( Hashtables.iteratorHasNext( var51 ))
        {
          final Map.Entry var52 = Hashtables.iteratorNextEntry( var51 );
          var49 = Hashtables.getEntryKey( var52 );
          var50 = Hashtables.getEntryValue( var52 );
          SubLObject var54;
          final SubLObject var53 = var54 = var49;
          SubLObject var55 = (SubLObject) module0711.NIL;
          SubLObject var56 = (SubLObject) module0711.NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var54, var53, (SubLObject) module0711.$ic68$ );
          var55 = var54.first();
          var54 = ( var56 = var54.rest() );
          if( var56.eql( (SubLObject) module0711.$ic62$ ) )
          {
            PrintLow.format( var49_50, (SubLObject) module0711.$ic69$, module0213.f13918( var50 ), var55 );
          }
        }
      }
      finally
      {
        Hashtables.releaseEntrySetIterator( var51 );
      }
    }
    finally
    {
      final SubLObject var57 = Threads.$is_thread_performing_cleanupP$.currentBinding( var44 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var44 );
        if( var46.isStream() )
        {
          streams_high.close( var46, (SubLObject) module0711.UNPROVIDED );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var57, var44 );
      }
    }
    return var45;
  }

  public static SubLObject f43511(final SubLObject var45, SubLObject var46)
  {
    if( var46 == module0711.UNPROVIDED )
    {
      var46 = (SubLObject) module0711.$ic62$;
    }
    final SubLThread var47 = SubLProcess.currentSubLThread();
    final SubLObject var48 = (SubLObject) ( var46.eql( (SubLObject) module0711.$ic62$ ) ? module0166.f10737( var45 ) : module0711.NIL );
    return ( module0711.NIL != var48 ) ? var48 : Hashtables.gethash_without_values( (SubLObject) ConsesLow.cons( var45, var46 ), module0711.$g5616$.getDynamicValue( var47 ), (SubLObject) module0711.NIL );
  }

  public static SubLObject f43512(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    SubLObject var33 = (SubLObject) module0711.NIL;
    SubLObject var34 = (SubLObject) module0711.NIL;
    SubLObject var35 = (SubLObject) module0711.NIL;
    try
    {
      var32.throwStack.push( module0003.$g3$.getGlobalValue() );
      final SubLObject var36 = Errors.$error_handler$.currentBinding( var32 );
      try
      {
        Errors.$error_handler$.bind( (SubLObject) module0711.$ic71$, var32 );
        try
        {
          final SubLObject var37 = module0147.f9540( module0711.$g5602$.getDynamicValue( var32 ) );
          final SubLObject var36_62 = module0147.$g2095$.currentBinding( var32 );
          final SubLObject var38 = module0147.$g2094$.currentBinding( var32 );
          final SubLObject var39 = module0147.$g2096$.currentBinding( var32 );
          try
          {
            module0147.$g2095$.bind( module0147.f9545( var37 ), var32 );
            module0147.$g2094$.bind( module0147.f9546( var37 ), var32 );
            module0147.$g2096$.bind( module0147.f9549( var37 ), var32 );
            final SubLObject var41;
            final SubLObject var40 = var41 = module0034.f1888();
            final SubLObject var36_63 = module0034.$g879$.currentBinding( var32 );
            try
            {
              module0034.$g879$.bind( var41, var32 );
              SubLObject var42 = (SubLObject) module0711.NIL;
              if( module0711.NIL != var41 && module0711.NIL == module0034.f1842( var41 ) )
              {
                var42 = module0034.f1869( var41 );
                final SubLObject var43 = Threads.current_process();
                if( module0711.NIL == var42 )
                {
                  module0034.f1873( var41, var43 );
                }
                else if( !var42.eql( var43 ) )
                {
                  Errors.error( (SubLObject) module0711.$ic72$ );
                }
              }
              try
              {
                f43513();
              }
              finally
              {
                final SubLObject var36_64 = Threads.$is_thread_performing_cleanupP$.currentBinding( var32 );
                try
                {
                  Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var32 );
                  SubLObject var44 = f43514( var31 );
                  SubLObject var45 = (SubLObject) module0711.NIL;
                  var45 = var44.first();
                  while ( module0711.NIL != var44)
                  {
                    if( module0711.NIL == module0337.f22630( var45, (SubLObject) ConsesLow.listS( module0711.$ic73$, var31, (SubLObject) module0711.$ic74$ ) ) || module0711.NIL == module0226.f14807( var31 ) )
                    {
                      if( module0711.NIL == module0337.f22630( var45, (SubLObject) ConsesLow.list( module0711.$ic75$, var31, var31 ) ) )
                      {
                        if( module0711.NIL != module0202.f12925( module0205.f13387( var45, (SubLObject) module0711.UNPROVIDED ) ) )
                        {
                          final SubLObject var46 = f43515( var45 );
                          if( var46.isVector() )
                          {
                            final SubLObject var47 = var46;
                            final SubLObject var48 = (SubLObject) module0711.NIL;
                            SubLObject var49;
                            SubLObject var50;
                            SubLObject var51;
                            SubLObject var52;
                            for( var49 = Sequences.length( var47 ), var50 = (SubLObject) module0711.NIL, var50 = (SubLObject) module0711.ZERO_INTEGER; var50.numL( var49 ); var50 = Numbers.add( var50,
                                (SubLObject) module0711.ONE_INTEGER ) )
                            {
                              var51 = ( ( module0711.NIL != var48 ) ? Numbers.subtract( var49, var50, (SubLObject) module0711.ONE_INTEGER ) : var50 );
                              var52 = Vectors.aref( var47, var51 );
                              var33 = (SubLObject) ConsesLow.cons( var52, var33 );
                            }
                          }
                          else
                          {
                            SubLObject var8_78 = var46;
                            SubLObject var53 = (SubLObject) module0711.NIL;
                            var53 = var8_78.first();
                            while ( module0711.NIL != var8_78)
                            {
                              var33 = (SubLObject) ConsesLow.cons( var53, var33 );
                              var8_78 = var8_78.rest();
                              var53 = var8_78.first();
                            }
                          }
                        }
                        else if( module0711.NIL != module0202.f12734( var45, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.UNPROVIDED ) )
                        {
                          final SubLObject var54 = f43516( var45 );
                          if( module0711.NIL != var54 )
                          {
                            var33 = (SubLObject) ConsesLow.cons( var54, var33 );
                          }
                        }
                        else if( module0711.NIL != module0337.f22630( var45, (SubLObject) module0711.$ic76$ ) )
                        {
                          final SubLObject var54 = f43517( var45 );
                          if( module0711.NIL != var54 )
                          {
                            var33 = (SubLObject) ConsesLow.cons( var54, var33 );
                          }
                        }
                        else
                        {
                          Errors.error( (SubLObject) module0711.$ic77$, var45 );
                        }
                      }
                    }
                    var44 = var44.rest();
                    var45 = var44.first();
                  }
                  if( module0711.NIL == module0107.f7629( module0711.$g5596$.getDynamicValue( var32 ) ) && module0711.NIL != module0710.$g5585$.getDynamicValue( var32 ) )
                  {
                    final SubLObject var36_65 = module0710.$g5582$.currentBinding( var32 );
                    final SubLObject var37_81 = module0711.$g5588$.currentBinding( var32 );
                    try
                    {
                      module0710.$g5582$.bind( (SubLObject) module0711.NIL, var32 );
                      module0711.$g5588$.bind( (SubLObject) module0711.T, var32 );
                      final SubLObject var55 = module0202.f12768( f43518( module0711.$ic78$ ), f43519( var31 ), module0712.f43667( var31, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
                          (SubLObject) module0711.UNPROVIDED ) );
                      var33 = (SubLObject) ConsesLow.cons( var55, var33 );
                    }
                    finally
                    {
                      module0711.$g5588$.rebind( var37_81, var32 );
                      module0710.$g5582$.rebind( var36_65, var32 );
                    }
                    if( module0711.NIL == module0711.$g5588$.getDynamicValue( var32 ) )
                    {
                      final SubLObject var36_66 = module0711.$g5588$.currentBinding( var32 );
                      try
                      {
                        module0711.$g5588$.bind( (SubLObject) module0711.T, var32 );
                        final SubLObject var56 = module0202.f12768( f43518( module0711.$ic78$ ), f43519( var31 ), module0712.f43670( var31, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
                            (SubLObject) module0711.UNPROVIDED ) );
                        var33 = (SubLObject) ConsesLow.cons( var56, var33 );
                      }
                      finally
                      {
                        module0711.$g5588$.rebind( var36_66, var32 );
                      }
                    }
                    if( module0711.NIL == module0711.$g5588$.getDynamicValue( var32 ) || module0711.NIL != module0710.$g5582$.getDynamicValue( var32 ) )
                    {
                      final SubLObject var36_67 = module0711.$g5588$.currentBinding( var32 );
                      final SubLObject var37_82 = module0710.$g5582$.currentBinding( var32 );
                      try
                      {
                        module0711.$g5588$.bind( (SubLObject) module0711.T, var32 );
                        module0710.$g5582$.bind( (SubLObject) module0711.NIL, var32 );
                        final SubLObject var57 = module0202.f12768( f43518( module0711.$ic78$ ), f43519( var31 ), module0712.f43670( var31, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
                            (SubLObject) module0711.UNPROVIDED ) );
                        var33 = (SubLObject) ConsesLow.cons( var57, var33 );
                      }
                      finally
                      {
                        module0710.$g5582$.rebind( var37_82, var32 );
                        module0711.$g5588$.rebind( var36_67, var32 );
                      }
                    }
                  }
                  var35 = f43519( var31 );
                  if( module0711.NIL != var41 && module0711.NIL == var42 )
                  {
                    module0034.f1873( var41, (SubLObject) module0711.NIL );
                  }
                }
                finally
                {
                  Threads.$is_thread_performing_cleanupP$.rebind( var36_64, var32 );
                }
              }
            }
            finally
            {
              module0034.$g879$.rebind( var36_63, var32 );
            }
          }
          finally
          {
            module0147.$g2096$.rebind( var39, var32 );
            module0147.$g2094$.rebind( var38, var32 );
            module0147.$g2095$.rebind( var36_62, var32 );
          }
        }
        catch( Throwable var58 )
        {
          Errors.handleThrowable( var58, (SubLObject) module0711.NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var36, var32 );
      }
    }
    catch( Throwable var59 )
    {
      var34 = Errors.handleThrowable( var59, module0003.$g3$.getGlobalValue() );
    }
    finally
    {
      var32.throwStack.pop();
    }
    if( module0711.NIL != var34 )
    {
      Errors.warn( (SubLObject) module0711.$ic79$, var31, var34 );
    }
    return (SubLObject) ConsesLow.cons( var35, Sequences.nreverse( var33 ) );
  }

  public static SubLObject f43520(final SubLObject var89)
  {
    final SubLObject var90 = f43521( var89 );
    return Values.values( module0052.f3709( var90 ), Sequences.length( var90 ) );
  }

  public static SubLObject f43521(final SubLObject var89)
  {
    final SubLThread var90 = SubLProcess.currentSubLThread();
    final SubLObject var91 = Symbols.symbol_function( (SubLObject) module0711.EQUAL );
    SubLObject var92 = module0077.f5313( var91, (SubLObject) module0711.UNPROVIDED );
    SubLObject var93 = module0077.f5313( var91, (SubLObject) module0711.UNPROVIDED );
    SubLObject var94 = module0077.f5313( var91, (SubLObject) module0711.UNPROVIDED );
    SubLObject var97;
    for( SubLObject var95 = (SubLObject) module0711.NIL; module0711.NIL == var95; var95 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var97 ) )
    {
      var90.resetMultipleValues();
      final SubLObject var96 = module0052.f3693( var89 );
      var97 = var90.secondMultipleValue();
      var90.resetMultipleValues();
      if( module0711.NIL != var97 )
      {
        if( module0711.NIL != f43522( var96 ) )
        {
          module0077.f5326( var96, var94 );
        }
        else if( module0711.NIL == module0173.f10955( var96 ) )
        {
          Errors.warn( (SubLObject) module0711.$ic80$, var96 );
        }
        else if( module0711.NIL != module0205.f13145( (SubLObject) module0711.$ic81$, var96, (SubLObject) module0711.T, (SubLObject) module0711.UNPROVIDED ) )
        {
          f43523( var96 );
        }
        else if( module0711.NIL != module0269.f17710( var96 ) )
        {
          var90.resetMultipleValues();
          final SubLObject var98 = f43524( var96 );
          final SubLObject var99 = var90.secondMultipleValue();
          var90.resetMultipleValues();
          if( module0711.NIL != var98 )
          {
            f43525( var96, var92 );
            SubLObject var100 = var99;
            SubLObject var101 = (SubLObject) module0711.NIL;
            var101 = var100.first();
            while ( module0711.NIL != var100)
            {
              f43525( var101, var93 );
              var100 = var100.rest();
              var101 = var100.first();
            }
          }
        }
        else if( module0711.NIL != module0226.f14807( var96 ) )
        {
          f43525( var96, var93 );
        }
        else if( module0711.NIL != module0269.f17734( var96 ) )
        {
          f43525( var96, var94 );
        }
        else if( module0711.NIL != module0259.f16891( var96, module0711.$ic82$ ) )
        {
          Errors.warn( (SubLObject) module0711.$ic83$, var96 );
        }
        else
        {
          f43525( var96, var94 );
        }
      }
    }
    final SubLObject var102 = Numbers.add( module0077.f5311( var92 ), module0077.f5311( var93 ), module0077.f5311( var94 ) );
    final SubLObject var103 = module0012.$g75$.currentBinding( var90 );
    final SubLObject var104 = module0012.$g76$.currentBinding( var90 );
    final SubLObject var105 = module0012.$g77$.currentBinding( var90 );
    final SubLObject var106 = module0012.$g78$.currentBinding( var90 );
    try
    {
      module0012.$g75$.bind( (SubLObject) module0711.ZERO_INTEGER, var90 );
      module0012.$g76$.bind( (SubLObject) module0711.NIL, var90 );
      module0012.$g77$.bind( (SubLObject) module0711.T, var90 );
      module0012.$g78$.bind( Time.get_universal_time(), var90 );
      module0012.f478( Sequences.cconcatenate( (SubLObject) module0711.$ic84$, new SubLObject[] { module0006.f207( var102 ), module0711.$ic85$
      } ) );
      var92 = f43526( var92 );
      module0012.note_percent_progress( (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.FOUR_INTEGER );
      var93 = f43526( var93 );
      module0012.note_percent_progress( (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.FOUR_INTEGER );
      var94 = f43526( var94 );
      module0012.note_percent_progress( (SubLObject) module0711.THREE_INTEGER, (SubLObject) module0711.FOUR_INTEGER );
      module0012.f479();
    }
    finally
    {
      module0012.$g78$.rebind( var106, var90 );
      module0012.$g77$.rebind( var105, var90 );
      module0012.$g76$.rebind( var104, var90 );
      module0012.$g75$.rebind( var103, var90 );
    }
    if( module0711.NIL != module0004.f105( module0711.$g5601$.getDynamicValue( var90 ) ) )
    {
      var92 = module0035.f2124( module0711.$g5601$.getDynamicValue( var90 ), var92 );
      var93 = module0035.f2124( module0711.$g5601$.getDynamicValue( var90 ), var93 );
      var94 = module0035.f2124( module0711.$g5601$.getDynamicValue( var90 ), var94 );
    }
    if( module0711.NIL != module0711.$g5599$.getDynamicValue( var90 ) )
    {
      var92 = module0035.f2123( (SubLObject) module0711.$ic86$, var92 );
      var93 = module0035.f2123( (SubLObject) module0711.$ic86$, var93 );
      var94 = module0035.f2123( (SubLObject) module0711.$ic86$, var94 );
    }
    return ConsesLow.nconc( var92, var93, var94 );
  }

  public static SubLObject f43525(final SubLObject var44, final SubLObject var102)
  {
    final SubLObject var103 = ( module0711.NIL != module0167.f10813( var44 ) ) ? f43527( var44 ) : var44;
    if( module0711.NIL != module0173.f10955( var103 ) )
    {
      module0077.f5326( var103, var102 );
    }
    else
    {
      Errors.warn( (SubLObject) module0711.$ic87$, var44 );
    }
    return var102;
  }

  public static SubLObject f43527(final SubLObject var104)
  {
    return (SubLObject) ( ( module0711.NIL != f43528( var104 ) ) ? module0711.NIL : f43529( var104 ) );
  }

  public static SubLObject f43530(final SubLObject var104)
  {
    return module0172.f10922( module0172.f10920( var104 ) );
  }

  public static SubLObject f43529(final SubLObject var104)
  {
    final SubLThread var105 = SubLProcess.currentSubLThread();
    final SubLObject var106 = module0034.$g879$.getDynamicValue( var105 );
    SubLObject var107 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var106 )
    {
      return f43530( var104 );
    }
    var107 = module0034.f1857( var106, (SubLObject) module0711.$ic88$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var107 )
    {
      var107 = module0034.f1807( module0034.f1842( var106 ), (SubLObject) module0711.$ic88$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQ,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var106, (SubLObject) module0711.$ic88$, var107 );
    }
    SubLObject var108 = module0034.f1814( var107, var104, (SubLObject) module0711.$ic48$ );
    if( var108 == module0711.$ic48$ )
    {
      var108 = Values.arg2( var105.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43530( var104 ) ) );
      module0034.f1816( var107, var104, var108, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var108 );
  }

  public static SubLObject f43528(final SubLObject var104)
  {
    assert module0711.NIL != module0167.f10813( var104 ) : var104;
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == module0167.f10813( f43529( var104 ) ) || module0711.NIL != module0035.f2002( f43531( var104 ), (SubLObject) module0711.$ic90$,
        (SubLObject) module0711.UNPROVIDED ) || module0711.NIL != module0035.f2002( f43532( var104, (SubLObject) module0711.UNPROVIDED ), (SubLObject) module0711.$ic90$, (SubLObject) module0711.UNPROVIDED ) );
  }

  public static SubLObject f43533(final SubLObject var5)
  {
    return module0035.f2462( var5, (SubLObject) module0711.$ic91$, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43534(final SubLObject var108, final SubLObject var109)
  {
    if( !module0205.f13333( var108 ).equal( module0205.f13333( var109 ) ) )
    {
      return (SubLObject) module0711.NIL;
    }
    if( !module0205.f13387( var108, (SubLObject) module0711.UNPROVIDED ).equal( module0205.f13387( var109, (SubLObject) module0711.UNPROVIDED ) ) )
    {
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0004.f104( module0205.f13333( var108 ), module0711.$g5619$.getGlobalValue(), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) && module0711.NIL != module0256
        .f16576( module0205.f13388( var108, (SubLObject) module0711.UNPROVIDED ), module0205.f13388( var109, (SubLObject) module0711.UNPROVIDED ), (SubLObject) module0711.UNPROVIDED,
            (SubLObject) module0711.UNPROVIDED ) )
    {
      return (SubLObject) module0711.T;
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43524(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    var45.resetMultipleValues();
    final SubLObject var46 = f43535( var44 );
    final SubLObject var47 = var45.secondMultipleValue();
    var45.resetMultipleValues();
    if( module0711.NIL == var46 )
    {
      f43523( var44 );
    }
    return Values.values( var46, var47 );
  }

  public static SubLObject f43536(final SubLObject var44)
  {
    Errors.warn( (SubLObject) module0711.$ic94$, var44 );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43523(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    final SubLObject var46 = module0034.$g879$.getDynamicValue( var45 );
    SubLObject var47 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var46 )
    {
      return f43536( var44 );
    }
    var47 = module0034.f1857( var46, (SubLObject) module0711.$ic93$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var47 )
    {
      var47 = module0034.f1807( module0034.f1842( var46 ), (SubLObject) module0711.$ic93$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var46, (SubLObject) module0711.$ic93$, var47 );
    }
    SubLObject var48 = module0034.f1814( var47, var44, (SubLObject) module0711.$ic48$ );
    if( var48 == module0711.$ic48$ )
    {
      var48 = Values.arg2( var45.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43536( var44 ) ) );
      module0034.f1816( var47, var44, var48, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var48 );
  }

  public static SubLObject f43535(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    SubLObject var46 = module0173.f10955( var44 );
    SubLObject var47 = (SubLObject) module0711.NIL;
    if( module0711.NIL == module0269.f17710( var44 ) )
    {
      Errors.warn( (SubLObject) module0711.$ic95$, var44 );
      var46 = (SubLObject) module0711.NIL;
    }
    else if( module0711.NIL != module0167.f10813( var44 ) && module0711.NIL != f43528( var44 ) )
    {
      var46 = (SubLObject) module0711.NIL;
    }
    else if( module0711.NIL != module0167.f10813( var44 ) && module0711.THREE_INTEGER.eql( module0205.f13360( var44, (SubLObject) module0711.UNPROVIDED ) ) && module0711.NIL != module0259.f16854( module0205.f13276(
        var44 ), module0711.$ic96$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      var45.resetMultipleValues();
      final SubLObject var110_111 = f43535( module0205.f13277( var44, (SubLObject) module0711.UNPROVIDED ) );
      final SubLObject var112_113 = var45.secondMultipleValue();
      var45.resetMultipleValues();
      var46 = var110_111;
      var47 = var112_113;
      if( module0711.NIL != var46 )
      {
        if( module0711.NIL != module0035.find_if_not( (SubLObject) module0711.$ic97$, module0205.f13207( var44, (SubLObject) module0711.UNPROVIDED ), (SubLObject) module0711.UNPROVIDED,
            (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
        {
          var46 = (SubLObject) module0711.NIL;
        }
        else if( module0711.NIL == module0226.f14807( module0205.f13368( var44, (SubLObject) module0711.UNPROVIDED ) ) )
        {
          Errors.warn( (SubLObject) module0711.$ic98$, module0205.f13368( var44, (SubLObject) module0711.UNPROVIDED ) );
          var46 = (SubLObject) module0711.NIL;
        }
        else if( module0711.NIL != conses_high.member( module0205.f13276( var44 ), (SubLObject) module0711.$ic99$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
        {
          final SubLObject var48 = module0205.f13368( var44, (SubLObject) module0711.UNPROVIDED );
          final SubLObject var49 = f43537( var48 );
          if( module0711.NIL == Errors.$ignore_mustsP$.getDynamicValue( var45 ) && module0711.NIL == module0173.f10955( var49 ) )
          {
            Errors.error( (SubLObject) module0711.$ic100$, var48 );
          }
          final SubLObject var50 = var49;
          if( module0711.NIL == conses_high.member( var50, var47, Symbols.symbol_function( (SubLObject) module0711.EQL ), Symbols.symbol_function( (SubLObject) module0711.IDENTITY ) ) )
          {
            var47 = (SubLObject) ConsesLow.cons( var50, var47 );
          }
        }
        else if( module0711.NIL != conses_high.member( module0205.f13276( var44 ), (SubLObject) module0711.$ic101$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
        {
          final SubLObject var48 = module0205.f13368( var44, (SubLObject) module0711.UNPROVIDED );
          if( module0711.NIL == Errors.$ignore_mustsP$.getDynamicValue( var45 ) && module0711.NIL == module0173.f10955( var48 ) )
          {
            Errors.error( (SubLObject) module0711.$ic102$, var48 );
          }
          final SubLObject var51 = var48;
          if( module0711.NIL == conses_high.member( var51, var47, Symbols.symbol_function( (SubLObject) module0711.EQL ), Symbols.symbol_function( (SubLObject) module0711.IDENTITY ) ) )
          {
            var47 = (SubLObject) ConsesLow.cons( var51, var47 );
          }
        }
      }
    }
    SubLObject subLObject = var46;
    return Values.values( subLObject, (SubLObject) ( ( module0711.NIL != ( subLObject = var46 ) ) ? var47 : module0711.NIL ) );
  }

  public static SubLObject f43526(final SubLObject var117)
  {
    return Sort.sort( module0077.f5312( var117 ), (SubLObject) module0711.$ic103$, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43538(final SubLObject var118, final SubLObject var119)
  {
    if( module0711.NIL != module0128.f8449( var118 ) )
    {
      if( module0711.NIL != module0128.f8449( var119 ) )
      {
        return Strings.stringL( f43539( var118 ), f43539( var119 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      }
      return (SubLObject) module0711.NIL;
    }
    else
    {
      if( module0711.NIL != module0128.f8449( var119 ) )
      {
        return (SubLObject) module0711.T;
      }
      final SubLObject var120 = module0205.f13276( var118 );
      final SubLObject var121 = module0205.f13276( var119 );
      if( module0711.NIL != f43538( var120, var121 ) )
      {
        return (SubLObject) module0711.T;
      }
      if( module0711.NIL != f43538( var121, var120 ) )
      {
        return (SubLObject) module0711.NIL;
      }
      return Strings.stringL( f43539( var118 ), f43539( var119 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
  }

  public static SubLObject f43514(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0107.f7629( module0711.$g5596$.getDynamicValue( var45 ) ) )
    {
      return f43540( f43541( module0067.f4885( module0711.$g5596$.getDynamicValue( var45 ), var44, (SubLObject) module0711.UNPROVIDED ) ) );
    }
    final SubLObject var46 = module0219.f14509( var44, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.NIL, (SubLObject) module0711.$ic104$ );
    SubLObject var47 = Mapping.mapcar( (SubLObject) module0711.$ic105$, var46 );
    var47 = ConsesLow.nconc( var47, f43542( var44 ) );
    var47 = Sequences.delete_if( (SubLObject) module0711.$ic106$, var47, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    var47 = f43543( var44, var47 );
    var47 = f43541( var47 );
    var47 = f43544( var47 );
    var47 = module0035.delete_if_not( (SubLObject) module0711.$ic107$, var47, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED );
    final SubLObject var49;
    final SubLObject var48 = var49 = f43545( var44 );
    if( var49.isVector() )
    {
      final SubLObject var50 = var49;
      final SubLObject var51 = (SubLObject) module0711.NIL;
      SubLObject var52;
      SubLObject var53;
      SubLObject var54;
      SubLObject var55;
      for( var52 = Sequences.length( var50 ), var53 = (SubLObject) module0711.NIL, var53 = (SubLObject) module0711.ZERO_INTEGER; var53.numL( var52 ); var53 = Numbers.add( var53, (SubLObject) module0711.ONE_INTEGER ) )
      {
        var54 = ( ( module0711.NIL != var51 ) ? Numbers.subtract( var52, var53, (SubLObject) module0711.ONE_INTEGER ) : var53 );
        var55 = Vectors.aref( var50, var54 );
        var47 = (SubLObject) ConsesLow.cons( var55, var47 );
      }
    }
    else
    {
      SubLObject var56 = var49;
      SubLObject var57 = (SubLObject) module0711.NIL;
      var57 = var56.first();
      while ( module0711.NIL != var56)
      {
        var47 = (SubLObject) ConsesLow.cons( var57, var47 );
        var56 = var56.rest();
        var57 = var56.first();
      }
    }
    var47 = module0035.f2269( var47, Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED );
    var47 = f43546( var47 );
    return f43540( var47 );
  }

  public static SubLObject f43547(final SubLObject var124)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0004.f104( var124, module0711.$g5609$.getGlobalValue(), Symbols.symbol_function( (SubLObject) module0711.EQUAL ),
        (SubLObject) module0711.UNPROVIDED ) || module0711.NIL != module0035.f2293( f43507( (SubLObject) module0711.UNPROVIDED ), var124, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) );
  }

  public static SubLObject f43548(final SubLObject var9)
  {
    SubLObject var10 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var10 )
    {
      SubLObject var11 = module0711.$g5620$.getGlobalValue();
      SubLObject var12 = (SubLObject) module0711.NIL;
      var12 = var11.first();
      while ( module0711.NIL == var10 && module0711.NIL != var11)
      {
        if( module0711.NIL != module0337.f22630( var9, var12 ) )
        {
          var10 = (SubLObject) module0711.T;
        }
        var11 = var11.rest();
        var12 = var11.first();
      }
    }
    return var10;
  }

  public static SubLObject f43549(final SubLObject var124)
  {
    final SubLThread var125 = SubLProcess.currentSubLThread();
    return module0004.f104( var124, module0711.$g5608$.getDynamicValue( var125 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43543(final SubLObject var44, SubLObject var5)
  {
    var5 = Sequences.delete_if( (SubLObject) module0711.$ic109$, Sequences.delete_if( (SubLObject) module0711.$ic110$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED );
    SubLObject var45 = f43550( var44 );
    if( var45.isVector() )
    {
      final SubLObject var46 = var45;
      final SubLObject var47 = (SubLObject) module0711.NIL;
      SubLObject var48;
      SubLObject var49;
      SubLObject var50;
      SubLObject var51;
      for( var48 = Sequences.length( var46 ), var49 = (SubLObject) module0711.NIL, var49 = (SubLObject) module0711.ZERO_INTEGER; var49.numL( var48 ); var49 = Numbers.add( var49, (SubLObject) module0711.ONE_INTEGER ) )
      {
        var50 = ( ( module0711.NIL != var47 ) ? Numbers.subtract( var48, var49, (SubLObject) module0711.ONE_INTEGER ) : var49 );
        var51 = Vectors.aref( var46, var50 );
        var5 = (SubLObject) ConsesLow.cons( var51, var5 );
      }
    }
    else
    {
      SubLObject var52 = var45;
      SubLObject var53 = (SubLObject) module0711.NIL;
      var53 = var52.first();
      while ( module0711.NIL != var52)
      {
        var5 = (SubLObject) ConsesLow.cons( var53, var5 );
        var52 = var52.rest();
        var53 = var52.first();
      }
    }
    if( module0711.NIL != module0269.f17710( var44 ) )
    {
      var45 = f43551( var44 );
      if( var45.isVector() )
      {
        final SubLObject var46 = var45;
        final SubLObject var47 = (SubLObject) module0711.NIL;
        SubLObject var48;
        SubLObject var49;
        SubLObject var50;
        SubLObject var51;
        for( var48 = Sequences.length( var46 ), var49 = (SubLObject) module0711.NIL, var49 = (SubLObject) module0711.ZERO_INTEGER; var49.numL( var48 ); var49 = Numbers.add( var49, (SubLObject) module0711.ONE_INTEGER ) )
        {
          var50 = ( ( module0711.NIL != var47 ) ? Numbers.subtract( var48, var49, (SubLObject) module0711.ONE_INTEGER ) : var49 );
          var51 = Vectors.aref( var46, var50 );
          var5 = (SubLObject) ConsesLow.cons( var51, var5 );
        }
      }
      else
      {
        SubLObject var52 = var45;
        SubLObject var53 = (SubLObject) module0711.NIL;
        var53 = var52.first();
        while ( module0711.NIL != var52)
        {
          var5 = (SubLObject) ConsesLow.cons( var53, var5 );
          var52 = var52.rest();
          var53 = var52.first();
        }
      }
    }
    return var5;
  }

  public static SubLObject f43550(final SubLObject var44)
  {
    final SubLObject var45 = module0259.f16840( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var46 = module0035.delete_if_not( (SubLObject) module0711.$ic111$, var45, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED );
    final SubLObject var47 = module0256.f16529( var46, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    SubLObject var48 = (SubLObject) module0711.NIL;
    SubLObject var49 = var47;
    SubLObject var50 = (SubLObject) module0711.NIL;
    var50 = var49.first();
    while ( module0711.NIL != var49)
    {
      var48 = (SubLObject) ConsesLow.cons( module0202.f12768( module0711.$ic73$, var44, var50 ), var48 );
      var49 = var49.rest();
      var50 = var49.first();
    }
    return var48;
  }

  public static SubLObject f43551(final SubLObject var44)
  {
    final SubLObject var45 = module0256.f16524( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    SubLObject var46 = Sequences.delete( var44, module0035.delete_if_not( (SubLObject) module0711.$ic111$, var45, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    SubLObject var47 = (SubLObject) module0711.NIL;
    if( module0711.NIL != module0035.f2012( var46 ) )
    {
      var46 = (SubLObject) ConsesLow.cons( module0711.$ic112$, var46 );
    }
    SubLObject var48 = var46;
    SubLObject var49 = (SubLObject) module0711.NIL;
    var49 = var48.first();
    while ( module0711.NIL != var48)
    {
      var47 = (SubLObject) ConsesLow.cons( module0202.f12768( module0711.$ic75$, var44, var49 ), var47 );
      var48 = var48.rest();
      var49 = var48.first();
    }
    return var47;
  }

  public static SubLObject f43552(final SubLObject var5)
  {
    final SubLObject var6 = module0067.f4880( Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED );
    SubLObject var7 = var5;
    SubLObject var8 = (SubLObject) module0711.NIL;
    var8 = var7.first();
    while ( module0711.NIL != var7)
    {
      module0084.f5765( var6, module0205.f13387( var8, (SubLObject) module0711.UNPROVIDED ), var8, Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED );
      var7 = var7.rest();
      var8 = var7.first();
    }
    return var6;
  }

  public static SubLObject f43542(final SubLObject var44)
  {
    SubLObject var45 = (SubLObject) module0711.NIL;
    final SubLObject var46 = module0711.$ic113$;
    if( module0711.NIL != module0158.f10010( var44, (SubLObject) module0711.ONE_INTEGER, var46 ) )
    {
      final SubLObject var47 = module0158.f10011( var44, (SubLObject) module0711.ONE_INTEGER, var46 );
      SubLObject var48 = (SubLObject) module0711.NIL;
      final SubLObject var49 = (SubLObject) module0711.NIL;
      while ( module0711.NIL == var48)
      {
        final SubLObject var50 = module0052.f3695( var47, var49 );
        final SubLObject var51 = (SubLObject) SubLObjectFactory.makeBoolean( !var49.eql( var50 ) );
        if( module0711.NIL != var51 )
        {
          SubLObject var52 = (SubLObject) module0711.NIL;
          try
          {
            var52 = module0158.f10316( var50, (SubLObject) module0711.$ic114$, (SubLObject) module0711.$ic104$, (SubLObject) module0711.NIL );
            SubLObject var138_143 = (SubLObject) module0711.NIL;
            final SubLObject var139_144 = (SubLObject) module0711.NIL;
            while ( module0711.NIL == var138_143)
            {
              final SubLObject var53 = module0052.f3695( var52, var139_144 );
              final SubLObject var141_146 = (SubLObject) SubLObjectFactory.makeBoolean( !var139_144.eql( var53 ) );
              if( module0711.NIL != var141_146 && module0178.f11336( var53 ).eql( module0711.$ic115$ ) )
              {
                var45 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( module0711.$ic116$, var44, module0178.f11335( var53 ), module0178.f11337( var53 ) ), var45 );
              }
              var138_143 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var141_146 );
            }
          }
          finally
          {
            final SubLObject var54 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) module0711.T );
              if( module0711.NIL != var52 )
              {
                module0158.f10319( var52 );
              }
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var54 );
            }
          }
        }
        var48 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var51 );
      }
    }
    final SubLObject var55 = module0077.f5333( f43553( var44, (SubLObject) module0711.UNPROVIDED ) );
    SubLObject var56;
    SubLObject var57;
    SubLObject var58;
    SubLObject var59;
    SubLObject var60;
    SubLObject var61;
    SubLObject var62;
    SubLObject var63;
    SubLObject var64;
    SubLObject var65;
    SubLObject var138_144;
    SubLObject var139_145;
    SubLObject var66;
    SubLObject var141_147;
    SubLObject var67;
    SubLObject var68;
    for( var56 = module0032.f1741( var55 ), var57 = (SubLObject) module0711.NIL, var57 = module0032.f1742( var56, var55 ); module0711.NIL == module0032.f1744( var56, var57 ); var57 = module0032.f1743( var57 ) )
    {
      var58 = module0032.f1745( var56, var57 );
      if( module0711.NIL != module0032.f1746( var57, var58 ) )
      {
        var59 = module0711.$ic116$;
        if( module0711.NIL != module0158.f10010( var58, (SubLObject) module0711.ONE_INTEGER, var59 ) )
        {
          var60 = module0158.f10011( var58, (SubLObject) module0711.ONE_INTEGER, var59 );
          var61 = (SubLObject) module0711.NIL;
          var62 = (SubLObject) module0711.NIL;
          while ( module0711.NIL == var61)
          {
            var63 = module0052.f3695( var60, var62 );
            var64 = (SubLObject) SubLObjectFactory.makeBoolean( !var62.eql( var63 ) );
            if( module0711.NIL != var64 )
            {
              var65 = (SubLObject) module0711.NIL;
              try
              {
                var65 = module0158.f10316( var63, (SubLObject) module0711.$ic114$, (SubLObject) module0711.$ic104$, (SubLObject) module0711.NIL );
                var138_144 = (SubLObject) module0711.NIL;
                var139_145 = (SubLObject) module0711.NIL;
                while ( module0711.NIL == var138_144)
                {
                  var66 = module0052.f3695( var65, var139_145 );
                  var141_147 = (SubLObject) SubLObjectFactory.makeBoolean( !var139_145.eql( var66 ) );
                  if( module0711.NIL != var141_147 )
                  {
                    var67 = module0202.f12817( (SubLObject) module0711.ONE_INTEGER, var44, var66 );
                    if( module0711.NIL == conses_high.member( var67, var45, Symbols.symbol_function( (SubLObject) module0711.EQUAL ), Symbols.symbol_function( (SubLObject) module0711.IDENTITY ) ) )
                    {
                      var45 = (SubLObject) ConsesLow.cons( var67, var45 );
                    }
                  }
                  var138_144 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var141_147 );
                }
              }
              finally
              {
                var68 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                try
                {
                  Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) module0711.T );
                  if( module0711.NIL != var65 )
                  {
                    module0158.f10319( var65 );
                  }
                }
                finally
                {
                  Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var68 );
                }
              }
            }
            var61 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var64 );
          }
        }
      }
    }
    return var45;
  }

  public static SubLObject f43553(final SubLObject var154, SubLObject var155)
  {
    if( var155 == module0711.UNPROVIDED )
    {
      var155 = module0078.f5369( var154, Symbols.symbol_function( (SubLObject) module0711.EQL ) );
    }
    final SubLObject var156 = module0711.$ic116$;
    if( module0711.NIL != module0158.f10010( var154, (SubLObject) module0711.ONE_INTEGER, var156 ) )
    {
      final SubLObject var157 = module0158.f10011( var154, (SubLObject) module0711.ONE_INTEGER, var156 );
      SubLObject var158 = (SubLObject) module0711.NIL;
      final SubLObject var159 = (SubLObject) module0711.NIL;
      while ( module0711.NIL == var158)
      {
        final SubLObject var160 = module0052.f3695( var157, var159 );
        final SubLObject var161 = (SubLObject) SubLObjectFactory.makeBoolean( !var159.eql( var160 ) );
        if( module0711.NIL != var161 )
        {
          SubLObject var162 = (SubLObject) module0711.NIL;
          try
          {
            var162 = module0158.f10316( var160, (SubLObject) module0711.$ic114$, (SubLObject) module0711.$ic104$, (SubLObject) module0711.NIL );
            SubLObject var138_156 = (SubLObject) module0711.NIL;
            final SubLObject var139_157 = (SubLObject) module0711.NIL;
            while ( module0711.NIL == var138_156)
            {
              final SubLObject var163 = module0052.f3695( var162, var139_157 );
              final SubLObject var141_158 = (SubLObject) SubLObjectFactory.makeBoolean( !var139_157.eql( var163 ) );
              if( module0711.NIL != var141_158 )
              {
                final SubLObject var164 = module0178.f11335( var163 );
                final SubLObject var165 = module0178.f11336( var163 );
                final SubLObject var136_161 = module0711.$ic116$;
                if( module0711.NIL != module0158.f10010( var165, (SubLObject) module0711.THREE_INTEGER, var136_161 ) )
                {
                  final SubLObject var137_162 = module0158.f10011( var165, (SubLObject) module0711.THREE_INTEGER, var136_161 );
                  SubLObject var138_157 = (SubLObject) module0711.NIL;
                  final SubLObject var139_158 = (SubLObject) module0711.NIL;
                  while ( module0711.NIL == var138_157)
                  {
                    final SubLObject var140_165 = module0052.f3695( var137_162, var139_158 );
                    final SubLObject var141_159 = (SubLObject) SubLObjectFactory.makeBoolean( !var139_158.eql( var140_165 ) );
                    if( module0711.NIL != var141_159 )
                    {
                      SubLObject var142_167 = (SubLObject) module0711.NIL;
                      try
                      {
                        var142_167 = module0158.f10316( var140_165, (SubLObject) module0711.$ic114$, (SubLObject) module0711.$ic104$, (SubLObject) module0711.NIL );
                        SubLObject var138_158 = (SubLObject) module0711.NIL;
                        final SubLObject var139_159 = (SubLObject) module0711.NIL;
                        while ( module0711.NIL == var138_158)
                        {
                          final SubLObject var166 = module0052.f3695( var142_167, var139_159 );
                          final SubLObject var141_160 = (SubLObject) SubLObjectFactory.makeBoolean( !var139_159.eql( var166 ) );
                          if( module0711.NIL != var141_160 && module0178.f11335( var166 ).eql( var164 ) && module0711.NIL != module0212.f13762( module0178.f11334( var166 ) ) && module0711.NIL == module0077.f5320(
                              module0178.f11334( var166 ), var155 ) )
                          {
                            final SubLObject var167 = module0178.f11334( var166 );
                            module0077.f5326( var167, var155 );
                            f43553( var167, var155 );
                          }
                          var138_158 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var141_160 );
                        }
                      }
                      finally
                      {
                        final SubLObject var168 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
                        try
                        {
                          Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) module0711.T );
                          if( module0711.NIL != var142_167 )
                          {
                            module0158.f10319( var142_167 );
                          }
                        }
                        finally
                        {
                          Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var168 );
                        }
                      }
                    }
                    var138_157 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var141_159 );
                  }
                }
              }
              var138_156 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var141_158 );
            }
          }
          finally
          {
            final SubLObject var169 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
            try
            {
              Dynamic.bind( Threads.$is_thread_performing_cleanupP$, (SubLObject) module0711.T );
              if( module0711.NIL != var162 )
              {
                module0158.f10319( var162 );
              }
            }
            finally
            {
              Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var169 );
            }
          }
        }
        var158 = (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL == var161 );
      }
    }
    return var155;
  }

  public static SubLObject f43540(final SubLObject var5)
  {
    return Sort.sort( var5, (SubLObject) module0711.$ic117$, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43546(final SubLObject var5)
  {
    final SubLObject var6 = Sequences.count_if( (SubLObject) module0711.$ic118$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    if( var6.numG( (SubLObject) module0711.ONE_INTEGER ) )
    {
      final SubLObject var7 = Sequences.find_if( (SubLObject) module0711.$ic118$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var8 = Sequences.remove_if( (SubLObject) module0711.$ic118$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
          (SubLObject) module0711.UNPROVIDED );
      return (SubLObject) ConsesLow.listS( var7, var8 );
    }
    return var5;
  }

  public static SubLObject f43554(final SubLObject var176)
  {
    return module0202.f12589( var176, module0711.$ic119$ );
  }

  public static SubLObject f43522(final SubLObject var70)
  {
    if( module0711.NIL == module0202.f12925( var70 ) )
    {
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0202.f12598( var70 ) && module0711.NIL != f43555( module0205.f13333( var70 ) ) && module0711.NIL != f43556( module0205.f13387( var70, (SubLObject) module0711.UNPROVIDED ) )
        && module0711.NIL != f43557( module0205.f13333( var70 ), module0205.f13388( var70, (SubLObject) module0711.UNPROVIDED ) ) )
    {
      return (SubLObject) module0711.T;
    }
    if( module0711.NIL != module0337.f22630( var70, (SubLObject) module0711.$ic120$ ) )
    {
      return (SubLObject) module0711.T;
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43555(final SubLObject var176)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != f43547( var176 ) || ( module0711.NIL != module0226.f14807( var176 ) && module0711.NIL != module0712.f43736( var176 ) ) );
  }

  public static SubLObject f43556(final SubLObject var176)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0173.f10955( var176 ) || module0711.NIL != f43522( var176 ) );
  }

  public static SubLObject f43557(final SubLObject var177, final SubLObject var114)
  {
    if( module0711.NIL != module0167.f10813( var114 ) && module0711.NIL != f43528( var114 ) )
    {
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0035.f2169( var177, module0711.$g5615$.getGlobalValue() ) )
    {
      return (SubLObject) module0711.T;
    }
    if( module0711.NIL != module0035.f2169( var177, module0711.$g5614$.getGlobalValue() ) )
    {
      return (SubLObject) SubLObjectFactory.makeBoolean( ( module0711.NIL == module0269.f17710( var114 ) || module0711.NIL != f43524( var114 ) ) && module0711.NIL != module0173.f10955( var114 ) );
    }
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0712.f43736( var114 ) || module0711.NIL != f43558( var114 ) || var114.isString() || var114.isNumber() );
  }

  public static SubLObject f43558(final SubLObject var124)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0612.f37382( var124 ) && module0711.NIL != conses_high.member( module0205.f13276( var124 ), (SubLObject) module0711.$ic121$,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) );
  }

  public static SubLObject f43545(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    SubLObject var46 = (SubLObject) module0711.NIL;
    final SubLObject var47 = f43559( var44 );
    var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( module0711.$ic122$, var44, var47 ), var46 );
    SubLObject var48 = f43560( var44 );
    SubLObject var49 = (SubLObject) module0711.NIL;
    var49 = var48.first();
    while ( module0711.NIL != var48)
    {
      if( module0711.NIL == module0038.f2608( var49 ) && !var49.equalp( var47 ) )
      {
        var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( module0711.$ic38$, var44, var49 ), var46 );
      }
      var48 = var48.rest();
      var49 = var48.first();
    }
    var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( module0711.$ic40$, var44, f43561( var44 ) ), var46 );
    if( module0711.NIL == module0711.$g5588$.getDynamicValue( var45 ) )
    {
      var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( module0711.$ic44$, var44, f43531( var44 ) ), var46 );
    }
    if( module0711.NIL != f43562( var44 ) )
    {
      var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.listS( module0711.$ic123$, var44, (SubLObject) module0711.$ic124$ ), var46 );
    }
    else if( module0711.NIL != f43563( var44 ) )
    {
      var46 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.listS( module0711.$ic123$, var44, (SubLObject) module0711.$ic125$ ), var46 );
    }
    if( module0711.NIL != f43564( var44 ) )
    {
      final SubLObject var50 = f43565( var44 );
      if( module0711.NIL != var50 )
      {
        var46 = (SubLObject) ConsesLow.cons( var50, var46 );
      }
    }
    final SubLObject var52;
    final SubLObject var51 = var52 = f43566( var44 );
    if( module0711.NIL != var52 )
    {
      var46 = (SubLObject) ConsesLow.cons( var52, var46 );
    }
    return Sequences.nreverse( var46 );
  }

  public static SubLObject f43562(final SubLObject var44)
  {
    if( module0711.NIL != module0226.f14807( var44 ) )
    {
      return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0259.f16854( var44, module0711.$ic126$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED )
          || module0711.NIL != module0220.f14583( (SubLObject) ConsesLow.listS( module0711.$ic127$, var44, (SubLObject) module0711.$ic128$ ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED )
          || module0711.NIL != module0347.f23334( (SubLObject) ConsesLow.listS( module0711.$ic129$, var44, (SubLObject) module0711.$ic130$ ), module0711.$ic6$, (SubLObject) module0711.UNPROVIDED,
              (SubLObject) module0711.UNPROVIDED ) );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43563(final SubLObject var44)
  {
    if( module0711.NIL != module0226.f14807( var44 ) )
    {
      return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0220.f14583( (SubLObject) ConsesLow.listS( module0711.$ic127$, var44, (SubLObject) module0711.$ic131$ ),
          (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) || module0711.NIL != module0347.f23334( (SubLObject) ConsesLow.listS( module0711.$ic129$, var44, (SubLObject) module0711.$ic132$ ),
              (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43541(final SubLObject var5)
  {
    return Sequences.remove_if( (SubLObject) module0711.$ic133$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43567(final SubLObject var9)
  {
    if( module0711.NIL != f43568( var9 ) )
    {
      final SubLObject var10 = module0205.f13387( var9, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var11 = module0205.f13388( var9, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var12 = f43569( var10 );
      return module0256.f16576( var12, var11, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43568(final SubLObject var9)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0202.f12859( var9 ) || module0711.NIL != module0202.f12589( var9, module0711.$ic115$ ) );
  }

  public static SubLObject f43570(final SubLObject var9)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0202.f12865( var9 ) || module0711.NIL != module0202.f12589( var9, module0711.$ic134$ ) );
  }

  public static SubLObject f43544(final SubLObject var5)
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    SubLObject var7 = (SubLObject) module0711.NIL;
    if( module0711.ONE_INTEGER.numE( Sequences.count_if( (SubLObject) module0711.$ic135$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) ) )
    {
      var7 = (SubLObject) module0711.NIL;
    }
    else if( module0711.NIL != module0711.$g5598$.getDynamicValue( var6 ) )
    {
      var7 = (SubLObject) module0711.T;
    }
    else if( module0711.NIL != module0226.f14807( module0205.f13387( var5.first(), (SubLObject) module0711.UNPROVIDED ) ) )
    {
      var7 = (SubLObject) module0711.T;
    }
    else
    {
      var7 = (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != var7 )
    {
      return Sequences.remove_if( (SubLObject) module0711.$ic136$, var5, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
    return var5;
  }

  public static SubLObject f43571(final SubLObject var9)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0202.f12859( var9 ) && module0711.$ic137$.eql( module0205.f13388( var9, (SubLObject) module0711.UNPROVIDED ) ) );
  }

  public static SubLObject f43572(final SubLObject var185, final SubLObject var186)
  {
    if( module0711.NIL != module0202.f12589( var185, module0711.$ic138$ ) )
    {
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0202.f12589( var186, module0711.$ic138$ ) )
    {
      return (SubLObject) module0711.T;
    }
    if( module0711.NIL != module0202.f12734( var185, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.UNPROVIDED ) && module0711.NIL != module0202.f12734( var186, (SubLObject) module0711.TWO_INTEGER,
        (SubLObject) module0711.UNPROVIDED ) )
    {
      return f43573( var185, var186 );
    }
    return module0213.f13927( var185, var186, (SubLObject) module0711.T, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43573(final SubLObject var185, final SubLObject var186)
  {
    final SubLObject var187 = module0205.f13333( var185 );
    final SubLObject var188 = module0205.f13333( var186 );
    final SubLObject var189 = Sequences.position( var187, f43507( (SubLObject) module0711.UNPROVIDED ), Symbols.symbol_function( (SubLObject) module0711.EQ ), Symbols.symbol_function( (SubLObject) module0711.$ic139$ ),
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var190 = Sequences.position( var188, f43507( (SubLObject) module0711.UNPROVIDED ), Symbols.symbol_function( (SubLObject) module0711.EQ ), Symbols.symbol_function( (SubLObject) module0711.$ic139$ ),
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var189 && module0711.NIL == var190 )
    {
      return module0213.f13929( var187, var188, (SubLObject) module0711.UNPROVIDED );
    }
    if( module0711.NIL == var189 )
    {
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL == var190 )
    {
      return (SubLObject) module0711.T;
    }
    if( var189.numL( var190 ) )
    {
      return (SubLObject) module0711.T;
    }
    if( var189.numG( var190 ) )
    {
      return (SubLObject) module0711.NIL;
    }
    final SubLObject var191 = module0205.f13380( var185, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var192 = module0205.f13380( var186, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL != module0128.f8449( var191 ) )
    {
      if( module0711.NIL != module0128.f8449( var192 ) )
      {
        return Strings.stringL( f43539( var191 ), f43539( var192 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      }
      return (SubLObject) module0711.NIL;
    }
    else
    {
      if( module0711.NIL != module0128.f8449( var192 ) )
      {
        return (SubLObject) module0711.T;
      }
      final SubLObject var193 = f43539( var191 );
      final SubLObject var194 = f43539( var192 );
      return Strings.stringL( var193, var194, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
  }

  public static SubLObject f43516(final SubLObject var9)
  {
    final SubLThread var10 = SubLProcess.currentSubLThread();
    SubLObject var11 = (SubLObject) module0711.NIL;
    SubLObject var12 = (SubLObject) module0711.NIL;
    try
    {
      var10.throwStack.push( module0003.$g3$.getGlobalValue() );
      final SubLObject var13 = Errors.$error_handler$.currentBinding( var10 );
      try
      {
        Errors.$error_handler$.bind( (SubLObject) module0711.$ic71$, var10 );
        try
        {
          final SubLObject var36_196 = module0711.$g5621$.currentBinding( var10 );
          try
          {
            module0711.$g5621$.bind( var9, var10 );
            var10.resetMultipleValues();
            final SubLObject var14 = module0202.f12796( var9 );
            final SubLObject var15 = var10.secondMultipleValue();
            final SubLObject var16 = var10.thirdMultipleValue();
            var10.resetMultipleValues();
            final SubLObject var17 = f43518( var14 );
            if( module0711.NIL == var17 )
            {
              Errors.warn( (SubLObject) module0711.$ic140$, var9 );
            }
            if( module0711.NIL != var17 )
            {
              final SubLObject var18 = f43519( var15 );
              final SubLObject var19 = f43574( var16, var14 );
              var11 = module0202.f12768( var17, var18, var19 );
            }
          }
          finally
          {
            module0711.$g5621$.rebind( var36_196, var10 );
          }
        }
        catch( Throwable var20 )
        {
          Errors.handleThrowable( var20, (SubLObject) module0711.NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var13, var10 );
      }
    }
    catch( Throwable var21 )
    {
      var12 = Errors.handleThrowable( var21, module0003.$g3$.getGlobalValue() );
    }
    finally
    {
      var10.throwStack.pop();
    }
    if( module0711.NIL != var12 )
    {
      Errors.warn( (SubLObject) module0711.$ic141$, var12, var9 );
    }
    return var11;
  }

  public static SubLObject f43515(final SubLObject var9)
  {
    final SubLObject var10 = f43516( var9 );
    final SubLObject var11 = module0205.f13387( var9, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var12 = f43519( var9 );
    return (SubLObject) ConsesLow.cons( var10, f43575( var11, var12 ) );
  }

  public static SubLObject f43575(final SubLObject var201, final SubLObject var202)
  {
    SubLObject var204;
    final SubLObject var203 = var204 = module0205.f13180( var201, (SubLObject) module0711.UNPROVIDED );
    SubLObject var205 = (SubLObject) module0711.NIL;
    SubLObject var206 = (SubLObject) module0711.NIL;
    SubLObject var207 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var204, var203, (SubLObject) module0711.$ic142$ );
    var205 = var204.first();
    var204 = var204.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var204, var203, (SubLObject) module0711.$ic142$ );
    var206 = var204.first();
    var204 = var204.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var204, var203, (SubLObject) module0711.$ic142$ );
    var207 = var204.first();
    var204 = var204.rest();
    if( module0711.NIL == var204 )
    {
      return (SubLObject) ConsesLow.list( f43576( (SubLObject) module0711.$ic143$, var202, var206 ), f43576( (SubLObject) module0711.$ic144$, var202, var205 ), f43576( (SubLObject) module0711.$ic145$, var202, var207 ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var203, (SubLObject) module0711.$ic142$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43576(final SubLObject var177, final SubLObject var202, final SubLObject var176)
  {
    assert module0711.NIL != Types.stringp( var177 ) : var177;
    return module0202.f12768( module0202.f12643( module0711.$ic147$, module0699.f42535( var177 ) ), var202, f43574( var176, var177 ) );
  }

  public static SubLObject f43518(final SubLObject var99)
  {
    final SubLThread var100 = SubLProcess.currentSubLThread();
    SubLObject var101 = module0035.f2293( f43507( (SubLObject) module0711.UNPROVIDED ), var99, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var101 || module0711.NIL != module0004.f104( var99, module0711.$g5609$.getGlobalValue(), Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED ) )
    {
      if( module0711.NIL == module0107.f7629( module0711.$g5596$.getDynamicValue( var100 ) ) )
      {
        enforceType( var99, module0711.$ic148$ );
      }
      final SubLObject var102 = module0711.$g5593$.currentBinding( var100 );
      try
      {
        module0711.$g5593$.bind( (SubLObject) module0711.NIL, var100 );
        var101 = module0710.f43491( f43506( var99, (SubLObject) module0711.T, (SubLObject) module0711.UNPROVIDED ) );
      }
      finally
      {
        module0711.$g5593$.rebind( var102, var100 );
      }
    }
    return (SubLObject) ( ( module0711.NIL != var101 ) ? ConsesLow.list( module0711.$ic147$, var101 ) : module0711.NIL );
  }

  public static SubLObject f43519(final SubLObject var60)
  {
    final SubLThread var61 = SubLProcess.currentSubLThread();
    enforceType( var60, module0711.$ic149$ );
    SubLObject var62 = (SubLObject) module0711.NIL;
    SubLObject var63 = (SubLObject) module0711.NIL;
    final SubLObject var64 = module0711.$g5593$.currentBinding( var61 );
    try
    {
      module0711.$g5593$.bind( (SubLObject) module0711.NIL, var61 );
      if( module0711.NIL != module0173.f10955( var60 ) )
      {
        if( module0711.NIL != module0711.$g5594$.getDynamicValue( var61 ) && module0711.NIL != module0711.$g5603$.getDynamicValue( var61 ) && module0711.NIL != module0711.$g5602$.getDynamicValue( var61 ) )
        {
          var62 = f43577( var60, module0711.$g5603$.getDynamicValue( var61 ), module0711.$g5602$.getDynamicValue( var61 ) );
        }
        else
        {
          var62 = f43506( var60, (SubLObject) module0711.NIL, (SubLObject) module0711.T );
        }
      }
      var63 = module0710.f43491( f43578( var60 ) );
      if( ( module0711.NIL == module0589.f35907( var63, (SubLObject) module0711.UNPROVIDED ) || module0711.NIL == module0038.f2684( var63, module0710.f43489() ) ) && module0711.NIL == module0601.f36767( var63 ) )
      {
        Errors.sublisp_break( (SubLObject) module0711.$ic150$, new SubLObject[] { var63, var60, module0710.f43489()
        } );
      }
    }
    finally
    {
      module0711.$g5593$.rebind( var64, var61 );
    }
    return (SubLObject) ConsesLow.list( module0711.$ic151$, var63, var62 );
  }

  public static SubLObject f43574(final SubLObject var114, final SubLObject var209)
  {
    if( module0711.NIL != module0202.f12589( var114, module0711.$ic152$ ) )
    {
      return f43579( var114 );
    }
    if( module0711.NIL != f43580( var114 ) )
    {
      return module0202.f12643( module0711.$ic153$, f43581( var114 ) );
    }
    if( module0711.NIL != module0612.f37382( var114 ) )
    {
      final SubLObject var210 = f43582( var209, var114 );
      final SubLObject var211 = f43583( var114 );
      return ( module0711.NIL != var210 && module0711.NIL != var211 ) ? module0202.f12768( module0711.$ic154$, var210, var211 ) : f43584( f43585( var114 ) );
    }
    if( module0711.NIL != module0208.f13537( var114, (SubLObject) module0711.UNPROVIDED ) )
    {
      return module0209.f13552( var114 );
    }
    if( module0711.NIL != module0202.f12590( var114 ) )
    {
      Errors.sublisp_break( (SubLObject) module0711.$ic155$, new SubLObject[] { var114
      } );
      return f43584( f43585( var114 ) );
    }
    if( var114.isString() && module0711.NIL != Sequences.search( module0129.f8495(), var114, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      return f43586( var114, (SubLObject) module0711.UNPROVIDED );
    }
    SubLObject var212 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var212 )
    {
      final SubLObject var213 = module0035.f2293( module0711.$g5611$.getGlobalValue(), var114, Symbols.symbol_function( (SubLObject) module0711.EQL ), (SubLObject) module0711.NIL );
      if( module0711.NIL != var213 )
      {
        var212 = module0202.f12643( module0711.$ic153$, var213 );
      }
    }
    if( module0711.NIL == var212 )
    {
      final SubLObject var214 = module0035.f2293( module0711.$g5612$.getGlobalValue(), var114, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      if( module0711.NIL != var214 )
      {
        SubLObject var216;
        final SubLObject var215 = var216 = var214;
        SubLObject var217 = (SubLObject) module0711.NIL;
        SubLObject var218 = (SubLObject) module0711.NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var216, var215, (SubLObject) module0711.$ic156$ );
        var217 = var216.first();
        var216 = var216.rest();
        cdestructuring_bind.destructuring_bind_must_consp( var216, var215, (SubLObject) module0711.$ic156$ );
        var218 = var216.first();
        var216 = var216.rest();
        if( module0711.NIL == var216 )
        {
          if( module0711.NIL != var217 )
          {
            var212 = module0202.f12643( module0711.$ic153$, f43587( var217, var218 ) );
          }
        }
        else
        {
          cdestructuring_bind.cdestructuring_bind_error( var215, (SubLObject) module0711.$ic156$ );
        }
      }
    }
    if( module0711.NIL == var212 )
    {
      final SubLObject var219 = f43588( var114, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var220 = f43582( var209, var114 );
      if( module0711.NIL != module0173.f10955( var114 ) )
      {
        if( module0711.NIL == module0589.f35907( var219, (SubLObject) module0711.UNPROVIDED ) && !module0038.f2636( var219 ).eql( (SubLObject) Characters.CHAR_ampersand ) )
        {
          Errors.sublisp_break( (SubLObject) module0711.$ic157$, new SubLObject[] { var114, var219
          } );
        }
        final SubLObject var221 = var219;
        var212 = module0202.f12643( module0711.$ic153$, var221 );
      }
      else if( var114.isNumber() && module0711.NIL != var220 )
      {
        var212 = module0202.f12768( module0711.$ic154$, var220, var219 );
      }
      else if( var114.isString() )
      {
        var212 = var219;
      }
      else
      {
        Errors.sublisp_break( (SubLObject) module0711.$ic158$, new SubLObject[] { var114
        } );
      }
    }
    return var212;
  }

  public static SubLObject f43583(final SubLObject var219)
  {
    final SubLObject var220 = module0205.f13276( var219 );
    if( var220.eql( module0711.$ic159$ ) )
    {
      return f43589( var219 );
    }
    if( var220.eql( module0711.$ic160$ ) )
    {
      return f43590( var219 );
    }
    if( var220.eql( module0711.$ic161$ ) )
    {
      return f43591( var219 );
    }
    if( var220.eql( module0711.$ic162$ ) )
    {
      return f43592( var219 );
    }
    if( var220.eql( module0711.$ic163$ ) )
    {
      return f43593( var219 );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43582(final SubLObject var209, final SubLObject var114)
  {
    SubLObject var210 = (SubLObject) module0711.NIL;
    if( var114.isInteger() )
    {
      var210 = f43587( (SubLObject) module0711.$ic164$, (SubLObject) module0711.$ic165$ );
    }
    else if( var114.isNumber() )
    {
      var210 = f43587( (SubLObject) module0711.$ic164$, (SubLObject) module0711.$ic166$ );
    }
    else if( module0711.NIL != module0612.f37382( var114 ) )
    {
      final SubLObject var211 = module0205.f13276( var114 );
      if( var211.eql( module0711.$ic160$ ) || var211.eql( module0711.$ic161$ ) || var211.eql( module0711.$ic162$ ) || var211.eql( module0711.$ic163$ ) )
      {
        var210 = f43587( (SubLObject) module0711.$ic164$, (SubLObject) module0711.$ic167$ );
      }
      else if( var211.eql( module0711.$ic159$ ) )
      {
        var210 = f43587( (SubLObject) module0711.$ic164$, (SubLObject) module0711.$ic168$ );
      }
      else
      {
        Errors.sublisp_break( (SubLObject) module0711.$ic169$, new SubLObject[] { var114
        } );
      }
    }
    return var210;
  }

  public static SubLObject f43590(final SubLObject var219)
  {
    return module0613.f37590( (SubLObject) module0711.$ic170$, var219 );
  }

  public static SubLObject f43591(final SubLObject var219)
  {
    return module0613.f37590( (SubLObject) module0711.$ic171$, var219 );
  }

  public static SubLObject f43592(final SubLObject var219)
  {
    return module0613.f37590( (SubLObject) module0711.$ic172$, var219 );
  }

  public static SubLObject f43593(final SubLObject var219)
  {
    return print_high.princ_to_string( module0048.f_1_( module0205.f13277( var219, (SubLObject) module0711.UNPROVIDED ) ) );
  }

  public static SubLObject f43589(final SubLObject var219)
  {
    return module0613.f37590( (SubLObject) module0711.$ic173$, var219 );
  }

  public static SubLObject f43587(final SubLObject var216, final SubLObject var160)
  {
    final SubLThread var217 = SubLProcess.currentSubLThread();
    return ( module0711.NIL != module0711.$g5593$.getDynamicValue( var217 ) ) ? Sequences.cconcatenate( (SubLObject) module0711.$ic174$, new SubLObject[] { var216, module0711.$ic175$, var160
    } ) : Sequences.cconcatenate( module0035.f2293( module0710.$g5591$.getDynamicValue( var217 ), var216, Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED ), var160 );
  }

  public static SubLObject f43580(final SubLObject var176)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0004.f104( module0205.f13276( var176 ), (SubLObject) module0711.$ic176$, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED ) || ( module0711.NIL != module0128.f8449( var176 ) && module0711.NIL != module0259.f16891( var176, module0711.$ic177$ ) ) );
  }

  public static SubLObject f43581(final SubLObject var221)
  {
    enforceType( var221, module0711.$ic178$ );
    return f43594( var221 );
  }

  public static SubLObject f43594(final SubLObject var221)
  {
    if( var221.isString() )
    {
      return var221;
    }
    final SubLObject var222 = module0205.f13276( var221 );
    if( var222.eql( module0711.$ic179$ ) )
    {
      return f43594( module0205.f13277( var221, (SubLObject) module0711.UNPROVIDED ) );
    }
    if( var222.eql( module0711.$ic180$ ) )
    {
      return Sequences.cconcatenate( f43594( module0205.f13277( var221, (SubLObject) module0711.UNPROVIDED ) ), module0205.f13368( var221, (SubLObject) module0711.UNPROVIDED ) );
    }
    if( var222.eql( module0711.$ic181$ ) )
    {
      return Sequences.cconcatenate( f43594( module0205.f13277( var221, (SubLObject) module0711.UNPROVIDED ) ), new SubLObject[] { module0711.$ic182$, module0205.f13368( var221, (SubLObject) module0711.UNPROVIDED )
      } );
    }
    final SubLObject var223 = module0434.f30578( (SubLObject) module0711.$ic183$, (SubLObject) ConsesLow.listS( module0711.$ic184$, var221, (SubLObject) module0711.$ic185$ ), module0711.$ic6$,
        (SubLObject) module0711.$ic186$ );
    if( module0711.NIL != var223 )
    {
      return var223.first();
    }
    Errors.error( (SubLObject) module0711.$ic187$, var221 );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43586(final SubLObject var223, SubLObject var224)
  {
    if( var224 == module0711.UNPROVIDED )
    {
      var224 = module0711.$g5622$.getDynamicValue();
    }
    final SubLThread var225 = SubLProcess.currentSubLThread();
    SubLObject var226 = (SubLObject) module0711.NIL;
    if( module0711.NIL != module0107.f7629( module0711.$g5621$.getDynamicValue( var225 ) ) && module0711.NIL != conses_high.member( module0205.f13333( module0711.$g5621$.getDynamicValue( var225 ) ), module0711.$g5623$
        .getGlobalValue(), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      SubLObject var227 = (SubLObject) module0711.NIL;
      try
      {
        var227 = streams_high.make_private_string_output_stream();
        final SubLObject var228 = module0015.$g131$.currentBinding( var225 );
        try
        {
          module0015.$g131$.bind( var227, var225 );
          module0642.f39035( var223, (SubLObject) ( ( module0711.NIL != var224 ) ? module0711.$ic189$ : module0711.$ic190$ ), (SubLObject) module0711.UNPROVIDED );
        }
        finally
        {
          module0015.$g131$.rebind( var228, var225 );
        }
        var226 = streams_high.get_output_stream_string( var227 );
      }
      finally
      {
        final SubLObject var229 = Threads.$is_thread_performing_cleanupP$.currentBinding( var225 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var225 );
          streams_high.close( var227, (SubLObject) module0711.UNPROVIDED );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var229, var225 );
        }
      }
    }
    if( module0711.NIL == var226 )
    {
      var226 = module0038.f2667( var223, module0129.f8495() );
    }
    return var226;
  }

  public static SubLObject f43595()
  {
    module0057.f4174( module0711.$g5624$.getGlobalValue() );
    return module0711.$g5624$.getGlobalValue();
  }

  public static SubLObject f43596()
  {
    return module0057.f4175( module0711.$g5624$.getGlobalValue() );
  }

  public static SubLObject f43597(final SubLObject var44, SubLObject var226)
  {
    if( var226 == module0711.UNPROVIDED )
    {
      var226 = module0710.$g5584$.getDynamicValue();
    }
    final SubLThread var227 = SubLProcess.currentSubLThread();
    final SubLObject var228 = ( module0711.NIL != var226 ) ? module0712.f43670( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED )
        : module0712.f43667( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var229 = f43596();
    final SubLObject var230 = Sequences.cconcatenate( (SubLObject) module0711.$ic191$, new SubLObject[] { module0006.f207( var229 ), module0711.$ic192$
    } );
    final SubLObject var231 = (SubLObject) module0711.$ic193$;
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( var228 );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g389$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( var230 );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g390$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( var231 );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
    SubLObject var232 = module0015.$g533$.currentBinding( var227 );
    try
    {
      module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
      module0642.f39019( f43532( var44, (SubLObject) module0711.UNPROVIDED ) );
    }
    finally
    {
      module0015.$g533$.rebind( var232, var227 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    module0642.f39020( module0015.$g149$.getGlobalValue() );
    if( module0711.NIL != var229 )
    {
      module0642.f39020( module0015.$g157$.getGlobalValue() );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39020( var229 );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    }
    module0642.f39020( module0015.$g158$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( (SubLObject) module0711.$ic194$ );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g152$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( (SubLObject) module0711.$ic195$ );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
    var232 = module0015.$g533$.currentBinding( var227 );
    try
    {
      module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
      module0642.f39020( module0015.$g144$.getGlobalValue() );
      module0642.f39020( module0015.$g158$.getGlobalValue() );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39020( (SubLObject) module0711.$ic196$ );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var36_230 = module0015.$g533$.currentBinding( var227 );
      try
      {
        module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
        module0642.f39019( f43561( var44 ) );
      }
      finally
      {
        module0015.$g533$.rebind( var36_230, var227 );
      }
      module0642.f39020( module0015.$g145$.getGlobalValue() );
      module0642.f39020( module0015.$g144$.getGlobalValue() );
      module0642.f39020( module0015.$g158$.getGlobalValue() );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39020( (SubLObject) module0711.$ic196$ );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var36_231 = module0015.$g533$.currentBinding( var227 );
      try
      {
        module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
        PrintLow.format( module0015.$g131$.getDynamicValue( var227 ), (SubLObject) module0711.$ic197$, f43531( var44 ) );
      }
      finally
      {
        module0015.$g533$.rebind( var36_231, var227 );
      }
      module0642.f39020( module0015.$g145$.getGlobalValue() );
      module0642.f39020( module0015.$g144$.getGlobalValue() );
      module0642.f39020( module0015.$g158$.getGlobalValue() );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39020( (SubLObject) module0711.$ic198$ );
      module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
      module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
      final SubLObject var36_232 = module0015.$g533$.currentBinding( var227 );
      try
      {
        module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
        f43598( var44, (SubLObject) module0711.NIL );
      }
      finally
      {
        module0015.$g533$.rebind( var36_232, var227 );
      }
      module0642.f39020( module0015.$g145$.getGlobalValue() );
    }
    finally
    {
      module0015.$g533$.rebind( var232, var227 );
    }
    module0642.f39020( module0015.$g150$.getGlobalValue() );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43599(final SubLObject var44, SubLObject var226)
  {
    if( var226 == module0711.UNPROVIDED )
    {
      var226 = module0710.$g5584$.getDynamicValue();
    }
    final SubLThread var227 = SubLProcess.currentSubLThread();
    final SubLObject var228 = ( module0711.NIL != var226 ) ? module0712.f43670( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED )
        : module0712.f43667( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( var228 );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g158$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( (SubLObject) module0711.$ic199$ );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var229 = module0015.$g533$.currentBinding( var227 );
    try
    {
      module0015.$g533$.bind( (SubLObject) module0711.T, var227 );
      module0642.f39019( f43532( var44, (SubLObject) module0711.UNPROVIDED ) );
    }
    finally
    {
      module0015.$g533$.rebind( var229, var227 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43600(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    final SubLObject var46 = module0712.f43670( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g381$.getGlobalValue() );
    module0642.f39020( module0015.$g383$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( var46 );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( module0015.$g158$.getGlobalValue() );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39020( (SubLObject) module0711.$ic199$ );
    module0642.f39012( (SubLObject) Characters.CHAR_quotation, (SubLObject) module0711.UNPROVIDED );
    module0642.f39012( (SubLObject) Characters.CHAR_greater, (SubLObject) module0711.UNPROVIDED );
    final SubLObject var47 = module0015.$g533$.currentBinding( var45 );
    try
    {
      module0015.$g533$.bind( (SubLObject) module0711.T, var45 );
      module0642.f39019( f43532( var44, (SubLObject) module0711.UNPROVIDED ) );
    }
    finally
    {
      module0015.$g533$.rebind( var47, var45 );
    }
    module0642.f39020( module0015.$g382$.getGlobalValue() );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43598(final SubLObject var44, SubLObject var224)
  {
    if( var224 == module0711.UNPROVIDED )
    {
      var224 = (SubLObject) module0711.T;
    }
    final SubLObject var225 = module0226.f15076( var44, (SubLObject) module0711.UNPROVIDED );
    module0642.f39019( f43586( (SubLObject) ( ( module0711.NIL != var225 ) ? var225 : module0711.$ic201$ ), var224 ) );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43564(final SubLObject var176)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0167.f10813( var176 ) && module0711.NIL != module0226.f14819( var176 ) && module0711.NIL != module0173.f10955( module0205.f13277( var176,
        (SubLObject) module0711.UNPROVIDED ) ) && module0711.NIL != module0269.f17710( module0205.f13277( var176, (SubLObject) module0711.UNPROVIDED ) ) && module0711.NIL != module0173.f10955( module0205.f13368( var176,
            (SubLObject) module0711.UNPROVIDED ) ) && module0711.NIL != module0173.f10955( module0205.f13370( var176, (SubLObject) module0711.UNPROVIDED ) ) );
  }

  public static SubLObject f43565(final SubLObject var104)
  {
    final SubLThread var105 = SubLProcess.currentSubLThread();
    var105.resetMultipleValues();
    final SubLObject var106 = module0202.f12797( var104 );
    final SubLObject var107 = var105.secondMultipleValue();
    final SubLObject var108 = var105.thirdMultipleValue();
    final SubLObject var109 = var105.fourthMultipleValue();
    var105.resetMultipleValues();
    SubLObject var110 = (SubLObject) module0711.NIL;
    final SubLObject var111 = var106;
    if( var111.eql( module0711.$ic202$ ) || var111.eql( module0711.$ic203$ ) )
    {
      var110 = var108;
    }
    else if( var111.eql( module0711.$ic204$ ) || var111.eql( module0711.$ic205$ ) )
    {
      var110 = f43601( var108 );
      if( module0711.NIL == Errors.$ignore_mustsP$.getDynamicValue( var105 ) && module0711.NIL == module0173.f10955( var110 ) )
      {
        Errors.error( (SubLObject) module0711.$ic206$, var108 );
      }
    }
    else
    {
      Errors.error( (SubLObject) module0711.$ic207$, var106 );
    }
    return (SubLObject) ConsesLow.list( module0711.$ic208$, var104, (SubLObject) ConsesLow.list( module0711.$ic152$, var107, (SubLObject) ConsesLow.list( module0711.$ic209$, module0711.$ic210$, var110,
        module0711.$ic211$, var109 ) ) );
  }

  public static SubLObject f43602(final SubLObject var177)
  {
    return (SubLObject) ConsesLow.list( module0711.$ic213$, (SubLObject) ConsesLow.list( module0711.$ic214$, module0711.$g5625$.getGlobalValue(), var177 ), (SubLObject) ConsesLow.list( module0711.$ic214$, var177,
        module0711.$g5625$.getGlobalValue() ) );
  }

  public static SubLObject f43603(final SubLObject var177)
  {
    SubLObject var178 = f43601( var177 );
    if( module0711.NIL == module0173.f10955( var178 ) )
    {
      if( module0711.NIL == module0259.f16854( var177, module0711.$ic216$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
      {
        module0540.f33516( (SubLObject) ConsesLow.listS( module0711.$ic73$, var177, (SubLObject) module0711.$ic217$ ), module0711.$ic218$, (SubLObject) module0711.UNPROVIDED );
      }
      final SubLObject var179 = (SubLObject) ConsesLow.list( module0711.$ic219$, var177 );
      var178 = module0172.f10921( var179 );
      if( module0711.NIL == module0173.f10955( var178 ) )
      {
        var178 = module0285.f18993( var179, (SubLObject) module0711.UNPROVIDED );
        PrintLow.format( (SubLObject) module0711.T, (SubLObject) module0711.$ic220$, var178 );
      }
      module0540.f33516( module0205.f13250( var178, module0711.$g5625$.getGlobalValue(), f43602( var177 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ), module0711.$ic218$,
          (SubLObject) module0711.UNPROVIDED );
    }
    return var178;
  }

  public static SubLObject f43537(final SubLObject var177)
  {
    final SubLThread var178 = SubLProcess.currentSubLThread();
    final SubLObject var179 = module0034.$g879$.getDynamicValue( var178 );
    SubLObject var180 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var179 )
    {
      return f43603( var177 );
    }
    var180 = module0034.f1857( var179, (SubLObject) module0711.$ic215$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var180 )
    {
      var180 = module0034.f1807( module0034.f1842( var179 ), (SubLObject) module0711.$ic215$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQUAL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var179, (SubLObject) module0711.$ic215$, var180 );
    }
    SubLObject var181 = module0034.f1814( var180, var177, (SubLObject) module0711.$ic48$ );
    if( var181 == module0711.$ic48$ )
    {
      var181 = Values.arg2( var178.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43603( var177 ) ) );
      module0034.f1816( var180, var177, var181, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var181 );
  }

  public static SubLObject f43601(final SubLObject var177)
  {
    enforceType( var177, module0711.$ic221$ );
    return module0434.f30578( module0711.$g5625$.getGlobalValue(), f43602( var177 ), module0711.$ic218$, (SubLObject) module0711.$ic222$ ).first();
  }

  public static SubLObject f43579(final SubLObject var237)
  {
    SubLObject var238 = (SubLObject) module0711.NIL;
    SubLObject var239 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var237, var237, (SubLObject) module0711.$ic223$ );
    var238 = var237.first();
    SubLObject var240 = var237.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var239 = var240.first();
    var240 = var240.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    final SubLObject var241 = var240.rest();
    var240 = var240.first();
    SubLObject var242 = (SubLObject) module0711.NIL;
    SubLObject var243 = (SubLObject) module0711.NIL;
    SubLObject var244 = (SubLObject) module0711.NIL;
    SubLObject var245 = (SubLObject) module0711.NIL;
    SubLObject var246 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var242 = var240.first();
    var240 = var240.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var243 = var240.first();
    var240 = var240.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var244 = var240.first();
    var240 = var240.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var245 = var240.first();
    var240 = var240.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var240, var237, (SubLObject) module0711.$ic223$ );
    var246 = var240.first();
    var240 = var240.rest();
    if( module0711.NIL == var240 )
    {
      var240 = var241;
      if( module0711.NIL == var240 )
      {
        return (SubLObject) ConsesLow.list( module0711.$ic152$, f43519( var239 ), (SubLObject) ConsesLow.list( module0711.$ic209$, (SubLObject) module0711.$ic224$, (SubLObject) module0711.$ic225$, f43604( var244 ),
            (SubLObject) module0711.$ic226$, f43574( var246, var244 ) ) );
      }
      cdestructuring_bind.cdestructuring_bind_error( var237, (SubLObject) module0711.$ic223$ );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var237, (SubLObject) module0711.$ic223$ );
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43604(final SubLObject var44)
  {
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    return f43574( var44, (SubLObject) module0711.NIL );
  }

  public static SubLObject f43578(final SubLObject var31)
  {
    enforceType( var31, module0711.$ic149$ );
    if( module0711.NIL != module0202.f12925( var31 ) )
    {
      return module0699.f42535( (SubLObject) module0711.$ic227$ );
    }
    return f43605( var31 );
  }

  public static SubLObject f43605(final SubLObject var44)
  {
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    final SubLObject var45 = f43569( var44 );
    return ( module0711.NIL != var45 ) ? f43606( var45 ) : module0699.f42535( (SubLObject) module0711.$ic228$ );
  }

  public static SubLObject f43569(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0107.f7629( module0711.$g5596$.getDynamicValue( var45 ) ) )
    {
      return f43607( var44 );
    }
    if( module0711.NIL != module0269.f17710( var44 ) )
    {
      return module0711.$ic229$;
    }
    if( module0711.NIL != module0226.f14807( var44 ) )
    {
      return module0711.$ic216$;
    }
    return f43608( var44 );
  }

  public static SubLObject f43609(final SubLObject var248)
  {
    final SubLThread var249 = SubLProcess.currentSubLThread();
    final SubLObject var250 = module0259.f16840( var248, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    SubLObject var251 = var250.first();
    if( module0711.NIL == var251 )
    {
      return module0711.$ic112$;
    }
    if( module0711.NIL != module0035.f1997( var250 ) && module0711.NIL != module0128.f8449( var251 ) )
    {
      return var251;
    }
    final SubLObject var252 = module0035.remove_if_not( (SubLObject) module0711.$ic231$, var250, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var252 )
    {
      return var251;
    }
    if( module0711.NIL != module0035.f1997( var252 ) )
    {
      return module0035.f2113( var252 );
    }
    final SubLObject var253 = module0147.f9540( module0711.$g5602$.getDynamicValue( var249 ) );
    final SubLObject var254 = module0147.$g2095$.currentBinding( var249 );
    final SubLObject var255 = module0147.$g2094$.currentBinding( var249 );
    final SubLObject var256 = module0147.$g2096$.currentBinding( var249 );
    try
    {
      module0147.$g2095$.bind( module0147.f9545( var253 ), var249 );
      module0147.$g2094$.bind( module0147.f9546( var253 ), var249 );
      module0147.$g2096$.bind( module0147.f9549( var253 ), var249 );
      var251 = module0256.f16635( var252, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
    finally
    {
      module0147.$g2096$.rebind( var256, var249 );
      module0147.$g2094$.rebind( var255, var249 );
      module0147.$g2095$.rebind( var254, var249 );
    }
    return var251;
  }

  public static SubLObject f43608(final SubLObject var248)
  {
    final SubLThread var249 = SubLProcess.currentSubLThread();
    final SubLObject var250 = module0034.$g879$.getDynamicValue( var249 );
    SubLObject var251 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var250 )
    {
      return f43609( var248 );
    }
    var251 = module0034.f1857( var250, (SubLObject) module0711.$ic230$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var251 )
    {
      var251 = module0034.f1807( module0034.f1842( var250 ), (SubLObject) module0711.$ic230$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQ,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var250, (SubLObject) module0711.$ic230$, var251 );
    }
    SubLObject var252 = module0034.f1814( var251, var248, (SubLObject) module0711.$ic48$ );
    if( var252 == module0711.$ic48$ )
    {
      var252 = Values.arg2( var249.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43609( var248 ) ) );
      module0034.f1816( var251, var248, var252, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var252 );
  }

  public static SubLObject f43607(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    final SubLObject var46 = module0067.f4885( module0711.$g5596$.getDynamicValue( var45 ), var44, (SubLObject) module0711.NIL );
    final SubLObject var47 = ConsesLow.nconc( module0035.f2109( module0711.$ic73$, var46, Symbols.symbol_function( (SubLObject) module0711.EQL ), Symbols.symbol_function( (SubLObject) module0711.$ic232$ ) ), module0035
        .f2109( module0711.$ic115$, var46, Symbols.symbol_function( (SubLObject) module0711.EQL ), Symbols.symbol_function( (SubLObject) module0711.$ic232$ ) ) );
    final SubLObject var48 = Mapping.mapcar( (SubLObject) module0711.$ic233$, var47 );
    if( module0711.NIL != module0004.f104( module0711.$ic229$, var48, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      return module0711.$ic229$;
    }
    if( module0711.NIL != module0004.f104( module0711.$ic216$, var48, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      return module0711.$ic216$;
    }
    return module0256.f16529( var48, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ).first();
  }

  public static SubLObject f43610(final SubLObject var1, final SubLObject var2)
  {
    final SubLThread var3 = SubLProcess.currentSubLThread();
    final SubLObject var4 = var1.rest();
    final SubLObject var6;
    final SubLObject var5 = var6 = var4;
    if( module0711.NIL != Sequences.find( (SubLObject) module0711.$ic234$, reader.$features$.getDynamicValue( var3 ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      return reader.bq_cons( (SubLObject) module0711.$ic235$, ConsesLow.append( var6, (SubLObject) module0711.NIL ) );
    }
    return reader.bq_cons( (SubLObject) module0711.$ic236$, ConsesLow.append( var6, (SubLObject) module0711.NIL ) );
  }

  public static SubLObject f43588(final SubLObject var31, SubLObject var256)
  {
    if( var256 == module0711.UNPROVIDED )
    {
      var256 = (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0173.f10955( var31 ) )
    {
      return f43506( var31, var256, (SubLObject) module0711.UNPROVIDED );
    }
    return f43611( var31 );
  }

  public static SubLObject f43506(final SubLObject var44, SubLObject var256, SubLObject var257)
  {
    if( var256 == module0711.UNPROVIDED )
    {
      var256 = (SubLObject) module0711.NIL;
    }
    if( var257 == module0711.UNPROVIDED )
    {
      var257 = (SubLObject) module0711.NIL;
    }
    final SubLThread var258 = SubLProcess.currentSubLThread();
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    if( var44.eql( module0711.$ic115$ ) && module0711.NIL == var256 && module0711.NIL == var257 )
    {
      return module0699.f42531( (SubLObject) module0711.$ic237$ );
    }
    final SubLObject var259 = (SubLObject) ( ( module0711.NIL != module0711.$g5603$.getDynamicValue( var258 ) ) ? f43577( var44, module0711.$g5603$.getDynamicValue( var258 ), module0711.$g5602$.getDynamicValue(
        var258 ) ) : module0711.NIL );
    final SubLObject var260 = f43612( var44, module0710.f43489(), module0711.$g5602$.getDynamicValue( var258 ) );
    final SubLObject var261 = (SubLObject) ( ( module0711.NIL != var256 || module0711.NIL != var260 || module0711.NIL != var257 ) ? module0711.NIL : f43613( var44 ) );
    if( module0711.NIL != var259 && module0711.NIL == var256 && module0711.NIL == var257 )
    {
      return var259;
    }
    if( module0711.NIL != var260 )
    {
      return ( module0711.NIL != var256 ) ? var260 : Sequences.cconcatenate( module0710.f43489(), var260 );
    }
    if( module0711.NIL != var261 )
    {
      return var261;
    }
    if( module0711.NIL == var256 )
    {
      return ( module0711.NIL != module0710.$g5584$.getDynamicValue( var258 ) || module0711.NIL != module0712.f43689( var44 ) ) ? module0712.f43670( var44, (SubLObject) module0711.UNPROVIDED,
          (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) : module0712.f43667( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
    if( module0711.NIL != module0711.$g5588$.getDynamicValue( var258 ) )
    {
      return f43531( var44 );
    }
    return f43532( var44, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43577(final SubLObject var31, final SubLObject var159, final SubLObject var261)
  {
    final SubLThread var262 = SubLProcess.currentSubLThread();
    SubLObject var263 = (SubLObject) module0711.NIL;
    final SubLObject var264 = module0147.f9540( var261 );
    final SubLObject var265 = module0147.$g2095$.currentBinding( var262 );
    final SubLObject var266 = module0147.$g2094$.currentBinding( var262 );
    final SubLObject var267 = module0147.$g2096$.currentBinding( var262 );
    try
    {
      module0147.$g2095$.bind( module0147.f9545( var264 ), var262 );
      module0147.$g2094$.bind( module0147.f9546( var264 ), var262 );
      module0147.$g2096$.bind( module0147.f9549( var264 ), var262 );
      if( module0711.NIL == var263 )
      {
        SubLObject var268 = module0220.f14598( var31, module0711.$ic116$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.$ic239$, (SubLObject) module0711.UNPROVIDED );
        SubLObject var269 = (SubLObject) module0711.NIL;
        var269 = var268.first();
        while ( module0711.NIL == var263 && module0711.NIL != var268)
        {
          SubLObject var271;
          final SubLObject var270 = var271 = var269;
          SubLObject var272 = (SubLObject) module0711.NIL;
          SubLObject var273 = (SubLObject) module0711.NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var271, var270, (SubLObject) module0711.$ic238$ );
          var272 = var271.first();
          var271 = var271.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var271, var270, (SubLObject) module0711.$ic238$ );
          var273 = var271.first();
          var271 = var271.rest();
          if( module0711.NIL == var271 )
          {
            if( var272.equal( var159 ) )
            {
              if( module0711.NIL != module0589.f35907( var273, (SubLObject) module0711.UNPROVIDED ) )
              {
                var263 = var273;
              }
              else
              {
                var273 = Sequences.cconcatenate( f43614( var159 ), new SubLObject[] { module0711.$ic182$, var273
                } );
              }
              if( module0711.NIL != module0589.f35907( var273, (SubLObject) module0711.UNPROVIDED ) )
              {
                var263 = var273;
              }
            }
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var270, (SubLObject) module0711.$ic238$ );
          }
          var268 = var268.rest();
          var269 = var268.first();
        }
      }
    }
    finally
    {
      module0147.$g2096$.rebind( var267, var262 );
      module0147.$g2094$.rebind( var266, var262 );
      module0147.$g2095$.rebind( var265, var262 );
    }
    return var263;
  }

  public static SubLObject f43612(final SubLObject var31, final SubLObject var267, final SubLObject var261)
  {
    final SubLThread var268 = SubLProcess.currentSubLThread();
    assert module0711.NIL != module0212.f13762( var31 ) : var31;
    assert module0711.NIL != Types.stringp( var267 ) : var267;
    SubLObject var269 = (SubLObject) module0711.NIL;
    final SubLObject var270 = module0147.f9540( var261 );
    final SubLObject var271 = module0147.$g2095$.currentBinding( var268 );
    final SubLObject var272 = module0147.$g2094$.currentBinding( var268 );
    final SubLObject var273 = module0147.$g2096$.currentBinding( var268 );
    try
    {
      module0147.$g2095$.bind( module0147.f9545( var270 ), var268 );
      module0147.$g2094$.bind( module0147.f9546( var270 ), var268 );
      module0147.$g2096$.bind( module0147.f9549( var270 ), var268 );
      if( module0711.NIL == var269 )
      {
        SubLObject var274 = module0220.f14562( var31, module0711.$ic138$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.$ic104$ );
        SubLObject var275 = (SubLObject) module0711.NIL;
        var275 = var274.first();
        while ( module0711.NIL == var269 && module0711.NIL != var274)
        {
          if( var275.isString() && module0711.NIL != module0038.f2684( var275, var267 ) )
          {
            var269 = var275;
          }
          var274 = var274.rest();
          var275 = var274.first();
        }
      }
    }
    finally
    {
      module0147.$g2096$.rebind( var273, var268 );
      module0147.$g2094$.rebind( var272, var268 );
      module0147.$g2095$.rebind( var271, var268 );
    }
    return (SubLObject) ( ( module0711.NIL != var269 ) ? module0038.f2674( var269, var267, (SubLObject) module0711.UNPROVIDED ) : module0711.NIL );
  }

  public static SubLObject f43613(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    assert module0711.NIL != module0212.f13762( var31 ) : var31;
    SubLObject var33 = (SubLObject) module0711.NIL;
    final SubLObject var34 = module0147.$g2094$.currentBinding( var32 );
    final SubLObject var35 = module0147.$g2095$.currentBinding( var32 );
    try
    {
      module0147.$g2094$.bind( (SubLObject) module0711.$ic241$, var32 );
      module0147.$g2095$.bind( module0711.$ic6$, var32 );
      if( module0711.NIL == var33 )
      {
        SubLObject var36 = module0220.f14562( var31, module0711.$ic138$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.$ic104$ );
        SubLObject var37 = (SubLObject) module0711.NIL;
        var37 = var36.first();
        while ( module0711.NIL == var33 && module0711.NIL != var36)
        {
          if( var37.isString() && module0711.NIL != module0710.f43490( var37 ) )
          {
            var33 = var37;
          }
          var36 = var36.rest();
          var37 = var36.first();
        }
      }
    }
    finally
    {
      module0147.$g2095$.rebind( var35, var32 );
      module0147.$g2094$.rebind( var34, var32 );
    }
    return var33;
  }

  public static SubLObject f43615(final SubLObject var44, SubLObject var269)
  {
    if( var269 == module0711.UNPROVIDED )
    {
      var269 = (SubLObject) module0711.T;
    }
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    SubLObject var270 = ( module0711.NIL != module0128.f8449( var44 ) ) ? f43616( module0166.f10743( var44 ) ) : f43617( var44, var269 );
    if( module0711.NIL != module0167.f10813( var44 ) && module0711.NIL != var269 && module0711.NIL != module0038.f2608( var270 ) )
    {
      var270 = f43617( var44, (SubLObject) module0711.NIL );
    }
    if( module0711.NIL == f43618( module0038.f2636( var270 ) ) )
    {
      var270 = Sequences.cconcatenate( module0711.$g5626$.getGlobalValue(), var270 );
    }
    return f43619( var270, var44, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43532(final SubLObject var44, SubLObject var269)
  {
    if( var269 == module0711.UNPROVIDED )
    {
      var269 = (SubLObject) module0711.T;
    }
    final SubLThread var270 = SubLProcess.currentSubLThread();
    final SubLObject var271 = module0034.$g879$.getDynamicValue( var270 );
    SubLObject var272 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var271 )
    {
      return f43615( var44, var269 );
    }
    var272 = module0034.f1857( var271, (SubLObject) module0711.$ic243$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var272 )
    {
      var272 = module0034.f1807( module0034.f1842( var271 ), (SubLObject) module0711.$ic243$, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var271, (SubLObject) module0711.$ic243$, var272 );
    }
    final SubLObject var273 = module0034.f1782( var44, var269 );
    final SubLObject var274 = module0034.f1814( var272, var273, (SubLObject) module0711.UNPROVIDED );
    if( var274 != module0711.$ic48$ )
    {
      SubLObject var275 = var274;
      SubLObject var276 = (SubLObject) module0711.NIL;
      var276 = var275.first();
      while ( module0711.NIL != var275)
      {
        SubLObject var277 = var276.first();
        final SubLObject var278 = conses_high.second( var276 );
        if( var44.eql( var277.first() ) )
        {
          var277 = var277.rest();
          if( module0711.NIL != var277 && module0711.NIL == var277.rest() && var269.eql( var277.first() ) )
          {
            return module0034.f1959( var278 );
          }
        }
        var275 = var275.rest();
        var276 = var275.first();
      }
    }
    final SubLObject var279 = Values.arg2( var270.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43615( var44, var269 ) ) );
    module0034.f1836( var272, var273, var274, var279, (SubLObject) ConsesLow.list( var44, var269 ) );
    return module0034.f1959( var279 );
  }

  public static SubLObject f43618(final SubLObject var278)
  {
    if( module0711.NIL != Characters.alpha_char_p( var278 ) )
    {
      return (SubLObject) module0711.T;
    }
    if( module0711.NIL != Sequences.find( var278, (SubLObject) module0711.$ic244$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED ) )
    {
      return (SubLObject) module0711.T;
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43606(final SubLObject var44)
  {
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    final SubLObject var45 = module0035.f2293( module0711.$g5610$.getGlobalValue(), var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    return ( module0711.NIL != var45 ) ? var45 : f43506( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43561(final SubLObject var44)
  {
    assert module0711.NIL != module0173.f10955( var44 ) : var44;
    if( module0711.NIL != module0128.f8449( var44 ) )
    {
      return module0166.f10743( var44 );
    }
    return f43584( f43585( var44 ) );
  }

  public static SubLObject f43611(final SubLObject var280)
  {
    final SubLThread var281 = SubLProcess.currentSubLThread();
    assert module0711.NIL != module0173.f10956( var280 ) : var280;
    if( var280.isString() )
    {
      return var280;
    }
    if( module0711.NIL != module0202.f12659( var280 ) )
    {
      if( module0711.NIL != module0711.$g5588$.getDynamicValue( var281 ) )
      {
        return f43531( var280 );
      }
      return f43584( f43585( var280 ) );
    }
    else if( var280.isNumber() )
    {
      if( module0711.NIL != module0711.$g5588$.getDynamicValue( var281 ) )
      {
        return module0213.f13918( var280 );
      }
      return f43620( var280 );
    }
    else
    {
      if( var280.isKeyword() )
      {
        return f43620( var280 );
      }
      Errors.warn( (SubLObject) module0711.$ic246$, var280 );
      return f43620( var280 );
    }
  }

  public static SubLObject f43539(final SubLObject var31)
  {
    if( module0711.NIL != module0128.f8449( var31 ) )
    {
      return module0166.f10743( var31 );
    }
    if( module0711.NIL != module0167.f10813( var31 ) )
    {
      return f43621( var31 );
    }
    return f43611( var31 );
  }

  public static SubLObject f43559(final SubLObject var44)
  {
    final SubLObject var45 = f43622( var44 );
    final SubLObject var46 = (SubLObject) module0711.NIL;
    return ( module0711.NIL != var46 ) ? f43619( var45, var44, (SubLObject) module0711.$ic247$ ) : var45;
  }

  public static SubLObject f43623(final SubLObject var31)
  {
    return module0751.f47225( var31 );
  }

  public static SubLObject f43624(final SubLObject var31)
  {
    return module0751.f47222( var31 );
  }

  public static SubLObject f43560(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0711.$g5600$.getDynamicValue( var45 ) )
    {
      return module0220.f14562( var44, module0711.$ic39$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    }
    SubLObject var46 = (SubLObject) module0711.NIL;
    SubLObject var47 = (SubLObject) module0711.NIL;
    final SubLObject var48 = module0003.f61();
    try
    {
      var45.throwStack.push( var48 );
      final SubLObject var49 = module0003.$g4$.currentBinding( var45 );
      try
      {
        module0003.$g4$.bind( (SubLObject) module0711.T, var45 );
        SubLObject var50 = (SubLObject) module0711.NIL;
        try
        {
          final SubLObject var36_287 = module0003.$g5$.currentBinding( var45 );
          try
          {
            module0003.$g5$.bind( Numbers.add( (SubLObject) module0711.ONE_INTEGER, module0003.$g5$.getDynamicValue( var45 ) ), var45 );
            var50 = module0003.f62( (SubLObject) module0711.$ic248$, var48 );
            final SubLObject var36_288 = module0580.$g4371$.currentBinding( var45 );
            final SubLObject var51 = module0580.$g4369$.currentBinding( var45 );
            final SubLObject var52 = module0580.$g4370$.currentBinding( var45 );
            try
            {
              module0580.$g4371$.bind( (SubLObject) module0711.ZERO_INTEGER, var45 );
              module0580.$g4369$.bind( module0580.f35598( (SubLObject) module0711.$ic249$ ), var45 );
              module0580.$g4370$.bind( module0580.$g4370$.getDynamicValue( var45 ), var45 );
              module0580.$g4370$.setDynamicValue( module0580.f35596(), var45 );
              if( module0711.NIL == module0580.$g4370$.getDynamicValue( var45 ) )
              {
                var46 = module0764.f48457( var44, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
                    (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
              }
              var47 = module0580.f35596();
            }
            finally
            {
              module0580.$g4370$.rebind( var52, var45 );
              module0580.$g4369$.rebind( var51, var45 );
              module0580.$g4371$.rebind( var36_288, var45 );
            }
          }
          finally
          {
            module0003.$g5$.rebind( var36_287, var45 );
          }
        }
        finally
        {
          final SubLObject var36_289 = Threads.$is_thread_performing_cleanupP$.currentBinding( var45 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var45 );
            module0003.f64( var50 );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var36_289, var45 );
          }
        }
      }
      finally
      {
        module0003.$g4$.rebind( var49, var45 );
      }
    }
    catch( Throwable var53 )
    {
      var47 = Errors.handleThrowable( var53, var48 );
    }
    finally
    {
      var45.throwStack.pop();
    }
    if( module0711.NIL != var47 )
    {
      Errors.warn( (SubLObject) module0711.$ic250$, var44, var46 );
    }
    return var46;
  }

  public static SubLObject f43513()
  {
    final SubLThread var7 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0107.f7628( module0711.$g5616$.getDynamicValue( var7 ) ) || module0711.NIL != module0107.f7628( module0711.$g5618$.getDynamicValue( var7 ) ) )
    {
      return f43625();
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43625()
  {
    module0711.$g5616$.setDynamicValue( Hashtables.make_hash_table( module0711.$g5605$.getGlobalValue(), Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.UNPROVIDED ) );
    module0711.$g5618$.setDynamicValue( (SubLObject) module0711.ONE_INTEGER );
    f43595();
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43517(final SubLObject var9)
  {
    SubLObject var11;
    final SubLObject var10 = var11 = module0205.f13385( var9, (SubLObject) module0711.UNPROVIDED );
    SubLObject var12 = (SubLObject) module0711.NIL;
    SubLObject var13 = (SubLObject) module0711.NIL;
    SubLObject var14 = (SubLObject) module0711.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var11, var10, (SubLObject) module0711.$ic251$ );
    var12 = var11.first();
    var11 = var11.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var11, var10, (SubLObject) module0711.$ic251$ );
    var13 = var11.first();
    var11 = var11.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var11, var10, (SubLObject) module0711.$ic251$ );
    var14 = var11.first();
    var11 = var11.rest();
    if( module0711.NIL == var11 )
    {
      final SubLObject var15 = ( module0711.NIL != Sequences.find( (SubLObject) Characters.CHAR_colon, var14, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
          (SubLObject) module0711.UNPROVIDED ) ) ? f43626( var13, var14 ) : f43627( var13, var14 );
      final SubLObject var16 = module0202.f12589( var9, module0711.$ic252$ );
      return (SubLObject) ( ( module0711.NIL != module0589.f35907( var15, (SubLObject) module0711.UNPROVIDED ) ) ? f43628( var12, var15, var16 ) : module0711.NIL );
    }
    cdestructuring_bind.cdestructuring_bind_error( var10, (SubLObject) module0711.$ic251$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43626(final SubLObject var159, final SubLObject var294)
  {
    final SubLObject var295 = module0038.f2738( var294, (SubLObject) module0711.$ic253$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    SubLObject var296 = (SubLObject) module0711.NIL;
    SubLObject var297 = (SubLObject) module0711.NIL;
    if( module0711.NIL != module0035.f1998( var295 ) )
    {
      SubLObject var299;
      final SubLObject var298 = var299 = var295;
      SubLObject var300 = (SubLObject) module0711.NIL;
      SubLObject var301 = (SubLObject) module0711.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var299, var298, (SubLObject) module0711.$ic254$ );
      var300 = var299.first();
      var299 = var299.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var299, var298, (SubLObject) module0711.$ic254$ );
      var301 = var299.first();
      var299 = var299.rest();
      if( module0711.NIL == var299 )
      {
        var296 = f43629( var300, var159 );
        if( module0711.NIL != var296 )
        {
          var297 = Sequences.cconcatenate( var296, var301 );
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var298, (SubLObject) module0711.$ic254$ );
      }
    }
    return var297;
  }

  public static SubLObject f43630(final SubLObject var299, final SubLObject var159)
  {
    final SubLObject var300 = (SubLObject) module0711.$ic256$;
    final SubLObject var301 = (SubLObject) module0711.$ic257$;
    SubLObject var302 = module0434.f30578( var300, (SubLObject) ConsesLow.list( module0711.$ic258$, var159, var299, var300 ), module0711.$ic6$, var301 ).first();
    if( module0711.NIL == var302 )
    {
      var302 = module0434.f30578( var300, (SubLObject) ConsesLow.list( module0711.$ic259$, var299, var300 ), module0711.$ic6$, var301 ).first();
    }
    if( module0711.NIL != module0206.f13453( var302 ) )
    {
      var302 = module0205.f13277( var302, (SubLObject) module0711.UNPROVIDED );
    }
    if( module0711.NIL == module0589.f35907( var302, (SubLObject) module0711.UNPROVIDED ) )
    {
      Errors.warn( (SubLObject) module0711.$ic260$, var299, var159 );
    }
    return (SubLObject) ( ( module0711.NIL != module0589.f35907( var302, (SubLObject) module0711.UNPROVIDED ) ) ? var302 : module0711.NIL );
  }

  public static SubLObject f43629(final SubLObject var299, final SubLObject var159)
  {
    final SubLThread var300 = SubLProcess.currentSubLThread();
    final SubLObject var301 = module0034.$g879$.getDynamicValue( var300 );
    SubLObject var302 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var301 )
    {
      return f43630( var299, var159 );
    }
    var302 = module0034.f1857( var301, (SubLObject) module0711.$ic255$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var302 )
    {
      var302 = module0034.f1807( module0034.f1842( var301 ), (SubLObject) module0711.$ic255$, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQUAL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var301, (SubLObject) module0711.$ic255$, var302 );
    }
    final SubLObject var303 = module0034.f1782( var299, var159 );
    final SubLObject var304 = module0034.f1814( var302, var303, (SubLObject) module0711.UNPROVIDED );
    if( var304 != module0711.$ic48$ )
    {
      SubLObject var305 = var304;
      SubLObject var306 = (SubLObject) module0711.NIL;
      var306 = var305.first();
      while ( module0711.NIL != var305)
      {
        SubLObject var307 = var306.first();
        final SubLObject var308 = conses_high.second( var306 );
        if( var299.equal( var307.first() ) )
        {
          var307 = var307.rest();
          if( module0711.NIL != var307 && module0711.NIL == var307.rest() && var159.equal( var307.first() ) )
          {
            return module0034.f1959( var308 );
          }
        }
        var305 = var305.rest();
        var306 = var305.first();
      }
    }
    final SubLObject var309 = Values.arg2( var300.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43630( var299, var159 ) ) );
    module0034.f1836( var302, var303, var304, var309, (SubLObject) ConsesLow.list( var299, var159 ) );
    return module0034.f1959( var309 );
  }

  public static SubLObject f43628(final SubLObject var292, final SubLObject var207, SubLObject var293)
  {
    if( var293 == module0711.UNPROVIDED )
    {
      var293 = (SubLObject) module0711.NIL;
    }
    if( !var207.isString() )
    {
      return (SubLObject) module0711.NIL;
    }
    return module0202.f12768( ( module0711.NIL != var293 ) ? f43518( module0711.$ic261$ ) : f43518( module0711.$ic78$ ), f43519( var292 ), f43574( var207, (SubLObject) module0711.NIL ) );
  }

  public static SubLObject f43627(final SubLObject var159, final SubLObject var160)
  {
    if( module0711.NIL == module0173.f10955( var159 ) )
    {
      Errors.warn( (SubLObject) module0711.$ic262$, var159 );
      return (SubLObject) module0711.NIL;
    }
    if( !var160.isString() )
    {
      Errors.warn( (SubLObject) module0711.$ic263$, var160 );
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != Sequences.find( (SubLObject) Characters.CHAR_colon, var160, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED ) )
    {
      return var160;
    }
    final SubLObject var161 = f43614( var159 );
    if( module0711.NIL == var161 )
    {
      f43631( var159 );
      return (SubLObject) module0711.NIL;
    }
    if( module0711.NIL != module0038.f2679( var161, (SubLObject) module0711.$ic264$ ) )
    {
      return Sequences.cconcatenate( var161, var160 );
    }
    if( var161.equal( (SubLObject) module0711.$ic265$ ) )
    {
      return Sequences.cconcatenate( var161, new SubLObject[] { module0711.$ic64$, var160
      } );
    }
    return Sequences.cconcatenate( var161, new SubLObject[] { module0711.$ic182$, var160
    } );
  }

  public static SubLObject f43632(final SubLObject var159)
  {
    Errors.warn( (SubLObject) module0711.$ic267$, var159 );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43631(final SubLObject var159)
  {
    final SubLThread var160 = SubLProcess.currentSubLThread();
    final SubLObject var161 = module0034.$g879$.getDynamicValue( var160 );
    SubLObject var162 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var161 )
    {
      return f43632( var159 );
    }
    var162 = module0034.f1857( var161, (SubLObject) module0711.$ic266$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var162 )
    {
      var162 = module0034.f1807( module0034.f1842( var161 ), (SubLObject) module0711.$ic266$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQUAL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var161, (SubLObject) module0711.$ic266$, var162 );
    }
    SubLObject var163 = module0034.f1814( var162, var159, (SubLObject) module0711.$ic48$ );
    if( var163 == module0711.$ic48$ )
    {
      var163 = Values.arg2( var160.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43632( var159 ) ) );
      module0034.f1816( var162, var159, var163, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var163 );
  }

  public static SubLObject f43633(final SubLObject var159)
  {
    final SubLThread var160 = SubLProcess.currentSubLThread();
    final SubLObject var161 = module0035.f2294( module0711.$g5627$.getGlobalValue(), var159, Symbols.symbol_function( (SubLObject) module0711.EQUAL ), (SubLObject) module0711.NIL );
    if( module0711.NIL != var161 )
    {
      return var161;
    }
    SubLObject var162 = module0347.f23344( (SubLObject) module0711.$ic270$, (SubLObject) ConsesLow.listS( module0711.$ic271$, var159, (SubLObject) module0711.$ic272$ ), module0711.$ic6$,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ).first();
    if( module0711.NIL != module0206.f13453( var162 ) )
    {
      var160.resetMultipleValues();
      final SubLObject var163 = module0337.f22630( var162, (SubLObject) module0711.$ic273$ );
      final SubLObject var164 = var160.secondMultipleValue();
      var160.resetMultipleValues();
      if( module0711.NIL != var163 )
      {
        final SubLObject var165 = var162 = module0035.f2294( var164, (SubLObject) module0711.$ic274$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      }
    }
    return var162;
  }

  public static SubLObject f43614(final SubLObject var159)
  {
    final SubLThread var160 = SubLProcess.currentSubLThread();
    final SubLObject var161 = module0034.$g879$.getDynamicValue( var160 );
    SubLObject var162 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var161 )
    {
      return f43633( var159 );
    }
    var162 = module0034.f1857( var161, (SubLObject) module0711.$ic269$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var162 )
    {
      var162 = module0034.f1807( module0034.f1842( var161 ), (SubLObject) module0711.$ic269$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQUAL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var161, (SubLObject) module0711.$ic269$, var162 );
    }
    SubLObject var163 = module0034.f1814( var162, var159, (SubLObject) module0711.$ic48$ );
    if( var163 == module0711.$ic48$ )
    {
      var163 = Values.arg2( var160.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43633( var159 ) ) );
      module0034.f1816( var162, var159, var163, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var163 );
  }

  public static SubLObject f43634(final SubLObject var104, final SubLObject var306)
  {
    SubLObject var307 = ( module0711.NIL != var306 ) ? f43616( f43622( var104 ) ) : f43635( module0038.f2638( var104 ) );
    if( module0711.NIL == module0269.f17716( var104 ) )
    {
      var307 = module0038.f2812( var307 );
    }
    return f43619( var307, var104, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43617(final SubLObject var104, final SubLObject var306)
  {
    final SubLThread var307 = SubLProcess.currentSubLThread();
    final SubLObject var308 = module0034.$g879$.getDynamicValue( var307 );
    SubLObject var309 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var308 )
    {
      return f43634( var104, var306 );
    }
    var309 = module0034.f1857( var308, (SubLObject) module0711.$ic275$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var309 )
    {
      var309 = module0034.f1807( module0034.f1842( var308 ), (SubLObject) module0711.$ic275$, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var308, (SubLObject) module0711.$ic275$, var309 );
    }
    final SubLObject var310 = module0034.f1782( var104, var306 );
    final SubLObject var311 = module0034.f1814( var309, var310, (SubLObject) module0711.UNPROVIDED );
    if( var311 != module0711.$ic48$ )
    {
      SubLObject var312 = var311;
      SubLObject var313 = (SubLObject) module0711.NIL;
      var313 = var312.first();
      while ( module0711.NIL != var312)
      {
        SubLObject var314 = var313.first();
        final SubLObject var315 = conses_high.second( var313 );
        if( var104.eql( var314.first() ) )
        {
          var314 = var314.rest();
          if( module0711.NIL != var314 && module0711.NIL == var314.rest() && var306.eql( var314.first() ) )
          {
            return module0034.f1959( var315 );
          }
        }
        var312 = var312.rest();
        var313 = var312.first();
      }
    }
    final SubLObject var316 = Values.arg2( var307.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43634( var104, var306 ) ) );
    module0034.f1836( var309, var310, var311, var316, (SubLObject) ConsesLow.list( var104, var306 ) );
    return module0034.f1959( var316 );
  }

  public static SubLObject f43619(final SubLObject var308, final SubLObject var44, SubLObject var46)
  {
    if( var46 == module0711.UNPROVIDED )
    {
      var46 = (SubLObject) module0711.$ic62$;
    }
    f43513();
    SubLObject var309 = (SubLObject) module0711.NIL;
    SubLObject var310 = var308;
    final SubLObject var311 = (SubLObject) ( var46.eql( (SubLObject) module0711.$ic247$ ) ? module0711.$ic276$ : module0711.$ic242$ );
    SubLObject var312 = f43511( var310, var46 );
    final SubLObject var313 = module0711.$g5617$.getGlobalValue();
    SubLObject var314 = (SubLObject) module0711.NIL;
    try
    {
      var314 = Locks.seize_lock( var313 );
      while ( module0711.NIL != var312 && !var312.eql( var44 ))
      {
        var309 = f43636( var309, var46 );
        var310 = Sequences.cconcatenate( var308, new SubLObject[] { var311, module0038.f2638( var309 )
        } );
        var312 = f43511( var310, var46 );
      }
      f43509( var44, var310, var46 );
    }
    finally
    {
      if( module0711.NIL != var314 )
      {
        Locks.release_lock( var313 );
      }
    }
    return var310;
  }

  public static SubLObject f43636(final SubLObject var315, final SubLObject var46)
  {
    final SubLThread var316 = SubLProcess.currentSubLThread();
    if( var46.eql( (SubLObject) module0711.$ic247$ ) )
    {
      return (SubLObject) ( var315.isInteger() ? module0048.f_1X( var315 ) : module0711.ONE_INTEGER );
    }
    final SubLObject var317 = module0711.$g5618$.getDynamicValue( var316 );
    module0711.$g5618$.setDynamicValue( Numbers.add( module0711.$g5618$.getDynamicValue( var316 ), (SubLObject) module0711.ONE_INTEGER ), var316 );
    return var317;
  }

  public static SubLObject f43637(final SubLObject var104)
  {
    return module0038.f2842( (SubLObject) Characters.CHAR_exclamation, (SubLObject) Characters.CHAR_less, f43620( var104 ) );
  }

  public static SubLObject f43621(final SubLObject var104)
  {
    final SubLThread var105 = SubLProcess.currentSubLThread();
    final SubLObject var106 = module0034.$g879$.getDynamicValue( var105 );
    SubLObject var107 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var106 )
    {
      return f43637( var104 );
    }
    var107 = module0034.f1857( var106, (SubLObject) module0711.$ic277$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var107 )
    {
      var107 = module0034.f1807( module0034.f1842( var106 ), (SubLObject) module0711.$ic277$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var106, (SubLObject) module0711.$ic277$, var107 );
    }
    SubLObject var108 = module0034.f1814( var107, var104, (SubLObject) module0711.$ic48$ );
    if( var108 == module0711.$ic48$ )
    {
      var108 = Values.arg2( var105.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43637( var104 ) ) );
      module0034.f1816( var107, var104, var108, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var108 );
  }

  public static SubLObject f43620(final SubLObject var176)
  {
    return f43638( var176, (SubLObject) module0711.NIL );
  }

  public static SubLObject f43585(final SubLObject var176)
  {
    return f43638( var176, (SubLObject) module0711.T );
  }

  public static SubLObject f43638(final SubLObject var176, final SubLObject var316)
  {
    final SubLThread var317 = SubLProcess.currentSubLThread();
    SubLObject var318 = (SubLObject) module0711.NIL;
    final SubLObject var319 = print_high.$print_pretty$.currentBinding( var317 );
    final SubLObject var320 = print_high.$print_length$.currentBinding( var317 );
    final SubLObject var321 = print_high.$print_level$.currentBinding( var317 );
    final SubLObject var322 = reader.$read_default_float_format$.currentBinding( var317 );
    try
    {
      print_high.$print_pretty$.bind( (SubLObject) module0711.NIL, var317 );
      print_high.$print_length$.bind( (SubLObject) module0711.NIL, var317 );
      print_high.$print_level$.bind( (SubLObject) module0711.NIL, var317 );
      reader.$read_default_float_format$.bind( (SubLObject) module0711.$ic278$, var317 );
      if( module0711.NIL != var316 )
      {
        var318 = module0006.f204( var176 );
      }
      else
      {
        var318 = module0038.f2638( var176 );
      }
    }
    finally
    {
      reader.$read_default_float_format$.rebind( var322, var317 );
      print_high.$print_level$.rebind( var321, var317 );
      print_high.$print_length$.rebind( var320, var317 );
      print_high.$print_pretty$.rebind( var319, var317 );
    }
    return var318;
  }

  public static SubLObject f43584(final SubLObject var223)
  {
    return f43639( f43640( var223 ) );
  }

  public static SubLObject f43639(SubLObject var223)
  {
    var223 = module0038.f2699( (SubLObject) module0711.$ic279$, (SubLObject) module0711.$ic280$, var223, (SubLObject) module0711.UNPROVIDED );
    var223 = module0038.f2699( (SubLObject) module0711.$ic281$, (SubLObject) module0711.$ic282$, var223, (SubLObject) module0711.UNPROVIDED );
    return var223;
  }

  public static SubLObject f43640(final SubLObject var223)
  {
    return module0038.f2699( (SubLObject) module0711.$ic63$, (SubLObject) module0711.$ic283$, var223, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43616(final SubLObject var317)
  {
    return f43635( module0038.f2658( var317 ) );
  }

  public static SubLObject f43635(SubLObject var317)
  {
    if( module0711.NIL != Sequences.search( (SubLObject) module0711.$ic284$, var317, Symbols.symbol_function( (SubLObject) module0711.EQUALP ), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      final SubLObject var318 = module0039.f3053( var317 );
      var317 = ( ( module0711.NIL != var318 ) ? var318 : var317 );
    }
    if( module0711.NIL != module0038.f2668( (SubLObject) module0711.$ic285$, var317, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) )
    {
      var317 = f43641( var317 );
    }
    var317 = Sequences.delete_if( (SubLObject) module0711.$ic286$, var317, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
    var317 = module0038.f2845( (SubLObject) Characters.CHAR_underbar, (SubLObject) module0711.$ic287$, var317 );
    var317 = f43640( var317 );
    var317 = module0038.f2699( (SubLObject) module0711.$ic242$, (SubLObject) module0711.$ic280$, var317, (SubLObject) module0711.UNPROVIDED );
    var317 = module0038.f2699( (SubLObject) module0711.$ic242$, (SubLObject) module0711.$ic282$, var317, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == module0601.f36767( var317 ) )
    {
      var317 = module0601.f36770( var317 );
    }
    return var317;
  }

  public static SubLObject f43642(final SubLObject var124)
  {
    return Sequences.find( var124, module0711.$g5628$.getGlobalValue(), (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43643(final SubLObject var124)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0711.NIL != module0601.f36748( var124 ) && module0711.NIL == Sequences.find( var124, module0711.$g5629$.getGlobalValue(), (SubLObject) module0711.UNPROVIDED,
        (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) && module0711.NIL == Sequences.find( var124, module0711.$g5628$.getGlobalValue(),
            (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) );
  }

  public static SubLObject f43641(final SubLObject var223)
  {
    Errors.warn( (SubLObject) module0711.$ic290$, var223 );
    return var223;
  }

  public static SubLObject f43644(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    final SubLObject var33 = module0213.f13918( var31 );
    if( module0711.NIL == Errors.$ignore_mustsP$.getDynamicValue( var32 ) && ( !var33.isString() || module0711.NIL == module0035.f2000( var33, (SubLObject) module0711.$ic292$, (SubLObject) module0711.UNPROVIDED ) ) )
    {
      Errors.error( (SubLObject) module0711.$ic293$, var33, var31, Sequences.length( var33 ) );
    }
    return var33;
  }

  public static SubLObject f43531(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    final SubLObject var33 = module0034.$g879$.getDynamicValue( var32 );
    SubLObject var34 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var33 )
    {
      return f43644( var31 );
    }
    var34 = module0034.f1857( var33, (SubLObject) module0711.$ic291$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var34 )
    {
      var34 = module0034.f1807( module0034.f1842( var33 ), (SubLObject) module0711.$ic291$, (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.$ic294$, (SubLObject) module0711.EQL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var33, (SubLObject) module0711.$ic291$, var34 );
    }
    SubLObject var35 = module0034.f1814( var34, var31, (SubLObject) module0711.$ic48$ );
    if( var35 == module0711.$ic48$ )
    {
      var35 = Values.arg2( var32.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43644( var31 ) ) );
      module0034.f1816( var34, var31, var35, (SubLObject) module0711.UNPROVIDED );
    }
    return module0034.f1959( var35 );
  }

  public static SubLObject f43645(final SubLObject var31)
  {
    return f43646( var31, (SubLObject) module0711.$ic295$ );
  }

  public static SubLObject f43647(final SubLObject var31)
  {
    return f43646( var31, (SubLObject) module0711.$ic296$ );
  }

  public static SubLObject f43622(final SubLObject var31)
  {
    return f43646( var31, (SubLObject) module0711.$ic297$ );
  }

  public static SubLObject f43648(final SubLObject var31, final SubLObject var320)
  {
    final SubLThread var321 = SubLProcess.currentSubLThread();
    SubLObject var322 = f43649( var31 );
    if( module0711.NIL == module0038.f2611( var322 ) )
    {
      SubLObject var323 = (SubLObject) module0711.NIL;
      try
      {
        var321.throwStack.push( module0711.$ic299$ );
        final SubLObject var324 = Errors.$error_handler$.currentBinding( var321 );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( (SubLObject) module0711.$ic300$ ), var321 );
          try
          {
            assert module0711.NIL != module0751.f46598( (SubLObject) module0711.T ) : module0711.T;
            final SubLObject var36_322 = module0579.$g4254$.currentBinding( var321 );
            final SubLObject var325 = module0579.$g4237$.currentBinding( var321 );
            try
            {
              module0579.$g4254$.bind( (SubLObject) module0711.T, var321 );
              module0579.$g4237$.bind( ( module0711.NIL != module0579.$g4237$.getDynamicValue( var321 ) ) ? module0579.$g4237$.getDynamicValue( var321 )
                  : module0067.f4880( Symbols.symbol_function( (SubLObject) module0711.EQUALP ), (SubLObject) module0711.UNPROVIDED ), var321 );
              var322 = module0209.f13552( module0770.f49067( var31, (SubLObject) module0711.$ic302$, var320, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
                  (SubLObject) module0711.UNPROVIDED ) );
            }
            finally
            {
              module0579.$g4237$.rebind( var325, var321 );
              module0579.$g4254$.rebind( var36_322, var321 );
            }
          }
          catch( Throwable var326 )
          {
            Errors.handleThrowable( var326, (SubLObject) module0711.NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( var324, var321 );
        }
      }
      catch( Throwable var327 )
      {
        var323 = Errors.handleThrowable( var327, (SubLObject) module0711.$ic299$ );
      }
      finally
      {
        var321.throwStack.pop();
      }
    }
    if( module0711.NIL == var322 )
    {
      final SubLObject var328 = var322 = f43650( var31 );
    }
    return var322;
  }

  public static SubLObject f43646(final SubLObject var31, final SubLObject var320)
  {
    final SubLThread var321 = SubLProcess.currentSubLThread();
    final SubLObject var322 = module0034.$g879$.getDynamicValue( var321 );
    SubLObject var323 = (SubLObject) module0711.NIL;
    if( module0711.NIL == var322 )
    {
      return f43648( var31, var320 );
    }
    var323 = module0034.f1857( var322, (SubLObject) module0711.$ic298$, (SubLObject) module0711.UNPROVIDED );
    if( module0711.NIL == var323 )
    {
      var323 = module0034.f1807( module0034.f1842( var322 ), (SubLObject) module0711.$ic298$, (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.NIL, (SubLObject) module0711.EQUAL,
          (SubLObject) module0711.UNPROVIDED );
      module0034.f1860( var322, (SubLObject) module0711.$ic298$, var323 );
    }
    final SubLObject var324 = module0034.f1782( var31, var320 );
    final SubLObject var325 = module0034.f1814( var323, var324, (SubLObject) module0711.UNPROVIDED );
    if( var325 != module0711.$ic48$ )
    {
      SubLObject var326 = var325;
      SubLObject var327 = (SubLObject) module0711.NIL;
      var327 = var326.first();
      while ( module0711.NIL != var326)
      {
        SubLObject var328 = var327.first();
        final SubLObject var329 = conses_high.second( var327 );
        if( var31.equal( var328.first() ) )
        {
          var328 = var328.rest();
          if( module0711.NIL != var328 && module0711.NIL == var328.rest() && var320.equal( var328.first() ) )
          {
            return module0034.f1959( var329 );
          }
        }
        var326 = var326.rest();
        var327 = var326.first();
      }
    }
    final SubLObject var330 = Values.arg2( var321.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f43648( var31, var320 ) ) );
    module0034.f1836( var323, var324, var325, var330, (SubLObject) ConsesLow.list( var31, var320 ) );
    return module0034.f1959( var330 );
  }

  public static SubLObject f43650(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0711.$g5599$.getDynamicValue( var32 ) )
    {
      return (SubLObject) module0711.$ic303$;
    }
    if( module0711.NIL != module0173.f10955( var31 ) )
    {
      return f43532( var31, (SubLObject) module0711.NIL );
    }
    return f43611( var31 );
  }

  public static SubLObject f43649(final SubLObject var44)
  {
    final SubLThread var45 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0711.$g5595$.getDynamicValue( var45 ) )
    {
      SubLObject var46 = module0220.f14556( var44, module0711.$ic304$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      if( module0711.NIL == var46 )
      {
        var46 = module0220.f14556( var44, module0711.$ic39$, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
      }
      return var46;
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43651()
  {
    final SubLThread var7 = SubLProcess.currentSubLThread();
    if( module0711.NIL != module0067.f4852( module0711.$g5630$.getGlobalValue() ) )
    {
      module0067.f4881( module0711.$g5630$.getGlobalValue() );
    }
    else
    {
      module0711.$g5630$.setGlobalValue( module0067.f4880( Symbols.symbol_function( (SubLObject) module0711.EQL ), (SubLObject) module0711.UNPROVIDED ) );
    }
    SubLObject var8 = module0711.$g5631$.getGlobalValue();
    SubLObject var9 = (SubLObject) module0711.NIL;
    var9 = var8.first();
    while ( module0711.NIL != var8)
    {
      SubLObject var11;
      final SubLObject var10 = var11 = var9;
      SubLObject var12 = (SubLObject) module0711.NIL;
      SubLObject var13 = (SubLObject) module0711.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var11, var10, (SubLObject) module0711.$ic306$ );
      var12 = var11.first();
      var11 = ( var13 = var11.rest() );
      if( module0711.NIL != module0075.f5218( var12 ) )
      {
        final SubLObject var14 = var12;
        SubLObject var15 = (SubLObject) module0711.NIL;
        try
        {
          final SubLObject var16 = stream_macros.$stream_requires_locking$.currentBinding( var7 );
          try
          {
            stream_macros.$stream_requires_locking$.bind( (SubLObject) module0711.NIL, var7 );
            var15 = compatibility.open_text( var14, (SubLObject) module0711.$ic307$ );
          }
          finally
          {
            stream_macros.$stream_requires_locking$.rebind( var16, var7 );
          }
          if( !var15.isStream() )
          {
            Errors.error( (SubLObject) module0711.$ic67$, var14 );
          }
          final SubLObject var17 = var15;
          if( var17.isStream() )
          {
            final SubLObject var332_333 = var17;
            SubLObject var18 = (SubLObject) module0711.NIL;
            SubLObject var19 = (SubLObject) module0711.NIL;
            var18 = (SubLObject) module0711.ZERO_INTEGER;
            for( var19 = module0075.f5202( var332_333 ); module0711.NIL != var19; var19 = module0075.f5202( var332_333 ) )
            {
              final SubLObject var336_337 = module0038.f2738( var19, (SubLObject) ConsesLow.list( (SubLObject) Characters.CHAR_comma ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
                  (SubLObject) module0711.$ic308$, (SubLObject) module0711.$ic308$ ) ), (SubLObject) module0711.NIL, (SubLObject) module0711.NIL, (SubLObject) ConsesLow.list( (SubLObject) Characters.CHAR_backslash ),
                  (SubLObject) module0711.UNPROVIDED );
              SubLObject var340_341;
              final SubLObject var338_339 = var340_341 = var336_337;
              SubLObject var20 = (SubLObject) module0711.NIL;
              SubLObject var21 = (SubLObject) module0711.NIL;
              cdestructuring_bind.destructuring_bind_must_consp( var340_341, var338_339, (SubLObject) module0711.$ic309$ );
              var20 = var340_341.first();
              var340_341 = var340_341.rest();
              cdestructuring_bind.destructuring_bind_must_consp( var340_341, var338_339, (SubLObject) module0711.$ic309$ );
              var21 = var340_341.first();
              var340_341 = var340_341.rest();
              if( module0711.NIL == var340_341 )
              {
                final SubLObject var22 = module0213.f13917( var21 );
                if( module0711.NIL != module0173.f10969( var22 ) )
                {
                  module0067.f4886( module0711.$g5630$.getGlobalValue(), var22, Sequences.cconcatenate( var13, var20 ) );
                }
              }
              else
              {
                cdestructuring_bind.cdestructuring_bind_error( var338_339, (SubLObject) module0711.$ic309$ );
              }
              var18 = module0048.f_1X( var18 );
            }
          }
        }
        finally
        {
          final SubLObject var23 = Threads.$is_thread_performing_cleanupP$.currentBinding( var7 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var7 );
            if( var15.isStream() )
            {
              streams_high.close( var15, (SubLObject) module0711.UNPROVIDED );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var23, var7 );
          }
        }
      }
      var8 = var8.rest();
      var9 = var8.first();
    }
    return module0711.$g5630$.getGlobalValue();
  }

  public static SubLObject f43652(SubLObject var345)
  {
    if( var345 == module0711.UNPROVIDED )
    {
      var345 = module0574.f35152();
    }
    final SubLThread var346 = SubLProcess.currentSubLThread();
    SubLObject var347 = module0711.$g5631$.getGlobalValue();
    SubLObject var348 = (SubLObject) module0711.NIL;
    var348 = var347.first();
    while ( module0711.NIL != var347)
    {
      SubLObject var350;
      final SubLObject var349 = var350 = var348;
      SubLObject var351 = (SubLObject) module0711.NIL;
      SubLObject var352 = (SubLObject) module0711.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var350, var349, (SubLObject) module0711.$ic306$ );
      var351 = var350.first();
      var350 = ( var352 = var350.rest() );
      if( module0711.NIL != module0075.f5218( var351 ) )
      {
        final SubLObject var353 = Sequences.search( (SubLObject) module0711.$ic310$, var352, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED,
            (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
        final SubLObject var354 = ( module0711.NIL != var353 ) ? module0711.$ic311$ : module0711.$ic312$;
        final SubLObject var355 = module0172.f10921( (SubLObject) ConsesLow.list( module0711.$ic313$, (SubLObject) ConsesLow.list( module0711.$ic314$, ( module0711.NIL != var353 ) ? module0711.$ic315$
            : module0711.$ic316$ ) ) );
        final SubLObject var356 = module0111.$g1405$.currentBinding( var346 );
        try
        {
          module0111.$g1405$.bind( (SubLObject) module0711.NIL, var346 );
          module0574.f35153( var345 );
          final SubLObject var357 = var351;
          SubLObject var358 = (SubLObject) module0711.NIL;
          try
          {
            final SubLObject var36_350 = stream_macros.$stream_requires_locking$.currentBinding( var346 );
            try
            {
              stream_macros.$stream_requires_locking$.bind( (SubLObject) module0711.NIL, var346 );
              var358 = compatibility.open_text( var357, (SubLObject) module0711.$ic307$ );
            }
            finally
            {
              stream_macros.$stream_requires_locking$.rebind( var36_350, var346 );
            }
            if( !var358.isStream() )
            {
              Errors.error( (SubLObject) module0711.$ic67$, var357 );
            }
            final SubLObject var359 = var358;
            if( var359.isStream() )
            {
              final SubLObject var332_351 = var359;
              SubLObject var360 = (SubLObject) module0711.NIL;
              SubLObject var361 = (SubLObject) module0711.NIL;
              var360 = (SubLObject) module0711.ZERO_INTEGER;
              for( var361 = module0075.f5202( var332_351 ); module0711.NIL != var361; var361 = module0075.f5202( var332_351 ) )
              {
                final SubLObject var336_352 = module0038.f2738( var361, (SubLObject) ConsesLow.list( (SubLObject) Characters.CHAR_comma ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
                    (SubLObject) module0711.$ic308$, (SubLObject) module0711.$ic308$ ) ), (SubLObject) module0711.NIL, (SubLObject) module0711.NIL, (SubLObject) ConsesLow.list( (SubLObject) Characters.CHAR_backslash ),
                    (SubLObject) module0711.UNPROVIDED );
                SubLObject var355_356;
                final SubLObject var353_354 = var355_356 = var336_352;
                SubLObject var362 = (SubLObject) module0711.NIL;
                SubLObject var363 = (SubLObject) module0711.NIL;
                cdestructuring_bind.destructuring_bind_must_consp( var355_356, var353_354, (SubLObject) module0711.$ic309$ );
                var362 = var355_356.first();
                var355_356 = var355_356.rest();
                cdestructuring_bind.destructuring_bind_must_consp( var355_356, var353_354, (SubLObject) module0711.$ic309$ );
                var363 = var355_356.first();
                var355_356 = var355_356.rest();
                if( module0711.NIL == var355_356 )
                {
                  final SubLObject var364 = module0213.f13917( var363 );
                  SubLObject var365 = var362;
                  if( module0711.NIL != module0039.f3008( var365 ) )
                  {
                    var365 = module0208.f13541( var365 );
                  }
                  if( module0711.NIL != module0173.f10969( var364 ) )
                  {
                    module0543.f33628( module0202.f12768( var354, var364, var365 ), var355, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED );
                  }
                }
                else
                {
                  cdestructuring_bind.cdestructuring_bind_error( var353_354, (SubLObject) module0711.$ic309$ );
                }
                var360 = module0048.f_1X( var360 );
              }
            }
          }
          finally
          {
            final SubLObject var36_351 = Threads.$is_thread_performing_cleanupP$.currentBinding( var346 );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0711.T, var346 );
              if( var358.isStream() )
              {
                streams_high.close( var358, (SubLObject) module0711.UNPROVIDED );
              }
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( var36_351, var346 );
            }
          }
        }
        finally
        {
          module0111.$g1405$.rebind( var356, var346 );
        }
      }
      var347 = var347.rest();
      var348 = var347.first();
    }
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43653(final SubLObject var44)
  {
    if( module0711.NIL == module0107.f7629( module0711.$g5630$.getGlobalValue() ) )
    {
      f43651();
    }
    return module0067.f4885( module0711.$g5630$.getGlobalValue(), var44, (SubLObject) module0711.UNPROVIDED );
  }

  public static SubLObject f43566(final SubLObject var44)
  {
    final SubLObject var45 = f43653( var44 );
    return (SubLObject) ( ( module0711.NIL != var45 ) ? ConsesLow.list( module0711.$ic138$, var44, var45 ) : module0711.NIL );
  }

  public static SubLObject f43654()
  {
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43496", "S#47603" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43497", "S#47604", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43498", "S#47605" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43499", "S#47606" );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43500", "S#47607" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43501", "S#47608", 0, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43502", "S#47609" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43503", "S#47610", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43504", "S#47611", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43505", "S#47612", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43507", "S#47613", 0, 1, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43508", "S#47614" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43509", "S#47615", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43510", "S#47616", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43511", "S#47617", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43512", "S#47618", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43520", "S#47619", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43521", "S#47620", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43525", "S#47621", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43527", "S#47622", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43530", "S#47623", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43529", "S#47624", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43528", "S#47625", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43533", "S#47626", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43534", "S#47627", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43524", "S#47628", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43536", "S#47629", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43523", "S#47630", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43535", "S#47631", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43526", "S#47632", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43538", "S#47633", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43514", "S#47634", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43547", "S#47635", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43548", "S#47636", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43549", "S#47637", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43543", "S#47638", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43550", "S#47639", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43551", "S#47640", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43552", "S#47641", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43542", "S#47642", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43553", "S#47643", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43540", "S#47644", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43546", "S#47645", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43554", "S#47646", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43522", "S#47647", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43555", "S#47648", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43556", "S#47649", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43557", "S#47650", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43558", "S#47651", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43545", "S#47652", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43562", "S#47653", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43563", "S#47654", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43541", "S#47655", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43567", "S#47656", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43568", "S#47657", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43570", "S#47658", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43544", "S#47659", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43571", "S#47660", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43572", "S#47661", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43573", "S#47662", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43516", "S#47663", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43515", "S#47664", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43575", "S#47665", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43576", "S#47666", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43518", "S#47667", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43519", "S#47668", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43574", "S#47669", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43583", "S#47670", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43582", "S#47671", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43590", "S#47672", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43591", "S#47673", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43592", "S#47674", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43593", "S#47675", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43589", "S#47676", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43587", "S#47677", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43580", "S#47678", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43581", "S#47679", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43594", "S#47680", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43586", "S#47681", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43595", "S#47682", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43596", "S#47683", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43597", "S#47684", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43599", "S#42887", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43600", "S#42888", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43598", "S#47685", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43564", "S#47686", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43565", "S#47687", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43602", "S#47688", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43603", "S#47689", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43537", "S#47690", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43601", "S#47691", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43579", "S#47692", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43604", "S#47693", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43578", "S#47694", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43605", "S#47695", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43569", "S#47696", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43609", "S#47697", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43608", "S#47698", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43607", "S#47699", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.module0711", "f43610", "S#47700" );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43588", "S#47701", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43506", "S#47702", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43577", "S#47703", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43612", "S#47704", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43613", "S#47705", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43615", "S#47706", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43532", "S#47707", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43618", "S#47708", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43606", "S#47709", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43561", "S#47710", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43611", "S#47711", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43539", "S#47712", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43559", "S#47713", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43623", "S#47714", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43624", "S#47715", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43560", "S#47716", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43513", "S#47717", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43625", "S#47718", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43517", "S#47719", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43626", "S#47720", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43630", "S#47721", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43629", "S#47722", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43628", "S#47723", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43627", "S#47724", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43632", "S#47725", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43631", "S#47726", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43633", "S#47727", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43614", "S#47728", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43634", "S#47729", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43617", "S#47730", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43619", "S#47731", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43636", "S#47732", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43637", "S#47733", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43621", "S#47734", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43620", "S#47735", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43585", "S#47736", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43638", "S#47737", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43584", "S#14882", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43639", "S#47738", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43640", "S#47739", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43616", "S#47740", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43635", "S#47741", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43642", "S#47742", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43643", "S#47743", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43641", "S#47744", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43644", "S#47745", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43531", "S#47746", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43645", "S#47747", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43647", "S#47748", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43622", "S#47749", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43648", "S#47750", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43646", "S#47751", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43650", "S#47752", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43649", "S#47753", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43651", "S#47754", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43652", "S#47755", 0, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43653", "S#47756", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0711", "f43566", "S#47757", 1, 0, false );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43655()
  {
    module0711.$g5588$ = SubLFiles.defparameter( "S#47758", (SubLObject) module0711.T );
    module0711.$g5594$ = SubLFiles.defparameter( "S#47759", (SubLObject) module0711.NIL );
    module0711.$g5595$ = SubLFiles.defparameter( "S#47760", (SubLObject) module0711.T );
    module0711.$g5593$ = SubLFiles.defparameter( "S#47761", (SubLObject) module0711.T );
    module0711.$g5596$ = SubLFiles.defparameter( "S#47762", module0107.f7627() );
    module0711.$g5597$ = SubLFiles.defparameter( "S#47763", (SubLObject) module0711.NIL );
    module0711.$g5598$ = SubLFiles.defparameter( "S#47764", (SubLObject) module0711.NIL );
    module0711.$g5599$ = SubLFiles.defparameter( "S#47765", (SubLObject) module0711.NIL );
    module0711.$g5600$ = SubLFiles.defparameter( "S#47766", (SubLObject) module0711.NIL );
    module0711.$g5601$ = SubLFiles.defparameter( "S#47767", (SubLObject) module0711.NIL );
    module0711.$g5602$ = SubLFiles.defparameter( "S#47768", module0711.$ic6$ );
    module0711.$g5603$ = SubLFiles.defparameter( "S#47769", (SubLObject) module0711.NIL );
    module0711.$g5604$ = SubLFiles.deflexical( "S#47770", (SubLObject) module0711.$ic18$ );
    module0711.$g5605$ = SubLFiles.deflexical( "S#47771", (SubLObject) module0711.$ic32$ );
    module0711.$g5606$ = SubLFiles.deflexical( "S#47772", (SubLObject) module0711.$ic33$ );
    module0711.$g5607$ = SubLFiles.deflexical( "S#47773", (SubLObject) module0711.NIL );
    module0711.$g5608$ = SubLFiles.defparameter( "S#47774", (SubLObject) module0711.$ic49$ );
    module0711.$g5609$ = SubLFiles.deflexical( "S#47775", (SubLObject) module0711.$ic50$ );
    module0711.$g5610$ = SubLFiles.deflexical( "S#47776", (SubLObject) module0711.$ic51$ );
    module0711.$g5611$ = SubLFiles.deflexical( "S#47777", (SubLObject) module0711.$ic52$ );
    module0711.$g5612$ = SubLFiles.deflexical( "S#47778", (SubLObject) module0711.$ic53$ );
    module0711.$g5613$ = SubLFiles.deflexical( "S#47779", (SubLObject) module0711.$ic54$ );
    module0711.$g5614$ = SubLFiles.deflexical( "S#47780", (SubLObject) module0711.$ic55$ );
    module0711.$g5615$ = SubLFiles.deflexical( "S#47781", (SubLObject) module0711.$ic56$ );
    module0711.$g5616$ = SubLFiles.defparameter( "S#47782", module0107.f7627() );
    module0711.$g5617$ = SubLFiles.deflexical( "S#47783", Locks.make_lock( (SubLObject) module0711.$ic70$ ) );
    module0711.$g5618$ = SubLFiles.defvar( "S#47784", module0107.f7627() );
    module0711.$g5619$ = SubLFiles.deflexical( "S#47785", (SubLObject) module0711.$ic92$ );
    module0711.$g5620$ = SubLFiles.deflexical( "S#47786", (SubLObject) module0711.$ic108$ );
    module0711.$g5621$ = SubLFiles.defparameter( "S#47787", module0107.f7627() );
    module0711.$g5622$ = SubLFiles.defparameter( "S#47788", (SubLObject) module0711.NIL );
    module0711.$g5623$ = SubLFiles.deflexical( "S#47789", (SubLObject) module0711.$ic188$ );
    module0711.$g5624$ = SubLFiles.deflexical( "S#47790", module0057.f4173( (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED, (SubLObject) module0711.UNPROVIDED ) );
    module0711.$g5625$ = SubLFiles.deflexical( "S#47791", (SubLObject) module0711.$ic212$ );
    module0711.$g5626$ = SubLFiles.deflexical( "S#47792", (SubLObject) module0711.$ic242$ );
    module0711.$g5627$ = SubLFiles.deflexical( "S#47793", (SubLObject) module0711.$ic268$ );
    module0711.$g5628$ = SubLFiles.deflexical( "S#47794", (SubLObject) module0711.$ic288$ );
    module0711.$g5629$ = SubLFiles.deflexical( "S#47795", (SubLObject) module0711.$ic289$ );
    module0711.$g5630$ = SubLFiles.deflexical( "S#47796", module0107.f7627() );
    module0711.$g5631$ = SubLFiles.deflexical( "S#47797", (SubLObject) module0711.$ic305$ );
    return (SubLObject) module0711.NIL;
  }

  public static SubLObject f43656()
  {
    module0034.f1909( (SubLObject) module0711.$ic34$ );
    module0034.f1895( (SubLObject) module0711.$ic88$ );
    module0034.f1895( (SubLObject) module0711.$ic93$ );
    module0012.f419( (SubLObject) module0711.$ic133$ );
    module0012.f419( (SubLObject) module0711.$ic136$ );
    module0012.f419( (SubLObject) module0711.$ic117$ );
    module0012.f419( (SubLObject) module0711.$ic190$ );
    module0012.f419( (SubLObject) module0711.$ic200$ );
    module0034.f1895( (SubLObject) module0711.$ic215$ );
    module0034.f1895( (SubLObject) module0711.$ic230$ );
    module0034.f1895( (SubLObject) module0711.$ic243$ );
    module0034.f1895( (SubLObject) module0711.$ic255$ );
    module0034.f1895( (SubLObject) module0711.$ic266$ );
    module0034.f1895( (SubLObject) module0711.$ic269$ );
    module0034.f1895( (SubLObject) module0711.$ic275$ );
    module0034.f1895( (SubLObject) module0711.$ic277$ );
    module0034.f1895( (SubLObject) module0711.$ic291$ );
    module0034.f1895( (SubLObject) module0711.$ic298$ );
    return (SubLObject) module0711.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f43654();
  }

  @Override
  public void initializeVariables()
  {
    f43655();
  }

  @Override
  public void runTopLevelForms()
  {
    f43656();
  }
  static
  {
    me = (SubLFile) new module0711();
    module0711.$g5588$ = null;
    module0711.$g5594$ = null;
    module0711.$g5595$ = null;
    module0711.$g5593$ = null;
    module0711.$g5596$ = null;
    module0711.$g5597$ = null;
    module0711.$g5598$ = null;
    module0711.$g5599$ = null;
    module0711.$g5600$ = null;
    module0711.$g5601$ = null;
    module0711.$g5602$ = null;
    module0711.$g5603$ = null;
    module0711.$g5604$ = null;
    module0711.$g5605$ = null;
    module0711.$g5606$ = null;
    module0711.$g5607$ = null;
    module0711.$g5608$ = null;
    module0711.$g5609$ = null;
    module0711.$g5610$ = null;
    module0711.$g5611$ = null;
    module0711.$g5612$ = null;
    module0711.$g5613$ = null;
    module0711.$g5614$ = null;
    module0711.$g5615$ = null;
    module0711.$g5616$ = null;
    module0711.$g5617$ = null;
    module0711.$g5618$ = null;
    module0711.$g5619$ = null;
    module0711.$g5620$ = null;
    module0711.$g5621$ = null;
    module0711.$g5622$ = null;
    module0711.$g5623$ = null;
    module0711.$g5624$ = null;
    module0711.$g5625$ = null;
    module0711.$g5626$ = null;
    module0711.$g5627$ = null;
    module0711.$g5628$ = null;
    module0711.$g5629$ = null;
    module0711.$g5630$ = null;
    module0711.$g5631$ = null;
    $ic0$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47798", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic1$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic2$ = SubLObjectFactory.makeSymbol( "S#47762", "CYC" );
    $ic3$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic4$ = SubLObjectFactory.makeString( "*OWL-EXPORT-TERMS* is not set." );
    $ic5$ = SubLObjectFactory.makeKeyword( "IGNORE" );
    $ic6$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "InferencePSC" ) );
    $ic7$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "&OPTIONAL" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47799", "CYC" ),
        (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "QUOTE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47590", "CYC" ) ) ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic8$ = SubLObjectFactory.makeSymbol( "S#47590", "CYC" );
    $ic9$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47760", "CYC" ), (SubLObject) module0711.T );
    $ic10$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47758", "CYC" ), (SubLObject) module0711.T );
    $ic11$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47761", "CYC" ), (SubLObject) module0711.NIL ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory
        .makeSymbol( "S#47591", "CYC" ), (SubLObject) module0711.T ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47592", "CYC" ), (SubLObject) module0711.T ), (SubLObject) ConsesLow.list(
            (SubLObject) SubLObjectFactory.makeSymbol( "S#47766", "CYC" ), (SubLObject) module0711.T ) );
    $ic12$ = SubLObjectFactory.makeSymbol( "S#47605", "CYC" );
    $ic13$ = SubLObjectFactory.makeSymbol( "S#47607", "CYC" );
    $ic14$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47758", "CYC" ), (SubLObject) module0711.NIL );
    $ic15$ = SubLObjectFactory.makeSymbol( "MUST" );
    $ic16$ = SubLObjectFactory.makeSymbol( "S#4999", "CYC" );
    $ic17$ = SubLObjectFactory.makeString( "Human-readable OWL export requires a valid (UNIVERSAL-DATE-P) version date. Got ~S" );
    $ic18$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#1764", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47760", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47758", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#47761", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47590", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47591", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#47766", "CYC" ) );
    $ic19$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#15203", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47800", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&OPTIONAL" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47801", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic20$ = SubLObjectFactory.makeUninternedSymbol( "US#516A0DA" );
    $ic21$ = SubLObjectFactory.makeUninternedSymbol( "US#425A4A8" );
    $ic22$ = SubLObjectFactory.makeSymbol( "S#47763", "CYC" );
    $ic23$ = SubLObjectFactory.makeSymbol( "NEW-SET" );
    $ic24$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "FUNCTION" ), (SubLObject) module0711.EQUAL );
    $ic25$ = ConsesLow.list( (SubLObject) module0711.NIL );
    $ic26$ = SubLObjectFactory.makeSymbol( "S#5129", "CYC" );
    $ic27$ = SubLObjectFactory.makeSymbol( "SET-ADD" );
    $ic28$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47763", "CYC" ) );
    $ic29$ = SubLObjectFactory.makeSymbol( "CPUSH" );
    $ic30$ = SubLObjectFactory.makeSymbol( "S#2969", "CYC" );
    $ic31$ = SubLObjectFactory.makeSymbol( "NREVERSE" );
    $ic32$ = SubLObjectFactory.makeInteger( 14822 );
    $ic33$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "preferredEnglish" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "cycName" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "comment" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owlExternalID" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
            "termOfUnit" ) ) );
    $ic34$ = SubLObjectFactory.makeSymbol( "S#47613", "CYC" );
    $ic35$ = (SubLList) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "specialIsa" ) ), (SubLObject) SubLObjectFactory.makeString( "rdf:type" ) );
    $ic36$ = (SubLList) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "preferredEnglish" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:label" ) );
    $ic37$ = (SubLList) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "skos:prefLabel" ) ), (SubLObject) SubLObjectFactory.makeString( "skos:prefLabel" ) );
    $ic38$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "otherEnglish" ) );
    $ic39$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "prettyString" ) );
    $ic40$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "cycName" ) );
    $ic41$ = SubLObjectFactory.makeString( ":" );
    $ic42$ = SubLObjectFactory.makeString( "label" );
    $ic43$ = (SubLList) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "comment" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:comment" ) );
    $ic44$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owlExternalID" ) );
    $ic45$ = SubLObjectFactory.makeString( "externalID" );
    $ic46$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "broaderTerm" ) ), (SubLObject) SubLObjectFactory.makeString( "broaderTerm" ) ), ConsesLow
        .cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:sameAs" ) ), (SubLObject) SubLObjectFactory.makeString( "owl:sameAs" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory
            .makeString( "rdfURI" ) ), (SubLObject) SubLObjectFactory.makeString( "owl:sameAs" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:inverseOf" ) ),
                (SubLObject) SubLObjectFactory.makeString( "owl:inverseOf" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "isa" ) ), (SubLObject) SubLObjectFactory.makeString(
                    "rdf:type" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genls" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:subClassOf" ) ), ConsesLow.cons( module0128
                        .f8479( (SubLObject) SubLObjectFactory.makeString( "genlPreds" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:subPropertyOf" ) ), ConsesLow.cons( module0128.f8479(
                            (SubLObject) SubLObjectFactory.makeString( "arg1Isa" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:domain" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory
                                .makeString( "arg1SometimesIsa" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:domain" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
                                    "arg2Isa" ) ), (SubLObject) SubLObjectFactory.makeString( "rdfs:range" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg2SometimesIsa" ) ),
                                        (SubLObject) SubLObjectFactory.makeString( "rdfs:range" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "equals" ) ),
                                            (SubLObject) SubLObjectFactory.makeString( "owl:sameAs" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:intersectionOf" ) ),
                                                (SubLObject) SubLObjectFactory.makeString( "owl:intersectionOf" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "disjointWith" ) ),
                                                    (SubLObject) SubLObjectFactory.makeString( "owl:disjointWith" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLRestrictionFn" ) ),
                                                        (SubLObject) SubLObjectFactory.makeString( "owl:Restriction" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:onProperty" ) ),
                                                            (SubLObject) SubLObjectFactory.makeString( "owl:onProperty" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
                                                                "owl:hasValue" ) ), (SubLObject) SubLObjectFactory.makeString( "owl:hasValue" ) )
    } );
    $ic47$ = SubLObjectFactory.makeSymbol( "S#47773", "CYC" );
    $ic48$ = SubLObjectFactory.makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
    $ic49$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "prettyString" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "prettyString-Canonical" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "termOfUnit" ) ) );
    $ic50$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "broaderThan" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "broaderTerm" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "requiredActorSlots" ) ) );
    $ic51$ = ConsesLow.list( (SubLObject) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Collection" ) ), (SubLObject) SubLObjectFactory.makeString( "owl:Class" ) ), (SubLObject) ConsesLow
        .cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "BinaryPredicate" ) ), (SubLObject) SubLObjectFactory.makeString( "owl:ObjectProperty" ) ) );
    $ic52$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubLAtomicTerm" ) ), (SubLObject) SubLObjectFactory.makeString(
        "http://www.w3.org/2000/01/rdf-schema#Literal" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "isa" ) ), (SubLObject) SubLObjectFactory.makeString(
            "http://www.w3.org/1999/02/22-rdf-syntax-ns#type" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genls" ) ), (SubLObject) SubLObjectFactory.makeString(
                "http://www.w3.org/2000/01/rdf-schema#subClassOf" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genlPreds" ) ), (SubLObject) SubLObjectFactory.makeString(
                    "http://www.w3.org/2000/01/rdf-schema#subPropertyOf" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "comment" ) ), (SubLObject) SubLObjectFactory.makeString(
                        "http://www.w3.org/2000/01/rdf-schema#comment" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "disjointWith" ) ), (SubLObject) SubLObjectFactory.makeString(
                            "http://www.w3.org/2002/07/owl#disjointWith" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "different" ) ), (SubLObject) SubLObjectFactory.makeString(
                                "http://www.w3.org/2002/07/owl#differentFrom" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "equals" ) ), (SubLObject) SubLObjectFactory.makeString(
                                    "http://www.w3.org/2002/07/owl#sameAs" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg1Isa" ) ), (SubLObject) SubLObjectFactory.makeString(
                                        "http://www.w3.org/2000/01/rdf-schema#domain" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg2Isa" ) ), (SubLObject) SubLObjectFactory
                                            .makeString( "http://www.w3.org/2000/01/rdf-schema#range" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg1SometimesIsa" ) ),
                                                (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2000/01/rdf-schema#domain" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
                                                    "arg2SometimesIsa" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2000/01/rdf-schema#range" ) ), ConsesLow.cons( module0128.f8479(
                                                        (SubLObject) SubLObjectFactory.makeString( "ontologyVersionInfo" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#versionInfo" ) ),
      ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "ontologyPriorVersion" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#priorVersion" ) ), ConsesLow.cons(
          module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "incompatibleOntology" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#incompatibleWith" ) ), ConsesLow.cons(
              module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:differentFrom" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#differentFrom" ) ), ConsesLow.cons( module0128
                  .f8479( (SubLObject) SubLObjectFactory.makeString( "backwardsCompatibleOntology" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#backwardCompatibleWith" ) ), ConsesLow
                      .cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "inverseBinaryPredicateOf" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#inverseOf" ) ),
      ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "coExtensional" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#equivalentClass" ) ), ConsesLow.cons(
          module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owlRestrictionAllValuesFrom" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2002/07/owl#allValuesFrom" ) )
    } );
    $ic53$ = ConsesLow.list( new SubLObject[] { ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:Thing" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ),
        (SubLObject) SubLObjectFactory.makeString( "Thing" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:Nothing" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ),
            (SubLObject) SubLObjectFactory.makeString( "Nothing" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:Class" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ),
                (SubLObject) SubLObjectFactory.makeString( "Class" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:DeprecatedClass" ) ), (SubLObject) SubLObjectFactory.makeString(
                    "owl" ), (SubLObject) SubLObjectFactory.makeString( "DeprecatedClass" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:TransitiveProperty" ) ),
                        (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString( "TransitiveProperty" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory
                            .makeString( "owl:SymmetricProperty" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString( "SymmetricProperty" ) ), ConsesLow.list( module0128
                                .f8479( (SubLObject) SubLObjectFactory.makeString( "owl:ObjectProperty" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString(
                                    "ObjectProperty" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:DatatypeProperty" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ),
                                        (SubLObject) SubLObjectFactory.makeString( "DatatypeProperty" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:DeprecatedProperty" ) ),
                                            (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString( "DeprecatedProperty" ) ), ConsesLow.list( module0128.f8479(
                                                (SubLObject) SubLObjectFactory.makeString( "owl:FunctionalProperty" ) ), (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString(
                                                    "FunctionalProperty" ) ), ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:InverseFunctionalProperty" ) ),
                                                        (SubLObject) SubLObjectFactory.makeString( "owl" ), (SubLObject) SubLObjectFactory.makeString( "InverseFunctionalProperty" ) )
    } );
    $ic54$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UniformResourceIdentifier" ) ), (SubLObject) SubLObjectFactory.makeString(
        "http://www.w3.org/2001/XMLSchema#uriReference" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UniformResourceLocator" ) ), (SubLObject) SubLObjectFactory.makeString(
            "http://www.w3.org/2001/XMLSchema#uriReference" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Date" ) ), (SubLObject) SubLObjectFactory.makeString(
                "http://www.w3.org/2001/XMLSchema#date" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubLRealNumber" ) ), (SubLObject) SubLObjectFactory.makeString(
                    "http://www.w3.org/2001/XMLSchema#double" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubLString" ) ), (SubLObject) SubLObjectFactory.makeString(
                        "http://www.w3.org/2001/XMLSchema#string" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubLInteger" ) ), (SubLObject) SubLObjectFactory.makeString(
                            "http://www.w3.org/2001/XMLSchema#integer" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "PositiveInteger" ) ), (SubLObject) SubLObjectFactory.makeString(
                                "http://www.w3.org/2001/XMLSchema#positiveInteger" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Integer" ) ), (SubLObject) SubLObjectFactory
                                    .makeString( "http://www.w3.org/2001/XMLSchema#integer" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "NonNegativeInteger" ) ),
                                        (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#nonNegativeInteger" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
                                            "SubLBoolean" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#boolean" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory
                                                .makeString( "CalendarSecond" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#dateTime" ) ), ConsesLow.cons( module0128.f8479(
                                                    (SubLObject) SubLObjectFactory.makeString( "CalendarDay" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#date" ) ), ConsesLow.cons(
                                                        module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "CalendarMonth" ) ), (SubLObject) SubLObjectFactory.makeString(
                                                            "http://www.w3.org/2001/XMLSchema#gYearMonth" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "CalendarYear" ) ),
                                                                (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#gYear" ) ), ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory
                                                                    .makeString( "DayOfMonthType" ) ), (SubLObject) SubLObjectFactory.makeString( "http://www.w3.org/2001/XMLSchema#gDay" ) ), ConsesLow.cons( module0128
                                                                        .f8479( (SubLObject) SubLObjectFactory.makeString( "GregorianMonthType" ) ), (SubLObject) SubLObjectFactory.makeString(
                                                                            "http://www.w3.org/2001/XMLSchema#gMonth" ) )
    } );
    $ic55$ = ConsesLow.list( new SubLObject[] { module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "broaderThan" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "isa" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "genls" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genlPreds" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg1Isa" ) ),
      module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg1SometimesIsa" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "arg2Isa" ) ), module0128.f8479( (SubLObject) SubLObjectFactory
          .makeString( "arg2SometimesIsa" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "equals" ) )
    } );
    $ic56$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "termOfUnit" ) ) );
    $ic57$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "&OPTIONAL" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47802", "CYC" ) ), (SubLObject) SubLObjectFactory
        .makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic58$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47782", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#4341", "CYC" ) ) ) );
    $ic59$ = SubLObjectFactory.makeSymbol( "PWHEN" );
    $ic60$ = SubLObjectFactory.makeSymbol( "DIRECTORY-P" );
    $ic61$ = SubLObjectFactory.makeSymbol( "S#47616", "CYC" );
    $ic62$ = SubLObjectFactory.makeKeyword( "OWL-NAME" );
    $ic63$ = SubLObjectFactory.makeString( "" );
    $ic64$ = SubLObjectFactory.makeString( "/" );
    $ic65$ = SubLObjectFactory.makeString( "fort-owl-names.csv" );
    $ic66$ = SubLObjectFactory.makeKeyword( "OUTPUT" );
    $ic67$ = SubLObjectFactory.makeString( "Unable to open ~S" );
    $ic68$ = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#29", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "TYPE" ) );
    $ic69$ = SubLObjectFactory.makeString( "~S, ~S~%" );
    $ic70$ = SubLObjectFactory.makeString( "OWL Name Uniquifier" );
    $ic71$ = SubLObjectFactory.makeSymbol( "S#38", "CYC" );
    $ic72$ = SubLObjectFactory.makeString( "Invalid attempt to reuse memoization state in multiple threads simultaneously." );
    $ic73$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "isa" ) );
    $ic74$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "OR" ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "BinaryPredicate" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "Thing" ) ) ) );
    $ic75$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genls" ) );
    $ic76$ = (SubLList) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "OR" ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalConcept" ) ),
        module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalPred-Inverse" ) ) ), (SubLObject) SubLObjectFactory.makeKeyword( "ANYTHING" ) );
    $ic77$ = SubLObjectFactory.makeString( "unexpected asent ~s" );
    $ic78$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:sameAs" ) );
    $ic79$ = SubLObjectFactory.makeString( "Caught error OWL-cyclifying ~S:~% ~S" );
    $ic80$ = SubLObjectFactory.makeString( "~S is not a FORT." );
    $ic81$ = SubLObjectFactory.makeSymbol( "S#16341", "CYC" );
    $ic82$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:Ontology" ) );
    $ic83$ = SubLObjectFactory.makeString( "Can't export OWL Ontology as part of export of larger ontology: ~S" );
    $ic84$ = SubLObjectFactory.makeString( "Sorting " );
    $ic85$ = SubLObjectFactory.makeString( " terms for OWL export..." );
    $ic86$ = SubLObjectFactory.makeInteger( 1000 );
    $ic87$ = SubLObjectFactory.makeString( "Couldn't resolve ~S to a canonical FORT." );
    $ic88$ = SubLObjectFactory.makeSymbol( "S#47624", "CYC" );
    $ic89$ = SubLObjectFactory.makeSymbol( "NART-P" );
    $ic90$ = SubLObjectFactory.makeInteger( 225 );
    $ic91$ = SubLObjectFactory.makeSymbol( "S#47627", "CYC" );
    $ic92$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "isa" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genls" ) ) );
    $ic93$ = SubLObjectFactory.makeSymbol( "S#47630", "CYC" );
    $ic94$ = SubLObjectFactory.makeString( "Can't export ~S" );
    $ic95$ = SubLObjectFactory.makeString( "Not a collection: ~S" );
    $ic96$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionRelationFunction" ) );
    $ic97$ = SubLObjectFactory.makeSymbol( "FORT-P" );
    $ic98$ = SubLObjectFactory.makeString( "Restriction property is not a binary predicate(!): ~S" );
    $ic99$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationFromFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
        "SubcollectionOfWithRelationFromTypeFn" ) ) );
    $ic100$ = SubLObjectFactory.makeString( "Couldn't find or create inverse of ~S" );
    $ic101$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationToFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString(
        "SubcollectionOfWithRelationToTypeFn" ) ) );
    $ic102$ = SubLObjectFactory.makeString( "restriction property is not a FORT: ~S" );
    $ic103$ = SubLObjectFactory.makeSymbol( "S#47633", "CYC" );
    $ic104$ = SubLObjectFactory.makeKeyword( "TRUE" );
    $ic105$ = SubLObjectFactory.makeSymbol( "GAF-FORMULA" );
    $ic106$ = SubLObjectFactory.makeSymbol( "S#47636", "CYC" );
    $ic107$ = SubLObjectFactory.makeSymbol( "S#47647", "CYC" );
    $ic108$ = ConsesLow.list( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "TEST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47637", "CYC" ) ),
        (SubLObject) SubLObjectFactory.makeKeyword( "ANYTHING" ) ), (SubLObject) ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "quotedIsa" ) ), (SubLObject) SubLObjectFactory.makeKeyword(
            "ANYTHING" ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "TerrorismOntologyConstant" ) ) ) );
    $ic109$ = SubLObjectFactory.makeSymbol( "S#47657", "CYC" );
    $ic110$ = SubLObjectFactory.makeSymbol( "S#47658", "CYC" );
    $ic111$ = SubLObjectFactory.makeSymbol( "S#47628", "CYC" );
    $ic112$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Thing" ) );
    $ic113$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalConceptWRTPredicate" ) );
    $ic114$ = SubLObjectFactory.makeKeyword( "GAF" );
    $ic115$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "rdf-type" ) );
    $ic116$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalConcept" ) );
    $ic117$ = SubLObjectFactory.makeSymbol( "S#47661", "CYC" );
    $ic118$ = SubLObjectFactory.makeSymbol( "S#47646", "CYC" );
    $ic119$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "comment" ) );
    $ic120$ = ConsesLow.listS( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "OR" ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalConcept" ) ), module0128
        .f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalPred-Inverse" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "TEST" ), (SubLObject) SubLObjectFactory
            .makeSymbol( "FORT-P" ) ), (SubLObject) SubLObjectFactory.makeKeyword( "ANYTHING" ) );
    $ic121$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SecondFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "DayFn" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "MonthFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "YearFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "CenturyFn" ) ) );
    $ic122$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "preferredEnglish" ) );
    $ic123$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "specialIsa" ) );
    $ic124$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:FunctionalProperty" ) ) );
    $ic125$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:InverseFunctionalProperty" ) ) );
    $ic126$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "StrictlyFunctionalSlot" ) );
    $ic127$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "argCardinality" ) );
    $ic128$ = ConsesLow.list( (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.ONE_INTEGER );
    $ic129$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "strictlyFunctionalInArgs" ) );
    $ic130$ = ConsesLow.list( (SubLObject) module0711.TWO_INTEGER );
    $ic131$ = ConsesLow.list( (SubLObject) module0711.ONE_INTEGER, (SubLObject) module0711.ONE_INTEGER );
    $ic132$ = ConsesLow.list( (SubLObject) module0711.ONE_INTEGER );
    $ic133$ = SubLObjectFactory.makeSymbol( "S#47656", "CYC" );
    $ic134$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "rdfs:subClassOf" ) );
    $ic135$ = SubLObjectFactory.makeSymbol( "S#15753", "CYC" );
    $ic136$ = SubLObjectFactory.makeSymbol( "S#47660", "CYC" );
    $ic137$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Individual" ) );
    $ic138$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "rdfURI" ) );
    $ic139$ = SubLObjectFactory.makeSymbol( "FIRST" );
    $ic140$ = SubLObjectFactory.makeString( "unexpected owl-cycl-pred for asent ~s" );
    $ic141$ = SubLObjectFactory.makeString( "Caught error ~S~% while trying to OWL-cyclify~% ~S" );
    $ic142$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#717", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#4566", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#154", "CYC" ) );
    $ic143$ = SubLObjectFactory.makeString( "subject" );
    $ic144$ = SubLObjectFactory.makeString( "predicate" );
    $ic145$ = SubLObjectFactory.makeString( "object" );
    $ic146$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic147$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLPredicateFn" ) );
    $ic148$ = SubLObjectFactory.makeSymbol( "S#47601", "CYC" );
    $ic149$ = SubLObjectFactory.makeSymbol( "S#47649", "CYC" );
    $ic150$ = SubLObjectFactory.makeString( "Invalid term type: ~S for ~S~%Export default namespace = ~S" );
    $ic151$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLTermOfTypeFn" ) );
    $ic152$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLIntersectionFn" ) );
    $ic153$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLURIFn" ) );
    $ic154$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLDatatypeFn" ) );
    $ic155$ = SubLObjectFactory.makeString( "Unexpected EL formula arg2: ~S" );
    $ic156$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47803", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47804", "CYC" ) );
    $ic157$ = SubLObjectFactory.makeString( "Raw term string for ~S: ~S" );
    $ic158$ = SubLObjectFactory.makeString( "Need XSD datatype for ~S" );
    $ic159$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SecondFn" ) );
    $ic160$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "DayFn" ) );
    $ic161$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "MonthFn" ) );
    $ic162$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "YearFn" ) );
    $ic163$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "CenturyFn" ) );
    $ic164$ = SubLObjectFactory.makeString( "xsd" );
    $ic165$ = SubLObjectFactory.makeString( "integer" );
    $ic166$ = SubLObjectFactory.makeString( "decimal" );
    $ic167$ = SubLObjectFactory.makeString( "date" );
    $ic168$ = SubLObjectFactory.makeString( "timeInstant" );
    $ic169$ = SubLObjectFactory.makeString( "Don't know XSD datatype for ~S" );
    $ic170$ = SubLObjectFactory.makeString( "YYYY-MM-DD" );
    $ic171$ = SubLObjectFactory.makeString( "YYYY-MM" );
    $ic172$ = SubLObjectFactory.makeString( "YYYY" );
    $ic173$ = SubLObjectFactory.makeString( "YYYY-MM-DDTHH:MM:SS" );
    $ic174$ = SubLObjectFactory.makeString( "&" );
    $ic175$ = SubLObjectFactory.makeString( ";" );
    $ic176$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URIWithFragmentFn" ) ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URIInNamespaceFn" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "URIFn" ) ) );
    $ic177$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UniformResourceIdentifier" ) );
    $ic178$ = SubLObjectFactory.makeSymbol( "S#47678", "CYC" );
    $ic179$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URIFn" ) );
    $ic180$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URIInNamespaceFn" ) );
    $ic181$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URIWithFragmentFn" ) );
    $ic182$ = SubLObjectFactory.makeString( "#" );
    $ic183$ = SubLObjectFactory.makeSymbol( "?URI-STRING" );
    $ic184$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "uriString" ) );
    $ic185$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "?URI-STRING" ) );
    $ic186$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "MAX-NUMBER" ), (SubLObject) module0711.ONE_INTEGER );
    $ic187$ = SubLObjectFactory.makeString( "Can't convert URI FORT to string: ~S" );
    $ic188$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "comment" ) ) );
    $ic189$ = SubLObjectFactory.makeSymbol( "S#47684", "CYC" );
    $ic190$ = SubLObjectFactory.makeSymbol( "S#42887", "CYC" );
    $ic191$ = SubLObjectFactory.makeString( "TagToTip('" );
    $ic192$ = SubLObjectFactory.makeString( "')" );
    $ic193$ = SubLObjectFactory.makeString( "UnTip()" );
    $ic194$ = SubLObjectFactory.makeString( "owl_cyc_constant_tooltip" );
    $ic195$ = SubLObjectFactory.makeString( "display: none;" );
    $ic196$ = SubLObjectFactory.makeString( "comment_header" );
    $ic197$ = SubLObjectFactory.makeString( "ID: ~A" );
    $ic198$ = SubLObjectFactory.makeString( "comment_body" );
    $ic199$ = SubLObjectFactory.makeString( "cyc_term" );
    $ic200$ = SubLObjectFactory.makeSymbol( "S#42888", "CYC" );
    $ic201$ = SubLObjectFactory.makeString( "No comment." );
    $ic202$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationToFn" ) );
    $ic203$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationToTypeFn" ) );
    $ic204$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationFromFn" ) );
    $ic205$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "SubcollectionOfWithRelationFromTypeFn" ) );
    $ic206$ = SubLObjectFactory.makeString( "Couldn't find inverse of ~S" );
    $ic207$ = SubLObjectFactory.makeString( "unexpected subcollection function ~s" );
    $ic208$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:intersectionOf" ) );
    $ic209$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLRestrictionFn" ) );
    $ic210$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:onProperty" ) );
    $ic211$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:hasValue" ) );
    $ic212$ = SubLObjectFactory.makeSymbol( "?PRED" );
    $ic213$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "and" ) );
    $ic214$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "genlInverse" ) );
    $ic215$ = SubLObjectFactory.makeSymbol( "S#47690", "CYC" );
    $ic216$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "BinaryPredicate" ) );
    $ic217$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "BinaryPredicate" ) ) );
    $ic218$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UniversalVocabularyMt" ) );
    $ic219$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "InverseBinaryPredicateFn" ) );
    $ic220$ = SubLObjectFactory.makeString( "~&Created ~S~%" );
    $ic221$ = SubLObjectFactory.makeSymbol( "BINARY-PREDICATE?" );
    $ic222$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "ANSWER-LANGUAGE" ), (SubLObject) SubLObjectFactory.makeKeyword( "HL" ), (SubLObject) SubLObjectFactory.makeKeyword( "MAX-NUMBER" ),
        (SubLObject) module0711.ONE_INTEGER, (SubLObject) SubLObjectFactory.makeKeyword( "INFERENCE-MODE" ), (SubLObject) SubLObjectFactory.makeKeyword( "SHALLOW" ) );
    $ic223$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47805", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "CLASS" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol(
        "S#47806", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47807", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#137", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47808", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#132", "CYC" ) ) );
    $ic224$ = SubLObjectFactory.makeString( "owl:Restriction" );
    $ic225$ = SubLObjectFactory.makeString( "owl:onProperty" );
    $ic226$ = SubLObjectFactory.makeString( "owl:hasValue" );
    $ic227$ = SubLObjectFactory.makeString( "Statement" );
    $ic228$ = SubLObjectFactory.makeString( "Description" );
    $ic229$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "Collection" ) );
    $ic230$ = SubLObjectFactory.makeSymbol( "S#47698", "CYC" );
    $ic231$ = SubLObjectFactory.makeSymbol( "CONSTANT-P" );
    $ic232$ = SubLObjectFactory.makeSymbol( "ATOMIC-SENTENCE-PREDICATE" );
    $ic233$ = SubLObjectFactory.makeSymbol( "ATOMIC-SENTENCE-ARG2" );
    $ic234$ = SubLObjectFactory.makeKeyword( "CYC-PPH" );
    $ic235$ = SubLObjectFactory.makeSymbol( "WITH-PPH-MEMOIZATION" );
    $ic236$ = SubLObjectFactory.makeSymbol( "PROGN" );
    $ic237$ = SubLObjectFactory.makeString( "type" );
    $ic238$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47809", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47810", "CYC" ) );
    $ic239$ = ConsesLow.list( (SubLObject) module0711.TWO_INTEGER, (SubLObject) module0711.THREE_INTEGER );
    $ic240$ = SubLObjectFactory.makeSymbol( "INDEXED-TERM-P" );
    $ic241$ = SubLObjectFactory.makeSymbol( "S#12275", "CYC" );
    $ic242$ = SubLObjectFactory.makeString( "_" );
    $ic243$ = SubLObjectFactory.makeSymbol( "S#47707", "CYC" );
    $ic244$ = ConsesLow.list( (SubLObject) Characters.CHAR_dollar, (SubLObject) Characters.CHAR_underbar, (SubLObject) Characters.CHAR_colon );
    $ic245$ = SubLObjectFactory.makeSymbol( "S#13758", "CYC" );
    $ic246$ = SubLObjectFactory.makeString( "unexpected term ~s" );
    $ic247$ = SubLObjectFactory.makeKeyword( "PREFERRED-NAME" );
    $ic248$ = SubLObjectFactory.makeInteger( 60 );
    $ic249$ = SubLObjectFactory.makeInteger( 30 );
    $ic250$ = SubLObjectFactory.makeString( "Timed out generating phrases for ~S.~% Phrases generated: ~S" );
    $ic251$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47811", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47547", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47804", "CYC" ) );
    $ic252$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "synonymousExternalPred-Inverse" ) );
    $ic253$ = ConsesLow.list( (SubLObject) Characters.CHAR_colon );
    $ic254$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#10299", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47804", "CYC" ) );
    $ic255$ = SubLObjectFactory.makeSymbol( "S#47722", "CYC" );
    $ic256$ = SubLObjectFactory.makeKeyword( "X" );
    $ic257$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "MAX-NUMBER" ), (SubLObject) module0711.ONE_INTEGER, (SubLObject) SubLObjectFactory.makeKeyword( "ANSWER-LANGUAGE" ),
        (SubLObject) SubLObjectFactory.makeKeyword( "HL" ), (SubLObject) SubLObjectFactory.makeKeyword( "INFERENCE-MODE" ), (SubLObject) SubLObjectFactory.makeKeyword( "MINIMAL" ) );
    $ic258$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "nameSpacePrefixForSKS" ) );
    $ic259$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "standardPrefixForURI" ) );
    $ic260$ = SubLObjectFactory.makeString( "Couldn't find expansion for ~S wrt ~S" );
    $ic261$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "owl:inverseOf" ) );
    $ic262$ = SubLObjectFactory.makeString( "Can't get URI from non-FORT ontology ~S" );
    $ic263$ = SubLObjectFactory.makeString( "Can't get URI from non-string local name ~S" );
    $ic264$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeString( "#" ), (SubLObject) SubLObjectFactory.makeString( "/" ) );
    $ic265$ = SubLObjectFactory.makeString( "http://www.w3.org/2006/03/wn/wn20/instances" );
    $ic266$ = SubLObjectFactory.makeSymbol( "S#47726", "CYC" );
    $ic267$ = SubLObjectFactory.makeString( "Couldn't find URI for ~S." );
    $ic268$ = ConsesLow.list( (SubLObject) ConsesLow.cons( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "FOAFOntology" ) ), (SubLObject) SubLObjectFactory.makeString( "http://xmlns.com/foaf/0.1/" ) ) );
    $ic269$ = SubLObjectFactory.makeSymbol( "S#47728", "CYC" );
    $ic270$ = SubLObjectFactory.makeKeyword( "URI" );
    $ic271$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "salientURI" ) );
    $ic272$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "URI" ) );
    $ic273$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "OR" ), module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "URLFn" ) ), module0128.f8479(
        (SubLObject) SubLObjectFactory.makeString( "URIFn" ) ) ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "AND" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword(
            "TEST" ), (SubLObject) SubLObjectFactory.makeSymbol( "STRINGP" ) ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "BIND" ), (SubLObject) SubLObjectFactory.makeSymbol(
                "STRING" ) ) ) );
    $ic274$ = SubLObjectFactory.makeSymbol( "STRING" );
    $ic275$ = SubLObjectFactory.makeSymbol( "S#47730", "CYC" );
    $ic276$ = SubLObjectFactory.makeString( " " );
    $ic277$ = SubLObjectFactory.makeSymbol( "S#47734", "CYC" );
    $ic278$ = SubLObjectFactory.makeSymbol( "DOUBLE-FLOAT" );
    $ic279$ = SubLObjectFactory.makeString( "(" );
    $ic280$ = SubLObjectFactory.makeString( "#<(" );
    $ic281$ = SubLObjectFactory.makeString( ")" );
    $ic282$ = SubLObjectFactory.makeString( ")>" );
    $ic283$ = SubLObjectFactory.makeString( "#$" );
    $ic284$ = SubLObjectFactory.makeString( "&u" );
    $ic285$ = SubLObjectFactory.makeString( "</" );
    $ic286$ = SubLObjectFactory.makeSymbol( "S#47742", "CYC" );
    $ic287$ = SubLObjectFactory.makeSymbol( "S#47743", "CYC" );
    $ic288$ = ConsesLow.list( (SubLObject) Characters.CHAR_question, (SubLObject) Characters.CHAR_comma, (SubLObject) Characters.CHAR_lbrace, (SubLObject) Characters.CHAR_rbrace, (SubLObject) Characters.CHAR_hash );
    $ic289$ = ConsesLow.list( new SubLObject[] { Characters.CHAR_hyphen, Characters.CHAR_space, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_backquote, Characters.CHAR_backslash,
      Characters.CHAR_colon, Characters.CHAR_slash, Characters.CHAR_semicolon, Characters.CHAR_percent, Characters.CHAR_less, Characters.CHAR_greater, Characters.CHAR_ampersand, Characters.CHAR_dollar,
      Characters.CHAR_lparen, Characters.CHAR_rparen, Characters.CHAR_lbrace, Characters.CHAR_rbrace, Characters.CHAR_exclamation, Characters.CHAR_at, Characters.CHAR_caret, Characters.CHAR_period
    } );
    $ic290$ = SubLObjectFactory.makeString( "HTML tags not stripped from ~s" );
    $ic291$ = SubLObjectFactory.makeSymbol( "S#47746", "CYC" );
    $ic292$ = SubLObjectFactory.makeInteger( 26 );
    $ic293$ = SubLObjectFactory.makeString( "ID ~S for ~S is suspiciously short (~D characters)" );
    $ic294$ = SubLObjectFactory.makeInteger( 256 );
    $ic295$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "plural" ) ) );
    $ic296$ = ConsesLow.list( module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "singular" ) ) );
    $ic297$ = SubLObjectFactory.makeKeyword( "DEFAULT" );
    $ic298$ = SubLObjectFactory.makeSymbol( "S#47751", "CYC" );
    $ic299$ = SubLObjectFactory.makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic300$ = SubLObjectFactory.makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic301$ = SubLObjectFactory.makeSymbol( "PPH-PRECISION-P" );
    $ic302$ = SubLObjectFactory.makeKeyword( "NONE" );
    $ic303$ = SubLObjectFactory.makeString( "fake pretty string" );
    $ic304$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "prettyString-Canonical" ) );
    $ic305$ = ConsesLow.list( (SubLObject) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeString( "/cyc/projects/opencyc/owl-export/mappings/umbel_subject_concepts_latest.csv" ), (SubLObject) SubLObjectFactory
        .makeString( "http://umbel.org/umbel/sc/" ) ), (SubLObject) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeString( "/cyc/projects/opencyc/owl-export/mappings/umbel_abstract_concepts_latest.csv" ),
            (SubLObject) SubLObjectFactory.makeString( "http://umbel.org/umbel/ac/" ) ) );
    $ic306$ = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#2813", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#46900", "CYC" ) );
    $ic307$ = SubLObjectFactory.makeKeyword( "INPUT" );
    $ic308$ = SubLObjectFactory.makeString( "\"" );
    $ic309$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#47812", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#47813", "CYC" ) );
    $ic310$ = SubLObjectFactory.makeString( "sc" );
    $ic311$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "umbelSubjectConceptName" ) );
    $ic312$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "umbelAbstractConceptName" ) );
    $ic313$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "MappingMtFn" ) );
    $ic314$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "OWLOntologyFn" ) );
    $ic315$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UMBELSubjectConceptNamespace" ) );
    $ic316$ = module0128.f8479( (SubLObject) SubLObjectFactory.makeString( "UMBELAbstractConceptNamespace" ) );
  }
}
/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/module0711.class Total time: 1749 ms
 * 
 * Decompiled with Procyon 0.5.32.
 */