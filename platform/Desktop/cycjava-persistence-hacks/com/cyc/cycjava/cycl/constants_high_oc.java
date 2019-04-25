package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constants_high_oc extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constants_high_oc";
  public static final String myFingerPrint = "8e677c146b898dd2dd71358e4872bfe8ed60127e65e5c38f48f175027852b287";
  private static SubLSymbol $g2179$;
  public static SubLSymbol $g2180$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLSymbol $ic2$;
  private static final SubLList $ic3$;
  private static final SubLString $ic4$;
  private static final SubLList $ic5$;
  private static final SubLList $ic6$;
  private static final SubLSymbol $ic7$;
  private static final SubLSymbol $ic8$;
  private static final SubLString $ic9$;
  private static final SubLList $ic10$;
  private static final SubLString $ic11$;
  private static final SubLString $ic12$;
  private static final SubLSymbol $ic13$;
  private static final SubLList $ic14$;
  private static final SubLString $ic15$;
  private static final SubLList $ic16$;
  private static final SubLString $ic17$;
  private static final SubLSymbol $ic18$;
  private static final SubLSymbol $ic19$;
  private static final SubLString $ic20$;
  private static final SubLString $ic21$;
  private static final SubLSymbol $ic22$;
  private static final SubLSymbol $ic23$;
  private static final SubLList $ic24$;
  private static final SubLString $ic25$;
  private static final SubLList $ic26$;
  private static final SubLList $ic27$;
  private static final SubLSymbol $ic28$;
  private static final SubLList $ic29$;
  private static final SubLString $ic30$;
  private static final SubLList $ic31$;
  private static final SubLSymbol $ic32$;
  private static final SubLString $ic33$;
  private static final SubLSymbol $ic34$;
  private static final SubLSymbol $ic35$;
  private static final SubLSymbol $ic36$;
  private static final SubLList $ic37$;
  private static final SubLString $ic38$;
  private static final SubLList $ic39$;
  private static final SubLSymbol $ic40$;
  private static final SubLString $ic41$;
  private static final SubLList $ic42$;
  private static final SubLSymbol $ic43$;
  private static final SubLSymbol $ic44$;
  private static final SubLList $ic45$;
  private static final SubLString $ic46$;
  private static final SubLList $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLString $ic49$;
  private static final SubLList $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLList $ic52$;
  private static final SubLString $ic53$;
  private static final SubLList $ic54$;
  private static final SubLSymbol $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLList $ic57$;
  private static final SubLString $ic58$;
  private static final SubLList $ic59$;
  private static final SubLList $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLList $ic62$;
  private static final SubLString $ic63$;
  private static final SubLList $ic64$;
  private static final SubLList $ic65$;
  private static final SubLSymbol $ic66$;
  private static final SubLList $ic67$;
  private static final SubLList $ic68$;
  private static final SubLSymbol $ic69$;
  private static final SubLString $ic70$;
  private static final SubLSymbol $ic71$;
  private static final SubLString $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLString $ic74$;
  private static final SubLSymbol $ic75$;
  private static final SubLSymbol $ic76$;
  private static final SubLList $ic77$;
  private static final SubLString $ic78$;
  private static final SubLInteger $ic79$;
  private static final SubLSymbol $ic80$;
  private static final SubLSymbol $ic81$;
  private static final SubLString $ic82$;
  private static final SubLSymbol $ic83$;
  private static final SubLList $ic84$;
  private static final SubLSymbol $ic85$;
  private static final SubLList $ic86$;

  public static SubLObject f10733(final SubLObject var1, SubLObject var2)
  {
    if( var2 == UNPROVIDED )
    {
      var2 = NIL;
    }
    assert NIL != module0126.f8391( var1 ) : var1;
    if( NIL != var2 && !areAssertionsDisabledFor( me ) && NIL == f10734( var2 ) )
    {
      throw new AssertionError( var2 );
    }
    if( NIL == var2 )
    {
      var2 = f10735();
    }
    SubLObject var3 = NIL;
    var3 = module0163.f10653( var1, var2 );
    return var3;
  }

  public static SubLObject f10736(final SubLObject var1, SubLObject var2)
  {
    if( var2 == UNPROVIDED )
    {
      var2 = NIL;
    }
    assert NIL != Types.stringp( var1 ) : var1;
    final SubLObject var3 = f10737( var1 );
    if( NIL != f10738( var3 ) )
    {
      return var3;
    }
    return f10733( var1, var2 );
  }

  public static SubLObject f10739(final SubLObject var5, SubLObject var6)
  {
    if( var6 == UNPROVIDED )
    {
      var6 = $ic11$;
    }
    assert NIL != Types.stringp( var5 ) : var5;
    final SubLObject var7 = module0126.f8395( PrintLow.format( NIL, $ic12$, var6, var5 ), UNPROVIDED );
    final SubLObject var8 = f10733( var7, UNPROVIDED );
    return var8;
  }

  public static SubLObject f10740(final SubLObject var7, SubLObject var6, SubLObject var8, SubLObject var9, SubLObject var10, SubLObject var11)
  {
    if( var6 == UNPROVIDED )
    {
      var6 = $ic17$;
    }
    if( var8 == UNPROVIDED )
    {
      var8 = $ic17$;
    }
    if( var9 == UNPROVIDED )
    {
      var9 = $ic18$;
    }
    if( var10 == UNPROVIDED )
    {
      var10 = T;
    }
    if( var11 == UNPROVIDED )
    {
      var11 = NIL;
    }
    SubLObject var12 = NIL;
    SubLObject var13 = NIL;
    try
    {
      var13 = streams_high.make_private_string_output_stream();
      final SubLObject var14 = module0039.f3051( var7 );
      SubLObject var15_16;
      SubLObject var15;
      SubLObject var16;
      SubLObject var17;
      SubLObject var18;
      for( var15 = ( var15_16 = Sequences.length( var14 ) ), var16 = NIL, var16 = ZERO_INTEGER; !var16.numGE( var15_16 ); var16 = module0048.f_1X( var16 ) )
      {
        var17 = Strings.sublisp_char( var14, var16 );
        var18 = module0126.f8387( var17 );
        if( var17.eql( Characters.CHAR_space ) )
        {
          var9 = $ic18$;
        }
        else if( NIL != var18 && var9 == $ic18$ )
        {
          print_high.princ( Characters.char_upcase( var17 ), var13 );
          var9 = NIL;
        }
        else if( NIL != var18 && var9 == $ic19$ )
        {
          print_high.princ( Characters.char_downcase( var17 ), var13 );
          var9 = NIL;
        }
        else if( NIL != var18 )
        {
          print_high.princ( var17, var13 );
        }
      }
      var12 = streams_high.get_output_stream_string( var13 );
    }
    finally
    {
      final SubLObject var19 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        streams_high.close( var13, UNPROVIDED );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, var19 );
      }
    }
    if( var12.equalp( $ic20$ ) )
    {
      var12 = $ic21$;
    }
    var12 = Sequences.cconcatenate( var6, new SubLObject[] { var12, var8
    } );
    if( NIL != var10 )
    {
      var12 = module0126.f8395( var12, var11 );
    }
    return var12;
  }

  public static SubLObject f10741(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    f10742( var4 );
    if( NIL != module0342.f23111( var4 ) )
    {
      return var4;
    }
    return module0163.f10656( var4 );
  }

  public static SubLObject f10742(final SubLObject var4)
  {
    final SubLThread var5 = SubLProcess.currentSubLThread();
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    final SubLObject var6 = module0123.$g1493$.currentBinding( var5 );
    try
    {
      module0123.$g1493$.bind( ConsesLow.cons( var4, module0123.$g1493$.getDynamicValue( var5 ) ), var5 );
      if( NIL != module0210.f13582( var4, T, T ) )
      {
        module0287.f19235( var4, UNPROVIDED );
      }
      if( NIL != module0131.f8563() && NIL != module0324.f21952( var4 ) )
      {
        module0327.f22135( var4 );
      }
      module0172.f10928( var4 );
      module0617.f37867( var4 );
      module0217.f14370( var4 );
      module0183.f11626( var4 );
      module0549.f33953( var4 );
    }
    finally
    {
      module0123.$g1493$.rebind( var6, var5 );
    }
    return NIL;
  }

  public static SubLObject f10737(final SubLObject var1)
  {
    assert NIL != Types.stringp( var1 ) : var1;
    return module0163.f10657( var1 );
  }

  public static SubLObject f10743(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    return module0163.f10658( var4 );
  }

  public static SubLObject f10744(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    return ( NIL != constant_handles_oc.f8462( var4 ) ) ? module0163.f10660( var4 ) : NIL;
  }

  public static SubLObject f10745(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    return ( NIL != constant_handles_oc.f8462( var4 ) ) ? module0163.f10661( var4 ) : NIL;
  }

  public static SubLObject f10746(final SubLObject var22)
  {
    assert NIL != Guids.guid_p( var22 ) : var22;
    return module0163.f10659( var22 );
  }

  public static SubLObject f10747(final SubLObject var23)
  {
    assert NIL != Guids.guid_string_p( var23 ) : var23;
    return f10746( Guids.string_to_guid( var23 ) );
  }

  public static SubLObject f10748(final SubLObject var4, final SubLObject var24)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    assert NIL != Types.stringp( var24 ) : var24;
    return module0163.f10662( var4, var24 );
  }

  public static SubLObject f10749(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    return constant_handles_oc.f8440( var4 );
  }

  public static SubLObject f10750(final SubLObject var2)
  {
    final SubLObject var3 = f10751( var2 );
    return ( NIL != var3 ) ? f10749( var3 ) : NIL;
  }

  public static SubLObject f10752(final SubLObject var25)
  {
    assert NIL != f10753( var25 ) : var25;
    return constant_handles_oc.f8486( var25 );
  }

  public static SubLObject f10753(final SubLObject var26)
  {
    return Types.integerp( var26 );
  }

  public static SubLObject f10754(final SubLObject var27, final SubLObject var28)
  {
    final SubLObject var29 = constant_handles_oc.f8440( var27 );
    final SubLObject var30 = constant_handles_oc.f8440( var28 );
    if( NIL != var29 && NIL != var30 )
    {
      return Numbers.numL( var29, var30 );
    }
    if( NIL == var29 && NIL == var30 )
    {
      return NIL;
    }
    return Types.sublisp_null( var29 );
  }

  public static SubLObject f10738(final SubLObject var26)
  {
    return constant_handles_oc.f8461( var26 );
  }

  public static SubLObject f10755(final SubLObject var26)
  {
    return SubLObjectFactory.makeBoolean( NIL != constant_handles_oc.f8449( var26 ) && NIL == f10738( var26 ) );
  }

  public static SubLObject f10756()
  {
    return constant_handles_oc.f8436();
  }

  public static SubLObject f10757(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    return f10744( var4 );
  }

  public static SubLObject f10758(final SubLObject var31)
  {
    final SubLObject var32 = f10752( var31 );
    return ( NIL != constant_handles_oc.f8449( var32 ) ) ? f10743( var32 ) : NIL;
  }

  public static SubLObject f10751(final SubLObject var2)
  {
    assert NIL != f10734( var2 ) : var2;
    return f10746( var2 );
  }

  public static SubLObject f10734(final SubLObject var26)
  {
    return Guids.guid_p( var26 );
  }

  public static SubLObject f10759(final SubLObject var4, final SubLObject var2)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    assert NIL != f10734( var2 ) : var2;
    final SubLObject var5 = f10744( var4 );
    return Guids.guidE( var5, var2 );
  }

  public static SubLObject f10760(final SubLObject var27, final SubLObject var28)
  {
    final SubLObject var29 = f10744( var27 );
    final SubLObject var30 = f10744( var28 );
    if( NIL != var29 && NIL != var30 )
    {
      return Guids.guidL( var29, var30 );
    }
    if( NIL == var29 && NIL == var30 )
    {
      return NIL;
    }
    return Types.sublisp_null( var29 );
  }

  public static SubLObject f10761(final SubLObject var34)
  {
    assert NIL != Types.listp( var34 ) : var34;
    SubLObject var35 = NIL;
    SubLObject var36 = NIL;
    SubLObject var37 = var34;
    SubLObject var38 = NIL;
    var38 = var37.first();
    while ( NIL != var37)
    {
      var36 = f10751( Guids.string_to_guid( var38 ) );
      if( NIL != var36 )
      {
        var35 = ConsesLow.cons( ConsesLow.list( var38, f10743( var36 ) ), var35 );
      }
      else
      {
        var35 = ConsesLow.cons( NIL, var35 );
      }
      var37 = var37.rest();
      var38 = var37.first();
    }
    return Sequences.nreverse( var35 );
  }

  public static SubLObject f10762(final SubLObject var37)
  {
    assert NIL != Types.listp( var37 ) : var37;
    SubLObject var38 = NIL;
    SubLObject var39 = NIL;
    SubLObject var40 = var37;
    SubLObject var41 = NIL;
    var41 = var40.first();
    while ( NIL != var40)
    {
      var39 = f10737( var41 );
      if( NIL != var39 )
      {
        var38 = ConsesLow.cons( ConsesLow.list( f10744( var39 ), f10743( var39 ) ), var38 );
      }
      else
      {
        var38 = ConsesLow.cons( NIL, var38 );
      }
      var40 = var40.rest();
      var41 = var40.first();
    }
    return Sequences.nreverse( var38 );
  }

  public static SubLObject f10735()
  {
    return f10763();
  }

  public static SubLObject f10764()
  {
    return f10735();
  }

  public static SubLObject f10763()
  {
    return Guids.new_guid();
  }

  public static SubLObject f10765(final SubLObject var39)
  {
    assert NIL != f10766( var39 ) : var39;
    SubLObject var41;
    final SubLObject var40 = var41 = $g2179$.getGlobalValue();
    SubLObject var42 = NIL;
    SubLObject var43 = NIL;
    SubLObject var44 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var41, var40, $ic67$ );
    var42 = var41.first();
    var41 = var41.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var41, var40, $ic67$ );
    var43 = var41.first();
    var41 = var41.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var41, var40, $ic67$ );
    var44 = var41.first();
    var41 = var41.rest();
    if( NIL == var41 )
    {
      return Guids.make_date_relative_guid( var44, var42, var43, var39 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var40, $ic67$ );
    return NIL;
  }

  public static SubLObject f10767(final SubLObject var22)
  {
    final SubLThread var23 = SubLProcess.currentSubLThread();
    assert NIL != Guids.guid_p( var22 ) : var22;
    if( NIL != Guids.date_relative_guid_p( var22 ) )
    {
      var23.resetMultipleValues();
      final SubLObject var24 = Guids.crack_date_relative_guid( var22 );
      final SubLObject var25 = var23.secondMultipleValue();
      final SubLObject var26 = var23.thirdMultipleValue();
      final SubLObject var27 = var23.fourthMultipleValue();
      var23.resetMultipleValues();
      SubLObject var29;
      final SubLObject var28 = var29 = $g2179$.getGlobalValue();
      SubLObject var30 = NIL;
      SubLObject var31 = NIL;
      SubLObject var32 = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var29, var28, $ic68$ );
      var30 = var29.first();
      var29 = var29.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var29, var28, $ic68$ );
      var31 = var29.first();
      var29 = var29.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var29, var28, $ic68$ );
      var32 = var29.first();
      var29 = var29.rest();
      if( NIL == var29 )
      {
        if( var32.numE( var24 ) && var30.numE( var25 ) && var31.numE( var26 ) )
        {
          return var27;
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var28, $ic68$ );
      }
    }
    return NIL;
  }

  public static SubLObject f10768(final SubLObject var4)
  {
    return f10767( f10744( var4 ) );
  }

  public static SubLObject f10769(final SubLObject var39)
  {
    return f10746( f10765( var39 ) );
  }

  public static SubLObject f10766(final SubLObject var26)
  {
    return Types.integerp( var26 );
  }

  public static SubLObject f10770(final SubLObject var4)
  {
    return SubLObjectFactory.makeBoolean( NIL != constant_handles_oc.f8449( var4 ) && $ic69$ == f10743( var4 ) );
  }

  public static SubLObject f10771(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    final SubLObject var5 = module0038.f2702( Characters.CHAR_colon, f10743( var4 ), UNPROVIDED );
    if( NIL != var5 )
    {
      return Sequences.subseq( f10743( var4 ), ZERO_INTEGER, var5 );
    }
    return $ic70$;
  }

  public static SubLObject f10772(final SubLObject var4)
  {
    assert NIL != constant_handles_oc.f8449( var4 ) : var4;
    final SubLObject var5 = module0038.f2702( Characters.CHAR_colon, f10743( var4 ), UNPROVIDED );
    if( NIL != var5 )
    {
      return Sequences.subseq( f10743( var4 ), Numbers.add( var5, ONE_INTEGER ), UNPROVIDED );
    }
    return f10743( var4 );
  }

  public static SubLObject f10773(SubLObject var54)
  {
    if( var54 == UNPROVIDED )
    {
      var54 = Symbols.symbol_function( $ic75$ );
    }
    if( constant_handles_oc.f8433().numG( ZERO_INTEGER ) )
    {
      final SubLObject var55 = constant_handles_oc.f8435();
      SubLObject var56;
      SubLObject var57;
      for( var56 = NIL; NIL == var56; var56 = var57 )
      {
        var57 = constant_handles_oc.f8486( random.random( var55 ) );
        if( NIL != var57 && NIL != Functions.funcall( var54, var57 ) )
        {
        }
      }
      return var56;
    }
    return NIL;
  }

  public static SubLObject f10774(SubLObject var58, SubLObject var59, SubLObject var54)
  {
    if( var58 == UNPROVIDED )
    {
      var58 = $ic79$;
    }
    if( var59 == UNPROVIDED )
    {
      var59 = NIL;
    }
    if( var54 == UNPROVIDED )
    {
      var54 = Symbols.symbol_function( $ic75$ );
    }
    assert NIL != module0004.f106( var58 ) : var58;
    if( NIL != var59 )
    {
      SubLObject var60 = NIL;
      SubLObject var61;
      for( var61 = NIL, var61 = ZERO_INTEGER; var61.numL( var58 ); var61 = Numbers.add( var61, ONE_INTEGER ) )
      {
        var60 = ConsesLow.cons( f10773( var54 ), var60 );
      }
      return var60;
    }
    SubLObject var60;
    for( var60 = module0032.f1726( var58, Symbols.symbol_function( EQL ) ); module0032.f1728( var60 ).numL( var58 ); var60 = module0032.f1736( f10773( var54 ), var60, Symbols.symbol_function(
        EQL ) ) )
    {
    }
    return module0032.f1753( var60 );
  }

  public static SubLObject f10775(final SubLObject var61, SubLObject var62, SubLObject var63)
  {
    if( var62 == UNPROVIDED )
    {
      var62 = NIL;
    }
    if( var63 == UNPROVIDED )
    {
      var63 = NIL;
    }
    final SubLThread var64 = SubLProcess.currentSubLThread();
    assert NIL != module0024.f1254( var61 ) : var61;
    SubLObject var65 = NIL;
    var64.resetMultipleValues();
    final SubLObject var66 = module0024.f1251( var61, var62 );
    final SubLObject var67 = var64.secondMultipleValue();
    final SubLObject var68 = var64.thirdMultipleValue();
    final SubLObject var69 = var64.fourthMultipleValue();
    var64.resetMultipleValues();
    try
    {
      if( NIL == module0024.f1253( var66 ) )
      {
        Errors.error( $ic82$, new SubLObject[] { var67, var69, var61, var68
        } );
      }
      var65 = f10776( var66, var63 );
    }
    finally
    {
      final SubLObject var70 = Threads.$is_thread_performing_cleanupP$.currentBinding( var64 );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, var64 );
        if( NIL != module0024.f1253( var66 ) )
        {
          module0024.f1257( var66 );
        }
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( var70, var64 );
      }
    }
    return var65;
  }

  public static SubLObject f10776(final SubLObject var65, SubLObject var63)
  {
    if( var63 == UNPROVIDED )
    {
      var63 = NIL;
    }
    SubLObject var66 = NIL;
    final SubLObject var67 = constant_handles_oc.f8425();
    if( NIL == module0065.f4772( var67, $ic83$ ) )
    {
      final SubLObject var70_71 = var67;
      if( NIL == module0065.f4775( var70_71, $ic83$ ) )
      {
        final SubLObject var68 = module0065.f4740( var70_71 );
        final SubLObject var69 = NIL;
        SubLObject var70;
        SubLObject var71;
        SubLObject var72;
        SubLObject var73;
        for( var70 = Sequences.length( var68 ), var71 = NIL, var71 = ZERO_INTEGER; var71.numL( var70 ); var71 = Numbers.add( var71, ONE_INTEGER ) )
        {
          var72 = ( ( NIL != var69 ) ? Numbers.subtract( var70, var71, ONE_INTEGER ) : var71 );
          var73 = Vectors.aref( var68, var72 );
          if( NIL == module0065.f4749( var73 ) || NIL == module0065.f4773( $ic83$ ) )
          {
            if( NIL != module0065.f4749( var73 ) )
            {
              var73 = $ic83$;
            }
            if( NIL != module0035.sublisp_boolean( module0045.f3139( var65, f10743( var73 ), var63, NIL, UNPROVIDED, UNPROVIDED ) ) )
            {
              var66 = ConsesLow.cons( var73, var66 );
            }
          }
        }
      }
      final SubLObject var77_78 = var67;
      if( NIL == module0065.f4777( var77_78 ) || NIL == module0065.f4773( $ic83$ ) )
      {
        final SubLObject var74 = module0065.f4738( var77_78 );
        SubLObject var75 = module0065.f4739( var77_78 );
        final SubLObject var76 = module0065.f4734( var77_78 );
        final SubLObject var77 = ( NIL != module0065.f4773( $ic83$ ) ) ? NIL : $ic83$;
        while ( var75.numL( var76 ))
        {
          final SubLObject var78 = Hashtables.gethash_without_values( var75, var74, var77 );
          if( ( NIL == module0065.f4773( $ic83$ ) || NIL == module0065.f4749( var78 ) ) && NIL != module0035.sublisp_boolean( module0045.f3139( var65, f10743( var78 ), var63, NIL,
              UNPROVIDED, UNPROVIDED ) ) )
          {
            var66 = ConsesLow.cons( var78, var66 );
          }
          var75 = Numbers.add( var75, ONE_INTEGER );
        }
      }
    }
    return Sequences.nreverse( var66 );
  }

  public static SubLObject f10777(final SubLObject var26)
  {
    return SubLObjectFactory.makeBoolean( NIL != module0035.f2014( var26 ) && NIL != module0035.f1995( var26, TWO_INTEGER, UNPROVIDED ) && NIL != module0035.f2370(
        $ic80$, var26, UNPROVIDED ) );
  }

  public static SubLObject f10778()
  {
    final SubLObject var82 = constant_handles_oc.f8433();
    final SubLObject var83 = constant_handles_oc.f8435();
    return ConsesLow.list( var82, var83 );
  }

  public static SubLObject f10779(final SubLObject var84)
  {
    SubLObject var85 = NIL;
    SubLObject var86 = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var84, var84, $ic84$ );
    var85 = var84.first();
    SubLObject var87 = var84.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var87, var84, $ic84$ );
    var86 = var87.first();
    var87 = var87.rest();
    if( NIL == var87 )
    {
      return SubLObjectFactory.makeBoolean( var85.numE( constant_handles_oc.f8433() ) && var86.numE( constant_handles_oc.f8435() ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( var84, $ic84$ );
    return NIL;
  }

  public static SubLObject f10780(final SubLObject var4)
  {
    final SubLThread var5 = SubLProcess.currentSubLThread();
    SubLObject var6 = f10749( var4 );
    final SubLObject var7 = $g2180$.getDynamicValue( var5 );
    if( NIL != var7 )
    {
      var6 = module0065.f4750( var7, var6, UNPROVIDED );
    }
    return var6;
  }

  public static SubLObject f10781(final SubLObject var90)
  {
    return f10752( var90 );
  }

  public static SubLObject f10782(final SubLObject var91, final SubLObject var92)
  {
    final SubLObject var93 = var91.rest();
    final SubLObject var95;
    final SubLObject var94 = var95 = var93;
    return ConsesLow.listS( $ic85$, $ic86$, ConsesLow.append( var95, NIL ) );
  }

  public static SubLObject f10783()
  {
    SubLFiles.declareFunction( myName, "f10733", "CREATE-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( myName, "f10736", "FIND-OR-CREATE-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( myName, "f10739", "GENTEMP-CONSTANT", 1, 1, false );
    SubLFiles.declareFunction( myName, "f10740", "S#13560", 1, 5, false );
    SubLFiles.declareFunction( myName, "f10741", "REMOVE-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10742", "S#13561", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10737", "FIND-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10743", "CONSTANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10744", "CONSTANT-GUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10745", "S#13531", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10746", "FIND-CONSTANT-BY-GUID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10747", "S#13562", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10748", "RENAME-CONSTANT", 2, 0, false );
    SubLFiles.declareFunction( myName, "f10749", "CONSTANT-INTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10750", "S#13563", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10752", "FIND-CONSTANT-BY-INTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10753", "S#13564", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10754", "S#13565", 2, 0, false );
    SubLFiles.declareFunction( myName, "f10738", "S#13566", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10755", "S#10507", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10756", "S#13567", 0, 0, false );
    SubLFiles.declareFunction( myName, "f10757", "CONSTANT-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10758", "S#13568", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10751", "FIND-CONSTANT-BY-EXTERNAL-ID", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10734", "S#13484", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10759", "S#13569", 2, 0, false );
    SubLFiles.declareFunction( myName, "f10760", "S#13570", 2, 0, false );
    SubLFiles.declareFunction( myName, "f10761", "CONSTANT-INFO-FROM-GUID-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10762", "CONSTANT-INFO-FROM-NAME-STRINGS", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10735", "S#13571", 0, 0, false );
    SubLFiles.declareFunction( myName, "f10764", "S#13572", 0, 0, false );
    SubLFiles.declareFunction( myName, "f10763", "S#13573", 0, 0, false );
    SubLFiles.declareFunction( myName, "f10765", "S#13530", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10767", "S#13574", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10768", "S#13575", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10769", "S#13576", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10766", "S#13529", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10770", "S#13577", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10771", "CONSTANT-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10772", "CONSTANT-NAME-WITHIN-NAMESPACE", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10773", "RANDOM-CONSTANT", 0, 1, false );
    SubLFiles.declareFunction( myName, "f10774", "S#13578", 0, 3, false );
    SubLFiles.declareFunction( myName, "f10775", "S#13579", 1, 2, false );
    SubLFiles.declareFunction( myName, "f10776", "S#13580", 1, 1, false );
    SubLFiles.declareFunction( myName, "f10777", "S#13581", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10778", "S#13582", 0, 0, false );
    SubLFiles.declareFunction( myName, "f10779", "S#13583", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10780", "S#13584", 1, 0, false );
    SubLFiles.declareFunction( myName, "f10781", "S#13585", 1, 0, false );
    SubLFiles.declareMacro( "com.cyc.cycjava.cycl.constants_high_oc", "f10782", "S#10592" );
    return NIL;
  }

  public static SubLObject f10784()
  {
    $g2179$ = SubLFiles.deflexical( "S#13586", $ic65$ );
    $g2180$ = SubLFiles.defparameter( "S#13587", NIL );
    return NIL;
  }

  public static SubLObject f10785()
  {
    module0012.f368( $ic2$, $ic3$, $ic4$, $ic5$, $ic6$ );
    module0012.f368( $ic8$, $ic3$, $ic9$, $ic10$, $ic6$ );
    module0012.f368( $ic13$, $ic14$, $ic15$, $ic16$, $ic6$ );
    module0012.f368( $ic23$, $ic24$, $ic25$, $ic26$, $ic27$ );
    module0012.f368( $ic28$, $ic29$, $ic30$, $ic10$, $ic31$ );
    module0012.f368( $ic32$, $ic24$, $ic33$, $ic26$, NIL );
    module0012.f368( $ic36$, $ic37$, $ic38$, $ic39$, $ic6$ );
    module0012.f368( $ic40$, $ic24$, $ic41$, $ic26$, $ic42$ );
    module0012.f368( $ic44$, $ic45$, $ic46$, $ic47$, $ic31$ );
    module0012.f368( $ic48$, $ic24$, $ic49$, $ic26$, $ic50$ );
    module0012.f368( $ic51$, $ic52$, $ic53$, $ic54$, $ic31$ );
    module0012.f368( $ic56$, $ic57$, $ic58$, $ic59$, $ic60$ );
    module0012.f368( $ic61$, $ic62$, $ic63$, $ic64$, $ic60$ );
    module0012.f368( $ic71$, $ic24$, $ic72$, $ic26$, NIL );
    module0012.f368( $ic73$, $ic24$, $ic74$, $ic26$, NIL );
    module0012.f368( $ic76$, $ic77$, $ic78$, NIL, $ic6$ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f10783();
  }

  @Override
  public void initializeVariables()
  {
    f10784();
  }

  @Override
  public void runTopLevelForms()
  {
    f10785();
  }
  static
  {
    me = new constants_high_oc();
    $g2179$ = null;
    $g2180$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "S#10492", "CYC" );
    $ic1$ = SubLObjectFactory.makeSymbol( "S#13484", "CYC" );
    $ic2$ = SubLObjectFactory.makeSymbol( "CREATE-CONSTANT" );
    $ic3$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#29", "CYC" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), SubLObjectFactory.makeSymbol( "S#10596", "CYC" ) );
    $ic4$ = SubLObjectFactory.makeString( "Return a new constant named NAME with EXTERNAL-ID as the external ID." );
    $ic5$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#29", "CYC" ), SubLObjectFactory.makeSymbol( "S#10492", "CYC" ) ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "S#10596", "CYC" ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "S#13484",
            "CYC" ) ) ) );
    $ic6$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT-P" ) );
    $ic7$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic8$ = SubLObjectFactory.makeSymbol( "FIND-OR-CREATE-CONSTANT" );
    $ic9$ = SubLObjectFactory.makeString( "Return the constant with NAME if it exists, otherwise create it with EXTERNAL-ID.\n  Also, if it exists but has a null id, install EXTERNAL-ID on the constant." );
    $ic10$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#29", "CYC" ), SubLObjectFactory.makeSymbol( "STRINGP" ) ) );
    $ic11$ = SubLObjectFactory.makeString( "TMP" );
    $ic12$ = SubLObjectFactory.makeString( "~A-~A" );
    $ic13$ = SubLObjectFactory.makeSymbol( "GENTEMP-CONSTANT" );
    $ic14$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13588", "CYC" ), SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list( SubLObjectFactory
        .makeSymbol( "S#10299", "CYC" ), SubLObjectFactory.makeString( "TMP" ) ) );
    $ic15$ = SubLObjectFactory.makeString( "Create and return a temporary constant whose name is based on START-NAME" );
    $ic16$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13588", "CYC" ), SubLObjectFactory.makeSymbol( "STRINGP" ) ) );
    $ic17$ = SubLObjectFactory.makeString( "" );
    $ic18$ = SubLObjectFactory.makeKeyword( "UPCASE" );
    $ic19$ = SubLObjectFactory.makeKeyword( "DOWNCASE" );
    $ic20$ = SubLObjectFactory.makeString( "T" );
    $ic21$ = SubLObjectFactory.makeString( "T-" );
    $ic22$ = SubLObjectFactory.makeSymbol( "CONSTANT-P" );
    $ic23$ = SubLObjectFactory.makeSymbol( "REMOVE-CONSTANT" );
    $ic24$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ) );
    $ic25$ = SubLObjectFactory.makeString( "Remove CONSTANT from the KB." );
    $ic26$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ), SubLObjectFactory.makeSymbol( "CONSTANT-P" ) ) );
    $ic27$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "NULL" ) );
    $ic28$ = SubLObjectFactory.makeSymbol( "FIND-CONSTANT" );
    $ic29$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#29", "CYC" ) );
    $ic30$ = SubLObjectFactory.makeString( "Return the constant with NAME, or NIL if not present." );
    $ic31$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "CONSTANT-P" ) ) );
    $ic32$ = SubLObjectFactory.makeSymbol( "CONSTANT-NAME" );
    $ic33$ = SubLObjectFactory.makeString( "Return the name of CONSTANT or :unnamed." );
    $ic34$ = SubLObjectFactory.makeSymbol( "GUID-P" );
    $ic35$ = SubLObjectFactory.makeSymbol( "GUID-STRING-P" );
    $ic36$ = SubLObjectFactory.makeSymbol( "RENAME-CONSTANT" );
    $ic37$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ), SubLObjectFactory.makeSymbol( "S#13498", "CYC" ) );
    $ic38$ = SubLObjectFactory.makeString( "Rename CONSTANT to have NEW-NAME as its name.  The constant is returned." );
    $ic39$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "CONSTANT", "CYC" ), SubLObjectFactory.makeSymbol( "CONSTANT-P" ) ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "S#13498", "CYC" ), SubLObjectFactory.makeSymbol( "STRINGP" ) ) );
    $ic40$ = SubLObjectFactory.makeSymbol( "CONSTANT-INTERNAL-ID" );
    $ic41$ = SubLObjectFactory.makeString( "Return the internal id of CONSTANT." );
    $ic42$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "S#13564", "CYC" ) ) );
    $ic43$ = SubLObjectFactory.makeSymbol( "S#13564", "CYC" );
    $ic44$ = SubLObjectFactory.makeSymbol( "FIND-CONSTANT-BY-INTERNAL-ID" );
    $ic45$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ) );
    $ic46$ = SubLObjectFactory.makeString( "Return the constant with internal ID, or NIL if not present." );
    $ic47$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#1519", "CYC" ), SubLObjectFactory.makeSymbol( "S#13564", "CYC" ) ) );
    $ic48$ = SubLObjectFactory.makeSymbol( "CONSTANT-EXTERNAL-ID" );
    $ic49$ = SubLObjectFactory.makeString( "Return the external id of CONSTANT." );
    $ic50$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#664", "CYC" ), SubLObjectFactory.makeSymbol( "S#13484", "CYC" ) ) );
    $ic51$ = SubLObjectFactory.makeSymbol( "FIND-CONSTANT-BY-EXTERNAL-ID" );
    $ic52$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10596", "CYC" ) );
    $ic53$ = SubLObjectFactory.makeString( "Return the constant with EXTERNAL-ID, or NIL if not present." );
    $ic54$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10596", "CYC" ), SubLObjectFactory.makeSymbol( "S#13484", "CYC" ) ) );
    $ic55$ = SubLObjectFactory.makeSymbol( "LISTP" );
    $ic56$ = SubLObjectFactory.makeSymbol( "CONSTANT-INFO-FROM-GUID-STRINGS" );
    $ic57$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13589", "CYC" ) );
    $ic58$ = SubLObjectFactory.makeString( "Returns a list of constant info-items corresponding to the GUID-LIST.  Each\ninfo item is a list of guid-string and name." );
    $ic59$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13589", "CYC" ), SubLObjectFactory.makeSymbol( "LISTP" ) ) );
    $ic60$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "LISTP" ) );
    $ic61$ = SubLObjectFactory.makeSymbol( "CONSTANT-INFO-FROM-NAME-STRINGS" );
    $ic62$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13590", "CYC" ) );
    $ic63$ = SubLObjectFactory.makeString( "Returns a list of constant info-items corresponding to the NAME-LIST.  Each\ninfo item is a list of guid-string and name." );
    $ic64$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13590", "CYC" ), SubLObjectFactory.makeSymbol( "LISTP" ) ) );
    $ic65$ = ConsesLow.list( SEVEN_INTEGER, TWENTY_INTEGER, SubLObjectFactory.makeInteger( 1969 ) );
    $ic66$ = SubLObjectFactory.makeSymbol( "S#13529", "CYC" );
    $ic67$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13591", "CYC" ), SubLObjectFactory.makeSymbol( "S#13592", "CYC" ), SubLObjectFactory.makeSymbol( "S#13593", "CYC" ) );
    $ic68$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13594", "CYC" ), SubLObjectFactory.makeSymbol( "S#13595", "CYC" ), SubLObjectFactory.makeSymbol( "S#13596", "CYC" ) );
    $ic69$ = SubLObjectFactory.makeKeyword( "UNNAMED" );
    $ic70$ = SubLObjectFactory.makeString( "cyc" );
    $ic71$ = SubLObjectFactory.makeSymbol( "CONSTANT-NAMESPACE" );
    $ic72$ = SubLObjectFactory.makeString( "Return the namespace to which the constant belongs." );
    $ic73$ = SubLObjectFactory.makeSymbol( "CONSTANT-NAME-WITHIN-NAMESPACE" );
    $ic74$ = SubLObjectFactory.makeString( "Return the constant name within its namespace." );
    $ic75$ = SubLObjectFactory.makeSymbol( "TRUE" );
    $ic76$ = SubLObjectFactory.makeSymbol( "RANDOM-CONSTANT" );
    $ic77$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "&OPTIONAL" ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#122", "CYC" ), ConsesLow.list(
        SubLObjectFactory.makeSymbol( "FUNCTION" ), SubLObjectFactory.makeSymbol( "TRUE" ) ) ) );
    $ic78$ = SubLObjectFactory.makeString( "Return a randomly chosen constant that satisfies TEST" );
    $ic79$ = SubLObjectFactory.makeInteger( 500 );
    $ic80$ = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic81$ = SubLObjectFactory.makeSymbol( "S#2322", "CYC" );
    $ic82$ = SubLObjectFactory.makeString( "Error ~A (~A) compiling regular expression ~S at offset ~A." );
    $ic83$ = SubLObjectFactory.makeKeyword( "SKIP" );
    $ic84$ = ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13597", "CYC" ), SubLObjectFactory.makeSymbol( "S#13598", "CYC" ) );
    $ic85$ = SubLObjectFactory.makeSymbol( "CLET" );
    $ic86$ = ConsesLow.list( ConsesLow.list( SubLObjectFactory.makeSymbol( "S#13587", "CYC" ), ConsesLow.list( SubLObjectFactory.makeSymbol( "S#10539", "CYC" ) ) ),
        ConsesLow.list( SubLObjectFactory.makeSymbol( "S#9675", "CYC" ), ConsesLow.list( SubLObjectFactory.makeSymbol( "QUOTE" ), SubLObjectFactory
            .makeSymbol( "S#13584", "CYC" ) ) ) );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 266 ms synthetic Decompiled with Procyon
 * 0.5.32.
 */