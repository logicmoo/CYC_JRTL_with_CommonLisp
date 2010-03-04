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
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class eval_in_api extends SubLTranslatedFile {

  //// Constructor

  private eval_in_api() {}
  public static final SubLFile me = new eval_in_api();
  public static final String myName = "com.cyc.cycjava.cycl.eval_in_api";

  //// Definitions

  /** Process all api commands using a SubL interpreter which validates api function calls. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 953) 
  public static SubLSymbol $eval_in_apiP$ = null;

  /** Evaluate API-REQUEST under the evaluation assumptions of the CYC-API server */
  @SubL(source = "cycl/eval-in-api.lisp", position = 1146) 
  public static final SubLObject cyc_api_eval(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $eval_in_apiP$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10828");
      } else {
        return eval_in_api_subl_eval(api_request);
      }
    }
  }

  /** Call EVAL on API-REQUEST.
   Functions defined via the Cyc API are also supported. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 1457) 
  public static final SubLObject possibly_cyc_api_eval(SubLObject api_request) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $eval_in_apiP$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 10829");
      } else {
        return Eval.eval(api_request);
      }
    }
  }

  /** Return T iff OBJECT is suitable for FUNCALL.
   Functions defined via the Cyc API are also supported. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 2012) 
  public static final SubLObject possibly_cyc_api_function_spec_p(SubLObject object) {
    return makeBoolean((object.isFunctionSpec()
          || (object.isSymbol()
             && (NIL != api_function_p(object)))));
  }

  /** Funcall FUNC on ARG1.
   FUNC must specify a function that takes exactly 1 argument.
   Functions defined via the Cyc API are also supported. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 2490) 
  public static final SubLObject possibly_cyc_api_funcall_1(SubLObject func, SubLObject arg1) {
    if (func.isFunctionSpec()) {
      return subl_promotions.funcall_1(func, arg1);
    } else {
      return cyc_api_eval(list(func, list_utilities.quotify(arg1)));
    }
  }

  /** Funcall FUNC on ARG1 and ARG2.
   FUNC must specify a function that takes exactly 2 arguments.
   Functions defined via the Cyc API are also supported. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 2811) 
  public static final SubLObject possibly_cyc_api_funcall_2(SubLObject func, SubLObject arg1, SubLObject arg2) {
    if (func.isFunctionSpec()) {
      return subl_promotions.funcall_2(func, arg1, arg2);
    } else {
      return cyc_api_eval(list(func, list_utilities.quotify(arg1), list_utilities.quotify(arg2)));
    }
  }

  @SubL(source = "cycl/eval-in-api.lisp", position = 3960) 
  private static SubLSymbol $eval_in_api_mutable_globals$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 4397) 
  public static final SubLObject register_api_mutable_global(SubLObject var) {
    $eval_in_api_mutable_globals$.setGlobalValue(cons(var, $eval_in_api_mutable_globals$.getGlobalValue()));
    return var;
  }

  @SubL(source = "cycl/eval-in-api.lisp", position = 4606) 
  private static SubLSymbol $eval_in_api_immutable_globals$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 4663) 
  public static final SubLObject register_api_immutable_global(SubLObject var) {
    $eval_in_api_immutable_globals$.setGlobalValue(cons(var, $eval_in_api_immutable_globals$.getGlobalValue()));
    return var;
  }

  /** The association list of api variables and bound values. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 4974) 
  public static SubLSymbol $eval_in_api_env$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 5557) 
  private static SubLSymbol $api_special_verify_table$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 5888) 
  public static final SubLObject register_api_special_verify(SubLObject operator, SubLObject handler) {
    Hashtables.sethash(operator, $api_special_verify_table$.getGlobalValue(), handler);
    return operator;
  }

  @SubL(source = "cycl/eval-in-api.lisp", position = 6036) 
  private static SubLSymbol $api_function_table$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 6121) 
  public static final SubLObject api_function_p(SubLObject operator) {
    return list_utilities.sublisp_boolean(Hashtables.gethash(operator, $api_function_table$.getGlobalValue(), NIL));
  }

  @SubL(source = "cycl/eval-in-api.lisp", position = 6459) 
  private static SubLSymbol $api_macro_table$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 7655) 
  private static SubLSymbol $subl_eval_method$ = null;

  /** Trampoline to EVAL from within EVAL-IN-API */
  @SubL(source = "cycl/eval-in-api.lisp", position = 8310) 
  public static final SubLObject eval_in_api_subl_eval(SubLObject form) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = Eval.$evaluator_method$.currentBinding(thread);
          try {
            Eval.$evaluator_method$.bind($subl_eval_method$.getGlobalValue(), thread);
            answer = Functions.funcall($subl_eval_method$.getGlobalValue(), form);
          } finally {
            Eval.$evaluator_method$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** The list of functions to be traced. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 9630) 
  public static SubLSymbol $eval_in_api_traced_fns$ = null;

  /** The log of trace events. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 9768) 
  public static SubLSymbol $eval_in_api_trace_log$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 10074) 
  public static final SubLObject initialize_eval_in_api_env() {
    return NIL;
  }

  /** Indicates top level evaluation when value equals 0. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 10179) 
  private static SubLSymbol $eval_in_api_level$ = null;

  /** Indicates function level for diagnostic trace output. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 10282) 
  private static SubLSymbol $eval_in_api_function_level$ = null;

  /** The stack of macros that we're currently evalling in the context of. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 10395) 
  private static SubLSymbol $eval_in_api_macro_stack$ = null;

  @SubL(source = "cycl/eval-in-api.lisp", position = 25829) 
  private static SubLSymbol $verify_in_api_verbose_modeP$ = null;

  /** A list of the symbols introduced in the form being verified. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 26289) 
  private static SubLSymbol $verify_in_api_bound_symbols$ = null;

  /** A list of the function symbols introduced in the form being verified. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 26412) 
  private static SubLSymbol $verify_in_api_fbound_symbols$ = null;

  /** The stack of macros that we're currently verifying in the context of. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 26545) 
  private static SubLSymbol $verify_in_api_macro_stack$ = null;

  /** The dictionary of persistent api user variables and values. */
  @SubL(source = "cycl/eval-in-api.lisp", position = 38102) 
  public static SubLSymbol $api_user_variables$ = null;

  public static final SubLObject declare_eval_in_api_file() {
    declareFunction(myName, "cyc_api_eval", "CYC-API-EVAL", 1, 0, false);
    declareFunction(myName, "possibly_cyc_api_eval", "POSSIBLY-CYC-API-EVAL", 1, 0, false);
    //declareFunction(myName, "possibly_cyc_api_apply", "POSSIBLY-CYC-API-APPLY", 2, 0, false);
    declareFunction(myName, "possibly_cyc_api_function_spec_p", "POSSIBLY-CYC-API-FUNCTION-SPEC-P", 1, 0, false);
    declareFunction(myName, "possibly_cyc_api_funcall_1", "POSSIBLY-CYC-API-FUNCALL-1", 2, 0, false);
    declareFunction(myName, "possibly_cyc_api_funcall_2", "POSSIBLY-CYC-API-FUNCALL-2", 3, 0, false);
    //declareFunction(myName, "possibly_cyc_api_funcall_3", "POSSIBLY-CYC-API-FUNCALL-3", 4, 0, false);
    //declareFunction(myName, "possibly_cyc_api_funcall_4", "POSSIBLY-CYC-API-FUNCALL-4", 5, 0, false);
    declareFunction(myName, "register_api_mutable_global", "REGISTER-API-MUTABLE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "api_mutable_global_p", "API-MUTABLE-GLOBAL-P", 1, 0, false);
    declareFunction(myName, "register_api_immutable_global", "REGISTER-API-IMMUTABLE-GLOBAL", 1, 0, false);
    //declareFunction(myName, "api_immutable_global_p", "API-IMMUTABLE-GLOBAL-P", 1, 0, false);
    //declareFunction(myName, "api_lexical_variable_p", "API-LEXICAL-VARIABLE-P", 1, 0, false);
    //declareFunction(myName, "api_dynamic_variable_p", "API-DYNAMIC-VARIABLE-P", 1, 0, false);
    //declareFunction(myName, "api_special_verify_p", "API-SPECIAL-VERIFY-P", 1, 0, false);
    //declareFunction(myName, "api_special_verify_handler", "API-SPECIAL-VERIFY-HANDLER", 1, 0, false);
    declareFunction(myName, "register_api_special_verify", "REGISTER-API-SPECIAL-VERIFY", 2, 0, false);
    declareFunction(myName, "api_function_p", "API-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "api_function_handler", "API-FUNCTION-HANDLER", 1, 0, false);
    //declareFunction(myName, "register_api_function", "REGISTER-API-FUNCTION", 2, 0, false);
    //declareFunction(myName, "api_macro_p", "API-MACRO-P", 1, 0, false);
    //declareFunction(myName, "api_macro_expander", "API-MACRO-EXPANDER", 1, 0, false);
    //declareFunction(myName, "register_api_macro", "REGISTER-API-MACRO", 2, 0, false);
    //declareMacro(myName, "defspecial_in_api", "DEFSPECIAL-IN-API");
    //declareMacro(myName, "defspecial_in_api_verify", "DEFSPECIAL-IN-API-VERIFY");
    //declareMacro(myName, "with_eval_in_api_subl_evaluation", "WITH-EVAL-IN-API-SUBL-EVALUATION");
    declareFunction(myName, "eval_in_api_subl_eval", "EVAL-IN-API-SUBL-EVAL", 1, 0, false);
    //declareFunction(myName, "eval_in_api_subl_apply", "EVAL-IN-API-SUBL-APPLY", 2, 0, false);
    //declareFunction(myName, "eval_in_api_subl_funcall", "EVAL-IN-API-SUBL-FUNCALL", 1, 4, false);
    //declareMacro(myName, "with_clean_eval_in_api_environment", "WITH-CLEAN-EVAL-IN-API-ENVIRONMENT");
    declareFunction(myName, "initialize_eval_in_api_env", "INITIALIZE-EVAL-IN-API-ENV", 0, 0, false);
    //declareFunction(myName, "eval_in_api", "EVAL-IN-API", 1, 0, false);
    //declareFunction(myName, "valid_api_operator_p", "VALID-API-OPERATOR-P", 1, 0, false);
    //declareFunction(myName, "valid_api_function_p", "VALID-API-FUNCTION-P", 1, 0, false);
    //declareFunction(myName, "valid_api_macro_p", "VALID-API-MACRO-P", 1, 0, false);
    //declareFunction(myName, "eval_in_api_internal", "EVAL-IN-API-INTERNAL", 1, 0, false);
    //declareFunction(myName, "api_eval_args", "API-EVAL-ARGS", 1, 0, false);
    //declareFunction(myName, "eval_in_api_error", "EVAL-IN-API-ERROR", 0, 3, false);
    //declareFunction(myName, "api_self_evaluation", "API-SELF-EVALUATION", 1, 0, false);
    //declareFunction(myName, "api_dynamic_variable_value", "API-DYNAMIC-VARIABLE-VALUE", 1, 0, false);
    //declareFunction(myName, "api_lexical_variable_value", "API-LEXICAL-VARIABLE-VALUE", 1, 0, false);
    //declareFunction(myName, "api_apply_predefined_function", "API-APPLY-PREDEFINED-FUNCTION", 2, 0, false);
    //declareFunction(myName, "api_apply_predefined_function_one_arg", "API-APPLY-PREDEFINED-FUNCTION-ONE-ARG", 2, 0, false);
    //declareFunction(myName, "api_expand_predefined_macro", "API-EXPAND-PREDEFINED-MACRO", 1, 0, false);
    //declareFunction(myName, "api_funcall_special_handler", "API-FUNCALL-SPECIAL-HANDLER", 3, 0, false);
    //declareFunction(myName, "api_funcall_special_verify_handler", "API-FUNCALL-SPECIAL-VERIFY-HANDLER", 3, 0, false);
    //declareFunction(myName, "api_apply_function_handler", "API-APPLY-FUNCTION-HANDLER", 3, 0, false);
    //declareFunction(myName, "api_apply_lambda", "API-APPLY-LAMBDA", 2, 0, false);
    //declareFunction(myName, "api_funcall_macro_expander", "API-FUNCALL-MACRO-EXPANDER", 2, 0, false);
    //declareMacro(myName, "with_eval_in_api_env", "WITH-EVAL-IN-API-ENV");
    //declareFunction(myName, "with_eval_in_api_env_int", "WITH-EVAL-IN-API-ENV-INT", 1, 0, false);
    //declareFunction(myName, "eval_in_api_update_env", "EVAL-IN-API-UPDATE-ENV", 1, 0, false);
    //declareFunction(myName, "verify_in_api", "VERIFY-IN-API", 1, 1, false);
    //declareFunction(myName, "verify_args_in_api_internal", "VERIFY-ARGS-IN-API-INTERNAL", 1, 0, false);
    //declareFunction(myName, "verify_form_in_api_internal", "VERIFY-FORM-IN-API-INTERNAL", 1, 0, false);
    //declareFunction(myName, "verify_symbol_in_api_internal", "VERIFY-SYMBOL-IN-API-INTERNAL", 1, 0, false);
    //declareFunction(myName, "api_special_ret", "API-SPECIAL-RET", 1, 0, false);
    //declareFunction(myName, "api_special_ret_verify", "API-SPECIAL-RET-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_define", "API-SPECIAL-DEFINE", 1, 0, false);
    //declareFunction(myName, "api_special_define_verify", "API-SPECIAL-DEFINE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_define_public", "API-SPECIAL-DEFINE-PUBLIC", 1, 0, false);
    //declareFunction(myName, "api_special_define_public_verify", "API-SPECIAL-DEFINE-PUBLIC-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_define_protected", "API-SPECIAL-DEFINE-PROTECTED", 1, 0, false);
    //declareFunction(myName, "api_special_define_protected_verify", "API-SPECIAL-DEFINE-PROTECTED-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_define_private", "API-SPECIAL-DEFINE-PRIVATE", 1, 0, false);
    //declareFunction(myName, "api_special_define_private_verify", "API-SPECIAL-DEFINE-PRIVATE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro", "API-SPECIAL-DEFMACRO", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro_verify", "API-SPECIAL-DEFMACRO-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro_public", "API-SPECIAL-DEFMACRO-PUBLIC", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro_public_verify", "API-SPECIAL-DEFMACRO-PUBLIC-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro_protected", "API-SPECIAL-DEFMACRO-PROTECTED", 1, 0, false);
    //declareFunction(myName, "api_special_defmacro_protected_verify", "API-SPECIAL-DEFMACRO-PROTECTED-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_define_verify_int", "API-SPECIAL-DEFINE-VERIFY-INT", 3, 0, false);
    //declareFunction(myName, "api_special_defstruct", "API-SPECIAL-DEFSTRUCT", 1, 0, false);
    //declareFunction(myName, "api_special_defstruct_verify", "API-SPECIAL-DEFSTRUCT-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_defstruct", "EVAL-IN-API-DEFSTRUCT", 2, 0, false);
    //declareFunction(myName, "api_special_fi_get_parameter", "API-SPECIAL-FI-GET-PARAMETER", 1, 0, false);
    //declareFunction(myName, "api_special_fi_get_parameter_verify", "API-SPECIAL-FI-GET-PARAMETER-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_defvar", "API-SPECIAL-DEFVAR", 1, 0, false);
    //declareFunction(myName, "api_special_defvar_verify", "API-SPECIAL-DEFVAR-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_defvar_private", "API-SPECIAL-DEFVAR-PRIVATE", 1, 0, false);
    //declareFunction(myName, "api_special_defvar_private_verify", "API-SPECIAL-DEFVAR-PRIVATE-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_defvar", "EVAL-IN-API-DEFVAR", 2, 0, false);
    //declareFunction(myName, "api_user_variable_p", "API-USER-VARIABLE-P", 1, 0, false);
    //declareFunction(myName, "clear_api_user_variables", "CLEAR-API-USER-VARIABLES", 0, 0, false);
    //declareFunction(myName, "put_api_user_variable", "PUT-API-USER-VARIABLE", 2, 0, false);
    //declareFunction(myName, "get_api_user_variable", "GET-API-USER-VARIABLE", 1, 0, false);
    //declareFunction(myName, "api_special_fi_set_parameter", "API-SPECIAL-FI-SET-PARAMETER", 1, 0, false);
    //declareFunction(myName, "api_special_fi_set_parameter_verify", "API-SPECIAL-FI-SET-PARAMETER-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_csetq", "API-SPECIAL-CSETQ", 1, 0, false);
    //declareFunction(myName, "api_special_csetq_verify", "API-SPECIAL-CSETQ-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_csetq", "EVAL-IN-API-CSETQ", 2, 1, false);
    //declareFunction(myName, "api_special_cinc", "API-SPECIAL-CINC", 1, 0, false);
    //declareFunction(myName, "api_special_cinc_verify", "API-SPECIAL-CINC-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cdec", "API-SPECIAL-CDEC", 1, 0, false);
    //declareFunction(myName, "api_special_cdec_verify", "API-SPECIAL-CDEC-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cpush", "API-SPECIAL-CPUSH", 1, 0, false);
    //declareFunction(myName, "api_special_cpush_verify", "API-SPECIAL-CPUSH-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cpop", "API-SPECIAL-CPOP", 1, 0, false);
    //declareFunction(myName, "api_special_cpop_verify", "API-SPECIAL-CPOP-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_eval", "API-SPECIAL-EVAL", 1, 0, false);
    //declareFunction(myName, "api_special_eval_in_api_verify", "API-SPECIAL-EVAL-IN-API-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_fi_eval", "API-SPECIAL-FI-EVAL", 1, 0, false);
    //declareFunction(myName, "api_special_fi_eval_verify", "API-SPECIAL-FI-EVAL-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_fi_local_eval", "API-SPECIAL-FI-LOCAL-EVAL", 1, 0, false);
    //declareFunction(myName, "api_special_fi_local_eval_verify", "API-SPECIAL-FI-LOCAL-EVAL-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_apply", "API-SPECIAL-APPLY", 1, 0, false);
    //declareFunction(myName, "api_special_apply_verify", "API-SPECIAL-APPLY-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_apply", "EVAL-IN-API-APPLY", 3, 0, false);
    //declareFunction(myName, "eval_in_api_user_lambda_fnP", "EVAL-IN-API-USER-LAMBDA-FN?", 1, 0, false);
    //declareFunction(myName, "eval_in_api_user_fnP", "EVAL-IN-API-USER-FN?", 1, 0, false);
    //declareFunction(myName, "eval_in_api_predefined_fnP", "EVAL-IN-API-PREDEFINED-FN?", 1, 0, false);
    //declareFunction(myName, "eval_in_api_applicable_fnP", "EVAL-IN-API-APPLICABLE-FN?", 1, 0, false);
    //declareFunction(myName, "api_special_fboundp", "API-SPECIAL-FBOUNDP", 1, 0, false);
    //declareFunction(myName, "api_special_fboundp_verify", "API-SPECIAL-FBOUNDP-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_funcall", "API-SPECIAL-FUNCALL", 1, 0, false);
    //declareFunction(myName, "api_special_funcall_verify", "API-SPECIAL-FUNCALL-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_multiple_value_list", "API-SPECIAL-MULTIPLE-VALUE-LIST", 1, 0, false);
    //declareFunction(myName, "api_special_multiple_value_list_verify", "API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_trace", "API-SPECIAL-TRACE", 1, 0, false);
    //declareFunction(myName, "api_special_trace_verify", "API-SPECIAL-TRACE-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_trace", "EVAL-IN-API-TRACE", 1, 0, false);
    //declareFunction(myName, "api_special_untrace", "API-SPECIAL-UNTRACE", 1, 0, false);
    //declareFunction(myName, "api_special_untrace_verify", "API-SPECIAL-UNTRACE-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_untrace", "EVAL-IN-API-UNTRACE", 1, 0, false);
    //declareFunction(myName, "eval_in_api_traced_fnP", "EVAL-IN-API-TRACED-FN?", 1, 0, false);
    //declareFunction(myName, "eval_in_api_enter_trace_display", "EVAL-IN-API-ENTER-TRACE-DISPLAY", 2, 0, false);
    //declareFunction(myName, "eval_in_api_exit_trace_display", "EVAL-IN-API-EXIT-TRACE-DISPLAY", 1, 0, false);
    //declareFunction(myName, "api_special_get_trace_log", "API-SPECIAL-GET-TRACE-LOG", 1, 0, false);
    //declareFunction(myName, "api_special_get_trace_log_verify", "API-SPECIAL-GET-TRACE-LOG-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_clear_trace_log", "API-SPECIAL-CLEAR-TRACE-LOG", 1, 0, false);
    //declareFunction(myName, "api_special_clear_trace_log_verify", "API-SPECIAL-CLEAR-TRACE-LOG-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_clear_trace_log", "EVAL-IN-API-CLEAR-TRACE-LOG", 0, 0, false);
    //declareFunction(myName, "add1", "ADD1", 1, 0, false);
    //declareFunction(myName, "sub1", "SUB1", 1, 0, false);
    //declareFunction(myName, "api_special_progn", "API-SPECIAL-PROGN", 1, 0, false);
    //declareFunction(myName, "api_special_progn_verify", "API-SPECIAL-PROGN-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_progn_body", "EVAL-IN-API-PROGN-BODY", 1, 0, false);
    //declareFunction(myName, "api_special_clet", "API-SPECIAL-CLET", 1, 0, false);
    //declareFunction(myName, "api_special_clet_verify", "API-SPECIAL-CLET-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_clet", "EVAL-IN-API-CLET", 2, 0, false);
    //declareFunction(myName, "trace_me", "TRACE-ME", 0, 4, false);
    //declareFunction(myName, "eval_in_api_variable_bindings", "EVAL-IN-API-VARIABLE-BINDINGS", 2, 0, false);
    //declareFunction(myName, "api_special_cmultiple_value_bind", "API-SPECIAL-CMULTIPLE-VALUE-BIND", 1, 0, false);
    //declareFunction(myName, "api_special_cmultiple_value_bind_verify", "API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_cmultiple_value_bind", "EVAL-IN-API-CMULTIPLE-VALUE-BIND", 3, 0, false);
    //declareFunction(myName, "api_special_cand", "API-SPECIAL-CAND", 1, 0, false);
    //declareFunction(myName, "api_special_cand_verify", "API-SPECIAL-CAND-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cor", "API-SPECIAL-COR", 1, 0, false);
    //declareFunction(myName, "api_special_cor_verify", "API-SPECIAL-COR-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cnot", "API-SPECIAL-CNOT", 1, 0, false);
    //declareFunction(myName, "api_special_cnot_verify", "API-SPECIAL-CNOT-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_pcond", "API-SPECIAL-PCOND", 1, 0, false);
    //declareFunction(myName, "api_special_pcond_verify", "API-SPECIAL-PCOND-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_pif", "API-SPECIAL-PIF", 1, 0, false);
    //declareFunction(myName, "api_special_pif_verify", "API-SPECIAL-PIF-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_if", "EVAL-IN-API-IF", 3, 0, false);
    //declareFunction(myName, "api_special_fif", "API-SPECIAL-FIF", 1, 0, false);
    //declareFunction(myName, "api_special_fif_verify", "API-SPECIAL-FIF-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_pwhen", "API-SPECIAL-PWHEN", 1, 0, false);
    //declareFunction(myName, "api_special_pwhen_verify", "API-SPECIAL-PWHEN-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_when", "API-SPECIAL-WHEN", 1, 0, false);
    //declareFunction(myName, "api_special_when_verify", "API-SPECIAL-WHEN-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_fwhen", "API-SPECIAL-FWHEN", 1, 0, false);
    //declareFunction(myName, "api_special_fwhen_verify", "API-SPECIAL-FWHEN-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_punless", "API-SPECIAL-PUNLESS", 1, 0, false);
    //declareFunction(myName, "api_special_punless_verify", "API-SPECIAL-PUNLESS-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_funless", "API-SPECIAL-FUNLESS", 1, 0, false);
    //declareFunction(myName, "api_special_funless_verify", "API-SPECIAL-FUNLESS-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_while", "API-SPECIAL-WHILE", 1, 0, false);
    //declareFunction(myName, "api_special_while_verify", "API-SPECIAL-WHILE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_until", "API-SPECIAL-UNTIL", 1, 0, false);
    //declareFunction(myName, "api_special_until_verify", "API-SPECIAL-UNTIL-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cdo", "API-SPECIAL-CDO", 1, 0, false);
    //declareFunction(myName, "api_special_cdo_verify", "API-SPECIAL-CDO-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_cdolist", "API-SPECIAL-CDOLIST", 1, 0, false);
    //declareFunction(myName, "api_special_cdolist_verify", "API-SPECIAL-CDOLIST-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_codolist", "EVAL-IN-API-CODOLIST", 3, 0, false);
    //declareFunction(myName, "api_special_cdotimes", "API-SPECIAL-CDOTIMES", 1, 0, false);
    //declareFunction(myName, "api_special_cdotimes_verify", "API-SPECIAL-CDOTIMES-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_cdotimes", "EVAL-IN-API-CDOTIMES", 3, 0, false);
    //declareFunction(myName, "api_special_cdohash", "API-SPECIAL-CDOHASH", 1, 0, false);
    //declareFunction(myName, "api_special_cdohash_verify", "API-SPECIAL-CDOHASH-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_cdohash", "EVAL-IN-API-CDOHASH", 4, 0, false);
    //declareFunction(myName, "api_special_mapcar", "API-SPECIAL-MAPCAR", 1, 0, false);
    //declareFunction(myName, "api_special_mapcar_verify", "API-SPECIAL-MAPCAR-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_mapcar", "EVAL-IN-API-MAPCAR", 2, 0, false);
    //declareFunction(myName, "eval_in_api_quoted_args", "EVAL-IN-API-QUOTED-ARGS", 1, 0, false);
    //declareFunction(myName, "api_special_mapdictionary", "API-SPECIAL-MAPDICTIONARY", 1, 0, false);
    //declareFunction(myName, "api_special_mapdictionary_verify", "API-SPECIAL-MAPDICTIONARY-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary", "EVAL-IN-API-MAPDICTIONARY", 2, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary_alist_style", "EVAL-IN-API-MAPDICTIONARY-ALIST-STYLE", 2, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-HASHTABLE-STYLE", 2, 0, false);
    //declareFunction(myName, "api_special_mapdictionary_parameterized", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED", 1, 0, false);
    //declareFunction(myName, "api_special_mapdictionary_parameterized_verify", "API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary_parameterized", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED", 3, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary_parameterized_alist_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-ALIST-STYLE", 3, 0, false);
    //declareFunction(myName, "eval_in_api_mapdictionary_parameterized_hashtable_style", "EVAL-IN-API-MAPDICTIONARY-PARAMETERIZED-HASHTABLE-STYLE", 3, 0, false);
    //declareFunction(myName, "api_special_ccatch", "API-SPECIAL-CCATCH", 1, 0, false);
    //declareFunction(myName, "api_special_ccatch_verify", "API-SPECIAL-CCATCH-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_ccatch", "EVAL-IN-API-CCATCH", 3, 0, false);
    //declareFunction(myName, "api_special_throw", "API-SPECIAL-THROW", 1, 0, false);
    //declareFunction(myName, "api_special_throw_verify", "API-SPECIAL-THROW-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_throw", "EVAL-IN-API-THROW", 2, 0, false);
    //declareFunction(myName, "api_special_ignore_errors", "API-SPECIAL-IGNORE-ERRORS", 1, 0, false);
    //declareFunction(myName, "api_special_ignore_errors_verify", "API-SPECIAL-IGNORE-ERRORS-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_ignore_errors", "EVAL-IN-API-IGNORE-ERRORS", 1, 0, false);
    //declareFunction(myName, "api_special_cunwind_protect", "API-SPECIAL-CUNWIND-PROTECT", 1, 0, false);
    //declareFunction(myName, "api_special_cunwind_protect_verify", "API-SPECIAL-CUNWIND-PROTECT-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_cunwind_protect", "EVAL-IN-API-CUNWIND-PROTECT", 2, 0, false);
    //declareFunction(myName, "api_special_load", "API-SPECIAL-LOAD", 1, 0, false);
    //declareFunction(myName, "api_special_load_verify", "API-SPECIAL-LOAD-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_load", "EVAL-IN-API-LOAD", 1, 0, false);
    //declareFunction(myName, "api_special_check_type", "API-SPECIAL-CHECK-TYPE", 1, 0, false);
    //declareFunction(myName, "api_special_check_type_verify", "API-SPECIAL-CHECK-TYPE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_quote", "API-SPECIAL-QUOTE", 1, 0, false);
    //declareFunction(myName, "api_special_quote_verify", "API-SPECIAL-QUOTE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_boundp", "API-SPECIAL-BOUNDP", 1, 0, false);
    //declareFunction(myName, "api_special_boundp_verify", "API-SPECIAL-BOUNDP-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_symbol_value", "API-SPECIAL-SYMBOL-VALUE", 1, 0, false);
    //declareFunction(myName, "api_special_symbol_value_verify", "API-SPECIAL-SYMBOL-VALUE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_function", "API-SPECIAL-FUNCTION", 1, 0, false);
    //declareFunction(myName, "api_special_function_verify", "API-SPECIAL-FUNCTION-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_function", "EVAL-IN-API-FUNCTION", 1, 0, false);
    //declareFunction(myName, "api_special_error", "API-SPECIAL-ERROR", 1, 0, false);
    //declareFunction(myName, "api_special_error_verify", "API-SPECIAL-ERROR-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_break", "API-SPECIAL-BREAK", 1, 0, false);
    //declareFunction(myName, "api_special_break_verify", "API-SPECIAL-BREAK-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_clear_environment", "API-SPECIAL-CLEAR-ENVIRONMENT", 1, 0, false);
    //declareFunction(myName, "api_special_clear_environment_verify", "API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_get_environment", "API-SPECIAL-GET-ENVIRONMENT", 1, 0, false);
    //declareFunction(myName, "api_special_get_environment_verify", "API-SPECIAL-GET-ENVIRONMENT-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_in_package", "API-SPECIAL-IN-PACKAGE", 1, 0, false);
    //declareFunction(myName, "api_special_in_package_verify", "API-SPECIAL-IN-PACKAGE-VERIFY", 1, 0, false);
    //declareFunction(myName, "api_special_ctime", "API-SPECIAL-CTIME", 1, 0, false);
    //declareFunction(myName, "api_special_ctime_verify", "API-SPECIAL-CTIME-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_ctime", "EVAL-IN-API-CTIME", 2, 0, false);
    //declareFunction(myName, "api_special_noting_percent_progress", "API-SPECIAL-NOTING-PERCENT-PROGRESS", 1, 0, false);
    //declareFunction(myName, "api_special_noting_percent_progress_verify", "API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_noting_percent_progress", "EVAL-IN-API-NOTING-PERCENT-PROGRESS", 2, 0, false);
    //declareFunction(myName, "api_special_noting_activity", "API-SPECIAL-NOTING-ACTIVITY", 1, 0, false);
    //declareFunction(myName, "api_special_noting_activity_verify", "API-SPECIAL-NOTING-ACTIVITY-VERIFY", 1, 0, false);
    //declareFunction(myName, "eval_in_api_noting_activity", "EVAL-IN-API-NOTING-ACTIVITY", 2, 0, false);
    //declareFunction(myName, "eval_in_api_initialize", "EVAL-IN-API-INITIALIZE", 0, 0, false);
    return NIL;
  }

  public static final SubLObject init_eval_in_api_file() {
    $eval_in_apiP$ = defvar("*EVAL-IN-API?*", NIL);
    $eval_in_api_mutable_globals$ = deflexical("*EVAL-IN-API-MUTABLE-GLOBALS*", ((NIL != Symbols.boundp($sym1$_EVAL_IN_API_MUTABLE_GLOBALS_)) ? ((SubLObject) $eval_in_api_mutable_globals$.getGlobalValue()) : NIL));
    $eval_in_api_immutable_globals$ = deflexical("*EVAL-IN-API-IMMUTABLE-GLOBALS*", ((NIL != Symbols.boundp($sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_)) ? ((SubLObject) $eval_in_api_immutable_globals$.getGlobalValue()) : NIL));
    $eval_in_api_env$ = defparameter("*EVAL-IN-API-ENV*", NIL);
    $api_special_verify_table$ = deflexical("*API-SPECIAL-VERIFY-TABLE*", ((NIL != Symbols.boundp($sym3$_API_SPECIAL_VERIFY_TABLE_)) ? ((SubLObject) $api_special_verify_table$.getGlobalValue()) : Hashtables.make_hash_table(TEN_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED)));
    $api_function_table$ = deflexical("*API-FUNCTION-TABLE*", ((NIL != Symbols.boundp($sym4$_API_FUNCTION_TABLE_)) ? ((SubLObject) $api_function_table$.getGlobalValue()) : Hashtables.make_hash_table($int5$100, Symbols.symbol_function(EQ), UNPROVIDED)));
    $api_macro_table$ = deflexical("*API-MACRO-TABLE*", ((NIL != Symbols.boundp($sym6$_API_MACRO_TABLE_)) ? ((SubLObject) $api_macro_table$.getGlobalValue()) : Hashtables.make_hash_table(TEN_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED)));
    $subl_eval_method$ = deflexical("*SUBL-EVAL-METHOD*", ((NIL != Symbols.boundp($sym19$_SUBL_EVAL_METHOD_)) ? ((SubLObject) $subl_eval_method$.getGlobalValue()) : $sym20$EVAL));
    $eval_in_api_traced_fns$ = defparameter("*EVAL-IN-API-TRACED-FNS*", NIL);
    $eval_in_api_trace_log$ = defparameter("*EVAL-IN-API-TRACE-LOG*", NIL);
    $eval_in_api_level$ = defparameter("*EVAL-IN-API-LEVEL*", MINUS_ONE_INTEGER);
    $eval_in_api_function_level$ = defparameter("*EVAL-IN-API-FUNCTION-LEVEL*", MINUS_ONE_INTEGER);
    $eval_in_api_macro_stack$ = defparameter("*EVAL-IN-API-MACRO-STACK*", NIL);
    $verify_in_api_verbose_modeP$ = defparameter("*VERIFY-IN-API-VERBOSE-MODE?*", NIL);
    $verify_in_api_bound_symbols$ = defparameter("*VERIFY-IN-API-BOUND-SYMBOLS*", NIL);
    $verify_in_api_fbound_symbols$ = defparameter("*VERIFY-IN-API-FBOUND-SYMBOLS*", NIL);
    $verify_in_api_macro_stack$ = defparameter("*VERIFY-IN-API-MACRO-STACK*", NIL);
    $api_user_variables$ = deflexical("*API-USER-VARIABLES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_eval_in_api_file() {
    // CVS_ID("Id: eval-in-api.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym1$_EVAL_IN_API_MUTABLE_GLOBALS_);
    subl_macro_promotions.declare_defglobal($sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_);
    subl_macro_promotions.declare_defglobal($sym3$_API_SPECIAL_VERIFY_TABLE_);
    subl_macro_promotions.declare_defglobal($sym4$_API_FUNCTION_TABLE_);
    subl_macro_promotions.declare_defglobal($sym6$_API_MACRO_TABLE_);
    subl_macro_promotions.declare_defglobal($sym19$_SUBL_EVAL_METHOD_);
    access_macros.register_macro_helper($sym24$INITIALIZE_EVAL_IN_API_ENV, $sym25$WITH_EVAL_IN_API_ENVIRONMENT);
    utilities_macros.register_cyc_api_function($sym28$VALID_API_OPERATOR_P, $list29, $str30$_return_boolean_T_if_APPLY_or_FUN, $list31, $list32);
    utilities_macros.register_cyc_api_function($sym33$VALID_API_FUNCTION_P, $list29, $str34$_return_boolean_T_if_APPLY_or_FUN, $list31, $list32);
    utilities_macros.register_cyc_api_function($sym35$VALID_API_MACRO_P, $list29, $str36$_return_boolean_T_iff_macro_expan, $list31, $list32);
    generic_testing.define_test_case_table_int($sym28$VALID_API_OPERATOR_P, list(new SubLObject[] {$kw37$TEST, Symbols.symbol_function(EQ), $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T}), $list43);
    access_macros.register_external_symbol($sym65$VERIFY_IN_API);
    generic_testing.define_test_case_table_int($sym65$VERIFY_IN_API, list(new SubLObject[] {$kw37$TEST, Symbols.symbol_function(EQUAL), $kw38$OWNER, NIL, $kw39$CLASSES, NIL, $kw40$KB, $kw41$TINY, $kw42$WORKING_, T}), $list67);
    utilities_macros.register_api_special($sym69$RET, $sym70$API_SPECIAL_RET);
    register_api_special_verify($sym69$RET, $sym71$API_SPECIAL_RET_VERIFY);
    utilities_macros.register_api_special($sym73$DEFINE, $sym74$API_SPECIAL_DEFINE);
    register_api_special_verify($sym73$DEFINE, $sym75$API_SPECIAL_DEFINE_VERIFY);
    utilities_macros.register_api_special($sym76$DEFINE_PUBLIC, $sym77$API_SPECIAL_DEFINE_PUBLIC);
    register_api_special_verify($sym76$DEFINE_PUBLIC, $sym78$API_SPECIAL_DEFINE_PUBLIC_VERIFY);
    utilities_macros.register_api_special($sym79$DEFINE_PROTECTED, $sym80$API_SPECIAL_DEFINE_PROTECTED);
    register_api_special_verify($sym79$DEFINE_PROTECTED, $sym81$API_SPECIAL_DEFINE_PROTECTED_VERIFY);
    utilities_macros.register_api_special($sym11$DEFINE_PRIVATE, $sym82$API_SPECIAL_DEFINE_PRIVATE);
    register_api_special_verify($sym11$DEFINE_PRIVATE, $sym83$API_SPECIAL_DEFINE_PRIVATE_VERIFY);
    utilities_macros.register_api_special($sym85$DEFMACRO, $sym86$API_SPECIAL_DEFMACRO);
    register_api_special_verify($sym85$DEFMACRO, $sym87$API_SPECIAL_DEFMACRO_VERIFY);
    utilities_macros.register_api_special($sym89$DEFMACRO_PUBLIC, $sym90$API_SPECIAL_DEFMACRO_PUBLIC);
    register_api_special_verify($sym89$DEFMACRO_PUBLIC, $sym91$API_SPECIAL_DEFMACRO_PUBLIC_VERIFY);
    utilities_macros.register_api_special($sym93$DEFMACRO_PROTECTED, $sym94$API_SPECIAL_DEFMACRO_PROTECTED);
    register_api_special_verify($sym93$DEFMACRO_PROTECTED, $sym95$API_SPECIAL_DEFMACRO_PROTECTED_VERIFY);
    utilities_macros.register_api_special($sym97$DEFSTRUCT, $sym98$API_SPECIAL_DEFSTRUCT);
    register_api_special_verify($sym97$DEFSTRUCT, $sym100$API_SPECIAL_DEFSTRUCT_VERIFY);
    utilities_macros.register_api_special($sym103$FI_GET_PARAMETER, $sym104$API_SPECIAL_FI_GET_PARAMETER);
    register_api_special_verify($sym103$FI_GET_PARAMETER, $sym105$API_SPECIAL_FI_GET_PARAMETER_VERIFY);
    utilities_macros.register_api_special($sym107$DEFVAR, $sym108$API_SPECIAL_DEFVAR);
    register_api_special_verify($sym107$DEFVAR, $sym109$API_SPECIAL_DEFVAR_VERIFY);
    utilities_macros.register_api_special($sym110$DEFVAR_PRIVATE, $sym111$API_SPECIAL_DEFVAR_PRIVATE);
    register_api_special_verify($sym110$DEFVAR_PRIVATE, $sym112$API_SPECIAL_DEFVAR_PRIVATE_VERIFY);
    utilities_macros.register_cyc_api_function($sym113$CLEAR_API_USER_VARIABLES, NIL, $str114$Removes_all_user_variables_, NIL, $list115);
    utilities_macros.register_cyc_api_function($sym116$PUT_API_USER_VARIABLE, $list117, $str118$Sets_the_value_of_a_the_user_vari, NIL, $list115);
    utilities_macros.register_cyc_api_function($sym119$GET_API_USER_VARIABLE, $list120, $str121$Gets_the_value_of_a_the_user_vari, NIL, NIL);
    utilities_macros.register_api_special($sym122$FI_SET_PARAMETER, $sym123$API_SPECIAL_FI_SET_PARAMETER);
    register_api_special_verify($sym122$FI_SET_PARAMETER, $sym124$API_SPECIAL_FI_SET_PARAMETER_VERIFY);
    utilities_macros.register_api_special($sym51$CSETQ, $sym126$API_SPECIAL_CSETQ);
    register_api_special_verify($sym51$CSETQ, $sym127$API_SPECIAL_CSETQ_VERIFY);
    utilities_macros.register_api_special($sym132$CINC, $sym133$API_SPECIAL_CINC);
    register_api_special_verify($sym132$CINC, $sym134$API_SPECIAL_CINC_VERIFY);
    utilities_macros.register_api_special($sym135$CDEC, $sym136$API_SPECIAL_CDEC);
    register_api_special_verify($sym135$CDEC, $sym137$API_SPECIAL_CDEC_VERIFY);
    utilities_macros.register_api_special($sym139$CPUSH, $sym140$API_SPECIAL_CPUSH);
    register_api_special_verify($sym139$CPUSH, $sym141$API_SPECIAL_CPUSH_VERIFY);
    utilities_macros.register_api_special($sym143$CPOP, $sym144$API_SPECIAL_CPOP);
    register_api_special_verify($sym143$CPOP, $sym145$API_SPECIAL_CPOP_VERIFY);
    utilities_macros.register_api_special($sym20$EVAL, $sym147$API_SPECIAL_EVAL);
    register_api_special_verify($sym148$EVAL_IN_API, $sym149$API_SPECIAL_EVAL_IN_API_VERIFY);
    utilities_macros.register_api_special($sym150$FI_EVAL, $sym151$API_SPECIAL_FI_EVAL);
    register_api_special_verify($sym150$FI_EVAL, $sym152$API_SPECIAL_FI_EVAL_VERIFY);
    utilities_macros.register_api_special($sym153$FI_LOCAL_EVAL, $sym154$API_SPECIAL_FI_LOCAL_EVAL);
    register_api_special_verify($sym153$FI_LOCAL_EVAL, $sym155$API_SPECIAL_FI_LOCAL_EVAL_VERIFY);
    utilities_macros.register_api_special($sym157$APPLY, $sym158$API_SPECIAL_APPLY);
    register_api_special_verify($sym157$APPLY, $sym159$API_SPECIAL_APPLY_VERIFY);
    utilities_macros.register_api_special($sym161$FBOUNDP, $sym162$API_SPECIAL_FBOUNDP);
    register_api_special_verify($sym161$FBOUNDP, $sym163$API_SPECIAL_FBOUNDP_VERIFY);
    utilities_macros.register_api_special($sym165$FUNCALL, $sym166$API_SPECIAL_FUNCALL);
    register_api_special_verify($sym165$FUNCALL, $sym167$API_SPECIAL_FUNCALL_VERIFY);
    utilities_macros.register_api_special($sym53$MULTIPLE_VALUE_LIST, $sym168$API_SPECIAL_MULTIPLE_VALUE_LIST);
    register_api_special_verify($sym53$MULTIPLE_VALUE_LIST, $sym169$API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY);
    utilities_macros.register_api_special($sym170$TRACE, $sym171$API_SPECIAL_TRACE);
    register_api_special_verify($sym170$TRACE, $sym172$API_SPECIAL_TRACE_VERIFY);
    utilities_macros.register_api_special($sym173$UNTRACE, $sym174$API_SPECIAL_UNTRACE);
    register_api_special_verify($sym173$UNTRACE, $sym175$API_SPECIAL_UNTRACE_VERIFY);
    utilities_macros.register_api_special($sym181$GET_TRACE_LOG, $sym182$API_SPECIAL_GET_TRACE_LOG);
    register_api_special_verify($sym181$GET_TRACE_LOG, $sym183$API_SPECIAL_GET_TRACE_LOG_VERIFY);
    utilities_macros.register_api_special($sym184$CLEAR_TRACE_LOG, $sym185$API_SPECIAL_CLEAR_TRACE_LOG);
    register_api_special_verify($sym184$CLEAR_TRACE_LOG, $sym186$API_SPECIAL_CLEAR_TRACE_LOG_VERIFY);
    utilities_macros.register_api_special($sym10$PROGN, $sym188$API_SPECIAL_PROGN);
    register_api_special_verify($sym10$PROGN, $sym189$API_SPECIAL_PROGN_VERIFY);
    utilities_macros.register_api_special($sym21$CLET, $sym191$API_SPECIAL_CLET);
    register_api_special_verify($sym21$CLET, $sym193$API_SPECIAL_CLET_VERIFY);
    utilities_macros.register_api_special($sym196$CMULTIPLE_VALUE_BIND, $sym197$API_SPECIAL_CMULTIPLE_VALUE_BIND);
    register_api_special_verify($sym196$CMULTIPLE_VALUE_BIND, $sym198$API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY);
    utilities_macros.register_api_special($sym199$CAND, $sym200$API_SPECIAL_CAND);
    register_api_special_verify($sym199$CAND, $sym201$API_SPECIAL_CAND_VERIFY);
    utilities_macros.register_api_special($sym202$COR, $sym203$API_SPECIAL_COR);
    register_api_special_verify($sym202$COR, $sym204$API_SPECIAL_COR_VERIFY);
    utilities_macros.register_api_special($sym205$CNOT, $sym206$API_SPECIAL_CNOT);
    register_api_special_verify($sym205$CNOT, $sym207$API_SPECIAL_CNOT_VERIFY);
    utilities_macros.register_api_special($sym209$PCOND, $sym210$API_SPECIAL_PCOND);
    register_api_special_verify($sym209$PCOND, $sym211$API_SPECIAL_PCOND_VERIFY);
    utilities_macros.register_api_special($sym213$PIF, $sym214$API_SPECIAL_PIF);
    register_api_special_verify($sym213$PIF, $sym215$API_SPECIAL_PIF_VERIFY);
    utilities_macros.register_api_special($sym216$FIF, $sym217$API_SPECIAL_FIF);
    register_api_special_verify($sym216$FIF, $sym218$API_SPECIAL_FIF_VERIFY);
    utilities_macros.register_api_special($sym219$PWHEN, $sym220$API_SPECIAL_PWHEN);
    register_api_special_verify($sym219$PWHEN, $sym221$API_SPECIAL_PWHEN_VERIFY);
    utilities_macros.register_api_special($sym223$WHEN, $sym224$API_SPECIAL_WHEN);
    register_api_special_verify($sym223$WHEN, $sym225$API_SPECIAL_WHEN_VERIFY);
    utilities_macros.register_api_special($sym226$FWHEN, $sym227$API_SPECIAL_FWHEN);
    register_api_special_verify($sym226$FWHEN, $sym228$API_SPECIAL_FWHEN_VERIFY);
    utilities_macros.register_api_special($sym229$PUNLESS, $sym230$API_SPECIAL_PUNLESS);
    register_api_special_verify($sym229$PUNLESS, $sym231$API_SPECIAL_PUNLESS_VERIFY);
    utilities_macros.register_api_special($sym232$FUNLESS, $sym233$API_SPECIAL_FUNLESS);
    register_api_special_verify($sym232$FUNLESS, $sym234$API_SPECIAL_FUNLESS_VERIFY);
    utilities_macros.register_api_special($sym235$WHILE, $sym236$API_SPECIAL_WHILE);
    register_api_special_verify($sym235$WHILE, $sym237$API_SPECIAL_WHILE_VERIFY);
    utilities_macros.register_api_special($sym238$UNTIL, $sym239$API_SPECIAL_UNTIL);
    register_api_special_verify($sym238$UNTIL, $sym240$API_SPECIAL_UNTIL_VERIFY);
    utilities_macros.register_api_special($sym243$CDO, $sym244$API_SPECIAL_CDO);
    register_api_special_verify($sym243$CDO, $sym245$API_SPECIAL_CDO_VERIFY);
    utilities_macros.register_api_special($sym247$CDOLIST, $sym248$API_SPECIAL_CDOLIST);
    register_api_special_verify($sym247$CDOLIST, $sym249$API_SPECIAL_CDOLIST_VERIFY);
    utilities_macros.register_api_special($sym251$CDOTIMES, $sym252$API_SPECIAL_CDOTIMES);
    register_api_special_verify($sym251$CDOTIMES, $sym253$API_SPECIAL_CDOTIMES_VERIFY);
    utilities_macros.register_api_special($sym255$CDOHASH, $sym256$API_SPECIAL_CDOHASH);
    register_api_special_verify($sym255$CDOHASH, $sym257$API_SPECIAL_CDOHASH_VERIFY);
    utilities_macros.register_api_special($sym259$MAPCAR, $sym260$API_SPECIAL_MAPCAR);
    register_api_special_verify($sym259$MAPCAR, $sym261$API_SPECIAL_MAPCAR_VERIFY);
    utilities_macros.register_api_special($sym267$MAPDICTIONARY, $sym268$API_SPECIAL_MAPDICTIONARY);
    register_api_special_verify($sym267$MAPDICTIONARY, $sym269$API_SPECIAL_MAPDICTIONARY_VERIFY);
    utilities_macros.register_api_special($sym274$MAPDICTIONARY_PARAMETERIZED, $sym275$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED);
    register_api_special_verify($sym274$MAPDICTIONARY_PARAMETERIZED, $sym276$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY);
    utilities_macros.register_api_special($sym281$CCATCH, $sym282$API_SPECIAL_CCATCH);
    register_api_special_verify($sym281$CCATCH, $sym283$API_SPECIAL_CCATCH_VERIFY);
    utilities_macros.register_api_special($sym288$THROW, $sym289$API_SPECIAL_THROW);
    register_api_special_verify($sym288$THROW, $sym290$API_SPECIAL_THROW_VERIFY);
    utilities_macros.register_api_special($sym292$IGNORE_ERRORS, $sym293$API_SPECIAL_IGNORE_ERRORS);
    register_api_special_verify($sym292$IGNORE_ERRORS, $sym294$API_SPECIAL_IGNORE_ERRORS_VERIFY);
    utilities_macros.register_api_special($sym298$CUNWIND_PROTECT, $sym299$API_SPECIAL_CUNWIND_PROTECT);
    register_api_special_verify($sym298$CUNWIND_PROTECT, $sym300$API_SPECIAL_CUNWIND_PROTECT_VERIFY);
    utilities_macros.register_api_special($sym306$LOAD, $sym307$API_SPECIAL_LOAD);
    register_api_special_verify($sym306$LOAD, $sym308$API_SPECIAL_LOAD_VERIFY);
    utilities_macros.register_api_special($sym319$CHECK_TYPE, $sym320$API_SPECIAL_CHECK_TYPE);
    register_api_special_verify($sym319$CHECK_TYPE, $sym321$API_SPECIAL_CHECK_TYPE_VERIFY);
    utilities_macros.register_api_special($sym15$QUOTE, $sym322$API_SPECIAL_QUOTE);
    register_api_special_verify($sym15$QUOTE, $sym323$API_SPECIAL_QUOTE_VERIFY);
    utilities_macros.register_api_special($sym324$BOUNDP, $sym325$API_SPECIAL_BOUNDP);
    register_api_special_verify($sym324$BOUNDP, $sym326$API_SPECIAL_BOUNDP_VERIFY);
    utilities_macros.register_api_special($sym327$SYMBOL_VALUE, $sym328$API_SPECIAL_SYMBOL_VALUE);
    register_api_special_verify($sym327$SYMBOL_VALUE, $sym329$API_SPECIAL_SYMBOL_VALUE_VERIFY);
    utilities_macros.register_api_special($sym331$FUNCTION, $sym332$API_SPECIAL_FUNCTION);
    register_api_special_verify($sym331$FUNCTION, $sym333$API_SPECIAL_FUNCTION_VERIFY);
    utilities_macros.register_api_special($sym335$ERROR, $sym336$API_SPECIAL_ERROR);
    register_api_special_verify($sym335$ERROR, $sym337$API_SPECIAL_ERROR_VERIFY);
    utilities_macros.register_api_special($sym339$BREAK, $sym340$API_SPECIAL_BREAK);
    register_api_special_verify($sym339$BREAK, $sym341$API_SPECIAL_BREAK_VERIFY);
    utilities_macros.register_api_special($sym343$CLEAR_ENVIRONMENT, $sym344$API_SPECIAL_CLEAR_ENVIRONMENT);
    register_api_special_verify($sym343$CLEAR_ENVIRONMENT, $sym345$API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY);
    utilities_macros.register_api_special($sym346$GET_ENVIRONMENT, $sym347$API_SPECIAL_GET_ENVIRONMENT);
    register_api_special_verify($sym346$GET_ENVIRONMENT, $sym348$API_SPECIAL_GET_ENVIRONMENT_VERIFY);
    utilities_macros.register_api_special($sym350$IN_PACKAGE, $sym351$API_SPECIAL_IN_PACKAGE);
    register_api_special_verify($sym350$IN_PACKAGE, $sym352$API_SPECIAL_IN_PACKAGE_VERIFY);
    utilities_macros.register_api_special($sym354$CTIME, $sym355$API_SPECIAL_CTIME);
    register_api_special_verify($sym354$CTIME, $sym356$API_SPECIAL_CTIME_VERIFY);
    utilities_macros.register_api_special($sym363$NOTING_PERCENT_PROGRESS, $sym364$API_SPECIAL_NOTING_PERCENT_PROGRESS);
    register_api_special_verify($sym363$NOTING_PERCENT_PROGRESS, $sym365$API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY);
    utilities_macros.register_api_special($sym367$NOTING_ACTIVITY, $sym368$API_SPECIAL_NOTING_ACTIVITY);
    register_api_special_verify($sym367$NOTING_ACTIVITY, $sym369$API_SPECIAL_NOTING_ACTIVITY_VERIFY);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$QUOTIFY = makeSymbol("QUOTIFY");
  public static final SubLSymbol $sym1$_EVAL_IN_API_MUTABLE_GLOBALS_ = makeSymbol("*EVAL-IN-API-MUTABLE-GLOBALS*");
  public static final SubLSymbol $sym2$_EVAL_IN_API_IMMUTABLE_GLOBALS_ = makeSymbol("*EVAL-IN-API-IMMUTABLE-GLOBALS*");
  public static final SubLSymbol $sym3$_API_SPECIAL_VERIFY_TABLE_ = makeSymbol("*API-SPECIAL-VERIFY-TABLE*");
  public static final SubLSymbol $sym4$_API_FUNCTION_TABLE_ = makeSymbol("*API-FUNCTION-TABLE*");
  public static final SubLInteger $int5$100 = makeInteger(100);
  public static final SubLSymbol $sym6$_API_MACRO_TABLE_ = makeSymbol("*API-MACRO-TABLE*");
  public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym8$FORM = makeUninternedSymbol("FORM");
  public static final SubLString $str9$API_SPECIAL__A = makeString("API-SPECIAL-~A");
  public static final SubLSymbol $sym10$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym11$DEFINE_PRIVATE = makeSymbol("DEFINE-PRIVATE");
  public static final SubLSymbol $sym12$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLSymbol $sym13$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym14$REGISTER_API_SPECIAL = makeSymbol("REGISTER-API-SPECIAL");
  public static final SubLSymbol $sym15$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym16$FORM = makeUninternedSymbol("FORM");
  public static final SubLString $str17$API_SPECIAL__A_VERIFY = makeString("API-SPECIAL-~A-VERIFY");
  public static final SubLSymbol $sym18$REGISTER_API_SPECIAL_VERIFY = makeSymbol("REGISTER-API-SPECIAL-VERIFY");
  public static final SubLSymbol $sym19$_SUBL_EVAL_METHOD_ = makeSymbol("*SUBL-EVAL-METHOD*");
  public static final SubLSymbol $sym20$EVAL = makeSymbol("EVAL");
  public static final SubLSymbol $sym21$CLET = makeSymbol("CLET");
  public static final SubLList $list22 = list(list(makeSymbol("*%EVALUATOR-METHOD*", "SUBLISP"), makeSymbol("*SUBL-EVAL-METHOD*")));
  public static final SubLList $list23 = list(list(makeSymbol("*EVAL-IN-API-ENV*"), list(makeSymbol("INITIALIZE-EVAL-IN-API-ENV"))), list(makeSymbol("*EVAL-IN-API-TRACED-FNS*"), NIL), list(makeSymbol("*EVAL-IN-API-TRACE-LOG*"), makeString("")));
  public static final SubLSymbol $sym24$INITIALIZE_EVAL_IN_API_ENV = makeSymbol("INITIALIZE-EVAL-IN-API-ENV");
  public static final SubLSymbol $sym25$WITH_EVAL_IN_API_ENVIRONMENT = makeSymbol("WITH-EVAL-IN-API-ENVIRONMENT");
  public static final SubLSymbol $sym26$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym27$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym28$VALID_API_OPERATOR_P = makeSymbol("VALID-API-OPERATOR-P");
  public static final SubLList $list29 = list(makeSymbol("OPERATOR"));
  public static final SubLString $str30$_return_boolean_T_if_APPLY_or_FUN = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR or use\nas a MACRO would success in the most restricted version of the API");
  public static final SubLList $list31 = list(list(makeSymbol("OPERATOR"), makeSymbol("SYMBOLP")));
  public static final SubLList $list32 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym33$VALID_API_FUNCTION_P = makeSymbol("VALID-API-FUNCTION-P");
  public static final SubLString $str34$_return_boolean_T_if_APPLY_or_FUN = makeString("@return boolean T if APPLY or FUNCALL of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
  public static final SubLSymbol $sym35$VALID_API_MACRO_P = makeSymbol("VALID-API-MACRO-P");
  public static final SubLString $str36$_return_boolean_T_iff_macro_expan = makeString("@return boolean T iff macro expansion of that OPERATOR\nwould succeed in the most restricted version of the API. \n@note does NOT check API-SPECIAL-P");
  public static final SubLSymbol $kw37$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw38$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw39$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw40$KB = makeKeyword("KB");
  public static final SubLSymbol $kw41$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw42$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list43 = list(new SubLObject[] {list(list(makeSymbol("VALID-API-OPERATOR-P")), T), list(list(makeSymbol("WITH-ALL-MTS")), T), list(list(makeSymbol("+")), T), list(list(makeSymbol("CDESTRUCTURING-BIND")), T), list(list(makeSymbol("CPUSH")), T), list(list(makeSymbol("EXPRESSION-FIND-IF")), T), list(list(makeSymbol("SYMBOL-PACKAGE")), NIL), list(list(makeSymbol("EVAL-IN-API-INTERNAL")), NIL), list(list(makeSymbol("WITH-EVAL-IN-API-ENV")), NIL)});
  public static final SubLList $list44 = cons(makeSymbol("OPERATOR"), makeSymbol("ARGS"));
  public static final SubLString $str45$Operator__S_was_not_a_symbol = makeString("Operator ~S was not a symbol");
  public static final SubLString $str46$Operator__S_is_not_defined_in_the = makeString("Operator ~S is not defined in the API");
  public static final SubLString $str47$Variable__S_is_unbound = makeString("Variable ~S is unbound");
  public static final SubLString $str48$API_ERROR = makeString("API ERROR");
  public static final SubLString $str49$Attempt_to_obtain_the_value_of_sy = makeString("Attempt to obtain the value of symbol ~S which is unbound");
  public static final SubLList $list50 = list(makeSymbol("FUNCTION-RESULTS"));
  public static final SubLSymbol $sym51$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym52$FUNCTION_RESULTS = makeSymbol("FUNCTION-RESULTS");
  public static final SubLSymbol $sym53$MULTIPLE_VALUE_LIST = makeSymbol("MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym54$EVAL_IN_API_UPDATE_ENV = makeSymbol("EVAL-IN-API-UPDATE-ENV");
  public static final SubLSymbol $sym55$VALUES_LIST = makeSymbol("VALUES-LIST");
  public static final SubLList $list56 = list(makeSymbol("MACRO-RESULT"));
  public static final SubLSymbol $sym57$MACRO_RESULT = makeSymbol("MACRO-RESULT");
  public static final SubLSymbol $sym58$MACROEXPAND_1 = makeSymbol("MACROEXPAND-1");
  public static final SubLSymbol $kw59$EVAL_IN_API_RET = makeKeyword("EVAL-IN-API-RET");
  public static final SubLSymbol $sym60$WITH_EVAL_IN_API_ENV_INT = makeSymbol("WITH-EVAL-IN-API-ENV-INT");
  public static final SubLList $list61 = list(makeSymbol("BODY-RESULTS"));
  public static final SubLSymbol $sym62$BODY_RESULTS = makeSymbol("BODY-RESULTS");
  public static final SubLSymbol $sym63$EVAL_IN_API_PROGN_BODY = makeSymbol("EVAL-IN-API-PROGN-BODY");
  public static final SubLString $str64$with_eval_in_api_env_int = makeString("with-eval-in-api-env-int");
  public static final SubLSymbol $sym65$VERIFY_IN_API = makeSymbol("VERIFY-IN-API");
  public static final SubLString $str66$don_t_know_how_to_handle_special_ = makeString("don't know how to handle special ~A");
  public static final SubLList $list67 = list(new SubLObject[] {list(list(list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), list(makeSymbol("+"), ONE_INTEGER, ONE_INTEGER))))), NIL), list(list(list(makeSymbol("DEFINE"), makeSymbol("FOO"), list(makeSymbol("FOO")), list(makeSymbol("RET"), list(makeSymbol("+"), makeSymbol("FOO"), list(makeSymbol("FOO"), ONE_INTEGER))))), NIL), list(list(list(makeSymbol("DEFINE-PUBLIC"), makeSymbol("FIBONACCI"), list(makeSymbol("N")), list(makeSymbol("CHECK-TYPE"), makeSymbol("N"), makeSymbol("NON-NEGATIVE-INTEGER-P")), list(makeSymbol("CLET"), list(makeSymbol("FIB")), list(makeSymbol("CSETQ"), makeSymbol("FIB"), list(makeSymbol("FIBONACCI"), makeSymbol("N"))), list(makeSymbol("RET"), makeSymbol("FIB"))))), NIL), list(list(list(makeSymbol("PCOND"), list(list(makeSymbol("FIF"), NIL, T, NIL), list(makeSymbol("PIF"), T, list(makeSymbol("NULL"), T), list(makeSymbol("NULL"), NIL))), list(T, makeSymbol("*THE-CYCLIST*")))), NIL), list(list(list(makeSymbol("PROGN"), list(makeSymbol("DEFVAR"), makeSymbol("*FOO*"), NIL), list(makeSymbol("DEFMACRO"), makeSymbol("WITH-FOO"), list(makeSymbol("BAR"), makeSymbol("&BODY"), makeSymbol("BODY")), list(makeSymbol("CLET"), list(list(makeSymbol("*FOO*"), makeSymbol("BAR"))), makeSymbol("BODY"))), list(makeSymbol("DEFINE"), makeSymbol("DO-FOO"), list(makeSymbol("BAR"), makeSymbol("BAZ")), list(makeSymbol("WITH-FOO"), list(makeSymbol("BAR")), list(makeSymbol("FOO"), makeSymbol("BAR")))), list(makeSymbol("DEFINE"), makeSymbol("FOO"), NIL, list(makeSymbol("RET"), NIL)))), NIL), list(list(list(makeSymbol("FUNCTION"), makeSymbol("FBOUNDP"))), NIL), list(list(list(makeSymbol("MULTIPLE-VALUE-LIST"), list(makeSymbol("VALUES"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER))), NIL), list(list(list(makeSymbol("CDOTIMES"), list(makeSymbol("N"), list(makeSymbol("+"), FIVE_INTEGER, ONE_INTEGER)), list(makeSymbol("PRINT"), makeString("a")))), NIL), list(list(list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("SEC"), makeSymbol("MIN"), makeSymbol("HOUR")), list(makeSymbol("GET-DECODED-TIME")), list(makeSymbol("FORMAT"), T, makeString("~A:~A"), makeSymbol("HOUR"), makeSymbol("MIN")))), NIL), list(list(list(makeSymbol("CLET"), list(list(makeSymbol("N"), ZERO_INTEGER)), list(makeSymbol("WHILE"), list(makeSymbol("<"), makeSymbol("N"), TEN_INTEGER), list(makeSymbol("CINC"), makeSymbol("N")), list(makeSymbol("PRINT"), makeString("a"))))), NIL), list(list(list(makeSymbol("CDO"), list(list(makeSymbol("X"), ZERO_INTEGER, list(makeSymbol("+"), ONE_INTEGER, makeSymbol("X"))), list(makeSymbol("Y"), list(makeSymbol("+"), ZERO_INTEGER, ONE_INTEGER), list(makeSymbol("+"), makeSymbol("Y"), TWO_INTEGER)), list(makeSymbol("Z"), makeInteger(-10), list(makeSymbol("-"), makeSymbol("Z"), ONE_INTEGER))), list(list(makeSymbol(">"), makeSymbol("X"), THREE_INTEGER)), list(makeSymbol("FORMAT"), T, makeString("~%x=~S y=~S z=~S"), makeSymbol("X"), makeSymbol("Y"), makeSymbol("Z")))), NIL), list(list(list(makeSymbol("CLET"), list(makeSymbol("FOO")), list(makeSymbol("CCATCH"), list(makeSymbol("MAKE-KEYWORD"), makeString("a")), makeSymbol("FOO"), list(makeSymbol("THROW"), list(makeSymbol("MAKE-KEYWORD"), makeString("a")), makeString("b"))), makeSymbol("FOO"))), NIL), list(list(list(makeSymbol("DO-CONSTANTS"), list(makeSymbol("C")))), NIL), list(list(list(makeSymbol("DO-NARTS"), list(makeSymbol("N")))), NIL), list(list(list(makeSymbol("DO-FORTS"), list(makeSymbol("F")))), NIL), list(list(list(makeSymbol("DO-ASSERTIONS"), list(makeSymbol("A")))), NIL), list(list(list(makeSymbol("DO-DEDUCTIONS"), list(makeSymbol("D")))), NIL), list(list(list(makeSymbol("WITH-INFERENCE-MT-RELEVANCE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-MT")), list(makeSymbol("DO-GAF-ARG-INDEX"), list(makeSymbol("A"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-TERM")), makeKeyword("PREDICATE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-PRED")), makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE")), list(makeSymbol("PRINT"), makeSymbol("A"))))), NIL), list(list(list(makeSymbol("WITH-ALL-MTS"), list(makeSymbol("DO-GAF-ARG-INDEX"), list(makeSymbol("A"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-TERM")), makeKeyword("PREDICATE"), list(makeSymbol("QUOTE"), makeSymbol("DUMMY-PRED")), makeKeyword("INDEX"), ONE_INTEGER, makeKeyword("TRUTH"), makeKeyword("TRUE")), list(makeSymbol("PRINT"), makeSymbol("A"))))), NIL), list(list(list(makeSymbol("DEFINE-EVALUATION-DEFN"), makeSymbol("TEST"), list(makeSymbol("OBJECT")), list(makeSymbol("PWHEN"), list(makeSymbol("NULL"), makeSymbol("OBJECT")), list(makeSymbol("THROW-UNEVALUATABLE"))), list(makeSymbol("RET"), makeSymbol("OBJECT")))), NIL)});
  public static final SubLList $list68 = list(makeSymbol("EXPRESSION"));
  public static final SubLSymbol $sym69$RET = makeSymbol("RET");
  public static final SubLSymbol $sym70$API_SPECIAL_RET = makeSymbol("API-SPECIAL-RET");
  public static final SubLSymbol $sym71$API_SPECIAL_RET_VERIFY = makeSymbol("API-SPECIAL-RET-VERIFY");
  public static final SubLSymbol $sym72$LAMBDA = makeSymbol("LAMBDA");
  public static final SubLSymbol $sym73$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym74$API_SPECIAL_DEFINE = makeSymbol("API-SPECIAL-DEFINE");
  public static final SubLSymbol $sym75$API_SPECIAL_DEFINE_VERIFY = makeSymbol("API-SPECIAL-DEFINE-VERIFY");
  public static final SubLSymbol $sym76$DEFINE_PUBLIC = makeSymbol("DEFINE-PUBLIC");
  public static final SubLSymbol $sym77$API_SPECIAL_DEFINE_PUBLIC = makeSymbol("API-SPECIAL-DEFINE-PUBLIC");
  public static final SubLSymbol $sym78$API_SPECIAL_DEFINE_PUBLIC_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PUBLIC-VERIFY");
  public static final SubLSymbol $sym79$DEFINE_PROTECTED = makeSymbol("DEFINE-PROTECTED");
  public static final SubLSymbol $sym80$API_SPECIAL_DEFINE_PROTECTED = makeSymbol("API-SPECIAL-DEFINE-PROTECTED");
  public static final SubLSymbol $sym81$API_SPECIAL_DEFINE_PROTECTED_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PROTECTED-VERIFY");
  public static final SubLSymbol $sym82$API_SPECIAL_DEFINE_PRIVATE = makeSymbol("API-SPECIAL-DEFINE-PRIVATE");
  public static final SubLSymbol $sym83$API_SPECIAL_DEFINE_PRIVATE_VERIFY = makeSymbol("API-SPECIAL-DEFINE-PRIVATE-VERIFY");
  public static final SubLSymbol $sym84$FORM = makeUninternedSymbol("FORM");
  public static final SubLSymbol $sym85$DEFMACRO = makeSymbol("DEFMACRO");
  public static final SubLSymbol $sym86$API_SPECIAL_DEFMACRO = makeSymbol("API-SPECIAL-DEFMACRO");
  public static final SubLSymbol $sym87$API_SPECIAL_DEFMACRO_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-VERIFY");
  public static final SubLSymbol $sym88$FORM = makeUninternedSymbol("FORM");
  public static final SubLSymbol $sym89$DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");
  public static final SubLSymbol $sym90$API_SPECIAL_DEFMACRO_PUBLIC = makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC");
  public static final SubLSymbol $sym91$API_SPECIAL_DEFMACRO_PUBLIC_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-PUBLIC-VERIFY");
  public static final SubLSymbol $sym92$FORM = makeUninternedSymbol("FORM");
  public static final SubLSymbol $sym93$DEFMACRO_PROTECTED = makeSymbol("DEFMACRO-PROTECTED");
  public static final SubLSymbol $sym94$API_SPECIAL_DEFMACRO_PROTECTED = makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED");
  public static final SubLSymbol $sym95$API_SPECIAL_DEFMACRO_PROTECTED_VERIFY = makeSymbol("API-SPECIAL-DEFMACRO-PROTECTED-VERIFY");
  public static final SubLList $list96 = list(list(makeSymbol("NAME")), makeSymbol("&BODY"), makeSymbol("SLOTS"));
  public static final SubLSymbol $sym97$DEFSTRUCT = makeSymbol("DEFSTRUCT");
  public static final SubLSymbol $sym98$API_SPECIAL_DEFSTRUCT = makeSymbol("API-SPECIAL-DEFSTRUCT");
  public static final SubLList $list99 = list(list(makeSymbol("NAME"), makeSymbol("&BODY"), makeSymbol("SLOTS")));
  public static final SubLSymbol $sym100$API_SPECIAL_DEFSTRUCT_VERIFY = makeSymbol("API-SPECIAL-DEFSTRUCT-VERIFY");
  public static final SubLSymbol $sym101$DEFSTRUCT_VECTOR = makeSymbol("DEFSTRUCT-VECTOR");
  public static final SubLList $list102 = list(makeSymbol("SYMBOL"));
  public static final SubLSymbol $sym103$FI_GET_PARAMETER = makeSymbol("FI-GET-PARAMETER");
  public static final SubLSymbol $sym104$API_SPECIAL_FI_GET_PARAMETER = makeSymbol("API-SPECIAL-FI-GET-PARAMETER");
  public static final SubLSymbol $sym105$API_SPECIAL_FI_GET_PARAMETER_VERIFY = makeSymbol("API-SPECIAL-FI-GET-PARAMETER-VERIFY");
  public static final SubLList $list106 = list(makeSymbol("SYMBOL"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym107$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLSymbol $sym108$API_SPECIAL_DEFVAR = makeSymbol("API-SPECIAL-DEFVAR");
  public static final SubLSymbol $sym109$API_SPECIAL_DEFVAR_VERIFY = makeSymbol("API-SPECIAL-DEFVAR-VERIFY");
  public static final SubLSymbol $sym110$DEFVAR_PRIVATE = makeSymbol("DEFVAR-PRIVATE");
  public static final SubLSymbol $sym111$API_SPECIAL_DEFVAR_PRIVATE = makeSymbol("API-SPECIAL-DEFVAR-PRIVATE");
  public static final SubLSymbol $sym112$API_SPECIAL_DEFVAR_PRIVATE_VERIFY = makeSymbol("API-SPECIAL-DEFVAR-PRIVATE-VERIFY");
  public static final SubLSymbol $sym113$CLEAR_API_USER_VARIABLES = makeSymbol("CLEAR-API-USER-VARIABLES");
  public static final SubLString $str114$Removes_all_user_variables_ = makeString("Removes all user variables.");
  public static final SubLList $list115 = list(NIL);
  public static final SubLSymbol $sym116$PUT_API_USER_VARIABLE = makeSymbol("PUT-API-USER-VARIABLE");
  public static final SubLList $list117 = list(makeSymbol("VAR"), makeSymbol("VALUE"));
  public static final SubLString $str118$Sets_the_value_of_a_the_user_vari = makeString("Sets the value of a the user variable VAR to the given VALUE.");
  public static final SubLSymbol $sym119$GET_API_USER_VARIABLE = makeSymbol("GET-API-USER-VARIABLE");
  public static final SubLList $list120 = list(makeSymbol("VAR"));
  public static final SubLString $str121$Gets_the_value_of_a_the_user_vari = makeString("Gets the value of a the user variable VAR.");
  public static final SubLSymbol $sym122$FI_SET_PARAMETER = makeSymbol("FI-SET-PARAMETER");
  public static final SubLSymbol $sym123$API_SPECIAL_FI_SET_PARAMETER = makeSymbol("API-SPECIAL-FI-SET-PARAMETER");
  public static final SubLSymbol $sym124$API_SPECIAL_FI_SET_PARAMETER_VERIFY = makeSymbol("API-SPECIAL-FI-SET-PARAMETER-VERIFY");
  public static final SubLList $list125 = list(makeSymbol("VAR"), makeSymbol("VALUE"), makeSymbol("&REST"), makeSymbol("VAR-VALUE-PAIRS"));
  public static final SubLSymbol $sym126$API_SPECIAL_CSETQ = makeSymbol("API-SPECIAL-CSETQ");
  public static final SubLSymbol $sym127$API_SPECIAL_CSETQ_VERIFY = makeSymbol("API-SPECIAL-CSETQ-VERIFY");
  public static final SubLString $str128$_S_is_not_a_symbol = makeString("~S is not a symbol");
  public static final SubLString $str129$_S_is_not_defined = makeString("~S is not defined");
  public static final SubLList $list130 = list(makeSymbol("X"), makeSymbol("&OPTIONAL"), list(makeSymbol("DELTA"), ONE_INTEGER));
  public static final SubLString $str131$_S_is_not_an_api_variable = makeString("~S is not an api variable");
  public static final SubLSymbol $sym132$CINC = makeSymbol("CINC");
  public static final SubLSymbol $sym133$API_SPECIAL_CINC = makeSymbol("API-SPECIAL-CINC");
  public static final SubLSymbol $sym134$API_SPECIAL_CINC_VERIFY = makeSymbol("API-SPECIAL-CINC-VERIFY");
  public static final SubLSymbol $sym135$CDEC = makeSymbol("CDEC");
  public static final SubLSymbol $sym136$API_SPECIAL_CDEC = makeSymbol("API-SPECIAL-CDEC");
  public static final SubLSymbol $sym137$API_SPECIAL_CDEC_VERIFY = makeSymbol("API-SPECIAL-CDEC-VERIFY");
  public static final SubLList $list138 = list(makeSymbol("ITEM"), makeSymbol("PLACE"));
  public static final SubLSymbol $sym139$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym140$API_SPECIAL_CPUSH = makeSymbol("API-SPECIAL-CPUSH");
  public static final SubLSymbol $sym141$API_SPECIAL_CPUSH_VERIFY = makeSymbol("API-SPECIAL-CPUSH-VERIFY");
  public static final SubLList $list142 = list(makeSymbol("PLACE"));
  public static final SubLSymbol $sym143$CPOP = makeSymbol("CPOP");
  public static final SubLSymbol $sym144$API_SPECIAL_CPOP = makeSymbol("API-SPECIAL-CPOP");
  public static final SubLSymbol $sym145$API_SPECIAL_CPOP_VERIFY = makeSymbol("API-SPECIAL-CPOP-VERIFY");
  public static final SubLList $list146 = list(makeSymbol("FORM"));
  public static final SubLSymbol $sym147$API_SPECIAL_EVAL = makeSymbol("API-SPECIAL-EVAL");
  public static final SubLSymbol $sym148$EVAL_IN_API = makeSymbol("EVAL-IN-API");
  public static final SubLSymbol $sym149$API_SPECIAL_EVAL_IN_API_VERIFY = makeSymbol("API-SPECIAL-EVAL-IN-API-VERIFY");
  public static final SubLSymbol $sym150$FI_EVAL = makeSymbol("FI-EVAL");
  public static final SubLSymbol $sym151$API_SPECIAL_FI_EVAL = makeSymbol("API-SPECIAL-FI-EVAL");
  public static final SubLSymbol $sym152$API_SPECIAL_FI_EVAL_VERIFY = makeSymbol("API-SPECIAL-FI-EVAL-VERIFY");
  public static final SubLSymbol $sym153$FI_LOCAL_EVAL = makeSymbol("FI-LOCAL-EVAL");
  public static final SubLSymbol $sym154$API_SPECIAL_FI_LOCAL_EVAL = makeSymbol("API-SPECIAL-FI-LOCAL-EVAL");
  public static final SubLSymbol $sym155$API_SPECIAL_FI_LOCAL_EVAL_VERIFY = makeSymbol("API-SPECIAL-FI-LOCAL-EVAL-VERIFY");
  public static final SubLList $list156 = list(makeSymbol("FUNCTION"), makeSymbol("ARGUMENT"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));
  public static final SubLSymbol $sym157$APPLY = makeSymbol("APPLY");
  public static final SubLSymbol $sym158$API_SPECIAL_APPLY = makeSymbol("API-SPECIAL-APPLY");
  public static final SubLSymbol $sym159$API_SPECIAL_APPLY_VERIFY = makeSymbol("API-SPECIAL-APPLY-VERIFY");
  public static final SubLList $list160 = list(makeSymbol("FUNCTION"));
  public static final SubLSymbol $sym161$FBOUNDP = makeSymbol("FBOUNDP");
  public static final SubLSymbol $sym162$API_SPECIAL_FBOUNDP = makeSymbol("API-SPECIAL-FBOUNDP");
  public static final SubLSymbol $sym163$API_SPECIAL_FBOUNDP_VERIFY = makeSymbol("API-SPECIAL-FBOUNDP-VERIFY");
  public static final SubLList $list164 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));
  public static final SubLSymbol $sym165$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLSymbol $sym166$API_SPECIAL_FUNCALL = makeSymbol("API-SPECIAL-FUNCALL");
  public static final SubLSymbol $sym167$API_SPECIAL_FUNCALL_VERIFY = makeSymbol("API-SPECIAL-FUNCALL-VERIFY");
  public static final SubLSymbol $sym168$API_SPECIAL_MULTIPLE_VALUE_LIST = makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST");
  public static final SubLSymbol $sym169$API_SPECIAL_MULTIPLE_VALUE_LIST_VERIFY = makeSymbol("API-SPECIAL-MULTIPLE-VALUE-LIST-VERIFY");
  public static final SubLSymbol $sym170$TRACE = makeSymbol("TRACE");
  public static final SubLSymbol $sym171$API_SPECIAL_TRACE = makeSymbol("API-SPECIAL-TRACE");
  public static final SubLSymbol $sym172$API_SPECIAL_TRACE_VERIFY = makeSymbol("API-SPECIAL-TRACE-VERIFY");
  public static final SubLSymbol $sym173$UNTRACE = makeSymbol("UNTRACE");
  public static final SubLSymbol $sym174$API_SPECIAL_UNTRACE = makeSymbol("API-SPECIAL-UNTRACE");
  public static final SubLSymbol $sym175$API_SPECIAL_UNTRACE_VERIFY = makeSymbol("API-SPECIAL-UNTRACE-VERIFY");
  public static final SubLString $str176$__ = makeString("~%");
  public static final SubLString $str177$_A_D___S__ = makeString("~A~D: ~S~%");
  public static final SubLString $str178$ = makeString("");
  public static final SubLString $str179$_S_ = makeString("~S ");
  public static final SubLString $str180$_A_D__returned__A__ = makeString("~A~D: returned ~A~%");
  public static final SubLSymbol $sym181$GET_TRACE_LOG = makeSymbol("GET-TRACE-LOG");
  public static final SubLSymbol $sym182$API_SPECIAL_GET_TRACE_LOG = makeSymbol("API-SPECIAL-GET-TRACE-LOG");
  public static final SubLSymbol $sym183$API_SPECIAL_GET_TRACE_LOG_VERIFY = makeSymbol("API-SPECIAL-GET-TRACE-LOG-VERIFY");
  public static final SubLSymbol $sym184$CLEAR_TRACE_LOG = makeSymbol("CLEAR-TRACE-LOG");
  public static final SubLSymbol $sym185$API_SPECIAL_CLEAR_TRACE_LOG = makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG");
  public static final SubLSymbol $sym186$API_SPECIAL_CLEAR_TRACE_LOG_VERIFY = makeSymbol("API-SPECIAL-CLEAR-TRACE-LOG-VERIFY");
  public static final SubLSymbol $sym187$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym188$API_SPECIAL_PROGN = makeSymbol("API-SPECIAL-PROGN");
  public static final SubLSymbol $sym189$API_SPECIAL_PROGN_VERIFY = makeSymbol("API-SPECIAL-PROGN-VERIFY");
  public static final SubLList $list190 = list(makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym191$API_SPECIAL_CLET = makeSymbol("API-SPECIAL-CLET");
  public static final SubLString $str192$clet_error = makeString("clet error");
  public static final SubLSymbol $sym193$API_SPECIAL_CLET_VERIFY = makeSymbol("API-SPECIAL-CLET-VERIFY");
  public static final SubLList $list194 = list(makeSymbol("BINDING"), makeSymbol("&REST"), makeSymbol("REST-BINDINGS"));
  public static final SubLList $list195 = list(makeSymbol("VARS"), makeSymbol("VALUES-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym196$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym197$API_SPECIAL_CMULTIPLE_VALUE_BIND = makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym198$API_SPECIAL_CMULTIPLE_VALUE_BIND_VERIFY = makeSymbol("API-SPECIAL-CMULTIPLE-VALUE-BIND-VERIFY");
  public static final SubLSymbol $sym199$CAND = makeSymbol("CAND");
  public static final SubLSymbol $sym200$API_SPECIAL_CAND = makeSymbol("API-SPECIAL-CAND");
  public static final SubLSymbol $sym201$API_SPECIAL_CAND_VERIFY = makeSymbol("API-SPECIAL-CAND-VERIFY");
  public static final SubLSymbol $sym202$COR = makeSymbol("COR");
  public static final SubLSymbol $sym203$API_SPECIAL_COR = makeSymbol("API-SPECIAL-COR");
  public static final SubLSymbol $sym204$API_SPECIAL_COR_VERIFY = makeSymbol("API-SPECIAL-COR-VERIFY");
  public static final SubLSymbol $sym205$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym206$API_SPECIAL_CNOT = makeSymbol("API-SPECIAL-CNOT");
  public static final SubLSymbol $sym207$API_SPECIAL_CNOT_VERIFY = makeSymbol("API-SPECIAL-CNOT-VERIFY");
  public static final SubLList $list208 = list(makeSymbol("CONDITION"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym209$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym210$API_SPECIAL_PCOND = makeSymbol("API-SPECIAL-PCOND");
  public static final SubLSymbol $sym211$API_SPECIAL_PCOND_VERIFY = makeSymbol("API-SPECIAL-PCOND-VERIFY");
  public static final SubLList $list212 = list(makeSymbol("CONDITION"), makeSymbol("ACTION"), makeSymbol("ELSE-ACTION"));
  public static final SubLSymbol $sym213$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym214$API_SPECIAL_PIF = makeSymbol("API-SPECIAL-PIF");
  public static final SubLSymbol $sym215$API_SPECIAL_PIF_VERIFY = makeSymbol("API-SPECIAL-PIF-VERIFY");
  public static final SubLSymbol $sym216$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym217$API_SPECIAL_FIF = makeSymbol("API-SPECIAL-FIF");
  public static final SubLSymbol $sym218$API_SPECIAL_FIF_VERIFY = makeSymbol("API-SPECIAL-FIF-VERIFY");
  public static final SubLSymbol $sym219$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym220$API_SPECIAL_PWHEN = makeSymbol("API-SPECIAL-PWHEN");
  public static final SubLSymbol $sym221$API_SPECIAL_PWHEN_VERIFY = makeSymbol("API-SPECIAL-PWHEN-VERIFY");
  public static final SubLList $list222 = list(makeSymbol("CONDITION"), makeSymbol("ACTION"));
  public static final SubLSymbol $sym223$WHEN = makeSymbol("WHEN");
  public static final SubLSymbol $sym224$API_SPECIAL_WHEN = makeSymbol("API-SPECIAL-WHEN");
  public static final SubLSymbol $sym225$API_SPECIAL_WHEN_VERIFY = makeSymbol("API-SPECIAL-WHEN-VERIFY");
  public static final SubLSymbol $sym226$FWHEN = makeSymbol("FWHEN");
  public static final SubLSymbol $sym227$API_SPECIAL_FWHEN = makeSymbol("API-SPECIAL-FWHEN");
  public static final SubLSymbol $sym228$API_SPECIAL_FWHEN_VERIFY = makeSymbol("API-SPECIAL-FWHEN-VERIFY");
  public static final SubLSymbol $sym229$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym230$API_SPECIAL_PUNLESS = makeSymbol("API-SPECIAL-PUNLESS");
  public static final SubLSymbol $sym231$API_SPECIAL_PUNLESS_VERIFY = makeSymbol("API-SPECIAL-PUNLESS-VERIFY");
  public static final SubLSymbol $sym232$FUNLESS = makeSymbol("FUNLESS");
  public static final SubLSymbol $sym233$API_SPECIAL_FUNLESS = makeSymbol("API-SPECIAL-FUNLESS");
  public static final SubLSymbol $sym234$API_SPECIAL_FUNLESS_VERIFY = makeSymbol("API-SPECIAL-FUNLESS-VERIFY");
  public static final SubLSymbol $sym235$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym236$API_SPECIAL_WHILE = makeSymbol("API-SPECIAL-WHILE");
  public static final SubLSymbol $sym237$API_SPECIAL_WHILE_VERIFY = makeSymbol("API-SPECIAL-WHILE-VERIFY");
  public static final SubLSymbol $sym238$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym239$API_SPECIAL_UNTIL = makeSymbol("API-SPECIAL-UNTIL");
  public static final SubLSymbol $sym240$API_SPECIAL_UNTIL_VERIFY = makeSymbol("API-SPECIAL-UNTIL-VERIFY");
  public static final SubLList $list241 = list(makeSymbol("VARS"), makeSymbol("ENDTEST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str242$_S_is_not_a_valid_cdo_variable_sp = makeString("~S is not a valid cdo variable specification in SubL");
  public static final SubLSymbol $sym243$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym244$API_SPECIAL_CDO = makeSymbol("API-SPECIAL-CDO");
  public static final SubLSymbol $sym245$API_SPECIAL_CDO_VERIFY = makeSymbol("API-SPECIAL-CDO-VERIFY");
  public static final SubLList $list246 = list(list(makeSymbol("VARIABLE"), makeSymbol("LISTFORM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym247$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym248$API_SPECIAL_CDOLIST = makeSymbol("API-SPECIAL-CDOLIST");
  public static final SubLSymbol $sym249$API_SPECIAL_CDOLIST_VERIFY = makeSymbol("API-SPECIAL-CDOLIST-VERIFY");
  public static final SubLList $list250 = list(list(makeSymbol("VARIABLE"), makeSymbol("INTEGER")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym251$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLSymbol $sym252$API_SPECIAL_CDOTIMES = makeSymbol("API-SPECIAL-CDOTIMES");
  public static final SubLSymbol $sym253$API_SPECIAL_CDOTIMES_VERIFY = makeSymbol("API-SPECIAL-CDOTIMES-VERIFY");
  public static final SubLList $list254 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym255$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLSymbol $sym256$API_SPECIAL_CDOHASH = makeSymbol("API-SPECIAL-CDOHASH");
  public static final SubLSymbol $sym257$API_SPECIAL_CDOHASH_VERIFY = makeSymbol("API-SPECIAL-CDOHASH-VERIFY");
  public static final SubLList $list258 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("LISTS"));
  public static final SubLSymbol $sym259$MAPCAR = makeSymbol("MAPCAR");
  public static final SubLSymbol $sym260$API_SPECIAL_MAPCAR = makeSymbol("API-SPECIAL-MAPCAR");
  public static final SubLSymbol $sym261$API_SPECIAL_MAPCAR_VERIFY = makeSymbol("API-SPECIAL-MAPCAR-VERIFY");
  public static final SubLString $str262$_S_does_not_evaluate_to_an_api_fu = makeString("~S does not evaluate to an api function object");
  public static final SubLSymbol $sym263$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym264$EVAL_IN_API_MAPCAR = makeSymbol("EVAL-IN-API-MAPCAR");
  public static final SubLSymbol $sym265$REST = makeSymbol("REST");
  public static final SubLList $list266 = list(makeSymbol("DICT"), makeSymbol("FUNC"));
  public static final SubLSymbol $sym267$MAPDICTIONARY = makeSymbol("MAPDICTIONARY");
  public static final SubLSymbol $sym268$API_SPECIAL_MAPDICTIONARY = makeSymbol("API-SPECIAL-MAPDICTIONARY");
  public static final SubLSymbol $sym269$API_SPECIAL_MAPDICTIONARY_VERIFY = makeSymbol("API-SPECIAL-MAPDICTIONARY-VERIFY");
  public static final SubLSymbol $kw270$ALIST = makeKeyword("ALIST");
  public static final SubLSymbol $kw271$HASHTABLE = makeKeyword("HASHTABLE");
  public static final SubLString $str272$Corrupted_dictionary__unsupported = makeString("Corrupted dictionary; unsupported style ~S.~%");
  public static final SubLList $list273 = list(makeSymbol("DICT"), makeSymbol("FUNC"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym274$MAPDICTIONARY_PARAMETERIZED = makeSymbol("MAPDICTIONARY-PARAMETERIZED");
  public static final SubLSymbol $sym275$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED = makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED");
  public static final SubLSymbol $sym276$API_SPECIAL_MAPDICTIONARY_PARAMETERIZED_VERIFY = makeSymbol("API-SPECIAL-MAPDICTIONARY-PARAMETERIZED-VERIFY");
  public static final SubLString $str277$evaluated_dict = makeString("evaluated-dict");
  public static final SubLString $str278$evaluated_func = makeString("evaluated-func");
  public static final SubLString $str279$evaluated_args = makeString("evaluated-args");
  public static final SubLList $list280 = list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym281$CCATCH = makeSymbol("CCATCH");
  public static final SubLSymbol $sym282$API_SPECIAL_CCATCH = makeSymbol("API-SPECIAL-CCATCH");
  public static final SubLSymbol $sym283$API_SPECIAL_CCATCH_VERIFY = makeSymbol("API-SPECIAL-CCATCH-VERIFY");
  public static final SubLList $list284 = list(makeSymbol("ANSWER-VARIABLE"));
  public static final SubLSymbol $sym285$ANSWER_VARIABLE = makeSymbol("ANSWER-VARIABLE");
  public static final SubLSymbol $sym286$EVAL_IN_API_CSETQ = makeSymbol("EVAL-IN-API-CSETQ");
  public static final SubLList $list287 = list(makeSymbol("TAG"), makeSymbol("RESULT"));
  public static final SubLSymbol $sym288$THROW = makeSymbol("THROW");
  public static final SubLSymbol $sym289$API_SPECIAL_THROW = makeSymbol("API-SPECIAL-THROW");
  public static final SubLSymbol $sym290$API_SPECIAL_THROW_VERIFY = makeSymbol("API-SPECIAL-THROW-VERIFY");
  public static final SubLSymbol $sym291$EVAL_IN_API_INTERNAL = makeSymbol("EVAL-IN-API-INTERNAL");
  public static final SubLSymbol $sym292$IGNORE_ERRORS = makeSymbol("IGNORE-ERRORS");
  public static final SubLSymbol $sym293$API_SPECIAL_IGNORE_ERRORS = makeSymbol("API-SPECIAL-IGNORE-ERRORS");
  public static final SubLSymbol $sym294$API_SPECIAL_IGNORE_ERRORS_VERIFY = makeSymbol("API-SPECIAL-IGNORE-ERRORS-VERIFY");
  public static final SubLList $list295 = list(makeSymbol("LOCAL-RESULTS"));
  public static final SubLSymbol $sym296$LOCAL_RESULTS = makeSymbol("LOCAL-RESULTS");
  public static final SubLList $list297 = list(makeSymbol("PROTECTED-FORM"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym298$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLSymbol $sym299$API_SPECIAL_CUNWIND_PROTECT = makeSymbol("API-SPECIAL-CUNWIND-PROTECT");
  public static final SubLSymbol $sym300$API_SPECIAL_CUNWIND_PROTECT_VERIFY = makeSymbol("API-SPECIAL-CUNWIND-PROTECT-VERIFY");
  public static final SubLSymbol $sym301$_ = makeSymbol(">");
  public static final SubLList $list302 = list(makeSymbol("LENGTH"), makeSymbol("*EVAL-IN-API-ENV*"));
  public static final SubLList $list303 = list(list(makeSymbol("CPOP"), makeSymbol("*EVAL-IN-API-ENV*")));
  public static final SubLString $str304$eval_in_api_cunwind_protect = makeString("eval-in-api-cunwind-protect");
  public static final SubLList $list305 = list(makeSymbol("FILENAME"));
  public static final SubLSymbol $sym306$LOAD = makeSymbol("LOAD");
  public static final SubLSymbol $sym307$API_SPECIAL_LOAD = makeSymbol("API-SPECIAL-LOAD");
  public static final SubLSymbol $sym308$API_SPECIAL_LOAD_VERIFY = makeSymbol("API-SPECIAL-LOAD-VERIFY");
  public static final SubLSymbol $sym309$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw310$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw311$INPUT = makeKeyword("INPUT");
  public static final SubLSymbol $kw312$IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");
  public static final SubLString $str313$_S_does_not_exist__cannot_load = makeString("~S does not exist, cannot load");
  public static final SubLSymbol $kw314$EOF = makeKeyword("EOF");
  public static final SubLSymbol $kw315$ERROR = makeKeyword("ERROR");
  public static final SubLString $str316$__Read_error_occured_at_position_ = makeString("~%Read error occured at position ~A of file ~A");
  public static final SubLList $list317 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));
  public static final SubLString $str318$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym319$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLSymbol $sym320$API_SPECIAL_CHECK_TYPE = makeSymbol("API-SPECIAL-CHECK-TYPE");
  public static final SubLSymbol $sym321$API_SPECIAL_CHECK_TYPE_VERIFY = makeSymbol("API-SPECIAL-CHECK-TYPE-VERIFY");
  public static final SubLSymbol $sym322$API_SPECIAL_QUOTE = makeSymbol("API-SPECIAL-QUOTE");
  public static final SubLSymbol $sym323$API_SPECIAL_QUOTE_VERIFY = makeSymbol("API-SPECIAL-QUOTE-VERIFY");
  public static final SubLSymbol $sym324$BOUNDP = makeSymbol("BOUNDP");
  public static final SubLSymbol $sym325$API_SPECIAL_BOUNDP = makeSymbol("API-SPECIAL-BOUNDP");
  public static final SubLSymbol $sym326$API_SPECIAL_BOUNDP_VERIFY = makeSymbol("API-SPECIAL-BOUNDP-VERIFY");
  public static final SubLSymbol $sym327$SYMBOL_VALUE = makeSymbol("SYMBOL-VALUE");
  public static final SubLSymbol $sym328$API_SPECIAL_SYMBOL_VALUE = makeSymbol("API-SPECIAL-SYMBOL-VALUE");
  public static final SubLSymbol $sym329$API_SPECIAL_SYMBOL_VALUE_VERIFY = makeSymbol("API-SPECIAL-SYMBOL-VALUE-VERIFY");
  public static final SubLList $list330 = list(makeSymbol("FNAME"));
  public static final SubLSymbol $sym331$FUNCTION = makeSymbol("FUNCTION");
  public static final SubLSymbol $sym332$API_SPECIAL_FUNCTION = makeSymbol("API-SPECIAL-FUNCTION");
  public static final SubLSymbol $sym333$API_SPECIAL_FUNCTION_VERIFY = makeSymbol("API-SPECIAL-FUNCTION-VERIFY");
  public static final SubLList $list334 = list(makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));
  public static final SubLSymbol $sym335$ERROR = makeSymbol("ERROR");
  public static final SubLSymbol $sym336$API_SPECIAL_ERROR = makeSymbol("API-SPECIAL-ERROR");
  public static final SubLSymbol $sym337$API_SPECIAL_ERROR_VERIFY = makeSymbol("API-SPECIAL-ERROR-VERIFY");
  public static final SubLString $str338$___S = makeString("~%~S");
  public static final SubLSymbol $sym339$BREAK = makeSymbol("BREAK");
  public static final SubLSymbol $sym340$API_SPECIAL_BREAK = makeSymbol("API-SPECIAL-BREAK");
  public static final SubLSymbol $sym341$API_SPECIAL_BREAK_VERIFY = makeSymbol("API-SPECIAL-BREAK-VERIFY");
  public static final SubLString $str342$Can_only_clear_the_environment_fr = makeString("Can only clear the environment from the top level");
  public static final SubLSymbol $sym343$CLEAR_ENVIRONMENT = makeSymbol("CLEAR-ENVIRONMENT");
  public static final SubLSymbol $sym344$API_SPECIAL_CLEAR_ENVIRONMENT = makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT");
  public static final SubLSymbol $sym345$API_SPECIAL_CLEAR_ENVIRONMENT_VERIFY = makeSymbol("API-SPECIAL-CLEAR-ENVIRONMENT-VERIFY");
  public static final SubLSymbol $sym346$GET_ENVIRONMENT = makeSymbol("GET-ENVIRONMENT");
  public static final SubLSymbol $sym347$API_SPECIAL_GET_ENVIRONMENT = makeSymbol("API-SPECIAL-GET-ENVIRONMENT");
  public static final SubLSymbol $sym348$API_SPECIAL_GET_ENVIRONMENT_VERIFY = makeSymbol("API-SPECIAL-GET-ENVIRONMENT-VERIFY");
  public static final SubLList $list349 = list(makeSymbol("PACKAGE"));
  public static final SubLSymbol $sym350$IN_PACKAGE = makeSymbol("IN-PACKAGE");
  public static final SubLSymbol $sym351$API_SPECIAL_IN_PACKAGE = makeSymbol("API-SPECIAL-IN-PACKAGE");
  public static final SubLSymbol $sym352$API_SPECIAL_IN_PACKAGE_VERIFY = makeSymbol("API-SPECIAL-IN-PACKAGE-VERIFY");
  public static final SubLList $list353 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym354$CTIME = makeSymbol("CTIME");
  public static final SubLSymbol $sym355$API_SPECIAL_CTIME = makeSymbol("API-SPECIAL-CTIME");
  public static final SubLSymbol $sym356$API_SPECIAL_CTIME_VERIFY = makeSymbol("API-SPECIAL-CTIME-VERIFY");
  public static final SubLSymbol $sym357$WITH_TEMP_VARS = makeSymbol("WITH-TEMP-VARS");
  public static final SubLList $list358 = list(makeSymbol("TEMP-VAR"));
  public static final SubLSymbol $sym359$TEMP_VAR = makeSymbol("TEMP-VAR");
  public static final SubLSymbol $sym360$WITH_EVAL_IN_API_ENV = makeSymbol("WITH-EVAL-IN-API-ENV");
  public static final SubLString $str361$eval_in_api_ctime = makeString("eval-in-api-ctime");
  public static final SubLList $list362 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym363$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym364$API_SPECIAL_NOTING_PERCENT_PROGRESS = makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS");
  public static final SubLSymbol $sym365$API_SPECIAL_NOTING_PERCENT_PROGRESS_VERIFY = makeSymbol("API-SPECIAL-NOTING-PERCENT-PROGRESS-VERIFY");
  public static final SubLString $str366$eval_in_api_noting_percent_progre = makeString("eval-in-api-noting-percent-progress");
  public static final SubLSymbol $sym367$NOTING_ACTIVITY = makeSymbol("NOTING-ACTIVITY");
  public static final SubLSymbol $sym368$API_SPECIAL_NOTING_ACTIVITY = makeSymbol("API-SPECIAL-NOTING-ACTIVITY");
  public static final SubLSymbol $sym369$API_SPECIAL_NOTING_ACTIVITY_VERIFY = makeSymbol("API-SPECIAL-NOTING-ACTIVITY-VERIFY");
  public static final SubLString $str370$eval_in_api_noting_activity = makeString("eval-in-api-noting-activity");
  public static final SubLSymbol $sym371$MUST = makeSymbol("MUST");

  //// Initializers

  public void declareFunctions() {
    declare_eval_in_api_file();
  }

  public void initializeVariables() {
    init_eval_in_api_file();
  }

  public void runTopLevelForms() {
    setup_eval_in_api_file();
  }

}
