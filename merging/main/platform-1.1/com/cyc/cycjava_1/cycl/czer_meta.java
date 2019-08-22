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

import com.cyc.cycjava.cycl.inference.harness.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.arity;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.at_admitted;
//dm import com.cyc.cycjava_1.cycl.at_macros;
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.control_vars;
//dm import com.cyc.cycjava_1.cycl.cycl_grammar;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.czer_main;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.czer_vars;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.fi;
//dm import com.cyc.cycjava_1.cycl.fort_types_interface;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.genl_mts;
//dm import com.cyc.cycjava_1.cycl.genls;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.kb_accessors;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.narts_high;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.inference.harness.removal_module_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.term;
//dm import com.cyc.cycjava_1.cycl.transform_list_utilities;
//dm import com.cyc.cycjava_1.cycl.uncanonicalizer;
//dm import com.cyc.cycjava_1.cycl.wff;
//dm import com.cyc.cycjava_1.cycl.wff_vars;

public  final class czer_meta extends SubLTranslatedFile {

  //// Constructor

  private czer_meta() {}
  public static final SubLFile me = new czer_meta();
  public static final String myName = "com.cyc.cycjava_1.cycl.czer_meta";

  //// Definitions

  @SubL(source = "cycl/czer-meta.lisp", position = 7791) 
  private static SubLSymbol $meta_relation_somewhereP_caching_state$ = null;

  public static final class $clear_meta_relation_somewhereP$ZeroArityFunction extends ZeroArityFunction {
    public $clear_meta_relation_somewhereP$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-META-RELATION-SOMEWHERE?")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9604"); }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 10322) 
  private static SubLSymbol $possibly_meta_relation_somewhereP_cached_caching_state$ = null;

  public static final class $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction extends ZeroArityFunction {
    public $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction() { super(extractFunctionNamed("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED")); }
    public SubLObject processItem() { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9605"); }
  }

  /** May return an arbitrary assertion if more than one assertion matches SENTENCE. */
  @SubL(source = "cycl/czer-meta.lisp", position = 12070) 
  public static final SubLObject find_assertion_cycl(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if (((NIL != el_utilities.el_formula_p(sentence))
        || (NIL != term.kb_assertionP(sentence)))) {
      return find_kb_assertions(sentence, mt).first();
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 13317) 
  public static final SubLObject find_kb_assertions(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    if ((NIL != term.kb_assertionP(sentence))) {
      return list(sentence);
    } else if ((NIL != el_utilities.mt_designating_literalP(sentence))) {
      return find_kb_assertions(Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30500"), Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30480"));
    } else {
      return find_assertions_cycl(sentence, mt);
    }
  }

  /** returns t iff we want to look up assertions robustly (by recanonicalization of assertions already existing in the KB).
   This can be set to t or nil by the global variable *robust-assertion-lookup*, but can also be set to :default.
   If it's set to :default, it used to be t iff we're in the canonicalizer, the wff-checker, or the recanonicalizer,
   but now (after Nov 2002) the default is nil.  It's too inefficient to try this by default; the problem should be
   solved at its root by recanonicalizing the uncanonical assertions. */
  @SubL(source = "cycl/czer-meta.lisp", position = 17516) 
  public static final SubLObject robust_assertion_lookupP() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (($kw16$DEFAULT == czer_vars.$robust_assertion_lookup$.getDynamicValue(thread))) {
        return NIL;
      } else {
        return czer_vars.$robust_assertion_lookup$.getDynamicValue(thread);
      }
    }
  }

  /** Finds a list of assertions in the KB which match the EL sentence SENTENCE.
   It does this by finding the best index, then looping through that index and using *cnf-matching-predicate*
   to check the equality of the canonical version of SENTENCE and the cnf expansion of each assertion.
   Assumes that the assertions in the KB are in canonical form, unless robust-assertion-lookup? is true.
   @return 0 list; a list of assertions
   @return 1 booleanp; whether there are some assertions specified by SENTENCE which were _not_ found.
                       This could happen for example when SENTENCE is a conjunction.
   @see robust-assertion-lookup? */
  @SubL(source = "cycl/czer-meta.lisp", position = 18206) 
  public static final SubLObject find_assertions_cycl(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != el_utilities.el_formula_p(sentence))) {
        {
          SubLObject fort_mt = cycl_utilities.reify_when_closed_naut(mt);
          if ((NIL == hlmt.hlmt_p(fort_mt))) {
            return NIL;
          }
          if (((NIL != czer_vars.$within_canonicalizerP$.getDynamicValue(thread))
              || (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)))) {
            return Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9602");
          } else {
            return find_assertions_cycl_int(sentence, fort_mt, NIL);
          }
        }
      } else if ((NIL != term.kb_assertionP(sentence))) {
        return list(sentence);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 20073) 
  private static SubLSymbol $cached_find_assertions_cycl_caching_state$ = null;

  @SubL(source = "cycl/czer-meta.lisp", position = 20073) 
  public static final SubLObject clear_cached_find_assertions_cycl() {
    {
      SubLObject cs = $cached_find_assertions_cycl_caching_state$.getGlobalValue();
      if ((NIL != cs)) {
        memoization_state.caching_state_clear(cs);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 20236) 
  public static final SubLObject find_assertions_cycl_int(SubLObject sentence, SubLObject mt, SubLObject include_genl_mtsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      thread.resetMultipleValues();
      {
        SubLObject result = find_assertions_cycl_int_2(sentence, mt, include_genl_mtsP);
        SubLObject missingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (((NIL == result)
             && (NIL != robust_assertion_lookupP()))) {
          {
            SubLObject _prev_bind_0 = control_vars.$cnf_matching_predicate$.currentBinding(thread);
            SubLObject _prev_bind_1 = control_vars.$gaf_matching_predicate$.currentBinding(thread);
            try {
              control_vars.$cnf_matching_predicate$.bind($sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_, thread);
              control_vars.$gaf_matching_predicate$.bind($sym20$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_, thread);
              thread.resetMultipleValues();
              {
                SubLObject result_7 = find_assertions_cycl_int_2(sentence, mt, include_genl_mtsP);
                SubLObject missingP_8 = thread.secondMultipleValue();
                thread.resetMultipleValues();
                result = result_7;
                missingP = missingP_8;
              }
            } finally {
              control_vars.$gaf_matching_predicate$.rebind(_prev_bind_1, thread);
              control_vars.$cnf_matching_predicate$.rebind(_prev_bind_0, thread);
            }
          }
        }
        return Values.values(result, missingP);
      }
    }
  }

  /** @return 0 a list of assertions found corresponding to SENTENCE in MT
   @return 1 booleanp; whether there are some assertions specified by SENTENCE which were _not_ found.
                       This could happen for example when SENTENCE is a conjunction.
   @return 2 something else */
  @SubL(source = "cycl/czer-meta.lisp", position = 20865) 
  public static final SubLObject find_assertions_cycl_int_2(SubLObject sentence, SubLObject mt, SubLObject include_genl_mtsP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject new_var_sentence = czer_main.el_nununiquify_vars(sentence);
        SubLObject all_assertions = NIL;
        SubLObject canon_cnf_tvs = NIL;
        SubLObject blists = NIL;
        SubLObject missingP = NIL;
        thread.resetMultipleValues();
        {
          SubLObject canon_cnf_tvs_9 = canon_cnfs_sentence(new_var_sentence, T, mt);
          SubLObject blists_10 = thread.secondMultipleValue();
          SubLObject mt_11 = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          canon_cnf_tvs = canon_cnf_tvs_9;
          blists = blists_10;
          mt = mt_11;
        }
        if ((NIL == cycl_grammar.cycl_truth_value_p(blists))) {
          {
            SubLObject cnf_tv = NIL;
            SubLObject cnf_tv_12 = NIL;
            SubLObject blist = NIL;
            SubLObject blist_13 = NIL;
            for (cnf_tv = canon_cnf_tvs, cnf_tv_12 = cnf_tv.first(), blist = blists, blist_13 = blist.first(); (!(((NIL == blist)
                   && (NIL == cnf_tv)))); cnf_tv = cnf_tv.rest(), cnf_tv_12 = cnf_tv.first(), blist = blist.rest(), blist_13 = blist.first()) {
              {
                SubLObject datum = cnf_tv_12;
                SubLObject current = datum;
                SubLObject cnf = NIL;
                SubLObject hl_tv = NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list21);
                cnf = current.first();
                current = current.rest();
                hl_tv = current;
                {
                  SubLObject assertions_for_cnf = find_assertions_from_cnf(cnf, blist_13, mt, include_genl_mtsP);
                  if ((NIL == assertions_for_cnf)) {
                    missingP = T;
                  }
                  all_assertions = ConsesLow.nconc(all_assertions, assertions_for_cnf);
                }
              }
            }
          }
        }
        if ((NIL == all_assertions)) {
          missingP = T;
        }
        return Values.values(Sequences.nreverse(all_assertions), missingP);
      }
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 22001) 
  public static final SubLObject find_assertions_from_cnf(SubLObject cnf, SubLObject blist, SubLObject mt, SubLObject include_genl_mtsP) {
    {
      SubLObject assertions_for_cnf = NIL;
      if (((NIL != clause_utilities.pos_atomic_cnf_p(cnf))
           && (NIL != el_utilities.mt_designating_literalP(clause_utilities.atomic_cnf_asent(cnf)))
           && (NIL != hlmt.hlmt_p(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30481"))))) {
        {
          SubLObject new_assertions = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9633");
          assertions_for_cnf = ConsesLow.nconc(assertions_for_cnf, new_assertions);
        }
      }
      if ((NIL != kb_accessors.decontextualized_atomic_cnfP(cnf))) {
        {
          SubLObject new_assertions = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9632");
          assertions_for_cnf = ConsesLow.nconc(assertions_for_cnf, new_assertions);
        }
      } else {
        {
          SubLObject new_assertions = ((NIL != mt_relevance_macros.all_mts_are_relevantP()) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12712")) : ((NIL != include_genl_mtsP) ? ((SubLObject) Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12714")) : removal_module_utilities.non_null_answer_to_singleton(kb_indexing.find_assertion(cnf, mt))));
          if ((NIL != new_assertions)) {
            assertions_for_cnf = ConsesLow.nconc(assertions_for_cnf, new_assertions);
          }
        }
      }
      return assertions_for_cnf;
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 24743) 
  public static final SubLObject canon_versions_sentence(SubLObject sentence, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject canon_versions = NIL;
        {
          SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_1 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_2 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_3 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
          SubLObject _prev_bind_4 = control_vars.$within_assert$.currentBinding(thread);
          SubLObject _prev_bind_5 = control_vars.$within_ask$.currentBinding(thread);
          try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            control_vars.$within_assert$.bind(NIL, thread);
            control_vars.$within_ask$.bind(NIL, thread);
            if ((NIL == czer_vars.valid_tense_czer_mode_p($kw22$ASSERT))) {
              Errors.error($str23$Cannot_set_tense_czer_to_invalid_);
            }
            {
              SubLObject _prev_bind_0_14 = czer_vars.$tense_czer_mode$.currentBinding(thread);
              try {
                czer_vars.$tense_czer_mode$.bind($kw22$ASSERT, thread);
                thread.resetMultipleValues();
                {
                  SubLObject canon_versions_15 = czer_main.canonicalize_wf_cycl_sentence(sentence, mt);
                  SubLObject mt_16 = thread.secondMultipleValue();
                  thread.resetMultipleValues();
                  canon_versions = canon_versions_15;
                  mt = mt_16;
                }
              } finally {
                czer_vars.$tense_czer_mode$.rebind(_prev_bind_0_14, thread);
              }
            }
          } finally {
            control_vars.$within_ask$.rebind(_prev_bind_5, thread);
            control_vars.$within_assert$.rebind(_prev_bind_4, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
          }
        }
        return Values.values(canon_versions, mt);
      }
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 25945) 
  public static final SubLObject canon_cnfs_sentence(SubLObject sentence, SubLObject canon_gafP, SubLObject mt) {
    if ((canon_gafP == UNPROVIDED)) {
      canon_gafP = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = mt_relevance_macros.$mt$.getDynamicValue();
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject canon_versions = NIL;
        thread.resetMultipleValues();
        {
          SubLObject canon_versions_17 = canon_versions_sentence(sentence, mt);
          SubLObject mt_18 = thread.secondMultipleValue();
          thread.resetMultipleValues();
          canon_versions = canon_versions_17;
          mt = mt_18;
        }
        {
          SubLObject blists = czer_utilities.extract_blists(canon_versions);
          SubLObject result = NIL;
          if ((NIL != el_utilities.el_formula_p(canon_versions))) {
            {
              SubLObject cdolist_list_var = canon_versions;
              SubLObject canon_version = NIL;
              for (canon_version = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), canon_version = cdolist_list_var.first()) {
                thread.resetMultipleValues();
                {
                  SubLObject cnf = fi.fi_canonicalize(canon_version, canon_gafP, UNPROVIDED);
                  SubLObject v_variables = thread.secondMultipleValue();
                  SubLObject hl_tv = thread.thirdMultipleValue();
                  thread.resetMultipleValues();
                  if ((NIL != canon_gafP)) {
                    result = cons(cons(cnf, hl_tv), result);
                  } else {
                    result = cons(cnf, result);
                  }
                }
              }
            }
          }
          return Values.values(Sequences.nreverse(result), blists, mt);
        }
      }
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 26590) 
  public static final SubLObject canonicalize_meta_clauses(SubLObject v_clauses) {
    if (($const24$True == v_clauses)) {
      return v_clauses;
    } else if (($const25$False == v_clauses)) {
      return v_clauses;
    } else {
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = v_clauses;
        SubLObject clause = NIL;
        for (clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
          if ((NIL != distributing_meta_proposition_clauseP(clause))) {
            result = ConsesLow.nconc(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9628"), result);
          } else if ((NIL != meta_proposition_clauseP(clause))) {
            result = cons(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9630"), result);
          } else {
            result = cons(clause, result);
          }
        }
        return Sequences.nreverse(result);
      }
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 31930) 
  public static final SubLObject meta_proposition_clauseP(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          if ((NIL != el_utilities.contains_subformula_p(asent))) {
            if ((NIL != control_vars.$within_ask$.getDynamicValue(thread))) {
              if ((NIL != cycl_utilities.expression_find_if($sym26$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED))) {
                return T;
              }
            } else {
              if ((NIL != cycl_utilities.expression_find_if($sym28$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED))) {
                return T;
              }
            }
          }
        }
      }
      {
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          if ((NIL != el_utilities.contains_subformula_p(asent))) {
            if ((NIL != control_vars.$within_ask$.getDynamicValue(thread))) {
              if ((NIL != cycl_utilities.expression_find_if($sym26$EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED))) {
                return T;
              }
            } else {
              if ((NIL != cycl_utilities.expression_find_if($sym28$GROUND_EL_META_FORMULA_, asent, UNPROVIDED, UNPROVIDED))) {
                return T;
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  /** @return boolean; t iff CLAUSE consists of exactly one pos-lit which is both a @xref meta-literal? and a @xref distributing-meta-literal?.
   If this returns true, CLAUSE will be canonicalized into a list of clauses with the formula args replaced by kb assertions. */
  @SubL(source = "cycl/czer-meta.lisp", position = 32400) 
  public static final SubLObject distributing_meta_proposition_clauseP(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == clauses.neg_lits(clause))) {
        {
          SubLObject pos_lits = clauses.pos_lits(clause);
          SubLObject literal = pos_lits.first();
          if ((NIL != list_utilities.singletonP(pos_lits))) {
            return makeBoolean(((NIL != distributing_meta_literalP(literal))
                   && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9646"))));
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/czer-meta.lisp", position = 33131) 
  public static final SubLObject distributing_meta_literalP(SubLObject literal) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != el_utilities.contains_subformula_p(literal))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30580")))) {
        return makeBoolean(((NIL != czer_utilities.distributing_meta_predP(el_utilities.literal_arg0(literal, UNPROVIDED)))
              || (NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9612"))
              || ((NIL != czer_vars.$distribute_meta_over_common_elP$.getDynamicValue(thread))
                 && (NIL != Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9642")))));
      }
      return NIL;
    }
  }

  public static final class $el_meta_formulaP$UnaryFunction extends UnaryFunction {
    public $el_meta_formulaP$UnaryFunction() { super(extractFunctionNamed("EL-META-FORMULA?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9623"); }
  }

  public static final class $el_meta_formulaP$BinaryFunction extends BinaryFunction {
    public $el_meta_formulaP$BinaryFunction() { super(extractFunctionNamed("EL-META-FORMULA?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9624"); }
  }

  public static final class $ground_el_meta_formulaP$UnaryFunction extends UnaryFunction {
    public $ground_el_meta_formulaP$UnaryFunction() { super(extractFunctionNamed("GROUND-EL-META-FORMULA?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9640"); }
  }

  public static final class $ground_el_meta_formulaP$BinaryFunction extends BinaryFunction {
    public $ground_el_meta_formulaP$BinaryFunction() { super(extractFunctionNamed("GROUND-EL-META-FORMULA?")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9641"); }
  }

  public static final SubLObject declare_czer_meta_file() {
    //declareFunction(myName, "has_exceptionP", "HAS-EXCEPTION?", 1, 0, false);
    //declareFunction(myName, "accessible_kb_assertions", "ACCESSIBLE-KB-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "accessible_kb_assertionsP", "ACCESSIBLE-KB-ASSERTIONS?", 1, 1, false);
    //declareFunction(myName, "accessible_assertions_cycl", "ACCESSIBLE-ASSERTIONS-CYCL", 1, 1, false);
    //declareFunction(myName, "kb_versions", "KB-VERSIONS", 1, 1, false);
    //declareFunction(myName, "literal_meta_args", "LITERAL-META-ARGS", 1, 1, false);
    //declareFunction(myName, "el_assertion_specP", "EL-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "el_gaf_assertion_specP", "EL-GAF-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "el_rule_assertion_specP", "EL-RULE-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "el_asserted_assertion_specP", "EL-ASSERTED-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "el_deduced_assertion_specP", "EL-DEDUCED-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "el_constrained_assertion_specP", "EL-CONSTRAINED-ASSERTION-SPEC?", 2, 1, false);
    //declareFunction(myName, "el_nl_semantic_assertion_specP", "EL-NL-SEMANTIC-ASSERTION-SPEC?", 1, 1, false);
    //declareFunction(myName, "common_el_sentencesP", "COMMON-EL-SENTENCES?", 1, 0, false);
    //declareFunction(myName, "meta_predicateP", "META-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "meta_relationP", "META-RELATION?", 1, 1, false);
    //declareFunction(myName, "clear_meta_relation_somewhereP", "CLEAR-META-RELATION-SOMEWHERE?", 0, 0, false); new $clear_meta_relation_somewhereP$ZeroArityFunction();
    //declareFunction(myName, "remove_meta_relation_somewhereP", "REMOVE-META-RELATION-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "meta_relation_somewhereP_internal", "META-RELATION-SOMEWHERE?-INTERNAL", 1, 0, false);
    //declareFunction(myName, "meta_relation_somewhereP", "META-RELATION-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "meta_relation_intP", "META-RELATION-INT?", 1, 1, false);
    //declareFunction(myName, "sentence_with_meta_predicateP", "SENTENCE-WITH-META-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "sentence_with_meta_relationP", "SENTENCE-WITH-META-RELATION?", 1, 1, false);
    //declareFunction(myName, "possibly_meta_predicateP", "POSSIBLY-META-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "possibly_meta_relationP", "POSSIBLY-META-RELATION?", 1, 1, false);
    //declareFunction(myName, "possibly_meta_relation_somewhereP", "POSSIBLY-META-RELATION-SOMEWHERE?", 1, 0, false);
    //declareFunction(myName, "clear_possibly_meta_relation_somewhereP_cached", "CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 0, 0, false); new $clear_possibly_meta_relation_somewhereP_cached$ZeroArityFunction();
    //declareFunction(myName, "remove_possibly_meta_relation_somewhereP_cached", "REMOVE-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false);
    //declareFunction(myName, "possibly_meta_relation_somewhereP_cached_internal", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-INTERNAL", 1, 0, false);
    //declareFunction(myName, "possibly_meta_relation_somewhereP_cached", "POSSIBLY-META-RELATION-SOMEWHERE?-CACHED", 1, 0, false);
    //declareFunction(myName, "possibly_meta_relation_intP", "POSSIBLY-META-RELATION-INT?", 1, 1, false);
    //declareFunction(myName, "sentence_with_possibly_meta_predicateP", "SENTENCE-WITH-POSSIBLY-META-PREDICATE?", 1, 1, false);
    //declareFunction(myName, "sentence_with_possibly_meta_relationP", "SENTENCE-WITH-POSSIBLY-META-RELATION?", 1, 1, false);
    //declareFunction(myName, "possibly_meta_argP", "POSSIBLY-META-ARG?", 2, 1, false);
    //declareFunction(myName, "possibly_but_not_definitely_meta_argP", "POSSIBLY-BUT-NOT-DEFINITELY-META-ARG?", 2, 1, false);
    //declareFunction(myName, "definitely_meta_argP", "DEFINITELY-META-ARG?", 2, 1, false);
    declareFunction(myName, "find_assertion_cycl", "FIND-ASSERTION-CYCL", 1, 1, false);
    //declareFunction(myName, "find_unique_assertion_cycl", "FIND-UNIQUE-ASSERTION-CYCL", 1, 1, false);
    //declareFunction(myName, "find_visible_assertion_cycl", "FIND-VISIBLE-ASSERTION-CYCL", 1, 1, false);
    declareFunction(myName, "find_kb_assertions", "FIND-KB-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "find_visible_kb_assertions", "FIND-VISIBLE-KB-ASSERTIONS", 1, 1, false);
    //declareFunction(myName, "find_visible_sibling_mt_assertions", "FIND-VISIBLE-SIBLING-MT-ASSERTIONS", 1, 0, false);
    //declareFunction(myName, "find_some_assertion_cycl", "FIND-SOME-ASSERTION-CYCL", 1, 1, false);
    //declareFunction(myName, "all_kb_assertions_findableP", "ALL-KB-ASSERTIONS-FINDABLE?", 1, 1, false);
    //declareFunction(myName, "recanonicalized_candidate_assertion_equals_cnfP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?", 2, 0, false);
    //declareFunction(myName, "recanonicalized_candidate_assertion_equals_gafP", "RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?", 2, 0, false);
    //declareFunction(myName, "recanonicalize_candidate_assertion", "RECANONICALIZE-CANDIDATE-ASSERTION", 0, 0, false);
    //declareFunction(myName, "candidate_assertion_el_formula", "CANDIDATE-ASSERTION-EL-FORMULA", 0, 0, false);
    //declareFunction(myName, "candidate_assertion_fi_formula", "CANDIDATE-ASSERTION-FI-FORMULA", 0, 0, false);
    declareFunction(myName, "robust_assertion_lookupP", "ROBUST-ASSERTION-LOOKUP?", 0, 0, false);
    declareFunction(myName, "find_assertions_cycl", "FIND-ASSERTIONS-CYCL", 1, 1, false);
    //declareFunction(myName, "find_visible_assertions_cycl", "FIND-VISIBLE-ASSERTIONS-CYCL", 1, 1, false);
    declareFunction(myName, "clear_cached_find_assertions_cycl", "CLEAR-CACHED-FIND-ASSERTIONS-CYCL", 0, 0, false);
    //declareFunction(myName, "remove_cached_find_assertions_cycl", "REMOVE-CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false);
    //declareFunction(myName, "cached_find_assertions_cycl_internal", "CACHED-FIND-ASSERTIONS-CYCL-INTERNAL", 3, 0, false);
    //declareFunction(myName, "cached_find_assertions_cycl", "CACHED-FIND-ASSERTIONS-CYCL", 3, 0, false);
    declareFunction(myName, "find_assertions_cycl_int", "FIND-ASSERTIONS-CYCL-INT", 3, 0, false);
    declareFunction(myName, "find_assertions_cycl_int_2", "FIND-ASSERTIONS-CYCL-INT-2", 3, 0, false);
    declareFunction(myName, "find_assertions_from_cnf", "FIND-ASSERTIONS-FROM-CNF", 4, 0, false);
    //declareFunction(myName, "find_assertions_from_mt_designating_literal", "FIND-ASSERTIONS-FROM-MT-DESIGNATING-LITERAL", 2, 0, false);
    //declareFunction(myName, "find_assertions_from_decontextualized_literal", "FIND-ASSERTIONS-FROM-DECONTEXTUALIZED-LITERAL", 2, 0, false);
    //declareFunction(myName, "canon_versions", "CANON-VERSIONS", 1, 1, false);
    declareFunction(myName, "canon_versions_sentence", "CANON-VERSIONS-SENTENCE", 1, 1, false);
    //declareFunction(myName, "canon_cnfs", "CANON-CNFS", 1, 2, false);
    declareFunction(myName, "canon_cnfs_sentence", "CANON-CNFS-SENTENCE", 1, 2, false);
    declareFunction(myName, "canonicalize_meta_clauses", "CANONICALIZE-META-CLAUSES", 1, 0, false);
    //declareFunction(myName, "express_as_meta_proposition", "EXPRESS-AS-META-PROPOSITION", 1, 0, false);
    //declareFunction(myName, "transform_delta", "TRANSFORM-DELTA", 3, 2, false);
    //declareFunction(myName, "ntransform_delta", "NTRANSFORM-DELTA", 3, 2, false);
    //declareFunction(myName, "ntransform_delta_int", "NTRANSFORM-DELTA-INT", 3, 2, false);
    //declareFunction(myName, "express_as_meta_formula", "EXPRESS-AS-META-FORMULA", 1, 0, false);
    //declareFunction(myName, "meta_assertion_formulas", "META-ASSERTION-FORMULAS", 1, 0, false);
    //declareFunction(myName, "express_as_meta_formula_int", "EXPRESS-AS-META-FORMULA-INT", 2, 0, false);
    //declareFunction(myName, "express_as_distributed_meta_proposition", "EXPRESS-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false);
    //declareFunction(myName, "express_asent_as_distributed_meta_proposition", "EXPRESS-ASENT-AS-DISTRIBUTED-META-PROPOSITION", 1, 0, false);
    declareFunction(myName, "meta_proposition_clauseP", "META-PROPOSITION-CLAUSE?", 1, 0, false);
    declareFunction(myName, "distributing_meta_proposition_clauseP", "DISTRIBUTING-META-PROPOSITION-CLAUSE?", 1, 0, false);
    declareFunction(myName, "distributing_meta_literalP", "DISTRIBUTING-META-LITERAL?", 1, 0, false);
    //declareFunction(myName, "distributing_meta_mt_literalP", "DISTRIBUTING-META-MT-LITERAL?", 1, 0, false);
    //declareFunction(myName, "meta_mt_literalP", "META-MT-LITERAL?", 1, 0, false);
    //declareFunction(myName, "meta_mt_formulaP", "META-MT-FORMULA?", 1, 0, false);
    //declareFunction(myName, "meta_literalP", "META-LITERAL?", 1, 1, false);
    //declareFunction(myName, "meta_formulaP", "META-FORMULA?", 1, 1, false);
    //declareFunction(myName, "meta_args_wffP", "META-ARGS-WFF?", 1, 2, false);
    //declareFunction(myName, "findable_assertion_argP", "FINDABLE-ASSERTION-ARG?", 4, 0, false);
    //declareFunction(myName, "meta_args_have_common_el_sentencesP", "META-ARGS-HAVE-COMMON-EL-SENTENCES?", 1, 1, false);
    //declareFunction(myName, "el_meta_formulaP", "EL-META-FORMULA?", 1, 1, false); new $el_meta_formulaP$UnaryFunction(); new $el_meta_formulaP$BinaryFunction();
    //declareFunction(myName, "ground_meta_formulaP", "GROUND-META-FORMULA?", 1, 2, false);
    //declareFunction(myName, "ground_el_meta_formulaP", "GROUND-EL-META-FORMULA?", 1, 2, false); new $ground_el_meta_formulaP$UnaryFunction(); new $ground_el_meta_formulaP$BinaryFunction();
    return NIL;
  }

  public static final SubLObject init_czer_meta_file() {
    $meta_relation_somewhereP_caching_state$ = deflexical("*META-RELATION-SOMEWHERE?-CACHING-STATE*", NIL);
    $possibly_meta_relation_somewhereP_cached_caching_state$ = deflexical("*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*", NIL);
    $cached_find_assertions_cycl_caching_state$ = deflexical("*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*", NIL);
    return NIL;
  }

  public static final SubLObject setup_czer_meta_file() {
        memoization_state.note_globally_cached_function($sym7$META_RELATION_SOMEWHERE_);
    memoization_state.note_globally_cached_function($sym13$POSSIBLY_META_RELATION_SOMEWHERE__CACHED);
    memoization_state.note_globally_cached_function($sym17$CACHED_FIND_ASSERTIONS_CYCL);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$EL_VAR_ = makeSymbol("EL-VAR?");
  public static final SubLSymbol $sym1$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym2$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");
  public static final SubLSymbol $sym3$RULE_ASSERTION_ = makeSymbol("RULE-ASSERTION?");
  public static final SubLSymbol $sym4$ASSERTED_ASSERTION_ = makeSymbol("ASSERTED-ASSERTION?");
  public static final SubLSymbol $sym5$DEDUCED_ASSERTION_ = makeSymbol("DEDUCED-ASSERTION?");
  public static final SubLSymbol $sym6$NL_SEMANTIC_ASSERTION_ = makeSymbol("NL-SEMANTIC-ASSERTION?");
  public static final SubLSymbol $sym7$META_RELATION_SOMEWHERE_ = makeSymbol("META-RELATION-SOMEWHERE?");
  public static final SubLSymbol $sym8$RELEVANT_MT_IS_EVERYTHING = makeSymbol("RELEVANT-MT-IS-EVERYTHING");
  public static final SubLObject $const9$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));
  public static final SubLSymbol $sym10$_META_RELATION_SOMEWHERE__CACHING_STATE_ = makeSymbol("*META-RELATION-SOMEWHERE?-CACHING-STATE*");
  public static final SubLSymbol $sym11$CLEAR_META_RELATION_SOMEWHERE_ = makeSymbol("CLEAR-META-RELATION-SOMEWHERE?");
  public static final SubLSymbol $kw12$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym13$POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol("POSSIBLY-META-RELATION-SOMEWHERE?-CACHED");
  public static final SubLSymbol $sym14$_POSSIBLY_META_RELATION_SOMEWHERE__CACHED_CACHING_STATE_ = makeSymbol("*POSSIBLY-META-RELATION-SOMEWHERE?-CACHED-CACHING-STATE*");
  public static final SubLSymbol $sym15$CLEAR_POSSIBLY_META_RELATION_SOMEWHERE__CACHED = makeSymbol("CLEAR-POSSIBLY-META-RELATION-SOMEWHERE?-CACHED");
  public static final SubLSymbol $kw16$DEFAULT = makeKeyword("DEFAULT");
  public static final SubLSymbol $sym17$CACHED_FIND_ASSERTIONS_CYCL = makeSymbol("CACHED-FIND-ASSERTIONS-CYCL");
  public static final SubLSymbol $sym18$_CACHED_FIND_ASSERTIONS_CYCL_CACHING_STATE_ = makeSymbol("*CACHED-FIND-ASSERTIONS-CYCL-CACHING-STATE*");
  public static final SubLSymbol $sym19$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_CNF_ = makeSymbol("RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-CNF?");
  public static final SubLSymbol $sym20$RECANONICALIZED_CANDIDATE_ASSERTION_EQUALS_GAF_ = makeSymbol("RECANONICALIZED-CANDIDATE-ASSERTION-EQUALS-GAF?");
  public static final SubLList $list21 = cons(makeSymbol("CNF"), makeSymbol("HL-TV"));
  public static final SubLSymbol $kw22$ASSERT = makeKeyword("ASSERT");
  public static final SubLString $str23$Cannot_set_tense_czer_to_invalid_ = makeString("Cannot set tense czer to invalid mode.");
  public static final SubLObject $const24$True = constant_handles.reader_make_constant_shell(makeString("True"));
  public static final SubLObject $const25$False = constant_handles.reader_make_constant_shell(makeString("False"));
  public static final SubLSymbol $sym26$EL_META_FORMULA_ = makeSymbol("EL-META-FORMULA?");
  public static final SubLSymbol $sym27$EXPRESS_AS_META_FORMULA = makeSymbol("EXPRESS-AS-META-FORMULA");
  public static final SubLSymbol $sym28$GROUND_EL_META_FORMULA_ = makeSymbol("GROUND-EL-META-FORMULA?");
  public static final SubLString $str29$invalid_meta_arg___s = makeString("invalid meta-arg: ~s");
  public static final SubLSymbol $kw30$IGNORE = makeKeyword("IGNORE");
  public static final SubLSymbol $sym31$KB_ASSERTION_ = makeSymbol("KB-ASSERTION?");
  public static final SubLSymbol $kw32$REGULARIZE = makeKeyword("REGULARIZE");

  //// Initializers

  public void declareFunctions() {
    declare_czer_meta_file();
  }

  public void initializeVariables() {
    init_czer_meta_file();
  }

  public void runTopLevelForms() {
    setup_czer_meta_file();
  }

}
