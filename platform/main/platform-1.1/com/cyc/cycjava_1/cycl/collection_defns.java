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
//dm import com.cyc.cycjava_1.cycl.arg_type;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.unicode_strings;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.web_utilities;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_macros;
//dm import com.cyc.cycjava_1.cycl.wff_utilities;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class collection_defns extends SubLTranslatedFile {

  //// Constructor

  private collection_defns() {}
  public static final SubLFile me = new collection_defns();
  public static final String myName = "com.cyc.cycjava_1.cycl.collection_defns";

  //// Definitions

  @SubL(source = "cycl/collection-defns.lisp", position = 1201) 
  private static SubLSymbol $subl_functions_used_as_collection_defns$ = null;

  @SubL(source = "cycl/collection-defns.lisp", position = 1571) 
  private static SubLSymbol $cycl_functions_used_as_collection_defns$ = null;

  /** #$defnNecessary for #$Individual */
  @SubL(source = "cycl/collection-defns.lisp", position = 2026) 
  public static final SubLObject cyc_individual_necessary(SubLObject object) {
    if (((NIL != forts.fort_p(object))
         && (NIL != fort_types_interface.collectionP(object)))) {
      return NIL;
    }
    return T;
  }

  public static final class $cyc_individual_necessary$UnaryFunction extends UnaryFunction {
    public $cyc_individual_necessary$UnaryFunction() { super(extractFunctionNamed("CYC-INDIVIDUAL-NECESSARY")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_individual_necessary(arg1); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 4249) 
  public static final SubLObject cyc_system_string_p(SubLObject object) {
    return cycl_grammar.subl_string_p(object);
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 4711) 
  public static final SubLObject cycl_subl_symbol_p(SubLObject object) {
    if ((NIL != el_utilities.el_formula_p(object))) {
      return makeBoolean(((NIL != el_utilities.subl_quote_p(object))
             && cycl_utilities.formula_arg1(object, UNPROVIDED).isSymbol()));
    }
    return NIL;
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 7216) 
  public static final SubLObject hl_formula_p(SubLObject object) {
    return makeBoolean(((NIL != nart_handles.nart_p(object))
          || (NIL != assertion_handles.assertion_p(object))));
  }

  public static final class $cyc_typicality_reference_set_propertyP$UnaryFunction extends UnaryFunction {
    public $cyc_typicality_reference_set_propertyP$UnaryFunction() { super(extractFunctionNamed("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31364"); }
  }

  public static final class $cycl_sentence_assertibleP$UnaryFunction extends UnaryFunction {
    public $cycl_sentence_assertibleP$UnaryFunction() { super(extractFunctionNamed("CYCL-SENTENCE-ASSERTIBLE?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31382"); }
  }

  public static final class $cycl_canonicalizer_directiveP$UnaryFunction extends UnaryFunction {
    public $cycl_canonicalizer_directiveP$UnaryFunction() { super(extractFunctionNamed("CYCL-CANONICALIZER-DIRECTIVE?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31374"); }
  }

  /** defnIff for #$Integer */
  @SubL(source = "cycl/collection-defns.lisp", position = 18390) 
  public static final SubLObject cyc_integer(SubLObject integer) {
    return cyc_system_integer(integer);
  }

  /** defnIff for #$SubLInteger */
  @SubL(source = "cycl/collection-defns.lisp", position = 18568) 
  public static final SubLObject cyc_system_integer(SubLObject integer) {
    return Types.integerp(integer);
  }

  /** defnIff for #$PositiveInteger */
  @SubL(source = "cycl/collection-defns.lisp", position = 18680) 
  public static final SubLObject cyc_positive_integer(SubLObject integer) {
    return makeBoolean(((NIL != cyc_integer(integer))
           && integer.isPositive()));
  }

  /** defnIff for #$NegativeInteger */
  @SubL(source = "cycl/collection-defns.lisp", position = 19323) 
  public static final SubLObject cyc_negative_integer(SubLObject integer) {
    return makeBoolean(((NIL != cyc_integer(integer))
           && integer.isNegative()));
  }

  /** defnIff for #$NonNegativeInteger */
  @SubL(source = "cycl/collection-defns.lisp", position = 19653) 
  public static final SubLObject cyc_non_negative_integer(SubLObject integer) {
    return makeBoolean(((NIL != cyc_integer(integer))
           && (NIL == cyc_negative_integer(integer))));
  }

  /** #$defnNecessary for #$List */
  @SubL(source = "cycl/collection-defns.lisp", position = 21316) 
  public static final SubLObject cyc_list_of_type_necessary(SubLObject list) {
    {
      SubLObject result = cyc_list_of_type_guts(list);
      if (($kw108$AGNOSTIC == result)) {
        return T;
      } else {
        return result;
      }
    }
  }

  public static final class $cyc_list_of_type_necessary$UnaryFunction extends UnaryFunction {
    public $cyc_list_of_type_necessary$UnaryFunction() { super(extractFunctionNamed("CYC-LIST-OF-TYPE-NECESSARY")); }
    public SubLObject processItem(SubLObject arg1) { return cyc_list_of_type_necessary(arg1); }
  }

  public static final class $cyc_list_of_type_sufficient$UnaryFunction extends UnaryFunction {
    public $cyc_list_of_type_sufficient$UnaryFunction() { super(extractFunctionNamed("CYC-LIST-OF-TYPE-SUFFICIENT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31345"); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 22387) 
  private static SubLSymbol $extensional_setP_caching_state$ = null;

  public static final class $clear_extensional_setP$ZeroArityFunction extends ZeroArityFunction {
    public $clear_extensional_setP$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-EXTENSIONAL-SET?")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31329"); }
  }

  /** @return t, nil, or :agnostic */
  @SubL(source = "cycl/collection-defns.lisp", position = 23148) 
  public static final SubLObject cyc_list_of_type_guts(SubLObject list) {
    if ((NIL != el_utilities.el_empty_list_p(list))) {
      return T;
    }
    if ((NIL != isa.quoted_isaP(list, $const120$List_Extensional, UNPROVIDED, UNPROVIDED))) {
      {
        SubLObject list_type = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32210");
        if ((NIL != forts.fort_p(list_type))) {
          {
            SubLObject element_type = kb_mapping_utilities.fpred_value(list_type, $const121$instanceListMemberType, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((NIL != forts.fort_p(element_type))) {
              return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31344");
            }
          }
        }
      }
    }
    return $kw108$AGNOSTIC;
  }

  public static final class $cyc_numeric_string_necessary$UnaryFunction extends UnaryFunction {
    public $cyc_numeric_string_necessary$UnaryFunction() { super(extractFunctionNamed("CYC-NUMERIC-STRING-NECESSARY")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31353"); }
  }

  public static final class $cyc_zip_code_five_digit$UnaryFunction extends UnaryFunction {
    public $cyc_zip_code_five_digit$UnaryFunction() { super(extractFunctionNamed("CYC-ZIP-CODE-FIVE-DIGIT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31365"); }
  }

  public static final class $cyc_zip_code_nine_digit$UnaryFunction extends UnaryFunction {
    public $cyc_zip_code_nine_digit$UnaryFunction() { super(extractFunctionNamed("CYC-ZIP-CODE-NINE-DIGIT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31366"); }
  }

  public static final class $cyc_guid_string_p$UnaryFunction extends UnaryFunction {
    public $cyc_guid_string_p$UnaryFunction() { super(extractFunctionNamed("CYC-GUID-STRING-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31337"); }
  }

  public static final class $cyc_ascii_string_p$UnaryFunction extends UnaryFunction {
    public $cyc_ascii_string_p$UnaryFunction() { super(extractFunctionNamed("CYC-ASCII-STRING-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31334"); }
  }

  /** defnIff for #$SubLTemplate */
  @SubL(source = "cycl/collection-defns.lisp", position = 29479) 
  public static final SubLObject cyc_subl_template(SubLObject obj) {
    return T;
  }

  public static final class $cyc_list_of_lists$UnaryFunction extends UnaryFunction {
    public $cyc_list_of_lists$UnaryFunction() { super(extractFunctionNamed("CYC-LIST-OF-LISTS")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31343"); }
  }

  public static final class $cyc_string_is_length$UnaryFunction extends UnaryFunction {
    public $cyc_string_is_length$UnaryFunction() { super(extractFunctionNamed("CYC-STRING-IS-LENGTH")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31358"); }
  }

  public static final class $cyc_string_is_minimum_length$UnaryFunction extends UnaryFunction {
    public $cyc_string_is_minimum_length$UnaryFunction() { super(extractFunctionNamed("CYC-STRING-IS-MINIMUM-LENGTH")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31360"); }
  }

  public static final class $cyc_string_is_maximum_length$UnaryFunction extends UnaryFunction {
    public $cyc_string_is_maximum_length$UnaryFunction() { super(extractFunctionNamed("CYC-STRING-IS-MAXIMUM-LENGTH")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31359"); }
  }

  public static final class $cyc_subl_query_property_p$UnaryFunction extends UnaryFunction {
    public $cyc_subl_query_property_p$UnaryFunction() { super(extractFunctionNamed("CYC-SUBL-QUERY-PROPERTY-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31362"); }
  }

  public static final class $cyc_subl_tv_p$UnaryFunction extends UnaryFunction {
    public $cyc_subl_tv_p$UnaryFunction() { super(extractFunctionNamed("CYC-SUBL-TV-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31363"); }
  }

  public static final class $cyc_subl_hl_support_module_p$UnaryFunction extends UnaryFunction {
    public $cyc_subl_hl_support_module_p$UnaryFunction() { super(extractFunctionNamed("CYC-SUBL-HL-SUPPORT-MODULE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31361"); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 37682) 
  private static SubLSymbol $8byteinteger_lower_bound$ = null;

  @SubL(source = "cycl/collection-defns.lisp", position = 37824) 
  private static SubLSymbol $8byteinteger_upper_bound$ = null;

  public static final class $cyc_8_byte_integer$UnaryFunction extends UnaryFunction {
    public $cyc_8_byte_integer$UnaryFunction() { super(extractFunctionNamed("CYC-8-BYTE-INTEGER")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31333"); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 38059) 
  private static SubLSymbol $4byteinteger_lower_bound$ = null;

  @SubL(source = "cycl/collection-defns.lisp", position = 38133) 
  private static SubLSymbol $4byteinteger_upper_bound$ = null;

  public static final class $cyc_4_byte_integer$UnaryFunction extends UnaryFunction {
    public $cyc_4_byte_integer$UnaryFunction() { super(extractFunctionNamed("CYC-4-BYTE-INTEGER")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31332"); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 38368) 
  private static SubLSymbol $2byteinteger_lower_bound$ = null;

  @SubL(source = "cycl/collection-defns.lisp", position = 38441) 
  private static SubLSymbol $2byteinteger_upper_bound$ = null;

  public static final class $cyc_2_byte_integer$UnaryFunction extends UnaryFunction {
    public $cyc_2_byte_integer$UnaryFunction() { super(extractFunctionNamed("CYC-2-BYTE-INTEGER")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31331"); }
  }

  @SubL(source = "cycl/collection-defns.lisp", position = 38676) 
  private static SubLSymbol $1byteinteger_lower_bound$ = null;

  @SubL(source = "cycl/collection-defns.lisp", position = 38748) 
  private static SubLSymbol $1byteinteger_upper_bound$ = null;

  public static final class $cyc_1_byte_integer$UnaryFunction extends UnaryFunction {
    public $cyc_1_byte_integer$UnaryFunction() { super(extractFunctionNamed("CYC-1-BYTE-INTEGER")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31330"); }
  }

  public static final class $cyc_bit_datatype$UnaryFunction extends UnaryFunction {
    public $cyc_bit_datatype$UnaryFunction() { super(extractFunctionNamed("CYC-BIT-DATATYPE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31336"); }
  }

  public static final class $cyc_ip4_address$UnaryFunction extends UnaryFunction {
    public $cyc_ip4_address$UnaryFunction() { super(extractFunctionNamed("CYC-IP4-ADDRESS")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31338"); }
  }

  public static final class $cyc_ip4_network_address$UnaryFunction extends UnaryFunction {
    public $cyc_ip4_network_address$UnaryFunction() { super(extractFunctionNamed("CYC-IP4-NETWORK-ADDRESS")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31341"); }
  }

  public static final class $cyc_list_is_minimum_length$UnaryFunction extends UnaryFunction {
    public $cyc_list_is_minimum_length$UnaryFunction() { super(extractFunctionNamed("CYC-LIST-IS-MINIMUM-LENGTH")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31342"); }
  }

  public static final SubLObject declare_collection_defns_file() {
    declareFunction(myName, "cyc_individual_necessary", "CYC-INDIVIDUAL-NECESSARY", 1, 0, false); new $cyc_individual_necessary$UnaryFunction();
    declareFunction(myName, "cycl_expressionP", "CYCL-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "el_expressionP", "EL-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "hl_expression_p", "HL-EXPRESSION-P", 1, 0, false);
    declareFunction(myName, "cycl_open_denotational_termP", "CYCL-OPEN-DENOTATIONAL-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_closed_denotational_termP", "CYCL-CLOSED-DENOTATIONAL-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_reifiable_denotational_termP", "CYCL-REIFIABLE-DENOTATIONAL-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_reified_denotational_termP", "CYCL-REIFIED-DENOTATIONAL-TERM?", 1, 0, false);
    declareFunction(myName, "hl_closed_denotational_term_p", "HL-CLOSED-DENOTATIONAL-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_represented_atomic_term_p", "CYCL-REPRESENTED-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_represented_termP", "CYCL-REPRESENTED-TERM?", 1, 0, false);
    declareFunction(myName, "cyc_system_term_p", "CYC-SYSTEM-TERM-P", 1, 0, false);
    declareFunction(myName, "cyc_system_character_p", "CYC-SYSTEM-CHARACTER-P", 1, 0, false);
    declareFunction(myName, "cyc_system_string_p", "CYC-SYSTEM-STRING-P", 1, 0, false);
    declareFunction(myName, "cyc_system_real_number_p", "CYC-SYSTEM-REAL-NUMBER-P", 1, 0, false);
    declareFunction(myName, "cyc_system_non_variable_symbol_p", "CYC-SYSTEM-NON-VARIABLE-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cycl_subl_symbol_p", "CYCL-SUBL-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "cycl_atomic_term_p", "CYCL-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_closed_atomic_term_p", "CYCL-CLOSED-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "hl_non_atomic_term_p", "HL-NON-ATOMIC-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_non_atomic_termP", "CYCL-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "el_non_atomic_termP", "EL-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "hl_indexed_term_p", "HL-INDEXED-TERM-P", 1, 0, false);
    declareFunction(myName, "cycl_indexed_termP", "CYCL-INDEXED-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_open_non_atomic_termP", "CYCL-OPEN-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_closed_non_atomic_termP", "CYCL-CLOSED-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_reifiable_non_atomic_termP", "CYCL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_non_atomic_reified_termP", "CYCL-NON-ATOMIC-REIFIED-TERM?", 1, 0, false);
    declareFunction(myName, "el_reifiable_non_atomic_termP", "EL-REIFIABLE-NON-ATOMIC-TERM?", 1, 0, false);
    declareFunction(myName, "cycl_closed_expressionP", "CYCL-CLOSED-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "cycl_open_expressionP", "CYCL-OPEN-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "cycl_formulaP", "CYCL-FORMULA?", 1, 0, false);
    declareFunction(myName, "cycl_open_formulaP", "CYCL-OPEN-FORMULA?", 1, 0, false);
    declareFunction(myName, "cycl_closed_formulaP", "CYCL-CLOSED-FORMULA?", 1, 0, false);
    declareFunction(myName, "hl_formula_p", "HL-FORMULA-P", 1, 0, false);
    declareFunction(myName, "cycl_unbound_relation_formula_p", "CYCL-UNBOUND-RELATION-FORMULA-P", 1, 0, false);
    declareFunction(myName, "cycl_sentenceP", "CYCL-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_open_sentenceP", "CYCL-OPEN-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_closed_sentenceP", "CYCL-CLOSED-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cyc_typicality_reference_set_propertyP", "CYC-TYPICALITY-REFERENCE-SET-PROPERTY?", 1, 0, false); new $cyc_typicality_reference_set_propertyP$UnaryFunction();
    declareFunction(myName, "el_sentenceP", "EL-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_atomic_sentenceP", "CYCL-ATOMIC-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_closed_atomic_sentenceP", "CYCL-CLOSED-ATOMIC-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_propositional_sentenceP", "CYCL-PROPOSITIONAL-SENTENCE?", 1, 0, false);
    declareFunction(myName, "cycl_sentence_askableP", "CYCL-SENTENCE-ASKABLE?", 1, 0, false);
    declareFunction(myName, "cycl_sentence_assertibleP", "CYCL-SENTENCE-ASSERTIBLE?", 1, 0, false); new $cycl_sentence_assertibleP$UnaryFunction();
    declareFunction(myName, "el_sentence_askableP", "EL-SENTENCE-ASKABLE?", 1, 0, false);
    declareFunction(myName, "el_sentence_assertibleP", "EL-SENTENCE-ASSERTIBLE?", 1, 0, false);
    declareFunction(myName, "cycl_non_atomic_term_askableP", "CYCL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
    declareFunction(myName, "cycl_non_atomic_term_assertibleP", "CYCL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
    declareFunction(myName, "el_non_atomic_term_askableP", "EL-NON-ATOMIC-TERM-ASKABLE?", 1, 0, false);
    declareFunction(myName, "el_non_atomic_term_assertibleP", "EL-NON-ATOMIC-TERM-ASSERTIBLE?", 1, 0, false);
    declareFunction(myName, "cycl_expression_askableP", "CYCL-EXPRESSION-ASKABLE?", 1, 0, false);
    declareFunction(myName, "cycl_expression_assertibleP", "CYCL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
    declareFunction(myName, "el_expression_askableP", "EL-EXPRESSION-ASKABLE?", 1, 0, false);
    declareFunction(myName, "el_expression_assertibleP", "EL-EXPRESSION-ASSERTIBLE?", 1, 0, false);
    declareFunction(myName, "cycl_queryP", "CYCL-QUERY?", 1, 0, false);
    declareFunction(myName, "cycl_assertionP", "CYCL-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_atomic_assertionP", "CYCL-ATOMIC-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_gaf_assertionP", "CYCL-GAF-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_rule_assertionP", "CYCL-RULE-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_asserted_assertionP", "CYCL-ASSERTED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_deduced_assertionP", "CYCL-DEDUCED-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_nl_semantic_assertionP", "CYCL-NL-SEMANTIC-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cycl_canonicalizer_directiveP", "CYCL-CANONICALIZER-DIRECTIVE?", 1, 0, false); new $cycl_canonicalizer_directiveP$UnaryFunction();
    declareFunction(myName, "cycl_reformulator_directiveP", "CYCL-REFORMULATOR-DIRECTIVE?", 1, 0, false);
    declareFunction(myName, "cycl_reformulator_ruleP", "CYCL-REFORMULATOR-RULE?", 1, 0, false);
    declareFunction(myName, "cycl_simplifier_directiveP", "CYCL-SIMPLIFIER-DIRECTIVE?", 1, 0, false);
    declareFunction(myName, "hl_assertion_p", "HL-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "el_assertionP", "EL-ASSERTION?", 1, 0, false);
    declareFunction(myName, "cyc_indexed_term", "CYC-INDEXED-TERM", 1, 0, false);
    declareFunction(myName, "cyc_assertion", "CYC-ASSERTION", 1, 0, false);
    declareFunction(myName, "cyc_gaf_assertion", "CYC-GAF-ASSERTION", 1, 0, false);
    declareFunction(myName, "cyc_rule_assertion", "CYC-RULE-ASSERTION", 1, 0, false);
    declareFunction(myName, "cyc_nl_semantic_assertion", "CYC-NL-SEMANTIC-ASSERTION", 1, 0, false);
    declareFunction(myName, "cyc_reifiable_term", "CYC-REIFIABLE-TERM", 1, 0, false);
    declareFunction(myName, "cyc_constant", "CYC-CONSTANT", 1, 0, false);
    declareFunction(myName, "cyc_reifiable_nat", "CYC-REIFIABLE-NAT", 1, 0, false);
    declareFunction(myName, "cyc_gaf", "CYC-GAF", 1, 0, false);
    declareFunction(myName, "cyc_atomic_sentence", "CYC-ATOMIC-SENTENCE", 1, 0, false);
    declareFunction(myName, "cyc_first_order_naut", "CYC-FIRST-ORDER-NAUT", 1, 0, false);
    declareFunction(myName, "cyc_term", "CYC-TERM", 1, 0, false);
    declareFunction(myName, "cyc_ground_term", "CYC-GROUND-TERM", 1, 0, false);
    declareFunction(myName, "cyc_closed_term", "CYC-CLOSED-TERM", 1, 0, false);
    declareFunction(myName, "cyc_open_term", "CYC-OPEN-TERM", 1, 0, false);
    declareFunction(myName, "cyc_real_number", "CYC-REAL-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_system_real_number", "CYC-SYSTEM-REAL-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_positive_number", "CYC-POSITIVE-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_negative_number", "CYC-NEGATIVE-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_non_positive_number", "CYC-NON-POSITIVE-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_non_negative_number", "CYC-NON-NEGATIVE-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_rational_number", "CYC-RATIONAL-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_real_0_100", "CYC-REAL-0-100", 1, 0, false);
    declareFunction(myName, "cyc_real_0_1", "CYC-REAL-0-1", 1, 0, false);
    declareFunction(myName, "cyc_real_minus_1_to_plus_1", "CYC-REAL-MINUS-1-TO-PLUS-1", 1, 0, false);
    declareFunction(myName, "cyc_real_1_infinity", "CYC-REAL-1-INFINITY", 1, 0, false);
    declareFunction(myName, "cyc_nonzero_number", "CYC-NONZERO-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_integer", "CYC-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_system_integer", "CYC-SYSTEM-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_positive_integer", "CYC-POSITIVE-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_prime_numberP", "CYC-PRIME-NUMBER?", 1, 0, false);
    declareFunction(myName, "cyc_maybe_prime_numberP", "CYC-MAYBE-PRIME-NUMBER?", 1, 0, false);
    declareFunction(myName, "cyc_negative_integer", "CYC-NEGATIVE-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_non_positive_integer", "CYC-NON-POSITIVE-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_non_negative_integer", "CYC-NON-NEGATIVE-INTEGER", 1, 0, false);
    declareFunction(myName, "cyc_even_number", "CYC-EVEN-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_odd_number", "CYC-ODD-NUMBER", 1, 0, false);
    declareFunction(myName, "cyc_universal_date", "CYC-UNIVERSAL-DATE", 1, 0, false);
    declareFunction(myName, "cyc_universal_second", "CYC-UNIVERSAL-SECOND", 1, 0, false);
    declareFunction(myName, "cyc_set_of_type_necessary", "CYC-SET-OF-TYPE-NECESSARY", 1, 0, false);
    declareFunction(myName, "cyc_set_of_type_sufficient", "CYC-SET-OF-TYPE-SUFFICIENT", 1, 0, false);
    declareFunction(myName, "cyc_list_of_type_necessary", "CYC-LIST-OF-TYPE-NECESSARY", 1, 0, false); new $cyc_list_of_type_necessary$UnaryFunction();
    declareFunction(myName, "cyc_list_of_type_sufficient", "CYC-LIST-OF-TYPE-SUFFICIENT", 1, 0, false); new $cyc_list_of_type_sufficient$UnaryFunction();
    declareFunction(myName, "cyc_set_of_type_guts", "CYC-SET-OF-TYPE-GUTS", 1, 0, false);
    declareFunction(myName, "clear_extensional_setP", "CLEAR-EXTENSIONAL-SET?", 0, 0, false); new $clear_extensional_setP$ZeroArityFunction();
    declareFunction(myName, "remove_extensional_setP", "REMOVE-EXTENSIONAL-SET?", 1, 0, false);
    declareFunction(myName, "extensional_setP_internal", "EXTENSIONAL-SET?-INTERNAL", 1, 0, false);
    declareFunction(myName, "extensional_setP", "EXTENSIONAL-SET?", 1, 0, false);
    declareFunction(myName, "cyc_set_of_type_internal", "CYC-SET-OF-TYPE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cyc_list_of_type_guts", "CYC-LIST-OF-TYPE-GUTS", 1, 0, false);
    declareFunction(myName, "cyc_list_of_type_internal", "CYC-LIST-OF-TYPE-INTERNAL", 2, 0, false);
    declareFunction(myName, "every_in_list_has_type_within_collection_defn", "EVERY-IN-LIST-HAS-TYPE-WITHIN-COLLECTION-DEFN", 2, 0, false);
    declareFunction(myName, "cyc_list_without_repetition", "CYC-LIST-WITHOUT-REPETITION", 1, 0, false);
    declareFunction(myName, "cyc_numeric_string_necessary", "CYC-NUMERIC-STRING-NECESSARY", 1, 0, false); new $cyc_numeric_string_necessary$UnaryFunction();
    declareFunction(myName, "cyc_numeral_string", "CYC-NUMERAL-STRING", 1, 0, false);
    declareFunction(myName, "cyc_numeric_string", "CYC-NUMERIC-STRING", 1, 0, false);
    declareFunction(myName, "cyc_number_string", "CYC-NUMBER-STRING", 1, 0, false);
    declareFunction(myName, "cyc_zip_code_five_digit", "CYC-ZIP-CODE-FIVE-DIGIT", 1, 0, false); new $cyc_zip_code_five_digit$UnaryFunction();
    declareFunction(myName, "cyc_zip_code_nine_digit", "CYC-ZIP-CODE-NINE-DIGIT", 1, 0, false); new $cyc_zip_code_nine_digit$UnaryFunction();
    declareFunction(myName, "cyc_guid_string_p", "CYC-GUID-STRING-P", 1, 0, false); new $cyc_guid_string_p$UnaryFunction();
    declareFunction(myName, "cyc_unicode_denoting_ascii_string_p", "CYC-UNICODE-DENOTING-ASCII-STRING-P", 1, 0, false);
    declareFunction(myName, "cyc_ascii_string_p", "CYC-ASCII-STRING-P", 1, 0, false); new $cyc_ascii_string_p$UnaryFunction();
    declareFunction(myName, "cyc_url", "CYC-URL", 1, 0, false);
    declareFunction(myName, "doctor_me_idP", "DOCTOR-ME-ID?", 1, 0, false);
    declareFunction(myName, "numeric_string_of_lengthP", "NUMERIC-STRING-OF-LENGTH?", 2, 0, false);
    declareFunction(myName, "clpeP", "CLPE?", 1, 0, false);
    declareFunction(myName, "cyc_queryP", "CYC-QUERY?", 1, 0, false);
    declareFunction(myName, "cyc_syntactic_formula_arity_ok", "CYC-SYNTACTIC-FORMULA-ARITY-OK", 1, 0, false);
    declareFunction(myName, "cyc_syntactic_formula", "CYC-SYNTACTIC-FORMULA", 1, 0, false);
    declareFunction(myName, "function_expressionP", "FUNCTION-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "cyc_relation_expressionP", "CYC-RELATION-EXPRESSION?", 1, 0, false);
    declareFunction(myName, "el_variableP", "EL-VARIABLE?", 1, 0, false);
    declareFunction(myName, "cyc_subl_expression", "CYC-SUBL-EXPRESSION", 1, 0, false);
    declareFunction(myName, "cyc_subl_escape", "CYC-SUBL-ESCAPE", 1, 0, false);
    declareFunction(myName, "cyc_subl_template", "CYC-SUBL-TEMPLATE", 1, 0, false);
    declareFunction(myName, "ibqeP", "IBQE?", 1, 1, false);
    declareFunction(myName, "cyc_ibqe", "CYC-IBQE", 1, 0, false);
    declareFunction(myName, "scalar_point_valueP", "SCALAR-POINT-VALUE?", 1, 1, false);
    declareFunction(myName, "non_negative_scalar_intervalP", "NON-NEGATIVE-SCALAR-INTERVAL?", 1, 1, false);
    declareFunction(myName, "positive_scalar_intervalP", "POSITIVE-SCALAR-INTERVAL?", 1, 1, false);
    declareFunction(myName, "unit_of_measureP", "UNIT-OF-MEASURE?", 1, 1, false);
    declareFunction(myName, "term_setP", "TERM-SET?", 1, 0, false);
    declareFunction(myName, "cycl_var_listP", "CYCL-VAR-LIST?", 1, 0, false);
    declareFunction(myName, "cyc_el_var_listP", "CYC-EL-VAR-LIST?", 1, 0, false);
    declareFunction(myName, "cyc_system_atom", "CYC-SYSTEM-ATOM", 1, 0, false);
    declareFunction(myName, "cyc_list_of_lists", "CYC-LIST-OF-LISTS", 1, 0, false); new $cyc_list_of_lists$UnaryFunction();
    declareFunction(myName, "cyc_string_is_length", "CYC-STRING-IS-LENGTH", 1, 0, false); new $cyc_string_is_length$UnaryFunction();
    declareFunction(myName, "cyc_string_is_minimum_length", "CYC-STRING-IS-MINIMUM-LENGTH", 1, 0, false); new $cyc_string_is_minimum_length$UnaryFunction();
    declareFunction(myName, "cyc_string_is_maximum_length", "CYC-STRING-IS-MAXIMUM-LENGTH", 1, 0, false); new $cyc_string_is_maximum_length$UnaryFunction();
    declareFunction(myName, "cyc_list_is_length", "CYC-LIST-IS-LENGTH", 1, 0, false);
    declareFunction(myName, "cyc_list_is_length_internal", "CYC-LIST-IS-LENGTH-INTERNAL", 2, 0, false);
    declareFunction(myName, "cyc_subl_query_property_p", "CYC-SUBL-QUERY-PROPERTY-P", 1, 0, false); new $cyc_subl_query_property_p$UnaryFunction();
    declareFunction(myName, "cyc_subl_tv_p", "CYC-SUBL-TV-P", 1, 0, false); new $cyc_subl_tv_p$UnaryFunction();
    declareFunction(myName, "cyc_subl_hl_support_module_p", "CYC-SUBL-HL-SUPPORT-MODULE-P", 1, 0, false); new $cyc_subl_hl_support_module_p$UnaryFunction();
    declareFunction(myName, "cyc_subl_asserted_argument_token_p", "CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P", 1, 0, false);
    declareFunction(myName, "cyc_subl_kct_metric_identifier_p", "CYC-SUBL-KCT-METRIC-IDENTIFIER-P", 1, 0, false);
    declareFunction(myName, "cyc_8_byte_integer", "CYC-8-BYTE-INTEGER", 1, 0, false); new $cyc_8_byte_integer$UnaryFunction();
    declareFunction(myName, "cyc_4_byte_integer", "CYC-4-BYTE-INTEGER", 1, 0, false); new $cyc_4_byte_integer$UnaryFunction();
    declareFunction(myName, "cyc_2_byte_integer", "CYC-2-BYTE-INTEGER", 1, 0, false); new $cyc_2_byte_integer$UnaryFunction();
    declareFunction(myName, "cyc_1_byte_integer", "CYC-1-BYTE-INTEGER", 1, 0, false); new $cyc_1_byte_integer$UnaryFunction();
    declareFunction(myName, "cyc_bit_datatype", "CYC-BIT-DATATYPE", 1, 0, false); new $cyc_bit_datatype$UnaryFunction();
    declareFunction(myName, "cyc_bit_string", "CYC-BIT-STRING", 1, 0, false);
    declareFunction(myName, "cyc_ip4_address", "CYC-IP4-ADDRESS", 1, 0, false); new $cyc_ip4_address$UnaryFunction();
    declareFunction(myName, "cyc_ip4_network_address", "CYC-IP4-NETWORK-ADDRESS", 1, 0, false); new $cyc_ip4_network_address$UnaryFunction();
    declareFunction(myName, "cyc_list_is_minimum_length", "CYC-LIST-IS-MINIMUM-LENGTH", 1, 0, false); new $cyc_list_is_minimum_length$UnaryFunction();
    declareFunction(myName, "cyc_list_is_minimum_length_internal", "CYC-LIST-IS-MINIMUM-LENGTH-INTERNAL", 2, 0, false);
    declareFunction(myName, "cyc_list_is_maximum_length", "CYC-LIST-IS-MAXIMUM-LENGTH", 1, 0, false);
    declareFunction(myName, "cyc_list_is_maximum_length_internal", "CYC-LIST-IS-MAXIMUM-LENGTH-INTERNAL", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_collection_defns_file() {
    $subl_functions_used_as_collection_defns$ = deflexical("*SUBL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", $list0);
    $cycl_functions_used_as_collection_defns$ = deflexical("*CYCL-FUNCTIONS-USED-AS-COLLECTION-DEFNS*", $list1);
    $extensional_setP_caching_state$ = deflexical("*EXTENSIONAL-SET?-CACHING-STATE*", NIL);
    $8byteinteger_lower_bound$ = defconstant("*8BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt(TWO_INTEGER, $int169$63)), ONE_INTEGER));
    $8byteinteger_upper_bound$ = defconstant("*8BYTEINTEGER-UPPER-BOUND*", Numbers.expt(TWO_INTEGER, $int169$63));
    $4byteinteger_lower_bound$ = defconstant("*4BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt(TWO_INTEGER, $int171$31)), ONE_INTEGER));
    $4byteinteger_upper_bound$ = defconstant("*4BYTEINTEGER-UPPER-BOUND*", Numbers.expt(TWO_INTEGER, $int171$31));
    $2byteinteger_lower_bound$ = defconstant("*2BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt(TWO_INTEGER, FIFTEEN_INTEGER)), ONE_INTEGER));
    $2byteinteger_upper_bound$ = defconstant("*2BYTEINTEGER-UPPER-BOUND*", Numbers.expt(TWO_INTEGER, FIFTEEN_INTEGER));
    $1byteinteger_lower_bound$ = defconstant("*1BYTEINTEGER-LOWER-BOUND*", Numbers.subtract(Numbers.minus(Numbers.expt(TWO_INTEGER, SEVEN_INTEGER)), ONE_INTEGER));
    $1byteinteger_upper_bound$ = defconstant("*1BYTEINTEGER-UPPER-BOUND*", Numbers.expt(TWO_INTEGER, SEVEN_INTEGER));
    return NIL;
  }

  public static final SubLObject setup_collection_defns_file() {
    // CVS_ID("Id: collection-defns.lisp 126640 2008-12-04 13:39:36Z builder ");
    {
      SubLObject cdolist_list_var = $subl_functions_used_as_collection_defns$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_kb_function(symbol);
      }
    }
    {
      SubLObject cdolist_list_var = $cycl_functions_used_as_collection_defns$.getGlobalValue();
      SubLObject symbol = NIL;
      for (symbol = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), symbol = cdolist_list_var.first()) {
        utilities_macros.register_kb_function(symbol);
      }
    }
    utilities_macros.register_kb_function($sym2$CYC_INDIVIDUAL_NECESSARY);
    utilities_macros.register_kb_function($sym3$CYCL_EXPRESSION_);
    utilities_macros.register_kb_function($sym4$EL_EXPRESSION_);
    utilities_macros.register_kb_function($sym5$HL_EXPRESSION_P);
    utilities_macros.register_kb_function($sym6$CYCL_OPEN_DENOTATIONAL_TERM_);
    utilities_macros.register_kb_function($sym7$CYCL_CLOSED_DENOTATIONAL_TERM_);
    utilities_macros.register_kb_function($sym8$CYCL_REIFIABLE_DENOTATIONAL_TERM_);
    utilities_macros.register_kb_function($sym9$CYCL_REIFIED_DENOTATIONAL_TERM_);
    utilities_macros.register_kb_function($sym10$HL_CLOSED_DENOTATIONAL_TERM_P);
    utilities_macros.register_kb_function($sym11$CYCL_REPRESENTED_ATOMIC_TERM_P);
    utilities_macros.register_kb_function($sym12$CYCL_REPRESENTED_TERM_);
    utilities_macros.register_kb_function($sym13$CYC_SYSTEM_TERM_P);
    utilities_macros.register_kb_function($sym14$CYC_SYSTEM_CHARACTER_P);
    utilities_macros.register_kb_function($sym15$CYC_SYSTEM_STRING_P);
    utilities_macros.register_kb_function($sym16$CYC_SYSTEM_REAL_NUMBER_P);
    utilities_macros.register_kb_function($sym17$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P);
    utilities_macros.register_kb_function($sym18$CYCL_SUBL_SYMBOL_P);
    utilities_macros.register_kb_function($sym19$CYCL_ATOMIC_TERM_P);
    utilities_macros.register_kb_function($sym20$CYCL_CLOSED_ATOMIC_TERM_P);
    utilities_macros.register_kb_function($sym21$HL_NON_ATOMIC_TERM_P);
    utilities_macros.register_kb_function($sym22$CYCL_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym23$EL_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym24$HL_INDEXED_TERM_P);
    utilities_macros.register_kb_function($sym25$CYCL_INDEXED_TERM_);
    utilities_macros.register_kb_function($sym26$CYCL_OPEN_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym27$CYCL_CLOSED_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym28$CYCL_REIFIABLE_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym29$CYCL_NON_ATOMIC_REIFIED_TERM_);
    utilities_macros.register_kb_function($sym30$EL_REIFIABLE_NON_ATOMIC_TERM_);
    utilities_macros.register_kb_function($sym31$CYCL_CLOSED_EXPRESSION_);
    utilities_macros.register_kb_function($sym32$CYCL_OPEN_EXPRESSION_);
    utilities_macros.register_kb_function($sym33$CYCL_FORMULA_);
    utilities_macros.register_kb_function($sym34$CYCL_OPEN_FORMULA_);
    utilities_macros.register_kb_function($sym35$CYCL_CLOSED_FORMULA_);
    utilities_macros.register_kb_function($sym36$HL_FORMULA_P);
    utilities_macros.register_kb_function($sym37$CYCL_UNBOUND_RELATION_FORMULA_P);
    utilities_macros.register_kb_function($sym38$CYCL_SENTENCE_);
    utilities_macros.register_kb_function($sym39$CYCL_OPEN_SENTENCE_);
    utilities_macros.register_kb_function($sym40$CYCL_CLOSED_SENTENCE_);
    utilities_macros.register_kb_function($sym42$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_);
    utilities_macros.register_kb_function($sym43$EL_SENTENCE_);
    utilities_macros.register_kb_function($sym44$CYCL_ATOMIC_SENTENCE_);
    utilities_macros.register_kb_function($sym45$CYCL_CLOSED_ATOMIC_SENTENCE_);
    utilities_macros.register_kb_function($sym46$CYCL_PROPOSITIONAL_SENTENCE_);
    utilities_macros.register_kb_function($sym47$CYCL_SENTENCE_ASKABLE_);
    utilities_macros.register_kb_function($sym48$CYCL_SENTENCE_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym49$EL_SENTENCE_ASKABLE_);
    utilities_macros.register_kb_function($sym50$EL_SENTENCE_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym51$CYCL_NON_ATOMIC_TERM_ASKABLE_);
    utilities_macros.register_kb_function($sym52$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym53$EL_NON_ATOMIC_TERM_ASKABLE_);
    utilities_macros.register_kb_function($sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym55$CYCL_EXPRESSION_ASKABLE_);
    utilities_macros.register_kb_function($sym56$CYCL_EXPRESSION_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym57$EL_EXPRESSION_ASKABLE_);
    utilities_macros.register_kb_function($sym58$EL_EXPRESSION_ASSERTIBLE_);
    utilities_macros.register_kb_function($sym59$CYCL_QUERY_);
    utilities_macros.register_kb_function($sym60$CYCL_ASSERTION_);
    utilities_macros.register_kb_function($sym61$CYCL_ATOMIC_ASSERTION_);
    utilities_macros.register_kb_function($sym62$CYCL_GAF_ASSERTION_);
    utilities_macros.register_kb_function($sym63$CYCL_RULE_ASSERTION_);
    utilities_macros.register_kb_function($sym64$CYCL_ASSERTED_ASSERTION_);
    utilities_macros.register_kb_function($sym65$CYCL_DEDUCED_ASSERTION_);
    utilities_macros.register_kb_function($sym66$CYCL_NL_SEMANTIC_ASSERTION_);
    utilities_macros.register_kb_function($sym68$CYCL_CANONICALIZER_DIRECTIVE_);
    utilities_macros.register_kb_function($sym70$CYCL_REFORMULATOR_DIRECTIVE_);
    utilities_macros.register_kb_function($sym73$CYCL_REFORMULATOR_RULE_);
    utilities_macros.register_kb_function($sym75$CYCL_SIMPLIFIER_DIRECTIVE_);
    utilities_macros.register_kb_function($sym76$HL_ASSERTION_P);
    utilities_macros.register_kb_function($sym77$EL_ASSERTION_);
    utilities_macros.register_kb_function($sym78$CYC_GROUND_TERM);
    utilities_macros.register_kb_function($sym79$CYC_REAL_NUMBER);
    utilities_macros.register_kb_function($sym80$CYC_SYSTEM_REAL_NUMBER);
    utilities_macros.register_kb_function($sym81$CYC_POSITIVE_NUMBER);
    utilities_macros.register_kb_function($sym82$CYC_NEGATIVE_NUMBER);
    utilities_macros.register_kb_function($sym83$CYC_NON_POSITIVE_NUMBER);
    utilities_macros.register_kb_function($sym84$CYC_NON_NEGATIVE_NUMBER);
    utilities_macros.register_kb_function($sym85$CYC_RATIONAL_NUMBER);
    utilities_macros.register_kb_function($sym87$CYC_REAL_0_100);
    utilities_macros.register_kb_function($sym89$CYC_REAL_0_1);
    utilities_macros.register_kb_function($sym91$CYC_REAL_MINUS_1_TO_PLUS_1);
    utilities_macros.register_kb_function($sym92$CYC_REAL_1_INFINITY);
    utilities_macros.register_kb_function($sym93$CYC_NONZERO_NUMBER);
    utilities_macros.register_kb_function($sym94$CYC_INTEGER);
    utilities_macros.register_kb_function($sym95$CYC_SYSTEM_INTEGER);
    utilities_macros.register_kb_function($sym96$CYC_POSITIVE_INTEGER);
    utilities_macros.register_kb_function($sym97$CYC_PRIME_NUMBER_);
    utilities_macros.register_kb_function($sym99$CYC_MAYBE_PRIME_NUMBER_);
    utilities_macros.register_kb_function($sym100$CYC_NEGATIVE_INTEGER);
    utilities_macros.register_kb_function($sym101$CYC_NON_POSITIVE_INTEGER);
    utilities_macros.register_kb_function($sym102$CYC_NON_NEGATIVE_INTEGER);
    utilities_macros.register_kb_function($sym103$CYC_EVEN_NUMBER);
    utilities_macros.register_kb_function($sym104$CYC_ODD_NUMBER);
    utilities_macros.register_kb_function($sym105$CYC_UNIVERSAL_DATE);
    utilities_macros.register_kb_function($sym106$CYC_UNIVERSAL_SECOND);
    if ($sym107$CYC_SET_OF_TYPE_NECESSARY.isSymbol()) {
      {
        SubLObject item_var = $sym107$CYC_SET_OF_TYPE_NECESSARY;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym107$CYC_SET_OF_TYPE_NECESSARY);
    if ($sym109$CYC_SET_OF_TYPE_SUFFICIENT.isSymbol()) {
      {
        SubLObject item_var = $sym109$CYC_SET_OF_TYPE_SUFFICIENT;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym109$CYC_SET_OF_TYPE_SUFFICIENT);
    if ($sym110$CYC_LIST_OF_TYPE_NECESSARY.isSymbol()) {
      {
        SubLObject item_var = $sym110$CYC_LIST_OF_TYPE_NECESSARY;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym110$CYC_LIST_OF_TYPE_NECESSARY);
    if ($sym111$CYC_LIST_OF_TYPE_SUFFICIENT.isSymbol()) {
      {
        SubLObject item_var = $sym111$CYC_LIST_OF_TYPE_SUFFICIENT;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym111$CYC_LIST_OF_TYPE_SUFFICIENT);
    memoization_state.note_globally_cached_function($sym113$EXTENSIONAL_SET_);
    utilities_macros.register_kb_function($sym123$CYC_LIST_WITHOUT_REPETITION);
    utilities_macros.register_kb_function($sym124$CYC_NUMERIC_STRING_NECESSARY);
    utilities_macros.register_kb_function($sym125$CYC_NUMERAL_STRING);
    utilities_macros.register_kb_function($sym126$CYC_NUMERIC_STRING);
    utilities_macros.register_kb_function($sym127$CYC_NUMBER_STRING);
    utilities_macros.register_kb_function($sym128$CYC_ZIP_CODE_FIVE_DIGIT);
    utilities_macros.register_kb_function($sym130$CYC_ZIP_CODE_NINE_DIGIT);
    utilities_macros.register_kb_function($sym131$CYC_GUID_STRING_P);
    utilities_macros.register_kb_function($sym132$CYC_UNICODE_DENOTING_ASCII_STRING_P);
    utilities_macros.register_kb_function($sym133$CYC_ASCII_STRING_P);
    utilities_macros.register_kb_function($sym134$CYC_URL);
    utilities_macros.register_kb_function($sym135$DOCTOR_ME_ID_);
    utilities_macros.register_kb_function($sym136$CLPE_);
    utilities_macros.register_kb_function($sym137$CYC_QUERY_);
    utilities_macros.register_kb_function($sym138$CYC_SYNTACTIC_FORMULA_ARITY_OK);
    utilities_macros.register_kb_function($sym139$CYC_SYNTACTIC_FORMULA);
    utilities_macros.register_kb_function($sym140$FUNCTION_EXPRESSION_);
    utilities_macros.register_kb_function($sym141$CYC_RELATION_EXPRESSION_);
    utilities_macros.register_kb_function($sym142$EL_VARIABLE_);
    utilities_macros.register_kb_function($sym143$CYC_SUBL_EXPRESSION);
    utilities_macros.register_kb_function($sym144$CYC_SUBL_ESCAPE);
    utilities_macros.register_kb_function($sym145$CYC_SUBL_TEMPLATE);
    utilities_macros.register_kb_function($sym146$IBQE_);
    utilities_macros.register_kb_function($sym147$SCALAR_POINT_VALUE_);
    utilities_macros.register_kb_function($sym148$NON_NEGATIVE_SCALAR_INTERVAL_);
    utilities_macros.register_kb_function($sym149$POSITIVE_SCALAR_INTERVAL_);
    utilities_macros.register_kb_function($sym151$TERM_SET_);
    utilities_macros.register_kb_function($sym152$CYCL_VAR_LIST_);
    utilities_macros.register_kb_function($sym153$CYC_EL_VAR_LIST_);
    utilities_macros.register_kb_function($sym154$CYC_SYSTEM_ATOM);
    utilities_macros.register_kb_function($sym156$CYC_LIST_OF_LISTS);
    if ($sym157$CYC_STRING_IS_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym157$CYC_STRING_IS_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym157$CYC_STRING_IS_LENGTH);
    if ($sym159$CYC_STRING_IS_MINIMUM_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym159$CYC_STRING_IS_MINIMUM_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym159$CYC_STRING_IS_MINIMUM_LENGTH);
    if ($sym161$CYC_STRING_IS_MAXIMUM_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym161$CYC_STRING_IS_MAXIMUM_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym161$CYC_STRING_IS_MAXIMUM_LENGTH);
    if ($sym163$CYC_LIST_IS_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym163$CYC_LIST_IS_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym163$CYC_LIST_IS_LENGTH);
    utilities_macros.register_kb_function($sym164$CYC_SUBL_QUERY_PROPERTY_P);
    utilities_macros.register_kb_function($sym165$CYC_SUBL_TV_P);
    utilities_macros.register_kb_function($sym166$CYC_SUBL_HL_SUPPORT_MODULE_P);
    utilities_macros.register_kb_function($sym167$CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P);
    utilities_macros.register_kb_function($sym168$CYC_SUBL_KCT_METRIC_IDENTIFIER_P);
    utilities_macros.register_kb_function($sym170$CYC_8_BYTE_INTEGER);
    utilities_macros.register_kb_function($sym172$CYC_4_BYTE_INTEGER);
    utilities_macros.register_kb_function($sym173$CYC_2_BYTE_INTEGER);
    utilities_macros.register_kb_function($sym174$CYC_1_BYTE_INTEGER);
    utilities_macros.register_kb_function($sym177$CYC_BIT_STRING);
    utilities_macros.register_kb_function($sym180$CYC_IP4_ADDRESS);
    utilities_macros.register_kb_function($sym183$CYC_IP4_NETWORK_ADDRESS);
    if ($sym184$CYC_LIST_IS_MINIMUM_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym184$CYC_LIST_IS_MINIMUM_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym184$CYC_LIST_IS_MINIMUM_LENGTH);
    if ($sym185$CYC_LIST_IS_MAXIMUM_LENGTH.isSymbol()) {
      {
        SubLObject item_var = $sym185$CYC_LIST_IS_MAXIMUM_LENGTH;
        if ((NIL == conses_high.member(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          at_vars.$at_collection_specific_defns$.setDynamicValue(cons(item_var, at_vars.$at_collection_specific_defns$.getDynamicValue()));
        }
      }
    }
    utilities_macros.register_kb_function($sym185$CYC_LIST_IS_MAXIMUM_LENGTH);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("STRINGP"), makeSymbol("INTEGERP"), makeSymbol("KEYWORDP"), makeSymbol("LISTP"), makeSymbol("SYMBOLP"), makeSymbol("TRUE"), makeSymbol("FALSE"));
  public static final SubLList $list1 = list(new SubLObject[] {makeSymbol("CYCL-CONSTANT-P"), makeSymbol("CYCL-VARIABLE-P"), makeSymbol("EL-VARIABLE-P"), makeSymbol("HL-VARIABLE-P"), makeSymbol("CYCL-DENOTATIONAL-TERM-P"), makeSymbol("EL-RELATION-EXPRESSION?"), makeSymbol("GAF?"), makeSymbol("STRING-W/O-CONTROL-CHARS?"), makeSymbol("URL-P")});
  public static final SubLSymbol $sym2$CYC_INDIVIDUAL_NECESSARY = makeSymbol("CYC-INDIVIDUAL-NECESSARY");
  public static final SubLSymbol $sym3$CYCL_EXPRESSION_ = makeSymbol("CYCL-EXPRESSION?");
  public static final SubLSymbol $sym4$EL_EXPRESSION_ = makeSymbol("EL-EXPRESSION?");
  public static final SubLSymbol $sym5$HL_EXPRESSION_P = makeSymbol("HL-EXPRESSION-P");
  public static final SubLSymbol $sym6$CYCL_OPEN_DENOTATIONAL_TERM_ = makeSymbol("CYCL-OPEN-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym7$CYCL_CLOSED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-CLOSED-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym8$CYCL_REIFIABLE_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIABLE-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym9$CYCL_REIFIED_DENOTATIONAL_TERM_ = makeSymbol("CYCL-REIFIED-DENOTATIONAL-TERM?");
  public static final SubLSymbol $sym10$HL_CLOSED_DENOTATIONAL_TERM_P = makeSymbol("HL-CLOSED-DENOTATIONAL-TERM-P");
  public static final SubLSymbol $sym11$CYCL_REPRESENTED_ATOMIC_TERM_P = makeSymbol("CYCL-REPRESENTED-ATOMIC-TERM-P");
  public static final SubLSymbol $sym12$CYCL_REPRESENTED_TERM_ = makeSymbol("CYCL-REPRESENTED-TERM?");
  public static final SubLSymbol $sym13$CYC_SYSTEM_TERM_P = makeSymbol("CYC-SYSTEM-TERM-P");
  public static final SubLSymbol $sym14$CYC_SYSTEM_CHARACTER_P = makeSymbol("CYC-SYSTEM-CHARACTER-P");
  public static final SubLSymbol $sym15$CYC_SYSTEM_STRING_P = makeSymbol("CYC-SYSTEM-STRING-P");
  public static final SubLSymbol $sym16$CYC_SYSTEM_REAL_NUMBER_P = makeSymbol("CYC-SYSTEM-REAL-NUMBER-P");
  public static final SubLSymbol $sym17$CYC_SYSTEM_NON_VARIABLE_SYMBOL_P = makeSymbol("CYC-SYSTEM-NON-VARIABLE-SYMBOL-P");
  public static final SubLSymbol $sym18$CYCL_SUBL_SYMBOL_P = makeSymbol("CYCL-SUBL-SYMBOL-P");
  public static final SubLSymbol $sym19$CYCL_ATOMIC_TERM_P = makeSymbol("CYCL-ATOMIC-TERM-P");
  public static final SubLSymbol $sym20$CYCL_CLOSED_ATOMIC_TERM_P = makeSymbol("CYCL-CLOSED-ATOMIC-TERM-P");
  public static final SubLSymbol $sym21$HL_NON_ATOMIC_TERM_P = makeSymbol("HL-NON-ATOMIC-TERM-P");
  public static final SubLSymbol $sym22$CYCL_NON_ATOMIC_TERM_ = makeSymbol("CYCL-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym23$EL_NON_ATOMIC_TERM_ = makeSymbol("EL-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym24$HL_INDEXED_TERM_P = makeSymbol("HL-INDEXED-TERM-P");
  public static final SubLSymbol $sym25$CYCL_INDEXED_TERM_ = makeSymbol("CYCL-INDEXED-TERM?");
  public static final SubLSymbol $sym26$CYCL_OPEN_NON_ATOMIC_TERM_ = makeSymbol("CYCL-OPEN-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym27$CYCL_CLOSED_NON_ATOMIC_TERM_ = makeSymbol("CYCL-CLOSED-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym28$CYCL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("CYCL-REIFIABLE-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym29$CYCL_NON_ATOMIC_REIFIED_TERM_ = makeSymbol("CYCL-NON-ATOMIC-REIFIED-TERM?");
  public static final SubLSymbol $sym30$EL_REIFIABLE_NON_ATOMIC_TERM_ = makeSymbol("EL-REIFIABLE-NON-ATOMIC-TERM?");
  public static final SubLSymbol $sym31$CYCL_CLOSED_EXPRESSION_ = makeSymbol("CYCL-CLOSED-EXPRESSION?");
  public static final SubLSymbol $sym32$CYCL_OPEN_EXPRESSION_ = makeSymbol("CYCL-OPEN-EXPRESSION?");
  public static final SubLSymbol $sym33$CYCL_FORMULA_ = makeSymbol("CYCL-FORMULA?");
  public static final SubLSymbol $sym34$CYCL_OPEN_FORMULA_ = makeSymbol("CYCL-OPEN-FORMULA?");
  public static final SubLSymbol $sym35$CYCL_CLOSED_FORMULA_ = makeSymbol("CYCL-CLOSED-FORMULA?");
  public static final SubLSymbol $sym36$HL_FORMULA_P = makeSymbol("HL-FORMULA-P");
  public static final SubLSymbol $sym37$CYCL_UNBOUND_RELATION_FORMULA_P = makeSymbol("CYCL-UNBOUND-RELATION-FORMULA-P");
  public static final SubLSymbol $sym38$CYCL_SENTENCE_ = makeSymbol("CYCL-SENTENCE?");
  public static final SubLSymbol $sym39$CYCL_OPEN_SENTENCE_ = makeSymbol("CYCL-OPEN-SENTENCE?");
  public static final SubLSymbol $sym40$CYCL_CLOSED_SENTENCE_ = makeSymbol("CYCL-CLOSED-SENTENCE?");
  public static final SubLSymbol $kw41$TERM = makeKeyword("TERM");
  public static final SubLSymbol $sym42$CYC_TYPICALITY_REFERENCE_SET_PROPERTY_ = makeSymbol("CYC-TYPICALITY-REFERENCE-SET-PROPERTY?");
  public static final SubLSymbol $sym43$EL_SENTENCE_ = makeSymbol("EL-SENTENCE?");
  public static final SubLSymbol $sym44$CYCL_ATOMIC_SENTENCE_ = makeSymbol("CYCL-ATOMIC-SENTENCE?");
  public static final SubLSymbol $sym45$CYCL_CLOSED_ATOMIC_SENTENCE_ = makeSymbol("CYCL-CLOSED-ATOMIC-SENTENCE?");
  public static final SubLSymbol $sym46$CYCL_PROPOSITIONAL_SENTENCE_ = makeSymbol("CYCL-PROPOSITIONAL-SENTENCE?");
  public static final SubLSymbol $sym47$CYCL_SENTENCE_ASKABLE_ = makeSymbol("CYCL-SENTENCE-ASKABLE?");
  public static final SubLSymbol $sym48$CYCL_SENTENCE_ASSERTIBLE_ = makeSymbol("CYCL-SENTENCE-ASSERTIBLE?");
  public static final SubLSymbol $sym49$EL_SENTENCE_ASKABLE_ = makeSymbol("EL-SENTENCE-ASKABLE?");
  public static final SubLSymbol $sym50$EL_SENTENCE_ASSERTIBLE_ = makeSymbol("EL-SENTENCE-ASSERTIBLE?");
  public static final SubLSymbol $sym51$CYCL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASKABLE?");
  public static final SubLSymbol $sym52$CYCL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("CYCL-NON-ATOMIC-TERM-ASSERTIBLE?");
  public static final SubLSymbol $sym53$EL_NON_ATOMIC_TERM_ASKABLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASKABLE?");
  public static final SubLSymbol $sym54$EL_NON_ATOMIC_TERM_ASSERTIBLE_ = makeSymbol("EL-NON-ATOMIC-TERM-ASSERTIBLE?");
  public static final SubLSymbol $sym55$CYCL_EXPRESSION_ASKABLE_ = makeSymbol("CYCL-EXPRESSION-ASKABLE?");
  public static final SubLSymbol $sym56$CYCL_EXPRESSION_ASSERTIBLE_ = makeSymbol("CYCL-EXPRESSION-ASSERTIBLE?");
  public static final SubLSymbol $sym57$EL_EXPRESSION_ASKABLE_ = makeSymbol("EL-EXPRESSION-ASKABLE?");
  public static final SubLSymbol $sym58$EL_EXPRESSION_ASSERTIBLE_ = makeSymbol("EL-EXPRESSION-ASSERTIBLE?");
  public static final SubLSymbol $sym59$CYCL_QUERY_ = makeSymbol("CYCL-QUERY?");
  public static final SubLSymbol $sym60$CYCL_ASSERTION_ = makeSymbol("CYCL-ASSERTION?");
  public static final SubLSymbol $sym61$CYCL_ATOMIC_ASSERTION_ = makeSymbol("CYCL-ATOMIC-ASSERTION?");
  public static final SubLSymbol $sym62$CYCL_GAF_ASSERTION_ = makeSymbol("CYCL-GAF-ASSERTION?");
  public static final SubLSymbol $sym63$CYCL_RULE_ASSERTION_ = makeSymbol("CYCL-RULE-ASSERTION?");
  public static final SubLSymbol $sym64$CYCL_ASSERTED_ASSERTION_ = makeSymbol("CYCL-ASSERTED-ASSERTION?");
  public static final SubLSymbol $sym65$CYCL_DEDUCED_ASSERTION_ = makeSymbol("CYCL-DEDUCED-ASSERTION?");
  public static final SubLSymbol $sym66$CYCL_NL_SEMANTIC_ASSERTION_ = makeSymbol("CYCL-NL-SEMANTIC-ASSERTION?");
  public static final SubLObject $const67$CanonicalizerDirectivePredicate = constant_handles.reader_make_constant_shell(makeString("CanonicalizerDirectivePredicate"));
  public static final SubLSymbol $sym68$CYCL_CANONICALIZER_DIRECTIVE_ = makeSymbol("CYCL-CANONICALIZER-DIRECTIVE?");
  public static final SubLObject $const69$ReformulatorDirectivePredicate = constant_handles.reader_make_constant_shell(makeString("ReformulatorDirectivePredicate"));
  public static final SubLSymbol $sym70$CYCL_REFORMULATOR_DIRECTIVE_ = makeSymbol("CYCL-REFORMULATOR-DIRECTIVE?");
  public static final SubLObject $const71$CycLReformulationRulePredicate = constant_handles.reader_make_constant_shell(makeString("CycLReformulationRulePredicate"));
  public static final SubLObject $const72$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym73$CYCL_REFORMULATOR_RULE_ = makeSymbol("CYCL-REFORMULATOR-RULE?");
  public static final SubLObject $const74$SimplifierDirectivePredicate = constant_handles.reader_make_constant_shell(makeString("SimplifierDirectivePredicate"));
  public static final SubLSymbol $sym75$CYCL_SIMPLIFIER_DIRECTIVE_ = makeSymbol("CYCL-SIMPLIFIER-DIRECTIVE?");
  public static final SubLSymbol $sym76$HL_ASSERTION_P = makeSymbol("HL-ASSERTION-P");
  public static final SubLSymbol $sym77$EL_ASSERTION_ = makeSymbol("EL-ASSERTION?");
  public static final SubLSymbol $sym78$CYC_GROUND_TERM = makeSymbol("CYC-GROUND-TERM");
  public static final SubLSymbol $sym79$CYC_REAL_NUMBER = makeSymbol("CYC-REAL-NUMBER");
  public static final SubLSymbol $sym80$CYC_SYSTEM_REAL_NUMBER = makeSymbol("CYC-SYSTEM-REAL-NUMBER");
  public static final SubLSymbol $sym81$CYC_POSITIVE_NUMBER = makeSymbol("CYC-POSITIVE-NUMBER");
  public static final SubLSymbol $sym82$CYC_NEGATIVE_NUMBER = makeSymbol("CYC-NEGATIVE-NUMBER");
  public static final SubLSymbol $sym83$CYC_NON_POSITIVE_NUMBER = makeSymbol("CYC-NON-POSITIVE-NUMBER");
  public static final SubLSymbol $sym84$CYC_NON_NEGATIVE_NUMBER = makeSymbol("CYC-NON-NEGATIVE-NUMBER");
  public static final SubLSymbol $sym85$CYC_RATIONAL_NUMBER = makeSymbol("CYC-RATIONAL-NUMBER");
  public static final SubLFloat $float86$100_0 = makeDouble(100.0);
  public static final SubLSymbol $sym87$CYC_REAL_0_100 = makeSymbol("CYC-REAL-0-100");
  public static final SubLFloat $float88$1_0 = makeDouble(1.0);
  public static final SubLSymbol $sym89$CYC_REAL_0_1 = makeSymbol("CYC-REAL-0-1");
  public static final SubLFloat $float90$_1_0 = makeDouble(-1.0);
  public static final SubLSymbol $sym91$CYC_REAL_MINUS_1_TO_PLUS_1 = makeSymbol("CYC-REAL-MINUS-1-TO-PLUS-1");
  public static final SubLSymbol $sym92$CYC_REAL_1_INFINITY = makeSymbol("CYC-REAL-1-INFINITY");
  public static final SubLSymbol $sym93$CYC_NONZERO_NUMBER = makeSymbol("CYC-NONZERO-NUMBER");
  public static final SubLSymbol $sym94$CYC_INTEGER = makeSymbol("CYC-INTEGER");
  public static final SubLSymbol $sym95$CYC_SYSTEM_INTEGER = makeSymbol("CYC-SYSTEM-INTEGER");
  public static final SubLSymbol $sym96$CYC_POSITIVE_INTEGER = makeSymbol("CYC-POSITIVE-INTEGER");
  public static final SubLSymbol $sym97$CYC_PRIME_NUMBER_ = makeSymbol("CYC-PRIME-NUMBER?");
  public static final SubLSymbol $sym98$CONSTANT_P = makeSymbol("CONSTANT-P");
  public static final SubLSymbol $sym99$CYC_MAYBE_PRIME_NUMBER_ = makeSymbol("CYC-MAYBE-PRIME-NUMBER?");
  public static final SubLSymbol $sym100$CYC_NEGATIVE_INTEGER = makeSymbol("CYC-NEGATIVE-INTEGER");
  public static final SubLSymbol $sym101$CYC_NON_POSITIVE_INTEGER = makeSymbol("CYC-NON-POSITIVE-INTEGER");
  public static final SubLSymbol $sym102$CYC_NON_NEGATIVE_INTEGER = makeSymbol("CYC-NON-NEGATIVE-INTEGER");
  public static final SubLSymbol $sym103$CYC_EVEN_NUMBER = makeSymbol("CYC-EVEN-NUMBER");
  public static final SubLSymbol $sym104$CYC_ODD_NUMBER = makeSymbol("CYC-ODD-NUMBER");
  public static final SubLSymbol $sym105$CYC_UNIVERSAL_DATE = makeSymbol("CYC-UNIVERSAL-DATE");
  public static final SubLSymbol $sym106$CYC_UNIVERSAL_SECOND = makeSymbol("CYC-UNIVERSAL-SECOND");
  public static final SubLSymbol $sym107$CYC_SET_OF_TYPE_NECESSARY = makeSymbol("CYC-SET-OF-TYPE-NECESSARY");
  public static final SubLSymbol $kw108$AGNOSTIC = makeKeyword("AGNOSTIC");
  public static final SubLSymbol $sym109$CYC_SET_OF_TYPE_SUFFICIENT = makeSymbol("CYC-SET-OF-TYPE-SUFFICIENT");
  public static final SubLSymbol $sym110$CYC_LIST_OF_TYPE_NECESSARY = makeSymbol("CYC-LIST-OF-TYPE-NECESSARY");
  public static final SubLSymbol $sym111$CYC_LIST_OF_TYPE_SUFFICIENT = makeSymbol("CYC-LIST-OF-TYPE-SUFFICIENT");
  public static final SubLObject $const112$instanceElementType = constant_handles.reader_make_constant_shell(makeString("instanceElementType"));
  public static final SubLSymbol $sym113$EXTENSIONAL_SET_ = makeSymbol("EXTENSIONAL-SET?");
  public static final SubLObject $const114$Set_Extensional = constant_handles.reader_make_constant_shell(makeString("Set-Extensional"));
  public static final SubLSymbol $sym115$_EXTENSIONAL_SET__CACHING_STATE_ = makeSymbol("*EXTENSIONAL-SET?-CACHING-STATE*");
  public static final SubLInteger $int116$32 = makeInteger(32);
  public static final SubLSymbol $sym117$CLEAR_EXTENSIONAL_SET_ = makeSymbol("CLEAR-EXTENSIONAL-SET?");
  public static final SubLSymbol $kw118$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLObject $const119$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLObject $const120$List_Extensional = constant_handles.reader_make_constant_shell(makeString("List-Extensional"));
  public static final SubLObject $const121$instanceListMemberType = constant_handles.reader_make_constant_shell(makeString("instanceListMemberType"));
  public static final SubLObject $const122$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));
  public static final SubLSymbol $sym123$CYC_LIST_WITHOUT_REPETITION = makeSymbol("CYC-LIST-WITHOUT-REPETITION");
  public static final SubLSymbol $sym124$CYC_NUMERIC_STRING_NECESSARY = makeSymbol("CYC-NUMERIC-STRING-NECESSARY");
  public static final SubLSymbol $sym125$CYC_NUMERAL_STRING = makeSymbol("CYC-NUMERAL-STRING");
  public static final SubLSymbol $sym126$CYC_NUMERIC_STRING = makeSymbol("CYC-NUMERIC-STRING");
  public static final SubLSymbol $sym127$CYC_NUMBER_STRING = makeSymbol("CYC-NUMBER-STRING");
  public static final SubLSymbol $sym128$CYC_ZIP_CODE_FIVE_DIGIT = makeSymbol("CYC-ZIP-CODE-FIVE-DIGIT");
  public static final SubLList $list129 = list(makeString("-"));
  public static final SubLSymbol $sym130$CYC_ZIP_CODE_NINE_DIGIT = makeSymbol("CYC-ZIP-CODE-NINE-DIGIT");
  public static final SubLSymbol $sym131$CYC_GUID_STRING_P = makeSymbol("CYC-GUID-STRING-P");
  public static final SubLSymbol $sym132$CYC_UNICODE_DENOTING_ASCII_STRING_P = makeSymbol("CYC-UNICODE-DENOTING-ASCII-STRING-P");
  public static final SubLSymbol $sym133$CYC_ASCII_STRING_P = makeSymbol("CYC-ASCII-STRING-P");
  public static final SubLSymbol $sym134$CYC_URL = makeSymbol("CYC-URL");
  public static final SubLSymbol $sym135$DOCTOR_ME_ID_ = makeSymbol("DOCTOR-ME-ID?");
  public static final SubLSymbol $sym136$CLPE_ = makeSymbol("CLPE?");
  public static final SubLSymbol $sym137$CYC_QUERY_ = makeSymbol("CYC-QUERY?");
  public static final SubLSymbol $sym138$CYC_SYNTACTIC_FORMULA_ARITY_OK = makeSymbol("CYC-SYNTACTIC-FORMULA-ARITY-OK");
  public static final SubLSymbol $sym139$CYC_SYNTACTIC_FORMULA = makeSymbol("CYC-SYNTACTIC-FORMULA");
  public static final SubLSymbol $sym140$FUNCTION_EXPRESSION_ = makeSymbol("FUNCTION-EXPRESSION?");
  public static final SubLSymbol $sym141$CYC_RELATION_EXPRESSION_ = makeSymbol("CYC-RELATION-EXPRESSION?");
  public static final SubLSymbol $sym142$EL_VARIABLE_ = makeSymbol("EL-VARIABLE?");
  public static final SubLSymbol $sym143$CYC_SUBL_EXPRESSION = makeSymbol("CYC-SUBL-EXPRESSION");
  public static final SubLSymbol $sym144$CYC_SUBL_ESCAPE = makeSymbol("CYC-SUBL-ESCAPE");
  public static final SubLSymbol $sym145$CYC_SUBL_TEMPLATE = makeSymbol("CYC-SUBL-TEMPLATE");
  public static final SubLSymbol $sym146$IBQE_ = makeSymbol("IBQE?");
  public static final SubLSymbol $sym147$SCALAR_POINT_VALUE_ = makeSymbol("SCALAR-POINT-VALUE?");
  public static final SubLSymbol $sym148$NON_NEGATIVE_SCALAR_INTERVAL_ = makeSymbol("NON-NEGATIVE-SCALAR-INTERVAL?");
  public static final SubLSymbol $sym149$POSITIVE_SCALAR_INTERVAL_ = makeSymbol("POSITIVE-SCALAR-INTERVAL?");
  public static final SubLObject $const150$UnitOfMeasure = constant_handles.reader_make_constant_shell(makeString("UnitOfMeasure"));
  public static final SubLSymbol $sym151$TERM_SET_ = makeSymbol("TERM-SET?");
  public static final SubLSymbol $sym152$CYCL_VAR_LIST_ = makeSymbol("CYCL-VAR-LIST?");
  public static final SubLSymbol $sym153$CYC_EL_VAR_LIST_ = makeSymbol("CYC-EL-VAR-LIST?");
  public static final SubLSymbol $sym154$CYC_SYSTEM_ATOM = makeSymbol("CYC-SYSTEM-ATOM");
  public static final SubLSymbol $kw155$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym156$CYC_LIST_OF_LISTS = makeSymbol("CYC-LIST-OF-LISTS");
  public static final SubLSymbol $sym157$CYC_STRING_IS_LENGTH = makeSymbol("CYC-STRING-IS-LENGTH");
  public static final SubLObject $const158$instanceListLength = constant_handles.reader_make_constant_shell(makeString("instanceListLength"));
  public static final SubLSymbol $sym159$CYC_STRING_IS_MINIMUM_LENGTH = makeSymbol("CYC-STRING-IS-MINIMUM-LENGTH");
  public static final SubLObject $const160$instanceListMinLength = constant_handles.reader_make_constant_shell(makeString("instanceListMinLength"));
  public static final SubLSymbol $sym161$CYC_STRING_IS_MAXIMUM_LENGTH = makeSymbol("CYC-STRING-IS-MAXIMUM-LENGTH");
  public static final SubLObject $const162$instanceListMaxLength = constant_handles.reader_make_constant_shell(makeString("instanceListMaxLength"));
  public static final SubLSymbol $sym163$CYC_LIST_IS_LENGTH = makeSymbol("CYC-LIST-IS-LENGTH");
  public static final SubLSymbol $sym164$CYC_SUBL_QUERY_PROPERTY_P = makeSymbol("CYC-SUBL-QUERY-PROPERTY-P");
  public static final SubLSymbol $sym165$CYC_SUBL_TV_P = makeSymbol("CYC-SUBL-TV-P");
  public static final SubLSymbol $sym166$CYC_SUBL_HL_SUPPORT_MODULE_P = makeSymbol("CYC-SUBL-HL-SUPPORT-MODULE-P");
  public static final SubLSymbol $sym167$CYC_SUBL_ASSERTED_ARGUMENT_TOKEN_P = makeSymbol("CYC-SUBL-ASSERTED-ARGUMENT-TOKEN-P");
  public static final SubLSymbol $sym168$CYC_SUBL_KCT_METRIC_IDENTIFIER_P = makeSymbol("CYC-SUBL-KCT-METRIC-IDENTIFIER-P");
  public static final SubLInteger $int169$63 = makeInteger(63);
  public static final SubLSymbol $sym170$CYC_8_BYTE_INTEGER = makeSymbol("CYC-8-BYTE-INTEGER");
  public static final SubLInteger $int171$31 = makeInteger(31);
  public static final SubLSymbol $sym172$CYC_4_BYTE_INTEGER = makeSymbol("CYC-4-BYTE-INTEGER");
  public static final SubLSymbol $sym173$CYC_2_BYTE_INTEGER = makeSymbol("CYC-2-BYTE-INTEGER");
  public static final SubLSymbol $sym174$CYC_1_BYTE_INTEGER = makeSymbol("CYC-1-BYTE-INTEGER");
  public static final SubLObject $const175$BitData = constant_handles.reader_make_constant_shell(makeString("BitData"));
  public static final SubLSymbol $sym176$CYC_BIT_DATATYPE = makeSymbol("CYC-BIT-DATATYPE");
  public static final SubLSymbol $sym177$CYC_BIT_STRING = makeSymbol("CYC-BIT-STRING");
  public static final SubLList $list178 = list(Characters.CHAR_period);
  public static final SubLInteger $int179$256 = makeInteger(256);
  public static final SubLSymbol $sym180$CYC_IP4_ADDRESS = makeSymbol("CYC-IP4-ADDRESS");
  public static final SubLList $list181 = list(Characters.CHAR_slash);
  public static final SubLInteger $int182$33 = makeInteger(33);
  public static final SubLSymbol $sym183$CYC_IP4_NETWORK_ADDRESS = makeSymbol("CYC-IP4-NETWORK-ADDRESS");
  public static final SubLSymbol $sym184$CYC_LIST_IS_MINIMUM_LENGTH = makeSymbol("CYC-LIST-IS-MINIMUM-LENGTH");
  public static final SubLSymbol $sym185$CYC_LIST_IS_MAXIMUM_LENGTH = makeSymbol("CYC-LIST-IS-MAXIMUM-LENGTH");

  //// Initializers

  public void declareFunctions() {
    declare_collection_defns_file();
  }

  public void initializeVariables() {
    init_collection_defns_file();
  }

  public void runTopLevelForms() {
    setup_collection_defns_file();
  }

}
