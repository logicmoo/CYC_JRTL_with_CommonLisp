/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      KB-LOGGING
 *  source file: /cyc/top/cycl/kb-logging.lisp
 *  created:     2019/07/03 17:38:14
 */
public final class kb_logging extends SubLTranslatedFile implements V02 {
    // // Constructor
    private kb_logging() {
    }

    public static final SubLFile me = new kb_logging();


    // // Definitions
    public static final SubLObject with_exclusive_sql_connection_access(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt1, append(body, NIL));
        }
    }

    // deflexical
    private static final SubLSymbol $sql_connection_lock$ = makeSymbol("*SQL-CONNECTION-LOCK*");

    /**
     * this image's connection to the SQL database
     */
    // deflexical
    private static final SubLSymbol $logging_connection$ = makeSymbol("*LOGGING-CONNECTION*");

    /**
     * this image's statement used to execute SQL
     */
    // deflexical
    private static final SubLSymbol $logging_statement$ = makeSymbol("*LOGGING-STATEMENT*");

    /**
     * Map of IP addresses to disguised session IDs
     */
    // deflexical
    private static final SubLSymbol $session_id_map$ = makeSymbol("*SESSION-ID-MAP*");

    // deflexical
    private static final SubLSymbol $sql_session_table$ = makeSymbol("*SQL-SESSION-TABLE*");

    // deflexical
    private static final SubLSymbol $sql_logging_table$ = makeSymbol("*SQL-LOGGING-TABLE*");

    // deflexical
    private static final SubLSymbol $cyc_user_login$ = makeSymbol("*CYC-USER-LOGIN*");

    // deflexical
    private static final SubLSymbol $cyc_user_passwd$ = makeSymbol("*CYC-USER-PASSWD*");

    // deflexical
    private static final SubLSymbol $kb_logging_dbms_server$ = makeSymbol("*KB-LOGGING-DBMS-SERVER*");

    // deflexical
    private static final SubLSymbol $kb_logging_subprotocol$ = makeSymbol("*KB-LOGGING-SUBPROTOCOL*");

    // deflexical
    private static final SubLSymbol $kb_logging_proxy_server$ = makeSymbol("*KB-LOGGING-PROXY-SERVER*");

    // deflexical
    private static final SubLSymbol $kb_logging_port$ = makeSymbol("*KB-LOGGING-PORT*");

    /**
     * should this image log clicks?
     */
    // deflexical
    private static final SubLSymbol $log_clicks$ = makeSymbol("*LOG-CLICKS*");

    /**
     * Establishes a new connection to the SQL database and create a statement
     * used to write the clicked terms to the database
     * This should be called when a fresh Cyc image is started
     */
    public static final SubLObject new_logging_connection() {
        {
            SubLObject lock = $sql_connection_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $logging_connection$.setGlobalValue(sdbc.new_sql_connection($$$kbLogging, $cyc_user_login$.getGlobalValue(), $cyc_user_passwd$.getGlobalValue(), list($DBMS_SERVER, $kb_logging_dbms_server$.getGlobalValue(), $PORT, $kb_logging_port$.getGlobalValue(), $SUBPROTOCOL, $kb_logging_subprotocol$.getGlobalValue(), $PROXY_SERVER, $kb_logging_proxy_server$.getGlobalValue())));
                if (NIL != sdbc.sql_open_connection_p($logging_connection$.getGlobalValue())) {
                    $logging_statement$.setGlobalValue(sdbc.sqlc_create_statement($logging_connection$.getGlobalValue()));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $logging_connection$.getGlobalValue();
    }

    /**
     * Ensures that a valid SQL connection to the kbLogging database exists
     */
    public static final SubLObject ensure_logging_connection() {
        {
            SubLObject lock = $sql_connection_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL == logging_connection_p($logging_connection$.getGlobalValue())) {
                    new_logging_connection();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return $logging_connection$.getGlobalValue();
    }

    /**
     * Returns t if OBJECT is an open working connection to the kbLogging database
     */
    public static final SubLObject logging_connection_p(SubLObject v_object) {
        return makeBoolean(((NIL != sdbc.sql_connection_p(v_object)) && (NIL != sdbc.sqlc_open_p(v_object))) && sdbc.sqlc_db(v_object).equal($$$kbLogging));
    }

    /**
     * Fetches the next session id from the database, assigns it to *session-id*,
     * and increments the session id table by one
     * This should be called when a new user logs into this image.
     *
     * @unknown we're introducing a race condtion here; this should really be done
    with autogenerated keys
     */
    public static final SubLObject new_session_id() {
        {
            SubLObject statement = sdbc.sqlc_create_statement($logging_connection$.getGlobalValue());
            SubLObject rs = NIL;
            SubLObject session_id = NIL;
            if (NIL != sdbc.sql_statement_p(statement)) {
                rs = sdbc.sqls_execute_query(statement, format(NIL, $str_alt14$SELECT_next_FROM__a_WHERE_only___, $sql_session_table$.getGlobalValue()), UNPROVIDED);
                if (NIL != sdbc.sql_result_set_p(rs)) {
                    sdbc.sqlrs_next(rs);
                    session_id = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    if (NIL != sdbc.sdbc_error_p(session_id)) {
                        session_id = NIL;
                    }
                    if (NIL != sdbc.sdbc_error_p(sdbc.sqls_execute_update(statement, format(NIL, $str_alt15$UPDATE__a_SET_next____a_WHERE_onl, new SubLObject[]{ $sql_session_table$.getGlobalValue(), number_utilities.f_1X(session_id), session_id })))) {
                        session_id = NIL;
                    }
                    sdbc.sqls_close(statement);
                }
            }
            return session_id;
        }
    }

    /**
     * Creates a new session id for MACHINE if it doesn't already exist
     */
    public static final SubLObject ensure_session_id(SubLObject machine) {
        if (NIL == get_session_id(machine)) {
            register_session_id(new_session_id(), machine);
        }
        return get_session_id(machine);
    }

    /**
     * Registers the id SESSION-ID for MACHINE
     */
    public static final SubLObject register_session_id(SubLObject session_id, SubLObject machine) {
        if (NIL != session_id) {
            return dictionary.dictionary_enter($session_id_map$.getGlobalValue(), machine, session_id);
        } else {
            return NIL;
        }
    }

    public static final SubLObject log_term(SubLObject v_term, SubLObject machine) {
        return makeBoolean(NIL == sdbc.sdbc_error_p(sdbc.sqls_execute_update($logging_statement$.getGlobalValue(), format(NIL, $str_alt16$INSERT_INTO__a_VALUES__a___a___s_, new SubLObject[]{ $sql_logging_table$.getGlobalValue(), get_session_id(machine), get_time_stamp(), get_guid_string(v_term) }))));
    }

    /**
     * The SQL name of the table in which to log asks
     */
    // deflexical
    private static final SubLSymbol $sql_ask_logging_table$ = makeSymbol("*SQL-ASK-LOGGING-TABLE*");

    /**
     * The SQL name of the table in which to log queries
     */
    // deflexical
    private static final SubLSymbol $sql_query_logging_table$ = makeSymbol("*SQL-QUERY-LOGGING-TABLE*");

    public static final SubLObject sql_stringify(SubLObject expression) {
        return string_utilities.to_lisp_string(encapsulation.encapsulate(expression));
    }

    // deflexical
    private static final SubLSymbol $logging_asks_enabledP$ = makeSymbol("*LOGGING-ASKS-ENABLED?*");

    /**
     * Turns MACHINE into a session id, then inserts the values specified by QUERY-INFO
     * into the ask-logging SQL table, after converting them into an SQL-appropriate format.
     */
    public static final SubLObject log_cb_ask(SubLObject query_info, SubLObject machine) {
        if (NIL != $logging_asks_enabledP$.getGlobalValue()) {
            {
                SubLObject datum = query_info;
                SubLObject current = datum;
                SubLObject query_sentence = NIL;
                SubLObject mt = NIL;
                SubLObject backchain = NIL;
                SubLObject number = NIL;
                SubLObject time = NIL;
                SubLObject depth = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt19);
                query_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                backchain = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                number = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                time = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt19);
                depth = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject session_id = get_session_id(machine);
                        SubLObject timestamp = get_time_stamp();
                        SubLObject kb_id = kb_id();
                        SubLObject sql = format(NIL, $str_alt20$INSERT_INTO__a_VALUES__s___s___d_, new SubLObject[]{ $sql_ask_logging_table$.getGlobalValue(), sql_stringify(query_sentence), sql_stringify(mt), string_to_integer_or_minus_1(backchain), string_to_integer_or_minus_1(number), string_to_integer_or_minus_1(time), string_to_integer_or_minus_1(depth), session_id, timestamp, kb_id });
                        return makeBoolean(NIL == sdbc.sdbc_error_p(sdbc.sqls_execute_update($logging_statement$.getGlobalValue(), sql)));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt19);
                }
            }
        }
        return NIL;
    }

    /**
     * Turns MACHINE into a session id, then inserts the values specified by QUERY-INFO
     * into the query-logging SQL table, after converting them into an SQL-appropriate format.
     */
    public static final SubLObject log_cb_query(SubLObject query_info, SubLObject machine) {
        if (NIL != $logging_asks_enabledP$.getGlobalValue()) {
            {
                SubLObject datum = query_info;
                SubLObject current = datum;
                SubLObject query_sentence = NIL;
                SubLObject mt = NIL;
                SubLObject v_properties = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt21);
                query_sentence = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                mt = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt21);
                v_properties = current.first();
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject session_id = get_session_id(machine);
                        SubLObject timestamp = get_time_stamp();
                        SubLObject kb_id = kb_id();
                        SubLObject sql = format(NIL, $str_alt22$INSERT_INTO__a_VALUES__s___s___s_, new SubLObject[]{ $sql_query_logging_table$.getGlobalValue(), sql_stringify(query_sentence), sql_stringify(mt), sql_stringify(v_properties), session_id, timestamp, kb_id });
                        return makeBoolean(NIL == sdbc.sdbc_error_p(sdbc.sqls_execute_update($logging_statement$.getGlobalValue(), sql)));
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt21);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject string_to_integer_or_minus_1(SubLObject string) {
        if (NIL != string_utilities.empty_stringP(string)) {
            return MINUS_ONE_INTEGER;
        } else {
            {
                SubLObject integer = string_utilities.string_to_integer(string);
                if (integer.isInteger()) {
                    return integer;
                } else {
                    return MINUS_ONE_INTEGER;
                }
            }
        }
    }

    /**
     * Return the session id of this session
     */
    public static final SubLObject get_session_id(SubLObject machine) {
        return dictionary.dictionary_lookup($session_id_map$.getGlobalValue(), machine, UNPROVIDED);
    }

    /**
     * Return the current time
     */
    public static final SubLObject get_time_stamp() {
        return get_universal_time();
    }

    /**
     * Return the guid of TERM, as a string
     */
    public static final SubLObject get_guid_string(SubLObject v_term) {
        return Guids.guid_to_string(constants_high.constant_guid(v_term));
    }

    /**
     * Closes the connection to the database. This should be called when this image
     * is shut down
     */
    public static final SubLObject finalize_logging_connection() {
        if (NIL != sdbc.sql_statement_p($logging_statement$.getGlobalValue())) {
            sdbc.sqls_close($logging_statement$.getGlobalValue());
        }
        $logging_statement$.setGlobalValue(NIL);
        if (NIL != sdbc.sql_connection_p($logging_connection$.getGlobalValue())) {
            sdbc.sqlc_close($logging_connection$.getGlobalValue());
        }
        $logging_connection$.setGlobalValue(NIL);
        return T;
    }

    /**
     * Discards the session id of this session. This should be called when the
     * user logs out
     */
    public static final SubLObject finalize_session_id(SubLObject machine) {
        dictionary.dictionary_remove($session_id_map$.getGlobalValue(), machine);
        return T;
    }

    public static final SubLObject cb_login_action(SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject v_class = event_model.event_class(event);
            SubLObject cyclist = event_model.event_message(event);
            SubLObject machine = event_model.event_source(event);
            if (NIL != $log_clicks$.getGlobalValue()) {
                {
                    SubLObject pcase_var = v_class;
                    if (pcase_var.eql($EVENT_HANDLER_REGISTERED)) {
                        ensure_logging_connection();
                        dictionary.clear_dictionary($session_id_map$.getGlobalValue());
                    } else
                        if (pcase_var.eql($EVENT_HANDLER_DEREGISTERED)) {
                            finalize_logging_connection();
                            dictionary.clear_dictionary($session_id_map$.getGlobalValue());
                        } else
                            if (pcase_var.eql($CYC_BROWSER_LOGIN_EVENT)) {
                                ensure_logging_connection();
                                register_session_id(new_session_id(), machine);
                            }


                }
            }
            return cyclist;
        }
    }

    // deflexical
    private static final SubLSymbol $kb_logging_cb_login_event_listener$ = makeSymbol("*KB-LOGGING-CB-LOGIN-EVENT-LISTENER*");

    public static final SubLObject cb_constant_selection_action(SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject constant = event_model.event_message(event);
            SubLObject machine = event_model.event_source(event);
            if (NIL != $log_clicks$.getGlobalValue()) {
                if (machine != $BROKER) {
                    ensure_logging_connection();
                    ensure_session_id(machine);
                    if (NIL == log_term(constant, machine)) {
                        ensure_logging_connection();
                        log_term(constant, machine);
                    }
                }
            }
            return constant;
        }
    }

    // deflexical
    private static final SubLSymbol $kb_logging_cb_constant_selection_event_listener$ = makeSymbol("*KB-LOGGING-CB-CONSTANT-SELECTION-EVENT-LISTENER*");

    public static final SubLObject cb_ask_action(SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject v_class = event_model.event_class(event);
            SubLObject query_info = event_model.event_message(event);
            SubLObject machine = event_model.event_source(event);
            if (NIL != $logging_asks_enabledP$.getGlobalValue()) {
                {
                    SubLObject pcase_var = v_class;
                    if (pcase_var.eql($EVENT_HANDLER_REGISTERED)) {
                    } else
                        if (pcase_var.eql($EVENT_HANDLER_DEREGISTERED)) {
                        } else
                            if (pcase_var.eql($CYC_BROWSER_ASK_EVENT)) {
                                ensure_logging_connection();
                                ensure_session_id(machine);
                                if (NIL == log_cb_ask(query_info, machine)) {
                                    ensure_logging_connection();
                                    log_cb_ask(query_info, machine);
                                }
                            }


                }
            }
            return query_info;
        }
    }

    // deflexical
    private static final SubLSymbol $kb_logging_cb_ask_event_listener$ = makeSymbol("*KB-LOGGING-CB-ASK-EVENT-LISTENER*");

    public static final SubLObject cb_query_action(SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject v_class = event_model.event_class(event);
            SubLObject query_info = event_model.event_message(event);
            SubLObject machine = event_model.event_source(event);
            if (NIL != $logging_asks_enabledP$.getGlobalValue()) {
                {
                    SubLObject pcase_var = v_class;
                    if (pcase_var.eql($EVENT_HANDLER_REGISTERED)) {
                    } else
                        if (pcase_var.eql($EVENT_HANDLER_DEREGISTERED)) {
                        } else
                            if (pcase_var.eql($CYC_BROWSER_QUERY_EVENT)) {
                                ensure_logging_connection();
                                ensure_session_id(machine);
                                if (NIL == log_cb_query(query_info, machine)) {
                                    ensure_logging_connection();
                                    log_cb_query(query_info, machine);
                                }
                            }


                }
            }
            return query_info;
        }
    }

    // deflexical
    private static final SubLSymbol $kb_logging_cb_query_event_listener$ = makeSymbol("*KB-LOGGING-CB-QUERY-EVENT-LISTENER*");





    // deflexical
    private static final SubLSymbol $unlexified_table$ = makeSymbol("*UNLEXIFIED-TABLE*");

    /**
     * Ensure everything is ready to start writing unlexified terms to the database
     */
    public static final SubLObject initialize_unlex_logging() {
        $unlex_logging_connection$.setGlobalValue(sdbc.new_sql_connection($$$kbLogging, $cyc_user_login$.getGlobalValue(), $cyc_user_passwd$.getGlobalValue(), list($DBMS_SERVER, $kb_logging_dbms_server$.getGlobalValue(), $PORT, $kb_logging_port$.getGlobalValue(), $SUBPROTOCOL, $kb_logging_subprotocol$.getGlobalValue(), $PROXY_SERVER, $kb_logging_proxy_server$.getGlobalValue())));
        $unlex_logging_statement$.setGlobalValue(sdbc.sqlc_create_statement($unlex_logging_connection$.getGlobalValue()));
        return T;
    }

    /**
     * Clean up after done with logging of unlexified terms
     */
    public static final SubLObject finalize_unlex_logging() {
        if (NIL != sdbc.sql_open_connection_p($unlex_logging_connection$.getGlobalValue())) {
            sdbc.sqls_close($unlex_logging_statement$.getGlobalValue());
            sdbc.sqlc_close($unlex_logging_connection$.getGlobalValue());
        }
        $unlex_logging_connection$.setGlobalValue(NIL);
        $unlex_logging_statement$.setGlobalValue(NIL);
        return NIL;
    }

    /**
     * Logs the fact that FORT is not lexified in LANGUAGE-MT and DOMAIN-MT to the database
     */
    public static final SubLObject log_unlexified_fort(SubLObject fort, SubLObject language_mt, SubLObject domain_mt, SubLObject predicates) {
        {
            SubLObject rs = sdbc.sqls_execute_query($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt37$SELECT_count_total__count_since_f, new SubLObject[]{ $unlexified_table$.getGlobalValue(), kb_paths.fort_name(fort), kb_paths.fort_name(language_mt), kb_paths.fort_name(domain_mt), write_to_string(predicates, EMPTY_SUBL_OBJECT_ARRAY), get_pedigree() }), UNPROVIDED);
            SubLObject count_total = NIL;
            SubLObject count_since_fixed = NIL;
            SubLObject kb = NIL;
            if (rs.eql($CLOSED)) {
                sleep(THREE_INTEGER);
                ensure_unlexified_logging_initialized();
                rs = sdbc.sqls_execute_query($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt37$SELECT_count_total__count_since_f, new SubLObject[]{ $unlexified_table$.getGlobalValue(), kb_paths.fort_name(fort), kb_paths.fort_name(language_mt), kb_paths.fort_name(domain_mt), write_to_string(predicates, EMPTY_SUBL_OBJECT_ARRAY), get_pedigree() }), UNPROVIDED);
            }
            if (NIL != sdbc.sql_result_set_p(rs)) {
                if (NIL != sdbc.sqlrs_next(rs)) {
                    count_total = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                    count_since_fixed = sdbc.sqlrs_get_object(rs, TWO_INTEGER);
                    kb = sdbc.sqlrs_get_object(rs, THREE_INTEGER);
                    sdbc.sqls_execute_update($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt39$UPDATE__a_SET_count_total____a__c, new SubLObject[]{ $unlexified_table$.getGlobalValue(), number_utilities.f_1X(count_total), number_utilities.f_1X(count_since_fixed), kb_newer(kb_id(), kb), kb_paths.fort_name(fort), kb_paths.fort_name(language_mt), kb_paths.fort_name(domain_mt), write_to_string(predicates, EMPTY_SUBL_OBJECT_ARRAY), get_pedigree() }));
                    return $UPDATED;
                } else {
                    sdbc.sqls_execute_update($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt41$INSERT_INTO__a_VALUES__s___s___s_, new SubLObject[]{ $unlexified_table$.getGlobalValue(), kb_paths.fort_name(fort), kb_paths.fort_name(language_mt), kb_paths.fort_name(domain_mt), write_to_string(predicates, EMPTY_SUBL_OBJECT_ARRAY), ONE_INTEGER, ONE_INTEGER, kb_id(), get_pedigree() }));
                    return $INSERTED;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject unlexified_term_discovery_event_action(SubLObject event, SubLObject param) {
        if (param == UNPROVIDED) {
            param = NIL;
        }
        {
            SubLObject v_class = event_model.event_class(event);
            if (v_class == $UNLEXIFIED_TERM_DISCOVERY_EVENT) {
                {
                    SubLObject v_term = event_model.event_message(event).first();
                    SubLObject language_mt = second(event_model.event_message(event));
                    SubLObject domain_mt = third(event_model.event_message(event));
                    SubLObject predicates = fourth(event_model.event_message(event));
                    ensure_unlexified_logging_initialized();
                    log_unlexified_fort(v_term, language_mt, domain_mt, predicates);
                    return v_term;
                }
            }
        }
        return NIL;
    }

    /**
     * Sets the 'count_since_fixed' column to 0, indicating that FORT has now been lexified
     *
     * @return positive-integer-p; the number of rows affected
     */
    public static final SubLObject unlexified_db_reset(SubLObject fort) {
        SubLTrampolineFile.checkType(function_terms.naut_to_nart(fort), FORT_P);
        ensure_unlexified_logging_initialized();
        return sdbc.sqls_execute_update($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt45$UPDATE__a_SET_count_since_fixed__, $unlexified_table$.getGlobalValue(), kb_paths.fort_name(function_terms.naut_to_nart(fort))));
    }

    /**
     *
     *
     * @return sql-result-set-p; a result set containing all rows from the unlexified db that
    have been reported as unlexified more than N times in all mts matching MT-WILDCARD
     */
    public static final SubLObject unlexified_db_reportedG(SubLObject n, SubLObject mt_wildcard) {
        SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.checkType(mt_wildcard, STRINGP);
        ensure_unlexified_logging_initialized();
        return sdbc.sqls_execute_query($unlex_logging_statement$.getGlobalValue(), format(NIL, $str_alt48$SELECT___FROM__a_WHERE_languageMt, new SubLObject[]{ $unlexified_table$.getGlobalValue(), mt_wildcard, n }), UNPROVIDED);
    }

    /**
     * Ensure that we're ready to log an unlexified term
     */
    public static final SubLObject ensure_unlexified_logging_initialized() {
        if (NIL == sdbc.sql_open_connection_p($unlex_logging_connection$.getGlobalValue())) {
            initialize_unlex_logging();
        }
        return T;
    }

    public static final SubLObject kb_id() {
        return operation_communication.kb_version_string();
    }

    /**
     * Returns the newer kb id among KB1 and KB2
     */
    public static final SubLObject kb_newer(SubLObject kb1, SubLObject kb2) {
        return string_utilities.strip_trailer(write_to_string(max(read_from_string(kb1, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), read_from_string(kb2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), EMPTY_SUBL_OBJECT_ARRAY), $$$d0);
    }

    /**
     * Return the kind of pedigree we're in (IKB, RKF, etc)
     */
    public static final SubLObject get_pedigree() {
        return symbol_name(control_vars.kb_pedigree());
    }











    // defparameter
    private static final SubLSymbol $p_user_host$ = makeSymbol("*P-USER-HOST*");

    // defparameter
    private static final SubLSymbol $p_user_port$ = makeSymbol("*P-USER-PORT*");

    // defparameter
    private static final SubLSymbol $p_user_cyclist$ = makeSymbol("*P-USER-CYCLIST*");

    // defparameter
    private static final SubLSymbol $p_user_system$ = makeSymbol("*P-USER-SYSTEM*");

    // defparameter
    private static final SubLSymbol $p_user_kb$ = makeSymbol("*P-USER-KB*");

    // defparameter
    private static final SubLSymbol $p_user_purpose$ = makeSymbol("*P-USER-PURPOSE*");

    // defconstant
    private static final SubLSymbol $session_table$ = makeSymbol("*SESSION-TABLE*");

    // defconstant
    private static final SubLSymbol $error_table$ = makeSymbol("*ERROR-TABLE*");

    // defconstant
    private static final SubLSymbol $error_test_script_table$ = makeSymbol("*ERROR-TEST-SCRIPT-TABLE*");

    // defconstant
    private static final SubLSymbol $test_run_history_table$ = makeSymbol("*TEST-RUN-HISTORY-TABLE*");

    // defconstant
    private static final SubLSymbol $test_result_table$ = makeSymbol("*TEST-RESULT-TABLE*");

    // defconstant
    private static final SubLSymbol $att_type_table$ = makeSymbol("*ATT-TYPE-TABLE*");

    // defconstant
    private static final SubLSymbol $attributes_table$ = makeSymbol("*ATTRIBUTES-TABLE*");

    // defconstant
    private static final SubLSymbol $att_item_table$ = makeSymbol("*ATT-ITEM-TABLE*");

    // defconstant
    private static final SubLSymbol $status_table$ = makeSymbol("*STATUS-TABLE*");

    // defconstant
    private static final SubLSymbol $fix_table$ = makeSymbol("*FIX-TABLE*");

    // defconstant
    private static final SubLSymbol $fix_method_table$ = makeSymbol("*FIX-METHOD-TABLE*");

    // defconstant
    private static final SubLSymbol $fix_user_table$ = makeSymbol("*FIX-USER-TABLE*");

    // defconstant
    private static final SubLSymbol $att_type_p_method_preferred$ = makeSymbol("*ATT-TYPE-P-METHOD-PREFERRED*");

    // defconstant
    private static final SubLSymbol $att_type_p_method_used$ = makeSymbol("*ATT-TYPE-P-METHOD-USED*");

    // defconstant
    private static final SubLSymbol $att_type_p_produced$ = makeSymbol("*ATT-TYPE-P-PRODUCED*");

    // defconstant
    private static final SubLSymbol $att_type_language_mt$ = makeSymbol("*ATT-TYPE-LANGUAGE-MT*");

    // defconstant
    private static final SubLSymbol $att_type_domain_mt$ = makeSymbol("*ATT-TYPE-DOMAIN-MT*");

    // defconstant
    private static final SubLSymbol $att_type_p_mode$ = makeSymbol("*ATT-TYPE-P-MODE*");

    // defconstant
    private static final SubLSymbol $att_type_error_cycl$ = makeSymbol("*ATT-TYPE-ERROR-CYCL*");

    // defconstant
    private static final SubLSymbol $att_type_error_value$ = makeSymbol("*ATT-TYPE-ERROR-VALUE*");

    // defconstant
    private static final SubLSymbol $att_type_speech_part_pred$ = makeSymbol("*ATT-TYPE-SPEECH-PART-PRED*");

    // defconstant
    private static final SubLSymbol $att_type_error_type$ = makeSymbol("*ATT-TYPE-ERROR-TYPE*");

    // defconstant
    private static final SubLSymbol $att_type_error_value_type$ = makeSymbol("*ATT-TYPE-ERROR-VALUE-TYPE*");

    // defconstant
    private static final SubLSymbol $status_open$ = makeSymbol("*STATUS-OPEN*");

    // defconstant
    private static final SubLSymbol $status_fixed$ = makeSymbol("*STATUS-FIXED*");

    // defconstant
    private static final SubLSymbol $status_invalid$ = makeSymbol("*STATUS-INVALID*");

    // defconstant
    private static final SubLSymbol $status_pending$ = makeSymbol("*STATUS-PENDING*");

    /**
     * Establishes a new connection to the kbLogging database and creates a statement used to write and read to and from the database
     */
    public static final SubLObject new_paraphrase_logging_connection() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $paraphrase_logging_connection$.setDynamicValue(sdbc.new_sql_connection($$$kbLogging, $paraphrase_user_login$.getDynamicValue(thread), $paraphrase_user_passwd$.getDynamicValue(thread), list($DBMS_SERVER, $str_alt6$db_server_cyc_com, $PORT, $int$9999, $SUBPROTOCOL, $$$mysql)), thread);
            if (NIL != sdbc.sql_open_connection_p($paraphrase_logging_connection$.getDynamicValue(thread))) {
                $paraphrase_logging_statement$.setDynamicValue(sdbc.sqlc_create_statement($paraphrase_logging_connection$.getDynamicValue(thread)), thread);
            }
            return $paraphrase_logging_connection$.getDynamicValue(thread);
        }
    }

    /**
     * Returns t if OBJECT is an open working connection to the kbLogging database
     */
    public static final SubLObject paraphrase_connection_p(SubLObject v_object) {
        return makeBoolean(((NIL != sdbc.sql_connection_p(v_object)) && (NIL != sdbc.sqlc_open_p(v_object))) && sdbc.sqlc_db(v_object).equal($$$kbLogging));
    }

    /**
     * Closes an open paraphrase logging connection
     *
     * @unknown nancy
     */
    public static final SubLObject close_paraphrase_connection() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == paraphrase_connection_p($paraphrase_logging_connection$.getDynamicValue(thread))) {
                Errors.warn($str_alt73$There_is_no_paraphrase_logging_co);
            } else {
                sdbc.sqlc_close($paraphrase_logging_connection$.getDynamicValue(thread));
                sdbc.sqlc_close($paraphrase_logging_statement$.getDynamicValue(thread));
            }
            $paraphrase_logging_connection$.setDynamicValue(NIL, thread);
            $paraphrase_logging_statement$.setDynamicValue(NIL, thread);
            return NIL;
        }
    }

    /**
     *
     *
     * @param P-ERROR-LIST
     * 		p-list specifying the paraphrase error information; see example above
     * @param HOST
     * 		STRING, user's machine name
     * @param PORT;
     * 		INTEGER, port cyc image is running on
     * @param CYCLIST;
     * 		STRING, user's cyclist name, default is Unknown
     * @param SYSTEM;
     * 		FLOAT, system of cyc image, default is 0
     * @param KB;
     * 		INTEGER, KB of cyc image, default us 0
     * @param PURPOSE;
     * 		STRING, general purpose of user, default is Unknown
     * @param DESCRIPTION;
     * 		STRING, optional description of the paraphrase error
     * @return INTEGER; error_id of this error
    Stores the paraphrase error and returns the new error_id.
     * @unknown nancy
     */
    public static final SubLObject store_paraphrase_error(SubLObject p_error_list, SubLObject system, SubLObject purpose, SubLObject description) {
        if (system == UNPROVIDED) {
            system = NIL;
        }
        if (purpose == UNPROVIDED) {
            purpose = NIL;
        }
        if (description == UNPROVIDED) {
            description = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject error_id = NIL;
                new_paraphrase_logging_connection();
                {
                    SubLObject _prev_bind_0 = $p_user_date$.currentBinding(thread);
                    try {
                        $p_user_date$.bind(numeric_date_utilities.datetime_string_from_template(get_universal_time(), $str_alt74$yyyy_mm_dd_hh_mm_ss), thread);
                        {
                            SubLObject cyclist = (NIL != constant_handles.constant_p(api_control_vars.$the_cyclist$.getDynamicValue(thread))) ? ((SubLObject) (api_control_vars.$the_cyclist$.getDynamicValue(thread))) : $p_user_cyclist$.getDynamicValue(thread);
                            SubLObject host = Environment.get_machine_name($p_user_host$.getDynamicValue(thread));
                            SubLObject port = system_parameters.$base_tcp_port$.getDynamicValue(thread);
                            {
                                SubLObject _prev_bind_0_1 = $p_user_system$.currentBinding(thread);
                                try {
                                    $p_user_system$.bind(NIL != system ? ((SubLObject) (system)) : $p_user_system$.getDynamicValue(thread), thread);
                                    {
                                        SubLObject kb = (NIL != control_vars.kb_loaded()) ? ((SubLObject) (control_vars.kb_loaded())) : $p_user_kb$.getDynamicValue(thread);
                                        {
                                            SubLObject _prev_bind_0_2 = $p_user_purpose$.currentBinding(thread);
                                            try {
                                                $p_user_purpose$.bind(NIL != purpose ? ((SubLObject) (purpose)) : $p_user_purpose$.getDynamicValue(thread), thread);
                                                store_p_session($p_user_date$.getDynamicValue(thread), cyclist, host, port, $p_user_system$.getDynamicValue(thread), kb, $p_user_purpose$.getDynamicValue(thread));
                                            } finally {
                                                $p_user_purpose$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    $p_user_system$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        $p_user_date$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject session_id = get_max_session_id();
                    if (NIL != description) {
                        store_p_error_with_description(session_id, description, UNPROVIDED);
                    } else {
                        store_p_error(session_id, UNPROVIDED);
                    }
                }
                error_id = get_max_error_id();
                {
                    SubLObject att_type_id = NIL;
                    SubLObject cdolist_list_var = p_error_list;
                    SubLObject indicator = NIL;
                    for (indicator = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , indicator = cdolist_list_var.first()) {
                        if (indicator.isKeyword()) {
                            {
                                SubLObject pcase_var = indicator;
                                if (pcase_var.eql($P_METHODS_PREFERRED)) {
                                    att_type_id = $att_type_p_method_preferred$.getGlobalValue();
                                } else
                                    if (pcase_var.eql($P_METHOD_USED)) {
                                        att_type_id = $att_type_p_method_used$.getGlobalValue();
                                    } else
                                        if (pcase_var.eql($P_PRODUCED)) {
                                            att_type_id = $att_type_p_produced$.getGlobalValue();
                                        } else
                                            if (pcase_var.eql($ERROR_CYCL)) {
                                                att_type_id = $att_type_error_cycl$.getGlobalValue();
                                            } else
                                                if (pcase_var.eql($ERROR_VALUE)) {
                                                    att_type_id = $att_type_error_value$.getGlobalValue();
                                                } else
                                                    if (pcase_var.eql($SPEECH_PART_PREDS)) {
                                                        att_type_id = $att_type_speech_part_pred$.getGlobalValue();
                                                    } else
                                                        if (pcase_var.eql($LANGUAGE_MT)) {
                                                            att_type_id = $att_type_language_mt$.getGlobalValue();
                                                        } else
                                                            if (pcase_var.eql($DOMAIN_MT)) {
                                                                att_type_id = $att_type_domain_mt$.getGlobalValue();
                                                            } else
                                                                if (pcase_var.eql($P_MODE)) {
                                                                    att_type_id = $att_type_p_mode$.getGlobalValue();
                                                                } else
                                                                    if (pcase_var.eql($ERROR_VALUE_TYPE)) {
                                                                        att_type_id = $att_type_error_value_type$.getGlobalValue();
                                                                    }









                            }
                            {
                                SubLObject att = getf(p_error_list, indicator, UNPROVIDED);
                                SubLObject att_string = (att.isString()) ? ((SubLObject) (att)) : prin1_to_string(att);
                                SubLObject cycl_id = NIL;
                                SubLObject att_item_id = NIL;
                                if (NIL != att_item_in_dbP(att_type_id, att_string)) {
                                    att_item_id = get_att_item_id(att_type_id, att_string);
                                } else {
                                    if ((NIL != forts.fort_p(att)) || (NIL != forts.fort_p(narts_high.find_nart(att)))) {
                                        cycl_id = Guids.guid_to_string(constants_high.constant_guid(att));
                                    } else
                                        if (NIL != assertion_handles.assertion_p(att)) {
                                            cycl_id = prin1_to_string(assertion_handles.assertion_id(att));
                                        } else {
                                            cycl_id = NIL;
                                        }

                                    if (NIL != cycl_id) {
                                        store_att_item_with_cycl_id(att_type_id, att_string, cycl_id);
                                    } else {
                                        store_att_item_without_cycl_id(att_type_id, att_string);
                                    }
                                    att_item_id = get_att_item_id(att_type_id, att_string);
                                }
                                store_attribute(att_item_id, error_id);
                            }
                        }
                    }
                }
                return error_id;
            }
        }
    }

    /**
     *
     *
     * @param HOST
     * 		STRING, user's machine name
     * @param PORT;
     * 		INTEGER, port cyc image is running on
     * @param CYCLIST;
     * 		STRING, user's cyclist name, default is Unknown
     * @param SYSTEM;
     * 		FLOAT, system of cyc image, default is 0
     * @param KB;
     * 		INTEGER, KB of cyc image, default us 0
     * @param PURPOSE;
     * 		STRING, general purpose of user, default is Unknown
     * 		Stores a new session.
     * @unknown nancy
     */
    public static final SubLObject store_p_session(SubLObject date, SubLObject cyclist, SubLObject host, SubLObject port, SubLObject system, SubLObject kb, SubLObject purpose) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt85$INSERT_INTO__a__date__cyclist__ho, new SubLObject[]{ $session_table$.getGlobalValue(), date, cyclist, host, port, system, kb, purpose }));
            return NIL;
        }
    }

    /**
     *
     *
     * @param SESSION-ID;
     * 		INTEGER, id of current session
     * @param STATUS-ID;
     * 		INTEGER, id of current status of error, default 1=OPEN
     * @unknown nancy
     */
    public static final SubLObject store_p_error(SubLObject session_id, SubLObject status_id) {
        if (status_id == UNPROVIDED) {
            status_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_status_id = (NIL != status_id) ? ((SubLObject) (status_id)) : $status_open$.getGlobalValue();
                sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt86$INSERT_INTO__a__session_id__statu, new SubLObject[]{ $error_table$.getGlobalValue(), session_id, new_status_id }));
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param SESSION-ID;
     * 		INTEGER, id of current session
     * @param DESCRIPTION;
     * 		STRING, option description of current error
     * @param STATUS-ID;
     * 		INTEGER, id of current status of error, default 1=OPEN
     * @unknown nancy
     */
    public static final SubLObject store_p_error_with_description(SubLObject session_id, SubLObject description, SubLObject status_id) {
        if (status_id == UNPROVIDED) {
            status_id = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_status_id = (NIL != status_id) ? ((SubLObject) (status_id)) : $status_open$.getGlobalValue();
                sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt87$INSERT_INTO__a__session_id__statu, new SubLObject[]{ $error_table$.getGlobalValue(), session_id, new_status_id, description }));
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param ATT-TYE-ID;
     * 		INTEGER, id of the attribute type of ATT-ITEM
     * @param ATT-ITEM;
     * 		STRING, att_item, e.g. #$EnglishMt
     * @param CYCL-ID;
     * 		STRING, the guid of a constant or the id of an assertion, converted to a string. Need to convert back when checking against the KB.
     * @unknown nancy
     */
    public static final SubLObject store_att_item_with_cycl_id(SubLObject att_type_id, SubLObject att_item, SubLObject cycl_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt88$INSERT_INTO__a__att_type_id__cycl, new SubLObject[]{ $att_item_table$.getGlobalValue(), att_type_id, cycl_id, att_item }));
            return NIL;
        }
    }

    /**
     *
     *
     * @param ATT-TYE-ID;
     * 		INTEGER, id of the attribute type of ATT-ITEM
     * @param ATT-ITEM;
     * 		STRING, att_item, e.g. #$EnglishMt
     * @unknown nancy
     */
    public static final SubLObject store_att_item_without_cycl_id(SubLObject att_type_id, SubLObject att_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt89$INSERT_INTO__a__att_type_id__att_, new SubLObject[]{ $att_item_table$.getGlobalValue(), att_type_id, att_item }));
            return NIL;
        }
    }

    /**
     *
     *
     * @param ATT-ITEM-ID;
     * 		INTEGER, id of att_item, e.g. #$EnglishMt
     * @param ERROR-ID;
     * 		INTEGER, id of error for which this is an attribute
     * @unknown nancy
     */
    public static final SubLObject store_attribute(SubLObject att_item_id, SubLObject error_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sdbc.sqls_execute_update($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt90$INSERT_INTO__a__att_item_id__erro, new SubLObject[]{ $attributes_table$.getGlobalValue(), att_item_id, error_id }));
            return NIL;
        }
    }

    /**
     *
     *
     * @return INTEGER; the latest session_id in the session table
     * @unknown nancy
     */
    public static final SubLObject get_max_session_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt91$SELECT_max_session_id__as_session, $session_table$.getGlobalValue()), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    Errors.warn($str_alt92$There_are_no_session_ids);
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return INTEGER; the latest error_id in the error table
     * @unknown nancy
     */
    public static final SubLObject get_max_error_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt93$SELECT_max_error_id__as_error_id_, $error_table$.getGlobalValue()), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    Errors.warn($str_alt94$There_are_no_error_ids);
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @param ATT-TYPE-ID;
     * 		INTEGER the att_type_id of the att_item
     * @param ATT-ITEM;
     * 		STRING, the name of the attribute item
     * @return BOOLEAN; t if the att_item is already in the DB
     * @unknown nancy
     */
    public static final SubLObject att_item_in_dbP(SubLObject att_type_id, SubLObject att_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt95$select_count_att_item_id__as_att_, new SubLObject[]{ $att_item_table$.getGlobalValue(), att_type_id, att_item }), UNPROVIDED);
                sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                if (ans != ZERO_INTEGER) {
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param ATT-TYPE-ID;
     * 		INTEGER the att_type_id of the att_item
     * @param ATT-ITEM;
     * 		STRING, the name of the attribute item
     * @return INTEGER; the att_item_id for att_item
     * @unknown nancy
     */
    public static final SubLObject get_att_item_id(SubLObject att_type_id, SubLObject att_item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject rs = sdbc.sqls_execute_query($paraphrase_logging_statement$.getDynamicValue(thread), format(NIL, $str_alt96$SELECT_att_item_id_from__a_where_, new SubLObject[]{ $att_item_table$.getGlobalValue(), att_type_id, att_item }), UNPROVIDED);
                if (NIL != sdbc.sqlrs_emptyP(rs)) {
                    Errors.warn($str_alt97$This_att_item_is_not_in_the_DB);
                } else {
                    sdbc.sqlrs_absolute(rs, ONE_INTEGER);
                    ans = sdbc.sqlrs_get_object(rs, ONE_INTEGER);
                }
                return ans;
            }
        }
    }

    public static final SubLObject declare_kb_logging_file() {
        declareMacro("with_exclusive_sql_connection_access", "WITH-EXCLUSIVE-SQL-CONNECTION-ACCESS");
        declareFunction("new_logging_connection", "NEW-LOGGING-CONNECTION", 0, 0, false);
        declareFunction("ensure_logging_connection", "ENSURE-LOGGING-CONNECTION", 0, 0, false);
        declareFunction("logging_connection_p", "LOGGING-CONNECTION-P", 1, 0, false);
        declareFunction("new_session_id", "NEW-SESSION-ID", 0, 0, false);
        declareFunction("ensure_session_id", "ENSURE-SESSION-ID", 1, 0, false);
        declareFunction("register_session_id", "REGISTER-SESSION-ID", 2, 0, false);
        declareFunction("log_term", "LOG-TERM", 2, 0, false);
        declareFunction("sql_stringify", "SQL-STRINGIFY", 1, 0, false);
        declareFunction("log_cb_ask", "LOG-CB-ASK", 2, 0, false);
        declareFunction("log_cb_query", "LOG-CB-QUERY", 2, 0, false);
        declareFunction("string_to_integer_or_minus_1", "STRING-TO-INTEGER-OR-MINUS-1", 1, 0, false);
        declareFunction("get_session_id", "GET-SESSION-ID", 1, 0, false);
        declareFunction("get_time_stamp", "GET-TIME-STAMP", 0, 0, false);
        declareFunction("get_guid_string", "GET-GUID-STRING", 1, 0, false);
        declareFunction("finalize_logging_connection", "FINALIZE-LOGGING-CONNECTION", 0, 0, false);
        declareFunction("finalize_session_id", "FINALIZE-SESSION-ID", 1, 0, false);
        declareFunction("cb_login_action", "CB-LOGIN-ACTION", 1, 1, false);
        declareFunction("cb_constant_selection_action", "CB-CONSTANT-SELECTION-ACTION", 1, 1, false);
        declareFunction("cb_ask_action", "CB-ASK-ACTION", 1, 1, false);
        declareFunction("cb_query_action", "CB-QUERY-ACTION", 1, 1, false);
        declareFunction("initialize_unlex_logging", "INITIALIZE-UNLEX-LOGGING", 0, 0, false);
        declareFunction("finalize_unlex_logging", "FINALIZE-UNLEX-LOGGING", 0, 0, false);
        declareFunction("log_unlexified_fort", "LOG-UNLEXIFIED-FORT", 4, 0, false);
        declareFunction("unlexified_term_discovery_event_action", "UNLEXIFIED-TERM-DISCOVERY-EVENT-ACTION", 1, 1, false);
        declareFunction("unlexified_db_reset", "UNLEXIFIED-DB-RESET", 1, 0, false);
        declareFunction("unlexified_db_reportedG", "UNLEXIFIED-DB-REPORTED>", 2, 0, false);
        declareFunction("ensure_unlexified_logging_initialized", "ENSURE-UNLEXIFIED-LOGGING-INITIALIZED", 0, 0, false);
        declareFunction("kb_id", "KB-ID", 0, 0, false);
        declareFunction("kb_newer", "KB-NEWER", 2, 0, false);
        declareFunction("get_pedigree", "GET-PEDIGREE", 0, 0, false);
        declareFunction("new_paraphrase_logging_connection", "NEW-PARAPHRASE-LOGGING-CONNECTION", 0, 0, false);
        declareFunction("paraphrase_connection_p", "PARAPHRASE-CONNECTION-P", 1, 0, false);
        declareFunction("close_paraphrase_connection", "CLOSE-PARAPHRASE-CONNECTION", 0, 0, false);
        declareFunction("store_paraphrase_error", "STORE-PARAPHRASE-ERROR", 1, 3, false);
        declareFunction("store_p_session", "STORE-P-SESSION", 7, 0, false);
        declareFunction("store_p_error", "STORE-P-ERROR", 1, 1, false);
        declareFunction("store_p_error_with_description", "STORE-P-ERROR-WITH-DESCRIPTION", 2, 1, false);
        declareFunction("store_att_item_with_cycl_id", "STORE-ATT-ITEM-WITH-CYCL-ID", 3, 0, false);
        declareFunction("store_att_item_without_cycl_id", "STORE-ATT-ITEM-WITHOUT-CYCL-ID", 2, 0, false);
        declareFunction("store_attribute", "STORE-ATTRIBUTE", 2, 0, false);
        declareFunction("get_max_session_id", "GET-MAX-SESSION-ID", 0, 0, false);
        declareFunction("get_max_error_id", "GET-MAX-ERROR-ID", 0, 0, false);
        declareFunction("att_item_in_dbP", "ATT-ITEM-IN-DB?", 2, 0, false);
        declareFunction("get_att_item_id", "GET-ATT-ITEM-ID", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_logging_file() {
        deflexical("*SQL-CONNECTION-LOCK*", make_lock($$$SQL_Connection));
        deflexical("*LOGGING-CONNECTION*", NIL);
        deflexical("*LOGGING-STATEMENT*", NIL);
        deflexical("*SESSION-ID-MAP*", dictionary.new_dictionary(EQUALP, UNPROVIDED));
        deflexical("*SQL-SESSION-TABLE*", $$$nextsession);
        deflexical("*SQL-LOGGING-TABLE*", $$$terms);
        deflexical("*CYC-USER-LOGIN*", $$$cbUser);
        deflexical("*CYC-USER-PASSWD*", $$$cbUser);
        deflexical("*KB-LOGGING-DBMS-SERVER*", $str_alt6$db_server_cyc_com);
        deflexical("*KB-LOGGING-SUBPROTOCOL*", $$$mysql);
        deflexical("*KB-LOGGING-PROXY-SERVER*", $str_alt6$db_server_cyc_com);
        deflexical("*KB-LOGGING-PORT*", $int$9999);
        deflexical("*LOG-CLICKS*", NIL);
        deflexical("*SQL-ASK-LOGGING-TABLE*", $str_alt17$CB_ASK_2);
        deflexical("*SQL-QUERY-LOGGING-TABLE*", $str_alt18$CB_QUERY_1);
        deflexical("*LOGGING-ASKS-ENABLED?*", NIL);
        deflexical("*KB-LOGGING-CB-LOGIN-EVENT-LISTENER*", event_broker.describe_funcall_listener($CYC_BROWSER_LOGIN_EVENT, CB_LOGIN_ACTION, UNPROVIDED, UNPROVIDED));
        deflexical("*KB-LOGGING-CB-CONSTANT-SELECTION-EVENT-LISTENER*", event_broker.describe_funcall_listener($CYC_BROWSER_CONSTANT_SELECTION_EVENT, CB_CONSTANT_SELECTION_ACTION, UNPROVIDED, UNPROVIDED));
        deflexical("*KB-LOGGING-CB-ASK-EVENT-LISTENER*", event_broker.describe_funcall_listener($CYC_BROWSER_ASK_EVENT, CB_ASK_ACTION, UNPROVIDED, UNPROVIDED));
        deflexical("*KB-LOGGING-CB-QUERY-EVENT-LISTENER*", event_broker.describe_funcall_listener($CYC_BROWSER_QUERY_EVENT, CB_QUERY_ACTION, UNPROVIDED, UNPROVIDED));
        deflexical("*UNLEX-LOGGING-CONNECTION*", NIL != boundp($unlex_logging_connection$) ? ((SubLObject) ($unlex_logging_connection$.getGlobalValue())) : NIL);
        deflexical("*UNLEX-LOGGING-STATEMENT*", NIL != boundp($unlex_logging_statement$) ? ((SubLObject) ($unlex_logging_statement$.getGlobalValue())) : NIL);
        deflexical("*UNLEXIFIED-TABLE*", $$$unlexified2);
        defparameter("*PARAPHRASE-LOGGING-CONNECTION*", NIL);
        defparameter("*PARAPHRASE-LOGGING-STATEMENT*", NIL);
        defparameter("*PARAPHRASE-USER-LOGIN*", $str_alt54$nancy_localhost);
        defparameter("*PARAPHRASE-USER-PASSWD*", $$$freddie);
        defparameter("*P-USER-DATE*", NIL);
        defparameter("*P-USER-HOST*", $$$Unknown);
        defparameter("*P-USER-PORT*", ZERO_INTEGER);
        defparameter("*P-USER-CYCLIST*", $$$Unknown);
        defparameter("*P-USER-SYSTEM*", $float$0_0);
        defparameter("*P-USER-KB*", ZERO_INTEGER);
        defparameter("*P-USER-PURPOSE*", $$$Unknown);
        defconstant("*SESSION-TABLE*", $$$session);
        defconstant("*ERROR-TABLE*", $$$error);
        defconstant("*ERROR-TEST-SCRIPT-TABLE*", $str_alt63$error_test_script);
        defconstant("*TEST-RUN-HISTORY-TABLE*", $str_alt64$test_run_history);
        defconstant("*TEST-RESULT-TABLE*", $str_alt65$test_result);
        defconstant("*ATT-TYPE-TABLE*", $str_alt66$att_type);
        defconstant("*ATTRIBUTES-TABLE*", $$$attributes);
        defconstant("*ATT-ITEM-TABLE*", $str_alt68$att_item);
        defconstant("*STATUS-TABLE*", $$$status);
        defconstant("*FIX-TABLE*", $$$fix);
        defconstant("*FIX-METHOD-TABLE*", $str_alt71$fix_method);
        defconstant("*FIX-USER-TABLE*", $str_alt72$fix_user);
        defconstant("*ATT-TYPE-P-METHOD-PREFERRED*", ONE_INTEGER);
        defconstant("*ATT-TYPE-P-METHOD-USED*", TWO_INTEGER);
        defconstant("*ATT-TYPE-P-PRODUCED*", THREE_INTEGER);
        defconstant("*ATT-TYPE-LANGUAGE-MT*", FOUR_INTEGER);
        defconstant("*ATT-TYPE-DOMAIN-MT*", FIVE_INTEGER);
        defconstant("*ATT-TYPE-P-MODE*", SIX_INTEGER);
        defconstant("*ATT-TYPE-ERROR-CYCL*", SEVEN_INTEGER);
        defconstant("*ATT-TYPE-ERROR-VALUE*", EIGHT_INTEGER);
        defconstant("*ATT-TYPE-SPEECH-PART-PRED*", NINE_INTEGER);
        defconstant("*ATT-TYPE-ERROR-TYPE*", ELEVEN_INTEGER);
        defconstant("*ATT-TYPE-ERROR-VALUE-TYPE*", TWELVE_INTEGER);
        defconstant("*STATUS-OPEN*", ONE_INTEGER);
        defconstant("*STATUS-FIXED*", TWO_INTEGER);
        defconstant("*STATUS-INVALID*", THREE_INTEGER);
        defconstant("*STATUS-PENDING*", FOUR_INTEGER);
        return NIL;
    }

    public static final SubLObject setup_kb_logging_file() {
                cb_events.register_listener_with_cb_event_dispatcher($kb_logging_cb_login_event_listener$.getGlobalValue());
        cb_events.register_listener_with_cb_event_dispatcher($kb_logging_cb_constant_selection_event_listener$.getGlobalValue());
        cb_events.register_listener_with_cb_event_dispatcher($kb_logging_cb_ask_event_listener$.getGlobalValue());
        cb_events.register_listener_with_cb_event_dispatcher($kb_logging_cb_query_event_listener$.getGlobalValue());
        subl_macro_promotions.declare_defglobal($unlex_logging_connection$);
        subl_macro_promotions.declare_defglobal($unlex_logging_statement$);
        access_macros.define_obsolete_register(KB_ID, $list_alt50);
        utilities_macros.register_html_state_variable($paraphrase_logging_connection$);
        utilities_macros.register_html_state_variable($paraphrase_logging_statement$);
        utilities_macros.register_html_state_variable($paraphrase_user_login$);
        utilities_macros.register_html_state_variable($paraphrase_user_passwd$);
        utilities_macros.register_html_state_variable($p_user_date$);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(makeSymbol("*SQL-CONNECTION-LOCK*"));

    static private final SubLString $$$SQL_Connection = makeString("SQL Connection");

    static private final SubLString $$$nextsession = makeString("nextsession");

    static private final SubLString $$$terms = makeString("terms");

    static private final SubLString $$$cbUser = makeString("cbUser");

    static private final SubLString $str_alt6$db_server_cyc_com = makeString("db-server.cyc.com");

    static private final SubLString $$$mysql = makeString("mysql");

    public static final SubLInteger $int$9999 = makeInteger(9999);

    static private final SubLString $$$kbLogging = makeString("kbLogging");









    static private final SubLString $str_alt14$SELECT_next_FROM__a_WHERE_only___ = makeString("SELECT next FROM ~a WHERE only = 1");

    static private final SubLString $str_alt15$UPDATE__a_SET_next____a_WHERE_onl = makeString("UPDATE ~a SET next = ~a WHERE only = 1");

    static private final SubLString $str_alt16$INSERT_INTO__a_VALUES__a___a___s_ = makeString("INSERT INTO ~a VALUES(~a, ~a, ~s)");

    static private final SubLString $str_alt17$CB_ASK_2 = makeString("CB_ASK_2");

    static private final SubLString $str_alt18$CB_QUERY_1 = makeString("CB_QUERY_1");

    static private final SubLList $list_alt19 = list(makeSymbol("QUERY-SENTENCE"), makeSymbol("MT"), makeSymbol("BACKCHAIN"), makeSymbol("NUMBER"), makeSymbol("TIME"), makeSymbol("DEPTH"));

    static private final SubLString $str_alt20$INSERT_INTO__a_VALUES__s___s___d_ = makeString("INSERT INTO ~a VALUES(~s, ~s, ~d, ~d, ~d, ~d, ~d, ~d, ~s)");

    static private final SubLList $list_alt21 = list(makeSymbol("QUERY-SENTENCE"), makeSymbol("MT"), makeSymbol("PROPERTIES"));

    static private final SubLString $str_alt22$INSERT_INTO__a_VALUES__s___s___s_ = makeString("INSERT INTO ~a VALUES(~s, ~s, ~s, ~d, ~d, ~s)");

    private static final SubLSymbol $EVENT_HANDLER_REGISTERED = makeKeyword("EVENT-HANDLER-REGISTERED");

    private static final SubLSymbol $EVENT_HANDLER_DEREGISTERED = makeKeyword("EVENT-HANDLER-DEREGISTERED");

    private static final SubLSymbol $CYC_BROWSER_LOGIN_EVENT = makeKeyword("CYC-BROWSER-LOGIN-EVENT");

    private static final SubLSymbol CB_LOGIN_ACTION = makeSymbol("CB-LOGIN-ACTION");



    private static final SubLSymbol $CYC_BROWSER_CONSTANT_SELECTION_EVENT = makeKeyword("CYC-BROWSER-CONSTANT-SELECTION-EVENT");

    private static final SubLSymbol CB_CONSTANT_SELECTION_ACTION = makeSymbol("CB-CONSTANT-SELECTION-ACTION");

    private static final SubLSymbol $CYC_BROWSER_ASK_EVENT = makeKeyword("CYC-BROWSER-ASK-EVENT");

    private static final SubLSymbol CB_ASK_ACTION = makeSymbol("CB-ASK-ACTION");

    private static final SubLSymbol $CYC_BROWSER_QUERY_EVENT = makeKeyword("CYC-BROWSER-QUERY-EVENT");

    private static final SubLSymbol CB_QUERY_ACTION = makeSymbol("CB-QUERY-ACTION");

    public static final SubLSymbol $unlex_logging_connection$ = makeSymbol("*UNLEX-LOGGING-CONNECTION*");

    public static final SubLSymbol $unlex_logging_statement$ = makeSymbol("*UNLEX-LOGGING-STATEMENT*");

    static private final SubLString $$$unlexified2 = makeString("unlexified2");

    static private final SubLString $str_alt37$SELECT_count_total__count_since_f = makeString("SELECT count_total, count_since_fixed, kb FROM ~a WHERE fort = ~s AND languageMt = ~s AND domainMt = ~s AND nl_predicates = ~s AND pedigree = ~s");



    static private final SubLString $str_alt39$UPDATE__a_SET_count_total____a__c = makeString("UPDATE ~a SET count_total = ~a, count_since_fixed = ~a, kb = ~s WHERE fort = ~s AND languageMt = ~s AND domainMT = ~s AND nl_predicates = ~s AND pedigree = ~s");



    static private final SubLString $str_alt41$INSERT_INTO__a_VALUES__s___s___s_ = makeString("INSERT INTO ~a VALUES(~s, ~s, ~s, ~s, ~a, ~a, ~s, ~s)");

    private static final SubLSymbol $INSERTED = makeKeyword("INSERTED");

    private static final SubLSymbol $UNLEXIFIED_TERM_DISCOVERY_EVENT = makeKeyword("UNLEXIFIED-TERM-DISCOVERY-EVENT");



    static private final SubLString $str_alt45$UPDATE__a_SET_count_since_fixed__ = makeString("UPDATE ~a SET count_since_fixed = 0 WHERE fort = ~s");





    static private final SubLString $str_alt48$SELECT___FROM__a_WHERE_languageMt = makeString("SELECT * FROM ~a WHERE languageMt like ~s AND count_since_fixed > ~a ORDER BY count_since_fixed DESC");

    private static final SubLSymbol KB_ID = makeSymbol("KB-ID");

    static private final SubLList $list_alt50 = list(makeSymbol("KB-VERSION-STRING"));

    static private final SubLString $$$d0 = makeString("d0");

    public static final SubLSymbol $paraphrase_logging_connection$ = makeSymbol("*PARAPHRASE-LOGGING-CONNECTION*");

    public static final SubLSymbol $paraphrase_logging_statement$ = makeSymbol("*PARAPHRASE-LOGGING-STATEMENT*");

    static private final SubLString $str_alt54$nancy_localhost = makeString("nancy@localhost");

    public static final SubLSymbol $paraphrase_user_login$ = makeSymbol("*PARAPHRASE-USER-LOGIN*");

    static private final SubLString $$$freddie = makeString("freddie");

    public static final SubLSymbol $paraphrase_user_passwd$ = makeSymbol("*PARAPHRASE-USER-PASSWD*");

    public static final SubLSymbol $p_user_date$ = makeSymbol("*P-USER-DATE*");

    static private final SubLString $$$Unknown = makeString("Unknown");

    public static final SubLFloat $float$0_0 = makeDouble(0.0);

    static private final SubLString $$$session = makeString("session");

    static private final SubLString $$$error = makeString("error");

    static private final SubLString $str_alt63$error_test_script = makeString("error_test_script");

    static private final SubLString $str_alt64$test_run_history = makeString("test_run_history");

    static private final SubLString $str_alt65$test_result = makeString("test_result");

    static private final SubLString $str_alt66$att_type = makeString("att_type");

    static private final SubLString $$$attributes = makeString("attributes");

    static private final SubLString $str_alt68$att_item = makeString("att_item");

    static private final SubLString $$$status = makeString("status");

    static private final SubLString $$$fix = makeString("fix");

    static private final SubLString $str_alt71$fix_method = makeString("fix_method");

    static private final SubLString $str_alt72$fix_user = makeString("fix_user");

    static private final SubLString $str_alt73$There_is_no_paraphrase_logging_co = makeString("There is no paraphrase logging connection open");

    static private final SubLString $str_alt74$yyyy_mm_dd_hh_mm_ss = makeString("yyyy/mm/dd hh:mm:ss");

    private static final SubLSymbol $P_METHODS_PREFERRED = makeKeyword("P-METHODS-PREFERRED");

    private static final SubLSymbol $P_METHOD_USED = makeKeyword("P-METHOD-USED");

    private static final SubLSymbol $P_PRODUCED = makeKeyword("P-PRODUCED");

    private static final SubLSymbol $ERROR_CYCL = makeKeyword("ERROR-CYCL");

    private static final SubLSymbol $ERROR_VALUE = makeKeyword("ERROR-VALUE");

    private static final SubLSymbol $SPEECH_PART_PREDS = makeKeyword("SPEECH-PART-PREDS");





    private static final SubLSymbol $P_MODE = makeKeyword("P-MODE");

    private static final SubLSymbol $ERROR_VALUE_TYPE = makeKeyword("ERROR-VALUE-TYPE");

    static private final SubLString $str_alt85$INSERT_INTO__a__date__cyclist__ho = makeString("INSERT INTO ~a (date, cyclist, host, port, system, KB, purpose) VALUES(~s, ~s, ~s, ~a, ~a, ~a, ~s)");

    static private final SubLString $str_alt86$INSERT_INTO__a__session_id__statu = makeString("INSERT INTO ~a (session_id, status_id) VALUES(~a, ~a)");

    static private final SubLString $str_alt87$INSERT_INTO__a__session_id__statu = makeString("INSERT INTO ~a (session_id, status_id, description) VALUES(~a, ~a, ~s)");

    static private final SubLString $str_alt88$INSERT_INTO__a__att_type_id__cycl = makeString("INSERT INTO ~a (att_type_id, cycl_id, att_item) VALUES(~a, ~s, ~s)");

    static private final SubLString $str_alt89$INSERT_INTO__a__att_type_id__att_ = makeString("INSERT INTO ~a (att_type_id, att_item) VALUES(~a, ~s)");

    static private final SubLString $str_alt90$INSERT_INTO__a__att_item_id__erro = makeString("INSERT INTO ~a (att_item_id, error_id) VALUES(~a, ~a)");

    static private final SubLString $str_alt91$SELECT_max_session_id__as_session = makeString("SELECT max(session_id) as session_id from ~a");

    static private final SubLString $str_alt92$There_are_no_session_ids = makeString("There are no session_ids");

    static private final SubLString $str_alt93$SELECT_max_error_id__as_error_id_ = makeString("SELECT max(error_id) as error_id from ~a");

    static private final SubLString $str_alt94$There_are_no_error_ids = makeString("There are no error_ids");

    static private final SubLString $str_alt95$select_count_att_item_id__as_att_ = makeString("select count(att_item_id) as att_count from att_item where att_type_id=~a and att_item=~s");

    static private final SubLString $str_alt96$SELECT_att_item_id_from__a_where_ = makeString("SELECT att_item_id from ~a where att_type_id=~a and att_item=~s");

    static private final SubLString $str_alt97$This_att_item_is_not_in_the_DB = makeString("This att_item is not in the DB");

    // // Initializers
    public void declareFunctions() {
        declare_kb_logging_file();
    }

    public void initializeVariables() {
        init_kb_logging_file();
    }

    public void runTopLevelForms() {
        setup_kb_logging_file();
    }
}

