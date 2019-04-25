package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class pph_staleness_test
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.pph_staleness_test";
  public static final String myFingerPrint = "1c589a386c74a589c30dcf2f5957902d9e74e1f7db6629ebd691ec9395de5c68";
  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 864L)
  private static SubLSymbol $gen_template_store_revisions$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1062L)
  private static SubLSymbol $gen_template_store_staleness_acceptableP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1302L)
  private static SubLSymbol $gen_template_store_known_staleP$;
  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2238L)
  private static SubLSymbol $gen_template_store_revision_globals$;
  private static final SubLSymbol $sym0$_GEN_TEMPLATE_STORE_REVISIONS_;
  private static final SubLSymbol $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__;
  private static final SubLSymbol $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__;
  private static final SubLList $list3;
  private static final SubLString $str4$gen_template_store_not_present___;
  private static final SubLString $str5$gen_template_store_built_with_sta;
  private static final SubLSymbol $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_;
  private static final SubLString $str7$gen_template_store_built_with_sta;

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1361L)
  public static SubLObject gen_template_store_known_stale_p()
  {
    return $gen_template_store_known_staleP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1459L)
  public static SubLObject declare_gen_template_store_known_stale()
  {
    $gen_template_store_known_staleP$.setGlobalValue( T );
    return $gen_template_store_known_staleP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1609L)
  public static SubLObject declare_gen_template_store_not_known_stale()
  {
    $gen_template_store_known_staleP$.setGlobalValue( NIL );
    return $gen_template_store_known_staleP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1765L)
  public static SubLObject declare_gen_template_store_staleness_acceptable()
  {
    $gen_template_store_staleness_acceptableP$.setGlobalValue( T );
    return $gen_template_store_staleness_acceptableP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 1942L)
  public static SubLObject declare_gen_template_store_staleness_unacceptable()
  {
    $gen_template_store_staleness_acceptableP$.setGlobalValue( NIL );
    return $gen_template_store_staleness_acceptableP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2123L)
  public static SubLObject gen_template_store_staleness_acceptableP()
  {
    return $gen_template_store_staleness_acceptableP$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 2342L)
  public static SubLObject gen_template_store_staleP()
  {
    SubLObject staleP = NIL;
    if( NIL != gen_template_store_known_stale_p() )
    {
      staleP = T;
    }
    else if( NIL == pph_data_structures.gen_template_store_present_p() )
    {
      Errors.warn( $str4$gen_template_store_not_present___ );
      staleP = T;
    }
    else if( NIL != gen_template_store_revisions_staleP() )
    {
      Errors.warn( $str5$gen_template_store_built_with_sta );
      staleP = T;
    }
    if( NIL != staleP )
    {
      declare_gen_template_store_known_stale();
    }
    else
    {
      declare_gen_template_store_not_known_stale();
    }
    return staleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3061L)
  public static SubLObject gen_template_store_revisions_staleP_internal()
  {
    SubLObject staleP = NIL;
    if( NIL != $gen_template_store_revisions$.getGlobalValue() && NIL == staleP )
    {
      SubLObject csome_list_var;
      SubLObject global;
      for( csome_list_var = $gen_template_store_revision_globals$.getGlobalValue(), global = NIL, global = csome_list_var.first(); NIL == staleP && NIL != csome_list_var; staleP = gen_template_store_revision_staleP(
          global, UNPROVIDED ), csome_list_var = csome_list_var.rest(), global = csome_list_var.first() )
      {
      }
    }
    return staleP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3061L)
  public static SubLObject gen_template_store_revisions_staleP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue( thread );
    SubLObject caching_state = NIL;
    if( NIL == v_memoization_state )
    {
      return gen_template_store_revisions_staleP_internal();
    }
    caching_state = memoization_state.memoization_state_lookup( v_memoization_state, $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, UNPROVIDED );
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_caching_state( memoization_state.memoization_state_lock( v_memoization_state ), $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, ZERO_INTEGER, NIL, EQ, UNPROVIDED );
      memoization_state.memoization_state_put( v_memoization_state, $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_, caching_state );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( thread.resetMultipleValues(), Values.multiple_value_list( gen_template_store_revisions_staleP_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3341L)
  public static SubLObject gen_template_store_unfinishedP()
  {
    return makeBoolean( NIL == list_utilities.proper_list_p( $gen_template_store_revisions$.getGlobalValue() ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3457L)
  public static SubLObject declare_gen_template_store_revisions_not_stale()
  {
    gen_template_store_note_revisions();
    return $gen_template_store_revisions$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 3795L)
  public static SubLObject gen_template_store_note_revisions()
  {
    gen_template_store_clear_revisions();
    SubLObject cdolist_list_var = $gen_template_store_revision_globals$.getGlobalValue();
    SubLObject global = NIL;
    global = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      $gen_template_store_revisions$.setGlobalValue( list_utilities.alist_enter( $gen_template_store_revisions$.getGlobalValue(), global, Symbols.symbol_value( global ), UNPROVIDED ) );
      cdolist_list_var = cdolist_list_var.rest();
      global = cdolist_list_var.first();
    }
    declare_gen_template_store_staleness_unacceptable();
    return $gen_template_store_revisions$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 4164L)
  public static SubLObject gen_template_store_clear_revisions()
  {
    $gen_template_store_revisions$.setGlobalValue( NIL );
    return $gen_template_store_revisions$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/pph-staleness-test.lisp", position = 4305L)
  public static SubLObject gen_template_store_revision_staleP(final SubLObject global, SubLObject warnP)
  {
    if( warnP == UNPROVIDED )
    {
      warnP = T;
    }
    final SubLObject recorded_value = list_utilities.alist_lookup( $gen_template_store_revisions$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED );
    final SubLObject current_value = Symbols.symbol_value( global );
    final SubLObject okP = Equality.equal( recorded_value, current_value );
    if( NIL == okP && NIL != warnP )
    {
      Errors.warn( $str7$gen_template_store_built_with_sta, global );
    }
    return makeBoolean( NIL == okP );
  }

  public static SubLObject declare_pph_staleness_test_file()
  {
    SubLFiles.declareFunction( me, "gen_template_store_known_stale_p", "GEN-TEMPLATE-STORE-KNOWN-STALE-P", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_gen_template_store_known_stale", "DECLARE-GEN-TEMPLATE-STORE-KNOWN-STALE", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_gen_template_store_not_known_stale", "DECLARE-GEN-TEMPLATE-STORE-NOT-KNOWN-STALE", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_gen_template_store_staleness_acceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_gen_template_store_staleness_unacceptable", "DECLARE-GEN-TEMPLATE-STORE-STALENESS-UNACCEPTABLE", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_staleness_acceptableP", "GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_staleP", "GEN-TEMPLATE-STORE-STALE?", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_revisions_staleP_internal", "GEN-TEMPLATE-STORE-REVISIONS-STALE?-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_revisions_staleP", "GEN-TEMPLATE-STORE-REVISIONS-STALE?", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_unfinishedP", "GEN-TEMPLATE-STORE-UNFINISHED?", 0, 0, false );
    SubLFiles.declareFunction( me, "declare_gen_template_store_revisions_not_stale", "DECLARE-GEN-TEMPLATE-STORE-REVISIONS-NOT-STALE", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_note_revisions", "GEN-TEMPLATE-STORE-NOTE-REVISIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_clear_revisions", "GEN-TEMPLATE-STORE-CLEAR-REVISIONS", 0, 0, false );
    SubLFiles.declareFunction( me, "gen_template_store_revision_staleP", "GEN-TEMPLATE-STORE-REVISION-STALE?", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_pph_staleness_test_file()
  {
    $gen_template_store_revisions$ = SubLFiles.deflexical( "*GEN-TEMPLATE-STORE-REVISIONS*", ( maybeDefault( $sym0$_GEN_TEMPLATE_STORE_REVISIONS_, $gen_template_store_revisions$, NIL ) ) );
    $gen_template_store_staleness_acceptableP$ = SubLFiles.deflexical( "*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*", ( maybeDefault( $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__,
        $gen_template_store_staleness_acceptableP$, NIL ) ) );
    $gen_template_store_known_staleP$ = SubLFiles.deflexical( "*GEN-TEMPLATE-STORE-KNOWN-STALE?*", ( maybeDefault( $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__, $gen_template_store_known_staleP$, NIL ) ) );
    $gen_template_store_revision_globals$ = SubLFiles.deflexical( "*GEN-TEMPLATE-STORE-REVISION-GLOBALS*", $list3 );
    return NIL;
  }

  public static SubLObject setup_pph_staleness_test_file()
  {
    subl_macro_promotions.declare_defglobal( $sym0$_GEN_TEMPLATE_STORE_REVISIONS_ );
    subl_macro_promotions.declare_defglobal( $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__ );
    subl_macro_promotions.declare_defglobal( $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__ );
    memoization_state.note_memoized_function( $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_pph_staleness_test_file();
  }

  @Override
  public void initializeVariables()
  {
    init_pph_staleness_test_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_pph_staleness_test_file();
  }
  static
  {
    me = new pph_staleness_test();
    $gen_template_store_revisions$ = null;
    $gen_template_store_staleness_acceptableP$ = null;
    $gen_template_store_known_staleP$ = null;
    $gen_template_store_revision_globals$ = null;
    $sym0$_GEN_TEMPLATE_STORE_REVISIONS_ = makeSymbol( "*GEN-TEMPLATE-STORE-REVISIONS*" );
    $sym1$_GEN_TEMPLATE_STORE_STALENESS_ACCEPTABLE__ = makeSymbol( "*GEN-TEMPLATE-STORE-STALENESS-ACCEPTABLE?*" );
    $sym2$_GEN_TEMPLATE_STORE_KNOWN_STALE__ = makeSymbol( "*GEN-TEMPLATE-STORE-KNOWN-STALE?*" );
    $list3 = ConsesLow.list( makeSymbol( "*PPH-DATA-STRUCTURES-CODE-REVISION*" ) );
    $str4$gen_template_store_not_present___ = makeString( "gen-template store not present.~%" );
    $str5$gen_template_store_built_with_sta = makeString( "gen-template store built with stale code~%" );
    $sym6$GEN_TEMPLATE_STORE_REVISIONS_STALE_ = makeSymbol( "GEN-TEMPLATE-STORE-REVISIONS-STALE?" );
    $str7$gen_template_store_built_with_sta = makeString( "gen-template store built with stale version of ~S~%" );
  }
}
/*
 * 
 * Total time: 30 ms
 * 
 */