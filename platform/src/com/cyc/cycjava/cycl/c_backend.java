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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.c_name_translation;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.file_translation;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.system_translation;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.xref_database;

public  final class c_backend extends SubLTranslatedFile {

  //// Constructor

  private c_backend() {}
  public static final SubLFile me = new c_backend();
  public static final String myName = "com.cyc.cycjava.cycl.c_backend";

  //// Definitions

  @SubL(source = "cycl/c-backend.lisp", position = 2901) 
  public static SubLSymbol $anonymous_variable_counter$ = null;

  /** When non-nil, we output a global definition statement just as a comment. */
  @SubL(source = "cycl/c-backend.lisp", position = 10118) 
  private static SubLSymbol $c_backend_write_global_definition_as_comment$ = null;

  @SubL(source = "cycl/c-backend.lisp", position = 18176) 
  public static final SubLObject c_backed_convert_identifier_name(SubLObject name) {
    checkType(name, $sym1$STRINGP);
    {
      SubLObject length = Sequences.length(name);
      SubLObject start = ((length.isPositive()
           && (NIL != Characters.charE(Strings.sublisp_char(name, ZERO_INTEGER), Characters.CHAR_asterisk))) ? ((SubLObject) ONE_INTEGER) : ZERO_INTEGER);
      SubLObject end = ((length.numG(ONE_INTEGER)
           && start.numE(ONE_INTEGER)
           && (NIL != Characters.charE(Strings.sublisp_char(name, number_utilities.f_1_(length)), Characters.CHAR_asterisk))) ? ((SubLObject) number_utilities.f_1_(length)) : length);
      SubLObject name_basis = string_utilities.substring(name, start, end);
      SubLObject string_var = name_basis;
      SubLObject end_var = Sequences.length(string_var);
      SubLObject end_var_10 = end_var;
      SubLObject index = NIL;
      for (index = ZERO_INTEGER; (!(index.numGE(end_var_10))); index = number_utilities.f_1X(index)) {
        {
          SubLObject v_char = Strings.sublisp_char(string_var, index);
          Strings.set_char(name_basis, index, c_backend_convert_char(Characters.char_downcase(v_char)));
        }
      }
      return name_basis;
    }
  }

  @SubL(source = "cycl/c-backend.lisp", position = 18701) 
  private static SubLSymbol $c_backend_convert_char_map$ = null;

  @SubL(source = "cycl/c-backend.lisp", position = 18920) 
  public static final SubLObject c_backend_convert_char(SubLObject v_char) {
    if (((NIL != Characters.alphanumericp(v_char))
        || (NIL != Characters.charE(v_char, Characters.CHAR_underbar)))) {
      return v_char;
    } else {
      return list_utilities.alist_lookup_without_values($c_backend_convert_char_map$.getGlobalValue(), v_char, Symbols.symbol_function(EQL), Characters.CHAR_X);
    }
  }

  @SubL(source = "cycl/c-backend.lisp", position = 23502) 
  private static SubLSymbol $c_backend_writers$ = null;

  /** When non-NIL, all local variables are declared volatile. */
  @SubL(source = "cycl/c-backend.lisp", position = 34133) 
  private static SubLSymbol $c_backend_volatilize_localsP$ = null;

  public static final SubLObject declare_c_backend_file() {
    //declareFunction(myName, "c_backend_output_file_and_header_file", "C-BACKEND-OUTPUT-FILE-AND-HEADER-FILE", 2, 0, false);
    //declareFunction(myName, "c_backend_output_file", "C-BACKEND-OUTPUT-FILE", 2, 0, false);
    //declareFunction(myName, "c_backend_output_header_file", "C-BACKEND-OUTPUT-HEADER-FILE", 2, 0, false);
    //declareFunction(myName, "c_backend_associated_header_file", "C-BACKEND-ASSOCIATED-HEADER-FILE", 1, 0, false);
    //declareFunction(myName, "c_backend_output_to_stream", "C-BACKEND-OUTPUT-TO-STREAM", 1, 2, false);
    //declareFunction(myName, "c_backend_output_definition_headers_to_stream", "C-BACKEND-OUTPUT-DEFINITION-HEADERS-TO-STREAM", 1, 2, false);
    //declareFunction(myName, "c_backend_output_global_headers", "C-BACKEND-OUTPUT-GLOBAL-HEADERS", 2, 0, false);
    //declareFunction(myName, "c_backend_output_function_headers", "C-BACKEND-OUTPUT-FUNCTION-HEADERS", 2, 0, false);
    //declareFunction(myName, "c_backend_output_header_section", "C-BACKEND-OUTPUT-HEADER-SECTION", 3, 0, false);
    //declareFunction(myName, "c_backend_write_preamble", "C-BACKEND-WRITE-PREAMBLE", 2, 1, false);
    //declareFunction(myName, "c_backend_write_makefile_preamble", "C-BACKEND-WRITE-MAKEFILE-PREAMBLE", 1, 0, false);
    //declareFunction(myName, "translation_copyright_string", "TRANSLATION-COPYRIGHT-STRING", 0, 0, false);
    //declareFunction(myName, "c_backend_output_forward_global_declarations", "C-BACKEND-OUTPUT-FORWARD-GLOBAL-DECLARATIONS", 2, 0, false);
    //declareFunction(myName, "c_backend_output_forward_function_declarations", "C-BACKEND-OUTPUT-FORWARD-FUNCTION-DECLARATIONS", 2, 0, false);
    //declareFunction(myName, "forward_global_reference_via_rtlP", "FORWARD-GLOBAL-REFERENCE-VIA-RTL?", 1, 0, false);
    //declareFunction(myName, "forward_function_reference_via_rtlP", "FORWARD-FUNCTION-REFERENCE-VIA-RTL?", 1, 0, false);
    //declareFunction(myName, "ts_file_all_forward_referenced_globals", "TS-FILE-ALL-FORWARD-REFERENCED-GLOBALS", 1, 0, false);
    //declareFunction(myName, "ts_file_all_forward_referenced_functions", "TS-FILE-ALL-FORWARD-REFERENCED-FUNCTIONS", 1, 0, false);
    //declareFunction(myName, "c_backend_output_forward_global_declaration", "C-BACKEND-OUTPUT-FORWARD-GLOBAL-DECLARATION", 2, 0, false);
    //declareFunction(myName, "c_backend_output_forward_function_declaration", "C-BACKEND-OUTPUT-FORWARD-FUNCTION-DECLARATION", 2, 0, false);
    //declareFunction(myName, "c_backend_output_internal_constant_array_definition", "C-BACKEND-OUTPUT-INTERNAL-CONSTANT-ARRAY-DEFINITION", 2, 0, false);
    //declareFunction(myName, "c_backend_output_private_global_definitions", "C-BACKEND-OUTPUT-PRIVATE-GLOBAL-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "c_backend_output_private_function_definitions", "C-BACKEND-OUTPUT-PRIVATE-FUNCTION-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "c_backend_output_definitions", "C-BACKEND-OUTPUT-DEFINITIONS", 2, 0, false);
    //declareFunction(myName, "c_backend_write_statement", "C-BACKEND-WRITE-STATEMENT", 2, 1, false);
    //declareFunction(myName, "c_backend_write_form", "C-BACKEND-WRITE-FORM", 2, 1, false);
    //declareFunction(myName, "c_backend_test_translate_write_form", "C-BACKEND-TEST-TRANSLATE-WRITE-FORM", 2, 1, false);
    //declareFunction(myName, "c_backend_indent", "C-BACKEND-INDENT", 2, 0, false);
    //declareFunction(myName, "c_backend_print_atom", "C-BACKEND-PRINT-ATOM", 3, 0, false);
    //declareFunction(myName, "c_backend_native_constant_p", "C-BACKEND-NATIVE-CONSTANT-P", 1, 0, false);
    //declareFunction(myName, "c_backend_write_native_constant", "C-BACKEND-WRITE-NATIVE-CONSTANT", 2, 0, false);
    //declareFunction(myName, "c_backend_write_native_string_constant", "C-BACKEND-WRITE-NATIVE-STRING-CONSTANT", 2, 0, false);
    //declareFunction(myName, "c_backend_write_Xpc", "C-BACKEND-WRITE-%PC", 2, 1, false);
    //declareFunction(myName, "c_backend_print_variable", "C-BACKEND-PRINT-VARIABLE", 2, 0, false);
    //declareFunction(myName, "c_backend_variable_binding_type", "C-BACKEND-VARIABLE-BINDING-TYPE", 1, 0, false);
    //declareFunction(myName, "c_backend_write_global_variable_name", "C-BACKEND-WRITE-GLOBAL-VARIABLE-NAME", 2, 0, false);
    //declareFunction(myName, "c_backend_write_local_variable_name", "C-BACKEND-WRITE-LOCAL-VARIABLE-NAME", 2, 0, false);
    //declareFunction(myName, "c_backend_secure_global_id", "C-BACKEND-SECURE-GLOBAL-ID", 1, 0, false);
    //declareFunction(myName, "c_backend_secure_local_id_internal", "C-BACKEND-SECURE-LOCAL-ID-INTERNAL", 1, 0, false);
    //declareFunction(myName, "c_backend_secure_local_id", "C-BACKEND-SECURE-LOCAL-ID", 1, 0, false);
    //declareFunction(myName, "c_backend_local_variable_name_internal", "C-BACKEND-LOCAL-VARIABLE-NAME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "c_backend_local_variable_name", "C-BACKEND-LOCAL-VARIABLE-NAME", 1, 0, false);
    //declareFunction(myName, "c_backend_global_variable_name", "C-BACKEND-GLOBAL-VARIABLE-NAME", 1, 0, false);
    //declareFunction(myName, "c_backend_compute_global_variable_name_internal", "C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "c_backend_compute_global_variable_name", "C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME", 1, 0, false);
    //declareFunction(myName, "c_backend_symbol_name_basis", "C-BACKEND-SYMBOL-NAME-BASIS", 1, 0, false);
    declareFunction(myName, "c_backed_convert_identifier_name", "C-BACKED-CONVERT-IDENTIFIER-NAME", 1, 0, false);
    declareFunction(myName, "c_backend_convert_char", "C-BACKEND-CONVERT-CHAR", 1, 0, false);
    //declareFunction(myName, "c_backend_write_function_call", "C-BACKEND-WRITE-FUNCTION-CALL", 3, 0, false);
    //declareFunction(myName, "c_backend_function_name", "C-BACKEND-FUNCTION-NAME", 1, 0, false);
    //declareFunction(myName, "c_backend_computed_function_name_internal", "C-BACKEND-COMPUTED-FUNCTION-NAME-INTERNAL", 1, 0, false);
    //declareFunction(myName, "c_backend_computed_function_name", "C-BACKEND-COMPUTED-FUNCTION-NAME", 1, 0, false);
    //declareFunction(myName, "c_backend_function_signature_info", "C-BACKEND-FUNCTION-SIGNATURE-INFO", 1, 0, false);
    //declareFunction(myName, "c_backend_function_arglist", "C-BACKEND-FUNCTION-ARGLIST", 1, 0, false);
    //declareFunction(myName, "c_backend_write_function_call_argument_separator", "C-BACKEND-WRITE-FUNCTION-CALL-ARGUMENT-SEPARATOR", 1, 0, false);
    //declareFunction(myName, "c_backend_write_function_call_unprovided_argument", "C-BACKEND-WRITE-FUNCTION-CALL-UNPROVIDED-ARGUMENT", 1, 0, false);
    //declareFunction(myName, "c_backend_write_call_arity", "C-BACKEND-WRITE-CALL-ARITY", 2, 0, false);
    //declareFunction(myName, "c_backend_writer", "C-BACKEND-WRITER", 1, 0, false);
    //declareFunction(myName, "c_backend_write_via_writer", "C-BACKEND-WRITE-VIA-WRITER", 4, 0, false);
    //declareFunction(myName, "c_backend_write_Xb_check_type", "C-BACKEND-WRITE-%B-CHECK-TYPE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_check_type", "C-BACKEND-WRITE-CHECK-TYPE", 5, 0, false);
    //declareFunction(myName, "c_backend_write_Xdp_check_type", "C-BACKEND-WRITE-%DP-CHECK-TYPE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xdp_enforce_type", "C-BACKEND-WRITE-%DP-ENFORCE-TYPE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xccatch", "C-BACKEND-WRITE-%CCATCH", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xcdo_symbols", "C-BACKEND-WRITE-%CDO-SYMBOLS", 3, 0, false);
    //declareFunction(myName, "c_backend_write_clet_bind", "C-BACKEND-WRITE-CLET-BIND", 3, 0, false);
    //declareFunction(myName, "c_backend_write_clet_local", "C-BACKEND-WRITE-CLET-LOCAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_code_comment", "C-BACKEND-WRITE-CODE-COMMENT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xcprogv", "C-BACKEND-WRITE-%CPROGV", 3, 0, false);
    //declareFunction(myName, "c_backend_write_csetq", "C-BACKEND-WRITE-CSETQ", 3, 0, false);
    //declareFunction(myName, "c_backend_write_csetq_dynamic", "C-BACKEND-WRITE-CSETQ-DYNAMIC", 3, 0, false);
    //declareFunction(myName, "c_backend_write_csetq_lexical", "C-BACKEND-WRITE-CSETQ-LEXICAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_csetq_local", "C-BACKEND-WRITE-CSETQ-LOCAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_assignment_operator", "C-BACKEND-WRITE-ASSIGNMENT-OPERATOR", 1, 0, false);
    //declareFunction(myName, "c_backend_write_Xcunwind_protect", "C-BACKEND-WRITE-%CUNWIND-PROTECT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_cvs_id", "C-BACKEND-WRITE-CVS-ID", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defconstant", "C-BACKEND-WRITE-DEFCONSTANT", 2, 1, false);
    //declareFunction(myName, "c_backend_write_global", "C-BACKEND-WRITE-GLOBAL", 3, 0, false);
    //declareFunction(myName, "c_backend_volatilize_localsP", "C-BACKEND-VOLATILIZE-LOCALS?", 0, 0, false);
    //declareFunction(myName, "c_backend_write_define", "C-BACKEND-WRITE-DEFINE", 3, 0, false);
    //declareFunction(myName, "c_backend_compute_function_body_statement", "C-BACKEND-COMPUTE-FUNCTION-BODY-STATEMENT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_definer_comment", "C-BACKEND-WRITE-DEFINER-COMMENT", 2, 0, false);
    //declareFunction(myName, "c_backend_write_method_source_definition_comment", "C-BACKEND-WRITE-METHOD-SOURCE-DEFINITION-COMMENT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_global_source_definition_comment", "C-BACKEND-WRITE-GLOBAL-SOURCE-DEFINITION-COMMENT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_function_declaration", "C-BACKEND-WRITE-FUNCTION-DECLARATION", 2, 2, false);
    //declareFunction(myName, "c_backend_write_function_name", "C-BACKEND-WRITE-FUNCTION-NAME", 2, 0, false);
    //declareFunction(myName, "c_backend_secure_method_id", "C-BACKEND-SECURE-METHOD-ID", 1, 0, false);
    //declareFunction(myName, "c_backend_optional_argument_initializations", "C-BACKEND-OPTIONAL-ARGUMENT-INITIALIZATIONS", 1, 0, false);
    //declareFunction(myName, "c_backend_write_object_data_type", "C-BACKEND-WRITE-OBJECT-DATA-TYPE", 1, 0, false);
    //declareFunction(myName, "c_backend_write_function_arglist", "C-BACKEND-WRITE-FUNCTION-ARGLIST", 3, 0, false);
    //declareFunction(myName, "c_backend_write_function_argument_separator", "C-BACKEND-WRITE-FUNCTION-ARGUMENT-SEPARATOR", 1, 0, false);
    //declareFunction(myName, "c_backend_write_function_arglist_arg", "C-BACKEND-WRITE-FUNCTION-ARGLIST-ARG", 2, 0, false);
    //declareFunction(myName, "translator_arglist_arg_variable", "TRANSLATOR-ARGLIST-ARG-VARIABLE", 1, 0, false);
    //declareFunction(myName, "c_backend_volatilize_defineP", "C-BACKEND-VOLATILIZE-DEFINE?", 1, 0, false);
    //declareFunction(myName, "c_backend_method_returns_within_binding_constructP", "C-BACKEND-METHOD-RETURNS-WITHIN-BINDING-CONSTRUCT?", 1, 0, false);
    //declareFunction(myName, "c_backend_transform_returns_to_throws", "C-BACKEND-TRANSFORM-RETURNS-TO-THROWS", 1, 0, false);
    //declareFunction(myName, "translator_ret_form_p", "TRANSLATOR-RET-FORM-P", 1, 0, false);
    //declareFunction(myName, "translator_ret_to_throw", "TRANSLATOR-RET-TO-THROW", 1, 0, false);
    //declareFunction(myName, "c_backend_write_define_macroexpander", "C-BACKEND-WRITE-DEFINE-MACROEXPANDER", 3, 0, false);
    //declareFunction(myName, "c_backend_write_deflexical", "C-BACKEND-WRITE-DEFLEXICAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defparameter", "C-BACKEND-WRITE-DEFPARAMETER", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xdefstruct_class", "C-BACKEND-WRITE-%DEFSTRUCT-CLASS", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defstruct_construct", "C-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defstruct_get_slot", "C-BACKEND-WRITE-DEFSTRUCT-GET-SLOT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defstruct_object_p", "C-BACKEND-WRITE-DEFSTRUCT-OBJECT-P", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defstruct_set_slot", "C-BACKEND-WRITE-DEFSTRUCT-SET-SLOT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_defvar", "C-BACKEND-WRITE-DEFVAR", 3, 0, false);
    //declareFunction(myName, "c_backend_write_fif", "C-BACKEND-WRITE-FIF", 3, 0, false);
    //declareFunction(myName, "c_backend_write_pcond", "C-BACKEND-WRITE-PCOND", 3, 0, false);
    //declareFunction(myName, "c_backend_write_progn", "C-BACKEND-WRITE-PROGN", 3, 0, false);
    //declareFunction(myName, "c_backend_write_ret", "C-BACKEND-WRITE-RET", 3, 0, false);
    //declareFunction(myName, "c_backend_write_while", "C-BACKEND-WRITE-WHILE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xand", "C-BACKEND-WRITE-%AND", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xcdohash", "C-BACKEND-WRITE-%CDOHASH", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xenter", "C-BACKEND-WRITE-%ENTER", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xfor", "C-BACKEND-WRITE-%FOR", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xic", "C-BACKEND-WRITE-%IC", 3, 0, false);
    //declareFunction(myName, "c_backend_write_internal_constant_reference", "C-BACKEND-WRITE-INTERNAL-CONSTANT-REFERENCE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xinternal_constant", "C-BACKEND-WRITE-%INTERNAL-CONSTANT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xlf", "C-BACKEND-WRITE-%LF", 3, 0, false);
    //declareFunction(myName, "c_backend_fixnum_p", "C-BACKEND-FIXNUM-P", 1, 0, false);
    //declareFunction(myName, "c_backend_write_Xlocal", "C-BACKEND-WRITE-%LOCAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_multiple_value_list", "C-BACKEND-WRITE-MULTIPLE-VALUE-LIST", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xnc", "C-BACKEND-WRITE-%NC", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xnot", "C-BACKEND-WRITE-%NOT", 3, 0, false);
    //declareFunction(myName, "c_backend_write_nth_value", "C-BACKEND-WRITE-NTH-VALUE", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xor", "C-BACKEND-WRITE-%OR", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xregister_function", "C-BACKEND-WRITE-%REGISTER-FUNCTION", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xregister_global", "C-BACKEND-WRITE-%REGISTER-GLOBAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xregister_macro", "C-BACKEND-WRITE-%REGISTER-MACRO", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xwith_current_thread", "C-BACKEND-WRITE-%WITH-CURRENT-THREAD", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xwith_error_handler", "C-BACKEND-WRITE-%WITH-ERROR-HANDLER", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xwith_process_resource_tracking", "C-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xthread_mval", "C-BACKEND-WRITE-%THREAD-MVAL", 3, 0, false);
    //declareFunction(myName, "c_backend_write_Xthread_reset_mval", "C-BACKEND-WRITE-%THREAD-RESET-MVAL", 3, 0, false);
    //declareFunction(myName, "c_backend_optimize_function_call_form", "C-BACKEND-OPTIMIZE-FUNCTION-CALL-FORM", 1, 0, false);
    //declareFunction(myName, "c_backend_output_system_level_files", "C-BACKEND-OUTPUT-SYSTEM-LEVEL-FILES", 6, 0, false);
    //declareFunction(myName, "c_backend_file_name_from_string", "C-BACKEND-FILE-NAME-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "c_backend_output_module_filename", "C-BACKEND-OUTPUT-MODULE-FILENAME", 1, 1, false);
    //declareFunction(myName, "c_backend_module_name_from_string", "C-BACKEND-MODULE-NAME-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "c_backend_method_name_from_string", "C-BACKEND-METHOD-NAME-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "c_backend_ifdef_name_from_string", "C-BACKEND-IFDEF-NAME-FROM-STRING", 1, 0, false);
    //declareFunction(myName, "c_backend_output_system_init_file", "C-BACKEND-OUTPUT-SYSTEM-INIT-FILE", 4, 0, false);
    //declareFunction(myName, "c_backend_output_system_header_file", "C-BACKEND-OUTPUT-SYSTEM-HEADER-FILE", 4, 0, false);
    //declareFunction(myName, "c_backend_relative_directory", "C-BACKEND-RELATIVE-DIRECTORY", 1, 0, false);
    //declareFunction(myName, "c_backend_output_system_filelist_file", "C-BACKEND-OUTPUT-SYSTEM-FILELIST-FILE", 4, 0, false);
    //declareFunction(myName, "c_backend_output_system_directory_make_file_info", "C-BACKEND-OUTPUT-SYSTEM-DIRECTORY-MAKE-FILE-INFO", 5, 0, false);
    //declareFunction(myName, "c_backend_output_system_build_index_file", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INDEX-FILE", 3, 0, false);
    //declareFunction(myName, "c_backend_output_system_build_index_libraries", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INDEX-LIBRARIES", 6, 0, false);
    //declareFunction(myName, "c_backend_output_system_build_instructions_file", "C-BACKEND-OUTPUT-SYSTEM-BUILD-INSTRUCTIONS-FILE", 3, 0, false);
    //declareFunction(myName, "c_backend_system_build_instructions_path_spec", "C-BACKEND-SYSTEM-BUILD-INSTRUCTIONS-PATH-SPEC", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_c_backend_file() {
    $anonymous_variable_counter$ = defparameter("*ANONYMOUS-VARIABLE-COUNTER*", NIL);
    $c_backend_write_global_definition_as_comment$ = defparameter("*C-BACKEND-WRITE-GLOBAL-DEFINITION-AS-COMMENT*", NIL);
    $c_backend_convert_char_map$ = deflexical("*C-BACKEND-CONVERT-CHAR-MAP*", $list61);
    $c_backend_writers$ = deflexical("*C-BACKEND-WRITERS*", $list83);
    $c_backend_volatilize_localsP$ = defparameter("*C-BACKEND-VOLATILIZE-LOCALS?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_c_backend_file() {
    // CVS_ID("Id: c-backend.lisp 128371 2009-07-22 15:40:43Z goolsbey ");
    memoization_state.note_memoized_function($sym54$C_BACKEND_SECURE_LOCAL_ID);
    memoization_state.note_memoized_function($sym56$C_BACKEND_LOCAL_VARIABLE_NAME);
    memoization_state.note_memoized_function($sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME);
    memoization_state.note_memoized_function($sym71$C_BACKEND_COMPUTED_FUNCTION_NAME);
    utilities_macros.note_funcall_helper_function($sym157$TRANSLATOR_RET_FORM_P);
    utilities_macros.note_funcall_helper_function($sym158$TRANSLATOR_RET_TO_THROW);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TRANS_SUBL_FILE_P = makeSymbol("TRANS-SUBL-FILE-P");
  public static final SubLSymbol $sym1$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw2$OUTPUT = makeKeyword("OUTPUT");
  public static final SubLString $str3$Unable_to_open__S = makeString("Unable to open ~S");
  public static final SubLString $str4$_dev_null = makeString("/dev/null");
  public static final SubLString $str5$_c = makeString(".c");
  public static final SubLString $str6$_h = makeString(".h");
  public static final SubLString $str7$_C = makeString(".C");
  public static final SubLString $str8$_H = makeString(".H");
  public static final SubLString $str9$unexpected_C_filename__S = makeString("unexpected C filename ~S");
  public static final SubLSymbol $sym10$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLString $str11$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLString $str12$_include__rtl_h_ = makeString("#include \"rtl.h\"");
  public static final SubLString $str13$CYCL = makeString("CYCL");
  public static final SubLString $str14$_____ifdef__A_PROFILING = makeString("~%~%#ifdef ~A_PROFILING");
  public static final SubLString $str15$___define__A_PROFILING = makeString("~%#define ~A_PROFILING");
  public static final SubLString $str16$___endif = makeString("~%#endif");
  public static final SubLString $str17$___define_PROFILING = makeString("~%#define PROFILING");
  public static final SubLString $str18$_____include__code_flow_hooks_h_ = makeString("~%~%#include \"code-flow-hooks.h\"");
  public static final SubLString $str19$____ = makeString("/*~%");
  public static final SubLString $str20$____A__ = makeString("   ~A~%");
  public static final SubLString $str21$SUBLISP = makeString("SUBLISP");
  public static final SubLList $list22 = list(makeKeyword("NONE"), makeKeyword("MEDIUM"));
  public static final SubLString $str23$___file__________a___ = makeString("   file:        ~a ~%");
  public static final SubLString $str24$___created_______4__0D__2__0D__2_ = makeString("   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");
  public static final SubLString $str25$___source_file___a___ = makeString("   source file: ~a ~%");
  public static final SubLString $str26$___ = makeString(" */");
  public static final SubLString $str27$____A__ = makeString("#  ~A~%");
  public static final SubLString $str28$____created_______4__0D__2__0D__2 = makeString("#   created:     ~4,'0D/~2,'0D/~2,'0D ~2,'0D:~2,'0D:~2,'0D~%");
  public static final SubLString $str29$Copyright__c__1995___2009_Cycorp_ = makeString("Copyright (c) 1995 - 2009 Cycorp, Inc.  All rights reserved.");
  public static final SubLString $str30$_______referenced_globals___ = makeString("~%~%/* referenced globals */");
  public static final SubLString $str31$_______referenced_functions___ = makeString("~%~%/* referenced functions */");
  public static final SubLString $str32$extern_ = makeString("extern ");
  public static final SubLString $str33$_ = makeString(" ");
  public static final SubLString $str34$_ = makeString(";");
  public static final SubLString $str35$static_ = makeString("static ");
  public static final SubLSymbol $kw36$UNPROVIDED = makeKeyword("UNPROVIDED");
  public static final SubLString $str37$static_Dp__constants__A__ = makeString("static Dp _constants[~A];");
  public static final SubLString $str38$_____container_for_all_constant_v = makeString("  /* container for all constant values in file */");
  public static final SubLString $str39$_______private_globals___ = makeString("~%~%/* private globals */");
  public static final SubLString $str40$_______private_functions___ = makeString("~%~%/* private functions */");
  public static final SubLString $str41$__ = makeString("  ");
  public static final SubLString $str42$Unexpected_C_backend_atom____S = makeString("Unexpected C backend atom : ~S");
  public static final SubLList $list43 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT"));
  public static final SubLSymbol $sym44$_PC = makeSymbol("%PC");
  public static final SubLString $str45$Time_to_implement_a_C_backend_tra = makeString("Time to implement a C backend translation for predefined constant ~S");
  public static final SubLSymbol $kw46$DYNAMIC = makeKeyword("DYNAMIC");
  public static final SubLSymbol $kw47$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLSymbol $kw48$CONSTANT = makeKeyword("CONSTANT");
  public static final SubLSymbol $kw49$LOCAL = makeKeyword("LOCAL");
  public static final SubLString $str50$unexpected_variable_binding_type_ = makeString("unexpected variable binding type ~S for ~S");
  public static final SubLList $list51 = list(makeKeyword("LOW"), makeKeyword("HIGH"));
  public static final SubLString $str52$_gv_S_ = makeString("_gv~S_");
  public static final SubLString $str53$_v_S_ = makeString("_v~S_");
  public static final SubLSymbol $sym54$C_BACKEND_SECURE_LOCAL_ID = makeSymbol("C-BACKEND-SECURE-LOCAL-ID");
  public static final SubLSymbol $kw55$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym56$C_BACKEND_LOCAL_VARIABLE_NAME = makeSymbol("C-BACKEND-LOCAL-VARIABLE-NAME");
  public static final SubLString $str57$v_ = makeString("v_");
  public static final SubLString $str58$_ = makeString("_");
  public static final SubLSymbol $sym59$C_BACKEND_COMPUTE_GLOBAL_VARIABLE_NAME = makeSymbol("C-BACKEND-COMPUTE-GLOBAL-VARIABLE-NAME");
  public static final SubLString $str60$gv_ = makeString("gv_");
  public static final SubLList $list61 = list(cons(Characters.CHAR_question, Characters.CHAR_P), cons(Characters.CHAR_hyphen, Characters.CHAR_underbar), cons(Characters.CHAR_space, Characters.CHAR_underbar), cons(Characters.CHAR_less, Characters.CHAR_L), cons(Characters.CHAR_equal, Characters.CHAR_E), cons(Characters.CHAR_greater, Characters.CHAR_G));
  public static final SubLList $list62 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLSymbol $kw63$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str64$translating__S_call_as_funcall = makeString("translating ~S call as funcall");
  public static final SubLSymbol $sym65$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLSymbol $sym66$_LF = makeSymbol("%LF");
  public static final SubLString $str67$_S_called_with__S_missing_require = makeString("~S called with ~S missing required arguments");
  public static final SubLString $str68$_S_called_with__S_excess_argument = makeString("~S called with ~S excess arguments");
  public static final SubLString $str69$_ = makeString("(");
  public static final SubLString $str70$_ = makeString(")");
  public static final SubLSymbol $sym71$C_BACKEND_COMPUTED_FUNCTION_NAME = makeSymbol("C-BACKEND-COMPUTED-FUNCTION-NAME");
  public static final SubLString $str72$f_ = makeString("f_");
  public static final SubLSymbol $kw73$UNSPECIFIED = makeKeyword("UNSPECIFIED");
  public static final SubLString $str74$_CSETF_ = makeString("_CSETF-");
  public static final SubLList $list75 = list(makeSymbol("OBJECT"), makeSymbol("VALUE"));
  public static final SubLSymbol $kw76$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym77$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLString $str78$unable_to_introspect_on__S = makeString("unable to introspect on ~S");
  public static final SubLString $str79$Unexpected_function__S = makeString("Unexpected function ~S");
  public static final SubLString $str80$__ = makeString(", ");
  public static final SubLString $str81$DUM = makeString("DUM");
  public static final SubLSymbol $sym82$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLList $list83 = list(new SubLObject[] {cons(makeSymbol("%AND"), makeSymbol("C-BACKEND-WRITE-%AND")), cons(makeSymbol("%B-CHECK-TYPE"), makeSymbol("C-BACKEND-WRITE-%B-CHECK-TYPE")), cons(makeSymbol("%CCATCH"), makeSymbol("C-BACKEND-WRITE-%CCATCH")), cons(makeSymbol("%CDO-SYMBOLS"), makeSymbol("C-BACKEND-WRITE-%CDO-SYMBOLS")), cons(makeSymbol("%CDOHASH"), makeSymbol("C-BACKEND-WRITE-%CDOHASH")), cons(makeSymbol("CLET-BIND"), makeSymbol("C-BACKEND-WRITE-CLET-BIND")), cons(makeSymbol("CLET-LOCAL"), makeSymbol("C-BACKEND-WRITE-CLET-LOCAL")), cons(makeSymbol("CODE-COMMENT"), makeSymbol("C-BACKEND-WRITE-CODE-COMMENT")), cons(makeSymbol("%CPROGV"), makeSymbol("C-BACKEND-WRITE-%CPROGV")), cons(makeSymbol("CSETQ"), makeSymbol("C-BACKEND-WRITE-CSETQ")), cons(makeSymbol("CSETQ-DYNAMIC"), makeSymbol("C-BACKEND-WRITE-CSETQ-DYNAMIC")), cons(makeSymbol("CSETQ-LEXICAL"), makeSymbol("C-BACKEND-WRITE-CSETQ-LEXICAL")), cons(makeSymbol("CSETQ-LOCAL"), makeSymbol("C-BACKEND-WRITE-CSETQ-LOCAL")), cons(makeSymbol("%CUNWIND-PROTECT"), makeSymbol("C-BACKEND-WRITE-%CUNWIND-PROTECT")), cons(makeSymbol("CVS-ID"), makeSymbol("C-BACKEND-WRITE-CVS-ID")), cons(makeSymbol("DEFCONSTANT"), makeSymbol("C-BACKEND-WRITE-DEFCONSTANT")), cons(makeSymbol("DEFINE"), makeSymbol("C-BACKEND-WRITE-DEFINE")), cons(makeSymbol("DEFINE-MACROEXPANDER"), makeSymbol("C-BACKEND-WRITE-DEFINE-MACROEXPANDER")), cons(makeSymbol("DEFLEXICAL"), makeSymbol("C-BACKEND-WRITE-DEFLEXICAL")), cons(makeSymbol("DEFPARAMETER"), makeSymbol("C-BACKEND-WRITE-DEFPARAMETER")), cons(makeSymbol("%DEFSTRUCT-CLASS"), makeSymbol("C-BACKEND-WRITE-%DEFSTRUCT-CLASS")), cons(makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP"), makeSymbol("C-BACKEND-WRITE-DEFSTRUCT-CONSTRUCT")), cons(makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP"), makeSymbol("C-BACKEND-WRITE-DEFSTRUCT-GET-SLOT")), cons(makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP"), makeSymbol("C-BACKEND-WRITE-DEFSTRUCT-OBJECT-P")), cons(makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP"), makeSymbol("C-BACKEND-WRITE-DEFSTRUCT-SET-SLOT")), cons(makeSymbol("DEFVAR"), makeSymbol("C-BACKEND-WRITE-DEFVAR")), cons(makeSymbol("%DP-CHECK-TYPE"), makeSymbol("C-BACKEND-WRITE-%DP-CHECK-TYPE")), cons(makeSymbol("%DP-ENFORCE-TYPE"), makeSymbol("C-BACKEND-WRITE-%DP-ENFORCE-TYPE")), cons(makeSymbol("%ENTER"), makeSymbol("C-BACKEND-WRITE-%ENTER")), cons(makeSymbol("FIF"), makeSymbol("C-BACKEND-WRITE-FIF")), cons(makeSymbol("%FOR"), makeSymbol("C-BACKEND-WRITE-%FOR")), cons(makeSymbol("%IC"), makeSymbol("C-BACKEND-WRITE-%IC")), cons(makeSymbol("%INTERNAL-CONSTANT"), makeSymbol("C-BACKEND-WRITE-%INTERNAL-CONSTANT")), cons(makeSymbol("%LF"), makeSymbol("C-BACKEND-WRITE-%LF")), cons(makeSymbol("%LOCAL"), makeSymbol("C-BACKEND-WRITE-%LOCAL")), cons(makeSymbol("MULTIPLE-VALUE-LIST"), makeSymbol("C-BACKEND-WRITE-MULTIPLE-VALUE-LIST")), cons(makeSymbol("%NC"), makeSymbol("C-BACKEND-WRITE-%NC")), cons(makeSymbol("%NOT"), makeSymbol("C-BACKEND-WRITE-%NOT")), cons(makeSymbol("NTH-VALUE"), makeSymbol("C-BACKEND-WRITE-NTH-VALUE")), cons(makeSymbol("%OR"), makeSymbol("C-BACKEND-WRITE-%OR")), cons(makeSymbol("%PC"), makeSymbol("C-BACKEND-WRITE-%PC")), cons(makeSymbol("PCOND"), makeSymbol("C-BACKEND-WRITE-PCOND")), cons(makeSymbol("PROGN"), makeSymbol("C-BACKEND-WRITE-PROGN")), cons(makeSymbol("%REGISTER-FUNCTION"), makeSymbol("C-BACKEND-WRITE-%REGISTER-FUNCTION")), cons(makeSymbol("%REGISTER-GLOBAL"), makeSymbol("C-BACKEND-WRITE-%REGISTER-GLOBAL")), cons(makeSymbol("%REGISTER-MACRO"), makeSymbol("C-BACKEND-WRITE-%REGISTER-MACRO")), cons(makeSymbol("RET"), makeSymbol("C-BACKEND-WRITE-RET")), cons(makeSymbol("WHILE"), makeSymbol("C-BACKEND-WRITE-WHILE")), cons(makeSymbol("%WITH-CURRENT-THREAD"), makeSymbol("C-BACKEND-WRITE-%WITH-CURRENT-THREAD")), cons(makeSymbol("%WITH-ERROR-HANDLER"), makeSymbol("C-BACKEND-WRITE-%WITH-ERROR-HANDLER")), cons(makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING"), makeSymbol("C-BACKEND-WRITE-%WITH-PROCESS-RESOURCE-TRACKING")), cons(makeSymbol("%THREAD-MVAL"), makeSymbol("C-BACKEND-WRITE-%THREAD-MVAL")), cons(makeSymbol("%THREAD-RESET-MVAL"), makeSymbol("C-BACKEND-WRITE-%THREAD-RESET-MVAL"))});
  public static final SubLString $str84$Time_to_implement_the_writer_for_ = makeString("Time to implement the writer for ~S");
  public static final SubLList $list85 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"), makeSymbol("PRED"));
  public static final SubLSymbol $sym86$_B_CHECK_TYPE = makeSymbol("%B-CHECK-TYPE");
  public static final SubLSymbol $sym87$_DP_CHECK_TYPE = makeSymbol("%DP-CHECK-TYPE");
  public static final SubLSymbol $sym88$_DP_ENFORCE_TYPE = makeSymbol("%DP-ENFORCE-TYPE");
  public static final SubLList $list89 = list(makeSymbol("OPERATOR"), list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("ENV-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym90$_CCATCH = makeSymbol("%CCATCH");
  public static final SubLSymbol $sym91$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym92$_SET_CATCH = makeSymbol("%SET-CATCH");
  public static final SubLSymbol $sym93$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym94$_DTB = makeSymbol("%DTB");
  public static final SubLSymbol $sym95$_THROWN_TO = makeSymbol("%THROWN-TO");
  public static final SubLSymbol $sym96$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list97 = list(list(makeSymbol("%CATCH-VALUE")));
  public static final SubLList $list98 = list(makeSymbol("%NC"), makeSymbol("%TRUE"));
  public static final SubLSymbol $sym99$_FINISH_CATCH = makeSymbol("%FINISH-CATCH");
  public static final SubLList $list100 = list(makeSymbol("OPERATOR"), list(makeSymbol("SYM"), makeSymbol("PACKAGE-VAR"), makeSymbol("ITERATOR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym101$_CDO_SYMBOLS = makeSymbol("%CDO-SYMBOLS");
  public static final SubLSymbol $sym102$_CDO_SYMBOLS_SETUP = makeSymbol("%CDO-SYMBOLS-SETUP");
  public static final SubLSymbol $sym103$_CDO_SYMBOLS_LOOP = makeSymbol("%CDO-SYMBOLS-LOOP");
  public static final SubLSymbol $sym104$_CDO_SYMBOLS_END = makeSymbol("%CDO-SYMBOLS-END");
  public static final SubLList $list105 = list(makeSymbol("OPERATOR"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym106$CLET_BIND = makeSymbol("CLET-BIND");
  public static final SubLList $list107 = list(makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"));
  public static final SubLSymbol $sym108$_BIND = makeSymbol("%BIND");
  public static final SubLSymbol $sym109$_REBIND = makeSymbol("%REBIND");
  public static final SubLSymbol $sym110$CLET_LOCAL = makeSymbol("CLET-LOCAL");
  public static final SubLSymbol $sym111$_LOCAL = makeSymbol("%LOCAL");
  public static final SubLList $list112 = list(makeSymbol("OPERATOR"), makeSymbol("COMMENT-STRING"));
  public static final SubLSymbol $sym113$CODE_COMMENT = makeSymbol("CODE-COMMENT");
  public static final SubLString $str114$___ = makeString("// ");
  public static final SubLList $list115 = list(makeSymbol("OPERATOR"), list(makeSymbol("SPECIAL-VARS"), makeSymbol("BINDINGS"), makeSymbol("INTERNAL-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym116$_CPROGV = makeSymbol("%CPROGV");
  public static final SubLSymbol $sym117$_BIND_SPECIAL_VARS = makeSymbol("%BIND-SPECIAL-VARS");
  public static final SubLSymbol $sym118$_REBIND_SPECIAL_VARS = makeSymbol("%REBIND-SPECIAL-VARS");
  public static final SubLList $list119 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym120$CSETQ_LOCAL = makeSymbol("CSETQ-LOCAL");
  public static final SubLSymbol $sym121$CSETQ_DYNAMIC = makeSymbol("CSETQ-DYNAMIC");
  public static final SubLSymbol $sym122$CSETQ_LEXICAL = makeSymbol("CSETQ-LEXICAL");
  public static final SubLString $str123$The_constant_variable__S_cannot_b = makeString("The constant variable ~S cannot be set");
  public static final SubLString $str124$Unexpected_variable__S = makeString("Unexpected variable ~S");
  public static final SubLSymbol $sym125$_SET_DYN = makeSymbol("%SET-DYN");
  public static final SubLSymbol $sym126$_SET_LEX = makeSymbol("%SET-LEX");
  public static final SubLString $str127$___ = makeString(" = ");
  public static final SubLList $list128 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym129$_CUNWIND_PROTECT = makeSymbol("%CUNWIND-PROTECT");
  public static final SubLSymbol $sym130$_SET_UNWIND = makeSymbol("%SET-UNWIND");
  public static final SubLSymbol $sym131$_START_UNWIND = makeSymbol("%START-UNWIND");
  public static final SubLSymbol $sym132$_FINISH_UNWIND = makeSymbol("%FINISH-UNWIND");
  public static final SubLSymbol $kw133$HIGH = makeKeyword("HIGH");
  public static final SubLList $list134 = list(makeSymbol("OPERATOR"), makeSymbol("ID-STRING"));
  public static final SubLSymbol $sym135$CVS_ID = makeSymbol("CVS-ID");
  public static final SubLString $str136$CVS_ID_ = makeString("CVS_ID(");
  public static final SubLSymbol $sym137$DEFCONSTANT = makeSymbol("DEFCONSTANT");
  public static final SubLList $list138 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("INITIALIZATION"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));
  public static final SubLList $list139 = list(makeSymbol("OPERATOR"), makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym140$DEFINE = makeSymbol("DEFINE");
  public static final SubLString $str141$_S_was_not_a_top_level_define = makeString("~S was not a top-level define");
  public static final SubLSymbol $sym142$SKIP_FUNCTION = makeSymbol("SKIP-FUNCTION");
  public static final SubLString $str143$Skip_function__S = makeString("Skip function ~S");
  public static final SubLList $list144 = list(makeSymbol("DOCUMENTATION"), makeSymbol("&BODY"), makeSymbol("REAL-BODY"));
  public static final SubLString $str145$Method__S_returns_within_a_bindin = makeString("Method ~S returns within a binding construct");
  public static final SubLList $list146 = list(makeSymbol("%ENTER"));
  public static final SubLString $str147$___ = makeString("/* ");
  public static final SubLString $str148$_f_S_ = makeString("_f~S_");
  public static final SubLSymbol $sym149$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym150$_REST = makeSymbol("&REST");
  public static final SubLList $list151 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("PROVIDED"));
  public static final SubLSymbol $sym152$_NOTE_SUPPLIED = makeSymbol("%NOTE-SUPPLIED");
  public static final SubLSymbol $sym153$_INIT_OPT_ARG = makeSymbol("%INIT-OPT-ARG");
  public static final SubLList $list154 = list(list(makeSymbol("%PC"), NIL));
  public static final SubLString $str155$Dp = makeString("Dp");
  public static final SubLString $str156$_void_ = makeString("(void)");
  public static final SubLSymbol $sym157$TRANSLATOR_RET_FORM_P = makeSymbol("TRANSLATOR-RET-FORM-P");
  public static final SubLSymbol $sym158$TRANSLATOR_RET_TO_THROW = makeSymbol("TRANSLATOR-RET-TO-THROW");
  public static final SubLList $list159 = list(makeSymbol("QUOTE"), makeSymbol("%EXIT"));
  public static final SubLSymbol $sym160$ANSWER = makeUninternedSymbol("ANSWER");
  public static final SubLSymbol $sym161$EXIT_ENV = makeUninternedSymbol("EXIT-ENV");
  public static final SubLSymbol $sym162$RET = makeSymbol("RET");
  public static final SubLList $list163 = list(makeSymbol("OPERATOR"), makeSymbol("EXPRESSION"));
  public static final SubLSymbol $sym164$THROW = makeSymbol("THROW");
  public static final SubLSymbol $sym165$DEFINE_MACROEXPANDER = makeSymbol("DEFINE-MACROEXPANDER");
  public static final SubLSymbol $sym166$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLSymbol $sym167$DEFPARAMETER = makeSymbol("DEFPARAMETER");
  public static final SubLList $list168 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("ANALYSIS"));
  public static final SubLSymbol $sym169$_DEFSTRUCT_CLASS = makeSymbol("%DEFSTRUCT-CLASS");
  public static final SubLSymbol $kw170$NAME = makeKeyword("NAME");
  public static final SubLString $str171$___defstruct__A___ = makeString("/* defstruct ~A */");
  public static final SubLSymbol $sym172$_DEFSTRUCT_CONSTRUCT = makeSymbol("_DEFSTRUCT-CONSTRUCT", "SUBLISP");
  public static final SubLSymbol $sym173$_DEFSTRUCT_GET_SLOT = makeSymbol("_DEFSTRUCT-GET-SLOT", "SUBLISP");
  public static final SubLSymbol $sym174$_DEFSTRUCT_OBJECT_P = makeSymbol("_DEFSTRUCT-OBJECT-P", "SUBLISP");
  public static final SubLSymbol $sym175$_DEFSTRUCT_SET_SLOT = makeSymbol("_DEFSTRUCT-SET-SLOT", "SUBLISP");
  public static final SubLSymbol $sym176$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLList $list177 = list(makeSymbol("OPERATOR"), makeSymbol("CONDITION"), makeSymbol("TRUE-VALUE"), makeSymbol("FALSE-VALUE"));
  public static final SubLSymbol $sym178$FIF = makeSymbol("FIF");
  public static final SubLString $str179$___ = makeString(" ? ");
  public static final SubLString $str180$___ = makeString(" : ");
  public static final SubLList $list181 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("PCOND-CLAUSES"));
  public static final SubLList $list182 = list(makeSymbol("PROGN"));
  public static final SubLList $list183 = list(makeSymbol("FIRST-CLAUSE"), makeSymbol("&REST"), makeSymbol("REST-CLAUSES"));
  public static final SubLList $list184 = list(makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("ACTIONS"));
  public static final SubLString $str185$if__ = makeString("if (");
  public static final SubLString $str186$__ = makeString(") ");
  public static final SubLString $str187$_else_ = makeString(" else ");
  public static final SubLString $str188$_else_if__ = makeString(" else if (");
  public static final SubLList $list189 = list(makeSymbol("OPERATOR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str190$_ = makeString("{");
  public static final SubLString $str191$_ = makeString("}");
  public static final SubLList $list192 = list(makeSymbol("OPERATOR"), makeSymbol("RESULT"));
  public static final SubLString $str193$RETURN_ = makeString("RETURN(");
  public static final SubLList $list194 = list(makeSymbol("OPERATOR"), makeSymbol("TEST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym195$WHILE = makeSymbol("WHILE");
  public static final SubLString $str196$while__ = makeString("while (");
  public static final SubLList $list197 = list(makeSymbol("OPERATOR"), makeSymbol("&REST"), makeSymbol("EXPRESSIONS"));
  public static final SubLSymbol $sym198$_AND = makeSymbol("%AND");
  public static final SubLString $str199$____ = makeString(" && ");
  public static final SubLList $list200 = list(makeSymbol("OPERATOR"), list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE-VAR"), makeSymbol("ITERATOR-VAR"), makeSymbol("ENTRY-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym201$_CDOHASH = makeSymbol("%CDOHASH");
  public static final SubLSymbol $sym202$_FOR = makeSymbol("%FOR");
  public static final SubLSymbol $sym203$_NEXT_HASH_INDEX = makeSymbol("%NEXT-HASH-INDEX", "SUBLISP");
  public static final SubLSymbol $sym204$_HASH_INDEX_KEY = makeSymbol("%HASH-INDEX-KEY", "SUBLISP");
  public static final SubLSymbol $sym205$_HASH_INDEX_OBJ = makeSymbol("%HASH-INDEX-OBJ", "SUBLISP");
  public static final SubLList $list206 = list(makeSymbol("OPERATOR"));
  public static final SubLSymbol $sym207$_ENTER = makeSymbol("%ENTER");
  public static final SubLString $str208$ENTER__ = makeString("ENTER()");
  public static final SubLList $list209 = list(makeSymbol("OPERATOR"), list(makeSymbol("INITIALIZATIONS"), makeSymbol("TEST"), makeSymbol("UPDATES")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str210$for__ = makeString("for (");
  public static final SubLList $list211 = cons(makeSymbol("FIRST-INITIALIZATION"), makeSymbol("REST-INITIALIATIONS"));
  public static final SubLString $str212$__ = makeString("; ");
  public static final SubLList $list213 = cons(makeSymbol("FIRST-UPDATE"), makeSymbol("REST-UPDATES"));
  public static final SubLList $list214 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"));
  public static final SubLSymbol $sym215$_IC = makeSymbol("%IC");
  public static final SubLString $str216$_constants_ = makeString("_constants[");
  public static final SubLString $str217$_ = makeString("]");
  public static final SubLList $list218 = list(makeSymbol("OPERATOR"), makeSymbol("CONSTANT-ID"), makeSymbol("CONSTANT-FORM"), makeSymbol("LOAD-FORM"));
  public static final SubLSymbol $sym219$_INTERNAL_CONSTANT = makeSymbol("%INTERNAL-CONSTANT");
  public static final SubLString $str220$INITIALIZE_CONSTANT_ = makeString("INITIALIZE_CONSTANT(");
  public static final SubLList $list221 = list(makeSymbol("OPERATOR"), makeSymbol("OBJECT"));
  public static final SubLSymbol $sym222$_CSTRING = makeSymbol("%CSTRING");
  public static final SubLSymbol $sym223$_CKEYWORD = makeSymbol("%CKEYWORD");
  public static final SubLSymbol $sym224$_CINTERN = makeSymbol("%CINTERN");
  public static final SubLSymbol $sym225$_CMAKE_SYMBOL = makeSymbol("%CMAKE-SYMBOL");
  public static final SubLSymbol $sym226$_CSYMBOL = makeSymbol("%CSYMBOL");
  public static final SubLSymbol $sym227$_CFIX = makeSymbol("%CFIX");
  public static final SubLSymbol $sym228$_CBIG = makeSymbol("%CBIG");
  public static final SubLSymbol $sym229$_CFLOAT = makeSymbol("%CFLOAT");
  public static final SubLSymbol $sym230$_CCHAR = makeSymbol("%CCHAR");
  public static final SubLSymbol $sym231$_CPACKAGE = makeSymbol("%CPACKAGE");
  public static final SubLSymbol $sym232$_CGUID = makeSymbol("%CGUID");
  public static final SubLString $str233$Time_to_add__LF_support_for__S = makeString("Time to add %LF support for ~S");
  public static final SubLInteger $int234$134217727 = makeInteger(134217727);
  public static final SubLInteger $int235$_134217728 = makeInteger(-134217728);
  public static final SubLList $list236 = list(makeSymbol("OPERATOR"), makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("INITIALIZATION"), NIL, makeSymbol("INITIALIZED?")));
  public static final SubLString $str237$volatile_ = makeString("volatile ");
  public static final SubLSymbol $sym238$MULTIPLE_VALUE_LIST = makeSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym239$_MULTIPLE_VALUE_LIST = makeSymbol("%MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym240$_NC = makeSymbol("%NC");
  public static final SubLSymbol $sym241$_TRUE = makeSymbol("%TRUE");
  public static final SubLString $str242$TRUE = makeString("TRUE");
  public static final SubLSymbol $sym243$_FALSE = makeSymbol("%FALSE");
  public static final SubLString $str244$FALSE = makeString("FALSE");
  public static final SubLString $str245$Unexpected_native_constant__S = makeString("Unexpected native constant ~S");
  public static final SubLSymbol $sym246$_NOT = makeSymbol("%NOT");
  public static final SubLString $str247$___ = makeString("(!(");
  public static final SubLString $str248$__ = makeString("))");
  public static final SubLList $list249 = list(makeSymbol("OPERATOR"), makeSymbol("N"), makeSymbol("EXPRESSION"));
  public static final SubLSymbol $sym250$NTH_VALUE = makeSymbol("NTH-VALUE");
  public static final SubLSymbol $sym251$_NTH_VALUE = makeSymbol("%NTH-VALUE");
  public static final SubLSymbol $sym252$_OR = makeSymbol("%OR");
  public static final SubLList $list253 = list(makeSymbol("%NC"), makeSymbol("%FALSE"));
  public static final SubLString $str254$___ = makeString("|| ");
  public static final SubLList $list255 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"), makeSymbol("REQUIRED-COUNT"), makeSymbol("OPTIONAL-COUNT"), makeSymbol("REST?"));
  public static final SubLSymbol $sym256$_REGISTER_FUNCTION = makeSymbol("%REGISTER-FUNCTION");
  public static final SubLString $str257$DEFINE_ = makeString("DEFINE(");
  public static final SubLList $list258 = list(makeSymbol("OPERATOR"), makeSymbol("DEFINER"), makeSymbol("GLOBAL"), makeSymbol("INITIALIZATION"));
  public static final SubLSymbol $sym259$_REGISTER_GLOBAL = makeSymbol("%REGISTER-GLOBAL");
  public static final SubLList $list260 = list(makeSymbol("OPERATOR"), makeSymbol("FUNCTION"));
  public static final SubLSymbol $sym261$_REGISTER_MACRO = makeSymbol("%REGISTER-MACRO");
  public static final SubLString $str262$DEFMACRO_ = makeString("DEFMACRO(");
  public static final SubLList $list263 = list(makeSymbol("OPERATOR"), makeSymbol("THREAD-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym264$_WITH_CURRENT_THREAD = makeSymbol("%WITH-CURRENT-THREAD");
  public static final SubLList $list265 = list(makeSymbol("OPERATOR"), list(makeSymbol("HANDLER"), makeSymbol("CATCH-VAR"), makeSymbol("ERROR-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym266$_WITH_ERROR_HANDLER = makeSymbol("%WITH-ERROR-HANDLER");
  public static final SubLSymbol $sym267$_ERROR_HANDLER_ = makeSymbol("*ERROR-HANDLER*");
  public static final SubLList $list268 = list(makeSymbol("OPERATOR"), makeSymbol("ENV-VAR"), makeSymbol("RESULT-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym269$_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%WITH-PROCESS-RESOURCE-TRACKING");
  public static final SubLSymbol $sym270$_BEGIN_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%BEGIN-WITH-PROCESS-RESOURCE-TRACKING");
  public static final SubLSymbol $sym271$_END_WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("%END-WITH-PROCESS-RESOURCE-TRACKING");
  public static final SubLList $list272 = list(makeSymbol("OPERATOR"), makeSymbol("THREAD"), makeSymbol("N"));
  public static final SubLSymbol $sym273$_THREAD_MVAL = makeSymbol("%THREAD-MVAL");
  public static final SubLSymbol $sym274$_MVAL = makeSymbol("%MVAL");
  public static final SubLList $list275 = list(makeSymbol("OPERATOR"), makeSymbol("THREAD"));
  public static final SubLSymbol $sym276$_THREAD_RESET_MVAL = makeSymbol("%THREAD-RESET-MVAL");
  public static final SubLList $list277 = list(makeSymbol("%RESET-MVAL"));
  public static final SubLString $str278$module_4__0D = makeString("module~4,'0D");
  public static final SubLString $str279$c = makeString("c");
  public static final SubLString $str280$_____include___A_h_____ = makeString("~%~%#include \"~A.h\"~%~%");
  public static final SubLString $str281$void_init__A_void___ = makeString("void init_~A(void) {");
  public static final SubLString $str282$____ = makeString("~%  ");
  public static final SubLString $str283$___ = makeString("();");
  public static final SubLString $str284$_____ = makeString("~%}~%");
  public static final SubLString $str285$h = makeString("h");
  public static final SubLString $str286$_____ifdef_CYC_PROFILING = makeString("~%~%#ifdef CYC_PROFILING");
  public static final SubLString $str287$___endif__ = makeString("~%#endif~%");
  public static final SubLList $list288 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULE"));
  public static final SubLString $str289$___include___A_A_h_ = makeString("~%#include \"~A~A.h\"");
  public static final SubLString $str290$____extern_void_init__A_void____ = makeString("~%~%extern void init_~A(void);~%");
  public static final SubLString $str291$ = makeString("");
  public static final SubLString $str292$filelist = makeString("filelist");
  public static final SubLString $str293$text = makeString("text");
  public static final SubLList $list294 = list(makeSymbol("MODULE-PATH"), makeSymbol("MODULES"));
  public static final SubLString $str295$_A_HEADERS___ = makeString("~A_HEADERS = ");
  public static final SubLString $str296$____c_A_h_ = makeString("\\~%~c~A.h ");
  public static final SubLString $str297$____c_A_A_h_ = makeString("\\~%~c~A~A.h ");
  public static final SubLString $str298$_____A_SOURCES___ = makeString("~%~%~A_SOURCES = ");
  public static final SubLString $str299$____c_A_c_ = makeString("\\~%~c~A.c ");
  public static final SubLString $str300$____c_A_A_c_ = makeString("\\~%~c~A~A.c ");
  public static final SubLString $str301$_____A_OBJECTS___ = makeString("~%~%~A_OBJECTS = ");
  public static final SubLString $str302$____c_A_o_ = makeString("\\~%~c~A.o ");
  public static final SubLString $str303$____c_A_A_o_ = makeString("\\~%~c~A~A.o ");
  public static final SubLString $str304$____lib_A_a_____A_OBJECTS_____ = makeString("~%~%lib~A.a: $(~A_OBJECTS)~%~%");
  public static final SubLString $str305$build_index = makeString("build-index");
  public static final SubLSymbol $sym306$C_BACKEND_IFDEF_NAME_FROM_STRING = makeSymbol("C-BACKEND-IFDEF-NAME-FROM-STRING");
  public static final SubLString $str307$BUILD_OBJECTS___ = makeString("BUILD_OBJECTS = ");
  public static final SubLString $str308$__ = makeString("$(");
  public static final SubLString $str309$_OBJECTS_ = makeString("_OBJECTS)");
  public static final SubLString $str310$BUILD_SOURCES___ = makeString("BUILD_SOURCES = ");
  public static final SubLString $str311$_SOURCES_ = makeString("_SOURCES)");
  public static final SubLString $str312$BUILD_HEADERS___ = makeString("BUILD_HEADERS = ");
  public static final SubLString $str313$_HEADERS_ = makeString("_HEADERS)");
  public static final SubLSymbol $sym314$C_BACKEND_FILE_NAME_FROM_STRING = makeSymbol("C-BACKEND-FILE-NAME-FROM-STRING");
  public static final SubLString $str315$BUILD_LIBRARIES___ = makeString("BUILD_LIBRARIES = ");
  public static final SubLString $str316$lib = makeString("lib");
  public static final SubLString $str317$_a = makeString(".a");
  public static final SubLString $str318$___A = makeString("~%~A");
  public static final SubLString $str319$_A_A_A_ = makeString("~A~A~A ");
  public static final SubLString $str320$build_instructions = makeString("build-instructions");
  public static final SubLString $str321$__curr_dir______shell_pwd___PWD__ = makeString("~%curr-dir := $(shell pwd)~%PWD = ${curr-dir}~%MKDIR=mkdir -p");
  public static final SubLString $str322$______DIRS___ = makeString("~%~%~%DIRS = ");
  public static final SubLString $str323$__C______ = makeString(" ~C~%    ");
  public static final SubLString $str324$__PWD___A = makeString("$(PWD)/~A");
  public static final SubLString $str325$______PWD___A____C__MKDIR____ = makeString("~%~%$(PWD)/~A:~%~C$(MKDIR) $@");
  public static final SubLString $str326$_ = makeString("/");
  public static final SubLSymbol $sym327$CCONCATENATE = makeSymbol("CCONCATENATE");

  //// Initializers

  public void declareFunctions() {
    declare_c_backend_file();
  }

  public void initializeVariables() {
    init_c_backend_file();
  }

  public void runTopLevelForms() {
    setup_c_backend_file();
  }

}
