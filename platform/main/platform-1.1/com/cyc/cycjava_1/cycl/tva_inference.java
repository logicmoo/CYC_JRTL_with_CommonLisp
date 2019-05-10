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
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_meta;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.ghl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.ghl_search_methods;
//dm import com.cyc.cycjava_1.cycl.ghl_search_vars;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_strategist;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sksi.sksi_infrastructure.sksi_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.tva_cache;
//dm import com.cyc.cycjava_1.cycl.tva_strategy;
//dm import com.cyc.cycjava_1.cycl.tva_utilities;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class tva_inference extends SubLTranslatedFile {

  //// Constructor

  private tva_inference() {}
  public static final SubLFile me = new tva_inference();
  public static final String myName = "com.cyc.cycjava_1.cycl.tva_inference";

  //// Definitions

  /** Whether the inner loop of TVA-UNIFY checks its current controlling inference to see if its :MAX-TIME parameter has been exceeded. */
  @SubL(source = "cycl/tva-inference.lisp", position = 1099) 
  private static SubLSymbol $tva_max_time_enabledP$ = null;

  public static final class $tva_inference_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $problem; }
    public SubLObject getField3() { return $asent_pred; }
    public SubLObject getField4() { return $asent_args; }
    public SubLObject getField5() { return $args_admitted; }
    public SubLObject getField6() { return $term_argnums; }
    public SubLObject getField7() { return $var_argnums; }
    public SubLObject getField8() { return $precomputations; }
    public SubLObject getField9() { return $reused_spaces; }
    public SubLObject getField10() { return $one_answerP; }
    public SubLObject getField11() { return $justifyP; }
    public SubLObject getField12() { return $restricted_assertion; }
    public SubLObject getField13() { return $answers; }
    public SubLObject setField2(SubLObject value) { return $problem = value; }
    public SubLObject setField3(SubLObject value) { return $asent_pred = value; }
    public SubLObject setField4(SubLObject value) { return $asent_args = value; }
    public SubLObject setField5(SubLObject value) { return $args_admitted = value; }
    public SubLObject setField6(SubLObject value) { return $term_argnums = value; }
    public SubLObject setField7(SubLObject value) { return $var_argnums = value; }
    public SubLObject setField8(SubLObject value) { return $precomputations = value; }
    public SubLObject setField9(SubLObject value) { return $reused_spaces = value; }
    public SubLObject setField10(SubLObject value) { return $one_answerP = value; }
    public SubLObject setField11(SubLObject value) { return $justifyP = value; }
    public SubLObject setField12(SubLObject value) { return $restricted_assertion = value; }
    public SubLObject setField13(SubLObject value) { return $answers = value; }
    public SubLObject $problem = NIL;
    public SubLObject $asent_pred = NIL;
    public SubLObject $asent_args = NIL;
    public SubLObject $args_admitted = NIL;
    public SubLObject $term_argnums = NIL;
    public SubLObject $var_argnums = NIL;
    public SubLObject $precomputations = NIL;
    public SubLObject $reused_spaces = NIL;
    public SubLObject $one_answerP = NIL;
    public SubLObject $justifyP = NIL;
    public SubLObject $restricted_assertion = NIL;
    public SubLObject $answers = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($tva_inference_native.class, $sym0$TVA_INFERENCE, $sym1$TVA_INFERENCE_P, $list2, $list3, new String[] {"$problem", "$asent_pred", "$asent_args", "$args_admitted", "$term_argnums", "$var_argnums", "$precomputations", "$reused_spaces", "$one_answerP", "$justifyP", "$restricted_assertion", "$answers"}, $list4, $list5, $sym6$PRINT_TVA_INFERENCE);
  }

  @SubL(source = "cycl/tva-inference.lisp", position = 1281) 
  public static SubLSymbol $dtp_tva_inference$ = null;

  @SubL(source = "cycl/tva-inference.lisp", position = 1281) 
  public static final SubLObject tva_inference_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4648");
    return NIL;
  }

  public static final class $tva_inference_p$UnaryFunction extends UnaryFunction {
    public $tva_inference_p$UnaryFunction() { super(extractFunctionNamed("TVA-INFERENCE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4684"); }
  }

  /** The current TVA inference. */
  @SubL(source = "cycl/tva-inference.lisp", position = 4411) 
  public static SubLSymbol $tva_inference$ = null;

  /** Reuse search spaces when the same transitive predicate and goal-node are used multiple times.  Saves time and space. */
  @SubL(source = "cycl/tva-inference.lisp", position = 7562) 
  private static SubLSymbol $tva_reuse_spacesP$ = null;

  /** @return listp. Determines the argnums for each of the fully bound terms in ASENT. */
  @SubL(source = "cycl/tva-inference.lisp", position = 8607) 
  public static final SubLObject determine_term_argnums(SubLObject asent) {
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = list_utilities.num_list(el_utilities.formula_length(asent, UNPROVIDED), UNPROVIDED).rest();
      SubLObject num = NIL;
      for (num = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), num = cdolist_list_var.first()) {
        if ((NIL != variables.fully_bound_p(cycl_utilities.atomic_sentence_arg(asent, num, UNPROVIDED)))) {
          result = cons(num, result);
        }
      }
      return Sequences.nreverse(result);
    }
  }

  public static final SubLObject declare_tva_inference_file() {
    declareFunction(myName, "tva_inference_print_function_trampoline", "TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "tva_inference_p", "TVA-INFERENCE-P", 1, 0, false); new $tva_inference_p$UnaryFunction();
    //declareFunction(myName, "tva_inf_problem", "TVA-INF-PROBLEM", 1, 0, false);
    //declareFunction(myName, "tva_inf_asent_pred", "TVA-INF-ASENT-PRED", 1, 0, false);
    //declareFunction(myName, "tva_inf_asent_args", "TVA-INF-ASENT-ARGS", 1, 0, false);
    //declareFunction(myName, "tva_inf_args_admitted", "TVA-INF-ARGS-ADMITTED", 1, 0, false);
    //declareFunction(myName, "tva_inf_term_argnums", "TVA-INF-TERM-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "tva_inf_var_argnums", "TVA-INF-VAR-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "tva_inf_precomputations", "TVA-INF-PRECOMPUTATIONS", 1, 0, false);
    //declareFunction(myName, "tva_inf_reused_spaces", "TVA-INF-REUSED-SPACES", 1, 0, false);
    //declareFunction(myName, "tva_inf_one_answerP", "TVA-INF-ONE-ANSWER?", 1, 0, false);
    //declareFunction(myName, "tva_inf_justifyP", "TVA-INF-JUSTIFY?", 1, 0, false);
    //declareFunction(myName, "tva_inf_restricted_assertion", "TVA-INF-RESTRICTED-ASSERTION", 1, 0, false);
    //declareFunction(myName, "tva_inf_answers", "TVA-INF-ANSWERS", 1, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_problem", "_CSETF-TVA-INF-PROBLEM", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_asent_pred", "_CSETF-TVA-INF-ASENT-PRED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_asent_args", "_CSETF-TVA-INF-ASENT-ARGS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_args_admitted", "_CSETF-TVA-INF-ARGS-ADMITTED", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_term_argnums", "_CSETF-TVA-INF-TERM-ARGNUMS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_var_argnums", "_CSETF-TVA-INF-VAR-ARGNUMS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_precomputations", "_CSETF-TVA-INF-PRECOMPUTATIONS", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_reused_spaces", "_CSETF-TVA-INF-REUSED-SPACES", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_one_answerP", "_CSETF-TVA-INF-ONE-ANSWER?", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_justifyP", "_CSETF-TVA-INF-JUSTIFY?", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_restricted_assertion", "_CSETF-TVA-INF-RESTRICTED-ASSERTION", 2, 0, false);
    //declareFunction(myName, "_csetf_tva_inf_answers", "_CSETF-TVA-INF-ANSWERS", 2, 0, false);
    //declareFunction(myName, "make_tva_inference", "MAKE-TVA-INFERENCE", 0, 1, false);
    //declareFunction(myName, "print_tva_inference", "PRINT-TVA-INFERENCE", 3, 0, false);
    //declareFunction(myName, "initialize_tva_inference", "INITIALIZE-TVA-INFERENCE", 3, 0, false);
    //declareFunction(myName, "tva_inference_asent_pred", "TVA-INFERENCE-ASENT-PRED", 1, 0, false);
    //declareFunction(myName, "tva_inference_asent_args", "TVA-INFERENCE-ASENT-ARGS", 1, 0, false);
    //declareFunction(myName, "tva_inference_args_admitted", "TVA-INFERENCE-ARGS-ADMITTED", 1, 0, false);
    //declareFunction(myName, "tva_inference_term_argnums", "TVA-INFERENCE-TERM-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "tva_inference_var_argnums", "TVA-INFERENCE-VAR-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "tva_inference_precomputations", "TVA-INFERENCE-PRECOMPUTATIONS", 1, 0, false);
    //declareFunction(myName, "tva_inference_reused_spaces", "TVA-INFERENCE-REUSED-SPACES", 1, 0, false);
    //declareFunction(myName, "tva_inference_justifyP", "TVA-INFERENCE-JUSTIFY?", 1, 0, false);
    //declareFunction(myName, "tva_inference_one_answerP", "TVA-INFERENCE-ONE-ANSWER?", 1, 0, false);
    //declareFunction(myName, "tva_inference_restricted_assertion", "TVA-INFERENCE-RESTRICTED-ASSERTION", 1, 0, false);
    //declareFunction(myName, "tva_inference_answers", "TVA-INFERENCE-ANSWERS", 1, 0, false);
    //declareFunction(myName, "tva_inference_asent_arg", "TVA-INFERENCE-ASENT-ARG", 2, 0, false);
    //declareFunction(myName, "tva_inference_arg_admitted", "TVA-INFERENCE-ARG-ADMITTED", 2, 0, false);
    //declareFunction(myName, "store_tva_inference_precomputation", "STORE-TVA-INFERENCE-PRECOMPUTATION", 3, 0, false);
    //declareFunction(myName, "store_tva_inference_reused_spaces", "STORE-TVA-INFERENCE-REUSED-SPACES", 3, 0, false);
    //declareFunction(myName, "set_tva_inference_arg_admitted", "SET-TVA-INFERENCE-ARG-ADMITTED", 3, 0, false);
    //declareMacro(myName, "with_new_tva_inference", "WITH-NEW-TVA-INFERENCE");
    //declareFunction(myName, "tva_asent_pred", "TVA-ASENT-PRED", 0, 0, false);
    //declareFunction(myName, "tva_var_argnums", "TVA-VAR-ARGNUMS", 0, 0, false);
    //declareFunction(myName, "tva_var_argnum", "TVA-VAR-ARGNUM", 1, 0, false);
    //declareFunction(myName, "tva_term_argnums", "TVA-TERM-ARGNUMS", 0, 0, false);
    //declareFunction(myName, "tva_asent_arg", "TVA-ASENT-ARG", 1, 0, false);
    //declareFunction(myName, "tva_asent_arg_admitted", "TVA-ASENT-ARG-ADMITTED", 1, 0, false);
    //declareFunction(myName, "set_tva_asent_arg_admitted", "SET-TVA-ASENT-ARG-ADMITTED", 1, 0, false);
    //declareFunction(myName, "set_tva_asent_arg_failed", "SET-TVA-ASENT-ARG-FAILED", 1, 0, false);
    //declareFunction(myName, "tva_return_one_answerP", "TVA-RETURN-ONE-ANSWER?", 0, 0, false);
    //declareFunction(myName, "tva_compute_justificationsP", "TVA-COMPUTE-JUSTIFICATIONS?", 0, 0, false);
    //declareFunction(myName, "tva_tactic_precomputations", "TVA-TACTIC-PRECOMPUTATIONS", 1, 0, false);
    //declareFunction(myName, "tva_store_precomputation", "TVA-STORE-PRECOMPUTATION", 2, 0, false);
    //declareFunction(myName, "tva_restricted_assertion_p", "TVA-RESTRICTED-ASSERTION-P", 1, 0, false);
    //declareFunction(myName, "tva_reused_spaces", "TVA-REUSED-SPACES", 0, 0, false);
    //declareFunction(myName, "tva_store_reused_spaces", "TVA-STORE-REUSED-SPACES", 2, 0, false);
    //declareFunction(myName, "tva_reused_spaces_for_relation", "TVA-REUSED-SPACES-FOR-RELATION", 2, 0, false);
    //declareFunction(myName, "tva_answers", "TVA-ANSWERS", 0, 0, false);
    //declareFunction(myName, "add_to_tva_answers", "ADD-TO-TVA-ANSWERS", 1, 0, false);
    declareFunction(myName, "determine_term_argnums", "DETERMINE-TERM-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "determine_var_argnums", "DETERMINE-VAR-ARGNUMS", 1, 0, false);
    //declareFunction(myName, "determine_restricted_assertion", "DETERMINE-RESTRICTED-ASSERTION", 1, 0, false);
    //declareFunction(myName, "initialize_tva_asent_vector", "INITIALIZE-TVA-ASENT-VECTOR", 1, 0, false);
    //declareFunction(myName, "initialize_tva_args_admitted_vector", "INITIALIZE-TVA-ARGS-ADMITTED-VECTOR", 1, 0, false);
    //declareFunction(myName, "tva_unify", "TVA-UNIFY", 1, 5, false);
    //declareFunction(myName, "tva_unify_from_cache", "TVA-UNIFY-FROM-CACHE", 2, 2, false);
    //declareFunction(myName, "tva_unify_closure", "TVA-UNIFY-CLOSURE", 2, 0, false);
    //declareFunction(myName, "tva_marked_p", "TVA-MARKED-P", 2, 0, false);
    //declareFunction(myName, "tva_mark_node_marked", "TVA-MARK-NODE-MARKED", 2, 0, false);
    //declareFunction(myName, "tva_mark_and_sweep", "TVA-MARK-AND-SWEEP", 2, 0, false);
    //declareFunction(myName, "tva_unify_closure_iterator", "TVA-UNIFY-CLOSURE-ITERATOR", 1, 2, false);
    //declareFunction(myName, "tva_unify_closure_iterator_int", "TVA-UNIFY-CLOSURE-ITERATOR-INT", 2, 0, false);
    //declareFunction(myName, "tva_unify_closure_iterator_state", "TVA-UNIFY-CLOSURE-ITERATOR-STATE", 2, 0, false);
    //declareFunction(myName, "tva_unify_closure_iterator_done", "TVA-UNIFY-CLOSURE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "tva_unify_closure_iterator_next", "TVA-UNIFY-CLOSURE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "tva_unify_closure_iterator_finalize", "TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE", 1, 0, false);
    //declareFunction(myName, "new_tva_unify_closure_answer_iterator", "NEW-TVA-UNIFY-CLOSURE-ANSWER-ITERATOR", 2, 0, false);
    //declareFunction(myName, "new_tva_unify_closure_bindings_iterators", "NEW-TVA-UNIFY-CLOSURE-BINDINGS-ITERATORS", 2, 0, false);
    //declareFunction(myName, "new_tva_unify_closure_var_bindings_iterator", "NEW-TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR", 2, 0, false);
    //declareFunction(myName, "tva_unify_closure_var_bindings_iterator_done", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "tva_unify_closure_var_bindings_iterator_next", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "tva_unify_closure_var_bindings_iterator_finalize", "TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_tva_inference_file() {
    $tva_max_time_enabledP$ = deflexical("*TVA-MAX-TIME-ENABLED?*", T);
    $dtp_tva_inference$ = defconstant("*DTP-TVA-INFERENCE*", $sym0$TVA_INFERENCE);
    $tva_inference$ = defparameter("*TVA-INFERENCE*", NIL);
    $tva_reuse_spacesP$ = defparameter("*TVA-REUSE-SPACES?*", NIL);
    return NIL;
  }

  public static final SubLObject setup_tva_inference_file() {
    // CVS_ID("Id: tva-inference.lisp 126745 2009-01-06 22:42:50Z baxter ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_tva_inference$.getGlobalValue(), Symbols.symbol_function($sym7$TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$TVA_INF_PROBLEM, $sym9$_CSETF_TVA_INF_PROBLEM);
    Structures.def_csetf($sym10$TVA_INF_ASENT_PRED, $sym11$_CSETF_TVA_INF_ASENT_PRED);
    Structures.def_csetf($sym12$TVA_INF_ASENT_ARGS, $sym13$_CSETF_TVA_INF_ASENT_ARGS);
    Structures.def_csetf($sym14$TVA_INF_ARGS_ADMITTED, $sym15$_CSETF_TVA_INF_ARGS_ADMITTED);
    Structures.def_csetf($sym16$TVA_INF_TERM_ARGNUMS, $sym17$_CSETF_TVA_INF_TERM_ARGNUMS);
    Structures.def_csetf($sym18$TVA_INF_VAR_ARGNUMS, $sym19$_CSETF_TVA_INF_VAR_ARGNUMS);
    Structures.def_csetf($sym20$TVA_INF_PRECOMPUTATIONS, $sym21$_CSETF_TVA_INF_PRECOMPUTATIONS);
    Structures.def_csetf($sym22$TVA_INF_REUSED_SPACES, $sym23$_CSETF_TVA_INF_REUSED_SPACES);
    Structures.def_csetf($sym24$TVA_INF_ONE_ANSWER_, $sym25$_CSETF_TVA_INF_ONE_ANSWER_);
    Structures.def_csetf($sym26$TVA_INF_JUSTIFY_, $sym27$_CSETF_TVA_INF_JUSTIFY_);
    Structures.def_csetf($sym28$TVA_INF_RESTRICTED_ASSERTION, $sym29$_CSETF_TVA_INF_RESTRICTED_ASSERTION);
    Structures.def_csetf($sym30$TVA_INF_ANSWERS, $sym31$_CSETF_TVA_INF_ANSWERS);
    Equality.identity($sym0$TVA_INFERENCE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$TVA_INFERENCE = makeSymbol("TVA-INFERENCE");
  public static final SubLSymbol $sym1$TVA_INFERENCE_P = makeSymbol("TVA-INFERENCE-P");
  public static final SubLList $list2 = list(new SubLObject[] {makeSymbol("PROBLEM"), makeSymbol("ASENT-PRED"), makeSymbol("ASENT-ARGS"), makeSymbol("ARGS-ADMITTED"), makeSymbol("TERM-ARGNUMS"), makeSymbol("VAR-ARGNUMS"), makeSymbol("PRECOMPUTATIONS"), makeSymbol("REUSED-SPACES"), makeSymbol("ONE-ANSWER?"), makeSymbol("JUSTIFY?"), makeSymbol("RESTRICTED-ASSERTION"), makeSymbol("ANSWERS")});
  public static final SubLList $list3 = list(new SubLObject[] {makeKeyword("PROBLEM"), makeKeyword("ASENT-PRED"), makeKeyword("ASENT-ARGS"), makeKeyword("ARGS-ADMITTED"), makeKeyword("TERM-ARGNUMS"), makeKeyword("VAR-ARGNUMS"), makeKeyword("PRECOMPUTATIONS"), makeKeyword("REUSED-SPACES"), makeKeyword("ONE-ANSWER?"), makeKeyword("JUSTIFY?"), makeKeyword("RESTRICTED-ASSERTION"), makeKeyword("ANSWERS")});
  public static final SubLList $list4 = list(new SubLObject[] {makeSymbol("TVA-INF-PROBLEM"), makeSymbol("TVA-INF-ASENT-PRED"), makeSymbol("TVA-INF-ASENT-ARGS"), makeSymbol("TVA-INF-ARGS-ADMITTED"), makeSymbol("TVA-INF-TERM-ARGNUMS"), makeSymbol("TVA-INF-VAR-ARGNUMS"), makeSymbol("TVA-INF-PRECOMPUTATIONS"), makeSymbol("TVA-INF-REUSED-SPACES"), makeSymbol("TVA-INF-ONE-ANSWER?"), makeSymbol("TVA-INF-JUSTIFY?"), makeSymbol("TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("TVA-INF-ANSWERS")});
  public static final SubLList $list5 = list(new SubLObject[] {makeSymbol("_CSETF-TVA-INF-PROBLEM"), makeSymbol("_CSETF-TVA-INF-ASENT-PRED"), makeSymbol("_CSETF-TVA-INF-ASENT-ARGS"), makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED"), makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS"), makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS"), makeSymbol("_CSETF-TVA-INF-REUSED-SPACES"), makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?"), makeSymbol("_CSETF-TVA-INF-JUSTIFY?"), makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION"), makeSymbol("_CSETF-TVA-INF-ANSWERS")});
  public static final SubLSymbol $sym6$PRINT_TVA_INFERENCE = makeSymbol("PRINT-TVA-INFERENCE");
  public static final SubLSymbol $sym7$TVA_INFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-INFERENCE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$TVA_INF_PROBLEM = makeSymbol("TVA-INF-PROBLEM");
  public static final SubLSymbol $sym9$_CSETF_TVA_INF_PROBLEM = makeSymbol("_CSETF-TVA-INF-PROBLEM");
  public static final SubLSymbol $sym10$TVA_INF_ASENT_PRED = makeSymbol("TVA-INF-ASENT-PRED");
  public static final SubLSymbol $sym11$_CSETF_TVA_INF_ASENT_PRED = makeSymbol("_CSETF-TVA-INF-ASENT-PRED");
  public static final SubLSymbol $sym12$TVA_INF_ASENT_ARGS = makeSymbol("TVA-INF-ASENT-ARGS");
  public static final SubLSymbol $sym13$_CSETF_TVA_INF_ASENT_ARGS = makeSymbol("_CSETF-TVA-INF-ASENT-ARGS");
  public static final SubLSymbol $sym14$TVA_INF_ARGS_ADMITTED = makeSymbol("TVA-INF-ARGS-ADMITTED");
  public static final SubLSymbol $sym15$_CSETF_TVA_INF_ARGS_ADMITTED = makeSymbol("_CSETF-TVA-INF-ARGS-ADMITTED");
  public static final SubLSymbol $sym16$TVA_INF_TERM_ARGNUMS = makeSymbol("TVA-INF-TERM-ARGNUMS");
  public static final SubLSymbol $sym17$_CSETF_TVA_INF_TERM_ARGNUMS = makeSymbol("_CSETF-TVA-INF-TERM-ARGNUMS");
  public static final SubLSymbol $sym18$TVA_INF_VAR_ARGNUMS = makeSymbol("TVA-INF-VAR-ARGNUMS");
  public static final SubLSymbol $sym19$_CSETF_TVA_INF_VAR_ARGNUMS = makeSymbol("_CSETF-TVA-INF-VAR-ARGNUMS");
  public static final SubLSymbol $sym20$TVA_INF_PRECOMPUTATIONS = makeSymbol("TVA-INF-PRECOMPUTATIONS");
  public static final SubLSymbol $sym21$_CSETF_TVA_INF_PRECOMPUTATIONS = makeSymbol("_CSETF-TVA-INF-PRECOMPUTATIONS");
  public static final SubLSymbol $sym22$TVA_INF_REUSED_SPACES = makeSymbol("TVA-INF-REUSED-SPACES");
  public static final SubLSymbol $sym23$_CSETF_TVA_INF_REUSED_SPACES = makeSymbol("_CSETF-TVA-INF-REUSED-SPACES");
  public static final SubLSymbol $sym24$TVA_INF_ONE_ANSWER_ = makeSymbol("TVA-INF-ONE-ANSWER?");
  public static final SubLSymbol $sym25$_CSETF_TVA_INF_ONE_ANSWER_ = makeSymbol("_CSETF-TVA-INF-ONE-ANSWER?");
  public static final SubLSymbol $sym26$TVA_INF_JUSTIFY_ = makeSymbol("TVA-INF-JUSTIFY?");
  public static final SubLSymbol $sym27$_CSETF_TVA_INF_JUSTIFY_ = makeSymbol("_CSETF-TVA-INF-JUSTIFY?");
  public static final SubLSymbol $sym28$TVA_INF_RESTRICTED_ASSERTION = makeSymbol("TVA-INF-RESTRICTED-ASSERTION");
  public static final SubLSymbol $sym29$_CSETF_TVA_INF_RESTRICTED_ASSERTION = makeSymbol("_CSETF-TVA-INF-RESTRICTED-ASSERTION");
  public static final SubLSymbol $sym30$TVA_INF_ANSWERS = makeSymbol("TVA-INF-ANSWERS");
  public static final SubLSymbol $sym31$_CSETF_TVA_INF_ANSWERS = makeSymbol("_CSETF-TVA-INF-ANSWERS");
  public static final SubLSymbol $kw32$PROBLEM = makeKeyword("PROBLEM");
  public static final SubLSymbol $kw33$ASENT_PRED = makeKeyword("ASENT-PRED");
  public static final SubLSymbol $kw34$ASENT_ARGS = makeKeyword("ASENT-ARGS");
  public static final SubLSymbol $kw35$ARGS_ADMITTED = makeKeyword("ARGS-ADMITTED");
  public static final SubLSymbol $kw36$TERM_ARGNUMS = makeKeyword("TERM-ARGNUMS");
  public static final SubLSymbol $kw37$VAR_ARGNUMS = makeKeyword("VAR-ARGNUMS");
  public static final SubLSymbol $kw38$PRECOMPUTATIONS = makeKeyword("PRECOMPUTATIONS");
  public static final SubLSymbol $kw39$REUSED_SPACES = makeKeyword("REUSED-SPACES");
  public static final SubLSymbol $kw40$ONE_ANSWER_ = makeKeyword("ONE-ANSWER?");
  public static final SubLSymbol $kw41$JUSTIFY_ = makeKeyword("JUSTIFY?");
  public static final SubLSymbol $kw42$RESTRICTED_ASSERTION = makeKeyword("RESTRICTED-ASSERTION");
  public static final SubLSymbol $kw43$ANSWERS = makeKeyword("ANSWERS");
  public static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str45$__ = makeString("#<");
  public static final SubLSymbol $kw46$STREAM = makeKeyword("STREAM");
  public static final SubLSymbol $kw47$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym48$CLET = makeSymbol("CLET");
  public static final SubLList $list49 = list(list(makeSymbol("*TVA-INFERENCE*"), list(makeSymbol("MAKE-TVA-INFERENCE"))));
  public static final SubLSymbol $kw50$FAIL = makeKeyword("FAIL");
  public static final SubLSymbol $kw51$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw52$TVA_MAX_TIME = makeKeyword("TVA-MAX-TIME");
  public static final SubLObject $const53$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym54$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw55$ERROR = makeKeyword("ERROR");
  public static final SubLString $str56$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym57$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw58$CERROR = makeKeyword("CERROR");
  public static final SubLString $str59$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw60$WARN = makeKeyword("WARN");
  public static final SubLString $str61$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLObject $const62$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw63$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw64$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $kw65$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw66$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw67$QUEUE = makeKeyword("QUEUE");
  public static final SubLString $str68$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str69$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw70$IGNORE = makeKeyword("IGNORE");
  public static final SubLList $list71 = cons(makeSymbol("GATHER-ARG-VALUE"), makeSymbol("SUPPORTS"));
  public static final SubLList $list72 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORTS"));
  public static final SubLSymbol $kw73$FOCUSED = makeKeyword("FOCUSED");
  public static final SubLSymbol $sym74$TVA_UNIFY_CLOSURE_ITERATOR_DONE = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-DONE");
  public static final SubLSymbol $sym75$TVA_UNIFY_CLOSURE_ITERATOR_NEXT = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-NEXT");
  public static final SubLSymbol $sym76$TVA_UNIFY_CLOSURE_ITERATOR_FINALIZE = makeSymbol("TVA-UNIFY-CLOSURE-ITERATOR-FINALIZE");
  public static final SubLList $list77 = list(makeSymbol("VAR"), makeSymbol("ARGNUM"));
  public static final SubLList $list78 = list(makeSymbol("ITERATOR"), makeSymbol("TVA-ANSWERS"), makeSymbol("VAR-PRED-DIRECTION"));
  public static final SubLList $list79 = list(makeSymbol("BINDINGS"), makeSymbol("SUPPORT"));
  public static final SubLList $list80 = list(makeSymbol("PRED"), makeSymbol("DIRECTION"));
  public static final SubLSymbol $sym81$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_DONE = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-DONE");
  public static final SubLSymbol $sym82$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_NEXT = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-NEXT");
  public static final SubLSymbol $sym83$TVA_UNIFY_CLOSURE_VAR_BINDINGS_ITERATOR_FINALIZE = makeSymbol("TVA-UNIFY-CLOSURE-VAR-BINDINGS-ITERATOR-FINALIZE");
  public static final SubLList $list84 = list(makeSymbol("VAR"), makeSymbol("ITERATOR"));

  //// Initializers

  public void declareFunctions() {
    declare_tva_inference_file();
  }

  public void initializeVariables() {
    init_tva_inference_file();
  }

  public void runTopLevelForms() {
    setup_tva_inference_file();
  }

}
