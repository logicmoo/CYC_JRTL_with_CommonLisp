package com.cyc.cycjava.cycl.sksi.sksi_widgets;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
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

public final class washington_post_restaurants_widgets
    extends
      SubLTranslatedFile
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
  public static SubLObject washpost_rest_get_all_restaurants_for_cuisine(final SubLObject cuisine)
  {
    return washpost_rest_get_all_restaurants_for_criteria( string_utilities.to_string( cuisine ), $str5$, $str5$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2301L)
  public static SubLObject washpost_rest_get_all_restaurants_for_price(final SubLObject price)
  {
    return washpost_rest_get_all_restaurants_for_criteria( $str5$, string_utilities.to_string( price ), $str5$ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2459L)
  public static SubLObject washpost_rest_get_all_restaurants_for_neighborhood(final SubLObject neighborhood)
  {
    return washpost_rest_get_all_restaurants_for_criteria( $str5$, $str5$, string_utilities.to_string( neighborhood ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 2649L)
  public static SubLObject washpost_rest_get_all_restaurants_for_criteria(SubLObject cuisine, SubLObject price, SubLObject neighborhood)
  {
    if( cuisine == UNPROVIDED )
    {
      cuisine = $str5$;
    }
    if( price == UNPROVIDED )
    {
      price = $str5$;
    }
    if( neighborhood == UNPROVIDED )
    {
      neighborhood = $str5$;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != Types.stringp( cuisine ) : cuisine;
    assert NIL != Types.stringp( price ) : price;
    assert NIL != Types.stringp( neighborhood ) : neighborhood;
    final SubLObject encoded_query = washpost_rest_instantiate_query( cuisine, price, neighborhood );
    SubLObject v_answer = NIL;
    if( NIL != $washpost_rest_cookie_stash$.getGlobalValue() )
    {
      final SubLObject _prev_bind_0 = web_utilities.$http_cookies_to_include_in_requests$.currentBinding( thread );
      try
      {
        web_utilities.$http_cookies_to_include_in_requests$.bind( $washpost_rest_cookie_stash$.getGlobalValue(), thread );
        v_answer = washpost_rest_perform_query_request( encoded_query );
      }
      finally
      {
        web_utilities.$http_cookies_to_include_in_requests$.rebind( _prev_bind_0, thread );
      }
    }
    else
    {
      v_answer = washpost_rest_perform_query_request( encoded_query );
    }
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 3394L)
  public static SubLObject washpost_rest_perform_query_request(final SubLObject encoded_query)
  {
    SubLObject v_answer = NIL;
    final SubLObject real_port = $washpost_rest_request_port$.getGlobalValue().eql( $kw7$DEFAULT ) ? $int0$80 : $washpost_rest_request_port$.getGlobalValue();
    SubLObject in_stream = NIL;
    try
    {
      in_stream = subl_promotions.open_tcp_stream_with_timeout( $washpost_rest_request_machine$.getGlobalValue(), real_port, NIL, $kw8$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, $washpost_rest_request_machine$.getGlobalValue(), real_port ) )
      {
        web_utilities.send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw9$MACHINE, $washpost_rest_request_machine$.getGlobalValue(), $kw10$PORT, $washpost_rest_request_port$.getGlobalValue(),
          $kw11$METHOD, $washpost_rest_request_method$.getGlobalValue(), $kw12$URL, $washpost_rest_url_base$.getGlobalValue(), $kw13$QUERY, encoded_query, $kw14$KEEP_ALIVE_, NIL, $kw15$WIDE_NEWLINES_,
          $washpost_rest_wide_newlinesP$.getGlobalValue(), $kw16$ACCEPT_TYPES, $kw7$DEFAULT, $kw17$CONTENT_TYPE, $kw7$DEFAULT, $kw18$SOAP_ACTION_URI, NIL
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
    washpost_rest_update_cookie_stash( v_answer.first() );
    return v_answer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 3942L)
  public static SubLObject washpost_rest_instantiate_query(final SubLObject cuisine, final SubLObject price, final SubLObject neighborhood)
  {
    return PrintLow.format( NIL, $washpost_rest_url_query_template$.getGlobalValue(), new SubLObject[] { cuisine, price, neighborhood
    } );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 4120L)
  public static SubLObject washpost_rest_update_cookie_stash(final SubLObject http_header)
  {
    $washpost_rest_cookie_stash$.setGlobalValue( web_utilities.http_extract_cookies_from_reply_header( http_header ) );
    return $washpost_rest_cookie_stash$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 4325L)
  public static SubLObject washpost_rest_parse_all_restaurants_request(final SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_bindings = NIL;
    thread.resetMultipleValues();
    final SubLObject continuation = washpost_rest_parse_selection_choices( tokens );
    final SubLObject cuisines = thread.secondMultipleValue();
    final SubLObject prices = thread.thirdMultipleValue();
    final SubLObject neighborhoods = thread.fourthMultipleValue();
    thread.resetMultipleValues();
    SubLObject continuation_$1;
    for( SubLObject current = washpost_rest_advance_past_choices( continuation ); NIL != current; current = continuation_$1 )
    {
      thread.resetMultipleValues();
      final SubLObject information = washpost_rest_harvest_one_restaurant( current );
      continuation_$1 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      if( NIL != information )
      {
        v_bindings = ConsesLow.cons( information, v_bindings );
      }
    }
    return Values.values( Sequences.nreverse( v_bindings ), cuisines, prices, neighborhoods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 5000L)
  public static SubLObject washpost_rest_parse_selection_choices(SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject cuisines = NIL;
    SubLObject prices = NIL;
    SubLObject neighborhoods = NIL;
    thread.resetMultipleValues();
    SubLObject information = washpost_rest_harvest_cuisine_choices( tokens );
    SubLObject continuation = thread.secondMultipleValue();
    thread.resetMultipleValues();
    cuisines = information;
    tokens = continuation;
    thread.resetMultipleValues();
    information = washpost_rest_harvest_price_choices( tokens );
    continuation = thread.secondMultipleValue();
    thread.resetMultipleValues();
    prices = information;
    tokens = continuation;
    thread.resetMultipleValues();
    information = washpost_rest_harvest_neighborhood_choices( tokens );
    continuation = thread.secondMultipleValue();
    thread.resetMultipleValues();
    neighborhoods = information;
    tokens = continuation;
    return Values.values( tokens, cuisines, prices, neighborhoods );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6037L)
  public static SubLObject washpost_rest_advance_to_cuisine_selector(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_cuisine_selector$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6201L)
  public static SubLObject washpost_rest_advance_to_price_selector(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_price_selector$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6360L)
  public static SubLObject washpost_rest_advance_to_neighborhood_selector(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_neighborhood_selector$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 6533L)
  public static SubLObject washpost_rest_advance_past_choices(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_choices_end_selector$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7309L)
  public static SubLObject washpost_rest_advance_to_next_restaurant_url(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_website_restaurant_indicator$.getGlobalValue(), Symbols.symbol_function( $sym31$XML_TOKEN_STARTS_WITH ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7520L)
  public static SubLObject washpost_rest_advance_from_url_to_restaurant_name(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_restaurant_name_indicator$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7736L)
  public static SubLObject washpost_rest_advance_from_restaurant_name_to_address(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_restaurant_address_indicator$.getGlobalValue(), Symbols.symbol_function( $sym31$XML_TOKEN_STARTS_WITH ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 7968L)
  public static SubLObject washpost_rest_advance_from_restaurant_address_to_phone_number(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_restaurant_phone_indicator$.getGlobalValue(), Symbols.symbol_function( $sym23$STRING_EQUAL ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8197L)
  public static SubLObject washpost_rest_advance_to_restaurant_map_url(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_website_mapurl_indicator$.getGlobalValue(), Symbols.symbol_function( $sym31$XML_TOKEN_STARTS_WITH ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8402L)
  public static SubLObject washpost_rest_advance_to_restaurant_cuisines(final SubLObject tokens)
  {
    return xml_parsing_utilities.advance_xml_tokens_to( tokens, $washpost_rest_restaurant_cuisine_indicator$.getGlobalValue(), Symbols.symbol_function( $sym31$XML_TOKEN_STARTS_WITH ) ).rest();
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 8625L)
  public static SubLObject washpost_rest_harvest_one_restaurant(final SubLObject tokens)
  {
    SubLObject current = washpost_rest_advance_to_next_restaurant_url( tokens );
    SubLObject url = NIL;
    SubLObject name = NIL;
    SubLObject address = NIL;
    SubLObject phone_number = NIL;
    SubLObject directions = NIL;
    SubLObject cuisines = NIL;
    url = current.first();
    current = washpost_rest_advance_from_url_to_restaurant_name( current );
    if( NIL == current )
    {
      return Values.values( NIL, NIL );
    }
    name = string_utilities.trim_whitespace( current.first() );
    current = washpost_rest_advance_from_restaurant_name_to_address( current );
    if( NIL == current )
    {
      return Values.values( NIL, NIL );
    }
    address = string_utilities.trim_whitespace( current.first() );
    current = washpost_rest_advance_from_restaurant_address_to_phone_number( current );
    if( NIL == current )
    {
      return Values.values( NIL, NIL );
    }
    phone_number = string_utilities.trim_whitespace( current.first() );
    current = washpost_rest_advance_to_restaurant_map_url( current );
    if( NIL == current )
    {
      return Values.values( NIL, NIL );
    }
    directions = string_utilities.trim_whitespace( current.first() );
    current = washpost_rest_advance_to_restaurant_cuisines( current );
    if( NIL == current )
    {
      return Values.values( NIL, NIL );
    }
    cuisines = washpost_rest_convert_cuisine_encoding_to_cuisines( current.first() );
    return Values.values( ConsesLow.list( url, name, address, phone_number, directions, cuisines ), current );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 9961L)
  public static SubLObject print_washington_post_restaurant_information(final SubLObject information, SubLObject stream)
  {
    if( stream == UNPROVIDED )
    {
      stream = T;
    }
    SubLObject url = NIL;
    SubLObject name = NIL;
    SubLObject address = NIL;
    SubLObject phone_number = NIL;
    SubLObject directions = NIL;
    SubLObject cuisines = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( information, information, $list32 );
    url = information.first();
    SubLObject current = information.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, information, $list32 );
    name = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, information, $list32 );
    address = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, information, $list32 );
    phone_number = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, information, $list32 );
    directions = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, information, $list32 );
    cuisines = current.first();
    current = current.rest();
    if( NIL == current )
    {
      PrintLow.format( stream, $str33$The_Restaurant__A_with_the_addres, new SubLObject[] { name, address, phone_number
      } );
      SubLObject cdolist_list_var = cuisines;
      SubLObject cuisine = NIL;
      cuisine = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        PrintLow.format( stream, $str34$_____A__, cuisine );
        cdolist_list_var = cdolist_list_var.rest();
        cuisine = cdolist_list_var.first();
      }
      PrintLow.format( stream, $str35$More_information_under___ );
      PrintLow.format( stream, $str36$__URL___A__, url );
      PrintLow.format( stream, $str37$__Map___A__, directions );
    }
    else
    {
      cdestructuring_bind.cdestructuring_bind_error( information, $list32 );
    }
    return information;
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 10615L)
  public static SubLObject washpost_rest_convert_cuisine_encoding_to_cuisines(final SubLObject encoding)
  {
    final SubLObject position = Sequences.search( $washpost_rest_restaurant_cuisine_list_indicator$.getGlobalValue(), encoding, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject start_quote = Sequences.position( Characters.CHAR_quotation, encoding, Symbols.symbol_function( $sym38$CHAR_ ), Symbols.symbol_function( IDENTITY ), position, UNPROVIDED );
    final SubLObject end_quote = Sequences.position( Characters.CHAR_quotation, encoding, Symbols.symbol_function( $sym38$CHAR_ ), Symbols.symbol_function( IDENTITY ), Numbers.add( ONE_INTEGER, start_quote ),
        UNPROVIDED );
    final SubLObject cuisines_encoding = string_utilities.substring( encoding, Numbers.add( ONE_INTEGER, start_quote ), end_quote );
    SubLObject cuisines = NIL;
    SubLObject cdolist_list_var = string_utilities.split_string( cuisines_encoding, $washpost_rest_cuisine_encoding_separator_charset$.getGlobalValue() );
    SubLObject cuisine = NIL;
    cuisine = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_string_p( cuisine ) )
      {
        cuisines = ConsesLow.cons( cuisine, cuisines );
      }
      cdolist_list_var = cdolist_list_var.rest();
      cuisine = cdolist_list_var.first();
    }
    return Sequences.nreverse( cuisines );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11301L)
  public static SubLObject washpost_rest_harvest_cuisine_choices(final SubLObject tokens)
  {
    final SubLObject cuisine = washpost_rest_advance_to_cuisine_selector( tokens );
    final SubLObject information = washpost_rest_harvest_all_choices( cuisine );
    return Values.values( information, cuisine );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11588L)
  public static SubLObject washpost_rest_harvest_price_choices(final SubLObject tokens)
  {
    final SubLObject prices = washpost_rest_advance_to_price_selector( tokens );
    final SubLObject information = washpost_rest_harvest_all_choices( prices );
    return Values.values( information, prices );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 11824L)
  public static SubLObject washpost_rest_harvest_neighborhood_choices(final SubLObject tokens)
  {
    final SubLObject neighborhood = washpost_rest_advance_to_neighborhood_selector( tokens );
    final SubLObject information = washpost_rest_harvest_all_choices( neighborhood );
    return Values.values( information, neighborhood );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 12405L)
  public static SubLObject washpost_rest_harvest_all_choices(final SubLObject tokens)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject current = tokens.rest();
    SubLObject choices = NIL;
    while ( NIL != xml_parsing_utilities.xml_token_starts_with( current.first(), $washpost_rest_choices_empty_option_marker$.getGlobalValue() ))
    {
      final SubLObject option_string = current.first();
      if( NIL != xml_parsing_utilities.xml_token_starts_with( option_string, $washpost_rest_choices_option_marker$.getGlobalValue() ) )
      {
        thread.resetMultipleValues();
        final SubLObject option_value = extract_option_value_from_html_encoding( option_string );
        final SubLObject selectedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject choice = string_utilities.trim_whitespace( conses_high.second( current ) );
        choices = ConsesLow.cons( ConsesLow.list( option_value, choice, selectedP ), choices );
      }
      current = current.rest().rest();
    }
    return Sequences.nreverse( choices );
  }

  @SubLTranslatedFile.SubL(source = "cycl/sksi/sksi-widgets/washington-post-restaurants-widgets.lisp", position = 13203L)
  public static SubLObject extract_option_value_from_html_encoding(final SubLObject option_string)
  {
    SubLObject selectedP = NIL;
    SubLObject value = NIL;
    if( NIL == value )
    {
      SubLObject csome_list_var = $washpost_rest_option_quoting_chars$.getGlobalValue();
      SubLObject quote_char = NIL;
      quote_char = csome_list_var.first();
      while ( NIL == value && NIL != csome_list_var)
      {
        SubLObject start = NIL;
        SubLObject end = NIL;
        start = Sequences.position( quote_char, option_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        if( start.isFixnum() )
        {
          end = Sequences.position( quote_char, option_string, Symbols.symbol_function( $sym38$CHAR_ ), Symbols.symbol_function( IDENTITY ), Numbers.add( ONE_INTEGER, start ), UNPROVIDED );
          if( end.isFixnum() )
          {
            if( start.numE( end ) )
            {
              value = $str5$;
            }
            else
            {
              value = string_utilities.substring( option_string, Numbers.add( start, ONE_INTEGER ), end );
            }
            selectedP = Sequences.search( $washpost_rest_choices_option_selected_marker$.getGlobalValue(), option_string, Symbols.symbol_function( $sym42$CHAR_EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER,
                Sequences.length( $washpost_rest_choices_option_selected_marker$.getGlobalValue() ), Numbers.add( end, ONE_INTEGER ), UNPROVIDED );
          }
        }
        csome_list_var = csome_list_var.rest();
        quote_char = csome_list_var.first();
      }
    }
    return Values.values( value, selectedP );
  }

  public static SubLObject declare_washington_post_restaurants_widgets_file()
  {
    SubLFiles.declareFunction( me, "washpost_rest_get_all_restaurants_for_cuisine", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CUISINE", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_get_all_restaurants_for_price", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-PRICE", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_get_all_restaurants_for_neighborhood", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-NEIGHBORHOOD", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_get_all_restaurants_for_criteria", "WASHPOST-REST-GET-ALL-RESTAURANTS-FOR-CRITERIA", 0, 3, false );
    SubLFiles.declareFunction( me, "washpost_rest_perform_query_request", "WASHPOST-REST-PERFORM-QUERY-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_instantiate_query", "WASHPOST-REST-INSTANTIATE-QUERY", 3, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_update_cookie_stash", "WASHPOST-REST-UPDATE-COOKIE-STASH", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_parse_all_restaurants_request", "WASHPOST-REST-PARSE-ALL-RESTAURANTS-REQUEST", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_parse_selection_choices", "WASHPOST-REST-PARSE-SELECTION-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_cuisine_selector", "WASHPOST-REST-ADVANCE-TO-CUISINE-SELECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_price_selector", "WASHPOST-REST-ADVANCE-TO-PRICE-SELECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_neighborhood_selector", "WASHPOST-REST-ADVANCE-TO-NEIGHBORHOOD-SELECTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_past_choices", "WASHPOST-REST-ADVANCE-PAST-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_next_restaurant_url", "WASHPOST-REST-ADVANCE-TO-NEXT-RESTAURANT-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_from_url_to_restaurant_name", "WASHPOST-REST-ADVANCE-FROM-URL-TO-RESTAURANT-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_from_restaurant_name_to_address", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-NAME-TO-ADDRESS", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_from_restaurant_address_to_phone_number", "WASHPOST-REST-ADVANCE-FROM-RESTAURANT-ADDRESS-TO-PHONE-NUMBER", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_restaurant_map_url", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-MAP-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_advance_to_restaurant_cuisines", "WASHPOST-REST-ADVANCE-TO-RESTAURANT-CUISINES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_harvest_one_restaurant", "WASHPOST-REST-HARVEST-ONE-RESTAURANT", 1, 0, false );
    SubLFiles.declareFunction( me, "print_washington_post_restaurant_information", "PRINT-WASHINGTON-POST-RESTAURANT-INFORMATION", 1, 1, false );
    SubLFiles.declareFunction( me, "washpost_rest_convert_cuisine_encoding_to_cuisines", "WASHPOST-REST-CONVERT-CUISINE-ENCODING-TO-CUISINES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_harvest_cuisine_choices", "WASHPOST-REST-HARVEST-CUISINE-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_harvest_price_choices", "WASHPOST-REST-HARVEST-PRICE-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_harvest_neighborhood_choices", "WASHPOST-REST-HARVEST-NEIGHBORHOOD-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "washpost_rest_harvest_all_choices", "WASHPOST-REST-HARVEST-ALL-CHOICES", 1, 0, false );
    SubLFiles.declareFunction( me, "extract_option_value_from_html_encoding", "EXTRACT-OPTION-VALUE-FROM-HTML-ENCODING", 1, 0, false );
    return NIL;
  }

  public static SubLObject init_washington_post_restaurants_widgets_file()
  {
    $washpost_rest_request_port$ = SubLFiles.deflexical( "*WASHPOST-REST-REQUEST-PORT*", $int0$80 );
    $washpost_rest_request_method$ = SubLFiles.deflexical( "*WASHPOST-REST-REQUEST-METHOD*", $kw1$GET );
    $washpost_rest_request_machine$ = SubLFiles.deflexical( "*WASHPOST-REST-REQUEST-MACHINE*", $str2$www_washingtonpost_com );
    $washpost_rest_url_base$ = SubLFiles.deflexical( "*WASHPOST-REST-URL-BASE*", $str3$_ac2_wp_dyn );
    $washpost_rest_url_query_template$ = SubLFiles.deflexical( "*WASHPOST-REST-URL-QUERY-TEMPLATE*", $str4$node_entertainment_2Fsearch_type_ );
    $washpost_rest_wide_newlinesP$ = SubLFiles.deflexical( "*WASHPOST-REST-WIDE-NEWLINES?*", T );
    $washpost_rest_cookie_stash$ = SubLFiles.deflexical( "*WASHPOST-REST-COOKIE-STASH*", NIL );
    $washpost_rest_cuisine_selector$ = SubLFiles.deflexical( "*WASHPOST-REST-CUISINE-SELECTOR*", $str19$_select_name__cw1__ );
    $washpost_rest_price_selector$ = SubLFiles.deflexical( "*WASHPOST-REST-PRICE-SELECTOR*", $str20$_select_name__cw4__ );
    $washpost_rest_neighborhood_selector$ = SubLFiles.deflexical( "*WASHPOST-REST-NEIGHBORHOOD-SELECTOR*", $str21$_select_name__neighborhood__ );
    $washpost_rest_choices_end_selector$ = SubLFiles.deflexical( "*WASHPOST-REST-CHOICES-END-SELECTOR*", $str22$__form_ );
    $washpost_rest_website_restaurant_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-WEBSITE-RESTAURANT-INDICATOR*", $str24$_a_href___ac2_wp_dyn_node_enterta );
    $washpost_rest_restaurant_name_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-RESTAURANT-NAME-INDICATOR*", $str25$_b_ );
    $washpost_rest_restaurant_phone_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-RESTAURANT-PHONE-INDICATOR*", $str26$_br_ );
    $washpost_rest_restaurant_address_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-RESTAURANT-ADDRESS-INDICATOR*", $str27$_font_size___2_ );
    $washpost_rest_website_mapurl_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-WEBSITE-MAPURL-INDICATOR*", $str28$_a_href__http___eg_washingtonpost );
    $washpost_rest_restaurant_cuisine_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-RESTAURANT-CUISINE-INDICATOR*", $str29$_script );
    $washpost_rest_restaurant_cuisine_list_indicator$ = SubLFiles.deflexical( "*WASHPOST-REST-RESTAURANT-CUISINE-LIST-INDICATOR*", $str30$var_newname__ );
    $washpost_rest_cuisine_encoding_separator_charset$ = SubLFiles.deflexical( "*WASHPOST-REST-CUISINE-ENCODING-SEPARATOR-CHARSET*", ConsesLow.list( Characters.CHAR_comma, Characters.CHAR_space ) );
    $washpost_rest_choices_option_marker$ = SubLFiles.deflexical( "*WASHPOST-REST-CHOICES-OPTION-MARKER*", $str39$_option_value_ );
    $washpost_rest_choices_empty_option_marker$ = SubLFiles.deflexical( "*WASHPOST-REST-CHOICES-EMPTY-OPTION-MARKER*", $str40$_option );
    $washpost_rest_choices_option_selected_marker$ = SubLFiles.deflexical( "*WASHPOST-REST-CHOICES-OPTION-SELECTED-MARKER*", $str41$selected );
    $washpost_rest_option_quoting_chars$ = SubLFiles.deflexical( "*WASHPOST-REST-OPTION-QUOTING-CHARS*", ConsesLow.list( Characters.CHAR_quote, Characters.CHAR_quotation ) );
    return NIL;
  }

  public static SubLObject setup_washington_post_restaurants_widgets_file()
  {
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_washington_post_restaurants_widgets_file();
  }

  @Override
  public void initializeVariables()
  {
    init_washington_post_restaurants_widgets_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_washington_post_restaurants_widgets_file();
  }
  static
  {
    me = new washington_post_restaurants_widgets();
    $washpost_rest_request_port$ = null;
    $washpost_rest_request_method$ = null;
    $washpost_rest_request_machine$ = null;
    $washpost_rest_url_base$ = null;
    $washpost_rest_url_query_template$ = null;
    $washpost_rest_wide_newlinesP$ = null;
    $washpost_rest_cookie_stash$ = null;
    $washpost_rest_cuisine_selector$ = null;
    $washpost_rest_price_selector$ = null;
    $washpost_rest_neighborhood_selector$ = null;
    $washpost_rest_choices_end_selector$ = null;
    $washpost_rest_website_restaurant_indicator$ = null;
    $washpost_rest_restaurant_name_indicator$ = null;
    $washpost_rest_restaurant_phone_indicator$ = null;
    $washpost_rest_restaurant_address_indicator$ = null;
    $washpost_rest_website_mapurl_indicator$ = null;
    $washpost_rest_restaurant_cuisine_indicator$ = null;
    $washpost_rest_restaurant_cuisine_list_indicator$ = null;
    $washpost_rest_cuisine_encoding_separator_charset$ = null;
    $washpost_rest_choices_option_marker$ = null;
    $washpost_rest_choices_empty_option_marker$ = null;
    $washpost_rest_choices_option_selected_marker$ = null;
    $washpost_rest_option_quoting_chars$ = null;
    $int0$80 = makeInteger( 80 );
    $kw1$GET = makeKeyword( "GET" );
    $str2$www_washingtonpost_com = makeString( "www.washingtonpost.com" );
    $str3$_ac2_wp_dyn = makeString( "/ac2/wp-dyn" );
    $str4$node_entertainment_2Fsearch_type_ = makeString( "node=entertainment%2Fsearch&type=restaurants&query=&sort=recommended-desc&cw1=~A&cw4=~A&neighborhood=~A" );
    $str5$ = makeString( "" );
    $sym6$STRINGP = makeSymbol( "STRINGP" );
    $kw7$DEFAULT = makeKeyword( "DEFAULT" );
    $kw8$PRIVATE = makeKeyword( "PRIVATE" );
    $kw9$MACHINE = makeKeyword( "MACHINE" );
    $kw10$PORT = makeKeyword( "PORT" );
    $kw11$METHOD = makeKeyword( "METHOD" );
    $kw12$URL = makeKeyword( "URL" );
    $kw13$QUERY = makeKeyword( "QUERY" );
    $kw14$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw15$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw16$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw17$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw18$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $str19$_select_name__cw1__ = makeString( "<select name=\"cw1\">" );
    $str20$_select_name__cw4__ = makeString( "<select name=\"cw4\">" );
    $str21$_select_name__neighborhood__ = makeString( "<select name='neighborhood'>" );
    $str22$__form_ = makeString( "</form>" );
    $sym23$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $str24$_a_href___ac2_wp_dyn_node_enterta = makeString( "<a href=\"/ac2/wp-dyn?node=entertainment/profile" );
    $str25$_b_ = makeString( "<b>" );
    $str26$_br_ = makeString( "<br>" );
    $str27$_font_size___2_ = makeString( "<font size=\"-2\"" );
    $str28$_a_href__http___eg_washingtonpost = makeString( "<a href=\"http://eg.washingtonpost.com/map?" );
    $str29$_script = makeString( "<script" );
    $str30$var_newname__ = makeString( "var newname =" );
    $sym31$XML_TOKEN_STARTS_WITH = makeSymbol( "XML-TOKEN-STARTS-WITH" );
    $list32 = ConsesLow.list( makeSymbol( "URL" ), makeSymbol( "NAME" ), makeSymbol( "ADDRESS" ), makeSymbol( "PHONE-NUMBER" ), makeSymbol( "DIRECTIONS" ), makeSymbol( "CUISINES" ) );
    $str33$The_Restaurant__A_with_the_addres = makeString( "The Restaurant ~A with the address ~A and the phone number ~A serves the following cuisines: ~%" );
    $str34$_____A__ = makeString( "    ~A~%" );
    $str35$More_information_under___ = makeString( "More information under:~%" );
    $str36$__URL___A__ = makeString( "  URL: ~A~%" );
    $str37$__Map___A__ = makeString( "  Map: ~A~%" );
    $sym38$CHAR_ = makeSymbol( "CHAR=" );
    $str39$_option_value_ = makeString( "<option value=" );
    $str40$_option = makeString( "<option" );
    $str41$selected = makeString( "selected" );
    $sym42$CHAR_EQUAL = makeSymbol( "CHAR-EQUAL" );
  }
}
/*
 * 
 * Total time: 151 ms
 * 
 */