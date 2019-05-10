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

package com.cyc.cycjava_1.cycl.inference.modules.removal;
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
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.inference.ask_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.bindings;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cyc_kernel;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_grammar;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_enumerated_types;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_worker_removal;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_genls;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_lookup;
//dm import com.cyc.cycjava_1.cycl.simplifier;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_isa extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_isa() {}
  public static final SubLFile me = new removal_modules_isa();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_isa";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 2373) 
  public static final SubLObject all_instances_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    {
      SubLObject col = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      if (((NIL != cycl_grammar.cycl_nat_p(col))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32825")))) {
        return $kw14$PREFERRED;
      } else if ((NIL != fort_types_interface.collection_p(col))) {
        return preference_modules.completeness_to_preference_level(inference_collection_iteration_completeness(col));
      } else {
        return $kw15$GROSSLY_DISPREFERRED;
      }
    }
  }

  /** Slightly favor SBHL isa checking for forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3553) 
  private static SubLSymbol $isa_fort_collection_cost$ = null;

  /** Do not favor SBHL isa checking for non-forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3846) 
  private static SubLSymbol $isa_non_fort_collection_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 3986) 
  public static final SubLObject removal_isa_collection_check_pos_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != forts.fort_p(cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED)))) {
      return $isa_fort_collection_cost$.getGlobalValue();
    } else {
      return $isa_non_fort_collection_cost$.getGlobalValue();
    }
  }

  public static final class $removal_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_isa_collection_check_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_isa_collection_check_pos_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_isa_collection_check_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-ISA-COLLECTION-CHECK-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_isa_collection_check_pos_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 4364) 
  public static final SubLObject removal_isa_collection_check_pos_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_isa_collection_check_expand(asent);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 5465) 
  public static final SubLObject removal_isa_collection_check_expand(SubLObject asent) {
    {
      SubLObject object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
      SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      if ((!(function_terms.term_functional_complexity(object).numGE($int25$30)))) {
        if ((NIL != isa.isaP(object, collection, UNPROVIDED, UNPROVIDED))) {
          backward.removal_add_node(arguments.make_hl_support($kw26$ISA, asent, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 5855) 
  private static SubLSymbol $default_not_isa_collection_check_cost$ = null;

  /** Do not favor defn checking for forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8362) 
  private static SubLSymbol $isa_fort_defn_cost$ = null;

  /** Slightly favor defn checking for non-forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 8585) 
  private static SubLSymbol $isa_non_fort_defn_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 11711) 
  public static final SubLObject removal_all_isa_expand(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
        SubLObject object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        SubLObject collections = isa.all_isa(object, UNPROVIDED, UNPROVIDED);
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
                SubLObject unified_arg2 = bindings.subst_bindings(v_bindings, arg2);
                SubLObject formula = el_utilities.make_binary_formula(predicate, object, unified_arg2);
                backward.removal_add_node(arguments.make_hl_support($kw26$ISA, formula, UNPROVIDED, UNPROVIDED), v_bindings, unify_justification);
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12381) 
  public static final SubLObject removal_all_instances_cost(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject collection = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
      return inference_all_instances_cost(collection);
    }
  }

  public static final class $removal_all_instances_cost$UnaryFunction extends UnaryFunction {
    public $removal_all_instances_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST")); }
    public SubLObject processItem(SubLObject arg1) { return removal_all_instances_cost(arg1, UNPROVIDED); }
  }

  public static final class $removal_all_instances_cost$BinaryFunction extends BinaryFunction {
    public $removal_all_instances_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_all_instances_cost(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12651) 
  public static final SubLObject removal_all_instances_completeness(SubLObject asent) {
    return inference_collection_iteration_completeness(cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED));
  }

  public static final class $removal_all_instances_completeness$UnaryFunction extends UnaryFunction {
    public $removal_all_instances_completeness$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ALL-INSTANCES-COMPLETENESS")); }
    public SubLObject processItem(SubLObject arg1) { return removal_all_instances_completeness(arg1); }
  }

  /** @return completeness-p ; the inferential completness of iterating over all instances of COLLECTION. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 12796) 
  public static final SubLObject inference_collection_iteration_completeness(SubLObject collection) {
    if ((NIL == forts.fort_p(collection))) {
      return $kw46$GROSSLY_INCOMPLETE;
    } else if (((NIL != at_defns.any_sufficient_defn_anywhereP(collection))
        || (NIL != at_defns.any_sufficient_quoted_defn_anywhereP(collection)))) {
      return $kw46$GROSSLY_INCOMPLETE;
    } else if ((NIL != kb_accessors.completely_enumerable_collectionP(collection, UNPROVIDED))) {
      return $kw47$COMPLETE;
    } else {
      return $kw46$GROSSLY_INCOMPLETE;
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13336) 
  private static SubLSymbol $all_instances_lazy_iteration_threshold$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 13503) 
  public static final SubLObject removal_all_instances_iterator(SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (cardinality_estimates.instance_cardinality(collection).numG($all_instances_lazy_iteration_threshold$.getDynamicValue(thread))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 288");
      }
      return iteration.new_list_iterator(isa.all_instances(collection, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 14527) 
  public static final SubLObject inference_all_instances_cost(SubLObject collection) {
    {
      SubLObject instance_iteration_cost = cardinality_estimates.instance_iteration_cost(collection);
      return (instance_iteration_cost.isZero() ? ((SubLObject) kb_indexing.relevant_num_gaf_arg_index(collection, TWO_INTEGER, $const0$isa)) : instance_iteration_cost);
    }
  }

  public static final class $removal_elementof_check_expand$UnaryFunction extends UnaryFunction {
    public $removal_elementof_check_expand$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32804"); }
  }

  public static final class $removal_elementof_check_expand$BinaryFunction extends BinaryFunction {
    public $removal_elementof_check_expand$BinaryFunction() { super(extractFunctionNamed("REMOVAL-ELEMENTOF-CHECK-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32805"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 42895) 
  private static SubLSymbol $subcollection_functors$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 53932) 
  public static final SubLObject removal_all_isa_of_type_applicability(SubLObject contextualized_dnf_clause) {
    return removal_modules_genls.removal_sbhl_between_applicability(contextualized_dnf_clause, $const0$isa);
  }

  public static final class $removal_all_isa_of_type_applicability$UnaryFunction extends UnaryFunction {
    public $removal_all_isa_of_type_applicability$UnaryFunction() { super(extractFunctionNamed("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return removal_all_isa_of_type_applicability(arg1); }
  }

  /** Slightly favor SBHL quoted isa checking for forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 58350) 
  private static SubLSymbol $quoted_isa_fort_collection_cost$ = null;

  /** Do not favor SBHL quoted isa checking for non-forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 58728) 
  private static SubLSymbol $quoted_isa_non_fort_collection_cost$ = null;

  public static final class $removal_quoted_isa_collection_check_pos_cost$UnaryFunction extends UnaryFunction {
    public $removal_quoted_isa_collection_check_pos_cost$UnaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32818"); }
  }

  public static final class $removal_quoted_isa_collection_check_pos_cost$BinaryFunction extends BinaryFunction {
    public $removal_quoted_isa_collection_check_pos_cost$BinaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32819"); }
  }

  public static final class $removal_quoted_isa_collection_check_pos_expand$UnaryFunction extends UnaryFunction {
    public $removal_quoted_isa_collection_check_pos_expand$UnaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32820"); }
  }

  public static final class $removal_quoted_isa_collection_check_pos_expand$BinaryFunction extends BinaryFunction {
    public $removal_quoted_isa_collection_check_pos_expand$BinaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32821"); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 60701) 
  private static SubLSymbol $default_not_quoted_isa_collection_check_cost$ = null;

  /** Do not favor quoted defn checking for forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61539) 
  private static SubLSymbol $quoted_isa_fort_defn_cost$ = null;

  /** Slightly favor quoted defn checking for non-forts. */
  @SubL(source = "cycl/inference/modules/removal/removal-modules-isa.lisp", position = 61776) 
  private static SubLSymbol $quoted_isa_non_fort_defn_cost$ = null;

  public static final class $removal_quoted_isa_defn_pos_required$UnaryFunction extends UnaryFunction {
    public $removal_quoted_isa_defn_pos_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32823"); }
  }

  public static final class $removal_quoted_isa_defn_pos_required$BinaryFunction extends BinaryFunction {
    public $removal_quoted_isa_defn_pos_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32824"); }
  }

  public static final SubLObject declare_removal_modules_isa_file() {
    declareFunction(myName, "all_instances_pos_preference", "ALL-INSTANCES-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "inference_all_isas_of_type", "INFERENCE-ALL-ISAS-OF-TYPE", 2, 1, false);
    declareFunction(myName, "removal_isa_collection_check_pos_cost", "REMOVAL-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false); new $removal_isa_collection_check_pos_cost$UnaryFunction(); new $removal_isa_collection_check_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_isa_collection_check_neg_cost", "REMOVAL-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_collection_check_pos_expand", "REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_collection_check_neg_expand", "REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_collection_check_expand", "REMOVAL-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_not_isa_collection_check_cost", "REMOVAL-NOT-ISA-COLLECTION-CHECK-COST", 1, 0, false);
    declareFunction(myName, "removal_not_isa_collection_check_expand", "REMOVAL-NOT-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_isa_naut_collection_check_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_naut_collection_check_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_naut_collection_lookup_pos_cost", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_naut_collection_lookup_pos_expand", "REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_pos_cost", "REMOVAL-ISA-DEFN-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_neg_cost", "REMOVAL-ISA-DEFN-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_pos_expand", "REMOVAL-ISA-DEFN-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_neg_expand", "REMOVAL-ISA-DEFN-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_pos_required", "REMOVAL-ISA-DEFN-POS-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_isa_defn_check_expand", "REMOVAL-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_isa_defn_reject_expand", "REMOVAL-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_all_isa_expand", "REMOVAL-ALL-ISA-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_instances_cost", "REMOVAL-ALL-INSTANCES-COST", 1, 1, false); new $removal_all_instances_cost$UnaryFunction(); new $removal_all_instances_cost$BinaryFunction();
    declareFunction(myName, "removal_all_instances_completeness", "REMOVAL-ALL-INSTANCES-COMPLETENESS", 1, 0, false); new $removal_all_instances_completeness$UnaryFunction();
    declareFunction(myName, "inference_collection_iteration_completeness", "INFERENCE-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_all_instances_iterator", "REMOVAL-ALL-INSTANCES-ITERATOR", 1, 0, false);
    declareFunction(myName, "inference_all_instances_cost", "INFERENCE-ALL-INSTANCES-COST", 1, 0, false);
    declareFunction(myName, "removal_elementof_check_expand", "REMOVAL-ELEMENTOF-CHECK-EXPAND", 1, 1, false); new $removal_elementof_check_expand$UnaryFunction(); new $removal_elementof_check_expand$BinaryFunction();
    declareFunction(myName, "removal_not_elementof_check_expand", "REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_elementof_collection_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_elementof_collection_defn_check_expand", "REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_elementof_set_check_iterator", "REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_not_elementof_collection_check_cost", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST", 1, 1, false);
    declareFunction(myName, "removal_not_elementof_collection_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_not_elementof_collection_defn_check_expand", "REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_not_elementof_set_check_cost", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST", 1, 1, false);
    declareFunction(myName, "removal_not_elementof_set_check_completeness", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_not_elementof_set_check_iterator", "REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_elementof_thesetof_check_expand", "REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "inference_elementof_thesetof_check", "INFERENCE-ELEMENTOF-THESETOF-CHECK", 2, 1, false);
    declareFunction(myName, "removal_isa_thecollectionof_check_expand", "REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_not_elementof_thesetof_check_expand", "REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_not_isa_thecollectionof_check_expand", "REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_elementof_expand", "REMOVAL-ALL-ELEMENTOF-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_nat_all_elementof_expand", "REMOVAL-NAT-ALL-ELEMENTOF-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_elementof_unify_cost", "REMOVAL-ELEMENTOF-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_elementof_unify_expand", "REMOVAL-ELEMENTOF-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_elementof_collection_unify_cost", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_elementof_collection_unify_completeness", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_elementof_collection_unify_iterator", "REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_elementof_set_unify_cost", "REMOVAL-ELEMENTOF-SET-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_elementof_set_unify_iterator", "REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR", 1, 0, false);
    declareFunction(myName, "removal_elementof_thesetof_unify_cost", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_elementof_thesetof_unify_cost_smart", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST-SMART", 2, 0, false);
    declareFunction(myName, "removal_elementof_thesetof_unify_expand", "REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_thecollectionof_unify_cost", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_thecollectionof_unify_expand", "REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_collection_subset_fn_cost", "REMOVAL-COLLECTION-SUBSET-FN-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_subcollection_cost", "REMOVAL-ISA-SUBCOLLECTION-COST", 1, 1, false);
    declareFunction(myName, "removal_isa_subcollection_unify_expand", "REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_isa_subcollection_construct_query", "REMOVAL-ISA-SUBCOLLECTION-CONSTRUCT-QUERY", 2, 0, false);
    declareFunction(myName, "subcollection_functor_p", "SUBCOLLECTION-FUNCTOR-P", 1, 0, false);
    declareFunction(myName, "removal_all_isa_of_type_completeness", "REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS", 4, 0, false);
    declareFunction(myName, "removal_all_isa_of_type_applicability", "REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY", 1, 0, false); new $removal_all_isa_of_type_applicability$UnaryFunction();
    declareFunction(myName, "removal_all_isa_of_type_cost", "REMOVAL-ALL-ISA-OF-TYPE-COST", 1, 0, false);
    declareFunction(myName, "removal_all_isa_of_type_expand", "REMOVAL-ALL-ISA-OF-TYPE-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_all_isa_of_type_categorize_asents", "REMOVAL-ALL-ISA-OF-TYPE-CATEGORIZE-ASENTS", 2, 0, false);
    declareFunction(myName, "all_quoted_instances_pos_preference", "ALL-QUOTED-INSTANCES-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "removal_quoted_isa_collection_check_pos_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST", 1, 1, false); new $removal_quoted_isa_collection_check_pos_cost$UnaryFunction(); new $removal_quoted_isa_collection_check_pos_cost$BinaryFunction();
    declareFunction(myName, "removal_quoted_isa_collection_check_neg_cost", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_collection_check_pos_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND", 1, 1, false); new $removal_quoted_isa_collection_check_pos_expand$UnaryFunction(); new $removal_quoted_isa_collection_check_pos_expand$BinaryFunction();
    declareFunction(myName, "removal_quoted_isa_collection_check_neg_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_collection_check_expand", "REMOVAL-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_not_quoted_isa_collection_check_cost", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-COST", 1, 0, false);
    declareFunction(myName, "removal_not_quoted_isa_collection_check_expand", "REMOVAL-NOT-QUOTED-ISA-COLLECTION-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_quoted_isa_defn_pos_cost", "REMOVAL-QUOTED-ISA-DEFN-POS-COST", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_defn_neg_cost", "REMOVAL-QUOTED-ISA-DEFN-NEG-COST", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_defn_pos_expand", "REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_defn_neg_expand", "REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_quoted_isa_defn_pos_required", "REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED", 1, 1, false); new $removal_quoted_isa_defn_pos_required$UnaryFunction(); new $removal_quoted_isa_defn_pos_required$BinaryFunction();
    declareFunction(myName, "removal_quoted_isa_defn_check_expand", "REMOVAL-QUOTED-ISA-DEFN-CHECK-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_quoted_isa_defn_reject_expand", "REMOVAL-QUOTED-ISA-DEFN-REJECT-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_nat_quoted_isa_expand", "REMOVAL-NAT-QUOTED-ISA-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_quoted_isa_expand", "REMOVAL-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_fort_all_quoted_isa_expand", "REMOVAL-FORT-ALL-QUOTED-ISA-EXPAND", 1, 0, false);
    declareFunction(myName, "removal_nat_all_quoted_isa_expand", "REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_all_quoted_instances_cost", "REMOVAL-ALL-QUOTED-INSTANCES-COST", 1, 1, false);
    declareFunction(myName, "removal_all_quoted_instances_completeness", "REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "inference_quoted_collection_iteration_completeness", "INFERENCE-QUOTED-COLLECTION-ITERATION-COMPLETENESS", 1, 0, false);
    declareFunction(myName, "removal_all_quoted_instances_iterator", "REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR", 1, 0, false);
    declareFunction(myName, "inference_all_quoted_instances_cost", "INFERENCE-ALL-QUOTED-INSTANCES-COST", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_isa_file() {
    $isa_fort_collection_cost$ = deflexical("*ISA-FORT-COLLECTION-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float20$0_1));
    $isa_non_fort_collection_cost$ = deflexical("*ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
    $default_not_isa_collection_check_cost$ = defparameter("*DEFAULT-NOT-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
    $isa_fort_defn_cost$ = deflexical("*ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
    $isa_non_fort_defn_cost$ = deflexical("*ISA-NON-FORT-DEFN-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float20$0_1));
    $all_instances_lazy_iteration_threshold$ = defparameter("*ALL-INSTANCES-LAZY-ITERATION-THRESHOLD*", $int48$2300);
    $subcollection_functors$ = deflexical("*SUBCOLLECTION-FUNCTORS*", $list104);
    $quoted_isa_fort_collection_cost$ = deflexical("*QUOTED-ISA-FORT-COLLECTION-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float20$0_1));
    $quoted_isa_non_fort_collection_cost$ = deflexical("*QUOTED-ISA-NON-FORT-COLLECTION-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
    $default_not_quoted_isa_collection_check_cost$ = defparameter("*DEFAULT-NOT-QUOTED-ISA-COLLECTION-CHECK-COST*", ONE_INTEGER);
    $quoted_isa_fort_defn_cost$ = deflexical("*QUOTED-ISA-FORT-DEFN-COST*", control_vars.$cheap_hl_module_check_cost$.getGlobalValue());
    $quoted_isa_non_fort_defn_cost$ = deflexical("*QUOTED-ISA-NON-FORT-DEFN-COST*", Numbers.subtract(control_vars.$cheap_hl_module_check_cost$.getGlobalValue(), $float20$0_1));
    return NIL;
  }

  public static final SubLObject setup_removal_modules_isa_file() {
    // CVS_ID("Id: removal-modules-isa.lisp 128475 2009-08-04 16:03:42Z pace ");
    inference_modules.register_solely_specific_removal_module_predicate($const0$isa);
    inference_modules.inference_removal_module_use_meta_removal($const0$isa, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
    inference_modules.inference_removal_module_use_meta_removal($const0$isa, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw4$REMOVAL_ABDUCTION_POS_CHECK);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw5$REMOVAL_ABDUCTION_POS_UNIFY);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw6$REMOVAL_RELATION_ALL_EXISTS_CHECK);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw7$REMOVAL_RELATION_ALL_EXISTS_UNIFY);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw8$REMOVAL_RELATION_EXISTS_ALL_CHECK);
    inference_modules.inference_removal_module_use_generic($const0$isa, $kw9$REMOVAL_BACKCHAIN_REQUIRED_PRUNE);
    preference_modules.inference_preference_module($kw10$ISA_X_Y_POS, $list11);
    preference_modules.inference_preference_module($kw12$ALL_INSTANCES_POS, $list13);
    preference_modules.inference_preference_module($kw16$ALL_ISA_POS, $list17);
    preference_modules.inference_preference_module($kw18$ALL_ELEMENTOF_POS, $list19);
    inference_modules.inference_removal_module($kw21$REMOVAL_ISA_COLLECTION_CHECK_POS, $list22);
    inference_modules.inference_removal_module($kw23$REMOVAL_ISA_COLLECTION_CHECK_NEG, $list24);
    inference_modules.inference_removal_module($kw29$REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS, $list30);
    inference_modules.inference_removal_module($kw31$REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS, $list32);
    inference_modules.inference_removal_module($kw38$REMOVAL_ISA_DEFN_POS, $list39);
    inference_modules.inference_removal_module($kw40$REMOVAL_ISA_DEFN_NEG, $list41);
    inference_modules.inference_removal_module($kw43$REMOVAL_ALL_ISA, $list44);
    utilities_macros.note_funcall_helper_function($sym45$REMOVAL_ALL_ISA_EXPAND);
    inference_modules.inference_removal_module($kw49$REMOVAL_ALL_INSTANCES, $list50);
    inference_modules.register_solely_specific_removal_module_predicate($const51$elementOf);
    inference_modules.inference_removal_module($kw55$REMOVAL_ELEMENTOF_CHECK, $list56);
    inference_modules.inference_removal_module($kw57$REMOVAL_NOT_ELEMENTOF_CHECK, $list58);
    inference_modules.inference_removal_module($kw59$REMOVAL_ELEMENTOF_COLLECTION_CHECK, $list60);
    inference_modules.inference_removal_module($kw61$REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK, $list62);
    inference_modules.inference_removal_module($kw63$REMOVAL_ELEMENTOF_SET_CHECK, $list64);
    inference_modules.inference_removal_module($kw65$REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK, $list66);
    inference_modules.inference_removal_module($kw67$REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK, $list68);
    inference_modules.inference_removal_module($kw69$REMOVAL_NOT_ELEMENTOF_SET_CHECK, $list70);
    inference_modules.inference_removal_module($kw72$REMOVAL_ELEMENTOF_THESETOF_CHECK, $list73);
    inference_modules.inference_removal_module($kw74$REMOVAL_ISA_THECOLLECTIONOF_CHECK, $list75);
    inference_modules.inference_removal_module($kw77$REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK, $list78);
    inference_modules.inference_removal_module($kw79$REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK, $list80);
    inference_modules.inference_removal_module($kw81$REMOVAL_ALL_ELEMENTOF, $list82);
    inference_modules.inference_removal_module($kw83$REMOVAL_NAT_ALL_ELEMENTOF, $list84);
    inference_modules.inference_removal_module($kw87$REMOVAL_ELEMENTOF_UNIFY, $list88);
    inference_modules.inference_removal_module($kw89$REMOVAL_ELEMENTOF_COLLECTION_UNIFY, $list90);
    inference_modules.inference_removal_module($kw91$REMOVAL_ELEMENTOF_SET_UNIFY, $list92);
    inference_modules.inference_removal_module($kw95$REMOVAL_ELEMENTOF_THESETOF_UNIFY, $list96);
    inference_modules.inference_removal_module($kw97$REMOVAL_ISA_THECOLLECTIONOF_UNIFY, $list98);
    inference_modules.inference_removal_module($kw105$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY, $list106);
    inference_modules.inference_removal_module($kw107$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK, $list108);
    inference_modules.inference_removal_module($kw109$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY, $list110);
    inference_modules.inference_removal_module($kw111$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK, $list112);
    inference_modules.inference_removal_module($kw113$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY, $list114);
    inference_modules.inference_removal_module($kw115$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK, $list116);
    inference_modules.inference_removal_module($kw117$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY, $list118);
    inference_modules.inference_removal_module($kw119$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK, $list120);
    inference_modules.inference_removal_module($kw121$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY, $list122);
    inference_modules.inference_removal_module($kw123$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK, $list124);
    inference_modules.inference_removal_module($kw125$REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY, $list126);
    inference_modules.inference_removal_module($kw127$REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK, $list128);
    inference_modules.inference_removal_module($kw129$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY, $list130);
    inference_modules.inference_removal_module($kw131$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK, $list132);
    inference_modules.inference_removal_module($kw133$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY, $list134);
    inference_modules.inference_removal_module($kw135$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK, $list136);
    inference_modules.inference_conjunctive_removal_module($kw137$REMOVAL_ALL_ISA_OF_TYPE, $list138);
    inference_modules.register_solely_specific_removal_module_predicate($const146$quotedIsa);
    inference_modules.inference_removal_module_use_meta_removal($const146$quotedIsa, $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS);
    inference_modules.inference_removal_module_use_meta_removal($const146$quotedIsa, $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS);
    inference_modules.inference_removal_module_use_generic($const146$quotedIsa, $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG);
    preference_modules.inference_preference_module($kw147$QUOTED_ISA_X_Y_POS, $list148);
    preference_modules.inference_preference_module($kw149$ALL_QUOTED_INSTANCES_POS, $list150);
    preference_modules.inference_preference_module($kw151$ALL_QUOTED_ISA_POS, $list152);
    inference_modules.inference_removal_module($kw153$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS, $list154);
    inference_modules.inference_removal_module($kw155$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG, $list156);
    inference_modules.inference_removal_module($kw157$REMOVAL_QUOTED_ISA_DEFN_POS, $list158);
    inference_modules.inference_removal_module($kw159$REMOVAL_QUOTED_ISA_DEFN_NEG, $list160);
    inference_modules.inference_removal_module($kw161$REMOVAL_NAT_QUOTED_ISA, $list162);
    inference_modules.inference_removal_module($kw163$REMOVAL_ALL_QUOTED_ISA, $list164);
    inference_modules.inference_removal_module($kw165$REMOVAL_NAT_ALL_QUOTED_ISA, $list166);
    inference_modules.inference_removal_module($kw167$REMOVAL_ALL_QUOTED_INSTANCES, $list168);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw1$META_REMOVAL_COMPLETELY_ENUMERABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-ENUMERABLE-POS");
  public static final SubLSymbol $kw2$META_REMOVAL_COMPLETELY_DECIDABLE_POS = makeKeyword("META-REMOVAL-COMPLETELY-DECIDABLE-POS");
  public static final SubLSymbol $kw3$REMOVAL_COMPLETELY_DECIDABLE_NEG = makeKeyword("REMOVAL-COMPLETELY-DECIDABLE-NEG");
  public static final SubLSymbol $kw4$REMOVAL_ABDUCTION_POS_CHECK = makeKeyword("REMOVAL-ABDUCTION-POS-CHECK");
  public static final SubLSymbol $kw5$REMOVAL_ABDUCTION_POS_UNIFY = makeKeyword("REMOVAL-ABDUCTION-POS-UNIFY");
  public static final SubLSymbol $kw6$REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
  public static final SubLSymbol $kw7$REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
  public static final SubLSymbol $kw8$REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
  public static final SubLSymbol $kw9$REMOVAL_BACKCHAIN_REQUIRED_PRUNE = makeKeyword("REMOVAL-BACKCHAIN-REQUIRED-PRUNE");
  public static final SubLSymbol $kw10$ISA_X_Y_POS = makeKeyword("ISA-X-Y-POS");
  public static final SubLList $list11 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
  public static final SubLSymbol $kw12$ALL_INSTANCES_POS = makeKeyword("ALL-INSTANCES-POS");
  public static final SubLList $list13 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-INSTANCES-POS-PREFERENCE"));
  public static final SubLSymbol $kw14$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLSymbol $kw15$GROSSLY_DISPREFERRED = makeKeyword("GROSSLY-DISPREFERRED");
  public static final SubLSymbol $kw16$ALL_ISA_POS = makeKeyword("ALL-ISA-POS");
  public static final SubLList $list17 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
  public static final SubLSymbol $kw18$ALL_ELEMENTOF_POS = makeKeyword("ALL-ELEMENTOF-POS");
  public static final SubLList $list19 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("GROSSLY-DISPREFERRED"));
  public static final SubLFloat $float20$0_1 = makeDouble(0.1);
  public static final SubLSymbol $kw21$REMOVAL_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-POS");
  public static final SubLList $list22 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog #$Collection)\n(#$isa (#$JuvenileFn #$Dog) #$Collection)")});
  public static final SubLSymbol $kw23$REMOVAL_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-ISA-COLLECTION-CHECK-NEG");
  public static final SubLList $list24 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa #$Dog #$Predicate))")});
  public static final SubLInteger $int25$30 = makeInteger(30);
  public static final SubLSymbol $kw26$ISA = makeKeyword("ISA");
  public static final SubLList $list27 = list(makeSymbol("OBJECT"), makeSymbol("COLLECTION"));
  public static final SubLSymbol $kw28$MINIMIZE = makeKeyword("MINIMIZE");
  public static final SubLSymbol $kw29$REMOVAL_ISA_NAUT_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FORT"), makeKeyword("CLOSED-NAUT")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw31$REMOVAL_ISA_NAUT_COLLECTION_LOOKUP_POS = makeKeyword("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS");
  public static final SubLList $list32 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), list(makeKeyword("NOT"), makeKeyword("FORT")), makeKeyword("CLOSED-NAUT")), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-NAUT-COLLECTION-LOOKUP-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw33$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw34$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw35$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw36$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw37$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw38$REMOVAL_ISA_DEFN_POS = makeKeyword("REMOVAL-ISA-DEFN-POS");
  public static final SubLList $list39 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-ISA-DEFN-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$isa 42 #$Integer)")});
  public static final SubLSymbol $kw40$REMOVAL_ISA_DEFN_NEG = makeKeyword("REMOVAL-ISA-DEFN-NEG");
  public static final SubLList $list41 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$isa 42 #$SubLString))")});
  public static final SubLSymbol $kw42$DEFN = makeKeyword("DEFN");
  public static final SubLSymbol $kw43$REMOVAL_ALL_ISA = makeKeyword("REMOVAL-ALL-ISA");
  public static final SubLList $list44 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$isa #$Dog ?COL)\n(#$isa (#$JuvenileFn #$Cougar) ?COL)")});
  public static final SubLSymbol $sym45$REMOVAL_ALL_ISA_EXPAND = makeSymbol("REMOVAL-ALL-ISA-EXPAND");
  public static final SubLSymbol $kw46$GROSSLY_INCOMPLETE = makeKeyword("GROSSLY-INCOMPLETE");
  public static final SubLSymbol $kw47$COMPLETE = makeKeyword("COMPLETE");
  public static final SubLInteger $int48$2300 = makeInteger(2300);
  public static final SubLSymbol $kw49$REMOVAL_ALL_INSTANCES = makeKeyword("REMOVAL-ALL-INSTANCES");
  public static final SubLList $list50 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> <fort>)"), makeKeyword("EXAMPLE"), makeString("(#$isa ?DOG #$Dog)")});
  public static final SubLObject $const51$elementOf = constant_handles.reader_make_constant_shell(makeString("elementOf"));
  public static final SubLList $list52 = list(makeSymbol("ELEMENT"), cons(makeSymbol("THESET"), makeSymbol("ELEMENTS")));
  public static final SubLSymbol $kw53$ELEMENTOF = makeKeyword("ELEMENTOF");
  public static final SubLSymbol $kw54$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw55$REMOVAL_ELEMENTOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-CHECK");
  public static final SubLList $list56 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog (#$TheSet #$Dog #$Cat))")});
  public static final SubLSymbol $kw57$REMOVAL_NOT_ELEMENTOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-CHECK");
  public static final SubLList $list58 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSet . <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Bird (#$TheSet #$Dog #$Cat)))")});
  public static final SubLSymbol $kw59$REMOVAL_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-CHECK");
  public static final SubLList $list60 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FORT"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <fort>)\n where <fort> is a collection "), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog #$Collection)")});
  public static final SubLSymbol $kw61$REMOVAL_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK");
  public static final SubLList $list62 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf 42 #$Integer))\nvia passing a #$defnIff or a #$defnSufficient")});
  public static final SubLSymbol $kw63$REMOVAL_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-ELEMENTOF-SET-CHECK");
  public static final SubLList $list64 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> <fort>)\n where <fort> is fort set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$GrayColor #$BlackAndWhiteColorScheme) \nvia the KB assertion (#$elementOf #$GrayColor #$BlackAndWhiteColorScheme)")});
  public static final SubLSymbol $kw65$REMOVAL_NOT_ELEMENTOF_COLLECTION_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK");
  public static final SubLList $list66 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FORT"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fort> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$Dog #$Predicate))")});
  public static final SubLSymbol $kw67$REMOVAL_NOT_ELEMENTOF_COLLECTION_DEFN_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK");
  public static final SubLList $list68 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-COLLECTION-DEFN-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf 42 #$SubLString))\nvia failing a #$defnIff or a #$defnNecessary")});
  public static final SubLSymbol $kw69$REMOVAL_NOT_ELEMENTOF_SET_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-SET-CHECK");
  public static final SubLList $list70 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-NOT-ELEMENTOF-SET-CHECK-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> <fort>))\nwhere <fort> is a set but not a collection"), makeKeyword("EXAMPLE"), makeString("(#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))\nvia the KB assertion\n (#$not (#$elementOf #$RedColor #$BlackAndWhiteColorScheme))")});
  public static final SubLSymbol $kw71$OPAQUE = makeKeyword("OPAQUE");
  public static final SubLSymbol $kw72$REMOVAL_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-CHECK");
  public static final SubLList $list73 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$France \n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))")});
  public static final SubLSymbol $kw74$REMOVAL_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-CHECK");
  public static final SubLList $list75 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa #$France \n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))")});
  public static final SubLSymbol $kw76$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw77$REMOVAL_NOT_ELEMENTOF_THESETOF_CHECK = makeKeyword("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK");
  public static final SubLList $list78 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ELEMENTOF-THESETOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$elementOf <fully-bound> (#$TheSetOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$bordersOn ?COUNTRY #$Germany))))")});
  public static final SubLSymbol $kw79$REMOVAL_NOT_ISA_THECOLLECTIONOF_CHECK = makeKeyword("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK");
  public static final SubLList $list80 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*INFERENCE-RECURSIVE-QUERY-OVERHEAD*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NOT-ISA-THECOLLECTIONOF-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$isa <fully-bound> (#$TheCollectionOf <variable> <fully-bound>)))"), makeKeyword("EXAMPLE"), makeString("(#$not \n  (#$elementOf #$Spain\n    (#$TheSetOf ?COUNTRY \n      (#$politiesBorderEachOther ?COUNTRY #$Germany))))")});
  public static final SubLSymbol $kw81$REMOVAL_ALL_ELEMENTOF = makeKeyword("REMOVAL-ALL-ELEMENTOF");
  public static final SubLList $list82 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$elementOf #$Dog ?WHAT)")});
  public static final SubLSymbol $kw83$REMOVAL_NAT_ALL_ELEMENTOF = makeKeyword("REMOVAL-NAT-ALL-ELEMENTOF");
  public static final SubLList $list84 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-ELEMENTOF-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf (<fully-bound> . <fully-bound>) <not fully-bound>)\nvia #$resultIsa and #$resultIsaArg"), makeKeyword("EXAMPLE"), makeString("(#$elementOf (#$JuvenileFn #$Cougar) ?WHAT)")});
  public static final SubLList $list85 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));
  public static final SubLList $list86 = cons(makeSymbol("THESET"), makeSymbol("ELEMENTS"));
  public static final SubLSymbol $kw87$REMOVAL_ELEMENTOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-UNIFY");
  public static final SubLList $list88 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("NOT-FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSet")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSet . <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT (#$TheSet #$Dog #$Cat))")});
  public static final SubLSymbol $kw89$REMOVAL_ELEMENTOF_COLLECTION_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-COLLECTION-UNIFY");
  public static final SubLList $list90 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-COLLECTION-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?DOG #$Dog)")});
  public static final SubLSymbol $kw91$REMOVAL_ELEMENTOF_SET_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-SET-UNIFY");
  public static final SubLList $list92 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("AND"), makeKeyword("FORT"), list(makeKeyword("NOT"), list(makeKeyword("TEST"), makeSymbol("COLLECTION-P"))))), makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-COST"), makeKeyword("COMPLETE-PATTERN"), list(makeKeyword("TEST"), makeSymbol("REMOVAL-COMPLETELY-ASSERTED-ASENT?")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASENT")), list(makeKeyword("VALUE"), makeSymbol("ASENT"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ELEMENTOF-SET-UNIFY-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-DECODE-PATTERN"), list(makeKeyword("TEMPLATE"), list(makeKeyword("BIND"), makeSymbol("ASSERTION")), list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(makeKeyword("CALL"), makeSymbol("GAF-FORMULA"), makeKeyword("INPUT")), makeKeyword("SUPPORT-PATTERN"), list(list(makeKeyword("VALUE"), makeSymbol("ASSERTION"))), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> <fort>)\nwhere arg2 is not a collection"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?ELEM #$BlackAndWhiteColorScheme)")});
  public static final SubLSymbol $sym93$EL_LITERAL_P = makeSymbol("EL-LITERAL-P");
  public static final SubLSymbol $kw94$HL = makeKeyword("HL");
  public static final SubLSymbol $kw95$REMOVAL_ELEMENTOF_THESETOF_UNIFY = makeKeyword("REMOVAL-ELEMENTOF-THESETOF-UNIFY");
  public static final SubLList $list96 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("elementOf")), makeKeyword("NOT-FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("TheSetOf")), makeKeyword("FULLY-BOUND"))), makeKeyword("COST"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ELEMENTOF-THESETOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$elementOf <not fully-bound> (#$TheSetOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$elementOf ?WHAT\n  (#$TheSetOf ?COUNTRY \n    (#$bordersOn ?COUNTRY #$Germany)))")});
  public static final SubLSymbol $kw97$REMOVAL_ISA_THECOLLECTIONOF_UNIFY = makeKeyword("REMOVAL-ISA-THECOLLECTIONOF-UNIFY");
  public static final SubLList $list98 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("TheCollectionOf")), makeKeyword("FULLY-BOUND")))), makeKeyword("EXCLUSIVE"), makeSymbol("TRUE"), makeKeyword("SUPPLANTS"), list(makeKeyword("REMOVAL-ALL-INSTANCES")), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-THECOLLECTIONOF-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$TheCollectionOf <variable> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$isa ?WHAT\n  (#$TheCollectionOf ?COUNTRY \n    (#$politiesBorderEachOther ?COUNTRY #$Germany)))")});
  public static final SubLObject $const99$TheSetOf = constant_handles.reader_make_constant_shell(makeString("TheSetOf"));
  public static final SubLObject $const100$subcollectionFunctionDefiningRule = constant_handles.reader_make_constant_shell(makeString("subcollectionFunctionDefiningRule"));
  public static final SubLString $str101$Expected__s_to_have_only_one_free = makeString("Expected ~s to have only one free variable");
  public static final SubLString $str102$Expected_exactly_one_poslit_in__S = makeString("Expected exactly one poslit in ~S");
  public static final SubLString $str103$Expected_exactly_one___termOfUnit = makeString("Expected exactly one #$termOfUnit neglit in ~S");
  public static final SubLList $list104 = list(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), constant_handles.reader_make_constant_shell(makeString("SubcollectionOccursAtFn")), constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn")), constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")));
  public static final SubLSymbol $kw105$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-UNIFY");
  public static final SubLList $list106 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))")});
  public static final SubLSymbol $kw107$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-FN-CHECK");
  public static final SubLList $list108 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToFn . <fully-bound>))")});
  public static final SubLSymbol $kw109$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-UNIFY");
  public static final SubLList $list110 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))")});
  public static final SubLSymbol $kw111$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-FN-CHECK");
  public static final SubLList $list112 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromFn . <fully-bound>))")});
  public static final SubLSymbol $kw113$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-UNIFY");
  public static final SubLList $list114 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))")});
  public static final SubLSymbol $kw115$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_TO_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-TO-TYPE-FN-CHECK");
  public static final SubLList $list116 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationToTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationToTypeFn . <fully-bound>))")});
  public static final SubLSymbol $kw117$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-UNIFY");
  public static final SubLList $list118 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))")});
  public static final SubLSymbol $kw119$REMOVAL_ISA_SUBCOLLECTION_OF_WITH_RELATION_FROM_TYPE_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OF-WITH-RELATION-FROM-TYPE-FN-CHECK");
  public static final SubLList $list120 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOfWithRelationFromTypeFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOfWithRelationFromTypeFn . <fully-bound>))")});
  public static final SubLSymbol $kw121$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_UNIFY = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-UNIFY");
  public static final SubLList $list122 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOccursAtFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))")});
  public static final SubLSymbol $kw123$REMOVAL_ISA_SUBCOLLECTION_OCCURS_AT_FN_CHECK = makeKeyword("REMOVAL-ISA-SUBCOLLECTION-OCCURS-AT-FN-CHECK");
  public static final SubLList $list124 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("SubcollectionOccursAtFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$SubcollectionOccursAtFn . <fully-bound>))")});
  public static final SubLSymbol $kw125$REMOVAL_ISA_COLLECTION_SUBSET_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-UNIFY");
  public static final SubLList $list126 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-COLLECTION-SUBSET-FN-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionSubsetFn . <fully-bound>))")});
  public static final SubLSymbol $kw127$REMOVAL_ISA_COLLECTION_SUBSET_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-SUBSET-FN-CHECK");
  public static final SubLList $list128 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionSubsetFn . <fully-bound>))")});
  public static final SubLSymbol $kw129$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-UNIFY");
  public static final SubLList $list130 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))")});
  public static final SubLSymbol $kw131$REMOVAL_ISA_COLLECTION_INTERSECTION_2_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-INTERSECTION-2-FN-CHECK");
  public static final SubLList $list132 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionIntersection2Fn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionIntersection2Fn . <fully-bound>))")});
  public static final SubLSymbol $kw133$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_UNIFY = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-UNIFY");
  public static final SubLList $list134 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <not fully-bound> (#$CollectionDifferenceFn . <fully-bound>))")});
  public static final SubLSymbol $kw135$REMOVAL_ISA_COLLECTION_DIFFERENCE_FN_CHECK = makeKeyword("REMOVAL-ISA-COLLECTION-DIFFERENCE-FN-CHECK");
  public static final SubLList $list136 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("CollectionDifferenceFn")), makeKeyword("FULLY-BOUND")))), makeKeyword("COST-EXPRESSION"), makeSymbol("*EXPENSIVE-HL-MODULE-CHECK-COST*"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ISA-SUBCOLLECTION-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$isa <fully-bound> (#$CollectionDifferenceFn . <fully-bound>))")});
  public static final SubLSymbol $kw137$REMOVAL_ALL_ISA_OF_TYPE = makeKeyword("REMOVAL-ALL-ISA-OF-TYPE");
  public static final SubLList $list138 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), list(constant_handles.reader_make_constant_shell(makeString("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-APPLICABILITY"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("TEMPLATE"), list(NIL, list(list(list(makeKeyword("BIND"), makeSymbol("MT-1")), list(makeKeyword("BIND"), makeSymbol("ASENT-1"))), list(list(makeKeyword("BIND"), makeSymbol("MT-2")), list(makeKeyword("BIND"), makeSymbol("ASENT-2"))))), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COMPLETENESS"), list(makeKeyword("VALUE"), makeSymbol("ASENT-1")), list(makeKeyword("VALUE"), makeSymbol("MT-1")), list(makeKeyword("VALUE"), makeSymbol("ASENT-2")), list(makeKeyword("VALUE"), makeSymbol("MT-2")))), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-ISA-OF-TYPE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$and (#$isa <fort1> <varN>)\n           (#$isa <varN> <fort2>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$isa #$AbrahamLincoln ?OCCUPATION)\n           (#$isa ?OCCUPATION #$PersonTypeByOccupation))")});
  public static final SubLSymbol $kw139$POS = makeKeyword("POS");
  public static final SubLSymbol $sym140$BINARY_CLAUSE_P = makeSymbol("BINARY-CLAUSE-P");
  public static final SubLList $list141 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $sym142$FORT_P = makeSymbol("FORT-P");
  public static final SubLList $list143 = list(makeSymbol("CONTEXTUALIZED-ASENT0"), makeSymbol("CONTEXTUALIZED-ASENT1"));
  public static final SubLList $list144 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
  public static final SubLList $list145 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
  public static final SubLObject $const146$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $kw147$QUOTED_ISA_X_Y_POS = makeKeyword("QUOTED-ISA-X-Y-POS");
  public static final SubLList $list148 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISALLOWED"));
  public static final SubLSymbol $kw149$ALL_QUOTED_INSTANCES_POS = makeKeyword("ALL-QUOTED-INSTANCES-POS");
  public static final SubLList $list150 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("PREFERENCE"), makeSymbol("ALL-QUOTED-INSTANCES-POS-PREFERENCE"));
  public static final SubLSymbol $kw151$ALL_QUOTED_ISA_POS = makeKeyword("ALL-QUOTED-ISA-POS");
  public static final SubLList $list152 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("PREFERENCE-LEVEL"), makeKeyword("DISPREFERRED"));
  public static final SubLSymbol $kw153$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_POS = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS");
  public static final SubLList $list154 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <fort>)")});
  public static final SubLSymbol $kw155$REMOVAL_QUOTED_ISA_COLLECTION_CHECK_NEG = makeKeyword("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG");
  public static final SubLList $list156 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FORT"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-COLLECTION-CHECK-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fort> <fort>))"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa #$Dog #$Predicate))")});
  public static final SubLSymbol $kw157$REMOVAL_QUOTED_ISA_DEFN_POS = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-POS");
  public static final SubLList $list158 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-POS-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fully-bound> <fort>)\nvia passing a #$defnIff or a #$defnSufficient"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa 42 #$SubLInteger)")});
  public static final SubLSymbol $kw159$REMOVAL_QUOTED_ISA_DEFN_NEG = makeKeyword("REMOVAL-QUOTED-ISA-DEFN-NEG");
  public static final SubLList $list160 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("NEG"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-QUOTED-ISA-DEFN-NEG-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$not (#$quotedIsa <fully-bound> <fort>))\nvia failing a #$defnIff or a #$defnNecessary"), makeKeyword("EXAMPLE"), makeString("(#$not (#$quotedIsa 42 #$SubLString))")});
  public static final SubLSymbol $kw161$REMOVAL_NAT_QUOTED_ISA = makeKeyword("REMOVAL-NAT-QUOTED-ISA");
  public static final SubLList $list162 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FORT")), makeKeyword("COST-EXPRESSION"), makeSymbol("*HL-MODULE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <fort>)")});
  public static final SubLSymbol $kw163$REMOVAL_ALL_QUOTED_ISA = makeKeyword("REMOVAL-ALL-QUOTED-ISA");
  public static final SubLList $list164 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <fort> <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa #$Dog ?COL)")});
  public static final SubLSymbol $kw165$REMOVAL_NAT_ALL_QUOTED_ISA = makeKeyword("REMOVAL-NAT-ALL-QUOTED-ISA");
  public static final SubLList $list166 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), cons(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("COST-EXPRESSION"), makeSymbol("*AVERAGE-ALL-ISA-COUNT*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-NAT-ALL-QUOTED-ISA-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa (<fully-bound> . <fully-bound>) <not fully-bound>)"), makeKeyword("EXAMPLE"), makeString("(#$quotedIsa (#$JuvenileFn #$Cougar) ?COL)")});
  public static final SubLSymbol $kw167$REMOVAL_ALL_QUOTED_INSTANCES = makeKeyword("REMOVAL-ALL-QUOTED-INSTANCES");
  public static final SubLList $list168 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COST"), makeKeyword("COMPLETENESS-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-COMPLETENESS"), makeKeyword("INPUT")), makeKeyword("INPUT-EXTRACT-PATTERN"), list(makeKeyword("TEMPLATE"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("ANYTHING"), list(makeKeyword("BIND"), makeSymbol("COLLECTION"))), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("OUTPUT-GENERATE-PATTERN"), list(makeKeyword("CALL"), makeSymbol("REMOVAL-ALL-QUOTED-INSTANCES-ITERATOR"), makeKeyword("INPUT")), makeKeyword("OUTPUT-CONSTRUCT-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("quotedIsa")), makeKeyword("INPUT"), list(makeKeyword("VALUE"), makeSymbol("COLLECTION"))), makeKeyword("SUPPORT-MODULE"), makeKeyword("ISA"), makeKeyword("SUPPORT-STRENGTH"), makeKeyword("DEFAULT"), makeKeyword("DOCUMENTATION"), makeString("(#$quotedIsa <not fully-bound> <fort>)")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_isa_file();
  }

  public void initializeVariables() {
    init_removal_modules_isa_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_isa_file();
  }

}
