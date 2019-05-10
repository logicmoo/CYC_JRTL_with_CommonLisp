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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.queues;
//dm import com.cyc.cycjava_1.cycl.stacks;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;

public  final class tries extends SubLTranslatedFile {

  //// Constructor

  private tries() {}
  public static final SubLFile me = new tries();
  public static final String myName = "com.cyc.cycjava_1.cycl.tries";

  //// Definitions

  /** Special variable used when gathering objects from a TRIE */
  @SubL(source = "cycl/tries.lisp", position = 1113) 
  public static SubLSymbol $trie_objects$ = null;

  /** Special variable used while walking over relevant portions of a multi-trie */
  @SubL(source = "cycl/tries.lisp", position = 1249) 
  public static SubLSymbol $trie_relevant_marks$ = null;

  /** Special variable used to control whether we bother to track the ancestor path in a trie. */
  @SubL(source = "cycl/tries.lisp", position = 1371) 
  public static SubLSymbol $trie_ancestor_tracking$ = null;

  public static final class $trie_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $name; }
    public SubLObject getField3() { return $top_node; }
    public SubLObject getField4() { return $unique; }
    public SubLObject getField5() { return $case_sensitive; }
    public SubLObject getField6() { return $entry_test_func; }
    public SubLObject getField7() { return $multi; }
    public SubLObject getField8() { return $multi_keys; }
    public SubLObject getField9() { return $multi_key_func; }
    public SubLObject setField2(SubLObject value) { return $name = value; }
    public SubLObject setField3(SubLObject value) { return $top_node = value; }
    public SubLObject setField4(SubLObject value) { return $unique = value; }
    public SubLObject setField5(SubLObject value) { return $case_sensitive = value; }
    public SubLObject setField6(SubLObject value) { return $entry_test_func = value; }
    public SubLObject setField7(SubLObject value) { return $multi = value; }
    public SubLObject setField8(SubLObject value) { return $multi_keys = value; }
    public SubLObject setField9(SubLObject value) { return $multi_key_func = value; }
    public SubLObject $name = NIL;
    public SubLObject $top_node = NIL;
    public SubLObject $unique = NIL;
    public SubLObject $case_sensitive = NIL;
    public SubLObject $entry_test_func = NIL;
    public SubLObject $multi = NIL;
    public SubLObject $multi_keys = NIL;
    public SubLObject $multi_key_func = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($trie_native.class, $sym1$TRIE, $sym2$TRIE_P, $list3, $list4, new String[] {"$name", "$top_node", "$unique", "$case_sensitive", "$entry_test_func", "$multi", "$multi_keys", "$multi_key_func"}, $list5, $list6, $sym7$PRINT_TRIE);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static SubLSymbol $dtp_trie$ = null;

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12517");
    return NIL;
  }

  public static final class $trie_p$UnaryFunction extends UnaryFunction {
    public $trie_p$UnaryFunction() { super(extractFunctionNamed("TRIE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12548"); }
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_top_node(SubLObject object) {
    checkType(object, $sym2$TRIE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_unique(SubLObject object) {
    checkType(object, $sym2$TRIE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_case_sensitive(SubLObject object) {
    checkType(object, $sym2$TRIE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_entry_test_func(SubLObject object) {
    checkType(object, $sym2$TRIE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject trie_multi(SubLObject object) {
    checkType(object, $sym2$TRIE_P);
    return object.getField7();
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_name(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_top_node(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_unique(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_case_sensitive(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_entry_test_func(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_multi(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField7(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_multi_keys(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField8(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject _csetf_trie_multi_key_func(SubLObject object, SubLObject value) {
    checkType(object, $sym2$TRIE_P);
    return object.setField9(value);
  }

  @SubL(source = "cycl/tries.lisp", position = 1509) 
  public static final SubLObject make_trie(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $trie_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw25$NAME)) {
            _csetf_trie_name(v_new, current_value);
          } else if (pcase_var.eql($kw26$TOP_NODE)) {
            _csetf_trie_top_node(v_new, current_value);
          } else if (pcase_var.eql($kw27$UNIQUE)) {
            _csetf_trie_unique(v_new, current_value);
          } else if (pcase_var.eql($kw28$CASE_SENSITIVE)) {
            _csetf_trie_case_sensitive(v_new, current_value);
          } else if (pcase_var.eql($kw29$ENTRY_TEST_FUNC)) {
            _csetf_trie_entry_test_func(v_new, current_value);
          } else if (pcase_var.eql($kw30$MULTI)) {
            _csetf_trie_multi(v_new, current_value);
          } else if (pcase_var.eql($kw31$MULTI_KEYS)) {
            _csetf_trie_multi_keys(v_new, current_value);
          } else if (pcase_var.eql($kw32$MULTI_KEY_FUNC)) {
            _csetf_trie_multi_key_func(v_new, current_value);
          } else {
            Errors.error($str33$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Free list for TRIE objects */
  @SubL(source = "cycl/tries.lisp", position = 2397) 
  private static SubLSymbol $trie_free_list$ = null;

  /** Lock for TRIE object free list */
  @SubL(source = "cycl/tries.lisp", position = 2397) 
  private static SubLSymbol $trie_free_lock$ = null;

  /** Initialize a TRIE for use */
  @SubL(source = "cycl/tries.lisp", position = 2397) 
  public static final SubLObject init_trie(SubLObject trie) {
    _csetf_trie_name(trie, NIL);
    _csetf_trie_top_node(trie, NIL);
    _csetf_trie_unique(trie, NIL);
    _csetf_trie_case_sensitive(trie, NIL);
    _csetf_trie_entry_test_func(trie, NIL);
    _csetf_trie_multi(trie, NIL);
    _csetf_trie_multi_keys(trie, NIL);
    _csetf_trie_multi_key_func(trie, NIL);
    return trie;
  }

  /** Get a TRIE from the free list, or make a new one if needed */
  @SubL(source = "cycl/tries.lisp", position = 2397) 
  public static final SubLObject get_trie() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == utilities_macros.$structure_resourcing_enabled$.getGlobalValue())) {
        if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
          return init_trie(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12494"));
        } else {
          return init_trie(make_trie(UNPROVIDED));
        }
      }
      {
        SubLObject object = NIL;
        SubLObject found = NIL;
        SubLObject lock = $trie_free_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          object = $trie_free_list$.getGlobalValue();
          for (; (!(((NIL != found)
                || (NIL == object)))); ) {
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12492"))) {
              $trie_free_list$.setGlobalValue(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12539"));
              found = T;
            } else {
              object = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12540");
            }
          }
          if ((NIL == found)) {
            if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
              object = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12495");
            } else {
              object = make_trie(UNPROVIDED);
            }
            $trie_free_list$.setGlobalValue(NIL);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return init_trie(object);
      }
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 2833) 
  public static final SubLObject trie_node_key(SubLObject node) {
    {
      SubLObject car = node.first();
      return (car.isAtom() ? ((SubLObject) car) : car.first());
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 3011) 
  public static final SubLObject trie_node_data(SubLObject node) {
    return node.rest();
  }

  @SubL(source = "cycl/tries.lisp", position = 3070) 
  public static final SubLObject trie_node_subnodes(SubLObject node) {
    return node.rest();
  }

  @SubL(source = "cycl/tries.lisp", position = 3133) 
  public static final SubLObject trie_leaf_node_p(SubLObject node) {
    return Equality.eq(trie_node_key(node), $kw43$END);
  }

  @SubL(source = "cycl/tries.lisp", position = 3214) 
  public static final SubLObject new_trie_terminal_node(SubLObject object, SubLObject uniqueP) {
    return ((NIL != uniqueP) ? ((SubLObject) cons($kw43$END, object)) : list($kw43$END, object));
  }

  @SubL(source = "cycl/tries.lisp", position = 3332) 
  public static final SubLObject new_trie_nonterminal_node(SubLObject v_char, SubLObject case_sensitive) {
    return cons(((NIL != case_sensitive) ? ((SubLObject) v_char) : Characters.char_downcase(v_char)), NIL);
  }

  @SubL(source = "cycl/tries.lisp", position = 3464) 
  public static final SubLObject trie_key_E(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
    return ((NIL != case_sensitive) ? ((SubLObject) Characters.charE(key1, key2)) : Characters.char_equal(key1, key2));
  }

  @SubL(source = "cycl/tries.lisp", position = 3590) 
  public static final SubLObject trie_key_L(SubLObject key1, SubLObject key2, SubLObject case_sensitive) {
    return ((NIL != case_sensitive) ? ((SubLObject) Characters.charL(key1, key2)) : Characters.char_lessp(key1, key2));
  }

  @SubL(source = "cycl/tries.lisp", position = 4058) 
  public static final SubLObject add_trie_subnode(SubLObject node, SubLObject subnode, SubLObject case_sensitive) {
    {
      SubLObject data = trie_node_subnodes(node);
      SubLObject subkey = trie_node_key(subnode);
      SubLObject back = NIL;
      SubLObject next = NIL;
      SubLObject key = NIL;
      for (back = node, next = data, key = trie_node_key(next.first()); (!(((NIL == next)
            || (subkey == $kw43$END)
            || ((key != $kw43$END)
               && (NIL == trie_key_L(key, subkey, case_sensitive)))))); back = next, next = next.rest(), key = trie_node_key(next.first())) {
      }
      ConsesLow.rplacd(back, cons(subnode, next));
    }
    return NIL;
  }

  /** Return a new TRIE datastructure */
  @SubL(source = "cycl/tries.lisp", position = 4546) 
  public static final SubLObject create_trie(SubLObject unique, SubLObject name, SubLObject case_sensitive, SubLObject test) {
    if ((name == UNPROVIDED)) {
      name = NIL;
    }
    if ((case_sensitive == UNPROVIDED)) {
      case_sensitive = T;
    }
    if ((test == UNPROVIDED)) {
      test = EQL;
    }
    {
      SubLObject trie = get_trie();
      _csetf_trie_name(trie, name);
      _csetf_trie_top_node(trie, listS($kw44$TOP, NIL));
      _csetf_trie_unique(trie, unique);
      _csetf_trie_case_sensitive(trie, case_sensitive);
      _csetf_trie_entry_test_func(trie, test);
      _csetf_trie_multi(trie, NIL);
      return trie;
    }
  }

  /** Add index to OBJECT via STRING in TRIE.  
START and END delimit the relevant portion of STRING. */
  @SubL(source = "cycl/tries.lisp", position = 7723) 
  public static final SubLObject trie_insert(SubLObject trie, SubLObject string, SubLObject object, SubLObject start, SubLObject end) {
    if ((object == UNPROVIDED)) {
      object = string;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(trie, $sym2$TRIE_P);
    checkType(string, $sym47$STRINGP);
    {
      SubLObject unique = trie_unique(trie);
      SubLObject case_sensitive = trie_case_sensitive(trie);
      SubLObject test = trie_entry_test_func(trie);
      SubLObject max = ((NIL != end) ? ((SubLObject) end) : Sequences.length(string));
      SubLObject node = trie_top_node(trie);
      SubLObject existing_terminal = NIL;
      SubLObject ch = NIL;
      initialize_trie_ancestor_tracking(node);
      {
        SubLObject next_node = NIL;
        SubLObject index = NIL;
        for (next_node = NIL, index = start; (!(index.numE(max))); next_node = NIL, index = Numbers.add(index, ONE_INTEGER)) {
          ch = Strings.sublisp_char(string, index);
          if ((NIL == next_node)) {
            {
              SubLObject csome_list_var = trie_node_subnodes(node);
              SubLObject subnode = NIL;
              for (subnode = csome_list_var.first(); (!(((NIL != next_node)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
                {
                  SubLObject subkey = trie_node_key(subnode);
                  if ((subkey.isChar()
                       && (NIL != trie_key_E(ch, subkey, case_sensitive)))) {
                    next_node = subnode;
                  }
                }
              }
            }
          }
          if ((NIL != next_node)) {
            node = next_node;
          } else {
            {
              SubLObject new_node = new_trie_nonterminal_node(ch, case_sensitive);
              add_trie_subnode(node, new_node, case_sensitive);
              node = new_node;
            }
          }
          trie_ancestor_tracking_descend(node);
        }
        if ((NIL == existing_terminal)) {
          {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            for (subnode = csome_list_var.first(); (!(((NIL != existing_terminal)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
              if ((NIL != trie_leaf_node_p(subnode))) {
                existing_terminal = subnode;
              }
            }
          }
        }
        if ((NIL != existing_terminal)) {
          trie_ancestor_tracking_descend(existing_terminal);
          if ((NIL != unique)) {
            if ((NIL == Functions.funcall(test, object, trie_node_data(existing_terminal)))) {
              Errors.error($str48$There_is_already_an_object__S_not, trie_node_data(existing_terminal), test, object);
            }
          } else {
            {
              SubLObject old_data = trie_node_data(existing_terminal);
              if ((NIL == subl_promotions.memberP(object, old_data, test, UNPROVIDED))) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12506");
                {
                  SubLObject new_data = cons(object, old_data);
                  ConsesLow.rplacd(existing_terminal, new_data);
                }
              }
            }
          }
        } else {
          {
            SubLObject new_terminal = new_trie_terminal_node(object, unique);
            multi_trie_new_insert_mark(trie, object);
            add_trie_subnode(node, new_terminal, case_sensitive);
          }
        }
        finish_trie_ancestor_tracking();
        return trie;
      }
    }
  }

  /** Remove index to OBJECT via STRING in TRIE.  
START and END delimit the relevant portion of STRING. */
  @SubL(source = "cycl/tries.lisp", position = 9998) 
  public static final SubLObject trie_remove(SubLObject trie, SubLObject string, SubLObject object, SubLObject start, SubLObject end) {
    if ((object == UNPROVIDED)) {
      object = string;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    checkType(trie, $sym2$TRIE_P);
    checkType(string, $sym47$STRINGP);
    {
      SubLObject unique = trie_unique(trie);
      SubLObject case_sensitive = trie_case_sensitive(trie);
      SubLObject test = trie_entry_test_func(trie);
      SubLObject max = ((NIL != end) ? ((SubLObject) end) : Sequences.length(string));
      SubLObject node = trie_top_node(trie);
      SubLObject last_branching_node = NIL;
      SubLObject end_node = NIL;
      SubLObject last_branch = NIL;
      SubLObject ch = NIL;
      initialize_trie_ancestor_tracking(node);
      {
        SubLObject next_node = NIL;
        SubLObject index = NIL;
        for (next_node = NIL, index = start; (!(index.numE(max))); next_node = NIL, index = Numbers.add(index, ONE_INTEGER)) {
          ch = Strings.sublisp_char(string, index);
          if ((NIL == next_node)) {
            {
              SubLObject csome_list_var = trie_node_subnodes(node);
              SubLObject subnode = NIL;
              for (subnode = csome_list_var.first(); (!(((NIL != next_node)
                    || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
                {
                  SubLObject subkey = trie_node_key(subnode);
                  if ((subkey.isChar()
                       && (NIL != trie_key_E(ch, subkey, case_sensitive)))) {
                    next_node = subnode;
                  }
                }
              }
            }
          }
          if ((NIL != next_node)) {
            if ((NIL != trie_node_subnodes(node).rest())) {
              last_branching_node = node;
              last_branch = next_node;
            }
            node = next_node;
          } else {
            finish_trie_ancestor_tracking();
            return trie;
          }
          trie_ancestor_tracking_descend(node);
        }
        if ((NIL == end_node)) {
          {
            SubLObject csome_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            for (subnode = csome_list_var.first(); (!(((NIL != end_node)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
              if ((NIL != trie_leaf_node_p(subnode))) {
                trie_ancestor_tracking_descend(subnode);
                end_node = subnode;
              }
            }
          }
        }
        if ((NIL == end_node)) {
          finish_trie_ancestor_tracking();
          return trie;
        }
        if ((NIL != unique)) {
          if ((NIL == Functions.funcall(test, object, trie_node_data(end_node)))) {
            Errors.cerror($str49$Remove_it_anyway, $str50$The_object_found_in_trie_for__S_i, string, trie_node_data(end_node));
          }
        } else {
          {
            SubLObject old_data = trie_node_data(end_node);
            SubLObject new_data = Sequences.delete(object, old_data, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if ((old_data != new_data)) {
              ConsesLow.rplacd(end_node, new_data);
            }
            if ((NIL != new_data)) {
              multi_trie_remove_mark(trie, object);
              finish_trie_ancestor_tracking();
              return trie;
            }
          }
        }
        multi_trie_remove_mark(trie, object);
        if ((NIL != trie_node_subnodes(node).rest())) {
          ConsesLow.rplacd(node, Sequences.delete(end_node, trie_node_subnodes(node), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } else if (((NIL != last_branch)
             && (NIL != last_branching_node))) {
          last_branching_node = Sequences.delete(last_branch, last_branching_node, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12480");
        }
        finish_trie_ancestor_tracking();
        return trie;
      }
    }
  }

  /** Return the unique object indexed by STRING in TRIE.
If CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.
START and END determine the relevant portion of STRING. */
  @SubL(source = "cycl/tries.lisp", position = 15541) 
  public static final SubLObject trie_exact(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject start, SubLObject end) {
    if ((case_sensitiveP == UNPROVIDED)) {
      case_sensitiveP = NIL;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(trie, $sym2$TRIE_P);
      checkType(string, $sym47$STRINGP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == trie_unique(trie))) {
          Errors.error($str51$TRIE__S_does_not_have_unique_entr, trie);
        }
      }
      case_sensitiveP = makeBoolean(((NIL != case_sensitiveP)
             && (NIL != trie_case_sensitive(trie))));
      {
        SubLObject node = trie_top_node(trie);
        SubLObject v_char = NIL;
        SubLObject answer = NIL;
        SubLObject stop = ((NIL != end) ? ((SubLObject) end) : Sequences.length(string));
        initialize_trie_ancestor_tracking(node);
        {
          SubLObject i = NIL;
          SubLObject next_node = NIL;
          for (i = start, next_node = NIL; (!((i.numE(stop)
                || (i.numG(ZERO_INTEGER)
                   && (NIL == node))))); i = Numbers.add(i, ONE_INTEGER), next_node = NIL) {
            v_char = Strings.sublisp_char(string, i);
            if ((NIL == next_node)) {
              {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                for (subnode = csome_list_var.first(); (!(((NIL != next_node)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
                  {
                    SubLObject subkey = trie_node_key(subnode);
                    if ((subkey.isChar()
                         && (NIL != trie_key_E(v_char, subkey, case_sensitiveP)))) {
                      next_node = subnode;
                    }
                  }
                }
              }
            }
            node = next_node;
            trie_ancestor_tracking_descend(node);
          }
          if ((NIL != node)) {
            if ((NIL == answer)) {
              {
                SubLObject csome_list_var = trie_node_subnodes(node);
                SubLObject subnode = NIL;
                for (subnode = csome_list_var.first(); (!(((NIL != answer)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), subnode = csome_list_var.first()) {
                  if ((NIL != trie_leaf_node_p(subnode))) {
                    trie_ancestor_tracking_descend(subnode);
                    if ((NIL != trie_relevant_ancestor_pathP(trie))) {
                      {
                        SubLObject object = trie_node_data(subnode);
                        if ((NIL != trie_relevant_object(trie, object))) {
                          answer = object;
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        finish_trie_ancestor_tracking();
        return answer;
      }
    }
  }

  /** Return a list of all objects indexed in TRIE where STRING is a prefix of the index.
If CASE-SENSITIVE? is non-null, STRING is compared case-insensitively.
IF EXACT-LENGTH? is non-null, then the index must match STRING exactly.
START and END determine the relevant portion of STRING. */
  @SubL(source = "cycl/tries.lisp", position = 17030) 
  public static final SubLObject trie_prefix(SubLObject trie, SubLObject string, SubLObject case_sensitiveP, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
    if ((case_sensitiveP == UNPROVIDED)) {
      case_sensitiveP = NIL;
    }
    if ((exact_lengthP == UNPROVIDED)) {
      exact_lengthP = NIL;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    if (((NIL != case_sensitiveP)
        || (NIL == trie_case_sensitive(trie)))) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12549");
    } else {
      return trie_prefix_recursive(trie, string, exact_lengthP, start, end);
    }
  }

  /** Internal to TRIE-PREFIX */
  @SubL(source = "cycl/tries.lisp", position = 19387) 
  public static final SubLObject trie_prefix_recursive(SubLObject trie, SubLObject string, SubLObject exact_lengthP, SubLObject start, SubLObject end) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(trie, $sym2$TRIE_P);
      checkType(string, $sym47$STRINGP);
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $trie_objects$.currentBinding(thread);
          try {
            $trie_objects$.bind(NIL, thread);
            {
              SubLObject top_node = trie_top_node(trie);
              initialize_trie_ancestor_tracking(top_node);
              if ((NIL != trie_relevant_ancestor_pathP(trie))) {
                {
                  SubLObject cdolist_list_var = trie_node_subnodes(top_node);
                  SubLObject subnode = NIL;
                  for (subnode = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subnode = cdolist_list_var.first()) {
                    trie_ancestor_tracking_descend(subnode);
                    if ((NIL != trie_relevant_ancestor_pathP(trie))) {
                      trie_prefix_recursive_int(trie, subnode, string, start, ((NIL != end) ? ((SubLObject) end) : Sequences.length(string)), exact_lengthP, trie_unique(trie));
                    }
                    trie_ancestor_tracking_ascend();
                  }
                }
              }
              ans = $trie_objects$.getDynamicValue(thread);
              finish_trie_ancestor_tracking();
            }
          } finally {
            $trie_objects$.rebind(_prev_bind_0, thread);
          }
        }
        return Sequences.nreverse(ans);
      }
    }
  }

  /** Internal to TRIE-PREFIX-RECURSIVE */
  @SubL(source = "cycl/tries.lisp", position = 20289) 
  public static final SubLObject trie_prefix_recursive_int(SubLObject trie, SubLObject node, SubLObject string, SubLObject index, SubLObject stop, SubLObject exact_lengthP, SubLObject uniqueP) {
    if (index.numE(stop)) {
      if ((NIL != exact_lengthP)) {
        if ((NIL != trie_leaf_node_p(node))) {
          all_trie_objects_in_leaf_node(trie, node, uniqueP);
        }
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12474");
      }
    } else {
      {
        SubLObject key = trie_node_key(node);
        if ((key.isChar()
             && (NIL != Characters.char_equal(Strings.sublisp_char(string, index), key)))) {
          {
            SubLObject cdolist_list_var = trie_node_subnodes(node);
            SubLObject subnode = NIL;
            for (subnode = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subnode = cdolist_list_var.first()) {
              trie_ancestor_tracking_descend(subnode);
              if ((NIL != trie_relevant_ancestor_pathP(trie))) {
                trie_prefix_recursive_int(trie, subnode, string, Numbers.add(index, ONE_INTEGER), stop, exact_lengthP, uniqueP);
              }
              trie_ancestor_tracking_ascend();
            }
          }
        } else {
          return NIL;
        }
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/tries.lisp", position = 21462) 
  public static final SubLObject all_trie_objects_in_leaf_node(SubLObject trie, SubLObject node, SubLObject uniqueP) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject data = trie_node_data(node);
        if ((NIL != uniqueP)) {
          if ((NIL != trie_relevant_object(trie, data))) {
            $trie_objects$.setDynamicValue(cons(data, $trie_objects$.getDynamicValue(thread)), thread);
          }
        } else {
          data = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12550");
          $trie_objects$.setDynamicValue(ConsesLow.append(data, $trie_objects$.getDynamicValue(thread)), thread);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 21792) 
  private static SubLSymbol $trie_maximum_search_size$ = null;

  @SubL(source = "cycl/tries.lisp", position = 30645) 
  public static final SubLObject new_trie_iterator(SubLObject trie, SubLObject forwardP) {
    if ((forwardP == UNPROVIDED)) {
      forwardP = T;
    }
    {
      SubLObject state = new_trie_iterator_state(trie, forwardP);
      return iteration.new_iterator(state, $sym63$TRIE_ITERATOR_DONE, $sym64$TRIE_ITERATOR_NEXT, $sym65$TRIE_ITERATOR_FINALIZE);
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 30891) 
  public static final SubLObject new_trie_iterator_state(SubLObject trie, SubLObject forwardP) {
    {
      SubLObject state = Vectors.make_vector(FIVE_INTEGER, NIL);
      Vectors.set_aref(state, ZERO_INTEGER, trie);
      Vectors.set_aref(state, ONE_INTEGER, trie_top_node(trie));
      Vectors.set_aref(state, TWO_INTEGER, forwardP);
      Vectors.set_aref(state, THREE_INTEGER, ((NIL != trie_unique(trie)) ? ((SubLObject) NIL) : queues.create_queue()));
      Vectors.set_aref(state, FOUR_INTEGER, stacks.create_stack());
      return state;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 31346) 
  public static final SubLObject trie_iterator_done(SubLObject state) {
    return makeBoolean(((NIL != trie_iterator_done_node(Vectors.aref(state, ONE_INTEGER)))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12528"))
           && (NIL != Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12529"))));
  }

  @SubL(source = "cycl/tries.lisp", position = 31546) 
  public static final SubLObject trie_iterator_done_node(SubLObject node) {
    return Types.sublisp_null(node);
  }

  @SubL(source = "cycl/tries.lisp", position = 31838) 
  public static final SubLObject trie_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject trie = Vectors.aref(state, ZERO_INTEGER);
        SubLObject node = Vectors.aref(state, ONE_INTEGER);
        SubLObject forwardP = Vectors.aref(state, TWO_INTEGER);
        SubLObject queue = Vectors.aref(state, THREE_INTEGER);
        SubLObject stack = Vectors.aref(state, FOUR_INTEGER);
        thread.resetMultipleValues();
        {
          SubLObject next = ((NIL != queues.queue_p(queue)) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12530")) : trie_iterator_next_unique(trie, node, forwardP, stack));
          SubLObject invalidP = thread.secondMultipleValue();
          SubLObject new_node = thread.thirdMultipleValue();
          thread.resetMultipleValues();
          if ((NIL != invalidP)) {
            Vectors.set_aref(state, ONE_INTEGER, NIL);
            Vectors.set_aref(state, THREE_INTEGER, NIL);
            stacks.clear_stack(stack);
          } else {
            Vectors.set_aref(state, ONE_INTEGER, new_node);
          }
          return Values.values(next, state, invalidP);
        }
      }
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 32428) 
  public static final SubLObject trie_iterator_next_unique(SubLObject trie, SubLObject node, SubLObject forwardP, SubLObject stack) {
    {
      SubLObject next = NIL;
      SubLObject invalidP = NIL;
      while ((!(((NIL != next)
            || (NIL != invalidP))))) {
        if ((NIL != trie_leaf_node_p(node))) {
          {
            SubLObject data = trie_node_data(node);
            if ((NIL != trie_relevant_object(trie, data))) {
              next = data;
            }
          }
        } else {
          {
            SubLObject subnodes = trie_node_subnodes(node);
            if ((NIL != forwardP)) {
              {
                SubLObject cdolist_list_var = Sequences.reverse(subnodes);
                SubLObject subnode = NIL;
                for (subnode = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subnode = cdolist_list_var.first()) {
                  stacks.stack_push(subnode, stack);
                }
              }
            } else {
              {
                SubLObject cdolist_list_var = subnodes;
                SubLObject subnode = NIL;
                for (subnode = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subnode = cdolist_list_var.first()) {
                  stacks.stack_push(subnode, stack);
                }
              }
            }
          }
        }
        node = stacks.stack_pop(stack);
        if (((NIL == next)
             && (NIL == node)
             && (NIL != stacks.stack_empty_p(stack)))) {
          invalidP = T;
        }
      }
      return Values.values(next, invalidP, node);
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 37977) 
  public static SubLSymbol $trie_ancestor_tracking_resource$ = null;

  @SubL(source = "cycl/tries.lisp", position = 38195) 
  public static SubLSymbol $trie_ancestor_tracking_lock$ = null;

  @SubL(source = "cycl/tries.lisp", position = 38281) 
  public static SubLSymbol $trie_ancestor_tracking_vector_size$ = null;

  @SubL(source = "cycl/tries.lisp", position = 39137) 
  public static SubLSymbol $trie_ancestor_vector$ = null;

  @SubL(source = "cycl/tries.lisp", position = 39180) 
  public static SubLSymbol $trie_ancestor_next$ = null;

  @SubL(source = "cycl/tries.lisp", position = 39220) 
  public static final SubLObject initialize_trie_ancestor_tracking(SubLObject top_node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $trie_ancestor_tracking$.getDynamicValue(thread))) {
        $trie_ancestor_vector$.setDynamicValue(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12493"), thread);
        $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
        trie_ancestor_tracking_descend(top_node);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 39517) 
  public static final SubLObject finish_trie_ancestor_tracking() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $trie_ancestor_tracking$.getDynamicValue(thread))) {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12491");
        $trie_ancestor_next$.setDynamicValue(ZERO_INTEGER, thread);
        $trie_ancestor_vector$.setDynamicValue(NIL, thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 39745) 
  public static final SubLObject trie_ancestor_tracking_descend(SubLObject node) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $trie_ancestor_tracking$.getDynamicValue(thread))) {
        if ($trie_ancestor_next$.getDynamicValue(thread).numGE(Sequences.length($trie_ancestor_vector$.getDynamicValue(thread)))) {
          $trie_ancestor_vector$.setDynamicValue(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4935"), thread);
        }
        Vectors.set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), node);
        $trie_ancestor_next$.setDynamicValue(Numbers.add($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 40119) 
  public static final SubLObject trie_ancestor_tracking_ascend() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $trie_ancestor_tracking$.getDynamicValue(thread))) {
        $trie_ancestor_next$.setDynamicValue(Numbers.subtract($trie_ancestor_next$.getDynamicValue(thread), ONE_INTEGER), thread);
        Vectors.set_aref($trie_ancestor_vector$.getDynamicValue(thread), $trie_ancestor_next$.getDynamicValue(thread), NIL);
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 47864) 
  public static final SubLObject trie_relevant_ancestor_pathP(SubLObject trie) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == trie_multi(trie))) {
        return T;
      } else if ((NIL == $trie_relevant_marks$.getDynamicValue(thread))) {
        return NIL;
      } else if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
        return T;
      } else {
        {
          SubLObject some_mark_not_on_any_ancestor = NIL;
          thread.resetMultipleValues();
          {
            SubLObject ancestor_vector = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12524");
            SubLObject ancestor_end_index = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == some_mark_not_on_any_ancestor)) {
              {
                SubLObject csome_list_var = $trie_relevant_marks$.getDynamicValue(thread);
                SubLObject mark = NIL;
                for (mark = csome_list_var.first(); (!(((NIL != some_mark_not_on_any_ancestor)
                      || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), mark = csome_list_var.first()) {
                  {
                    SubLObject mark_on_ancestor = NIL;
                    SubLObject catch_var = NIL;
                    try {
                      {
                        SubLObject index = NIL;
                        for (index = ZERO_INTEGER; index.numL(ancestor_end_index); index = Numbers.add(index, ONE_INTEGER)) {
                          {
                            SubLObject ancestor = Vectors.aref(ancestor_vector, index);
                            if ((NIL != ((NIL != trie_leaf_node_p(ancestor)) ? ((SubLObject) Errors
									.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12531")) : Errors
											.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12543")))) {
                              mark_on_ancestor = T;
                              utilities_macros.mapping_finished();
                            }
                          }
                        }
                      }
                    } catch (Throwable ccatch_env_var) {
                      catch_var = Errors.handleThrowable(ccatch_env_var, $kw53$MAPPING_DONE);
                    }
                    if ((NIL == mark_on_ancestor)) {
                      some_mark_not_on_any_ancestor = T;
                    }
                  }
                }
              }
            }
          }
          return some_mark_not_on_any_ancestor;
        }
      }
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 48788) 
  public static final SubLObject trie_relevant_object(SubLObject trie, SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == trie_multi(trie))) {
        return T;
      } else if ((NIL == $trie_relevant_marks$.getDynamicValue(thread))) {
        return NIL;
      } else if ($trie_relevant_marks$.getDynamicValue(thread).isAtom()) {
        return T;
      } else {
        {
          SubLObject object_mark = Functions.funcall(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12535"), object);
          return conses_high.member(object_mark, $trie_relevant_marks$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
        }
      }
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 56232) 
  public static final SubLObject multi_trie_new_insert_mark(SubLObject trie, SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != trie_multi(trie))) {
        thread.resetMultipleValues();
        {
          SubLObject ancestor_vector = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12525");
          SubLObject ancestor_index = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject object_mark = Functions.funcall(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12536"), object);
            SubLObject trie_marks = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12538");
            SubLObject cdolist_list_var = trie_marks;
            SubLObject mark = NIL;
            for (mark = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), mark = cdolist_list_var.first()) {
              if ((mark == object_mark)) {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12508");
              } else {
                Errors
						.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12507");
              }
            }
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "cycl/tries.lisp", position = 57961) 
  public static final SubLObject multi_trie_remove_mark(SubLObject trie, SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != trie_multi(trie))) {
        thread.resetMultipleValues();
        {
          SubLObject ancestor_vector = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12526");
          SubLObject ancestor_index = thread.secondMultipleValue();
          thread.resetMultipleValues();
          {
            SubLObject mark = Functions.funcall(Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12537"), object);
            SubLObject node = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12489");
            checkType(node, $sym76$TRIE_LEAF_NODE_P);
            if ((NIL != Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12533"))) {
              Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 12510");
            }
          }
        }
      }
      return NIL;
    }
  }

  public static final SubLObject declare_tries_file() {
    declareFunction(myName, "trie_print_function_trampoline", "TRIE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "trie_p", "TRIE-P", 1, 0, false); new $trie_p$UnaryFunction();
    //declareFunction(myName, "trie_name", "TRIE-NAME", 1, 0, false);
    declareFunction(myName, "trie_top_node", "TRIE-TOP-NODE", 1, 0, false);
    declareFunction(myName, "trie_unique", "TRIE-UNIQUE", 1, 0, false);
    declareFunction(myName, "trie_case_sensitive", "TRIE-CASE-SENSITIVE", 1, 0, false);
    declareFunction(myName, "trie_entry_test_func", "TRIE-ENTRY-TEST-FUNC", 1, 0, false);
    declareFunction(myName, "trie_multi", "TRIE-MULTI", 1, 0, false);
    //declareFunction(myName, "trie_multi_keys", "TRIE-MULTI-KEYS", 1, 0, false);
    //declareFunction(myName, "trie_multi_key_func", "TRIE-MULTI-KEY-FUNC", 1, 0, false);
    declareFunction(myName, "_csetf_trie_name", "_CSETF-TRIE-NAME", 2, 0, false);
    declareFunction(myName, "_csetf_trie_top_node", "_CSETF-TRIE-TOP-NODE", 2, 0, false);
    declareFunction(myName, "_csetf_trie_unique", "_CSETF-TRIE-UNIQUE", 2, 0, false);
    declareFunction(myName, "_csetf_trie_case_sensitive", "_CSETF-TRIE-CASE-SENSITIVE", 2, 0, false);
    declareFunction(myName, "_csetf_trie_entry_test_func", "_CSETF-TRIE-ENTRY-TEST-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_trie_multi", "_CSETF-TRIE-MULTI", 2, 0, false);
    declareFunction(myName, "_csetf_trie_multi_keys", "_CSETF-TRIE-MULTI-KEYS", 2, 0, false);
    declareFunction(myName, "_csetf_trie_multi_key_func", "_CSETF-TRIE-MULTI-KEY-FUNC", 2, 0, false);
    declareFunction(myName, "make_trie", "MAKE-TRIE", 0, 1, false);
    //declareFunction(myName, "print_trie", "PRINT-TRIE", 3, 0, false);
    //declareFunction(myName, "make_static_trie", "MAKE-STATIC-TRIE", 0, 0, false);
    declareFunction(myName, "init_trie", "INIT-TRIE", 1, 0, false);
    //declareFunction(myName, "free_trie_p", "FREE-TRIE-P", 1, 0, false);
    //declareFunction(myName, "free_trie", "FREE-TRIE", 1, 0, false);
    declareFunction(myName, "get_trie", "GET-TRIE", 0, 0, false);
    declareFunction(myName, "trie_node_key", "TRIE-NODE-KEY", 1, 0, false);
    declareFunction(myName, "trie_node_data", "TRIE-NODE-DATA", 1, 0, false);
    declareFunction(myName, "trie_node_subnodes", "TRIE-NODE-SUBNODES", 1, 0, false);
    declareFunction(myName, "trie_leaf_node_p", "TRIE-LEAF-NODE-P", 1, 0, false);
    declareFunction(myName, "new_trie_terminal_node", "NEW-TRIE-TERMINAL-NODE", 2, 0, false);
    declareFunction(myName, "new_trie_nonterminal_node", "NEW-TRIE-NONTERMINAL-NODE", 2, 0, false);
    declareFunction(myName, "trie_key_E", "TRIE-KEY-=", 3, 0, false);
    declareFunction(myName, "trie_key_L", "TRIE-KEY-<", 3, 0, false);
    //declareFunction(myName, "trie_key_LE", "TRIE-KEY-<=", 3, 0, false);
    //declareFunction(myName, "trie_key_G", "TRIE-KEY->", 3, 0, false);
    //declareFunction(myName, "trie_key_GE", "TRIE-KEY->=", 3, 0, false);
    declareFunction(myName, "add_trie_subnode", "ADD-TRIE-SUBNODE", 3, 0, false);
    declareFunction(myName, "create_trie", "CREATE-TRIE", 1, 3, false);
    //declareFunction(myName, "trie_from_strings", "TRIE-FROM-STRINGS", 2, 3, false);
    //declareFunction(myName, "clear_trie", "CLEAR-TRIE", 1, 0, false);
    //declareFunction(myName, "trie_emptyP", "TRIE-EMPTY?", 1, 0, false);
    //declareFunction(myName, "trie_count", "TRIE-COUNT", 1, 0, false);
    //declareFunction(myName, "trie_node_count", "TRIE-NODE-COUNT", 2, 0, false);
    //declareFunction(myName, "show_trie", "SHOW-TRIE", 1, 1, false);
    //declareFunction(myName, "show_trie_node", "SHOW-TRIE-NODE", 4, 0, false);
    declareFunction(myName, "trie_insert", "TRIE-INSERT", 2, 3, false);
    declareFunction(myName, "trie_remove", "TRIE-REMOVE", 2, 3, false);
    //declareFunction(myName, "trie_remove_all", "TRIE-REMOVE-ALL", 2, 2, false);
    declareFunction(myName, "trie_exact", "TRIE-EXACT", 2, 3, false);
    declareFunction(myName, "trie_prefix", "TRIE-PREFIX", 2, 4, false);
    //declareFunction(myName, "trie_prefix_iterative", "TRIE-PREFIX-ITERATIVE", 3, 2, false);
    declareFunction(myName, "trie_prefix_recursive", "TRIE-PREFIX-RECURSIVE", 3, 2, false);
    declareFunction(myName, "trie_prefix_recursive_int", "TRIE-PREFIX-RECURSIVE-INT", 7, 0, false);
    //declareFunction(myName, "all_trie_objects_under_node", "ALL-TRIE-OBJECTS-UNDER-NODE", 3, 0, false);
    declareFunction(myName, "all_trie_objects_in_leaf_node", "ALL-TRIE-OBJECTS-IN-LEAF-NODE", 3, 0, false);
    //declareFunction(myName, "trie_search", "TRIE-SEARCH", 2, 3, false);
    //declareFunction(myName, "trie_search_internal", "TRIE-SEARCH-INTERNAL", 9, 0, false);
    //declareFunction(myName, "trie_match", "TRIE-MATCH", 6, 0, false);
    //declareFunction(myName, "map_trie_data", "MAP-TRIE-DATA", 2, 0, false);
    //declareFunction(myName, "map_trie_data_internal", "MAP-TRIE-DATA-INTERNAL", 4, 0, false);
    //declareFunction(myName, "map_trie_data_direction", "MAP-TRIE-DATA-DIRECTION", 3, 3, false);
    //declareFunction(myName, "map_trie_data_forward", "MAP-TRIE-DATA-FORWARD", 8, 0, false);
    //declareFunction(myName, "map_trie_data_backward", "MAP-TRIE-DATA-BACKWARD", 8, 0, false);
    //declareMacro(myName, "do_objects_in_trie", "DO-OBJECTS-IN-TRIE");
    declareFunction(myName, "new_trie_iterator", "NEW-TRIE-ITERATOR", 1, 1, false);
    declareFunction(myName, "new_trie_iterator_state", "NEW-TRIE-ITERATOR-STATE", 2, 0, false);
    declareFunction(myName, "trie_iterator_done", "TRIE-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "trie_iterator_done_node", "TRIE-ITERATOR-DONE-NODE", 1, 0, false);
    //declareFunction(myName, "trie_iterator_done_queue", "TRIE-ITERATOR-DONE-QUEUE", 1, 0, false);
    //declareFunction(myName, "trie_iterator_done_stack", "TRIE-ITERATOR-DONE-STACK", 1, 0, false);
    declareFunction(myName, "trie_iterator_next", "TRIE-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "trie_iterator_next_unique", "TRIE-ITERATOR-NEXT-UNIQUE", 4, 0, false);
    //declareFunction(myName, "trie_iterator_next_non_unique", "TRIE-ITERATOR-NEXT-NON-UNIQUE", 5, 0, false);
    //declareFunction(myName, "trie_iterator_finalize", "TRIE-ITERATOR-FINALIZE", 1, 0, false);
    //declareFunction(myName, "new_directed_trie_iterator", "NEW-DIRECTED-TRIE-ITERATOR", 2, 5, false);
    //declareFunction(myName, "new_directed_trie_iterator_state", "NEW-DIRECTED-TRIE-ITERATOR-STATE", 7, 0, false);
    //declareFunction(myName, "directed_trie_iterator_generate_stack", "DIRECTED-TRIE-ITERATOR-GENERATE-STACK", 7, 0, false);
    //declareFunction(myName, "forward_trie_iterator_generate_stack_recursive", "FORWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
    //declareFunction(myName, "backward_trie_iterator_generate_stack_recursive", "BACKWARD-TRIE-ITERATOR-GENERATE-STACK-RECURSIVE", 5, 0, false);
    //declareFunction(myName, "new_trie_ancestor_tracking_vector", "NEW-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
    //declareFunction(myName, "get_trie_ancestor_tracking_vector", "GET-TRIE-ANCESTOR-TRACKING-VECTOR", 0, 0, false);
    //declareFunction(myName, "free_trie_ancestor_tracking_vector", "FREE-TRIE-ANCESTOR-TRACKING-VECTOR", 1, 0, false);
    declareFunction(myName, "initialize_trie_ancestor_tracking", "INITIALIZE-TRIE-ANCESTOR-TRACKING", 1, 0, false);
    declareFunction(myName, "finish_trie_ancestor_tracking", "FINISH-TRIE-ANCESTOR-TRACKING", 0, 0, false);
    declareFunction(myName, "trie_ancestor_tracking_descend", "TRIE-ANCESTOR-TRACKING-DESCEND", 1, 0, false);
    declareFunction(myName, "trie_ancestor_tracking_ascend", "TRIE-ANCESTOR-TRACKING-ASCEND", 0, 0, false);
    //declareFunction(myName, "trie_ancestor_path", "TRIE-ANCESTOR-PATH", 0, 0, false);
    //declareFunction(myName, "no_more_ancestors", "NO-MORE-ANCESTORS", 1, 0, false);
    //declareFunction(myName, "first_ancestor", "FIRST-ANCESTOR", 2, 0, false);
    //declareFunction(myName, "parent_ancestor", "PARENT-ANCESTOR", 2, 0, false);
    //declareFunction(myName, "next_generation", "NEXT-GENERATION", 1, 0, false);
    //declareFunction(myName, "multi_trie_some_ancestor_marked", "MULTI-TRIE-SOME-ANCESTOR-MARKED", 3, 0, false);
    //declareFunction(myName, "create_multi_trie", "CREATE-MULTI-TRIE", 2, 3, false);
    //declareFunction(myName, "multi_trie_p", "MULTI-TRIE-P", 1, 0, false);
    //declareFunction(myName, "clear_multi_trie", "CLEAR-MULTI-TRIE", 1, 1, false);
    //declareFunction(myName, "add_multi_trie_key", "ADD-MULTI-TRIE-KEY", 2, 0, false);
    //declareFunction(myName, "rem_multi_trie_key", "REM-MULTI-TRIE-KEY", 2, 0, false);
    //declareFunction(myName, "multi_trie_emptyP", "MULTI-TRIE-EMPTY?", 1, 0, false);
    //declareFunction(myName, "multi_trie_count", "MULTI-TRIE-COUNT", 1, 0, false);
    //declareFunction(myName, "show_multi_trie", "SHOW-MULTI-TRIE", 1, 1, false);
    //declareFunction(myName, "multi_trie_insert", "MULTI-TRIE-INSERT", 2, 3, false);
    //declareFunction(myName, "multi_trie_remove", "MULTI-TRIE-REMOVE", 2, 3, false);
    //declareFunction(myName, "multi_trie_remove_all", "MULTI-TRIE-REMOVE-ALL", 2, 2, false);
    //declareFunction(myName, "multi_trie_exact", "MULTI-TRIE-EXACT", 2, 4, false);
    //declareFunction(myName, "multi_trie_prefix", "MULTI-TRIE-PREFIX", 2, 5, false);
    //declareFunction(myName, "multi_trie_search", "MULTI-TRIE-SEARCH", 2, 4, false);
    //declareFunction(myName, "map_multi_trie_data", "MAP-MULTI-TRIE-DATA", 2, 1, false);
    //declareFunction(myName, "map_multi_trie_data_mark", "MAP-MULTI-TRIE-DATA-MARK", 3, 0, false);
    //declareFunction(myName, "map_multi_trie_data_direction", "MAP-MULTI-TRIE-DATA-DIRECTION", 3, 4, false);
    //declareFunction(myName, "map_multi_trie_data_direction_mark", "MAP-MULTI-TRIE-DATA-DIRECTION-MARK", 4, 3, false);
    declareFunction(myName, "trie_relevant_ancestor_pathP", "TRIE-RELEVANT-ANCESTOR-PATH?", 1, 0, false);
    declareFunction(myName, "trie_relevant_object", "TRIE-RELEVANT-OBJECT", 2, 0, false);
    //declareFunction(myName, "trie_relevant_objects", "TRIE-RELEVANT-OBJECTS", 2, 0, false);
    //declareFunction(myName, "add_trie_mark", "ADD-TRIE-MARK", 2, 0, false);
    //declareFunction(myName, "rem_trie_mark", "REM-TRIE-MARK", 2, 0, false);
    //declareFunction(myName, "trie_node_marks", "TRIE-NODE-MARKS", 1, 0, false);
    //declareFunction(myName, "trie_node_has_mark", "TRIE-NODE-HAS-MARK", 2, 0, false);
    //declareFunction(myName, "set_trie_node_marks", "SET-TRIE-NODE-MARKS", 2, 0, false);
    //declareFunction(myName, "trie_leaf_has_implicit_mark", "TRIE-LEAF-HAS-IMPLICIT-MARK", 3, 0, false);
    //declareFunction(myName, "add_trie_node_mark", "ADD-TRIE-NODE-MARK", 2, 0, false);
    //declareFunction(myName, "rem_trie_node_mark", "REM-TRIE-NODE-MARK", 2, 0, false);
    //declareFunction(myName, "trie_node_mark_present_recursive", "TRIE-NODE-MARK-PRESENT-RECURSIVE", 4, 0, false);
    //declareFunction(myName, "trie_node_mark_not_present_recursive", "TRIE-NODE-MARK-NOT-PRESENT-RECURSIVE", 4, 0, false);
    //declareFunction(myName, "multi_trie_existing_insert_mark", "MULTI-TRIE-EXISTING-INSERT-MARK", 2, 0, false);
    //declareFunction(myName, "multi_trie_existing_insert_mark_present", "MULTI-TRIE-EXISTING-INSERT-MARK-PRESENT", 4, 0, false);
    //declareFunction(myName, "multi_trie_existing_insert_mark_not_present", "MULTI-TRIE-EXISTING-INSERT-MARK-NOT-PRESENT", 4, 0, false);
    declareFunction(myName, "multi_trie_new_insert_mark", "MULTI-TRIE-NEW-INSERT-MARK", 2, 0, false);
    //declareFunction(myName, "multi_trie_new_insert_mark_present", "MULTI-TRIE-NEW-INSERT-MARK-PRESENT", 4, 0, false);
    //declareFunction(myName, "multi_trie_new_insert_mark_not_present", "MULTI-TRIE-NEW-INSERT-MARK-NOT-PRESENT", 4, 0, false);
    declareFunction(myName, "multi_trie_remove_mark", "MULTI-TRIE-REMOVE-MARK", 2, 0, false);
    //declareFunction(myName, "multi_trie_remove_mark_not_present", "MULTI-TRIE-REMOVE-MARK-NOT-PRESENT", 4, 0, false);
    //declareFunction(myName, "multi_trie_remove_all_mark", "MULTI-TRIE-REMOVE-ALL-MARK", 1, 0, false);
    //declareFunction(myName, "multi_trie_remove_all_mark_not_present", "MULTI-TRIE-REMOVE-ALL-MARK-NOT-PRESENT", 4, 0, false);
    return NIL;
  }

  public static final SubLObject init_tries_file() {
    $trie_objects$ = defparameter("*TRIE-OBJECTS*", NIL);
    $trie_relevant_marks$ = defparameter("*TRIE-RELEVANT-MARKS*", $kw0$ALL);
    $trie_ancestor_tracking$ = defparameter("*TRIE-ANCESTOR-TRACKING*", NIL);
    $dtp_trie$ = defconstant("*DTP-TRIE*", $sym1$TRIE);
    $trie_free_list$ = deflexical("*TRIE-FREE-LIST*", NIL);
    $trie_free_lock$ = deflexical("*TRIE-FREE-LOCK*", Locks.make_lock($str41$TRIE_resource_lock));
    $trie_maximum_search_size$ = defparameter("*TRIE-MAXIMUM-SEARCH-SIZE*", $int52$1000);
    $trie_ancestor_tracking_resource$ = defparameter("*TRIE-ANCESTOR-TRACKING-RESOURCE*", NIL);
    $trie_ancestor_tracking_lock$ = defparameter("*TRIE-ANCESTOR-TRACKING-LOCK*", Locks.make_lock($str66$Ancestor_Tracking_Resource));
    $trie_ancestor_tracking_vector_size$ = defparameter("*TRIE-ANCESTOR-TRACKING-VECTOR-SIZE*", $int67$100);
    $trie_ancestor_vector$ = defparameter("*TRIE-ANCESTOR-VECTOR*", NIL);
    $trie_ancestor_next$ = defparameter("*TRIE-ANCESTOR-NEXT*", NIL);
    return NIL;
  }

  public static final SubLObject setup_tries_file() {
    // CVS_ID("Id: tries.lisp 126640 2008-12-04 13:39:36Z builder ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_trie$.getGlobalValue(), Symbols.symbol_function($sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym9$TRIE_NAME, $sym10$_CSETF_TRIE_NAME);
    Structures.def_csetf($sym11$TRIE_TOP_NODE, $sym12$_CSETF_TRIE_TOP_NODE);
    Structures.def_csetf($sym13$TRIE_UNIQUE, $sym14$_CSETF_TRIE_UNIQUE);
    Structures.def_csetf($sym15$TRIE_CASE_SENSITIVE, $sym16$_CSETF_TRIE_CASE_SENSITIVE);
    Structures.def_csetf($sym17$TRIE_ENTRY_TEST_FUNC, $sym18$_CSETF_TRIE_ENTRY_TEST_FUNC);
    Structures.def_csetf($sym19$TRIE_MULTI, $sym20$_CSETF_TRIE_MULTI);
    Structures.def_csetf($sym21$TRIE_MULTI_KEYS, $sym22$_CSETF_TRIE_MULTI_KEYS);
    Structures.def_csetf($sym23$TRIE_MULTI_KEY_FUNC, $sym24$_CSETF_TRIE_MULTI_KEY_FUNC);
    Equality.identity($sym1$TRIE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $kw0$ALL = makeKeyword("ALL");
  public static final SubLSymbol $sym1$TRIE = makeSymbol("TRIE");
  public static final SubLSymbol $sym2$TRIE_P = makeSymbol("TRIE-P");
  public static final SubLList $list3 = list(makeSymbol("NAME"), makeSymbol("TOP-NODE"), makeSymbol("UNIQUE"), makeSymbol("CASE-SENSITIVE"), makeSymbol("ENTRY-TEST-FUNC"), makeSymbol("MULTI"), makeSymbol("MULTI-KEYS"), makeSymbol("MULTI-KEY-FUNC"));
  public static final SubLList $list4 = list(makeKeyword("NAME"), makeKeyword("TOP-NODE"), makeKeyword("UNIQUE"), makeKeyword("CASE-SENSITIVE"), makeKeyword("ENTRY-TEST-FUNC"), makeKeyword("MULTI"), makeKeyword("MULTI-KEYS"), makeKeyword("MULTI-KEY-FUNC"));
  public static final SubLList $list5 = list(makeSymbol("TRIE-NAME"), makeSymbol("TRIE-TOP-NODE"), makeSymbol("TRIE-UNIQUE"), makeSymbol("TRIE-CASE-SENSITIVE"), makeSymbol("TRIE-ENTRY-TEST-FUNC"), makeSymbol("TRIE-MULTI"), makeSymbol("TRIE-MULTI-KEYS"), makeSymbol("TRIE-MULTI-KEY-FUNC"));
  public static final SubLList $list6 = list(makeSymbol("_CSETF-TRIE-NAME"), makeSymbol("_CSETF-TRIE-TOP-NODE"), makeSymbol("_CSETF-TRIE-UNIQUE"), makeSymbol("_CSETF-TRIE-CASE-SENSITIVE"), makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC"), makeSymbol("_CSETF-TRIE-MULTI"), makeSymbol("_CSETF-TRIE-MULTI-KEYS"), makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC"));
  public static final SubLSymbol $sym7$PRINT_TRIE = makeSymbol("PRINT-TRIE");
  public static final SubLSymbol $sym8$TRIE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TRIE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym9$TRIE_NAME = makeSymbol("TRIE-NAME");
  public static final SubLSymbol $sym10$_CSETF_TRIE_NAME = makeSymbol("_CSETF-TRIE-NAME");
  public static final SubLSymbol $sym11$TRIE_TOP_NODE = makeSymbol("TRIE-TOP-NODE");
  public static final SubLSymbol $sym12$_CSETF_TRIE_TOP_NODE = makeSymbol("_CSETF-TRIE-TOP-NODE");
  public static final SubLSymbol $sym13$TRIE_UNIQUE = makeSymbol("TRIE-UNIQUE");
  public static final SubLSymbol $sym14$_CSETF_TRIE_UNIQUE = makeSymbol("_CSETF-TRIE-UNIQUE");
  public static final SubLSymbol $sym15$TRIE_CASE_SENSITIVE = makeSymbol("TRIE-CASE-SENSITIVE");
  public static final SubLSymbol $sym16$_CSETF_TRIE_CASE_SENSITIVE = makeSymbol("_CSETF-TRIE-CASE-SENSITIVE");
  public static final SubLSymbol $sym17$TRIE_ENTRY_TEST_FUNC = makeSymbol("TRIE-ENTRY-TEST-FUNC");
  public static final SubLSymbol $sym18$_CSETF_TRIE_ENTRY_TEST_FUNC = makeSymbol("_CSETF-TRIE-ENTRY-TEST-FUNC");
  public static final SubLSymbol $sym19$TRIE_MULTI = makeSymbol("TRIE-MULTI");
  public static final SubLSymbol $sym20$_CSETF_TRIE_MULTI = makeSymbol("_CSETF-TRIE-MULTI");
  public static final SubLSymbol $sym21$TRIE_MULTI_KEYS = makeSymbol("TRIE-MULTI-KEYS");
  public static final SubLSymbol $sym22$_CSETF_TRIE_MULTI_KEYS = makeSymbol("_CSETF-TRIE-MULTI-KEYS");
  public static final SubLSymbol $sym23$TRIE_MULTI_KEY_FUNC = makeSymbol("TRIE-MULTI-KEY-FUNC");
  public static final SubLSymbol $sym24$_CSETF_TRIE_MULTI_KEY_FUNC = makeSymbol("_CSETF-TRIE-MULTI-KEY-FUNC");
  public static final SubLSymbol $kw25$NAME = makeKeyword("NAME");
  public static final SubLSymbol $kw26$TOP_NODE = makeKeyword("TOP-NODE");
  public static final SubLSymbol $kw27$UNIQUE = makeKeyword("UNIQUE");
  public static final SubLSymbol $kw28$CASE_SENSITIVE = makeKeyword("CASE-SENSITIVE");
  public static final SubLSymbol $kw29$ENTRY_TEST_FUNC = makeKeyword("ENTRY-TEST-FUNC");
  public static final SubLSymbol $kw30$MULTI = makeKeyword("MULTI");
  public static final SubLSymbol $kw31$MULTI_KEYS = makeKeyword("MULTI-KEYS");
  public static final SubLSymbol $kw32$MULTI_KEY_FUNC = makeKeyword("MULTI-KEY-FUNC");
  public static final SubLString $str33$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str34$__TRIE = makeString("#<TRIE");
  public static final SubLString $str35$__A = makeString(" ~A");
  public static final SubLString $str36$_UNIQUE = makeString(" UNIQUE");
  public static final SubLString $str37$_SENSITIVE = makeString(" SENSITIVE");
  public static final SubLString $str38$_INSENSITIVE = makeString(" INSENSITIVE");
  public static final SubLString $str39$__S = makeString(" ~S");
  public static final SubLString $str40$_ = makeString(">");
  public static final SubLString $str41$TRIE_resource_lock = makeString("TRIE resource lock");
  public static final SubLSymbol $kw42$FREE = makeKeyword("FREE");
  public static final SubLSymbol $kw43$END = makeKeyword("END");
  public static final SubLSymbol $kw44$TOP = makeKeyword("TOP");
  public static final SubLString $str45$_m___S = makeString("<m> ~S");
  public static final SubLString $str46$_____S = makeString(" :  ~S");
  public static final SubLSymbol $sym47$STRINGP = makeSymbol("STRINGP");
  public static final SubLString $str48$There_is_already_an_object__S_not = makeString("There is already an object ~S not ~S to ~S in the trie!");
  public static final SubLString $str49$Remove_it_anyway = makeString("Remove it anyway");
  public static final SubLString $str50$The_object_found_in_trie_for__S_i = makeString("The object found in trie for ~S is ~S, not ~S");
  public static final SubLString $str51$TRIE__S_does_not_have_unique_entr = makeString("TRIE ~S does not have unique entries");
  public static final SubLInteger $int52$1000 = makeInteger(1000);
  public static final SubLSymbol $kw53$MAPPING_DONE = makeKeyword("MAPPING-DONE");
  public static final SubLList $list54 = list(list(makeSymbol("OBJECT"), makeSymbol("TRIE"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("FORWARD"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list55 = list(makeKeyword("DONE"), makeKeyword("FORWARD"));
  public static final SubLSymbol $kw56$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw57$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw58$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym59$ITERATOR = makeUninternedSymbol("ITERATOR");
  public static final SubLSymbol $sym60$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym61$NEW_TRIE_ITERATOR = makeSymbol("NEW-TRIE-ITERATOR");
  public static final SubLSymbol $sym62$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym63$TRIE_ITERATOR_DONE = makeSymbol("TRIE-ITERATOR-DONE");
  public static final SubLSymbol $sym64$TRIE_ITERATOR_NEXT = makeSymbol("TRIE-ITERATOR-NEXT");
  public static final SubLSymbol $sym65$TRIE_ITERATOR_FINALIZE = makeSymbol("TRIE-ITERATOR-FINALIZE");
  public static final SubLString $str66$Ancestor_Tracking_Resource = makeString("Ancestor Tracking Resource");
  public static final SubLInteger $int67$100 = makeInteger(100);
  public static final SubLSymbol $kw68$ERROR = makeKeyword("ERROR");
  public static final SubLSymbol $sym69$MULTI_TRIE_P = makeSymbol("MULTI-TRIE-P");
  public static final SubLList $list70 = cons(makeSymbol("KEY"), makeSymbol("SUBTRIE"));
  public static final SubLString $str71$_A__A = makeString("~A:~A");
  public static final SubLSymbol $sym72$CAR = makeSymbol("CAR");
  public static final SubLList $list73 = cons(makeSymbol("MARK"), makeSymbol("SUBTRIE"));
  public static final SubLString $str74$___S_sub_tries = makeString("~%~S sub-tries");
  public static final SubLString $str75$____Sub_Trie__S = makeString("~%~%Sub-Trie ~S");
  public static final SubLSymbol $sym76$TRIE_LEAF_NODE_P = makeSymbol("TRIE-LEAF-NODE-P");

  //// Initializers

  public void declareFunctions() {
    declare_tries_file();
  }

  public void initializeVariables() {
    init_tries_file();
  }

  public void runTopLevelForms() {
    setup_tries_file();
  }

}
