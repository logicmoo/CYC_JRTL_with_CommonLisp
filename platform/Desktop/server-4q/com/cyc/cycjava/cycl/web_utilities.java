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

public final class web_utilities extends SubLTranslatedFile
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
    public static SubLObject with_http_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject channel = (SubLObject)web_utilities.NIL;
        SubLObject machine = (SubLObject)web_utilities.NIL;
        SubLObject url = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list1);
        channel = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list1);
        machine = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list1);
        url = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)web_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)web_utilities.NIL;
        SubLObject current_$1 = (SubLObject)web_utilities.NIL;
        while (web_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)web_utilities.$list1);
            current_$1 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)web_utilities.$list1);
            if (web_utilities.NIL == conses_high.member(current_$1, (SubLObject)web_utilities.$list2, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
                bad = (SubLObject)web_utilities.T;
            }
            if (current_$1 == web_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (web_utilities.NIL != bad && web_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list1);
        }
        final SubLObject query_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw4$QUERY, current);
        final SubLObject query = (SubLObject)((web_utilities.NIL != query_tail) ? conses_high.cadr(query_tail) : web_utilities.NIL);
        final SubLObject method_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw5$METHOD, current);
        final SubLObject method = (SubLObject)((web_utilities.NIL != method_tail) ? conses_high.cadr(method_tail) : web_utilities.$kw6$GET);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw7$PORT, current);
        final SubLObject port = (SubLObject)((web_utilities.NIL != port_tail) ? conses_high.cadr(port_tail) : web_utilities.$kw8$DEFAULT);
        final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw9$KEEP_ALIVE_, current);
        final SubLObject keep_aliveP = (SubLObject)((web_utilities.NIL != keep_aliveP_tail) ? conses_high.cadr(keep_aliveP_tail) : web_utilities.T);
        final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw10$WIDE_NEWLINES_, current);
        final SubLObject wide_newlinesP = (SubLObject)((web_utilities.NIL != wide_newlinesP_tail) ? conses_high.cadr(wide_newlinesP_tail) : web_utilities.NIL);
        final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw11$TIMEOUT, current);
        final SubLObject timeout = (SubLObject)((web_utilities.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : web_utilities.NIL);
        final SubLObject accept_types_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw12$ACCEPT_TYPES, current);
        final SubLObject accept_types = (SubLObject)((web_utilities.NIL != accept_types_tail) ? conses_high.cadr(accept_types_tail) : web_utilities.$kw8$DEFAULT);
        final SubLObject content_type_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw13$CONTENT_TYPE, current);
        final SubLObject content_type = (SubLObject)((web_utilities.NIL != content_type_tail) ? conses_high.cadr(content_type_tail) : web_utilities.$kw8$DEFAULT);
        final SubLObject soap_action_uri_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw14$SOAP_ACTION_URI, current);
        final SubLObject soap_action_uri = (SubLObject)((web_utilities.NIL != soap_action_uri_tail) ? conses_high.cadr(soap_action_uri_tail) : web_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject real_port = (SubLObject)web_utilities.$sym15$REAL_PORT;
        return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(real_port, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym17$FIF, (SubLObject)ConsesLow.listS((SubLObject)web_utilities.EQL, port, (SubLObject)web_utilities.$list18), (SubLObject)web_utilities.$int19$80, port))), (SubLObject)ConsesLow.listS((SubLObject)web_utilities.$sym20$WITH_TCP_CONNECTION, (SubLObject)ConsesLow.list(channel, machine, real_port, (SubLObject)web_utilities.$kw21$ACCESS_MODE, (SubLObject)web_utilities.$kw22$PRIVATE, (SubLObject)web_utilities.$kw11$TIMEOUT, timeout), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym23$SEND_HTTP_REQUEST, channel, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$sym24$LIST, web_utilities.$kw25$MACHINE, machine, web_utilities.$kw7$PORT, port, web_utilities.$kw5$METHOD, method, web_utilities.$kw26$URL, url, web_utilities.$kw4$QUERY, query, web_utilities.$kw9$KEEP_ALIVE_, keep_aliveP, web_utilities.$kw10$WIDE_NEWLINES_, wide_newlinesP, web_utilities.$kw12$ACCEPT_TYPES, accept_types, web_utilities.$kw13$CONTENT_TYPE, content_type, web_utilities.$kw14$SOAP_ACTION_URI, soap_action_uri })), ConsesLow.append(body, (SubLObject)web_utilities.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 2468L)
    public static SubLObject http_read_request(final SubLObject instream, SubLObject parse_header) {
        if (parse_header == web_utilities.UNPROVIDED) {
            parse_header = (SubLObject)web_utilities.NIL;
        }
        SubLObject request_header = (SubLObject)web_utilities.NIL;
        SubLObject done = (SubLObject)web_utilities.NIL;
        SubLObject method = (SubLObject)web_utilities.NIL;
        SubLObject version = (SubLObject)web_utilities.NIL;
        SubLObject uri = (SubLObject)web_utilities.NIL;
        SubLObject line = (SubLObject)web_utilities.NIL;
        line = string_utilities.network_read_line(instream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL == line) {
            return (SubLObject)web_utilities.NIL;
        }
        final SubLObject first_space = Sequences.position((SubLObject)Characters.CHAR_space, line, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject last_space = list_utilities.position_from_end((SubLObject)Characters.CHAR_space, line, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (first_space.eql(last_space)) {
            last_space = (SubLObject)web_utilities.NIL;
        }
        if (web_utilities.NIL != first_space) {
            method = string_utilities.substring(line, (SubLObject)web_utilities.ZERO_INTEGER, first_space);
            uri = ((web_utilities.NIL != web_utilities.$decode_urls_during_http_read_request$.getGlobalValue()) ? html_url_decode(string_utilities.substring(line, number_utilities.f_1X(first_space), last_space)) : string_utilities.substring(line, number_utilities.f_1X(first_space), last_space));
            if (web_utilities.NIL != last_space) {
                version = string_utilities.substring(line, number_utilities.f_1X(last_space), (SubLObject)web_utilities.UNPROVIDED);
            }
        }
        if (web_utilities.NIL != parse_header) {
            while (web_utilities.NIL == done) {
                line = string_utilities.network_read_line(instream, (SubLObject)web_utilities.NIL, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED);
                if (line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                    done = (SubLObject)web_utilities.T;
                }
                else if (Strings.sublisp_char(line, (SubLObject)web_utilities.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_space) || Strings.sublisp_char(line, (SubLObject)web_utilities.ZERO_INTEGER).eql((SubLObject)Characters.CHAR_tab)) {
                    if (web_utilities.NIL == request_header) {
                        continue;
                    }
                    final SubLObject old_field = request_header.first();
                    ConsesLow.rplacd(old_field, Sequences.cconcatenate(old_field.rest(), line));
                }
                else {
                    final SubLObject colon = Sequences.position((SubLObject)Characters.CHAR_colon, line, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                    if (web_utilities.NIL == colon) {
                        continue;
                    }
                    request_header = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(string_utilities.substring(line, (SubLObject)web_utilities.ZERO_INTEGER, Numbers.subtract(colon, (SubLObject)web_utilities.ZERO_INTEGER)), string_utilities.trim_whitespace(string_utilities.substring(line, Numbers.add(colon, (SubLObject)web_utilities.ONE_INTEGER), (SubLObject)web_utilities.UNPROVIDED))), request_header);
                }
            }
        }
        else {
            while (!line.equal(string_utilities.$empty_string$.getGlobalValue())) {
                line = string_utilities.network_read_line(instream, (SubLObject)web_utilities.NIL, string_utilities.$empty_string$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED);
            }
        }
        return http_possibly_repack_request(method, uri, version, request_header);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5553L)
    public static SubLObject make_html_cyc_login_session() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject session_id = string_utilities.random_string(web_utilities.$html_alternate_uri_format_session_id_length$.getGlobalValue());
        dictionary.dictionary_enter(web_utilities.$html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, html_kernel.$http_remote_host$.getDynamicValue(thread));
        return session_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5811L)
    public static SubLObject destroy_cyc_login_session(final SubLObject session_id) {
        return dictionary.dictionary_remove(web_utilities.$html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 5956L)
    public static SubLObject cyc_login_session_id_machine_name(final SubLObject session_id) {
        return dictionary.dictionary_lookup_without_values(web_utilities.$html_cyc_login_session_string_to_remote_host$.getGlobalValue(), session_id, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6124L)
    public static SubLObject valid_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return (SubLObject)SubLObjectFactory.makeBoolean(possible_session_string.isString() && web_utilities.NIL != list_utilities.lengthE(possible_session_string, web_utilities.$html_alternate_uri_format_session_id_length$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED) && web_utilities.NIL != string_utilities.alphabetic_stringP(possible_session_string) && web_utilities.NIL != string_utilities.lower_case_string_p(possible_session_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6441L)
    public static SubLObject current_html_cyc_login_session_idP(final SubLObject possible_session_string) {
        return dictionary.dictionary_lookup_without_values(web_utilities.$html_cyc_login_session_string_to_remote_host$.getGlobalValue(), possible_session_string, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 6636L)
    public static SubLObject http_possibly_repack_request(final SubLObject method, SubLObject uri, final SubLObject version, SubLObject request_header) {
        if (web_utilities.NIL != string_utilities.starts_with(uri, web_utilities.$http_alternate_uri_format_a_prefix$.getGlobalValue())) {
            uri = string_utilities.string_substitute((SubLObject)web_utilities.$str29$_, (SubLObject)web_utilities.$str30$_cg_, uri, (SubLObject)web_utilities.UNPROVIDED);
            final SubLObject q_pos = Sequences.position((SubLObject)Characters.CHAR_question, uri, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            final SubLObject a_pos = Sequences.position((SubLObject)Characters.CHAR_ampersand, uri, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != q_pos && (web_utilities.NIL == a_pos || !a_pos.numL(q_pos))) {
                Vectors.set_aref(uri, q_pos, (SubLObject)Characters.CHAR_ampersand);
            }
            SubLObject uri_parts = conses_high.cddr(string_utilities.string_tokenize(uri, (SubLObject)web_utilities.$list31, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED));
            SubLObject session_string = (SubLObject)web_utilities.NIL;
            SubLObject new_uri = (SubLObject)web_utilities.NIL;
            if (web_utilities.NIL != current_html_cyc_login_session_idP(uri_parts.first())) {
                session_string = uri_parts.first();
                request_header = list_utilities.alist_enter(request_header, (SubLObject)web_utilities.$str32$Remote_Host, session_string, Symbols.symbol_function((SubLObject)web_utilities.EQUAL));
                uri_parts = uri_parts.rest();
            }
            new_uri = Sequences.cconcatenate(http_kernel.$http_cgi_bin_directory$.getGlobalValue(), new SubLObject[] { web_utilities.$str29$_, string_utilities.bunge(uri_parts, (SubLObject)Characters.CHAR_slash) });
            return Values.values(method, new_uri, version, request_header);
        }
        return Values.values(method, uri, version, request_header);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 7584L)
    public static SubLObject within_html_cyc_login_sessionP() {
        return valid_html_cyc_login_session_idP(html_kernel.http_state_key_for_request());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 8358L)
    public static SubLObject possibly_add_html_javascript_redirect_when_top_level_page() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_utilities.NIL != within_html_cyc_login_sessionP()) {
            html_utilities.html_source_readability_terpri((SubLObject)web_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_head$.getGlobalValue());
            html_utilities.html_markup(html_macros.$html_script_language$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)web_utilities.UNPROVIDED);
            html_utilities.html_markup(html_macros.$html_script_javascript$.getGlobalValue());
            html_utilities.html_char((SubLObject)Characters.CHAR_quotation, (SubLObject)web_utilities.UNPROVIDED);
            html_utilities.html_char((SubLObject)Characters.CHAR_greater, (SubLObject)web_utilities.UNPROVIDED);
            final SubLObject _prev_bind_0 = html_macros.$html_safe_print$.currentBinding(thread);
            try {
                html_macros.$html_safe_print$.bind((SubLObject)web_utilities.T, thread);
                PrintLow.format(html_macros.$html_stream$.getDynamicValue(thread), web_utilities.$html_possibly_redirect_to_portal_script$.getGlobalValue(), html_kernel.http_state_key_for_request());
                html_utilities.html_source_readability_terpri((SubLObject)web_utilities.UNPROVIDED);
            }
            finally {
                html_macros.$html_safe_print$.rebind(_prev_bind_0, thread);
            }
            html_utilities.html_markup(html_macros.$html_script_tail$.getGlobalValue());
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 11112L)
    public static SubLObject http_send_ok_response(final SubLObject outstream, final SubLObject header_fields) {
        streams_high.write_string((SubLObject)web_utilities.$str39$HTTP_1_1_200_OK, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 11571L)
    public static SubLObject http_send_error_response(final SubLObject outstream, final SubLObject error_code, final SubLObject header_fields) {
        streams_high.write_string((SubLObject)web_utilities.$str40$HTTP_1_1_, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        print_high.princ(error_code, outstream);
        streams_high.write_char((SubLObject)Characters.CHAR_space, outstream);
        streams_high.write_string(conses_high.assoc(error_code, web_utilities.$http_error_codes$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED).rest(), outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        http_network_terpri(outstream);
        http_send_response_header(outstream, header_fields);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 15134L)
    public static SubLObject send_http_request(final SubLObject channel, final SubLObject v_properties) {
        assert web_utilities.NIL != Types.streamp(channel) : channel;
        SubLObject allow_other_keys_p = (SubLObject)web_utilities.NIL;
        SubLObject rest = v_properties;
        SubLObject bad = (SubLObject)web_utilities.NIL;
        SubLObject current_$2 = (SubLObject)web_utilities.NIL;
        while (web_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, v_properties, (SubLObject)web_utilities.$list48);
            current_$2 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, v_properties, (SubLObject)web_utilities.$list48);
            if (web_utilities.NIL == conses_high.member(current_$2, (SubLObject)web_utilities.$list49, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
                bad = (SubLObject)web_utilities.T;
            }
            if (current_$2 == web_utilities.$kw3$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (web_utilities.NIL != bad && web_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(v_properties, (SubLObject)web_utilities.$list48);
        }
        final SubLObject machine_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw25$MACHINE, v_properties);
        final SubLObject machine = (SubLObject)((web_utilities.NIL != machine_tail) ? conses_high.cadr(machine_tail) : web_utilities.NIL);
        final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw7$PORT, v_properties);
        final SubLObject port = (SubLObject)((web_utilities.NIL != port_tail) ? conses_high.cadr(port_tail) : web_utilities.$int19$80);
        final SubLObject method_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw5$METHOD, v_properties);
        final SubLObject method = (SubLObject)((web_utilities.NIL != method_tail) ? conses_high.cadr(method_tail) : web_utilities.$kw6$GET);
        final SubLObject url_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw26$URL, v_properties);
        final SubLObject url = (SubLObject)((web_utilities.NIL != url_tail) ? conses_high.cadr(url_tail) : web_utilities.NIL);
        final SubLObject query_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw4$QUERY, v_properties);
        final SubLObject query = (SubLObject)((web_utilities.NIL != query_tail) ? conses_high.cadr(query_tail) : web_utilities.NIL);
        final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw9$KEEP_ALIVE_, v_properties);
        final SubLObject keep_aliveP = (SubLObject)((web_utilities.NIL != keep_aliveP_tail) ? conses_high.cadr(keep_aliveP_tail) : web_utilities.T);
        final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw10$WIDE_NEWLINES_, v_properties);
        final SubLObject wide_newlinesP = (SubLObject)((web_utilities.NIL != wide_newlinesP_tail) ? conses_high.cadr(wide_newlinesP_tail) : web_utilities.NIL);
        final SubLObject accept_types_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw12$ACCEPT_TYPES, v_properties);
        final SubLObject accept_types = (SubLObject)((web_utilities.NIL != accept_types_tail) ? conses_high.cadr(accept_types_tail) : web_utilities.$kw8$DEFAULT);
        final SubLObject content_type_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw13$CONTENT_TYPE, v_properties);
        final SubLObject content_type = (SubLObject)((web_utilities.NIL != content_type_tail) ? conses_high.cadr(content_type_tail) : web_utilities.$kw8$DEFAULT);
        final SubLObject soap_action_uri_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw14$SOAP_ACTION_URI, v_properties);
        final SubLObject soap_action_uri = (SubLObject)((web_utilities.NIL != soap_action_uri_tail) ? conses_high.cadr(soap_action_uri_tail) : web_utilities.NIL);
        http_request_internal(channel, method, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        streams_high.force_output(channel);
        return channel;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 15703L)
    public static SubLObject http_request_internal(final SubLObject out_stream, final SubLObject method, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        if (content_type == web_utilities.UNPROVIDED) {
            content_type = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        if (soap_action_uri == web_utilities.UNPROVIDED) {
            soap_action_uri = (SubLObject)web_utilities.NIL;
        }
        assert web_utilities.NIL != Types.keywordp(method) : method;
        assert web_utilities.NIL != Types.stringp(machine) : machine;
        if (!port.eql((SubLObject)web_utilities.$kw8$DEFAULT) && !web_utilities.assertionsDisabledInClass && web_utilities.NIL == subl_promotions.positive_integer_p(port)) {
            throw new AssertionError(port);
        }
        assert web_utilities.NIL != Types.stringp(url) : url;
        if (accept_types.eql((SubLObject)web_utilities.$kw8$DEFAULT)) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        final SubLObject list_var = accept_types;
        assert web_utilities.NIL != list_utilities.non_dotted_list_p(list_var) : list_var;
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = (SubLObject)web_utilities.NIL;
        elem = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            assert web_utilities.NIL != Types.stringp(elem) : elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        }
        if (method.eql((SubLObject)web_utilities.$kw6$GET)) {
            http_send_get_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types);
        }
        else if (method.eql((SubLObject)web_utilities.$kw54$POST)) {
            assert web_utilities.NIL != Types.stringp(query) : query;
            if (content_type.eql((SubLObject)web_utilities.$kw8$DEFAULT)) {
                content_type = web_utilities.$http_post_default_content_type$.getGlobalValue();
            }
            http_send_post_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        }
        else if (method.eql((SubLObject)web_utilities.$kw55$PUT)) {
            assert web_utilities.NIL != Types.stringp(query) : query;
            if (content_type.eql((SubLObject)web_utilities.$kw8$DEFAULT)) {
                content_type = web_utilities.$http_put_default_content_type$.getGlobalValue();
            }
            http_send_put_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        }
        else if (method.eql((SubLObject)web_utilities.$kw56$DELETE)) {
            assert web_utilities.NIL != Types.stringp(query) : query;
            if (content_type.eql((SubLObject)web_utilities.$kw8$DEFAULT)) {
                content_type = web_utilities.$http_delete_default_content_type$.getGlobalValue();
            }
            http_send_delete_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, accept_types, content_type, soap_action_uri);
        }
        else {
            Errors.error((SubLObject)web_utilities.$str57$Unsupported_HTTP_request_method__, method);
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 17305L)
    public static SubLObject test_http_request(final SubLObject machine, final SubLObject url, SubLObject v_properties) {
        if (v_properties == web_utilities.UNPROVIDED) {
            v_properties = (SubLObject)web_utilities.NIL;
        }
        SubLObject result = (SubLObject)web_utilities.NIL;
        SubLObject stream = (SubLObject)web_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            final SubLObject current;
            final SubLObject datum = current = v_properties;
            SubLObject allow_other_keys_p = (SubLObject)web_utilities.NIL;
            SubLObject rest = current;
            SubLObject bad = (SubLObject)web_utilities.NIL;
            SubLObject current_$3 = (SubLObject)web_utilities.NIL;
            while (web_utilities.NIL != rest) {
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)web_utilities.$list58);
                current_$3 = rest.first();
                rest = rest.rest();
                cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)web_utilities.$list58);
                if (web_utilities.NIL == conses_high.member(current_$3, (SubLObject)web_utilities.$list59, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
                    bad = (SubLObject)web_utilities.T;
                }
                if (current_$3 == web_utilities.$kw3$ALLOW_OTHER_KEYS) {
                    allow_other_keys_p = rest.first();
                }
                rest = rest.rest();
            }
            if (web_utilities.NIL != bad && web_utilities.NIL == allow_other_keys_p) {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list58);
            }
            final SubLObject query_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw4$QUERY, current);
            final SubLObject query = (SubLObject)((web_utilities.NIL != query_tail) ? conses_high.cadr(query_tail) : web_utilities.NIL);
            final SubLObject method_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw5$METHOD, current);
            final SubLObject method = (SubLObject)((web_utilities.NIL != method_tail) ? conses_high.cadr(method_tail) : web_utilities.$kw6$GET);
            final SubLObject port_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw7$PORT, current);
            final SubLObject port = (SubLObject)((web_utilities.NIL != port_tail) ? conses_high.cadr(port_tail) : web_utilities.$kw8$DEFAULT);
            final SubLObject keep_aliveP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw9$KEEP_ALIVE_, current);
            final SubLObject keep_aliveP = (SubLObject)((web_utilities.NIL != keep_aliveP_tail) ? conses_high.cadr(keep_aliveP_tail) : web_utilities.T);
            final SubLObject wide_newlinesP_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw10$WIDE_NEWLINES_, current);
            final SubLObject wide_newlinesP = (SubLObject)((web_utilities.NIL != wide_newlinesP_tail) ? conses_high.cadr(wide_newlinesP_tail) : web_utilities.NIL);
            final SubLObject timeout_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw11$TIMEOUT, current);
            final SubLObject timeout = (SubLObject)((web_utilities.NIL != timeout_tail) ? conses_high.cadr(timeout_tail) : web_utilities.NIL);
            final SubLObject accept_types_tail = cdestructuring_bind.property_list_member((SubLObject)web_utilities.$kw12$ACCEPT_TYPES, current);
            final SubLObject accept_types = (SubLObject)((web_utilities.NIL != accept_types_tail) ? conses_high.cadr(accept_types_tail) : web_utilities.$kw8$DEFAULT);
            send_http_request(stream, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw25$MACHINE, machine, web_utilities.$kw7$PORT, port, web_utilities.$kw5$METHOD, method, web_utilities.$kw26$URL, url, web_utilities.$kw4$QUERY, query, web_utilities.$kw9$KEEP_ALIVE_, keep_aliveP, web_utilities.$kw10$WIDE_NEWLINES_, wide_newlinesP, web_utilities.$kw12$ACCEPT_TYPES, accept_types }));
            result = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)web_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18165L)
    public static SubLObject http_with_cookies(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list60);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject cookie_list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list60);
        cookie_list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym61$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_, cookie_list)), ConsesLow.append(body, (SubLObject)web_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list60);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18320L)
    public static SubLObject get_current_cookies_for_request() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return web_utilities.$http_cookies_to_include_in_requests$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 18419L)
    public static SubLObject http_send_generic_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, final SubLObject template, final SubLObject template_order, final SubLObject tracer, final SubLObject content_type, SubLObject accept_types, SubLObject soap_action_uri) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        if (soap_action_uri == web_utilities.UNPROVIDED) {
            soap_action_uri = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (web_utilities.NIL != tracer) {
            out_stream = streams_high.make_broadcast_stream((SubLObject)ConsesLow.list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        final SubLObject length = Sequences.length(query);
        SubLObject cdolist_list_var = template_order;
        SubLObject command = (SubLObject)web_utilities.NIL;
        command = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            final SubLObject rule = conses_high.assoc(command, template, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject skippedP = (SubLObject)web_utilities.NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = (SubLObject)web_utilities.NIL;
            SubLObject format_string = (SubLObject)web_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list62);
            action = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list62);
            format_string = current.first();
            current = current.rest();
            if (web_utilities.NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql((SubLObject)web_utilities.$kw63$VERSION)) {
                    PrintLow.format(out_stream, format_string, url);
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw64$ACCEPT)) {
                    http_output_accept_types(out_stream, format_string, accept_types);
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw65$CONNECTION)) {
                    if (keep_aliveP.isInteger()) {
                        PrintLow.format(out_stream, (SubLObject)web_utilities.$str66$Keep_Alive___S, keep_aliveP);
                        if (web_utilities.NIL != wide_newlinesP) {
                            string_utilities.network_terpri(out_stream);
                        }
                        else {
                            streams_high.terpri(out_stream);
                        }
                    }
                    PrintLow.format(out_stream, format_string, (SubLObject)((web_utilities.NIL != keep_aliveP) ? web_utilities.$str67$keep_alive : web_utilities.$str68$close));
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw69$USER_AGENT)) {
                    PrintLow.format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw70$HOST)) {
                    PrintLow.format(out_stream, format_string, machine, port.eql((SubLObject)web_utilities.$kw8$DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : Sequences.cconcatenate((SubLObject)web_utilities.$str71$_, format_nil.format_nil_a_no_copy(port)));
                }
                else if (!pcase_var.eql((SubLObject)web_utilities.$kw72$BLANK_LINE)) {
                    if (pcase_var.eql((SubLObject)web_utilities.$kw73$COOKIES)) {
                        if (web_utilities.NIL == get_current_cookies_for_request()) {
                            skippedP = (SubLObject)web_utilities.T;
                        }
                        else {
                            SubLObject cdolist_list_var_$4 = get_current_cookies_for_request();
                            SubLObject cookie_string = (SubLObject)web_utilities.NIL;
                            cookie_string = cdolist_list_var_$4.first();
                            while (web_utilities.NIL != cdolist_list_var_$4) {
                                PrintLow.format(out_stream, format_string, cookie_string);
                                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                                cookie_string = cdolist_list_var_$4.first();
                            }
                        }
                    }
                    else if (pcase_var.eql((SubLObject)web_utilities.$kw13$CONTENT_TYPE)) {
                        PrintLow.format(out_stream, format_string, content_type);
                    }
                    else if (pcase_var.eql((SubLObject)web_utilities.$kw74$CONTENT_LENGTH)) {
                        PrintLow.format(out_stream, format_string, length);
                    }
                    else if (pcase_var.eql((SubLObject)web_utilities.$kw75$SOAP_ACTION)) {
                        if (web_utilities.NIL != soap_action_uri) {
                            PrintLow.format(out_stream, format_string, soap_action_uri);
                        }
                        else {
                            skippedP = (SubLObject)web_utilities.T;
                        }
                    }
                    else if (pcase_var.eql((SubLObject)web_utilities.$kw4$QUERY)) {
                        PrintLow.format(out_stream, format_string, query);
                    }
                    else if (format_string.isString()) {
                        streams_high.write_string(format_string, out_stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list62);
            }
            if (web_utilities.NIL == skippedP) {
                if (web_utilities.NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                }
                else {
                    streams_high.terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        }
        if (web_utilities.NIL != tracer) {
            streams_high.force_output((SubLObject)web_utilities.T);
        }
        return original_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 20636L)
    public static SubLObject http_send_post_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        if (content_type == web_utilities.UNPROVIDED) {
            content_type = web_utilities.$http_post_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == web_utilities.UNPROVIDED) {
            soap_action_uri = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, web_utilities.$http_post_request_template_components$.getGlobalValue(), web_utilities.$http_post_request_template_order$.getGlobalValue(), web_utilities.$trace_http_send_post_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 21182L)
    public static SubLObject http_send_put_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        if (content_type == web_utilities.UNPROVIDED) {
            content_type = web_utilities.$http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == web_utilities.UNPROVIDED) {
            soap_action_uri = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, web_utilities.$http_put_request_template_components$.getGlobalValue(), web_utilities.$http_put_request_template_order$.getGlobalValue(), web_utilities.$trace_http_send_put_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 21723L)
    public static SubLObject http_send_delete_request(final SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types, SubLObject content_type, SubLObject soap_action_uri) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        if (content_type == web_utilities.UNPROVIDED) {
            content_type = web_utilities.$http_put_default_content_type$.getGlobalValue();
        }
        if (soap_action_uri == web_utilities.UNPROVIDED) {
            soap_action_uri = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return http_send_generic_request(out_stream, machine, port, url, query, keep_aliveP, wide_newlinesP, web_utilities.$http_delete_request_template_components$.getGlobalValue(), web_utilities.$http_delete_request_template_order$.getGlobalValue(), web_utilities.$trace_http_send_delete_requests$.getDynamicValue(thread), content_type, accept_types, soap_action_uri);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 22398L)
    public static SubLObject http_output_accept_types(final SubLObject out_stream, final SubLObject format_string, final SubLObject accept_types) {
        PrintLow.format(out_stream, format_string);
        SubLObject done_oneP = (SubLObject)web_utilities.NIL;
        SubLObject cdolist_list_var = accept_types;
        SubLObject type = (SubLObject)web_utilities.NIL;
        type = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            if (web_utilities.NIL != done_oneP) {
                print_high.princ((SubLObject)web_utilities.$str76$__, out_stream);
            }
            print_high.princ(type, out_stream);
            done_oneP = (SubLObject)web_utilities.T;
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 22697L)
    public static SubLObject http_send_get_request(SubLObject out_stream, final SubLObject machine, final SubLObject port, final SubLObject url, final SubLObject query, final SubLObject keep_aliveP, final SubLObject wide_newlinesP, SubLObject accept_types) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = web_utilities.$http_default_accept_types$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject original_stream = out_stream;
        if (web_utilities.NIL != web_utilities.$trace_http_send_post_requests$.getDynamicValue(thread)) {
            out_stream = streams_high.make_broadcast_stream((SubLObject)ConsesLow.list(out_stream, StreamsLow.$standard_output$.getDynamicValue(thread)));
        }
        SubLObject full_url = url;
        if (web_utilities.NIL != string_utilities.non_empty_string_p(query)) {
            full_url = Sequences.cconcatenate(full_url, new SubLObject[] { web_utilities.$str77$_, query });
        }
        SubLObject cdolist_list_var = web_utilities.$http_get_request_template_order$.getGlobalValue();
        SubLObject command = (SubLObject)web_utilities.NIL;
        command = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            final SubLObject rule = conses_high.assoc(command, web_utilities.$http_get_request_template_components$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject skippedP = (SubLObject)web_utilities.NIL;
            SubLObject current;
            final SubLObject datum = current = rule;
            SubLObject action = (SubLObject)web_utilities.NIL;
            SubLObject format_string = (SubLObject)web_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list62);
            action = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list62);
            format_string = current.first();
            current = current.rest();
            if (web_utilities.NIL == current) {
                final SubLObject pcase_var = action;
                if (pcase_var.eql((SubLObject)web_utilities.$kw63$VERSION)) {
                    PrintLow.format(out_stream, format_string, full_url);
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw64$ACCEPT)) {
                    http_output_accept_types(out_stream, format_string, accept_types);
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw65$CONNECTION)) {
                    if (keep_aliveP.isInteger()) {
                        PrintLow.format(out_stream, (SubLObject)web_utilities.$str66$Keep_Alive___S, keep_aliveP);
                        if (web_utilities.NIL != wide_newlinesP) {
                            string_utilities.network_terpri(out_stream);
                        }
                        else {
                            streams_high.terpri(out_stream);
                        }
                    }
                    PrintLow.format(out_stream, format_string, (SubLObject)((web_utilities.NIL != keep_aliveP) ? web_utilities.$str67$keep_alive : web_utilities.$str68$close));
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw69$USER_AGENT)) {
                    PrintLow.format(out_stream, format_string, system_info.cyc_revision_string(), system_parameters.$base_tcp_port$.getDynamicValue(thread));
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw73$COOKIES)) {
                    if (web_utilities.NIL == get_current_cookies_for_request()) {
                        skippedP = (SubLObject)web_utilities.T;
                    }
                    else {
                        SubLObject cdolist_list_var_$5 = get_current_cookies_for_request();
                        SubLObject cookie_string = (SubLObject)web_utilities.NIL;
                        cookie_string = cdolist_list_var_$5.first();
                        while (web_utilities.NIL != cdolist_list_var_$5) {
                            PrintLow.format(out_stream, format_string, cookie_string);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            cookie_string = cdolist_list_var_$5.first();
                        }
                    }
                }
                else if (pcase_var.eql((SubLObject)web_utilities.$kw70$HOST)) {
                    PrintLow.format(out_stream, format_string, machine, port.eql((SubLObject)web_utilities.$kw8$DEFAULT) ? string_utilities.$empty_string$.getGlobalValue() : Sequences.cconcatenate((SubLObject)web_utilities.$str71$_, format_nil.format_nil_a_no_copy(port)));
                }
                else if (!pcase_var.eql((SubLObject)web_utilities.$kw72$BLANK_LINE)) {
                    if (format_string.isString()) {
                        streams_high.write_string(format_string, out_stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                    }
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list62);
            }
            if (web_utilities.NIL == skippedP) {
                if (web_utilities.NIL != wide_newlinesP) {
                    string_utilities.network_terpri(out_stream);
                }
                else {
                    streams_high.terpri(out_stream);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            command = cdolist_list_var.first();
        }
        if (web_utilities.NIL != web_utilities.$trace_http_send_post_requests$.getDynamicValue(thread)) {
            streams_high.force_output((SubLObject)web_utilities.T);
        }
        return original_stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 24594L)
    public static SubLObject http_send_response_header(final SubLObject outstream, final SubLObject header_fields) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string((SubLObject)web_utilities.$str78$Date__, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        write_http_date(outstream, (SubLObject)web_utilities.UNPROVIDED);
        http_network_terpri(outstream);
        streams_high.write_string((SubLObject)web_utilities.$str79$Server__Cyc_, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        streams_high.write_string(system_info.cyc_revision_string(), outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        streams_high.write_string((SubLObject)web_utilities.$str29$_, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        print_high.princ(system_parameters.$base_tcp_port$.getDynamicValue(thread), outstream);
        http_network_terpri(outstream);
        SubLObject cdolist_list_var = header_fields;
        SubLObject field = (SubLObject)web_utilities.NIL;
        field = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            streams_high.write_string(field.first(), outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            streams_high.write_string((SubLObject)web_utilities.$str80$__, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            print_high.princ(field.rest(), outstream);
            http_network_terpri(outstream);
            cdolist_list_var = cdolist_list_var.rest();
            field = cdolist_list_var.first();
        }
        http_network_terpri(outstream);
        return (SubLObject)web_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 25284L)
    public static SubLObject http_extract_cookies_from_reply_header(final SubLObject string) {
        SubLObject position = (SubLObject)web_utilities.ZERO_INTEGER;
        SubLObject cookie_information = (SubLObject)web_utilities.NIL;
        while (position.isFixnum()) {
            position = Sequences.search(web_utilities.$http_header_cookie_keyword$.getGlobalValue(), string, Symbols.symbol_function((SubLObject)web_utilities.$sym82$CHAR_), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL, position, (SubLObject)web_utilities.UNPROVIDED);
            if (position.isFixnum()) {
                final SubLObject end_position = Sequences.position((SubLObject)Characters.CHAR_return, string, Symbols.symbol_function((SubLObject)web_utilities.$sym82$CHAR_), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), position, (SubLObject)web_utilities.UNPROVIDED);
                final SubLObject cut_position = Numbers.add(position, (SubLObject)web_utilities.ONE_INTEGER, Sequences.length(web_utilities.$http_header_cookie_keyword$.getGlobalValue()));
                final SubLObject cookie_encoding = string_utilities.substring(string, cut_position, end_position);
                final SubLObject cookie_string = http_compute_cookie_string_from_encoding(cookie_encoding);
                cookie_information = (SubLObject)ConsesLow.cons(cookie_string, cookie_information);
                position = end_position;
            }
        }
        return cookie_information;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26210L)
    public static SubLObject http_compute_cookie_string_from_encoding(final SubLObject encoding) {
        final SubLObject pieces = http_decompose_cookie_encoding_string(encoding);
        SubLObject return_encoding = (SubLObject)web_utilities.$str86$;
        SubLObject cdolist_list_var = pieces;
        SubLObject piece = (SubLObject)web_utilities.NIL;
        piece = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            if (web_utilities.NIL == string_utilities.empty_string_p(piece) && web_utilities.NIL == filter_predefined_named_cookie_attributes(piece)) {
                return_encoding = Sequences.cconcatenate(return_encoding, new SubLObject[] { web_utilities.$str87$__, piece });
            }
            cdolist_list_var = cdolist_list_var.rest();
            piece = cdolist_list_var.first();
        }
        return return_encoding;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 26639L)
    public static SubLObject filter_predefined_named_cookie_attributes(final SubLObject name_value_pair) {
        final SubLObject name_value_pair_size = Sequences.length(name_value_pair);
        SubLObject filterP = (SubLObject)web_utilities.NIL;
        if (web_utilities.NIL == filterP) {
            SubLObject csome_list_var = web_utilities.$http_filtered_predefined_named_cookie_attributes$.getGlobalValue();
            SubLObject known_attribute = (SubLObject)web_utilities.NIL;
            known_attribute = csome_list_var.first();
            while (web_utilities.NIL == filterP && web_utilities.NIL != csome_list_var) {
                final SubLObject size = Sequences.length(known_attribute);
                if (size.numL(name_value_pair_size) && web_utilities.NIL != Strings.string_equal(known_attribute, name_value_pair, (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.ZERO_INTEGER, size)) {
                    filterP = (SubLObject)web_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                known_attribute = csome_list_var.first();
            }
        }
        return filterP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 27117L)
    public static SubLObject http_decompose_cookie_encoding_string(final SubLObject encoding) {
        return Sequences.remove_if(Symbols.symbol_function((SubLObject)web_utilities.$sym88$EMPTY_STRING_P), Mapping.mapcar(Symbols.symbol_function((SubLObject)web_utilities.$sym89$TRIM_WHITESPACE), string_utilities.split_string(encoding, web_utilities.$http_cookie_separation_charset$.getGlobalValue())), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 27353L)
    public static SubLObject html_url_encode(final SubLObject string, SubLObject encode_equalsP) {
        if (encode_equalsP == web_utilities.UNPROVIDED) {
            encode_equalsP = (SubLObject)web_utilities.NIL;
        }
        final SubLObject length = Sequences.length(string);
        final SubLObject count = (web_utilities.NIL != encode_equalsP) ? Sequences.count_if(Symbols.symbol_function((SubLObject)web_utilities.$sym90$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS), string, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED) : Sequences.count_if(Symbols.symbol_function((SubLObject)web_utilities.$sym91$HTML_URL_EXPAND_CHAR), string, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.ZERO_INTEGER.numE(count)) {
            return string;
        }
        final SubLObject new_length = Numbers.add(length, Numbers.multiply(count, (SubLObject)web_utilities.TWO_INTEGER));
        final SubLObject new_string = Strings.make_string(new_length, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject new_index = (SubLObject)web_utilities.ZERO_INTEGER;
        SubLObject index;
        SubLObject v_char;
        SubLObject needs_encodingP;
        SubLObject code;
        for (index = (SubLObject)web_utilities.NIL, index = (SubLObject)web_utilities.ZERO_INTEGER; index.numL(length); index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER)) {
            v_char = Strings.sublisp_char(string, index);
            needs_encodingP = ((web_utilities.NIL != encode_equalsP) ? html_url_expand_char_including_equals(v_char) : html_url_expand_char(v_char));
            if (web_utilities.NIL != needs_encodingP) {
                code = Characters.char_code(v_char);
                Strings.set_char(new_string, Numbers.add(new_index, (SubLObject)web_utilities.ZERO_INTEGER), (SubLObject)Characters.CHAR_percent);
                Strings.set_char(new_string, Numbers.add(new_index, (SubLObject)web_utilities.ONE_INTEGER), string_utilities.hex_char(Numbers.integerDivide(code, (SubLObject)web_utilities.SIXTEEN_INTEGER)));
                Strings.set_char(new_string, Numbers.add(new_index, (SubLObject)web_utilities.TWO_INTEGER), string_utilities.hex_char(Numbers.mod(code, (SubLObject)web_utilities.SIXTEEN_INTEGER)));
                new_index = Numbers.add(new_index, (SubLObject)web_utilities.THREE_INTEGER);
            }
            else {
                if (v_char.eql((SubLObject)Characters.CHAR_space)) {
                    Strings.set_char(new_string, Numbers.add(new_index, (SubLObject)web_utilities.ZERO_INTEGER), (SubLObject)Characters.CHAR_plus);
                }
                else {
                    Strings.set_char(new_string, Numbers.add(new_index, (SubLObject)web_utilities.ZERO_INTEGER), v_char);
                }
                new_index = Numbers.add(new_index, (SubLObject)web_utilities.ONE_INTEGER);
            }
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 28683L)
    public static SubLObject html_url_expand_char(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.isChar() && (web_utilities.NIL == Characters.alpha_char_p(v_char) || web_utilities.NIL == unicode_strings.ascii_char_p(v_char)) && web_utilities.NIL == Characters.digit_char_p(v_char, (SubLObject)web_utilities.UNPROVIDED) && web_utilities.NIL == Sequences.find(v_char, (SubLObject)web_utilities.$str92$____, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 28873L)
    public static SubLObject html_url_expand_char_including_equals(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_char.eql((SubLObject)Characters.CHAR_equal) || web_utilities.NIL != html_url_expand_char(v_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 29032L)
    public static SubLObject html_url_decode(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject length = Sequences.length(string);
        final SubLObject count = Sequences.count((SubLObject)Characters.CHAR_percent, string, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (length.numE(count)) {
            return Sequences.nsubstitute((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_plus, string_utilities.copy_string(string), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        }
        final SubLObject new_length = Numbers.subtract(length, Numbers.multiply(count, (SubLObject)web_utilities.TWO_INTEGER));
        SubLObject new_string = Strings.make_string(new_length, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject new_index = (SubLObject)web_utilities.ZERO_INTEGER;
        SubLObject index = (SubLObject)web_utilities.ZERO_INTEGER;
        while (index.numL(length)) {
            final SubLObject v_char = Strings.sublisp_char(string, index);
            if (web_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_percent, v_char)) {
                thread.resetMultipleValues();
                final SubLObject decoded_char = decode_url_percent_encoded_char(string, index);
                final SubLObject chars_consumed = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (decoded_char.isChar()) {
                    Strings.set_char(new_string, new_index, decoded_char);
                    new_index = Numbers.add(new_index, (SubLObject)web_utilities.ONE_INTEGER);
                }
                else if (decoded_char.isString()) {
                    new_string = Sequences.cconcatenate(string_utilities.substring(new_string, (SubLObject)web_utilities.ZERO_INTEGER, new_index), new SubLObject[] { decoded_char, string_utilities.substring(new_string, Numbers.add(new_index, (SubLObject)web_utilities.ONE_INTEGER), (SubLObject)web_utilities.UNPROVIDED) });
                    new_index = Numbers.add(new_index, Sequences.length(decoded_char));
                }
                index = Numbers.add(index, chars_consumed);
            }
            else {
                if (v_char.eql((SubLObject)Characters.CHAR_plus)) {
                    Strings.set_char(new_string, new_index, (SubLObject)Characters.CHAR_space);
                }
                else {
                    Strings.set_char(new_string, new_index, v_char);
                }
                new_index = Numbers.add(new_index, (SubLObject)web_utilities.ONE_INTEGER);
                index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
            }
        }
        return new_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 30447L)
    public static SubLObject decode_url_percent_encoded_char(final SubLObject string, final SubLObject index) {
        final SubLObject next_char = Strings.sublisp_char(string, Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER));
        if (next_char.eql((SubLObject)Characters.CHAR_u)) {
            final SubLObject char_code = reader.parse_integer(string, Numbers.add(index, (SubLObject)web_utilities.TWO_INTEGER), Numbers.add(index, (SubLObject)web_utilities.SIX_INTEGER), (SubLObject)web_utilities.SIXTEEN_INTEGER, (SubLObject)web_utilities.UNPROVIDED);
            final SubLObject new_char_string = unicode_strings.utf8_vector_to_utf8_string(unicode_strings.unicode_vector_to_utf8_vector(Vectors.make_vector((SubLObject)web_utilities.ONE_INTEGER, char_code), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED));
            return Values.values(new_char_string, (SubLObject)web_utilities.SIX_INTEGER);
        }
        final SubLObject high_char = next_char;
        final SubLObject low_char = Strings.sublisp_char(string, Numbers.add(index, (SubLObject)web_utilities.TWO_INTEGER));
        final SubLObject code = vector_utilities.hex_chars_to_byte(high_char, low_char);
        final SubLObject decoded_char = Characters.code_char(code);
        return Values.values(decoded_char, (SubLObject)web_utilities.THREE_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 31175L)
    public static SubLObject html_glyph_decode(SubLObject string) {
        string = html_ascii_glyph_decode(string);
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 31527L)
    public static SubLObject html_ascii_glyph_decode(SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject restart;
        for (SubLObject done = (SubLObject)web_utilities.NIL; web_utilities.NIL == done; done = (SubLObject)SubLObjectFactory.makeBoolean(web_utilities.NIL == restart)) {
            restart = (SubLObject)web_utilities.NIL;
            if (web_utilities.NIL == restart) {
                SubLObject end_var;
                SubLObject glyph_start;
                SubLObject glyph_end;
                SubLObject char_code;
                SubLObject prefix;
                SubLObject replacement;
                SubLObject postfix;
                for (end_var = Sequences.length(string), glyph_start = (SubLObject)web_utilities.NIL, glyph_start = (SubLObject)web_utilities.ZERO_INTEGER; web_utilities.NIL == restart && !glyph_start.numGE(end_var); glyph_start = number_utilities.f_1X(glyph_start)) {
                    thread.resetMultipleValues();
                    glyph_end = html_ascii_glyph_p(string, glyph_start);
                    char_code = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (web_utilities.NIL != glyph_end) {
                        prefix = Sequences.subseq(string, (SubLObject)web_utilities.ZERO_INTEGER, glyph_start);
                        replacement = Strings.make_string((SubLObject)web_utilities.ONE_INTEGER, Characters.code_char(char_code));
                        postfix = Sequences.subseq(string, glyph_end, Sequences.length(string));
                        string = Sequences.cconcatenate(prefix, new SubLObject[] { replacement, postfix });
                        restart = (SubLObject)web_utilities.T;
                    }
                }
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 32310L)
    public static SubLObject html_ascii_glyph_p(final SubLObject string, SubLObject start) {
        if (start == web_utilities.UNPROVIDED) {
            start = (SubLObject)web_utilities.ZERO_INTEGER;
        }
        final SubLObject length = Sequences.length(string);
        if (Numbers.subtract(length, start).numGE((SubLObject)web_utilities.FOUR_INTEGER) && web_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_ampersand, Strings.sublisp_char(string, Numbers.add((SubLObject)web_utilities.ZERO_INTEGER, start))) && web_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_hash, Strings.sublisp_char(string, Numbers.add((SubLObject)web_utilities.ONE_INTEGER, start)))) {
            final SubLObject glyph_last = Sequences.position((SubLObject)Characters.CHAR_semicolon, string, Symbols.symbol_function((SubLObject)web_utilities.$sym82$CHAR_), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), start, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != glyph_last) {
                final SubLObject glyph_end = number_utilities.f_1X(glyph_last);
                final SubLObject glyph_length = Numbers.subtract(glyph_end, start);
                if (glyph_length.numGE((SubLObject)web_utilities.FOUR_INTEGER) && glyph_length.numLE((SubLObject)web_utilities.SIX_INTEGER)) {
                    final SubLObject integer = (web_utilities.NIL != Characters.charE((SubLObject)Characters.CHAR_x, Strings.sublisp_char(string, Numbers.add((SubLObject)web_utilities.TWO_INTEGER, start)))) ? reader.parse_integer(string, Numbers.add((SubLObject)web_utilities.THREE_INTEGER, start), glyph_last, (SubLObject)web_utilities.SIXTEEN_INTEGER, (SubLObject)web_utilities.NIL) : reader.parse_integer(string, Numbers.add((SubLObject)web_utilities.TWO_INTEGER, start), glyph_last, (SubLObject)web_utilities.TEN_INTEGER, (SubLObject)web_utilities.NIL);
                    if (web_utilities.NIL != integer && integer.numGE((SubLObject)web_utilities.ZERO_INTEGER) && integer.numL((SubLObject)web_utilities.$int93$256)) {
                        return Values.values(glyph_end, integer);
                    }
                }
            }
        }
        return Values.values((SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33383L)
    public static SubLObject html_encode_fort(final SubLObject fort) {
        return html_url_encode(PrintLow.format((SubLObject)web_utilities.NIL, (SubLObject)web_utilities.$str94$_S, forts.fort_el_formula(czer_main.canonicalize_term(fort, (SubLObject)web_utilities.UNPROVIDED))), (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33584L)
    public static SubLObject html_decode_fort(final SubLObject string) {
        return czer_main.canonicalize_term(reader.read_from_string(html_url_decode(string), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED), (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 33757L)
    public static SubLObject uri_p(final SubLObject v_object, SubLObject official_onlyP) {
        if (official_onlyP == web_utilities.UNPROVIDED) {
            official_onlyP = (SubLObject)web_utilities.NIL;
        }
        if (v_object.isString()) {
            final SubLObject colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, v_object, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != colon_idx && web_utilities.NIL != uri_scheme_p(v_object, official_onlyP, (SubLObject)web_utilities.ZERO_INTEGER, number_utilities.f_1X(colon_idx))) {
                return (SubLObject)web_utilities.T;
            }
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 34410L)
    public static SubLObject url_p(final SubLObject v_object) {
        if (!v_object.isString()) {
            return (SubLObject)web_utilities.NIL;
        }
        final SubLObject colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, v_object, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL == colon_idx) {
            return (SubLObject)web_utilities.NIL;
        }
        final SubLObject start_idx = find_url_beginning(v_object, Sequences.length(v_object), colon_idx);
        if (web_utilities.NIL == start_idx || start_idx.numG((SubLObject)web_utilities.ZERO_INTEGER)) {
            return (SubLObject)web_utilities.NIL;
        }
        if (web_utilities.NIL != Strings.stringE((SubLObject)web_utilities.$str95$mailto_, Sequences.subseq(v_object, (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.SEVEN_INTEGER), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
            return string_utilities.contains_charP(v_object, (SubLObject)Characters.CHAR_at);
        }
        return (SubLObject)web_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 35276L)
    public static SubLObject url_host(final SubLObject url) {
        final SubLObject colon_idx = Sequences.position((SubLObject)Characters.CHAR_colon, url, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL == colon_idx) {
            return (SubLObject)web_utilities.$str86$;
        }
        final SubLObject url_tokens = string_utilities.string_tokenize(url, (SubLObject)web_utilities.$list96, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.T, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        return conses_high.second(url_tokens);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 35922L)
    public static SubLObject url_is_relativeP(final SubLObject url) {
        assert web_utilities.NIL != string_utilities.non_empty_string_p(url) : url;
        return Equality.eq((SubLObject)Characters.CHAR_slash, string_utilities.first_char(url));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 36150L)
    public static SubLObject absolute_url_from_relative_url_and_base(final SubLObject url, final SubLObject base_uri) {
        assert web_utilities.NIL != Types.stringp(url) : url;
        assert web_utilities.NIL != Types.stringp(base_uri) : base_uri;
        final SubLObject relativeP = url_is_relativeP(url);
        return (web_utilities.NIL != relativeP && web_utilities.NIL != base_uri) ? Sequences.cconcatenate(format_nil.format_nil_a_no_copy(Strings.string_right_trim((SubLObject)web_utilities.$str29$_, base_uri)), format_nil.format_nil_a_no_copy(url)) : url;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37186L)
    public static SubLObject uri_scheme_p(final SubLObject v_object, SubLObject official_onlyP, SubLObject start, SubLObject end) {
        if (official_onlyP == web_utilities.UNPROVIDED) {
            official_onlyP = (SubLObject)web_utilities.NIL;
        }
        if (start == web_utilities.UNPROVIDED) {
            start = (SubLObject)web_utilities.ZERO_INTEGER;
        }
        if (end == web_utilities.UNPROVIDED) {
            end = (SubLObject)web_utilities.NIL;
        }
        SubLObject match = (SubLObject)web_utilities.NIL;
        if (web_utilities.NIL == match) {
            SubLObject csome_list_var = web_utilities.$official_uri_schemes$.getGlobalValue();
            SubLObject scheme = (SubLObject)web_utilities.NIL;
            scheme = csome_list_var.first();
            while (web_utilities.NIL == match && web_utilities.NIL != csome_list_var) {
                if (start.eql(Sequences.search(scheme, v_object, Symbols.symbol_function((SubLObject)web_utilities.EQUAL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            }
        }
        if (web_utilities.NIL == official_onlyP && web_utilities.NIL == match) {
            SubLObject csome_list_var = web_utilities.$unofficial_uri_schemes$.getGlobalValue();
            SubLObject scheme = (SubLObject)web_utilities.NIL;
            scheme = csome_list_var.first();
            while (web_utilities.NIL == match && web_utilities.NIL != csome_list_var) {
                if (start.eql(Sequences.search(scheme, v_object, Symbols.symbol_function((SubLObject)web_utilities.EQUAL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL, start, end))) {
                    match = scheme;
                }
                csome_list_var = csome_list_var.rest();
                scheme = csome_list_var.first();
            }
        }
        return list_utilities.sublisp_boolean(match);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 37852L)
    public static SubLObject find_url_beginning(final SubLObject string, final SubLObject length, final SubLObject idx) {
        if (!string.isString() || !length.isNumber() || !idx.isNumber()) {
            return (SubLObject)web_utilities.NIL;
        }
        SubLObject cdolist_list_var = web_utilities.$valid_url_beginnings$.getGlobalValue();
        SubLObject protocol = (SubLObject)web_utilities.NIL;
        protocol = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            final SubLObject begin_idx = Numbers.subtract(idx, string_utilities.char_position((SubLObject)Characters.CHAR_colon, protocol, (SubLObject)web_utilities.UNPROVIDED));
            final SubLObject end_idx = Numbers.add(begin_idx, Sequences.length(protocol));
            if (begin_idx.numGE((SubLObject)web_utilities.ZERO_INTEGER) && end_idx.numL(length) && web_utilities.NIL != Strings.stringE(protocol, Sequences.subseq(string, begin_idx, end_idx), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
                return begin_idx;
            }
            cdolist_list_var = cdolist_list_var.rest();
            protocol = cdolist_list_var.first();
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 38657L)
    public static SubLObject find_url_end(final SubLObject string, SubLObject length, SubLObject url_idx) {
        if (length == web_utilities.UNPROVIDED) {
            length = Sequences.length(string);
        }
        if (url_idx == web_utilities.UNPROVIDED) {
            url_idx = (SubLObject)web_utilities.ZERO_INTEGER;
        }
        if (!string.isString() || !length.isNumber() || !url_idx.isNumber()) {
            return (SubLObject)web_utilities.NIL;
        }
        SubLObject end_idx = list_utilities.position_if_not((SubLObject)web_utilities.$sym102$VALID_URL_CHAR_P, string, Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), url_idx, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL == end_idx) {
            end_idx = length;
        }
        if (!url_idx.eql((SubLObject)web_utilities.ZERO_INTEGER) || !end_idx.eql(length)) {
            while (end_idx.isPositive() && web_utilities.NIL != conses_high.member(Strings.sublisp_char(string, number_utilities.f_1_(end_idx)), web_utilities.$url_delimiters$.getGlobalValue(), Symbols.symbol_function((SubLObject)web_utilities.EQUALP), (SubLObject)web_utilities.UNPROVIDED)) {
                end_idx = Numbers.subtract(end_idx, (SubLObject)web_utilities.ONE_INTEGER);
            }
        }
        final SubLObject address = Sequences.subseq(string, url_idx, end_idx);
        if (web_utilities.NIL != url_p(address)) {
            return end_idx;
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 39675L)
    public static SubLObject valid_url_char_p(final SubLObject v_char) {
        return (SubLObject)SubLObjectFactory.makeBoolean(web_utilities.NIL != Characters.alpha_char_p(v_char) || web_utilities.NIL != Characters.digit_char_p(v_char, (SubLObject)web_utilities.UNPROVIDED) || web_utilities.NIL != Sequences.find(v_char, web_utilities.$valid_non_alphanumeric_url_chars$.getGlobalValue(), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 39894L)
    public static SubLObject resolve_relative_uri(final SubLObject base, final SubLObject local_name) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject new_base = canonicalize_relative_uri(base, local_name);
        final SubLObject new_local_name = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Sequences.cconcatenate(new_base, new_local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 40195L)
    public static SubLObject canonicalize_relative_uri(SubLObject base, SubLObject local_name) {
        while (web_utilities.NIL != string_utilities.starts_with(local_name, (SubLObject)web_utilities.$str104$___)) {
            base = remove_last_path_element(base);
            local_name = string_utilities.substring(local_name, (SubLObject)web_utilities.THREE_INTEGER, (SubLObject)web_utilities.UNPROVIDED);
        }
        if (web_utilities.NIL != string_utilities.starts_with(local_name, (SubLObject)web_utilities.$str105$__)) {
            final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, base, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != colon_pos) {
                base = string_utilities.substring(base, (SubLObject)web_utilities.ZERO_INTEGER, number_utilities.f_1X(colon_pos));
            }
        }
        else if (web_utilities.NIL != string_utilities.non_empty_string_p(base) && web_utilities.NIL != uri_lacks_path_componentP(base) && !Characters.CHAR_hash.eql(string_utilities.last_char(base)) && web_utilities.NIL != string_utilities.non_empty_string_p(local_name) && !Characters.CHAR_hash.eql(string_utilities.first_char(local_name))) {
            base = Sequences.cconcatenate(base, (SubLObject)web_utilities.$str29$_);
        }
        else if (web_utilities.NIL != string_utilities.starts_with(local_name, (SubLObject)web_utilities.$str29$_)) {
            final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, base, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != colon_pos) {
                final SubLObject domain_name_end = Sequences.position((SubLObject)Characters.CHAR_slash, base, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), Numbers.add((SubLObject)web_utilities.THREE_INTEGER, colon_pos), (SubLObject)web_utilities.UNPROVIDED);
                base = string_utilities.substring(base, (SubLObject)web_utilities.ZERO_INTEGER, domain_name_end);
            }
        }
        else if (web_utilities.NIL == string_utilities.empty_string_p(local_name) && !string_utilities.first_char(local_name).eql((SubLObject)Characters.CHAR_hash) && !string_utilities.last_char(base).eql((SubLObject)Characters.CHAR_hash)) {
            final SubLObject slash_pos = list_utilities.position_from_end((SubLObject)Characters.CHAR_slash, base, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != list_utilities.lengthG(base, number_utilities.f_1X(slash_pos), (SubLObject)web_utilities.UNPROVIDED)) {
                base = string_utilities.substring(base, (SubLObject)web_utilities.ZERO_INTEGER, number_utilities.f_1X(slash_pos));
            }
        }
        return Values.values(base, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 41589L)
    public static SubLObject remove_last_path_element(final SubLObject uri) {
        final SubLObject last_slash_pos = list_utilities.position_from_end((SubLObject)Characters.CHAR_slash, uri, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        final SubLObject directory_start = list_utilities.position_from_end((SubLObject)Characters.CHAR_slash, uri, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), (SubLObject)web_utilities.ZERO_INTEGER, last_slash_pos);
        return string_utilities.substring(uri, (SubLObject)web_utilities.ZERO_INTEGER, directory_start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 41820L)
    public static SubLObject uri_lacks_path_componentP(final SubLObject uri) {
        final SubLObject colon_pos = Sequences.position((SubLObject)Characters.CHAR_colon, uri, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        final SubLObject path_start = (SubLObject)((web_utilities.NIL != colon_pos) ? Sequences.position((SubLObject)Characters.CHAR_slash, uri, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), Numbers.add(colon_pos, (SubLObject)web_utilities.THREE_INTEGER), (SubLObject)web_utilities.UNPROVIDED) : web_utilities.NIL);
        return Types.sublisp_null(path_start);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
    public static SubLObject clear_soap_name() {
        final SubLObject cs = web_utilities.$soap_name_caching_state$.getGlobalValue();
        if (web_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
    public static SubLObject remove_soap_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(web_utilities.$soap_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
    public static SubLObject soap_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate((SubLObject)web_utilities.$str116$soap_, local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44329L)
    public static SubLObject soap_name(final SubLObject local_name) {
        SubLObject caching_state = web_utilities.$soap_name_caching_state$.getGlobalValue();
        if (web_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)web_utilities.$sym115$SOAP_NAME, (SubLObject)web_utilities.$sym117$_SOAP_NAME_CACHING_STATE_, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.EQUAL, (SubLObject)web_utilities.ONE_INTEGER, (SubLObject)web_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(soap_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)web_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
    public static SubLObject clear_soap_expanded_name() {
        final SubLObject cs = web_utilities.$soap_expanded_name_caching_state$.getGlobalValue();
        if (web_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
    public static SubLObject remove_soap_expanded_name(final SubLObject local_name) {
        return memoization_state.caching_state_remove_function_results_with_args(web_utilities.$soap_expanded_name_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(local_name), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
    public static SubLObject soap_expanded_name_internal(final SubLObject local_name) {
        return Sequences.cconcatenate(web_utilities.$soap_envelope_uri$.getGlobalValue(), local_name);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44449L)
    public static SubLObject soap_expanded_name(final SubLObject local_name) {
        SubLObject caching_state = web_utilities.$soap_expanded_name_caching_state$.getGlobalValue();
        if (web_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)web_utilities.$sym118$SOAP_EXPANDED_NAME, (SubLObject)web_utilities.$sym119$_SOAP_EXPANDED_NAME_CACHING_STATE_, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.EQUAL, (SubLObject)web_utilities.ONE_INTEGER, (SubLObject)web_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, local_name, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(soap_expanded_name_internal(local_name)));
            memoization_state.caching_state_put(caching_state, local_name, results, (SubLObject)web_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44590L)
    public static SubLObject soap_envelope_sexpr_p(final SubLObject sexpr) {
        return Equality.equal(soap_expanded_name((SubLObject)web_utilities.$str120$Envelope), xml_parsing_utilities.xml_sexpr_type(sexpr));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
    public static SubLObject clear_perform_soap_post_cached() {
        final SubLObject cs = web_utilities.$perform_soap_post_cached_caching_state$.getGlobalValue();
        if (web_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
    public static SubLObject remove_perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == web_utilities.UNPROVIDED) {
            port = (SubLObject)web_utilities.$int19$80;
        }
        if (keep_aliveP == web_utilities.UNPROVIDED) {
            keep_aliveP = (SubLObject)web_utilities.T;
        }
        return memoization_state.caching_state_remove_function_results_with_args(web_utilities.$perform_soap_post_cached_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(query, soap_action_uri, machine, url, port, keep_aliveP), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
    public static SubLObject perform_soap_post_cached_internal(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, final SubLObject port, final SubLObject keep_aliveP) {
        return perform_soap_post(query, soap_action_uri, machine, url, port, keep_aliveP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44708L)
    public static SubLObject perform_soap_post_cached(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == web_utilities.UNPROVIDED) {
            port = (SubLObject)web_utilities.$int19$80;
        }
        if (keep_aliveP == web_utilities.UNPROVIDED) {
            keep_aliveP = (SubLObject)web_utilities.T;
        }
        SubLObject caching_state = web_utilities.$perform_soap_post_cached_caching_state$.getGlobalValue();
        if (web_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)web_utilities.$sym121$PERFORM_SOAP_POST_CACHED, (SubLObject)web_utilities.$sym122$_PERFORM_SOAP_POST_CACHED_CACHING_STATE_, (SubLObject)web_utilities.$int93$256, (SubLObject)web_utilities.EQUAL, (SubLObject)web_utilities.SIX_INTEGER, (SubLObject)web_utilities.ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(query, soap_action_uri, machine, url, port, keep_aliveP);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)web_utilities.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)web_utilities.NIL;
            collision = cdolist_list_var.first();
            while (web_utilities.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
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
                                    if (web_utilities.NIL != cached_args && web_utilities.NIL == cached_args.rest() && keep_aliveP.equal(cached_args.first())) {
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
        final SubLObject results3 = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(perform_soap_post_cached_internal(query, soap_action_uri, machine, url, port, keep_aliveP)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(query, soap_action_uri, machine, url, port, keep_aliveP));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 44965L)
    public static SubLObject perform_soap_post(final SubLObject query, final SubLObject soap_action_uri, final SubLObject machine, final SubLObject url, SubLObject port, SubLObject keep_aliveP) {
        if (port == web_utilities.UNPROVIDED) {
            port = (SubLObject)web_utilities.$int19$80;
        }
        if (keep_aliveP == web_utilities.UNPROVIDED) {
            keep_aliveP = (SubLObject)web_utilities.T;
        }
        SubLObject response = (SubLObject)web_utilities.NIL;
        SubLObject sexpr = (SubLObject)web_utilities.NIL;
        final SubLObject real_port = (SubLObject)(port.eql((SubLObject)web_utilities.$kw8$DEFAULT) ? web_utilities.$int19$80 : port);
        SubLObject in_stream = (SubLObject)web_utilities.NIL;
        try {
            in_stream = subl_promotions.open_tcp_stream_with_timeout(machine, real_port, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.$kw22$PRIVATE);
            if (web_utilities.NIL != subl_macro_promotions.validate_tcp_connection(in_stream, machine, real_port)) {
                send_http_request(in_stream, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw25$MACHINE, machine, web_utilities.$kw7$PORT, port, web_utilities.$kw5$METHOD, web_utilities.$kw54$POST, web_utilities.$kw26$URL, url, web_utilities.$kw4$QUERY, query, web_utilities.$kw9$KEEP_ALIVE_, keep_aliveP, web_utilities.$kw10$WIDE_NEWLINES_, web_utilities.T, web_utilities.$kw12$ACCEPT_TYPES, web_utilities.$kw8$DEFAULT, web_utilities.$kw13$CONTENT_TYPE, web_utilities.$str123$text_xml__charset_utf_8, web_utilities.$kw14$SOAP_ACTION_URI, soap_action_uri }));
                response = http_response_body(slack_read_until_eof(in_stream, (SubLObject)web_utilities.UNPROVIDED));
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)web_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (web_utilities.NIL != in_stream) {
                    streams_high.close(in_stream, (SubLObject)web_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        if (!Characters.CHAR_less.eql(string_utilities.first_char(response))) {
            final SubLObject start = Sequences.position((SubLObject)Characters.CHAR_less, response, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != start) {
                response = string_utilities.substring(response, start, (SubLObject)web_utilities.UNPROVIDED);
            }
        }
        SubLObject stream = (SubLObject)web_utilities.NIL;
        try {
            stream = streams_high.make_private_string_input_stream(response, (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL);
            sexpr = xml_parsing_utilities.xml_tokens_to_sexpr(xml_parsing_utilities.xml_tokenize(stream, (SubLObject)web_utilities.T, (SubLObject)web_utilities.T, (SubLObject)web_utilities.T));
        }
        finally {
            final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)web_utilities.T);
                final SubLObject _values2 = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
            }
        }
        return sexpr;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 45710L)
    public static SubLObject make_soap_message(final SubLObject tns, final SubLObject header_properties, final SubLObject body_elements, SubLObject encoding, SubLObject standalone, SubLObject header_elements) {
        if (encoding == web_utilities.UNPROVIDED) {
            encoding = (SubLObject)web_utilities.$str124$US_ASCII;
        }
        if (standalone == web_utilities.UNPROVIDED) {
            standalone = (SubLObject)web_utilities.T;
        }
        if (header_elements == web_utilities.UNPROVIDED) {
            header_elements = (SubLObject)web_utilities.NIL;
        }
        xml_utilities.xml_header(xml_utilities.xml_version(), encoding, standalone);
        final SubLObject name_var = soap_name((SubLObject)web_utilities.$str120$Envelope);
        xml_utilities.xml_start_tag_internal(name_var, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$str125$xmlns_soap, web_utilities.$soap_envelope_uri$.getGlobalValue()), (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL != list_utilities.non_empty_list_p(header_properties) || web_utilities.NIL != list_utilities.non_empty_list_p(header_elements)) {
            final SubLObject name_var_$6 = soap_name((SubLObject)web_utilities.$str126$Header);
            xml_utilities.xml_start_tag_internal(name_var_$6, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject cdolist_list_var = header_properties;
            SubLObject cons = (SubLObject)web_utilities.NIL;
            cons = cdolist_list_var.first();
            while (web_utilities.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject attribute = (SubLObject)web_utilities.NIL;
                SubLObject value = (SubLObject)web_utilities.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list127);
                attribute = current.first();
                current = (value = current.rest());
                final SubLObject name_var_$7 = attribute;
                xml_utilities.xml_start_tag_internal(name_var_$7, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$str128$xmlns, tns), (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                xml_utilities.xml_write_string(value, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                xml_utilities.xml_end_tag_internal(name_var_$7);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
            cdolist_list_var = header_elements;
            SubLObject element = (SubLObject)web_utilities.NIL;
            element = cdolist_list_var.first();
            while (web_utilities.NIL != cdolist_list_var) {
                xml_utilities.xml_write(element, (SubLObject)web_utilities.NIL);
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            }
            xml_utilities.xml_end_tag_internal(name_var_$6);
        }
        final SubLObject name_var_$8 = soap_name((SubLObject)web_utilities.$str129$Body);
        xml_utilities.xml_start_tag_internal(name_var_$8, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject cdolist_list_var = body_elements;
        SubLObject element = (SubLObject)web_utilities.NIL;
        element = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            xml_utilities.xml_write(element, (SubLObject)web_utilities.NIL);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        }
        xml_utilities.xml_end_tag_internal(name_var_$8);
        xml_utilities.xml_end_tag_internal(name_var);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 46587L)
    public static SubLObject get_http_status_code(final SubLObject header_string) {
        final SubLObject header_tokenized = Sequences.delete((SubLObject)web_utilities.$str86$, string_utilities.split_string(header_string, (SubLObject)web_utilities.$list130), Symbols.symbol_function((SubLObject)web_utilities.EQUAL), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.$str131$HTTP.equal(Strings.string_upcase(header_tokenized.first(), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED))) {
            return string_utilities.string_to_integer(conses_high.third(header_tokenized));
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47125L)
    public static SubLObject html_redirection_header_p(final SubLObject string) {
        final SubLObject code = get_http_status_code(string);
        return list_utilities.alist_has_keyP(web_utilities.$http_redirection_codes$.getGlobalValue(), code, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47353L)
    public static SubLObject html_redirection_url(final SubLObject string) {
        final SubLObject marker = (SubLObject)web_utilities.$str132$Location__;
        final SubLObject marker_start = Sequences.search(marker, string, Symbols.symbol_function((SubLObject)web_utilities.EQUAL), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        if (web_utilities.NIL != marker_start) {
            final SubLObject location_start = Numbers.add(marker_start, Sequences.length(marker));
            final SubLObject location_end = Sequences.position_if(Symbols.symbol_function((SubLObject)web_utilities.$sym133$WHITESPACEP), string, Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), location_start, (SubLObject)web_utilities.UNPROVIDED);
            if (web_utilities.NIL != location_end) {
                return string_utilities.substring(string, location_start, location_end);
            }
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 47893L)
    public static SubLObject parse_http_url(final SubLObject http_url) {
        SubLObject machine = (SubLObject)web_utilities.NIL;
        SubLObject port = (SubLObject)web_utilities.NIL;
        SubLObject url = (SubLObject)web_utilities.NIL;
        SubLObject query = (SubLObject)web_utilities.NIL;
        if (web_utilities.NIL != Sequences.search((SubLObject)web_utilities.$str134$http___, http_url, Symbols.symbol_function((SubLObject)web_utilities.EQUALP), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED) || web_utilities.NIL != Sequences.search((SubLObject)web_utilities.$str135$https___, http_url, Symbols.symbol_function((SubLObject)web_utilities.EQUALP), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED)) {
            final SubLObject machine_start = Sequences.length((SubLObject)web_utilities.$str134$http___);
            final SubLObject port_start = Sequences.position((SubLObject)Characters.CHAR_colon, http_url, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), machine_start, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject url_start = Sequences.position((SubLObject)Characters.CHAR_slash, http_url, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), machine_start, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject machine_end = (SubLObject)web_utilities.NIL;
            if (web_utilities.NIL == url_start) {
                url_start = Sequences.length(http_url);
            }
            if (web_utilities.NIL != port_start && port_start.numL(url_start)) {
                machine_end = port_start;
                port = reader.read_from_string_ignoring_errors(http_url, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, Numbers.add(port_start, (SubLObject)web_utilities.ONE_INTEGER), url_start);
            }
            else {
                machine_end = url_start;
                port = (SubLObject)web_utilities.$kw8$DEFAULT;
            }
            machine = string_utilities.substring(http_url, machine_start, machine_end);
            final SubLObject query_start = Sequences.position((SubLObject)Characters.CHAR_question, http_url, Symbols.symbol_function((SubLObject)web_utilities.EQL), Symbols.symbol_function((SubLObject)web_utilities.IDENTITY), url_start, (SubLObject)web_utilities.UNPROVIDED);
            SubLObject url_end = (SubLObject)web_utilities.NIL;
            if (web_utilities.NIL != query_start) {
                url_end = query_start;
            }
            url = string_utilities.substring(http_url, url_start, url_end);
            if (web_utilities.NIL != query_start) {
                query = string_utilities.substring(http_url, Numbers.add((SubLObject)web_utilities.ONE_INTEGER, query_start), (SubLObject)web_utilities.UNPROVIDED);
            }
            else {
                query = (SubLObject)web_utilities.$str86$;
            }
        }
        return Values.values(machine, port, url, query);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 49120L)
    public static SubLObject read_until_eof(final SubLObject in_stream, SubLObject buffer) {
        if (buffer == web_utilities.UNPROVIDED) {
            buffer = (SubLObject)web_utilities.NIL;
        }
        if (web_utilities.NIL == buffer) {
            buffer = Strings.make_string((SubLObject)web_utilities.$int136$100, (SubLObject)web_utilities.UNPROVIDED);
        }
        SubLObject text = (SubLObject)web_utilities.$str86$;
        final SubLObject length = Sequences.length(buffer);
        SubLObject index = (SubLObject)web_utilities.ZERO_INTEGER;
        SubLObject read_char;
        for (read_char = (SubLObject)web_utilities.NIL, read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED); web_utilities.NIL != read_char; read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED)) {
            Strings.set_char(buffer, index, read_char);
            index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
            if (index.numE(length)) {
                text = Sequences.cconcatenate(text, string_utilities.substring(buffer, (SubLObject)web_utilities.ZERO_INTEGER, index));
                index = (SubLObject)web_utilities.ZERO_INTEGER;
            }
        }
        return Values.values(Sequences.cconcatenate(text, string_utilities.substring(buffer, (SubLObject)web_utilities.ZERO_INTEGER, index)), Types.sublisp_null(read_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 50099L)
    public static SubLObject read_until_char(final SubLObject in_stream, final SubLObject v_char, SubLObject scratch_stream) {
        if (scratch_stream == web_utilities.UNPROVIDED) {
            scratch_stream = streams_high.make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = (SubLObject)web_utilities.NIL, read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED); !read_char.eql(v_char) && web_utilities.NIL != read_char; read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED)) {
            streams_high.write_char(read_char, scratch_stream);
        }
        return Values.values(streams_high.get_output_stream_string(scratch_stream), Types.sublisp_null(read_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 50664L)
    public static SubLObject read_while(final SubLObject in_stream, final SubLObject test, SubLObject scratch_stream) {
        if (scratch_stream == web_utilities.UNPROVIDED) {
            scratch_stream = streams_high.make_private_string_output_stream();
        }
        SubLObject peek_char;
        for (peek_char = (SubLObject)web_utilities.NIL, peek_char = streams_high.peek_char((SubLObject)web_utilities.NIL, in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED); web_utilities.NIL != peek_char && web_utilities.NIL != Functions.funcall(test, peek_char); peek_char = streams_high.peek_char((SubLObject)web_utilities.NIL, in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED)) {
            streams_high.write_char(streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED), scratch_stream);
        }
        return Values.values(streams_high.get_output_stream_string(scratch_stream), peek_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 51226L)
    public static SubLObject read_until_char_unless(final SubLObject in_stream, final SubLObject v_char, final SubLObject unless_char, SubLObject scratch_stream) {
        if (scratch_stream == web_utilities.UNPROVIDED) {
            scratch_stream = streams_high.make_private_string_output_stream();
        }
        SubLObject last_char;
        SubLObject read_char;
        for (last_char = (SubLObject)web_utilities.NIL, read_char = (SubLObject)web_utilities.NIL, read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED); (!read_char.eql(v_char) || last_char.eql(unless_char)) && web_utilities.NIL != read_char; read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED)) {
            last_char = read_char;
            streams_high.write_char(read_char, scratch_stream);
        }
        return Values.values(streams_high.get_output_stream_string(scratch_stream), Types.sublisp_null(read_char));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 51943L)
    public static SubLObject read_until_one_of(final SubLObject in_stream, final SubLObject chars, SubLObject scratch_stream) {
        if (scratch_stream == web_utilities.UNPROVIDED) {
            scratch_stream = streams_high.make_private_string_output_stream();
        }
        SubLObject read_char;
        for (read_char = (SubLObject)web_utilities.NIL, read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED); web_utilities.NIL == conses_high.member(read_char, chars, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED) && web_utilities.NIL != read_char; read_char = streams_high.read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED)) {
            streams_high.write_char(read_char, scratch_stream);
        }
        return Values.values(streams_high.get_output_stream_string(scratch_stream), read_char);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 52534L)
    public static SubLObject slack_read_until_eof(final SubLObject in_stream, SubLObject max_chars) {
        if (max_chars == web_utilities.UNPROVIDED) {
            max_chars = (SubLObject)web_utilities.NIL;
        }
        SubLObject result_string = (SubLObject)web_utilities.NIL;
        SubLObject eofP = (SubLObject)web_utilities.NIL;
        SubLObject stream = (SubLObject)web_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            SubLObject read_char;
            SubLObject read_count;
            for (read_char = (SubLObject)web_utilities.NIL, read_count = (SubLObject)web_utilities.NIL, read_char = slack_read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED), read_count = (SubLObject)web_utilities.ZERO_INTEGER; web_utilities.NIL != read_char && (web_utilities.NIL == max_chars || !read_count.numGE(max_chars)); read_char = slack_read_char(in_stream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED), read_count = number_utilities.f_1X(read_count)) {
                streams_high.write_char(read_char, stream);
            }
            eofP = Types.sublisp_null(read_char);
            result_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)web_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return Values.values(result_string, eofP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53134L)
    public static SubLObject try_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject msg = (SubLObject)web_utilities.NIL;
        SubLObject exp = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list137);
        msg = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list137);
        exp = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list(reader.bq_cons(msg, (SubLObject)web_utilities.$list138)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym139$CATCH_ERROR_MESSAGE, (SubLObject)ConsesLow.list(msg), exp), ConsesLow.append(body, (SubLObject)web_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53262L)
    public static SubLObject slack_read_char(SubLObject stream, SubLObject eof_error_p, SubLObject eof_value, SubLObject recursive_p) {
        if (stream == web_utilities.UNPROVIDED) {
            stream = StreamsLow.$standard_input$.getDynamicValue();
        }
        if (eof_error_p == web_utilities.UNPROVIDED) {
            eof_error_p = (SubLObject)web_utilities.T;
        }
        if (eof_value == web_utilities.UNPROVIDED) {
            eof_value = (SubLObject)web_utilities.NIL;
        }
        if (recursive_p == web_utilities.UNPROVIDED) {
            recursive_p = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_utilities.NIL != eof_error_p) {
            return streams_high.read_char(stream, eof_error_p, eof_value, recursive_p);
        }
        SubLObject ch = (SubLObject)web_utilities.NIL;
        SubLObject msg = (SubLObject)web_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)web_utilities.$sym140$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    ch = streams_high.read_char(stream, eof_error_p, eof_value, recursive_p);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)web_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (web_utilities.NIL != msg) {
            PrintLow.format((SubLObject)web_utilities.T, (SubLObject)web_utilities.$str141$_____Averted__connection_reset_by);
            ch = eof_value;
        }
        return ch;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 53709L)
    public static SubLObject read_http_chunk(final SubLObject instream) {
        final SubLObject chunk_length_string = string_utilities.network_read_line(instream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.$str142$0, (SubLObject)web_utilities.UNPROVIDED);
        final SubLObject chunk_length = reader.parse_integer(chunk_length_string, (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.SIXTEEN_INTEGER, (SubLObject)web_utilities.T);
        SubLObject buffer = string_utilities.$empty_string$.getGlobalValue();
        if (web_utilities.NIL != chunk_length) {
            buffer = Strings.make_string(chunk_length, (SubLObject)web_utilities.UNPROVIDED);
            streams_high.read_sequence(buffer, instream, (SubLObject)web_utilities.ZERO_INTEGER, chunk_length);
            string_utilities.network_read_line(instream, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.UNPROVIDED);
        }
        return buffer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54243L)
    public static SubLObject write_http_chunk(final SubLObject outstream, final SubLObject line) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = print_high.$print_base$.currentBinding(thread);
        try {
            print_high.$print_base$.bind((SubLObject)web_utilities.SIXTEEN_INTEGER, thread);
            print_high.princ(Sequences.length(line), outstream);
        }
        finally {
            print_high.$print_base$.rebind(_prev_bind_0, thread);
        }
        http_network_terpri(outstream);
        streams_high.write_string(line, outstream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        http_network_terpri(outstream);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54549L)
    public static SubLObject http_network_terpri(final SubLObject network_outstream) {
        streams_high.write_char(Characters.code_char((SubLObject)web_utilities.THIRTEEN_INTEGER), network_outstream);
        streams_high.write_char(Characters.code_char((SubLObject)web_utilities.TEN_INTEGER), network_outstream);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 54778L)
    public static SubLObject write_http_date(final SubLObject stream, SubLObject universal_time) {
        if (universal_time == web_utilities.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject second = Time.decode_universal_time(universal_time, (SubLObject)web_utilities.ZERO_INTEGER);
        final SubLObject minute = thread.secondMultipleValue();
        final SubLObject hour = thread.thirdMultipleValue();
        final SubLObject date = thread.fourthMultipleValue();
        final SubLObject month = thread.fifthMultipleValue();
        final SubLObject year = thread.sixthMultipleValue();
        final SubLObject day = thread.seventhMultipleValue();
        thread.resetMultipleValues();
        streams_high.write_string(numeric_date_utilities.day_of_week_number_abbrev(day), stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        streams_high.write_string((SubLObject)web_utilities.$str76$__, stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        utilities_macros.print_2_digit_nonnegative_integer(date, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        streams_high.write_string(numeric_date_utilities.month_number_abbrev(month), stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        print_high.princ(year, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_space, stream);
        utilities_macros.print_2_digit_nonnegative_integer(hour, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, stream);
        utilities_macros.print_2_digit_nonnegative_integer(minute, stream);
        streams_high.write_char((SubLObject)Characters.CHAR_colon, stream);
        utilities_macros.print_2_digit_nonnegative_integer(second, stream);
        streams_high.write_string((SubLObject)web_utilities.$str143$_GMT, stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 55823L)
    public static SubLObject http_date_string(SubLObject universal_time) {
        if (universal_time == web_utilities.UNPROVIDED) {
            universal_time = Time.get_universal_time();
        }
        SubLObject string = (SubLObject)web_utilities.NIL;
        SubLObject stream = (SubLObject)web_utilities.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            write_http_date(stream, universal_time);
            string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)web_utilities.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56178L)
    public static SubLObject html_tokens_fast_forward(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = (SubLObject)web_utilities.NIL;
        SubLObject list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.listS((SubLObject)web_utilities.$sym145$MEMBER, pattern, list, (SubLObject)web_utilities.$list146);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list144);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56409L)
    public static SubLObject html_tokens_step(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list147);
        list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, list, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym149$CDR, list));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list147);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56480L)
    public static SubLObject html_tokens_fast_forward_to(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = (SubLObject)web_utilities.NIL;
        SubLObject list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, list, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym150$HTML_TOKENS_FAST_FORWARD, pattern, list));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list144);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56600L)
    public static SubLObject html_tokens_fast_forward_past(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject pattern = (SubLObject)web_utilities.NIL;
        SubLObject list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        pattern = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list144);
        list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, list, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym149$CDR, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym150$HTML_TOKENS_FAST_FORWARD, pattern, list)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list144);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56728L)
    public static SubLObject html_tokens_extract_curr(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject list = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list147);
        list = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym151$CAR, list);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list147);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 56793L)
    public static SubLObject is_html_terminating_tagP(final SubLObject string, final SubLObject open_tag) {
        if (!Characters.CHAR_less.eql(Strings.sublisp_char(string, (SubLObject)web_utilities.ZERO_INTEGER)) || !Characters.CHAR_slash.eql(Strings.sublisp_char(string, (SubLObject)web_utilities.ONE_INTEGER))) {
            return (SubLObject)web_utilities.NIL;
        }
        return Strings.string_equal(string, open_tag, (SubLObject)web_utilities.TWO_INTEGER, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.ONE_INTEGER, (SubLObject)web_utilities.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57139L)
    public static SubLObject test_for_html_tagP(final SubLObject tokens, final SubLObject tag) {
        final SubLObject current = tokens.first();
        if (!current.isString()) {
            return (SubLObject)web_utilities.NIL;
        }
        return Strings.string_equal(tag, current, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57329L)
    public static SubLObject html_consume_starting_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject tag = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list152);
        tokens = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list152);
        tag = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            final SubLObject marker = (SubLObject)web_utilities.$sym153$MARKER;
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(marker, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym154$HTML_TOKENS_EXTRACT_CURR, tokens))), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym155$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym156$STRING_EQUAL, marker, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym157$ERROR, (SubLObject)web_utilities.$str158$Invalid_input_file_format__Expect, tag, marker)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym159$HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list152);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 57694L)
    public static SubLObject html_consume_closing_tag(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject tag = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list152);
        tokens = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list152);
        tag = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            final SubLObject marker = (SubLObject)web_utilities.$sym160$MARKER;
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(marker, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym154$HTML_TOKENS_EXTRACT_CURR, tokens))), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym155$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym161$IS_HTML_TERMINATING_TAG_, marker, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym157$ERROR, (SubLObject)web_utilities.$str162$Invalid_input_file_format__Expect, tag, marker)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym159$HTML_TOKENS_STEP, tokens));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list152);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58069L)
    public static SubLObject html_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject tag = (SubLObject)web_utilities.NIL;
        SubLObject storage = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        tokens = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        storage = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym164$PROGN, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym165$HTML_CONSUME_STARTING_TAG, tokens, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, storage, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym154$HTML_TOKENS_EXTRACT_CURR, tokens)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym159$HTML_TOKENS_STEP, tokens), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym166$HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list163);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58351L)
    public static SubLObject html_extract_possibly_empty_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject tag = (SubLObject)web_utilities.NIL;
        SubLObject storage = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list167);
        tokens = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list167);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list167);
        storage = current.first();
        current = current.rest();
        final SubLObject v_default = (SubLObject)(current.isCons() ? current.first() : web_utilities.NIL);
        cdestructuring_bind.destructuring_bind_must_listp(current, datum, (SubLObject)web_utilities.$list167);
        current = current.rest();
        if (web_utilities.NIL == current) {
            final SubLObject temp = (SubLObject)web_utilities.$sym168$TEMP;
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym16$CLET, (SubLObject)ConsesLow.list(temp), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, storage, v_default), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym165$HTML_CONSUME_STARTING_TAG, tokens, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, temp, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym154$HTML_TOKENS_EXTRACT_CURR, tokens)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym155$PUNLESS, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym161$IS_HTML_TERMINATING_TAG_, temp, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym148$CSETQ, storage, temp), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym159$HTML_TOKENS_STEP, tokens)), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym166$HTML_CONSUME_CLOSING_TAG, tokens, tag));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list167);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 58865L)
    public static SubLObject html_possibly_extract_tag_content(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject tag = (SubLObject)web_utilities.NIL;
        SubLObject storage = (SubLObject)web_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        tokens = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        tag = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list163);
        storage = current.first();
        current = current.rest();
        if (web_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym169$PWHEN, (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym170$TEST_FOR_HTML_TAG_, tokens, tag), (SubLObject)ConsesLow.list((SubLObject)web_utilities.$sym171$HTML_EXTRACT_TAG_CONTENT, tokens, tag, storage));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)web_utilities.$list163);
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59060L)
    public static SubLObject html_file_as_tokens(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        SubLObject stream = (SubLObject)web_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)web_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)web_utilities.$kw172$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)web_utilities.$str173$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            tokens = html_stream_as_tokens(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59331L)
    public static SubLObject html_stream_as_tokens(final SubLObject stream) {
        SubLObject tokens = (SubLObject)web_utilities.NIL;
        tokens = xml_parsing_utilities.xml_tokenize(stream, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject cleansed = (SubLObject)web_utilities.NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)web_utilities.NIL;
        token = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            final SubLObject clean_token = html_cleaned_token_string(token);
            if (!Sequences.length(clean_token).isZero()) {
                cleansed = (SubLObject)ConsesLow.cons(clean_token, cleansed);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        tokens = Sequences.nreverse(cleansed);
        return tokens;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59746L)
    public static SubLObject html_cleaned_token_string(SubLObject string) {
        string = string_utilities.nsubst_whitespace(string);
        return string_utilities.reduce_whitespace(string);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 59880L)
    public static SubLObject html_property_list_to_url_parameters(final SubLObject v_properties) {
        assert web_utilities.NIL != list_utilities.property_list_p(v_properties) : v_properties;
        final SubLObject result = streams_high.make_string_output_stream();
        SubLObject list_var = (SubLObject)web_utilities.NIL;
        SubLObject item = (SubLObject)web_utilities.NIL;
        SubLObject count = (SubLObject)web_utilities.NIL;
        list_var = v_properties;
        item = list_var.first();
        for (count = (SubLObject)web_utilities.ZERO_INTEGER; web_utilities.NIL != list_var; list_var = list_var.rest(), item = list_var.first(), count = Numbers.add((SubLObject)web_utilities.ONE_INTEGER, count)) {
            if (web_utilities.NIL != Numbers.evenp(count)) {
                if (!count.isZero()) {
                    streams_high.write_string((SubLObject)web_utilities.$str175$_, result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                }
                streams_high.write_string(Symbols.symbol_name(item), result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                streams_high.write_string((SubLObject)web_utilities.$str176$_, result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            }
            else {
                streams_high.write_string(string_utilities.to_string(item), result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            }
        }
        return streams_high.get_output_stream_string(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 60414L)
    public static SubLObject html_assocation_list_to_url_parameters(final SubLObject alist) {
        assert web_utilities.NIL != list_utilities.alist_p(alist) : alist;
        final SubLObject result = streams_high.make_string_output_stream();
        SubLObject on_first_param = (SubLObject)web_utilities.T;
        SubLObject cdolist_list_var = alist;
        SubLObject cons = (SubLObject)web_utilities.NIL;
        cons = cdolist_list_var.first();
        while (web_utilities.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject key = (SubLObject)web_utilities.NIL;
            SubLObject value = (SubLObject)web_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)web_utilities.$list178);
            key = current.first();
            current = (value = current.rest());
            if (web_utilities.NIL == on_first_param) {
                streams_high.write_string((SubLObject)web_utilities.$str175$_, result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            }
            else {
                on_first_param = (SubLObject)web_utilities.NIL;
            }
            streams_high.write_string(key, result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            streams_high.write_string((SubLObject)web_utilities.$str176$_, result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            streams_high.write_string(html_url_encode(string_utilities.to_string(value), (SubLObject)web_utilities.UNPROVIDED), result, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return streams_high.get_output_stream_string(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 60878L)
    public static SubLObject matching_open_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == web_utilities.UNPROVIDED) {
            test = (SubLObject)web_utilities.EQUAL;
        }
        final SubLObject tag_size = Sequences.length(tag);
        if (!tag_size.numE(Numbers.add((SubLObject)web_utilities.TWO_INTEGER, Sequences.length(pattern)))) {
            return (SubLObject)web_utilities.NIL;
        }
        SubLObject index = (SubLObject)web_utilities.ZERO_INTEGER;
        if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), (SubLObject)Characters.CHAR_less)) {
            return (SubLObject)web_utilities.NIL;
        }
        index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
        SubLObject end_var_$9;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = (end_var_$9 = Sequences.length(pattern)), char_num = (SubLObject)web_utilities.NIL, char_num = (SubLObject)web_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$9); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return (SubLObject)web_utilities.NIL;
            }
            index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
        }
        if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), (SubLObject)Characters.CHAR_greater)) {
            return (SubLObject)web_utilities.NIL;
        }
        return (SubLObject)web_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 61693L)
    public static SubLObject matching_close_tagP(final SubLObject pattern, final SubLObject tag, SubLObject test) {
        if (test == web_utilities.UNPROVIDED) {
            test = (SubLObject)web_utilities.EQUAL;
        }
        final SubLObject tag_size = Sequences.length(tag);
        if (!tag_size.numE(Numbers.add((SubLObject)web_utilities.THREE_INTEGER, Sequences.length(pattern)))) {
            return (SubLObject)web_utilities.NIL;
        }
        SubLObject index = (SubLObject)web_utilities.ZERO_INTEGER;
        if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), (SubLObject)Characters.CHAR_less)) {
            return (SubLObject)web_utilities.NIL;
        }
        index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
        if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), (SubLObject)Characters.CHAR_slash)) {
            return (SubLObject)web_utilities.NIL;
        }
        index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
        SubLObject end_var_$10;
        SubLObject end_var;
        SubLObject char_num;
        SubLObject curr;
        for (end_var = (end_var_$10 = Sequences.length(pattern)), char_num = (SubLObject)web_utilities.NIL, char_num = (SubLObject)web_utilities.ZERO_INTEGER; !char_num.numGE(end_var_$10); char_num = number_utilities.f_1X(char_num)) {
            curr = Strings.sublisp_char(pattern, char_num);
            if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), curr)) {
                return (SubLObject)web_utilities.NIL;
            }
            index = Numbers.add(index, (SubLObject)web_utilities.ONE_INTEGER);
        }
        if (web_utilities.NIL == Functions.funcall(test, Strings.sublisp_char(tag, index), (SubLObject)Characters.CHAR_greater)) {
            return (SubLObject)web_utilities.NIL;
        }
        return (SubLObject)web_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
    public static SubLObject clear_byte_order_mark() {
        final SubLObject cs = web_utilities.$byte_order_mark_caching_state$.getGlobalValue();
        if (web_utilities.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)web_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
    public static SubLObject remove_byte_order_mark() {
        return memoization_state.caching_state_remove_function_results_with_args(web_utilities.$byte_order_mark_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(web_utilities.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
    public static SubLObject byte_order_mark_internal() {
        return unicode_strings.display_to_utf8_string((SubLObject)web_utilities.$str186$_ufeff_);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63050L)
    public static SubLObject byte_order_mark() {
        SubLObject caching_state = web_utilities.$byte_order_mark_caching_state$.getGlobalValue();
        if (web_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)web_utilities.$sym185$BYTE_ORDER_MARK, (SubLObject)web_utilities.$sym187$_BYTE_ORDER_MARK_CACHING_STATE_, (SubLObject)web_utilities.NIL, (SubLObject)web_utilities.EQL, (SubLObject)web_utilities.ZERO_INTEGER, (SubLObject)web_utilities.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)web_utilities.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(byte_order_mark_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)web_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63238L)
    public static SubLObject http_response_header(final SubLObject response_string) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)web_utilities.ZERO_INTEGER), parse_http_response(response_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63347L)
    public static SubLObject http_response_body(final SubLObject response_string) {
        return Values.nth_value_step_2(Values.nth_value_step_1((SubLObject)web_utilities.ONE_INTEGER), parse_http_response(response_string));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63454L)
    public static SubLObject parse_http_response(final SubLObject response_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject body_position = Sequences.search(web_utilities.$http_header_delimiter$.getDynamicValue(thread), response_string, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        final SubLObject header = (SubLObject)(body_position.isInteger() ? Sequences.subseq(response_string, (SubLObject)web_utilities.ZERO_INTEGER, body_position) : web_utilities.NIL);
        final SubLObject body = body_position.isInteger() ? Sequences.subseq(response_string, Numbers.add(body_position, Sequences.length(web_utilities.$http_header_delimiter$.getDynamicValue(thread))), (SubLObject)web_utilities.UNPROVIDED) : response_string;
        return Values.values(header, string_utilities.pre_remove(body, byte_order_mark(), (SubLObject)web_utilities.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 63891L)
    public static SubLObject http_format_query(final SubLObject query) {
        return PrintLow.format((SubLObject)web_utilities.NIL, (SubLObject)web_utilities.$str188$___A__A_____, Mapping.mapcar((SubLObject)web_utilities.$sym189$HTML_ENCODE_SEXPR, Functions.apply(Symbols.symbol_function((SubLObject)web_utilities.$sym190$APPEND), query)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64048L)
    public static SubLObject html_encode_sexpr(final SubLObject sexpr) {
        return html_url_encode(format_nil.format_nil_a(sexpr), (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64134L)
    public static SubLObject http_retrieve(final SubLObject query, final SubLObject path, final SubLObject host, final SubLObject port, SubLObject method, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (method == web_utilities.UNPROVIDED) {
            method = (SubLObject)web_utilities.$kw54$POST;
        }
        if (max_chars == web_utilities.UNPROVIDED) {
            max_chars = (SubLObject)web_utilities.NIL;
        }
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        if (follow_redirectsP == web_utilities.UNPROVIDED) {
            follow_redirectsP = (SubLObject)web_utilities.NIL;
        }
        if (timeout == web_utilities.UNPROVIDED) {
            timeout = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject query_string = (SubLObject)web_utilities.NIL;
        SubLObject reply = (SubLObject)web_utilities.NIL;
        if (query.isString()) {
            query_string = query;
        }
        else {
            query_string = http_format_query(query);
        }
        final SubLObject real_port = (SubLObject)(port.eql((SubLObject)web_utilities.$kw8$DEFAULT) ? web_utilities.$int19$80 : port);
        SubLObject channel = (SubLObject)web_utilities.NIL;
        try {
            channel = subl_promotions.open_tcp_stream_with_timeout(host, real_port, timeout, (SubLObject)web_utilities.$kw22$PRIVATE);
            if (web_utilities.NIL != subl_macro_promotions.validate_tcp_connection(channel, host, real_port)) {
                send_http_request(channel, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw25$MACHINE, host, web_utilities.$kw7$PORT, port, web_utilities.$kw5$METHOD, method, web_utilities.$kw26$URL, path, web_utilities.$kw4$QUERY, query_string, web_utilities.$kw9$KEEP_ALIVE_, web_utilities.NIL, web_utilities.$kw10$WIDE_NEWLINES_, web_utilities.T, web_utilities.$kw12$ACCEPT_TYPES, accept_types, web_utilities.$kw13$CONTENT_TYPE, web_utilities.$kw8$DEFAULT, web_utilities.$kw14$SOAP_ACTION_URI, web_utilities.NIL }));
                reply = slack_read_until_eof(channel, max_chars);
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (web_utilities.NIL != channel) {
                    streams_high.close(channel, (SubLObject)web_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        thread.resetMultipleValues();
        final SubLObject header = parse_http_response(reply);
        final SubLObject body = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (web_utilities.NIL != follow_redirectsP && web_utilities.NIL != html_redirection_header_p(header)) {
            return http_retrieve_via_redirection(header, max_chars, accept_types);
        }
        return body;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 64979L)
    public static SubLObject http_retrieve_via_redirection(final SubLObject header, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == web_utilities.UNPROVIDED) {
            max_chars = (SubLObject)web_utilities.NIL;
        }
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject fields = string_utilities.string_tokenize(header, web_utilities.$http_header_field_delimiters$.getDynamicValue(thread), (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        SubLObject new_url = (SubLObject)web_utilities.NIL;
        if (web_utilities.NIL == new_url) {
            SubLObject csome_list_var = fields;
            SubLObject field = (SubLObject)web_utilities.NIL;
            field = csome_list_var.first();
            while (web_utilities.NIL == new_url && web_utilities.NIL != csome_list_var) {
                if (web_utilities.NIL != string_utilities.starts_with_by_test(field, (SubLObject)web_utilities.$str132$Location__, Symbols.symbol_function((SubLObject)web_utilities.EQUALP))) {
                    new_url = string_utilities.pre_remove(field, (SubLObject)web_utilities.$str132$Location__, Symbols.symbol_function((SubLObject)web_utilities.EQUALP));
                }
                csome_list_var = csome_list_var.rest();
                field = csome_list_var.first();
            }
        }
        return (web_utilities.NIL != new_url) ? dereference_url(new_url, max_chars, accept_types, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED) : string_utilities.$empty_string$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 65480L)
    public static SubLObject get_html_source_from_url(final SubLObject url, SubLObject max_chars, SubLObject accept_types) {
        if (max_chars == web_utilities.UNPROVIDED) {
            max_chars = (SubLObject)web_utilities.NIL;
        }
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$list191;
        }
        return dereference_url(url, max_chars, accept_types, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 65699L)
    public static SubLObject dereference_url(SubLObject url, SubLObject max_chars, SubLObject accept_types, SubLObject follow_redirectsP, SubLObject timeout) {
        if (max_chars == web_utilities.UNPROVIDED) {
            max_chars = (SubLObject)web_utilities.NIL;
        }
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        if (follow_redirectsP == web_utilities.UNPROVIDED) {
            follow_redirectsP = (SubLObject)web_utilities.NIL;
        }
        if (timeout == web_utilities.UNPROVIDED) {
            timeout = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject source = (SubLObject)web_utilities.NIL;
        if (web_utilities.NIL == url_p(url)) {
            url = Sequences.cconcatenate((SubLObject)web_utilities.$str134$http___, url);
        }
        if (web_utilities.NIL != string_utilities.starts_with(Strings.string_downcase(url, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED), (SubLObject)web_utilities.$str134$http___) || web_utilities.NIL != string_utilities.starts_with(Strings.string_downcase(url, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED), (SubLObject)web_utilities.$str135$https___)) {
            thread.resetMultipleValues();
            SubLObject machine = parse_http_url(url);
            final SubLObject port = thread.secondMultipleValue();
            SubLObject path = thread.thirdMultipleValue();
            final SubLObject query = thread.fourthMultipleValue();
            thread.resetMultipleValues();
            if (web_utilities.NIL == machine) {
                machine = url;
            }
            if (web_utilities.NIL == path) {
                path = (SubLObject)web_utilities.$str29$_;
            }
            source = http_retrieve(query, path, machine, port, (SubLObject)web_utilities.$kw6$GET, max_chars, accept_types, follow_redirectsP, timeout);
        }
        else if (web_utilities.NIL != string_utilities.starts_with(Strings.string_downcase(url, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED), (SubLObject)web_utilities.$str192$file___)) {
            final SubLObject path2 = string_utilities.pre_remove(url, (SubLObject)web_utilities.$str192$file___, Symbols.symbol_function((SubLObject)web_utilities.EQUALP));
            assert web_utilities.NIL != file_utilities.file_existsP(path2) : path2;
            source = string_utilities.read_string_from_file(path2, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
        }
        return source;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 66510L)
    public static SubLObject save_url_to_file(final SubLObject url, final SubLObject filepath, SubLObject accept_types, SubLObject follow_redirectsP) {
        if (accept_types == web_utilities.UNPROVIDED) {
            accept_types = (SubLObject)web_utilities.$kw8$DEFAULT;
        }
        if (follow_redirectsP == web_utilities.UNPROVIDED) {
            follow_redirectsP = (SubLObject)web_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error_message = (SubLObject)web_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)web_utilities.$sym140$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject source = dereference_url(url, (SubLObject)web_utilities.NIL, accept_types, follow_redirectsP, (SubLObject)web_utilities.UNPROVIDED);
                    SubLObject stream = (SubLObject)web_utilities.NIL;
                    try {
                        stream = compatibility.open_text(filepath, (SubLObject)web_utilities.$kw194$OUTPUT);
                        if (!stream.isStream()) {
                            Errors.error((SubLObject)web_utilities.$str173$Unable_to_open__S, filepath);
                        }
                        final SubLObject out = stream;
                        print_high.princ(source, out);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            if (stream.isStream()) {
                                streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                            }
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)web_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return error_message;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 66891L)
    public static SubLObject servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return Numbers.add(system_parameters.$base_tcp_port$.getDynamicValue(thread), system_parameters.$servlet_port_offset$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67291L)
    public static SubLObject effective_servlet_container_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_utilities.NIL != local_servlet_container_runningP()) {
            return servlet_container_port();
        }
        return web_utilities.$alternate_servlet_container_port$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 67753L)
    public static SubLObject effective_servlet_container_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_utilities.NIL != local_servlet_container_runningP()) {
            return misc_utilities.hostname();
        }
        return web_utilities.$alternate_servlet_container_host$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68350L)
    public static SubLObject local_servlet_container_runningP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return web_utilities.$local_servlet_container_runningP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
    public static SubLObject restart_servlet_container(SubLObject port) {
        if (port == web_utilities.UNPROVIDED) {
            port = servlet_container_port();
        }
        stop_servlet_container();
        return start_servlet_container(port);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
    public static SubLObject start_servlet_container(SubLObject port) {
        if (port == web_utilities.UNPROVIDED) {
            port = servlet_container_port();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = (SubLObject)web_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)web_utilities.$sym140$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject war_files = get_war_file_descriptions();
                    final SubLObject ret_value = Functions.funcall((SubLObject)web_utilities.$sym195$START_SERVLET_CONTAINER_INT, port, war_files, servlet_container_tmp_dir_string());
                    web_utilities.$local_servlet_container_runningP$.setDynamicValue((SubLObject)web_utilities.T, thread);
                    return ret_value;
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)web_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (web_utilities.NIL != err) {
            Errors.warn(err);
        }
        return port;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
    public static SubLObject stop_servlet_container() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err = (SubLObject)web_utilities.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)web_utilities.$sym140$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Functions.funcall((SubLObject)web_utilities.$sym200$STOP_SERVLET_CONTAINER_INT, servlet_container_tmp_dir_string());
                    web_utilities.$local_servlet_container_runningP$.setDynamicValue((SubLObject)web_utilities.NIL, thread);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)web_utilities.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (web_utilities.NIL != err) {
            Errors.warn(err);
        }
        return (SubLObject)web_utilities.$kw201$STOPPED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
    public static SubLObject servlet_container_tmp_dir_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_utilities.possibly_append_path_separator_char(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(file_utilities.temp_directory()), new SubLObject[] { web_utilities.$str202$cyc_servlet_container_tmp_dir_, format_nil.format_nil_a_no_copy(Environment.get_user_name((SubLObject)web_utilities.UNPROVIDED)), web_utilities.$str203$_, format_nil.format_nil_a_no_copy(system_parameters.$base_tcp_port$.getDynamicValue(thread)) }));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/web-utilities.lisp", position = 68446L)
    public static SubLObject get_war_file_descriptions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (web_utilities.NIL != Filesys.probe_file(web_utilities.$webapp_manifest_path$.getGlobalValue())) {
            SubLObject stream = (SubLObject)web_utilities.NIL;
            try {
                final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                try {
                    stream_macros.$stream_requires_locking$.bind((SubLObject)web_utilities.NIL, thread);
                    stream = compatibility.open_text(web_utilities.$webapp_manifest_path$.getGlobalValue(), (SubLObject)web_utilities.$kw172$INPUT);
                }
                finally {
                    stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                }
                if (!stream.isStream()) {
                    Errors.error((SubLObject)web_utilities.$str173$Unable_to_open__S, web_utilities.$webapp_manifest_path$.getGlobalValue());
                }
                final SubLObject in = stream;
                SubLObject tokens = xml_parsing_utilities.xml_tokenize(in, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED, (SubLObject)web_utilities.UNPROVIDED);
                SubLObject webapps = (SubLObject)web_utilities.NIL;
                SubLObject wars = (SubLObject)web_utilities.NIL;
                while (web_utilities.NIL != tokens && web_utilities.NIL == list_utilities.proper_list_p(webapps)) {
                    thread.resetMultipleValues();
                    final SubLObject webapps_$12 = xml_parsing_utilities.xml_tokens_to_sexpr(tokens);
                    final SubLObject tokens_$13 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    webapps = webapps_$12;
                    tokens = tokens_$13;
                }
                SubLObject cdolist_list_var = xml_parsing_utilities.xml_sexpr_daughters(webapps, (SubLObject)web_utilities.$str207$webapp);
                SubLObject webapp = (SubLObject)web_utilities.NIL;
                webapp = cdolist_list_var.first();
                while (web_utilities.NIL != cdolist_list_var) {
                    final SubLObject warfile = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, (SubLObject)web_utilities.$str205$filename));
                    final SubLObject v_context = xml_parsing_utilities.xml_sexpr_value(xml_parsing_utilities.xml_sexpr_daughter(webapp, (SubLObject)web_utilities.$str206$contextRoot));
                    wars = (SubLObject)ConsesLow.cons(reader.bq_cons(warfile, v_context), wars);
                    cdolist_list_var = cdolist_list_var.rest();
                    webapp = cdolist_list_var.first();
                }
                return wars;
            }
            finally {
                final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)web_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    if (stream.isStream()) {
                        streams_high.close(stream, (SubLObject)web_utilities.UNPROVIDED);
                    }
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                }
            }
        }
        Errors.warn((SubLObject)web_utilities.$str208$Unable_to_find_webapp_manifest_fi, web_utilities.$webapp_manifest_path$.getGlobalValue());
        return (SubLObject)web_utilities.NIL;
    }
    
    public static SubLObject declare_web_utilities_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "with_http_request", "WITH-HTTP-REQUEST");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "make_html_cyc_login_session", "MAKE-HTML-CYC-LOGIN-SESSION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "destroy_cyc_login_session", "DESTROY-CYC-LOGIN-SESSION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "cyc_login_session_id_machine_name", "CYC-LOGIN-SESSION-ID-MACHINE-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "valid_html_cyc_login_session_idP", "VALID-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "current_html_cyc_login_session_idP", "CURRENT-HTML-CYC-LOGIN-SESSION-ID?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_possibly_repack_request", "HTTP-POSSIBLY-REPACK-REQUEST", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "within_html_cyc_login_sessionP", "WITHIN-HTML-CYC-LOGIN-SESSION?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "possibly_add_html_javascript_redirect_when_top_level_page", "POSSIBLY-ADD-HTML-JAVASCRIPT-REDIRECT-WHEN-TOP-LEVEL-PAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "test_http_request", "TEST-HTTP-REQUEST", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "http_with_cookies", "HTTP-WITH-COOKIES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_generic_request", "HTTP-SEND-GENERIC-REQUEST", 11, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_put_request", "HTTP-SEND-PUT-REQUEST", 7, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_delete_request", "HTTP-SEND-DELETE-REQUEST", 7, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false);
        new $html_url_expand_char$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_url_decode", "HTML-URL-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "decode_url_percent_encoded_char", "DECODE-URL-PERCENT-ENCODED-CHAR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "uri_p", "URI-P", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "url_p", "URL-P", 1, 0, false);
        new $url_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "url_host", "URL-HOST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "find_url_end", "FIND-URL-END", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "clear_soap_name", "CLEAR-SOAP-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "remove_soap_name", "REMOVE-SOAP-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "soap_name_internal", "SOAP-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "soap_name", "SOAP-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "clear_soap_expanded_name", "CLEAR-SOAP-EXPANDED-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "remove_soap_expanded_name", "REMOVE-SOAP-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "soap_expanded_name_internal", "SOAP-EXPANDED-NAME-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "soap_expanded_name", "SOAP-EXPANDED-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "soap_envelope_sexpr_p", "SOAP-ENVELOPE-SEXPR-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "clear_perform_soap_post_cached", "CLEAR-PERFORM-SOAP-POST-CACHED", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "remove_perform_soap_post_cached", "REMOVE-PERFORM-SOAP-POST-CACHED", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "perform_soap_post_cached_internal", "PERFORM-SOAP-POST-CACHED-INTERNAL", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "perform_soap_post_cached", "PERFORM-SOAP-POST-CACHED", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "perform_soap_post", "PERFORM-SOAP-POST", 4, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "make_soap_message", "MAKE-SOAP-MESSAGE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_while", "READ-WHILE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_until_char_unless", "READ-UNTIL-CHAR-UNLESS", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "try_error_message", "TRY-ERROR-MESSAGE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_date_string", "HTTP-DATE-STRING", 0, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_tokens_step", "HTML-TOKENS-STEP");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.web_utilities", "html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_assocation_list_to_url_parameters", "HTML-ASSOCATION-LIST-TO-URL-PARAMETERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "matching_open_tagP", "MATCHING-OPEN-TAG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "matching_close_tagP", "MATCHING-CLOSE-TAG?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_retrieve", "HTTP-RETRIEVE", 4, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "dereference_url", "DEREFERENCE-URL", 1, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "servlet_container_port", "SERVLET-CONTAINER-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "effective_servlet_container_port", "EFFECTIVE-SERVLET-CONTAINER-PORT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "effective_servlet_container_host", "EFFECTIVE-SERVLET-CONTAINER-HOST", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "local_servlet_container_runningP", "LOCAL-SERVLET-CONTAINER-RUNNING?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "restart_servlet_container", "RESTART-SERVLET-CONTAINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "start_servlet_container", "START-SERVLET-CONTAINER", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "stop_servlet_container", "STOP-SERVLET-CONTAINER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "servlet_container_tmp_dir_string", "SERVLET-CONTAINER-TMP-DIR-STRING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.web_utilities", "get_war_file_descriptions", "GET-WAR-FILE-DESCRIPTIONS", 0, 0, false);
        return (SubLObject)web_utilities.NIL;
    }
    
    public static SubLObject init_web_utilities_file() {
        web_utilities.$http_default_accept_types$ = SubLFiles.deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", (SubLObject)web_utilities.$list0);
        web_utilities.$decode_urls_during_http_read_request$ = SubLFiles.deflexical("*DECODE-URLS-DURING-HTTP-READ-REQUEST*", (SubLObject)web_utilities.NIL);
        web_utilities.$http_alternate_uri_format_a_prefix$ = SubLFiles.deflexical("*HTTP-ALTERNATE-URI-FORMAT-A-PREFIX*", (SubLObject)web_utilities.$str27$_a_);
        web_utilities.$html_alternate_uri_format_session_id_length$ = SubLFiles.deflexical("*HTML-ALTERNATE-URI-FORMAT-SESSION-ID-LENGTH*", (SubLObject)web_utilities.FIVE_INTEGER);
        web_utilities.$html_cyc_login_session_string_to_remote_host$ = SubLFiles.deflexical("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*", maybeDefault((SubLObject)web_utilities.$sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_, web_utilities.$html_cyc_login_session_string_to_remote_host$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)web_utilities.EQUAL), (SubLObject)web_utilities.UNPROVIDED))));
        web_utilities.$html_possibly_redirect_to_portal_script$ = SubLFiles.deflexical("*HTML-POSSIBLY-REDIRECT-TO-PORTAL-SCRIPT*", (SubLObject)web_utilities.$str33$var_KEA_port_from_cyc_base_port__);
        web_utilities.$http_informational_codes$ = SubLFiles.deflexical("*HTTP-INFORMATIONAL-CODES*", (SubLObject)web_utilities.$list34);
        web_utilities.$http_success_codes$ = SubLFiles.deflexical("*HTTP-SUCCESS-CODES*", (SubLObject)web_utilities.$list35);
        web_utilities.$http_redirection_codes$ = SubLFiles.deflexical("*HTTP-REDIRECTION-CODES*", (SubLObject)web_utilities.$list36);
        web_utilities.$http_client_error_codes$ = SubLFiles.deflexical("*HTTP-CLIENT-ERROR-CODES*", (SubLObject)web_utilities.$list37);
        web_utilities.$http_server_error_codes$ = SubLFiles.deflexical("*HTTP-SERVER-ERROR-CODES*", (SubLObject)web_utilities.$list38);
        web_utilities.$http_error_codes$ = SubLFiles.deflexical("*HTTP-ERROR-CODES*", ConsesLow.append(web_utilities.$http_client_error_codes$.getGlobalValue(), web_utilities.$http_server_error_codes$.getGlobalValue()));
        web_utilities.$http_status_codes$ = SubLFiles.deflexical("*HTTP-STATUS-CODES*", ConsesLow.append(new SubLObject[] { web_utilities.$http_informational_codes$.getGlobalValue(), web_utilities.$http_success_codes$.getGlobalValue(), web_utilities.$http_redirection_codes$.getGlobalValue(), web_utilities.$http_client_error_codes$.getGlobalValue(), web_utilities.$http_success_codes$.getGlobalValue() }));
        web_utilities.$http_get_request_template_components$ = SubLFiles.deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", (SubLObject)web_utilities.$list41);
        web_utilities.$http_get_request_template_order$ = SubLFiles.deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar((SubLObject)web_utilities.$sym42$FIRST, web_utilities.$http_get_request_template_components$.getGlobalValue()));
        web_utilities.$http_post_default_content_type$ = SubLFiles.deflexical("*HTTP-POST-DEFAULT-CONTENT-TYPE*", (SubLObject)web_utilities.$str43$application_x_www_form_urlencoded);
        web_utilities.$http_post_request_template_components$ = SubLFiles.deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", (SubLObject)web_utilities.$list44);
        web_utilities.$http_post_request_template_order$ = SubLFiles.deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar((SubLObject)web_utilities.$sym42$FIRST, web_utilities.$http_post_request_template_components$.getGlobalValue()));
        web_utilities.$http_put_default_content_type$ = SubLFiles.deflexical("*HTTP-PUT-DEFAULT-CONTENT-TYPE*", (SubLObject)web_utilities.$str43$application_x_www_form_urlencoded);
        web_utilities.$http_put_request_template_components$ = SubLFiles.deflexical("*HTTP-PUT-REQUEST-TEMPLATE-COMPONENTS*", (SubLObject)web_utilities.$list45);
        web_utilities.$http_put_request_template_order$ = SubLFiles.deflexical("*HTTP-PUT-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar((SubLObject)web_utilities.$sym42$FIRST, web_utilities.$http_put_request_template_components$.getGlobalValue()));
        web_utilities.$http_delete_default_content_type$ = SubLFiles.deflexical("*HTTP-DELETE-DEFAULT-CONTENT-TYPE*", (SubLObject)web_utilities.$str43$application_x_www_form_urlencoded);
        web_utilities.$http_delete_request_template_components$ = SubLFiles.deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-COMPONENTS*", (SubLObject)web_utilities.$list46);
        web_utilities.$http_delete_request_template_order$ = SubLFiles.deflexical("*HTTP-DELETE-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar((SubLObject)web_utilities.$sym42$FIRST, web_utilities.$http_delete_request_template_components$.getGlobalValue()));
        web_utilities.$trace_http_send_post_requests$ = SubLFiles.defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", (SubLObject)web_utilities.NIL);
        web_utilities.$trace_http_send_put_requests$ = SubLFiles.defparameter("*TRACE-HTTP-SEND-PUT-REQUESTS*", (SubLObject)web_utilities.NIL);
        web_utilities.$trace_http_send_delete_requests$ = SubLFiles.defparameter("*TRACE-HTTP-SEND-DELETE-REQUESTS*", (SubLObject)web_utilities.NIL);
        web_utilities.$http_cookies_to_include_in_requests$ = SubLFiles.defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", (SubLObject)web_utilities.NIL);
        web_utilities.$http_header_cookie_keyword$ = SubLFiles.deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", (SubLObject)web_utilities.$str81$Set_Cookie_);
        web_utilities.$http_cookie_separation_charset$ = SubLFiles.deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", (SubLObject)ConsesLow.list((SubLObject)Characters.CHAR_semicolon));
        web_utilities.$http_filtered_predefined_named_cookie_attributes$ = SubLFiles.deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", (SubLObject)ConsesLow.list((SubLObject)web_utilities.$str83$domain, (SubLObject)web_utilities.$str84$expires, (SubLObject)web_utilities.$str85$max_age));
        web_utilities.$official_uri_schemes$ = SubLFiles.deflexical("*OFFICIAL-URI-SCHEMES*", (SubLObject)web_utilities.$list98);
        web_utilities.$unofficial_uri_schemes$ = SubLFiles.deflexical("*UNOFFICIAL-URI-SCHEMES*", (SubLObject)web_utilities.$list99);
        web_utilities.$valid_url_beginnings$ = SubLFiles.defconstant("*VALID-URL-BEGINNINGS*", (SubLObject)web_utilities.$list100);
        web_utilities.$url_delimiters$ = SubLFiles.defconstant("*URL-DELIMITERS*", (SubLObject)web_utilities.$list101);
        web_utilities.$valid_non_alphanumeric_url_chars$ = SubLFiles.deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", (SubLObject)web_utilities.$str103$_____________________);
        web_utilities.$soap_envelope_uri$ = SubLFiles.deflexical("*SOAP-ENVELOPE-URI*", (SubLObject)web_utilities.$str114$http___schemas_xmlsoap_org_soap_e);
        web_utilities.$soap_name_caching_state$ = SubLFiles.deflexical("*SOAP-NAME-CACHING-STATE*", (SubLObject)web_utilities.NIL);
        web_utilities.$soap_expanded_name_caching_state$ = SubLFiles.deflexical("*SOAP-EXPANDED-NAME-CACHING-STATE*", (SubLObject)web_utilities.NIL);
        web_utilities.$perform_soap_post_cached_caching_state$ = SubLFiles.deflexical("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*", (SubLObject)web_utilities.NIL);
        web_utilities.$cgi_host$ = SubLFiles.defparameter("*CGI-HOST*", (SubLObject)web_utilities.$str183$localhost);
        web_utilities.$cgi_port$ = SubLFiles.defparameter("*CGI-PORT*", (SubLObject)web_utilities.$int19$80);
        web_utilities.$cgi_path$ = SubLFiles.defparameter("*CGI-PATH*", (SubLObject)web_utilities.$str184$_cgi_bin_services);
        web_utilities.$http_header_delimiter$ = SubLFiles.defparameter("*HTTP-HEADER-DELIMITER*", Sequences.cconcatenate(format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_return), new SubLObject[] { format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_newline), format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_return), format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_newline) }));
        web_utilities.$http_header_field_delimiters$ = SubLFiles.defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", (SubLObject)ConsesLow.list(Sequences.cconcatenate(format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_return), format_nil.format_nil_a_no_copy((SubLObject)Characters.CHAR_newline)), Strings.make_string((SubLObject)web_utilities.ONE_INTEGER, (SubLObject)Characters.CHAR_newline)));
        web_utilities.$byte_order_mark_caching_state$ = SubLFiles.deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", (SubLObject)web_utilities.NIL);
        web_utilities.$alternate_servlet_container_port$ = SubLFiles.defparameter("*ALTERNATE-SERVLET-CONTAINER-PORT*", (SubLObject)web_utilities.NIL);
        web_utilities.$alternate_servlet_container_host$ = SubLFiles.defparameter("*ALTERNATE-SERVLET-CONTAINER-HOST*", (SubLObject)web_utilities.NIL);
        web_utilities.$local_servlet_container_runningP$ = SubLFiles.defparameter("*LOCAL-SERVLET-CONTAINER-RUNNING?*", (SubLObject)web_utilities.NIL);
        web_utilities.$webapp_manifest_path$ = SubLFiles.deflexical("*WEBAPP-MANIFEST-PATH*", (SubLObject)web_utilities.$str204$webapps_apps_webapp_manifest_xml);
        return (SubLObject)web_utilities.NIL;
    }
    
    public static SubLObject setup_web_utilities_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)web_utilities.$sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_);
        generic_testing.define_test_case_table_int((SubLObject)web_utilities.$sym106$RESOLVE_RELATIVE_URI, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw107$TEST, web_utilities.NIL, web_utilities.$kw108$OWNER, web_utilities.NIL, web_utilities.$kw109$CLASSES, web_utilities.NIL, web_utilities.$kw110$KB, web_utilities.$kw111$TINY, web_utilities.$kw112$WORKING_, web_utilities.T }), (SubLObject)web_utilities.$list113);
        memoization_state.note_globally_cached_function((SubLObject)web_utilities.$sym115$SOAP_NAME);
        memoization_state.note_globally_cached_function((SubLObject)web_utilities.$sym118$SOAP_EXPANDED_NAME);
        memoization_state.note_globally_cached_function((SubLObject)web_utilities.$sym121$PERFORM_SOAP_POST_CACHED);
        generic_testing.define_test_case_table_int((SubLObject)web_utilities.$sym179$MATCHING_OPEN_TAG_, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw107$TEST, web_utilities.NIL, web_utilities.$kw108$OWNER, web_utilities.NIL, web_utilities.$kw109$CLASSES, web_utilities.NIL, web_utilities.$kw110$KB, web_utilities.$kw111$TINY, web_utilities.$kw112$WORKING_, web_utilities.T }), (SubLObject)web_utilities.$list180);
        generic_testing.define_test_case_table_int((SubLObject)web_utilities.$sym181$MATCHING_CLOSE_TAG_, (SubLObject)ConsesLow.list(new SubLObject[] { web_utilities.$kw107$TEST, web_utilities.NIL, web_utilities.$kw108$OWNER, web_utilities.NIL, web_utilities.$kw109$CLASSES, web_utilities.NIL, web_utilities.$kw110$KB, web_utilities.$kw111$TINY, web_utilities.$kw112$WORKING_, web_utilities.T }), (SubLObject)web_utilities.$list182);
        memoization_state.note_globally_cached_function((SubLObject)web_utilities.$sym185$BYTE_ORDER_MARK);
        utilities_macros.note_funcall_helper_function((SubLObject)web_utilities.$sym197$START_SERVLET_CONTAINER);
        tcp_server_utilities.register_tcp_server_type((SubLObject)web_utilities.$kw198$SERVLET, (SubLObject)web_utilities.$list199, (SubLObject)web_utilities.UNPROVIDED);
        return (SubLObject)web_utilities.NIL;
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
        me = (SubLFile)new web_utilities();
        web_utilities.$http_default_accept_types$ = null;
        web_utilities.$decode_urls_during_http_read_request$ = null;
        web_utilities.$http_alternate_uri_format_a_prefix$ = null;
        web_utilities.$html_alternate_uri_format_session_id_length$ = null;
        web_utilities.$html_cyc_login_session_string_to_remote_host$ = null;
        web_utilities.$html_possibly_redirect_to_portal_script$ = null;
        web_utilities.$http_informational_codes$ = null;
        web_utilities.$http_success_codes$ = null;
        web_utilities.$http_redirection_codes$ = null;
        web_utilities.$http_client_error_codes$ = null;
        web_utilities.$http_server_error_codes$ = null;
        web_utilities.$http_error_codes$ = null;
        web_utilities.$http_status_codes$ = null;
        web_utilities.$http_get_request_template_components$ = null;
        web_utilities.$http_get_request_template_order$ = null;
        web_utilities.$http_post_default_content_type$ = null;
        web_utilities.$http_post_request_template_components$ = null;
        web_utilities.$http_post_request_template_order$ = null;
        web_utilities.$http_put_default_content_type$ = null;
        web_utilities.$http_put_request_template_components$ = null;
        web_utilities.$http_put_request_template_order$ = null;
        web_utilities.$http_delete_default_content_type$ = null;
        web_utilities.$http_delete_request_template_components$ = null;
        web_utilities.$http_delete_request_template_order$ = null;
        web_utilities.$trace_http_send_post_requests$ = null;
        web_utilities.$trace_http_send_put_requests$ = null;
        web_utilities.$trace_http_send_delete_requests$ = null;
        web_utilities.$http_cookies_to_include_in_requests$ = null;
        web_utilities.$http_header_cookie_keyword$ = null;
        web_utilities.$http_cookie_separation_charset$ = null;
        web_utilities.$http_filtered_predefined_named_cookie_attributes$ = null;
        web_utilities.$official_uri_schemes$ = null;
        web_utilities.$unofficial_uri_schemes$ = null;
        web_utilities.$valid_url_beginnings$ = null;
        web_utilities.$url_delimiters$ = null;
        web_utilities.$valid_non_alphanumeric_url_chars$ = null;
        web_utilities.$soap_envelope_uri$ = null;
        web_utilities.$soap_name_caching_state$ = null;
        web_utilities.$soap_expanded_name_caching_state$ = null;
        web_utilities.$perform_soap_post_cached_caching_state$ = null;
        web_utilities.$cgi_host$ = null;
        web_utilities.$cgi_port$ = null;
        web_utilities.$cgi_path$ = null;
        web_utilities.$http_header_delimiter$ = null;
        web_utilities.$http_header_field_delimiters$ = null;
        web_utilities.$byte_order_mark_caching_state$ = null;
        web_utilities.$alternate_servlet_container_port$ = null;
        web_utilities.$alternate_servlet_container_host$ = null;
        web_utilities.$local_servlet_container_runningP$ = null;
        web_utilities.$webapp_manifest_path$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/plain"), (SubLObject)SubLObjectFactory.makeString("text/html"));
        $list1 = ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("CHANNEL"), SubLObjectFactory.makeSymbol("MACHINE"), SubLObjectFactory.makeSymbol("URL"), SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("QUERY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("GET")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEEP-ALIVE?"), (SubLObject)web_utilities.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WIDE-NEWLINES?"), (SubLObject)web_utilities.NIL), SubLObjectFactory.makeSymbol("TIMEOUT"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), SubLObjectFactory.makeSymbol("SOAP-ACTION-URI") }), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list2 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("METHOD"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("KEEP-ALIVE?"), SubLObjectFactory.makeKeyword("WIDE-NEWLINES?"), SubLObjectFactory.makeKeyword("TIMEOUT"), SubLObjectFactory.makeKeyword("ACCEPT-TYPES"), SubLObjectFactory.makeKeyword("CONTENT-TYPE"), SubLObjectFactory.makeKeyword("SOAP-ACTION-URI") });
        $kw3$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw4$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $kw5$METHOD = SubLObjectFactory.makeKeyword("METHOD");
        $kw6$GET = SubLObjectFactory.makeKeyword("GET");
        $kw7$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw8$DEFAULT = SubLObjectFactory.makeKeyword("DEFAULT");
        $kw9$KEEP_ALIVE_ = SubLObjectFactory.makeKeyword("KEEP-ALIVE?");
        $kw10$WIDE_NEWLINES_ = SubLObjectFactory.makeKeyword("WIDE-NEWLINES?");
        $kw11$TIMEOUT = SubLObjectFactory.makeKeyword("TIMEOUT");
        $kw12$ACCEPT_TYPES = SubLObjectFactory.makeKeyword("ACCEPT-TYPES");
        $kw13$CONTENT_TYPE = SubLObjectFactory.makeKeyword("CONTENT-TYPE");
        $kw14$SOAP_ACTION_URI = SubLObjectFactory.makeKeyword("SOAP-ACTION-URI");
        $sym15$REAL_PORT = SubLObjectFactory.makeUninternedSymbol("REAL-PORT");
        $sym16$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym17$FIF = SubLObjectFactory.makeSymbol("FIF");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DEFAULT"));
        $int19$80 = SubLObjectFactory.makeInteger(80);
        $sym20$WITH_TCP_CONNECTION = SubLObjectFactory.makeSymbol("WITH-TCP-CONNECTION");
        $kw21$ACCESS_MODE = SubLObjectFactory.makeKeyword("ACCESS-MODE");
        $kw22$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $sym23$SEND_HTTP_REQUEST = SubLObjectFactory.makeSymbol("SEND-HTTP-REQUEST");
        $sym24$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw25$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw26$URL = SubLObjectFactory.makeKeyword("URL");
        $str27$_a_ = SubLObjectFactory.makeString("/a/");
        $sym28$_HTML_CYC_LOGIN_SESSION_STRING_TO_REMOTE_HOST_ = SubLObjectFactory.makeSymbol("*HTML-CYC-LOGIN-SESSION-STRING-TO-REMOTE-HOST*");
        $str29$_ = SubLObjectFactory.makeString("/");
        $str30$_cg_ = SubLObjectFactory.makeString("/cg?");
        $list31 = ConsesLow.list((SubLObject)Characters.CHAR_slash);
        $str32$Remote_Host = SubLObjectFactory.makeString("Remote-Host");
        $str33$var_KEA_port_from_cyc_base_port__ = SubLObjectFactory.makeString("var KEA_port_from_cyc_base_port = function () {\n  var DEFAULT_PORT_STR = \"80\";\n  var portStr = (window.document.location.port.length > 0) ? window.document.location.port : DEFAULT_PORT_STR;\n  var offset = parseInt(portStr.substring(portStr.length - 1));\n  var port = parseInt(portStr);\n\n  if (offset == 2) return (port + 1);\n  return port;\n}\nif (window==window.top) {\n  var url = \"http://\" + window.document.location.hostname + \":\" + KEA_port_from_cyc_base_port() + \"/?toolURL=\" + encodeURIComponent(window.location.href) + \"&sessionId=~A\";\n  window.location.href=url;\n}");
        $list34 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(100), (SubLObject)SubLObjectFactory.makeString("Continue")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(101), (SubLObject)SubLObjectFactory.makeString("Switching Protocols")));
        $list35 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(200), (SubLObject)SubLObjectFactory.makeString("OK")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(201), (SubLObject)SubLObjectFactory.makeString("Created")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(202), (SubLObject)SubLObjectFactory.makeString("Accepted")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(203), (SubLObject)SubLObjectFactory.makeString("Non-Authoritative Information")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(204), (SubLObject)SubLObjectFactory.makeString("No Content")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(205), (SubLObject)SubLObjectFactory.makeString("Reset Content")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(206), (SubLObject)SubLObjectFactory.makeString("Partial Content")));
        $list36 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(300), (SubLObject)SubLObjectFactory.makeString("Multiple Choices")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(301), (SubLObject)SubLObjectFactory.makeString("Moved Permanently")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(302), (SubLObject)SubLObjectFactory.makeString("Found")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(303), (SubLObject)SubLObjectFactory.makeString("See Other")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(304), (SubLObject)SubLObjectFactory.makeString("Not Modified")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(305), (SubLObject)SubLObjectFactory.makeString("Use Proxy")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(306), (SubLObject)SubLObjectFactory.makeString("(Unused)")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(307), (SubLObject)SubLObjectFactory.makeString("Temporary Redirect")));
        $list37 = ConsesLow.list(new SubLObject[] { ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(400), (SubLObject)SubLObjectFactory.makeString("Bad Request")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(401), (SubLObject)SubLObjectFactory.makeString("Unauthorized")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(403), (SubLObject)SubLObjectFactory.makeString("Forbidden")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(404), (SubLObject)SubLObjectFactory.makeString("Not Found")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(405), (SubLObject)SubLObjectFactory.makeString("Method Not Allowed")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(406), (SubLObject)SubLObjectFactory.makeString("Not Acceptable")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(407), (SubLObject)SubLObjectFactory.makeString("Proxy Authentication Required")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(408), (SubLObject)SubLObjectFactory.makeString("Request Timeout")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(409), (SubLObject)SubLObjectFactory.makeString("Conflict")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(410), (SubLObject)SubLObjectFactory.makeString("Gone")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(411), (SubLObject)SubLObjectFactory.makeString("Length Required")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(412), (SubLObject)SubLObjectFactory.makeString("Precondition Failed")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(413), (SubLObject)SubLObjectFactory.makeString("Request Entity Too Large")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(414), (SubLObject)SubLObjectFactory.makeString("Request-URI Too Long")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(415), (SubLObject)SubLObjectFactory.makeString("Unsupported Media Type")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(416), (SubLObject)SubLObjectFactory.makeString("Requested Range Not Satisfiable")), ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(417), (SubLObject)SubLObjectFactory.makeString("Expectation Failed")) });
        $list38 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(500), (SubLObject)SubLObjectFactory.makeString("Internal Server Error")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(501), (SubLObject)SubLObjectFactory.makeString("Not Implemented")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(502), (SubLObject)SubLObjectFactory.makeString("Bad Gateway")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(503), (SubLObject)SubLObjectFactory.makeString("Service Unavailable")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(504), (SubLObject)SubLObjectFactory.makeString("Gateway Timeout")), (SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeInteger(505), (SubLObject)SubLObjectFactory.makeString("HTTP Version not supported")));
        $str39$HTTP_1_1_200_OK = SubLObjectFactory.makeString("HTTP/1.1 200 OK");
        $str40$HTTP_1_1_ = SubLObjectFactory.makeString("HTTP/1.1 ");
        $list41 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERSION"), (SubLObject)SubLObjectFactory.makeString("GET ~A HTTP/1.0")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeString("Connection: ~A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-AGENT"), (SubLObject)SubLObjectFactory.makeString("User-Agent: Cyc/~A/~A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeString("Host: ~A~A")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCEPT"), (SubLObject)SubLObjectFactory.makeString("Accept: ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLANK-LINE"), (SubLObject)web_utilities.NIL));
        $sym42$FIRST = SubLObjectFactory.makeSymbol("FIRST");
        $str43$application_x_www_form_urlencoded = SubLObjectFactory.makeString("application/x-www-form-urlencoded");
        $list44 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERSION"), (SubLObject)SubLObjectFactory.makeString("POST ~A HTTP/1.0")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeString("Connection: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-AGENT"), (SubLObject)SubLObjectFactory.makeString("User-Agent: Cyc/~A/~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeString("Host: ~A~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCEPT"), (SubLObject)SubLObjectFactory.makeString("Accept: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COOKIES"), (SubLObject)SubLObjectFactory.makeString("Cookie: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeString("Content-type: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOAP-ACTION"), (SubLObject)SubLObjectFactory.makeString("SOAPAction: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-LENGTH"), (SubLObject)SubLObjectFactory.makeString("Content-length: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLANK-LINE"), (SubLObject)web_utilities.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeString("~A")) });
        $list45 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERSION"), (SubLObject)SubLObjectFactory.makeString("PUT ~A HTTP/1.0")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeString("Connection: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-AGENT"), (SubLObject)SubLObjectFactory.makeString("User-Agent: Cyc/~A/~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeString("Host: ~A~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCEPT"), (SubLObject)SubLObjectFactory.makeString("Accept: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COOKIES"), (SubLObject)SubLObjectFactory.makeString("Cookie: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeString("Content-type: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOAP-ACTION"), (SubLObject)SubLObjectFactory.makeString("SOAPAction: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-LENGTH"), (SubLObject)SubLObjectFactory.makeString("Content-length: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLANK-LINE"), (SubLObject)web_utilities.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeString("~A")) });
        $list46 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VERSION"), (SubLObject)SubLObjectFactory.makeString("DELETE ~A HTTP/1.0")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONNECTION"), (SubLObject)SubLObjectFactory.makeString("Connection: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("USER-AGENT"), (SubLObject)SubLObjectFactory.makeString("User-Agent: Cyc/~A/~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("HOST"), (SubLObject)SubLObjectFactory.makeString("Host: ~A~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ACCEPT"), (SubLObject)SubLObjectFactory.makeString("Accept: ")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COOKIES"), (SubLObject)SubLObjectFactory.makeString("Cookie: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeString("Content-type: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SOAP-ACTION"), (SubLObject)SubLObjectFactory.makeString("SOAPAction: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CONTENT-LENGTH"), (SubLObject)SubLObjectFactory.makeString("Content-length: ~A")), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BLANK-LINE"), (SubLObject)web_utilities.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeString("~A")) });
        $sym47$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
        $list48 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("MACHINE"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeInteger(80)), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("GET")), SubLObjectFactory.makeSymbol("URL"), SubLObjectFactory.makeSymbol("QUERY"), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEEP-ALIVE?"), (SubLObject)web_utilities.T), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WIDE-NEWLINES?"), (SubLObject)web_utilities.NIL), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONTENT-TYPE"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SOAP-ACTION-URI"), (SubLObject)web_utilities.NIL) });
        $list49 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("MACHINE"), SubLObjectFactory.makeKeyword("PORT"), SubLObjectFactory.makeKeyword("METHOD"), SubLObjectFactory.makeKeyword("URL"), SubLObjectFactory.makeKeyword("QUERY"), SubLObjectFactory.makeKeyword("KEEP-ALIVE?"), SubLObjectFactory.makeKeyword("WIDE-NEWLINES?"), SubLObjectFactory.makeKeyword("ACCEPT-TYPES"), SubLObjectFactory.makeKeyword("CONTENT-TYPE"), SubLObjectFactory.makeKeyword("SOAP-ACTION-URI") });
        $sym50$KEYWORDP = SubLObjectFactory.makeSymbol("KEYWORDP");
        $sym51$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym52$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym53$NON_DOTTED_LIST_P = SubLObjectFactory.makeSymbol("NON-DOTTED-LIST-P");
        $kw54$POST = SubLObjectFactory.makeKeyword("POST");
        $kw55$PUT = SubLObjectFactory.makeKeyword("PUT");
        $kw56$DELETE = SubLObjectFactory.makeKeyword("DELETE");
        $str57$Unsupported_HTTP_request_method__ = SubLObjectFactory.makeString("Unsupported HTTP request method : ~S");
        $list58 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("QUERY"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("GET")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEEP-ALIVE?"), (SubLObject)web_utilities.T), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("WIDE-NEWLINES?"), (SubLObject)web_utilities.NIL), (SubLObject)SubLObjectFactory.makeSymbol("TIMEOUT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACCEPT-TYPES"), (SubLObject)SubLObjectFactory.makeKeyword("DEFAULT")));
        $list59 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUERY"), (SubLObject)SubLObjectFactory.makeKeyword("METHOD"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("KEEP-ALIVE?"), (SubLObject)SubLObjectFactory.makeKeyword("WIDE-NEWLINES?"), (SubLObject)SubLObjectFactory.makeKeyword("TIMEOUT"), (SubLObject)SubLObjectFactory.makeKeyword("ACCEPT-TYPES"));
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("COOKIE-LIST")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym61$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_ = SubLObjectFactory.makeSymbol("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*");
        $list62 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ACTION"), (SubLObject)SubLObjectFactory.makeSymbol("FORMAT-STRING"));
        $kw63$VERSION = SubLObjectFactory.makeKeyword("VERSION");
        $kw64$ACCEPT = SubLObjectFactory.makeKeyword("ACCEPT");
        $kw65$CONNECTION = SubLObjectFactory.makeKeyword("CONNECTION");
        $str66$Keep_Alive___S = SubLObjectFactory.makeString("Keep-Alive: ~S");
        $str67$keep_alive = SubLObjectFactory.makeString("keep-alive");
        $str68$close = SubLObjectFactory.makeString("close");
        $kw69$USER_AGENT = SubLObjectFactory.makeKeyword("USER-AGENT");
        $kw70$HOST = SubLObjectFactory.makeKeyword("HOST");
        $str71$_ = SubLObjectFactory.makeString(":");
        $kw72$BLANK_LINE = SubLObjectFactory.makeKeyword("BLANK-LINE");
        $kw73$COOKIES = SubLObjectFactory.makeKeyword("COOKIES");
        $kw74$CONTENT_LENGTH = SubLObjectFactory.makeKeyword("CONTENT-LENGTH");
        $kw75$SOAP_ACTION = SubLObjectFactory.makeKeyword("SOAP-ACTION");
        $str76$__ = SubLObjectFactory.makeString(", ");
        $str77$_ = SubLObjectFactory.makeString("?");
        $str78$Date__ = SubLObjectFactory.makeString("Date: ");
        $str79$Server__Cyc_ = SubLObjectFactory.makeString("Server: Cyc/");
        $str80$__ = SubLObjectFactory.makeString(": ");
        $str81$Set_Cookie_ = SubLObjectFactory.makeString("Set-Cookie:");
        $sym82$CHAR_ = SubLObjectFactory.makeSymbol("CHAR=");
        $str83$domain = SubLObjectFactory.makeString("domain");
        $str84$expires = SubLObjectFactory.makeString("expires");
        $str85$max_age = SubLObjectFactory.makeString("max-age");
        $str86$ = SubLObjectFactory.makeString("");
        $str87$__ = SubLObjectFactory.makeString(" $");
        $sym88$EMPTY_STRING_P = SubLObjectFactory.makeSymbol("EMPTY-STRING-P");
        $sym89$TRIM_WHITESPACE = SubLObjectFactory.makeSymbol("TRIM-WHITESPACE");
        $sym90$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS = SubLObjectFactory.makeSymbol("HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS");
        $sym91$HTML_URL_EXPAND_CHAR = SubLObjectFactory.makeSymbol("HTML-URL-EXPAND-CHAR");
        $str92$____ = SubLObjectFactory.makeString("-_.=");
        $int93$256 = SubLObjectFactory.makeInteger(256);
        $str94$_S = SubLObjectFactory.makeString("~S");
        $str95$mailto_ = SubLObjectFactory.makeString("mailto:");
        $list96 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString(":"), (SubLObject)SubLObjectFactory.makeString("/"));
        $sym97$NON_EMPTY_STRING_P = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING-P");
        $list98 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("aaa:"), SubLObjectFactory.makeString("aaas:"), SubLObjectFactory.makeString("acap:"), SubLObjectFactory.makeString("cap:"), SubLObjectFactory.makeString("cid:"), SubLObjectFactory.makeString("crid:"), SubLObjectFactory.makeString("data:"), SubLObjectFactory.makeString("dav:"), SubLObjectFactory.makeString("dict:"), SubLObjectFactory.makeString("dns:"), SubLObjectFactory.makeString("fax:"), SubLObjectFactory.makeString("file:"), SubLObjectFactory.makeString("ftp:"), SubLObjectFactory.makeString("go:"), SubLObjectFactory.makeString("gopher:"), SubLObjectFactory.makeString("h323:"), SubLObjectFactory.makeString("http:"), SubLObjectFactory.makeString("https:"), SubLObjectFactory.makeString("im"), SubLObjectFactory.makeString("imap:"), SubLObjectFactory.makeString("ldap:"), SubLObjectFactory.makeString("mailto:"), SubLObjectFactory.makeString("mid:"), SubLObjectFactory.makeString("news:"), SubLObjectFactory.makeString("nfs:"), SubLObjectFactory.makeString("nntp:"), SubLObjectFactory.makeString("pop:"), SubLObjectFactory.makeString("pres:"), SubLObjectFactory.makeString("sip:"), SubLObjectFactory.makeString("sips:"), SubLObjectFactory.makeString("snmp:"), SubLObjectFactory.makeString("tel:"), SubLObjectFactory.makeString("telnet:"), SubLObjectFactory.makeString("urn:"), SubLObjectFactory.makeString("wais:"), SubLObjectFactory.makeString("xmpp:") });
        $list99 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeString("about:"), SubLObjectFactory.makeString("aim:"), SubLObjectFactory.makeString("callto:"), SubLObjectFactory.makeString("cvs:"), SubLObjectFactory.makeString("ed2k:"), SubLObjectFactory.makeString("feed:"), SubLObjectFactory.makeString("fish:"), SubLObjectFactory.makeString("gizmoproject:"), SubLObjectFactory.makeString("iax2:"), SubLObjectFactory.makeString("irc:"), SubLObjectFactory.makeString("ircs:"), SubLObjectFactory.makeString("lastfm:"), SubLObjectFactory.makeString("ldaps:"), SubLObjectFactory.makeString("magnet:"), SubLObjectFactory.makeString("mms:"), SubLObjectFactory.makeString("msnim:"), SubLObjectFactory.makeString("nsfw:"), SubLObjectFactory.makeString("psyc:"), SubLObjectFactory.makeString("rsync:"), SubLObjectFactory.makeString("secondlife:"), SubLObjectFactory.makeString("skype:"), SubLObjectFactory.makeString("ssh:"), SubLObjectFactory.makeString("sftp:"), SubLObjectFactory.makeString("smb:"), SubLObjectFactory.makeString("sms:"), SubLObjectFactory.makeString("soldat:"), SubLObjectFactory.makeString("steam:"), SubLObjectFactory.makeString("tag:"), SubLObjectFactory.makeString("unreal:"), SubLObjectFactory.makeString("ut2004:"), SubLObjectFactory.makeString("webcal:"), SubLObjectFactory.makeString("xfire:"), SubLObjectFactory.makeString("ymsgr:") });
        $list100 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://"), (SubLObject)SubLObjectFactory.makeString("https://"), (SubLObject)SubLObjectFactory.makeString("ftp://"), (SubLObject)SubLObjectFactory.makeString("gopher://"), (SubLObject)SubLObjectFactory.makeString("file:"), (SubLObject)SubLObjectFactory.makeString("news:"), (SubLObject)SubLObjectFactory.makeString("mailto:"), (SubLObject)SubLObjectFactory.makeString("anon:"));
        $list101 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_period, (SubLObject)Characters.CHAR_comma, (SubLObject)Characters.CHAR_question, (SubLObject)Characters.CHAR_exclamation, (SubLObject)Characters.CHAR_rparen);
        $sym102$VALID_URL_CHAR_P = SubLObjectFactory.makeSymbol("VALID-URL-CHAR-P");
        $str103$_____________________ = SubLObjectFactory.makeString(";@?%/:=$-_.+!*'(),#&~");
        $str104$___ = SubLObjectFactory.makeString("../");
        $str105$__ = SubLObjectFactory.makeString("//");
        $sym106$RESOLVE_RELATIVE_URI = SubLObjectFactory.makeSymbol("RESOLVE-RELATIVE-URI");
        $kw107$TEST = SubLObjectFactory.makeKeyword("TEST");
        $kw108$OWNER = SubLObjectFactory.makeKeyword("OWNER");
        $kw109$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
        $kw110$KB = SubLObjectFactory.makeKeyword("KB");
        $kw111$TINY = SubLObjectFactory.makeKeyword("TINY");
        $kw112$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
        $list113 = ConsesLow.list(new SubLObject[] { ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org"), (SubLObject)SubLObjectFactory.makeString("relfile")), (SubLObject)SubLObjectFactory.makeString("http://example.org/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org#"), (SubLObject)SubLObjectFactory.makeString("prop")), (SubLObject)SubLObjectFactory.makeString("http://example.org#prop")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/"), (SubLObject)SubLObjectFactory.makeString("named")), (SubLObject)SubLObjectFactory.makeString("http://example.org/named")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/#"), (SubLObject)SubLObjectFactory.makeString("owes")), (SubLObject)SubLObjectFactory.makeString("http://example.org/#owes")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("relfile")), (SubLObject)SubLObjectFactory.makeString("http://example.org/dir/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("../relfile")), (SubLObject)SubLObjectFactory.makeString("http://example.org/relfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("/absfile")), (SubLObject)SubLObjectFactory.makeString("http://example.org/absfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("//another.example.org/absfile")), (SubLObject)SubLObjectFactory.makeString("http://another.example.org/absfile")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("#foo")), (SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file#foo")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file"), (SubLObject)SubLObjectFactory.makeString("")), (SubLObject)SubLObjectFactory.makeString("http://example.org/dir/file")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://foo/"), (SubLObject)SubLObjectFactory.makeString("Bar")), (SubLObject)SubLObjectFactory.makeString("http://foo/Bar")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://my.example.org/"), (SubLObject)SubLObjectFactory.makeString("Name")), (SubLObject)SubLObjectFactory.makeString("http://my.example.org/Name")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://purl.org/metadata/dublin_core#"), (SubLObject)SubLObjectFactory.makeString("Creator")), (SubLObject)SubLObjectFactory.makeString("http://purl.org/metadata/dublin_core#Creator")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://purl.org/metadata/dublin_core#"), (SubLObject)SubLObjectFactory.makeString("Title")), (SubLObject)SubLObjectFactory.makeString("http://purl.org/metadata/dublin_core#Title")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://random.ioctl.org/#"), (SubLObject)SubLObjectFactory.makeString("prop2")), (SubLObject)SubLObjectFactory.makeString("http://random.ioctl.org/#prop2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://random.ioctl.org/#"), (SubLObject)SubLObjectFactory.makeString("someProperty")), (SubLObject)SubLObjectFactory.makeString("http://random.ioctl.org/#someProperty")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), (SubLObject)SubLObjectFactory.makeString("_2")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), (SubLObject)SubLObjectFactory.makeString("Manifest.rdf")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), (SubLObject)SubLObjectFactory.makeString("premises005.rdf#B")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), (SubLObject)SubLObjectFactory.makeString("#frag")), (SubLObject)SubLObjectFactory.makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag")) });
        $str114$http___schemas_xmlsoap_org_soap_e = SubLObjectFactory.makeString("http://schemas.xmlsoap.org/soap/envelope/");
        $sym115$SOAP_NAME = SubLObjectFactory.makeSymbol("SOAP-NAME");
        $str116$soap_ = SubLObjectFactory.makeString("soap:");
        $sym117$_SOAP_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOAP-NAME-CACHING-STATE*");
        $sym118$SOAP_EXPANDED_NAME = SubLObjectFactory.makeSymbol("SOAP-EXPANDED-NAME");
        $sym119$_SOAP_EXPANDED_NAME_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SOAP-EXPANDED-NAME-CACHING-STATE*");
        $str120$Envelope = SubLObjectFactory.makeString("Envelope");
        $sym121$PERFORM_SOAP_POST_CACHED = SubLObjectFactory.makeSymbol("PERFORM-SOAP-POST-CACHED");
        $sym122$_PERFORM_SOAP_POST_CACHED_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*PERFORM-SOAP-POST-CACHED-CACHING-STATE*");
        $str123$text_xml__charset_utf_8 = SubLObjectFactory.makeString("text/xml; charset=utf-8");
        $str124$US_ASCII = SubLObjectFactory.makeString("US-ASCII");
        $str125$xmlns_soap = SubLObjectFactory.makeString("xmlns:soap");
        $str126$Header = SubLObjectFactory.makeString("Header");
        $list127 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("ATTRIBUTE"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $str128$xmlns = SubLObjectFactory.makeString("xmlns");
        $str129$Body = SubLObjectFactory.makeString("Body");
        $list130 = ConsesLow.list((SubLObject)Characters.CHAR_space, (SubLObject)Characters.CHAR_slash);
        $str131$HTTP = SubLObjectFactory.makeString("HTTP");
        $str132$Location__ = SubLObjectFactory.makeString("Location: ");
        $sym133$WHITESPACEP = SubLObjectFactory.makeSymbol("WHITESPACEP");
        $str134$http___ = SubLObjectFactory.makeString("http://");
        $str135$https___ = SubLObjectFactory.makeString("https://");
        $int136$100 = SubLObjectFactory.makeInteger(100);
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MSG"), (SubLObject)SubLObjectFactory.makeSymbol("EXP"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list138 = ConsesLow.list((SubLObject)web_utilities.NIL);
        $sym139$CATCH_ERROR_MESSAGE = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE");
        $sym140$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str141$_____Averted__connection_reset_by = SubLObjectFactory.makeString("~&>> Averted 'connection reset by peer' error !!");
        $str142$0 = SubLObjectFactory.makeString("0");
        $str143$_GMT = SubLObjectFactory.makeString(" GMT");
        $list144 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PATTERN"), (SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym145$MEMBER = SubLObjectFactory.makeSymbol("MEMBER");
        $list146 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTION"), (SubLObject)SubLObjectFactory.makeSymbol("SEARCH")));
        $list147 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LIST"));
        $sym148$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym149$CDR = SubLObjectFactory.makeSymbol("CDR");
        $sym150$HTML_TOKENS_FAST_FORWARD = SubLObjectFactory.makeSymbol("HTML-TOKENS-FAST-FORWARD");
        $sym151$CAR = SubLObjectFactory.makeSymbol("CAR");
        $list152 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("TAG"));
        $sym153$MARKER = SubLObjectFactory.makeUninternedSymbol("MARKER");
        $sym154$HTML_TOKENS_EXTRACT_CURR = SubLObjectFactory.makeSymbol("HTML-TOKENS-EXTRACT-CURR");
        $sym155$PUNLESS = SubLObjectFactory.makeSymbol("PUNLESS");
        $sym156$STRING_EQUAL = SubLObjectFactory.makeSymbol("STRING-EQUAL");
        $sym157$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str158$Invalid_input_file_format__Expect = SubLObjectFactory.makeString("Invalid input file format. Expected starting ~S and received ~S.~%");
        $sym159$HTML_TOKENS_STEP = SubLObjectFactory.makeSymbol("HTML-TOKENS-STEP");
        $sym160$MARKER = SubLObjectFactory.makeUninternedSymbol("MARKER");
        $sym161$IS_HTML_TERMINATING_TAG_ = SubLObjectFactory.makeSymbol("IS-HTML-TERMINATING-TAG?");
        $str162$Invalid_input_file_format__Expect = SubLObjectFactory.makeString("Invalid input file format. Expected closing ~S and received ~S.~%");
        $list163 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("STORAGE"));
        $sym164$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym165$HTML_CONSUME_STARTING_TAG = SubLObjectFactory.makeSymbol("HTML-CONSUME-STARTING-TAG");
        $sym166$HTML_CONSUME_CLOSING_TAG = SubLObjectFactory.makeSymbol("HTML-CONSUME-CLOSING-TAG");
        $list167 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOKENS"), (SubLObject)SubLObjectFactory.makeSymbol("TAG"), (SubLObject)SubLObjectFactory.makeSymbol("STORAGE"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFAULT"), (SubLObject)web_utilities.NIL));
        $sym168$TEMP = SubLObjectFactory.makeUninternedSymbol("TEMP");
        $sym169$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $sym170$TEST_FOR_HTML_TAG_ = SubLObjectFactory.makeSymbol("TEST-FOR-HTML-TAG?");
        $sym171$HTML_EXTRACT_TAG_CONTENT = SubLObjectFactory.makeSymbol("HTML-EXTRACT-TAG-CONTENT");
        $kw172$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str173$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $sym174$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $str175$_ = SubLObjectFactory.makeString("&");
        $str176$_ = SubLObjectFactory.makeString("=");
        $sym177$ALIST_P = SubLObjectFactory.makeSymbol("ALIST-P");
        $list178 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("KEY"), (SubLObject)SubLObjectFactory.makeSymbol("VALUE"));
        $sym179$MATCHING_OPEN_TAG_ = SubLObjectFactory.makeSymbol("MATCHING-OPEN-TAG?");
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("<tag>")), (SubLObject)web_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("</tag>")), (SubLObject)web_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("<TAG>")), (SubLObject)web_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("<TAG>"), (SubLObject)web_utilities.EQUALP), (SubLObject)web_utilities.T));
        $sym181$MATCHING_CLOSE_TAG_ = SubLObjectFactory.makeSymbol("MATCHING-CLOSE-TAG?");
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("<tag>")), (SubLObject)web_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("</tag>")), (SubLObject)web_utilities.T), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("</TAG>")), (SubLObject)web_utilities.NIL), (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("tag"), (SubLObject)SubLObjectFactory.makeString("</TAG>"), (SubLObject)web_utilities.EQUALP), (SubLObject)web_utilities.T));
        $str183$localhost = SubLObjectFactory.makeString("localhost");
        $str184$_cgi_bin_services = SubLObjectFactory.makeString("/cgi-bin/services");
        $sym185$BYTE_ORDER_MARK = SubLObjectFactory.makeSymbol("BYTE-ORDER-MARK");
        $str186$_ufeff_ = SubLObjectFactory.makeString("&ufeff;");
        $sym187$_BYTE_ORDER_MARK_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*BYTE-ORDER-MARK-CACHING-STATE*");
        $str188$___A__A_____ = SubLObjectFactory.makeString("~{~A=~A~^&~}");
        $sym189$HTML_ENCODE_SEXPR = SubLObjectFactory.makeSymbol("HTML-ENCODE-SEXPR");
        $sym190$APPEND = SubLObjectFactory.makeSymbol("APPEND");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeString("text/html"), (SubLObject)SubLObjectFactory.makeString("*/*"));
        $str192$file___ = SubLObjectFactory.makeString("file://");
        $sym193$FILE_EXISTS_ = SubLObjectFactory.makeSymbol("FILE-EXISTS?");
        $kw194$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $sym195$START_SERVLET_CONTAINER_INT = SubLObjectFactory.makeSymbol("START-SERVLET-CONTAINER-INT");
        $sym196$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym197$START_SERVLET_CONTAINER = SubLObjectFactory.makeSymbol("START-SERVLET-CONTAINER");
        $kw198$SERVLET = SubLObjectFactory.makeKeyword("SERVLET");
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXTERNAL"), (SubLObject)SubLObjectFactory.makeSymbol("START-SERVLET-CONTAINER"));
        $sym200$STOP_SERVLET_CONTAINER_INT = SubLObjectFactory.makeSymbol("STOP-SERVLET-CONTAINER-INT");
        $kw201$STOPPED = SubLObjectFactory.makeKeyword("STOPPED");
        $str202$cyc_servlet_container_tmp_dir_ = SubLObjectFactory.makeString("cyc-servlet-container-tmp-dir-");
        $str203$_ = SubLObjectFactory.makeString("-");
        $str204$webapps_apps_webapp_manifest_xml = SubLObjectFactory.makeString("webapps/apps/webapp-manifest.xml");
        $str205$filename = SubLObjectFactory.makeString("filename");
        $str206$contextRoot = SubLObjectFactory.makeString("contextRoot");
        $str207$webapp = SubLObjectFactory.makeString("webapp");
        $str208$Unable_to_find_webapp_manifest_fi = SubLObjectFactory.makeString("Unable to find webapp manifest file at ~S");
    }
    
    public static final class $html_url_expand_char$UnaryFunction extends UnaryFunction
    {
        public $html_url_expand_char$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HTML-URL-EXPAND-CHAR"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return web_utilities.html_url_expand_char(arg1);
        }
    }
    
    public static final class $url_p$UnaryFunction extends UnaryFunction
    {
        public $url_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("URL-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return web_utilities.url_p(arg1);
        }
    }
}

/*

	Total time: 1042 ms
	 synthetic 
*/