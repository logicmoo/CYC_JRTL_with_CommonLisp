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
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.cycl_variables;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.utilities_macros;

public  final class variables extends SubLTranslatedFile {

  //// Constructor

  private variables() {}
  public static final SubLFile me = new variables();
  public static final String myName = "com.cyc.cycjava.cycl.variables";

  //// Definitions

  /** The character used as the first character of an HL variable's name. */
  @SubL(source = "cycl/variables.lisp", position = 598) 
  private static SubLSymbol $hl_variable_prefix_char$ = null;

  /** The prefix for all default EL vars.  By no coincidence, it is the upcase version
of the prefix in @xref print-variable */
  @SubL(source = "cycl/variables.lisp", position = 723) 
  private static SubLSymbol $default_el_variable_prefix$ = null;

  public static final class $variable_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $id; }
    public SubLObject setField2(SubLObject value) { return $id = value; }
    public SubLObject $id = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($variable_native.class, $sym1$VARIABLE, $sym2$VARIABLE_P, $list3, $list4, new String[] {"$id"}, $list5, $list6, $sym7$PRINT_VARIABLE);
  }

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static SubLSymbol $dtp_variable$ = null;

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static final SubLObject variable_print_function_trampoline(SubLObject object, SubLObject stream) {
    print_variable(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static final SubLObject variable_p(SubLObject object) {
    return ((object.getClass() == $variable_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $variable_p$UnaryFunction extends UnaryFunction {
    public $variable_p$UnaryFunction() { super(extractFunctionNamed("VARIABLE-P")); }
    public SubLObject processItem(SubLObject arg1) { return variable_p(arg1); }
  }

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static final SubLObject var_id(SubLObject object) {
    checkType(object, $sym2$VARIABLE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static final SubLObject _csetf_var_id(SubLObject object, SubLObject value) {
    checkType(object, $sym2$VARIABLE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/variables.lisp", position = 1169) 
  public static final SubLObject make_variable(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $variable_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw11$ID)) {
            _csetf_var_id(v_new, current_value);
          } else {
            Errors.error($str12$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/variables.lisp", position = 1268) 
  public static final SubLObject print_variable(SubLObject object, SubLObject stream, SubLObject depth) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject id = variable_id(object);
        SubLObject name = ConsesLow.nth(id, control_vars.$variable_names$.getDynamicValue(thread));
        if ((NIL != name)) {
          print_high.princ(name, stream);
        } else {
          PrintLow.format(stream, $str13$_Cvar_D, $hl_variable_prefix_char$.getGlobalValue(), id);
        }
      }
      return object;
    }
  }

  @SubL(source = "cycl/variables.lisp", position = 1521) 
  public static final SubLObject sxhash_variable_method(SubLObject object) {
    {
      SubLObject id = var_id(object);
      if (id.isInteger()) {
        return id;
      }
    }
    return $int14$99;
  }

  public static final class $sxhash_variable_method$UnaryFunction extends UnaryFunction {
    public $sxhash_variable_method$UnaryFunction() { super(extractFunctionNamed("SXHASH-VARIABLE-METHOD")); }
    public SubLObject processItem(SubLObject arg1) { return sxhash_variable_method(arg1); }
  }

  /** The total number of interned HL variables. */
  @SubL(source = "cycl/variables.lisp", position = 1765) 
  private static SubLSymbol $variable_max$ = null;

  @SubL(source = "cycl/variables.lisp", position = 1928) 
  private static SubLSymbol $variable_array$ = null;

  /** Return HL variable number NUM. */
  @SubL(source = "cycl/variables.lisp", position = 1970) 
  public static final SubLObject get_variable(SubLObject num) {
    checkType(num, $sym21$FIXNUMP);
    return Vectors.aref($variable_array$.getGlobalValue(), num);
  }

  /** Setup the array of interned HL variables. */
  @SubL(source = "cycl/variables.lisp", position = 2105) 
  public static final SubLObject setup_variable_table() {
    if ((!($variable_array$.getGlobalValue().isVector()))) {
      {
        SubLObject array = Vectors.make_vector($variable_max$.getGlobalValue(), NIL);
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL($variable_max$.getGlobalValue()); i = Numbers.add(i, ONE_INTEGER)) {
          {
            SubLObject var = make_variable(UNPROVIDED);
            _csetf_var_id(var, i);
            Vectors.set_aref(array, i, var);
          }
        }
        $variable_array$.setGlobalValue(array);
      }
      return T;
    }
    return NIL;
  }

  /** Return id of HL variable VARIABLE. */
  @SubL(source = "cycl/variables.lisp", position = 2911) 
  public static final SubLObject variable_id(SubLObject variable) {
    checkType(variable, $sym2$VARIABLE_P);
    return var_id(variable);
  }

  /** Return the HL variable with ID, or NIL if not present. */
  @SubL(source = "cycl/variables.lisp", position = 3089) 
  public static final SubLObject find_variable_by_id(SubLObject id) {
    checkType(id, $sym40$INTEGERP);
    return get_variable(id);
  }

  @SubL(source = "cycl/variables.lisp", position = 3292) 
  public static final SubLObject variable_L(SubLObject var1, SubLObject var2) {
    return Numbers.numL(variable_id(var1), variable_id(var2));
  }

  public static final class $variable_L$BinaryFunction extends BinaryFunction {
    public $variable_L$BinaryFunction() { super(extractFunctionNamed("VARIABLE-<")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return variable_L(arg1, arg2); }
  }

  /** Return a readable EL var from HL var VARIABLE. */
  @SubL(source = "cycl/variables.lisp", position = 3538) 
  public static final SubLObject default_el_var_for_hl_var(SubLObject variable) {
    checkType(variable, $sym2$VARIABLE_P);
    return default_el_var_for_hl_var_cached(variable);
  }

  @SubL(source = "cycl/variables.lisp", position = 3741) 
  private static SubLSymbol $default_el_var_for_hl_var_cached_caching_state$ = null;

  /** Return a readable EL var from HL var VARIABLE. */
  @SubL(source = "cycl/variables.lisp", position = 3741) 
  public static final SubLObject default_el_var_for_hl_var_cached_internal(SubLObject variable) {
    checkType(variable, $sym2$VARIABLE_P);
    return cycl_variables.make_el_var(print_high.prin1_to_string(variable));
  }

  @SubL(source = "cycl/variables.lisp", position = 3741) 
  public static final SubLObject default_el_var_for_hl_var_cached(SubLObject variable) {
    {
      SubLObject caching_state = $default_el_var_for_hl_var_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym46$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED, $sym47$_DEFAULT_EL_VAR_FOR_HL_VAR_CACHED_CACHING_STATE_, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
      }
      {
        SubLObject results = memoization_state.caching_state_lookup(caching_state, variable, $kw48$_MEMOIZED_ITEM_NOT_FOUND_);
        if ((results == $kw48$_MEMOIZED_ITEM_NOT_FOUND_)) {
          results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(default_el_var_for_hl_var_cached_internal(variable)));
          memoization_state.caching_state_put(caching_state, variable, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
      }
    }
  }

  @SubL(source = "cycl/variables.lisp", position = 4087) 
  private static SubLSymbol $hl_var_for_default_el_var_caching_state$ = null;

  @SubL(source = "cycl/variables.lisp", position = 4366) 
  public static final SubLObject sort_hl_variable_list(SubLObject hl_variable_list) {
    return Sort.sort(hl_variable_list, $sym52$VARIABLE__, UNPROVIDED);
  }

  /** Return T iff OBJECT contains no HL variables, and therefore is fully bound. */
  @SubL(source = "cycl/variables.lisp", position = 6950) 
  public static final SubLObject fully_bound_p(SubLObject object) {
    return makeBoolean((NIL == not_fully_bound_p(object)));
  }

  public static final class $fully_bound_p$UnaryFunction extends UnaryFunction {
    public $fully_bound_p$UnaryFunction() { super(extractFunctionNamed("FULLY-BOUND-P")); }
    public SubLObject processItem(SubLObject arg1) { return fully_bound_p(arg1); }
  }

  /** Return T iff OBJECT contains some HL variable, and therefore is not fully bound. */
  @SubL(source = "cycl/variables.lisp", position = 7138) 
  public static final SubLObject not_fully_bound_p(SubLObject object) {
    if (object.isAtom()) {
      return variable_p(object);
    } else {
      {
        SubLObject rest = NIL;
        SubLObject next = NIL;
        for (rest = object, next = rest.first(); (!(rest.rest().isAtom())); rest = rest.rest(), next = rest.first()) {
          if ((NIL != not_fully_bound_p(next))) {
            return T;
          }
        }
        return makeBoolean(((NIL != not_fully_bound_p(next))
              || (NIL != variable_p(rest.rest()))));
      }
    }
  }

  public static final class $not_fully_bound_p$UnaryFunction extends UnaryFunction {
    public $not_fully_bound_p$UnaryFunction() { super(extractFunctionNamed("NOT-FULLY-BOUND-P")); }
    public SubLObject processItem(SubLObject arg1) { return not_fully_bound_p(arg1); }
  }

  @SubL(source = "cycl/variables.lisp", position = 7639) 
  public static final SubLObject cycl_ground_expression_p(SubLObject expression) {
    return makeBoolean((NIL == cycl_utilities.expression_find_if($sym64$CYC_VAR_, expression, UNPROVIDED, UNPROVIDED)));
  }

  public static final SubLObject declare_variables_file() {
    declareFunction(myName, "variable_print_function_trampoline", "VARIABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "variable_p", "VARIABLE-P", 1, 0, false); new $variable_p$UnaryFunction();
    declareFunction(myName, "var_id", "VAR-ID", 1, 0, false);
    declareFunction(myName, "_csetf_var_id", "_CSETF-VAR-ID", 2, 0, false);
    declareFunction(myName, "make_variable", "MAKE-VARIABLE", 0, 1, false);
    declareFunction(myName, "print_variable", "PRINT-VARIABLE", 3, 0, false);
    declareFunction(myName, "sxhash_variable_method", "SXHASH-VARIABLE-METHOD", 1, 0, false); new $sxhash_variable_method$UnaryFunction();
    declareFunction(myName, "get_variable", "GET-VARIABLE", 1, 0, false);
    declareFunction(myName, "setup_variable_table", "SETUP-VARIABLE-TABLE", 0, 0, false);
    declareFunction(myName, "variable_count", "VARIABLE-COUNT", 0, 0, false);
    declareMacro(myName, "do_hl_variables", "DO-HL-VARIABLES");
    declareFunction(myName, "variable_id", "VARIABLE-ID", 1, 0, false);
    declareFunction(myName, "find_variable_by_id", "FIND-VARIABLE-BY-ID", 1, 0, false);
    declareFunction(myName, "variable_L", "VARIABLE-<", 2, 0, false); new $variable_L$BinaryFunction();
    declareFunction(myName, "random_variable", "RANDOM-VARIABLE", 0, 0, false);
    declareFunction(myName, "default_el_var_for_hl_var", "DEFAULT-EL-VAR-FOR-HL-VAR", 1, 0, false);
    declareFunction(myName, "clear_default_el_var_for_hl_var_cached", "CLEAR-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 0, 0, false);
    declareFunction(myName, "remove_default_el_var_for_hl_var_cached", "REMOVE-DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 1, 0, false);
    declareFunction(myName, "default_el_var_for_hl_var_cached_internal", "DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-INTERNAL", 1, 0, false);
    declareFunction(myName, "default_el_var_for_hl_var_cached", "DEFAULT-EL-VAR-FOR-HL-VAR-CACHED", 1, 0, false);
    declareFunction(myName, "get_default_el_var", "GET-DEFAULT-EL-VAR", 1, 0, false);
    declareFunction(myName, "clear_hl_var_for_default_el_var", "CLEAR-HL-VAR-FOR-DEFAULT-EL-VAR", 0, 0, false);
    declareFunction(myName, "remove_hl_var_for_default_el_var", "REMOVE-HL-VAR-FOR-DEFAULT-EL-VAR", 1, 0, false);
    declareFunction(myName, "hl_var_for_default_el_var_internal", "HL-VAR-FOR-DEFAULT-EL-VAR-INTERNAL", 1, 0, false);
    declareFunction(myName, "hl_var_for_default_el_var", "HL-VAR-FOR-DEFAULT-EL-VAR", 1, 0, false);
    declareFunction(myName, "sort_hl_variable_list", "SORT-HL-VARIABLE-LIST", 1, 0, false);
    declareFunction(myName, "canonicalize_default_el_vars", "CANONICALIZE-DEFAULT-EL-VARS", 1, 0, false);
    declareFunction(myName, "uncanonicalize_hl_vars", "UNCANONICALIZE-HL-VARS", 1, 0, false);
    declareFunction(myName, "error_unless_canonicalize_default_el_vars", "ERROR-UNLESS-CANONICALIZE-DEFAULT-EL-VARS", 1, 0, false);
    declareFunction(myName, "error_if_expression_contains_non_default_el_var", "ERROR-IF-EXPRESSION-CONTAINS-NON-DEFAULT-EL-VAR", 1, 0, false);
    declareFunction(myName, "variable_symbolp", "VARIABLE-SYMBOLP", 1, 0, false);
    declareFunction(myName, "gather_variable_symbols", "GATHER-VARIABLE-SYMBOLS", 1, 0, false);
    declareFunction(myName, "replace_variables", "REPLACE-VARIABLES", 2, 0, false);
    declareFunction(myName, "restore_variables", "RESTORE-VARIABLES", 2, 0, false);
    declareFunction(myName, "generate_hl_variable_list", "GENERATE-HL-VARIABLE-LIST", 1, 0, false);
    declareFunction(myName, "gather_hl_variables", "GATHER-HL-VARIABLES", 1, 0, false);
    declareFunction(myName, "max_hl_variable", "MAX-HL-VARIABLE", 1, 0, false);
    declareFunction(myName, "max_hl_variable_id", "MAX-HL-VARIABLE-ID", 1, 0, false);
    declareFunction(myName, "fully_bound_p", "FULLY-BOUND-P", 1, 0, false); new $fully_bound_p$UnaryFunction();
    declareFunction(myName, "not_fully_bound_p", "NOT-FULLY-BOUND-P", 1, 0, false); new $not_fully_bound_p$UnaryFunction();
    declareFunction(myName, "cycl_ground_expression_p", "CYCL-GROUND-EXPRESSION-P", 1, 0, false);
    declareFunction(myName, "hl_ground_expression_p", "HL-GROUND-EXPRESSION-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_variables_file() {
    $hl_variable_prefix_char$ = defconstant("*HL-VARIABLE-PREFIX-CHAR*", Characters.CHAR_question);
    $default_el_variable_prefix$ = defconstant("*DEFAULT-EL-VARIABLE-PREFIX*", $str0$_VAR);
    $dtp_variable$ = defconstant("*DTP-VARIABLE*", $sym1$VARIABLE);
    $variable_max$ = deflexical("*VARIABLE-MAX*", $int19$200);
    $variable_array$ = deflexical("*VARIABLE-ARRAY*", ((NIL != Symbols.boundp($sym20$_VARIABLE_ARRAY_)) ? ((SubLObject) $variable_array$.getGlobalValue()) : NIL));
    $default_el_var_for_hl_var_cached_caching_state$ = deflexical("*DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-CACHING-STATE*", NIL);
    $hl_var_for_default_el_var_caching_state$ = deflexical("*HL-VAR-FOR-DEFAULT-EL-VAR-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_variables_file() {
    // CVS_ID("Id: variables.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_variable$.getGlobalValue(), Symbols.symbol_function($sym8$VARIABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$VAR_ID, $sym10$_CSETF_VAR_ID);
    Equality.identity($sym1$VARIABLE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_variable$.getGlobalValue(), Symbols.symbol_function($sym15$SXHASH_VARIABLE_METHOD));
    utilities_macros.register_cyc_api_function($sym2$VARIABLE_P, $list16, $str17$Return_T_iff_OBJECT_is_an_HL_vari, NIL, $list18);
    subl_macro_promotions.declare_defglobal($sym20$_VARIABLE_ARRAY_);
    utilities_macros.register_cyc_api_function($sym22$VARIABLE_COUNT, NIL, $str23$Return_the_total_number_of_HL_var, NIL, $list24);
    utilities_macros.register_cyc_api_function($sym36$VARIABLE_ID, $list37, $str38$Return_id_of_HL_variable_VARIABLE, $list39, $list24);
    utilities_macros.register_cyc_api_function($sym35$FIND_VARIABLE_BY_ID, $list3, $str41$Return_the_HL_variable_with_ID__o, $list42, $list43);
    utilities_macros.register_cyc_api_function($sym44$DEFAULT_EL_VAR_FOR_HL_VAR, $list37, $str45$Return_a_readable_EL_var_from_HL_, $list39, NIL);
    memoization_state.note_globally_cached_function($sym46$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED);
    memoization_state.note_globally_cached_function($sym49$HL_VAR_FOR_DEFAULT_EL_VAR);
    access_macros.define_obsolete_register($sym56$VARIABLE_SYMBOLP, $list57);
    utilities_macros.register_cyc_api_function($sym60$FULLY_BOUND_P, $list16, $str61$Return_T_iff_OBJECT_contains_no_H, NIL, $list18);
    utilities_macros.register_cyc_api_function($sym62$NOT_FULLY_BOUND_P, $list16, $str63$Return_T_iff_OBJECT_contains_some, NIL, $list18);
    return NIL;
  }

  //// Internal Constants

  public static final SubLString $str0$_VAR = makeString("?VAR");
  public static final SubLSymbol $sym1$VARIABLE = makeSymbol("VARIABLE");
  public static final SubLSymbol $sym2$VARIABLE_P = makeSymbol("VARIABLE-P");
  public static final SubLList $list3 = list(makeSymbol("ID"));
  public static final SubLList $list4 = list(makeKeyword("ID"));
  public static final SubLList $list5 = list(makeSymbol("VAR-ID"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-VAR-ID"));
  public static final SubLSymbol $sym7$PRINT_VARIABLE = makeSymbol("PRINT-VARIABLE");
  public static final SubLSymbol $sym8$VARIABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("VARIABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$VAR_ID = makeSymbol("VAR-ID");
  public static final SubLSymbol $sym10$_CSETF_VAR_ID = makeSymbol("_CSETF-VAR-ID");
  public static final SubLSymbol $kw11$ID = makeKeyword("ID");
  public static final SubLString $str12$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str13$_Cvar_D = makeString("~Cvar~D");
  public static final SubLInteger $int14$99 = makeInteger(99);
  public static final SubLSymbol $sym15$SXHASH_VARIABLE_METHOD = makeSymbol("SXHASH-VARIABLE-METHOD");
  public static final SubLList $list16 = list(makeSymbol("OBJECT"));
  public static final SubLString $str17$Return_T_iff_OBJECT_is_an_HL_vari = makeString("Return T iff OBJECT is an HL variable.");
  public static final SubLList $list18 = list(makeSymbol("BOOLEANP"));
  public static final SubLInteger $int19$200 = makeInteger(200);
  public static final SubLSymbol $sym20$_VARIABLE_ARRAY_ = makeSymbol("*VARIABLE-ARRAY*");
  public static final SubLSymbol $sym21$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLSymbol $sym22$VARIABLE_COUNT = makeSymbol("VARIABLE-COUNT");
  public static final SubLString $str23$Return_the_total_number_of_HL_var = makeString("Return the total number of HL variables.");
  public static final SubLList $list24 = list(makeSymbol("INTEGERP"));
  public static final SubLList $list25 = list(list(makeSymbol("HL-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list26 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw27$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw28$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym29$NUM = makeUninternedSymbol("NUM");
  public static final SubLSymbol $sym30$DO_NUMBERS = makeSymbol("DO-NUMBERS");
  public static final SubLSymbol $kw31$START = makeKeyword("START");
  public static final SubLSymbol $kw32$END = makeKeyword("END");
  public static final SubLList $list33 = list(makeSymbol("VARIABLE-COUNT"));
  public static final SubLSymbol $sym34$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym35$FIND_VARIABLE_BY_ID = makeSymbol("FIND-VARIABLE-BY-ID");
  public static final SubLSymbol $sym36$VARIABLE_ID = makeSymbol("VARIABLE-ID");
  public static final SubLList $list37 = list(makeSymbol("VARIABLE"));
  public static final SubLString $str38$Return_id_of_HL_variable_VARIABLE = makeString("Return id of HL variable VARIABLE.");
  public static final SubLList $list39 = list(list(makeSymbol("VARIABLE"), makeSymbol("VARIABLE-P")));
  public static final SubLSymbol $sym40$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str41$Return_the_HL_variable_with_ID__o = makeString("Return the HL variable with ID, or NIL if not present.");
  public static final SubLList $list42 = list(list(makeSymbol("ID"), makeSymbol("INTEGERP")));
  public static final SubLList $list43 = list(list(makeSymbol("NIL-OR"), makeSymbol("VARIABLE-P")));
  public static final SubLSymbol $sym44$DEFAULT_EL_VAR_FOR_HL_VAR = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR");
  public static final SubLString $str45$Return_a_readable_EL_var_from_HL_ = makeString("Return a readable EL var from HL var VARIABLE.");
  public static final SubLSymbol $sym46$DEFAULT_EL_VAR_FOR_HL_VAR_CACHED = makeSymbol("DEFAULT-EL-VAR-FOR-HL-VAR-CACHED");
  public static final SubLSymbol $sym47$_DEFAULT_EL_VAR_FOR_HL_VAR_CACHED_CACHING_STATE_ = makeSymbol("*DEFAULT-EL-VAR-FOR-HL-VAR-CACHED-CACHING-STATE*");
  public static final SubLSymbol $kw48$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym49$HL_VAR_FOR_DEFAULT_EL_VAR = makeSymbol("HL-VAR-FOR-DEFAULT-EL-VAR");
  public static final SubLSymbol $sym50$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym51$_HL_VAR_FOR_DEFAULT_EL_VAR_CACHING_STATE_ = makeSymbol("*HL-VAR-FOR-DEFAULT-EL-VAR-CACHING-STATE*");
  public static final SubLSymbol $sym52$VARIABLE__ = makeSymbol("VARIABLE-<");
  public static final SubLSymbol $sym53$DEFAULT_EL_VAR_ = makeSymbol("DEFAULT-EL-VAR?");
  public static final SubLSymbol $sym54$NON_DEFAULT_EL_VAR_ = makeSymbol("NON-DEFAULT-EL-VAR?");
  public static final SubLString $str55$_s_contained_the_non_default_EL_v = makeString("~s contained the non-default EL variable ~s, which is not handled yet.");
  public static final SubLSymbol $sym56$VARIABLE_SYMBOLP = makeSymbol("VARIABLE-SYMBOLP");
  public static final SubLList $list57 = list(makeSymbol("EL-VAR?"));
  public static final SubLSymbol $sym58$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym59$_ = makeSymbol("<");
  public static final SubLSymbol $sym60$FULLY_BOUND_P = makeSymbol("FULLY-BOUND-P");
  public static final SubLString $str61$Return_T_iff_OBJECT_contains_no_H = makeString("Return T iff OBJECT contains no HL variables, and therefore is fully bound.");
  public static final SubLSymbol $sym62$NOT_FULLY_BOUND_P = makeSymbol("NOT-FULLY-BOUND-P");
  public static final SubLString $str63$Return_T_iff_OBJECT_contains_some = makeString("Return T iff OBJECT contains some HL variable, and therefore is not fully bound.");
  public static final SubLSymbol $sym64$CYC_VAR_ = makeSymbol("CYC-VAR?");

  //// Initializers

  public void declareFunctions() {
    declare_variables_file();
  }

  public void initializeVariables() {
    init_variables_file();
  }

  public void runTopLevelForms() {
    setup_variables_file();
  }

}
