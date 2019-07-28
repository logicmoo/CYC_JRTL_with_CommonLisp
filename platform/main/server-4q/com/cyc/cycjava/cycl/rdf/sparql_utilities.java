package com.cyc.cycjava.cycl.rdf;


import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.rdf.sparql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.tcp_server_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.rdf.sparql_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOURTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class sparql_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sparql_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.rdf.sparql_utilities";

    public static final String myFingerPrint = "150a2e2b7c4d6927497fbf719e603bf7dbe3534e1dc9738d0933477b321563b6";



    // Internal Constants
    public static final SubLString $str0$_sparql = makeString("/sparql");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol SPARQL_QUERY_VARS_CACHED = makeSymbol("SPARQL-QUERY-VARS-CACHED");

    private static final SubLSymbol $sparql_query_vars_cached_caching_state$ = makeSymbol("*SPARQL-QUERY-VARS-CACHED-CACHING-STATE*");





    private static final SubLSymbol TCP_PORT_P = makeSymbol("TCP-PORT-P");



    private static final SubLObject $$serverOfSKS = reader_make_constant_shell(makeString("serverOfSKS"));

    private static final SubLObject $$portNumberForSKS = reader_make_constant_shell(makeString("portNumberForSKS"));

    private static final SubLObject $$relativePathForAPIAccessToSKS = reader_make_constant_shell(makeString("relativePathForAPIAccessToSKS"));

    private static final SubLObject $$nameSpacePrefixForSKS = reader_make_constant_shell(makeString("nameSpacePrefixForSKS"));

    private static final SubLObject $$subProtocolForSKS = reader_make_constant_shell(makeString("subProtocolForSKS"));



    private static final SubLSymbol $sym14$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str15$_ = makeString("<");

    private static final SubLString $str16$_ = makeString(">");

    private static final SubLString $$$DESCRIBE_ = makeString("DESCRIBE ");

    private static final SubLString $str18$_sparql = makeString("<sparql");

    private static final SubLString $$$results = makeString("results");

    private static final SubLString $str20$_result = makeString("<result");

    private static final SubLString $$$result = makeString("result");

    private static final SubLString $str22$_ = makeString("*");



    private static final SubLSymbol SPARQL_EXTRACT_RESULT_SET = makeSymbol("SPARQL-EXTRACT-RESULT-SET");













    private static final SubLObject $list31 = _constant_31_initializer();

















    private static final SubLString $str40$query_ = makeString("query=");

    private static final SubLSymbol $kw41$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw42$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");



    private static final SubLList $list44 = list(makeString("application/sparql-results+xml"));



    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLString $str47$_binding = makeString("<binding");

    private static final SubLString $$$binding = makeString("binding");

    private static final SubLString $str49$_literal = makeString("<literal");

    private static final SubLString $str50$_bnode = makeString("<bnode");

    private static final SubLString $str51$__ = makeString("_:");

    private static final SubLString $str52$_uri = makeString("<uri");

    private static final SubLString $str53$Time_to_support__S = makeString("Time to support ~S");

    private static final SubLList $list54 = cons(makeSymbol("PREFIX"), makeSymbol("PREFIX-URI"));

    private static final SubLString $str55$_ = makeString(":");

    public static SubLObject clear_sparql_query_vars_cached() {
        final SubLObject cs = $sparql_query_vars_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sparql_query_vars_cached(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port) {
        if (url == UNPROVIDED) {
            url = $str0$_sparql;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        return memoization_state.caching_state_remove_function_results_with_args($sparql_query_vars_cached_caching_state$.getGlobalValue(), list(query, vars, machine, url, port), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sparql_query_vars_cached_internal(final SubLObject query, final SubLObject vars, final SubLObject machine, final SubLObject url, final SubLObject port) {
        return sparql_query_vars(query, vars, machine, url, port);
    }

    public static SubLObject sparql_query_vars_cached(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port) {
        if (url == UNPROVIDED) {
            url = $str0$_sparql;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        SubLObject caching_state = $sparql_query_vars_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SPARQL_QUERY_VARS_CACHED, $sparql_query_vars_cached_caching_state$, NIL, EQUAL, FIVE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_5(query, vars, machine, url, port);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (vars.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (machine.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (url.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (((NIL != cached_args) && (NIL == cached_args.rest())) && port.equal(cached_args.first())) {
                                    return memoization_state.caching_results(results2);
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(sparql_query_vars_cached_internal(query, vars, machine, url, port)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query, vars, machine, url, port));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sparql_query_vars(final SubLObject query, final SubLObject vars, final SubLObject machine, SubLObject url, SubLObject port) {
        if (url == UNPROVIDED) {
            url = $str0$_sparql;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
        assert NIL != list_utilities.non_dotted_list_p(vars) : "list_utilities.non_dotted_list_p(vars) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(vars) " + vars;
        SubLObject cdolist_list_var = vars;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        final SubLObject rdf = perform_sparql_rdf_query(query, machine, url, port);
        SubLObject result_set = NIL;
        SubLObject in_stream = NIL;
        try {
            in_stream = make_private_string_input_stream(rdf, ZERO_INTEGER, NIL);
            result_set = sparql_xml_tokens_to_result_set(xml_parsing_utilities.xml_tokenize(in_stream, T, T, T), vars, NIL);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(in_stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result_set;
    }

    public static SubLObject sparql_query_result_set(final SubLObject sparql, final SubLObject machine, SubLObject relative_path, SubLObject extract_rdf_literalsP, SubLObject port, SubLObject prefix_map, SubLObject subprotocol, SubLObject params) {
        if (relative_path == UNPROVIDED) {
            relative_path = $str0$_sparql;
        }
        if (extract_rdf_literalsP == UNPROVIDED) {
            extract_rdf_literalsP = NIL;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (prefix_map == UNPROVIDED) {
            prefix_map = NIL;
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = NIL;
        }
        if (params == UNPROVIDED) {
            params = NIL;
        }
        assert NIL != stringp(sparql) : "Types.stringp(sparql) " + "CommonSymbols.NIL != Types.stringp(sparql) " + sparql;
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        assert NIL != stringp(relative_path) : "Types.stringp(relative_path) " + "CommonSymbols.NIL != Types.stringp(relative_path) " + relative_path;
        assert NIL != tcp_server_utilities.tcp_port_p(port) : "tcp_server_utilities.tcp_port_p(port) " + "CommonSymbols.NIL != tcp_server_utilities.tcp_port_p(port) " + port;
        if (((NIL != subprotocol) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(subprotocol))) {
            throw new AssertionError(subprotocol);
        }
        if (((NIL != params) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == list_utilities.alist_p(params))) {
            throw new AssertionError(params);
        }
        final SubLObject access_path = dictionary_utilities.new_dictionary_from_alist(list(bq_cons($$serverOfSKS, machine), bq_cons($$portNumberForSKS, port), bq_cons($$relativePathForAPIAccessToSKS, relative_path), bq_cons($$nameSpacePrefixForSKS, prefix_map), bq_cons($$subProtocolForSKS, subprotocol)), UNPROVIDED);
        return sksi_sks_interaction.get_result_set_from_sparql_source(sparql, access_path, params, extract_rdf_literalsP);
    }

    public static SubLObject sparql_query_result_set_with_retries(final SubLObject sparql, final SubLObject machine, SubLObject extract_rdf_literalsP, SubLObject retries, SubLObject params, SubLObject relative_path, SubLObject port, SubLObject prefix_map, SubLObject subprotocol) {
        if (extract_rdf_literalsP == UNPROVIDED) {
            extract_rdf_literalsP = NIL;
        }
        if (retries == UNPROVIDED) {
            retries = THREE_INTEGER;
        }
        if (params == UNPROVIDED) {
            params = NIL;
        }
        if (relative_path == UNPROVIDED) {
            relative_path = $str0$_sparql;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (prefix_map == UNPROVIDED) {
            prefix_map = NIL;
        }
        if (subprotocol == UNPROVIDED) {
            subprotocol = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject n;
        SubLObject err;
        SubLObject _prev_bind_0;
        for (n = NIL, n = ZERO_INTEGER; n.numL(retries); n = add(n, ONE_INTEGER)) {
            err = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        return sparql_query_result_set(sparql, machine, relative_path, extract_rdf_literalsP, port, prefix_map, subprotocol, params);
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != err) {
                Errors.error(err);
            }
        }
        return NIL;
    }

    public static SubLObject sparql_describe(SubLObject uri, final SubLObject machine, SubLObject url, SubLObject port) {
        if (url == UNPROVIDED) {
            url = $str0$_sparql;
        }
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        assert NIL != stringp(uri) : "Types.stringp(uri) " + "CommonSymbols.NIL != Types.stringp(uri) " + uri;
        if ((!string_utilities.first_char(uri).eql(CHAR_less)) || (!string_utilities.last_char(uri).eql(CHAR_greater))) {
            uri = cconcatenate($str15$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(uri), $str16$_ });
        }
        final SubLObject query = cconcatenate($$$DESCRIBE_, format_nil.format_nil_a_no_copy(uri));
        return perform_sparql_rdf_query(query, machine, url, port);
    }

    public static SubLObject sparql_xml_tokens_to_result_set(final SubLObject xml_tokens, final SubLObject variable_names, final SubLObject prefix_map) {
        final SubLObject sparql_start = xml_parsing_utilities.advance_xml_tokens_to(xml_tokens, $str18$_sparql, UNPROVIDED);
        final SubLObject results_tokens = xml_parsing_utilities.xml_extract_token_sequence(sparql_start, $$$results);
        final SubLObject result_set = sparql_extract_result_set(variable_names, results_tokens, prefix_map);
        return result_set;
    }

    public static SubLObject sparql_extract_result_set(final SubLObject variable_names, final SubLObject results_tokens, final SubLObject prefix_map) {
        if (NIL != list_utilities.singletonP(results_tokens)) {
            return NIL;
        }
        SubLObject result_set = NIL;
        for (SubLObject result_start_tokens = xml_parsing_utilities.advance_xml_tokens_to(results_tokens.rest(), $str20$_result, UNPROVIDED); NIL != result_start_tokens; result_start_tokens = xml_parsing_utilities.advance_xml_tokens_to(result_start_tokens.rest(), $str20$_result, UNPROVIDED)) {
            final SubLObject result_tokens = xml_parsing_utilities.xml_extract_token_sequence(result_start_tokens, $$$result);
            final SubLObject result = sparql_extract_result(variable_names, result_tokens, prefix_map);
            if ((NIL != subl_promotions.memberP($str22$_, variable_names, EQUAL, UNPROVIDED)) || (NIL == list_utilities.list_of_type_p(NULL, result))) {
                result_set = cons(result, result_set);
            }
        }
        return nreverse(result_set);
    }

    public static SubLObject perform_sparql_rdf_query(final SubLObject query, final SubLObject machine, final SubLObject url, final SubLObject port) {
        SubLObject rdf = NIL;
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, machine, real_port)) {
                web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, $GET, $URL, url, $QUERY, cconcatenate($str40$query_, web_utilities.html_url_encode(query, UNPROVIDED)), $kw41$KEEP_ALIVE_, T, $kw42$WIDE_NEWLINES_, T, $ACCEPT_TYPES, $list44, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                rdf = web_utilities.http_response_body(web_utilities.slack_read_until_eof(in_stream, UNPROVIDED));
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != in_stream) {
                    close(in_stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (!CHAR_less.eql(string_utilities.first_char(rdf))) {
            final SubLObject start = position(CHAR_less, rdf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != start) {
                rdf = string_utilities.substring(rdf, start, UNPROVIDED);
            }
        }
        return rdf;
    }

    public static SubLObject sparql_extract_result(final SubLObject variable_names, final SubLObject result_tokens, final SubLObject prefix_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result = make_list(length(variable_names), NIL);
        for (SubLObject binding_start_tokens = xml_parsing_utilities.advance_xml_tokens_to(result_tokens, $str47$_binding, UNPROVIDED); NIL != binding_start_tokens; binding_start_tokens = xml_parsing_utilities.advance_xml_tokens_to(binding_start_tokens.rest(), $str47$_binding, UNPROVIDED)) {
            final SubLObject binding_tokens = xml_parsing_utilities.xml_extract_token_sequence(binding_start_tokens, $$$binding);
            thread.resetMultipleValues();
            final SubLObject variable_name = sparql_extract_binding_value(binding_tokens, prefix_map);
            final SubLObject binding_value = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject result_index = position(variable_name, variable_names, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (result_index.isInteger()) {
                set_nth(result_index, result, binding_value);
            }
        }
        return result;
    }

    public static SubLObject sparql_extract_binding_value(final SubLObject binding_tokens, final SubLObject prefix_map) {
        final SubLObject binding_token = binding_tokens.first();
        final SubLObject binding_end = last(binding_tokens, UNPROVIDED);
        final SubLObject value_tokens = ldiff(binding_tokens.rest(), binding_end);
        final SubLObject variable_name = read_from_string_ignoring_errors(binding_token, NIL, NIL, FOURTEEN_INTEGER, UNPROVIDED);
        final SubLObject binding_value = sparql_extract_binding_value_int(value_tokens, prefix_map);
        return values(variable_name, binding_value);
    }

    public static SubLObject sparql_extract_binding_value_int(final SubLObject value_tokens, final SubLObject prefix_map) {
        final SubLObject first_token = string_utilities.trim_whitespace(value_tokens.first());
        if (NIL != string_utilities.empty_string_p(first_token)) {
            return sparql_extract_binding_value_int(value_tokens.rest(), prefix_map);
        }
        if (NIL != string_utilities.starts_with(first_token, $str49$_literal)) {
            return second(value_tokens);
        }
        if (NIL != string_utilities.starts_with(first_token, $str50$_bnode)) {
            return cconcatenate($str51$__, format_nil.format_nil_a_no_copy(second(value_tokens)));
        }
        if (NIL != string_utilities.starts_with(first_token, $str52$_uri)) {
            return sparql_extract_uri_value(second(value_tokens), prefix_map);
        }
        return Errors.error($str53$Time_to_support__S, first_token);
    }

    public static SubLObject sparql_extract_uri_value(final SubLObject uri_string, final SubLObject prefix_map) {
        final SubLObject uri_split = position(CHAR_hash, uri_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != uri_split) {
            final SubLObject uri_context = string_utilities.substring(uri_string, ZERO_INTEGER, uri_split);
            final SubLObject uri_value = string_utilities.substring(uri_string, number_utilities.f_1X(uri_split), UNPROVIDED);
            SubLObject cdolist_list_var = prefix_map;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject prefix = NIL;
                SubLObject prefix_uri = NIL;
                destructuring_bind_must_consp(current, datum, $list54);
                prefix = current.first();
                current = prefix_uri = current.rest();
                if (NIL != string_utilities.starts_with(prefix_uri, uri_context)) {
                    return cconcatenate(format_nil.format_nil_a_no_copy(prefix), new SubLObject[]{ $str55$_, format_nil.format_nil_a_no_copy(uri_value) });
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return cconcatenate($str15$_, new SubLObject[]{ format_nil.format_nil_a_no_copy(uri_string), $str16$_ });
    }

    public static SubLObject declare_sparql_utilities_file() {
        declareFunction(me, "clear_sparql_query_vars_cached", "CLEAR-SPARQL-QUERY-VARS-CACHED", 0, 0, false);
        declareFunction(me, "remove_sparql_query_vars_cached", "REMOVE-SPARQL-QUERY-VARS-CACHED", 3, 2, false);
        declareFunction(me, "sparql_query_vars_cached_internal", "SPARQL-QUERY-VARS-CACHED-INTERNAL", 5, 0, false);
        declareFunction(me, "sparql_query_vars_cached", "SPARQL-QUERY-VARS-CACHED", 3, 2, false);
        declareFunction(me, "sparql_query_vars", "SPARQL-QUERY-VARS", 3, 2, false);
        declareFunction(me, "sparql_query_result_set", "SPARQL-QUERY-RESULT-SET", 2, 6, false);
        declareFunction(me, "sparql_query_result_set_with_retries", "SPARQL-QUERY-RESULT-SET-WITH-RETRIES", 2, 7, false);
        declareFunction(me, "sparql_describe", "SPARQL-DESCRIBE", 2, 2, false);
        declareFunction(me, "sparql_xml_tokens_to_result_set", "SPARQL-XML-TOKENS-TO-RESULT-SET", 3, 0, false);
        declareFunction(me, "sparql_extract_result_set", "SPARQL-EXTRACT-RESULT-SET", 3, 0, false);
        declareFunction(me, "perform_sparql_rdf_query", "PERFORM-SPARQL-RDF-QUERY", 4, 0, false);
        declareFunction(me, "sparql_extract_result", "SPARQL-EXTRACT-RESULT", 3, 0, false);
        declareFunction(me, "sparql_extract_binding_value", "SPARQL-EXTRACT-BINDING-VALUE", 2, 0, false);
        declareFunction(me, "sparql_extract_binding_value_int", "SPARQL-EXTRACT-BINDING-VALUE-INT", 2, 0, false);
        declareFunction(me, "sparql_extract_uri_value", "SPARQL-EXTRACT-URI-VALUE", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sparql_utilities_file() {
        deflexical("*SPARQL-QUERY-VARS-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_sparql_utilities_file() {
        memoization_state.note_globally_cached_function(SPARQL_QUERY_VARS_CACHED);
        define_test_case_table_int(SPARQL_EXTRACT_RESULT_SET, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list31);
        return NIL;
    }

    private static SubLObject _constant_31_initializer() {
        return list(new SubLObject[]{ list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<literal>"), makeString("1885"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("1885")))), list(list(list(makeString("obj")), list(makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n "), makeString("</results>")), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), NIL), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">"), makeString("78.04222106933594"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("78.04222106933594")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#float\">"), makeString("27.17416572570801"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("27.17416572570801")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">"), makeString("1923-11-18"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("1923-11-18")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#date\">"), makeString("1998-07-21"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("1998-07-21")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Edinburgh"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("<http://dbpedia.org/resource/Edinburgh>")))), list(list(list(makeString("*")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"_star_fake\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), makeString("1"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(NIL))), list(list(list(makeString("*")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"_star_fake\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), makeString("1"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(NIL))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Brooklyn"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/New_York"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("<http://dbpedia.org/resource/Brooklyn>")), list(makeString("<http://dbpedia.org/resource/New_York>")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/England"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/London"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("<http://dbpedia.org/resource/England>")), list(makeString("<http://dbpedia.org/resource/London>")))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Acid_rock"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Blues-rock"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Hard_rock"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Psychedelic_rock"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("<http://dbpedia.org/resource/Acid_rock>")), list(makeString("<http://dbpedia.org/resource/Blues-rock>")), list(makeString("<http://dbpedia.org/resource/Hard_rock>")), list(makeString("<http://dbpedia.org/resource/Psychedelic_rock>")))), list(list(list(makeString("*")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"_star_fake\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), makeString("1"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(NIL))), list(list(list(makeString("obj")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"obj\">"), makeString("<uri>"), makeString("http://dbpedia.org/resource/Truman_Capote"), makeString("</uri>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(makeString("<http://dbpedia.org/resource/Truman_Capote>")))), list(list(list(makeString("*")), list(new SubLObject[]{ makeString("<results distinct=\"false\" ordered=\"true\">"), makeString("\n  "), makeString("<result>"), makeString("\n   "), makeString("<binding name=\"_star_fake\">"), makeString("<literal datatype=\"http://www.w3.org/2001/XMLSchema#integer\">"), makeString("1"), makeString("</literal>"), makeString("</binding>"), makeString("\n  "), makeString("</result>"), makeString("\n "), makeString("</results>") }), list(cons(makeString("rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")))), list(list(NIL))) });
    }

    @Override
    public void declareFunctions() {
        declare_sparql_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sparql_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sparql_utilities_file();
    }

    static {


























































    }
}

/**
 * Total time: 199 ms synthetic
 */
