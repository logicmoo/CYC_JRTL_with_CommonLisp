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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_contents;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;

public  final class kb_indexing_declarations extends SubLTranslatedFile {

  //// Constructor

  private kb_indexing_declarations() {}
  public static final SubLFile me = new kb_indexing_declarations();
  public static final String myName = "com.cyc.cycjava_1.cycl.kb_indexing_declarations";

  //// Definitions

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 638) 
  private static SubLSymbol $default_intermediate_index_equal_test$ = null;

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 717) 
  private static SubLSymbol $kb_indexing_declaration_store$ = null;

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 965) 
  public static final SubLObject kb_indexing_declaration_store() {
    return $kb_indexing_declaration_store$.getGlobalValue();
  }

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1311) 
  public static final SubLObject add_index_to_kb_indexing_declaration_store(SubLObject index, SubLObject plist) {
    return dictionary.dictionary_enter($kb_indexing_declaration_store$.getGlobalValue(), index, plist);
  }

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1597) 
  public static final SubLObject get_index_from_kb_indexing_declaration_store(SubLObject index) {
    return dictionary.dictionary_lookup($kb_indexing_declaration_store$.getGlobalValue(), index, UNPROVIDED);
  }

  /** Returns the index with a top-level key of TOP-LEVEL-KEY */
  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 1734) 
  public static final SubLObject find_index_by_top_level_key(SubLObject top_level_key) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject index = get_index_from_kb_indexing_declaration_store(top_level_key);
        if (((NIL != index)
             && (top_level_key == get_index_prop(index, $kw9$TOP_LEVEL_KEY)))) {
          return index;
        }
      }
      {
        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(kb_indexing_declaration_store()));
        while ((NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state))) {
          thread.resetMultipleValues();
          {
            SubLObject index = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            SubLObject plist = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((top_level_key == get_index_prop(index, $kw9$TOP_LEVEL_KEY))) {
              return index;
            }
            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
          }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2189) 
  public static final SubLObject get_index_key_prop(SubLObject key_info, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    return conses_high.getf(key_info, indicator, v_default);
  }

  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2307) 
  public static final SubLObject get_index_prop(SubLObject index, SubLObject indicator) {
    return conses_high.getf(get_index_from_kb_indexing_declaration_store(index), indicator, UNPROVIDED);
  }

  /** See below for an explanation of what fields
   go in the plist, what they mean, and a bunch of examples. */
  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2461) 
  public static final SubLObject declare_index(SubLObject index, SubLObject plist) {
    add_index_to_kb_indexing_declaration_store(index, plist);
    return index;
  }

  /** @param KEYS; a list of keys, starting from the top level.
@return valid-hash-table-test?; the test appropriate for distinguishing the last key in KEYS. */
  @SubL(source = "cycl/kb-indexing-declarations.lisp", position = 2691) 
  public static final SubLObject index_equality_test_for_keys(SubLObject keys) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = keys;
        SubLObject current = datum;
        SubLObject top_level_key = NIL;
        SubLObject rest_keys = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list10);
        top_level_key = current.first();
        current = current.rest();
        rest_keys = current;
        {
          SubLObject index = find_index_by_top_level_key(top_level_key);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == index)) {
              Errors.error($str11$Could_not_find_an_index_with_top_, top_level_key);
            }
          }
          {
            SubLObject key_info_list = get_index_prop(index, $kw12$KEYS);
            SubLObject levels_deep = Sequences.length(rest_keys);
            SubLObject key_info_for_this_level = ConsesLow.nth(levels_deep, key_info_list);
            SubLObject equal_test = get_index_key_prop(key_info_for_this_level, $kw13$EQUAL_TEST, $default_intermediate_index_equal_test$.getGlobalValue());
            return equal_test;
          }
        }
      }
    }
  }

  public static final SubLObject declare_kb_indexing_declarations_file() {
    declareMacro(myName, "do_kb_indices", "DO-KB-INDICES");
    declareFunction(myName, "kb_indexing_declaration_store", "KB-INDEXING-DECLARATION-STORE", 0, 0, false);
    declareFunction(myName, "clear_kb_indexing_declaration_store", "CLEAR-KB-INDEXING-DECLARATION-STORE", 0, 0, false);
    declareFunction(myName, "add_index_to_kb_indexing_declaration_store", "ADD-INDEX-TO-KB-INDEXING-DECLARATION-STORE", 2, 0, false);
    declareFunction(myName, "remove_index_from_kb_indexing_declaration_store", "REMOVE-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
    declareFunction(myName, "get_index_from_kb_indexing_declaration_store", "GET-INDEX-FROM-KB-INDEXING-DECLARATION-STORE", 1, 0, false);
    declareFunction(myName, "find_index_by_top_level_key", "FIND-INDEX-BY-TOP-LEVEL-KEY", 1, 0, false);
    declareFunction(myName, "get_index_key_prop", "GET-INDEX-KEY-PROP", 2, 1, false);
    declareFunction(myName, "get_index_prop", "GET-INDEX-PROP", 2, 0, false);
    declareFunction(myName, "declare_index", "DECLARE-INDEX", 2, 0, false);
    declareFunction(myName, "index_equality_test_for_keys", "INDEX-EQUALITY-TEST-FOR-KEYS", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_kb_indexing_declarations_file() {
    $default_intermediate_index_equal_test$ = deflexical("*DEFAULT-INTERMEDIATE-INDEX-EQUAL-TEST*", Symbols.symbol_function(EQ));
    $kb_indexing_declaration_store$ = deflexical("*KB-INDEXING-DECLARATION-STORE*", maybeDefault( $sym0$_KB_INDEXING_DECLARATION_STORE_, $kb_indexing_declaration_store$, ()-> (dictionary.new_dictionary(Symbols.symbol_function(EQ), UNPROVIDED))));
    return NIL;
  }

  public static final SubLObject setup_kb_indexing_declarations_file() {
        subl_macro_promotions.declare_defglobal($sym0$_KB_INDEXING_DECLARATION_STORE_);
    access_macros.register_macro_helper($sym7$KB_INDEXING_DECLARATION_STORE, $sym8$DO_KB_INDICES);
    declare_index($kw14$GAF_ARG, $list15);
    declare_index($kw16$NART_ARG, $list17);
    declare_index($kw18$PREDICATE_EXTENT, $list19);
    declare_index($kw20$FUNCTION_EXTENT, $list21);
    declare_index($kw22$PREDICATE_RULE, $list23);
    declare_index($kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE, $list25);
    declare_index($kw26$ISA_RULE, $list27);
    declare_index($kw28$QUOTED_ISA_RULE, $list29);
    declare_index($kw30$GENLS_RULE, $list31);
    declare_index($kw32$GENL_MT_RULE, $list33);
    declare_index($kw34$FUNCTION_RULE, $list35);
    declare_index($kw36$EXCEPTION_RULE, $list37);
    declare_index($kw38$PRAGMA_RULE, $list39);
    declare_index($kw40$MICROTHEORY_CONTENTS, $list41);
    declare_index($kw42$MISCELLANEOUS, $list43);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$_KB_INDEXING_DECLARATION_STORE_ = makeSymbol("*KB-INDEXING-DECLARATION-STORE*");
  public static final SubLList $list1 = list(list(makeSymbol("INDEX"), makeSymbol("PLIST"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list2 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw3$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw4$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym5$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");
  public static final SubLList $list6 = list(makeSymbol("KB-INDEXING-DECLARATION-STORE"));
  public static final SubLSymbol $sym7$KB_INDEXING_DECLARATION_STORE = makeSymbol("KB-INDEXING-DECLARATION-STORE");
  public static final SubLSymbol $sym8$DO_KB_INDICES = makeSymbol("DO-KB-INDICES");
  public static final SubLSymbol $kw9$TOP_LEVEL_KEY = makeKeyword("TOP-LEVEL-KEY");
  public static final SubLList $list10 = cons(makeSymbol("TOP-LEVEL-KEY"), makeSymbol("REST-KEYS"));
  public static final SubLString $str11$Could_not_find_an_index_with_top_ = makeString("Could not find an index with top-level key ~S");
  public static final SubLSymbol $kw12$KEYS = makeKeyword("KEYS");
  public static final SubLSymbol $kw13$EQUAL_TEST = makeKeyword("EQUAL-TEST");
  public static final SubLSymbol $kw14$GAF_ARG = makeKeyword("GAF-ARG");
  public static final SubLList $list15 = list(new SubLObject[] {makeKeyword("NAME"), makeString("GAF Arg"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GAF-ARG"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("argnum"), makeKeyword("VALIDITY-TEST"), makeSymbol("POSITIVE-INTEGER-P"), makeKeyword("EQUAL-TEST"), EQ), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-PRED?"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL})), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("gaf"), makeKeyword("VALIDITY-TEST"), makeSymbol("GAF-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A gaf assertion in mt MT with predicate PRED which mentions TERM\nin position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GAF-ARG-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GAF-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GAF-ARG-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GAF-ARG-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GAF-ARG-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GAF-ARG-SUBINDEX")});
  public static final SubLSymbol $kw16$NART_ARG = makeKeyword("NART-ARG");
  public static final SubLList $list17 = list(new SubLObject[] {makeKeyword("NAME"), makeString("NART Arg"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("NART-ARG"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("argnum"), makeKeyword("VALIDITY-TEST"), makeSymbol("POSITIVE-INTEGER-P"), makeKeyword("EQUAL-TEST"), EQ), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("tou-ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("TERM-OF-UNIT-ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC\nwhich mentions TERM in position ARGNUM")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-NART-ARG-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-NART-ARG-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-NART-ARG-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-NART-ARG-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-NART-ARG-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-NART-ARG-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-NART-ARG-SUBINDEX")});
  public static final SubLSymbol $kw18$PREDICATE_EXTENT = makeKeyword("PREDICATE-EXTENT");
  public static final SubLList $list19 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Predicate Extent"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-EXTENT"), makeKeyword("KEYS"), list(list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL})), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("gaf"), makeKeyword("VALIDITY-TEST"), makeSymbol("GAF-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A gaf assertion in mt MT with predicate PRED.")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PREDICATE-EXTENT-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PREDICATE-EXTENT-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PREDICATE-EXTENT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PREDICATE-EXTENT-SUBINDEX")});
  public static final SubLSymbol $kw20$FUNCTION_EXTENT = makeKeyword("FUNCTION-EXTENT");
  public static final SubLList $list21 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Function Extent"), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-EXTENT"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("tou-ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("TERM-OF-UNIT-ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("A #$termOfUnit assertion whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-FUNCTION-EXTENT-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-FUNCTION-EXTENT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-FUNCTION-EXTENT-SUBINDEX")});
  public static final SubLSymbol $kw22$PREDICATE_RULE = makeKeyword("PREDICATE-RULE");
  public static final SubLList $list23 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Predicate Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PREDICATE-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate PRED")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PREDICATE-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PREDICATE-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PREDICATE-RULE-SUBINDEX")});
  public static final SubLSymbol $kw24$DECONTEXTUALIZED_IST_PREDICATE_RULE = makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE");
  public static final SubLList $list25 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Decontextualized #$ist Predicate Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("pred"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("DECONTEXTUALIZED-IST-PREDICATE-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion with direction DIRECTION, which contains\na SENSE-lit wrapped in an #$ist with predicate PRED.  The mt of the rule is ignored.")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-DECONTEXTUALIZED-IST-PREDICATE-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-DECONTEXTUALIZED-IST-PREDICATE-RULE-SUBINDEX")});
  public static final SubLSymbol $kw26$ISA_RULE = makeKeyword("ISA-RULE");
  public static final SubLList $list27 = list(new SubLObject[] {makeKeyword("NAME"), makeString("#$isa Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("ISA-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$isa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-ISA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-ISA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-ISA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-ISA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-ISA-RULE-SUBINDEX")});
  public static final SubLSymbol $kw28$QUOTED_ISA_RULE = makeKeyword("QUOTED-ISA-RULE");
  public static final SubLList $list29 = list(new SubLObject[] {makeKeyword("NAME"), makeString("#$quotedIsa Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("QUOTED-ISA-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$quotedIsa and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-QUOTED-ISA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-QUOTED-ISA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-QUOTED-ISA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-QUOTED-ISA-RULE-SUBINDEX")});
  public static final SubLSymbol $kw30$GENLS_RULE = makeKeyword("GENLS-RULE");
  public static final SubLList $list31 = list(new SubLObject[] {makeKeyword("NAME"), makeString("#$genls Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("col"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENLS-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genls and arg2 COL")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GENLS-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENLS-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GENLS-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GENLS-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GENLS-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GENLS-RULE-SUBINDEX")});
  public static final SubLSymbol $kw32$GENL_MT_RULE = makeKeyword("GENL-MT-RULE");
  public static final SubLList $list33 = list(new SubLObject[] {makeKeyword("NAME"), makeString("#$genlMt Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("genl-mt"), makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("GENL-MT-RULE"), makeKeyword("KEYS"), list(list(makeKeyword("NAME"), makeString("sense"), makeKeyword("VALIDITY-TEST"), makeSymbol("SENSE-P"), makeKeyword("EQUAL-TEST"), EQ), list(new SubLObject[] {makeKeyword("NAME"), makeString("rule-mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt RULE-MT with direction DIRECTION, which contains\na SENSE-lit with predicate #$genlMt and arg2 GENL-MT")), makeKeyword("DUPLICATE-VALUES?"), T, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-GENL-MT-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-GENL-MT-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-GENL-MT-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-GENL-MT-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-GENL-MT-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-GENL-MT-RULE-SUBINDEX")});
  public static final SubLSymbol $kw34$FUNCTION_RULE = makeKeyword("FUNCTION-RULE");
  public static final SubLList $list35 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Function Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("func"), makeKeyword("VALIDITY-TEST"), makeSymbol("FORT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("FUNCTION-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na neg-lit whose predicate is #$termOfUnit and whose arg2 is a naut with functor FUNC")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-FUNCTION-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-FUNCTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-FUNCTION-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-FUNCTION-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-FUNCTION-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-FUNCTION-RULE-SUBINDEX")});
  public static final SubLSymbol $kw36$EXCEPTION_RULE = makeKeyword("EXCEPTION-RULE");
  public static final SubLList $list37 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Exception Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("EXCEPTION-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("exception-rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$abnormal and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-EXCEPTION-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-EXCEPTION-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-EXCEPTION-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-EXCEPTION-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-EXCEPTION-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-EXCEPTION-RULE-SUBINDEX")});
  public static final SubLSymbol $kw38$PRAGMA_RULE = makeKeyword("PRAGMA-RULE");
  public static final SubLList $list39 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Pragmatic Requirement Rules"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("PRAGMA-RULE"), makeKeyword("KEYS"), list(list(new SubLObject[] {makeKeyword("NAME"), makeString("mt"), makeKeyword("MT?"), T, makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P"), makeKeyword("RELEVANCE-TEST"), makeSymbol("RELEVANT-MT?"), makeKeyword("EQUAL-TEST"), EQUAL}), list(makeKeyword("NAME"), makeString("direction"), makeKeyword("VALIDITY-TEST"), makeSymbol("DIRECTION-P"), makeKeyword("EQUAL-TEST"), EQ)), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("pragma-rule"), makeKeyword("VALIDITY-TEST"), makeSymbol("RULE-ASSERTION?"), makeKeyword("DOCUMENTATION"), makeString("A rule assertion in mt MT with direction DIRECTION, which contains\na pos-lit whose predicate is #$meetsPragmaticRequirement and whose arg2 is RULE")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-PRAGMA-RULE-INDEX-WITH-CUTOFF"), makeKeyword("KEY-FUNCTION"), makeSymbol("KEY-PRAGMA-RULE-INDEX"), makeKeyword("RELEVANT-KEY-FUNCTION"), makeSymbol("RELEVANT-KEY-PRAGMA-RULE-INDEX"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-PRAGMA-RULE-INDEX"), makeKeyword("SIMPLE-KEY-FUNCTION"), makeSymbol("SIMPLE-KEY-PRAGMA-RULE-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-PRAGMA-RULE-SUBINDEX")});
  public static final SubLSymbol $kw40$MICROTHEORY_CONTENTS = makeKeyword("MICROTHEORY-CONTENTS");
  public static final SubLList $list41 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Microtheory Contents"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("mt"), makeKeyword("VALIDITY-TEST"), makeSymbol("HLMT-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("IST"), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("An assertion in mt MT")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-MT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-MT-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-MT-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-MT-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-MT-SUBINDEX")});
  public static final SubLSymbol $kw42$MISCELLANEOUS = makeKeyword("MISCELLANEOUS");
  public static final SubLList $list43 = list(new SubLObject[] {makeKeyword("NAME"), makeString("Miscellaneous"), makeKeyword("DOMAIN"), list(makeKeyword("NAME"), makeString("term"), makeKeyword("VALIDITY-TEST"), makeSymbol("INDEXED-TERM-P")), makeKeyword("TOP-LEVEL-KEY"), makeKeyword("OTHER"), makeKeyword("RANGE"), list(makeKeyword("NAME"), makeString("ass"), makeKeyword("VALIDITY-TEST"), makeSymbol("ASSERTION-P"), makeKeyword("DOCUMENTATION"), makeString("An assertion mentioning TERM but not indexed by any other means")), makeKeyword("DUPLICATE-VALUES?"), NIL, makeKeyword("NUM-FUNCTION"), makeSymbol("NUM-OTHER-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION"), makeSymbol("RELEVANT-NUM-OTHER-INDEX"), makeKeyword("RELEVANT-NUM-FUNCTION-WITH-CUTOFF"), makeSymbol("RELEVANT-NUM-OTHER-INDEX-WITH-CUTOFF"), makeKeyword("SIMPLE-MATCH-FUNCTION"), makeSymbol("MATCHES-OTHER-INDEX"), makeKeyword("GET-SUBINDEX-FUNCTION"), makeSymbol("GET-OTHER-SUBINDEX")});

  //// Initializers

  public void declareFunctions() {
    declare_kb_indexing_declarations_file();
  }

  public void initializeVariables() {
    init_kb_indexing_declarations_file();
  }

  public void runTopLevelForms() {
    setup_kb_indexing_declarations_file();
  }

}
