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

package com.cyc.cycjava_1.cycl.cyc_testing;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

  final class generic_testing_hide extends SubLTranslatedFile {

  //// Constructor

  private generic_testing_hide() {}
  public static final SubLFile me = new generic_testing_hide();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.generic_testing_hide";

  //// Definitions

  /** An index of test case names (keywords) -> tables (lists) of (args-to-eval . expected-results) tuples. */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1319) 
  private static SubLSymbol $test_case_table_index$ = null;

  /** An ordered list of test case names, in order of definition. */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1631) 
  private static SubLSymbol $ordered_test_cases$ = null;

  /** all the test-cases sorted by what classes they belong to */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1740) 
  private static SubLSymbol $test_case_tables_by_class$ = null;

  /** The possible statuses for generic tests. */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 1876) 
  private static SubLSymbol $generic_test_results$ = null;

  /** The possible levels of verbosity for generic tests. */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2011) 
  private static SubLSymbol $generic_test_verbosity_levels$ = null;

  /** The token identifying 'test case table' in the space of post-build tests. */
  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2159) 
  private static SubLSymbol $test_case_table_post_build_token$ = null;

  public static final class $generic_test_case_table_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $name; }
    @Override
    public SubLObject getField3() { return $tuples; }
    @Override
    public SubLObject getField4() { return $test; }
    @Override
    public SubLObject getField5() { return $owner; }
    @Override
    public SubLObject getField6() { return $classes; }
    @Override
    public SubLObject getField7() { return $kb; }
    @Override
    public SubLObject getField8() { return $workingP; }
    @Override
    public SubLObject setField2(SubLObject value) { return $name = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $tuples = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $test = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $owner = value; }
    @Override
    public SubLObject setField6(SubLObject value) { return $classes = value; }
    @Override
    public SubLObject setField7(SubLObject value) { return $kb = value; }
    @Override
    public SubLObject setField8(SubLObject value) { return $workingP = value; }
    public SubLObject $name = NIL;
    public SubLObject $tuples = NIL;
    public SubLObject $test = NIL;
    public SubLObject $owner = NIL;
    public SubLObject $classes = NIL;
    public SubLObject $kb = NIL;
    public SubLObject $workingP = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($generic_test_case_table_native.class, $sym7$GENERIC_TEST_CASE_TABLE, $sym8$GENERIC_TEST_CASE_TABLE_P, $list9, $list10, new String[] {"$name", "$tuples", "$test", "$owner", "$classes", "$kb", "$workingP"}, $list11, $list12, $sym13$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static SubLSymbol $dtp_generic_test_case_table$ = null;

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject generic_test_case_table_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject generic_test_case_table_p(SubLObject object) {
    return ((object.getClass() == $generic_test_case_table_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $generic_test_case_table_p$UnaryFunction extends UnaryFunction {
    public $generic_test_case_table_p$UnaryFunction() { super(extractFunctionNamed("GENERIC-TEST-CASE-TABLE-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return generic_test_case_table_p(arg1); }
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject gtct_name(SubLObject object) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_name(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_tuples(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_test(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_owner(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_classes(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_kb(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject _csetf_gtct_workingP(SubLObject object, SubLObject value) {
    checkType(object, $sym8$GENERIC_TEST_CASE_TABLE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 2651) 
  public static final SubLObject make_generic_test_case_table(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $generic_test_case_table_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw29$NAME)) {
            _csetf_gtct_name(v_new, current_value);
          } else if (pcase_var.eql($kw30$TUPLES)) {
            _csetf_gtct_tuples(v_new, current_value);
          } else if (pcase_var.eql($kw31$TEST)) {
            _csetf_gtct_test(v_new, current_value);
          } else if (pcase_var.eql($kw32$OWNER)) {
            _csetf_gtct_owner(v_new, current_value);
          } else if (pcase_var.eql($kw33$CLASSES)) {
            _csetf_gtct_classes(v_new, current_value);
          } else if (pcase_var.eql($kw34$KB)) {
            _csetf_gtct_kb(v_new, current_value);
          } else if (pcase_var.eql($kw35$WORKING_)) {
            _csetf_gtct_workingP(v_new, current_value);
          } else {
            Errors.error($str36$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 3478) 
  public static final SubLObject new_generic_test_case_table(SubLObject name, SubLObject tuples, SubLObject test, SubLObject owner, SubLObject classes, SubLObject kb, SubLObject workingP) {
    if ((classes == UNPROVIDED)) {
      classes = NIL;
    }
    if ((kb == UNPROVIDED)) {
      kb = $kw37$TINY;
    }
    if ((workingP == UNPROVIDED)) {
      workingP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == test)) {
        test = Symbols.symbol_function(EQUAL);
      }
      checkType(name, $sym38$TEST_CASE_NAME_P);
      checkType(tuples, $sym39$NON_DOTTED_LIST_P);
      checkType(test, $sym40$FUNCTION_SPEC_P);
      if ((NIL != owner)) {
        checkType(owner, $sym41$STRINGP);
      }
      if ((NIL != classes)) {
        checkType(classes, $sym42$LISTP);
      }
      checkType(kb, $sym43$CYC_TEST_KB_P);
      {
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        for (tuple = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), tuple = cdolist_list_var.first()) {
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(((NIL != list_utilities.proper_list_p(tuple))
                   && (NIL != list_utilities.lengthGE(tuple, TWO_INTEGER, UNPROVIDED)))))) {
              Errors.error($str44$_S_was_not_a_valid___input_____ex, tuple);
            }
          }
        }
      }
      {
        SubLObject gtct = make_generic_test_case_table(UNPROVIDED);
        _csetf_gtct_name(gtct, name);
        _csetf_gtct_tuples(gtct, tuples);
        _csetf_gtct_test(gtct, test);
        _csetf_gtct_owner(gtct, owner);
        _csetf_gtct_classes(gtct, classes);
        _csetf_gtct_kb(gtct, kb);
        _csetf_gtct_workingP(gtct, workingP);
        return gtct;
      }
    }
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 4357) 
  public static final SubLObject generic_test_case_table_name(SubLObject gtct) {
    return gtct_name(gtct);
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 10054) 
  public static final SubLObject define_test_case_table_int(SubLObject test_case_name, SubLObject v_properties, SubLObject tuples) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = v_properties;
        SubLObject current = datum;
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_2 = NIL;
        for (; (NIL != rest); ) {
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list66);
          current_2 = rest.first();
          rest = rest.rest();
          cdestructuring_bind.destructuring_bind_must_consp(rest, datum, $list66);
          if ((NIL == conses_high.member(current_2, $list67, UNPROVIDED, UNPROVIDED))) {
            bad = T;
          }
          if ((current_2 == $kw49$ALLOW_OTHER_KEYS)) {
            allow_other_keys_p = rest.first();
          }
          rest = rest.rest();
        }
        if (((NIL != bad)
             && (NIL == allow_other_keys_p))) {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list66);
        }
        {
          SubLObject owner_tail = cdestructuring_bind.property_list_member($kw32$OWNER, current);
          SubLObject owner = ((NIL != owner_tail) ? ((SubLObject) conses_high.cadr(owner_tail)) : NIL);
          SubLObject test_tail = cdestructuring_bind.property_list_member($kw31$TEST, current);
          SubLObject test = ((NIL != test_tail) ? ((SubLObject) conses_high.cadr(test_tail)) : NIL);
          SubLObject classes_tail = cdestructuring_bind.property_list_member($kw33$CLASSES, current);
          SubLObject classes = ((NIL != classes_tail) ? ((SubLObject) conses_high.cadr(classes_tail)) : NIL);
          SubLObject kb_tail = cdestructuring_bind.property_list_member($kw34$KB, current);
          SubLObject kb = ((NIL != kb_tail) ? ((SubLObject) conses_high.cadr(kb_tail)) : NIL);
          SubLObject workingP_tail = cdestructuring_bind.property_list_member($kw35$WORKING_, current);
          SubLObject workingP = ((NIL != workingP_tail) ? ((SubLObject) conses_high.cadr(workingP_tail)) : T);
          SubLObject gtct = new_generic_test_case_table(test_case_name, tuples, test, owner, classes, kb, workingP);
          SubLObject cdolist_list_var = classes;
          SubLObject v_class = NIL;
          for (v_class = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_class = cdolist_list_var.first()) {
            Hashtables.sethash(v_class, $test_case_tables_by_class$.getGlobalValue(), conses_high.adjoin(test_case_name, Hashtables.gethash(v_class, $test_case_tables_by_class$.getGlobalValue(), UNPROVIDED), UNPROVIDED, UNPROVIDED));
          }
          {
            SubLObject item_var = test_case_name;
            if ((NIL == conses_high.member(item_var, $ordered_test_cases$.getGlobalValue(), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              {
                SubLObject new_cons = cons(item_var, NIL);
                SubLObject list = $ordered_test_cases$.getGlobalValue();
                if ((NIL != list)) {
                  subl_macros.rplacd_last(list, new_cons);
                } else {
                  $ordered_test_cases$.setGlobalValue(new_cons);
                }
              }
            }
          }
          Hashtables.sethash(test_case_name, $test_case_table_index$.getGlobalValue(), gtct);
          cyc_testing.new_cyc_test(cyc_testing.$cyc_test_filename$.getDynamicValue(thread), gtct);
          return test_case_name;
        }
      }
    }
  }

  @SubL(source = "cycl/cyc-testing/generic-testing.lisp", position = 17309) 
  private static SubLSymbol $cfasl_wide_opcode_generic_test_case_table$ = null;

  public static final SubLObject declare_generic_testing_file() {
    declareFunction(myName, "all_generic_test_cases", "ALL-GENERIC-TEST-CASES", 0, 0, false);
    declareFunction(myName, "generic_test_case_table_print_function_trampoline", "GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "generic_test_case_table_p", "GENERIC-TEST-CASE-TABLE-P", 1, 0, false); new $generic_test_case_table_p$UnaryFunction();
    declareFunction(myName, "gtct_name", "GTCT-NAME", 1, 0, false);
    declareFunction(myName, "gtct_tuples", "GTCT-TUPLES", 1, 0, false);
    declareFunction(myName, "gtct_test", "GTCT-TEST", 1, 0, false);
    declareFunction(myName, "gtct_owner", "GTCT-OWNER", 1, 0, false);
    declareFunction(myName, "gtct_classes", "GTCT-CLASSES", 1, 0, false);
    declareFunction(myName, "gtct_kb", "GTCT-KB", 1, 0, false);
    declareFunction(myName, "gtct_workingP", "GTCT-WORKING?", 1, 0, false);
    declareFunction(myName, "_csetf_gtct_name", "_CSETF-GTCT-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_tuples", "_CSETF-GTCT-TUPLES", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_test", "_CSETF-GTCT-TEST", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_owner", "_CSETF-GTCT-OWNER", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_classes", "_CSETF-GTCT-CLASSES", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_kb", "_CSETF-GTCT-KB", 2, 0, false);
    declareFunction(myName, "_csetf_gtct_workingP", "_CSETF-GTCT-WORKING?", 2, 0, false);
    declareFunction(myName, "make_generic_test_case_table", "MAKE-GENERIC-TEST-CASE-TABLE", 0, 1, false);
    declareFunction(myName, "new_generic_test_case_table", "NEW-GENERIC-TEST-CASE-TABLE", 4, 3, false);
    declareFunction(myName, "generic_test_case_table_name", "GENERIC-TEST-CASE-TABLE-NAME", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_tuples", "GENERIC-TEST-CASE-TABLE-TUPLES", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_kb", "GENERIC-TEST-CASE-TABLE-KB", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_owner", "GENERIC-TEST-CASE-TABLE-OWNER", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_workingP", "GENERIC-TEST-CASE-TABLE-WORKING?", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_comment", "GENERIC-TEST-CASE-TABLE-COMMENT", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_tuples_mentioning_some_invalid_constant", "GENERIC-TEST-CASE-TABLE-TUPLES-MENTIONING-SOME-INVALID-CONSTANT", 1, 0, false);
    declareFunction(myName, "generic_test_case_table_tuple_mentions_invalid_constantP", "GENERIC-TEST-CASE-TABLE-TUPLE-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareMacro(myName, "define_test_case_table", "DEFINE-TEST-CASE-TABLE");
    declareFunction(myName, "undefine_test_case_table", "UNDEFINE-TEST-CASE-TABLE", 1, 0, false);
    declareFunction(myName, "undefine_all_test_case_tables", "UNDEFINE-ALL-TEST-CASE-TABLES", 0, 0, false);
    declareFunction(myName, "run_test_case_table", "RUN-TEST-CASE-TABLE", 1, 3, false);
    declareFunction(myName, "run_all_test_case_tables", "RUN-ALL-TEST-CASE-TABLES", 0, 5, false);
    declareFunction(myName, "run_test_case_tables_of_class", "RUN-TEST-CASE-TABLES-OF-CLASS", 1, 3, false);
    declareFunction(myName, "run_test_case_tables", "RUN-TEST-CASE-TABLES", 1, 3, false);
    declareFunction(myName, "generic_test_result_p", "GENERIC-TEST-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_success_result_p", "GENERIC-TEST-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_failure_result_p", "GENERIC-TEST-FAILURE-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_error_result_p", "GENERIC-TEST-ERROR-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_not_run_result_p", "GENERIC-TEST-NOT-RUN-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_invalid_result_p", "GENERIC-TEST-INVALID-RESULT-P", 1, 0, false);
    declareFunction(myName, "generic_test_verbosity_level_p", "GENERIC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
    declareFunction(myName, "test_cases_of_class", "TEST-CASES-OF-CLASS", 1, 0, false);
    declareFunction(myName, "test_case_name_p", "TEST-CASE-NAME-P", 1, 0, false);
    declareFunction(myName, "possibly_function_symbol_p", "POSSIBLY-FUNCTION-SYMBOL-P", 1, 0, false);
    declareFunction(myName, "define_test_case_table_int", "DEFINE-TEST-CASE-TABLE-INT", 3, 0, false);
    declareFunction(myName, "run_generic_test_case_int", "RUN-GENERIC-TEST-CASE-INT", 4, 0, false);
    declareFunction(myName, "run_test_case_table_int", "RUN-TEST-CASE-TABLE-INT", 7, 0, false);
    declareFunction(myName, "run_test_case_tableP", "RUN-TEST-CASE-TABLE?", 1, 0, false);
    declareFunction(myName, "run_test_case_tuple_int", "RUN-TEST-CASE-TUPLE-INT", 6, 0, false);
    declareFunction(myName, "determine_run_test_case_tuple_result", "DETERMINE-RUN-TEST-CASE-TUPLE-RESULT", 3, 0, false);
    declareFunction(myName, "generic_test_result_update", "GENERIC-TEST-RESULT-UPDATE", 2, 0, false);
    declareFunction(myName, "get_gtct_by_name", "GET-GTCT-BY-NAME", 1, 0, false);
    declareFunction(myName, "test_case_classes", "TEST-CASE-CLASSES", 1, 0, false);
    declareFunction(myName, "run_test_case_table_print_header", "RUN-TEST-CASE-TABLE-PRINT-HEADER", 3, 0, false);
    declareFunction(myName, "run_test_case_table_print_footer", "RUN-TEST-CASE-TABLE-PRINT-FOOTER", 5, 0, false);
    declareFunction(myName, "run_test_case_tuple_print_header", "RUN-TEST-CASE-TUPLE-PRINT-HEADER", 4, 0, false);
    declareFunction(myName, "run_test_case_tuple_print_footer", "RUN-TEST-CASE-TUPLE-PRINT-FOOTER", 5, 0, false);
    declareFunction(myName, "cfasl_output_object_generic_test_case_table_method", "CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_wide_output_generic_test_case_table", "CFASL-WIDE-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
    declareFunction(myName, "cfasl_output_generic_test_case_table", "CFASL-OUTPUT-GENERIC-TEST-CASE-TABLE", 2, 0, false);
    declareFunction(myName, "cfasl_input_generic_test_case_table", "CFASL-INPUT-GENERIC-TEST-CASE-TABLE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_generic_testing_file() {
    $test_case_table_index$ = deflexical("*TEST-CASE-TABLE-INDEX*", maybeDefault( $sym0$_TEST_CASE_TABLE_INDEX_, $test_case_table_index$, ()-> (Hashtables.make_hash_table($int1$212, Symbols.symbol_function(EQL), UNPROVIDED))));
    $ordered_test_cases$ = deflexical("*ORDERED-TEST-CASES*", maybeDefault( $sym2$_ORDERED_TEST_CASES_, $ordered_test_cases$, NIL));
    $test_case_tables_by_class$ = deflexical("*TEST-CASE-TABLES-BY-CLASS*", Hashtables.make_hash_table($int3$64, EQL, UNPROVIDED));
    $generic_test_results$ = deflexical("*GENERIC-TEST-RESULTS*", $list4);
    $generic_test_verbosity_levels$ = deflexical("*GENERIC-TEST-VERBOSITY-LEVELS*", $list5);
    $test_case_table_post_build_token$ = deflexical("*TEST-CASE-TABLE-POST-BUILD-TOKEN*", $kw6$TCT);
    $dtp_generic_test_case_table$ = defconstant("*DTP-GENERIC-TEST-CASE-TABLE*", $sym7$GENERIC_TEST_CASE_TABLE);
    $cfasl_wide_opcode_generic_test_case_table$ = defconstant("*CFASL-WIDE-OPCODE-GENERIC-TEST-CASE-TABLE*", $int84$512);
    return NIL;
  }

  public static final SubLObject setup_generic_testing_file() {
        subl_macro_promotions.declare_defglobal($sym0$_TEST_CASE_TABLE_INDEX_);
    subl_macro_promotions.declare_defglobal($sym2$_ORDERED_TEST_CASES_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), Symbols.symbol_function($sym14$GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym15$GTCT_NAME, $sym16$_CSETF_GTCT_NAME);
    Structures.def_csetf($sym17$GTCT_TUPLES, $sym18$_CSETF_GTCT_TUPLES);
    Structures.def_csetf($sym19$GTCT_TEST, $sym20$_CSETF_GTCT_TEST);
    Structures.def_csetf($sym21$GTCT_OWNER, $sym22$_CSETF_GTCT_OWNER);
    Structures.def_csetf($sym23$GTCT_CLASSES, $sym24$_CSETF_GTCT_CLASSES);
    Structures.def_csetf($sym25$GTCT_KB, $sym26$_CSETF_GTCT_KB);
    Structures.def_csetf($sym27$GTCT_WORKING_, $sym28$_CSETF_GTCT_WORKING_);
    Equality.identity($sym7$GENERIC_TEST_CASE_TABLE);
    access_macros.register_macro_helper($sym50$DEFINE_TEST_CASE_TABLE_INT, $sym65$DEFINE_TEST_CASE_TABLE);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_generic_test_case_table$.getGlobalValue(), $sym85$CFASL_INPUT_GENERIC_TEST_CASE_TABLE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_generic_test_case_table$.getGlobalValue(), Symbols.symbol_function($sym86$CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_TEST_CASE_TABLE_INDEX_ = makeSymbol("*TEST-CASE-TABLE-INDEX*");
  public static final SubLInteger $int1$212 = makeInteger(212);
  public static final SubLSymbol $sym2$_ORDERED_TEST_CASES_ = makeSymbol("*ORDERED-TEST-CASES*");
  public static final SubLInteger $int3$64 = makeInteger(64);
  public static final SubLList $list4 = list(makeKeyword("SUCCESS"), makeKeyword("FAILURE"), makeKeyword("ERROR"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));
  public static final SubLList $list5 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"), makeKeyword("POST-BUILD"));
  public static final SubLSymbol $kw6$TCT = makeKeyword("TCT");
  public static final SubLSymbol $sym7$GENERIC_TEST_CASE_TABLE = makeSymbol("GENERIC-TEST-CASE-TABLE");
  public static final SubLSymbol $sym8$GENERIC_TEST_CASE_TABLE_P = makeSymbol("GENERIC-TEST-CASE-TABLE-P");
  public static final SubLList $list9 = list(makeSymbol("NAME"), makeSymbol("TUPLES"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), makeSymbol("KB"), makeSymbol("WORKING?"));
  public static final SubLList $list10 = list(makeKeyword("NAME"), makeKeyword("TUPLES"), makeKeyword("TEST"), makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));
  public static final SubLList $list11 = list(makeSymbol("GTCT-NAME"), makeSymbol("GTCT-TUPLES"), makeSymbol("GTCT-TEST"), makeSymbol("GTCT-OWNER"), makeSymbol("GTCT-CLASSES"), makeSymbol("GTCT-KB"), makeSymbol("GTCT-WORKING?"));
  public static final SubLList $list12 = list(makeSymbol("_CSETF-GTCT-NAME"), makeSymbol("_CSETF-GTCT-TUPLES"), makeSymbol("_CSETF-GTCT-TEST"), makeSymbol("_CSETF-GTCT-OWNER"), makeSymbol("_CSETF-GTCT-CLASSES"), makeSymbol("_CSETF-GTCT-KB"), makeSymbol("_CSETF-GTCT-WORKING?"));
  public static final SubLSymbol $sym13$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym14$GENERIC_TEST_CASE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GENERIC-TEST-CASE-TABLE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym15$GTCT_NAME = makeSymbol("GTCT-NAME");
  public static final SubLSymbol $sym16$_CSETF_GTCT_NAME = makeSymbol("_CSETF-GTCT-NAME");
  public static final SubLSymbol $sym17$GTCT_TUPLES = makeSymbol("GTCT-TUPLES");
  public static final SubLSymbol $sym18$_CSETF_GTCT_TUPLES = makeSymbol("_CSETF-GTCT-TUPLES");
  public static final SubLSymbol $sym19$GTCT_TEST = makeSymbol("GTCT-TEST");
  public static final SubLSymbol $sym20$_CSETF_GTCT_TEST = makeSymbol("_CSETF-GTCT-TEST");
  public static final SubLSymbol $sym21$GTCT_OWNER = makeSymbol("GTCT-OWNER");
  public static final SubLSymbol $sym22$_CSETF_GTCT_OWNER = makeSymbol("_CSETF-GTCT-OWNER");
  public static final SubLSymbol $sym23$GTCT_CLASSES = makeSymbol("GTCT-CLASSES");
  public static final SubLSymbol $sym24$_CSETF_GTCT_CLASSES = makeSymbol("_CSETF-GTCT-CLASSES");
  public static final SubLSymbol $sym25$GTCT_KB = makeSymbol("GTCT-KB");
  public static final SubLSymbol $sym26$_CSETF_GTCT_KB = makeSymbol("_CSETF-GTCT-KB");
  public static final SubLSymbol $sym27$GTCT_WORKING_ = makeSymbol("GTCT-WORKING?");
  public static final SubLSymbol $sym28$_CSETF_GTCT_WORKING_ = makeSymbol("_CSETF-GTCT-WORKING?");
  public static final SubLSymbol $kw29$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw30$TUPLES = makeKeyword("TUPLES");
  public static final SubLSymbol $kw31$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw32$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw33$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw34$KB = makeKeyword("KB");
  public static final SubLSymbol $kw35$WORKING_ = makeKeyword("WORKING?");
  public static final SubLString $str36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw37$TINY = makeKeyword("TINY");
  public static final SubLSymbol $sym38$TEST_CASE_NAME_P = makeSymbol("TEST-CASE-NAME-P");
  public static final SubLSymbol $sym39$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym40$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym41$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym42$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym43$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLString $str44$_S_was_not_a_valid___input_____ex = makeString("~S was not a valid (<input> . <expected-results>) tuple");
  public static final SubLString $str45$ = makeString("");
  public static final SubLSymbol $sym46$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLList $list47 = list(makeSymbol("TEST-CASE-NAME"), list(makeSymbol("&KEY"), makeSymbol("TEST"), makeSymbol("OWNER"), makeSymbol("CLASSES"), list(makeSymbol("KB"), makeKeyword("TINY")), list(makeSymbol("WORKING?"), T)), makeSymbol("&BODY"), makeSymbol("TUPLES"));
  public static final SubLList $list48 = list(makeKeyword("TEST"), makeKeyword("OWNER"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));
  public static final SubLSymbol $kw49$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $sym50$DEFINE_TEST_CASE_TABLE_INT = makeSymbol("DEFINE-TEST-CASE-TABLE-INT");
  public static final SubLSymbol $sym51$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym52$LIST = makeSymbol("LIST");
  public static final SubLSymbol $kw53$VERBOSE = makeKeyword("VERBOSE");
  public static final SubLSymbol $sym54$STREAMP = makeSymbol("STREAMP");
  public static final SubLSymbol $sym55$GENERIC_TEST_VERBOSITY_LEVEL_P = makeSymbol("GENERIC-TEST-VERBOSITY-LEVEL-P");
  public static final SubLSymbol $kw56$UNDEFINED = makeKeyword("UNDEFINED");
  public static final SubLString $str57$__There_is_no_test_case_table_nam = makeString("~%There is no test case table named ~s.");
  public static final SubLSymbol $kw58$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw59$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw60$STANDARD = makeKeyword("STANDARD");
  public static final SubLSymbol $kw61$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLSymbol $kw62$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw63$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $kw64$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $sym65$DEFINE_TEST_CASE_TABLE = makeSymbol("DEFINE-TEST-CASE-TABLE");
  public static final SubLList $list66 = list(makeSymbol("&KEY"), makeSymbol("OWNER"), makeSymbol("TEST"), makeSymbol("CLASSES"), makeSymbol("KB"), list(makeSymbol("WORKING?"), T));
  public static final SubLList $list67 = list(makeKeyword("OWNER"), makeKeyword("TEST"), makeKeyword("CLASSES"), makeKeyword("KB"), makeKeyword("WORKING?"));
  public static final SubLSymbol $kw68$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLList $list69 = list(makeSymbol("INPUT-ARGS"), makeSymbol("&REST"), makeSymbol("EXPECTED-RESULTS"));
  public static final SubLSymbol $sym70$QUOTIFY = makeSymbol("QUOTIFY");
  public static final SubLSymbol $sym71$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str72$_S____ = makeString("~S -> ");
  public static final SubLString $str73$Starting__S______ = makeString("Starting ~S :~%~%");
  public static final SubLString $str74$_S__ = makeString("~S~%");
  public static final SubLString $str75$_S__S__S__OWNER__S__ = makeString("~S ~S ~S :OWNER ~S~%");
  public static final SubLString $str76$__Overall_result_for__S___S__ = makeString("~%Overall result for ~S: ~S~%");
  public static final SubLString $str77$Please_notify__a_cyc_com_ = makeString("Please notify ~a@cyc.com.");
  public static final SubLString $str78$__Input___s____Expected_result___ = makeString("  Input: ~s~%  Expected result: ~s  ~%");
  public static final SubLString $str79$__Input___s____Expected_results__ = makeString("  Input: ~s~%  Expected results: ~s  ~%");
  public static final SubLString $str80$__________SUCCESS__ = makeString("~%    -> :SUCCESS~%");
  public static final SubLString $str81$__________ERROR__S__ = makeString("~%    -> :ERROR ~S~%");
  public static final SubLString $str82$____Actual_result___s____Compared = makeString("    Actual result: ~s~%  Compared via: ~s~%  -> :FAILURE~%");
  public static final SubLString $str83$____Actual_results___s____Compare = makeString("    Actual results: ~s~%  Compared via: ~s~%  -> :FAILURE~%");
  public static final SubLInteger $int84$512 = makeInteger(512);
  public static final SubLSymbol $sym85$CFASL_INPUT_GENERIC_TEST_CASE_TABLE = makeSymbol("CFASL-INPUT-GENERIC-TEST-CASE-TABLE");
  public static final SubLSymbol $sym86$CFASL_OUTPUT_OBJECT_GENERIC_TEST_CASE_TABLE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-GENERIC-TEST-CASE-TABLE-METHOD");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_generic_testing_file();
  }

  @Override
  public void initializeVariables() {
    init_generic_testing_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_generic_testing_file();
  }

}
