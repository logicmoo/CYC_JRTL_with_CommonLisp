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

package com.cyc.cycjava_1.cycl.inference;
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.arete;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cfasl_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.constants_high;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.encapsulation;
//dm import com.cyc.cycjava_1.cycl.file_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_macros;
//dm import com.cyc.cycjava_1.cycl.kb_control_vars;
//dm import com.cyc.cycjava_1.cycl.inference.kbq_query_run;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class janus extends SubLTranslatedFile {

  //// Constructor

  private janus() {}
  public static final SubLFile me = new janus();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.janus";

  //// Definitions

  @SubL(source = "cycl/inference/janus.lisp", position = 5938) 
  public static final SubLObject janus_test_case_loggingP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return control_vars.$janus_test_case_loggingP$.getDynamicValue(thread);
    }
  }

  @SubL(source = "cycl/inference/janus.lisp", position = 6102) 
  private static SubLSymbol $janus_transcript_directory$ = null;

  @SubL(source = "cycl/inference/janus.lisp", position = 8223) 
  public static final SubLObject janus_note_create_finished(SubLObject new_constant) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != janus_test_case_loggingP())) {
        if ((NIL != constant_handles.valid_constantP(new_constant, UNPROVIDED))) {
          {
            SubLObject new_cons = cons(new_constant, NIL);
            SubLObject list = control_vars.$janus_new_constants$.getDynamicValue(thread);
            if ((NIL != list)) {
              subl_macros.rplacd_last(list, new_cons);
            } else {
              control_vars.$janus_new_constants$.setDynamicValue(new_cons, thread);
            }
          }
          {
            SubLObject name = constants_high.constant_name(new_constant);
            SubLObject external_id = constants_high.constant_external_id(new_constant);
            control_vars.$janus_operations$.setDynamicValue(cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3402"), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
          }
          return T;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/janus.lisp", position = 8752) 
  public static final SubLObject janus_note_assert_finished(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject deduce_specs) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != janus_test_case_loggingP())) {
        if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3398"))) {
          deduce_specs = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3379");
          {
            SubLObject allowed_rules = kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
            if (((NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED))
                || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED))
                || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, deduce_specs, UNPROVIDED, UNPROVIDED))
                || (NIL != (($kw13$ALL == allowed_rules) ? ((SubLObject) NIL) : Sequences.find_if($sym14$INVALID_ASSERTION_, allowed_rules, UNPROVIDED, UNPROVIDED, UNPROVIDED))))) {
              Errors.warn($str15$invalid_term_in_assert_op___s__s_, new SubLObject[] {sentence, mt, deduce_specs, kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread)});
              return NIL;
            }
            control_vars.$janus_operations$.setDynamicValue(cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3401"), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
            return T;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/janus.lisp", position = 9573) 
  public static final SubLObject janus_note_query_finished(SubLObject sentence, SubLObject mt, SubLObject query_properties, SubLObject result, SubLObject halt_reason) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != janus_test_case_loggingP())) {
        if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3399"))) {
          result = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3380");
          if (((NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, sentence, UNPROVIDED, UNPROVIDED))
              || (NIL != cycl_utilities.expression_find_if($sym12$INVALID_CONSTANT_, mt, UNPROVIDED, UNPROVIDED)))) {
            Errors.warn($str16$invalid_constant_in_query_op___s_, sentence, mt);
            return NIL;
          }
          if ((NIL != conses_high.getf(query_properties, $kw17$PROBLEM_STORE, UNPROVIDED))) {
            Errors.warn($str18$ignoring_problem_store_reuse_for_, sentence, mt, query_properties);
            query_properties = conses_high.remf(conses_high.copy_list(query_properties), $kw17$PROBLEM_STORE);
          }
          control_vars.$janus_operations$.setDynamicValue(cons(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3405"), control_vars.$janus_operations$.getDynamicValue(thread)), thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/janus.lisp", position = 10663) 
  public static final SubLObject janus_note_argument(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != janus_test_case_loggingP())
          || (NIL != janus_test_case_runningP()))) {
        cnf = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3381");
        mt = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3382");
        if (($kw20$DEDUCTION == arguments.argument_spec_type(argument_spec))) {
          if ((NIL != janus_test_case_runningP())) {
            control_vars.$janus_testing_deduce_specs$.setDynamicValue(cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3403"), control_vars.$janus_testing_deduce_specs$.getDynamicValue(thread)), thread);
          } else {
            control_vars.$janus_extraction_deduce_specs$.setDynamicValue(cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3404"), control_vars.$janus_extraction_deduce_specs$.getDynamicValue(thread)), thread);
          }
          return T;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/janus.lisp", position = 11341) 
  private static SubLSymbol $janus_experiment_directory$ = null;

  @SubL(source = "cycl/inference/janus.lisp", position = 12289) 
  public static final SubLObject janus_test_case_runningP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return control_vars.$janus_test_case_runningP$.getDynamicValue(thread);
    }
  }

  public static final SubLObject declare_janus_file() {
    //declareFunction(myName, "janus_operation_p", "JANUS-OPERATION-P", 1, 0, false);
    //declareFunction(myName, "janus_operation_type", "JANUS-OPERATION-TYPE", 1, 0, false);
    //declareFunction(myName, "janus_create_operation_p", "JANUS-CREATE-OPERATION-P", 1, 0, false);
    //declareFunction(myName, "janus_assert_operation_p", "JANUS-ASSERT-OPERATION-P", 1, 0, false);
    //declareFunction(myName, "janus_query_operation_p", "JANUS-QUERY-OPERATION-P", 1, 0, false);
    //declareFunction(myName, "janus_modification_operation_p", "JANUS-MODIFICATION-OPERATION-P", 1, 0, false);
    //declareFunction(myName, "new_janus_create_op", "NEW-JANUS-CREATE-OP", 2, 1, false);
    //declareFunction(myName, "new_janus_deduce_spec", "NEW-JANUS-DEDUCE-SPEC", 4, 0, false);
    //declareFunction(myName, "new_janus_assert_op", "NEW-JANUS-ASSERT-OP", 6, 1, false);
    //declareFunction(myName, "new_janus_query_op", "NEW-JANUS-QUERY-OP", 5, 1, false);
    //declareFunction(myName, "janus_create_op_name", "JANUS-CREATE-OP-NAME", 1, 0, false);
    //declareFunction(myName, "janus_create_op_external_id", "JANUS-CREATE-OP-EXTERNAL-ID", 1, 0, false);
    //declareFunction(myName, "janus_create_op_tag", "JANUS-CREATE-OP-TAG", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_sentence", "JANUS-ASSERT-OP-SENTENCE", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_mt", "JANUS-ASSERT-OP-MT", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_strength", "JANUS-ASSERT-OP-STRENGTH", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_direction", "JANUS-ASSERT-OP-DIRECTION", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_expected_deduce_specs", "JANUS-ASSERT-OP-EXPECTED-DEDUCE-SPECS", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_allowed_rules", "JANUS-ASSERT-OP-ALLOWED-RULES", 1, 0, false);
    //declareFunction(myName, "janus_assert_op_tag", "JANUS-ASSERT-OP-TAG", 1, 0, false);
    //declareFunction(myName, "janus_query_op_sentence", "JANUS-QUERY-OP-SENTENCE", 1, 0, false);
    //declareFunction(myName, "janus_query_op_mt", "JANUS-QUERY-OP-MT", 1, 0, false);
    //declareFunction(myName, "janus_query_op_query_properties", "JANUS-QUERY-OP-QUERY-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "janus_query_op_expected_result", "JANUS-QUERY-OP-EXPECTED-RESULT", 1, 0, false);
    //declareFunction(myName, "janus_query_op_expected_halt_reason", "JANUS-QUERY-OP-EXPECTED-HALT-REASON", 1, 0, false);
    //declareFunction(myName, "janus_query_op_tag", "JANUS-QUERY-OP-TAG", 1, 0, false);
    //declareFunction(myName, "janus_new_constantP", "JANUS-NEW-CONSTANT?", 1, 0, false);
    //declareFunction(myName, "janus_dwim_constant", "JANUS-DWIM-CONSTANT", 1, 0, false);
    //declareFunction(myName, "janus_dwimmed_constant_id", "JANUS-DWIMMED-CONSTANT-ID", 1, 0, false);
    //declareFunction(myName, "janus_dwimmed_constantP", "JANUS-DWIMMED-CONSTANT?", 1, 0, false);
    //declareFunction(myName, "janus_dwim_expression", "JANUS-DWIM-EXPRESSION", 1, 0, false);
    //declareFunction(myName, "set_janus_tag", "SET-JANUS-TAG", 1, 0, false);
    declareFunction(myName, "janus_test_case_loggingP", "JANUS-TEST-CASE-LOGGING?", 0, 0, false);
    //declareFunction(myName, "janus_within_somethingP", "JANUS-WITHIN-SOMETHING?", 0, 0, false);
    //declareFunction(myName, "janus_transcript_full_filename", "JANUS-TRANSCRIPT-FULL-FILENAME", 1, 0, false);
    //declareFunction(myName, "save_janus_transcript", "SAVE-JANUS-TRANSCRIPT", 2, 1, false);
    //declareFunction(myName, "load_janus_transcript", "LOAD-JANUS-TRANSCRIPT", 1, 0, false);
    //declareFunction(myName, "janus_op_index", "JANUS-OP-INDEX", 2, 0, false);
    //declareFunction(myName, "janus_op_indices", "JANUS-OP-INDICES", 2, 0, false);
    //declareFunction(myName, "extract_janus_operations", "EXTRACT-JANUS-OPERATIONS", 1, 0, false);
    declareFunction(myName, "janus_note_create_finished", "JANUS-NOTE-CREATE-FINISHED", 1, 0, false);
    declareFunction(myName, "janus_note_assert_finished", "JANUS-NOTE-ASSERT-FINISHED", 5, 0, false);
    declareFunction(myName, "janus_note_query_finished", "JANUS-NOTE-QUERY-FINISHED", 5, 0, false);
    //declareFunction(myName, "janus_note_new_continuable_inference", "JANUS-NOTE-NEW-CONTINUABLE-INFERENCE", 3, 0, false);
    declareFunction(myName, "janus_note_argument", "JANUS-NOTE-ARGUMENT", 5, 0, false);
    //declareFunction(myName, "janus_experiment_full_filename", "JANUS-EXPERIMENT-FULL-FILENAME", 1, 0, false);
    //declareMacro(myName, "run_janus_experiment", "RUN-JANUS-EXPERIMENT");
    declareFunction(myName, "janus_test_case_runningP", "JANUS-TEST-CASE-RUNNING?", 0, 0, false);
    //declareFunction(myName, "execute_janus_operations", "EXECUTE-JANUS-OPERATIONS", 1, 6, false);
    //declareFunction(myName, "execute_janus_operation", "EXECUTE-JANUS-OPERATION", 1, 4, false);
    //declareFunction(myName, "execute_janus_create_operations", "EXECUTE-JANUS-CREATE-OPERATIONS", 1, 0, false);
    //declareFunction(myName, "execute_janus_modification_operation", "EXECUTE-JANUS-MODIFICATION-OPERATION", 1, 0, false);
    //declareFunction(myName, "kill_janus_constants", "KILL-JANUS-CONSTANTS", 1, 0, false);
    //declareFunction(myName, "execute_janus_create", "EXECUTE-JANUS-CREATE", 1, 0, false);
    //declareFunction(myName, "execute_janus_assert", "EXECUTE-JANUS-ASSERT", 1, 0, false);
    //declareFunction(myName, "dwim_janus_assert_operation", "DWIM-JANUS-ASSERT-OPERATION", 1, 0, false);
    //declareFunction(myName, "dwim_janus_query_properties", "DWIM-JANUS-QUERY-PROPERTIES", 1, 0, false);
    //declareFunction(myName, "janus_operation_successP", "JANUS-OPERATION-SUCCESS?", 2, 1, false);
    //declareFunction(myName, "janus_create_successP", "JANUS-CREATE-SUCCESS?", 2, 0, false);
    //declareFunction(myName, "janus_assert_successP", "JANUS-ASSERT-SUCCESS?", 2, 0, false);
    //declareFunction(myName, "janus_query_successP", "JANUS-QUERY-SUCCESS?", 2, 1, false);
    //declareFunction(myName, "janus_query_result_successP", "JANUS-QUERY-RESULT-SUCCESS?", 2, 0, false);
    //declareFunction(myName, "load_janus_experiment", "LOAD-JANUS-EXPERIMENT", 1, 0, false);
    //declareFunction(myName, "janus_experiment_p", "JANUS-EXPERIMENT-P", 1, 0, false);
    //declareFunction(myName, "janus_failure_analysis", "JANUS-FAILURE-ANALYSIS", 1, 0, false);
    //declareFunction(myName, "janus_newly_failing_op_failure_reasons", "JANUS-NEWLY-FAILING-OP-FAILURE-REASONS", 2, 0, false);
    //declareFunction(myName, "janus_categorize_failing_asserts", "JANUS-CATEGORIZE-FAILING-ASSERTS", 1, 0, false);
    //declareFunction(myName, "janus_categorize_failing_assert", "JANUS-CATEGORIZE-FAILING-ASSERT", 1, 0, false);
    //declareFunction(myName, "janus_categorize_failing_assert_int", "JANUS-CATEGORIZE-FAILING-ASSERT-INT", 2, 0, false);
    //declareFunction(myName, "janus_valid_test_set_run", "JANUS-VALID-TEST-SET-RUN", 1, 0, false);
    //declareFunction(myName, "janus_valid_test_runP", "JANUS-VALID-TEST-RUN?", 1, 0, false);
    //declareFunction(myName, "janus_more_complete_test_runs", "JANUS-MORE-COMPLETE-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "janus_equally_complete_test_runs", "JANUS-EQUALLY-COMPLETE-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "janus_less_complete_test_runs", "JANUS-LESS-COMPLETE-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "janus_different_test_runs", "JANUS-DIFFERENT-TEST-RUNS", 1, 0, false);
    //declareFunction(myName, "janus_test_runs_with_assert_failure_status", "JANUS-TEST-RUNS-WITH-ASSERT-FAILURE-STATUS", 2, 0, false);
    //declareFunction(myName, "janus_test_runs_that_started_failing", "JANUS-TEST-RUNS-THAT-STARTED-FAILING", 2, 0, false);
    //declareFunction(myName, "janus_test_runs_that_started_succeeding", "JANUS-TEST-RUNS-THAT-STARTED-SUCCEEDING", 2, 0, false);
    //declareFunction(myName, "janus_test_runs_that_became_status", "JANUS-TEST-RUNS-THAT-BECAME-STATUS", 4, 0, false);
    //declareFunction(myName, "janus_operations_that_became_status", "JANUS-OPERATIONS-THAT-BECAME-STATUS", 3, 0, false);
    //declareFunction(myName, "janus_compare_test_set_run_statuses", "JANUS-COMPARE-TEST-SET-RUN-STATUSES", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_janus_file() {
    $janus_transcript_directory$ = deflexical("*JANUS-TRANSCRIPT-DIRECTORY*", $str9$_cyc_projects_inference_janus_tra);
    $janus_experiment_directory$ = deflexical("*JANUS-EXPERIMENT-DIRECTORY*", $str21$_cyc_projects_inference_janus_exp);
    return NIL;
  }

  public static final SubLObject setup_janus_file() {
    // CVS_ID("Id: janus.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.note_funcall_helper_function($sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$JANUS_OP = makeKeyword("JANUS-OP");
  public static final SubLSymbol $kw1$CREATE = makeKeyword("CREATE");
  public static final SubLSymbol $kw2$ASSERT = makeKeyword("ASSERT");
  public static final SubLSymbol $kw3$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $sym4$JANUS_CREATE_OPERATION_P = makeSymbol("JANUS-CREATE-OPERATION-P");
  public static final SubLSymbol $sym5$JANUS_ASSERT_OPERATION_P = makeSymbol("JANUS-ASSERT-OPERATION-P");
  public static final SubLSymbol $sym6$JANUS_QUERY_OPERATION_P = makeSymbol("JANUS-QUERY-OPERATION-P");
  public static final SubLSymbol $kw7$CONST = makeKeyword("CONST");
  public static final SubLSymbol $sym8$ASSERTION_IST_FORMULA = makeSymbol("ASSERTION-IST-FORMULA");
  public static final SubLString $str9$_cyc_projects_inference_janus_tra = makeString("/cyc/projects/inference/janus/transcripts/");
  public static final SubLSymbol $sym10$FILE_VALID_FOR_WRITING_P = makeSymbol("FILE-VALID-FOR-WRITING-P");
  public static final SubLString $str11$_s_appears_more_than_once__in_pos = makeString("~s appears more than once, in positions ~s.");
  public static final SubLSymbol $sym12$INVALID_CONSTANT_ = makeSymbol("INVALID-CONSTANT?");
  public static final SubLSymbol $kw13$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym14$INVALID_ASSERTION_ = makeSymbol("INVALID-ASSERTION?");
  public static final SubLString $str15$invalid_term_in_assert_op___s__s_ = makeString("invalid term in assert op: ~s ~s ~s");
  public static final SubLString $str16$invalid_constant_in_query_op___s_ = makeString("invalid constant in query op: ~s ~s");
  public static final SubLSymbol $kw17$PROBLEM_STORE = makeKeyword("PROBLEM-STORE");
  public static final SubLString $str18$ignoring_problem_store_reuse_for_ = makeString("ignoring problem store reuse for query ~s ~s ~s");
  public static final SubLString $str19$NEW_CONTINUABLE_INFERENCE___s__s_ = makeString("NEW-CONTINUABLE-INFERENCE: ~s ~s ~s~%");
  public static final SubLSymbol $kw20$DEDUCTION = makeKeyword("DEDUCTION");
  public static final SubLString $str21$_cyc_projects_inference_janus_exp = makeString("/cyc/projects/inference/janus/experiments/");
  public static final SubLList $list22 = list(new SubLObject[] {makeSymbol("&KEY"), makeSymbol("TRANSCRIPT-FILENAME"), makeSymbol("EXPERIMENT-FILENAME"), makeSymbol("COMMENT"), makeSymbol("OVERRIDING-QUERY-PROPERTIES"), list(makeSymbol("METRICS"), list(makeSymbol("QUOTE"), list(makeSymbol("ALL-QUERY-METRICS")))), list(makeSymbol("OUTLIER-TIMEOUT"), list(makeSymbol("QUOTE"), makeSymbol("*ARETE-OUTLIER-TIMEOUT*"))), list(makeSymbol("SKIP"), ZERO_INTEGER), makeSymbol("COUNT")});
  public static final SubLList $list23 = list(makeKeyword("TRANSCRIPT-FILENAME"), makeKeyword("EXPERIMENT-FILENAME"), makeKeyword("COMMENT"), makeKeyword("OVERRIDING-QUERY-PROPERTIES"), makeKeyword("METRICS"), makeKeyword("OUTLIER-TIMEOUT"), makeKeyword("SKIP"), makeKeyword("COUNT"));
  public static final SubLSymbol $kw24$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw25$TRANSCRIPT_FILENAME = makeKeyword("TRANSCRIPT-FILENAME");
  public static final SubLSymbol $kw26$EXPERIMENT_FILENAME = makeKeyword("EXPERIMENT-FILENAME");
  public static final SubLSymbol $kw27$COMMENT = makeKeyword("COMMENT");
  public static final SubLSymbol $kw28$OVERRIDING_QUERY_PROPERTIES = makeKeyword("OVERRIDING-QUERY-PROPERTIES");
  public static final SubLSymbol $kw29$METRICS = makeKeyword("METRICS");
  public static final SubLList $list30 = list(makeSymbol("ALL-QUERY-METRICS"));
  public static final SubLSymbol $kw31$OUTLIER_TIMEOUT = makeKeyword("OUTLIER-TIMEOUT");
  public static final SubLSymbol $sym32$_ARETE_OUTLIER_TIMEOUT_ = makeSymbol("*ARETE-OUTLIER-TIMEOUT*");
  public static final SubLSymbol $kw33$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $kw34$COUNT = makeKeyword("COUNT");
  public static final SubLSymbol $sym35$RUN_KCT_EXPERIMENT = makeSymbol("RUN-KCT-EXPERIMENT");
  public static final SubLSymbol $kw36$TEST_SPEC_SET = makeKeyword("TEST-SPEC-SET");
  public static final SubLSymbol $sym37$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $kw38$FILENAME = makeKeyword("FILENAME");
  public static final SubLSymbol $kw39$INCREMENTAL = makeKeyword("INCREMENTAL");
  public static final SubLSymbol $kw40$OVERRIDING_METRICS = makeKeyword("OVERRIDING-METRICS");
  public static final SubLInteger $int41$600 = makeInteger(600);
  public static final SubLString $str42$Execution_of_Janus_operation__s_f = makeString("Execution of Janus operation ~s failed.");
  public static final SubLString $str43$unknown_modification_operation_ty = makeString("unknown modification operation type ~s");
  public static final SubLSymbol $kw44$NOT_A_QUERY = makeKeyword("NOT-A-QUERY");
  public static final SubLSymbol $kw45$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw46$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLList $list47 = list(new SubLObject[] {makeSymbol("JANUS-OP"), makeSymbol("TYPE"), makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"), makeSymbol("DIRECTION"), makeSymbol("EXPECTED-DEDUCE-SPECS"), makeSymbol("ALLOWED-RULES"), makeSymbol("TAG")});
  public static final SubLObject $const48$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $kw49$NAT = makeKeyword("NAT");
  public static final SubLString $str50$Janus_operation_of_unexpected_typ = makeString("Janus operation of unexpected type ~s");
  public static final SubLSymbol $sym51$LISTP = makeSymbol("LISTP");
  public static final SubLString $str52$_s_____s__ = makeString("~s != ~s~%");
  public static final SubLSymbol $kw53$MORE_COMPLETE = makeKeyword("MORE-COMPLETE");
  public static final SubLSymbol $kw54$EQUALLY_COMPLETE = makeKeyword("EQUALLY-COMPLETE");
  public static final SubLSymbol $kw55$LESS_COMPLETE = makeKeyword("LESS-COMPLETE");
  public static final SubLSymbol $kw56$DIFFERENT = makeKeyword("DIFFERENT");
  public static final SubLSymbol $kw57$TEST = makeKeyword("TEST");
  public static final SubLSymbol $sym58$JANUS_CATEGORIZE_FAILING_ASSERT_INT = makeSymbol("JANUS-CATEGORIZE-FAILING-ASSERT-INT");
  public static final SubLString $str59$filtered_to_exclude_invalid_forts = makeString("filtered to exclude invalid forts");
  public static final SubLSymbol $sym60$JANUS_VALID_TEST_RUN_ = makeSymbol("JANUS-VALID-TEST-RUN?");
  public static final SubLSymbol $sym61$INVALID_INDEXED_TERM_ = makeSymbol("INVALID-INDEXED-TERM?");
  public static final SubLSymbol $kw62$FAILURE = makeKeyword("FAILURE");
  public static final SubLSymbol $kw63$BECAME_FAILURE = makeKeyword("BECAME-FAILURE");
  public static final SubLSymbol $kw64$BECAME_SUCCESS = makeKeyword("BECAME-SUCCESS");
  public static final SubLSymbol $kw65$CHANGE = makeKeyword("CHANGE");

  //// Initializers

  public void declareFunctions() {
    declare_janus_file();
  }

  public void initializeVariables() {
    init_janus_file();
  }

  public void runTopLevelForms() {
    setup_janus_file();
  }

}
