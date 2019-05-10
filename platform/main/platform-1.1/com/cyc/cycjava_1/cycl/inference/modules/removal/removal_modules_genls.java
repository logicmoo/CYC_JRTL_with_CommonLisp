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

package  com.cyc.cycjava_1.cycl.inference.modules.removal;

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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.inference.ask_utilities;
import com.cyc.cycjava_1.cycl.backward;
import com.cyc.cycjava_1.cycl.bindings;
import com.cyc.cycjava_1.cycl.cardinality_estimates;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cyc_kernel;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.genls;
import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.kb_accessors;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.mt_relevance_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.unification_utilities;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class removal_modules_genls extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_genls() {}
  public static final SubLFile me = new removal_modules_genls();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genls";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 1549) 
  public static final SubLObject inference_genlP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return makeBoolean(((NIL != inference_trampolines.inference_collectionP(spec, mt))
           && (spec.equal(genl)
            || ((NIL != inference_trampolines.inference_collectionP(genl, mt))
               && (NIL != genls.genlP(spec, genl, mt, tv))))));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2144) 
  public static final SubLObject inference_all_genls(SubLObject spec, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((NIL != inference_trampolines.inference_collectionP(spec, mt))) {
      return genls.all_genls(spec, mt, tv);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2280) 
  public static final SubLObject inference_all_specs(SubLObject genl, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    if ((NIL != inference_trampolines.inference_collectionP(genl, mt))) {
      return genls.all_specs(genl, mt, tv);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2747) 
  private static SubLSymbol $default_superset_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 2890) 
  public static final SubLObject removal_superset_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject spec = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
      SubLObject genl = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      if ((NIL != inference_genlP(spec, genl, UNPROVIDED, UNPROVIDED))) {
        backward.removal_add_node(arguments.make_hl_support($kw10$GENLS, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
      }
    }
    return NIL;
  }

  public static final class $removal_superset_expand$UnaryFunction extends UnaryFunction {
    public $removal_superset_expand$UnaryFunction() { super(extractFunctionNamed("REMOVAL-SUPERSET-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return removal_superset_expand(arg1, UNPROVIDED); }
  }

  public static final class $removal_superset_expand$BinaryFunction extends BinaryFunction {
    public $removal_superset_expand$BinaryFunction() { super(extractFunctionNamed("REMOVAL-SUPERSET-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_superset_expand(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4120) 
  public static final SubLObject removal_all_genls_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return cardinality_estimates.genl_cardinality(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED));
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 4325) 
  public static final SubLObject removal_all_genls_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject subset = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject collections = inference_all_genls(subset, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = collections;
        SubLObject collection = NIL;
        for (collection = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collection = cdolist_list_var.first()) {
          thread.resetMultipleValues();
          {
            SubLObject v_bindings = unification_utilities.term_unify(arg2, collection, T, T);
            SubLObject unify_justification = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != v_bindings)) {
              {
                SubLObject unify_arg2 = bindings.subst_bindings(v_bindings, arg2);
                SubLObject formula = list($const0$genls, subset, unify_arg2);
                backward.removal_add_node(arguments.make_hl_support($kw10$GENLS, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5235) 
  private static SubLSymbol $default_nat_all_genls_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 5981) 
  public static final SubLObject removal_all_specs_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      return Numbers.max(cardinality_estimates.spec_cardinality(collection), kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $const0$genls));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6309) 
  private static SubLSymbol $all_specs_lazy_iteration_threshold$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 6467) 
  public static final SubLObject removal_all_specs_iterator(SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (cardinality_estimates.spec_cardinality(collection).numG($all_specs_lazy_iteration_threshold$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 287");
      }
      return iteration.new_list_iterator(inference_all_specs(collection, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 7625) 
  private static SubLSymbol $default_not_superset_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 9554) 
  public static final SubLObject removal_genls_between_applicability(SubLObject contextualized_dnf_clause) {
    return removal_sbhl_between_applicability(contextualized_dnf_clause, $const0$genls);
  }

  public static final class $removal_genls_between_applicability$UnaryFunction extends UnaryFunction {
    public $removal_genls_between_applicability$UnaryFunction() { super(extractFunctionNamed("REMOVAL-GENLS-BETWEEN-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return removal_genls_between_applicability(arg1); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 12281) 
  public static final SubLObject removal_sbhl_between_applicability(SubLObject contextualized_dnf_clause, SubLObject predicate) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject subclause_specs = NIL;
        thread.resetMultipleValues();
        {
          SubLObject pos_pred_indices_var_arg1 = find_pos_pred_indices_for_pred_between(contextualized_dnf_clause, predicate);
          SubLObject pos_pred_indices_var_arg2 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          if (((NIL != pos_pred_indices_var_arg1)
               && (NIL != pos_pred_indices_var_arg2))) {
            {
              SubLObject var2_index = dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
              {
                SubLObject cdolist_list_var = pos_pred_indices_var_arg2;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
                  {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject index = NIL;
                    SubLObject variable = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                    index = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                    variable = current.first();
                    current = current.rest();
                    if ((NIL == current)) {
                      dictionary_utilities.dictionary_push(var2_index, variable, index);
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                    }
                  }
                }
              }
              {
                SubLObject cdolist_list_var = pos_pred_indices_var_arg1;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), pair = cdolist_list_var.first()) {
                  {
                    SubLObject datum = pair;
                    SubLObject current = datum;
                    SubLObject index = NIL;
                    SubLObject variable = NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                    index = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
                    variable = current.first();
                    current = current.rest();
                    if ((NIL == current)) {
                      {
                        SubLObject paired_indices = dictionary.dictionary_lookup(var2_index, variable, UNPROVIDED);
                        SubLObject cdolist_list_var_5 = paired_indices;
                        SubLObject paired_index = NIL;
                        for (paired_index = cdolist_list_var_5.first(); (NIL != cdolist_list_var_5); cdolist_list_var_5 = cdolist_list_var_5.rest(), paired_index = cdolist_list_var_5.first()) {
                          {
                            SubLObject subclause_spec = clause_utilities.new_subclause_spec(NIL, list(index, paired_index));
                            subclause_specs = cons(subclause_spec, subclause_specs);
                          }
                        }
                      }
                    } else {
                      cdestructuring_bind.cdestructuring_bind_error(datum, $list36);
                    }
                  }
                }
              }
            }
          }
        }
        return Sequences.nreverse(subclause_specs);
      }
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-genls.lisp", position = 13549) 
  public static final SubLObject find_pos_pred_indices_for_pred_between(SubLObject contextualized_dnf_clause, SubLObject predicate) {
    {
      SubLObject pos_pred_indices_var_arg1 = NIL;
      SubLObject pos_pred_indices_var_arg2 = NIL;
      SubLObject index = ZERO_INTEGER;
      SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
      SubLObject contextualized_asent = NIL;
      for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
        {
          SubLObject datum = contextualized_asent;
          SubLObject current = datum;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list28);
          asent = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate))) {
              {
                SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
                SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
                if (((NIL != variables.variable_p(arg1))
                     && (NIL != forts.fort_p(arg2)))) {
                  pos_pred_indices_var_arg1 = cons(list(index, arg1), pos_pred_indices_var_arg1);
                } else if (((NIL != forts.fort_p(arg1))
                     && (NIL != variables.variable_p(arg2)))) {
                  pos_pred_indices_var_arg2 = cons(list(index, arg2), pos_pred_indices_var_arg2);
                }
              }
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list28);
          }
        }
        index = Numbers.add(index, ONE_INTEGER);
      }
      pos_pred_indices_var_arg1 = Sequences.nreverse(pos_pred_indices_var_arg1);
      pos_pred_indices_var_arg2 = Sequences.nreverse(pos_pred_indices_var_arg2);
      return Values.values(pos_pred_indices_var_arg1, pos_pred_indices_var_arg2);
    }
  }

  public static final SubLObject declare_removal_modules_genls_file() {
    declareFunction(myName, "inference_genlP", "INFERENCE-GENL?", 2, 2, false);
    declareFunction(myName, "inference_not_genlP", "INFERENCE-NOT-GENL?", 2, 2, false);
    declareFunction(myName, "inference_all_genls", "INFERENCE-ALL-GENLS", 1, 2, false);
    declareFunction(myName, "inference_all_specs", "INFERENCE-ALL-SPECS", 1, 2, false);
    declareFunction(myName, "inference_genls_between", "INFERENCE-GENLS-BETWEEN", 2, 1, false);
    declareFunction(myName, "removal_superset_expand", "REMOVAL-SUPERSET-EXPAND", 1, 1, false); new $removal_superset_expand$UnaryFunction(); new $removal_superset_expand$BinaryFunction();
    declareFunction(myName, "removal_nat_genls_expand", "REMOVAL-NAT-GENLS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_genls_cost", "REMOVAL-ALL-GENLS-COST", 1, 1, false);
    declareFunction(myName, "removal_all_genls_expand", "REMOVAL-ALL-GENLS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_nat_all_genls_expand", "REMOVAL-NAT-ALL-GENLS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_specs_cost", "REMOVAL-ALL-SPECS-COST", 1, 1, false);
    declareFunction(myName, "removal_all_specs_iterator", "REMOVAL-ALL-SPECS-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_not_superset_expand", "REMOVAL-NOT-SUPERSET-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_genls_between_applicability", "REMOVAL-GENLS-BETWEEN-APPLICABILITY", 1, 0, false); new $removal_genls_between_applicability$UnaryFunction();
    declareFunction(myName, "removal_genls_between_cost", "REMOVAL-GENLS-BETWEEN-COST", 1, 0, false);
    declareFunction(myName, "removal_genls_between_completeness", "REMOVAL-GENLS-BETWEEN-COMPLETENESS", 0, 0, false);
    declareFunction(myName, "removal_genls_between_expand", "REMOVAL-GENLS-BETWEEN-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_sbhl_between_applicability", "REMOVAL-SBHL-BETWEEN-APPLICABILITY", 2, 0, false);
    declareFunction(myName, "find_pos_pred_indices_for_pred_between", "FIND-POS-PRED-INDICES-FOR-PRED-BETWEEN", 2, 0, false);
    declareFunction(myName, "removal_genls_between_categorize_asents", "REMOVAL-GENLS-BETWEEN-CATEGORIZE-ASENTS", 2, 0, false);
    declareFunction(myName, "removal_genls_collection_subset_check_pos_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_genls_collection_subset_check_neg_expand", "REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_genls_collection_subset_construct_query", "REMOVAL-GENLS-COLLECTION-SUBSET-CONSTRUCT-QUERY", 1, 0, false);
    declareFunction(myName, "removal_genls_down_arg2_bound_cost", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COST", 1, 1, false);
    declareFunction(myName, "removal_genls_down_arg2_bound_completeness", "REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_genls_down_arg2_bound_expand", "REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND", 1, 1, false);
    declareFunction(myName, "destructure_genls_down_asent", "DESTRUCTURE-GENLS-DOWN-ASENT", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_genls_file() {
    $default_superset_cost$ = defparameter("*DEFAULT-SUPERSET-COST*", control_vars.$hl_module_check_cost$.getDynamicValue());
    $default_nat_all_genls_cost$ = defparameter("*DEFAULT-NAT-ALL-GENLS-COST*", control_vars.$average_all_genls_count$.getDynamicValue());
    $all_specs_lazy_iteration_threshold$ = defparameter("*ALL-SPECS-LAZY-ITERATION-THRESHOLD*", $int19$550);
    $default_not_superset_cost$ = defparameter("*DEFAULT-NOT-SUPERSET-COST*", ONE_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_genls_file() {
    // CVS_ID("Id: removal-modules-genls.lisp 128095 2009-06-22 21:35:57Z pace ");
    inference_modules.register_solely_specific_removal_module_predicate($const0$genls);
    inference_modules.inference_removal_module_use_generic($const0$genls, $kw1$REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
    preference_modules.inference_preference_module($kw2$GENLS_X_Y_POS, $list3);
    preference_modules.inference_preference_module($kw4$ALL_SPECS_OF_FORT_POS, $list5);
    preference_modules.inference_preference_module($kw6$ALL_SPECS_OF_NON_FORT_POS, $list7);
    preference_modules.inference_preference_module($kw8$ALL_GENLS_POS, $list9);
    inference_modules.inference_removal_module($kw11$REMOVAL_SUPERSET, $list12);
    inference_modules.inference_removal_module($kw13$REMOVAL_NAT_GENLS, $list14);
    inference_modules.inference_removal_module($kw15$REMOVAL_ALL_GENLS, $list16);
    inference_modules.inference_removal_module($kw17$REMOVAL_NAT_ALL_GENLS, $list18);
    inference_modules.inference_removal_module($kw20$REMOVAL_ALL_SPECS, $list21);
    inference_modules.inference_removal_module($kw23$REMOVAL_NOT_SUPERSET, $list24);
    inference_modules.inference_conjunctive_removal_module($kw25$REMOVAL_GENLS_BETWEEN, $list26);
    utilities_macros.note_funcall_helper_function($sym32$REMOVAL_GENLS_BETWEEN_COMPLETENESS);
    inference_modules.inference_removal_module($kw37$REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK, $list38);
    inference_modules.inference_removal_module($kw39$REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK, $list40);
    inference_modules.register_solely_specific_removal_module_predicate($const45$genlsDown);
    inference_modules.inference_removal_module($kw46$REMOVAL_GENLS_DOWN_ARG2_BOUND, $list47);
    utilities_macros.note_funcall_helper_function($sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST);
    utilities_macros.note_funcall_helper_function($sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS);
    utilities_macros.note_funcall_helper_function($sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND);
    inference_modules.inference_removal_module($kw54$REMOVAL_GENLS_DOWN_ARG2_UNIFY, $list55);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $kw1$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
  public static final SubLSymbol $kw2$GENLS_X_Y_POS = makeKeyword("GENLS-X-Y-POS");
  public static final SubLList $list3 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
  public static final SubLSymbol $kw4$ALL_SPECS_OF_FORT_POS = makeKeyword("ALL-SPECS-OF-FORT-POS");
  public static final SubLList $list5 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
  public static final SubLSymbol $kw6$ALL_SPECS_OF_NON_FORT_POS = makeKeyword("ALL-SPECS-OF-NON-FORT-POS");
  public static final SubLList $list7 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NOT"), makeKeyword("FORT")))), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
  public static final SubLSymbol $kw8$ALL_GENLS_POS = makeKeyword("ALL-GENLS-POS");
  public static final SubLList $list9 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
  public static final SubLSymbol $kw10$GENLS = makeKeyword("GENLS");
  public static final SubLSymbol $kw11$REMOVAL_SUPERSET = makeKeyword("REMOVAL-SUPERSET");
  public static final SubLList $list12 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog #$Animal)")});
  public static final SubLSymbol $kw13$REMOVAL_NAT_GENLS = makeKeyword("REMOVAL-NAT-GENLS");
  public static final SubLList $list14 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) #$Animal)")});
  public static final SubLSymbol $kw15$REMOVAL_ALL_GENLS = makeKeyword("REMOVAL-ALL-GENLS");
  public static final SubLList $list16 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-GENLS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genls #$Dog ?WHAT)")});
  public static final SubLSymbol $kw17$REMOVAL_NAT_ALL_GENLS = makeKeyword("REMOVAL-NAT-ALL-GENLS");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-NAT-ALL-GENLS-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-GENLS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (<fully-bound> . <fully-bound>) <not fully-bound>)\n    via #$resultGenl and #$resultGenlArg"), makeKeyword("EXAMPLE"), makeString("(#$genls (#$JuvenileFn #$Cougar) ?WHAT)")});
  public static final SubLInteger $int19$550 = makeInteger(550);
  public static final SubLSymbol $kw20$REMOVAL_ALL_SPECS = makeKeyword("REMOVAL-ALL-SPECS");
  public static final SubLList $list21 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-SPECS-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-SPECS-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("GENLS"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$genls <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$genls ?WHAT #$Animal)")});
  public static final SubLSymbol $kw22$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLSymbol $kw23$REMOVAL_NOT_SUPERSET = makeKeyword("REMOVAL-NOT-SUPERSET");
  public static final SubLList $list24 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), list(makeKeyword("OR"), makeKeyword("FORT"), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), list(makeSymbol("FIF"), makeSymbol("*NEGATION-BY-FAILURE*"), makeSymbol("*DEFAULT-SUPERSET-COST*"), makeSymbol("*DEFAULT-NOT-SUPERSET-COST*")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-SUPERSET-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls <fort> <fully-bound>))\n    (#$not (#$genls (<fully-bound> . <fully-bound>) <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$genls #$Collection #$Individual))\n    (#$not (#$genls (#$JuvenileFn #$Cougar) #$Individual))")});
  public static final SubLSymbol $kw25$REMOVAL_GENLS_BETWEEN = makeKeyword("REMOVAL-GENLS-BETWEEN");
  public static final SubLList $list26 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), list(constant_handles.reader_make_constant_shell(makeString("genls"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-GENLS-BETWEEN-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-GENLS-BETWEEN-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-BETWEEN-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$genls <fort1> <varN>)\n           (#$genls <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$genls #$Dog ?COL)\n           (#$genls ?COL #$Animal))")});
  public static final SubLSymbol $sym27$BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");
  public static final SubLList $list28 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym29$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $kw30$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLSymbol $kw31$INCOMPLETE = makeKeyword("INCOMPLETE");
  public static final SubLSymbol $sym32$REMOVAL_GENLS_BETWEEN_COMPLETENESS = makeSymbol("REMOVAL-GENLS-BETWEEN-COMPLETENESS");
  public static final SubLList $list33 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));
  public static final SubLList $list34 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
  public static final SubLList $list35 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
  public static final SubLList $list36 = list(makeSymbol("INDEX"), makeSymbol("VARIABLE"));
  public static final SubLSymbol $kw37$REMOVAL_GENLS_COLLECTION_SUBSET_FN_POS_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-POS-CHECK");
  public static final SubLList $list38 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>))")});
  public static final SubLSymbol $kw39$REMOVAL_GENLS_COLLECTION_SUBSET_FN_NEG_CHECK = makeKeyword("REMOVAL-GENLS-COLLECTION-SUBSET-FN-NEG-CHECK");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genls")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genls")), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND"))), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-COLLECTION-SUBSET-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$genls (#$CollectionSubsetFn . <fully-bound>) (#$CollectionSubsetFn . <fully-bound>)))")});
  public static final SubLSymbol $kw41$QUERY = makeKeyword("QUERY");
  public static final SubLObject $const42$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLObject $const43$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLObject $const44$subsetOf = constant_handles.reader_make_constant_shell(makeString("subsetOf"));
  public static final SubLObject $const45$genlsDown = constant_handles.reader_make_constant_shell(makeString("genlsDown"));
  public static final SubLSymbol $kw46$REMOVAL_GENLS_DOWN_ARG2_BOUND = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-BOUND");
  public static final SubLList $list47 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlsDown")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlsDown")), makeKeyword("ANYTHING"), makeKeyword("FULLY-BOUND")), makeKeyword("COST"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("EXPAND"), makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <fully-bound>)\n(#$genlsDown <not-fully-bound> <fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog #$Animal)\n(#$genlsDown ?WHAT #$Dog)")});
  public static final SubLSymbol $kw48$POS = makeKeyword("POS");
  public static final SubLSymbol $sym49$REMOVAL_GENLS_DOWN_ARG2_BOUND_COST = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COST");
  public static final SubLSymbol $sym50$REMOVAL_GENLS_DOWN_ARG2_BOUND_COMPLETENESS = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-COMPLETENESS");
  public static final SubLSymbol $kw51$TRUE_DEF = makeKeyword("TRUE-DEF");
  public static final SubLSymbol $sym52$REMOVAL_GENLS_DOWN_ARG2_BOUND_EXPAND = makeSymbol("REMOVAL-GENLS-DOWN-ARG2-BOUND-EXPAND");
  public static final SubLList $list53 = list(makeSymbol("GENLS-DOWN"), makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLSymbol $kw54$REMOVAL_GENLS_DOWN_ARG2_UNIFY = makeKeyword("REMOVAL-GENLS-DOWN-ARG2-UNIFY");
  public static final SubLList $list55 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("genlsDown")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("genlsDown")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), ONE_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("genlsDown")), list(makeKeyword("BIND"), makeSymbol("TERM")), makeKeyword("ANYTHING")), list(makeKeyword("VALUE"), makeSymbol("TERM"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(list(constant_handles.reader_make_constant_shell(makeString("genlsDown")), makeKeyword("INPUT"), makeKeyword("INPUT"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("REFLEXIVE"), makeKeyword("DOCUMENTATION"), makeString("(#$genlsDown <fully-bound> <not-fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$genlsDown #$Dog ?WHAT)")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_genls_file();
  }

  public void initializeVariables() {
    init_removal_modules_genls_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_genls_file();
  }

}
