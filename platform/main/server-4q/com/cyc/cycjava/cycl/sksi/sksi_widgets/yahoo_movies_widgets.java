package com.cyc.cycjava.cycl.sksi.sksi_widgets;


import static com.cyc.cycjava.cycl.subl_macro_promotions.validate_tcp_connection;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class yahoo_movies_widgets extends SubLTranslatedFile {
    public static final SubLFile me = new yahoo_movies_widgets();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.yahoo_movies_widgets";

    public static final String myFingerPrint = "6dcbb34e7f8a960514ca0b7772bc5864066f701749735a83d35fb4f66d967564";

    // deflexical
    private static final SubLSymbol $yahoo_movies_request_port$ = makeSymbol("*YAHOO-MOVIES-REQUEST-PORT*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_request_method$ = makeSymbol("*YAHOO-MOVIES-REQUEST-METHOD*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_request_machine$ = makeSymbol("*YAHOO-MOVIES-REQUEST-MACHINE*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_url_base$ = makeSymbol("*YAHOO-MOVIES-URL-BASE*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_url_query_portion$ = makeSymbol("*YAHOO-MOVIES-URL-QUERY-PORTION*");

    // deflexical
    // T iff the Yahoo! web server require 'wide newlines'?. control variable.
    private static final SubLSymbol $yahoo_movieswide_newlinesP$ = makeSymbol("*YAHOO-MOVIESWIDE-NEWLINES?*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listing_start_marker$ = makeSymbol("*YAHOO-MOVIES-LISTING-START-MARKER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listing_table_start_marker$ = makeSymbol("*YAHOO-MOVIES-LISTING-TABLE-START-MARKER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listing_name_starter$ = makeSymbol("*YAHOO-MOVIES-LISTING-NAME-STARTER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listing_phone_number$ = makeSymbol("*YAHOO-MOVIES-LISTING-PHONE-NUMBER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listing_address$ = makeSymbol("*YAHOO-MOVIES-LISTING-ADDRESS*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_start_of_film_listings$ = makeSymbol("*YAHOO-MOVIES-START-OF-FILM-LISTINGS*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_left_column_indicator$ = makeSymbol("*YAHOO-MOVIES-LEFT-COLUMN-INDICATOR*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_right_column_indicator$ = makeSymbol("*YAHOO-MOVIES-RIGHT-COLUMN-INDICATOR*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_film_information_marker$ = makeSymbol("*YAHOO-MOVIES-FILM-INFORMATION-MARKER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_film_information_url$ = makeSymbol("*YAHOO-MOVIES-FILM-INFORMATION-URL*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listings_ratings_marker$ = makeSymbol("*YAHOO-MOVIES-LISTINGS-RATINGS-MARKER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_listings_playtime_marker$ = makeSymbol("*YAHOO-MOVIES-LISTINGS-PLAYTIME-MARKER*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_rating_split_set$ = makeSymbol("*YAHOO-MOVIES-RATING-SPLIT-SET*");

    // deflexical
    private static final SubLSymbol $yahoo_movies_playtime_split_set$ = makeSymbol("*YAHOO-MOVIES-PLAYTIME-SPLIT-SET*");

    private static final SubLInteger $int$80 = makeInteger(80);



    public static final SubLString $str2$movies_yahoo_com = makeString("movies.yahoo.com");

    public static final SubLString $str3$_showtimes_showtimes_html = makeString("/showtimes/showtimes.html");

    public static final SubLString $str4$z_ = makeString("z=");

















    private static final SubLSymbol $kw13$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw14$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");





    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLString $$$Buy_Tickets = makeString("Buy Tickets");

    private static final SubLString $str19$_table_ = makeString("<table>");

    private static final SubLString $str20$_a_href___showtimes = makeString("<a href=\"/showtimes");

    private static final SubLString $str21$Phone_ = makeString("Phone:");

    private static final SubLString $str22$_font = makeString("<font");

    private static final SubLString $str23$_table = makeString("<table");

    private static final SubLString $str24$_____lhs = makeString("<!-- lhs");

    private static final SubLString $str25$_____rhs = makeString("<!-- rhs");

    private static final SubLString $str26$_b_ = makeString("<b>");

    private static final SubLString $str27$_a_href___shop = makeString("<a href=\"/shop");

    private static final SubLString $str28$_small_ = makeString("<small>");



    private static final SubLSymbol XML_TOKEN_STARTS_WITH = makeSymbol("XML-TOKEN-STARTS-WITH");

    public static final SubLList $list31 = list(makeSymbol("NAME"), makeSymbol("PHONE-NUMBER"), makeSymbol("ADDRESS"), makeSymbol("MAP-URL"), makeSymbol("FILMS"));

    private static final SubLString $str32$At__A__Phone__A__Address__A__loca = makeString("At ~A (Phone ~A, Address ~A) locatable via link ~A, they are playing:~%");

    private static final SubLList $list33 = list(makeSymbol("FILM-DESCRIPTION-URL"), makeSymbol("FILM-NAME"), makeSymbol("FILM-RATING"), makeSymbol("FILM-DURATION"), makeSymbol("PLAYING-TIMES"));

    private static final SubLString $str34$Name___A__see__A__rated__A_lastin = makeString("Name: ~A (see ~A) rated ~A lasting ~A playing ~A~%");

    public static SubLObject yahoo_movies_get_all_theatres_for_zipcode(final SubLObject zipcode) {
        assert NIL != fixnump(zipcode) : "Types.fixnump(zipcode) " + "CommonSymbols.NIL != Types.fixnump(zipcode) " + zipcode;
        final SubLObject encoded_query = yahoo_movies_add_zipcode_to_query(zipcode);
        SubLObject v_answer = NIL;
        final SubLObject real_port = ($yahoo_movies_request_port$.getGlobalValue().eql($DEFAULT)) ? $int$80 : $yahoo_movies_request_port$.getGlobalValue();
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout($yahoo_movies_request_machine$.getGlobalValue(), real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, $yahoo_movies_request_machine$.getGlobalValue(), real_port)) {
                web_utilities.send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, $yahoo_movies_request_machine$.getGlobalValue(), $PORT, $yahoo_movies_request_port$.getGlobalValue(), $METHOD, $yahoo_movies_request_method$.getGlobalValue(), $URL, $yahoo_movies_url_base$.getGlobalValue(), $QUERY, encoded_query, $kw13$KEEP_ALIVE_, NIL, $kw14$WIDE_NEWLINES_, $yahoo_movieswide_newlinesP$.getGlobalValue(), $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
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

    public static SubLObject yahoo_movies_add_zipcode_to_query(final SubLObject zipcode) {
        return cconcatenate($yahoo_movies_url_query_portion$.getGlobalValue(), string_utilities.to_string(zipcode));
    }

    public static SubLObject yahoo_movies_parse_theatres_by_zipcode_request(final SubLObject tokens) {
        return yahoo_movies_gather_all_theatres(tokens);
    }

    public static SubLObject yahoo_movies_move_past_header(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listing_start_marker$.getGlobalValue(), STRING_EQUAL).rest();
    }

    public static SubLObject yahoo_movies_film_listing_locate_next(final SubLObject tokens, final SubLObject column_alternator) {
        if (NIL == tokens) {
            return NIL;
        }
        final SubLObject indicator = (column_alternator.isPositive()) ? $yahoo_movies_right_column_indicator$.getGlobalValue() : $yahoo_movies_left_column_indicator$.getGlobalValue();
        final SubLObject column_start = xml_parsing_utilities.advance_xml_tokens_without_crossing(tokens, indicator, $yahoo_movies_listing_name_starter$.getGlobalValue(), XML_TOKEN_STARTS_WITH);
        SubLObject info_start = NIL;
        if (NIL == xml_parsing_utilities.xml_token_starts_with(column_start.first(), indicator)) {
            return NIL;
        }
        info_start = xml_parsing_utilities.advance_xml_tokens_to(column_start, $yahoo_movies_film_information_marker$.getGlobalValue(), UNPROVIDED).rest();
        if (NIL == xml_parsing_utilities.xml_token_starts_with(info_start.first(), $yahoo_movies_film_information_url$.getGlobalValue())) {
            return NIL;
        }
        return info_start;
    }

    public static SubLObject yahoo_movies_advance_within_listing_to_playtimes(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listings_playtime_marker$.getGlobalValue(), XML_TOKEN_STARTS_WITH).rest();
    }

    public static SubLObject yahoo_movies_advance_within_listing_to_ratings(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listings_ratings_marker$.getGlobalValue(), XML_TOKEN_STARTS_WITH).rest();
    }

    public static SubLObject yahoo_movies_advance_to_link_for_name(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listing_name_starter$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject yahoo_movies_move_to_name(final SubLObject tokens) {
        return yahoo_movies_advance_to_link_for_name(tokens).rest();
    }

    public static SubLObject yahoo_movies_locate_theatre_phone_number(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listing_phone_number$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject yahoo_movies_locate_theatre_address(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_listing_address$.getGlobalValue(), UNPROVIDED).rest();
    }

    public static SubLObject yahoo_movies_locate_theatre_maplink(final SubLObject tokens) {
        return yahoo_movies_advance_to_link_for_name(tokens);
    }

    public static SubLObject yahoo_movies_locate_theatre_listings(final SubLObject tokens) {
        return xml_parsing_utilities.advance_xml_tokens_to(tokens, $yahoo_movies_start_of_film_listings$.getGlobalValue(), UNPROVIDED);
    }

    public static SubLObject yahoo_movies_gather_all_theatres(final SubLObject tokens) {
        final SubLObject theatre_start = yahoo_movies_move_past_header(tokens);
        SubLObject curr_theatre = yahoo_movies_move_to_name(theatre_start);
        SubLObject all_theatres = NIL;
        while (NIL != curr_theatre) {
            SubLObject name = NIL;
            SubLObject phone_number = NIL;
            SubLObject address = NIL;
            SubLObject map_url = NIL;
            SubLObject films = NIL;
            name = curr_theatre.first();
            curr_theatre = yahoo_movies_locate_theatre_phone_number(curr_theatre);
            phone_number = curr_theatre.first();
            curr_theatre = yahoo_movies_locate_theatre_address(curr_theatre);
            address = curr_theatre.first();
            curr_theatre = yahoo_movies_locate_theatre_maplink(curr_theatre);
            map_url = curr_theatre.first();
            final SubLObject listings;
            curr_theatre = listings = yahoo_movies_locate_theatre_listings(curr_theatre);
            for (SubLObject column_alternator = ZERO_INTEGER, curr_listing = yahoo_movies_film_listing_locate_next(listings, column_alternator); NIL != curr_listing; curr_listing = yahoo_movies_film_listing_locate_next(curr_listing, column_alternator)) {
                final SubLObject film_info = yahoo_movies_extract_movie_information(curr_listing);
                films = cons(film_info, films);
                column_alternator = add(column_alternator, ONE_INTEGER);
            }
            if (NIL != films) {
                films = nreverse(films);
                all_theatres = cons(list(name, phone_number, address, map_url, films), all_theatres);
            }
            curr_theatre = yahoo_movies_move_to_name(curr_theatre);
        } 
        return nreverse(all_theatres);
    }

    public static SubLObject print_yahoo_movies_theatre_information(final SubLObject result, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject name = NIL;
        SubLObject phone_number = NIL;
        SubLObject address = NIL;
        SubLObject map_url = NIL;
        SubLObject films = NIL;
        destructuring_bind_must_consp(result, result, $list31);
        name = result.first();
        SubLObject current = result.rest();
        destructuring_bind_must_consp(current, result, $list31);
        phone_number = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list31);
        address = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list31);
        map_url = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list31);
        films = current.first();
        current = current.rest();
        if (NIL == current) {
            format(stream, $str32$At__A__Phone__A__Address__A__loca, new SubLObject[]{ name, phone_number, address, map_url });
            SubLObject cdolist_list_var = films;
            SubLObject film = NIL;
            film = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                string_utilities.indent(stream, TWO_INTEGER);
                print_yahoo_movies_movie_information(film, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                film = cdolist_list_var.first();
            } 
        } else {
            cdestructuring_bind_error(result, $list31);
        }
        return result;
    }

    public static SubLObject yahoo_movies_extract_movie_information(SubLObject listing) {
        final SubLObject film_description_url = listing.first();
        final SubLObject film_name = second(listing);
        SubLObject film_rating = NIL;
        SubLObject film_duration = NIL;
        SubLObject playing_times = NIL;
        listing = yahoo_movies_advance_within_listing_to_ratings(listing);
        final SubLObject rating_and_time = listing.first();
        film_rating = string_utilities.substring(rating_and_time, ZERO_INTEGER, ONE_INTEGER);
        film_duration = last(string_utilities.split_string(rating_and_time, $yahoo_movies_rating_split_set$.getGlobalValue()), UNPROVIDED).first();
        listing = yahoo_movies_advance_within_listing_to_playtimes(listing);
        final SubLObject playtime = listing.first();
        playing_times = string_utilities.split_string(playtime, $yahoo_movies_playtime_split_set$.getGlobalValue()).first();
        return list(film_description_url, film_name, film_rating, film_duration, playing_times);
    }

    public static SubLObject print_yahoo_movies_movie_information(final SubLObject result, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        SubLObject film_description_url = NIL;
        SubLObject film_name = NIL;
        SubLObject film_rating = NIL;
        SubLObject film_duration = NIL;
        SubLObject playing_times = NIL;
        destructuring_bind_must_consp(result, result, $list33);
        film_description_url = result.first();
        SubLObject current = result.rest();
        destructuring_bind_must_consp(current, result, $list33);
        film_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list33);
        film_rating = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list33);
        film_duration = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, result, $list33);
        playing_times = current.first();
        current = current.rest();
        if (NIL == current) {
            format(stream, $str34$Name___A__see__A__rated__A_lastin, new SubLObject[]{ film_name, film_description_url, film_rating, film_duration, playing_times });
        } else {
            cdestructuring_bind_error(result, $list33);
        }
        return result;
    }

    public static SubLObject declare_yahoo_movies_widgets_file() {
        declareFunction(me, "yahoo_movies_get_all_theatres_for_zipcode", "YAHOO-MOVIES-GET-ALL-THEATRES-FOR-ZIPCODE", 1, 0, false);
        declareFunction(me, "yahoo_movies_add_zipcode_to_query", "YAHOO-MOVIES-ADD-ZIPCODE-TO-QUERY", 1, 0, false);
        declareFunction(me, "yahoo_movies_parse_theatres_by_zipcode_request", "YAHOO-MOVIES-PARSE-THEATRES-BY-ZIPCODE-REQUEST", 1, 0, false);
        declareFunction(me, "yahoo_movies_move_past_header", "YAHOO-MOVIES-MOVE-PAST-HEADER", 1, 0, false);
        declareFunction(me, "yahoo_movies_film_listing_locate_next", "YAHOO-MOVIES-FILM-LISTING-LOCATE-NEXT", 2, 0, false);
        declareFunction(me, "yahoo_movies_advance_within_listing_to_playtimes", "YAHOO-MOVIES-ADVANCE-WITHIN-LISTING-TO-PLAYTIMES", 1, 0, false);
        declareFunction(me, "yahoo_movies_advance_within_listing_to_ratings", "YAHOO-MOVIES-ADVANCE-WITHIN-LISTING-TO-RATINGS", 1, 0, false);
        declareFunction(me, "yahoo_movies_advance_to_link_for_name", "YAHOO-MOVIES-ADVANCE-TO-LINK-FOR-NAME", 1, 0, false);
        declareFunction(me, "yahoo_movies_move_to_name", "YAHOO-MOVIES-MOVE-TO-NAME", 1, 0, false);
        declareFunction(me, "yahoo_movies_locate_theatre_phone_number", "YAHOO-MOVIES-LOCATE-THEATRE-PHONE-NUMBER", 1, 0, false);
        declareFunction(me, "yahoo_movies_locate_theatre_address", "YAHOO-MOVIES-LOCATE-THEATRE-ADDRESS", 1, 0, false);
        declareFunction(me, "yahoo_movies_locate_theatre_maplink", "YAHOO-MOVIES-LOCATE-THEATRE-MAPLINK", 1, 0, false);
        declareFunction(me, "yahoo_movies_locate_theatre_listings", "YAHOO-MOVIES-LOCATE-THEATRE-LISTINGS", 1, 0, false);
        declareFunction(me, "yahoo_movies_gather_all_theatres", "YAHOO-MOVIES-GATHER-ALL-THEATRES", 1, 0, false);
        declareFunction(me, "print_yahoo_movies_theatre_information", "PRINT-YAHOO-MOVIES-THEATRE-INFORMATION", 1, 1, false);
        declareFunction(me, "yahoo_movies_extract_movie_information", "YAHOO-MOVIES-EXTRACT-MOVIE-INFORMATION", 1, 0, false);
        declareFunction(me, "print_yahoo_movies_movie_information", "PRINT-YAHOO-MOVIES-MOVIE-INFORMATION", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_yahoo_movies_widgets_file() {
        deflexical("*YAHOO-MOVIES-REQUEST-PORT*", $int$80);
        deflexical("*YAHOO-MOVIES-REQUEST-METHOD*", $GET);
        deflexical("*YAHOO-MOVIES-REQUEST-MACHINE*", $str2$movies_yahoo_com);
        deflexical("*YAHOO-MOVIES-URL-BASE*", $str3$_showtimes_showtimes_html);
        deflexical("*YAHOO-MOVIES-URL-QUERY-PORTION*", $str4$z_);
        deflexical("*YAHOO-MOVIESWIDE-NEWLINES?*", T);
        deflexical("*YAHOO-MOVIES-LISTING-START-MARKER*", $$$Buy_Tickets);
        deflexical("*YAHOO-MOVIES-LISTING-TABLE-START-MARKER*", $str19$_table_);
        deflexical("*YAHOO-MOVIES-LISTING-NAME-STARTER*", $str20$_a_href___showtimes);
        deflexical("*YAHOO-MOVIES-LISTING-PHONE-NUMBER*", $str21$Phone_);
        deflexical("*YAHOO-MOVIES-LISTING-ADDRESS*", $str22$_font);
        deflexical("*YAHOO-MOVIES-START-OF-FILM-LISTINGS*", $str23$_table);
        deflexical("*YAHOO-MOVIES-LEFT-COLUMN-INDICATOR*", $str24$_____lhs);
        deflexical("*YAHOO-MOVIES-RIGHT-COLUMN-INDICATOR*", $str25$_____rhs);
        deflexical("*YAHOO-MOVIES-FILM-INFORMATION-MARKER*", $str26$_b_);
        deflexical("*YAHOO-MOVIES-FILM-INFORMATION-URL*", $str27$_a_href___shop);
        deflexical("*YAHOO-MOVIES-LISTINGS-RATINGS-MARKER*", $str28$_small_);
        deflexical("*YAHOO-MOVIES-LISTINGS-PLAYTIME-MARKER*", $str22$_font);
        deflexical("*YAHOO-MOVIES-RATING-SPLIT-SET*", list(CHAR_semicolon));
        deflexical("*YAHOO-MOVIES-PLAYTIME-SPLIT-SET*", list(CHAR_ampersand));
        return NIL;
    }

    public static SubLObject setup_yahoo_movies_widgets_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_yahoo_movies_widgets_file();
    }

    @Override
    public void initializeVariables() {
        init_yahoo_movies_widgets_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_yahoo_movies_widgets_file();
    }

    
}

/**
 * Total time: 233 ms
 */
