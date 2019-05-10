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
//dm import com.cyc.cycjava_1.cycl.clause_utilities;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.czer_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class clauses extends SubLTranslatedFile {

  //// Constructor

  private clauses() {}
  public static final SubLFile me = new clauses();
  public static final String myName = "com.cyc.cycjava_1.cycl.clauses";

  //// Definitions

  /** Returns T iff OBJECT is either a CNF or DNF clause. */
  @SubL(source = "cycl/clauses.lisp", position = 776) 
  public static final SubLObject clause_p(SubLObject object) {
    return makeBoolean((object.isList()
           && TWO_INTEGER.numE(Sequences.length(object))
           && object.first().isList()
           && conses_high.second(object).isList()));
  }

  /** Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals. */
  @SubL(source = "cycl/clauses.lisp", position = 1156) 
  public static final SubLObject make_clause(SubLObject neg_lits, SubLObject pos_lits) {
    checkType(neg_lits, $sym4$LISTP);
    checkType(pos_lits, $sym4$LISTP);
    return list(neg_lits, pos_lits);
  }

  /** Return the neg-lits of CLAUSE. */
  @SubL(source = "cycl/clauses.lisp", position = 1415) 
  public static final SubLObject neg_lits(SubLObject clause) {
    checkType(clause, $sym0$CLAUSE_P);
    return clause.first();
  }

  /** Return the pos-lits of CLAUSE. */
  @SubL(source = "cycl/clauses.lisp", position = 1736) 
  public static final SubLObject pos_lits(SubLObject clause) {
    checkType(clause, $sym0$CLAUSE_P);
    return conses_high.second(clause);
  }

  /** Destructively modify the pos-lits of CLAUSE to be POS-LITS. */
  @SubL(source = "cycl/clauses.lisp", position = 1896) 
  public static final SubLObject set_clause_pos_lits(SubLObject clause, SubLObject pos_lits) {
    ConsesLow.rplaca(clause.rest(), pos_lits);
    return clause;
  }

  /** Return the SENSE literal list of CLAUSE. */
  @SubL(source = "cycl/clauses.lisp", position = 2063) 
  public static final SubLObject clause_sense_lits(SubLObject clause, SubLObject sense) {
    checkType(clause, $sym0$CLAUSE_P);
    checkType(sense, $sym17$SENSE_P);
    {
      SubLObject pcase_var = sense;
      if (pcase_var.eql($kw18$NEG)) {
        return neg_lits(clause);
      } else if (pcase_var.eql($kw19$POS)) {
        return pos_lits(clause);
      }
    }
    return NIL;
  }

  /** Return T iff CLAUSE is a ground clause. */
  @SubL(source = "cycl/clauses.lisp", position = 2304) 
  public static final SubLObject ground_clause_p(SubLObject clause) {
    return makeBoolean(((NIL != clause_p(clause))
           && (NIL != variables.fully_bound_p(clause))));
  }

  /** Return T iff CLAUSE is an atomic clause. */
  @SubL(source = "cycl/clauses.lisp", position = 2478) 
  public static final SubLObject atomic_clause_p(SubLObject clause) {
    if ((NIL != clause_p(clause))) {
      {
        SubLObject neg_lits = neg_lits(clause);
        SubLObject pos_lits = pos_lits(clause);
        return makeBoolean((((NIL == neg_lits)
                 && (NIL != list_utilities.singletonP(pos_lits)))
              || ((NIL == pos_lits)
                 && (NIL != list_utilities.singletonP(neg_lits)))));
      }
    }
    return NIL;
  }

  /** Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses. */
  @SubL(source = "cycl/clauses.lisp", position = 3081) 
  public static final SubLObject clause_equal(SubLObject clause1, SubLObject clause2) {
    return makeBoolean(((NIL != clause_p(clause1))
           && clause1.equal(clause2)));
  }

  /** The empty clause (commonly called 'box') */
  @SubL(source = "cycl/clauses.lisp", position = 3285) 
  private static SubLSymbol $empty_clause$ = null;

  /** Return the empty clause. */
  @SubL(source = "cycl/clauses.lisp", position = 3391) 
  public static final SubLObject empty_clause() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return $empty_clause$.getDynamicValue(thread);
    }
  }

  /** Return T iff CLAUSE is empty. */
  @SubL(source = "cycl/clauses.lisp", position = 3502) 
  public static final SubLObject empty_clauseP(SubLObject clause) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(clause, $sym0$CLAUSE_P);
      return clause_equal(clause, $empty_clause$.getDynamicValue(thread));
    }
  }

  /** Construct an xnf (either cnf or dnf) clause from NEG-LITS and POS-LITS, each of which are lists of literals.
   @owner pace */
  @SubL(source = "cycl/clauses.lisp", position = 4547) 
  public static final SubLObject make_xnf(SubLObject neg_lits, SubLObject pos_lits) {
    return make_clause(neg_lits, pos_lits);
  }

  /** Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form. */
  @SubL(source = "cycl/clauses.lisp", position = 4786) 
  public static final SubLObject cnf_p(SubLObject object) {
    return clause_p(object);
  }

  /** Returns T iff OBJECT is a canonicalized CycL formula in disjunctive normal form. */
  @SubL(source = "cycl/clauses.lisp", position = 4980) 
  public static final SubLObject dnf_p(SubLObject object) {
    return clause_p(object);
  }

  /** Return T iff CNF is a cnf representation of a gaf formula. */
  @SubL(source = "cycl/clauses.lisp", position = 5123) 
  public static final SubLObject gaf_cnfP(SubLObject cnf) {
    return makeBoolean(((NIL != clause_utilities.pos_atomic_cnf_p(cnf))
           && (NIL != ground_clause_p(cnf))));
  }

  /** @return boolean; t iff OBJECT is a non-empty list of DNF clauses. */
  @SubL(source = "cycl/clauses.lisp", position = 5549) 
  public static final SubLObject dnf_clauses_p(SubLObject object) {
    if ((NIL != list_utilities.non_dotted_list_p(object))) {
      {
        SubLObject cdolist_list_var = object;
        SubLObject clause = NIL;
        for (clause = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), clause = cdolist_list_var.first()) {
          if ((NIL == dnf_p(clause))) {
            return NIL;
          }
        }
      }
      return T;
    }
    return NIL;
  }

  /** Construct a cnf clause from NEG-LITS and POS-LITS, each of which are lists of literals. */
  @SubL(source = "cycl/clauses.lisp", position = 5792) 
  public static final SubLObject make_cnf(SubLObject neg_lits, SubLObject pos_lits) {
    return make_clause(neg_lits, pos_lits);
  }

  /** Return a readable formula of CNF
   TRUTH only gets looked at for ground, single pos lit cnfs
   in which case TRUTH gives the truth of the gaf. */
  @SubL(source = "cycl/clauses.lisp", position = 6068) 
  public static final SubLObject cnf_formula(SubLObject cnf, SubLObject truth) {
    if ((truth == UNPROVIDED)) {
      truth = $kw43$TRUE;
    }
    checkType(cnf, $sym38$CNF_P);
    checkType(truth, $sym44$TRUTH_P);
    cnf = czer_utilities.possibly_escape_quote_hl_vars(cnf, UNPROVIDED);
    {
      SubLObject pos_lits = pos_lits(cnf);
      SubLObject neg_lits = neg_lits(cnf);
      if ((NIL != neg_lits.rest())) {
        neg_lits = cons($const45$and, neg_lits);
      } else {
        neg_lits = neg_lits.first();
      }
      if ((NIL != pos_lits.rest())) {
        pos_lits = cons($const46$or, pos_lits);
      } else {
        pos_lits = pos_lits.first();
      }
      if (((NIL != pos_lits)
           && (NIL != neg_lits))) {
        return list($const47$implies, neg_lits, pos_lits);
      } else if ((NIL != neg_lits)) {
        return list($const48$not, neg_lits);
      } else if ((NIL != pos_lits)) {
        if (((NIL != pos_lits(cnf).rest())
            || (NIL == variables.fully_bound_p(pos_lits))
            || (truth != $kw49$FALSE))) {
          return pos_lits;
        } else {
          return list($const48$not, pos_lits);
        }
      }
    }
    return NIL;
  }

  /** Construct a dnf clause from NEG-LITS and POS-LITS, each of which are lists of literals. */
  @SubL(source = "cycl/clauses.lisp", position = 7342) 
  public static final SubLObject make_dnf(SubLObject neg_lits, SubLObject pos_lits) {
    return make_clause(neg_lits, pos_lits);
  }

  /** Return a readable formula of DNF. */
  @SubL(source = "cycl/clauses.lisp", position = 7658) 
  public static final SubLObject dnf_formula(SubLObject dnf) {
    {
      SubLObject pos_lits = pos_lits(dnf);
      SubLObject neg_lits = Mapping.mapcar(Symbols.symbol_function($sym59$NEGATE), neg_lits(dnf));
      if ((NIL == neg_lits)) {
        if ((NIL != pos_lits.rest())) {
          return reader.bq_cons($const45$and, ConsesLow.append(pos_lits, NIL));
        } else {
          return pos_lits.first();
        }
      } else if ((NIL == pos_lits)) {
        if ((NIL != neg_lits.rest())) {
          return reader.bq_cons($const45$and, ConsesLow.append(neg_lits, NIL));
        } else {
          return neg_lits.first();
        }
      } else {
        return reader.bq_cons($const45$and, ConsesLow.append(ConsesLow.append(neg_lits, pos_lits), NIL));
      }
    }
  }

  public static final SubLObject declare_clauses_file() {
    declareFunction(myName, "clause_p", "CLAUSE-P", 1, 0, false);
    declareFunction(myName, "make_clause", "MAKE-CLAUSE", 2, 0, false);
    declareFunction(myName, "neg_lits", "NEG-LITS", 1, 0, false);
    declareFunction(myName, "set_clause_neg_lits", "SET-CLAUSE-NEG-LITS", 2, 0, false);
    declareFunction(myName, "pos_lits", "POS-LITS", 1, 0, false);
    declareFunction(myName, "set_clause_pos_lits", "SET-CLAUSE-POS-LITS", 2, 0, false);
    declareFunction(myName, "clause_sense_lits", "CLAUSE-SENSE-LITS", 2, 0, false);
    declareFunction(myName, "ground_clause_p", "GROUND-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "atomic_clause_p", "ATOMIC-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "lifting_clause_p", "LIFTING-CLAUSE-P", 1, 0, false);
    declareFunction(myName, "clause_equal", "CLAUSE-EQUAL", 2, 0, false);
    declareFunction(myName, "empty_clause", "EMPTY-CLAUSE", 0, 0, false);
    declareFunction(myName, "empty_clauseP", "EMPTY-CLAUSE?", 1, 0, false);
    declareFunction(myName, "clause_literal", "CLAUSE-LITERAL", 3, 0, false);
    declareFunction(myName, "clause_without_literal", "CLAUSE-WITHOUT-LITERAL", 3, 0, false);
    declareFunction(myName, "make_xnf", "MAKE-XNF", 2, 0, false);
    declareFunction(myName, "cnf_p", "CNF-P", 1, 0, false);
    declareFunction(myName, "dnf_p", "DNF-P", 1, 0, false);
    declareFunction(myName, "gaf_cnfP", "GAF-CNF?", 1, 0, false);
    declareFunction(myName, "clauses_p", "CLAUSES-P", 1, 0, false);
    declareFunction(myName, "dnf_clauses_p", "DNF-CLAUSES-P", 1, 0, false);
    declareFunction(myName, "make_cnf", "MAKE-CNF", 2, 0, false);
    declareFunction(myName, "cnf_equal", "CNF-EQUAL", 2, 0, false);
    declareFunction(myName, "cnf_formula", "CNF-FORMULA", 1, 1, false);
    declareFunction(myName, "cnf_formula_from_clauses", "CNF-FORMULA-FROM-CLAUSES", 1, 0, false);
    declareFunction(myName, "make_dnf", "MAKE-DNF", 2, 0, false);
    declareFunction(myName, "literal_of_dnf", "LITERAL-OF-DNF", 3, 0, false);
    declareFunction(myName, "dnf_formula", "DNF-FORMULA", 1, 0, false);
    declareFunction(myName, "dnf_formula_from_clauses", "DNF-FORMULA-FROM-CLAUSES", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_clauses_file() {
    $empty_clause$ = defparameter("*EMPTY-CLAUSE*", make_clause(NIL, NIL));
    return NIL;
  }

  public static final SubLObject setup_clauses_file() {
    // CVS_ID("Id: clauses.lisp 126640 2008-12-04 13:39:36Z builder ");
    utilities_macros.register_cyc_api_function($sym0$CLAUSE_P, $list1, $str2$Returns_T_iff_OBJECT_is_either_a_, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym5$MAKE_CLAUSE, $list6, $str7$Construct_a_clause_from_NEG_LITS_, $list8, $list9);
    utilities_macros.register_cyc_api_function($sym10$NEG_LITS, $list11, $str12$Return_the_neg_lits_of_CLAUSE_, $list13, $list14);
    utilities_macros.register_cyc_api_function($sym15$POS_LITS, $list11, $str16$Return_the_pos_lits_of_CLAUSE_, $list13, $list14);
    utilities_macros.register_cyc_api_function($sym20$GROUND_CLAUSE_P, $list11, $str21$Return_T_iff_CLAUSE_is_a_ground_c, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym22$ATOMIC_CLAUSE_P, $list11, $str23$Return_T_iff_CLAUSE_is_an_atomic_, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym24$CLAUSE_EQUAL, $list25, $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym27$EMPTY_CLAUSE, NIL, $str28$Return_the_empty_clause_, NIL, $list9);
    utilities_macros.register_cyc_api_function($sym29$EMPTY_CLAUSE_, $list11, $str30$Return_T_iff_CLAUSE_is_empty_, $list13, $list3);
    utilities_macros.register_cyc_api_function($sym32$CLAUSE_LITERAL, $list33, $str34$Return_literal_in_CLAUSE_specifie, $list35, NIL);
    utilities_macros.register_cyc_api_function($sym36$CLAUSE_WITHOUT_LITERAL, $list33, $str37$Return_a_new_clause_which_is_CLAU, $list35, $list9);
    utilities_macros.register_cyc_api_function($sym38$CNF_P, $list1, $str39$Returns_T_iff_OBJECT_is_a_canonic, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym40$GAF_CNF_, $list41, $str42$Return_T_iff_CNF_is_a_cnf_represe, NIL, $list3);
    utilities_macros.register_cyc_api_function($sym50$CNF_FORMULA, $list51, $str52$Return_a_readable_formula_of_CNF_, $list53, $list54);
    utilities_macros.register_cyc_api_function($sym55$CNF_FORMULA_FROM_CLAUSES, $list56, $str57$Return_a_readable_formula_from_a_, $list58, $list54);
    utilities_macros.register_cyc_api_function($sym60$DNF_FORMULA, $list61, $str62$Return_a_readable_formula_of_DNF_, NIL, $list54);
    utilities_macros.register_cyc_api_function($sym63$DNF_FORMULA_FROM_CLAUSES, $list64, $str65$Return_a_readable_formula_from_a_, $list66, $list54);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$CLAUSE_P = makeSymbol("CLAUSE-P");
  public static final SubLList $list1 = list(makeSymbol("OBJECT"));
  public static final SubLString $str2$Returns_T_iff_OBJECT_is_either_a_ = makeString("Returns T iff OBJECT is either a CNF or DNF clause.");
  public static final SubLList $list3 = list(makeSymbol("BOOLEANP"));
  public static final SubLSymbol $sym4$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym5$MAKE_CLAUSE = makeSymbol("MAKE-CLAUSE");
  public static final SubLList $list6 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));
  public static final SubLString $str7$Construct_a_clause_from_NEG_LITS_ = makeString("Construct a clause from NEG-LITS and POS-LITS, each of which are lists of literals.");
  public static final SubLList $list8 = list(list(makeSymbol("NEG-LITS"), makeSymbol("LISTP")), list(makeSymbol("POS-LITS"), makeSymbol("LISTP")));
  public static final SubLList $list9 = list(makeSymbol("CLAUSE-P"));
  public static final SubLSymbol $sym10$NEG_LITS = makeSymbol("NEG-LITS");
  public static final SubLList $list11 = list(makeSymbol("CLAUSE"));
  public static final SubLString $str12$Return_the_neg_lits_of_CLAUSE_ = makeString("Return the neg-lits of CLAUSE.");
  public static final SubLList $list13 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")));
  public static final SubLList $list14 = list(makeSymbol("LISTP"));
  public static final SubLSymbol $sym15$POS_LITS = makeSymbol("POS-LITS");
  public static final SubLString $str16$Return_the_pos_lits_of_CLAUSE_ = makeString("Return the pos-lits of CLAUSE.");
  public static final SubLSymbol $sym17$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $kw18$NEG = makeKeyword("NEG");
  public static final SubLSymbol $kw19$POS = makeKeyword("POS");
  public static final SubLSymbol $sym20$GROUND_CLAUSE_P = makeSymbol("GROUND-CLAUSE-P");
  public static final SubLString $str21$Return_T_iff_CLAUSE_is_a_ground_c = makeString("Return T iff CLAUSE is a ground clause.");
  public static final SubLSymbol $sym22$ATOMIC_CLAUSE_P = makeSymbol("ATOMIC-CLAUSE-P");
  public static final SubLString $str23$Return_T_iff_CLAUSE_is_an_atomic_ = makeString("Return T iff CLAUSE is an atomic clause.");
  public static final SubLSymbol $sym24$CLAUSE_EQUAL = makeSymbol("CLAUSE-EQUAL");
  public static final SubLList $list25 = list(makeSymbol("CLAUSE1"), makeSymbol("CLAUSE2"));
  public static final SubLString $str26$Return_T_iff_CLAUSE1_and_CLAUSE2_ = makeString("Return T iff CLAUSE1 and CLAUSE2 are both equivalent clauses.");
  public static final SubLSymbol $sym27$EMPTY_CLAUSE = makeSymbol("EMPTY-CLAUSE");
  public static final SubLString $str28$Return_the_empty_clause_ = makeString("Return the empty clause.");
  public static final SubLSymbol $sym29$EMPTY_CLAUSE_ = makeSymbol("EMPTY-CLAUSE?");
  public static final SubLString $str30$Return_T_iff_CLAUSE_is_empty_ = makeString("Return T iff CLAUSE is empty.");
  public static final SubLSymbol $sym31$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym32$CLAUSE_LITERAL = makeSymbol("CLAUSE-LITERAL");
  public static final SubLList $list33 = list(makeSymbol("CLAUSE"), makeSymbol("SENSE"), makeSymbol("NUM"));
  public static final SubLString $str34$Return_literal_in_CLAUSE_specifie = makeString("Return literal in CLAUSE specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
  public static final SubLList $list35 = list(list(makeSymbol("CLAUSE"), makeSymbol("CLAUSE-P")), list(makeSymbol("SENSE"), makeSymbol("SENSE-P")), list(makeSymbol("NUM"), makeSymbol("INTEGERP")));
  public static final SubLSymbol $sym36$CLAUSE_WITHOUT_LITERAL = makeSymbol("CLAUSE-WITHOUT-LITERAL");
  public static final SubLString $str37$Return_a_new_clause_which_is_CLAU = makeString("Return a new clause which is CLAUSE without the literal specified by SENSE and NUM.\n  SENSE must be either :pos or :neg.");
  public static final SubLSymbol $sym38$CNF_P = makeSymbol("CNF-P");
  public static final SubLString $str39$Returns_T_iff_OBJECT_is_a_canonic = makeString("Returns T iff OBJECT is a canonicalized CycL formula in conjunctive normal form.");
  public static final SubLSymbol $sym40$GAF_CNF_ = makeSymbol("GAF-CNF?");
  public static final SubLList $list41 = list(makeSymbol("CNF"));
  public static final SubLString $str42$Return_T_iff_CNF_is_a_cnf_represe = makeString("Return T iff CNF is a cnf representation of a gaf formula.");
  public static final SubLSymbol $kw43$TRUE = makeKeyword("TRUE");
  public static final SubLSymbol $sym44$TRUTH_P = makeSymbol("TRUTH-P");
  public static final SubLObject $const45$and = constant_handles.reader_make_constant_shell(makeString("and"));
  public static final SubLObject $const46$or = constant_handles.reader_make_constant_shell(makeString("or"));
  public static final SubLObject $const47$implies = constant_handles.reader_make_constant_shell(makeString("implies"));
  public static final SubLObject $const48$not = constant_handles.reader_make_constant_shell(makeString("not"));
  public static final SubLSymbol $kw49$FALSE = makeKeyword("FALSE");
  public static final SubLSymbol $sym50$CNF_FORMULA = makeSymbol("CNF-FORMULA");
  public static final SubLList $list51 = list(makeSymbol("CNF"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRUTH"), makeKeyword("TRUE")));
  public static final SubLString $str52$Return_a_readable_formula_of_CNF_ = makeString("Return a readable formula of CNF\n   TRUTH only gets looked at for ground, single pos lit cnfs\n   in which case TRUTH gives the truth of the gaf.");
  public static final SubLList $list53 = list(list(makeSymbol("CNF"), makeSymbol("CNF-P")), list(makeSymbol("TRUTH"), makeSymbol("TRUTH-P")));
  public static final SubLList $list54 = list(makeSymbol("EL-FORMULA-P"));
  public static final SubLSymbol $sym55$CNF_FORMULA_FROM_CLAUSES = makeSymbol("CNF-FORMULA-FROM-CLAUSES");
  public static final SubLList $list56 = list(makeSymbol("CNF-CLAUSES"));
  public static final SubLString $str57$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of CNF-CLAUSES.");
  public static final SubLList $list58 = list(list(makeSymbol("CNF-CLAUSES"), makeSymbol("LISTP")));
  public static final SubLSymbol $sym59$NEGATE = makeSymbol("NEGATE");
  public static final SubLSymbol $sym60$DNF_FORMULA = makeSymbol("DNF-FORMULA");
  public static final SubLList $list61 = list(makeSymbol("DNF"));
  public static final SubLString $str62$Return_a_readable_formula_of_DNF_ = makeString("Return a readable formula of DNF.");
  public static final SubLSymbol $sym63$DNF_FORMULA_FROM_CLAUSES = makeSymbol("DNF-FORMULA-FROM-CLAUSES");
  public static final SubLList $list64 = list(makeSymbol("DNF-CLAUSES"));
  public static final SubLString $str65$Return_a_readable_formula_from_a_ = makeString("Return a readable formula from a list of DNF-CLAUSES.");
  public static final SubLList $list66 = list(list(makeSymbol("DNF-CLAUSES"), makeSymbol("LISTP")));

  //// Initializers

  public void declareFunctions() {
    declare_clauses_file();
  }

  public void initializeVariables() {
    init_clauses_file();
  }

  public void runTopLevelForms() {
    setup_clauses_file();
  }

}
