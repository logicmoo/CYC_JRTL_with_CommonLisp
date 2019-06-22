package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class constant_reader_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.constant_reader_oc";
  public static final String myFingerPrint = "6a2258c4d1229cb28a5b3caa6a93d18a0228da4c9ade1491c17c39f661698cef";
  private static SubLSymbol $g1503$;
  private static SubLSymbol $g1504$;
  private static final SubLString $ic0$;
  private static final SubLString $ic1$;
  private static final SubLInteger $ic2$;
  private static final SubLString $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;

  public static SubLObject f8494()
  {
    return $g1503$.getGlobalValue();
  }

  public static SubLObject f8495()
  {
    return $g1504$.getGlobalValue();
  }

  public static SubLObject f8496(final SubLObject var1, final SubLObject var2, final SubLObject var3)
  {
    final SubLThread var4 = SubLProcess.currentSubLThread();
    if( NIL != var3 )
    {
      reader.simple_reader_error( $ic1$, ConsesLow.list( var2 ) );
    }
    SubLObject var5 = $ic2$;
    SubLObject var6 = Strings.make_string( var5, UNPROVIDED );
    SubLObject var7 = ZERO_INTEGER;
    SubLObject var8;
    for( var8 = streams_high.read_char( var1, NIL, NIL, UNPROVIDED ); NIL != var8 && NIL != module0126.f8387( var8 ); var8 = streams_high.read_char( var1, NIL,
        NIL, UNPROVIDED ) )
    {
      if( var7.numGE( var5 ) )
      {
        var5 = Numbers.multiply( var5, TWO_INTEGER );
        final SubLObject var9 = Strings.make_string( var5, UNPROVIDED );
        SubLObject var10;
        for( var10 = NIL, var10 = ZERO_INTEGER; var10.numL( var7 ); var10 = Numbers.add( var10, ONE_INTEGER ) )
        {
          Strings.set_char( var9, var10, Strings.sublisp_char( var6, var10 ) );
        }
        var6 = var9;
      }
      Strings.set_char( var6, var7, var8 );
      var7 = Numbers.add( var7, ONE_INTEGER );
    }
    if( NIL != var8 )
    {
      streams_high.unread_char( var8, var1 );
    }
    if( NIL != reader.$read_suppress$.getDynamicValue( var4 ) )
    {
      return Values.values( NIL, T );
    }
    final SubLObject var11 = var7.numE( var5 ) ? var6 : Sequences.subseq( var6, ZERO_INTEGER, var7 );
    SubLObject var12 = f8497( var11 );
    if( NIL != var12 )
    {
      return Values.values( var12, T );
    }
    if( NIL != f8498( var1 ) )
    {
      reader.simple_reader_error( $ic3$, ConsesLow.list( var11 ) );
      return NIL;
    }
    SubLObject var13 = NIL;
    try
    {
      var4.throwStack.push( module0003.$g3$.getGlobalValue() );
      final SubLObject var14 = Errors.$error_handler$.currentBinding( var4 );
      try
      {
        Errors.$error_handler$.bind( $ic4$, var4 );
        try
        {
          var12 = constant_handles_oc.f8479( var11 );
        }
        catch( final Throwable var15 )
        {
          Errors.handleThrowable( var15, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( var14, var4 );
      }
    }
    catch( final Throwable var16 )
    {
      var13 = Errors.handleThrowable( var16, module0003.$g3$.getGlobalValue() );
    }
    finally
    {
      var4.throwStack.pop();
    }
    if( NIL != var13 )
    {
      reader.simple_reader_error( var13, NIL );
    }
    return Values.values( var12, T );
  }

  public static SubLObject f8497(final SubLObject var11)
  {
    final SubLThread var12 = SubLProcess.currentSubLThread();
    SubLObject var13 = NIL;
    final SubLObject var14 = module0124.$g1495$.currentBinding( var12 );
    try
    {
      module0124.$g1495$.bind( NIL, var12 );
      var13 = module0126.f8394( var11, UNPROVIDED, UNPROVIDED );
    }
    finally
    {
      module0124.$g1495$.rebind( var14, var12 );
    }
    if( NIL == var13 )
    {
      var13 = constant_handles_oc.f8471( var11 );
    }
    return var13;
  }

  public static SubLObject f8498(final SubLObject var1)
  {
    final SubLThread var2 = SubLProcess.currentSubLThread();
    if( NIL == module0018.$g571$.getDynamicValue( var2 ) )
    {
      return NIL;
    }
    return T;
  }

  public static SubLObject f8499()
  {
    SubLFiles.declareFunction(me, "f8494", "S#3959", 0, 0, false );
    SubLFiles.declareFunction(me, "f8495", "S#3934", 0, 0, false );
    SubLFiles.declareFunction(me, "f8496", "S#10597", 3, 0, false );
    SubLFiles.declareFunction(me, "f8497", "FIND-CONSTANT-BY-NAME", 1, 0, false );
    SubLFiles.declareFunction(me, "f8498", "S#10598", 1, 0, false );
    return NIL;
  }

  public static SubLObject f8500()
  {
    $g1503$ = SubLFiles.defconstant( "S#10599", Characters.CHAR_dollar );
    $g1504$ = SubLFiles.defconstant( "S#10600", Sequences.cconcatenate( $ic0$, Strings.string( $g1503$.getGlobalValue() ) ) );
    return NIL;
  }

  public static SubLObject f8501()
  {
    reader.set_dispatch_macro_character( Characters.CHAR_hash, f8494(), $ic5$, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    f8499();
  }

  @Override
  public void initializeVariables()
  {
    f8500();
  }

  @Override
  public void runTopLevelForms()
  {
    f8501();
  }
  static
  {
    me = new constant_reader_oc();
    $g1503$ = null;
    $g1504$ = null;
    $ic0$ = makeString( "#" );
    $ic1$ = makeString( "The ~S reader macro does not take an argument." );
    $ic2$ = makeInteger( 64 );
    $ic3$ = makeString( "~S is not the name of a constant." );
    $ic4$ = makeSymbol( "S#38", "CYC" );
    $ic5$ = makeSymbol( "S#10597", "CYC" );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 62 ms
 *
 * Decompiled with Procyon 0.5.32.
 */