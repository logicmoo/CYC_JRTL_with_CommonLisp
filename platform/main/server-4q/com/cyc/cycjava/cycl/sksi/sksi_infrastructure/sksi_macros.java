package com.cyc.cycjava.cycl.sksi.sksi_infrastructure;


import com.cyc.cycjava.cycl.sdbc;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sksi_macros extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_macros";

    public static final String myFingerPrint = "1deb4b9f6ef48995adf22d6afc19b0b785c4f85f1a827014d65a66f556e2f800";

    // defparameter
    // Definitions
    /**
     * An optimization to allow applicability functions to only check as much as
     * necessary to return a total subclause spec if there is one. If there isn't
     * the result should be irrelevant to the caller.
     */
    public static final SubLSymbol $sksi_crm_only_total_subclause_specs_relevantP$ = makeSymbol("*SKSI-CRM-ONLY-TOTAL-SUBCLAUSE-SPECS-RELEVANT?*");

    // defparameter
    /**
     * The default is 2, but for some applications (the unknownSentence conjunctive
     * removal modules) it is useful to override this.
     */
    public static final SubLSymbol $sksi_conjunction_pos_lits_applicability_minimum_candidate_literal_count$ = makeSymbol("*SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-MINIMUM-CANDIDATE-LITERAL-COUNT*");





    // defparameter
    public static final SubLSymbol $sksi_slrm_genl_pred_and_genls_reasoning_onP$ = makeSymbol("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*");

    // defparameter
    public static final SubLSymbol $sksi_sql_connection_cache$ = makeSymbol("*SKSI-SQL-CONNECTION-CACHE*");

    // defparameter
    public static final SubLSymbol $sksi_sql_statement_cache$ = makeSymbol("*SKSI-SQL-STATEMENT-CACHE*");

    // defparameter
    public static final SubLSymbol $sksi_sql_statement_pool_lock$ = makeSymbol("*SKSI-SQL-STATEMENT-POOL-LOCK*");

    // defparameter
    private static final SubLSymbol $sksi_connections_for_sks$ = makeSymbol("*SKSI-CONNECTIONS-FOR-SKS*");

    // defparameter
    public static final SubLSymbol $within_sksi_sandboxP$ = makeSymbol("*WITHIN-SKSI-SANDBOX?*");



    public static final SubLList $list1 = list(makeSymbol("STRENGTH"), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $sksi_default_ms_type_check_strength$ = makeSymbol("*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*");

    public static final SubLSymbol WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH = makeSymbol("WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH");



    public static final SubLList $list6 = list(list(makeSymbol("*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), NIL));

    public static final SubLList $list7 = list(list(makeSymbol("*IGNORE-SUBSUMED-SUBCLAUSE-SPECS?*"), T));

    public static final SubLList $list8 = list(list(makeSymbol("*SKSI-ASSERTED-JOINABILITY?*"), T));

    public static final SubLList $list9 = list(list(makeSymbol("*SKSI-ASSERTED-JOINABILITY?*"), NIL));

    public static final SubLList $list10 = list(makeSymbol("TABLE-NAMES"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $spreadsheet_sksi_conjunctive_query_table_name_list$ = makeSymbol("*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*");

    public static final SubLList $list12 = list(list(makeSymbol("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*"), T));

    public static final SubLList $list13 = list(list(makeSymbol("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*"), NIL));

    private static final SubLList $list14 = list(list(makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), T));

    private static final SubLList $list15 = list(list(makeSymbol("*MEMOIZE-SKSI-REFORMULATE?*"), NIL));



    private static final SubLSymbol $sym17$RESOURCING_CACHES_FINALIZED_ = makeUninternedSymbol("RESOURCING-CACHES-FINALIZED?");



    public static final SubLList $list19 = list(makeSymbol("WITHIN-SKSI-SQL-CONNECTION-RESOURCING?"));



    public static final SubLList $list21 = list(makeSymbol("*SKSI-SQL-CONNECTION-CACHE*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQUALP)));

    private static final SubLList $list22 = list(makeSymbol("*SKSI-SQL-STATEMENT-CACHE*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("FUNCTION"), EQ)));

    private static final SubLList $list23 = list(makeSymbol("*SKSI-SQL-STATEMENT-POOL-LOCK*"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("STRING"), list(makeSymbol("GENSYM"), makeString("SKSI SQL statement cache ")))));





    public static final SubLList $list26 = list(list(makeSymbol("FINALIZE-SQL-CONNECTION-AND-STATEMENT-CACHE")));



    private static final SubLList $list28 = list(list(makeSymbol("CONNECTION"), makeSymbol("STATEMENT")), makeSymbol("ACCESS-PATH"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol GET_SQL_CONNECTION_AND_STATEMENT = makeSymbol("GET-SQL-CONNECTION-AND-STATEMENT");

    private static final SubLSymbol SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD = makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD");

    private static final SubLSymbol WITH_SKSI_CONNECTION_TO_SKS = makeSymbol("WITH-SKSI-CONNECTION-TO-SKS");

    private static final SubLSymbol SKS_P = makeSymbol("SKS-P");

    private static final SubLSymbol SQL_CONNECTION_P = makeSymbol("SQL-CONNECTION-P");

    private static final SubLSymbol SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE = makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE");

    private static final SubLSymbol SKSI_CONNECTIONS_FOR_SKS_CACHE_GET = makeSymbol("SKSI-CONNECTIONS-FOR-SKS-CACHE-GET");

    private static final SubLList $list37 = list(list(makeSymbol("CONNECTION"), makeSymbol("SKS")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym38$ACCESS_PATH = makeUninternedSymbol("ACCESS-PATH");

    private static final SubLSymbol $sym39$CLOSE_CONNECTION_ = makeUninternedSymbol("CLOSE-CONNECTION?");

    public static final SubLList $list40 = list(makeSymbol("*SKSI-GLOBAL-RESOURCING?*"), NIL);

    private static final SubLSymbol SQL_OPEN_CONNECTION_P = makeSymbol("SQL-OPEN-CONNECTION-P");

    private static final SubLList $list42 = list(T);



    private static final SubLSymbol EXTERNAL_SOURCE_ACCESS_PATH = makeSymbol("EXTERNAL-SOURCE-ACCESS-PATH");

    private static final SubLList $list45 = list(NIL);

    private static final SubLSymbol ACCESS_PATH_P = makeSymbol("ACCESS-PATH-P");



    private static final SubLString $str48$Problem_connecting_to_sks__A__cou = makeString("Problem connecting to sks ~A--couldn't determine access path.");

    private static final SubLSymbol OPEN_SQL_SOURCE = makeSymbol("OPEN-SQL-SOURCE");

    private static final SubLList $list50 = list(ONE_INTEGER);

    private static final SubLString $str51$Problem_opening_connection_to_sks = makeString("Problem opening connection to sks ~A.");



    private static final SubLSymbol SQLC_CLOSE = makeSymbol("SQLC-CLOSE");

    private static final SubLList $list54 = list(list(makeSymbol("CONNECTION"), makeSymbol("ACCESS-PATH")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym55$ACCESS_PATH_VAR = makeUninternedSymbol("ACCESS-PATH-VAR");



    private static final SubLString $str57$Problem_opening_connection_to_dat = makeString("Problem opening connection to database ~s");

    private static final SubLList $list58 = list(list(makeSymbol("STATEMENT"), makeSymbol("ERROR")), makeSymbol("ACCESS-PATH"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym59$DB = makeUninternedSymbol("DB");

    private static final SubLSymbol $sym60$USER = makeUninternedSymbol("USER");

    private static final SubLSymbol $sym61$PASSWORD = makeUninternedSymbol("PASSWORD");

    private static final SubLSymbol $sym62$SERVER = makeUninternedSymbol("SERVER");

    private static final SubLSymbol $sym63$PORT = makeUninternedSymbol("PORT");

    private static final SubLSymbol $sym64$PROXY_SERVER = makeUninternedSymbol("PROXY-SERVER");

    private static final SubLSymbol $sym65$PROXY_PORT = makeUninternedSymbol("PROXY-PORT");

    private static final SubLSymbol $sym66$SUBPROTOCOL = makeUninternedSymbol("SUBPROTOCOL");

    private static final SubLSymbol $sym67$TIMEOUT = makeUninternedSymbol("TIMEOUT");

    private static final SubLSymbol $sym68$CONN_SERVER = makeUninternedSymbol("CONN-SERVER");

    private static final SubLSymbol $sym69$CONN_PORT = makeUninternedSymbol("CONN-PORT");

    private static final SubLSymbol $sym70$CONN_TIMEOUT = makeUninternedSymbol("CONN-TIMEOUT");

    private static final SubLSymbol ACCESS_PATH_DB = makeSymbol("ACCESS-PATH-DB");

    private static final SubLSymbol ACCESS_PATH_USER = makeSymbol("ACCESS-PATH-USER");

    private static final SubLSymbol ACCESS_PATH_PASSWORD = makeSymbol("ACCESS-PATH-PASSWORD");

    private static final SubLSymbol ACCESS_PATH_SERVER = makeSymbol("ACCESS-PATH-SERVER");

    private static final SubLSymbol ACCESS_PATH_PORT = makeSymbol("ACCESS-PATH-PORT");

    private static final SubLSymbol ACCESS_PATH_PROXY_SERVER = makeSymbol("ACCESS-PATH-PROXY-SERVER");

    private static final SubLSymbol ACCESS_PATH_PROXY_PORT = makeSymbol("ACCESS-PATH-PROXY-PORT");

    private static final SubLSymbol ACCESS_PATH_SUBPROTOCOL = makeSymbol("ACCESS-PATH-SUBPROTOCOL");

    private static final SubLSymbol ACCESS_PATH_TIMEOUT = makeSymbol("ACCESS-PATH-TIMEOUT");



    private static final SubLList $list81 = list(makeSymbol("*SKSI-OPEN-SQL-CONNECTION-DEFAULT-TIMEOUT*"));

    private static final SubLSymbol WITH_SQL_TRANSACTION = makeSymbol("WITH-SQL-TRANSACTION");











    private static final SubLSymbol $sym88$STATE = makeUninternedSymbol("STATE");

    private static final SubLList $list89 = list(list(makeSymbol("CURRENT-SKS-REGISTRATION-STATE")));

    private static final SubLList $list90 = list(list(makeSymbol("*WITHIN-SKSI-SANDBOX?*"), T));

    private static final SubLSymbol EXECUTE_SKS_REGISTRATION_STATE = makeSymbol("EXECUTE-SKS-REGISTRATION-STATE");

    private static final SubLSymbol $sym92$ALREADY_IN_A_SANDBOX_ = makeUninternedSymbol("ALREADY-IN-A-SANDBOX?");

    private static final SubLSymbol $sym93$STATE = makeUninternedSymbol("STATE");

    private static final SubLList $list94 = list(makeSymbol("*WITHIN-SKSI-SANDBOX?*"));



    public static SubLObject with_sksi_default_ms_type_check_strength(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject strength = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        strength = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($sksi_default_ms_type_check_strength$, strength)), append(body, NIL));
    }

    public static SubLObject with_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, $WEAK, append(body, NIL));
    }

    public static SubLObject without_sksi_crm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_SKSI_DEFAULT_MS_TYPE_CHECK_STRENGTH, $STRICT, append(body, NIL));
    }

    public static SubLObject with_sksi_crm_full_applicability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list6, append(body, NIL));
    }

    public static SubLObject with_sksi_crm_restricted_applicability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list7, append(body, NIL));
    }

    public static SubLObject with_sksi_asserted_joinability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list8, append(body, NIL));
    }

    public static SubLObject with_sksi_deduced_joinability(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list9, append(body, NIL));
    }

    public static SubLObject with_spreadsheet_sksi_conjunctive_query_table_name_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject table_names = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        table_names = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($spreadsheet_sksi_conjunctive_query_table_name_list$, table_names)), append(body, NIL));
    }

    public static SubLObject sksi_slrm_genl_pred_and_genls_reasoning_onP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $sksi_slrm_genl_pred_and_genls_reasoning_onP$.getDynamicValue(thread);
    }

    public static SubLObject with_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list12, append(body, NIL));
    }

    public static SubLObject without_sksi_slrm_genl_pred_and_genls_reasoning(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list13, append(body, NIL));
    }

    public static SubLObject with_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list14, append(body, NIL));
    }

    public static SubLObject without_sksi_reformulation_caching(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(CLET, $list15, append(body, NIL));
    }

    public static SubLObject with_sksi_sql_connection_resourcing(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        if (NIL != find($CYC_SKSI, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject resourcing_caches_finalizedP = $sym17$RESOURCING_CACHES_FINALIZED_;
            return list(PIF, $list19, bq_cons(PROGN, append(body, NIL)), list(CLET, list($list21, $list22, $list23, resourcing_caches_finalizedP), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(CUNWIND_PROTECT, listS(CSETQ, resourcing_caches_finalizedP, $list26), listS(PUNLESS, resourcing_caches_finalizedP, $list26)))));
        }
        return bq_cons(PROGN, append(body, NIL));
    }

    public static SubLObject with_sksi_sql_connection_and_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = NIL;
        SubLObject statement = NIL;
        destructuring_bind_must_consp(current, datum, $list28);
        connection = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list28);
        statement = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject access_path = NIL;
            destructuring_bind_must_consp(current, datum, $list28);
            access_path = current.first();
            final SubLObject body;
            current = body = current.rest();
            return listS(CMULTIPLE_VALUE_BIND, list(connection, statement), list(GET_SQL_CONNECTION_AND_STATEMENT, access_path), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list28);
        return NIL;
    }

    public static SubLObject sksi_connections_for_sks_cache_add(final SubLObject sks, final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        assert NIL != sdbc.sql_connection_p(connection) : "sdbc.sql_connection_p(connection) " + "CommonSymbols.NIL != sdbc.sql_connection_p(connection) " + connection;
        return sethash(sksi_sks_accessors.sks_get_top_sks(sks), $sksi_connections_for_sks$.getDynamicValue(thread), connection);
    }

    public static SubLObject sksi_connections_for_sks_cache_remove(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        return remhash(sksi_sks_accessors.sks_get_top_sks(sks), $sksi_connections_for_sks$.getDynamicValue(thread));
    }

    public static SubLObject sksi_connections_for_sks_cache_get(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != sksi_sks_accessors.sks_p(sks) : "sksi_sks_accessors.sks_p(sks) " + "CommonSymbols.NIL != sksi_sks_accessors.sks_p(sks) " + sks;
        final SubLObject top_sks = sksi_sks_accessors.sks_get_top_sks(sks);
        final SubLObject connection = gethash(top_sks, $sksi_connections_for_sks$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != sdbc.sql_open_connection_p(connection)) {
            return connection;
        }
        if (NIL != sdbc.sql_connection_p(connection)) {
            sksi_connections_for_sks_cache_remove(top_sks);
            return NIL;
        }
        return NIL;
    }

    public static SubLObject with_sksi_connection_to_sks(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = NIL;
        SubLObject sks = NIL;
        destructuring_bind_must_consp(current, datum, $list37);
        connection = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list37);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject access_path = $sym38$ACCESS_PATH;
            final SubLObject close_connectionP = $sym39$CLOSE_CONNECTION_;
            return list(CLET, list($list40, connection, close_connectionP), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, connection, list(SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, sks)), list(PUNLESS, list(SQL_OPEN_CONNECTION_P, connection), listS(CSETQ, close_connectionP, $list42), list(CLET, list(access_path), list(WITH_ALL_MTS, list(CSETQ, access_path, listS(EXTERNAL_SOURCE_ACCESS_PATH, sks, $list45))), list(PUNLESS, list(ACCESS_PATH_P, access_path), list(ERROR, $str48$Problem_connecting_to_sks__A__cou, sks)), list(CSETQ, connection, listS(OPEN_SQL_SOURCE, access_path, $list50))), list(PUNLESS, list(SQL_OPEN_CONNECTION_P, connection), list(ERROR, $str51$Problem_opening_connection_to_sks, sks)), list(SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, sks, connection)), append(body, NIL)), list(PWHEN, close_connectionP, list(SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, sks), list(PWHEN, list(SQL_OPEN_CONNECTION_P, connection), list(SQLC_CLOSE, connection)))));
        }
        cdestructuring_bind_error(datum, $list37);
        return NIL;
    }

    public static SubLObject with_sql_connection_to_access_path(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject connection = NIL;
        SubLObject access_path = NIL;
        destructuring_bind_must_consp(current, datum, $list54);
        connection = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list54);
        access_path = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject access_path_var = $sym55$ACCESS_PATH_VAR;
            return list(CLET, list(list(access_path_var, access_path), connection), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, connection, list(OPEN_SQL_SOURCE, access_path_var)), list(MUST, list(SQL_OPEN_CONNECTION_P, connection), $str57$Problem_opening_connection_to_dat, access_path_var), append(body, NIL)), list(PWHEN, list(SQL_OPEN_CONNECTION_P, connection), list(SQLC_CLOSE, connection))));
        }
        cdestructuring_bind_error(datum, $list54);
        return NIL;
    }

    public static SubLObject with_sksi_sql_transaction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject statement = NIL;
        SubLObject error = NIL;
        destructuring_bind_must_consp(current, datum, $list58);
        statement = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list58);
        error = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject access_path = NIL;
            destructuring_bind_must_consp(current, datum, $list58);
            access_path = current.first();
            final SubLObject body;
            current = body = current.rest();
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
            return list(CLET, list(new SubLObject[]{ list(db, list(ACCESS_PATH_DB, access_path)), list(user, list(ACCESS_PATH_USER, access_path)), list(password, list(ACCESS_PATH_PASSWORD, access_path)), list(server, list(ACCESS_PATH_SERVER, access_path)), list(port, list(ACCESS_PATH_PORT, access_path)), list(proxy_server, list(ACCESS_PATH_PROXY_SERVER, access_path)), list(proxy_port, list(ACCESS_PATH_PROXY_PORT, access_path)), list(subprotocol, list(ACCESS_PATH_SUBPROTOCOL, access_path)), list(timeout, list(ACCESS_PATH_TIMEOUT, access_path)), list(conn_server, list(FIRST_OF, proxy_server, server)), list(conn_port, list(FIRST_OF, proxy_port, port)), list(conn_timeout, listS(FIRST_OF, timeout, $list81)) }), listS(WITH_SQL_TRANSACTION, list(new SubLObject[]{ statement, error, db, user, password, $DBMS_SERVER, server, $PORT, conn_port, $SUBPROTOCOL, subprotocol, $PROXY_SERVER, conn_server, $TIMEOUT, conn_timeout }), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list58);
        return NIL;
    }

    public static SubLObject with_sksi_sandbox(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject state = $sym88$STATE;
        return list(CLET, bq_cons(bq_cons(state, $list89), $list90), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(EXECUTE_SKS_REGISTRATION_STATE, state)));
    }

    public static SubLObject possibly_with_sksi_sandbox(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject already_in_a_sandboxP = $sym92$ALREADY_IN_A_SANDBOX_;
        final SubLObject state = $sym93$STATE;
        return list(CLET, listS(bq_cons(already_in_a_sandboxP, $list94), list(state, listS(FUNLESS, already_in_a_sandboxP, $list89)), $list90), list(CUNWIND_PROTECT, bq_cons(PROGN, append(body, NIL)), list(PUNLESS, already_in_a_sandboxP, list(EXECUTE_SKS_REGISTRATION_STATE, state))));
    }

    public static SubLObject declare_sksi_macros_file() {
        declareMacro(me, "with_sksi_default_ms_type_check_strength", "WITH-SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH");
        declareMacro(me, "with_sksi_crm_genl_pred_and_genls_reasoning", "WITH-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING");
        declareMacro(me, "without_sksi_crm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-CRM-GENL-PRED-AND-GENLS-REASONING");
        declareMacro(me, "with_sksi_crm_full_applicability", "WITH-SKSI-CRM-FULL-APPLICABILITY");
        declareMacro(me, "with_sksi_crm_restricted_applicability", "WITH-SKSI-CRM-RESTRICTED-APPLICABILITY");
        declareMacro(me, "with_sksi_asserted_joinability", "WITH-SKSI-ASSERTED-JOINABILITY");
        declareMacro(me, "with_sksi_deduced_joinability", "WITH-SKSI-DEDUCED-JOINABILITY");
        declareMacro(me, "with_spreadsheet_sksi_conjunctive_query_table_name_list", "WITH-SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST");
        declareFunction(me, "sksi_slrm_genl_pred_and_genls_reasoning_onP", "SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?", 0, 0, false);
        declareMacro(me, "with_sksi_slrm_genl_pred_and_genls_reasoning", "WITH-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING");
        declareMacro(me, "without_sksi_slrm_genl_pred_and_genls_reasoning", "WITHOUT-SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING");
        declareMacro(me, "with_sksi_reformulation_caching", "WITH-SKSI-REFORMULATION-CACHING");
        declareMacro(me, "without_sksi_reformulation_caching", "WITHOUT-SKSI-REFORMULATION-CACHING");
        declareMacro(me, "with_sksi_sql_connection_resourcing", "WITH-SKSI-SQL-CONNECTION-RESOURCING");
        declareMacro(me, "with_sksi_sql_connection_and_statement", "WITH-SKSI-SQL-CONNECTION-AND-STATEMENT");
        declareFunction(me, "sksi_connections_for_sks_cache_add", "SKSI-CONNECTIONS-FOR-SKS-CACHE-ADD", 2, 0, false);
        declareFunction(me, "sksi_connections_for_sks_cache_remove", "SKSI-CONNECTIONS-FOR-SKS-CACHE-REMOVE", 1, 0, false);
        declareFunction(me, "sksi_connections_for_sks_cache_get", "SKSI-CONNECTIONS-FOR-SKS-CACHE-GET", 1, 0, false);
        declareMacro(me, "with_sksi_connection_to_sks", "WITH-SKSI-CONNECTION-TO-SKS");
        declareMacro(me, "with_sql_connection_to_access_path", "WITH-SQL-CONNECTION-TO-ACCESS-PATH");
        declareMacro(me, "with_sksi_sql_transaction", "WITH-SKSI-SQL-TRANSACTION");
        declareMacro(me, "with_sksi_sandbox", "WITH-SKSI-SANDBOX");
        declareMacro(me, "possibly_with_sksi_sandbox", "POSSIBLY-WITH-SKSI-SANDBOX");
        return NIL;
    }

    public static SubLObject init_sksi_macros_file() {
        defparameter("*SKSI-CRM-ONLY-TOTAL-SUBCLAUSE-SPECS-RELEVANT?*", NIL);
        defparameter("*SKSI-CONJUNCTION-POS-LITS-APPLICABILITY-MINIMUM-CANDIDATE-LITERAL-COUNT*", TWO_INTEGER);
        defparameter("*SKSI-DEFAULT-MS-TYPE-CHECK-STRENGTH*", $WEAK);
        defparameter("*SPREADSHEET-SKSI-CONJUNCTIVE-QUERY-TABLE-NAME-LIST*", NIL);
        defparameter("*SKSI-SLRM-GENL-PRED-AND-GENLS-REASONING-ON?*", T);
        defparameter("*SKSI-SQL-CONNECTION-CACHE*", NIL);
        defparameter("*SKSI-SQL-STATEMENT-CACHE*", NIL);
        defparameter("*SKSI-SQL-STATEMENT-POOL-LOCK*", NIL);
        defparameter("*SKSI-CONNECTIONS-FOR-SKS*", make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*WITHIN-SKSI-SANDBOX?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_macros_file() {
        register_macro_helper(SKSI_CONNECTIONS_FOR_SKS_CACHE_ADD, WITH_SKSI_CONNECTION_TO_SKS);
        register_macro_helper(SKSI_CONNECTIONS_FOR_SKS_CACHE_REMOVE, WITH_SKSI_CONNECTION_TO_SKS);
        register_macro_helper(SKSI_CONNECTIONS_FOR_SKS_CACHE_GET, WITH_SKSI_CONNECTION_TO_SKS);
        return NIL;
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











































































































    }
}

/**
 * Total time: 160 ms
 */
