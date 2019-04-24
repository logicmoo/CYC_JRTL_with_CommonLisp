package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class module0816 extends SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.module0816";
  public static final String myFingerPrint = "040a634a8fc6a80963f4add18ef3c3b67c4c2b47a3d6305d86fafc71db05a97b";
  public static SubLSymbol $g6470$;
  private static SubLSymbol $g6471$;
  private static SubLSymbol $g6472$;
  private static SubLSymbol $g6473$;
  private static SubLSymbol $g6474$;
  private static final SubLSymbol $ic0$;
  private static final SubLSymbol $ic1$;
  private static final SubLInteger $ic2$;
  private static final SubLSymbol $ic3$;
  private static final SubLString $ic4$;
  private static final SubLString $ic5$;
  private static final SubLString $ic6$;
  private static final SubLString $ic7$;
  private static final SubLString $ic8$;
  private static final SubLString $ic9$;
  private static final SubLString $ic10$;
  private static final SubLSymbol $ic11$;
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
  private static final SubLList $ic23$;
  private static final SubLString $ic24$;
  private static final SubLSymbol $ic25$;
  private static final SubLString $ic26$;
  private static final SubLString $ic27$;
  private static final SubLString $ic28$;
  private static final SubLString $ic29$;
  private static final SubLString $ic30$;
  private static final SubLString $ic31$;
  private static final SubLString $ic32$;
  private static final SubLString $ic33$;
  private static final SubLString $ic34$;
  private static final SubLString $ic35$;
  private static final SubLString $ic36$;
  private static final SubLString $ic37$;
  private static final SubLSymbol $ic38$;
  private static final SubLString $ic39$;
  private static final SubLString $ic40$;
  private static final SubLString $ic41$;
  private static final SubLString $ic42$;
  private static final SubLString $ic43$;
  private static final SubLString $ic44$;
  private static final SubLList $ic45$;
  private static final SubLSymbol $ic46$;
  private static final SubLString $ic47$;
  private static final SubLSymbol $ic48$;
  private static final SubLSymbol $ic49$;
  private static final SubLSymbol $ic50$;
  private static final SubLSymbol $ic51$;
  private static final SubLString $ic52$;
  private static final SubLList $ic53$;
  private static final SubLString $ic54$;
  private static final SubLString $ic55$;
  private static final SubLSymbol $ic56$;
  private static final SubLSymbol $ic57$;
  private static final SubLSymbol $ic58$;
  private static final SubLString $ic59$;
  private static final SubLString $ic60$;
  private static final SubLSymbol $ic61$;
  private static final SubLString $ic62$;
  private static final SubLList $ic63$;
  private static final SubLList $ic64$;
  private static final SubLSymbol $ic65$;
  private static final SubLString $ic66$;
  private static final SubLSymbol $ic67$;
  private static final SubLSymbol $ic68$;
  private static final SubLString $ic69$;
  private static final SubLString $ic70$;
  private static final SubLString $ic71$;
  private static final SubLString $ic72$;
  private static final SubLSymbol $ic73$;
  private static final SubLString $ic74$;
  private static final SubLSymbol $ic75$;
  private static final SubLString $ic76$;
  private static final SubLList $ic77$;
  private static final SubLSymbol $ic78$;
  private static final SubLSymbol $ic79$;
  private static final SubLString $ic80$;
  private static final SubLString $ic81$;
  private static final SubLString $ic82$;
  private static final SubLString $ic83$;
  private static final SubLSymbol $ic84$;
  private static final SubLList $ic85$;
  private static final SubLString $ic86$;
  private static final SubLList $ic87$;
  private static final SubLSymbol $ic88$;
  private static final SubLSymbol $ic89$;
  private static final SubLSymbol $ic90$;
  private static final SubLList $ic91$;
  private static final SubLSymbol $ic92$;
  private static final SubLSymbol $ic93$;
  private static final SubLSymbol $ic94$;
  private static final SubLSymbol $ic95$;
  private static final SubLSymbol $ic96$;
  private static final SubLSymbol $ic97$;
  private static final SubLSymbol $ic98$;
  private static final SubLList $ic99$;
  private static final SubLList $ic100$;
  private static final SubLSymbol $ic101$;
  private static final SubLList $ic102$;
  private static final SubLSymbol $ic103$;
  private static final SubLSymbol $ic104$;
  private static final SubLSymbol $ic105$;
  private static final SubLSymbol $ic106$;
  private static final SubLList $ic107$;
  private static final SubLSymbol $ic108$;
  private static final SubLList $ic109$;
  private static final SubLSymbol $ic110$;
  private static final SubLSymbol $ic111$;
  private static final SubLSymbol $ic112$;
  private static final SubLSymbol $ic113$;
  private static final SubLList $ic114$;
  private static final SubLSymbol $ic115$;
  private static final SubLString $ic116$;
  private static final SubLList $ic117$;
  private static final SubLSymbol $ic118$;
  private static final SubLSymbol $ic119$;
  private static final SubLSymbol $ic120$;
  private static final SubLList $ic121$;
  private static final SubLSymbol $ic122$;
  private static final SubLSymbol $ic123$;
  private static final SubLSymbol $ic124$;
  private static final SubLString $ic125$;
  private static final SubLString $ic126$;
  private static final SubLSymbol $ic127$;
  private static final SubLSymbol $ic128$;
  private static final SubLString $ic129$;
  private static final SubLList $ic130$;
  private static final SubLSymbol $ic131$;
  private static final SubLSymbol $ic132$;
  private static final SubLSymbol $ic133$;
  private static final SubLSymbol $ic134$;
  private static final SubLList $ic135$;
  private static final SubLSymbol $ic136$;
  private static final SubLString $ic137$;
  private static final SubLSymbol $ic138$;
  private static final SubLList $ic139$;
  private static final SubLList $ic140$;
  private static final SubLSymbol $ic141$;
  private static final SubLString $ic142$;
  private static final SubLSymbol $ic143$;
  private static final SubLString $ic144$;
  private static final SubLList $ic145$;
  private static final SubLString $ic146$;
  private static final SubLList $ic147$;
  private static final SubLString $ic148$;
  private static final SubLString $ic149$;
  private static final SubLSymbol $ic150$;
  private static final SubLSymbol $ic151$;
  private static final SubLList $ic152$;
  private static final SubLSymbol $ic153$;
  private static final SubLSymbol $ic154$;
  private static final SubLList $ic155$;
  private static final SubLString $ic156$;
  private static final SubLString $ic157$;
  private static final SubLSymbol $ic158$;
  private static final SubLSymbol $ic159$;
  private static final SubLList $ic160$;
  private static final SubLSymbol $ic161$;
  private static final SubLSymbol $ic162$;
  private static final SubLSymbol $ic163$;
  private static final SubLList $ic164$;
  private static final SubLSymbol $ic165$;
  private static final SubLSymbol $ic166$;
  private static final SubLSymbol $ic167$;
  private static final SubLSymbol $ic168$;
  private static final SubLList $ic169$;
  private static final SubLSymbol $ic170$;
  private static final SubLSymbol $ic171$;
  private static final SubLString $ic172$;
  private static final SubLSymbol $ic173$;
  private static final SubLSymbol $ic174$;
  private static final SubLSymbol $ic175$;
  private static final SubLSymbol $ic176$;
  private static final SubLSymbol $ic177$;
  private static final SubLList $ic178$;
  private static final SubLSymbol $ic179$;
  private static final SubLString $ic180$;
  private static final SubLString $ic181$;
  private static final SubLList $ic182$;
  private static final SubLList $ic183$;
  private static final SubLList $ic184$;
  private static final SubLList $ic185$;
  private static final SubLString $ic186$;
  private static final SubLString $ic187$;
  private static final SubLString $ic188$;
  private static final SubLString $ic189$;
  private static final SubLList $ic190$;
  private static final SubLString $ic191$;
  private static final SubLString $ic192$;
  private static final SubLList $ic193$;
  private static final SubLString $ic194$;
  private static final SubLList $ic195$;
  private static final SubLSymbol $ic196$;
  private static final SubLString $ic197$;
  private static final SubLList $ic198$;
  private static final SubLSymbol $ic199$;
  private static final SubLString $ic200$;
  private static final SubLList $ic201$;
  private static final SubLSymbol $ic202$;
  private static final SubLSymbol $ic203$;
  private static final SubLSymbol $ic204$;
  private static final SubLSymbol $ic205$;
  private static final SubLSymbol $ic206$;
  private static final SubLList $ic207$;
  private static final SubLSymbol $ic208$;
  private static final SubLString $ic209$;
  private static final SubLList $ic210$;
  private static final SubLString $ic211$;
  private static final SubLList $ic212$;
  private static final SubLString $ic213$;
  private static final SubLList $ic214$;
  private static final SubLList $ic215$;
  private static final SubLSymbol $ic216$;
  private static final SubLString $ic217$;
  private static final SubLString $ic218$;
  private static final SubLList $ic219$;
  private static final SubLSymbol $ic220$;
  private static final SubLString $ic221$;
  private static final SubLList $ic222$;
  private static final SubLSymbol $ic223$;
  private static final SubLSymbol $ic224$;
  private static final SubLSymbol $ic225$;
  private static final SubLSymbol $ic226$;
  private static final SubLSymbol $ic227$;
  private static final SubLSymbol $ic228$;
  private static final SubLSymbol $ic229$;
  private static final SubLString $ic230$;
  private static final SubLSymbol $ic231$;
  private static final SubLSymbol $ic232$;
  private static final SubLSymbol $ic233$;
  private static final SubLSymbol $ic234$;
  private static final SubLInteger $ic235$;
  private static final SubLInteger $ic236$;
  private static final SubLList $ic237$;
  private static final SubLString $ic238$;
  private static final SubLSymbol $ic239$;
  private static final SubLSymbol $ic240$;
  private static final SubLSymbol $ic241$;
  private static final SubLSymbol $ic242$;
  private static final SubLString $ic243$;
  private static final SubLSymbol $ic244$;
  private static final SubLString $ic245$;
  private static final SubLString $ic246$;
  private static final SubLSymbol $ic247$;
  private static final SubLString $ic248$;
  private static final SubLString $ic249$;
  private static final SubLList $ic250$;
  private static final SubLSymbol $ic251$;
  private static final SubLSymbol $ic252$;
  private static final SubLSymbol $ic253$;
  private static final SubLList $ic254$;
  private static final SubLString $ic255$;
  private static final SubLList $ic256$;
  private static final SubLSymbol $ic257$;
  private static final SubLString $ic258$;
  private static final SubLList $ic259$;
  private static final SubLSymbol $ic260$;
  private static final SubLList $ic261$;
  private static final SubLSymbol $ic262$;
  private static final SubLString $ic263$;
  private static final SubLList $ic264$;
  private static final SubLSymbol $ic265$;
  private static final SubLList $ic266$;
  private static final SubLSymbol $ic267$;
  private static final SubLSymbol $ic268$;
  private static final SubLList $ic269$;
  private static final SubLSymbol $ic270$;
  private static final SubLSymbol $ic271$;
  private static final SubLSymbol $ic272$;
  private static final SubLList $ic273$;
  private static final SubLSymbol $ic274$;
  private static final SubLSymbol $ic275$;
  private static final SubLList $ic276$;
  private static final SubLSymbol $ic277$;
  private static final SubLList $ic278$;
  private static final SubLString $ic279$;
  private static final SubLString $ic280$;
  private static final SubLString $ic281$;
  private static final SubLString $ic282$;
  private static final SubLString $ic283$;
  private static final SubLString $ic284$;
  private static final SubLString $ic285$;
  private static final SubLString $ic286$;
  private static final SubLString $ic287$;
  private static final SubLString $ic288$;
  private static final SubLList $ic289$;
  private static final SubLString $ic290$;
  private static final SubLString $ic291$;
  private static final SubLString $ic292$;
  private static final SubLString $ic293$;
  private static final SubLString $ic294$;
  private static final SubLList $ic295$;
  private static final SubLString $ic296$;
  private static final SubLString $ic297$;
  private static final SubLString $ic298$;
  private static final SubLString $ic299$;
  private static final SubLString $ic300$;
  private static final SubLString $ic301$;
  private static final SubLString $ic302$;
  private static final SubLString $ic303$;
  private static final SubLString $ic304$;
  private static final SubLString $ic305$;
  private static final SubLString $ic306$;
  private static final SubLSymbol $ic307$;
  private static final SubLString $ic308$;
  private static final SubLString $ic309$;
  private static final SubLString $ic310$;
  private static final SubLString $ic311$;
  private static final SubLString $ic312$;
  private static final SubLString $ic313$;
  private static final SubLString $ic314$;
  private static final SubLSymbol $ic315$;
  private static final SubLString $ic316$;
  private static final SubLString $ic317$;
  private static final SubLString $ic318$;
  private static final SubLString $ic319$;
  private static final SubLString $ic320$;
  private static final SubLString $ic321$;
  private static final SubLString $ic322$;
  private static final SubLString $ic323$;
  private static final SubLString $ic324$;
  private static final SubLString $ic325$;
  private static final SubLString $ic326$;
  private static final SubLString $ic327$;
  private static final SubLSymbol $ic328$;
  private static final SubLList $ic329$;

  public static SubLObject f52219(final SubLObject var1, final SubLObject var2, SubLObject var3)
  {
    if( var3 == module0816.UNPROVIDED )
    {
      var3 = (SubLObject) module0816.NIL;
    }
    assert module0816.NIL != module0812.f51933( var1 ) : var1;
    assert module0816.NIL != Types.stringp( var2 ) : var2;
    final SubLObject var4 = f52220( var2 );
    f52221( var1, var4 );
    f52222( var1, var2 );
    return var1;
  }

  public static SubLObject f52222(final SubLObject var1, final SubLObject var5)
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    assert module0816.NIL != module0812.f51933( var1 ) : var1;
    assert module0816.NIL != Types.stringp( var5 ) : var5;
    SubLObject var7 = (SubLObject) module0816.NIL;
    module0075.ensure_directories_exist( var5 );
    final SubLObject var8 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var6 );
    final SubLObject var9 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var6 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var6 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var6 ), var6 );
      SubLObject var10 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_12 = stream_macros.$stream_requires_locking$.currentBinding( var6 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var6 );
          var10 = compatibility.open_text( var5, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_12, var6 );
        }
        if( !var10.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var5 );
        }
        final SubLObject var13_14 = var10;
        var7 = f52223( var1, var13_14, var5 );
      }
      finally
      {
        final SubLObject var8_13 = Threads.$is_thread_performing_cleanupP$.currentBinding( var6 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var6 );
          if( var10.isStream() )
          {
            streams_high.close( var10, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_13, var6 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var9, var6 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var8, var6 );
    }
    return var7;
  }

  public static SubLObject f52221(final SubLObject var1, final SubLObject var5)
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    assert module0816.NIL != module0812.f51933( var1 ) : var1;
    assert module0816.NIL != Types.stringp( var5 ) : var5;
    SubLObject var7 = (SubLObject) module0816.NIL;
    module0075.ensure_directories_exist( var5 );
    final SubLObject var8 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var6 );
    final SubLObject var9 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var6 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var6 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var6 ), var6 );
      SubLObject var10 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_17 = stream_macros.$stream_requires_locking$.currentBinding( var6 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var6 );
          var10 = compatibility.open_text( var5, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_17, var6 );
        }
        if( !var10.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var5 );
        }
        final SubLObject var13_18 = var10;
        var7 = f52224( var1, var13_18, var5 );
      }
      finally
      {
        final SubLObject var8_18 = Threads.$is_thread_performing_cleanupP$.currentBinding( var6 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var6 );
          if( var10.isStream() )
          {
            streams_high.close( var10, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_18, var6 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var9, var6 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var8, var6 );
    }
    return var7;
  }

  public static SubLObject f52220(final SubLObject var2)
  {
    assert module0816.NIL != Types.stringp( var2 ) : var2;
    if( var2.equal( (SubLObject) module0816.$ic5$ ) )
    {
      return (SubLObject) module0816.$ic5$;
    }
    if( module0816.NIL != module0038.f2673( var2, (SubLObject) module0816.$ic6$, (SubLObject) module0816.UNPROVIDED ) )
    {
      return Sequences.cconcatenate( module0006.f203( module0038.f2623( var2, (SubLObject) module0816.ZERO_INTEGER, Numbers.subtract( Sequences.length( var2 ), (SubLObject) module0816.TWO_INTEGER ) ) ),
          (SubLObject) module0816.$ic7$ );
    }
    if( module0816.NIL != module0038.f2673( var2, (SubLObject) module0816.$ic8$, (SubLObject) module0816.UNPROVIDED ) )
    {
      return Sequences.cconcatenate( module0006.f203( module0038.f2623( var2, (SubLObject) module0816.ZERO_INTEGER, Numbers.subtract( Sequences.length( var2 ), (SubLObject) module0816.TWO_INTEGER ) ) ),
          (SubLObject) module0816.$ic9$ );
    }
    return Errors.error( (SubLObject) module0816.$ic10$, var2 );
  }

  public static SubLObject f52223(final SubLObject var1, SubLObject var13, SubLObject var5)
  {
    if( var13 == module0816.UNPROVIDED )
    {
      var13 = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( var5 == module0816.UNPROVIDED )
    {
      var5 = (SubLObject) module0816.NIL;
    }
    final SubLThread var14 = SubLProcess.currentSubLThread();
    assert module0816.NIL != module0812.f51933( var1 ) : var1;
    final SubLObject var15 = reader.$read_default_float_format$.currentBinding( var14 );
    final SubLObject var16 = module0816.$g6470$.currentBinding( var14 );
    final SubLObject var17 = module0812.$g6445$.currentBinding( var14 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) module0816.$ic11$, var14 );
      module0816.$g6470$.bind( (SubLObject) module0816.ZERO_INTEGER, var14 );
      module0812.$g6445$.bind( var1, var14 );
      final SubLObject var19;
      final SubLObject var18 = var19 = module0034.f1854( (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      final SubLObject var8_23 = module0034.$g879$.currentBinding( var14 );
      try
      {
        module0034.$g879$.bind( var19, var14 );
        SubLObject var20 = (SubLObject) module0816.NIL;
        if( module0816.NIL != var19 && module0816.NIL == module0034.f1842( var19 ) )
        {
          var20 = module0034.f1869( var19 );
          final SubLObject var21 = Threads.current_process();
          if( module0816.NIL == var20 )
          {
            module0034.f1873( var19, var21 );
          }
          else if( !var20.eql( var21 ) )
          {
            Errors.error( (SubLObject) module0816.$ic12$ );
          }
        }
        try
        {
          f52225( var1, var5, var13 );
        }
        finally
        {
          final SubLObject var8_24 = Threads.$is_thread_performing_cleanupP$.currentBinding( var14 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var14 );
            f52226( var1, var13 );
            f52227( var1, var13 );
            f52228( var1, var13 );
            f52229( var1, var13 );
            f52230( var1, var13 );
            f52231( var1, var13 );
            streams_high.terpri( var13 );
            if( module0816.NIL != var19 && module0816.NIL == var20 )
            {
              module0034.f1873( var19, (SubLObject) module0816.NIL );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var8_24, var14 );
          }
        }
      }
      finally
      {
        module0034.$g879$.rebind( var8_23, var14 );
      }
    }
    finally
    {
      module0812.$g6445$.rebind( var17, var14 );
      module0816.$g6470$.rebind( var16, var14 );
      reader.$read_default_float_format$.rebind( var15, var14 );
    }
    return var1;
  }

  public static SubLObject f52224(final SubLObject var1, SubLObject var13, SubLObject var5)
  {
    if( var13 == module0816.UNPROVIDED )
    {
      var13 = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( var5 == module0816.UNPROVIDED )
    {
      var5 = (SubLObject) module0816.NIL;
    }
    final SubLThread var14 = SubLProcess.currentSubLThread();
    assert module0816.NIL != module0812.f51933( var1 ) : var1;
    final SubLObject var15 = reader.$read_default_float_format$.currentBinding( var14 );
    final SubLObject var16 = module0816.$g6470$.currentBinding( var14 );
    final SubLObject var17 = module0812.$g6445$.currentBinding( var14 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) module0816.$ic11$, var14 );
      module0816.$g6470$.bind( (SubLObject) module0816.ZERO_INTEGER, var14 );
      module0812.$g6445$.bind( var1, var14 );
      final SubLObject var19;
      final SubLObject var18 = var19 = module0034.f1854( (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      final SubLObject var8_27 = module0034.$g879$.currentBinding( var14 );
      try
      {
        module0034.$g879$.bind( var19, var14 );
        SubLObject var20 = (SubLObject) module0816.NIL;
        if( module0816.NIL != var19 && module0816.NIL == module0034.f1842( var19 ) )
        {
          var20 = module0034.f1869( var19 );
          final SubLObject var21 = Threads.current_process();
          if( module0816.NIL == var20 )
          {
            module0034.f1873( var19, var21 );
          }
          else if( !var20.eql( var21 ) )
          {
            Errors.error( (SubLObject) module0816.$ic12$ );
          }
        }
        try
        {
          f52232( var13, var5, module0812.f51970( var1 ) );
        }
        finally
        {
          final SubLObject var8_28 = Threads.$is_thread_performing_cleanupP$.currentBinding( var14 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var14 );
            f52233( var1, var13 );
            f52234( var1, var13 );
            if( module0816.NIL != var19 && module0816.NIL == var20 )
            {
              module0034.f1873( var19, (SubLObject) module0816.NIL );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var8_28, var14 );
          }
        }
      }
      finally
      {
        module0034.$g879$.rebind( var8_27, var14 );
      }
    }
    finally
    {
      module0812.$g6445$.rebind( var17, var14 );
      module0816.$g6470$.rebind( var16, var14 );
      reader.$read_default_float_format$.rebind( var15, var14 );
    }
    return var1;
  }

  public static SubLObject f52233(final SubLObject var1, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    SubLObject var14 = module0812.f51977( var1 );
    SubLObject var15 = (SubLObject) module0816.NIL;
    var15 = var14.first();
    while ( module0816.NIL != var14)
    {
      if( module0816.NIL == module0812.f51991( var15 ) )
      {
        f52235( var15, var13 );
      }
      var14 = var14.rest();
      var15 = var14.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52234(final SubLObject var1, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    SubLObject var14 = module0812.f51979( var1 );
    SubLObject var15 = (SubLObject) module0816.NIL;
    var15 = var14.first();
    while ( module0816.NIL != var14)
    {
      if( module0816.NIL == module0812.f51988( var15 ) )
      {
        f52236( var15, var13 );
      }
      var14 = var14.rest();
      var15 = var14.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52225(final SubLObject var1, final SubLObject var5, final SubLObject var13)
  {
    f52232( var13, var5, module0812.f51970( var1 ) );
    streams_high.terpri( var13 );
    streams_high.terpri( var13 );
    streams_high.write_string( (SubLObject) module0816.$ic13$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL == module0813.f52033() )
    {
      SubLObject var14 = module0812.f51970( var1 );
      final SubLObject var15 = (SubLObject) module0816.$ic14$;
      var14 = Sequences.substitute( (SubLObject) Characters.CHAR_underbar, (SubLObject) Characters.CHAR_hyphen, var14, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED,
          (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      PrintLow.format( var13, (SubLObject) module0816.$ic15$, var15 );
      PrintLow.format( var13, (SubLObject) module0816.$ic16$, var14 );
      PrintLow.format( var13, (SubLObject) module0816.$ic17$ );
      PrintLow.format( var13, (SubLObject) module0816.$ic15$, var14 );
      PrintLow.format( var13, (SubLObject) module0816.$ic18$ );
      PrintLow.format( var13, (SubLObject) module0816.$ic17$ );
    }
    PrintLow.format( var13, (SubLObject) module0816.$ic19$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52232(final SubLObject var13, final SubLObject var5, SubLObject var32)
  {
    if( var32 == module0816.UNPROVIDED )
    {
      var32 = (SubLObject) module0816.NIL;
    }
    final SubLThread var33 = SubLProcess.currentSubLThread();
    PrintLow.format( var13, (SubLObject) module0816.$ic20$ );
    PrintLow.format( var13, (SubLObject) module0816.$ic21$, f52237() );
    if( !module0816.$ic22$.equal( module0819.f52447() ) )
    {
      if( module0816.NIL != module0035.f2169( module0813.f52035(), (SubLObject) module0816.$ic23$ ) )
      {
        PrintLow.format( var13, (SubLObject) module0816.$ic24$, var5 );
      }
      if( module0816.$ic25$ != module0813.f52035() )
      {
        var33.resetMultipleValues();
        final SubLObject var34 = Time.get_decoded_time();
        final SubLObject var35 = var33.secondMultipleValue();
        final SubLObject var36 = var33.thirdMultipleValue();
        final SubLObject var37 = var33.fourthMultipleValue();
        final SubLObject var38 = var33.fifthMultipleValue();
        final SubLObject var39 = var33.sixthMultipleValue();
        var33.resetMultipleValues();
        PrintLow.format( var13, (SubLObject) module0816.$ic26$, new SubLObject[] { var39, var38, var37, var36, var35, var34
        } );
      }
    }
    if( module0816.NIL != var32 && module0816.NIL != module0035.f2169( module0813.f52035(), (SubLObject) module0816.$ic23$ ) )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic27$, var32 );
    }
    PrintLow.format( var13, (SubLObject) module0816.$ic28$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52238(final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    PrintLow.format( var13, (SubLObject) module0816.$ic29$, f52237() );
    var14.resetMultipleValues();
    final SubLObject var15 = Time.get_decoded_time();
    final SubLObject var16 = var14.secondMultipleValue();
    final SubLObject var17 = var14.thirdMultipleValue();
    final SubLObject var18 = var14.fourthMultipleValue();
    final SubLObject var19 = var14.fifthMultipleValue();
    final SubLObject var20 = var14.sixthMultipleValue();
    var14.resetMultipleValues();
    PrintLow.format( var13, (SubLObject) module0816.$ic30$, new SubLObject[] { var20, var19, var18, var17, var16, var15
    } );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52237()
  {
    return (SubLObject) module0816.$ic31$;
  }

  public static SubLObject f52226(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = f52239( var1 );
    if( module0816.NIL != var14 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic32$ );
    }
    SubLObject var15 = var14;
    SubLObject var16 = (SubLObject) module0816.NIL;
    var16 = var15.first();
    while ( module0816.NIL != var15)
    {
      f52235( var16, var13 );
      var15 = var15.rest();
      var16 = var15.first();
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52227(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = f52240( var1 );
    if( module0816.NIL != var14 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic33$ );
    }
    SubLObject var15 = var14;
    SubLObject var16 = (SubLObject) module0816.NIL;
    var16 = var15.first();
    while ( module0816.NIL != var15)
    {
      f52236( var16, var13 );
      var15 = var15.rest();
      var16 = var15.first();
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52241(final SubLObject var30)
  {
    return module0815.f52214( var30 );
  }

  public static SubLObject f52242(final SubLObject var31)
  {
    return module0815.f52207( var31 );
  }

  public static SubLObject f52239(final SubLObject var1)
  {
    final SubLObject var2 = module0812.f51976( var1 );
    SubLObject var3 = (SubLObject) module0816.NIL;
    SubLObject var4 = var2;
    SubLObject var5 = (SubLObject) module0816.NIL;
    var5 = var4.first();
    while ( module0816.NIL != var4)
    {
      if( module0816.NIL == f52241( var5 ) && module0816.NIL == module0812.f51990( var1, var5 ) )
      {
        var3 = (SubLObject) ConsesLow.cons( var5, var3 );
      }
      var4 = var4.rest();
      var5 = var4.first();
    }
    return Sequences.nreverse( var3 );
  }

  public static SubLObject f52240(final SubLObject var1)
  {
    final SubLObject var2 = module0812.f51978( var1 );
    SubLObject var3 = (SubLObject) module0816.NIL;
    SubLObject var4 = var2;
    SubLObject var5 = (SubLObject) module0816.NIL;
    var5 = var4.first();
    while ( module0816.NIL != var4)
    {
      if( module0816.NIL == f52242( var5 ) )
      {
        var3 = (SubLObject) ConsesLow.cons( var5, var3 );
      }
      var4 = var4.rest();
      var5 = var4.first();
    }
    return Sequences.nreverse( var3 );
  }

  public static SubLObject f52235(final SubLObject var30, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    streams_high.write_string( (SubLObject) module0816.$ic34$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52243( var13 );
    streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52244( var30, var13, (SubLObject) module0816.UNPROVIDED );
    streams_high.write_string( (SubLObject) module0816.$ic36$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52236(final SubLObject var31, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    if( module0816.NIL != module0812.f51988( var31 ) )
    {
      streams_high.write_string( (SubLObject) module0816.$ic37$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      streams_high.write_string( (SubLObject) module0816.$ic34$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    f52245( var13, var31, (SubLObject) module0816.$ic38$, (SubLObject) module0816.ZERO_INTEGER );
    streams_high.write_string( (SubLObject) module0816.$ic36$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52228(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = module0812.f51973( var1 );
    streams_high.terpri( var13 );
    streams_high.terpri( var13 );
    PrintLow.format( var13, (SubLObject) module0816.$ic39$, var14 );
    streams_high.write_string( (SubLObject) module0816.$ic40$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52229(final SubLObject var1, final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    final SubLObject var15 = module0812.f51993( var1 );
    if( module0816.NIL != var15 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic41$ );
    }
    final SubLObject var16 = module0816.$g6471$.currentBinding( var14 );
    try
    {
      module0816.$g6471$.bind( (SubLObject) module0816.NIL, var14 );
      SubLObject var17 = var15;
      SubLObject var18 = (SubLObject) module0816.NIL;
      var18 = var17.first();
      while ( module0816.NIL != var17)
      {
        streams_high.terpri( var13 );
        f52246( var18, var13, (SubLObject) module0816.ZERO_INTEGER );
        var17 = var17.rest();
        var18 = var17.first();
      }
    }
    finally
    {
      module0816.$g6471$.rebind( var16, var14 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52230(final SubLObject var1, final SubLObject var13)
  {
    if( module0816.$ic22$.equal( module0819.f52447() ) )
    {
      final SubLObject var14 = module0812.f51980( var1 );
      if( module0816.NIL != var14 )
      {
        PrintLow.format( var13, (SubLObject) module0816.$ic42$ );
      }
      SubLObject var15 = var14;
      SubLObject var16 = (SubLObject) module0816.NIL;
      var16 = var15.first();
      while ( module0816.NIL != var15)
      {
        streams_high.terpri( var13 );
        f52236( var16, var13 );
        var15 = var15.rest();
        var16 = var15.first();
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52231(final SubLObject var1, final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    SubLObject var16;
    final SubLObject var15 = var16 = module0812.f51972( var1 );
    SubLObject var17 = (SubLObject) module0816.NIL;
    var17 = var16.first();
    while ( module0816.NIL != var16)
    {
      final SubLObject var18 = module0816.$g6471$.currentBinding( var14 );
      try
      {
        module0816.$g6471$.bind( module0812.f51992( var1, var17 ), var14 );
        streams_high.terpri( var13 );
        f52246( var17, var13, (SubLObject) module0816.ZERO_INTEGER );
      }
      finally
      {
        module0816.$g6471$.rebind( var18, var14 );
      }
      var16 = var16.rest();
      var17 = var16.first();
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52246(final SubLObject var47, final SubLObject var13, SubLObject var48)
  {
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.ZERO_INTEGER;
    }
    streams_high.terpri( var13 );
    f52247( var13, var48 );
    if( module0816.NIL != f52244( var47, var13, var48 ) )
    {
      streams_high.write_string( (SubLObject) module0816.$ic36$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52244(SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.ZERO_INTEGER;
    }
    var49 = f52248( var49 );
    if( var49.isAtom() )
    {
      return f52249( var49, var13, var48 );
    }
    final SubLObject var50 = var49.first();
    final SubLObject var51 = f52250( var50 );
    if( module0816.NIL != var51 )
    {
      return f52251( var51, var49, var13, var48 );
    }
    return f52252( var49, var13, var48 );
  }

  public static SubLObject f52253(final SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.ZERO_INTEGER;
    }
    final SubLThread var50 = SubLProcess.currentSubLThread();
    final SubLObject var51 = reader.$read_default_float_format$.currentBinding( var50 );
    final SubLObject var52 = module0816.$g6470$.currentBinding( var50 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) module0816.$ic11$, var50 );
      module0816.$g6470$.bind( (SubLObject) module0816.ZERO_INTEGER, var50 );
      final SubLObject var54;
      final SubLObject var53 = var54 = module0034.f1854( (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      final SubLObject var8_52 = module0034.$g879$.currentBinding( var50 );
      try
      {
        module0034.$g879$.bind( var54, var50 );
        SubLObject var55 = (SubLObject) module0816.NIL;
        if( module0816.NIL != var54 && module0816.NIL == module0034.f1842( var54 ) )
        {
          var55 = module0034.f1869( var54 );
          final SubLObject var56 = Threads.current_process();
          if( module0816.NIL == var55 )
          {
            module0034.f1873( var54, var56 );
          }
          else if( !var55.eql( var56 ) )
          {
            Errors.error( (SubLObject) module0816.$ic12$ );
          }
        }
        try
        {
          f52244( var49, var13, var48 );
        }
        finally
        {
          final SubLObject var8_53 = Threads.$is_thread_performing_cleanupP$.currentBinding( var50 );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var50 );
            if( module0816.NIL != var54 && module0816.NIL == var55 )
            {
              module0034.f1873( var54, (SubLObject) module0816.NIL );
            }
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( var8_53, var50 );
          }
        }
      }
      finally
      {
        module0034.$g879$.rebind( var8_52, var50 );
      }
    }
    finally
    {
      module0816.$g6470$.rebind( var52, var50 );
      reader.$read_default_float_format$.rebind( var51, var50 );
    }
    return var49;
  }

  public static SubLObject f52247(final SubLObject var13, final SubLObject var48)
  {
    SubLObject var49;
    for( var49 = (SubLObject) module0816.NIL, var49 = (SubLObject) module0816.ZERO_INTEGER; var49.numL( var48 ); var49 = Numbers.add( var49, (SubLObject) module0816.ONE_INTEGER ) )
    {
      streams_high.write_string( (SubLObject) module0816.$ic43$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52249(final SubLObject var55, final SubLObject var13, final SubLObject var48)
  {
    if( var55.isSymbol() )
    {
      f52254( var55, var13 );
    }
    else
    {
      if( module0816.NIL == f52255( var55 ) )
      {
        return Errors.error( (SubLObject) module0816.$ic44$, var55 );
      }
      f52256( var55, var13 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52255(final SubLObject var56)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( var56.isInteger() || var56.isString() || var56.isDouble() );
  }

  public static SubLObject f52256(final SubLObject var55, final SubLObject var13)
  {
    if( var55.isInteger() )
    {
      return print_high.princ( var55, var13 );
    }
    if( var55.isString() )
    {
      return f52257( var55, var13 );
    }
    if( var55.isDouble() )
    {
      final SubLObject var56 = module0038.f2624( var55 );
      final SubLObject var57 = Strings.string_upcase( Sequences.remove( (SubLObject) Characters.CHAR_plus, var56, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED,
          (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ), (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      streams_high.write_string( var57, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      return var55;
    }
    return print_high.princ( var55, var13 );
  }

  public static SubLObject f52257(final SubLObject var59, final SubLObject var13)
  {
    if( module0816.NIL == Sequences.position( (SubLObject) Characters.CHAR_newline, var59, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED,
        (SubLObject) module0816.UNPROVIDED ) && module0816.NIL == Sequences.position( (SubLObject) Characters.CHAR_return, var59, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED,
            (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ) && module0816.NIL == Sequences.position( (SubLObject) Characters.CHAR_quotation, var59, (SubLObject) module0816.UNPROVIDED,
                (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ) && module0816.NIL == Sequences.position( (SubLObject) Characters.CHAR_backslash, var59,
                    (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ) )
    {
      return print_high.prin1( var59, var13 );
    }
    streams_high.write_char( (SubLObject) Characters.CHAR_quotation, var13 );
    SubLObject var62_63;
    SubLObject var60;
    SubLObject var61;
    SubLObject var63;
    SubLObject var62;
    for( var60 = ( var62_63 = Sequences.length( var59 ) ), var61 = (SubLObject) module0816.NIL, var61 = (SubLObject) module0816.ZERO_INTEGER; !var61.numGE( var62_63 ); var61 = module0048.f_1X( var61 ) )
    {
      var62 = ( var63 = Strings.sublisp_char( var59, var61 ) );
      if( var63.eql( (SubLObject) Characters.CHAR_newline ) )
      {
        streams_high.write_char( (SubLObject) Characters.CHAR_backslash, var13 );
        streams_high.write_char( (SubLObject) Characters.CHAR_n, var13 );
      }
      else if( var63.eql( (SubLObject) Characters.CHAR_return ) )
      {
        streams_high.write_char( (SubLObject) Characters.CHAR_backslash, var13 );
        streams_high.write_char( (SubLObject) Characters.CHAR_r, var13 );
      }
      else if( var63.eql( (SubLObject) Characters.CHAR_quotation ) )
      {
        streams_high.write_char( (SubLObject) Characters.CHAR_backslash, var13 );
        streams_high.write_char( (SubLObject) Characters.CHAR_quotation, var13 );
      }
      else if( var63.eql( (SubLObject) Characters.CHAR_backslash ) )
      {
        streams_high.write_char( (SubLObject) Characters.CHAR_backslash, var13 );
        streams_high.write_char( (SubLObject) Characters.CHAR_backslash, var13 );
      }
      else
      {
        streams_high.write_char( var62, var13 );
      }
    }
    streams_high.write_char( (SubLObject) Characters.CHAR_quotation, var13 );
    return var59;
  }

  public static SubLObject f52258(final SubLObject var67, final SubLObject var13, SubLObject var48)
  {
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.NIL;
    }
    SubLObject var68 = (SubLObject) module0816.NIL;
    SubLObject var69 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var67, var67, (SubLObject) module0816.$ic45$ );
    var68 = var67.first();
    SubLObject var70 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var70, var67, (SubLObject) module0816.$ic45$ );
    var69 = var70.first();
    var70 = var70.rest();
    if( module0816.NIL != var70 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var67, (SubLObject) module0816.$ic45$ );
      return (SubLObject) module0816.NIL;
    }
    module0035.f2502( var68, (SubLObject) module0816.$ic46$ );
    final SubLObject var71 = module0815.f52211( var69 );
    if( module0816.NIL == var71 )
    {
      return Errors.error( (SubLObject) module0816.$ic47$, var69 );
    }
    return streams_high.write_string( var71, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52254(final SubLObject var72, final SubLObject var13)
  {
    final SubLObject var74;
    final SubLObject var73 = var74 = f52259( var72 );
    if( var74.eql( (SubLObject) module0816.$ic48$ ) )
    {
      f52260( var72, var13 );
    }
    else if( var74.eql( (SubLObject) module0816.$ic49$ ) )
    {
      f52260( var72, var13 );
    }
    else if( var74.eql( (SubLObject) module0816.$ic50$ ) )
    {
      f52260( var72, var13 );
    }
    else
    {
      if( !var74.eql( (SubLObject) module0816.$ic51$ ) )
      {
        return Errors.error( (SubLObject) module0816.$ic52$, var73, var72 );
      }
      f52261( var72, var13 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52259(final SubLObject var72)
  {
    final SubLObject var73 = module0815.f52212( var72 );
    if( module0816.NIL != var73 )
    {
      return var73;
    }
    return module0811.f51798( var72 );
  }

  public static SubLObject f52260(final SubLObject var30, final SubLObject var13)
  {
    if( module0816.NIL != module0035.f2169( module0813.f52035(), (SubLObject) module0816.$ic53$ ) )
    {
      final SubLObject var31 = f52262( var30 );
      if( module0816.NIL != var31 )
      {
        return PrintLow.format( var13, (SubLObject) module0816.$ic54$, var31 );
      }
    }
    return streams_high.write_string( f52263( var30 ), var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52261(final SubLObject var75, final SubLObject var13)
  {
    if( module0816.NIL != module0035.f2169( module0813.f52035(), (SubLObject) module0816.$ic53$ ) )
    {
      final SubLObject var76 = f52264( var75 );
      return PrintLow.format( var13, (SubLObject) module0816.$ic55$, var76 );
    }
    return streams_high.write_string( f52265( var75 ), var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52262(final SubLObject var30)
  {
    if( module0018.$g577$.getGlobalValue().eql( Symbols.symbol_package( var30 ) ) && module0816.NIL == module0815.f52214( var30 ) )
    {
      final SubLObject var31 = module0813.f52032();
      if( module0816.NIL != var31 )
      {
        return module0813.f52097( var31, var30 );
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52266(final SubLObject var75)
  {
    final SubLThread var76 = SubLProcess.currentSubLThread();
    module0816.$g6470$.setDynamicValue( Numbers.add( module0816.$g6470$.getDynamicValue( var76 ), (SubLObject) module0816.ONE_INTEGER ), var76 );
    return module0816.$g6470$.getDynamicValue( var76 );
  }

  public static SubLObject f52264(final SubLObject var75)
  {
    final SubLThread var76 = SubLProcess.currentSubLThread();
    final SubLObject var77 = module0034.$g879$.getDynamicValue( var76 );
    SubLObject var78 = (SubLObject) module0816.NIL;
    if( module0816.NIL == var77 )
    {
      return f52266( var75 );
    }
    var78 = module0034.f1857( var77, (SubLObject) module0816.$ic56$, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL == var78 )
    {
      var78 = module0034.f1807( module0034.f1842( var77 ), (SubLObject) module0816.$ic56$, (SubLObject) module0816.ONE_INTEGER, (SubLObject) module0816.NIL, (SubLObject) module0816.EQ,
          (SubLObject) module0816.UNPROVIDED );
      module0034.f1860( var77, (SubLObject) module0816.$ic56$, var78 );
    }
    SubLObject var79 = module0034.f1814( var78, var75, (SubLObject) module0816.$ic57$ );
    if( var79 == module0816.$ic57$ )
    {
      var79 = Values.arg2( var76.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52266( var75 ) ) );
      module0034.f1816( var78, var75, var79, (SubLObject) module0816.UNPROVIDED );
    }
    return module0034.f1959( var79 );
  }

  public static SubLObject f52267(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = f52268( var72 );
    if( module0816.NIL != Symbols.symbol_package( var72 ) )
    {
      return Sequences.cconcatenate( (SubLObject) module0816.$ic59$, module0006.f203( var74 ) );
    }
    module0816.$g6470$.setDynamicValue( Numbers.add( module0816.$g6470$.getDynamicValue( var73 ), (SubLObject) module0816.ONE_INTEGER ), var73 );
    return Sequences.cconcatenate( (SubLObject) module0816.$ic59$, new SubLObject[] { module0006.f203( var74 ), module0816.$ic60$, module0006.f203( module0816.$g6470$.getDynamicValue( var73 ) )
    } );
  }

  public static SubLObject f52265(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = module0034.$g879$.getDynamicValue( var73 );
    SubLObject var75 = (SubLObject) module0816.NIL;
    if( module0816.NIL == var74 )
    {
      return f52267( var72 );
    }
    var75 = module0034.f1857( var74, (SubLObject) module0816.$ic58$, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL == var75 )
    {
      var75 = module0034.f1807( module0034.f1842( var74 ), (SubLObject) module0816.$ic58$, (SubLObject) module0816.ONE_INTEGER, (SubLObject) module0816.NIL, (SubLObject) module0816.EQ,
          (SubLObject) module0816.UNPROVIDED );
      module0034.f1860( var74, (SubLObject) module0816.$ic58$, var75 );
    }
    SubLObject var76 = module0034.f1814( var75, var72, (SubLObject) module0816.$ic57$ );
    if( var76 == module0816.$ic57$ )
    {
      var76 = Values.arg2( var73.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52267( var72 ) ) );
      module0034.f1816( var75, var72, var76, (SubLObject) module0816.UNPROVIDED );
    }
    return module0034.f1959( var76 );
  }

  public static SubLObject f52263(final SubLObject var72)
  {
    final SubLObject var73 = module0815.f52213( var72 );
    if( module0816.NIL != var73 )
    {
      return var73;
    }
    return f52269( var72 );
  }

  public static SubLObject f52270(final SubLObject var72)
  {
    final SubLObject var73 = f52268( var72 );
    return Sequences.cconcatenate( (SubLObject) module0816.$ic62$, module0006.f203( var73 ) );
  }

  public static SubLObject f52269(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = module0034.$g879$.getDynamicValue( var73 );
    SubLObject var75 = (SubLObject) module0816.NIL;
    if( module0816.NIL == var74 )
    {
      return f52270( var72 );
    }
    var75 = module0034.f1857( var74, (SubLObject) module0816.$ic61$, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL == var75 )
    {
      var75 = module0034.f1807( module0034.f1842( var74 ), (SubLObject) module0816.$ic61$, (SubLObject) module0816.ONE_INTEGER, (SubLObject) module0816.NIL, (SubLObject) module0816.EQ,
          (SubLObject) module0816.UNPROVIDED );
      module0034.f1860( var74, (SubLObject) module0816.$ic61$, var75 );
    }
    SubLObject var76 = module0034.f1814( var75, var72, (SubLObject) module0816.$ic57$ );
    if( var76 == module0816.$ic57$ )
    {
      var76 = Values.arg2( var73.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52270( var72 ) ) );
      module0034.f1816( var75, var72, var76, (SubLObject) module0816.UNPROVIDED );
    }
    return module0034.f1959( var76 );
  }

  public static SubLObject f52268(final SubLObject var72)
  {
    final SubLObject var73 = Symbols.symbol_name( var72 );
    return f52271( var73 );
  }

  public static SubLObject f52271(final SubLObject var83)
  {
    assert module0816.NIL != Types.stringp( var83 ) : var83;
    final SubLObject var84 = Sequences.length( var83 );
    final SubLObject var85 = (SubLObject) ( ( var84.isPositive() && module0816.NIL != Characters.charE( Strings.sublisp_char( var83, (SubLObject) module0816.ZERO_INTEGER ), (SubLObject) Characters.CHAR_asterisk ) )
        ? module0816.ONE_INTEGER
        : module0816.ZERO_INTEGER );
    final SubLObject var86 = ( var84.numG( (SubLObject) module0816.ONE_INTEGER ) && var85.numE( (SubLObject) module0816.ONE_INTEGER ) && module0816.NIL != Characters.charE( Strings.sublisp_char( var83, module0048.f_1_(
        var84 ) ), (SubLObject) Characters.CHAR_asterisk ) ) ? module0048.f_1_( var84 ) : var84;
    final SubLObject var88;
    final SubLObject var87 = var88 = module0038.f2623( var83, var85, var86 );
    SubLObject var62_87;
    SubLObject var89;
    SubLObject var90;
    SubLObject var91;
    for( var89 = ( var62_87 = Sequences.length( var88 ) ), var90 = (SubLObject) module0816.NIL, var90 = (SubLObject) module0816.ZERO_INTEGER; !var90.numGE( var62_87 ); var90 = module0048.f_1X( var90 ) )
    {
      var91 = Strings.sublisp_char( var88, var90 );
      Strings.set_char( var87, var90, f52272( Characters.char_downcase( var91 ) ) );
    }
    return var87;
  }

  public static SubLObject f52272(final SubLObject var65)
  {
    if( module0816.NIL != Characters.alphanumericp( var65 ) || module0816.NIL != Characters.charE( var65, (SubLObject) Characters.CHAR_underbar ) )
    {
      return var65;
    }
    return module0035.f2294( module0816.$g6472$.getGlobalValue(), var65, Symbols.symbol_function( (SubLObject) module0816.EQL ), (SubLObject) Characters.CHAR_X );
  }

  public static SubLObject f52252(final SubLObject var89, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var90 = SubLProcess.currentSubLThread();
    SubLObject var91 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var89, var89, (SubLObject) module0816.$ic64$ );
    var91 = var89.first();
    final SubLObject var93;
    final SubLObject var92 = var93 = var89.rest();
    var90.resetMultipleValues();
    final SubLObject var94 = f52273( var91 );
    final SubLObject var95 = var90.secondMultipleValue();
    final SubLObject var96 = var90.thirdMultipleValue();
    var90.resetMultipleValues();
    if( module0816.$ic65$ == var94 )
    {
      Errors.warn( (SubLObject) module0816.$ic66$, var91 );
      return f52252( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic67$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic68$, var91 ), ConsesLow.append( var93, (SubLObject) module0816.NIL ) ), var13,
          var48 );
    }
    final SubLObject var97 = Sequences.length( var93 );
    final SubLObject var98 = Numbers.add( var94, var95 );
    final SubLObject var99 = Numbers.max( (SubLObject) module0816.ZERO_INTEGER, Numbers.subtract( var97, var98 ) );
    final SubLObject var100 = Numbers.max( (SubLObject) module0816.ZERO_INTEGER, Numbers.subtract( var98, var97 ) );
    final SubLObject var101 = Numbers.max( (SubLObject) module0816.ZERO_INTEGER, Numbers.subtract( var94, var97 ) );
    final SubLObject var102 = (SubLObject) ( ( module0816.NIL != var96 ) ? module0816.ZERO_INTEGER : var99 );
    if( var101.isPositive() )
    {
      Errors.warn( (SubLObject) module0816.$ic69$, var91, var101 );
    }
    if( var102.isPositive() )
    {
      Errors.warn( (SubLObject) module0816.$ic70$, var91, var102 );
    }
    f52274( var91, var13 );
    streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    SubLObject var103 = (SubLObject) module0816.ZERO_INTEGER;
    if( module0816.NIL != var96 )
    {
      f52275( var97, var13 );
      var103 = Numbers.add( var103, (SubLObject) module0816.ONE_INTEGER );
    }
    SubLObject var104 = (SubLObject) module0816.NIL;
    SubLObject var105 = (SubLObject) module0816.NIL;
    SubLObject var106 = (SubLObject) module0816.NIL;
    var104 = var93;
    var105 = var104.first();
    for( var106 = (SubLObject) module0816.ZERO_INTEGER; module0816.NIL != var104; var104 = var104.rest(), var105 = var104.first(), var106 = Numbers.add( (SubLObject) module0816.ONE_INTEGER, var106 ) )
    {
      if( !var103.isZero() )
      {
        f52276( var13 );
      }
      f52244( var105, var13, module0048.f_1X( var48 ) );
      var103 = Numbers.add( var103, (SubLObject) module0816.ONE_INTEGER );
    }
    if( !var101.isPositive() )
    {
      SubLObject var107;
      for( var107 = (SubLObject) module0816.NIL, var107 = (SubLObject) module0816.ZERO_INTEGER; var107.numL( var100 ); var107 = Numbers.add( var107, (SubLObject) module0816.ONE_INTEGER ) )
      {
        if( !var103.isZero() )
        {
          f52276( var13 );
        }
        f52277( var13 );
        var103 = Numbers.add( var103, (SubLObject) module0816.ONE_INTEGER );
      }
    }
    streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52278(final SubLObject var31)
  {
    final SubLObject var32 = module0815.f52206( var31 );
    if( module0816.NIL != var32 )
    {
      return var32;
    }
    return f52279( var31 );
  }

  public static SubLObject f52280(final SubLObject var31)
  {
    final SubLObject var32 = f52268( var31 );
    return Sequences.cconcatenate( (SubLObject) module0816.$ic74$, module0006.f203( var32 ) );
  }

  public static SubLObject f52279(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    final SubLObject var33 = module0034.$g879$.getDynamicValue( var32 );
    SubLObject var34 = (SubLObject) module0816.NIL;
    if( module0816.NIL == var33 )
    {
      return f52280( var31 );
    }
    var34 = module0034.f1857( var33, (SubLObject) module0816.$ic73$, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL == var34 )
    {
      var34 = module0034.f1807( module0034.f1842( var33 ), (SubLObject) module0816.$ic73$, (SubLObject) module0816.ONE_INTEGER, (SubLObject) module0816.NIL, (SubLObject) module0816.EQ,
          (SubLObject) module0816.UNPROVIDED );
      module0034.f1860( var33, (SubLObject) module0816.$ic73$, var34 );
    }
    SubLObject var35 = module0034.f1814( var34, var31, (SubLObject) module0816.$ic57$ );
    if( var35 == module0816.$ic57$ )
    {
      var35 = Values.arg2( var32.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52280( var31 ) ) );
      module0034.f1816( var34, var31, var35, (SubLObject) module0816.UNPROVIDED );
    }
    return module0034.f1959( var35 );
  }

  public static SubLObject f52273(final SubLObject var31)
  {
    final SubLObject var32 = f52281( var31 );
    if( var32 == module0816.$ic65$ )
    {
      return Values.values( (SubLObject) module0816.$ic65$, (SubLObject) module0816.$ic65$, (SubLObject) module0816.$ic65$ );
    }
    if( var32 == module0816.$ic75$ )
    {
      return module0812.f52005( var31 );
    }
    return module0812.f52006( var32 );
  }

  public static SubLObject f52281(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    SubLObject var33 = module0815.f52209( var31 );
    if( var33 != module0816.$ic75$ )
    {
      return var33;
    }
    var33 = module0812.f51983( var31 );
    if( var33 != module0816.$ic75$ )
    {
      return var33;
    }
    var33 = module0809.f51528( var31 );
    if( var33 != module0816.$ic75$ )
    {
      return var33;
    }
    final SubLObject var34 = Symbols.symbol_name( var31 );
    if( module0816.NIL != module0038.f2684( var34, (SubLObject) module0816.$ic76$ ) )
    {
      return (SubLObject) module0816.$ic77$;
    }
    if( module0816.NIL == module0812.f51930() && module0816.NIL != Symbols.fboundp( var31 ) )
    {
      var33 = (SubLObject) module0816.$ic75$;
      SubLObject var35 = (SubLObject) module0816.NIL;
      try
      {
        var32.throwStack.push( module0816.$ic78$ );
        final SubLObject var36 = Errors.$error_handler$.currentBinding( var32 );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( (SubLObject) module0816.$ic79$ ), var32 );
          try
          {
            var33 = module0004.f86( var31 );
          }
          catch( Throwable var37 )
          {
            Errors.handleThrowable( var37, (SubLObject) module0816.NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( var36, var32 );
        }
      }
      catch( Throwable var38 )
      {
        var35 = Errors.handleThrowable( var38, (SubLObject) module0816.$ic78$ );
      }
      finally
      {
        var32.throwStack.pop();
      }
      if( var33 != module0816.$ic75$ )
      {
        return var33;
      }
      Errors.warn( (SubLObject) module0816.$ic80$, var31 );
    }
    Errors.warn( (SubLObject) module0816.$ic81$, var31 );
    return (SubLObject) module0816.$ic65$;
  }

  public static SubLObject f52276(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) module0816.$ic82$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52277(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) module0816.$ic83$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52275(final SubLObject var96, final SubLObject var13)
  {
    assert module0816.NIL != module0004.f106( var96 ) : var96;
    if( var96.numL( (SubLObject) module0816.TWENTY_INTEGER ) )
    {
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic46$, var96 ), var13, (SubLObject) module0816.UNPROVIDED );
    }
    return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic68$, var96 ), var13, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52250(final SubLObject var50)
  {
    return module0035.f2294( module0816.$g6473$.getGlobalValue(), var50, Symbols.symbol_function( (SubLObject) module0816.EQ ), (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52251(final SubLObject var51, final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var52 = SubLProcess.currentSubLThread();
    if( module0816.NIL == Errors.$ignore_mustsP$.getDynamicValue( var52 ) && module0816.NIL == module0004.f85( var51 ) )
    {
      Errors.error( (SubLObject) module0816.$ic86$, var51 );
    }
    return Functions.funcall( var51, var49, var13, var48 );
  }

  public static SubLObject f52282(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic88$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic87$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52283(final SubLObject var50, final SubLObject var56, final SubLObject var112, final SubLObject var13, final SubLObject var48)
  {
    f52274( var50, var13 );
    streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52244( var56, var13, module0048.f_1X( var48 ) );
    f52276( var13 );
    f52274( var112, var13 );
    streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52284(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic89$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic87$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52285(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic90$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic87$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52286(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic91$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic91$ );
    final SubLObject var53 = var52.rest();
    var52 = var52.first();
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    SubLObject var56 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic91$ );
    var54 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic91$ );
    var55 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic91$ );
    var56 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      final SubLObject var57;
      var52 = ( var57 = var53 );
      module0035.f2502( var51, (SubLObject) module0816.$ic92$ );
      return f52287( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic93$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic94$, var54, var56 ), (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic95$,
          (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic96$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic97$, var56 ) ), (SubLObject) ConsesLow.listS(
              (SubLObject) module0816.$ic98$, var55, (SubLObject) module0816.$ic99$ ) ), reader.bq_cons( (SubLObject) module0816.$ic100$, ConsesLow.append( var57, (SubLObject) module0816.NIL ) ) ), (SubLObject) ConsesLow
                  .list( (SubLObject) module0816.$ic101$, var54, var56 ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic91$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52288(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic102$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic102$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) module0816.NIL;
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic102$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic102$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic102$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( module0816.NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) module0816.$ic103$ );
      return f52287( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic93$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic104$, var54, var55 ), (SubLObject) ConsesLow.list(
          (SubLObject) module0816.$ic105$, var53, var55 ), ConsesLow.append( var56, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic106$, var54, var55 ) ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic102$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52289(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic107$ );
    var51 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic107$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var51, (SubLObject) module0816.$ic108$ );
    SubLObject var55 = (SubLObject) module0816.NIL;
    SubLObject var56 = (SubLObject) module0816.NIL;
    SubLObject var57 = var52;
    SubLObject var58 = (SubLObject) module0816.NIL;
    var58 = var57.first();
    while ( module0816.NIL != var57)
    {
      SubLObject var138_139;
      final SubLObject var136_137 = var138_139 = var58;
      SubLObject var59 = (SubLObject) module0816.NIL;
      SubLObject var60 = (SubLObject) module0816.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var138_139, var136_137, (SubLObject) module0816.$ic109$ );
      var59 = var138_139.first();
      var138_139 = var138_139.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var138_139, var136_137, (SubLObject) module0816.$ic109$ );
      var60 = var138_139.first();
      var138_139 = var138_139.rest();
      if( module0816.NIL == var138_139 )
      {
        var55 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic110$, var59, var60 ), var55 );
        var56 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic111$, var59 ), var56 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var136_137, (SubLObject) module0816.$ic109$ );
      }
      var57 = var57.rest();
      var58 = var57.first();
    }
    return f52287( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( Sequences.nreverse( var55 ), var54, var56, (SubLObject) module0816.NIL ) ), var13, var48 );
  }

  public static SubLObject f52290(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic107$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic107$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic112$ );
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = var51;
    SubLObject var56 = (SubLObject) module0816.NIL;
    var56 = var55.first();
    while ( module0816.NIL != var55)
    {
      SubLObject var146_147;
      final SubLObject var144_145 = var146_147 = var56;
      SubLObject var57 = (SubLObject) module0816.NIL;
      SubLObject var58 = (SubLObject) module0816.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var146_147, var144_145, (SubLObject) module0816.$ic109$ );
      var57 = var146_147.first();
      var146_147 = var146_147.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var146_147, var144_145, (SubLObject) module0816.$ic109$ );
      var58 = var146_147.first();
      var146_147 = var146_147.rest();
      if( module0816.NIL == var146_147 )
      {
        var54 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic113$, var57, var58 ), var54 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var144_145, (SubLObject) module0816.$ic109$ );
      }
      var55 = var55.rest();
      var56 = var55.first();
    }
    return f52244( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( Sequences.nreverse( var54 ), var53, (SubLObject) module0816.NIL ) ), var13, var48 );
  }

  public static SubLObject f52291(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic114$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic114$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic115$ );
      streams_high.write_string( (SubLObject) module0816.$ic116$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      streams_high.write_string( var51, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic114$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52292(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic117$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic117$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) module0816.NIL;
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic117$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic117$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic117$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( module0816.NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) module0816.$ic118$ );
      return f52290( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic112$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var55, var53 ) ), (SubLObject) ConsesLow.list(
          (SubLObject) module0816.$ic119$, var55, var54 ), ConsesLow.append( var56, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic120$, var55 ) ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic117$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52293(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL != var53 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic121$ );
      return (SubLObject) module0816.NIL;
    }
    module0035.f2502( var50, (SubLObject) module0816.$ic98$ );
    final SubLObject var54 = f52259( var51 );
    if( var54.eql( (SubLObject) module0816.$ic51$ ) )
    {
      return f52294( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic122$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) module0816.$ic48$ ) )
    {
      return f52295( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic123$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) module0816.$ic49$ ) )
    {
      return f52296( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic124$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) module0816.$ic50$ ) )
    {
      return Errors.error( (SubLObject) module0816.$ic125$, var51 );
    }
    return Errors.error( (SubLObject) module0816.$ic126$, var51 );
  }

  public static SubLObject f52295(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic123$ );
      f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic127$, var51, var52 ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic121$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52296(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic124$ );
      f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic128$, var51, var52 ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic121$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52294(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic122$ );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      f52297( var13 );
      f52244( var52, var13, module0048.f_1X( var48 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic121$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52297(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) module0816.$ic129$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52298(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic130$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic130$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic130$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic131$ );
    return f52287( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic93$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic132$, var51 ), var52, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic133$,
        var51 ), ConsesLow.append( var54, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic134$, var51 ) ) ) ), var13, var48 );
  }

  public static SubLObject f52299(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    if( module0816.$ic25$ != module0813.f52035() )
    {
      SubLObject var50 = (SubLObject) module0816.NIL;
      SubLObject var51 = (SubLObject) module0816.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic135$ );
      var50 = var49.first();
      SubLObject var52 = var49.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic135$ );
      var51 = var52.first();
      var52 = var52.rest();
      if( module0816.NIL == var52 )
      {
        module0035.f2502( var50, (SubLObject) module0816.$ic136$ );
        streams_high.write_string( (SubLObject) module0816.$ic137$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        f52244( module0038.f2623( var51, (SubLObject) module0816.ONE_INTEGER, module0048.f_1_( Sequences.length( var51 ) ) ), var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic135$ );
      }
      return (SubLObject) module0816.T;
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52300(final SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.NIL;
    }
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) module0816.$ic138$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52301(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic139$ );
    var51 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic139$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic139$ );
    var53 = var54.first();
    var54 = var54.rest();
    final SubLObject var55 = (SubLObject) ( var54.isCons() ? var54.first() : module0816.NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var54, var49, (SubLObject) module0816.$ic139$ );
    var54 = var54.rest();
    if( module0816.NIL == var54 )
    {
      if( module0816.NIL != var55 )
      {
        f52302( var55, var13 );
      }
      if( module0816.NIL != module0816.$g6471$.getDynamicValue( var50 ) )
      {
        streams_high.write_string( (SubLObject) module0816.$ic116$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      if( module0816.NIL != module0812.f51991( var52 ) )
      {
        streams_high.write_string( (SubLObject) module0816.$ic37$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      f52243( var13 );
      streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic139$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52303()
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    return module0816.$g6474$.getDynamicValue( var6 );
  }

  public static SubLObject f52304(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic140$ );
    var51 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic140$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic140$ );
    var53 = var54.first();
    final SubLObject var55;
    var54 = ( var55 = var54.rest() );
    module0035.f2502( var51, (SubLObject) module0816.$ic141$ );
    if( module0816.NIL != module0812.f51930() && module0816.NIL == Errors.$ignore_mustsP$.getDynamicValue( var50 ) && !var48.numE( (SubLObject) module0816.ZERO_INTEGER ) )
    {
      Errors.error( (SubLObject) module0816.$ic142$, var51 );
    }
    final SubLObject var56 = (SubLObject) module0816.$ic143$;
    SubLObject var57 = (SubLObject) module0816.NIL;
    final SubLObject var58 = Errors.$restarts$.currentBinding( var50 );
    try
    {
      Errors.$restarts$.bind( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var56, (SubLObject) module0816.$ic144$, var52 ), Errors.$restarts$.getDynamicValue( var50 ) ), var50 );
      try
      {
        var50.throwStack.push( var56 );
        final SubLObject var59 = module0819.f52530( var55 );
        final SubLObject var60 = f52305( var52, var53, var55 );
        if( module0816.NIL != var59 )
        {
          f52302( var59, var13 );
        }
        f52306( var52, var13, var48 );
        if( module0816.NIL != module0812.f51988( var52 ) )
        {
          streams_high.write_string( (SubLObject) module0816.$ic37$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        }
        f52245( var13, var52, var53, var48 );
        streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        final SubLObject var8_179 = module0816.$g6474$.currentBinding( var50 );
        try
        {
          module0816.$g6474$.bind( f52307( var60 ), var50 );
          f52244( var60, var13, var48 );
        }
        finally
        {
          module0816.$g6474$.rebind( var8_179, var50 );
        }
      }
      catch( Throwable var61 )
      {
        var57 = Errors.handleThrowable( var61, var56 );
      }
      finally
      {
        var50.throwStack.pop();
      }
    }
    finally
    {
      Errors.$restarts$.rebind( var58, var50 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52305(final SubLObject var83, final SubLObject var106, SubLObject var123)
  {
    final SubLThread var124 = SubLProcess.currentSubLThread();
    SubLObject var126;
    final SubLObject var125 = var126 = var123;
    SubLObject var127 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var126, var125, (SubLObject) module0816.$ic145$ );
    var127 = var126.first();
    final SubLObject var128;
    var126 = ( var128 = var126.rest() );
    if( var127.isString() )
    {
      var123 = var128;
    }
    if( module0816.NIL != f52308( var83 ) )
    {
      Errors.warn( (SubLObject) module0816.$ic146$, var83 );
      var123 = f52309( var123 );
    }
    var124.resetMultipleValues();
    final SubLObject var129 = f52310( var106 );
    final SubLObject var130 = var124.secondMultipleValue();
    var124.resetMultipleValues();
    SubLObject var131 = ConsesLow.append( var129, var123, (SubLObject) module0816.NIL );
    if( module0816.NIL != var130 )
    {
      var131 = (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic112$, var130, ConsesLow.append( var131, (SubLObject) module0816.NIL ) ) );
    }
    var131 = reader.bq_cons( (SubLObject) module0816.$ic147$, ConsesLow.append( var131, (SubLObject) module0816.NIL ) );
    final SubLObject var132 = module0814.f52178( var131 );
    return reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var132, (SubLObject) module0816.NIL ) );
  }

  public static SubLObject f52302(final SubLObject var173, final SubLObject var13)
  {
    if( module0816.$ic25$ != module0813.f52035() )
    {
      streams_high.write_string( (SubLObject) module0816.$ic148$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      streams_high.write_string( var173, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      streams_high.write_string( (SubLObject) module0816.$ic28$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      streams_high.terpri( var13 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52306(final SubLObject var187, final SubLObject var13, final SubLObject var48)
  {
    if( module0816.NIL == module0813.f52033() )
    {
      final SubLObject var188 = module0809.f51626( var187 );
      if( module0816.NIL != var188 )
      {
        f52244( var188, var13, var48 );
        streams_high.terpri( var13 );
        f52247( var13, var48 );
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52311(final SubLObject var30, final SubLObject var13, final SubLObject var48)
  {
    if( module0816.NIL == module0813.f52033() )
    {
      final SubLObject var49 = module0809.f51628( var30 );
      if( module0816.NIL != var49 )
      {
        f52244( var49, var13, var48 );
        streams_high.terpri( var13 );
        f52247( var13, var48 );
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52245(final SubLObject var13, final SubLObject var31, SubLObject var106, SubLObject var48)
  {
    if( var106 == module0816.UNPROVIDED )
    {
      var106 = (SubLObject) module0816.$ic38$;
    }
    if( var48 == module0816.UNPROVIDED )
    {
      var48 = (SubLObject) module0816.ZERO_INTEGER;
    }
    if( var106 == module0816.$ic38$ )
    {
      var106 = f52281( var31 );
    }
    if( var106 == module0816.$ic65$ )
    {
      var106 = (SubLObject) module0816.NIL;
    }
    f52243( var13 );
    streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52274( var31, var13 );
    f52312( var106, var13, var48 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52274(final SubLObject var31, final SubLObject var13)
  {
    if( module0816.NIL != module0035.f2169( module0813.f52035(), (SubLObject) module0816.$ic53$ ) )
    {
      final SubLObject var32 = f52313( var31 );
      if( module0816.NIL != var32 )
      {
        return PrintLow.format( var13, (SubLObject) module0816.$ic149$, var32 );
      }
    }
    return streams_high.write_string( f52278( var31 ), var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52313(final SubLObject var31)
  {
    if( module0018.$g577$.getGlobalValue().eql( Symbols.symbol_package( var31 ) ) && module0816.NIL == module0815.f52207( var31 ) )
    {
      final SubLObject var32 = module0813.f52032();
      if( module0816.NIL != var32 )
      {
        return module0813.f52096( var32, var31 );
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52310(final SubLObject var106)
  {
    final SubLObject var107 = conses_high.member( (SubLObject) module0816.$ic150$, var106, Symbols.symbol_function( (SubLObject) module0816.EQ ), (SubLObject) module0816.UNPROVIDED ).rest();
    SubLObject var108 = (SubLObject) module0816.NIL;
    SubLObject var109 = (SubLObject) module0816.NIL;
    SubLObject var110 = (SubLObject) module0816.NIL;
    if( module0816.NIL == var110 )
    {
      SubLObject var111 = var107;
      SubLObject var112 = (SubLObject) module0816.NIL;
      var112 = var111.first();
      while ( module0816.NIL == var110 && module0816.NIL != var111)
      {
        if( var112 == module0816.$ic151$ )
        {
          var110 = (SubLObject) module0816.T;
        }
        else if( var112.isCons() )
        {
          SubLObject var114;
          final SubLObject var113 = var114 = var112;
          SubLObject var115 = (SubLObject) module0816.NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var114, var113, (SubLObject) module0816.$ic152$ );
          var115 = var114.first();
          var114 = var114.rest();
          final SubLObject var116 = (SubLObject) ( var114.isCons() ? var114.first() : module0816.NIL );
          cdestructuring_bind.destructuring_bind_must_listp( var114, var113, (SubLObject) module0816.$ic152$ );
          var114 = var114.rest();
          final SubLObject var117 = (SubLObject) ( var114.isCons() ? var114.first() : module0816.NIL );
          cdestructuring_bind.destructuring_bind_must_listp( var114, var113, (SubLObject) module0816.$ic152$ );
          var114 = var114.rest();
          if( module0816.NIL == var114 )
          {
            if( module0816.NIL != var117 )
            {
              var108 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var117, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic153$, var115 ) ), var108 );
            }
            var109 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic154$, var115, var116 ), var109 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var113, (SubLObject) module0816.$ic152$ );
          }
        }
        else
        {
          var109 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic154$, var112, (SubLObject) module0816.$ic155$ ), var109 );
        }
        var111 = var111.rest();
        var112 = var111.first();
      }
    }
    return Values.values( Sequences.nreverse( var109 ), Sequences.nreverse( var108 ) );
  }

  public static SubLObject f52243(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) module0816.$ic156$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52312(final SubLObject var106, final SubLObject var13, final SubLObject var48)
  {
    if( module0816.NIL == var106 )
    {
      streams_high.write_string( (SubLObject) module0816.$ic157$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      return (SubLObject) module0816.NIL;
    }
    streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    SubLObject var107 = (SubLObject) module0816.ZERO_INTEGER;
    SubLObject var108 = (SubLObject) module0816.NIL;
    SubLObject var109 = (SubLObject) module0816.NIL;
    SubLObject var110 = (SubLObject) module0816.NIL;
    var108 = var106;
    var109 = var108.first();
    for( var110 = (SubLObject) module0816.ZERO_INTEGER; module0816.NIL != var108; var108 = var108.rest(), var109 = var108.first(), var110 = Numbers.add( (SubLObject) module0816.ONE_INTEGER, var110 ) )
    {
      if( var109 != module0816.$ic150$ )
      {
        if( !var107.isZero() )
        {
          f52314( var13 );
        }
        if( module0816.NIL == f52303() )
        {
          f52243( var13 );
          streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        }
        f52315( var109, var13 );
        var107 = Numbers.add( var107, (SubLObject) module0816.ONE_INTEGER );
      }
    }
    streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    if( module0816.NIL != f52303() )
    {
      SubLObject var111 = var106;
      SubLObject var112 = (SubLObject) module0816.NIL;
      var112 = var111.first();
      while ( module0816.NIL != var111)
      {
        if( var112 != module0816.$ic150$ )
        {
          final SubLObject var113 = f52316( var112 );
          f52246( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic113$, var113 ), var13, var48 );
        }
        var111 = var111.rest();
        var112 = var111.first();
      }
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52314(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) module0816.$ic82$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52315(final SubLObject var104, final SubLObject var13)
  {
    return f52244( f52316( var104 ), var13, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52316(final SubLObject var104)
  {
    return var104.isCons() ? var104.first() : var104;
  }

  public static SubLObject f52307(final SubLObject var49)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    return (SubLObject) SubLObjectFactory.makeBoolean( module0816.NIL != module0035.f2434( (SubLObject) module0816.$ic131$, var49 ) || module0816.NIL != module0035.f2434( (SubLObject) module0816.$ic92$, var49 ) );
  }

  public static SubLObject f52308(final SubLObject var83)
  {
    final SubLObject var84 = module0812.f51930();
    if( module0816.NIL != var84 )
    {
      return module0812.f51994( var84, var83 );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52309(SubLObject var123)
  {
    final SubLThread var124 = SubLProcess.currentSubLThread();
    var123 = module0036.f2531( var123, (SubLObject) module0816.$ic158$, (SubLObject) module0816.$ic159$, (SubLObject) module0816.UNPROVIDED );
    final SubLObject var125 = module0811.f51788( (SubLObject) module0816.$ic160$ );
    final SubLObject var126 = (SubLObject) module0816.$ic161$;
    final SubLObject var127 = (SubLObject) module0816.$ic162$;
    return (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic112$, (SubLObject) ConsesLow.list( reader.bq_cons( var126, (SubLObject) module0816.$ic155$ ) ), (SubLObject) ConsesLow
        .listS( (SubLObject) module0816.$ic92$, (SubLObject) ConsesLow.list( var125, var126, var127 ), ConsesLow.append( var123, (SubLObject) module0816.NIL ) ), (SubLObject) ConsesLow.list(
            (SubLObject) module0816.$ic163$, var126 ) ) );
  }

  public static SubLObject f52317(final SubLObject var56)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( module0816.NIL != module0035.f2501( var56, (SubLObject) module0816.$ic163$ ) && module0816.NIL != module0035.f1995( var56, (SubLObject) module0816.TWO_INTEGER,
        (SubLObject) module0816.UNPROVIDED ) );
  }

  public static SubLObject f52318(final SubLObject var199)
  {
    SubLObject var200 = (SubLObject) module0816.NIL;
    SubLObject var201 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var199, var199, (SubLObject) module0816.$ic164$ );
    var200 = var199.first();
    SubLObject var202 = var199.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var202, var199, (SubLObject) module0816.$ic164$ );
    var201 = var202.first();
    var202 = var202.rest();
    if( module0816.NIL == var202 )
    {
      module0035.f2502( var200, (SubLObject) module0816.$ic163$ );
      final SubLObject var203 = module0811.f51788( (SubLObject) module0816.$ic160$ );
      return (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic165$, var203, var201 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var199, (SubLObject) module0816.$ic164$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52319(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic140$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic140$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic140$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic166$ );
    return f52244( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic141$, var51, var52, ConsesLow.append( var54, (SubLObject) module0816.NIL ) ), var13, var48 );
  }

  public static SubLObject f52320(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) module0816.$ic167$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52321(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) module0816.$ic168$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52322(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic169$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic170$ );
    final SubLObject var210_211;
    final SubLObject var208_209 = var210_211 = var52;
    final SubLObject var53 = cdestructuring_bind.property_list_member( (SubLObject) module0816.$ic171$, var210_211 );
    final SubLObject var54 = (SubLObject) ( ( module0816.NIL != var53 ) ? conses_high.cadr( var53 ) : module0816.NIL );
    PrintLow.format( var13, (SubLObject) module0816.$ic172$, var54 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52323(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic173$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) module0816.UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52324(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic174$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) module0816.UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52325(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic175$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) module0816.UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52326(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic176$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) module0816.UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52327(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) module0816.$ic177$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52328(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic178$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic178$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic178$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic178$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( module0816.NIL == var54 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic179$ );
      streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic180$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var52, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic181$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic178$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52329(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic182$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic95$ );
    if( module0816.NIL == var52 )
    {
      return f52287( (SubLObject) module0816.$ic183$, var13, var48 );
    }
    SubLObject var232_233;
    final SubLObject var230_231 = var232_233 = var52;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var232_233, var230_231, (SubLObject) module0816.$ic184$ );
    var53 = var232_233.first();
    final SubLObject var54;
    var232_233 = ( var54 = var232_233.rest() );
    SubLObject var238_239;
    final SubLObject var236_237 = var238_239 = var53;
    SubLObject var55 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var238_239, var236_237, (SubLObject) module0816.$ic185$ );
    var55 = var238_239.first();
    final SubLObject var56;
    var238_239 = ( var56 = var238_239.rest() );
    streams_high.write_string( (SubLObject) module0816.$ic186$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52244( var55, var13, module0048.f_1X( var48 ) );
    streams_high.write_string( (SubLObject) module0816.$ic187$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52287( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var56, (SubLObject) module0816.NIL ) ), var13, var48 );
    SubLObject var57 = var54;
    SubLObject var58 = (SubLObject) module0816.NIL;
    var58 = var57.first();
    while ( module0816.NIL != var57)
    {
      SubLObject var245_246;
      final SubLObject var243_244 = var245_246 = var58;
      SubLObject var240_247 = (SubLObject) module0816.NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var245_246, var243_244, (SubLObject) module0816.$ic185$ );
      var240_247 = var245_246.first();
      final SubLObject var241_248;
      var245_246 = ( var241_248 = var245_246.rest() );
      if( var240_247.equal( (SubLObject) module0816.$ic100$ ) )
      {
        if( module0816.NIL != var241_248 )
        {
          streams_high.write_string( (SubLObject) module0816.$ic188$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
          f52287( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var241_248, (SubLObject) module0816.NIL ) ), var13, var48 );
        }
      }
      else
      {
        streams_high.write_string( (SubLObject) module0816.$ic189$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        f52244( var240_247, var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) module0816.$ic187$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        f52287( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var241_248, (SubLObject) module0816.NIL ) ), var13, var48 );
      }
      var57 = var57.rest();
      var58 = var57.first();
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52287(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic190$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic93$ );
    streams_high.write_string( (SubLObject) module0816.$ic191$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    SubLObject var53 = var52;
    SubLObject var54 = (SubLObject) module0816.NIL;
    var54 = var53.first();
    while ( module0816.NIL != var53)
    {
      f52246( var54, var13, module0048.f_1X( var48 ) );
      var53 = var53.rest();
      var54 = var53.first();
    }
    streams_high.terpri( var13 );
    f52247( var13, var48 );
    streams_high.write_string( (SubLObject) module0816.$ic192$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52330(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52331(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic193$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic193$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic163$ );
      streams_high.write_string( (SubLObject) module0816.$ic194$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic193$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52332(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic195$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic195$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic196$ );
    streams_high.write_string( (SubLObject) module0816.$ic197$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52244( var51, var13, module0048.f_1X( var48 ) );
    streams_high.write_string( (SubLObject) module0816.$ic187$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52244( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var53, (SubLObject) module0816.NIL ) ), var13, var48 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52333(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic198$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic199$ );
    if( module0816.NIL == var52 )
    {
      f52334( (SubLObject) module0816.$ic100$, var13, module0048.f_1X( var48 ) );
    }
    else if( module0816.NIL != module0035.f1997( var52 ) )
    {
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
      SubLObject var53 = var52.rest();
      SubLObject var54 = (SubLObject) module0816.NIL;
      var54 = var53.first();
      while ( module0816.NIL != var53)
      {
        streams_high.terpri( var13 );
        f52247( var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) module0816.$ic200$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        f52244( var54, var13, module0048.f_1X( var48 ) );
        var53 = var53.rest();
        var54 = var53.first();
      }
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52335(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic201$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) module0816.NIL;
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    SubLObject var56 = (SubLObject) module0816.NIL;
    SubLObject var57 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    var55 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    var56 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic201$ );
    var57 = var51.first();
    var51 = var51.rest();
    if( module0816.NIL == var51 )
    {
      final SubLObject var58;
      var51 = ( var58 = var52 );
      module0035.f2502( var50, (SubLObject) module0816.$ic202$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic112$, (SubLObject) ConsesLow.list( reader.bq_cons( var56, (SubLObject) module0816.$ic155$ ) ), (SubLObject) ConsesLow.listS(
          (SubLObject) module0816.$ic203$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic122$, var56, (SubLObject) ConsesLow.listS(
              (SubLObject) module0816.$ic204$, var55, (SubLObject) module0816.$ic155$ ) ) ), (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic96$, var56 ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
                  (SubLObject) module0816.$ic122$, var56, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic204$, var55, var56 ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic98$, var53,
                      (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic205$, var55, var56 ) ), (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic98$, var54, (SubLObject) ConsesLow.list(
                          (SubLObject) module0816.$ic206$, var55, var56 ) ), ConsesLow.append( var58, (SubLObject) module0816.NIL ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic201$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52336(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic207$ );
    var50 = var49.first();
    final SubLObject var51 = var49.rest();
    if( module0816.NIL == var51 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic208$ );
      streams_high.write_string( (SubLObject) module0816.$ic209$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic207$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52337(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic210$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic210$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) module0816.NIL;
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic210$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic210$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) module0816.$ic210$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( module0816.NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) module0816.$ic203$ );
      streams_high.write_string( (SubLObject) module0816.$ic211$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      if( module0816.NIL != var53 )
      {
        SubLObject var275_276;
        final SubLObject var273_274 = var275_276 = var53;
        SubLObject var57 = (SubLObject) module0816.NIL;
        SubLObject var58 = (SubLObject) module0816.NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var275_276, var273_274, (SubLObject) module0816.$ic212$ );
        var57 = var275_276.first();
        var275_276 = ( var58 = var275_276.rest() );
        f52244( var57, var13, module0048.f_1X( var48 ) );
        SubLObject var59 = var58;
        SubLObject var60 = (SubLObject) module0816.NIL;
        var60 = var59.first();
        while ( module0816.NIL != var59)
        {
          f52276( var13 );
          f52244( var60, var13, module0048.f_1X( var48 ) );
          var59 = var59.rest();
          var60 = var59.first();
        }
      }
      streams_high.write_string( (SubLObject) module0816.$ic213$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var54, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic213$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      if( module0816.NIL != var55 )
      {
        SubLObject var282_283;
        final SubLObject var280_281 = var282_283 = var55;
        SubLObject var61 = (SubLObject) module0816.NIL;
        SubLObject var62 = (SubLObject) module0816.NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var282_283, var280_281, (SubLObject) module0816.$ic214$ );
        var61 = var282_283.first();
        var282_283 = ( var62 = var282_283.rest() );
        f52244( var61, var13, module0048.f_1X( var48 ) );
        SubLObject var59 = var62;
        SubLObject var63 = (SubLObject) module0816.NIL;
        var63 = var59.first();
        while ( module0816.NIL != var59)
        {
          f52276( var13 );
          f52244( var63, var13, module0048.f_1X( var48 ) );
          var59 = var59.rest();
          var63 = var59.first();
        }
      }
      streams_high.write_string( (SubLObject) module0816.$ic187$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var56, (SubLObject) module0816.NIL ) ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic210$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52338(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic215$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic215$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic215$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic216$ );
      f52339( var51, var52, var13 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic215$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52339(final SubLObject var289, final SubLObject var290, final SubLObject var13)
  {
    streams_high.write_string( (SubLObject) module0816.$ic217$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    f52256( var289, var13 );
    streams_high.write_string( (SubLObject) module0816.$ic218$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52340(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic219$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic219$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic219$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic219$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( module0816.NIL == var54 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic220$ );
      streams_high.write_string( (SubLObject) module0816.$ic221$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52339( var51, var52, var13 );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic219$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52341(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic222$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic222$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic68$ );
      SubLObject var53 = (SubLObject) module0816.NIL;
      if( var51.isString() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic223$, var51 );
      }
      else if( var51.isSymbol() )
      {
        var53 = f52342( var51 );
      }
      else if( module0816.NIL != f52343( var51 ) )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic224$, var51 );
      }
      else if( var51.isInteger() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic225$, print_high.princ_to_string( var51 ) );
      }
      else if( var51.isDouble() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic226$, var51 );
      }
      else if( var51.isChar() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic227$, Characters.char_code( var51 ) );
      }
      else if( var51.isPackage() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic228$, Packages.package_name( var51 ) );
      }
      else if( module0816.NIL != Guids.guid_p( var51 ) )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic229$, Guids.guid_to_string( var51 ) );
      }
      else
      {
        Errors.error( (SubLObject) module0816.$ic230$, var51 );
      }
      f52244( var53, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic222$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52342(final SubLObject var296)
  {
    final SubLThread var297 = SubLProcess.currentSubLThread();
    final SubLObject var298 = module0813.f52099( var296 );
    final SubLObject var299 = module0018.f953( var296 );
    if( module0816.NIL == var299 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic231$, var298 );
    }
    if( var299.eql( module0018.$g575$.getGlobalValue() ) )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic232$, var298 );
    }
    if( var296.eql( Packages.find_symbol( var298, Packages.$package$.getDynamicValue( var297 ) ) ) )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic233$, var298 );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic234$, var298, Packages.package_name( var299 ) );
  }

  public static SubLObject f52343(final SubLObject var56)
  {
    return (SubLObject) SubLObjectFactory.makeBoolean( var56.isInteger() && var56.numLE( (SubLObject) module0816.$ic235$ ) && var56.numGE( (SubLObject) module0816.$ic236$ ) );
  }

  public static SubLObject f52344(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic237$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic237$ );
    var51 = var52.first();
    var52 = var52.rest();
    final SubLObject var53 = (SubLObject) ( var52.isCons() ? var52.first() : module0816.NIL );
    final SubLObject var54 = Types.consp( var52 );
    cdestructuring_bind.destructuring_bind_must_listp( var52, var49, (SubLObject) module0816.$ic237$ );
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic113$ );
      if( module0816.NIL != f52303() )
      {
        streams_high.write_string( (SubLObject) module0816.$ic238$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      f52243( var13 );
      streams_high.write_string( (SubLObject) module0816.$ic35$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var51, var13, var48 );
      if( module0816.NIL != var54 )
      {
        f52297( var13 );
        f52244( var53, var13, var48 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic237$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52345(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic164$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic164$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic239$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic240$, var51 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic164$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52334(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic45$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic45$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic241$ );
      final SubLObject var53 = var51;
      if( var53.eql( (SubLObject) module0816.$ic242$ ) )
      {
        streams_high.write_string( (SubLObject) module0816.$ic243$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      else if( var53.eql( (SubLObject) module0816.$ic244$ ) )
      {
        streams_high.write_string( (SubLObject) module0816.$ic245$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      }
      else
      {
        Errors.error( (SubLObject) module0816.$ic246$, var51 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic45$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52346(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic164$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic164$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic247$ );
      streams_high.write_string( (SubLObject) module0816.$ic248$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic249$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic164$ );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52347(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic250$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic250$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic250$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) module0816.$ic251$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic252$, var51, var52 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic250$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52348(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic198$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) module0816.$ic253$ );
    if( module0816.NIL == var52 )
    {
      f52334( (SubLObject) module0816.$ic254$, var13, module0048.f_1X( var48 ) );
    }
    else if( module0816.NIL != module0035.f1997( var52 ) )
    {
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
      SubLObject var53 = var52.rest();
      SubLObject var54 = (SubLObject) module0816.NIL;
      var54 = var53.first();
      while ( module0816.NIL != var53)
      {
        streams_high.terpri( var13 );
        f52247( var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) module0816.$ic255$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        f52244( var54, var13, module0048.f_1X( var48 ) );
        var53 = var53.rest();
        var54 = var53.first();
      }
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52349(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    SubLObject var54 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic256$ );
    var50 = var49.first();
    SubLObject var55 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) module0816.$ic256$ );
    var51 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) module0816.$ic256$ );
    var52 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) module0816.$ic256$ );
    var53 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) module0816.$ic256$ );
    var54 = var55.first();
    var55 = var55.rest();
    if( module0816.NIL == var55 )
    {
      final SubLObject var56 = module0813.f52099( var51 );
      module0035.f2502( var50, (SubLObject) module0816.$ic257$ );
      streams_high.write_string( (SubLObject) module0816.$ic258$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52274( var51, var13 );
      f52276( var13 );
      f52244( var56, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var52, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52334( (SubLObject) ( ( module0816.NIL != var54 ) ? module0816.$ic100$ : module0816.$ic254$ ), var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic256$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52350(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    SubLObject var53 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic259$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic259$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic259$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) module0816.$ic259$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( module0816.NIL == var54 )
    {
      final SubLObject var55 = module0813.f52099( var52 );
      module0035.f2502( var50, (SubLObject) module0816.$ic260$ );
      print_high.princ( var51, var13 );
      streams_high.write_string( (SubLObject) module0816.$ic71$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52260( var52, var13 );
      f52276( var13 );
      f52244( var55, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic259$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52351(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic261$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic261$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      final SubLObject var53 = module0813.f52099( var51 );
      module0035.f2502( var50, (SubLObject) module0816.$ic262$ );
      streams_high.write_string( (SubLObject) module0816.$ic263$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
      f52274( var51, var13 );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) module0816.$ic72$, var13, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic261$ );
    }
    return (SubLObject) module0816.T;
  }

  public static SubLObject f52352(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic264$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic264$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic265$ );
    SubLObject var54 = reader.bq_cons( (SubLObject) module0816.$ic93$, ConsesLow.append( var53, (SubLObject) module0816.NIL ) );
    var54 = module0814.f52164( var54 );
    return f52244( var54, var13, var48 );
  }

  public static SubLObject f52353(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic266$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic266$ );
    final SubLObject var53 = var52.rest();
    var52 = var52.first();
    SubLObject var54 = (SubLObject) module0816.NIL;
    SubLObject var55 = (SubLObject) module0816.NIL;
    SubLObject var56 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic266$ );
    var54 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic266$ );
    var55 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic266$ );
    var56 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      final SubLObject var57;
      var52 = ( var57 = var53 );
      module0035.f2502( var51, (SubLObject) module0816.$ic267$ );
      final SubLObject var58 = (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic108$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic268$, var54 ) ), ConsesLow.append( var57,
          (SubLObject) module0816.NIL ) );
      return f52244( var58, var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic266$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52354(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) module0816.NIL;
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic269$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic269$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic269$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) module0816.$ic270$ );
    return f52287( (SubLObject) ConsesLow.listS( (SubLObject) module0816.$ic93$, (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic271$, var51, var52 ), ConsesLow.append( var54, (SubLObject) ConsesLow.list(
        (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic272$, var51, var52 ) ) ) ), var13, var48 );
  }

  public static SubLObject f52355(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var333_334 = (SubLObject) module0816.NIL;
    SubLObject var52 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic273$ );
    var51 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic273$ );
    var333_334 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) module0816.$ic273$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( module0816.NIL == var53 )
    {
      module0035.f2502( var51, (SubLObject) module0816.$ic274$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) module0816.$ic275$, var52 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic273$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52356(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) module0816.NIL;
    SubLObject var333_337 = (SubLObject) module0816.NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) module0816.$ic276$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) module0816.$ic276$ );
    var333_337 = var52.first();
    var52 = var52.rest();
    if( module0816.NIL == var52 )
    {
      module0035.f2502( var51, (SubLObject) module0816.$ic277$ );
      return f52244( (SubLObject) module0816.$ic278$, var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) module0816.$ic276$ );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52248(SubLObject var89)
  {
    var89 = module0815.f52201( var89 );
    var89 = module0815.f52203( var89 );
    return var89;
  }

  public static SubLObject f52357(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341, final SubLObject var342, final SubLObject var343)
  {
    assert module0816.NIL != Types.stringp( var338 ) : var338;
    assert module0816.NIL != Types.stringp( var339 ) : var339;
    final SubLObject var344 = module0813.f52154( var338, var343 );
    final SubLObject var345 = module0813.f52155( var343 );
    f52358( var338, var339, var340, var341 );
    f52359( var338, var339, var340, var342 );
    f52360( var338, var339, var340, var343 );
    f52361( var339, var340, var344 );
    f52362( var339, var340, var345 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52363(final SubLObject var59)
  {
    assert module0816.NIL != Types.stringp( var59 ) : var59;
    return Strings.string_downcase( var59, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52364(final SubLObject var346, SubLObject var347)
  {
    if( var347 == module0816.UNPROVIDED )
    {
      var347 = (SubLObject) module0816.NIL;
    }
    if( module0816.NIL != var347 )
    {
      return PrintLow.format( (SubLObject) module0816.NIL, (SubLObject) module0816.$ic279$, var347 );
    }
    return f52363( var346 );
  }

  public static SubLObject f52365(final SubLObject var346)
  {
    assert module0816.NIL != Types.stringp( var346 ) : var346;
    final SubLObject var347 = module0813.f52032();
    final SubLObject var348 = (SubLObject) ( ( module0816.NIL != var347 ) ? module0813.f52095( var347, var346 ) : module0816.NIL );
    return f52364( var346, var348 );
  }

  public static SubLObject f52366(final SubLObject var59)
  {
    assert module0816.NIL != Types.stringp( var59 ) : var59;
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_hyphen, (SubLObject) Characters.CHAR_underbar, Strings.string_downcase( var59, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ),
        (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52367(final SubLObject var59)
  {
    assert module0816.NIL != Types.stringp( var59 ) : var59;
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_hyphen, (SubLObject) Characters.CHAR_underbar, Strings.string_upcase( var59, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED ),
        (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52358(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341)
  {
    final SubLThread var342 = SubLProcess.currentSubLThread();
    final SubLObject var343 = f52363( var338 );
    final SubLObject var344 = f52366( var338 );
    SubLObject var345 = module0813.f52128( var339, var340, var343, (SubLObject) module0816.$ic280$ );
    if( module0816.NIL == module0813.f52030() )
    {
      var345 = (SubLObject) module0816.$ic5$;
    }
    final SubLObject var346 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var342 );
    final SubLObject var347 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var342 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var342 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var342 ), var342 );
      final SubLObject var348 = var345;
      SubLObject var349 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_352 = stream_macros.$stream_requires_locking$.currentBinding( var342 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var342 );
          var349 = compatibility.open_text( var348, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_352, var342 );
        }
        if( !var349.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var348 );
        }
        final SubLObject var13_353 = var349;
        f52232( var13_353, var345, (SubLObject) module0816.UNPROVIDED );
        PrintLow.format( var13_353, (SubLObject) module0816.$ic281$, var343 );
        PrintLow.format( var13_353, (SubLObject) module0816.$ic282$, var344 );
        SubLObject var350 = (SubLObject) module0816.NIL;
        SubLObject var351 = (SubLObject) module0816.NIL;
        SubLObject var352 = (SubLObject) module0816.NIL;
        var350 = var341;
        var351 = var350.first();
        for( var352 = (SubLObject) module0816.ZERO_INTEGER; module0816.NIL != var350; var350 = var350.rest(), var351 = var350.first(), var352 = Numbers.add( (SubLObject) module0816.ONE_INTEGER, var352 ) )
        {
          PrintLow.format( var13_353, (SubLObject) module0816.$ic283$ );
          f52274( var351, var13_353 );
          PrintLow.format( var13_353, (SubLObject) module0816.$ic284$ );
          if( module0816.TWO_INTEGER.numE( Numbers.mod( var352, (SubLObject) module0816.THREE_INTEGER ) ) )
          {
            streams_high.terpri( var13_353 );
          }
        }
        PrintLow.format( var13_353, (SubLObject) module0816.$ic285$ );
      }
      finally
      {
        final SubLObject var8_353 = Threads.$is_thread_performing_cleanupP$.currentBinding( var342 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var342 );
          if( var349.isStream() )
          {
            streams_high.close( var349, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_353, var342 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var347, var342 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var346, var342 );
    }
    return var345;
  }

  public static SubLObject f52359(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var356)
  {
    final SubLThread var357 = SubLProcess.currentSubLThread();
    final SubLObject var358 = f52363( var338 );
    final SubLObject var359 = f52366( var338 );
    final SubLObject var360 = module0813.f52128( var339, var340, var358, (SubLObject) module0816.$ic286$ );
    final SubLObject var361 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var357 );
    final SubLObject var362 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var357 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var357 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var357 ), var357 );
      final SubLObject var363 = var360;
      SubLObject var364 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_359 = stream_macros.$stream_requires_locking$.currentBinding( var357 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var357 );
          var364 = compatibility.open_text( var363, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_359, var357 );
        }
        if( !var364.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var363 );
        }
        final SubLObject var13_360 = var364;
        f52232( var13_360, var360, (SubLObject) module0816.UNPROVIDED );
        streams_high.terpri( var13_360 );
        streams_high.terpri( var13_360 );
        streams_high.write_string( (SubLObject) module0816.$ic13$, var13_360, (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
        final SubLObject var365 = f52367( var338 );
        PrintLow.format( var13_360, (SubLObject) module0816.$ic287$ );
        PrintLow.format( var13_360, (SubLObject) module0816.$ic16$, var365 );
        PrintLow.format( var13_360, (SubLObject) module0816.$ic288$ );
        SubLObject var366 = var356;
        SubLObject var367 = (SubLObject) module0816.NIL;
        var367 = var366.first();
        while ( module0816.NIL != var366)
        {
          SubLObject var369;
          final SubLObject var368 = var369 = var367;
          SubLObject var370 = (SubLObject) module0816.NIL;
          SubLObject var371 = (SubLObject) module0816.NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var369, var368, (SubLObject) module0816.$ic289$ );
          var370 = var369.first();
          var369 = var369.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var369, var368, (SubLObject) module0816.$ic289$ );
          var371 = var369.first();
          var369 = var369.rest();
          if( module0816.NIL == var369 )
          {
            PrintLow.format( var13_360, (SubLObject) module0816.$ic290$, f52368( var370 ), f52365( var371 ) );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var368, (SubLObject) module0816.$ic289$ );
          }
          var366 = var366.rest();
          var367 = var366.first();
        }
        PrintLow.format( var13_360, (SubLObject) module0816.$ic291$, var359 );
      }
      finally
      {
        final SubLObject var8_360 = Threads.$is_thread_performing_cleanupP$.currentBinding( var357 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var357 );
          if( var364.isStream() )
          {
            streams_high.close( var364, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_360, var357 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var362, var357 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var361, var357 );
    }
    return var360;
  }

  public static SubLObject f52368(final SubLObject var365)
  {
    return Strings.string_downcase( module0075.f5194( var365, (SubLObject) module0816.$ic292$, (SubLObject) module0816.UNPROVIDED ), (SubLObject) module0816.UNPROVIDED, (SubLObject) module0816.UNPROVIDED );
  }

  public static SubLObject f52360(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var343)
  {
    final SubLThread var344 = SubLProcess.currentSubLThread();
    SubLObject var345 = module0813.f52128( var339, var340, (SubLObject) module0816.$ic293$, (SubLObject) module0816.$ic294$ );
    if( module0816.NIL == module0813.f52030() )
    {
      var345 = (SubLObject) module0816.$ic5$;
    }
    final SubLObject var346 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var344 );
    final SubLObject var347 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var344 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var344 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var344 ), var344 );
      final SubLObject var348 = var345;
      SubLObject var349 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_369 = stream_macros.$stream_requires_locking$.currentBinding( var344 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var344 );
          var349 = compatibility.open_text( var348, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_369, var344 );
        }
        if( !var349.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var348 );
        }
        final SubLObject var13_370 = var349;
        f52238( var13_370 );
        streams_high.terpri( var13_370 );
        SubLObject var350 = var343;
        SubLObject var351 = (SubLObject) module0816.NIL;
        var351 = var350.first();
        while ( module0816.NIL != var350)
        {
          SubLObject var353;
          final SubLObject var352 = var353 = var351;
          SubLObject var354 = (SubLObject) module0816.NIL;
          SubLObject var355 = (SubLObject) module0816.NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var353, var352, (SubLObject) module0816.$ic295$ );
          var354 = var353.first();
          var353 = var353.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var353, var352, (SubLObject) module0816.$ic295$ );
          var355 = var353.first();
          var353 = var353.rest();
          if( module0816.NIL == var353 )
          {
            final SubLObject var356 = ( module0816.NIL != var354 ) ? module0035.f2114( var354 ) : var338;
            f52369( var13_370, var338, var356, var354, var355 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var352, (SubLObject) module0816.$ic295$ );
          }
          var350 = var350.rest();
          var351 = var350.first();
        }
      }
      finally
      {
        final SubLObject var8_370 = Threads.$is_thread_performing_cleanupP$.currentBinding( var344 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var344 );
          if( var349.isStream() )
          {
            streams_high.close( var349, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_370, var344 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var347, var344 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var346, var344 );
    }
    return var345;
  }

  public static SubLObject f52369(final SubLObject var13, final SubLObject var338, final SubLObject var375, final SubLObject var365, final SubLObject var374)
  {
    final SubLObject var376 = f52367( var375 );
    final SubLObject var377 = f52363( var375 );
    final SubLObject var378 = f52363( var338 );
    PrintLow.format( var13, (SubLObject) module0816.$ic296$, var376 );
    if( module0816.NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic297$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    SubLObject var379 = var374;
    SubLObject var380 = (SubLObject) module0816.NIL;
    var380 = var379.first();
    while ( module0816.NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic298$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) module0816.$ic299$, var376 );
    if( module0816.NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic300$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    var379 = var374;
    var380 = (SubLObject) module0816.NIL;
    var380 = var379.first();
    while ( module0816.NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic301$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) module0816.$ic302$, var376 );
    if( module0816.NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic303$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    var379 = var374;
    var380 = (SubLObject) module0816.NIL;
    var380 = var379.first();
    while ( module0816.NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic304$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) module0816.$ic305$, var377, var376 );
    return var375;
  }

  public static SubLObject f52361(final SubLObject var339, final SubLObject var340, final SubLObject var344)
  {
    final SubLThread var345 = SubLProcess.currentSubLThread();
    SubLObject var346 = module0813.f52128( var339, var340, (SubLObject) module0816.$ic306$, (SubLObject) module0816.$ic294$ );
    if( module0816.NIL == module0813.f52030() )
    {
      var346 = (SubLObject) module0816.$ic5$;
    }
    final SubLObject var347 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var345 );
    final SubLObject var348 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var345 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var345 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var345 ), var345 );
      final SubLObject var349 = var346;
      SubLObject var350 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_381 = stream_macros.$stream_requires_locking$.currentBinding( var345 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var345 );
          var350 = compatibility.open_text( var349, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_381, var345 );
        }
        if( !var350.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var349 );
        }
        final SubLObject var13_382 = var350;
        f52238( var13_382 );
        streams_high.terpri( var13_382 );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) module0816.$ic307$ ), (SubLObject) module0816.$ic308$, (SubLObject) module0816.$ic309$, (SubLObject) module0816.$ic310$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) module0816.$ic307$ ), (SubLObject) module0816.$ic311$, (SubLObject) module0816.$ic309$, (SubLObject) module0816.$ic312$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) module0816.$ic307$ ), (SubLObject) module0816.$ic313$, (SubLObject) module0816.$ic309$, (SubLObject) module0816.$ic314$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) module0816.$ic315$ ), (SubLObject) module0816.$ic316$, (SubLObject) module0816.$ic317$, (SubLObject) module0816.$ic318$ );
      }
      finally
      {
        final SubLObject var8_382 = Threads.$is_thread_performing_cleanupP$.currentBinding( var345 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var345 );
          if( var350.isStream() )
          {
            streams_high.close( var350, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_382, var345 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var348, var345 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var347, var345 );
    }
    return var346;
  }

  public static SubLObject f52370(final SubLObject var13, final SubLObject var344, final SubLObject var384, final SubLObject var385, final SubLObject var386, final SubLObject var387)
  {
    PrintLow.format( var13, (SubLObject) module0816.$ic319$, var385 );
    SubLObject var388 = var344;
    SubLObject var389 = (SubLObject) module0816.NIL;
    var389 = var388.first();
    while ( module0816.NIL != var388)
    {
      PrintLow.format( var13, (SubLObject) module0816.$ic320$, new SubLObject[] { var386, Functions.funcall( var384, var389 ), var387
      } );
      var388 = var388.rest();
      var389 = var388.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52362(final SubLObject var339, final SubLObject var340, final SubLObject var345)
  {
    final SubLThread var346 = SubLProcess.currentSubLThread();
    SubLObject var347 = module0813.f52128( var339, var340, (SubLObject) module0816.$ic321$, (SubLObject) module0816.$ic294$ );
    if( module0816.NIL == module0813.f52030() )
    {
      var347 = (SubLObject) module0816.$ic5$;
    }
    final SubLObject var348 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var346 );
    final SubLObject var349 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var346 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) module0816.$ic2$, var346 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var346 ), var346 );
      final SubLObject var350 = var347;
      SubLObject var351 = (SubLObject) module0816.NIL;
      try
      {
        final SubLObject var8_390 = stream_macros.$stream_requires_locking$.currentBinding( var346 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) module0816.NIL, var346 );
          var351 = compatibility.open_text( var350, (SubLObject) module0816.$ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_390, var346 );
        }
        if( !var351.isStream() )
        {
          Errors.error( (SubLObject) module0816.$ic4$, var350 );
        }
        final SubLObject var13_391 = var351;
        f52238( var13_391 );
        PrintLow.format( var13_391, (SubLObject) module0816.$ic322$ );
        PrintLow.format( var13_391, (SubLObject) module0816.$ic323$ );
        SubLObject var352 = (SubLObject) module0816.NIL;
        SubLObject var353 = (SubLObject) module0816.NIL;
        SubLObject var354 = (SubLObject) module0816.NIL;
        var352 = var345;
        var353 = var352.first();
        for( var354 = (SubLObject) module0816.ZERO_INTEGER; module0816.NIL != var352; var352 = var352.rest(), var353 = var352.first(), var354 = Numbers.add( (SubLObject) module0816.ONE_INTEGER, var354 ) )
        {
          if( !var354.isZero() )
          {
            PrintLow.format( var13_391, (SubLObject) module0816.$ic324$, (SubLObject) Characters.CHAR_backslash );
          }
          final SubLObject var355 = f52371( var353 );
          PrintLow.format( var13_391, (SubLObject) module0816.$ic325$, var355 );
        }
        SubLObject var356 = var345;
        var353 = (SubLObject) module0816.NIL;
        var353 = var356.first();
        while ( module0816.NIL != var356)
        {
          final SubLObject var357 = f52371( var353 );
          PrintLow.format( var13_391, (SubLObject) module0816.$ic326$, var357, (SubLObject) Characters.CHAR_tab );
          var356 = var356.rest();
          var353 = var356.first();
        }
        streams_high.terpri( var13_391 );
        streams_high.terpri( var13_391 );
      }
      finally
      {
        final SubLObject var8_391 = Threads.$is_thread_performing_cleanupP$.currentBinding( var346 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) module0816.T, var346 );
          if( var351.isStream() )
          {
            streams_high.close( var351, (SubLObject) module0816.UNPROVIDED );
          }
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( var8_391, var346 );
        }
      }
    }
    finally
    {
      StreamsLow.$stream_initial_output_buffer_size$.rebind( var349, var346 );
      StreamsLow.$stream_initial_input_buffer_size$.rebind( var348, var346 );
    }
    return var347;
  }

  public static SubLObject f52371(final SubLObject var392)
  {
    SubLObject var393 = (SubLObject) module0816.NIL;
    SubLObject var394 = var392;
    SubLObject var395 = (SubLObject) module0816.NIL;
    var395 = var394.first();
    while ( module0816.NIL != var394)
    {
      final SubLObject var396 = f52363( var395 );
      var393 = (SubLObject) ConsesLow.cons( var396, var393 );
      var393 = (SubLObject) ConsesLow.cons( (SubLObject) module0816.$ic327$, var393 );
      var394 = var394.rest();
      var395 = var394.first();
    }
    return Functions.apply( Symbols.symbol_function( (SubLObject) module0816.$ic328$ ), Sequences.nreverse( var393 ) );
  }

  public static SubLObject f52372(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) module0816.$ic329$, var13, var48 );
  }

  public static SubLObject f52373(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) module0816.$ic329$, var13, var48 );
  }

  public static SubLObject f52374(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) module0816.$ic329$, var13, var48 );
  }

  public static SubLObject f52375(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) module0816.$ic329$, var13, var48 );
  }

  public static SubLObject f52376()
  {
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52219", "S#56860", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52222", "S#57291", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52221", "S#57292", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52220", "S#57293", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52223", "S#57294", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52224", "S#57295", 1, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52233", "S#57296", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52234", "S#57297", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52225", "S#57298", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52232", "S#57299", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52238", "S#57300", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52237", "S#57301", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52226", "S#57302", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52227", "S#57303", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52241", "S#57304", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52242", "S#57305", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52239", "S#57306", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52240", "S#57307", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52235", "S#57308", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52236", "S#57309", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52228", "S#57310", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52229", "S#57311", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52230", "S#57312", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52231", "S#57313", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52246", "S#57314", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52244", "S#57315", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52253", "S#56864", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52247", "S#57316", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52249", "S#57317", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52255", "S#57318", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52256", "S#57319", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52257", "S#57320", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52258", "S#57321", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52254", "S#57322", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52259", "S#57323", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52260", "S#57324", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52261", "S#57325", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52262", "S#57326", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52266", "S#57327", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52264", "S#57328", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52267", "S#57329", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52265", "S#57330", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52263", "S#57331", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52270", "S#57332", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52269", "S#57333", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52268", "S#57334", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52271", "S#57335", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52272", "S#57336", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52252", "S#57337", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52278", "S#57338", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52280", "S#57339", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52279", "S#57340", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52273", "S#57341", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52281", "S#57342", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52276", "S#57343", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52277", "S#57344", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52275", "S#57345", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52250", "S#57346", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52251", "S#57347", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52282", "S#57348", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52283", "S#57349", 5, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52284", "S#57350", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52285", "S#57351", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52286", "S#57352", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52288", "S#57353", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52289", "S#57354", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52290", "S#57355", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52291", "S#57356", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52292", "S#57357", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52293", "S#57358", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52295", "S#57359", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52296", "S#57360", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52294", "S#57361", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52297", "S#57362", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52298", "S#57363", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52299", "S#57364", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52300", "S#57365", 2, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52301", "S#57366", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52303", "S#57367", 0, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52304", "S#57368", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52305", "S#57369", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52302", "S#57370", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52306", "S#57371", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52311", "S#57372", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52245", "S#57373", 2, 2, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52274", "S#57374", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52313", "S#57375", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52310", "S#57376", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52243", "S#57377", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52312", "S#57378", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52314", "S#57379", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52315", "S#57380", 2, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52316", "S#57381", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52307", "S#57382", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52308", "S#57383", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52309", "S#57384", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52317", "S#57385", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52318", "S#57386", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52319", "S#57387", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52320", "S#57388", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52321", "S#57389", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52322", "S#57390", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52323", "S#57391", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52324", "S#57392", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52325", "S#57393", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52326", "S#57394", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52327", "S#57395", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52328", "S#57396", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52329", "S#57397", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52287", "S#57398", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52330", "S#57399", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52331", "S#57400", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52332", "S#57401", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52333", "S#57402", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52335", "S#57403", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52336", "S#57404", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52337", "S#57405", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52338", "S#57406", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52339", "S#57407", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52340", "S#57408", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52341", "S#57409", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52342", "S#57410", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52343", "S#57411", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52344", "S#57412", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52345", "S#57413", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52334", "S#57414", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52346", "S#57415", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52347", "S#57416", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52348", "S#57417", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52349", "S#57418", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52350", "S#57419", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52351", "S#57420", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52352", "S#57421", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52353", "S#57422", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52354", "S#57423", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52355", "S#57424", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52356", "S#57425", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52248", "S#57426", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52357", "S#56862", 6, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52363", "S#57427", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52364", "S#56859", 1, 1, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52365", "S#57428", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52366", "S#57429", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52367", "S#57430", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52358", "S#57431", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52359", "S#57432", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52368", "S#57433", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52360", "S#57434", 4, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52369", "S#57435", 5, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52361", "S#57436", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52370", "S#57437", 6, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52362", "S#57438", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52371", "S#57439", 1, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52372", "S#57440", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52373", "S#57441", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52374", "S#57442", 3, 0, false );
    SubLFiles.declareFunction( "com.cyc.cycjava.cycl.module0816", "f52375", "S#57443", 3, 0, false );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52377()
  {
    module0816.$g6470$ = SubLFiles.defparameter( "S#57444", (SubLObject) module0816.NIL );
    module0816.$g6471$ = SubLFiles.defparameter( "S#57445", (SubLObject) module0816.NIL );
    module0816.$g6472$ = SubLFiles.deflexical( "S#57446", (SubLObject) module0816.$ic63$ );
    module0816.$g6473$ = SubLFiles.deflexical( "S#57447", (SubLObject) module0816.$ic85$ );
    module0816.$g6474$ = SubLFiles.defparameter( "S#57448", (SubLObject) module0816.NIL );
    return (SubLObject) module0816.NIL;
  }

  public static SubLObject f52378()
  {
    module0034.f1895( (SubLObject) module0816.$ic56$ );
    module0034.f1895( (SubLObject) module0816.$ic58$ );
    module0034.f1895( (SubLObject) module0816.$ic61$ );
    module0034.f1895( (SubLObject) module0816.$ic73$ );
    module0012.f419( (SubLObject) module0816.$ic158$ );
    module0012.f419( (SubLObject) module0816.$ic159$ );
    return (SubLObject) module0816.NIL;
  }

  @Override
  public void declareFunctions()
  {
    f52376();
  }

  @Override
  public void initializeVariables()
  {
    f52377();
  }

  @Override
  public void runTopLevelForms()
  {
    f52378();
  }
  static
  {
    me = (SubLFile) new module0816();
    module0816.$g6470$ = null;
    module0816.$g6471$ = null;
    module0816.$g6472$ = null;
    module0816.$g6473$ = null;
    module0816.$g6474$ = null;
    $ic0$ = SubLObjectFactory.makeSymbol( "S#56738", "CYC" );
    $ic1$ = SubLObjectFactory.makeSymbol( "STRINGP" );
    $ic2$ = SubLObjectFactory.makeInteger( 1048576 );
    $ic3$ = SubLObjectFactory.makeKeyword( "OUTPUT" );
    $ic4$ = SubLObjectFactory.makeString( "Unable to open ~S" );
    $ic5$ = SubLObjectFactory.makeString( "/dev/null" );
    $ic6$ = SubLObjectFactory.makeString( ".c" );
    $ic7$ = SubLObjectFactory.makeString( ".h" );
    $ic8$ = SubLObjectFactory.makeString( ".C" );
    $ic9$ = SubLObjectFactory.makeString( ".H" );
    $ic10$ = SubLObjectFactory.makeString( "unexpected C filename ~S" );
    $ic11$ = SubLObjectFactory.makeSymbol( "DOUBLE-FLOAT" );
    $ic12$ = SubLObjectFactory.makeString( "Invalid attempt to reuse memoization state in multiple threads simultaneously." );
    $ic13$ = SubLObjectFactory.makeString( "#include \"rtl.h\"" );
    $ic14$ = SubLObjectFactory.makeString( "CYCL" );
    $ic15$ = SubLObjectFactory.makeString( "~%~%#ifdef ~A_PROFILING" );
    $ic16$ = SubLObjectFactory.makeString( "~%#define ~A_PROFILING" );
    $ic17$ = SubLObjectFactory.makeString( "~%#endif" );
    $ic18$ = SubLObjectFactory.makeString( "~%#define PROFILING" );
    $ic19$ = SubLObjectFactory.makeString( "~%~%#include \"code-flow-hooks.h\"" );
    $ic20$ = SubLObjectFactory.makeString( "" );
    $ic29$ = SubLObjectFactory.makeString( "#  ~A~%" );
    $ic30$ = SubLObjectFactory.makeString( "#   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
    $ic31$ = SubLObjectFactory.makeString( "Copyright (c) 1995 - 2012 Cycorp, Inc.  All rights reserved." );
    $ic32$ = SubLObjectFactory.makeString( "~%~%" );
    $ic33$ = SubLObjectFactory.makeString( "~%~%" );
    $ic34$ = SubLObjectFactory.makeString( "extern " );
    $ic35$ = SubLObjectFactory.makeString( " " );
    $ic36$ = SubLObjectFactory.makeString( ";" );
    $ic37$ = SubLObjectFactory.makeString( "static " );
    $ic38$ = SubLObjectFactory.makeKeyword( "UNPROVIDED" );
    $ic39$ = SubLObjectFactory.makeString( "static Dp _constants[~A];" );
    $ic40$ = SubLObjectFactory.makeString( "  " );
    $ic41$ = SubLObjectFactory.makeString( "~%~%" );
    $ic42$ = SubLObjectFactory.makeString( "~%~%" );
    $ic43$ = SubLObjectFactory.makeString( "  " );
    $ic44$ = SubLObjectFactory.makeString( "Unexpected C backend atom : ~S" );
    $ic45$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#10505", "CYC" ) );
    $ic46$ = SubLObjectFactory.makeSymbol( "S#56848", "CYC" );
    $ic47$ = SubLObjectFactory.makeString( "Time to implement a C backend translation for predefined constant ~S" );
    $ic48$ = SubLObjectFactory.makeKeyword( "DYNAMIC" );
    $ic49$ = SubLObjectFactory.makeKeyword( "LEXICAL" );
    $ic50$ = SubLObjectFactory.makeKeyword( "CONSTANT" );
    $ic51$ = SubLObjectFactory.makeKeyword( "LOCAL" );
    $ic52$ = SubLObjectFactory.makeString( "unexpected variable binding type ~S for ~S" );
    $ic53$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "LOW" ), (SubLObject) SubLObjectFactory.makeKeyword( "HIGH" ) );
    $ic54$ = SubLObjectFactory.makeString( "_gv~S_" );
    $ic55$ = SubLObjectFactory.makeString( "_v~S_" );
    $ic56$ = SubLObjectFactory.makeSymbol( "S#57328", "CYC" );
    $ic57$ = SubLObjectFactory.makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
    $ic58$ = SubLObjectFactory.makeSymbol( "S#57330", "CYC" );
    $ic59$ = SubLObjectFactory.makeString( "v_" );
    $ic60$ = SubLObjectFactory.makeString( "_" );
    $ic61$ = SubLObjectFactory.makeSymbol( "S#57333", "CYC" );
    $ic62$ = SubLObjectFactory.makeString( "gv_" );
    $ic63$ = ConsesLow.list( (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_question, (SubLObject) Characters.CHAR_P ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_hyphen,
        (SubLObject) Characters.CHAR_underbar ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_space, (SubLObject) Characters.CHAR_underbar ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_less,
            (SubLObject) Characters.CHAR_L ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_equal, (SubLObject) Characters.CHAR_E ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_greater,
                (SubLObject) Characters.CHAR_G ) );
    $ic64$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&REST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#105", "CYC" ) );
    $ic65$ = SubLObjectFactory.makeKeyword( "UNKNOWN" );
    $ic66$ = SubLObjectFactory.makeString( "translating ~S call as funcall" );
    $ic67$ = SubLObjectFactory.makeSymbol( "FUNCALL" );
    $ic68$ = SubLObjectFactory.makeSymbol( "S#56855", "CYC" );
    $ic69$ = SubLObjectFactory.makeString( "~S called with ~S missing required arguments" );
    $ic70$ = SubLObjectFactory.makeString( "~S called with ~S excess arguments" );
    $ic71$ = SubLObjectFactory.makeString( "(" );
    $ic72$ = SubLObjectFactory.makeString( ")" );
    $ic73$ = SubLObjectFactory.makeSymbol( "S#57340", "CYC" );
    $ic74$ = SubLObjectFactory.makeString( "f_" );
    $ic75$ = SubLObjectFactory.makeKeyword( "UNSPECIFIED" );
    $ic76$ = SubLObjectFactory.makeString( "_CSETF-" );
    $ic77$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#154", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#132", "CYC" ) );
    $ic78$ = SubLObjectFactory.makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic79$ = SubLObjectFactory.makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic80$ = SubLObjectFactory.makeString( "unable to introspect on ~S" );
    $ic81$ = SubLObjectFactory.makeString( "Unexpected function ~S" );
    $ic82$ = SubLObjectFactory.makeString( ", " );
    $ic83$ = SubLObjectFactory.makeString( "DUM" );
    $ic84$ = SubLObjectFactory.makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic85$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56692", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57402", "CYC" ) ), ConsesLow.cons(
        (SubLObject) SubLObjectFactory.makeSymbol( "S#57153", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57348", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56665", "CYC" ),
            (SubLObject) SubLObjectFactory.makeSymbol( "S#57352", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56668", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57353", "CYC" ) ),
      ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56664", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57403", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56658",
          "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57354", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56659", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57355",
              "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#51", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57356", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "S#56667", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57357", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "CSETQ" ), (SubLObject) SubLObjectFactory
                      .makeSymbol( "S#57358", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56660", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57359", "CYC" ) ), ConsesLow.cons(
                          (SubLObject) SubLObjectFactory.makeSymbol( "S#56661", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57360", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol(
                              "S#56662", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57361", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56666", "CYC" ),
                                  (SubLObject) SubLObjectFactory.makeSymbol( "S#57363", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "CVS-ID" ), (SubLObject) SubLObjectFactory.makeSymbol(
                                      "S#57364", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "DEFCONSTANT" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57365", "CYC" ) ), ConsesLow.cons(
                                          (SubLObject) SubLObjectFactory.makeSymbol( "DEFINE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57368", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol(
                                              "S#56710", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57387", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "DEFLEXICAL" ),
                                                  (SubLObject) SubLObjectFactory.makeSymbol( "S#57388", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "DEFPARAMETER" ),
                                                      (SubLObject) SubLObjectFactory.makeSymbol( "S#57389", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56711", "CYC" ),
                                                          (SubLObject) SubLObjectFactory.makeSymbol( "S#57390", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" ),
                                                              (SubLObject) SubLObjectFactory.makeSymbol( "S#57391", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "_DEFSTRUCT-GET-SLOT",
                                                                  "SUBLISP" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57392", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol(
                                                                      "_DEFSTRUCT-OBJECT-P", "SUBLISP" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57393", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                          .makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57394", "CYC" ) ), ConsesLow.cons(
                                                                              (SubLObject) SubLObjectFactory.makeSymbol( "DEFVAR" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57395", "CYC" ) ), ConsesLow.cons(
                                                                                  (SubLObject) SubLObjectFactory.makeSymbol( "S#56696", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57350", "CYC" ) ), ConsesLow
                                                                                      .cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56713", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57351", "CYC" ) ),
      ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57449", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57404", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "FIF" ),
          (SubLObject) SubLObjectFactory.makeSymbol( "S#57396", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56663", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57405", "CYC" ) ),
      ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56849", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57406", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56851",
          "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57408", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56855", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57409",
              "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57450", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57412", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "MULTIPLE-VALUE-LIST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57413", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57029", "CYC" ),
                      (SubLObject) SubLObjectFactory.makeSymbol( "S#57414", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56701", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57415",
                          "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "NTH-VALUE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57416", "CYC" ) ), ConsesLow.cons(
                              (SubLObject) SubLObjectFactory.makeSymbol( "S#56702", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57417", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol(
                                  "S#56848", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57321", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "PCOND" ), (SubLObject) SubLObjectFactory
                                      .makeSymbol( "S#57397", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "PROGN" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57398", "CYC" ) ), ConsesLow
                                          .cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56722", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57399", "CYC" ) ), ConsesLow.cons(
                                              (SubLObject) SubLObjectFactory.makeSymbol( "S#56853", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57418", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                  .makeSymbol( "S#56854", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57419", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56852",
                                                      "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57420", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "RET" ),
                                                          (SubLObject) SubLObjectFactory.makeSymbol( "S#57400", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "WHILE" ),
                                                              (SubLObject) SubLObjectFactory.makeSymbol( "S#57401", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56671", "CYC" ),
                                                                  (SubLObject) SubLObjectFactory.makeSymbol( "S#57421", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56669", "CYC" ),
                                                                      (SubLObject) SubLObjectFactory.makeSymbol( "S#57422", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#56670", "CYC" ),
                                                                          (SubLObject) SubLObjectFactory.makeSymbol( "S#57423", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57451", "CYC" ),
                                                                              (SubLObject) SubLObjectFactory.makeSymbol( "S#57424", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57452",
                                                                                  "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57425", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol(
                                                                                      "JAVA-NEW" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57440", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                                          .makeSymbol( "JAVA-METHOD" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57441", "CYC" ) ), ConsesLow.cons(
                                                                                              (SubLObject) SubLObjectFactory.makeSymbol( "JAVA-STATIC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57442", "CYC" ) ),
      ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "JAVA-CALL" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57443", "CYC" ) )
    } );
    $ic86$ = SubLObjectFactory.makeString( "Time to implement the writer for ~S" );
    $ic87$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#154", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#155", "CYC" ) );
    $ic88$ = SubLObjectFactory.makeSymbol( "S#57153", "CYC" );
    $ic89$ = SubLObjectFactory.makeSymbol( "S#56696", "CYC" );
    $ic90$ = SubLObjectFactory.makeSymbol( "S#56713", "CYC" );
    $ic91$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#150", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#768", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56730", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic92$ = SubLObjectFactory.makeSymbol( "S#56665", "CYC" );
    $ic93$ = SubLObjectFactory.makeSymbol( "PROGN" );
    $ic94$ = SubLObjectFactory.makeSymbol( "S#57240", "CYC" );
    $ic95$ = SubLObjectFactory.makeSymbol( "PCOND" );
    $ic96$ = SubLObjectFactory.makeSymbol( "S#56683", "CYC" );
    $ic97$ = SubLObjectFactory.makeSymbol( "S#57076", "CYC" );
    $ic98$ = SubLObjectFactory.makeSymbol( "CSETQ" );
    $ic99$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#57159", "CYC" ) ) );
    $ic100$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#57029", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57031", "CYC" ) );
    $ic101$ = SubLObjectFactory.makeSymbol( "S#57192", "CYC" );
    $ic102$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56695", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56732", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56729", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic103$ = SubLObjectFactory.makeSymbol( "S#56668", "CYC" );
    $ic104$ = SubLObjectFactory.makeSymbol( "S#57175", "CYC" );
    $ic105$ = SubLObjectFactory.makeSymbol( "S#57173", "CYC" );
    $ic106$ = SubLObjectFactory.makeSymbol( "S#57171", "CYC" );
    $ic107$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#713", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic108$ = SubLObjectFactory.makeSymbol( "S#56658", "CYC" );
    $ic109$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#33", "CYC" ) );
    $ic110$ = SubLObjectFactory.makeSymbol( "S#57157", "CYC" );
    $ic111$ = SubLObjectFactory.makeSymbol( "S#57238", "CYC" );
    $ic112$ = SubLObjectFactory.makeSymbol( "S#56659", "CYC" );
    $ic113$ = SubLObjectFactory.makeSymbol( "S#57450", "CYC" );
    $ic114$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#64", "CYC" ) );
    $ic115$ = SubLObjectFactory.makeSymbol( "S#51", "CYC" );
    $ic116$ = SubLObjectFactory.makeString( "// " );
    $ic117$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56703", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#713", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56731", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic118$ = SubLObjectFactory.makeSymbol( "S#56667", "CYC" );
    $ic119$ = SubLObjectFactory.makeSymbol( "S#57158", "CYC" );
    $ic120$ = SubLObjectFactory.makeSymbol( "S#57239", "CYC" );
    $ic121$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#132", "CYC" ) );
    $ic122$ = SubLObjectFactory.makeSymbol( "S#56662", "CYC" );
    $ic123$ = SubLObjectFactory.makeSymbol( "S#56660", "CYC" );
    $ic124$ = SubLObjectFactory.makeSymbol( "S#56661", "CYC" );
    $ic125$ = SubLObjectFactory.makeString( "The constant variable ~S cannot be set" );
    $ic126$ = SubLObjectFactory.makeString( "Unexpected variable ~S" );
    $ic127$ = SubLObjectFactory.makeSymbol( "S#57241", "CYC" );
    $ic128$ = SubLObjectFactory.makeSymbol( "S#57242", "CYC" );
    $ic129$ = SubLObjectFactory.makeString( " = " );
    $ic130$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56730", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#152", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic131$ = SubLObjectFactory.makeSymbol( "S#56666", "CYC" );
    $ic132$ = SubLObjectFactory.makeSymbol( "S#57243", "CYC" );
    $ic133$ = SubLObjectFactory.makeSymbol( "S#57245", "CYC" );
    $ic134$ = SubLObjectFactory.makeSymbol( "S#57193", "CYC" );
    $ic135$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#38900", "CYC" ) );
    $ic136$ = SubLObjectFactory.makeSymbol( "CVS-ID" );
    $ic137$ = SubLObjectFactory.makeString( "CVS_ID(" );
    $ic138$ = SubLObjectFactory.makeSymbol( "DEFCONSTANT" );
    $ic139$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#33", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "&OPTIONAL" ), (SubLObject) SubLObjectFactory.makeSymbol( "DOCUMENTATION" ) );
    $ic140$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#29", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#30", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic141$ = SubLObjectFactory.makeSymbol( "DEFINE" );
    $ic142$ = SubLObjectFactory.makeString( "~S was not a top-level define" );
    $ic143$ = SubLObjectFactory.makeSymbol( "S#57453", "CYC" );
    $ic144$ = SubLObjectFactory.makeString( "Skip function ~S" );
    $ic145$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "DOCUMENTATION" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56708", "CYC" ) );
    $ic146$ = SubLObjectFactory.makeString( "Method ~S returns within a binding construct" );
    $ic147$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#57449", "CYC" ) );
    $ic148$ = SubLObjectFactory.makeString( "" );
    $ic173$ = SubLObjectFactory.makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" );
    $ic174$ = SubLObjectFactory.makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" );
    $ic175$ = SubLObjectFactory.makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" );
    $ic176$ = SubLObjectFactory.makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" );
    $ic177$ = SubLObjectFactory.makeSymbol( "DEFVAR" );
    $ic178$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "CONDITION" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56714", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#56715", "CYC" ) );
    $ic179$ = SubLObjectFactory.makeSymbol( "FIF" );
    $ic180$ = SubLObjectFactory.makeString( " ? " );
    $ic181$ = SubLObjectFactory.makeString( " : " );
    $ic182$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&REST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57456", "CYC" ) );
    $ic183$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "PROGN" ) );
    $ic184$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#57457", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&REST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57458", "CYC" ) );
    $ic185$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#122", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57459", "CYC" ) );
    $ic186$ = SubLObjectFactory.makeString( "if (" );
    $ic187$ = SubLObjectFactory.makeString( ") " );
    $ic188$ = SubLObjectFactory.makeString( " else " );
    $ic189$ = SubLObjectFactory.makeString( " else if (" );
    $ic190$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic191$ = SubLObjectFactory.makeString( "{" );
    $ic192$ = SubLObjectFactory.makeString( "}" );
    $ic193$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#3267", "CYC" ) );
    $ic194$ = SubLObjectFactory.makeString( "RETURN(" );
    $ic195$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#122", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic196$ = SubLObjectFactory.makeSymbol( "WHILE" );
    $ic197$ = SubLObjectFactory.makeString( "while (" );
    $ic198$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&REST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56690", "CYC" ) );
    $ic199$ = SubLObjectFactory.makeSymbol( "S#56692", "CYC" );
    $ic200$ = SubLObjectFactory.makeString( " && " );
    $ic201$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#131", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#704", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#28822", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56729", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#50102",
            "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic202$ = SubLObjectFactory.makeSymbol( "S#56664", "CYC" );
    $ic203$ = SubLObjectFactory.makeSymbol( "S#56663", "CYC" );
    $ic204$ = SubLObjectFactory.makeSymbol( "%NEXT-HASH-INDEX", "SUBLISP" );
    $ic205$ = SubLObjectFactory.makeSymbol( "%HASH-INDEX-KEY", "SUBLISP" );
    $ic206$ = SubLObjectFactory.makeSymbol( "%HASH-INDEX-OBJ", "SUBLISP" );
    $ic207$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ) );
    $ic208$ = SubLObjectFactory.makeSymbol( "S#57449", "CYC" );
    $ic209$ = SubLObjectFactory.makeString( "ENTER()" );
    $ic210$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56727", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#122", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56728", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic211$ = SubLObjectFactory.makeString( "for (" );
    $ic212$ = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57460", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57461", "CYC" ) );
    $ic213$ = SubLObjectFactory.makeString( "; " );
    $ic214$ = (SubLList) ConsesLow.cons( (SubLObject) SubLObjectFactory.makeSymbol( "S#57462", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57463", "CYC" ) );
    $ic215$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57464", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56850", "CYC" ) );
    $ic216$ = SubLObjectFactory.makeSymbol( "S#56849", "CYC" );
    $ic217$ = SubLObjectFactory.makeString( "_constants[" );
    $ic218$ = SubLObjectFactory.makeString( "]" );
    $ic219$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57464", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56850", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#57465", "CYC" ) );
    $ic220$ = SubLObjectFactory.makeSymbol( "S#56851", "CYC" );
    $ic221$ = SubLObjectFactory.makeString( "INITIALIZE_CONSTANT(" );
    $ic222$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#154", "CYC" ) );
    $ic223$ = SubLObjectFactory.makeSymbol( "S#57169", "CYC" );
    $ic224$ = SubLObjectFactory.makeSymbol( "S#57162", "CYC" );
    $ic225$ = SubLObjectFactory.makeSymbol( "S#57160", "CYC" );
    $ic226$ = SubLObjectFactory.makeSymbol( "S#57163", "CYC" );
    $ic227$ = SubLObjectFactory.makeSymbol( "S#57161", "CYC" );
    $ic228$ = SubLObjectFactory.makeSymbol( "S#57168", "CYC" );
    $ic229$ = SubLObjectFactory.makeSymbol( "S#57164", "CYC" );
    $ic230$ = SubLObjectFactory.makeString( "Time to add %LF support for ~S" );
    $ic231$ = SubLObjectFactory.makeSymbol( "S#57167", "CYC" );
    $ic232$ = SubLObjectFactory.makeSymbol( "S#57166", "CYC" );
    $ic233$ = SubLObjectFactory.makeSymbol( "S#57165", "CYC" );
    $ic234$ = SubLObjectFactory.makeSymbol( "S#57170", "CYC" );
    $ic235$ = SubLObjectFactory.makeInteger( 134217727 );
    $ic236$ = SubLObjectFactory.makeInteger( -134217728 );
    $ic237$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "&OPTIONAL" ),
        (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#33", "CYC" ), (SubLObject) module0816.NIL, (SubLObject) SubLObjectFactory.makeSymbol( "S#57466", "CYC" ) ) );
    $ic238$ = SubLObjectFactory.makeString( "volatile " );
    $ic239$ = SubLObjectFactory.makeSymbol( "MULTIPLE-VALUE-LIST" );
    $ic240$ = SubLObjectFactory.makeSymbol( "S#57233", "CYC" );
    $ic241$ = SubLObjectFactory.makeSymbol( "S#57029", "CYC" );
    $ic242$ = SubLObjectFactory.makeSymbol( "S#57031", "CYC" );
    $ic243$ = SubLObjectFactory.makeString( "TRUE" );
    $ic244$ = SubLObjectFactory.makeSymbol( "S#57030", "CYC" );
    $ic245$ = SubLObjectFactory.makeString( "FALSE" );
    $ic246$ = SubLObjectFactory.makeString( "Unexpected native constant ~S" );
    $ic247$ = SubLObjectFactory.makeSymbol( "S#56701", "CYC" );
    $ic248$ = SubLObjectFactory.makeString( "(!(" );
    $ic249$ = SubLObjectFactory.makeString( "))" );
    $ic250$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#770", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#63", "CYC" ) );
    $ic251$ = SubLObjectFactory.makeSymbol( "NTH-VALUE" );
    $ic252$ = SubLObjectFactory.makeSymbol( "S#57236", "CYC" );
    $ic253$ = SubLObjectFactory.makeSymbol( "S#56702", "CYC" );
    $ic254$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#57029", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57030", "CYC" ) );
    $ic255$ = SubLObjectFactory.makeString( "|| " );
    $ic256$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "FUNCTION" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57467", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#57468", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57469", "CYC" ) );
    $ic257$ = SubLObjectFactory.makeSymbol( "S#56853", "CYC" );
    $ic258$ = SubLObjectFactory.makeString( "DEFINE(" );
    $ic259$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#752", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#673", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#33", "CYC" ) );
    $ic260$ = SubLObjectFactory.makeSymbol( "S#56854", "CYC" );
    $ic261$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "FUNCTION" ) );
    $ic262$ = SubLObjectFactory.makeSymbol( "S#56852", "CYC" );
    $ic263$ = SubLObjectFactory.makeString( "DEFMACRO(" );
    $ic264$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56736", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic265$ = SubLObjectFactory.makeSymbol( "S#56671", "CYC" );
    $ic266$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#1755", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56733", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56734", "CYC" ) ), (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic267$ = SubLObjectFactory.makeSymbol( "S#56669", "CYC" );
    $ic268$ = SubLObjectFactory.makeSymbol( "*ERROR-HANDLER*" );
    $ic269$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#56730", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#761", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "&BODY" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5", "CYC" ) );
    $ic270$ = SubLObjectFactory.makeSymbol( "S#56670", "CYC" );
    $ic271$ = SubLObjectFactory.makeSymbol( "S#57155", "CYC" );
    $ic272$ = SubLObjectFactory.makeSymbol( "S#57191", "CYC" );
    $ic273$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5845", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#770", "CYC" ) );
    $ic274$ = SubLObjectFactory.makeSymbol( "S#57451", "CYC" );
    $ic275$ = SubLObjectFactory.makeSymbol( "S#56688", "CYC" );
    $ic276$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5845", "CYC" ) );
    $ic277$ = SubLObjectFactory.makeSymbol( "S#57452", "CYC" );
    $ic278$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56689", "CYC" ) );
    $ic279$ = SubLObjectFactory.makeString( "module~4,'0D" );
    $ic280$ = SubLObjectFactory.makeString( "c" );
    $ic281$ = SubLObjectFactory.makeString( "~%~%#include \"~A.h\"~%~%" );
    $ic282$ = SubLObjectFactory.makeString( "void init_~A(void) {" );
    $ic283$ = SubLObjectFactory.makeString( "~%  " );
    $ic284$ = SubLObjectFactory.makeString( "();" );
    $ic285$ = SubLObjectFactory.makeString( "~%}~%" );
    $ic286$ = SubLObjectFactory.makeString( "h" );
    $ic287$ = SubLObjectFactory.makeString( "~%~%#ifdef CYC_PROFILING" );
    $ic288$ = SubLObjectFactory.makeString( "~%#endif~%" );
    $ic289$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56999", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#205", "CYC" ) );
    $ic290$ = SubLObjectFactory.makeString( "~%#include \"~A~A.h\"" );
    $ic291$ = SubLObjectFactory.makeString( "~%~%extern void init_~A(void);~%" );
    $ic292$ = SubLObjectFactory.makeString( "" );
    $ic293$ = SubLObjectFactory.makeString( "filelist" );
    $ic294$ = SubLObjectFactory.makeString( "text" );
    $ic295$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56999", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#298", "CYC" ) );
    $ic296$ = SubLObjectFactory.makeString( "~A_HEADERS = " );
    $ic297$ = SubLObjectFactory.makeString( "\\~%~c~A.h " );
    $ic298$ = SubLObjectFactory.makeString( "\\~%~c~A~A.h " );
    $ic299$ = SubLObjectFactory.makeString( "~%~%~A_SOURCES = " );
    $ic300$ = SubLObjectFactory.makeString( "\\~%~c~A.c " );
    $ic301$ = SubLObjectFactory.makeString( "\\~%~c~A~A.c " );
    $ic302$ = SubLObjectFactory.makeString( "~%~%~A_OBJECTS = " );
    $ic303$ = SubLObjectFactory.makeString( "\\~%~c~A.o " );
    $ic304$ = SubLObjectFactory.makeString( "\\~%~c~A~A.o " );
    $ic305$ = SubLObjectFactory.makeString( "~%~%lib~A.a: $(~A_OBJECTS)~%~%" );
    $ic306$ = SubLObjectFactory.makeString( "build-index" );
    $ic307$ = SubLObjectFactory.makeSymbol( "S#57430", "CYC" );
    $ic308$ = SubLObjectFactory.makeString( "BUILD_OBJECTS = " );
    $ic309$ = SubLObjectFactory.makeString( "$(" );
    $ic310$ = SubLObjectFactory.makeString( "_OBJECTS)" );
    $ic311$ = SubLObjectFactory.makeString( "BUILD_SOURCES = " );
    $ic312$ = SubLObjectFactory.makeString( "_SOURCES)" );
    $ic313$ = SubLObjectFactory.makeString( "BUILD_HEADERS = " );
    $ic314$ = SubLObjectFactory.makeString( "_HEADERS)" );
    $ic315$ = SubLObjectFactory.makeSymbol( "S#57427", "CYC" );
    $ic316$ = SubLObjectFactory.makeString( "BUILD_LIBRARIES = " );
    $ic317$ = SubLObjectFactory.makeString( "lib" );
    $ic318$ = SubLObjectFactory.makeString( ".a" );
    $ic319$ = SubLObjectFactory.makeString( "~%~A" );
    $ic320$ = SubLObjectFactory.makeString( "~A~A~A " );
    $ic321$ = SubLObjectFactory.makeString( "build-instructions" );
    $ic322$ = SubLObjectFactory.makeString( "~%curr-dir := $(shell pwd)~%PWD = ${curr-dir}~%MKDIR=mkdir -p" );
    $ic323$ = SubLObjectFactory.makeString( "~%~%~%DIRS = " );
    $ic324$ = SubLObjectFactory.makeString( " ~C~%    " );
    $ic325$ = SubLObjectFactory.makeString( "$(PWD)/~A" );
    $ic326$ = SubLObjectFactory.makeString( "~%~%$(PWD)/~A:~%~C$(MKDIR) $@" );
    $ic327$ = SubLObjectFactory.makeString( "/" );
    $ic328$ = SubLObjectFactory.makeSymbol( "CCONCATENATE" );
    $ic329$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "ERROR" ), (SubLObject) SubLObjectFactory.makeString( "JavaLink (java-to-subl) is not supported in the CRTL" ) );
    $ic21$ = SubLObjectFactory.makeString( "   ~A~%" );
    $ic22$ = SubLObjectFactory.makeString( "SUBLISP" );
    $ic23$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeKeyword( "NONE" ), (SubLObject) SubLObjectFactory.makeKeyword( "MEDIUM" ) );
    $ic24$ = SubLObjectFactory.makeString( "   file:        ~a ~%" );
    $ic25$ = SubLObjectFactory.makeKeyword( "HIGH" );
    $ic26$ = SubLObjectFactory.makeString( "   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
    $ic27$ = SubLObjectFactory.makeString( "   source file: ~a ~%" );
    $ic28$ = SubLObjectFactory.makeString( "         referenced globals       referenced functions        container for all constant values in file        private globals private functions        " );
    $ic149$ = SubLObjectFactory.makeString( "_f~S_" );
    $ic150$ = SubLObjectFactory.makeSymbol( "&OPTIONAL" );
    $ic151$ = SubLObjectFactory.makeSymbol( "&REST" );
    $ic152$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "VARIABLE" ), (SubLObject) SubLObjectFactory.makeSymbol( "&OPTIONAL" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#33", "CYC" ),
        (SubLObject) SubLObjectFactory.makeSymbol( "S#57454", "CYC" ) );
    $ic153$ = SubLObjectFactory.makeSymbol( "S#57235", "CYC" );
    $ic154$ = SubLObjectFactory.makeSymbol( "S#57232", "CYC" );
    $ic155$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#56848", "CYC" ), (SubLObject) module0816.NIL ) );
    $ic156$ = SubLObjectFactory.makeString( "Dp" );
    $ic157$ = SubLObjectFactory.makeString( "(void)" );
    $ic158$ = SubLObjectFactory.makeSymbol( "S#57385", "CYC" );
    $ic159$ = SubLObjectFactory.makeSymbol( "S#57386", "CYC" );
    $ic160$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "QUOTE" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#5859", "CYC" ) );
    $ic161$ = SubLObjectFactory.makeUninternedSymbol( "US#72EAA40" );
    $ic162$ = SubLObjectFactory.makeUninternedSymbol( "US#2B36E12" );
    $ic163$ = SubLObjectFactory.makeSymbol( "RET" );
    $ic164$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#63", "CYC" ) );
    $ic165$ = SubLObjectFactory.makeSymbol( "THROW" );
    $ic166$ = SubLObjectFactory.makeSymbol( "S#56710", "CYC" );
    $ic167$ = SubLObjectFactory.makeSymbol( "DEFLEXICAL" );
    $ic168$ = SubLObjectFactory.makeSymbol( "DEFPARAMETER" );
    $ic169$ = ConsesLow.list( (SubLObject) SubLObjectFactory.makeSymbol( "S#166", "CYC" ), (SubLObject) SubLObjectFactory.makeSymbol( "&REST" ), (SubLObject) SubLObjectFactory.makeSymbol( "S#57455", "CYC" ) );
    $ic170$ = SubLObjectFactory.makeSymbol( "S#56711", "CYC" );
    $ic171$ = SubLObjectFactory.makeKeyword( "NAME" );
    $ic172$ = SubLObjectFactory.makeString( " defstruct ~A         ~%" );
  }
}
/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/module0816.class Total time: 1118 ms
 * 
 * Decompiled with Procyon 0.5.32.
 */