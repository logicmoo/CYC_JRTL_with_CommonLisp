/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      YAHOO
 *  source file: /cyc/top/cycl/yahoo.lisp
 *  created:     2019/07/03 17:38:53
 */
public final class yahoo extends SubLTranslatedFile implements V02 {
    // // Constructor
    private yahoo() {
    }

    public static final SubLFile me = new yahoo();




    // defparameter
    private static final SubLSymbol $yahoo_web_search_base_url$ = makeSymbol("*YAHOO-WEB-SEARCH-BASE-URL*");

    /**
     * Returns the Application ID to use with the Yahoo! API.
     *
     * @return stringp; the application id.
     */
    public static final SubLObject get_yahoo_application_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $yahoo_application_id$.getDynamicValue(thread);
        }
    }

    /**
     * Returns the base URL for the Yahoo! Web Search API.
     *
     * @return stringp; the url.
     */
    public static final SubLObject get_yahoo_web_search_base_url() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $yahoo_web_search_base_url$.getDynamicValue(thread);
        }
    }

    /**
     * Constructs a URL given BASE-URL and parameters to perform a REST function.
     *
     * @param BASE-URL
     * 		stringp; the URL containing the host and function.
     * @param ALIST
     * 		alist-p; a list of parameters to pass to the function.
     * @return stringp; the XML response from the REST API.
     */
    public static final SubLObject construct_rest_url(SubLObject base_url, SubLObject alist) {
        {
            SubLObject query_string = $str_alt5$;
            SubLObject cdolist_list_var = alist;
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                {
                    SubLObject datum = cons;
                    SubLObject current = datum;
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt6);
                    key = current.first();
                    current = current.rest();
                    value = current;
                    {
                        SubLObject k = web_utilities.html_url_encode(format(NIL, $str_alt7$_A, key), UNPROVIDED);
                        SubLObject v = web_utilities.html_url_encode(format(NIL, $str_alt7$_A, value), UNPROVIDED);
                        SubLObject param = format(NIL, $str_alt8$_A__A, k, v);
                        if ($str_alt5$.equal(query_string)) {
                            query_string = cconcatenate(query_string, param);
                        } else {
                            query_string = cconcatenate(query_string, new SubLObject[]{ $str_alt9$_, param });
                        }
                    }
                }
            }
            return cconcatenate(base_url, new SubLObject[]{ $str_alt10$_, query_string });
        }
    }

    /**
     * Converts the XML returned from the Yahoo! REST API into an s-expression.
     *
     * @param XML
     * 		stringp;
     * @return listp;
     */
    public static final SubLObject parse_rest_response(SubLObject xml) {
        {
            SubLObject tokens = web_utilities.xml_string_tokenize(web_utilities.remove_xml_comments(xml), UNPROVIDED, UNPROVIDED, UNPROVIDED).rest();
            while (NIL == web_utilities.xml_tagP(tokens.first())) {
                tokens = tokens.rest();
            } 
            return web_utilities.xml_tokens_to_sexpr(tokens);
        }
    }

    /**
     * Returns T iff the Yahoo! API is available.
     */
    public static final SubLObject yahoo_availableP() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $yahoo_application_id$.getDynamicValue(thread)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Constructs a URL using the Yahoo! API that will return web search results.
     *
     * @param SEARCH-STRING
     * 		stringp; the string to search for.
     * @param START
     * 		integerp; the rank of the first result to return.
     * @param HITS
     * 		integerp; the number of results to return.
     * @param LANG
     * 		stringp; the language that we want to get back.  Use NIL if all languages are welcome
     */
    public static final SubLObject construct_yahoo_search_url(SubLObject search_string, SubLObject start, SubLObject hits, SubLObject lang) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        if (lang == UNPROVIDED) {
            lang = $$$en;
        }
        {
            SubLObject alist = NIL;
            if (NIL != hits) {
                alist = list_utilities.alist_enter(alist, $$$results, hits, UNPROVIDED);
            }
            if (NIL != start) {
                alist = list_utilities.alist_enter(alist, $$$start, start, UNPROVIDED);
            }
            alist = list_utilities.alist_enter(alist, $$$query, search_string, UNPROVIDED);
            alist = list_utilities.alist_enter(alist, $$$appid, get_yahoo_application_id(), UNPROVIDED);
            if (NIL != lang) {
                alist = list_utilities.alist_enter(alist, $$$language, lang, UNPROVIDED);
            }
            {
                SubLObject url = construct_rest_url(get_yahoo_web_search_base_url(), alist);
                return url;
            }
        }
    }

    public static final SubLObject yahoo_search(SubLObject search_string, SubLObject start, SubLObject hits, SubLObject test) {
        if (start == UNPROVIDED) {
            start = NIL;
        }
        if (hits == UNPROVIDED) {
            hits = NIL;
        }
        if (test == UNPROVIDED) {
            test = NIL;
        }
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            return yahoo_search_int(search_string, start, hits);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return NIL;
    }



    public static final SubLObject clear_yahoo_search_int() {
        {
            SubLObject cs = $yahoo_search_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_yahoo_search_int(SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        return memoization_state.caching_state_remove_function_results_with_args($yahoo_search_int_caching_state$.getGlobalValue(), list(search_string, start, hits), UNPROVIDED, UNPROVIDED);
    }

    /**
     * Searches the web for SEARCH-STRING using the Yahoo! API.
     *
     * @param SEARCH-STRING
     * 		stringp; the string to search for.
     * @param START
     * 		integerp; the rank of the first result to return.
     * @param HITS
     * 		integerp; the number of results to return.
     * @return listp; A list of search results of the form:
    ((rank url title summary) ...), such as:
    (1 "http://www2.latech.edu/~acm/HelloWorld.shtml"
    "Hello, World Page!"
    "Hello World! Welcome to the ACM &quot ;Hello World&quot; project...")
     */
    public static final SubLObject yahoo_search_int_internal(SubLObject search_string, SubLObject start, SubLObject hits) {
        {
            SubLObject url = construct_yahoo_search_url(search_string, start, hits, UNPROVIDED);
            SubLObject response = web_utilities.get_html_source_from_url(url, UNPROVIDED, UNPROVIDED);
            SubLObject result_set = parse_rest_response(response);
            SubLObject result_list = result_set.rest();
            SubLObject results = NIL;
            if ($$$Error.equalp(web_utilities.xml_sexpr_type(result_set))) {
                {
                    SubLObject title = second(web_utilities.xml_sexpr_daughters(result_set, $$$Title).first());
                    SubLObject message = second(web_utilities.xml_sexpr_daughters(result_set, $$$Message).first());
                    return format(NIL, $str_alt24$_A___A, title, message);
                }
            }
            {
                SubLObject cdolist_list_var = result_list;
                SubLObject result = NIL;
                for (result = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , result = cdolist_list_var.first()) {
                    {
                        SubLObject url_1 = web_utilities.get_field_value_from_xml_sexpr($$$Url, result);
                        SubLObject title = web_utilities.get_field_value_from_xml_sexpr($$$Title, result);
                        SubLObject summary = web_utilities.get_field_value_from_xml_sexpr($$$Summary, result);
                        SubLObject rank = add(start, length(results));
                        results = cons(list(rank, url_1, NIL != title ? ((SubLObject) (title)) : $str_alt5$, NIL != summary ? ((SubLObject) (summary)) : $str_alt5$), results);
                    }
                }
            }
            return reverse(results);
        }
    }

    public static final SubLObject yahoo_search_int(SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        {
            SubLObject caching_state = $yahoo_search_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(YAHOO_SEARCH_INT, $yahoo_search_int_caching_state$, NIL, EQUAL, THREE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(search_string, start, hits);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (search_string.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (start.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && hits.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(yahoo_search_int_internal(search_string, start, hits)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(search_string, start, hits));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    /**
     * If you want to use this, you probably really want YAHOO-COUNT-CACHED
     */
    public static final SubLObject yahoo_count(SubLObject string) {
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            return yahoo_count_int(string);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return ZERO_INTEGER;
    }



    public static final SubLObject clear_yahoo_count_int() {
        {
            SubLObject cs = $yahoo_count_int_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_yahoo_count_int(SubLObject search_string) {
        return memoization_state.caching_state_remove_function_results_with_args($yahoo_count_int_caching_state$.getGlobalValue(), list(search_string), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject yahoo_count_int_internal(SubLObject search_string) {
        {
            SubLObject url = construct_yahoo_search_url(search_string, ONE_INTEGER, ONE_INTEGER, UNPROVIDED);
            SubLObject response = web_utilities.get_html_source_from_url(url, UNPROVIDED, UNPROVIDED);
            SubLObject result_set = parse_rest_response(response);
            if ($$$Error.equalp(web_utilities.xml_sexpr_type(result_set))) {
                {
                    SubLObject title = second(web_utilities.xml_sexpr_daughters(result_set, $$$Title).first());
                    SubLObject message = second(web_utilities.xml_sexpr_daughters(result_set, $$$Message).first());
                    return NIL == title ? ((SubLObject) (format(NIL, $str_alt7$_A, message))) : format(NIL, $str_alt24$_A___A, title, message);
                }
            }
            {
                SubLObject result_tag = result_set.first();
                SubLObject result_tag_attributes = result_tag.rest();
                SubLObject total_results_string = list_utilities.alist_lookup(result_tag_attributes, $$$totalResultsAvailable, symbol_function(EQUALP), UNPROVIDED);
                SubLObject total_results = string_utilities.string_to_integer(total_results_string);
                return total_results;
            }
        }
    }

    public static final SubLObject yahoo_count_int(SubLObject search_string) {
        {
            SubLObject caching_state = $yahoo_count_int_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(YAHOO_COUNT_INT, $yahoo_count_int_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, search_string, $kw28$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(yahoo_count_int_internal(search_string)));
                    memoization_state.caching_state_put(caching_state, search_string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }



    public static final SubLObject clear_yahoo_count_cached() {
        {
            SubLObject cs = $yahoo_count_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_yahoo_count_cached(SubLObject string) {
        return memoization_state.caching_state_remove_function_results_with_args($yahoo_count_cached_caching_state$.getGlobalValue(), list(string), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject yahoo_count_cached_internal(SubLObject string) {
        return yahoo_count(string);
    }

    public static final SubLObject yahoo_count_cached(SubLObject string) {
        {
            SubLObject caching_state = $yahoo_count_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(YAHOO_COUNT_CACHED, $yahoo_count_cached_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, string, $kw28$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw28$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(yahoo_count_cached_internal(string)));
                    memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static final SubLObject yahoo_search_url(SubLObject search_string, SubLObject start, SubLObject hits) {
        if (start == UNPROVIDED) {
            start = ONE_INTEGER;
        }
        if (hits == UNPROVIDED) {
            hits = TEN_INTEGER;
        }
        return format(NIL, $str_alt34$http___search_yahoo_com_search_p_, new SubLObject[]{ web_utilities.html_url_encode(search_string, UNPROVIDED), start, hits });
    }

    public static final SubLObject declare_yahoo_file() {
        declareFunction("get_yahoo_application_id", "GET-YAHOO-APPLICATION-ID", 0, 0, false);
        declareFunction("get_yahoo_web_search_base_url", "GET-YAHOO-WEB-SEARCH-BASE-URL", 0, 0, false);
        declareFunction("construct_rest_url", "CONSTRUCT-REST-URL", 2, 0, false);
        declareFunction("parse_rest_response", "PARSE-REST-RESPONSE", 1, 0, false);
        declareFunction("yahoo_availableP", "YAHOO-AVAILABLE?", 0, 0, false);
        declareFunction("construct_yahoo_search_url", "CONSTRUCT-YAHOO-SEARCH-URL", 1, 3, false);
        declareFunction("yahoo_search", "YAHOO-SEARCH", 1, 3, false);
        declareFunction("clear_yahoo_search_int", "CLEAR-YAHOO-SEARCH-INT", 0, 0, false);
        declareFunction("remove_yahoo_search_int", "REMOVE-YAHOO-SEARCH-INT", 1, 2, false);
        declareFunction("yahoo_search_int_internal", "YAHOO-SEARCH-INT-INTERNAL", 3, 0, false);
        declareFunction("yahoo_search_int", "YAHOO-SEARCH-INT", 1, 2, false);
        declareFunction("yahoo_count", "YAHOO-COUNT", 1, 0, false);
        declareFunction("clear_yahoo_count_int", "CLEAR-YAHOO-COUNT-INT", 0, 0, false);
        declareFunction("remove_yahoo_count_int", "REMOVE-YAHOO-COUNT-INT", 1, 0, false);
        declareFunction("yahoo_count_int_internal", "YAHOO-COUNT-INT-INTERNAL", 1, 0, false);
        declareFunction("yahoo_count_int", "YAHOO-COUNT-INT", 1, 0, false);
        declareFunction("clear_yahoo_count_cached", "CLEAR-YAHOO-COUNT-CACHED", 0, 0, false);
        declareFunction("remove_yahoo_count_cached", "REMOVE-YAHOO-COUNT-CACHED", 1, 0, false);
        declareFunction("yahoo_count_cached_internal", "YAHOO-COUNT-CACHED-INTERNAL", 1, 0, false);
        declareFunction("yahoo_count_cached", "YAHOO-COUNT-CACHED", 1, 0, false);
        declareFunction("yahoo_search_url", "YAHOO-SEARCH-URL", 1, 2, false);
        return NIL;
    }

    public static final SubLObject init_yahoo_file() {
        defparameter("*YAHOO-APPLICATION-ID*", red_infrastructure_macros.red_def_helper($list_alt0.isSymbol() ? ((SubLObject) (symbol_value($list_alt0))) : $list_alt0, $yahoo_application_id$, $$$Cyc_Analytical_Environment.isSymbol() ? ((SubLObject) (symbol_value($$$Cyc_Analytical_Environment))) : $$$Cyc_Analytical_Environment, $PARAMETER, UNPROVIDED));
        defparameter("*YAHOO-WEB-SEARCH-BASE-URL*", $str_alt4$http___api_search_yahoo_com_WebSe);
        deflexical("*YAHOO-SEARCH-INT-CACHING-STATE*", NIL);
        deflexical("*YAHOO-COUNT-INT-CACHING-STATE*", NIL);
        deflexical("*YAHOO-COUNT-CACHED-CACHING-STATE*", NIL);
        return NIL;
    }

    public static final SubLObject setup_yahoo_file() {
        memoization_state.note_globally_cached_function(YAHOO_SEARCH_INT);
        memoization_state.note_globally_cached_function(YAHOO_COUNT_INT);
        memoization_state.note_globally_cached_function(YAHOO_COUNT_CACHED);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeString("application.cyc-ir.yahoo.application-id"));

    public static final SubLSymbol $yahoo_application_id$ = makeSymbol("*YAHOO-APPLICATION-ID*");

    static private final SubLString $$$Cyc_Analytical_Environment = makeString("Cyc Analytical Environment");



    static private final SubLString $str_alt4$http___api_search_yahoo_com_WebSe = makeString("http://api.search.yahoo.com/WebSearchService/V1/webSearch");

    static private final SubLString $str_alt5$ = makeString("");

    static private final SubLList $list_alt6 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    static private final SubLString $str_alt7$_A = makeString("~A");

    static private final SubLString $str_alt8$_A__A = makeString("~A=~A");

    static private final SubLString $str_alt9$_ = makeString("&");

    static private final SubLString $str_alt10$_ = makeString("?");

    static private final SubLString $$$en = makeString("en");

    static private final SubLString $$$results = makeString("results");

    static private final SubLString $$$start = makeString("start");

    static private final SubLString $$$query = makeString("query");

    static private final SubLString $$$appid = makeString("appid");

    static private final SubLString $$$language = makeString("language");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    static private final SubLSymbol $sym19$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol YAHOO_SEARCH_INT = makeSymbol("YAHOO-SEARCH-INT");

    static private final SubLString $$$Error = makeString("Error");

    static private final SubLString $$$Title = makeString("Title");

    static private final SubLString $$$Message = makeString("Message");

    static private final SubLString $str_alt24$_A___A = makeString("~A~%~A");

    static private final SubLString $$$Url = makeString("Url");

    static private final SubLString $$$Summary = makeString("Summary");

    public static final SubLSymbol $yahoo_search_int_caching_state$ = makeSymbol("*YAHOO-SEARCH-INT-CACHING-STATE*");

    public static final SubLSymbol $kw28$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    private static final SubLSymbol YAHOO_COUNT_INT = makeSymbol("YAHOO-COUNT-INT");

    static private final SubLString $$$totalResultsAvailable = makeString("totalResultsAvailable");

    public static final SubLSymbol $yahoo_count_int_caching_state$ = makeSymbol("*YAHOO-COUNT-INT-CACHING-STATE*");

    private static final SubLSymbol YAHOO_COUNT_CACHED = makeSymbol("YAHOO-COUNT-CACHED");

    public static final SubLSymbol $yahoo_count_cached_caching_state$ = makeSymbol("*YAHOO-COUNT-CACHED-CACHING-STATE*");

    static private final SubLString $str_alt34$http___search_yahoo_com_search_p_ = makeString("http://search.yahoo.com/search?p=~A&b=~A&n=~A");

    // // Initializers
    public void declareFunctions() {
        declare_yahoo_file();
    }

    public void initializeVariables() {
        init_yahoo_file();
    }

    public void runTopLevelForms() {
        setup_yahoo_file();
    }
}

