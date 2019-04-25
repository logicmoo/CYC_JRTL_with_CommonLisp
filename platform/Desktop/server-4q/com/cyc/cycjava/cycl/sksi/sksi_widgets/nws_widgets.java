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

public final class nws_widgets
    extends
      SubLTranslatedFile
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
  public static SubLObject nws_parse_temp_weather_request(SubLObject tokens)
  {
    if( NIL != subl_promotions.memberP( $str0$Choose_Location_from_the_Followin, tokens, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
    {
      tokens = possible_disambiguation( tokens );
    }
    if( NIL == tokens )
    {
      return $list1;
    }
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str2$Your_National_Weather_Service_for, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str3$__tr_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str4$_td, UNPROVIDED );
    final SubLObject city = filter_city( ConsesLow.nth( ONE_INTEGER, tokens ) );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str5$Last_Update, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str6$_td_class_, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens( tokens, UNPROVIDED );
    if( NIL == tokens )
    {
      return $list7;
    }
    final SubLObject weathers = filter_weather( ConsesLow.nth( ZERO_INTEGER, tokens ) );
    final SubLObject tempf = filter_tempf( ConsesLow.nth( THREE_INTEGER, tokens ) );
    final SubLObject tempc = filter_tempc( ConsesLow.nth( FIVE_INTEGER, tokens ) );
    SubLObject results = NIL;
    SubLObject cdolist_list_var = weathers;
    SubLObject weather = NIL;
    weather = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      results = ConsesLow.cons( ConsesLow.listS( city, NIL, NIL, weather, tempf, $list8 ), results );
      cdolist_list_var = cdolist_list_var.rest();
      weather = cdolist_list_var.first();
    }
    return results;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 1947L)
  public static SubLObject possible_disambiguation(SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str9$Please_select_one_of_the_followin, UNPROVIDED );
    tokens = xml_parsing_utilities.advance_xml_tokens_to( tokens, $str10$data_forecasts, UNPROVIDED );
    if( NIL == tokens )
    {
      return NIL;
    }
    final SubLObject href = tokens.first();
    final SubLObject new_address = string_utilities.string_upto( string_utilities.string_after( href, Characters.CHAR_equal ), Characters.CHAR_greater );
    final SubLObject new_url = Sequences.cconcatenate( $str11$http_, new_address );
    SubLObject machine = NIL;
    SubLObject url = NIL;
    SubLObject query = NIL;
    SubLObject port = NIL;
    SubLObject new_tokens = NIL;
    thread.resetMultipleValues();
    final SubLObject machine_$1 = web_utilities.parse_http_url( new_url );
    final SubLObject port_$2 = thread.secondMultipleValue();
    final SubLObject url_$3 = thread.thirdMultipleValue();
    final SubLObject query_$4 = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    machine = machine_$1;
    port = port_$2;
    url = url_$3;
    query = query_$4;
    final SubLObject real_port = port.eql( $kw12$DEFAULT ) ? $int13$80 : port;
    SubLObject in_stream = NIL;
    try
    {
      in_stream = subl_promotions.open_tcp_stream_with_timeout( machine, real_port, NIL, $kw14$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, machine, real_port ) )
      {
        web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw15$MACHINE, machine, $kw16$PORT, port, $kw17$METHOD, $kw18$GET, $kw19$URL, url, $kw20$QUERY, query, $kw21$KEEP_ALIVE_, T,
          $kw22$WIDE_NEWLINES_, T, $kw23$ACCEPT_TYPES, $kw12$DEFAULT, $kw24$CONTENT_TYPE, $kw12$DEFAULT, $kw25$SOAP_ACTION_URI, NIL
        } ) );
        new_tokens = xml_parsing_utilities.xml_tokenize( in_stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != in_stream )
        {
          streams_high.close( in_stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return new_tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 2835L)
  public static SubLObject filter_city(final SubLObject city)
  {
    return city.isString() ? string_utilities.trim_whitespace( string_utilities.strip_chars_meeting_test( string_utilities.strip_first_n( city, TWO_INTEGER ), UNPROVIDED ) ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 2973L)
  public static SubLObject filter_weather(final SubLObject weather)
  {
    final SubLObject weather_string = Strings.string_downcase( weather, UNPROVIDED, UNPROVIDED );
    final SubLObject weather_words = string_utilities.break_words( weather_string, Symbols.symbol_function( $sym26$ALPHA_CHAR_P ), UNPROVIDED );
    final SubLObject modifiers = $list27;
    final SubLObject removes = $list28;
    SubLObject current_modifier = NIL;
    SubLObject weather_list = NIL;
    SubLObject cdolist_list_var = weather_words;
    SubLObject weather_word = NIL;
    weather_word = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == subl_promotions.memberP( weather_word, removes, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
      {
        if( NIL != current_modifier )
        {
          final SubLObject item_var = Sequences.cconcatenate( current_modifier, new SubLObject[] { $str29$_, weather_word
          } );
          if( NIL == conses_high.member( item_var, weather_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            weather_list = ConsesLow.cons( item_var, weather_list );
          }
          current_modifier = NIL;
        }
        else if( NIL != subl_promotions.memberP( weather_word, modifiers, Symbols.symbol_function( EQUAL ), UNPROVIDED ) )
        {
          current_modifier = weather_word;
        }
        else
        {
          final SubLObject item_var = weather_word;
          if( NIL == conses_high.member( item_var, weather_list, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ) ) )
          {
            weather_list = ConsesLow.cons( item_var, weather_list );
          }
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      weather_word = cdolist_list_var.first();
    }
    return weather_list;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 3750L)
  public static SubLObject filter_tempf(final SubLObject tempf)
  {
    final SubLObject tempf_string = string_utilities.string_upto( tempf, Characters.CHAR_ampersand );
    return tempf_string.isString() ? string_utilities.string_to_integer( tempf_string ) : NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/nws-widgets.lisp", position = 3917L)
  public static SubLObject filter_tempc(final SubLObject tempc)
  {
    final SubLObject tempc_string = string_utilities.string_between( tempc, $list30, UNPROVIDED );
    return tempc_string.isString() ? string_utilities.string_to_integer( tempc_string ) : NIL;
  }

  public static SubLObject declare_nws_widgets_file()
  {
    SubLFiles.declareFunction( me, "nws_parse_temp_weather_request", "NWS-PARSE-TEMP-WEATHER-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "possible_disambiguation", "POSSIBLE-DISAMBIGUATION", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_city", "FILTER-CITY", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_weather", "FILTER-WEATHER", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_tempf", "FILTER-TEMPF", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_tempc", "FILTER-TEMPC", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_nws_widgets_file()
  {
    return NIL;
  }

  public static SubLObject setup_nws_widgets_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_nws_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_nws_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_nws_widgets_file();
  }
  static
  {
    me = new nws_widgets();
    $str0$Choose_Location_from_the_Followin = makeString( "Choose Location from the Following List" );
    $list1 = ConsesLow.list( ConsesLow.list( NIL, NIL, NIL, NIL ) );
    $str2$Your_National_Weather_Service_for = makeString( "Your National Weather Service forecast" );
    $str3$__tr_ = makeString( "</tr>" );
    $str4$_td = makeString( "<td" );
    $str5$Last_Update = makeString( "Last Update" );
    $str6$_td_class_ = makeString( "<td class=" );
    $list7 = ConsesLow.list( ConsesLow.list( new SubLObject[] { NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL
    } ), makeSymbol( "RESULTS" ) );
    $list8 = ConsesLow.list( new SubLObject[] { NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL
    } );
    $str9$Please_select_one_of_the_followin = makeString( "Please select one of the following choices" );
    $str10$data_forecasts = makeString( "data/forecasts" );
    $str11$http_ = makeString( "http:" );
    $kw12$DEFAULT = makeKeyword( "DEFAULT" );
    $int13$80 = makeInteger( 80 );
    $kw14$PRIVATE = makeKeyword( "PRIVATE" );
    $kw15$MACHINE = makeKeyword( "MACHINE" );
    $kw16$PORT = makeKeyword( "PORT" );
    $kw17$METHOD = makeKeyword( "METHOD" );
    $kw18$GET = makeKeyword( "GET" );
    $kw19$URL = makeKeyword( "URL" );
    $kw20$QUERY = makeKeyword( "QUERY" );
    $kw21$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw22$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw23$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw24$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw25$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $sym26$ALPHA_CHAR_P = makeSymbol( "ALPHA-CHAR-P" );
    $list27 = ConsesLow.list( makeString( "light" ), makeString( "moderate" ), makeString( "heavy" ), makeString( "few" ), makeString( "partly" ), makeString( "mostly" ), makeString( "freezing" ) );
    $list28 = ConsesLow.list( makeString( "and" ), makeString( "a" ), makeString( "with" ) );
    $str29$_ = makeString( " " );
    $list30 = ConsesLow.list( Characters.CHAR_lparen, Characters.CHAR_ampersand );
  }
}
/*
 * 
 * Total time: 104 ms
 * 
 */