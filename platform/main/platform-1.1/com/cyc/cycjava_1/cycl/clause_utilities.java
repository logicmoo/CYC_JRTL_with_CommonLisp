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
//dm import com.cyc.cycjava_1.cycl.at_vars;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class clause_utilities extends SubLTranslatedFile {

  //// Constructor

  private clause_utilities() {}
  public static final SubLFile me = new clause_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.clause_utilities";

  //// Definitions

  /** Destructively modify CLAUSE to have NEG-LITS and POS-LITS. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 2010) 
  public static final SubLObject nmake_clause(SubLObject neg_lits, SubLObject pos_lits, SubLObject clause) {
    if ((neg_lits != clauses.neg_lits(clause))) {
      ConsesLow.set_nth(ZERO_INTEGER, clause, neg_lits);
    }
    if ((pos_lits != clauses.pos_lits(clause))) {
      ConsesLow.set_nth(ONE_INTEGER, clause, pos_lits);
    }
    return clause;
  }

  /** @return cnf-p ; A new cnf constructed from the true gaf ASENT. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 2533) 
  public static final SubLObject make_gaf_cnf(SubLObject asent) {
    return clauses.make_cnf(NIL, list(asent));
  }

  /** Destructively modify DNF to have NEG-LITS and POS-LITS, and return DNF itself. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 3775) 
  public static final SubLObject nmake_dnf(SubLObject neg_lits, SubLObject pos_lits, SubLObject dnf) {
    return nmake_clause(neg_lits, pos_lits, dnf);
  }

  /** @return booleanp; t iff CLAUSE is a clause with exactly NEG-LIT-COUNT neglits and exactly POS-LIT-COUNT poslits. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 4185) 
  public static final SubLObject clause_with_lit_counts_p(SubLObject clause, SubLObject neg_lit_count, SubLObject pos_lit_count) {
    return makeBoolean(((NIL != clauses.clause_p(clause))
           && (NIL != list_utilities.lengthE(clauses.neg_lits(clause), neg_lit_count, UNPROVIDED))
           && (NIL != list_utilities.lengthE(clauses.pos_lits(clause), pos_lit_count, UNPROVIDED))));
  }

  /** @return boolean; t iff CNF is a cnf representation of an atomic formula with exactly one poslit and no neglits.
   This is much quicker to check than @xref gaf-cnf?
   @owner pace */
  @SubL(source = "cycl/clause-utilities.lisp", position = 4510) 
  public static final SubLObject pos_atomic_cnf_p(SubLObject cnf) {
    return makeBoolean(((NIL != clauses.cnf_p(cnf))
           && (NIL != clause_with_lit_counts_p(cnf, ZERO_INTEGER, ONE_INTEGER))));
  }

  /** @return boolean; t iff CLAUSE is a clause representation of an atomic formula with exactly one poslit and no neglits.
   @owner pace */
  @SubL(source = "cycl/clause-utilities.lisp", position = 4804) 
  public static final SubLObject pos_atomic_clause_p(SubLObject clause) {
    return clause_with_lit_counts_p(clause, ZERO_INTEGER, ONE_INTEGER);
  }

  /** @return boolean; t iff CLAUSE is a clause representation of an atomic formula with exactly one neglit and no poslits.
   @owner pace */
  @SubL(source = "cycl/clause-utilities.lisp", position = 5325) 
  public static final SubLObject neg_atomic_clause_p(SubLObject clause) {
    return clause_with_lit_counts_p(clause, ONE_INTEGER, ZERO_INTEGER);
  }

  /** @return booleanp; t iff CLAUSE is an atomic clause, and all of the arguments to its predicate
   are variables.
   @owner pace */
  @SubL(source = "cycl/clause-utilities.lisp", position = 5554) 
  public static final SubLObject atomic_clause_with_all_var_argsP(SubLObject clause) {
    if ((NIL != clauses.atomic_clause_p(clause))) {
      {
        SubLObject asent = atomic_clause_asent(clause);
        SubLObject asent_args = cycl_utilities.atomic_sentence_args(asent, UNPROVIDED);
        if ((NIL != list_utilities.every_in_list($sym14$CYC_VAR_, asent_args, UNPROVIDED))) {
          return T;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 5935) 
  public static final SubLObject gaf_cnf_literal(SubLObject cnf) {
    return clauses.pos_lits(cnf).first();
  }

  /** returns the single pos-lit if it's a positive gaf cnf,
  or the single neg-lit if it's a negated gaf cnf. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 6219) 
  public static final SubLObject atomic_cnf_asent(SubLObject atomic_clause) {
    return ((NIL != pos_atomic_cnf_p(atomic_clause)) ? ((SubLObject) clauses.pos_lits(atomic_clause).first()) : clauses.neg_lits(atomic_clause).first());
  }

  /** returns the single pos-lit if it's a positive gaf clause,
  or the single neg-lit if it's a negated gaf clause. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 6492) 
  public static final SubLObject atomic_clause_asent(SubLObject atomic_clause) {
    return ((NIL != pos_atomic_clause_p(atomic_clause)) ? ((SubLObject) clauses.pos_lits(atomic_clause).first()) : clauses.neg_lits(atomic_clause).first());
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 6777) 
  public static final SubLObject atomic_cnf_predicate(SubLObject atomic_clause) {
    {
      SubLObject asent = atomic_cnf_asent(atomic_clause);
      SubLObject predicate = cycl_utilities.atomic_sentence_predicate(asent);
      return predicate;
    }
  }

  /** @return boolean; t iff OBJECT is a singleton list containing one @xref atomic-clause-p */
  @SubL(source = "cycl/clause-utilities.lisp", position = 7453) 
  public static final SubLObject atomic_clauses_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && (NIL != list_utilities.singletonP(object))
           && (NIL != clauses.atomic_clause_p(object.first()))));
  }

  /** @return boolean; t iff OBJECT is a singleton list containing one @xref pos-atomic-clause-p */
  @SubL(source = "cycl/clause-utilities.lisp", position = 7682) 
  public static final SubLObject pos_atomic_clauses_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && (NIL != list_utilities.singletonP(object))
           && (NIL != pos_atomic_clause_p(object.first()))));
  }

  /** @return 0 list; a list of the negative literals (neg-lits) in CLAUSE.
   @return 1 list; a list of the positive literals (pos-lits) in CLAUSE. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 8824) 
  public static final SubLObject unmake_clause(SubLObject clause) {
    return Values.values(clauses.neg_lits(clause), clauses.pos_lits(clause));
  }

  /** @return non-negative-integer-p; the number of literals
 (both positive and negative) in CLAUSE. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 10341) 
  public static final SubLObject clause_number_of_literals(SubLObject clause) {
    return clause_literal_count(clause);
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 10531) 
  public static final SubLObject clause_literal_count(SubLObject clause) {
    {
      SubLObject lit_count = ZERO_INTEGER;
      {
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject lit = NIL;
        for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
          lit_count = Numbers.add(lit_count, ONE_INTEGER);
        }
      }
      {
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject lit = NIL;
        for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
          lit_count = Numbers.add(lit_count, ONE_INTEGER);
        }
      }
      return lit_count;
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 10859) 
  public static final SubLObject binary_clause_p(SubLObject clause) {
    return Numbers.numE(TWO_INTEGER, clause_number_of_literals(clause));
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 11042) 
  public static final SubLObject all_literals_as_asents(SubLObject clause) {
    return ConsesLow.append(clauses.neg_lits(clause), clauses.pos_lits(clause));
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 12905) 
  public static final SubLObject clause_free_variables(SubLObject clause, SubLObject varP, SubLObject include_sequence_varsP) {
    if ((varP == UNPROVIDED)) {
      varP = $sym14$CYC_VAR_;
    }
    if ((include_sequence_varsP == UNPROVIDED)) {
      include_sequence_varsP = T;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = clause;
        SubLObject current = datum;
        SubLObject neg_lits = NIL;
        SubLObject pos_lits = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        neg_lits = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list16);
        pos_lits = current.first();
        current = current.rest();
        if ((NIL == current)) {
          {
            SubLObject bound = NIL;
            if (((NIL != clauses.atomic_clause_p(clause))
                 && (NIL != el_utilities.tou_litP(pos_lits.first())))) {
              {
                SubLObject result = NIL;
                {
                  SubLObject _prev_bind_0 = at_vars.$within_tou_gafP$.currentBinding(thread);
                  try {
                    at_vars.$within_tou_gafP$.bind(T, thread);
                    result = list_utilities.ordered_union(el_utilities.literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), el_utilities.literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), UNPROVIDED, UNPROVIDED);
                  } finally {
                    at_vars.$within_tou_gafP$.rebind(_prev_bind_0, thread);
                  }
                }
                return result;
              }
            } else {
              return list_utilities.ordered_union(el_utilities.literals_free_variables(neg_lits, bound, varP, include_sequence_varsP), el_utilities.literals_free_variables(pos_lits, bound, varP, include_sequence_varsP), UNPROVIDED, UNPROVIDED);
            }
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list16);
        }
      }
      return NIL;
    }
  }

  /** @note this could be memoized */
  @SubL(source = "cycl/clause-utilities.lisp", position = 17830) 
  public static final SubLObject new_subclause_spec(SubLObject negative_indices, SubLObject positive_indices) {
    {
      SubLObject list_var = negative_indices;
      checkType(list_var, $sym29$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym30$NON_NEGATIVE_INTEGER_P);
        }
      }
    }
    {
      SubLObject list_var = positive_indices;
      checkType(list_var, $sym29$NON_DOTTED_LIST_P);
      {
        SubLObject cdolist_list_var = list_var;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          checkType(elem, $sym30$NON_NEGATIVE_INTEGER_P);
        }
      }
    }
    negative_indices = canonicalize_literal_indices(negative_indices);
    positive_indices = canonicalize_literal_indices(positive_indices);
    return list(negative_indices, positive_indices);
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 18744) 
  public static final SubLObject new_single_literal_subclause_spec(SubLObject sense, SubLObject index) {
    {
      SubLObject negative_indices = ((sense == $kw12$NEG) ? ((SubLObject) list(index)) : NIL);
      SubLObject positive_indices = ((sense == $kw15$POS) ? ((SubLObject) list(index)) : NIL);
      return new_subclause_spec(negative_indices, positive_indices);
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 19002) 
  public static final SubLObject ncanonicalize_literal_indices(SubLObject indices) {
    return Sort.sort(indices, Symbols.symbol_function($sym31$_), UNPROVIDED);
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 19087) 
  public static final SubLObject canonicalize_literal_indices(SubLObject indices) {
    return ncanonicalize_literal_indices(conses_high.copy_list(indices));
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 19204) 
  public static final SubLObject new_complement_subclause_spec(SubLObject subclause_spec, SubLObject sample_clause) {
    {
      SubLObject neg_lit_count = Sequences.length(clauses.neg_lits(sample_clause));
      SubLObject pos_lit_count = Sequences.length(clauses.pos_lits(sample_clause));
      SubLObject datum = subclause_spec;
      SubLObject current = datum;
      SubLObject neg_indices = NIL;
      SubLObject pos_indices = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list32);
      neg_indices = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list32);
      pos_indices = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject complement_neg_indices = NIL;
          SubLObject complement_pos_indices = NIL;
          SubLObject neg_index = NIL;
          for (neg_index = ZERO_INTEGER; neg_index.numL(neg_lit_count); neg_index = Numbers.add(neg_index, ONE_INTEGER)) {
            if ((NIL == subl_promotions.memberP(neg_index, neg_indices, UNPROVIDED, UNPROVIDED))) {
              complement_neg_indices = cons(neg_index, complement_neg_indices);
            }
          }
          {
            SubLObject pos_index = NIL;
            for (pos_index = ZERO_INTEGER; pos_index.numL(pos_lit_count); pos_index = Numbers.add(pos_index, ONE_INTEGER)) {
              if ((NIL == subl_promotions.memberP(pos_index, pos_indices, UNPROVIDED, UNPROVIDED))) {
                complement_pos_indices = cons(pos_index, complement_pos_indices);
              }
            }
          }
          return new_subclause_spec(complement_neg_indices, complement_pos_indices);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list32);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 19874) 
  public static final SubLObject subclause_spec_negative_indices(SubLObject subclause_spec) {
    return subclause_spec.first();
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 20034) 
  public static final SubLObject subclause_spec_positive_indices(SubLObject subclause_spec) {
    return conses_high.second(subclause_spec);
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 20708) 
  public static final SubLObject index_and_sense_match_subclause_specP(SubLObject index, SubLObject sense, SubLObject subclause_spec) {
    return list_utilities.member_eqP(index, (($kw12$NEG == sense) ? ((SubLObject) subclause_spec_negative_indices(subclause_spec)) : subclause_spec_positive_indices(subclause_spec)));
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 21002) 
  public static final SubLObject subclause_specified_by_spec(SubLObject clause, SubLObject subclause_spec) {
    {
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw12$NEG;
            if ((NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec))) {
              if (($kw12$NEG == sense)) {
                neg_lits = cons(asent, neg_lits);
              } else {
                pos_lits = cons(asent, pos_lits);
              }
            }
          }
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw15$POS;
            if ((NIL != index_and_sense_match_subclause_specP(index, sense, subclause_spec))) {
              if (($kw12$NEG == sense)) {
                neg_lits = cons(asent, neg_lits);
              } else {
                pos_lits = cons(asent, pos_lits);
              }
            }
          }
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      {
        SubLObject subclause = clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
        return subclause;
      }
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 21358) 
  public static final SubLObject complement_of_subclause_specified_by_spec(SubLObject clause, SubLObject subclause_spec) {
    {
      SubLObject neg_lits = NIL;
      SubLObject pos_lits = NIL;
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.neg_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw12$NEG;
            if ((NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec))) {
              if (($kw12$NEG == sense)) {
                neg_lits = cons(asent, neg_lits);
              } else {
                pos_lits = cons(asent, pos_lits);
              }
            }
          }
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      {
        SubLObject index = ZERO_INTEGER;
        SubLObject cdolist_list_var = clauses.pos_lits(clause);
        SubLObject asent = NIL;
        for (asent = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), asent = cdolist_list_var.first()) {
          {
            SubLObject sense = $kw15$POS;
            if ((NIL == index_and_sense_match_subclause_specP(index, sense, subclause_spec))) {
              if (($kw12$NEG == sense)) {
                neg_lits = cons(asent, neg_lits);
              } else {
                pos_lits = cons(asent, pos_lits);
              }
            }
          }
          index = Numbers.add(index, ONE_INTEGER);
        }
      }
      {
        SubLObject subclause = clauses.make_clause(Sequences.nreverse(neg_lits), Sequences.nreverse(pos_lits));
        return subclause;
      }
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 21739) 
  public static final SubLObject subclause_spec_from_clauses(SubLObject big_clause, SubLObject little_clause) {
    {
      SubLObject neg_indices = literal_indices_from_literals(clauses.neg_lits(big_clause), clauses.neg_lits(little_clause));
      SubLObject pos_indices = literal_indices_from_literals(clauses.pos_lits(big_clause), clauses.pos_lits(little_clause));
      return new_subclause_spec(neg_indices, pos_indices);
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 22068) 
  public static final SubLObject literal_indices_from_literals(SubLObject big_lits, SubLObject little_lits) {
    {
      SubLObject indices = NIL;
      SubLObject cdolist_list_var = little_lits;
      SubLObject lit = NIL;
      for (lit = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), lit = cdolist_list_var.first()) {
        {
          SubLObject index = Sequences.position(lit, big_lits, Symbols.symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED);
          indices = cons(index, indices);
        }
      }
      return Sequences.nreverse(indices);
    }
  }

  @SubL(source = "cycl/clause-utilities.lisp", position = 22309) 
  public static final SubLObject subclause_spec_literal_count(SubLObject subclause_spec) {
    return Numbers.add(Sequences.length(subclause_spec_positive_indices(subclause_spec)), Sequences.length(subclause_spec_negative_indices(subclause_spec)));
  }

  /** Return T iff SUBCLAUSE-SPEC specifies a single literal. */
  @SubL(source = "cycl/clause-utilities.lisp", position = 22743) 
  public static final SubLObject single_literal_subclause_specP(SubLObject subclause_spec) {
    return Numbers.numE(ONE_INTEGER, subclause_spec_literal_count(subclause_spec));
  }

  public static final SubLObject declare_clause_utilities_file() {
    declareMacro(myName, "destructure_clause", "DESTRUCTURE-CLAUSE");
    declareMacro(myName, "do_subclause_spec", "DO-SUBCLAUSE-SPEC");
    declareMacro(myName, "do_subclause_spec_complement", "DO-SUBCLAUSE-SPEC-COMPLEMENT");
    declareMacro(myName, "destructure_contextualized_asent", "DESTRUCTURE-CONTEXTUALIZED-ASENT");
    declareFunction(myName, "remake_clause", "REMAKE-CLAUSE", 3, 0, false);
    declareFunction(myName, "nmake_clause", "NMAKE-CLAUSE", 3, 0, false);
    declareFunction(myName, "remake_cnf", "REMAKE-CNF", 3, 0, false);
    declareFunction(myName, "make_gaf_cnf", "MAKE-GAF-CNF", 1, 0, false);
    declareFunction(myName, "make_false_gaf_cnf", "MAKE-FALSE-GAF-CNF", 1, 0, false);
    declareFunction(myName, "make_gaf_dnf", "MAKE-GAF-DNF", 1, 0, false);
    declareFunction(myName, "make_false_gaf_dnf", "MAKE-FALSE-GAF-DNF", 1, 0, false);
    declareFunction(myName, "make_gaf_cnf_with_truth", "MAKE-GAF-CNF-WITH-TRUTH", 2, 0, false);
    declareFunction(myName, "make_gaf_dnf_with_truth", "MAKE-GAF-DNF-WITH-TRUTH", 2, 0, false);
    declareFunction(myName, "remake_dnf", "REMAKE-DNF", 3, 0, false);
    declareFunction(myName, "nmake_dnf", "NMAKE-DNF", 3, 0, false);
    declareFunction(myName, "asent_sense_to_literal", "ASENT-SENSE-TO-LITERAL", 2, 0, false);
    declareFunction(myName, "clausal_form_p", "CLAUSAL-FORM-P", 1, 0, false);
    declareFunction(myName, "clause_with_lit_counts_p", "CLAUSE-WITH-LIT-COUNTS-P", 3, 0, false);
    declareFunction(myName, "pos_atomic_cnf_p", "POS-ATOMIC-CNF-P", 1, 0, false);
    declareFunction(myName, "pos_atomic_clause_p", "POS-ATOMIC-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "neg_atomic_cnf_p", "NEG-ATOMIC-CNF-P", 1, 0, false);
    declareFunction(myName, "neg_atomic_clause_p", "NEG-ATOMIC-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "atomic_clause_with_all_var_argsP", "ATOMIC-CLAUSE-WITH-ALL-VAR-ARGS?", 1, 0, false);
    declareFunction(myName, "gaf_cnf_literal", "GAF-CNF-LITERAL", 1, 0, false);
    declareFunction(myName, "literals_with_sense", "LITERALS-WITH-SENSE", 2, 0, false);
    declareFunction(myName, "atomic_cnf_asent", "ATOMIC-CNF-ASENT", 1, 0, false);
    declareFunction(myName, "atomic_clause_asent", "ATOMIC-CLAUSE-ASENT", 1, 0, false);
    declareFunction(myName, "atomic_cnf_predicate", "ATOMIC-CNF-PREDICATE", 1, 0, false);
    declareFunction(myName, "atomic_clause_predicate", "ATOMIC-CLAUSE-PREDICATE", 1, 0, false);
    declareFunction(myName, "negate_clause", "NEGATE-CLAUSE", 1, 0, false);
    declareFunction(myName, "negate_clauses", "NEGATE-CLAUSES", 1, 0, false);
    declareFunction(myName, "atomic_clauses_p", "ATOMIC-CLAUSES-P", 1, 0, false);
    declareFunction(myName, "pos_atomic_clauses_p", "POS-ATOMIC-CLAUSES-P", 1, 0, false);
    declareFunction(myName, "neg_atomic_clauses_p", "NEG-ATOMIC-CLAUSES-P", 1, 0, false);
    declareFunction(myName, "atomic_clauses_asent", "ATOMIC-CLAUSES-ASENT", 1, 0, false);
    declareFunction(myName, "atomic_clauses_predicate", "ATOMIC-CLAUSES-PREDICATE", 1, 0, false);
    declareFunction(myName, "group_clauses_having_common_neg_lits", "GROUP-CLAUSES-HAVING-COMMON-NEG-LITS", 1, 1, false);
    declareFunction(myName, "unmake_clause", "UNMAKE-CLAUSE", 1, 0, false);
    declareFunction(myName, "cnfP", "CNF?", 1, 0, false);
    declareFunction(myName, "clauseP", "CLAUSE?", 1, 1, false);
    declareFunction(myName, "literals_specP", "LITERALS-SPEC?", 1, 1, false);
    declareFunction(myName, "literal_specP", "LITERAL-SPEC?", 1, 1, false);
    declareFunction(myName, "clause_literals", "CLAUSE-LITERALS", 1, 0, false);
    declareFunction(myName, "cnf_literals", "CNF-LITERALS", 1, 0, false);
    declareFunction(myName, "dnf_literals", "DNF-LITERALS", 1, 0, false);
    declareFunction(myName, "clause_from_el_literals", "CLAUSE-FROM-EL-LITERALS", 1, 0, false);
    declareFunction(myName, "clause_number_of_literals", "CLAUSE-NUMBER-OF-LITERALS", 1, 0, false);
    declareFunction(myName, "clause_literal_count", "CLAUSE-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "unary_clause_p", "UNARY-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "binary_clause_p", "BINARY-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "ternary_clause_p", "TERNARY-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "all_literals_as_asents", "ALL-LITERALS-AS-ASENTS", 1, 0, false);
    declareFunction(myName, "cnf_isa_lits", "CNF-ISA-LITS", 1, 0, false);
    declareFunction(myName, "cnf_tou_lits", "CNF-TOU-LITS", 1, 0, false);
    declareFunction(myName, "cnf_pred_lits", "CNF-PRED-LITS", 2, 0, false);
    declareFunction(myName, "gaf_clauseP", "GAF-CLAUSE?", 1, 0, false);
    declareFunction(myName, "clause_variables", "CLAUSE-VARIABLES", 1, 1, false);
    declareFunction(myName, "clause_free_sequence_variables", "CLAUSE-FREE-SEQUENCE-VARIABLES", 1, 1, false);
    declareFunction(myName, "clause_free_term_variables", "CLAUSE-FREE-TERM-VARIABLES", 1, 1, false);
    declareFunction(myName, "clause_free_variables", "CLAUSE-FREE-VARIABLES", 1, 2, false);
    declareFunction(myName, "terms_clauses", "TERMS-CLAUSES", 2, 1, false);
    declareFunction(myName, "term_clauses", "TERM-CLAUSES", 2, 1, false);
    declareFunction(myName, "term_clauses_including_refd_vars", "TERM-CLAUSES-INCLUDING-REFD-VARS", 2, 1, false);
    declareFunction(myName, "clauses_referencing_vars_recursive", "CLAUSES-REFERENCING-VARS-RECURSIVE", 3, 0, false);
    declareFunction(myName, "contextualized_literal_to_ist_sentence", "CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_formula", "CONTEXTUALIZED-DNF-FORMULA", 1, 0, false);
    declareFunction(myName, "contextualized_dnf_formula_from_clauses", "CONTEXTUALIZED-DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
    declareFunction(myName, "decontextualize_contextualized_clause", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE", 1, 0, false);
    declareFunction(myName, "decontextualize_contextualized_clauses", "DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSES", 1, 0, false);
    declareFunction(myName, "subclause_spec_p", "SUBCLAUSE-SPEC-P", 1, 0, false);
    declareFunction(myName, "new_subclause_spec", "NEW-SUBCLAUSE-SPEC", 2, 0, false);
    declareFunction(myName, "new_total_subclause_spec", "NEW-TOTAL-SUBCLAUSE-SPEC", 1, 0, false);
    declareFunction(myName, "new_pos_subclause_spec", "NEW-POS-SUBCLAUSE-SPEC", 1, 0, false);
    declareFunction(myName, "new_neg_subclause_spec", "NEW-NEG-SUBCLAUSE-SPEC", 1, 0, false);
    declareFunction(myName, "new_single_literal_subclause_spec", "NEW-SINGLE-LITERAL-SUBCLAUSE-SPEC", 2, 0, false);
    declareFunction(myName, "ncanonicalize_literal_indices", "NCANONICALIZE-LITERAL-INDICES", 1, 0, false);
    declareFunction(myName, "canonicalize_literal_indices", "CANONICALIZE-LITERAL-INDICES", 1, 0, false);
    declareFunction(myName, "new_complement_subclause_spec", "NEW-COMPLEMENT-SUBCLAUSE-SPEC", 2, 0, false);
    declareFunction(myName, "subclause_spec_negative_indices", "SUBCLAUSE-SPEC-NEGATIVE-INDICES", 1, 0, false);
    declareFunction(myName, "subclause_spec_positive_indices", "SUBCLAUSE-SPEC-POSITIVE-INDICES", 1, 0, false);
    declareFunction(myName, "subclause_spec_subsumesP", "SUBCLAUSE-SPEC-SUBSUMES?", 2, 0, false);
    declareFunction(myName, "index_and_sense_match_subclause_specP", "INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?", 3, 0, false);
    declareFunction(myName, "subclause_specified_by_spec", "SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
    declareFunction(myName, "complement_of_subclause_specified_by_spec", "COMPLEMENT-OF-SUBCLAUSE-SPECIFIED-BY-SPEC", 2, 0, false);
    declareFunction(myName, "subclause_spec_from_clauses", "SUBCLAUSE-SPEC-FROM-CLAUSES", 2, 0, false);
    declareFunction(myName, "literal_indices_from_literals", "LITERAL-INDICES-FROM-LITERALS", 2, 0, false);
    declareFunction(myName, "subclause_spec_literal_count", "SUBCLAUSE-SPEC-LITERAL-COUNT", 1, 0, false);
    declareFunction(myName, "empty_subclause_specP", "EMPTY-SUBCLAUSE-SPEC?", 1, 0, false);
    declareFunction(myName, "single_literal_subclause_specP", "SINGLE-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
    declareFunction(myName, "multi_literal_subclause_specP", "MULTI-LITERAL-SUBCLAUSE-SPEC?", 1, 0, false);
    declareFunction(myName, "total_subclause_specP", "TOTAL-SUBCLAUSE-SPEC?", 2, 0, false);
    declareFunction(myName, "clause_difference", "CLAUSE-DIFFERENCE", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_clause_utilities_file() {
    return NIL;
  }

  public static final SubLObject setup_clause_utilities_file() {
    // CVS_ID("Id: clause-utilities.lisp 126640 2008-12-04 13:39:36Z builder ");
    return NIL;
  }

  //// Internal Constants

  public static final SubLList $list0 = list(list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS")), makeSymbol("CLAUSE"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym1$CDESTRUCTURING_BIND = makeSymbol("CDESTRUCTURING-BIND");
  public static final SubLList $list2 = list(list(makeSymbol("ASENT"), makeSymbol("SENSE"), makeSymbol("CLAUSE"), makeSymbol("SUBCLAUSE-SPEC")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym3$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym4$DO_LITERALS_NUMBERED = makeSymbol("DO-LITERALS-NUMBERED");
  public static final SubLSymbol $sym5$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym6$INDEX_AND_SENSE_MATCH_SUBCLAUSE_SPEC_ = makeSymbol("INDEX-AND-SENSE-MATCH-SUBCLAUSE-SPEC?");
  public static final SubLSymbol $sym7$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym8$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLList $list9 = list(list(makeSymbol("MT"), makeSymbol("ASENT")), makeSymbol("CONTEXTUALIZED-ASENT"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $kw10$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym11$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $kw12$NEG = makeKeyword("NEG");
  public static final SubLList $list13 = list(makeKeyword("CNF"), makeKeyword("DNF"));
  public static final SubLSymbol $sym14$CYC_VAR_ = makeSymbol("CYC-VAR?");
  public static final SubLSymbol $kw15$POS = makeKeyword("POS");
  public static final SubLList $list16 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLSymbol $sym17$NEGATE_CLAUSE = makeSymbol("NEGATE-CLAUSE");
  public static final SubLSymbol $sym18$NEGATE_ATOMIC = makeSymbol("NEGATE-ATOMIC");
  public static final SubLList $list19 = list(makeSymbol("MT"), makeSymbol("LITERAL"));
  public static final SubLObject $const20$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym21$CONTEXTUALIZED_LITERAL_TO_IST_SENTENCE = makeSymbol("CONTEXTUALIZED-LITERAL-TO-IST-SENTENCE");
  public static final SubLSymbol $sym22$NEGATE = makeSymbol("NEGATE");
  public static final SubLObject $const23$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLSymbol $sym24$LISTP = makeSymbol("LISTP");
  public static final SubLObject $const25$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLSymbol $sym26$CONTEXTUALIZED_DNF_FORMULA = makeSymbol("CONTEXTUALIZED-DNF-FORMULA");
  public static final SubLSymbol $sym27$CONTEXTUALIZED_ASENT_ASENT = makeSymbol("CONTEXTUALIZED-ASENT-ASENT");
  public static final SubLSymbol $sym28$DECONTEXTUALIZE_CONTEXTUALIZED_CLAUSE = makeSymbol("DECONTEXTUALIZE-CONTEXTUALIZED-CLAUSE");
  public static final SubLSymbol $sym29$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym30$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym31$_ = makeSymbol("<");
  public static final SubLList $list32 = list(makeSymbol("NEG-INDICES"), makeSymbol("POS-INDICES"));
  public static final SubLSymbol $sym33$_ = makeSymbol("=");

  //// Initializers

  public void declareFunctions() {
    declare_clause_utilities_file();
  }

  public void initializeVariables() {
    init_clause_utilities_file();
  }

  public void runTopLevelForms() {
    setup_clause_utilities_file();
  }

}
