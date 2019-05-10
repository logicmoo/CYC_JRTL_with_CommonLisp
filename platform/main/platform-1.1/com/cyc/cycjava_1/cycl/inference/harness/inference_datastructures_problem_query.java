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

package  com.cyc.cycjava_1.cycl.inference.harness;

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
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.clauses;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_utilities;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.inference.harness.inference_czer;
import com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.utilities_macros;
import com.cyc.cycjava_1.cycl.variables;

public  final class inference_datastructures_problem_query extends SubLTranslatedFile {

  //// Constructor

  private inference_datastructures_problem_query() {}
  public static final SubLFile me = new inference_datastructures_problem_query();
  public static final String myName = "com.cyc.cycjava_1.cycl.inference.harness.inference_datastructures_problem_query";

  //// Definitions

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 897) 
  public static final SubLObject hl_contextualized_asent_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && (NIL != list_utilities.lengthE(object, TWO_INTEGER, UNPROVIDED))
           && (NIL != inference_context_spec_p(object.first()))
           && (NIL != el_utilities.possibly_sentence_p(conses_high.second(object)))));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1243) 
  public static final SubLObject inference_context_spec_p(SubLObject object) {
    return hlmt.possibly_hlmt_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1328) 
  public static final SubLObject make_contextualized_asent(SubLObject mt, SubLObject asent) {
    return list(mt, asent);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1425) 
  public static final SubLObject contextualized_asent_mt(SubLObject contextualized_asent) {
    return contextualized_asent.first();
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1541) 
  public static final SubLObject contextualized_asent_asent(SubLObject contextualized_asent) {
    return conses_high.second(contextualized_asent);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1649) 
  public static final SubLObject contextualized_asent_predicate(SubLObject contextualized_asent) {
    return cycl_utilities.atomic_sentence_predicate(contextualized_asent_asent(contextualized_asent));
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 1823) 
  public static final SubLObject contextualized_dnf_clause_p(SubLObject object) {
    if ((NIL != clauses.dnf_p(object))) {
      {
        SubLObject cdolist_list_var = clauses.neg_lits(object);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          if ((NIL == hl_contextualized_asent_p(asent))) {
            return NIL;
          }
        }
      }
      {
        SubLObject cdolist_list_var = clauses.pos_lits(object);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          if ((NIL == hl_contextualized_asent_p(asent))) {
            return NIL;
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3055) 
  public static final SubLObject contextualized_clause_has_literal_with_predicateP(SubLObject contextualized_clause, SubLObject predicate) {
    {
      SubLObject cdolist_list_var = clauses.neg_lits(contextualized_clause);
      SubLObject contextualized_asent = NIL;
      for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
        {
          SubLObject datum = contextualized_asent;
          SubLObject current = datum;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          asent = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate))) {
              return T;
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
          }
        }
      }
    }
    {
      SubLObject cdolist_list_var = clauses.pos_lits(contextualized_clause);
      SubLObject contextualized_asent = NIL;
      for (contextualized_asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), contextualized_asent = cdolist_list_var.first()) {
        {
          SubLObject datum = contextualized_asent;
          SubLObject current = datum;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          asent = current.first();
          current = current.rest();
          if ((NIL == current)) {
            if ((NIL != cycl_utilities.atomic_sentence_with_pred_p(asent, predicate))) {
              return T;
            }
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
          }
        }
      }
    }
    return NIL;
  }

  /** assumes CONTEXTUALIZED-CLAUSE is an atomic-clause-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 3388) 
  public static final SubLObject mt_asent_sense_from_atomic_contextualized_clause(SubLObject contextualized_clause) {
    if ((NIL != clause_utilities.pos_atomic_clause_p(contextualized_clause))) {
      {
        SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
        SubLObject datum = contextualized_asent;
        SubLObject current = datum;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        asent = current.first();
        current = current.rest();
        if ((NIL == current)) {
          return Values.values(mt, asent, $kw17$POS);
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
      }
    } else if ((NIL != clause_utilities.neg_atomic_clause_p(contextualized_clause))) {
      {
        SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(contextualized_clause);
        SubLObject datum = contextualized_asent;
        SubLObject current = datum;
        SubLObject mt = NIL;
        SubLObject asent = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        asent = current.first();
        current = current.rest();
        if ((NIL == current)) {
          return Values.values(mt, asent, $kw18$NEG);
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
      }
    } else {
      Errors.error($str19$_a_was_not_an_atomic_contextualiz, contextualized_clause);
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 4096) 
  public static final SubLObject contextualized_dnf_clauses_p(SubLObject object) {
    if ((NIL != clauses.dnf_clauses_p(object))) {
      {
        SubLObject cdolist_list_var = object;
        SubLObject dnf_clause = NIL;
        for (dnf_clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), dnf_clause = cdolist_list_var.first()) {
          if ((NIL == contextualized_dnf_clause_p(dnf_clause))) {
            return NIL;
          }
        }
      }
      return T;
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5268) 
  public static final SubLObject problem_query_p(SubLObject object) {
    return contextualized_dnf_clauses_p(object);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 5770) 
  public static final SubLObject new_problem_query_from_contextualized_clause(SubLObject contextualized_clause) {
    return list(contextualized_clause);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6088) 
  public static final SubLObject new_problem_query_from_subclause_spec(SubLObject contextualized_clause, SubLObject subclause_spec) {
    checkType(subclause_spec, $sym27$SUBCLAUSE_SPEC_P);
    {
      SubLObject contextualized_subclause = clause_utilities.subclause_specified_by_spec(contextualized_clause, subclause_spec);
      return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6419) 
  public static final SubLObject new_problem_query_without_subclause_spec(SubLObject contextualized_clause, SubLObject subclause_spec) {
    checkType(subclause_spec, $sym27$SUBCLAUSE_SPEC_P);
    {
      SubLObject contextualized_subclause = clause_utilities.complement_of_subclause_specified_by_spec(contextualized_clause, subclause_spec);
      return new_problem_query_from_contextualized_clause(contextualized_subclause);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 6767) 
  public static final SubLObject new_problem_query_from_contextualized_asent_sense(SubLObject contextualized_asent, SubLObject sense) {
    {
      SubLObject pcase_var = sense;
      if (pcase_var.eql($kw17$POS)) {
        return new_problem_query_from_contextualized_clause(clauses.make_clause(NIL, list(contextualized_asent)));
      } else if (pcase_var.eql($kw18$NEG)) {
        return new_problem_query_from_contextualized_clause(clauses.make_clause(list(contextualized_asent), NIL));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7574) 
  public static final SubLObject problem_query_in_equality_reasoning_domainP(SubLObject query, SubLObject equality_reasoning_domain) {
    {
      SubLObject pcase_var = equality_reasoning_domain;
      if (pcase_var.eql($kw29$NONE)) {
        return NIL;
      } else if (pcase_var.eql($kw26$ALL)) {
        return T;
      } else if (pcase_var.eql($kw30$SINGLE_LITERAL)) {
        return clause_utilities.atomic_clauses_p(query);
      } else {
        Errors.error($str31$Unexpected_equality_reasoning_dom, equality_reasoning_domain);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 7935) 
  public static final SubLObject problem_query_variables(SubLObject query) {
    return cycl_utilities.expression_gather(query, $sym32$HL_VARIABLE_P, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8036) 
  public static final SubLObject single_clause_problem_query_p(SubLObject object) {
    return makeBoolean(((NIL != problem_query_p(object))
           && (NIL != list_utilities.singletonP(object))));
  }

  /** @return boolean; whether OBJECT is a problem query consisting of
a single contextualized literal (either positive or negative). */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8503) 
  public static final SubLObject single_literal_problem_query_p(SubLObject object) {
    return makeBoolean(((NIL != problem_query_p(object))
           && (NIL != problem_query_has_single_literal_p(object))));
  }

  /** @return boolean; whether PROBLEM-QUERY has only 
   a single contextualized literal (either positive or negative). */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 8921) 
  public static final SubLObject problem_query_has_single_literal_p(SubLObject problem_query) {
    return makeBoolean(((NIL != list_utilities.singletonP(problem_query))
           && (NIL != clauses.atomic_clause_p(problem_query.first()))));
  }

  /** @param QUERY atomic-clauses-p;
   @return sense-p;  Returns the sense of query. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9626) 
  public static final SubLObject single_literal_problem_query_sense(SubLObject query) {
    if ((NIL != clause_utilities.pos_atomic_clauses_p(query))) {
      return $kw17$POS;
    } else {
      return $kw18$NEG;
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 9860) 
  public static final SubLObject single_literal_problem_query_mt(SubLObject query) {
    {
      SubLObject dnf_clause = query.first();
      SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
      SubLObject datum = contextualized_asent;
      SubLObject current = datum;
      SubLObject mt = NIL;
      SubLObject asent = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
      mt = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
      asent = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return mt;
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10123) 
  public static final SubLObject single_literal_problem_query_atomic_sentence(SubLObject query) {
    {
      SubLObject dnf_clause = query.first();
      SubLObject contextualized_asent = clause_utilities.atomic_clause_asent(dnf_clause);
      if ((NIL != contextualized_asent)) {
        {
          SubLObject datum = contextualized_asent;
          SubLObject current = datum;
          SubLObject mt = NIL;
          SubLObject asent = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          mt = current.first();
          current = current.rest();
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
          asent = current.first();
          current = current.rest();
          if ((NIL == current)) {
            return asent;
          } else {
            cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
          }
        }
      }
    }
    return NIL;
  }

  /** Assuming QUERY is a @xref single-literal-problem-query-p,
returns the predicate of its single contextualized literal. */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10424) 
  public static final SubLObject single_literal_problem_query_predicate(SubLObject query) {
    {
      SubLObject asent = single_literal_problem_query_atomic_sentence(query);
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return predicate;
    }
  }

  /** assumes QUERY is a singleton contextualized-dnf-clauses-p
whose single element is an atomic-clause-p */
  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 10753) 
  public static final SubLObject mt_asent_sense_from_singleton_query(SubLObject query) {
    {
      SubLObject clause = query.first();
      return mt_asent_sense_from_atomic_contextualized_clause(clause);
    }
  }

  @SubL(source = "cycl/inference/harness/inference-datastructures-problem-query.lisp", position = 11021) 
  private static SubLSymbol $formula_term_signature_counts$ = null;

  public static final class $formula_term_signature_visit$UnaryFunction extends UnaryFunction {
    public $formula_term_signature_visit$UnaryFunction() { super(extractFunctionNamed("FORMULA-TERM-SIGNATURE-VISIT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 35434"); }
  }

  public static final SubLObject declare_inference_datastructures_problem_query_file() {
    declareFunction(myName, "hl_contextualized_asent_p", "HL-CONTEXTUALIZED-ASENT-P", 1, 0, false);
    declareFunction(myName, "inference_context_spec_p", "INFERENCE-CONTEXT-SPEC-P", 1, 0, false);
    declareFunction(myName, "make_contextualized_asent", "MAKE-CONTEXTUALIZED-ASENT", 2, 0, false);
    declareFunction(myName, "contextualized_asent_mt", "CONTEXTUALIZED-ASENT-MT", 1, 0, false);
    declareFunction(myName, "contextualized_asent_asent", "CONTEXTUALIZED-ASENT-ASENT", 1, 0, false);
    declareFunction(myName, "contextualized_asent_predicate", "CONTEXTUALIZED-ASENT-PREDICATE", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_clause_p", "CONTEXTUALIZED-DNF-CLAUSE-P", 1, 0, false);
    declareMacro(myName, "do_contextualized_clause_literals", "DO-CONTEXTUALIZED-CLAUSE-LITERALS");
    declareFunction(myName, "contextualized_clause_has_literal_with_predicateP", "CONTEXTUALIZED-CLAUSE-HAS-LITERAL-WITH-PREDICATE?", 2, 0, false);
    declareFunction(myName, "mt_asent_sense_from_atomic_contextualized_clause", "MT-ASENT-SENSE-FROM-ATOMIC-CONTEXTUALIZED-CLAUSE", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_clauses_p", "CONTEXTUALIZED-DNF-CLAUSES-P", 1, 0, false);
    declareMacro(myName, "do_contextualized_clauses_literals", "DO-CONTEXTUALIZED-CLAUSES-LITERALS");
    declareFunction(myName, "sole_contextualized_asent_from_contextualized_clauses", "SOLE-CONTEXTUALIZED-ASENT-FROM-CONTEXTUALIZED-CLAUSES", 1, 0, false);
    declareFunction(myName, "sole_contextualized_clause_from_singleton_contextualized_clauses", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLETON-CONTEXTUALIZED-CLAUSES", 1, 0, false);
    declareFunction(myName, "problem_query_p", "PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "explanatory_subquery_spec_p", "EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
    declareFunction(myName, "non_explanatory_subquery_spec_p", "NON-EXPLANATORY-SUBQUERY-SPEC-P", 1, 0, false);
    declareFunction(myName, "new_problem_query_from_contextualized_clause", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-CLAUSE", 1, 0, false);
    declareFunction(myName, "new_problem_query_without_literal", "NEW-PROBLEM-QUERY-WITHOUT-LITERAL", 3, 0, false);
    declareFunction(myName, "new_problem_query_from_subclause_spec", "NEW-PROBLEM-QUERY-FROM-SUBCLAUSE-SPEC", 2, 0, false);
    declareFunction(myName, "new_problem_query_without_subclause_spec", "NEW-PROBLEM-QUERY-WITHOUT-SUBCLAUSE-SPEC", 2, 0, false);
    declareFunction(myName, "new_problem_query_from_contextualized_asent_sense", "NEW-PROBLEM-QUERY-FROM-CONTEXTUALIZED-ASENT-SENSE", 2, 0, false);
    declareFunction(myName, "new_problem_query_from_mt_asent_sense", "NEW-PROBLEM-QUERY-FROM-MT-ASENT-SENSE", 3, 0, false);
    declareMacro(myName, "do_problem_query_literals", "DO-PROBLEM-QUERY-LITERALS");
    declareFunction(myName, "problem_query_in_equality_reasoning_domainP", "PROBLEM-QUERY-IN-EQUALITY-REASONING-DOMAIN?", 2, 0, false);
    declareFunction(myName, "problem_query_variables", "PROBLEM-QUERY-VARIABLES", 1, 0, false);
    declareFunction(myName, "single_clause_problem_query_p", "SINGLE-CLAUSE-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "sole_contextualized_clause_from_single_clause_problem_query", "SOLE-CONTEXTUALIZED-CLAUSE-FROM-SINGLE-CLAUSE-PROBLEM-QUERY", 1, 0, false);
    declareFunction(myName, "single_literal_problem_query_p", "SINGLE-LITERAL-PROBLEM-QUERY-P", 1, 0, false);
    declareFunction(myName, "problem_query_has_single_literal_p", "PROBLEM-QUERY-HAS-SINGLE-LITERAL-P", 1, 0, false);
    declareFunction(myName, "asent_sense_and_mt_to_problem_query", "ASENT-SENSE-AND-MT-TO-PROBLEM-QUERY", 3, 0, false);
    declareFunction(myName, "single_literal_problem_query_sense", "SINGLE-LITERAL-PROBLEM-QUERY-SENSE", 1, 0, false);
    declareFunction(myName, "single_literal_problem_query_mt", "SINGLE-LITERAL-PROBLEM-QUERY-MT", 1, 0, false);
    declareFunction(myName, "single_literal_problem_query_atomic_sentence", "SINGLE-LITERAL-PROBLEM-QUERY-ATOMIC-SENTENCE", 1, 0, false);
    declareFunction(myName, "single_literal_problem_query_predicate", "SINGLE-LITERAL-PROBLEM-QUERY-PREDICATE", 1, 0, false);
    declareFunction(myName, "mt_asent_sense_from_singleton_query", "MT-ASENT-SENSE-FROM-SINGLETON-QUERY", 1, 0, false);
    declareFunction(myName, "formula_term_signature", "FORMULA-TERM-SIGNATURE", 1, 1, false);
    declareFunction(myName, "problem_query_term_signature", "PROBLEM-QUERY-TERM-SIGNATURE", 1, 0, false);
    declareFunction(myName, "problem_query_term_signature_estimated_size", "PROBLEM-QUERY-TERM-SIGNATURE-ESTIMATED-SIZE", 1, 0, false);
    declareFunction(myName, "formula_term_signature_visit", "FORMULA-TERM-SIGNATURE-VISIT", 1, 0, false); new $formula_term_signature_visit$UnaryFunction();
    declareFunction(myName, "postprocess_formula_term_signature", "POSTPROCESS-FORMULA-TERM-SIGNATURE", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_inference_datastructures_problem_query_file() {
    $formula_term_signature_counts$ = defparameter("*FORMULA-TERM-SIGNATURE-COUNTS*", NIL);
    return NIL;
  }

  public static final SubLObject setup_inference_datastructures_problem_query_file() {
    // CVS_ID("Id: inference-datastructures-problem-query.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.note_funcall_helper_function($sym34$FORMULA_TERM_SIGNATURE_VISIT);
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("CONTEXTUALIZED-CLAUSE"), makeSymbol("&KEY"), makeSymbol("INDEX"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list1 = list(makeKeyword("INDEX"), makeKeyword("DONE"));
  public static final SubLSymbol $kw2$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw3$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$INDEX_VAR = makeUninternedSymbol("INDEX-VAR");
  public static final SubLSymbol $sym6$DO_CONTEXTUALIZED_CLAUSE_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSE-LITERALS");
  public static final SubLSymbol $sym7$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym8$CONTEXTUALIZED_ASENT = makeUninternedSymbol("CONTEXTUALIZED-ASENT");
  public static final SubLSymbol $sym9$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym10$CLET = makeSymbol("CLET");
  public static final SubLList $list11 = list(makeKeyword("NEG"));
  public static final SubLSymbol $sym12$DO_NEG_LITS_NUMBERED = makeSymbol("DO-NEG-LITS-NUMBERED");
  public static final SubLSymbol $sym13$DESTRUCTURE_CONTEXTUALIZED_ASENT = makeSymbol("DESTRUCTURE-CONTEXTUALIZED-ASENT");
  public static final SubLList $list14 = list(makeKeyword("POS"));
  public static final SubLSymbol $sym15$DO_POS_LITS_NUMBERED = makeSymbol("DO-POS-LITS-NUMBERED");
  public static final SubLList $list16 = list(makeSymbol("MT"), makeSymbol("ASENT"));
  public static final SubLSymbol $kw17$POS = makeKeyword("POS");
  public static final SubLSymbol $kw18$NEG = makeKeyword("NEG");
  public static final SubLString $str19$_a_was_not_an_atomic_contextualiz = makeString("~a was not an atomic contextualized-clause");
  public static final SubLList $list20 = list(list(makeSymbol("ASENT-VAR"), makeSymbol("MT-VAR"), makeSymbol("SENSE-VAR"), makeSymbol("QUERY"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list21 = list(makeKeyword("DONE"));
  public static final SubLSymbol $sym22$CONTEXTUALIZED_CLAUSE = makeUninternedSymbol("CONTEXTUALIZED-CLAUSE");
  public static final SubLSymbol $sym23$DO_CLAUSES = makeSymbol("DO-CLAUSES");
  public static final SubLSymbol $sym24$ATOMIC_CLAUSES_P = makeSymbol("ATOMIC-CLAUSES-P");
  public static final SubLSymbol $sym25$SINGLETON_ = makeSymbol("SINGLETON?");
  public static final SubLSymbol $kw26$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym27$SUBCLAUSE_SPEC_P = makeSymbol("SUBCLAUSE-SPEC-P");
  public static final SubLSymbol $sym28$DO_CONTEXTUALIZED_CLAUSES_LITERALS = makeSymbol("DO-CONTEXTUALIZED-CLAUSES-LITERALS");
  public static final SubLSymbol $kw29$NONE = makeKeyword("NONE");
  public static final SubLSymbol $kw30$SINGLE_LITERAL = makeKeyword("SINGLE-LITERAL");
  public static final SubLString $str31$Unexpected_equality_reasoning_dom = makeString("Unexpected equality reasoning domain ~a");
  public static final SubLSymbol $sym32$HL_VARIABLE_P = makeSymbol("HL-VARIABLE-P");
  public static final SubLSymbol $sym33$SINGLE_CLAUSE_PROBLEM_QUERY_P = makeSymbol("SINGLE-CLAUSE-PROBLEM-QUERY-P");
  public static final SubLSymbol $sym34$FORMULA_TERM_SIGNATURE_VISIT = makeSymbol("FORMULA-TERM-SIGNATURE-VISIT");
  public static final SubLSymbol $sym35$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym36$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym37$_ = makeSymbol(">");
  public static final SubLSymbol $sym38$CDR = makeSymbol("CDR");

  //// Initializers

  public void declareFunctions() {
    declare_inference_datastructures_problem_query_file();
  }

  public void initializeVariables() {
    init_inference_datastructures_problem_query_file();
  }

  public void runTopLevelForms() {
    setup_inference_datastructures_problem_query_file();
  }

}
