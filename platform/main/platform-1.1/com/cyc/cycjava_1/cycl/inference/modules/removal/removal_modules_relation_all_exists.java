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
 import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arguments;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.backward;
//dm import com.cyc.cycjava_1.cycl.backward_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.formula_pattern_match;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.hl_supports;
//dm import com.cyc.cycjava_1.cycl.inference.harness.inference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.inference_trampolines;
//dm import com.cyc.cycjava_1.cycl.isa;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_vars;
//dm import com.cyc.cycjava_1.cycl.pattern_match;
//dm import com.cyc.cycjava_1.cycl.inference.modules.preference_modules;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_termofunit;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.unification;
//dm import com.cyc.cycjava_1.cycl.unification_utilities;
//dm import com.cyc.cycjava_1.cycl.virtual_indexing;

public  final class removal_modules_relation_all_exists extends SubLTranslatedFile {

  //// Constructor

  private removal_modules_relation_all_exists() {}
  public static final SubLFile me = new removal_modules_relation_all_exists();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.modules.removal.removal_modules_relation_all_exists";

  //// Definitions

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 1468) 
  public static final SubLObject relation_all_exists_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    if ((NIL == removal_module_utilities.current_query_allows_new_termsP())) {
      return NIL;
    } else if ((NIL == removal_relation_all_exists_required(asent, T))) {
      return NIL;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list2))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list4))) {
      return $kw5$DISPREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list6))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list7))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list8))) {
      return $kw5$DISPREFERRED;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 2310) 
  public static final SubLObject removal_some_relation_all_exists_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(predicate))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const9$relationAllExists, mt, ONE_INTEGER, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 2995) 
  private static SubLSymbol $estimated_per_collection_relation_all_exists_count$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3314) 
  public static final SubLObject removal_relation_all_exists_required(SubLObject asent, SubLObject require_new_terms_allowedP) {
    if (((NIL != require_new_terms_allowedP)
         && (NIL == removal_module_utilities.current_query_allows_new_termsP()))) {
      return NIL;
    }
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((($const10$isa == predicate)
              || (NIL == hl_supports.hl_predicate_p(predicate)))
             && ((NIL == require_new_terms_allowedP)
              || (NIL != removal_modules_termofunit.skolemization_allowed($const11$RelationAllExistsFn)))
             && (NIL != removal_some_relation_all_exists_for_predicate(predicate, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 3998) 
  private static SubLSymbol $relation_all_exists_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 4254) 
  public static SubLSymbol $relation_all_exists_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 6824) 
  private static SubLSymbol $default_relation_all_exists_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 9348) 
  public static final SubLObject removal_relation_all_exists_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_all_exists_required(asent, T))) {
      {
        SubLObject arg1 = cycl_utilities.atomic_sentence_arg1(asent, UNPROVIDED);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32690");
      }
    }
    return NIL;
  }

  public static final class $removal_relation_all_exists_unify_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_all_exists_unify_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_all_exists_unify_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_all_exists_unify_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_all_exists_unify_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_all_exists_unify_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 9899) 
  private static SubLSymbol $minimum_relation_all_exists_unify_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 14469) 
  public static final SubLObject relation_exists_all_pos_preference(SubLObject asent, SubLObject bindable_vars, SubLObject strategic_context) {
    if ((NIL == removal_module_utilities.current_query_allows_new_termsP())) {
      return NIL;
    } else if ((NIL == removal_relation_exists_all_required(asent, T))) {
      return NIL;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list2))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list40))) {
      return $kw5$DISPREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list7))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list6))) {
      return $kw3$PREFERRED;
    } else if ((NIL != formula_pattern_match.formula_matches_pattern(asent, $list8))) {
      return $kw5$DISPREFERRED;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 15311) 
  public static final SubLObject removal_some_relation_exists_all_for_predicate(SubLObject predicate, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != forts.fort_p(predicate))) {
      return kb_mapping_utilities.some_pred_value_in_relevant_mts(predicate, $const41$relationExistsAll, mt, ONE_INTEGER, UNPROVIDED);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 15916) 
  private static SubLSymbol $estimated_per_collection_relation_exists_all_count$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16235) 
  public static final SubLObject removal_relation_exists_all_required(SubLObject asent, SubLObject require_new_terms_allowedP) {
    if (((NIL != require_new_terms_allowedP)
         && (NIL == removal_module_utilities.current_query_allows_new_termsP()))) {
      return NIL;
    }
    {
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return makeBoolean(((($const10$isa == predicate)
              || (NIL == hl_supports.hl_predicate_p(predicate)))
             && ((NIL == require_new_terms_allowedP)
              || (NIL != removal_modules_termofunit.skolemization_allowed($const42$RelationExistsAllFn)))
             && (NIL != removal_some_relation_exists_all_for_predicate(predicate, NIL))));
    }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 16919) 
  private static SubLSymbol $relation_exists_all_rule$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 17175) 
  public static SubLSymbol $relation_exists_all_defining_mt$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 19792) 
  private static SubLSymbol $default_relation_exists_all_check_cost$ = null;

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 22291) 
  public static final SubLObject removal_relation_exists_all_unify_required(SubLObject asent, SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((NIL != removal_relation_exists_all_required(asent, T))) {
      {
        SubLObject arg2 = cycl_utilities.atomic_sentence_arg2(asent, UNPROVIDED);
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 32691");
      }
    }
    return NIL;
  }

  public static final class $removal_relation_exists_all_unify_required$UnaryFunction extends UnaryFunction {
    public $removal_relation_exists_all_unify_required$UnaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1) { return removal_relation_exists_all_unify_required(arg1, UNPROVIDED); }
  }

  public static final class $removal_relation_exists_all_unify_required$BinaryFunction extends BinaryFunction {
    public $removal_relation_exists_all_unify_required$BinaryFunction() { super(extractFunctionNamed("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return removal_relation_exists_all_unify_required(arg1, arg2); }
  }

  @SubL(source = "cycl/inference/modules/removal/removal-modules-relation-all-exists.lisp", position = 22815) 
  private static SubLSymbol $minimum_relation_exists_all_unify_cost$ = null;

  public static final SubLObject declare_removal_modules_relation_all_exists_file() {
    declareFunction(myName, "sbhl_isa_source_object_p", "SBHL-ISA-SOURCE-OBJECT-P", 1, 0, false);
    declareFunction(myName, "relation_all_exists_pos_preference", "RELATION-ALL-EXISTS-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "removal_some_relation_all_exists_for_predicate", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "removal_some_relation_all_exists_for_collection", "REMOVAL-SOME-RELATION-ALL-EXISTS-FOR-COLLECTION", 1, 1, false);
    declareFunction(myName, "relation_all_exists_predicate_cost_estimate", "RELATION-ALL-EXISTS-PREDICATE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "relation_all_exists_collection_cost_estimate", "RELATION-ALL-EXISTS-COLLECTION-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "removal_relation_all_exists_required", "REMOVAL-RELATION-ALL-EXISTS-REQUIRED", 2, 0, false);
    declareFunction(myName, "make_relation_all_exists_support", "MAKE-RELATION-ALL-EXISTS-SUPPORT", 0, 0, false);
    declareFunction(myName, "make_relation_all_exists_term", "MAKE-RELATION-ALL-EXISTS-TERM", 4, 0, false);
    declareFunction(myName, "removal_relation_all_exists_prune", "REMOVAL-RELATION-ALL-EXISTS-PRUNE", 1, 1, false);
    declareFunction(myName, "removal_relation_all_exists_check_required", "REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_all_exists_check_expand", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_all_exists_check_expand_internal", "REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_relation_all_exists_unify_required", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED", 1, 1, false); new $removal_relation_all_exists_unify_required$UnaryFunction(); new $removal_relation_all_exists_unify_required$BinaryFunction();
    declareFunction(myName, "removal_relation_all_exists_unify_cost", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_all_exists_unify_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_all_exists_unify_via_predicate_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_exists_unify_via_collection_expand", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_all_exists_unify_expand_guts", "REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND-GUTS", 2, 0, false);
    declareFunction(myName, "relation_exists_all_pos_preference", "RELATION-EXISTS-ALL-POS-PREFERENCE", 3, 0, false);
    declareFunction(myName, "removal_some_relation_exists_all_for_predicate", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-PREDICATE", 1, 1, false);
    declareFunction(myName, "removal_some_relation_exists_all_for_collection", "REMOVAL-SOME-RELATION-EXISTS-ALL-FOR-COLLECTION", 1, 1, false);
    declareFunction(myName, "relation_exists_all_predicate_cost_estimate", "RELATION-EXISTS-ALL-PREDICATE-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "relation_exists_all_collection_cost_estimate", "RELATION-EXISTS-ALL-COLLECTION-COST-ESTIMATE", 1, 0, false);
    declareFunction(myName, "removal_relation_exists_all_required", "REMOVAL-RELATION-EXISTS-ALL-REQUIRED", 2, 0, false);
    declareFunction(myName, "make_relation_exists_all_support", "MAKE-RELATION-EXISTS-ALL-SUPPORT", 0, 0, false);
    declareFunction(myName, "make_relation_exists_all_term", "MAKE-RELATION-EXISTS-ALL-TERM", 4, 0, false);
    declareFunction(myName, "removal_relation_exists_all_prune", "REMOVAL-RELATION-EXISTS-ALL-PRUNE", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_all_check_required", "REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_all_check_expand", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_all_check_expand_internal", "REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND-INTERNAL", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_all_unify_required", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED", 1, 1, false); new $removal_relation_exists_all_unify_required$UnaryFunction(); new $removal_relation_exists_all_unify_required$BinaryFunction();
    declareFunction(myName, "removal_relation_exists_all_unify_cost", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_all_unify_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND", 1, 1, false);
    declareFunction(myName, "removal_relation_exists_all_unify_via_predicate_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-PREDICATE-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_all_unify_via_collection_expand", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-VIA-COLLECTION-EXPAND", 2, 0, false);
    declareFunction(myName, "removal_relation_exists_all_unify_expand_guts", "REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND-GUTS", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_removal_modules_relation_all_exists_file() {
    $estimated_per_collection_relation_all_exists_count$ = deflexical("*ESTIMATED-PER-COLLECTION-RELATION-ALL-EXISTS-COUNT*", TWO_INTEGER);
    $relation_all_exists_rule$ = deflexical("*RELATION-ALL-EXISTS-RULE*", el_utilities.list_to_elf($list12));
    $relation_all_exists_defining_mt$ = deflexical("*RELATION-ALL-EXISTS-DEFINING-MT*", maybeDefault( $sym13$_RELATION_ALL_EXISTS_DEFINING_MT_, $relation_all_exists_defining_mt$, ()-> ($const14$BaseKB)));
    $default_relation_all_exists_check_cost$ = deflexical("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $minimum_relation_all_exists_unify_cost$ = deflexical("*MINIMUM-RELATION-ALL-EXISTS-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $estimated_per_collection_relation_exists_all_count$ = deflexical("*ESTIMATED-PER-COLLECTION-RELATION-EXISTS-ALL-COUNT*", TWO_INTEGER);
    $relation_exists_all_rule$ = deflexical("*RELATION-EXISTS-ALL-RULE*", el_utilities.list_to_elf($list43));
    $relation_exists_all_defining_mt$ = deflexical("*RELATION-EXISTS-ALL-DEFINING-MT*", maybeDefault( $sym44$_RELATION_EXISTS_ALL_DEFINING_MT_, $relation_exists_all_defining_mt$, ()-> ($const14$BaseKB)));
    $default_relation_exists_all_check_cost$ = deflexical("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    $minimum_relation_exists_all_unify_cost$ = deflexical("*MINIMUM-RELATION-EXISTS-ALL-UNIFY-COST*", control_vars.$expensive_hl_module_check_cost$.getGlobalValue());
    return NIL;
  }

  public static final SubLObject setup_removal_modules_relation_all_exists_file() {
    // CVS_ID("Id: removal-modules-relation-all-exists.lisp 126640 2008-12-04 13:39:36Z builder ");
    preference_modules.inference_preference_module($kw0$RELATION_ALL_EXISTS_POS, $list1);
    subl_macro_promotions.declare_defglobal($sym13$_RELATION_ALL_EXISTS_DEFINING_MT_);
    mt_vars.note_mt_var($sym13$_RELATION_ALL_EXISTS_DEFINING_MT_, $const9$relationAllExists);
    inference_modules.inference_removal_module($kw17$REMOVAL_RELATION_ALL_EXISTS_PRUNE, $list18);
    inference_modules.inference_removal_module($kw32$REMOVAL_RELATION_ALL_EXISTS_CHECK, $list33);
    inference_modules.inference_removal_module($kw36$REMOVAL_RELATION_ALL_EXISTS_UNIFY, $list37);
    preference_modules.inference_preference_module($kw38$RELATION_EXISTS_ALL_POS, $list39);
    subl_macro_promotions.declare_defglobal($sym44$_RELATION_EXISTS_ALL_DEFINING_MT_);
    mt_vars.note_mt_var($sym44$_RELATION_EXISTS_ALL_DEFINING_MT_, $const41$relationExistsAll);
    inference_modules.inference_removal_module($kw45$REMOVAL_RELATION_EXISTS_ALL_PRUNE, $list46);
    inference_modules.inference_removal_module($kw51$REMOVAL_RELATION_EXISTS_ALL_CHECK, $list52);
    inference_modules.inference_removal_module($kw53$REMOVAL_RELATION_EXISTS_ALL_UNIFY, $list54);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$RELATION_ALL_EXISTS_POS = makeKeyword("RELATION-ALL-EXISTS-POS");
  public static final SubLList $list1 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-ALL-EXISTS-POS-PREFERENCE"));
  public static final SubLList $list2 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"));
  public static final SubLSymbol $kw3$PREFERRED = makeKeyword("PREFERRED");
  public static final SubLList $list4 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeKeyword("FULLY-BOUND")));
  public static final SubLSymbol $kw5$DISPREFERRED = makeKeyword("DISPREFERRED");
  public static final SubLList $list6 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("FULLY-BOUND"));
  public static final SubLList $list7 = list(makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));
  public static final SubLList $list8 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));
  public static final SubLObject $const9$relationAllExists = constant_handles.reader_make_constant_shell(makeString("relationAllExists"));
  public static final SubLObject $const10$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLObject $const11$RelationAllExistsFn = constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn"));
  public static final SubLList $list12 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationAllExists")), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), makeSymbol("?TERM"), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?INDEP-COL"), makeSymbol("?DEP-COL"))));
  public static final SubLSymbol $sym13$_RELATION_ALL_EXISTS_DEFINING_MT_ = makeSymbol("*RELATION-ALL-EXISTS-DEFINING-MT*");
  public static final SubLObject $const14$BaseKB = constant_handles.reader_make_constant_shell(makeString("BaseKB"));
  public static final SubLSymbol $kw15$CODE = makeKeyword("CODE");
  public static final SubLSymbol $kw16$TRUE_MON = makeKeyword("TRUE-MON");
  public static final SubLSymbol $kw17$REMOVAL_RELATION_ALL_EXISTS_PRUNE = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-PRUNE");
  public static final SubLList $list18 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLList $list19 = list(makeKeyword("FORT"), makeKeyword("ANYTHING"), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeKeyword("ANYTHING"), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")));
  public static final SubLList $list20 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(makeKeyword("BIND"), makeSymbol("TERM")), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), list(makeKeyword("BIND"), makeSymbol("RAE-TERM")), list(makeKeyword("BIND"), makeSymbol("RAE-PRED")), list(makeKeyword("BIND"), makeSymbol("IND-COL")), list(makeKeyword("BIND"), makeSymbol("DEP-COL"))));
  public static final SubLSymbol $sym21$DEP_COL = makeSymbol("DEP-COL");
  public static final SubLSymbol $sym22$IND_COL = makeSymbol("IND-COL");
  public static final SubLSymbol $sym23$RAE_PRED = makeSymbol("RAE-PRED");
  public static final SubLSymbol $sym24$RAE_TERM = makeSymbol("RAE-TERM");
  public static final SubLSymbol $sym25$TERM = makeSymbol("TERM");
  public static final SubLSymbol $sym26$PREDICATE = makeSymbol("PREDICATE");
  public static final SubLSymbol $kw27$POS = makeKeyword("POS");
  public static final SubLSymbol $kw28$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLSymbol $kw29$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw30$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLSymbol $kw31$OVERLAP = makeKeyword("OVERLAP");
  public static final SubLSymbol $kw32$REMOVAL_RELATION_ALL_EXISTS_CHECK = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-CHECK");
  public static final SubLList $list33 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-ALL-EXISTS-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object>\n  (#$RelationAllExistsFn <object> <predicate> <indep-col> <dep-col>)) \nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>)\nand  (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln \n  (#$RelationAllExistsFn #$AbrahamLincoln #$grandfathers #$Animal #$MaleAnimal))\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)")});
  public static final SubLSymbol $kw34$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw35$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $kw36$REMOVAL_RELATION_ALL_EXISTS_UNIFY = makeKeyword("REMOVAL-RELATION-ALL-EXISTS-UNIFY");
  public static final SubLList $list37 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("VARIABLE")), list(makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("RelationAllExistsFn")), makeKeyword("NOT-FULLY-BOUND"))))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-ALL-EXISTS-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <object> <not fully-bound>)\nwhere <object> is a TERM\nfrom (#$relationAllExists <predicate> <indep-col> <dep-col>) \nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$grandfathers #$AbrahamLincoln ?RELATIVE)\nfrom (#$relationAllExists #$grandfathers #$Animal #$MaleAnimal)\nand (#$isa #$AbrahamLincoln #$Animal)")});
  public static final SubLSymbol $kw38$RELATION_EXISTS_ALL_POS = makeKeyword("RELATION-EXISTS-ALL-POS");
  public static final SubLList $list39 = list(makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FULLY-BOUND"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("PREFERENCE"), makeSymbol("RELATION-EXISTS-ALL-POS-PREFERENCE"));
  public static final SubLList $list40 = list(makeKeyword("FULLY-BOUND"), cons(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeKeyword("FULLY-BOUND")), makeKeyword("NOT-FULLY-BOUND"));
  public static final SubLObject $const41$relationExistsAll = constant_handles.reader_make_constant_shell(makeString("relationExistsAll"));
  public static final SubLObject $const42$RelationExistsAllFn = constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn"));
  public static final SubLList $list43 = list(constant_handles.reader_make_constant_shell(makeString("implies")), list(constant_handles.reader_make_constant_shell(makeString("and")), list(constant_handles.reader_make_constant_shell(makeString("relationExistsAll")), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), list(constant_handles.reader_make_constant_shell(makeString("isa")), makeSymbol("?TERM"), makeSymbol("?INDEP-COL"))), list(makeSymbol("?PRED"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeSymbol("?TERM"), makeSymbol("?PRED"), makeSymbol("?DEP-COL"), makeSymbol("?INDEP-COL")), makeSymbol("?TERM")));
  public static final SubLSymbol $sym44$_RELATION_EXISTS_ALL_DEFINING_MT_ = makeSymbol("*RELATION-EXISTS-ALL-DEFINING-MT*");
  public static final SubLSymbol $kw45$REMOVAL_RELATION_EXISTS_ALL_PRUNE = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-PRUNE");
  public static final SubLList $list46 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("AND"), cons(makeKeyword("FORT"), makeKeyword("ANYTHING")), list(makeKeyword("TREE-FIND"), constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")))), makeKeyword("EXCLUSIVE"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-PRUNE"), makeKeyword("COST-EXPRESSION"), ZERO_INTEGER, makeKeyword("COMPLETENESS"), makeKeyword("COMPLETE"), makeKeyword("DOCUMENTATION"), makeString(""), makeKeyword("EXAMPLE"), makeString("")});
  public static final SubLList $list47 = list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeKeyword("ANYTHING"), makeKeyword("FORT"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING")), makeKeyword("ANYTHING"));
  public static final SubLList $list48 = list(list(makeKeyword("BIND"), makeSymbol("PREDICATE")), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), list(makeKeyword("BIND"), makeSymbol("REA-TERM")), list(makeKeyword("BIND"), makeSymbol("REA-PRED")), list(makeKeyword("BIND"), makeSymbol("DEP-COL")), list(makeKeyword("BIND"), makeSymbol("IND-COL"))), list(makeKeyword("BIND"), makeSymbol("TERM")));
  public static final SubLSymbol $sym49$REA_PRED = makeSymbol("REA-PRED");
  public static final SubLSymbol $sym50$REA_TERM = makeSymbol("REA-TERM");
  public static final SubLSymbol $kw51$REMOVAL_RELATION_EXISTS_ALL_CHECK = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-CHECK");
  public static final SubLList $list52 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("FORT"), list(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeKeyword("FULLY-BOUND"), makeKeyword("FORT"), makeKeyword("FULLY-BOUND"), makeKeyword("FULLY-BOUND")), makeKeyword("FULLY-BOUND")), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-REQUIRED"), makeKeyword("COST-EXPRESSION"), makeSymbol("*DEFAULT-RELATION-EXISTS-ALL-CHECK-COST*"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-CHECK-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> (#$RelationExistsAllFn <object> <predicate> <dep-col> <indep-col>) <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens (#$RelationExistsAllFn #$AbrahamLincoln #$citizens #$Country #$Person)\n  #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)")});
  public static final SubLSymbol $kw53$REMOVAL_RELATION_EXISTS_ALL_UNIFY = makeKeyword("REMOVAL-RELATION-EXISTS-ALL-UNIFY");
  public static final SubLList $list54 = list(new SubLObject[] {makeKeyword("SENSE"), makeKeyword("POS"), makeKeyword("ARITY"), TWO_INTEGER, makeKeyword("REQUIRED-PATTERN"), list(makeKeyword("OR"), list(makeKeyword("FORT"), makeKeyword("VARIABLE"), makeKeyword("FULLY-BOUND")), list(makeKeyword("FORT"), list(makeKeyword("NAT"), cons(constant_handles.reader_make_constant_shell(makeString("RelationExistsAllFn")), makeKeyword("NOT-FULLY-BOUND"))), makeKeyword("FULLY-BOUND"))), makeKeyword("REQUIRED"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-REQUIRED"), makeKeyword("COST"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-COST"), makeKeyword("COMPLETENESS"), makeKeyword("GROSSLY-INCOMPLETE"), makeKeyword("EXPAND"), makeSymbol("REMOVAL-RELATION-EXISTS-ALL-UNIFY-EXPAND"), makeKeyword("DOCUMENTATION"), makeString("(<predicate> <not fully-bound> <object>) \nwhere <object> is a TERM\nfrom (#$relationExistsAll <predicate> <dep-col> <indep-col>)\nand (#$isa <object> <indep-col>)"), makeKeyword("EXAMPLE"), makeString("(#$citizens ?WHERE #$AbrahamLincoln)\nfrom (#$relationExistsAll #$citizens #$Country #$Person)\nand (#$isa #$AbrahamLincoln #$Person)")});

  //// Initializers

  public void declareFunctions() {
    declare_removal_modules_relation_all_exists_file();
  }

  public void initializeVariables() {
    init_removal_modules_relation_all_exists_file();
  }

  public void runTopLevelForms() {
    setup_removal_modules_relation_all_exists_file();
  }

}
