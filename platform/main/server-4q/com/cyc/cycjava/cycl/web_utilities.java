package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class web_utilities
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.web_utilities";
  public static final String myFingerPrint = "e8a293b02638d6fac9e53108ffaab3c2c4ac1dd7fd01bbf371d7481a5cdbcbf1";
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 805L)
  private static SubLSymbol $http_default_accept_types$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 884L)
  public static SubLSymbol $decode_urls_during_http_read_request$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5325L)
  private static SubLSymbol $http_alternate_uri_format_a_prefix$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5390L)
  private static SubLSymbol $html_alternate_uri_format_session_id_length$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5460L)
  private static SubLSymbol $html_cyc_login_session_string_to_remote_host$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 7710L)
  private static SubLSymbol $html_possibly_redirect_to_portal_script$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 8601L)
  private static SubLSymbol $http_informational_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 8881L)
  private static SubLSymbol $http_success_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 9262L)
  private static SubLSymbol $http_redirection_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 9685L)
  private static SubLSymbol $http_client_error_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 10433L)
  private static SubLSymbol $http_server_error_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 10806L)
  private static SubLSymbol $http_error_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 10917L)
  private static SubLSymbol $http_status_codes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 11924L)
  private static SubLSymbol $http_get_request_template_components$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13058L)
  private static SubLSymbol $http_get_request_template_order$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13173L)
  private static SubLSymbol $http_post_default_content_type$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13264L)
  private static SubLSymbol $http_post_request_template_components$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13708L)
  private static SubLSymbol $http_post_request_template_order$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13825L)
  private static SubLSymbol $http_put_default_content_type$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 13915L)
  private static SubLSymbol $http_put_request_template_components$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 14357L)
  private static SubLSymbol $http_put_request_template_order$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 14472L)
  private static SubLSymbol $http_delete_default_content_type$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 14565L)
  private static SubLSymbol $http_delete_request_template_components$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 15013L)
  private static SubLSymbol $http_delete_request_template_order$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 17919L)
  private static SubLSymbol $trace_http_send_post_requests$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 17979L)
  private static SubLSymbol $trace_http_send_put_requests$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18037L)
  private static SubLSymbol $trace_http_send_delete_requests$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18098L)
  public static SubLSymbol $http_cookies_to_include_in_requests$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 25217L)
  private static SubLSymbol $http_header_cookie_keyword$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26031L)
  private static SubLSymbol $http_cookie_separation_charset$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26098L)
  private static SubLSymbol $http_filtered_predefined_named_cookie_attributes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 36458L)
  private static SubLSymbol $official_uri_schemes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 36819L)
  private static SubLSymbol $unofficial_uri_schemes$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37656L)
  private static SubLSymbol $valid_url_beginnings$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37781L)
  private static SubLSymbol $url_delimiters$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 39594L)
  private static SubLSymbol $valid_non_alphanumeric_url_chars$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44144L)
  private static SubLSymbol $soap_envelope_uri$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
  private static SubLSymbol $soap_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
  private static SubLSymbol $soap_expanded_name_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
  private static SubLSymbol $perform_soap_post_cached_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 62579L)
  public static SubLSymbol $cgi_host$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 62652L)
  public static SubLSymbol $cgi_port$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 62688L)
  public static SubLSymbol $cgi_path$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 62800L)
  private static SubLSymbol $http_header_delimiter$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 62915L)
  private static SubLSymbol $http_header_field_delimiters$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
  private static SubLSymbol $byte_order_mark_caching_state$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67103L)
  private static SubLSymbol $alternate_servlet_container_port$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67191L)
  private static SubLSymbol $alternate_servlet_container_host$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68201L)
  private static SubLSymbol $local_servlet_container_runningP$;
  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  private static SubLSymbol $webapp_manifest_path$;
  private static final SubLList $list0;
  private static final SubLList $list1;
  private static final SubLList $list2;
  private static final SubLSymbol $kw3$ALLOW_OTHER_KEYS;
  private static final SubLSymbol $kw4$QUERY;
  private static final SubLSymbol $kw5$METHOD;
  private static final SubLSymbol $kw6$GET;
  private static final SubLSymbol $kw7$PORT;
  private static final SubLSymbol $kw8$DEFAULT;
  private static final SubLSymbol $kw9$KEEP_ALIVE_;
  private static final SubLSymbol $kw10$WIDE_NEWLINES_;
  private static final SubLSymbol $kw11$TIMEOUT;
  private static final SubLSymbol $kw12$ACCEPT_TYPES;
  private static final SubLSymbol $kw13$CONTENT_TYPE;
  private static final SubLSymbol $kw14$SOAP_ACTION_URI;
  private static final SubLSymbol $sym15$REAL_PORT;
  private static final SubLSymbol $sym16$CLET;
  private static final SubLSymbol $sym17$FIF;
  private static final SubLList $list18;
  private static final SubLInteger $int19$80;
  private static final SubLSymbol $sym20$WITH_TCP_CONNECTION;
  private static final SubLSymbol $kw21$ACCESS_MODE;
  private static final SubLSymbol $kw22$PRIVATE;
  private static final SubLSymbol $sym23$SEND_HTTP_REQUEST;
  private static final SubLSymbol $sym24$LIST;
  private static final SubLSymbol $kw25$MACHINE;
  private static final SubLSymbol $kw26$URL;
  private static final SubLString $str27$_a_;
  private static final SubLSymbol $sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_;
  private static final SubLString $str29$_;
  private static final SubLString $str30$_cg_;
  private static final SubLList $list31;
  private static final SubLString $str32$Remote_Host;
  private static final SubLString $str33$var_KEA_port_from_cyc_base_port__;
  private static final SubLList $list34;
  private static final SubLList $list35;
  private static final SubLList $list36;
  private static final SubLList $list37;
  private static final SubLList $list38;
  private static final SubLString $str39$HTTP_1_1_200_OK;
  private static final SubLString $str40$HTTP_1_1_;
  private static final SubLList $list41;
  private static final SubLSymbol $sym42$FIRST;
  private static final SubLString $str43$application_x_www_form_urlencoded;
  private static final SubLList $list44;
  private static final SubLList $list45;
  private static final SubLList $list46;
  private static final SubLSymbol $sym47$STREAMP;
  private static final SubLList $list48;
  private static final SubLList $list49;
  private static final SubLSymbol $sym50$KEYWORDP;
  private static final SubLSymbol $sym51$STRINGP;
  private static final SubLSymbol $sym52$POSITIVE_INTEGER_P;
  private static final SubLSymbol $sym53$NON_DOTTED_LIST_P;
  private static final SubLSymbol $kw54$POST;
  private static final SubLSymbol $kw55$PUT;
  private static final SubLSymbol $kw56$DELETE;
  private static final SubLString $str57$Unsupported_HTTP_request_method__;
  private static final SubLList $list58;
  private static final SubLList $list59;
  private static final SubLList $list60;
  private static final SubLSymbol $sym61$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_;
  private static final SubLList $list62;
  private static final SubLSymbol $kw63$VERSION;
  private static final SubLSymbol $kw64$ACCEPT;
  private static final SubLSymbol $kw65$CONNECTION;
  private static final SubLString $str66$Keep_Alive___S;
  private static final SubLString $str67$keep_alive;
  private static final SubLString $str68$close;
  private static final SubLSymbol $kw69$USER_AGENT;
  private static final SubLSymbol $kw70$HOST;
  private static final SubLString $str71$_;
  private static final SubLSymbol $kw72$BLANK_LINE;
  private static final SubLSymbol $kw73$COOKIES;
  private static final SubLSymbol $kw74$CONTENT_LENGTH;
  private static final SubLSymbol $kw75$SOAP_ACTION;
  private static final SubLString $str76$__;
  private static final SubLString $str77$_;
  private static final SubLString $str78$Date__;
  private static final SubLString $str79$Server__Cyc_;
  private static final SubLString $str80$__;
  private static final SubLString $str81$Set_Cookie_;
  private static final SubLSymbol $sym82$CHAR_;
  private static final SubLString $str83$domain;
  private static final SubLString $str84$expires;
  private static final SubLString $str85$max_age;
  private static final SubLString $str86$;
  private static final SubLString $str87$__;
  private static final SubLSymbol $sym88$EMPTY_STRING_P;
  private static final SubLSymbol $sym89$TRIM_WHITESPACE;
  private static final SubLSymbol $sym90$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS;
  private static final SubLSymbol $sym91$HTML_URL_EXPAND_CHAR;
  private static final SubLString $str92$____;
  private static final SubLInteger $int93$256;
  private static final SubLString $str94$_S;
  private static final SubLString $str95$mailto_;
  private static final SubLList $list96;
  private static final SubLSymbol $sym97$NON_EMPTY_STRING_P;
  private static final SubLList $list98;
  private static final SubLList $list99;
  private static final SubLList $list100;
  private static final SubLList $list101;
  private static final SubLSymbol $sym102$VALID_URL_CHAR_P;
  private static final SubLString $str103$_____________________;
  private static final SubLString $str104$___;
  private static final SubLString $str105$__;
  private static final SubLSymbol $sym106$RESOLVE_RELATIVE_URI;
  private static final SubLSymbol $kw107$TEST;
  private static final SubLSymbol $kw108$OWNER;
  private static final SubLSymbol $kw109$CLASSES;
  private static final SubLSymbol $kw110$KB;
  private static final SubLSymbol $kw111$TINY;
  private static final SubLSymbol $kw112$WORKING_;
  private static final SubLList $list113;
  private static final SubLString $str114$http___schemas_xmlsoap_org_soap_e;
  private static final SubLSymbol $sym115$SOAP_NAME;
  private static final SubLString $str116$soap_;
  private static final SubLSymbol $sym117$_SOAP_NAME_CACHING_STATE_;
  private static final SubLSymbol $sym118$SOAP_EXPANDED_NAME;
  private static final SubLSymbol $sym119$_SOAP_EXPANDED_NAME_CACHING_STATE_;
  private static final SubLString $str120$Envelope;
  private static final SubLSymbol $sym121$PERFORM_SOAP_POST_CACHED;
  private static final SubLSymbol $sym122$_PERFORM_SOAP_POST_CACHED_CACHING_STATE_;
  private static final SubLString $str123$text_xml__charset_utf_8;
  private static final SubLString $str124$US_ASCII;
  private static final SubLString $str125$xmlns_soap;
  private static final SubLString $str126$Header;
  private static final SubLList $list127;
  private static final SubLString $str128$xmlns;
  private static final SubLString $str129$Body;
  private static final SubLList $list130;
  private static final SubLString $str131$HTTP;
  private static final SubLString $str132$Location__;
  private static final SubLSymbol $sym133$WHITESPACEP;
  private static final SubLString $str134$http___;
  private static final SubLString $str135$https___;
  private static final SubLInteger $int136$100;
  private static final SubLList $list137;
  private static final SubLList $list138;
  private static final SubLSymbol $sym139$CATCH_ERROR_MESSAGE;
  private static final SubLSymbol $sym140$CATCH_ERROR_MESSAGE_HANDLER;
  private static final SubLString $str141$_____Averted__connection_reset_by;
  private static final SubLString $str142$0;
  private static final SubLString $str143$_GMT;
  private static final SubLList $list144;
  private static final SubLSymbol $sym145$MEMBER;
  private static final SubLList $list146;
  private static final SubLList $list147;
  private static final SubLSymbol $sym148$CSETQ;
  private static final SubLSymbol $sym149$CDR;
  private static final SubLSymbol $sym150$HTML_TOKENS_FAST_FORWARD;
  private static final SubLSymbol $sym151$CAR;
  private static final SubLList $list152;
  private static final SubLSymbol $sym153$MARKER;
  private static final SubLSymbol $sym154$HTML_TOKENS_EXTRACT_CURR;
  private static final SubLSymbol $sym155$PUNLESS;
  private static final SubLSymbol $sym156$STRING_EQUAL;
  private static final SubLSymbol $sym157$ERROR;
  private static final SubLString $str158$Invalid_input_file_format__Expect;
  private static final SubLSymbol $sym159$HTML_TOKENS_STEP;
  private static final SubLSymbol $sym160$MARKER;
  private static final SubLSymbol $sym161$IS_HTML_TERMINATING_TAG_;
  private static final SubLString $str162$Invalid_input_file_format__Expect;
  private static final SubLList $list163;
  private static final SubLSymbol $sym164$PROGN;
  private static final SubLSymbol $sym165$HTML_CONSUME_STARTING_TAG;
  private static final SubLSymbol $sym166$HTML_CONSUME_CLOSING_TAG;
  private static final SubLList $list167;
  private static final SubLSymbol $sym168$TEMP;
  private static final SubLSymbol $sym169$PWHEN;
  private static final SubLSymbol $sym170$TEST_FOR_HTML_TAG_;
  private static final SubLSymbol $sym171$HTML_EXTRACT_TAG_CONTENT;
  private static final SubLSymbol $kw172$INPUT;
  private static final SubLString $str173$Unable_to_open__S;
  private static final SubLSymbol $sym174$PROPERTY_LIST_P;
  private static final SubLString $str175$_;
  private static final SubLString $str176$_;
  private static final SubLSymbol $sym177$ALIST_P;
  private static final SubLList $list178;
  private static final SubLSymbol $sym179$MATCHING_OPEN_TAG_;
  private static final SubLList $list180;
  private static final SubLSymbol $sym181$MATCHING_CLOSE_TAG_;
  private static final SubLList $list182;
  private static final SubLString $str183$localhost;
  private static final SubLString $str184$_cgi_bin_services;
  private static final SubLSymbol $sym185$BYTE_ORDER_MARK;
  private static final SubLString $str186$_ufeff_;
  private static final SubLSymbol $sym187$_BYTE_ORDER_MARK_CACHING_STATE_;
  private static final SubLString $str188$___A__A_____;
  private static final SubLSymbol $sym189$HTML_ENCODE_SEXPR;
  private static final SubLSymbol $sym190$APPEND;
  private static final SubLList $list191;
  private static final SubLString $str192$file___;
  private static final SubLSymbol $sym193$FILE_EXISTS_;
  private static final SubLSymbol $kw194$OUTPUT;
  private static final SubLSymbol $sym195$START_SERVLET_CONTAINER_INT;
  private static final SubLSymbol $sym196$_EXIT;
  private static final SubLSymbol $sym197$START_SERVLET_CONTAINER;
  private static final SubLSymbol $kw198$SERVLET;
  private static final SubLList $list199;
  private static final SubLSymbol $sym200$STOP_SERVLET_CONTAINER_INT;
  private static final SubLSymbol $kw201$STOPPED;
  private static final SubLString $str202$cyc_servlet_container_tmp_dir_;
  private static final SubLString $str203$_;
  private static final SubLString $str204$webapps_apps_webapp_manifest_xml;
  private static final SubLString $str205$filename;
  private static final SubLString $str206$contextRoot;
  private static final SubLString $str207$webapp;
  private static final SubLString $str208$Unable_to_find_webapp_manifest_fi;

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 1046L)
  public static SubLObject with_http_request(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject channel = NIL;
    SubLObject machine = NIL;
    SubLObject url = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    channel = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    machine = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list1 );
    url = current.first();
    current = current.rest();
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = current;
    SubLObject bad = NIL;
    SubLObject current_$1 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      current_$1 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list1 );
      if( NIL == conses_high.member( current_$1, $list2, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$1 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( datum, $list1 );
    }
    final SubLObject query_tail = cdestructuring_bind.property_list_member( $kw4$QUERY, current );
    final SubLObject query = ( NIL != query_tail ) ? conses_high.cadr( query_tail ) : NIL;
    final SubLObject method_tail = cdestructuring_bind.property_list_member( $kw5$METHOD, current );
    final SubLObject method = ( NIL != method_tail ) ? conses_high.cadr( method_tail ) : $kw6$GET;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw7$PORT, current );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $kw8$DEFAULT;
    final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member( $kw9$KEEP_ALIVE_, current );
    final SubLObject keep_aliveP = ( NIL != keep_aliveP_tail ) ? conses_high.cadr( keep_aliveP_tail ) : T;
    final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member( $kw10$WIDE_NEWLINES_, current );
    final SubLObject wide_newlinesP = ( NIL != wide_newlinesP_tail ) ? conses_high.cadr( wide_newlinesP_tail ) : NIL;
    final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw11$TIMEOUT, current );
    final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : NIL;
    final SubLObject accept_types_tail = cdestructuring_bind.property_list_member( $kw12$ACCEPT_TYPES, current );
    final SubLObject accept_types = ( NIL != accept_types_tail ) ? conses_high.cadr( accept_types_tail ) : $kw8$DEFAULT;
    final SubLObject content_type_tail = cdestructuring_bind.property_list_member( $kw13$CONTENT_TYPE, current );
    final SubLObject content_type = ( NIL != content_type_tail ) ? conses_high.cadr( content_type_tail ) : $kw8$DEFAULT;
    final SubLObject soap_action_uri_tail = cdestructuring_bind.property_list_member( $kw14$SOAP_ACTION_URI, current );
    final SubLObject soap_action_uri = ( NIL != soap_action_uri_tail ) ? conses_high.cadr( soap_action_uri_tail ) : NIL;
    final SubLObject body;
    current = ( body = temp );
    final SubLObject real_port = $sym15$REAL_PORT;
    return ConsesLow.list( $sym16$CLET, ConsesLow.list( ConsesLow.list( real_port, ConsesLow.list( $sym17$FIF, ConsesLow.listS( EQL, port, $list18 ), $int19$80, port ) ) ), ConsesLow.listS( $sym20$WITH_TCP_CONNECTION,
        ConsesLow.list( channel, machine, real_port, $kw21$ACCESS_MODE, $kw22$PRIVATE, $kw11$TIMEOUT, timeout ), ConsesLow.list( $sym23$SEND_HTTP_REQUEST, channel, ConsesLow.list( new SubLObject[]
        { $sym24$LIST, $kw25$MACHINE, machine, $kw7$PORT, port, $kw5$METHOD, method, $kw26$URL, url, $kw4$QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $kw12$ACCEPT_TYPES,
          accept_types, $kw13$CONTENT_TYPE, content_type, $kw14$SOAP_ACTION_URI, soap_action_uri
        } ) ), ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 2468L)
  public static SubLObject http_read_request(final SubLObject instream, SubLObject parse_header)
  {
    if( parse_header == UNPROVIDED )
    {
      parse_header = NIL;
    }
    SubLObject request_header = NIL;
    SubLObject done = NIL;
    SubLObject method = NIL;
    SubLObject version = NIL;
    SubLObject uri = NIL;
    SubLObject line = NIL;
    line = string_utilities.network_read_line( instream, NIL, NIL, UNPROVIDED );
    if( NIL == line )
    {
      return NIL;
    }
    final SubLObject first_space = Sequences.position( Characters.CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject last_space = list_utilities.position_from_end( Characters.CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( first_space.eql( last_space ) )
    {
      last_space = NIL;
    }
    if( NIL != first_space )
    {
      method = string_utilities.substring( line, ZERO_INTEGER, first_space );
      uri = ( ( NIL != $decode_urls_during_http_read_request$.getGlobalValue() ) ? html_url_decode( string_utilities.substring( line, number_utilities.f_1X( first_space ), last_space ) )
          : string_utilities.substring( line, number_utilities.f_1X( first_space ), last_space ) );
      if( NIL != last_space )
      {
        version = string_utilities.substring( line, number_utilities.f_1X( last_space ), UNPROVIDED );
      }
    }
    if( NIL != parse_header )
    {
      while ( NIL == done)
      {
        line = string_utilities.network_read_line( instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED );
        if( line.equal( string_utilities.$empty_string$.getGlobalValue() ) )
        {
          done = T;
        }
        else if( Strings.sublisp_char( line, ZERO_INTEGER ).eql( Characters.CHAR_space ) || Strings.sublisp_char( line, ZERO_INTEGER ).eql( Characters.CHAR_tab ) )
        {
          if( NIL == request_header )
          {
            continue;
          }
          final SubLObject old_field = request_header.first();
          ConsesLow.rplacd( old_field, Sequences.cconcatenate( old_field.rest(), line ) );
        }
        else
        {
          final SubLObject colon = Sequences.position( Characters.CHAR_colon, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
          if( NIL == colon )
          {
            continue;
          }
          request_header = ConsesLow.cons( ConsesLow.cons( string_utilities.substring( line, ZERO_INTEGER, Numbers.subtract( colon, ZERO_INTEGER ) ), string_utilities.trim_whitespace( string_utilities.substring( line,
              Numbers.add( colon, ONE_INTEGER ), UNPROVIDED ) ) ), request_header );
        }
      }
    }
    else
    {
      while ( !line.equal( string_utilities.$empty_string$.getGlobalValue() ))
      {
        line = string_utilities.network_read_line( instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED );
      }
    }
    return http_possibly_repack_request( method, uri, version, request_header );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5553L)
  public static SubLObject make_html_cyc_login_session()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject session_id = string_utilities.random_string( $html_alternate_uri_format_session_id_length$.getGlobalValue() );
    dictionary.dictionary_enter( $html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, html_kernel.$http_remote_host$.getDynamicValue( thread ) );
    return session_id;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5811L)
  public static SubLObject destroy_cyc_login_session(final SubLObject session_id)
  {
    return dictionary.dictionary_remove( $html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5956L)
  public static SubLObject cyc_login_session_id_machine_name(final SubLObject session_id)
  {
    return dictionary.dictionary_lookup_without_values( $html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6124L)
  public static SubLObject valid_html_cyc_login_session_idP(final SubLObject possible_session_string)
  {
    return makeBoolean( possible_session_string.isString() && NIL != list_utilities.lengthE( possible_session_string, $html_alternate_uri_format_session_id_length$.getGlobalValue(), UNPROVIDED )
        && NIL != string_utilities.alphabetic_stringP( possible_session_string ) && NIL != string_utilities.lower_case_string_p( possible_session_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6441L)
  public static SubLObject current_html_cyc_login_session_idP(final SubLObject possible_session_string)
  {
    return dictionary.dictionary_lookup_without_values( $html_cyc_login_session_string_to_remote_host$.getGlobalValue(), possible_session_string, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6636L)
  public static SubLObject http_possibly_repack_request(final SubLObject method, SubLObject uri, final SubLObject version, SubLObject request_header)
  {
    if( NIL != string_utilities.starts_with( uri, $http_alternate_uri_format_a_prefix$.getGlobalValue() ) )
    {
      uri = string_utilities.string_substitute( $str29$_, $str30$_cg_, uri, UNPROVIDED );
      final SubLObject q_pos = Sequences.position( Characters.CHAR_question, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      final SubLObject a_pos = Sequences.position( Characters.CHAR_ampersand, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != q_pos && ( NIL == a_pos || !a_pos.numL( q_pos ) ) )
      {
        Vectors.set_aref( uri, q_pos, Characters.CHAR_ampersand );
      }
      SubLObject uri_parts = conses_high.cddr( string_utilities.string_tokenize( uri, $list31, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
      SubLObject session_string = NIL;
      SubLObject new_uri = NIL;
      if( NIL != current_html_cyc_login_session_idP( uri_parts.first() ) )
      {
        session_string = uri_parts.first();
        request_header = list_utilities.alist_enter( request_header, $str32$Remote_Host, session_string, Symbols.symbol_function( EQUAL ) );
        uri_parts = uri_parts.rest();
      }
      new_uri = Sequences.cconcatenate( http_kernel.$http_cgi_bin_directory$.getGlobalValue(), new SubLObject[] { $str29$_, string_utilities.bunge( uri_parts, Characters.CHAR_slash )
      } );
      return Values.values( method, new_uri, version, request_header );
    }
    return Values.values( method, uri, version, request_header );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 7584L)
  public static SubLObject within_html_cyc_login_sessionP()
  {
    return valid_html_cyc_login_session_idP( html_kernel.http_state_key_for_request() );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 8358L)
  public static SubLObject possibly_add_html_javascript_redirect_when_top_level_page()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != within_html_cyc_login_sessionP() )
    {
      html_utilities.html_source_readability_terpri( UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_script_head$.getGlobalValue() );
      html_utilities.html_markup( html_macros.$html_script_language$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_markup( html_macros.$html_script_javascript$.getGlobalValue() );
      html_utilities.html_char( Characters.CHAR_quotation, UNPROVIDED );
      html_utilities.html_char( Characters.CHAR_greater, UNPROVIDED );
      final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding( thread );
      try
      {
        html_macros.$html_safe_print$.bind( T, thread );
        PrintLow.format( html_macros.$html_stream$.getDynamicValue( thread ), $html_possibly_redirect_to_portal_script$.getGlobalValue(), html_kernel.http_state_key_for_request() );
        html_utilities.html_source_readability_terpri( UNPROVIDED );
      }
      finally
      {
        html_macros.$html_safe_print$.rebind( _prev_bind_0, thread );
      }
      html_utilities.html_markup( html_macros.$html_script_tail$.getGlobalValue() );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 11112L)
  public static SubLObject http_send_ok_response(final SubLObject outstream, final SubLObject header_fields)
  {
    streams_high.write_string( $str39$HTTP_1_1_200_OK, outstream, UNPROVIDED, UNPROVIDED );
    http_network_terpri( outstream );
    http_send_response_header( outstream, header_fields );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 11571L)
  public static SubLObject http_send_error_response(final SubLObject outstream, final SubLObject error_code, final SubLObject header_fields)
  {
    streams_high.write_string( $str40$HTTP_1_1_, outstream, UNPROVIDED, UNPROVIDED );
    print_high.princ( error_code, outstream );
    streams_high.write_char( Characters.CHAR_space, outstream );
    streams_high.write_string( conses_high.assoc( error_code, $http_error_codes$.getGlobalValue(), UNPROVIDED, UNPROVIDED ).rest(), outstream, UNPROVIDED, UNPROVIDED );
    http_network_terpri( outstream );
    http_send_response_header( outstream, header_fields );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 15134L)
  public static SubLObject send_http_request(final SubLObject channel, final SubLObject v_properties)
  {
    assert NIL != Types.streamp( channel ) : channel;
    SubLObject allow_other_keys_p = NIL;
    SubLObject rest = v_properties;
    SubLObject bad = NIL;
    SubLObject current_$2 = NIL;
    while ( NIL != rest)
    {
      cdestructuring_bind.destructuring_bind_must_consp( rest, v_properties, $list48 );
      current_$2 = rest.first();
      rest = rest.rest();
      cdestructuring_bind.destructuring_bind_must_consp( rest, v_properties, $list48 );
      if( NIL == conses_high.member( current_$2, $list49, UNPROVIDED, UNPROVIDED ) )
      {
        bad = T;
      }
      if( current_$2 == $kw3$ALLOW_OTHER_KEYS )
      {
        allow_other_keys_p = rest.first();
      }
      rest = rest.rest();
    }
    if( NIL != bad && NIL == allow_other_keys_p )
    {
      cdestructuring_bind.cdestructuring_bind_error( v_properties, $list48 );
    }
    final SubLObject machine_tail = cdestructuring_bind.property_list_member( $kw25$MACHINE, v_properties );
    final SubLObject machine = ( NIL != machine_tail ) ? conses_high.cadr( machine_tail ) : NIL;
    final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw7$PORT, v_properties );
    final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $int19$80;
    final SubLObject method_tail = cdestructuring_bind.property_list_member( $kw5$METHOD, v_properties );
    final SubLObject method = ( NIL != method_tail ) ? conses_high.cadr( method_tail ) : $kw6$GET;
    final SubLObject url_tail = cdestructuring_bind.property_list_member( $kw26$URL, v_properties );
    final SubLObject url = ( NIL != url_tail ) ? conses_high.cadr( url_tail ) : NIL;
    final SubLObject query_tail = cdestructuring_bind.property_list_member( $kw4$QUERY, v_properties );
    final SubLObject query = ( NIL != query_tail ) ? conses_high.cadr( query_tail ) : NIL;
    final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member( $kw9$KEEP_ALIVE_, v_properties );
    final SubLObject keep_aliveP = ( NIL != keep_aliveP_tail ) ? conses_high.cadr( keep_aliveP_tail ) : T;
    final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member( $kw10$WIDE_NEWLINES_, v_properties );
    final SubLObject wide_newlinesP = ( NIL != wide_newlinesP_tail ) ? conses_high.cadr( wide_newlinesP_tail ) : NIL;
    final SubLObject accept_types_tail = cdestructuring_bind.property_list_member( $kw12$ACCEPT_TYPES, v_properties );
    final SubLObject accept_types = ( NIL != accept_types_tail ) ? conses_high.cadr( accept_types_tail ) : $kw8$DEFAULT;
    final SubLObject content_type_tail = cdestructuring_bind.property_list_member( $kw13$CONTENT_TYPE, v_properties );
    final SubLObject content_type = ( NIL != content_type_tail ) ? conses_high.cadr( content_type_tail ) : $kw8$DEFAULT;
    final SubLObject soap_action_uri_tail = cdestructuring_bind.property_list_member( $kw14$SOAP_ACTION_URI, v_properties );
    final SubLObject soap_action_uri = ( NIL != soap_action_uri_tail ) ? conses_high.cadr( soap_action_uri_tail ) : NIL;
    http_request_internal( channel, method, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri );
    streams_high.force_output( channel );
    return channel;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 15703L)
  public static SubLObject http_request_internal(final SubLObject out_stream, final SubLObject method, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query,
      final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw8$DEFAULT;
    }
    if( content_type == UNPROVIDED )
    {
      content_type = $kw8$DEFAULT;
    }
    if( soap_action_uri == UNPROVIDED )
    {
      soap_action_uri = NIL;
    }
    assert NIL != Types.keywordp( method ) : method;
    assert NIL != Types.stringp( machine ) : machine;
    if( !port.eql( $kw8$DEFAULT ) && !assertionsDisabledInClass && NIL == subl_promotions.positive_integer_p( port ) )
    {
      throw new AssertionError( port );
    }
    assert NIL != Types.stringp( url ) : url;
    if( accept_types.eql( $kw8$DEFAULT ) )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    final SubLObject list_var = accept_types;
    assert NIL != list_utilities.non_dotted_list_p( list_var ) : list_var;
    SubLObject cdolist_list_var = list_var;
    SubLObject elem = NIL;
    elem = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      assert NIL != Types.stringp( elem ) : elem;
      cdolist_list_var = cdolist_list_var.rest();
      elem = cdolist_list_var.first();
    }
    if( method.eql( $kw6$GET ) )
    {
      http_send_get_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types );
    }
    else if( method.eql( $kw54$POST ) )
    {
      assert NIL != Types.stringp( query ) : query;
      if( content_type.eql( $kw8$DEFAULT ) )
      {
        content_type = $http_post_default_content_type$.getGlobalValue();
      }
      http_send_post_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri );
    }
    else if( method.eql( $kw55$PUT ) )
    {
      assert NIL != Types.stringp( query ) : query;
      if( content_type.eql( $kw8$DEFAULT ) )
      {
        content_type = $http_put_default_content_type$.getGlobalValue();
      }
      http_send_put_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri );
    }
    else if( method.eql( $kw56$DELETE ) )
    {
      assert NIL != Types.stringp( query ) : query;
      if( content_type.eql( $kw8$DEFAULT ) )
      {
        content_type = $http_delete_default_content_type$.getGlobalValue();
      }
      http_send_delete_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri );
    }
    else
    {
      Errors.error( $str57$Unsupported_HTTP_request_method__, method );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 17305L)
  public static SubLObject test_http_request(final SubLObject machine, final SubLObject url, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    SubLObject result = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      final SubLObject current;
      final SubLObject datum = current = v_properties;
      SubLObject allow_other_keys_p = NIL;
      SubLObject rest = current;
      SubLObject bad = NIL;
      SubLObject current_$3 = NIL;
      while ( NIL != rest)
      {
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list58 );
        current_$3 = rest.first();
        rest = rest.rest();
        cdestructuring_bind.destructuring_bind_must_consp( rest, datum, $list58 );
        if( NIL == conses_high.member( current_$3, $list59, UNPROVIDED, UNPROVIDED ) )
        {
          bad = T;
        }
        if( current_$3 == $kw3$ALLOW_OTHER_KEYS )
        {
          allow_other_keys_p = rest.first();
        }
        rest = rest.rest();
      }
      if( NIL != bad && NIL == allow_other_keys_p )
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list58 );
      }
      final SubLObject query_tail = cdestructuring_bind.property_list_member( $kw4$QUERY, current );
      final SubLObject query = ( NIL != query_tail ) ? conses_high.cadr( query_tail ) : NIL;
      final SubLObject method_tail = cdestructuring_bind.property_list_member( $kw5$METHOD, current );
      final SubLObject method = ( NIL != method_tail ) ? conses_high.cadr( method_tail ) : $kw6$GET;
      final SubLObject port_tail = cdestructuring_bind.property_list_member( $kw7$PORT, current );
      final SubLObject port = ( NIL != port_tail ) ? conses_high.cadr( port_tail ) : $kw8$DEFAULT;
      final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member( $kw9$KEEP_ALIVE_, current );
      final SubLObject keep_aliveP = ( NIL != keep_aliveP_tail ) ? conses_high.cadr( keep_aliveP_tail ) : T;
      final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member( $kw10$WIDE_NEWLINES_, current );
      final SubLObject wide_newlinesP = ( NIL != wide_newlinesP_tail ) ? conses_high.cadr( wide_newlinesP_tail ) : NIL;
      final SubLObject timeout_tail = cdestructuring_bind.property_list_member( $kw11$TIMEOUT, current );
      final SubLObject timeout = ( NIL != timeout_tail ) ? conses_high.cadr( timeout_tail ) : NIL;
      final SubLObject accept_types_tail = cdestructuring_bind.property_list_member( $kw12$ACCEPT_TYPES, current );
      final SubLObject accept_types = ( NIL != accept_types_tail ) ? conses_high.cadr( accept_types_tail ) : $kw8$DEFAULT;
      send_http_request( stream, ConsesLow.list( new SubLObject[] { $kw25$MACHINE, machine, $kw7$PORT, port, $kw5$METHOD, method, $kw26$URL, url, $kw4$QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_,
        wide_newlinesP, $kw12$ACCEPT_TYPES, accept_types
      } ) );
      result = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return result;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18165L)
  public static SubLObject http_with_cookies(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    final SubLObject temp = current.rest();
    current = current.first();
    SubLObject cookie_list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list60 );
    cookie_list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject body;
      current = ( body = temp );
      return ConsesLow.listS( $sym16$CLET, ConsesLow.list( ConsesLow.list( $sym61$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_, cookie_list ) ), ConsesLow.append( body, NIL ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list60 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18320L)
  public static SubLObject get_current_cookies_for_request()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $http_cookies_to_include_in_requests$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18419L)
  public static SubLObject http_send_generic_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, final SubLObject template, final SubLObject template_order, final SubLObject tracer, final SubLObject content_type, SubLObject accept_types, SubLObject soap_action_uri)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    if( soap_action_uri == UNPROVIDED )
    {
      soap_action_uri = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject original_stream = out_stream;
    if( NIL != tracer )
    {
      out_stream = streams_high.make_broadcast_stream( ConsesLow.list( out_stream, StreamsLow.$standard_output$.getDynamicValue( thread ) ) );
    }
    final SubLObject length = Sequences.length( query );
    SubLObject cdolist_list_var = template_order;
    SubLObject command = NIL;
    command = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rule = conses_high.assoc( command, template, UNPROVIDED, UNPROVIDED );
      SubLObject skippedP = NIL;
      SubLObject current;
      final SubLObject datum = current = rule;
      SubLObject action = NIL;
      SubLObject format_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      action = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      format_string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pcase_var = action;
        if( pcase_var.eql( $kw63$VERSION ) )
        {
          PrintLow.format( out_stream, format_string, url );
        }
        else if( pcase_var.eql( $kw64$ACCEPT ) )
        {
          http_output_accept_types( out_stream, format_string, accept_types );
        }
        else if( pcase_var.eql( $kw65$CONNECTION ) )
        {
          if( keep_aliveP.isInteger() )
          {
            PrintLow.format( out_stream, $str66$Keep_Alive___S, keep_aliveP );
            if( NIL != wide_newlinesP )
            {
              string_utilities.network_terpri( out_stream );
            }
            else
            {
              streams_high.terpri( out_stream );
            }
          }
          PrintLow.format( out_stream, format_string, ( NIL != keep_aliveP ) ? $str67$keep_alive : $str68$close );
        }
        else if( pcase_var.eql( $kw69$USER_AGENT ) )
        {
          PrintLow.format( out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue( thread ) );
        }
        else if( pcase_var.eql( $kw70$HOST ) )
        {
          PrintLow.format( out_stream, format_string, machine, port.eql( $kw8$DEFAULT ) ? string_utilities.$empty_string$.getGlobalValue() : Sequences.cconcatenate( $str71$_, format_nil.format_nil_a_no_copy( port ) ) );
        }
        else if( !pcase_var.eql( $kw72$BLANK_LINE ) )
        {
          if( pcase_var.eql( $kw73$COOKIES ) )
          {
            if( NIL == get_current_cookies_for_request() )
            {
              skippedP = T;
            }
            else
            {
              SubLObject cdolist_list_var_$4 = get_current_cookies_for_request();
              SubLObject cookie_string = NIL;
              cookie_string = cdolist_list_var_$4.first();
              while ( NIL != cdolist_list_var_$4)
              {
                PrintLow.format( out_stream, format_string, cookie_string );
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                cookie_string = cdolist_list_var_$4.first();
              }
            }
          }
          else if( pcase_var.eql( $kw13$CONTENT_TYPE ) )
          {
            PrintLow.format( out_stream, format_string, content_type );
          }
          else if( pcase_var.eql( $kw74$CONTENT_LENGTH ) )
          {
            PrintLow.format( out_stream, format_string, length );
          }
          else if( pcase_var.eql( $kw75$SOAP_ACTION ) )
          {
            if( NIL != soap_action_uri )
            {
              PrintLow.format( out_stream, format_string, soap_action_uri );
            }
            else
            {
              skippedP = T;
            }
          }
          else if( pcase_var.eql( $kw4$QUERY ) )
          {
            PrintLow.format( out_stream, format_string, query );
          }
          else if( format_string.isString() )
          {
            streams_high.write_string( format_string, out_stream, UNPROVIDED, UNPROVIDED );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
      }
      if( NIL == skippedP )
      {
        if( NIL != wide_newlinesP )
        {
          string_utilities.network_terpri( out_stream );
        }
        else
        {
          streams_high.terpri( out_stream );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      command = cdolist_list_var.first();
    }
    if( NIL != tracer )
    {
      streams_high.force_output( T );
    }
    return original_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 20636L)
  public static SubLObject http_send_post_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    if( content_type == UNPROVIDED )
    {
      content_type = $http_post_default_content_type$.getGlobalValue();
    }
    if( soap_action_uri == UNPROVIDED )
    {
      soap_action_uri = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return http_send_generic_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_post_request_template_components$.getGlobalValue(), $http_post_request_template_order$.getGlobalValue(),
        $trace_http_send_post_requests$.getDynamicValue( thread ), content_type, accept_types, soap_action_uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 21182L)
  public static SubLObject http_send_put_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    if( content_type == UNPROVIDED )
    {
      content_type = $http_put_default_content_type$.getGlobalValue();
    }
    if( soap_action_uri == UNPROVIDED )
    {
      soap_action_uri = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return http_send_generic_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_put_request_template_components$.getGlobalValue(), $http_put_request_template_order$.getGlobalValue(),
        $trace_http_send_put_requests$.getDynamicValue( thread ), content_type, accept_types, soap_action_uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 21723L)
  public static SubLObject http_send_delete_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    if( content_type == UNPROVIDED )
    {
      content_type = $http_put_default_content_type$.getGlobalValue();
    }
    if( soap_action_uri == UNPROVIDED )
    {
      soap_action_uri = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    return http_send_generic_request( out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_delete_request_template_components$.getGlobalValue(), $http_delete_request_template_order$.getGlobalValue(),
        $trace_http_send_delete_requests$.getDynamicValue( thread ), content_type, accept_types, soap_action_uri );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 22398L)
  public static SubLObject http_output_accept_types(final SubLObject out_stream, final SubLObject format_string, final SubLObject accept_types)
  {
    PrintLow.format( out_stream, format_string );
    SubLObject done_oneP = NIL;
    SubLObject cdolist_list_var = accept_types;
    SubLObject type = NIL;
    type = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL != done_oneP )
      {
        print_high.princ( $str76$__, out_stream );
      }
      print_high.princ( type, out_stream );
      done_oneP = T;
      cdolist_list_var = cdolist_list_var.rest();
      type = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 22697L)
  public static SubLObject http_send_get_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP,
      final SubLObject wide_newlinesP, SubLObject accept_types)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $http_default_accept_types$.getGlobalValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject original_stream = out_stream;
    if( NIL != $trace_http_send_post_requests$.getDynamicValue( thread ) )
    {
      out_stream = streams_high.make_broadcast_stream( ConsesLow.list( out_stream, StreamsLow.$standard_output$.getDynamicValue( thread ) ) );
    }
    SubLObject full_url = url;
    if( NIL != string_utilities.non_empty_string_p( query ) )
    {
      full_url = Sequences.cconcatenate( full_url, new SubLObject[] { $str77$_, query
      } );
    }
    SubLObject cdolist_list_var = $http_get_request_template_order$.getGlobalValue();
    SubLObject command = NIL;
    command = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject rule = conses_high.assoc( command, $http_get_request_template_components$.getGlobalValue(), UNPROVIDED, UNPROVIDED );
      SubLObject skippedP = NIL;
      SubLObject current;
      final SubLObject datum = current = rule;
      SubLObject action = NIL;
      SubLObject format_string = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      action = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list62 );
      format_string = current.first();
      current = current.rest();
      if( NIL == current )
      {
        final SubLObject pcase_var = action;
        if( pcase_var.eql( $kw63$VERSION ) )
        {
          PrintLow.format( out_stream, format_string, full_url );
        }
        else if( pcase_var.eql( $kw64$ACCEPT ) )
        {
          http_output_accept_types( out_stream, format_string, accept_types );
        }
        else if( pcase_var.eql( $kw65$CONNECTION ) )
        {
          if( keep_aliveP.isInteger() )
          {
            PrintLow.format( out_stream, $str66$Keep_Alive___S, keep_aliveP );
            if( NIL != wide_newlinesP )
            {
              string_utilities.network_terpri( out_stream );
            }
            else
            {
              streams_high.terpri( out_stream );
            }
          }
          PrintLow.format( out_stream, format_string, ( NIL != keep_aliveP ) ? $str67$keep_alive : $str68$close );
        }
        else if( pcase_var.eql( $kw69$USER_AGENT ) )
        {
          PrintLow.format( out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue( thread ) );
        }
        else if( pcase_var.eql( $kw73$COOKIES ) )
        {
          if( NIL == get_current_cookies_for_request() )
          {
            skippedP = T;
          }
          else
          {
            SubLObject cdolist_list_var_$5 = get_current_cookies_for_request();
            SubLObject cookie_string = NIL;
            cookie_string = cdolist_list_var_$5.first();
            while ( NIL != cdolist_list_var_$5)
            {
              PrintLow.format( out_stream, format_string, cookie_string );
              cdolist_list_var_$5 = cdolist_list_var_$5.rest();
              cookie_string = cdolist_list_var_$5.first();
            }
          }
        }
        else if( pcase_var.eql( $kw70$HOST ) )
        {
          PrintLow.format( out_stream, format_string, machine, port.eql( $kw8$DEFAULT ) ? string_utilities.$empty_string$.getGlobalValue() : Sequences.cconcatenate( $str71$_, format_nil.format_nil_a_no_copy( port ) ) );
        }
        else if( !pcase_var.eql( $kw72$BLANK_LINE ) )
        {
          if( format_string.isString() )
          {
            streams_high.write_string( format_string, out_stream, UNPROVIDED, UNPROVIDED );
          }
        }
      }
      else
      {
        cdestructuring_bind.cdestructuring_bind_error( datum, $list62 );
      }
      if( NIL == skippedP )
      {
        if( NIL != wide_newlinesP )
        {
          string_utilities.network_terpri( out_stream );
        }
        else
        {
          streams_high.terpri( out_stream );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      command = cdolist_list_var.first();
    }
    if( NIL != $trace_http_send_post_requests$.getDynamicValue( thread ) )
    {
      streams_high.force_output( T );
    }
    return original_stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 24594L)
  public static SubLObject http_send_response_header(final SubLObject outstream, final SubLObject header_fields)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    streams_high.write_string( $str78$Date__, outstream, UNPROVIDED, UNPROVIDED );
    write_http_date( outstream, UNPROVIDED );
    http_network_terpri( outstream );
    streams_high.write_string( $str79$Server__Cyc_, outstream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( system_info.cyc_revision_string(), outstream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str29$_, outstream, UNPROVIDED, UNPROVIDED );
    print_high.princ( system_parameters.$base_tcp_port$.getDynamicValue( thread ), outstream );
    http_network_terpri( outstream );
    SubLObject cdolist_list_var = header_fields;
    SubLObject field = NIL;
    field = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      streams_high.write_string( field.first(), outstream, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str80$__, outstream, UNPROVIDED, UNPROVIDED );
      print_high.princ( field.rest(), outstream );
      http_network_terpri( outstream );
      cdolist_list_var = cdolist_list_var.rest();
      field = cdolist_list_var.first();
    }
    http_network_terpri( outstream );
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 25284L)
  public static SubLObject http_extract_cookies_from_reply_header(final SubLObject string)
  {
    SubLObject position = ZERO_INTEGER;
    SubLObject cookie_information = NIL;
    while ( position.isFixnum())
    {
      position = Sequences.search( $http_header_cookie_keyword$.getGlobalValue(), string, Symbols.symbol_function( $sym82$CHAR_ ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, position, UNPROVIDED );
      if( position.isFixnum() )
      {
        final SubLObject end_position = Sequences.position( Characters.CHAR_return, string, Symbols.symbol_function( $sym82$CHAR_ ), Symbols.symbol_function( IDENTITY ), position, UNPROVIDED );
        final SubLObject cut_position = Numbers.add( position, ONE_INTEGER, Sequences.length( $http_header_cookie_keyword$.getGlobalValue() ) );
        final SubLObject cookie_encoding = string_utilities.substring( string, cut_position, end_position );
        final SubLObject cookie_string = http_compute_cookie_string_from_encoding( cookie_encoding );
        cookie_information = ConsesLow.cons( cookie_string, cookie_information );
        position = end_position;
      }
    }
    return cookie_information;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26210L)
  public static SubLObject http_compute_cookie_string_from_encoding(final SubLObject encoding)
  {
    final SubLObject pieces = http_decompose_cookie_encoding_string( encoding );
    SubLObject return_encoding = $str86$;
    SubLObject cdolist_list_var = pieces;
    SubLObject piece = NIL;
    piece = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      if( NIL == string_utilities.empty_string_p( piece ) && NIL == filter_predefined_named_cookie_attributes( piece ) )
      {
        return_encoding = Sequences.cconcatenate( return_encoding, new SubLObject[] { $str87$__, piece
        } );
      }
      cdolist_list_var = cdolist_list_var.rest();
      piece = cdolist_list_var.first();
    }
    return return_encoding;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26639L)
  public static SubLObject filter_predefined_named_cookie_attributes(final SubLObject name_value_pair)
  {
    final SubLObject name_value_pair_size = Sequences.length( name_value_pair );
    SubLObject filterP = NIL;
    if( NIL == filterP )
    {
      SubLObject csome_list_var = $http_filtered_predefined_named_cookie_attributes$.getGlobalValue();
      SubLObject known_attribute = NIL;
      known_attribute = csome_list_var.first();
      while ( NIL == filterP && NIL != csome_list_var)
      {
        final SubLObject size = Sequences.length( known_attribute );
        if( size.numL( name_value_pair_size ) && NIL != Strings.string_equal( known_attribute, name_value_pair, ZERO_INTEGER, NIL, ZERO_INTEGER, size ) )
        {
          filterP = T;
        }
        csome_list_var = csome_list_var.rest();
        known_attribute = csome_list_var.first();
      }
    }
    return filterP;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 27117L)
  public static SubLObject http_decompose_cookie_encoding_string(final SubLObject encoding)
  {
    return Sequences.remove_if( Symbols.symbol_function( $sym88$EMPTY_STRING_P ), Mapping.mapcar( Symbols.symbol_function( $sym89$TRIM_WHITESPACE ), string_utilities.split_string( encoding,
        $http_cookie_separation_charset$.getGlobalValue() ) ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 27353L)
  public static SubLObject html_url_encode(final SubLObject string, SubLObject encode_equalsP)
  {
    if( encode_equalsP == UNPROVIDED )
    {
      encode_equalsP = NIL;
    }
    final SubLObject length = Sequences.length( string );
    final SubLObject count = ( NIL != encode_equalsP ) ? Sequences.count_if( Symbols.symbol_function( $sym90$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED )
        : Sequences.count_if( Symbols.symbol_function( $sym91$HTML_URL_EXPAND_CHAR ), string, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( ZERO_INTEGER.numE( count ) )
    {
      return string;
    }
    final SubLObject new_length = Numbers.add( length, Numbers.multiply( count, TWO_INTEGER ) );
    final SubLObject new_string = Strings.make_string( new_length, UNPROVIDED );
    SubLObject new_index = ZERO_INTEGER;
    SubLObject index;
    SubLObject v_char;
    SubLObject needs_encodingP;
    SubLObject code;
    for( index = NIL, index = ZERO_INTEGER; index.numL( length ); index = Numbers.add( index, ONE_INTEGER ) )
    {
      v_char = Strings.sublisp_char( string, index );
      needs_encodingP = ( ( NIL != encode_equalsP ) ? html_url_expand_char_including_equals( v_char ) : html_url_expand_char( v_char ) );
      if( NIL != needs_encodingP )
      {
        code = Characters.char_code( v_char );
        Strings.set_char( new_string, Numbers.add( new_index, ZERO_INTEGER ), Characters.CHAR_percent );
        Strings.set_char( new_string, Numbers.add( new_index, ONE_INTEGER ), string_utilities.hex_char( Numbers.integerDivide( code, SIXTEEN_INTEGER ) ) );
        Strings.set_char( new_string, Numbers.add( new_index, TWO_INTEGER ), string_utilities.hex_char( Numbers.mod( code, SIXTEEN_INTEGER ) ) );
        new_index = Numbers.add( new_index, THREE_INTEGER );
      }
      else
      {
        if( v_char.eql( Characters.CHAR_space ) )
        {
          Strings.set_char( new_string, Numbers.add( new_index, ZERO_INTEGER ), Characters.CHAR_plus );
        }
        else
        {
          Strings.set_char( new_string, Numbers.add( new_index, ZERO_INTEGER ), v_char );
        }
        new_index = Numbers.add( new_index, ONE_INTEGER );
      }
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 28683L)
  public static SubLObject html_url_expand_char(final SubLObject v_char)
  {
    return makeBoolean( v_char.isChar() && ( NIL == Characters.alpha_char_p( v_char ) || NIL == unicode_strings.ascii_char_p( v_char ) ) && NIL == Characters.digit_char_p( v_char, UNPROVIDED ) && NIL == Sequences.find(
        v_char, $str92$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 28873L)
  public static SubLObject html_url_expand_char_including_equals(final SubLObject v_char)
  {
    return makeBoolean( v_char.eql( Characters.CHAR_equal ) || NIL != html_url_expand_char( v_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 29032L)
  public static SubLObject html_url_decode(final SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject length = Sequences.length( string );
    final SubLObject count = Sequences.count( Characters.CHAR_percent, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( length.numE( count ) )
    {
      return Sequences.nsubstitute( Characters.CHAR_space, Characters.CHAR_plus, string_utilities.copy_string( string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    }
    final SubLObject new_length = Numbers.subtract( length, Numbers.multiply( count, TWO_INTEGER ) );
    SubLObject new_string = Strings.make_string( new_length, UNPROVIDED );
    SubLObject new_index = ZERO_INTEGER;
    SubLObject index = ZERO_INTEGER;
    while ( index.numL( length ))
    {
      final SubLObject v_char = Strings.sublisp_char( string, index );
      if( NIL != Characters.charE( Characters.CHAR_percent, v_char ) )
      {
        thread.resetMultipleValues();
        final SubLObject decoded_char = decode_url_percent_encoded_char( string, index );
        final SubLObject chars_consumed = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if( decoded_char.isChar() )
        {
          Strings.set_char( new_string, new_index, decoded_char );
          new_index = Numbers.add( new_index, ONE_INTEGER );
        }
        else if( decoded_char.isString() )
        {
          new_string = Sequences.cconcatenate( string_utilities.substring( new_string, ZERO_INTEGER, new_index ), new SubLObject[] { decoded_char, string_utilities.substring( new_string, Numbers.add( new_index,
              ONE_INTEGER ), UNPROVIDED )
          } );
          new_index = Numbers.add( new_index, Sequences.length( decoded_char ) );
        }
        index = Numbers.add( index, chars_consumed );
      }
      else
      {
        if( v_char.eql( Characters.CHAR_plus ) )
        {
          Strings.set_char( new_string, new_index, Characters.CHAR_space );
        }
        else
        {
          Strings.set_char( new_string, new_index, v_char );
        }
        new_index = Numbers.add( new_index, ONE_INTEGER );
        index = Numbers.add( index, ONE_INTEGER );
      }
    }
    return new_string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 30447L)
  public static SubLObject decode_url_percent_encoded_char(final SubLObject string, final SubLObject index)
  {
    final SubLObject next_char = Strings.sublisp_char( string, Numbers.add( index, ONE_INTEGER ) );
    if( next_char.eql( Characters.CHAR_u ) )
    {
      final SubLObject char_code = reader.parse_integer( string, Numbers.add( index, TWO_INTEGER ), Numbers.add( index, SIX_INTEGER ), SIXTEEN_INTEGER, UNPROVIDED );
      final SubLObject new_char_string = unicode_strings.utf8_vector_to_utf8_string( unicode_strings.unicode_vector_to_utf8_vector( Vectors.make_vector( ONE_INTEGER, char_code ), UNPROVIDED, UNPROVIDED ) );
      return Values.values( new_char_string, SIX_INTEGER );
    }
    final SubLObject high_char = next_char;
    final SubLObject low_char = Strings.sublisp_char( string, Numbers.add( index, TWO_INTEGER ) );
    final SubLObject code = vector_utilities.hex_chars_to_byte( high_char, low_char );
    final SubLObject decoded_char = Characters.code_char( code );
    return Values.values( decoded_char, THREE_INTEGER );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 31175L)
  public static SubLObject html_glyph_decode(SubLObject string)
  {
    string = html_ascii_glyph_decode( string );
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 31527L)
  public static SubLObject html_ascii_glyph_decode(SubLObject string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject restart;
    for( SubLObject done = NIL; NIL == done; done = makeBoolean( NIL == restart ) )
    {
      restart = NIL;
      if( NIL == restart )
      {
        SubLObject end_var;
        SubLObject glyph_start;
        SubLObject glyph_end;
        SubLObject char_code;
        SubLObject prefix;
        SubLObject replacement;
        SubLObject postfix;
        for( end_var = Sequences.length( string ), glyph_start = NIL, glyph_start = ZERO_INTEGER; NIL == restart && !glyph_start.numGE( end_var ); glyph_start = number_utilities.f_1X( glyph_start ) )
        {
          thread.resetMultipleValues();
          glyph_end = html_ascii_glyph_p( string, glyph_start );
          char_code = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if( NIL != glyph_end )
          {
            prefix = Sequences.subseq( string, ZERO_INTEGER, glyph_start );
            replacement = Strings.make_string( ONE_INTEGER, Characters.code_char( char_code ) );
            postfix = Sequences.subseq( string, glyph_end, Sequences.length( string ) );
            string = Sequences.cconcatenate( prefix, new SubLObject[] { replacement, postfix
            } );
            restart = T;
          }
        }
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 32310L)
  public static SubLObject html_ascii_glyph_p(final SubLObject string, SubLObject start)
  {
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    final SubLObject length = Sequences.length( string );
    if( Numbers.subtract( length, start ).numGE( FOUR_INTEGER ) && NIL != Characters.charE( Characters.CHAR_ampersand, Strings.sublisp_char( string, Numbers.add( ZERO_INTEGER, start ) ) ) && NIL != Characters.charE(
        Characters.CHAR_hash, Strings.sublisp_char( string, Numbers.add( ONE_INTEGER, start ) ) ) )
    {
      final SubLObject glyph_last = Sequences.position( Characters.CHAR_semicolon, string, Symbols.symbol_function( $sym82$CHAR_ ), Symbols.symbol_function( IDENTITY ), start, UNPROVIDED );
      if( NIL != glyph_last )
      {
        final SubLObject glyph_end = number_utilities.f_1X( glyph_last );
        final SubLObject glyph_length = Numbers.subtract( glyph_end, start );
        if( glyph_length.numGE( FOUR_INTEGER ) && glyph_length.numLE( SIX_INTEGER ) )
        {
          final SubLObject integer = ( NIL != Characters.charE( Characters.CHAR_x, Strings.sublisp_char( string, Numbers.add( TWO_INTEGER, start ) ) ) ) ? reader.parse_integer( string, Numbers.add( THREE_INTEGER,
              start ), glyph_last, SIXTEEN_INTEGER, NIL ) : reader.parse_integer( string, Numbers.add( TWO_INTEGER, start ), glyph_last, TEN_INTEGER, NIL );
          if( NIL != integer && integer.numGE( ZERO_INTEGER ) && integer.numL( $int93$256 ) )
          {
            return Values.values( glyph_end, integer );
          }
        }
      }
    }
    return Values.values( NIL, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33383L)
  public static SubLObject html_encode_fort(final SubLObject fort)
  {
    return html_url_encode( PrintLow.format( NIL, $str94$_S, forts.fort_el_formula( czer_main.canonicalize_term( fort, UNPROVIDED ) ) ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33584L)
  public static SubLObject html_decode_fort(final SubLObject string)
  {
    return czer_main.canonicalize_term( reader.read_from_string( html_url_decode( string ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33757L)
  public static SubLObject uri_p(final SubLObject v_object, SubLObject official_onlyP)
  {
    if( official_onlyP == UNPROVIDED )
    {
      official_onlyP = NIL;
    }
    if( v_object.isString() )
    {
      final SubLObject colon_idx = Sequences.position( Characters.CHAR_colon, v_object, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, UNPROVIDED );
      if( NIL != colon_idx && NIL != uri_scheme_p( v_object, official_onlyP, ZERO_INTEGER, number_utilities.f_1X( colon_idx ) ) )
      {
        return T;
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 34410L)
  public static SubLObject url_p(final SubLObject v_object)
  {
    if( !v_object.isString() )
    {
      return NIL;
    }
    final SubLObject colon_idx = Sequences.position( Characters.CHAR_colon, v_object, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, UNPROVIDED );
    if( NIL == colon_idx )
    {
      return NIL;
    }
    final SubLObject start_idx = find_url_beginning( v_object, Sequences.length( v_object ), colon_idx );
    if( NIL == start_idx || start_idx.numG( ZERO_INTEGER ) )
    {
      return NIL;
    }
    if( NIL != Strings.stringE( $str95$mailto_, Sequences.subseq( v_object, ZERO_INTEGER, SEVEN_INTEGER ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      return string_utilities.contains_charP( v_object, Characters.CHAR_at );
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 35276L)
  public static SubLObject url_host(final SubLObject url)
  {
    final SubLObject colon_idx = Sequences.position( Characters.CHAR_colon, url, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, UNPROVIDED );
    if( NIL == colon_idx )
    {
      return $str86$;
    }
    final SubLObject url_tokens = string_utilities.string_tokenize( url, $list96, NIL, NIL, T, UNPROVIDED, UNPROVIDED );
    return conses_high.second( url_tokens );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 35922L)
  public static SubLObject url_is_relativeP(final SubLObject url)
  {
    assert NIL != string_utilities.non_empty_string_p( url ) : url;
    return Equality.eq( Characters.CHAR_slash, string_utilities.first_char( url ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 36150L)
  public static SubLObject absolute_url_from_relative_url_and_base(final SubLObject url, final SubLObject base_uri)
  {
    assert NIL != Types.stringp( url ) : url;
    assert NIL != Types.stringp( base_uri ) : base_uri;
    final SubLObject relativeP = url_is_relativeP( url );
    return ( NIL != relativeP && NIL != base_uri ) ? Sequences.cconcatenate( format_nil.format_nil_a_no_copy( Strings.string_right_trim( $str29$_, base_uri ) ), format_nil.format_nil_a_no_copy( url ) ) : url;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37186L)
  public static SubLObject uri_scheme_p(final SubLObject v_object, SubLObject official_onlyP, SubLObject start, SubLObject end)
  {
    if( official_onlyP == UNPROVIDED )
    {
      official_onlyP = NIL;
    }
    if( start == UNPROVIDED )
    {
      start = ZERO_INTEGER;
    }
    if( end == UNPROVIDED )
    {
      end = NIL;
    }
    SubLObject match = NIL;
    if( NIL == match )
    {
      SubLObject csome_list_var = $official_uri_schemes$.getGlobalValue();
      SubLObject scheme = NIL;
      scheme = csome_list_var.first();
      while ( NIL == match && NIL != csome_list_var)
      {
        if( start.eql( Sequences.search( scheme, v_object, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start, end ) ) )
        {
          match = scheme;
        }
        csome_list_var = csome_list_var.rest();
        scheme = csome_list_var.first();
      }
    }
    if( NIL == official_onlyP && NIL == match )
    {
      SubLObject csome_list_var = $unofficial_uri_schemes$.getGlobalValue();
      SubLObject scheme = NIL;
      scheme = csome_list_var.first();
      while ( NIL == match && NIL != csome_list_var)
      {
        if( start.eql( Sequences.search( scheme, v_object, Symbols.symbol_function( EQUAL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, NIL, start, end ) ) )
        {
          match = scheme;
        }
        csome_list_var = csome_list_var.rest();
        scheme = csome_list_var.first();
      }
    }
    return list_utilities.sublisp_boolean( match );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37852L)
  public static SubLObject find_url_beginning(final SubLObject string, final SubLObject length, final SubLObject idx)
  {
    if( !string.isString() || !length.isNumber() || !idx.isNumber() )
    {
      return NIL;
    }
    SubLObject cdolist_list_var = $valid_url_beginnings$.getGlobalValue();
    SubLObject protocol = NIL;
    protocol = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject begin_idx = Numbers.subtract( idx, string_utilities.char_position( Characters.CHAR_colon, protocol, UNPROVIDED ) );
      final SubLObject end_idx = Numbers.add( begin_idx, Sequences.length( protocol ) );
      if( begin_idx.numGE( ZERO_INTEGER ) && end_idx.numL( length ) && NIL != Strings.stringE( protocol, Sequences.subseq( string, begin_idx, end_idx ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
      {
        return begin_idx;
      }
      cdolist_list_var = cdolist_list_var.rest();
      protocol = cdolist_list_var.first();
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 38657L)
  public static SubLObject find_url_end(final SubLObject string, SubLObject length, SubLObject url_idx)
  {
    if( length == UNPROVIDED )
    {
      length = Sequences.length( string );
    }
    if( url_idx == UNPROVIDED )
    {
      url_idx = ZERO_INTEGER;
    }
    if( !string.isString() || !length.isNumber() || !url_idx.isNumber() )
    {
      return NIL;
    }
    SubLObject end_idx = list_utilities.position_if_not( $sym102$VALID_URL_CHAR_P, string, Symbols.symbol_function( IDENTITY ), url_idx, UNPROVIDED );
    if( NIL == end_idx )
    {
      end_idx = length;
    }
    if( !url_idx.eql( ZERO_INTEGER ) || !end_idx.eql( length ) )
    {
      while ( end_idx.isPositive() && NIL != conses_high.member( Strings.sublisp_char( string, number_utilities.f_1_( end_idx ) ), $url_delimiters$.getGlobalValue(), Symbols.symbol_function( EQUALP ), UNPROVIDED ))
      {
        end_idx = Numbers.subtract( end_idx, ONE_INTEGER );
      }
    }
    final SubLObject address = Sequences.subseq( string, url_idx, end_idx );
    if( NIL != url_p( address ) )
    {
      return end_idx;
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 39675L)
  public static SubLObject valid_url_char_p(final SubLObject v_char)
  {
    return makeBoolean( NIL != Characters.alpha_char_p( v_char ) || NIL != Characters.digit_char_p( v_char, UNPROVIDED ) || NIL != Sequences.find( v_char, $valid_non_alphanumeric_url_chars$.getGlobalValue(), UNPROVIDED,
        UNPROVIDED, UNPROVIDED, UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 39894L)
  public static SubLObject resolve_relative_uri(final SubLObject base, final SubLObject local_name)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject new_base = canonicalize_relative_uri( base, local_name );
    final SubLObject new_local_name = thread.secondMultipleValue();
    thread.resetMultipleValues();
    return Sequences.cconcatenate( new_base, new_local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 40195L)
  public static SubLObject canonicalize_relative_uri(SubLObject base, SubLObject local_name)
  {
    while ( NIL != string_utilities.starts_with( local_name, $str104$___ ))
    {
      base = remove_last_path_element( base );
      local_name = string_utilities.substring( local_name, THREE_INTEGER, UNPROVIDED );
    }
    if( NIL != string_utilities.starts_with( local_name, $str105$__ ) )
    {
      final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != colon_pos )
      {
        base = string_utilities.substring( base, ZERO_INTEGER, number_utilities.f_1X( colon_pos ) );
      }
    }
    else if( NIL != string_utilities.non_empty_string_p( base ) && NIL != uri_lacks_path_componentP( base ) && !Characters.CHAR_hash.eql( string_utilities.last_char( base ) ) && NIL != string_utilities
        .non_empty_string_p( local_name ) && !Characters.CHAR_hash.eql( string_utilities.first_char( local_name ) ) )
    {
      base = Sequences.cconcatenate( base, $str29$_ );
    }
    else if( NIL != string_utilities.starts_with( local_name, $str29$_ ) )
    {
      final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != colon_pos )
      {
        final SubLObject domain_name_end = Sequences.position( Characters.CHAR_slash, base, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add( THREE_INTEGER, colon_pos ), UNPROVIDED );
        base = string_utilities.substring( base, ZERO_INTEGER, domain_name_end );
      }
    }
    else if( NIL == string_utilities.empty_string_p( local_name ) && !string_utilities.first_char( local_name ).eql( Characters.CHAR_hash ) && !string_utilities.last_char( base ).eql( Characters.CHAR_hash ) )
    {
      final SubLObject slash_pos = list_utilities.position_from_end( Characters.CHAR_slash, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != list_utilities.lengthG( base, number_utilities.f_1X( slash_pos ), UNPROVIDED ) )
      {
        base = string_utilities.substring( base, ZERO_INTEGER, number_utilities.f_1X( slash_pos ) );
      }
    }
    return Values.values( base, local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 41589L)
  public static SubLObject remove_last_path_element(final SubLObject uri)
  {
    final SubLObject last_slash_pos = list_utilities.position_from_end( Characters.CHAR_slash, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject directory_start = list_utilities.position_from_end( Characters.CHAR_slash, uri, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), ZERO_INTEGER, last_slash_pos );
    return string_utilities.substring( uri, ZERO_INTEGER, directory_start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 41820L)
  public static SubLObject uri_lacks_path_componentP(final SubLObject uri)
  {
    final SubLObject colon_pos = Sequences.position( Characters.CHAR_colon, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject path_start = ( NIL != colon_pos ) ? Sequences.position( Characters.CHAR_slash, uri, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), Numbers.add( colon_pos, THREE_INTEGER ),
        UNPROVIDED ) : NIL;
    return Types.sublisp_null( path_start );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
  public static SubLObject clear_soap_name()
  {
    final SubLObject cs = $soap_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
  public static SubLObject remove_soap_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $soap_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
  public static SubLObject soap_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( $str116$soap_, local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
  public static SubLObject soap_name(final SubLObject local_name)
  {
    SubLObject caching_state = $soap_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym115$SOAP_NAME, $sym117$_SOAP_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( soap_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
  public static SubLObject clear_soap_expanded_name()
  {
    final SubLObject cs = $soap_expanded_name_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
  public static SubLObject remove_soap_expanded_name(final SubLObject local_name)
  {
    return memoization_state.caching_state_remove_function_results_with_args( $soap_expanded_name_caching_state$.getGlobalValue(), ConsesLow.list( local_name ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
  public static SubLObject soap_expanded_name_internal(final SubLObject local_name)
  {
    return Sequences.cconcatenate( $soap_envelope_uri$.getGlobalValue(), local_name );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
  public static SubLObject soap_expanded_name(final SubLObject local_name)
  {
    SubLObject caching_state = $soap_expanded_name_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym118$SOAP_EXPANDED_NAME, $sym119$_SOAP_EXPANDED_NAME_CACHING_STATE_, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_lookup( caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue() );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( soap_expanded_name_internal( local_name ) ) );
      memoization_state.caching_state_put( caching_state, local_name, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44590L)
  public static SubLObject soap_envelope_sexpr_p(final SubLObject sexpr)
  {
    return Equality.equal( soap_expanded_name( $str120$Envelope ), xml_parsing_utilities.xml_sexpr_type( sexpr ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
  public static SubLObject clear_perform_soap_post_cached()
  {
    final SubLObject cs = $perform_soap_post_cached_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
  public static SubLObject remove_perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP)
  {
    if( port == UNPROVIDED )
    {
      port = $int19$80;
    }
    if( keep_aliveP == UNPROVIDED )
    {
      keep_aliveP = T;
    }
    return memoization_state.caching_state_remove_function_results_with_args( $perform_soap_post_cached_caching_state$.getGlobalValue(), ConsesLow.list( query, soap_action_uri, machine, url, port, keep_aliveP ),
        UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
  public static SubLObject perform_soap_post_cached_internal(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject keep_aliveP)
  {
    return perform_soap_post( query, soap_action_uri, machine, url, port, keep_aliveP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
  public static SubLObject perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP)
  {
    if( port == UNPROVIDED )
    {
      port = $int19$80;
    }
    if( keep_aliveP == UNPROVIDED )
    {
      keep_aliveP = T;
    }
    SubLObject caching_state = $perform_soap_post_cached_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym121$PERFORM_SOAP_POST_CACHED, $sym122$_PERFORM_SOAP_POST_CACHED_CACHING_STATE_, $int93$256, EQUAL, SIX_INTEGER, ZERO_INTEGER );
    }
    final SubLObject sxhash = memoization_state.sxhash_calc_6( query, soap_action_uri, machine, url, port, keep_aliveP );
    final SubLObject collisions = memoization_state.caching_state_lookup( caching_state, sxhash, UNPROVIDED );
    if( !collisions.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      SubLObject cdolist_list_var = collisions;
      SubLObject collision = NIL;
      collision = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject cached_args = collision.first();
        final SubLObject results2 = conses_high.second( collision );
        if( query.equal( cached_args.first() ) )
        {
          cached_args = cached_args.rest();
          if( soap_action_uri.equal( cached_args.first() ) )
          {
            cached_args = cached_args.rest();
            if( machine.equal( cached_args.first() ) )
            {
              cached_args = cached_args.rest();
              if( url.equal( cached_args.first() ) )
              {
                cached_args = cached_args.rest();
                if( port.equal( cached_args.first() ) )
                {
                  cached_args = cached_args.rest();
                  if( NIL != cached_args && NIL == cached_args.rest() && keep_aliveP.equal( cached_args.first() ) )
                  {
                    return memoization_state.caching_results( results2 );
                  }
                }
              }
            }
          }
        }
        cdolist_list_var = cdolist_list_var.rest();
        collision = cdolist_list_var.first();
      }
    }
    final SubLObject results3 = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( perform_soap_post_cached_internal( query, soap_action_uri, machine, url, port, keep_aliveP ) ) );
    memoization_state.caching_state_enter_multi_key_n( caching_state, sxhash, collisions, results3, ConsesLow.list( query, soap_action_uri, machine, url, port, keep_aliveP ) );
    return memoization_state.caching_results( results3 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44965L)
  public static SubLObject perform_soap_post(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP)
  {
    if( port == UNPROVIDED )
    {
      port = $int19$80;
    }
    if( keep_aliveP == UNPROVIDED )
    {
      keep_aliveP = T;
    }
    SubLObject response = NIL;
    SubLObject sexpr = NIL;
    final SubLObject real_port = port.eql( $kw8$DEFAULT ) ? $int19$80 : port;
    SubLObject in_stream = NIL;
    try
    {
      in_stream = subl_promotions.open_tcp_stream_with_timeout( machine, real_port, NIL, $kw22$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( in_stream, machine, real_port ) )
      {
        send_http_request( in_stream, ConsesLow.list( new SubLObject[] { $kw25$MACHINE, machine, $kw7$PORT, port, $kw5$METHOD, $kw54$POST, $kw26$URL, url, $kw4$QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP,
          $kw10$WIDE_NEWLINES_, T, $kw12$ACCEPT_TYPES, $kw8$DEFAULT, $kw13$CONTENT_TYPE, $str123$text_xml__charset_utf_8, $kw14$SOAP_ACTION_URI, soap_action_uri
        } ) );
        response = http_response_body( slack_read_until_eof( in_stream, UNPROVIDED ) );
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
    if( !Characters.CHAR_less.eql( string_utilities.first_char( response ) ) )
    {
      final SubLObject start = Sequences.position( Characters.CHAR_less, response, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
      if( NIL != start )
      {
        response = string_utilities.substring( response, start, UNPROVIDED );
      }
    }
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_input_stream( response, ZERO_INTEGER, NIL );
      sexpr = xml_parsing_utilities.xml_tokens_to_sexpr( xml_parsing_utilities.xml_tokenize( stream, T, T, T ) );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values2 = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_2 );
      }
    }
    return sexpr;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 45710L)
  public static SubLObject make_soap_message(final SubLObject tns, final SubLObject header_properties, final SubLObject body_elements, SubLObject encoding, SubLObject standalone, SubLObject header_elements)
  {
    if( encoding == UNPROVIDED )
    {
      encoding = $str124$US_ASCII;
    }
    if( standalone == UNPROVIDED )
    {
      standalone = T;
    }
    if( header_elements == UNPROVIDED )
    {
      header_elements = NIL;
    }
    xml_utilities.xml_header( xml_utilities.xml_version(), encoding, standalone );
    final SubLObject name_var = soap_name( $str120$Envelope );
    xml_utilities.xml_start_tag_internal( name_var, ConsesLow.list( $str125$xmlns_soap, $soap_envelope_uri$.getGlobalValue() ), NIL, UNPROVIDED, UNPROVIDED );
    if( NIL != list_utilities.non_empty_list_p( header_properties ) || NIL != list_utilities.non_empty_list_p( header_elements ) )
    {
      final SubLObject name_var_$6 = soap_name( $str126$Header );
      xml_utilities.xml_start_tag_internal( name_var_$6, NIL, NIL, UNPROVIDED, UNPROVIDED );
      SubLObject cdolist_list_var = header_properties;
      SubLObject cons = NIL;
      cons = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        SubLObject current;
        final SubLObject datum = current = cons;
        SubLObject attribute = NIL;
        SubLObject value = NIL;
        cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list127 );
        attribute = current.first();
        current = ( value = current.rest() );
        final SubLObject name_var_$7 = attribute;
        xml_utilities.xml_start_tag_internal( name_var_$7, ConsesLow.list( $str128$xmlns, tns ), NIL, UNPROVIDED, UNPROVIDED );
        xml_utilities.xml_write_string( value, UNPROVIDED, UNPROVIDED );
        xml_utilities.xml_end_tag_internal( name_var_$7 );
        cdolist_list_var = cdolist_list_var.rest();
        cons = cdolist_list_var.first();
      }
      cdolist_list_var = header_elements;
      SubLObject element = NIL;
      element = cdolist_list_var.first();
      while ( NIL != cdolist_list_var)
      {
        xml_utilities.xml_write( element, NIL );
        cdolist_list_var = cdolist_list_var.rest();
        element = cdolist_list_var.first();
      }
      xml_utilities.xml_end_tag_internal( name_var_$6 );
    }
    final SubLObject name_var_$8 = soap_name( $str129$Body );
    xml_utilities.xml_start_tag_internal( name_var_$8, NIL, NIL, UNPROVIDED, UNPROVIDED );
    SubLObject cdolist_list_var = body_elements;
    SubLObject element = NIL;
    element = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      xml_utilities.xml_write( element, NIL );
      cdolist_list_var = cdolist_list_var.rest();
      element = cdolist_list_var.first();
    }
    xml_utilities.xml_end_tag_internal( name_var_$8 );
    xml_utilities.xml_end_tag_internal( name_var );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 46587L)
  public static SubLObject get_http_status_code(final SubLObject header_string)
  {
    final SubLObject header_tokenized = Sequences.delete( $str86$, string_utilities.split_string( header_string, $list130 ), Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( $str131$HTTP.equal( Strings.string_upcase( header_tokenized.first(), UNPROVIDED, UNPROVIDED ) ) )
    {
      return string_utilities.string_to_integer( conses_high.third( header_tokenized ) );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47125L)
  public static SubLObject html_redirection_header_p(final SubLObject string)
  {
    final SubLObject code = get_http_status_code( string );
    return list_utilities.alist_has_keyP( $http_redirection_codes$.getGlobalValue(), code, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47353L)
  public static SubLObject html_redirection_url(final SubLObject string)
  {
    final SubLObject marker = $str132$Location__;
    final SubLObject marker_start = Sequences.search( marker, string, Symbols.symbol_function( EQUAL ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    if( NIL != marker_start )
    {
      final SubLObject location_start = Numbers.add( marker_start, Sequences.length( marker ) );
      final SubLObject location_end = Sequences.position_if( Symbols.symbol_function( $sym133$WHITESPACEP ), string, Symbols.symbol_function( IDENTITY ), location_start, UNPROVIDED );
      if( NIL != location_end )
      {
        return string_utilities.substring( string, location_start, location_end );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47893L)
  public static SubLObject parse_http_url(final SubLObject http_url)
  {
    SubLObject machine = NIL;
    SubLObject port = NIL;
    SubLObject url = NIL;
    SubLObject query = NIL;
    if( NIL != Sequences.search( $str134$http___, http_url, Symbols.symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) || NIL != Sequences.search( $str135$https___, http_url, Symbols
        .symbol_function( EQUALP ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED ) )
    {
      final SubLObject machine_start = Sequences.length( $str134$http___ );
      final SubLObject port_start = Sequences.position( Characters.CHAR_colon, http_url, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), machine_start, UNPROVIDED );
      SubLObject url_start = Sequences.position( Characters.CHAR_slash, http_url, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), machine_start, UNPROVIDED );
      SubLObject machine_end = NIL;
      if( NIL == url_start )
      {
        url_start = Sequences.length( http_url );
      }
      if( NIL != port_start && port_start.numL( url_start ) )
      {
        machine_end = port_start;
        port = reader.read_from_string_ignoring_errors( http_url, NIL, NIL, Numbers.add( port_start, ONE_INTEGER ), url_start );
      }
      else
      {
        machine_end = url_start;
        port = $kw8$DEFAULT;
      }
      machine = string_utilities.substring( http_url, machine_start, machine_end );
      final SubLObject query_start = Sequences.position( Characters.CHAR_question, http_url, Symbols.symbol_function( EQL ), Symbols.symbol_function( IDENTITY ), url_start, UNPROVIDED );
      SubLObject url_end = NIL;
      if( NIL != query_start )
      {
        url_end = query_start;
      }
      url = string_utilities.substring( http_url, url_start, url_end );
      if( NIL != query_start )
      {
        query = string_utilities.substring( http_url, Numbers.add( ONE_INTEGER, query_start ), UNPROVIDED );
      }
      else
      {
        query = $str86$;
      }
    }
    return Values.values( machine, port, url, query );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 49120L)
  public static SubLObject read_until_eof(final SubLObject in_stream, SubLObject buffer)
  {
    if( buffer == UNPROVIDED )
    {
      buffer = NIL;
    }
    if( NIL == buffer )
    {
      buffer = Strings.make_string( $int136$100, UNPROVIDED );
    }
    SubLObject text = $str86$;
    final SubLObject length = Sequences.length( buffer );
    SubLObject index = ZERO_INTEGER;
    SubLObject read_char;
    for( read_char = NIL, read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ); NIL != read_char; read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ) )
    {
      Strings.set_char( buffer, index, read_char );
      index = Numbers.add( index, ONE_INTEGER );
      if( index.numE( length ) )
      {
        text = Sequences.cconcatenate( text, string_utilities.substring( buffer, ZERO_INTEGER, index ) );
        index = ZERO_INTEGER;
      }
    }
    return Values.values( Sequences.cconcatenate( text, string_utilities.substring( buffer, ZERO_INTEGER, index ) ), Types.sublisp_null( read_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 50099L)
  public static SubLObject read_until_char(final SubLObject in_stream, final SubLObject v_char, SubLObject scratch_stream)
  {
    if( scratch_stream == UNPROVIDED )
    {
      scratch_stream = streams_high.make_private_string_output_stream();
    }
    SubLObject read_char;
    for( read_char = NIL, read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ); !read_char.eql( v_char ) && NIL != read_char; read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ) )
    {
      streams_high.write_char( read_char, scratch_stream );
    }
    return Values.values( streams_high.get_output_stream_string( scratch_stream ), Types.sublisp_null( read_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 50664L)
  public static SubLObject read_while(final SubLObject in_stream, final SubLObject test, SubLObject scratch_stream)
  {
    if( scratch_stream == UNPROVIDED )
    {
      scratch_stream = streams_high.make_private_string_output_stream();
    }
    SubLObject peek_char;
    for( peek_char = NIL, peek_char = streams_high.peek_char( NIL, in_stream, NIL, NIL, UNPROVIDED ); NIL != peek_char && NIL != Functions.funcall( test, peek_char ); peek_char = streams_high.peek_char( NIL, in_stream,
        NIL, NIL, UNPROVIDED ) )
    {
      streams_high.write_char( streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ), scratch_stream );
    }
    return Values.values( streams_high.get_output_stream_string( scratch_stream ), peek_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 51226L)
  public static SubLObject read_until_char_unless(final SubLObject in_stream, final SubLObject v_char, final SubLObject unless_char, SubLObject scratch_stream)
  {
    if( scratch_stream == UNPROVIDED )
    {
      scratch_stream = streams_high.make_private_string_output_stream();
    }
    SubLObject last_char;
    SubLObject read_char;
    for( last_char = NIL, read_char = NIL, read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ); ( !read_char.eql( v_char ) || last_char.eql( unless_char ) ) && NIL != read_char; read_char = streams_high
        .read_char( in_stream, NIL, NIL, UNPROVIDED ) )
    {
      last_char = read_char;
      streams_high.write_char( read_char, scratch_stream );
    }
    return Values.values( streams_high.get_output_stream_string( scratch_stream ), Types.sublisp_null( read_char ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 51943L)
  public static SubLObject read_until_one_of(final SubLObject in_stream, final SubLObject chars, SubLObject scratch_stream)
  {
    if( scratch_stream == UNPROVIDED )
    {
      scratch_stream = streams_high.make_private_string_output_stream();
    }
    SubLObject read_char;
    for( read_char = NIL, read_char = streams_high.read_char( in_stream, NIL, NIL, UNPROVIDED ); NIL == conses_high.member( read_char, chars, UNPROVIDED, UNPROVIDED ) && NIL != read_char; read_char = streams_high
        .read_char( in_stream, NIL, NIL, UNPROVIDED ) )
    {
      streams_high.write_char( read_char, scratch_stream );
    }
    return Values.values( streams_high.get_output_stream_string( scratch_stream ), read_char );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 52534L)
  public static SubLObject slack_read_until_eof(final SubLObject in_stream, SubLObject max_chars)
  {
    if( max_chars == UNPROVIDED )
    {
      max_chars = NIL;
    }
    SubLObject result_string = NIL;
    SubLObject eofP = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      SubLObject read_char;
      SubLObject read_count;
      for( read_char = NIL, read_count = NIL, read_char = slack_read_char( in_stream, NIL, NIL, UNPROVIDED ), read_count = ZERO_INTEGER; NIL != read_char && ( NIL == max_chars || !read_count.numGE(
          max_chars ) ); read_char = slack_read_char( in_stream, NIL, NIL, UNPROVIDED ), read_count = number_utilities.f_1X( read_count ) )
      {
        streams_high.write_char( read_char, stream );
      }
      eofP = Types.sublisp_null( read_char );
      result_string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return Values.values( result_string, eofP );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53134L)
  public static SubLObject try_error_message(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject msg = NIL;
    SubLObject exp = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    msg = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list137 );
    exp = current.first();
    final SubLObject body;
    current = ( body = current.rest() );
    return ConsesLow.listS( $sym16$CLET, ConsesLow.list( reader.bq_cons( msg, $list138 ) ), ConsesLow.list( $sym139$CATCH_ERROR_MESSAGE, ConsesLow.list( msg ), exp ), ConsesLow.append( body, NIL ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53262L)
  public static SubLObject slack_read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p)
  {
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_input$.getDynamicValue();
    }
    if( eof_error_p == UNPROVIDED )
    {
      eof_error_p = T;
    }
    if( eof_value == UNPROVIDED )
    {
      eof_value = NIL;
    }
    if( recursive_p == UNPROVIDED )
    {
      recursive_p = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != eof_error_p )
    {
      return streams_high.read_char( stream, eof_error_p, eof_value, recursive_p );
    }
    SubLObject ch = NIL;
    SubLObject msg = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym140$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          ch = streams_high.read_char( stream, eof_error_p, eof_value, recursive_p );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      msg = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != msg )
    {
      PrintLow.format( T, $str141$_____Averted__connection_reset_by );
      ch = eof_value;
    }
    return ch;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53709L)
  public static SubLObject read_http_chunk(final SubLObject instream)
  {
    final SubLObject chunk_length_string = string_utilities.network_read_line( instream, NIL, $str142$0, UNPROVIDED );
    final SubLObject chunk_length = reader.parse_integer( chunk_length_string, ZERO_INTEGER, NIL, SIXTEEN_INTEGER, T );
    SubLObject buffer = string_utilities.$empty_string$.getGlobalValue();
    if( NIL != chunk_length )
    {
      buffer = Strings.make_string( chunk_length, UNPROVIDED );
      streams_high.read_sequence( buffer, instream, ZERO_INTEGER, chunk_length );
      string_utilities.network_read_line( instream, NIL, NIL, UNPROVIDED );
    }
    return buffer;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54243L)
  public static SubLObject write_http_chunk(final SubLObject outstream, final SubLObject line)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding( thread );
    try
    {
      print_high.$print_base$.bind( SIXTEEN_INTEGER, thread );
      print_high.princ( Sequences.length( line ), outstream );
    }
    finally
    {
      print_high.$print_base$.rebind( _prev_bind_0, thread );
    }
    http_network_terpri( outstream );
    streams_high.write_string( line, outstream, UNPROVIDED, UNPROVIDED );
    http_network_terpri( outstream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54549L)
  public static SubLObject http_network_terpri(final SubLObject network_outstream)
  {
    streams_high.write_char( Characters.code_char( THIRTEEN_INTEGER ), network_outstream );
    streams_high.write_char( Characters.code_char( TEN_INTEGER ), network_outstream );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54778L)
  public static SubLObject write_http_date(final SubLObject stream, SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    thread.resetMultipleValues();
    final SubLObject second = Time.decode_universal_time( universal_time, ZERO_INTEGER );
    final SubLObject minute = thread.secondMultipleValue();
    final SubLObject hour = thread.thirdMultipleValue();
    final SubLObject date = thread.fourthMultipleValue();
    final SubLObject month = thread.fifthMultipleValue();
    final SubLObject year = thread.sixthMultipleValue();
    final SubLObject day = thread.seventhMultipleValue();
    thread.resetMultipleValues();
    streams_high.write_string( numeric_date_utilities.day_of_week_number_abbrev( day ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_string( $str76$__, stream, UNPROVIDED, UNPROVIDED );
    utilities_macros.print_2_digit_nonnegative_integer( date, stream );
    streams_high.write_char( Characters.CHAR_space, stream );
    streams_high.write_string( numeric_date_utilities.month_number_abbrev( month ), stream, UNPROVIDED, UNPROVIDED );
    streams_high.write_char( Characters.CHAR_space, stream );
    print_high.princ( year, stream );
    streams_high.write_char( Characters.CHAR_space, stream );
    utilities_macros.print_2_digit_nonnegative_integer( hour, stream );
    streams_high.write_char( Characters.CHAR_colon, stream );
    utilities_macros.print_2_digit_nonnegative_integer( minute, stream );
    streams_high.write_char( Characters.CHAR_colon, stream );
    utilities_macros.print_2_digit_nonnegative_integer( second, stream );
    streams_high.write_string( $str143$_GMT, stream, UNPROVIDED, UNPROVIDED );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 55823L)
  public static SubLObject http_date_string(SubLObject universal_time)
  {
    if( universal_time == UNPROVIDED )
    {
      universal_time = Time.get_universal_time();
    }
    SubLObject string = NIL;
    SubLObject stream = NIL;
    try
    {
      stream = streams_high.make_private_string_output_stream();
      write_http_date( stream, universal_time );
      string = streams_high.get_output_stream_string( stream );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        streams_high.close( stream, UNPROVIDED );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return string;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56178L)
  public static SubLObject html_tokens_fast_forward(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pattern = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.listS( $sym145$MEMBER, pattern, list, $list146 );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56409L)
  public static SubLObject html_tokens_step(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym148$CSETQ, list, ConsesLow.list( $sym149$CDR, list ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56480L)
  public static SubLObject html_tokens_fast_forward_to(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pattern = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym148$CSETQ, list, ConsesLow.list( $sym150$HTML_TOKENS_FAST_FORWARD, pattern, list ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56600L)
  public static SubLObject html_tokens_fast_forward_past(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject pattern = NIL;
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    pattern = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list144 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym148$CSETQ, list, ConsesLow.list( $sym149$CDR, ConsesLow.list( $sym150$HTML_TOKENS_FAST_FORWARD, pattern, list ) ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list144 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56728L)
  public static SubLObject html_tokens_extract_curr(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject list = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list147 );
    list = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym151$CAR, list );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list147 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56793L)
  public static SubLObject is_html_terminating_tagP(final SubLObject string, final SubLObject open_tag)
  {
    if( !Characters.CHAR_less.eql( Strings.sublisp_char( string, ZERO_INTEGER ) ) || !Characters.CHAR_slash.eql( Strings.sublisp_char( string, ONE_INTEGER ) ) )
    {
      return NIL;
    }
    return Strings.string_equal( string, open_tag, TWO_INTEGER, NIL, ONE_INTEGER, NIL );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57139L)
  public static SubLObject test_for_html_tagP(final SubLObject tokens, final SubLObject tag)
  {
    final SubLObject current = tokens.first();
    if( !current.isString() )
    {
      return NIL;
    }
    return Strings.string_equal( tag, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57329L)
  public static SubLObject html_consume_starting_tag(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tokens = NIL;
    SubLObject tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    tokens = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject marker = $sym153$MARKER;
      return ConsesLow.list( $sym16$CLET, ConsesLow.list( ConsesLow.list( marker, ConsesLow.list( $sym154$HTML_TOKENS_EXTRACT_CURR, tokens ) ) ), ConsesLow.list( $sym155$PUNLESS, ConsesLow.list( $sym156$STRING_EQUAL,
          marker, tag ), ConsesLow.list( $sym157$ERROR, $str158$Invalid_input_file_format__Expect, tag, marker ) ), ConsesLow.list( $sym159$HTML_TOKENS_STEP, tokens ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list152 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57694L)
  public static SubLObject html_consume_closing_tag(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tokens = NIL;
    SubLObject tag = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    tokens = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list152 );
    tag = current.first();
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject marker = $sym160$MARKER;
      return ConsesLow.list( $sym16$CLET, ConsesLow.list( ConsesLow.list( marker, ConsesLow.list( $sym154$HTML_TOKENS_EXTRACT_CURR, tokens ) ) ), ConsesLow.list( $sym155$PUNLESS, ConsesLow.list(
          $sym161$IS_HTML_TERMINATING_TAG_, marker, tag ), ConsesLow.list( $sym157$ERROR, $str162$Invalid_input_file_format__Expect, tag, marker ) ), ConsesLow.list( $sym159$HTML_TOKENS_STEP, tokens ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list152 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58069L)
  public static SubLObject html_extract_tag_content(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tokens = NIL;
    SubLObject tag = NIL;
    SubLObject storage = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    tokens = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    storage = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym164$PROGN, ConsesLow.list( $sym165$HTML_CONSUME_STARTING_TAG, tokens, tag ), ConsesLow.list( $sym148$CSETQ, storage, ConsesLow.list( $sym154$HTML_TOKENS_EXTRACT_CURR, tokens ) ),
          ConsesLow.list( $sym159$HTML_TOKENS_STEP, tokens ), ConsesLow.list( $sym166$HTML_CONSUME_CLOSING_TAG, tokens, tag ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list163 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58351L)
  public static SubLObject html_extract_possibly_empty_tag_content(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tokens = NIL;
    SubLObject tag = NIL;
    SubLObject storage = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    tokens = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list167 );
    storage = current.first();
    current = current.rest();
    final SubLObject v_default = current.isCons() ? current.first() : NIL;
    cdestructuring_bind.destructuring_bind_must_listp( current, datum, $list167 );
    current = current.rest();
    if( NIL == current )
    {
      final SubLObject temp = $sym168$TEMP;
      return ConsesLow.list( $sym16$CLET, ConsesLow.list( temp ), ConsesLow.list( $sym148$CSETQ, storage, v_default ), ConsesLow.list( $sym165$HTML_CONSUME_STARTING_TAG, tokens, tag ), ConsesLow.list( $sym148$CSETQ,
          temp, ConsesLow.list( $sym154$HTML_TOKENS_EXTRACT_CURR, tokens ) ), ConsesLow.list( $sym155$PUNLESS, ConsesLow.list( $sym161$IS_HTML_TERMINATING_TAG_, temp, tag ), ConsesLow.list( $sym148$CSETQ, storage,
              temp ), ConsesLow.list( $sym159$HTML_TOKENS_STEP, tokens ) ), ConsesLow.list( $sym166$HTML_CONSUME_CLOSING_TAG, tokens, tag ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list167 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58865L)
  public static SubLObject html_possibly_extract_tag_content(final SubLObject macroform, final SubLObject environment)
  {
    SubLObject current;
    final SubLObject datum = current = macroform.rest();
    SubLObject tokens = NIL;
    SubLObject tag = NIL;
    SubLObject storage = NIL;
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    tokens = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    tag = current.first();
    current = current.rest();
    cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list163 );
    storage = current.first();
    current = current.rest();
    if( NIL == current )
    {
      return ConsesLow.list( $sym169$PWHEN, ConsesLow.list( $sym170$TEST_FOR_HTML_TAG_, tokens, tag ), ConsesLow.list( $sym171$HTML_EXTRACT_TAG_CONTENT, tokens, tag, storage ) );
    }
    cdestructuring_bind.cdestructuring_bind_error( datum, $list163 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59060L)
  public static SubLObject html_file_as_tokens(final SubLObject filename)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject tokens = NIL;
    SubLObject stream = NIL;
    try
    {
      final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
      try
      {
        stream_macros.$stream_requires_locking$.bind( NIL, thread );
        stream = compatibility.open_text( filename, $kw172$INPUT );
      }
      finally
      {
        stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
      }
      if( !stream.isStream() )
      {
        Errors.error( $str173$Unable_to_open__S, filename );
      }
      final SubLObject s = stream;
      tokens = html_stream_as_tokens( s );
    }
    finally
    {
      final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( stream.isStream() )
        {
          streams_high.close( stream, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
      }
    }
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59331L)
  public static SubLObject html_stream_as_tokens(final SubLObject stream)
  {
    SubLObject tokens = NIL;
    tokens = xml_parsing_utilities.xml_tokenize( stream, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject cleansed = NIL;
    SubLObject cdolist_list_var = tokens;
    SubLObject token = NIL;
    token = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject clean_token = html_cleaned_token_string( token );
      if( !Sequences.length( clean_token ).isZero() )
      {
        cleansed = ConsesLow.cons( clean_token, cleansed );
      }
      cdolist_list_var = cdolist_list_var.rest();
      token = cdolist_list_var.first();
    }
    tokens = Sequences.nreverse( cleansed );
    return tokens;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59746L)
  public static SubLObject html_cleaned_token_string(SubLObject string)
  {
    string = string_utilities.nsubst_whitespace( string );
    return string_utilities.reduce_whitespace( string );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59880L)
  public static SubLObject html_property_list_to_url_parameters(final SubLObject v_properties)
  {
    assert NIL != list_utilities.property_list_p( v_properties ) : v_properties;
    final SubLObject result = streams_high.make_string_output_stream();
    SubLObject list_var = NIL;
    SubLObject item = NIL;
    SubLObject count = NIL;
    list_var = v_properties;
    item = list_var.first();
    for( count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest(), item = list_var.first(), count = Numbers.add( ONE_INTEGER, count ) )
    {
      if( NIL != Numbers.evenp( count ) )
      {
        if( !count.isZero() )
        {
          streams_high.write_string( $str175$_, result, UNPROVIDED, UNPROVIDED );
        }
        streams_high.write_string( Symbols.symbol_name( item ), result, UNPROVIDED, UNPROVIDED );
        streams_high.write_string( $str176$_, result, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        streams_high.write_string( string_utilities.to_string( item ), result, UNPROVIDED, UNPROVIDED );
      }
    }
    return streams_high.get_output_stream_string( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 60414L)
  public static SubLObject html_assocation_list_to_url_parameters(final SubLObject alist)
  {
    assert NIL != list_utilities.alist_p( alist ) : alist;
    final SubLObject result = streams_high.make_string_output_stream();
    SubLObject on_first_param = T;
    SubLObject cdolist_list_var = alist;
    SubLObject cons = NIL;
    cons = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      SubLObject current;
      final SubLObject datum = current = cons;
      SubLObject key = NIL;
      SubLObject value = NIL;
      cdestructuring_bind.destructuring_bind_must_consp( current, datum, $list178 );
      key = current.first();
      current = ( value = current.rest() );
      if( NIL == on_first_param )
      {
        streams_high.write_string( $str175$_, result, UNPROVIDED, UNPROVIDED );
      }
      else
      {
        on_first_param = NIL;
      }
      streams_high.write_string( key, result, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( $str176$_, result, UNPROVIDED, UNPROVIDED );
      streams_high.write_string( html_url_encode( string_utilities.to_string( value ), UNPROVIDED ), result, UNPROVIDED, UNPROVIDED );
      cdolist_list_var = cdolist_list_var.rest();
      cons = cdolist_list_var.first();
    }
    return streams_high.get_output_stream_string( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 60878L)
  public static SubLObject matching_open_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLObject tag_size = Sequences.length( tag );
    if( !tag_size.numE( Numbers.add( TWO_INTEGER, Sequences.length( pattern ) ) ) )
    {
      return NIL;
    }
    SubLObject index = ZERO_INTEGER;
    if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), Characters.CHAR_less ) )
    {
      return NIL;
    }
    index = Numbers.add( index, ONE_INTEGER );
    SubLObject end_var_$9;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject curr;
    for( end_var = ( end_var_$9 = Sequences.length( pattern ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$9 ); char_num = number_utilities.f_1X( char_num ) )
    {
      curr = Strings.sublisp_char( pattern, char_num );
      if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), curr ) )
      {
        return NIL;
      }
      index = Numbers.add( index, ONE_INTEGER );
    }
    if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), Characters.CHAR_greater ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 61693L)
  public static SubLObject matching_close_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test)
  {
    if( test == UNPROVIDED )
    {
      test = EQUAL;
    }
    final SubLObject tag_size = Sequences.length( tag );
    if( !tag_size.numE( Numbers.add( THREE_INTEGER, Sequences.length( pattern ) ) ) )
    {
      return NIL;
    }
    SubLObject index = ZERO_INTEGER;
    if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), Characters.CHAR_less ) )
    {
      return NIL;
    }
    index = Numbers.add( index, ONE_INTEGER );
    if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), Characters.CHAR_slash ) )
    {
      return NIL;
    }
    index = Numbers.add( index, ONE_INTEGER );
    SubLObject end_var_$10;
    SubLObject end_var;
    SubLObject char_num;
    SubLObject curr;
    for( end_var = ( end_var_$10 = Sequences.length( pattern ) ), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE( end_var_$10 ); char_num = number_utilities.f_1X( char_num ) )
    {
      curr = Strings.sublisp_char( pattern, char_num );
      if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), curr ) )
      {
        return NIL;
      }
      index = Numbers.add( index, ONE_INTEGER );
    }
    if( NIL == Functions.funcall( test, Strings.sublisp_char( tag, index ), Characters.CHAR_greater ) )
    {
      return NIL;
    }
    return T;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
  public static SubLObject clear_byte_order_mark()
  {
    final SubLObject cs = $byte_order_mark_caching_state$.getGlobalValue();
    if( NIL != cs )
    {
      memoization_state.caching_state_clear( cs );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
  public static SubLObject remove_byte_order_mark()
  {
    return memoization_state.caching_state_remove_function_results_with_args( $byte_order_mark_caching_state$.getGlobalValue(), ConsesLow.list( EMPTY_SUBL_OBJECT_ARRAY ), UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
  public static SubLObject byte_order_mark_internal()
  {
    return unicode_strings.display_to_utf8_string( $str186$_ufeff_ );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
  public static SubLObject byte_order_mark()
  {
    SubLObject caching_state = $byte_order_mark_caching_state$.getGlobalValue();
    if( NIL == caching_state )
    {
      caching_state = memoization_state.create_global_caching_state_for_name( $sym185$BYTE_ORDER_MARK, $sym187$_BYTE_ORDER_MARK_CACHING_STATE_, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER );
    }
    SubLObject results = memoization_state.caching_state_get_zero_arg_results( caching_state, UNPROVIDED );
    if( results.eql( memoization_state.$memoized_item_not_found$.getGlobalValue() ) )
    {
      results = Values.arg2( Values.resetMultipleValues(), Values.multiple_value_list( byte_order_mark_internal() ) );
      memoization_state.caching_state_set_zero_arg_results( caching_state, results, UNPROVIDED );
    }
    return memoization_state.caching_results( results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63238L)
  public static SubLObject http_response_header(final SubLObject response_string)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ZERO_INTEGER ), parse_http_response( response_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63347L)
  public static SubLObject http_response_body(final SubLObject response_string)
  {
    return Values.nth_value_step_2( Values.nth_value_step_1( ONE_INTEGER ), parse_http_response( response_string ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63454L)
  public static SubLObject parse_http_response(final SubLObject response_string)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject body_position = Sequences.search( $http_header_delimiter$.getDynamicValue( thread ), response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    final SubLObject header = body_position.isInteger() ? Sequences.subseq( response_string, ZERO_INTEGER, body_position ) : NIL;
    final SubLObject body = body_position.isInteger() ? Sequences.subseq( response_string, Numbers.add( body_position, Sequences.length( $http_header_delimiter$.getDynamicValue( thread ) ) ), UNPROVIDED )
        : response_string;
    return Values.values( header, string_utilities.pre_remove( body, byte_order_mark(), UNPROVIDED ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63891L)
  public static SubLObject http_format_query(final SubLObject query)
  {
    return PrintLow.format( NIL, $str188$___A__A_____, Mapping.mapcar( $sym189$HTML_ENCODE_SEXPR, Functions.apply( Symbols.symbol_function( $sym190$APPEND ), query ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64048L)
  public static SubLObject html_encode_sexpr(final SubLObject sexpr)
  {
    return html_url_encode( format_nil.format_nil_a( sexpr ), UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64134L)
  public static SubLObject http_retrieve(final SubLObject query, final SubLObject path, final SubLObject host, final SubLObject port, SubLObject method, SubLObject max_chars, SubLObject accept_types,
      SubLObject follow_redirectsP, SubLObject timeout)
  {
    if( method == UNPROVIDED )
    {
      method = $kw54$POST;
    }
    if( max_chars == UNPROVIDED )
    {
      max_chars = NIL;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw8$DEFAULT;
    }
    if( follow_redirectsP == UNPROVIDED )
    {
      follow_redirectsP = NIL;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject query_string = NIL;
    SubLObject reply = NIL;
    if( query.isString() )
    {
      query_string = query;
    }
    else
    {
      query_string = http_format_query( query );
    }
    final SubLObject real_port = port.eql( $kw8$DEFAULT ) ? $int19$80 : port;
    SubLObject channel = NIL;
    try
    {
      channel = subl_promotions.open_tcp_stream_with_timeout( host, real_port, timeout, $kw22$PRIVATE );
      if( NIL != subl_macro_promotions.validate_tcp_connection( channel, host, real_port ) )
      {
        send_http_request( channel, ConsesLow.list( new SubLObject[] { $kw25$MACHINE, host, $kw7$PORT, port, $kw5$METHOD, method, $kw26$URL, path, $kw4$QUERY, query_string, $kw9$KEEP_ALIVE_, NIL, $kw10$WIDE_NEWLINES_, T,
          $kw12$ACCEPT_TYPES, accept_types, $kw13$CONTENT_TYPE, $kw8$DEFAULT, $kw14$SOAP_ACTION_URI, NIL
        } ) );
        reply = slack_read_until_eof( channel, max_chars );
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        if( NIL != channel )
        {
          streams_high.close( channel, UNPROVIDED );
        }
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    thread.resetMultipleValues();
    final SubLObject header = parse_http_response( reply );
    final SubLObject body = thread.secondMultipleValue();
    thread.resetMultipleValues();
    if( NIL != follow_redirectsP && NIL != html_redirection_header_p( header ) )
    {
      return http_retrieve_via_redirection( header, max_chars, accept_types );
    }
    return body;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64979L)
  public static SubLObject http_retrieve_via_redirection(final SubLObject header, SubLObject max_chars, SubLObject accept_types)
  {
    if( max_chars == UNPROVIDED )
    {
      max_chars = NIL;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw8$DEFAULT;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject fields = string_utilities.string_tokenize( header, $http_header_field_delimiters$.getDynamicValue( thread ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED );
    SubLObject new_url = NIL;
    if( NIL == new_url )
    {
      SubLObject csome_list_var = fields;
      SubLObject field = NIL;
      field = csome_list_var.first();
      while ( NIL == new_url && NIL != csome_list_var)
      {
        if( NIL != string_utilities.starts_with_by_test( field, $str132$Location__, Symbols.symbol_function( EQUALP ) ) )
        {
          new_url = string_utilities.pre_remove( field, $str132$Location__, Symbols.symbol_function( EQUALP ) );
        }
        csome_list_var = csome_list_var.rest();
        field = csome_list_var.first();
      }
    }
    return ( NIL != new_url ) ? dereference_url( new_url, max_chars, accept_types, UNPROVIDED, UNPROVIDED ) : string_utilities.$empty_string$.getGlobalValue();
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 65480L)
  public static SubLObject get_html_source_from_url(final SubLObject url, SubLObject max_chars, SubLObject accept_types)
  {
    if( max_chars == UNPROVIDED )
    {
      max_chars = NIL;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $list191;
    }
    return dereference_url( url, max_chars, accept_types, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 65699L)
  public static SubLObject dereference_url(SubLObject url, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout)
  {
    if( max_chars == UNPROVIDED )
    {
      max_chars = NIL;
    }
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw8$DEFAULT;
    }
    if( follow_redirectsP == UNPROVIDED )
    {
      follow_redirectsP = NIL;
    }
    if( timeout == UNPROVIDED )
    {
      timeout = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject source = NIL;
    if( NIL == url_p( url ) )
    {
      url = Sequences.cconcatenate( $str134$http___, url );
    }
    if( NIL != string_utilities.starts_with( Strings.string_downcase( url, UNPROVIDED, UNPROVIDED ), $str134$http___ ) || NIL != string_utilities.starts_with( Strings.string_downcase( url, UNPROVIDED, UNPROVIDED ),
        $str135$https___ ) )
    {
      thread.resetMultipleValues();
      SubLObject machine = parse_http_url( url );
      final SubLObject port = thread.secondMultipleValue();
      SubLObject path = thread.thirdMultipleValue();
      final SubLObject query = thread.fourthMultipleValue();
      thread.resetMultipleValues();
      if( NIL == machine )
      {
        machine = url;
      }
      if( NIL == path )
      {
        path = $str29$_;
      }
      source = http_retrieve( query, path, machine, port, $kw6$GET, max_chars, accept_types, follow_redirectsP, timeout );
    }
    else if( NIL != string_utilities.starts_with( Strings.string_downcase( url, UNPROVIDED, UNPROVIDED ), $str192$file___ ) )
    {
      final SubLObject path2 = string_utilities.pre_remove( url, $str192$file___, Symbols.symbol_function( EQUALP ) );
      assert NIL != file_utilities.file_existsP( path2 ) : path2;
      source = string_utilities.read_string_from_file( path2, UNPROVIDED, UNPROVIDED );
    }
    return source;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 66510L)
  public static SubLObject save_url_to_file(final SubLObject url, final SubLObject filepath, SubLObject accept_types, SubLObject follow_redirectsP)
  {
    if( accept_types == UNPROVIDED )
    {
      accept_types = $kw8$DEFAULT;
    }
    if( follow_redirectsP == UNPROVIDED )
    {
      follow_redirectsP = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject error_message = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym140$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject source = dereference_url( url, NIL, accept_types, follow_redirectsP, UNPROVIDED );
          SubLObject stream = NIL;
          try
          {
            stream = compatibility.open_text( filepath, $kw194$OUTPUT );
            if( !stream.isStream() )
            {
              Errors.error( $str173$Unable_to_open__S, filepath );
            }
            final SubLObject out = stream;
            print_high.princ( source, out );
          }
          finally
          {
            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
            try
            {
              Threads.$is_thread_performing_cleanupP$.bind( T, thread );
              final SubLObject _values = Values.getValuesAsVector();
              if( stream.isStream() )
              {
                streams_high.close( stream, UNPROVIDED );
              }
              Values.restoreValuesFromVector( _values );
            }
            finally
            {
              Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$11, thread );
            }
          }
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      error_message = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    return error_message;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 66891L)
  public static SubLObject servlet_container_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return Numbers.add( system_parameters.$base_tcp_port$.getDynamicValue( thread ), system_parameters.$servlet_port_offset$.getDynamicValue( thread ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67291L)
  public static SubLObject effective_servlet_container_port()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != local_servlet_container_runningP() )
    {
      return servlet_container_port();
    }
    return $alternate_servlet_container_port$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67753L)
  public static SubLObject effective_servlet_container_host()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != local_servlet_container_runningP() )
    {
      return misc_utilities.hostname();
    }
    return $alternate_servlet_container_host$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68350L)
  public static SubLObject local_servlet_container_runningP()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return $local_servlet_container_runningP$.getDynamicValue( thread );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  public static SubLObject restart_servlet_container(SubLObject port)
  {
    if( port == UNPROVIDED )
    {
      port = servlet_container_port();
    }
    stop_servlet_container();
    return start_servlet_container( port );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  public static SubLObject start_servlet_container(SubLObject port)
  {
    if( port == UNPROVIDED )
    {
      port = servlet_container_port();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject err = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym140$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          final SubLObject war_files = get_war_file_descriptions();
          final SubLObject ret_value = Functions.funcall( $sym195$START_SERVLET_CONTAINER_INT, port, war_files, servlet_container_tmp_dir_string() );
          $local_servlet_container_runningP$.setDynamicValue( T, thread );
          return ret_value;
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err )
    {
      Errors.warn( err );
    }
    return port;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  public static SubLObject stop_servlet_container()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject err = NIL;
    try
    {
      thread.throwStack.push( subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
      final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding( thread );
      try
      {
        Errors.$error_handler$.bind( $sym140$CATCH_ERROR_MESSAGE_HANDLER, thread );
        try
        {
          Functions.funcall( $sym200$STOP_SERVLET_CONTAINER_INT, servlet_container_tmp_dir_string() );
          $local_servlet_container_runningP$.setDynamicValue( NIL, thread );
        }
        catch( final Throwable catch_var )
        {
          Errors.handleThrowable( catch_var, NIL );
        }
      }
      finally
      {
        Errors.$error_handler$.rebind( _prev_bind_0, thread );
      }
    }
    catch( final Throwable ccatch_env_var )
    {
      err = Errors.handleThrowable( ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue() );
    }
    finally
    {
      thread.throwStack.pop();
    }
    if( NIL != err )
    {
      Errors.warn( err );
    }
    return $kw201$STOPPED;
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  public static SubLObject servlet_container_tmp_dir_string()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    return file_utilities.possibly_append_path_separator_char( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( file_utilities.temp_directory() ), new SubLObject[] { $str202$cyc_servlet_container_tmp_dir_,
      format_nil.format_nil_a_no_copy( Environment.get_user_name( UNPROVIDED ) ), $str203$_, format_nil.format_nil_a_no_copy( system_parameters.$base_tcp_port$.getDynamicValue( thread ) )
    } ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
  public static SubLObject get_war_file_descriptions()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != Filesys.probe_file( $webapp_manifest_path$.getGlobalValue() ) )
    {
      SubLObject stream = NIL;
      try
      {
        final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding( thread );
        try
        {
          stream_macros.$stream_requires_locking$.bind( NIL, thread );
          stream = compatibility.open_text( $webapp_manifest_path$.getGlobalValue(), $kw172$INPUT );
        }
        finally
        {
          stream_macros.$stream_requires_locking$.rebind( _prev_bind_0, thread );
        }
        if( !stream.isStream() )
        {
          Errors.error( $str173$Unable_to_open__S, $webapp_manifest_path$.getGlobalValue() );
        }
        final SubLObject in = stream;
        SubLObject tokens = xml_parsing_utilities.xml_tokenize( in, UNPROVIDED, UNPROVIDED, UNPROVIDED );
        SubLObject webapps = NIL;
        SubLObject wars = NIL;
        while ( NIL != tokens && NIL == list_utilities.proper_list_p( webapps ))
        {
          thread.resetMultipleValues();
          final SubLObject webapps_$12 = xml_parsing_utilities.xml_tokens_to_sexpr( tokens );
          final SubLObject tokens_$13 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          webapps = webapps_$12;
          tokens = tokens_$13;
        }
        SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters( webapps, $str207$webapp );
        SubLObject webapp = NIL;
        webapp = cdolist_list_var.first();
        while ( NIL != cdolist_list_var)
        {
          final SubLObject warfile = xml_parsing_utilities.xml_sexpr_value( xml_parsing_utilities.xml_sexpr_daughter( webapp, $str205$filename ) );
          final SubLObject v_context = xml_parsing_utilities.xml_sexpr_value( xml_parsing_utilities.xml_sexpr_daughter( webapp, $str206$contextRoot ) );
          wars = ConsesLow.cons( reader.bq_cons( warfile, v_context ), wars );
          cdolist_list_var = cdolist_list_var.rest();
          webapp = cdolist_list_var.first();
        }
        return wars;
      }
      finally
      {
        final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          if( stream.isStream() )
          {
            streams_high.close( stream, UNPROVIDED );
          }
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_2, thread );
        }
      }
    }
    Errors.warn( $str208$Unable_to_find_webapp_manifest_fi, $webapp_manifest_path$.getGlobalValue() );
    return NIL;
  }

  public static SubLObject declare_web_utilities_file()
  {
    SubLFiles.declareMacro( me, "with_http_request", "WITH-HTTP-REQUEST" );
    SubLFiles.declareFunction( me, "http_read_request", "HTTP-READ-REQUEST", 1, 1, false );
    SubLFiles.declareFunction( me, "make_html_cyc_login_session", "MAKE-HTML-CYC-LOGIN-SESSION", 0, 0, false );
    SubLFiles.declareFunction( me, "destroy_cyc_login_session", "DESTROY-CYC-LOGIN-SESSION", 1, 0, false );
    SubLFiles.declareFunction( me, "cyc_login_session_id_machine_name", "CYC-LOGIN-SESSION-ID-MACHINE-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "valid_html_cyc_login_session_idP", "VALID-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false );
    SubLFiles.declareFunction( me, "current_html_cyc_login_session_idP", "CURRENT-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false );
    SubLFiles.declareFunction( me, "http_possibly_repack_request", "HTTP-POSSIBLY-REPACK-REQUEST", 4, 0, false );
    SubLFiles.declareFunction( me, "within_html_cyc_login_sessionP", "WITHIN-HTML-CYC-LOGIN-SESSION?", 0, 0, false );
    SubLFiles.declareFunction( me, "possibly_add_html_javascript_redirect_when_top_level_page", "POSSIBLY-ADD-HTML-JAVASCRIPT-REDIRECT-WHEN-TOP-LEVEL-PAGE", 0, 0, false );
    SubLFiles.declareFunction( me, "http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false );
    SubLFiles.declareFunction( me, "http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false );
    SubLFiles.declareFunction( me, "send_http_request", "SEND-HTTP-REQUEST", 2, 0, false );
    SubLFiles.declareFunction( me, "http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 3, false );
    SubLFiles.declareFunction( me, "test_http_request", "TEST-HTTP-REQUEST", 2, 1, false );
    SubLFiles.declareMacro( me, "http_with_cookies", "HTTP-WITH-COOKIES" );
    SubLFiles.declareFunction( me, "get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false );
    SubLFiles.declareFunction( me, "http_send_generic_request", "HTTP-SEND-GENERIC-REQUEST", 11, 2, false );
    SubLFiles.declareFunction( me, "http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 3, false );
    SubLFiles.declareFunction( me, "http_send_put_request", "HTTP-SEND-PUT-REQUEST", 7, 3, false );
    SubLFiles.declareFunction( me, "http_send_delete_request", "HTTP-SEND-DELETE-REQUEST", 7, 3, false );
    SubLFiles.declareFunction( me, "http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false );
    SubLFiles.declareFunction( me, "http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false );
    SubLFiles.declareFunction( me, "http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false );
    SubLFiles.declareFunction( me, "http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false );
    SubLFiles.declareFunction( me, "filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false );
    SubLFiles.declareFunction( me, "http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_url_encode", "HTML-URL-ENCODE", 1, 1, false );
    SubLFiles.declareFunction( me, "html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false );
    new $html_url_expand_char$UnaryFunction();
    SubLFiles.declareFunction( me, "html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_url_decode", "HTML-URL-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "decode_url_percent_encoded_char", "DECODE-URL-PERCENT-ENCODED-CHAR", 2, 0, false );
    SubLFiles.declareFunction( me, "html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false );
    SubLFiles.declareFunction( me, "html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "html_decode_fort", "HTML-DECODE-FORT", 1, 0, false );
    SubLFiles.declareFunction( me, "uri_p", "URI-P", 1, 1, false );
    SubLFiles.declareFunction( me, "url_p", "URL-P", 1, 0, false );
    new $url_p$UnaryFunction();
    SubLFiles.declareFunction( me, "url_host", "URL-HOST", 1, 0, false );
    SubLFiles.declareFunction( me, "url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false );
    SubLFiles.declareFunction( me, "absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false );
    SubLFiles.declareFunction( me, "uri_scheme_p", "URI-SCHEME-P", 1, 3, false );
    SubLFiles.declareFunction( me, "find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false );
    SubLFiles.declareFunction( me, "find_url_end", "FIND-URL-END", 1, 2, false );
    SubLFiles.declareFunction( me, "valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false );
    SubLFiles.declareFunction( me, "remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false );
    SubLFiles.declareFunction( me, "uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_soap_name", "CLEAR-SOAP-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_soap_name", "REMOVE-SOAP-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "soap_name_internal", "SOAP-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "soap_name", "SOAP-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_soap_expanded_name", "CLEAR-SOAP-EXPANDED-NAME", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_soap_expanded_name", "REMOVE-SOAP-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "soap_expanded_name_internal", "SOAP-EXPANDED-NAME-INTERNAL", 1, 0, false );
    SubLFiles.declareFunction( me, "soap_expanded_name", "SOAP-EXPANDED-NAME", 1, 0, false );
    SubLFiles.declareFunction( me, "soap_envelope_sexpr_p", "SOAP-ENVELOPE-SEXPR-P", 1, 0, false );
    SubLFiles.declareFunction( me, "clear_perform_soap_post_cached", "CLEAR-PERFORM-SOAP-POST-CACHED", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_perform_soap_post_cached", "REMOVE-PERFORM-SOAP-POST-CACHED", 4, 2, false );
    SubLFiles.declareFunction( me, "perform_soap_post_cached_internal", "PERFORM-SOAP-POST-CACHED-INTERNAL", 6, 0, false );
    SubLFiles.declareFunction( me, "perform_soap_post_cached", "PERFORM-SOAP-POST-CACHED", 4, 2, false );
    SubLFiles.declareFunction( me, "perform_soap_post", "PERFORM-SOAP-POST", 4, 2, false );
    SubLFiles.declareFunction( me, "make_soap_message", "MAKE-SOAP-MESSAGE", 3, 3, false );
    SubLFiles.declareFunction( me, "get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false );
    SubLFiles.declareFunction( me, "html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false );
    SubLFiles.declareFunction( me, "html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_http_url", "PARSE-HTTP-URL", 1, 0, false );
    SubLFiles.declareFunction( me, "read_until_eof", "READ-UNTIL-EOF", 1, 1, false );
    SubLFiles.declareFunction( me, "read_until_char", "READ-UNTIL-CHAR", 2, 1, false );
    SubLFiles.declareFunction( me, "read_while", "READ-WHILE", 2, 1, false );
    SubLFiles.declareFunction( me, "read_until_char_unless", "READ-UNTIL-CHAR-UNLESS", 3, 1, false );
    SubLFiles.declareFunction( me, "read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false );
    SubLFiles.declareFunction( me, "slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false );
    SubLFiles.declareMacro( me, "try_error_message", "TRY-ERROR-MESSAGE" );
    SubLFiles.declareFunction( me, "slack_read_char", "SLACK-READ-CHAR", 0, 4, false );
    SubLFiles.declareFunction( me, "read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false );
    SubLFiles.declareFunction( me, "write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false );
    SubLFiles.declareFunction( me, "http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false );
    SubLFiles.declareFunction( me, "write_http_date", "WRITE-HTTP-DATE", 1, 1, false );
    SubLFiles.declareFunction( me, "http_date_string", "HTTP-DATE-STRING", 0, 1, false );
    SubLFiles.declareMacro( me, "html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD" );
    SubLFiles.declareMacro( me, "html_tokens_step", "HTML-TOKENS-STEP" );
    SubLFiles.declareMacro( me, "html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO" );
    SubLFiles.declareMacro( me, "html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST" );
    SubLFiles.declareMacro( me, "html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR" );
    SubLFiles.declareFunction( me, "is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false );
    SubLFiles.declareFunction( me, "test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false );
    SubLFiles.declareMacro( me, "html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG" );
    SubLFiles.declareMacro( me, "html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG" );
    SubLFiles.declareMacro( me, "html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT" );
    SubLFiles.declareMacro( me, "html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT" );
    SubLFiles.declareMacro( me, "html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT" );
    SubLFiles.declareFunction( me, "html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false );
    SubLFiles.declareFunction( me, "html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "html_assocation_list_to_url_parameters", "HTML-ASSOCATION-LIST-TO-URL-PARAMETERS", 1, 0, false );
    SubLFiles.declareFunction( me, "matching_open_tagP", "MATCHING-OPEN-TAG?", 2, 1, false );
    SubLFiles.declareFunction( me, "matching_close_tagP", "MATCHING-CLOSE-TAG?", 2, 1, false );
    SubLFiles.declareFunction( me, "clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false );
    SubLFiles.declareFunction( me, "remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false );
    SubLFiles.declareFunction( me, "byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false );
    SubLFiles.declareFunction( me, "byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false );
    SubLFiles.declareFunction( me, "http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false );
    SubLFiles.declareFunction( me, "http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false );
    SubLFiles.declareFunction( me, "parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false );
    SubLFiles.declareFunction( me, "http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false );
    SubLFiles.declareFunction( me, "html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false );
    SubLFiles.declareFunction( me, "http_retrieve", "HTTP-RETRIEVE", 4, 5, false );
    SubLFiles.declareFunction( me, "http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false );
    SubLFiles.declareFunction( me, "get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false );
    SubLFiles.declareFunction( me, "dereference_url", "DEREFERENCE-URL", 1, 4, false );
    SubLFiles.declareFunction( me, "save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false );
    SubLFiles.declareFunction( me, "servlet_container_port", "SERVLET-CONTAINER-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "effective_servlet_container_port", "EFFECTIVE-SERVLET-CONTAINER-PORT", 0, 0, false );
    SubLFiles.declareFunction( me, "effective_servlet_container_host", "EFFECTIVE-SERVLET-CONTAINER-HOST", 0, 0, false );
    SubLFiles.declareFunction( me, "local_servlet_container_runningP", "LOCAL-SERVLET-CONTAINER-RUNNING?", 0, 0, false );
    SubLFiles.declareFunction( me, "restart_servlet_container", "RESTART-SERVLET-CONTAINER", 0, 1, false );
    SubLFiles.declareFunction( me, "start_servlet_container", "START-SERVLET-CONTAINER", 0, 1, false );
    SubLFiles.declareFunction( me, "stop_servlet_container", "STOP-SERVLET-CONTAINER", 0, 0, false );
    SubLFiles.declareFunction( me, "servlet_container_tmp_dir_string", "SERVLET-CONTAINER-TMP-DIR-STRING", 0, 0, false );
    SubLFiles.declareFunction( me, "get_war_file_descriptions", "GET-WAR-FILE-DESCRIPTIONS", 0, 0, false );
    return NIL;
  }

  public static SubLObject init_web_utilities_file()
  {
    $http_default_accept_types$ = SubLFiles.deflexical( "*HTTP-DEFAULT-ACCEPT-TYPES*", $list0 );
    $decode_urls_during_http_read_request$ = SubLFiles.deflexical( "*DECODE-URLS-DURING-HTTP-READ-REQUEST*", NIL );
    $http_alternate_uri_format_a_prefix$ = SubLFiles.deflexical( "*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*", $str27$_a_ );
    $html_alternate_uri_format_session_id_length$ = SubLFiles.deflexical( "*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*", FIVE_INTEGER );
    $html_cyc_login_session_string_to_remote_host$ = SubLFiles.deflexical( "*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*", maybeDefault( $sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_,
        $html_cyc_login_session_string_to_remote_host$, () -> ( dictionary.new_dictionary( Symbols.symbol_function( EQUAL ), UNPROVIDED ) ) ) );
    $html_possibly_redirect_to_portal_script$ = SubLFiles.deflexical( "*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*", $str33$var_KEA_port_from_cyc_base_port__ );
    $http_informational_codes$ = SubLFiles.deflexical( "*HTTP-INFORMATIONAL-CODES*", $list34 );
    $http_success_codes$ = SubLFiles.deflexical( "*HTTP-SUCCESS-CODES*", $list35 );
    $http_redirection_codes$ = SubLFiles.deflexical( "*HTTP-REDIRECTION-CODES*", $list36 );
    $http_client_error_codes$ = SubLFiles.deflexical( "*HTTP-CLIENT-ERROR-CODES*", $list37 );
    $http_server_error_codes$ = SubLFiles.deflexical( "*HTTP-SERVER-ERROR-CODES*", $list38 );
    $http_error_codes$ = SubLFiles.deflexical( "*HTTP-ERROR-CODES*", ConsesLow.append( $http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue() ) );
    $http_status_codes$ = SubLFiles.deflexical( "*HTTP-STATUS-CODES*", ConsesLow.append( new SubLObject[] { $http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$
        .getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue()
    } ) );
    $http_get_request_template_components$ = SubLFiles.deflexical( "*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list41 );
    $http_get_request_template_order$ = SubLFiles.deflexical( "*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar( $sym42$FIRST, $http_get_request_template_components$.getGlobalValue() ) );
    $http_post_default_content_type$ = SubLFiles.deflexical( "*HTTP-POST-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded );
    $http_post_request_template_components$ = SubLFiles.deflexical( "*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list44 );
    $http_post_request_template_order$ = SubLFiles.deflexical( "*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar( $sym42$FIRST, $http_post_request_template_components$.getGlobalValue() ) );
    $http_put_default_content_type$ = SubLFiles.deflexical( "*HTTP-PUT-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded );
    $http_put_request_template_components$ = SubLFiles.deflexical( "*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*", $list45 );
    $http_put_request_template_order$ = SubLFiles.deflexical( "*HTTP-PUT-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar( $sym42$FIRST, $http_put_request_template_components$.getGlobalValue() ) );
    $http_delete_default_content_type$ = SubLFiles.deflexical( "*HTTP-DELETE-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded );
    $http_delete_request_template_components$ = SubLFiles.deflexical( "*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*", $list46 );
    $http_delete_request_template_order$ = SubLFiles.deflexical( "*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar( $sym42$FIRST, $http_delete_request_template_components$.getGlobalValue() ) );
    $trace_http_send_post_requests$ = SubLFiles.defparameter( "*TRACE-HTTP-SEND-POST-REQUESTS*", NIL );
    $trace_http_send_put_requests$ = SubLFiles.defparameter( "*TRACE-HTTP-SEND-PUT-REQUESTS*", NIL );
    $trace_http_send_delete_requests$ = SubLFiles.defparameter( "*TRACE-HTTP-SEND-DELETE-REQUESTS*", NIL );
    $http_cookies_to_include_in_requests$ = SubLFiles.defparameter( "*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL );
    $http_header_cookie_keyword$ = SubLFiles.deflexical( "*HTTP-HEADER-COOKIE-KEYWORD*", $str81$Set_Cookie_ );
    $http_cookie_separation_charset$ = SubLFiles.deflexical( "*HTTP-COOKIE-SEPARATION-CHARSET*", ConsesLow.list( Characters.CHAR_semicolon ) );
    $http_filtered_predefined_named_cookie_attributes$ = SubLFiles.deflexical( "*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", ConsesLow.list( $str83$domain, $str84$expires, $str85$max_age ) );
    $official_uri_schemes$ = SubLFiles.deflexical( "*OFFICIAL-URI-SCHEMES*", $list98 );
    $unofficial_uri_schemes$ = SubLFiles.deflexical( "*UNOFFICIAL-URI-SCHEMES*", $list99 );
    $valid_url_beginnings$ = SubLFiles.defconstant( "*VALID-URL-BEGINNINGS*", $list100 );
    $url_delimiters$ = SubLFiles.defconstant( "*URL-DELIMITERS*", $list101 );
    $valid_non_alphanumeric_url_chars$ = SubLFiles.deflexical( "*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str103$_____________________ );
    $soap_envelope_uri$ = SubLFiles.deflexical( "*SOAP-ENVELOPE-URI*", $str114$http___schemas_xmlsoap_org_soap_e );
    $soap_name_caching_state$ = SubLFiles.deflexical( "*SOAP-NAME-CACHING-STATE*", NIL );
    $soap_expanded_name_caching_state$ = SubLFiles.deflexical( "*SOAP-EXPANDED-NAME-CACHING-STATE*", NIL );
    $perform_soap_post_cached_caching_state$ = SubLFiles.deflexical( "*PERFORM-SOAP-POST-CACHED-CACHING-STATE*", NIL );
    $cgi_host$ = SubLFiles.defparameter( "*CGI-HOST*", $str183$localhost );
    $cgi_port$ = SubLFiles.defparameter( "*CGI-PORT*", $int19$80 );
    $cgi_path$ = SubLFiles.defparameter( "*CGI-PATH*", $str184$_cgi_bin_services );
    $http_header_delimiter$ = SubLFiles.defparameter( "*HTTP-HEADER-DELIMITER*", Sequences.cconcatenate( format_nil.format_nil_a_no_copy( Characters.CHAR_return ), new SubLObject[] { format_nil.format_nil_a_no_copy(
        Characters.CHAR_newline ), format_nil.format_nil_a_no_copy( Characters.CHAR_return ), format_nil.format_nil_a_no_copy( Characters.CHAR_newline )
    } ) );
    $http_header_field_delimiters$ = SubLFiles.defparameter( "*HTTP-HEADER-FIELD-DELIMITERS*", ConsesLow.list( Sequences.cconcatenate( format_nil.format_nil_a_no_copy( Characters.CHAR_return ), format_nil
        .format_nil_a_no_copy( Characters.CHAR_newline ) ), Strings.make_string( ONE_INTEGER, Characters.CHAR_newline ) ) );
    $byte_order_mark_caching_state$ = SubLFiles.deflexical( "*BYTE-ORDER-MARK-CACHING-STATE*", NIL );
    $alternate_servlet_container_port$ = SubLFiles.defparameter( "*ALTERNATE-SERVLET-CONTAINER-PORT*", NIL );
    $alternate_servlet_container_host$ = SubLFiles.defparameter( "*ALTERNATE-SERVLET-CONTAINER-HOST*", NIL );
    $local_servlet_container_runningP$ = SubLFiles.defparameter( "*LOCAL-SERVLET-CONTAINER-RUNNING?*", NIL );
    $webapp_manifest_path$ = SubLFiles.deflexical( "*WEBAPP-MANIFEST-PATH*", $str204$webapps_apps_webapp_manifest_xml );
    return NIL;
  }

  public static SubLObject setup_web_utilities_file()
  {
    subl_macro_promotions.declare_defglobal( $sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_ );
    generic_testing.define_test_case_table_int( $sym106$RESOLVE_RELATIVE_URI, ConsesLow.list( new SubLObject[] { $kw107$TEST, NIL, $kw108$OWNER, NIL, $kw109$CLASSES, NIL, $kw110$KB, $kw111$TINY, $kw112$WORKING_, T
    } ), $list113 );
    memoization_state.note_globally_cached_function( $sym115$SOAP_NAME );
    memoization_state.note_globally_cached_function( $sym118$SOAP_EXPANDED_NAME );
    memoization_state.note_globally_cached_function( $sym121$PERFORM_SOAP_POST_CACHED );
    generic_testing.define_test_case_table_int( $sym179$MATCHING_OPEN_TAG_, ConsesLow.list( new SubLObject[] { $kw107$TEST, NIL, $kw108$OWNER, NIL, $kw109$CLASSES, NIL, $kw110$KB, $kw111$TINY, $kw112$WORKING_, T
    } ), $list180 );
    generic_testing.define_test_case_table_int( $sym181$MATCHING_CLOSE_TAG_, ConsesLow.list( new SubLObject[] { $kw107$TEST, NIL, $kw108$OWNER, NIL, $kw109$CLASSES, NIL, $kw110$KB, $kw111$TINY, $kw112$WORKING_, T
    } ), $list182 );
    memoization_state.note_globally_cached_function( $sym185$BYTE_ORDER_MARK );
    utilities_macros.note_funcall_helper_function( $sym197$START_SERVLET_CONTAINER );
    tcp_server_utilities.register_tcp_server_type( $kw198$SERVLET, $list199, UNPROVIDED );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_web_utilities_file();
  }

  @Override
  public void initializeVariables()
  {
    init_web_utilities_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_web_utilities_file();
  }
  static
  {
    me = new web_utilities();
    $http_default_accept_types$ = null;
    $decode_urls_during_http_read_request$ = null;
    $http_alternate_uri_format_a_prefix$ = null;
    $html_alternate_uri_format_session_id_length$ = null;
    $html_cyc_login_session_string_to_remote_host$ = null;
    $html_possibly_redirect_to_portal_script$ = null;
    $http_informational_codes$ = null;
    $http_success_codes$ = null;
    $http_redirection_codes$ = null;
    $http_client_error_codes$ = null;
    $http_server_error_codes$ = null;
    $http_error_codes$ = null;
    $http_status_codes$ = null;
    $http_get_request_template_components$ = null;
    $http_get_request_template_order$ = null;
    $http_post_default_content_type$ = null;
    $http_post_request_template_components$ = null;
    $http_post_request_template_order$ = null;
    $http_put_default_content_type$ = null;
    $http_put_request_template_components$ = null;
    $http_put_request_template_order$ = null;
    $http_delete_default_content_type$ = null;
    $http_delete_request_template_components$ = null;
    $http_delete_request_template_order$ = null;
    $trace_http_send_post_requests$ = null;
    $trace_http_send_put_requests$ = null;
    $trace_http_send_delete_requests$ = null;
    $http_cookies_to_include_in_requests$ = null;
    $http_header_cookie_keyword$ = null;
    $http_cookie_separation_charset$ = null;
    $http_filtered_predefined_named_cookie_attributes$ = null;
    $official_uri_schemes$ = null;
    $unofficial_uri_schemes$ = null;
    $valid_url_beginnings$ = null;
    $url_delimiters$ = null;
    $valid_non_alphanumeric_url_chars$ = null;
    $soap_envelope_uri$ = null;
    $soap_name_caching_state$ = null;
    $soap_expanded_name_caching_state$ = null;
    $perform_soap_post_cached_caching_state$ = null;
    $cgi_host$ = null;
    $cgi_port$ = null;
    $cgi_path$ = null;
    $http_header_delimiter$ = null;
    $http_header_field_delimiters$ = null;
    $byte_order_mark_caching_state$ = null;
    $alternate_servlet_container_port$ = null;
    $alternate_servlet_container_host$ = null;
    $local_servlet_container_runningP$ = null;
    $webapp_manifest_path$ = null;
    $list0 = ConsesLow.list( makeString( "text/plain" ), makeString( "text/html" ) );
    $list1 = ConsesLow.list( ConsesLow.list( new SubLObject[] { makeSymbol( "CHANNEL" ), makeSymbol( "MACHINE" ), makeSymbol( "URL" ), makeSymbol( "&KEY" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "METHOD" ),
        makeKeyword( "GET" ) ), ConsesLow.list( makeSymbol( "PORT" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "KEEP-ALIVE?" ), T ), ConsesLow.list( makeSymbol( "WIDE-NEWLINES?" ), NIL ), makeSymbol(
            "TIMEOUT" ), ConsesLow.list( makeSymbol( "ACCEPT-TYPES" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "CONTENT-TYPE" ), makeKeyword( "DEFAULT" ) ), makeSymbol( "SOAP-ACTION-URI" )
    } ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list2 = ConsesLow.list( new SubLObject[] { makeKeyword( "QUERY" ), makeKeyword( "METHOD" ), makeKeyword( "PORT" ), makeKeyword( "KEEP-ALIVE?" ), makeKeyword( "WIDE-NEWLINES?" ), makeKeyword( "TIMEOUT" ),
      makeKeyword( "ACCEPT-TYPES" ), makeKeyword( "CONTENT-TYPE" ), makeKeyword( "SOAP-ACTION-URI" )
    } );
    $kw3$ALLOW_OTHER_KEYS = makeKeyword( "ALLOW-OTHER-KEYS" );
    $kw4$QUERY = makeKeyword( "QUERY" );
    $kw5$METHOD = makeKeyword( "METHOD" );
    $kw6$GET = makeKeyword( "GET" );
    $kw7$PORT = makeKeyword( "PORT" );
    $kw8$DEFAULT = makeKeyword( "DEFAULT" );
    $kw9$KEEP_ALIVE_ = makeKeyword( "KEEP-ALIVE?" );
    $kw10$WIDE_NEWLINES_ = makeKeyword( "WIDE-NEWLINES?" );
    $kw11$TIMEOUT = makeKeyword( "TIMEOUT" );
    $kw12$ACCEPT_TYPES = makeKeyword( "ACCEPT-TYPES" );
    $kw13$CONTENT_TYPE = makeKeyword( "CONTENT-TYPE" );
    $kw14$SOAP_ACTION_URI = makeKeyword( "SOAP-ACTION-URI" );
    $sym15$REAL_PORT = makeUninternedSymbol( "REAL-PORT" );
    $sym16$CLET = makeSymbol( "CLET" );
    $sym17$FIF = makeSymbol( "FIF" );
    $list18 = ConsesLow.list( makeKeyword( "DEFAULT" ) );
    $int19$80 = makeInteger( 80 );
    $sym20$WITH_TCP_CONNECTION = makeSymbol( "WITH-TCP-CONNECTION" );
    $kw21$ACCESS_MODE = makeKeyword( "ACCESS-MODE" );
    $kw22$PRIVATE = makeKeyword( "PRIVATE" );
    $sym23$SEND_HTTP_REQUEST = makeSymbol( "SEND-HTTP-REQUEST" );
    $sym24$LIST = makeSymbol( "LIST" );
    $kw25$MACHINE = makeKeyword( "MACHINE" );
    $kw26$URL = makeKeyword( "URL" );
    $str27$_a_ = makeString( "/a/" );
    $sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_ = makeSymbol( "*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*" );
    $str29$_ = makeString( "/" );
    $str30$_cg_ = makeString( "/cg?" );
    $list31 = ConsesLow.list( Characters.CHAR_slash );
    $str32$Remote_Host = makeString( "Remote-Host" );
    $str33$var_KEA_port_from_cyc_base_port__ = makeString(
        "var KEA_port_from_cyc_base_port = function () {\n  var DEFAULT_PORT_STR = \"80\";\n  var portStr = (window.document.location.port.length > 0) ? window.document.location.port : DEFAULT_PORT_STR;\n  var offset = parseInt(portStr.substring(portStr.length - 1));\n  var port = parseInt(portStr);\n\n  if (offset == 2) return (port + 1);\n  return port;\n}\nif (window==window.top) {\n  var url = \"http://\" + window.document.location.hostname + \":\" + KEA_port_from_cyc_base_port() + \"/?toolURL=\" + encodeURIComponent(window.location.href) + \"&sessionId=~A\";\n  window.location.href=url;\n}" );
    $list34 = ConsesLow.list( ConsesLow.cons( makeInteger( 100 ), makeString( "Continue" ) ), ConsesLow.cons( makeInteger( 101 ), makeString( "Switching Protocols" ) ) );
    $list35 = ConsesLow.list( ConsesLow.cons( makeInteger( 200 ), makeString( "OK" ) ), ConsesLow.cons( makeInteger( 201 ), makeString( "Created" ) ), ConsesLow.cons( makeInteger( 202 ), makeString( "Accepted" ) ),
        ConsesLow.cons( makeInteger( 203 ), makeString( "Non-Authoritative Information" ) ), ConsesLow.cons( makeInteger( 204 ), makeString( "No Content" ) ), ConsesLow.cons( makeInteger( 205 ), makeString(
            "Reset Content" ) ), ConsesLow.cons( makeInteger( 206 ), makeString( "Partial Content" ) ) );
    $list36 = ConsesLow.list( ConsesLow.cons( makeInteger( 300 ), makeString( "Multiple Choices" ) ), ConsesLow.cons( makeInteger( 301 ), makeString( "Moved Permanently" ) ), ConsesLow.cons( makeInteger( 302 ),
        makeString( "Found" ) ), ConsesLow.cons( makeInteger( 303 ), makeString( "See Other" ) ), ConsesLow.cons( makeInteger( 304 ), makeString( "Not Modified" ) ), ConsesLow.cons( makeInteger( 305 ), makeString(
            "Use Proxy" ) ), ConsesLow.cons( makeInteger( 306 ), makeString( "(Unused)" ) ), ConsesLow.cons( makeInteger( 307 ), makeString( "Temporary Redirect" ) ) );
    $list37 = ConsesLow.list( new SubLObject[] { ConsesLow.cons( makeInteger( 400 ), makeString( "Bad Request" ) ), ConsesLow.cons( makeInteger( 401 ), makeString( "Unauthorized" ) ), ConsesLow.cons( makeInteger( 403 ),
        makeString( "Forbidden" ) ), ConsesLow.cons( makeInteger( 404 ), makeString( "Not Found" ) ), ConsesLow.cons( makeInteger( 405 ), makeString( "Method Not Allowed" ) ), ConsesLow.cons( makeInteger( 406 ),
            makeString( "Not Acceptable" ) ), ConsesLow.cons( makeInteger( 407 ), makeString( "Proxy Authentication Required" ) ), ConsesLow.cons( makeInteger( 408 ), makeString( "Request Timeout" ) ), ConsesLow.cons(
                makeInteger( 409 ), makeString( "Conflict" ) ), ConsesLow.cons( makeInteger( 410 ), makeString( "Gone" ) ), ConsesLow.cons( makeInteger( 411 ), makeString( "Length Required" ) ), ConsesLow.cons(
                    makeInteger( 412 ), makeString( "Precondition Failed" ) ), ConsesLow.cons( makeInteger( 413 ), makeString( "Request Entity Too Large" ) ), ConsesLow.cons( makeInteger( 414 ), makeString(
                        "Request-URI Too Long" ) ), ConsesLow.cons( makeInteger( 415 ), makeString( "Unsupported Media Type" ) ), ConsesLow.cons( makeInteger( 416 ), makeString( "Requested Range Not Satisfiable" ) ),
      ConsesLow.cons( makeInteger( 417 ), makeString( "Expectation Failed" ) )
    } );
    $list38 = ConsesLow.list( ConsesLow.cons( makeInteger( 500 ), makeString( "Internal Server Error" ) ), ConsesLow.cons( makeInteger( 501 ), makeString( "Not Implemented" ) ), ConsesLow.cons( makeInteger( 502 ),
        makeString( "Bad Gateway" ) ), ConsesLow.cons( makeInteger( 503 ), makeString( "Service Unavailable" ) ), ConsesLow.cons( makeInteger( 504 ), makeString( "Gateway Timeout" ) ), ConsesLow.cons( makeInteger( 505 ),
            makeString( "HTTP Version not supported" ) ) );
    $str39$HTTP_1_1_200_OK = makeString( "HTTP/1.1 200 OK" );
    $str40$HTTP_1_1_ = makeString( "HTTP/1.1 " );
    $list41 = ConsesLow.list( ConsesLow.list( makeKeyword( "VERSION" ), makeString( "GET ~A HTTP/1.0" ) ), ConsesLow.list( makeKeyword( "CONNECTION" ), makeString( "Connection: ~A" ) ), ConsesLow.list( makeKeyword(
        "USER-AGENT" ), makeString( "User-Agent: Cyc/~A/~A" ) ), ConsesLow.list( makeKeyword( "HOST" ), makeString( "Host: ~A~A" ) ), ConsesLow.list( makeKeyword( "ACCEPT" ), makeString( "Accept: " ) ), ConsesLow.list(
            makeKeyword( "BLANK-LINE" ), NIL ) );
    $sym42$FIRST = makeSymbol( "FIRST" );
    $str43$application_x_www_form_urlencoded = makeString( "application/x-www-form-urlencoded" );
    $list44 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "VERSION" ), makeString( "POST ~A HTTP/1.0" ) ), ConsesLow.list( makeKeyword( "CONNECTION" ), makeString( "Connection: ~A" ) ), ConsesLow
        .list( makeKeyword( "USER-AGENT" ), makeString( "User-Agent: Cyc/~A/~A" ) ), ConsesLow.list( makeKeyword( "HOST" ), makeString( "Host: ~A~A" ) ), ConsesLow.list( makeKeyword( "ACCEPT" ), makeString(
            "Accept: " ) ), ConsesLow.list( makeKeyword( "COOKIES" ), makeString( "Cookie: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-TYPE" ), makeString( "Content-type: ~A" ) ), ConsesLow.list( makeKeyword(
                "SOAP-ACTION" ), makeString( "SOAPAction: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-LENGTH" ), makeString( "Content-length: ~A" ) ), ConsesLow.list( makeKeyword( "BLANK-LINE" ), NIL ), ConsesLow
                    .list( makeKeyword( "QUERY" ), makeString( "~A" ) )
    } );
    $list45 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "VERSION" ), makeString( "PUT ~A HTTP/1.0" ) ), ConsesLow.list( makeKeyword( "CONNECTION" ), makeString( "Connection: ~A" ) ), ConsesLow.list(
        makeKeyword( "USER-AGENT" ), makeString( "User-Agent: Cyc/~A/~A" ) ), ConsesLow.list( makeKeyword( "HOST" ), makeString( "Host: ~A~A" ) ), ConsesLow.list( makeKeyword( "ACCEPT" ), makeString( "Accept: " ) ),
      ConsesLow.list( makeKeyword( "COOKIES" ), makeString( "Cookie: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-TYPE" ), makeString( "Content-type: ~A" ) ), ConsesLow.list( makeKeyword( "SOAP-ACTION" ), makeString(
          "SOAPAction: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-LENGTH" ), makeString( "Content-length: ~A" ) ), ConsesLow.list( makeKeyword( "BLANK-LINE" ), NIL ), ConsesLow.list( makeKeyword( "QUERY" ),
              makeString( "~A" ) )
    } );
    $list46 = ConsesLow.list( new SubLObject[] { ConsesLow.list( makeKeyword( "VERSION" ), makeString( "DELETE ~A HTTP/1.0" ) ), ConsesLow.list( makeKeyword( "CONNECTION" ), makeString( "Connection: ~A" ) ), ConsesLow
        .list( makeKeyword( "USER-AGENT" ), makeString( "User-Agent: Cyc/~A/~A" ) ), ConsesLow.list( makeKeyword( "HOST" ), makeString( "Host: ~A~A" ) ), ConsesLow.list( makeKeyword( "ACCEPT" ), makeString(
            "Accept: " ) ), ConsesLow.list( makeKeyword( "COOKIES" ), makeString( "Cookie: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-TYPE" ), makeString( "Content-type: ~A" ) ), ConsesLow.list( makeKeyword(
                "SOAP-ACTION" ), makeString( "SOAPAction: ~A" ) ), ConsesLow.list( makeKeyword( "CONTENT-LENGTH" ), makeString( "Content-length: ~A" ) ), ConsesLow.list( makeKeyword( "BLANK-LINE" ), NIL ), ConsesLow
                    .list( makeKeyword( "QUERY" ), makeString( "~A" ) )
    } );
    $sym47$STREAMP = makeSymbol( "STREAMP" );
    $list48 = ConsesLow.list( new SubLObject[] { makeSymbol( "&KEY" ), makeSymbol( "MACHINE" ), ConsesLow.list( makeSymbol( "PORT" ), makeInteger( 80 ) ), ConsesLow.list( makeSymbol( "METHOD" ), makeKeyword( "GET" ) ),
      makeSymbol( "URL" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "KEEP-ALIVE?" ), T ), ConsesLow.list( makeSymbol( "WIDE-NEWLINES?" ), NIL ), ConsesLow.list( makeSymbol( "ACCEPT-TYPES" ), makeKeyword(
          "DEFAULT" ) ), ConsesLow.list( makeSymbol( "CONTENT-TYPE" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list( makeSymbol( "SOAP-ACTION-URI" ), NIL )
    } );
    $list49 = ConsesLow.list( new SubLObject[] { makeKeyword( "MACHINE" ), makeKeyword( "PORT" ), makeKeyword( "METHOD" ), makeKeyword( "URL" ), makeKeyword( "QUERY" ), makeKeyword( "KEEP-ALIVE?" ), makeKeyword(
        "WIDE-NEWLINES?" ), makeKeyword( "ACCEPT-TYPES" ), makeKeyword( "CONTENT-TYPE" ), makeKeyword( "SOAP-ACTION-URI" )
    } );
    $sym50$KEYWORDP = makeSymbol( "KEYWORDP" );
    $sym51$STRINGP = makeSymbol( "STRINGP" );
    $sym52$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $sym53$NON_DOTTED_LIST_P = makeSymbol( "NON-DOTTED-LIST-P" );
    $kw54$POST = makeKeyword( "POST" );
    $kw55$PUT = makeKeyword( "PUT" );
    $kw56$DELETE = makeKeyword( "DELETE" );
    $str57$Unsupported_HTTP_request_method__ = makeString( "Unsupported HTTP request method : ~S" );
    $list58 = ConsesLow.list( makeSymbol( "&KEY" ), makeSymbol( "QUERY" ), ConsesLow.list( makeSymbol( "METHOD" ), makeKeyword( "GET" ) ), ConsesLow.list( makeSymbol( "PORT" ), makeKeyword( "DEFAULT" ) ), ConsesLow.list(
        makeSymbol( "KEEP-ALIVE?" ), T ), ConsesLow.list( makeSymbol( "WIDE-NEWLINES?" ), NIL ), makeSymbol( "TIMEOUT" ), ConsesLow.list( makeSymbol( "ACCEPT-TYPES" ), makeKeyword( "DEFAULT" ) ) );
    $list59 = ConsesLow.list( makeKeyword( "QUERY" ), makeKeyword( "METHOD" ), makeKeyword( "PORT" ), makeKeyword( "KEEP-ALIVE?" ), makeKeyword( "WIDE-NEWLINES?" ), makeKeyword( "TIMEOUT" ), makeKeyword(
        "ACCEPT-TYPES" ) );
    $list60 = ConsesLow.list( ConsesLow.list( makeSymbol( "COOKIE-LIST" ) ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $sym61$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_ = makeSymbol( "*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*" );
    $list62 = ConsesLow.list( makeSymbol( "ACTION" ), makeSymbol( "FORMAT-STRING" ) );
    $kw63$VERSION = makeKeyword( "VERSION" );
    $kw64$ACCEPT = makeKeyword( "ACCEPT" );
    $kw65$CONNECTION = makeKeyword( "CONNECTION" );
    $str66$Keep_Alive___S = makeString( "Keep-Alive: ~S" );
    $str67$keep_alive = makeString( "keep-alive" );
    $str68$close = makeString( "close" );
    $kw69$USER_AGENT = makeKeyword( "USER-AGENT" );
    $kw70$HOST = makeKeyword( "HOST" );
    $str71$_ = makeString( ":" );
    $kw72$BLANK_LINE = makeKeyword( "BLANK-LINE" );
    $kw73$COOKIES = makeKeyword( "COOKIES" );
    $kw74$CONTENT_LENGTH = makeKeyword( "CONTENT-LENGTH" );
    $kw75$SOAP_ACTION = makeKeyword( "SOAP-ACTION" );
    $str76$__ = makeString( ", " );
    $str77$_ = makeString( "?" );
    $str78$Date__ = makeString( "Date: " );
    $str79$Server__Cyc_ = makeString( "Server: Cyc/" );
    $str80$__ = makeString( ": " );
    $str81$Set_Cookie_ = makeString( "Set-Cookie:" );
    $sym82$CHAR_ = makeSymbol( "CHAR=" );
    $str83$domain = makeString( "domain" );
    $str84$expires = makeString( "expires" );
    $str85$max_age = makeString( "max-age" );
    $str86$ = makeString( "" );
    $str87$__ = makeString( " $" );
    $sym88$EMPTY_STRING_P = makeSymbol( "EMPTY-STRING-P" );
    $sym89$TRIM_WHITESPACE = makeSymbol( "TRIM-WHITESPACE" );
    $sym90$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS = makeSymbol( "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS" );
    $sym91$HTML_URL_EXPAND_CHAR = makeSymbol( "HTML-URL-EXPAND-CHAR" );
    $str92$____ = makeString( "-_.=" );
    $int93$256 = makeInteger( 256 );
    $str94$_S = makeString( "~S" );
    $str95$mailto_ = makeString( "mailto:" );
    $list96 = ConsesLow.list( makeString( ":" ), makeString( "/" ) );
    $sym97$NON_EMPTY_STRING_P = makeSymbol( "NON-EMPTY-STRING-P" );
    $list98 = ConsesLow.list( new SubLObject[] { makeString( "aaa:" ), makeString( "aaas:" ), makeString( "acap:" ), makeString( "cap:" ), makeString( "cid:" ), makeString( "crid:" ), makeString( "data:" ), makeString(
        "dav:" ), makeString( "dict:" ), makeString( "dns:" ), makeString( "fax:" ), makeString( "file:" ), makeString( "ftp:" ), makeString( "go:" ), makeString( "gopher:" ), makeString( "h323:" ), makeString(
            "http:" ), makeString( "https:" ), makeString( "im" ), makeString( "imap:" ), makeString( "ldap:" ), makeString( "mailto:" ), makeString( "mid:" ), makeString( "news:" ), makeString( "nfs:" ), makeString(
                "nntp:" ), makeString( "pop:" ), makeString( "pres:" ), makeString( "sip:" ), makeString( "sips:" ), makeString( "snmp:" ), makeString( "tel:" ), makeString( "telnet:" ), makeString( "urn:" ), makeString(
                    "wais:" ), makeString( "xmpp:" )
    } );
    $list99 = ConsesLow.list( new SubLObject[] { makeString( "about:" ), makeString( "aim:" ), makeString( "callto:" ), makeString( "cvs:" ), makeString( "ed2k:" ), makeString( "feed:" ), makeString( "fish:" ),
      makeString( "gizmoproject:" ), makeString( "iax2:" ), makeString( "irc:" ), makeString( "ircs:" ), makeString( "lastfm:" ), makeString( "ldaps:" ), makeString( "magnet:" ), makeString( "mms:" ), makeString(
          "msnim:" ), makeString( "nsfw:" ), makeString( "psyc:" ), makeString( "rsync:" ), makeString( "secondlife:" ), makeString( "skype:" ), makeString( "ssh:" ), makeString( "sftp:" ), makeString( "smb:" ),
      makeString( "sms:" ), makeString( "soldat:" ), makeString( "steam:" ), makeString( "tag:" ), makeString( "unreal:" ), makeString( "ut2004:" ), makeString( "webcal:" ), makeString( "xfire:" ), makeString( "ymsgr:" )
    } );
    $list100 = ConsesLow.list( makeString( "http://" ), makeString( "https://" ), makeString( "ftp://" ), makeString( "gopher://" ), makeString( "file:" ), makeString( "news:" ), makeString( "mailto:" ), makeString(
        "anon:" ) );
    $list101 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_period, Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_rparen );
    $sym102$VALID_URL_CHAR_P = makeSymbol( "VALID-URL-CHAR-P" );
    $str103$_____________________ = makeString( ";@?%/:=$-_.+!*'(),#&~" );
    $str104$___ = makeString( "../" );
    $str105$__ = makeString( "//" );
    $sym106$RESOLVE_RELATIVE_URI = makeSymbol( "RESOLVE-RELATIVE-URI" );
    $kw107$TEST = makeKeyword( "TEST" );
    $kw108$OWNER = makeKeyword( "OWNER" );
    $kw109$CLASSES = makeKeyword( "CLASSES" );
    $kw110$KB = makeKeyword( "KB" );
    $kw111$TINY = makeKeyword( "TINY" );
    $kw112$WORKING_ = makeKeyword( "WORKING?" );
    $list113 = ConsesLow.list( new SubLObject[] { ConsesLow.list( ConsesLow.list( makeString( "http://example.org" ), makeString( "relfile" ) ), makeString( "http://example.org/relfile" ) ), ConsesLow.list( ConsesLow
        .list( makeString( "http://example.org#" ), makeString( "prop" ) ), makeString( "http://example.org#prop" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/" ), makeString( "named" ) ),
            makeString( "http://example.org/named" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/#" ), makeString( "owes" ) ), makeString( "http://example.org/#owes" ) ), ConsesLow.list( ConsesLow
                .list( makeString( "http://example.org/dir/file" ), makeString( "relfile" ) ), makeString( "http://example.org/dir/relfile" ) ), ConsesLow.list( ConsesLow.list( makeString(
                    "http://example.org/dir/file" ), makeString( "../relfile" ) ), makeString( "http://example.org/relfile" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/dir/file" ), makeString(
                        "/absfile" ) ), makeString( "http://example.org/absfile" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/dir/file" ), makeString( "//another.example.org/absfile" ) ),
                            makeString( "http://another.example.org/absfile" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/dir/file" ), makeString( "#foo" ) ), makeString(
                                "http://example.org/dir/file#foo" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://example.org/dir/file" ), makeString( "" ) ), makeString( "http://example.org/dir/file" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "http://foo/" ), makeString( "Bar" ) ), makeString( "http://foo/Bar" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://my.example.org/" ), makeString( "Name" ) ),
          makeString( "http://my.example.org/Name" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://purl.org/metadata/dublin_core#" ), makeString( "Creator" ) ), makeString(
              "http://purl.org/metadata/dublin_core#Creator" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://purl.org/metadata/dublin_core#" ), makeString( "Title" ) ), makeString(
                  "http://purl.org/metadata/dublin_core#Title" ) ), ConsesLow.list( ConsesLow.list( makeString( "http://random.ioctl.org/#" ), makeString( "prop2" ) ), makeString( "http://random.ioctl.org/#prop2" ) ),
      ConsesLow.list( ConsesLow.list( makeString( "http://random.ioctl.org/#" ), makeString( "someProperty" ) ), makeString( "http://random.ioctl.org/#someProperty" ) ), ConsesLow.list( ConsesLow.list( makeString(
          "http://www.w3.org/1999/02/22-rdf-syntax-ns#" ), makeString( "_2" ) ), makeString( "http://www.w3.org/1999/02/22-rdf-syntax-ns#_2" ) ), ConsesLow.list( ConsesLow.list( makeString(
              "http://www.w3.org/2000/10/rdf-tests/rdfcore/" ), makeString( "Manifest.rdf" ) ), makeString( "http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf" ) ), ConsesLow.list( ConsesLow.list( makeString(
                  "http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf" ), makeString( "premises005.rdf#B" ) ), makeString(
                      "http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B" ) ), ConsesLow.list( ConsesLow.list( makeString(
                          "http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf" ), makeString( "#frag" ) ), makeString( "http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag" ) )
    } );
    $str114$http___schemas_xmlsoap_org_soap_e = makeString( "http://schemas.xmlsoap.org/soap/envelope/" );
    $sym115$SOAP_NAME = makeSymbol( "SOAP-NAME" );
    $str116$soap_ = makeString( "soap:" );
    $sym117$_SOAP_NAME_CACHING_STATE_ = makeSymbol( "*SOAP-NAME-CACHING-STATE*" );
    $sym118$SOAP_EXPANDED_NAME = makeSymbol( "SOAP-EXPANDED-NAME" );
    $sym119$_SOAP_EXPANDED_NAME_CACHING_STATE_ = makeSymbol( "*SOAP-EXPANDED-NAME-CACHING-STATE*" );
    $str120$Envelope = makeString( "Envelope" );
    $sym121$PERFORM_SOAP_POST_CACHED = makeSymbol( "PERFORM-SOAP-POST-CACHED" );
    $sym122$_PERFORM_SOAP_POST_CACHED_CACHING_STATE_ = makeSymbol( "*PERFORM-SOAP-POST-CACHED-CACHING-STATE*" );
    $str123$text_xml__charset_utf_8 = makeString( "text/xml; charset=utf-8" );
    $str124$US_ASCII = makeString( "US-ASCII" );
    $str125$xmlns_soap = makeString( "xmlns:soap" );
    $str126$Header = makeString( "Header" );
    $list127 = ConsesLow.cons( makeSymbol( "ATTRIBUTE" ), makeSymbol( "VALUE" ) );
    $str128$xmlns = makeString( "xmlns" );
    $str129$Body = makeString( "Body" );
    $list130 = ConsesLow.list( Characters.CHAR_space, Characters.CHAR_slash );
    $str131$HTTP = makeString( "HTTP" );
    $str132$Location__ = makeString( "Location: " );
    $sym133$WHITESPACEP = makeSymbol( "WHITESPACEP" );
    $str134$http___ = makeString( "http://" );
    $str135$https___ = makeString( "https://" );
    $int136$100 = makeInteger( 100 );
    $list137 = ConsesLow.list( makeSymbol( "MSG" ), makeSymbol( "EXP" ), makeSymbol( "&BODY" ), makeSymbol( "BODY" ) );
    $list138 = ConsesLow.list( NIL );
    $sym139$CATCH_ERROR_MESSAGE = makeSymbol( "CATCH-ERROR-MESSAGE" );
    $sym140$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol( "CATCH-ERROR-MESSAGE-HANDLER" );
    $str141$_____Averted__connection_reset_by = makeString( "~&>> Averted 'connection reset by peer' error !!" );
    $str142$0 = makeString( "0" );
    $str143$_GMT = makeString( " GMT" );
    $list144 = ConsesLow.list( makeSymbol( "PATTERN" ), makeSymbol( "LIST" ) );
    $sym145$MEMBER = makeSymbol( "MEMBER" );
    $list146 = ConsesLow.list( ConsesLow.list( makeSymbol( "FUNCTION" ), makeSymbol( "SEARCH" ) ) );
    $list147 = ConsesLow.list( makeSymbol( "LIST" ) );
    $sym148$CSETQ = makeSymbol( "CSETQ" );
    $sym149$CDR = makeSymbol( "CDR" );
    $sym150$HTML_TOKENS_FAST_FORWARD = makeSymbol( "HTML-TOKENS-FAST-FORWARD" );
    $sym151$CAR = makeSymbol( "CAR" );
    $list152 = ConsesLow.list( makeSymbol( "TOKENS" ), makeSymbol( "TAG" ) );
    $sym153$MARKER = makeUninternedSymbol( "MARKER" );
    $sym154$HTML_TOKENS_EXTRACT_CURR = makeSymbol( "HTML-TOKENS-EXTRACT-CURR" );
    $sym155$PUNLESS = makeSymbol( "PUNLESS" );
    $sym156$STRING_EQUAL = makeSymbol( "STRING-EQUAL" );
    $sym157$ERROR = makeSymbol( "ERROR" );
    $str158$Invalid_input_file_format__Expect = makeString( "Invalid input file format. Expected starting ~S and received ~S.~%" );
    $sym159$HTML_TOKENS_STEP = makeSymbol( "HTML-TOKENS-STEP" );
    $sym160$MARKER = makeUninternedSymbol( "MARKER" );
    $sym161$IS_HTML_TERMINATING_TAG_ = makeSymbol( "IS-HTML-TERMINATING-TAG?" );
    $str162$Invalid_input_file_format__Expect = makeString( "Invalid input file format. Expected closing ~S and received ~S.~%" );
    $list163 = ConsesLow.list( makeSymbol( "TOKENS" ), makeSymbol( "TAG" ), makeSymbol( "STORAGE" ) );
    $sym164$PROGN = makeSymbol( "PROGN" );
    $sym165$HTML_CONSUME_STARTING_TAG = makeSymbol( "HTML-CONSUME-STARTING-TAG" );
    $sym166$HTML_CONSUME_CLOSING_TAG = makeSymbol( "HTML-CONSUME-CLOSING-TAG" );
    $list167 = ConsesLow.list( makeSymbol( "TOKENS" ), makeSymbol( "TAG" ), makeSymbol( "STORAGE" ), makeSymbol( "&OPTIONAL" ), ConsesLow.list( makeSymbol( "DEFAULT" ), NIL ) );
    $sym168$TEMP = makeUninternedSymbol( "TEMP" );
    $sym169$PWHEN = makeSymbol( "PWHEN" );
    $sym170$TEST_FOR_HTML_TAG_ = makeSymbol( "TEST-FOR-HTML-TAG?" );
    $sym171$HTML_EXTRACT_TAG_CONTENT = makeSymbol( "HTML-EXTRACT-TAG-CONTENT" );
    $kw172$INPUT = makeKeyword( "INPUT" );
    $str173$Unable_to_open__S = makeString( "Unable to open ~S" );
    $sym174$PROPERTY_LIST_P = makeSymbol( "PROPERTY-LIST-P" );
    $str175$_ = makeString( "&" );
    $str176$_ = makeString( "=" );
    $sym177$ALIST_P = makeSymbol( "ALIST-P" );
    $list178 = ConsesLow.cons( makeSymbol( "KEY" ), makeSymbol( "VALUE" ) );
    $sym179$MATCHING_OPEN_TAG_ = makeSymbol( "MATCHING-OPEN-TAG?" );
    $list180 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "<tag>" ) ), T ), ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "</tag>" ) ), NIL ), ConsesLow.list(
        ConsesLow.list( makeString( "tag" ), makeString( "<TAG>" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "<TAG>" ), EQUALP ), T ) );
    $sym181$MATCHING_CLOSE_TAG_ = makeSymbol( "MATCHING-CLOSE-TAG?" );
    $list182 = ConsesLow.list( ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "<tag>" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "</tag>" ) ), T ), ConsesLow.list(
        ConsesLow.list( makeString( "tag" ), makeString( "</TAG>" ) ), NIL ), ConsesLow.list( ConsesLow.list( makeString( "tag" ), makeString( "</TAG>" ), EQUALP ), T ) );
    $str183$localhost = makeString( "localhost" );
    $str184$_cgi_bin_services = makeString( "/cgi-bin/services" );
    $sym185$BYTE_ORDER_MARK = makeSymbol( "BYTE-ORDER-MARK" );
    $str186$_ufeff_ = makeString( "&ufeff;" );
    $sym187$_BYTE_ORDER_MARK_CACHING_STATE_ = makeSymbol( "*BYTE-ORDER-MARK-CACHING-STATE*" );
    $str188$___A__A_____ = makeString( "~{~A=~A~^&~}" );
    $sym189$HTML_ENCODE_SEXPR = makeSymbol( "HTML-ENCODE-SEXPR" );
    $sym190$APPEND = makeSymbol( "APPEND" );
    $list191 = ConsesLow.list( makeString( "text/html" ), makeString( "*/*" ) );
    $str192$file___ = makeString( "file://" );
    $sym193$FILE_EXISTS_ = makeSymbol( "FILE-EXISTS?" );
    $kw194$OUTPUT = makeKeyword( "OUTPUT" );
    $sym195$START_SERVLET_CONTAINER_INT = makeSymbol( "START-SERVLET-CONTAINER-INT" );
    $sym196$_EXIT = makeSymbol( "%EXIT" );
    $sym197$START_SERVLET_CONTAINER = makeSymbol( "START-SERVLET-CONTAINER" );
    $kw198$SERVLET = makeKeyword( "SERVLET" );
    $list199 = ConsesLow.list( makeKeyword( "EXTERNAL" ), makeSymbol( "START-SERVLET-CONTAINER" ) );
    $sym200$STOP_SERVLET_CONTAINER_INT = makeSymbol( "STOP-SERVLET-CONTAINER-INT" );
    $kw201$STOPPED = makeKeyword( "STOPPED" );
    $str202$cyc_servlet_container_tmp_dir_ = makeString( "cyc-servlet-container-tmp-dir-" );
    $str203$_ = makeString( "-" );
    $str204$webapps_apps_webapp_manifest_xml = makeString( "webapps/apps/webapp-manifest.xml" );
    $str205$filename = makeString( "filename" );
    $str206$contextRoot = makeString( "contextRoot" );
    $str207$webapp = makeString( "webapp" );
    $str208$Unable_to_find_webapp_manifest_fi = makeString( "Unable to find webapp manifest file at ~S" );
  }

  public static final class $html_url_expand_char$UnaryFunction
      extends
        UnaryFunction
  {
    public $html_url_expand_char$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "HTML-URL-EXPAND-CHAR" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return html_url_expand_char( arg1 );
    }
  }

  public static final class $url_p$UnaryFunction
      extends
        UnaryFunction
  {
    public $url_p$UnaryFunction()
    {
      super( SubLTranslatedFile.extractFunctionNamed( "URL-P" ) );
    }

    @Override
    public SubLObject processItem(final SubLObject arg1)
    {
      return url_p( arg1 );
    }
  }
}
/*
 * 
 * Total time: 1042 ms synthetic
 */