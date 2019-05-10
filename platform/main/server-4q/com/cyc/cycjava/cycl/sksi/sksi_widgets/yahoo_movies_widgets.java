package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.xml_parsing_utilities;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class yahoo_movies_widgets
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.sksi.sksi_widgets.yahoo_movies_widgets";
  public static final String myFingerPrint = "6dcbb34e7f8a960514ca0b7772bc5864066f701749735a83d35fb4f66d967564";
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1039L)
  private static SubLSymbol $yahoo_movies_request_port$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1093L)
  private static SubLSymbol $yahoo_movies_request_method$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1149L)
  private static SubLSymbol $yahoo_movies_request_machine$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1220L)
  private static SubLSymbol $yahoo_movies_url_base$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1300L)
  private static SubLSymbol $yahoo_movies_url_query_portion$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1360L)
  private static SubLSymbol $yahoo_movieswide_newlinesP$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2390L)
  private static SubLSymbol $yahoo_movies_listing_start_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2482L)
  private static SubLSymbol $yahoo_movies_listing_table_start_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2555L)
  private static SubLSymbol $yahoo_movies_listing_name_starter$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2635L)
  private static SubLSymbol $yahoo_movies_listing_phone_number$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2701L)
  private static SubLSymbol $yahoo_movies_listing_address$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2761L)
  private static SubLSymbol $yahoo_movies_start_of_film_listings$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2829L)
  private static SubLSymbol $yahoo_movies_left_column_indicator$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2898L)
  private static SubLSymbol $yahoo_movies_right_column_indicator$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2968L)
  private static SubLSymbol $yahoo_movies_film_information_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 3034L)
  private static SubLSymbol $yahoo_movies_film_information_url$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 3109L)
  private static SubLSymbol $yahoo_movies_listings_ratings_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 3179L)
  private static SubLSymbol $yahoo_movies_listings_playtime_marker$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 7726L)
  private static SubLSymbol $yahoo_movies_rating_split_set$;
  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 7792L)
  private static SubLSymbol $yahoo_movies_playtime_split_set$;
  private static final SubLInteger $int0$80;
  private static final SubLSymbol $kw1$GET;
  private static final SubLString $str2$movies_yahoo_com;
  private static final SubLString $str3$_showtimes_showtimes_html;
  private static final SubLString $str4$z_;
  private static final SubLSymbol $sym5$FIXNUMP;
  private static final SubLSymbol $kw6$DEFAULT;
  private static final SubLSymbol $kw7$PRIVATE;
  private static final SubLSymbol $kw8$MACHINE;
  private static final SubLSymbol $kw9$PORT;
  private static final SubLSymbol $kw10$METHOD;
  private static final SubLSymbol $kw11$URL;
  private static final SubLSymbol $kw12$QUERY;
  private static final SubLSymbol $kw13$KEEP_ALIVE_;
  private static final SubLSymbol $kw14$WIDE_NEWLINES_;
  private static final SubLSymbol $kw15$ACCEPT_TYPES;
  private static final SubLSymbol $kw16$CONTENT_TYPE;
  private static final SubLSymbol $kw17$SOAP_ACTION_URI;
  private static final SubLString $str18$Buy_Tickets;
  private static final SubLString $str19$_table_;
  private static final SubLString $str20$_a_href___showtimes;
  private static final SubLString $str21$Phone_;
  private static final SubLString $str22$_font;
  private static final SubLString $str23$_table;
  private static final SubLString $str24$_____lhs;
  private static final SubLString $str25$_____rhs;
  private static final SubLString $str26$_b_;
  private static final SubLString $str27$_a_href___shop;
  private static final SubLString $str28$_small_;
  private static final SubLSymbol $sym29$STRING_EQUAL;
  private static final SubLSymbol $sym30$XML_TOKEN_STARTS_WITH;
  private static final SubLList $list31;
  private static final SubLString $str32$At__A__Phone__A__Address__A__loca;
  private static final SubLList $list33;
  private static final SubLString $str34$Name___A__see__A__rated__A_lastin;

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 1497L)
  public static SubLObject yahoo_movies_get_all_theatres_for_zipcode(final SubLObject zipcode)
  {
    assert NIL != Types.fixnump( zipcode ) : zipcode;
    final SubLObject encoded_query = yahoo_movies_add_zipcode_to_query( zipcode );
    SubLObject v_answer = NIL;
    final SubLObject real_port = $yahoo_movies_request_port$.getGlobalValue().eql( $kw6$DEFAULT ) ? $int0$80 : $yahoo_movies_request_port$.getGlobalValue();
    SubLObject in_stream = NIL;
    try
    {
      in_stream = subl_promotions.open_tcp_stream_with_timeout( $yahoo_movies_request_machine$.getGlobalValue(), real_port, NIL, $kw7$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, $yahoo_movies_request_machine$.getGlobalValue(), real_port ) )
      {
        web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw8$MACHINE, $yahoo_movies_request_machine$.getGlobalValue(), $kw9$PORT, $yahoo_movies_request_port$.getGlobalValue(), $kw10$METHOD,
          $yahoo_movies_request_method$.getGlobalValue(), $kw11$URL, $yahoo_movies_url_base$.getGlobalValue(), $kw12$QUERY, encoded_query, $kw13$KEEP_ALIVE_, NIL, $kw14$WIDE_NEWLINES_, $yahoo_movieswide_newlinesP$
              .getGlobalValue(), $kw15$ACCEPT_TYPES, $kw6$DEFAULT, $kw16$CONTENT_TYPE, $kw6$DEFAULT, $kw17$SOAP_ACTION_URI, NIL
        } ) );
        v_answer = xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != in_stream )
        {
          streams_high.close( in_stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2104L)
  public static SubLObject yahoo_movies_add_zipcode_to_query(final SubLObject zipcode)
  {
    return Sequences.cconcatenate( $yahoo_movies_url_query_portion$.getGlobalValue(), string_utilities.to_string( zipcode ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 2242L)
  public static SubLObject yahoo_movies_parse_theatres_by_zipcode_request(final SubLObject tokens)
  {
    return yahoo_movies_gather_all_theatres( tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 3248L)
  public static SubLObject yahoo_movies_move_past_header(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listing_start_marker$.getGlobalValue(), $sym29$STRING_EQUAL ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 3416L)
  public static SubLObject yahoo_movies_film_listing_locate_next(final SubLObject tokens, final SubLObject column_alternator)
  {
    if( NIL == tokens )
    {
      return NIL;
    }
    final SubLObject indicator = column_alternator.isPositive() ? $yahoo_movies_right_column_indicator$.getGlobalValue() : $yahoo_movies_left_column_indicator$.getGlobalValue();
    final SubLObject column_start = xml_parsing_utilities.advance_xml_tokens_without_crossing( tokens, indicator, $yahoo_movies_listing_name_starter$.getGlobalValue(), $sym30$XML_TOKEN_STARTS_WITH );
    SubLObject info_start = NIL;
    if( NIL == xml_parsing_utilities.xml_token_starts_with( column_start.first(), indicator ) )
    {
      return NIL;
    }
    info_start = xml_parsing_utilities.advance_xml_tokens_to( column_start, $yahoo_movies_film_information_marker$.getGlobalValue(), UNPROVIDED ).rest();
    if( NIL == xml_parsing_utilities.xml_token_starts_with( info_start.first(), $yahoo_movies_film_information_url$.getGlobalValue() ) )
    {
      return NIL;
    }
    return info_start;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 4368L)
  public static SubLObject yahoo_movies_advance_within_listing_to_playtimes(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listings_playtime_marker$.getGlobalValue(), $sym30$XML_TOKEN_STARTS_WITH ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 4589L)
  public static SubLObject yahoo_movies_advance_within_listing_to_ratings(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listings_ratings_marker$.getGlobalValue(), $sym30$XML_TOKEN_STARTS_WITH ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 4844L)
  public static SubLObject yahoo_movies_advance_to_link_for_name(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listing_name_starter$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 4998L)
  public static SubLObject yahoo_movies_move_to_name(final SubLObject tokens)
  {
    return yahoo_movies_advance_to_link_for_name( tokens ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 5113L)
  public static SubLObject yahoo_movies_locate_theatre_phone_number(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listing_phone_number$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 5256L)
  public static SubLObject yahoo_movies_locate_theatre_address(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_listing_address$.getGlobalValue(), UNPROVIDED ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 5396L)
  public static SubLObject yahoo_movies_locate_theatre_maplink(final SubLObject tokens)
  {
    return yahoo_movies_advance_to_link_for_name( tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 5514L)
  public static SubLObject yahoo_movies_locate_theatre_listings(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $yahoo_movies_start_of_film_listings$.getGlobalValue(), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 5655L)
  public static SubLObject yahoo_movies_gather_all_theatres(final SubLObject tokens)
  {
    final SubLObject theatre_start = yahoo_movies_move_past_header( tokens );
    SubLObject curr_theatre = yahoo_movies_move_to_name( theatre_start );
    SubLObject all_theatres = NIL;
    while ( NIL != curr_theatre)
    {
      SubLObject name = NIL;
      SubLObject phone_number = NIL;
      SubLObject address = NIL;
      SubLObject map_url = NIL;
      SubLObject films = NIL;
      name = curr_theatre.first();
      curr_theatre = yahoo_movies_locate_theatre_phone_number( curr_theatre );
      phone_number = curr_theatre.first();
      curr_theatre = yahoo_movies_locate_theatre_address( curr_theatre );
      address = curr_theatre.first();
      curr_theatre = yahoo_movies_locate_theatre_maplink( curr_theatre );
      map_url = curr_theatre.first();
      final SubLObject listings;
      curr_theatre = ( listings = yahoo_movies_locate_theatre_listings( curr_theatre ) );
      for( SubLObject column_alternator = ZERO_INTEGER, curr_listing = yahoo_movies_film_listing_locate_next( listings, column_alternator ); NIL != curr_listing; curr_listing = yahoo_movies_film_listing_locate_next(
          curr_listing, column_alternator ) )
      {
        final SubLObject film_info = yahoo_movies_extract_movie_information( curr_listing );
        films = ConsesLow.cons( film_info, films );
        column_alternator = Numbers.add( column_alternator, ONE_INTEGER );
      }
      if( NIL != films )
      {
        films = Sequences.nreverse( films );
        all_theatres = ConsesLow.cons( ConsesLow.list( name, phone_number, address, map_url, films ), all_theatres );
      }
      curr_theatre = yahoo_movies_move_to_name( curr_theatre );
    }
    return Sequences.nreverse( all_theatres );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 7303L)
  public static SubLObject print_yahoo_movies_theatre_information(final SubLObject result, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    SubLObject name = NIL;
    SubLObject phone_number = NIL;
    SubLObject address = NIL;
    SubLObject map_url = NIL;
    SubLObject films = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( result, result, $list31 );
    name = result.first();
    SubLObject current = result.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list31 );
    phone_number = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list31 );
    address = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list31 );
    map_url = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list31 );
    films = current.first();
    current = current.rest();
    if( NIL == current )
    {
      PrintLow.format( stream, $str32$At__A__Phone__A__Address__A__loca, new SubLObject[] { name, phone_number, address, map_url
      } );
      SubLObject cdolist_list_var = films;
      SubLObject film = NIL;
      film = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        string_utilities.indent( stream, TWO_INTEGER );
        print_yahoo_movies_movie_information( film, UNPROVIDED );
        cdolist_list_var = cdolist_list_var.rest();
        film = cdolist_list_var.first();
      }
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( result, $list31 );
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 7858L)
  public static SubLObject yahoo_movies_extract_movie_information(SubLObject listing)
  {
    final SubLObject film_description_url = listing.first();
    final SubLObject film_name = conses_high.second( listing );
    SubLObject film_rating = NIL;
    SubLObject film_duration = NIL;
    SubLObject playing_times = NIL;
    listing = yahoo_movies_advance_within_listing_to_ratings( listing );
    final SubLObject rating_and_time = listing.first();
    film_rating = string_utilities.substring( rating_and_time, ZERO_INTEGER, ONE_INTEGER );
    film_duration = conses_high.last( string_utilities.split_string( rating_and_time, $yahoo_movies_rating_split_set$.getGlobalValue() ), UNPROVIDED ).first();
    listing = yahoo_movies_advance_within_listing_to_playtimes( listing );
    final SubLObject playtime = listing.first();
    playing_times = string_utilities.split_string( playtime, $yahoo_movies_playtime_split_set$.getGlobalValue() ).first();
    return ConsesLow.list( film_description_url, film_name, film_rating, film_duration, playing_times );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/yahoo-movies-widgets.lisp", position = 8738L)
  public static SubLObject print_yahoo_movies_movie_information(final SubLObject result, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    SubLObject film_description_url = NIL;
    SubLObject film_name = NIL;
    SubLObject film_rating = NIL;
    SubLObject film_duration = NIL;
    SubLObject playing_times = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( result, result, $list33 );
    film_description_url = result.first();
    SubLObject current = result.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list33 );
    film_name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list33 );
    film_rating = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list33 );
    film_duration = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, result, $list33 );
    playing_times = current.first();
    current = current.rest();
    if( NIL == current )
    {
      PrintLow.format( stream, $str34$Name___A__see__A__rated__A_lastin, new SubLObject[] { film_name, film_description_url, film_rating, film_duration, playing_times
      } );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( result, $list33 );
    }
    return result;
  }

  public static SubLObject declare_yahoo_movies_widgets_file()
  {
    SubLFiles.declareFunction( me, "yahoo_movies_get_all_theatres_for_zipcode", "YAHOO-MOVIES-GET-ALL-THEATRES-FOR-ZIPCODE", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_add_zipcode_to_query", "YAHOO-MOVIES-ADD-ZIPCODE-TO-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_parse_theatres_by_zipcode_request", "YAHOO-MOVIES-PARSE-THEATRES-BY-ZIPCODE-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_move_past_header", "YAHOO-MOVIES-MOVE-PAST-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_film_listing_locate_next", "YAHOO-MOVIES-FILM-LISTING-LOCATE-NEXT", 2, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_advance_within_listing_to_playtimes", "YAHOO-MOVIES-ADVANCE-WITHIN-LISTING-TO-PLAYTIMES", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_advance_within_listing_to_ratings", "YAHOO-MOVIES-ADVANCE-WITHIN-LISTING-TO-RATINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_advance_to_link_for_name", "YAHOO-MOVIES-ADVANCE-TO-LINK-FOR-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_move_to_name", "YAHOO-MOVIES-MOVE-TO-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_locate_theatre_phone_number", "YAHOO-MOVIES-LOCATE-THEATRE-PHONE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_locate_theatre_address", "YAHOO-MOVIES-LOCATE-THEATRE-ADDRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_locate_theatre_maplink", "YAHOO-MOVIES-LOCATE-THEATRE-MAPLINK", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_locate_theatre_listings", "YAHOO-MOVIES-LOCATE-THEATRE-LISTINGS", 1, 0, false );
    SubLFiles.declareFunction( me, "yahoo_movies_gather_all_theatres", "YAHOO-MOVIES-GATHER-ALL-THEATRES", 1, 0, false );
    SubLFiles.declareFunction( me, "print_yahoo_movies_theatre_information", "PRINT-YAHOO-MOVIES-THEATRE-INFORMATION", 1, 1, false );
    SubLFiles.declareFunction( me, "yahoo_movies_extract_movie_information", "YAHOO-MOVIES-EXTRACT-MOVIE-INFORMATION", 1, 0, false );
    SubLFiles.declareFunction( me, "print_yahoo_movies_movie_information", "PRINT-YAHOO-MOVIES-MOVIE-INFORMATION", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_yahoo_movies_widgets_file()
  {
    $yahoo_movies_request_port$ = SubLFiles.deflexical( "*YAHOO-MOVIES-REQUEST-PORT*", $int0$80 );
    $yahoo_movies_request_method$ = SubLFiles.deflexical( "*YAHOO-MOVIES-REQUEST-METHOD*", $kw1$GET );
    $yahoo_movies_request_machine$ = SubLFiles.deflexical( "*YAHOO-MOVIES-REQUEST-MACHINE*", $str2$movies_yahoo_com );
    $yahoo_movies_url_base$ = SubLFiles.deflexical( "*YAHOO-MOVIES-URL-BASE*", $str3$_showtimes_showtimes_html );
    $yahoo_movies_url_query_portion$ = SubLFiles.deflexical( "*YAHOO-MOVIES-URL-QUERY-PORTION*", $str4$z_ );
    $yahoo_movieswide_newlinesP$ = SubLFiles.deflexical( "*YAHOO-MOVIESWIDE-NEWLINES?*", T );
    $yahoo_movies_listing_start_marker$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTING-START-MARKER*", $str18$Buy_Tickets );
    $yahoo_movies_listing_table_start_marker$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTING-TABLE-START-MARKER*", $str19$_table_ );
    $yahoo_movies_listing_name_starter$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTING-NAME-STARTER*", $str20$_a_href___showtimes );
    $yahoo_movies_listing_phone_number$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTING-PHONE-NUMBER*", $str21$Phone_ );
    $yahoo_movies_listing_address$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTING-ADDRESS*", $str22$_font );
    $yahoo_movies_start_of_film_listings$ = SubLFiles.deflexical( "*YAHOO-MOVIES-START-OF-FILM-LISTINGS*", $str23$_table );
    $yahoo_movies_left_column_indicator$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LEFT-COLUMN-INDICATOR*", $str24$_____lhs );
    $yahoo_movies_right_column_indicator$ = SubLFiles.deflexical( "*YAHOO-MOVIES-RIGHT-COLUMN-INDICATOR*", $str25$_____rhs );
    $yahoo_movies_film_information_marker$ = SubLFiles.deflexical( "*YAHOO-MOVIES-FILM-INFORMATION-MARKER*", $str26$_b_ );
    $yahoo_movies_film_information_url$ = SubLFiles.deflexical( "*YAHOO-MOVIES-FILM-INFORMATION-URL*", $str27$_a_href___shop );
    $yahoo_movies_listings_ratings_marker$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTINGS-RATINGS-MARKER*", $str28$_small_ );
    $yahoo_movies_listings_playtime_marker$ = SubLFiles.deflexical( "*YAHOO-MOVIES-LISTINGS-PLAYTIME-MARKER*", $str22$_font );
    $yahoo_movies_rating_split_set$ = SubLFiles.deflexical( "*YAHOO-MOVIES-RATING-SPLIT-SET*", ConsesLow.list( Characters.CHAR_semicolon ) );
    $yahoo_movies_playtime_split_set$ = SubLFiles.deflexical( "*YAHOO-MOVIES-PLAYTIME-SPLIT-SET*", ConsesLow.list( Characters.CHAR_ampersand ) );
    return NIL;
  }

  public static SubLObject setup_yahoo_movies_widgets_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_yahoo_movies_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_yahoo_movies_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_yahoo_movies_widgets_file();
  }
  static
  {
    me = new yahoo_movies_widgets();
    $yahoo_movies_request_port$ = null;
    $yahoo_movies_request_method$ = null;
    $yahoo_movies_request_machine$ = null;
    $yahoo_movies_url_base$ = null;
    $yahoo_movies_url_query_portion$ = null;
    $yahoo_movieswide_newlinesP$ = null;
    $yahoo_movies_listing_start_marker$ = null;
    $yahoo_movies_listing_table_start_marker$ = null;
    $yahoo_movies_listing_name_starter$ = null;
    $yahoo_movies_listing_phone_number$ = null;
    $yahoo_movies_listing_address$ = null;
    $yahoo_movies_start_of_film_listings$ = null;
    $yahoo_movies_left_column_indicator$ = null;
    $yahoo_movies_right_column_indicator$ = null;
    $yahoo_movies_film_information_marker$ = null;
    $yahoo_movies_film_information_url$ = null;
    $yahoo_movies_listings_ratings_marker$ = null;
    $yahoo_movies_listings_playtime_marker$ = null;
    $yahoo_movies_rating_split_set$ = null;
    $yahoo_movies_playtime_split_set$ = null;
    $int0$80 = makeInteger( 80 );
    $kw1$GET = makeKeyword( "GET" );
    $str2$movies_yahoo_com = makeString( "movies.yahoo.com" );
    $str3$_showtimes_showtimes_html = makeString( "/showtimes/showtimes.html" );
    $str4$z_ = makeString( "z=" );
    $sym5$FIXNUMP = makeSymbol( "FIXNUMP" );
    $kw6$DEFAULT = makeKeyword( "DEFAULT" );
    $kw7$PRIVATE = makeKeyword( "PRIVATE" );
    $kw8$MACHINE = makeKeyword( "MACHINE" );
    $kw9$PORT = makeKeyword( "PORT" );
    $kw10$METHOD = makeKeyword( "METHOD" );
    $kw11$URL = makeKeyword( "URL" );
    $kw12$QUERY = makeKeyword( "QUERY" );
    $kw13$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw14$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw15$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw16$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw17$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $str18$Buy_Tickets = makeString( "Buy Tickets" );
    $str19$_table_ = makeString( "<table>" );
    $str20$_a_href___showtimes = makeString( "<a href=\"/showtimes" );
    $str21$Phone_ = makeString( "Phone:" );
    $str22$_font = makeString( "<font" );
    $str23$_table = makeString( "<table" );
    $str24$_____lhs = makeString( "<!-- lhs" );
    $str25$_____rhs = makeString( "<!-- rhs" );
    $str26$_b_ = makeString( "<b>" );
    $str27$_a_href___shop = makeString( "<a href=\"/shop" );
    $str28$_small_ = makeString( "<small>" );
    $sym29$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $sym30$XML_TOKEN_STARTS_WITH = makeSymbol( "XML-TOKEN-STARTS-WITH" );
    $list31 = ConsesLow.list( makeSymbol( "NAME" ), makeSymbol( "PHONE-NUMBER" ), makeSymbol( "ADDRESS" ), makeSymbol( "MAP-URL" ), makeSymbol( "FILMS" ) );
    $str32$At__A__Phone__A__Address__A__loca = makeString( "At ~A (Phone ~A, Address ~A) locatable via link ~A, they are playing:~%" );
    $list33 = ConsesLow.list( makeSymbol( "FILM-DESCRIPTION-URL" ), makeSymbol( "FILM-NAME" ), makeSymbol( "FILM-RATING" ), makeSymbol( "FILM-DURATION" ), makeSymbol( "PLAYING-TIMES" ) );
    $str34$Name___A__see__A__rated__A_lastin = makeString( "Name: ~A (see ~A) rated ~A lasting ~A playing ~A~%" );
  }
}
/*
 * 
 * Total time: 233 ms
 * 
 */