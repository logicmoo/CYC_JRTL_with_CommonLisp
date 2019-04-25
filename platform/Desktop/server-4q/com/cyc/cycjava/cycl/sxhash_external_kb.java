package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sxhash_external_kb
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sxhash_external_kb";
  public static final String myFingerPrint = "e0c3682d080e080c61b09d88e5854744fe2f1adf66edcb6bd435fa4b16f57516";
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 810L)
  private static SubLSymbol $sxhash_external_caching_enabled$;
  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1473L)
  private static SubLSymbol $sxhash_external_constant_caching_state$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$SXHASH_EXTERNAL_CONSTANT;
  private static final SubLSymbol $sym2$_SXHASH_EXTERNAL_CONSTANT_CACHING_STATE_;
  private static final SubLSymbol $sym3$SXHASH_EXTERNAL_CONSTANT_METHOD;
  private static final SubLList $list4;
  private static final SubLSymbol $sym5$SXHASH_EXTERNAL_NART_METHOD;
  private static final SubLList $list6;
  private static final SubLSymbol $sym7$SXHASH_EXTERNAL_VARIABLE_METHOD;
  private static final SubLList $list8;
  private static final SubLSymbol $sym9$SXHASH_EXTERNAL_ASSERTION_METHOD;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$SXHASH_EXTERNAL_DEDUCTION_METHOD;
  private static final SubLList $list12;
  private static final SubLSymbol $sym13$SXHASH_EXTERNAL_CLAUSE_STRUC_METHOD;

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1357L)
  public static SubLObject sxhash_external_constant_int(final SubLObject constant)
  {
    return sxhash_external.sxhash_external( constants_high.constant_external_id( constant ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1473L)
  public static SubLObject clear_sxhash_external_constant()
  {
    final SubLObject cs = $sxhash_external_constant_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1473L)
  public static SubLObject remove_sxhash_external_constant(final SubLObject constant)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $sxhash_external_constant_caching_state$.getGlobalValue(), ConsesLow.list( constant ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1473L)
  public static SubLObject sxhash_external_constant_internal(final SubLObject constant)
  {
    return sxhash_external_constant_int( constant );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1473L)
  public static SubLObject sxhash_external_constant(final SubLObject constant)
  {
    SubLObject caching_state = $sxhash_external_constant_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym1$SXHASH_EXTERNAL_CONSTANT, $sym2$_SXHASH_EXTERNAL_CONSTANT_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, constant, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( sxhash_external_constant_internal( constant ) ) );
      memoization_state.caching_state_put( caching_state, constant, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1593L)
  public static SubLObject sxhash_external_constant_method(final SubLObject v_object)
  {
    if( NIL == $sxhash_external_caching_enabled$.getGlobalValue() )
    {
      return sxhash_external_constant_int( v_object );
    }
    return sxhash_external_constant( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1832L)
  public static SubLObject sxhash_external_nart(final SubLObject nart)
  {
    return sxhash_external.sxhash_external( narts_high.nart_hl_formula( nart ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 1955L)
  public static SubLObject sxhash_external_nart_method(final SubLObject v_object)
  {
    return sxhash_external_nart( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2100L)
  public static SubLObject sxhash_external_variable(final SubLObject variable)
  {
    return sxhash_external.sxhash_external( variables.variable_id( variable ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2203L)
  public static SubLObject sxhash_external_variable_method(final SubLObject v_object)
  {
    return sxhash_external_variable( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2358L)
  public static SubLObject sxhash_external_assertion(final SubLObject assertion)
  {
    return Numbers.logxor( sxhash_external.sxhash_external( assertions_high.assertion_cnf( assertion ) ), sxhash_external.sxhash_external( assertions_high.assertion_mt( assertion ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2554L)
  public static SubLObject sxhash_external_assertion_method(final SubLObject v_object)
  {
    return sxhash_external_assertion( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2711L)
  public static SubLObject sxhash_external_deduction(final SubLObject deduction)
  {
    return Numbers.logxor( new SubLObject[] { sxhash_external.sxhash_external( deductions_high.deduction_supported_object( deduction ) ), sxhash_external.sxhash_external( deductions_high.deduction_supports(
        deduction ) ), sxhash_external.sxhash_external( arguments.argument_truth( deduction ) )
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 2979L)
  public static SubLObject sxhash_external_deduction_method(final SubLObject v_object)
  {
    return sxhash_external_deduction( v_object );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 3142L)
  public static SubLObject sxhash_external_clause_struc(final SubLObject clause_struc)
  {
    return sxhash_external.sxhash_external( clause_strucs.clause_struc_cnf( clause_struc ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sxhash-external-kb.lisp", position = 3262L)
  public static SubLObject sxhash_external_clause_struc_method(final SubLObject v_object)
  {
    return sxhash_external_clause_struc( v_object );
  }

  public static SubLObject declare_sxhash_external_kb_file()
  {
    SubLFiles.declareFunction( me, "sxhash_external_constant_int", "SXHASH-EXTERNAL-CONSTANT-INT", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_sxhash_external_constant", "CLEAR-SXHASH-EXTERNAL-CONSTANT", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_sxhash_external_constant", "REMOVE-SXHASH-EXTERNAL-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_constant_internal", "SXHASH-EXTERNAL-CONSTANT-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_constant", "SXHASH-EXTERNAL-CONSTANT", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_constant_method", "SXHASH-EXTERNAL-CONSTANT-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_nart", "SXHASH-EXTERNAL-NART", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_nart_method", "SXHASH-EXTERNAL-NART-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_variable", "SXHASH-EXTERNAL-VARIABLE", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_variable_method", "SXHASH-EXTERNAL-VARIABLE-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_assertion", "SXHASH-EXTERNAL-ASSERTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_assertion_method", "SXHASH-EXTERNAL-ASSERTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_deduction", "SXHASH-EXTERNAL-DEDUCTION", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_deduction_method", "SXHASH-EXTERNAL-DEDUCTION-METHOD", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_clause_struc", "SXHASH-EXTERNAL-CLAUSE-STRUC", 1, 0, false );
    SubLFiles.declareFunction( me, "sxhash_external_clause_struc_method", "SXHASH-EXTERNAL-CLAUSE-STRUC-METHOD", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_sxhash_external_kb_file()
  {
    $sxhash_external_caching_enabled$ = SubLFiles.deflexical( "*SXHASH-EXTERNAL-CACHING-ENABLED*", T );
    $sxhash_external_constant_caching_state$ = SubLFiles.deflexical( "*SXHASH-EXTERNAL-CONSTANT-CACHING-STATE*", NIL );
    return NIL;
  }

  public static SubLObject setup_sxhash_external_kb_file()
  {
    SubLSpecialOperatorDeclarations.proclaim( $list0 );
    memoization_state.note_globally_cached_function( $sym1$SXHASH_EXTERNAL_CONSTANT );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), constant_handles.$dtp_constant$.getGlobalValue(), Symbols.symbol_function( $sym3$SXHASH_EXTERNAL_CONSTANT_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list4 );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), Symbols.symbol_function( $sym5$SXHASH_EXTERNAL_NART_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list6 );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), Symbols.symbol_function( $sym7$SXHASH_EXTERNAL_VARIABLE_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list8 );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), Symbols.symbol_function( $sym9$SXHASH_EXTERNAL_ASSERTION_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list10 );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), Symbols.symbol_function( $sym11$SXHASH_EXTERNAL_DEDUCTION_METHOD ) );
    SubLSpecialOperatorDeclarations.proclaim( $list12 );
    Structures.register_method( sxhash_external.$sxhash_external_method_table$.getGlobalValue(), clause_strucs.$dtp_clause_struc$.getGlobalValue(), Symbols.symbol_function( $sym13$SXHASH_EXTERNAL_CLAUSE_STRUC_METHOD ) );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sxhash_external_kb_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sxhash_external_kb_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sxhash_external_kb_file();
  }
  static
  {
    me = new sxhash_external_kb();
    $sxhash_external_caching_enabled$ = null;
    $sxhash_external_constant_caching_state$ = null;
    $list0 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-CONSTANT" ), makeSymbol( "SXHASH-EXTERNAL-CONSTANT-INT" ) );
    $sym1$SXHASH_EXTERNAL_CONSTANT = makeSymbol( "SXHASH-EXTERNAL-CONSTANT" );
    $sym2$_SXHASH_EXTERNAL_CONSTANT_CACHING_STATE_ = makeSymbol( "*SXHASH-EXTERNAL-CONSTANT-CACHING-STATE*" );
    $sym3$SXHASH_EXTERNAL_CONSTANT_METHOD = makeSymbol( "SXHASH-EXTERNAL-CONSTANT-METHOD" );
    $list4 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-NART" ) );
    $sym5$SXHASH_EXTERNAL_NART_METHOD = makeSymbol( "SXHASH-EXTERNAL-NART-METHOD" );
    $list6 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-VARIABLE" ) );
    $sym7$SXHASH_EXTERNAL_VARIABLE_METHOD = makeSymbol( "SXHASH-EXTERNAL-VARIABLE-METHOD" );
    $list8 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-ASSERTION" ) );
    $sym9$SXHASH_EXTERNAL_ASSERTION_METHOD = makeSymbol( "SXHASH-EXTERNAL-ASSERTION-METHOD" );
    $list10 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-DEDUCTION" ) );
    $sym11$SXHASH_EXTERNAL_DEDUCTION_METHOD = makeSymbol( "SXHASH-EXTERNAL-DEDUCTION-METHOD" );
    $list12 = ConsesLow.list( makeSymbol( "INLINE" ), makeSymbol( "SXHASH-EXTERNAL-CLAUSE-STRUC" ) );
    $sym13$SXHASH_EXTERNAL_CLAUSE_STRUC_METHOD = makeSymbol( "SXHASH-EXTERNAL-CLAUSE-STRUC-METHOD" );
  }
}
/*
 * 
 * Total time: 60 ms
 * 
 */