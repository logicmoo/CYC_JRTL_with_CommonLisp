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

package com.cyc.cycjava_1.cycl.inference.harness;
 import com.cyc.cycjava.cycl.*;
 import com.cyc.cycjava.cycl.cyc_testing.*;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;

import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.*;
import com.cyc.cycjava.cycl.inference.*;
 import com.cyc.cycjava.cycl.inference.harness.*;
 import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.inference.modules.removal.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.*;



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


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.inference.harness.balancing_tactician;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.cyc_testing;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_analysis;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_inference;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_link;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_proof;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_strategy;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_tactic;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_metrics;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_join_ordered;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_transformation;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;

public  final class inference_datastructures_problem_store extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_problem_store() {}
  public static final SubLFile me = new inference_datastructures_problem_store();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_store";

  //// Definitions

  /** Whether the problem store and related datastructures are permitted to be created, destroyed, or modified.
   This is set to T in the main entry point to inference but NIL in the inference browser.
   Currently this only controls modifications that could conceivably happen via the browser, like lazy
   manifestation of non-focals. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 931)
  public static SubLSymbol $problem_store_modification_permittedP$ = null;

  /** The global index of all problem stores : id -> problem-store */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1401)
  private static SubLSymbol $problem_store_id_index$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1597)
  public static final SubLObject new_problem_store_id() {
    return id_index.id_index_reserve($problem_store_id_index$.getGlobalValue());
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1691)
  public static final SubLObject index_problem_store_by_id(SubLObject store, SubLObject suid) {
    return id_index.id_index_enter($problem_store_id_index$.getGlobalValue(), suid, store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 1809)
  public static final SubLObject unindex_problem_store_by_id(SubLObject store) {
    {
      SubLObject suid = problem_store_suid(store);
      return id_index.id_index_remove($problem_store_id_index$.getGlobalValue(), suid);
    }
  }

  /** Return a list of all problem stores. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2843)
  public static final SubLObject all_problem_stores() {
    return id_index.id_index_values($problem_store_id_index$.getGlobalValue());
  }

  /** Destroy all current problem stores; @return integer, the number of stores successfully destroyed. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 2977)
  public static final SubLObject destroy_all_problem_stores() {
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = all_problem_stores();
      SubLObject store = NIL;
      for (store = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), store = cdolist_list_var.first()) {
        {
          SubLObject ignore_errors_tag = NIL;
          try {
            {
              SubLObject _prev_bind_0 = Dynamic.currentBinding(Errors.$error_handler$);
              try {
                Dynamic.bind(Errors.$error_handler$, Symbols.symbol_function($sym12$IGNORE_ERRORS_HANDLER));
                try {
                  destroy_problem_store(store);
                  count = Numbers.add(count, ONE_INTEGER);
                } catch (Throwable catch_var) {
                  Errors.handleThrowable(catch_var, NIL);
                }
              } finally {
                Dynamic.rebind(Errors.$error_handler$, _prev_bind_0);
              }
            }
          } catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $kw11$IGNORE_ERRORS_TARGET);
          }
        }
      }
      return count;
    }
  }

  public static final class $problem_store_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $guid; }
    @Override
    public SubLObject getField3() { return $suid; }
    @Override
    public SubLObject getField4() { return $lock; }
    @Override
    public SubLObject getField5() { return $creation_time; }
    @Override
    public SubLObject getField6() { return $inference_id_index; }
    @Override
    public SubLObject getField7() { return $strategy_id_index; }
    @Override
    public SubLObject getField8() { return $problem_id_index; }
    @Override
    public SubLObject getField9() { return $link_id_index; }
    @Override
    public SubLObject getField10() { return $proof_id_index; }
    @Override
    public SubLObject getField11() { return $problem_by_query_index; }
    @Override
    public SubLObject getField12() { return $rejected_proofs; }
    @Override
    public SubLObject getField13() { return $processed_proofs; }
    @Override
    public SubLObject getField14() { return $non_explanatory_subproofs_possibleP; }
    @Override
    public SubLObject getField15() { return $non_explanatory_subproofs_index; }
    @Override
    public SubLObject getField16() { return $most_recent_tactic_executed; }
    @Override
    public SubLObject getField17() { return $min_proof_depth_index; }
    @Override
    public SubLObject getField18() { return $min_transformation_depth_index; }
    @Override
    public SubLObject getField19() { return $min_transformation_depth_signature_index; }
    @Override
    public SubLObject getField20() { return $min_depth_index; }
    public SubLObject getField21() { return $equality_reasoning_method; }
    public SubLObject getField22() { return $equality_reasoning_domain; }
    public SubLObject getField23() { return $intermediate_step_validation_level; }
    public SubLObject getField24() { return $max_problem_count; }
    public SubLObject getField25() { return $crazy_max_problem_count; }
    public SubLObject getField26() { return $removal_allowedP; }
    public SubLObject getField27() { return $transformation_allowedP; }
    public SubLObject getField28() { return $add_restriction_layer_of_indirectionP; }
    public SubLObject getField29() { return $negation_by_failureP; }
    public SubLObject getField30() { return $completeness_minimization_allowedP; }
    public SubLObject getField31() { return $direction; }
    public SubLObject getField32() { return $evaluate_subl_allowedP; }
    public SubLObject getField33() { return $rewrite_allowedP; }
    public SubLObject getField34() { return $abduction_allowedP; }
    public SubLObject getField35() { return $new_terms_allowedP; }
    public SubLObject getField36() { return $compute_answer_justificationsP; }
    public SubLObject getField37() { return $memoization_state; }
    public SubLObject getField38() { return $sbhl_resource_space; }
    public SubLObject getField39() { return $preparedP; }
    public SubLObject getField40() { return $destruction_imminentP; }
    public SubLObject getField41() { return $meta_problem_store; }
    public SubLObject getField42() { return $static_properties; }
    public SubLObject getField43() { return $janitor; }
    public SubLObject getField44() { return $historical_root_problems; }
    public SubLObject getField45() { return $complex_problem_query_czer_index; }
    public SubLObject getField46() { return $complex_problem_query_signatures; }
    public SubLObject getField47() { return $proof_keeping_index; }
    @Override
    public SubLObject setField2(SubLObject value) { return $guid = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $suid = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $lock = value; }
    @Override
    public SubLObject setField5(SubLObject value) { return $creation_time = value; }
    @Override
    public SubLObject setField6(SubLObject value) { return $inference_id_index = value; }
    @Override
    public SubLObject setField7(SubLObject value) { return $strategy_id_index = value; }
    @Override
    public SubLObject setField8(SubLObject value) { return $problem_id_index = value; }
    @Override
    public SubLObject setField9(SubLObject value) { return $link_id_index = value; }
    @Override
    public SubLObject setField10(SubLObject value) { return $proof_id_index = value; }
    @Override
    public SubLObject setField11(SubLObject value) { return $problem_by_query_index = value; }
    @Override
    public SubLObject setField12(SubLObject value) { return $rejected_proofs = value; }
    @Override
    public SubLObject setField13(SubLObject value) { return $processed_proofs = value; }
    @Override
    public SubLObject setField14(SubLObject value) { return $non_explanatory_subproofs_possibleP = value; }
    @Override
    public SubLObject setField15(SubLObject value) { return $non_explanatory_subproofs_index = value; }
    @Override
    public SubLObject setField16(SubLObject value) { return $most_recent_tactic_executed = value; }
    @Override
    public SubLObject setField17(SubLObject value) { return $min_proof_depth_index = value; }
    @Override
    public SubLObject setField18(SubLObject value) { return $min_transformation_depth_index = value; }
    @Override
    public SubLObject setField19(SubLObject value) { return $min_transformation_depth_signature_index = value; }
    @Override
    public SubLObject setField20(SubLObject value) { return $min_depth_index = value; }
    public SubLObject setField21(SubLObject value) { return $equality_reasoning_method = value; }
    public SubLObject setField22(SubLObject value) { return $equality_reasoning_domain = value; }
    public SubLObject setField23(SubLObject value) { return $intermediate_step_validation_level = value; }
    public SubLObject setField24(SubLObject value) { return $max_problem_count = value; }
    public SubLObject setField25(SubLObject value) { return $crazy_max_problem_count = value; }
    public SubLObject setField26(SubLObject value) { return $removal_allowedP = value; }
    public SubLObject setField27(SubLObject value) { return $transformation_allowedP = value; }
    public SubLObject setField28(SubLObject value) { return $add_restriction_layer_of_indirectionP = value; }
    public SubLObject setField29(SubLObject value) { return $negation_by_failureP = value; }
    public SubLObject setField30(SubLObject value) { return $completeness_minimization_allowedP = value; }
    public SubLObject setField31(SubLObject value) { return $direction = value; }
    public SubLObject setField32(SubLObject value) { return $evaluate_subl_allowedP = value; }
    public SubLObject setField33(SubLObject value) { return $rewrite_allowedP = value; }
    public SubLObject setField34(SubLObject value) { return $abduction_allowedP = value; }
    public SubLObject setField35(SubLObject value) { return $new_terms_allowedP = value; }
    public SubLObject setField36(SubLObject value) { return $compute_answer_justificationsP = value; }
    public SubLObject setField37(SubLObject value) { return $memoization_state = value; }
    public SubLObject setField38(SubLObject value) { return $sbhl_resource_space = value; }
    public SubLObject setField39(SubLObject value) { return $preparedP = value; }
    public SubLObject setField40(SubLObject value) { return $destruction_imminentP = value; }
    public SubLObject setField41(SubLObject value) { return $meta_problem_store = value; }
    public SubLObject setField42(SubLObject value) { return $static_properties = value; }
    public SubLObject setField43(SubLObject value) { return $janitor = value; }
    public SubLObject setField44(SubLObject value) { return $historical_root_problems = value; }
    public SubLObject setField45(SubLObject value) { return $complex_problem_query_czer_index = value; }
    public SubLObject setField46(SubLObject value) { return $complex_problem_query_signatures = value; }
    public SubLObject setField47(SubLObject value) { return $proof_keeping_index = value; }
    public SubLObject $guid = NIL;
    public SubLObject $suid = NIL;
    public SubLObject $lock = NIL;
    public SubLObject $creation_time = NIL;
    public SubLObject $inference_id_index = NIL;
    public SubLObject $strategy_id_index = NIL;
    public SubLObject $problem_id_index = NIL;
    public SubLObject $link_id_index = NIL;
    public SubLObject $proof_id_index = NIL;
    public SubLObject $problem_by_query_index = NIL;
    public SubLObject $rejected_proofs = NIL;
    public SubLObject $processed_proofs = NIL;
    public SubLObject $non_explanatory_subproofs_possibleP = NIL;
    public SubLObject $non_explanatory_subproofs_index = NIL;
    public SubLObject $most_recent_tactic_executed = NIL;
    public SubLObject $min_proof_depth_index = NIL;
    public SubLObject $min_transformation_depth_index = NIL;
    public SubLObject $min_transformation_depth_signature_index = NIL;
    public SubLObject $min_depth_index = NIL;
    public SubLObject $equality_reasoning_method = NIL;
    public SubLObject $equality_reasoning_domain = NIL;
    public SubLObject $intermediate_step_validation_level = NIL;
    public SubLObject $max_problem_count = NIL;
    public SubLObject $crazy_max_problem_count = NIL;
    public SubLObject $removal_allowedP = NIL;
    public SubLObject $transformation_allowedP = NIL;
    public SubLObject $add_restriction_layer_of_indirectionP = NIL;
    public SubLObject $negation_by_failureP = NIL;
    public SubLObject $completeness_minimization_allowedP = NIL;
    public SubLObject $direction = NIL;
    public SubLObject $evaluate_subl_allowedP = NIL;
    public SubLObject $rewrite_allowedP = NIL;
    public SubLObject $abduction_allowedP = NIL;
    public SubLObject $new_terms_allowedP = NIL;
    public SubLObject $compute_answer_justificationsP = NIL;
    public SubLObject $memoization_state = NIL;
    public SubLObject $sbhl_resource_space = NIL;
    public SubLObject $preparedP = NIL;
    public SubLObject $destruction_imminentP = NIL;
    public SubLObject $meta_problem_store = NIL;
    public SubLObject $static_properties = NIL;
    public SubLObject $janitor = NIL;
    public SubLObject $historical_root_problems = NIL;
    public SubLObject $complex_problem_query_czer_index = NIL;
    public SubLObject $complex_problem_query_signatures = NIL;
    public SubLObject $proof_keeping_index = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($problem_store_native.class, $sym13$PROBLEM_STORE, $sym14$PROBLEM_STORE_P, $list15, $list16, new String[] {"$guid", "$suid", "$lock", "$creation_time", "$inference_id_index", "$strategy_id_index", "$problem_id_index", "$link_id_index", "$proof_id_index", "$problem_by_query_index", "$rejected_proofs", "$processed_proofs", "$non_explanatory_subproofs_possibleP", "$non_explanatory_subproofs_index", "$most_recent_tactic_executed", "$min_proof_depth_index", "$min_transformation_depth_index", "$min_transformation_depth_signature_index", "$min_depth_index", "$equality_reasoning_method", "$equality_reasoning_domain", "$intermediate_step_validation_level", "$max_problem_count", "$crazy_max_problem_count", "$removal_allowedP", "$transformation_allowedP", "$add_restriction_layer_of_indirectionP", "$negation_by_failureP", "$completeness_minimization_allowedP", "$direction", "$evaluate_subl_allowedP", "$rewrite_allowedP", "$abduction_allowedP", "$new_terms_allowedP", "$compute_answer_justificationsP", "$memoization_state", "$sbhl_resource_space", "$preparedP", "$destruction_imminentP", "$meta_problem_store", "$static_properties", "$janitor", "$historical_root_problems", "$complex_problem_query_czer_index", "$complex_problem_query_signatures", "$proof_keeping_index"}, $list17, $list18, $sym19$PRINT_PROBLEM_STORE);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static SubLSymbol $dtp_problem_store$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject problem_store_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33122");
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject problem_store_p(SubLObject object) {
    return ((object.getClass() == $problem_store_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $problem_store_p$UnaryFunction extends UnaryFunction {
    public $problem_store_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-STORE-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return problem_store_p(arg1); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_suid(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_lock(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_inference_id_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_strategy_id_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField7();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_problem_id_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField8();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_link_id_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField9();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_proof_id_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField10();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_problem_by_query_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField11();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_rejected_proofs(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField12();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_processed_proofs(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField13();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_non_explanatory_subproofs_possibleP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField14();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_non_explanatory_subproofs_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField15();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_min_proof_depth_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField17();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_min_transformation_depth_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField18();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_min_transformation_depth_signature_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField19();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_min_depth_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.getField20();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_equality_reasoning_method(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$equality_reasoning_method;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_equality_reasoning_domain(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$equality_reasoning_domain;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_intermediate_step_validation_level(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$intermediate_step_validation_level;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_max_problem_count(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$max_problem_count;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_removal_allowedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$removal_allowedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_transformation_allowedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$transformation_allowedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_add_restriction_layer_of_indirectionP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$add_restriction_layer_of_indirectionP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_negation_by_failureP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$negation_by_failureP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_direction(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$direction;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_rewrite_allowedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$rewrite_allowedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_abduction_allowedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$abduction_allowedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_new_terms_allowedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$new_terms_allowedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_compute_answer_justificationsP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$compute_answer_justificationsP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_memoization_state(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$memoization_state;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_sbhl_resource_space(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$sbhl_resource_space;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_preparedP(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$preparedP;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_meta_problem_store(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$meta_problem_store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_janitor(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$janitor;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_historical_root_problems(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$historical_root_problems;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_complex_problem_query_czer_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$complex_problem_query_czer_index;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_complex_problem_query_signatures(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$complex_problem_query_signatures;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject prob_store_proof_keeping_index(SubLObject object) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$proof_keeping_index;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_guid(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_suid(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_lock(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_creation_time(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_inference_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_strategy_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_problem_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_link_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_proof_id_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField10(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_problem_by_query_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField11(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_rejected_proofs(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField12(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_processed_proofs(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField13(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_non_explanatory_subproofs_possibleP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField14(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_non_explanatory_subproofs_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField15(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_most_recent_tactic_executed(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField16(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_min_proof_depth_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField17(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_min_transformation_depth_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField18(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_min_transformation_depth_signature_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField19(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_min_depth_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return object.setField20(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_equality_reasoning_method(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$equality_reasoning_method = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_equality_reasoning_domain(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$equality_reasoning_domain = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_intermediate_step_validation_level(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$intermediate_step_validation_level = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_max_problem_count(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$max_problem_count = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_crazy_max_problem_count(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$crazy_max_problem_count = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_removal_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$removal_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_transformation_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$transformation_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_add_restriction_layer_of_indirectionP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$add_restriction_layer_of_indirectionP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_negation_by_failureP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$negation_by_failureP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_completeness_minimization_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$completeness_minimization_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_direction(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$direction = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_evaluate_subl_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$evaluate_subl_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_rewrite_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$rewrite_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_abduction_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$abduction_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_new_terms_allowedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$new_terms_allowedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_compute_answer_justificationsP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$compute_answer_justificationsP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_memoization_state(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$memoization_state = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_sbhl_resource_space(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$sbhl_resource_space = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_preparedP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$preparedP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_destruction_imminentP(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$destruction_imminentP = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_meta_problem_store(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$meta_problem_store = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_static_properties(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$static_properties = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_janitor(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$janitor = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_historical_root_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$historical_root_problems = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_complex_problem_query_czer_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$complex_problem_query_czer_index = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_complex_problem_query_signatures(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$complex_problem_query_signatures = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject _csetf_prob_store_proof_keeping_index(SubLObject object, SubLObject value) {
    checkType(object, $sym14$PROBLEM_STORE_P);
    return (($problem_store_native) object).$proof_keeping_index = value;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 5056)
  public static final SubLObject make_problem_store(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $problem_store_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw140$GUID)) {
            _csetf_prob_store_guid(v_new, current_value);
          } else if (pcase_var.eql($kw141$SUID)) {
            _csetf_prob_store_suid(v_new, current_value);
          } else if (pcase_var.eql($kw142$LOCK)) {
            _csetf_prob_store_lock(v_new, current_value);
          } else if (pcase_var.eql($kw143$CREATION_TIME)) {
            _csetf_prob_store_creation_time(v_new, current_value);
          } else if (pcase_var.eql($kw144$INFERENCE_ID_INDEX)) {
            _csetf_prob_store_inference_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw145$STRATEGY_ID_INDEX)) {
            _csetf_prob_store_strategy_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw146$PROBLEM_ID_INDEX)) {
            _csetf_prob_store_problem_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw147$LINK_ID_INDEX)) {
            _csetf_prob_store_link_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw148$PROOF_ID_INDEX)) {
            _csetf_prob_store_proof_id_index(v_new, current_value);
          } else if (pcase_var.eql($kw149$PROBLEM_BY_QUERY_INDEX)) {
            _csetf_prob_store_problem_by_query_index(v_new, current_value);
          } else if (pcase_var.eql($kw150$REJECTED_PROOFS)) {
            _csetf_prob_store_rejected_proofs(v_new, current_value);
          } else if (pcase_var.eql($kw151$PROCESSED_PROOFS)) {
            _csetf_prob_store_processed_proofs(v_new, current_value);
          } else if (pcase_var.eql($kw152$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_)) {
            _csetf_prob_store_non_explanatory_subproofs_possibleP(v_new, current_value);
          } else if (pcase_var.eql($kw153$NON_EXPLANATORY_SUBPROOFS_INDEX)) {
            _csetf_prob_store_non_explanatory_subproofs_index(v_new, current_value);
          } else if (pcase_var.eql($kw154$MOST_RECENT_TACTIC_EXECUTED)) {
            _csetf_prob_store_most_recent_tactic_executed(v_new, current_value);
          } else if (pcase_var.eql($kw155$MIN_PROOF_DEPTH_INDEX)) {
            _csetf_prob_store_min_proof_depth_index(v_new, current_value);
          } else if (pcase_var.eql($kw156$MIN_TRANSFORMATION_DEPTH_INDEX)) {
            _csetf_prob_store_min_transformation_depth_index(v_new, current_value);
          } else if (pcase_var.eql($kw157$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX)) {
            _csetf_prob_store_min_transformation_depth_signature_index(v_new, current_value);
          } else if (pcase_var.eql($kw158$MIN_DEPTH_INDEX)) {
            _csetf_prob_store_min_depth_index(v_new, current_value);
          } else if (pcase_var.eql($kw159$EQUALITY_REASONING_METHOD)) {
            _csetf_prob_store_equality_reasoning_method(v_new, current_value);
          } else if (pcase_var.eql($kw160$EQUALITY_REASONING_DOMAIN)) {
            _csetf_prob_store_equality_reasoning_domain(v_new, current_value);
          } else if (pcase_var.eql($kw161$INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
            _csetf_prob_store_intermediate_step_validation_level(v_new, current_value);
          } else if (pcase_var.eql($kw162$MAX_PROBLEM_COUNT)) {
            _csetf_prob_store_max_problem_count(v_new, current_value);
          } else if (pcase_var.eql($kw163$CRAZY_MAX_PROBLEM_COUNT)) {
            _csetf_prob_store_crazy_max_problem_count(v_new, current_value);
          } else if (pcase_var.eql($kw164$REMOVAL_ALLOWED_)) {
            _csetf_prob_store_removal_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw165$TRANSFORMATION_ALLOWED_)) {
            _csetf_prob_store_transformation_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw166$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
            _csetf_prob_store_add_restriction_layer_of_indirectionP(v_new, current_value);
          } else if (pcase_var.eql($kw167$NEGATION_BY_FAILURE_)) {
            _csetf_prob_store_negation_by_failureP(v_new, current_value);
          } else if (pcase_var.eql($kw168$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
            _csetf_prob_store_completeness_minimization_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw169$DIRECTION)) {
            _csetf_prob_store_direction(v_new, current_value);
          } else if (pcase_var.eql($kw170$EVALUATE_SUBL_ALLOWED_)) {
            _csetf_prob_store_evaluate_subl_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw171$REWRITE_ALLOWED_)) {
            _csetf_prob_store_rewrite_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw172$ABDUCTION_ALLOWED_)) {
            _csetf_prob_store_abduction_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw173$NEW_TERMS_ALLOWED_)) {
            _csetf_prob_store_new_terms_allowedP(v_new, current_value);
          } else if (pcase_var.eql($kw174$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
            _csetf_prob_store_compute_answer_justificationsP(v_new, current_value);
          } else if (pcase_var.eql($kw175$MEMOIZATION_STATE)) {
            _csetf_prob_store_memoization_state(v_new, current_value);
          } else if (pcase_var.eql($kw176$SBHL_RESOURCE_SPACE)) {
            _csetf_prob_store_sbhl_resource_space(v_new, current_value);
          } else if (pcase_var.eql($kw177$PREPARED_)) {
            _csetf_prob_store_preparedP(v_new, current_value);
          } else if (pcase_var.eql($kw178$DESTRUCTION_IMMINENT_)) {
            _csetf_prob_store_destruction_imminentP(v_new, current_value);
          } else if (pcase_var.eql($kw179$META_PROBLEM_STORE)) {
            _csetf_prob_store_meta_problem_store(v_new, current_value);
          } else if (pcase_var.eql($kw180$STATIC_PROPERTIES)) {
            _csetf_prob_store_static_properties(v_new, current_value);
          } else if (pcase_var.eql($kw181$JANITOR)) {
            _csetf_prob_store_janitor(v_new, current_value);
          } else if (pcase_var.eql($kw182$HISTORICAL_ROOT_PROBLEMS)) {
            _csetf_prob_store_historical_root_problems(v_new, current_value);
          } else if (pcase_var.eql($kw183$COMPLEX_PROBLEM_QUERY_CZER_INDEX)) {
            _csetf_prob_store_complex_problem_query_czer_index(v_new, current_value);
          } else if (pcase_var.eql($kw184$COMPLEX_PROBLEM_QUERY_SIGNATURES)) {
            _csetf_prob_store_complex_problem_query_signatures(v_new, current_value);
          } else if (pcase_var.eql($kw185$PROOF_KEEPING_INDEX)) {
            _csetf_prob_store_proof_keeping_index(v_new, current_value);
          } else {
            Errors.error($str186$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 14279)
  public static final SubLObject valid_problem_store_p(SubLObject object) {
    return makeBoolean(((NIL != problem_store_p(object))
           && (NIL == problem_store_invalid_p(object))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 14536)
  public static final SubLObject problem_store_invalid_p(SubLObject store) {
    return Equality.eq($kw187$FREE, prob_store_equality_reasoning_domain(store));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 15029)
  public static final SubLObject sxhash_problem_store_method(SubLObject object) {
    return prob_store_suid(object);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 15304)
  public static final SubLObject problem_store_lock(SubLObject store) {
    return prob_store_lock(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 15675)
  public static final SubLObject problem_store_memoization_state(SubLObject store) {
    return prob_store_memoization_state(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16230)
  public static final SubLObject problem_store_sbhl_resource_space(SubLObject store) {
    return prob_store_sbhl_resource_space(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 16430)
  public static final SubLObject set_problem_store_sbhl_resource_space(SubLObject store, SubLObject space) {
    _csetf_prob_store_sbhl_resource_space(store, space);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17255)
  public static final SubLObject problem_store_inference_id_index(SubLObject store) {
    return prob_store_inference_id_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 17689)
  public static final SubLObject problem_store_strategy_id_index(SubLObject store) {
    return prob_store_strategy_id_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 18427)
  public static final SubLObject problem_store_problem_id_index(SubLObject store) {
    return prob_store_problem_id_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19032)
  public static final SubLObject problem_store_link_id_index(SubLObject store) {
    return prob_store_link_id_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 19654)
  public static final SubLObject problem_store_proof_id_index(SubLObject store) {
    return prob_store_proof_id_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20039)
  public static final SubLObject problem_store_historical_root_problems(SubLObject store) {
    return prob_store_historical_root_problems(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20556)
  private static SubLSymbol $default_problem_store_problem_size$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20642)
  private static SubLSymbol $default_problem_store_link_size$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20709)
  private static SubLSymbol $default_problem_store_inference_size$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20780)
  private static SubLSymbol $default_problem_store_strategy_size$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20890)
  private static SubLSymbol $default_problem_store_proof_size$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 20957)
  private static SubLSymbol $problem_store_sbhl_resource_space_number$ = null;

  /** Allocates a new problem-store object and sets up its internal datastructures. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 21085)
  public static final SubLObject new_problem_store(SubLObject problem_store_properties) {
    if ((problem_store_properties == UNPROVIDED)) {
      problem_store_properties = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(problem_store_properties, $sym247$PROBLEM_STORE_PROPERTIES_P);
      {
        SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
        checkType(name, $sym248$PROBLEM_STORE_NAME_P);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL != find_problem_store_by_name(name))) {
            Errors.error($str249$A_problem_store_named__s_already_, name);
          }
        }
      }
      {
        SubLObject store = make_problem_store(UNPROVIDED);
        SubLObject suid = new_problem_store_id();
        SubLObject guid = NIL;
        inference_metrics.increment_problem_store_historical_count();
        _csetf_prob_store_guid(store, guid);
        _csetf_prob_store_suid(store, suid);
        index_problem_store_by_id(store, suid);
        _csetf_prob_store_lock(store, Locks.make_lock($str250$Problem_Store_Lock));
        _csetf_prob_store_creation_time(store, Time.get_universal_time());
        _csetf_prob_store_preparedP(store, NIL);
        _csetf_prob_store_problem_id_index(store, id_index.new_id_index($default_problem_store_problem_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_inference_id_index(store, id_index.new_id_index($default_problem_store_inference_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_strategy_id_index(store, id_index.new_id_index($default_problem_store_strategy_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_link_id_index(store, id_index.new_id_index($default_problem_store_link_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_proof_id_index(store, id_index.new_id_index($default_problem_store_proof_size$.getGlobalValue(), ZERO_INTEGER));
        _csetf_prob_store_rejected_proofs(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_processed_proofs(store, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_non_explanatory_subproofs_possibleP(store, NIL);
        _csetf_prob_store_non_explanatory_subproofs_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_most_recent_tactic_executed(store, NIL);
        _csetf_prob_store_min_proof_depth_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_transformation_depth_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_transformation_depth_signature_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_min_depth_index(store, Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED));
        {
          SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
          set_problem_store_name(store, name);
          {
            SubLObject equality_reasoning_method = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_method(problem_store_properties);
            checkType(equality_reasoning_method, $sym251$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P);
            _csetf_prob_store_equality_reasoning_method(store, equality_reasoning_method);
          }
          {
            SubLObject equality_reasoning_domain = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_domain(problem_store_properties);
            checkType(equality_reasoning_domain, $sym252$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P);
            _csetf_prob_store_equality_reasoning_domain(store, equality_reasoning_domain);
            if (($kw253$NONE == equality_reasoning_domain)) {
              _csetf_prob_store_problem_by_query_index(store, $kw254$EMPTY_DOMAIN);
            } else {
              _csetf_prob_store_problem_by_query_index(store, Hashtables.make_hash_table($default_problem_store_problem_size$.getGlobalValue(), Symbols.symbol_function(EQUAL), UNPROVIDED));
            }
          }
          {
            SubLObject intermediate_step_validation_level = inference_datastructures_enumerated_types.problem_store_properties_intermediate_step_validation_level(problem_store_properties);
            checkType(intermediate_step_validation_level, $sym255$INTERMEDIATE_STEP_VALIDATION_LEVEL_P);
            _csetf_prob_store_intermediate_step_validation_level(store, intermediate_step_validation_level);
          }
          {
            SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count(problem_store_properties);
            checkType(max_problem_count, $sym256$MAX_PROBLEM_COUNT_P);
            _csetf_prob_store_max_problem_count(store, max_problem_count);
            {
              SubLObject crazy_max_problem_count = compute_crazy_max_problem_count(max_problem_count);
              checkType(crazy_max_problem_count, $sym256$MAX_PROBLEM_COUNT_P);
              _csetf_prob_store_crazy_max_problem_count(store, crazy_max_problem_count);
            }
          }
          {
            SubLObject removal_allowedP = inference_datastructures_enumerated_types.removal_allowed_by_propertiesP(problem_store_properties);
            checkType(removal_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_removal_allowedP(store, removal_allowedP);
          }
          {
            SubLObject transformation_allowedP = inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(problem_store_properties);
            checkType(transformation_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_transformation_allowedP(store, transformation_allowedP);
          }
          {
            SubLObject add_restriction_layer_of_indirectionP = inference_datastructures_enumerated_types.problem_store_properties_add_restriction_layer_of_indirectionP(problem_store_properties);
            checkType(add_restriction_layer_of_indirectionP, $sym257$BOOLEANP);
            _csetf_prob_store_add_restriction_layer_of_indirectionP(store, add_restriction_layer_of_indirectionP);
          }
          {
            SubLObject negation_by_failureP = inference_datastructures_enumerated_types.problem_store_properties_negation_by_failureP(problem_store_properties);
            checkType(negation_by_failureP, $sym257$BOOLEANP);
            _csetf_prob_store_negation_by_failureP(store, negation_by_failureP);
          }
          {
            SubLObject completeness_minimization_allowedP = inference_datastructures_enumerated_types.problem_store_properties_completeness_minimization_allowedP(problem_store_properties);
            checkType(completeness_minimization_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_completeness_minimization_allowedP(store, completeness_minimization_allowedP);
          }
          {
            SubLObject direction = inference_datastructures_enumerated_types.problem_store_properties_direction(problem_store_properties);
            checkType(direction, $sym258$INFERENCE_DIRECTION_P);
            _csetf_prob_store_direction(store, direction);
          }
          {
            SubLObject evaluate_subl_allowedP = inference_datastructures_enumerated_types.problem_store_properties_evaluate_subl_allowedP(problem_store_properties);
            checkType(evaluate_subl_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_evaluate_subl_allowedP(store, evaluate_subl_allowedP);
          }
          {
            SubLObject rewrite_allowedP = inference_datastructures_enumerated_types.problem_store_properties_rewrite_allowedP(problem_store_properties);
            checkType(rewrite_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_rewrite_allowedP(store, rewrite_allowedP);
          }
          {
            SubLObject abduction_allowedP = inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(problem_store_properties);
            checkType(abduction_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_abduction_allowedP(store, abduction_allowedP);
          }
          {
            SubLObject new_terms_allowedP = inference_datastructures_enumerated_types.problem_store_properties_new_terms_allowedP(problem_store_properties);
            checkType(new_terms_allowedP, $sym257$BOOLEANP);
            _csetf_prob_store_new_terms_allowedP(store, new_terms_allowedP);
          }
          {
            SubLObject compute_answer_justificationsP = inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(problem_store_properties);
            checkType(compute_answer_justificationsP, $sym257$BOOLEANP);
            _csetf_prob_store_compute_answer_justificationsP(store, compute_answer_justificationsP);
          }
        }
        _csetf_prob_store_memoization_state(store, memoization_state.new_memoization_state($str259$problem_store_memoization_state, ReadWriteLocks.new_rw_lock($str260$problem_store_memoization_lock), UNPROVIDED, UNPROVIDED));
        set_problem_store_sbhl_resource_space(store, sbhl_marking_vars.new_sbhl_marking_space_resource($problem_store_sbhl_resource_space_number$.getGlobalValue()));
        _csetf_prob_store_destruction_imminentP(store, NIL);
        _csetf_prob_store_meta_problem_store(store, NIL);
        _csetf_prob_store_static_properties(store, conses_high.copy_list(problem_store_properties));
        _csetf_prob_store_janitor(store, new_problem_store_janitor(store));
        _csetf_prob_store_historical_root_problems(store, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_complex_problem_query_czer_index(store, dictionary.new_dictionary(Symbols.symbol_function(EQUAL), UNPROVIDED));
        _csetf_prob_store_complex_problem_query_signatures(store, dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED));
        _csetf_prob_store_proof_keeping_index(store, Hashtables.make_hash_table(ZERO_INTEGER, Symbols.symbol_function(EQ), UNPROVIDED));
        return store;
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 28802)
  public static final SubLObject destroy_problem_store(SubLObject store) {
    if ((NIL != valid_problem_store_p(store))) {
      try {
        destroy_problem_store_int(store);
      } finally {
        {
          SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
          try {
            Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
            unindex_problem_store_by_id(store);
            _csetf_prob_store_lock(store, $kw187$FREE);
          } finally {
            Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 29107)
  public static final SubLObject destroy_problem_store_int(SubLObject store) {
    inference_metrics.update_maximum_problem_store_historical_problem_count(store);
    note_problem_store_invalid(store);
    {
      SubLObject meta_problem_store = prob_store_meta_problem_store(store);
      if ((NIL != problem_store_p(meta_problem_store))) {
        destroy_problem_store(meta_problem_store);
      }
      _csetf_prob_store_meta_problem_store(store, $kw187$FREE);
    }
    destroy_problem_store_janitor(prob_store_janitor(store));
    _csetf_prob_store_janitor(store, $kw187$FREE);
    free_problem_store_name(store);
    _csetf_prob_store_equality_reasoning_method(store, $kw187$FREE);
    _csetf_prob_store_intermediate_step_validation_level(store, $kw187$FREE);
    _csetf_prob_store_max_problem_count(store, $kw187$FREE);
    _csetf_prob_store_crazy_max_problem_count(store, $kw187$FREE);
    _csetf_prob_store_removal_allowedP(store, $kw187$FREE);
    _csetf_prob_store_transformation_allowedP(store, $kw187$FREE);
    _csetf_prob_store_add_restriction_layer_of_indirectionP(store, $kw187$FREE);
    _csetf_prob_store_negation_by_failureP(store, $kw187$FREE);
    _csetf_prob_store_completeness_minimization_allowedP(store, $kw187$FREE);
    _csetf_prob_store_direction(store, $kw187$FREE);
    _csetf_prob_store_evaluate_subl_allowedP(store, $kw187$FREE);
    _csetf_prob_store_rewrite_allowedP(store, $kw187$FREE);
    _csetf_prob_store_abduction_allowedP(store, $kw187$FREE);
    _csetf_prob_store_new_terms_allowedP(store, $kw187$FREE);
    _csetf_prob_store_compute_answer_justificationsP(store, $kw187$FREE);
    _csetf_prob_store_preparedP(store, $kw187$FREE);
    _csetf_prob_store_destruction_imminentP(store, $kw187$FREE);
    _csetf_prob_store_static_properties(store, $kw187$FREE);
    clear_problem_store_proof_keeping_problems(store);
    _csetf_prob_store_proof_keeping_index(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_complex_problem_query_signatures(store));
    _csetf_prob_store_complex_problem_query_signatures(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_complex_problem_query_czer_index(store));
    _csetf_prob_store_complex_problem_query_czer_index(store, $kw187$FREE);
    set.clear_set(prob_store_historical_root_problems(store));
    _csetf_prob_store_historical_root_problems(store, $kw187$FREE);
    _csetf_prob_store_sbhl_resource_space(store, $kw187$FREE);
    memoization_state.clear_all_memoization(problem_store_memoization_state(store));
    _csetf_prob_store_memoization_state(store, $kw187$FREE);
    Hashtables.clrhash(prob_store_min_depth_index(store));
    _csetf_prob_store_min_depth_index(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_min_transformation_depth_index(store));
    _csetf_prob_store_min_transformation_depth_index(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_min_transformation_depth_signature_index(store));
    _csetf_prob_store_min_transformation_depth_signature_index(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_min_proof_depth_index(store));
    _csetf_prob_store_min_proof_depth_index(store, $kw187$FREE);
    if (prob_store_problem_by_query_index(store).isHashtable()) {
      Hashtables.clrhash(prob_store_problem_by_query_index(store));
    }
    _csetf_prob_store_problem_by_query_index(store, $kw187$FREE);
    {
      SubLObject idx = problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_10 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_10, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_10);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw261$SKIP;
                    }
                    inference_datastructures_inference.destroy_problem_store_inference(inference);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_11 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_11))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_11);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    inference_datastructures_inference.destroy_problem_store_inference(inference);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      id_index.clear_id_index(prob_store_inference_id_index(store));
      _csetf_prob_store_inference_id_index(store, $kw187$FREE);
    }
    {
      SubLObject idx = problem_store_strategy_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_12 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_12, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_12);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject strategy = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(strategy))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(strategy))) {
                      strategy = $kw261$SKIP;
                    }
                    inference_datastructures_strategy.destroy_problem_store_strategy(strategy);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_13 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_13))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_13);
              SubLObject id = NIL;
              SubLObject strategy = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    strategy = Hashtables.getEntryValue(cdohash_entry);
                    inference_datastructures_strategy.destroy_problem_store_strategy(strategy);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      id_index.clear_id_index(prob_store_strategy_id_index(store));
      _csetf_prob_store_strategy_id_index(store, $kw187$FREE);
    }
    dictionary.clear_dictionary(prob_store_rejected_proofs(store));
    _csetf_prob_store_rejected_proofs(store, $kw187$FREE);
    set.clear_set(prob_store_processed_proofs(store));
    _csetf_prob_store_processed_proofs(store, $kw187$FREE);
    _csetf_prob_store_non_explanatory_subproofs_possibleP(store, $kw187$FREE);
    dictionary.clear_dictionary(prob_store_non_explanatory_subproofs_index(store));
    _csetf_prob_store_non_explanatory_subproofs_index(store, $kw187$FREE);
    _csetf_prob_store_most_recent_tactic_executed(store, $kw187$FREE);
    {
      SubLObject idx = problem_store_proof_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_14 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_14, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_14);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject proof = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(proof))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(proof))) {
                      proof = $kw261$SKIP;
                    }
                    inference_datastructures_proof.destroy_problem_store_proof(proof);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_15 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_15))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_15);
              SubLObject id = NIL;
              SubLObject proof = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    proof = Hashtables.getEntryValue(cdohash_entry);
                    inference_datastructures_proof.destroy_problem_store_proof(proof);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      id_index.clear_id_index(prob_store_proof_id_index(store));
      _csetf_prob_store_proof_id_index(store, $kw187$FREE);
    }
    {
      SubLObject idx = problem_store_link_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_16 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_16, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_16);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject link = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(link))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(link))) {
                      link = $kw261$SKIP;
                    }
                    inference_datastructures_problem_link.destroy_problem_store_link(link);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_17 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_17))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_17);
              SubLObject id = NIL;
              SubLObject link = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    link = Hashtables.getEntryValue(cdohash_entry);
                    inference_datastructures_problem_link.destroy_problem_store_link(link);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      id_index.clear_id_index(prob_store_link_id_index(store));
      _csetf_prob_store_link_id_index(store, $kw187$FREE);
    }
    {
      SubLObject idx = problem_store_problem_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_18 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_18, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_18);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject problem = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(problem))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(problem))) {
                      problem = $kw261$SKIP;
                    }
                    inference_datastructures_problem.destroy_problem_store_problem(problem);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_19 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_19))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_19);
              SubLObject id = NIL;
              SubLObject problem = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    problem = Hashtables.getEntryValue(cdohash_entry);
                    inference_datastructures_problem.destroy_problem_store_problem(problem);
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
      id_index.clear_id_index(prob_store_problem_id_index(store));
      _csetf_prob_store_problem_id_index(store, $kw187$FREE);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 34314)
  public static final SubLObject note_problem_store_invalid(SubLObject store) {
    _csetf_prob_store_equality_reasoning_domain(store, $kw187$FREE);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 34760)
  public static final SubLObject problem_store_suid(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_suid(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 35010)
  public static final SubLObject problem_store_rejected_proofs(SubLObject store) {
    return prob_store_rejected_proofs(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 35214)
  public static final SubLObject problem_store_non_explanatory_subproofs_possibleP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_non_explanatory_subproofs_possibleP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 35687)
  public static final SubLObject problem_store_min_proof_depth_index(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_min_proof_depth_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 35837)
  public static final SubLObject problem_store_min_transformation_depth_index(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_min_transformation_depth_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36005)
  public static final SubLObject problem_store_min_transformation_depth_signature_index(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_min_transformation_depth_signature_index(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36331)
  public static final SubLObject problem_store_equality_reasoning_method(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_equality_reasoning_method(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36489)
  public static final SubLObject problem_store_equality_reasoning_domain(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_equality_reasoning_domain(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36647)
  public static final SubLObject problem_store_intermediate_step_validation_level(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_intermediate_step_validation_level(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 36823)
  public static final SubLObject problem_store_max_problem_count(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_max_problem_count(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37119)
  public static final SubLObject problem_store_removal_allowedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_removal_allowedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37259)
  public static final SubLObject problem_store_transformation_allowedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_transformation_allowedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37413)
  public static final SubLObject problem_store_add_restriction_layer_of_indirectionP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_add_restriction_layer_of_indirectionP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37595)
  public static final SubLObject problem_store_negation_by_failureP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_negation_by_failureP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 37919)
  public static final SubLObject problem_store_direction(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_direction(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38197)
  public static final SubLObject problem_store_rewrite_allowedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_rewrite_allowedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38337)
  public static final SubLObject problem_store_abduction_allowedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_abduction_allowedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38478)
  public static final SubLObject problem_store_new_terms_allowedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_new_terms_allowedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38619)
  public static final SubLObject problem_store_compute_answer_justificationsP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    if ((NIL != cyc_testing.testing_real_time_pruningP())) {
      return NIL;
    } else {
      return prob_store_compute_answer_justificationsP(store);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 38843)
  public static final SubLObject problem_store_preparedP(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    return prob_store_preparedP(store);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 39729)
  public static final SubLObject note_problem_store_most_recent_tactic_executed(SubLObject store, SubLObject tactic) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    checkType(tactic, $sym262$TACTIC_P);
    _csetf_prob_store_most_recent_tactic_executed(store, tactic);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40669)
  public static final SubLObject set_problem_store_add_restriction_layer_of_indirectionP(SubLObject store, SubLObject value) {
    checkType(store, $sym263$NEW_PROBLEM_STORE_P);
    checkType(value, $sym257$BOOLEANP);
    _csetf_prob_store_add_restriction_layer_of_indirectionP(store, value);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 40917)
  public static final SubLObject set_problem_store_transformation_allowedP(SubLObject store, SubLObject value) {
    checkType(store, $sym263$NEW_PROBLEM_STORE_P);
    checkType(value, $sym257$BOOLEANP);
    _csetf_prob_store_transformation_allowedP(store, value);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41553)
  public static final SubLObject note_problem_store_prepared(SubLObject store) {
    checkType(store, $sym263$NEW_PROBLEM_STORE_P);
    _csetf_prob_store_preparedP(store, T);
    return store;
  }

  /** @note the actual destruction must still be done by the caller. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 41705)
  public static final SubLObject note_problem_store_destruction_imminent(SubLObject store) {
    checkType(store, $sym263$NEW_PROBLEM_STORE_P);
    _csetf_prob_store_destruction_imminentP(store, T);
    return store;
  }

  /** Return T iff STORE has a direction of :FORWARD. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42184)
  public static final SubLObject problem_store_forwardP(SubLObject store) {
    return Equality.eq($kw264$FORWARD, problem_store_direction(store));
  }

  /** @return booleanp; whether STORE is newly created and not yet finalized.
   @see finalize-problem-store-properties */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42355)
  public static final SubLObject problem_store_newP(SubLObject store) {
    return makeBoolean((NIL == problem_store_preparedP(store)));
  }

  /** Return the number of inferences that are currently in STORE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42687)
  public static final SubLObject problem_store_inference_count(SubLObject store) {
    return id_index.id_index_count(prob_store_inference_id_index(store));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 42873)
  public static final SubLObject problem_store_has_only_one_inferenceP(SubLObject store) {
    return Numbers.numE(ONE_INTEGER, problem_store_inference_count(store));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 43605)
  public static final SubLObject first_problem_store_inference(SubLObject store) {
    {
      SubLObject idx = problem_store_inference_id_index(store);
      if ((NIL == id_index.id_index_objects_empty_p(idx, $kw261$SKIP))) {
        {
          SubLObject idx_20 = idx;
          if ((NIL == id_index.id_index_old_objects_empty_p(idx_20, $kw261$SKIP))) {
            {
              SubLObject vector_var = id_index.id_index_old_objects(idx_20);
              SubLObject backwardP_var = NIL;
              SubLObject length = Sequences.length(vector_var);
              SubLObject v_iteration = NIL;
              for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, ONE_INTEGER)) {
                {
                  SubLObject id = ((NIL != backwardP_var) ? ((SubLObject) Numbers.subtract(length, v_iteration, ONE_INTEGER)) : v_iteration);
                  SubLObject inference = Vectors.aref(vector_var, id);
                  if ((!(((NIL != id_index.id_index_tombstone_p(inference))
                         && (NIL != id_index.id_index_skip_tombstones_p($kw261$SKIP)))))) {
                    if ((NIL != id_index.id_index_tombstone_p(inference))) {
                      inference = $kw261$SKIP;
                    }
                    return inference;
                  }
                }
              }
            }
          }
        }
        {
          SubLObject idx_21 = idx;
          if ((NIL == id_index.id_index_new_objects_empty_p(idx_21))) {
            {
              SubLObject cdohash_table = id_index.id_index_new_objects(idx_21);
              SubLObject id = NIL;
              SubLObject inference = NIL;
              {
                final Iterator cdohash_iterator = Hashtables.getEntrySetIterator(cdohash_table);
                try {
                  while (Hashtables.iteratorHasNext(cdohash_iterator)) {
                    final Entry cdohash_entry = Hashtables.iteratorNextEntry(cdohash_iterator);
                    id = Hashtables.getEntryKey(cdohash_entry);
                    inference = Hashtables.getEntryValue(cdohash_entry);
                    return inference;
                  }
                } finally {
                  Hashtables.releaseEntrySetIterator(cdohash_iterator);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 44476)
  public static final SubLObject problem_store_privateP(SubLObject store) {
    {
      SubLObject inference = first_problem_store_inference(store);
      if ((NIL != inference)) {
        return inference_datastructures_inference.inference_problem_store_privateP(inference);
      }
    }
    return NIL;
  }

  /** Return the number of problems that are currently in STORE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49478)
  public static final SubLObject problem_store_problem_count(SubLObject store) {
    return id_index.id_index_count(prob_store_problem_id_index(store));
  }

  /** Return the number of problems that have ever existed in STORE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49658)
  public static final SubLObject problem_store_historical_problem_count(SubLObject store) {
    return id_index.id_index_next_id(prob_store_problem_id_index(store));
  }

  /** Given MAX-PROBLEM-COUNT which is the amount of problems above which
the problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT
which is the amount of problems above which the problem store will error
without even trying to prune. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 49992)
  public static final SubLObject compute_crazy_max_problem_count(SubLObject max_problem_count) {
    return number_utilities.potentially_infinite_number_max(number_utilities.potentially_infinite_number_plus(max_problem_count, $int279$212), number_utilities.potentially_infinite_number_times(max_problem_count, TWO_INTEGER));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50584)
  public static final SubLObject problem_store_max_problem_count_reachedP(SubLObject store) {
    {
      SubLObject max_problem_count = problem_store_max_problem_count(store);
      return makeBoolean(((NIL == number_utilities.positive_infinity_p(max_problem_count))
             && problem_store_problem_count(store).numGE(max_problem_count)));
    }
  }

  /** If the problem store fills up with this many times more than the max problem count,
   halt with a :max-proof-count halt reason. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 50860)
  private static SubLSymbol $max_proof_count_multiplier$ = null;

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 51046)
  public static final SubLObject problem_store_max_proof_count_reachedP(SubLObject store) {
    {
      SubLObject max_problem_count = problem_store_max_problem_count(store);
      SubLObject max_proof_count = number_utilities.potentially_infinite_number_times(max_problem_count, $max_proof_count_multiplier$.getGlobalValue());
      return makeBoolean(((NIL == number_utilities.positive_infinity_p(max_proof_count))
             && problem_store_proof_count(store).numGE(max_proof_count)));
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52037)
  public static final SubLObject problem_store_allows_proof_processingP(SubLObject store) {
    return makeBoolean(((NIL != problem_store_privateP(store))
           && (NIL == problem_store_compute_answer_justificationsP(store))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 52589)
  public static final SubLObject find_problem_by_query(SubLObject store, SubLObject query) {
    {
      SubLObject domain = problem_store_equality_reasoning_domain(store);
      if ((NIL != inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, domain))) {
        return Hashtables.gethash_without_values(query, prob_store_problem_by_query_index(store), UNPROVIDED);
      }
    }
    return NIL;
  }

  /** Return the number of proofs that are currently in STORE. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 72959)
  public static final SubLObject problem_store_proof_count(SubLObject store) {
    return id_index.id_index_count(prob_store_proof_id_index(store));
  }

  /** @return non-negative-integer-p; the number of currently existing problems in STORE
   that have ever been the root problem of some inference. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 79014)
  public static final SubLObject problem_store_historical_root_problem_count(SubLObject store) {
    return set.set_size(prob_store_historical_root_problems(store));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 80533)
  public static final SubLObject clear_problem_store_proof_keeping_problems(SubLObject store) {
    Hashtables.clrhash(prob_store_proof_keeping_index(store));
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83103)
  public static final SubLObject problem_store_new_inference_id(SubLObject store) {
    {
      SubLObject v_id_index = problem_store_inference_id_index(store);
      SubLObject suid = NIL;
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        suid = id_index.id_index_reserve(v_id_index);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return suid;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83385)
  public static final SubLObject problem_store_new_strategy_id(SubLObject store) {
    {
      SubLObject v_id_index = problem_store_strategy_id_index(store);
      SubLObject suid = NIL;
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        suid = id_index.id_index_reserve(v_id_index);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return suid;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83615)
  public static final SubLObject problem_store_new_problem_id(SubLObject store) {
    {
      SubLObject v_id_index = problem_store_problem_id_index(store);
      SubLObject suid = NIL;
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        suid = id_index.id_index_reserve(v_id_index);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return suid;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 83843)
  public static final SubLObject problem_store_new_link_id(SubLObject store) {
    {
      SubLObject v_id_index = problem_store_link_id_index(store);
      SubLObject suid = NIL;
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        suid = id_index.id_index_reserve(v_id_index);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return suid;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84065)
  public static final SubLObject problem_store_new_proof_id(SubLObject store) {
    {
      SubLObject v_id_index = problem_store_proof_id_index(store);
      SubLObject suid = NIL;
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        suid = id_index.id_index_reserve(v_id_index);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
      return suid;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84289)
  public static final SubLObject add_problem_store_inference(SubLObject store, SubLObject inference) {
    {
      SubLObject id = inference_datastructures_inference.inference_suid(inference);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter_unlocked_autoextend(prob_store_inference_id_index(store), id, inference);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 84548)
  public static final SubLObject remove_problem_store_inference(SubLObject store, SubLObject inference) {
    {
      SubLObject id = inference_datastructures_inference.inference_suid(inference);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_remove(prob_store_inference_id_index(store), id);
        problem_store_min_proof_depth_index_remove_inference(store, inference);
        problem_store_min_transformation_depth_index_remove_inference(store, inference);
        problem_store_min_transformation_depth_signature_index_remove_inference(store, inference);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85039)
  public static final SubLObject add_problem_store_strategy(SubLObject store, SubLObject strategy) {
    {
      SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter_unlocked_autoextend(prob_store_strategy_id_index(store), id, strategy);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85292)
  public static final SubLObject remove_problem_store_strategy(SubLObject store, SubLObject strategy) {
    {
      SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_remove(prob_store_strategy_id_index(store), id);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85519)
  public static final SubLObject add_problem_store_problem_by_id(SubLObject store, SubLObject problem) {
    {
      SubLObject id = inference_datastructures_problem.problem_suid(problem);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter_unlocked_autoextend(prob_store_problem_id_index(store), id, problem);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 85996)
  public static final SubLObject add_problem_store_problem_by_query(SubLObject store, SubLObject problem) {
    if ((NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem))) {
      {
        SubLObject query = inference_datastructures_problem.problem_query(problem);
        SubLObject lock = problem_store_lock(store);
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          Hashtables.sethash(query, prob_store_problem_by_query_index(store), problem);
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86583)
  public static final SubLObject add_problem_store_link(SubLObject store, SubLObject link) {
    {
      SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter_unlocked_autoextend(prob_store_link_id_index(store), id, link);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 86820)
  public static final SubLObject remove_problem_store_link(SubLObject store, SubLObject link) {
    {
      SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_remove(prob_store_link_id_index(store), id);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 87035)
  public static final SubLObject add_problem_store_proof(SubLObject store, SubLObject proof) {
    {
      SubLObject id = inference_datastructures_proof.proof_suid(proof);
      SubLObject lock = problem_store_lock(store);
      SubLObject release = NIL;
      try {
        release = Locks.seize_lock(lock);
        id_index.id_index_enter_unlocked_autoextend(prob_store_proof_id_index(store), id, proof);
      } finally {
        if ((NIL != release)) {
          Locks.release_lock(lock);
        }
      }
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89296)
  public static final SubLObject problem_store_min_proof_depth_index_remove_inference(SubLObject store, SubLObject inference) {
    {
      SubLObject index = problem_store_min_proof_depth_index(store);
      dictionary.dictionary_remove(index, inference);
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89504)
  public static final SubLObject problem_store_min_transformation_depth_index_remove_inference(SubLObject store, SubLObject inference) {
    {
      SubLObject index = problem_store_min_transformation_depth_index(store);
      dictionary.dictionary_remove(index, inference);
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89728)
  public static final SubLObject problem_store_min_transformation_depth_signature_index_remove_inference(SubLObject store, SubLObject inference) {
    {
      SubLObject index = problem_store_min_transformation_depth_signature_index(store);
      dictionary.dictionary_remove(index, inference);
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 89974)
  public static final SubLObject add_problem_store_historical_root_problem(SubLObject store, SubLObject problem) {
    return set.set_add(problem, prob_store_historical_root_problems(store));
  }

  /** Call this after STORE is done being constructed.
   Sets all STORE's static properties to be no longer modifiable. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 90306)
  public static final SubLObject finalize_problem_store_properties(SubLObject store) {
    if ((NIL == problem_store_preparedP(store))) {
      note_problem_store_prepared(store);
    }
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 91522)
  public static final SubLObject add_problem_store_problem(SubLObject store, SubLObject problem) {
    add_problem_store_problem_by_id(store, problem);
    add_problem_store_problem_by_query(store, problem);
    return store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92193)
  public static final SubLObject problem_store_note_transformation_rule_considered(SubLObject store, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject local_state = problem_store_memoization_state(store);
        {
          SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
          try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            {
              SubLObject original_memoization_process = NIL;
              if (((NIL != local_state)
                   && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                {
                  SubLObject current_proc = Threads.current_process();
                  if ((NIL == original_memoization_process)) {
                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                  } else {
                    if ((original_memoization_process != current_proc)) {
                      Errors.error($str295$Invalid_attempt_to_reuse_memoizat);
                    }
                  }
                }
              }
              try {
                ensure_transformation_rule_considered_noted(rule);
              } finally {
                {
                  SubLObject _prev_bind_0_200 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                  try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    if (((NIL != local_state)
                         && (NIL == original_memoization_process))) {
                      memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                    }
                  } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_200, thread);
                  }
                }
              }
            }
          } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92473)
  public static final SubLObject problem_store_note_transformation_rule_success(SubLObject store, SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject local_state = problem_store_memoization_state(store);
        {
          SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
          try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            {
              SubLObject original_memoization_process = NIL;
              if (((NIL != local_state)
                   && (NIL == memoization_state.memoization_state_lock(local_state)))) {
                original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                {
                  SubLObject current_proc = Threads.current_process();
                  if ((NIL == original_memoization_process)) {
                    memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                  } else {
                    if ((original_memoization_process != current_proc)) {
                      Errors.error($str295$Invalid_attempt_to_reuse_memoizat);
                    }
                  }
                }
              }
              try {
                ensure_transformation_rule_success_noted(rule);
              } finally {
                {
                  SubLObject _prev_bind_0_201 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                  try {
                    Threads.$is_thread_performing_cleanupP$.bind(T, thread);
                    if (((NIL != local_state)
                         && (NIL == original_memoization_process))) {
                      memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                    }
                  } finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_201, thread);
                  }
                }
              }
            }
          } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92822)
  public static final SubLObject ensure_transformation_rule_considered_noted_internal(SubLObject rule) {
    if ((NIL != assertions_high.rule_assertionP(rule))) {
      inference_analysis.increment_transformation_rule_considered_count(rule, T, UNPROVIDED);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 92822)
  public static final SubLObject ensure_transformation_rule_considered_noted(SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return ensure_transformation_rule_considered_noted_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym296$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym296$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym296$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw297$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw297$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(ensure_transformation_rule_considered_noted_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93173)
  public static final SubLObject ensure_transformation_rule_success_noted_internal(SubLObject rule) {
    if ((NIL != assertions_high.rule_assertionP(rule))) {
      inference_analysis.increment_transformation_rule_success_count(rule, T, UNPROVIDED);
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93173)
  public static final SubLObject ensure_transformation_rule_success_noted(SubLObject rule) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if ((NIL == v_memoization_state)) {
          return ensure_transformation_rule_success_noted_internal(rule);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym298$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, UNPROVIDED);
        if ((NIL == caching_state)) {
          caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym298$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
          memoization_state.memoization_state_put(v_memoization_state, $sym298$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, caching_state);
        }
        {
          SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw297$_MEMOIZED_ITEM_NOT_FOUND_);
          if ((results == $kw297$_MEMOIZED_ITEM_NOT_FOUND_)) {
            results = Values.arg2(thread.resetMultipleValues(), Values.multiple_value_list(ensure_transformation_rule_success_noted_internal(rule)));
            memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
          }
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  public static final class $problem_store_janitor_native extends SubLStructNative {
    @Override
    public SubLStructDecl getStructDecl() { return structDecl; }
    @Override
    public SubLObject getField2() { return $store; }
    @Override
    public SubLObject getField3() { return $indestructible_problems; }
    @Override
    public SubLObject getField4() { return $staleP; }
    @Override
    public SubLObject setField2(SubLObject value) { return $store = value; }
    @Override
    public SubLObject setField3(SubLObject value) { return $indestructible_problems = value; }
    @Override
    public SubLObject setField4(SubLObject value) { return $staleP = value; }
    public SubLObject $store = NIL;
    public SubLObject $indestructible_problems = NIL;
    public SubLObject $staleP = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($problem_store_janitor_native.class, $sym299$PROBLEM_STORE_JANITOR, $sym300$PROBLEM_STORE_JANITOR_P, $list301, $list302, new String[] {"$store", "$indestructible_problems", "$staleP"}, $list303, $list304, $sym305$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static SubLSymbol $dtp_problem_store_janitor$ = null;

  public static final class $problem_store_janitor_p$UnaryFunction extends UnaryFunction {
    public $problem_store_janitor_p$UnaryFunction() { super(extractFunctionNamed("PROBLEM-STORE-JANITOR-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 34995"); }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static final SubLObject prob_store_janitor_indestructible_problems(SubLObject object) {
    checkType(object, $sym300$PROBLEM_STORE_JANITOR_P);
    return object.getField3();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static final SubLObject _csetf_prob_store_janitor_store(SubLObject object, SubLObject value) {
    checkType(object, $sym300$PROBLEM_STORE_JANITOR_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static final SubLObject _csetf_prob_store_janitor_indestructible_problems(SubLObject object, SubLObject value) {
    checkType(object, $sym300$PROBLEM_STORE_JANITOR_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static final SubLObject _csetf_prob_store_janitor_staleP(SubLObject object, SubLObject value) {
    checkType(object, $sym300$PROBLEM_STORE_JANITOR_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 93759)
  public static final SubLObject make_problem_store_janitor(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $problem_store_janitor_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw313$STORE)) {
            _csetf_prob_store_janitor_store(v_new, current_value);
          } else if (pcase_var.eql($kw314$INDESTRUCTIBLE_PROBLEMS)) {
            _csetf_prob_store_janitor_indestructible_problems(v_new, current_value);
          } else if (pcase_var.eql($kw315$STALE_)) {
            _csetf_prob_store_janitor_staleP(v_new, current_value);
          } else {
            Errors.error($str186$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94639)
  public static final SubLObject new_problem_store_janitor(SubLObject store) {
    checkType(store, $sym14$PROBLEM_STORE_P);
    {
      SubLObject janitor = make_problem_store_janitor(UNPROVIDED);
      _csetf_prob_store_janitor_store(janitor, store);
      _csetf_prob_store_janitor_indestructible_problems(janitor, set.new_set(Symbols.symbol_function(EQ), UNPROVIDED));
      problem_store_janitor_note_stale(janitor);
      return janitor;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 94995)
  public static final SubLObject destroy_problem_store_janitor(SubLObject janitor) {
    set.clear_set(prob_store_janitor_indestructible_problems(janitor));
    _csetf_prob_store_janitor_indestructible_problems(janitor, $kw187$FREE);
    _csetf_prob_store_janitor_store(janitor, $kw187$FREE);
    problem_store_janitor_note_stale(janitor);
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 96737)
  public static final SubLObject problem_store_janitor_note_stale(SubLObject janitor) {
    _csetf_prob_store_janitor_staleP(janitor, T);
    return janitor;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97665)
  private static SubLSymbol $problem_store_id_to_name_table$ = null;

  /** Returns an object which is the unique name of PROBLEM-STORE.
   This object can be of any type, but names are assumed unique wrt the #'equal test. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 97812)
  public static final SubLObject problem_store_name(SubLObject problem_store) {
    checkType(problem_store, $sym14$PROBLEM_STORE_P);
    {
      SubLObject id = problem_store_suid(problem_store);
      return Hashtables.gethash_without_values(id, $problem_store_id_to_name_table$.getGlobalValue(), UNPROVIDED);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98182)
  private static SubLSymbol $problem_store_name_to_id_table$ = null;

  /** @return nil or problem-store-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 98264)
  public static final SubLObject find_problem_store_by_name(SubLObject name) {
    checkType(name, $sym248$PROBLEM_STORE_NAME_P);
    if ((NIL != name)) {
      {
        SubLObject id = Hashtables.gethash_without_values(name, $problem_store_name_to_id_table$.getGlobalValue(), UNPROVIDED);
        if ((NIL != id)) {
          return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 33112");
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100047)
  public static final SubLObject set_problem_store_name(SubLObject problem_store, SubLObject name) {
    if ((NIL != name)) {
      {
        SubLObject id = problem_store_suid(problem_store);
        Hashtables.sethash(id, $problem_store_id_to_name_table$.getGlobalValue(), name);
        Hashtables.sethash(name, $problem_store_name_to_id_table$.getGlobalValue(), id);
      }
    }
    return problem_store;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-store.lisp", position = 100344)
  public static final SubLObject free_problem_store_name(SubLObject problem_store) {
    {
      SubLObject id = problem_store_suid(problem_store);
      SubLObject name = problem_store_name(problem_store);
      Hashtables.remhash(id, $problem_store_id_to_name_table$.getGlobalValue());
      Hashtables.remhash(name, $problem_store_name_to_id_table$.getGlobalValue());
    }
    return NIL;
  }

  public static final SubLObject declare_inference_datastructures_problem_store_file() {
    declareFunction(myName, "new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false);
    declareFunction(myName, "index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false);
    declareFunction(myName, "unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false);
    declareFunction(myName, "find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
    declareFunction(myName, "problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false);
    declareFunction(myName, "problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false);
    declareFunction(myName, "most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false);
    declareMacro(myName, "do_all_problem_stores", "DO-ALL-PROBLEM-STORES");
    declareFunction(myName, "problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false);
    declareFunction(myName, "all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false);
    declareFunction(myName, "destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
    declareFunction(myName, "problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "problem_store_p", "PROBLEM-STORE-P", 1, 0, false); new $problem_store_p$UnaryFunction();
    declareFunction(myName, "prob_store_guid", "PROB-STORE-GUID", 1, 0, false);
    declareFunction(myName, "prob_store_suid", "PROB-STORE-SUID", 1, 0, false);
    declareFunction(myName, "prob_store_lock", "PROB-STORE-LOCK", 1, 0, false);
    declareFunction(myName, "prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_problem_by_query_index", "PROB-STORE-PROBLEM-BY-QUERY-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false);
    declareFunction(myName, "prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false);
    declareFunction(myName, "prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
    declareFunction(myName, "prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
    declareFunction(myName, "prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
    declareFunction(myName, "prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
    declareFunction(myName, "prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
    declareFunction(myName, "prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
    declareFunction(myName, "prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false);
    declareFunction(myName, "prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
    declareFunction(myName, "prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
    declareFunction(myName, "prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false);
    declareFunction(myName, "prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
    declareFunction(myName, "prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false);
    declareFunction(myName, "prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
    declareFunction(myName, "prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false);
    declareFunction(myName, "prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
    declareFunction(myName, "prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false);
    declareFunction(myName, "prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false);
    declareFunction(myName, "prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false);
    declareFunction(myName, "_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_problem_by_query_index", "_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false);
    declareFunction(myName, "make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false);
    declareFunction(myName, "valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false);
    declareFunction(myName, "id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false);
    declareFunction(myName, "problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false);
    declareFunction(myName, "print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false);
    declareFunction(myName, "sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false);
    declareMacro(myName, "with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD");
    declareFunction(myName, "problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false);
    declareMacro(myName, "with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE");
    declareFunction(myName, "problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false);
    declareMacro(myName, "with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
    declareFunction(myName, "problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
    declareFunction(myName, "set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
    declareMacro(myName, "with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION");
    declareMacro(myName, "do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES");
    declareFunction(myName, "problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false);
    declareMacro(myName, "do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES");
    declareFunction(myName, "problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false);
    declareMacro(myName, "do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS");
    declareMacro(myName, "do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS");
    declareFunction(myName, "problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false);
    declareMacro(myName, "do_problem_store_links", "DO-PROBLEM-STORE-LINKS");
    declareFunction(myName, "problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false);
    declareMacro(myName, "do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS");
    declareFunction(myName, "problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false);
    declareMacro(myName, "do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
    declareFunction(myName, "problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
    declareMacro(myName, "do_inference_strategies", "DO-INFERENCE-STRATEGIES");
    declareFunction(myName, "new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false);
    declareFunction(myName, "destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false);
    declareFunction(myName, "note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false);
    declareFunction(myName, "problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false);
    declareFunction(myName, "problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false);
    declareFunction(myName, "problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false);
    declareFunction(myName, "problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
    declareFunction(myName, "problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
    declareFunction(myName, "problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
    declareFunction(myName, "problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
    declareFunction(myName, "problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
    declareFunction(myName, "problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
    declareFunction(myName, "problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
    declareFunction(myName, "problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false);
    declareFunction(myName, "problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
    declareFunction(myName, "problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
    declareFunction(myName, "problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false);
    declareFunction(myName, "problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
    declareFunction(myName, "problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false);
    declareFunction(myName, "problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
    declareFunction(myName, "problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false);
    declareFunction(myName, "note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
    declareFunction(myName, "set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
    declareFunction(myName, "set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
    declareFunction(myName, "set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
    declareFunction(myName, "set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false);
    declareFunction(myName, "set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
    declareFunction(myName, "note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false);
    declareFunction(myName, "note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false);
    declareFunction(myName, "reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false);
    declareFunction(myName, "problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false);
    declareFunction(myName, "problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false);
    declareFunction(myName, "new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false);
    declareFunction(myName, "problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false);
    //declareFunction(myName, "problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false);
    declareFunction(myName, "find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false);
    declareFunction(myName, "find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false);
    declareFunction(myName, "first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false);
    declareFunction(myName, "earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
    declareFunction(myName, "latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
    declareFunction(myName, "problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false);
    declareFunction(myName, "problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
    //declareFunction(myName, "problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false);
    declareFunction(myName, "find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false);
    declareFunction(myName, "find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false);
    declareFunction(myName, "first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false);
    declareFunction(myName, "problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false);
    declareFunction(myName, "problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false);
    declareFunction(myName, "problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false);
    ////declareFunction(myName, "problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false);
    declareFunction(myName, "find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false);
    declareFunction(myName, "problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
    declareFunction(myName, "problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false);
    declareFunction(myName, "problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false);
    declareFunction(myName, "compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false);
    declareFunction(myName, "problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
    declareFunction(myName, "problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false);
    declareFunction(myName, "find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false);
    declareFunction(myName, "find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false);
    declareFunction(myName, "find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 0, false);
    declareFunction(myName, "problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
    declareFunction(myName, "problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
    declareFunction(myName, "problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
    declareFunction(myName, "problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
    //declareFunction(myName, "problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false);
    declareFunction(myName, "find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false);
    declareFunction(myName, "problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false);
    declareFunction(myName, "problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false);
    declareFunction(myName, "problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false);
    declareFunction(myName, "problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
    declareFunction(myName, "problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false);
    //declareFunction(myName, "problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false);
    declareFunction(myName, "problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false);
    declareFunction(myName, "problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false);
    declareFunction(myName, "problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false);
    declareFunction(myName, "problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false);
    declareFunction(myName, "problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false);
    declareFunction(myName, "problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
    declareFunction(myName, "problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false);
    declareFunction(myName, "problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false);
    declareFunction(myName, "problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false);
    //declareFunction(myName, "problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false);
    declareFunction(myName, "problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false);
    declareFunction(myName, "problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false);
    declareFunction(myName, "problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 2, 0, false);
    declareFunction(myName, "clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
    declareFunction(myName, "problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false);
    declareFunction(myName, "proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false);
    declareFunction(myName, "non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false);
    declareFunction(myName, "unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false);
    declareFunction(myName, "note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false);
    declareFunction(myName, "note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false);
    declareFunction(myName, "problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false);
    declareFunction(myName, "problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false);
    declareFunction(myName, "problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false);
    declareFunction(myName, "problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false);
    declareFunction(myName, "problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false);
    declareFunction(myName, "problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false);
    declareFunction(myName, "problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false);
    declareFunction(myName, "problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false);
    declareFunction(myName, "add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false);
    declareFunction(myName, "remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false);
    declareFunction(myName, "add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false);
    declareFunction(myName, "remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false);
    declareFunction(myName, "add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
    declareFunction(myName, "remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
    declareFunction(myName, "add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
    declareFunction(myName, "remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
    declareFunction(myName, "add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false);
    declareFunction(myName, "remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false);
    declareFunction(myName, "add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false);
    declareFunction(myName, "remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false);
    declareFunction(myName, "problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false);
    declareFunction(myName, "problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false);
    declareFunction(myName, "problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false);
    declareFunction(myName, "problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false);
    declareFunction(myName, "problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false);
    declareFunction(myName, "proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false);
    declareFunction(myName, "reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
    declareFunction(myName, "problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
    declareFunction(myName, "problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
    declareFunction(myName, "problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false);
    declareFunction(myName, "add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
    declareFunction(myName, "remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
    declareFunction(myName, "finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
    declareFunction(myName, "add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
    declareFunction(myName, "remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
    declareFunction(myName, "add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false);
    declareFunction(myName, "remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
    declareFunction(myName, "remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false);
    declareFunction(myName, "problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false);
    declareFunction(myName, "problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false);
    declareFunction(myName, "ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false);
    declareFunction(myName, "ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false);
    declareFunction(myName, "ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false);
    declareFunction(myName, "ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false); new $problem_store_janitor_p$UnaryFunction();
    declareFunction(myName, "prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false);
    declareFunction(myName, "prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
    declareFunction(myName, "prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false);
    declareFunction(myName, "_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false);
    declareFunction(myName, "_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false);
    declareFunction(myName, "make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false);
    declareFunction(myName, "new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false);
    declareFunction(myName, "destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
    declareMacro(myName, "do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
    declareMacro(myName, "do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS");
    declareFunction(myName, "problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false);
    declareFunction(myName, "problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false);
    declareFunction(myName, "problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false);
    declareFunction(myName, "problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false);
    declareFunction(myName, "find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
    declareFunction(myName, "find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
    declareFunction(myName, "destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
    declareFunction(myName, "rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false);
    declareFunction(myName, "set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false);
    declareFunction(myName, "free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false);
    declareFunction(myName, "problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false);
    declareFunction(myName, "problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_problem_store_file() {
    $problem_store_modification_permittedP$ = defparameter("*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL);
    $problem_store_id_index$ = deflexical("*PROBLEM-STORE-ID-INDEX*", maybeDefault( $sym0$_PROBLEM_STORE_ID_INDEX_, $problem_store_id_index$, ()-> (id_index.new_id_index(UNPROVIDED, UNPROVIDED))));
    $dtp_problem_store$ = defconstant("*DTP-PROBLEM-STORE*", $sym13$PROBLEM_STORE);
    $default_problem_store_problem_size$ = deflexical("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int245$80);
    $default_problem_store_link_size$ = deflexical("*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int246$120);
    $default_problem_store_inference_size$ = deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER);
    $default_problem_store_strategy_size$ = deflexical("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue());
    $default_problem_store_proof_size$ = deflexical("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int39$40);
    $problem_store_sbhl_resource_space_number$ = deflexical("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER);
    $max_proof_count_multiplier$ = deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", FIVE_INTEGER);
    $dtp_problem_store_janitor$ = defconstant("*DTP-PROBLEM-STORE-JANITOR*", $sym299$PROBLEM_STORE_JANITOR);
    $problem_store_id_to_name_table$ = deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", maybeDefault( $sym322$_PROBLEM_STORE_ID_TO_NAME_TABLE_, $problem_store_id_to_name_table$, ()-> (Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQL), UNPROVIDED))));
    $problem_store_name_to_id_table$ = deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", maybeDefault( $sym323$_PROBLEM_STORE_NAME_TO_ID_TABLE_, $problem_store_name_to_id_table$, ()-> (Hashtables.make_hash_table(ONE_INTEGER, Symbols.symbol_function(EQUAL), UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_problem_store_file() {
    // CVS_ID("Id: inference-datastructures-problem-store.lisp 128760 2009-09-15 04:40:33Z pace ");
    subl_macro_promotions.declare_defglobal($sym0$_PROBLEM_STORE_ID_INDEX_);
    access_macros.register_macro_helper($sym9$PROBLEM_STORE_ID_INDEX, $sym10$DO_ALL_PROBLEM_STORES);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym47$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym48$PROB_STORE_GUID, $sym49$_CSETF_PROB_STORE_GUID);
    Structures.def_csetf($sym50$PROB_STORE_SUID, $sym51$_CSETF_PROB_STORE_SUID);
    Structures.def_csetf($sym52$PROB_STORE_LOCK, $sym53$_CSETF_PROB_STORE_LOCK);
    Structures.def_csetf($sym54$PROB_STORE_CREATION_TIME, $sym55$_CSETF_PROB_STORE_CREATION_TIME);
    Structures.def_csetf($sym56$PROB_STORE_INFERENCE_ID_INDEX, $sym57$_CSETF_PROB_STORE_INFERENCE_ID_INDEX);
    Structures.def_csetf($sym58$PROB_STORE_STRATEGY_ID_INDEX, $sym59$_CSETF_PROB_STORE_STRATEGY_ID_INDEX);
    Structures.def_csetf($sym60$PROB_STORE_PROBLEM_ID_INDEX, $sym61$_CSETF_PROB_STORE_PROBLEM_ID_INDEX);
    Structures.def_csetf($sym62$PROB_STORE_LINK_ID_INDEX, $sym63$_CSETF_PROB_STORE_LINK_ID_INDEX);
    Structures.def_csetf($sym64$PROB_STORE_PROOF_ID_INDEX, $sym65$_CSETF_PROB_STORE_PROOF_ID_INDEX);
    Structures.def_csetf($sym66$PROB_STORE_PROBLEM_BY_QUERY_INDEX, $sym67$_CSETF_PROB_STORE_PROBLEM_BY_QUERY_INDEX);
    Structures.def_csetf($sym68$PROB_STORE_REJECTED_PROOFS, $sym69$_CSETF_PROB_STORE_REJECTED_PROOFS);
    Structures.def_csetf($sym70$PROB_STORE_PROCESSED_PROOFS, $sym71$_CSETF_PROB_STORE_PROCESSED_PROOFS);
    Structures.def_csetf($sym72$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym73$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
    Structures.def_csetf($sym74$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, $sym75$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX);
    Structures.def_csetf($sym76$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, $sym77$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED);
    Structures.def_csetf($sym78$PROB_STORE_MIN_PROOF_DEPTH_INDEX, $sym79$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX);
    Structures.def_csetf($sym80$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, $sym81$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX);
    Structures.def_csetf($sym82$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, $sym83$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX);
    Structures.def_csetf($sym84$PROB_STORE_MIN_DEPTH_INDEX, $sym85$_CSETF_PROB_STORE_MIN_DEPTH_INDEX);
    Structures.def_csetf($sym86$PROB_STORE_EQUALITY_REASONING_METHOD, $sym87$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD);
    Structures.def_csetf($sym88$PROB_STORE_EQUALITY_REASONING_DOMAIN, $sym89$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN);
    Structures.def_csetf($sym90$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, $sym91$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL);
    Structures.def_csetf($sym92$PROB_STORE_MAX_PROBLEM_COUNT, $sym93$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT);
    Structures.def_csetf($sym94$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, $sym95$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT);
    Structures.def_csetf($sym96$PROB_STORE_REMOVAL_ALLOWED_, $sym97$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
    Structures.def_csetf($sym98$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym99$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
    Structures.def_csetf($sym100$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym101$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
    Structures.def_csetf($sym102$PROB_STORE_NEGATION_BY_FAILURE_, $sym103$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
    Structures.def_csetf($sym104$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym105$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
    Structures.def_csetf($sym106$PROB_STORE_DIRECTION, $sym107$_CSETF_PROB_STORE_DIRECTION);
    Structures.def_csetf($sym108$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym109$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
    Structures.def_csetf($sym110$PROB_STORE_REWRITE_ALLOWED_, $sym111$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
    Structures.def_csetf($sym112$PROB_STORE_ABDUCTION_ALLOWED_, $sym113$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
    Structures.def_csetf($sym114$PROB_STORE_NEW_TERMS_ALLOWED_, $sym115$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
    Structures.def_csetf($sym116$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym117$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
    Structures.def_csetf($sym118$PROB_STORE_MEMOIZATION_STATE, $sym119$_CSETF_PROB_STORE_MEMOIZATION_STATE);
    Structures.def_csetf($sym120$PROB_STORE_SBHL_RESOURCE_SPACE, $sym121$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE);
    Structures.def_csetf($sym122$PROB_STORE_PREPARED_, $sym123$_CSETF_PROB_STORE_PREPARED_);
    Structures.def_csetf($sym124$PROB_STORE_DESTRUCTION_IMMINENT_, $sym125$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
    Structures.def_csetf($sym126$PROB_STORE_META_PROBLEM_STORE, $sym127$_CSETF_PROB_STORE_META_PROBLEM_STORE);
    Structures.def_csetf($sym128$PROB_STORE_STATIC_PROPERTIES, $sym129$_CSETF_PROB_STORE_STATIC_PROPERTIES);
    Structures.def_csetf($sym130$PROB_STORE_JANITOR, $sym131$_CSETF_PROB_STORE_JANITOR);
    Structures.def_csetf($sym132$PROB_STORE_HISTORICAL_ROOT_PROBLEMS, $sym133$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS);
    Structures.def_csetf($sym134$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, $sym135$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX);
    Structures.def_csetf($sym136$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, $sym137$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES);
    Structures.def_csetf($sym138$PROB_STORE_PROOF_KEEPING_INDEX, $sym139$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX);
    Equality.identity($sym13$PROBLEM_STORE);
    Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), Symbols.symbol_function($sym190$SXHASH_PROBLEM_STORE_METHOD));
    access_macros.register_macro_helper($sym193$PROBLEM_STORE_LOCK, $sym194$WITH_PROBLEM_STORE_LOCK_HELD);
    access_macros.register_macro_helper($sym197$PROBLEM_STORE_MEMOIZATION_STATE, $sym198$WITH_PROBLEM_STORE_MEMOIZATION_STATE);
    access_macros.register_macro_helper($sym201$PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym204$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
    access_macros.register_macro_helper($sym203$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, $sym204$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
    access_macros.register_macro_helper($sym208$PROBLEM_STORE_INFERENCE_ID_INDEX, $sym209$DO_PROBLEM_STORE_INFERENCES);
    access_macros.register_macro_helper($sym212$PROBLEM_STORE_STRATEGY_ID_INDEX, $sym213$DO_PROBLEM_STORE_STRATEGIES);
    access_macros.register_macro_helper($sym221$PROBLEM_STORE_PROBLEM_ID_INDEX, $sym222$DO_PROBLEM_STORE_PROBLEMS);
    access_macros.register_macro_helper($sym227$PROBLEM_STORE_LINK_ID_INDEX, $sym228$DO_PROBLEM_STORE_LINKS);
    access_macros.register_macro_helper($sym235$PROBLEM_STORE_PROOF_ID_INDEX, $sym236$DO_PROBLEM_STORE_PROOFS);
    access_macros.register_macro_helper($sym240$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, $sym241$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS);
    memoization_state.note_memoized_function($sym296$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED);
    memoization_state.note_memoized_function($sym298$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), Symbols.symbol_function($sym306$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym307$PROB_STORE_JANITOR_STORE, $sym308$_CSETF_PROB_STORE_JANITOR_STORE);
    Structures.def_csetf($sym309$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym310$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
    Structures.def_csetf($sym311$PROB_STORE_JANITOR_STALE_, $sym312$_CSETF_PROB_STORE_JANITOR_STALE_);
    Equality.identity($sym299$PROBLEM_STORE_JANITOR);
    access_macros.register_macro_helper($sym316$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, $sym317$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
    subl_macro_promotions.declare_defglobal($sym322$_PROBLEM_STORE_ID_TO_NAME_TABLE_);
    subl_macro_promotions.declare_defglobal($sym323$_PROBLEM_STORE_NAME_TO_ID_TABLE_);
    access_macros.register_external_symbol($sym324$FIND_PROBLEM_STORE_BY_NAME);
    access_macros.register_external_symbol($sym325$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME);
    access_macros.register_external_symbol($sym327$DESTROY_PROBLEM_STORE_BY_NAME);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_PROBLEM_STORE_ID_INDEX_ = makeSymbol("*PROBLEM-STORE-ID-INDEX*");
  public static final SubLList $list1 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym6$DO_ID_INDEX = makeSymbol("DO-ID-INDEX");
  public static final SubLList $list7 = list(makeSymbol("PROBLEM-STORE-ID-INDEX"));
  public static final SubLSymbol $sym8$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym9$PROBLEM_STORE_ID_INDEX = makeSymbol("PROBLEM-STORE-ID-INDEX");
  public static final SubLSymbol $sym10$DO_ALL_PROBLEM_STORES = makeSymbol("DO-ALL-PROBLEM-STORES");
  public static final SubLSymbol $kw11$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym12$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLSymbol $sym13$PROBLEM_STORE = makeSymbol("PROBLEM-STORE");
  public static final SubLSymbol $sym14$PROBLEM_STORE_P = makeSymbol("PROBLEM-STORE-P");
  public static final SubLList $list15 = list(new SubLObject[] {makeSymbol("GUID"), makeSymbol("SUID"), makeSymbol("LOCK"), makeSymbol("CREATION-TIME"), makeSymbol("INFERENCE-ID-INDEX"), makeSymbol("STRATEGY-ID-INDEX"), makeSymbol("PROBLEM-ID-INDEX"), makeSymbol("LINK-ID-INDEX"), makeSymbol("PROOF-ID-INDEX"), makeSymbol("PROBLEM-BY-QUERY-INDEX"), makeSymbol("REJECTED-PROOFS"), makeSymbol("PROCESSED-PROOFS"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("MIN-PROOF-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("MIN-DEPTH-INDEX"), makeSymbol("EQUALITY-REASONING-METHOD"), makeSymbol("EQUALITY-REASONING-DOMAIN"), makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("MAX-PROBLEM-COUNT"), makeSymbol("CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("REMOVAL-ALLOWED?"), makeSymbol("TRANSFORMATION-ALLOWED?"), makeSymbol("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("NEGATION-BY-FAILURE?"), makeSymbol("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("DIRECTION"), makeSymbol("EVALUATE-SUBL-ALLOWED?"), makeSymbol("REWRITE-ALLOWED?"), makeSymbol("ABDUCTION-ALLOWED?"), makeSymbol("NEW-TERMS-ALLOWED?"), makeSymbol("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE-SPACE"), makeSymbol("PREPARED?"), makeSymbol("DESTRUCTION-IMMINENT?"), makeSymbol("META-PROBLEM-STORE"), makeSymbol("STATIC-PROPERTIES"), makeSymbol("JANITOR"), makeSymbol("HISTORICAL-ROOT-PROBLEMS"), makeSymbol("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROOF-KEEPING-INDEX")});
  public static final SubLList $list16 = list(new SubLObject[] {makeKeyword("GUID"), makeKeyword("SUID"), makeKeyword("LOCK"), makeKeyword("CREATION-TIME"), makeKeyword("INFERENCE-ID-INDEX"), makeKeyword("STRATEGY-ID-INDEX"), makeKeyword("PROBLEM-ID-INDEX"), makeKeyword("LINK-ID-INDEX"), makeKeyword("PROOF-ID-INDEX"), makeKeyword("PROBLEM-BY-QUERY-INDEX"), makeKeyword("REJECTED-PROOFS"), makeKeyword("PROCESSED-PROOFS"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX"), makeKeyword("MOST-RECENT-TACTIC-EXECUTED"), makeKeyword("MIN-PROOF-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeKeyword("MIN-DEPTH-INDEX"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("CRAZY-MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE-SPACE"), makeKeyword("PREPARED?"), makeKeyword("DESTRUCTION-IMMINENT?"), makeKeyword("META-PROBLEM-STORE"), makeKeyword("STATIC-PROPERTIES"), makeKeyword("JANITOR"), makeKeyword("HISTORICAL-ROOT-PROBLEMS"), makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeKeyword("PROOF-KEEPING-INDEX")});
  public static final SubLList $list17 = list(new SubLObject[] {makeSymbol("PROB-STORE-GUID"), makeSymbol("PROB-STORE-SUID"), makeSymbol("PROB-STORE-LOCK"), makeSymbol("PROB-STORE-CREATION-TIME"), makeSymbol("PROB-STORE-INFERENCE-ID-INDEX"), makeSymbol("PROB-STORE-STRATEGY-ID-INDEX"), makeSymbol("PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("PROB-STORE-LINK-ID-INDEX"), makeSymbol("PROB-STORE-PROOF-ID-INDEX"), makeSymbol("PROB-STORE-PROBLEM-BY-QUERY-INDEX"), makeSymbol("PROB-STORE-REJECTED-PROOFS"), makeSymbol("PROB-STORE-PROCESSED-PROOFS"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN"), makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?"), makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("PROB-STORE-DIRECTION"), makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("PROB-STORE-MEMOIZATION-STATE"), makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("PROB-STORE-PREPARED?"), makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("PROB-STORE-META-PROBLEM-STORE"), makeSymbol("PROB-STORE-STATIC-PROPERTIES"), makeSymbol("PROB-STORE-JANITOR"), makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX")});
  public static final SubLList $list18 = list(new SubLObject[] {makeSymbol("_CSETF-PROB-STORE-GUID"), makeSymbol("_CSETF-PROB-STORE-SUID"), makeSymbol("_CSETF-PROB-STORE-LOCK"), makeSymbol("_CSETF-PROB-STORE-CREATION-TIME"), makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX"), makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN"), makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-DIRECTION"), makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE"), makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("_CSETF-PROB-STORE-PREPARED?"), makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE"), makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES"), makeSymbol("_CSETF-PROB-STORE-JANITOR"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX")});
  public static final SubLSymbol $sym19$PRINT_PROBLEM_STORE = makeSymbol("PRINT-PROBLEM-STORE");
  public static final SubLInteger $int20$21 = makeInteger(21);
  public static final SubLInteger $int21$22 = makeInteger(22);
  public static final SubLInteger $int22$23 = makeInteger(23);
  public static final SubLInteger $int23$24 = makeInteger(24);
  public static final SubLInteger $int24$25 = makeInteger(25);
  public static final SubLInteger $int25$26 = makeInteger(26);
  public static final SubLInteger $int26$27 = makeInteger(27);
  public static final SubLInteger $int27$28 = makeInteger(28);
  public static final SubLInteger $int28$29 = makeInteger(29);
  public static final SubLInteger $int29$30 = makeInteger(30);
  public static final SubLInteger $int30$31 = makeInteger(31);
  public static final SubLInteger $int31$32 = makeInteger(32);
  public static final SubLInteger $int32$33 = makeInteger(33);
  public static final SubLInteger $int33$34 = makeInteger(34);
  public static final SubLInteger $int34$35 = makeInteger(35);
  public static final SubLInteger $int35$36 = makeInteger(36);
  public static final SubLInteger $int36$37 = makeInteger(37);
  public static final SubLInteger $int37$38 = makeInteger(38);
  public static final SubLInteger $int38$39 = makeInteger(39);
  public static final SubLInteger $int39$40 = makeInteger(40);
  public static final SubLInteger $int40$41 = makeInteger(41);
  public static final SubLInteger $int41$42 = makeInteger(42);
  public static final SubLInteger $int42$43 = makeInteger(43);
  public static final SubLInteger $int43$44 = makeInteger(44);
  public static final SubLInteger $int44$45 = makeInteger(45);
  public static final SubLInteger $int45$46 = makeInteger(46);
  public static final SubLInteger $int46$47 = makeInteger(47);
  public static final SubLSymbol $sym47$PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym48$PROB_STORE_GUID = makeSymbol("PROB-STORE-GUID");
  public static final SubLSymbol $sym49$_CSETF_PROB_STORE_GUID = makeSymbol("_CSETF-PROB-STORE-GUID");
  public static final SubLSymbol $sym50$PROB_STORE_SUID = makeSymbol("PROB-STORE-SUID");
  public static final SubLSymbol $sym51$_CSETF_PROB_STORE_SUID = makeSymbol("_CSETF-PROB-STORE-SUID");
  public static final SubLSymbol $sym52$PROB_STORE_LOCK = makeSymbol("PROB-STORE-LOCK");
  public static final SubLSymbol $sym53$_CSETF_PROB_STORE_LOCK = makeSymbol("_CSETF-PROB-STORE-LOCK");
  public static final SubLSymbol $sym54$PROB_STORE_CREATION_TIME = makeSymbol("PROB-STORE-CREATION-TIME");
  public static final SubLSymbol $sym55$_CSETF_PROB_STORE_CREATION_TIME = makeSymbol("_CSETF-PROB-STORE-CREATION-TIME");
  public static final SubLSymbol $sym56$PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("PROB-STORE-INFERENCE-ID-INDEX");
  public static final SubLSymbol $sym57$_CSETF_PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX");
  public static final SubLSymbol $sym58$PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("PROB-STORE-STRATEGY-ID-INDEX");
  public static final SubLSymbol $sym59$_CSETF_PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX");
  public static final SubLSymbol $sym60$PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("PROB-STORE-PROBLEM-ID-INDEX");
  public static final SubLSymbol $sym61$_CSETF_PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX");
  public static final SubLSymbol $sym62$PROB_STORE_LINK_ID_INDEX = makeSymbol("PROB-STORE-LINK-ID-INDEX");
  public static final SubLSymbol $sym63$_CSETF_PROB_STORE_LINK_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX");
  public static final SubLSymbol $sym64$PROB_STORE_PROOF_ID_INDEX = makeSymbol("PROB-STORE-PROOF-ID-INDEX");
  public static final SubLSymbol $sym65$_CSETF_PROB_STORE_PROOF_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX");
  public static final SubLSymbol $sym66$PROB_STORE_PROBLEM_BY_QUERY_INDEX = makeSymbol("PROB-STORE-PROBLEM-BY-QUERY-INDEX");
  public static final SubLSymbol $sym67$_CSETF_PROB_STORE_PROBLEM_BY_QUERY_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX");
  public static final SubLSymbol $sym68$PROB_STORE_REJECTED_PROOFS = makeSymbol("PROB-STORE-REJECTED-PROOFS");
  public static final SubLSymbol $sym69$_CSETF_PROB_STORE_REJECTED_PROOFS = makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS");
  public static final SubLSymbol $sym70$PROB_STORE_PROCESSED_PROOFS = makeSymbol("PROB-STORE-PROCESSED-PROOFS");
  public static final SubLSymbol $sym71$_CSETF_PROB_STORE_PROCESSED_PROOFS = makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS");
  public static final SubLSymbol $sym72$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
  public static final SubLSymbol $sym73$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
  public static final SubLSymbol $sym74$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");
  public static final SubLSymbol $sym75$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");
  public static final SubLSymbol $sym76$PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");
  public static final SubLSymbol $sym77$_CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");
  public static final SubLSymbol $sym78$PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX");
  public static final SubLSymbol $sym79$_CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX");
  public static final SubLSymbol $sym80$PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");
  public static final SubLSymbol $sym81$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");
  public static final SubLSymbol $sym82$PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
  public static final SubLSymbol $sym83$_CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
  public static final SubLSymbol $sym84$PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-DEPTH-INDEX");
  public static final SubLSymbol $sym85$_CSETF_PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX");
  public static final SubLSymbol $sym86$PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD");
  public static final SubLSymbol $sym87$_CSETF_PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD");
  public static final SubLSymbol $sym88$PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN");
  public static final SubLSymbol $sym89$_CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN");
  public static final SubLSymbol $sym90$PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $sym91$_CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $sym92$PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT");
  public static final SubLSymbol $sym93$_CSETF_PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT");
  public static final SubLSymbol $sym94$PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");
  public static final SubLSymbol $sym95$_CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");
  public static final SubLSymbol $sym96$PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("PROB-STORE-REMOVAL-ALLOWED?");
  public static final SubLSymbol $sym97$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?");
  public static final SubLSymbol $sym98$PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $sym99$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $sym100$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
  public static final SubLSymbol $sym101$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
  public static final SubLSymbol $sym102$PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?");
  public static final SubLSymbol $sym103$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?");
  public static final SubLSymbol $sym104$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");
  public static final SubLSymbol $sym105$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");
  public static final SubLSymbol $sym106$PROB_STORE_DIRECTION = makeSymbol("PROB-STORE-DIRECTION");
  public static final SubLSymbol $sym107$_CSETF_PROB_STORE_DIRECTION = makeSymbol("_CSETF-PROB-STORE-DIRECTION");
  public static final SubLSymbol $sym108$PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?");
  public static final SubLSymbol $sym109$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?");
  public static final SubLSymbol $sym110$PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("PROB-STORE-REWRITE-ALLOWED?");
  public static final SubLSymbol $sym111$_CSETF_PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?");
  public static final SubLSymbol $sym112$PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?");
  public static final SubLSymbol $sym113$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?");
  public static final SubLSymbol $sym114$PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?");
  public static final SubLSymbol $sym115$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?");
  public static final SubLSymbol $sym116$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");
  public static final SubLSymbol $sym117$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");
  public static final SubLSymbol $sym118$PROB_STORE_MEMOIZATION_STATE = makeSymbol("PROB-STORE-MEMOIZATION-STATE");
  public static final SubLSymbol $sym119$_CSETF_PROB_STORE_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE");
  public static final SubLSymbol $sym120$PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $sym121$_CSETF_PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $sym122$PROB_STORE_PREPARED_ = makeSymbol("PROB-STORE-PREPARED?");
  public static final SubLSymbol $sym123$_CSETF_PROB_STORE_PREPARED_ = makeSymbol("_CSETF-PROB-STORE-PREPARED?");
  public static final SubLSymbol $sym124$PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?");
  public static final SubLSymbol $sym125$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?");
  public static final SubLSymbol $sym126$PROB_STORE_META_PROBLEM_STORE = makeSymbol("PROB-STORE-META-PROBLEM-STORE");
  public static final SubLSymbol $sym127$_CSETF_PROB_STORE_META_PROBLEM_STORE = makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE");
  public static final SubLSymbol $sym128$PROB_STORE_STATIC_PROPERTIES = makeSymbol("PROB-STORE-STATIC-PROPERTIES");
  public static final SubLSymbol $sym129$_CSETF_PROB_STORE_STATIC_PROPERTIES = makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES");
  public static final SubLSymbol $sym130$PROB_STORE_JANITOR = makeSymbol("PROB-STORE-JANITOR");
  public static final SubLSymbol $sym131$_CSETF_PROB_STORE_JANITOR = makeSymbol("_CSETF-PROB-STORE-JANITOR");
  public static final SubLSymbol $sym132$PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS");
  public static final SubLSymbol $sym133$_CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS");
  public static final SubLSymbol $sym134$PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");
  public static final SubLSymbol $sym135$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");
  public static final SubLSymbol $sym136$PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");
  public static final SubLSymbol $sym137$_CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");
  public static final SubLSymbol $sym138$PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX");
  public static final SubLSymbol $sym139$_CSETF_PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX");
  public static final SubLSymbol $kw140$GUID = makeKeyword("GUID");
  public static final SubLSymbol $kw141$SUID = makeKeyword("SUID");
  public static final SubLSymbol $kw142$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw143$CREATION_TIME = makeKeyword("CREATION-TIME");
  public static final SubLSymbol $kw144$INFERENCE_ID_INDEX = makeKeyword("INFERENCE-ID-INDEX");
  public static final SubLSymbol $kw145$STRATEGY_ID_INDEX = makeKeyword("STRATEGY-ID-INDEX");
  public static final SubLSymbol $kw146$PROBLEM_ID_INDEX = makeKeyword("PROBLEM-ID-INDEX");
  public static final SubLSymbol $kw147$LINK_ID_INDEX = makeKeyword("LINK-ID-INDEX");
  public static final SubLSymbol $kw148$PROOF_ID_INDEX = makeKeyword("PROOF-ID-INDEX");
  public static final SubLSymbol $kw149$PROBLEM_BY_QUERY_INDEX = makeKeyword("PROBLEM-BY-QUERY-INDEX");
  public static final SubLSymbol $kw150$REJECTED_PROOFS = makeKeyword("REJECTED-PROOFS");
  public static final SubLSymbol $kw151$PROCESSED_PROOFS = makeKeyword("PROCESSED-PROOFS");
  public static final SubLSymbol $kw152$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");
  public static final SubLSymbol $kw153$NON_EXPLANATORY_SUBPROOFS_INDEX = makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX");
  public static final SubLSymbol $kw154$MOST_RECENT_TACTIC_EXECUTED = makeKeyword("MOST-RECENT-TACTIC-EXECUTED");
  public static final SubLSymbol $kw155$MIN_PROOF_DEPTH_INDEX = makeKeyword("MIN-PROOF-DEPTH-INDEX");
  public static final SubLSymbol $kw156$MIN_TRANSFORMATION_DEPTH_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX");
  public static final SubLSymbol $kw157$MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");
  public static final SubLSymbol $kw158$MIN_DEPTH_INDEX = makeKeyword("MIN-DEPTH-INDEX");
  public static final SubLSymbol $kw159$EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");
  public static final SubLSymbol $kw160$EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");
  public static final SubLSymbol $kw161$INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");
  public static final SubLSymbol $kw162$MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");
  public static final SubLSymbol $kw163$CRAZY_MAX_PROBLEM_COUNT = makeKeyword("CRAZY-MAX-PROBLEM-COUNT");
  public static final SubLSymbol $kw164$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");
  public static final SubLSymbol $kw165$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");
  public static final SubLSymbol $kw166$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");
  public static final SubLSymbol $kw167$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");
  public static final SubLSymbol $kw168$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");
  public static final SubLSymbol $kw169$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLSymbol $kw170$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");
  public static final SubLSymbol $kw171$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");
  public static final SubLSymbol $kw172$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");
  public static final SubLSymbol $kw173$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");
  public static final SubLSymbol $kw174$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");
  public static final SubLSymbol $kw175$MEMOIZATION_STATE = makeKeyword("MEMOIZATION-STATE");
  public static final SubLSymbol $kw176$SBHL_RESOURCE_SPACE = makeKeyword("SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $kw177$PREPARED_ = makeKeyword("PREPARED?");
  public static final SubLSymbol $kw178$DESTRUCTION_IMMINENT_ = makeKeyword("DESTRUCTION-IMMINENT?");
  public static final SubLSymbol $kw179$META_PROBLEM_STORE = makeKeyword("META-PROBLEM-STORE");
  public static final SubLSymbol $kw180$STATIC_PROPERTIES = makeKeyword("STATIC-PROPERTIES");
  public static final SubLSymbol $kw181$JANITOR = makeKeyword("JANITOR");
  public static final SubLSymbol $kw182$HISTORICAL_ROOT_PROBLEMS = makeKeyword("HISTORICAL-ROOT-PROBLEMS");
  public static final SubLSymbol $kw183$COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX");
  public static final SubLSymbol $kw184$COMPLEX_PROBLEM_QUERY_SIGNATURES = makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES");
  public static final SubLSymbol $kw185$PROOF_KEEPING_INDEX = makeKeyword("PROOF-KEEPING-INDEX");
  public static final SubLString $str186$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLSymbol $kw187$FREE = makeKeyword("FREE");
  public static final SubLString $str188$_Invalid_PROBLEM_STORE__s_ = makeString("<Invalid PROBLEM STORE ~s>");
  public static final SubLString $str189$_PROBLEM_STORE__a_size__a_ = makeString("<PROBLEM STORE ~a size=~a>");
  public static final SubLSymbol $sym190$SXHASH_PROBLEM_STORE_METHOD = makeSymbol("SXHASH-PROBLEM-STORE-METHOD");
  public static final SubLList $list191 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym192$WITH_LOCK_HELD = makeSymbol("WITH-LOCK-HELD");
  public static final SubLSymbol $sym193$PROBLEM_STORE_LOCK = makeSymbol("PROBLEM-STORE-LOCK");
  public static final SubLSymbol $sym194$WITH_PROBLEM_STORE_LOCK_HELD = makeSymbol("WITH-PROBLEM-STORE-LOCK-HELD");
  public static final SubLList $list195 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym196$WITH_MEMOIZATION_STATE = makeSymbol("WITH-MEMOIZATION-STATE");
  public static final SubLSymbol $sym197$PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("PROBLEM-STORE-MEMOIZATION-STATE");
  public static final SubLSymbol $sym198$WITH_PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-STORE-MEMOIZATION-STATE");
  public static final SubLSymbol $sym199$SPACE_VAR = makeUninternedSymbol("SPACE-VAR");
  public static final SubLSymbol $sym200$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym201$PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROBLEM-STORE-SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $sym202$WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");
  public static final SubLSymbol $sym203$SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $sym204$WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
  public static final SubLSymbol $sym205$STORE_VAR = makeUninternedSymbol("STORE-VAR");
  public static final SubLList $list206 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym207$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym208$PROBLEM_STORE_INFERENCE_ID_INDEX = makeSymbol("PROBLEM-STORE-INFERENCE-ID-INDEX");
  public static final SubLSymbol $sym209$DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");
  public static final SubLList $list210 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym211$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym212$PROBLEM_STORE_STRATEGY_ID_INDEX = makeSymbol("PROBLEM-STORE-STRATEGY-ID-INDEX");
  public static final SubLSymbol $sym213$DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");
  public static final SubLList $list214 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym215$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list216 = list(makeKeyword("TACTICAL"));
  public static final SubLList $list217 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list218 = list(makeKeyword("ORDERED"), makeKeyword("DONE"));
  public static final SubLSymbol $kw219$ORDERED = makeKeyword("ORDERED");
  public static final SubLSymbol $sym220$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym221$PROBLEM_STORE_PROBLEM_ID_INDEX = makeSymbol("PROBLEM-STORE-PROBLEM-ID-INDEX");
  public static final SubLSymbol $sym222$DO_PROBLEM_STORE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-PROBLEMS");
  public static final SubLList $list223 = list(list(makeSymbol("LINK-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list224 = list(makeKeyword("TYPE"), makeKeyword("ORDERED"), makeKeyword("DONE"));
  public static final SubLSymbol $kw225$TYPE = makeKeyword("TYPE");
  public static final SubLSymbol $sym226$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym227$PROBLEM_STORE_LINK_ID_INDEX = makeSymbol("PROBLEM-STORE-LINK-ID-INDEX");
  public static final SubLSymbol $sym228$DO_PROBLEM_STORE_LINKS = makeSymbol("DO-PROBLEM-STORE-LINKS");
  public static final SubLSymbol $sym229$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym230$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");
  public static final SubLList $list231 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list232 = list(makeKeyword("PROOF-STATUS"), makeKeyword("ORDERED"), makeKeyword("DONE"));
  public static final SubLSymbol $kw233$PROOF_STATUS = makeKeyword("PROOF-STATUS");
  public static final SubLSymbol $sym234$ID = makeUninternedSymbol("ID");
  public static final SubLSymbol $sym235$PROBLEM_STORE_PROOF_ID_INDEX = makeSymbol("PROBLEM-STORE-PROOF-ID-INDEX");
  public static final SubLSymbol $sym236$DO_PROBLEM_STORE_PROOFS = makeSymbol("DO-PROBLEM-STORE-PROOFS");
  public static final SubLSymbol $sym237$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");
  public static final SubLList $list238 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym239$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym240$PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
  public static final SubLSymbol $sym241$DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
  public static final SubLList $list242 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym243$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");
  public static final SubLSymbol $sym244$INFERENCE_STRATEGY_SET = makeSymbol("INFERENCE-STRATEGY-SET");
  public static final SubLInteger $int245$80 = makeInteger(80);
  public static final SubLInteger $int246$120 = makeInteger(120);
  public static final SubLSymbol $sym247$PROBLEM_STORE_PROPERTIES_P = makeSymbol("PROBLEM-STORE-PROPERTIES-P");
  public static final SubLSymbol $sym248$PROBLEM_STORE_NAME_P = makeSymbol("PROBLEM-STORE-NAME-P");
  public static final SubLString $str249$A_problem_store_named__s_already_ = makeString("A problem store named ~s already exists.");
  public static final SubLString $str250$Problem_Store_Lock = makeString("Problem Store Lock");
  public static final SubLSymbol $sym251$PROBLEM_STORE_EQUALITY_REASONING_METHOD_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-METHOD-P");
  public static final SubLSymbol $sym252$PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P");
  public static final SubLSymbol $kw253$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw254$EMPTY_DOMAIN = makeKeyword("EMPTY-DOMAIN");
  public static final SubLSymbol $sym255$INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL-P");
  public static final SubLSymbol $sym256$MAX_PROBLEM_COUNT_P = makeSymbol("MAX-PROBLEM-COUNT-P");
  public static final SubLSymbol $sym257$BOOLEANP = makeSymbol("BOOLEANP");
  public static final SubLSymbol $sym258$INFERENCE_DIRECTION_P = makeSymbol("INFERENCE-DIRECTION-P");
  public static final SubLString $str259$problem_store_memoization_state = makeString("problem store memoization state");
  public static final SubLString $str260$problem_store_memoization_lock = makeString("problem store memoization lock");
  public static final SubLSymbol $kw261$SKIP = makeKeyword("SKIP");
  public static final SubLSymbol $sym262$TACTIC_P = makeSymbol("TACTIC-P");
  public static final SubLSymbol $sym263$NEW_PROBLEM_STORE_P = makeSymbol("NEW-PROBLEM-STORE-P");
  public static final SubLSymbol $kw264$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $kw265$TACTICAL = makeKeyword("TACTICAL");
  public static final SubLSymbol $kw266$CONTENT = makeKeyword("CONTENT");
  public static final SubLSymbol $kw267$ANSWER = makeKeyword("ANSWER");
  public static final SubLSymbol $kw268$REMOVAL = makeKeyword("REMOVAL");
  public static final SubLSymbol $kw269$REMOVAL_CONJUNCTIVE = makeKeyword("REMOVAL-CONJUNCTIVE");
  public static final SubLSymbol $kw270$TRANSFORMATION = makeKeyword("TRANSFORMATION");
  public static final SubLSymbol $kw271$REWRITE = makeKeyword("REWRITE");
  public static final SubLSymbol $kw272$STRUCTURAL = makeKeyword("STRUCTURAL");
  public static final SubLSymbol $kw273$JOIN_ORDERED = makeKeyword("JOIN-ORDERED");
  public static final SubLSymbol $kw274$JOIN = makeKeyword("JOIN");
  public static final SubLSymbol $kw275$SPLIT = makeKeyword("SPLIT");
  public static final SubLSymbol $kw276$RESTRICTION = makeKeyword("RESTRICTION");
  public static final SubLSymbol $kw277$RESIDUAL_TRANSFORMATION = makeKeyword("RESIDUAL-TRANSFORMATION");
  public static final SubLSymbol $kw278$UNION = makeKeyword("UNION");
  public static final SubLInteger $int279$212 = makeInteger(212);
  public static final SubLSymbol $kw280$POSSIBLE = makeKeyword("POSSIBLE");
  public static final SubLSymbol $kw281$EXECUTED = makeKeyword("EXECUTED");
  public static final SubLSymbol $kw282$DISCARDED = makeKeyword("DISCARDED");
  public static final SubLSymbol $sym283$_ = makeSymbol("<");
  public static final SubLSymbol $sym284$PROOF_SUID = makeSymbol("PROOF-SUID");
  public static final SubLSymbol $sym285$PROBLEM_SUID = makeSymbol("PROBLEM-SUID");
  public static final SubLSymbol $sym286$PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");
  public static final SubLSymbol $kw287$UNDETERMINED = makeKeyword("UNDETERMINED");
  public static final SubLSymbol $kw288$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLSymbol $kw289$NON_PROOF_KEEPING = makeKeyword("NON-PROOF-KEEPING");
  public static final SubLList $list290 = list(makeKeyword("NON-PROOF-KEEPING"), makeKeyword("UNKNOWN"));
  public static final SubLString $str291$Invalid_proof_keeping_reason__a_f = makeString("Invalid proof-keeping reason ~a for problem ~a");
  public static final SubLSymbol $sym292$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym293$PROOF_REJECTED_ = makeSymbol("PROOF-REJECTED?");
  public static final SubLSymbol $sym294$PROOF_P = makeSymbol("PROOF-P");
  public static final SubLString $str295$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");
  public static final SubLSymbol $sym296$ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED");
  public static final SubLSymbol $kw297$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym298$ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED");
  public static final SubLSymbol $sym299$PROBLEM_STORE_JANITOR = makeSymbol("PROBLEM-STORE-JANITOR");
  public static final SubLSymbol $sym300$PROBLEM_STORE_JANITOR_P = makeSymbol("PROBLEM-STORE-JANITOR-P");
  public static final SubLList $list301 = list(makeSymbol("STORE"), makeSymbol("INDESTRUCTIBLE-PROBLEMS"), makeSymbol("STALE?"));
  public static final SubLList $list302 = list(makeKeyword("STORE"), makeKeyword("INDESTRUCTIBLE-PROBLEMS"), makeKeyword("STALE?"));
  public static final SubLList $list303 = list(makeSymbol("PROB-STORE-JANITOR-STORE"), makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("PROB-STORE-JANITOR-STALE?"));
  public static final SubLList $list304 = list(makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE"), makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?"));
  public static final SubLSymbol $sym305$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym306$PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym307$PROB_STORE_JANITOR_STORE = makeSymbol("PROB-STORE-JANITOR-STORE");
  public static final SubLSymbol $sym308$_CSETF_PROB_STORE_JANITOR_STORE = makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE");
  public static final SubLSymbol $sym309$PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
  public static final SubLSymbol $sym310$_CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
  public static final SubLSymbol $sym311$PROB_STORE_JANITOR_STALE_ = makeSymbol("PROB-STORE-JANITOR-STALE?");
  public static final SubLSymbol $sym312$_CSETF_PROB_STORE_JANITOR_STALE_ = makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?");
  public static final SubLSymbol $kw313$STORE = makeKeyword("STORE");
  public static final SubLSymbol $kw314$INDESTRUCTIBLE_PROBLEMS = makeKeyword("INDESTRUCTIBLE-PROBLEMS");
  public static final SubLSymbol $kw315$STALE_ = makeKeyword("STALE?");
  public static final SubLSymbol $sym316$PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
  public static final SubLSymbol $sym317$DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
  public static final SubLList $list318 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("JANITOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym319$PROBLEM_STORE_JANITOR_STORE = makeSymbol("PROBLEM-STORE-JANITOR-STORE");
  public static final SubLSymbol $sym320$PROBLEM_DESTRUCTIBLE_ = makeSymbol("PROBLEM-DESTRUCTIBLE?");
  public static final SubLSymbol $sym321$PROBLEM_P = makeSymbol("PROBLEM-P");
  public static final SubLSymbol $sym322$_PROBLEM_STORE_ID_TO_NAME_TABLE_ = makeSymbol("*PROBLEM-STORE-ID-TO-NAME-TABLE*");
  public static final SubLSymbol $sym323$_PROBLEM_STORE_NAME_TO_ID_TABLE_ = makeSymbol("*PROBLEM-STORE-NAME-TO-ID-TABLE*");
  public static final SubLSymbol $sym324$FIND_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-PROBLEM-STORE-BY-NAME");
  public static final SubLSymbol $sym325$FIND_OR_CREATE_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-OR-CREATE-PROBLEM-STORE-BY-NAME");
  public static final SubLSymbol $kw326$PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");
  public static final SubLSymbol $sym327$DESTROY_PROBLEM_STORE_BY_NAME = makeSymbol("DESTROY-PROBLEM-STORE-BY-NAME");
  public static final SubLSymbol $sym328$PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");
  public static final SubLString $str329$Problem_store_property__S_reflect = makeString("Problem store property ~S reflection is not yet supported");

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_inference_datastructures_problem_store_file();
  }

  @Override
  public void initializeVariables() {
    init_inference_datastructures_problem_store_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_inference_datastructures_problem_store_file();
  }

}
