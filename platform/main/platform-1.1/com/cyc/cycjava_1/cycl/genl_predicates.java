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

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.inference.modules.*;
import com.cyc.cycjava.cycl.sbhl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.keyhash_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.negation_predicate;
//dm import com.cyc.cycjava_1.cycl.obsolete;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_cache;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_graphs;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_link_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_links;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_macros;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_marking_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_module_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_paranoia;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_implied_relations;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_methods;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
//dm import com.cyc.cycjava_1.cycl.somewhere_cache;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class genl_predicates extends SubLTranslatedFile {

  //// Constructor

  private genl_predicates() {}
  public static final SubLFile me = new genl_predicates();
  public static final String myName = "com.cyc.cycjava_1.cycl.genl_predicates";

  //// Definitions

  /** Returns all genlPreds of predicate PRED 
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 7104) 
  public static final SubLObject all_genl_predicates(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(pred, $sym0$FORT_P);
    return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, mt, tv);
  }

  @SubL(source = "cycl/genl-predicates.lisp", position = 7759) 
  public static final SubLObject all_genl_preds(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return all_genl_predicates(pred, mt, tv);
  }

  /** Returns all genlPreds of predicate PRED 
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 7861) 
  public static final SubLObject all_genl_inverses(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(pred, $sym0$FORT_P);
    return sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const9$genlInverse), pred, mt, tv);
  }

  /** Returns all predicates having PRED as a genlPred 
   (descending transitive closure; expensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 8162) 
  public static final SubLObject all_spec_predicates(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(pred, $sym0$FORT_P);
    return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, mt, tv);
  }

  @SubL(source = "cycl/genl-predicates.lisp", position = 8502) 
  public static final SubLObject all_spec_preds(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return all_spec_predicates(pred, mt, tv);
  }

  /** Returns all predicates having PRED as a genlInverse
   (descending transitive closure; expensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 8604) 
  public static final SubLObject all_spec_inverses(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(pred, $sym0$FORT_P);
    return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($const9$genlInverse), pred, mt, tv);
  }

  /** Returns all genlPreds of predicate PRED, except for PRED.
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 9166) 
  public static final SubLObject all_proper_genl_predicates(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return Sequences.delete(pred, all_genl_predicates(pred, mt, tv), Symbols.symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Returns all genlInverses of predicate PRED,
   but will not return PRED if it is a genlInverse of itself.
   (ascending transitive closure; inexpensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 9414) 
  public static final SubLObject all_proper_genl_inverses(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return Sequences.delete(pred, all_genl_inverses(pred, mt, tv), Symbols.symbol_function(EQL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/genl-predicates.lisp", position = 17419) 
  public static final SubLObject some_all_spec_preds_and_inverses(SubLObject pred, SubLObject fn, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return sbhl_search_methods.sbhl_simply_gather_first_among_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, fn, mt, tv, UNPROVIDED);
  }

  /** Parameter used for arg type constraints in leaf predicate wrt arg-type searches */
  @SubL(source = "cycl/genl-predicates.lisp", position = 20429) 
  private static SubLSymbol $sbhl_arg_type_alist$ = null;

  /** Precomputed all-genls of each of the constraint collections for leaf predicate wrt arg-type searches. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 20877) 
  private static SubLSymbol $sbhl_arg_type_genls_stores$ = null;

  /** Returns the most-specific predicates in PREDS */
  @SubL(source = "cycl/genl-predicates.lisp", position = 25651) 
  public static final SubLObject min_predicates(SubLObject preds, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(preds, $sym67$LISTP);
    return sbhl_search_methods.sbhl_min_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), preds, mt, tv);
  }

  /** Returns the most-general predicates in PREDS */
  @SubL(source = "cycl/genl-predicates.lisp", position = 25916) 
  public static final SubLObject max_predicates(SubLObject preds, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(preds, $sym67$LISTP);
    return sbhl_search_methods.sbhl_max_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), preds, mt, tv, UNPROVIDED);
  }

  @SubL(source = "cycl/genl-predicates.lisp", position = 27417) 
  public static final SubLObject some_spec_predicate_or_inverse_somewhereP(SubLObject pred) {
    return makeBoolean(((NIL != somewhere_cache.some_pred_assertion_somewhereP($const1$genlPreds, pred, TWO_INTEGER, UNPROVIDED))
          || (NIL != somewhere_cache.some_pred_assertion_somewhereP($const9$genlInverse, pred, TWO_INTEGER, UNPROVIDED))));
  }

  /** Is GENL a genlPred of SPEC?
   (ascending transitive search; inexpensive) */
  @SubL(source = "cycl/genl-predicates.lisp", position = 27854) 
  public static final SubLObject genl_predicateP(SubLObject spec, SubLObject genl, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(spec, $sym0$FORT_P);
    checkType(genl, $sym0$FORT_P);
    if (((spec != genl)
         && (NIL == some_spec_predicate_or_inverse_somewhereP(genl)))) {
      return NIL;
    }
    return sbhl_search_methods.sbhl_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const1$genlPreds), spec, genl, mt, tv);
  }

  /** @return booleanp; whether PRED has some genlPred (other than itself) or some genlInverse? */
  @SubL(source = "cycl/genl-predicates.lisp", position = 37201) 
  public static final SubLObject some_genl_pred_or_inverseP(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return some_genl_pred_or_inverseP_int(pred, mt, tv);
  }

  /** @hack. does pred p have some genlPred (other than p) or some genlInverse? */
  @SubL(source = "cycl/genl-predicates.lisp", position = 37464) 
  public static final SubLObject some_genl_pred_or_inverseP_int(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return makeBoolean(((NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, mt, tv, UNPROVIDED))
          || (NIL != sbhl_link_methods.sbhl_forward_true_link_nodes(sbhl_module_vars.get_sbhl_module($const9$genlInverse), pred, mt, tv, UNPROVIDED))));
  }

  /** @return booleanp; whether PRED is the genlPred of some other pred or genlInverse of some other pred? */
  @SubL(source = "cycl/genl-predicates.lisp", position = 37801) 
  public static final SubLObject some_spec_pred_or_inverseP(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return some_spec_pred_or_inverseP_int(pred, mt, tv);
  }

  /** @hack. is pred p the genlPred of some pred other than p or genlInverse of some pred? */
  @SubL(source = "cycl/genl-predicates.lisp", position = 38073) 
  public static final SubLObject some_spec_pred_or_inverseP_int(SubLObject pred, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    return makeBoolean(((NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, mt, tv, UNPROVIDED))
          || (NIL != sbhl_link_methods.sbhl_backward_true_link_nodes(sbhl_module_vars.get_sbhl_module($const9$genlInverse), pred, mt, tv, UNPROVIDED))));
  }

  @SubL(source = "cycl/genl-predicates.lisp", position = 45504) 
  private static SubLSymbol $cached_candidate_genl_preds_caching_state$ = null;

  @SubL(source = "cycl/genl-predicates.lisp", position = 45597) 
  private static SubLSymbol $cached_candidate_genl_preds_in_mt_caching_state$ = null;

  /** @return booleanp; whether there are any asserted true genl-predicate links for PRED. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 51656) 
  public static final SubLObject asserted_genl_predicatesP(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($const1$genlPreds), pred, mt);
  }

  /** @return booleanp; whether there are any asserted true genl-inverse links for PRED. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 54256) 
  public static final SubLObject asserted_genl_inversesP(SubLObject pred, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($const9$genlInverse), pred, mt);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 56265) 
  public static final SubLObject genl_predicate_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const1$genlPreds));
    sbhl_cache.sbhl_cache_addition_maintainence(assertion);
    after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
    return NIL;
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 56774) 
  public static final SubLObject add_genl_predicate(SubLObject source, SubLObject assertion) {
    genl_predicate_after_adding(source, assertion);
    return NIL;
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 56955) 
  public static final SubLObject genl_inverse_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const9$genlInverse));
    sbhl_cache.sbhl_cache_addition_maintainence(assertion);
    after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
    return NIL;
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 57266) 
  public static final SubLObject add_genl_inverse(SubLObject source, SubLObject assertion) {
    genl_inverse_after_adding(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 57443) 
  public static final SubLObject remove_genl_predicate(SubLObject source, SubLObject assertion) {
    genl_predicate_after_removing(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 57704) 
  public static final SubLObject remove_genl_inverse(SubLObject source, SubLObject assertion) {
    genl_inverse_after_removing(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 57893) 
  public static final SubLObject genl_predicate_after_removing(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const1$genlPreds));
    sbhl_cache.sbhl_cache_removal_maintainence(assertion);
    after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/genl-predicates.lisp", position = 58214) 
  public static final SubLObject genl_inverse_after_removing(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const9$genlInverse));
    sbhl_cache.sbhl_cache_removal_maintainence(assertion);
    after_adding_modules.clear_genl_pred_dependent_caches(source, assertion);
    return NIL;
  }

  public static final SubLObject declare_genl_predicates_file() {
    //declareFunction(myName, "genl_predicates", "GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "min_genl_predicates", "MIN-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "genl_inverses", "GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "min_genl_inverses", "MIN-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "not_genl_predicates", "NOT-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "max_not_genl_predicates", "MAX-NOT-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "not_genl_inverses", "NOT-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "max_not_genl_inverses", "MAX-NOT-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "spec_predicates", "SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "max_spec_predicates", "MAX-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "spec_inverses", "SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "max_spec_inverses", "MAX-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "not_spec_predicates", "NOT-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "min_not_spec_predicates", "MIN-NOT-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "not_spec_inverses", "NOT-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "min_not_spec_inverses", "MIN-NOT-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "genl_predicate_siblings", "GENL-PREDICATE-SIBLINGS", 1, 2, false);
    //declareFunction(myName, "genl_inverse_siblings", "GENL-INVERSE-SIBLINGS", 1, 2, false);
    //declareFunction(myName, "spec_predicate_siblings", "SPEC-PREDICATE-SIBLINGS", 1, 2, false);
    //declareFunction(myName, "spec_inverse_siblings", "SPEC-INVERSE-SIBLINGS", 1, 2, false);
    //declareFunction(myName, "genl_predicate_roots", "GENL-PREDICATE-ROOTS", 1, 2, false);
    //declareFunction(myName, "genl_inverse_roots", "GENL-INVERSE-ROOTS", 1, 2, false);
    declareFunction(myName, "all_genl_predicates", "ALL-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "all_genl_predicates_and_inverses", "ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
    declareFunction(myName, "all_genl_preds", "ALL-GENL-PREDS", 1, 2, false);
    declareFunction(myName, "all_genl_inverses", "ALL-GENL-INVERSES", 1, 2, false);
    declareFunction(myName, "all_spec_predicates", "ALL-SPEC-PREDICATES", 1, 2, false);
    declareFunction(myName, "all_spec_preds", "ALL-SPEC-PREDS", 1, 2, false);
    declareFunction(myName, "all_spec_inverses", "ALL-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_spec_predicates_and_inverses", "ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
    declareFunction(myName, "all_proper_genl_predicates", "ALL-PROPER-GENL-PREDICATES", 1, 2, false);
    declareFunction(myName, "all_proper_genl_inverses", "ALL-PROPER-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_proper_genl_predicates_and_inverses", "ALL-PROPER-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_proper_spec_predicates", "ALL-PROPER-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "all_proper_spec_inverses", "ALL-PROPER-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_proper_spec_predicates_and_inverses", "ALL-PROPER-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_genl_preds_among", "ALL-GENL-PREDS-AMONG", 2, 2, false);
    //declareFunction(myName, "all_spec_predicates_among", "ALL-SPEC-PREDICATES-AMONG", 2, 2, false);
    //declareFunction(myName, "all_genl_inverses_among", "ALL-GENL-INVERSES-AMONG", 2, 2, false);
    //declareFunction(myName, "all_spec_inverses_among", "ALL-SPEC-INVERSES-AMONG", 2, 2, false);
    //declareFunction(myName, "all_not_genl_predicates", "ALL-NOT-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "all_not_genl_preds", "ALL-NOT-GENL-PREDS", 1, 2, false);
    //declareFunction(myName, "all_not_genl_inverses", "ALL-NOT-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_not_spec_predicates", "ALL-NOT-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "all_not_spec_preds", "ALL-NOT-SPEC-PREDS", 1, 2, false);
    //declareFunction(myName, "all_not_spec_inverses", "ALL-NOT-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "union_all_genl_predicates", "UNION-ALL-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "union_all_spec_predicates", "UNION-ALL-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "union_all_genl_inverses", "UNION-ALL-GENL-INVERSES", 1, 2, false);
    //declareFunction(myName, "union_all_spec_inverses", "UNION-ALL-SPEC-INVERSES", 1, 2, false);
    //declareFunction(myName, "union_all_spec_predicates_and_inverses", "UNION-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
    //declareFunction(myName, "map_all_genl_preds", "MAP-ALL-GENL-PREDS", 2, 2, false);
    //declareFunction(myName, "some_all_genl_preds", "SOME-ALL-GENL-PREDS", 2, 2, false);
    //declareFunction(myName, "some_all_genl_inverses", "SOME-ALL-GENL-INVERSES", 2, 2, false);
    //declareFunction(myName, "some_all_genl_preds_and_inverses", "SOME-ALL-GENL-PREDS-AND-INVERSES", 2, 2, false);
    //declareFunction(myName, "map_all_spec_preds", "MAP-ALL-SPEC-PREDS", 2, 2, false);
    //declareFunction(myName, "map_spec_preds", "MAP-SPEC-PREDS", 2, 1, false);
    //declareFunction(myName, "map_all_spec_preds_and_inverses", "MAP-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
    //declareFunction(myName, "some_all_spec_preds", "SOME-ALL-SPEC-PREDS", 2, 2, false);
    declareFunction(myName, "some_all_spec_preds_and_inverses", "SOME-ALL-SPEC-PREDS-AND-INVERSES", 2, 2, false);
    //declareFunction(myName, "count_all_genl_predicates", "COUNT-ALL-GENL-PREDICATES", 1, 2, false);
    //declareFunction(myName, "count_all_genl_predicates_and_inverses", "COUNT-ALL-GENL-PREDICATES-AND-INVERSES", 1, 2, false);
    //declareFunction(myName, "count_all_spec_predicates", "COUNT-ALL-SPEC-PREDICATES", 1, 2, false);
    //declareFunction(myName, "count_all_spec_predicates_and_inverses", "COUNT-ALL-SPEC-PREDICATES-AND-INVERSES", 1, 2, false);
    //declareFunction(myName, "all_spec_preds_wrt_type", "ALL-SPEC-PREDS-WRT-TYPE", 3, 2, false);
    //declareFunction(myName, "all_spec_preds_wrt_arg", "ALL-SPEC-PREDS-WRT-ARG", 3, 2, false);
    //declareFunction(myName, "gather_if_searched_arg_constraints", "GATHER-IF-SEARCHED-ARG-CONSTRAINTS", 1, 0, false);
    //declareFunction(myName, "get_sbhl_arg_type_alist", "GET-SBHL-ARG-TYPE-ALIST", 0, 0, false);
    //declareMacro(myName, "with_sbhl_arg_type_alist", "WITH-SBHL-ARG-TYPE-ALIST");
    //declareFunction(myName, "get_sbhl_arg_type_store", "GET-SBHL-ARG-TYPE-STORE", 1, 0, false);
    //declareMacro(myName, "with_new_sbhl_arg_type_genls_stores", "WITH-NEW-SBHL-ARG-TYPE-GENLS-STORES");
    //declareFunction(myName, "sbhl_initialize_arg_type_genls_stores", "SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES", 1, 0, false);
    //declareFunction(myName, "sbhl_arg_types_alist_satisfied_p", "SBHL-ARG-TYPES-ALIST-SATISFIED-P", 1, 0, false);
    //declareFunction(myName, "leaf_predicates_wrt_arg_type", "LEAF-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
    //declareFunction(myName, "sbhl_add_leaf_predicates_to_result", "SBHL-ADD-LEAF-PREDICATES-TO-RESULT", 1, 0, false);
    //declareFunction(myName, "pred_is_typed_spec_pred_p", "PRED-IS-TYPED-SPEC-PRED-P", 2, 0, false);
    //declareFunction(myName, "typed_spec_predicates_wrt_arg_type", "TYPED-SPEC-PREDICATES-WRT-ARG-TYPE", 2, 0, false);
    //declareFunction(myName, "leaf_predicates_mark_and_sweep", "LEAF-PREDICATES-MARK-AND-SWEEP", 1, 0, false);
    declareFunction(myName, "min_predicates", "MIN-PREDICATES", 1, 2, false);
    declareFunction(myName, "max_predicates", "MAX-PREDICATES", 1, 2, false);
    //declareFunction(myName, "min_ceiling_predicates", "MIN-CEILING-PREDICATES", 1, 3, false);
    //declareFunction(myName, "max_floor_predicates", "MAX-FLOOR-PREDICATES", 1, 3, false);
    declareFunction(myName, "some_spec_predicate_or_inverse_somewhereP", "SOME-SPEC-PREDICATE-OR-INVERSE-SOMEWHERE?", 1, 0, false);
    declareFunction(myName, "genl_predicateP", "GENL-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "genl_predicate_in_any_mtP", "GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
    //declareFunction(myName, "genl_predP", "GENL-PRED?", 2, 2, false);
    //declareFunction(myName, "spec_predP", "SPEC-PRED?", 2, 2, false);
    //declareFunction(myName, "spec_predicateP", "SPEC-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "genl_inverseP", "GENL-INVERSE?", 2, 2, false);
    //declareFunction(myName, "spec_inverseP", "SPEC-INVERSE?", 2, 2, false);
    //declareFunction(myName, "genl_predicate_ofP", "GENL-PREDICATE-OF?", 2, 2, false);
    //declareFunction(myName, "genl_inverse_ofP", "GENL-INVERSE-OF?", 2, 2, false);
    //declareFunction(myName, "any_genl_predicateP", "ANY-GENL-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "any_genl_predP", "ANY-GENL-PRED?", 2, 2, false);
    //declareFunction(myName, "any_genl_predicate_in_any_mtP", "ANY-GENL-PREDICATE-IN-ANY-MT?", 2, 0, false);
    //declareFunction(myName, "any_genl_inverseP", "ANY-GENL-INVERSE?", 2, 2, false);
    //declareFunction(myName, "not_genl_predicateP", "NOT-GENL-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "not_genl_predP", "NOT-GENL-PRED?", 2, 2, false);
    //declareFunction(myName, "not_spec_predicateP", "NOT-SPEC-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "argue_not_genl_predicateP", "ARGUE-NOT-GENL-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "not_genl_inverseP", "NOT-GENL-INVERSE?", 2, 2, false);
    //declareFunction(myName, "not_spec_inverseP", "NOT-SPEC-INVERSE?", 2, 1, false);
    //declareFunction(myName, "argue_not_genl_inverseP", "ARGUE-NOT-GENL-INVERSE?", 2, 2, false);
    //declareFunction(myName, "any_not_genl_predicateP", "ANY-NOT-GENL-PREDICATE?", 2, 2, false);
    //declareFunction(myName, "random_genl_predicate_of", "RANDOM-GENL-PREDICATE-OF", 1, 2, false);
    //declareFunction(myName, "random_spec_predicate_of", "RANDOM-SPEC-PREDICATE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_genl_predicate_of", "RANDOM-PROPER-GENL-PREDICATE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_spec_predicate_of", "RANDOM-PROPER-SPEC-PREDICATE-OF", 1, 2, false);
    //declareFunction(myName, "random_genl_inverse_of", "RANDOM-GENL-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_spec_inverse_of", "RANDOM-SPEC-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_genl_inverse_of", "RANDOM-PROPER-GENL-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_spec_inverse_of", "RANDOM-PROPER-SPEC-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_genl_predicate_or_inverse_of", "RANDOM-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_spec_predicate_or_inverse_of", "RANDOM-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_genl_predicate_or_inverse_of", "RANDOM-PROPER-GENL-PREDICATE-OR-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "random_proper_spec_predicate_or_inverse_of", "RANDOM-PROPER-SPEC-PREDICATE-OR-INVERSE-OF", 1, 2, false);
    //declareFunction(myName, "any_spec_predP", "ANY-SPEC-PRED?", 2, 2, false);
    //declareFunction(myName, "any_spec_inverseP", "ANY-SPEC-INVERSE?", 2, 2, false);
    declareFunction(myName, "some_genl_pred_or_inverseP", "SOME-GENL-PRED-OR-INVERSE?", 1, 2, false);
    declareFunction(myName, "some_genl_pred_or_inverseP_int", "SOME-GENL-PRED-OR-INVERSE?-INT", 1, 2, false);
    declareFunction(myName, "some_spec_pred_or_inverseP", "SOME-SPEC-PRED-OR-INVERSE?", 1, 2, false);
    declareFunction(myName, "some_spec_pred_or_inverseP_int", "SOME-SPEC-PRED-OR-INVERSE?-INT", 1, 2, false);
    //declareFunction(myName, "intersecting_predicatesP", "INTERSECTING-PREDICATES?", 2, 1, false);
    //declareFunction(myName, "predicates_intersectP", "PREDICATES-INTERSECT?", 2, 1, false);
    //declareFunction(myName, "preds_intersectP", "PREDS-INTERSECT?", 2, 1, false);
    //declareFunction(myName, "why_genl_predicateP", "WHY-GENL-PREDICATE?", 2, 3, false);
    //declareFunction(myName, "why_not_genl_predicateP", "WHY-NOT-GENL-PREDICATE?", 2, 3, false);
    //declareFunction(myName, "why_genl_inverseP", "WHY-GENL-INVERSE?", 2, 3, false);
    //declareFunction(myName, "why_spec_inverseP", "WHY-SPEC-INVERSE?", 2, 3, false);
    //declareFunction(myName, "why_not_genl_inverseP", "WHY-NOT-GENL-INVERSE?", 2, 3, false);
    //declareFunction(myName, "why_some_genl_predicate_amongP", "WHY-SOME-GENL-PREDICATE-AMONG?", 2, 3, false);
    //declareFunction(myName, "why_some_genl_inverse_amongP", "WHY-SOME-GENL-INVERSE-AMONG?", 2, 3, false);
    //declareFunction(myName, "max_floor_mts_of_genl_predicate_paths", "MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_genl_pred_paths", "MAX-FLOOR-MTS-OF-GENL-PRED-PATHS", 2, 0, false);
    //declareFunction(myName, "min_mts_of_genl_predicate_paths", "MIN-MTS-OF-GENL-PREDICATE-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_genl_pred_paths", "MIN-MTS-OF-GENL-PRED-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_not_genl_predicate_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_not_genl_predicate_paths", "MIN-MTS-OF-NOT-GENL-PREDICATE-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_genl_inverse_paths", "MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_genl_inverse_paths", "MIN-MTS-OF-GENL-INVERSE-PATHS", 2, 1, false);
    //declareFunction(myName, "max_floor_mts_of_not_genl_inverse_paths", "MAX-FLOOR-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
    //declareFunction(myName, "min_mts_of_not_genl_inverse_paths", "MIN-MTS-OF-NOT-GENL-INVERSE-PATHS", 2, 1, false);
    //declareFunction(myName, "min_candidate_genl_preds", "MIN-CANDIDATE-GENL-PREDS", 1, 2, false);
    //declareFunction(myName, "cached_min_candidate_genl_preds", "CACHED-MIN-CANDIDATE-GENL-PREDS", 1, 1, false);
    //declareFunction(myName, "cached_min_candidate_genl_preds_in_mt", "CACHED-MIN-CANDIDATE-GENL-PREDS-IN-MT", 2, 1, false);
    //declareFunction(myName, "clear_cached_candidate_genl_preds", "CLEAR-CACHED-CANDIDATE-GENL-PREDS", 0, 0, false);
    //declareFunction(myName, "remove_cached_candidate_genl_preds", "REMOVE-CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
    //declareFunction(myName, "cached_candidate_genl_preds_internal", "CACHED-CANDIDATE-GENL-PREDS-INTERNAL", 1, 0, false);
    //declareFunction(myName, "cached_candidate_genl_preds", "CACHED-CANDIDATE-GENL-PREDS", 1, 0, false);
    //declareFunction(myName, "clear_cached_candidate_genl_preds_in_mt", "CLEAR-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 0, 0, false);
    //declareFunction(myName, "remove_cached_candidate_genl_preds_in_mt", "REMOVE-CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
    //declareFunction(myName, "cached_candidate_genl_preds_in_mt_internal", "CACHED-CANDIDATE-GENL-PREDS-IN-MT-INTERNAL", 2, 0, false);
    //declareFunction(myName, "cached_candidate_genl_preds_in_mt", "CACHED-CANDIDATE-GENL-PREDS-IN-MT", 2, 0, false);
    //declareFunction(myName, "candidate_genl_preds", "CANDIDATE-GENL-PREDS", 1, 1, false);
    //declareFunction(myName, "candidate_preds_for_arg_type", "CANDIDATE-PREDS-FOR-ARG-TYPE", 2, 2, false);
    //declareFunction(myName, "candidate_preds_for_arg_isa", "CANDIDATE-PREDS-FOR-ARG-ISA", 1, 0, false);
    //declareFunction(myName, "candidate_preds_for_arg_genl", "CANDIDATE-PREDS-FOR-ARG-GENL", 1, 0, false);
    //declareFunction(myName, "min_preds_wrt_arg_types", "MIN-PREDS-WRT-ARG-TYPES", 1, 1, false);
    //declareFunction(myName, "min_preds_wrt_arg_isa", "MIN-PREDS-WRT-ARG-ISA", 1, 1, false);
    //declareFunction(myName, "min_preds_wrt_arg_genl", "MIN-PREDS-WRT-ARG-GENL", 1, 1, false);
    //declareFunction(myName, "genl_predicate_mts", "GENL-PREDICATE-MTS", 1, 0, false);
    //declareFunction(myName, "genl_predicate_forward_mts", "GENL-PREDICATE-FORWARD-MTS", 1, 0, false);
    //declareFunction(myName, "genl_predicate_backward_mts", "GENL-PREDICATE-BACKWARD-MTS", 1, 0, false);
    declareFunction(myName, "asserted_genl_predicatesP", "ASSERTED-GENL-PREDICATES?", 1, 1, false);
    //declareFunction(myName, "asserted_genl_predicates", "ASSERTED-GENL-PREDICATES", 1, 1, false);
    //declareFunction(myName, "asserted_not_genl_predicates", "ASSERTED-NOT-GENL-PREDICATES", 1, 1, false);
    //declareFunction(myName, "supported_genl_predicates", "SUPPORTED-GENL-PREDICATES", 1, 1, false);
    //declareFunction(myName, "supported_not_genl_predicates", "SUPPORTED-NOT-GENL-PREDICATES", 1, 1, false);
    //declareFunction(myName, "asserted_spec_predicates", "ASSERTED-SPEC-PREDICATES", 1, 1, false);
    //declareFunction(myName, "asserted_not_spec_predicates", "ASSERTED-NOT-SPEC-PREDICATES", 1, 1, false);
    //declareFunction(myName, "supported_spec_predicates", "SUPPORTED-SPEC-PREDICATES", 1, 1, false);
    //declareFunction(myName, "supported_not_spec_predicates", "SUPPORTED-NOT-SPEC-PREDICATES", 1, 1, false);
    //declareFunction(myName, "genl_inverse_mts", "GENL-INVERSE-MTS", 1, 0, false);
    //declareFunction(myName, "genl_inverse_forward_mts", "GENL-INVERSE-FORWARD-MTS", 1, 0, false);
    //declareFunction(myName, "genl_inverse_backward_mts", "GENL-INVERSE-BACKWARD-MTS", 1, 0, false);
    declareFunction(myName, "asserted_genl_inversesP", "ASSERTED-GENL-INVERSES?", 1, 1, false);
    //declareFunction(myName, "asserted_genl_inverses", "ASSERTED-GENL-INVERSES", 1, 1, false);
    //declareFunction(myName, "asserted_not_genl_inverses", "ASSERTED-NOT-GENL-INVERSES", 1, 1, false);
    //declareFunction(myName, "supported_genl_inverses", "SUPPORTED-GENL-INVERSES", 1, 1, false);
    //declareFunction(myName, "supported_not_genl_inverses", "SUPPORTED-NOT-GENL-INVERSES", 1, 1, false);
    //declareFunction(myName, "asserted_spec_inverses", "ASSERTED-SPEC-INVERSES", 1, 1, false);
    //declareFunction(myName, "asserted_not_spec_inverses", "ASSERTED-NOT-SPEC-INVERSES", 1, 1, false);
    //declareFunction(myName, "supported_spec_inverses", "SUPPORTED-SPEC-INVERSES", 1, 1, false);
    //declareFunction(myName, "supported_not_spec_inverses", "SUPPORTED-NOT-SPEC-INVERSES", 1, 1, false);
    declareFunction(myName, "genl_predicate_after_adding", "GENL-PREDICATE-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "add_genl_predicate", "ADD-GENL-PREDICATE", 2, 0, false);
    declareFunction(myName, "genl_inverse_after_adding", "GENL-INVERSE-AFTER-ADDING", 2, 0, false);
    declareFunction(myName, "add_genl_inverse", "ADD-GENL-INVERSE", 2, 0, false);
    declareFunction(myName, "remove_genl_predicate", "REMOVE-GENL-PREDICATE", 2, 0, false);
    declareFunction(myName, "remove_genl_inverse", "REMOVE-GENL-INVERSE", 2, 0, false);
    declareFunction(myName, "genl_predicate_after_removing", "GENL-PREDICATE-AFTER-REMOVING", 2, 0, false);
    declareFunction(myName, "genl_inverse_after_removing", "GENL-INVERSE-AFTER-REMOVING", 2, 0, false);
    //declareFunction(myName, "clear_predicate_graph", "CLEAR-PREDICATE-GRAPH", 0, 0, false);
    //declareFunction(myName, "clear_genl_predicate_graph", "CLEAR-GENL-PREDICATE-GRAPH", 0, 0, false);
    //declareFunction(myName, "clear_genl_inverse_graph", "CLEAR-GENL-INVERSE-GRAPH", 0, 0, false);
    //declareFunction(myName, "clear_node_genl_predicate_links", "CLEAR-NODE-GENL-PREDICATE-LINKS", 1, 0, false);
    //declareFunction(myName, "clear_node_genl_inverse_links", "CLEAR-NODE-GENL-INVERSE-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_genl_predicate_links", "RESET-GENL-PREDICATE-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_genl_inverse_links", "RESET-GENL-INVERSE-LINKS", 1, 0, false);
    //declareFunction(myName, "reset_predicate_genls_links_in_mt", "RESET-PREDICATE-GENLS-LINKS-IN-MT", 2, 0, false);
    //declareFunction(myName, "reset_genl_predicate_links_in_mt", "RESET-GENL-PREDICATE-LINKS-IN-MT", 2, 0, false);
    //declareFunction(myName, "reset_genl_inverse_links_in_mt", "RESET-GENL-INVERSE-LINKS-IN-MT", 2, 0, false);
    //declareFunction(myName, "reset_predicate_graph", "RESET-PREDICATE-GRAPH", 0, 1, false);
    //declareFunction(myName, "reset_genl_predicate_graph", "RESET-GENL-PREDICATE-GRAPH", 0, 1, false);
    //declareFunction(myName, "reset_genl_inverse_graph", "RESET-GENL-INVERSE-GRAPH", 0, 1, false);
    return NIL;
  }

  public static final SubLObject init_genl_predicates_file() {
    $sbhl_arg_type_alist$ = defparameter("*SBHL-ARG-TYPE-ALIST*", NIL);
    $sbhl_arg_type_genls_stores$ = defparameter("*SBHL-ARG-TYPE-GENLS-STORES*", NIL);
    $cached_candidate_genl_preds_caching_state$ = deflexical("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*", NIL);
    $cached_candidate_genl_preds_in_mt_caching_state$ = deflexical("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_genl_predicates_file() {
    // CVS_ID("Id: genl-predicates.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym2$GENL_PREDICATES, $list3, $str4$Returns_the_local_genlPreds_of_PR, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym7$MIN_GENL_PREDICATES, $list3, $str8$Returns_the_most_specific_local_g, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym10$GENL_INVERSES, $list3, $str11$Returns_the_local_genlInverses_of, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym12$MIN_GENL_INVERSES, $list3, $str13$Returns_the_most_specific_local_g, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym14$NOT_GENL_PREDICATES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym16$MAX_NOT_GENL_PREDICATES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym18$NOT_GENL_INVERSES, $list3, $str15$Returns_the_local_negated_genlPre, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym19$MAX_NOT_GENL_INVERSES, $list3, $str17$Returns_the_most_general_local_ne, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym20$SPEC_PREDICATES, $list3, $str21$Returns_the_specPreds_of_PRED, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym22$MAX_SPEC_PREDICATES, $list3, $str23$Returns_the_most_general_specPred, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym24$SPEC_INVERSES, $list3, $str25$Returns_the_specInverses_of_PRED, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym26$MAX_SPEC_INVERSES, $list3, $str27$Returns_the_most_general_specInve, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym28$NOT_SPEC_PREDICATES, $list3, $str29$Returns_the_negated_specPreds_of_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym30$MIN_NOT_SPEC_PREDICATES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym32$NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym33$MIN_NOT_SPEC_INVERSES, $list3, $str31$Returns_the_most_specific_negated, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym34$GENL_PREDICATE_SIBLINGS, $list3, $str35$Returns_the_direct___genlPreds_of, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym36$GENL_INVERSE_SIBLINGS, $list3, $str37$Returns_the_direct___genlInverse_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym38$SPEC_PREDICATE_SIBLINGS, $list3, $str39$Returns_the_direct_spec_preds_of_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym40$SPEC_INVERSE_SIBLINGS, $list3, $str41$Returns_the_direct_spec_inverses_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym42$GENL_PREDICATE_ROOTS, $list3, $str43$Returns_the_most_general_genlPred, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym44$GENL_INVERSE_ROOTS, $list3, $str45$Returns_the_most_general_genlInve, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym46$ALL_GENL_PREDICATES, $list3, $str47$Returns_all_genlPreds_of_predicat, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym61$ALL_GENL_INVERSES, $list3, $str47$Returns_all_genlPreds_of_predicat, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym62$ALL_SPEC_PREDICATES, $list3, $str63$Returns_all_predicates_having_PRE, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym64$ALL_SPEC_INVERSES, $list3, $str65$Returns_all_predicates_having_PRE, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym68$ALL_GENL_PREDS_AMONG, $list69, $str70$Returns_those_genlPreds_of_PRED_t, $list71, $list6);
    utilities_macros.register_cyc_api_function($sym72$ALL_NOT_GENL_PREDICATES, $list3, $str73$Returns_all_negated_genlPreds_of_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym74$ALL_NOT_GENL_INVERSES, $list3, $str73$Returns_all_negated_genlPreds_of_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym75$ALL_NOT_SPEC_PREDICATES, $list3, $str76$Returns_all_negated_specPreds_of_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym77$ALL_NOT_SPEC_INVERSES, $list3, $str78$Returns_all_predicates_having_PRE, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym79$UNION_ALL_GENL_PREDICATES, $list80, $str81$Returns_all_genl_predicates_of_ea, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym83$UNION_ALL_SPEC_PREDICATES, $list80, $str84$Returns_all_spec_predicates_of_ea, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym85$UNION_ALL_GENL_INVERSES, $list80, $str86$Returns_all_genl_inverses_of_each, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym87$UNION_ALL_SPEC_INVERSES, $list80, $str88$Returns_all_specs_of_each_predica, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym90$MAP_ALL_GENL_PREDS, $list91, $str92$Apply_FN_to_each_genlPred_of_PRED, $list93, NIL);
    utilities_macros.register_cyc_api_function($sym94$SOME_ALL_GENL_PREDS, $list91, $str95$Apply_FN_to_each_genlPred_of_PRED, $list93, NIL);
    utilities_macros.register_cyc_api_function($sym96$SOME_ALL_GENL_INVERSES, $list91, $str95$Apply_FN_to_each_genlPred_of_PRED, $list93, NIL);
    utilities_macros.register_cyc_api_function($sym97$MAP_ALL_SPEC_PREDS, $list91, $str92$Apply_FN_to_each_genlPred_of_PRED, $list93, NIL);
    utilities_macros.register_cyc_api_function($sym98$SOME_ALL_SPEC_PREDS, $list91, $str95$Apply_FN_to_each_genlPred_of_PRED, $list93, NIL);
    utilities_macros.register_cyc_api_function($sym102$ALL_SPEC_PREDS_WRT_TYPE, $list103, $str104$Returns_those_all_spec_preds_of_P, $list105, $list6);
    utilities_macros.register_cyc_api_function($sym107$ALL_SPEC_PREDS_WRT_ARG, $list108, $str109$Returns_those_all_spec_preds_of_P, $list110, $list6);
    utilities_macros.register_cyc_api_function($sym124$MIN_PREDICATES, $list80, $str125$Returns_the_most_specific_predica, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym126$MAX_PREDICATES, $list80, $str127$Returns_the_most_general_predicat, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym128$MIN_CEILING_PREDICATES, $list129, $str130$Returns_the_most_specific_common_, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym132$MAX_FLOOR_PREDICATES, $list129, $str133$Returns_the_most_general_common_s, $list82, $list6);
    utilities_macros.register_cyc_api_function($sym134$GENL_PREDICATE_, $list135, $str136$Is_GENL_a_genlPred_of_SPEC______a, $list137, $list138);
    utilities_macros.register_cyc_api_function($sym141$SPEC_PREDICATE_, $list142, $str136$Is_GENL_a_genlPred_of_SPEC______a, $list143, $list138);
    utilities_macros.register_cyc_api_function($sym144$GENL_INVERSE_, $list135, $str145$Is_GENL_a_genlInverse_of_SPEC____, $list137, $list138);
    utilities_macros.register_cyc_api_function($sym146$SPEC_INVERSE_, $list142, $str145$Is_GENL_a_genlInverse_of_SPEC____, $list137, $list138);
    utilities_macros.register_cyc_api_function($sym147$ANY_GENL_PREDICATE_, $list148, $str149$Returns_T_iff__genl_predicate__SP, $list150, $list138);
    utilities_macros.register_cyc_api_function($sym151$NOT_GENL_PREDICATE_, $list152, $str153$Is_NOT_GENL_known_to_be_not_a_gen, $list154, $list138);
    utilities_macros.register_cyc_api_function($sym155$NOT_GENL_INVERSE_, $list152, $str156$Is_NOT_GENL_a_negated_genlInverse, $list154, $list138);
    utilities_macros.register_cyc_api_function($sym157$ANY_NOT_GENL_PREDICATE_, $list158, $str159$Is_any_predicate_in_NOT_GENLS_not, $list160, $list138);
    utilities_macros.register_cyc_api_function($sym163$INTERSECTING_PREDICATES_, $list164, $str165$Does_the_extension_of_PRED1_inclu, $list166, $list138);
    utilities_macros.register_cyc_api_function($sym167$WHY_GENL_PREDICATE_, $list168, $str169$A_justification_of__genlPreds_SPE, $list137, $list170);
    utilities_macros.register_cyc_api_function($sym171$WHY_NOT_GENL_PREDICATE_, $list168, $str172$A_justification_of__not__genlPred, $list137, $list170);
    utilities_macros.register_cyc_api_function($sym173$WHY_GENL_INVERSE_, $list174, $str175$A_justification_of__genlInverse_P, $list176, $list170);
    utilities_macros.register_cyc_api_function($sym178$WHY_NOT_GENL_INVERSE_, $list168, $str179$A_justification_of__not__genlInve, $list137, $list170);
    utilities_macros.register_cyc_api_function($sym181$MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS, $list182, $str183$_return_listp__In_what__most_genl, $list137, NIL);
    utilities_macros.register_cyc_api_function($sym184$MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS, $list185, $str186$In_what__most_genl__mts_is_GENL_I, $list187, NIL);
    memoization_state.note_globally_cached_function($sym188$CACHED_CANDIDATE_GENL_PREDS);
    memoization_state.note_globally_cached_function($sym192$CACHED_CANDIDATE_GENL_PREDS_IN_MT);
    utilities_macros.register_kb_function($sym200$GENL_PREDICATE_AFTER_ADDING);
    utilities_macros.register_kb_function($sym201$ADD_GENL_PREDICATE);
    utilities_macros.register_kb_function($sym202$GENL_INVERSE_AFTER_ADDING);
    utilities_macros.register_kb_function($sym203$ADD_GENL_INVERSE);
    utilities_macros.register_kb_function($sym204$REMOVE_GENL_PREDICATE);
    utilities_macros.register_kb_function($sym205$REMOVE_GENL_INVERSE);
    utilities_macros.register_kb_function($sym206$GENL_PREDICATE_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym207$GENL_INVERSE_AFTER_REMOVING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$FORT_P = makeSymbol("FORT-P");
  public static final SubLObject $const1$genlPreds = constant_handles.reader_make_constant_shell(makeString("genlPreds"));
  public static final SubLSymbol $sym2$GENL_PREDICATES = makeSymbol("GENL-PREDICATES");
  public static final SubLList $list3 = list(makeSymbol("PRED"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str4$Returns_the_local_genlPreds_of_PR = makeString("Returns the local genlPreds of PRED");
  public static final SubLList $list5 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")));
  public static final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym7$MIN_GENL_PREDICATES = makeSymbol("MIN-GENL-PREDICATES");
  public static final SubLString $str8$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlPreds of PRED");
  public static final SubLObject $const9$genlInverse = constant_handles.reader_make_constant_shell(makeString("genlInverse"));
  public static final SubLSymbol $sym10$GENL_INVERSES = makeSymbol("GENL-INVERSES");
  public static final SubLString $str11$Returns_the_local_genlInverses_of = makeString("Returns the local genlInverses of PRED");
  public static final SubLSymbol $sym12$MIN_GENL_INVERSES = makeSymbol("MIN-GENL-INVERSES");
  public static final SubLString $str13$Returns_the_most_specific_local_g = makeString("Returns the most-specific local genlInverses of PRED");
  public static final SubLSymbol $sym14$NOT_GENL_PREDICATES = makeSymbol("NOT-GENL-PREDICATES");
  public static final SubLString $str15$Returns_the_local_negated_genlPre = makeString("Returns the local negated genlPreds of PRED");
  public static final SubLSymbol $sym16$MAX_NOT_GENL_PREDICATES = makeSymbol("MAX-NOT-GENL-PREDICATES");
  public static final SubLString $str17$Returns_the_most_general_local_ne = makeString("Returns the most-general local negated genlPreds of PRED");
  public static final SubLSymbol $sym18$NOT_GENL_INVERSES = makeSymbol("NOT-GENL-INVERSES");
  public static final SubLSymbol $sym19$MAX_NOT_GENL_INVERSES = makeSymbol("MAX-NOT-GENL-INVERSES");
  public static final SubLSymbol $sym20$SPEC_PREDICATES = makeSymbol("SPEC-PREDICATES");
  public static final SubLString $str21$Returns_the_specPreds_of_PRED = makeString("Returns the specPreds of PRED");
  public static final SubLSymbol $sym22$MAX_SPEC_PREDICATES = makeSymbol("MAX-SPEC-PREDICATES");
  public static final SubLString $str23$Returns_the_most_general_specPred = makeString("Returns the most-general specPreds of PRED");
  public static final SubLSymbol $sym24$SPEC_INVERSES = makeSymbol("SPEC-INVERSES");
  public static final SubLString $str25$Returns_the_specInverses_of_PRED = makeString("Returns the specInverses of PRED");
  public static final SubLSymbol $sym26$MAX_SPEC_INVERSES = makeSymbol("MAX-SPEC-INVERSES");
  public static final SubLString $str27$Returns_the_most_general_specInve = makeString("Returns the most-general specInverses of PRED");
  public static final SubLSymbol $sym28$NOT_SPEC_PREDICATES = makeSymbol("NOT-SPEC-PREDICATES");
  public static final SubLString $str29$Returns_the_negated_specPreds_of_ = makeString("Returns the negated specPreds of PRED");
  public static final SubLSymbol $sym30$MIN_NOT_SPEC_PREDICATES = makeSymbol("MIN-NOT-SPEC-PREDICATES");
  public static final SubLString $str31$Returns_the_most_specific_negated = makeString("Returns the most-specific negated specPreds of PRED");
  public static final SubLSymbol $sym32$NOT_SPEC_INVERSES = makeSymbol("NOT-SPEC-INVERSES");
  public static final SubLSymbol $sym33$MIN_NOT_SPEC_INVERSES = makeSymbol("MIN-NOT-SPEC-INVERSES");
  public static final SubLSymbol $sym34$GENL_PREDICATE_SIBLINGS = makeSymbol("GENL-PREDICATE-SIBLINGS");
  public static final SubLString $str35$Returns_the_direct___genlPreds_of = makeString("Returns the direct #$genlPreds of those predicates having direct spec-preds PRED");
  public static final SubLSymbol $sym36$GENL_INVERSE_SIBLINGS = makeSymbol("GENL-INVERSE-SIBLINGS");
  public static final SubLString $str37$Returns_the_direct___genlInverse_ = makeString("Returns the direct #$genlInverse of those predicates having direct spec-inverses PRED");
  public static final SubLSymbol $sym38$SPEC_PREDICATE_SIBLINGS = makeSymbol("SPEC-PREDICATE-SIBLINGS");
  public static final SubLString $str39$Returns_the_direct_spec_preds_of_ = makeString("Returns the direct spec-preds of those collections having direct #$genlPreds PRED");
  public static final SubLSymbol $sym40$SPEC_INVERSE_SIBLINGS = makeSymbol("SPEC-INVERSE-SIBLINGS");
  public static final SubLString $str41$Returns_the_direct_spec_inverses_ = makeString("Returns the direct spec-inverses of those collections having direct #$genlInverse PRED");
  public static final SubLSymbol $sym42$GENL_PREDICATE_ROOTS = makeSymbol("GENL-PREDICATE-ROOTS");
  public static final SubLString $str43$Returns_the_most_general_genlPred = makeString("Returns the most general genlPreds of PRED.");
  public static final SubLSymbol $sym44$GENL_INVERSE_ROOTS = makeSymbol("GENL-INVERSE-ROOTS");
  public static final SubLString $str45$Returns_the_most_general_genlInve = makeString("Returns the most general genlInverses of PRED.");
  public static final SubLSymbol $sym46$ALL_GENL_PREDICATES = makeSymbol("ALL-GENL-PREDICATES");
  public static final SubLString $str47$Returns_all_genlPreds_of_predicat = makeString("Returns all genlPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
  public static final SubLSymbol $kw48$DEPTH = makeKeyword("DEPTH");
  public static final SubLSymbol $kw49$STACK = makeKeyword("STACK");
  public static final SubLSymbol $kw50$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $sym51$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw52$ERROR = makeKeyword("ERROR");
  public static final SubLString $str53$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym54$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw55$CERROR = makeKeyword("CERROR");
  public static final SubLString $str56$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw57$WARN = makeKeyword("WARN");
  public static final SubLString $str58$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLString $str59$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLString $str60$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym61$ALL_GENL_INVERSES = makeSymbol("ALL-GENL-INVERSES");
  public static final SubLSymbol $sym62$ALL_SPEC_PREDICATES = makeSymbol("ALL-SPEC-PREDICATES");
  public static final SubLString $str63$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlPred \n   (descending transitive closure; expensive)");
  public static final SubLSymbol $sym64$ALL_SPEC_INVERSES = makeSymbol("ALL-SPEC-INVERSES");
  public static final SubLString $str65$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a genlInverse\n   (descending transitive closure; expensive)");
  public static final SubLSymbol $sym66$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLSymbol $sym67$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym68$ALL_GENL_PREDS_AMONG = makeSymbol("ALL-GENL-PREDS-AMONG");
  public static final SubLList $list69 = list(makeSymbol("PRED"), makeSymbol("CANDIDATES"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str70$Returns_those_genlPreds_of_PRED_t = makeString("Returns those genlPreds of PRED that are included among CANDIDATEs");
  public static final SubLList $list71 = list(list(makeSymbol("PRED"), makeSymbol("EL-FORT-P")), list(makeSymbol("CANDIDATES"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym72$ALL_NOT_GENL_PREDICATES = makeSymbol("ALL-NOT-GENL-PREDICATES");
  public static final SubLString $str73$Returns_all_negated_genlPreds_of_ = makeString("Returns all negated genlPreds of predicate PRED \n   (descending transitive closure; expensive)");
  public static final SubLSymbol $sym74$ALL_NOT_GENL_INVERSES = makeSymbol("ALL-NOT-GENL-INVERSES");
  public static final SubLSymbol $sym75$ALL_NOT_SPEC_PREDICATES = makeSymbol("ALL-NOT-SPEC-PREDICATES");
  public static final SubLString $str76$Returns_all_negated_specPreds_of_ = makeString("Returns all negated specPreds of predicate PRED \n   (ascending transitive closure; inexpensive)");
  public static final SubLSymbol $sym77$ALL_NOT_SPEC_INVERSES = makeSymbol("ALL-NOT-SPEC-INVERSES");
  public static final SubLString $str78$Returns_all_predicates_having_PRE = makeString("Returns all predicates having PRED as a negated genlInverse\n   (ascending transitive closure; inexpensive)");
  public static final SubLSymbol $sym79$UNION_ALL_GENL_PREDICATES = makeSymbol("UNION-ALL-GENL-PREDICATES");
  public static final SubLList $list80 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str81$Returns_all_genl_predicates_of_ea = makeString("Returns all genl-predicates of each predicate in PREDS");
  public static final SubLList $list82 = list(list(makeSymbol("PREDS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym83$UNION_ALL_SPEC_PREDICATES = makeSymbol("UNION-ALL-SPEC-PREDICATES");
  public static final SubLString $str84$Returns_all_spec_predicates_of_ea = makeString("Returns all spec-predicates of each predicate in PREDS");
  public static final SubLSymbol $sym85$UNION_ALL_GENL_INVERSES = makeSymbol("UNION-ALL-GENL-INVERSES");
  public static final SubLString $str86$Returns_all_genl_inverses_of_each = makeString("Returns all genl-inverses of each predicate in PREDS");
  public static final SubLSymbol $sym87$UNION_ALL_SPEC_INVERSES = makeSymbol("UNION-ALL-SPEC-INVERSES");
  public static final SubLString $str88$Returns_all_specs_of_each_predica = makeString("Returns all specs of each predicate in PREDS");
  public static final SubLSymbol $sym89$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym90$MAP_ALL_GENL_PREDS = makeSymbol("MAP-ALL-GENL-PREDS");
  public static final SubLList $list91 = list(makeSymbol("PRED"), makeSymbol("FN"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str92$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED");
  public static final SubLList $list93 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")));
  public static final SubLSymbol $sym94$SOME_ALL_GENL_PREDS = makeSymbol("SOME-ALL-GENL-PREDS");
  public static final SubLString $str95$Apply_FN_to_each_genlPred_of_PRED = makeString("Apply FN to each genlPred of PRED until FN returns a non-nil result");
  public static final SubLSymbol $sym96$SOME_ALL_GENL_INVERSES = makeSymbol("SOME-ALL-GENL-INVERSES");
  public static final SubLSymbol $sym97$MAP_ALL_SPEC_PREDS = makeSymbol("MAP-ALL-SPEC-PREDS");
  public static final SubLSymbol $sym98$SOME_ALL_SPEC_PREDS = makeSymbol("SOME-ALL-SPEC-PREDS");
  public static final SubLSymbol $sym99$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLObject $const100$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym101$GATHER_IF_SEARCHED_ARG_CONSTRAINTS = makeSymbol("GATHER-IF-SEARCHED-ARG-CONSTRAINTS");
  public static final SubLSymbol $sym102$ALL_SPEC_PREDS_WRT_TYPE = makeSymbol("ALL-SPEC-PREDS-WRT-TYPE");
  public static final SubLList $list103 = list(makeSymbol("PRED"), makeSymbol("COL"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str104$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which instances \nof COL are legal in arguments in position ARG");
  public static final SubLList $list105 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("COL"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));
  public static final SubLObject $const106$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym107$ALL_SPEC_PREDS_WRT_ARG = makeSymbol("ALL-SPEC-PREDS-WRT-ARG");
  public static final SubLList $list108 = list(makeSymbol("PRED"), makeSymbol("FORT"), makeSymbol("ARG"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str109$Returns_those_all_spec_preds_of_P = makeString("Returns those all-spec-preds of PRED for which FORT\nis legal as arguments in position ARG");
  public static final SubLList $list110 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("ARG"), makeSymbol("INTEGERP")));
  public static final SubLList $list111 = list(makeSymbol("ALIST"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym112$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym113$_SBHL_ARG_TYPE_ALIST_ = makeSymbol("*SBHL-ARG-TYPE-ALIST*");
  public static final SubLList $list114 = list(list(makeSymbol("*SBHL-ARG-TYPE-GENLS-STORES*"), list(makeSymbol("NEW-DICTIONARY"), list(makeSymbol("QUOTE"), EQUAL))));
  public static final SubLSymbol $sym115$SBHL_INITIALIZE_ARG_TYPE_GENLS_STORES = makeSymbol("SBHL-INITIALIZE-ARG-TYPE-GENLS-STORES");
  public static final SubLSymbol $sym116$SBHL_ARG_TYPES_ALIST_SATISFIED_P = makeSymbol("SBHL-ARG-TYPES-ALIST-SATISFIED-P");
  public static final SubLObject $const117$typedGenlPreds = constant_handles.reader_make_constant_shell(makeString("typedGenlPreds"));
  public static final SubLSymbol $kw118$GAF = makeKeyword("GAF");
  public static final SubLSymbol $kw119$TRUE = makeKeyword("TRUE");
  public static final SubLObject $const120$typedGenlInverse = constant_handles.reader_make_constant_shell(makeString("typedGenlInverse"));
  public static final SubLObject $const121$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $kw122$OLD = makeKeyword("OLD");
  public static final SubLSymbol $kw123$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym124$MIN_PREDICATES = makeSymbol("MIN-PREDICATES");
  public static final SubLString $str125$Returns_the_most_specific_predica = makeString("Returns the most-specific predicates in PREDS");
  public static final SubLSymbol $sym126$MAX_PREDICATES = makeSymbol("MAX-PREDICATES");
  public static final SubLString $str127$Returns_the_most_general_predicat = makeString("Returns the most-general predicates in PREDS");
  public static final SubLSymbol $sym128$MIN_CEILING_PREDICATES = makeSymbol("MIN-CEILING-PREDICATES");
  public static final SubLList $list129 = list(makeSymbol("PREDS"), makeSymbol("&OPTIONAL"), makeSymbol("CANDIDATES"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str130$Returns_the_most_specific_common_ = makeString("Returns the most-specific common generalizations (ceilings) of PREDS");
  public static final SubLList $list131 = list(makeSymbol("PRED1"), makeSymbol("PRED2"));
  public static final SubLSymbol $sym132$MAX_FLOOR_PREDICATES = makeSymbol("MAX-FLOOR-PREDICATES");
  public static final SubLString $str133$Returns_the_most_general_common_s = makeString("Returns the most-general common specializations (floors) of PREDS");
  public static final SubLSymbol $sym134$GENL_PREDICATE_ = makeSymbol("GENL-PREDICATE?");
  public static final SubLList $list135 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str136$Is_GENL_a_genlPred_of_SPEC______a = makeString("Is GENL a genlPred of SPEC?\n   (ascending transitive search; inexpensive)");
  public static final SubLList $list137 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL"), makeSymbol("FORT-P")));
  public static final SubLList $list138 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym139$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const140$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym141$SPEC_PREDICATE_ = makeSymbol("SPEC-PREDICATE?");
  public static final SubLList $list142 = list(makeSymbol("GENL"), makeSymbol("SPEC"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLList $list143 = list(list(makeSymbol("GENL"), makeSymbol("FORT-P")), list(makeSymbol("SPEC"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym144$GENL_INVERSE_ = makeSymbol("GENL-INVERSE?");
  public static final SubLString $str145$Is_GENL_a_genlInverse_of_SPEC____ = makeString("Is GENL a genlInverse of SPEC?\n   (ascending transitive search; inexpensive)");
  public static final SubLSymbol $sym146$SPEC_INVERSE_ = makeSymbol("SPEC-INVERSE?");
  public static final SubLSymbol $sym147$ANY_GENL_PREDICATE_ = makeSymbol("ANY-GENL-PREDICATE?");
  public static final SubLList $list148 = list(makeSymbol("SPEC"), makeSymbol("GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str149$Returns_T_iff__genl_predicate__SP = makeString("Returns T iff (genl-predicate? SPEC GENL) for some genl in GENLS\n   (ascending transitive search; inexpensive)");
  public static final SubLList $list150 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym151$NOT_GENL_PREDICATE_ = makeSymbol("NOT-GENL-PREDICATE?");
  public static final SubLList $list152 = list(makeSymbol("SPEC"), makeSymbol("NOT-GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str153$Is_NOT_GENL_known_to_be_not_a_gen = makeString("Is NOT-GENL known to be not a genlPred of SPEC?\n   (descending transitive search; expensive)");
  public static final SubLList $list154 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENL"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym155$NOT_GENL_INVERSE_ = makeSymbol("NOT-GENL-INVERSE?");
  public static final SubLString $str156$Is_NOT_GENL_a_negated_genlInverse = makeString("Is NOT-GENL a negated genlInverse of SPEC?\n   (descending transitive search; expensive)");
  public static final SubLSymbol $sym157$ANY_NOT_GENL_PREDICATE_ = makeSymbol("ANY-NOT-GENL-PREDICATE?");
  public static final SubLList $list158 = list(makeSymbol("PRED"), makeSymbol("NOT-GENLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str159$Is_any_predicate_in_NOT_GENLS_not = makeString("Is any predicate in NOT-GENLS not a genlPred of PRED?\n   (descending transitive search; expensive)");
  public static final SubLList $list160 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("NOT-GENLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym161$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym162$TV_P = makeSymbol("TV-P");
  public static final SubLSymbol $sym163$INTERSECTING_PREDICATES_ = makeSymbol("INTERSECTING-PREDICATES?");
  public static final SubLList $list164 = list(makeSymbol("PRED1"), makeSymbol("PRED2"), makeSymbol("&OPTIONAL"), makeSymbol("MT"));
  public static final SubLString $str165$Does_the_extension_of_PRED1_inclu = makeString("Does the extension of PRED1 include some tuple in the extension of PRED2?");
  public static final SubLList $list166 = list(list(makeSymbol("PRED1"), makeSymbol("FORT-P")), list(makeSymbol("PRED2"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym167$WHY_GENL_PREDICATE_ = makeSymbol("WHY-GENL-PREDICATE?");
  public static final SubLList $list168 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));
  public static final SubLString $str169$A_justification_of__genlPreds_SPE = makeString("A justification of (genlPreds SPEC GENL)");
  public static final SubLList $list170 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym171$WHY_NOT_GENL_PREDICATE_ = makeSymbol("WHY-NOT-GENL-PREDICATE?");
  public static final SubLString $str172$A_justification_of__not__genlPred = makeString("A justification of (not (genlPreds SPEC GENL))");
  public static final SubLSymbol $sym173$WHY_GENL_INVERSE_ = makeSymbol("WHY-GENL-INVERSE?");
  public static final SubLList $list174 = list(makeSymbol("PRED"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));
  public static final SubLString $str175$A_justification_of__genlInverse_P = makeString("A justification of (genlInverse PRED GENL-INVERSE)");
  public static final SubLList $list176 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));
  public static final SubLObject $const177$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $sym178$WHY_NOT_GENL_INVERSE_ = makeSymbol("WHY-NOT-GENL-INVERSE?");
  public static final SubLString $str179$A_justification_of__not__genlInve = makeString("A justification of (not (genlInverse SPEC GENL)");
  public static final SubLSymbol $kw180$ASSERTION = makeKeyword("ASSERTION");
  public static final SubLSymbol $sym181$MAX_FLOOR_MTS_OF_GENL_PREDICATE_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENL-PREDICATE-PATHS");
  public static final SubLList $list182 = list(makeSymbol("SPEC"), makeSymbol("GENL"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));
  public static final SubLString $str183$_return_listp__In_what__most_genl = makeString("@return listp; In what (most-genl) mts is GENL a genlPred of SPEC?");
  public static final SubLSymbol $sym184$MAX_FLOOR_MTS_OF_GENL_INVERSE_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-GENL-INVERSE-PATHS");
  public static final SubLList $list185 = list(makeSymbol("SPEC"), makeSymbol("GENL-INVERSE"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));
  public static final SubLString $str186$In_what__most_genl__mts_is_GENL_I = makeString("In what (most-genl) mts is GENL-INVERSE a genlInverse of SPEC?");
  public static final SubLList $list187 = list(list(makeSymbol("SPEC"), makeSymbol("FORT-P")), list(makeSymbol("GENL-INVERSE"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym188$CACHED_CANDIDATE_GENL_PREDS = makeSymbol("CACHED-CANDIDATE-GENL-PREDS");
  public static final SubLSymbol $sym189$_CACHED_CANDIDATE_GENL_PREDS_CACHING_STATE_ = makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-CACHING-STATE*");
  public static final SubLInteger $int190$64 = makeInteger(64);
  public static final SubLSymbol $kw191$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym192$CACHED_CANDIDATE_GENL_PREDS_IN_MT = makeSymbol("CACHED-CANDIDATE-GENL-PREDS-IN-MT");
  public static final SubLSymbol $sym193$_CACHED_CANDIDATE_GENL_PREDS_IN_MT_CACHING_STATE_ = makeSymbol("*CACHED-CANDIDATE-GENL-PREDS-IN-MT-CACHING-STATE*");
  public static final SubLSymbol $kw194$ISA = makeKeyword("ISA");
  public static final SubLSymbol $kw195$GENL = makeKeyword("GENL");
  public static final SubLSymbol $sym196$CANDIDATE_PREDS_FOR_ARG_ISA = makeSymbol("CANDIDATE-PREDS-FOR-ARG-ISA");
  public static final SubLSymbol $sym197$CANDIDATE_PREDS_FOR_ARG_GENL = makeSymbol("CANDIDATE-PREDS-FOR-ARG-GENL");
  public static final SubLSymbol $sym198$MAX = makeSymbol("MAX");
  public static final SubLSymbol $sym199$ARITY = makeSymbol("ARITY");
  public static final SubLSymbol $sym200$GENL_PREDICATE_AFTER_ADDING = makeSymbol("GENL-PREDICATE-AFTER-ADDING");
  public static final SubLSymbol $sym201$ADD_GENL_PREDICATE = makeSymbol("ADD-GENL-PREDICATE");
  public static final SubLSymbol $sym202$GENL_INVERSE_AFTER_ADDING = makeSymbol("GENL-INVERSE-AFTER-ADDING");
  public static final SubLSymbol $sym203$ADD_GENL_INVERSE = makeSymbol("ADD-GENL-INVERSE");
  public static final SubLSymbol $sym204$REMOVE_GENL_PREDICATE = makeSymbol("REMOVE-GENL-PREDICATE");
  public static final SubLSymbol $sym205$REMOVE_GENL_INVERSE = makeSymbol("REMOVE-GENL-INVERSE");
  public static final SubLSymbol $sym206$GENL_PREDICATE_AFTER_REMOVING = makeSymbol("GENL-PREDICATE-AFTER-REMOVING");
  public static final SubLSymbol $sym207$GENL_INVERSE_AFTER_REMOVING = makeSymbol("GENL-INVERSE-AFTER-REMOVING");

  //// Initializers

  public void declareFunctions() {
    declare_genl_predicates_file();
  }

  public void initializeVariables() {
    init_genl_predicates_file();
  }

  public void runTopLevelForms() {
    setup_genl_predicates_file();
  }

}
