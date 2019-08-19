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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unicode_subsets;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;

public  final class unicode_strings extends SubLTranslatedFile {

  //// Constructor

  private unicode_strings() {}
  public static final SubLFile me = new unicode_strings();
  public static final String myName = "com.cyc.cycjava_1.cycl.unicode_strings";

  //// Definitions

  @SubL(source = "cycl/unicode-strings.lisp", position = 1286) 
  private static SubLSymbol $max_unicode_value$ = null;

  public static final class $unicode_char_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $uchar; }
    public SubLObject setField2(SubLObject value) { return $uchar = value; }
    public SubLObject $uchar = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($unicode_char_native.class, $sym1$UNICODE_CHAR, $sym2$UNICODE_CHAR_P, $list3, $list4, new String[] {"$uchar"}, $list5, $list6, $sym7$PRINT_UNICODE_CHAR);
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 1336) 
  public static SubLSymbol $dtp_unicode_char$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 1336) 
  public static final SubLObject unicode_char_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30929");
    return NIL;
  }

  public static final class $unicode_char_p$UnaryFunction extends UnaryFunction {
    public $unicode_char_p$UnaryFunction() { super(extractFunctionNamed("UNICODE-CHAR-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30935"); }
  }

  public static final class $unicode_string_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $vect; }
    public SubLObject setField2(SubLObject value) { return $vect = value; }
    public SubLObject $vect = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($unicode_string_native.class, $sym16$UNICODE_STRING, $sym17$UNICODE_STRING_P, $list18, $list19, new String[] {"$vect"}, $list20, $list21, $sym22$PRINT_UNICODE_STRING);
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 2576) 
  public static SubLSymbol $dtp_unicode_string$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 2576) 
  public static final SubLObject unicode_string_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30930");
    return NIL;
  }

  public static final class $unicode_string_p$UnaryFunction extends UnaryFunction {
    public $unicode_string_p$UnaryFunction() { super(extractFunctionNamed("UNICODE-STRING-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30942"); }
  }

  /** @return booleanp; t iff OBJECT is a string of ASCII characters. */
  @SubL(source = "cycl/unicode-strings.lisp", position = 4668) 
  public static final SubLObject ascii_string_p(SubLObject object) {
    if ((!(object.isString()))) {
      return NIL;
    }
    {
      SubLObject cdotimes_end_var = Sequences.length(object);
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject v_char = Strings.sublisp_char(object, i);
          if ((NIL == ascii_char_p_int(v_char))) {
            return NIL;
          }
        }
      }
    }
    return T;
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 5625) 
  public static final SubLObject ascii_char_p_int(SubLObject v_char) {
    return Numbers.numLE(Characters.char_code(v_char), $int29$127);
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 8561) 
  private static SubLSymbol $default_non_ascii_placeholder_char$ = null;

  /** Convert DISPLAY to a valid SubL string, replacing non-ASCII characters with PLACEHOLDER-CHAR if
   not mentioned in SUBST-ALIST. */
  @SubL(source = "cycl/unicode-strings.lisp", position = 8624) 
  public static final SubLObject display_to_subl_string(SubLObject display, SubLObject placeholder_char, SubLObject subst_alist) {
    if ((placeholder_char == UNPROVIDED)) {
      placeholder_char = $default_non_ascii_placeholder_char$.getGlobalValue();
    }
    if ((subst_alist == UNPROVIDED)) {
      subst_alist = $default_unicode_to_ascii_code_map$.getDynamicValue();
    }
    checkType(display, $sym35$DISPLAY_VECTOR_STRING_P);
    checkType(placeholder_char, $sym36$ASCII_CHAR_P);
    {
      SubLObject unicode_vector = Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30908");
      SubLObject length = Sequences.length(unicode_vector);
      SubLObject string = Strings.make_string(length, placeholder_char);
      SubLObject vector_var = unicode_vector;
      SubLObject backwardP_var = NIL;
      SubLObject length_6 = Sequences.length(vector_var);
      SubLObject v_iteration = NIL;
      for (v_iteration = ZERO_INTEGER; v_iteration.numL(length_6); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
        {
          SubLObject index = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length_6, v_iteration, ONE_INTEGER)) : v_iteration);
          SubLObject code = Vectors.aref(vector_var, index);
          if ((code.numGE($int30$128)
               && (NIL != list_utilities.alist_lookup(subst_alist, code, EQ, NIL)))) {
            Strings.set_char(string, index, Characters.code_char(list_utilities.alist_lookup(subst_alist, code, EQ, NIL)));
          } else if (code.numL($int30$128)) {
            Strings.set_char(string, index, Characters.code_char(code));
          }
        }
      }
      return string;
    }
  }

  /** An a-list mapping unicode-codes to ascii codes of common substitutes for characters that are not part of
     7-bit ascii.  Currently, this only contains code for 8-bit characters (e.g. the Latin-1 supplement). */
  @SubL(source = "cycl/unicode-strings.lisp", position = 9498) 
  private static SubLSymbol $default_unicode_to_ascii_code_map$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 25584) 
  public static final SubLObject utf8_string_to_subl_string(SubLObject utf8_string) {
    return display_to_subl_string(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30945"), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 26532) 
  private static SubLSymbol $html_40_character_entity_table$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 33291) 
  private static SubLSymbol $cfasl_opcode_unicode_char$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 33670) 
  public static final SubLObject cfasl_output_object_unicode_char_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30904");
  }

  @SubL(source = "cycl/unicode-strings.lisp", position = 34825) 
  private static SubLSymbol $cfasl_opcode_unicode_string$ = null;

  @SubL(source = "cycl/unicode-strings.lisp", position = 35045) 
  public static final SubLObject cfasl_output_object_unicode_string_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30905");
  }

  public static final SubLObject declare_unicode_strings_file() {
    declareFunction("unicode_char_print_function_trampoline", "UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("unicode_char_p", "UNICODE-CHAR-P", 1, 0, false); new $unicode_char_p$UnaryFunction();
    declareFunction("unicode_char_uchar", "UNICODE-CHAR-UCHAR", 1, 0, false);
    declareFunction("_csetf_unicode_char_uchar", "_CSETF-UNICODE-CHAR-UCHAR", 2, 0, false);
    declareFunction("make_unicode_char", "MAKE-UNICODE-CHAR", 0, 1, false);
    declareFunction("unicode_char_create", "UNICODE-CHAR-CREATE", 1, 0, false);
    declareFunction("print_unicode_char", "PRINT-UNICODE-CHAR", 3, 0, false);
    declareFunction("unicode_char_get_char", "UNICODE-CHAR-GET-CHAR", 1, 0, false);
    declareFunction("unicode_char_set_char", "UNICODE-CHAR-SET-CHAR", 2, 0, false);
    declareFunction("unicode_string_print_function_trampoline", "UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction("unicode_string_p", "UNICODE-STRING-P", 1, 0, false); new $unicode_string_p$UnaryFunction();
    declareFunction("unicode_string_vect", "UNICODE-STRING-VECT", 1, 0, false);
    declareFunction("_csetf_unicode_string_vect", "_CSETF-UNICODE-STRING-VECT", 2, 0, false);
    declareFunction("make_unicode_string", "MAKE-UNICODE-STRING", 0, 1, false);
    declareFunction("unicode_string_create", "UNICODE-STRING-CREATE", 1, 0, false);
    declareFunction("print_unicode_string", "PRINT-UNICODE-STRING", 3, 0, false);
    declareFunction("unicode_string_get_vector", "UNICODE-STRING-GET-VECTOR", 1, 0, false);
    declareFunction("unicode_string_set_vector", "UNICODE-STRING-SET-VECTOR", 2, 0, false);
    declareFunction("unicode_vector_string_p", "UNICODE-VECTOR-STRING-P", 1, 0, false);
    declareFunction("utf8_vector_string_p", "UTF8-VECTOR-STRING-P", 1, 0, false);
    declareFunction("ascii_string_p", "ASCII-STRING-P", 1, 0, false);
    declareFunction("non_ascii_string_p", "NON-ASCII-STRING-P", 1, 0, false);
    declareFunction("ascii_char_p", "ASCII-CHAR-P", 1, 0, false);
    declareFunction("non_ascii_char_p", "NON-ASCII-CHAR-P", 1, 0, false);
    declareFunction("ascii_char_p_int", "ASCII-CHAR-P-INT", 1, 0, false);
    declareFunction("display_vector_is_ascii_p", "DISPLAY-VECTOR-IS-ASCII-P", 1, 0, false);
    declareFunction("display_vector_string_p", "DISPLAY-VECTOR-STRING-P", 1, 0, false);
    declareFunction("display_to_unicode_vector", "DISPLAY-TO-UNICODE-VECTOR", 1, 0, false);
    declareFunction("display_to_subl_string", "DISPLAY-TO-SUBL-STRING", 1, 2, false);
    declareFunction("unicode_vector_to_display", "UNICODE-VECTOR-TO-DISPLAY", 1, 0, false);
    declareFunction("element_vector", "ELEMENT-VECTOR", 2, 0, false);
    declareFunction("unicode_vector_to_utf8_vector", "UNICODE-VECTOR-TO-UTF8-VECTOR", 1, 2, false);
    declareFunction("utf8_vector_to_unicode_vector", "UTF8-VECTOR-TO-UNICODE-VECTOR", 1, 0, false);
    declareFunction("unicode_char_code", "UNICODE-CHAR-CODE", 1, 0, false);
    declareFunction("unicode_code_char", "UNICODE-CODE-CHAR", 1, 0, false);
    declareFunction("unicode_character_p", "UNICODE-CHARACTER-P", 1, 0, false);
    declareFunction("number_utf8_bytes", "NUMBER-UTF8-BYTES", 1, 0, false);
    declareFunction("to_utf8_vector", "TO-UTF8-VECTOR", 1, 0, false);
    declareFunction("print_utf_hex_list", "PRINT-UTF-HEX-LIST", 1, 0, false);
    declareFunction("to_utc8_vector_internal", "TO-UTC8-VECTOR-INTERNAL", 3, 0, false);
    declareFunction("length_utf8_vector_codepoint", "LENGTH-UTF8-VECTOR-CODEPOINT", 2, 0, false);
    declareFunction("length_utf8_from_first_byte", "LENGTH-UTF8-FROM-FIRST-BYTE", 1, 0, false);
    declareFunction("utf8_vector_is_ascii_string_p", "UTF8-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
    declareFunction("utf8_char_is_ascii_p", "UTF8-CHAR-IS-ASCII-P", 2, 0, false);
    declareFunction("unicode_vector_is_ascii_string_p", "UNICODE-VECTOR-IS-ASCII-STRING-P", 1, 2, false);
    declareFunction("unicode_char_is_ascii_char_p", "UNICODE-CHAR-IS-ASCII-CHAR-P", 1, 0, false);
    declareFunction("utf8_char_p", "UTF8-CHAR-P", 2, 0, false);
    declareFunction("get_unicode_char_at_or_after_offset", "GET-UNICODE-CHAR-AT-OR-AFTER-OFFSET", 2, 0, false);
    declareFunction("get_unicode_char_at_or_before_offset", "GET-UNICODE-CHAR-AT-OR-BEFORE-OFFSET", 2, 0, false);
    declareFunction("get_unicode_char_at_offset", "GET-UNICODE-CHAR-AT-OFFSET", 2, 0, false);
    declareFunction("string_from_char_list", "STRING-FROM-CHAR-LIST", 1, 1, false);
    declareFunction("unicode_to_html_escaped", "UNICODE-TO-HTML-ESCAPED", 1, 0, false);
    declareFunction("unicode_string_to_utf8", "UNICODE-STRING-TO-UTF8", 1, 0, false);
    declareFunction("unicode_string_to_subl_string", "UNICODE-STRING-TO-SUBL-STRING", 1, 0, false);
    declareFunction("unicode_display_to_utf8", "UNICODE-DISPLAY-TO-UTF8", 1, 0, false);
    declareFunction("unicode_display_to_html", "UNICODE-DISPLAY-TO-HTML", 1, 0, false);
    declareFunction("html_escaped_to_utf8_vector", "HTML-ESCAPED-TO-UTF8-VECTOR", 1, 0, false);
    declareFunction("utf8_string_to_unicode_vector", "UTF8-STRING-TO-UNICODE-VECTOR", 1, 0, false);
    declareFunction("html_escaped_to_unicode_vector", "HTML-ESCAPED-TO-UNICODE-VECTOR", 1, 0, false);
    declareFunction("utf8_vector_to_utf8_string", "UTF8-VECTOR-TO-UTF8-STRING", 1, 0, false);
    declareFunction("utf8_string_to_utf8_vector", "UTF8-STRING-TO-UTF8-VECTOR", 1, 0, false);
    declareFunction("utf8_string_to_subl_string", "UTF8-STRING-TO-SUBL-STRING", 1, 0, false);
    declareFunction("utf8_string_to_display", "UTF8-STRING-TO-DISPLAY", 1, 0, false);
    declareFunction("html_escaped_to_utf8_string", "HTML-ESCAPED-TO-UTF8-STRING", 1, 0, false);
    declareFunction("display_to_utf8_string", "DISPLAY-TO-UTF8-STRING", 1, 0, false);
    declareFunction("html_escaped_to_display", "HTML-ESCAPED-TO-DISPLAY", 1, 0, false);
    declareFunction("map_character_entity_to_decimal_value", "MAP-CHARACTER-ENTITY-TO-DECIMAL-VALUE", 1, 0, false);
    declareFunction("map_decimal_value_to_character_entity", "MAP-DECIMAL-VALUE-TO-CHARACTER-ENTITY", 1, 0, false);
    declareFunction("unicode_string_concatenate", "UNICODE-STRING-CONCATENATE", 2, 0, false);
    declareFunction("cfasl_output_object_unicode_char_method", "CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD", 2, 0, false);
    declareFunction("cfasl_output_unicode_char", "CFASL-OUTPUT-UNICODE-CHAR", 2, 0, false);
    declareFunction("cfasl_input_unicode_char", "CFASL-INPUT-UNICODE-CHAR", 1, 0, false);
    declareFunction("cfasl_output_object_unicode_string_method", "CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD", 2, 0, false);
    declareFunction("cfasl_output_unicode_string", "CFASL-OUTPUT-UNICODE-STRING", 2, 0, false);
    declareFunction("cfasl_input_unicode_string", "CFASL-INPUT-UNICODE-STRING", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_unicode_strings_file() {
    $max_unicode_value$ = defconstant("MAX-UNICODE-VALUE", $int0$1114111);
    $dtp_unicode_char$ = defconstant("*DTP-UNICODE-CHAR*", $sym1$UNICODE_CHAR);
    $dtp_unicode_string$ = defconstant("*DTP-UNICODE-STRING*", $sym16$UNICODE_STRING);
    $default_non_ascii_placeholder_char$ = deflexical("*DEFAULT-NON-ASCII-PLACEHOLDER-CHAR*", Characters.CHAR_tilde);
    $default_unicode_to_ascii_code_map$ = defparameter("*DEFAULT-UNICODE-TO-ASCII-CODE-MAP*", $list37);
    $html_40_character_entity_table$ = deflexical("*HTML-40-CHARACTER-ENTITY-TABLE*", $list75);
    $cfasl_opcode_unicode_char$ = defconstant("*CFASL-OPCODE-UNICODE-CHAR*", $int76$52);
    $cfasl_opcode_unicode_string$ = defconstant("*CFASL-OPCODE-UNICODE-STRING*", $int80$53);
    return NIL;
  }

  public static final SubLObject setup_unicode_strings_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function($sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$UNICODE_CHAR_UCHAR, $sym10$_CSETF_UNICODE_CHAR_UCHAR);
    Equality.identity($sym1$UNICODE_CHAR);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function($sym23$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym24$UNICODE_STRING_VECT, $sym25$_CSETF_UNICODE_STRING_VECT);
    Equality.identity($sym16$UNICODE_STRING);
    cfasl.register_cfasl_input_function($cfasl_opcode_unicode_char$.getGlobalValue(), $sym77$CFASL_INPUT_UNICODE_CHAR);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_char$.getGlobalValue(), Symbols.symbol_function($sym78$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_unicode_string$.getGlobalValue(), $sym81$CFASL_INPUT_UNICODE_STRING);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_unicode_string$.getGlobalValue(), Symbols.symbol_function($sym82$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$1114111 = makeInteger(1114111);
  public static final SubLSymbol $sym1$UNICODE_CHAR = makeSymbol("UNICODE-CHAR");
  public static final SubLSymbol $sym2$UNICODE_CHAR_P = makeSymbol("UNICODE-CHAR-P");
  public static final SubLList $list3 = list(makeSymbol("UCHAR"));
  public static final SubLList $list4 = list(makeKeyword("UCHAR"));
  public static final SubLList $list5 = list(makeSymbol("UNICODE-CHAR-UCHAR"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-UNICODE-CHAR-UCHAR"));
  public static final SubLSymbol $sym7$PRINT_UNICODE_CHAR = makeSymbol("PRINT-UNICODE-CHAR");
  public static final SubLSymbol $sym8$UNICODE_CHAR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UNICODE-CHAR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$UNICODE_CHAR_UCHAR = makeSymbol("UNICODE-CHAR-UCHAR");
  public static final SubLSymbol $sym10$_CSETF_UNICODE_CHAR_UCHAR = makeSymbol("_CSETF-UNICODE-CHAR-UCHAR");
  public static final SubLSymbol $kw11$UCHAR = makeKeyword("UCHAR");
  public static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str13$_u_x = makeString("#u~x");
  public static final SubLString $str14$_u0_x = makeString("#u0~x");
  public static final SubLSymbol $sym15$UNICODE_CHARACTER_P = makeSymbol("UNICODE-CHARACTER-P");
  public static final SubLSymbol $sym16$UNICODE_STRING = makeSymbol("UNICODE-STRING");
  public static final SubLSymbol $sym17$UNICODE_STRING_P = makeSymbol("UNICODE-STRING-P");
  public static final SubLList $list18 = list(makeSymbol("VECT"));
  public static final SubLList $list19 = list(makeKeyword("VECT"));
  public static final SubLList $list20 = list(makeSymbol("UNICODE-STRING-VECT"));
  public static final SubLList $list21 = list(makeSymbol("_CSETF-UNICODE-STRING-VECT"));
  public static final SubLSymbol $sym22$PRINT_UNICODE_STRING = makeSymbol("PRINT-UNICODE-STRING");
  public static final SubLSymbol $sym23$UNICODE_STRING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("UNICODE-STRING-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym24$UNICODE_STRING_VECT = makeSymbol("UNICODE-STRING-VECT");
  public static final SubLSymbol $sym25$_CSETF_UNICODE_STRING_VECT = makeSymbol("_CSETF-UNICODE-STRING-VECT");
  public static final SubLSymbol $kw26$VECT = makeKeyword("VECT");
  public static final SubLString $str27$_u__a_ = makeString("#u\"~a\"");
  public static final SubLSymbol $sym28$UNICODE_VECTOR_STRING_P = makeSymbol("UNICODE-VECTOR-STRING-P");
  public static final SubLInteger $int29$127 = makeInteger(127);
  public static final SubLInteger $int30$128 = makeInteger(128);
  public static final SubLSymbol $kw31$OPEN = makeKeyword("OPEN");
  public static final SubLSymbol $kw32$START_UNICODE = makeKeyword("START-UNICODE");
  public static final SubLSymbol $kw33$UNICODE_CHAR = makeKeyword("UNICODE-CHAR");
  public static final SubLSymbol $kw34$UNICDE_CHAR = makeKeyword("UNICDE-CHAR");
  public static final SubLSymbol $sym35$DISPLAY_VECTOR_STRING_P = makeSymbol("DISPLAY-VECTOR-STRING-P");
  public static final SubLSymbol $sym36$ASCII_CHAR_P = makeSymbol("ASCII-CHAR-P");
  public static final SubLList $list37 = list(new SubLObject[] {cons(makeInteger(192), makeInteger(65)), cons(makeInteger(193), makeInteger(65)), cons(makeInteger(194), makeInteger(65)), cons(makeInteger(195), makeInteger(65)), cons(makeInteger(196), makeInteger(65)), cons(makeInteger(197), makeInteger(65)), cons(makeInteger(200), makeInteger(69)), cons(makeInteger(201), makeInteger(69)), cons(makeInteger(202), makeInteger(69)), cons(makeInteger(203), makeInteger(69)), cons(makeInteger(204), makeInteger(73)), cons(makeInteger(205), makeInteger(73)), cons(makeInteger(206), makeInteger(73)), cons(makeInteger(207), makeInteger(73)), cons(makeInteger(209), makeInteger(78)), cons(makeInteger(210), makeInteger(79)), cons(makeInteger(211), makeInteger(79)), cons(makeInteger(212), makeInteger(79)), cons(makeInteger(213), makeInteger(79)), cons(makeInteger(214), makeInteger(79)), cons(makeInteger(216), makeInteger(79)), cons(makeInteger(217), makeInteger(85)), cons(makeInteger(218), makeInteger(85)), cons(makeInteger(219), makeInteger(85)), cons(makeInteger(220), makeInteger(85)), cons(makeInteger(221), makeInteger(89)), cons(makeInteger(224), makeInteger(97)), cons(makeInteger(225), makeInteger(97)), cons(makeInteger(226), makeInteger(97)), cons(makeInteger(227), makeInteger(97)), cons(makeInteger(228), makeInteger(97)), cons(makeInteger(229), makeInteger(97)), cons(makeInteger(231), makeInteger(99)), cons(makeInteger(232), makeInteger(101)), cons(makeInteger(233), makeInteger(101)), cons(makeInteger(234), makeInteger(101)), cons(makeInteger(235), makeInteger(101)), cons(makeInteger(236), makeInteger(105)), cons(makeInteger(237), makeInteger(105)), cons(makeInteger(238), makeInteger(105)), cons(makeInteger(239), makeInteger(105)), cons(makeInteger(240), makeInteger(100)), cons(makeInteger(241), makeInteger(110)), cons(makeInteger(242), makeInteger(111)), cons(makeInteger(243), makeInteger(111)), cons(makeInteger(244), makeInteger(111)), cons(makeInteger(245), makeInteger(111)), cons(makeInteger(246), makeInteger(111)), cons(makeInteger(248), makeInteger(111)), cons(makeInteger(249), makeInteger(117)), cons(makeInteger(250), makeInteger(117)), cons(makeInteger(251), makeInteger(117)), cons(makeInteger(252), makeInteger(117)), cons(makeInteger(253), makeInteger(121)), cons(makeInteger(255), makeInteger(121))});
  public static final SubLString $str38$__ = makeString("\\\"");
  public static final SubLString $str39$__ = makeString("\\\\");
  public static final SubLString $str40$_u26_ = makeString("&u26;");
  public static final SubLInteger $int41$32 = makeInteger(32);
  public static final SubLString $str42$0 = makeString("0");
  public static final SubLString $str43$_u_A_ = makeString("&u~A;");
  public static final SubLSymbol $sym44$UTF8_VECTOR_STRING_P = makeSymbol("UTF8-VECTOR-STRING-P");
  public static final SubLInteger $int45$2047 = makeInteger(2047);
  public static final SubLInteger $int46$65535 = makeInteger(65535);
  public static final SubLInteger $int47$2097151 = makeInteger(2097151);
  public static final SubLInteger $int48$67108863 = makeInteger(67108863);
  public static final SubLString $str49$__ = makeString("#(");
  public static final SubLString $str50$_x_x_ = makeString("#x~x ");
  public static final SubLString $str51$___ = makeString(")~%");
  public static final SubLInteger $int52$192 = makeInteger(192);
  public static final SubLInteger $int53$_6 = makeInteger(-6);
  public static final SubLInteger $int54$63 = makeInteger(63);
  public static final SubLInteger $int55$224 = makeInteger(224);
  public static final SubLInteger $int56$_12 = makeInteger(-12);
  public static final SubLInteger $int57$240 = makeInteger(240);
  public static final SubLInteger $int58$_18 = makeInteger(-18);
  public static final SubLInteger $int59$248 = makeInteger(248);
  public static final SubLInteger $int60$_24 = makeInteger(-24);
  public static final SubLInteger $int61$252 = makeInteger(252);
  public static final SubLSymbol $sym62$VECTORP = makeSymbol("VECTORP");
  public static final SubLInteger $int63$31 = makeInteger(31);
  public static final SubLInteger $int64$24 = makeInteger(24);
  public static final SubLString $str65$__x = makeString("&#x");
  public static final SubLSymbol $kw66$START_HTML_ESCAPE = makeKeyword("START-HTML-ESCAPE");
  public static final SubLSymbol $kw67$INSIDE_TAG = makeKeyword("INSIDE-TAG");
  public static final SubLSymbol $kw68$HTML_NUMERIC_ESCAPE_START = makeKeyword("HTML-NUMERIC-ESCAPE-START");
  public static final SubLSymbol $kw69$ENTITY_ESCAPE = makeKeyword("ENTITY-ESCAPE");
  public static final SubLSymbol $kw70$HTML_HEXADECIMAL_ESCAPE = makeKeyword("HTML-HEXADECIMAL-ESCAPE");
  public static final SubLSymbol $kw71$HTML_DECIMAL_ESCAPE = makeKeyword("HTML-DECIMAL-ESCAPE");
  public static final SubLSymbol $sym72$STRINGP = makeSymbol("STRINGP");
  public static final SubLInteger $int73$256 = makeInteger(256);
  public static final SubLString $str74$_S__code___S__is_not_a_valid_utf8 = makeString("~S (code: ~S) is not a valid utf8 character");
  public static final SubLObject $list75 = _constant_75_initializer();
  public static final SubLInteger $int76$52 = makeInteger(52);
  public static final SubLSymbol $sym77$CFASL_INPUT_UNICODE_CHAR = makeSymbol("CFASL-INPUT-UNICODE-CHAR");
  public static final SubLSymbol $sym78$CFASL_OUTPUT_OBJECT_UNICODE_CHAR_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-CHAR-METHOD");
  public static final SubLString $str79$Invalid_unicode_character__expect = makeString("Invalid unicode character, expected ~A bytes, got ~A only.");
  public static final SubLInteger $int80$53 = makeInteger(53);
  public static final SubLSymbol $sym81$CFASL_INPUT_UNICODE_STRING = makeSymbol("CFASL-INPUT-UNICODE-STRING");
  public static final SubLSymbol $sym82$CFASL_OUTPUT_OBJECT_UNICODE_STRING_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-UNICODE-STRING-METHOD");

  //// Internal Constant Initializer Methods

  private static final SubLObject _constant_75_initializer() {
    return list(new SubLObject[] {cons(makeString("AElig"), makeInteger(198)), cons(makeString("Aacute"), makeInteger(193)), cons(makeString("Acirc"), makeInteger(194)), cons(makeString("Agrave"), makeInteger(192)), cons(makeString("Alpha"), makeInteger(913)), cons(makeString("Aring"), makeInteger(197)), cons(makeString("Atilde"), makeInteger(195)), cons(makeString("Auml"), makeInteger(196)), cons(makeString("Beta"), makeInteger(914)), cons(makeString("Ccedil"), makeInteger(199)), cons(makeString("Chi"), makeInteger(935)), cons(makeString("Dagger"), makeInteger(8225)), cons(makeString("Delta"), makeInteger(916)), cons(makeString("ETH"), makeInteger(208)), cons(makeString("Eacute"), makeInteger(201)), cons(makeString("Ecirc"), makeInteger(202)), cons(makeString("Egrave"), makeInteger(200)), cons(makeString("Epsilon"), makeInteger(917)), cons(makeString("Eta"), makeInteger(919)), cons(makeString("Euml"), makeInteger(203)), cons(makeString("Gamma"), makeInteger(915)), cons(makeString("Iacute"), makeInteger(205)), cons(makeString("Icirc"), makeInteger(206)), cons(makeString("Igrave"), makeInteger(204)), cons(makeString("Iota"), makeInteger(921)), cons(makeString("Iuml"), makeInteger(207)), cons(makeString("Kappa"), makeInteger(922)), cons(makeString("Lambda"), makeInteger(923)), cons(makeString("Mu"), makeInteger(924)), cons(makeString("Ntilde"), makeInteger(209)), cons(makeString("Nu"), makeInteger(925)), cons(makeString("OElig"), makeInteger(338)), cons(makeString("Oacute"), makeInteger(211)), cons(makeString("Ocirc"), makeInteger(212)), cons(makeString("Ograve"), makeInteger(210)), cons(makeString("Omega"), makeInteger(937)), cons(makeString("Omicron"), makeInteger(927)), cons(makeString("Oslash"), makeInteger(216)), cons(makeString("Otilde"), makeInteger(213)), cons(makeString("Ouml"), makeInteger(214)), cons(makeString("Phi"), makeInteger(934)), cons(makeString("Pi"), makeInteger(928)), cons(makeString("Prime"), makeInteger(8243)), cons(makeString("Psi"), makeInteger(936)), cons(makeString("Rho"), makeInteger(929)), cons(makeString("Scaron"), makeInteger(352)), cons(makeString("Sigma"), makeInteger(931)), cons(makeString("THORN"), makeInteger(222)), cons(makeString("Tau"), makeInteger(932)), cons(makeString("Theta"), makeInteger(920)), cons(makeString("Uacute"), makeInteger(218)), cons(makeString("Ucirc"), makeInteger(219)), cons(makeString("Ugrave"), makeInteger(217)), cons(makeString("Upsilon"), makeInteger(933)), cons(makeString("Uuml"), makeInteger(220)), cons(makeString("Xi"), makeInteger(926)), cons(makeString("Yacute"), makeInteger(221)), cons(makeString("Yuml"), makeInteger(376)), cons(makeString("Zeta"), makeInteger(918)), cons(makeString("aacute"), makeInteger(225)), cons(makeString("acirc"), makeInteger(226)), cons(makeString("acute"), makeInteger(180)), cons(makeString("aelig"), makeInteger(230)), cons(makeString("agrave"), makeInteger(224)), cons(makeString("alefsym"), makeInteger(8501)), cons(makeString("alpha"), makeInteger(945)), cons(makeString("amp"), makeInteger(38)), cons(makeString("and"), makeInteger(8743)), cons(makeString("ang"), makeInteger(8736)), cons(makeString("aring"), makeInteger(229)), cons(makeString("asymp"), makeInteger(8776)), cons(makeString("atilde"), makeInteger(227)), cons(makeString("auml"), makeInteger(228)), cons(makeString("bdquo"), makeInteger(8222)), cons(makeString("beta"), makeInteger(946)), cons(makeString("brvbar"), makeInteger(166)), cons(makeString("bull"), makeInteger(8226)), cons(makeString("cap"), makeInteger(8745)), cons(makeString("ccedil"), makeInteger(231)), cons(makeString("cedil"), makeInteger(184)), cons(makeString("cent"), makeInteger(162)), cons(makeString("chi"), makeInteger(967)), cons(makeString("circ"), makeInteger(710)), cons(makeString("clubs"), makeInteger(9827)), cons(makeString("cong"), makeInteger(8773)), cons(makeString("copy"), makeInteger(169)), cons(makeString("crarr"), makeInteger(8629)), cons(makeString("cup"), makeInteger(8746)), cons(makeString("curren"), makeInteger(164)), cons(makeString("dArr"), makeInteger(8659)), cons(makeString("dagger"), makeInteger(8224)), cons(makeString("darr"), makeInteger(8595)), cons(makeString("deg"), makeInteger(176)), cons(makeString("delta"), makeInteger(948)), cons(makeString("diams"), makeInteger(9830)), cons(makeString("divide"), makeInteger(247)), cons(makeString("eacute"), makeInteger(233)), cons(makeString("ecirc"), makeInteger(234)), cons(makeString("egrave"), makeInteger(232)), cons(makeString("empty"), makeInteger(8709)), cons(makeString("emsp"), makeInteger(8195)), cons(makeString("ensp"), makeInteger(8194)), cons(makeString("epsilon"), makeInteger(949)), cons(makeString("equiv"), makeInteger(8801)), cons(makeString("eta"), makeInteger(951)), cons(makeString("eth"), makeInteger(240)), cons(makeString("euml"), makeInteger(235)), cons(makeString("euro"), makeInteger(8364)), cons(makeString("exist"), makeInteger(8707)), cons(makeString("fnof"), makeInteger(402)), cons(makeString("forall"), makeInteger(8704)), cons(makeString("frac12"), makeInteger(189)), cons(makeString("frac14"), makeInteger(188)), cons(makeString("frac34"), makeInteger(190)), cons(makeString("frasl"), makeInteger(8260)), cons(makeString("gamma"), makeInteger(947)), cons(makeString("ge"), makeInteger(8805)), cons(makeString("gt"), makeInteger(62)), cons(makeString("hArr"), makeInteger(8660)), cons(makeString("harr"), makeInteger(8596)), cons(makeString("hearts"), makeInteger(9829)), cons(makeString("hellip"), makeInteger(8230)), cons(makeString("iacute"), makeInteger(237)), cons(makeString("icirc"), makeInteger(238)), cons(makeString("iexcl"), makeInteger(161)), cons(makeString("igrave"), makeInteger(236)), cons(makeString("image"), makeInteger(8465)), cons(makeString("infin"), makeInteger(8734)), cons(makeString("int"), makeInteger(8747)), cons(makeString("iota"), makeInteger(953)), cons(makeString("iquest"), makeInteger(191)), cons(makeString("isin"), makeInteger(8712)), cons(makeString("iuml"), makeInteger(239)), cons(makeString("kappa"), makeInteger(954)), cons(makeString("lArr"), makeInteger(8656)), cons(makeString("lambda"), makeInteger(955)), cons(makeString("lang"), makeInteger(9001)), cons(makeString("laquo"), makeInteger(171)), cons(makeString("larr"), makeInteger(8592)), cons(makeString("lceil"), makeInteger(8968)), cons(makeString("ldquo"), makeInteger(8220)), cons(makeString("le"), makeInteger(8804)), cons(makeString("lfloor"), makeInteger(8970)), cons(makeString("lowast"), makeInteger(8727)), cons(makeString("loz"), makeInteger(9674)), cons(makeString("lrm"), makeInteger(8206)), cons(makeString("lsaquo"), makeInteger(8249)), cons(makeString("lsquo"), makeInteger(8216)), cons(makeString("lt"), makeInteger(60)), cons(makeString("macr"), makeInteger(175)), cons(makeString("mdash"), makeInteger(8212)), cons(makeString("micro"), makeInteger(181)), cons(makeString("middot"), makeInteger(183)), cons(makeString("minus"), makeInteger(8722)), cons(makeString("mu"), makeInteger(956)), cons(makeString("nabla"), makeInteger(8711)), cons(makeString("nbsp"), makeInteger(160)), cons(makeString("ndash"), makeInteger(8211)), cons(makeString("ne"), makeInteger(8800)), cons(makeString("ni"), makeInteger(8715)), cons(makeString("not"), makeInteger(172)), cons(makeString("notin"), makeInteger(8713)), cons(makeString("nsub"), makeInteger(8836)), cons(makeString("ntilde"), makeInteger(241)), cons(makeString("nu"), makeInteger(957)), cons(makeString("oacute"), makeInteger(243)), cons(makeString("ocirc"), makeInteger(244)), cons(makeString("oelig"), makeInteger(339)), cons(makeString("ograve"), makeInteger(242)), cons(makeString("oline"), makeInteger(8254)), cons(makeString("omega"), makeInteger(969)), cons(makeString("omicron"), makeInteger(959)), cons(makeString("oplus"), makeInteger(8853)), cons(makeString("or"), makeInteger(8744)), cons(makeString("ordf"), makeInteger(170)), cons(makeString("ordm"), makeInteger(186)), cons(makeString("oslash"), makeInteger(248)), cons(makeString("otilde"), makeInteger(245)), cons(makeString("otimes"), makeInteger(8855)), cons(makeString("ouml"), makeInteger(246)), cons(makeString("para"), makeInteger(182)), cons(makeString("part"), makeInteger(8706)), cons(makeString("permil"), makeInteger(8240)), cons(makeString("perp"), makeInteger(8869)), cons(makeString("phi"), makeInteger(966)), cons(makeString("pi"), makeInteger(960)), cons(makeString("piv"), makeInteger(982)), cons(makeString("plusmn"), makeInteger(177)), cons(makeString("pound"), makeInteger(163)), cons(makeString("prime"), makeInteger(8242)), cons(makeString("prod"), makeInteger(8719)), cons(makeString("prop"), makeInteger(8733)), cons(makeString("psi"), makeInteger(968)), cons(makeString("quot"), makeInteger(34)), cons(makeString("rArr"), makeInteger(8658)), cons(makeString("radic"), makeInteger(8730)), cons(makeString("rang"), makeInteger(9002)), cons(makeString("raquo"), makeInteger(187)), cons(makeString("rarr"), makeInteger(8594)), cons(makeString("rceil"), makeInteger(8969)), cons(makeString("rdquo"), makeInteger(8221)), cons(makeString("real"), makeInteger(8476)), cons(makeString("reg"), makeInteger(174)), cons(makeString("rfloor"), makeInteger(8971)), cons(makeString("rho"), makeInteger(961)), cons(makeString("rlm"), makeInteger(8207)), cons(makeString("rsaquo"), makeInteger(8250)), cons(makeString("rsquo"), makeInteger(8217)), cons(makeString("sbquo"), makeInteger(8218)), cons(makeString("scaron"), makeInteger(353)), cons(makeString("sdot"), makeInteger(8901)), cons(makeString("sect"), makeInteger(167)), cons(makeString("shy"), makeInteger(173)), cons(makeString("sigma"), makeInteger(963)), cons(makeString("sigmaf"), makeInteger(962)), cons(makeString("sim"), makeInteger(8764)), cons(makeString("spades"), makeInteger(9824)), cons(makeString("sub"), makeInteger(8834)), cons(makeString("sube"), makeInteger(8838)), cons(makeString("sum"), makeInteger(8721)), cons(makeString("sup"), makeInteger(8835)), cons(makeString("sup1"), makeInteger(185)), cons(makeString("sup2"), makeInteger(178)), cons(makeString("sup3"), makeInteger(179)), cons(makeString("supe"), makeInteger(8839)), cons(makeString("szlig"), makeInteger(223)), cons(makeString("tau"), makeInteger(964)), cons(makeString("there4"), makeInteger(8756)), cons(makeString("theta"), makeInteger(952)), cons(makeString("thetasym"), makeInteger(977)), cons(makeString("thinsp"), makeInteger(8201)), cons(makeString("thorn"), makeInteger(254)), cons(makeString("tilde"), makeInteger(732)), cons(makeString("times"), makeInteger(215)), cons(makeString("trade"), makeInteger(8482)), cons(makeString("uArr"), makeInteger(8657)), cons(makeString("uacute"), makeInteger(250)), cons(makeString("uarr"), makeInteger(8593)), cons(makeString("ucirc"), makeInteger(251)), cons(makeString("ugrave"), makeInteger(249)), cons(makeString("uml"), makeInteger(168)), cons(makeString("upsih"), makeInteger(978)), cons(makeString("upsilon"), makeInteger(965)), cons(makeString("uuml"), makeInteger(252)), cons(makeString("weierp"), makeInteger(8472)), cons(makeString("xi"), makeInteger(958)), cons(makeString("yacute"), makeInteger(253)), cons(makeString("yen"), makeInteger(165)), cons(makeString("yuml"), makeInteger(255)), cons(makeString("zeta"), makeInteger(950)), cons(makeString("zwj"), makeInteger(8205)), cons(makeString("zwnj"), makeInteger(8204))});
  }

  //// Initializers

  public void declareFunctions() {
    declare_unicode_strings_file();
  }

  public void initializeVariables() {
    init_unicode_strings_file();
  }

  public void runTopLevelForms() {
    setup_unicode_strings_file();
  }

}
