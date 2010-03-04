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

package  com.cyc.cycjava.cycl.inference.modules.removal;

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
import com.cyc.cycjava.cycl.arguments;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.cardinality_estimates;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.unification_utilities;

public  final class removal_modules_relation_all_instance extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_relation_all_instance() {}
  public static final SubLFile me = new removal_modules_relation_all_instance();
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_all_instance";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 785) 
  public static final SubLObject removal_some_relation_all_instance_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(predicate))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const0$relationAllInstance, mt, ONE_INTEGER, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 1810) 
  private static SubLSymbol $estimated_per_collection_removal_all_instance_count$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 2186) 
  public static final SubLObject removal_relation_all_instance_required(SubLObject asent) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate))
             && (NIL != removal_some_relation_all_instance_for_predicate(predicate, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 2433) 
  private static SubLSymbol $relation_all_instance_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 2621) 
  public static SubLSymbol $relation_all_instance_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 2871) 
  public static final SubLObject removal_relation_all_instance_check_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_all_instance_required(asent))) {
      {
        SubLObject value = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return makeBoolean(((NIL != el_utilities.possibly_naut_p(value))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32612"))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 3511) 
  private static SubLSymbol $removal_relation_all_instance_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 8409) 
  public static final SubLObject removal_relation_all_instance_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_all_instance_required(asent))) {
      {
        SubLObject object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return makeBoolean(((NIL != forts.fort_p(object))
              || (NIL != el_utilities.possibly_naut_p(object))));
      }
    }
    return NIL;
  }

  public static final class $removal_relation_all_instance_unify_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_all_instance_unify_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_all_instance_unify_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_all_instance_unify_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_all_instance_unify_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_all_instance_unify_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 8990) 
  private static SubLSymbol $minimum_relation_all_instance_unify_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 12811) 
  public static final SubLObject removal_relation_all_instance_iterate_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_all_instance_required(asent))) {
      {
        SubLObject object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32613");
      }
    }
    return NIL;
  }

  public static final class $removal_relation_all_instance_iterate_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_all_instance_iterate_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_all_instance_iterate_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_all_instance_iterate_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_all_instance_iterate_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_all_instance_iterate_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 16668) 
  public static final SubLObject removal_some_relation_instance_all_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(predicate))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const32$relationInstanceAll, mt, ONE_INTEGER, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 17659) 
  private static SubLSymbol $estimated_per_collection_removal_instance_all_count$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 18033) 
  public static final SubLObject removal_relation_instance_all_required(SubLObject asent) {
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate))
             && (NIL != removal_some_relation_instance_all_for_predicate(predicate, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 18280) 
  private static SubLSymbol $relation_instance_all_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 18467) 
  public static SubLSymbol $relation_instance_all_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 18717) 
  public static final SubLObject removal_relation_instance_all_check_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_instance_all_required(asent))) {
      {
        SubLObject value = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return makeBoolean(((NIL != el_utilities.possibly_naut_p(value))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32614"))));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 19339) 
  private static SubLSymbol $removal_relation_instance_all_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 24240) 
  public static final SubLObject removal_relation_instance_all_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_instance_all_required(asent))) {
      {
        SubLObject object = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return makeBoolean(((NIL != forts.fort_p(object))
              || (NIL != el_utilities.possibly_naut_p(object))));
      }
    }
    return NIL;
  }

  public static final class $removal_relation_instance_all_unify_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_all_unify_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_all_unify_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_all_unify_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_all_unify_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_all_unify_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 24786) 
  private static SubLSymbol $minimum_relation_instance_all_unify_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-instance.lisp", position = 28219) 
  public static final SubLObject removal_relation_instance_all_iterate_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_instance_all_required(asent))) {
      {
        SubLObject object = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32615");
      }
    }
    return NIL;
  }

  public static final class $removal_relation_instance_all_iterate_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_all_iterate_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_all_iterate_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_all_iterate_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_all_iterate_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_all_iterate_required(arg1, arg2); }
  }

  public static final SubLObject declare_removal_modules_relation_all_instance_file() {
    declareFunction(myName, "removal_some_relation_all_instance_for_predicate", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "removal_some_relation_all_instance_for_collection", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-COLLECTION", 1, 1, false);
    declareFunction(myName, "removal_some_relation_all_instance_for_value", "REMOVAL-SOME-RELATION-ALL-INSTANCE-FOR-VALUE", 1, 1, false);
    declareFunction(myName, "relation_all_instance_predicate_cost_estimate", "RELATION-ALL-INSTANCE-PREDICATE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "relation_all_instance_collection_cost_estimate", "RELATION-ALL-INSTANCE-COLLECTION-COST-ESTIMATE", 0, 0, false);
    declareFunction(myName, "relation_all_instance_value_cost_estimate", "RELATION-ALL-INSTANCE-VALUE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "removal_relation_all_instance_required", "REMOVAL-RELATION-ALL-INSTANCE-REQUIRED", 1, 0, false);
    declareFunction(myName, "make_relation_all_instance_support", "MAKE-RELATION-ALL-INSTANCE-SUPPORT", 0, 0, false);
    declareFunction(myName, "removal_relation_all_instance_check_required", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_all_instance_check_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_all_instance_check_via_value_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-VALUE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_check_via_collection_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_check_via_predicate_expand", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_check_expand_guts", "REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND-GUTS", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_unify_required", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED", 1, 1, false); new $removal_relation_all_instance_unify_required$UnaryFunction(); new $removal_relation_all_instance_unify_required$BinaryFunction();
    declareFunction(myName, "removal_relation_all_instance_unify_cost", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_all_instance_unify_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_all_instance_unify_via_collection_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_unify_via_predicate_expand", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_unify_expand_guts", "REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND-GUTS", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_iterate_required", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED", 1, 1, false); new $removal_relation_all_instance_iterate_required$UnaryFunction(); new $removal_relation_all_instance_iterate_required$BinaryFunction();
    declareFunction(myName, "removal_relation_all_instance_iterate_cost", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_all_instance_iteration_collections", "REMOVAL-RELATION-ALL-INSTANCE-ITERATION-COLLECTIONS", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_iteration_collections_rai", "REMOVAL-RELATION-ALL-INSTANCE-ITERATION-COLLECTIONS-RAI", 2, 0, false);
    declareFunction(myName, "removal_relation_all_instance_iterate_expand", "REMOVAL-RELATION-ALL-INSTANCE-ITERATE-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_some_relation_instance_all_for_predicate", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "removal_some_relation_instance_all_for_value", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-VALUE", 1, 1, false);
    declareFunction(myName, "removal_some_relation_instance_all_for_collection", "REMOVAL-SOME-RELATION-INSTANCE-ALL-FOR-COLLECTION", 1, 1, false);
    declareFunction(myName, "relation_instance_all_predicate_cost_estimate", "RELATION-INSTANCE-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "relation_instance_all_collection_cost_estimate", "RELATION-INSTANCE-ALL-COLLECTION-COST-ESTIMATE", 0, 0, false);
    declareFunction(myName, "relation_instance_all_value_cost_estimate", "RELATION-INSTANCE-ALL-VALUE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "removal_relation_instance_all_required", "REMOVAL-RELATION-INSTANCE-ALL-REQUIRED", 1, 0, false);
    declareFunction(myName, "make_relation_instance_all_support", "MAKE-RELATION-INSTANCE-ALL-SUPPORT", 0, 0, false);
    declareFunction(myName, "removal_relation_instance_all_check_required", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_all_check_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_all_check_via_value_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-VALUE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_check_via_collection_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_check_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_check_expand_guts", "REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND-GUTS", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_unify_required", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED", 1, 1, false); new $removal_relation_instance_all_unify_required$UnaryFunction(); new $removal_relation_instance_all_unify_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_all_unify_cost", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_all_unify_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_all_unify_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_unify_via_collection_expand", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_unify_expand_guts", "REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND-GUTS", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_iterate_required", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED", 1, 1, false); new $removal_relation_instance_all_iterate_required$UnaryFunction(); new $removal_relation_instance_all_iterate_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_all_iterate_cost", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_all_iteration_collections", "REMOVAL-RELATION-INSTANCE-ALL-ITERATION-COLLECTIONS", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_iteration_collections_ria", "REMOVAL-RELATION-INSTANCE-ALL-ITERATION-COLLECTIONS-RIA", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_all_iterate_expand", "REMOVAL-RELATION-INSTANCE-ALL-ITERATE-EXPAND", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_relation_all_instance_file() {
    $estimated_per_collection_removal_all_instance_count$ = defparameter("*ESTIMATED-PER-COLLECTION-REMOVAL-ALL-INSTANCE-COUNT*", TWO_INTEGER);
    $relation_all_instance_rule$ = defparameter("*RELATION-ALL-INSTANCE-RULE*", $list1);
    $relation_all_instance_defining_mt$ = deflexical("*RELATION-ALL-INSTANCE-DEFINING-MT*", ((NIL != Symbols.boundp($sym2$_RELATION_ALL_INSTANCE_DEFINING_MT_)) ? ((SubLObject) $relation_all_instance_defining_mt$.getGlobalValue()) : $const3$BaseKB));
    $removal_relation_all_instance_check_cost$ = defparameter("*REMOVAL-RELATION-ALL-INSTANCE-CHECK-COST*", $float6$1_5);
    $minimum_relation_all_instance_unify_cost$ = defparameter("*MINIMUM-RELATION-ALL-INSTANCE-UNIFY-COST*", TWO_INTEGER);
    $estimated_per_collection_removal_instance_all_count$ = defparameter("*ESTIMATED-PER-COLLECTION-REMOVAL-INSTANCE-ALL-COUNT*", TWO_INTEGER);
    $relation_instance_all_rule$ = deflexical("*RELATION-INSTANCE-ALL-RULE*", $list33);
    $relation_instance_all_defining_mt$ = deflexical("*RELATION-INSTANCE-ALL-DEFINING-MT*", ((NIL != Symbols.boundp($sym34$_RELATION_INSTANCE_ALL_DEFINING_MT_)) ? ((SubLObject) $relation_instance_all_defining_mt$.getGlobalValue()) : $const3$BaseKB));
    $removal_relation_instance_all_check_cost$ = defparameter("*REMOVAL-RELATION-INSTANCE-ALL-CHECK-COST*", $float6$1_5);
    $minimum_relation_instance_all_unify_cost$ = defparameter("*MINIMUM-RELATION-INSTANCE-ALL-UNIFY-COST*", TWO_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_removal_modules_relation_all_instance_file() {
    // CVS_ID("Id: removal-modules-relation-all-instance.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym2$_RELATION_ALL_INSTANCE_DEFINING_MT_);
    mt_vars.note_mt_var($sym2$_RELATION_ALL_INSTANCE_DEFINING_MT_, $const0$relationAllInstance);
    inference_modules.inference_removal_module($kw9$REMOVAL_RELATION_ALL_INSTANCE_CHECK, $list10);
    inference_modules.inference_removal_module($kw13$REMOVAL_RELATION_ALL_INSTANCE_UNIFY, $list14);
    inference_modules.inference_removal_module($kw30$REMOVAL_RELATION_ALL_INSTANCE_ITERATE, $list31);
    subl_macro_promotions.declare_defglobal($sym34$_RELATION_INSTANCE_ALL_DEFINING_MT_);
    mt_vars.note_mt_var($sym34$_RELATION_INSTANCE_ALL_DEFINING_MT_, $const32$relationInstanceAll);
    inference_modules.inference_removal_module($kw35$REMOVAL_RELATION_INSTANCE_ALL_CHECK, $list36);
    inference_modules.inference_removal_module($kw37$REMOVAL_RELATION_INSTANCE_ALL_UNIFY, $list38);
    inference_modules.inference_removal_module($kw39$REMOVAL_RELATION_INSTANCE_ALL_ITERATE, $list40);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$relationAllInstance = constant_handles.reader_make_constant_shell(makeString("relationAllInstance"));
  public static final SubLList $list1 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationAllInstance")), makeSymbol("?PRED"), makeSymbol("?COL"), makeSymbol("?VALUE")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL"))), list(makeSymbol("?PRED"), makeSymbol("?OBJ"), makeSymbol("?VALUE")));
  public static final SubLSymbol $sym2$_RELATION_ALL_INSTANCE_DEFINING_MT_ = makeSymbol("*RELATION-ALL-INSTANCE-DEFINING-MT*");
  public static final SubLObject $const3$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $kw4$CODE = makeKeyword("CODE");
  public static final SubLSymbol $kw5$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLFloat $float6$1_5 = makeDouble(1.5);
  public static final SubLSymbol $kw7$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw8$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw9$REMOVAL_RELATION_ALL_INSTANCE_CHECK = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-CHECK");
  public static final SubLList $list10 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-RELATION-ALL-INSTANCE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) (#$YearsDuration 1))\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)")});
  public static final SubLSymbol $kw11$ISA = makeKeyword("ISA");
  public static final SubLObject $const12$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw13$REMOVAL_RELATION_ALL_INSTANCE_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-UNIFY");
  public static final SubLList $list14 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT or NAUT\nfrom (#$relationAllInstance <predicate> <collection> <value>) \nand (#$isa <object> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln ?GENDER)\nfrom (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationAllInstance #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)")});
  public static final SubLList $list15 = cons(makeSymbol("COLLECTION"), makeSymbol("RAI-ASSERTIONS"));
  public static final SubLSymbol $kw16$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw17$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw18$STACK = makeKeyword("STACK");
  public static final SubLSymbol $sym19$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw20$ERROR = makeKeyword("ERROR");
  public static final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym22$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw23$CERROR = makeKeyword("CERROR");
  public static final SubLString $str24$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw25$WARN = makeKeyword("WARN");
  public static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str27$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLList $list28 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str29$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $kw30$REMOVAL_RELATION_ALL_INSTANCE_ITERATE = makeKeyword("REMOVAL-RELATION-ALL-INSTANCE-ITERATE");
  public static final SubLList $list31 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FORT")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-INSTANCE-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <non-fort> <object>) where <object> is a FORT\n from (#$relationAllInstance <predicate> <collection> <object>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender ?WHO #$Masculine)\n from (#$relationAllInstance #$hasGender #$MalePerson #$Masculine)")});
  public static final SubLObject $const32$relationInstanceAll = constant_handles.reader_make_constant_shell(makeString("relationInstanceAll"));
  public static final SubLList $list33 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceAll")), makeSymbol("?PRED"), makeSymbol("?VALUE"), makeSymbol("?COL")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?OBJ"), makeSymbol("?COL"))), list(makeSymbol("?PRED"), makeSymbol("?VALUE"), makeSymbol("?OBJ")));
  public static final SubLSymbol $sym34$_RELATION_INSTANCE_ALL_DEFINING_MT_ = makeSymbol("*RELATION-INSTANCE-ALL-DEFINING-MT*");
  public static final SubLSymbol $kw35$REMOVAL_RELATION_INSTANCE_ALL_CHECK = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-CHECK");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*REMOVAL-RELATION-INSTANCE-ALL-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <value>) where <object> and <value> are FORTs or NAUTs\nfrom (#$relationInstanceAll <predicate> <collection> <value>) \nand (#$isa <arg1> <collection>)"), makeKeyword("EXAMPLE"), makeString("(#$hasGender #$AbrahamLincoln #$Masculine)\nfrom (#$relationInstanceAll #$hasGender #$MalePerson #$Masculine)\nand (#$isa #$AbrahamLincoln #$MalePerson)\n(#$duration (#$YearFn 2001) ?TIME)\nfrom (#$relationInstanceAll #$duration #$CalendarYear (#$YearsDuration 1))\nand (#$isa (#$YearFn 2001) #$CalendarYear)")});
  public static final SubLSymbol $kw37$REMOVAL_RELATION_INSTANCE_ALL_UNIFY = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-UNIFY");
  public static final SubLList $list38 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <whatever> <fort or naut>)\nfrom (#$relationInstanceAll <predicate> <value> <collection>) \nand (#$isa <fort> <collection>)")});
  public static final SubLSymbol $kw39$REMOVAL_RELATION_INSTANCE_ALL_ITERATE = makeKeyword("REMOVAL-RELATION-INSTANCE-ALL-ITERATE");
  public static final SubLList $list40 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-COST"), makeKeyword("COMPLETENESS"), makeKeyword("INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-ALL-ITERATE-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <non-fort>) where <object> is a FORT\n from (#$relationInstanceAll <predicate> <object> <collection>)\n by iterating over <collection>"), makeKeyword("EXAMPLE"), makeString("(subsetOf TheEmptySet ?WHAT) \n from\n   (relationInstanceAll subsetOf TheEmptySet SetOrCollection)")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_relation_all_instance_file();
  }

  public void initializeVariables() {
    init_removal_modules_relation_all_instance_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_relation_all_instance_file();
  }

}
