//
//
package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class assertion_manager_oc
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.assertion_manager_oc";
  public static final String myFingerPrint = "75917106446cb7689a133dfa000c0c26844ce6a98f70d1878720c66345531ac2";
  public static SubLSymbol $assertion_content_manager$;
  private static SubLSymbol $assertion_lru_size_percentage$;
  private static SubLSymbol $assertion_lru_size_max$;
  private static final SubLSymbol $sym0$_ASSERTION_CONTENT_MANAGER_;
  private static final SubLSymbol $ic1$;
  private static final SubLInteger $ic2$;
  private static final SubLString $ic3$;
  private static final SubLSymbol $ic4$;
  private static final SubLSymbol $ic5$;
  private static final SubLList $ic6$;
  private static final SubLString $ic7$;

  public static SubLObject setup_assertion_content_table(final SubLObject var1, final SubLObject var2)
  {
    $assertion_content_manager$.setGlobalValue( kb_object_manager_oc.new_kb_object_manager( $ic3$, var1, $assertion_lru_size_percentage$.getGlobalValue(), $assertion_lru_size_max$.getGlobalValue(), $ic4$, var2 ) );
    return T;
  }

  public static SubLObject f11105(final SubLObject var3)
  {
    return kb_object_manager_oc.f10430( $assertion_content_manager$.getGlobalValue(), var3 );
  }

  public static SubLObject f11106()
  {
    return kb_object_manager_oc.f10431( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11107()
  {
    return kb_object_manager_oc.f10446( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11108()
  {
    return kb_object_manager_oc.f10447( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11109()
  {
    return kb_object_manager_oc.f10437( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11110()
  {
    return kb_object_manager_oc.f10438( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11111()
  {
    return Numbers.numE( assertion_handles_oc.f11019(), f11110() );
  }

  public static SubLObject f11112(final SubLObject var4)
  {
    return kb_object_manager_oc.f10439( $assertion_content_manager$.getGlobalValue(), assertion_handles_oc.f11025( var4 ) );
  }

  public static SubLObject f11113(final SubLObject var4)
  {
    return kb_object_manager_oc.f10440( $assertion_content_manager$.getGlobalValue(), assertion_handles_oc.f11025( var4 ) );
  }

  public static SubLObject f11114(final SubLObject var5)
  {
    module0425.f30054( assertion_handles_oc.f11053( var5 ) );
    return kb_object_manager_oc.f10442( $assertion_content_manager$.getGlobalValue(), var5 );
  }

  public static SubLObject f11115()
  {
    return kb_object_manager_oc.f10458( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11116()
  {
    return kb_object_manager_oc.f10447( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11117()
  {
    return kb_object_manager_oc.f10446( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11118()
  {
    return kb_object_manager_oc.f10437( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11119(final SubLObject var6, final SubLObject var7)
  {
    return kb_object_manager_oc.f10414( $assertion_content_manager$.getGlobalValue(), var6, var7 );
  }

  public static SubLObject f11120()
  {
    return kb_object_manager_oc.f10417( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11121()
  {
    return kb_object_manager_oc.f10418( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11122(final SubLObject var8, final SubLObject var9)
  {
    final SubLObject var10 = var8.rest();
    final SubLObject var12;
    final SubLObject var11 = var12 = var10;
    return ConsesLow.listS( $ic5$, $ic6$, ConsesLow.append( var12, NIL ) );
  }

  public static SubLObject f11123(final SubLObject var5, final SubLObject var13)
  {
    return kb_object_manager_oc.f10448( $assertion_content_manager$.getGlobalValue(), var5, var13 );
  }

  public static SubLObject f11124(final SubLObject var5)
  {
    return kb_object_manager_oc.f10449( $assertion_content_manager$.getGlobalValue(), var5 );
  }

  public static SubLObject f11125(final SubLObject var5)
  {
    return kb_object_manager_oc.f10454( $assertion_content_manager$.getGlobalValue(), var5 );
  }

  public static SubLObject f11126()
  {
    return kb_object_manager_oc.f10455( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11127()
  {
    return kb_object_manager_oc.f10456( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11128()
  {
    return kb_object_manager_oc.f10457( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11129()
  {
    return kb_object_manager_oc.f10436( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11130()
  {
    return kb_object_manager_oc.f10462( $assertion_content_manager$.getGlobalValue() );
  }

  public static SubLObject f11131()
  {
    return kb_object_manager_oc.f10426( $assertion_content_manager$.getGlobalValue(), $ic3$, $ic7$ );
  }

  public static SubLObject f11132(final SubLObject var14, SubLObject var15)
  {
    if( var15 == UNPROVIDED )
    {
      var15 = NIL;
    }
    return kb_object_manager_oc.f10464( $assertion_content_manager$.getGlobalValue(), var14, var15 );
  }

  public static SubLObject declare_assertion_manager_file()
  {
    SubLFiles.declareFunction(me, "setup_assertion_content_table", "SETUP-ASSERTION-CONTENT-TABLE", 2, 0, false );
    SubLFiles.declareFunction(me, "f11105", "S#13805", 1, 0, false );
    SubLFiles.declareFunction(me, "f11106", "S#13813", 0, 0, false );
    SubLFiles.declareFunction(me, "f11107", "S#13929", 0, 0, false );
    SubLFiles.declareFunction(me, "f11108", "S#13930", 0, 0, false );
    SubLFiles.declareFunction(me, "f11109", "S#13931", 0, 0, false );
    SubLFiles.declareFunction(me, "f11110", "S#13932", 0, 0, false );
    SubLFiles.declareFunction(me, "f11111", "S#9555", 0, 0, false );
    SubLFiles.declareFunction(me, "f11112", "S#13933", 1, 0, false );
    SubLFiles.declareFunction(me, "f11113", "S#13934", 1, 0, false );
    SubLFiles.declareFunction(me, "f11114", "S#13812", 1, 0, false );
    SubLFiles.declareFunction(me, "f11115", "S#13806", 0, 0, false );
    SubLFiles.declareFunction(me, "f11116", "S#13935", 0, 0, false );
    SubLFiles.declareFunction(me, "f11117", "S#13936", 0, 0, false );
    SubLFiles.declareFunction(me, "f11118", "S#13937", 0, 0, false );
    SubLFiles.declareFunction(me, "f11119", "S#13938", 2, 0, false );
    SubLFiles.declareFunction(me, "f11120", "S#13939", 0, 0, false );
    SubLFiles.declareFunction(me, "f11121", "S#13940", 0, 0, false );
    /// 6666
    SubLFiles.declareMacro(me, "f11122", "S#13941" );
    SubLFiles.declareFunction(me, "f11123", "S#13942", 2, 0, false );
    SubLFiles.declareFunction(me, "f11124", "S#13943", 1, 0, false );
    SubLFiles.declareFunction(me, "f11125", "S#13944", 1, 0, false );
    SubLFiles.declareFunction(me, "f11126", "S#13945", 0, 0, false );
    SubLFiles.declareFunction(me, "f11127", "S#13946", 0, 0, false );
    SubLFiles.declareFunction(me, "f11128", "S#13947", 0, 0, false );
    SubLFiles.declareFunction(me, "f11129", "S#13948", 0, 0, false );
    SubLFiles.declareFunction(me, "f11130", "S#13949", 0, 0, false );
    SubLFiles.declareFunction(me, "f11131", "S#9544", 0, 0, false );
    SubLFiles.declareFunction(me, "f11132", "S#13950", 1, 1, false );
    return NIL;
  }

  public static SubLObject f11134()
  {
    $assertion_content_manager$ = SubLFiles.deflexical( "*ASSERTION-CONTENT-MANAGER*", ( NIL != Symbols.boundp( $sym0$_ASSERTION_CONTENT_MANAGER_ ) ) ? $assertion_content_manager$.getGlobalValue() : $ic1$ );
    $assertion_lru_size_percentage$ = SubLFiles.deflexical( "*ASSERTION-LRU-SIZE-PERCENTAGE*", SIXTEEN_INTEGER );
    $assertion_lru_size_max$ = SubLFiles.deflexical( "S#13953", $ic2$ );
    return NIL;
  }

  public static SubLObject f11135()
  {
    module0003.f57( $sym0$_ASSERTION_CONTENT_MANAGER_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_assertion_manager_file();
  }

  @Override
  public void initializeVariables()
  {
    f11134();
  }

  @Override
  public void runTopLevelForms()
  {
    f11135();
  }
  static
  {
    me = new assertion_manager_oc();
    $assertion_content_manager$ = null;
    $assertion_lru_size_percentage$ = null;
    $assertion_lru_size_max$ = null;
    $sym0$_ASSERTION_CONTENT_MANAGER_ = makeSymbol( "*ASSERTION-CONTENT-MANAGER*", "CYC" );
    $ic1$ = makeKeyword( "UNINITIALIZED" );
    $ic2$ = makeInteger( 600000 );
    $ic3$ = makeString( "assertion" );
    $ic4$ = makeSymbol( "S#13954", "CYC" );
    $ic5$ = makeSymbol( "S#13240", "CYC" );
    $ic6$ = ConsesLow.list( $sym0$_ASSERTION_CONTENT_MANAGER_ );
    $ic7$ = makeString( "assertion-index" );
  }
}
/*
 * DECOMPILATION REPORT
 *
 * Decompiled from:
 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\cyc-oc4.0-unzipped/com/cyc/
 * cycjava/cycl/class Total time: 50 ms
 *
 * Decompiled with Procyon 0.5.32.
 */