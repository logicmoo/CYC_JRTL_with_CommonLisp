package com.cyc.cycjava.cycl.cyc_testing;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class ctest_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.ctest_macros";
  public static final String myFingerPrint = "b71f66b52e5855f86c1c7133cd3f10e7127b88d80148d2298e123bf083580afd";
  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 2807L)
  private static SubLSymbol $kct_metric_evaluator_methods$;
  private static final SubLList $list0;
  private static final SubLSymbol $sym1$CLET;
  private static final SubLList $list2;
  private static final SubLSymbol $sym3$CATCH_ERROR_MESSAGE;
  private static final SubLSymbol $sym4$PROGN;
  private static final SubLSymbol $sym5$PWHEN;
  private static final SubLSymbol $sym6$ERROR;
  private static final SubLSymbol $sym7$CAND;
  private static final SubLSymbol $sym8$SQL_CONNECTION_P;
  private static final SubLSymbol $sym9$SQLC_OPEN_P;
  private static final SubLSymbol $sym10$CNOT;
  private static final SubLSymbol $sym11$SQLC_GET_AUTO_COMMIT;
  private static final SubLSymbol $sym12$ROLLBACK_CONNECTION;
  private static final SubLSymbol $sym13$KILL_SQL_CONNECTION;
  private static final SubLString $str14$_a__DB_CONNECTION__a_was_killed_;
  private static final SubLString $str15$_a__DB_CONNECTION__a_was_rolled_b;
  private static final SubLSymbol $sym16$_KCT_METRIC_EVALUATOR_METHODS_;
  private static final SubLSymbol $sym17$CAR;
  private static final SubLList $list18;
  private static final SubLSymbol $sym19$CTEST_REGISTER_METRIC_EVALUATOR;
  private static final SubLSymbol $sym20$QUOTE;
  private static final SubLSymbol $sym21$DEF_INSTANCE_METHOD;
  private static final SubLList $list22;
  private static final SubLList $list23;

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 1537L)
  public static SubLObject with_db_connection_cleanup_on_error(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject db_connection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    db_connection = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$CLET, $list2, ConsesLow.list( $sym3$CATCH_ERROR_MESSAGE, $list2, reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym5$PWHEN, $sym6$ERROR, ConsesLow.list(
        $sym5$PWHEN, ConsesLow.list( $sym7$CAND, ConsesLow.list( $sym8$SQL_CONNECTION_P, db_connection ), ConsesLow.list( $sym9$SQLC_OPEN_P, db_connection ) ), ConsesLow.list( $sym5$PWHEN, ConsesLow.list( $sym10$CNOT,
            ConsesLow.list( $sym11$SQLC_GET_AUTO_COMMIT, db_connection ) ), ConsesLow.list( $sym12$ROLLBACK_CONNECTION, db_connection ) ), ConsesLow.list( $sym13$KILL_SQL_CONNECTION, db_connection ) ), ConsesLow.list(
                $sym6$ERROR, $str14$_a__DB_CONNECTION__a_was_killed_, $sym6$ERROR, db_connection ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 2215L)
  public static SubLObject with_db_connection_rollback_on_error(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject db_connection = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    db_connection = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.list( $sym1$CLET, $list2, ConsesLow.list( $sym3$CATCH_ERROR_MESSAGE, $list2, reader.bq_cons( $sym4$PROGN, ConsesLow.append( body, NIL ) ) ), ConsesLow.list( $sym5$PWHEN, $sym6$ERROR, ConsesLow.list(
        $sym5$PWHEN, ConsesLow.list( $sym7$CAND, ConsesLow.list( $sym8$SQL_CONNECTION_P, db_connection ), ConsesLow.list( $sym9$SQLC_OPEN_P, db_connection ) ), ConsesLow.list( $sym12$ROLLBACK_CONNECTION,
            db_connection ) ), ConsesLow.list( $sym6$ERROR, $str15$_a__DB_CONNECTION__a_was_rolled_b, $sym6$ERROR, db_connection ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4397L)
  public static SubLObject ctest_register_metric_evaluator(final SubLObject metric_identifier, final SubLObject metric_method_symbol)
  {
    final SubLObject item_var = ConsesLow.cons( metric_identifier, metric_method_symbol );
    if( NIL == conses_high.member( item_var, $kct_metric_evaluator_methods$.getGlobalValue(), Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ) ) )
    {
      $kct_metric_evaluator_methods$.setGlobalValue( ConsesLow.cons( item_var, $kct_metric_evaluator_methods$.getGlobalValue() ) );
    }
    return $kct_metric_evaluator_methods$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4633L)
  public static SubLObject ctest_get_evaluator_for_metric(final SubLObject metric_identifier)
  {
    return conses_high.assoc( metric_identifier, $kct_metric_evaluator_methods$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4780L)
  public static SubLObject ctest_metric_identifier_p(final SubLObject v_object)
  {
    return Sequences.find( v_object, $kct_metric_evaluator_methods$.getGlobalValue(), Symbols.symbol_function( EQL ), Symbols.symbol_function( $sym17$CAR ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 4900L)
  public static SubLObject define_metric_evaluator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject metric_method_symbol = NIL;
    SubLObject metric_identifier = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    metric_method_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    metric_identifier = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    arg = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym4$PROGN, ConsesLow.list( $sym19$CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, ConsesLow.list( $sym20$QUOTE, metric_method_symbol ) ), ConsesLow.listS( $sym21$DEF_INSTANCE_METHOD,
          reader.bq_cons( metric_method_symbol, $list22 ), ConsesLow.list( arg ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/cyc-testing/ctest-macros.lisp", position = 5483L)
  public static SubLObject define_collection_metric_evaluator(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject metric_method_symbol = NIL;
    SubLObject metric_identifier = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    metric_method_symbol = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    metric_identifier = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject arg = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list18 );
    arg = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.list( $sym4$PROGN, ConsesLow.list( $sym19$CTEST_REGISTER_METRIC_EVALUATOR, metric_identifier, ConsesLow.list( $sym20$QUOTE, metric_method_symbol ) ), ConsesLow.listS( $sym21$DEF_INSTANCE_METHOD,
          reader.bq_cons( metric_method_symbol, $list23 ), ConsesLow.list( arg ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list18 );
    return NIL;
  }

  public static SubLObject declare_ctest_macros_file()
  {
    SubLFiles.declareMacro( me, "with_db_connection_cleanup_on_error", "WITH-DB-CONNECTION-CLEANUP-ON-ERROR" );
    SubLFiles.declareMacro( me, "with_db_connection_rollback_on_error", "WITH-DB-CONNECTION-ROLLBACK-ON-ERROR" );
    SubLFiles.declareFunction( me, "ctest_register_metric_evaluator", "CTEST-REGISTER-METRIC-EVALUATOR", 2, 0, false );
    SubLFiles.declareFunction( me, "ctest_get_evaluator_for_metric", "CTEST-GET-EVALUATOR-FOR-METRIC", 1, 0, false );
    SubLFiles.declareFunction( me, "ctest_metric_identifier_p", "CTEST-METRIC-IDENTIFIER-P", 1, 0, false );
    SubLFiles.declareMacro( me, "define_metric_evaluator", "DEFINE-METRIC-EVALUATOR" );
    SubLFiles.declareMacro( me, "define_collection_metric_evaluator", "DEFINE-COLLECTION-METRIC-EVALUATOR" );
    return NIL;
  }

  public static SubLObject init_ctest_macros_file()
  {
    $kct_metric_evaluator_methods$ = SubLFiles.deflexical( "*KCT-METRIC-EVALUATOR-METHODS*", ( maybeDefault( $sym16$_KCT_METRIC_EVALUATOR_METHODS_, $kct_metric_evaluator_methods$, NIL ) ) );
    return NIL;
  }

  public static SubLObject setup_ctest_macros_file()
  {
    subl_macro_promotions.declare_defglobal( $sym16$_KCT_METRIC_EVALUATOR_METHODS_ );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_ctest_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_ctest_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_ctest_macros_file();
  }
  static
  {
    me = new ctest_macros();
    $kct_metric_evaluator_methods$ = null;
    $list0 = ConsesLow.list( makeSymbol( "DB-CONNECTION" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym1$CLET = makeSymbol( "CLET" );
    $list2 = ConsesLow.list( makeSymbol( "ERROR" ) );
    $sym3$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $sym4$PROGN = makeSymbol( "PROGN" );
    $sym5$PWHEN = makeSymbol( "PWHEN" );
    $sym6$ERROR = makeSymbol( "ERROR" );
    $sym7$CAND = makeSymbol( "CAND" );
    $sym8$SQL_CONNECTION_P = makeSymbol( "SQL-CONNECTION-P" );
    $sym9$SQLC_OPEN_P = makeSymbol( "SQLC-OPEN-P" );
    $sym10$CNOT = makeSymbol( "CNOT" );
    $sym11$SQLC_GET_AUTO_COMMIT = makeSymbol( "SQLC-GET-AUTO-COMMIT" );
    $sym12$ROLLBACK_CONNECTION = makeSymbol( "ROLLBACK-CONNECTION" );
    $sym13$KILL_SQL_CONNECTION = makeSymbol( "KILL-SQL-CONNECTION" );
    $str14$_a__DB_CONNECTION__a_was_killed_ = makeString( "~a (DB-CONNECTION ~a was killed)" );
    $str15$_a__DB_CONNECTION__a_was_rolled_b = makeString( "~a (DB-CONNECTION ~a was rolled back)" );
    $sym16$_KCT_METRIC_EVALUATOR_METHODS_ = makeSymbol( "*KCT-METRIC-EVALUATOR-METHODS*" );
    $sym17$CAR = makeSymbol( "CAR" );
    $list18 = ConsesLow.list( makeSymbol( "METRIC-METHOD-SYMBOL" ), makeSymbol( "METRIC-IDENTIFIER" ), ConsesLow.list( makeSymbol( "ARG" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym19$CTEST_REGISTER_METRIC_EVALUATOR = makeSymbol( "CTEST-REGISTER-METRIC-EVALUATOR" );
    $sym20$QUOTE = makeSymbol( "QUOTE" );
    $sym21$DEF_INSTANCE_METHOD = makeSymbol( "DEF-INSTANCE-METHOD" );
    $list22 = ConsesLow.list( makeSymbol( "TEST-METRIC-RESULT" ), makeKeyword( "PUBLIC" ) );
    $list23 = ConsesLow.list( makeSymbol( "TEST-COLLECTION-METRIC-RESULT" ), makeKeyword( "PUBLIC" ) );
  }
}
/*
 * 
 * Total time: 86 ms
 * 
 */