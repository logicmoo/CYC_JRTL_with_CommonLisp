package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_infrastructure_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_macros";
  public static final String myFingerPrint = "627fbf73b76d5c7325959fa19e04f1d6e0a5c328cf35abcc795faf9afe081e8d";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1508L)
  public static SubLSymbol $sksi_profiling_onP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1630L)
  public static SubLSymbol $sksi_sql_query_time$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1682L)
  public static SubLSymbol $sksi_sql_query_count$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1734L)
  public static SubLSymbol $sksi_sql_update_time$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1786L)
  public static SubLSymbol $sksi_sql_update_count$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1839L)
  public static SubLSymbol $sksi_sql_batch_update_count$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLSymbol $kw2$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw3$DONE;
  private static final SubLSymbol $sym4$DO_PREDICATE_EXTENT_INDEX;
  private static final SubLSymbol $kw5$TRUTH;
  private static final SubLSymbol $kw6$TRUE;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLSymbol $kw9$INDEX;
  private static final SubLSymbol $kw10$PREDICATE;
  private static final SubLSymbol $sym11$DO_GAF_ARG_INDEX;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLSymbol $kw14$METHODS;
  private static final SubLSymbol $sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA;
  private static final SubLSymbol $sym16$CLET;
  private static final SubLList $list17;
  private static final SubLSymbol $sym18$START_TIME;
  private static final SubLSymbol $sym19$END_TIME;
  private static final SubLSymbol $sym20$TOTAL_TIME;
  private static final SubLSymbol $sym21$RESULT;
  private static final SubLList $list22;
  private static final SubLSymbol $sym23$WITH_SKSI_PROFILING_ON;
  private static final SubLSymbol $sym24$PROGN;
  private static final SubLSymbol $sym25$CSETQ;
  private static final SubLSymbol $sym26$FORMAT;
  private static final SubLString $str27$Result_____A__;
  private static final SubLSymbol $sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES;
  private static final SubLString $str29$__Query_time____A_sec__;
  private static final SubLString $str30$_Cyc_side____A_sec__;
  private static final SubLSymbol $sym31$_;
  private static final SubLList $list32;
  private static final SubLList $list33;
  private static final SubLList $list34;
  private static final SubLString $str35$___bindings____A__;
  private static final SubLSymbol $sym36$FIF;
  private static final SubLSymbol $sym37$CONSP;
  private static final SubLSymbol $sym38$LIST_LENGTH;
  private static final SubLList $list39;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 862L)
  public static SubLObject sksi_do_predicate_extent_index_true(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject predicate = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list0 );
    predicate = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list0 );
      if( NIL == conses_high.member( current_$1, $list1, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list0 );
    }
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym4$DO_PREDICATE_EXTENT_INDEX, ConsesLow.list( var, predicate, $kw5$TRUTH, $kw6$TRUE, $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1050L)
  public static SubLObject sksi_do_gaf_arg_index_true(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject var = NIL;
    SubLObject v_term = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list7 );
    v_term = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list7 );
      if( NIL == conses_high.member( current_$2, $list8, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list7 );
    }
    final SubLObject index_tail = cdestructuring_bind.property_list_member( $kw9$INDEX, current );
    final SubLObject index = ( NIL != index_tail ) ? conses_high.cadr( index_tail ) : NIL;
    final SubLObject predicate_tail = cdestructuring_bind.property_list_member( $kw10$PREDICATE, current );
    final SubLObject predicate = ( NIL != predicate_tail ) ? conses_high.cadr( predicate_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym11$DO_GAF_ARG_INDEX, ConsesLow.list( new SubLObject[] { var, v_term, $kw9$INDEX, index, $kw10$PREDICATE, predicate, $kw5$TRUTH, $kw6$TRUE, $kw3$DONE, done
    } ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1261L)
  public static SubLObject sksi_do_gafs_potentially_matching_formula_true(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject assertion_var = NIL;
    SubLObject asent = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    assertion_var = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list12 );
    asent = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$3 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      current_$3 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list12 );
      if( NIL == conses_high.member( current_$3, $list13, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$3 == $kw2$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list12 );
    }
    final SubLObject methods_tail = cdestructuring_bind.property_list_member( $kw14$METHODS, current );
    final SubLObject v_methods = ( NIL != methods_tail ) ? conses_high.cadr( methods_tail ) : NIL;
    final SubLObject done_tail = cdestructuring_bind.property_list_member( $kw3$DONE, current );
    final SubLObject done = ( NIL != done_tail ) ? conses_high.cadr( done_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    return ConsesLow.listS( $sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA, ConsesLow.list( assertion_var, asent, $kw14$METHODS, v_methods, $kw5$TRUTH, $kw6$TRUE, $kw3$DONE, done ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1560L)
  public static SubLObject sksi_profiling_onP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sksi_profiling_onP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 1898L)
  public static SubLObject with_sksi_profiling_on(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym16$CLET, $list17, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-infrastructure-macros.lisp", position = 2200L)
  public static SubLObject with_sksi_query_profiling_results(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject start_time = $sym18$START_TIME;
    final SubLObject end_time = $sym19$END_TIME;
    final SubLObject total_time = $sym20$TOTAL_TIME;
    final SubLObject result = $sym21$RESULT;
    return ConsesLow.list( $sym16$CLET, ConsesLow.list( reader.bq_cons( start_time, $list22 ), end_time, total_time, result ), ConsesLow.list( $sym23$WITH_SKSI_PROFILING_ON, ConsesLow.list( new SubLObject[] {
      $sym24$PROGN, ConsesLow.listS( $sym25$CSETQ, result, ConsesLow.append( body, NIL ) ), ConsesLow.listS( $sym25$CSETQ, end_time, $list22 ), ConsesLow.list( $sym26$FORMAT, T, $str27$Result_____A__, result ), ConsesLow
          .list( $sym25$CSETQ, total_time, ConsesLow.list( $sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES, start_time, end_time ) ), ConsesLow.list( $sym26$FORMAT, T, $str29$__Query_time____A_sec__, total_time ),
      ConsesLow.list( $sym26$FORMAT, T, $str30$_Cyc_side____A_sec__, ConsesLow.listS( $sym31$_, total_time, $list32 ) ), $list33, $list34, ConsesLow.list( $sym26$FORMAT, T, $str35$___bindings____A__, ConsesLow.listS(
          $sym36$FIF, ConsesLow.list( $sym37$CONSP, result ), ConsesLow.list( $sym38$LIST_LENGTH, result ), $list39 ) )
    } ) ) );
  }

  public static SubLObject declare_sksi_infrastructure_macros_file()
  {
    SubLFiles.declareMacro( me, "sksi_do_predicate_extent_index_true", "SKSI-DO-PREDICATE-EXTENT-INDEX-TRUE" );
    SubLFiles.declareMacro( me, "sksi_do_gaf_arg_index_true", "SKSI-DO-GAF-ARG-INDEX-TRUE" );
    SubLFiles.declareMacro( me, "sksi_do_gafs_potentially_matching_formula_true", "SKSI-DO-GAFS-POTENTIALLY-MATCHING-FORMULA-TRUE" );
    SubLFiles.declareFunction( me, "sksi_profiling_onP", "SKSI-PROFILING-ON?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_profiling_on", "WITH-SKSI-PROFILING-ON" );
    SubLFiles.declareMacro( me, "with_sksi_query_profiling_results", "WITH-SKSI-QUERY-PROFILING-RESULTS" );
    return NIL;
  }

  public static SubLObject init_sksi_infrastructure_macros_file()
  {
    $sksi_profiling_onP$ = SubLFiles.defparameter( "*SKSI-PROFILING-ON?*", NIL );
    $sksi_sql_query_time$ = SubLFiles.defparameter( "*SKSI-SQL-QUERY-TIME*", NIL );
    $sksi_sql_query_count$ = SubLFiles.defparameter( "*SKSI-SQL-QUERY-COUNT*", NIL );
    $sksi_sql_update_time$ = SubLFiles.defparameter( "*SKSI-SQL-UPDATE-TIME*", NIL );
    $sksi_sql_update_count$ = SubLFiles.defparameter( "*SKSI-SQL-UPDATE-COUNT*", NIL );
    $sksi_sql_batch_update_count$ = SubLFiles.defparameter( "*SKSI-SQL-BATCH-UPDATE-COUNT*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_infrastructure_macros_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_infrastructure_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_infrastructure_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_infrastructure_macros_file();
  }
  static
  {
    me = new sksi_infrastructure_macros();
    $sksi_profiling_onP$ = null;
    $sksi_sql_query_time$ = null;
    $sksi_sql_query_count$ = null;
    $sksi_sql_update_time$ = null;
    $sksi_sql_update_count$ = null;
    $sksi_sql_batch_update_count$ = null;
    $list0 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "PREDICATE" ), makeSymbol( "&KEY" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list1 = ConsesLow.list( makeKeyword( "DONE" ) );
    $kw2$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw3$DONE = makeKeyword( "DONE" );
    $sym4$DO_PREDICATE_EXTENT_INDEX = makeSymbol( "DO-PREDICATE-EXTENT-INDEX" );
    $kw5$TRUTH = makeKeyword( "TRUTH" );
    $kw6$TRUE = makeKeyword( "TRUE" );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "VAR" ), makeSymbol( "TERM" ), makeSymbol( "&KEY" ), makeSymbol( "INDEX" ), makeSymbol( "PREDICATE" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol(
        "BODY" ) );
    $list8 = ConsesLow.list( makeKeyword( "INDEX" ), makeKeyword( "PREDICATE" ), makeKeyword( "DONE" ) );
    $kw9$INDEX = makeKeyword( "INDEX" );
    $kw10$PREDICATE = makeKeyword( "PREDICATE" );
    $sym11$DO_GAF_ARG_INDEX = makeSymbol( "DO-GAF-ARG-INDEX" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "ASSERTION-VAR" ), makeSymbol( "ASENT" ), makeSymbol( "&KEY" ), makeSymbol( "METHODS" ), makeSymbol( "DONE" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list13 = ConsesLow.list( makeKeyword( "METHODS" ), makeKeyword( "DONE" ) );
    $kw14$METHODS = makeKeyword( "METHODS" );
    $sym15$DO_GAFS_POTENTIALLY_MATCHING_FORMULA = makeSymbol( "DO-GAFS-POTENTIALLY-MATCHING-FORMULA" );
    $sym16$CLET = makeSymbol( "CLET" );
    $list17 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-PROFILING-ON?*" ), T ), ConsesLow.list( makeSymbol( "*SKSI-SQL-QUERY-TIME*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*SKSI-SQL-QUERY-COUNT*" ),
        ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*SKSI-SQL-UPDATE-TIME*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol( "*SKSI-SQL-UPDATE-COUNT*" ), ZERO_INTEGER ), ConsesLow.list( makeSymbol(
            "*SKSI-SQL-BATCH-UPDATE-COUNT*" ), ZERO_INTEGER ) );
    $sym18$START_TIME = makeUninternedSymbol( "START-TIME" );
    $sym19$END_TIME = makeUninternedSymbol( "END-TIME" );
    $sym20$TOTAL_TIME = makeUninternedSymbol( "TOTAL-TIME" );
    $sym21$RESULT = makeUninternedSymbol( "RESULT" );
    $list22 = ConsesLow.list( ConsesLow.list( makeSymbol( "GET-INTERNAL-REAL-TIME" ) ) );
    $sym23$WITH_SKSI_PROFILING_ON = makeSymbol( "WITH-SKSI-PROFILING-ON" );
    $sym24$PROGN = makeSymbol( "PROGN" );
    $sym25$CSETQ = makeSymbol( "CSETQ" );
    $sym26$FORMAT = makeSymbol( "FORMAT" );
    $str27$Result_____A__ = makeString( "Result: ~%~A~%" );
    $sym28$ELAPSED_SECONDS_BETWEEN_INTERNAL_REAL_TIMES = makeSymbol( "ELAPSED-SECONDS-BETWEEN-INTERNAL-REAL-TIMES" );
    $str29$__Query_time____A_sec__ = makeString( "~%Query time : ~A sec~%" );
    $str30$_Cyc_side____A_sec__ = makeString( " Cyc side : ~A sec~%" );
    $sym31$_ = makeSymbol( "-" );
    $list32 = ConsesLow.list( makeSymbol( "*SKSI-SQL-QUERY-TIME*" ) );
    $list33 = ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( " DB side : ~A sec~%" ), makeSymbol( "*SKSI-SQL-QUERY-TIME*" ) );
    $list34 = ConsesLow.list( makeSymbol( "FORMAT" ), T, makeString( " # queries : ~A~%" ), makeSymbol( "*SKSI-SQL-QUERY-COUNT*" ) );
    $str35$___bindings____A__ = makeString( " # bindings : ~A~%" );
    $sym36$FIF = makeSymbol( "FIF" );
    $sym37$CONSP = makeSymbol( "CONSP" );
    $sym38$LIST_LENGTH = makeSymbol( "LIST-LENGTH" );
    $list39 = ConsesLow.list( ZERO_INTEGER );
  }
}
/*
 * 
 * Total time: 108 ms
 * 
 */