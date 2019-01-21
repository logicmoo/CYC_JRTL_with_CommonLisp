package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class washington_post_restaurants_widgets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets";
    public static final String myFingerPrint = "462b67e0cb199f18729a6ff7f71c746f491cf0409e21a5e47056ad111f0ff1b4";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1318L)
    private static SubLSymbol $washpost_rest_request_port$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1373L)
    private static SubLSymbol $washpost_rest_request_method$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1430L)
    private static SubLSymbol $washpost_rest_request_machine$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1508L)
    private static SubLSymbol $washpost_rest_url_base$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1575L)
    private static SubLSymbol $washpost_rest_url_query_template$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 1935L)
    private static SubLSymbol $washpost_rest_wide_newlinesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2074L)
    private static SubLSymbol $washpost_rest_cookie_stash$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5701L)
    private static SubLSymbol $washpost_rest_cuisine_selector$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5803L)
    private static SubLSymbol $washpost_rest_price_selector$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5879L)
    private static SubLSymbol $washpost_rest_neighborhood_selector$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5969L)
    private static SubLSymbol $washpost_rest_choices_end_selector$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6693L)
    private static SubLSymbol $washpost_rest_website_restaurant_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6812L)
    private static SubLSymbol $washpost_rest_restaurant_name_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6881L)
    private static SubLSymbol $washpost_rest_restaurant_phone_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6952L)
    private static SubLSymbol $washpost_rest_restaurant_address_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7038L)
    private static SubLSymbol $washpost_rest_website_mapurl_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7146L)
    private static SubLSymbol $washpost_rest_restaurant_cuisine_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7222L)
    private static SubLSymbol $washpost_rest_restaurant_cuisine_list_indicator$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 10517L)
    private static SubLSymbol $washpost_rest_cuisine_encoding_separator_charset$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 12092L)
    private static SubLSymbol $washpost_rest_choices_option_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 12251L)
    private static SubLSymbol $washpost_rest_choices_empty_option_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 12326L)
    private static SubLSymbol $washpost_rest_choices_option_selected_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 13129L)
    private static SubLSymbol $washpost_rest_option_quoting_chars$;
    private static final SubLInteger $int0$80;
    private static final SubLSymbol $kw1$GET;
    private static final SubLString $str2$www_washingtonpost_com;
    private static final SubLString $str3$_ac2_wp_dyn;
    private static final SubLString $str4$node_entertainment_2Fsearch_type_;
    private static final SubLString $str5$;
    private static final SubLSymbol $sym6$STRINGP;
    private static final SubLSymbol $kw7$DEFAULT;
    private static final SubLSymbol $kw8$PRIVATE;
    private static final SubLSymbol $kw9$MACHINE;
    private static final SubLSymbol $kw10$PORT;
    private static final SubLSymbol $kw11$METHOD;
    private static final SubLSymbol $kw12$URL;
    private static final SubLSymbol $kw13$QUERY;
    private static final SubLSymbol $kw14$KEEP_ALIVE_;
    private static final SubLSymbol $kw15$WIDE_NEWLINES_;
    private static final SubLSymbol $kw16$ACCEPT_TYPES;
    private static final SubLSymbol $kw17$CONTENT_TYPE;
    private static final SubLSymbol $kw18$SOAP_ACTION_URI;
    private static final SubLString $str19$_select_name__cw1__;
    private static final SubLString $str20$_select_name__cw4__;
    private static final SubLString $str21$_select_name__neighborhood__;
    private static final SubLString $str22$__form_;
    private static final SubLSymbol $sym23$STRING_EQUAL;
    private static final SubLString $str24$_a_href___ac2_wp_dyn_node_enterta;
    private static final SubLString $str25$_b_;
    private static final SubLString $str26$_br_;
    private static final SubLString $str27$_font_size___2_;
    private static final SubLString $str28$_a_href__http___eg_washingtonpost;
    private static final SubLString $str29$_script;
    private static final SubLString $str30$var_newname__;
    private static final SubLSymbol $sym31$XML_TOKEN_STARTS_WITH;
    private static final SubLList $list32;
    private static final SubLString $str33$The_Restaurant__A_with_the_addres;
    private static final SubLString $str34$_____A__;
    private static final SubLString $str35$More_information_under___;
    private static final SubLString $str36$__URL___A__;
    private static final SubLString $str37$__Map___A__;
    private static final SubLSymbol $sym38$CHAR_;
    private static final SubLString $str39$_option_value_;
    private static final SubLString $str40$_option;
    private static final SubLString $str41$selected;
    private static final SubLSymbol $sym42$CHAR_EQUAL;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2135L)
    public static SubLObject washpost_rest_get_all_restaurants_for_cuisine(final SubLObject cuisine) {
        return washpost_rest_get_all_restaurants_for_criteria(string_utilities.to_string(cuisine), (SubLObject)washington_post_restaurants_widgets.$str5$, (SubLObject)washington_post_restaurants_widgets.$str5$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2301L)
    public static SubLObject washpost_rest_get_all_restaurants_for_price(final SubLObject price) {
        return washpost_rest_get_all_restaurants_for_criteria((SubLObject)washington_post_restaurants_widgets.$str5$, string_utilities.to_string(price), (SubLObject)washington_post_restaurants_widgets.$str5$);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2459L)
    public static SubLObject washpost_rest_get_all_restaurants_for_neighborhood(final SubLObject neighborhood) {
        return washpost_rest_get_all_restaurants_for_criteria((SubLObject)washington_post_restaurants_widgets.$str5$, (SubLObject)washington_post_restaurants_widgets.$str5$, string_utilities.to_string(neighborhood));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2649L)
    public static SubLObject washpost_rest_get_all_restaurants_for_criteria(SubLObject cuisine, SubLObject price, SubLObject neighborhood) {
        if (cuisine == washington_post_restaurants_widgets.UNPROVIDED) {
            cuisine = (SubLObject)washington_post_restaurants_widgets.$str5$;
        }
        if (price == washington_post_restaurants_widgets.UNPROVIDED) {
            price = (SubLObject)washington_post_restaurants_widgets.$str5$;
        }
        if (neighborhood == washington_post_restaurants_widgets.UNPROVIDED) {
            neighborhood = (SubLObject)washington_post_restaurants_widgets.$str5$;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert washington_post_restaurants_widgets.NIL != Types.stringp(cuisine) : cuisine;
        assert washington_post_restaurants_widgets.NIL != Types.stringp(price) : price;
        assert washington_post_restaurants_widgets.NIL != Types.stringp(neighborhood) : neighborhood;
        final SubLObject encoded_query = washpost_rest_instantiate_query(cuisine, price, neighborhood);
        SubLObject v_answer = (SubLObject)washington_post_restaurants_widgets.NIL;
        if (washington_post_restaurants_widgets.NIL != washington_post_restaurants_widgets.$washpost_rest_cookie_stash$.getGlobalValue()) {
            final SubLObject _prev_bind_0 = web_utilities.$http_cookies_to_include_in_requests$.currentBinding(thread);
            try {
                web_utilities.$http_cookies_to_include_in_requests$.bind(washington_post_restaurants_widgets.$washpost_rest_cookie_stash$.getGlobalValue(), thread);
                v_answer = washpost_rest_perform_query_request(encoded_query);
            }
            finally {
                web_utilities.$http_cookies_to_include_in_requests$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            v_answer = washpost_rest_perform_query_request(encoded_query);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 3394L)
    public static SubLObject washpost_rest_perform_query_request(final SubLObject encoded_query) {
        SubLObject v_answer = (SubLObject)washington_post_restaurants_widgets.NIL;
        final SubLObject real_port = (SubLObject)(washington_post_restaurants_widgets.$washpost_rest_request_port$.getGlobalValue().eql((SubLObject)washington_post_restaurants_widgets.$kw7$DEFAULT) ? washington_post_restaurants_widgets.$int0$80 : washington_post_restaurants_widgets.$washpost_rest_request_port$.getGlobalValue());
        SubLObject in_stream = (SubLObject)washington_post_restaurants_widgets.NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(washington_post_restaurants_widgets.$washpost_rest_request_machine$.getGlobalValue(), real_port, (SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.$kw8$PRIVATE);
            if (washington_post_restaurants_widgets.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, washington_post_restaurants_widgets.$washpost_rest_request_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { washington_post_restaurants_widgets.$kw9$MACHINE, washington_post_restaurants_widgets.$washpost_rest_request_machine$.getGlobalValue(), washington_post_restaurants_widgets.$kw10$PORT, washington_post_restaurants_widgets.$washpost_rest_request_port$.getGlobalValue(), washington_post_restaurants_widgets.$kw11$METHOD, washington_post_restaurants_widgets.$washpost_rest_request_method$.getGlobalValue(), washington_post_restaurants_widgets.$kw12$URL, washington_post_restaurants_widgets.$washpost_rest_url_base$.getGlobalValue(), washington_post_restaurants_widgets.$kw13$QUERY, encoded_query, washington_post_restaurants_widgets.$kw14$KEEP_ALIVE_, washington_post_restaurants_widgets.NIL, washington_post_restaurants_widgets.$kw15$WIDE_NEWLINES_, washington_post_restaurants_widgets.$washpost_rest_wide_newlinesP$.getGlobalValue(), washington_post_restaurants_widgets.$kw16$ACCEPT_TYPES, washington_post_restaurants_widgets.$kw7$DEFAULT, washington_post_restaurants_widgets.$kw17$CONTENT_TYPE, washington_post_restaurants_widgets.$kw7$DEFAULT, washington_post_restaurants_widgets.$kw18$SOAP_ACTION_URI, washington_post_restaurants_widgets.NIL }));
                v_answer = xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)washington_post_restaurants_widgets.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (washington_post_restaurants_widgets.NIL != in_stream) {
                    streams_high.close(in_stream, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        washpost_rest_update_cookie_stash(v_answer.first());
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 3942L)
    public static SubLObject washpost_rest_instantiate_query(final SubLObject cuisine, final SubLObject price, final SubLObject neighborhood) {
        return PrintLow.format((SubLObject)washington_post_restaurants_widgets.NIL, washington_post_restaurants_widgets.$washpost_rest_url_query_template$.getGlobalValue(), new SubLObject[] { cuisine, price, neighborhood });
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 4120L)
    public static SubLObject washpost_rest_update_cookie_stash(final SubLObject http_header) {
        washington_post_restaurants_widgets.$washpost_rest_cookie_stash$.setGlobalValue(web_utilities.http_extract_cookies_from_reply_header(http_header));
        return washington_post_restaurants_widgets.$washpost_rest_cookie_stash$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 4325L)
    public static SubLObject washpost_rest_parse_all_restaurants_request(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_bindings = (SubLObject)washington_post_restaurants_widgets.NIL;
        thread.resetMultipleValues();
        final SubLObject continuation = washpost_rest_parse_selection_choices(tokens);
        final SubLObject cuisines = thread.secondMultipleValue();
        final SubLObject prices = thread.thirdMultipleValue();
        final SubLObject neighborhoods = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        SubLObject continuation_$1;
        for (SubLObject current = washpost_rest_advance_past_choices(continuation); washington_post_restaurants_widgets.NIL != current; current = continuation_$1) {
            thread.resetMultipleValues();
            final SubLObject information = washpost_rest_harvest_one_restaurant(current);
            continuation_$1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (washington_post_restaurants_widgets.NIL != information) {
                v_bindings = (SubLObject)ConsesLow.cons(information, v_bindings);
            }
        }
        return Values.values(Sequences.nreverse(v_bindings), cuisines, prices, neighborhoods);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5000L)
    public static SubLObject washpost_rest_parse_selection_choices(SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cuisines = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject prices = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject neighborhoods = (SubLObject)washington_post_restaurants_widgets.NIL;
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
        return Values.values(tokens, cuisines, prices, neighborhoods);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6037L)
    public static SubLObject washpost_rest_advance_to_cuisine_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_cuisine_selector$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6201L)
    public static SubLObject washpost_rest_advance_to_price_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_price_selector$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6360L)
    public static SubLObject washpost_rest_advance_to_neighborhood_selector(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_neighborhood_selector$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6533L)
    public static SubLObject washpost_rest_advance_past_choices(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_choices_end_selector$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7309L)
    public static SubLObject washpost_rest_advance_to_next_restaurant_url(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_website_restaurant_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym31$XML_TOKEN_STARTS_WITH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7520L)
    public static SubLObject washpost_rest_advance_from_url_to_restaurant_name(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_restaurant_name_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7736L)
    public static SubLObject washpost_rest_advance_from_restaurant_name_to_address(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_restaurant_address_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym31$XML_TOKEN_STARTS_WITH)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7968L)
    public static SubLObject washpost_rest_advance_from_restaurant_address_to_phone_number(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_restaurant_phone_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym23$STRING_EQUAL)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8197L)
    public static SubLObject washpost_rest_advance_to_restaurant_map_url(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_website_mapurl_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym31$XML_TOKEN_STARTS_WITH));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8402L)
    public static SubLObject washpost_rest_advance_to_restaurant_cuisines(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_indicator$.getGlobalValue(), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym31$XML_TOKEN_STARTS_WITH)).rest();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8625L)
    public static SubLObject washpost_rest_harvest_one_restaurant(final SubLObject tokens) {
        SubLObject current = washpost_rest_advance_to_next_restaurant_url(tokens);
        SubLObject url = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject name = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject address = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject phone_number = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject directions = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject cuisines = (SubLObject)washington_post_restaurants_widgets.NIL;
        url = current.first();
        current = washpost_rest_advance_from_url_to_restaurant_name(current);
        if (washington_post_restaurants_widgets.NIL == current) {
            return Values.values((SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.NIL);
        }
        name = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_from_restaurant_name_to_address(current);
        if (washington_post_restaurants_widgets.NIL == current) {
            return Values.values((SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.NIL);
        }
        address = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_from_restaurant_address_to_phone_number(current);
        if (washington_post_restaurants_widgets.NIL == current) {
            return Values.values((SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.NIL);
        }
        phone_number = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_to_restaurant_map_url(current);
        if (washington_post_restaurants_widgets.NIL == current) {
            return Values.values((SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.NIL);
        }
        directions = string_utilities.trim_whitespace(current.first());
        current = washpost_rest_advance_to_restaurant_cuisines(current);
        if (washington_post_restaurants_widgets.NIL == current) {
            return Values.values((SubLObject)washington_post_restaurants_widgets.NIL, (SubLObject)washington_post_restaurants_widgets.NIL);
        }
        cuisines = washpost_rest_convert_cuisine_encoding_to_cuisines(current.first());
        return Values.values((SubLObject)ConsesLow.list(url, name, address, phone_number, directions, cuisines), current);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 9961L)
    public static SubLObject print_washington_post_restaurant_information(final SubLObject information, SubLObject stream) {
        if (stream == washington_post_restaurants_widgets.UNPROVIDED) {
            stream = (SubLObject)washington_post_restaurants_widgets.T;
        }
        SubLObject url = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject name = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject address = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject phone_number = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject directions = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject cuisines = (SubLObject)washington_post_restaurants_widgets.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(information, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        url = information.first();
        SubLObject current = information.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        address = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        phone_number = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        directions = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)washington_post_restaurants_widgets.$list32);
        cuisines = current.first();
        current = current.rest();
        if (washington_post_restaurants_widgets.NIL == current) {
            PrintLow.format(stream, (SubLObject)washington_post_restaurants_widgets.$str33$The_Restaurant__A_with_the_addres, new SubLObject[] { name, address, phone_number });
            SubLObject cdolist_list_var = cuisines;
            SubLObject cuisine = (SubLObject)washington_post_restaurants_widgets.NIL;
            cuisine = cdolist_list_var.first();
            while (washington_post_restaurants_widgets.NIL != cdolist_list_var) {
                PrintLow.format(stream, (SubLObject)washington_post_restaurants_widgets.$str34$_____A__, cuisine);
                cdolist_list_var = cdolist_list_var.rest();
                cuisine = cdolist_list_var.first();
            }
            PrintLow.format(stream, (SubLObject)washington_post_restaurants_widgets.$str35$More_information_under___);
            PrintLow.format(stream, (SubLObject)washington_post_restaurants_widgets.$str36$__URL___A__, url);
            PrintLow.format(stream, (SubLObject)washington_post_restaurants_widgets.$str37$__Map___A__, directions);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(information, (SubLObject)washington_post_restaurants_widgets.$list32);
        }
        return information;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 10615L)
    public static SubLObject washpost_rest_convert_cuisine_encoding_to_cuisines(final SubLObject encoding) {
        final SubLObject position = Sequences.search(washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_list_indicator$.getGlobalValue(), encoding, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
        final SubLObject start_quote = Sequences.position((SubLObject)Characters.CHAR_quotation, encoding, Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym38$CHAR_), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.IDENTITY), position, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
        final SubLObject end_quote = Sequences.position((SubLObject)Characters.CHAR_quotation, encoding, Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym38$CHAR_), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.IDENTITY), Numbers.add((SubLObject)washington_post_restaurants_widgets.ONE_INTEGER, start_quote), (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
        final SubLObject cuisines_encoding = string_utilities.substring(encoding, Numbers.add((SubLObject)washington_post_restaurants_widgets.ONE_INTEGER, start_quote), end_quote);
        SubLObject cuisines = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject cdolist_list_var = string_utilities.split_string(cuisines_encoding, washington_post_restaurants_widgets.$washpost_rest_cuisine_encoding_separator_charset$.getGlobalValue());
        SubLObject cuisine = (SubLObject)washington_post_restaurants_widgets.NIL;
        cuisine = cdolist_list_var.first();
        while (washington_post_restaurants_widgets.NIL != cdolist_list_var) {
            if (washington_post_restaurants_widgets.NIL == string_utilities.empty_string_p(cuisine)) {
                cuisines = (SubLObject)ConsesLow.cons(cuisine, cuisines);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cuisine = cdolist_list_var.first();
        }
        return Sequences.nreverse(cuisines);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11301L)
    public static SubLObject washpost_rest_harvest_cuisine_choices(final SubLObject tokens) {
        final SubLObject cuisine = washpost_rest_advance_to_cuisine_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(cuisine);
        return Values.values(information, cuisine);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11588L)
    public static SubLObject washpost_rest_harvest_price_choices(final SubLObject tokens) {
        final SubLObject prices = washpost_rest_advance_to_price_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(prices);
        return Values.values(information, prices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11824L)
    public static SubLObject washpost_rest_harvest_neighborhood_choices(final SubLObject tokens) {
        final SubLObject neighborhood = washpost_rest_advance_to_neighborhood_selector(tokens);
        final SubLObject information = washpost_rest_harvest_all_choices(neighborhood);
        return Values.values(information, neighborhood);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 12405L)
    public static SubLObject washpost_rest_harvest_all_choices(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current = tokens.rest();
        SubLObject choices = (SubLObject)washington_post_restaurants_widgets.NIL;
        while (washington_post_restaurants_widgets.NIL != xml_parsing_utilities.xml_token_starts_with(current.first(), washington_post_restaurants_widgets.$washpost_rest_choices_empty_option_marker$.getGlobalValue())) {
            final SubLObject option_string = current.first();
            if (washington_post_restaurants_widgets.NIL != xml_parsing_utilities.xml_token_starts_with(option_string, washington_post_restaurants_widgets.$washpost_rest_choices_option_marker$.getGlobalValue())) {
                thread.resetMultipleValues();
                final SubLObject option_value = extract_option_value_from_html_encoding(option_string);
                final SubLObject selectedP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject choice = string_utilities.trim_whitespace(conses_high.second(current));
                choices = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(option_value, choice, selectedP), choices);
            }
            current = current.rest().rest();
        }
        return Sequences.nreverse(choices);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 13203L)
    public static SubLObject extract_option_value_from_html_encoding(final SubLObject option_string) {
        SubLObject selectedP = (SubLObject)washington_post_restaurants_widgets.NIL;
        SubLObject value = (SubLObject)washington_post_restaurants_widgets.NIL;
        if (washington_post_restaurants_widgets.NIL == value) {
            SubLObject csome_list_var = washington_post_restaurants_widgets.$washpost_rest_option_quoting_chars$.getGlobalValue();
            SubLObject quote_char = (SubLObject)washington_post_restaurants_widgets.NIL;
            quote_char = csome_list_var.first();
            while (washington_post_restaurants_widgets.NIL == value && washington_post_restaurants_widgets.NIL != csome_list_var) {
                SubLObject start = (SubLObject)washington_post_restaurants_widgets.NIL;
                SubLObject end = (SubLObject)washington_post_restaurants_widgets.NIL;
                start = Sequences.position(quote_char, option_string, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED, (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
                if (start.isFixnum()) {
                    end = Sequences.position(quote_char, option_string, Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym38$CHAR_), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.IDENTITY), Numbers.add((SubLObject)washington_post_restaurants_widgets.ONE_INTEGER, start), (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
                    if (end.isFixnum()) {
                        if (start.numE(end)) {
                            value = (SubLObject)washington_post_restaurants_widgets.$str5$;
                        }
                        else {
                            value = string_utilities.substring(option_string, Numbers.add(start, (SubLObject)washington_post_restaurants_widgets.ONE_INTEGER), end);
                        }
                        selectedP = Sequences.search(washington_post_restaurants_widgets.$washpost_rest_choices_option_selected_marker$.getGlobalValue(), option_string, Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.$sym42$CHAR_EQUAL), Symbols.symbol_function((SubLObject)washington_post_restaurants_widgets.IDENTITY), (SubLObject)washington_post_restaurants_widgets.ZERO_INTEGER, Sequences.length(washington_post_restaurants_widgets.$washpost_rest_choices_option_selected_marker$.getGlobalValue()), Numbers.add(end, (SubLObject)washington_post_restaurants_widgets.ONE_INTEGER), (SubLObject)washington_post_restaurants_widgets.UNPROVIDED);
                    }
                }
                csome_list_var = csome_list_var.rest();
                quote_char = csome_list_var.first();
            }
        }
        return Values.values(value, selectedP);
    }
    
    public static SubLObject declare_washington_post_restaurants_widgets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_get_all_restaurants_for_cuisine", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CUISINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_get_all_restaurants_for_price", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-PRICE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_get_all_restaurants_for_neighborhood", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-NEIGHBORHOOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_get_all_restaurants_for_criteria", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CRITERIA", 0, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_perform_query_request", "WASHPOST-REST-PERFORM-QUERY-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_instantiate_query", "WASHPOST-REST-INSTANTIATE-QUERY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_update_cookie_stash", "WASHPOST-REST-UPDATE-COOKIE-STASH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_parse_all_restaurants_request", "WASHPOST-REST-PARSE-ALL-RESTAURANTS-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_parse_selection_choices", "WASHPOST-REST-PARSE-SELECTION-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_cuisine_selector", "WASHPOST-REST-ADVANCE-TO-CUISINE-SELECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_price_selector", "WASHPOST-REST-ADVANCE-TO-PRICE-SELECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_neighborhood_selector", "WASHPOST-REST-ADVANCE-TO-NEIGHBORHOOD-SELECTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_past_choices", "WASHPOST-REST-ADVANCE-PAST-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_next_restaurant_url", "WASHPOST-REST-ADVANCE-TO-NEXT-RESTAURANT-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_from_url_to_restaurant_name", "WASHPOST-REST-ADVANCE-FROM-URL-TO-RESTAURANT-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_from_restaurant_name_to_address", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-NAME-TO-ADDRESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_from_restaurant_address_to_phone_number", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-ADDRESS-TO-PHONE-NUMBER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_restaurant_map_url", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-MAP-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_advance_to_restaurant_cuisines", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-CUISINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_harvest_one_restaurant", "WASHPOST-REST-HARVEST-ONE-RESTAURANT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "print_washington_post_restaurant_information", "PRINT-WASHINGTON-POST-RESTAURANT-INFORMATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_convert_cuisine_encoding_to_cuisines", "WASHPOST-REST-CONVERT-CUISINE-ENCODING-TO-CUISINES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_harvest_cuisine_choices", "WASHPOST-REST-HARVEST-CUISINE-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_harvest_price_choices", "WASHPOST-REST-HARVEST-PRICE-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_harvest_neighborhood_choices", "WASHPOST-REST-HARVEST-NEIGHBORHOOD-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "washpost_rest_harvest_all_choices", "WASHPOST-REST-HARVEST-ALL-CHOICES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.washington_post_restaurants_widgets", "extract_option_value_from_html_encoding", "EXTRACT-OPTION-VALUE-FROM-HTML-ENCODING", 1, 0, false);
        return (SubLObject)washington_post_restaurants_widgets.NIL;
    }
    
    public static SubLObject init_washington_post_restaurants_widgets_file() {
        washington_post_restaurants_widgets.$washpost_rest_request_port$ = SubLFiles.deflexical("*WASHPOST-REST-REQUEST-PORT*", (SubLObject)washington_post_restaurants_widgets.$int0$80);
        washington_post_restaurants_widgets.$washpost_rest_request_method$ = SubLFiles.deflexical("*WASHPOST-REST-REQUEST-METHOD*", (SubLObject)washington_post_restaurants_widgets.$kw1$GET);
        washington_post_restaurants_widgets.$washpost_rest_request_machine$ = SubLFiles.deflexical("*WASHPOST-REST-REQUEST-MACHINE*", (SubLObject)washington_post_restaurants_widgets.$str2$www_washingtonpost_com);
        washington_post_restaurants_widgets.$washpost_rest_url_base$ = SubLFiles.deflexical("*WASHPOST-REST-URL-BASE*", (SubLObject)washington_post_restaurants_widgets.$str3$_ac2_wp_dyn);
        washington_post_restaurants_widgets.$washpost_rest_url_query_template$ = SubLFiles.deflexical("*WASHPOST-REST-URL-QUERY-TEMPLATE*", (SubLObject)washington_post_restaurants_widgets.$str4$node_entertainment_2Fsearch_type_);
        washington_post_restaurants_widgets.$washpost_rest_wide_newlinesP$ = SubLFiles.deflexical("*WASHPOST-REST-WIDE-NEWLINES?*", (SubLObject)washington_post_restaurants_widgets.T);
        washington_post_restaurants_widgets.$washpost_rest_cookie_stash$ = SubLFiles.deflexical("*WASHPOST-REST-COOKIE-STASH*", (SubLObject)washington_post_restaurants_widgets.NIL);
        washington_post_restaurants_widgets.$washpost_rest_cuisine_selector$ = SubLFiles.deflexical("*WASHPOST-REST-CUISINE-SELECTOR*", (SubLObject)washington_post_restaurants_widgets.$str19$_select_name__cw1__);
        washington_post_restaurants_widgets.$washpost_rest_price_selector$ = SubLFiles.deflexical("*WASHPOST-REST-PRICE-SELECTOR*", (SubLObject)washington_post_restaurants_widgets.$str20$_select_name__cw4__);
        washington_post_restaurants_widgets.$washpost_rest_neighborhood_selector$ = SubLFiles.deflexical("*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", (SubLObject)washington_post_restaurants_widgets.$str21$_select_name__neighborhood__);
        washington_post_restaurants_widgets.$washpost_rest_choices_end_selector$ = SubLFiles.deflexical("*WASHPOST-REST-CHOICES-END-SELECTOR*", (SubLObject)washington_post_restaurants_widgets.$str22$__form_);
        washington_post_restaurants_widgets.$washpost_rest_website_restaurant_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str24$_a_href___ac2_wp_dyn_node_enterta);
        washington_post_restaurants_widgets.$washpost_rest_restaurant_name_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str25$_b_);
        washington_post_restaurants_widgets.$washpost_rest_restaurant_phone_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str26$_br_);
        washington_post_restaurants_widgets.$washpost_rest_restaurant_address_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str27$_font_size___2_);
        washington_post_restaurants_widgets.$washpost_rest_website_mapurl_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str28$_a_href__http___eg_washingtonpost);
        washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str29$_script);
        washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_list_indicator$ = SubLFiles.deflexical("*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", (SubLObject)washington_post_restaurants_widgets.$str30$var_newname__);
        washington_post_restaurants_widgets.$washpost_rest_cuisine_encoding_separator_charset$ = SubLFiles.deflexical("*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*", (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_comma, (SubLObject)Characters.CHAR_space));
        washington_post_restaurants_widgets.$washpost_rest_choices_option_marker$ = SubLFiles.deflexical("*WASHPOST-REST-CHOICES-OPTION-MARKER*", (SubLObject)washington_post_restaurants_widgets.$str39$_option_value_);
        washington_post_restaurants_widgets.$washpost_rest_choices_empty_option_marker$ = SubLFiles.deflexical("*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", (SubLObject)washington_post_restaurants_widgets.$str40$_option);
        washington_post_restaurants_widgets.$washpost_rest_choices_option_selected_marker$ = SubLFiles.deflexical("*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*", (SubLObject)washington_post_restaurants_widgets.$str41$selected);
        washington_post_restaurants_widgets.$washpost_rest_option_quoting_chars$ = SubLFiles.deflexical("*WASHPOST-REST-OPTION-QUOTING-CHARS*", (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_quote, (SubLObject)Characters.CHAR_quotation));
        return (SubLObject)washington_post_restaurants_widgets.NIL;
    }
    
    public static SubLObject setup_washington_post_restaurants_widgets_file() {
        return (SubLObject)washington_post_restaurants_widgets.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_washington_post_restaurants_widgets_file();
    }
    
    @Override
	public void initializeVariables() {
        init_washington_post_restaurants_widgets_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_washington_post_restaurants_widgets_file();
    }
    
    static {
        me = (SubLFile)new washington_post_restaurants_widgets();
        washington_post_restaurants_widgets.$washpost_rest_request_port$ = null;
        washington_post_restaurants_widgets.$washpost_rest_request_method$ = null;
        washington_post_restaurants_widgets.$washpost_rest_request_machine$ = null;
        washington_post_restaurants_widgets.$washpost_rest_url_base$ = null;
        washington_post_restaurants_widgets.$washpost_rest_url_query_template$ = null;
        washington_post_restaurants_widgets.$washpost_rest_wide_newlinesP$ = null;
        washington_post_restaurants_widgets.$washpost_rest_cookie_stash$ = null;
        washington_post_restaurants_widgets.$washpost_rest_cuisine_selector$ = null;
        washington_post_restaurants_widgets.$washpost_rest_price_selector$ = null;
        washington_post_restaurants_widgets.$washpost_rest_neighborhood_selector$ = null;
        washington_post_restaurants_widgets.$washpost_rest_choices_end_selector$ = null;
        washington_post_restaurants_widgets.$washpost_rest_website_restaurant_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_restaurant_name_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_restaurant_phone_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_restaurant_address_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_website_mapurl_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_restaurant_cuisine_list_indicator$ = null;
        washington_post_restaurants_widgets.$washpost_rest_cuisine_encoding_separator_charset$ = null;
        washington_post_restaurants_widgets.$washpost_rest_choices_option_marker$ = null;
        washington_post_restaurants_widgets.$washpost_rest_choices_empty_option_marker$ = null;
        washington_post_restaurants_widgets.$washpost_rest_choices_option_selected_marker$ = null;
        washington_post_restaurants_widgets.$washpost_rest_option_quoting_chars$ = null;
        $int0$80 = SubLObjectFactory.makeInteger(80);
        $kw1$GET = SubLObjectFactory.makeKeyword("GET");
        $str2$www_washingtonpost_com = SubLObjectFactory.makeString("www.washingtonpost.com");
        $str3$_ac2_wp_dyn = SubLObjectFactory.makeString("/ac2/wp-dyn");
        $str4$node_entertainment_2Fsearch_type_ = SubLObjectFactory.makeString("node=entertainment%2Fsearch&type=restaurants&query=&sort=recommended-desc&cw1=~A&cw4=~A&neighborhood=~A");
        $str5$ = SubLObjectFactory.makeString("");
        $sym6$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw7$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw8$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw9$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw10$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw11$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw12$URL = SubLObjectFactory.makeKeyword("URL");
        $kw13$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw14$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw15$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw16$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw17$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw18$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $str19$_select_name__cw1__ = SubLObjectFactory.makeString("<select name=\"cw1\">");
        $str20$_select_name__cw4__ = SubLObjectFactory.makeString("<select name=\"cw4\">");
        $str21$_select_name__neighborhood__ = SubLObjectFactory.makeString("<select name='neighborhood'>");
        $str22$__form_ = SubLObjectFactory.makeString("</form>");
        $sym23$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $str24$_a_href___ac2_wp_dyn_node_enterta = SubLObjectFactory.makeString("<a href=\"/ac2/wp-dyn?node=entertainment/profile");
        $str25$_b_ = SubLObjectFactory.makeString("<b>");
        $str26$_br_ = SubLObjectFactory.makeString("<br>");
        $str27$_font_size___2_ = SubLObjectFactory.makeString("<font size=\"-2\"");
        $str28$_a_href__http___eg_washingtonpost = SubLObjectFactory.makeString("<a href=\"http://eg.washingtonpost.com/map?");
        $str29$_script = SubLObjectFactory.makeString("<script");
        $str30$var_newname__ = SubLObjectFactory.makeString("var newname =");
        $sym31$XML_TOKEN_STARTS_WITH = SubLObjectFactory.makeSymbol("XML-TOKEN-STARTS-WITH");
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("URL"), (SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ADDRESS"), (SubLObject)SubLObjectFactory.makeSymbol("PHONE-NUMBER"), (SubLObject)SubLObjectFactory.makeSymbol("DIRECTIONS"), (SubLObject)SubLObjectFactory.makeSymbol("CUISINES"));
        $str33$The_Restaurant__A_with_the_addres = SubLObjectFactory.makeString("The Restaurant ~A with the address ~A and the phone number ~A serves the following cuisines: ~%");
        $str34$_____A__ = SubLObjectFactory.makeString("    ~A~%");
        $str35$More_information_under___ = SubLObjectFactory.makeString("More information under:~%");
        $str36$__URL___A__ = SubLObjectFactory.makeString("  URL: ~A~%");
        $str37$__Map___A__ = SubLObjectFactory.makeString("  Map: ~A~%");
        $sym38$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $str39$_option_value_ = SubLObjectFactory.makeString("<option value=");
        $str40$_option = SubLObjectFactory.makeString("<option");
        $str41$selected = SubLObjectFactory.makeString("selected");
        $sym42$CHAR_EQUAL = SubLObjectFactory.makeSymbol("CHAR-EQUAL");
    }
}

/*

	Total time: 151 ms
	
*/