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

package  com.cyc.cycjava_1.cycl;

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
import com.cyc.cycjava_1.cycl.arguments;
import com.cyc.cycjava_1.cycl.clause_utilities;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.el_utilities;
import com.cyc.cycjava_1.cycl.enumeration_types;
import com.cyc.cycjava_1.cycl.format_nil;
import com.cyc.cycjava_1.cycl.formula_pattern_match;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.hl_modifiers;
import com.cyc.cycjava_1.cycl.hl_storage_modules;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.kb_indexing;
import com.cyc.cycjava_1.cycl.kb_indexing_datastructures;
import com.cyc.cycjava_1.cycl.kb_mapping_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class bookkeeping_store extends SubLTranslatedFile {

  //// Constructor

  private bookkeeping_store() {}
  public static final SubLFile me = new bookkeeping_store();
  public static final String myName = "com.cyc.cycjava_1.cycl.bookkeeping_store";

  //// Definitions

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 1052) 
  public static final SubLObject bookkeeping_predicate_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != clause_utilities.pos_atomic_cnf_p(cnf))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        if ((NIL != el_utilities.el_binary_formula_p(asent))) {
          if ((NIL == el_utilities.sequence_term(asent))) {
            if ((NIL != hlmt.hlmt_equal(mt, $const0$BookkeepingMt))) {
              return T;
            }
          }
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 2128) 
  public static final SubLObject bookkeeping_predicate_hl_storage_module_assert(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    {
      SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
      SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
      SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
      SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
      return hl_modifiers.hl_assert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 3738) 
  public static final SubLObject my_creator_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        return formula_pattern_match.pattern_matches_formula($list9, asent);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 5042) 
  public static final SubLObject my_creation_time_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        return formula_pattern_match.pattern_matches_formula($list13, asent);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 6323) 
  public static final SubLObject my_creation_purpose_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        return formula_pattern_match.pattern_matches_formula($list17, asent);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 7603) 
  public static final SubLObject my_creation_second_hl_storage_module_applicableP(SubLObject argument_spec, SubLObject cnf, SubLObject mt, SubLObject direction, SubLObject variable_map) {
    if ((NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map))) {
      {
        SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        return formula_pattern_match.pattern_matches_formula($list21, asent);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 11140) 
  private static SubLSymbol $bookkeeping_predicates_for_hl_store$ = null;

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 11790) 
  private static SubLSymbol $arg2_indexed_bookkeeping_predicates_for_hl_store$ = null;

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 12163) 
  public static final SubLObject arg2_indexed_bookkeeping_predicates_for_hl_store() {
    return conses_high.copy_list($arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue());
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 12306) 
  public static final SubLObject arg2_indexed_bookkeeping_predP(SubLObject pred) {
    return subl_promotions.memberP(pred, arg2_indexed_bookkeeping_predicates_for_hl_store(), UNPROVIDED, UNPROVIDED);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 12436) 
  public static final SubLObject new_bookkeeping_top_level_index(SubLObject top_level_keys) {
    {
      SubLObject top_index = NIL;
      SubLObject cdolist_list_var = top_level_keys;
      SubLObject key = NIL;
      for (key = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), key = cdolist_list_var.first()) {
        {
          SubLObject value = new_bookkeeping_intermediate_index();
          top_index = cons(cons(key, value), top_index);
        }
      }
      return Sequences.nreverse(top_index);
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 12691) 
  public static final SubLObject bookkeeping_top_level_index_lookup(SubLObject index, SubLObject key) {
    return conses_high.assoc(key, index, UNPROVIDED, UNPROVIDED).rest();
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 12788) 
  public static final SubLObject bookkeeping_top_level_index_insert(SubLObject index, SubLObject top_key, SubLObject mid_key, SubLObject leaf, SubLObject single_entryP) {
    {
      SubLObject intermediate_index = bookkeeping_top_level_index_lookup(index, top_key);
      return bookkeeping_intermediate_index_insert(intermediate_index, mid_key, leaf, single_entryP);
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 13338) 
  public static final SubLObject bookkeeping_top_level_index_count(SubLObject index) {
    {
      SubLObject count = ZERO_INTEGER;
      SubLObject cdolist_list_var = index;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject pred = NIL;
          SubLObject subindex = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
          pred = current.first();
          current = current.rest();
          subindex = current;
          count = Numbers.add(count, bookkeeping_intermediate_index_count(subindex));
        }
      }
      return count;
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 13762) 
  public static final SubLObject new_bookkeeping_intermediate_index() {
    return dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 13848) 
  public static final SubLObject bookkeeping_intermediate_index_lookup(SubLObject index, SubLObject key) {
    return dictionary.dictionary_lookup(index, key, UNPROVIDED);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 14054) 
  public static final SubLObject bookkeeping_intermediate_index_set(SubLObject index, SubLObject key, SubLObject value) {
    return dictionary.dictionary_enter(index, key, value);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 14168) 
  public static final SubLObject bookkeeping_intermediate_index_push(SubLObject index, SubLObject key, SubLObject value) {
    {
      SubLObject v_set = bookkeeping_intermediate_index_lookup(index, key);
      if ((NIL == v_set)) {
        v_set = set.new_set(UNPROVIDED, UNPROVIDED);
      }
      set.set_add(value, v_set);
      dictionary.dictionary_enter(index, key, v_set);
      return T;
    }
  }

  /** @return boolean; whether the insert succeeded */
  @SubL(source = "cycl/bookkeeping-store.lisp", position = 14593) 
  public static final SubLObject bookkeeping_intermediate_index_insert(SubLObject index, SubLObject key, SubLObject value, SubLObject single_entryP) {
    if ((NIL != single_entryP)) {
      return bookkeeping_intermediate_index_set(index, key, value);
    } else {
      return bookkeeping_intermediate_index_push(index, key, value);
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 15386) 
  public static final SubLObject bookkeeping_intermediate_index_count(SubLObject index) {
    return dictionary.dictionary_length(index);
  }

  /** An index for bookkeeping binary gafs: pred -> arg1 -> arg2
This index also serves as the store for these bookkeeping assertions. */
  @SubL(source = "cycl/bookkeeping-store.lisp", position = 15483) 
  private static SubLSymbol $bookkeeping_binary_gaf_store$ = null;

  /** An index for bookkeeping binary gafs: pred -> arg2 -> list of arg1s */
  @SubL(source = "cycl/bookkeeping-store.lisp", position = 15757) 
  private static SubLSymbol $bookkeeping_binary_gaf_arg2_index$ = null;

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 15975) 
  public static final SubLObject clear_bookkeeping_binary_gaf_store() {
    $bookkeeping_binary_gaf_store$.setGlobalValue(new_bookkeeping_top_level_index($bookkeeping_predicates_for_hl_store$.getGlobalValue()));
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 16906) 
  public static final SubLObject dumper_clear_bookkeeping_binary_gaf_store() {
    return clear_bookkeeping_binary_gaf_store();
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 17016) 
  public static final SubLObject dumper_load_bookkeeping_binary_gaf(SubLObject pred, SubLObject arg1, SubLObject arg2) {
    return assert_bookkeeping_binary_gaf_int(pred, arg1, arg2);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 17302) 
  public static final SubLObject dumper_load_bookkeeping_index(SubLObject index) {
    $bookkeeping_binary_gaf_arg2_index$.setGlobalValue(index);
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 17424) 
  public static final SubLObject bookkeeping_binary_gaf_store() {
    return $bookkeeping_binary_gaf_store$.getGlobalValue();
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 17528) 
  public static final SubLObject bookkeeping_binary_gaf_arg2_index() {
    return $bookkeeping_binary_gaf_arg2_index$.getGlobalValue();
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 17627) 
  public static final SubLObject assert_bookkeeping_binary_gaf(SubLObject pred, SubLObject arg1, SubLObject arg2, SubLObject mt) {
    if ((NIL == hlmt.hlmt_equal(mt, $const0$BookkeepingMt))) {
      return NIL;
    }
    {
      SubLObject old_value = bookkeeping_fpred_value(pred, arg1, UNPROVIDED);
      if (((NIL != old_value)
           && (!(arg2.equal(old_value))))) {
        return NIL;
      }
    }
    return makeBoolean(((NIL != assert_bookkeeping_binary_gaf_int(pred, arg1, arg2))
           && (NIL != add_bookkeeping_binary_gaf_indices(pred, arg1, arg2))));
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 18167) 
  public static final SubLObject assert_bookkeeping_binary_gaf_int(SubLObject pred, SubLObject arg1, SubLObject arg2) {
    return bookkeeping_top_level_index_insert(bookkeeping_binary_gaf_store(), pred, arg1, arg2, T);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 18329) 
  public static final SubLObject add_bookkeeping_binary_gaf_indices(SubLObject pred, SubLObject arg1, SubLObject arg2) {
    return makeBoolean(((NIL == arg2_indexed_bookkeeping_predP(pred))
          || (NIL != bookkeeping_top_level_index_insert(bookkeeping_binary_gaf_arg2_index(), pred, arg2, arg1, NIL))));
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 19270) 
  public static final SubLObject unassert_all_bookkeeping_gafs_on_term(SubLObject v_term) {
    {
      SubLObject successP = T;
      {
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
          {
            SubLObject datum = cons;
            SubLObject current = datum;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list26);
            pred = current.first();
            current = current.rest();
            subindex = current;
            {
              SubLObject arg2 = bookkeeping_intermediate_index_lookup(subindex, v_term);
              if ((NIL != arg2)) {
                if ((NIL == Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31828"))) {
                  successP = NIL;
                }
              }
            }
          }
        }
      }
      {
        SubLObject created_terms = terms_created_by(v_term, UNPROVIDED);
        SubLObject cdolist_list_var = created_terms;
        SubLObject created_term = NIL;
        for (created_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), created_term = cdolist_list_var.first()) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31829"))) {
            successP = NIL;
          }
        }
      }
      {
        SubLObject created_terms = terms_created_for(v_term, UNPROVIDED);
        SubLObject cdolist_list_var = created_terms;
        SubLObject created_term = NIL;
        for (created_term = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), created_term = cdolist_list_var.first()) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31830"))) {
            successP = NIL;
          }
        }
      }
      return successP;
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 22140) 
  public static final SubLObject terms_created_by(SubLObject cyclist, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = $const0$BookkeepingMt;
    }
    return bookkeeping_arg1_pred_values($const6$myCreator, cyclist, mt);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 22277) 
  public static final SubLObject terms_created_for(SubLObject purpose, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = $const0$BookkeepingMt;
    }
    return bookkeeping_arg1_pred_values($const14$myCreationPurpose, purpose, mt);
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 24558) 
  public static final SubLObject bookkeeping_assertion_count() {
    return bookkeeping_top_level_index_count(bookkeeping_binary_gaf_store());
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 28438) 
  public static final SubLObject bookkeeping_fpred_value(SubLObject pred, SubLObject arg1, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = $const0$BookkeepingMt;
    }
    if ((NIL != hlmt.hlmt_equal(mt, $const0$BookkeepingMt))) {
      return bookkeeping_fpred_value_int(pred, arg1);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30009");
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 28696) 
  public static final SubLObject bookkeeping_fpred_value_int(SubLObject pred, SubLObject arg1) {
    {
      SubLObject arg1_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_store(), pred);
      if ((NIL != arg1_subindex)) {
        {
          SubLObject arg2 = bookkeeping_intermediate_index_lookup(arg1_subindex, arg1);
          return arg2;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 28985) 
  public static final SubLObject bookkeeping_arg1_pred_values(SubLObject pred, SubLObject arg2, SubLObject mt) {
    if ((mt == UNPROVIDED)) {
      mt = $const0$BookkeepingMt;
    }
    if ((NIL != hlmt.hlmt_equal(mt, $const0$BookkeepingMt))) {
      return bookkeeping_arg1_pred_values_int(pred, arg2);
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30033");
    }
  }

  @SubL(source = "cycl/bookkeeping-store.lisp", position = 29223) 
  public static final SubLObject bookkeeping_arg1_pred_values_int(SubLObject pred, SubLObject arg2) {
    {
      SubLObject arg2_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_arg2_index(), pred);
      if ((NIL != arg2_subindex)) {
        {
          SubLObject arg1_set = bookkeeping_intermediate_index_lookup(arg2_subindex, arg2);
          if ((NIL != arg1_set)) {
            return set.set_element_list(arg1_set);
          } else {
            return NIL;
          }
        }
      }
    }
    return NIL;
  }

  public static final SubLObject declare_bookkeeping_store_file() {
    declareFunction(myName, "bookkeeping_predicate_hl_storage_module_applicableP", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "bookkeeping_predicate_hl_storage_module_incompleteness", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
    declareFunction(myName, "bookkeeping_predicate_hl_storage_module_assert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
    declareFunction(myName, "bookkeeping_predicate_hl_storage_module_unassert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
    declareFunction(myName, "my_creator_hl_storage_module_applicableP", "MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "my_creation_time_hl_storage_module_applicableP", "MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "my_creation_purpose_hl_storage_module_applicableP", "MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
    declareFunction(myName, "my_creation_second_hl_storage_module_applicableP", "MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
    declareMacro(myName, "do_bookkeeping_top_level_index", "DO-BOOKKEEPING-TOP-LEVEL-INDEX");
    declareFunction(myName, "bookkeeping_predicates_for_hl_store", "BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false);
    declareFunction(myName, "arg2_indexed_bookkeeping_predicates_for_hl_store", "ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false);
    declareFunction(myName, "arg2_indexed_bookkeeping_predP", "ARG2-INDEXED-BOOKKEEPING-PRED?", 1, 0, false);
    declareFunction(myName, "new_bookkeeping_top_level_index", "NEW-BOOKKEEPING-TOP-LEVEL-INDEX", 1, 0, false);
    declareFunction(myName, "bookkeeping_top_level_index_lookup", "BOOKKEEPING-TOP-LEVEL-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "bookkeeping_top_level_index_insert", "BOOKKEEPING-TOP-LEVEL-INDEX-INSERT", 5, 0, false);
    declareFunction(myName, "bookkeeping_top_level_index_delete", "BOOKKEEPING-TOP-LEVEL-INDEX-DELETE", 5, 0, false);
    declareFunction(myName, "bookkeeping_top_level_index_count", "BOOKKEEPING-TOP-LEVEL-INDEX-COUNT", 1, 0, false);
    declareMacro(myName, "do_bookkeeping_intermediate_index", "DO-BOOKKEEPING-INTERMEDIATE-INDEX");
    declareFunction(myName, "new_bookkeeping_intermediate_index", "NEW-BOOKKEEPING-INTERMEDIATE-INDEX", 0, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_lookup", "BOOKKEEPING-INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_num_keys", "BOOKKEEPING-INTERMEDIATE-INDEX-NUM-KEYS", 1, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_set", "BOOKKEEPING-INTERMEDIATE-INDEX-SET", 3, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_push", "BOOKKEEPING-INTERMEDIATE-INDEX-PUSH", 3, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_delete_key", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_insert", "BOOKKEEPING-INTERMEDIATE-INDEX-INSERT", 4, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_delete", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE", 4, 0, false);
    declareFunction(myName, "bookkeeping_intermediate_index_count", "BOOKKEEPING-INTERMEDIATE-INDEX-COUNT", 1, 0, false);
    declareFunction(myName, "clear_bookkeeping_binary_gaf_store", "CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
    declareFunction(myName, "dumper_num_top_level_index", "DUMPER-NUM-TOP-LEVEL-INDEX", 0, 0, false);
    declareMacro(myName, "dumper_do_bookkeeping_top_level_index", "DUMPER-DO-BOOKKEEPING-TOP-LEVEL-INDEX");
    declareFunction(myName, "dumper_num_intermediate_index", "DUMPER-NUM-INTERMEDIATE-INDEX", 1, 0, false);
    declareMacro(myName, "dumper_do_bookkeeping_intermediate_index", "DUMPER-DO-BOOKKEEPING-INTERMEDIATE-INDEX");
    declareFunction(myName, "dumper_bookkeeping_binary_gaf_store", "DUMPER-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
    declareFunction(myName, "dumper_clear_bookkeeping_binary_gaf_store", "DUMPER-CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
    declareFunction(myName, "dumper_load_bookkeeping_binary_gaf", "DUMPER-LOAD-BOOKKEEPING-BINARY-GAF", 3, 0, false);
    declareFunction(myName, "dumper_dumpable_bookkeeping_index", "DUMPER-DUMPABLE-BOOKKEEPING-INDEX", 0, 0, false);
    declareFunction(myName, "dumper_load_bookkeeping_index", "DUMPER-LOAD-BOOKKEEPING-INDEX", 1, 0, false);
    declareFunction(myName, "bookkeeping_binary_gaf_store", "BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
    declareFunction(myName, "bookkeeping_binary_gaf_arg2_index", "BOOKKEEPING-BINARY-GAF-ARG2-INDEX", 0, 0, false);
    declareFunction(myName, "assert_bookkeeping_binary_gaf", "ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
    declareFunction(myName, "assert_bookkeeping_binary_gaf_int", "ASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false);
    declareFunction(myName, "add_bookkeeping_binary_gaf_indices", "ADD-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false);
    declareFunction(myName, "unassert_bookkeeping_binary_gaf", "UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
    declareFunction(myName, "unassert_bookkeeping_binary_gaf_int", "UNASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false);
    declareFunction(myName, "remove_bookkeeping_binary_gaf_indices", "REMOVE-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false);
    declareFunction(myName, "unassert_all_bookkeeping_gafs_on_term", "UNASSERT-ALL-BOOKKEEPING-GAFS-ON-TERM", 1, 0, false);
    declareFunction(myName, "unassert_all_bookkeeping_gafs_for_pred", "UNASSERT-ALL-BOOKKEEPING-GAFS-FOR-PRED", 1, 0, false);
    declareFunction(myName, "creator", "CREATOR", 1, 1, false);
    declareFunction(myName, "creation_time", "CREATION-TIME", 1, 1, false);
    declareFunction(myName, "creation_date", "CREATION-DATE", 1, 1, false);
    declareFunction(myName, "creation_purpose", "CREATION-PURPOSE", 1, 1, false);
    declareFunction(myName, "creation_second", "CREATION-SECOND", 1, 1, false);
    declareFunction(myName, "created_when", "CREATED-WHEN", 1, 1, false);
    declareFunction(myName, "creation_date_cycl", "CREATION-DATE-CYCL", 1, 0, false);
    declareFunction(myName, "terms_created_by", "TERMS-CREATED-BY", 1, 1, false);
    declareFunction(myName, "terms_created_for", "TERMS-CREATED-FOR", 1, 1, false);
    declareFunction(myName, "num_terms_created_by", "NUM-TERMS-CREATED-BY", 1, 1, false);
    declareFunction(myName, "num_terms_created_for", "NUM-TERMS-CREATED-FOR", 1, 1, false);
    declareFunction(myName, "bookkeeping_asents_on_term", "BOOKKEEPING-ASENTS-ON-TERM", 1, 0, false);
    declareFunction(myName, "bookkeeping_assertibles_on_term", "BOOKKEEPING-ASSERTIBLES-ON-TERM", 1, 0, false);
    declareFunction(myName, "bookkeeping_hl_assertion_specs_on_term", "BOOKKEEPING-HL-ASSERTION-SPECS-ON-TERM", 1, 0, false);
    declareFunction(myName, "bookkeeping_hl_assertibles_on_term", "BOOKKEEPING-HL-ASSERTIBLES-ON-TERM", 1, 0, false);
    declareFunction(myName, "bookkeeping_asent_to_hl_assertion_spec", "BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC", 1, 0, false);
    declareFunction(myName, "bookkeeping_asent_to_hl_assertible", "BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE", 1, 0, false);
    declareFunction(myName, "bookkeeping_assertion_count", "BOOKKEEPING-ASSERTION-COUNT", 0, 0, false);
    declareFunction(myName, "num_bookkeeping_binary_gafs_on_term", "NUM-BOOKKEEPING-BINARY-GAFS-ON-TERM", 1, 0, false);
    declareFunction(myName, "any_bookkeeping_assertions_on_termP", "ANY-BOOKKEEPING-ASSERTIONS-ON-TERM?", 1, 0, false);
    declareMacro(myName, "do_bookkeeping_assertions", "DO-BOOKKEEPING-ASSERTIONS");
    declareMacro(myName, "do_bookkeeping_asents", "DO-BOOKKEEPING-ASENTS");
    declareFunction(myName, "total_num_assertions_on_term", "TOTAL-NUM-ASSERTIONS-ON-TERM", 1, 0, false);
    declareFunction(myName, "bookkeeping_asent_truth", "BOOKKEEPING-ASENT-TRUTH", 1, 0, false);
    declareFunction(myName, "bookkeeping_assertion_truth", "BOOKKEEPING-ASSERTION-TRUTH", 3, 0, false);
    declareFunction(myName, "indexed_terms_mentioned_in_bookkeeping_assertions_of_term", "INDEXED-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-TERM", 1, 0, false);
    declareFunction(myName, "why_not_bookkeeping_asent", "WHY-NOT-BOOKKEEPING-ASENT", 1, 0, false);
    declareFunction(myName, "bookkeeping_fpred_value", "BOOKKEEPING-FPRED-VALUE", 2, 1, false);
    declareFunction(myName, "bookkeeping_fpred_value_int", "BOOKKEEPING-FPRED-VALUE-INT", 2, 0, false);
    declareFunction(myName, "bookkeeping_arg1_pred_values", "BOOKKEEPING-ARG1-PRED-VALUES", 2, 1, false);
    declareFunction(myName, "bookkeeping_arg1_pred_values_int", "BOOKKEEPING-ARG1-PRED-VALUES-INT", 2, 0, false);
    declareFunction(myName, "bookkeeping_arg1_assertion_count", "BOOKKEEPING-ARG1-ASSERTION-COUNT", 2, 1, false);
    declareFunction(myName, "bookkeeping_arg1_assertion_count_int", "BOOKKEEPING-ARG1-ASSERTION-COUNT-INT", 2, 0, false);
    declareFunction(myName, "reindex_all_bookkeeping_assertions", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS", 0, 0, false);
    declareFunction(myName, "reindex_all_bookkeeping_assertions_for_pred", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS-FOR-PRED", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_bookkeeping_store_file() {
    $bookkeeping_predicates_for_hl_store$ = deflexical("*BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list22);
    $arg2_indexed_bookkeeping_predicates_for_hl_store$ = deflexical("*ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list23);
    $bookkeeping_binary_gaf_store$ = deflexical("*BOOKKEEPING-BINARY-GAF-STORE*", ((NIL != Symbols.boundp($sym29$_BOOKKEEPING_BINARY_GAF_STORE_)) ? ((SubLObject) $bookkeeping_binary_gaf_store$.getGlobalValue()) : new_bookkeeping_top_level_index($bookkeeping_predicates_for_hl_store$.getGlobalValue())));
    $bookkeeping_binary_gaf_arg2_index$ = deflexical("*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*", ((NIL != Symbols.boundp($sym30$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_)) ? ((SubLObject) $bookkeeping_binary_gaf_arg2_index$.getGlobalValue()) : new_bookkeeping_top_level_index($arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue())));
    return NIL;
  }

  public static final SubLObject setup_bookkeeping_store_file() {
    // CVS_ID("Id: bookkeeping-store.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($const6$myCreator);
    hl_storage_modules.hl_storage_module($kw7$MY_CREATOR, $list8);
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($const10$myCreationTime);
    hl_storage_modules.hl_storage_module($kw11$MY_CREATION_TIME, $list12);
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($const14$myCreationPurpose);
    hl_storage_modules.hl_storage_module($kw15$MY_CREATION_PURPOSE, $list16);
    hl_storage_modules.register_solely_specific_hl_storage_module_predicate($const18$myCreationSecond);
    hl_storage_modules.hl_storage_module($kw19$MY_CREATION_SECOND, $list20);
    subl_macro_promotions.declare_defglobal($sym29$_BOOKKEEPING_BINARY_GAF_STORE_);
    subl_macro_promotions.declare_defglobal($sym30$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_);
    utilities_macros.register_cyc_api_function($sym38$CREATOR, $list39, $str40$Identify_the_cyclist_who_created_, $list41, $list42);
    utilities_macros.register_cyc_api_function($sym43$CREATION_TIME, $list39, $str44$Identify_when_FORT_was_created_, $list41, $list45);
    return NIL;
  }

  //// Internal Constants

  public static final SubLObject $const0$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));
  public static final SubLSymbol $sym1$ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");
  public static final SubLSymbol $kw2$MONOTONIC = makeKeyword("MONOTONIC");
  public static final SubLSymbol $kw3$STRENGTH = makeKeyword("STRENGTH");
  public static final SubLSymbol $kw4$BACKWARD = makeKeyword("BACKWARD");
  public static final SubLSymbol $kw5$DIRECTION = makeKeyword("DIRECTION");
  public static final SubLObject $const6$myCreator = constant_handles.reader_make_constant_shell(makeString("myCreator"));
  public static final SubLSymbol $kw7$MY_CREATOR = makeKeyword("MY-CREATOR");
  public static final SubLList $list8 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("myCreator"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("myCreator")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT")});
  public static final SubLList $list9 = list(constant_handles.reader_make_constant_shell(makeString("myCreator")), makeKeyword("FORT"), makeKeyword("FORT"));
  public static final SubLObject $const10$myCreationTime = constant_handles.reader_make_constant_shell(makeString("myCreationTime"));
  public static final SubLSymbol $kw11$MY_CREATION_TIME = makeKeyword("MY-CREATION-TIME");
  public static final SubLList $list12 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("myCreationTime"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT")});
  public static final SubLList $list13 = list(constant_handles.reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")));
  public static final SubLObject $const14$myCreationPurpose = constant_handles.reader_make_constant_shell(makeString("myCreationPurpose"));
  public static final SubLSymbol $kw15$MY_CREATION_PURPOSE = makeKeyword("MY-CREATION-PURPOSE");
  public static final SubLList $list16 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("myCreationPurpose"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT")});
  public static final SubLList $list17 = list(constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT"));
  public static final SubLObject $const18$myCreationSecond = constant_handles.reader_make_constant_shell(makeString("myCreationSecond"));
  public static final SubLSymbol $kw19$MY_CREATION_SECOND = makeKeyword("MY-CREATION-SECOND");
  public static final SubLList $list20 = list(new SubLObject[] {makeKeyword("PRETTY-NAME"), makeString("myCreationSecond"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), constant_handles.reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT")});
  public static final SubLList $list21 = list(constant_handles.reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P")));
  public static final SubLList $list22 = list(constant_handles.reader_make_constant_shell(makeString("myCreator")), constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")), constant_handles.reader_make_constant_shell(makeString("myCreationTime")), constant_handles.reader_make_constant_shell(makeString("myCreationSecond")));
  public static final SubLList $list23 = list(constant_handles.reader_make_constant_shell(makeString("myCreator")), constant_handles.reader_make_constant_shell(makeString("myCreationPurpose")));
  public static final SubLList $list24 = list(list(makeSymbol("KEY"), makeSymbol("SUBINDEX"), makeSymbol("TOP-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym25$DO_ALIST = makeSymbol("DO-ALIST");
  public static final SubLList $list26 = cons(makeSymbol("PRED"), makeSymbol("SUBINDEX"));
  public static final SubLList $list27 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym28$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym29$_BOOKKEEPING_BINARY_GAF_STORE_ = makeSymbol("*BOOKKEEPING-BINARY-GAF-STORE*");
  public static final SubLSymbol $sym30$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_ = makeSymbol("*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*");
  public static final SubLList $list31 = list(list(makeSymbol("PRED"), makeSymbol("SUBINDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym32$DO_BOOKKEEPING_TOP_LEVEL_INDEX = makeSymbol("DO-BOOKKEEPING-TOP-LEVEL-INDEX");
  public static final SubLList $list33 = list(list(makeSymbol("DUMPER-BOOKKEEPING-BINARY-GAF-STORE")));
  public static final SubLList $list34 = list(list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym35$DO_BOOKKEEPING_INTERMEDIATE_INDEX = makeSymbol("DO-BOOKKEEPING-INTERMEDIATE-INDEX");
  public static final SubLSymbol $sym36$FORT_P = makeSymbol("FORT-P");
  public static final SubLSymbol $sym37$HLMT_P = makeSymbol("HLMT-P");
  public static final SubLSymbol $sym38$CREATOR = makeSymbol("CREATOR");
  public static final SubLList $list39 = list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"))));
  public static final SubLString $str40$Identify_the_cyclist_who_created_ = makeString("Identify the cyclist who created FORT.");
  public static final SubLList $list41 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));
  public static final SubLList $list42 = list(makeSymbol("FORT-P"));
  public static final SubLSymbol $sym43$CREATION_TIME = makeSymbol("CREATION-TIME");
  public static final SubLString $str44$Identify_when_FORT_was_created_ = makeString("Identify when FORT was created.");
  public static final SubLList $list45 = list(makeSymbol("INTEGERP"));
  public static final SubLInteger $int46$1000000 = makeInteger(1000000);
  public static final SubLSymbol $sym47$BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC");
  public static final SubLSymbol $sym48$BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE");
  public static final SubLList $list49 = list(list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym50$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLList $list51 = list(list(makeSymbol("BOOKKEEPING-BINARY-GAF-STORE")));
  public static final SubLList $list52 = list(list(makeSymbol("ASENT")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym53$SUBINDEX = makeUninternedSymbol("SUBINDEX");
  public static final SubLSymbol $sym54$PRED = makeUninternedSymbol("PRED");
  public static final SubLSymbol $sym55$ARG1 = makeUninternedSymbol("ARG1");
  public static final SubLSymbol $sym56$ARG2 = makeUninternedSymbol("ARG2");
  public static final SubLSymbol $sym57$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym58$MAKE_BINARY_FORMULA = makeSymbol("MAKE-BINARY-FORMULA");
  public static final SubLSymbol $kw59$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLObject $const60$different = constant_handles.reader_make_constant_shell(makeString("different"));
  public static final SubLObject $const61$arg2Format = constant_handles.reader_make_constant_shell(makeString("arg2Format"));
  public static final SubLList $list62 = list(constant_handles.reader_make_constant_shell(makeString("singleEntryFormatInArgs")));
  public static final SubLObject $const63$unknownSentence = constant_handles.reader_make_constant_shell(makeString("unknownSentence"));
  public static final SubLObject $const64$completeExtentEnumerable = constant_handles.reader_make_constant_shell(makeString("completeExtentEnumerable"));
  public static final SubLString $str65$Gathering_all__s_assertions = makeString("Gathering all ~s assertions");
  public static final SubLString $str66$Reindexing_all_ = makeString("Reindexing all ");
  public static final SubLString $str67$_assertions = makeString(" assertions");
  public static final SubLList $list68 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

  //// Initializers

  public void declareFunctions() {
    declare_bookkeeping_store_file();
  }

  public void initializeVariables() {
    init_bookkeeping_store_file();
  }

  public void runTopLevelForms() {
    setup_bookkeeping_store_file();
  }

}
