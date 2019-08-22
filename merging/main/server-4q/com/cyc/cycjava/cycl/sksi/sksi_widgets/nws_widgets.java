/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_lparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class nws_widgets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nws_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$Choose_Location_from_the_Followin = makeString("Choose Location from the Following List");

    static private final SubLList $list1 = list(list(NIL, NIL, NIL, NIL));

    static private final SubLString $str2$Your_National_Weather_Service_for = makeString("Your National Weather Service forecast");

    static private final SubLString $str3$__tr_ = makeString("</tr>");

    static private final SubLString $str4$_td = makeString("<td");

    static private final SubLString $$$Last_Update = makeString("Last Update");

    static private final SubLString $str6$_td_class_ = makeString("<td class=");

    static private final SubLList $list7 = list(list(new SubLObject[]{ NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL }), makeSymbol("RESULTS"));

    static private final SubLList $list8 = list(new SubLObject[]{ NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL });

    static private final SubLString $str9$Please_select_one_of_the_followin = makeString("Please select one of the following choices");

    static private final SubLString $str10$data_forecasts = makeString("data/forecasts");

    static private final SubLString $str11$http_ = makeString("http:");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLSymbol $kw21$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw22$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLList $list27 = list(makeString("light"), makeString("moderate"), makeString("heavy"), makeString("few"), makeString("partly"), makeString("mostly"), makeString("freezing"));

    static private final SubLList $list28 = list(makeString("and"), makeString("a"), makeString("with"));

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list30 = list(CHAR_lparen, CHAR_ampersand);

    // Definitions
    public static final SubLObject nws_parse_temp_weather_request_alt(SubLObject tokens) {
        if (NIL != subl_promotions.memberP($str_alt0$Choose_Location_from_the_Followin, tokens, symbol_function(EQUAL), UNPROVIDED)) {
            tokens = com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets.possible_disambiguation(tokens);
        }
        if (NIL == tokens) {
            return $list_alt1;
        }
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt2$Your_National_Weather_Service_for, UNPROVIDED);
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt3$__tr_, UNPROVIDED);
        tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt4$_td, UNPROVIDED);
        {
            SubLObject city = com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets.filter_city(nth(ONE_INTEGER, tokens));
            tokens = web_utilities.advance_xml_tokens_to(tokens, $$$Last_Update, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt6$_td_class_, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens(tokens, UNPROVIDED);
            if (NIL == tokens) {
                return $list_alt7;
            }
            {
                SubLObject weathers = com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets.filter_weather(nth(ZERO_INTEGER, tokens));
                SubLObject tempf = com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets.filter_tempf(nth(THREE_INTEGER, tokens));
                SubLObject tempc = com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets.filter_tempc(nth(FIVE_INTEGER, tokens));
                SubLObject results = NIL;
                SubLObject cdolist_list_var = weathers;
                SubLObject weather = NIL;
                for (weather = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , weather = cdolist_list_var.first()) {
                    results = cons(listS(city, NIL, NIL, weather, tempf, $list_alt8), results);
                }
                return results;
            }
        }
    }

    // Definitions
    public static SubLObject nws_parse_temp_weather_request(SubLObject tokens) {
        if (NIL != subl_promotions.memberP($str0$Choose_Location_from_the_Followin, tokens, symbol_function(EQUAL), UNPROVIDED)) {
            tokens = possible_disambiguation(tokens);
        }
        if (NIL == tokens) {
            return $list1;
        }
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str2$Your_National_Weather_Service_for, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str3$__tr_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str4$_td, UNPROVIDED);
        final SubLObject city = filter_city(nth(ONE_INTEGER, tokens));
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$Last_Update, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str6$_td_class_, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, UNPROVIDED);
        if (NIL == tokens) {
            return $list7;
        }
        final SubLObject weathers = filter_weather(nth(ZERO_INTEGER, tokens));
        final SubLObject tempf = filter_tempf(nth(THREE_INTEGER, tokens));
        final SubLObject tempc = filter_tempc(nth(FIVE_INTEGER, tokens));
        SubLObject results = NIL;
        SubLObject cdolist_list_var = weathers;
        SubLObject weather = NIL;
        weather = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            results = cons(listS(city, NIL, NIL, weather, tempf, $list8), results);
            cdolist_list_var = cdolist_list_var.rest();
            weather = cdolist_list_var.first();
        } 
        return results;
    }

    public static final SubLObject possible_disambiguation_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt9$Please_select_one_of_the_followin, UNPROVIDED);
            tokens = web_utilities.advance_xml_tokens_to(tokens, $str_alt10$data_forecasts, UNPROVIDED);
            if (NIL == tokens) {
                return NIL;
            }
            {
                SubLObject href = tokens.first();
                SubLObject new_address = string_utilities.string_upto(string_utilities.string_after(href, CHAR_equal), CHAR_greater);
                SubLObject new_url = cconcatenate($str_alt11$http_, new_address);
                SubLObject machine = NIL;
                SubLObject url = NIL;
                SubLObject query = NIL;
                SubLObject port = NIL;
                SubLObject new_tokens = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject machine_1 = web_utilities.parse_http_url(new_url);
                    SubLObject port_2 = thread.secondMultipleValue();
                    SubLObject url_3 = thread.thirdMultipleValue();
                    SubLObject query_4 = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    machine = machine_1;
                    port = port_2;
                    url = url_3;
                    query = query_4;
                }
                {
                    SubLObject real_port = (port.eql($DEFAULT)) ? ((SubLObject) ($int$80)) : port;
                    SubLObject in_stream = NIL;
                    try {
                        in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, NIL, $PRIVATE);
                        if (NIL != in_stream) {
                            web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, $GET, $URL, url, $QUERY, query, $kw21$KEEP_ALIVE_, T, $kw22$WIDE_NEWLINES_, T, $ACCEPT_TYPES, $DEFAULT }));
                            new_tokens = web_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != in_stream) {
                                    close(in_stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return new_tokens;
            }
        }
    }

    public static SubLObject possible_disambiguation(SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str9$Please_select_one_of_the_followin, UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, $str10$data_forecasts, UNPROVIDED);
        if (NIL == tokens) {
            return NIL;
        }
        final SubLObject href = tokens.first();
        final SubLObject new_address = string_utilities.string_upto(string_utilities.string_after(href, CHAR_equal), CHAR_greater);
        final SubLObject new_url = cconcatenate($str11$http_, new_address);
        SubLObject machine = NIL;
        SubLObject url = NIL;
        SubLObject query = NIL;
        SubLObject port = NIL;
        SubLObject new_tokens = NIL;
        thread.resetMultipleValues();
        final SubLObject machine_$1 = web_utilities.parse_http_url(new_url);
        final SubLObject port_$2 = thread.secondMultipleValue();
        final SubLObject url_$3 = thread.thirdMultipleValue();
        final SubLObject query_$4 = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        machine = machine_$1;
        port = port_$2;
        url = url_$3;
        query = query_$4;
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, machine, real_port)) {
                web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, $GET, $URL, url, $QUERY, query, $kw21$KEEP_ALIVE_, T, $kw22$WIDE_NEWLINES_, T, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                new_tokens = xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != in_stream) {
                    close(in_stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return new_tokens;
    }

    public static final SubLObject filter_city_alt(SubLObject city) {
        return city.isString() ? ((SubLObject) (string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(string_utilities.strip_first_n(city, TWO_INTEGER), UNPROVIDED)))) : NIL;
    }

    public static SubLObject filter_city(final SubLObject city) {
        return city.isString() ? string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(string_utilities.strip_first_n(city, TWO_INTEGER), UNPROVIDED)) : NIL;
    }

    public static final SubLObject filter_weather_alt(SubLObject weather) {
        {
            SubLObject weather_string = Strings.string_downcase(weather, UNPROVIDED, UNPROVIDED);
            SubLObject weather_words = string_utilities.break_words(weather_string, symbol_function(ALPHA_CHAR_P), UNPROVIDED);
            SubLObject modifiers = $list_alt25;
            SubLObject removes = $list_alt26;
            SubLObject current_modifier = NIL;
            SubLObject weather_list = NIL;
            SubLObject cdolist_list_var = weather_words;
            SubLObject weather_word = NIL;
            for (weather_word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , weather_word = cdolist_list_var.first()) {
                if (NIL == subl_promotions.memberP(weather_word, removes, symbol_function(EQUAL), UNPROVIDED)) {
                    if (NIL != current_modifier) {
                        {
                            SubLObject item_var = cconcatenate(current_modifier, new SubLObject[]{ $str_alt27$_, weather_word });
                            if (NIL == member(item_var, weather_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                weather_list = cons(item_var, weather_list);
                            }
                            current_modifier = NIL;
                        }
                    } else {
                        if (NIL != subl_promotions.memberP(weather_word, modifiers, symbol_function(EQUAL), UNPROVIDED)) {
                            current_modifier = weather_word;
                        } else {
                            {
                                SubLObject item_var = weather_word;
                                if (NIL == member(item_var, weather_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                    weather_list = cons(item_var, weather_list);
                                }
                            }
                        }
                    }
                }
            }
            return weather_list;
        }
    }

    public static SubLObject filter_weather(final SubLObject weather) {
        final SubLObject weather_string = Strings.string_downcase(weather, UNPROVIDED, UNPROVIDED);
        final SubLObject weather_words = string_utilities.break_words(weather_string, symbol_function(ALPHA_CHAR_P), UNPROVIDED);
        final SubLObject modifiers = $list27;
        final SubLObject removes = $list28;
        SubLObject current_modifier = NIL;
        SubLObject weather_list = NIL;
        SubLObject cdolist_list_var = weather_words;
        SubLObject weather_word = NIL;
        weather_word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == subl_promotions.memberP(weather_word, removes, symbol_function(EQUAL), UNPROVIDED)) {
                if (NIL != current_modifier) {
                    final SubLObject item_var = cconcatenate(current_modifier, new SubLObject[]{ $$$_, weather_word });
                    if (NIL == member(item_var, weather_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                        weather_list = cons(item_var, weather_list);
                    }
                    current_modifier = NIL;
                } else
                    if (NIL != subl_promotions.memberP(weather_word, modifiers, symbol_function(EQUAL), UNPROVIDED)) {
                        current_modifier = weather_word;
                    } else {
                        final SubLObject item_var = weather_word;
                        if (NIL == member(item_var, weather_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                            weather_list = cons(item_var, weather_list);
                        }
                    }

            }
            cdolist_list_var = cdolist_list_var.rest();
            weather_word = cdolist_list_var.first();
        } 
        return weather_list;
    }

    public static final SubLObject filter_tempf_alt(SubLObject tempf) {
        {
            SubLObject tempf_string = string_utilities.string_upto(tempf, CHAR_ampersand);
            return tempf_string.isString() ? ((SubLObject) (string_utilities.string_to_integer(tempf_string))) : NIL;
        }
    }

    public static SubLObject filter_tempf(final SubLObject tempf) {
        final SubLObject tempf_string = string_utilities.string_upto(tempf, CHAR_ampersand);
        return tempf_string.isString() ? string_utilities.string_to_integer(tempf_string) : NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Choose_Location_from_the_Followin = makeString("Choose Location from the Following List");

    public static final SubLObject filter_tempc_alt(SubLObject tempc) {
        {
            SubLObject tempc_string = string_utilities.string_between(tempc, $list_alt28, UNPROVIDED);
            return tempc_string.isString() ? ((SubLObject) (string_utilities.string_to_integer(tempc_string))) : NIL;
        }
    }

    public static SubLObject filter_tempc(final SubLObject tempc) {
        final SubLObject tempc_string = string_utilities.string_between(tempc, $list30, UNPROVIDED);
        return tempc_string.isString() ? string_utilities.string_to_integer(tempc_string) : NIL;
    }

    static private final SubLList $list_alt1 = list(list(NIL, NIL, NIL, NIL));

    static private final SubLString $str_alt2$Your_National_Weather_Service_for = makeString("Your National Weather Service forecast");

    static private final SubLString $str_alt3$__tr_ = makeString("</tr>");

    public static SubLObject declare_nws_widgets_file() {
        declareFunction("nws_parse_temp_weather_request", "NWS-PARSE-TEMP-WEATHER-REQUEST", 1, 0, false);
        declareFunction("possible_disambiguation", "POSSIBLE-DISAMBIGUATION", 1, 0, false);
        declareFunction("filter_city", "FILTER-CITY", 1, 0, false);
        declareFunction("filter_weather", "FILTER-WEATHER", 1, 0, false);
        declareFunction("filter_tempf", "FILTER-TEMPF", 1, 0, false);
        declareFunction("filter_tempc", "FILTER-TEMPC", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt4$_td = makeString("<td");

    static private final SubLString $str_alt6$_td_class_ = makeString("<td class=");

    static private final SubLList $list_alt7 = list(list(new SubLObject[]{ NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL }), makeSymbol("RESULTS"));

    static private final SubLList $list_alt8 = list(new SubLObject[]{ NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL });

    public static SubLObject init_nws_widgets_file() {
        return NIL;
    }

    static private final SubLString $str_alt9$Please_select_one_of_the_followin = makeString("Please select one of the following choices");

    public static SubLObject setup_nws_widgets_file() {
        return NIL;
    }

    static private final SubLString $str_alt10$data_forecasts = makeString("data/forecasts");

    @Override
    public void declareFunctions() {
        declare_nws_widgets_file();
    }

    static private final SubLString $str_alt11$http_ = makeString("http:");

    @Override
    public void initializeVariables() {
        init_nws_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nws_widgets_file();
    }

    

    static private final SubLList $list_alt25 = list(makeString("light"), makeString("moderate"), makeString("heavy"), makeString("few"), makeString("partly"), makeString("mostly"), makeString("freezing"));

    static private final SubLList $list_alt26 = list(makeString("and"), makeString("a"), makeString("with"));

    static private final SubLString $str_alt27$_ = makeString(" ");

    static private final SubLList $list_alt28 = list(CHAR_lparen, CHAR_ampersand);
}

/**
 * Total time: 104 ms
 */
