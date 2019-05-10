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

package  com.cyc.cycjava_1.cycl;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.ArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeChar;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeGuid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;


import com.cyc.cycjava_1.cycl.access_macros;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_variables;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.misc_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.unicode_strings;
import com.cyc.cycjava_1.cycl.web_utilities;

public  final class xml_utilities extends SubLTranslatedFile {

  //// Constructor

  private xml_utilities() {}
  public static final SubLFile me = new xml_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.xml_utilities";

  //// Definitions

  @SubL(source = "cycl/xml-utilities.lisp", position = 1033) 
  private static SubLSymbol $xml_version$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 1133) 
  public static SubLSymbol $xml_indentation_level$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 1185) 
  public static SubLSymbol $xml_indentation_amount$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 1359) 
  public static SubLSymbol $cycml_indent_level$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 3721) 
  private static SubLSymbol $xml_cdata_prefix$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 3840) 
  private static SubLSymbol $xml_cdata_suffix$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 11201) 
  private static SubLSymbol $xml_base_char_code_ranges$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 14731) 
  private static SubLSymbol $xml_ideographic_char_code_ranges$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 16095) 
  public static SubLSymbol $xml_special_chars$ = null;

  @SubL(source = "cycl/xml-utilities.lisp", position = 23391) 
  private static SubLSymbol $alists_sort_key$ = null;

  public static final SubLObject declare_xml_utilities_file() {
    declareFunction(myName, "xml_version", "XML-VERSION", 0, 0, false);
    declareFunction(myName, "xml_add_indentation", "XML-ADD-INDENTATION", 0, 1, false);
    declareMacro(myName, "with_xml_indentation", "WITH-XML-INDENTATION");
    declareFunction(myName, "xml_terpri", "XML-TERPRI", 0, 0, false);
    declareFunction(myName, "xml_write_string", "XML-WRITE-STRING", 1, 2, false);
    declareFunction(myName, "xml_write_char", "XML-WRITE-CHAR", 1, 0, false);
    declareFunction(myName, "xml_write_string_indented", "XML-WRITE-STRING-INDENTED", 1, 2, false);
    declareFunction(myName, "xml_header", "XML-HEADER", 0, 3, false);
    declareFunction(myName, "xml_cdata_prefix", "XML-CDATA-PREFIX", 0, 0, false);
    declareFunction(myName, "xml_cdata_suffix", "XML-CDATA-SUFFIX", 0, 0, false);
    declareFunction(myName, "xml_cdata", "XML-CDATA", 1, 0, false);
    declareFunction(myName, "xml_markup", "XML-MARKUP", 1, 0, false);
    declareFunction(myName, "xml_comment", "XML-COMMENT", 1, 0, false);
    declareMacro(myName, "xml_tag", "XML-TAG");
    declareFunction(myName, "xml_start_tag_internal", "XML-START-TAG-INTERNAL", 3, 0, false);
    declareFunction(myName, "xml_end_tag_internal", "XML-END-TAG-INTERNAL", 1, 0, false);
    declareFunction(myName, "xml_print", "XML-PRINT", 1, 1, false);
    declareFunction(myName, "xml_prin1", "XML-PRIN1", 1, 1, false);
    declareFunction(myName, "xml_print_line", "XML-PRINT-LINE", 1, 1, false);
    declareFunction(myName, "xml_prin1_line", "XML-PRIN1-LINE", 1, 1, false);
    declareFunction(myName, "xml_write", "XML-WRITE", 1, 1, false);
    declareFunction(myName, "xml_write_line", "XML-WRITE-LINE", 1, 1, false);
    declareFunction(myName, "valid_xml_name_p", "VALID-XML-NAME-P", 1, 0, false);
    declareFunction(myName, "remove_invalid_xml_name_chars", "REMOVE-INVALID-XML-NAME-CHARS", 1, 0, false);
    declareFunction(myName, "valid_ascii_xml_name_p", "VALID-ASCII-XML-NAME-P", 1, 0, false);
    declareFunction(myName, "valid_xml_name_initial_char_p", "VALID-XML-NAME-INITIAL-CHAR-P", 1, 0, false);
    declareFunction(myName, "valid_xml_name_initial_char_code_p", "VALID-XML-NAME-INITIAL-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "valid_non_ascii_xml_name_p", "VALID-NON-ASCII-XML-NAME-P", 1, 0, false);
    declareFunction(myName, "valid_xml_name_char_p", "VALID-XML-NAME-CHAR-P", 1, 0, false);
    declareFunction(myName, "remove_invalid_xml_name_chars_from_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-ASCII-STRING", 1, 0, false);
    declareFunction(myName, "remove_invalid_xml_name_chars_from_non_ascii_string", "REMOVE-INVALID-XML-NAME-CHARS-FROM-NON-ASCII-STRING", 1, 0, false);
    declareFunction(myName, "valid_xml_name_char_code_p", "VALID-XML-NAME-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "digit_char_code_p", "DIGIT-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "xml_letter_char_p", "XML-LETTER-CHAR-P", 1, 0, false);
    declareFunction(myName, "xml_letter_char_code_p", "XML-LETTER-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "xml_base_char_p", "XML-BASE-CHAR-P", 1, 0, false);
    declareFunction(myName, "xml_base_char_code_p", "XML-BASE-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "xml_ideographic_char_p", "XML-IDEOGRAPHIC-CHAR-P", 1, 0, false);
    declareFunction(myName, "xml_ideographic_char_code_p", "XML-IDEOGRAPHIC-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "valid_xml_char_p", "VALID-XML-CHAR-P", 1, 0, false);
    declareFunction(myName, "valid_xml_char_code_p", "VALID-XML-CHAR-CODE-P", 1, 0, false);
    declareFunction(myName, "char_in_ranges_p", "CHAR-IN-RANGES-P", 2, 0, false);
    declareFunction(myName, "char_code_in_ranges_p", "CHAR-CODE-IN-RANGES-P", 2, 0, false);
    declareFunction(myName, "xml_special_charP", "XML-SPECIAL-CHAR?", 1, 0, false);
    declareFunction(myName, "xml_char_escaped_version", "XML-CHAR-ESCAPED-VERSION", 1, 0, false);
    declareFunction(myName, "xml_write_wXescaped_special_chars", "XML-WRITE-W/ESCAPED-SPECIAL-CHARS", 1, 0, false);
    declareFunction(myName, "possible_xml_entity_reference_p", "POSSIBLE-XML-ENTITY-REFERENCE-P", 1, 2, false);
    declareFunction(myName, "possible_xml_entity_name_p", "POSSIBLE-XML-ENTITY-NAME-P", 1, 0, false);
    declareFunction(myName, "possible_xml_numeric_character_reference_p", "POSSIBLE-XML-NUMERIC-CHARACTER-REFERENCE-P", 1, 0, false);
    declareFunction(myName, "valid_xml_entity_name_first_char_p", "VALID-XML-ENTITY-NAME-FIRST-CHAR-P", 1, 0, false);
    declareFunction(myName, "valid_xml_entity_name_char_p", "VALID-XML-ENTITY-NAME-CHAR-P", 1, 0, false);
    declareMacro(myName, "with_xml_output_to_stream", "WITH-XML-OUTPUT-TO-STREAM");
    declareMacro(myName, "with_xml_output_to_string", "WITH-XML-OUTPUT-TO-STRING");
    declareFunction(myName, "generate_valid_xml_header", "GENERATE-VALID-XML-HEADER", 1, 0, false);
    declareFunction(myName, "generate_xml_header_entry_for_dtd", "GENERATE-XML-HEADER-ENTRY-FOR-DTD", 3, 0, false);
    declareFunction(myName, "resolve_xml_namespaces", "RESOLVE-XML-NAMESPACES", 2, 0, false);
    declareFunction(myName, "maybe_resolve_xml_namespace", "MAYBE-RESOLVE-XML-NAMESPACE", 3, 0, false);
    declareFunction(myName, "resolve_xml_namespace", "RESOLVE-XML-NAMESPACE", 3, 0, false);
    declareFunction(myName, "xml_sexpr_output_as_xml", "XML-SEXPR-OUTPUT-AS-XML", 1, 0, false);
    declareFunction(myName, "xml_sexpr_output_daughters", "XML-SEXPR-OUTPUT-DAUGHTERS", 1, 1, false);
    declareFunction(myName, "xml_tag_attributes_from_sexpr", "XML-TAG-ATTRIBUTES-FROM-SEXPR", 1, 0, false);
    declareFunction(myName, "alists_sort_key", "ALISTS-SORT-KEY", 1, 0, false);
    declareFunction(myName, "attribute_vars", "ATTRIBUTE-VARS", 1, 0, false);
    declareFunction(myName, "sort_query_results_on_el_var", "SORT-QUERY-RESULTS-ON-EL-VAR", 2, 0, false);
    declareFunction(myName, "write_xml_from_grouped_bindings", "WRITE-XML-FROM-GROUPED-BINDINGS", 5, 0, false);
    declareFunction(myName, "query_bindings_to_xml", "QUERY-BINDINGS-TO-XML", 5, 0, false);
    declareFunction(myName, "get_default_xml_spec_for_el_vars", "GET-DEFAULT-XML-SPEC-FOR-EL-VARS", 1, 0, false);
    declareFunction(myName, "query_bindings_to_xml_stream", "QUERY-BINDINGS-TO-XML-STREAM", 4, 1, false);
    declareFunction(myName, "query_results_to_xml_stream", "QUERY-RESULTS-TO-XML-STREAM", 1, 4, false);
    declareFunction(myName, "query_results_to_xml_file", "QUERY-RESULTS-TO-XML-FILE", 2, 3, false);
    declareFunction(myName, "query_results_to_xml_string", "QUERY-RESULTS-TO-XML-STRING", 1, 3, false);
    declareFunction(myName, "boolean_to_trueXfalse_string", "BOOLEAN-TO-TRUE/FALSE-STRING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_xml_utilities_file() {
    $xml_version$ = defparameter("*XML-VERSION*", $float0$1_0);
    $xml_indentation_level$ = defparameter("*XML-INDENTATION-LEVEL*", ZERO_INTEGER);
    $xml_indentation_amount$ = defparameter("*XML-INDENTATION-AMOUNT*", ONE_INTEGER);
    $cycml_indent_level$ = defparameter("*CYCML-INDENT-LEVEL*", ZERO_INTEGER);
    $xml_cdata_prefix$ = deflexical("*XML-CDATA-PREFIX*", $str17$___CDATA_);
    $xml_cdata_suffix$ = deflexical("*XML-CDATA-SUFFIX*", $str18$___);
    $xml_base_char_code_ranges$ = deflexical("*XML-BASE-CHAR-CODE-RANGES*", $list36);
    $xml_ideographic_char_code_ranges$ = deflexical("*XML-IDEOGRAPHIC-CHAR-CODE-RANGES*", $list37);
    $xml_special_chars$ = defconstant("*XML-SPECIAL-CHARS*", $list39);
    $alists_sort_key$ = defparameter("*ALISTS-SORT-KEY*", NIL);
    return NIL;
  }

  public static final SubLObject setup_xml_utilities_file() {
    // CVS_ID("Id: xml-utilities.lisp 127218 2009-02-21 18:32:48Z baxter ");
    access_macros.define_obsolete_register($sym60$GENERATE_VALID_XML_HEADER, $list61);
    access_macros.register_external_symbol($sym93$QUERY_RESULTS_TO_XML_STREAM);
    access_macros.register_external_symbol($sym95$QUERY_RESULTS_TO_XML_FILE);
    access_macros.register_external_symbol($sym98$QUERY_RESULTS_TO_XML_STRING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLFloat $float0$1_0 = makeDouble(1.0);
  public static final SubLSymbol $sym1$CLET = makeSymbol("CLET");
  public static final SubLList $list2 = list(list(makeSymbol("*XML-INDENTATION-LEVEL*"), list(makeSymbol("+"), makeSymbol("*XML-INDENTATION-AMOUNT*"), makeSymbol("*XML-INDENTATION-LEVEL*"))), list(makeSymbol("*CYCML-INDENT-LEVEL*"), makeSymbol("*XML-INDENTATION-LEVEL*")));
  public static final SubLSymbol $sym3$VALID_XML_CHAR_P = makeSymbol("VALID-XML-CHAR-P");
  public static final SubLString $str4$Skipping_invalid_xml_character__S = makeString("Skipping invalid xml character ~S in ~S");
  public static final SubLSymbol $sym5$CHAR_ = makeSymbol("CHAR=");
  public static final SubLString $str6$US_ASCII = makeString("US-ASCII");
  public static final SubLSymbol $sym7$FLOATP = makeSymbol("FLOATP");
  public static final SubLSymbol $sym8$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym9$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLString $str10$__xml_version_ = makeString("<?xml version=");
  public static final SubLSymbol $sym11$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str12$_encoding_ = makeString(" encoding=");
  public static final SubLString $str13$_standalone_ = makeString(" standalone=");
  public static final SubLString $str14$yes = makeString("yes");
  public static final SubLString $str15$no = makeString("no");
  public static final SubLString $str16$__ = makeString("?>");
  public static final SubLString $str17$___CDATA_ = makeString("<![CDATA[");
  public static final SubLString $str18$___ = makeString("]]>");
  public static final SubLString $str19$____ = makeString("<!--");
  public static final SubLString $str20$___ = makeString("-->");
  public static final SubLList $list21 = list(list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("ATTRIBUTES"), makeSymbol("ATOMIC?"), makeSymbol("NO-NESTED-ELEMENTS?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym22$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym23$WITH_XML_INDENTATION = makeSymbol("WITH-XML-INDENTATION");
  public static final SubLSymbol $sym24$XML_START_TAG_INTERNAL = makeSymbol("XML-START-TAG-INTERNAL");
  public static final SubLSymbol $sym25$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list26 = list(list(makeSymbol("XML-TERPRI")));
  public static final SubLSymbol $sym27$XML_END_TAG_INTERNAL = makeSymbol("XML-END-TAG-INTERNAL");
  public static final SubLString $str28$__ = makeString("=\"");
  public static final SubLString $str29$__ = makeString("/>");
  public static final SubLString $str30$__ = makeString("</");
  public static final SubLString $str31$_ = makeString("&");
  public static final SubLString $str32$_ = makeString(";");
  public static final SubLSymbol $sym33$VALID_XML_NAME_CHAR_P = makeSymbol("VALID-XML-NAME-CHAR-P");
  public static final SubLSymbol $sym34$VALID_XML_NAME_CHAR_CODE_P = makeSymbol("VALID-XML-NAME-CHAR-CODE-P");
  public static final SubLList $list35 = list(makeInteger(46), makeInteger(45), makeInteger(95), makeInteger(58));
  public static final SubLObject $list36 = _constant_36_initializer();
  public static final SubLList $list37 = list(list(makeInteger(19968), makeInteger(40869)), list(makeInteger(12295), makeInteger(12295)), list(makeInteger(12321), makeInteger(12329)));
  public static final SubLList $list38 = list(makeSymbol("LOW"), makeSymbol("HIGH"));
  public static final SubLList $list39 = list(Characters.CHAR_ampersand, Characters.CHAR_quotation, Characters.CHAR_quote, Characters.CHAR_greater, Characters.CHAR_less, Characters.CHAR_newline);
  public static final SubLString $str40$_ = makeString(" ");
  public static final SubLInteger $int41$34 = makeInteger(34);
  public static final SubLString $str42$_quot_ = makeString("&quot;");
  public static final SubLInteger $int43$38 = makeInteger(38);
  public static final SubLString $str44$_amp_ = makeString("&amp;");
  public static final SubLInteger $int45$39 = makeInteger(39);
  public static final SubLString $str46$_apos_ = makeString("&apos;");
  public static final SubLInteger $int47$60 = makeInteger(60);
  public static final SubLString $str48$_lt_ = makeString("&lt;");
  public static final SubLInteger $int49$62 = makeInteger(62);
  public static final SubLString $str50$_gt_ = makeString("&gt;");
  public static final SubLSymbol $sym51$DIGIT_CHAR_P = makeSymbol("DIGIT-CHAR-P");
  public static final SubLSymbol $sym52$HEX_CHAR_P = makeSymbol("HEX-CHAR-P");
  public static final SubLList $list53 = list(makeSymbol("STREAM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym54$_XML_STREAM_ = makeSymbol("*XML-STREAM*");
  public static final SubLList $list55 = list(makeSymbol("STRING-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym56$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym57$STREAM = makeUninternedSymbol("STREAM");
  public static final SubLSymbol $sym58$CWITH_OUTPUT_TO_STRING = makeSymbol("CWITH-OUTPUT-TO-STRING");
  public static final SubLSymbol $sym59$WITH_XML_OUTPUT_TO_STREAM = makeSymbol("WITH-XML-OUTPUT-TO-STREAM");
  public static final SubLSymbol $sym60$GENERATE_VALID_XML_HEADER = makeSymbol("GENERATE-VALID-XML-HEADER");
  public static final SubLList $list61 = list(makeSymbol("XML-HEADER"));
  public static final SubLString $str62$__DOCTYPE__A_SYSTEM__S_ = makeString("<!DOCTYPE ~A SYSTEM ~S>");
  public static final SubLList $list63 = cons(makeSymbol("ELEMENT-NAME"), makeSymbol("ATTRIBUTES"));
  public static final SubLString $str64$xmlns_ = makeString("xmlns:");
  public static final SubLList $list65 = cons(makeSymbol("ATTRIBUTE"), makeSymbol("VALUE"));
  public static final SubLList $list66 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLString $str67$xml_ = makeString("xml:");
  public static final SubLString $str68$http_ = makeString("http:");
  public static final SubLString $str69$Couldn_t_resolve__S_based_on__S_a = makeString("Couldn't resolve ~S based on ~S and ~S.");
  public static final SubLSymbol $sym70$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym71$TERM___WITH_CONSTANT_BY_NAME = makeSymbol("TERM-<-WITH-CONSTANT-BY-NAME");
  public static final SubLSymbol $sym72$ALISTS_SORT_KEY = makeSymbol("ALISTS-SORT-KEY");
  public static final SubLSymbol $kw73$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw74$ATTRIBUTES = makeKeyword("ATTRIBUTES");
  public static final SubLSymbol $kw75$ELEMENTS = makeKeyword("ELEMENTS");
  public static final SubLSymbol $kw76$TEXT = makeKeyword("TEXT");
  public static final SubLList $list77 = cons(makeSymbol("GROUPING-KEY-TUPLES"), makeSymbol("OTHER-BINDINGS"));
  public static final SubLString $str78$__A = makeString("<~A");
  public static final SubLString $str79$__ = makeString("#$");
  public static final SubLString $str80$__A__A = makeString(" ~A=~A");
  public static final SubLString $str81$___ = makeString(">~%");
  public static final SubLString $str82$_A__ = makeString("~A~%");
  public static final SubLString $str83$___A___ = makeString("</~A>~%");
  public static final SubLString $str84$____ = makeString("/>~%");
  public static final SubLSymbol $kw85$SORT_ASC = makeKeyword("SORT-ASC");
  public static final SubLSymbol $kw86$SORT_DESC = makeKeyword("SORT-DESC");
  public static final SubLString $str87$__name__binding___elements__ = makeString("(:name \"binding\" :elements (");
  public static final SubLString $str88$__name__ = makeString("(:name \"");
  public static final SubLString $str89$___text_ = makeString("\" :text ");
  public static final SubLString $str90$__ = makeString(") ");
  public static final SubLString $str91$__ = makeString("))");
  public static final SubLString $str92$root = makeString("root");
  public static final SubLSymbol $sym93$QUERY_RESULTS_TO_XML_STREAM = makeSymbol("QUERY-RESULTS-TO-XML-STREAM");
  public static final SubLSymbol $kw94$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym95$QUERY_RESULTS_TO_XML_FILE = makeSymbol("QUERY-RESULTS-TO-XML-FILE");
  public static final SubLSymbol $kw96$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str97$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLSymbol $sym98$QUERY_RESULTS_TO_XML_STRING = makeSymbol("QUERY-RESULTS-TO-XML-STRING");
  public static final SubLString $str99$true = makeString("true");
  public static final SubLString $str100$false = makeString("false");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_36_initializer() {
    return list(new SubLObject[] {list(makeInteger(65), makeInteger(90)), list(makeInteger(97), makeInteger(122)), list(makeInteger(192), makeInteger(214)), list(makeInteger(216), makeInteger(246)), list(makeInteger(248), makeInteger(255)), list(makeInteger(256), makeInteger(305)), list(makeInteger(308), makeInteger(318)), list(makeInteger(321), makeInteger(328)), list(makeInteger(330), makeInteger(382)), list(makeInteger(384), makeInteger(451)), list(makeInteger(461), makeInteger(496)), list(makeInteger(500), makeInteger(501)), list(makeInteger(506), makeInteger(535)), list(makeInteger(592), makeInteger(680)), list(makeInteger(699), makeInteger(705)), list(makeInteger(902), makeInteger(902)), list(makeInteger(904), makeInteger(906)), list(makeInteger(908), makeInteger(908)), list(makeInteger(910), makeInteger(929)), list(makeInteger(931), makeInteger(974)), list(makeInteger(976), makeInteger(982)), list(makeInteger(986), makeInteger(986)), list(makeInteger(988), makeInteger(988)), list(makeInteger(990), makeInteger(990)), list(makeInteger(992), makeInteger(992)), list(makeInteger(994), makeInteger(1011)), list(makeInteger(1025), makeInteger(1036)), list(makeInteger(1038), makeInteger(1103)), list(makeInteger(1105), makeInteger(1116)), list(makeInteger(1118), makeInteger(1153)), list(makeInteger(1168), makeInteger(1220)), list(makeInteger(1223), makeInteger(1224)), list(makeInteger(1227), makeInteger(1228)), list(makeInteger(1232), makeInteger(1259)), list(makeInteger(1262), makeInteger(1269)), list(makeInteger(1272), makeInteger(1273)), list(makeInteger(1329), makeInteger(1366)), list(makeInteger(1369), makeInteger(1369)), list(makeInteger(1377), makeInteger(1414)), list(makeInteger(1488), makeInteger(1514)), list(makeInteger(1520), makeInteger(1522)), list(makeInteger(1569), makeInteger(1594)), list(makeInteger(1601), makeInteger(1610)), list(makeInteger(1649), makeInteger(1719)), list(makeInteger(1722), makeInteger(1726)), list(makeInteger(1728), makeInteger(1742)), list(makeInteger(1744), makeInteger(1747)), list(makeInteger(1749), makeInteger(1749)), list(makeInteger(1765), makeInteger(1766)), list(makeInteger(2309), makeInteger(2361)), list(makeInteger(2365), makeInteger(2365)), list(makeInteger(2392), makeInteger(2401)), list(makeInteger(2437), makeInteger(2444)), list(makeInteger(2447), makeInteger(2448)), list(makeInteger(2451), makeInteger(2472)), list(makeInteger(2474), makeInteger(2480)), list(makeInteger(2482), makeInteger(2482)), list(makeInteger(2486), makeInteger(2489)), list(makeInteger(2524), makeInteger(2525)), list(makeInteger(2527), makeInteger(2529)), list(makeInteger(2544), makeInteger(2545)), list(makeInteger(2565), makeInteger(2570)), list(makeInteger(2575), makeInteger(2576)), list(makeInteger(2579), makeInteger(2600)), list(makeInteger(2602), makeInteger(2608)), list(makeInteger(2610), makeInteger(2611)), list(makeInteger(2613), makeInteger(2614)), list(makeInteger(2616), makeInteger(2617)), list(makeInteger(2649), makeInteger(2652)), list(makeInteger(2654), makeInteger(2654)), list(makeInteger(2674), makeInteger(2676)), list(makeInteger(2693), makeInteger(2699)), list(makeInteger(2701), makeInteger(2701)), list(makeInteger(2703), makeInteger(2705)), list(makeInteger(2707), makeInteger(2728)), list(makeInteger(2730), makeInteger(2736)), list(makeInteger(2738), makeInteger(2739)), list(makeInteger(2741), makeInteger(2745)), list(makeInteger(2749), makeInteger(2749)), list(makeInteger(2784), makeInteger(2784)), list(makeInteger(2821), makeInteger(2828)), list(makeInteger(2831), makeInteger(2832)), list(makeInteger(2835), makeInteger(2856)), list(makeInteger(2858), makeInteger(2864)), list(makeInteger(2866), makeInteger(2867)), list(makeInteger(2870), makeInteger(2873)), list(makeInteger(2877), makeInteger(2877)), list(makeInteger(2908), makeInteger(2909)), list(makeInteger(2911), makeInteger(2913)), list(makeInteger(2949), makeInteger(2954)), list(makeInteger(2958), makeInteger(2960)), list(makeInteger(2962), makeInteger(2965)), list(makeInteger(2969), makeInteger(2970)), list(makeInteger(2972), makeInteger(2972)), list(makeInteger(2974), makeInteger(2975)), list(makeInteger(2979), makeInteger(2980)), list(makeInteger(2984), makeInteger(2986)), list(makeInteger(2990), makeInteger(2997)), list(makeInteger(2999), makeInteger(3001)), list(makeInteger(3077), makeInteger(3084)), list(makeInteger(3086), makeInteger(3088)), list(makeInteger(3090), makeInteger(3112)), list(makeInteger(3114), makeInteger(3123)), list(makeInteger(3125), makeInteger(3129)), list(makeInteger(3168), makeInteger(3169)), list(makeInteger(3205), makeInteger(3212)), list(makeInteger(3214), makeInteger(3216)), list(makeInteger(3218), makeInteger(3240)), list(makeInteger(3242), makeInteger(3251)), list(makeInteger(3253), makeInteger(3257)), list(makeInteger(3294), makeInteger(3294)), list(makeInteger(3296), makeInteger(3297)), list(makeInteger(3333), makeInteger(3340)), list(makeInteger(3342), makeInteger(3344)), list(makeInteger(3346), makeInteger(3368)), list(makeInteger(3370), makeInteger(3385)), list(makeInteger(3424), makeInteger(3425)), list(makeInteger(3585), makeInteger(3630)), list(makeInteger(3632), makeInteger(3632)), list(makeInteger(3634), makeInteger(3635)), list(makeInteger(3648), makeInteger(3653)), list(makeInteger(3713), makeInteger(3714)), list(makeInteger(3716), makeInteger(3716)), list(makeInteger(3719), makeInteger(3720)), list(makeInteger(3722), makeInteger(3722)), list(makeInteger(3725), makeInteger(3725)), list(makeInteger(3732), makeInteger(3735)), list(makeInteger(3737), makeInteger(3743)), list(makeInteger(3745), makeInteger(3747)), list(makeInteger(3749), makeInteger(3749)), list(makeInteger(3751), makeInteger(3751)), list(makeInteger(3754), makeInteger(3755)), list(makeInteger(3757), makeInteger(3758)), list(makeInteger(3760), makeInteger(3760)), list(makeInteger(3762), makeInteger(3763)), list(makeInteger(3773), makeInteger(3773)), list(makeInteger(3776), makeInteger(3780)), list(makeInteger(3904), makeInteger(3911)), list(makeInteger(3913), makeInteger(3945)), list(makeInteger(4256), makeInteger(4293)), list(makeInteger(4304), makeInteger(4342)), list(makeInteger(4352), makeInteger(4352)), list(makeInteger(4354), makeInteger(4355)), list(makeInteger(4357), makeInteger(4359)), list(makeInteger(4361), makeInteger(4361)), list(makeInteger(4363), makeInteger(4364)), list(makeInteger(4366), makeInteger(4370)), list(makeInteger(4412), makeInteger(4412)), list(makeInteger(4414), makeInteger(4414)), list(makeInteger(4416), makeInteger(4416)), list(makeInteger(4428), makeInteger(4428)), list(makeInteger(4430), makeInteger(4430)), list(makeInteger(4432), makeInteger(4432)), list(makeInteger(4436), makeInteger(4437)), list(makeInteger(4441), makeInteger(4441)), list(makeInteger(4447), makeInteger(4449)), list(makeInteger(4451), makeInteger(4451)), list(makeInteger(4453), makeInteger(4453)), list(makeInteger(4455), makeInteger(4455)), list(makeInteger(4457), makeInteger(4457)), list(makeInteger(4461), makeInteger(4462)), list(makeInteger(4466), makeInteger(4467)), list(makeInteger(4469), makeInteger(4469)), list(makeInteger(4510), makeInteger(4510)), list(makeInteger(4520), makeInteger(4520)), list(makeInteger(4523), makeInteger(4523)), list(makeInteger(4526), makeInteger(4527)), list(makeInteger(4535), makeInteger(4536)), list(makeInteger(4538), makeInteger(4538)), list(makeInteger(4540), makeInteger(4546)), list(makeInteger(4587), makeInteger(4587)), list(makeInteger(4592), makeInteger(4592)), list(makeInteger(4601), makeInteger(4601)), list(makeInteger(7680), makeInteger(7835)), list(makeInteger(7840), makeInteger(7929)), list(makeInteger(7936), makeInteger(7957)), list(makeInteger(7960), makeInteger(7965)), list(makeInteger(7968), makeInteger(8005)), list(makeInteger(8008), makeInteger(8013)), list(makeInteger(8016), makeInteger(8023)), list(makeInteger(8025), makeInteger(8025)), list(makeInteger(8027), makeInteger(8027)), list(makeInteger(8029), makeInteger(8029)), list(makeInteger(8031), makeInteger(8061)), list(makeInteger(8064), makeInteger(8116)), list(makeInteger(8118), makeInteger(8124)), list(makeInteger(8126), makeInteger(8126)), list(makeInteger(8130), makeInteger(8132)), list(makeInteger(8134), makeInteger(8140)), list(makeInteger(8144), makeInteger(8147)), list(makeInteger(8150), makeInteger(8155)), list(makeInteger(8160), makeInteger(8172)), list(makeInteger(8178), makeInteger(8180)), list(makeInteger(8182), makeInteger(8188)), list(makeInteger(8486), makeInteger(8486)), list(makeInteger(8490), makeInteger(8491)), list(makeInteger(8494), makeInteger(8494)), list(makeInteger(8576), makeInteger(8578)), list(makeInteger(12353), makeInteger(12436)), list(makeInteger(12449), makeInteger(12538)), list(makeInteger(12549), makeInteger(12588)), list(makeInteger(44032), makeInteger(55203))});
  }

  //// Initializers

  public void declareFunctions() {
    declare_xml_utilities_file();
  }

  public void initializeVariables() {
    init_xml_utilities_file();
  }

  public void runTopLevelForms() {
    setup_xml_utilities_file();
  }

}
