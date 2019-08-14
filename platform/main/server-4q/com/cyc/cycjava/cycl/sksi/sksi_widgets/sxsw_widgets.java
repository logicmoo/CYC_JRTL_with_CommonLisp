/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sxsw_widgets extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sxsw_widgets();

 public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets";


    // deflexical
    // Definitions
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_statesman_request_port$ = makeSymbol("*SXSW-STATESMAN-REQUEST-PORT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_statesman_request_method$ = makeSymbol("*SXSW-STATESMAN-REQUEST-METHOD*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_statesman_request_machine$ = makeSymbol("*SXSW-STATESMAN-REQUEST-MACHINE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_statesman_url_base$ = makeSymbol("*SXSW-STATESMAN-URL-BASE*");

    // deflexical
    // T iff the SXSW web server require 'wide newlines'?. control variable.
    /**
     * T iff the SXSW web server require 'wide newlines'?. control variable.
     */
    @LispMethod(comment = "T iff the SXSW web server require \'wide newlines\'?. control variable.\ndeflexical")
    private static final SubLSymbol $sxsw_wide_newlinesP$ = makeSymbol("*SXSW-WIDE-NEWLINES?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_row_start_marker$ = makeSymbol("*SXSW-TABLE-ROW-START-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_row_end_marker$ = makeSymbol("*SXSW-TABLE-ROW-END-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_data_start_marker$ = makeSymbol("*SXSW-TABLE-DATA-START-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_new_date_marker$ = makeSymbol("*SXSW-TABLE-NEW-DATE-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_new_name_marker$ = makeSymbol("*SXSW-TABLE-NEW-NAME-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_table_end_marker$ = makeSymbol("*SXSW-TABLE-END-MARKER*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $sxsw_venue_url_location_marker$ = makeSymbol("*SXSW-VENUE-URL-LOCATION-MARKER*");

    @LispMethod(comment = "Internal Constants")
    // Internal Constants
    private static final SubLInteger $int$80 = makeInteger(80);

    static private final SubLString $str2$cgi_statesman_com = makeString("cgi.statesman.com");

    static private final SubLString $str3$_sxsw_events__search_type_1__cata = makeString("/sxsw/events?_search_type=1&_catagories=band&_event_type=MUSIC&_table_tag=470%2C1%2C3%2C1%2C%2Ctop&_table_color=%23efefef&_list_fields=band.name%2C+band.hometown%2C+band.genre&_table_header=20%25%2CBand%7C20%25%2CHometown%7C20%25%2CGenre&_bandname_keyword=&_venue_id=&_hometown_keyword=&_bandgenre_type=&_event_starttime=&_event_date=&submit=Find+Shows");

    private static final SubLSymbol $kw11$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw12$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");

    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLString $str16$_tr_ = makeString("<tr>");

    private static final SubLString $str17$__tr_ = makeString("</tr>");

    private static final SubLString $str18$_td_ = makeString("<td>");

    private static final SubLString $str19$_h3_ = makeString("<h3>");

    private static final SubLString $str20$_b_ = makeString("<b>");

    private static final SubLString $str21$__table_ = makeString("</table>");

    private static final SubLString $$$Band = makeString("Band");

    private static final SubLString $str25$Location_ = makeString("Location=");

    private static final SubLSymbol $sym26$CHAR_ = makeSymbol("CHAR=");

    private static final SubLString $$$15 = makeString("15");

    private static final SubLString $$$200303 = makeString("200303");

    private static final SubLString $$$20030313 = makeString("20030313");

    private static final SubLString $$$1200 = makeString("1200");

    private static final SubLString $str32$_2__0d_A = makeString("~2,'0d~A");

    private static final SubLString $$$unknown = makeString("unknown");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str36$_nbsp_ = makeString("&nbsp;");

    public static final SubLObject sxsw_all_bands_request_alt() {
        {
            SubLObject encoded_url = $sxsw_statesman_url_base$.getGlobalValue();
            SubLObject v_answer = NIL;
            SubLObject real_port = ($sxsw_statesman_request_port$.getGlobalValue().eql($DEFAULT)) ? ((SubLObject) ($int$80)) : $sxsw_statesman_request_port$.getGlobalValue();
            SubLObject in_stream = NIL;
            try {
                in_stream = subl_promotions.open_tcp_stream_with_timeout($sxsw_statesman_request_machine$.getGlobalValue(), real_port, NIL, $PRIVATE);
                if (NIL != in_stream) {
                    web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, $sxsw_statesman_request_machine$.getGlobalValue(), $PORT, $sxsw_statesman_request_port$.getGlobalValue(), $METHOD, $sxsw_statesman_request_method$.getGlobalValue(), $URL, encoded_url, $QUERY, NIL, $kw11$KEEP_ALIVE_, NIL, $kw12$WIDE_NEWLINES_, $sxsw_wide_newlinesP$.getGlobalValue(), $ACCEPT_TYPES, $DEFAULT }));
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
            return v_answer;
        }
    }

    public static SubLObject sxsw_all_bands_request() {
        final SubLObject encoded_url = $sxsw_statesman_url_base$.getGlobalValue();
        SubLObject v_answer = NIL;
        final SubLObject real_port = ($sxsw_statesman_request_port$.getGlobalValue().eql($DEFAULT)) ? $int$80 : $sxsw_statesman_request_port$.getGlobalValue();
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout($sxsw_statesman_request_machine$.getGlobalValue(), real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, $sxsw_statesman_request_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, $sxsw_statesman_request_machine$.getGlobalValue(), $PORT, $sxsw_statesman_request_port$.getGlobalValue(), $METHOD, $sxsw_statesman_request_method$.getGlobalValue(), $URL, encoded_url, $QUERY, NIL, $kw11$KEEP_ALIVE_, NIL, $kw12$WIDE_NEWLINES_, $sxsw_wide_newlinesP$.getGlobalValue(), $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
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
        return v_answer;
    }

    public static final SubLObject sxsw_parse_bands_by_date_request_alt(SubLObject tokens) {
        if (position($sxsw_table_new_date_marker$.getGlobalValue(), tokens, symbol_function(STRING_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum()) {
            return com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_parse_bands_with_section_dates(tokens);
        } else {
            return com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_parse_bands_with_date_in_table(tokens);
        }
    }

    public static SubLObject sxsw_parse_bands_by_date_request(final SubLObject tokens) {
        if (position($sxsw_table_new_date_marker$.getGlobalValue(), tokens, symbol_function(STRING_EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum()) {
            return sxsw_parse_bands_with_section_dates(tokens);
        }
        return sxsw_parse_bands_with_date_in_table(tokens);
    }

    public static final SubLObject sxsw_parse_bands_with_section_dates_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject date_start = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(tokens, $sxsw_table_new_date_marker$.getGlobalValue(), UNPROVIDED);
                SubLObject doneP = sublisp_null(date_start);
                SubLObject total_events = NIL;
                while (NIL == doneP) {
                    {
                        SubLObject date = NIL;
                        date = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_date_from_datesection_header(date_start.first());
                        thread.resetMultipleValues();
                        {
                            SubLObject events = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_parse_bands_without_date_in_table(date_start, date);
                            SubLObject remainder = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            total_events = cons(events, total_events);
                            date_start = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(remainder, $sxsw_table_new_date_marker$.getGlobalValue(), UNPROVIDED);
                            doneP = sublisp_null(date_start);
                        }
                    }
                } 
                return apply(symbol_function(CCONCATENATE), nreverse(total_events));
            }
        }
    }

    public static SubLObject sxsw_parse_bands_with_section_dates(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject date_start = advance_xml_tokens_past(tokens, $sxsw_table_new_date_marker$.getGlobalValue(), UNPROVIDED);
        SubLObject doneP = sublisp_null(date_start);
        SubLObject total_events = NIL;
        while (NIL == doneP) {
            SubLObject date = NIL;
            date = sxsw_extract_date_from_datesection_header(date_start.first());
            thread.resetMultipleValues();
            final SubLObject events = sxsw_parse_bands_without_date_in_table(date_start, date);
            final SubLObject remainder = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_events = cons(events, total_events);
            date_start = advance_xml_tokens_past(remainder, $sxsw_table_new_date_marker$.getGlobalValue(), UNPROVIDED);
            doneP = sublisp_null(date_start);
        } 
        return apply(symbol_function(CCONCATENATE), nreverse(total_events));
    }

    public static final SubLObject sxsw_parse_bands_without_date_in_table_alt(SubLObject tokens, SubLObject date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_start = web_utilities.advance_xml_tokens_to(tokens, $$$Band, UNPROVIDED);
                SubLObject current = web_utilities.advance_xml_tokens_to(table_start, $sxsw_table_row_end_marker$.getGlobalValue(), UNPROVIDED);
                SubLObject doneP = sublisp_null(current);
                SubLObject events = NIL;
                while (NIL == doneP) {
                    {
                        SubLObject name = NIL;
                        SubLObject home = NIL;
                        SubLObject home_town = NIL;
                        SubLObject home_region = NIL;
                        SubLObject genre = NIL;
                        SubLObject time = NIL;
                        SubLObject venue_code = NIL;
                        SubLObject venue_name = NIL;
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_new_name_marker$.getGlobalValue(), UNPROVIDED);
                        name = current.first();
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        home = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(current.first());
                        thread.resetMultipleValues();
                        {
                            SubLObject home_town_1 = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_convert_home_to_cityXregion(home);
                            SubLObject home_region_2 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            home_town = home_town_1;
                            home_region = home_region_2;
                        }
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        genre = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(current.first());
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        time = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_time_from_timefield(current.first());
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        venue_code = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_location_code_from_venue_url(current.first());
                        venue_name = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(second(current));
                        events = cons(list(date, name, home_town, home_region, time, venue_name, genre), events);
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_row_end_marker$.getGlobalValue(), UNPROVIDED);
                        if (NIL == current) {
                            doneP = T;
                        } else {
                            while (NIL == char_equal(Strings.sublisp_char(current.first(), ZERO_INTEGER), CHAR_less)) {
                                current = current.rest();
                            } 
                            if (NIL != Strings.string_equal(current.first(), $sxsw_table_end_marker$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                return values(nreverse(events), current);
                            }
                        }
                    }
                } 
                return values(nreverse(events), NIL);
            }
        }
    }

    public static SubLObject sxsw_parse_bands_without_date_in_table(final SubLObject tokens, final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_start = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$Band, UNPROVIDED);
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(table_start, $sxsw_table_row_end_marker$.getGlobalValue(), UNPROVIDED);
        SubLObject doneP = sublisp_null(current);
        SubLObject events = NIL;
        while (NIL == doneP) {
            SubLObject name = NIL;
            SubLObject home = NIL;
            SubLObject home_town = NIL;
            SubLObject home_region = NIL;
            SubLObject genre = NIL;
            SubLObject time = NIL;
            SubLObject venue_code = NIL;
            SubLObject venue_name = NIL;
            current = advance_xml_tokens_past(current, $sxsw_table_new_name_marker$.getGlobalValue(), UNPROVIDED);
            name = current.first();
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            home = sxsw_strip_greyspace(current.first());
            thread.resetMultipleValues();
            final SubLObject home_town_$1 = sxsw_convert_home_to_cityXregion(home);
            final SubLObject home_region_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            home_town = home_town_$1;
            home_region = home_region_$2;
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            genre = sxsw_strip_greyspace(current.first());
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            time = sxsw_extract_time_from_timefield(current.first());
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            venue_code = sxsw_extract_location_code_from_venue_url(current.first());
            venue_name = sxsw_strip_greyspace(second(current));
            events = cons(list(date, name, home_town, home_region, time, venue_name, genre), events);
            current = advance_xml_tokens_past(current, $sxsw_table_row_end_marker$.getGlobalValue(), UNPROVIDED);
            if (NIL == current) {
                doneP = T;
            } else {
                while (NIL == char_equal(Strings.sublisp_char(current.first(), ZERO_INTEGER), CHAR_less)) {
                    current = current.rest();
                } 
                if (NIL != Strings.string_equal(current.first(), $sxsw_table_end_marker$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return values(nreverse(events), current);
                }
                continue;
            }
        } 
        return values(nreverse(events), NIL);
    }

    public static final SubLObject sxsw_parse_bands_with_date_in_table_alt(SubLObject tokens) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table_start = web_utilities.advance_xml_tokens_to(tokens, $$$Band, UNPROVIDED);
                SubLObject current = web_utilities.advance_xml_tokens_to(table_start, $sxsw_table_row_start_marker$.getGlobalValue(), UNPROVIDED);
                SubLObject doneP = sublisp_null(current);
                SubLObject events = NIL;
                while (NIL == doneP) {
                    {
                        SubLObject name = NIL;
                        SubLObject home = NIL;
                        SubLObject home_town = NIL;
                        SubLObject home_region = NIL;
                        SubLObject genre = NIL;
                        SubLObject time = NIL;
                        SubLObject date = NIL;
                        SubLObject venue_code = NIL;
                        SubLObject venue_name = NIL;
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $str_alt18$_b_, UNPROVIDED);
                        name = current.first();
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        home = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(current.first());
                        thread.resetMultipleValues();
                        {
                            SubLObject home_town_3 = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_convert_home_to_cityXregion(home);
                            SubLObject home_region_4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            home_town = home_town_3;
                            home_region = home_region_4;
                        }
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        genre = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(current.first());
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        time = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_time_from_timefield(current.first());
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        date = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(current.first());
                        date = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_date_from_datefield(date);
                        current = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
                        venue_code = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_extract_location_code_from_venue_url(current.first());
                        venue_name = com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets.sxsw_strip_greyspace(second(current));
                        events = cons(list(date, name, home_town, home_region, time, venue_name, genre), events);
                        current = web_utilities.advance_xml_tokens_to(current, $sxsw_table_row_start_marker$.getGlobalValue(), UNPROVIDED);
                        doneP = sublisp_null(current);
                    }
                } 
                return nreverse(events);
            }
        }
    }

    public static SubLObject sxsw_parse_bands_with_date_in_table(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_start = xml_parsing_utilities.advance_xml_tokens_to(tokens, $$$Band, UNPROVIDED);
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(table_start, $sxsw_table_row_start_marker$.getGlobalValue(), UNPROVIDED);
        SubLObject doneP = sublisp_null(current);
        SubLObject events = NIL;
        while (NIL == doneP) {
            SubLObject name = NIL;
            SubLObject home = NIL;
            SubLObject home_town = NIL;
            SubLObject home_region = NIL;
            SubLObject genre = NIL;
            SubLObject time = NIL;
            SubLObject date = NIL;
            SubLObject venue_code = NIL;
            SubLObject venue_name = NIL;
            current = advance_xml_tokens_past(current, $str20$_b_, UNPROVIDED);
            name = current.first();
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            home = sxsw_strip_greyspace(current.first());
            thread.resetMultipleValues();
            final SubLObject home_town_$3 = sxsw_convert_home_to_cityXregion(home);
            final SubLObject home_region_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            home_town = home_town_$3;
            home_region = home_region_$4;
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            genre = sxsw_strip_greyspace(current.first());
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            time = sxsw_extract_time_from_timefield(current.first());
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            date = sxsw_strip_greyspace(current.first());
            date = sxsw_extract_date_from_datefield(date);
            current = advance_xml_tokens_past(current, $sxsw_table_data_start_marker$.getGlobalValue(), TWO_INTEGER);
            venue_code = sxsw_extract_location_code_from_venue_url(current.first());
            venue_name = sxsw_strip_greyspace(second(current));
            events = cons(list(date, name, home_town, home_region, time, venue_name, genre), events);
            current = xml_parsing_utilities.advance_xml_tokens_to(current, $sxsw_table_row_start_marker$.getGlobalValue(), UNPROVIDED);
            doneP = sublisp_null(current);
        } 
        return nreverse(events);
    }

    public static final SubLObject sxsw_extract_location_code_from_venue_url_alt(SubLObject url) {
        {
            SubLObject start_pos = search($sxsw_venue_url_location_marker$.getGlobalValue(), url, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (start_pos.isFixnum()) {
                {
                    SubLObject end_pos = position(CHAR_quotation, url, symbol_function($sym24$CHAR_), symbol_function(IDENTITY), start_pos, UNPROVIDED);
                    start_pos = add(start_pos, length($sxsw_venue_url_location_marker$.getGlobalValue()));
                    return subseq(url, start_pos, end_pos);
                }
            }
        }
        return url;
    }

    public static SubLObject sxsw_extract_location_code_from_venue_url(final SubLObject url) {
        SubLObject start_pos = search($sxsw_venue_url_location_marker$.getGlobalValue(), url, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (start_pos.isFixnum()) {
            final SubLObject end_pos = position(CHAR_quotation, url, symbol_function($sym26$CHAR_), symbol_function(IDENTITY), start_pos, UNPROVIDED);
            start_pos = add(start_pos, length($sxsw_venue_url_location_marker$.getGlobalValue()));
            return subseq(url, start_pos, end_pos);
        }
        return url;
    }

    public static final SubLObject sxsw_extract_date_from_datesection_header_alt(SubLObject string) {
        {
            SubLObject date_pieces = string_utilities.split_string(string, UNPROVIDED);
            SubLObject day = NIL;
            if (NIL == day) {
                {
                    SubLObject csome_list_var = nreverse(date_pieces);
                    SubLObject piece = NIL;
                    for (piece = csome_list_var.first(); !((NIL != day) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , piece = csome_list_var.first()) {
                        if (NIL != collection_defns.cyc_numeric_string(piece)) {
                            day = piece;
                        }
                    }
                }
            }
            if (NIL == day) {
                day = $$$15;
            }
            return cconcatenate($$$200303, day);
        }
    }

    public static SubLObject sxsw_extract_date_from_datesection_header(final SubLObject string) {
        final SubLObject date_pieces = string_utilities.split_string(string, UNPROVIDED);
        SubLObject day = NIL;
        if (NIL == day) {
            SubLObject csome_list_var = nreverse(date_pieces);
            SubLObject piece = NIL;
            piece = csome_list_var.first();
            while ((NIL == day) && (NIL != csome_list_var)) {
                if (NIL != collection_defns.cyc_numeric_string(piece)) {
                    day = piece;
                }
                csome_list_var = csome_list_var.rest();
                piece = csome_list_var.first();
            } 
        }
        if (NIL == day) {
            day = $$$15;
        }
        return cconcatenate($$$200303, day);
    }

    public static final SubLObject sxsw_extract_date_from_datefield_alt(SubLObject string) {
        {
            SubLObject date_pieces = string_utilities.split_string(string, UNPROVIDED);
            SubLObject day = second(date_pieces);
            if (NIL == day) {
                return $$$20030313;
            } else {
                return cconcatenate($$$200303, day);
            }
        }
    }

    public static SubLObject sxsw_extract_date_from_datefield(final SubLObject string) {
        final SubLObject date_pieces = string_utilities.split_string(string, UNPROVIDED);
        final SubLObject day = second(date_pieces);
        if (NIL == day) {
            return $$$20030313;
        }
        return cconcatenate($$$200303, day);
    }

    public static final SubLObject sxsw_extract_time_from_timefield_alt(SubLObject string) {
        {
            SubLObject time_pieces = string_utilities.split_string(string, list(CHAR_colon, CHAR_space));
            SubLObject hour_string = time_pieces.first();
            SubLObject minute_string = second(time_pieces);
            SubLObject am_pm_string = third(time_pieces);
            if (NIL == am_pm_string) {
                return $$$1200;
            }
            {
                SubLObject post_meridianP = char_equal(Strings.sublisp_char(am_pm_string, ZERO_INTEGER), CHAR_p);
                SubLObject hours = read_from_string_ignoring_errors(hour_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
                if (!hours.isFixnum()) {
                    hours = ZERO_INTEGER;
                }
                if (NIL != post_meridianP) {
                    hours = add(hours, TWELVE_INTEGER);
                } else {
                    if (hours.numE(TWELVE_INTEGER)) {
                        hours = ZERO_INTEGER;
                    }
                }
                return format(NIL, $str_alt30$_2__0d_A, hours, minute_string);
            }
        }
    }

    public static SubLObject sxsw_extract_time_from_timefield(final SubLObject string) {
        final SubLObject time_pieces = string_utilities.split_string(string, list(CHAR_colon, CHAR_space));
        final SubLObject hour_string = time_pieces.first();
        final SubLObject minute_string = second(time_pieces);
        final SubLObject am_pm_string = third(time_pieces);
        if (NIL == am_pm_string) {
            return $$$1200;
        }
        final SubLObject post_meridianP = char_equal(Strings.sublisp_char(am_pm_string, ZERO_INTEGER), CHAR_p);
        SubLObject hours = read_from_string_ignoring_errors(hour_string, NIL, $EOF, UNPROVIDED, UNPROVIDED);
        if (!hours.isFixnum()) {
            hours = ZERO_INTEGER;
        }
        if (NIL != post_meridianP) {
            hours = add(hours, TWELVE_INTEGER);
        } else
            if (hours.numE(TWELVE_INTEGER)) {
                hours = ZERO_INTEGER;
            }

        return format(NIL, $str32$_2__0d_A, hours, minute_string);
    }

    public static final SubLObject sxsw_convert_home_to_cityXregion_alt(SubLObject home) {
        {
            SubLObject pieces = nreverse(remove_if(EMPTY_STRING_P, string_utilities.split_string(home, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject city_pieces = NIL;
            SubLObject city = NIL;
            SubLObject region = NIL;
            if (NIL == pieces) {
                return values($$$unknown, $$$unknown);
            }
            region = pieces.first();
            pieces = pieces.rest();
            if (NIL == pieces) {
                return values($$$unknown, region);
            }
            while (NIL != string_utilities.upper_case_string_p(pieces.first())) {
                region = cconcatenate(pieces.first(), new SubLObject[]{ $str_alt33$_, region });
                pieces = pieces.rest();
            } 
            {
                SubLObject list_var = NIL;
                SubLObject piece = NIL;
                SubLObject counter = NIL;
                for (list_var = pieces, piece = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , piece = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    if (!counter.isZero()) {
                        city_pieces = cons($str_alt33$_, city_pieces);
                    }
                    city_pieces = cons(piece, city_pieces);
                }
            }
            city = apply(symbol_function(CCONCATENATE), city_pieces);
            return values(city, region);
        }
    }

    public static SubLObject sxsw_convert_home_to_cityXregion(final SubLObject home) {
        SubLObject pieces = nreverse(remove_if(EMPTY_STRING_P, string_utilities.split_string(home, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        SubLObject city_pieces = NIL;
        SubLObject city = NIL;
        SubLObject region = NIL;
        if (NIL == pieces) {
            return values($$$unknown, $$$unknown);
        }
        region = pieces.first();
        pieces = pieces.rest();
        if (NIL == pieces) {
            return values($$$unknown, region);
        }
        while (NIL != string_utilities.upper_case_string_p(pieces.first())) {
            region = cconcatenate(pieces.first(), new SubLObject[]{ $$$_, region });
            pieces = pieces.rest();
        } 
        SubLObject list_var = NIL;
        SubLObject piece = NIL;
        SubLObject counter = NIL;
        list_var = pieces;
        piece = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , piece = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                city_pieces = cons($$$_, city_pieces);
            }
            city_pieces = cons(piece, city_pieces);
        }
        city = apply(symbol_function(CCONCATENATE), city_pieces);
        return values(city, region);
    }

    public static final SubLObject sxsw_strip_greyspace_alt(SubLObject string) {
        {
            SubLObject spot = search($str_alt34$_nbsp_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (spot.isFixnum()) {
                return string_utilities.substring(string, ZERO_INTEGER, spot);
            } else {
                return string;
            }
        }
    }

    public static SubLObject sxsw_strip_greyspace(final SubLObject string) {
        final SubLObject spot = search($str36$_nbsp_, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (spot.isFixnum()) {
            return string_utilities.substring(string, ZERO_INTEGER, spot);
        }
        return string;
    }

    public static final SubLObject advance_xml_tokens_past_alt(SubLObject tokens, SubLObject marker, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        {
            SubLObject current = web_utilities.advance_xml_tokens_to(tokens, marker, UNPROVIDED);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
                current = web_utilities.advance_xml_tokens(current, UNPROVIDED);
            }
            return current;
        }
    }

    public static SubLObject advance_xml_tokens_past(final SubLObject tokens, final SubLObject marker, SubLObject count) {
        if (count == UNPROVIDED) {
            count = ONE_INTEGER;
        }
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(tokens, marker, UNPROVIDED);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(count); i = add(i, ONE_INTEGER)) {
            current = xml_parsing_utilities.advance_xml_tokens(current, UNPROVIDED);
        }
        return current;
    }

    public static SubLObject declare_sxsw_widgets_file() {
        declareFunction("sxsw_all_bands_request", "SXSW-ALL-BANDS-REQUEST", 0, 0, false);
        declareFunction("sxsw_parse_bands_by_date_request", "SXSW-PARSE-BANDS-BY-DATE-REQUEST", 1, 0, false);
        declareFunction("sxsw_parse_bands_with_section_dates", "SXSW-PARSE-BANDS-WITH-SECTION-DATES", 1, 0, false);
        declareFunction("sxsw_parse_bands_without_date_in_table", "SXSW-PARSE-BANDS-WITHOUT-DATE-IN-TABLE", 2, 0, false);
        declareFunction("sxsw_parse_bands_with_date_in_table", "SXSW-PARSE-BANDS-WITH-DATE-IN-TABLE", 1, 0, false);
        declareFunction("sxsw_extract_location_code_from_venue_url", "SXSW-EXTRACT-LOCATION-CODE-FROM-VENUE-URL", 1, 0, false);
        declareFunction("sxsw_extract_date_from_datesection_header", "SXSW-EXTRACT-DATE-FROM-DATESECTION-HEADER", 1, 0, false);
        declareFunction("sxsw_extract_date_from_datefield", "SXSW-EXTRACT-DATE-FROM-DATEFIELD", 1, 0, false);
        declareFunction("sxsw_extract_time_from_timefield", "SXSW-EXTRACT-TIME-FROM-TIMEFIELD", 1, 0, false);
        declareFunction("sxsw_convert_home_to_cityXregion", "SXSW-CONVERT-HOME-TO-CITY&REGION", 1, 0, false);
        declareFunction("sxsw_strip_greyspace", "SXSW-STRIP-GREYSPACE", 1, 0, false);
        declareFunction("advance_xml_tokens_past", "ADVANCE-XML-TOKENS-PAST", 2, 1, false);
        return NIL;
    }

    public static final SubLObject init_sxsw_widgets_file_alt() {
        deflexical("*SXSW-STATESMAN-REQUEST-PORT*", $int$80);
        deflexical("*SXSW-STATESMAN-REQUEST-METHOD*", $GET);
        deflexical("*SXSW-STATESMAN-REQUEST-MACHINE*", $str_alt2$cgi_statesman_com);
        deflexical("*SXSW-STATESMAN-URL-BASE*", $str_alt3$_sxsw_events__search_type_1__cata);
        deflexical("*SXSW-WIDE-NEWLINES?*", T);
        deflexical("*SXSW-TABLE-ROW-START-MARKER*", $str_alt14$_tr_);
        deflexical("*SXSW-TABLE-ROW-END-MARKER*", $str_alt15$__tr_);
        deflexical("*SXSW-TABLE-DATA-START-MARKER*", $str_alt16$_td_);
        deflexical("*SXSW-TABLE-NEW-DATE-MARKER*", $str_alt17$_h3_);
        deflexical("*SXSW-TABLE-NEW-NAME-MARKER*", $str_alt18$_b_);
        deflexical("*SXSW-TABLE-END-MARKER*", $str_alt19$__table_);
        deflexical("*SXSW-VENUE-URL-LOCATION-MARKER*", $str_alt23$Location_);
        return NIL;
    }

    public static SubLObject init_sxsw_widgets_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*SXSW-STATESMAN-REQUEST-PORT*", $int$80);
            deflexical("*SXSW-STATESMAN-REQUEST-METHOD*", $GET);
            deflexical("*SXSW-STATESMAN-REQUEST-MACHINE*", $str2$cgi_statesman_com);
            deflexical("*SXSW-STATESMAN-URL-BASE*", $str3$_sxsw_events__search_type_1__cata);
            deflexical("*SXSW-WIDE-NEWLINES?*", T);
            deflexical("*SXSW-TABLE-ROW-START-MARKER*", $str16$_tr_);
            deflexical("*SXSW-TABLE-ROW-END-MARKER*", $str17$__tr_);
            deflexical("*SXSW-TABLE-DATA-START-MARKER*", $str18$_td_);
            deflexical("*SXSW-TABLE-NEW-DATE-MARKER*", $str19$_h3_);
            deflexical("*SXSW-TABLE-NEW-NAME-MARKER*", $str20$_b_);
            deflexical("*SXSW-TABLE-END-MARKER*", $str21$__table_);
            deflexical("*SXSW-VENUE-URL-LOCATION-MARKER*", $str25$Location_);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SXSW-TABLE-ROW-START-MARKER*", $str_alt14$_tr_);
            deflexical("*SXSW-TABLE-ROW-END-MARKER*", $str_alt15$__tr_);
            deflexical("*SXSW-TABLE-DATA-START-MARKER*", $str_alt16$_td_);
            deflexical("*SXSW-TABLE-NEW-DATE-MARKER*", $str_alt17$_h3_);
            deflexical("*SXSW-TABLE-NEW-NAME-MARKER*", $str_alt18$_b_);
            deflexical("*SXSW-TABLE-END-MARKER*", $str_alt19$__table_);
            deflexical("*SXSW-VENUE-URL-LOCATION-MARKER*", $str_alt23$Location_);
        }
        return NIL;
    }

    public static SubLObject init_sxsw_widgets_file_Previous() {
        deflexical("*SXSW-STATESMAN-REQUEST-PORT*", $int$80);
        deflexical("*SXSW-STATESMAN-REQUEST-METHOD*", $GET);
        deflexical("*SXSW-STATESMAN-REQUEST-MACHINE*", $str2$cgi_statesman_com);
        deflexical("*SXSW-STATESMAN-URL-BASE*", $str3$_sxsw_events__search_type_1__cata);
        deflexical("*SXSW-WIDE-NEWLINES?*", T);
        deflexical("*SXSW-TABLE-ROW-START-MARKER*", $str16$_tr_);
        deflexical("*SXSW-TABLE-ROW-END-MARKER*", $str17$__tr_);
        deflexical("*SXSW-TABLE-DATA-START-MARKER*", $str18$_td_);
        deflexical("*SXSW-TABLE-NEW-DATE-MARKER*", $str19$_h3_);
        deflexical("*SXSW-TABLE-NEW-NAME-MARKER*", $str20$_b_);
        deflexical("*SXSW-TABLE-END-MARKER*", $str21$__table_);
        deflexical("*SXSW-VENUE-URL-LOCATION-MARKER*", $str25$Location_);
        return NIL;
    }

    public static SubLObject setup_sxsw_widgets_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sxsw_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_sxsw_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sxsw_widgets_file();
    }

    static private final SubLString $str_alt2$cgi_statesman_com = makeString("cgi.statesman.com");

    static {
    }

    static private final SubLString $str_alt3$_sxsw_events__search_type_1__cata = makeString("/sxsw/events?_search_type=1&_catagories=band&_event_type=MUSIC&_table_tag=470%2C1%2C3%2C1%2C%2Ctop&_table_color=%23efefef&_list_fields=band.name%2C+band.hometown%2C+band.genre&_table_header=20%25%2CBand%7C20%25%2CHometown%7C20%25%2CGenre&_bandname_keyword=&_venue_id=&_hometown_keyword=&_bandgenre_type=&_event_starttime=&_event_date=&submit=Find+Shows");

    static private final SubLString $str_alt14$_tr_ = makeString("<tr>");

    static private final SubLString $str_alt15$__tr_ = makeString("</tr>");

    static private final SubLString $str_alt16$_td_ = makeString("<td>");

    static private final SubLString $str_alt17$_h3_ = makeString("<h3>");

    static private final SubLString $str_alt18$_b_ = makeString("<b>");

    static private final SubLString $str_alt19$__table_ = makeString("</table>");

    static private final SubLString $str_alt23$Location_ = makeString("Location=");

    static private final SubLSymbol $sym24$CHAR_ = makeSymbol("CHAR=");

    static private final SubLString $str_alt30$_2__0d_A = makeString("~2,'0d~A");

    static private final SubLString $str_alt33$_ = makeString(" ");

    static private final SubLString $str_alt34$_nbsp_ = makeString("&nbsp;");
}

/**
 * Total time: 124 ms
 */
