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
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.backward_utilities;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.clause_utilities;
import com.cyc.cycjava.cycl.clauses;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.enumeration_types;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.hl_supports;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.inference_trampolines;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_indexing;
import com.cyc.cycjava.cycl.kb_indexing_datastructures;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.mt_vars;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_termofunit;
import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_tva_lookup;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.tva_inference;
import com.cyc.cycjava.cycl.unification;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.variables;
import com.cyc.cycjava.cycl.virtual_indexing;

public  final class removal_modules_relation_instance_exists extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_relation_instance_exists() {}
  public static final SubLFile me = new removal_modules_relation_instance_exists();
  public static final String myName = "com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_relation_instance_exists";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 919) 
  public static final SubLObject some_relation_instance_for_predicate(SubLObject relation_instance_pred, SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, relation_instance_pred, mt, ONE_INTEGER, UNPROVIDED))) {
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 2764) 
  public static final SubLObject removal_some_relation_instance_exists_for_predicate(SubLObject predicate, SubLObject mode, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = mode;
      if (pcase_var.eql($kw2$BOTH)) {
        return makeBoolean(((NIL != some_relation_instance_exists_for_predicate_and_spec(predicate, mt))
              || (NIL != some_relation_instance_exists_for_predicate_and_inverse(predicate, mt))));
      } else if (pcase_var.eql($kw0$GENL_PREDS)) {
        return some_relation_instance_exists_for_predicate_and_spec(predicate, mt);
      } else if (pcase_var.eql($kw1$GENL_INVERSE)) {
        return some_relation_instance_exists_for_predicate_and_inverse(predicate, mt);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3486) 
  public static final SubLObject some_relation_instance_exists_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return some_relation_instance_for_predicate($const3$relationInstanceExists, predicate, mt);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3658) 
  public static final SubLObject some_relation_instance_exists_for_predicate_and_spec(SubLObject predicate, SubLObject mt) {
    {
      SubLObject spec_predicates = inference_trampolines.inference_all_spec_predicates(predicate);
      SubLObject cdolist_list_var = spec_predicates;
      SubLObject spec_predicate = NIL;
      for (spec_predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), spec_predicate = cdolist_list_var.first()) {
        if ((NIL != some_relation_instance_exists_for_predicate(spec_predicate, mt))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 3949) 
  public static final SubLObject some_relation_instance_exists_for_predicate_and_inverse(SubLObject predicate, SubLObject mt) {
    {
      SubLObject inv_predicates = inference_trampolines.inference_all_spec_inverses(predicate);
      SubLObject cdolist_list_var = inv_predicates;
      SubLObject inv_predicate = NIL;
      for (inv_predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), inv_predicate = cdolist_list_var.first()) {
        if ((NIL != some_relation_instance_exists_for_predicate(inv_predicate, mt))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4238) 
  public static final SubLObject removal_relation_instance_exists_required(SubLObject asent, SubLObject mode, SubLObject require_new_terms_allowedP) {
    if (((NIL != require_new_terms_allowedP)
         && (NIL == removal_module_utilities.current_query_allows_new_termsP()))) {
      return NIL;
    }
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate))
             && ((NIL == require_new_terms_allowedP)
              || (NIL != removal_modules_termofunit.skolemization_allowed($const4$RelationInstanceExistsFn)))
             && (NIL != removal_some_relation_instance_exists_for_predicate(predicate, mode, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4764) 
  private static SubLSymbol $relation_instance_exists_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 4981) 
  public static SubLSymbol $relation_instance_exists_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 8723) 
  private static SubLSymbol $default_relation_instance_exists_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 12518) 
  public static final SubLObject removal_relation_instance_exists_unify_arg1_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_instance_exists_required(asent, $kw1$GENL_INVERSE, T);
  }

  public static final class $removal_relation_instance_exists_unify_arg1_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_exists_unify_arg1_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_exists_unify_arg1_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_exists_unify_arg1_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_exists_unify_arg1_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_exists_unify_arg1_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13266) 
  public static final SubLObject removal_relation_instance_exists_unify_arg2_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_instance_exists_required(asent, $kw0$GENL_PREDS, T);
  }

  public static final class $removal_relation_instance_exists_unify_arg2_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_exists_unify_arg2_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_exists_unify_arg2_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_exists_unify_arg2_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_exists_unify_arg2_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_exists_unify_arg2_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 13450) 
  private static SubLSymbol $minimum_relation_instance_exists_unify_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 21951) 
  public static final SubLObject removal_relation_instance_exists_unbound_required(SubLObject asent, SubLObject mode) {
    return removal_relation_instance_exists_required(asent, mode, T);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 22648) 
  public static final SubLObject removal_relation_instance_exists_unbound_arg1_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_required(asent, $kw0$GENL_PREDS);
  }

  public static final class $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_exists_unbound_arg1_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_exists_unbound_arg1_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 22840) 
  public static final SubLObject removal_relation_instance_exists_unbound_arg2_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_instance_exists_unbound_required(asent, $kw1$GENL_INVERSE);
  }

  public static final class $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_exists_unbound_arg2_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_instance_exists_unbound_arg2_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 26394) 
  public static final SubLObject removal_some_relation_exists_instance_for_predicate(SubLObject predicate, SubLObject mode, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    {
      SubLObject pcase_var = mode;
      if (pcase_var.eql($kw2$BOTH)) {
        return makeBoolean(((NIL != some_relation_exists_instance_for_predicate_and_spec(predicate, mt))
              || (NIL != some_relation_exists_instance_for_predicate_and_inverse(predicate, mt))));
      } else if (pcase_var.eql($kw0$GENL_PREDS)) {
        return some_relation_exists_instance_for_predicate_and_spec(predicate, mt);
      } else if (pcase_var.eql($kw1$GENL_INVERSE)) {
        return some_relation_exists_instance_for_predicate_and_inverse(predicate, mt);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27115) 
  public static final SubLObject some_relation_exists_instance_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return some_relation_instance_for_predicate($const37$relationExistsInstance, predicate, mt);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27292) 
  public static final SubLObject some_relation_exists_instance_for_predicate_and_spec(SubLObject predicate, SubLObject mt) {
    {
      SubLObject spec_predicates = inference_trampolines.inference_all_spec_predicates(predicate);
      SubLObject cdolist_list_var = spec_predicates;
      SubLObject spec_predicate = NIL;
      for (spec_predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), spec_predicate = cdolist_list_var.first()) {
        if ((NIL != some_relation_exists_instance_for_predicate(spec_predicate, mt))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27583) 
  public static final SubLObject some_relation_exists_instance_for_predicate_and_inverse(SubLObject predicate, SubLObject mt) {
    {
      SubLObject inv_predicates = inference_trampolines.inference_all_spec_inverses(predicate);
      SubLObject cdolist_list_var = inv_predicates;
      SubLObject inv_predicate = NIL;
      for (inv_predicate = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), inv_predicate = cdolist_list_var.first()) {
        if ((NIL != some_relation_exists_instance_for_predicate(inv_predicate, mt))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 27871) 
  public static final SubLObject removal_relation_exists_instance_required(SubLObject asent, SubLObject mode, SubLObject require_new_terms_allowedP) {
    if (((NIL != require_new_terms_allowedP)
         && (NIL == removal_module_utilities.current_query_allows_new_termsP()))) {
      return NIL;
    }
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((NIL == hl_supports.hl_predicate_p(predicate))
             && ((NIL == require_new_terms_allowedP)
              || (NIL != removal_modules_termofunit.skolemization_allowed($const38$RelationExistsInstanceFn)))
             && (NIL != removal_some_relation_exists_instance_for_predicate(predicate, mode, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28397) 
  private static SubLSymbol $relation_exists_instance_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 28614) 
  public static SubLSymbol $relation_exists_instance_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 32334) 
  private static SubLSymbol $default_relation_exists_instance_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 36131) 
  public static final SubLObject removal_relation_exists_instance_unify_required(SubLObject asent, SubLObject mode) {
    return removal_relation_exists_instance_required(asent, mode, T);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 36809) 
  public static final SubLObject removal_relation_exists_instance_unify_arg1_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_exists_instance_unify_required(asent, $kw0$GENL_PREDS);
  }

  public static final class $removal_relation_exists_instance_unify_arg1_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_exists_instance_unify_arg1_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_exists_instance_unify_arg1_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_exists_instance_unify_arg1_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_exists_instance_unify_arg1_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_exists_instance_unify_arg1_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 36997) 
  public static final SubLObject removal_relation_exists_instance_unify_arg2_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_exists_instance_unify_required(asent, $kw1$GENL_INVERSE);
  }

  public static final class $removal_relation_exists_instance_unify_arg2_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_exists_instance_unify_arg2_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_exists_instance_unify_arg2_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_exists_instance_unify_arg2_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_exists_instance_unify_arg2_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_exists_instance_unify_arg2_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 37187) 
  private static SubLSymbol $minimum_relation_exists_instance_unify_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 45708) 
  public static final SubLObject removal_relation_exists_instance_unbound_required(SubLObject asent, SubLObject mode) {
    return removal_relation_exists_instance_required(asent, mode, T);
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46413) 
  public static final SubLObject removal_relation_exists_instance_unbound_arg1_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_required(asent, $kw1$GENL_INVERSE);
  }

  public static final class $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_exists_instance_unbound_arg1_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_exists_instance_unbound_arg1_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 46607) 
  public static final SubLObject removal_relation_exists_instance_unbound_arg2_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    return removal_relation_exists_instance_unbound_required(asent, $kw0$GENL_PREDS);
  }

  public static final class $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_exists_instance_unbound_arg2_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_exists_instance_unbound_arg2_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-instance-exists.lisp", position = 55951) 
  public static final SubLObject removal_relation_instance_exists_expansion_applicability(SubLObject contextualized_dnf_clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject subclause_specs = NIL;
        if ((NIL != removal_module_utilities.current_query_allows_new_termsP())) {
          {
            SubLObject index0 = ZERO_INTEGER;
            SubLObject cdolist_list_var = clauses.pos_lits(contextualized_dnf_clause);
            SubLObject contextualized_asent0 = NIL;
            for (contextualized_asent0 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent0 = cdolist_list_var.first()) {
              {
                SubLObject datum = contextualized_asent0;
                SubLObject current = datum;
                SubLObject mt0 = NIL;
                SubLObject asent0 = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                mt0 = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list72);
                asent0 = current.first();
                current = current.rest();
                if ((NIL == current)) {
                  {
                    SubLObject mt_var = mt0;
                    {
                      SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                      SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                      SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                      try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        if (($const66$isa == cycl_utilities.atomic_sentence_predicate(asent0))) {
                          {
                            SubLObject isa_arg1 = cycl_utilities.atomic_sentence_arg1(asent0, UNPROVIDED);
                            SubLObject isa_arg2 = cycl_utilities.atomic_sentence_arg2(asent0, UNPROVIDED);
                            if ((NIL != variables.fully_bound_p(isa_arg2))) {
                              if ((NIL != variables.not_fully_bound_p(isa_arg1))) {
                                {
                                  SubLObject index1 = ZERO_INTEGER;
                                  SubLObject cdolist_list_var_69 = clauses.pos_lits(contextualized_dnf_clause);
                                  SubLObject contextualized_asent1 = NIL;
                                  for (contextualized_asent1 = cdolist_list_var_69.first(); (NIL != cdolist_list_var_69); cdolist_list_var_69 = cdolist_list_var_69.rest(), contextualized_asent1 = cdolist_list_var_69.first()) {
                                    if ((!(index0.eql(index1)))) {
                                      {
                                        SubLObject datum_70 = contextualized_asent1;
                                        SubLObject current_71 = datum_70;
                                        SubLObject mt1 = NIL;
                                        SubLObject asent1 = NIL;
                                        cdestructuring_bind.destructuring_bind_must_consp(current_71, datum_70, $list73);
                                        mt1 = current_71.first();
                                        current_71 = current_71.rest();
                                        cdestructuring_bind.destructuring_bind_must_consp(current_71, datum_70, $list73);
                                        asent1 = current_71.first();
                                        current_71 = current_71.rest();
                                        if ((NIL == current_71)) {
                                          if ((NIL != mt_relevance_macros.relevant_mtP(mt1))) {
                                            {
                                              SubLObject mt_var_72 = mt1;
                                              {
                                                SubLObject _prev_bind_0_73 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                SubLObject _prev_bind_1_74 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                SubLObject _prev_bind_2_75 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                try {
                                                  mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_72), thread);
                                                  mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_72), thread);
                                                  mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_72), thread);
                                                  {
                                                    SubLObject pred1 = cycl_utilities.atomic_sentence_predicate(asent1);
                                                    if (((NIL != hl_supports.non_hl_predicate_p(pred1))
                                                         && (NIL != kb_accessors.binary_predicateP(pred1)))) {
                                                      {
                                                        SubLObject pred1_arg1 = cycl_utilities.atomic_sentence_arg1(asent1, UNPROVIDED);
                                                        SubLObject pred1_arg2 = cycl_utilities.atomic_sentence_arg2(asent1, UNPROVIDED);
                                                        if (((NIL != variables.not_fully_bound_p(pred1_arg2))
                                                             && pred1_arg2.equal(isa_arg1)
                                                             && (NIL != Errors
																	.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32730")))) {
                                                          if (index0.numL(index1)) {
                                                            subclause_specs = cons(list(NIL, list(index0, index1)), subclause_specs);
                                                          } else {
                                                            subclause_specs = cons(list(NIL, list(index1, index0)), subclause_specs);
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } finally {
                                                  mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_75, thread);
                                                  mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_74, thread);
                                                  mt_relevance_macros.$mt$.rebind(_prev_bind_0_73, thread);
                                                }
                                              }
                                            }
                                          }
                                        } else {
                                          cdestructuring_bind.cdestructuring_bind_error(datum_70, $list73);
                                        }
                                      }
                                    }
                                    index1 = Numbers.add(index1, ONE_INTEGER);
                                  }
                                }
                              }
                            }
                          }
                        }
                      } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                      }
                    }
                  }
                } else {
                  cdestructuring_bind.cdestructuring_bind_error(datum, $list72);
                }
              }
              index0 = Numbers.add(index0, ONE_INTEGER);
            }
          }
        }
        return list_utilities.fast_delete_duplicates(subclause_specs, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
    }
  }

  public static final class $removal_relation_instance_exists_expansion_applicability$UnaryFunction extends UnaryFunction {
    public $removal_relation_instance_exists_expansion_applicability$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_instance_exists_expansion_applicability(arg1); }
  }

  public static final SubLObject declare_removal_modules_relation_instance_exists_file() {
    declareFunction(myName, "some_relation_instance_for_predicate", "SOME-RELATION-INSTANCE-FOR-PREDICATE", 2, 1, false);
    declareFunction(myName, "removal_relation_instance_support_direction_relevantP", "REMOVAL-RELATION-INSTANCE-SUPPORT-DIRECTION-RELEVANT?", 1, 0, false);
    declareFunction(myName, "removal_relation_instance_support_sentence", "REMOVAL-RELATION-INSTANCE-SUPPORT-SENTENCE", 1, 0, false);
    declareFunction(myName, "sksi_relation_instance_cost", "SKSI-RELATION-INSTANCE-COST", 1, 0, false);
    declareFunction(myName, "removal_all_spec_or_inverse_predicates", "REMOVAL-ALL-SPEC-OR-INVERSE-PREDICATES", 2, 0, false);
    declareFunction(myName, "removal_some_relation_instance_exists_for_predicate", "REMOVAL-SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 2, 1, false);
    declareFunction(myName, "some_relation_instance_exists_for_predicate", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "some_relation_instance_exists_for_predicate_and_spec", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-SPEC", 2, 0, false);
    declareFunction(myName, "some_relation_instance_exists_for_predicate_and_inverse", "SOME-RELATION-INSTANCE-EXISTS-FOR-PREDICATE-AND-INVERSE", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_required", "REMOVAL-RELATION-INSTANCE-EXISTS-REQUIRED", 3, 0, false);
    declareFunction(myName, "make_relation_instance_exists_support", "MAKE-RELATION-INSTANCE-EXISTS-SUPPORT", 0, 0, false);
    declareFunction(myName, "make_relation_instance_exists_term", "MAKE-RELATION-INSTANCE-EXISTS-TERM", 3, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_prune", "REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_check_required", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_check_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_check_expand_internal", "REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND-INTERNAL", 5, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED", 1, 1, false); new $removal_relation_instance_exists_unify_arg1_required$UnaryFunction(); new $removal_relation_instance_exists_unify_arg1_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_exists_unify_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED", 1, 1, false); new $removal_relation_instance_exists_unify_arg2_required$UnaryFunction(); new $removal_relation_instance_exists_unify_arg2_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_exists_unify_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-COST", 3, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND", 4, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND", 1, 1, false);
    declareFunction(myName, "relation_instance_exists_sksi_cost", "RELATION-INSTANCE-EXISTS-SKSI-COST", 0, 0, false);
    declareFunction(myName, "relation_instance_exists_predicate_cost_estimate", "RELATION-INSTANCE-EXISTS-PREDICATE-COST-ESTIMATE", 2, 1, false);
    declareFunction(myName, "relation_instance_exists_object_cost_estimate", "RELATION-INSTANCE-EXISTS-OBJECT-COST-ESTIMATE", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_via_predicate_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_via_object_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unify_expand_guts", "REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-EXPAND-GUTS", 3, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-REQUIRED", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg1_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED", 1, 1, false); new $removal_relation_instance_exists_unbound_arg1_required$UnaryFunction(); new $removal_relation_instance_exists_unbound_arg1_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg2_required", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED", 1, 1, false); new $removal_relation_instance_exists_unbound_arg2_required$UnaryFunction(); new $removal_relation_instance_exists_unbound_arg2_required$BinaryFunction();
    declareFunction(myName, "removal_relation_instance_exists_unbound_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-COST", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg1_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg2_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg1_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_unbound_arg2_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_some_relation_exists_instance_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 2, 1, false);
    declareFunction(myName, "some_relation_exists_instance_for_predicate", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "some_relation_exists_instance_for_predicate_and_spec", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-SPEC", 2, 0, false);
    declareFunction(myName, "some_relation_exists_instance_for_predicate_and_inverse", "SOME-RELATION-EXISTS-INSTANCE-FOR-PREDICATE-AND-INVERSE", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_required", "REMOVAL-RELATION-EXISTS-INSTANCE-REQUIRED", 3, 0, false);
    declareFunction(myName, "make_relation_exists_instance_support", "MAKE-RELATION-EXISTS-INSTANCE-SUPPORT", 0, 0, false);
    declareFunction(myName, "make_relation_exists_instance_term", "MAKE-RELATION-EXISTS-INSTANCE-TERM", 3, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_prune", "REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_check_required", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_check_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_check_expand_internal", "REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND-INTERNAL", 5, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-REQUIRED", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED", 1, 1, false); new $removal_relation_exists_instance_unify_arg1_required$UnaryFunction(); new $removal_relation_exists_instance_unify_arg1_required$BinaryFunction();
    declareFunction(myName, "removal_relation_exists_instance_unify_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED", 1, 1, false); new $removal_relation_exists_instance_unify_arg2_required$UnaryFunction(); new $removal_relation_exists_instance_unify_arg2_required$BinaryFunction();
    declareFunction(myName, "removal_relation_exists_instance_unify_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-COST", 3, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND", 4, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND", 1, 1, false);
    declareFunction(myName, "relation_exists_instance_sksi_cost", "RELATION-EXISTS-INSTANCE-SKSI-COST", 0, 0, false);
    declareFunction(myName, "relation_exists_instance_predicate_cost_estimate", "RELATION-EXISTS-INSTANCE-PREDICATE-COST-ESTIMATE", 2, 1, false);
    declareFunction(myName, "relation_exists_instance_object_cost_estimate", "RELATION-EXISTS-INSTANCE-OBJECT-COST-ESTIMATE", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-PREDICATE-EXPAND", 4, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_via_object_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-VIA-OBJECT-EXPAND", 3, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unify_expand_guts", "REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-EXPAND-GUTS", 3, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-REQUIRED", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg1_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED", 1, 1, false); new $removal_relation_exists_instance_unbound_arg1_required$UnaryFunction(); new $removal_relation_exists_instance_unbound_arg1_required$BinaryFunction();
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg2_required", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED", 1, 1, false); new $removal_relation_exists_instance_unbound_arg2_required$UnaryFunction(); new $removal_relation_exists_instance_unbound_arg2_required$BinaryFunction();
    declareFunction(myName, "removal_relation_exists_instance_unbound_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-COST", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg1_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg2_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg1_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_unbound_arg2_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_via_exemplar_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_via_exemplar_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_instance_exists_via_exemplar_query", "REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-QUERY", 1, 1, false);
    declareFunction(myName, "make_relation_instance_exists_via_exemplar_support", "MAKE-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-SUPPORT", 1, 0, false);
    declareFunction(myName, "removal_relation_exists_instance_via_exemplar_cost", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_via_exemplar_expand", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_instance_via_exemplar_query", "REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-QUERY", 1, 1, false);
    declareFunction(myName, "make_relation_exists_instance_via_exemplar_support", "MAKE-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-SUPPORT", 1, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_expansion_applicability", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY", 1, 0, false); new $removal_relation_instance_exists_expansion_applicability$UnaryFunction();
    declareFunction(myName, "removal_relation_instance_exists_expansion_cost", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST", 1, 0, false);
    declareFunction(myName, "removal_relation_instance_exists_expansion_expand", "REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND", 1, 0, false);
    declareFunction(myName, "destructure_relation_instance_exists_expansion", "DESTRUCTURE-RELATION-INSTANCE-EXISTS-EXPANSION", 1, 0, false);
    declareFunction(myName, "relation_instance_exists_unifiableP", "RELATION-INSTANCE-EXISTS-UNIFIABLE?", 4, 0, false);
    declareFunction(myName, "relation_instance_exists_unify", "RELATION-INSTANCE-EXISTS-UNIFY", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_relation_instance_exists_file() {
    $relation_instance_exists_rule$ = deflexical("*RELATION-INSTANCE-EXISTS-RULE*", el_utilities.list_to_elf($list5));
    $relation_instance_exists_defining_mt$ = deflexical("*RELATION-INSTANCE-EXISTS-DEFINING-MT*", ((NIL != Symbols.boundp($sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_)) ? ((SubLObject) $relation_instance_exists_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_relation_instance_exists_check_cost$ = deflexical("*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $minimum_relation_instance_exists_unify_cost$ = deflexical("*MINIMUM-RELATION-INSTANCE-EXISTS-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $relation_exists_instance_rule$ = deflexical("*RELATION-EXISTS-INSTANCE-RULE*", el_utilities.list_to_elf($list39));
    $relation_exists_instance_defining_mt$ = deflexical("*RELATION-EXISTS-INSTANCE-DEFINING-MT*", ((NIL != Symbols.boundp($sym40$_RELATION_EXISTS_INSTANCE_DEFINING_MT_)) ? ((SubLObject) $relation_exists_instance_defining_mt$.getGlobalValue()) : $const7$BaseKB));
    $default_relation_exists_instance_check_cost$ = deflexical("*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $minimum_relation_exists_instance_unify_cost$ = deflexical("*MINIMUM-RELATION-EXISTS-INSTANCE-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    return NIL;
  }

  public static final SubLObject setup_removal_modules_relation_instance_exists_file() {
    // CVS_ID("Id: removal-modules-relation-instance-exists.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_);
    mt_vars.note_mt_var($sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_, $const3$relationInstanceExists);
    inference_modules.inference_removal_module($kw10$REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE, $list11);
    inference_modules.inference_removal_module($kw26$REMOVAL_RELATION_INSTANCE_EXISTS_CHECK, $list27);
    inference_modules.inference_removal_module($kw29$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1, $list30);
    inference_modules.inference_removal_module($kw31$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2, $list32);
    inference_modules.inference_removal_module($kw33$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1, $list34);
    inference_modules.inference_removal_module($kw35$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2, $list36);
    subl_macro_promotions.declare_defglobal($sym40$_RELATION_EXISTS_INSTANCE_DEFINING_MT_);
    mt_vars.note_mt_var($sym40$_RELATION_EXISTS_INSTANCE_DEFINING_MT_, $const37$relationExistsInstance);
    inference_modules.inference_removal_module($kw41$REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE, $list42);
    inference_modules.inference_removal_module($kw50$REMOVAL_RELATION_EXISTS_INSTANCE_CHECK, $list51);
    inference_modules.inference_removal_module($kw52$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1, $list53);
    inference_modules.inference_removal_module($kw54$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2, $list55);
    inference_modules.inference_removal_module($kw56$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1, $list57);
    inference_modules.inference_removal_module($kw58$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2, $list59);
    inference_modules.inference_removal_module($kw60$REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR, $list61);
    inference_modules.inference_removal_module($kw68$REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR, $list69);
    inference_modules.inference_conjunctive_removal_module($kw70$REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION, $list71);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$GENL_PREDS = makeKeyword("GENL-PREDS");
  public static final SubLSymbol $kw1$GENL_INVERSE = makeKeyword("GENL-INVERSE");
  public static final SubLSymbol $kw2$BOTH = makeKeyword("BOTH");
  public static final SubLObject $const3$relationInstanceExists = constant_handles.reader_make_constant_shell(makeString("relationInstanceExists"));
  public static final SubLObject $const4$RelationInstanceExistsFn = constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn"));
  public static final SubLList $list5 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExists")), makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?COLL")), list(makeSymbol("?PRED"), makeSymbol("?THING"), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeSymbol("?PRED"), makeSymbol("?THING"), makeSymbol("?COLL"))));
  public static final SubLSymbol $sym6$_RELATION_INSTANCE_EXISTS_DEFINING_MT_ = makeSymbol("*RELATION-INSTANCE-EXISTS-DEFINING-MT*");
  public static final SubLObject $const7$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $kw8$CODE = makeKeyword("CODE");
  public static final SubLSymbol $kw9$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw10$REMOVAL_RELATION_INSTANCE_EXISTS_PRUNE = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE");
  public static final SubLList $list11 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this")});
  public static final SubLList $list12 = list(makeKeyword("FORT"), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));
  public static final SubLList $list13 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), list(makeKeyword("BIND"), makeSymbol("RIE-PRED")), list(makeKeyword("BIND"), makeSymbol("RIE-TERM")), list(makeKeyword("BIND"), makeSymbol("RIE-COL"))));
  public static final SubLSymbol $sym14$RIE_COL = makeSymbol("RIE-COL");
  public static final SubLSymbol $sym15$RIE_TERM = makeSymbol("RIE-TERM");
  public static final SubLSymbol $sym16$RIE_PRED = makeSymbol("RIE-PRED");
  public static final SubLSymbol $sym17$TERM = makeSymbol("TERM");
  public static final SubLSymbol $sym18$PREDICATE = makeSymbol("PREDICATE");
  public static final SubLList $list19 = list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));
  public static final SubLList $list20 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), list(makeKeyword("BIND"), makeSymbol("RIE-PRED")), list(makeKeyword("BIND"), makeSymbol("RIE-TERM")), list(makeKeyword("BIND"), makeSymbol("RIE-COL"))), list(makeKeyword("BIND"), makeSymbol("TERM")));
  public static final SubLSymbol $kw21$POS = makeKeyword("POS");
  public static final SubLSymbol $kw22$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw23$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw24$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw25$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw26$REMOVAL_RELATION_INSTANCE_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK");
  public static final SubLList $list27 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-INSTANCE-EXISTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> (#$RelationInstanceExistsFn <predicate> <object> <coll>)) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> (#$RelationInstanceExistsFn <predicate> <object> <coll>) <object>) \nwhere <object> is a TERM\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)\n"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean \n      (#$RelationInstanceExistsFn #$owns #$Sean #$Holster))\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)")});
  public static final SubLSymbol $kw28$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw29$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG1 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1");
  public static final SubLList $list30 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw31$REMOVAL_RELATION_INSTANCE_EXISTS_UNIFY_ARG2 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2");
  public static final SubLList $list32 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns #$Sean ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)")});
  public static final SubLSymbol $kw33$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG1 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1");
  public static final SubLList $list34 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("VARIABLE")), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("RelationInstanceExistsFn")), makeKeyword("ANYTHING"))))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationInstanceExists <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$owns ?WHO ?ITEM)\nfrom (#$relationInstanceExists #$owns #$Sean #$Holster)")});
  public static final SubLSymbol $kw35$REMOVAL_RELATION_INSTANCE_EXISTS_UNBOUND_ARG2 = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2");
  public static final SubLList $list36 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-UNBOUND-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationInstanceExists <inv-predicate> <object> <coll>\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLObject $const37$relationExistsInstance = constant_handles.reader_make_constant_shell(makeString("relationExistsInstance"));
  public static final SubLObject $const38$RelationExistsInstanceFn = constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn"));
  public static final SubLList $list39 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("relationExistsInstance")), makeSymbol("?PRED"), makeSymbol("?COLL"), makeSymbol("?THING")), list(makeSymbol("?PRED"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeSymbol("?PRED"), makeSymbol("?COLL"), makeSymbol("?THING")), makeSymbol("?THING")));
  public static final SubLSymbol $sym40$_RELATION_EXISTS_INSTANCE_DEFINING_MT_ = makeSymbol("*RELATION-EXISTS-INSTANCE-DEFINING-MT*");
  public static final SubLSymbol $kw41$REMOVAL_RELATION_EXISTS_INSTANCE_PRUNE = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE");
  public static final SubLList $list42 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString("@todo write this"), makeKeyword("EXAMPLE"), makeString("@todo write this")});
  public static final SubLList $list43 = list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));
  public static final SubLList $list44 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), list(makeKeyword("BIND"), makeSymbol("REI-PRED")), list(makeKeyword("BIND"), makeSymbol("REI-COL")), list(makeKeyword("BIND"), makeSymbol("REI-TERM"))), list(makeKeyword("BIND"), makeSymbol("TERM")));
  public static final SubLSymbol $sym45$REI_TERM = makeSymbol("REI-TERM");
  public static final SubLSymbol $sym46$REI_COL = makeSymbol("REI-COL");
  public static final SubLSymbol $sym47$REI_PRED = makeSymbol("REI-PRED");
  public static final SubLList $list48 = list(makeKeyword("FORT"), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));
  public static final SubLList $list49 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), list(makeKeyword("BIND"), makeSymbol("REI-PRED")), list(makeKeyword("BIND"), makeSymbol("REI-COL")), list(makeKeyword("BIND"), makeSymbol("REI-TERM"))));
  public static final SubLSymbol $kw50$REMOVAL_RELATION_EXISTS_INSTANCE_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK");
  public static final SubLList $list51 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-EXISTS-INSTANCE-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsInstanceFn <predicate> <coll> <object>) <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate)\n\nor \n\n(<predicate> <object> (#$RelationExistsInstanceFn <predicate> <coll> <object>)) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion (#$RelationExistsInstanceFn #$inRegion #$Subway #$CityOfMadridSpain)\n                #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)")});
  public static final SubLSymbol $kw52$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG1 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1");
  public static final SubLList $list53 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nfrom (#$relationExistsInstance <spec-predicate> <coll> <object>)\nand (#$genlPreds <spec-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?WHAT #$CityOfMadridSpain)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)")});
  public static final SubLSymbol $kw54$REMOVAL_RELATION_EXISTS_INSTANCE_UNIFY_ARG2 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2");
  public static final SubLList $list55 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNIFY-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>) \nfrom (#$relationExistsInstance <inv-predicate> <coll> <object>)\nand (#$genlInverse <inv-predicate> <predicate>"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw56$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG1 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1");
  public static final SubLList $list57 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("ANYTHING")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG1-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <anything>)\nfrom (#$relationExistsInstance <inv-predicate> <object> <coll>)\nand (#$genlInverse <inv-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw58$REMOVAL_RELATION_EXISTS_INSTANCE_UNBOUND_ARG2 = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2");
  public static final SubLList $list59 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("VARIABLE"), makeKeyword("NOT-FULLY-BOUND")), list(makeKeyword("FORT"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("RelationExistsInstanceFn")), makeKeyword("ANYTHING"))), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-UNBOUND-ARG2-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <anything> <not fully-bound>)\nfrom (#$relationExistsInstance <spec-predicate> <object> <coll>)\nand (#$genlPreds <spec-predicate> <predicate)"), makeKeyword("EXAMPLE"), makeString("(#$inRegion ?OBJ1 ?OBJ2)\nfrom (#$relationExistsInstance #$inRegion #$Subway #$CityOfMadridSpain)")});
  public static final SubLSymbol $kw60$REMOVAL_RELATION_INSTANCE_EXISTS_VIA_EXEMPLAR = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR");
  public static final SubLList $list61 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("relationInstanceExists")), makeKeyword("PREDICATE-FORT"), makeKeyword("FORT"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT"))), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-VIA-EXEMPLAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relationInstanceExists <predicate> <term> <collection>) \nfrom (<spec-predicate> <term> <collection-instance>) \n(#$genlPreds <spec-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>) \nor \nfrom (<inv-predicate> <collection-instance> <term>) \n(#$genlInverse <inv-predicate> <predicate>) \nand (#$isa <collection-instance> <collection>)	       \n"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLObject $const62$thereExists = constant_handles.reader_make_constant_shell(makeString("thereExists"));
  public static final SubLSymbol $sym63$_INS = makeSymbol("?INS");
  public static final SubLObject $const64$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLList $list65 = list(makeSymbol("?INS"));
  public static final SubLObject $const66$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $kw67$QUERY = makeKeyword("QUERY");
  public static final SubLSymbol $kw68$REMOVAL_RELATION_EXISTS_INSTANCE_VIA_EXEMPLAR = makeKeyword("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR");
  public static final SubLList $list69 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("relationExistsInstance")), makeKeyword("REQUIRED-PATTERN"), list(constant_handles.reader_make_constant_shell(makeString("relationExistsInstance")), makeKeyword("PREDICATE-FORT"), list(makeKeyword("AND"), makeKeyword("FULLY-BOUND"), makeKeyword("COLLECTION-FORT")), makeKeyword("FORT")), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-INSTANCE-VIA-EXEMPLAR-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(#$relationExistsInstance <predicate> <collection> <term>)\nfrom (<spec-predicate> <collection-instance> <term>)\n(#$genlPreds <spec-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)\nor\nfrom (<inv-predicate> <term> <collection-instance>)\n(#$genlInverse <inv-predicate> <predicate>)\nand (#$isa <collection-instance> <collection>)	       \n"), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLSymbol $kw70$REMOVAL_RELATION_INSTANCE_EXISTS_EXPANSION = makeKeyword("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION");
  public static final SubLList $list71 = list(new SubLObject[] {makeKeyword("EVERY-PREDICATES"), list(constant_handles.reader_make_constant_shell(makeString("isa"))), makeKeyword("APPLICABILITY"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-APPLICABILITY"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-COST"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-INSTANCE-EXISTS-EXPANSION-EXPAND"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("DOCUMENTATION"), makeString("(#$and (<fort> <anything> <not-fully-bound-N>)\n           (#$isa <not-fully-bound-N> <fully-bound>))"), makeKeyword("EXAMPLE"), makeString("(#$and (#$organismKilled ?EVENT ?PERSON)\n           (#$isa ?PERSON #$UnitedStatesPerson))")});
  public static final SubLList $list72 = list(makeSymbol("MT0"), makeSymbol("ASENT0"));
  public static final SubLList $list73 = list(makeSymbol("MT1"), makeSymbol("ASENT1"));
  public static final SubLList $list74 = list(makeSymbol("RIE-BINDINGS"), makeSymbol("RIE-JUST"));
  public static final SubLList $list75 = list(NIL);
  public static final SubLSymbol $kw76$TVA = makeKeyword("TVA");
  public static final SubLSymbol $kw77$ISA = makeKeyword("ISA");
  public static final SubLList $list78 = list(makeSymbol("CONTEXTUALIZED-ASENT1"), makeSymbol("CONTEXTUALIZED-ASENT2"));
  public static final SubLList $list79 = list(makeSymbol("MT2"), makeSymbol("ASENT2"));

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_relation_instance_exists_file();
  }

  public void initializeVariables() {
    init_removal_modules_relation_instance_exists_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_relation_instance_exists_file();
  }

}
