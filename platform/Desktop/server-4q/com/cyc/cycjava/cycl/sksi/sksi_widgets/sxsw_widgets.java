package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.collection_defns;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sxsw_widgets extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets";
    public static final String myFingerPrint = "309b3fa0faf9095dbf37f97750ecfa9049feb1c1216d8fe2b4f654c077dbc84c";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 946L)
    private static SubLSymbol $sxsw_statesman_request_port$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 1002L)
    private static SubLSymbol $sxsw_statesman_request_method$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 1060L)
    private static SubLSymbol $sxsw_statesman_request_machine$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 1134L)
    private static SubLSymbol $sxsw_statesman_url_base$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 1543L)
    private static SubLSymbol $sxsw_wide_newlinesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2165L)
    private static SubLSymbol $sxsw_table_row_start_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2224L)
    private static SubLSymbol $sxsw_table_row_end_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2281L)
    private static SubLSymbol $sxsw_table_data_start_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2340L)
    private static SubLSymbol $sxsw_table_new_date_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2397L)
    private static SubLSymbol $sxsw_table_new_name_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2453L)
    private static SubLSymbol $sxsw_table_end_marker$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 8491L)
    private static SubLSymbol $sxsw_venue_url_location_marker$;
    private static final SubLInteger $int0$80;
    private static final SubLSymbol $kw1$GET;
    private static final SubLString $str2$cgi_statesman_com;
    private static final SubLString $str3$_sxsw_events__search_type_1__cata;
    private static final SubLSymbol $kw4$DEFAULT;
    private static final SubLSymbol $kw5$PRIVATE;
    private static final SubLSymbol $kw6$MACHINE;
    private static final SubLSymbol $kw7$PORT;
    private static final SubLSymbol $kw8$METHOD;
    private static final SubLSymbol $kw9$URL;
    private static final SubLSymbol $kw10$QUERY;
    private static final SubLSymbol $kw11$KEEP_ALIVE_;
    private static final SubLSymbol $kw12$WIDE_NEWLINES_;
    private static final SubLSymbol $kw13$ACCEPT_TYPES;
    private static final SubLSymbol $kw14$CONTENT_TYPE;
    private static final SubLSymbol $kw15$SOAP_ACTION_URI;
    private static final SubLString $str16$_tr_;
    private static final SubLString $str17$__tr_;
    private static final SubLString $str18$_td_;
    private static final SubLString $str19$_h3_;
    private static final SubLString $str20$_b_;
    private static final SubLString $str21$__table_;
    private static final SubLSymbol $sym22$STRING_EQUAL;
    private static final SubLSymbol $sym23$CCONCATENATE;
    private static final SubLString $str24$Band;
    private static final SubLString $str25$Location_;
    private static final SubLSymbol $sym26$CHAR_;
    private static final SubLString $str27$15;
    private static final SubLString $str28$200303;
    private static final SubLString $str29$20030313;
    private static final SubLString $str30$1200;
    private static final SubLSymbol $kw31$EOF;
    private static final SubLString $str32$_2__0d_A;
    private static final SubLSymbol $sym33$EMPTY_STRING_P;
    private static final SubLString $str34$unknown;
    private static final SubLString $str35$_;
    private static final SubLString $str36$_nbsp_;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 1671L)
    public static SubLObject sxsw_all_bands_request() {
        final SubLObject encoded_url = sxsw_widgets.$sxsw_statesman_url_base$.getGlobalValue();
        SubLObject v_answer = (SubLObject)sxsw_widgets.NIL;
        final SubLObject real_port = (SubLObject)(sxsw_widgets.$sxsw_statesman_request_port$.getGlobalValue().eql((SubLObject)sxsw_widgets.$kw4$DEFAULT) ? sxsw_widgets.$int0$80 : sxsw_widgets.$sxsw_statesman_request_port$.getGlobalValue());
        SubLObject in_stream = (SubLObject)sxsw_widgets.NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(sxsw_widgets.$sxsw_statesman_request_machine$.getGlobalValue(), real_port, (SubLObject)sxsw_widgets.NIL, (SubLObject)sxsw_widgets.$kw5$PRIVATE);
            if (sxsw_widgets.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, sxsw_widgets.$sxsw_statesman_request_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { sxsw_widgets.$kw6$MACHINE, sxsw_widgets.$sxsw_statesman_request_machine$.getGlobalValue(), sxsw_widgets.$kw7$PORT, sxsw_widgets.$sxsw_statesman_request_port$.getGlobalValue(), sxsw_widgets.$kw8$METHOD, sxsw_widgets.$sxsw_statesman_request_method$.getGlobalValue(), sxsw_widgets.$kw9$URL, encoded_url, sxsw_widgets.$kw10$QUERY, sxsw_widgets.NIL, sxsw_widgets.$kw11$KEEP_ALIVE_, sxsw_widgets.NIL, sxsw_widgets.$kw12$WIDE_NEWLINES_, sxsw_widgets.$sxsw_wide_newlinesP$.getGlobalValue(), sxsw_widgets.$kw13$ACCEPT_TYPES, sxsw_widgets.$kw4$DEFAULT, sxsw_widgets.$kw14$CONTENT_TYPE, sxsw_widgets.$kw4$DEFAULT, sxsw_widgets.$kw15$SOAP_ACTION_URI, sxsw_widgets.NIL }));
                v_answer = xml_parsing_utilities.xml_tokenize(in_stream, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sxsw_widgets.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (sxsw_widgets.NIL != in_stream) {
                    streams_high.close(in_stream, (SubLObject)sxsw_widgets.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2509L)
    public static SubLObject sxsw_parse_bands_by_date_request(final SubLObject tokens) {
        if (Sequences.position(sxsw_widgets.$sxsw_table_new_date_marker$.getGlobalValue(), tokens, Symbols.symbol_function((SubLObject)sxsw_widgets.$sym22$STRING_EQUAL), (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED).isFixnum()) {
            return sxsw_parse_bands_with_section_dates(tokens);
        }
        return sxsw_parse_bands_with_date_in_table(tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 2764L)
    public static SubLObject sxsw_parse_bands_with_section_dates(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject date_start = advance_xml_tokens_past(tokens, sxsw_widgets.$sxsw_table_new_date_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject doneP = Types.sublisp_null(date_start);
        SubLObject total_events = (SubLObject)sxsw_widgets.NIL;
        while (sxsw_widgets.NIL == doneP) {
            SubLObject date = (SubLObject)sxsw_widgets.NIL;
            date = sxsw_extract_date_from_datesection_header(date_start.first());
            thread.resetMultipleValues();
            final SubLObject events = sxsw_parse_bands_without_date_in_table(date_start, date);
            final SubLObject remainder = thread.secondMultipleValue();
            thread.resetMultipleValues();
            total_events = (SubLObject)ConsesLow.cons(events, total_events);
            date_start = advance_xml_tokens_past(remainder, sxsw_widgets.$sxsw_table_new_date_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
            doneP = Types.sublisp_null(date_start);
        }
        return Functions.apply(Symbols.symbol_function((SubLObject)sxsw_widgets.$sym23$CCONCATENATE), Sequences.nreverse(total_events));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 3450L)
    public static SubLObject sxsw_parse_bands_without_date_in_table(final SubLObject tokens, final SubLObject date) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_start = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)sxsw_widgets.$str24$Band, (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(table_start, sxsw_widgets.$sxsw_table_row_end_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject doneP = Types.sublisp_null(current);
        SubLObject events = (SubLObject)sxsw_widgets.NIL;
        while (sxsw_widgets.NIL == doneP) {
            SubLObject name = (SubLObject)sxsw_widgets.NIL;
            SubLObject home = (SubLObject)sxsw_widgets.NIL;
            SubLObject home_town = (SubLObject)sxsw_widgets.NIL;
            SubLObject home_region = (SubLObject)sxsw_widgets.NIL;
            SubLObject genre = (SubLObject)sxsw_widgets.NIL;
            SubLObject time = (SubLObject)sxsw_widgets.NIL;
            SubLObject venue_code = (SubLObject)sxsw_widgets.NIL;
            SubLObject venue_name = (SubLObject)sxsw_widgets.NIL;
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_new_name_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
            name = current.first();
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            home = sxsw_strip_greyspace(current.first());
            thread.resetMultipleValues();
            final SubLObject home_town_$1 = sxsw_convert_home_to_cityXregion(home);
            final SubLObject home_region_$2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            home_town = home_town_$1;
            home_region = home_region_$2;
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            genre = sxsw_strip_greyspace(current.first());
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            time = sxsw_extract_time_from_timefield(current.first());
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            venue_code = sxsw_extract_location_code_from_venue_url(current.first());
            venue_name = sxsw_strip_greyspace(conses_high.second(current));
            events = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(date, name, home_town, home_region, time, venue_name, genre), events);
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_row_end_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
            if (sxsw_widgets.NIL == current) {
                doneP = (SubLObject)sxsw_widgets.T;
            }
            else {
                while (sxsw_widgets.NIL == Characters.char_equal(Strings.sublisp_char(current.first(), (SubLObject)sxsw_widgets.ZERO_INTEGER), (SubLObject)Characters.CHAR_less)) {
                    current = current.rest();
                }
                if (sxsw_widgets.NIL != Strings.string_equal(current.first(), sxsw_widgets.$sxsw_table_end_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED)) {
                    return Values.values(Sequences.nreverse(events), current);
                }
                continue;
            }
        }
        return Values.values(Sequences.nreverse(events), (SubLObject)sxsw_widgets.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 5687L)
    public static SubLObject sxsw_parse_bands_with_date_in_table(final SubLObject tokens) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_start = xml_parsing_utilities.advance_xml_tokens_to(tokens, (SubLObject)sxsw_widgets.$str24$Band, (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(table_start, sxsw_widgets.$sxsw_table_row_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject doneP = Types.sublisp_null(current);
        SubLObject events = (SubLObject)sxsw_widgets.NIL;
        while (sxsw_widgets.NIL == doneP) {
            SubLObject name = (SubLObject)sxsw_widgets.NIL;
            SubLObject home = (SubLObject)sxsw_widgets.NIL;
            SubLObject home_town = (SubLObject)sxsw_widgets.NIL;
            SubLObject home_region = (SubLObject)sxsw_widgets.NIL;
            SubLObject genre = (SubLObject)sxsw_widgets.NIL;
            SubLObject time = (SubLObject)sxsw_widgets.NIL;
            SubLObject date = (SubLObject)sxsw_widgets.NIL;
            SubLObject venue_code = (SubLObject)sxsw_widgets.NIL;
            SubLObject venue_name = (SubLObject)sxsw_widgets.NIL;
            current = advance_xml_tokens_past(current, (SubLObject)sxsw_widgets.$str20$_b_, (SubLObject)sxsw_widgets.UNPROVIDED);
            name = current.first();
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            home = sxsw_strip_greyspace(current.first());
            thread.resetMultipleValues();
            final SubLObject home_town_$3 = sxsw_convert_home_to_cityXregion(home);
            final SubLObject home_region_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            home_town = home_town_$3;
            home_region = home_region_$4;
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            genre = sxsw_strip_greyspace(current.first());
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            time = sxsw_extract_time_from_timefield(current.first());
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            date = sxsw_strip_greyspace(current.first());
            date = sxsw_extract_date_from_datefield(date);
            current = advance_xml_tokens_past(current, sxsw_widgets.$sxsw_table_data_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.TWO_INTEGER);
            venue_code = sxsw_extract_location_code_from_venue_url(current.first());
            venue_name = sxsw_strip_greyspace(conses_high.second(current));
            events = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(date, name, home_town, home_region, time, venue_name, genre), events);
            current = xml_parsing_utilities.advance_xml_tokens_to(current, sxsw_widgets.$sxsw_table_row_start_marker$.getGlobalValue(), (SubLObject)sxsw_widgets.UNPROVIDED);
            doneP = Types.sublisp_null(current);
        }
        return Sequences.nreverse(events);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 8637L)
    public static SubLObject sxsw_extract_location_code_from_venue_url(final SubLObject url) {
        SubLObject start_pos = Sequences.search(sxsw_widgets.$sxsw_venue_url_location_marker$.getGlobalValue(), url, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED);
        if (start_pos.isFixnum()) {
            final SubLObject end_pos = Sequences.position((SubLObject)Characters.CHAR_quotation, url, Symbols.symbol_function((SubLObject)sxsw_widgets.$sym26$CHAR_), Symbols.symbol_function((SubLObject)sxsw_widgets.IDENTITY), start_pos, (SubLObject)sxsw_widgets.UNPROVIDED);
            start_pos = Numbers.add(start_pos, Sequences.length(sxsw_widgets.$sxsw_venue_url_location_marker$.getGlobalValue()));
            return Sequences.subseq(url, start_pos, end_pos);
        }
        return url;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 9001L)
    public static SubLObject sxsw_extract_date_from_datesection_header(final SubLObject string) {
        final SubLObject date_pieces = string_utilities.split_string(string, (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject day = (SubLObject)sxsw_widgets.NIL;
        if (sxsw_widgets.NIL == day) {
            SubLObject csome_list_var = Sequences.nreverse(date_pieces);
            SubLObject piece = (SubLObject)sxsw_widgets.NIL;
            piece = csome_list_var.first();
            while (sxsw_widgets.NIL == day && sxsw_widgets.NIL != csome_list_var) {
                if (sxsw_widgets.NIL != collection_defns.cyc_numeric_string(piece)) {
                    day = piece;
                }
                csome_list_var = csome_list_var.rest();
                piece = csome_list_var.first();
            }
        }
        if (sxsw_widgets.NIL == day) {
            day = (SubLObject)sxsw_widgets.$str27$15;
        }
        return Sequences.cconcatenate((SubLObject)sxsw_widgets.$str28$200303, day);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 9329L)
    public static SubLObject sxsw_extract_date_from_datefield(final SubLObject string) {
        final SubLObject date_pieces = string_utilities.split_string(string, (SubLObject)sxsw_widgets.UNPROVIDED);
        final SubLObject day = conses_high.second(date_pieces);
        if (sxsw_widgets.NIL == day) {
            return (SubLObject)sxsw_widgets.$str29$20030313;
        }
        return Sequences.cconcatenate((SubLObject)sxsw_widgets.$str28$200303, day);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 9563L)
    public static SubLObject sxsw_extract_time_from_timefield(final SubLObject string) {
        final SubLObject time_pieces = string_utilities.split_string(string, (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_colon, (SubLObject)Characters.CHAR_space));
        final SubLObject hour_string = time_pieces.first();
        final SubLObject minute_string = conses_high.second(time_pieces);
        final SubLObject am_pm_string = conses_high.third(time_pieces);
        if (sxsw_widgets.NIL == am_pm_string) {
            return (SubLObject)sxsw_widgets.$str30$1200;
        }
        final SubLObject post_meridianP = Characters.char_equal(Strings.sublisp_char(am_pm_string, (SubLObject)sxsw_widgets.ZERO_INTEGER), (SubLObject)Characters.CHAR_p);
        SubLObject hours = reader.read_from_string_ignoring_errors(hour_string, (SubLObject)sxsw_widgets.NIL, (SubLObject)sxsw_widgets.$kw31$EOF, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED);
        if (!hours.isFixnum()) {
            hours = (SubLObject)sxsw_widgets.ZERO_INTEGER;
        }
        if (sxsw_widgets.NIL != post_meridianP) {
            hours = Numbers.add(hours, (SubLObject)sxsw_widgets.TWELVE_INTEGER);
        }
        else if (hours.numE((SubLObject)sxsw_widgets.TWELVE_INTEGER)) {
            hours = (SubLObject)sxsw_widgets.ZERO_INTEGER;
        }
        return PrintLow.format((SubLObject)sxsw_widgets.NIL, (SubLObject)sxsw_widgets.$str32$_2__0d_A, hours, minute_string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 10237L)
    public static SubLObject sxsw_convert_home_to_cityXregion(final SubLObject home) {
        SubLObject pieces = Sequences.nreverse(Sequences.remove_if((SubLObject)sxsw_widgets.$sym33$EMPTY_STRING_P, string_utilities.split_string(home, (SubLObject)sxsw_widgets.UNPROVIDED), (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED));
        SubLObject city_pieces = (SubLObject)sxsw_widgets.NIL;
        SubLObject city = (SubLObject)sxsw_widgets.NIL;
        SubLObject region = (SubLObject)sxsw_widgets.NIL;
        if (sxsw_widgets.NIL == pieces) {
            return Values.values((SubLObject)sxsw_widgets.$str34$unknown, (SubLObject)sxsw_widgets.$str34$unknown);
        }
        region = pieces.first();
        pieces = pieces.rest();
        if (sxsw_widgets.NIL == pieces) {
            return Values.values((SubLObject)sxsw_widgets.$str34$unknown, region);
        }
        while (sxsw_widgets.NIL != string_utilities.upper_case_string_p(pieces.first())) {
            region = Sequences.cconcatenate(pieces.first(), new SubLObject[] { sxsw_widgets.$str35$_, region });
            pieces = pieces.rest();
        }
        SubLObject list_var = (SubLObject)sxsw_widgets.NIL;
        SubLObject piece = (SubLObject)sxsw_widgets.NIL;
        SubLObject counter = (SubLObject)sxsw_widgets.NIL;
        list_var = pieces;
        piece = list_var.first();
        for (counter = (SubLObject)sxsw_widgets.ZERO_INTEGER; sxsw_widgets.NIL != list_var; list_var = list_var.rest(), piece = list_var.first(), counter = Numbers.add((SubLObject)sxsw_widgets.ONE_INTEGER, counter)) {
            if (!counter.isZero()) {
                city_pieces = (SubLObject)ConsesLow.cons((SubLObject)sxsw_widgets.$str35$_, city_pieces);
            }
            city_pieces = (SubLObject)ConsesLow.cons(piece, city_pieces);
        }
        city = Functions.apply(Symbols.symbol_function((SubLObject)sxsw_widgets.$sym23$CCONCATENATE), city_pieces);
        return Values.values(city, region);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 11021L)
    public static SubLObject sxsw_strip_greyspace(final SubLObject string) {
        final SubLObject spot = Sequences.search((SubLObject)sxsw_widgets.$str36$_nbsp_, string, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED, (SubLObject)sxsw_widgets.UNPROVIDED);
        if (spot.isFixnum()) {
            return string_utilities.substring(string, (SubLObject)sxsw_widgets.ZERO_INTEGER, spot);
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/sxsw-widgets.lisp", position = 11203L)
    public static SubLObject advance_xml_tokens_past(final SubLObject tokens, final SubLObject marker, SubLObject count) {
        if (count == sxsw_widgets.UNPROVIDED) {
            count = (SubLObject)sxsw_widgets.ONE_INTEGER;
        }
        SubLObject current = xml_parsing_utilities.advance_xml_tokens_to(tokens, marker, (SubLObject)sxsw_widgets.UNPROVIDED);
        SubLObject i;
        for (i = (SubLObject)sxsw_widgets.NIL, i = (SubLObject)sxsw_widgets.ZERO_INTEGER; i.numL(count); i = Numbers.add(i, (SubLObject)sxsw_widgets.ONE_INTEGER)) {
            current = xml_parsing_utilities.advance_xml_tokens(current, (SubLObject)sxsw_widgets.UNPROVIDED);
        }
        return current;
    }
    
    public static SubLObject declare_sxsw_widgets_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_all_bands_request", "SXSW-ALL-BANDS-REQUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_parse_bands_by_date_request", "SXSW-PARSE-BANDS-BY-DATE-REQUEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_parse_bands_with_section_dates", "SXSW-PARSE-BANDS-WITH-SECTION-DATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_parse_bands_without_date_in_table", "SXSW-PARSE-BANDS-WITHOUT-DATE-IN-TABLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_parse_bands_with_date_in_table", "SXSW-PARSE-BANDS-WITH-DATE-IN-TABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_extract_location_code_from_venue_url", "SXSW-EXTRACT-LOCATION-CODE-FROM-VENUE-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_extract_date_from_datesection_header", "SXSW-EXTRACT-DATE-FROM-DATESECTION-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_extract_date_from_datefield", "SXSW-EXTRACT-DATE-FROM-DATEFIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_extract_time_from_timefield", "SXSW-EXTRACT-TIME-FROM-TIMEFIELD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_convert_home_to_cityXregion", "SXSW-CONVERT-HOME-TO-CITY&REGION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "sxsw_strip_greyspace", "SXSW-STRIP-GREYSPACE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.sksi_widgets.sxsw_widgets", "advance_xml_tokens_past", "ADVANCE-XML-TOKENS-PAST", 2, 1, false);
        return (SubLObject)sxsw_widgets.NIL;
    }
    
    public static SubLObject init_sxsw_widgets_file() {
        sxsw_widgets.$sxsw_statesman_request_port$ = SubLFiles.deflexical("*SXSW-STATESMAN-REQUEST-PORT*", (SubLObject)sxsw_widgets.$int0$80);
        sxsw_widgets.$sxsw_statesman_request_method$ = SubLFiles.deflexical("*SXSW-STATESMAN-REQUEST-METHOD*", (SubLObject)sxsw_widgets.$kw1$GET);
        sxsw_widgets.$sxsw_statesman_request_machine$ = SubLFiles.deflexical("*SXSW-STATESMAN-REQUEST-MACHINE*", (SubLObject)sxsw_widgets.$str2$cgi_statesman_com);
        sxsw_widgets.$sxsw_statesman_url_base$ = SubLFiles.deflexical("*SXSW-STATESMAN-URL-BASE*", (SubLObject)sxsw_widgets.$str3$_sxsw_events__search_type_1__cata);
        sxsw_widgets.$sxsw_wide_newlinesP$ = SubLFiles.deflexical("*SXSW-WIDE-NEWLINES?*", (SubLObject)sxsw_widgets.T);
        sxsw_widgets.$sxsw_table_row_start_marker$ = SubLFiles.deflexical("*SXSW-TABLE-ROW-START-MARKER*", (SubLObject)sxsw_widgets.$str16$_tr_);
        sxsw_widgets.$sxsw_table_row_end_marker$ = SubLFiles.deflexical("*SXSW-TABLE-ROW-END-MARKER*", (SubLObject)sxsw_widgets.$str17$__tr_);
        sxsw_widgets.$sxsw_table_data_start_marker$ = SubLFiles.deflexical("*SXSW-TABLE-DATA-START-MARKER*", (SubLObject)sxsw_widgets.$str18$_td_);
        sxsw_widgets.$sxsw_table_new_date_marker$ = SubLFiles.deflexical("*SXSW-TABLE-NEW-DATE-MARKER*", (SubLObject)sxsw_widgets.$str19$_h3_);
        sxsw_widgets.$sxsw_table_new_name_marker$ = SubLFiles.deflexical("*SXSW-TABLE-NEW-NAME-MARKER*", (SubLObject)sxsw_widgets.$str20$_b_);
        sxsw_widgets.$sxsw_table_end_marker$ = SubLFiles.deflexical("*SXSW-TABLE-END-MARKER*", (SubLObject)sxsw_widgets.$str21$__table_);
        sxsw_widgets.$sxsw_venue_url_location_marker$ = SubLFiles.deflexical("*SXSW-VENUE-URL-LOCATION-MARKER*", (SubLObject)sxsw_widgets.$str25$Location_);
        return (SubLObject)sxsw_widgets.NIL;
    }
    
    public static SubLObject setup_sxsw_widgets_file() {
        return (SubLObject)sxsw_widgets.NIL;
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
    
    static {
        me = (SubLFile)new sxsw_widgets();
        sxsw_widgets.$sxsw_statesman_request_port$ = null;
        sxsw_widgets.$sxsw_statesman_request_method$ = null;
        sxsw_widgets.$sxsw_statesman_request_machine$ = null;
        sxsw_widgets.$sxsw_statesman_url_base$ = null;
        sxsw_widgets.$sxsw_wide_newlinesP$ = null;
        sxsw_widgets.$sxsw_table_row_start_marker$ = null;
        sxsw_widgets.$sxsw_table_row_end_marker$ = null;
        sxsw_widgets.$sxsw_table_data_start_marker$ = null;
        sxsw_widgets.$sxsw_table_new_date_marker$ = null;
        sxsw_widgets.$sxsw_table_new_name_marker$ = null;
        sxsw_widgets.$sxsw_table_end_marker$ = null;
        sxsw_widgets.$sxsw_venue_url_location_marker$ = null;
        $int0$80 = SubLObjectFactory.makeInteger(80);
        $kw1$GET = SubLObjectFactory.makeKeyword("GET");
        $str2$cgi_statesman_com = SubLObjectFactory.makeString("cgi.statesman.com");
        $str3$_sxsw_events__search_type_1__cata = SubLObjectFactory.makeString("/sxsw/events?_search_type=1&_catagories=band&_event_type=MUSIC&_table_tag=470%2C1%2C3%2C1%2C%2Ctop&_table_color=%23efefef&_list_fields=band.name%2C+band.hometown%2C+band.genre&_table_header=20%25%2CBand%7C20%25%2CHometown%7C20%25%2CGenre&_bandname_keyword=&_venue_id=&_hometown_keyword=&_bandgenre_type=&_event_starttime=&_event_date=&submit=Find+Shows");
        $kw4$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw5$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw6$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw7$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw8$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw9$URL = SubLObjectFactory.makeKeyword("URL");
        $kw10$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw11$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw12$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw13$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw14$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw15$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $str16$_tr_ = SubLObjectFactory.makeString("<tr>");
        $str17$__tr_ = SubLObjectFactory.makeString("</tr>");
        $str18$_td_ = SubLObjectFactory.makeString("<td>");
        $str19$_h3_ = SubLObjectFactory.makeString("<h3>");
        $str20$_b_ = SubLObjectFactory.makeString("<b>");
        $str21$__table_ = SubLObjectFactory.makeString("</table>");
        $sym22$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $sym23$CCONCATENATE = SubLObjectFactory.makeSymbol("CCONCATENATE");
        $str24$Band = SubLObjectFactory.makeString("Band");
        $str25$Location_ = SubLObjectFactory.makeString("Location=");
        $sym26$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $str27$15 = SubLObjectFactory.makeString("15");
        $str28$200303 = SubLObjectFactory.makeString("200303");
        $str29$20030313 = SubLObjectFactory.makeString("20030313");
        $str30$1200 = SubLObjectFactory.makeString("1200");
        $kw31$EOF = SubLObjectFactory.makeKeyword("EOF");
        $str32$_2__0d_A = SubLObjectFactory.makeString("~2,'0d~A");
        $sym33$EMPTY_STRING_P = SubLObjectFactory.makeSymbol("EMPTY-STRING-P");
        $str34$unknown = SubLObjectFactory.makeString("unknown");
        $str35$_ = SubLObjectFactory.makeString(" ");
        $str36$_nbsp_ = SubLObjectFactory.makeString("&nbsp;");
    }
}

/*

	Total time: 124 ms
	
*/