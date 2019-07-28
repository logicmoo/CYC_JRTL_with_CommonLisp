package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.web_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.html_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.cycjava.cycl.web_utilities.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_ampersand;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_at;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_colon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_comma;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_exclamation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_hash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_less;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_newline;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_percent;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_plus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_question;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quotation;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_return;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_rparen;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_semicolon;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_slash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_tab;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_u;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_x;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FOUR_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIXTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THIRTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_base$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class web_utilities extends SubLTranslatedFile {
    // private web_utilities() {}
    public static final SubLFile me = new web_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.web_utilities";

    public static final String myFingerPrint = "e8a293b02638d6fac9e53108ffaab3c2c4ac1dd7fd01bbf371d7481a5cdbcbf1";

    // deflexical
    private static final SubLSymbol $http_default_accept_types$ = makeSymbol("*HTTP-DEFAULT-ACCEPT-TYPES*");

    // deflexical
    public static final SubLSymbol $decode_urls_during_http_read_request$ = makeSymbol("*DECODE-URLS-DURING-HTTP-READ-REQUEST*");

    // deflexical
    private static final SubLSymbol $http_alternate_uri_format_a_prefix$ = makeSymbol("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*");

    // deflexical
    private static final SubLSymbol $html_alternate_uri_format_session_id_length$ = makeSymbol("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*");



    // deflexical
    private static final SubLSymbol $html_possibly_redirect_to_portal_script$ = makeSymbol("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*");

    // deflexical
    /**
     * A-list that maps HTML Informational (1xx) status codes to the descriptive
     * explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    private static final SubLSymbol $http_informational_codes$ = makeSymbol("*HTTP-INFORMATIONAL-CODES*");

    // deflexical
    /**
     * A-list that maps HTML Success (2xx) status codes to the descriptive
     * explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    private static final SubLSymbol $http_success_codes$ = makeSymbol("*HTTP-SUCCESS-CODES*");

    // deflexical
    /**
     * A-list that maps HTML Redirection (3xx) status codes to the
     * deflexical-private explanation given in RFC 2616 (HTTP/1.1 specification).
     */
    private static final SubLSymbol $http_redirection_codes$ = makeSymbol("*HTTP-REDIRECTION-CODES*");

    // deflexical
    /**
     * A-list that maps HTML client error (4xx) codes to the descriptive expectation
     * given in RFC 2616 (HTTP/1.1 specification).
     */
    private static final SubLSymbol $http_client_error_codes$ = makeSymbol("*HTTP-CLIENT-ERROR-CODES*");

    // deflexical
    /**
     * A-list that maps HTTP error codes to the descriptive explanation given in RFC
     * 2616 (HTTP/1.1 specifcation).
     */
    private static final SubLSymbol $http_server_error_codes$ = makeSymbol("*HTTP-SERVER-ERROR-CODES*");

    // deflexical
    private static final SubLSymbol $http_error_codes$ = makeSymbol("*HTTP-ERROR-CODES*");

    // deflexical
    private static final SubLSymbol $http_status_codes$ = makeSymbol("*HTTP-STATUS-CODES*");

    // deflexical
    private static final SubLSymbol $http_get_request_template_components$ = makeSymbol("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    private static final SubLSymbol $http_get_request_template_order$ = makeSymbol("*HTTP-GET-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    private static final SubLSymbol $http_post_default_content_type$ = makeSymbol("*HTTP-POST-DEFAULT-CONTENT-TYPE*");

    // deflexical
    private static final SubLSymbol $http_post_request_template_components$ = makeSymbol("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    private static final SubLSymbol $http_post_request_template_order$ = makeSymbol("*HTTP-POST-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    private static final SubLSymbol $http_put_default_content_type$ = makeSymbol("*HTTP-PUT-DEFAULT-CONTENT-TYPE*");

    // deflexical
    private static final SubLSymbol $http_put_request_template_components$ = makeSymbol("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    private static final SubLSymbol $http_put_request_template_order$ = makeSymbol("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*");

    // deflexical
    private static final SubLSymbol $http_delete_default_content_type$ = makeSymbol("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*");

    // deflexical
    private static final SubLSymbol $http_delete_request_template_components$ = makeSymbol("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*");

    // deflexical
    private static final SubLSymbol $http_delete_request_template_order$ = makeSymbol("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*");

    // defparameter
    private static final SubLSymbol $trace_http_send_post_requests$ = makeSymbol("*TRACE-HTTP-SEND-POST-REQUESTS*");

    // defparameter
    private static final SubLSymbol $trace_http_send_put_requests$ = makeSymbol("*TRACE-HTTP-SEND-PUT-REQUESTS*");

    // defparameter
    private static final SubLSymbol $trace_http_send_delete_requests$ = makeSymbol("*TRACE-HTTP-SEND-DELETE-REQUESTS*");



    // deflexical
    private static final SubLSymbol $http_header_cookie_keyword$ = makeSymbol("*HTTP-HEADER-COOKIE-KEYWORD*");

    // deflexical
    private static final SubLSymbol $http_cookie_separation_charset$ = makeSymbol("*HTTP-COOKIE-SEPARATION-CHARSET*");

    // deflexical
    private static final SubLSymbol $http_filtered_predefined_named_cookie_attributes$ = makeSymbol("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*");

    // deflexical
    private static final SubLSymbol $official_uri_schemes$ = makeSymbol("*OFFICIAL-URI-SCHEMES*");

    // deflexical
    private static final SubLSymbol $unofficial_uri_schemes$ = makeSymbol("*UNOFFICIAL-URI-SCHEMES*");

    // defconstant
    private static final SubLSymbol $valid_url_beginnings$ = makeSymbol("*VALID-URL-BEGINNINGS*");

    // defconstant
    private static final SubLSymbol $url_delimiters$ = makeSymbol("*URL-DELIMITERS*");

    // deflexical
    private static final SubLSymbol $valid_non_alphanumeric_url_chars$ = makeSymbol("*VALID-NON-ALPHANUMERIC-URL-CHARS*");

    // deflexical
    private static final SubLSymbol $soap_envelope_uri$ = makeSymbol("*SOAP-ENVELOPE-URI*");







    // defparameter
    public static final SubLSymbol $cgi_host$ = makeSymbol("*CGI-HOST*");

    // defparameter
    public static final SubLSymbol $cgi_port$ = makeSymbol("*CGI-PORT*");

    // defparameter
    public static final SubLSymbol $cgi_path$ = makeSymbol("*CGI-PATH*");

    // defparameter
    private static final SubLSymbol $http_header_delimiter$ = makeSymbol("*HTTP-HEADER-DELIMITER*");

    // defparameter
    private static final SubLSymbol $http_header_field_delimiters$ = makeSymbol("*HTTP-HEADER-FIELD-DELIMITERS*");



    // defparameter
    private static final SubLSymbol $alternate_servlet_container_port$ = makeSymbol("*ALTERNATE-SERVLET-CONTAINER-PORT*");

    // defparameter
    private static final SubLSymbol $alternate_servlet_container_host$ = makeSymbol("*ALTERNATE-SERVLET-CONTAINER-HOST*");

    // defparameter
    private static final SubLSymbol $local_servlet_container_runningP$ = makeSymbol("*LOCAL-SERVLET-CONTAINER-RUNNING?*");

    // deflexical
    private static final SubLSymbol $webapp_manifest_path$ = makeSymbol("*WEBAPP-MANIFEST-PATH*");

    // Internal Constants
    public static final SubLList $list0 = list(makeString("text/plain"), makeString("text/html"));

    public static final SubLList $list1 = list(list(new SubLObject[]{ makeSymbol("CHANNEL"), makeSymbol("MACHINE"), makeSymbol("URL"), makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")), list(makeSymbol("CONTENT-TYPE"), makeKeyword("DEFAULT")), makeSymbol("SOAP-ACTION-URI") }), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list2 = list(new SubLObject[]{ makeKeyword("QUERY"), makeKeyword("METHOD"), makeKeyword("PORT"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");











    private static final SubLSymbol $kw9$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");

    private static final SubLSymbol $kw10$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");







    private static final SubLSymbol $SOAP_ACTION_URI = makeKeyword("SOAP-ACTION-URI");

    private static final SubLSymbol $sym15$REAL_PORT = makeUninternedSymbol("REAL-PORT");





    private static final SubLList $list18 = list(makeKeyword("DEFAULT"));

    private static final SubLInteger $int$80 = makeInteger(80);







    private static final SubLSymbol SEND_HTTP_REQUEST = makeSymbol("SEND-HTTP-REQUEST");







    private static final SubLString $str27$_a_ = makeString("/a/");

    private static final SubLSymbol $html_cyc_login_session_string_to_remote_host$ = makeSymbol("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*");

    private static final SubLString $str29$_ = makeString("/");

    private static final SubLString $str30$_cg_ = makeString("/cg?");

    private static final SubLList $list31 = list(CHAR_slash);

    private static final SubLString $str32$Remote_Host = makeString("Remote-Host");

    private static final SubLString $str33$var_KEA_port_from_cyc_base_port__ = makeString("var KEA_port_from_cyc_base_port = function () {\n  var DEFAULT_PORT_STR = \"80\";\n  var portStr = (window.document.location.port.length > 0) ? window.document.location.port : DEFAULT_PORT_STR;\n  var offset = parseInt(portStr.substring(portStr.length - 1));\n  var port = parseInt(portStr);\n\n  if (offset == 2) return (port + 1);\n  return port;\n}\nif (window==window.top) {\n  var url = \"http://\" + window.document.location.hostname + \":\" + KEA_port_from_cyc_base_port() + \"/?toolURL=\" + encodeURIComponent(window.location.href) + \"&sessionId=~A\";\n  window.location.href=url;\n}");

    public static final SubLList $list34 = list(cons(makeInteger(100), makeString("Continue")), cons(makeInteger(101), makeString("Switching Protocols")));

    private static final SubLList $list35 = list(cons(makeInteger(200), makeString("OK")), cons(makeInteger(201), makeString("Created")), cons(makeInteger(202), makeString("Accepted")), cons(makeInteger(203), makeString("Non-Authoritative Information")), cons(makeInteger(204), makeString("No Content")), cons(makeInteger(205), makeString("Reset Content")), cons(makeInteger(206), makeString("Partial Content")));

    public static final SubLList $list36 = list(cons(makeInteger(300), makeString("Multiple Choices")), cons(makeInteger(301), makeString("Moved Permanently")), cons(makeInteger(302), makeString("Found")), cons(makeInteger(303), makeString("See Other")), cons(makeInteger(304), makeString("Not Modified")), cons(makeInteger(305), makeString("Use Proxy")), cons(makeInteger(306), makeString("(Unused)")), cons(makeInteger(307), makeString("Temporary Redirect")));

    public static final SubLList $list37 = list(new SubLObject[]{ cons(makeInteger(400), makeString("Bad Request")), cons(makeInteger(401), makeString("Unauthorized")), cons(makeInteger(403), makeString("Forbidden")), cons(makeInteger(404), makeString("Not Found")), cons(makeInteger(405), makeString("Method Not Allowed")), cons(makeInteger(406), makeString("Not Acceptable")), cons(makeInteger(407), makeString("Proxy Authentication Required")), cons(makeInteger(408), makeString("Request Timeout")), cons(makeInteger(409), makeString("Conflict")), cons(makeInteger(410), makeString("Gone")), cons(makeInteger(411), makeString("Length Required")), cons(makeInteger(412), makeString("Precondition Failed")), cons(makeInteger(413), makeString("Request Entity Too Large")), cons(makeInteger(414), makeString("Request-URI Too Long")), cons(makeInteger(415), makeString("Unsupported Media Type")), cons(makeInteger(416), makeString("Requested Range Not Satisfiable")), cons(makeInteger(417), makeString("Expectation Failed")) });

    private static final SubLList $list38 = list(cons(makeInteger(500), makeString("Internal Server Error")), cons(makeInteger(501), makeString("Not Implemented")), cons(makeInteger(502), makeString("Bad Gateway")), cons(makeInteger(503), makeString("Service Unavailable")), cons(makeInteger(504), makeString("Gateway Timeout")), cons(makeInteger(505), makeString("HTTP Version not supported")));

    private static final SubLString $str39$HTTP_1_1_200_OK = makeString("HTTP/1.1 200 OK");

    private static final SubLString $str40$HTTP_1_1_ = makeString("HTTP/1.1 ");

    private static final SubLList $list41 = list(list(makeKeyword("VERSION"), makeString("GET ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("BLANK-LINE"), NIL));



    private static final SubLString $str43$application_x_www_form_urlencoded = makeString("application/x-www-form-urlencoded");

    public static final SubLList $list44 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("POST ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    private static final SubLList $list45 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("PUT ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });

    public static final SubLList $list46 = list(new SubLObject[]{ list(makeKeyword("VERSION"), makeString("DELETE ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: ~A")), list(makeKeyword("SOAP-ACTION"), makeString("SOAPAction: ~A")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A")) });



    private static final SubLList $list48 = list(new SubLObject[]{ makeSymbol("&KEY"), makeSymbol("MACHINE"), list(makeSymbol("PORT"), makeInteger(80)), list(makeSymbol("METHOD"), makeKeyword("GET")), makeSymbol("URL"), makeSymbol("QUERY"), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")), list(makeSymbol("CONTENT-TYPE"), makeKeyword("DEFAULT")), list(makeSymbol("SOAP-ACTION-URI"), NIL) });

    private static final SubLList $list49 = list(new SubLObject[]{ makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("METHOD"), makeKeyword("URL"), makeKeyword("QUERY"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("ACCEPT-TYPES"), makeKeyword("CONTENT-TYPE"), makeKeyword("SOAP-ACTION-URI") });















    private static final SubLString $str57$Unsupported_HTTP_request_method__ = makeString("Unsupported HTTP request method : ~S");

    private static final SubLList $list58 = list(makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT")));

    private static final SubLList $list59 = list(makeKeyword("QUERY"), makeKeyword("METHOD"), makeKeyword("PORT"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"));

    private static final SubLList $list60 = list(list(makeSymbol("COOKIE-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $http_cookies_to_include_in_requests$ = makeSymbol("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*");

    private static final SubLList $list62 = list(makeSymbol("ACTION"), makeSymbol("FORMAT-STRING"));







    private static final SubLString $str66$Keep_Alive___S = makeString("Keep-Alive: ~S");

    private static final SubLString $str67$keep_alive = makeString("keep-alive");

    private static final SubLString $$$close = makeString("close");





    private static final SubLString $str71$_ = makeString(":");









    private static final SubLString $str76$__ = makeString(", ");

    private static final SubLString $str77$_ = makeString("?");

    private static final SubLString $str78$Date__ = makeString("Date: ");

    private static final SubLString $str79$Server__Cyc_ = makeString("Server: Cyc/");

    private static final SubLString $str80$__ = makeString(": ");

    private static final SubLString $str81$Set_Cookie_ = makeString("Set-Cookie:");

    private static final SubLSymbol $sym82$CHAR_ = makeSymbol("CHAR=");

    private static final SubLString $$$domain = makeString("domain");

    private static final SubLString $$$expires = makeString("expires");

    private static final SubLString $str85$max_age = makeString("max-age");

    private static final SubLString $str86$ = makeString("");

    private static final SubLString $str87$__ = makeString(" $");



    private static final SubLSymbol TRIM_WHITESPACE = makeSymbol("TRIM-WHITESPACE");

    private static final SubLSymbol HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS = makeSymbol("HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS");

    private static final SubLSymbol HTML_URL_EXPAND_CHAR = makeSymbol("HTML-URL-EXPAND-CHAR");

    private static final SubLString $str92$____ = makeString("-_.=");



    private static final SubLString $str94$_S = makeString("~S");

    private static final SubLString $str95$mailto_ = makeString("mailto:");

    private static final SubLList $list96 = list(makeString(":"), makeString("/"));

    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");

    public static final SubLList $list98 = list(new SubLObject[]{ makeString("aaa:"), makeString("aaas:"), makeString("acap:"), makeString("cap:"), makeString("cid:"), makeString("crid:"), makeString("data:"), makeString("dav:"), makeString("dict:"), makeString("dns:"), makeString("fax:"), makeString("file:"), makeString("ftp:"), makeString("go:"), makeString("gopher:"), makeString("h323:"), makeString("http:"), makeString("https:"), makeString("im"), makeString("imap:"), makeString("ldap:"), makeString("mailto:"), makeString("mid:"), makeString("news:"), makeString("nfs:"), makeString("nntp:"), makeString("pop:"), makeString("pres:"), makeString("sip:"), makeString("sips:"), makeString("snmp:"), makeString("tel:"), makeString("telnet:"), makeString("urn:"), makeString("wais:"), makeString("xmpp:") });

    private static final SubLList $list99 = list(new SubLObject[]{ makeString("about:"), makeString("aim:"), makeString("callto:"), makeString("cvs:"), makeString("ed2k:"), makeString("feed:"), makeString("fish:"), makeString("gizmoproject:"), makeString("iax2:"), makeString("irc:"), makeString("ircs:"), makeString("lastfm:"), makeString("ldaps:"), makeString("magnet:"), makeString("mms:"), makeString("msnim:"), makeString("nsfw:"), makeString("psyc:"), makeString("rsync:"), makeString("secondlife:"), makeString("skype:"), makeString("ssh:"), makeString("sftp:"), makeString("smb:"), makeString("sms:"), makeString("soldat:"), makeString("steam:"), makeString("tag:"), makeString("unreal:"), makeString("ut2004:"), makeString("webcal:"), makeString("xfire:"), makeString("ymsgr:") });

    private static final SubLList $list100 = list(makeString("http://"), makeString("https://"), makeString("ftp://"), makeString("gopher://"), makeString("file:"), makeString("news:"), makeString("mailto:"), makeString("anon:"));

    private static final SubLList $list101 = list(CHAR_space, CHAR_period, CHAR_comma, CHAR_question, CHAR_exclamation, CHAR_rparen);

    private static final SubLSymbol VALID_URL_CHAR_P = makeSymbol("VALID-URL-CHAR-P");

    private static final SubLString $str103$_____________________ = makeString(";@?%/:=$-_.+!*'(),#&~");

    private static final SubLString $str104$___ = makeString("../");

    private static final SubLString $str105$__ = makeString("//");

    private static final SubLSymbol RESOLVE_RELATIVE_URI = makeSymbol("RESOLVE-RELATIVE-URI");













    private static final SubLList $list113 = list(new SubLObject[]{ list(list(makeString("http://example.org"), makeString("relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org#"), makeString("prop")), makeString("http://example.org#prop")), list(list(makeString("http://example.org/"), makeString("named")), makeString("http://example.org/named")), list(list(makeString("http://example.org/#"), makeString("owes")), makeString("http://example.org/#owes")), list(list(makeString("http://example.org/dir/file"), makeString("relfile")), makeString("http://example.org/dir/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("../relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("/absfile")), makeString("http://example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("//another.example.org/absfile")), makeString("http://another.example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("#foo")), makeString("http://example.org/dir/file#foo")), list(list(makeString("http://example.org/dir/file"), makeString("")), makeString("http://example.org/dir/file")), list(list(makeString("http://foo/"), makeString("Bar")), makeString("http://foo/Bar")), list(list(makeString("http://my.example.org/"), makeString("Name")), makeString("http://my.example.org/Name")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Creator")), makeString("http://purl.org/metadata/dublin_core#Creator")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Title")), makeString("http://purl.org/metadata/dublin_core#Title")), list(list(makeString("http://random.ioctl.org/#"), makeString("prop2")), makeString("http://random.ioctl.org/#prop2")), list(list(makeString("http://random.ioctl.org/#"), makeString("someProperty")), makeString("http://random.ioctl.org/#someProperty")), list(list(makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), makeString("_2")), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), makeString("Manifest.rdf")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), makeString("premises005.rdf#B")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), makeString("#frag")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag")) });

    private static final SubLString $str114$http___schemas_xmlsoap_org_soap_e = makeString("http://schemas.xmlsoap.org/soap/envelope/");

    private static final SubLSymbol SOAP_NAME = makeSymbol("SOAP-NAME");

    private static final SubLString $str116$soap_ = makeString("soap:");

    private static final SubLSymbol $soap_name_caching_state$ = makeSymbol("*SOAP-NAME-CACHING-STATE*");

    private static final SubLSymbol SOAP_EXPANDED_NAME = makeSymbol("SOAP-EXPANDED-NAME");

    private static final SubLSymbol $soap_expanded_name_caching_state$ = makeSymbol("*SOAP-EXPANDED-NAME-CACHING-STATE*");

    private static final SubLString $$$Envelope = makeString("Envelope");

    private static final SubLSymbol PERFORM_SOAP_POST_CACHED = makeSymbol("PERFORM-SOAP-POST-CACHED");

    private static final SubLSymbol $perform_soap_post_cached_caching_state$ = makeSymbol("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*");

    private static final SubLString $str123$text_xml__charset_utf_8 = makeString("text/xml; charset=utf-8");

    private static final SubLString $str124$US_ASCII = makeString("US-ASCII");

    private static final SubLString $str125$xmlns_soap = makeString("xmlns:soap");

    private static final SubLString $$$Header = makeString("Header");

    private static final SubLList $list127 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));

    private static final SubLString $$$xmlns = makeString("xmlns");

    private static final SubLString $$$Body = makeString("Body");

    private static final SubLList $list130 = list(CHAR_space, CHAR_slash);

    private static final SubLString $$$HTTP = makeString("HTTP");

    private static final SubLString $str132$Location__ = makeString("Location: ");



    private static final SubLString $str134$http___ = makeString("http://");

    private static final SubLString $str135$https___ = makeString("https://");



    private static final SubLList $list137 = list(makeSymbol("MSG"), makeSymbol("EXP"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list138 = list(NIL);





    private static final SubLString $str141$_____Averted__connection_reset_by = makeString("~&>> Averted 'connection reset by peer' error !!");

    private static final SubLString $$$0 = makeString("0");

    private static final SubLString $$$_GMT = makeString(" GMT");

    public static final SubLList $list144 = list(makeSymbol("PATTERN"), makeSymbol("LIST"));



    private static final SubLList $list146 = list(list(makeSymbol("FUNCTION"), makeSymbol("SEARCH")));

    private static final SubLList $list147 = list(makeSymbol("LIST"));





    private static final SubLSymbol HTML_TOKENS_FAST_FORWARD = makeSymbol("HTML-TOKENS-FAST-FORWARD");



    private static final SubLList $list152 = list(makeSymbol("TOKENS"), makeSymbol("TAG"));

    private static final SubLSymbol $sym153$MARKER = makeUninternedSymbol("MARKER");

    private static final SubLSymbol HTML_TOKENS_EXTRACT_CURR = makeSymbol("HTML-TOKENS-EXTRACT-CURR");







    private static final SubLString $str158$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");

    private static final SubLSymbol HTML_TOKENS_STEP = makeSymbol("HTML-TOKENS-STEP");

    private static final SubLSymbol $sym160$MARKER = makeUninternedSymbol("MARKER");

    private static final SubLSymbol $sym161$IS_HTML_TERMINATING_TAG_ = makeSymbol("IS-HTML-TERMINATING-TAG?");

    private static final SubLString $str162$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");

    private static final SubLList $list163 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"));



    private static final SubLSymbol HTML_CONSUME_STARTING_TAG = makeSymbol("HTML-CONSUME-STARTING-TAG");

    private static final SubLSymbol HTML_CONSUME_CLOSING_TAG = makeSymbol("HTML-CONSUME-CLOSING-TAG");

    private static final SubLList $list167 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));

    private static final SubLSymbol $sym168$TEMP = makeUninternedSymbol("TEMP");



    private static final SubLSymbol $sym170$TEST_FOR_HTML_TAG_ = makeSymbol("TEST-FOR-HTML-TAG?");

    private static final SubLSymbol HTML_EXTRACT_TAG_CONTENT = makeSymbol("HTML-EXTRACT-TAG-CONTENT");



    private static final SubLString $str173$Unable_to_open__S = makeString("Unable to open ~S");



    private static final SubLString $str175$_ = makeString("&");

    private static final SubLString $str176$_ = makeString("=");



    private static final SubLList $list178 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym179$MATCHING_OPEN_TAG_ = makeSymbol("MATCHING-OPEN-TAG?");

    private static final SubLList $list180 = list(list(list(makeString("tag"), makeString("<tag>")), T), list(list(makeString("tag"), makeString("</tag>")), NIL), list(list(makeString("tag"), makeString("<TAG>")), NIL), list(list(makeString("tag"), makeString("<TAG>"), EQUALP), T));

    private static final SubLSymbol $sym181$MATCHING_CLOSE_TAG_ = makeSymbol("MATCHING-CLOSE-TAG?");

    public static final SubLList $list182 = list(list(list(makeString("tag"), makeString("<tag>")), NIL), list(list(makeString("tag"), makeString("</tag>")), T), list(list(makeString("tag"), makeString("</TAG>")), NIL), list(list(makeString("tag"), makeString("</TAG>"), EQUALP), T));

    private static final SubLString $$$localhost = makeString("localhost");

    private static final SubLString $str184$_cgi_bin_services = makeString("/cgi-bin/services");

    private static final SubLSymbol BYTE_ORDER_MARK = makeSymbol("BYTE-ORDER-MARK");

    private static final SubLString $str186$_ufeff_ = makeString("&ufeff;");

    private static final SubLSymbol $byte_order_mark_caching_state$ = makeSymbol("*BYTE-ORDER-MARK-CACHING-STATE*");

    private static final SubLString $str188$___A__A_____ = makeString("~{~A=~A~^&~}");

    private static final SubLSymbol HTML_ENCODE_SEXPR = makeSymbol("HTML-ENCODE-SEXPR");



    private static final SubLList $list191 = list(makeString("text/html"), makeString("*/*"));

    private static final SubLString $str192$file___ = makeString("file://");

    private static final SubLSymbol $sym193$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");



    private static final SubLSymbol START_SERVLET_CONTAINER_INT = makeSymbol("START-SERVLET-CONTAINER-INT");

    private static final SubLSymbol $sym196$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol START_SERVLET_CONTAINER = makeSymbol("START-SERVLET-CONTAINER");



    private static final SubLList $list199 = list(makeKeyword("EXTERNAL"), makeSymbol("START-SERVLET-CONTAINER"));

    private static final SubLSymbol STOP_SERVLET_CONTAINER_INT = makeSymbol("STOP-SERVLET-CONTAINER-INT");



    private static final SubLString $str202$cyc_servlet_container_tmp_dir_ = makeString("cyc-servlet-container-tmp-dir-");

    private static final SubLString $str203$_ = makeString("-");

    private static final SubLString $str204$webapps_apps_webapp_manifest_xml = makeString("webapps/apps/webapp-manifest.xml");

    private static final SubLString $$$filename = makeString("filename");

    private static final SubLString $$$contextRoot = makeString("contextRoot");

    private static final SubLString $$$webapp = makeString("webapp");

    private static final SubLString $str208$Unable_to_find_webapp_manifest_fi = makeString("Unable to find webapp manifest file at ~S");

    public static SubLObject with_http_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = NIL;
        SubLObject machine = NIL;
        SubLObject url = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        channel = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        machine = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        url = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list1);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list1);
            if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list1);
        }
        final SubLObject query_tail = property_list_member($QUERY, current);
        final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
        final SubLObject method_tail = property_list_member($METHOD, current);
        final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
        final SubLObject port_tail = property_list_member($PORT, current);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $DEFAULT;
        final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
        final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
        final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
        final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
        final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
        final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : NIL;
        final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
        final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
        final SubLObject content_type_tail = property_list_member($CONTENT_TYPE, current);
        final SubLObject content_type = (NIL != content_type_tail) ? cadr(content_type_tail) : $DEFAULT;
        final SubLObject soap_action_uri_tail = property_list_member($SOAP_ACTION_URI, current);
        final SubLObject soap_action_uri = (NIL != soap_action_uri_tail) ? cadr(soap_action_uri_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject real_port = $sym15$REAL_PORT;
        return list(CLET, list(list(real_port, list(FIF, listS(EQL, port, $list18), $int$80, port))), listS(WITH_TCP_CONNECTION, list(channel, machine, real_port, $ACCESS_MODE, $PRIVATE, $TIMEOUT, timeout), list(SEND_HTTP_REQUEST, channel, list(new SubLObject[]{ LIST, $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types, $CONTENT_TYPE, content_type, $SOAP_ACTION_URI, soap_action_uri })), append(body, NIL)));
    }

    public static SubLObject http_read_request(final SubLObject instream, SubLObject parse_header) {
        if (parse_header == UNPROVIDED) {
            parse_header = NIL;
        }
        SubLObject request_header = NIL;
        SubLObject done = NIL;
        SubLObject method = NIL;
        SubLObject version = NIL;
        SubLObject uri = NIL;
        SubLObject line = NIL;
        line = string_utilities.network_read_line(instream, NIL, NIL, UNPROVIDED);
        if (NIL == line) {
            return NIL;
        }
        final SubLObject first_space = position(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject last_space = list_utilities.position_from_end(CHAR_space, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (first_space.eql(last_space)) {
            last_space = NIL;
        }
        if (NIL != first_space) {
            method = string_utilities.substring(line, ZERO_INTEGER, first_space);
            uri = (NIL != $decode_urls_during_http_read_request$.getGlobalValue()) ? html_url_decode(string_utilities.substring(line, number_utilities.f_1X(first_space), last_space)) : string_utilities.substring(line, number_utilities.f_1X(first_space), last_space);
            if (NIL != last_space) {
                version = string_utilities.substring(line, number_utilities.f_1X(last_space), UNPROVIDED);
            }
        }
        if (NIL != parse_header) {
            while (NIL == done) {
                line = string_utilities.network_read_line(instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
                if (line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                    done = T;
                } else
                    if (Strings.sublisp_char(line, ZERO_INTEGER).eql(CHAR_space) || Strings.sublisp_char(line, ZERO_INTEGER).eql(CHAR_tab)) {
                        if (NIL == request_header) {
                            continue;
                        }
                        final SubLObject old_field = request_header.first();
                        rplacd(old_field, cconcatenate(old_field.rest(), line));
                    } else {
                        final SubLObject colon = position(CHAR_colon, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == colon) {
                            continue;
                        }
                        request_header = cons(cons(string_utilities.substring(line, ZERO_INTEGER, subtract(colon, ZERO_INTEGER)), string_utilities.trim_whitespace(string_utilities.substring(line, add(colon, ONE_INTEGER), UNPROVIDED))), request_header);
                    }

            } 
        } else {
            while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                line = string_utilities.network_read_line(instream, NIL, string_utilities.$empty_string$.getGlobalValue(), UNPROVIDED);
            } 
        }
        return http_possibly_repack_request(method, uri, version, request_header);
    }

    public static SubLObject make_html_cyc_login_session() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_id = string_utilities.random_string($html_alternate_uri_format_session_id_length$.getGlobalValue());
        dictionary.dictionary_enter($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, html_kernel.$http_remote_host$.getDynamicValue(thread));
        return session_id;
    }

    public static SubLObject destroy_cyc_login_session(final SubLObject session_id) {
        return dictionary.dictionary_remove($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id);
    }

    public static SubLObject cyc_login_session_id_machine_name(final SubLObject session_id) {
        return dictionary.dictionary_lookup_without_values($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, UNPROVIDED);
    }

    public static SubLObject valid_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return makeBoolean(((possible_session_string.isString() && (NIL != list_utilities.lengthE(possible_session_string, $html_alternate_uri_format_session_id_length$.getGlobalValue(), UNPROVIDED))) && (NIL != string_utilities.alphabetic_stringP(possible_session_string))) && (NIL != string_utilities.lower_case_string_p(possible_session_string)));
    }

    public static SubLObject current_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return dictionary.dictionary_lookup_without_values($html_cyc_login_session_string_to_remote_host$.getGlobalValue(), possible_session_string, UNPROVIDED);
    }

    public static SubLObject http_possibly_repack_request(final SubLObject method, SubLObject uri, final SubLObject version, SubLObject request_header) {
        if (NIL != string_utilities.starts_with(uri, $http_alternate_uri_format_a_prefix$.getGlobalValue())) {
            uri = string_utilities.string_substitute($str29$_, $str30$_cg_, uri, UNPROVIDED);
            final SubLObject q_pos = position(CHAR_question, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject a_pos = position(CHAR_ampersand, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != q_pos) && ((NIL == a_pos) || (!a_pos.numL(q_pos)))) {
                set_aref(uri, q_pos, CHAR_ampersand);
            }
            SubLObject uri_parts = cddr(string_utilities.string_tokenize(uri, $list31, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            SubLObject session_string = NIL;
            SubLObject new_uri = NIL;
            if (NIL != current_html_cyc_login_session_idP(uri_parts.first())) {
                session_string = uri_parts.first();
                request_header = list_utilities.alist_enter(request_header, $str32$Remote_Host, session_string, symbol_function(EQUAL));
                uri_parts = uri_parts.rest();
            }
            new_uri = cconcatenate(http_kernel.$http_cgi_bin_directory$.getGlobalValue(), new SubLObject[]{ $str29$_, string_utilities.bunge(uri_parts, CHAR_slash) });
            return values(method, new_uri, version, request_header);
        }
        return values(method, uri, version, request_header);
    }

    public static SubLObject within_html_cyc_login_sessionP() {
        return valid_html_cyc_login_session_idP(html_kernel.http_state_key_for_request());
    }

    public static SubLObject possibly_add_html_javascript_redirect_when_top_level_page() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != within_html_cyc_login_sessionP()) {
            html_source_readability_terpri(UNPROVIDED);
            html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_char(CHAR_quotation, UNPROVIDED);
            html_char(CHAR_greater, UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind(T, thread);
                format(html_macros.$html_stream$.getDynamicValue(thread), $html_possibly_redirect_to_portal_script$.getGlobalValue(), html_kernel.http_state_key_for_request());
                html_source_readability_terpri(UNPROVIDED);
            } finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject http_send_ok_response(final SubLObject outstream, final SubLObject header_fields) {
        write_string($str39$HTTP_1_1_200_OK, outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return NIL;
    }

    public static SubLObject http_send_error_response(final SubLObject outstream, final SubLObject error_code, final SubLObject header_fields) {
        write_string($str40$HTTP_1_1_, outstream, UNPROVIDED, UNPROVIDED);
        princ(error_code, outstream);
        write_char(CHAR_space, outstream);
        write_string(assoc(error_code, $http_error_codes$.getGlobalValue(), UNPROVIDED, UNPROVIDED).rest(), outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return NIL;
    }

    public static SubLObject send_http_request(final SubLObject channel, final SubLObject v_properties) {
        assert NIL != streamp(channel) : "Types.streamp(channel) " + "CommonSymbols.NIL != Types.streamp(channel) " + channel;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = v_properties;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, v_properties, $list48);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, v_properties, $list48);
            if (NIL == member(current_$2, $list49, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(v_properties, $list48);
        }
        final SubLObject machine_tail = property_list_member($MACHINE, v_properties);
        final SubLObject machine = (NIL != machine_tail) ? cadr(machine_tail) : NIL;
        final SubLObject port_tail = property_list_member($PORT, v_properties);
        final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $int$80;
        final SubLObject method_tail = property_list_member($METHOD, v_properties);
        final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
        final SubLObject url_tail = property_list_member($URL, v_properties);
        final SubLObject url = (NIL != url_tail) ? cadr(url_tail) : NIL;
        final SubLObject query_tail = property_list_member($QUERY, v_properties);
        final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
        final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, v_properties);
        final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
        final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, v_properties);
        final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
        final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, v_properties);
        final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
        final SubLObject content_type_tail = property_list_member($CONTENT_TYPE, v_properties);
        final SubLObject content_type = (NIL != content_type_tail) ? cadr(content_type_tail) : $DEFAULT;
        final SubLObject soap_action_uri_tail = property_list_member($SOAP_ACTION_URI, v_properties);
        final SubLObject soap_action_uri = (NIL != soap_action_uri_tail) ? cadr(soap_action_uri_tail) : NIL;
        http_request_internal(channel, method, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        force_output(channel);
        return channel;
    }

    public static SubLObject http_request_internal(final SubLObject out_stream, final SubLObject method, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (content_type == UNPROVIDED) {
            content_type = $DEFAULT;
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        assert NIL != keywordp(method) : "Types.keywordp(method) " + "CommonSymbols.NIL != Types.keywordp(method) " + method;
        assert NIL != stringp(machine) : "Types.stringp(machine) " + "CommonSymbols.NIL != Types.stringp(machine) " + machine;
        if (((!port.eql($DEFAULT)) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(port))) {
            throw new AssertionError(port);
        }
        assert NIL != stringp(url) : "Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) " + url;
        if (accept_types.eql($DEFAULT)) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        final SubLObject list_var = accept_types;
        assert NIL != list_utilities.non_dotted_list_p(list_var) : "list_utilities.non_dotted_list_p(list_var) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(list_var) " + list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != stringp(elem) : "Types.stringp(elem) " + "CommonSymbols.NIL != Types.stringp(elem) " + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (method.eql($GET)) {
            http_send_get_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
        } else
            if (method.eql($POST)) {
                assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
                if (content_type.eql($DEFAULT)) {
                    content_type = $http_post_default_content_type$.getGlobalValue();
                }
                http_send_post_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
            } else
                if (method.eql($PUT)) {
                    assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
                    if (content_type.eql($DEFAULT)) {
                        content_type = $http_put_default_content_type$.getGlobalValue();
                    }
                    http_send_put_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
                } else
                    if (method.eql($DELETE)) {
                        assert NIL != stringp(query) : "Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) " + query;
                        if (content_type.eql($DEFAULT)) {
                            content_type = $http_delete_default_content_type$.getGlobalValue();
                        }
                        http_send_delete_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
                    } else {
                        Errors.error($str57$Unsupported_HTTP_request_method__, method);
                    }



        return NIL;
    }

    public static SubLObject test_http_request(final SubLObject machine, final SubLObject url, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLObject result = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            final SubLObject current;
            final SubLObject datum = current = v_properties;
            SubLObject allow_other_keys_p = NIL;
            SubLObject rest = current;
            SubLObject bad = NIL;
            SubLObject current_$3 = NIL;
            while (NIL != rest) {
                destructuring_bind_must_consp(rest, datum, $list58);
                current_$3 = rest.first();
                rest = rest.rest();
                destructuring_bind_must_consp(rest, datum, $list58);
                if (NIL == member(current_$3, $list59, UNPROVIDED, UNPROVIDED)) {
                    bad = T;
                }
                if (current_$3 == $ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            } 
            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                cdestructuring_bind_error(datum, $list58);
            }
            final SubLObject query_tail = property_list_member($QUERY, current);
            final SubLObject query = (NIL != query_tail) ? cadr(query_tail) : NIL;
            final SubLObject method_tail = property_list_member($METHOD, current);
            final SubLObject method = (NIL != method_tail) ? cadr(method_tail) : $GET;
            final SubLObject port_tail = property_list_member($PORT, current);
            final SubLObject port = (NIL != port_tail) ? cadr(port_tail) : $DEFAULT;
            final SubLObject keep_aliveP_tail = property_list_member($kw9$KEEP_ALIVE_, current);
            final SubLObject keep_aliveP = (NIL != keep_aliveP_tail) ? cadr(keep_aliveP_tail) : T;
            final SubLObject wide_newlinesP_tail = property_list_member($kw10$WIDE_NEWLINES_, current);
            final SubLObject wide_newlinesP = (NIL != wide_newlinesP_tail) ? cadr(wide_newlinesP_tail) : NIL;
            final SubLObject timeout_tail = property_list_member($TIMEOUT, current);
            final SubLObject timeout = (NIL != timeout_tail) ? cadr(timeout_tail) : NIL;
            final SubLObject accept_types_tail = property_list_member($ACCEPT_TYPES, current);
            final SubLObject accept_types = (NIL != accept_types_tail) ? cadr(accept_types_tail) : $DEFAULT;
            send_http_request(stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, method, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, wide_newlinesP, $ACCEPT_TYPES, accept_types }));
            result = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    public static SubLObject http_with_cookies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cookie_list = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        cookie_list = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($http_cookies_to_include_in_requests$, cookie_list)), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list60);
        return NIL;
    }

    public static SubLObject get_current_cookies_for_request() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $http_cookies_to_include_in_requests$.getDynamicValue(thread);
    }

    public static SubLObject http_send_generic_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, final SubLObject template, final SubLObject template_order, final SubLObject tracer, final SubLObject content_type, SubLObject accept_types, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (NIL != tracer) {
            out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        final SubLObject length = length(query);
        SubLObject cdolist_list_var = template_order;
        SubLObject command = NIL;
        command = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule = assoc(command, template, UNPROVIDED, UNPROVIDED);
            SubLObject skippedP = NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            format_string = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql($VERSION)) {
                    format(out_stream, format_string, url);
                } else
                    if (pcase_var.eql($ACCEPT)) {
                        http_output_accept_types(out_stream, format_string, accept_types);
                    } else
                        if (pcase_var.eql($CONNECTION)) {
                            if (keep_aliveP.isInteger()) {
                                format(out_stream, $str66$Keep_Alive___S, keep_aliveP);
                                if (NIL != wide_newlinesP) {
                                    string_utilities.network_terpri(out_stream);
                                } else {
                                    terpri(out_stream);
                                }
                            }
                            format(out_stream, format_string, NIL != keep_aliveP ? $str67$keep_alive : $$$close);
                        } else
                            if (pcase_var.eql($USER_AGENT)) {
                                format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                            } else
                                if (pcase_var.eql($HOST)) {
                                    format(out_stream, format_string, machine, port.eql($DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : cconcatenate($str71$_, format_nil.format_nil_a_no_copy(port)));
                                } else
                                    if (!pcase_var.eql($BLANK_LINE)) {
                                        if (pcase_var.eql($COOKIES)) {
                                            if (NIL == get_current_cookies_for_request()) {
                                                skippedP = T;
                                            } else {
                                                SubLObject cdolist_list_var_$4 = get_current_cookies_for_request();
                                                SubLObject cookie_string = NIL;
                                                cookie_string = cdolist_list_var_$4.first();
                                                while (NIL != cdolist_list_var_$4) {
                                                    format(out_stream, format_string, cookie_string);
                                                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                                    cookie_string = cdolist_list_var_$4.first();
                                                } 
                                            }
                                        } else
                                            if (pcase_var.eql($CONTENT_TYPE)) {
                                                format(out_stream, format_string, content_type);
                                            } else
                                                if (pcase_var.eql($CONTENT_LENGTH)) {
                                                    format(out_stream, format_string, length);
                                                } else
                                                    if (pcase_var.eql($SOAP_ACTION)) {
                                                        if (NIL != soap_action_uri) {
                                                            format(out_stream, format_string, soap_action_uri);
                                                        } else {
                                                            skippedP = T;
                                                        }
                                                    } else
                                                        if (pcase_var.eql($QUERY)) {
                                                            format(out_stream, format_string, query);
                                                        } else
                                                            if (format_string.isString()) {
                                                                write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
                                                            }





                                    }





            } else {
                cdestructuring_bind_error(datum, $list62);
            }
            if (NIL == skippedP) {
                if (NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                } else {
                    terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        } 
        if (NIL != tracer) {
            force_output(T);
        }
        return original_stream;
    }

    public static SubLObject http_send_post_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_post_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_post_request_template_components$.getGlobalValue(), $http_post_request_template_order$.getGlobalValue(), $trace_http_send_post_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static SubLObject http_send_put_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_put_request_template_components$.getGlobalValue(), $http_put_request_template_order$.getGlobalValue(), $trace_http_send_put_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static SubLObject http_send_delete_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        if (content_type == UNPROVIDED) {
            content_type = $http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == UNPROVIDED) {
            soap_action_uri = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, $http_delete_request_template_components$.getGlobalValue(), $http_delete_request_template_order$.getGlobalValue(), $trace_http_send_delete_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }

    public static SubLObject http_output_accept_types(final SubLObject out_stream, final SubLObject format_string, final SubLObject accept_types) {
        format(out_stream, format_string);
        SubLObject done_oneP = NIL;
        SubLObject cdolist_list_var = accept_types;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != done_oneP) {
                princ($str76$__, out_stream);
            }
            princ(type, out_stream);
            done_oneP = T;
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject http_send_get_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == UNPROVIDED) {
            accept_types = $http_default_accept_types$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
            out_stream = make_broadcast_stream(list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        SubLObject full_url = url;
        if (NIL != string_utilities.non_empty_string_p(query)) {
            full_url = cconcatenate(full_url, new SubLObject[]{ $str77$_, query });
        }
        SubLObject cdolist_list_var = $http_get_request_template_order$.getGlobalValue();
        SubLObject command = NIL;
        command = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject rule = assoc(command, $http_get_request_template_components$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            SubLObject skippedP = NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            action = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            format_string = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql($VERSION)) {
                    format(out_stream, format_string, full_url);
                } else
                    if (pcase_var.eql($ACCEPT)) {
                        http_output_accept_types(out_stream, format_string, accept_types);
                    } else
                        if (pcase_var.eql($CONNECTION)) {
                            if (keep_aliveP.isInteger()) {
                                format(out_stream, $str66$Keep_Alive___S, keep_aliveP);
                                if (NIL != wide_newlinesP) {
                                    string_utilities.network_terpri(out_stream);
                                } else {
                                    terpri(out_stream);
                                }
                            }
                            format(out_stream, format_string, NIL != keep_aliveP ? $str67$keep_alive : $$$close);
                        } else
                            if (pcase_var.eql($USER_AGENT)) {
                                format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                            } else
                                if (pcase_var.eql($COOKIES)) {
                                    if (NIL == get_current_cookies_for_request()) {
                                        skippedP = T;
                                    } else {
                                        SubLObject cdolist_list_var_$5 = get_current_cookies_for_request();
                                        SubLObject cookie_string = NIL;
                                        cookie_string = cdolist_list_var_$5.first();
                                        while (NIL != cdolist_list_var_$5) {
                                            format(out_stream, format_string, cookie_string);
                                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                                            cookie_string = cdolist_list_var_$5.first();
                                        } 
                                    }
                                } else
                                    if (pcase_var.eql($HOST)) {
                                        format(out_stream, format_string, machine, port.eql($DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : cconcatenate($str71$_, format_nil.format_nil_a_no_copy(port)));
                                    } else
                                        if (!pcase_var.eql($BLANK_LINE)) {
                                            if (format_string.isString()) {
                                                write_string(format_string, out_stream, UNPROVIDED, UNPROVIDED);
                                            }
                                        }






            } else {
                cdestructuring_bind_error(datum, $list62);
            }
            if (NIL == skippedP) {
                if (NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                } else {
                    terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        } 
        if (NIL != $trace_http_send_post_requests$.getDynamicValue(thread)) {
            force_output(T);
        }
        return original_stream;
    }

    public static SubLObject http_send_response_header(final SubLObject outstream, final SubLObject header_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string($str78$Date__, outstream, UNPROVIDED, UNPROVIDED);
        write_http_date(outstream, UNPROVIDED);
        http_network_terpri(outstream);
        write_string($str79$Server__Cyc_, outstream, UNPROVIDED, UNPROVIDED);
        write_string(system_info.cyc_revision_string(), outstream, UNPROVIDED, UNPROVIDED);
        write_string($str29$_, outstream, UNPROVIDED, UNPROVIDED);
        princ(system_parameters.$base_tcp_port$.getDynamicValue(thread), outstream);
        http_network_terpri(outstream);
        SubLObject cdolist_list_var = header_fields;
        SubLObject field = NIL;
        field = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string(field.first(), outstream, UNPROVIDED, UNPROVIDED);
            write_string($str80$__, outstream, UNPROVIDED, UNPROVIDED);
            princ(field.rest(), outstream);
            http_network_terpri(outstream);
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        } 
        http_network_terpri(outstream);
        return T;
    }

    public static SubLObject http_extract_cookies_from_reply_header(final SubLObject string) {
        SubLObject position = ZERO_INTEGER;
        SubLObject cookie_information = NIL;
        while (position.isFixnum()) {
            position = search($http_header_cookie_keyword$.getGlobalValue(), string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), ZERO_INTEGER, NIL, position, UNPROVIDED);
            if (position.isFixnum()) {
                final SubLObject end_position = position(CHAR_return, string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), position, UNPROVIDED);
                final SubLObject cut_position = add(position, ONE_INTEGER, length($http_header_cookie_keyword$.getGlobalValue()));
                final SubLObject cookie_encoding = string_utilities.substring(string, cut_position, end_position);
                final SubLObject cookie_string = http_compute_cookie_string_from_encoding(cookie_encoding);
                cookie_information = cons(cookie_string, cookie_information);
                position = end_position;
            }
        } 
        return cookie_information;
    }

    public static SubLObject http_compute_cookie_string_from_encoding(final SubLObject encoding) {
        final SubLObject pieces = http_decompose_cookie_encoding_string(encoding);
        SubLObject return_encoding = $str86$;
        SubLObject cdolist_list_var = pieces;
        SubLObject piece = NIL;
        piece = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == string_utilities.empty_string_p(piece)) && (NIL == filter_predefined_named_cookie_attributes(piece))) {
                return_encoding = cconcatenate(return_encoding, new SubLObject[]{ $str87$__, piece });
            }
            cdolist_list_var = cdolist_list_var.rest();
            piece = cdolist_list_var.first();
        } 
        return return_encoding;
    }

    public static SubLObject filter_predefined_named_cookie_attributes(final SubLObject name_value_pair) {
        final SubLObject name_value_pair_size = length(name_value_pair);
        SubLObject filterP = NIL;
        if (NIL == filterP) {
            SubLObject csome_list_var = $http_filtered_predefined_named_cookie_attributes$.getGlobalValue();
            SubLObject known_attribute = NIL;
            known_attribute = csome_list_var.first();
            while ((NIL == filterP) && (NIL != csome_list_var)) {
                final SubLObject size = length(known_attribute);
                if (size.numL(name_value_pair_size) && (NIL != Strings.string_equal(known_attribute, name_value_pair, ZERO_INTEGER, NIL, ZERO_INTEGER, size))) {
                    filterP = T;
                }
                csome_list_var = csome_list_var.rest();
                known_attribute = csome_list_var.first();
            } 
        }
        return filterP;
    }

    public static SubLObject http_decompose_cookie_encoding_string(final SubLObject encoding) {
        return remove_if(symbol_function(EMPTY_STRING_P), Mapping.mapcar(symbol_function(TRIM_WHITESPACE), string_utilities.split_string(encoding, $http_cookie_separation_charset$.getGlobalValue())), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_url_encode(final SubLObject string, SubLObject encode_equalsP) {
        if (encode_equalsP == UNPROVIDED) {
            encode_equalsP = NIL;
        }
        final SubLObject length = length(string);
        final SubLObject count = (NIL != encode_equalsP) ? count_if(symbol_function(HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS), string, UNPROVIDED, UNPROVIDED, UNPROVIDED) : count_if(symbol_function(HTML_URL_EXPAND_CHAR), string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (ZERO_INTEGER.numE(count)) {
            return string;
        }
        final SubLObject new_length = add(length, multiply(count, TWO_INTEGER));
        final SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_index = ZERO_INTEGER;
        SubLObject index;
        SubLObject v_char;
        SubLObject needs_encodingP;
        SubLObject code;
        for (index = NIL, index = ZERO_INTEGER; index.numL(length); index = add(index, ONE_INTEGER)) {
            v_char = Strings.sublisp_char(string, index);
            needs_encodingP = (NIL != encode_equalsP) ? html_url_expand_char_including_equals(v_char) : html_url_expand_char(v_char);
            if (NIL != needs_encodingP) {
                code = char_code(v_char);
                Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_percent);
                Strings.set_char(new_string, add(new_index, ONE_INTEGER), string_utilities.hex_char(integerDivide(code, SIXTEEN_INTEGER)));
                Strings.set_char(new_string, add(new_index, TWO_INTEGER), string_utilities.hex_char(mod(code, SIXTEEN_INTEGER)));
                new_index = add(new_index, THREE_INTEGER);
            } else {
                if (v_char.eql(CHAR_space)) {
                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), CHAR_plus);
                } else {
                    Strings.set_char(new_string, add(new_index, ZERO_INTEGER), v_char);
                }
                new_index = add(new_index, ONE_INTEGER);
            }
        }
        return new_string;
    }

    public static SubLObject html_url_expand_char(final SubLObject v_char) {
        return makeBoolean(((v_char.isChar() && ((NIL == alpha_char_p(v_char)) || (NIL == unicode_strings.ascii_char_p(v_char)))) && (NIL == digit_char_p(v_char, UNPROVIDED))) && (NIL == find(v_char, $str92$____, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject html_url_expand_char_including_equals(final SubLObject v_char) {
        return makeBoolean(v_char.eql(CHAR_equal) || (NIL != html_url_expand_char(v_char)));
    }

    public static SubLObject html_url_decode(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = length(string);
        final SubLObject count = count(CHAR_percent, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (length.numE(count)) {
            return nsubstitute(CHAR_space, CHAR_plus, string_utilities.copy_string(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLObject new_length = subtract(length, multiply(count, TWO_INTEGER));
        SubLObject new_string = Strings.make_string(new_length, UNPROVIDED);
        SubLObject new_index = ZERO_INTEGER;
        SubLObject index = ZERO_INTEGER;
        while (index.numL(length)) {
            final SubLObject v_char = Strings.sublisp_char(string, index);
            if (NIL != charE(CHAR_percent, v_char)) {
                thread.resetMultipleValues();
                final SubLObject decoded_char = decode_url_percent_encoded_char(string, index);
                final SubLObject chars_consumed = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (decoded_char.isChar()) {
                    Strings.set_char(new_string, new_index, decoded_char);
                    new_index = add(new_index, ONE_INTEGER);
                } else
                    if (decoded_char.isString()) {
                        new_string = cconcatenate(string_utilities.substring(new_string, ZERO_INTEGER, new_index), new SubLObject[]{ decoded_char, string_utilities.substring(new_string, add(new_index, ONE_INTEGER), UNPROVIDED) });
                        new_index = add(new_index, length(decoded_char));
                    }

                index = add(index, chars_consumed);
            } else {
                if (v_char.eql(CHAR_plus)) {
                    Strings.set_char(new_string, new_index, CHAR_space);
                } else {
                    Strings.set_char(new_string, new_index, v_char);
                }
                new_index = add(new_index, ONE_INTEGER);
                index = add(index, ONE_INTEGER);
            }
        } 
        return new_string;
    }

    public static SubLObject decode_url_percent_encoded_char(final SubLObject string, final SubLObject index) {
        final SubLObject next_char = Strings.sublisp_char(string, add(index, ONE_INTEGER));
        if (next_char.eql(CHAR_u)) {
            final SubLObject char_code = parse_integer(string, add(index, TWO_INTEGER), add(index, SIX_INTEGER), SIXTEEN_INTEGER, UNPROVIDED);
            final SubLObject new_char_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(make_vector(ONE_INTEGER, char_code), UNPROVIDED, UNPROVIDED));
            return values(new_char_string, SIX_INTEGER);
        }
        final SubLObject high_char = next_char;
        final SubLObject low_char = Strings.sublisp_char(string, add(index, TWO_INTEGER));
        final SubLObject code = vector_utilities.hex_chars_to_byte(high_char, low_char);
        final SubLObject decoded_char = code_char(code);
        return values(decoded_char, THREE_INTEGER);
    }

    public static SubLObject html_glyph_decode(SubLObject string) {
        string = html_ascii_glyph_decode(string);
        return string;
    }

    public static SubLObject html_ascii_glyph_decode(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject restart;
        for (SubLObject done = NIL; NIL == done; done = makeBoolean(NIL == restart)) {
            restart = NIL;
            if (NIL == restart) {
                SubLObject end_var;
                SubLObject glyph_start;
                SubLObject glyph_end;
                SubLObject char_code;
                SubLObject prefix;
                SubLObject replacement;
                SubLObject postfix;
                for (end_var = length(string), glyph_start = NIL, glyph_start = ZERO_INTEGER; (NIL == restart) && (!glyph_start.numGE(end_var)); glyph_start = number_utilities.f_1X(glyph_start)) {
                    thread.resetMultipleValues();
                    glyph_end = html_ascii_glyph_p(string, glyph_start);
                    char_code = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != glyph_end) {
                        prefix = subseq(string, ZERO_INTEGER, glyph_start);
                        replacement = Strings.make_string(ONE_INTEGER, code_char(char_code));
                        postfix = subseq(string, glyph_end, length(string));
                        string = cconcatenate(prefix, new SubLObject[]{ replacement, postfix });
                        restart = T;
                    }
                }
            }
        }
        return string;
    }

    public static SubLObject html_ascii_glyph_p(final SubLObject string, SubLObject start) {
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        final SubLObject length = length(string);
        if ((subtract(length, start).numGE(FOUR_INTEGER) && (NIL != charE(CHAR_ampersand, Strings.sublisp_char(string, add(ZERO_INTEGER, start))))) && (NIL != charE(CHAR_hash, Strings.sublisp_char(string, add(ONE_INTEGER, start))))) {
            final SubLObject glyph_last = position(CHAR_semicolon, string, symbol_function($sym82$CHAR_), symbol_function(IDENTITY), start, UNPROVIDED);
            if (NIL != glyph_last) {
                final SubLObject glyph_end = number_utilities.f_1X(glyph_last);
                final SubLObject glyph_length = subtract(glyph_end, start);
                if (glyph_length.numGE(FOUR_INTEGER) && glyph_length.numLE(SIX_INTEGER)) {
                    final SubLObject integer = (NIL != charE(CHAR_x, Strings.sublisp_char(string, add(TWO_INTEGER, start)))) ? parse_integer(string, add(THREE_INTEGER, start), glyph_last, SIXTEEN_INTEGER, NIL) : parse_integer(string, add(TWO_INTEGER, start), glyph_last, TEN_INTEGER, NIL);
                    if (((NIL != integer) && integer.numGE(ZERO_INTEGER)) && integer.numL($int$256)) {
                        return values(glyph_end, integer);
                    }
                }
            }
        }
        return values(NIL, NIL);
    }

    public static SubLObject html_encode_fort(final SubLObject fort) {
        return html_url_encode(format(NIL, $str94$_S, forts.fort_el_formula(czer_main.canonicalize_term(fort, UNPROVIDED))), UNPROVIDED);
    }

    public static SubLObject html_decode_fort(final SubLObject string) {
        return czer_main.canonicalize_term(read_from_string(html_url_decode(string), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
    }

    public static SubLObject uri_p(final SubLObject v_object, SubLObject official_onlyP) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (v_object.isString()) {
            final SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
            if ((NIL != colon_idx) && (NIL != uri_scheme_p(v_object, official_onlyP, ZERO_INTEGER, number_utilities.f_1X(colon_idx)))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject url_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return NIL;
        }
        final SubLObject colon_idx = position(CHAR_colon, v_object, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
        if (NIL == colon_idx) {
            return NIL;
        }
        final SubLObject start_idx = find_url_beginning(v_object, length(v_object), colon_idx);
        if ((NIL == start_idx) || start_idx.numG(ZERO_INTEGER)) {
            return NIL;
        }
        if (NIL != Strings.stringE($str95$mailto_, subseq(v_object, ZERO_INTEGER, SEVEN_INTEGER), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return string_utilities.contains_charP(v_object, CHAR_at);
        }
        return T;
    }

    public static SubLObject url_host(final SubLObject url) {
        final SubLObject colon_idx = position(CHAR_colon, url, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, UNPROVIDED);
        if (NIL == colon_idx) {
            return $str86$;
        }
        final SubLObject url_tokens = string_utilities.string_tokenize(url, $list96, NIL, NIL, T, UNPROVIDED, UNPROVIDED);
        return second(url_tokens);
    }

    public static SubLObject url_is_relativeP(final SubLObject url) {
        assert NIL != string_utilities.non_empty_string_p(url) : "string_utilities.non_empty_string_p(url) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(url) " + url;
        return eq(CHAR_slash, string_utilities.first_char(url));
    }

    public static SubLObject absolute_url_from_relative_url_and_base(final SubLObject url, final SubLObject base_uri) {
        assert NIL != stringp(url) : "Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) " + url;
        assert NIL != stringp(base_uri) : "Types.stringp(base_uri) " + "CommonSymbols.NIL != Types.stringp(base_uri) " + base_uri;
        final SubLObject relativeP = url_is_relativeP(url);
        return (NIL != relativeP) && (NIL != base_uri) ? cconcatenate(format_nil.format_nil_a_no_copy(Strings.string_right_trim($str29$_, base_uri)), format_nil.format_nil_a_no_copy(url)) : url;
    }

    public static SubLObject uri_scheme_p(final SubLObject v_object, SubLObject official_onlyP, SubLObject start, SubLObject end) {
        if (official_onlyP == UNPROVIDED) {
            official_onlyP = NIL;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        SubLObject match = NIL;
        if (NIL == match) {
            SubLObject csome_list_var = $official_uri_schemes$.getGlobalValue();
            SubLObject scheme = NIL;
            scheme = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            } 
        }
        if ((NIL == official_onlyP) && (NIL == match)) {
            SubLObject csome_list_var = $unofficial_uri_schemes$.getGlobalValue();
            SubLObject scheme = NIL;
            scheme = csome_list_var.first();
            while ((NIL == match) && (NIL != csome_list_var)) {
                if (start.eql(search(scheme, v_object, symbol_function(EQUAL), symbol_function(IDENTITY), ZERO_INTEGER, NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            } 
        }
        return list_utilities.sublisp_boolean(match);
    }

    public static SubLObject find_url_beginning(final SubLObject string, final SubLObject length, final SubLObject idx) {
        if (((!string.isString()) || (!length.isNumber())) || (!idx.isNumber())) {
            return NIL;
        }
        SubLObject cdolist_list_var = $valid_url_beginnings$.getGlobalValue();
        SubLObject protocol = NIL;
        protocol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject begin_idx = subtract(idx, string_utilities.char_position(CHAR_colon, protocol, UNPROVIDED));
            final SubLObject end_idx = add(begin_idx, length(protocol));
            if ((begin_idx.numGE(ZERO_INTEGER) && end_idx.numL(length)) && (NIL != Strings.stringE(protocol, subseq(string, begin_idx, end_idx), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                return begin_idx;
            }
            cdolist_list_var = cdolist_list_var.rest();
            protocol = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject find_url_end(final SubLObject string, SubLObject length, SubLObject url_idx) {
        if (length == UNPROVIDED) {
            length = length(string);
        }
        if (url_idx == UNPROVIDED) {
            url_idx = ZERO_INTEGER;
        }
        if (((!string.isString()) || (!length.isNumber())) || (!url_idx.isNumber())) {
            return NIL;
        }
        SubLObject end_idx = list_utilities.position_if_not(VALID_URL_CHAR_P, string, symbol_function(IDENTITY), url_idx, UNPROVIDED);
        if (NIL == end_idx) {
            end_idx = length;
        }
        if ((!url_idx.eql(ZERO_INTEGER)) || (!end_idx.eql(length))) {
            while (end_idx.isPositive() && (NIL != member(Strings.sublisp_char(string, number_utilities.f_1_(end_idx)), $url_delimiters$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED))) {
                end_idx = subtract(end_idx, ONE_INTEGER);
            } 
        }
        final SubLObject address = subseq(string, url_idx, end_idx);
        if (NIL != url_p(address)) {
            return end_idx;
        }
        return NIL;
    }

    public static SubLObject valid_url_char_p(final SubLObject v_char) {
        return makeBoolean(((NIL != alpha_char_p(v_char)) || (NIL != digit_char_p(v_char, UNPROVIDED))) || (NIL != find(v_char, $valid_non_alphanumeric_url_chars$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject resolve_relative_uri(final SubLObject base, final SubLObject local_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_base = canonicalize_relative_uri(base, local_name);
        final SubLObject new_local_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return cconcatenate(new_base, new_local_name);
    }

    public static SubLObject canonicalize_relative_uri(SubLObject base, SubLObject local_name) {
        while (NIL != string_utilities.starts_with(local_name, $str104$___)) {
            base = remove_last_path_element(base);
            local_name = string_utilities.substring(local_name, THREE_INTEGER, UNPROVIDED);
        } 
        if (NIL != string_utilities.starts_with(local_name, $str105$__)) {
            final SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != colon_pos) {
                base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(colon_pos));
            }
        } else
            if (((((NIL != string_utilities.non_empty_string_p(base)) && (NIL != uri_lacks_path_componentP(base))) && (!CHAR_hash.eql(string_utilities.last_char(base)))) && (NIL != string_utilities.non_empty_string_p(local_name))) && (!CHAR_hash.eql(string_utilities.first_char(local_name)))) {
                base = cconcatenate(base, $str29$_);
            } else
                if (NIL != string_utilities.starts_with(local_name, $str29$_)) {
                    final SubLObject colon_pos = position(CHAR_colon, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != colon_pos) {
                        final SubLObject domain_name_end = position(CHAR_slash, base, symbol_function(EQL), symbol_function(IDENTITY), add(THREE_INTEGER, colon_pos), UNPROVIDED);
                        base = string_utilities.substring(base, ZERO_INTEGER, domain_name_end);
                    }
                } else
                    if (((NIL == string_utilities.empty_string_p(local_name)) && (!string_utilities.first_char(local_name).eql(CHAR_hash))) && (!string_utilities.last_char(base).eql(CHAR_hash))) {
                        final SubLObject slash_pos = list_utilities.position_from_end(CHAR_slash, base, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != list_utilities.lengthG(base, number_utilities.f_1X(slash_pos), UNPROVIDED)) {
                            base = string_utilities.substring(base, ZERO_INTEGER, number_utilities.f_1X(slash_pos));
                        }
                    }



        return values(base, local_name);
    }

    public static SubLObject remove_last_path_element(final SubLObject uri) {
        final SubLObject last_slash_pos = list_utilities.position_from_end(CHAR_slash, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject directory_start = list_utilities.position_from_end(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), ZERO_INTEGER, last_slash_pos);
        return string_utilities.substring(uri, ZERO_INTEGER, directory_start);
    }

    public static SubLObject uri_lacks_path_componentP(final SubLObject uri) {
        final SubLObject colon_pos = position(CHAR_colon, uri, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject path_start = (NIL != colon_pos) ? position(CHAR_slash, uri, symbol_function(EQL), symbol_function(IDENTITY), add(colon_pos, THREE_INTEGER), UNPROVIDED) : NIL;
        return sublisp_null(path_start);
    }

    public static SubLObject clear_soap_name() {
        final SubLObject cs = $soap_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_soap_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($soap_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject soap_name_internal(final SubLObject local_name) {
        return cconcatenate($str116$soap_, local_name);
    }

    public static SubLObject soap_name(final SubLObject local_name) {
        SubLObject caching_state = $soap_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOAP_NAME, $soap_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(soap_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject clear_soap_expanded_name() {
        final SubLObject cs = $soap_expanded_name_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_soap_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args($soap_expanded_name_caching_state$.getGlobalValue(), list(local_name), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject soap_expanded_name_internal(final SubLObject local_name) {
        return cconcatenate($soap_envelope_uri$.getGlobalValue(), local_name);
    }

    public static SubLObject soap_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = $soap_expanded_name_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SOAP_EXPANDED_NAME, $soap_expanded_name_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(soap_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject soap_envelope_sexpr_p(final SubLObject sexpr) {
        return equal(soap_expanded_name($$$Envelope), xml_parsing_utilities.xml_sexpr_type(sexpr));
    }

    public static SubLObject clear_perform_soap_post_cached() {
        final SubLObject cs = $perform_soap_post_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        return memoization_state.caching_state_remove_function_results_with_args($perform_soap_post_cached_caching_state$.getGlobalValue(), list(query, soap_action_uri, machine, url, port, keep_aliveP), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject perform_soap_post_cached_internal(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject keep_aliveP) {
        return perform_soap_post(query, soap_action_uri, machine, url, port, keep_aliveP);
    }

    public static SubLObject perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        SubLObject caching_state = $perform_soap_post_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(PERFORM_SOAP_POST_CACHED, $perform_soap_post_cached_caching_state$, $int$256, EQUAL, SIX_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(query, soap_action_uri, machine, url, port, keep_aliveP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (query.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (soap_action_uri.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (machine.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (url.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (port.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && keep_aliveP.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
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
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(perform_soap_post_cached_internal(query, soap_action_uri, machine, url, port, keep_aliveP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(query, soap_action_uri, machine, url, port, keep_aliveP));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject perform_soap_post(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == UNPROVIDED) {
            port = $int$80;
        }
        if (keep_aliveP == UNPROVIDED) {
            keep_aliveP = T;
        }
        SubLObject response = NIL;
        SubLObject sexpr = NIL;
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject in_stream = NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, NIL, $PRIVATE);
            if (NIL != validate_tcp_connection(in_stream, machine, real_port)) {
                send_http_request(in_stream, list(new SubLObject[]{ $MACHINE, machine, $PORT, port, $METHOD, $POST, $URL, url, $QUERY, query, $kw9$KEEP_ALIVE_, keep_aliveP, $kw10$WIDE_NEWLINES_, T, $ACCEPT_TYPES, $DEFAULT, $CONTENT_TYPE, $str123$text_xml__charset_utf_8, $SOAP_ACTION_URI, soap_action_uri }));
                response = http_response_body(slack_read_until_eof(in_stream, UNPROVIDED));
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
        if (!CHAR_less.eql(string_utilities.first_char(response))) {
            final SubLObject start = position(CHAR_less, response, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (NIL != start) {
                response = string_utilities.substring(response, start, UNPROVIDED);
            }
        }
        SubLObject stream = NIL;
        try {
            stream = make_private_string_input_stream(response, ZERO_INTEGER, NIL);
            sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_tokenize(stream, T, T, T));
        } finally {
            final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values2 = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values2);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return sexpr;
    }

    public static SubLObject make_soap_message(final SubLObject tns, final SubLObject header_properties, final SubLObject body_elements, SubLObject encoding, SubLObject standalone, SubLObject header_elements) {
        if (encoding == UNPROVIDED) {
            encoding = $str124$US_ASCII;
        }
        if (standalone == UNPROVIDED) {
            standalone = T;
        }
        if (header_elements == UNPROVIDED) {
            header_elements = NIL;
        }
        xml_utilities.xml_header(xml_utilities.xml_version(), encoding, standalone);
        final SubLObject name_var = soap_name($$$Envelope);
        xml_utilities.xml_start_tag_internal(name_var, list($str125$xmlns_soap, $soap_envelope_uri$.getGlobalValue()), NIL, UNPROVIDED, UNPROVIDED);
        if ((NIL != list_utilities.non_empty_list_p(header_properties)) || (NIL != list_utilities.non_empty_list_p(header_elements))) {
            final SubLObject name_var_$6 = soap_name($$$Header);
            xml_utilities.xml_start_tag_internal(name_var_$6, NIL, NIL, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = header_properties;
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject attribute = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list127);
                attribute = current.first();
                current = value = current.rest();
                final SubLObject name_var_$7 = attribute;
                xml_utilities.xml_start_tag_internal(name_var_$7, list($$$xmlns, tns), NIL, UNPROVIDED, UNPROVIDED);
                xml_utilities.xml_write_string(value, UNPROVIDED, UNPROVIDED);
                xml_utilities.xml_end_tag_internal(name_var_$7);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
            cdolist_list_var = header_elements;
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                xml_utilities.xml_write(element, NIL);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
            xml_utilities.xml_end_tag_internal(name_var_$6);
        }
        final SubLObject name_var_$8 = soap_name($$$Body);
        xml_utilities.xml_start_tag_internal(name_var_$8, NIL, NIL, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = body_elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            xml_utilities.xml_write(element, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        xml_utilities.xml_end_tag_internal(name_var_$8);
        xml_utilities.xml_end_tag_internal(name_var);
        return NIL;
    }

    public static SubLObject get_http_status_code(final SubLObject header_string) {
        final SubLObject header_tokenized = delete($str86$, string_utilities.split_string(header_string, $list130), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if ($$$HTTP.equal(Strings.string_upcase(header_tokenized.first(), UNPROVIDED, UNPROVIDED))) {
            return string_utilities.string_to_integer(third(header_tokenized));
        }
        return NIL;
    }

    public static SubLObject html_redirection_header_p(final SubLObject string) {
        final SubLObject code = get_http_status_code(string);
        return list_utilities.alist_has_keyP($http_redirection_codes$.getGlobalValue(), code, UNPROVIDED);
    }

    public static SubLObject html_redirection_url(final SubLObject string) {
        final SubLObject marker = $str132$Location__;
        final SubLObject marker_start = search(marker, string, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != marker_start) {
            final SubLObject location_start = add(marker_start, length(marker));
            final SubLObject location_end = position_if(symbol_function(WHITESPACEP), string, symbol_function(IDENTITY), location_start, UNPROVIDED);
            if (NIL != location_end) {
                return string_utilities.substring(string, location_start, location_end);
            }
        }
        return NIL;
    }

    public static SubLObject parse_http_url(final SubLObject http_url) {
        SubLObject machine = NIL;
        SubLObject port = NIL;
        SubLObject url = NIL;
        SubLObject query = NIL;
        if ((NIL != search($str134$http___, http_url, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) || (NIL != search($str135$https___, http_url, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
            final SubLObject machine_start = length($str134$http___);
            final SubLObject port_start = position(CHAR_colon, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
            SubLObject url_start = position(CHAR_slash, http_url, symbol_function(EQL), symbol_function(IDENTITY), machine_start, UNPROVIDED);
            SubLObject machine_end = NIL;
            if (NIL == url_start) {
                url_start = length(http_url);
            }
            if ((NIL != port_start) && port_start.numL(url_start)) {
                machine_end = port_start;
                port = read_from_string_ignoring_errors(http_url, NIL, NIL, add(port_start, ONE_INTEGER), url_start);
            } else {
                machine_end = url_start;
                port = $DEFAULT;
            }
            machine = string_utilities.substring(http_url, machine_start, machine_end);
            final SubLObject query_start = position(CHAR_question, http_url, symbol_function(EQL), symbol_function(IDENTITY), url_start, UNPROVIDED);
            SubLObject url_end = NIL;
            if (NIL != query_start) {
                url_end = query_start;
            }
            url = string_utilities.substring(http_url, url_start, url_end);
            if (NIL != query_start) {
                query = string_utilities.substring(http_url, add(ONE_INTEGER, query_start), UNPROVIDED);
            } else {
                query = $str86$;
            }
        }
        return values(machine, port, url, query);
    }

    public static SubLObject read_until_eof(final SubLObject in_stream, SubLObject buffer) {
        if (buffer == UNPROVIDED) {
            buffer = NIL;
        }
        if (NIL == buffer) {
            buffer = Strings.make_string($int$100, UNPROVIDED);
        }
        SubLObject text = $str86$;
        final SubLObject length = length(buffer);
        SubLObject index = ZERO_INTEGER;
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); NIL != read_char; read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            Strings.set_char(buffer, index, read_char);
            index = add(index, ONE_INTEGER);
            if (index.numE(length)) {
                text = cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index));
                index = ZERO_INTEGER;
            }
        }
        return values(cconcatenate(text, string_utilities.substring(buffer, ZERO_INTEGER, index)), sublisp_null(read_char));
    }

    public static SubLObject read_until_char(final SubLObject in_stream, final SubLObject v_char, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); (!read_char.eql(v_char)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), sublisp_null(read_char));
    }

    public static SubLObject read_while(final SubLObject in_stream, final SubLObject test, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject peek_char;
        for (peek_char = NIL, peek_char = peek_char(NIL, in_stream, NIL, NIL, UNPROVIDED); (NIL != peek_char) && (NIL != funcall(test, peek_char)); peek_char = peek_char(NIL, in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char(in_stream, NIL, NIL, UNPROVIDED), scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), peek_char);
    }

    public static SubLObject read_until_char_unless(final SubLObject in_stream, final SubLObject v_char, final SubLObject unless_char, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject last_char;
        SubLObject read_char;
        for (last_char = NIL, read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); ((!read_char.eql(v_char)) || last_char.eql(unless_char)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            last_char = read_char;
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), sublisp_null(read_char));
    }

    public static SubLObject read_until_one_of(final SubLObject in_stream, final SubLObject chars, SubLObject scratch_stream) {
        if (scratch_stream == UNPROVIDED) {
            scratch_stream = make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = NIL, read_char = read_char(in_stream, NIL, NIL, UNPROVIDED); (NIL == member(read_char, chars, UNPROVIDED, UNPROVIDED)) && (NIL != read_char); read_char = read_char(in_stream, NIL, NIL, UNPROVIDED)) {
            write_char(read_char, scratch_stream);
        }
        return values(get_output_stream_string(scratch_stream), read_char);
    }

    public static SubLObject slack_read_until_eof(final SubLObject in_stream, SubLObject max_chars) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        SubLObject result_string = NIL;
        SubLObject eofP = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            SubLObject read_char;
            SubLObject read_count;
            for (read_char = NIL, read_count = NIL, read_char = slack_read_char(in_stream, NIL, NIL, UNPROVIDED), read_count = ZERO_INTEGER; (NIL != read_char) && ((NIL == max_chars) || (!read_count.numGE(max_chars))); read_char = slack_read_char(in_stream, NIL, NIL, UNPROVIDED) , read_count = number_utilities.f_1X(read_count)) {
                write_char(read_char, stream);
            }
            eofP = sublisp_null(read_char);
            result_string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return values(result_string, eofP);
    }

    public static SubLObject try_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject msg = NIL;
        SubLObject exp = NIL;
        destructuring_bind_must_consp(current, datum, $list137);
        msg = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list137);
        exp = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(bq_cons(msg, $list138)), list(CATCH_ERROR_MESSAGE, list(msg), exp), append(body, NIL));
    }

    public static SubLObject slack_read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == UNPROVIDED) {
            eof_error_p = T;
        }
        if (eof_value == UNPROVIDED) {
            eof_value = NIL;
        }
        if (recursive_p == UNPROVIDED) {
            recursive_p = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != eof_error_p) {
            return read_char(stream, eof_error_p, eof_value, recursive_p);
        }
        SubLObject ch = NIL;
        SubLObject msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    ch = read_char(stream, eof_error_p, eof_value, recursive_p);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != msg) {
            format(T, $str141$_____Averted__connection_reset_by);
            ch = eof_value;
        }
        return ch;
    }

    public static SubLObject read_http_chunk(final SubLObject instream) {
        final SubLObject chunk_length_string = string_utilities.network_read_line(instream, NIL, $$$0, UNPROVIDED);
        final SubLObject chunk_length = parse_integer(chunk_length_string, ZERO_INTEGER, NIL, SIXTEEN_INTEGER, T);
        SubLObject buffer = string_utilities.$empty_string$.getGlobalValue();
        if (NIL != chunk_length) {
            buffer = Strings.make_string(chunk_length, UNPROVIDED);
            read_sequence(buffer, instream, ZERO_INTEGER, chunk_length);
            string_utilities.network_read_line(instream, NIL, NIL, UNPROVIDED);
        }
        return buffer;
    }

    public static SubLObject write_http_chunk(final SubLObject outstream, final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $print_base$.currentBinding(thread);
        try {
            $print_base$.bind(SIXTEEN_INTEGER, thread);
            princ(length(line), outstream);
        } finally {
            $print_base$.rebind(_prev_bind_0, thread);
        }
        http_network_terpri(outstream);
        write_string(line, outstream, UNPROVIDED, UNPROVIDED);
        http_network_terpri(outstream);
        return NIL;
    }

    public static SubLObject http_network_terpri(final SubLObject network_outstream) {
        write_char(code_char(THIRTEEN_INTEGER), network_outstream);
        write_char(code_char(TEN_INTEGER), network_outstream);
        return NIL;
    }

    public static SubLObject write_http_date(final SubLObject stream, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = decode_universal_time(universal_time, ZERO_INTEGER);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, UNPROVIDED, UNPROVIDED);
        write_string($str76$__, stream, UNPROVIDED, UNPROVIDED);
        print_2_digit_nonnegative_integer(date, stream);
        write_char(CHAR_space, stream);
        write_string(numeric_date_utilities.month_number_abbrev(month), stream, UNPROVIDED, UNPROVIDED);
        write_char(CHAR_space, stream);
        princ(year, stream);
        write_char(CHAR_space, stream);
        print_2_digit_nonnegative_integer(hour, stream);
        write_char(CHAR_colon, stream);
        print_2_digit_nonnegative_integer(minute, stream);
        write_char(CHAR_colon, stream);
        print_2_digit_nonnegative_integer(second, stream);
        write_string($$$_GMT, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject http_date_string(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        SubLObject string = NIL;
        SubLObject stream = NIL;
        try {
            stream = make_private_string_output_stream();
            write_http_date(stream, universal_time);
            string = get_output_stream_string(stream);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                close(stream, UNPROVIDED);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }

    public static SubLObject html_tokens_fast_forward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return listS(MEMBER, pattern, list, $list146);
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static SubLObject html_tokens_step(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(CDR, list));
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject html_tokens_fast_forward_to(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(HTML_TOKENS_FAST_FORWARD, pattern, list));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static SubLObject html_tokens_fast_forward_past(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = NIL;
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list144);
        pattern = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list144);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CSETQ, list, list(CDR, list(HTML_TOKENS_FAST_FORWARD, pattern, list)));
        }
        cdestructuring_bind_error(datum, $list144);
        return NIL;
    }

    public static SubLObject html_tokens_extract_curr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = NIL;
        destructuring_bind_must_consp(current, datum, $list147);
        list = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(CAR, list);
        }
        cdestructuring_bind_error(datum, $list147);
        return NIL;
    }

    public static SubLObject is_html_terminating_tagP(final SubLObject string, final SubLObject open_tag) {
        if ((!CHAR_less.eql(Strings.sublisp_char(string, ZERO_INTEGER))) || (!CHAR_slash.eql(Strings.sublisp_char(string, ONE_INTEGER)))) {
            return NIL;
        }
        return Strings.string_equal(string, open_tag, TWO_INTEGER, NIL, ONE_INTEGER, NIL);
    }

    public static SubLObject test_for_html_tagP(final SubLObject tokens, final SubLObject tag) {
        final SubLObject current = tokens.first();
        if (!current.isString()) {
            return NIL;
        }
        return Strings.string_equal(tag, current, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject html_consume_starting_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject marker = $sym153$MARKER;
            return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list(STRING_EQUAL, marker, tag), list(ERROR, $str158$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind_error(datum, $list152);
        return NIL;
    }

    public static SubLObject html_consume_closing_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list152);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list152);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject marker = $sym160$MARKER;
            return list(CLET, list(list(marker, list(HTML_TOKENS_EXTRACT_CURR, tokens))), list(PUNLESS, list($sym161$IS_HTML_TERMINATING_TAG_, marker, tag), list(ERROR, $str162$Invalid_input_file_format__Expect, tag, marker)), list(HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind_error(datum, $list152);
        return NIL;
    }

    public static SubLObject html_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list163);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        storage = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PROGN, list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, storage, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(HTML_TOKENS_STEP, tokens), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind_error(datum, $list163);
        return NIL;
    }

    public static SubLObject html_extract_possibly_empty_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list167);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list167);
        storage = current.first();
        current = current.rest();
        final SubLObject v_default = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list167);
        current = current.rest();
        if (NIL == current) {
            final SubLObject temp = $sym168$TEMP;
            return list(CLET, list(temp), list(CSETQ, storage, v_default), list(HTML_CONSUME_STARTING_TAG, tokens, tag), list(CSETQ, temp, list(HTML_TOKENS_EXTRACT_CURR, tokens)), list(PUNLESS, list($sym161$IS_HTML_TERMINATING_TAG_, temp, tag), list(CSETQ, storage, temp), list(HTML_TOKENS_STEP, tokens)), list(HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind_error(datum, $list167);
        return NIL;
    }

    public static SubLObject html_possibly_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = NIL;
        SubLObject tag = NIL;
        SubLObject storage = NIL;
        destructuring_bind_must_consp(current, datum, $list163);
        tokens = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        tag = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list163);
        storage = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(PWHEN, list($sym170$TEST_FOR_HTML_TAG_, tokens, tag), list(HTML_EXTRACT_TAG_CONTENT, tokens, tag, storage));
        }
        cdestructuring_bind_error(datum, $list163);
        return NIL;
    }

    public static SubLObject html_file_as_tokens(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str173$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            tokens = html_stream_as_tokens(s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tokens;
    }

    public static SubLObject html_stream_as_tokens(final SubLObject stream) {
        SubLObject tokens = NIL;
        tokens = xml_parsing_utilities.xml_tokenize(stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject cleansed = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject clean_token = html_cleaned_token_string(token);
            if (!length(clean_token).isZero()) {
                cleansed = cons(clean_token, cleansed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        tokens = nreverse(cleansed);
        return tokens;
    }

    public static SubLObject html_cleaned_token_string(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }

    public static SubLObject html_property_list_to_url_parameters(final SubLObject v_properties) {
        assert NIL != list_utilities.property_list_p(v_properties) : "list_utilities.property_list_p(v_properties) " + "CommonSymbols.NIL != list_utilities.property_list_p(v_properties) " + v_properties;
        final SubLObject result = make_string_output_stream();
        SubLObject list_var = NIL;
        SubLObject item = NIL;
        SubLObject count = NIL;
        list_var = v_properties;
        item = list_var.first();
        for (count = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , count = add(ONE_INTEGER, count)) {
            if (NIL != evenp(count)) {
                if (!count.isZero()) {
                    write_string($str175$_, result, UNPROVIDED, UNPROVIDED);
                }
                write_string(symbol_name(item), result, UNPROVIDED, UNPROVIDED);
                write_string($str176$_, result, UNPROVIDED, UNPROVIDED);
            } else {
                write_string(string_utilities.to_string(item), result, UNPROVIDED, UNPROVIDED);
            }
        }
        return get_output_stream_string(result);
    }

    public static SubLObject html_assocation_list_to_url_parameters(final SubLObject alist) {
        assert NIL != list_utilities.alist_p(alist) : "list_utilities.alist_p(alist) " + "CommonSymbols.NIL != list_utilities.alist_p(alist) " + alist;
        final SubLObject result = make_string_output_stream();
        SubLObject on_first_param = T;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = NIL;
            SubLObject value = NIL;
            destructuring_bind_must_consp(current, datum, $list178);
            key = current.first();
            current = value = current.rest();
            if (NIL == on_first_param) {
                write_string($str175$_, result, UNPROVIDED, UNPROVIDED);
            } else {
                on_first_param = NIL;
            }
            write_string(key, result, UNPROVIDED, UNPROVIDED);
            write_string($str176$_, result, UNPROVIDED, UNPROVIDED);
            write_string(html_url_encode(string_utilities.to_string(value), UNPROVIDED), result, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return get_output_stream_string(result);
    }

    public static SubLObject matching_open_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject tag_size = length(tag);
        if (!tag_size.numE(add(TWO_INTEGER, length(pattern)))) {
            return NIL;
        }
        SubLObject index = ZERO_INTEGER;
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_less)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        SubLObject end_var_$9;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$9 = length(pattern), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$9); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (NIL == funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
        }
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_greater)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject matching_close_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == UNPROVIDED) {
            test = EQUAL;
        }
        final SubLObject tag_size = length(tag);
        if (!tag_size.numE(add(THREE_INTEGER, length(pattern)))) {
            return NIL;
        }
        SubLObject index = ZERO_INTEGER;
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_less)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_slash)) {
            return NIL;
        }
        index = add(index, ONE_INTEGER);
        SubLObject end_var_$10;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = end_var_$10 = length(pattern), char_num = NIL, char_num = ZERO_INTEGER; !char_num.numGE(end_var_$10); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (NIL == funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return NIL;
            }
            index = add(index, ONE_INTEGER);
        }
        if (NIL == funcall(test, Strings.sublisp_char(tag, index), CHAR_greater)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject clear_byte_order_mark() {
        final SubLObject cs = $byte_order_mark_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_byte_order_mark() {
        return memoization_state.caching_state_remove_function_results_with_args($byte_order_mark_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject byte_order_mark_internal() {
        return unicode_strings.display_to_utf8_string($str186$_ufeff_);
    }

    public static SubLObject byte_order_mark() {
        SubLObject caching_state = $byte_order_mark_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(BYTE_ORDER_MARK, $byte_order_mark_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(byte_order_mark_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject http_response_header(final SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ZERO_INTEGER), parse_http_response(response_string));
    }

    public static SubLObject http_response_body(final SubLObject response_string) {
        return nth_value_step_2(nth_value_step_1(ONE_INTEGER), parse_http_response(response_string));
    }

    public static SubLObject parse_http_response(final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject body_position = search($http_header_delimiter$.getDynamicValue(thread), response_string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject header = (body_position.isInteger()) ? subseq(response_string, ZERO_INTEGER, body_position) : NIL;
        final SubLObject body = (body_position.isInteger()) ? subseq(response_string, add(body_position, length($http_header_delimiter$.getDynamicValue(thread))), UNPROVIDED) : response_string;
        return values(header, string_utilities.pre_remove(body, byte_order_mark(), UNPROVIDED));
    }

    public static SubLObject http_format_query(final SubLObject query) {
        return format(NIL, $str188$___A__A_____, Mapping.mapcar(HTML_ENCODE_SEXPR, apply(symbol_function(APPEND), query)));
    }

    public static SubLObject html_encode_sexpr(final SubLObject sexpr) {
        return html_url_encode(format_nil.format_nil_a(sexpr), UNPROVIDED);
    }

    public static SubLObject http_retrieve(final SubLObject query, final SubLObject path, final SubLObject host, final SubLObject port, SubLObject method, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (method == UNPROVIDED) {
            method = $POST;
        }
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_string = NIL;
        SubLObject reply = NIL;
        if (query.isString()) {
            query_string = query;
        } else {
            query_string = http_format_query(query);
        }
        final SubLObject real_port = (port.eql($DEFAULT)) ? $int$80 : port;
        SubLObject channel = NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(host, real_port, timeout, $PRIVATE);
            if (NIL != validate_tcp_connection(channel, host, real_port)) {
                send_http_request(channel, list(new SubLObject[]{ $MACHINE, host, $PORT, port, $METHOD, method, $URL, path, $QUERY, query_string, $kw9$KEEP_ALIVE_, NIL, $kw10$WIDE_NEWLINES_, T, $ACCEPT_TYPES, accept_types, $CONTENT_TYPE, $DEFAULT, $SOAP_ACTION_URI, NIL }));
                reply = slack_read_until_eof(channel, max_chars);
            }
        } finally {
            final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (NIL != channel) {
                    close(channel, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        thread.resetMultipleValues();
        final SubLObject header = parse_http_response(reply);
        final SubLObject body = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != follow_redirectsP) && (NIL != html_redirection_header_p(header))) {
            return http_retrieve_via_redirection(header, max_chars, accept_types);
        }
        return body;
    }

    public static SubLObject http_retrieve_via_redirection(final SubLObject header, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fields = string_utilities.string_tokenize(header, $http_header_field_delimiters$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject new_url = NIL;
        if (NIL == new_url) {
            SubLObject csome_list_var = fields;
            SubLObject field = NIL;
            field = csome_list_var.first();
            while ((NIL == new_url) && (NIL != csome_list_var)) {
                if (NIL != string_utilities.starts_with_by_test(field, $str132$Location__, symbol_function(EQUALP))) {
                    new_url = string_utilities.pre_remove(field, $str132$Location__, symbol_function(EQUALP));
                }
                csome_list_var = csome_list_var.rest();
                field = csome_list_var.first();
            } 
        }
        return NIL != new_url ? dereference_url(new_url, max_chars, accept_types, UNPROVIDED, UNPROVIDED) : string_utilities.$empty_string$.getGlobalValue();
    }

    public static SubLObject get_html_source_from_url(final SubLObject url, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $list191;
        }
        return dereference_url(url, max_chars, accept_types, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject dereference_url(SubLObject url, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (max_chars == UNPROVIDED) {
            max_chars = NIL;
        }
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject source = NIL;
        if (NIL == url_p(url)) {
            url = cconcatenate($str134$http___, url);
        }
        if ((NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str134$http___)) || (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str135$https___))) {
            thread.resetMultipleValues();
            SubLObject machine = parse_http_url(url);
            final SubLObject port = thread.secondMultipleValue();
            SubLObject path = thread.thirdMultipleValue();
            final SubLObject query = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (NIL == machine) {
                machine = url;
            }
            if (NIL == path) {
                path = $str29$_;
            }
            source = http_retrieve(query, path, machine, port, $GET, max_chars, accept_types, follow_redirectsP, timeout);
        } else
            if (NIL != string_utilities.starts_with(Strings.string_downcase(url, UNPROVIDED, UNPROVIDED), $str192$file___)) {
                final SubLObject path2 = string_utilities.pre_remove(url, $str192$file___, symbol_function(EQUALP));
                assert NIL != file_utilities.file_existsP(path2) : "file_utilities.file_existsP(path2) " + "CommonSymbols.NIL != file_utilities.file_existsP(path2) " + path2;
                source = string_utilities.read_string_from_file(path2, UNPROVIDED, UNPROVIDED);
            }

        return source;
    }

    public static SubLObject save_url_to_file(final SubLObject url, final SubLObject filepath, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (accept_types == UNPROVIDED) {
            accept_types = $DEFAULT;
        }
        if (follow_redirectsP == UNPROVIDED) {
            follow_redirectsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject source = dereference_url(url, NIL, accept_types, follow_redirectsP, UNPROVIDED);
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(filepath, $OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error($str173$Unable_to_open__S, filepath);
                        }
                        final SubLObject out = stream;
                        princ(source, out);
                    } finally {
                        final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        return error_message;
    }

    public static SubLObject servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$servlet_port_offset$.getDynamicValue(thread));
    }

    public static SubLObject effective_servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != local_servlet_container_runningP()) {
            return servlet_container_port();
        }
        return $alternate_servlet_container_port$.getDynamicValue(thread);
    }

    public static SubLObject effective_servlet_container_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != local_servlet_container_runningP()) {
            return misc_utilities.hostname();
        }
        return $alternate_servlet_container_host$.getDynamicValue(thread);
    }

    public static SubLObject local_servlet_container_runningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $local_servlet_container_runningP$.getDynamicValue(thread);
    }

    public static SubLObject restart_servlet_container(SubLObject port) {
        if (port == UNPROVIDED) {
            port = servlet_container_port();
        }
        stop_servlet_container();
        return start_servlet_container(port);
    }

    public static SubLObject start_servlet_container(SubLObject port) {
        if (port == UNPROVIDED) {
            port = servlet_container_port();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject war_files = get_war_file_descriptions();
                    final SubLObject ret_value = funcall(START_SERVLET_CONTAINER_INT, port, war_files, servlet_container_tmp_dir_string());
                    $local_servlet_container_runningP$.setDynamicValue(T, thread);
                    return ret_value;
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err) {
            Errors.warn(err);
        }
        return port;
    }

    public static SubLObject stop_servlet_container() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    funcall(STOP_SERVLET_CONTAINER_INT, servlet_container_tmp_dir_string());
                    $local_servlet_container_runningP$.setDynamicValue(NIL, thread);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err) {
            Errors.warn(err);
        }
        return $STOPPED;
    }

    public static SubLObject servlet_container_tmp_dir_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_utilities.possibly_append_path_separator_char(cconcatenate(format_nil.format_nil_a_no_copy(file_utilities.temp_directory()), new SubLObject[]{ $str202$cyc_servlet_container_tmp_dir_, format_nil.format_nil_a_no_copy(Environment.get_user_name(UNPROVIDED)), $str203$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)) }));
    }

    public static SubLObject get_war_file_descriptions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != Filesys.probe_file($webapp_manifest_path$.getGlobalValue())) {
            SubLObject stream = NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind(NIL, thread);
                    stream = compatibility.open_text($webapp_manifest_path$.getGlobalValue(), $INPUT);
                } finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error($str173$Unable_to_open__S, $webapp_manifest_path$.getGlobalValue());
                }
                final SubLObject in = stream;
                SubLObject tokens = xml_parsing_utilities.xml_tokenize(in, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject webapps = NIL;
                SubLObject wars = NIL;
                while ((NIL != tokens) && (NIL == list_utilities.proper_list_p(webapps))) {
                    thread.resetMultipleValues();
                    final SubLObject webapps_$12 = xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
                    final SubLObject tokens_$13 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    webapps = webapps_$12;
                    tokens = tokens_$13;
                } 
                SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(webapps, $$$webapp);
                SubLObject webapp = NIL;
                webapp = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject warfile = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, $$$filename));
                    final SubLObject v_context = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, $$$contextRoot));
                    wars = cons(bq_cons(warfile, v_context), wars);
                    cdolist_list_var = cdolist_list_var.rest();
                    webapp = cdolist_list_var.first();
                } 
                return wars;
            } finally {
                final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        Errors.warn($str208$Unable_to_find_webapp_manifest_fi, $webapp_manifest_path$.getGlobalValue());
        return NIL;
    }

    public static SubLObject declare_web_utilities_file() {
        declareMacro(me, "with_http_request", "WITH-HTTP-REQUEST");
        declareFunction(me, "http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
        declareFunction(me, "make_html_cyc_login_session", "MAKE-HTML-CYC-LOGIN-SESSION", 0, 0, false);
        declareFunction(me, "destroy_cyc_login_session", "DESTROY-CYC-LOGIN-SESSION", 1, 0, false);
        declareFunction(me, "cyc_login_session_id_machine_name", "CYC-LOGIN-SESSION-ID-MACHINE-NAME", 1, 0, false);
        declareFunction(me, "valid_html_cyc_login_session_idP", "VALID-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        declareFunction(me, "current_html_cyc_login_session_idP", "CURRENT-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        declareFunction(me, "http_possibly_repack_request", "HTTP-POSSIBLY-REPACK-REQUEST", 4, 0, false);
        declareFunction(me, "within_html_cyc_login_sessionP", "WITHIN-HTML-CYC-LOGIN-SESSION?", 0, 0, false);
        declareFunction(me, "possibly_add_html_javascript_redirect_when_top_level_page", "POSSIBLY-ADD-HTML-JAVASCRIPT-REDIRECT-WHEN-TOP-LEVEL-PAGE", 0, 0, false);
        declareFunction(me, "http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
        declareFunction(me, "http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
        declareFunction(me, "send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
        declareFunction(me, "http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 3, false);
        declareFunction(me, "test_http_request", "TEST-HTTP-REQUEST", 2, 1, false);
        declareMacro(me, "http_with_cookies", "HTTP-WITH-COOKIES");
        declareFunction(me, "get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
        declareFunction(me, "http_send_generic_request", "HTTP-SEND-GENERIC-REQUEST", 11, 2, false);
        declareFunction(me, "http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 3, false);
        declareFunction(me, "http_send_put_request", "HTTP-SEND-PUT-REQUEST", 7, 3, false);
        declareFunction(me, "http_send_delete_request", "HTTP-SEND-DELETE-REQUEST", 7, 3, false);
        declareFunction(me, "http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
        declareFunction(me, "http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
        declareFunction(me, "http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
        declareFunction(me, "http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
        declareFunction(me, "http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
        declareFunction(me, "filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
        declareFunction(me, "http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
        declareFunction(me, "html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
        declareFunction(me, "html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false);
        new web_utilities.$html_url_expand_char$UnaryFunction();
        declareFunction(me, "html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
        declareFunction(me, "html_url_decode", "HTML-URL-DECODE", 1, 0, false);
        declareFunction(me, "decode_url_percent_encoded_char", "DECODE-URL-PERCENT-ENCODED-CHAR", 2, 0, false);
        declareFunction(me, "html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
        declareFunction(me, "html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
        declareFunction(me, "html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
        declareFunction(me, "html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
        declareFunction(me, "html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
        declareFunction(me, "uri_p", "URI-P", 1, 1, false);
        declareFunction(me, "url_p", "URL-P", 1, 0, false);
        new web_utilities.$url_p$UnaryFunction();
        declareFunction(me, "url_host", "URL-HOST", 1, 0, false);
        declareFunction(me, "url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
        declareFunction(me, "absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
        declareFunction(me, "uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
        declareFunction(me, "find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
        declareFunction(me, "find_url_end", "FIND-URL-END", 1, 2, false);
        declareFunction(me, "valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
        declareFunction(me, "resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
        declareFunction(me, "canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
        declareFunction(me, "remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
        declareFunction(me, "uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
        declareFunction(me, "clear_soap_name", "CLEAR-SOAP-NAME", 0, 0, false);
        declareFunction(me, "remove_soap_name", "REMOVE-SOAP-NAME", 1, 0, false);
        declareFunction(me, "soap_name_internal", "SOAP-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "soap_name", "SOAP-NAME", 1, 0, false);
        declareFunction(me, "clear_soap_expanded_name", "CLEAR-SOAP-EXPANDED-NAME", 0, 0, false);
        declareFunction(me, "remove_soap_expanded_name", "REMOVE-SOAP-EXPANDED-NAME", 1, 0, false);
        declareFunction(me, "soap_expanded_name_internal", "SOAP-EXPANDED-NAME-INTERNAL", 1, 0, false);
        declareFunction(me, "soap_expanded_name", "SOAP-EXPANDED-NAME", 1, 0, false);
        declareFunction(me, "soap_envelope_sexpr_p", "SOAP-ENVELOPE-SEXPR-P", 1, 0, false);
        declareFunction(me, "clear_perform_soap_post_cached", "CLEAR-PERFORM-SOAP-POST-CACHED", 0, 0, false);
        declareFunction(me, "remove_perform_soap_post_cached", "REMOVE-PERFORM-SOAP-POST-CACHED", 4, 2, false);
        declareFunction(me, "perform_soap_post_cached_internal", "PERFORM-SOAP-POST-CACHED-INTERNAL", 6, 0, false);
        declareFunction(me, "perform_soap_post_cached", "PERFORM-SOAP-POST-CACHED", 4, 2, false);
        declareFunction(me, "perform_soap_post", "PERFORM-SOAP-POST", 4, 2, false);
        declareFunction(me, "make_soap_message", "MAKE-SOAP-MESSAGE", 3, 3, false);
        declareFunction(me, "get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
        declareFunction(me, "html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
        declareFunction(me, "html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
        declareFunction(me, "parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
        declareFunction(me, "read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
        declareFunction(me, "read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
        declareFunction(me, "read_while", "READ-WHILE", 2, 1, false);
        declareFunction(me, "read_until_char_unless", "READ-UNTIL-CHAR-UNLESS", 3, 1, false);
        declareFunction(me, "read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
        declareFunction(me, "slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
        declareMacro(me, "try_error_message", "TRY-ERROR-MESSAGE");
        declareFunction(me, "slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
        declareFunction(me, "read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
        declareFunction(me, "write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
        declareFunction(me, "http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
        declareFunction(me, "write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
        declareFunction(me, "http_date_string", "HTTP-DATE-STRING", 0, 1, false);
        declareMacro(me, "html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
        declareMacro(me, "html_tokens_step", "HTML-TOKENS-STEP");
        declareMacro(me, "html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
        declareMacro(me, "html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
        declareMacro(me, "html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
        declareFunction(me, "is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
        declareFunction(me, "test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
        declareMacro(me, "html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
        declareMacro(me, "html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
        declareMacro(me, "html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
        declareMacro(me, "html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
        declareMacro(me, "html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
        declareFunction(me, "html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
        declareFunction(me, "html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
        declareFunction(me, "html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
        declareFunction(me, "html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
        declareFunction(me, "html_assocation_list_to_url_parameters", "HTML-ASSOCATION-LIST-TO-URL-PARAMETERS", 1, 0, false);
        declareFunction(me, "matching_open_tagP", "MATCHING-OPEN-TAG?", 2, 1, false);
        declareFunction(me, "matching_close_tagP", "MATCHING-CLOSE-TAG?", 2, 1, false);
        declareFunction(me, "clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction(me, "remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
        declareFunction(me, "byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
        declareFunction(me, "byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
        declareFunction(me, "http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
        declareFunction(me, "http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
        declareFunction(me, "parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
        declareFunction(me, "http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
        declareFunction(me, "html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
        declareFunction(me, "http_retrieve", "HTTP-RETRIEVE", 4, 5, false);
        declareFunction(me, "http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
        declareFunction(me, "get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
        declareFunction(me, "dereference_url", "DEREFERENCE-URL", 1, 4, false);
        declareFunction(me, "save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
        declareFunction(me, "servlet_container_port", "SERVLET-CONTAINER-PORT", 0, 0, false);
        declareFunction(me, "effective_servlet_container_port", "EFFECTIVE-SERVLET-CONTAINER-PORT", 0, 0, false);
        declareFunction(me, "effective_servlet_container_host", "EFFECTIVE-SERVLET-CONTAINER-HOST", 0, 0, false);
        declareFunction(me, "local_servlet_container_runningP", "LOCAL-SERVLET-CONTAINER-RUNNING?", 0, 0, false);
        declareFunction(me, "restart_servlet_container", "RESTART-SERVLET-CONTAINER", 0, 1, false);
        declareFunction(me, "start_servlet_container", "START-SERVLET-CONTAINER", 0, 1, false);
        declareFunction(me, "stop_servlet_container", "STOP-SERVLET-CONTAINER", 0, 0, false);
        declareFunction(me, "servlet_container_tmp_dir_string", "SERVLET-CONTAINER-TMP-DIR-STRING", 0, 0, false);
        declareFunction(me, "get_war_file_descriptions", "GET-WAR-FILE-DESCRIPTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_web_utilities_file() {
        deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", $list0);
        deflexical("*DECODE-URLS-DURING-HTTP-READ-REQUEST*", NIL);
        deflexical("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*", $str27$_a_);
        deflexical("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*", FIVE_INTEGER);
        deflexical("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*", SubLTrampolineFile.maybeDefault($html_cyc_login_session_string_to_remote_host$, $html_cyc_login_session_string_to_remote_host$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*", $str33$var_KEA_port_from_cyc_base_port__);
        deflexical("*HTTP-INFORMATIONAL-CODES*", $list34);
        deflexical("*HTTP-SUCCESS-CODES*", $list35);
        deflexical("*HTTP-REDIRECTION-CODES*", $list36);
        deflexical("*HTTP-CLIENT-ERROR-CODES*", $list37);
        deflexical("*HTTP-SERVER-ERROR-CODES*", $list38);
        deflexical("*HTTP-ERROR-CODES*", append($http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue()));
        deflexical("*HTTP-STATUS-CODES*", append(new SubLObject[]{ $http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$.getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue() }));
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list41);
        deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_get_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-POST-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list44);
        deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_post_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-PUT-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*", $list45);
        deflexical("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_put_request_template_components$.getGlobalValue()));
        deflexical("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*", $str43$application_x_www_form_urlencoded);
        deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*", $list46);
        deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar(FIRST, $http_delete_request_template_components$.getGlobalValue()));
        defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", NIL);
        defparameter("*TRACE-HTTP-SEND-PUT-REQUESTS*", NIL);
        defparameter("*TRACE-HTTP-SEND-DELETE-REQUESTS*", NIL);
        defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL);
        deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str81$Set_Cookie_);
        deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", list(CHAR_semicolon));
        deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($$$domain, $$$expires, $str85$max_age));
        deflexical("*OFFICIAL-URI-SCHEMES*", $list98);
        deflexical("*UNOFFICIAL-URI-SCHEMES*", $list99);
        defconstant("*VALID-URL-BEGINNINGS*", $list100);
        defconstant("*URL-DELIMITERS*", $list101);
        deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str103$_____________________);
        deflexical("*SOAP-ENVELOPE-URI*", $str114$http___schemas_xmlsoap_org_soap_e);
        deflexical("*SOAP-NAME-CACHING-STATE*", NIL);
        deflexical("*SOAP-EXPANDED-NAME-CACHING-STATE*", NIL);
        deflexical("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*", NIL);
        defparameter("*CGI-HOST*", $$$localhost);
        defparameter("*CGI-PORT*", $int$80);
        defparameter("*CGI-PATH*", $str184$_cgi_bin_services);
        defparameter("*HTTP-HEADER-DELIMITER*", cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), new SubLObject[]{ format_nil.format_nil_a_no_copy(CHAR_newline), format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline) }));
        defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", list(cconcatenate(format_nil.format_nil_a_no_copy(CHAR_return), format_nil.format_nil_a_no_copy(CHAR_newline)), Strings.make_string(ONE_INTEGER, CHAR_newline)));
        deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", NIL);
        defparameter("*ALTERNATE-SERVLET-CONTAINER-PORT*", NIL);
        defparameter("*ALTERNATE-SERVLET-CONTAINER-HOST*", NIL);
        defparameter("*LOCAL-SERVLET-CONTAINER-RUNNING?*", NIL);
        deflexical("*WEBAPP-MANIFEST-PATH*", $str204$webapps_apps_webapp_manifest_xml);
        return NIL;
    }

    public static SubLObject setup_web_utilities_file() {
        declare_defglobal($html_cyc_login_session_string_to_remote_host$);
        define_test_case_table_int(RESOLVE_RELATIVE_URI, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list113);
        memoization_state.note_globally_cached_function(SOAP_NAME);
        memoization_state.note_globally_cached_function(SOAP_EXPANDED_NAME);
        memoization_state.note_globally_cached_function(PERFORM_SOAP_POST_CACHED);
        define_test_case_table_int($sym179$MATCHING_OPEN_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list180);
        define_test_case_table_int($sym181$MATCHING_CLOSE_TAG_, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list182);
        memoization_state.note_globally_cached_function(BYTE_ORDER_MARK);
        note_funcall_helper_function(START_SERVLET_CONTAINER);
        tcp_server_utilities.register_tcp_server_type($SERVLET, $list199, UNPROVIDED);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_web_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_web_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_web_utilities_file();
    }

    static {




































































































































































































































































    }

    public static final class $html_url_expand_char$UnaryFunction extends UnaryFunction {
        public $html_url_expand_char$UnaryFunction() {
            super(extractFunctionNamed("HTML-URL-EXPAND-CHAR"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return html_url_expand_char(arg1);
        }
    }

    public static final class $url_p$UnaryFunction extends UnaryFunction {
        public $url_p$UnaryFunction() {
            super(extractFunctionNamed("URL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return url_p(arg1);
        }
    }
}

/**
 * Total time: 1042 ms synthetic
 */
