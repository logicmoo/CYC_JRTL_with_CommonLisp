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

public final class sksi_macros extends SubLTranslatedFile
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
    public static SubLObject with_sksi_default_ms_type_check_strength(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strength = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list1);
        strength = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym3$_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH_, strength)), ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject with_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, (SubLObject)sksi_macros.$kw0$WEAK, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject without_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, (SubLObject)sksi_macros.$kw5$STRICT, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject with_sksi_crm_full_applicability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list6, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject with_sksi_crm_restricted_applicability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list7, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject with_sksi_asserted_joinability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list8, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 1207L)
    public static SubLObject with_sksi_deduced_joinability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list9, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3437L)
    public static SubLObject with_spreadsheet_sksi_conjunctive_query_table_name_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table_names = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list10);
        table_names = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym11$_SPREADSHEET_SKSI_CONJUNCTIVE_QUERY_TABLE_NAME_LIST_, table_names)), ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
    public static SubLObject sksi_slrm_genl_pred_and_genls_reasoning_onP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_macros.$sksi_slrm_genl_pred_and_genls_reasoning_onP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
    public static SubLObject with_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list12, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 3638L)
    public static SubLObject without_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list13, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4689L)
    public static SubLObject with_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list14, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 4963L)
    public static SubLObject without_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)sksi_macros.$list15, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 5413L)
    public static SubLObject with_sksi_sql_connection_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (sksi_macros.NIL != Sequences.find((SubLObject)sksi_macros.$kw16$CYC_SKSI, reader.$features$.getDynamicValue(thread), (SubLObject)sksi_macros.UNPROVIDED, (SubLObject)sksi_macros.UNPROVIDED, (SubLObject)sksi_macros.UNPROVIDED, (SubLObject)sksi_macros.UNPROVIDED)) {
            final SubLObject resourcing_caches_finalizedP = (SubLObject)sksi_macros.$sym17$RESOURCING_CACHES_FINALIZED_;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym18$PIF, (SubLObject)sksi_macros.$list19, reader.bq_cons((SubLObject)sksi_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$list21, (SubLObject)sksi_macros.$list22, (SubLObject)sksi_macros.$list23, resourcing_caches_finalizedP), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sksi_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym25$CSETQ, resourcing_caches_finalizedP, (SubLObject)sksi_macros.$list26), (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym27$PUNLESS, resourcing_caches_finalizedP, (SubLObject)sksi_macros.$list26)))));
        }
        return reader.bq_cons((SubLObject)sksi_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 6510L)
    public static SubLObject with_sksi_sql_connection_and_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = (SubLObject)sksi_macros.NIL;
        SubLObject statement = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list28);
        connection = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list28);
        statement = current.first();
        current = current.rest();
        if (sksi_macros.NIL == current) {
            current = temp;
            SubLObject access_path = (SubLObject)sksi_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list28);
            access_path = current.first();
            final SubLObject body;
            current = (body = current.rest());
            return (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym29$CMULTIPLE_VALUE_BIND, (SubLObject)ConsesLow.list(connection, statement), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym30$GET_SQL_CONNECTION_AND_STATEMENT, access_path), ConsesLow.append(body, (SubLObject)sksi_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_macros.$list28);
        return (SubLObject)sksi_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
    public static SubLObject sksi_connections_for_sks_cache_add(final SubLObject sks, final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_macros.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        assert sksi_macros.NIL != sdbc.sql_connection_p(connection) : connection;
        return Hashtables.sethash(sksi_sks_accessors.sks_get_top_sks(sks), sksi_macros.$sksi_connections_for_sks$.getDynamicValue(thread), connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
    public static SubLObject sksi_connections_for_sks_cache_remove(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_macros.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        return Hashtables.remhash(sksi_sks_accessors.sks_get_top_sks(sks), sksi_macros.$sksi_connections_for_sks$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
    public static SubLObject sksi_connections_for_sks_cache_get(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_macros.NIL != sksi_sks_accessors.sks_p(sks) : sks;
        final SubLObject top_sks = sksi_sks_accessors.sks_get_top_sks(sks);
        final SubLObject connection = Hashtables.gethash(top_sks, sksi_macros.$sksi_connections_for_sks$.getDynamicValue(thread), (SubLObject)sksi_macros.UNPROVIDED);
        if (sksi_macros.NIL != sdbc.sql_open_connection_p(connection)) {
            return connection;
        }
        if (sksi_macros.NIL != sdbc.sql_connection_p(connection)) {
            sksi_connections_for_sks_cache_remove(top_sks);
            return (SubLObject)sksi_macros.NIL;
        }
        return (SubLObject)sksi_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
    public static SubLObject with_sksi_connection_to_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = (SubLObject)sksi_macros.NIL;
        SubLObject sks = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list37);
        connection = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list37);
        sks = current.first();
        current = current.rest();
        if (sksi_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject access_path = (SubLObject)sksi_macros.$sym38$ACCESS_PATH;
            final SubLObject close_connectionP = (SubLObject)sksi_macros.$sym39$CLOSE_CONNECTION_;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$list40, connection, close_connectionP), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym20$PROGN, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym25$CSETQ, connection, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, sks)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym27$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym41$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym25$CSETQ, close_connectionP, (SubLObject)sksi_macros.$list42), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list(access_path), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym43$WITH_ALL_MTS, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym25$CSETQ, access_path, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym44$EXTERNAL_SOURCE_ACCESS_PATH, sks, (SubLObject)sksi_macros.$list45))), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym27$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym46$ACCESS_PATH_P, access_path), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym47$ERROR, (SubLObject)sksi_macros.$str48$Problem_connecting_to_sks__A__cou, sks)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym25$CSETQ, connection, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym49$OPEN_SQL_SOURCE, access_path, (SubLObject)sksi_macros.$list50))), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym27$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym41$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym47$ERROR, (SubLObject)sksi_macros.$str51$Problem_opening_connection_to_sks, sks)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, sks, connection)), ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym52$PWHEN, close_connectionP, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, sks), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym52$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym41$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym53$SQLC_CLOSE, connection)))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_macros.$list37);
        return (SubLObject)sksi_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 7303L)
    public static SubLObject with_sql_connection_to_access_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = (SubLObject)sksi_macros.NIL;
        SubLObject access_path = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list54);
        connection = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list54);
        access_path = current.first();
        current = current.rest();
        if (sksi_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject access_path_var = (SubLObject)sksi_macros.$sym55$ACCESS_PATH_VAR;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(access_path_var, access_path), connection), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym20$PROGN, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym25$CSETQ, connection, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym49$OPEN_SQL_SOURCE, access_path_var)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym56$MUST, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym41$SQL_OPEN_CONNECTION_P, connection), (SubLObject)sksi_macros.$str57$Problem_opening_connection_to_dat, access_path_var), ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym52$PWHEN, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym41$SQL_OPEN_CONNECTION_P, connection), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym53$SQLC_CLOSE, connection))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_macros.$list54);
        return (SubLObject)sksi_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 9973L)
    public static SubLObject with_sksi_sql_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = (SubLObject)sksi_macros.NIL;
        SubLObject error = (SubLObject)sksi_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list58);
        statement = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list58);
        error = current.first();
        current = current.rest();
        if (sksi_macros.NIL == current) {
            current = temp;
            SubLObject access_path = (SubLObject)sksi_macros.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_macros.$list58);
            access_path = current.first();
            final SubLObject body;
            current = (body = current.rest());
            final SubLObject db = (SubLObject)sksi_macros.$sym59$DB;
            final SubLObject user = (SubLObject)sksi_macros.$sym60$USER;
            final SubLObject password = (SubLObject)sksi_macros.$sym61$PASSWORD;
            final SubLObject server = (SubLObject)sksi_macros.$sym62$SERVER;
            final SubLObject port = (SubLObject)sksi_macros.$sym63$PORT;
            final SubLObject proxy_server = (SubLObject)sksi_macros.$sym64$PROXY_SERVER;
            final SubLObject proxy_port = (SubLObject)sksi_macros.$sym65$PROXY_PORT;
            final SubLObject subprotocol = (SubLObject)sksi_macros.$sym66$SUBPROTOCOL;
            final SubLObject timeout = (SubLObject)sksi_macros.$sym67$TIMEOUT;
            final SubLObject conn_server = (SubLObject)sksi_macros.$sym68$CONN_SERVER;
            final SubLObject conn_port = (SubLObject)sksi_macros.$sym69$CONN_PORT;
            final SubLObject conn_timeout = (SubLObject)sksi_macros.$sym70$CONN_TIMEOUT;
            return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.list(db, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym71$ACCESS_PATH_DB, access_path)), ConsesLow.list(user, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym72$ACCESS_PATH_USER, access_path)), ConsesLow.list(password, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym73$ACCESS_PATH_PASSWORD, access_path)), ConsesLow.list(server, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym74$ACCESS_PATH_SERVER, access_path)), ConsesLow.list(port, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym75$ACCESS_PATH_PORT, access_path)), ConsesLow.list(proxy_server, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym76$ACCESS_PATH_PROXY_SERVER, access_path)), ConsesLow.list(proxy_port, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym77$ACCESS_PATH_PROXY_PORT, access_path)), ConsesLow.list(subprotocol, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym78$ACCESS_PATH_SUBPROTOCOL, access_path)), ConsesLow.list(timeout, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym79$ACCESS_PATH_TIMEOUT, access_path)), ConsesLow.list(conn_server, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym80$FIRST_OF, proxy_server, server)), ConsesLow.list(conn_port, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym80$FIRST_OF, proxy_port, port)), ConsesLow.list(conn_timeout, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym80$FIRST_OF, timeout, (SubLObject)sksi_macros.$list81)) }), (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym82$WITH_SQL_TRANSACTION, (SubLObject)ConsesLow.list(new SubLObject[] { statement, error, db, user, password, sksi_macros.$kw83$DBMS_SERVER, server, sksi_macros.$kw84$PORT, conn_port, sksi_macros.$kw85$SUBPROTOCOL, subprotocol, sksi_macros.$kw86$PROXY_SERVER, conn_server, sksi_macros.$kw87$TIMEOUT, conn_timeout }), ConsesLow.append(body, (SubLObject)sksi_macros.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)sksi_macros.$list58);
        return (SubLObject)sksi_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 12123L)
    public static SubLObject with_sksi_sandbox(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = (SubLObject)sksi_macros.$sym88$STATE;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, reader.bq_cons(reader.bq_cons(state, (SubLObject)sksi_macros.$list89), (SubLObject)sksi_macros.$list90), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sksi_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym91$EXECUTE_SKS_REGISTRATION_STATE, state)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-infrastructure/sksi-macros.lisp", position = 12607L)
    public static SubLObject possibly_with_sksi_sandbox(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_in_a_sandboxP = (SubLObject)sksi_macros.$sym92$ALREADY_IN_A_SANDBOX_;
        final SubLObject state = (SubLObject)sksi_macros.$sym93$STATE;
        return (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym2$CLET, (SubLObject)ConsesLow.listS(reader.bq_cons(already_in_a_sandboxP, (SubLObject)sksi_macros.$list94), (SubLObject)ConsesLow.list(state, (SubLObject)ConsesLow.listS((SubLObject)sksi_macros.$sym95$FUNLESS, already_in_a_sandboxP, (SubLObject)sksi_macros.$list89)), (SubLObject)sksi_macros.$list90), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym24$CUNWIND_PROTECT, reader.bq_cons((SubLObject)sksi_macros.$sym20$PROGN, ConsesLow.append(body, (SubLObject)sksi_macros.NIL)), (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym27$PUNLESS, already_in_a_sandboxP, (SubLObject)ConsesLow.list((SubLObject)sksi_macros.$sym91$EXECUTE_SKS_REGISTRATION_STATE, state))));
    }
    
    public static SubLObject declare_sksi_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_default_ms_type_check_strength", "WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_crm_genl_pred_and_genls_reasoning", "WITH-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "without_sksi_crm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_crm_full_applicability", "WITH-SKSI-CRM-FULL-APPLICABILITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_crm_restricted_applicability", "WITH-SKSI-CRM-RESTRICTED-APPLICABILITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_asserted_joinability", "WITH-SKSI-ASSERTED-JOINABILITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_deduced_joinability", "WITH-SKSI-DEDUCED-JOINABILITY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_spreadsheet_sksi_conjunctive_query_table_name_list", "WITH-SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "sksi_slrm_genl_pred_and_genls_reasoning_onP", "SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_slrm_genl_pred_and_genls_reasoning", "WITH-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "without_sksi_slrm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_reformulation_caching", "WITH-SKSI-REFORMULATION-CACHING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "without_sksi_reformulation_caching", "WITHOUT-SKSI-REFORMULATION-CACHING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_sql_connection_resourcing", "WITH-SKSI-SQL-CONNECTION-RESOURCING");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_sql_connection_and_statement", "WITH-SKSI-SQL-CONNECTION-AND-STATEMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "sksi_connections_for_sks_cache_add", "SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "sksi_connections_for_sks_cache_remove", "SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "sksi_connections_for_sks_cache_get", "SKSI-CONNECTIONS-FOR-SKS-CACHE-GET", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_connection_to_sks", "WITH-SKSI-CONNECTION-TO-SKS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sql_connection_to_access_path", "WITH-SQL-CONNECTION-TO-ACCESS-PATH");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_sql_transaction", "WITH-SKSI-SQL-TRANSACTION");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "with_sksi_sandbox", "WITH-SKSI-SANDBOX");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros", "possibly_with_sksi_sandbox", "POSSIBLY-WITH-SKSI-SANDBOX");
        return (SubLObject)sksi_macros.NIL;
    }
    
    public static SubLObject init_sksi_macros_file() {
        sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$ = SubLFiles.defparameter("*SKSI-CRM-ONLY-TOTAL-SUBCLAUSE-SPECS-RELEVANT?*", (SubLObject)sksi_macros.NIL);
        sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$ = SubLFiles.defparameter("*SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-MINIMUM-CANDIDATE-LITERAL-COUNT*", (SubLObject)sksi_macros.TWO_INTEGER);
        sksi_macros.$sksi_default_ms_type_check_strength$ = SubLFiles.defparameter("*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*", (SubLObject)sksi_macros.$kw0$WEAK);
        sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$ = SubLFiles.defparameter("*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*", (SubLObject)sksi_macros.NIL);
        sksi_macros.$sksi_slrm_genl_pred_and_genls_reasoning_onP$ = SubLFiles.defparameter("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*", (SubLObject)sksi_macros.T);
        sksi_macros.$sksi_sql_connection_cache$ = SubLFiles.defparameter("*SKSI-SQL-CONNECTION-CACHE*", (SubLObject)sksi_macros.NIL);
        sksi_macros.$sksi_sql_statement_cache$ = SubLFiles.defparameter("*SKSI-SQL-STATEMENT-CACHE*", (SubLObject)sksi_macros.NIL);
        sksi_macros.$sksi_sql_statement_pool_lock$ = SubLFiles.defparameter("*SKSI-SQL-STATEMENT-POOL-LOCK*", (SubLObject)sksi_macros.NIL);
        sksi_macros.$sksi_connections_for_sks$ = SubLFiles.defparameter("*SKSI-CONNECTIONS-FOR-SKS*", Hashtables.make_hash_table((SubLObject)sksi_macros.SIXTEEN_INTEGER, (SubLObject)sksi_macros.UNPROVIDED, (SubLObject)sksi_macros.UNPROVIDED));
        sksi_macros.$within_sksi_sandboxP$ = SubLFiles.defparameter("*WITHIN-SKSI-SANDBOX?*", (SubLObject)sksi_macros.NIL);
        return (SubLObject)sksi_macros.NIL;
    }
    
    public static SubLObject setup_sksi_macros_file() {
        access_macros.register_macro_helper((SubLObject)sksi_macros.$sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, (SubLObject)sksi_macros.$sym32$WITH_SKSI_CONNECTION_TO_SKS);
        access_macros.register_macro_helper((SubLObject)sksi_macros.$sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, (SubLObject)sksi_macros.$sym32$WITH_SKSI_CONNECTION_TO_SKS);
        access_macros.register_macro_helper((SubLObject)sksi_macros.$sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, (SubLObject)sksi_macros.$sym32$WITH_SKSI_CONNECTION_TO_SKS);
        return (SubLObject)sksi_macros.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_macros_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_macros_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_macros_file();
    }
    
    static {
        me = (SubLFile)new sksi_macros();
        sksi_macros.$sksi_crm_only_total_subclause_specs_relevantP$ = null;
        sksi_macros.$sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$ = null;
        sksi_macros.$sksi_default_ms_type_check_strength$ = null;
        sksi_macros.$spreadsheet_sksi_conjunctive_query_table_name_list$ = null;
        sksi_macros.$sksi_slrm_genl_pred_and_genls_reasoning_onP$ = null;
        sksi_macros.$sksi_sql_connection_cache$ = null;
        sksi_macros.$sksi_sql_statement_cache$ = null;
        sksi_macros.$sksi_sql_statement_pool_lock$ = null;
        sksi_macros.$sksi_connections_for_sks$ = null;
        sksi_macros.$within_sksi_sandboxP$ = null;
        $kw0$WEAK = SubLObjectFactory.makeKeyword("WEAK");
        $list1 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH_ = SubLObjectFactory.makeSymbol("*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*");
        $sym4$WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH = SubLObjectFactory.makeSymbol("WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH");
        $kw5$STRICT = SubLObjectFactory.makeKeyword("STRICT");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), (SubLObject)sksi_macros.NIL));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), (SubLObject)sksi_macros.T));
        $list8 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-ASSERTED-JOINABILITY?*"), (SubLObject)sksi_macros.T));
        $list9 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-ASSERTED-JOINABILITY?*"), (SubLObject)sksi_macros.NIL));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TABLE-NAMES"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym11$_SPREADSHEET_SKSI_CONJUNCTIVE_QUERY_TABLE_NAME_LIST_ = SubLObjectFactory.makeSymbol("*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*"), (SubLObject)sksi_macros.T));
        $list13 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*"), (SubLObject)sksi_macros.NIL));
        $list14 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), (SubLObject)sksi_macros.T));
        $list15 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), (SubLObject)sksi_macros.NIL));
        $kw16$CYC_SKSI = SubLObjectFactory.makeKeyword("CYC-SKSI");
        $sym17$RESOURCING_CACHES_FINALIZED_ = SubLObjectFactory.makeUninternedSymbol("RESOURCING-CACHES-FINALIZED?");
        $sym18$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list19 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WITHIN-SKSI-SQL-CONNECTION-RESOURCING?"));
        $sym20$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-CONNECTION-CACHE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sksi_macros.EQUALP)));
        $list22 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-STATEMENT-CACHE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEW-DICTIONARY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)sksi_macros.EQ)));
        $list23 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-SQL-STATEMENT-POOL-LOCK*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MAKE-LOCK"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENSYM"), (SubLObject)SubLObjectFactory.makeString("SKSI SQL statement cache ")))));
        $sym24$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym25$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $list26 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FINALIZE-SQL-CONNECTION-AND-STATEMENT-CACHE")));
        $sym27$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $list28 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("STATEMENT")), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym29$CMULTIPLE_VALUE_BIND = SubLObjectFactory.makeSymbol("CMULTIPLE-VALUE-BIND");
        $sym30$GET_SQL_CONNECTION_AND_STATEMENT = SubLObjectFactory.makeSymbol("GET-SQL-CONNECTION-AND-STATEMENT");
        $sym31$SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD = SubLObjectFactory.makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD");
        $sym32$WITH_SKSI_CONNECTION_TO_SKS = SubLObjectFactory.makeSymbol("WITH-SKSI-CONNECTION-TO-SKS");
        $sym33$SKS_P = SubLObjectFactory.makeSymbol("SKS-P");
        $sym34$SQL_CONNECTION_P = SubLObjectFactory.makeSymbol("SQL-CONNECTION-P");
        $sym35$SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE = SubLObjectFactory.makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE");
        $sym36$SKSI_CONNECTIONS_FOR_SKS_CACHE_GET = SubLObjectFactory.makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-GET");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("SKS")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym38$ACCESS_PATH = SubLObjectFactory.makeUninternedSymbol("ACCESS-PATH");
        $sym39$CLOSE_CONNECTION_ = SubLObjectFactory.makeUninternedSymbol("CLOSE-CONNECTION?");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-GLOBAL-RESOURCING?*"), (SubLObject)sksi_macros.NIL);
        $sym41$SQL_OPEN_CONNECTION_P = SubLObjectFactory.makeSymbol("SQL-OPEN-CONNECTION-P");
        $list42 = ConsesLow.list((SubLObject)sksi_macros.T);
        $sym43$WITH_ALL_MTS = SubLObjectFactory.makeSymbol("WITH-ALL-MTS");
        $sym44$EXTERNAL_SOURCE_ACCESS_PATH = SubLObjectFactory.makeSymbol("EXTERNAL-SOURCE-ACCESS-PATH");
        $list45 = ConsesLow.list((SubLObject)sksi_macros.NIL);
        $sym46$ACCESS_PATH_P = SubLObjectFactory.makeSymbol("ACCESS-PATH-P");
        $sym47$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str48$Problem_connecting_to_sks__A__cou = SubLObjectFactory.makeString("Problem connecting to sks ~A--couldn't determine access path.");
        $sym49$OPEN_SQL_SOURCE = SubLObjectFactory.makeSymbol("OPEN-SQL-SOURCE");
        $list50 = ConsesLow.list((SubLObject)sksi_macros.ONE_INTEGER);
        $str51$Problem_opening_connection_to_sks = SubLObjectFactory.makeString("Problem opening connection to sks ~A.");
        $sym52$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym53$SQLC_CLOSE = SubLObjectFactory.makeSymbol("SQLC-CLOSE");
        $list54 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym55$ACCESS_PATH_VAR = SubLObjectFactory.makeUninternedSymbol("ACCESS-PATH-VAR");
        $sym56$MUST = SubLObjectFactory.makeSymbol("MUST");
        $str57$Problem_opening_connection_to_dat = SubLObjectFactory.makeString("Problem opening connection to database ~s");
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STATEMENT"), (SubLObject)SubLObjectFactory.makeSymbol("ERROR")), (SubLObject)SubLObjectFactory.makeSymbol("ACCESS-PATH"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym59$DB = SubLObjectFactory.makeUninternedSymbol("DB");
        $sym60$USER = SubLObjectFactory.makeUninternedSymbol("USER");
        $sym61$PASSWORD = SubLObjectFactory.makeUninternedSymbol("PASSWORD");
        $sym62$SERVER = SubLObjectFactory.makeUninternedSymbol("SERVER");
        $sym63$PORT = SubLObjectFactory.makeUninternedSymbol("PORT");
        $sym64$PROXY_SERVER = SubLObjectFactory.makeUninternedSymbol("PROXY-SERVER");
        $sym65$PROXY_PORT = SubLObjectFactory.makeUninternedSymbol("PROXY-PORT");
        $sym66$SUBPROTOCOL = SubLObjectFactory.makeUninternedSymbol("SUBPROTOCOL");
        $sym67$TIMEOUT = SubLObjectFactory.makeUninternedSymbol("TIMEOUT");
        $sym68$CONN_SERVER = SubLObjectFactory.makeUninternedSymbol("CONN-SERVER");
        $sym69$CONN_PORT = SubLObjectFactory.makeUninternedSymbol("CONN-PORT");
        $sym70$CONN_TIMEOUT = SubLObjectFactory.makeUninternedSymbol("CONN-TIMEOUT");
        $sym71$ACCESS_PATH_DB = SubLObjectFactory.makeSymbol("ACCESS-PATH-DB");
        $sym72$ACCESS_PATH_USER = SubLObjectFactory.makeSymbol("ACCESS-PATH-USER");
        $sym73$ACCESS_PATH_PASSWORD = SubLObjectFactory.makeSymbol("ACCESS-PATH-PASSWORD");
        $sym74$ACCESS_PATH_SERVER = SubLObjectFactory.makeSymbol("ACCESS-PATH-SERVER");
        $sym75$ACCESS_PATH_PORT = SubLObjectFactory.makeSymbol("ACCESS-PATH-PORT");
        $sym76$ACCESS_PATH_PROXY_SERVER = SubLObjectFactory.makeSymbol("ACCESS-PATH-PROXY-SERVER");
        $sym77$ACCESS_PATH_PROXY_PORT = SubLObjectFactory.makeSymbol("ACCESS-PATH-PROXY-PORT");
        $sym78$ACCESS_PATH_SUBPROTOCOL = SubLObjectFactory.makeSymbol("ACCESS-PATH-SUBPROTOCOL");
        $sym79$ACCESS_PATH_TIMEOUT = SubLObjectFactory.makeSymbol("ACCESS-PATH-TIMEOUT");
        $sym80$FIRST_OF = SubLObjectFactory.makeSymbol("FIRST-OF");
        $list81 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-OPEN-SQL-CONNECTION-DEFAULT-TIMEOUT*"));
        $sym82$WITH_SQL_TRANSACTION = SubLObjectFactory.makeSymbol("WITH-SQL-TRANSACTION");
        $kw83$DBMS_SERVER = SubLObjectFactory.makeKeyword("DBMS-SERVER");
        $kw84$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw85$SUBPROTOCOL = SubLObjectFactory.makeKeyword("SUBPROTOCOL");
        $kw86$PROXY_SERVER = SubLObjectFactory.makeKeyword("PROXY-SERVER");
        $kw87$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $sym88$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $list89 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CURRENT-SKS-REGISTRATION-STATE")));
        $list90 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-SKSI-SANDBOX?*"), (SubLObject)sksi_macros.T));
        $sym91$EXECUTE_SKS_REGISTRATION_STATE = SubLObjectFactory.makeSymbol("EXECUTE-SKS-REGISTRATION-STATE");
        $sym92$ALREADY_IN_A_SANDBOX_ = SubLObjectFactory.makeUninternedSymbol("ALREADY-IN-A-SANDBOX?");
        $sym93$STATE = SubLObjectFactory.makeUninternedSymbol("STATE");
        $list94 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*WITHIN-SKSI-SANDBOX?*"));
        $sym95$FUNLESS = SubLObjectFactory.makeSymbol("FUNLESS");
    }
}

/*

	Total time: 160 ms
	
*/