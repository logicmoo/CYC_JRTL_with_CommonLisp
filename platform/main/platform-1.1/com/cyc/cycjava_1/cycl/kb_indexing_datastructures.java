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
import com.cyc.cycjava_1.cycl.assertion_handles;
import com.cyc.cycjava_1.cycl.assertions_high;
import com.cyc.cycjava_1.cycl.assertions_low;
import com.cyc.cycjava_1.cycl.auxiliary_indexing;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.constants_low;
import com.cyc.cycjava_1.cycl.control_vars;
import com.cyc.cycjava_1.cycl.cycl_grammar;
import com.cyc.cycjava_1.cycl.cycl_utilities;
import com.cyc.cycjava_1.cycl.dictionary;
import com.cyc.cycjava_1.cycl.dictionary_contents;
import com.cyc.cycjava_1.cycl.forts;
import com.cyc.cycjava_1.cycl.hlmt;
import com.cyc.cycjava_1.cycl.kb_indexing_declarations;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.nart_handles;
import com.cyc.cycjava_1.cycl.set;
import com.cyc.cycjava_1.cycl.set_utilities;
import com.cyc.cycjava_1.cycl.subl_macro_promotions;
import com.cyc.cycjava_1.cycl.subl_promotions;
import com.cyc.cycjava_1.cycl.unrepresented_terms;
import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class kb_indexing_datastructures extends SubLTranslatedFile {

  //// Constructor

  private kb_indexing_datastructures() {}
  public static final SubLFile me = new kb_indexing_datastructures();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_indexing_datastructures";

  //// Definitions

  /** sets up all tables needed for the KB indexing
   @param estimated-size; estimated # of constants */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 988) 
  public static final SubLObject setup_indexing_tables(SubLObject estimated_size) {
    {
      SubLObject estimated_assertion_count = Numbers.multiply(TEN_INTEGER, estimated_size);
      assertion_indexing_store_initialize(estimated_assertion_count);
    }
    return NIL;
  }

  /** The mapping between assertions and their indices */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 1515) 
  private static SubLSymbol $assertion_indexing_store$ = null;

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 1760) 
  public static final SubLObject assertion_indexing_store_reset(SubLObject store) {
    $assertion_indexing_store$.setGlobalValue(store);
    return store;
  }

  /** The estimated percentage of assertions that have meta-assertions */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 1907) 
  private static SubLSymbol $meta_assertion_frequency$ = null;

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2050) 
  public static final SubLObject assertion_indexing_store_initial_size(SubLObject estimated_assertion_count) {
    if ((estimated_assertion_count == UNPROVIDED)) {
      estimated_assertion_count = NIL;
    }
    if ((NIL != estimated_assertion_count)) {
      return Numbers.round(Numbers.multiply(estimated_assertion_count, $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
    } else {
      if ((NIL != control_vars.kb_loaded())) {
        return Numbers.round(Numbers.multiply(assertion_handles.assertion_count(), $meta_assertion_frequency$.getGlobalValue()), UNPROVIDED);
      } else {
        return $int2$64;
      }
    }
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2363) 
  public static final SubLObject assertion_indexing_store_initialize(SubLObject estimated_assertion_count) {
    if ((estimated_assertion_count == UNPROVIDED)) {
      estimated_assertion_count = NIL;
    }
    {
      SubLObject initial_size = assertion_indexing_store_initial_size(estimated_assertion_count);
      assertion_indexing_store_reset(Hashtables.make_hash_table(initial_size, Symbols.symbol_function(EQ), UNPROVIDED));
    }
    return $assertion_indexing_store$.getGlobalValue();
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 2695) 
  public static final SubLObject assertion_indexing_store_get(SubLObject assertion) {
    return Values.values(Hashtables.gethash(assertion, $assertion_indexing_store$.getGlobalValue(), new_simple_index()));
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3224) 
  public static final SubLObject assertion_indexing_store_set(SubLObject assertion, SubLObject index) {
    if ((index == new_simple_index())) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31914");
    } else {
      return Hashtables.sethash(assertion, $assertion_indexing_store$.getGlobalValue(), index);
    }
  }

  /** Constants which are part of the syntax and which therefore are not fully indexed. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3475) 
  private static SubLSymbol $unindexed_syntax_constants$ = null;

  /** Return T iff OBJECT is a constants which is part of the syntax and therefore not fully indexed. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 3932) 
  public static final SubLObject unindexed_syntax_constant_p(SubLObject object) {
    return list_utilities.member_eqP(object, $unindexed_syntax_constants$.getGlobalValue());
  }

  /** Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4136) 
  public static final SubLObject indexed_term_p(SubLObject object) {
    return makeBoolean(((NIL != cycl_utilities.reified_term_p(object))
          || (NIL != indexed_unrepresented_term_p(object))));
  }

  public static final class $indexed_term_p$UnaryFunction extends UnaryFunction {
    public $indexed_term_p$UnaryFunction() { super(extractFunctionNamed("INDEXED-TERM-P")); }
    public SubLObject processItem(SubLObject arg1) { return indexed_term_p(arg1); }
  }

  /** Returns T iff OBJECT is an indexed unrepresented CycL term, e.g., a string or number. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4415) 
  public static final SubLObject indexed_unrepresented_term_p(SubLObject object) {
    return cycl_grammar.cycl_unrepresented_term_p(object);
  }

  /** Returns T iff OBJECT is a valid indexed CycL term, i.e. a fort or an assertion. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 4603) 
  public static final SubLObject valid_indexed_termP(SubLObject object) {
    if ((NIL != forts.fort_p(object))) {
      return forts.valid_fortP(object);
    } else if ((NIL != assertion_handles.assertion_p(object))) {
      return assertion_handles.valid_assertionP(object, UNPROVIDED);
    } else if ((NIL != indexed_unrepresented_term_p(object))) {
      return T;
    } else {
      return NIL;
    }
  }

  public static final class $invalid_indexed_termP$UnaryFunction extends UnaryFunction {
    public $invalid_indexed_termP$UnaryFunction() { super(extractFunctionNamed("INVALID-INDEXED-TERM?")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31930"); }
  }

  /** Return T iff OBJECT is the type which will be indexed in the other index, if necessary. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6177) 
  public static final SubLObject fully_indexed_term_p(SubLObject object) {
    return makeBoolean(((NIL != indexed_term_p(object))
           && (NIL == unindexed_syntax_constant_p(object))));
  }

  public static final class $fully_indexed_term_p$UnaryFunction extends UnaryFunction {
    public $fully_indexed_term_p$UnaryFunction() { super(extractFunctionNamed("FULLY-INDEXED-TERM-P")); }
    public SubLObject processItem(SubLObject arg1) { return fully_indexed_term_p(arg1); }
  }

  /** Return T iff OBJECT is the type which will be indexed in the other index, if necessary, and is valid. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 6466) 
  public static final SubLObject valid_fully_indexed_term_p(SubLObject object) {
    return makeBoolean(((NIL != valid_indexed_termP(object))
           && (NIL == unindexed_syntax_constant_p(object))));
  }

  /** @return index-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 8801) 
  public static final SubLObject term_index(SubLObject v_term) {
    if ((NIL != constant_handles.constant_p(v_term))) {
      if ((NIL != constant_handles.valid_constantP(v_term, UNPROVIDED))) {
        return constants_low.constant_index(v_term);
      }
    } else if ((NIL != nart_handles.nart_p(v_term))) {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 30881"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 209");
      }
    } else if ((NIL != assertion_handles.assertion_p(v_term))) {
      return assertions_low.assertion_index(v_term);
    } else if ((NIL != indexed_unrepresented_term_p(v_term))) {
      return unrepresented_terms.unrepresented_term_index(v_term);
    } else if ((NIL != auxiliary_indexing.auxiliary_index_p(v_term))) {
      return auxiliary_indexing.get_auxiliary_index(v_term);
    }
    return NIL;
  }

  /** Primitively replaces TERM's index with INDEX.
   @param INDEX index-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 9327) 
  public static final SubLObject reset_term_index(SubLObject v_term, SubLObject index) {
    if ((NIL != forts.fort_p(v_term))) {
      forts.reset_fort_index(v_term, index);
    } else if ((NIL != hlmt.hlmt_p(v_term))) {
    } else if ((NIL != assertion_handles.assertion_p(v_term))) {
      assertions_low.reset_assertion_index(v_term, index);
    } else if ((NIL != indexed_unrepresented_term_p(v_term))) {
      unrepresented_terms.reset_unrepresented_term_index(v_term, index, T);
    } else if ((NIL != auxiliary_indexing.auxiliary_index_p(v_term))) {
      auxiliary_indexing.reset_auxiliary_index(v_term, index);
    } else {
      Errors.error($str15$_S_is_not_indexed, v_term);
    }
    return v_term;
  }

  /** Frees all resources consumed by INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 10277) 
  public static final SubLObject free_index(SubLObject index) {
    if ((NIL != simple_index_p(index))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31925");
    } else if ((NIL != complex_index_p(index))) {
      return free_complex_index(index);
    }
    return NIL;
  }

  /** Frees all resources consumed by the index for TERM */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 10515) 
  public static final SubLObject free_term_index(SubLObject v_term) {
    free_index(term_index(v_term));
    reset_term_index(v_term, new_simple_index());
    return v_term;
  }

  /** Return T iff OBJECT is a simple index. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 10721) 
  public static final SubLObject simple_index_p(SubLObject object) {
    return makeBoolean((object.isList()
           && (NIL == complex_index_p(object))));
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 11215) 
  public static final SubLObject simple_indexed_term_p(SubLObject v_term) {
    return simple_index_p(term_index(v_term));
  }

  /** Returns a new empty simple index. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 11307) 
  public static final SubLObject new_simple_index() {
    return NIL;
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 11686) 
  public static final SubLObject simple_num_index(SubLObject v_term) {
    checkType(v_term, $sym17$SIMPLE_INDEXED_TERM_P);
    return Sequences.length(term_index(v_term));
  }

  /** @return listp; the list of all assertions referencing TERM.
   @note: result is NOT destructible! */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 11826) 
  public static final SubLObject simple_term_assertion_list(SubLObject v_term) {
    checkType(v_term, $sym17$SIMPLE_INDEXED_TERM_P);
    return term_index(v_term);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12050) 
  public static final SubLObject do_simple_index_term_assertion_list(SubLObject v_term) {
    return simple_term_assertion_list(v_term);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12199) 
  public static final SubLObject reset_term_simple_index(SubLObject v_term, SubLObject simple_index) {
    checkType(simple_index, $sym20$SIMPLE_INDEX_P);
    return reset_term_index(v_term, simple_index);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 12905) 
  public static final SubLObject complex_index_p(SubLObject object) {
    return subindex_p(object);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13475) 
  public static final SubLObject complex_index_leaf_count(SubLObject complex_index) {
    return subindex_leaf_count(complex_index);
  }

  /** @return nil or subindex-p or indexing-leaf-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13580) 
  public static final SubLObject complex_index_lookup(SubLObject complex_index, SubLObject key) {
    return subindex_lookup(complex_index, key);
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13734) 
  public static final SubLObject term_complex_index_lookup(SubLObject v_term, SubLObject key) {
    {
      SubLObject index = term_index(v_term);
      if ((NIL == index)) {
        return NIL;
      }
      checkType(index, $sym21$COMPLEX_INDEX_P);
      return complex_index_lookup(index, key);
    }
  }

  /** Initializes a complex index for TERM.  Clobbers any existing
   indexing for TERM. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 13995) 
  public static final SubLObject initialize_term_complex_index(SubLObject v_term) {
    return initialize_term_subindex(v_term);
  }

  /** Frees all resources consumed by COMPLEX-INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 14960) 
  public static final SubLObject free_complex_index(SubLObject complex_index) {
    return free_subindex(complex_index);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 15120) 
  public static final SubLObject subindex_p(SubLObject object) {
    return makeBoolean(((NIL != intermediate_index_p(object))
          || (NIL != final_index_p(object))));
  }

  /** @return nil or subindex-p or indexing-leaf-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 15769) 
  public static final SubLObject subindex_lookup(SubLObject subindex, SubLObject key) {
    if ((NIL != intermediate_index_p(subindex))) {
      return intermediate_index_lookup(subindex, key);
    } else {
      if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31922"))) {
        return key;
      } else {
        return NIL;
      }
    }
  }

  /** @return integerp; the number of indexing leaves anywhere below SUBINDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16276) 
  public static final SubLObject subindex_leaf_count(SubLObject subindex) {
    if ((NIL != intermediate_index_p(subindex))) {
      return intermediate_index_leaf_count(subindex);
    } else {
      return final_index_leaf_count(subindex);
    }
  }

  /** Initializes a subindex for TERM.  Clobbers any existing
   indexing for TERM. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16544) 
  public static final SubLObject initialize_term_subindex(SubLObject v_term) {
    return initialize_term_intermediate_index(v_term);
  }

  /** Frees all resources consumed by SUBINDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 16832) 
  public static final SubLObject free_subindex(SubLObject subindex) {
    if ((NIL != intermediate_index_p(subindex))) {
      return free_intermediate_index(subindex);
    } else if ((NIL != final_index_p(subindex))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31924");
    }
    return NIL;
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17093) 
  public static final SubLObject intermediate_index_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && object.first().isInteger()
           && (NIL != dictionary.dictionary_p(object.rest()))));
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 17635) 
  public static final SubLObject new_intermediate_index(SubLObject test_function) {
    return cons(ZERO_INTEGER, dictionary.new_dictionary(test_function, UNPROVIDED));
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18233) 
  public static final SubLObject do_intermediate_index_valid_index_p(SubLObject object) {
    return makeBoolean((NIL != object));
  }

  /** @return nil or subindex-p */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18363) 
  public static final SubLObject intermediate_index_lookup(SubLObject intermediate_index, SubLObject key) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    {
      SubLObject dict = intermediate_index_dictionary(intermediate_index);
      return dictionary.dictionary_lookup_without_values(dict, key, UNPROVIDED);
    }
  }

  /** @return listp; a list of keys for INTERMEDIATE-INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18656) 
  public static final SubLObject intermediate_index_keys(SubLObject intermediate_index) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    return dictionary.dictionary_keys(intermediate_index_dictionary(intermediate_index));
  }

  /** @return integerp; the number of indexing leaves anywhere below INTERMEDIATE-INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 18910) 
  public static final SubLObject intermediate_index_leaf_count(SubLObject intermediate_index) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    return intermediate_index.first();
  }

  /** does not reset the counts */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19513) 
  public static final SubLObject intermediate_index_set(SubLObject intermediate_index, SubLObject key, SubLObject value) {
    checkType(value, $sym35$SUBINDEX_P);
    intermediate_index_dictionary_set(intermediate_index, key, value);
    return intermediate_index;
  }

  /** @return boolean; whether it actually inserted (nil if it was already there) */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 19757) 
  public static final SubLObject intermediate_index_insert(SubLObject intermediate_index, SubLObject keys, SubLObject leaf) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    return intermediate_index_insert_int(intermediate_index, keys, leaf, NIL);
  }

  /** Insert LEAF at KEYS, having already gone down the keys in KEY-HISTORY */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 20042) 
  public static final SubLObject intermediate_index_insert_int(SubLObject intermediate_index, SubLObject keys, SubLObject leaf, SubLObject key_history) {
    {
      SubLObject datum = keys;
      SubLObject current = datum;
      SubLObject key = NIL;
      SubLObject rest_keys = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
      key = current.first();
      current = current.rest();
      rest_keys = current;
      if ((NIL != rest_keys)) {
        {
          SubLObject new_key_history = ConsesLow.nconc(key_history, list(key));
          SubLObject subindex = intermediate_index_lookup_or_create_intermediate(intermediate_index, key, new_key_history);
          if ((NIL != intermediate_index_insert_int(subindex, rest_keys, leaf, new_key_history))) {
            intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
            return T;
          }
        }
      } else {
        {
          SubLObject subindex = intermediate_index_lookup_or_create_final(intermediate_index, key);
          checkType(subindex, $sym37$FINAL_INDEX_P);
          {
            SubLObject old_count = final_index_leaf_count(subindex);
            final_index_insert(subindex, leaf);
            {
              SubLObject new_count = final_index_leaf_count(subindex);
              if ((!(old_count.numE(new_count)))) {
                intermediate_index_leaf_count_inc(intermediate_index, ONE_INTEGER);
                return T;
              }
            }
          }
        }
      }
    }
    return NIL;
  }

  /** @return boolean; whether it actually deleted (nil if it was already gone) */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 21080) 
  public static final SubLObject intermediate_index_delete(SubLObject intermediate_index, SubLObject keys, SubLObject leaf) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    {
      SubLObject datum = keys;
      SubLObject current = datum;
      SubLObject key = NIL;
      SubLObject rest_keys = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list36);
      key = current.first();
      current = current.rest();
      rest_keys = current;
      {
        SubLObject result = NIL;
        SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
        if ((NIL != subindex)) {
          if ((NIL != rest_keys)) {
            result = intermediate_index_delete(subindex, rest_keys, leaf);
            if ((NIL != result)) {
              intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
            }
          } else {
            checkType(subindex, $sym37$FINAL_INDEX_P);
            {
              SubLObject old_count = final_index_leaf_count(subindex);
              final_index_delete(subindex, leaf);
              {
                SubLObject new_count = final_index_leaf_count(subindex);
                if ((!(old_count.numE(new_count)))) {
                  intermediate_index_leaf_count_inc(intermediate_index, MINUS_ONE_INTEGER);
                  result = T;
                }
              }
            }
          }
          if (ZERO_INTEGER.numE(subindex_leaf_count(subindex))) {
            intermediate_index_delete_key(intermediate_index, key);
          }
        }
        return result;
      }
    }
  }

  /** Delete any mapping from KEY to a subindex in INTERMEDIATE-INDEX. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22268) 
  public static final SubLObject intermediate_index_delete_key(SubLObject intermediate_index, SubLObject key) {
    intermediate_index_dictionary_delete_key(intermediate_index, key);
    return intermediate_index;
  }

  /** Initializes a top-level intermediate index for TERM.
   Clobbers any existing indexing for TERM. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22507) 
  public static final SubLObject initialize_term_intermediate_index(SubLObject v_term) {
    return reset_term_index(v_term, new_intermediate_index(Symbols.symbol_function(EQ)));
  }

  /** Frees all resources consumed by INTERMEDIATE-INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 22799) 
  public static final SubLObject free_intermediate_index(SubLObject intermediate_index) {
    return dictionary.clear_dictionary(intermediate_index_dictionary(intermediate_index));
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23014) 
  public static final SubLObject intermediate_index_leaf_count_reset(SubLObject intermediate_index, SubLObject new_count) {
    return ConsesLow.rplaca(intermediate_index, new_count);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23209) 
  public static final SubLObject intermediate_index_leaf_count_inc(SubLObject intermediate_index, SubLObject delta) {
    {
      SubLObject old_count = intermediate_index_leaf_count(intermediate_index);
      SubLObject new_count = Numbers.add(old_count, delta);
      intermediate_index_leaf_count_reset(intermediate_index, new_count);
    }
    return intermediate_index;
  }

  /** Having already gone down the keys in KEY-HISTORY, look up KEY in INTERMEDIATE-INDEX.
If not found, create a new intermediate index for KEY, with an equality test determined from KEY-HISTORY. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 23494) 
  public static final SubLObject intermediate_index_lookup_or_create_intermediate(SubLObject intermediate_index, SubLObject key, SubLObject key_history) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    {
      SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
      if ((NIL != subindex)) {
        return subindex;
      }
    }
    {
      SubLObject equality_test = kb_indexing_declarations.index_equality_test_for_keys(key_history);
      SubLObject subindex = new_intermediate_index(equality_test);
      intermediate_index_set(intermediate_index, key, subindex);
      return subindex;
    }
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24195) 
  public static final SubLObject intermediate_index_lookup_or_create_final(SubLObject intermediate_index, SubLObject key) {
    checkType(intermediate_index, $sym23$INTERMEDIATE_INDEX_P);
    {
      SubLObject subindex = intermediate_index_lookup(intermediate_index, key);
      if ((NIL != subindex)) {
        return subindex;
      }
    }
    {
      SubLObject subindex = new_final_index();
      intermediate_index_set(intermediate_index, key, subindex);
      return subindex;
    }
  }

  /** assumes INTERMEDIATE-INDEX is dictionary-style */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24600) 
  public static final SubLObject intermediate_index_dictionary(SubLObject intermediate_index) {
    return intermediate_index.rest();
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 24829) 
  public static final SubLObject intermediate_index_dictionary_set(SubLObject intermediate_index, SubLObject key, SubLObject value) {
    checkType(value, $sym35$SUBINDEX_P);
    return dictionary.dictionary_enter(intermediate_index_dictionary(intermediate_index), key, value);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 25032) 
  public static final SubLObject intermediate_index_dictionary_delete_key(SubLObject intermediate_index, SubLObject key) {
    return dictionary.dictionary_remove(intermediate_index_dictionary(intermediate_index), key);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 25199) 
  public static final SubLObject final_index_p(SubLObject object) {
    return set.set_p(object);
  }

  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 25531) 
  public static final SubLObject new_final_index() {
    return set.new_set(EQ, UNPROVIDED);
  }

  /** @return integerp; the number of indexing leaves in FINAL-INDEX */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 26117) 
  public static final SubLObject final_index_leaf_count(SubLObject final_index) {
    return set.set_size(final_index_set(final_index));
  }

  /** Is not required to check for membership before insertion */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27042) 
  public static final SubLObject final_index_insert(SubLObject final_index, SubLObject leaf) {
    set.set_add(leaf, final_index_set(final_index));
    return final_index;
  }

  /** Is not required to check for multiple elements to delete */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27228) 
  public static final SubLObject final_index_delete(SubLObject final_index, SubLObject leaf) {
    set.set_remove(leaf, final_index_set(final_index));
    return final_index;
  }

  /** returns the set datastructure in FINAL-INDEX.
   Currently a final index _is_ a set, so this is the identity function. */
  @SubL(source = "cycl/kb-indexing-datastructures.lisp", position = 27599) 
  public static final SubLObject final_index_set(SubLObject final_index) {
    return final_index;
  }

  public static final SubLObject declare_kb_indexing_datastructures_file() {
    declareFunction(myName, "setup_indexing_tables", "SETUP-INDEXING-TABLES", 1, 0, false);
    declareFunction(myName, "assertion_indexing_store", "ASSERTION-INDEXING-STORE", 0, 0, false);
    declareFunction(myName, "assertion_indexing_store_reset", "ASSERTION-INDEXING-STORE-RESET", 1, 0, false);
    declareFunction(myName, "assertion_indexing_store_initial_size", "ASSERTION-INDEXING-STORE-INITIAL-SIZE", 0, 1, false);
    declareFunction(myName, "assertion_indexing_store_initialize", "ASSERTION-INDEXING-STORE-INITIALIZE", 0, 1, false);
    declareFunction(myName, "assertion_indexing_store_get", "ASSERTION-INDEXING-STORE-GET", 1, 0, false);
    declareFunction(myName, "assertion_indexing_store_remove", "ASSERTION-INDEXING-STORE-REMOVE", 1, 0, false);
    declareFunction(myName, "assertion_indexing_store_set", "ASSERTION-INDEXING-STORE-SET", 2, 0, false);
    declareFunction(myName, "unindexed_syntax_constants", "UNINDEXED-SYNTAX-CONSTANTS", 0, 0, false);
    declareFunction(myName, "unindexed_syntax_constant_p", "UNINDEXED-SYNTAX-CONSTANT-P", 1, 0, false);
    declareFunction(myName, "indexed_term_p", "INDEXED-TERM-P", 1, 0, false); new $indexed_term_p$UnaryFunction();
    declareFunction(myName, "indexed_unrepresented_term_p", "INDEXED-UNREPRESENTED-TERM-P", 1, 0, false);
    declareFunction(myName, "valid_indexed_termP", "VALID-INDEXED-TERM?", 1, 0, false);
    declareFunction(myName, "valid_indexed_term_robustP", "VALID-INDEXED-TERM-ROBUST?", 1, 0, false);
    declareFunction(myName, "invalid_indexed_termP", "INVALID-INDEXED-TERM?", 1, 0, false); new $invalid_indexed_termP$UnaryFunction();
    declareFunction(myName, "invalid_indexed_term_robustP", "INVALID-INDEXED-TERM-ROBUST?", 1, 0, false);
    declareFunction(myName, "sort_of_indexed_term_p", "SORT-OF-INDEXED-TERM-P", 1, 0, false);
    declareFunction(myName, "fully_indexed_term_p", "FULLY-INDEXED-TERM-P", 1, 0, false); new $fully_indexed_term_p$UnaryFunction();
    declareFunction(myName, "valid_fully_indexed_term_p", "VALID-FULLY-INDEXED-TERM-P", 1, 0, false);
    declareMacro(myName, "do_indexed_terms", "DO-INDEXED-TERMS");
    declareFunction(myName, "index_p", "INDEX-P", 1, 0, false);
    declareFunction(myName, "index_installed_p", "INDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "index_not_hosed_p", "INDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "index_leaves", "INDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "index_leaf_count", "INDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "term_index", "TERM-INDEX", 1, 0, false);
    declareFunction(myName, "reset_term_index", "RESET-TERM-INDEX", 2, 0, false);
    declareFunction(myName, "clear_term_index", "CLEAR-TERM-INDEX", 1, 0, false);
    declareFunction(myName, "free_index", "FREE-INDEX", 1, 0, false);
    declareFunction(myName, "free_term_index", "FREE-TERM-INDEX", 1, 0, false);
    declareFunction(myName, "simple_index_p", "SIMPLE-INDEX-P", 1, 0, false);
    declareFunction(myName, "simple_index_installed_p", "SIMPLE-INDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "simple_index_not_hosed_p", "SIMPLE-INDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "simple_indexed_term_p", "SIMPLE-INDEXED-TERM-P", 1, 0, false);
    declareFunction(myName, "new_simple_index", "NEW-SIMPLE-INDEX", 0, 0, false);
    declareFunction(myName, "simple_index_leaves", "SIMPLE-INDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "simple_index_leaf_count", "SIMPLE-INDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "simple_index_memberP", "SIMPLE-INDEX-MEMBER?", 2, 0, false);
    declareFunction(myName, "simple_num_index", "SIMPLE-NUM-INDEX", 1, 0, false);
    declareFunction(myName, "simple_term_assertion_list", "SIMPLE-TERM-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "do_simple_index_term_assertion_list", "DO-SIMPLE-INDEX-TERM-ASSERTION-LIST", 1, 0, false);
    declareFunction(myName, "reset_term_simple_index", "RESET-TERM-SIMPLE-INDEX", 2, 0, false);
    declareFunction(myName, "simple_index_insert", "SIMPLE-INDEX-INSERT", 2, 0, false);
    declareFunction(myName, "simple_index_delete", "SIMPLE-INDEX-DELETE", 2, 0, false);
    declareFunction(myName, "free_simple_index", "FREE-SIMPLE-INDEX", 1, 0, false);
    declareFunction(myName, "complex_index_p", "COMPLEX-INDEX-P", 1, 0, false);
    declareFunction(myName, "complex_index_installed_p", "COMPLEX-INDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "complex_index_not_hosed_p", "COMPLEX-INDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "complex_indexed_term_p", "COMPLEX-INDEXED-TERM-P", 1, 0, false);
    declareFunction(myName, "complex_index_leaves", "COMPLEX-INDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "complex_index_leaf_count", "COMPLEX-INDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "complex_index_lookup", "COMPLEX-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "term_complex_index_lookup", "TERM-COMPLEX-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "initialize_term_complex_index", "INITIALIZE-TERM-COMPLEX-INDEX", 1, 0, false);
    declareFunction(myName, "term_complex_index_set", "TERM-COMPLEX-INDEX-SET", 3, 0, false);
    declareFunction(myName, "term_complex_index_delete_key", "TERM-COMPLEX-INDEX-DELETE-KEY", 2, 0, false);
    declareFunction(myName, "free_complex_index", "FREE-COMPLEX-INDEX", 1, 0, false);
    declareFunction(myName, "subindex_p", "SUBINDEX-P", 1, 0, false);
    declareFunction(myName, "subindex_installed_p", "SUBINDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "subindex_not_hosed_p", "SUBINDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "subindex_lookup", "SUBINDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "subindex_leaves", "SUBINDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "subindex_leaf_count", "SUBINDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "initialize_term_subindex", "INITIALIZE-TERM-SUBINDEX", 1, 0, false);
    declareFunction(myName, "free_subindex", "FREE-SUBINDEX", 1, 0, false);
    declareFunction(myName, "intermediate_index_p", "INTERMEDIATE-INDEX-P", 1, 0, false);
    declareFunction(myName, "intermediate_index_installed_p", "INTERMEDIATE-INDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "intermediate_index_not_hosed_p", "INTERMEDIATE-INDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "new_intermediate_index", "NEW-INTERMEDIATE-INDEX", 1, 0, false);
    declareMacro(myName, "do_intermediate_index", "DO-INTERMEDIATE-INDEX");
    declareFunction(myName, "do_intermediate_index_valid_index_p", "DO-INTERMEDIATE-INDEX-VALID-INDEX-P", 1, 0, false);
    declareFunction(myName, "intermediate_index_lookup", "INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
    declareFunction(myName, "intermediate_index_keys", "INTERMEDIATE-INDEX-KEYS", 1, 0, false);
    declareFunction(myName, "intermediate_index_leaf_count", "INTERMEDIATE-INDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "intermediate_index_leaves", "INTERMEDIATE-INDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "intermediate_index_set", "INTERMEDIATE-INDEX-SET", 3, 0, false);
    declareFunction(myName, "intermediate_index_insert", "INTERMEDIATE-INDEX-INSERT", 3, 0, false);
    declareFunction(myName, "intermediate_index_insert_int", "INTERMEDIATE-INDEX-INSERT-INT", 4, 0, false);
    declareFunction(myName, "intermediate_index_delete", "INTERMEDIATE-INDEX-DELETE", 3, 0, false);
    declareFunction(myName, "intermediate_index_delete_key", "INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
    declareFunction(myName, "initialize_term_intermediate_index", "INITIALIZE-TERM-INTERMEDIATE-INDEX", 1, 0, false);
    declareFunction(myName, "free_intermediate_index", "FREE-INTERMEDIATE-INDEX", 1, 0, false);
    declareFunction(myName, "intermediate_index_leaf_count_reset", "INTERMEDIATE-INDEX-LEAF-COUNT-RESET", 2, 0, false);
    declareFunction(myName, "intermediate_index_leaf_count_inc", "INTERMEDIATE-INDEX-LEAF-COUNT-INC", 2, 0, false);
    declareFunction(myName, "intermediate_index_lookup_or_create_intermediate", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-INTERMEDIATE", 3, 0, false);
    declareFunction(myName, "intermediate_index_lookup_or_create_final", "INTERMEDIATE-INDEX-LOOKUP-OR-CREATE-FINAL", 2, 0, false);
    declareFunction(myName, "intermediate_index_dictionary", "INTERMEDIATE-INDEX-DICTIONARY", 1, 0, false);
    declareFunction(myName, "intermediate_index_dictionary_set", "INTERMEDIATE-INDEX-DICTIONARY-SET", 3, 0, false);
    declareFunction(myName, "intermediate_index_dictionary_delete_key", "INTERMEDIATE-INDEX-DICTIONARY-DELETE-KEY", 2, 0, false);
    declareFunction(myName, "final_index_p", "FINAL-INDEX-P", 1, 0, false);
    declareFunction(myName, "final_index_installed_p", "FINAL-INDEX-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "final_index_not_hosed_p", "FINAL-INDEX-NOT-HOSED-P", 1, 0, false);
    declareFunction(myName, "new_final_index", "NEW-FINAL-INDEX", 0, 0, false);
    declareMacro(myName, "do_final_index", "DO-FINAL-INDEX");
    declareFunction(myName, "do_final_index_valid_index_p", "DO-FINAL-INDEX-VALID-INDEX-P", 1, 0, false);
    declareFunction(myName, "final_index_leaf_count", "FINAL-INDEX-LEAF-COUNT", 1, 0, false);
    declareFunction(myName, "final_index_leaves", "FINAL-INDEX-LEAVES", 1, 0, false);
    declareFunction(myName, "final_index_memberP", "FINAL-INDEX-MEMBER?", 2, 0, false);
    declareFunction(myName, "final_index_arbitrary_leaf", "FINAL-INDEX-ARBITRARY-LEAF", 1, 0, false);
    declareFunction(myName, "final_index_leaves_reset", "FINAL-INDEX-LEAVES-RESET", 2, 0, false);
    declareFunction(myName, "final_index_insert", "FINAL-INDEX-INSERT", 2, 0, false);
    declareFunction(myName, "final_index_delete", "FINAL-INDEX-DELETE", 2, 0, false);
    declareFunction(myName, "free_final_index", "FREE-FINAL-INDEX", 1, 0, false);
    declareFunction(myName, "final_index_set", "FINAL-INDEX-SET", 1, 0, false);
    declareFunction(myName, "indexing_leaf_p", "INDEXING-LEAF-P", 1, 0, false);
    declareFunction(myName, "indexing_leaf_installed_p", "INDEXING-LEAF-INSTALLED-P", 1, 0, false);
    declareFunction(myName, "indexing_leaf_not_hosed_p", "INDEXING-LEAF-NOT-HOSED-P", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_indexing_datastructures_file() {
    $assertion_indexing_store$ = deflexical("*ASSERTION-INDEXING-STORE*", ((NIL != Symbols.boundp($sym0$_ASSERTION_INDEXING_STORE_)) ? ((SubLObject) $assertion_indexing_store$.getGlobalValue()) : NIL));
    $meta_assertion_frequency$ = deflexical("*META-ASSERTION-FREQUENCY*", $float1$0_015);
    $unindexed_syntax_constants$ = deflexical("*UNINDEXED-SYNTAX-CONSTANTS*", $list3);
    return NIL;
  }

  public static final SubLObject setup_kb_indexing_datastructures_file() {
    // CVS_ID("Id: kb-indexing-datastructures.lisp 126640 2008-12-04 13:39:36Z builder ");
    subl_macro_promotions.declare_defglobal($sym0$_ASSERTION_INDEXING_STORE_);
    utilities_macros.register_cyc_api_function($sym4$INDEXED_TERM_P, $list5, $str6$Returns_T_iff_OBJECT_is_an_indexe, NIL, $list7);
    access_macros.register_macro_helper($sym18$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST, $sym19$DO_SIMPLE_INDEX);
    access_macros.register_macro_helper($sym31$DO_INTERMEDIATE_INDEX_VALID_INDEX_P, $sym34$DO_INTERMEDIATE_INDEX);
    access_macros.register_macro_helper($sym33$INTERMEDIATE_INDEX_DICTIONARY, $sym34$DO_INTERMEDIATE_INDEX);
    access_macros.register_macro_helper($sym40$DO_FINAL_INDEX_VALID_INDEX_P, $sym43$DO_FINAL_INDEX);
    access_macros.register_macro_helper($sym42$FINAL_INDEX_SET, $sym43$DO_FINAL_INDEX);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_ASSERTION_INDEXING_STORE_ = makeSymbol("*ASSERTION-INDEXING-STORE*");
  public static final SubLFloat $float1$0_015 = makeDouble(0.015);
  public static final SubLInteger $int2$64 = makeInteger(64);
  public static final SubLList $list3 = list(constant_handles.reader_make_constant_shell(makeString("implies")), constant_handles.reader_make_constant_shell(makeString("and")), constant_handles.reader_make_constant_shell(makeString("or")), constant_handles.reader_make_constant_shell(makeString("not")));
  public static final SubLSymbol $sym4$INDEXED_TERM_P = makeSymbol("INDEXED-TERM-P");
  public static final SubLList $list5 = list(makeSymbol("OBJECT"));
  public static final SubLString $str6$Returns_T_iff_OBJECT_is_an_indexe = makeString("Returns T iff OBJECT is an indexed CycL term, e.g. a fort or assertion.");
  public static final SubLList $list7 = list(makeSymbol("BOOLEANP"));
  public static final SubLList $list8 = list(list(makeSymbol("VAR"), makeSymbol("&OPTIONAL"), list(makeSymbol("MESSAGE"), makeString("mapping Cyc indexed terms"))), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str9$mapping_Cyc_indexed_terms = makeString("mapping Cyc indexed terms");
  public static final SubLSymbol $sym10$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym11$DO_FORTS = makeSymbol("DO-FORTS");
  public static final SubLSymbol $sym12$DO_ASSERTIONS = makeSymbol("DO-ASSERTIONS");
  public static final SubLSymbol $sym13$DO_KB_UNREPRESENTED_TERMS = makeSymbol("DO-KB-UNREPRESENTED-TERMS");
  public static final SubLSymbol $kw14$PROGRESS_MESSAGE = makeKeyword("PROGRESS-MESSAGE");
  public static final SubLString $str15$_S_is_not_indexed = makeString("~S is not indexed");
  public static final SubLSymbol $sym16$INDEXING_LEAF_INSTALLED_P = makeSymbol("INDEXING-LEAF-INSTALLED-P");
  public static final SubLSymbol $sym17$SIMPLE_INDEXED_TERM_P = makeSymbol("SIMPLE-INDEXED-TERM-P");
  public static final SubLSymbol $sym18$DO_SIMPLE_INDEX_TERM_ASSERTION_LIST = makeSymbol("DO-SIMPLE-INDEX-TERM-ASSERTION-LIST");
  public static final SubLSymbol $sym19$DO_SIMPLE_INDEX = makeSymbol("DO-SIMPLE-INDEX");
  public static final SubLSymbol $sym20$SIMPLE_INDEX_P = makeSymbol("SIMPLE-INDEX-P");
  public static final SubLSymbol $sym21$COMPLEX_INDEX_P = makeSymbol("COMPLEX-INDEX-P");
  public static final SubLString $str22$_s_is_not_a_SUBINDEX_P = makeString("~s is not a SUBINDEX-P");
  public static final SubLSymbol $sym23$INTERMEDIATE_INDEX_P = makeSymbol("INTERMEDIATE-INDEX-P");
  public static final SubLList $list24 = list(list(makeSymbol("KEY-VAR"), makeSymbol("SUBINDEX-VAR"), makeSymbol("INTERMEDIATE-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list25 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw26$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw27$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym28$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym29$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym30$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym31$DO_INTERMEDIATE_INDEX_VALID_INDEX_P = makeSymbol("DO-INTERMEDIATE-INDEX-VALID-INDEX-P");
  public static final SubLSymbol $sym32$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLSymbol $sym33$INTERMEDIATE_INDEX_DICTIONARY = makeSymbol("INTERMEDIATE-INDEX-DICTIONARY");
  public static final SubLSymbol $sym34$DO_INTERMEDIATE_INDEX = makeSymbol("DO-INTERMEDIATE-INDEX");
  public static final SubLSymbol $sym35$SUBINDEX_P = makeSymbol("SUBINDEX-P");
  public static final SubLList $list36 = cons(makeSymbol("KEY"), makeSymbol("REST-KEYS"));
  public static final SubLSymbol $sym37$FINAL_INDEX_P = makeSymbol("FINAL-INDEX-P");
  public static final SubLList $list38 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("FINAL-INDEX"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym39$INDEX = makeUninternedSymbol("INDEX");
  public static final SubLSymbol $sym40$DO_FINAL_INDEX_VALID_INDEX_P = makeSymbol("DO-FINAL-INDEX-VALID-INDEX-P");
  public static final SubLSymbol $sym41$DO_SET = makeSymbol("DO-SET");
  public static final SubLSymbol $sym42$FINAL_INDEX_SET = makeSymbol("FINAL-INDEX-SET");
  public static final SubLSymbol $sym43$DO_FINAL_INDEX = makeSymbol("DO-FINAL-INDEX");

  //// Initializers

  public void declareFunctions() {
    declare_kb_indexing_datastructures_file();
  }

  public void initializeVariables() {
    init_kb_indexing_datastructures_file();
  }

  public void runTopLevelForms() {
    setup_kb_indexing_datastructures_file();
  }

}
