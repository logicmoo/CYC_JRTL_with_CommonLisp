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
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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
    if( var3 == UNPROVIDED )
    {
      var3 = (SubLObject) NIL;
    }
    assert NIL != module0812.f51933( var1 ) : var1;
    assert NIL != Types.stringp( var2 ) : var2;
    final SubLObject var4 = f52220( var2 );
    f52221( var1, var4 );
    f52222( var1, var2 );
    return var1;
  }

  public static SubLObject f52222(final SubLObject var1, final SubLObject var5)
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    assert NIL != module0812.f51933( var1 ) : var1;
    assert NIL != Types.stringp( var5 ) : var5;
    SubLObject var7 = (SubLObject) NIL;
    module0075.ensure_directories_exist( var5 );
    final SubLObject var8 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var6 );
    final SubLObject var9 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var6 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var6 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var6 ), var6 );
      SubLObject var10 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_12 = stream_macros.$stream_requires_locking$.currentBinding( var6 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var6 );
          var10 = compatibility.open_text( var5, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_12, var6 );
        }
        if( !var10.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var5 );
        }
        final SubLObject var13_14 = var10;
        var7 = f52223( var1, var13_14, var5 );
      }
      finally
      {
        final SubLObject var8_13 = Threads.$is_thread_performing_cleanupP$.currentBinding( var6 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var6 );
          if( var10.isStream() )
          {
            streams_high.close( var10, (SubLObject) UNPROVIDED );
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
    assert NIL != module0812.f51933( var1 ) : var1;
    assert NIL != Types.stringp( var5 ) : var5;
    SubLObject var7 = (SubLObject) NIL;
    module0075.ensure_directories_exist( var5 );
    final SubLObject var8 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var6 );
    final SubLObject var9 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var6 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var6 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var6 ), var6 );
      SubLObject var10 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_17 = stream_macros.$stream_requires_locking$.currentBinding( var6 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var6 );
          var10 = compatibility.open_text( var5, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_17, var6 );
        }
        if( !var10.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var5 );
        }
        final SubLObject var13_18 = var10;
        var7 = f52224( var1, var13_18, var5 );
      }
      finally
      {
        final SubLObject var8_18 = Threads.$is_thread_performing_cleanupP$.currentBinding( var6 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var6 );
          if( var10.isStream() )
          {
            streams_high.close( var10, (SubLObject) UNPROVIDED );
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
    assert NIL != Types.stringp( var2 ) : var2;
    if( var2.equal( (SubLObject) $ic5$ ) )
    {
      return (SubLObject) $ic5$;
    }
    if( NIL != module0038.f2673( var2, (SubLObject) $ic6$, (SubLObject) UNPROVIDED ) )
    {
      return Sequences.cconcatenate( module0006.f203( module0038.f2623( var2, (SubLObject) ZERO_INTEGER, Numbers.subtract( Sequences.length( var2 ), (SubLObject) TWO_INTEGER ) ) ),
          (SubLObject) $ic7$ );
    }
    if( NIL != module0038.f2673( var2, (SubLObject) $ic8$, (SubLObject) UNPROVIDED ) )
    {
      return Sequences.cconcatenate( module0006.f203( module0038.f2623( var2, (SubLObject) ZERO_INTEGER, Numbers.subtract( Sequences.length( var2 ), (SubLObject) TWO_INTEGER ) ) ),
          (SubLObject) $ic9$ );
    }
    return Errors.error( (SubLObject) $ic10$, var2 );
  }

  public static SubLObject f52223(final SubLObject var1, SubLObject var13, SubLObject var5)
  {
    if( var13 == UNPROVIDED )
    {
      var13 = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( var5 == UNPROVIDED )
    {
      var5 = (SubLObject) NIL;
    }
    final SubLThread var14 = SubLProcess.currentSubLThread();
    assert NIL != module0812.f51933( var1 ) : var1;
    final SubLObject var15 = reader.$read_default_float_format$.currentBinding( var14 );
    final SubLObject var16 = $g6470$.currentBinding( var14 );
    final SubLObject var17 = module0812.$g6445$.currentBinding( var14 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) $ic11$, var14 );
      $g6470$.bind( (SubLObject) ZERO_INTEGER, var14 );
      module0812.$g6445$.bind( var1, var14 );
      final SubLObject var19;
      final SubLObject var18 = var19 = module0034.f1854( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var8_23 = module0034.$g879$.currentBinding( var14 );
      try
      {
        module0034.$g879$.bind( var19, var14 );
        SubLObject var20 = (SubLObject) NIL;
        if( NIL != var19 && NIL == module0034.f1842( var19 ) )
        {
          var20 = module0034.f1869( var19 );
          final SubLObject var21 = Threads.current_process();
          if( NIL == var20 )
          {
            module0034.f1873( var19, var21 );
          }
          else if( !var20.eql( var21 ) )
          {
            Errors.error( (SubLObject) $ic12$ );
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
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var14 );
            f52226( var1, var13 );
            f52227( var1, var13 );
            f52228( var1, var13 );
            f52229( var1, var13 );
            f52230( var1, var13 );
            f52231( var1, var13 );
            streams_high.terpri( var13 );
            if( NIL != var19 && NIL == var20 )
            {
              module0034.f1873( var19, (SubLObject) NIL );
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
      $g6470$.rebind( var16, var14 );
      reader.$read_default_float_format$.rebind( var15, var14 );
    }
    return var1;
  }

  public static SubLObject f52224(final SubLObject var1, SubLObject var13, SubLObject var5)
  {
    if( var13 == UNPROVIDED )
    {
      var13 = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( var5 == UNPROVIDED )
    {
      var5 = (SubLObject) NIL;
    }
    final SubLThread var14 = SubLProcess.currentSubLThread();
    assert NIL != module0812.f51933( var1 ) : var1;
    final SubLObject var15 = reader.$read_default_float_format$.currentBinding( var14 );
    final SubLObject var16 = $g6470$.currentBinding( var14 );
    final SubLObject var17 = module0812.$g6445$.currentBinding( var14 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) $ic11$, var14 );
      $g6470$.bind( (SubLObject) ZERO_INTEGER, var14 );
      module0812.$g6445$.bind( var1, var14 );
      final SubLObject var19;
      final SubLObject var18 = var19 = module0034.f1854( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var8_27 = module0034.$g879$.currentBinding( var14 );
      try
      {
        module0034.$g879$.bind( var19, var14 );
        SubLObject var20 = (SubLObject) NIL;
        if( NIL != var19 && NIL == module0034.f1842( var19 ) )
        {
          var20 = module0034.f1869( var19 );
          final SubLObject var21 = Threads.current_process();
          if( NIL == var20 )
          {
            module0034.f1873( var19, var21 );
          }
          else if( !var20.eql( var21 ) )
          {
            Errors.error( (SubLObject) $ic12$ );
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
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var14 );
            f52233( var1, var13 );
            f52234( var1, var13 );
            if( NIL != var19 && NIL == var20 )
            {
              module0034.f1873( var19, (SubLObject) NIL );
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
      $g6470$.rebind( var16, var14 );
      reader.$read_default_float_format$.rebind( var15, var14 );
    }
    return var1;
  }

  public static SubLObject f52233(final SubLObject var1, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    SubLObject var14 = module0812.f51977( var1 );
    SubLObject var15 = (SubLObject) NIL;
    var15 = var14.first();
    while ( NIL != var14)
    {
      if( NIL == module0812.f51991( var15 ) )
      {
        f52235( var15, var13 );
      }
      var14 = var14.rest();
      var15 = var14.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52234(final SubLObject var1, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    SubLObject var14 = module0812.f51979( var1 );
    SubLObject var15 = (SubLObject) NIL;
    var15 = var14.first();
    while ( NIL != var14)
    {
      if( NIL == module0812.f51988( var15 ) )
      {
        f52236( var15, var13 );
      }
      var14 = var14.rest();
      var15 = var14.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52225(final SubLObject var1, final SubLObject var5, final SubLObject var13)
  {
    f52232( var13, var5, module0812.f51970( var1 ) );
    streams_high.terpri( var13 );
    streams_high.terpri( var13 );
    streams_high.write_string( (SubLObject) $ic13$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    if( NIL == module0813.f52033() )
    {
      SubLObject var14 = module0812.f51970( var1 );
      final SubLObject var15 = (SubLObject) $ic14$;
      var14 = Sequences.substitute( (SubLObject) Characters.CHAR_underbar, (SubLObject) Characters.CHAR_hyphen, var14, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
          (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      PrintLow.format( var13, (SubLObject) $ic15$, var15 );
      PrintLow.format( var13, (SubLObject) $ic16$, var14 );
      PrintLow.format( var13, (SubLObject) $ic17$ );
      PrintLow.format( var13, (SubLObject) $ic15$, var14 );
      PrintLow.format( var13, (SubLObject) $ic18$ );
      PrintLow.format( var13, (SubLObject) $ic17$ );
    }
    PrintLow.format( var13, (SubLObject) $ic19$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52232(final SubLObject var13, final SubLObject var5, SubLObject var32)
  {
    if( var32 == UNPROVIDED )
    {
      var32 = (SubLObject) NIL;
    }
    final SubLThread var33 = SubLProcess.currentSubLThread();
    PrintLow.format( var13, (SubLObject) $ic20$ );
    PrintLow.format( var13, (SubLObject) $ic21$, f52237() );
    if( !$ic22$.equal( module0819.f52447() ) )
    {
      if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic23$ ) )
      {
        PrintLow.format( var13, (SubLObject) $ic24$, var5 );
      }
      if( $ic25$ != module0813.f52035() )
      {
        var33.resetMultipleValues();
        final SubLObject var34 = Time.get_decoded_time();
        final SubLObject var35 = var33.secondMultipleValue();
        final SubLObject var36 = var33.thirdMultipleValue();
        final SubLObject var37 = var33.fourthMultipleValue();
        final SubLObject var38 = var33.fifthMultipleValue();
        final SubLObject var39 = var33.sixthMultipleValue();
        var33.resetMultipleValues();
        PrintLow.format( var13, (SubLObject) $ic26$, new SubLObject[] { var39, var38, var37, var36, var35, var34
        } );
      }
    }
    if( NIL != var32 && NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic23$ ) )
    {
      PrintLow.format( var13, (SubLObject) $ic27$, var32 );
    }
    PrintLow.format( var13, (SubLObject) $ic28$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52238(final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    PrintLow.format( var13, (SubLObject) $ic29$, f52237() );
    var14.resetMultipleValues();
    final SubLObject var15 = Time.get_decoded_time();
    final SubLObject var16 = var14.secondMultipleValue();
    final SubLObject var17 = var14.thirdMultipleValue();
    final SubLObject var18 = var14.fourthMultipleValue();
    final SubLObject var19 = var14.fifthMultipleValue();
    final SubLObject var20 = var14.sixthMultipleValue();
    var14.resetMultipleValues();
    PrintLow.format( var13, (SubLObject) $ic30$, new SubLObject[] { var20, var19, var18, var17, var16, var15
    } );
    return (SubLObject) NIL;
  }

  public static SubLObject f52237()
  {
    return (SubLObject) $ic31$;
  }

  public static SubLObject f52226(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = f52239( var1 );
    if( NIL != var14 )
    {
      PrintLow.format( var13, (SubLObject) $ic32$ );
    }
    SubLObject var15 = var14;
    SubLObject var16 = (SubLObject) NIL;
    var16 = var15.first();
    while ( NIL != var15)
    {
      f52235( var16, var13 );
      var15 = var15.rest();
      var16 = var15.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52227(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = f52240( var1 );
    if( NIL != var14 )
    {
      PrintLow.format( var13, (SubLObject) $ic33$ );
    }
    SubLObject var15 = var14;
    SubLObject var16 = (SubLObject) NIL;
    var16 = var15.first();
    while ( NIL != var15)
    {
      f52236( var16, var13 );
      var15 = var15.rest();
      var16 = var15.first();
    }
    return (SubLObject) NIL;
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
    SubLObject var3 = (SubLObject) NIL;
    SubLObject var4 = var2;
    SubLObject var5 = (SubLObject) NIL;
    var5 = var4.first();
    while ( NIL != var4)
    {
      if( NIL == f52241( var5 ) && NIL == module0812.f51990( var1, var5 ) )
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
    SubLObject var3 = (SubLObject) NIL;
    SubLObject var4 = var2;
    SubLObject var5 = (SubLObject) NIL;
    var5 = var4.first();
    while ( NIL != var4)
    {
      if( NIL == f52242( var5 ) )
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
    streams_high.write_string( (SubLObject) $ic34$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52243( var13 );
    streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52244( var30, var13, (SubLObject) UNPROVIDED );
    streams_high.write_string( (SubLObject) $ic36$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52236(final SubLObject var31, final SubLObject var13)
  {
    streams_high.terpri( var13 );
    if( NIL != module0812.f51988( var31 ) )
    {
      streams_high.write_string( (SubLObject) $ic37$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic34$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    f52245( var13, var31, (SubLObject) $ic38$, (SubLObject) ZERO_INTEGER );
    streams_high.write_string( (SubLObject) $ic36$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52228(final SubLObject var1, final SubLObject var13)
  {
    final SubLObject var14 = module0812.f51973( var1 );
    streams_high.terpri( var13 );
    streams_high.terpri( var13 );
    PrintLow.format( var13, (SubLObject) $ic39$, var14 );
    streams_high.write_string( (SubLObject) $ic40$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52229(final SubLObject var1, final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    final SubLObject var15 = module0812.f51993( var1 );
    if( NIL != var15 )
    {
      PrintLow.format( var13, (SubLObject) $ic41$ );
    }
    final SubLObject var16 = $g6471$.currentBinding( var14 );
    try
    {
      $g6471$.bind( (SubLObject) NIL, var14 );
      SubLObject var17 = var15;
      SubLObject var18 = (SubLObject) NIL;
      var18 = var17.first();
      while ( NIL != var17)
      {
        streams_high.terpri( var13 );
        f52246( var18, var13, (SubLObject) ZERO_INTEGER );
        var17 = var17.rest();
        var18 = var17.first();
      }
    }
    finally
    {
      $g6471$.rebind( var16, var14 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52230(final SubLObject var1, final SubLObject var13)
  {
    if( $ic22$.equal( module0819.f52447() ) )
    {
      final SubLObject var14 = module0812.f51980( var1 );
      if( NIL != var14 )
      {
        PrintLow.format( var13, (SubLObject) $ic42$ );
      }
      SubLObject var15 = var14;
      SubLObject var16 = (SubLObject) NIL;
      var16 = var15.first();
      while ( NIL != var15)
      {
        streams_high.terpri( var13 );
        f52236( var16, var13 );
        var15 = var15.rest();
        var16 = var15.first();
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52231(final SubLObject var1, final SubLObject var13)
  {
    final SubLThread var14 = SubLProcess.currentSubLThread();
    SubLObject var16;
    final SubLObject var15 = var16 = module0812.f51972( var1 );
    SubLObject var17 = (SubLObject) NIL;
    var17 = var16.first();
    while ( NIL != var16)
    {
      final SubLObject var18 = $g6471$.currentBinding( var14 );
      try
      {
        $g6471$.bind( module0812.f51992( var1, var17 ), var14 );
        streams_high.terpri( var13 );
        f52246( var17, var13, (SubLObject) ZERO_INTEGER );
      }
      finally
      {
        $g6471$.rebind( var18, var14 );
      }
      var16 = var16.rest();
      var17 = var16.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52246(final SubLObject var47, final SubLObject var13, SubLObject var48)
  {
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) ZERO_INTEGER;
    }
    streams_high.terpri( var13 );
    f52247( var13, var48 );
    if( NIL != f52244( var47, var13, var48 ) )
    {
      streams_high.write_string( (SubLObject) $ic36$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52244(SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) ZERO_INTEGER;
    }
    var49 = f52248( var49 );
    if( var49.isAtom() )
    {
      return f52249( var49, var13, var48 );
    }
    final SubLObject var50 = var49.first();
    final SubLObject var51 = f52250( var50 );
    if( NIL != var51 )
    {
      return f52251( var51, var49, var13, var48 );
    }
    return f52252( var49, var13, var48 );
  }

  public static SubLObject f52253(final SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) ZERO_INTEGER;
    }
    final SubLThread var50 = SubLProcess.currentSubLThread();
    final SubLObject var51 = reader.$read_default_float_format$.currentBinding( var50 );
    final SubLObject var52 = $g6470$.currentBinding( var50 );
    try
    {
      reader.$read_default_float_format$.bind( (SubLObject) $ic11$, var50 );
      $g6470$.bind( (SubLObject) ZERO_INTEGER, var50 );
      final SubLObject var54;
      final SubLObject var53 = var54 = module0034.f1854( (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      final SubLObject var8_52 = module0034.$g879$.currentBinding( var50 );
      try
      {
        module0034.$g879$.bind( var54, var50 );
        SubLObject var55 = (SubLObject) NIL;
        if( NIL != var54 && NIL == module0034.f1842( var54 ) )
        {
          var55 = module0034.f1869( var54 );
          final SubLObject var56 = Threads.current_process();
          if( NIL == var55 )
          {
            module0034.f1873( var54, var56 );
          }
          else if( !var55.eql( var56 ) )
          {
            Errors.error( (SubLObject) $ic12$ );
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
            Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var50 );
            if( NIL != var54 && NIL == var55 )
            {
              module0034.f1873( var54, (SubLObject) NIL );
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
      $g6470$.rebind( var52, var50 );
      reader.$read_default_float_format$.rebind( var51, var50 );
    }
    return var49;
  }

  public static SubLObject f52247(final SubLObject var13, final SubLObject var48)
  {
    SubLObject var49;
    for( var49 = (SubLObject) NIL, var49 = (SubLObject) ZERO_INTEGER; var49.numL( var48 ); var49 = Numbers.add( var49, (SubLObject) ONE_INTEGER ) )
    {
      streams_high.write_string( (SubLObject) $ic43$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52249(final SubLObject var55, final SubLObject var13, final SubLObject var48)
  {
    if( var55.isSymbol() )
    {
      f52254( var55, var13 );
    }
    else
    {
      if( NIL == f52255( var55 ) )
      {
        return Errors.error( (SubLObject) $ic44$, var55 );
      }
      f52256( var55, var13 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52255(final SubLObject var56)
  {
    return (SubLObject) makeBoolean( var56.isInteger() || var56.isString() || var56.isDouble() );
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
      final SubLObject var57 = Strings.string_upcase( Sequences.remove( (SubLObject) Characters.CHAR_plus, var56, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
          (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var57, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      return var55;
    }
    return print_high.princ( var55, var13 );
  }

  public static SubLObject f52257(final SubLObject var59, final SubLObject var13)
  {
    if( NIL == Sequences.position( (SubLObject) Characters.CHAR_newline, var59, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
        (SubLObject) UNPROVIDED ) && NIL == Sequences.position( (SubLObject) Characters.CHAR_return, var59, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED,
            (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) && NIL == Sequences.position( (SubLObject) Characters.CHAR_quotation, var59, (SubLObject) UNPROVIDED,
                (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) && NIL == Sequences.position( (SubLObject) Characters.CHAR_backslash, var59,
                    (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ) )
    {
      return print_high.prin1( var59, var13 );
    }
    streams_high.write_char( (SubLObject) Characters.CHAR_quotation, var13 );
    SubLObject var62_63;
    SubLObject var60;
    SubLObject var61;
    SubLObject var63;
    SubLObject var62;
    for( var60 = ( var62_63 = Sequences.length( var59 ) ), var61 = (SubLObject) NIL, var61 = (SubLObject) ZERO_INTEGER; !var61.numGE( var62_63 ); var61 = module0048.f_1X( var61 ) )
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
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) NIL;
    }
    SubLObject var68 = (SubLObject) NIL;
    SubLObject var69 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var67, var67, (SubLObject) $ic45$ );
    var68 = var67.first();
    SubLObject var70 = var67.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var70, var67, (SubLObject) $ic45$ );
    var69 = var70.first();
    var70 = var70.rest();
    if( NIL != var70 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var67, (SubLObject) $ic45$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var68, (SubLObject) $ic46$ );
    final SubLObject var71 = module0815.f52211( var69 );
    if( NIL == var71 )
    {
      return Errors.error( (SubLObject) $ic47$, var69 );
    }
    return streams_high.write_string( var71, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52254(final SubLObject var72, final SubLObject var13)
  {
    final SubLObject var74;
    final SubLObject var73 = var74 = f52259( var72 );
    if( var74.eql( (SubLObject) $ic48$ ) )
    {
      f52260( var72, var13 );
    }
    else if( var74.eql( (SubLObject) $ic49$ ) )
    {
      f52260( var72, var13 );
    }
    else if( var74.eql( (SubLObject) $ic50$ ) )
    {
      f52260( var72, var13 );
    }
    else
    {
      if( !var74.eql( (SubLObject) $ic51$ ) )
      {
        return Errors.error( (SubLObject) $ic52$, var73, var72 );
      }
      f52261( var72, var13 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52259(final SubLObject var72)
  {
    final SubLObject var73 = module0815.f52212( var72 );
    if( NIL != var73 )
    {
      return var73;
    }
    return module0811.f51798( var72 );
  }

  public static SubLObject f52260(final SubLObject var30, final SubLObject var13)
  {
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic53$ ) )
    {
      final SubLObject var31 = f52262( var30 );
      if( NIL != var31 )
      {
        return PrintLow.format( var13, (SubLObject) $ic54$, var31 );
      }
    }
    return streams_high.write_string( f52263( var30 ), var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52261(final SubLObject var75, final SubLObject var13)
  {
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic53$ ) )
    {
      final SubLObject var76 = f52264( var75 );
      return PrintLow.format( var13, (SubLObject) $ic55$, var76 );
    }
    return streams_high.write_string( f52265( var75 ), var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52262(final SubLObject var30)
  {
    if( module0018.$g577$.getGlobalValue().eql( Symbols.symbol_package( var30 ) ) && NIL == module0815.f52214( var30 ) )
    {
      final SubLObject var31 = module0813.f52032();
      if( NIL != var31 )
      {
        return module0813.f52097( var31, var30 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52266(final SubLObject var75)
  {
    final SubLThread var76 = SubLProcess.currentSubLThread();
    $g6470$.setDynamicValue( Numbers.add( $g6470$.getDynamicValue( var76 ), (SubLObject) ONE_INTEGER ), var76 );
    return $g6470$.getDynamicValue( var76 );
  }

  public static SubLObject f52264(final SubLObject var75)
  {
    final SubLThread var76 = SubLProcess.currentSubLThread();
    final SubLObject var77 = module0034.$g879$.getDynamicValue( var76 );
    SubLObject var78 = (SubLObject) NIL;
    if( NIL == var77 )
    {
      return f52266( var75 );
    }
    var78 = module0034.f1857( var77, (SubLObject) $ic56$, (SubLObject) UNPROVIDED );
    if( NIL == var78 )
    {
      var78 = module0034.f1807( module0034.f1842( var77 ), (SubLObject) $ic56$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var77, (SubLObject) $ic56$, var78 );
    }
    SubLObject var79 = module0034.f1814( var78, var75, (SubLObject) $ic57$ );
    if( var79 == $ic57$ )
    {
      var79 = Values.arg2( var76.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52266( var75 ) ) );
      module0034.f1816( var78, var75, var79, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var79 );
  }

  public static SubLObject f52267(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = f52268( var72 );
    if( NIL != Symbols.symbol_package( var72 ) )
    {
      return Sequences.cconcatenate( (SubLObject) $ic59$, module0006.f203( var74 ) );
    }
    $g6470$.setDynamicValue( Numbers.add( $g6470$.getDynamicValue( var73 ), (SubLObject) ONE_INTEGER ), var73 );
    return Sequences.cconcatenate( (SubLObject) $ic59$, new SubLObject[] { module0006.f203( var74 ), $ic60$, module0006.f203( $g6470$.getDynamicValue( var73 ) )
    } );
  }

  public static SubLObject f52265(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = module0034.$g879$.getDynamicValue( var73 );
    SubLObject var75 = (SubLObject) NIL;
    if( NIL == var74 )
    {
      return f52267( var72 );
    }
    var75 = module0034.f1857( var74, (SubLObject) $ic58$, (SubLObject) UNPROVIDED );
    if( NIL == var75 )
    {
      var75 = module0034.f1807( module0034.f1842( var74 ), (SubLObject) $ic58$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var74, (SubLObject) $ic58$, var75 );
    }
    SubLObject var76 = module0034.f1814( var75, var72, (SubLObject) $ic57$ );
    if( var76 == $ic57$ )
    {
      var76 = Values.arg2( var73.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52267( var72 ) ) );
      module0034.f1816( var75, var72, var76, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var76 );
  }

  public static SubLObject f52263(final SubLObject var72)
  {
    final SubLObject var73 = module0815.f52213( var72 );
    if( NIL != var73 )
    {
      return var73;
    }
    return f52269( var72 );
  }

  public static SubLObject f52270(final SubLObject var72)
  {
    final SubLObject var73 = f52268( var72 );
    return Sequences.cconcatenate( (SubLObject) $ic62$, module0006.f203( var73 ) );
  }

  public static SubLObject f52269(final SubLObject var72)
  {
    final SubLThread var73 = SubLProcess.currentSubLThread();
    final SubLObject var74 = module0034.$g879$.getDynamicValue( var73 );
    SubLObject var75 = (SubLObject) NIL;
    if( NIL == var74 )
    {
      return f52270( var72 );
    }
    var75 = module0034.f1857( var74, (SubLObject) $ic61$, (SubLObject) UNPROVIDED );
    if( NIL == var75 )
    {
      var75 = module0034.f1807( module0034.f1842( var74 ), (SubLObject) $ic61$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var74, (SubLObject) $ic61$, var75 );
    }
    SubLObject var76 = module0034.f1814( var75, var72, (SubLObject) $ic57$ );
    if( var76 == $ic57$ )
    {
      var76 = Values.arg2( var73.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52270( var72 ) ) );
      module0034.f1816( var75, var72, var76, (SubLObject) UNPROVIDED );
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
    assert NIL != Types.stringp( var83 ) : var83;
    final SubLObject var84 = Sequences.length( var83 );
    final SubLObject var85 = (SubLObject) ( ( var84.isPositive() && NIL != Characters.charE( Strings.sublisp_char( var83, (SubLObject) ZERO_INTEGER ), (SubLObject) Characters.CHAR_asterisk ) )
        ? ONE_INTEGER
        : ZERO_INTEGER );
    final SubLObject var86 = ( var84.numG( (SubLObject) ONE_INTEGER ) && var85.numE( (SubLObject) ONE_INTEGER ) && NIL != Characters.charE( Strings.sublisp_char( var83, module0048.f_1_(
        var84 ) ), (SubLObject) Characters.CHAR_asterisk ) ) ? module0048.f_1_( var84 ) : var84;
    final SubLObject var88;
    final SubLObject var87 = var88 = module0038.f2623( var83, var85, var86 );
    SubLObject var62_87;
    SubLObject var89;
    SubLObject var90;
    SubLObject var91;
    for( var89 = ( var62_87 = Sequences.length( var88 ) ), var90 = (SubLObject) NIL, var90 = (SubLObject) ZERO_INTEGER; !var90.numGE( var62_87 ); var90 = module0048.f_1X( var90 ) )
    {
      var91 = Strings.sublisp_char( var88, var90 );
      Strings.set_char( var87, var90, f52272( Characters.char_downcase( var91 ) ) );
    }
    return var87;
  }

  public static SubLObject f52272(final SubLObject var65)
  {
    if( NIL != Characters.alphanumericp( var65 ) || NIL != Characters.charE( var65, (SubLObject) Characters.CHAR_underbar ) )
    {
      return var65;
    }
    return module0035.f2294( $g6472$.getGlobalValue(), var65, Symbols.symbol_function( (SubLObject) EQL ), (SubLObject) Characters.CHAR_X );
  }

  public static SubLObject f52252(final SubLObject var89, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var90 = SubLProcess.currentSubLThread();
    SubLObject var91 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var89, var89, (SubLObject) $ic64$ );
    var91 = var89.first();
    final SubLObject var93;
    final SubLObject var92 = var93 = var89.rest();
    var90.resetMultipleValues();
    final SubLObject var94 = f52273( var91 );
    final SubLObject var95 = var90.secondMultipleValue();
    final SubLObject var96 = var90.thirdMultipleValue();
    var90.resetMultipleValues();
    if( $ic65$ == var94 )
    {
      Errors.warn( (SubLObject) $ic66$, var91 );
      return f52252( (SubLObject) ConsesLow.listS( (SubLObject) $ic67$, (SubLObject) ConsesLow.list( (SubLObject) $ic68$, var91 ), ConsesLow.append( var93, (SubLObject) NIL ) ), var13,
          var48 );
    }
    final SubLObject var97 = Sequences.length( var93 );
    final SubLObject var98 = Numbers.add( var94, var95 );
    final SubLObject var99 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var97, var98 ) );
    final SubLObject var100 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var98, var97 ) );
    final SubLObject var101 = Numbers.max( (SubLObject) ZERO_INTEGER, Numbers.subtract( var94, var97 ) );
    final SubLObject var102 = (SubLObject) ( ( NIL != var96 ) ? ZERO_INTEGER : var99 );
    if( var101.isPositive() )
    {
      Errors.warn( (SubLObject) $ic69$, var91, var101 );
    }
    if( var102.isPositive() )
    {
      Errors.warn( (SubLObject) $ic70$, var91, var102 );
    }
    f52274( var91, var13 );
    streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var103 = (SubLObject) ZERO_INTEGER;
    if( NIL != var96 )
    {
      f52275( var97, var13 );
      var103 = Numbers.add( var103, (SubLObject) ONE_INTEGER );
    }
    SubLObject var104 = (SubLObject) NIL;
    SubLObject var105 = (SubLObject) NIL;
    SubLObject var106 = (SubLObject) NIL;
    var104 = var93;
    var105 = var104.first();
    for( var106 = (SubLObject) ZERO_INTEGER; NIL != var104; var104 = var104.rest(), var105 = var104.first(), var106 = Numbers.add( (SubLObject) ONE_INTEGER, var106 ) )
    {
      if( !var103.isZero() )
      {
        f52276( var13 );
      }
      f52244( var105, var13, module0048.f_1X( var48 ) );
      var103 = Numbers.add( var103, (SubLObject) ONE_INTEGER );
    }
    if( !var101.isPositive() )
    {
      SubLObject var107;
      for( var107 = (SubLObject) NIL, var107 = (SubLObject) ZERO_INTEGER; var107.numL( var100 ); var107 = Numbers.add( var107, (SubLObject) ONE_INTEGER ) )
      {
        if( !var103.isZero() )
        {
          f52276( var13 );
        }
        f52277( var13 );
        var103 = Numbers.add( var103, (SubLObject) ONE_INTEGER );
      }
    }
    streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) T;
  }

  public static SubLObject f52278(final SubLObject var31)
  {
    final SubLObject var32 = module0815.f52206( var31 );
    if( NIL != var32 )
    {
      return var32;
    }
    return f52279( var31 );
  }

  public static SubLObject f52280(final SubLObject var31)
  {
    final SubLObject var32 = f52268( var31 );
    return Sequences.cconcatenate( (SubLObject) $ic74$, module0006.f203( var32 ) );
  }

  public static SubLObject f52279(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    final SubLObject var33 = module0034.$g879$.getDynamicValue( var32 );
    SubLObject var34 = (SubLObject) NIL;
    if( NIL == var33 )
    {
      return f52280( var31 );
    }
    var34 = module0034.f1857( var33, (SubLObject) $ic73$, (SubLObject) UNPROVIDED );
    if( NIL == var34 )
    {
      var34 = module0034.f1807( module0034.f1842( var33 ), (SubLObject) $ic73$, (SubLObject) ONE_INTEGER, (SubLObject) NIL, (SubLObject) EQ,
          (SubLObject) UNPROVIDED );
      module0034.f1860( var33, (SubLObject) $ic73$, var34 );
    }
    SubLObject var35 = module0034.f1814( var34, var31, (SubLObject) $ic57$ );
    if( var35 == $ic57$ )
    {
      var35 = Values.arg2( var32.resetMultipleValues(), (SubLObject) Values.multiple_value_list( f52280( var31 ) ) );
      module0034.f1816( var34, var31, var35, (SubLObject) UNPROVIDED );
    }
    return module0034.f1959( var35 );
  }

  public static SubLObject f52273(final SubLObject var31)
  {
    final SubLObject var32 = f52281( var31 );
    if( var32 == $ic65$ )
    {
      return Values.values( (SubLObject) $ic65$, (SubLObject) $ic65$, (SubLObject) $ic65$ );
    }
    if( var32 == $ic75$ )
    {
      return module0812.f52005( var31 );
    }
    return module0812.f52006( var32 );
  }

  public static SubLObject f52281(final SubLObject var31)
  {
    final SubLThread var32 = SubLProcess.currentSubLThread();
    SubLObject var33 = module0815.f52209( var31 );
    if( var33 != $ic75$ )
    {
      return var33;
    }
    var33 = module0812.f51983( var31 );
    if( var33 != $ic75$ )
    {
      return var33;
    }
    var33 = module0809.f51528( var31 );
    if( var33 != $ic75$ )
    {
      return var33;
    }
    final SubLObject var34 = Symbols.symbol_name( var31 );
    if( NIL != module0038.f2684( var34, (SubLObject) $ic76$ ) )
    {
      return (SubLObject) $ic77$;
    }
    if( NIL == module0812.f51930() && NIL != Symbols.fboundp( var31 ) )
    {
      var33 = (SubLObject) $ic75$;
      SubLObject var35 = (SubLObject) NIL;
      try
      {
        var32.throwStack.push( $ic78$ );
        final SubLObject var36 = Errors.$error_handler$.currentBinding( var32 );
        try
        {
          Errors.$error_handler$.bind( Symbols.symbol_function( (SubLObject) $ic79$ ), var32 );
          try
          {
            var33 = module0004.f86( var31 );
          }
          catch( Throwable var37 )
          {
            Errors.handleThrowable( var37, (SubLObject) NIL );
          }
        }
        finally
        {
          Errors.$error_handler$.rebind( var36, var32 );
        }
      }
      catch( Throwable var38 )
      {
        var35 = Errors.handleThrowable( var38, (SubLObject) $ic78$ );
      }
      finally
      {
        var32.throwStack.pop();
      }
      if( var33 != $ic75$ )
      {
        return var33;
      }
      Errors.warn( (SubLObject) $ic80$, var31 );
    }
    Errors.warn( (SubLObject) $ic81$, var31 );
    return (SubLObject) $ic65$;
  }

  public static SubLObject f52276(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) $ic82$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52277(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) $ic83$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52275(final SubLObject var96, final SubLObject var13)
  {
    assert NIL != module0004.f106( var96 ) : var96;
    if( var96.numL( (SubLObject) TWENTY_INTEGER ) )
    {
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic46$, var96 ), var13, (SubLObject) UNPROVIDED );
    }
    return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic68$, var96 ), var13, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52250(final SubLObject var50)
  {
    return module0035.f2294( $g6473$.getGlobalValue(), var50, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52251(final SubLObject var51, final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var52 = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( var52 ) && NIL == module0004.f85( var51 ) )
    {
      Errors.error( (SubLObject) $ic86$, var51 );
    }
    return Functions.funcall( var51, var49, var13, var48 );
  }

  public static SubLObject f52282(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic88$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic87$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52283(final SubLObject var50, final SubLObject var56, final SubLObject var112, final SubLObject var13, final SubLObject var48)
  {
    f52274( var50, var13 );
    streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52244( var56, var13, module0048.f_1X( var48 ) );
    f52276( var13 );
    f52274( var112, var13 );
    streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52284(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic89$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic87$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52285(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic87$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic87$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic90$ );
      f52283( var50, var51, var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic87$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52286(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic91$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic91$ );
    final SubLObject var53 = var52.rest();
    var52 = var52.first();
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    SubLObject var56 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic91$ );
    var54 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic91$ );
    var55 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic91$ );
    var56 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      final SubLObject var57;
      var52 = ( var57 = var53 );
      module0035.f2502( var51, (SubLObject) $ic92$ );
      return f52287( (SubLObject) ConsesLow.list( (SubLObject) $ic93$, (SubLObject) ConsesLow.list( (SubLObject) $ic94$, var54, var56 ), (SubLObject) ConsesLow.list( (SubLObject) $ic95$,
          (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic96$, (SubLObject) ConsesLow.list( (SubLObject) $ic97$, var56 ) ), (SubLObject) ConsesLow.listS(
              (SubLObject) $ic98$, var55, (SubLObject) $ic99$ ) ), reader.bq_cons( (SubLObject) $ic100$, ConsesLow.append( var57, (SubLObject) NIL ) ) ), (SubLObject) ConsesLow
                  .list( (SubLObject) $ic101$, var54, var56 ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic91$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52288(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic102$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic102$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic102$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic102$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic102$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) $ic103$ );
      return f52287( (SubLObject) ConsesLow.listS( (SubLObject) $ic93$, (SubLObject) ConsesLow.list( (SubLObject) $ic104$, var54, var55 ), (SubLObject) ConsesLow.list(
          (SubLObject) $ic105$, var53, var55 ), ConsesLow.append( var56, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic106$, var54, var55 ) ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic102$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52289(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic107$ );
    var51 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic107$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var51, (SubLObject) $ic108$ );
    SubLObject var55 = (SubLObject) NIL;
    SubLObject var56 = (SubLObject) NIL;
    SubLObject var57 = var52;
    SubLObject var58 = (SubLObject) NIL;
    var58 = var57.first();
    while ( NIL != var57)
    {
      SubLObject var138_139;
      final SubLObject var136_137 = var138_139 = var58;
      SubLObject var59 = (SubLObject) NIL;
      SubLObject var60 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var138_139, var136_137, (SubLObject) $ic109$ );
      var59 = var138_139.first();
      var138_139 = var138_139.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var138_139, var136_137, (SubLObject) $ic109$ );
      var60 = var138_139.first();
      var138_139 = var138_139.rest();
      if( NIL == var138_139 )
      {
        var55 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic110$, var59, var60 ), var55 );
        var56 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic111$, var59 ), var56 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var136_137, (SubLObject) $ic109$ );
      }
      var57 = var57.rest();
      var58 = var57.first();
    }
    return f52287( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( Sequences.nreverse( var55 ), var54, var56, (SubLObject) NIL ) ), var13, var48 );
  }

  public static SubLObject f52290(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic107$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic107$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) $ic112$ );
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = var51;
    SubLObject var56 = (SubLObject) NIL;
    var56 = var55.first();
    while ( NIL != var55)
    {
      SubLObject var146_147;
      final SubLObject var144_145 = var146_147 = var56;
      SubLObject var57 = (SubLObject) NIL;
      SubLObject var58 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var146_147, var144_145, (SubLObject) $ic109$ );
      var57 = var146_147.first();
      var146_147 = var146_147.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var146_147, var144_145, (SubLObject) $ic109$ );
      var58 = var146_147.first();
      var146_147 = var146_147.rest();
      if( NIL == var146_147 )
      {
        var54 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic113$, var57, var58 ), var54 );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var144_145, (SubLObject) $ic109$ );
      }
      var55 = var55.rest();
      var56 = var55.first();
    }
    return f52244( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( Sequences.nreverse( var54 ), var53, (SubLObject) NIL ) ), var13, var48 );
  }

  public static SubLObject f52291(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic114$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic114$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic115$ );
      streams_high.write_string( (SubLObject) $ic116$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var51, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic114$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52292(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic117$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic117$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic117$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic117$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic117$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) $ic118$ );
      return f52290( (SubLObject) ConsesLow.listS( (SubLObject) $ic112$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( var55, var53 ) ), (SubLObject) ConsesLow.list(
          (SubLObject) $ic119$, var55, var54 ), ConsesLow.append( var56, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic120$, var55 ) ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic117$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52293(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL != var53 )
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic121$ );
      return (SubLObject) NIL;
    }
    module0035.f2502( var50, (SubLObject) $ic98$ );
    final SubLObject var54 = f52259( var51 );
    if( var54.eql( (SubLObject) $ic51$ ) )
    {
      return f52294( (SubLObject) ConsesLow.list( (SubLObject) $ic122$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) $ic48$ ) )
    {
      return f52295( (SubLObject) ConsesLow.list( (SubLObject) $ic123$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) $ic49$ ) )
    {
      return f52296( (SubLObject) ConsesLow.list( (SubLObject) $ic124$, var51, var52 ), var13, var48 );
    }
    if( var54.eql( (SubLObject) $ic50$ ) )
    {
      return Errors.error( (SubLObject) $ic125$, var51 );
    }
    return Errors.error( (SubLObject) $ic126$, var51 );
  }

  public static SubLObject f52295(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic123$ );
      f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic127$, var51, var52 ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic121$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52296(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic124$ );
      f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic128$, var51, var52 ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic121$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52294(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic121$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic121$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic122$ );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      f52297( var13 );
      f52244( var52, var13, module0048.f_1X( var48 ) );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic121$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52297(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) $ic129$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52298(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic130$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic130$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic130$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) $ic131$ );
    return f52287( (SubLObject) ConsesLow.listS( (SubLObject) $ic93$, (SubLObject) ConsesLow.list( (SubLObject) $ic132$, var51 ), var52, (SubLObject) ConsesLow.list( (SubLObject) $ic133$,
        var51 ), ConsesLow.append( var54, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic134$, var51 ) ) ) ), var13, var48 );
  }

  public static SubLObject f52299(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    if( $ic25$ != module0813.f52035() )
    {
      SubLObject var50 = (SubLObject) NIL;
      SubLObject var51 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic135$ );
      var50 = var49.first();
      SubLObject var52 = var49.rest();
      cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic135$ );
      var51 = var52.first();
      var52 = var52.rest();
      if( NIL == var52 )
      {
        module0035.f2502( var50, (SubLObject) $ic136$ );
        streams_high.write_string( (SubLObject) $ic137$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52244( module0038.f2623( var51, (SubLObject) ONE_INTEGER, module0048.f_1_( Sequences.length( var51 ) ) ), var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic135$ );
      }
      return (SubLObject) T;
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52300(final SubLObject var49, final SubLObject var13, SubLObject var48)
  {
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) NIL;
    }
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) $ic138$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52301(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic139$ );
    var51 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic139$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic139$ );
    var53 = var54.first();
    var54 = var54.rest();
    final SubLObject var55 = (SubLObject) ( var54.isCons() ? var54.first() : NIL );
    cdestructuring_bind.destructuring_bind_must_listp( var54, var49, (SubLObject) $ic139$ );
    var54 = var54.rest();
    if( NIL == var54 )
    {
      if( NIL != var55 )
      {
        f52302( var55, var13 );
      }
      if( NIL != $g6471$.getDynamicValue( var50 ) )
      {
        streams_high.write_string( (SubLObject) $ic116$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      if( NIL != module0812.f51991( var52 ) )
      {
        streams_high.write_string( (SubLObject) $ic37$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      f52243( var13 );
      streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var52, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic139$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52303()
  {
    final SubLThread var6 = SubLProcess.currentSubLThread();
    return $g6474$.getDynamicValue( var6 );
  }

  public static SubLObject f52304(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic140$ );
    var51 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic140$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic140$ );
    var53 = var54.first();
    final SubLObject var55;
    var54 = ( var55 = var54.rest() );
    module0035.f2502( var51, (SubLObject) $ic141$ );
    if( NIL != module0812.f51930() && NIL == Errors.$ignore_mustsP$.getDynamicValue( var50 ) && !var48.numE( (SubLObject) ZERO_INTEGER ) )
    {
      Errors.error( (SubLObject) $ic142$, var51 );
    }
    final SubLObject var56 = (SubLObject) $ic143$;
    SubLObject var57 = (SubLObject) NIL;
    final SubLObject var58 = Errors.$restarts$.currentBinding( var50 );
    try
    {
      Errors.$restarts$.bind( (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var56, (SubLObject) $ic144$, var52 ), Errors.$restarts$.getDynamicValue( var50 ) ), var50 );
      try
      {
        var50.throwStack.push( var56 );
        final SubLObject var59 = module0819.f52530( var55 );
        final SubLObject var60 = f52305( var52, var53, var55 );
        if( NIL != var59 )
        {
          f52302( var59, var13 );
        }
        f52306( var52, var13, var48 );
        if( NIL != module0812.f51988( var52 ) )
        {
          streams_high.write_string( (SubLObject) $ic37$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        }
        f52245( var13, var52, var53, var48 );
        streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        final SubLObject var8_179 = $g6474$.currentBinding( var50 );
        try
        {
          $g6474$.bind( f52307( var60 ), var50 );
          f52244( var60, var13, var48 );
        }
        finally
        {
          $g6474$.rebind( var8_179, var50 );
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
    return (SubLObject) NIL;
  }

  public static SubLObject f52305(final SubLObject var83, final SubLObject var106, SubLObject var123)
  {
    final SubLThread var124 = SubLProcess.currentSubLThread();
    SubLObject var126;
    final SubLObject var125 = var126 = var123;
    SubLObject var127 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var126, var125, (SubLObject) $ic145$ );
    var127 = var126.first();
    final SubLObject var128;
    var126 = ( var128 = var126.rest() );
    if( var127.isString() )
    {
      var123 = var128;
    }
    if( NIL != f52308( var83 ) )
    {
      Errors.warn( (SubLObject) $ic146$, var83 );
      var123 = f52309( var123 );
    }
    var124.resetMultipleValues();
    final SubLObject var129 = f52310( var106 );
    final SubLObject var130 = var124.secondMultipleValue();
    var124.resetMultipleValues();
    SubLObject var131 = ConsesLow.append( var129, var123, (SubLObject) NIL );
    if( NIL != var130 )
    {
      var131 = (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.listS( (SubLObject) $ic112$, var130, ConsesLow.append( var131, (SubLObject) NIL ) ) );
    }
    var131 = reader.bq_cons( (SubLObject) $ic147$, ConsesLow.append( var131, (SubLObject) NIL ) );
    final SubLObject var132 = module0814.f52178( var131 );
    return reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var132, (SubLObject) NIL ) );
  }

  public static SubLObject f52302(final SubLObject var173, final SubLObject var13)
  {
    if( $ic25$ != module0813.f52035() )
    {
      streams_high.write_string( (SubLObject) $ic148$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( var173, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.write_string( (SubLObject) $ic28$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      streams_high.terpri( var13 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52306(final SubLObject var187, final SubLObject var13, final SubLObject var48)
  {
    if( NIL == module0813.f52033() )
    {
      final SubLObject var188 = module0809.f51626( var187 );
      if( NIL != var188 )
      {
        f52244( var188, var13, var48 );
        streams_high.terpri( var13 );
        f52247( var13, var48 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52311(final SubLObject var30, final SubLObject var13, final SubLObject var48)
  {
    if( NIL == module0813.f52033() )
    {
      final SubLObject var49 = module0809.f51628( var30 );
      if( NIL != var49 )
      {
        f52244( var49, var13, var48 );
        streams_high.terpri( var13 );
        f52247( var13, var48 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52245(final SubLObject var13, final SubLObject var31, SubLObject var106, SubLObject var48)
  {
    if( var106 == UNPROVIDED )
    {
      var106 = (SubLObject) $ic38$;
    }
    if( var48 == UNPROVIDED )
    {
      var48 = (SubLObject) ZERO_INTEGER;
    }
    if( var106 == $ic38$ )
    {
      var106 = f52281( var31 );
    }
    if( var106 == $ic65$ )
    {
      var106 = (SubLObject) NIL;
    }
    f52243( var13 );
    streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52274( var31, var13 );
    f52312( var106, var13, var48 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52274(final SubLObject var31, final SubLObject var13)
  {
    if( NIL != module0035.f2169( module0813.f52035(), (SubLObject) $ic53$ ) )
    {
      final SubLObject var32 = f52313( var31 );
      if( NIL != var32 )
      {
        return PrintLow.format( var13, (SubLObject) $ic149$, var32 );
      }
    }
    return streams_high.write_string( f52278( var31 ), var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52313(final SubLObject var31)
  {
    if( module0018.$g577$.getGlobalValue().eql( Symbols.symbol_package( var31 ) ) && NIL == module0815.f52207( var31 ) )
    {
      final SubLObject var32 = module0813.f52032();
      if( NIL != var32 )
      {
        return module0813.f52096( var32, var31 );
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52310(final SubLObject var106)
  {
    final SubLObject var107 = conses_high.member( (SubLObject) $ic150$, var106, Symbols.symbol_function( (SubLObject) EQ ), (SubLObject) UNPROVIDED ).rest();
    SubLObject var108 = (SubLObject) NIL;
    SubLObject var109 = (SubLObject) NIL;
    SubLObject var110 = (SubLObject) NIL;
    if( NIL == var110 )
    {
      SubLObject var111 = var107;
      SubLObject var112 = (SubLObject) NIL;
      var112 = var111.first();
      while ( NIL == var110 && NIL != var111)
      {
        if( var112 == $ic151$ )
        {
          var110 = (SubLObject) T;
        }
        else if( var112.isCons() )
        {
          SubLObject var114;
          final SubLObject var113 = var114 = var112;
          SubLObject var115 = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var114, var113, (SubLObject) $ic152$ );
          var115 = var114.first();
          var114 = var114.rest();
          final SubLObject var116 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
          cdestructuring_bind.destructuring_bind_must_listp( var114, var113, (SubLObject) $ic152$ );
          var114 = var114.rest();
          final SubLObject var117 = (SubLObject) ( var114.isCons() ? var114.first() : NIL );
          cdestructuring_bind.destructuring_bind_must_listp( var114, var113, (SubLObject) $ic152$ );
          var114 = var114.rest();
          if( NIL == var114 )
          {
            if( NIL != var117 )
            {
              var108 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( var117, (SubLObject) ConsesLow.list( (SubLObject) $ic153$, var115 ) ), var108 );
            }
            var109 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.list( (SubLObject) $ic154$, var115, var116 ), var109 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var113, (SubLObject) $ic152$ );
          }
        }
        else
        {
          var109 = (SubLObject) ConsesLow.cons( (SubLObject) ConsesLow.listS( (SubLObject) $ic154$, var112, (SubLObject) $ic155$ ), var109 );
        }
        var111 = var111.rest();
        var112 = var111.first();
      }
    }
    return Values.values( Sequences.nreverse( var109 ), Sequences.nreverse( var108 ) );
  }

  public static SubLObject f52243(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) $ic156$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52312(final SubLObject var106, final SubLObject var13, final SubLObject var48)
  {
    if( NIL == var106 )
    {
      streams_high.write_string( (SubLObject) $ic157$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      return (SubLObject) NIL;
    }
    streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var107 = (SubLObject) ZERO_INTEGER;
    SubLObject var108 = (SubLObject) NIL;
    SubLObject var109 = (SubLObject) NIL;
    SubLObject var110 = (SubLObject) NIL;
    var108 = var106;
    var109 = var108.first();
    for( var110 = (SubLObject) ZERO_INTEGER; NIL != var108; var108 = var108.rest(), var109 = var108.first(), var110 = Numbers.add( (SubLObject) ONE_INTEGER, var110 ) )
    {
      if( var109 != $ic150$ )
      {
        if( !var107.isZero() )
        {
          f52314( var13 );
        }
        if( NIL == f52303() )
        {
          f52243( var13 );
          streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        }
        f52315( var109, var13 );
        var107 = Numbers.add( var107, (SubLObject) ONE_INTEGER );
      }
    }
    streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    if( NIL != f52303() )
    {
      SubLObject var111 = var106;
      SubLObject var112 = (SubLObject) NIL;
      var112 = var111.first();
      while ( NIL != var111)
      {
        if( var112 != $ic150$ )
        {
          final SubLObject var113 = f52316( var112 );
          f52246( (SubLObject) ConsesLow.list( (SubLObject) $ic113$, var113 ), var13, var48 );
        }
        var111 = var111.rest();
        var112 = var111.first();
      }
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52314(final SubLObject var13)
  {
    return streams_high.write_string( (SubLObject) $ic82$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52315(final SubLObject var104, final SubLObject var13)
  {
    return f52244( f52316( var104 ), var13, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52316(final SubLObject var104)
  {
    return var104.isCons() ? var104.first() : var104;
  }

  public static SubLObject f52307(final SubLObject var49)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    return (SubLObject) makeBoolean( NIL != module0035.f2434( (SubLObject) $ic131$, var49 ) || NIL != module0035.f2434( (SubLObject) $ic92$, var49 ) );
  }

  public static SubLObject f52308(final SubLObject var83)
  {
    final SubLObject var84 = module0812.f51930();
    if( NIL != var84 )
    {
      return module0812.f51994( var84, var83 );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52309(SubLObject var123)
  {
    final SubLThread var124 = SubLProcess.currentSubLThread();
    var123 = module0036.f2531( var123, (SubLObject) $ic158$, (SubLObject) $ic159$, (SubLObject) UNPROVIDED );
    final SubLObject var125 = module0811.f51788( (SubLObject) $ic160$ );
    final SubLObject var126 = (SubLObject) $ic161$;
    final SubLObject var127 = (SubLObject) $ic162$;
    return (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic112$, (SubLObject) ConsesLow.list( reader.bq_cons( var126, (SubLObject) $ic155$ ) ), (SubLObject) ConsesLow
        .listS( (SubLObject) $ic92$, (SubLObject) ConsesLow.list( var125, var126, var127 ), ConsesLow.append( var123, (SubLObject) NIL ) ), (SubLObject) ConsesLow.list(
            (SubLObject) $ic163$, var126 ) ) );
  }

  public static SubLObject f52317(final SubLObject var56)
  {
    return (SubLObject) makeBoolean( NIL != module0035.f2501( var56, (SubLObject) $ic163$ ) && NIL != module0035.f1995( var56, (SubLObject) TWO_INTEGER,
        (SubLObject) UNPROVIDED ) );
  }

  public static SubLObject f52318(final SubLObject var199)
  {
    SubLObject var200 = (SubLObject) NIL;
    SubLObject var201 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var199, var199, (SubLObject) $ic164$ );
    var200 = var199.first();
    SubLObject var202 = var199.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var202, var199, (SubLObject) $ic164$ );
    var201 = var202.first();
    var202 = var202.rest();
    if( NIL == var202 )
    {
      module0035.f2502( var200, (SubLObject) $ic163$ );
      final SubLObject var203 = module0811.f51788( (SubLObject) $ic160$ );
      return (SubLObject) ConsesLow.list( (SubLObject) $ic165$, var203, var201 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var199, (SubLObject) $ic164$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52319(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic140$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic140$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic140$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) $ic166$ );
    return f52244( (SubLObject) ConsesLow.listS( (SubLObject) $ic141$, var51, var52, ConsesLow.append( var54, (SubLObject) NIL ) ), var13, var48 );
  }

  public static SubLObject f52320(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) $ic167$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52321(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) $ic168$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52322(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic169$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic170$ );
    final SubLObject var210_211;
    final SubLObject var208_209 = var210_211 = var52;
    final SubLObject var53 = cdestructuring_bind.property_list_member( (SubLObject) $ic171$, var210_211 );
    final SubLObject var54 = (SubLObject) ( ( NIL != var53 ) ? conses_high.cadr( var53 ) : NIL );
    PrintLow.format( var13, (SubLObject) $ic172$, var54 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52323(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic173$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52324(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic174$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52325(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic175$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52326(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic64$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic176$ );
    final SubLObject var53 = module0811.f51788( Eval.macroexpand_1( var49, (SubLObject) UNPROVIDED ) );
    return f52244( var53, var13, var48 );
  }

  public static SubLObject f52327(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLObject var50 = var49.first();
    module0035.f2502( var50, (SubLObject) $ic177$ );
    return f52301( var49, var13, var48 );
  }

  public static SubLObject f52328(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic178$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic178$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic178$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic178$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( NIL == var54 )
    {
      module0035.f2502( var50, (SubLObject) $ic179$ );
      streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic180$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var52, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic181$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic178$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52329(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic182$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic95$ );
    if( NIL == var52 )
    {
      return f52287( (SubLObject) $ic183$, var13, var48 );
    }
    SubLObject var232_233;
    final SubLObject var230_231 = var232_233 = var52;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var232_233, var230_231, (SubLObject) $ic184$ );
    var53 = var232_233.first();
    final SubLObject var54;
    var232_233 = ( var54 = var232_233.rest() );
    SubLObject var238_239;
    final SubLObject var236_237 = var238_239 = var53;
    SubLObject var55 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var238_239, var236_237, (SubLObject) $ic185$ );
    var55 = var238_239.first();
    final SubLObject var56;
    var238_239 = ( var56 = var238_239.rest() );
    streams_high.write_string( (SubLObject) $ic186$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52244( var55, var13, module0048.f_1X( var48 ) );
    streams_high.write_string( (SubLObject) $ic187$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52287( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var56, (SubLObject) NIL ) ), var13, var48 );
    SubLObject var57 = var54;
    SubLObject var58 = (SubLObject) NIL;
    var58 = var57.first();
    while ( NIL != var57)
    {
      SubLObject var245_246;
      final SubLObject var243_244 = var245_246 = var58;
      SubLObject var240_247 = (SubLObject) NIL;
      cdestructuring_bind.destructuring_bind_must_consp( var245_246, var243_244, (SubLObject) $ic185$ );
      var240_247 = var245_246.first();
      final SubLObject var241_248;
      var245_246 = ( var241_248 = var245_246.rest() );
      if( var240_247.equal( (SubLObject) $ic100$ ) )
      {
        if( NIL != var241_248 )
        {
          streams_high.write_string( (SubLObject) $ic188$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
          f52287( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var241_248, (SubLObject) NIL ) ), var13, var48 );
        }
      }
      else
      {
        streams_high.write_string( (SubLObject) $ic189$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52244( var240_247, var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) $ic187$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52287( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var241_248, (SubLObject) NIL ) ), var13, var48 );
      }
      var57 = var57.rest();
      var58 = var57.first();
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52287(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic190$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic93$ );
    streams_high.write_string( (SubLObject) $ic191$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    SubLObject var53 = var52;
    SubLObject var54 = (SubLObject) NIL;
    var54 = var53.first();
    while ( NIL != var53)
    {
      f52246( var54, var13, module0048.f_1X( var48 ) );
      var53 = var53.rest();
      var54 = var53.first();
    }
    streams_high.terpri( var13 );
    f52247( var13, var48 );
    streams_high.write_string( (SubLObject) $ic192$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52330(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return (SubLObject) NIL;
  }

  public static SubLObject f52331(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic193$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic193$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic163$ );
      streams_high.write_string( (SubLObject) $ic194$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic193$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52332(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic195$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic195$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) $ic196$ );
    streams_high.write_string( (SubLObject) $ic197$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52244( var51, var13, module0048.f_1X( var48 ) );
    streams_high.write_string( (SubLObject) $ic187$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52244( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var53, (SubLObject) NIL ) ), var13, var48 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52333(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic198$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic199$ );
    if( NIL == var52 )
    {
      f52334( (SubLObject) $ic100$, var13, module0048.f_1X( var48 ) );
    }
    else if( NIL != module0035.f1997( var52 ) )
    {
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
      SubLObject var53 = var52.rest();
      SubLObject var54 = (SubLObject) NIL;
      var54 = var53.first();
      while ( NIL != var53)
      {
        streams_high.terpri( var13 );
        f52247( var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) $ic200$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52244( var54, var13, module0048.f_1X( var48 ) );
        var53 = var53.rest();
        var54 = var53.first();
      }
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52335(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic201$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    SubLObject var56 = (SubLObject) NIL;
    SubLObject var57 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    var55 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    var56 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic201$ );
    var57 = var51.first();
    var51 = var51.rest();
    if( NIL == var51 )
    {
      final SubLObject var58;
      var51 = ( var58 = var52 );
      module0035.f2502( var50, (SubLObject) $ic202$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic112$, (SubLObject) ConsesLow.list( reader.bq_cons( var56, (SubLObject) $ic155$ ) ), (SubLObject) ConsesLow.listS(
          (SubLObject) $ic203$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic122$, var56, (SubLObject) ConsesLow.listS(
              (SubLObject) $ic204$, var55, (SubLObject) $ic155$ ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic96$, var56 ), (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list(
                  (SubLObject) $ic122$, var56, (SubLObject) ConsesLow.list( (SubLObject) $ic204$, var55, var56 ) ) ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic98$, var53,
                      (SubLObject) ConsesLow.list( (SubLObject) $ic205$, var55, var56 ) ), (SubLObject) ConsesLow.list( (SubLObject) $ic98$, var54, (SubLObject) ConsesLow.list(
                          (SubLObject) $ic206$, var55, var56 ) ), ConsesLow.append( var58, (SubLObject) NIL ) ) ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic201$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52336(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic207$ );
    var50 = var49.first();
    final SubLObject var51 = var49.rest();
    if( NIL == var51 )
    {
      module0035.f2502( var50, (SubLObject) $ic208$ );
      streams_high.write_string( (SubLObject) $ic209$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic207$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52337(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic210$ );
    var50 = var49.first();
    SubLObject var51 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic210$ );
    final SubLObject var52 = var51.rest();
    var51 = var51.first();
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic210$ );
    var53 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic210$ );
    var54 = var51.first();
    var51 = var51.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var51, var49, (SubLObject) $ic210$ );
    var55 = var51.first();
    var51 = var51.rest();
    if( NIL == var51 )
    {
      final SubLObject var56;
      var51 = ( var56 = var52 );
      module0035.f2502( var50, (SubLObject) $ic203$ );
      streams_high.write_string( (SubLObject) $ic211$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != var53 )
      {
        SubLObject var275_276;
        final SubLObject var273_274 = var275_276 = var53;
        SubLObject var57 = (SubLObject) NIL;
        SubLObject var58 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var275_276, var273_274, (SubLObject) $ic212$ );
        var57 = var275_276.first();
        var275_276 = ( var58 = var275_276.rest() );
        f52244( var57, var13, module0048.f_1X( var48 ) );
        SubLObject var59 = var58;
        SubLObject var60 = (SubLObject) NIL;
        var60 = var59.first();
        while ( NIL != var59)
        {
          f52276( var13 );
          f52244( var60, var13, module0048.f_1X( var48 ) );
          var59 = var59.rest();
          var60 = var59.first();
        }
      }
      streams_high.write_string( (SubLObject) $ic213$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var54, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic213$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      if( NIL != var55 )
      {
        SubLObject var282_283;
        final SubLObject var280_281 = var282_283 = var55;
        SubLObject var61 = (SubLObject) NIL;
        SubLObject var62 = (SubLObject) NIL;
        cdestructuring_bind.destructuring_bind_must_consp( var282_283, var280_281, (SubLObject) $ic214$ );
        var61 = var282_283.first();
        var282_283 = ( var62 = var282_283.rest() );
        f52244( var61, var13, module0048.f_1X( var48 ) );
        SubLObject var59 = var62;
        SubLObject var63 = (SubLObject) NIL;
        var63 = var59.first();
        while ( NIL != var59)
        {
          f52276( var13 );
          f52244( var63, var13, module0048.f_1X( var48 ) );
          var59 = var59.rest();
          var63 = var59.first();
        }
      }
      streams_high.write_string( (SubLObject) $ic187$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var56, (SubLObject) NIL ) ), var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic210$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52338(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic215$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic215$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic215$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic216$ );
      f52339( var51, var52, var13 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic215$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52339(final SubLObject var289, final SubLObject var290, final SubLObject var13)
  {
    streams_high.write_string( (SubLObject) $ic217$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    f52256( var289, var13 );
    streams_high.write_string( (SubLObject) $ic218$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    return (SubLObject) NIL;
  }

  public static SubLObject f52340(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic219$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic219$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic219$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic219$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( NIL == var54 )
    {
      module0035.f2502( var50, (SubLObject) $ic220$ );
      streams_high.write_string( (SubLObject) $ic221$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52339( var51, var52, var13 );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic219$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52341(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic222$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic222$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic68$ );
      SubLObject var53 = (SubLObject) NIL;
      if( var51.isString() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic223$, var51 );
      }
      else if( var51.isSymbol() )
      {
        var53 = f52342( var51 );
      }
      else if( NIL != f52343( var51 ) )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic224$, var51 );
      }
      else if( var51.isInteger() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic225$, print_high.princ_to_string( var51 ) );
      }
      else if( var51.isDouble() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic226$, var51 );
      }
      else if( var51.isChar() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic227$, Characters.char_code( var51 ) );
      }
      else if( var51.isPackage() )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic228$, Packages.package_name( var51 ) );
      }
      else if( NIL != Guids.guid_p( var51 ) )
      {
        var53 = (SubLObject) ConsesLow.list( (SubLObject) $ic229$, Guids.guid_to_string( var51 ) );
      }
      else
      {
        Errors.error( (SubLObject) $ic230$, var51 );
      }
      f52244( var53, var13, var48 );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic222$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52342(final SubLObject var296)
  {
    final SubLThread var297 = SubLProcess.currentSubLThread();
    final SubLObject var298 = module0813.f52099( var296 );
    final SubLObject var299 = module0018.f953( var296 );
    if( NIL == var299 )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic231$, var298 );
    }
    if( var299.eql( module0018.$g575$.getGlobalValue() ) )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic232$, var298 );
    }
    if( var296.eql( Packages.find_symbol( var298, Packages.$package$.getDynamicValue( var297 ) ) ) )
    {
      return (SubLObject) ConsesLow.list( (SubLObject) $ic233$, var298 );
    }
    return (SubLObject) ConsesLow.list( (SubLObject) $ic234$, var298, Packages.package_name( var299 ) );
  }

  public static SubLObject f52343(final SubLObject var56)
  {
    return (SubLObject) makeBoolean( var56.isInteger() && var56.numLE( (SubLObject) $ic235$ ) && var56.numGE( (SubLObject) $ic236$ ) );
  }

  public static SubLObject f52344(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic237$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic237$ );
    var51 = var52.first();
    var52 = var52.rest();
    final SubLObject var53 = (SubLObject) ( var52.isCons() ? var52.first() : NIL );
    final SubLObject var54 = Types.consp( var52 );
    cdestructuring_bind.destructuring_bind_must_listp( var52, var49, (SubLObject) $ic237$ );
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic113$ );
      if( NIL != f52303() )
      {
        streams_high.write_string( (SubLObject) $ic238$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      f52243( var13 );
      streams_high.write_string( (SubLObject) $ic35$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var51, var13, var48 );
      if( NIL != var54 )
      {
        f52297( var13 );
        f52244( var53, var13, var48 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic237$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52345(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic164$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic164$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic239$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic240$, var51 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic164$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52334(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic45$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic45$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic241$ );
      final SubLObject var53 = var51;
      if( var53.eql( (SubLObject) $ic242$ ) )
      {
        streams_high.write_string( (SubLObject) $ic243$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else if( var53.eql( (SubLObject) $ic244$ ) )
      {
        streams_high.write_string( (SubLObject) $ic245$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      }
      else
      {
        Errors.error( (SubLObject) $ic246$, var51 );
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic45$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52346(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic164$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic164$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var50, (SubLObject) $ic247$ );
      streams_high.write_string( (SubLObject) $ic248$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var51, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic249$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic164$ );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52347(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic250$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic250$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic250$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var50, (SubLObject) $ic251$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic252$, var51, var52 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic250$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52348(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic198$ );
    var50 = var49.first();
    final SubLObject var52;
    final SubLObject var51 = var52 = var49.rest();
    module0035.f2502( var50, (SubLObject) $ic253$ );
    if( NIL == var52 )
    {
      f52334( (SubLObject) $ic254$, var13, module0048.f_1X( var48 ) );
    }
    else if( NIL != module0035.f1997( var52 ) )
    {
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
    }
    else
    {
      streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52244( var52.first(), var13, module0048.f_1X( var48 ) );
      SubLObject var53 = var52.rest();
      SubLObject var54 = (SubLObject) NIL;
      var54 = var53.first();
      while ( NIL != var53)
      {
        streams_high.terpri( var13 );
        f52247( var13, module0048.f_1X( var48 ) );
        streams_high.write_string( (SubLObject) $ic255$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        f52244( var54, var13, module0048.f_1X( var48 ) );
        var53 = var53.rest();
        var54 = var53.first();
      }
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    return (SubLObject) NIL;
  }

  public static SubLObject f52349(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    SubLObject var54 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic256$ );
    var50 = var49.first();
    SubLObject var55 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) $ic256$ );
    var51 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) $ic256$ );
    var52 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) $ic256$ );
    var53 = var55.first();
    var55 = var55.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var55, var49, (SubLObject) $ic256$ );
    var54 = var55.first();
    var55 = var55.rest();
    if( NIL == var55 )
    {
      final SubLObject var56 = module0813.f52099( var51 );
      module0035.f2502( var50, (SubLObject) $ic257$ );
      streams_high.write_string( (SubLObject) $ic258$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52274( var51, var13 );
      f52276( var13 );
      f52244( var56, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var52, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52334( (SubLObject) ( ( NIL != var54 ) ? $ic100$ : $ic254$ ), var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic256$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52350(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    SubLObject var53 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic259$ );
    var50 = var49.first();
    SubLObject var54 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic259$ );
    var51 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic259$ );
    var52 = var54.first();
    var54 = var54.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var54, var49, (SubLObject) $ic259$ );
    var53 = var54.first();
    var54 = var54.rest();
    if( NIL == var54 )
    {
      final SubLObject var55 = module0813.f52099( var52 );
      module0035.f2502( var50, (SubLObject) $ic260$ );
      print_high.princ( var51, var13 );
      streams_high.write_string( (SubLObject) $ic71$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52260( var52, var13 );
      f52276( var13 );
      f52244( var55, var13, module0048.f_1X( var48 ) );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic259$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52351(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic261$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic261$ );
    var51 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      final SubLObject var53 = module0813.f52099( var51 );
      module0035.f2502( var50, (SubLObject) $ic262$ );
      streams_high.write_string( (SubLObject) $ic263$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
      f52274( var51, var13 );
      f52276( var13 );
      f52244( var53, var13, module0048.f_1X( var48 ) );
      streams_high.write_string( (SubLObject) $ic72$, var13, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic261$ );
    }
    return (SubLObject) T;
  }

  public static SubLObject f52352(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic264$ );
    var50 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic264$ );
    var51 = var52.first();
    final SubLObject var53;
    var52 = ( var53 = var52.rest() );
    module0035.f2502( var50, (SubLObject) $ic265$ );
    SubLObject var54 = reader.bq_cons( (SubLObject) $ic93$, ConsesLow.append( var53, (SubLObject) NIL ) );
    var54 = module0814.f52164( var54 );
    return f52244( var54, var13, var48 );
  }

  public static SubLObject f52353(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic266$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic266$ );
    final SubLObject var53 = var52.rest();
    var52 = var52.first();
    SubLObject var54 = (SubLObject) NIL;
    SubLObject var55 = (SubLObject) NIL;
    SubLObject var56 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic266$ );
    var54 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic266$ );
    var55 = var52.first();
    var52 = var52.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic266$ );
    var56 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      final SubLObject var57;
      var52 = ( var57 = var53 );
      module0035.f2502( var51, (SubLObject) $ic267$ );
      final SubLObject var58 = (SubLObject) ConsesLow.listS( (SubLObject) $ic108$, (SubLObject) ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) $ic268$, var54 ) ), ConsesLow.append( var57,
          (SubLObject) NIL ) );
      return f52244( var58, var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic266$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52354(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    SubLObject var50 = (SubLObject) NIL;
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic269$ );
    var50 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic269$ );
    var51 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic269$ );
    var52 = var53.first();
    final SubLObject var54;
    var53 = ( var54 = var53.rest() );
    module0035.f2502( var50, (SubLObject) $ic270$ );
    return f52287( (SubLObject) ConsesLow.listS( (SubLObject) $ic93$, (SubLObject) ConsesLow.list( (SubLObject) $ic271$, var51, var52 ), ConsesLow.append( var54, (SubLObject) ConsesLow.list(
        (SubLObject) ConsesLow.list( (SubLObject) $ic272$, var51, var52 ) ) ) ), var13, var48 );
  }

  public static SubLObject f52355(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var333_334 = (SubLObject) NIL;
    SubLObject var52 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic273$ );
    var51 = var49.first();
    SubLObject var53 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic273$ );
    var333_334 = var53.first();
    var53 = var53.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var53, var49, (SubLObject) $ic273$ );
    var52 = var53.first();
    var53 = var53.rest();
    if( NIL == var53 )
    {
      module0035.f2502( var51, (SubLObject) $ic274$ );
      return f52244( (SubLObject) ConsesLow.list( (SubLObject) $ic275$, var52 ), var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic273$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52356(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    final SubLThread var50 = SubLProcess.currentSubLThread();
    SubLObject var51 = (SubLObject) NIL;
    SubLObject var333_337 = (SubLObject) NIL;
    cdestructuring_bind.destructuring_bind_must_consp( var49, var49, (SubLObject) $ic276$ );
    var51 = var49.first();
    SubLObject var52 = var49.rest();
    cdestructuring_bind.destructuring_bind_must_consp( var52, var49, (SubLObject) $ic276$ );
    var333_337 = var52.first();
    var52 = var52.rest();
    if( NIL == var52 )
    {
      module0035.f2502( var51, (SubLObject) $ic277$ );
      return f52244( (SubLObject) $ic278$, var13, var48 );
    }
    cdestructuring_bind.cdestructuring_bind_error( var49, (SubLObject) $ic276$ );
    return (SubLObject) NIL;
  }

  public static SubLObject f52248(SubLObject var89)
  {
    var89 = module0815.f52201( var89 );
    var89 = module0815.f52203( var89 );
    return var89;
  }

  public static SubLObject f52357(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341, final SubLObject var342, final SubLObject var343)
  {
    assert NIL != Types.stringp( var338 ) : var338;
    assert NIL != Types.stringp( var339 ) : var339;
    final SubLObject var344 = module0813.f52154( var338, var343 );
    final SubLObject var345 = module0813.f52155( var343 );
    f52358( var338, var339, var340, var341 );
    f52359( var338, var339, var340, var342 );
    f52360( var338, var339, var340, var343 );
    f52361( var339, var340, var344 );
    f52362( var339, var340, var345 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52363(final SubLObject var59)
  {
    assert NIL != Types.stringp( var59 ) : var59;
    return Strings.string_downcase( var59, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52364(final SubLObject var346, SubLObject var347)
  {
    if( var347 == UNPROVIDED )
    {
      var347 = (SubLObject) NIL;
    }
    if( NIL != var347 )
    {
      return PrintLow.format( (SubLObject) NIL, (SubLObject) $ic279$, var347 );
    }
    return f52363( var346 );
  }

  public static SubLObject f52365(final SubLObject var346)
  {
    assert NIL != Types.stringp( var346 ) : var346;
    final SubLObject var347 = module0813.f52032();
    final SubLObject var348 = (SubLObject) ( ( NIL != var347 ) ? module0813.f52095( var347, var346 ) : NIL );
    return f52364( var346, var348 );
  }

  public static SubLObject f52366(final SubLObject var59)
  {
    assert NIL != Types.stringp( var59 ) : var59;
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_hyphen, (SubLObject) Characters.CHAR_underbar, Strings.string_downcase( var59, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52367(final SubLObject var59)
  {
    assert NIL != Types.stringp( var59 ) : var59;
    return Sequences.nsubstitute( (SubLObject) Characters.CHAR_hyphen, (SubLObject) Characters.CHAR_underbar, Strings.string_upcase( var59, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED ),
        (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52358(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var341)
  {
    final SubLThread var342 = SubLProcess.currentSubLThread();
    final SubLObject var343 = f52363( var338 );
    final SubLObject var344 = f52366( var338 );
    SubLObject var345 = module0813.f52128( var339, var340, var343, (SubLObject) $ic280$ );
    if( NIL == module0813.f52030() )
    {
      var345 = (SubLObject) $ic5$;
    }
    final SubLObject var346 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var342 );
    final SubLObject var347 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var342 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var342 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var342 ), var342 );
      final SubLObject var348 = var345;
      SubLObject var349 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_352 = stream_macros.$stream_requires_locking$.currentBinding( var342 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var342 );
          var349 = compatibility.open_text( var348, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_352, var342 );
        }
        if( !var349.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var348 );
        }
        final SubLObject var13_353 = var349;
        f52232( var13_353, var345, (SubLObject) UNPROVIDED );
        PrintLow.format( var13_353, (SubLObject) $ic281$, var343 );
        PrintLow.format( var13_353, (SubLObject) $ic282$, var344 );
        SubLObject var350 = (SubLObject) NIL;
        SubLObject var351 = (SubLObject) NIL;
        SubLObject var352 = (SubLObject) NIL;
        var350 = var341;
        var351 = var350.first();
        for( var352 = (SubLObject) ZERO_INTEGER; NIL != var350; var350 = var350.rest(), var351 = var350.first(), var352 = Numbers.add( (SubLObject) ONE_INTEGER, var352 ) )
        {
          PrintLow.format( var13_353, (SubLObject) $ic283$ );
          f52274( var351, var13_353 );
          PrintLow.format( var13_353, (SubLObject) $ic284$ );
          if( TWO_INTEGER.numE( Numbers.mod( var352, (SubLObject) THREE_INTEGER ) ) )
          {
            streams_high.terpri( var13_353 );
          }
        }
        PrintLow.format( var13_353, (SubLObject) $ic285$ );
      }
      finally
      {
        final SubLObject var8_353 = Threads.$is_thread_performing_cleanupP$.currentBinding( var342 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var342 );
          if( var349.isStream() )
          {
            streams_high.close( var349, (SubLObject) UNPROVIDED );
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
    final SubLObject var360 = module0813.f52128( var339, var340, var358, (SubLObject) $ic286$ );
    final SubLObject var361 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var357 );
    final SubLObject var362 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var357 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var357 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var357 ), var357 );
      final SubLObject var363 = var360;
      SubLObject var364 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_359 = stream_macros.$stream_requires_locking$.currentBinding( var357 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var357 );
          var364 = compatibility.open_text( var363, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_359, var357 );
        }
        if( !var364.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var363 );
        }
        final SubLObject var13_360 = var364;
        f52232( var13_360, var360, (SubLObject) UNPROVIDED );
        streams_high.terpri( var13_360 );
        streams_high.terpri( var13_360 );
        streams_high.write_string( (SubLObject) $ic13$, var13_360, (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
        final SubLObject var365 = f52367( var338 );
        PrintLow.format( var13_360, (SubLObject) $ic287$ );
        PrintLow.format( var13_360, (SubLObject) $ic16$, var365 );
        PrintLow.format( var13_360, (SubLObject) $ic288$ );
        SubLObject var366 = var356;
        SubLObject var367 = (SubLObject) NIL;
        var367 = var366.first();
        while ( NIL != var366)
        {
          SubLObject var369;
          final SubLObject var368 = var369 = var367;
          SubLObject var370 = (SubLObject) NIL;
          SubLObject var371 = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var369, var368, (SubLObject) $ic289$ );
          var370 = var369.first();
          var369 = var369.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var369, var368, (SubLObject) $ic289$ );
          var371 = var369.first();
          var369 = var369.rest();
          if( NIL == var369 )
          {
            PrintLow.format( var13_360, (SubLObject) $ic290$, f52368( var370 ), f52365( var371 ) );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var368, (SubLObject) $ic289$ );
          }
          var366 = var366.rest();
          var367 = var366.first();
        }
        PrintLow.format( var13_360, (SubLObject) $ic291$, var359 );
      }
      finally
      {
        final SubLObject var8_360 = Threads.$is_thread_performing_cleanupP$.currentBinding( var357 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var357 );
          if( var364.isStream() )
          {
            streams_high.close( var364, (SubLObject) UNPROVIDED );
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
    return Strings.string_downcase( module0075.f5194( var365, (SubLObject) $ic292$, (SubLObject) UNPROVIDED ), (SubLObject) UNPROVIDED, (SubLObject) UNPROVIDED );
  }

  public static SubLObject f52360(final SubLObject var338, final SubLObject var339, final SubLObject var340, final SubLObject var343)
  {
    final SubLThread var344 = SubLProcess.currentSubLThread();
    SubLObject var345 = module0813.f52128( var339, var340, (SubLObject) $ic293$, (SubLObject) $ic294$ );
    if( NIL == module0813.f52030() )
    {
      var345 = (SubLObject) $ic5$;
    }
    final SubLObject var346 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var344 );
    final SubLObject var347 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var344 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var344 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var344 ), var344 );
      final SubLObject var348 = var345;
      SubLObject var349 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_369 = stream_macros.$stream_requires_locking$.currentBinding( var344 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var344 );
          var349 = compatibility.open_text( var348, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_369, var344 );
        }
        if( !var349.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var348 );
        }
        final SubLObject var13_370 = var349;
        f52238( var13_370 );
        streams_high.terpri( var13_370 );
        SubLObject var350 = var343;
        SubLObject var351 = (SubLObject) NIL;
        var351 = var350.first();
        while ( NIL != var350)
        {
          SubLObject var353;
          final SubLObject var352 = var353 = var351;
          SubLObject var354 = (SubLObject) NIL;
          SubLObject var355 = (SubLObject) NIL;
          cdestructuring_bind.destructuring_bind_must_consp( var353, var352, (SubLObject) $ic295$ );
          var354 = var353.first();
          var353 = var353.rest();
          cdestructuring_bind.destructuring_bind_must_consp( var353, var352, (SubLObject) $ic295$ );
          var355 = var353.first();
          var353 = var353.rest();
          if( NIL == var353 )
          {
            final SubLObject var356 = ( NIL != var354 ) ? module0035.f2114( var354 ) : var338;
            f52369( var13_370, var338, var356, var354, var355 );
          }
          else
          {
            cdestructuring_bind.cdestructuring_bind_error( var352, (SubLObject) $ic295$ );
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
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var344 );
          if( var349.isStream() )
          {
            streams_high.close( var349, (SubLObject) UNPROVIDED );
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
    PrintLow.format( var13, (SubLObject) $ic296$, var376 );
    if( NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) $ic297$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    SubLObject var379 = var374;
    SubLObject var380 = (SubLObject) NIL;
    var380 = var379.first();
    while ( NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) $ic298$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) $ic299$, var376 );
    if( NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) $ic300$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    var379 = var374;
    var380 = (SubLObject) NIL;
    var380 = var379.first();
    while ( NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) $ic301$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) $ic302$, var376 );
    if( NIL == var365 )
    {
      PrintLow.format( var13, (SubLObject) $ic303$, (SubLObject) Characters.CHAR_tab, var378 );
    }
    var379 = var374;
    var380 = (SubLObject) NIL;
    var380 = var379.first();
    while ( NIL != var379)
    {
      PrintLow.format( var13, (SubLObject) $ic304$, new SubLObject[] { Characters.CHAR_tab, f52368( var365 ), f52365( var380 )
      } );
      var379 = var379.rest();
      var380 = var379.first();
    }
    PrintLow.format( var13, (SubLObject) $ic305$, var377, var376 );
    return var375;
  }

  public static SubLObject f52361(final SubLObject var339, final SubLObject var340, final SubLObject var344)
  {
    final SubLThread var345 = SubLProcess.currentSubLThread();
    SubLObject var346 = module0813.f52128( var339, var340, (SubLObject) $ic306$, (SubLObject) $ic294$ );
    if( NIL == module0813.f52030() )
    {
      var346 = (SubLObject) $ic5$;
    }
    final SubLObject var347 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var345 );
    final SubLObject var348 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var345 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var345 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var345 ), var345 );
      final SubLObject var349 = var346;
      SubLObject var350 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_381 = stream_macros.$stream_requires_locking$.currentBinding( var345 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var345 );
          var350 = compatibility.open_text( var349, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_381, var345 );
        }
        if( !var350.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var349 );
        }
        final SubLObject var13_382 = var350;
        f52238( var13_382 );
        streams_high.terpri( var13_382 );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) $ic307$ ), (SubLObject) $ic308$, (SubLObject) $ic309$, (SubLObject) $ic310$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) $ic307$ ), (SubLObject) $ic311$, (SubLObject) $ic309$, (SubLObject) $ic312$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) $ic307$ ), (SubLObject) $ic313$, (SubLObject) $ic309$, (SubLObject) $ic314$ );
        f52370( var13_382, var344, Symbols.symbol_function( (SubLObject) $ic315$ ), (SubLObject) $ic316$, (SubLObject) $ic317$, (SubLObject) $ic318$ );
      }
      finally
      {
        final SubLObject var8_382 = Threads.$is_thread_performing_cleanupP$.currentBinding( var345 );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var345 );
          if( var350.isStream() )
          {
            streams_high.close( var350, (SubLObject) UNPROVIDED );
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
    PrintLow.format( var13, (SubLObject) $ic319$, var385 );
    SubLObject var388 = var344;
    SubLObject var389 = (SubLObject) NIL;
    var389 = var388.first();
    while ( NIL != var388)
    {
      PrintLow.format( var13, (SubLObject) $ic320$, new SubLObject[] { var386, Functions.funcall( var384, var389 ), var387
      } );
      var388 = var388.rest();
      var389 = var388.first();
    }
    streams_high.terpri( var13 );
    return (SubLObject) NIL;
  }

  public static SubLObject f52362(final SubLObject var339, final SubLObject var340, final SubLObject var345)
  {
    final SubLThread var346 = SubLProcess.currentSubLThread();
    SubLObject var347 = module0813.f52128( var339, var340, (SubLObject) $ic321$, (SubLObject) $ic294$ );
    if( NIL == module0813.f52030() )
    {
      var347 = (SubLObject) $ic5$;
    }
    final SubLObject var348 = StreamsLow.$stream_initial_input_buffer_size$.currentBinding( var346 );
    final SubLObject var349 = StreamsLow.$stream_initial_output_buffer_size$.currentBinding( var346 );
    try
    {
      StreamsLow.$stream_initial_input_buffer_size$.bind( (SubLObject) $ic2$, var346 );
      StreamsLow.$stream_initial_output_buffer_size$.bind( StreamsLow.$stream_initial_input_buffer_size$.getDynamicValue( var346 ), var346 );
      final SubLObject var350 = var347;
      SubLObject var351 = (SubLObject) NIL;
      try
      {
        final SubLObject var8_390 = stream_macros.$stream_requires_locking$.currentBinding( var346 );
        try
        {
          stream_macros.$stream_requires_locking$.bind( (SubLObject) NIL, var346 );
          var351 = compatibility.open_text( var350, (SubLObject) $ic3$ );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( var8_390, var346 );
        }
        if( !var351.isStream() )
        {
          Errors.error( (SubLObject) $ic4$, var350 );
        }
        final SubLObject var13_391 = var351;
        f52238( var13_391 );
        PrintLow.format( var13_391, (SubLObject) $ic322$ );
        PrintLow.format( var13_391, (SubLObject) $ic323$ );
        SubLObject var352 = (SubLObject) NIL;
        SubLObject var353 = (SubLObject) NIL;
        SubLObject var354 = (SubLObject) NIL;
        var352 = var345;
        var353 = var352.first();
        for( var354 = (SubLObject) ZERO_INTEGER; NIL != var352; var352 = var352.rest(), var353 = var352.first(), var354 = Numbers.add( (SubLObject) ONE_INTEGER, var354 ) )
        {
          if( !var354.isZero() )
          {
            PrintLow.format( var13_391, (SubLObject) $ic324$, (SubLObject) Characters.CHAR_backslash );
          }
          final SubLObject var355 = f52371( var353 );
          PrintLow.format( var13_391, (SubLObject) $ic325$, var355 );
        }
        SubLObject var356 = var345;
        var353 = (SubLObject) NIL;
        var353 = var356.first();
        while ( NIL != var356)
        {
          final SubLObject var357 = f52371( var353 );
          PrintLow.format( var13_391, (SubLObject) $ic326$, var357, (SubLObject) Characters.CHAR_tab );
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
          Threads.$is_thread_performing_cleanupP$.bind( (SubLObject) T, var346 );
          if( var351.isStream() )
          {
            streams_high.close( var351, (SubLObject) UNPROVIDED );
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
    SubLObject var393 = (SubLObject) NIL;
    SubLObject var394 = var392;
    SubLObject var395 = (SubLObject) NIL;
    var395 = var394.first();
    while ( NIL != var394)
    {
      final SubLObject var396 = f52363( var395 );
      var393 = (SubLObject) ConsesLow.cons( var396, var393 );
      var393 = (SubLObject) ConsesLow.cons( (SubLObject) $ic327$, var393 );
      var394 = var394.rest();
      var395 = var394.first();
    }
    return Functions.apply( Symbols.symbol_function( (SubLObject) $ic328$ ), Sequences.nreverse( var393 ) );
  }

  public static SubLObject f52372(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) $ic329$, var13, var48 );
  }

  public static SubLObject f52373(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) $ic329$, var13, var48 );
  }

  public static SubLObject f52374(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) $ic329$, var13, var48 );
  }

  public static SubLObject f52375(final SubLObject var49, final SubLObject var13, final SubLObject var48)
  {
    return f52244( (SubLObject) $ic329$, var13, var48 );
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
    return (SubLObject) NIL;
  }

  public static SubLObject f52377()
  {
    $g6470$ = SubLFiles.defparameter( "S#57444", (SubLObject) NIL );
    $g6471$ = SubLFiles.defparameter( "S#57445", (SubLObject) NIL );
    $g6472$ = SubLFiles.deflexical( "S#57446", (SubLObject) $ic63$ );
    $g6473$ = SubLFiles.deflexical( "S#57447", (SubLObject) $ic85$ );
    $g6474$ = SubLFiles.defparameter( "S#57448", (SubLObject) NIL );
    return (SubLObject) NIL;
  }

  public static SubLObject f52378()
  {
    module0034.f1895( (SubLObject) $ic56$ );
    module0034.f1895( (SubLObject) $ic58$ );
    module0034.f1895( (SubLObject) $ic61$ );
    module0034.f1895( (SubLObject) $ic73$ );
    module0012.f419( (SubLObject) $ic158$ );
    module0012.f419( (SubLObject) $ic159$ );
    return (SubLObject) NIL;
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
    $g6470$ = null;
    $g6471$ = null;
    $g6472$ = null;
    $g6473$ = null;
    $g6474$ = null;
    $ic0$ = makeSymbol( "S#56738", "CYC" );
    $ic1$ = makeSymbol( "STRINGP" );
    $ic2$ = makeInteger( 1048576 );
    $ic3$ = makeKeyword( "OUTPUT" );
    $ic4$ = makeString( "Unable to open ~S" );
    $ic5$ = makeString( "/dev/null" );
    $ic6$ = makeString( ".c" );
    $ic7$ = makeString( ".h" );
    $ic8$ = makeString( ".C" );
    $ic9$ = makeString( ".H" );
    $ic10$ = makeString( "unexpected C filename ~S" );
    $ic11$ = makeSymbol( "DOUBLE-FLOAT" );
    $ic12$ = makeString( "Invalid attempt to reuse memoization state in multiple threads simultaneously." );
    $ic13$ = makeString( "#include \"rtl.h\"" );
    $ic14$ = makeString( "CYCL" );
    $ic15$ = makeString( "~%~%#ifdef ~A_PROFILING" );
    $ic16$ = makeString( "~%#define ~A_PROFILING" );
    $ic17$ = makeString( "~%#endif" );
    $ic18$ = makeString( "~%#define PROFILING" );
    $ic19$ = makeString( "~%~%#include \"code-flow-hooks.h\"" );
    $ic20$ = makeString( "" );
    $ic29$ = makeString( "#  ~A~%" );
    $ic30$ = makeString( "#   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
    $ic31$ = makeString( "Copyright (c) 1995 - 2012 Cycorp, Inc.  All rights reserved." );
    $ic32$ = makeString( "~%~%" );
    $ic33$ = makeString( "~%~%" );
    $ic34$ = makeString( "extern " );
    $ic35$ = makeString( " " );
    $ic36$ = makeString( ";" );
    $ic37$ = makeString( "static " );
    $ic38$ = makeKeyword( "UNPROVIDED" );
    $ic39$ = makeString( "static Dp _constants[~A];" );
    $ic40$ = makeString( "  " );
    $ic41$ = makeString( "~%~%" );
    $ic42$ = makeString( "~%~%" );
    $ic43$ = makeString( "  " );
    $ic44$ = makeString( "Unexpected C backend atom : ~S" );
    $ic45$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CONSTANT", "CYC" ) );
    $ic46$ = makeSymbol( "S#56848", "CYC" );
    $ic47$ = makeString( "Time to implement a C backend translation for predefined constant ~S" );
    $ic48$ = makeKeyword( "DYNAMIC" );
    $ic49$ = makeKeyword( "LEXICAL" );
    $ic50$ = makeKeyword( "CONSTANT" );
    $ic51$ = makeKeyword( "LOCAL" );
    $ic52$ = makeString( "unexpected variable binding type ~S for ~S" );
    $ic53$ = ConsesLow.list( (SubLObject) makeKeyword( "LOW" ), (SubLObject) makeKeyword( "HIGH" ) );
    $ic54$ = makeString( "_gv~S_" );
    $ic55$ = makeString( "_v~S_" );
    $ic56$ = makeSymbol( "S#57328", "CYC" );
    $ic57$ = makeKeyword( "&MEMOIZED-ITEM-NOT-FOUND&" );
    $ic58$ = makeSymbol( "S#57330", "CYC" );
    $ic59$ = makeString( "v_" );
    $ic60$ = makeString( "_" );
    $ic61$ = makeSymbol( "S#57333", "CYC" );
    $ic62$ = makeString( "gv_" );
    $ic63$ = ConsesLow.list( (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_question, (SubLObject) Characters.CHAR_P ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_hyphen,
        (SubLObject) Characters.CHAR_underbar ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_space, (SubLObject) Characters.CHAR_underbar ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_less,
            (SubLObject) Characters.CHAR_L ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_equal, (SubLObject) Characters.CHAR_E ), (SubLObject) ConsesLow.cons( (SubLObject) Characters.CHAR_greater,
                (SubLObject) Characters.CHAR_G ) );
    $ic64$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#105", "CYC" ) );
    $ic65$ = makeKeyword( "UNKNOWN" );
    $ic66$ = makeString( "translating ~S call as funcall" );
    $ic67$ = makeSymbol( "FUNCALL" );
    $ic68$ = makeSymbol( "S#56855", "CYC" );
    $ic69$ = makeString( "~S called with ~S missing required arguments" );
    $ic70$ = makeString( "~S called with ~S excess arguments" );
    $ic71$ = makeString( "(" );
    $ic72$ = makeString( ")" );
    $ic73$ = makeSymbol( "S#57340", "CYC" );
    $ic74$ = makeString( "f_" );
    $ic75$ = makeKeyword( "UNSPECIFIED" );
    $ic76$ = makeString( "_CSETF-" );
    $ic77$ = ConsesLow.list( (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic78$ = makeKeyword( "IGNORE-ERRORS-TARGET" );
    $ic79$ = makeSymbol( "IGNORE-ERRORS-HANDLER", "SUBLISP" );
    $ic80$ = makeString( "unable to introspect on ~S" );
    $ic81$ = makeString( "Unexpected function ~S" );
    $ic82$ = makeString( ", " );
    $ic83$ = makeString( "DUM" );
    $ic84$ = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $ic85$ = ConsesLow.list( new SubLObject[] { ConsesLow.cons( (SubLObject) makeSymbol( "S#56692", "CYC" ), (SubLObject) makeSymbol( "S#57402", "CYC" ) ), ConsesLow.cons(
        (SubLObject) makeSymbol( "S#57153", "CYC" ), (SubLObject) makeSymbol( "S#57348", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56665", "CYC" ),
            (SubLObject) makeSymbol( "S#57352", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56668", "CYC" ), (SubLObject) makeSymbol( "S#57353", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#56664", "CYC" ), (SubLObject) makeSymbol( "S#57403", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56658",
          "CYC" ), (SubLObject) makeSymbol( "S#57354", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56659", "CYC" ), (SubLObject) makeSymbol( "S#57355",
              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#51", "CYC" ), (SubLObject) makeSymbol( "S#57356", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "S#56667", "CYC" ), (SubLObject) makeSymbol( "S#57357", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "CSETQ" ), (SubLObject) SubLObjectFactory
                      .makeSymbol( "S#57358", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56660", "CYC" ), (SubLObject) makeSymbol( "S#57359", "CYC" ) ), ConsesLow.cons(
                          (SubLObject) makeSymbol( "S#56661", "CYC" ), (SubLObject) makeSymbol( "S#57360", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                              "S#56662", "CYC" ), (SubLObject) makeSymbol( "S#57361", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56666", "CYC" ),
                                  (SubLObject) makeSymbol( "S#57363", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "CVS-ID" ), (SubLObject) makeSymbol(
                                      "S#57364", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFCONSTANT" ), (SubLObject) makeSymbol( "S#57365", "CYC" ) ), ConsesLow.cons(
                                          (SubLObject) makeSymbol( "DEFINE" ), (SubLObject) makeSymbol( "S#57368", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                              "S#56710", "CYC" ), (SubLObject) makeSymbol( "S#57387", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFLEXICAL" ),
                                                  (SubLObject) makeSymbol( "S#57388", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "DEFPARAMETER" ),
                                                      (SubLObject) makeSymbol( "S#57389", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56711", "CYC" ),
                                                          (SubLObject) makeSymbol( "S#57390", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" ),
                                                              (SubLObject) makeSymbol( "S#57391", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "_DEFSTRUCT-GET-SLOT",
                                                                  "SUBLISP" ), (SubLObject) makeSymbol( "S#57392", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                      "_DEFSTRUCT-OBJECT-P", "SUBLISP" ), (SubLObject) makeSymbol( "S#57393", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                          .makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" ), (SubLObject) makeSymbol( "S#57394", "CYC" ) ), ConsesLow.cons(
                                                                              (SubLObject) makeSymbol( "DEFVAR" ), (SubLObject) makeSymbol( "S#57395", "CYC" ) ), ConsesLow.cons(
                                                                                  (SubLObject) makeSymbol( "S#56696", "CYC" ), (SubLObject) makeSymbol( "S#57350", "CYC" ) ), ConsesLow
                                                                                      .cons( (SubLObject) makeSymbol( "S#56713", "CYC" ), (SubLObject) makeSymbol( "S#57351", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#57449", "CYC" ), (SubLObject) makeSymbol( "S#57404", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "FIF" ),
          (SubLObject) makeSymbol( "S#57396", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56663", "CYC" ), (SubLObject) makeSymbol( "S#57405", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "S#56849", "CYC" ), (SubLObject) makeSymbol( "S#57406", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56851",
          "CYC" ), (SubLObject) makeSymbol( "S#57408", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56855", "CYC" ), (SubLObject) makeSymbol( "S#57409",
              "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57450", "CYC" ), (SubLObject) makeSymbol( "S#57412", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                  .makeSymbol( "MULTIPLE-VALUE-LIST" ), (SubLObject) makeSymbol( "S#57413", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57029", "CYC" ),
                      (SubLObject) makeSymbol( "S#57414", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56701", "CYC" ), (SubLObject) makeSymbol( "S#57415",
                          "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "NTH-VALUE" ), (SubLObject) makeSymbol( "S#57416", "CYC" ) ), ConsesLow.cons(
                              (SubLObject) makeSymbol( "S#56702", "CYC" ), (SubLObject) makeSymbol( "S#57417", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                  "S#56848", "CYC" ), (SubLObject) makeSymbol( "S#57321", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "PCOND" ), (SubLObject) SubLObjectFactory
                                      .makeSymbol( "S#57397", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "PROGN" ), (SubLObject) makeSymbol( "S#57398", "CYC" ) ), ConsesLow
                                          .cons( (SubLObject) makeSymbol( "S#56722", "CYC" ), (SubLObject) makeSymbol( "S#57399", "CYC" ) ), ConsesLow.cons(
                                              (SubLObject) makeSymbol( "S#56853", "CYC" ), (SubLObject) makeSymbol( "S#57418", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                  .makeSymbol( "S#56854", "CYC" ), (SubLObject) makeSymbol( "S#57419", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56852",
                                                      "CYC" ), (SubLObject) makeSymbol( "S#57420", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "RET" ),
                                                          (SubLObject) makeSymbol( "S#57400", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "WHILE" ),
                                                              (SubLObject) makeSymbol( "S#57401", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56671", "CYC" ),
                                                                  (SubLObject) makeSymbol( "S#57421", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56669", "CYC" ),
                                                                      (SubLObject) makeSymbol( "S#57422", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#56670", "CYC" ),
                                                                          (SubLObject) makeSymbol( "S#57423", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57451", "CYC" ),
                                                                              (SubLObject) makeSymbol( "S#57424", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol( "S#57452",
                                                                                  "CYC" ), (SubLObject) makeSymbol( "S#57425", "CYC" ) ), ConsesLow.cons( (SubLObject) makeSymbol(
                                                                                      "JAVA-NEW" ), (SubLObject) makeSymbol( "S#57440", "CYC" ) ), ConsesLow.cons( (SubLObject) SubLObjectFactory
                                                                                          .makeSymbol( "JAVA-METHOD" ), (SubLObject) makeSymbol( "S#57441", "CYC" ) ), ConsesLow.cons(
                                                                                              (SubLObject) makeSymbol( "JAVA-STATIC" ), (SubLObject) makeSymbol( "S#57442", "CYC" ) ),
      ConsesLow.cons( (SubLObject) makeSymbol( "JAVA-CALL" ), (SubLObject) makeSymbol( "S#57443", "CYC" ) )
    } );
    $ic86$ = makeString( "Time to implement the writer for ~S" );
    $ic87$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ), (SubLObject) makeSymbol( "S#155", "CYC" ) );
    $ic88$ = makeSymbol( "S#57153", "CYC" );
    $ic89$ = makeSymbol( "S#56696", "CYC" );
    $ic90$ = makeSymbol( "S#56713", "CYC" );
    $ic91$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#150", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#768", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic92$ = makeSymbol( "S#56665", "CYC" );
    $ic93$ = makeSymbol( "PROGN" );
    $ic94$ = makeSymbol( "S#57240", "CYC" );
    $ic95$ = makeSymbol( "PCOND" );
    $ic96$ = makeSymbol( "S#56683", "CYC" );
    $ic97$ = makeSymbol( "S#57076", "CYC" );
    $ic98$ = makeSymbol( "CSETQ" );
    $ic99$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#57159", "CYC" ) ) );
    $ic100$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57031", "CYC" ) );
    $ic101$ = makeSymbol( "S#57192", "CYC" );
    $ic102$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56695", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56732", "CYC" ), (SubLObject) makeSymbol( "S#56729", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic103$ = makeSymbol( "S#56668", "CYC" );
    $ic104$ = makeSymbol( "S#57175", "CYC" );
    $ic105$ = makeSymbol( "S#57173", "CYC" );
    $ic106$ = makeSymbol( "S#57171", "CYC" );
    $ic107$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#713", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic108$ = makeSymbol( "S#56658", "CYC" );
    $ic109$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#33", "CYC" ) );
    $ic110$ = makeSymbol( "S#57157", "CYC" );
    $ic111$ = makeSymbol( "S#57238", "CYC" );
    $ic112$ = makeSymbol( "S#56659", "CYC" );
    $ic113$ = makeSymbol( "S#57450", "CYC" );
    $ic114$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#64", "CYC" ) );
    $ic115$ = makeSymbol( "S#51", "CYC" );
    $ic116$ = makeString( "// " );
    $ic117$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56703", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#713", "CYC" ), (SubLObject) makeSymbol( "S#56731", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic118$ = makeSymbol( "S#56667", "CYC" );
    $ic119$ = makeSymbol( "S#57158", "CYC" );
    $ic120$ = makeSymbol( "S#57239", "CYC" );
    $ic121$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#132", "CYC" ) );
    $ic122$ = makeSymbol( "S#56662", "CYC" );
    $ic123$ = makeSymbol( "S#56660", "CYC" );
    $ic124$ = makeSymbol( "S#56661", "CYC" );
    $ic125$ = makeString( "The constant variable ~S cannot be set" );
    $ic126$ = makeString( "Unexpected variable ~S" );
    $ic127$ = makeSymbol( "S#57241", "CYC" );
    $ic128$ = makeSymbol( "S#57242", "CYC" );
    $ic129$ = makeString( " = " );
    $ic130$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ), (SubLObject) makeSymbol( "S#152", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic131$ = makeSymbol( "S#56666", "CYC" );
    $ic132$ = makeSymbol( "S#57243", "CYC" );
    $ic133$ = makeSymbol( "S#57245", "CYC" );
    $ic134$ = makeSymbol( "S#57193", "CYC" );
    $ic135$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#38900", "CYC" ) );
    $ic136$ = makeSymbol( "CVS-ID" );
    $ic137$ = makeString( "CVS_ID(" );
    $ic138$ = makeSymbol( "DEFCONSTANT" );
    $ic139$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "DOCUMENTATION" ) );
    $ic140$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#29", "CYC" ), (SubLObject) makeSymbol( "S#30", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic141$ = makeSymbol( "DEFINE" );
    $ic142$ = makeString( "~S was not a top-level define" );
    $ic143$ = makeSymbol( "S#57453", "CYC" );
    $ic144$ = makeString( "Skip function ~S" );
    $ic145$ = ConsesLow.list( (SubLObject) makeSymbol( "DOCUMENTATION" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#56708", "CYC" ) );
    $ic146$ = makeString( "Method ~S returns within a binding construct" );
    $ic147$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57449", "CYC" ) );
    $ic148$ = makeString( "" );
    $ic173$ = makeSymbol( "_DEFSTRUCT-CONSTRUCT", "SUBLISP" );
    $ic174$ = makeSymbol( "_DEFSTRUCT-GET-SLOT", "SUBLISP" );
    $ic175$ = makeSymbol( "_DEFSTRUCT-OBJECT-P", "SUBLISP" );
    $ic176$ = makeSymbol( "_DEFSTRUCT-SET-SLOT", "SUBLISP" );
    $ic177$ = makeSymbol( "DEFVAR" );
    $ic178$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "CONDITION" ), (SubLObject) makeSymbol( "S#56714", "CYC" ),
        (SubLObject) makeSymbol( "S#56715", "CYC" ) );
    $ic179$ = makeSymbol( "FIF" );
    $ic180$ = makeString( " ? " );
    $ic181$ = makeString( " : " );
    $ic182$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57456", "CYC" ) );
    $ic183$ = ConsesLow.list( (SubLObject) makeSymbol( "PROGN" ) );
    $ic184$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57457", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57458", "CYC" ) );
    $ic185$ = ConsesLow.list( (SubLObject) makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#57459", "CYC" ) );
    $ic186$ = makeString( "if (" );
    $ic187$ = makeString( ") " );
    $ic188$ = makeString( " else " );
    $ic189$ = makeString( " else if (" );
    $ic190$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic191$ = makeString( "{" );
    $ic192$ = makeString( "}" );
    $ic193$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#3267", "CYC" ) );
    $ic194$ = makeString( "RETURN(" );
    $ic195$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic196$ = makeSymbol( "WHILE" );
    $ic197$ = makeString( "while (" );
    $ic198$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#56690", "CYC" ) );
    $ic199$ = makeSymbol( "S#56692", "CYC" );
    $ic200$ = makeString( " && " );
    $ic201$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#131", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#704", "CYC" ), (SubLObject) makeSymbol( "S#28822", "CYC" ), (SubLObject) makeSymbol( "S#56729", "CYC" ), (SubLObject) makeSymbol( "S#50102",
            "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic202$ = makeSymbol( "S#56664", "CYC" );
    $ic203$ = makeSymbol( "S#56663", "CYC" );
    $ic204$ = makeSymbol( "%NEXT-HASH-INDEX", "SUBLISP" );
    $ic205$ = makeSymbol( "%HASH-INDEX-KEY", "SUBLISP" );
    $ic206$ = makeSymbol( "%HASH-INDEX-OBJ", "SUBLISP" );
    $ic207$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ) );
    $ic208$ = makeSymbol( "S#57449", "CYC" );
    $ic209$ = makeString( "ENTER()" );
    $ic210$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56727", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#122", "CYC" ), (SubLObject) makeSymbol( "S#56728", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic211$ = makeString( "for (" );
    $ic212$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#57460", "CYC" ), (SubLObject) makeSymbol( "S#57461", "CYC" ) );
    $ic213$ = makeString( "; " );
    $ic214$ = (SubLList) ConsesLow.cons( (SubLObject) makeSymbol( "S#57462", "CYC" ), (SubLObject) makeSymbol( "S#57463", "CYC" ) );
    $ic215$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57464", "CYC" ), (SubLObject) makeSymbol( "S#56850", "CYC" ) );
    $ic216$ = makeSymbol( "S#56849", "CYC" );
    $ic217$ = makeString( "_constants[" );
    $ic218$ = makeString( "]" );
    $ic219$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#57464", "CYC" ), (SubLObject) makeSymbol( "S#56850", "CYC" ),
        (SubLObject) makeSymbol( "S#57465", "CYC" ) );
    $ic220$ = makeSymbol( "S#56851", "CYC" );
    $ic221$ = makeString( "INITIALIZE_CONSTANT(" );
    $ic222$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "OBJECT", "CYC" ) );
    $ic223$ = makeSymbol( "S#57169", "CYC" );
    $ic224$ = makeSymbol( "S#57162", "CYC" );
    $ic225$ = makeSymbol( "S#57160", "CYC" );
    $ic226$ = makeSymbol( "S#57163", "CYC" );
    $ic227$ = makeSymbol( "S#57161", "CYC" );
    $ic228$ = makeSymbol( "S#57168", "CYC" );
    $ic229$ = makeSymbol( "S#57164", "CYC" );
    $ic230$ = makeString( "Time to add %LF support for ~S" );
    $ic231$ = makeSymbol( "S#57167", "CYC" );
    $ic232$ = makeSymbol( "S#57166", "CYC" );
    $ic233$ = makeSymbol( "S#57165", "CYC" );
    $ic234$ = makeSymbol( "S#57170", "CYC" );
    $ic235$ = makeInteger( 134217727 );
    $ic236$ = makeInteger( -134217728 );
    $ic237$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ),
        (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#33", "CYC" ), (SubLObject) NIL, (SubLObject) makeSymbol( "S#57466", "CYC" ) ) );
    $ic238$ = makeString( "volatile " );
    $ic239$ = makeSymbol( "MULTIPLE-VALUE-LIST" );
    $ic240$ = makeSymbol( "S#57233", "CYC" );
    $ic241$ = makeSymbol( "S#57029", "CYC" );
    $ic242$ = makeSymbol( "S#57031", "CYC" );
    $ic243$ = makeString( "TRUE" );
    $ic244$ = makeSymbol( "S#57030", "CYC" );
    $ic245$ = makeString( "FALSE" );
    $ic246$ = makeString( "Unexpected native constant ~S" );
    $ic247$ = makeSymbol( "S#56701", "CYC" );
    $ic248$ = makeString( "(!(" );
    $ic249$ = makeString( "))" );
    $ic250$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#770", "CYC" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic251$ = makeSymbol( "NTH-VALUE" );
    $ic252$ = makeSymbol( "S#57236", "CYC" );
    $ic253$ = makeSymbol( "S#56702", "CYC" );
    $ic254$ = ConsesLow.list( (SubLObject) makeSymbol( "S#57029", "CYC" ), (SubLObject) makeSymbol( "S#57030", "CYC" ) );
    $ic255$ = makeString( "|| " );
    $ic256$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "FUNCTION" ), (SubLObject) makeSymbol( "S#57467", "CYC" ),
        (SubLObject) makeSymbol( "S#57468", "CYC" ), (SubLObject) makeSymbol( "S#57469", "CYC" ) );
    $ic257$ = makeSymbol( "S#56853", "CYC" );
    $ic258$ = makeString( "DEFINE(" );
    $ic259$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#752", "CYC" ), (SubLObject) makeSymbol( "S#673", "CYC" ),
        (SubLObject) makeSymbol( "S#33", "CYC" ) );
    $ic260$ = makeSymbol( "S#56854", "CYC" );
    $ic261$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "FUNCTION" ) );
    $ic262$ = makeSymbol( "S#56852", "CYC" );
    $ic263$ = makeString( "DEFMACRO(" );
    $ic264$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56736", "CYC" ), (SubLObject) makeSymbol( "&BODY" ),
        (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic265$ = makeSymbol( "S#56671", "CYC" );
    $ic266$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#1755", "CYC" ), (SubLObject) SubLObjectFactory
        .makeSymbol( "S#56733", "CYC" ), (SubLObject) makeSymbol( "S#56734", "CYC" ) ), (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic267$ = makeSymbol( "S#56669", "CYC" );
    $ic268$ = makeSymbol( "*ERROR-HANDLER*" );
    $ic269$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#56730", "CYC" ), (SubLObject) makeSymbol( "S#761", "CYC" ),
        (SubLObject) makeSymbol( "&BODY" ), (SubLObject) makeSymbol( "S#5", "CYC" ) );
    $ic270$ = makeSymbol( "S#56670", "CYC" );
    $ic271$ = makeSymbol( "S#57155", "CYC" );
    $ic272$ = makeSymbol( "S#57191", "CYC" );
    $ic273$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#5845", "CYC" ), (SubLObject) makeSymbol( "S#770", "CYC" ) );
    $ic274$ = makeSymbol( "S#57451", "CYC" );
    $ic275$ = makeSymbol( "S#56688", "CYC" );
    $ic276$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#5845", "CYC" ) );
    $ic277$ = makeSymbol( "S#57452", "CYC" );
    $ic278$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56689", "CYC" ) );
    $ic279$ = makeString( "module~4,'0D" );
    $ic280$ = makeString( "c" );
    $ic281$ = makeString( "~%~%#include \"~A.h\"~%~%" );
    $ic282$ = makeString( "void init_~A(void) {" );
    $ic283$ = makeString( "~%  " );
    $ic284$ = makeString( "();" );
    $ic285$ = makeString( "~%}~%" );
    $ic286$ = makeString( "h" );
    $ic287$ = makeString( "~%~%#ifdef CYC_PROFILING" );
    $ic288$ = makeString( "~%#endif~%" );
    $ic289$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56999", "CYC" ), (SubLObject) makeSymbol( "S#205", "CYC" ) );
    $ic290$ = makeString( "~%#include \"~A~A.h\"" );
    $ic291$ = makeString( "~%~%extern void init_~A(void);~%" );
    $ic292$ = makeString( "" );
    $ic293$ = makeString( "filelist" );
    $ic294$ = makeString( "text" );
    $ic295$ = ConsesLow.list( (SubLObject) makeSymbol( "S#56999", "CYC" ), (SubLObject) makeSymbol( "S#298", "CYC" ) );
    $ic296$ = makeString( "~A_HEADERS = " );
    $ic297$ = makeString( "\\~%~c~A.h " );
    $ic298$ = makeString( "\\~%~c~A~A.h " );
    $ic299$ = makeString( "~%~%~A_SOURCES = " );
    $ic300$ = makeString( "\\~%~c~A.c " );
    $ic301$ = makeString( "\\~%~c~A~A.c " );
    $ic302$ = makeString( "~%~%~A_OBJECTS = " );
    $ic303$ = makeString( "\\~%~c~A.o " );
    $ic304$ = makeString( "\\~%~c~A~A.o " );
    $ic305$ = makeString( "~%~%lib~A.a: $(~A_OBJECTS)~%~%" );
    $ic306$ = makeString( "build-index" );
    $ic307$ = makeSymbol( "S#57430", "CYC" );
    $ic308$ = makeString( "BUILD_OBJECTS = " );
    $ic309$ = makeString( "$(" );
    $ic310$ = makeString( "_OBJECTS)" );
    $ic311$ = makeString( "BUILD_SOURCES = " );
    $ic312$ = makeString( "_SOURCES)" );
    $ic313$ = makeString( "BUILD_HEADERS = " );
    $ic314$ = makeString( "_HEADERS)" );
    $ic315$ = makeSymbol( "S#57427", "CYC" );
    $ic316$ = makeString( "BUILD_LIBRARIES = " );
    $ic317$ = makeString( "lib" );
    $ic318$ = makeString( ".a" );
    $ic319$ = makeString( "~%~A" );
    $ic320$ = makeString( "~A~A~A " );
    $ic321$ = makeString( "build-instructions" );
    $ic322$ = makeString( "~%curr-dir := $(shell pwd)~%PWD = ${curr-dir}~%MKDIR=mkdir -p" );
    $ic323$ = makeString( "~%~%~%DIRS = " );
    $ic324$ = makeString( " ~C~%    " );
    $ic325$ = makeString( "$(PWD)/~A" );
    $ic326$ = makeString( "~%~%$(PWD)/~A:~%~C$(MKDIR) $@" );
    $ic327$ = makeString( "/" );
    $ic328$ = makeSymbol( "CCONCATENATE" );
    $ic329$ = ConsesLow.list( (SubLObject) makeSymbol( "ERROR" ), (SubLObject) makeString( "JavaLink (java-to-subl) is not supported in the CRTL" ) );
    $ic21$ = makeString( "   ~A~%" );
    $ic22$ = makeString( "SUBLISP" );
    $ic23$ = ConsesLow.list( (SubLObject) makeKeyword( "NONE" ), (SubLObject) makeKeyword( "MEDIUM" ) );
    $ic24$ = makeString( "   file:        ~a ~%" );
    $ic25$ = makeKeyword( "HIGH" );
    $ic26$ = makeString( "   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%" );
    $ic27$ = makeString( "   source file: ~a ~%" );
    $ic28$ = makeString( "         referenced globals       referenced functions        container for all constant values in file        private globals private functions        " );
    $ic149$ = makeString( "_f~S_" );
    $ic150$ = makeSymbol( "&OPTIONAL" );
    $ic151$ = makeSymbol( "&REST" );
    $ic152$ = ConsesLow.list( (SubLObject) makeSymbol( "VARIABLE" ), (SubLObject) makeSymbol( "&OPTIONAL" ), (SubLObject) makeSymbol( "S#33", "CYC" ),
        (SubLObject) makeSymbol( "S#57454", "CYC" ) );
    $ic153$ = makeSymbol( "S#57235", "CYC" );
    $ic154$ = makeSymbol( "S#57232", "CYC" );
    $ic155$ = ConsesLow.list( (SubLObject) ConsesLow.list( (SubLObject) makeSymbol( "S#56848", "CYC" ), (SubLObject) NIL ) );
    $ic156$ = makeString( "Dp" );
    $ic157$ = makeString( "(void)" );
    $ic158$ = makeSymbol( "S#57385", "CYC" );
    $ic159$ = makeSymbol( "S#57386", "CYC" );
    $ic160$ = ConsesLow.list( (SubLObject) makeSymbol( "QUOTE" ), (SubLObject) makeSymbol( "S#5859", "CYC" ) );
    $ic161$ = makeUninternedSymbol( "US#72EAA40" );
    $ic162$ = makeUninternedSymbol( "US#2B36E12" );
    $ic163$ = makeSymbol( "RET" );
    $ic164$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "S#63", "CYC" ) );
    $ic165$ = makeSymbol( "THROW" );
    $ic166$ = makeSymbol( "S#56710", "CYC" );
    $ic167$ = makeSymbol( "DEFLEXICAL" );
    $ic168$ = makeSymbol( "DEFPARAMETER" );
    $ic169$ = ConsesLow.list( (SubLObject) makeSymbol( "S#166", "CYC" ), (SubLObject) makeSymbol( "&REST" ), (SubLObject) makeSymbol( "S#57455", "CYC" ) );
    $ic170$ = makeSymbol( "S#56711", "CYC" );
    $ic171$ = makeKeyword( "NAME" );
    $ic172$ = makeString( " defstruct ~A         ~%" );
  }
}
/*
 * DECOMPILATION REPORT
 * 
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 1118 ms
 * 
 * Decompiled with Procyon 0.5.32.
 */