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
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;

public  final class special_variable_state extends SubLTranslatedFile {

  //// Constructor

  private special_variable_state() {}
  public static final SubLFile me = new special_variable_state();
  public static final String myName = "com.cyc.cycjava_1.cycl.special_variable_state";

  //// Definitions

  public static final class $special_variable_state_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $variables; }
    public SubLObject getField3() { return $values; }
    public SubLObject setField2(SubLObject value) { return $variables = value; }
    public SubLObject setField3(SubLObject value) { return $values = value; }
    public SubLObject $variables = NIL;
    public SubLObject $values = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($special_variable_state_native.class, $sym1$SPECIAL_VARIABLE_STATE, $sym2$SPECIAL_VARIABLE_STATE_P, $list3, $list4, new String[] {"$variables", "$values"}, $list5, $list6, $sym7$PRINT_SPECIAL_VARIABLE_STATE);
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static SubLSymbol $dtp_special_variable_state$ = null;

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject special_variable_state_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31670");
    return NIL;
  }

  public static final class $special_variable_state_p$UnaryFunction extends UnaryFunction {
    public $special_variable_state_p$UnaryFunction() { super(extractFunctionNamed("SPECIAL-VARIABLE-STATE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31671"); }
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject svs_variables(SubLObject object) {
    checkType(object, $sym2$SPECIAL_VARIABLE_STATE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject svs_values(SubLObject object) {
    checkType(object, $sym2$SPECIAL_VARIABLE_STATE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject _csetf_svs_variables(SubLObject object, SubLObject value) {
    checkType(object, $sym2$SPECIAL_VARIABLE_STATE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject _csetf_svs_values(SubLObject object, SubLObject value) {
    checkType(object, $sym2$SPECIAL_VARIABLE_STATE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2552) 
  public static final SubLObject make_special_variable_state(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $special_variable_state_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw13$VARIABLES)) {
            _csetf_svs_variables(v_new, current_value);
          } else if (pcase_var.eql($kw14$VALUES)) {
            _csetf_svs_values(v_new, current_value);
          } else {
            Errors.error($str15$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 2995) 
  public static final SubLObject sxhash_special_variable_state_method(SubLObject object) {
    return Numbers.logxor(Sxhash.sxhash(svs_variables(object)), Sxhash.sxhash(svs_values(object)));
  }

  /** Return a new @xref special-variable-state-p based on the current values for SPECIAL-VARIABLES. */
  @SubL(source = "cycl/special-variable-state.lisp", position = 3187) 
  public static final SubLObject new_special_variable_state(SubLObject special_variables) {
    checkType(special_variables, $sym21$BOUND_SPECIAL_VARIABLE_LIST_P);
    {
      SubLObject svs = make_special_variable_state(UNPROVIDED);
      _csetf_svs_variables(svs, conses_high.copy_list(special_variables));
      _csetf_svs_values(svs, ConsesLow.make_list(Sequences.length(special_variables), UNPROVIDED));
      return update_special_variable_state(svs);
    }
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 4920) 
  public static final SubLObject with_special_variable_state_variables(SubLObject svs) {
    return svs_variables(svs);
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 5066) 
  public static final SubLObject with_special_variable_state_values(SubLObject svs) {
    return svs_values(svs);
  }

  /** Update special-variable-state SVS with the current binding values for all its special-variables.
   @return SVS */
  @SubL(source = "cycl/special-variable-state.lisp", position = 5194) 
  public static final SubLObject update_special_variable_state(SubLObject svs) {
    checkType(svs, $sym2$SPECIAL_VARIABLE_STATE_P);
    update_special_variable_value_list(svs_values(svs), svs_variables(svs));
    return svs;
  }

  @SubL(source = "cycl/special-variable-state.lisp", position = 5866) 
  public static final SubLObject update_special_variable_value_list(SubLObject values, SubLObject v_variables) {
    {
      SubLObject rest_variables = NIL;
      SubLObject rest_values = NIL;
      for (rest_variables = v_variables, rest_values = values; (NIL != rest_variables); rest_variables = rest_variables.rest(), rest_values = rest_values.rest()) {
        {
          SubLObject variable = rest_variables.first();
          SubLObject value = Symbols.symbol_value(variable);
          ConsesLow.rplaca(rest_values, value);
        }
      }
    }
    return values;
  }

  public static final SubLObject declare_special_variable_state_file() {
    declareFunction(myName, "bound_symbol_p", "BOUND-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "bound_special_variable_p", "BOUND-SPECIAL-VARIABLE-P", 1, 0, false);
    declareFunction(myName, "bound_special_variable_list_p", "BOUND-SPECIAL-VARIABLE-LIST-P", 1, 0, false);
    declareFunction(myName, "special_variable_state_print_function_trampoline", "SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "special_variable_state_p", "SPECIAL-VARIABLE-STATE-P", 1, 0, false); new $special_variable_state_p$UnaryFunction();
    declareFunction(myName, "svs_variables", "SVS-VARIABLES", 1, 0, false);
    declareFunction(myName, "svs_values", "SVS-VALUES", 1, 0, false);
    declareFunction(myName, "_csetf_svs_variables", "_CSETF-SVS-VARIABLES", 2, 0, false);
    declareFunction(myName, "_csetf_svs_values", "_CSETF-SVS-VALUES", 2, 0, false);
    declareFunction(myName, "make_special_variable_state", "MAKE-SPECIAL-VARIABLE-STATE", 0, 1, false);
    declareFunction(myName, "print_special_variable_state", "PRINT-SPECIAL-VARIABLE-STATE", 3, 0, false);
    declareFunction(myName, "sxhash_special_variable_state_method", "SXHASH-SPECIAL-VARIABLE-STATE-METHOD", 1, 0, false);
    declareFunction(myName, "new_special_variable_state", "NEW-SPECIAL-VARIABLE-STATE", 1, 0, false);
    declareFunction(myName, "special_variable_state_variables", "SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false);
    declareFunction(myName, "special_variable_state_variable_value", "SPECIAL-VARIABLE-STATE-VARIABLE-VALUE", 2, 1, false);
    declareMacro(myName, "with_special_variable_state", "WITH-SPECIAL-VARIABLE-STATE");
    declareFunction(myName, "with_special_variable_state_variables", "WITH-SPECIAL-VARIABLE-STATE-VARIABLES", 1, 0, false);
    declareFunction(myName, "with_special_variable_state_values", "WITH-SPECIAL-VARIABLE-STATE-VALUES", 1, 0, false);
    declareFunction(myName, "update_special_variable_state", "UPDATE-SPECIAL-VARIABLE-STATE", 1, 0, false);
    declareFunction(myName, "special_variable_state_push", "SPECIAL-VARIABLE-STATE-PUSH", 3, 0, false);
    declareFunction(myName, "update_special_variable_value_list", "UPDATE-SPECIAL-VARIABLE-VALUE-LIST", 2, 0, false);
    declareFunction(myName, "show_special_variable_state", "SHOW-SPECIAL-VARIABLE-STATE", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_special_variable_state_file() {
    $dtp_special_variable_state$ = defconstant("*DTP-SPECIAL-VARIABLE-STATE*", $sym1$SPECIAL_VARIABLE_STATE);
    return NIL;
  }

  public static final SubLObject setup_special_variable_state_file() {
    // CVS_ID("Id: special-variable-state.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), Symbols.symbol_function($sym8$SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$SVS_VARIABLES, $sym10$_CSETF_SVS_VARIABLES);
    Structures.def_csetf($sym11$SVS_VALUES, $sym12$_CSETF_SVS_VALUES);
    Equality.identity($sym1$SPECIAL_VARIABLE_STATE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_special_variable_state$.getGlobalValue(), Symbols.symbol_function($sym20$SXHASH_SPECIAL_VARIABLE_STATE_METHOD));
    access_macros.register_macro_helper($sym28$WITH_SPECIAL_VARIABLE_STATE_VARIABLES, $sym30$WITH_SPECIAL_VARIABLE_STATE);
    access_macros.register_macro_helper($sym29$WITH_SPECIAL_VARIABLE_STATE_VALUES, $sym30$WITH_SPECIAL_VARIABLE_STATE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$BOUND_SPECIAL_VARIABLE_P = makeSymbol("BOUND-SPECIAL-VARIABLE-P");
  public static final SubLSymbol $sym1$SPECIAL_VARIABLE_STATE = makeSymbol("SPECIAL-VARIABLE-STATE");
  public static final SubLSymbol $sym2$SPECIAL_VARIABLE_STATE_P = makeSymbol("SPECIAL-VARIABLE-STATE-P");
  public static final SubLList $list3 = list(makeSymbol("VARIABLES"), makeSymbol("VALUES"));
  public static final SubLList $list4 = list(makeKeyword("VARIABLES"), makeKeyword("VALUES"));
  public static final SubLList $list5 = list(makeSymbol("SVS-VARIABLES"), makeSymbol("SVS-VALUES"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-SVS-VARIABLES"), makeSymbol("_CSETF-SVS-VALUES"));
  public static final SubLSymbol $sym7$PRINT_SPECIAL_VARIABLE_STATE = makeSymbol("PRINT-SPECIAL-VARIABLE-STATE");
  public static final SubLSymbol $sym8$SPECIAL_VARIABLE_STATE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SPECIAL-VARIABLE-STATE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$SVS_VARIABLES = makeSymbol("SVS-VARIABLES");
  public static final SubLSymbol $sym10$_CSETF_SVS_VARIABLES = makeSymbol("_CSETF-SVS-VARIABLES");
  public static final SubLSymbol $sym11$SVS_VALUES = makeSymbol("SVS-VALUES");
  public static final SubLSymbol $sym12$_CSETF_SVS_VALUES = makeSymbol("_CSETF-SVS-VALUES");
  public static final SubLSymbol $kw13$VARIABLES = makeKeyword("VARIABLES");
  public static final SubLSymbol $kw14$VALUES = makeKeyword("VALUES");
  public static final SubLString $str15$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str16$__ = makeString("#<");
  public static final SubLSymbol $kw17$STREAM = makeKeyword("STREAM");
  public static final SubLString $str18$_S_variables = makeString("~S variables");
  public static final SubLSymbol $kw19$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym20$SXHASH_SPECIAL_VARIABLE_STATE_METHOD = makeSymbol("SXHASH-SPECIAL-VARIABLE-STATE-METHOD");
  public static final SubLSymbol $sym21$BOUND_SPECIAL_VARIABLE_LIST_P = makeSymbol("BOUND-SPECIAL-VARIABLE-LIST-P");
  public static final SubLList $list22 = list(makeSymbol("SVS"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym23$SVS_VAR = makeUninternedSymbol("SVS-VAR");
  public static final SubLSymbol $sym24$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym25$CHECK_TYPE = makeSymbol("CHECK-TYPE");
  public static final SubLList $list26 = list(makeSymbol("SPECIAL-VARIABLE-STATE-P"));
  public static final SubLSymbol $sym27$CPROGV = makeSymbol("CPROGV");
  public static final SubLSymbol $sym28$WITH_SPECIAL_VARIABLE_STATE_VARIABLES = makeSymbol("WITH-SPECIAL-VARIABLE-STATE-VARIABLES");
  public static final SubLSymbol $sym29$WITH_SPECIAL_VARIABLE_STATE_VALUES = makeSymbol("WITH-SPECIAL-VARIABLE-STATE-VALUES");
  public static final SubLSymbol $sym30$WITH_SPECIAL_VARIABLE_STATE = makeSymbol("WITH-SPECIAL-VARIABLE-STATE");
  public static final SubLString $str31$___S____S__ = makeString("~&~S = ~S~%");

  //// Initializers

  public void declareFunctions() {
    declare_special_variable_state_file();
  }

  public void initializeVariables() {
    init_special_variable_state_file();
  }

  public void runTopLevelForms() {
    setup_special_variable_state_file();
  }

}
