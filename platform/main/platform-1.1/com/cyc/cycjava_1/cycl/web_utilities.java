/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *   
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.cycjava_1.cycl;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.forts;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.unicode_strings;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;
//dm import com.cyc.cycjava_1.cycl.xml_utilities;

public  class web_utilities extends SubLTranslatedFile {

  //// Constructor

  private web_utilities() {}
  public static final SubLFile me = new web_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.web_utilities";

  //// Definitions

  @SubL(source = "cycl/web-utilities.lisp", position = 855) 
  private static SubLSymbol $http_default_accept_types$ = null;

  /** A-list that maps HTML Informational (1xx) status codes to
   the descriptive explanation given in RFC 2616 (HTTP/1.1
   specification). */
  @SubL(source = "cycl/web-utilities.lisp", position = 4922) 
  private static SubLSymbol $http_informational_codes$ = null;

  /** A-list that maps HTML Success (2xx) status codes to the
   descriptive explanation given in RFC 2616 (HTTP/1.1
   specification). */
  @SubL(source = "cycl/web-utilities.lisp", position = 5202) 
  private static SubLSymbol $http_success_codes$ = null;

  /** A-list that maps HTML Redirection (3xx) status codes to
   the deflexical-private explanation given in RFC 2616
   (HTTP/1.1 specification). */
  @SubL(source = "cycl/web-utilities.lisp", position = 5583) 
  private static SubLSymbol $http_redirection_codes$ = null;

  /** A-list that maps HTML client error (4xx) codes to the
   descriptive expectation given in RFC 2616 (HTTP/1.1
   specification). */
  @SubL(source = "cycl/web-utilities.lisp", position = 6006) 
  private static SubLSymbol $http_client_error_codes$ = null;

  /** A-list that maps HTTP error codes to the descriptive
   explanation given in RFC 2616 (HTTP/1.1 specifcation). */
  @SubL(source = "cycl/web-utilities.lisp", position = 6754) 
  private static SubLSymbol $http_server_error_codes$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 7127) 
  private static SubLSymbol $http_error_codes$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 7238) 
  private static SubLSymbol $http_status_codes$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 8245) 
  private static SubLSymbol $http_get_request_template_components$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 9376) 
  private static SubLSymbol $http_get_request_template_order$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 9491) 
  private static SubLSymbol $http_post_request_template_components$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 9926) 
  private static SubLSymbol $http_post_request_template_order$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 11389) 
  private static SubLSymbol $trace_http_send_post_requests$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 11450) 
  public static SubLSymbol $http_cookies_to_include_in_requests$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 16436) 
  private static SubLSymbol $http_header_cookie_keyword$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 17250) 
  private static SubLSymbol $http_cookie_separation_charset$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 17317) 
  private static SubLSymbol $http_filtered_predefined_named_cookie_attributes$ = null;

  public static final class $html_url_expand_char$UnaryFunction extends UnaryFunction {
    public $html_url_expand_char$UnaryFunction() { super(extractFunctionNamed("HTML-URL-EXPAND-CHAR")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31443"); }
  }

  public static final class $url_p$UnaryFunction extends UnaryFunction {
    public $url_p$UnaryFunction() { super(extractFunctionNamed("URL-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31478"); }
  }

  @SubL(source = "cycl/web-utilities.lisp", position = 26537) 
  private static SubLSymbol $official_uri_schemes$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 26898) 
  private static SubLSymbol $unofficial_uri_schemes$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 27735) 
  private static SubLSymbol $valid_url_beginnings$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 27860) 
  private static SubLSymbol $url_delimiters$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 29673) 
  private static SubLSymbol $valid_non_alphanumeric_url_chars$ = null;

  /** If non-NIL, throw an error whenever invalid XML is detected.
 @note validation is *not* exhaustive: DTDs are not checked, and in general only
       basic syntax errors are detected. */
  @SubL(source = "cycl/web-utilities.lisp", position = 33964) 
  public static SubLSymbol $require_valid_xmlP$ = null;

  public static final class $xml_token_iterator_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $in_stream; }
    public SubLObject getField3() { return $scratch_stream; }
    public SubLObject getField4() { return $token_output_stream; }
    public SubLObject getField5() { return $entity_map; }
    public SubLObject getField6() { return $namespace_stack; }
    public SubLObject getField7() { return $validateP; }
    public SubLObject getField8() { return $resolve_entity_referencesP; }
    public SubLObject getField9() { return $resolve_namespacesP; }
    public SubLObject getField10() { return $on_deck_queue; }
    public SubLObject setField2(SubLObject value) { return $in_stream = value; }
    public SubLObject setField3(SubLObject value) { return $scratch_stream = value; }
    public SubLObject setField4(SubLObject value) { return $token_output_stream = value; }
    public SubLObject setField5(SubLObject value) { return $entity_map = value; }
    public SubLObject setField6(SubLObject value) { return $namespace_stack = value; }
    public SubLObject setField7(SubLObject value) { return $validateP = value; }
    public SubLObject setField8(SubLObject value) { return $resolve_entity_referencesP = value; }
    public SubLObject setField9(SubLObject value) { return $resolve_namespacesP = value; }
    public SubLObject setField10(SubLObject value) { return $on_deck_queue = value; }
    public SubLObject $in_stream = NIL;
    public SubLObject $scratch_stream = NIL;
    public SubLObject $token_output_stream = NIL;
    public SubLObject $entity_map = NIL;
    public SubLObject $namespace_stack = NIL;
    public SubLObject $validateP = NIL;
    public SubLObject $resolve_entity_referencesP = NIL;
    public SubLObject $resolve_namespacesP = NIL;
    public SubLObject $on_deck_queue = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($xml_token_iterator_state_native.class, $sym100$XML_TOKEN_ITERATOR_STATE, $sym101$XML_TOKEN_ITERATOR_STATE_P, $list102, $list103, new String[] {"$in_stream", "$scratch_stream", "$token_output_stream", "$entity_map", "$namespace_stack", "$validateP", "$resolve_entity_referencesP", "$resolve_namespacesP", "$on_deck_queue"}, $list104, $list105, $sym106$PRINT_XML_TOKEN_ITERATOR_STATE);
  }

  @SubL(source = "cycl/web-utilities.lisp", position = 36636) 
  public static SubLSymbol $dtp_xml_token_iterator_state$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 36636) 
  public static final SubLObject xml_token_iterator_state_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31471");
    return NIL;
  }

  public static final class $xml_token_iterator_state_p$UnaryFunction extends UnaryFunction {
    public $xml_token_iterator_state_p$UnaryFunction() { super(extractFunctionNamed("XML-TOKEN-ITERATOR-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31509"); }
  }

  public static final class $xml_token_mentions$BinaryFunction extends BinaryFunction {
    public $xml_token_mentions$BinaryFunction() { super(extractFunctionNamed("XML-TOKEN-MENTIONS")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31513"); }
  }

  @SubL(source = "cycl/web-utilities.lisp", position = 55443) 
  private static SubLSymbol $xml_token_accumulator$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90350) 
  public static SubLSymbol $cgi_host$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90422) 
  public static SubLSymbol $cgi_port$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90458) 
  public static SubLSymbol $cgi_path$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90570) 
  private static SubLSymbol $http_header_delimiter$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90685) 
  private static SubLSymbol $http_header_field_delimiters$ = null;

  @SubL(source = "cycl/web-utilities.lisp", position = 90820) 
  private static SubLSymbol $byte_order_mark_caching_state$ = null;

  public static final SubLObject declare_web_utilities_file() {
    declareMacro(myName, "with_http_request", "WITH-HTTP-REQUEST");
    declareFunction(myName, "http_read_request", "HTTP-READ-REQUEST", 1, 1, false);
    declareFunction(myName, "http_send_ok_response", "HTTP-SEND-OK-RESPONSE", 2, 0, false);
    declareFunction(myName, "http_send_error_response", "HTTP-SEND-ERROR-RESPONSE", 3, 0, false);
    declareFunction(myName, "send_http_request", "SEND-HTTP-REQUEST", 2, 0, false);
    declareFunction(myName, "http_request_internal", "HTTP-REQUEST-INTERNAL", 8, 1, false);
    declareMacro(myName, "http_with_cookies", "HTTP-WITH-COOKIES");
    declareFunction(myName, "get_current_cookies_for_request", "GET-CURRENT-COOKIES-FOR-REQUEST", 0, 0, false);
    declareFunction(myName, "http_send_post_request", "HTTP-SEND-POST-REQUEST", 7, 1, false);
    declareFunction(myName, "http_output_accept_types", "HTTP-OUTPUT-ACCEPT-TYPES", 3, 0, false);
    declareFunction(myName, "http_send_get_request", "HTTP-SEND-GET-REQUEST", 7, 1, false);
    declareFunction(myName, "http_send_response_header", "HTTP-SEND-RESPONSE-HEADER", 2, 0, false);
    declareFunction(myName, "http_extract_cookies_from_reply_header", "HTTP-EXTRACT-COOKIES-FROM-REPLY-HEADER", 1, 0, false);
    declareFunction(myName, "http_compute_cookie_string_from_encoding", "HTTP-COMPUTE-COOKIE-STRING-FROM-ENCODING", 1, 0, false);
    declareFunction(myName, "filter_predefined_named_cookie_attributes", "FILTER-PREDEFINED-NAMED-COOKIE-ATTRIBUTES", 1, 0, false);
    declareFunction(myName, "http_decompose_cookie_encoding_string", "HTTP-DECOMPOSE-COOKIE-ENCODING-STRING", 1, 0, false);
    declareFunction(myName, "html_url_encode", "HTML-URL-ENCODE", 1, 1, false);
    declareFunction(myName, "html_url_expand_char", "HTML-URL-EXPAND-CHAR", 1, 0, false); new $html_url_expand_char$UnaryFunction();
    declareFunction(myName, "html_url_expand_char_including_equals", "HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS", 1, 0, false);
    declareFunction(myName, "html_url_decode", "HTML-URL-DECODE", 1, 0, false);
    declareFunction(myName, "html_glyph_decode", "HTML-GLYPH-DECODE", 1, 0, false);
    declareFunction(myName, "html_ascii_glyph_decode", "HTML-ASCII-GLYPH-DECODE", 1, 0, false);
    declareFunction(myName, "html_ascii_glyph_p", "HTML-ASCII-GLYPH-P", 1, 1, false);
    declareFunction(myName, "html_encode_fort", "HTML-ENCODE-FORT", 1, 0, false);
    declareFunction(myName, "html_decode_fort", "HTML-DECODE-FORT", 1, 0, false);
    declareFunction(myName, "uri_p", "URI-P", 1, 1, false);
    declareFunction(myName, "url_p", "URL-P", 1, 0, false); new $url_p$UnaryFunction();
    declareFunction(myName, "url_host", "URL-HOST", 1, 0, false);
    declareFunction(myName, "url_is_relativeP", "URL-IS-RELATIVE?", 1, 0, false);
    declareFunction(myName, "absolute_url_from_relative_url_and_base", "ABSOLUTE-URL-FROM-RELATIVE-URL-AND-BASE", 2, 0, false);
    declareFunction(myName, "uri_scheme_p", "URI-SCHEME-P", 1, 3, false);
    declareFunction(myName, "find_url_beginning", "FIND-URL-BEGINNING", 3, 0, false);
    declareFunction(myName, "find_url_end", "FIND-URL-END", 1, 2, false);
    declareFunction(myName, "valid_url_char_p", "VALID-URL-CHAR-P", 1, 0, false);
    declareFunction(myName, "resolve_relative_uri", "RESOLVE-RELATIVE-URI", 2, 0, false);
    declareFunction(myName, "canonicalize_relative_uri", "CANONICALIZE-RELATIVE-URI", 2, 0, false);
    declareFunction(myName, "remove_last_path_element", "REMOVE-LAST-PATH-ELEMENT", 1, 0, false);
    declareFunction(myName, "uri_lacks_path_componentP", "URI-LACKS-PATH-COMPONENT?", 1, 0, false);
    declareFunction(myName, "xml_tokenize", "XML-TOKENIZE", 1, 3, false);
    declareFunction(myName, "new_xml_token_iterator", "NEW-XML-TOKEN-ITERATOR", 1, 3, false);
    declareFunction(myName, "xml_token_iterator_state_print_function_trampoline", "XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "xml_token_iterator_state_p", "XML-TOKEN-ITERATOR-STATE-P", 1, 0, false); new $xml_token_iterator_state_p$UnaryFunction();
    declareFunction(myName, "xml_it_state_in_stream", "XML-IT-STATE-IN-STREAM", 1, 0, false);
    declareFunction(myName, "xml_it_state_scratch_stream", "XML-IT-STATE-SCRATCH-STREAM", 1, 0, false);
    declareFunction(myName, "xml_it_state_token_output_stream", "XML-IT-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
    declareFunction(myName, "xml_it_state_entity_map", "XML-IT-STATE-ENTITY-MAP", 1, 0, false);
    declareFunction(myName, "xml_it_state_namespace_stack", "XML-IT-STATE-NAMESPACE-STACK", 1, 0, false);
    declareFunction(myName, "xml_it_state_validateP", "XML-IT-STATE-VALIDATE?", 1, 0, false);
    declareFunction(myName, "xml_it_state_resolve_entity_referencesP", "XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
    declareFunction(myName, "xml_it_state_resolve_namespacesP", "XML-IT-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
    declareFunction(myName, "xml_it_state_on_deck_queue", "XML-IT-STATE-ON-DECK-QUEUE", 1, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_in_stream", "_CSETF-XML-IT-STATE-IN-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_scratch_stream", "_CSETF-XML-IT-STATE-SCRATCH-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_token_output_stream", "_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_entity_map", "_CSETF-XML-IT-STATE-ENTITY-MAP", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_namespace_stack", "_CSETF-XML-IT-STATE-NAMESPACE-STACK", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_validateP", "_CSETF-XML-IT-STATE-VALIDATE?", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_resolve_entity_referencesP", "_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_resolve_namespacesP", "_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?", 2, 0, false);
    declareFunction(myName, "_csetf_xml_it_state_on_deck_queue", "_CSETF-XML-IT-STATE-ON-DECK-QUEUE", 2, 0, false);
    declareFunction(myName, "make_xml_token_iterator_state", "MAKE-XML-TOKEN-ITERATOR-STATE", 0, 1, false);
    declareFunction(myName, "print_xml_token_iterator_state", "PRINT-XML-TOKEN-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "new_xml_token_iterator_state", "NEW-XML-TOKEN-ITERATOR-STATE", 9, 0, false);
    declareFunction(myName, "xml_token_iterator_state_in_stream", "XML-TOKEN-ITERATOR-STATE-IN-STREAM", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_scratch_stream", "XML-TOKEN-ITERATOR-STATE-SCRATCH-STREAM", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_token_output_stream", "XML-TOKEN-ITERATOR-STATE-TOKEN-OUTPUT-STREAM", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_entity_map", "XML-TOKEN-ITERATOR-STATE-ENTITY-MAP", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_namespace_stack", "XML-TOKEN-ITERATOR-STATE-NAMESPACE-STACK", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_validateP", "XML-TOKEN-ITERATOR-STATE-VALIDATE?", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_resolve_entity_referencesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-ENTITY-REFERENCES?", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_resolve_namespacesP", "XML-TOKEN-ITERATOR-STATE-RESOLVE-NAMESPACES?", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_on_deck_queue", "XML-TOKEN-ITERATOR-STATE-ON-DECK-QUEUE", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_state_peek", "XML-TOKEN-ITERATOR-STATE-PEEK", 1, 0, false);
    declareFunction(myName, "advance_xml_token_iterator_to_next_element", "ADVANCE-XML-TOKEN-ITERATOR-TO-NEXT-ELEMENT", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_progress", "XML-TOKEN-ITERATOR-PROGRESS", 1, 0, false);
    declareFunction(myName, "make_iterator_xml_token_state", "MAKE-ITERATOR-XML-TOKEN-STATE", 4, 0, false);
    declareFunction(myName, "iterate_xml_token_done", "ITERATE-XML-TOKEN-DONE", 1, 0, false);
    declareFunction(myName, "iterate_xml_token_next", "ITERATE-XML-TOKEN-NEXT", 1, 0, false);
    declareFunction(myName, "ensure_xml_token_on_deck_queue_populated", "ENSURE-XML-TOKEN-ON-DECK-QUEUE-POPULATED", 1, 0, false);
    declareFunction(myName, "xml_iterator_state_handle_namespaces_and_entities", "XML-ITERATOR-STATE-HANDLE-NAMESPACES-AND-ENTITIES", 2, 0, false);
    declareFunction(myName, "handle_xml_namespaces", "HANDLE-XML-NAMESPACES", 3, 0, false);
    declareFunction(myName, "xml_namespace_mapping_p", "XML-NAMESPACE-MAPPING-P", 1, 0, false);
    declareFunction(myName, "validate_xml_namespaces", "VALIDATE-XML-NAMESPACES", 2, 0, false);
    declareFunction(myName, "maybe_validate_xml_namespace", "MAYBE-VALIDATE-XML-NAMESPACE", 3, 0, false);
    declareFunction(myName, "validate_xml_namespace", "VALIDATE-XML-NAMESPACE", 3, 0, false);
    declareFunction(myName, "xml_prefixed_name_p", "XML-PREFIXED-NAME-P", 1, 0, false);
    declareFunction(myName, "xml_prefixed_name_namespace", "XML-PREFIXED-NAME-NAMESPACE", 1, 0, false);
    declareFunction(myName, "xml_prefixed_name_local_name", "XML-PREFIXED-NAME-LOCAL-NAME", 1, 0, false);
    declareFunction(myName, "xml_string_tokenize", "XML-STRING-TOKENIZE", 1, 3, false);
    declareFunction(myName, "xml_tokenized_http_request", "XML-TOKENIZED-HTTP-REQUEST", 2, 9, false);
    declareFunction(myName, "xml_tokenized_http_request_internal", "XML-TOKENIZED-HTTP-REQUEST-INTERNAL", 9, 0, false);
    declareMacro(myName, "html_tokenize", "HTML-TOKENIZE");
    declareFunction(myName, "xml_token_matches_exactly", "XML-TOKEN-MATCHES-EXACTLY", 2, 0, false);
    declareFunction(myName, "xml_token_matches", "XML-TOKEN-MATCHES", 2, 0, false);
    declareFunction(myName, "xml_token_starts_with", "XML-TOKEN-STARTS-WITH", 2, 0, false);
    declareFunction(myName, "xml_token_mentions", "XML-TOKEN-MENTIONS", 2, 0, false); new $xml_token_mentions$BinaryFunction();
    declareFunction(myName, "next_xml_token_position", "NEXT-XML-TOKEN-POSITION", 2, 1, false);
    declareFunction(myName, "next_xml_token_position_if", "NEXT-XML-TOKEN-POSITION-IF", 2, 0, false);
    declareFunction(myName, "next_xml_token_position_if_not", "NEXT-XML-TOKEN-POSITION-IF-NOT", 2, 0, false);
    declareFunction(myName, "advance_xml_tokens", "ADVANCE-XML-TOKENS", 1, 1, false);
    declareFunction(myName, "advance_xml_tokens_to", "ADVANCE-XML-TOKENS-TO", 2, 1, false);
    declareFunction(myName, "xml_extract_token_sequence", "XML-EXTRACT-TOKEN-SEQUENCE", 2, 0, false);
    declareFunction(myName, "accumulate_xml_token", "ACCUMULATE-XML-TOKEN", 1, 0, false);
    declareFunction(myName, "accumulate_xml_tokens", "ACCUMULATE-XML-TOKENS", 2, 0, false);
    declareFunction(myName, "accumulated_xml_tokens", "ACCUMULATED-XML-TOKENS", 0, 0, false);
    declareFunction(myName, "xml_tokens_for_next_element", "XML-TOKENS-FOR-NEXT-ELEMENT", 1, 0, false);
    declareFunction(myName, "advance_xml_tokens_to_end_of_element", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT", 1, 0, false);
    declareFunction(myName, "advance_xml_tokens_to_end_of_element_int", "ADVANCE-XML-TOKENS-TO-END-OF-ELEMENT-INT", 2, 0, false);
    declareFunction(myName, "xml_declaration_p", "XML-DECLARATION-P", 1, 0, false);
    declareFunction(myName, "xml_comment_p", "XML-COMMENT-P", 1, 0, false);
    declareFunction(myName, "xml_closing_tag_p", "XML-CLOSING-TAG-P", 1, 0, false);
    declareFunction(myName, "xml_opening_tag_p", "XML-OPENING-TAG-P", 1, 0, false);
    declareFunction(myName, "advance_xml_tokens_without_crossing", "ADVANCE-XML-TOKENS-WITHOUT-CROSSING", 3, 1, false);
    declareFunction(myName, "xml_read", "XML-READ", 1, 2, false);
    declareFunction(myName, "xml_doctype_tag_p", "XML-DOCTYPE-TAG-P", 1, 0, false);
    declareFunction(myName, "html_doctype_tag_p", "HTML-DOCTYPE-TAG-P", 1, 0, false);
    declareFunction(myName, "xml_processing_instruction_p", "XML-PROCESSING-INSTRUCTION-P", 1, 0, false);
    declareFunction(myName, "entity_map_from_doctype_tag", "ENTITY-MAP-FROM-DOCTYPE-TAG", 1, 0, false);
    declareFunction(myName, "resolve_entity_references", "RESOLVE-ENTITY-REFERENCES", 2, 0, false);
    declareFunction(myName, "resolve_predefined_xml_entities", "RESOLVE-PREDEFINED-XML-ENTITIES", 1, 0, false);
    declareFunction(myName, "remove_xml_comments", "REMOVE-XML-COMMENTS", 1, 0, false);
    declareFunction(myName, "parse_xml_token", "PARSE-XML-TOKEN", 1, 0, false);
    declareFunction(myName, "parse_html_token", "PARSE-HTML-TOKEN", 1, 0, false);
    declareFunction(myName, "parse_xml_token_int_internal", "PARSE-XML-TOKEN-INT-INTERNAL", 1, 1, false);
    declareFunction(myName, "parse_xml_token_int", "PARSE-XML-TOKEN-INT", 1, 1, false);
    declareFunction(myName, "xml_attribute_value_pair_from_token", "XML-ATTRIBUTE-VALUE-PAIR-FROM-TOKEN", 5, 0, false);
    declareFunction(myName, "xml_tagP", "XML-TAG?", 1, 0, false);
    declareFunction(myName, "regular_xml_tagP", "REGULAR-XML-TAG?", 1, 0, false);
    declareFunction(myName, "xml_empty_tagP", "XML-EMPTY-TAG?", 1, 0, false);
    declareFunction(myName, "xml_cdata_tagP", "XML-CDATA-TAG?", 1, 0, false);
    declareFunction(myName, "xml_cdata_tag_text", "XML-CDATA-TAG-TEXT", 1, 0, false);
    declareFunction(myName, "xml_closing_tokenP", "XML-CLOSING-TOKEN?", 2, 0, false);
    declareFunction(myName, "xml_token_element_nameP", "XML-TOKEN-ELEMENT-NAME?", 2, 0, false);
    declareFunction(myName, "xml_token_element_name", "XML-TOKEN-ELEMENT-NAME", 1, 0, false);
    declareFunction(myName, "xml_token_element_name_start_and_end", "XML-TOKEN-ELEMENT-NAME-START-AND-END", 1, 0, false);
    declareFunction(myName, "xml_tokens_to_sexpr", "XML-TOKENS-TO-SEXPR", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_to_sexpr", "XML-TOKEN-ITERATOR-TO-SEXPR", 1, 1, false);
    declareFunction(myName, "xml_token_iterator_to_sexpr_internal", "XML-TOKEN-ITERATOR-TO-SEXPR-INTERNAL", 2, 0, false);
    declareFunction(myName, "xml_tag_attribute_value", "XML-TAG-ATTRIBUTE-VALUE", 2, 1, false);
    declareFunction(myName, "non_content_xml_token_p", "NON-CONTENT-XML-TOKEN-P", 1, 0, false);
    declareFunction(myName, "get_field_value_from_xml_sexpr", "GET-FIELD-VALUE-FROM-XML-SEXPR", 2, 0, false);
    declareFunction(myName, "xml_sexpr_tag", "XML-SEXPR-TAG", 1, 0, false);
    declareFunction(myName, "xml_sexpr_type", "XML-SEXPR-TYPE", 1, 0, false);
    declareFunction(myName, "xml_sexpr_daughter", "XML-SEXPR-DAUGHTER", 2, 0, false);
    declareFunction(myName, "xml_sexpr_daughters", "XML-SEXPR-DAUGHTERS", 1, 1, false);
    declareFunction(myName, "xml_sexpr_attributes", "XML-SEXPR-ATTRIBUTES", 1, 0, false);
    declareFunction(myName, "xml_sexpr_attribute_value", "XML-SEXPR-ATTRIBUTE-VALUE", 2, 0, false);
    declareFunction(myName, "xml_sexpr_set_attribute", "XML-SEXPR-SET-ATTRIBUTE", 3, 0, false);
    declareFunction(myName, "xml_sexpr_atomic_p", "XML-SEXPR-ATOMIC-P", 1, 0, false);
    declareFunction(myName, "get_http_status_code", "GET-HTTP-STATUS-CODE", 1, 0, false);
    declareFunction(myName, "html_redirection_header_p", "HTML-REDIRECTION-HEADER-P", 1, 0, false);
    declareFunction(myName, "html_redirection_url", "HTML-REDIRECTION-URL", 1, 0, false);
    declareFunction(myName, "parse_http_url", "PARSE-HTTP-URL", 1, 0, false);
    declareFunction(myName, "read_until_eof", "READ-UNTIL-EOF", 1, 1, false);
    declareFunction(myName, "read_until_char", "READ-UNTIL-CHAR", 2, 1, false);
    declareFunction(myName, "read_until_one_of", "READ-UNTIL-ONE-OF", 2, 1, false);
    declareFunction(myName, "slack_read_until_eof", "SLACK-READ-UNTIL-EOF", 1, 1, false);
    declareMacro(myName, "try_error_message", "TRY-ERROR-MESSAGE");
    declareFunction(myName, "slack_read_char", "SLACK-READ-CHAR", 0, 4, false);
    declareFunction(myName, "read_http_chunk", "READ-HTTP-CHUNK", 1, 0, false);
    declareFunction(myName, "write_http_chunk", "WRITE-HTTP-CHUNK", 2, 0, false);
    declareFunction(myName, "http_network_terpri", "HTTP-NETWORK-TERPRI", 1, 0, false);
    declareFunction(myName, "write_http_date", "WRITE-HTTP-DATE", 1, 1, false);
    declareFunction(myName, "http_date_string", "HTTP-DATE-STRING", 0, 1, false);
    declareMacro(myName, "html_tokens_fast_forward", "HTML-TOKENS-FAST-FORWARD");
    declareMacro(myName, "html_tokens_step", "HTML-TOKENS-STEP");
    declareMacro(myName, "html_tokens_fast_forward_to", "HTML-TOKENS-FAST-FORWARD-TO");
    declareMacro(myName, "html_tokens_fast_forward_past", "HTML-TOKENS-FAST-FORWARD-PAST");
    declareMacro(myName, "html_tokens_extract_curr", "HTML-TOKENS-EXTRACT-CURR");
    declareFunction(myName, "is_html_terminating_tagP", "IS-HTML-TERMINATING-TAG?", 2, 0, false);
    declareFunction(myName, "test_for_html_tagP", "TEST-FOR-HTML-TAG?", 2, 0, false);
    declareMacro(myName, "html_consume_starting_tag", "HTML-CONSUME-STARTING-TAG");
    declareMacro(myName, "html_consume_closing_tag", "HTML-CONSUME-CLOSING-TAG");
    declareMacro(myName, "html_extract_tag_content", "HTML-EXTRACT-TAG-CONTENT");
    declareMacro(myName, "html_extract_possibly_empty_tag_content", "HTML-EXTRACT-POSSIBLY-EMPTY-TAG-CONTENT");
    declareMacro(myName, "html_possibly_extract_tag_content", "HTML-POSSIBLY-EXTRACT-TAG-CONTENT");
    declareFunction(myName, "html_file_as_tokens", "HTML-FILE-AS-TOKENS", 1, 0, false);
    declareFunction(myName, "html_stream_as_tokens", "HTML-STREAM-AS-TOKENS", 1, 0, false);
    declareFunction(myName, "html_cleaned_token_string", "HTML-CLEANED-TOKEN-STRING", 1, 0, false);
    declareFunction(myName, "html_property_list_to_url_parameters", "HTML-PROPERTY-LIST-TO-URL-PARAMETERS", 1, 0, false);
    declareFunction(myName, "clear_byte_order_mark", "CLEAR-BYTE-ORDER-MARK", 0, 0, false);
    declareFunction(myName, "remove_byte_order_mark", "REMOVE-BYTE-ORDER-MARK", 0, 0, false);
    declareFunction(myName, "byte_order_mark_internal", "BYTE-ORDER-MARK-INTERNAL", 0, 0, false);
    declareFunction(myName, "byte_order_mark", "BYTE-ORDER-MARK", 0, 0, false);
    declareFunction(myName, "http_response_header", "HTTP-RESPONSE-HEADER", 1, 0, false);
    declareFunction(myName, "http_response_body", "HTTP-RESPONSE-BODY", 1, 0, false);
    declareFunction(myName, "parse_http_response", "PARSE-HTTP-RESPONSE", 1, 0, false);
    declareFunction(myName, "http_format_query", "HTTP-FORMAT-QUERY", 1, 0, false);
    declareFunction(myName, "html_encode_sexpr", "HTML-ENCODE-SEXPR", 1, 0, false);
    declareFunction(myName, "http_retrieve", "HTTP-RETRIEVE", 4, 4, false);
    declareFunction(myName, "http_retrieve_via_redirection", "HTTP-RETRIEVE-VIA-REDIRECTION", 1, 2, false);
    declareFunction(myName, "get_html_source_from_url", "GET-HTML-SOURCE-FROM-URL", 1, 2, false);
    declareFunction(myName, "dereference_url", "DEREFERENCE-URL", 2, 2, false);
    declareFunction(myName, "save_url_to_file", "SAVE-URL-TO-FILE", 2, 2, false);
    return NIL;
  }

  public static final SubLObject init_web_utilities_file() {
    $http_default_accept_types$ = deflexical("*HTTP-DEFAULT-ACCEPT-TYPES*", $list0);
    $http_informational_codes$ = deflexical("*HTTP-INFORMATIONAL-CODES*", $list25);
    $http_success_codes$ = deflexical("*HTTP-SUCCESS-CODES*", $list26);
    $http_redirection_codes$ = deflexical("*HTTP-REDIRECTION-CODES*", $list27);
    $http_client_error_codes$ = deflexical("*HTTP-CLIENT-ERROR-CODES*", $list28);
    $http_server_error_codes$ = deflexical("*HTTP-SERVER-ERROR-CODES*", $list29);
    $http_error_codes$ = deflexical("*HTTP-ERROR-CODES*", ConsesLow.append($http_client_error_codes$.getGlobalValue(), $http_server_error_codes$.getGlobalValue()));
    $http_status_codes$ = deflexical("*HTTP-STATUS-CODES*", ConsesLow.append(new SubLObject[] {$http_informational_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue(), $http_redirection_codes$.getGlobalValue(), $http_client_error_codes$.getGlobalValue(), $http_success_codes$.getGlobalValue()}));
    $http_get_request_template_components$ = deflexical("*HTTP-GET-REQUEST-TEMPLATE-COMPONENTS*", $list32);
    $http_get_request_template_order$ = deflexical("*HTTP-GET-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar($sym33$FIRST, $http_get_request_template_components$.getGlobalValue()));
    $http_post_request_template_components$ = deflexical("*HTTP-POST-REQUEST-TEMPLATE-COMPONENTS*", $list34);
    $http_post_request_template_order$ = deflexical("*HTTP-POST-REQUEST-TEMPLATE-ORDER*", Mapping.mapcar($sym33$FIRST, $http_post_request_template_components$.getGlobalValue()));
    $trace_http_send_post_requests$ = defparameter("*TRACE-HTTP-SEND-POST-REQUESTS*", NIL);
    $http_cookies_to_include_in_requests$ = defparameter("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*", NIL);
    $http_header_cookie_keyword$ = deflexical("*HTTP-HEADER-COOKIE-KEYWORD*", $str64$Set_Cookie_);
    $http_cookie_separation_charset$ = deflexical("*HTTP-COOKIE-SEPARATION-CHARSET*", list(Characters.CHAR_semicolon));
    $http_filtered_predefined_named_cookie_attributes$ = deflexical("*HTTP-FILTERED-PREDEFINED-NAMED-COOKIE-ATTRIBUTES*", list($str66$domain, $str67$expires, $str68$max_age));
    $official_uri_schemes$ = deflexical("*OFFICIAL-URI-SCHEMES*", $list82);
    $unofficial_uri_schemes$ = deflexical("*UNOFFICIAL-URI-SCHEMES*", $list83);
    $valid_url_beginnings$ = defconstant("*VALID-URL-BEGINNINGS*", $list84);
    $url_delimiters$ = defconstant("*URL-DELIMITERS*", $list85);
    $valid_non_alphanumeric_url_chars$ = deflexical("*VALID-NON-ALPHANUMERIC-URL-CHARS*", $str87$_____________________);
    $require_valid_xmlP$ = defparameter("*REQUIRE-VALID-XML?*", NIL);
    $dtp_xml_token_iterator_state$ = defconstant("*DTP-XML-TOKEN-ITERATOR-STATE*", $sym100$XML_TOKEN_ITERATOR_STATE);
    $xml_token_accumulator$ = defparameter("*XML-TOKEN-ACCUMULATOR*", misc_utilities.uninitialized());
    $cgi_host$ = defparameter("*CGI-HOST*", $str241$localhost);
    $cgi_port$ = defparameter("*CGI-PORT*", $int17$80);
    $cgi_path$ = defparameter("*CGI-PATH*", $str242$_cgi_bin_services);
    $http_header_delimiter$ = defparameter("*HTTP-HEADER-DELIMITER*", Sequences.cconcatenate(format_nil.format_nil_a_no_copy(Characters.CHAR_return), new SubLObject[] {format_nil.format_nil_a_no_copy(Characters.CHAR_newline), format_nil.format_nil_a_no_copy(Characters.CHAR_return), format_nil.format_nil_a_no_copy(Characters.CHAR_newline)}));
    $http_header_field_delimiters$ = defparameter("*HTTP-HEADER-FIELD-DELIMITERS*", list(Sequences.cconcatenate(format_nil.format_nil_a_no_copy(Characters.CHAR_return), format_nil.format_nil_a_no_copy(Characters.CHAR_newline)), Strings.make_string(ONE_INTEGER, Characters.CHAR_newline)));
    $byte_order_mark_caching_state$ = deflexical("*BYTE-ORDER-MARK-CACHING-STATE*", NIL);
    return NIL;
  }

  public static SubLObject setup_web_utilities_file() {
    // CVS_ID("Id: web-utilities.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    generic_testing.define_test_case_table_int($sym90$RESOLVE_RELATIVE_URI, list(new SubLObject[] {$kw91$TEST, NIL, $kw92$OWNER, NIL, $kw93$CLASSES, NIL, $kw94$KB, $kw95$TINY, $kw96$WORKING_, T}), $list97);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_xml_token_iterator_state$.getGlobalValue(), Symbols.symbol_function($sym107$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym108$XML_IT_STATE_IN_STREAM, $sym109$_CSETF_XML_IT_STATE_IN_STREAM);
    Structures.def_csetf($sym110$XML_IT_STATE_SCRATCH_STREAM, $sym111$_CSETF_XML_IT_STATE_SCRATCH_STREAM);
    Structures.def_csetf($sym112$XML_IT_STATE_TOKEN_OUTPUT_STREAM, $sym113$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM);
    Structures.def_csetf($sym114$XML_IT_STATE_ENTITY_MAP, $sym115$_CSETF_XML_IT_STATE_ENTITY_MAP);
    Structures.def_csetf($sym116$XML_IT_STATE_NAMESPACE_STACK, $sym117$_CSETF_XML_IT_STATE_NAMESPACE_STACK);
    Structures.def_csetf($sym118$XML_IT_STATE_VALIDATE_, $sym119$_CSETF_XML_IT_STATE_VALIDATE_);
    Structures.def_csetf($sym120$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_, $sym121$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_);
    Structures.def_csetf($sym122$XML_IT_STATE_RESOLVE_NAMESPACES_, $sym123$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_);
    Structures.def_csetf($sym124$XML_IT_STATE_ON_DECK_QUEUE, $sym125$_CSETF_XML_IT_STATE_ON_DECK_QUEUE);
    Equality.identity($sym100$XML_TOKEN_ITERATOR_STATE);
    utilities_macros.note_funcall_helper_function($sym106$PRINT_XML_TOKEN_ITERATOR_STATE);
    utilities_macros.note_funcall_helper_function($sym98$ITERATE_XML_TOKEN_DONE);
    utilities_macros.note_funcall_helper_function($sym99$ITERATE_XML_TOKEN_NEXT);
    access_macros.register_external_symbol($sym148$XML_TOKENIZED_HTTP_REQUEST);
    memoization_state.note_memoized_function($sym190$PARSE_XML_TOKEN_INT);
    memoization_state.note_globally_cached_function($sym243$BYTE_ORDER_MARK);
    generic_testing.define_test_case_table_int($sym253$XML_TOKENS_TO_SEXPR, list(new SubLObject[] {$kw91$TEST, EQUAL, $kw92$OWNER, NIL, $kw93$CLASSES, NIL, $kw94$KB, $kw95$TINY, $kw96$WORKING_, T}), $list254);
    generic_testing.define_test_case_table_int($sym255$PARSE_HTML_TOKEN, list(new SubLObject[] {$kw91$TEST, Symbols.symbol_function(EQUAL), $kw92$OWNER, NIL, $kw93$CLASSES, NIL, $kw94$KB, $kw95$TINY, $kw96$WORKING_, T}), $list256);
    generic_testing.define_test_case_table_int($sym257$PARSE_XML_TOKEN, list(new SubLObject[] {$kw91$TEST, Symbols.symbol_function(EQUAL), $kw92$OWNER, NIL, $kw93$CLASSES, NIL, $kw94$KB, $kw95$TINY, $kw96$WORKING_, T}), $list258);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeString("text/plain"), makeString("text/html"));
  public static final SubLList $list1 = list(list(new SubLObject[] {makeSymbol("CHANNEL"), makeSymbol("MACHINE"), makeSymbol("URL"), makeSymbol("&KEY"), makeSymbol("QUERY"), list(makeSymbol("METHOD"), makeKeyword("GET")), list(makeSymbol("PORT"), makeKeyword("DEFAULT")), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), makeSymbol("TIMEOUT"), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT"))}), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("QUERY"), makeKeyword("METHOD"), makeKeyword("PORT"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("TIMEOUT"), makeKeyword("ACCEPT-TYPES"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw5$METHOD = makeKeyword("METHOD");
  public static final SubLSymbol $kw6$GET = makeKeyword("GET");
  public static final SubLSymbol $kw7$PORT = makeKeyword("PORT");
  public static final SubLSymbol $kw8$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $kw9$KEEP_ALIVE_ = makeKeyword("KEEP-ALIVE?");
  public static final SubLSymbol $kw10$WIDE_NEWLINES_ = makeKeyword("WIDE-NEWLINES?");
  public static final SubLSymbol $kw11$TIMEOUT = makeKeyword("TIMEOUT");
  public static final SubLSymbol $kw12$ACCEPT_TYPES = makeKeyword("ACCEPT-TYPES");
  public static final SubLSymbol $sym13$REAL_PORT = makeUninternedSymbol("REAL-PORT");
  public static final SubLSymbol $sym14$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym15$FIF = makeSymbol("FIF");
  public static final SubLList $list16 = list(makeKeyword("DEFAULT"));
  public static final SubLInteger $int17$80 = makeInteger(80);
  public static final SubLSymbol $sym18$WITH_TCP_CONNECTION = makeSymbol("WITH-TCP-CONNECTION");
  public static final SubLSymbol $kw19$ACCESS_MODE = makeKeyword("ACCESS-MODE");
  public static final SubLSymbol $kw20$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $sym21$SEND_HTTP_REQUEST = makeSymbol("SEND-HTTP-REQUEST");
  public static final SubLSymbol $sym22$LIST = makeSymbol("LIST");
  public static final SubLSymbol $kw23$MACHINE = makeKeyword("MACHINE");
  public static final SubLSymbol $kw24$URL = makeKeyword("URL");
  public static final SubLList $list25 = list(cons(makeInteger(100), makeString("Continue")), cons(makeInteger(101), makeString("Switching Protocols")));
  public static final SubLList $list26 = list(cons(makeInteger(200), makeString("OK")), cons(makeInteger(201), makeString("Created")), cons(makeInteger(202), makeString("Accepted")), cons(makeInteger(203), makeString("Non-Authoritative Information")), cons(makeInteger(204), makeString("No Content")), cons(makeInteger(205), makeString("Reset Content")), cons(makeInteger(206), makeString("Partial Content")));
  public static final SubLList $list27 = list(cons(makeInteger(300), makeString("Multiple Choices")), cons(makeInteger(301), makeString("Moved Permanently")), cons(makeInteger(302), makeString("Found")), cons(makeInteger(303), makeString("See Other")), cons(makeInteger(304), makeString("Not Modified")), cons(makeInteger(305), makeString("Use Proxy")), cons(makeInteger(306), makeString("(Unused)")), cons(makeInteger(307), makeString("Temporary Redirect")));
  public static final SubLList $list28 = list(new SubLObject[] {cons(makeInteger(400), makeString("Bad Request")), cons(makeInteger(401), makeString("Unauthorized")), cons(makeInteger(403), makeString("Forbidden")), cons(makeInteger(404), makeString("Not Found")), cons(makeInteger(405), makeString("Method Not Allowed")), cons(makeInteger(406), makeString("Not Acceptable")), cons(makeInteger(407), makeString("Proxy Authentication Required")), cons(makeInteger(408), makeString("Request Timeout")), cons(makeInteger(409), makeString("Conflict")), cons(makeInteger(410), makeString("Gone")), cons(makeInteger(411), makeString("Length Required")), cons(makeInteger(412), makeString("Precondition Failed")), cons(makeInteger(413), makeString("Request Entity Too Large")), cons(makeInteger(414), makeString("Request-URI Too Long")), cons(makeInteger(415), makeString("Unsupported Media Type")), cons(makeInteger(416), makeString("Requested Range Not Satisfiable")), cons(makeInteger(417), makeString("Expectation Failed"))});
  public static final SubLList $list29 = list(cons(makeInteger(500), makeString("Internal Server Error")), cons(makeInteger(501), makeString("Not Implemented")), cons(makeInteger(502), makeString("Bad Gateway")), cons(makeInteger(503), makeString("Service Unavailable")), cons(makeInteger(504), makeString("Gateway Timeout")), cons(makeInteger(505), makeString("HTTP Version not supported")));
  public static final SubLString $str30$HTTP_1_1_200_OK = makeString("HTTP/1.1 200 OK");
  public static final SubLString $str31$HTTP_1_1_ = makeString("HTTP/1.1 ");
  public static final SubLList $list32 = list(list(makeKeyword("VERSION"), makeString("GET ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("BLANK-LINE"), NIL));
  public static final SubLSymbol $sym33$FIRST = makeSymbol("FIRST");
  public static final SubLList $list34 = list(new SubLObject[] {list(makeKeyword("VERSION"), makeString("POST ~A HTTP/1.0")), list(makeKeyword("CONNECTION"), makeString("Connection: ~A")), list(makeKeyword("USER-AGENT"), makeString("User-Agent: Cyc/~A")), list(makeKeyword("HOST"), makeString("Host: ~A~A")), list(makeKeyword("ACCEPT"), makeString("Accept: ")), list(makeKeyword("COOKIES"), makeString("Cookie: ~A")), list(makeKeyword("CONTENT-TYPE"), makeString("Content-type: application/x-www-form-urlencoded")), list(makeKeyword("CONTENT-LENGTH"), makeString("Content-length: ~A")), list(makeKeyword("BLANK-LINE"), NIL), list(makeKeyword("QUERY"), makeString("~A"))});
  public static final SubLSymbol $sym35$STREAMP = makeSymbol("STREAMP");
  public static final SubLList $list36 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("MACHINE"), list(makeSymbol("PORT"), makeInteger(80)), list(makeSymbol("METHOD"), makeKeyword("GET")), makeSymbol("URL"), makeSymbol("QUERY"), list(makeSymbol("KEEP-ALIVE?"), T), list(makeSymbol("WIDE-NEWLINES?"), NIL), list(makeSymbol("ACCEPT-TYPES"), makeKeyword("DEFAULT"))});
  public static final SubLList $list37 = list(makeKeyword("MACHINE"), makeKeyword("PORT"), makeKeyword("METHOD"), makeKeyword("URL"), makeKeyword("QUERY"), makeKeyword("KEEP-ALIVE?"), makeKeyword("WIDE-NEWLINES?"), makeKeyword("ACCEPT-TYPES"));
  public static final SubLSymbol $sym38$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym39$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym40$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym41$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $kw42$POST = makeKeyword("POST");
  public static final SubLString $str43$Unsupported_HTTP_request_method__ = makeString("Unsupported HTTP request method : ~S");
  public static final SubLList $list44 = list(list(makeSymbol("COOKIE-LIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym45$_HTTP_COOKIES_TO_INCLUDE_IN_REQUESTS_ = makeSymbol("*HTTP-COOKIES-TO-INCLUDE-IN-REQUESTS*");
  public static final SubLList $list46 = list(makeSymbol("ACTION"), makeSymbol("FORMAT-STRING"));
  public static final SubLSymbol $kw47$VERSION = makeKeyword("VERSION");
  public static final SubLSymbol $kw48$ACCEPT = makeKeyword("ACCEPT");
  public static final SubLSymbol $kw49$CONNECTION = makeKeyword("CONNECTION");
  public static final SubLString $str50$Keep_Alive___S = makeString("Keep-Alive: ~S");
  public static final SubLString $str51$keep_alive = makeString("keep-alive");
  public static final SubLString $str52$close = makeString("close");
  public static final SubLSymbol $kw53$USER_AGENT = makeKeyword("USER-AGENT");
  public static final SubLSymbol $kw54$HOST = makeKeyword("HOST");
  public static final SubLString $str55$_ = makeString(":");
  public static final SubLSymbol $kw56$BLANK_LINE = makeKeyword("BLANK-LINE");
  public static final SubLSymbol $kw57$COOKIES = makeKeyword("COOKIES");
  public static final SubLSymbol $kw58$CONTENT_LENGTH = makeKeyword("CONTENT-LENGTH");
  public static final SubLString $str59$__ = makeString(", ");
  public static final SubLString $str60$_ = makeString("?");
  public static final SubLString $str61$Date__ = makeString("Date: ");
  public static final SubLString $str62$Server__Cyc_ = makeString("Server: Cyc/");
  public static final SubLString $str63$__ = makeString(": ");
  public static final SubLString $str64$Set_Cookie_ = makeString("Set-Cookie:");
  public static final SubLSymbol $sym65$CHAR_ = makeSymbol("CHAR=");
  public static final SubLString $str66$domain = makeString("domain");
  public static final SubLString $str67$expires = makeString("expires");
  public static final SubLString $str68$max_age = makeString("max-age");
  public static final SubLString $str69$ = makeString("");
  public static final SubLString $str70$__ = makeString(" $");
  public static final SubLSymbol $sym71$EMPTY_STRING_P = makeSymbol("EMPTY-STRING-P");
  public static final SubLSymbol $sym72$TRIM_WHITESPACE = makeSymbol("TRIM-WHITESPACE");
  public static final SubLSymbol $sym73$HTML_URL_EXPAND_CHAR_INCLUDING_EQUALS = makeSymbol("HTML-URL-EXPAND-CHAR-INCLUDING-EQUALS");
  public static final SubLSymbol $sym74$HTML_URL_EXPAND_CHAR = makeSymbol("HTML-URL-EXPAND-CHAR");
  public static final SubLString $str75$____ = makeString("-_.=");
  public static final SubLInteger $int76$256 = makeInteger(256);
  public static final SubLString $str77$_S = makeString("~S");
  public static final SubLString $str78$mailto_ = makeString("mailto:");
  public static final SubLList $list79 = list(makeString(":"), makeString("/"));
  public static final SubLSymbol $sym80$NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");
  public static final SubLString $str81$_ = makeString("/");
  public static final SubLList $list82 = list(new SubLObject[] {makeString("aaa:"), makeString("aaas:"), makeString("acap:"), makeString("cap:"), makeString("cid:"), makeString("crid:"), makeString("data:"), makeString("dav:"), makeString("dict:"), makeString("dns:"), makeString("fax:"), makeString("file:"), makeString("ftp:"), makeString("go:"), makeString("gopher:"), makeString("h323:"), makeString("http:"), makeString("https:"), makeString("im"), makeString("imap:"), makeString("ldap:"), makeString("mailto:"), makeString("mid:"), makeString("news:"), makeString("nfs:"), makeString("nntp:"), makeString("pop:"), makeString("pres:"), makeString("sip:"), makeString("sips:"), makeString("snmp:"), makeString("tel:"), makeString("telnet:"), makeString("urn:"), makeString("wais:"), makeString("xmpp:")});
  public static final SubLList $list83 = list(new SubLObject[] {makeString("about:"), makeString("aim:"), makeString("callto:"), makeString("cvs:"), makeString("ed2k:"), makeString("feed:"), makeString("fish:"), makeString("gizmoproject:"), makeString("iax2:"), makeString("irc:"), makeString("ircs:"), makeString("lastfm:"), makeString("ldaps:"), makeString("magnet:"), makeString("mms:"), makeString("msnim:"), makeString("nsfw:"), makeString("psyc:"), makeString("rsync:"), makeString("secondlife:"), makeString("skype:"), makeString("ssh:"), makeString("sftp:"), makeString("smb:"), makeString("sms:"), makeString("soldat:"), makeString("steam:"), makeString("tag:"), makeString("unreal:"), makeString("ut2004:"), makeString("webcal:"), makeString("xfire:"), makeString("ymsgr:")});
  public static final SubLList $list84 = list(makeString("http://"), makeString("https://"), makeString("ftp://"), makeString("gopher://"), makeString("file:"), makeString("news:"), makeString("mailto:"), makeString("anon:"));
  public static final SubLList $list85 = list(Characters.CHAR_space, Characters.CHAR_period, Characters.CHAR_comma, Characters.CHAR_question, Characters.CHAR_exclamation, Characters.CHAR_rparen);
  public static final SubLSymbol $sym86$VALID_URL_CHAR_P = makeSymbol("VALID-URL-CHAR-P");
  public static final SubLString $str87$_____________________ = makeString(";@?%/:=$-_.+!*'(),#&~");
  public static final SubLString $str88$___ = makeString("../");
  public static final SubLString $str89$__ = makeString("//");
  public static final SubLSymbol $sym90$RESOLVE_RELATIVE_URI = makeSymbol("RESOLVE-RELATIVE-URI");
  public static final SubLSymbol $kw91$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw92$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw93$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw94$KB = makeKeyword("KB");
  public static final SubLSymbol $kw95$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw96$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list97 = list(new SubLObject[] {list(list(makeString("http://example.org"), makeString("relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org#"), makeString("prop")), makeString("http://example.org#prop")), list(list(makeString("http://example.org/"), makeString("named")), makeString("http://example.org/named")), list(list(makeString("http://example.org/#"), makeString("owes")), makeString("http://example.org/#owes")), list(list(makeString("http://example.org/dir/file"), makeString("relfile")), makeString("http://example.org/dir/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("../relfile")), makeString("http://example.org/relfile")), list(list(makeString("http://example.org/dir/file"), makeString("/absfile")), makeString("http://example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("//another.example.org/absfile")), makeString("http://another.example.org/absfile")), list(list(makeString("http://example.org/dir/file"), makeString("#foo")), makeString("http://example.org/dir/file#foo")), list(list(makeString("http://example.org/dir/file"), makeString("")), makeString("http://example.org/dir/file")), list(list(makeString("http://foo/"), makeString("Bar")), makeString("http://foo/Bar")), list(list(makeString("http://my.example.org/"), makeString("Name")), makeString("http://my.example.org/Name")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Creator")), makeString("http://purl.org/metadata/dublin_core#Creator")), list(list(makeString("http://purl.org/metadata/dublin_core#"), makeString("Title")), makeString("http://purl.org/metadata/dublin_core#Title")), list(list(makeString("http://random.ioctl.org/#"), makeString("prop2")), makeString("http://random.ioctl.org/#prop2")), list(list(makeString("http://random.ioctl.org/#"), makeString("someProperty")), makeString("http://random.ioctl.org/#someProperty")), list(list(makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#"), makeString("_2")), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#_2")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/"), makeString("Manifest.rdf")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/Manifest.rdf")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/nonconclusions005.rdf"), makeString("premises005.rdf#B")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/rdfs-domain-and-range/premises005.rdf#B")), list(list(makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf"), makeString("#frag")), makeString("http://www.w3.org/2000/10/rdf-tests/rdfcore/xmlbase/test014.rdf#frag"))});
  public static final SubLSymbol $sym98$ITERATE_XML_TOKEN_DONE = makeSymbol("ITERATE-XML-TOKEN-DONE");
  public static final SubLSymbol $sym99$ITERATE_XML_TOKEN_NEXT = makeSymbol("ITERATE-XML-TOKEN-NEXT");
  public static final SubLSymbol $sym100$XML_TOKEN_ITERATOR_STATE = makeSymbol("XML-TOKEN-ITERATOR-STATE");
  public static final SubLSymbol $sym101$XML_TOKEN_ITERATOR_STATE_P = makeSymbol("XML-TOKEN-ITERATOR-STATE-P");
  public static final SubLList $list102 = list(new SubLObject[] {makeSymbol("IN-STREAM"), makeSymbol("SCRATCH-STREAM"), makeSymbol("TOKEN-OUTPUT-STREAM"), makeSymbol("ENTITY-MAP"), makeSymbol("NAMESPACE-STACK"), makeSymbol("VALIDATE?"), makeSymbol("RESOLVE-ENTITY-REFERENCES?"), makeSymbol("RESOLVE-NAMESPACES?"), makeSymbol("ON-DECK-QUEUE")});
  public static final SubLList $list103 = list(new SubLObject[] {makeKeyword("IN-STREAM"), makeKeyword("SCRATCH-STREAM"), makeKeyword("TOKEN-OUTPUT-STREAM"), makeKeyword("ENTITY-MAP"), makeKeyword("NAMESPACE-STACK"), makeKeyword("VALIDATE?"), makeKeyword("RESOLVE-ENTITY-REFERENCES?"), makeKeyword("RESOLVE-NAMESPACES?"), makeKeyword("ON-DECK-QUEUE")});
  public static final SubLList $list104 = list(new SubLObject[] {makeSymbol("XML-IT-STATE-IN-STREAM"), makeSymbol("XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("XML-IT-STATE-ENTITY-MAP"), makeSymbol("XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("XML-IT-STATE-VALIDATE?"), makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("XML-IT-STATE-ON-DECK-QUEUE")});
  public static final SubLList $list105 = list(new SubLObject[] {makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM"), makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP"), makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK"), makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?"), makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?"), makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE")});
  public static final SubLSymbol $sym106$PRINT_XML_TOKEN_ITERATOR_STATE = makeSymbol("PRINT-XML-TOKEN-ITERATOR-STATE");
  public static final SubLSymbol $sym107$XML_TOKEN_ITERATOR_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("XML-TOKEN-ITERATOR-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym108$XML_IT_STATE_IN_STREAM = makeSymbol("XML-IT-STATE-IN-STREAM");
  public static final SubLSymbol $sym109$_CSETF_XML_IT_STATE_IN_STREAM = makeSymbol("_CSETF-XML-IT-STATE-IN-STREAM");
  public static final SubLSymbol $sym110$XML_IT_STATE_SCRATCH_STREAM = makeSymbol("XML-IT-STATE-SCRATCH-STREAM");
  public static final SubLSymbol $sym111$_CSETF_XML_IT_STATE_SCRATCH_STREAM = makeSymbol("_CSETF-XML-IT-STATE-SCRATCH-STREAM");
  public static final SubLSymbol $sym112$XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("XML-IT-STATE-TOKEN-OUTPUT-STREAM");
  public static final SubLSymbol $sym113$_CSETF_XML_IT_STATE_TOKEN_OUTPUT_STREAM = makeSymbol("_CSETF-XML-IT-STATE-TOKEN-OUTPUT-STREAM");
  public static final SubLSymbol $sym114$XML_IT_STATE_ENTITY_MAP = makeSymbol("XML-IT-STATE-ENTITY-MAP");
  public static final SubLSymbol $sym115$_CSETF_XML_IT_STATE_ENTITY_MAP = makeSymbol("_CSETF-XML-IT-STATE-ENTITY-MAP");
  public static final SubLSymbol $sym116$XML_IT_STATE_NAMESPACE_STACK = makeSymbol("XML-IT-STATE-NAMESPACE-STACK");
  public static final SubLSymbol $sym117$_CSETF_XML_IT_STATE_NAMESPACE_STACK = makeSymbol("_CSETF-XML-IT-STATE-NAMESPACE-STACK");
  public static final SubLSymbol $sym118$XML_IT_STATE_VALIDATE_ = makeSymbol("XML-IT-STATE-VALIDATE?");
  public static final SubLSymbol $sym119$_CSETF_XML_IT_STATE_VALIDATE_ = makeSymbol("_CSETF-XML-IT-STATE-VALIDATE?");
  public static final SubLSymbol $sym120$XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");
  public static final SubLSymbol $sym121$_CSETF_XML_IT_STATE_RESOLVE_ENTITY_REFERENCES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-ENTITY-REFERENCES?");
  public static final SubLSymbol $sym122$XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("XML-IT-STATE-RESOLVE-NAMESPACES?");
  public static final SubLSymbol $sym123$_CSETF_XML_IT_STATE_RESOLVE_NAMESPACES_ = makeSymbol("_CSETF-XML-IT-STATE-RESOLVE-NAMESPACES?");
  public static final SubLSymbol $sym124$XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("XML-IT-STATE-ON-DECK-QUEUE");
  public static final SubLSymbol $sym125$_CSETF_XML_IT_STATE_ON_DECK_QUEUE = makeSymbol("_CSETF-XML-IT-STATE-ON-DECK-QUEUE");
  public static final SubLSymbol $kw126$IN_STREAM = makeKeyword("IN-STREAM");
  public static final SubLSymbol $kw127$SCRATCH_STREAM = makeKeyword("SCRATCH-STREAM");
  public static final SubLSymbol $kw128$TOKEN_OUTPUT_STREAM = makeKeyword("TOKEN-OUTPUT-STREAM");
  public static final SubLSymbol $kw129$ENTITY_MAP = makeKeyword("ENTITY-MAP");
  public static final SubLSymbol $kw130$NAMESPACE_STACK = makeKeyword("NAMESPACE-STACK");
  public static final SubLSymbol $kw131$VALIDATE_ = makeKeyword("VALIDATE?");
  public static final SubLSymbol $kw132$RESOLVE_ENTITY_REFERENCES_ = makeKeyword("RESOLVE-ENTITY-REFERENCES?");
  public static final SubLSymbol $kw133$RESOLVE_NAMESPACES_ = makeKeyword("RESOLVE-NAMESPACES?");
  public static final SubLSymbol $kw134$ON_DECK_QUEUE = makeKeyword("ON-DECK-QUEUE");
  public static final SubLString $str135$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str136$_XML_TOKEN_ITERATOR_STATE_ = makeString("<XML-TOKEN-ITERATOR-STATE>");
  public static final SubLSymbol $kw137$DONE = makeKeyword("DONE");
  public static final SubLString $str138$Can_t_parse_HTML_as_XML_ = makeString("Can't parse HTML as XML.");
  public static final SubLString $str139$Couldn_t_resolve_namespace__S_in_ = makeString("Couldn't resolve namespace ~S in ~S");
  public static final SubLString $str140$Mismatched_tags__Expected__S__got = makeString("Mismatched tags: Expected ~S, got ~S");
  public static final SubLList $list141 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));
  public static final SubLString $str142$xmlns_ = makeString("xmlns:");
  public static final SubLList $list143 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));
  public static final SubLList $list144 = cons(makeSymbol("ATTRIBUTE-NAME"), makeUninternedSymbol("VALUE"));
  public static final SubLString $str145$xml = makeString("xml");
  public static final SubLString $str146$http___www_w3_org_XML_1998_namesp = makeString("http://www.w3.org/XML/1998/namespace");
  public static final SubLString $str147$_S_is_not_a_prefixed_XML_name_ = makeString("~S is not a prefixed XML name.");
  public static final SubLSymbol $sym148$XML_TOKENIZED_HTTP_REQUEST = makeSymbol("XML-TOKENIZED-HTTP-REQUEST");
  public static final SubLSymbol $sym149$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $kw150$OPEN_CONNECTION = makeKeyword("OPEN-CONNECTION");
  public static final SubLSymbol $kw151$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw152$OVERALL = makeKeyword("OVERALL");
  public static final SubLList $list153 = list(makeSymbol("IN-STREAM"));
  public static final SubLSymbol $sym154$HTML_TOKENIZE = makeSymbol("HTML-TOKENIZE");
  public static final SubLList $list155 = list(makeSymbol("XML-TOKENIZE"));
  public static final SubLSymbol $sym156$XML_TOKENIZE = makeSymbol("XML-TOKENIZE");
  public static final SubLList $list157 = list(NIL);
  public static final SubLSymbol $sym158$CHAR_EQUAL = makeSymbol("CHAR-EQUAL");
  public static final SubLSymbol $sym159$XML_TOKEN_MENTIONS = makeSymbol("XML-TOKEN-MENTIONS");
  public static final SubLString $str160$_ = makeString("<");
  public static final SubLString $str161$__ = makeString("/>");
  public static final SubLString $str162$__ = makeString("</");
  public static final SubLSymbol $sym163$XML_TAG_ = makeSymbol("XML-TAG?");
  public static final SubLList $list164 = cons(makeSymbol("FIRST-TOKEN"), makeSymbol("REST-OF-TOKENS"));
  public static final SubLSymbol $sym165$XML_TOKEN_ELEMENT_NAME_ = makeSymbol("XML-TOKEN-ELEMENT-NAME?");
  public static final SubLString $str166$Couldn_t_find_position_of__S_in__ = makeString("Couldn't find position of ~S in ~S");
  public static final SubLString $str167$_xml = makeString("?xml");
  public static final SubLString $str168$____ = makeString("<!--");
  public static final SubLString $str169$___ = makeString("-->");
  public static final SubLList $list170 = list(cons(Characters.CHAR_less, Characters.CHAR_greater));
  public static final SubLList $list171 = list(Characters.CHAR_less, Characters.CHAR_greater);
  public static final SubLString $str172$___ = makeString("!--");
  public static final SubLString $str173$__CDATA_ = makeString("![CDATA[");
  public static final SubLString $str174$__ = makeString("--");
  public static final SubLString $str175$__ = makeString("]]");
  public static final SubLString $str176$Mismatched_closing_bracket__S_fol = makeString("Mismatched closing bracket ~S following ~S. Expected ~S");
  public static final SubLString $str177$_DOCTYPE = makeString("!DOCTYPE");
  public static final SubLString $str178$__DOCTYPE_HTML_ = makeString("<!DOCTYPE HTML ");
  public static final SubLString $str179$__ = makeString("<?");
  public static final SubLString $str180$__ = makeString("?>");
  public static final SubLList $list181 = list(Characters.CHAR_lbracket);
  public static final SubLList $list182 = listS(makeSymbol("DOCTYPE"), makeSymbol("NAME"), makeSymbol("OPEN-BRACKET"), makeSymbol("REST"));
  public static final SubLString $str183$__DOCTYPE = makeString("<!DOCTYPE");
  public static final SubLString $str184$Got__S_instead_of___DOCTYPE_ = makeString("Got ~S instead of <!DOCTYPE.");
  public static final SubLString $str185$_ = makeString("[");
  public static final SubLString $str186$__ENTITY = makeString("<!ENTITY");
  public static final SubLString $str187$_ = makeString("&");
  public static final SubLString $str188$_ = makeString(";");
  public static final SubLList $list189 = cons(makeSymbol("NAME"), makeSymbol("CODE"));
  public static final SubLSymbol $sym190$PARSE_XML_TOKEN_INT = makeSymbol("PARSE-XML-TOKEN-INT");
  public static final SubLSymbol $sym191$WHITESPACEP = makeSymbol("WHITESPACEP");
  public static final SubLString $str192$XML_syntax_error__No___before__S = makeString("XML syntax error: No = before ~S");
  public static final SubLString $str193$XML_syntax_error__Value_starting_ = makeString("XML syntax error: Value starting at ~S is not in quotes.");
  public static final SubLSymbol $kw194$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym195$VALID_XML_NAME_P = makeSymbol("VALID-XML-NAME-P");
  public static final SubLSymbol $sym196$XML_CDATA_TAG_ = makeSymbol("XML-CDATA-TAG?");
  public static final SubLString $str197$_S_is_not_an_XML_token = makeString("~S is not an XML token");
  public static final SubLSymbol $sym198$STRING_ = makeSymbol("STRING=");
  public static final SubLList $list199 = list(Characters.CHAR_space, Characters.CHAR_slash);
  public static final SubLString $str200$HTTP = makeString("HTTP");
  public static final SubLString $str201$Location__ = makeString("Location: ");
  public static final SubLString $str202$http___ = makeString("http://");
  public static final SubLInteger $int203$100 = makeInteger(100);
  public static final SubLList $list204 = list(makeSymbol("MSG"), makeSymbol("EXP"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym205$CATCH_ERROR_MESSAGE = makeSymbol("CATCH-ERROR-MESSAGE");
  public static final SubLString $str206$_____Averted__connection_reset_by = makeString("~&>> Averted 'connection reset by peer' error !!");
  public static final SubLString $str207$0 = makeString("0");
  public static final SubLString $str208$_GMT = makeString(" GMT");
  public static final SubLList $list209 = list(makeSymbol("PATTERN"), makeSymbol("LIST"));
  public static final SubLSymbol $sym210$MEMBER = makeSymbol("MEMBER");
  public static final SubLList $list211 = list(list(makeSymbol("FUNCTION"), makeSymbol("SEARCH")));
  public static final SubLList $list212 = list(makeSymbol("LIST"));
  public static final SubLSymbol $sym213$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym214$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym215$HTML_TOKENS_FAST_FORWARD = makeSymbol("HTML-TOKENS-FAST-FORWARD");
  public static final SubLSymbol $sym216$CAR = makeSymbol("CAR");
  public static final SubLList $list217 = list(makeSymbol("TOKENS"), makeSymbol("TAG"));
  public static final SubLSymbol $sym218$MARKER = makeUninternedSymbol("MARKER");
  public static final SubLSymbol $sym219$HTML_TOKENS_EXTRACT_CURR = makeSymbol("HTML-TOKENS-EXTRACT-CURR");
  public static final SubLSymbol $sym220$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym221$STRING_EQUAL = makeSymbol("STRING-EQUAL");
  public static final SubLSymbol $sym222$ERROR = makeSymbol("ERROR");
  public static final SubLString $str223$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected starting ~S and received ~S.~%");
  public static final SubLSymbol $sym224$HTML_TOKENS_STEP = makeSymbol("HTML-TOKENS-STEP");
  public static final SubLSymbol $sym225$MARKER = makeUninternedSymbol("MARKER");
  public static final SubLSymbol $sym226$IS_HTML_TERMINATING_TAG_ = makeSymbol("IS-HTML-TERMINATING-TAG?");
  public static final SubLString $str227$Invalid_input_file_format__Expect = makeString("Invalid input file format. Expected closing ~S and received ~S.~%");
  public static final SubLList $list228 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"));
  public static final SubLSymbol $sym229$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym230$HTML_CONSUME_STARTING_TAG = makeSymbol("HTML-CONSUME-STARTING-TAG");
  public static final SubLSymbol $sym231$HTML_CONSUME_CLOSING_TAG = makeSymbol("HTML-CONSUME-CLOSING-TAG");
  public static final SubLList $list232 = list(makeSymbol("TOKENS"), makeSymbol("TAG"), makeSymbol("STORAGE"), makeSymbol("&OPTIONAL"), list(makeSymbol("DEFAULT"), NIL));
  public static final SubLSymbol $sym233$TEMP = makeUninternedSymbol("TEMP");
  public static final SubLSymbol $sym234$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym235$TEST_FOR_HTML_TAG_ = makeSymbol("TEST-FOR-HTML-TAG?");
  public static final SubLSymbol $sym236$HTML_EXTRACT_TAG_CONTENT = makeSymbol("HTML-EXTRACT-TAG-CONTENT");
  public static final SubLSymbol $kw237$INPUT = makeKeyword("INPUT");
  public static final SubLString $str238$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym239$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLString $str240$_ = makeString("=");
  public static final SubLString $str241$localhost = makeString("localhost");
  public static final SubLString $str242$_cgi_bin_services = makeString("/cgi-bin/services");
  public static final SubLSymbol $sym243$BYTE_ORDER_MARK = makeSymbol("BYTE-ORDER-MARK");
  public static final SubLString $str244$_ufeff_ = makeString("&ufeff;");
  public static final SubLSymbol $sym245$_BYTE_ORDER_MARK_CACHING_STATE_ = makeSymbol("*BYTE-ORDER-MARK-CACHING-STATE*");
  public static final SubLString $str246$___A__A_____ = makeString("~{~A=~A~^&~}");
  public static final SubLSymbol $sym247$HTML_ENCODE_SEXPR = makeSymbol("HTML-ENCODE-SEXPR");
  public static final SubLSymbol $sym248$APPEND = makeSymbol("APPEND");
  public static final SubLList $list249 = list(makeString("text/html"), makeString("*/*"));
  public static final SubLString $str250$file___ = makeString("file://");
  public static final SubLSymbol $sym251$FILE_EXISTS_ = makeSymbol("FILE-EXISTS?");
  public static final SubLSymbol $kw252$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLSymbol $sym253$XML_TOKENS_TO_SEXPR = makeSymbol("XML-TOKENS-TO-SEXPR");
  public static final SubLList $list254 = list(list(list(list(makeString("<html>"), makeString("<body bgcolor='3'>"), makeString("Here is some text"), makeString("<br/>"), makeString("</body>"), makeString("</html>"))), list(list(makeString("html")), list(list(makeString("body"), cons(makeString("bgcolor"), makeString("3"))), makeString("Here is some text"), list(list(makeString("br")))))));
  public static final SubLSymbol $sym255$PARSE_HTML_TOKEN = makeSymbol("PARSE-HTML-TOKEN");
  public static final SubLList $list256 = list(list(list(makeString("<pre style=\"display:none\" id=RadEditorEncodedTag>")), list(makeString("pre"), cons(makeString("style"), makeString("display:none")), cons(makeString("id"), makeString("RadEditorEncodedTag")))), list(list(makeString("<pre id=RadEditorEncodedTag style=\"display:none\">")), list(makeString("pre"), cons(makeString("id"), makeString("RadEditorEncodedTag")), cons(makeString("style"), makeString("display:none")))));
  public static final SubLSymbol $sym257$PARSE_XML_TOKEN = makeSymbol("PARSE-XML-TOKEN");
  public static final SubLObject $list258 = _constant_258_initializer();

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_258_initializer() {
    return list(new SubLObject[] {list(list(makeString("<owl:onProperty/>")), list(makeString("owl:onProperty"))), list(list(makeString("<owl:Class rdf:ID=\"MarineEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"PackIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PackIce")))), list(list(makeString("<owl:Class rdf:ID=\"SubmarineCanyon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubmarineCanyon")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Ocean\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Ocean")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SnowLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SnowLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Hydrosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Cryosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Lake\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<rdfs:range rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Stratosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Litter\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Litter")))), list(list(makeString("<owl:Class rdf:ID=\"Pond\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pond")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:ID=\"LowerMantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerMantle")))), list(list(makeString("<owl:Class rdf:about=\"#Catchment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Catchment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MantleLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TroposphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TroposphereLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"IntertidalZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IntertidalZone")))), list(list(makeString("<owl:Class rdf:ID=\"Cirque\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cirque")))), list(list(makeString("<owl:Class rdf:ID=\"EcosystemType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"PeriglacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PeriglacialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Mantle\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mantle")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Hydrosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Hydrosphere")))), list(list(makeString("<owl:Class rdf:ID=\"TemperateClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TemperateClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"Fjord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Ocean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ocean")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"Felsic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Felsic")))), list(list(makeString("<owl:Class rdf:ID=\"Beach\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Beach")))), list(list(makeString("<owl:Class rdf:ID=\"Core\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Core")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Basin\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:Class rdf:ID=\"Mesosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mesosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:ID=\"Marsh\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Marsh")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Rock")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl#Height\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl#Height")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Glacier\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Glacier")))), list(list(makeString("<owl:Class rdf:ID=\"Watershed\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Watershed")))), list(list(makeString("<owl:Class rdf:ID=\"Shoreline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoreline")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Crust\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#haslowerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"RegionProperty\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RegionProperty")))), list(list(makeString("<owl:Class rdf:ID=\"MarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MarineWetland")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/property.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/property.owl")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasUpperBoundary")))), list(list(makeString("<owl:Class rdf:about=\"#VadoseZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#VadoseZone")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"EstuarineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EstuarineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"Volcano\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Volcano")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#surroundedBy_2D")))), list(list(makeString("<owl:Class rdf:about=\"#OceanRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#OceanRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Stream\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Stream")))), list(list(makeString("<owl:Class rdf:about=\"#Ocean\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Ocean")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Mantle\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Mantle")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"WaterTable\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterTable")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TopographicalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TopographicalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Spring\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Spring")))), list(list(makeString("<owl:Class rdf:ID=\"Tropopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tropopause")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurfaceLayer")))), list(list(makeString("<owl:Class>")), list(makeString("owl:Class"))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<rdfs:range rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#GeometricalObject")))), list(list(makeString("<owl:Class rdf:ID=\"Plateau\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plateau")))), list(list(makeString("<owl:Class rdf:ID=\"AphoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AphoticZone")))), list(list(makeString("<owl:Class rdf:ID=\"IslandArc\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IslandArc")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:about=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurface")))), list(list(makeString("<owl:onProperty rdf:resource=\"#primarySubstance\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#primarySubstance")))), list(list(makeString("<owl:Class rdf:about=\"#Groundwater\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:ID=\"FastIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FastIce")))), list(list(makeString("<owl:Class rdf:ID=\"Swamp\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Swamp")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandWaterObject\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"PhoticZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PhoticZone")))), list(list(makeString("<rdfs:range rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"LandIceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EolianLandform\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EolianLandform")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:ID=\"Rock_body\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Rock_body")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Farmland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Farmland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasGeomorphologicalType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasGeomorphologicalType")))), list(list(makeString("<owl:Class rdf:about=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#DepthHoar")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Polygon")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TerrestrialEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Sea\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sea")))), list(list(makeString("<owl:Class rdf:ID=\"KarstLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("KarstLandform")))), list(list(makeString("<owl:Class rdf:ID=\"Troposphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Troposphere")))), list(list(makeString("<owl:Class rdf:ID=\"AlpineClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AlpineClimateZone")))), list(list(makeString("<owl:Class rdf:ID=\"GlacialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlacialLandform")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GroundWaterObjectBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GroundWaterObjectBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"BenticEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BenticEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Isopycnal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isopycnal")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoastalRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#OceanRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#OceanRegion")))), list(list(makeString("<owl:Class rdf:about=\"#LandRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandRegion")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UndergroundWater\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"Mafic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mafic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"Delta\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Delta")))), list(list(makeString("<owl:Class rdf:ID=\"SeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"Creek\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Creek")))), list(list(makeString("<owl:Class rdf:ID=\"LandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Thermosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Ridge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ridge")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#Floodplain\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Floodplain")))), list(list(makeString("<owl:Class rdf:ID=\"SnowLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowLayer")))), list(list(makeString("<owl:allValuesFrom>")), list(makeString("owl:allValuesFrom"))), list(list(makeString("<owl:Class rdf:ID=\"IceFloe\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceFloe")))), list(list(makeString("<owl:Class rdf:ID=\"DryLandRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DryLandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Aquifer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aquifer")))), list(list(makeString("<owl:Class rdf:ID=\"MiddleAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MiddleAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Biosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Biosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"CoralReef\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoralReef")))), list(list(makeString("<owl:Class rdf:ID=\"ContinentalMargin\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ContinentalMargin")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceWater")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#EarthRealm\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<owl:Class rdf:ID=\"Estuary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Estuary")))), list(list(makeString("<owl:Class rdf:ID=\"IceCore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceCore")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"CrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CrustLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#SeaFloorRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Plain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Plain")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Benthos\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthos")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MarineEcosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MarineEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"MixedLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MixedLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Stratosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"SolidEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SolidEarth")))), list(list(makeString("<owl:Class rdf:ID=\"SoilLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SoilLayer")))), list(list(makeString("<owl:Class rdf:ID=\"HydrosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"EolianLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EolianLandform")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloor\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"Benthic\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Benthic")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PermafrostZone\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PermafrostZone")))), list(list(makeString("<owl:Class rdf:ID=\"TectonicLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TectonicLandform")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasLowerBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryHeight")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Thermosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Thermosphere")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasLowerBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasLowerBoundaryReferenceHeight")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CryosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CryosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Mountain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mountain")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isAdjacentTo")))), list(list(makeString("<owl:Class rdf:ID=\"CryosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CryosphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorGroundLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:ID=\"TerrrestrialWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrrestrialWetland")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Region\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Region")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#TroposphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#TroposphereLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Snow")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterSurfaceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#inside\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#inside")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<owl:Class rdf:ID=\"PalustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PalustrineWetland")))), list(list(makeString("<rdfs:range rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Atmosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"FreshwaterLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FreshwaterLake")))), list(list(makeString("<owl:Class rdf:ID=\"FluvialLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FluvialLandform")))), list(list(makeString("<owl:Class rdf:ID=\"HydrothermalVents\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("HydrothermalVents")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Groundwater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Groundwater")))), list(list(makeString("<owl:Class rdf:about=\"#Basin\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorGroundLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorGroundLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Forest_Ecosystem\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Bedrock\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Bedrock")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:Class rdf:ID=\"LacustrineWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LacustrineWetland")))), list(list(makeString("<owl:Class rdf:ID=\"CostalLandform\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CostalLandform")))), list(list(makeString("<owl:Class rdf:ID=\"ClimateZoneType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ClimateZoneType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#TectonicLandform\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#TectonicLandform")))), list(list(makeString("<owl:Class rdf:ID=\"TropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TropicalClimateZone")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasEcosystemType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasEcosystemType")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasEcosystemType\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasEcosystemType")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#PlanetarySurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundWaterObjectBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundWaterObjectBoundary")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lake\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lake")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isPartOf")))), list(list(makeString("<owl:Class rdf:ID=\"RockGlacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockGlacier")))), list(list(makeString("<owl:Class rdf:ID=\"SubsurfaceWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubsurfaceWater")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterRegion")))), list(list(makeString("<rdfs:domain rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LithosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LithosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"MontaneForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MontaneForest")))), list(list(makeString("<owl:Class rdf:ID=\"CaveEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CaveEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Tundra_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Tundra_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"Dune\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Dune")))), list(list(makeString("<owl:Class rdf:ID=\"DemersalEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DemersalEcosystem")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandIceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandIceLayer")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<owl:Class rdf:ID=\"BarrierIsland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BarrierIsland")))), list(list(makeString("<owl:Class rdf:ID=\"Leads\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Leads")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"MangroveForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MangroveForest")))), list(list(makeString("<owl:Class rdf:ID=\"Grassland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Grassland")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"coveredBySubstance_temporary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("coveredBySubstance_temporary")))), list(list(makeString("<owl:Class rdf:ID=\"UrbanLand\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UrbanLand")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Ionosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Ionosphere")))), list(list(makeString("<owl:Class rdf:ID=\"PelagicEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PelagicEcosystem")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Farmland\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Farmland")))), list(list(makeString("<owl:onProperty rdf:resource=\"#hasLowerBoundaryReferenceHeight\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("#hasLowerBoundaryReferenceHeight")))), list(list(makeString("<owl:Class rdf:ID=\"OceanLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#PlanetarySurface\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#PlanetarySurface")))), list(list(makeString("<owl:Class rdf:ID=\"Iceberg\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Iceberg")))), list(list(makeString("<owl:Class rdf:ID=\"Aeoliean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Aeoliean")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Geosphere\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Isobar\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Isobar")))), list(list(makeString("<owl:Class rdf:ID=\"LandwaterRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandwaterRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasClimateZoneType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"SnowField\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SnowField")))), list(list(makeString("<owl:Class rdf:ID=\"RiftValley\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiftValley")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LakeLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LakeLayer")))), list(list(makeString("<owl:disjointWith rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:disjointWith"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:about=\"#Dam\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Dam")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Rock_body\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Rock_body")))), list(list(makeString("<owl:Class rdf:ID=\"Lagoon\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lagoon")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#OceanLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#OceanLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfSeaIce\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfSeaIce")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Seamount\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Seamount")))), list(list(makeString("<owl:Class rdf:ID=\"Lithosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lithosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaSurface")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#MantleLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#MantleLayer")))), list(list(makeString("<owl:Class rdf:ID=\"IceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"SurfaceRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SurfaceRegion")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#double\">")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#double")))), list(list(makeString("<owl:Class rdf:ID=\"Asthenosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Asthenosphere")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#LandRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"primarySubstance\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("primarySubstance")))), list(list(makeString("<owl:Class rdf:ID=\"Thermocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Thermocline")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Trench\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Trench")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CrustLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Lithosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Lithosphere")))), list(list(makeString("<owl:Class rdf:ID=\"fiord\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("fiord")))), list(list(makeString("<owl:Class rdf:ID=\"Land\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land")))), list(list(makeString("<owl:Class rdf:ID=\"ArcticClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ArcticClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#BodyBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"SubtropicalClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SubtropicalClimateZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Water\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Water")))), list(list(makeString("<owl:Class rdf:ID=\"SeaSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaSurfaceLayer")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#Fjord\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#Fjord")))), list(list(makeString("<owl:Class rdf:ID=\"Mesopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Mesopause")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfGround\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfGround")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfSeaIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfSeaIce")))), list(list(makeString("<owl:Class rdf:ID=\"WaterChannel\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterChannel")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Cryosol")))), list(list(makeString("<owl:Class rdf:ID=\"SedimentaryStructure\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SedimentaryStructure")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayerBoundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"F-Region\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("F-Region")))), list(list(makeString("<owl:Class rdf:ID=\"Lake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Lake")))), list(list(makeString("<owl:Class rdf:ID=\"Continent\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Continent")))), list(list(makeString("<owl:Class rdf:ID=\"FractureZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("FractureZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CrustLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"DepthHoarLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DepthHoarLayer")))), list(list(makeString("<owl:Class rdf:ID=\"WaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WaterSurface")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasPart")))), list(list(makeString("<owl:Class rdf:ID=\"Cave\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Cave")))), list(list(makeString("<owl:Class rdf:ID=\"LowerAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LowerAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Moho\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Moho")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#contains\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#contains")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Crust\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Crust")))), list(list(makeString("<owl:Class rdf:ID=\"Stream\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stream")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Air\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Air")))), list(list(makeString("<owl:Class rdf:ID=\"RiparianWetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RiparianWetland")))), list(list(makeString("<owl:someValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:someValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:range rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#CoreLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#CoreLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Polynya\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Polynya")))), list(list(makeString("<owl:Class rdf:ID=\"AtmosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#IceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#IceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalPlain\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalPlain")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#ChemicalSubstance")))), list(list(makeString("<owl:Class rdf:ID=\"GeomorphologicalRegionType\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Geosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Geosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterSurface\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterSurface")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#HydrosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#HydrosphereLayer")))), list(list(makeString("<owl:Class rdf:ID=\"GroundSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GroundSurfaceLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CaveEcosystem\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CaveEcosystem")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Soil")))), list(list(makeString("<owl:Class rdf:ID=\"AbyssalHill\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AbyssalHill")))), list(list(makeString("<owl:Class rdf:ID=\"RockyCoast\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("RockyCoast")))), list(list(makeString("<owl:Class rdf:ID=\"DesertClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DesertClimateZone")))), list(list(makeString("<rdfs:domain rdf:resource=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Magnetosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Magnetosphere")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EarthRealm\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Grassland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Grassland")))), list(list(makeString("<owl:onProperty rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf\"/>")), list(makeString("owl:onProperty"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLayerUpperBoundaryOf")))), list(list(makeString("<rdfs:range rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#LayerBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRidge\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRidge")))), list(list(makeString("<owl:Class rdf:ID=\"Atmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Atmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"GeosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GeosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Sediment")))), list(list(makeString("<rdfs:domain rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:domain"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#CoastalRegion\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasGeomorphologicalType\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasGeomorphologicalType")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayer")))), list(list(makeString("<owl:Class rdf:about=\"#Mesosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Mesosphere")))), list(list(makeString("<owl:Class rdf:ID=\"Land_WaterBoundary_2D\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Land_WaterBoundary_2D")))), list(list(makeString("<owl:Class rdf:ID=\"Forest_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Forest_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"AgriculturalLands\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("AgriculturalLands")))), list(list(makeString("<owl:DatatypeProperty rdf:ID=\"hasUpperBoundaryReferenceHeight\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryReferenceHeight")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl")))), list(list(makeString("<owl:Class rdf:ID=\"Talik\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Talik")))), list(list(makeString("<owl:Class rdf:ID=\"Inlet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Inlet")))), list(list(makeString("<owl:Class rdf:ID=\"Desert_Ecosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Desert_Ecosystem")))), list(list(makeString("<owl:Class rdf:ID=\"InversionLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("InversionLayer")))), list(list(makeString("<owl:Class rdf:ID=\"OceanCrustLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanCrustLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Shoal\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Shoal")))), list(list(makeString("<owl:Class rdf:ID=\"Wetland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LithosphereLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LithosphereLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#BodyOfGround\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#BodyOfGround")))), list(list(makeString("<owl:Class rdf:about=\"#SubsurfaceRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#SubsurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"IceSheet\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("IceSheet")))), list(list(makeString("<owl:Class rdf:ID=\"Glacier\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Glacier")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandSurface")))), list(list(makeString("<owl:Class rdf:ID=\"Littoral\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Littoral")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isUpperBoundaryOf")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#UndergroundWater\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#UndergroundWater")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ice")))), list(list(makeString("<owl:Class rdf:ID=\"SkinLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SkinLayer")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#isLowerBoundaryOf")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_flowing\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_flowing")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GlobalPlanetaryLayers\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GlobalPlanetaryLayers")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WaterSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Savanna\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Savanna")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Basin\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Basin")))), list(list(makeString("<owl:Class rdf:ID=\"OceanRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("OceanRegion")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetEarth\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetEarth")))), list(list(makeString("<owl:Class rdf:ID=\"BoundaryLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BoundaryLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Crust\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Crust")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#EcosystemType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#EcosystemType")))), list(list(makeString("<owl:Class rdf:ID=\"ActiveLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("ActiveLayer")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Layer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Layer")))), list(list(makeString("<owl:Class rdf:ID=\"LandIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandIce")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Wetland\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Wetland")))), list(list(makeString("<owl:Class rdf:ID=\"LandSurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Trench\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Trench")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasRegionBoundary")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#RegionProperty\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#RegionProperty")))), list(list(makeString("<owl:ObjectProperty rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#hasCommon2DBorderWith")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#ClimateZoneType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#ClimateZoneType")))), list(list(makeString("<owl:Class rdf:ID=\"MantleLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MantleLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SeaIceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SeaIceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"River\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("River")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#LandWaterSurface\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#LandWaterSurface")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Troposphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Troposphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandWaterObject\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"TopographicalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TopographicalRegion")))), list(list(makeString("<owl:Class rdf:about=\"#CoastalRegion\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#CoastalRegion")))), list(list(makeString("<owl:Class rdf:ID=\"Stratopause\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Stratopause")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAtmosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAtmosphere")))), list(list(makeString("<owl:Class rdf:ID=\"DeepOcean\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("DeepOcean")))), list(list(makeString("<owl:Class rdf:ID=\"BorealForest\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BorealForest")))), list(list(makeString("<owl:Class rdf:ID=\"Nearshore\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Nearshore")))), list(list(makeString("<owl:Class rdf:ID=\"GlobalPlanetaryLayers\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("GlobalPlanetaryLayers")))), list(list(makeString("<owl:Class rdf:ID=\"UpperAir\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperAir")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Cryosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Cryosphere")))), list(list(makeString("<owl:Class rdf:ID=\"LakeLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LakeLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Permafrost\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Permafrost")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#SeaFloorWaterLayer\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#SeaFloorWaterLayer")))), list(list(makeString("<owl:Class rdf:ID=\"UpperMantle_rigid\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UpperMantle_rigid")))), list(list(makeString("<owl:Class rdf:ID=\"CoastalRegion\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoastalRegion")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Ionosphere\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Ionosphere")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#Island\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandSurfaceLayer\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"PlanetarySurfaceLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PlanetarySurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Exosphere\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Exosphere")))), list(list(makeString("<owl:Class rdf:about=\"#LandwaterSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandwaterSurfaceLayer")))), list(list(makeString("<owl:Class rdf:ID=\"Sky\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Sky")))), list(list(makeString("<owl:equivalentClass rdf:resource=\"#UpperMantle_flowing\"/>")), list(makeString("owl:equivalentClass"), cons(makeString("rdf:resource"), makeString("#UpperMantle_flowing")))), list(list(makeString("<owl:Class rdf:about=\"http://www.w3.org/2002/07/owl#Thing\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://www.w3.org/2002/07/owl#Thing")))), list(list(makeString("<owl:Class rdf:ID=\"Peatland\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Peatland")))), list(list(makeString("<owl:Class rdf:about=\"#LandSurfaceLayer\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#LandSurfaceLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#SurfaceRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#SurfaceRegion")))), list(list(makeString("<owl:Class rdf:ID=\"MediterraneanClimateZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("MediterraneanClimateZone")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"Island\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Island")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#LandwaterRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#LandwaterRegion")))), list(list(makeString("<owl:Class rdf:about=\"#Stratosphere\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("#Stratosphere")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfWater")))), list(list(makeString("<owl:Class rdf:ID=\"EarthRealm\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("EarthRealm")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#WetlandRegion\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#WetlandRegion")))), list(list(makeString("<owl:imports rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl\"/>")), list(makeString("owl:imports"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloorWaterLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloorWaterLayer")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("http://sweet.jpl.nasa.gov/ontology/substance.owl#Ground_substance")))), list(list(makeString("<owl:Class rdf:ID=\"Halocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Halocline")))), list(list(makeString("<owl:ObjectProperty rdf:ID=\"hasUpperBoundaryHeight\">")), list(makeString("owl:ObjectProperty"), cons(makeString("rdf:ID"), makeString("hasUpperBoundaryHeight")))), list(list(makeString("<owl:Class rdf:ID=\"TerrestrialEcosystem\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("TerrestrialEcosystem")))), list(list(makeString("<owl:Class rdf:ID=\"SalineLake\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SalineLake")))), list(list(makeString("<owl:Class rdf:ID=\"WetlandRegion\" xmlns:rdf=\"http://rdf.com/\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("WetlandRegion")), cons(makeString("xmlns:rdf"), makeString("http://rdf.com/")))), list(list(makeString("<owl:Class rdf:ID=\"CoreLayer\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("CoreLayer")))), list(list(makeString("<rdfs:subClassOf rdf:resource=\"#AtmosphereLayerBoundary\"/>")), list(makeString("rdfs:subClassOf"), cons(makeString("rdf:resource"), makeString("#AtmosphereLayerBoundary")))), list(list(makeString("<owl:Class rdf:ID=\"UndergroundWater\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("UndergroundWater")))), list(list(makeString("<owl:Class rdf:ID=\"SeaFloor\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("SeaFloor")))), list(list(makeString("<owl:Class rdf:ID=\"LandWaterObject\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("LandWaterObject")))), list(list(makeString("<owl:Class rdf:ID=\"Pycnocline\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Pycnocline")))), list(list(makeString("<rdfs:range rdf:resource=\"#GeomorphologicalRegionType\"/>")), list(makeString("rdfs:range"), cons(makeString("rdf:resource"), makeString("#GeomorphologicalRegionType")))), list(list(makeString("<owl:Class rdf:ID=\"BodyOfIce\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("BodyOfIce")))), list(list(makeString("<owl:Class rdf:ID=\"PermafrostZone\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("PermafrostZone")))), list(list(makeString("<owl:allValuesFrom rdf:resource=\"#Atmosphere\"/>")), list(makeString("owl:allValuesFrom"), cons(makeString("rdf:resource"), makeString("#Atmosphere")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary\">")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/numerics.owl#Boundary")))), list(list(makeString("<owl:Class rdf:about=\"http://sweet.jpl.nasa.gov/ontology/space.owl#Body\"/>")), list(makeString("owl:Class"), cons(makeString("rdf:about"), makeString("http://sweet.jpl.nasa.gov/ontology/space.owl#Body")))), list(list(makeString("<owl:hasValue rdf:datatype=\"http://www.w3.org/2001/XMLSchema#boolean\"\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:hasValue rdf:datatype='http://www.w3.org/2001/XMLSchema#boolean'\n        >")), list(makeString("owl:hasValue"), cons(makeString("rdf:datatype"), makeString("http://www.w3.org/2001/XMLSchema#boolean")))), list(list(makeString("<owl:Class rdf:ID=\"Z\">")), list(makeString("owl:Class"), cons(makeString("rdf:ID"), makeString("Z")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID= \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<owl:DatatypeProperty  rdf:ID = \"AbsoluteValueFn\">")), list(makeString("owl:DatatypeProperty"), cons(makeString("rdf:ID"), makeString("AbsoluteValueFn")))), list(list(makeString("<rdf:RDF\n\nxmlns:rdf =\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"\n\nxmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\"\n\n xmlns:owl=\"http://www.w3.org/2002/07/owl#\"\n\nxmlns     =\"http://reliant.teknowledge.com/DAML/SUMO.owl#\"\n\n>")), list(makeString("rdf:RDF"), cons(makeString("xmlns:rdf"), makeString("http://www.w3.org/1999/02/22-rdf-syntax-ns#")), cons(makeString("xmlns:rdfs"), makeString("http://www.w3.org/2000/01/rdf-schema#")), cons(makeString("xmlns:owl"), makeString("http://www.w3.org/2002/07/owl#")), cons(makeString("xmlns"), makeString("http://reliant.teknowledge.com/DAML/SUMO.owl#"))))});
  }

  //// Initializers

  public void declareFunctions() {
    declare_web_utilities_file();
  }

  public void initializeVariables() {
    init_web_utilities_file();
  }

  public void runTopLevelForms() {
    setup_web_utilities_file();
  }

}
