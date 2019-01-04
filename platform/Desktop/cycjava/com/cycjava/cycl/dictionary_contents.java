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

package  com.cyc.cycjava.cycl;

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


import com.cyc.cycjava.cycl.access_macros;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.subl_macros;

public  final class dictionary_contents extends SubLTranslatedFile {

  //// Constructor

  private dictionary_contents() {}
  public static final SubLFile me = new dictionary_contents();
  public static final String myName = "com.cyc.cycjava.cycl.dictionary_contents";

  //// Definitions

  @SubL(source = "cycl/dictionary-contents.lisp", position = 2365) 
  private static SubLSymbol $dictionary_contents_high_water_mark$ = null;

  @SubL(source = "cycl/dictionary-contents.lisp", position = 2690) 
  private static SubLSymbol $dictionary_contents_low_water_mark$ = null;

  /** Return the current style of DICTIONARY-CONTENTS
   @return type-symbol. */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 2830) 
  public static final SubLObject dictionary_contents_style(SubLObject v_dictionary_contents) {
    if ((NIL != list_utilities.alist_p(v_dictionary_contents))) {
      return $kw2$ALIST;
    } else if (v_dictionary_contents.isHashtable()) {
      return $kw3$HASHTABLE;
    } else {
      return $kw4$UNKNOWN;
    }
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 3700) 
  public static final SubLObject dictionary_contents_lookup_alist_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
    return list_utilities.alist_lookup(v_dictionary_contents, key, test, not_found);
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 3860) 
  public static final SubLObject dictionary_contents_lookup_without_values_alist_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
    return list_utilities.alist_lookup_without_values(v_dictionary_contents, key, test, not_found);
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 4242) 
  public static final SubLObject dictionary_contents_enter_alist_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
    {
      SubLObject pair = conses_high.assoc(key, v_dictionary_contents, test, UNPROVIDED);
      if ((NIL != pair)) {
        ConsesLow.rplacd(pair, value);
      } else {
        v_dictionary_contents = cons(cons(key, value), v_dictionary_contents);
        if (Sequences.length(v_dictionary_contents).numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
          v_dictionary_contents = list_utilities.alist_to_hash_table(v_dictionary_contents, test);
        }
      }
    }
    return v_dictionary_contents;
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 5106) 
  public static final SubLObject dictionary_contents_lookup_hashtable_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash(key, v_dictionary_contents, not_found);
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 5255) 
  public static final SubLObject dictionary_contents_lookup_without_values_hashtable_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject not_found) {
    return Hashtables.gethash_without_values(key, v_dictionary_contents, not_found);
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 5434) 
  public static final SubLObject dictionary_contents_enter_hashtable_style(SubLObject v_dictionary_contents, SubLObject key, SubLObject value) {
    Hashtables.sethash(key, v_dictionary_contents, value);
    return v_dictionary_contents;
  }

  /** Allocate a new dictionary-contents with TEST as the equality test.
  Assume that SIZE elements will likely be immediately added.
  @return dictionary-contents */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 6288) 
  public static final SubLObject new_dictionary_contents(SubLObject size, SubLObject test) {
    if ((size == UNPROVIDED)) {
      size = ZERO_INTEGER;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if (size.numG($dictionary_contents_high_water_mark$.getGlobalValue())) {
      return Hashtables.make_hash_table(size, test, UNPROVIDED);
    } else {
      return NIL;
    }
  }

  /** Return T iff DICTIONARY-CONTENTS is empty. */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 7730) 
  public static final SubLObject dictionary_contents_empty_p(SubLObject v_dictionary_contents) {
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return Types.sublisp_null(v_dictionary_contents);
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return Numbers.zerop(Hashtables.hash_table_count(v_dictionary_contents));
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31614");
      }
    }
  }

  /** Return the value mapped from KEY in DICTIONARY-CONTENTS.
   TEST is the assumed equality test.
   Return the formal NOT-FOUND if there was no entry.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 8379) 
  public static final SubLObject dictionary_contents_lookup(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return dictionary_contents_lookup_alist_style(v_dictionary_contents, key, test, not_found);
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return dictionary_contents_lookup_hashtable_style(v_dictionary_contents, key, not_found);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31615");
      }
    }
  }

  /** Return the value mapped from KEY in DICTIONARY-CONTENTS.
   TEST is the assumed equality test.
   Return the formal NOT-FOUND if there was no entry.
   Unlike DICTIONARY-CONTENTS-LOOKUP, only 1 value is returned. */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 9114) 
  public static final SubLObject dictionary_contents_lookup_without_values(SubLObject v_dictionary_contents, SubLObject key, SubLObject test, SubLObject not_found) {
    if ((not_found == UNPROVIDED)) {
      not_found = NIL;
    }
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return dictionary_contents_lookup_without_values_alist_style(v_dictionary_contents, key, test, not_found);
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return dictionary_contents_lookup_without_values_hashtable_style(v_dictionary_contents, key, not_found);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31616");
      }
    }
  }

  /** Note that KEY maps to VALUE in DICTIONARY-CONTENTS.
   TEST is the assumed equality test.
   @return updated DICTIONARY-CONTENTS */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 10580) 
  public static final SubLObject dictionary_contents_enter(SubLObject v_dictionary_contents, SubLObject key, SubLObject value, SubLObject test) {
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return dictionary_contents_enter_alist_style(v_dictionary_contents, key, value, test);
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return dictionary_contents_enter_hashtable_style(v_dictionary_contents, key, value);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31617");
      }
    }
  }

  /** Reset DICTIONARY-CONTENTS to the status of being just allocated.
   @return dictionary-contents-p */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 11823) 
  public static final SubLObject clear_dictionary_contents(SubLObject v_dictionary_contents) {
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw3$HASHTABLE)) {
        Hashtables.clrhash(v_dictionary_contents);
      }
    }
    return new_dictionary_contents(ZERO_INTEGER, UNPROVIDED);
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 13721) 
  public static final SubLObject do_dictionary_contents_state(SubLObject v_dictionary_contents) {
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return v_dictionary_contents;
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return hashtables_high.make_hash_table_iterator(v_dictionary_contents);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31619");
      }
    }
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 14099) 
  public static final SubLObject do_dictionary_contents_key_value(SubLObject state) {
    if (state.isList()) {
      {
        SubLObject key_value_pair = state.first();
        SubLObject key = key_value_pair.first();
        SubLObject value = key_value_pair.rest();
        return Values.values(key, value);
      }
    } else {
      {
        SubLObject key = hashtables_high.hash_table_iterator_key(state);
        SubLObject value = hashtables_high.hash_table_iterator_value(state);
        return Values.values(key, value);
      }
    }
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 14506) 
  public static final SubLObject do_dictionary_contents_next(SubLObject state) {
    if (state.isList()) {
      return state.rest();
    } else {
      return hashtables_high.hash_table_iterator_next(state);
    }
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 14683) 
  public static final SubLObject do_dictionary_contents_doneP(SubLObject state) {
    if (state.isList()) {
      return Types.sublisp_null(state);
    } else {
      return hashtables_high.hash_table_iterator_done_p(state);
    }
  }

  @SubL(source = "cycl/dictionary-contents.lisp", position = 14864) 
  public static final SubLObject do_dictionary_contents_finalize(SubLObject state) {
    if ((NIL != hashtables_high.hash_table_iterator_p(state))) {
      hashtables_high.destroy_hash_table_iterator(state);
    }
    return NIL;
  }

  /** @return list; a list of all keys of DICTIONARY-CONTENTS */
  @SubL(source = "cycl/dictionary-contents.lisp", position = 15551) 
  public static final SubLObject dictionary_contents_keys(SubLObject v_dictionary_contents) {
    {
      SubLObject pcase_var = dictionary_contents_style(v_dictionary_contents);
      if (pcase_var.eql($kw2$ALIST)) {
        return list_utilities.alist_keys(v_dictionary_contents);
      } else if (pcase_var.eql($kw3$HASHTABLE)) {
        return hash_table_utilities.hash_table_keys(v_dictionary_contents);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31620");
      }
    }
  }

  public static final SubLObject declare_dictionary_contents_file() {
    declareFunction(myName, "dictionary_contents_style", "DICTIONARY-CONTENTS-STYLE", 1, 0, false);
    declareFunction(myName, "dictionary_contents_style_error", "DICTIONARY-CONTENTS-STYLE-ERROR", 1, 0, false);
    declareFunction(myName, "dictionary_contents_lookup_alist_style", "DICTIONARY-CONTENTS-LOOKUP-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_contents_lookup_without_values_alist_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_contents_nlookup_without_values_alist_style", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_contents_enter_alist_style", "DICTIONARY-CONTENTS-ENTER-ALIST-STYLE", 4, 0, false);
    declareFunction(myName, "dictionary_contents_delete_alist_style", "DICTIONARY-CONTENTS-DELETE-ALIST-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_contents_lookup_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_contents_lookup_without_values_hashtable_style", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_contents_enter_hashtable_style", "DICTIONARY-CONTENTS-ENTER-HASHTABLE-STYLE", 3, 0, false);
    declareFunction(myName, "dictionary_contents_delete_hashtable_style", "DICTIONARY-CONTENTS-DELETE-HASHTABLE-STYLE", 2, 0, false);
    declareFunction(myName, "dictionary_contents_p", "DICTIONARY-CONTENTS-P", 1, 0, false);
    declareFunction(myName, "new_dictionary_contents", "NEW-DICTIONARY-CONTENTS", 0, 2, false);
    declareFunction(myName, "copy_dictionary_contents", "COPY-DICTIONARY-CONTENTS", 1, 0, false);
    declareFunction(myName, "dictionary_contents_size", "DICTIONARY-CONTENTS-SIZE", 1, 0, false);
    declareFunction(myName, "dictionary_contents_empty_p", "DICTIONARY-CONTENTS-EMPTY-P", 1, 0, false);
    declareFunction(myName, "non_empty_dictionary_contents_p", "NON-EMPTY-DICTIONARY-CONTENTS-P", 1, 0, false);
    declareFunction(myName, "dictionary_contents_lookup", "DICTIONARY-CONTENTS-LOOKUP", 3, 1, false);
    declareFunction(myName, "dictionary_contents_lookup_without_values", "DICTIONARY-CONTENTS-LOOKUP-WITHOUT-VALUES", 3, 1, false);
    declareFunction(myName, "dictionary_contents_nlookup_without_values", "DICTIONARY-CONTENTS-NLOOKUP-WITHOUT-VALUES", 3, 1, false);
    declareFunction(myName, "dictionary_contents_enter", "DICTIONARY-CONTENTS-ENTER", 4, 0, false);
    declareFunction(myName, "dictionary_contents_delete", "DICTIONARY-CONTENTS-DELETE", 3, 0, false);
    declareFunction(myName, "clear_dictionary_contents", "CLEAR-DICTIONARY-CONTENTS", 1, 0, false);
    declareFunction(myName, "new_dictionary_contents_iterator", "NEW-DICTIONARY-CONTENTS-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_dictionary_contents", "DO-DICTIONARY-CONTENTS");
    declareFunction(myName, "do_dictionary_contents_state", "DO-DICTIONARY-CONTENTS-STATE", 1, 0, false);
    declareFunction(myName, "do_dictionary_contents_key_value", "DO-DICTIONARY-CONTENTS-KEY-VALUE", 1, 0, false);
    declareFunction(myName, "do_dictionary_contents_next", "DO-DICTIONARY-CONTENTS-NEXT", 1, 0, false);
    declareFunction(myName, "do_dictionary_contents_doneP", "DO-DICTIONARY-CONTENTS-DONE?", 1, 0, false);
    declareFunction(myName, "do_dictionary_contents_finalize", "DO-DICTIONARY-CONTENTS-FINALIZE", 1, 0, false);
    declareFunction(myName, "map_dictionary_contents", "MAP-DICTIONARY-CONTENTS", 2, 1, false);
    declareFunction(myName, "dictionary_contents_keys", "DICTIONARY-CONTENTS-KEYS", 1, 0, false);
    declareFunction(myName, "dictionary_contents_values", "DICTIONARY-CONTENTS-VALUES", 1, 0, false);
    declareFunction(myName, "dictionary_contents_random_key", "DICTIONARY-CONTENTS-RANDOM-KEY", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_dictionary_contents_file() {
    $dictionary_contents_high_water_mark$ = deflexical("*DICTIONARY-CONTENTS-HIGH-WATER-MARK*", $int0$40);
    $dictionary_contents_low_water_mark$ = deflexical("*DICTIONARY-CONTENTS-LOW-WATER-MARK*", $int1$30);
    return NIL;
  }

  public static final SubLObject setup_dictionary_contents_file() {
    // CVS_ID("Id: dictionary-contents.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym12$DO_DICTIONARY_CONTENTS_STATE, $sym21$DO_DICTIONARY_CONTENTS);
    access_macros.register_macro_helper($sym17$DO_DICTIONARY_CONTENTS_KEY_VALUE, $sym22$DO_DICTIONARY);
    access_macros.register_macro_helper($sym19$DO_DICTIONARY_CONTENTS_NEXT, $sym22$DO_DICTIONARY);
    access_macros.register_macro_helper($sym15$DO_DICTIONARY_CONTENTS_DONE_, $sym22$DO_DICTIONARY);
    access_macros.register_macro_helper($sym20$DO_DICTIONARY_CONTENTS_FINALIZE, $sym22$DO_DICTIONARY);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$40 = makeInteger(40);
  public static final SubLInteger $int1$30 = makeInteger(30);
  public static final SubLSymbol $kw2$ALIST = makeKeyword("ALIST");
  public static final SubLSymbol $kw3$HASHTABLE = makeKeyword("HASHTABLE");
  public static final SubLSymbol $kw4$UNKNOWN = makeKeyword("UNKNOWN");
  public static final SubLString $str5$Corrupted_dictionary_contents__un = makeString("Corrupted dictionary-contents; unsupported style ~S.~%");
  public static final SubLList $list6 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("DICTIONARY-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list7 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw8$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw9$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym10$ITERATION_STATE = makeUninternedSymbol("ITERATION-STATE");
  public static final SubLSymbol $sym11$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym12$DO_DICTIONARY_CONTENTS_STATE = makeSymbol("DO-DICTIONARY-CONTENTS-STATE");
  public static final SubLSymbol $sym13$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym14$COR = makeSymbol("COR");
  public static final SubLSymbol $sym15$DO_DICTIONARY_CONTENTS_DONE_ = makeSymbol("DO-DICTIONARY-CONTENTS-DONE?");
  public static final SubLSymbol $sym16$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym17$DO_DICTIONARY_CONTENTS_KEY_VALUE = makeSymbol("DO-DICTIONARY-CONTENTS-KEY-VALUE");
  public static final SubLSymbol $sym18$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym19$DO_DICTIONARY_CONTENTS_NEXT = makeSymbol("DO-DICTIONARY-CONTENTS-NEXT");
  public static final SubLSymbol $sym20$DO_DICTIONARY_CONTENTS_FINALIZE = makeSymbol("DO-DICTIONARY-CONTENTS-FINALIZE");
  public static final SubLSymbol $sym21$DO_DICTIONARY_CONTENTS = makeSymbol("DO-DICTIONARY-CONTENTS");
  public static final SubLSymbol $sym22$DO_DICTIONARY = makeSymbol("DO-DICTIONARY");

  //// Initializers

  public void declareFunctions() {
    declare_dictionary_contents_file();
  }

  public void initializeVariables() {
    init_dictionary_contents_file();
  }

  public void runTopLevelForms() {
    setup_dictionary_contents_file();
  }

}
