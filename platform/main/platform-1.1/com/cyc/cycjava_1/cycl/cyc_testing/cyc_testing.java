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

package  com.cyc.cycjava_1.cycl.cyc_testing;

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
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing_initialization;
import com.cyc.cycjava_1.cycl.cyc_testing.evaluatable_relation_tests;
import com.cyc.cycjava_1.cycl.file_utilities;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
import com.cyc.cycjava_1.cycl.cyc_testing.inference_unit_tests;
import com.cyc.cycjava_1.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.numeric_date_utilities;
import com.cyc.cycjava_1.cycl.cyc_testing.removal_module_cost_tests;
import com.cyc.cycjava_1.cycl.cyc_testing.removal_module_tests;
import com.cyc.cycjava_1.cycl.string_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.system_info;
import com.cyc.cycjava_1.cycl.cyc_testing.transformation_module_tests;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class cyc_testing extends SubLTranslatedFile {

  //// Constructor

  private cyc_testing() {}
  public static final SubLFile me = new cyc_testing();
  public static final String myName = "com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing";

  //// Definitions

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1478) 
  public static SubLSymbol $it_output_format$ = null;

  /** Set this to T if you want to debug the tests (not catch errors) */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1703) 
  public static SubLSymbol $cyc_test_debugP$ = null;

  /** Whether to run tests that only require the tiny KB in the full KB.  The default is t so that
it's easy to run all tests on a full KB, but should be bound to NIL when testing on both a tiny and a full KB. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 1819) 
  public static SubLSymbol $run_tiny_kb_tests_in_full_kbP$ = null;

  /** Whether to test real-time while-inference-is-running pruning.  This will force :compute-answer-justifications? to NIL
and will only run tests where that makes sense. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2087) 
  private static SubLSymbol $test_real_time_pruningP$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2311) 
  public static final SubLObject testing_real_time_pruningP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $test_real_time_pruningP$.getDynamicValue(thread);
    }
  }

  /** The possible levels of verbosity for Cyc tests. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2394) 
  private static SubLSymbol $cyc_test_verbosity_levels$ = null;

  /** Bound to the current file being loaded, so that the tests can know what file they're in */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2523) 
  public static SubLSymbol $cyc_test_filename$ = null;

  /** Whether we should warn if a test has the same name as another test.
This often happens when tests are redefined or updated, so we only want to do it when
we're loading tests from a clean initial state. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 2665) 
  public static SubLSymbol $warn_on_duplicate_cyc_test_namesP$ = null;

  /** Test results that mean that the test succeeded. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3300) 
  private static SubLSymbol $cyc_test_result_success_values$ = null;

  /** Test results that mean that the test failed. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3456) 
  private static SubLSymbol $cyc_test_result_failure_values$ = null;

  /** Test results that mean that the test was ignored, or that the test result should be ignored, and counted as neither a success nor a failure. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3608) 
  private static SubLSymbol $cyc_test_result_ignore_values$ = null;

  /** All possible results for tests */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 3876) 
  private static SubLSymbol $cyc_test_result_values$ = null;

  /** The table of known Cyc test types.
   Column 1 is a uniquely identifying keyword.
   Column 2 is a string description of the test type. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 4662) 
  private static SubLSymbol $cyc_test_type_table$ = null;

  /** The master ordered list of all Cyc test objects. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5648) 
  private static SubLSymbol $cyc_tests$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 5793) 
  public static final SubLObject cyc_tests() {
    return $cyc_tests$.getGlobalValue();
  }

  /** An index from NAME -> Cyc Test object */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6446) 
  private static SubLSymbol $cyc_test_by_name$ = null;

  /** An index from DWIMMED-NAME -> list of Cyc Test objects */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6558) 
  private static SubLSymbol $cyc_test_by_dwimmed_name$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 6695) 
  public static final SubLObject index_cyc_test_by_name(SubLObject ct, SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $warn_on_duplicate_cyc_test_namesP$.getDynamicValue(thread))) {
        if ((NIL != Hashtables.gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED))) {
          Errors.warn($str24$A_Cyc_test_named__a_already_exist, name);
        }
      }
      Hashtables.sethash(name, $cyc_test_by_name$.getGlobalValue(), ct);
      Hashtables.sethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), ConsesLow.nconc(Hashtables.gethash(name, $cyc_test_by_dwimmed_name$.getGlobalValue(), UNPROVIDED), list(ct)));
      if (name.isCons()) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32431");
      }
      if ((NIL != cyc_testing_initialization.cyc_tests_initializedP())) {
        {
          SubLObject rmt = cyc_test_guts(ct);
          if ((NIL != Functions.funcall($sym25$REMOVAL_MODULE_TEST_P, rmt))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32432");
          }
        }
      }
      if ((NIL != cyc_testing_initialization.cyc_tests_initializedP())) {
        {
          SubLObject rmct = cyc_test_guts(ct);
          if ((NIL != Functions.funcall($sym27$REMOVAL_MODULE_COST_TEST_P, rmct))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32433");
          }
        }
      }
      return ct;
    }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9280) 
  public static final SubLObject index_all_cyc_tests_by_name() {
    {
      SubLObject csome_list_var = cyc_tests();
      SubLObject ct = NIL;
      for (ct = csome_list_var.first(); (NIL != csome_list_var); csome_list_var = csome_list_var.rest(), ct = csome_list_var.first()) {
        index_cyc_test_by_name(ct, cyc_test_name(ct));
      }
    }
    return NIL;
  }

  public static final class $cyc_test_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $file; }
    public SubLObject getField3() { return $guts; }
    public SubLObject setField2(SubLObject value) { return $file = value; }
    public SubLObject setField3(SubLObject value) { return $guts = value; }
    public SubLObject $file = NIL;
    public SubLObject $guts = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cyc_test_native.class, $sym29$CYC_TEST, $sym30$CYC_TEST_P, $list31, $list32, new String[] {"$file", "$guts"}, $list33, $list34, $sym35$PRINT_CYC_TEST);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static SubLSymbol $dtp_cyc_test$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static final SubLObject cyc_test_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32446");
    return NIL;
  }

  public static final class $cyc_test_p$UnaryFunction extends UnaryFunction {
    public $cyc_test_p$UnaryFunction() { super(extractFunctionNamed("CYC-TEST-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32382"); }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static final SubLObject ct_guts(SubLObject object) {
    checkType(object, $sym30$CYC_TEST_P);
    return object.getField3();
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static final SubLObject _csetf_ct_file(SubLObject object, SubLObject value) {
    checkType(object, $sym30$CYC_TEST_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static final SubLObject _csetf_ct_guts(SubLObject object, SubLObject value) {
    checkType(object, $sym30$CYC_TEST_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 9579) 
  public static final SubLObject make_cyc_test(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $cyc_test_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw41$FILE)) {
            _csetf_ct_file(v_new, current_value);
          } else if (pcase_var.eql($kw42$GUTS)) {
            _csetf_ct_guts(v_new, current_value);
          } else {
            Errors.error($str43$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 10007) 
  public static final SubLObject new_cyc_test(SubLObject file, SubLObject guts) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != file)) {
        checkType(file, $sym46$STRINGP);
      }
      if ((NIL != cyc_testing_initialization.cyc_tests_initializedP())) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == Functions.funcall($sym47$CYC_TEST_GUTS_P, guts))) {
            Errors.error($str48$_s_is_not_a_CYC_TEST_GUTS_P, guts);
          }
        }
      } else {
        checkType(guts, $sym49$GENERIC_TEST_CASE_TABLE_P);
      }
      {
        SubLObject ct = make_cyc_test(UNPROVIDED);
        _csetf_ct_file(ct, file);
        _csetf_ct_guts(ct, guts);
        {
          SubLObject name = ((NIL != cyc_testing_initialization.cyc_tests_initializedP()) ? ((SubLObject) Functions.funcall($sym50$CYC_TEST_NAME, ct)) : generic_testing.generic_test_case_table_name(guts));
          SubLObject existing_ct = find_cyc_test_by_exact_name(name);
          if ((NIL != existing_ct)) {
            $cyc_tests$.setGlobalValue(Sequences.delete(existing_ct, $cyc_tests$.getGlobalValue(), Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32458");
          }
          {
            SubLObject new_cons = cons(ct, NIL);
            SubLObject list = $cyc_tests$.getGlobalValue();
            if ((NIL != list)) {
              subl_macros.rplacd_last(list, new_cons);
            } else {
              $cyc_tests$.setGlobalValue(new_cons);
            }
          }
          index_cyc_test_by_name(ct, name);
        }
        return ct;
      }
    }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11034) 
  public static final SubLObject cyc_test_guts(SubLObject ct) {
    return ct_guts(ct);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11092) 
  public static final SubLObject cyc_test_type(SubLObject ct) {
    {
      SubLObject type = cyc_test_type_permissive(ct);
      if ((NIL != type)) {
        return type;
      } else {
        return Errors.error($str51$Cyc_test_of_unexpected_type___s, ct);
      }
    }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11362) 
  public static final SubLObject cyc_test_type_permissive(SubLObject ct) {
    {
      SubLObject guts = cyc_test_guts(ct);
      return cyc_test_guts_type(guts);
    }
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11483) 
  public static final SubLObject cyc_test_guts_type(SubLObject guts) {
    if ((NIL != generic_testing.generic_test_case_table_p(guts))) {
      return $kw52$TCT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32334"))) {
      return $kw53$IUT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32476"))) {
      return $kw54$RMT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32510"))) {
      return $kw55$RMCT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32552"))) {
      return $kw56$TMT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32268"))) {
      return $kw57$ERT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1237"))) {
      return $kw58$IT;
    } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1431"))) {
      return $kw59$KCT;
    } else {
      return NIL;
    }
  }

  /** Names are assumed to be unique, even across type */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 11952) 
  public static final SubLObject cyc_test_name(SubLObject ct) {
    {
      SubLObject guts = cyc_test_guts(ct);
      SubLObject pcase_var = cyc_test_type(ct);
      if (pcase_var.eql($kw53$IUT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32325");
      } else if (pcase_var.eql($kw58$IT)) {
        return guts;
      } else if (pcase_var.eql($kw54$RMT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32474");
      } else if (pcase_var.eql($kw56$TMT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32551");
      } else if (pcase_var.eql($kw55$RMCT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32508");
      } else if (pcase_var.eql($kw57$ERT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32265");
      } else if (pcase_var.eql($kw52$TCT)) {
        return generic_testing.generic_test_case_table_name(guts);
      } else if (pcase_var.eql($kw59$KCT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1");
      } else {
        return Errors.error($str51$Cyc_test_of_unexpected_type___s, guts);
      }
    }
  }

  /** @return cyc-test-run-p */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 19130) 
  public static final SubLObject find_cyc_test_by_exact_name(SubLObject name) {
    return Hashtables.gethash(name, $cyc_test_by_name$.getGlobalValue(), UNPROVIDED);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 30475) 
  private static SubLSymbol $cfasl_wide_opcode_cyc_test$ = null;

  /** The master ordered list of all Cyc test file objects. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 35706) 
  private static SubLSymbol $cyc_test_files$ = null;

  public static final class $cyc_test_file_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $filename; }
    public SubLObject getField3() { return $kb; }
    public SubLObject setField2(SubLObject value) { return $filename = value; }
    public SubLObject setField3(SubLObject value) { return $kb = value; }
    public SubLObject $filename = NIL;
    public SubLObject $kb = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($cyc_test_file_native.class, $sym135$CYC_TEST_FILE, $sym136$CYC_TEST_FILE_P, $list137, $list138, new String[] {"$filename", "$kb"}, $list139, $list140, $sym141$PRINT_CYC_TEST_FILE);
  }

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 36548) 
  public static SubLSymbol $dtp_cyc_test_file$ = null;

  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 36548) 
  public static final SubLObject cyc_test_file_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32447");
    return NIL;
  }

  public static final class $cyc_test_file_p$UnaryFunction extends UnaryFunction {
    public $cyc_test_file_p$UnaryFunction() { super(extractFunctionNamed("CYC-TEST-FILE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32372"); }
  }

  /** The most recent runs are saved here for the cases where they're not returned directly */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37365) 
  private static SubLSymbol $most_recent_cyc_test_runs$ = null;

  /** The cyc test files which failed to load the last time load-all-cyc-tests was evaluated. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 37596) 
  private static SubLSymbol $most_recent_cyc_test_file_load_failures$ = null;

  /** A list of tests that will fail if :compute-answer-justifications? is forced to NIL and/or if problem store pruning happens while they're running. */
  @SubL(source = "cycl/cyc-testing/cyc-testing.lisp", position = 53805) 
  private static SubLSymbol $tests_that_dont_work_with_real_time_pruning$ = null;

  public static final SubLObject declare_cyc_testing_file() {
    declareFunction(myName, "testing_real_time_pruningP", "TESTING-REAL-TIME-PRUNING?", 0, 0, false);
    declareFunction(myName, "cyc_test_kb_p", "CYC-TEST-KB-P", 1, 0, false);
    declareFunction(myName, "cyc_test_verbosity_level_p", "CYC-TEST-VERBOSITY-LEVEL-P", 1, 0, false);
    declareFunction(myName, "cyc_test_output_format_p", "CYC-TEST-OUTPUT-FORMAT-P", 1, 0, false);
    declareFunction(myName, "cyc_test_result_p", "CYC-TEST-RESULT-P", 1, 0, false);
    declareFunction(myName, "cyc_test_success_result_p", "CYC-TEST-SUCCESS-RESULT-P", 1, 0, false);
    declareFunction(myName, "cyc_test_failure_result_p", "CYC-TEST-FAILURE-RESULT-P", 1, 0, false);
    declareFunction(myName, "cyc_test_ignore_result_p", "CYC-TEST-IGNORE-RESULT-P", 1, 0, false);
    declareFunction(myName, "cyc_test_result_L", "CYC-TEST-RESULT-<", 2, 0, false);
    declareFunction(myName, "cyc_test_type_p", "CYC-TEST-TYPE-P", 1, 0, false);
    declareFunction(myName, "cyc_test_type_spec_p", "CYC-TEST-TYPE-SPEC-P", 1, 0, false);
    declareFunction(myName, "cyc_test_type_pretty_name", "CYC-TEST-TYPE-PRETTY-NAME", 1, 0, false);
    declareFunction(myName, "cyc_tests", "CYC-TESTS", 0, 0, false);
    declareFunction(myName, "undefine_all_cyc_tests", "UNDEFINE-ALL-CYC-TESTS", 0, 0, false);
    declareMacro(myName, "do_cyc_tests", "DO-CYC-TESTS");
    declareMacro(myName, "progress_do_cyc_tests", "PROGRESS-DO-CYC-TESTS");
    declareFunction(myName, "cyc_test_count", "CYC-TEST-COUNT", 0, 0, false);
    declareFunction(myName, "no_cyc_tests_definedP", "NO-CYC-TESTS-DEFINED?", 0, 0, false);
    declareFunction(myName, "index_cyc_test_by_name", "INDEX-CYC-TEST-BY-NAME", 2, 0, false);
    declareFunction(myName, "unindex_cyc_test_by_name", "UNINDEX-CYC-TEST-BY-NAME", 2, 0, false);
    declareFunction(myName, "my_pushnew_to_end_hash", "MY-PUSHNEW-TO-END-HASH", 3, 0, false);
    declareFunction(myName, "my_delete_value_from_hash", "MY-DELETE-VALUE-FROM-HASH", 3, 0, false);
    declareFunction(myName, "index_all_cyc_tests_by_name", "INDEX-ALL-CYC-TESTS-BY-NAME", 0, 0, false);
    declareFunction(myName, "cyc_test_print_function_trampoline", "CYC-TEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cyc_test_p", "CYC-TEST-P", 1, 0, false); new $cyc_test_p$UnaryFunction();
    declareFunction(myName, "ct_file", "CT-FILE", 1, 0, false);
    declareFunction(myName, "ct_guts", "CT-GUTS", 1, 0, false);
    declareFunction(myName, "_csetf_ct_file", "_CSETF-CT-FILE", 2, 0, false);
    declareFunction(myName, "_csetf_ct_guts", "_CSETF-CT-GUTS", 2, 0, false);
    declareFunction(myName, "make_cyc_test", "MAKE-CYC-TEST", 0, 1, false);
    declareFunction(myName, "print_cyc_test", "PRINT-CYC-TEST", 3, 0, false);
    declareFunction(myName, "new_cyc_test", "NEW-CYC-TEST", 2, 0, false);
    declareFunction(myName, "cyc_test_file", "CYC-TEST-FILE", 1, 0, false);
    declareFunction(myName, "cyc_test_guts", "CYC-TEST-GUTS", 1, 0, false);
    declareFunction(myName, "cyc_test_type", "CYC-TEST-TYPE", 1, 0, false);
    declareFunction(myName, "cyc_test_guts_p", "CYC-TEST-GUTS-P", 1, 0, false);
    declareFunction(myName, "cyc_test_type_permissive", "CYC-TEST-TYPE-PERMISSIVE", 1, 0, false);
    declareFunction(myName, "cyc_test_guts_type", "CYC-TEST-GUTS-TYPE", 1, 0, false);
    declareFunction(myName, "cyc_test_name", "CYC-TEST-NAME", 1, 0, false);
    declareFunction(myName, "cyc_test_kb", "CYC-TEST-KB", 1, 0, false);
    declareFunction(myName, "cyc_test_owner", "CYC-TEST-OWNER", 1, 0, false);
    declareFunction(myName, "cyc_test_workingP", "CYC-TEST-WORKING?", 1, 0, false);
    declareFunction(myName, "cyc_test_comment", "CYC-TEST-COMMENT", 1, 0, false);
    declareFunction(myName, "cyc_test_project", "CYC-TEST-PROJECT", 1, 0, false);
    declareFunction(myName, "cyc_test_names_mentioning_invalid_constants", "CYC-TEST-NAMES-MENTIONING-INVALID-CONSTANTS", 0, 1, false);
    declareFunction(myName, "cyc_test_mentions_invalid_constantP", "CYC-TEST-MENTIONS-INVALID-CONSTANT?", 1, 0, false);
    declareFunction(myName, "cyc_test_invalid_constant_test_names", "CYC-TEST-INVALID-CONSTANT-TEST-NAMES", 1, 0, false);
    declareFunction(myName, "tiny_kb_cyc_test_p", "TINY-KB-CYC-TEST-P", 1, 0, false);
    declareFunction(myName, "full_kb_cyc_test_p", "FULL-KB-CYC-TEST-P", 1, 0, false);
    declareFunction(myName, "non_working_cyc_tests", "NON-WORKING-CYC-TESTS", 0, 1, false);
    declareFunction(myName, "find_cyc_test_by_exact_name", "FIND-CYC-TEST-BY-EXACT-NAME", 1, 0, false);
    declareFunction(myName, "find_cyc_test", "FIND-CYC-TEST", 1, 0, false);
    declareFunction(myName, "find_cyc_tests", "FIND-CYC-TESTS", 1, 0, false);
    declareFunction(myName, "find_cyc_tests_by_name", "FIND-CYC-TESTS-BY-NAME", 1, 0, false);
    declareFunction(myName, "find_cyc_test_filename", "FIND-CYC-TEST-FILENAME", 1, 0, false);
    declareMacro(myName, "run_cyc_test", "RUN-CYC-TEST");
    declareMacro(myName, "run_cyc_test_verbose", "RUN-CYC-TEST-VERBOSE");
    declareFunction(myName, "run_cyc_test_int", "RUN-CYC-TEST-INT", 7, 0, false);
    declareMacro(myName, "run_cyc_test_parallel", "RUN-CYC-TEST-PARALLEL");
    declareFunction(myName, "run_cyc_test_parallel_int", "RUN-CYC-TEST-PARALLEL-INT", 9, 0, false);
    declareFunction(myName, "run_cyc_test_object_parallel", "RUN-CYC-TEST-OBJECT-PARALLEL", 9, 0, false);
    declareFunction(myName, "run_cyc_test_object", "RUN-CYC-TEST-OBJECT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_iut", "RUN-CYC-TEST-IUT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_it", "RUN-CYC-TEST-IT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_it_int", "RUN-CYC-TEST-IT-INT", 4, 0, false);
    declareFunction(myName, "run_cyc_test_rmt", "RUN-CYC-TEST-RMT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_tmt", "RUN-CYC-TEST-TMT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_rmct", "RUN-CYC-TEST-RMCT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_ert", "RUN-CYC-TEST-ERT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_tct", "RUN-CYC-TEST-TCT", 7, 0, false);
    declareFunction(myName, "run_cyc_test_kct", "RUN-CYC-TEST-KCT", 7, 0, false);
    declareFunction(myName, "cfasl_output_object_cyc_test_method", "CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_wide_output_cyc_test", "CFASL-WIDE-OUTPUT-CYC-TEST", 2, 0, false);
    declareFunction(myName, "cfasl_output_cyc_test_internal", "CFASL-OUTPUT-CYC-TEST-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_input_cyc_test", "CFASL-INPUT-CYC-TEST", 1, 0, false);
    declareFunction(myName, "new_cyc_test_run", "NEW-CYC-TEST-RUN", 4, 0, false);
    declareFunction(myName, "cyc_test_run_p", "CYC-TEST-RUN-P", 1, 0, false);
    declareFunction(myName, "cyc_test_run_type", "CYC-TEST-RUN-TYPE", 1, 0, false);
    declareFunction(myName, "cyc_test_run_name", "CYC-TEST-RUN-NAME", 1, 0, false);
    declareFunction(myName, "cyc_test_run_result", "CYC-TEST-RUN-RESULT", 1, 0, false);
    declareFunction(myName, "cyc_test_run_time", "CYC-TEST-RUN-TIME", 1, 0, false);
    declareFunction(myName, "cyc_test_run_cyc_test", "CYC-TEST-RUN-CYC-TEST", 1, 0, false);
    declareFunction(myName, "cyc_test_runs_overall_result", "CYC-TEST-RUNS-OVERALL-RESULT", 1, 0, false);
    declareFunction(myName, "cyc_test_result_update", "CYC-TEST-RESULT-UPDATE", 2, 0, false);
    declareFunction(myName, "cyc_test_runs_total_time", "CYC-TEST-RUNS-TOTAL-TIME", 1, 0, false);
    declareFunction(myName, "failing_cyc_test_run_p", "FAILING-CYC-TEST-RUN-P", 1, 0, false);
    declareFunction(myName, "succeeding_cyc_test_run_p", "SUCCEEDING-CYC-TEST-RUN-P", 1, 0, false);
    declareFunction(myName, "ignored_cyc_test_run_p", "IGNORED-CYC-TEST-RUN-P", 1, 0, false);
    declareFunction(myName, "cyc_test_run_owner", "CYC-TEST-RUN-OWNER", 1, 0, false);
    declareFunction(myName, "cyc_test_run_project", "CYC-TEST-RUN-PROJECT", 1, 0, false);
    declareFunction(myName, "print_cyc_test_run_summary", "PRINT-CYC-TEST-RUN-SUMMARY", 4, 0, false);
    declareFunction(myName, "cyc_test_run_summary", "CYC-TEST-RUN-SUMMARY", 3, 0, false);
    declareFunction(myName, "cyc_test_files", "CYC-TEST-FILES", 0, 0, false);
    declareMacro(myName, "do_cyc_test_files", "DO-CYC-TEST-FILES");
    declareMacro(myName, "progress_do_cyc_test_files", "PROGRESS-DO-CYC-TEST-FILES");
    declareFunction(myName, "cyc_test_file_count", "CYC-TEST-FILE-COUNT", 0, 0, false);
    declareFunction(myName, "cyc_test_file_print_function_trampoline", "CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "cyc_test_file_p", "CYC-TEST-FILE-P", 1, 0, false); new $cyc_test_file_p$UnaryFunction();
    declareFunction(myName, "ctf_filename", "CTF-FILENAME", 1, 0, false);
    declareFunction(myName, "ctf_kb", "CTF-KB", 1, 0, false);
    declareFunction(myName, "_csetf_ctf_filename", "_CSETF-CTF-FILENAME", 2, 0, false);
    declareFunction(myName, "_csetf_ctf_kb", "_CSETF-CTF-KB", 2, 0, false);
    declareFunction(myName, "make_cyc_test_file", "MAKE-CYC-TEST-FILE", 0, 1, false);
    declareFunction(myName, "print_cyc_test_file", "PRINT-CYC-TEST-FILE", 3, 0, false);
    declareFunction(myName, "new_cyc_test_file", "NEW-CYC-TEST-FILE", 2, 0, false);
    declareFunction(myName, "cyc_test_file_filename", "CYC-TEST-FILE-FILENAME", 1, 0, false);
    declareFunction(myName, "find_cyc_test_file", "FIND-CYC-TEST-FILE", 1, 0, false);
    declareFunction(myName, "most_recent_cyc_test_runs", "MOST-RECENT-CYC-TEST-RUNS", 0, 0, false);
    declareFunction(myName, "most_recent_failing_cyc_test_runs", "MOST-RECENT-FAILING-CYC-TEST-RUNS", 0, 0, false);
    declareFunction(myName, "most_recent_failing_cyc_tests", "MOST-RECENT-FAILING-CYC-TESTS", 0, 0, false);
    declareFunction(myName, "most_recent_cyc_test_file_load_failures", "MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES", 0, 0, false);
    declareMacro(myName, "run_all_cyc_tests", "RUN-ALL-CYC-TESTS");
    declareFunction(myName, "run_all_cyc_tests_int", "RUN-ALL-CYC-TESTS-INT", 1, 9, false);
    declareMacro(myName, "rerun_failing_cyc_tests", "RERUN-FAILING-CYC-TESTS");
    declareMacro(myName, "declare_cyc_test_file", "DECLARE-CYC-TEST-FILE");
    declareMacro(myName, "run_cyc_tests", "RUN-CYC-TESTS");
    declareFunction(myName, "load_all_cyc_tests", "LOAD-ALL-CYC-TESTS", 1, 3, false);
    declareFunction(myName, "parse_testdcl_path", "PARSE-TESTDCL-PATH", 1, 0, false);
    declareFunction(myName, "run_all_loaded_cyc_tests", "RUN-ALL-LOADED-CYC-TESTS", 0, 10, false);
    declareFunction(myName, "undeclare_all_cyc_test_files", "UNDECLARE-ALL-CYC-TEST-FILES", 0, 0, false);
    declareFunction(myName, "undeclare_cyc_test_file", "UNDECLARE-CYC-TEST-FILE", 1, 0, false);
    declareFunction(myName, "declare_cyc_test_file_int", "DECLARE-CYC-TEST-FILE-INT", 2, 0, false);
    declareFunction(myName, "load_cyc_test_file", "LOAD-CYC-TEST-FILE", 4, 0, false);
    declareFunction(myName, "load_testdcl", "LOAD-TESTDCL", 1, 1, false);
    declareFunction(myName, "run_all_loaded_cyc_tests_int", "RUN-ALL-LOADED-CYC-TESTS-INT", 8, 1, false);
    declareFunction(myName, "new_cyc_test_null_run", "NEW-CYC-TEST-NULL-RUN", 1, 0, false);
    declareFunction(myName, "new_cyc_test_invalid_run", "NEW-CYC-TEST-INVALID-RUN", 1, 0, false);
    declareFunction(myName, "run_cyc_testP", "RUN-CYC-TEST?", 4, 0, false);
    declareFunction(myName, "run_all_loaded_cyc_tests_print_header", "RUN-ALL-LOADED-CYC-TESTS-PRINT-HEADER", 3, 0, false);
    declareFunction(myName, "run_all_loaded_cyc_tests_print_footer", "RUN-ALL-LOADED-CYC-TESTS-PRINT-FOOTER", 5, 0, false);
    declareFunction(myName, "print_failing_cyc_tests_message", "PRINT-FAILING-CYC-TESTS-MESSAGE", 2, 2, false);
    declareFunction(myName, "print_succeeding_cyc_tests_message", "PRINT-SUCCEEDING-CYC-TESTS-MESSAGE", 2, 2, false);
    declareFunction(myName, "print_ignored_cyc_tests_message", "PRINT-IGNORED-CYC-TESTS-MESSAGE", 2, 2, false);
    declareFunction(myName, "show_cyc_test_run", "SHOW-CYC-TEST-RUN", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_cyc_testing_file() {
    $it_output_format$ = defparameter("*IT-OUTPUT-FORMAT*", $kw0$STANDARD);
    $cyc_test_debugP$ = defparameter("*CYC-TEST-DEBUG?*", NIL);
    $run_tiny_kb_tests_in_full_kbP$ = defparameter("*RUN-TINY-KB-TESTS-IN-FULL-KB?*", T);
    $test_real_time_pruningP$ = defparameter("*TEST-REAL-TIME-PRUNING?*", NIL);
    $cyc_test_verbosity_levels$ = deflexical("*CYC-TEST-VERBOSITY-LEVELS*", $list1);
    $cyc_test_filename$ = defparameter("*CYC-TEST-FILENAME*", NIL);
    $warn_on_duplicate_cyc_test_namesP$ = defparameter("*WARN-ON-DUPLICATE-CYC-TEST-NAMES?*", NIL);
    $cyc_test_result_success_values$ = deflexical("*CYC-TEST-RESULT-SUCCESS-VALUES*", $list4);
    $cyc_test_result_failure_values$ = deflexical("*CYC-TEST-RESULT-FAILURE-VALUES*", $list5);
    $cyc_test_result_ignore_values$ = deflexical("*CYC-TEST-RESULT-IGNORE-VALUES*", $list6);
    $cyc_test_result_values$ = deflexical("*CYC-TEST-RESULT-VALUES*", ConsesLow.append($cyc_test_result_success_values$.getGlobalValue(), $cyc_test_result_failure_values$.getGlobalValue(), $cyc_test_result_ignore_values$.getGlobalValue()));
    $cyc_test_type_table$ = deflexical("*CYC-TEST-TYPE-TABLE*", $list7);
    $cyc_tests$ = deflexical("*CYC-TESTS*", ((NIL != Symbols.boundp($sym11$_CYC_TESTS_)) ? ((SubLObject) $cyc_tests$.getGlobalValue()) : NIL));
    $cyc_test_by_name$ = deflexical("*CYC-TEST-BY-NAME*", ((NIL != Symbols.boundp($sym21$_CYC_TEST_BY_NAME_)) ? ((SubLObject) $cyc_test_by_name$.getGlobalValue()) : Hashtables.make_hash_table($int22$212, Symbols.symbol_function(EQUAL), UNPROVIDED)));
    $cyc_test_by_dwimmed_name$ = deflexical("*CYC-TEST-BY-DWIMMED-NAME*", ((NIL != Symbols.boundp($sym23$_CYC_TEST_BY_DWIMMED_NAME_)) ? ((SubLObject) $cyc_test_by_dwimmed_name$.getGlobalValue()) : Hashtables.make_hash_table($int22$212, Symbols.symbol_function(EQUAL), UNPROVIDED)));
    $dtp_cyc_test$ = defconstant("*DTP-CYC-TEST*", $sym29$CYC_TEST);
    $cfasl_wide_opcode_cyc_test$ = defconstant("*CFASL-WIDE-OPCODE-CYC-TEST*", $int112$514);
    $cyc_test_files$ = deflexical("*CYC-TEST-FILES*", ((NIL != Symbols.boundp($sym128$_CYC_TEST_FILES_)) ? ((SubLObject) $cyc_test_files$.getGlobalValue()) : NIL));
    $dtp_cyc_test_file$ = defconstant("*DTP-CYC-TEST-FILE*", $sym135$CYC_TEST_FILE);
    $most_recent_cyc_test_runs$ = deflexical("*MOST-RECENT-CYC-TEST-RUNS*", ((NIL != Symbols.boundp($sym151$_MOST_RECENT_CYC_TEST_RUNS_)) ? ((SubLObject) $most_recent_cyc_test_runs$.getGlobalValue()) : NIL));
    $most_recent_cyc_test_file_load_failures$ = deflexical("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*", ((NIL != Symbols.boundp($sym152$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_)) ? ((SubLObject) $most_recent_cyc_test_file_load_failures$.getGlobalValue()) : NIL));
    $tests_that_dont_work_with_real_time_pruning$ = deflexical("*TESTS-THAT-DONT-WORK-WITH-REAL-TIME-PRUNING*", $list206);
    return NIL;
  }

  public static final SubLObject setup_cyc_testing_file() {
    // CVS_ID("Id: cyc-testing.lisp 128822 2009-09-22 17:25:29Z pace ");
    subl_macro_promotions.declare_defglobal($sym11$_CYC_TESTS_);
    subl_macro_promotions.declare_defglobal($sym21$_CYC_TEST_BY_NAME_);
    subl_macro_promotions.declare_defglobal($sym23$_CYC_TEST_BY_DWIMMED_NAME_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function($sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym37$CT_FILE, $sym38$_CSETF_CT_FILE);
    Structures.def_csetf($sym39$CT_GUTS, $sym40$_CSETF_CT_GUTS);
    Equality.identity($sym29$CYC_TEST);
    access_macros.register_macro_helper($sym79$RUN_CYC_TEST_INT, $sym83$RUN_CYC_TEST);
    access_macros.register_macro_helper($sym92$RUN_CYC_TEST_PARALLEL_INT, $sym93$RUN_CYC_TEST_PARALLEL);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cyc_test$.getGlobalValue(), $sym113$CFASL_INPUT_CYC_TEST);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_cyc_test$.getGlobalValue(), Symbols.symbol_function($sym114$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD));
    subl_macro_promotions.declare_defglobal($sym128$_CYC_TEST_FILES_);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_cyc_test_file$.getGlobalValue(), Symbols.symbol_function($sym142$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym143$CTF_FILENAME, $sym144$_CSETF_CTF_FILENAME);
    Structures.def_csetf($sym145$CTF_KB, $sym146$_CSETF_CTF_KB);
    Equality.identity($sym135$CYC_TEST_FILE);
    subl_macro_promotions.declare_defglobal($sym151$_MOST_RECENT_CYC_TEST_RUNS_);
    subl_macro_promotions.declare_defglobal($sym152$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_);
    access_macros.register_macro_helper($sym169$DECLARE_CYC_TEST_FILE_INT, $sym176$DECLARE_CYC_TEST_FILE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$STANDARD = makeKeyword("STANDARD");
  public static final SubLList $list1 = list(makeKeyword("SILENT"), makeKeyword("TERSE"), makeKeyword("VERBOSE"));
  public static final SubLList $list2 = list(makeKeyword("TINY"), makeKeyword("FULL"), makeKeyword("BOTH"));
  public static final SubLList $list3 = list(makeKeyword("STANDARD"), makeKeyword("POST-BUILD"));
  public static final SubLList $list4 = list(makeKeyword("SUCCESS"), makeKeyword("REGRESSION-SUCCESS"));
  public static final SubLList $list5 = list(makeKeyword("FAILURE"), makeKeyword("REGRESSION-FAILURE"), makeKeyword("ABNORMAL"), makeKeyword("ERROR"));
  public static final SubLList $list6 = list(makeKeyword("NON-REGRESSION-SUCCESS"), makeKeyword("NON-REGRESSION-FAILURE"), makeKeyword("NOT-RUN"), makeKeyword("INVALID"));
  public static final SubLList $list7 = list(list(makeKeyword("IUT"), makeString("inference unit test")), list(makeKeyword("IT"), makeString("inference test")), list(makeKeyword("RMT"), makeString("removal module test")), list(makeKeyword("TMT"), makeString("transformation module test")), list(makeKeyword("RMCT"), makeString("removal module cost test")), list(makeKeyword("ERT"), makeString("evaluatable relation test")), list(makeKeyword("TCT"), makeString("test case table")), list(makeKeyword("KCT"), makeString("KB content test")));
  public static final SubLSymbol $sym8$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $kw9$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym10$CYC_TEST_TYPE_P = makeSymbol("CYC-TEST-TYPE-P");
  public static final SubLSymbol $sym11$_CYC_TESTS_ = makeSymbol("*CYC-TESTS*");
  public static final SubLList $list12 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list13 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw14$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw15$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym16$CSOME = makeSymbol("CSOME");
  public static final SubLList $list17 = list(makeSymbol("CYC-TESTS"));
  public static final SubLList $list18 = list(list(makeSymbol("CYC-TEST"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all Cyc tests"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str19$Iterating_over_all_Cyc_tests = makeString("Iterating over all Cyc tests");
  public static final SubLSymbol $sym20$PROGRESS_CDOLIST = makeSymbol("PROGRESS-CDOLIST");
  public static final SubLSymbol $sym21$_CYC_TEST_BY_NAME_ = makeSymbol("*CYC-TEST-BY-NAME*");
  public static final SubLInteger $int22$212 = makeInteger(212);
  public static final SubLSymbol $sym23$_CYC_TEST_BY_DWIMMED_NAME_ = makeSymbol("*CYC-TEST-BY-DWIMMED-NAME*");
  public static final SubLString $str24$A_Cyc_test_named__a_already_exist = makeString("A Cyc test named ~a already existed; overwriting");
  public static final SubLSymbol $sym25$REMOVAL_MODULE_TEST_P = makeSymbol("REMOVAL-MODULE-TEST-P");
  public static final SubLSymbol $sym26$REMOVAL_MODULE_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-TEST-PREDICATE");
  public static final SubLSymbol $sym27$REMOVAL_MODULE_COST_TEST_P = makeSymbol("REMOVAL-MODULE-COST-TEST-P");
  public static final SubLSymbol $sym28$REMOVAL_MODULE_COST_TEST_PREDICATE = makeSymbol("REMOVAL-MODULE-COST-TEST-PREDICATE");
  public static final SubLSymbol $sym29$CYC_TEST = makeSymbol("CYC-TEST");
  public static final SubLSymbol $sym30$CYC_TEST_P = makeSymbol("CYC-TEST-P");
  public static final SubLList $list31 = list(makeSymbol("FILE"), makeSymbol("GUTS"));
  public static final SubLList $list32 = list(makeKeyword("FILE"), makeKeyword("GUTS"));
  public static final SubLList $list33 = list(makeSymbol("CT-FILE"), makeSymbol("CT-GUTS"));
  public static final SubLList $list34 = list(makeSymbol("_CSETF-CT-FILE"), makeSymbol("_CSETF-CT-GUTS"));
  public static final SubLSymbol $sym35$PRINT_CYC_TEST = makeSymbol("PRINT-CYC-TEST");
  public static final SubLSymbol $sym36$CYC_TEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym37$CT_FILE = makeSymbol("CT-FILE");
  public static final SubLSymbol $sym38$_CSETF_CT_FILE = makeSymbol("_CSETF-CT-FILE");
  public static final SubLSymbol $sym39$CT_GUTS = makeSymbol("CT-GUTS");
  public static final SubLSymbol $sym40$_CSETF_CT_GUTS = makeSymbol("_CSETF-CT-GUTS");
  public static final SubLSymbol $kw41$FILE = makeKeyword("FILE");
  public static final SubLSymbol $kw42$GUTS = makeKeyword("GUTS");
  public static final SubLString $str43$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str44$__CYC_TEST__a__a_ = makeString("#<CYC-TEST:~a:~a>");
  public static final SubLString $str45$__CYC_TEST__a_ = makeString("#<CYC-TEST:~a>");
  public static final SubLSymbol $sym46$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym47$CYC_TEST_GUTS_P = makeSymbol("CYC-TEST-GUTS-P");
  public static final SubLString $str48$_s_is_not_a_CYC_TEST_GUTS_P = makeString("~s is not a CYC-TEST-GUTS-P");
  public static final SubLSymbol $sym49$GENERIC_TEST_CASE_TABLE_P = makeSymbol("GENERIC-TEST-CASE-TABLE-P");
  public static final SubLSymbol $sym50$CYC_TEST_NAME = makeSymbol("CYC-TEST-NAME");
  public static final SubLString $str51$Cyc_test_of_unexpected_type___s = makeString("Cyc test of unexpected type: ~s");
  public static final SubLSymbol $kw52$TCT = makeKeyword("TCT");
  public static final SubLSymbol $kw53$IUT = makeKeyword("IUT");
  public static final SubLSymbol $kw54$RMT = makeKeyword("RMT");
  public static final SubLSymbol $kw55$RMCT = makeKeyword("RMCT");
  public static final SubLSymbol $kw56$TMT = makeKeyword("TMT");
  public static final SubLSymbol $kw57$ERT = makeKeyword("ERT");
  public static final SubLSymbol $kw58$IT = makeKeyword("IT");
  public static final SubLSymbol $kw59$KCT = makeKeyword("KCT");
  public static final SubLSymbol $kw60$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw61$BOTH = makeKeyword("BOTH");
  public static final SubLSymbol $kw62$FULL = makeKeyword("FULL");
  public static final SubLSymbol $sym63$CYC_TEST_TYPE_SPEC_P = makeSymbol("CYC-TEST-TYPE-SPEC-P");
  public static final SubLSymbol $sym64$CYC_TEST_WORKING_ = makeSymbol("CYC-TEST-WORKING?");
  public static final SubLSymbol $sym65$NOT_EQ = makeSymbol("NOT-EQ");
  public static final SubLSymbol $sym66$CYC_TEST_TYPE = makeSymbol("CYC-TEST-TYPE");
  public static final SubLSymbol $sym67$FIND_CYC_TEST = makeSymbol("FIND-CYC-TEST");
  public static final SubLList $list68 = list(makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));
  public static final SubLList $list69 = list(makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
  public static final SubLSymbol $kw70$VERBOSITY = makeKeyword("VERBOSITY");
  public static final SubLSymbol $kw71$TERSE = makeKeyword("TERSE");
  public static final SubLSymbol $kw72$BROWSABLE_ = makeKeyword("BROWSABLE?");
  public static final SubLSymbol $kw73$BLOCK_ = makeKeyword("BLOCK?");
  public static final SubLSymbol $kw74$OUTPUT_FORMAT = makeKeyword("OUTPUT-FORMAT");
  public static final SubLSymbol $kw75$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $sym76$_STANDARD_OUTPUT_ = makeSymbol("*STANDARD-OUTPUT*");
  public static final SubLSymbol $kw77$RUN_TINY_KB_TESTS_IN_FULL_KB_ = makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?");
  public static final SubLSymbol $sym78$_RUN_TINY_KB_TESTS_IN_FULL_KB__ = makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*");
  public static final SubLSymbol $sym79$RUN_CYC_TEST_INT = makeSymbol("RUN-CYC-TEST-INT");
  public static final SubLList $list80 = list(makeSymbol("NAME"), makeSymbol("&KEY"), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))));
  public static final SubLList $list81 = list(makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
  public static final SubLSymbol $kw82$VERBOSE = makeKeyword("VERBOSE");
  public static final SubLSymbol $sym83$RUN_CYC_TEST = makeSymbol("RUN-CYC-TEST");
  public static final SubLSymbol $sym84$CYC_TEST_VERBOSITY_LEVEL_P = makeSymbol("CYC-TEST-VERBOSITY-LEVEL-P");
  public static final SubLSymbol $sym85$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym86$CYC_TEST_OUTPUT_FORMAT_P = makeSymbol("CYC-TEST-OUTPUT-FORMAT-P");
  public static final SubLSymbol $sym87$STREAMP = makeSymbol("STREAMP");
  public static final SubLList $list88 = list(new SubLObject[] {makeSymbol("NAME"), makeSymbol("&KEY"), list(makeSymbol("NTHREADS"), FOUR_INTEGER), list(makeSymbol("NTIMES"), TEN_INTEGER), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), makeSymbol("BROWSABLE?"), makeSymbol("BLOCK?"), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*")))});
  public static final SubLList $list89 = list(makeKeyword("NTHREADS"), makeKeyword("NTIMES"), makeKeyword("VERBOSITY"), makeKeyword("BROWSABLE?"), makeKeyword("BLOCK?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("STREAM"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"));
  public static final SubLSymbol $kw90$NTHREADS = makeKeyword("NTHREADS");
  public static final SubLSymbol $kw91$NTIMES = makeKeyword("NTIMES");
  public static final SubLSymbol $sym92$RUN_CYC_TEST_PARALLEL_INT = makeSymbol("RUN-CYC-TEST-PARALLEL-INT");
  public static final SubLSymbol $sym93$RUN_CYC_TEST_PARALLEL = makeSymbol("RUN-CYC-TEST-PARALLEL");
  public static final SubLSymbol $sym94$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLString $str95$Parallel_Test_Thread_for_ = makeString("Parallel Test Thread for ");
  public static final SubLString $str96$_No__ = makeString(" No. ");
  public static final SubLSymbol $sym97$RUN_CYC_TEST_OBJECT_PARALLEL = makeSymbol("RUN-CYC-TEST-OBJECT-PARALLEL");
  public static final SubLSymbol $kw98$SILENT = makeKeyword("SILENT");
  public static final SubLString $str99$Can_t_run_inference_tests_in_brow = makeString("Can't run inference tests in browsable mode -- ignoring :browsable? setting~%");
  public static final SubLString $str100$Can_t_run_inference_tests_in_bloc = makeString("Can't run inference tests in blocking mode -- ignoring :block? setting~%");
  public static final SubLSymbol $kw101$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw102$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym103$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLString $str104$Unexpected_testing_direction____S = makeString("Unexpected testing direction : ~S");
  public static final SubLSymbol $kw105$ERROR = makeKeyword("ERROR");
  public static final SubLString $str106$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in browsable mode -- ignoring :browsable? setting~%");
  public static final SubLString $str107$Can_t_run_removal_module_cost_tes = makeString("Can't run removal module cost tests in blocking mode -- ignoring :block? setting~%");
  public static final SubLString $str108$Can_t_run_evaluatable_relation_te = makeString("Can't run evaluatable relation tests in blocking mode -- ignoring :block? setting~%");
  public static final SubLString $str109$Can_t_run_test_case_tables_in_bro = makeString("Can't run test case tables in browsable mode -- ignoring :browsable? setting~%");
  public static final SubLString $str110$Can_t_run_test_case_tables_in_blo = makeString("Can't run test case tables in blocking mode -- ignoring :block? setting~%");
  public static final SubLSymbol $kw111$POST_BUILD = makeKeyword("POST-BUILD");
  public static final SubLInteger $int112$514 = makeInteger(514);
  public static final SubLSymbol $sym113$CFASL_INPUT_CYC_TEST = makeSymbol("CFASL-INPUT-CYC-TEST");
  public static final SubLSymbol $sym114$CFASL_OUTPUT_OBJECT_CYC_TEST_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CYC-TEST-METHOD");
  public static final SubLSymbol $sym115$CYC_TEST_RESULT_P = makeSymbol("CYC-TEST-RESULT-P");
  public static final SubLSymbol $sym116$NON_NEGATIVE_NUMBER_P = makeSymbol("NON-NEGATIVE-NUMBER-P");
  public static final SubLSymbol $sym117$CYC_TEST_RUN_P = makeSymbol("CYC-TEST-RUN-P");
  public static final SubLList $list118 = list(makeKeyword("NOT-RUN"), makeKeyword("INVALID"));
  public static final SubLSymbol $kw119$NOT_RUN = makeKeyword("NOT-RUN");
  public static final SubLSymbol $kw120$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw121$SUCCESS = makeKeyword("SUCCESS");
  public static final SubLString $str122$___S_____S = makeString("~&~S -> ~S");
  public static final SubLString $str123$_S__S__S__ = makeString("~S ~S ~S~%");
  public static final SubLString $str124$Unknown_output_format__A = makeString("Unknown output format ~A");
  public static final SubLString $str125$_ = makeString(" ");
  public static final SubLSymbol $kw126$WITH_OWNER = makeKeyword("WITH-OWNER");
  public static final SubLString $str127$Unknown_output_format_ = makeString("Unknown output format ");
  public static final SubLSymbol $sym128$_CYC_TEST_FILES_ = makeSymbol("*CYC-TEST-FILES*");
  public static final SubLList $list129 = list(list(makeSymbol("CYC-TEST-FILE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym130$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLList $list131 = list(list(makeSymbol("CYC-TEST-FILES")));
  public static final SubLList $list132 = list(list(makeSymbol("CYC-TEST-FILE"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("Iterating over all test files"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str133$Iterating_over_all_test_files = makeString("Iterating over all test files");
  public static final SubLList $list134 = list(makeSymbol("CYC-TEST-FILES"));
  public static final SubLSymbol $sym135$CYC_TEST_FILE = makeSymbol("CYC-TEST-FILE");
  public static final SubLSymbol $sym136$CYC_TEST_FILE_P = makeSymbol("CYC-TEST-FILE-P");
  public static final SubLList $list137 = list(makeSymbol("FILENAME"), makeSymbol("KB"));
  public static final SubLList $list138 = list(makeKeyword("FILENAME"), makeKeyword("KB"));
  public static final SubLList $list139 = list(makeSymbol("CTF-FILENAME"), makeSymbol("CTF-KB"));
  public static final SubLList $list140 = list(makeSymbol("_CSETF-CTF-FILENAME"), makeSymbol("_CSETF-CTF-KB"));
  public static final SubLSymbol $sym141$PRINT_CYC_TEST_FILE = makeSymbol("PRINT-CYC-TEST-FILE");
  public static final SubLSymbol $sym142$CYC_TEST_FILE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CYC-TEST-FILE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym143$CTF_FILENAME = makeSymbol("CTF-FILENAME");
  public static final SubLSymbol $sym144$_CSETF_CTF_FILENAME = makeSymbol("_CSETF-CTF-FILENAME");
  public static final SubLSymbol $sym145$CTF_KB = makeSymbol("CTF-KB");
  public static final SubLSymbol $sym146$_CSETF_CTF_KB = makeSymbol("_CSETF-CTF-KB");
  public static final SubLSymbol $kw147$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw148$KB = makeKeyword("KB");
  public static final SubLString $str149$__CTF__a_ = makeString("#<CTF:~a>");
  public static final SubLSymbol $sym150$CYC_TEST_KB_P = makeSymbol("CYC-TEST-KB-P");
  public static final SubLSymbol $sym151$_MOST_RECENT_CYC_TEST_RUNS_ = makeSymbol("*MOST-RECENT-CYC-TEST-RUNS*");
  public static final SubLSymbol $sym152$_MOST_RECENT_CYC_TEST_FILE_LOAD_FAILURES_ = makeSymbol("*MOST-RECENT-CYC-TEST-FILE-LOAD-FAILURES*");
  public static final SubLSymbol $sym153$FAILING_CYC_TEST_RUN_P = makeSymbol("FAILING-CYC-TEST-RUN-P");
  public static final SubLSymbol $sym154$CYC_TEST_RUN_CYC_TEST = makeSymbol("CYC-TEST-RUN-CYC-TEST");
  public static final SubLList $list155 = list(new SubLObject[] {makeSymbol("PATH"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("TERSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RUN-TINY-KB-TESTS-IN-FULL-KB?"), list(makeSymbol("QUOTE"), makeSymbol("*RUN-TINY-KB-TESTS-IN-FULL-KB?*"))), list(makeSymbol("RUN-TEST-CASE-TABLES?"), T), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL)});
  public static final SubLList $list156 = list(new SubLObject[] {makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RUN-TINY-KB-TESTS-IN-FULL-KB?"), makeKeyword("RUN-TEST-CASE-TABLES?"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS")});
  public static final SubLSymbol $kw157$STOP_AT_FIRST_FAILURE_ = makeKeyword("STOP-AT-FIRST-FAILURE?");
  public static final SubLSymbol $kw158$RUN_TEST_CASE_TABLES_ = makeKeyword("RUN-TEST-CASE-TABLES?");
  public static final SubLSymbol $kw159$RETURN_TEST_RUNS_ = makeKeyword("RETURN-TEST-RUNS?");
  public static final SubLSymbol $kw160$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $kw161$RUN_NON_WORKING_TESTS = makeKeyword("RUN-NON-WORKING-TESTS");
  public static final SubLSymbol $sym162$RUN_ALL_CYC_TESTS_INT = makeSymbol("RUN-ALL-CYC-TESTS-INT");
  public static final SubLList $list163 = list(makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL));
  public static final SubLList $list164 = list(makeKeyword("STREAM"), makeKeyword("VERBOSITY"), makeKeyword("STOP-AT-FIRST-FAILURE?"), makeKeyword("OUTPUT-FORMAT"), makeKeyword("RETURN-TEST-RUNS?"), makeKeyword("TYPE"), makeKeyword("RUN-NON-WORKING-TESTS"));
  public static final SubLSymbol $sym165$RUN_ALL_LOADED_CYC_TESTS = makeSymbol("RUN-ALL-LOADED-CYC-TESTS");
  public static final SubLSymbol $sym166$QUOTE = makeSymbol("QUOTE");
  public static final SubLList $list167 = list(makeSymbol("FILENAME"), makeSymbol("&KEY"), makeSymbol("KB"));
  public static final SubLList $list168 = list(makeKeyword("KB"));
  public static final SubLSymbol $sym169$DECLARE_CYC_TEST_FILE_INT = makeSymbol("DECLARE-CYC-TEST-FILE-INT");
  public static final SubLList $list170 = list(new SubLObject[] {makeSymbol("NAMES"), makeSymbol("&KEY"), list(makeSymbol("STREAM"), list(makeSymbol("QUOTE"), makeSymbol("*STANDARD-OUTPUT*"))), list(makeSymbol("VERBOSITY"), makeKeyword("VERBOSE")), list(makeSymbol("STOP-AT-FIRST-FAILURE?"), NIL), list(makeSymbol("OUTPUT-FORMAT"), makeKeyword("STANDARD")), list(makeSymbol("RETURN-TEST-RUNS?"), NIL), list(makeSymbol("TYPE"), makeKeyword("ALL")), list(makeSymbol("RUN-NON-WORKING-TESTS"), NIL)});
  public static final SubLSymbol $sym171$FIND_CYC_TESTS_BY_NAME = makeSymbol("FIND-CYC-TESTS-BY-NAME");
  public static final SubLString $str172$could_not_load__a_lisp_from__s = makeString("could not load ~a.lisp from ~s");
  public static final SubLString $str173$testdcl = makeString("testdcl");
  public static final SubLString $str174$Loading_test_files = makeString("Loading test files");
  public static final SubLString $str175$_lisp = makeString(".lisp");
  public static final SubLSymbol $sym176$DECLARE_CYC_TEST_FILE = makeSymbol("DECLARE-CYC-TEST-FILE");
  public static final SubLString $str177$___HARNESS_ERROR___A__ = makeString("~&:HARNESS-ERROR: ~A~%");
  public static final SubLSymbol $kw178$HARNESS_ERROR = makeKeyword("HARNESS-ERROR");
  public static final SubLSymbol $kw179$INVALID = makeKeyword("INVALID");
  public static final SubLList $list180 = list(makeKeyword("RMT"), makeKeyword("TMT"), makeKeyword("TCT"));
  public static final SubLSymbol $kw181$ONLY = makeKeyword("ONLY");
  public static final SubLString $str182$Unexpected_value__s_for__run_non_ = makeString("Unexpected value ~s for :run-non-working-tests");
  public static final SubLString $str183$_Running_a_specified_list_of_test = makeString("\nRunning a specified list of tests ");
  public static final SubLString $str184$_Running__a_file_P_of_tests_ = makeString("\nRunning ~a file~P of tests ");
  public static final SubLString $str185$in_the__a_KB__KB__a___System__a_S = makeString("in the ~a KB (KB ~a):\nSystem ~a\nStarted at ~a\n\n");
  public static final SubLString $str186$Tiny = makeString("Tiny");
  public static final SubLString $str187$Full = makeString("Full");
  public static final SubLString $str188$__No_tests_were_run___ = makeString("~&No tests were run.~%");
  public static final SubLString $str189$__NOTE__The_following_cyc_tests_w = makeString("~&NOTE: The following cyc tests were noted as not working:~%");
  public static final SubLString $str190$___Tests_finished_at__a_Total_tim = makeString("~&\nTests finished at ~a\nTotal time: ~a\nTotal test guts time: ~a\nHistogram of results:~%");
  public static final SubLSymbol $sym191$CYC_TEST_RUN_RESULT = makeSymbol("CYC-TEST-RUN-RESULT");
  public static final SubLString $str192$Overall_result___s__ = makeString("Overall result: ~s~%");
  public static final SubLString $str193$__Failing_regression_tests___ = makeString("~&Failing regression tests:~%");
  public static final SubLString $str194$None____ = makeString("None! (:");
  public static final SubLString $str195$__Succeeding_regression_tests___ = makeString("~&Succeeding regression tests:~%");
  public static final SubLSymbol $sym196$SUCCEEDING_CYC_TEST_RUN_P = makeSymbol("SUCCEEDING-CYC-TEST-RUN-P");
  public static final SubLString $str197$None____ = makeString("None! ):");
  public static final SubLSymbol $sym198$IGNORED_CYC_TEST_RUN_P = makeSymbol("IGNORED-CYC-TEST-RUN-P");
  public static final SubLString $str199$None_ = makeString("None.");
  public static final SubLSymbol $kw200$NON_REGRESSION_SUCCESS = makeKeyword("NON-REGRESSION-SUCCESS");
  public static final SubLSymbol $kw201$NON_REGRESSION_FAILURE = makeKeyword("NON-REGRESSION-FAILURE");
  public static final SubLString $str202$__Failing_non_regression_tests___ = makeString("~&Failing non-regression tests:~%");
  public static final SubLString $str203$__Succeeding_non_regression_tests = makeString("~&Succeeding non-regression tests:~%");
  public static final SubLString $str204$_S__A__S__A = makeString("~S ~A ~S ~A");
  public static final SubLString $str205$__A = makeString(" ~A");
  public static final SubLList $list206 = list(new SubLObject[] {makeKeyword("CANONICALIZE-INFERENCE-ANSWER-JUSTIFICATIONS"), makeKeyword("NON-EXPLANATORY-SENTENCE-SUPPORTS"), makeKeyword("NON-EXPLANATORY-VARIABLE-MAP-SUPPORTS"), makeKeyword("TRUE-SENTENCE-NOT-CANONICALIZATION"), makeKeyword("TRUE-SENTENCE-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("IST-OF-ATOMIC-SENTENCE-REDUCTION"), makeKeyword("RELATION-ALL-INSTANCE-ITERATE-2"), makeKeyword("RELATION-INSTANCE-ALL-ITERATE-2"), makeKeyword("REJECT-PREVIOUSLY-PROVEN-PROOFS"), makeKeyword("INFERENCE-HARNESS-OVERHEAD"), makeKeyword("TACTICALLY-UNEXAMINED-NO-GOOD-IMPLIES-STRATEGICALLY-UNEXAMINED-NO-GOOD"), makeKeyword("THE-SET-OF-ELEMENTS-RETURNS-HL-NARTS"), makeKeyword("THE-COLLECTION-OF-INSTANCES-RETURNS-HL-NARTS"), makeKeyword("GENLPREDS-LOOKUP-GENERATES-CORRECT-SUPPORTS"), makeKeyword("KAPPA-REMOVAL-WORKS"), makeKeyword("DONT-REOPEN-ANSWER-LINK"), makeKeyword("REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-14A"), makeKeyword("CLOSED-ASENT-WITH-3-CHILDREN"), makeKeyword("SIMPLE-EXCEPT-WHEN"), makeKeyword("SIMPLE-EXCEPT-WHEN-RESIDUAL-TRANSFORMATION"), makeKeyword("PARTIAL-EXCEPT-WHEN"), makeKeyword("VARIABLE-MAP-EXCEPT-WHEN"), makeKeyword("TRUE-SENTENCE-IMPLIES-VAR-CANONICALIZATION"), makeKeyword("EXCEPTION-TMS-BACKWARD-NO-OP"), makeKeyword("MULTIPLE-TRANSFORMATION-PROOFS-FOR-CLOSED-PROBLEM"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-1"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-2"), makeKeyword("BACKCHAIN-TO-REMOVAL-TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-3"), makeKeyword("COLLECTION-ISA-BACKCHAIN-REQUIRED-4"), makeKeyword("COLLECTION-GENLS-BACKCHAIN-REQUIRED-4"), makeKeyword("COLLECTION-BACKCHAIN-REQUIRED-3"), makeKeyword("COLLECTION-BACKCHAIN-REQUIRED-4"), makeKeyword("EARLY-REMOVAL-OF-8-RESTRICTED-PROBLEMS-REQUIRING-TRANSFORMATION"), makeKeyword("EARLY-NEW-ROOT-OF-9-RESTRICTED-PROBLEMS-REQUIRING-TRANSFORMATION"), makeKeyword("FORWARD-INDETERMINATE-RESULT"), makeKeyword("SIMPLE-FORWARD-PRAGMATIC-REQUIREMENT"), makeKeyword("SIMPLE-FORWARD-PRAGMATIC-REQUIREMENT-SUPPORTS"), makeKeyword("NART-ISA-IN-RIGHT-MT"), makeKeyword("FORWARD-PROBLEM-STORE-DESTRUCTION-ON-CONFLICT"), makeKeyword("FORWARD-RULE-CONCLUDING-CONSEQUENT-IN-WRONG-MT"), makeKeyword("SKOLEMIZE-FORWARD"), makeKeyword("FORWARD-INFERENCE-WITH-DEFNS"), makeKeyword("COMPLETENESS-IN-LOW-MT-DOESNT-HOSE-FORWARD-INFERENCE"), makeKeyword("HYPOTHETICAL-MT-COMPLETENESS-ASSERTION-DOESNT-HOSE-FORWARD-INFERENCE"), makeKeyword("EXCEPT-MT-IN-MID-MT-BLOCKS-HIGH-MT-FROM-LOW-MT"), makeKeyword("EXCEPT-MT-IN-HIGH-MT-HOSES-BACKWARD-INFERENCE"), makeKeyword("CYC-ASSERT-WITH-REIFIABLE-MONAD-MT"), makeKeyword("FORWARD-RULE-CONCLUDING-FALSE"), makeKeyword("SKOLEM-RESULT-ARG"), makeKeyword("UNASSERT-REIFIABLE-NAT-MT"), makeKeyword("UNASSERT-NART-MT-SENTENCE-WITH-NART"), makeKeyword("UNASSERT-REIFIABLE-NAT-MT-VIA-TL"), makeKeyword("CANONICALIZE-NESTED-MT"), makeKeyword("FUNCTION-TEST"), makeKeyword("NAT-REMOVAL"), makeKeyword("RESULTTYPE-CHANGE"), makeKeyword("META-ASSERTION-REMOVAL"), makeKeyword("ARG-TYPE-MT-DENOTING-FUNCTION"), makeKeyword("MAX-FLOOR-MTS-OF-NAT"), makeKeyword("CONTEXTUALIZED-COLLECTION-SPECPRED-OF-ISA"), makeKeyword("USE-DEFNS-TO-CHECK-INFERENCE-SEMANTICALLY-VALID-DNF"), makeKeyword("SBHL-TRUMPS-DEFNS"), makeKeyword("SKOLEMIZE-FORWARD-NAUT-GENL-MT-WFF-EXCEPTION"), makeKeyword("ONE-STEP"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("TWO-STEP-ARG-1"), makeKeyword("MANY-STEP"), makeKeyword("CROSS-MT"), makeKeyword("DISJUNCTIVE-SYLLOGISM"), makeKeyword("ARGUMENTATION"), makeKeyword("TMS-LOOP"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("RECONSIDER-DEDUCTION"), makeKeyword("HL-SUPPORT-MT-HANDLING"), makeKeyword("THERE-EXISTS"), makeKeyword("EXCEPT-WHEN"), makeKeyword("EXCEPT-WHEN"), makeKeyword("STRENGTH-PROPAGATION"), makeKeyword("SEQUENCE-VARIABLES-INFERENCE"), makeKeyword("INFERENCE-ANSWER-TEMPLATE"), makeKeyword("FORWARD-PROPAGATE-MT"), makeKeyword("FORWARD-PROPAGATE-MT-CONTINUE"), makeKeyword("IST-TRIGGERS-FORWARD-INFERENCE-SIMPLE"), makeKeyword("FORWARD-NON-TRIGGER-LITERAL-HONORED"), makeKeyword("EXCEPT-BLOCKS-BACKWARD"), makeKeyword("EXCEPT-BLOCKS-FORWARD"), makeKeyword("TRUE-SENTENCE-UNIVERSAL-DISJUNCTION-SCOPING"), makeKeyword("TMS-RECONSIDERATION-WITH-BACKCHAIN-FORBIDDEN"), makeKeyword("TMS-FOR-HL-SUPPORTS"), makeKeyword("ASSERTION-DIRECTION"), makeKeyword("MERGE-IGNORES-OPAQUE-REFERENCES"), makeKeyword("MT-FLOORS-WRT-ISA-PATHS"), makeKeyword("MIN-GENL-MTS"), makeKeyword("MIN-GENL-PREDICATES"), makeKeyword("MIN-GENLS-COLLECTION"), makeKeyword("SPLIT-NO-GOODNESS-PROPAGATION"), makeKeyword("LAZILY-MANIFEST-NON-FOCALS"), makeKeyword("CONSIDER-NO-GOOD-AFTER-DETERMINING-TACTICS"), makeKeyword("REMOVAL-ALL-ISA-OF-TYPE-2"), makeKeyword("AVOID-LOOKUP-ON-INDETERMINATES"), makeKeyword("IRRELEVANT-DOES-NOT-IMPLY-PENDING"), makeKeyword("ASSERTED-INSTANCE-OF-DISJOINT-COLLECTIONS"), makeKeyword("CHAINING-SKOLEM-STRAIGHTFORWARD"), makeKeyword("CHAINING-SKOLEM-SHALLOW"), makeKeyword("CHAINING-SKOLEM-DEEP"), makeKeyword("CHAINING-SKOLEM"), makeKeyword("EXCEPT-DECONTEXTUALIZED"), makeKeyword("PROBLEM-STORE-PRUNING-MAX-INSUFFICIENT"), makeKeyword("RESTRICTED-CLOSED-GOOD-PROBLEMS-STAY-UNEXAMINED"), makeKeyword("GENLS-BETWEEN"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-1"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-2"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-3"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-4"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-5"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-6"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-7"), makeKeyword("CONJUNCTIVE-INTEGER-BETWEEN-8"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED"), makeKeyword("CONJUNCTIVE-FOLLOWUP-ADDITIONAL-JOIN-ORDERED-WITHOUT-INFERENCE"), makeKeyword("CIRCULAR-PROOFS")});

  //// Initializers

  public void declareFunctions() {
    declare_cyc_testing_file();
  }

  public void initializeVariables() {
    init_cyc_testing_file();
  }

  public void runTopLevelForms() {
    setup_cyc_testing_file();
  }

}
