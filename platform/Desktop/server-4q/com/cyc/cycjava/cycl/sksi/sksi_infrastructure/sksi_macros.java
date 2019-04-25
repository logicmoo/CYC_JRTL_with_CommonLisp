package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.cycjava.cycl.sdbc;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_macros
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros";
  public static final String myFingerPrint = "1deb4b9f6ef48995adf22d6afc19b0b785c4f85f1a827014d65a66f556e2f800";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLSymbol $sksi_crm_only_total_subclause_specs_relevantP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLSymbol $sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLSymbol $sksi_default_ms_type_check_strength$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3218L)
  public static SubLSymbol $spreadsheet_sksi_conjunctive_query_table_name_list$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
  public static SubLSymbol $sksi_slrm_genl_pred_and_genls_reasoning_onP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 5095L)
  public static SubLSymbol $sksi_sql_connection_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 5297L)
  public static SubLSymbol $sksi_sql_statement_cache$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 5353L)
  public static SubLSymbol $sksi_sql_statement_pool_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  private static SubLSymbol $sksi_connections_for_sks$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 12013L)
  public static SubLSymbol $within_sksi_sandboxP$;
  private static final SubLSymbol $kw0$WEAK;
  private static final SubLList $list1;
  private static final SubLSymbol $sym2$CLET;
  private static final SubLSymbol $sym3$_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH_;
  private static final SubLSymbol $sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH;
  private static final SubLSymbol $kw5$STRICT;
  private static final SubLList $list6;
  private static final SubLList $list7;
  private static final SubLList $list8;
  private static final SubLList $list9;
  private static final SubLList $list10;
  private static final SubLSymbol $sym11$_SPREADSHEET_SKSI_CONJUNCTIVE_QUERY_TABLE_NAME_LIST_;
  private static final SubLList $list12;
  private static final SubLList $list13;
  private static final SubLList $list14;
  private static final SubLList $list15;
  private static final SubLSymbol $kw16$CYC_SKSI;
  private static final SubLSymbol $sym17$RESOURCING_CACHES_FINALIZED_;
  private static final SubLSymbol $sym18$PIF;
  private static final SubLList $list19;
  private static final SubLSymbol $sym20$PROGN;
  private static final SubLList $list21;
  private static final SubLList $list22;
  private static final SubLList $list23;
  private static final SubLSymbol $sym24$CUNWIND_PROTECT;
  private static final SubLSymbol $sym25$CSETQ;
  private static final SubLList $list26;
  private static final SubLSymbol $sym27$PUNLESS;
  private static final SubLList $list28;
  private static final SubLSymbol $sym29$CMULTIPLE_VALUE_BIND;
  private static final SubLSymbol $sym30$GET_SQL_CONNECTION_AND_STATEMENT;
  private static final SubLSymbol $sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD;
  private static final SubLSymbol $sym32$WITH_SKSI_CONNECTION_TO_SKS;
  private static final SubLSymbol $sym33$SKS_P;
  private static final SubLSymbol $sym34$SQL_CONNECTION_P;
  private static final SubLSymbol $sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE;
  private static final SubLSymbol $sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET;
  private static final SubLList $list37;
  private static final SubLSymbol $sym38$ACCESS_PATH;
  private static final SubLSymbol $sym39$CLOSE_CONNECTION_;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$SQL_OPEN_CONNECTION_P;
  private static final SubLList $list42;
  private static final SubLSymbol $sym43$WITH_ALL_MTS;
  private static final SubLSymbol $sym44$EXTERNAL_SOURCE_ACCESS_PATH;
  private static final SubLList $list45;
  private static final SubLSymbol $sym46$ACCESS_PATH_P;
  private static final SubLSymbol $sym47$ERROR;
  private static final SubLString $str48$Problem_connecting_to_sks__A__cou;
  private static final SubLSymbol $sym49$OPEN_SQL_SOURCE;
  private static final SubLList $list50;
  private static final SubLString $str51$Problem_opening_connection_to_sks;
  private static final SubLSymbol $sym52$PWHEN;
  private static final SubLSymbol $sym53$SQLC_CLOSE;
  private static final SubLList $list54;
  private static final SubLSymbol $sym55$ACCESS_PATH_VAR;
  private static final SubLSymbol $sym56$MUST;
  private static final SubLString $str57$Problem_opening_connection_to_dat;
  private static final SubLList $list58;
  private static final SubLSymbol $sym59$DB;
  private static final SubLSymbol $sym60$USER;
  private static final SubLSymbol $sym61$PASSWORD;
  private static final SubLSymbol $sym62$SERVER;
  private static final SubLSymbol $sym63$PORT;
  private static final SubLSymbol $sym64$PROXY_SERVER;
  private static final SubLSymbol $sym65$PROXY_PORT;
  private static final SubLSymbol $sym66$SUBPROTOCOL;
  private static final SubLSymbol $sym67$TIMEOUT;
  private static final SubLSymbol $sym68$CONN_SERVER;
  private static final SubLSymbol $sym69$CONN_PORT;
  private static final SubLSymbol $sym70$CONN_TIMEOUT;
  private static final SubLSymbol $sym71$ACCESS_PATH_DB;
  private static final SubLSymbol $sym72$ACCESS_PATH_USER;
  private static final SubLSymbol $sym73$ACCESS_PATH_PASSWORD;
  private static final SubLSymbol $sym74$ACCESS_PATH_SERVER;
  private static final SubLSymbol $sym75$ACCESS_PATH_PORT;
  private static final SubLSymbol $sym76$ACCESS_PATH_PROXY_SERVER;
  private static final SubLSymbol $sym77$ACCESS_PATH_PROXY_PORT;
  private static final SubLSymbol $sym78$ACCESS_PATH_SUBPROTOCOL;
  private static final SubLSymbol $sym79$ACCESS_PATH_TIMEOUT;
  private static final SubLSymbol $sym80$FIRST_OF;
  private static final SubLList $list81;
  private static final SubLSymbol $sym82$WITH_SQL_TRANSACTION;
  private static final SubLSymbol $kw83$DBMS_SERVER;
  private static final SubLSymbol $kw84$PORT;
  private static final SubLSymbol $kw85$SUBPROTOCOL;
  private static final SubLSymbol $kw86$PROXY_SERVER;
  private static final SubLSymbol $kw87$TIMEOUT;
  private static final SubLSymbol $sym88$STATE;
  private static final SubLList $list89;
  private static final SubLList $list90;
  private static final SubLSymbol $sym91$EXECUTE_SKS_REGISTRATION_STATE;
  private static final SubLSymbol $sym92$ALREADY_IN_A_SANDBOX_;
  private static final SubLSymbol $sym93$STATE;
  private static final SubLList $list94;
  private static final SubLSymbol $sym95$FUNLESS;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_default_ms_type_check_strength(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject strength = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    strength = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym3$_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH_, strength ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, $kw0$WEAK, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject without_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, $kw5$STRICT, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_crm_full_applicability(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list6, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_crm_restricted_applicability(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list7, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_asserted_joinability(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list8, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
  public static SubLObject with_sksi_deduced_joinability(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list9, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3437L)
  public static SubLObject with_spreadsheet_sksi_conjunctive_query_table_name_list(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject table_names = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list10 );
    table_names = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym2$CLET, ConsesLow.list( ConsesLow.list( $sym11$_SPREADSHEET_SKSI_CONJUNCTIVE_QUERY_TABLE_NAME_LIST_, table_names ) ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
  public static SubLObject sksi_slrm_genl_pred_and_genls_reasoning_onP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $sksi_slrm_genl_pred_and_genls_reasoning_onP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
  public static SubLObject with_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list12, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
  public static SubLObject without_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list13, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4689L)
  public static SubLObject with_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list14, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4963L)
  public static SubLObject without_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.listS( $sym2$CLET, $list15, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 5413L)
  public static SubLObject with_sksi_sql_connection_resourcing(final SubLObject macroform, final SubLObject environment)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    if( NIL != Sequences.find( $kw16$CYC_SKSI, reader.$features$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject resourcing_caches_finalizedP = $sym17$RESOURCING_CACHES_FINALIZED_;
      return ConsesLow.list( $sym18$PIF, $list19, reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym2$CLET, ConsesLow.list( $list21, $list22, $list23, resourcing_caches_finalizedP ),
          ConsesLow.list( $sym24$CUNWIND_PROTECT, reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym24$CUNWIND_PROTECT, ConsesLow.listS( $sym25$CSETQ, resourcing_caches_finalizedP,
              $list26 ), ConsesLow.listS( $sym27$PUNLESS, resourcing_caches_finalizedP, $list26 ) ) ) ) );
    }
    return reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 6510L)
  public static SubLObject with_sksi_sql_connection_and_statement(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject connection = NIL;
    SubLObject statement = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    connection = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
    statement = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject access_path = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list28 );
      access_path = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      return ConsesLow.listS( $sym29$CMULTIPLE_VALUE_BIND, ConsesLow.list( connection, statement ), ConsesLow.list( $sym30$GET_SQL_CONNECTION_AND_STATEMENT, access_path ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list28 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  public static SubLObject sksi_connections_for_sks_cache_add(final SubLObject sks, final SubLObject connection)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    assert NIL != sdbc.sql_connection_p( connection ) : connection;
    return Hashtables.sethash( sksi_sks_accessors.sks_get_top_sks( sks ), $sksi_connections_for_sks$.getDynamicValue( thread ), connection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  public static SubLObject sksi_connections_for_sks_cache_remove(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    return Hashtables.remhash( sksi_sks_accessors.sks_get_top_sks( sks ), $sksi_connections_for_sks$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  public static SubLObject sksi_connections_for_sks_cache_get(final SubLObject sks)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != sksi_sks_accessors.sks_p( sks ) : sks;
    final SubLObject top_sks = sksi_sks_accessors.sks_get_top_sks( sks );
    final SubLObject connection = Hashtables.gethash( top_sks, $sksi_connections_for_sks$.getDynamicValue( thread ), UNPROVIDED );
    if( NIL != sdbc.sql_open_connection_p( connection ) )
    {
      return connection;
    }
    if( NIL != sdbc.sql_connection_p( connection ) )
    {
      sksi_connections_for_sks_cache_remove( top_sks );
      return NIL;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  public static SubLObject with_sksi_connection_to_sks(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject connection = NIL;
    SubLObject sks = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    connection = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list37 );
    sks = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject access_path = $sym38$ACCESS_PATH;
      final SubLObject close_connectionP = $sym39$CLOSE_CONNECTION_;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( $list40, connection, close_connectionP ), ConsesLow.list( $sym24$CUNWIND_PROTECT, ConsesLow.listS( $sym20$PROGN, ConsesLow.list( $sym25$CSETQ, connection,
          ConsesLow.list( $sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, sks ) ), ConsesLow.list( $sym27$PUNLESS, ConsesLow.list( $sym41$SQL_OPEN_CONNECTION_P, connection ), ConsesLow.listS( $sym25$CSETQ, close_connectionP,
              $list42 ), ConsesLow.list( $sym2$CLET, ConsesLow.list( access_path ), ConsesLow.list( $sym43$WITH_ALL_MTS, ConsesLow.list( $sym25$CSETQ, access_path, ConsesLow.listS( $sym44$EXTERNAL_SOURCE_ACCESS_PATH,
                  sks, $list45 ) ) ), ConsesLow.list( $sym27$PUNLESS, ConsesLow.list( $sym46$ACCESS_PATH_P, access_path ), ConsesLow.list( $sym47$ERROR, $str48$Problem_connecting_to_sks__A__cou, sks ) ), ConsesLow.list(
                      $sym25$CSETQ, connection, ConsesLow.listS( $sym49$OPEN_SQL_SOURCE, access_path, $list50 ) ) ), ConsesLow.list( $sym27$PUNLESS, ConsesLow.list( $sym41$SQL_OPEN_CONNECTION_P, connection ), ConsesLow
                          .list( $sym47$ERROR, $str51$Problem_opening_connection_to_sks, sks ) ), ConsesLow.list( $sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, sks, connection ) ), ConsesLow.append( body, NIL ) ), ConsesLow
                              .list( $sym52$PWHEN, close_connectionP, ConsesLow.list( $sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, sks ), ConsesLow.list( $sym52$PWHEN, ConsesLow.list( $sym41$SQL_OPEN_CONNECTION_P,
                                  connection ), ConsesLow.list( $sym53$SQLC_CLOSE, connection ) ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list37 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
  public static SubLObject with_sql_connection_to_access_path(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject connection = NIL;
    SubLObject access_path = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    connection = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list54 );
    access_path = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      final SubLObject access_path_var = $sym55$ACCESS_PATH_VAR;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( ConsesLow.list( access_path_var, access_path ), connection ), ConsesLow.list( $sym24$CUNWIND_PROTECT, ConsesLow.listS( $sym20$PROGN, ConsesLow.list( $sym25$CSETQ,
          connection, ConsesLow.list( $sym49$OPEN_SQL_SOURCE, access_path_var ) ), ConsesLow.list( $sym56$MUST, ConsesLow.list( $sym41$SQL_OPEN_CONNECTION_P, connection ), $str57$Problem_opening_connection_to_dat,
              access_path_var ), ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym52$PWHEN, ConsesLow.list( $sym41$SQL_OPEN_CONNECTION_P, connection ), ConsesLow.list( $sym53$SQLC_CLOSE, connection ) ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list54 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 9973L)
  public static SubLObject with_sksi_sql_transaction(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject statement = NIL;
    SubLObject error = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    statement = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
    error = current.first();
    current = current.rest();
    if( NIL == current )
    {
      current = temp;
      SubLObject access_path = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list58 );
      access_path = current.first();
      final SubLObject body;
      current = ( body = current.rest() );
      final SubLObject db = $sym59$DB;
      final SubLObject user = $sym60$USER;
      final SubLObject password = $sym61$PASSWORD;
      final SubLObject server = $sym62$SERVER;
      final SubLObject port = $sym63$PORT;
      final SubLObject proxy_server = $sym64$PROXY_SERVER;
      final SubLObject proxy_port = $sym65$PROXY_PORT;
      final SubLObject subprotocol = $sym66$SUBPROTOCOL;
      final SubLObject timeout = $sym67$TIMEOUT;
      final SubLObject conn_server = $sym68$CONN_SERVER;
      final SubLObject conn_port = $sym69$CONN_PORT;
      final SubLObject conn_timeout = $sym70$CONN_TIMEOUT;
      return ConsesLow.list( $sym2$CLET, ConsesLow.list( new SubLObject[] { ConsesLow.list( db, ConsesLow.list( $sym71$ACCESS_PATH_DB, access_path ) ), ConsesLow.list( user, ConsesLow.list( $sym72$ACCESS_PATH_USER,
          access_path ) ), ConsesLow.list( password, ConsesLow.list( $sym73$ACCESS_PATH_PASSWORD, access_path ) ), ConsesLow.list( server, ConsesLow.list( $sym74$ACCESS_PATH_SERVER, access_path ) ), ConsesLow.list( port,
              ConsesLow.list( $sym75$ACCESS_PATH_PORT, access_path ) ), ConsesLow.list( proxy_server, ConsesLow.list( $sym76$ACCESS_PATH_PROXY_SERVER, access_path ) ), ConsesLow.list( proxy_port, ConsesLow.list(
                  $sym77$ACCESS_PATH_PROXY_PORT, access_path ) ), ConsesLow.list( subprotocol, ConsesLow.list( $sym78$ACCESS_PATH_SUBPROTOCOL, access_path ) ), ConsesLow.list( timeout, ConsesLow.list(
                      $sym79$ACCESS_PATH_TIMEOUT, access_path ) ), ConsesLow.list( conn_server, ConsesLow.list( $sym80$FIRST_OF, proxy_server, server ) ), ConsesLow.list( conn_port, ConsesLow.list( $sym80$FIRST_OF,
                          proxy_port, port ) ), ConsesLow.list( conn_timeout, ConsesLow.listS( $sym80$FIRST_OF, timeout, $list81 ) )
      } ), ConsesLow.listS( $sym82$WITH_SQL_TRANSACTION, ConsesLow.list( new SubLObject[] { statement, error, db, user, password, $kw83$DBMS_SERVER, server, $kw84$PORT, conn_port, $kw85$SUBPROTOCOL, subprotocol,
        $kw86$PROXY_SERVER, conn_server, $kw87$TIMEOUT, conn_timeout
      } ), ConsesLow.append( body, NIL ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 12123L)
  public static SubLObject with_sksi_sandbox(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject state = $sym88$STATE;
    return ConsesLow.list( $sym2$CLET, reader.bq_cons( reader.bq_cons( state, $list89 ), $list90 ), ConsesLow.list( $sym24$CUNWIND_PROTECT, reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list(
        $sym91$EXECUTE_SKS_REGISTRATION_STATE, state ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 12607L)
  public static SubLObject possibly_with_sksi_sandbox(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    final SubLObject already_in_a_sandboxP = $sym92$ALREADY_IN_A_SANDBOX_;
    final SubLObject state = $sym93$STATE;
    return ConsesLow.list( $sym2$CLET, ConsesLow.listS( reader.bq_cons( already_in_a_sandboxP, $list94 ), ConsesLow.list( state, ConsesLow.listS( $sym95$FUNLESS, already_in_a_sandboxP, $list89 ) ), $list90 ), ConsesLow
        .list( $sym24$CUNWIND_PROTECT, reader.bq_cons( $sym20$PROGN, ConsesLow.append( body, NIL ) ), ConsesLow.list( $sym27$PUNLESS, already_in_a_sandboxP, ConsesLow.list( $sym91$EXECUTE_SKS_REGISTRATION_STATE,
            state ) ) ) );
  }

  public static SubLObject declare_sksi_macros_file()
  {
    SubLFiles.declareMacro( me, "with_sksi_default_ms_type_check_strength", "WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH" );
    SubLFiles.declareMacro( me, "with_sksi_crm_genl_pred_and_genls_reasoning", "WITH-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING" );
    SubLFiles.declareMacro( me, "without_sksi_crm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING" );
    SubLFiles.declareMacro( me, "with_sksi_crm_full_applicability", "WITH-SKSI-CRM-FULL-APPLICABILITY" );
    SubLFiles.declareMacro( me, "with_sksi_crm_restricted_applicability", "WITH-SKSI-CRM-RESTRICTED-APPLICABILITY" );
    SubLFiles.declareMacro( me, "with_sksi_asserted_joinability", "WITH-SKSI-ASSERTED-JOINABILITY" );
    SubLFiles.declareMacro( me, "with_sksi_deduced_joinability", "WITH-SKSI-DEDUCED-JOINABILITY" );
    SubLFiles.declareMacro( me, "with_spreadsheet_sksi_conjunctive_query_table_name_list", "WITH-SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST" );
    SubLFiles.declareFunction( me, "sksi_slrm_genl_pred_and_genls_reasoning_onP", "SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?", 0, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_slrm_genl_pred_and_genls_reasoning", "WITH-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING" );
    SubLFiles.declareMacro( me, "without_sksi_slrm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING" );
    SubLFiles.declareMacro( me, "with_sksi_reformulation_caching", "WITH-SKSI-REFORMULATION-CACHING" );
    SubLFiles.declareMacro( me, "without_sksi_reformulation_caching", "WITHOUT-SKSI-REFORMULATION-CACHING" );
    SubLFiles.declareMacro( me, "with_sksi_sql_connection_resourcing", "WITH-SKSI-SQL-CONNECTION-RESOURCING" );
    SubLFiles.declareMacro( me, "with_sksi_sql_connection_and_statement", "WITH-SKSI-SQL-CONNECTION-AND-STATEMENT" );
    SubLFiles.declareFunction( me, "sksi_connections_for_sks_cache_add", "SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD", 2, 0, false );
    SubLFiles.declareFunction( me, "sksi_connections_for_sks_cache_remove", "SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE", 1, 0, false );
    SubLFiles.declareFunction( me, "sksi_connections_for_sks_cache_get", "SKSI-CONNECTIONS-FOR-SKS-CACHE-GET", 1, 0, false );
    SubLFiles.declareMacro( me, "with_sksi_connection_to_sks", "WITH-SKSI-CONNECTION-TO-SKS" );
    SubLFiles.declareMacro( me, "with_sql_connection_to_access_path", "WITH-SQL-CONNECTION-TO-ACCESS-PATH" );
    SubLFiles.declareMacro( me, "with_sksi_sql_transaction", "WITH-SKSI-SQL-TRANSACTION" );
    SubLFiles.declareMacro( me, "with_sksi_sandbox", "WITH-SKSI-SANDBOX" );
    SubLFiles.declareMacro( me, "possibly_with_sksi_sandbox", "POSSIBLY-WITH-SKSI-SANDBOX" );
    return NIL;
  }

  public static SubLObject init_sksi_macros_file()
  {
    $sksi_crm_only_total_subclause_specs_relevantP$ = SubLFiles.defparameter( "*SKSI-CRM-ONLY-TOTAL-SUBCLAUSE-SPECS-RELEVANT?*", NIL );
    $sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$ = SubLFiles.defparameter( "*SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-MINIMUM-CANDIDATE-LITERAL-COUNT*", TWO_INTEGER );
    $sksi_default_ms_type_check_strength$ = SubLFiles.defparameter( "*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*", $kw0$WEAK );
    $spreadsheet_sksi_conjunctive_query_table_name_list$ = SubLFiles.defparameter( "*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*", NIL );
    $sksi_slrm_genl_pred_and_genls_reasoning_onP$ = SubLFiles.defparameter( "*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*", T );
    $sksi_sql_connection_cache$ = SubLFiles.defparameter( "*SKSI-SQL-CONNECTION-CACHE*", NIL );
    $sksi_sql_statement_cache$ = SubLFiles.defparameter( "*SKSI-SQL-STATEMENT-CACHE*", NIL );
    $sksi_sql_statement_pool_lock$ = SubLFiles.defparameter( "*SKSI-SQL-STATEMENT-POOL-LOCK*", NIL );
    $sksi_connections_for_sks$ = SubLFiles.defparameter( "*SKSI-CONNECTIONS-FOR-SKS*", Hashtables.make_hash_table( SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED ) );
    $within_sksi_sandboxP$ = SubLFiles.defparameter( "*WITHIN-SKSI-SANDBOX?*", NIL );
    return NIL;
  }

  public static SubLObject setup_sksi_macros_file()
  {
    access_macros.register_macro_helper( $sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, $sym32$WITH_SKSI_CONNECTION_TO_SKS );
    access_macros.register_macro_helper( $sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, $sym32$WITH_SKSI_CONNECTION_TO_SKS );
    access_macros.register_macro_helper( $sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, $sym32$WITH_SKSI_CONNECTION_TO_SKS );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_sksi_macros_file();
  }

  @Override
  public void initializeVariables()
  {
    init_sksi_macros_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_sksi_macros_file();
  }
  static
  {
    me = new sksi_macros();
    $sksi_crm_only_total_subclause_specs_relevantP$ = null;
    $sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$ = null;
    $sksi_default_ms_type_check_strength$ = null;
    $spreadsheet_sksi_conjunctive_query_table_name_list$ = null;
    $sksi_slrm_genl_pred_and_genls_reasoning_onP$ = null;
    $sksi_sql_connection_cache$ = null;
    $sksi_sql_statement_cache$ = null;
    $sksi_sql_statement_pool_lock$ = null;
    $sksi_connections_for_sks$ = null;
    $within_sksi_sandboxP$ = null;
    $kw0$WEAK = makeKeyword( "WEAK" );
    $list1 = ConsesLow.list( makeSymbol( "STRENGTH" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym2$CLET = makeSymbol( "CLET" );
    $sym3$_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH_ = makeSymbol( "*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*" );
    $sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH = makeSymbol( "WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH" );
    $kw5$STRICT = makeKeyword( "STRICT" );
    $list6 = ConsesLow.list( ConsesLow.list( makeSymbol( "*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*" ), NIL ) );
    $list7 = ConsesLow.list( ConsesLow.list( makeSymbol( "*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*" ), T ) );
    $list8 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-ASSERTED-JOINABILITY?*" ), T ) );
    $list9 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-ASSERTED-JOINABILITY?*" ), NIL ) );
    $list10 = ConsesLow.list( makeSymbol( "TABLE-NAMES" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym11$_SPREADSHEET_SKSI_CONJUNCTIVE_QUERY_TABLE_NAME_LIST_ = makeSymbol( "*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*" );
    $list12 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*" ), T ) );
    $list13 = ConsesLow.list( ConsesLow.list( makeSymbol( "*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*" ), NIL ) );
    $list14 = ConsesLow.list( ConsesLow.list( makeSymbol( "*MEMOIZE-SKSI-REFORMULATE?*" ), T ) );
    $list15 = ConsesLow.list( ConsesLow.list( makeSymbol( "*MEMOIZE-SKSI-REFORMULATE?*" ), NIL ) );
    $kw16$CYC_SKSI = makeKeyword( "CYC-SKSI" );
    $sym17$RESOURCING_CACHES_FINALIZED_ = makeUninternedSymbol( "RESOURCING-CACHES-FINALIZED?" );
    $sym18$PIF = makeSymbol( "PIF" );
    $list19 = ConsesLow.list( makeSymbol( "WITHIN-SKSI-SQL-CONNECTION-RESOURCING?" ) );
    $sym20$PROGN = makeSymbol( "PROGN" );
    $list21 = ConsesLow.list( makeSymbol( "*SKSI-SQL-CONNECTION-CACHE*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQUALP ) ) );
    $list22 = ConsesLow.list( makeSymbol( "*SKSI-SQL-STATEMENT-CACHE*" ), ConsesLow.list( makeSymbol( "NEW-DICTIONARY" ), ConsesLow.list( makeSymbol( "FUNCTION" ), EQ ) ) );
    $list23 = ConsesLow.list( makeSymbol( "*SKSI-SQL-STATEMENT-POOL-LOCK*" ), ConsesLow.list( makeSymbol( "MAKE-LOCK" ), ConsesLow.list( makeSymbol( "STRING" ), ConsesLow.list( makeSymbol( "GENSYM" ), makeString(
        "SKSI SQL statement cache " ) ) ) ) );
    $sym24$CUNWIND_PROTECT = makeSymbol( "CUNWIND-PROTECT" );
    $sym25$CSETQ = makeSymbol( "CSETQ" );
    $list26 = ConsesLow.list( ConsesLow.list( makeSymbol( "FINALIZE-SQL-CONNECTION-AND-STATEMENT-CACHE" ) ) );
    $sym27$PUNLESS = makeSymbol( "PUNLESS" );
    $list28 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "STATEMENT" ) ), makeSymbol( "ACCESS-PATH" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym29$CMULTIPLE_VALUE_BIND = makeSymbol( "CMULTIPLE-VALUE-BIND" );
    $sym30$GET_SQL_CONNECTION_AND_STATEMENT = makeSymbol( "GET-SQL-CONNECTION-AND-STATEMENT" );
    $sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD = makeSymbol( "SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD" );
    $sym32$WITH_SKSI_CONNECTION_TO_SKS = makeSymbol( "WITH-SKSI-CONNECTION-TO-SKS" );
    $sym33$SKS_P = makeSymbol( "SKS-P" );
    $sym34$SQL_CONNECTION_P = makeSymbol( "SQL-CONNECTION-P" );
    $sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE = makeSymbol( "SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE" );
    $sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET = makeSymbol( "SKSI-CONNECTIONS-FOR-SKS-CACHE-GET" );
    $list37 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "SKS" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym38$ACCESS_PATH = makeUninternedSymbol( "ACCESS-PATH" );
    $sym39$CLOSE_CONNECTION_ = makeUninternedSymbol( "CLOSE-CONNECTION?" );
    $list40 = ConsesLow.list( makeSymbol( "*SKSI-GLOBAL-RESOURCING?*" ), NIL );
    $sym41$SQL_OPEN_CONNECTION_P = makeSymbol( "SQL-OPEN-CONNECTION-P" );
    $list42 = ConsesLow.list( T );
    $sym43$WITH_ALL_MTS = makeSymbol( "WITH-ALL-MTS" );
    $sym44$EXTERNAL_SOURCE_ACCESS_PATH = makeSymbol( "EXTERNAL-SOURCE-ACCESS-PATH" );
    $list45 = ConsesLow.list( NIL );
    $sym46$ACCESS_PATH_P = makeSymbol( "ACCESS-PATH-P" );
    $sym47$ERROR = makeSymbol( "ERROR" );
    $str48$Problem_connecting_to_sks__A__cou = makeString( "Problem connecting to sks ~A--couldn't determine access path." );
    $sym49$OPEN_SQL_SOURCE = makeSymbol( "OPEN-SQL-SOURCE" );
    $list50 = ConsesLow.list( ONE_INTEGER );
    $str51$Problem_opening_connection_to_sks = makeString( "Problem opening connection to sks ~A." );
    $sym52$PWHEN = makeSymbol( "PWHEN" );
    $sym53$SQLC_CLOSE = makeSymbol( "SQLC-CLOSE" );
    $list54 = ConsesLow.list( ConsesLow.list( makeSymbol( "CONNECTION" ), makeSymbol( "ACCESS-PATH" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym55$ACCESS_PATH_VAR = makeUninternedSymbol( "ACCESS-PATH-VAR" );
    $sym56$MUST = makeSymbol( "MUST" );
    $str57$Problem_opening_connection_to_dat = makeString( "Problem opening connection to database ~s" );
    $list58 = ConsesLow.list( ConsesLow.list( makeSymbol( "STATEMENT" ), makeSymbol( "ERROR" ) ), makeSymbol( "ACCESS-PATH" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym59$DB = makeUninternedSymbol( "DB" );
    $sym60$USER = makeUninternedSymbol( "USER" );
    $sym61$PASSWORD = makeUninternedSymbol( "PASSWORD" );
    $sym62$SERVER = makeUninternedSymbol( "SERVER" );
    $sym63$PORT = makeUninternedSymbol( "PORT" );
    $sym64$PROXY_SERVER = makeUninternedSymbol( "PROXY-SERVER" );
    $sym65$PROXY_PORT = makeUninternedSymbol( "PROXY-PORT" );
    $sym66$SUBPROTOCOL = makeUninternedSymbol( "SUBPROTOCOL" );
    $sym67$TIMEOUT = makeUninternedSymbol( "TIMEOUT" );
    $sym68$CONN_SERVER = makeUninternedSymbol( "CONN-SERVER" );
    $sym69$CONN_PORT = makeUninternedSymbol( "CONN-PORT" );
    $sym70$CONN_TIMEOUT = makeUninternedSymbol( "CONN-TIMEOUT" );
    $sym71$ACCESS_PATH_DB = makeSymbol( "ACCESS-PATH-DB" );
    $sym72$ACCESS_PATH_USER = makeSymbol( "ACCESS-PATH-USER" );
    $sym73$ACCESS_PATH_PASSWORD = makeSymbol( "ACCESS-PATH-PASSWORD" );
    $sym74$ACCESS_PATH_SERVER = makeSymbol( "ACCESS-PATH-SERVER" );
    $sym75$ACCESS_PATH_PORT = makeSymbol( "ACCESS-PATH-PORT" );
    $sym76$ACCESS_PATH_PROXY_SERVER = makeSymbol( "ACCESS-PATH-PROXY-SERVER" );
    $sym77$ACCESS_PATH_PROXY_PORT = makeSymbol( "ACCESS-PATH-PROXY-PORT" );
    $sym78$ACCESS_PATH_SUBPROTOCOL = makeSymbol( "ACCESS-PATH-SUBPROTOCOL" );
    $sym79$ACCESS_PATH_TIMEOUT = makeSymbol( "ACCESS-PATH-TIMEOUT" );
    $sym80$FIRST_OF = makeSymbol( "FIRST-OF" );
    $list81 = ConsesLow.list( makeSymbol( "*SKSI-OPEN-SQL-CONNECTION-DEFAULT-TIMEOUT*" ) );
    $sym82$WITH_SQL_TRANSACTION = makeSymbol( "WITH-SQL-TRANSACTION" );
    $kw83$DBMS_SERVER = makeKeyword( "DBMS-SERVER" );
    $kw84$PORT = makeKeyword( "PORT" );
    $kw85$SUBPROTOCOL = makeKeyword( "SUBPROTOCOL" );
    $kw86$PROXY_SERVER = makeKeyword( "PROXY-SERVER" );
    $kw87$TIMEOUT = makeKeyword( "TIMEOUT" );
    $sym88$STATE = makeUninternedSymbol( "STATE" );
    $list89 = ConsesLow.list( ConsesLow.list( makeSymbol( "CURRENT-SKS-REGISTRATION-STATE" ) ) );
    $list90 = ConsesLow.list( ConsesLow.list( makeSymbol( "*WITHIN-SKSI-SANDBOX?*" ), T ) );
    $sym91$EXECUTE_SKS_REGISTRATION_STATE = makeSymbol( "EXECUTE-SKS-REGISTRATION-STATE" );
    $sym92$ALREADY_IN_A_SANDBOX_ = makeUninternedSymbol( "ALREADY-IN-A-SANDBOX?" );
    $sym93$STATE = makeUninternedSymbol( "STATE" );
    $list94 = ConsesLow.list( makeSymbol( "*WITHIN-SKSI-SANDBOX?*" ) );
    $sym95$FUNLESS = makeSymbol( "FUNLESS" );
  }
}
/*
 * 
 * Total time: 160 ms
 * 
 */