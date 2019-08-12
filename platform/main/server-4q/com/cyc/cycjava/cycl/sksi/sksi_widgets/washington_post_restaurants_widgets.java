/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
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


public final class washington_post_restaurants_widgets extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt5$ = makeString("");

    public static final SubLFile me = new washington_post_restaurants_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_request_port$ = makeSymbol("*WASHPOST-REST-REQUEST-PORT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_request_method$ = makeSymbol("*WASHPOST-REST-REQUEST-METHOD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_request_machine$ = makeSymbol("*WASHPOST-REST-REQUEST-MACHINE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_url_base$ = makeSymbol("*WASHPOST-REST-URL-BASE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_url_query_template$ = makeSymbol("*WASHPOST-REST-URL-QUERY-TEMPLATE*");

    // deflexical
    // T iff the Yahoo! web server require 'wide newlines'?. control variable.
    /**
     * T iff the Yahoo! web server require 'wide newlines'?. control variable.
     */
    @LispMethod(comment = "T iff the Yahoo! web server require \'wide newlines\'?. control variable.\ndeflexical")
    private static final SubLSymbol $washpost_rest_wide_newlinesP$ = makeSymbol("*WASHPOST-REST-WIDE-NEWLINES?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_cookie_stash$ = makeSymbol("*WASHPOST-REST-COOKIE-STASH*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_cuisine_selector$ = makeSymbol("*WASHPOST-REST-CUISINE-SELECTOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_price_selector$ = makeSymbol("*WASHPOST-REST-PRICE-SELECTOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_neighborhood_selector$ = makeSymbol("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_choices_end_selector$ = makeSymbol("*WASHPOST-REST-CHOICES-END-SELECTOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_website_restaurant_indicator$ = makeSymbol("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_restaurant_name_indicator$ = makeSymbol("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_restaurant_phone_indicator$ = makeSymbol("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_restaurant_address_indicator$ = makeSymbol("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_website_mapurl_indicator$ = makeSymbol("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_restaurant_cuisine_indicator$ = makeSymbol("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_restaurant_cuisine_list_indicator$ = makeSymbol("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_cuisine_encoding_separator_charset$ = makeSymbol("*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_choices_option_marker$ = makeSymbol("*WASHPOST-REST-CHOICES-OPTION-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_choices_empty_option_marker$ = makeSymbol("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_choices_option_selected_marker$ = makeSymbol("*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $washpost_rest_option_quoting_chars$ = makeSymbol("*WASHPOST-REST-OPTION-QUOTING-CHARS*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $str2$www_washingtonpost_com = makeString("www.washingtonpost.com");

    static private final SubLString $str3$_ac2_wp_dyn = makeString("/ac2/wp-dyn");

    static private final SubLString $str4$node_entertainment_2Fsearch_type_ = makeString("node=entertainment%2Fsearch&type=restaurants&query=&sort=recommended-desc&cw1=~A&cw4=~A&neighborhood=~A");

    static private final SubLString $str5$ = makeString("");

    private static final SubLSymbol $kw14$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw15$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLString $str19$_select_name__cw1__ = makeString("<select name=\"cw1\">");

    private static final SubLString $str20$_select_name__cw4__ = makeString("<select name=\"cw4\">");

    private static final SubLString $str21$_select_name__neighborhood__ = makeString("<select name='neighborhood'>");

    private static final SubLString $str22$__form_ = makeString("</form>");

    private static final SubLString $str24$_a_href___ac2_wp_dyn_node_enterta = makeString("<a href=\"/ac2/wp-dyn?node=entertainment/profile");

    private static final SubLString $str25$_b_ = makeString("<b>");

    private static final SubLString $str26$_br_ = makeString("<br>");

    private static final SubLString $str27$_font_size___2_ = makeString("<font size=\"-2\"");

    private static final SubLString $str28$_a_href__http___eg_washingtonpost = makeString("<a href=\"http://eg.washingtonpost.com/map?");

    private static final SubLString $str29$_script = makeString("<script");

    private static final SubLString $str30$var_newname__ = makeString("var newname =");

    private static final SubLSymbol XML_TOKEN_STARTS_WITH = makeSymbol("XML-TOKEN-STARTS-WITH");

    private static final SubLList $list32 = list(makeSymbol("URL"), makeSymbol("NAME"), makeSymbol("ADDRESS"), makeSymbol("PHONE-NUMBER"), makeSymbol("DIRECTIONS"), makeSymbol("CUISINES"));

    private static final SubLString $str33$The_Restaurant__A_with_the_addres = makeString("The Restaurant ~A with the address ~A and the phone number ~A serves the following cuisines: ~%");

    private static final SubLString $str34$_____A__ = makeString("    ~A~%");

    private static final SubLString $str35$More_information_under___ = makeString("More information under:~%");

    private static final SubLString $str36$__URL___A__ = makeString("  URL: ~A~%");

    private static final SubLString $str37$__Map___A__ = makeString("  Map: ~A~%");

    private static final SubLSymbol $sym38$CHAR_ = makeSymbol("CHAR=");

    private static final SubLString $str39$_option_value_ = makeString("<option value=");

    private static final SubLString $str40$_option = makeString("<option");

    private static final SubLString $$$selected = makeString("selected");

    public static final SubLObject washpost_rest_get_all_restaurants_for_cuisine_alt(SubLObject cuisine) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_get_all_restaurants_for_criteria(string_utilities.to_string(cuisine), $str_alt5$, $str_alt5$);
    }

    public static SubLObject washpost_rest_get_all_restaurants_for_cuisine(final SubLObject cuisine) {
        return washpost_rest_get_all_restaurants_for_criteria(string_utilities.to_string(cuisine), $str5$, $str5$);
    }

    public static final SubLObject washpost_rest_get_all_restaurants_for_price_alt(SubLObject price) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_get_all_restaurants_for_criteria($str_alt5$, string_utilities.to_string(price), $str_alt5$);
    }

    public static SubLObject washpost_rest_get_all_restaurants_for_price(final SubLObject price) {
        return washpost_rest_get_all_restaurants_for_criteria($str5$, string_utilities.to_string(price), $str5$);
    }

    public static final SubLObject washpost_rest_get_all_restaurants_for_neighborhood_alt(SubLObject neighborhood) {
        return com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_get_all_restaurants_for_criteria($str_alt5$, $str_alt5$, string_utilities.to_string(neighborhood));
    }

    public static SubLObject washpost_rest_get_all_restaurants_for_neighborhood(final SubLObject neighborhood) {
        return washpost_rest_get_all_restaurants_for_criteria($str5$, $str5$, string_utilities.to_string(neighborhood));
    }

    public static final SubLObject washpost_rest_get_all_restaurants_for_criteria_alt(SubLObject cuisine, SubLObject price, SubLObject neighborhood) {
        if (cuisine == UNPROVIDED) {
            cuisine = $str_alt5$;
        }
        if (price == UNPROVIDED) {
            price = $str_alt5$;
        }
        if (neighborhood == UNPROVIDED) {
            neighborhood = $str_alt5$;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(cuisine, STRINGP);
            SubLTrampolineFile.checkType(price, STRINGP);
            SubLTrampolineFile.checkType(neighborhood, STRINGP);
            {
                SubLObject encoded_query = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_instantiate_query(cuisine, price, neighborhood);
                SubLObject v_answer = NIL;
                if (NIL != $washpost_rest_cookie_stash$.getGlobalValue()) {
                    {
                        SubLObject _prev_bind_0 = web_utilities.$http_cookies_to_include_in_requests$.currentBinding(thread);
                        try {
                            web_utilities.$http_cookies_to_include_in_requests$.bind($washpost_rest_cookie_stash$.getGlobalValue(), thread);
                            v_answer = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_perform_query_request(encoded_query);
                        } finally {
                            web_utilities.$http_cookies_to_include_in_requests$.rebind(_prev_bind_0, thread);
                        }
                    }
                } else {
                    v_answer = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_perform_query_request(encoded_query);
                }
                return v_answer;
            }
        }
    }

    public static SubLObject washpost_rest_get_all_restaurants_for_criteria(SubLObject cuisine, SubLObject price, SubLObject neighborhood) {
        if (cuisine == UNPROVIDED) {
            cuisine = $str5$;
        }
        if (price == UNPROVIDED) {
            price = $str5$;
        }
        if (neighborhood == UNPROVIDED) {
            neighborhood = $str5$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(cuisine) : "! stringp(cuisine) " + ("Types.stringp(cuisine) " + "CommonSymbols.NIL != Types.stringp(cuisine) ") + cuisine;
        assert NIL != stringp(price) : "! stringp(price) " + ("Types.stringp(price) " + "CommonSymbols.NIL != Types.stringp(price) ") + price;
        assert NIL != stringp(neighborhood) : "! stringp(neighborhood) " + ("Types.stringp(neighborhood) " + "CommonSymbols.NIL != Types.stringp(neighborhood) ") + neighborhood;
        final SubLObject encoded_query = washpost_rest_instantiate_query(cuisine, price, neighborhood);
        SubLObject v_answer = NIL;
        if (NIL != $washpost_rest_cookie_stash$.getGlobalValue()) {
            final SubLObject _prev_bind_0 = web_utilities.$http_cookies_to_include_in_requests$.currentBinding(thread);
            try {
                web_utilities.$http_cookies_to_include_in_requests$.bind($washpost_rest_cookie_stash$.getGlobalValue(), thread);
                v_answer = washpost_rest_perform_query_request(encoded_query);
            } finally {
                web_utilities.$http_cookies_to_include_in_requests$.rebind(_prev_bind_0, thread);
            }
        } else {
            v_answer = washpost_rest_perform_query_request(encoded_query);
        }
        return v_answer;
    }

    public static final SubLObject washpost_rest_perform_query_request_alt(SubLObject encoded_query) {
        {
            SubLObject v_answer = NIL;
            SubLObject real_port = ($washpost_rest_request_port$.getGlobalValue().eql($DEFAULT)) ? ((SubLObject) ($int$80)) : $washpost_rest_request_port$.getGlobalValue();
            SubLObject in_stream = NIL;
            try {
                in_stream = subl_promotions.open_tcp_stream_with_timeout($washpost_rest_request_machine$.getGlobalValue(), real_port, NIL, $PRIVATE);
                if (NIL != in_stream) {
                    web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, $washpost_rest_request_machine$.getGlobalValue(), $PORT, $washpost_rest_request_port$.getGlobalValue(), $METHOD, $washpost_rest_request_method$.getGlobalValue(), $URL, $washpost_rest_url_base$.getGlobalValue(), $QUERY, encoded_query, $kw14$KEEP_ALIVE_, NIL, $kw15$WIDE_NEWLINES_, $washpost_rest_wide_newlinesP$.getGlobalValue(), $ACCEPT_TYPES, $DEFAULT }));
                    v_answer = web_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != in_stream) {
                            close(in_stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_update_cookie_stash(v_answer.first());
            return v_answer;
        }
    }

    public static SubLObject washpost_rest_perform_query_request(final SubLObject encoded_query) {
        SubLObject v_answer = NIL;
        final SubLObject real_port = ($washpost_rest_request_port$.getGlobalValue().eql($DEFAULT)) ? $int$80 : $washpost_rest_request_port$.getGlobalValue();
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout($washpost_rest_request_machine$.getGlobalValue(), real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, $washpost_rest_request_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, $washpost_rest_request_machine$.getGlobalValue(), $PORT, $washpost_rest_request_port$.getGlobalValue(), $METHOD, $washpost_rest_request_method$.getGlobalValue(), $URL, $washpost_rest_url_base$.getGlobalValue(), $QUERY, encoded_query, $kw14$KEEP_ALIVE_, NIL, $kw15$WIDE_NEWLINES_, $washpost_rest_wide_newlinesP$.getGlobalValue(), $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                v_answer = xml_parsing_utilities.xml_tokenize(in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
        washpost_rest_update_cookie_stash(v_answer.first());
        return v_answer;
    }

    public static final SubLObject washpost_rest_instantiate_query_alt(SubLObject cuisine, SubLObject price, SubLObject neighborhood) {
        return format(NIL, $washpost_rest_url_query_template$.getGlobalValue(), new SubLObject[]{ cuisine, price, neighborhood });
    }

    public static SubLObject washpost_rest_instantiate_query(final SubLObject cuisine, final SubLObject price, final SubLObject neighborhood) {
        return format(NIL, $washpost_rest_url_query_template$.getGlobalValue(), new SubLObject[]{ cuisine, price, neighborhood });
    }

    public static final SubLObject washpost_rest_update_cookie_stash_alt(SubLObject http_header) {
        $washpost_rest_cookie_stash$.setGlobalValue(web_utilities.http_extract_cookies_from_reply_header(http_header));
        return $washpost_rest_cookie_stash$.getGlobalValue();
    }

    public static SubLObject washpost_rest_update_cookie_stash(final SubLObject http_header) {
        $washpost_rest_cookie_stash$.setGlobalValue(web_utilities.http_extract_cookies_from_reply_header(http_header));
        return $washpost_rest_cookie_stash$.getGlobalValue();
    }

    public static final SubLObject washpost_rest_parse_all_restaurants_request_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_bindings = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject continuation = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_parse_selection_choices(tokens);
                    SubLObject cuisines = thread.secondMultipleValue();
                    SubLObject prices = thread.thirdMultipleValue();
                    SubLObject neighborhoods = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_past_choices(continuation);
                        while (NIL != current) {
                            thread.resetMultipleValues();
                            {
                                SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_one_restaurant(current);
                                SubLObject continuation_1 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != information) {
                                    v_bindings = cons(information, v_bindings);
                                }
                                current = continuation_1;
                            }
                        } 
                    }
                    return values(nreverse(v_bindings), cuisines, prices, neighborhoods);
                }
            }
        }
    }

    public static SubLObject washpost_rest_parse_all_restaurants_request(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = NIL;
        thread.resetMultipleValues();
        final SubLObject continuation = washpost_rest_parse_selection_choices(tokens);
        final SubLObject cuisines = thread.secondMultipleValue();
        final SubLObject prices = thread.thirdMultipleValue();
        final SubLObject neighborhoods = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject continuation_$1;
        for (SubLObject current = washpost_rest_advance_past_choices(continuation); NIL != current; current = continuation_$1) {
            thread.resetMultipleValues();
            final SubLObject information = washpost_rest_harvest_one_restaurant(current);
            continuation_$1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != information) {
                v_bindings = cons(information, v_bindings);
            }
        }
        return values(nreverse(v_bindings), cuisines, prices, neighborhoods);
    }

    public static final SubLObject washpost_rest_parse_selection_choices_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cuisines = NIL;
                SubLObject prices = NIL;
                SubLObject neighborhoods = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_cuisine_choices(tokens);
                    SubLObject continuation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    cuisines = information;
                    tokens = continuation;
                }
                thread.resetMultipleValues();
                {
                    SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_price_choices(tokens);
                    SubLObject continuation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    prices = information;
                    tokens = continuation;
                }
                thread.resetMultipleValues();
                {
                    SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_neighborhood_choices(tokens);
                    SubLObject continuation = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    neighborhoods = information;
                    tokens = continuation;
                }
                return values(tokens, cuisines, prices, neighborhoods);
            }
        }
    }

    public static SubLObject washpost_rest_parse_selection_choices(SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cuisines = NIL;
        SubLObject prices = NIL;
        SubLObject neighborhoods = NIL;
        thread.resetMultipleValues();
        SubLObject information = washpost_rest_harvest_cuisine_choices(tokens);
        SubLObject continuation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        cuisines = information;
        tokens = continuation;
        thread.resetMultipleValues();
        information = washpost_rest_harvest_price_choices(tokens);
        continuation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        prices = information;
        tokens = continuation;
        thread.resetMultipleValues();
        information = washpost_rest_harvest_neighborhood_choices(tokens);
        continuation = thread.secondMultipleValue();
        thread.resetMultipleValues();
        neighborhoods = information;
        tokens = continuation;
        return values(tokens, cuisines, prices, neighborhoods);
    }

    public static final SubLObject washpost_rest_advance_to_cuisine_selector_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_cuisine_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_to_cuisine_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_cuisine_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_to_price_selector_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_price_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_to_price_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_price_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_to_neighborhood_selector_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_neighborhood_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_to_neighborhood_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_neighborhood_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_past_choices_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_choices_end_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_past_choices(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_choices_end_selector$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_to_next_restaurant_url_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_website_restaurant_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH));
    }

    public static SubLObject washpost_rest_advance_to_next_restaurant_url(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_website_restaurant_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH));
    }

    public static final SubLObject washpost_rest_advance_from_url_to_restaurant_name_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_name_indicator$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_from_url_to_restaurant_name(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_name_indicator$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_from_restaurant_name_to_address_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_address_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH)).rest();
    }

    public static SubLObject washpost_rest_advance_from_restaurant_name_to_address(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_address_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH)).rest();
    }

    public static final SubLObject washpost_rest_advance_from_restaurant_address_to_phone_number_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_phone_indicator$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static SubLObject washpost_rest_advance_from_restaurant_address_to_phone_number(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_phone_indicator$.getGlobalValue(), symbol_function(STRING_EQUAL)).rest();
    }

    public static final SubLObject washpost_rest_advance_to_restaurant_map_url_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_website_mapurl_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH));
    }

    public static SubLObject washpost_rest_advance_to_restaurant_map_url(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_website_mapurl_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH));
    }

    public static final SubLObject washpost_rest_advance_to_restaurant_cuisines_alt(SubLObject tokens) {
        return web_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_cuisine_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH)).rest();
    }

    public static SubLObject washpost_rest_advance_to_restaurant_cuisines(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $washpost_rest_restaurant_cuisine_indicator$.getGlobalValue(), symbol_function(XML_TOKEN_STARTS_WITH)).rest();
    }

    public static final SubLObject washpost_rest_harvest_one_restaurant_alt(SubLObject tokens) {
        {
            SubLObject current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_next_restaurant_url(tokens);
            SubLObject url = NIL;
            SubLObject name = NIL;
            SubLObject address = NIL;
            SubLObject phone_number = NIL;
            SubLObject directions = NIL;
            SubLObject cuisines = NIL;
            url = current.first();
            current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_from_url_to_restaurant_name(current);
            if (NIL == current) {
                return values(NIL, NIL);
            }
            name = string_utilities.trim_whitespace(current.first());
            current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_from_restaurant_name_to_address(current);
            if (NIL == current) {
                return values(NIL, NIL);
            }
            address = string_utilities.trim_whitespace(current.first());
            current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_from_restaurant_address_to_phone_number(current);
            if (NIL == current) {
                return values(NIL, NIL);
            }
            phone_number = string_utilities.trim_whitespace(current.first());
            current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_restaurant_map_url(current);
            if (NIL == current) {
                return values(NIL, NIL);
            }
            directions = string_utilities.trim_whitespace(current.first());
            current = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_restaurant_cuisines(current);
            if (NIL == current) {
                return values(NIL, NIL);
            }
            cuisines = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_convert_cuisine_encoding_to_cuisines(current.first());
            return values(list(url, name, address, phone_number, directions, cuisines), current);
        }
    }

    public static SubLObject washpost_rest_harvest_one_restaurant(final SubLObject tokens) {
        SubLObject current = washpost_rest_advance_to_next_restaurant_url(tokens);
        SubLObject url = NIL;
        SubLObject name = NIL;
        SubLObject address = NIL;
        SubLObject phone_number = NIL;
        SubLObject directions = NIL;
        SubLObject cuisines = NIL;
        url = current.first();
        current = washpost_rest_advance_from_url_to_restaurant_name(current);
        if (NIL == current) {
            return values(NIL, NIL);
        }
        name = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_from_restaurant_name_to_address(current);
        if (NIL == current) {
            return values(NIL, NIL);
        }
        address = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_from_restaurant_address_to_phone_number(current);
        if (NIL == current) {
            return values(NIL, NIL);
        }
        phone_number = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_to_restaurant_map_url(current);
        if (NIL == current) {
            return values(NIL, NIL);
        }
        directions = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_to_restaurant_cuisines(current);
        if (NIL == current) {
            return values(NIL, NIL);
        }
        cuisines = washpost_rest_convert_cuisine_encoding_to_cuisines(current.first());
        return values(list(url, name, address, phone_number, directions, cuisines), current);
    }

    public static final SubLObject print_washington_post_restaurant_information_alt(SubLObject information, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject datum = information;
            SubLObject current = datum;
            SubLObject url = NIL;
            SubLObject name = NIL;
            SubLObject address = NIL;
            SubLObject phone_number = NIL;
            SubLObject directions = NIL;
            SubLObject cuisines = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt30);
            url = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            address = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            phone_number = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            directions = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt30);
            cuisines = current.first();
            current = current.rest();
            if (NIL == current) {
                format(stream, $str_alt31$The_Restaurant__A_with_the_addres, new SubLObject[]{ name, address, phone_number });
                {
                    SubLObject cdolist_list_var = cuisines;
                    SubLObject cuisine = NIL;
                    for (cuisine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cuisine = cdolist_list_var.first()) {
                        format(stream, $str_alt32$_____A__, cuisine);
                    }
                }
                format(stream, $str_alt33$More_information_under___);
                format(stream, $str_alt34$__URL___A__, url);
                format(stream, $str_alt35$__Map___A__, directions);
            } else {
                cdestructuring_bind_error(datum, $list_alt30);
            }
        }
        return information;
    }

    public static SubLObject print_washington_post_restaurant_information(final SubLObject information, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject url = NIL;
        SubLObject name = NIL;
        SubLObject address = NIL;
        SubLObject phone_number = NIL;
        SubLObject directions = NIL;
        SubLObject cuisines = NIL;
        destructuring_bind_must_consp(information, information, $list32);
        url = information.first();
        SubLObject current = information.rest();
        destructuring_bind_must_consp(current, information, $list32);
        name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list32);
        address = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list32);
        phone_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list32);
        directions = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list32);
        cuisines = current.first();
        current = current.rest();
        if (NIL == current) {
            format(stream, $str33$The_Restaurant__A_with_the_addres, new SubLObject[]{ name, address, phone_number });
            SubLObject cdolist_list_var = cuisines;
            SubLObject cuisine = NIL;
            cuisine = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str34$_____A__, cuisine);
                cdolist_list_var = cdolist_list_var.rest();
                cuisine = cdolist_list_var.first();
            } 
            format(stream, $str35$More_information_under___);
            format(stream, $str36$__URL___A__, url);
            format(stream, $str37$__Map___A__, directions);
        } else {
            cdestructuring_bind_error(information, $list32);
        }
        return information;
    }

    public static final SubLObject washpost_rest_convert_cuisine_encoding_to_cuisines_alt(SubLObject encoding) {
        {
            SubLObject position = search($washpost_rest_restaurant_cuisine_list_indicator$.getGlobalValue(), encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject start_quote = position(CHAR_quotation, encoding, symbol_function($sym36$CHAR_), symbol_function(IDENTITY), position, UNPROVIDED);
            SubLObject end_quote = position(CHAR_quotation, encoding, symbol_function($sym36$CHAR_), symbol_function(IDENTITY), add(ONE_INTEGER, start_quote), UNPROVIDED);
            SubLObject cuisines_encoding = string_utilities.substring(encoding, add(ONE_INTEGER, start_quote), end_quote);
            SubLObject cuisines = NIL;
            SubLObject cdolist_list_var = string_utilities.split_string(cuisines_encoding, $washpost_rest_cuisine_encoding_separator_charset$.getGlobalValue());
            SubLObject cuisine = NIL;
            for (cuisine = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cuisine = cdolist_list_var.first()) {
                if (NIL == string_utilities.empty_string_p(cuisine)) {
                    cuisines = cons(cuisine, cuisines);
                }
            }
            return nreverse(cuisines);
        }
    }

    public static SubLObject washpost_rest_convert_cuisine_encoding_to_cuisines(final SubLObject encoding) {
        final SubLObject position = search($washpost_rest_restaurant_cuisine_list_indicator$.getGlobalValue(), encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject start_quote = position(CHAR_quotation, encoding, symbol_function($sym38$CHAR_), symbol_function(IDENTITY), position, UNPROVIDED);
        final SubLObject end_quote = position(CHAR_quotation, encoding, symbol_function($sym38$CHAR_), symbol_function(IDENTITY), add(ONE_INTEGER, start_quote), UNPROVIDED);
        final SubLObject cuisines_encoding = string_utilities.substring(encoding, add(ONE_INTEGER, start_quote), end_quote);
        SubLObject cuisines = NIL;
        SubLObject cdolist_list_var = string_utilities.split_string(cuisines_encoding, $washpost_rest_cuisine_encoding_separator_charset$.getGlobalValue());
        SubLObject cuisine = NIL;
        cuisine = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == string_utilities.empty_string_p(cuisine)) {
                cuisines = cons(cuisine, cuisines);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cuisine = cdolist_list_var.first();
        } 
        return nreverse(cuisines);
    }

    public static final SubLObject washpost_rest_harvest_cuisine_choices_alt(SubLObject tokens) {
        {
            SubLObject cuisine = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_cuisine_selector(tokens);
            SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_all_choices(cuisine);
            return values(information, cuisine);
        }
    }

    public static SubLObject washpost_rest_harvest_cuisine_choices(final SubLObject tokens) {
        final SubLObject cuisine = washpost_rest_advance_to_cuisine_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(cuisine);
        return values(information, cuisine);
    }

    public static final SubLObject washpost_rest_harvest_price_choices_alt(SubLObject tokens) {
        {
            SubLObject prices = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_price_selector(tokens);
            SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_all_choices(prices);
            return values(information, prices);
        }
    }

    public static SubLObject washpost_rest_harvest_price_choices(final SubLObject tokens) {
        final SubLObject prices = washpost_rest_advance_to_price_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(prices);
        return values(information, prices);
    }

    public static final SubLObject washpost_rest_harvest_neighborhood_choices_alt(SubLObject tokens) {
        {
            SubLObject neighborhood = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_advance_to_neighborhood_selector(tokens);
            SubLObject information = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.washpost_rest_harvest_all_choices(neighborhood);
            return values(information, neighborhood);
        }
    }

    public static SubLObject washpost_rest_harvest_neighborhood_choices(final SubLObject tokens) {
        final SubLObject neighborhood = washpost_rest_advance_to_neighborhood_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(neighborhood);
        return values(information, neighborhood);
    }

    public static final SubLObject washpost_rest_harvest_all_choices_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject choice_start = tokens;
                SubLObject current = choice_start.rest();
                SubLObject choices = NIL;
                while (NIL != web_utilities.xml_token_starts_with(current.first(), $washpost_rest_choices_empty_option_marker$.getGlobalValue())) {
                    {
                        SubLObject option_string = current.first();
                        if (NIL != web_utilities.xml_token_starts_with(option_string, $washpost_rest_choices_option_marker$.getGlobalValue())) {
                            thread.resetMultipleValues();
                            {
                                SubLObject option_value = com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets.extract_option_value_from_html_encoding(option_string);
                                SubLObject selectedP = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject choice = string_utilities.trim_whitespace(second(current));
                                    choices = cons(list(option_value, choice, selectedP), choices);
                                }
                            }
                        }
                        current = current.rest().rest();
                    }
                } 
                return nreverse(choices);
            }
        }
    }

    public static SubLObject washpost_rest_harvest_all_choices(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current = tokens.rest();
        SubLObject choices = NIL;
        while (NIL != xml_parsing_utilities.xml_token_starts_with(current.first(), $washpost_rest_choices_empty_option_marker$.getGlobalValue())) {
            final SubLObject option_string = current.first();
            if (NIL != xml_parsing_utilities.xml_token_starts_with(option_string, $washpost_rest_choices_option_marker$.getGlobalValue())) {
                thread.resetMultipleValues();
                final SubLObject option_value = extract_option_value_from_html_encoding(option_string);
                final SubLObject selectedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject choice = string_utilities.trim_whitespace(second(current));
                choices = cons(list(option_value, choice, selectedP), choices);
            }
            current = current.rest().rest();
        } 
        return nreverse(choices);
    }

    public static final SubLObject extract_option_value_from_html_encoding_alt(SubLObject option_string) {
        {
            SubLObject selectedP = NIL;
            SubLObject value = NIL;
            if (NIL == value) {
                {
                    SubLObject csome_list_var = $washpost_rest_option_quoting_chars$.getGlobalValue();
                    SubLObject quote_char = NIL;
                    for (quote_char = csome_list_var.first(); !((NIL != value) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , quote_char = csome_list_var.first()) {
                        {
                            SubLObject start = NIL;
                            SubLObject end = NIL;
                            start = position(quote_char, option_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (start.isFixnum()) {
                                end = position(quote_char, option_string, symbol_function($sym36$CHAR_), symbol_function(IDENTITY), add(ONE_INTEGER, start), UNPROVIDED);
                                if (end.isFixnum()) {
                                    if (start.numE(end)) {
                                        value = $str_alt5$;
                                    } else {
                                        value = string_utilities.substring(option_string, add(start, ONE_INTEGER), end);
                                    }
                                    selectedP = search($washpost_rest_choices_option_selected_marker$.getGlobalValue(), option_string, symbol_function(CHAR_EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, length($washpost_rest_choices_option_selected_marker$.getGlobalValue()), add(end, ONE_INTEGER), UNPROVIDED);
                                }
                            }
                        }
                    }
                }
            }
            return values(value, selectedP);
        }
    }

    public static SubLObject extract_option_value_from_html_encoding(final SubLObject option_string) {
        SubLObject selectedP = NIL;
        SubLObject value = NIL;
        if (NIL == value) {
            SubLObject csome_list_var = $washpost_rest_option_quoting_chars$.getGlobalValue();
            SubLObject quote_char = NIL;
            quote_char = csome_list_var.first();
            while ((NIL == value) && (NIL != csome_list_var)) {
                SubLObject start = NIL;
                SubLObject end = NIL;
                start = position(quote_char, option_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (start.isFixnum()) {
                    end = position(quote_char, option_string, symbol_function($sym38$CHAR_), symbol_function(IDENTITY), add(ONE_INTEGER, start), UNPROVIDED);
                    if (end.isFixnum()) {
                        if (start.numE(end)) {
                            value = $str5$;
                        } else {
                            value = string_utilities.substring(option_string, add(start, ONE_INTEGER), end);
                        }
                        selectedP = search($washpost_rest_choices_option_selected_marker$.getGlobalValue(), option_string, symbol_function(CHAR_EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, length($washpost_rest_choices_option_selected_marker$.getGlobalValue()), add(end, ONE_INTEGER), UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                quote_char = csome_list_var.first();
            } 
        }
        return values(value, selectedP);
    }

    public static SubLObject declare_washington_post_restaurants_widgets_file() {
        declareFunction("washpost_rest_get_all_restaurants_for_cuisine", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CUISINE", 1, 0, false);
        declareFunction("washpost_rest_get_all_restaurants_for_price", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-PRICE", 1, 0, false);
        declareFunction("washpost_rest_get_all_restaurants_for_neighborhood", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-NEIGHBORHOOD", 1, 0, false);
        declareFunction("washpost_rest_get_all_restaurants_for_criteria", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CRITERIA", 0, 3, false);
        declareFunction("washpost_rest_perform_query_request", "WASHPOST-REST-PERFORM-QUERY-REQUEST", 1, 0, false);
        declareFunction("washpost_rest_instantiate_query", "WASHPOST-REST-INSTANTIATE-QUERY", 3, 0, false);
        declareFunction("washpost_rest_update_cookie_stash", "WASHPOST-REST-UPDATE-COOKIE-STASH", 1, 0, false);
        declareFunction("washpost_rest_parse_all_restaurants_request", "WASHPOST-REST-PARSE-ALL-RESTAURANTS-REQUEST", 1, 0, false);
        declareFunction("washpost_rest_parse_selection_choices", "WASHPOST-REST-PARSE-SELECTION-CHOICES", 1, 0, false);
        declareFunction("washpost_rest_advance_to_cuisine_selector", "WASHPOST-REST-ADVANCE-TO-CUISINE-SELECTOR", 1, 0, false);
        declareFunction("washpost_rest_advance_to_price_selector", "WASHPOST-REST-ADVANCE-TO-PRICE-SELECTOR", 1, 0, false);
        declareFunction("washpost_rest_advance_to_neighborhood_selector", "WASHPOST-REST-ADVANCE-TO-NEIGHBORHOOD-SELECTOR", 1, 0, false);
        declareFunction("washpost_rest_advance_past_choices", "WASHPOST-REST-ADVANCE-PAST-CHOICES", 1, 0, false);
        declareFunction("washpost_rest_advance_to_next_restaurant_url", "WASHPOST-REST-ADVANCE-TO-NEXT-RESTAURANT-URL", 1, 0, false);
        declareFunction("washpost_rest_advance_from_url_to_restaurant_name", "WASHPOST-REST-ADVANCE-FROM-URL-TO-RESTAURANT-NAME", 1, 0, false);
        declareFunction("washpost_rest_advance_from_restaurant_name_to_address", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-NAME-TO-ADDRESS", 1, 0, false);
        declareFunction("washpost_rest_advance_from_restaurant_address_to_phone_number", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-ADDRESS-TO-PHONE-NUMBER", 1, 0, false);
        declareFunction("washpost_rest_advance_to_restaurant_map_url", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-MAP-URL", 1, 0, false);
        declareFunction("washpost_rest_advance_to_restaurant_cuisines", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-CUISINES", 1, 0, false);
        declareFunction("washpost_rest_harvest_one_restaurant", "WASHPOST-REST-HARVEST-ONE-RESTAURANT", 1, 0, false);
        declareFunction("print_washington_post_restaurant_information", "PRINT-WASHINGTON-POST-RESTAURANT-INFORMATION", 1, 1, false);
        declareFunction("washpost_rest_convert_cuisine_encoding_to_cuisines", "WASHPOST-REST-CONVERT-CUISINE-ENCODING-TO-CUISINES", 1, 0, false);
        declareFunction("washpost_rest_harvest_cuisine_choices", "WASHPOST-REST-HARVEST-CUISINE-CHOICES", 1, 0, false);
        declareFunction("washpost_rest_harvest_price_choices", "WASHPOST-REST-HARVEST-PRICE-CHOICES", 1, 0, false);
        declareFunction("washpost_rest_harvest_neighborhood_choices", "WASHPOST-REST-HARVEST-NEIGHBORHOOD-CHOICES", 1, 0, false);
        declareFunction("washpost_rest_harvest_all_choices", "WASHPOST-REST-HARVEST-ALL-CHOICES", 1, 0, false);
        declareFunction("extract_option_value_from_html_encoding", "EXTRACT-OPTION-VALUE-FROM-HTML-ENCODING", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_washington_post_restaurants_widgets_file_alt() {
        deflexical("*WASHPOST-REST-REQUEST-PORT*", $int$80);
        deflexical("*WASHPOST-REST-REQUEST-METHOD*", $GET);
        deflexical("*WASHPOST-REST-REQUEST-MACHINE*", $str_alt2$www_washingtonpost_com);
        deflexical("*WASHPOST-REST-URL-BASE*", $str_alt3$_ac2_wp_dyn);
        deflexical("*WASHPOST-REST-URL-QUERY-TEMPLATE*", $str_alt4$node_entertainment_2Fsearch_type_);
        deflexical("*WASHPOST-REST-WIDE-NEWLINES?*", T);
        deflexical("*WASHPOST-REST-COOKIE-STASH*", NIL);
        deflexical("*WASHPOST-REST-CUISINE-SELECTOR*", $str_alt17$_select_name__cw1__);
        deflexical("*WASHPOST-REST-PRICE-SELECTOR*", $str_alt18$_select_name__cw4__);
        deflexical("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", $str_alt19$_select_name__neighborhood__);
        deflexical("*WASHPOST-REST-CHOICES-END-SELECTOR*", $str_alt20$__form_);
        deflexical("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", $str_alt22$_a_href___ac2_wp_dyn_node_enterta);
        deflexical("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", $str_alt23$_b_);
        deflexical("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", $str_alt24$_br_);
        deflexical("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", $str_alt25$_font_size___2_);
        deflexical("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", $str_alt26$_a_href__http___eg_washingtonpost);
        deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", $str_alt27$_script);
        deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", $str_alt28$var_newname__);
        deflexical("*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*", list(CHAR_comma, CHAR_space));
        deflexical("*WASHPOST-REST-CHOICES-OPTION-MARKER*", $str_alt37$_option_value_);
        deflexical("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", $str_alt38$_option);
        deflexical("*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*", $$$selected);
        deflexical("*WASHPOST-REST-OPTION-QUOTING-CHARS*", list(CHAR_quote, CHAR_quotation));
        return NIL;
    }

    public static SubLObject init_washington_post_restaurants_widgets_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*WASHPOST-REST-REQUEST-PORT*", $int$80);
            deflexical("*WASHPOST-REST-REQUEST-METHOD*", $GET);
            deflexical("*WASHPOST-REST-REQUEST-MACHINE*", $str2$www_washingtonpost_com);
            deflexical("*WASHPOST-REST-URL-BASE*", $str3$_ac2_wp_dyn);
            deflexical("*WASHPOST-REST-URL-QUERY-TEMPLATE*", $str4$node_entertainment_2Fsearch_type_);
            deflexical("*WASHPOST-REST-WIDE-NEWLINES?*", T);
            deflexical("*WASHPOST-REST-COOKIE-STASH*", NIL);
            deflexical("*WASHPOST-REST-CUISINE-SELECTOR*", $str19$_select_name__cw1__);
            deflexical("*WASHPOST-REST-PRICE-SELECTOR*", $str20$_select_name__cw4__);
            deflexical("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", $str21$_select_name__neighborhood__);
            deflexical("*WASHPOST-REST-CHOICES-END-SELECTOR*", $str22$__form_);
            deflexical("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", $str24$_a_href___ac2_wp_dyn_node_enterta);
            deflexical("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", $str25$_b_);
            deflexical("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", $str26$_br_);
            deflexical("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", $str27$_font_size___2_);
            deflexical("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", $str28$_a_href__http___eg_washingtonpost);
            deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", $str29$_script);
            deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", $str30$var_newname__);
            deflexical("*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*", list(CHAR_comma, CHAR_space));
            deflexical("*WASHPOST-REST-CHOICES-OPTION-MARKER*", $str39$_option_value_);
            deflexical("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", $str40$_option);
            deflexical("*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*", $$$selected);
            deflexical("*WASHPOST-REST-OPTION-QUOTING-CHARS*", list(CHAR_quote, CHAR_quotation));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*WASHPOST-REST-CUISINE-SELECTOR*", $str_alt17$_select_name__cw1__);
            deflexical("*WASHPOST-REST-PRICE-SELECTOR*", $str_alt18$_select_name__cw4__);
            deflexical("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", $str_alt19$_select_name__neighborhood__);
            deflexical("*WASHPOST-REST-CHOICES-END-SELECTOR*", $str_alt20$__form_);
            deflexical("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", $str_alt22$_a_href___ac2_wp_dyn_node_enterta);
            deflexical("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", $str_alt23$_b_);
            deflexical("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", $str_alt24$_br_);
            deflexical("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", $str_alt25$_font_size___2_);
            deflexical("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", $str_alt26$_a_href__http___eg_washingtonpost);
            deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", $str_alt27$_script);
            deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", $str_alt28$var_newname__);
            deflexical("*WASHPOST-REST-CHOICES-OPTION-MARKER*", $str_alt37$_option_value_);
            deflexical("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", $str_alt38$_option);
        }
        return NIL;
    }

    public static SubLObject init_washington_post_restaurants_widgets_file_Previous() {
        deflexical("*WASHPOST-REST-REQUEST-PORT*", $int$80);
        deflexical("*WASHPOST-REST-REQUEST-METHOD*", $GET);
        deflexical("*WASHPOST-REST-REQUEST-MACHINE*", $str2$www_washingtonpost_com);
        deflexical("*WASHPOST-REST-URL-BASE*", $str3$_ac2_wp_dyn);
        deflexical("*WASHPOST-REST-URL-QUERY-TEMPLATE*", $str4$node_entertainment_2Fsearch_type_);
        deflexical("*WASHPOST-REST-WIDE-NEWLINES?*", T);
        deflexical("*WASHPOST-REST-COOKIE-STASH*", NIL);
        deflexical("*WASHPOST-REST-CUISINE-SELECTOR*", $str19$_select_name__cw1__);
        deflexical("*WASHPOST-REST-PRICE-SELECTOR*", $str20$_select_name__cw4__);
        deflexical("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", $str21$_select_name__neighborhood__);
        deflexical("*WASHPOST-REST-CHOICES-END-SELECTOR*", $str22$__form_);
        deflexical("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", $str24$_a_href___ac2_wp_dyn_node_enterta);
        deflexical("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", $str25$_b_);
        deflexical("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", $str26$_br_);
        deflexical("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", $str27$_font_size___2_);
        deflexical("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", $str28$_a_href__http___eg_washingtonpost);
        deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", $str29$_script);
        deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", $str30$var_newname__);
        deflexical("*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*", list(CHAR_comma, CHAR_space));
        deflexical("*WASHPOST-REST-CHOICES-OPTION-MARKER*", $str39$_option_value_);
        deflexical("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", $str40$_option);
        deflexical("*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*", $$$selected);
        deflexical("*WASHPOST-REST-OPTION-QUOTING-CHARS*", list(CHAR_quote, CHAR_quotation));
        return NIL;
    }

    static private final SubLString $str_alt2$www_washingtonpost_com = makeString("www.washingtonpost.com");

    static private final SubLString $str_alt3$_ac2_wp_dyn = makeString("/ac2/wp-dyn");

    static private final SubLString $str_alt4$node_entertainment_2Fsearch_type_ = makeString("node=entertainment%2Fsearch&type=restaurants&query=&sort=recommended-desc&cw1=~A&cw4=~A&neighborhood=~A");

    public static SubLObject setup_washington_post_restaurants_widgets_file() {
        return NIL;
    }

    static private final SubLString $str_alt17$_select_name__cw1__ = makeString("<select name=\"cw1\">");

    @Override
    public void declareFunctions() {
        declare_washington_post_restaurants_widgets_file();
    }

    static private final SubLString $str_alt18$_select_name__cw4__ = makeString("<select name=\"cw4\">");

    @Override
    public void initializeVariables() {
        init_washington_post_restaurants_widgets_file();
    }

    static private final SubLString $str_alt19$_select_name__neighborhood__ = makeString("<select name='neighborhood'>");

    @Override
    public void runTopLevelForms() {
        setup_washington_post_restaurants_widgets_file();
    }

    static private final SubLString $str_alt20$__form_ = makeString("</form>");

    static {
    }

    static private final SubLString $str_alt22$_a_href___ac2_wp_dyn_node_enterta = makeString("<a href=\"/ac2/wp-dyn?node=entertainment/profile");

    static private final SubLString $str_alt23$_b_ = makeString("<b>");

    static private final SubLString $str_alt24$_br_ = makeString("<br>");

    static private final SubLString $str_alt25$_font_size___2_ = makeString("<font size=\"-2\"");

    static private final SubLString $str_alt26$_a_href__http___eg_washingtonpost = makeString("<a href=\"http://eg.washingtonpost.com/map?");

    static private final SubLString $str_alt27$_script = makeString("<script");

    static private final SubLString $str_alt28$var_newname__ = makeString("var newname =");

    static private final SubLList $list_alt30 = list(makeSymbol("URL"), makeSymbol("NAME"), makeSymbol("ADDRESS"), makeSymbol("PHONE-NUMBER"), makeSymbol("DIRECTIONS"), makeSymbol("CUISINES"));

    static private final SubLString $str_alt31$The_Restaurant__A_with_the_addres = makeString("The Restaurant ~A with the address ~A and the phone number ~A serves the following cuisines: ~%");

    static private final SubLString $str_alt32$_____A__ = makeString("    ~A~%");

    static private final SubLString $str_alt33$More_information_under___ = makeString("More information under:~%");

    static private final SubLString $str_alt34$__URL___A__ = makeString("  URL: ~A~%");

    static private final SubLString $str_alt35$__Map___A__ = makeString("  Map: ~A~%");

    static private final SubLSymbol $sym36$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str_alt37$_option_value_ = makeString("<option value=");

    static private final SubLString $str_alt38$_option = makeString("<option");
}

/**
 * Total time: 151 ms
 */
