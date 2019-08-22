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

import com.cyc.cycjava.cycl.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertion_utilities;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_utilities;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.forts;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class simple_indexing extends SubLTranslatedFile {

  //// Constructor

  private simple_indexing() {}
  public static final SubLFile me = new simple_indexing();
  public static final String myName = "com.cyc.cycjava_1.cycl.simple_indexing";

  //// Definitions

  @SubL(source = "cycl/simple-indexing.lisp", position = 1657) 
  public static final SubLObject matches_gaf_arg_index(SubLObject assertion, SubLObject v_term, SubLObject argnum, SubLObject pred, SubLObject mt) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.gaf_assertionP(assertion))) {
      return NIL;
    }
    return matches_gaf_arg_index_internal(assertion, v_term, argnum, pred, mt);
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 1902) 
  public static final SubLObject simple_key_gaf_arg_index(SubLObject assertion, SubLObject accumulator, SubLObject v_term, SubLObject arg, SubLObject pred) {
    if ((arg == UNPROVIDED)) {
      arg = NIL;
    }
    if ((pred == UNPROVIDED)) {
      pred = NIL;
    }
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      if ((NIL != matches_gaf_arg_index_internal(assertion, v_term, arg, pred, NIL))) {
        accumulator = simple_key_gaf_arg_index_internal(assertion, accumulator, v_term, arg, pred);
      }
    }
    return accumulator;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 2223) 
  public static final SubLObject matches_gaf_arg_index_internal(SubLObject assertion, SubLObject v_term, SubLObject arg, SubLObject pred, SubLObject mt) {
    if ((NIL == arg)) {
      return list_utilities.sublisp_boolean(Sequences.find(v_term, assertions_high.gaf_args(assertion), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
    if ((!(assertions_high.gaf_arg(assertion, arg).equal(v_term)))) {
      return NIL;
    }
    if ((NIL == pred)) {
      return T;
    }
    if ((assertions_high.gaf_predicate(assertion) != pred)) {
      return NIL;
    }
    if ((NIL == mt)) {
      return T;
    }
    return hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt);
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 2614) 
  public static final SubLObject simple_key_gaf_arg_index_internal(SubLObject assertion, SubLObject accumulator, SubLObject v_term, SubLObject arg, SubLObject pred) {
    if ((NIL != arg)) {
      if ((NIL != pred)) {
        {
          SubLObject item_var = assertions_high.assertion_mt(assertion);
          if ((NIL == conses_high.member(item_var, accumulator, $sym1$HLMT_EQUAL, Symbols.symbol_function(IDENTITY)))) {
            accumulator = cons(item_var, accumulator);
          }
        }
      } else {
        {
          SubLObject item_var = assertions_high.gaf_predicate(assertion);
          if ((NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
            accumulator = cons(item_var, accumulator);
          }
        }
      }
    } else {
      {
        SubLObject formula = assertions_high.gaf_formula(assertion);
        SubLObject last_position = NIL;
        SubLObject position = NIL;
        for (last_position = NIL, position = Sequences.position(v_term, formula, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), ONE_INTEGER, UNPROVIDED); (NIL != position); last_position = position, position = Sequences.position(v_term, formula, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY), Numbers.add(last_position, ONE_INTEGER), UNPROVIDED)) {
          {
            SubLObject item_var = position;
            if ((NIL == conses_high.member(item_var, accumulator, Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
              accumulator = cons(item_var, accumulator);
            }
          }
        }
      }
    }
    return accumulator;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 3150) 
  public static final SubLObject matches_nart_arg_index(SubLObject assertion, SubLObject v_term, SubLObject argnum, SubLObject func) {
    if ((argnum == UNPROVIDED)) {
      argnum = NIL;
    }
    if ((func == UNPROVIDED)) {
      func = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.gaf_assertionP(assertion))) {
      return NIL;
    }
    return matches_nart_arg_index_internal(assertion, v_term, argnum, func);
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 3502) 
  public static final SubLObject simple_key_nart_arg_index(SubLObject assertion, SubLObject accumulator, SubLObject v_term, SubLObject arg, SubLObject func) {
    if ((arg == UNPROVIDED)) {
      arg = NIL;
    }
    if ((func == UNPROVIDED)) {
      func = NIL;
    }
    if ((NIL != assertions_high.gaf_assertionP(assertion))) {
      if ((NIL != matches_nart_arg_index_internal(assertion, v_term, arg, func))) {
        accumulator = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30240");
      }
    }
    return accumulator;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 3822) 
  public static final SubLObject matches_nart_arg_index_internal(SubLObject assertion, SubLObject v_term, SubLObject arg, SubLObject func) {
    if ((assertions_high.gaf_predicate(assertion) != $const2$termOfUnit)) {
      return NIL;
    }
    {
      SubLObject nat = assertions_high.gaf_arg2(assertion);
      if (((NIL != func)
           && (Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29810") != func))) {
        return NIL;
      }
      if ((NIL != arg)) {
        if ((!(cycl_utilities.nat_arg(nat, arg, UNPROVIDED).equal(v_term)))) {
          return NIL;
        }
      } else {
        if ((NIL == Sequences.find(v_term, cycl_utilities.nat_args(nat, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
          return NIL;
        }
      }
      return T;
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 4746) 
  public static final SubLObject matches_predicate_extent_index(SubLObject assertion, SubLObject v_term, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.gaf_assertionP(assertion))) {
      return NIL;
    }
    return matches_predicate_extent_index_internal(assertion, v_term, mt);
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 5299) 
  public static final SubLObject matches_predicate_extent_index_internal(SubLObject assertion, SubLObject v_term, SubLObject mt) {
    if ((assertions_high.gaf_predicate(assertion) != v_term)) {
      return NIL;
    }
    if ((NIL == mt)) {
      return T;
    }
    return hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt);
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 5529) 
  public static final SubLObject matches_function_extent_index(SubLObject assertion, SubLObject v_term) {
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.gaf_assertionP(assertion))) {
      return NIL;
    }
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30226");
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 6106) 
  public static final SubLObject matches_predicate_rule_index(SubLObject assertion, SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_1 = NIL;
        for (sense_1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_1 = cdolist_list_var.first()) {
          if ((NIL != matches_predicate_rule_index(assertion, pred, sense_1, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function($sym4$MATCHES_PREDICATE_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 7418) 
  public static final SubLObject matches_predicate_rule_index_test(SubLObject pred, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if ((NIL == forts.fort_p(predicate))) {
        return NIL;
      }
      return Equality.eq(pred, predicate);
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 7649) 
  public static final SubLObject matches_ist_predicate_rule_index(SubLObject assertion, SubLObject pred, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_3 = NIL;
        for (sense_3 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_3 = cdolist_list_var.first()) {
          if ((NIL != matches_ist_predicate_rule_index(assertion, pred, sense_3, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function($sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 9006) 
  public static final SubLObject matches_ist_predicate_rule_index_test(SubLObject pred, SubLObject literal) {
    return makeBoolean((($const6$ist == el_utilities.literal_predicate(literal, UNPROVIDED))
           && (pred == el_utilities.literal_predicate(el_utilities.literal_arg2(literal, UNPROVIDED), UNPROVIDED))));
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 9204) 
  public static final SubLObject matches_decontextualized_ist_predicate_rule_index(SubLObject assertion, SubLObject pred, SubLObject sense, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_5 = NIL;
        for (sense_5 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_5 = cdolist_list_var.first()) {
          if ((NIL != matches_decontextualized_ist_predicate_rule_index(assertion, pred, sense_5, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((!(((NIL == direction)
          || (assertions_high.assertion_direction(assertion) == direction))))) {
      return NIL;
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(pred, literals, Symbols.symbol_function($sym7$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 10527) 
  public static final SubLObject matches_decontextualized_ist_predicate_rule_index_test(SubLObject pred, SubLObject literal) {
    return makeBoolean((($const6$ist == el_utilities.literal_predicate(literal, UNPROVIDED))
           && (pred == el_utilities.literal_predicate(el_utilities.literal_arg2(literal, UNPROVIDED), UNPROVIDED))));
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 10742) 
  public static final SubLObject matches_isa_rule_index(SubLObject assertion, SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_7 = NIL;
        for (sense_7 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_7 = cdolist_list_var.first()) {
          if ((NIL != matches_isa_rule_index(assertion, col, sense_7, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function($sym8$MATCHES_ISA_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 12006) 
  public static final SubLObject matches_isa_rule_index_test(SubLObject col, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const9$isa == predicate)) {
        {
          SubLObject collection = el_utilities.literal_arg2(literal, UNPROVIDED);
          if ((NIL != forts.fort_p(collection))) {
            return Equality.eq(col, collection);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 12271) 
  public static final SubLObject matches_quoted_isa_rule_index(SubLObject assertion, SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_9 = NIL;
        for (sense_9 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_9 = cdolist_list_var.first()) {
          if ((NIL != matches_quoted_isa_rule_index(assertion, col, sense_9, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function($sym10$MATCHES_QUOTED_ISA_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 13878) 
  public static final SubLObject matches_genls_rule_index(SubLObject assertion, SubLObject col, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_11 = NIL;
        for (sense_11 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_11 = cdolist_list_var.first()) {
          if ((NIL != matches_genls_rule_index(assertion, col, sense_11, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(col, literals, Symbols.symbol_function($sym12$MATCHES_GENLS_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 15158) 
  public static final SubLObject matches_genls_rule_index_test(SubLObject col, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const13$genls == predicate)) {
        {
          SubLObject collection = el_utilities.literal_arg2(literal, UNPROVIDED);
          if ((NIL != forts.fort_p(collection))) {
            return Equality.eq(col, collection);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 15427) 
  public static final SubLObject matches_genl_mt_rule_index(SubLObject assertion, SubLObject genl_mt, SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL == sense)) {
      {
        SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
        SubLObject sense_13 = NIL;
        for (sense_13 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_13 = cdolist_list_var.first()) {
          if ((NIL != matches_genl_mt_rule_index(assertion, genl_mt, sense_13, UNPROVIDED, UNPROVIDED))) {
            return T;
          }
        }
      }
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = ((sense == $kw3$POS) ? ((SubLObject) clauses.pos_lits(cnf)) : clauses.neg_lits(cnf));
      return list_utilities.sublisp_boolean(Sequences.find(genl_mt, literals, Symbols.symbol_function($sym14$MATCHES_GENL_MT_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 16755) 
  public static final SubLObject matches_genl_mt_rule_index_test(SubLObject mt, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const15$genlMt == predicate)) {
        {
          SubLObject genl_mt = el_utilities.literal_arg2(literal, UNPROVIDED);
          if ((NIL != hlmt.hlmt_p(genl_mt))) {
            return hlmt.hlmt_equal(mt, genl_mt);
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 17024) 
  public static final SubLObject matches_function_rule_index(SubLObject assertion, SubLObject func, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = clauses.neg_lits(cnf);
      return list_utilities.sublisp_boolean(Sequences.find(func, literals, Symbols.symbol_function($sym16$MATCHES_FUNCTION_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 18041) 
  public static final SubLObject matches_function_rule_index_test(SubLObject func, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const2$termOfUnit == predicate)) {
        if ((NIL != variables.variable_p(el_utilities.literal_arg1(literal, UNPROVIDED)))) {
          {
            SubLObject nat = el_utilities.literal_arg2(literal, UNPROVIDED);
            if (nat.isCons()) {
              {
                SubLObject function = Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29813");
                if ((NIL != forts.fort_p(function))) {
                  return Equality.eq(func, function);
                }
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 18440) 
  public static final SubLObject matches_exception_rule_index(SubLObject assertion, SubLObject rule, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = clauses.pos_lits(cnf);
      return list_utilities.sublisp_boolean(Sequences.find(rule, literals, Symbols.symbol_function($sym17$MATCHES_EXCEPTION_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 19461) 
  public static final SubLObject matches_exception_rule_index_test(SubLObject rule, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const18$abnormal == predicate)) {
        if ((NIL == assertion_handles.assertion_p(rule))) {
          return NIL;
        }
        return Equality.eq(el_utilities.literal_arg2(literal, UNPROVIDED), rule);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 19734) 
  public static final SubLObject matches_pragma_rule_index(SubLObject assertion, SubLObject rule, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    checkType(assertion, $sym0$ASSERTION_P);
    if ((NIL == assertions_high.rule_assertionP(assertion))) {
      return NIL;
    }
    if ((NIL != mt)) {
      if ((NIL == hlmt.hlmt_equal(assertions_high.assertion_mt(assertion), mt))) {
        return NIL;
      }
      if ((!(((NIL == direction)
            || (assertions_high.assertion_direction(assertion) == direction))))) {
        return NIL;
      }
    }
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject literals = clauses.pos_lits(cnf);
      return list_utilities.sublisp_boolean(Sequences.find(rule, literals, Symbols.symbol_function($sym19$MATCHES_PRAGMA_RULE_INDEX_TEST), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 20747) 
  public static final SubLObject matches_pragma_rule_index_test(SubLObject rule, SubLObject literal) {
    {
      SubLObject predicate = el_utilities.literal_predicate(literal, UNPROVIDED);
      if (($const20$meetsPragmaticRequirement == predicate)) {
        if ((NIL == assertion_handles.assertion_p(rule))) {
          return NIL;
        }
        return Equality.eq(el_utilities.literal_arg2(literal, UNPROVIDED), rule);
      }
    }
    return NIL;
  }

  public static final class $matches_pragma_rule_index_test$BinaryFunction extends BinaryFunction {
    public $matches_pragma_rule_index_test$BinaryFunction() { super(extractFunctionNamed("MATCHES-PRAGMA-RULE-INDEX-TEST")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return matches_pragma_rule_index_test(arg1, arg2); }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 22416) 
  public static final SubLObject matches_other_index(SubLObject assertion, SubLObject v_term) {
    checkType(assertion, $sym0$ASSERTION_P);
    if ((!(((NIL != list_utilities.tree_find(v_term, assertions_high.assertion_cnf(assertion), Symbols.symbol_function(EQUAL), UNPROVIDED))
          || (NIL != cycl_utilities.expression_find(v_term, assertions_high.assertion_mt(assertion), NIL, Symbols.symbol_function(EQUAL), UNPROVIDED)))))) {
      return NIL;
    }
    return makeBoolean(((NIL == matches_gaf_arg_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_nart_arg_index(assertion, v_term, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_predicate_extent_index(assertion, v_term, UNPROVIDED))
           && (NIL == matches_function_extent_index(assertion, v_term))
           && (NIL == matches_predicate_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_ist_predicate_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_decontextualized_ist_predicate_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_isa_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_genls_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_genl_mt_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_function_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_exception_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED))
           && (NIL == matches_pragma_rule_index(assertion, v_term, UNPROVIDED, UNPROVIDED))));
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 23655) 
  public static final SubLObject add_simple_index(SubLObject v_term, SubLObject assertion) {
    checkType(assertion, $sym0$ASSERTION_P);
    {
      SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list(v_term);
      SubLObject new_index = conses_high.adjoin(assertion, old_index, UNPROVIDED, UNPROVIDED);
      if ((old_index != new_index)) {
        kb_indexing_datastructures.reset_term_simple_index(v_term, new_index);
        possibly_toggle_term_index_mode(v_term);
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 24230) 
  public static final SubLObject rem_simple_index(SubLObject v_term, SubLObject assertion) {
    checkType(assertion, $sym0$ASSERTION_P);
    {
      SubLObject old_index = kb_indexing_datastructures.simple_term_assertion_list(v_term);
      SubLObject new_index = list_utilities.delete_first(assertion, old_index, UNPROVIDED);
      if ((old_index != new_index)) {
        kb_indexing_datastructures.reset_term_simple_index(v_term, new_index);
      }
      return assertion;
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 25886) 
  public static SubLSymbol $within_noting_terms_to_toggle_indexing_mode$ = null;

  @SubL(source = "cycl/simple-indexing.lisp", position = 26108) 
  public static SubLSymbol $terms_to_toggle_indexing_mode$ = null;

  @SubL(source = "cycl/simple-indexing.lisp", position = 26441) 
  public static final SubLObject noting_terms_to_toggle_indexing_mode_internal() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject cdolist_list_var = $terms_to_toggle_indexing_mode$.getDynamicValue(thread);
        SubLObject v_term = NIL;
        for (v_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), v_term = cdolist_list_var.first()) {
          toggle_term_index_mode(v_term);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 26658) 
  private static SubLSymbol $index_convert_threshold$ = null;

  @SubL(source = "cycl/simple-indexing.lisp", position = 26711) 
  private static SubLSymbol $index_convert_range$ = null;

  /** When a simple index grows to contain this many assertions or more,
convert it to the more complex form. */
  @SubL(source = "cycl/simple-indexing.lisp", position = 26762) 
  private static SubLSymbol $index_convert_complex_threshold$ = null;

  /** When a complex index shrinks to contain this many assertions or fewer,
convert it to the simpler form. */
  @SubL(source = "cycl/simple-indexing.lisp", position = 27001) 
  private static SubLSymbol $index_convert_simple_threshold$ = null;

  @SubL(source = "cycl/simple-indexing.lisp", position = 27238) 
  public static final SubLObject possibly_toggle_term_index_mode(SubLObject v_term) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $within_noting_terms_to_toggle_indexing_mode$.getDynamicValue(thread))) {
        {
          SubLObject total = kb_indexing.num_index(v_term);
          if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
            if (total.numGE($index_convert_complex_threshold$.getDynamicValue(thread))) {
              {
                SubLObject item_var = v_term;
                if ((NIL == conses_high.member(item_var, $terms_to_toggle_indexing_mode$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                  $terms_to_toggle_indexing_mode$.setDynamicValue(cons(item_var, $terms_to_toggle_indexing_mode$.getDynamicValue(thread)), thread);
                }
              }
              return T;
            }
          } else {
            if (total.numLE($index_convert_simple_threshold$.getDynamicValue(thread))) {
              {
                SubLObject item_var = v_term;
                if ((NIL == conses_high.member(item_var, $terms_to_toggle_indexing_mode$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
                  $terms_to_toggle_indexing_mode$.setDynamicValue(cons(item_var, $terms_to_toggle_indexing_mode$.getDynamicValue(thread)), thread);
                }
              }
              return T;
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 27801) 
  public static final SubLObject toggle_term_index_mode(SubLObject v_term) {
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(v_term))) {
      convert_to_complex_index(v_term);
    } else {
      convert_to_simple_index(v_term);
    }
    return v_term;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 27990) 
  public static final SubLObject convert_to_complex_index(SubLObject v_term) {
    {
      SubLObject assertions = Sequences.reverse(kb_indexing_datastructures.simple_term_assertion_list(v_term));
      kb_indexing_datastructures.initialize_term_complex_index(v_term);
      {
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        for (assertion = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), assertion = cdolist_list_var.first()) {
          kb_indexing.add_assertion_indices(assertion, v_term);
        }
      }
    }
    return v_term;
  }

  @SubL(source = "cycl/simple-indexing.lisp", position = 28496) 
  public static final SubLObject convert_to_simple_index(SubLObject v_term) {
    {
      SubLObject assertions = kb_mapping.gather_index_in_any_mt(v_term, T);
      assertions = list_utilities.delete_if_not(Symbols.symbol_function($sym27$VALID_ASSERTION), assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      kb_indexing_datastructures.free_term_index(v_term);
      kb_indexing_datastructures.reset_term_simple_index(v_term, assertions);
    }
    return v_term;
  }

  public static final SubLObject declare_simple_indexing_file() {
    declareFunction("gaf_arg_index_simple_match_p", "GAF-ARG-INDEX-SIMPLE-MATCH-P", 2, 3, false);
    declareFunction("matches_gaf_arg_index", "MATCHES-GAF-ARG-INDEX", 2, 3, false);
    declareFunction("simple_key_gaf_arg_index", "SIMPLE-KEY-GAF-ARG-INDEX", 3, 2, false);
    declareFunction("matches_gaf_arg_index_internal", "MATCHES-GAF-ARG-INDEX-INTERNAL", 5, 0, false);
    declareFunction("simple_key_gaf_arg_index_internal", "SIMPLE-KEY-GAF-ARG-INDEX-INTERNAL", 5, 0, false);
    declareFunction("matches_nart_arg_index", "MATCHES-NART-ARG-INDEX", 2, 2, false);
    declareFunction("simple_key_nart_arg_index", "SIMPLE-KEY-NART-ARG-INDEX", 3, 2, false);
    declareFunction("matches_nart_arg_index_internal", "MATCHES-NART-ARG-INDEX-INTERNAL", 4, 0, false);
    declareFunction("simple_key_nart_arg_index_internal", "SIMPLE-KEY-NART-ARG-INDEX-INTERNAL", 5, 0, false);
    declareFunction("matches_predicate_extent_index", "MATCHES-PREDICATE-EXTENT-INDEX", 2, 1, false);
    declareFunction("simple_key_predicate_extent_index", "SIMPLE-KEY-PREDICATE-EXTENT-INDEX", 3, 0, false);
    declareFunction("matches_predicate_extent_index_internal", "MATCHES-PREDICATE-EXTENT-INDEX-INTERNAL", 3, 0, false);
    declareFunction("matches_function_extent_index", "MATCHES-FUNCTION-EXTENT-INDEX", 2, 0, false);
    declareFunction("matches_function_extent_index_internal", "MATCHES-FUNCTION-EXTENT-INDEX-INTERNAL", 2, 0, false);
    declareFunction("matches_predicate_rule_index", "MATCHES-PREDICATE-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_predicate_rule_index", "SIMPLE-KEY-PREDICATE-RULE-INDEX", 3, 2, false);
    declareFunction("matches_predicate_rule_index_test", "MATCHES-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_ist_predicate_rule_index", "MATCHES-IST-PREDICATE-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_ist_predicate_rule_index", "SIMPLE-KEY-IST-PREDICATE-RULE-INDEX", 3, 2, false);
    declareFunction("matches_ist_predicate_rule_index_test", "MATCHES-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_decontextualized_ist_predicate_rule_index", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 2, 2, false);
    declareFunction("simple_key_decontextualized_ist_predicate_rule_index", "SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX", 3, 1, false);
    declareFunction("matches_decontextualized_ist_predicate_rule_index_test", "MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_isa_rule_index", "MATCHES-ISA-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_isa_rule_index", "SIMPLE-KEY-ISA-RULE-INDEX", 3, 2, false);
    declareFunction("matches_isa_rule_index_test", "MATCHES-ISA-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_quoted_isa_rule_index", "MATCHES-QUOTED-ISA-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_quoted_isa_rule_index", "SIMPLE-KEY-QUOTED-ISA-RULE-INDEX", 3, 2, false);
    declareFunction("matches_quoted_isa_rule_index_test", "MATCHES-QUOTED-ISA-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_genls_rule_index", "MATCHES-GENLS-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_genls_rule_index", "SIMPLE-KEY-GENLS-RULE-INDEX", 3, 2, false);
    declareFunction("matches_genls_rule_index_test", "MATCHES-GENLS-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_genl_mt_rule_index", "MATCHES-GENL-MT-RULE-INDEX", 2, 3, false);
    declareFunction("simple_key_genl_mt_rule_index", "SIMPLE-KEY-GENL-MT-RULE-INDEX", 3, 2, false);
    declareFunction("matches_genl_mt_rule_index_test", "MATCHES-GENL-MT-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_function_rule_index", "MATCHES-FUNCTION-RULE-INDEX", 2, 2, false);
    declareFunction("simple_key_function_rule_index", "SIMPLE-KEY-FUNCTION-RULE-INDEX", 3, 1, false);
    declareFunction("matches_function_rule_index_test", "MATCHES-FUNCTION-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_exception_rule_index", "MATCHES-EXCEPTION-RULE-INDEX", 2, 2, false);
    declareFunction("simple_key_exception_rule_index", "SIMPLE-KEY-EXCEPTION-RULE-INDEX", 3, 1, false);
    declareFunction("matches_exception_rule_index_test", "MATCHES-EXCEPTION-RULE-INDEX-TEST", 2, 0, false);
    declareFunction("matches_pragma_rule_index", "MATCHES-PRAGMA-RULE-INDEX", 2, 2, false);
    declareFunction("simple_key_pragma_rule_index", "SIMPLE-KEY-PRAGMA-RULE-INDEX", 3, 1, false);
    declareFunction("matches_pragma_rule_index_test", "MATCHES-PRAGMA-RULE-INDEX-TEST", 2, 0, false); new $matches_pragma_rule_index_test$BinaryFunction();
    declareFunction("matches_unbound_rule_index", "MATCHES-UNBOUND-RULE-INDEX", 1, 3, false);
    declareFunction("simple_key_unbound_rule_index", "SIMPLE-KEY-UNBOUND-RULE-INDEX", 2, 2, false);
    declareFunction("matches_mt_index", "MATCHES-MT-INDEX", 2, 0, false);
    declareFunction("matches_other_index", "MATCHES-OTHER-INDEX", 2, 0, false);
    declareFunction("add_simple_index", "ADD-SIMPLE-INDEX", 2, 0, false);
    declareFunction("rem_simple_index", "REM-SIMPLE-INDEX", 2, 0, false);
    declareFunction("assertion_property_match_p", "ASSERTION-PROPERTY-MATCH-P", 1, 3, false);
    declareMacro("noting_terms_to_toggle_indexing_mode", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE");
    declareFunction("noting_terms_to_toggle_indexing_mode_internal", "NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL", 0, 0, false);
    declareFunction("possibly_toggle_term_index_mode", "POSSIBLY-TOGGLE-TERM-INDEX-MODE", 1, 0, false);
    declareFunction("toggle_term_index_mode", "TOGGLE-TERM-INDEX-MODE", 1, 0, false);
    declareFunction("convert_to_complex_index", "CONVERT-TO-COMPLEX-INDEX", 1, 0, false);
    declareFunction("convert_to_simple_index", "CONVERT-TO-SIMPLE-INDEX", 1, 0, false);
    declareFunction("reconstruct_complex_index", "RECONSTRUCT-COMPLEX-INDEX", 1, 0, false);
    declareFunction("clean_kb_indexing", "CLEAN-KB-INDEXING", 0, 0, false);
    declareFunction("clean_term_index", "CLEAN-TERM-INDEX", 1, 0, false);
    declareFunction("clean_term_index_internal", "CLEAN-TERM-INDEX-INTERNAL", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_simple_indexing_file() {
    $within_noting_terms_to_toggle_indexing_mode$ = defparameter("*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*", NIL);
    $terms_to_toggle_indexing_mode$ = defparameter("*TERMS-TO-TOGGLE-INDEXING-MODE*", NIL);
    $index_convert_threshold$ = defparameter("*INDEX-CONVERT-THRESHOLD*", TWENTY_INTEGER);
    $index_convert_range$ = defparameter("*INDEX-CONVERT-RANGE*", FOUR_INTEGER);
    $index_convert_complex_threshold$ = defparameter("*INDEX-CONVERT-COMPLEX-THRESHOLD*", Numbers.add($index_convert_threshold$.getDynamicValue(), Numbers.integerDivide($index_convert_range$.getDynamicValue(), TWO_INTEGER)));
    $index_convert_simple_threshold$ = defparameter("*INDEX-CONVERT-SIMPLE-THRESHOLD*", Numbers.subtract($index_convert_threshold$.getDynamicValue(), Numbers.integerDivide($index_convert_range$.getDynamicValue(), TWO_INTEGER)));
    return NIL;
  }

  public static final SubLObject setup_simple_indexing_file() {
        access_macros.register_macro_helper($sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL, $sym25$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE);
    access_macros.register_macro_helper($sym26$POSSIBLY_TOGGLE_TERM_INDEX_MODE, $sym25$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ASSERTION_P = makeSymbol("ASSERTION-P");
  public static final SubLSymbol $sym1$HLMT_EQUAL = makeSymbol("HLMT-EQUAL");
  public static final SubLObject $const2$termOfUnit = constant_handles.reader_make_constant_shell(makeString("termOfUnit"));
  public static final SubLSymbol $kw3$POS = makeKeyword("POS");
  public static final SubLSymbol $sym4$MATCHES_PREDICATE_RULE_INDEX_TEST = makeSymbol("MATCHES-PREDICATE-RULE-INDEX-TEST");
  public static final SubLSymbol $sym5$MATCHES_IST_PREDICATE_RULE_INDEX_TEST = makeSymbol("MATCHES-IST-PREDICATE-RULE-INDEX-TEST");
  public static final SubLObject $const6$ist = constant_handles.reader_make_constant_shell(makeString("ist"));
  public static final SubLSymbol $sym7$MATCHES_DECONTEXTUALIZED_IST_PREDICATE_RULE_INDEX_TEST = makeSymbol("MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-TEST");
  public static final SubLSymbol $sym8$MATCHES_ISA_RULE_INDEX_TEST = makeSymbol("MATCHES-ISA-RULE-INDEX-TEST");
  public static final SubLObject $const9$isa = constant_handles.reader_make_constant_shell(makeString("isa"));
  public static final SubLSymbol $sym10$MATCHES_QUOTED_ISA_RULE_INDEX_TEST = makeSymbol("MATCHES-QUOTED-ISA-RULE-INDEX-TEST");
  public static final SubLObject $const11$quotedIsa = constant_handles.reader_make_constant_shell(makeString("quotedIsa"));
  public static final SubLSymbol $sym12$MATCHES_GENLS_RULE_INDEX_TEST = makeSymbol("MATCHES-GENLS-RULE-INDEX-TEST");
  public static final SubLObject $const13$genls = constant_handles.reader_make_constant_shell(makeString("genls"));
  public static final SubLSymbol $sym14$MATCHES_GENL_MT_RULE_INDEX_TEST = makeSymbol("MATCHES-GENL-MT-RULE-INDEX-TEST");
  public static final SubLObject $const15$genlMt = constant_handles.reader_make_constant_shell(makeString("genlMt"));
  public static final SubLSymbol $sym16$MATCHES_FUNCTION_RULE_INDEX_TEST = makeSymbol("MATCHES-FUNCTION-RULE-INDEX-TEST");
  public static final SubLSymbol $sym17$MATCHES_EXCEPTION_RULE_INDEX_TEST = makeSymbol("MATCHES-EXCEPTION-RULE-INDEX-TEST");
  public static final SubLObject $const18$abnormal = constant_handles.reader_make_constant_shell(makeString("abnormal"));
  public static final SubLSymbol $sym19$MATCHES_PRAGMA_RULE_INDEX_TEST = makeSymbol("MATCHES-PRAGMA-RULE-INDEX-TEST");
  public static final SubLObject $const20$meetsPragmaticRequirement = constant_handles.reader_make_constant_shell(makeString("meetsPragmaticRequirement"));
  public static final SubLSymbol $sym21$CLET = makeSymbol("CLET");
  public static final SubLList $list22 = list(list(makeSymbol("*WITHIN-NOTING-TERMS-TO-TOGGLE-INDEXING-MODE*"), T), list(makeSymbol("*TERMS-TO-TOGGLE-INDEXING-MODE*"), NIL));
  public static final SubLList $list23 = list(list(makeSymbol("PWHEN"), makeSymbol("*TERMS-TO-TOGGLE-INDEXING-MODE*"), list(makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL"))));
  public static final SubLSymbol $sym24$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE_INTERNAL = makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE-INTERNAL");
  public static final SubLSymbol $sym25$NOTING_TERMS_TO_TOGGLE_INDEXING_MODE = makeSymbol("NOTING-TERMS-TO-TOGGLE-INDEXING-MODE");
  public static final SubLSymbol $sym26$POSSIBLY_TOGGLE_TERM_INDEX_MODE = makeSymbol("POSSIBLY-TOGGLE-TERM-INDEX-MODE");
  public static final SubLSymbol $sym27$VALID_ASSERTION = makeSymbol("VALID-ASSERTION");
  public static final SubLString $str28$mapping_Cyc_FORTs = makeString("mapping Cyc FORTs");
  public static final SubLSymbol $kw29$SKIP = makeKeyword("SKIP");
  public static final SubLString $str30$mapping_Cyc_assertions = makeString("mapping Cyc assertions");
  public static final SubLSymbol $sym31$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str32$invalid_index_under__S = makeString("invalid index under ~S");
  public static final SubLSymbol $kw33$INVALID = makeKeyword("INVALID");
  public static final SubLSymbol $sym34$CLEAN_TERM_INDEX_INTERNAL = makeSymbol("CLEAN-TERM-INDEX-INTERNAL");

  //// Initializers

  public void declareFunctions() {
    declare_simple_indexing_file();
  }

  public void initializeVariables() {
    init_simple_indexing_file();
  }

  public void runTopLevelForms() {
    setup_simple_indexing_file();
  }

}
