package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class nws_widgets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets";
    public static final String myFingerPrint = "f45ca448f091027c24762039302a5135375be277c652b77c72ec95e40bd93192";
    private static final SubLString $str0$Choose_Location_from_the_Followin;
    private static final SubLList $list1;
    private static final SubLString $str2$Your_National_Weather_Service_for;
    private static final SubLString $str3$__tr_;
    private static final SubLString $str4$_td;
    private static final SubLString $str5$Last_Update;
    private static final SubLString $str6$_td_class_;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLString $str9$Please_select_one_of_the_followin;
    private static final SubLString $str10$data_forecasts;
    private static final SubLString $str11$http_;
    private static final SubLSymbol $kw12$DEFAULT;
    private static final SubLInteger $int13$80;
    private static final SubLSymbol $kw14$PRIVATE;
    private static final SubLSymbol $kw15$MACHINE;
    private static final SubLSymbol $kw16$PORT;
    private static final SubLSymbol $kw17$METHOD;
    private static final SubLSymbol $kw18$GET;
    private static final SubLSymbol $kw19$URL;
    private static final SubLSymbol $kw20$QUERY;
    private static final SubLSymbol $kw21$KEEP_ALIVE_;
    private static final SubLSymbol $kw22$WIDE_NEWLINES_;
    private static final SubLSymbol $kw23$ACCEPT_TYPES;
    private static final SubLSymbol $kw24$CONTENT_TYPE;
    private static final SubLSymbol $kw25$SOAP_ACTION_URI;
    private static final SubLSymbol $sym26$ALPHA_CHAR_P;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLString $str29$_;
    private static final SubLList $list30;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 793L)
    public static SubLObject nws_parse_temp_weather_request(SubLObject tokens) {
        if (nws_widgets.NIL != subl_promotions.memberP((SubLObject)nws_widgets.$str0$Choose_Location_from_the_Followin, tokens, Symbols.symbol_function((SubLObject)nws_widgets.EQUAL), (SubLObject)nws_widgets.UNPROVIDED)) {
            tokens = possible_disambiguation(tokens);
        }
        if (nws_widgets.NIL == tokens) {
            return (SubLObject)nws_widgets.$list1;
        }
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str2$Your_National_Weather_Service_for, (SubLObject)nws_widgets.UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str3$__tr_, (SubLObject)nws_widgets.UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str4$_td, (SubLObject)nws_widgets.UNPROVIDED);
        final SubLObject city = filter_city(ConsesLow.nth((SubLObject)nws_widgets.ONE_INTEGER, tokens));
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str5$Last_Update, (SubLObject)nws_widgets.UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str6$_td_class_, (SubLObject)nws_widgets.UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens(tokens, (SubLObject)nws_widgets.UNPROVIDED);
        if (nws_widgets.NIL == tokens) {
            return (SubLObject)nws_widgets.$list7;
        }
        final SubLObject weathers = filter_weather(ConsesLow.nth((SubLObject)nws_widgets.ZERO_INTEGER, tokens));
        final SubLObject tempf = filter_tempf(ConsesLow.nth((SubLObject)nws_widgets.THREE_INTEGER, tokens));
        final SubLObject tempc = filter_tempc(ConsesLow.nth((SubLObject)nws_widgets.FIVE_INTEGER, tokens));
        SubLObject results = (SubLObject)nws_widgets.NIL;
        SubLObject cdolist_list_var = weathers;
        SubLObject weather = (SubLObject)nws_widgets.NIL;
        weather = cdolist_list_var.first();
        while (nws_widgets.NIL != cdolist_list_var) {
            results = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.listS(city, (SubLObject)nws_widgets.NIL, (SubLObject)nws_widgets.NIL, weather, tempf, (SubLObject)nws_widgets.$list8), results);
            cdolist_list_var = cdolist_list_var.rest();
            weather = cdolist_list_var.first();
        }
        return results;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 1947L)
    public static SubLObject possible_disambiguation(SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str9$Please_select_one_of_the_followin, (SubLObject)nws_widgets.UNPROVIDED);
        tokens = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)nws_widgets.$str10$data_forecasts, (SubLObject)nws_widgets.UNPROVIDED);
        if (nws_widgets.NIL == tokens) {
            return (SubLObject)nws_widgets.NIL;
        }
        final SubLObject href = tokens.first();
        final SubLObject new_address = string_utilities.string_upto(string_utilities.string_after(href, (SubLObject)Characters.CHAR_equal), (SubLObject)Characters.CHAR_greater);
        final SubLObject new_url = Sequences.cconcatenate((SubLObject)nws_widgets.$str11$http_, new_address);
        SubLObject machine = (SubLObject)nws_widgets.NIL;
        SubLObject url = (SubLObject)nws_widgets.NIL;
        SubLObject query = (SubLObject)nws_widgets.NIL;
        SubLObject port = (SubLObject)nws_widgets.NIL;
        SubLObject new_tokens = (SubLObject)nws_widgets.NIL;
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
        final SubLObject real_port = (SubLObject)(port.eql((SubLObject)nws_widgets.$kw12$DEFAULT) ? nws_widgets.$int13$80 : port);
        SubLObject in_stream = (SubLObject)nws_widgets.NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, (SubLObject)nws_widgets.NIL, (SubLObject)nws_widgets.$kw14$PRIVATE);
            if (nws_widgets.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, machine, real_port)) {
                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { nws_widgets.$kw15$MACHINE, machine, nws_widgets.$kw16$PORT, port, nws_widgets.$kw17$METHOD, nws_widgets.$kw18$GET, nws_widgets.$kw19$URL, url, nws_widgets.$kw20$QUERY, query, nws_widgets.$kw21$KEEP_ALIVE_, nws_widgets.T, nws_widgets.$kw22$WIDE_NEWLINES_, nws_widgets.T, nws_widgets.$kw23$ACCEPT_TYPES, nws_widgets.$kw12$DEFAULT, nws_widgets.$kw24$CONTENT_TYPE, nws_widgets.$kw12$DEFAULT, nws_widgets.$kw25$SOAP_ACTION_URI, nws_widgets.NIL }));
                new_tokens = xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)nws_widgets.UNPROVIDED, (SubLObject)nws_widgets.UNPROVIDED, (SubLObject)nws_widgets.UNPROVIDED);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)nws_widgets.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (nws_widgets.NIL != in_stream) {
                    streams_high.close(in_stream, (SubLObject)nws_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return new_tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 2835L)
    public static SubLObject filter_city(final SubLObject city) {
        return (SubLObject)(city.isString() ? string_utilities.trim_whitespace(string_utilities.strip_chars_meeting_test(string_utilities.strip_first_n(city, (SubLObject)nws_widgets.TWO_INTEGER), (SubLObject)nws_widgets.UNPROVIDED)) : nws_widgets.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 2973L)
    public static SubLObject filter_weather(final SubLObject weather) {
        final SubLObject weather_string = Strings.string_downcase(weather, (SubLObject)nws_widgets.UNPROVIDED, (SubLObject)nws_widgets.UNPROVIDED);
        final SubLObject weather_words = string_utilities.break_words(weather_string, Symbols.symbol_function((SubLObject)nws_widgets.$sym26$ALPHA_CHAR_P), (SubLObject)nws_widgets.UNPROVIDED);
        final SubLObject modifiers = (SubLObject)nws_widgets.$list27;
        final SubLObject removes = (SubLObject)nws_widgets.$list28;
        SubLObject current_modifier = (SubLObject)nws_widgets.NIL;
        SubLObject weather_list = (SubLObject)nws_widgets.NIL;
        SubLObject cdolist_list_var = weather_words;
        SubLObject weather_word = (SubLObject)nws_widgets.NIL;
        weather_word = cdolist_list_var.first();
        while (nws_widgets.NIL != cdolist_list_var) {
            if (nws_widgets.NIL == subl_promotions.memberP(weather_word, removes, Symbols.symbol_function((SubLObject)nws_widgets.EQUAL), (SubLObject)nws_widgets.UNPROVIDED)) {
                if (nws_widgets.NIL != current_modifier) {
                    final SubLObject item_var = Sequences.cconcatenate(current_modifier, new SubLObject[] { nws_widgets.$str29$_, weather_word });
                    if (nws_widgets.NIL == conses_high.member(item_var, weather_list, Symbols.symbol_function((SubLObject)nws_widgets.EQL), Symbols.symbol_function((SubLObject)nws_widgets.IDENTITY))) {
                        weather_list = (SubLObject)ConsesLow.cons(item_var, weather_list);
                    }
                    current_modifier = (SubLObject)nws_widgets.NIL;
                }
                else if (nws_widgets.NIL != subl_promotions.memberP(weather_word, modifiers, Symbols.symbol_function((SubLObject)nws_widgets.EQUAL), (SubLObject)nws_widgets.UNPROVIDED)) {
                    current_modifier = weather_word;
                }
                else {
                    final SubLObject item_var = weather_word;
                    if (nws_widgets.NIL == conses_high.member(item_var, weather_list, Symbols.symbol_function((SubLObject)nws_widgets.EQL), Symbols.symbol_function((SubLObject)nws_widgets.IDENTITY))) {
                        weather_list = (SubLObject)ConsesLow.cons(item_var, weather_list);
                    }
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            weather_word = cdolist_list_var.first();
        }
        return weather_list;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 3750L)
    public static SubLObject filter_tempf(final SubLObject tempf) {
        final SubLObject tempf_string = string_utilities.string_upto(tempf, (SubLObject)Characters.CHAR_ampersand);
        return (SubLObject)(tempf_string.isString() ? string_utilities.string_to_integer(tempf_string) : nws_widgets.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 3917L)
    public static SubLObject filter_tempc(final SubLObject tempc) {
        final SubLObject tempc_string = string_utilities.string_between(tempc, (SubLObject)nws_widgets.$list30, (SubLObject)nws_widgets.UNPROVIDED);
        return (SubLObject)(tempc_string.isString() ? string_utilities.string_to_integer(tempc_string) : nws_widgets.NIL);
    }
    
    public static SubLObject declare_nws_widgets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "nws_parse_temp_weather_request", "NWS-PARSE-TEMP-WEATHER-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "possible_disambiguation", "POSSIBLE-DISAMBIGUATION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "filter_city", "FILTER-CITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "filter_weather", "FILTER-WEATHER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "filter_tempf", "FILTER-TEMPF", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.nws_widgets", "filter_tempc", "FILTER-TEMPC", 1, 0, false);
        return (SubLObject)nws_widgets.NIL;
    }
    
    public static SubLObject init_nws_widgets_file() {
        return (SubLObject)nws_widgets.NIL;
    }
    
    public static SubLObject setup_nws_widgets_file() {
        return (SubLObject)nws_widgets.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_nws_widgets_file();
    }
    
    @Override
	public void initializeVariables() {
        init_nws_widgets_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_nws_widgets_file();
    }
    
    static {
        me = (SubLFile)new nws_widgets();
        $str0$Choose_Location_from_the_Followin = SubLObjectFactory.makeString("Choose Location from the Following List");
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)nws_widgets.NIL, (SubLObject)nws_widgets.NIL, (SubLObject)nws_widgets.NIL, (SubLObject)nws_widgets.NIL));
        $str2$Your_National_Weather_Service_for = SubLObjectFactory.makeString("Your National Weather Service forecast");
        $str3$__tr_ = SubLObjectFactory.makeString("</tr>");
        $str4$_td = SubLObjectFactory.makeString("<td");
        $str5$Last_Update = SubLObjectFactory.makeString("Last Update");
        $str6$_td_class_ = SubLObjectFactory.makeString("<td class=");
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL }), (SubLObject)SubLObjectFactory.makeSymbol("RESULTS"));
        $list8 = ConsesLow.list(new SubLObject[] { nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL, nws_widgets.NIL });
        $str9$Please_select_one_of_the_followin = SubLObjectFactory.makeString("Please select one of the following choices");
        $str10$data_forecasts = SubLObjectFactory.makeString("data/forecasts");
        $str11$http_ = SubLObjectFactory.makeString("http:");
        $kw12$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $int13$80 = SubLObjectFactory.makeInteger(80);
        $kw14$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw15$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw16$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw17$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw18$GET = SubLObjectFactory.makeKeyword("GET");
        $kw19$URL = SubLObjectFactory.makeKeyword("URL");
        $kw20$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw21$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw22$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw23$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw24$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw25$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $sym26$ALPHA_CHAR_P = SubLObjectFactory.makeSymbol("ALPHA-CHAR-P");
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("light"), (SubLObject)SubLObjectFactory.makeString("moderate"), (SubLObject)SubLObjectFactory.makeString("heavy"), (SubLObject)SubLObjectFactory.makeString("few"), (SubLObject)SubLObjectFactory.makeString("partly"), (SubLObject)SubLObjectFactory.makeString("mostly"), (SubLObject)SubLObjectFactory.makeString("freezing"));
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("and"), (SubLObject)SubLObjectFactory.makeString("a"), (SubLObject)SubLObjectFactory.makeString("with"));
        $str29$_ = SubLObjectFactory.makeString(" ");
        $list30 = ConsesLow.list((SubLObject)Characters.CHAR_lparen, (SubLObject)Characters.CHAR_ampersand);
    }
}

/*

	Total time: 104 ms
	
*/