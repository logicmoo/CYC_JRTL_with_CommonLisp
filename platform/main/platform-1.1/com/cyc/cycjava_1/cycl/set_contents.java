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
import com.cyc.cycjava_1.cycl.cfasl;
import com.cyc.cycjava_1.cycl.constant_handles;
import com.cyc.cycjava_1.cycl.hash_table_utilities;
import com.cyc.cycjava_1.cycl.iteration;
import com.cyc.cycjava_1.cycl.keyhash;
import com.cyc.cycjava_1.cycl.keyhash_utilities;
import com.cyc.cycjava_1.cycl.list_utilities;
import com.cyc.cycjava_1.cycl.meta_macros;
import com.cyc.cycjava_1.cycl.number_utilities;
import com.cyc.cycjava_1.cycl.subl_macros;
import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class set_contents extends SubLTranslatedFile {

  //// Constructor

  private set_contents() {}
  public static final SubLFile me = new set_contents();
  public static final String myName = "com.cyc.cycjava_1.cycl.set_contents";

  //// Definitions

  @SubL(source = "cycl/set-contents.lisp", position = 829) 
  private static SubLSymbol $set_contents_grow_to_keyhash_size$ = null;

  @SubL(source = "cycl/set-contents.lisp", position = 1249) 
  private static SubLSymbol $set_contents_shrink_to_list_size$ = null;

  /** Return T iff ELEMENT can be unambiguously interpreted as a singleton. */
  @SubL(source = "cycl/set-contents.lisp", position = 1372) 
  public static final SubLObject set_contents_singleton_element_p(SubLObject element) {
    return makeBoolean((!((element.isList()
            || (NIL != keyhash.keyhash_p(element))))));
  }

  /** Return the current style of SET
   @return type-symbol. */
  @SubL(source = "cycl/set-contents.lisp", position = 1568) 
  public static final SubLObject set_contents_style(SubLObject v_set_contents) {
    if (v_set_contents.isList()) {
      return $kw2$LIST;
    } else if ((NIL != keyhash.keyhash_p(v_set_contents))) {
      return $kw3$KEYHASH;
    } else {
      return $kw4$SINGLETON;
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 2116) 
  public static final SubLObject set_contents_member_singleton_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    return Functions.funcall(test, element, v_set_contents);
  }

  @SubL(source = "cycl/set-contents.lisp", position = 2277) 
  public static final SubLObject set_contents_member_list_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    return subl_promotions.memberP(element, v_set_contents, test, UNPROVIDED);
  }

  @SubL(source = "cycl/set-contents.lisp", position = 2556) 
  public static final SubLObject set_contents_member_keyhash_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    return keyhash.getkeyhash(element, v_set_contents);
  }

  @SubL(source = "cycl/set-contents.lisp", position = 3506) 
  public static final SubLObject set_contents_add_singleton_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    {
      SubLObject already_thereP = set_contents_member_singleton_style(v_set_contents, element, test);
      if ((NIL == already_thereP)) {
        v_set_contents = list(element, v_set_contents);
      }
    }
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 3807) 
  public static final SubLObject set_contents_add_list_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    {
      SubLObject already_thereP = set_contents_member_list_style(v_set_contents, element, test);
      if ((NIL == already_thereP)) {
        if (((NIL == v_set_contents)
             && (NIL != set_contents_singleton_element_p(element)))) {
          v_set_contents = element;
        } else {
          v_set_contents = cons(element, v_set_contents);
          {
            SubLObject size = Sequences.length(v_set_contents);
            if (size.numG($set_contents_grow_to_keyhash_size$.getGlobalValue())) {
              v_set_contents = keyhash_utilities.keyhash_list_elements(v_set_contents, test, size);
            }
          }
        }
      }
    }
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 4409) 
  public static final SubLObject set_contents_add_keyhash_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    keyhash.setkeyhash(element, v_set_contents);
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 4613) 
  public static final SubLObject set_contents_delete_singleton_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    {
      SubLObject already_thereP = set_contents_member_singleton_style(v_set_contents, element, test);
      if ((NIL != already_thereP)) {
        v_set_contents = NIL;
      }
    }
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 4904) 
  public static final SubLObject set_contents_delete_list_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    v_set_contents = Sequences.delete(element, v_set_contents, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    if ((NIL != list_utilities.singletonP(v_set_contents))) {
      {
        SubLObject sole_element = v_set_contents.first();
        if ((NIL != set_contents_singleton_element_p(sole_element))) {
          v_set_contents = sole_element;
        }
      }
    }
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 5267) 
  public static final SubLObject set_contents_delete_keyhash_style(SubLObject v_set_contents, SubLObject element, SubLObject test) {
    {
      SubLObject already_thereP = set_contents_member_keyhash_style(v_set_contents, element, test);
      if ((NIL != already_thereP)) {
        keyhash.remkeyhash(element, v_set_contents);
        {
          SubLObject size = keyhash.keyhash_count(v_set_contents);
          if (size.numL($set_contents_shrink_to_list_size$.getGlobalValue())) {
            v_set_contents = keyhash_utilities.keyhash_element_list(v_set_contents);
          }
        }
      }
    }
    return v_set_contents;
  }

  /** Return T iff OBJECT can be interpreted as the contents of a set. */
  @SubL(source = "cycl/set-contents.lisp", position = 5711) 
  public static final SubLObject set_contents_p(SubLObject object) {
    return T;
  }

  /** Allocate a new set-contents.
  Assume that SIZE elements will likely be immediately added,
  with TEST as the assumed equality test.
  @return set-contents-p */
  @SubL(source = "cycl/set-contents.lisp", position = 6612) 
  public static final SubLObject new_set_contents(SubLObject size, SubLObject test) {
    if ((size == UNPROVIDED)) {
      size = ZERO_INTEGER;
    }
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(size, $sym7$NON_NEGATIVE_INTEGER_P);
    checkType(test, $sym8$VALID_HASH_TEST_P);
    if (size.numG($set_contents_grow_to_keyhash_size$.getGlobalValue())) {
      return keyhash.new_keyhash(size, test);
    } else {
      return NIL;
    }
  }

  /** Return a new copy of SET-CONTENTS.
   TEST is the assumed equality test.
   @return set-contents-p */
  @SubL(source = "cycl/set-contents.lisp", position = 7075) 
  public static final SubLObject copy_set_contents(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return v_set_contents;
      } else if (pcase_var.eql($kw2$LIST)) {
        return conses_high.copy_list(v_set_contents);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31676");
      }
    }
    return NIL;
  }

  /** Return the number of items currently entered in SET.
   @return non-negative-integer-p. */
  @SubL(source = "cycl/set-contents.lisp", position = 7451) 
  public static final SubLObject set_contents_size(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return ONE_INTEGER;
      } else if (pcase_var.eql($kw2$LIST)) {
        return Sequences.length(v_set_contents);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return keyhash.keyhash_count(v_set_contents);
      }
    }
    return NIL;
  }

  public static final class $set_contents_size$UnaryFunction extends UnaryFunction {
    public $set_contents_size$UnaryFunction() { super(extractFunctionNamed("SET-CONTENTS-SIZE")); }
    public SubLObject processItem(SubLObject arg1) { return set_contents_size(arg1); }
  }

  /** @return booleanp; non-nil iff SET-CONTENTS is empty, nil otherwise */
  @SubL(source = "cycl/set-contents.lisp", position = 7843) 
  public static final SubLObject set_contents_emptyP(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return NIL;
      } else if (pcase_var.eql($kw2$LIST)) {
        return Types.sublisp_null(v_set_contents);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return Numbers.zerop(keyhash.keyhash_count(v_set_contents));
      }
    }
    return NIL;
  }

  /** @return booleanp; non-nil iff SET-CONTENTS has exactly one element */
  @SubL(source = "cycl/set-contents.lisp", position = 8184) 
  public static final SubLObject set_contents_singletonP(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return T;
      } else if (pcase_var.eql($kw2$LIST)) {
        return NIL;
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return NIL;
      }
    }
    return NIL;
  }

  /** @return boolean; t iff ELEMENT is in SET-CONTENTS.
   TEST is the assumed equality test. */
  @SubL(source = "cycl/set-contents.lisp", position = 8478) 
  public static final SubLObject set_contents_memberP(SubLObject element, SubLObject v_set_contents, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return set_contents_member_singleton_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw2$LIST)) {
        return set_contents_member_list_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return set_contents_member_keyhash_style(v_set_contents, element, test);
      }
    }
    return NIL;
  }

  /** Add this ELEMENT into the SET-CONTENTS.
   TEST is the assumed equality test.
   @return updated SET-CONTENTS */
  @SubL(source = "cycl/set-contents.lisp", position = 10920) 
  public static final SubLObject set_contents_add(SubLObject element, SubLObject v_set_contents, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(test, $sym8$VALID_HASH_TEST_P);
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return set_contents_add_singleton_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw2$LIST)) {
        return set_contents_add_list_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return set_contents_add_keyhash_style(v_set_contents, element, test);
      }
    }
    return NIL;
  }

  /** If ELEMENT is present in SET-CONTENTS, then take it out of SET-CONTENTS.
   TEST is the assumed equality test.
   @return updated SET-CONTENTS */
  @SubL(source = "cycl/set-contents.lisp", position = 11532) 
  public static final SubLObject set_contents_delete(SubLObject element, SubLObject v_set_contents, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(test, $sym8$VALID_HASH_TEST_P);
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return set_contents_delete_singleton_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw2$LIST)) {
        return set_contents_delete_list_style(v_set_contents, element, test);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return set_contents_delete_keyhash_style(v_set_contents, element, test);
      }
    }
    return NIL;
  }

  /** Reset SET-CONTENTS to the status of being just allocated.
   @return set-contents-p */
  @SubL(source = "cycl/set-contents.lisp", position = 12149) 
  public static final SubLObject clear_set_contents(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw3$KEYHASH)) {
        keyhash.clrkeyhash(v_set_contents);
      }
    }
    return new_set_contents(ZERO_INTEGER, UNPROVIDED);
  }

  /** Returns an iterator for the elements of SET-CONTENTS. */
  @SubL(source = "cycl/set-contents.lisp", position = 12446) 
  public static final SubLObject new_set_contents_iterator(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return iteration.new_list_iterator(list(v_set_contents));
      } else if (pcase_var.eql($kw2$LIST)) {
        return iteration.new_list_iterator(v_set_contents);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 31683");
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 14008) 
  public static final SubLObject do_set_contents_basis_object(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return v_set_contents;
      } else if (pcase_var.eql($kw2$LIST)) {
        return v_set_contents;
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return keyhash.do_keyhash_nodes(v_set_contents);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 14374) 
  public static final SubLObject do_set_contents_initial_state(SubLObject basis_object, SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return $kw27$NOT_DONE;
      } else if (pcase_var.eql($kw2$LIST)) {
        return basis_object;
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return ZERO_INTEGER;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 14697) 
  public static final SubLObject do_set_contents_update_state(SubLObject state) {
    if (state.isKeyword()) {
      return $kw12$DONE;
    } else if (state.isList()) {
      return state.rest();
    } else {
      return number_utilities.f_1X(state);
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 15024) 
  public static final SubLObject do_set_contents_doneP(SubLObject basis_object, SubLObject state) {
    if (state.isKeyword()) {
      return Equality.eq($kw12$DONE, state);
    } else if (state.isList()) {
      return Types.sublisp_null(state);
    } else {
      return Numbers.numE(state, Sequences.length(basis_object));
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 15410) 
  public static final SubLObject do_set_contents_next(SubLObject basis_object, SubLObject state) {
    if (($kw27$NOT_DONE == state)) {
      return basis_object;
    } else if (state.isList()) {
      return state.first();
    } else {
      return Vectors.aref(basis_object, state);
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 15786) 
  public static final SubLObject do_set_contents_element_validP(SubLObject state, SubLObject element) {
    if (($kw27$NOT_DONE == state)) {
      return T;
    } else if (state.isList()) {
      return T;
    } else {
      return keyhash.do_keyhash_valid_key_p(element);
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 16579) 
  public static final SubLObject cfasl_input_set_contents(SubLObject stream, SubLObject v_set_contents, SubLObject size, SubLObject test) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return cfasl_input_set_contents_singleton_style(stream, v_set_contents, size, test);
      } else if (pcase_var.eql($kw2$LIST)) {
        return cfasl_input_set_contents_list_style(stream, v_set_contents, size, test);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return cfasl_input_set_contents_keyhash_style(stream, v_set_contents, size, test);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 17135) 
  public static final SubLObject cfasl_input_set_contents_singleton_style(SubLObject stream, SubLObject v_set_contents, SubLObject size, SubLObject test) {
    if ((!(ONE_INTEGER.numE(size)))) {
      return cfasl_input_set_contents_logically(stream, v_set_contents, size, test);
    }
    {
      SubLObject element = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
      if ((NIL != set_contents_singleton_element_p(element))) {
        v_set_contents = element;
      } else {
        v_set_contents = ConsesLow.make_list(ONE_INTEGER, NIL);
        ConsesLow.rplaca(v_set_contents, element);
      }
      return v_set_contents;
    }
  }

  @SubL(source = "cycl/set-contents.lisp", position = 17630) 
  public static final SubLObject cfasl_input_set_contents_list_style(SubLObject stream, SubLObject v_set_contents, SubLObject size, SubLObject test) {
    if (ONE_INTEGER.numE(size)) {
      return cfasl_input_set_contents_singleton_style(stream, v_set_contents, size, test);
    }
    v_set_contents = ConsesLow.make_list(size, NIL);
    {
      SubLObject cons = NIL;
      for (cons = v_set_contents; (!(cons.isAtom())); cons = cons.rest()) {
        {
          SubLObject element = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          ConsesLow.rplaca(cons, element);
        }
      }
    }
    return v_set_contents;
  }

  @SubL(source = "cycl/set-contents.lisp", position = 18070) 
  public static final SubLObject cfasl_input_set_contents_keyhash_style(SubLObject stream, SubLObject v_set_contents, SubLObject size, SubLObject test) {
    return cfasl_input_set_contents_logically(stream, v_set_contents, size, test);
  }

  @SubL(source = "cycl/set-contents.lisp", position = 18234) 
  public static final SubLObject cfasl_input_set_contents_logically(SubLObject stream, SubLObject v_set_contents, SubLObject size, SubLObject test) {
    {
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(size); i = Numbers.add(i, ONE_INTEGER)) {
        {
          SubLObject element = cfasl.cfasl_input(stream, UNPROVIDED, UNPROVIDED);
          v_set_contents = set_contents_add(element, v_set_contents, test);
        }
      }
    }
    return v_set_contents;
  }

  /** @return list; a list of the elements of SET-CONTENTS. */
  @SubL(source = "cycl/set-contents.lisp", position = 18485) 
  public static final SubLObject set_contents_element_list(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if (pcase_var.eql($kw4$SINGLETON)) {
        return list(v_set_contents);
      } else if (pcase_var.eql($kw2$LIST)) {
        return conses_high.copy_list(v_set_contents);
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        return keyhash_utilities.keyhash_element_list(v_set_contents);
      }
    }
    return NIL;
  }

  /** Rehashes SET-CONTENTS if it's keyhash style */
  @SubL(source = "cycl/set-contents.lisp", position = 19148) 
  public static final SubLObject set_contents_rebuild(SubLObject v_set_contents) {
    {
      SubLObject pcase_var = set_contents_style(v_set_contents);
      if ((pcase_var.eql($kw4$SINGLETON)
          || pcase_var.eql($kw2$LIST))) {
      } else if (pcase_var.eql($kw3$KEYHASH)) {
        keyhash_utilities.keyhash_rebuild(v_set_contents);
      }
    }
    return v_set_contents;
  }

  public static final SubLObject declare_set_contents_file() {
    declareFunction(myName, "set_contents_singleton_element_p", "SET-CONTENTS-SINGLETON-ELEMENT-P", 1, 0, false);
    declareFunction(myName, "set_contents_style", "SET-CONTENTS-STYLE", 1, 0, false);
    declareFunction(myName, "set_contents_member_singleton_style", "SET-CONTENTS-MEMBER-SINGLETON-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_member_list_style", "SET-CONTENTS-MEMBER-LIST-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_nmember_list_style", "SET-CONTENTS-NMEMBER-LIST-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_member_keyhash_style", "SET-CONTENTS-MEMBER-KEYHASH-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_matching_element_singleton_style", "SET-CONTENTS-MATCHING-ELEMENT-SINGLETON-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_matching_element_list_style", "SET-CONTENTS-MATCHING-ELEMENT-LIST-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_matching_element_keyhash_style", "SET-CONTENTS-MATCHING-ELEMENT-KEYHASH-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_add_singleton_style", "SET-CONTENTS-ADD-SINGLETON-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_add_list_style", "SET-CONTENTS-ADD-LIST-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_add_keyhash_style", "SET-CONTENTS-ADD-KEYHASH-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_delete_singleton_style", "SET-CONTENTS-DELETE-SINGLETON-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_delete_list_style", "SET-CONTENTS-DELETE-LIST-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_delete_keyhash_style", "SET-CONTENTS-DELETE-KEYHASH-STYLE", 3, 0, false);
    declareFunction(myName, "set_contents_p", "SET-CONTENTS-P", 1, 0, false);
    declareFunction(myName, "set_contents_of_type_p", "SET-CONTENTS-OF-TYPE-P", 2, 0, false);
    declareFunction(myName, "new_set_contents", "NEW-SET-CONTENTS", 0, 2, false);
    declareFunction(myName, "copy_set_contents", "COPY-SET-CONTENTS", 1, 0, false);
    declareFunction(myName, "set_contents_size", "SET-CONTENTS-SIZE", 1, 0, false); new $set_contents_size$UnaryFunction();
    declareFunction(myName, "set_contents_emptyP", "SET-CONTENTS-EMPTY?", 1, 0, false);
    declareFunction(myName, "set_contents_singletonP", "SET-CONTENTS-SINGLETON?", 1, 0, false);
    declareFunction(myName, "set_contents_memberP", "SET-CONTENTS-MEMBER?", 2, 1, false);
    declareFunction(myName, "set_contents_nmemberP", "SET-CONTENTS-NMEMBER?", 2, 1, false);
    declareFunction(myName, "set_contents_matching_element", "SET-CONTENTS-MATCHING-ELEMENT", 2, 1, false);
    declareFunction(myName, "set_contents_random_element", "SET-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
    declareFunction(myName, "singleton_set_contents_element", "SINGLETON-SET-CONTENTS-ELEMENT", 1, 0, false);
    declareFunction(myName, "set_contents_add", "SET-CONTENTS-ADD", 2, 1, false);
    declareFunction(myName, "set_contents_delete", "SET-CONTENTS-DELETE", 2, 1, false);
    declareFunction(myName, "clear_set_contents", "CLEAR-SET-CONTENTS", 1, 0, false);
    declareFunction(myName, "new_set_contents_iterator", "NEW-SET-CONTENTS-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_set_contents", "DO-SET-CONTENTS");
    declareFunction(myName, "do_set_contents_basis_object", "DO-SET-CONTENTS-BASIS-OBJECT", 1, 0, false);
    declareFunction(myName, "do_set_contents_initial_state", "DO-SET-CONTENTS-INITIAL-STATE", 2, 0, false);
    declareFunction(myName, "do_set_contents_update_state", "DO-SET-CONTENTS-UPDATE-STATE", 1, 0, false);
    declareFunction(myName, "do_set_contents_doneP", "DO-SET-CONTENTS-DONE?", 2, 0, false);
    declareFunction(myName, "do_set_contents_next", "DO-SET-CONTENTS-NEXT", 2, 0, false);
    declareFunction(myName, "do_set_contents_element_validP", "DO-SET-CONTENTS-ELEMENT-VALID?", 2, 0, false);
    declareFunction(myName, "map_set_contents", "MAP-SET-CONTENTS", 2, 1, false);
    declareFunction(myName, "cfasl_input_set_contents", "CFASL-INPUT-SET-CONTENTS", 4, 0, false);
    declareFunction(myName, "cfasl_input_set_contents_singleton_style", "CFASL-INPUT-SET-CONTENTS-SINGLETON-STYLE", 4, 0, false);
    declareFunction(myName, "cfasl_input_set_contents_list_style", "CFASL-INPUT-SET-CONTENTS-LIST-STYLE", 4, 0, false);
    declareFunction(myName, "cfasl_input_set_contents_keyhash_style", "CFASL-INPUT-SET-CONTENTS-KEYHASH-STYLE", 4, 0, false);
    declareFunction(myName, "cfasl_input_set_contents_logically", "CFASL-INPUT-SET-CONTENTS-LOGICALLY", 4, 0, false);
    declareFunction(myName, "set_contents_element_list", "SET-CONTENTS-ELEMENT-LIST", 1, 0, false);
    declareFunction(myName, "set_contents_rebuild", "SET-CONTENTS-REBUILD", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_set_contents_file() {
    $set_contents_grow_to_keyhash_size$ = deflexical("*SET-CONTENTS-GROW-TO-KEYHASH-SIZE*", $int0$128);
    $set_contents_shrink_to_list_size$ = deflexical("*SET-CONTENTS-SHRINK-TO-LIST-SIZE*", $int1$110);
    return NIL;
  }

  public static final SubLObject setup_set_contents_file() {
    // CVS_ID("Id: set-contents.lisp 126640 2008-12-04 13:39:36Z builder ");
    access_macros.register_macro_helper($sym17$DO_SET_CONTENTS_BASIS_OBJECT, $sym26$DO_SET_CONTENTS);
    access_macros.register_macro_helper($sym19$DO_SET_CONTENTS_INITIAL_STATE, $sym26$DO_SET_CONTENTS);
    access_macros.register_macro_helper($sym20$DO_SET_CONTENTS_UPDATE_STATE, $sym26$DO_SET_CONTENTS);
    access_macros.register_macro_helper($sym22$DO_SET_CONTENTS_DONE_, $sym26$DO_SET_CONTENTS);
    access_macros.register_macro_helper($sym23$DO_SET_CONTENTS_NEXT, $sym26$DO_SET_CONTENTS);
    access_macros.register_macro_helper($sym25$DO_SET_CONTENTS_ELEMENT_VALID_, $sym26$DO_SET_CONTENTS);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$128 = makeInteger(128);
  public static final SubLInteger $int1$110 = makeInteger(110);
  public static final SubLSymbol $kw2$LIST = makeKeyword("LIST");
  public static final SubLSymbol $kw3$KEYHASH = makeKeyword("KEYHASH");
  public static final SubLSymbol $kw4$SINGLETON = makeKeyword("SINGLETON");
  public static final SubLString $str5$Keyhash_test_conflict___S_and__S = makeString("Keyhash test conflict: ~S and ~S");
  public static final SubLSymbol $sym6$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym7$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $sym8$VALID_HASH_TEST_P = makeSymbol("VALID-HASH-TEST-P");
  public static final SubLList $list9 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list10 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw11$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw12$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym13$SET_CONTENTS_VAR = makeUninternedSymbol("SET-CONTENTS-VAR");
  public static final SubLSymbol $sym14$BASIS_OBJECT = makeUninternedSymbol("BASIS-OBJECT");
  public static final SubLSymbol $sym15$STATE = makeUninternedSymbol("STATE");
  public static final SubLSymbol $sym16$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym17$DO_SET_CONTENTS_BASIS_OBJECT = makeSymbol("DO-SET-CONTENTS-BASIS-OBJECT");
  public static final SubLSymbol $sym18$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym19$DO_SET_CONTENTS_INITIAL_STATE = makeSymbol("DO-SET-CONTENTS-INITIAL-STATE");
  public static final SubLSymbol $sym20$DO_SET_CONTENTS_UPDATE_STATE = makeSymbol("DO-SET-CONTENTS-UPDATE-STATE");
  public static final SubLSymbol $sym21$COR = makeSymbol("COR");
  public static final SubLSymbol $sym22$DO_SET_CONTENTS_DONE_ = makeSymbol("DO-SET-CONTENTS-DONE?");
  public static final SubLSymbol $sym23$DO_SET_CONTENTS_NEXT = makeSymbol("DO-SET-CONTENTS-NEXT");
  public static final SubLSymbol $sym24$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym25$DO_SET_CONTENTS_ELEMENT_VALID_ = makeSymbol("DO-SET-CONTENTS-ELEMENT-VALID?");
  public static final SubLSymbol $sym26$DO_SET_CONTENTS = makeSymbol("DO-SET-CONTENTS");
  public static final SubLSymbol $kw27$NOT_DONE = makeKeyword("NOT-DONE");

  //// Initializers

  public void declareFunctions() {
    declare_set_contents_file();
  }

  public void initializeVariables() {
    init_set_contents_file();
  }

  public void runTopLevelForms() {
    setup_set_contents_file();
  }

}
