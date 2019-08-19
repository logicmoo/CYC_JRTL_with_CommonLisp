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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.inference.modules.after_adding_modules;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_defns;
//dm import com.cyc.cycjava_1.cycl.cardinality_estimates;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.deck;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.disjoint_with;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.function_terms;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.nart_handles;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
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
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_vars;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_search_what_mts;
//dm import com.cyc.cycjava_1.cycl.sdc;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class isa extends SubLTranslatedFile {

  //// Constructor

  private isa() {}
  public static final SubLFile me = new isa();
  public static final String myName = "com.cyc.cycjava_1.cycl.isa";

  //// Definitions

  /** Returns all collections that include TERM (inexpensive) */
  @SubL(source = "cycl/isa.lisp", position = 8011) 
  public static final SubLObject all_isa(SubLObject v_term, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(v_term, $sym1$HL_TERM_P);
    {
      SubLObject result = sbhl_search_methods.sbhl_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$isa), v_term, mt, tv);
      if ((NIL != forts.non_fort_p(v_term))) {
        result = list_utilities.fast_delete_duplicates(ConsesLow.nconc(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1792"), result), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return result;
    }
  }

  /** Returns all instances of COLLECTION (expensive) */
  @SubL(source = "cycl/isa.lisp", position = 9532) 
  public static final SubLObject all_instances(SubLObject col, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(col, $sym11$EL_FORT_P);
    return sbhl_search_methods.sbhl_all_backward_true_nodes(sbhl_module_vars.get_sbhl_module($const0$isa), col, mt, tv);
  }

  /** Result accumulator for all-isas-wrt */
  @SubL(source = "cycl/isa.lisp", position = 10715) 
  private static SubLSymbol $all_isas_wrt$ = null;

  /** Term which other terms must be instances to be included in the all-isas-wrt. */
  @SubL(source = "cycl/isa.lisp", position = 10813) 
  private static SubLSymbol $all_isas_wrt_isa$ = null;

  /** Returns those elements of COLLECTIONS that include TERM as an all-instance */
  @SubL(source = "cycl/isa.lisp", position = 12839) 
  public static final SubLObject all_isa_among(SubLObject v_term, SubLObject collections, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(v_term, $sym1$HL_TERM_P);
    checkType(collections, $sym71$LISTP);
    if ((NIL == collections)) {
      return NIL;
    } else if ((NIL != list_utilities.singletonP(collections))) {
      if ((NIL != isaP(v_term, collections.first(), mt, tv))) {
        return collections;
      } else {
        return NIL;
      }
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1529");
    }
  }

  /** Returns whether TERM is an instance of COLLECTION via the SBHL, i.e. isa and genls assertions.
@note This function does _not_ use defns to determine membership in COLLECTION.
@see has-type?
@see quiet-has-type? */
  @SubL(source = "cycl/isa.lisp", position = 25894) 
  public static final SubLObject isaP(SubLObject v_term, SubLObject collection, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(collection, $sym11$EL_FORT_P);
    if ((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const0$isa), v_term, collection, mt, tv))) {
      return T;
    }
    if (((NIL != sbhl_link_methods.isa_stored_naut_arg2_p(v_term))
         && (NIL != genls.any_specP(collection, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1784"), mt, tv)))) {
      return T;
    }
    if (((NIL != cycl_grammar.cycl_nat_p(collection))
         && (cycl_utilities.formula_operator(collection) == $const120$CollectionIntersectionFn)
         && (NIL != el_utilities.el_extensional_set_p(cycl_utilities.formula_arg1(collection, UNPROVIDED))))) {
      {
        SubLObject colls = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30562");
        SubLObject cdolist_list_var = colls;
        SubLObject sub_coll = NIL;
        for (sub_coll = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sub_coll = cdolist_list_var.first()) {
          if ((!(((NIL != term.el_fort_p(sub_coll))
                 && (NIL != isaP(v_term, sub_coll, mt, tv)))))) {
            return NIL;
          }
        }
        return T;
      }
    }
    if (((NIL != forts.non_fort_p(v_term))
         && (NIL != sbhl_link_methods.non_fort_isaP(v_term, collection, mt, tv)))) {
      return T;
    }
    return NIL;
  }

  /** is <term> an element of <collection> in any mt */
  @SubL(source = "cycl/isa.lisp", position = 27431) 
  public static final SubLObject isa_in_any_mtP(SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject isaP = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const52$EverythingPSC, thread);
            isaP = isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return isaP;
      }
    }
  }

  /** If COLLECTION has more than (FORT-COUNT / THIS) many instances, sample instead of
   generating all the instances. */
  @SubL(source = "cycl/isa.lisp", position = 41879) 
  private static SubLSymbol $random_instance_of_sampling_ratio$ = null;

  /** @return booleanp; whether there are any asserted true isa links for TERM. */
  @SubL(source = "cycl/isa.lisp", position = 52486) 
  public static final SubLObject asserted_isaP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($const0$isa), v_term, mt);
  }

  /** @return listp; the asserted true isa links for TERM in MT / *mt*. */
  @SubL(source = "cycl/isa.lisp", position = 52686) 
  public static final SubLObject asserted_isa(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_asserted_true_links(sbhl_module_vars.get_sbhl_module($const0$isa), v_term, mt);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/isa.lisp", position = 54292) 
  public static final SubLObject instanceof_after_adding(SubLObject source, SubLObject assertion) {
    return isa_after_adding(source, assertion);
  }

  public static final class $instanceof_after_adding$BinaryFunction extends BinaryFunction {
    public $instanceof_after_adding$BinaryFunction() { super(extractFunctionNamed("INSTANCEOF-AFTER-ADDING")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return instanceof_after_adding(arg1, arg2); }
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/isa.lisp", position = 54595) 
  public static final SubLObject isa_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const0$isa));
    sbhl_cache.sbhl_cache_addition_maintainence(assertion);
    after_adding_modules.clear_isa_dependent_caches(source, assertion);
    possibly_propagate_isa_collection_subset_fn_the_set_of(assertion);
    possibly_propagate_isa_the_collection_of(assertion);
    sbhl_link_methods.possibly_add_non_fort_isa(assertion);
    return NIL;
  }

  /** If ASSERTION is of the form (#$isa <term> (#$CollectionSubsetFn <col> (#$TheSetOf ?X <prop>))),
   substitutes <term> into <prop> and creates a new deduction.
   Copied-n-edited from @xref possibly-propagate-isa-the-collection-of. */
  @SubL(source = "cycl/isa.lisp", position = 55106) 
  public static final SubLObject possibly_propagate_isa_collection_subset_fn_the_set_of(SubLObject assertion) {
    if ((NIL != assertion_utilities.true_assertionP(assertion))) {
      {
        SubLObject isa_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
        SubLObject datum = isa_formula;
        SubLObject current = datum;
        SubLObject v_isa = NIL;
        SubLObject v_term = NIL;
        SubLObject subset_expr = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list177);
        v_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list177);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list177);
        subset_expr = current.first();
        current = current.rest();
        if ((NIL == current)) {
          if (((v_isa == $const0$isa)
               && (NIL != el_utilities.el_formula_with_operator_p(subset_expr, $const178$CollectionSubsetFn)))) {
            {
              SubLObject datum_515 = subset_expr;
              SubLObject current_516 = datum_515;
              SubLObject csfn = NIL;
              SubLObject col = NIL;
              SubLObject colexpr = NIL;
              cdestructuring_bind.destructuring_bind_must_consp(current_516, datum_515, $list179);
              csfn = current_516.first();
              current_516 = current_516.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_516, datum_515, $list179);
              col = current_516.first();
              current_516 = current_516.rest();
              cdestructuring_bind.destructuring_bind_must_consp(current_516, datum_515, $list179);
              colexpr = current_516.first();
              current_516 = current_516.rest();
              if ((NIL == current_516)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3719");
              } else {
                cdestructuring_bind.cdestructuring_bind_error(datum_515, $list179);
              }
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list177);
        }
      }
    }
    return NIL;
  }

  /** If ASSERTION is of the form (#$isa <term> (#$TheCollectionOf ?X <prop>)),
   substitutes <term> into <prop> and creates a new deduction.
   Copied-n-edited from @xref cyc-add-element-of. */
  @SubL(source = "cycl/isa.lisp", position = 55842) 
  public static final SubLObject possibly_propagate_isa_the_collection_of(SubLObject assertion) {
    if ((NIL != assertion_utilities.true_assertionP(assertion))) {
      {
        SubLObject isa_formula = fi.assertion_fi_formula(assertion, UNPROVIDED);
        SubLObject datum = isa_formula;
        SubLObject current = datum;
        SubLObject v_isa = NIL;
        SubLObject v_term = NIL;
        SubLObject colexpr = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list180);
        v_isa = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list180);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list180);
        colexpr = current.first();
        current = current.rest();
        if ((NIL == current)) {
          if (((v_isa == $const0$isa)
               && (NIL != el_utilities.el_formula_with_operator_p(colexpr, $const181$TheCollectionOf)))) {
            Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 3720");
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list180);
        }
      }
    }
    return NIL;
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/isa.lisp", position = 56782) 
  public static final SubLObject instanceof_after_removing(SubLObject source, SubLObject assertion) {
    return isa_after_removing(source, assertion);
  }

  public static final class $instanceof_after_removing$BinaryFunction extends BinaryFunction {
    public $instanceof_after_removing$BinaryFunction() { super(extractFunctionNamed("INSTANCEOF-AFTER-REMOVING")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return instanceof_after_removing(arg1, arg2); }
  }

  /** Modifier. Removes sbhl links with @see sbhl-after-removing. */
  @SubL(source = "cycl/isa.lisp", position = 57013) 
  public static final SubLObject isa_after_removing(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_removing(source, assertion, sbhl_module_vars.get_sbhl_module($const0$isa));
    sbhl_cache.sbhl_cache_removal_maintainence(assertion);
    sbhl_link_methods.possibly_remove_non_fort_isa(assertion);
    return NIL;
  }

  /** Returns whether TERM is a quoted instance of COLLECTION via the SBHL, i.e. quotedIsa and genls assertions.
@note This function does _not_ use defns to determine membership in COLLECTION.
@see has-type?
@see quiet-has-type? */
  @SubL(source = "cycl/isa.lisp", position = 59204) 
  public static final SubLObject quoted_isaP(SubLObject v_term, SubLObject collection, SubLObject mt, SubLObject tv) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((tv == UNPROVIDED)) {
      tv = NIL;
    }
    checkType(collection, $sym11$EL_FORT_P);
    return makeBoolean(((NIL != sbhl_search_methods.sbhl_non_justifying_predicate_relation_p(sbhl_module_vars.get_sbhl_module($const117$quotedIsa), v_term, collection, mt, tv))
          || (NIL != ((NIL != sbhl_link_methods.quoted_isa_stored_naut_arg2_p(v_term)) ? ((SubLObject) genls.any_specP(collection, Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 1801"), mt, tv)) : NIL))));
  }

  /** is <term> an element of <collection> in any mt */
  @SubL(source = "cycl/isa.lisp", position = 59803) 
  public static final SubLObject quoted_isa_in_any_mtP(SubLObject v_term, SubLObject collection) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject qisaP = NIL;
        {
          SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
          SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
          try {
            mt_relevance_macros.$relevant_mt_function$.bind($sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($const52$EverythingPSC, thread);
            qisaP = quoted_isaP(v_term, collection, UNPROVIDED, UNPROVIDED);
          } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
          }
        }
        return qisaP;
      }
    }
  }

  /** @return booleanp; whether there are any asserted true isa links for TERM. */
  @SubL(source = "cycl/isa.lisp", position = 67666) 
  public static final SubLObject asserted_quoted_isaP(SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    return sbhl_link_methods.sbhl_any_asserted_true_links(sbhl_module_vars.get_sbhl_module($const117$quotedIsa), v_term, mt);
  }

  /** Modifier. Adds sbhl links with @see sbhl-after-adding. */
  @SubL(source = "cycl/isa.lisp", position = 68210) 
  public static final SubLObject quoted_instanceof_after_adding(SubLObject source, SubLObject assertion) {
    sbhl_link_methods.sbhl_after_adding(source, assertion, sbhl_module_vars.get_sbhl_module($const117$quotedIsa));
    sbhl_cache.sbhl_cache_addition_maintainence(assertion);
    after_adding_modules.clear_quoted_isa_dependent_caches(source, assertion);
    return NIL;
  }

  public static final SubLObject declare_isa_file() {
    //declareFunction("isa", "ISA", 1, 2, false);
    //declareFunction("min_isa", "MIN-ISA", 1, 2, false);
    //declareFunction("min_isa_in_mt", "MIN-ISA-IN-MT", 2, 0, false);
    //declareFunction("nat_isa", "NAT-ISA", 1, 2, false);
    //declareFunction("naut_isa", "NAUT-ISA", 1, 1, false);
    //declareFunction("not_isa", "NOT-ISA", 1, 2, false);
    //declareFunction("max_not_isa", "MAX-NOT-ISA", 1, 2, false);
    //declareFunction("nat_max_not_isa", "NAT-MAX-NOT-ISA", 1, 2, false);
    //declareFunction("instances", "INSTANCES", 1, 2, false);
    //declareFunction("max_instances", "MAX-INSTANCES", 1, 2, false);
    //declareFunction("all_instances_with_max", "ALL-INSTANCES-WITH-MAX", 2, 0, false);
    //declareFunction("not_instances", "NOT-INSTANCES", 1, 2, false);
    //declareFunction("min_not_instances", "MIN-NOT-INSTANCES", 1, 2, false);
    //declareFunction("isa_siblings", "ISA-SIBLINGS", 1, 2, false);
    //declareFunction("instance_siblings", "INSTANCE-SIBLINGS", 1, 2, false);
    //declareFunction("map_isa", "MAP-ISA", 2, 2, false);
    //declareFunction("map_min_isa", "MAP-MIN-ISA", 2, 2, false);
    //declareFunction("map_instances", "MAP-INSTANCES", 2, 2, false);
    //declareFunction("min_isas_of_type", "MIN-ISAS-OF-TYPE", 2, 2, false);
    declareFunction("all_isa", "ALL-ISA", 1, 2, false);
    //declareFunction("all_isa_in_any_mt", "ALL-ISA-IN-ANY-MT", 1, 0, false);
    //declareFunction("all_isa_in_mt", "ALL-ISA-IN-MT", 1, 1, false);
    //declareFunction("all_isa_in_mts", "ALL-ISA-IN-MTS", 1, 1, false);
    //declareFunction("nat_all_isa", "NAT-ALL-ISA", 1, 2, false);
    declareFunction("all_instances", "ALL-INSTANCES", 1, 2, false);
    //declareFunction("all_instances_in_all_mts", "ALL-INSTANCES-IN-ALL-MTS", 1, 0, false);
    //declareFunction("all_fort_instances", "ALL-FORT-INSTANCES", 1, 2, false);
    //declareFunction("all_fort_instances_in_all_mts", "ALL-FORT-INSTANCES-IN-ALL-MTS", 1, 0, false);
    //declareFunction("all_isas_wrt", "ALL-ISAS-WRT", 2, 2, false);
    //declareFunction("gather_isa_wrt_isa", "GATHER-ISA-WRT-ISA", 1, 0, false);
    //declareFunction("union_all_isa", "UNION-ALL-ISA", 1, 2, false);
    //declareFunction("union_all_instances", "UNION-ALL-INSTANCES", 1, 2, false);
    declareFunction("all_isa_among", "ALL-ISA-AMONG", 2, 2, false);
    //declareFunction("min_isa_among", "MIN-ISA-AMONG", 2, 2, false);
    //declareFunction("all_instances_among", "ALL-INSTANCES-AMONG", 2, 2, false);
    //declareFunction("all_instances_among_fast", "ALL-INSTANCES-AMONG-FAST", 2, 1, false);
    //declareFunction("all_isa_if", "ALL-ISA-IF", 2, 2, false);
    //declareFunction("all_instances_if", "ALL-INSTANCES-IF", 2, 2, false);
    //declareFunction("all_isa_if_with_pruning", "ALL-ISA-IF-WITH-PRUNING", 2, 2, false);
    //declareFunction("all_not_isa", "ALL-NOT-ISA", 1, 2, false);
    //declareFunction("all_not_instances", "ALL-NOT-INSTANCES", 1, 2, false);
    //declareFunction("not_isa_among", "NOT-ISA-AMONG", 2, 2, false);
    //declareFunction("not_instances_among", "NOT-INSTANCES-AMONG", 0, 0, false);
    //declareFunction("map_all_isa", "MAP-ALL-ISA", 2, 2, false);
    //declareFunction("map_all_instances", "MAP-ALL-INSTANCES", 2, 2, false);
    //declareFunction("any_all_isa", "ANY-ALL-ISA", 2, 2, false);
    //declareFunction("any_wrt_all_isa", "ANY-WRT-ALL-ISA", 2, 2, false);
    //declareFunction("any_all_forward_true_nodes_isa", "ANY-ALL-FORWARD-TRUE-NODES-ISA", 3, 2, false);
    //declareFunction("sample_leaf_instances", "SAMPLE-LEAF-INSTANCES", 1, 3, false);
    //declareFunction("sample_different_leaf_instances", "SAMPLE-DIFFERENT-LEAF-INSTANCES", 2, 3, false);
    //declareFunction("sbhl_record_all_isa", "SBHL-RECORD-ALL-ISA", 1, 2, false);
    //declareFunction("count_all_instances", "COUNT-ALL-INSTANCES", 1, 2, false);
    //declareFunction("count_all_instances_if", "COUNT-ALL-INSTANCES-IF", 2, 2, false);
    //declareFunction("count_all_instances_E", "COUNT-ALL-INSTANCES-=", 2, 2, false);
    //declareFunction("count_all_instances_G", "COUNT-ALL-INSTANCES->", 2, 2, false);
    //declareFunction("count_all_instances_GE", "COUNT-ALL-INSTANCES->=", 2, 2, false);
    //declareFunction("count_all_instances_L", "COUNT-ALL-INSTANCES-<", 2, 2, false);
    //declareFunction("count_all_instances_LE", "COUNT-ALL-INSTANCES-<=", 2, 2, false);
    //declareFunction("count_all_quoted_instances", "COUNT-ALL-QUOTED-INSTANCES", 1, 2, false);
    //declareFunction("count_all_quoted_instances_if", "COUNT-ALL-QUOTED-INSTANCES-IF", 2, 2, false);
    //declareFunction("count_all_quoted_instances_E", "COUNT-ALL-QUOTED-INSTANCES-=", 2, 2, false);
    //declareFunction("count_all_quoted_instances_G", "COUNT-ALL-QUOTED-INSTANCES->", 2, 2, false);
    //declareFunction("count_all_quoted_instances_GE", "COUNT-ALL-QUOTED-INSTANCES->=", 2, 2, false);
    //declareFunction("count_all_quoted_instances_L", "COUNT-ALL-QUOTED-INSTANCES-<", 2, 2, false);
    //declareFunction("count_all_quoted_instances_LE", "COUNT-ALL-QUOTED-INSTANCES-<=", 2, 2, false);
    declareFunction("isaP", "ISA?", 2, 2, false);
    //declareFunction("isa_in_mtsP", "ISA-IN-MTS?", 3, 0, false);
    declareFunction("isa_in_any_mtP", "ISA-IN-ANY-MT?", 2, 0, false);
    //declareFunction("nat_isaP", "NAT-ISA?", 2, 2, false);
    //declareFunction("nat_isa_intP", "NAT-ISA-INT?", 3, 0, false);
    //declareFunction("result_isa_colP", "RESULT-ISA-COL?", 2, 1, false);
    //declareFunction("weak_not_result_isa_colP", "WEAK-NOT-RESULT-ISA-COL?", 2, 1, false);
    //declareFunction("result_isa_arg_colP", "RESULT-ISA-ARG-COL?", 2, 1, false);
    //declareFunction("weak_not_result_isa_arg_colP", "WEAK-NOT-RESULT-ISA-ARG-COL?", 2, 1, false);
    //declareFunction("result_isa_inter_arg_colP", "RESULT-ISA-INTER-ARG-COL?", 2, 1, false);
    //declareFunction("result_isa_inter_arg_reln_colP", "RESULT-ISA-INTER-ARG-RELN-COL?", 2, 1, false);
    //declareFunction("isaP_goal", "ISA?-GOAL", 1, 0, false);
    //declareFunction("any_isaP", "ANY-ISA?", 2, 2, false);
    //declareFunction("isa_anyP", "ISA-ANY?", 2, 2, false);
    //declareFunction("nat_any_isaP", "NAT-ANY-ISA?", 2, 2, false);
    //declareFunction("find_if_isaP", "FIND-IF-ISA?", 2, 0, false);
    //declareFunction("all_isaP", "ALL-ISA?", 2, 2, false);
    //declareFunction("all_instancesP", "ALL-INSTANCES?", 2, 2, false);
    //declareFunction("any_isa_anyP", "ANY-ISA-ANY?", 2, 2, false);
    //declareFunction("not_isaP", "NOT-ISA?", 2, 2, false);
    //declareFunction("not_isa_someP", "NOT-ISA-SOME?", 2, 2, false);
    //declareFunction("not_isa_by_sbhlP", "NOT-ISA-BY-SBHL?", 2, 2, false);
    //declareFunction("not_isa_by_extent_knownP", "NOT-ISA-BY-EXTENT-KNOWN?", 2, 2, false);
    //declareFunction("argue_not_isaP", "ARGUE-NOT-ISA?", 2, 2, false);
    //declareFunction("not_isa_in_any_mtP", "NOT-ISA-IN-ANY-MT?", 2, 0, false);
    //declareFunction("nat_not_isaP", "NAT-NOT-ISA?", 2, 2, false);
    //declareFunction("why_isaP", "WHY-ISA?", 2, 3, false);
    //declareFunction("any_just_of_isa", "ANY-JUST-OF-ISA", 2, 1, false);
    //declareFunction("any_just_of_nat_isa", "ANY-JUST-OF-NAT-ISA", 2, 1, false);
    //declareFunction("why_not_isaP", "WHY-NOT-ISA?", 2, 3, false);
    //declareFunction("any_just_of_not_isa", "ANY-JUST-OF-NOT-ISA", 2, 1, false);
    //declareFunction("any_just_of_nat_not_isa", "ANY-JUST-OF-NAT-NOT-ISA", 2, 1, false);
    //declareFunction("instancesP", "INSTANCES?", 1, 2, false);
    //declareFunction("instancesP_int", "INSTANCES?-INT", 1, 2, false);
    //declareFunction("forts_of_type", "FORTS-OF-TYPE", 2, 2, false);
    //declareFunction("all_isa_mts", "ALL-ISA-MTS", 1, 0, false);
    //declareFunction("gather_genls_mts", "GATHER-GENLS-MTS", 1, 0, false);
    //declareFunction("partial_isa_extensionP", "PARTIAL-ISA-EXTENSION?", 1, 1, false);
    //declareFunction("random_instance_of", "RANDOM-INSTANCE-OF", 1, 1, false);
    //declareFunction("min_ceiling_isa", "MIN-CEILING-ISA", 1, 3, false);
    //declareFunction("nearest_common_isa", "NEAREST-COMMON-ISA", 1, 3, false);
    //declareFunction("max_floor_instances", "MAX-FLOOR-INSTANCES", 1, 2, false);
    //declareFunction("max_floor_mts_of_isa_paths_wrt", "MAX-FLOOR-MTS-OF-ISA-PATHS-WRT", 3, 0, false);
    //declareFunction("max_floor_mts_of_isa_paths", "MAX-FLOOR-MTS-OF-ISA-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_isa_paths", "MIN-MTS-OF-ISA-PATHS", 2, 1, false);
    //declareFunction("nat_min_mts_of_isa_paths", "NAT-MIN-MTS-OF-ISA-PATHS", 2, 0, false);
    //declareFunction("min_mts_of_quoted_isa_paths", "MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 1, false);
    //declareFunction("nat_min_mts_of_quoted_isa_paths", "NAT-MIN-MTS-OF-QUOTED-ISA-PATHS", 2, 0, false);
    //declareFunction("gather_min_mts_of_paths_between", "GATHER-MIN-MTS-OF-PATHS-BETWEEN", 1, 0, false);
    //declareFunction("cache_mts_of_arg", "CACHE-MTS-OF-ARG", 1, 0, false);
    //declareFunction("max_floor_mts_of_not_isa_paths", "MAX-FLOOR-MTS-OF-NOT-ISA-PATHS", 2, 1, false);
    //declareFunction("min_mts_of_not_isa_paths", "MIN-MTS-OF-NOT-ISA-PATHS", 2, 1, false);
    //declareFunction("instantiationP", "INSTANTIATION?", 2, 1, false);
    //declareFunction("instantiations", "INSTANTIATIONS", 1, 1, false);
    //declareFunction("all_instantiations", "ALL-INSTANTIATIONS", 1, 1, false);
    //declareFunction("random_instantiation", "RANDOM-INSTANTIATION", 1, 1, false);
    //declareFunction("set_naut_p", "SET-NAUT-P", 1, 0, false);
    //declareFunction("member_of_cycl_setP", "MEMBER-OF-CYCL-SET?", 2, 0, false);
    //declareFunction("members_of_cycl_set", "MEMBERS-OF-CYCL-SET", 1, 0, false);
    //declareFunction("random_member_of_cycl_set", "RANDOM-MEMBER-OF-CYCL-SET", 1, 0, false);
    //declareFunction("isas_mts", "ISAS-MTS", 1, 0, false);
    //declareFunction("isa_mts", "ISA-MTS", 1, 0, false);
    //declareFunction("type_mts", "TYPE-MTS", 1, 0, false);
    declareFunction("asserted_isaP", "ASSERTED-ISA?", 1, 1, false);
    declareFunction("asserted_isa", "ASSERTED-ISA", 1, 1, false);
    //declareFunction("asserted_not_isa", "ASSERTED-NOT-ISA", 1, 1, false);
    //declareFunction("supported_isa", "SUPPORTED-ISA", 1, 1, false);
    //declareFunction("supported_not_isa", "SUPPORTED-NOT-ISA", 1, 1, false);
    //declareFunction("asserted_instance", "ASSERTED-INSTANCE", 1, 1, false);
    //declareFunction("asserted_not_instance", "ASSERTED-NOT-INSTANCE", 1, 1, false);
    //declareFunction("supported_instance", "SUPPORTED-INSTANCE", 1, 1, false);
    //declareFunction("supported_not_instance", "SUPPORTED-NOT-INSTANCE", 1, 1, false);
    declareFunction("instanceof_after_adding", "INSTANCEOF-AFTER-ADDING", 2, 0, false); new $instanceof_after_adding$BinaryFunction();
    declareFunction("isa_after_adding", "ISA-AFTER-ADDING", 2, 0, false);
    declareFunction("possibly_propagate_isa_collection_subset_fn_the_set_of", "POSSIBLY-PROPAGATE-ISA-COLLECTION-SUBSET-FN-THE-SET-OF", 1, 0, false);
    declareFunction("possibly_propagate_isa_the_collection_of", "POSSIBLY-PROPAGATE-ISA-THE-COLLECTION-OF", 1, 0, false);
    //declareFunction("possibly_propagate_isa_the_set_of", "POSSIBLY-PROPAGATE-ISA-THE-SET-OF", 3, 0, false);
    declareFunction("instanceof_after_removing", "INSTANCEOF-AFTER-REMOVING", 2, 0, false); new $instanceof_after_removing$BinaryFunction();
    declareFunction("isa_after_removing", "ISA-AFTER-REMOVING", 2, 0, false);
    //declareFunction("clear_isa_graph", "CLEAR-ISA-GRAPH", 0, 0, false);
    //declareFunction("clear_node_isa_links", "CLEAR-NODE-ISA-LINKS", 1, 0, false);
    //declareFunction("reset_isa_links", "RESET-ISA-LINKS", 1, 0, false);
    //declareFunction("reset_isa_links_in_mt", "RESET-ISA-LINKS-IN-MT", 2, 0, false);
    //declareFunction("reset_isa_graph", "RESET-ISA-GRAPH", 0, 1, false);
    //declareFunction("quoted_isa", "QUOTED-ISA", 1, 2, false);
    //declareFunction("nat_quoted_isa", "NAT-QUOTED-ISA", 1, 2, false);
    //declareFunction("not_quoted_isa", "NOT-QUOTED-ISA", 1, 2, false);
    declareFunction("quoted_isaP", "QUOTED-ISA?", 2, 2, false);
    declareFunction("quoted_isa_in_any_mtP", "QUOTED-ISA-IN-ANY-MT?", 2, 0, false);
    //declareFunction("any_quoted_isaP", "ANY-QUOTED-ISA?", 2, 2, false);
    //declareFunction("quoted_isa_anyP", "QUOTED-ISA-ANY?", 2, 2, false);
    //declareFunction("all_quoted_isaP", "ALL-QUOTED-ISA?", 2, 2, false);
    //declareFunction("not_quoted_isaP", "NOT-QUOTED-ISA?", 2, 2, false);
    //declareFunction("not_quoted_isa_by_sbhlP", "NOT-QUOTED-ISA-BY-SBHL?", 2, 2, false);
    //declareFunction("not_quoted_isa_by_extent_knownP", "NOT-QUOTED-ISA-BY-EXTENT-KNOWN?", 2, 2, false);
    //declareFunction("quoted_instances", "QUOTED-INSTANCES", 1, 2, false);
    //declareFunction("union_all_quoted_instances", "UNION-ALL-QUOTED-INSTANCES", 1, 2, false);
    //declareFunction("map_all_quoted_isa", "MAP-ALL-QUOTED-ISA", 2, 2, false);
    //declareFunction("map_all_quoted_instances", "MAP-ALL-QUOTED-INSTANCES", 2, 2, false);
    //declareFunction("map_quoted_isa", "MAP-QUOTED-ISA", 2, 2, false);
    //declareFunction("map_min_quoted_isa", "MAP-MIN-QUOTED-ISA", 2, 2, false);
    //declareFunction("all_quoted_isa", "ALL-QUOTED-ISA", 1, 2, false);
    //declareFunction("all_quoted_isa_in_any_mt", "ALL-QUOTED-ISA-IN-ANY-MT", 1, 0, false);
    //declareFunction("all_quoted_isa_in_mt", "ALL-QUOTED-ISA-IN-MT", 1, 1, false);
    //declareFunction("all_quoted_isa_in_mts", "ALL-QUOTED-ISA-IN-MTS", 1, 1, false);
    //declareFunction("all_quoted_isas_wrt", "ALL-QUOTED-ISAS-WRT", 2, 2, false);
    //declareFunction("all_quoted_instances", "ALL-QUOTED-INSTANCES", 1, 2, false);
    //declareFunction("all_quoted_instances_in_all_mts", "ALL-QUOTED-INSTANCES-IN-ALL-MTS", 1, 0, false);
    //declareFunction("all_quoted_isa_among", "ALL-QUOTED-ISA-AMONG", 2, 2, false);
    declareFunction("asserted_quoted_isaP", "ASSERTED-QUOTED-ISA?", 1, 1, false);
    //declareFunction("asserted_quoted_isa", "ASSERTED-QUOTED-ISA", 1, 1, false);
    declareFunction("quoted_instanceof_after_adding", "QUOTED-INSTANCEOF-AFTER-ADDING", 2, 0, false);
    //declareFunction("quoted_instanceof_after_removing", "QUOTED-INSTANCEOF-AFTER-REMOVING", 2, 0, false);
    //declareFunction("all_instances_via_indexing", "ALL-INSTANCES-VIA-INDEXING", 1, 1, false);
    //declareFunction("instances_via_indexing", "INSTANCES-VIA-INDEXING", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_isa_file() {
    $all_isas_wrt$ = defparameter("*ALL-ISAS-WRT*", NIL);
    $all_isas_wrt_isa$ = defparameter("*ALL-ISAS-WRT-ISA*", NIL);
    $random_instance_of_sampling_ratio$ = deflexical("*RANDOM-INSTANCE-OF-SAMPLING-RATIO*", TWENTY_INTEGER);
    return NIL;
  }

  public static final SubLObject setup_isa_file() {
        utilities_macros.register_cyc_api_function($sym2$MIN_ISA, $list3, $str4$Returns_most_specific_collections, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym8$MAX_NOT_ISA, $list3, $str9$Returns_most_general_collections_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym12$INSTANCES, $list13, $str14$Returns_the_asserted_instances_of, $list15, $list6);
    utilities_macros.register_cyc_api_function($sym16$MAX_INSTANCES, $list17, $str18$Returns_the_maximal_among_the_ass, $list15, $list6);
    access_macros.register_external_symbol($sym19$ALL_INSTANCES_WITH_MAX);
    utilities_macros.register_cyc_api_function($sym22$MIN_NOT_INSTANCES, $list17, $str23$Returns_the_most_specific_negated, $list15, $list6);
    utilities_macros.register_cyc_api_function($sym24$ISA_SIBLINGS, $list3, $str25$Returns_the_direct_isas_of_those_, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym26$INSTANCE_SIBLINGS, $list3, $str27$Returns_the_direct_instances_of_t, $list28, $list6);
    utilities_macros.register_cyc_api_function($sym45$MAP_INSTANCES, $list46, $str47$apply_FUNCTION_to_every__least_ge, $list48, NIL);
    utilities_macros.register_cyc_api_function($sym49$ALL_ISA, $list3, $str50$Returns_all_collections_that_incl, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym54$ALL_INSTANCES, $list17, $str55$Returns_all_instances_of_COLLECTI, $list15, $list56);
    utilities_macros.register_cyc_api_function($sym57$ALL_INSTANCES_IN_ALL_MTS, $list58, $str59$_return_listp__all_instances_of_C, $list60, $list56);
    access_macros.define_obsolete_register($sym61$ALL_FORT_INSTANCES, $list62);
    access_macros.register_external_symbol($sym61$ALL_FORT_INSTANCES);
    access_macros.define_obsolete_register($sym64$ALL_FORT_INSTANCES_IN_ALL_MTS, $list65);
    utilities_macros.register_cyc_api_function($sym67$ALL_ISAS_WRT, $list68, $str69$Returns_all_isa_of_term_TERM_that, $list70, $list6);
    utilities_macros.register_cyc_api_function($sym72$UNION_ALL_ISA, $list73, $str74$Returns_all_collections_that_incl, $list75, $list6);
    utilities_macros.register_cyc_api_function($sym76$UNION_ALL_INSTANCES, $list77, $str78$Returns_set_of_all_instances_of_e, $list79, $list6);
    utilities_macros.register_cyc_api_function($sym80$ALL_ISA_AMONG, $list81, $str82$Returns_those_elements_of_COLLECT, $list83, $list6);
    utilities_macros.register_cyc_api_function($sym84$ALL_INSTANCES_AMONG, $list85, $str86$Returns_those_elements_of_TERMS_t, $list87, $list56);
    utilities_macros.register_cyc_api_function($sym90$ALL_NOT_ISA, $list3, $str91$Returns_all_collections_that_do_n, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym92$ALL_NOT_INSTANCES, $list17, $str93$Returns_all_terms_that_are_not_me, $list15, $list6);
    utilities_macros.register_cyc_api_function($sym94$NOT_ISA_AMONG, $list81, $str95$Returns_those_elements_of_COLLECT, $list83, $list6);
    utilities_macros.register_cyc_api_function($sym96$MAP_ALL_ISA, $list97, $str98$Apply_FUNCTION_to_every_all_isa_o, $list99, NIL);
    utilities_macros.register_cyc_api_function($sym100$MAP_ALL_INSTANCES, $list101, $str102$Apply_FUNCTION_to_each_unique_ins, $list103, NIL);
    utilities_macros.register_cyc_api_function($sym104$ANY_WRT_ALL_ISA, $list46, $str105$Return_the_first_encountered_non_, $list106, NIL);
    utilities_macros.register_cyc_api_function($sym113$COUNT_ALL_INSTANCES, $list114, $str115$Counts_the_number_of_instances_in, $list60, $list116);
    utilities_macros.register_cyc_api_function($sym118$COUNT_ALL_QUOTED_INSTANCES, $list114, $str119$Counts_the_number_of_quoted_insta, $list60, $list116);
    utilities_macros.register_cyc_api_function($sym121$ISA_, $list122, $str123$Returns_whether_TERM_is_an_instan, $list60, $list124);
    utilities_macros.register_cyc_api_function($sym125$ISA_IN_MTS_, $list126, $str127$is__term__an_element_of__collecti, $list60, $list124);
    utilities_macros.register_cyc_api_function($sym128$ISA_IN_ANY_MT_, $list129, $str130$is__term__an_element_of__collecti, NIL, $list124);
    utilities_macros.register_cyc_api_function($sym131$ANY_ISA_, $list81, $str132$Returns_whether_TERM_is_an_instan, $list83, $list124);
    utilities_macros.register_cyc_api_function($sym133$ISA_ANY_, $list81, $str132$Returns_whether_TERM_is_an_instan, $list83, $list124);
    utilities_macros.register_cyc_api_function($sym137$ANY_ISA_ANY_, $list138, $str139$_return_booleanp__whether_any_ter, $list140, $list124);
    utilities_macros.register_cyc_api_function($sym141$NOT_ISA_, $list122, $str142$_return_booleanp__whether_TERM_is, $list143, $list124);
    utilities_macros.register_cyc_api_function($sym144$WHY_ISA_, $list145, $str146$Returns_justification_of__isa_TER, $list143, $list147);
    utilities_macros.register_cyc_api_function($sym154$WHY_NOT_ISA_, $list145, $str155$Returns_justification_of__not__is, $list143, $list147);
    utilities_macros.register_cyc_api_function($sym156$INSTANCES_, $list114, $str157$Returns_whether_COLLECTION_has_an, $list60, $list124);
    utilities_macros.register_cyc_api_function($sym161$MAX_FLOOR_MTS_OF_ISA_PATHS, $list162, $str163$Returns_in_what__most_genl__mts_T, $list143, NIL);
    utilities_macros.register_kb_function($sym175$INSTANCEOF_AFTER_ADDING);
    utilities_macros.register_kb_function($sym176$ISA_AFTER_ADDING);
    utilities_macros.register_kb_function($sym184$INSTANCEOF_AFTER_REMOVING);
    utilities_macros.register_kb_function($sym185$ISA_AFTER_REMOVING);
    utilities_macros.register_cyc_api_function($sym186$QUOTED_ISA_, $list122, $str187$Returns_whether_TERM_is_a_quoted_, $list60, $list124);
    utilities_macros.register_cyc_api_function($sym188$QUOTED_ISA_IN_ANY_MT_, $list129, $str130$is__term__an_element_of__collecti, NIL, $list124);
    utilities_macros.register_cyc_api_function($sym189$ANY_QUOTED_ISA_, $list81, $str132$Returns_whether_TERM_is_an_instan, $list83, $list124);
    utilities_macros.register_cyc_api_function($sym190$QUOTED_ISA_ANY_, $list81, $str132$Returns_whether_TERM_is_an_instan, $list83, $list124);
    utilities_macros.register_cyc_api_function($sym191$ALL_QUOTED_ISA_, $list81, $str192$Returns_whether_TERM_is_a_quoted_, $list83, $list124);
    utilities_macros.register_cyc_api_function($sym193$NOT_QUOTED_ISA_, $list122, $str142$_return_booleanp__whether_TERM_is, $list143, $list124);
    utilities_macros.register_cyc_api_function($sym194$QUOTED_INSTANCES, $list13, $str14$Returns_the_asserted_instances_of, $list15, $list6);
    utilities_macros.register_cyc_api_function($sym195$UNION_ALL_QUOTED_INSTANCES, $list77, $str196$Returns_set_of_all_quoted_instanc, $list79, $list6);
    utilities_macros.register_cyc_api_function($sym197$MAP_ALL_QUOTED_ISA, $list97, $str198$Apply_FUNCTION_to_every_all_quote, $list99, NIL);
    utilities_macros.register_cyc_api_function($sym200$ALL_QUOTED_ISA, $list3, $str50$Returns_all_collections_that_incl, $list5, $list6);
    utilities_macros.register_cyc_api_function($sym201$ALL_QUOTED_ISAS_WRT, $list68, $str69$Returns_all_isa_of_term_TERM_that, $list70, $list6);
    utilities_macros.register_cyc_api_function($sym202$ALL_QUOTED_INSTANCES, $list17, $str55$Returns_all_instances_of_COLLECTI, $list15, $list6);
    utilities_macros.register_cyc_api_function($sym203$ALL_QUOTED_ISA_AMONG, $list81, $str204$Returns_those_elements_of_COLLECT, $list83, $list6);
    utilities_macros.register_kb_function($sym205$QUOTED_INSTANCEOF_AFTER_ADDING);
    utilities_macros.register_kb_function($sym206$QUOTED_INSTANCEOF_AFTER_REMOVING);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym1$HL_TERM_P = makeSymbol("HL-TERM-P");
  public static final SubLSymbol $sym2$MIN_ISA = makeSymbol("MIN-ISA");
  public static final SubLList $list3 = list(makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str4$Returns_most_specific_collections = makeString("Returns most-specific collections that include TERM (inexpensive)");
  public static final SubLList $list5 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));
  public static final SubLList $list6 = list(list(makeSymbol("LIST"), makeSymbol("FORT-P")));
  public static final SubLSymbol $sym7$RELEVANT_MT_IS_EQ = makeSymbol("RELEVANT-MT-IS-EQ");
  public static final SubLSymbol $sym8$MAX_NOT_ISA = makeSymbol("MAX-NOT-ISA");
  public static final SubLString $str9$Returns_most_general_collections_ = makeString("Returns most-general collections that do not include TERM (expensive)");
  public static final SubLObject $const10$True_JustificationTruth = constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"));
  public static final SubLSymbol $sym11$EL_FORT_P = makeSymbol("EL-FORT-P");
  public static final SubLSymbol $sym12$INSTANCES = makeSymbol("INSTANCES");
  public static final SubLList $list13 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), list(makeSymbol("TV"), constant_handles.reader_make_constant_shell(makeString("True-JustificationTruth"))));
  public static final SubLString $str14$Returns_the_asserted_instances_of = makeString("Returns the asserted instances of COL");
  public static final SubLList $list15 = list(list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym16$MAX_INSTANCES = makeSymbol("MAX-INSTANCES");
  public static final SubLList $list17 = list(makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str18$Returns_the_maximal_among_the_ass = makeString("Returns the maximal among the asserted instances of COL");
  public static final SubLSymbol $sym19$ALL_INSTANCES_WITH_MAX = makeSymbol("ALL-INSTANCES-WITH-MAX");
  public static final SubLSymbol $sym20$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $kw21$INVALID_ITERATION_TERM = makeKeyword("INVALID-ITERATION-TERM");
  public static final SubLSymbol $sym22$MIN_NOT_INSTANCES = makeSymbol("MIN-NOT-INSTANCES");
  public static final SubLString $str23$Returns_the_most_specific_negated = makeString("Returns the most-specific negated instances of collection COL");
  public static final SubLSymbol $sym24$ISA_SIBLINGS = makeSymbol("ISA-SIBLINGS");
  public static final SubLString $str25$Returns_the_direct_isas_of_those_ = makeString("Returns the direct isas of those collections of which TERM is a direct instance");
  public static final SubLSymbol $sym26$INSTANCE_SIBLINGS = makeSymbol("INSTANCE-SIBLINGS");
  public static final SubLString $str27$Returns_the_direct_instances_of_t = makeString("Returns the direct instances of those collections having direct isa TERM");
  public static final SubLList $list28 = list(list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym29$RELEVANT_SBHL_TV_IS_GENERAL_TV = makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
  public static final SubLSymbol $kw30$ERROR = makeKeyword("ERROR");
  public static final SubLString $str31$_A_is_not_a__A = makeString("~A is not a ~A");
  public static final SubLSymbol $sym32$SBHL_TRUE_TV_P = makeSymbol("SBHL-TRUE-TV-P");
  public static final SubLSymbol $kw33$CERROR = makeKeyword("CERROR");
  public static final SubLString $str34$continue_anyway = makeString("continue anyway");
  public static final SubLSymbol $kw35$WARN = makeKeyword("WARN");
  public static final SubLString $str36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");
  public static final SubLSymbol $kw37$OLD = makeKeyword("OLD");
  public static final SubLString $str38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
  public static final SubLSymbol $kw39$RESOURCE = makeKeyword("RESOURCE");
  public static final SubLSymbol $sym40$SBHL_SEARCH_TRUTH_VALUE_P = makeSymbol("SBHL-SEARCH-TRUTH-VALUE-P");
  public static final SubLList $list41 = list(makeSymbol("ISA"), makeUninternedSymbol("TABLE-MT"), makeUninternedSymbol("TABLE-TV"));
  public static final SubLObject $const42$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLList $list43 = list(makeUninternedSymbol("NAUT"), makeUninternedSymbol("ISA-MT"), makeUninternedSymbol("ISA-TV"));
  public static final SubLSymbol $sym44$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym45$MAP_INSTANCES = makeSymbol("MAP-INSTANCES");
  public static final SubLList $list46 = list(makeSymbol("FUNCTION"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str47$apply_FUNCTION_to_every__least_ge = makeString("apply FUNCTION to every (least general) #$isa of TERM");
  public static final SubLList $list48 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym49$ALL_ISA = makeSymbol("ALL-ISA");
  public static final SubLString $str50$Returns_all_collections_that_incl = makeString("Returns all collections that include TERM (inexpensive)");
  public static final SubLSymbol $sym51$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const52$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym53$RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER = makeSymbol("RELEVANT-MT-IS-GENL-MT-OF-LIST-MEMBER");
  public static final SubLSymbol $sym54$ALL_INSTANCES = makeSymbol("ALL-INSTANCES");
  public static final SubLString $str55$Returns_all_instances_of_COLLECTI = makeString("Returns all instances of COLLECTION (expensive)");
  public static final SubLList $list56 = list(list(makeSymbol("LIST"), makeSymbol("HL-TERM-P")));
  public static final SubLSymbol $sym57$ALL_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-INSTANCES-IN-ALL-MTS");
  public static final SubLList $list58 = list(makeSymbol("COLLECTION"));
  public static final SubLString $str59$_return_listp__all_instances_of_C = makeString("@return listp; all instances of COLLECTION in all mts.");
  public static final SubLList $list60 = list(list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym61$ALL_FORT_INSTANCES = makeSymbol("ALL-FORT-INSTANCES");
  public static final SubLList $list62 = list(makeSymbol("ALL-FORT-INSTANCES"));
  public static final SubLSymbol $sym63$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym64$ALL_FORT_INSTANCES_IN_ALL_MTS = makeSymbol("ALL-FORT-INSTANCES-IN-ALL-MTS");
  public static final SubLList $list65 = list(makeSymbol("ALL-INSTANCES-IN-ALL-MTS"));
  public static final SubLSymbol $sym66$GATHER_ISA_WRT_ISA = makeSymbol("GATHER-ISA-WRT-ISA");
  public static final SubLSymbol $sym67$ALL_ISAS_WRT = makeSymbol("ALL-ISAS-WRT");
  public static final SubLList $list68 = list(makeSymbol("TERM"), makeSymbol("ISA"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str69$Returns_all_isa_of_term_TERM_that = makeString("Returns all isa of term TERM that are also instances of collection ISA (ascending transitive closure; inexpensive)");
  public static final SubLList $list70 = list(list(makeSymbol("TERM"), makeSymbol("EL-FORT-P")), list(makeSymbol("ISA"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym71$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym72$UNION_ALL_ISA = makeSymbol("UNION-ALL-ISA");
  public static final SubLList $list73 = list(makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str74$Returns_all_collections_that_incl = makeString("Returns all collections that include any term in TERMS (inexpensive)");
  public static final SubLList $list75 = list(list(makeSymbol("TERMS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym76$UNION_ALL_INSTANCES = makeSymbol("UNION-ALL-INSTANCES");
  public static final SubLList $list77 = list(makeSymbol("COLS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str78$Returns_set_of_all_instances_of_e = makeString("Returns set of all instances of each collection in COLS (expensive)");
  public static final SubLList $list79 = list(list(makeSymbol("COLS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym80$ALL_ISA_AMONG = makeSymbol("ALL-ISA-AMONG");
  public static final SubLList $list81 = list(makeSymbol("TERM"), makeSymbol("COLLECTIONS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str82$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that include TERM as an all-instance");
  public static final SubLList $list83 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")), list(makeSymbol("COLLECTIONS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym84$ALL_INSTANCES_AMONG = makeSymbol("ALL-INSTANCES-AMONG");
  public static final SubLList $list85 = list(makeSymbol("COL"), makeSymbol("TERMS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str86$Returns_those_elements_of_TERMS_t = makeString("Returns those elements of TERMS that include COL as an all-isa");
  public static final SubLList $list87 = list(list(makeSymbol("COL"), makeSymbol("HL-TERM-P")), list(makeSymbol("TERMS"), makeSymbol("LISTP")));
  public static final SubLInteger $int88$50 = makeInteger(50);
  public static final SubLInteger $int89$25 = makeInteger(25);
  public static final SubLSymbol $sym90$ALL_NOT_ISA = makeSymbol("ALL-NOT-ISA");
  public static final SubLString $str91$Returns_all_collections_that_do_n = makeString("Returns all collections that do not include TERM (expensive)");
  public static final SubLSymbol $sym92$ALL_NOT_INSTANCES = makeSymbol("ALL-NOT-INSTANCES");
  public static final SubLString $str93$Returns_all_terms_that_are_not_me = makeString("Returns all terms that are not members of col (by assertion)");
  public static final SubLSymbol $sym94$NOT_ISA_AMONG = makeSymbol("NOT-ISA-AMONG");
  public static final SubLString $str95$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that do NOT include TERM");
  public static final SubLSymbol $sym96$MAP_ALL_ISA = makeSymbol("MAP-ALL-ISA");
  public static final SubLList $list97 = list(makeSymbol("FN"), makeSymbol("TERM"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str98$Apply_FUNCTION_to_every_all_isa_o = makeString("Apply FUNCTION to every all-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");
  public static final SubLList $list99 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));
  public static final SubLSymbol $sym100$MAP_ALL_INSTANCES = makeSymbol("MAP-ALL-INSTANCES");
  public static final SubLList $list101 = list(makeSymbol("FN"), makeSymbol("COL"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str102$Apply_FUNCTION_to_each_unique_ins = makeString("Apply FUNCTION to each unique instance of all specs of COLLECTION.");
  public static final SubLList $list103 = list(list(makeSymbol("FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("COL"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym104$ANY_WRT_ALL_ISA = makeSymbol("ANY-WRT-ALL-ISA");
  public static final SubLString $str105$Return_the_first_encountered_non_ = makeString("Return the first encountered non-nil result of applying FUNCTION to the all-isa of TERM\n   (FUNCTION may not affect the current sbhl search state)");
  public static final SubLList $list106 = list(list(makeSymbol("FUNCTION"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")));
  public static final SubLSymbol $sym107$ISA__GOAL = makeSymbol("ISA?-GOAL");
  public static final SubLSymbol $kw108$BREADTH = makeKeyword("BREADTH");
  public static final SubLSymbol $kw109$QUEUE = makeKeyword("QUEUE");
  public static final SubLSymbol $kw110$STACK = makeKeyword("STACK");
  public static final SubLList $list111 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));
  public static final SubLString $str112$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");
  public static final SubLSymbol $sym113$COUNT_ALL_INSTANCES = makeSymbol("COUNT-ALL-INSTANCES");
  public static final SubLList $list114 = list(makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str115$Counts_the_number_of_instances_in = makeString("Counts the number of instances in COLLECTION and then returns the count.");
  public static final SubLList $list116 = list(makeSymbol("INTEGERP"));
  public static final SubLObject $const117$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $sym118$COUNT_ALL_QUOTED_INSTANCES = makeSymbol("COUNT-ALL-QUOTED-INSTANCES");
  public static final SubLString $str119$Counts_the_number_of_quoted_insta = makeString("Counts the number of quoted instances in COLLECTION and then returns the count.");
  public static final SubLObject $const120$CollectionIntersectionFn = constant_handles.reader_make_constant_shell(makeString("CollectionIntersectionFn"));
  public static final SubLSymbol $sym121$ISA_ = makeSymbol("ISA?");
  public static final SubLList $list122 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str123$Returns_whether_TERM_is_an_instan = makeString("Returns whether TERM is an instance of COLLECTION via the SBHL, i.e. isa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");
  public static final SubLList $list124 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym125$ISA_IN_MTS_ = makeSymbol("ISA-IN-MTS?");
  public static final SubLList $list126 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("MTS"));
  public static final SubLString $str127$is__term__an_element_of__collecti = makeString("is <term> an element of <collection> via assertions in any mt in <mts>");
  public static final SubLSymbol $sym128$ISA_IN_ANY_MT_ = makeSymbol("ISA-IN-ANY-MT?");
  public static final SubLList $list129 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"));
  public static final SubLString $str130$is__term__an_element_of__collecti = makeString("is <term> an element of <collection> in any mt");
  public static final SubLSymbol $sym131$ANY_ISA_ = makeSymbol("ANY-ISA?");
  public static final SubLString $str132$Returns_whether_TERM_is_an_instan = makeString("Returns whether TERM is an instance of any collection in COLLECTIONS");
  public static final SubLSymbol $sym133$ISA_ANY_ = makeSymbol("ISA-ANY?");
  public static final SubLObject $const134$Collection = constant_handles.reader_make_constant_shell(makeString("Collection"));
  public static final SubLString $str135$_A_is_not_a_collection = makeString("~A is not a collection");
  public static final SubLSymbol $sym136$ISA_STORED_NAUT_ARG2_P = makeSymbol("ISA-STORED-NAUT-ARG2-P");
  public static final SubLSymbol $sym137$ANY_ISA_ANY_ = makeSymbol("ANY-ISA-ANY?");
  public static final SubLList $list138 = list(makeSymbol("TERMS"), makeSymbol("COLLECTIONS"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"));
  public static final SubLString $str139$_return_booleanp__whether_any_ter = makeString("@return booleanp; whether any term in TERMS is an instance of any collection in COLLECTIONS");
  public static final SubLList $list140 = list(list(makeSymbol("TERMS"), makeSymbol("LISTP")), list(makeSymbol("COLLECTIONS"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym141$NOT_ISA_ = makeSymbol("NOT-ISA?");
  public static final SubLString $str142$_return_booleanp__whether_TERM_is = makeString("@return booleanp; whether TERM is known to not be an instance of COLLECTION");
  public static final SubLList $list143 = list(list(makeSymbol("TERM"), makeSymbol("HL-TERM-P")), list(makeSymbol("COLLECTION"), makeSymbol("EL-FORT-P")));
  public static final SubLSymbol $sym144$WHY_ISA_ = makeSymbol("WHY-ISA?");
  public static final SubLList $list145 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("MT"), makeSymbol("TV"), makeSymbol("BEHAVIOR"));
  public static final SubLString $str146$Returns_justification_of__isa_TER = makeString("Returns justification of (isa TERM COLLECTION)");
  public static final SubLList $list147 = list(makeSymbol("LISTP"));
  public static final SubLObject $const148$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLList $list149 = list(makeKeyword("TRUE"));
  public static final SubLObject $const150$resultIsa = constant_handles.reader_make_constant_shell(makeString("resultIsa"));
  public static final SubLObject $const151$resultIsaArg = constant_handles.reader_make_constant_shell(makeString("resultIsaArg"));
  public static final SubLObject $const152$interArgResultIsa = constant_handles.reader_make_constant_shell(makeString("interArgResultIsa"));
  public static final SubLObject $const153$interArgResultIsaReln = constant_handles.reader_make_constant_shell(makeString("interArgResultIsaReln"));
  public static final SubLSymbol $sym154$WHY_NOT_ISA_ = makeSymbol("WHY-NOT-ISA?");
  public static final SubLString $str155$Returns_justification_of__not__is = makeString("Returns justification of (not (isa TERM COLLECTION))");
  public static final SubLSymbol $sym156$INSTANCES_ = makeSymbol("INSTANCES?");
  public static final SubLString $str157$Returns_whether_COLLECTION_has_an = makeString("Returns whether COLLECTION has any direct instances");
  public static final SubLSymbol $sym158$GATHER_GENLS_MTS = makeSymbol("GATHER-GENLS-MTS");
  public static final SubLSymbol $sym159$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLObject $const160$Thing = constant_handles.reader_make_constant_shell(makeString("Thing"));
  public static final SubLSymbol $sym161$MAX_FLOOR_MTS_OF_ISA_PATHS = makeSymbol("MAX-FLOOR-MTS-OF-ISA-PATHS");
  public static final SubLList $list162 = list(makeSymbol("TERM"), makeSymbol("COLLECTION"), makeSymbol("&OPTIONAL"), makeSymbol("TV"));
  public static final SubLString $str163$Returns_in_what__most_genl__mts_T = makeString("Returns in what (most-genl) mts TERM is an instance of COLLECTION");
  public static final SubLSymbol $sym164$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym165$GATHER_MIN_MTS_OF_PATHS_BETWEEN = makeSymbol("GATHER-MIN-MTS-OF-PATHS-BETWEEN");
  public static final SubLSymbol $kw166$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym167$CACHE_MTS_OF_ARG = makeSymbol("CACHE-MTS-OF-ARG");
  public static final SubLSymbol $sym168$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");
  public static final SubLObject $const169$resultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("resultQuotedIsa"));
  public static final SubLObject $const170$evaluationResultQuotedIsa = constant_handles.reader_make_constant_shell(makeString("evaluationResultQuotedIsa"));
  public static final SubLSymbol $sym171$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLSymbol $sym172$KB_SET_OR_COLLECTION_P = makeSymbol("KB-SET-OR-COLLECTION-P");
  public static final SubLObject $const173$TheSet = constant_handles.reader_make_constant_shell(makeString("TheSet"));
  public static final SubLList $list174 = list(ONE_INTEGER);
  public static final SubLSymbol $sym175$INSTANCEOF_AFTER_ADDING = makeSymbol("INSTANCEOF-AFTER-ADDING");
  public static final SubLSymbol $sym176$ISA_AFTER_ADDING = makeSymbol("ISA-AFTER-ADDING");
  public static final SubLList $list177 = list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("SUBSET-EXPR"));
  public static final SubLObject $const178$CollectionSubsetFn = constant_handles.reader_make_constant_shell(makeString("CollectionSubsetFn"));
  public static final SubLList $list179 = list(makeSymbol("CSFN"), makeSymbol("COL"), makeSymbol("COLEXPR"));
  public static final SubLList $list180 = list(makeSymbol("ISA"), makeSymbol("TERM"), makeSymbol("COLEXPR"));
  public static final SubLObject $const181$TheCollectionOf = constant_handles.reader_make_constant_shell(makeString("TheCollectionOf"));
  public static final SubLList $list182 = list(makeSymbol("TSO"), makeSymbol("VAR"), makeSymbol("PROP"));
  public static final SubLSymbol $kw183$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym184$INSTANCEOF_AFTER_REMOVING = makeSymbol("INSTANCEOF-AFTER-REMOVING");
  public static final SubLSymbol $sym185$ISA_AFTER_REMOVING = makeSymbol("ISA-AFTER-REMOVING");
  public static final SubLSymbol $sym186$QUOTED_ISA_ = makeSymbol("QUOTED-ISA?");
  public static final SubLString $str187$Returns_whether_TERM_is_a_quoted_ = makeString("Returns whether TERM is a quoted instance of COLLECTION via the SBHL, i.e. quotedIsa and genls assertions.\n@note This function does _not_ use defns to determine membership in COLLECTION.\n@see has-type?\n@see quiet-has-type?");
  public static final SubLSymbol $sym188$QUOTED_ISA_IN_ANY_MT_ = makeSymbol("QUOTED-ISA-IN-ANY-MT?");
  public static final SubLSymbol $sym189$ANY_QUOTED_ISA_ = makeSymbol("ANY-QUOTED-ISA?");
  public static final SubLSymbol $sym190$QUOTED_ISA_ANY_ = makeSymbol("QUOTED-ISA-ANY?");
  public static final SubLSymbol $sym191$ALL_QUOTED_ISA_ = makeSymbol("ALL-QUOTED-ISA?");
  public static final SubLString $str192$Returns_whether_TERM_is_a_quoted_ = makeString("Returns whether TERM is a quoted instance of all collections in COLLECTIONS");
  public static final SubLSymbol $sym193$NOT_QUOTED_ISA_ = makeSymbol("NOT-QUOTED-ISA?");
  public static final SubLSymbol $sym194$QUOTED_INSTANCES = makeSymbol("QUOTED-INSTANCES");
  public static final SubLSymbol $sym195$UNION_ALL_QUOTED_INSTANCES = makeSymbol("UNION-ALL-QUOTED-INSTANCES");
  public static final SubLString $str196$Returns_set_of_all_quoted_instanc = makeString("Returns set of all quoted instances of each collection in COLS (expensive)");
  public static final SubLSymbol $sym197$MAP_ALL_QUOTED_ISA = makeSymbol("MAP-ALL-QUOTED-ISA");
  public static final SubLString $str198$Apply_FUNCTION_to_every_all_quote = makeString("Apply FUNCTION to every all-quoted-isa of TERM\n   (FUNCTION must not affect the current sbhl search state)");
  public static final SubLList $list199 = list(makeUninternedSymbol("NAUT"), makeUninternedSymbol("QUOTED-ISA-MT"), makeUninternedSymbol("QUOTED-ISA-TV"));
  public static final SubLSymbol $sym200$ALL_QUOTED_ISA = makeSymbol("ALL-QUOTED-ISA");
  public static final SubLSymbol $sym201$ALL_QUOTED_ISAS_WRT = makeSymbol("ALL-QUOTED-ISAS-WRT");
  public static final SubLSymbol $sym202$ALL_QUOTED_INSTANCES = makeSymbol("ALL-QUOTED-INSTANCES");
  public static final SubLSymbol $sym203$ALL_QUOTED_ISA_AMONG = makeSymbol("ALL-QUOTED-ISA-AMONG");
  public static final SubLString $str204$Returns_those_elements_of_COLLECT = makeString("Returns those elements of COLLECTIONS that include TERM as an all-quoted-instance");
  public static final SubLSymbol $sym205$QUOTED_INSTANCEOF_AFTER_ADDING = makeSymbol("QUOTED-INSTANCEOF-AFTER-ADDING");
  public static final SubLSymbol $sym206$QUOTED_INSTANCEOF_AFTER_REMOVING = makeSymbol("QUOTED-INSTANCEOF-AFTER-REMOVING");
  public static final SubLSymbol $kw207$GAF = makeKeyword("GAF");

  //// Initializers

  public void declareFunctions() {
    declare_isa_file();
  }

  public void initializeVariables() {
    init_isa_file();
  }

  public void runTopLevelForms() {
    setup_isa_file();
  }

}
