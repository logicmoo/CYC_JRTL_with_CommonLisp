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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.format_nil;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.numeric_date_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.system_info;
//dm import com.cyc.cycjava_1.cycl.system_parameters;

public  final class utilities_macros extends SubLTranslatedFile {

  //// Constructor

  private utilities_macros() {}
  public static final SubLFile me = new utilities_macros();
  public static final String myName = "com.cyc.cycjava_1.cycl.utilities_macros";

  //// Definitions

  /** Register NAME as a (public) Cyc API function.
   Note its ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 4611) 
  public static final SubLObject register_cyc_api_function(SubLObject name, SubLObject arglist, SubLObject doc_string, SubLObject argument_types, SubLObject return_types) {
    register_api_predefined_function(name);
    register_cyc_api_symbol(name);
    register_cyc_api_args(name, arglist);
    register_cyc_api_function_documentation(name, doc_string);
    register_cyc_api_arg_types(name, argument_types);
    register_cyc_api_return_types(name, return_types);
    return NIL;
  }

  /** Register NAME as a (public) Cyc API macro.
   Note its PATTERN and DOC-STRING. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 5131) 
  public static final SubLObject register_cyc_api_macro(SubLObject name, SubLObject pattern, SubLObject doc_string) {
    register_api_predefined_macro(name);
    register_cyc_api_symbol(name);
    register_cyc_api_args(name, pattern);
    register_cyc_api_function_documentation(name, doc_string);
    return NIL;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 5463) 
  private static SubLSymbol $api_special_table$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 5747) 
  public static final SubLObject api_special_p(SubLObject operator) {
    return list_utilities.sublisp_boolean(Hashtables.gethash(operator, $api_special_table$.getGlobalValue(), NIL));
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 5951) 
  public static final SubLObject register_api_special(SubLObject operator, SubLObject handler) {
    if (((NIL != api_predefined_function_p(operator))
        || (NIL != api_predefined_macro_p(operator)))) {
      Errors.warn($str16$Registering__A_as_special_even_th, operator);
    } else {
      Hashtables.sethash(operator, $api_special_table$.getGlobalValue(), handler);
    }
    return operator;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 6268) 
  public static SubLSymbol $api_predefined_function_table$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 6359) 
  public static final SubLObject api_predefined_function_p(SubLObject operator) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != api_predefined_host_function_p(operator))) {
        return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
      } else {
        return Hashtables.gethash(operator, $api_predefined_function_table$.getGlobalValue(), NIL);
      }
    }
  }

  /** Permit the use of the OPERATOR function in the CYC api */
  @SubL(source = "cycl/utilities-macros.lisp", position = 6586) 
  public static final SubLObject register_api_predefined_function(SubLObject operator) {
    if ((NIL != api_special_p(operator))) {
    } else {
      Hashtables.sethash(operator, $api_predefined_function_table$.getGlobalValue(), T);
    }
    return operator;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 7077) 
  private static SubLSymbol $api_predefined_host_function_table$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 7170) 
  public static final SubLObject api_predefined_host_function_p(SubLObject operator) {
    return Hashtables.gethash(operator, $api_predefined_host_function_table$.getGlobalValue(), NIL);
  }

  /** Permit the use of the OPERATOR host function in the CYC api */
  @SubL(source = "cycl/utilities-macros.lisp", position = 7300) 
  public static final SubLObject register_api_predefined_host_function(SubLObject operator) {
    if ((NIL != api_special_p(operator))) {
    } else {
      Hashtables.sethash(operator, $api_predefined_host_function_table$.getGlobalValue(), T);
    }
    return operator;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 7810) 
  public static SubLSymbol $api_predefined_macro_table$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 7897) 
  public static final SubLObject api_predefined_macro_p(SubLObject operator) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != api_predefined_host_macro_p(operator))) {
        return system_parameters.$permit_api_host_access$.getDynamicValue(thread);
      } else {
        return Hashtables.gethash(operator, $api_predefined_macro_table$.getGlobalValue(), NIL);
      }
    }
  }

  /** Permit the use of the OPERATOR macro in the CYC api */
  @SubL(source = "cycl/utilities-macros.lisp", position = 8115) 
  public static final SubLObject register_api_predefined_macro(SubLObject operator) {
    if ((NIL != api_special_p(operator))) {
    } else {
      Hashtables.sethash(operator, $api_predefined_macro_table$.getGlobalValue(), T);
    }
    return operator;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 8577) 
  private static SubLSymbol $api_predefined_host_macro_table$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 8666) 
  public static final SubLObject api_predefined_host_macro_p(SubLObject operator) {
    return Hashtables.gethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), NIL);
  }

  /** Permit the use of the OPERATOR host-access macro in the CYC api */
  @SubL(source = "cycl/utilities-macros.lisp", position = 8790) 
  public static final SubLObject register_api_predefined_host_macro(SubLObject operator) {
    if ((NIL != api_special_p(operator))) {
    } else {
      Hashtables.sethash(operator, $api_predefined_host_macro_table$.getGlobalValue(), T);
    }
    return operator;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 9300) 
  public static SubLSymbol $api_symbols$ = null;

  /** Register the symbol NAME as a defined Cyc API function or macro. Return the NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 9549) 
  public static final SubLObject register_cyc_api_symbol(SubLObject name) {
    checkType(name, $sym25$SYMBOLP);
    Symbols.put(name, $kw24$CYC_API_SYMBOL, T);
    if ((NIL == conses_high.member(name, $api_symbols$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
      $api_symbols$.setGlobalValue(cons(name, $api_symbols$.getGlobalValue()));
    }
    return name;
  }

  /** For the symbol NAME, register the Cyc API ARGLIST since CMUCL does not
record the macro argument list.  Return the NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 10220) 
  public static final SubLObject register_cyc_api_args(SubLObject name, SubLObject arglist) {
    checkType(name, $sym25$SYMBOLP);
    checkType(arglist, $sym2$LISTP);
    Symbols.put(name, $kw26$CYC_API_ARGS, arglist);
    return name;
  }

  /** Register DOCUMENTATION-STRING as the function documentation for NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 10727) 
  public static final SubLObject register_cyc_api_function_documentation(SubLObject name, SubLObject documentation_string) {
    checkType(name, $sym25$SYMBOLP);
    checkType(documentation_string, $sym1$STRINGP);
    return NIL;
  }

  /** For the symbol NAME, register the Cyc API function argument types, which take the form
of a list of argument type expressions. Return the NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 11250) 
  public static final SubLObject register_cyc_api_arg_types(SubLObject name, SubLObject argument_type_list) {
    checkType(name, $sym25$SYMBOLP);
    checkType(argument_type_list, $sym2$LISTP);
    Symbols.put(name, $kw27$CYC_API_ARG_TYPES, argument_type_list);
    return name;
  }

  /** For the symbol NAME, register the Cyc API function return types. Return the
NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 12047) 
  public static final SubLObject register_cyc_api_return_types(SubLObject name, SubLObject return_types) {
    checkType(name, $sym25$SYMBOLP);
    checkType(return_types, $sym2$LISTP);
    {
      SubLObject cdolist_list_var = return_types;
      SubLObject return_type = NIL;
      for (return_type = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), return_type = cdolist_list_var.first()) {
        validate_return_type(return_type);
      }
    }
    Symbols.put(name, $kw28$CYC_API_RETURN_TYPES, return_types);
    return name;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 12648) 
  public static SubLSymbol $api_types$ = null;

  /** Ensure that each symbol denoting a predicate in the RETURN-TYPE expression
   is recorded as an api type function. Return T if OK, otherwise signal an error. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 15320) 
  public static final SubLObject validate_return_type(SubLObject return_type) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (return_type.isAtom()) {
        if ((NIL == conses_high.member(return_type, $api_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
          $api_types$.setGlobalValue(cons(return_type, $api_types$.getGlobalValue()));
        }
        return T;
      }
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((!(Sequences.length(return_type).eql(TWO_INTEGER)))) {
          Errors.error($str38$_S_return_type_expression_not_lis, return_type);
        }
      }
      if ((NIL != conses_high.member(return_type.first(), $list39, UNPROVIDED, UNPROVIDED))) {
        return validate_return_type(conses_high.second(return_type));
      }
      Errors.error($str40$_S_complex_return_type_expression, return_type);
      return T;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 18322) 
  private static SubLSymbol $kb_function_table$ = null;

  /** Note that SYMBOL is expected to be a symbol referenced by the KB. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 18543) 
  public static final SubLObject register_kb_symbol(SubLObject symbol) {
    checkType(symbol, $sym25$SYMBOLP);
    Hashtables.sethash(symbol, $kb_function_table$.getGlobalValue(), T);
    return symbol;
  }

  /** Note that SYMBOL is expected to be a function symbol referenced by the KB. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 19326) 
  public static final SubLObject register_kb_function(SubLObject function_symbol) {
    return register_kb_symbol(function_symbol);
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 21453) 
  private static SubLSymbol $funcall_helper_property$ = null;

  /** Note that SYMBOL has been defined via DEFINE-PRIVATE-FUNCALL */
  @SubL(source = "cycl/utilities-macros.lisp", position = 21516) 
  public static final SubLObject note_funcall_helper_function(SubLObject symbol) {
    Symbols.put(symbol, $funcall_helper_property$.getGlobalValue(), T);
    return T;
  }

  /** A unique marker which can be used as a default optional argument to indicate that no argument
was explicitly provided.  The ONLY references to this variable should be as the default
value for an argument in the formal arguments for a function. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 21911) 
  public static SubLSymbol $unprovided$ = null;

  /** Return T iff ARG indicates that it wsa an unprovided argument to a function call. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 22402) 
  public static final SubLObject unprovided_argumentP(SubLObject arg) {
    return Equality.eq(arg, $unprovided$.getGlobalValue());
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 23435) 
  public static final SubLObject declare_control_parameter_internal(SubLObject variable, SubLObject fancy_name, SubLObject description, SubLObject settings_spec) {
    checkType(variable, $sym25$SYMBOLP);
    checkType(fancy_name, $sym1$STRINGP);
    checkType(description, $sym1$STRINGP);
    Symbols.put(variable, $kw72$FANCY_NAME, fancy_name);
    Symbols.put(variable, $kw73$DESCRIPTION, description);
    Symbols.put(variable, $kw74$SETTINGS_SPEC, settings_spec);
    return variable;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 23929) 
  public static final SubLObject mapping_finished() {
    Dynamic.sublisp_throw($kw76$MAPPING_DONE, NIL);
    return NIL;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 24186) 
  public static SubLSymbol $cfasl_stream$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 25575) 
  private static SubLSymbol $global_locks$ = null;

  /** Initialize all global locks */
  @SubL(source = "cycl/utilities-macros.lisp", position = 25614) 
  public static final SubLObject initialize_global_locks() {
    {
      SubLObject cdolist_list_var = $global_locks$.getGlobalValue();
      SubLObject pair = NIL;
      for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
        {
          SubLObject datum = pair;
          SubLObject current = datum;
          SubLObject global = NIL;
          SubLObject name = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list99);
          global = current.first();
          current = current.rest();
          name = current;
          initialize_global_lock_internal(global, name);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 25838) 
  public static final SubLObject register_global_lock(SubLObject global, SubLObject name) {
    checkType(global, $sym25$SYMBOLP);
    checkType(name, $sym1$STRINGP);
    $global_locks$.setGlobalValue(Sequences.delete(global, $global_locks$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function($sym100$CAR), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    $global_locks$.setGlobalValue(cons(cons(global, name), $global_locks$.getGlobalValue()));
    return $global_locks$.getGlobalValue();
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 26284) 
  public static final SubLObject global_lock_initialization_form(SubLObject name) {
    checkType(name, $sym1$STRINGP);
    return list($sym101$MAKE_LOCK, name);
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 26644) 
  public static final SubLObject initialize_global_lock_internal(SubLObject global, SubLObject name) {
    {
      SubLObject init_form = global_lock_initialization_form(name);
      Eval.eval(list($sym105$CSETQ, global, init_form));
    }
    return Symbols.symbol_value(global);
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 26885) 
  public static SubLSymbol $fi_state_variables$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 29869) 
  public static final SubLObject note_state_variable_documentation(SubLObject variable, SubLObject documentation) {
    Symbols.put(variable, $kw122$VARIABLE_DOC, documentation);
    return variable;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 30938) 
  public static SubLSymbol $gt_state_variables$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 31174) 
  public static SubLSymbol $at_state_variables$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 31402) 
  public static SubLSymbol $defn_state_variables$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 31888) 
  public static SubLSymbol $kbp_state_variables$ = null;

  /** The current problem store in use for forward inference. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 33648) 
  public static SubLSymbol $current_forward_problem_store$ = null;

  /** A more strict version of (within-forward-inference?) that returns NIL when we're in a special forward inference mode. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 34914) 
  public static final SubLObject within_normal_forward_inferenceP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean(((NIL != kb_control_vars.within_forward_inferenceP())
             && (NIL == kb_control_vars.$within_assertion_forward_propagationP$.getDynamicValue(thread))
             && (NIL == control_vars.$prefer_forward_skolemization$.getDynamicValue(thread))));
    }
  }

  /** An alist of things to trace and the level at which they should be traced.
Current items are :CYCL, :PLANNER, and :EXECUTOR.  A level of NIL or 0 means
don't print out any tracing information.  Higher numbers mean do more tracing. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 35694) 
  public static SubLSymbol $tracing_level$ = null;

  /** Controls whether or not a free list is maintained and used
for a structure resource declared via DEFINE-STRUCTURE-RESOURCE. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 36324) 
  public static SubLSymbol $structure_resourcing_enabled$ = null;

  /** Controls whether or not any new structure is statically allocated
for a structure resource declared via DEFINE-STRUCTURE-RESOURCE. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 36581) 
  public static SubLSymbol $structure_resourcing_make_static$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 40985) 
  public static SubLSymbol $silent_progressP$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 41175) 
  public static SubLSymbol $noting_progress_start_time$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 41462) 
  public static final SubLObject noting_progress_preamble(SubLObject string) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $silent_progressP$.getDynamicValue(thread))) {
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), $str213$___A, string);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 41671) 
  public static final SubLObject noting_progress_postamble() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $silent_progressP$.getDynamicValue(thread))) {
        {
          SubLObject elapsed = subl_promotions.elapsed_universal_time($noting_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
          streams_high.write_string($str215$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.write_string($str216$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
          streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 42172) 
  public static SubLSymbol $last_percent_progress_index$ = null;

  /** Bound to the latest prediction we made about how long the process will take,
 or NIL if we haven't made such a prediction. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 42217) 
  public static SubLSymbol $last_percent_progress_prediction$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 42446) 
  public static SubLSymbol $within_noting_percent_progress$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 42492) 
  public static SubLSymbol $percent_progress_start_time$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 42900) 
  public static final SubLObject noting_percent_progress_preamble(SubLObject string) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $silent_progressP$.getDynamicValue(thread))) {
        PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), $str221$___A____, string);
        streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 43129) 
  public static final SubLObject noting_percent_progress_postamble() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == $silent_progressP$.getDynamicValue(thread))) {
        {
          SubLObject elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
          streams_high.write_string($str215$_DONE__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.write_string(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          if (elapsed.numG($int223$600)) {
            PrintLow.format(StreamsLow.$standard_output$.getDynamicValue(thread), $str224$__ended__A, Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23127"));
          }
          streams_high.write_string($str225$___, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
          streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 43832) 
  public static final SubLObject note_percent_progress(SubLObject index, SubLObject max) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((!(((NIL != $silent_progressP$.getDynamicValue(thread))
            || (NIL == $within_noting_percent_progress$.getDynamicValue(thread)))))) {
        if ((NIL != index)) {
          {
            SubLObject percent = compute_percent_progress(index, max);
            if (percent.numG($last_percent_progress_index$.getDynamicValue(thread))) {
              {
                SubLObject elapsed = subl_promotions.elapsed_universal_time($percent_progress_start_time$.getDynamicValue(thread), UNPROVIDED);
                SubLObject predicted_total_seconds = Numbers.truncate(Numbers.multiply(elapsed, $int20$100), percent);
                if (((percent.numE(ONE_INTEGER)
                      || index.numE(ONE_INTEGER))
                     && predicted_total_seconds.numGE(Numbers.multiply(FIVE_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())))) {
                  streams_high.write_string($str227$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                  possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int228$300, $int223$600);
                } else if (((percent.numE(TWO_INTEGER)
                      || index.numE(TWO_INTEGER))
                     && predicted_total_seconds.numGE(Numbers.multiply(TEN_INTEGER, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())))) {
                  streams_high.write_string($str227$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                  possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int228$300, $int223$600);
                } else if (predicted_total_seconds.numLE(FIVE_INTEGER)) {
                } else if (Numbers.mod(percent, TEN_INTEGER).numE(ZERO_INTEGER)) {
                  print_progress_percent(percent);
                  possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, $int223$600, $int229$1200);
                } else if (max.numL($int230$60)) {
                  streams_high.write_string($str227$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                } else if (predicted_total_seconds.numLE(TWENTY_INTEGER)) {
                } else {
                  if (Numbers.mod(percent, TWO_INTEGER).numE(ZERO_INTEGER)) {
                    streams_high.write_string($str227$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                  }
                  if ($last_percent_progress_prediction$.getDynamicValue(thread).isNumber()) {
                    {
                      SubLObject threshold = Numbers.add($last_percent_progress_prediction$.getDynamicValue(thread), Numbers.integerDivide($last_percent_progress_prediction$.getDynamicValue(thread), TEN_INTEGER));
                      if (predicted_total_seconds.numG(threshold)) {
                        print_progress_percent(percent);
                        possibly_note_percent_progress_prediction(elapsed, predicted_total_seconds, threshold, $int229$1200);
                      }
                    }
                  }
                }
              }
              streams_high.force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
              $last_percent_progress_index$.setDynamicValue(percent, thread);
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 45961) 
  public static final SubLObject print_progress_percent(SubLObject percent) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      streams_high.write_string($str231$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
      print_2_digit_nonnegative_integer(percent, StreamsLow.$standard_output$.getDynamicValue(thread));
      streams_high.write_string($str232$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 46278) 
  public static final SubLObject print_2_digit_nonnegative_integer(SubLObject integer, SubLObject stream) {
    if (integer.numL(TEN_INTEGER)) {
      streams_high.write_string($str233$0, stream, UNPROVIDED, UNPROVIDED);
    }
    streams_high.write_string(print_high.princ_to_string(integer), stream, UNPROVIDED, UNPROVIDED);
    return integer;
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 46470) 
  public static final SubLObject possibly_note_percent_progress_prediction(SubLObject elapsed, SubLObject predicted_total_seconds, SubLObject threshhold, SubLObject show_ending_threshold) {
    if ((show_ending_threshold == UNPROVIDED)) {
      show_ending_threshold = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((predicted_total_seconds.numG(threshhold)
           && predicted_total_seconds.numG(elapsed))) {
        {
          SubLObject note_string = Sequences.cconcatenate($str234$__, new SubLObject[] {format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(elapsed)), $str235$_of_, format_nil.$format_nil_tilde$.getGlobalValue(), format_nil.format_nil_a_no_copy(numeric_date_utilities.elapsed_time_abbreviation_string(predicted_total_seconds))});
          streams_high.write_string(note_string, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        if ((show_ending_threshold.isInteger()
             && predicted_total_seconds.numG(show_ending_threshold))) {
          streams_high.write_string($str236$__ending__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
          streams_high.write_string(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 23128"), StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
        streams_high.write_string($str216$_, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        streams_high.terpri(StreamsLow.$standard_output$.getDynamicValue(thread));
        streams_high.write_string($str237$__, StreamsLow.$standard_output$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        $last_percent_progress_prediction$.setDynamicValue(predicted_total_seconds, thread);
        return T;
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 47447) 
  public static final SubLObject compute_percent_progress(SubLObject index, SubLObject max) {
    if ((max.numLE(ZERO_INTEGER)
        || index.numLE(ZERO_INTEGER))) {
      return ZERO_INTEGER;
    } else if (index.numGE(max)) {
      return $int20$100;
    } else {
      {
        SubLObject target_length = TEN_INTEGER;
        SubLObject current_length = Numbers.integer_length(max);
        SubLObject scale_factor = Numbers.subtract(target_length, current_length);
        if (scale_factor.isNegative()) {
          index = Numbers.ash(index, scale_factor);
          max = Numbers.ash(max, scale_factor);
        }
      }
      return Numbers.min($int238$99, Numbers.integerDivide(Numbers.multiply($int20$100, index), max));
    }
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 48073) 
  public static SubLSymbol $progress_note$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 48193) 
  public static SubLSymbol $progress_start_time$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 48251) 
  public static SubLSymbol $progress_total$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 48285) 
  public static SubLSymbol $progress_sofar$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 55932) 
  private static SubLSymbol $util_var_error_format_string$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 56077) 
  private static SubLSymbol $util_func_error_format_string$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 56172) 
  private static SubLSymbol $util_search_type_error_format_string$ = null;

  /** Properties whose values are expressed in 100s of nanoseconds */
  @SubL(source = "cycl/utilities-macros.lisp", position = 112949) 
  private static SubLSymbol $process_resource_tracking_100s_of_nanoseconds_properties$ = null;

  /** Destructively divides the times in TIMING-INFO to convert them into seconds.
   Assumes they were originally in 100s of nanoseconds. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 113139) 
  public static final SubLObject convert_process_resource_tracking_timing_info_to_seconds(SubLObject timing_info) {
    {
      SubLObject converted_timing_info = NIL;
      SubLObject remainder = NIL;
      for (remainder = timing_info; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          SubLObject new_value = ((NIL != list_utilities.member_eqP(property, $process_resource_tracking_100s_of_nanoseconds_properties$.getGlobalValue())) ? ((SubLObject) Numbers.divide(value, $int432$10000000)) : value);
          converted_timing_info = conses_high.putf(converted_timing_info, property, new_value);
        }
      }
      return converted_timing_info;
    }
  }

  /** @hack until with-process-resource-tracking supports wall clock time */
  @SubL(source = "cycl/utilities-macros.lisp", position = 113771) 
  public static final SubLObject nadd_clock_time_to_process_resource_timing_info(SubLObject clock_time, SubLObject timing_info) {
    return conses_high.putf(timing_info, $kw433$WALL_CLOCK_TIME, clock_time);
  }

  /** Store of (var, init-func) pairs that
   specify kb-variables and their kb-dependent initialization */
  @SubL(source = "cycl/utilities-macros.lisp", position = 119961) 
  private static SubLSymbol $kb_var_initializations$ = null;

  /** Associates FUNC as the initialization function for VAR-SYMBOL in @xref *kb-var-initializations* */
  @SubL(source = "cycl/utilities-macros.lisp", position = 120114) 
  public static final SubLObject register_kb_variable_initialization(SubLObject var_symbol, SubLObject func) {
    $kb_var_initializations$.setGlobalValue(list_utilities.alist_enter($kb_var_initializations$.getGlobalValue(), var_symbol, func, UNPROVIDED));
    return NIL;
  }

  /** Initializes all of the kb-vars with their initialization functions. @xref *kb-var-initializations* */
  @SubL(source = "cycl/utilities-macros.lisp", position = 120420) 
  public static final SubLObject initialize_kb_variables() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject _prev_bind_0 = $noting_progress_start_time$.currentBinding(thread);
        try {
          $noting_progress_start_time$.bind(Time.get_universal_time(), thread);
          noting_progress_preamble($str469$Initializing_KB_variables___);
          {
            SubLObject cdolist_list_var = $kb_var_initializations$.getGlobalValue();
            SubLObject cons = NIL;
            for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
              {
                SubLObject datum = cons;
                SubLObject current = datum;
                SubLObject var_symbol = NIL;
                SubLObject func = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list470);
                var_symbol = current.first();
                current = current.rest();
                func = current;
                Symbols.set(var_symbol, Functions.funcall(func));
              }
            }
          }
          noting_progress_postamble();
        } finally {
          $noting_progress_start_time$.rebind(_prev_bind_0, thread);
        }
      }
      return NIL;
    }
  }

  /** Register NAME as a deprecated (public) Cyc API function.
   Note its REPLACEMENTS, ARGLIST, DOC-STRING, ARGUMENT-TYPEs and RETURN-TYPES. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 128311) 
  public static final SubLObject register_obsolete_cyc_api_function(SubLObject name, SubLObject replacements, SubLObject arglist, SubLObject doc_string, SubLObject argument_types, SubLObject return_types) {
    register_cyc_api_function(name, arglist, doc_string, argument_types, return_types);
    register_obsolete_cyc_api_replacements(name, replacements);
    return NIL;
  }

  /** For the symbol NAME, denoting an deprecated Cyc API register the Cyc API replacements.  Return the NAME. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 128958) 
  public static final SubLObject register_obsolete_cyc_api_replacements(SubLObject name, SubLObject replacements) {
    checkType(name, $sym25$SYMBOLP);
    checkType(replacements, $sym2$LISTP);
    Symbols.put(name, $kw491$OBSOLETE_CYC_API_REPLACEMENTS, replacements);
    return name;
  }

  /** Partial results can be accumulated here. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 129551) 
  public static SubLSymbol $partial_results_accumulator$ = null;

  /** How many partial results have stacked up. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 129735) 
  public static SubLSymbol $partial_results_size$ = null;

  /** When the partial results, if ever are supposed to be flushed. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 129833) 
  public static SubLSymbol $partial_results_threshold$ = null;

  /** How many results have been computed altogeher up. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 129955) 
  public static SubLSymbol $partial_results_total_size$ = null;

  /** Once the partial results have been notified, they can be added to here. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130067) 
  public static SubLSymbol $partial_results_total_accumulator$ = null;

  /** How the partial results have to be setup. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130208) 
  public static SubLSymbol $partial_results_initialization_fn$ = null;

  /** Who adds a new result to the partial results we already have. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130362) 
  public static SubLSymbol $partial_results_accumulation_fn$ = null;

  /** Who adds the partial results in the accumulator to the total result set. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130531) 
  public static SubLSymbol $partial_results_consolidation_fn$ = null;

  /** Who gets the partial results as they become available. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130713) 
  public static SubLSymbol $partial_results_notification_fn$ = null;

  /** How the partial results will be processed for final usage. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 130875) 
  public static SubLSymbol $partial_results_final_result_fn$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 131897) 
  public static SubLSymbol $accumulating_partial_resultsP$ = null;

  /** The number of bits used in the internal integer computations done by sxhash-external. */
  @SubL(source = "cycl/utilities-macros.lisp", position = 136455) 
  public static SubLSymbol $sxhash_bit_limit$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 136642) 
  private static SubLSymbol $sxhash_update_state_vector$ = null;

  /** Update the composite hash STATE */
  @SubL(source = "cycl/utilities-macros.lisp", position = 137102) 
  public static final SubLObject sxhash_update_state(SubLObject state) {
    return Vectors.aref($sxhash_update_state_vector$.getGlobalValue(), state);
  }

  @SubL(source = "cycl/utilities-macros.lisp", position = 137307) 
  public static SubLSymbol $sxhash_composite_state$ = null;

  @SubL(source = "cycl/utilities-macros.lisp", position = 137422) 
  public static SubLSymbol $sxhash_composite_hash$ = null;

  public static final SubLObject declare_utilities_macros_file() {
    //declareMacro(myName, "define_api", "DEFINE-API");
    //declareMacro(myName, "declare_api_function", "DECLARE-API-FUNCTION");
    //declareMacro(myName, "defmacro_api", "DEFMACRO-API");
    //declareMacro(myName, "define_api_provisional", "DEFINE-API-PROVISIONAL");
    //declareMacro(myName, "defmacro_api_provisional", "DEFMACRO-API-PROVISIONAL");
    declareFunction(myName, "register_cyc_api_function", "REGISTER-CYC-API-FUNCTION", 5, 0, false);
    declareFunction(myName, "register_cyc_api_macro", "REGISTER-CYC-API-MACRO", 3, 0, false);
    declareFunction(myName, "api_special_p", "API-SPECIAL-P", 1, 0, false);
    //declareFunction(myName, "api_special_handler", "API-SPECIAL-HANDLER", 1, 0, false);
    declareFunction(myName, "register_api_special", "REGISTER-API-SPECIAL", 2, 0, false);
    declareFunction(myName, "api_predefined_function_p", "API-PREDEFINED-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "register_api_predefined_function", "REGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
    //declareFunction(myName, "unregister_api_predefined_function", "UNREGISTER-API-PREDEFINED-FUNCTION", 1, 0, false);
    declareFunction(myName, "api_predefined_host_function_p", "API-PREDEFINED-HOST-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "register_api_predefined_host_function", "REGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
    //declareFunction(myName, "unregister_api_predefined_host_function", "UNREGISTER-API-PREDEFINED-HOST-FUNCTION", 1, 0, false);
    declareFunction(myName, "api_predefined_macro_p", "API-PREDEFINED-MACRO-P", 1, 0, false);
    declareFunction(myName, "register_api_predefined_macro", "REGISTER-API-PREDEFINED-MACRO", 1, 0, false);
    //declareFunction(myName, "unregister_api_predefined_macro", "UNREGISTER-API-PREDEFINED-MACRO", 1, 0, false);
    declareFunction(myName, "api_predefined_host_macro_p", "API-PREDEFINED-HOST-MACRO-P", 1, 0, false);
    declareFunction(myName, "register_api_predefined_host_macro", "REGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
    //declareFunction(myName, "unregister_api_predefined_host_macro", "UNREGISTER-API-PREDEFINED-HOST-MACRO", 1, 0, false);
    //declareFunction(myName, "cyc_api_symbol_p", "CYC-API-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "register_cyc_api_symbol", "REGISTER-CYC-API-SYMBOL", 1, 0, false);
    //declareFunction(myName, "deregister_cyc_api_symbol", "DEREGISTER-CYC-API-SYMBOL", 1, 0, false);
    //declareFunction(myName, "cyc_api_args", "CYC-API-ARGS", 1, 0, false);
    declareFunction(myName, "register_cyc_api_args", "REGISTER-CYC-API-ARGS", 2, 0, false);
    //declareFunction(myName, "deregister_cyc_api_args", "DEREGISTER-CYC-API-ARGS", 1, 0, false);
    declareFunction(myName, "register_cyc_api_function_documentation", "REGISTER-CYC-API-FUNCTION-DOCUMENTATION", 2, 0, false);
    //declareFunction(myName, "get_api_arg_types", "GET-API-ARG-TYPES", 1, 0, false);
    declareFunction(myName, "register_cyc_api_arg_types", "REGISTER-CYC-API-ARG-TYPES", 2, 0, false);
    //declareFunction(myName, "deregister_cyc_api_arg_types", "DEREGISTER-CYC-API-ARG-TYPES", 1, 0, false);
    //declareFunction(myName, "get_api_return_types", "GET-API-RETURN-TYPES", 1, 0, false);
    declareFunction(myName, "register_cyc_api_return_types", "REGISTER-CYC-API-RETURN-TYPES", 2, 0, false);
    //declareFunction(myName, "deregister_cyc_api_return_types", "DEREGISTER-CYC-API-RETURN-TYPES", 1, 0, false);
    //declareFunction(myName, "parse_api_type_declarations", "PARSE-API-TYPE-DECLARATIONS", 1, 0, false);
    //declareFunction(myName, "parse_obsolete_api_declarations", "PARSE-OBSOLETE-API-DECLARATIONS", 1, 0, false);
    //declareFunction(myName, "parse_api_declarations_int", "PARSE-API-DECLARATIONS-INT", 2, 0, false);
    //declareFunction(myName, "expand_into_check_type", "EXPAND-INTO-CHECK-TYPE", 1, 0, false);
    declareFunction(myName, "validate_return_type", "VALIDATE-RETURN-TYPE", 1, 0, false);
    //declareMacro(myName, "define_after_adding", "DEFINE-AFTER-ADDING");
    //declareMacro(myName, "define_after_removing", "DEFINE-AFTER-REMOVING");
    //declareMacro(myName, "define_rule_after_adding", "DEFINE-RULE-AFTER-ADDING");
    //declareMacro(myName, "define_rule_after_removing", "DEFINE-RULE-AFTER-REMOVING");
    //declareMacro(myName, "define_collection_defn", "DEFINE-COLLECTION-DEFN");
    //declareMacro(myName, "define_evaluation_defn", "DEFINE-EVALUATION-DEFN");
    //declareMacro(myName, "define_expansion_defn", "DEFINE-EXPANSION-DEFN");
    //declareMacro(myName, "define_cyc_subl_defn", "DEFINE-CYC-SUBL-DEFN");
    //declareMacro(myName, "define_kb", "DEFINE-KB");
    //declareFunction(myName, "kb_function_p", "KB-FUNCTION-P", 1, 0, false);
    declareFunction(myName, "register_kb_symbol", "REGISTER-KB-SYMBOL", 1, 0, false);
    //declareFunction(myName, "deregister_kb_symbol", "DEREGISTER-KB-SYMBOL", 1, 0, false);
    //declareFunction(myName, "deregister_all_kb_functions", "DEREGISTER-ALL-KB-FUNCTIONS", 0, 0, false);
    //declareFunction(myName, "all_kb_functions", "ALL-KB-FUNCTIONS", 0, 0, false);
    declareFunction(myName, "register_kb_function", "REGISTER-KB-FUNCTION", 1, 0, false);
    //declareFunction(myName, "deregister_kb_function", "DEREGISTER-KB-FUNCTION", 1, 0, false);
    //declareMacro(myName, "define_private_funcall", "DEFINE-PRIVATE-FUNCALL");
    declareFunction(myName, "note_funcall_helper_function", "NOTE-FUNCALL-HELPER-FUNCTION", 1, 0, false);
    //declareFunction(myName, "funcall_helper_functionP", "FUNCALL-HELPER-FUNCTION?", 1, 0, false);
    declareFunction(myName, "unprovided_argumentP", "UNPROVIDED-ARGUMENT?", 1, 0, false);
    //declareMacro(myName, "declare_control_parameter", "DECLARE-CONTROL-PARAMETER");
    declareFunction(myName, "declare_control_parameter_internal", "DECLARE-CONTROL-PARAMETER-INTERNAL", 4, 0, false);
    //declareMacro(myName, "until_mapping_finished", "UNTIL-MAPPING-FINISHED");
    declareFunction(myName, "mapping_finished", "MAPPING-FINISHED", 0, 0, false);
    //declareMacro(myName, "until_sbhl_mapping_finished", "UNTIL-SBHL-MAPPING-FINISHED");
    //declareFunction(myName, "sbhl_mapping_finished", "SBHL-MAPPING-FINISHED", 0, 0, false);
    //declareMacro(myName, "cfasl_write", "CFASL-WRITE");
    //declareMacro(myName, "cfasl_read", "CFASL-READ");
    //declareMacro(myName, "if_lock_idle", "IF-LOCK-IDLE");
    //declareMacro(myName, "possibly_with_lock_held", "POSSIBLY-WITH-LOCK-HELD");
    //declareMacro(myName, "defglobal_lock", "DEFGLOBAL-LOCK");
    declareFunction(myName, "initialize_global_locks", "INITIALIZE-GLOBAL-LOCKS", 0, 0, false);
    declareFunction(myName, "register_global_lock", "REGISTER-GLOBAL-LOCK", 2, 0, false);
    //declareFunction(myName, "global_lock_p", "GLOBAL-LOCK-P", 1, 0, false);
    declareFunction(myName, "global_lock_initialization_form", "GLOBAL-LOCK-INITIALIZATION-FORM", 1, 0, false);
    //declareFunction(myName, "initialize_global_lock", "INITIALIZE-GLOBAL-LOCK", 1, 0, false);
    declareFunction(myName, "initialize_global_lock_internal", "INITIALIZE-GLOBAL-LOCK-INTERNAL", 2, 0, false);
    //declareMacro(myName, "defparameter_fi", "DEFPARAMETER-FI");
    //declareMacro(myName, "with_clean_fi_state", "WITH-CLEAN-FI-STATE");
    //declareMacro(myName, "defparameter_html", "DEFPARAMETER-HTML");
    //declareMacro(myName, "defvar_html", "DEFVAR-HTML");
    //declareMacro(myName, "defparameter_html_interface", "DEFPARAMETER-HTML-INTERFACE");
    //declareMacro(myName, "defvar_html_interface", "DEFVAR-HTML-INTERFACE");
    //declareMacro(myName, "def_state_variable", "DEF-STATE-VARIABLE");
    declareFunction(myName, "note_state_variable_documentation", "NOTE-STATE-VARIABLE-DOCUMENTATION", 2, 0, false);
    //declareFunction(myName, "define_operator_for_variable_type", "DEFINE-OPERATOR-FOR-VARIABLE-TYPE", 1, 0, false);
    //declareFunction(myName, "documentation", "DOCUMENTATION", 1, 1, false);
    //declareMacro(myName, "defvar_gt", "DEFVAR-GT");
    //declareMacro(myName, "defvar_at", "DEFVAR-AT");
    //declareMacro(myName, "defvar_defn", "DEFVAR-DEFN");
    //declareMacro(myName, "defvar_kbi", "DEFVAR-KBI");
    //declareMacro(myName, "defvar_kbp", "DEFVAR-KBP");
    //declareMacro(myName, "with_kbp_defaults", "WITH-KBP-DEFAULTS");
    //declareMacro(myName, "progn_cyc_api", "PROGN-CYC-API");
    //declareMacro(myName, "with_forward_inference_environment", "WITH-FORWARD-INFERENCE-ENVIRONMENT");
    //declareMacro(myName, "with_clean_forward_inference_environment", "WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
    //declareMacro(myName, "with_clean_forward_problem_store_environment", "WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
    //declareMacro(myName, "with_normal_forward_inference_parameters", "WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
    //declareMacro(myName, "with_normal_forward_inference", "WITH-NORMAL-FORWARD-INFERENCE");
    declareFunction(myName, "within_normal_forward_inferenceP", "WITHIN-NORMAL-FORWARD-INFERENCE?", 0, 0, false);
    //declareMacro(myName, "throw_unevaluatable_on_error", "THROW-UNEVALUATABLE-ON-ERROR");
    //declareFunction(myName, "tracing_at_level", "TRACING-AT-LEVEL", 2, 0, false);
    //declareMacro(myName, "if_tracing", "IF-TRACING");
    //declareMacro(myName, "with_static_structure_resourcing", "WITH-STATIC-STRUCTURE-RESOURCING");
    //declareMacro(myName, "possibly_with_static_structure_resourcing", "POSSIBLY-WITH-STATIC-STRUCTURE-RESOURCING");
    //declareMacro(myName, "define_structure_resource", "DEFINE-STRUCTURE-RESOURCE");
    //declareMacro(myName, "noting_activity", "NOTING-ACTIVITY");
    //declareMacro(myName, "noting_progress", "NOTING-PROGRESS");
    declareFunction(myName, "noting_progress_preamble", "NOTING-PROGRESS-PREAMBLE", 1, 0, false);
    declareFunction(myName, "noting_progress_postamble", "NOTING-PROGRESS-POSTAMBLE", 0, 0, false);
    //declareMacro(myName, "noting_percent_progress", "NOTING-PERCENT-PROGRESS");
    declareFunction(myName, "noting_percent_progress_preamble", "NOTING-PERCENT-PROGRESS-PREAMBLE", 1, 0, false);
    declareFunction(myName, "noting_percent_progress_postamble", "NOTING-PERCENT-PROGRESS-POSTAMBLE", 0, 0, false);
    declareFunction(myName, "note_percent_progress", "NOTE-PERCENT-PROGRESS", 2, 0, false);
    declareFunction(myName, "print_progress_percent", "PRINT-PROGRESS-PERCENT", 1, 0, false);
    declareFunction(myName, "print_2_digit_nonnegative_integer", "PRINT-2-DIGIT-NONNEGATIVE-INTEGER", 2, 0, false);
    declareFunction(myName, "possibly_note_percent_progress_prediction", "POSSIBLY-NOTE-PERCENT-PROGRESS-PREDICTION", 3, 1, false);
    declareFunction(myName, "compute_percent_progress", "COMPUTE-PERCENT-PROGRESS", 2, 0, false);
    //declareFunction(myName, "progress", "PROGRESS", 0, 0, false);
    //declareMacro(myName, "progress_cdotimes", "PROGRESS-CDOTIMES");
    //declareMacro(myName, "progress_csome", "PROGRESS-CSOME");
    //declareMacro(myName, "progress_cdolist", "PROGRESS-CDOLIST");
    //declareMacro(myName, "possibly_progress_cdolist", "POSSIBLY-PROGRESS-CDOLIST");
    //declareMacro(myName, "progress_cdohash", "PROGRESS-CDOHASH");
    //declareMacro(myName, "progress_do_set", "PROGRESS-DO-SET");
    //declareMacro(myName, "noting_elapsed_time", "NOTING-ELAPSED-TIME");
    //declareFunction(myName, "noting_elapsed_time_preamble", "NOTING-ELAPSED-TIME-PREAMBLE", 1, 0, false);
    //declareFunction(myName, "noting_elapsed_time_postamble", "NOTING-ELAPSED-TIME-POSTAMBLE", 2, 0, false);
    //declareMacro(myName, "with_cyc_server_handling", "WITH-CYC-SERVER-HANDLING");
    //declareMacro(myName, "with_cyc_io_syntax", "WITH-CYC-IO-SYNTAX");
    //declareFunction(myName, "with_cyc_io_syntax_internal", "WITH-CYC-IO-SYNTAX-INTERNAL", 1, 0, false);
    //declareMacro(myName, "with_sublisp_runtime_assumptions", "WITH-SUBLISP-RUNTIME-ASSUMPTIONS");
    //declareMacro(myName, "with_the_cyclist", "WITH-THE-CYCLIST");
    //declareMacro(myName, "with_different_cyclist", "WITH-DIFFERENT-CYCLIST");
    //declareMacro(myName, "do_bindings", "DO-BINDINGS");
    //declareFunction(myName, "do_bindings_var_specs", "DO-BINDINGS-VAR-SPECS", 2, 0, false);
    //declareMacro(myName, "fast_singleton_macro_p", "FAST-SINGLETON-MACRO-P");
    //declareFunction(myName, "pluralityP", "PLURALITY?", 1, 0, false);
    //declareMacro(myName, "fast_plurality_macro_p", "FAST-PLURALITY-MACRO-P");
    //declareMacro(myName, "cdosublists", "CDOSUBLISTS");
    //declareMacro(myName, "cdolist_and_sublists", "CDOLIST-AND-SUBLISTS");
    //declareMacro(myName, "cdolist_and_sublists_carefully", "CDOLIST-AND-SUBLISTS-CAREFULLY");
    //declareMacro(myName, "cdo_possibly_dotted_list", "CDO-POSSIBLY-DOTTED-LIST");
    //declareMacro(myName, "cdolist_if", "CDOLIST-IF");
    //declareMacro(myName, "cdosublists_if", "CDOSUBLISTS-IF");
    //declareMacro(myName, "cdolist_if_not", "CDOLIST-IF-NOT");
    //declareMacro(myName, "cdosublists_if_not", "CDOSUBLISTS-IF-NOT");
    //declareMacro(myName, "cdo2lists", "CDO2LISTS");
    //declareMacro(myName, "cdotree", "CDOTREE");
    //declareMacro(myName, "cdotree_conses", "CDOTREE-CONSES");
    //declareMacro(myName, "cdoplist", "CDOPLIST");
    //declareFunction(myName, "compositize_function_call", "COMPOSITIZE-FUNCTION-CALL", 2, 1, false);
    //declareFunction(myName, "simplify_car_and_cdr_path", "SIMPLIFY-CAR-AND-CDR-PATH", 1, 0, false);
    //declareFunction(myName, "map_symbols_to_accessors", "MAP-SYMBOLS-TO-ACCESSORS", 3, 0, false);
    //declareMacro(myName, "cdestructuring_setq", "CDESTRUCTURING-SETQ");
    //declareFunction(myName, "fast_funcall_no_value_check_args", "FAST-FUNCALL-NO-VALUE-CHECK-ARGS", 3, 0, false);
    //declareMacro(myName, "fast_funcall_no_value", "FAST-FUNCALL-NO-VALUE");
    //declareMacro(myName, "fast_funcall_setq", "FAST-FUNCALL-SETQ");
    //declareFunction(myName, "generate_parallel_var_list", "GENERATE-PARALLEL-VAR-LIST", 1, 0, false);
    //declareFunction(myName, "generate_multiple_csetq", "GENERATE-MULTIPLE-CSETQ", 2, 0, false);
    //declareMacro(myName, "fast_funcall_multiple_value_bind", "FAST-FUNCALL-MULTIPLE-VALUE-BIND");
    //declareMacro(myName, "fast_funcall_multiple_value_setq", "FAST-FUNCALL-MULTIPLE-VALUE-SETQ");
    //declareFunction(myName, "expand_destructuring_predication_generator", "EXPAND-DESTRUCTURING-PREDICATION-GENERATOR", 2, 0, false);
    //declareMacro(myName, "funcall_shortcut", "FUNCALL-SHORTCUT");
    //declareMacro(myName, "destructuring_predication_generator", "DESTRUCTURING-PREDICATION-GENERATOR");
    //declareFunction(myName, "symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
    //declareFunction(myName, "unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
    //declareFunction(myName, "generate_instance_variable_bindings_for_structure_slots", "GENERATE-INSTANCE-VARIABLE-BINDINGS-FOR-STRUCTURE-SLOTS", 5, 1, false);
    //declareMacro(myName, "cdolist_collecting", "CDOLIST-COLLECTING");
    //declareMacro(myName, "cdolist_appending", "CDOLIST-APPENDING");
    //declareFunction(myName, "expand_define_list_element_predicator", "EXPAND-DEFINE-LIST-ELEMENT-PREDICATOR", 5, 0, false);
    //declareMacro(myName, "define_api_list_element_predicator", "DEFINE-API-LIST-ELEMENT-PREDICATOR");
    //declareMacro(myName, "define_public_list_element_predicator", "DEFINE-PUBLIC-LIST-ELEMENT-PREDICATOR");
    //declareMacro(myName, "define_protected_list_element_predicator", "DEFINE-PROTECTED-LIST-ELEMENT-PREDICATOR");
    //declareMacro(myName, "define_private_list_element_predicator", "DEFINE-PRIVATE-LIST-ELEMENT-PREDICATOR");
    //declareFunction(myName, "argnames_from_arglist", "ARGNAMES-FROM-ARGLIST", 1, 0, false);
    //declareFunction(myName, "car_if_list", "CAR-IF-LIST", 1, 0, false);
    //declareFunction(myName, "expand_fcond", "EXPAND-FCOND", 1, 0, false);
    //declareMacro(myName, "fcond", "FCOND");
    //declareFunction(myName, "check_p_range_case_clauses", "CHECK-P-RANGE-CASE-CLAUSES", 1, 0, false);
    //declareFunction(myName, "utilities_macros_car_eq", "UTILITIES-MACROS-CAR-EQ", 2, 0, false);
    //declareFunction(myName, "expand_p_range_case", "EXPAND-P-RANGE-CASE", 2, 0, false);
    //declareMacro(myName, "p_range_case", "P-RANGE-CASE");
    //declareFunction(myName, "default_code_branch_error_clause", "DEFAULT-CODE-BRANCH-ERROR-CLAUSE", 1, 0, false);
    //declareMacro(myName, "code_branch_by_version", "CODE-BRANCH-BY-VERSION");
    //declareMacro(myName, "code_branch_by_version_numbers", "CODE-BRANCH-BY-VERSION-NUMBERS");
    //declareFunction(myName, "sub_kb_loaded_root_string", "SUB-KB-LOADED-ROOT-STRING", 1, 0, false);
    //declareFunction(myName, "sub_kb_loaded_p_symbol", "SUB-KB-LOADED-P-SYMBOL", 1, 0, false);
    //declareFunction(myName, "sub_kb_set_symbol", "SUB-KB-SET-SYMBOL", 1, 0, false);
    //declareFunction(myName, "sub_kb_unset_symbol", "SUB-KB-UNSET-SYMBOL", 1, 0, false);
    //declareMacro(myName, "declare_kb_feature", "DECLARE-KB-FEATURE");
    //declareFunction(myName, "expand_format_to_string", "EXPAND-FORMAT-TO-STRING", 1, 0, false);
    //declareMacro(myName, "format_to_string", "FORMAT-TO-STRING");
    //declareMacro(myName, "time", "TIME");
    //declareMacro(myName, "with_process_resource_tracking_in_seconds", "WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
    declareFunction(myName, "convert_process_resource_tracking_timing_info_to_seconds", "CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS", 1, 0, false);
    declareFunction(myName, "nadd_clock_time_to_process_resource_timing_info", "NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO", 2, 0, false);
    //declareFunction(myName, "process_resource_tracking_user_time", "PROCESS-RESOURCE-TRACKING-USER-TIME", 1, 0, false);
    //declareFunction(myName, "process_resource_tracking_system_time", "PROCESS-RESOURCE-TRACKING-SYSTEM-TIME", 1, 0, false);
    //declareFunction(myName, "process_resource_tracking_wall_clock_time", "PROCESS-RESOURCE-TRACKING-WALL-CLOCK-TIME", 1, 0, false);
    //declareMacro(myName, "timing_info", "TIMING-INFO");
    //declareMacro(myName, "user_time", "USER-TIME");
    //declareMacro(myName, "user_time_in_seconds", "USER-TIME-IN-SECONDS");
    //declareMacro(myName, "system_time", "SYSTEM-TIME");
    //declareMacro(myName, "system_time_in_seconds", "SYSTEM-TIME-IN-SECONDS");
    //declareMacro(myName, "check_type_if_present", "CHECK-TYPE-IF-PRESENT");
    //declareMacro(myName, "check_list_type", "CHECK-LIST-TYPE");
    //declareMacro(myName, "check_plist_type", "CHECK-PLIST-TYPE");
    //declareMacro(myName, "must_if_present", "MUST-IF-PRESENT");
    //declareMacro(myName, "swap", "SWAP");
    //declareMacro(myName, "def_kb_variable", "DEF-KB-VARIABLE");
    declareFunction(myName, "register_kb_variable_initialization", "REGISTER-KB-VARIABLE-INITIALIZATION", 2, 0, false);
    declareFunction(myName, "initialize_kb_variables", "INITIALIZE-KB-VARIABLES", 0, 0, false);
    //declareMacro(myName, "defparameter_lazy", "DEFPARAMETER-LAZY");
    //declareMacro(myName, "defvar_lazy", "DEFVAR-LAZY");
    //declareMacro(myName, "defglobal_lazy", "DEFGLOBAL-LAZY");
    //declareMacro(myName, "deflexical_lazy", "DEFLEXICAL-LAZY");
    //declareMacro(myName, "define_api_obsolete", "DEFINE-API-OBSOLETE");
    declareFunction(myName, "register_obsolete_cyc_api_function", "REGISTER-OBSOLETE-CYC-API-FUNCTION", 6, 0, false);
    //declareFunction(myName, "obsolete_cyc_api_replacements", "OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
    declareFunction(myName, "register_obsolete_cyc_api_replacements", "REGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 2, 0, false);
    //declareFunction(myName, "deregister_obsolete_cyc_api_replacements", "DEREGISTER-OBSOLETE-CYC-API-REPLACEMENTS", 1, 0, false);
    //declareFunction(myName, "initialization_for_partial_list_results", "INITIALIZATION-FOR-PARTIAL-LIST-RESULTS", 0, 0, false);
    //declareFunction(myName, "accumulation_for_partial_list_results", "ACCUMULATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
    //declareFunction(myName, "consolidation_for_partial_list_results", "CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
    //declareFunction(myName, "notification_for_partial_list_results", "NOTIFICATION-FOR-PARTIAL-LIST-RESULTS", 3, 0, false);
    //declareFunction(myName, "final_results_for_partial_list_results", "FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS", 1, 0, false);
    //declareFunction(myName, "add_result_to_partial_results_accumulator", "ADD-RESULT-TO-PARTIAL-RESULTS-ACCUMULATOR", 1, 0, false);
    //declareMacro(myName, "with_partial_results_accumulation", "WITH-PARTIAL-RESULTS-ACCUMULATION");
    //declareMacro(myName, "with_space_profiling_to_string", "WITH-SPACE-PROFILING-TO-STRING");
    //declareMacro(myName, "with_sxhash_composite", "WITH-SXHASH-COMPOSITE");
    //declareMacro(myName, "with_sxhash_composite_fast", "WITH-SXHASH-COMPOSITE-FAST");
    //declareMacro(myName, "sxhash_composite_update_fast", "SXHASH-COMPOSITE-UPDATE-FAST");
    declareFunction(myName, "sxhash_update_state", "SXHASH-UPDATE-STATE", 1, 0, false);
    //declareFunction(myName, "sxhash_composite_update", "SXHASH-COMPOSITE-UPDATE", 1, 0, false);
    //declareFunction(myName, "slow_hash_test", "SLOW-HASH-TEST", 0, 1, false);
    //declareFunction(myName, "fast_hash_test", "FAST-HASH-TEST", 0, 1, false);
    //declareMacro(myName, "possibly_catch_error_message", "POSSIBLY-CATCH-ERROR-MESSAGE");
    //declareMacro(myName, "possibly_ccatch", "POSSIBLY-CCATCH");
    //declareMacro(myName, "run_benchmark_compensating_for_paging", "RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
    //declareFunction(myName, "benchmark_gc", "BENCHMARK-GC", 0, 0, false);
    //declareMacro(myName, "without_pretty_printing", "WITHOUT-PRETTY-PRINTING");
    return NIL;
  }

  public static final SubLObject init_utilities_macros_file() {
    $api_special_table$ = deflexical("*API-SPECIAL-TABLE*", maybeDefault( $sym15$_API_SPECIAL_TABLE_, $api_special_table$, ()-> (Hashtables.make_hash_table(TEN_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED))));
    $api_predefined_function_table$ = deflexical("*API-PREDEFINED-FUNCTION-TABLE*", maybeDefault( $sym17$_API_PREDEFINED_FUNCTION_TABLE_, $api_predefined_function_table$, ()-> (Hashtables.make_hash_table($int18$1000, Symbols.symbol_function(EQ), UNPROVIDED))));
    $api_predefined_host_function_table$ = deflexical("*API-PREDEFINED-HOST-FUNCTION-TABLE*", maybeDefault( $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_, $api_predefined_host_function_table$, ()-> (Hashtables.make_hash_table($int20$100, Symbols.symbol_function(EQ), UNPROVIDED))));
    $api_predefined_macro_table$ = deflexical("*API-PREDEFINED-MACRO-TABLE*", maybeDefault( $sym21$_API_PREDEFINED_MACRO_TABLE_, $api_predefined_macro_table$, ()-> (Hashtables.make_hash_table($int20$100, Symbols.symbol_function(EQ), UNPROVIDED))));
    $api_predefined_host_macro_table$ = deflexical("*API-PREDEFINED-HOST-MACRO-TABLE*", maybeDefault( $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_, $api_predefined_host_macro_table$, ()-> (Hashtables.make_hash_table(TEN_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED))));
    $api_symbols$ = deflexical("*API-SYMBOLS*", maybeDefault( $sym23$_API_SYMBOLS_, $api_symbols$, NIL));
    $api_types$ = deflexical("*API-TYPES*", maybeDefault( $sym29$_API_TYPES_, $api_types$, NIL));
    $kb_function_table$ = deflexical("*KB-FUNCTION-TABLE*", maybeDefault( $sym58$_KB_FUNCTION_TABLE_, $kb_function_table$, ()-> (Hashtables.make_hash_table($int59$400, Symbols.symbol_function(EQ), UNPROVIDED))));
    $funcall_helper_property$ = deflexical("*FUNCALL-HELPER-PROPERTY*", maybeDefault( $sym65$_FUNCALL_HELPER_PROPERTY_, $funcall_helper_property$, ()-> ($kw66$FUNCALL_HELPER)));
    $unprovided$ = deflexical("*UNPROVIDED*", maybeDefault( $sym68$_UNPROVIDED_, $unprovided$, ()-> (Symbols.make_symbol($str69$UNPROVIDED))));
    $cfasl_stream$ = defparameter("*CFASL-STREAM*", NIL);
    $global_locks$ = deflexical("*GLOBAL-LOCKS*", maybeDefault( $sym98$_GLOBAL_LOCKS_, $global_locks$, NIL));
    $fi_state_variables$ = deflexical("*FI-STATE-VARIABLES*", maybeDefault( $sym106$_FI_STATE_VARIABLES_, $fi_state_variables$, NIL));
    $gt_state_variables$ = deflexical("*GT-STATE-VARIABLES*", maybeDefault( $sym142$_GT_STATE_VARIABLES_, $gt_state_variables$, NIL));
    $at_state_variables$ = deflexical("*AT-STATE-VARIABLES*", maybeDefault( $sym144$_AT_STATE_VARIABLES_, $at_state_variables$, NIL));
    $defn_state_variables$ = deflexical("*DEFN-STATE-VARIABLES*", maybeDefault( $sym145$_DEFN_STATE_VARIABLES_, $defn_state_variables$, NIL));
    $kbp_state_variables$ = deflexical("*KBP-STATE-VARIABLES*", maybeDefault( $sym148$_KBP_STATE_VARIABLES_, $kbp_state_variables$, NIL));
    $current_forward_problem_store$ = defparameter("*CURRENT-FORWARD-PROBLEM-STORE*", NIL);
    $tracing_level$ = defparameter("*TRACING-LEVEL*", NIL);
    $structure_resourcing_enabled$ = deflexical("*STRUCTURE-RESOURCING-ENABLED*", NIL);
    $structure_resourcing_make_static$ = defparameter("*STRUCTURE-RESOURCING-MAKE-STATIC*", NIL);
    $silent_progressP$ = defvar("*SILENT-PROGRESS?*", NIL);
    $noting_progress_start_time$ = defparameter("*NOTING-PROGRESS-START-TIME*", NIL);
    $last_percent_progress_index$ = defvar("*LAST-PERCENT-PROGRESS-INDEX*", NIL);
    $last_percent_progress_prediction$ = defparameter("*LAST-PERCENT-PROGRESS-PREDICTION*", NIL);
    $within_noting_percent_progress$ = defvar("*WITHIN-NOTING-PERCENT-PROGRESS*", NIL);
    $percent_progress_start_time$ = defvar("*PERCENT-PROGRESS-START-TIME*", NIL);
    $progress_note$ = defparameter("*PROGRESS-NOTE*", $str239$);
    $progress_start_time$ = defparameter("*PROGRESS-START-TIME*", Time.get_universal_time());
    $progress_total$ = defparameter("*PROGRESS-TOTAL*", ONE_INTEGER);
    $progress_sofar$ = defparameter("*PROGRESS-SOFAR*", ZERO_INTEGER);
    $util_var_error_format_string$ = defparameter("*UTIL-VAR-ERROR-FORMAT-STRING*", $str299$_S___var__S_is_not_a_symbol_);
    $util_func_error_format_string$ = defparameter("*UTIL-FUNC-ERROR-FORMAT-STRING*", $str300$_S___function__S_is_not_a_symbol_);
    $util_search_type_error_format_string$ = defparameter("*UTIL-SEARCH-TYPE-ERROR-FORMAT-STRING*", $str301$_S___search_type__S_is_not_one_of);
    $process_resource_tracking_100s_of_nanoseconds_properties$ = deflexical("*PROCESS-RESOURCE-TRACKING-100S-OF-NANOSECONDS-PROPERTIES*", $list430);
    $kb_var_initializations$ = deflexical("*KB-VAR-INITIALIZATIONS*", maybeDefault( $sym467$_KB_VAR_INITIALIZATIONS_, $kb_var_initializations$, NIL));
    $partial_results_accumulator$ = defparameter("*PARTIAL-RESULTS-ACCUMULATOR*", NIL);
    $partial_results_size$ = defparameter("*PARTIAL-RESULTS-SIZE*", NIL);
    $partial_results_threshold$ = defparameter("*PARTIAL-RESULTS-THRESHOLD*", $int492$40);
    $partial_results_total_size$ = defparameter("*PARTIAL-RESULTS-TOTAL-SIZE*", NIL);
    $partial_results_total_accumulator$ = defparameter("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*", NIL);
    $partial_results_initialization_fn$ = defparameter("*PARTIAL-RESULTS-INITIALIZATION-FN*", $sym493$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS);
    $partial_results_accumulation_fn$ = defparameter("*PARTIAL-RESULTS-ACCUMULATION-FN*", $sym494$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS);
    $partial_results_consolidation_fn$ = defparameter("*PARTIAL-RESULTS-CONSOLIDATION-FN*", $sym495$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS);
    $partial_results_notification_fn$ = defparameter("*PARTIAL-RESULTS-NOTIFICATION-FN*", $sym496$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS);
    $partial_results_final_result_fn$ = defparameter("*PARTIAL-RESULTS-FINAL-RESULT-FN*", $sym497$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS);
    $accumulating_partial_resultsP$ = defparameter("*ACCUMULATING-PARTIAL-RESULTS?*", NIL);
    $sxhash_bit_limit$ = defconstant("*SXHASH-BIT-LIMIT*", $int526$27);
    $sxhash_update_state_vector$ = deflexical("*SXHASH-UPDATE-STATE-VECTOR*", $ic527);
    $sxhash_composite_state$ = defparameter("*SXHASH-COMPOSITE-STATE*", NIL);
    $sxhash_composite_hash$ = defparameter("*SXHASH-COMPOSITE-HASH*", NIL);
    return NIL;
  }

  public static final SubLObject setup_utilities_macros_file() {
    // CVS_ID("Id: utilities-macros.lisp 127836 2009-05-18 23:13:06Z tbrussea ");
    subl_macro_promotions.declare_defglobal($sym15$_API_SPECIAL_TABLE_);
    subl_macro_promotions.declare_defglobal($sym17$_API_PREDEFINED_FUNCTION_TABLE_);
    subl_macro_promotions.declare_defglobal($sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_);
    subl_macro_promotions.declare_defglobal($sym21$_API_PREDEFINED_MACRO_TABLE_);
    subl_macro_promotions.declare_defglobal($sym22$_API_PREDEFINED_HOST_MACRO_TABLE_);
    subl_macro_promotions.declare_defglobal($sym23$_API_SYMBOLS_);
    subl_macro_promotions.declare_defglobal($sym29$_API_TYPES_);
    access_macros.register_external_symbol($sym41$DEFINE_AFTER_ADDING);
    access_macros.register_external_symbol($sym43$DEFINE_AFTER_REMOVING);
    access_macros.register_external_symbol($sym44$DEFINE_RULE_AFTER_ADDING);
    access_macros.register_external_symbol($sym45$DEFINE_RULE_AFTER_REMOVING);
    access_macros.register_external_symbol($sym46$DEFINE_COLLECTION_DEFN);
    access_macros.register_external_symbol($sym47$DEFINE_EVALUATION_DEFN);
    access_macros.register_external_symbol($sym49$DEFINE_EXPANSION_DEFN);
    access_macros.register_external_symbol($sym50$DEFINE_CYC_SUBL_DEFN);
    access_macros.register_external_symbol($sym42$DEFINE_KB);
    subl_macro_promotions.declare_defglobal($sym58$_KB_FUNCTION_TABLE_);
    access_macros.register_macro_helper($sym57$REGISTER_KB_FUNCTION, $sym42$DEFINE_KB);
    access_macros.register_external_symbol($sym62$DEREGISTER_KB_FUNCTION);
    subl_macro_promotions.declare_defglobal($sym65$_FUNCALL_HELPER_PROPERTY_);
    access_macros.register_macro_helper($sym64$NOTE_FUNCALL_HELPER_FUNCTION, $sym67$DEFINE_PRIVATE_FUNCALL);
    subl_macro_promotions.declare_defglobal($sym68$_UNPROVIDED_);
    subl_macro_promotions.declare_defglobal($sym98$_GLOBAL_LOCKS_);
    access_macros.register_macro_helper($sym97$REGISTER_GLOBAL_LOCK, $sym97$REGISTER_GLOBAL_LOCK);
    access_macros.register_macro_helper($sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL, $sym104$INITIALIZE_GLOBAL_LOCKS);
    subl_macro_promotions.declare_defglobal($sym106$_FI_STATE_VARIABLES_);
    access_macros.register_macro_helper($sym120$NOTE_STATE_VARIABLE_DOCUMENTATION, $sym121$DEF_STATE_VARIABLE);
    subl_macro_promotions.declare_defglobal($sym142$_GT_STATE_VARIABLES_);
    subl_macro_promotions.declare_defglobal($sym144$_AT_STATE_VARIABLES_);
    subl_macro_promotions.declare_defglobal($sym145$_DEFN_STATE_VARIABLES_);
    subl_macro_promotions.declare_defglobal($sym148$_KBP_STATE_VARIABLES_);
    access_macros.register_macro_helper($sym210$NOTING_PROGRESS_PREAMBLE, $sym212$NOTING_PROGRESS);
    access_macros.register_macro_helper($sym214$NOTING_PROGRESS_POSTAMBLE, $sym212$NOTING_PROGRESS);
    access_macros.register_macro_helper($sym218$NOTING_PERCENT_PROGRESS_PREAMBLE, $sym220$NOTING_PERCENT_PROGRESS);
    access_macros.register_macro_helper($sym222$NOTING_PERCENT_PROGRESS_POSTAMBLE, $sym220$NOTING_PERCENT_PROGRESS);
    access_macros.register_macro_helper($sym226$NOTE_PERCENT_PROGRESS, $sym220$NOTING_PERCENT_PROGRESS);
    access_macros.register_external_symbol($sym257$PROGRESS_CDOLIST);
    access_macros.register_macro_helper($sym278$NOTING_ELAPSED_TIME_PREAMBLE, $sym280$NOTING_ELAPSED_TIME);
    access_macros.register_macro_helper($sym279$NOTING_ELAPSED_TIME_POSTAMBLE, $sym280$NOTING_ELAPSED_TIME);
    access_macros.register_macro_helper($sym401$SUB_KB_LOADED_P_SYMBOL, $sym402$DECLARE_KB_FEATURE);
    access_macros.register_macro_helper($sym404$SUB_KB_SET_SYMBOL, $sym402$DECLARE_KB_FEATURE);
    access_macros.register_macro_helper($sym406$SUB_KB_UNSET_SYMBOL, $sym402$DECLARE_KB_FEATURE);
    access_macros.register_macro_helper($sym428$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS, $sym431$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
    access_macros.register_macro_helper($sym429$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO, $sym431$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS);
    subl_macro_promotions.declare_defglobal($sym467$_KB_VAR_INITIALIZATIONS_);
    access_macros.register_macro_helper($sym466$REGISTER_KB_VARIABLE_INITIALIZATION, $sym468$DEF_KB_VARIABLE);
    access_macros.register_external_symbol($sym505$WITH_SPACE_PROFILING_TO_STRING);
    access_macros.register_macro_helper($sym528$SXHASH_COMPOSITE_UPDATE, $sym529$COMPUTE_SXHASH_COMPOSITE);
    access_macros.register_macro_helper($sym543$BENCHMARK_GC, $sym544$RUN_BENCHMARK_COMPENSATING_FOR_PAGING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym2$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym3$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym4$DEFINE_PUBLIC = makeSymbol("DEFINE-PUBLIC");
  public static final SubLSymbol $sym5$REGISTER_CYC_API_FUNCTION = makeSymbol("REGISTER-CYC-API-FUNCTION");
  public static final SubLSymbol $sym6$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list7 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list8 = list(makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"));
  public static final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$DEFMACRO_PUBLIC = makeSymbol("DEFMACRO-PUBLIC");
  public static final SubLSymbol $sym11$REGISTER_CYC_API_MACRO = makeSymbol("REGISTER-CYC-API-MACRO");
  public static final SubLSymbol $sym12$DEFINE_EXTERNAL = makeSymbol("DEFINE-EXTERNAL");
  public static final SubLList $list13 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("TYPE-DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym14$REGISTER_EXTERNAL_SYMBOL = makeSymbol("REGISTER-EXTERNAL-SYMBOL");
  public static final SubLSymbol $sym15$_API_SPECIAL_TABLE_ = makeSymbol("*API-SPECIAL-TABLE*");
  public static final SubLString $str16$Registering__A_as_special_even_th = makeString("Registering ~A as special even though it's already predefined!");
  public static final SubLSymbol $sym17$_API_PREDEFINED_FUNCTION_TABLE_ = makeSymbol("*API-PREDEFINED-FUNCTION-TABLE*");
  public static final SubLInteger $int18$1000 = makeInteger(1000);
  public static final SubLSymbol $sym19$_API_PREDEFINED_HOST_FUNCTION_TABLE_ = makeSymbol("*API-PREDEFINED-HOST-FUNCTION-TABLE*");
  public static final SubLInteger $int20$100 = makeInteger(100);
  public static final SubLSymbol $sym21$_API_PREDEFINED_MACRO_TABLE_ = makeSymbol("*API-PREDEFINED-MACRO-TABLE*");
  public static final SubLSymbol $sym22$_API_PREDEFINED_HOST_MACRO_TABLE_ = makeSymbol("*API-PREDEFINED-HOST-MACRO-TABLE*");
  public static final SubLSymbol $sym23$_API_SYMBOLS_ = makeSymbol("*API-SYMBOLS*");
  public static final SubLSymbol $kw24$CYC_API_SYMBOL = makeKeyword("CYC-API-SYMBOL");
  public static final SubLSymbol $sym25$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $kw26$CYC_API_ARGS = makeKeyword("CYC-API-ARGS");
  public static final SubLSymbol $kw27$CYC_API_ARG_TYPES = makeKeyword("CYC-API-ARG-TYPES");
  public static final SubLSymbol $kw28$CYC_API_RETURN_TYPES = makeKeyword("CYC-API-RETURN-TYPES");
  public static final SubLSymbol $sym29$_API_TYPES_ = makeSymbol("*API-TYPES*");
  public static final SubLSymbol $kw30$REPLACEMENTS = makeKeyword("REPLACEMENTS");
  public static final SubLString $str31$_replacements_not_allowed_in_the_ = makeString(":replacements not allowed in the declaration of Cyc API function");
  public static final SubLSymbol $kw32$ARGUMENT_TYPES = makeKeyword("ARGUMENT-TYPES");
  public static final SubLSymbol $kw33$RETURN_TYPES = makeKeyword("RETURN-TYPES");
  public static final SubLSymbol $sym34$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLSymbol $sym35$NIL_OR = makeSymbol("NIL-OR");
  public static final SubLString $str36$Invalid_argument_type_expression_ = makeString("Invalid argument-type expression ~S");
  public static final SubLSymbol $sym37$PWHEN = makeSymbol("PWHEN");
  public static final SubLString $str38$_S_return_type_expression_not_lis = makeString("~S return type expression not list length 2.");
  public static final SubLList $list39 = list(makeSymbol("LIST"), makeSymbol("NIL-OR"));
  public static final SubLString $str40$_S_complex_return_type_expression = makeString("~S complex return type expression not of form (nil-or X) or (list X).");
  public static final SubLSymbol $sym41$DEFINE_AFTER_ADDING = makeSymbol("DEFINE-AFTER-ADDING");
  public static final SubLSymbol $sym42$DEFINE_KB = makeSymbol("DEFINE-KB");
  public static final SubLSymbol $sym43$DEFINE_AFTER_REMOVING = makeSymbol("DEFINE-AFTER-REMOVING");
  public static final SubLSymbol $sym44$DEFINE_RULE_AFTER_ADDING = makeSymbol("DEFINE-RULE-AFTER-ADDING");
  public static final SubLSymbol $sym45$DEFINE_RULE_AFTER_REMOVING = makeSymbol("DEFINE-RULE-AFTER-REMOVING");
  public static final SubLSymbol $sym46$DEFINE_COLLECTION_DEFN = makeSymbol("DEFINE-COLLECTION-DEFN");
  public static final SubLSymbol $sym47$DEFINE_EVALUATION_DEFN = makeSymbol("DEFINE-EVALUATION-DEFN");
  public static final SubLList $list48 = list(makeSymbol("NAME"), makeSymbol("PATTERN"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym49$DEFINE_EXPANSION_DEFN = makeSymbol("DEFINE-EXPANSION-DEFN");
  public static final SubLSymbol $sym50$DEFINE_CYC_SUBL_DEFN = makeSymbol("DEFINE-CYC-SUBL-DEFN");
  public static final SubLList $list51 = list(makeSymbol("FUNCTION-SYMBOL"), makeSymbol("BASIS-FUNCTION"));
  public static final SubLList $list52 = list(makeSymbol("OBJECT"));
  public static final SubLList $list53 = list(makeSymbol("SUBL-ESCAPE-P"), makeSymbol("OBJECT"));
  public static final SubLSymbol $sym54$RET = makeSymbol("RET");
  public static final SubLList $list55 = list(list(makeSymbol("SUBL-ESCAPE-SUBL"), makeSymbol("OBJECT")));
  public static final SubLSymbol $sym56$DEFINE = makeSymbol("DEFINE");
  public static final SubLSymbol $sym57$REGISTER_KB_FUNCTION = makeSymbol("REGISTER-KB-FUNCTION");
  public static final SubLSymbol $sym58$_KB_FUNCTION_TABLE_ = makeSymbol("*KB-FUNCTION-TABLE*");
  public static final SubLInteger $int59$400 = makeInteger(400);
  public static final SubLSymbol $sym60$STRING_LESSP = makeSymbol("STRING-LESSP");
  public static final SubLSymbol $sym61$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym62$DEREGISTER_KB_FUNCTION = makeSymbol("DEREGISTER-KB-FUNCTION");
  public static final SubLSymbol $sym63$DEFINE_PRIVATE = makeSymbol("DEFINE-PRIVATE");
  public static final SubLSymbol $sym64$NOTE_FUNCALL_HELPER_FUNCTION = makeSymbol("NOTE-FUNCALL-HELPER-FUNCTION");
  public static final SubLSymbol $sym65$_FUNCALL_HELPER_PROPERTY_ = makeSymbol("*FUNCALL-HELPER-PROPERTY*");
  public static final SubLSymbol $kw66$FUNCALL_HELPER = makeKeyword("FUNCALL-HELPER");
  public static final SubLSymbol $sym67$DEFINE_PRIVATE_FUNCALL = makeSymbol("DEFINE-PRIVATE-FUNCALL");
  public static final SubLSymbol $sym68$_UNPROVIDED_ = makeSymbol("*UNPROVIDED*");
  public static final SubLString $str69$UNPROVIDED = makeString("UNPROVIDED");
  public static final SubLList $list70 = list(makeSymbol("VARIABLE"), makeSymbol("FANCY-NAME"), makeSymbol("DESCRIPTION"), makeSymbol("SETTINGS-SPEC"));
  public static final SubLSymbol $sym71$DECLARE_CONTROL_PARAMETER_INTERNAL = makeSymbol("DECLARE-CONTROL-PARAMETER-INTERNAL");
  public static final SubLSymbol $kw72$FANCY_NAME = makeKeyword("FANCY-NAME");
  public static final SubLSymbol $kw73$DESCRIPTION = makeKeyword("DESCRIPTION");
  public static final SubLSymbol $kw74$SETTINGS_SPEC = makeKeyword("SETTINGS-SPEC");
  public static final SubLSymbol $sym75$CCATCH_IGNORE = makeSymbol("CCATCH-IGNORE");
  public static final SubLSymbol $kw76$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $kw77$SBHL_MAPPING_DONE = makeKeyword("SBHL-MAPPING-DONE");
  public static final SubLList $list78 = list(makeSymbol("OBJ"));
  public static final SubLSymbol $sym79$WRITE_BYTE = makeSymbol("WRITE-BYTE");
  public static final SubLList $list80 = list(makeSymbol("*CFASL-STREAM*"));
  public static final SubLList $list81 = list(makeSymbol("READ-BYTE"), makeSymbol("*CFASL-STREAM*"), NIL, NIL);
  public static final SubLList $list82 = list(makeSymbol("LOCK"), makeSymbol("ACTION"), makeSymbol("&OPTIONAL"), makeSymbol("ELSE-ACTION"));
  public static final SubLSymbol $sym83$LOCK_VAR = makeUninternedSymbol("LOCK-VAR");
  public static final SubLSymbol $sym84$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym85$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym86$LOCK_IDLE_P = makeSymbol("LOCK-IDLE-P");
  public static final SubLSymbol $sym87$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLList $list88 = list(makeSymbol("LOCK"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list89 = list(makeSymbol("VARIABLE"), makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("VACCESS"), makeSymbol("DOCUMENTATION"));
  public static final SubLList $list90 = list(makeKeyword("VACCESS"), makeKeyword("DOCUMENTATION"));
  public static final SubLSymbol $kw91$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw92$VACCESS = makeKeyword("VACCESS");
  public static final SubLSymbol $kw93$DOCUMENTATION = makeKeyword("DOCUMENTATION");
  public static final SubLSymbol $sym94$DECLAIM = makeSymbol("DECLAIM");
  public static final SubLSymbol $sym95$VACCESS = makeSymbol("VACCESS");
  public static final SubLSymbol $sym96$DEFGLOBAL = makeSymbol("DEFGLOBAL");
  public static final SubLSymbol $sym97$REGISTER_GLOBAL_LOCK = makeSymbol("REGISTER-GLOBAL-LOCK");
  public static final SubLSymbol $sym98$_GLOBAL_LOCKS_ = makeSymbol("*GLOBAL-LOCKS*");
  public static final SubLList $list99 = cons(makeSymbol("GLOBAL"), makeSymbol("NAME"));
  public static final SubLSymbol $sym100$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym101$MAKE_LOCK = makeSymbol("MAKE-LOCK");
  public static final SubLSymbol $sym102$GLOBAL_LOCK_P = makeSymbol("GLOBAL-LOCK-P");
  public static final SubLSymbol $sym103$INITIALIZE_GLOBAL_LOCK_INTERNAL = makeSymbol("INITIALIZE-GLOBAL-LOCK-INTERNAL");
  public static final SubLSymbol $sym104$INITIALIZE_GLOBAL_LOCKS = makeSymbol("INITIALIZE-GLOBAL-LOCKS");
  public static final SubLSymbol $sym105$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym106$_FI_STATE_VARIABLES_ = makeSymbol("*FI-STATE-VARIABLES*");
  public static final SubLList $list107 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"));
  public static final SubLSymbol $sym108$DEFPARAMETER_HTML = makeSymbol("DEFPARAMETER-HTML");
  public static final SubLSymbol $sym109$CPUSHNEW = makeSymbol("CPUSHNEW");
  public static final SubLList $list110 = list(makeSymbol("*FI-STATE-VARIABLES*"));
  public static final SubLSymbol $sym111$CPROGV = makeSymbol("CPROGV");
  public static final SubLList $list112 = list(makeSymbol("MAKE-LIST"), list(makeSymbol("LENGTH"), makeSymbol("*FI-STATE-VARIABLES*")), NIL);
  public static final SubLSymbol $sym113$DEFPARAMETER = makeSymbol("DEFPARAMETER");
  public static final SubLSymbol $sym114$REGISTER_HTML_STATE_VARIABLE = makeSymbol("REGISTER-HTML-STATE-VARIABLE");
  public static final SubLSymbol $sym115$DEFVAR = makeSymbol("DEFVAR");
  public static final SubLSymbol $sym116$REGISTER_HTML_INTERFACE_VARIABLE = makeSymbol("REGISTER-HTML-INTERFACE-VARIABLE");
  public static final SubLList $list117 = list(makeSymbol("VARIABLE"), makeSymbol("STATE-VARIABLES"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), makeSymbol("TYPE"));
  public static final SubLSymbol $kw118$CYC_OPENCYC = makeKeyword("CYC-OPENCYC");
  public static final SubLSymbol $kw119$CYC_RESEARCHCYC = makeKeyword("CYC-RESEARCHCYC");
  public static final SubLSymbol $sym120$NOTE_STATE_VARIABLE_DOCUMENTATION = makeSymbol("NOTE-STATE-VARIABLE-DOCUMENTATION");
  public static final SubLSymbol $sym121$DEF_STATE_VARIABLE = makeSymbol("DEF-STATE-VARIABLE");
  public static final SubLSymbol $kw122$VARIABLE_DOC = makeKeyword("VARIABLE-DOC");
  public static final SubLSymbol $kw123$VARIABLE = makeKeyword("VARIABLE");
  public static final SubLSymbol $kw124$PARAMETER = makeKeyword("PARAMETER");
  public static final SubLSymbol $kw125$GLOBAL = makeKeyword("GLOBAL");
  public static final SubLSymbol $kw126$LEXICAL = makeKeyword("LEXICAL");
  public static final SubLSymbol $sym127$DEFLEXICAL = makeSymbol("DEFLEXICAL");
  public static final SubLSymbol $kw128$CONSTANT = makeKeyword("CONSTANT");
  public static final SubLSymbol $sym129$DEFCONSTANT = makeSymbol("DEFCONSTANT");
  public static final SubLSymbol $kw130$PARAMETER_PRIVATE = makeKeyword("PARAMETER-PRIVATE");
  public static final SubLSymbol $sym131$DEFPARAMETER_PRIVATE = makeSymbol("DEFPARAMETER-PRIVATE");
  public static final SubLSymbol $kw132$PARAMETER_PUBLIC = makeKeyword("PARAMETER-PUBLIC");
  public static final SubLSymbol $sym133$DEFPARAMETER_PUBLIC = makeSymbol("DEFPARAMETER-PUBLIC");
  public static final SubLSymbol $kw134$PARAMETER_PROTECTECD = makeKeyword("PARAMETER-PROTECTECD");
  public static final SubLString $str135$unknown_variable_type__s__ = makeString("unknown variable type ~s~%");
  public static final SubLSymbol $kw136$FUNCTION = makeKeyword("FUNCTION");
  public static final SubLSymbol $kw137$FUNCTION_DOC = makeKeyword("FUNCTION-DOC");
  public static final SubLSymbol $kw138$STRUCTURE = makeKeyword("STRUCTURE");
  public static final SubLSymbol $kw139$STRUCTURE_DOC = makeKeyword("STRUCTURE-DOC");
  public static final SubLSymbol $kw140$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw141$TYPE_DOC = makeKeyword("TYPE-DOC");
  public static final SubLSymbol $sym142$_GT_STATE_VARIABLES_ = makeSymbol("*GT-STATE-VARIABLES*");
  public static final SubLList $list143 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER")));
  public static final SubLSymbol $sym144$_AT_STATE_VARIABLES_ = makeSymbol("*AT-STATE-VARIABLES*");
  public static final SubLSymbol $sym145$_DEFN_STATE_VARIABLES_ = makeSymbol("*DEFN-STATE-VARIABLES*");
  public static final SubLList $list146 = list(makeSymbol("VARIABLE"), makeSymbol("&OPTIONAL"), makeSymbol("INITIALIZATION"), makeSymbol("DOCUMENTATION"), list(makeSymbol("TYPE"), makeKeyword("PARAMETER-PROTECTECD")));
  public static final SubLSymbol $sym147$_KBI_STATE_VARIABLES_ = makeSymbol("*KBI-STATE-VARIABLES*");
  public static final SubLSymbol $sym148$_KBP_STATE_VARIABLES_ = makeSymbol("*KBP-STATE-VARIABLES*");
  public static final SubLList $list149 = list(list(makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*NODES-ACCESSOR-FN*")), makeSymbol("*NODES-ACCESSOR-FN*"), list(makeSymbol("FUNCTION"), makeSymbol("ALL-ASSERTION-TERMS")))), list(makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-LINK-OP*")), makeSymbol("*PATH-LINK-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-LINK-OP")))), list(makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*PATH-NODE-OP*")), makeSymbol("*PATH-NODE-OP*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-NODE-OP")))), list(makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK?*")), makeSymbol("*RELEVANT-LINK?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK?")))), list(makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-NODE?*")), makeSymbol("*RELEVANT-NODE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-NODE?")))), list(makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FIF"), list(makeSymbol("FUNCTION-SPEC-P"), makeSymbol("*RELEVANT-LINK-TREE?*")), makeSymbol("*RELEVANT-LINK-TREE?*"), list(makeSymbol("FUNCTION"), makeSymbol("DEFAULT-RELEVANT-LINK-TREE?")))));
  public static final SubLList $list150 = list(list(makeSymbol("MACHINE"), makeSymbol("PORT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym151$CYC_API_REMOTE_EVAL = makeSymbol("CYC-API-REMOTE-EVAL");
  public static final SubLList $list152 = list(list(makeSymbol("ENVIRONMENT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list153 = list(makeSymbol("QUEUE-P"));
  public static final SubLSymbol $sym154$_FORWARD_INFERENCE_ENVIRONMENT_ = makeSymbol("*FORWARD-INFERENCE-ENVIRONMENT*");
  public static final SubLSymbol $sym155$ENVIRONMENT = makeUninternedSymbol("ENVIRONMENT");
  public static final SubLList $list156 = list(list(makeSymbol("GET-FORWARD-INFERENCE-ENVIRONMENT")));
  public static final SubLSymbol $sym157$WITH_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-FORWARD-INFERENCE-ENVIRONMENT");
  public static final SubLList $list158 = list(list(makeSymbol("*CURRENT-FORWARD-PROBLEM-STORE*"), NIL));
  public static final SubLSymbol $sym159$CUNWIND_PROTECT = makeSymbol("CUNWIND-PROTECT");
  public static final SubLList $list160 = list(list(makeSymbol("CLEAR-CURRENT-FORWARD-PROBLEM-STORE")));
  public static final SubLList $list161 = list(list(makeSymbol("*WITHIN-ASSERTION-FORWARD-PROPAGATION?*"), NIL), list(makeSymbol("*PREFER-FORWARD-SKOLEMIZATION*"), NIL));
  public static final SubLSymbol $sym162$WITH_NORMAL_FORWARD_INFERENCE_PARAMETERS = makeSymbol("WITH-NORMAL-FORWARD-INFERENCE-PARAMETERS");
  public static final SubLSymbol $sym163$WITH_CLEAN_FORWARD_INFERENCE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-INFERENCE-ENVIRONMENT");
  public static final SubLSymbol $sym164$WITH_CLEAN_FORWARD_PROBLEM_STORE_ENVIRONMENT = makeSymbol("WITH-CLEAN-FORWARD-PROBLEM-STORE-ENVIRONMENT");
  public static final SubLSymbol $sym165$ERROR = makeUninternedSymbol("ERROR");
  public static final SubLSymbol $sym166$CATCH_ERROR_MESSAGE = makeSymbol("CATCH-ERROR-MESSAGE");
  public static final SubLList $list167 = list(list(makeSymbol("THROW-UNEVALUATABLE")));
  public static final SubLList $list168 = list(list(makeSymbol("TRACEE"), makeSymbol("LEVEL")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym169$TRACING_AT_LEVEL = makeSymbol("TRACING-AT-LEVEL");
  public static final SubLList $list170 = list(makeSymbol("RESOURCE?"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw171$SL2JAVA = makeKeyword("SL2JAVA");
  public static final SubLSymbol $sym172$_STRUCTURE_RESOURCING_MAKE_STATIC_ = makeSymbol("*STRUCTURE-RESOURCING-MAKE-STATIC*");
  public static final SubLSymbol $sym173$WITH_STATIC_AREA = makeSymbol("WITH-STATIC-AREA");
  public static final SubLList $list174 = list(makeSymbol("STRUCTURE"), makeSymbol("LINK-SLOT"), makeSymbol("MARK-SLOT"), list(makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str175$__A_FREE_LIST_ = makeString("*~A-FREE-LIST*");
  public static final SubLString $str176$Free_list_for__A_objects = makeString("Free list for ~A objects");
  public static final SubLString $str177$__A_FREE_LOCK_ = makeString("*~A-FREE-LOCK*");
  public static final SubLString $str178$Lock_for__A_object_free_list = makeString("Lock for ~A object free list");
  public static final SubLString $str179$_A_resource_lock = makeString("~A resource lock");
  public static final SubLString $str180$MAKE_STATIC__A = makeString("MAKE-STATIC-~A");
  public static final SubLString $str181$Make_a_new__A_in_the_static_area = makeString("Make a new ~A in the static area");
  public static final SubLString $str182$INIT__A = makeString("INIT-~A");
  public static final SubLString $str183$Initialize_a__A_for_use = makeString("Initialize a ~A for use");
  public static final SubLString $str184$GET__A = makeString("GET-~A");
  public static final SubLString $str185$Get_a__A_from_the_free_list__or_m = makeString("Get a ~A from the free list, or make a new one if needed");
  public static final SubLString $str186$FREE__A_P = makeString("FREE-~A-P");
  public static final SubLString $str187$Check_if_OBJECT_is_a__A_that_has_ = makeString("Check if OBJECT is a ~A that has been explicitly freed");
  public static final SubLString $str188$FREE__A = makeString("FREE-~A");
  public static final SubLString $str189$Place_a__A_onto_the_free_list = makeString("Place a ~A onto the free list");
  public static final SubLString $str190$MAKE__A = makeString("MAKE-~A");
  public static final SubLString $str191$_A_P = makeString("~A-P");
  public static final SubLSymbol $sym192$DEFLEXICAL_PRIVATE = makeSymbol("DEFLEXICAL-PRIVATE");
  public static final SubLSymbol $sym193$OBJECT = makeSymbol("OBJECT");
  public static final SubLList $list194 = list(list(makeSymbol("RET"), makeSymbol("OBJECT")));
  public static final SubLSymbol $sym195$CAND = makeSymbol("CAND");
  public static final SubLList $list196 = list(makeKeyword("FREE"));
  public static final SubLSymbol $sym197$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym198$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym199$_STRUCTURE_RESOURCING_ENABLED_ = makeSymbol("*STRUCTURE-RESOURCING-ENABLED*");
  public static final SubLList $list200 = list(list(makeSymbol("RET"), T));
  public static final SubLList $list201 = list(list(makeSymbol("RET"), NIL));
  public static final SubLList $list202 = list(makeSymbol("OBJECT"), makeSymbol("FOUND"));
  public static final SubLSymbol $sym203$CDO = makeSymbol("CDO");
  public static final SubLList $list204 = list(list(makeSymbol("COR"), makeSymbol("FOUND"), list(makeSymbol("NULL"), makeSymbol("OBJECT"))));
  public static final SubLList $list205 = list(list(makeSymbol("CSETQ"), makeSymbol("FOUND"), T));
  public static final SubLSymbol $sym206$FOUND = makeSymbol("FOUND");
  public static final SubLList $list207 = list(NIL);
  public static final SubLList $list208 = list(makeSymbol("STRING"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list209 = list(list(makeSymbol("*NOTING-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));
  public static final SubLSymbol $sym210$NOTING_PROGRESS_PREAMBLE = makeSymbol("NOTING-PROGRESS-PREAMBLE");
  public static final SubLList $list211 = list(list(makeSymbol("NOTING-PROGRESS-POSTAMBLE")));
  public static final SubLSymbol $sym212$NOTING_PROGRESS = makeSymbol("NOTING-PROGRESS");
  public static final SubLString $str213$___A = makeString("~&~A");
  public static final SubLSymbol $sym214$NOTING_PROGRESS_POSTAMBLE = makeSymbol("NOTING-PROGRESS-POSTAMBLE");
  public static final SubLString $str215$_DONE__ = makeString(" DONE (");
  public static final SubLString $str216$_ = makeString(")");
  public static final SubLList $list217 = list(list(makeSymbol("*LAST-PERCENT-PROGRESS-INDEX*"), ZERO_INTEGER), list(makeSymbol("*LAST-PERCENT-PROGRESS-PREDICTION*"), NIL), list(makeSymbol("*WITHIN-NOTING-PERCENT-PROGRESS*"), T), list(makeSymbol("*PERCENT-PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME"))));
  public static final SubLSymbol $sym218$NOTING_PERCENT_PROGRESS_PREAMBLE = makeSymbol("NOTING-PERCENT-PROGRESS-PREAMBLE");
  public static final SubLList $list219 = list(list(makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE")));
  public static final SubLSymbol $sym220$NOTING_PERCENT_PROGRESS = makeSymbol("NOTING-PERCENT-PROGRESS");
  public static final SubLString $str221$___A____ = makeString("~&~A~% [");
  public static final SubLSymbol $sym222$NOTING_PERCENT_PROGRESS_POSTAMBLE = makeSymbol("NOTING-PERCENT-PROGRESS-POSTAMBLE");
  public static final SubLInteger $int223$600 = makeInteger(600);
  public static final SubLString $str224$__ended__A = makeString(", ended ~A");
  public static final SubLString $str225$___ = makeString(") ]");
  public static final SubLSymbol $sym226$NOTE_PERCENT_PROGRESS = makeSymbol("NOTE-PERCENT-PROGRESS");
  public static final SubLString $str227$_ = makeString(".");
  public static final SubLInteger $int228$300 = makeInteger(300);
  public static final SubLInteger $int229$1200 = makeInteger(1200);
  public static final SubLInteger $int230$60 = makeInteger(60);
  public static final SubLString $str231$_ = makeString(" ");
  public static final SubLString $str232$_ = makeString("%");
  public static final SubLString $str233$0 = makeString("0");
  public static final SubLString $str234$__ = makeString(" (");
  public static final SubLString $str235$_of_ = makeString(" of ");
  public static final SubLString $str236$__ending__ = makeString(", ending ~");
  public static final SubLString $str237$__ = makeString("  ");
  public static final SubLInteger $int238$99 = makeInteger(99);
  public static final SubLString $str239$ = makeString("");
  public static final SubLString $str240$___A____D_of__D___02D___Done_at__ = makeString("~%~A : ~D of ~D (~02D%) Done at ~A");
  public static final SubLString $str241$whenever = makeString("whenever");
  public static final SubLList $list242 = list(list(makeSymbol("VAR"), makeSymbol("TOTAL"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdotimes"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str243$cdotimes = makeString("cdotimes");
  public static final SubLSymbol $sym244$_PROGRESS_NOTE_ = makeSymbol("*PROGRESS-NOTE*");
  public static final SubLList $list245 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-START-TIME*"), list(makeSymbol("GET-UNIVERSAL-TIME")));
  public static final SubLSymbol $sym246$_PROGRESS_TOTAL_ = makeSymbol("*PROGRESS-TOTAL*");
  public static final SubLList $list247 = list(makeSymbol("CSETQ"), makeSymbol("*PROGRESS-SOFAR*"), ZERO_INTEGER);
  public static final SubLSymbol $sym248$CDOTIMES = makeSymbol("CDOTIMES");
  public static final SubLList $list249 = list(makeSymbol("*PROGRESS-TOTAL*"));
  public static final SubLList $list250 = list(makeSymbol("NOTE-PERCENT-PROGRESS"), makeSymbol("*PROGRESS-SOFAR*"), makeSymbol("*PROGRESS-TOTAL*"));
  public static final SubLList $list251 = list(makeSymbol("CINC"), makeSymbol("*PROGRESS-SOFAR*"));
  public static final SubLList $list252 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist")), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str253$cdolist = makeString("cdolist");
  public static final SubLSymbol $sym254$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLSymbol $sym255$LENGTH = makeSymbol("LENGTH");
  public static final SubLSymbol $sym256$CSOME = makeSymbol("CSOME");
  public static final SubLSymbol $sym257$PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");
  public static final SubLList $list258 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdolist"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym259$PROGRESS_CSOME = makeSymbol("PROGRESS-CSOME");
  public static final SubLList $list260 = list(list(makeSymbol("VAR"), makeSymbol("LIST"), makeSymbol("&OPTIONAL"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym261$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym262$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list263 = list(list(makeSymbol("KEY"), makeSymbol("VAL"), makeSymbol("TABLE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("cdohash"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str264$cdohash = makeString("cdohash");
  public static final SubLSymbol $sym265$TABLE_VAR = makeUninternedSymbol("TABLE-VAR");
  public static final SubLSymbol $sym266$HASH_TABLE_COUNT = makeSymbol("HASH-TABLE-COUNT");
  public static final SubLSymbol $sym267$CDOHASH = makeSymbol("CDOHASH");
  public static final SubLList $list268 = list(list(makeSymbol("ELEM"), makeSymbol("SET"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("do-set"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str269$do_set = makeString("do-set");
  public static final SubLSymbol $sym270$SET_VAR = makeUninternedSymbol("SET-VAR");
  public static final SubLSymbol $sym271$SET_SIZE = makeSymbol("SET-SIZE");
  public static final SubLSymbol $sym272$DO_SET = makeSymbol("DO-SET");
  public static final SubLList $list273 = list(list(makeSymbol("&KEY"), makeSymbol("MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list274 = list(makeKeyword("MESSAGE"));
  public static final SubLSymbol $kw275$MESSAGE = makeKeyword("MESSAGE");
  public static final SubLSymbol $sym276$MESSAGE_VAR = makeUninternedSymbol("MESSAGE-VAR");
  public static final SubLSymbol $sym277$START_TIME = makeUninternedSymbol("START-TIME");
  public static final SubLSymbol $sym278$NOTING_ELAPSED_TIME_PREAMBLE = makeSymbol("NOTING-ELAPSED-TIME-PREAMBLE");
  public static final SubLSymbol $sym279$NOTING_ELAPSED_TIME_POSTAMBLE = makeSymbol("NOTING-ELAPSED-TIME-POSTAMBLE");
  public static final SubLSymbol $sym280$NOTING_ELAPSED_TIME = makeSymbol("NOTING-ELAPSED-TIME");
  public static final SubLString $str281$___A_started__at__A = makeString("~&~A started  at ~A");
  public static final SubLString $str282$___A_finished_at__A_after_A = makeString("~&~A finished at ~A after~A");
  public static final SubLSymbol $sym283$WITH_SUBLISP_ERROR_HANDLING = makeSymbol("WITH-SUBLISP-ERROR-HANDLING");
  public static final SubLList $list284 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("DOUBLE-FLOAT"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL), list(makeSymbol("OLD-PRIORITY"), list(makeSymbol("PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")))));
  public static final SubLList $list285 = list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("*PROCESS-NORMAL-PRIORITY*"));
  public static final SubLList $list286 = list(list(makeSymbol("SET-PROCESS-PRIORITY"), list(makeSymbol("CURRENT-PROCESS")), makeSymbol("OLD-PRIORITY")));
  public static final SubLList $list287 = list(list(makeSymbol("*PACKAGE*"), list(makeSymbol("FIND-PACKAGE"), makeString("CYC"))), list(makeSymbol("*PRINT-READABLY*"), NIL), list(makeSymbol("*READ-EVAL*"), NIL));
  public static final SubLSymbol $sym288$WITH_CYC_SERVER_HANDLING = makeSymbol("WITH-CYC-SERVER-HANDLING");
  public static final SubLSymbol $sym289$WITH_CYC_IO_SYNTAX = makeSymbol("WITH-CYC-IO-SYNTAX");
  public static final SubLList $list290 = list(list(makeSymbol("*READ-DEFAULT-FLOAT-FORMAT*"), list(makeSymbol("QUOTE"), makeSymbol("DOUBLE-FLOAT"))));
  public static final SubLList $list291 = list(list(makeSymbol("CYCLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym292$OLD_CYCLIST = makeUninternedSymbol("OLD-CYCLIST");
  public static final SubLList $list293 = list(list(makeSymbol("THE-CYCLIST")));
  public static final SubLSymbol $sym294$SET_THE_CYCLIST = makeSymbol("SET-THE-CYCLIST");
  public static final SubLList $list295 = list(list(makeSymbol("*THE-CYCLIST*"), NIL));
  public static final SubLList $list296 = list(makeSymbol("EL-VARIABLES"), makeSymbol("BINDINGS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym297$BINDING = makeUninternedSymbol("BINDING");
  public static final SubLSymbol $sym298$SUBLIS = makeSymbol("SUBLIS");
  public static final SubLString $str299$_S___var__S_is_not_a_symbol_ = makeString("~S - var ~S is not a symbol.");
  public static final SubLString $str300$_S___function__S_is_not_a_symbol_ = makeString("~S - function ~S is not a symbol.");
  public static final SubLString $str301$_S___search_type__S_is_not_one_of = makeString("~S - search type ~S is not one of (:depth-first :breadth-first).");
  public static final SubLList $list302 = list(makeSymbol("LIST"));
  public static final SubLSymbol $sym303$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym304$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym305$CONSP = makeSymbol("CONSP");
  public static final SubLList $list306 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym307$CDOSUBLISTS = makeSymbol("CDOSUBLISTS");
  public static final SubLList $list308 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SUBLIST-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym309$CDOLIST_AND_SUBLISTS = makeSymbol("CDOLIST-AND-SUBLISTS");
  public static final SubLString $str310$next_cons_var = makeString("next-cons-var");
  public static final SubLList $list311 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str312$sublist = makeString("sublist");
  public static final SubLSymbol $sym313$WHILE = makeSymbol("WHILE");
  public static final SubLList $list314 = list(list(makeSymbol("VAR"), makeSymbol("PREDICATE"), makeSymbol("LIST-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym315$CDOLIST_IF = makeSymbol("CDOLIST-IF");
  public static final SubLSymbol $sym316$CDOSUBLISTS_IF = makeSymbol("CDOSUBLISTS-IF");
  public static final SubLSymbol $sym317$CDOLIST_IF_NOT = makeSymbol("CDOLIST-IF-NOT");
  public static final SubLSymbol $sym318$CDOSUBLISTS_IF_NOT = makeSymbol("CDOSUBLISTS-IF-NOT");
  public static final SubLList $list319 = list(list(makeSymbol("VAR1"), makeSymbol("LIST1"), makeSymbol("VAR2"), makeSymbol("LIST2")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str320$sublist1 = makeString("sublist1");
  public static final SubLString $str321$sublist2 = makeString("sublist2");
  public static final SubLList $list322 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST")), list(makeSymbol("VISIT-NILS"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw323$DEPTH_FIRST = makeKeyword("DEPTH-FIRST");
  public static final SubLSymbol $sym324$CDOTREE = makeSymbol("CDOTREE");
  public static final SubLSymbol $kw325$BREADTH_FIRST = makeKeyword("BREADTH-FIRST");
  public static final SubLString $str326$tree_var = makeString("tree-var");
  public static final SubLString $str327$cells_var = makeString("cells-var");
  public static final SubLString $str328$tail_of_cells = makeString("tail-of-cells");
  public static final SubLSymbol $sym329$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym330$LAST = makeSymbol("LAST");
  public static final SubLSymbol $sym331$RPLACD = makeSymbol("RPLACD");
  public static final SubLSymbol $sym332$CPUSH = makeSymbol("CPUSH");
  public static final SubLList $list333 = list(list(makeSymbol("VAR"), makeSymbol("TREE"), makeSymbol("&OPTIONAL"), list(makeSymbol("SEARCH-TYPE"), makeKeyword("DEPTH-FIRST"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym334$CDOTREE_CONSES = makeSymbol("CDOTREE-CONSES");
  public static final SubLString $str335$tail_of_cells_var = makeString("tail-of-cells-var");
  public static final SubLList $list336 = list(list(makeSymbol("PARAMETER"), makeSymbol("VALUE"), makeSymbol("PLIST")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym337$DO_PLIST = makeSymbol("DO-PLIST");
  public static final SubLSymbol $sym338$CAAR = makeSymbol("CAAR");
  public static final SubLSymbol $sym339$CDAR = makeSymbol("CDAR");
  public static final SubLSymbol $sym340$CADR = makeSymbol("CADR");
  public static final SubLSymbol $sym341$CDDR = makeSymbol("CDDR");
  public static final SubLList $list342 = list(makeSymbol("PATTERN"), makeSymbol("DATUM"));
  public static final SubLString $str343$datum_evaluated_var = makeString("datum-evaluated-var");
  public static final SubLSymbol $sym344$NCONC = makeSymbol("NCONC");
  public static final SubLString $str345$FAST_FUNCALL_NO_VALUE__contains_e = makeString("FAST-FUNCALL-NO-VALUE: contains erroneous function name it its function name list.");
  public static final SubLString $str346$FAST_FUNCALL_NO_VALUE__cannot_acc = makeString("FAST-FUNCALL-NO-VALUE: cannot accept dotted list for its function name list.");
  public static final SubLString $str347$FAST_FUNCALL_NO_VALUE__function_n = makeString("FAST-FUNCALL-NO-VALUE: function name list must be a list.");
  public static final SubLList $list348 = list(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym349$FUNCALL = makeSymbol("FUNCALL");
  public static final SubLString $str350$function_form_evaluated_var = makeString("function-form-evaluated-var");
  public static final SubLSymbol $sym351$PCASE = makeSymbol("PCASE");
  public static final SubLSymbol $sym352$OTHERWISE = makeSymbol("OTHERWISE");
  public static final SubLList $list353 = list(makeSymbol("VAR-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLList $list354 = list(makeSymbol("VARS-TO-BIND"), listS(makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("ARGS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym355$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLList $list356 = list(makeSymbol("VARS-TO-SET"), makeSymbol("FUNCTION-FORM"), makeSymbol("FUNCTION-NAME-LIST"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLSymbol $sym357$CMULTIPLE_VALUE_SETQ = makeSymbol("CMULTIPLE-VALUE-SETQ");
  public static final SubLList $list358 = list(makeSymbol("FUNCTION"), makeSymbol("&REST"), makeSymbol("ARGS"));
  public static final SubLList $list359 = list(makeSymbol("PREDICATION-STRUCTURE"), makeSymbol("OPERAND"));
  public static final SubLList $list360 = list(makeSymbol("INLINE-SET-SYMBOL"), makeSymbol("INLINE-GET-SYMBOL"), makeSymbol("INLINE-METHOD"));
  public static final SubLString $str361$_A_S = makeString("~A~S");
  public static final SubLList $list362 = list(list(makeSymbol("VAR"), makeSymbol("LIST-EXPRESSION"), makeSymbol("COLLECTION-VAR")), makeSymbol("ITERATED-EXPRESSION"));
  public static final SubLString $str363$LIST_EXPRESSION = makeString("LIST-EXPRESSION");
  public static final SubLString $str364$TAIL_CONS = makeString("TAIL-CONS");
  public static final SubLString $str365$RESULT = makeString("RESULT");
  public static final SubLSymbol $sym366$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym367$ATOM = makeSymbol("ATOM");
  public static final SubLSymbol $kw368$API = makeKeyword("API");
  public static final SubLSymbol $sym369$DEFINE_API = makeSymbol("DEFINE-API");
  public static final SubLSymbol $kw370$PUBLIC = makeKeyword("PUBLIC");
  public static final SubLSymbol $kw371$PROTECTED = makeKeyword("PROTECTED");
  public static final SubLSymbol $sym372$DEFINE_PROTECTED = makeSymbol("DEFINE-PROTECTED");
  public static final SubLSymbol $kw373$PRIVATE = makeKeyword("PRIVATE");
  public static final SubLSymbol $kw374$ALL = makeKeyword("ALL");
  public static final SubLList $list375 = list(makeSymbol("PUNLESS"), list(makeSymbol("LISTP"), makeSymbol("LIST")), list(makeSymbol("RET"), NIL));
  public static final SubLSymbol $kw376$NOT_EMPTY_ALL = makeKeyword("NOT-EMPTY-ALL");
  public static final SubLList $list377 = list(makeSymbol("PUNLESS"), list(makeSymbol("CONSP"), makeSymbol("LIST")), list(makeSymbol("RET"), NIL));
  public static final SubLSymbol $kw378$ANY = makeKeyword("ANY");
  public static final SubLString $str379$DEFINE_LIST_ELEMENT_PREDICATOR___ = makeString("DEFINE-LIST-ELEMENT-PREDICATOR: ~S is not a valid type value.");
  public static final SubLList $list380 = list(makeSymbol("FUNCTION-NAME"), makeSymbol("TYPE"), list(makeSymbol("ELEMENT-VAR")), makeSymbol("EXPRESSION"));
  public static final SubLSymbol $sym381$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym382$CAR_IF_LIST = makeSymbol("CAR-IF-LIST");
  public static final SubLString $str383$FCOND___S_is_not_a_valid_clause_l = makeString("FCOND: ~S is not a valid clause list.");
  public static final SubLString $str384$FCOND___S_is_not_a_valid_clause_ = makeString("FCOND: ~S is not a valid clause.");
  public static final SubLSymbol $sym385$FIF = makeSymbol("FIF");
  public static final SubLString $str386$P_RANGE_CASE__Ill_formed_clauses_ = makeString("P-RANGE-CASE: Ill-formed clauses encountered -> ~S.");
  public static final SubLString $str387$P_RANGE_CASE___S_is_not_a_valid_c = makeString("P-RANGE-CASE: ~S is not a valid clause.");
  public static final SubLString $str388$value = makeString("value");
  public static final SubLSymbol $sym389$__ = makeSymbol(">=");
  public static final SubLSymbol $sym390$__ = makeSymbol("<=");
  public static final SubLSymbol $sym391$_ = makeSymbol("=");
  public static final SubLList $list392 = list(makeSymbol("VALUE"), makeSymbol("&BODY"), makeSymbol("CLAUSES"));
  public static final SubLSymbol $sym393$ERROR = makeSymbol("ERROR");
  public static final SubLString $str394$Invalid_version_code__A_ = makeString("Invalid version code ~A.");
  public static final SubLList $list395 = list(list(makeSymbol("VERSION")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));
  public static final SubLList $list396 = list(makeKeyword("ERROR-CLAUSE"));
  public static final SubLSymbol $kw397$ERROR_CLAUSE = makeKeyword("ERROR-CLAUSE");
  public static final SubLList $list398 = list(makeSymbol("VERSION"), makeSymbol("FORM"));
  public static final SubLList $list399 = list(list(makeSymbol("MAJOR"), makeSymbol("MINOR")), makeSymbol("VERSION-BODIES"), makeSymbol("&KEY"), makeSymbol("ERROR-CLAUSE"));
  public static final SubLList $list400 = list(makeSymbol("MAJOR-VERSION"), makeSymbol("MINOR-VERSION"), makeSymbol("FORM"));
  public static final SubLSymbol $sym401$SUB_KB_LOADED_P_SYMBOL = makeSymbol("SUB-KB-LOADED-P-SYMBOL");
  public static final SubLSymbol $sym402$DECLARE_KB_FEATURE = makeSymbol("DECLARE-KB-FEATURE");
  public static final SubLString $str403$_P = makeString("-P");
  public static final SubLSymbol $sym404$SUB_KB_SET_SYMBOL = makeSymbol("SUB-KB-SET-SYMBOL");
  public static final SubLString $str405$SET_ = makeString("SET-");
  public static final SubLSymbol $sym406$SUB_KB_UNSET_SYMBOL = makeSymbol("SUB-KB-UNSET-SYMBOL");
  public static final SubLString $str407$UNSET_ = makeString("UNSET-");
  public static final SubLList $list408 = list(makeSymbol("SUB-KB-SYMBOL"), makeSymbol("LOADED-DOC-STRING"));
  public static final SubLSymbol $sym409$DEFGLOBAL_PRIVATE = makeSymbol("DEFGLOBAL-PRIVATE");
  public static final SubLList $list410 = list(makeSymbol("*KB-FEATURES*"));
  public static final SubLList $list411 = list(T);
  public static final SubLSymbol $kw412$A = makeKeyword("A");
  public static final SubLSymbol $kw413$S = makeKeyword("S");
  public static final SubLSymbol $kw414$D = makeKeyword("D");
  public static final SubLSymbol $sym415$TO_STRING = makeSymbol("TO-STRING");
  public static final SubLSymbol $sym416$CCONCATENATE = makeSymbol("CCONCATENATE");
  public static final SubLList $list417 = list(makeKeyword("A"), makeKeyword("S"), makeKeyword("D"));
  public static final SubLString $str418$FORMAT_TO_STRING___S_is_an_invali = makeString("FORMAT-TO-STRING: ~S is an invalid format arg.  ~\n           Format args must be a member of the set {:A, :S, :D}.");
  public static final SubLString $str419$FORMAT_TO_STRING__Odd_number_of_a = makeString("FORMAT-TO-STRING: Odd number of args encountered: ~S");
  public static final SubLSymbol $sym420$TIME = makeUninternedSymbol("TIME");
  public static final SubLSymbol $sym421$CTIME = makeSymbol("CTIME");
  public static final SubLSymbol $sym422$FORMAT = makeSymbol("FORMAT");
  public static final SubLString $str423$_____real_time__A_seconds__ = makeString("~&;; real time ~A seconds~%");
  public static final SubLList $list424 = list(makeSymbol("VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym425$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLSymbol $sym426$CLOCK_TIME = makeUninternedSymbol("CLOCK-TIME");
  public static final SubLSymbol $sym427$WITH_PROCESS_RESOURCE_TRACKING = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING");
  public static final SubLSymbol $sym428$CONVERT_PROCESS_RESOURCE_TRACKING_TIMING_INFO_TO_SECONDS = makeSymbol("CONVERT-PROCESS-RESOURCE-TRACKING-TIMING-INFO-TO-SECONDS");
  public static final SubLSymbol $sym429$NADD_CLOCK_TIME_TO_PROCESS_RESOURCE_TIMING_INFO = makeSymbol("NADD-CLOCK-TIME-TO-PROCESS-RESOURCE-TIMING-INFO");
  public static final SubLList $list430 = list(makeKeyword("USER-TIME"), makeKeyword("SYSTEM-TIME"));
  public static final SubLSymbol $sym431$WITH_PROCESS_RESOURCE_TRACKING_IN_SECONDS = makeSymbol("WITH-PROCESS-RESOURCE-TRACKING-IN-SECONDS");
  public static final SubLInteger $int432$10000000 = makeInteger(10000000);
  public static final SubLSymbol $kw433$WALL_CLOCK_TIME = makeKeyword("WALL-CLOCK-TIME");
  public static final SubLSymbol $kw434$USER_TIME = makeKeyword("USER-TIME");
  public static final SubLSymbol $kw435$SYSTEM_TIME = makeKeyword("SYSTEM-TIME");
  public static final SubLSymbol $sym436$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLString $str437$______s__ = makeString("~&;; ~s~%");
  public static final SubLSymbol $sym438$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLSymbol $sym439$PROCESS_RESOURCE_TRACKING_USER_TIME = makeSymbol("PROCESS-RESOURCE-TRACKING-USER-TIME");
  public static final SubLSymbol $sym440$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLSymbol $sym441$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLSymbol $sym442$PROCESS_RESOURCE_TRACKING_SYSTEM_TIME = makeSymbol("PROCESS-RESOURCE-TRACKING-SYSTEM-TIME");
  public static final SubLSymbol $sym443$TIMING_INFO = makeUninternedSymbol("TIMING-INFO");
  public static final SubLList $list444 = list(makeSymbol("OBJECT"), makeSymbol("PRED"));
  public static final SubLList $list445 = list(makeSymbol("LIST"), makeSymbol("PRED"));
  public static final SubLSymbol $sym446$ELEM = makeUninternedSymbol("ELEM");
  public static final SubLSymbol $sym447$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLList $list448 = list(makeSymbol("NON-DOTTED-LIST-P"));
  public static final SubLList $list449 = list(makeSymbol("PLIST"), makeSymbol("PRED"));
  public static final SubLSymbol $sym450$PROPERTY = makeUninternedSymbol("PROPERTY");
  public static final SubLSymbol $sym451$VALUE = makeUninternedSymbol("VALUE");
  public static final SubLSymbol $sym452$PLIST_VAR = makeUninternedSymbol("PLIST-VAR");
  public static final SubLList $list453 = list(makeSymbol("PROPERTY-LIST-P"));
  public static final SubLSymbol $sym454$IGNORE = makeSymbol("IGNORE");
  public static final SubLList $list455 = list(makeSymbol("OBJECT"), makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("FORMAT-ARGUMENTS"));
  public static final SubLSymbol $sym456$MUST = makeSymbol("MUST");
  public static final SubLList $list457 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $sym458$SWAP_VAR = makeUninternedSymbol("SWAP-VAR");
  public static final SubLList $list459 = list(makeSymbol("VARIABLE"), list(makeSymbol("&KEY"), makeSymbol("DOCUMENTATION"), makeSymbol("DEFINER"), makeSymbol("ACCESS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list460 = list(makeKeyword("DOCUMENTATION"), makeKeyword("DEFINER"), makeKeyword("ACCESS"));
  public static final SubLSymbol $kw461$DEFINER = makeKeyword("DEFINER");
  public static final SubLSymbol $kw462$ACCESS = makeKeyword("ACCESS");
  public static final SubLString $str463$_A_INITIALIZER = makeString("~A-INITIALIZER");
  public static final SubLSymbol $sym464$PROCLAIM = makeSymbol("PROCLAIM");
  public static final SubLSymbol $kw465$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym466$REGISTER_KB_VARIABLE_INITIALIZATION = makeSymbol("REGISTER-KB-VARIABLE-INITIALIZATION");
  public static final SubLSymbol $sym467$_KB_VAR_INITIALIZATIONS_ = makeSymbol("*KB-VAR-INITIALIZATIONS*");
  public static final SubLSymbol $sym468$DEF_KB_VARIABLE = makeSymbol("DEF-KB-VARIABLE");
  public static final SubLString $str469$Initializing_KB_variables___ = makeString("Initializing KB variables...");
  public static final SubLList $list470 = cons(makeSymbol("VAR-SYMBOL"), makeSymbol("FUNC"));
  public static final SubLList $list471 = list(makeSymbol("GETTER"), makeSymbol("INITIALIZATION-FORM"), makeSymbol("&KEY"), makeSymbol("VAR"), list(makeSymbol("VACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PRIVATE"))), list(makeSymbol("FACCESS"), list(makeSymbol("QUOTE"), makeSymbol("PRIVATE"))), makeSymbol("DOCUMENTATION"));
  public static final SubLList $list472 = list(makeKeyword("VAR"), makeKeyword("VACCESS"), makeKeyword("FACCESS"), makeKeyword("DOCUMENTATION"));
  public static final SubLSymbol $kw473$VAR = makeKeyword("VAR");
  public static final SubLSymbol $sym474$PRIVATE = makeSymbol("PRIVATE");
  public static final SubLSymbol $kw475$FACCESS = makeKeyword("FACCESS");
  public static final SubLString $str476$_ = makeString("*");
  public static final SubLString $str477$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFPARAMETER-LAZY is the getter function, not the variable name.");
  public static final SubLSymbol $sym478$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");
  public static final SubLSymbol $sym479$FACCESS = makeSymbol("FACCESS");
  public static final SubLList $list480 = list(makeKeyword("UNINITIALIZED"));
  public static final SubLSymbol $sym481$EVAL = makeSymbol("EVAL");
  public static final SubLString $str482$Unable_to_initialize__A__ = makeString("Unable to initialize ~A~%");
  public static final SubLString $str483$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFVAR-LAZY is the getter function, not the variable name.");
  public static final SubLSymbol $sym484$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");
  public static final SubLString $str485$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFGLOBAL-LAZY is the getter function, not the variable name.");
  public static final SubLSymbol $sym486$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");
  public static final SubLString $str487$Invalid_function_name__A___The_fi = makeString("Invalid function-name ~A.  The first arg of DEFLEXICAL-LAZY is the getter function, not the variable name.");
  public static final SubLSymbol $sym488$INIT_VALUE = makeUninternedSymbol("INIT-VALUE");
  public static final SubLList $list489 = list(makeSymbol("NAME"), makeSymbol("ARGLIST"), makeSymbol("DOCUMENTATION-STRING"), makeSymbol("DECLARATIONS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym490$REGISTER_OBSOLETE_CYC_API_FUNCTION = makeSymbol("REGISTER-OBSOLETE-CYC-API-FUNCTION");
  public static final SubLSymbol $kw491$OBSOLETE_CYC_API_REPLACEMENTS = makeKeyword("OBSOLETE-CYC-API-REPLACEMENTS");
  public static final SubLInteger $int492$40 = makeInteger(40);
  public static final SubLSymbol $sym493$INITIALIZATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("INITIALIZATION-FOR-PARTIAL-LIST-RESULTS");
  public static final SubLSymbol $sym494$ACCUMULATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("ACCUMULATION-FOR-PARTIAL-LIST-RESULTS");
  public static final SubLSymbol $sym495$CONSOLIDATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("CONSOLIDATION-FOR-PARTIAL-LIST-RESULTS");
  public static final SubLSymbol $sym496$NOTIFICATION_FOR_PARTIAL_LIST_RESULTS = makeSymbol("NOTIFICATION-FOR-PARTIAL-LIST-RESULTS");
  public static final SubLSymbol $sym497$FINAL_RESULTS_FOR_PARTIAL_LIST_RESULTS = makeSymbol("FINAL-RESULTS-FOR-PARTIAL-LIST-RESULTS");
  public static final SubLList $list498 = list(list(makeSymbol("FINAL-RESULT-VAR"), makeSymbol("THRESHOLD")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list499 = list(makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));
  public static final SubLList $list500 = list(makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*"), list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-INITIALIZATION-FN*")));
  public static final SubLSymbol $sym501$_PARTIAL_RESULTS_THRESHOLD_ = makeSymbol("*PARTIAL-RESULTS-THRESHOLD*");
  public static final SubLList $list502 = list(list(makeSymbol("*PARTIAL-RESULTS-SIZE*"), ZERO_INTEGER), list(makeSymbol("*PARTIAL-RESULTS-TOTAL-SIZE*"), ZERO_INTEGER), list(makeSymbol("*ACCUMULATING-PARTIAL-RESULTS?*"), T));
  public static final SubLList $list503 = list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-CONSOLIDATION-FN*"), makeSymbol("*PARTIAL-RESULTS-ACCUMULATOR*"));
  public static final SubLList $list504 = list(list(makeSymbol("FUNCALL"), makeSymbol("*PARTIAL-RESULTS-FINAL-RESULT-FN*"), makeSymbol("*PARTIAL-RESULTS-TOTAL-ACCUMULATOR*")));
  public static final SubLSymbol $sym505$WITH_SPACE_PROFILING_TO_STRING = makeSymbol("WITH-SPACE-PROFILING-TO-STRING");
  public static final SubLList $list506 = list(list(makeSymbol("STRING-VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym507$STREAM = makeUninternedSymbol("STREAM");
  public static final SubLSymbol $sym508$CWITH_OUTPUT_TO_STRING = makeSymbol("CWITH-OUTPUT-TO-STRING");
  public static final SubLSymbol $sym509$WITH_SPACE_PROFILING = makeSymbol("WITH-SPACE-PROFILING");
  public static final SubLSymbol $kw510$STREAM = makeKeyword("STREAM");
  public static final SubLList $list511 = list(list(makeSymbol("RESULT-VAR"), makeSymbol("&KEY"), list(makeSymbol("INITIAL-VALUE"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list512 = list(makeKeyword("INITIAL-VALUE"));
  public static final SubLSymbol $kw513$INITIAL_VALUE = makeKeyword("INITIAL-VALUE");
  public static final SubLList $list514 = list(makeSymbol("*SXHASH-COMPOSITE-STATE*"), FOUR_INTEGER);
  public static final SubLSymbol $sym515$_SXHASH_COMPOSITE_HASH_ = makeSymbol("*SXHASH-COMPOSITE-HASH*");
  public static final SubLList $list516 = list(makeSymbol("*SXHASH-COMPOSITE-HASH*"));
  public static final SubLList $list517 = list(makeSymbol("COMPOSITE-STATE"), FOUR_INTEGER);
  public static final SubLSymbol $sym518$COMPOSITE_HASH = makeSymbol("COMPOSITE-HASH");
  public static final SubLList $list519 = list(makeSymbol("COMPOSITE-HASH"));
  public static final SubLList $list520 = list(makeSymbol("VALUE"));
  public static final SubLList $list521 = list(makeSymbol("CSETQ"), makeSymbol("COMPOSITE-STATE"), list(makeSymbol("SXHASH-UPDATE-STATE"), makeSymbol("COMPOSITE-STATE")));
  public static final SubLSymbol $sym522$LOGXOR = makeSymbol("LOGXOR");
  public static final SubLSymbol $sym523$SXHASH_ROT = makeSymbol("SXHASH-ROT");
  public static final SubLSymbol $sym524$SXHASH = makeSymbol("SXHASH");
  public static final SubLList $list525 = list(makeSymbol("COMPOSITE-STATE"));
  public static final SubLInteger $int526$27 = makeInteger(27);
  public static final SubLObject $ic527 = Vectors.vector(new SubLObject[] {SEVEN_INTEGER, EIGHT_INTEGER, NINE_INTEGER, TEN_INTEGER, ELEVEN_INTEGER, TWELVE_INTEGER, THIRTEEN_INTEGER, FOURTEEN_INTEGER, FIFTEEN_INTEGER, SIXTEEN_INTEGER, SEVENTEEN_INTEGER, EIGHTEEN_INTEGER, NINETEEN_INTEGER, TWENTY_INTEGER, makeInteger(21), makeInteger(22), makeInteger(23), makeInteger(24), makeInteger(25), makeInteger(26), makeInteger(27), makeInteger(28), makeInteger(29), makeInteger(30), makeInteger(31), ZERO_INTEGER, ONE_INTEGER, TWO_INTEGER, THREE_INTEGER, FOUR_INTEGER, FIVE_INTEGER, SIX_INTEGER});
  public static final SubLSymbol $sym528$SXHASH_COMPOSITE_UPDATE = makeSymbol("SXHASH-COMPOSITE-UPDATE");
  public static final SubLSymbol $sym529$COMPUTE_SXHASH_COMPOSITE = makeSymbol("COMPUTE-SXHASH-COMPOSITE");
  public static final SubLInteger $int530$1000000 = makeInteger(1000000);
  public static final SubLInteger $int531$167 = makeInteger(167);
  public static final SubLList $list532 = list(list(makeSymbol("VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list533 = list(list(makeSymbol("TAG"), makeSymbol("ANS-VAR"), makeSymbol("CATCH?")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym534$CCATCH = makeSymbol("CCATCH");
  public static final SubLList $list535 = list(list(makeSymbol("PRE-N"), makeSymbol("N")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym536$TIMINGS = makeUninternedSymbol("TIMINGS");
  public static final SubLSymbol $sym537$TIME = makeUninternedSymbol("TIME");
  public static final SubLSymbol $sym538$I = makeUninternedSymbol("I");
  public static final SubLList $list539 = list(makeSymbol("BENCHMARK-GC"));
  public static final SubLSymbol $sym540$_ = makeSymbol("+");
  public static final SubLList $list541 = list(list(makeSymbol("BENCHMARK-GC")));
  public static final SubLSymbol $sym542$PERFORM_STANDARD_STATISTICAL_ANALYSIS = makeSymbol("PERFORM-STANDARD-STATISTICAL-ANALYSIS");
  public static final SubLSymbol $sym543$BENCHMARK_GC = makeSymbol("BENCHMARK-GC");
  public static final SubLSymbol $sym544$RUN_BENCHMARK_COMPENSATING_FOR_PAGING = makeSymbol("RUN-BENCHMARK-COMPENSATING-FOR-PAGING");
  public static final SubLList $list545 = list(list(makeSymbol("*PRINT-PRETTY*"), NIL), list(makeSymbol("*PRINT-LENGTH*"), NIL), list(makeSymbol("*PRINT-LEVEL*"), NIL));

  //// Initializers

  public void declareFunctions() {
    declare_utilities_macros_file();
  }

  public void initializeVariables() {
    init_utilities_macros_file();
  }

  public void runTopLevelForms() {
    setup_utilities_macros_file();
  }

}
