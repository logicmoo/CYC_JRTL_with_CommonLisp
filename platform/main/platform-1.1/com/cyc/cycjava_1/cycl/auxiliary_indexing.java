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
//dm import com.cyc.cycjava_1.cycl.assertion_handles;
//dm import com.cyc.cycjava_1.cycl.assertions_high;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.clauses;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.el_utilities;
//dm import com.cyc.cycjava_1.cycl.enumeration_types;
//dm import com.cyc.cycjava_1.cycl.hlmt;
//dm import com.cyc.cycjava_1.cycl.id_index;
//dm import com.cyc.cycjava_1.cycl.kb_indexing;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
//dm import com.cyc.cycjava_1.cycl.kb_indexing_declarations;
//dm import com.cyc.cycjava_1.cycl.kb_macros;
//dm import com.cyc.cycjava_1.cycl.kb_mapping;
//dm import com.cyc.cycjava_1.cycl.kb_mapping_macros;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.mt_relevance_macros;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_contents;
//dm import com.cyc.cycjava_1.cycl.simple_indexing;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.variables;

public  final class auxiliary_indexing extends SubLTranslatedFile {

  //// Constructor

  private auxiliary_indexing() {}
  public static final SubLFile me = new auxiliary_indexing();
  public static final String myName = "com.cyc.cycjava_1.cycl.auxiliary_indexing";

  //// Definitions

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 998) 
  private static SubLSymbol $auxiliary_indices$ = null;

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 1181) 
  public static final SubLObject declare_auxiliary_index(SubLObject aux_index, SubLObject name) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(aux_index, $sym0$SYMBOLP);
      checkType(name, $sym1$STRINGP);
      {
        SubLObject item_var = aux_index;
        if ((NIL == conses_high.member(item_var, $auxiliary_indices$.getDynamicValue(thread), Symbols.symbol_function(EQL), Symbols.symbol_function(IDENTITY)))) {
          $auxiliary_indices$.setDynamicValue(cons(item_var, $auxiliary_indices$.getDynamicValue(thread)), thread);
        }
      }
      Symbols.put(aux_index, $kw2$INDEX_NAME, name);
      return aux_index;
    }
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 1397) 
  public static final SubLObject auxiliary_index_p(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return subl_promotions.memberP(object, $auxiliary_indices$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 1479) 
  public static final SubLObject get_auxiliary_index(SubLObject aux_index) {
    return Symbols.get(aux_index, $kw3$INDEX, NIL);
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 1556) 
  public static final SubLObject reset_auxiliary_index(SubLObject aux_index, SubLObject new_index) {
    if ((NIL != new_index)) {
      Symbols.put(aux_index, $kw3$INDEX, new_index);
    } else {
      Symbols.remprop(aux_index, $kw3$INDEX);
    }
    return aux_index;
  }

  /** Return the unbound rule count at SENSE MT DIRECTION */
  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 3313) 
  public static final SubLObject num_unbound_rule_index(SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index()))) {
      {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
        SubLObject ass = NIL;
        for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
          if ((NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30227"))) {
            count = Numbers.add(count, ONE_INTEGER);
          }
        }
        return count;
      }
    } else {
      if ((NIL == sense)) {
        {
          SubLObject count = ZERO_INTEGER;
          SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
          SubLObject sense_1 = NIL;
          for (sense_1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_1 = cdolist_list_var.first()) {
            count = Numbers.add(count, num_unbound_rule_index(sense_1, UNPROVIDED, UNPROVIDED));
          }
          return count;
        }
      } else {
        {
          SubLObject unbound_rule_subindex = get_unbound_rule_subindex(sense, mt, direction);
          return ((NIL != unbound_rule_subindex) ? ((SubLObject) kb_indexing_datastructures.subindex_leaf_count(unbound_rule_subindex)) : ZERO_INTEGER);
        }
      }
    }
  }

  /** Return the unbound rule count at relevant mts under SENSE. */
  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 4046) 
  public static final SubLObject relevant_num_unbound_rule_index(SubLObject sense) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    {
      SubLObject count = ZERO_INTEGER;
      if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index()))) {
        {
          SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
          SubLObject ass = NIL;
          for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30228"))) {
              if ((NIL != mt_relevance_macros.relevant_mtP(assertions_high.assertion_mt(ass)))) {
                count = Numbers.add(count, ONE_INTEGER);
              }
            }
          }
        }
      } else {
        if ((NIL == sense)) {
          {
            SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
            SubLObject sense_2 = NIL;
            for (sense_2 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_2 = cdolist_list_var.first()) {
              count = Numbers.add(count, relevant_num_unbound_rule_index(sense_2));
            }
          }
        } else {
          {
            SubLObject mts = key_unbound_rule_index(sense, UNPROVIDED);
            SubLObject cdolist_list_var = mts;
            SubLObject mt = NIL;
            for (mt = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mt = cdolist_list_var.first()) {
              if ((NIL != mt_relevance_macros.relevant_mtP(mt))) {
                count = Numbers.add(count, num_unbound_rule_index(sense, mt, UNPROVIDED));
              }
            }
          }
        }
      }
      return count;
    }
  }

  /** Return a list of the keys to the next unbound rule index level below SENSE MT. */
  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 4828) 
  public static final SubLObject key_unbound_rule_index(SubLObject sense, SubLObject mt) {
    if ((sense == UNPROVIDED)) {
      sense = NIL;
    }
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((NIL != kb_indexing_datastructures.simple_indexed_term_p(unbound_rule_index()))) {
      {
        SubLObject answer = NIL;
        SubLObject cdolist_list_var = kb_indexing_datastructures.do_simple_index_term_assertion_list(unbound_rule_index());
        SubLObject ass = NIL;
        for (ass = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), ass = cdolist_list_var.first()) {
          answer = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30243");
        }
        return answer;
      }
    } else {
      if ((NIL == sense)) {
        {
          SubLObject keys = NIL;
          SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
          SubLObject sense_3 = NIL;
          for (sense_3 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense_3 = cdolist_list_var.first()) {
            if (num_unbound_rule_index(sense_3, UNPROVIDED, UNPROVIDED).isPositive()) {
              keys = cons(sense_3, keys);
            }
          }
          return keys;
        }
      } else {
        {
          SubLObject subindex = get_unbound_rule_subindex(sense, mt, UNPROVIDED);
          return ((NIL != kb_indexing_datastructures.intermediate_index_p(subindex)) ? ((SubLObject) kb_indexing_datastructures.intermediate_index_keys(subindex)) : NIL);
        }
      }
    }
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 6673) 
  public static final SubLObject get_unbound_rule_subindex(SubLObject sense, SubLObject mt, SubLObject direction) {
    if ((mt == UNPROVIDED)) {
      mt = NIL;
    }
    if ((direction == UNPROVIDED)) {
      direction = NIL;
    }
    return kb_indexing.get_subindex(unbound_rule_index(), list(sense, mt, direction));
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 8245) 
  public static final SubLObject unbound_rule_index() {
    return $kw4$UNBOUND_RULE_INDEX;
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 8319) 
  public static final SubLObject add_unbound_rule_indices(SubLObject assertion) {
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject mt = assertions_high.assertion_mt(assertion);
      SubLObject direction = assertions_high.assertion_direction(assertion);
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense = NIL;
      for (sense = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense = cdolist_list_var.first()) {
        if ((NIL != some_unbound_predicate_literal(cnf, sense))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30772");
        }
      }
    }
    return assertion;
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 8654) 
  public static final SubLObject rem_unbound_rule_indices(SubLObject assertion) {
    {
      SubLObject cnf = assertions_high.assertion_cnf(assertion);
      SubLObject mt = assertions_high.assertion_mt(assertion);
      SubLObject direction = assertions_high.assertion_direction(assertion);
      SubLObject cdolist_list_var = enumeration_types.$valid_senses$.getGlobalValue();
      SubLObject sense = NIL;
      for (sense = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), sense = cdolist_list_var.first()) {
        if ((NIL != some_unbound_predicate_literal(cnf, sense))) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30776");
        }
      }
    }
    return assertion;
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 9439) 
  public static final SubLObject unbound_predicate_literal(SubLObject literal) {
    return makeBoolean((literal.isCons()
           && (NIL != variables.variable_p(el_utilities.literal_predicate(literal, UNPROVIDED)))));
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 9573) 
  public static final SubLObject some_unbound_predicate_literal(SubLObject clause, SubLObject sense) {
    {
      SubLObject literals = ((sense == $kw15$POS) ? ((SubLObject) clauses.pos_lits(clause)) : clauses.neg_lits(clause));
      return list_utilities.sublisp_boolean(Sequences.find_if(Symbols.symbol_function($sym16$UNBOUND_PREDICATE_LITERAL), literals, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 10617) 
  public static final SubLObject load_auxiliary_indices(SubLObject stream) {
    load_unbound_rule_index(stream);
    cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
    return NIL;
  }

  @SubL(source = "cycl/auxiliary-indexing.lisp", position = 10953) 
  public static final SubLObject load_unbound_rule_index(SubLObject stream) {
    reset_auxiliary_index(unbound_rule_index(), cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED));
    return NIL;
  }

  public static final SubLObject declare_auxiliary_indexing_file() {
    declareFunction(myName, "auxiliary_indices", "AUXILIARY-INDICES", 0, 0, false);
    declareFunction(myName, "declare_auxiliary_index", "DECLARE-AUXILIARY-INDEX", 2, 0, false);
    declareFunction(myName, "auxiliary_index_p", "AUXILIARY-INDEX-P", 1, 0, false);
    declareFunction(myName, "get_auxiliary_index", "GET-AUXILIARY-INDEX", 1, 0, false);
    declareFunction(myName, "reset_auxiliary_index", "RESET-AUXILIARY-INDEX", 2, 0, false);
    declareFunction(myName, "clear_auxiliary_index", "CLEAR-AUXILIARY-INDEX", 1, 0, false);
    declareFunction(myName, "auxiliary_index_name", "AUXILIARY-INDEX-NAME", 1, 0, false);
    declareFunction(myName, "num_unbound_rule_index", "NUM-UNBOUND-RULE-INDEX", 0, 3, false);
    declareFunction(myName, "relevant_num_unbound_rule_index", "RELEVANT-NUM-UNBOUND-RULE-INDEX", 0, 1, false);
    declareFunction(myName, "key_unbound_rule_index", "KEY-UNBOUND-RULE-INDEX", 0, 2, false);
    declareFunction(myName, "relevant_key_unbound_rule_index", "RELEVANT-KEY-UNBOUND-RULE-INDEX", 0, 1, false);
    declareFunction(myName, "add_unbound_rule_index", "ADD-UNBOUND-RULE-INDEX", 4, 0, false);
    declareFunction(myName, "rem_unbound_rule_index", "REM-UNBOUND-RULE-INDEX", 4, 0, false);
    declareFunction(myName, "get_unbound_rule_subindex", "GET-UNBOUND-RULE-SUBINDEX", 1, 2, false);
    declareFunction(myName, "map_unbound_rule_index", "MAP-UNBOUND-RULE-INDEX", 2, 1, false);
    declareFunction(myName, "map_unbound_rule_mt_index", "MAP-UNBOUND-RULE-MT-INDEX", 3, 1, false);
    declareFunction(myName, "unbound_rule_index", "UNBOUND-RULE-INDEX", 0, 0, false);
    declareFunction(myName, "add_unbound_rule_indices", "ADD-UNBOUND-RULE-INDICES", 1, 0, false);
    declareFunction(myName, "rem_unbound_rule_indices", "REM-UNBOUND-RULE-INDICES", 1, 0, false);
    declareFunction(myName, "unbound_predicate_rule_p", "UNBOUND-PREDICATE-RULE-P", 1, 0, false);
    declareFunction(myName, "clear_unbound_rule_index", "CLEAR-UNBOUND-RULE-INDEX", 0, 0, false);
    declareFunction(myName, "unbound_rule_assertion_p", "UNBOUND-RULE-ASSERTION-P", 1, 0, false);
    declareFunction(myName, "unbound_predicate_literal", "UNBOUND-PREDICATE-LITERAL", 1, 0, false);
    declareFunction(myName, "some_unbound_predicate_literal", "SOME-UNBOUND-PREDICATE-LITERAL", 2, 0, false);
    declareFunction(myName, "reconstruct_auxiliary_indices", "RECONSTRUCT-AUXILIARY-INDICES", 0, 0, false);
    declareFunction(myName, "reconstruct_unbound_rule_indices", "RECONSTRUCT-UNBOUND-RULE-INDICES", 0, 0, false);
    declareFunction(myName, "dump_auxiliary_indices", "DUMP-AUXILIARY-INDICES", 1, 0, false);
    declareFunction(myName, "load_auxiliary_indices", "LOAD-AUXILIARY-INDICES", 1, 0, false);
    declareFunction(myName, "dump_unbound_rule_index", "DUMP-UNBOUND-RULE-INDEX", 1, 0, false);
    declareFunction(myName, "load_unbound_rule_index", "LOAD-UNBOUND-RULE-INDEX", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_auxiliary_indexing_file() {
    $auxiliary_indices$ = defparameter("*AUXILIARY-INDICES*", NIL);
    return NIL;
  }

  public static final SubLObject setup_auxiliary_indexing_file() {
    // CVS_ID("Id: auxiliary-indexing.lisp 126640 2008-12-04 13:39:36Z builder ");
    declare_auxiliary_index($kw4$UNBOUND_RULE_INDEX, $str5$Unbound_Rule_Index);
    kb_indexing_declarations.declare_index($kw6$UNBOUND_RULE_INDEX_POS, $list7);
    kb_indexing_declarations.declare_index($kw8$UNBOUND_RULE_INDEX_NEG, $list9);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLSymbol $sym1$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $kw2$INDEX_NAME = makeKeyword("INDEX-NAME");
  public static final SubLSymbol $kw3$INDEX = makeKeyword("INDEX");
  public static final SubLSymbol $kw4$UNBOUND_RULE_INDEX = makeKeyword("UNBOUND-RULE-INDEX");
  public static final SubLString $str5$Unbound_Rule_Index = makeString("Unbound Rule Index");
  public static final SubLSymbol $kw6$UNBOUND_RULE_INDEX_POS = makeKeyword("UNBOUND-RULE-INDEX-POS");
  public static final SubLList $list7 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Unbound positive rule index"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("POS"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a pos-lit with a variable in the predicate position."))});
  public static final SubLSymbol $kw8$UNBOUND_RULE_INDEX_NEG = makeKeyword("UNBOUND-RULE-INDEX-NEG");
  public static final SubLList $list9 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Unbound negative rule index"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("AUXILIARY-INDEX-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NEG"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION,\nwhich contains a neg-lit with a variable in the predicate position."))});
  public static final SubLSymbol $sym10$RELEVANT_MT_ = makeSymbol("RELEVANT-MT?");
  public static final SubLSymbol $sym11$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym12$SENSE_P = makeSymbol("SENSE-P");
  public static final SubLSymbol $kw13$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLSymbol $sym14$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $kw15$POS = makeKeyword("POS");
  public static final SubLSymbol $sym16$UNBOUND_PREDICATE_LITERAL = makeSymbol("UNBOUND-PREDICATE-LITERAL");
  public static final SubLString $str17$Rebuilding_unbound_rule_index_str = makeString("Rebuilding unbound rule index structure");
  public static final SubLSymbol $kw18$SKIP = makeKeyword("SKIP");

  //// Initializers

  public void declareFunctions() {
    declare_auxiliary_indexing_file();
  }

  public void initializeVariables() {
    init_auxiliary_indexing_file();
  }

  public void runTopLevelForms() {
    setup_auxiliary_indexing_file();
  }

}
