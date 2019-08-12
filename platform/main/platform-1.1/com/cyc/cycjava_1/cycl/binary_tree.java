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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.*;
import com.cyc.tool.subl.util.*;


//dm import com.cyc.cycjava_1.cycl.access_macros;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.kb_utilities;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.misc_utilities;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.sbhl.sbhl_iteration;
//dm import com.cyc.cycjava_1.cycl.stacks;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;

public  final class binary_tree extends SubLTranslatedFile {

  //// Constructor

  private binary_tree() {}
  public static final SubLFile me = new binary_tree();
  public static final String myName = "com.cyc.cycjava_1.cycl.binary_tree";

  //// Definitions

  public static final class $btree_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $tag; }
    public SubLObject getField3() { return $state; }
    public SubLObject getField4() { return $lower; }
    public SubLObject getField5() { return $higher; }
    public SubLObject setField2(SubLObject value) { return $tag = value; }
    public SubLObject setField3(SubLObject value) { return $state = value; }
    public SubLObject setField4(SubLObject value) { return $lower = value; }
    public SubLObject setField5(SubLObject value) { return $higher = value; }
    public SubLObject $tag = NIL;
    public SubLObject $state = NIL;
    public SubLObject $lower = NIL;
    public SubLObject $higher = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($btree_native.class, $sym0$BTREE, $sym1$BTREE_P, $list2, $list3, new String[] {"$tag", "$state", "$lower", "$higher"}, $list4, $list5, $sym6$PRINT_BTREE);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static SubLSymbol $dtp_btree$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject btree_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11647");
    return NIL;
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject btree_p(SubLObject object) {
    return ((object.getClass() == $btree_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $btree_p$UnaryFunction extends UnaryFunction {
    public $btree_p$UnaryFunction() { super(extractFunctionNamed("BTREE-P")); }
    public SubLObject processItem(SubLObject arg1) { return btree_p(arg1); }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject bt_tag(SubLObject object) {
    checkType(object, $sym1$BTREE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject bt_state(SubLObject object) {
    checkType(object, $sym1$BTREE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject bt_lower(SubLObject object) {
    checkType(object, $sym1$BTREE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject bt_higher(SubLObject object) {
    checkType(object, $sym1$BTREE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject _csetf_bt_tag(SubLObject object, SubLObject value) {
    checkType(object, $sym1$BTREE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject _csetf_bt_state(SubLObject object, SubLObject value) {
    checkType(object, $sym1$BTREE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject _csetf_bt_lower(SubLObject object, SubLObject value) {
    checkType(object, $sym1$BTREE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject _csetf_bt_higher(SubLObject object, SubLObject value) {
    checkType(object, $sym1$BTREE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 1194) 
  public static final SubLObject make_btree(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $btree_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw16$TAG)) {
            _csetf_bt_tag(v_new, current_value);
          } else if (pcase_var.eql($kw17$STATE)) {
            _csetf_bt_state(v_new, current_value);
          } else if (pcase_var.eql($kw18$LOWER)) {
            _csetf_bt_lower(v_new, current_value);
          } else if (pcase_var.eql($kw19$HIGHER)) {
            _csetf_bt_higher(v_new, current_value);
          } else {
            Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Free list for BTREE objects */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  private static SubLSymbol $btree_free_list$ = null;

  /** Lock for BTREE object free list */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  private static SubLSymbol $btree_free_lock$ = null;

  /** Initialize a BTREE for use */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  public static final SubLObject init_btree(SubLObject btree) {
    _csetf_bt_tag(btree, NIL);
    _csetf_bt_state(btree, NIL);
    _csetf_bt_lower(btree, NIL);
    _csetf_bt_higher(btree, NIL);
    return btree;
  }

  /** Check if OBJECT is a BTREE that has been explicitly freed */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  public static final SubLObject free_btree_p(SubLObject object) {
    return makeBoolean(((NIL != btree_p(object))
           && (bt_state(object) == $kw27$FREE)));
  }

  /** Place a BTREE onto the free list */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  public static final SubLObject free_btree(SubLObject object) {
    checkType(object, $sym1$BTREE_P);
    if ((NIL == free_btree_p(object))) {
      object = init_btree(object);
      _csetf_bt_state(object, $kw27$FREE);
      if ((NIL != utilities_macros.$structure_resourcing_enabled$.getGlobalValue())) {
        {
          SubLObject lock = $btree_free_lock$.getGlobalValue();
          SubLObject release = NIL;
          try {
            release = Locks.seize_lock(lock);
            _csetf_bt_tag(object, $btree_free_list$.getGlobalValue());
            $btree_free_list$.setGlobalValue(object);
          } finally {
            if ((NIL != release)) {
              Locks.release_lock(lock);
            }
          }
        }
      }
      return T;
    }
    return NIL;
  }

  /** Get a BTREE from the free list, or make a new one if needed */
  @SubL(source = "cycl/binary-tree.lisp", position = 1789) 
  public static final SubLObject get_btree() {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == utilities_macros.$structure_resourcing_enabled$.getGlobalValue())) {
        if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
          return init_btree(Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11637"));
        } else {
          return init_btree(make_btree(UNPROVIDED));
        }
      }
      {
        SubLObject object = NIL;
        SubLObject found = NIL;
        SubLObject lock = $btree_free_lock$.getGlobalValue();
        SubLObject release = NIL;
        try {
          release = Locks.seize_lock(lock);
          object = $btree_free_list$.getGlobalValue();
          for (; (!(((NIL != found)
                || (NIL == object)))); ) {
            if ((NIL != free_btree_p(object))) {
              $btree_free_list$.setGlobalValue(bt_tag(object));
              found = T;
            } else {
              object = bt_tag(object);
            }
          }
          if ((NIL == found)) {
            if ((NIL != utilities_macros.$structure_resourcing_make_static$.getDynamicValue(thread))) {
              object = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11638");
            } else {
              object = make_btree(UNPROVIDED);
            }
            $btree_free_list$.setGlobalValue(NIL);
          }
        } finally {
          if ((NIL != release)) {
            Locks.release_lock(lock);
          }
        }
        return init_btree(object);
      }
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 3744) 
  private static SubLSymbol $validate_btrees$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 3827) 
  public static final SubLObject btree_insert(SubLObject val, SubLObject tag, SubLObject btree, SubLObject comp_func, SubLObject add_val_func) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $validate_btrees$.getDynamicValue(thread))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11602"))) {
            Errors.error($str57$Binary_Tree__S_is_broken_before_i, btree);
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject node = btree_find_aux(tag, btree, comp_func, T);
        SubLObject back = thread.secondMultipleValue();
        thread.resetMultipleValues();
        _csetf_bt_state(node, ((NIL != add_val_func) ? ((SubLObject) Functions.funcall(add_val_func, val, bt_state(node))) : NIL));
        {
          SubLObject ans = ((NIL != btree) ? ((SubLObject) btree) : node);
          if ((NIL != $validate_btrees$.getDynamicValue(thread))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11603"))) {
                Errors.error($str58$Binary_Tree__S_is_broken_after_in, ans);
              }
            }
          }
          return ans;
        }
      }
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 4443) 
  public static final SubLObject btree_remove(SubLObject val, SubLObject tag, SubLObject btree, SubLObject comp_func, SubLObject rem_val_func, SubLObject empty_func) {
    if ((empty_func == UNPROVIDED)) {
      empty_func = Symbols.symbol_function($sym43$NULL);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != $validate_btrees$.getDynamicValue(thread))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL == Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11604"))) {
            Errors.error($str59$Binary_Tree__S_is_broken_before_r, btree);
          }
        }
      }
      thread.resetMultipleValues();
      {
        SubLObject node = btree_find_aux(tag, btree, comp_func, UNPROVIDED);
        SubLObject back = thread.secondMultipleValue();
        thread.resetMultipleValues();
        {
          SubLObject ans = btree;
          if ((NIL != btree_p(node))) {
            _csetf_bt_state(node, Functions.funcall(rem_val_func, val, bt_state(node)));
            if ((NIL != Functions.funcall(empty_func, bt_state(node)))) {
              ans = btree_remove_aux(node, back, btree, comp_func);
            }
          }
          if ((NIL != $validate_btrees$.getDynamicValue(thread))) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
              if ((NIL == Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11605"))) {
                Errors.error($str60$Binary_Tree__S_is_broken_after_re, ans);
              }
            }
          }
          return ans;
        }
      }
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 5202) 
  public static final SubLObject btree_find_best(SubLObject btree) {
    {
      SubLObject back = NIL;
      SubLObject next = NIL;
      for (back = NIL, next = btree; (NIL != next); back = next, next = bt_lower(next)) {
      }
      return back;
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 6542) 
  private static SubLSymbol $btree_tags$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 8032) 
  public static final SubLObject incomparable(SubLObject func, SubLObject obj1, SubLObject obj2) {
    return makeBoolean((!(((NIL != Functions.funcall(func, obj1, obj2))
            || (NIL != Functions.funcall(func, obj2, obj1))))));
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 8222) 
  public static final SubLObject btree_find_aux(SubLObject tag, SubLObject btree, SubLObject comp_func, SubLObject createP) {
    if ((createP == UNPROVIDED)) {
      createP = NIL;
    }
    {
      SubLObject back = NIL;
      SubLObject next = NIL;
      for (back = NIL, next = btree; (!(((NIL == next)
            || (NIL != incomparable(comp_func, tag, bt_tag(next)))))); back = next, next = ((NIL != Functions.funcall(comp_func, tag, bt_tag(next))) ? ((SubLObject) bt_lower(next)) : bt_higher(next))) {
      }
      if (((NIL == next)
           && (NIL != createP))) {
        {
          SubLObject v_new = get_btree();
          _csetf_bt_tag(v_new, tag);
          if ((NIL != back)) {
            btree_insert_aux(v_new, back, comp_func);
          }
          next = v_new;
        }
      }
      return Values.values(next, back);
    }
  }

  /** Insert NEW off of OLD in direction indicated by COMP-FUNC comparison of tags. */
  @SubL(source = "cycl/binary-tree.lisp", position = 8703) 
  public static final SubLObject btree_insert_aux(SubLObject v_new, SubLObject old, SubLObject comp_func) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != Functions.funcall(comp_func, bt_tag(old), bt_tag(v_new)))) {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL != bt_higher(old))) {
            Errors.error($str63$_S_info_will_be_lost_inserting__S, bt_higher(old), v_new, old);
          }
        }
        _csetf_bt_higher(old, v_new);
      } else {
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((NIL != bt_lower(old))) {
            Errors.error($str63$_S_info_will_be_lost_inserting__S, bt_lower(old), v_new, old);
          }
        }
        _csetf_bt_lower(old, v_new);
      }
      return old;
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 9209) 
  private static SubLSymbol $btree_remove_debugging$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 9263) 
  public static final SubLObject btree_remove_aux(SubLObject node, SubLObject back, SubLObject top, SubLObject comp_func) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject low = bt_lower(node);
        SubLObject high = bt_higher(node);
        SubLObject replacement = NIL;
        SubLObject re_insert = NIL;
        SubLObject ans = top;
        SubLObject before = NIL;
        SubLObject after = NIL;
        if (((NIL != low)
             && (NIL != high))) {
          {
            SubLObject rand = random.random(TWO_INTEGER);
            replacement = (rand.numE(ZERO_INTEGER) ? ((SubLObject) low) : high);
            re_insert = (rand.numE(ZERO_INTEGER) ? ((SubLObject) high) : low);
          }
        } else {
          replacement = ((NIL != low) ? ((SubLObject) low) : ((NIL != high) ? ((SubLObject) high) : NIL));
        }
        if ((NIL != $btree_remove_debugging$.getDynamicValue(thread))) {
          before = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11600");
        }
        if ((NIL != re_insert)) {
          Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11595");
        }
        if ((NIL != back)) {
          if ((bt_lower(back) == node)) {
            _csetf_bt_lower(back, replacement);
          } else {
            _csetf_bt_higher(back, replacement);
          }
        } else {
          ans = replacement;
        }
        if ((NIL != $btree_remove_debugging$.getDynamicValue(thread))) {
          after = cons(bt_tag(node), Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11601"));
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((NIL == conses_high.subsetp(before, after, UNPROVIDED, UNPROVIDED))) {
              Errors.error($str64$The_tags__S_were_lost_from_tree__, conses_high.set_difference(before, after, UNPROVIDED, UNPROVIDED));
            }
          }
        }
        free_btree(node);
        return ans;
      }
    }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 10667) 
  private static SubLSymbol $cfasl_opcode_btree$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 11078) 
  public static final SubLObject cfasl_output_object_btree_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11611");
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 11534) 
  private static SubLSymbol $cfasl_opcode_legacy_btree_low$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 12016) 
  private static SubLSymbol $cfasl_opcode_legacy_btree_high$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 12474) 
  private static SubLSymbol $cfasl_opcode_legacy_btree_leaf$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 12914) 
  private static SubLSymbol $btree_balance_vector_index$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 13028) 
  private static SubLSymbol $btree_balance_vector$ = null;

  public static final class $avl_tree_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $root; }
    public SubLObject getField3() { return $test; }
    public SubLObject getField4() { return $size; }
    public SubLObject setField2(SubLObject value) { return $root = value; }
    public SubLObject setField3(SubLObject value) { return $test = value; }
    public SubLObject setField4(SubLObject value) { return $size = value; }
    public SubLObject $root = NIL;
    public SubLObject $test = NIL;
    public SubLObject $size = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($avl_tree_native.class, $sym73$AVL_TREE, $sym74$AVL_TREE_P, $list75, $list76, new String[] {"$root", "$test", "$size"}, $list77, $list78, $sym79$PRINT_AVL_TREE);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 16181) 
  public static SubLSymbol $dtp_avl_tree$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 16181) 
  public static final SubLObject avl_tree_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11645");
    return NIL;
  }

  public static final class $avl_tree_p$UnaryFunction extends UnaryFunction {
    public $avl_tree_p$UnaryFunction() { super(extractFunctionNamed("AVL-TREE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11558"); }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 21306) 
  private static SubLSymbol $cfasl_opcode_avl_tree$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 21431) 
  public static final SubLObject cfasl_output_object_avl_tree_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11609");
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 42036) 
  public static SubLSymbol $print_avl_tree_node_dataP$ = null;

  public static final class $avl_tree_node_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $data; }
    public SubLObject getField3() { return $balance; }
    public SubLObject getField4() { return $lower; }
    public SubLObject getField5() { return $higher; }
    public SubLObject setField2(SubLObject value) { return $data = value; }
    public SubLObject setField3(SubLObject value) { return $balance = value; }
    public SubLObject setField4(SubLObject value) { return $lower = value; }
    public SubLObject setField5(SubLObject value) { return $higher = value; }
    public SubLObject $data = NIL;
    public SubLObject $balance = NIL;
    public SubLObject $lower = NIL;
    public SubLObject $higher = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($avl_tree_node_native.class, $sym112$AVL_TREE_NODE, $sym113$AVL_TREE_NODE_P, $list114, $list115, new String[] {"$data", "$balance", "$lower", "$higher"}, $list116, $list117, $sym118$PRINT_AVL_TREE_NODE);
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 42293) 
  public static SubLSymbol $dtp_avl_tree_node$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 42293) 
  public static final SubLObject avl_tree_node_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11646");
    return NIL;
  }

  public static final class $avl_tree_node_p$UnaryFunction extends UnaryFunction {
    public $avl_tree_node_p$UnaryFunction() { super(extractFunctionNamed("AVL-TREE-NODE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11552"); }
  }

  @SubL(source = "cycl/binary-tree.lisp", position = 45757) 
  private static SubLSymbol $cfasl_opcode_avl_tree_node$ = null;

  @SubL(source = "cycl/binary-tree.lisp", position = 45891) 
  public static final SubLObject cfasl_output_object_avl_tree_node_method(SubLObject object, SubLObject stream) {
    return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11610");
  }

  public static final class $cfasl_input_avl_tree_node$UnaryFunction extends UnaryFunction {
    public $cfasl_input_avl_tree_node$UnaryFunction() { super(extractFunctionNamed("CFASL-INPUT-AVL-TREE-NODE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 11608"); }
  }

  public static final SubLObject declare_binary_tree_file() {
    declareFunction(myName, "btree_print_function_trampoline", "BTREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "btree_p", "BTREE-P", 1, 0, false); new $btree_p$UnaryFunction();
    declareFunction(myName, "bt_tag", "BT-TAG", 1, 0, false);
    declareFunction(myName, "bt_state", "BT-STATE", 1, 0, false);
    declareFunction(myName, "bt_lower", "BT-LOWER", 1, 0, false);
    declareFunction(myName, "bt_higher", "BT-HIGHER", 1, 0, false);
    declareFunction(myName, "_csetf_bt_tag", "_CSETF-BT-TAG", 2, 0, false);
    declareFunction(myName, "_csetf_bt_state", "_CSETF-BT-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_bt_lower", "_CSETF-BT-LOWER", 2, 0, false);
    declareFunction(myName, "_csetf_bt_higher", "_CSETF-BT-HIGHER", 2, 0, false);
    declareFunction(myName, "make_btree", "MAKE-BTREE", 0, 1, false);
    //declareFunction(myName, "print_btree", "PRINT-BTREE", 3, 0, false);
    //declareFunction(myName, "make_static_btree", "MAKE-STATIC-BTREE", 0, 0, false);
    declareFunction(myName, "init_btree", "INIT-BTREE", 1, 0, false);
    declareFunction(myName, "free_btree_p", "FREE-BTREE-P", 1, 0, false);
    declareFunction(myName, "free_btree", "FREE-BTREE", 1, 0, false);
    declareFunction(myName, "get_btree", "GET-BTREE", 0, 0, false);
    //declareFunction(myName, "free_entire_btree", "FREE-ENTIRE-BTREE", 1, 0, false);
    //declareMacro(myName, "do_btree_index", "DO-BTREE-INDEX");
    //declareFunction(myName, "do_btree_index_key", "DO-BTREE-INDEX-KEY", 1, 0, false);
    //declareFunction(myName, "do_btree_index_value", "DO-BTREE-INDEX-VALUE", 1, 0, false);
    //declareMacro(myName, "do_btree", "DO-BTREE");
    //declareFunction(myName, "do_btree_lower", "DO-BTREE-LOWER", 1, 0, false);
    //declareFunction(myName, "do_btree_higher", "DO-BTREE-HIGHER", 1, 0, false);
    declareFunction(myName, "btree_insert", "BTREE-INSERT", 5, 0, false);
    declareFunction(myName, "btree_remove", "BTREE-REMOVE", 5, 1, false);
    //declareFunction(myName, "btree_find", "BTREE-FIND", 3, 0, false);
    declareFunction(myName, "btree_find_best", "BTREE-FIND-BEST", 1, 0, false);
    //declareFunction(myName, "btree_find_worst", "BTREE-FIND-WORST", 1, 0, false);
    //declareFunction(myName, "map_btree", "MAP-BTREE", 2, 2, false);
    //declareFunction(myName, "map_btree_forward", "MAP-BTREE-FORWARD", 2, 2, false);
    //declareFunction(myName, "map_btree_backward", "MAP-BTREE-BACKWARD", 2, 2, false);
    //declareFunction(myName, "gather_btree_tag", "GATHER-BTREE-TAG", 1, 0, false);
    //declareFunction(myName, "btree_tags", "BTREE-TAGS", 1, 0, false);
    //declareFunction(myName, "btree_node_count", "BTREE-NODE-COUNT", 1, 0, false);
    //declareFunction(myName, "btree_deepest_depth", "BTREE-DEEPEST-DEPTH", 1, 0, false);
    //declareFunction(myName, "btree_shallowest_depth", "BTREE-SHALLOWEST-DEPTH", 1, 0, false);
    //declareFunction(myName, "btree_validate", "BTREE-VALIDATE", 2, 2, false);
    declareFunction(myName, "incomparable", "INCOMPARABLE", 3, 0, false);
    declareFunction(myName, "btree_find_aux", "BTREE-FIND-AUX", 3, 1, false);
    declareFunction(myName, "btree_insert_aux", "BTREE-INSERT-AUX", 3, 0, false);
    declareFunction(myName, "btree_remove_aux", "BTREE-REMOVE-AUX", 4, 0, false);
    //declareFunction(myName, "btree_insert_tree", "BTREE-INSERT-TREE", 3, 0, false);
    //declareFunction(myName, "cfasl_output_btree", "CFASL-OUTPUT-BTREE", 2, 0, false);
    declareFunction(myName, "cfasl_output_object_btree_method", "CFASL-OUTPUT-OBJECT-BTREE-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_input_btree", "CFASL-INPUT-BTREE", 1, 0, false);
    //declareFunction(myName, "cfasl_input_legacy_btree_low", "CFASL-INPUT-LEGACY-BTREE-LOW", 1, 0, false);
    //declareFunction(myName, "cfasl_input_legacy_btree_high", "CFASL-INPUT-LEGACY-BTREE-HIGH", 1, 0, false);
    //declareFunction(myName, "cfasl_input_legacy_btree_leaf", "CFASL-INPUT-LEGACY-BTREE-LEAF", 1, 0, false);
    //declareFunction(myName, "btree_balancedP", "BTREE-BALANCED?", 1, 0, false);
    //declareFunction(myName, "btree_balance", "BTREE-BALANCE", 1, 1, false);
    //declareFunction(myName, "btree_balance_insert_node", "BTREE-BALANCE-INSERT-NODE", 1, 0, false);
    //declareFunction(myName, "btree_balance_recursive", "BTREE-BALANCE-RECURSIVE", 3, 0, false);
    //declareFunction(myName, "btree_balance_split_point", "BTREE-BALANCE-SPLIT-POINT", 2, 0, false);
    declareFunction(myName, "avl_tree_print_function_trampoline", "AVL-TREE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "avl_tree_p", "AVL-TREE-P", 1, 0, false); new $avl_tree_p$UnaryFunction();
    //declareFunction(myName, "avlt_root", "AVLT-ROOT", 1, 0, false);
    //declareFunction(myName, "avlt_test", "AVLT-TEST", 1, 0, false);
    //declareFunction(myName, "avlt_size", "AVLT-SIZE", 1, 0, false);
    //declareFunction(myName, "_csetf_avlt_root", "_CSETF-AVLT-ROOT", 2, 0, false);
    //declareFunction(myName, "_csetf_avlt_test", "_CSETF-AVLT-TEST", 2, 0, false);
    //declareFunction(myName, "_csetf_avlt_size", "_CSETF-AVLT-SIZE", 2, 0, false);
    //declareFunction(myName, "make_avl_tree", "MAKE-AVL-TREE", 0, 1, false);
    //declareFunction(myName, "print_avl_tree", "PRINT-AVL-TREE", 3, 0, false);
    //declareFunction(myName, "new_avl_tree", "NEW-AVL-TREE", 1, 0, false);
    //declareFunction(myName, "avl_tree_sort_test", "AVL-TREE-SORT-TEST", 1, 0, false);
    //declareFunction(myName, "avl_tree_size", "AVL-TREE-SIZE", 1, 0, false);
    //declareFunction(myName, "avl_tree_emptyP", "AVL-TREE-EMPTY?", 1, 0, false);
    //declareFunction(myName, "avl_tree_find", "AVL-TREE-FIND", 2, 0, false);
    //declareFunction(myName, "avl_tree_find_least", "AVL-TREE-FIND-LEAST", 1, 2, false);
    //declareFunction(myName, "avl_tree_find_greatest", "AVL-TREE-FIND-GREATEST", 1, 2, false);
    //declareFunction(myName, "avl_tree_insert", "AVL-TREE-INSERT", 2, 0, false);
    //declareFunction(myName, "avl_tree_remove", "AVL-TREE-REMOVE", 2, 0, false);
    //declareFunction(myName, "clear_avl_tree", "CLEAR-AVL-TREE", 1, 0, false);
    //declareFunction(myName, "copy_avl_tree", "COPY-AVL-TREE", 1, 0, false);
    //declareFunction(myName, "avl_trees_equalP", "AVL-TREES-EQUAL?", 2, 1, false);
    //declareFunction(myName, "list_to_avl_tree", "LIST-TO-AVL-TREE", 2, 0, false);
    //declareFunction(myName, "new_avl_tree_iterator", "NEW-AVL-TREE-ITERATOR", 1, 3, false);
    //declareFunction(myName, "new_avl_tree_sbhl_iterator", "NEW-AVL-TREE-SBHL-ITERATOR", 1, 3, false);
    declareFunction(myName, "cfasl_output_object_avl_tree_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_avl_tree", "CFASL-OUTPUT-AVL-TREE", 2, 0, false);
    //declareFunction(myName, "cfasl_input_avl_tree", "CFASL-INPUT-AVL-TREE", 1, 0, false);
    //declareFunction(myName, "avl_tree_balancedP", "AVL-TREE-BALANCED?", 1, 0, false);
    //declareFunction(myName, "avl_tree_balancedP_int", "AVL-TREE-BALANCED?-INT", 1, 0, false);
    //declareFunction(myName, "avl_tree_height", "AVL-TREE-HEIGHT", 1, 0, false);
    //declareFunction(myName, "avl_tree_node_height", "AVL-TREE-NODE-HEIGHT", 1, 0, false);
    //declareFunction(myName, "verify_avl_tree", "VERIFY-AVL-TREE", 1, 0, false);
    //declareFunction(myName, "verify_avl_tree_int", "VERIFY-AVL-TREE-INT", 1, 0, false);
    //declareFunction(myName, "avl_tree_less_thanP", "AVL-TREE-LESS-THAN?", 3, 0, false);
    //declareFunction(myName, "avl_tree_greater_thanP", "AVL-TREE-GREATER-THAN?", 3, 0, false);
    //declareFunction(myName, "avl_tree_find_exact", "AVL-TREE-FIND-EXACT", 3, 0, false);
    //declareFunction(myName, "avl_tree_find_bounded_below", "AVL-TREE-FIND-BOUNDED-BELOW", 4, 0, false);
    //declareFunction(myName, "avl_tree_find_bounded_above", "AVL-TREE-FIND-BOUNDED-ABOVE", 4, 0, false);
    //declareFunction(myName, "avl_tree_find_unbounded_below", "AVL-TREE-FIND-UNBOUNDED-BELOW", 1, 0, false);
    //declareFunction(myName, "avl_tree_find_unbounded_below_int", "AVL-TREE-FIND-UNBOUNDED-BELOW-INT", 1, 0, false);
    //declareFunction(myName, "avl_tree_find_unbounded_above", "AVL-TREE-FIND-UNBOUNDED-ABOVE", 1, 0, false);
    //declareFunction(myName, "avl_tree_find_unbounded_above_int", "AVL-TREE-FIND-UNBOUNDED-ABOVE-INT", 1, 0, false);
    //declareFunction(myName, "avl_tree_insert_and_rebalance", "AVL-TREE-INSERT-AND-REBALANCE", 2, 0, false);
    //declareFunction(myName, "avl_tree_insert_item", "AVL-TREE-INSERT-ITEM", 3, 0, false);
    //declareFunction(myName, "avl_tree_insert_item_below", "AVL-TREE-INSERT-ITEM-BELOW", 3, 0, false);
    //declareFunction(myName, "avl_tree_insert_item_above", "AVL-TREE-INSERT-ITEM-ABOVE", 3, 0, false);
    //declareFunction(myName, "avl_tree_remove_and_rebalance", "AVL-TREE-REMOVE-AND-REBALANCE", 2, 0, false);
    //declareFunction(myName, "avl_tree_remove_item", "AVL-TREE-REMOVE-ITEM", 3, 0, false);
    //declareFunction(myName, "avl_tree_remove_node", "AVL-TREE-REMOVE-NODE", 1, 0, false);
    //declareFunction(myName, "avl_tree_remove_node_int", "AVL-TREE-REMOVE-NODE-INT", 2, 0, false);
    //declareFunction(myName, "avl_tree_remove_item_below", "AVL-TREE-REMOVE-ITEM-BELOW", 3, 0, false);
    //declareFunction(myName, "avl_tree_remove_item_above", "AVL-TREE-REMOVE-ITEM-ABOVE", 3, 0, false);
    //declareFunction(myName, "avl_tree_rebalance_at_node_negative", "AVL-TREE-REBALANCE-AT-NODE-NEGATIVE", 1, 0, false);
    //declareFunction(myName, "avl_tree_rebalance_at_node_positive", "AVL-TREE-REBALANCE-AT-NODE-POSITIVE", 1, 0, false);
    //declareFunction(myName, "avl_tree_iterator_state", "AVL-TREE-ITERATOR-STATE", 4, 0, false);
    //declareFunction(myName, "initialize_avl_tree_iterator_stack_forward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-FORWARD", 5, 0, false);
    //declareFunction(myName, "initialize_avl_tree_iterator_stack_backward", "INITIALIZE-AVL-TREE-ITERATOR-STACK-BACKWARD", 5, 0, false);
    //declareFunction(myName, "avl_tree_iterator_done", "AVL-TREE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "avl_tree_iterator_next", "AVL-TREE-ITERATOR-NEXT", 1, 0, false);
    //declareFunction(myName, "avl_tree_iterator_next_forward", "AVL-TREE-ITERATOR-NEXT-FORWARD", 4, 0, false);
    //declareFunction(myName, "avl_tree_iterator_next_backward", "AVL-TREE-ITERATOR-NEXT-BACKWARD", 4, 0, false);
    //declareFunction(myName, "sbhl_avl_tree_iterator_done", "SBHL-AVL-TREE-ITERATOR-DONE", 1, 0, false);
    //declareFunction(myName, "sbhl_avl_tree_iterator_next", "SBHL-AVL-TREE-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "avl_tree_node_print_function_trampoline", "AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    //declareFunction(myName, "avl_tree_node_p", "AVL-TREE-NODE-P", 1, 0, false); new $avl_tree_node_p$UnaryFunction();
    //declareFunction(myName, "avltn_data", "AVLTN-DATA", 1, 0, false);
    //declareFunction(myName, "avltn_balance", "AVLTN-BALANCE", 1, 0, false);
    //declareFunction(myName, "avltn_lower", "AVLTN-LOWER", 1, 0, false);
    //declareFunction(myName, "avltn_higher", "AVLTN-HIGHER", 1, 0, false);
    //declareFunction(myName, "_csetf_avltn_data", "_CSETF-AVLTN-DATA", 2, 0, false);
    //declareFunction(myName, "_csetf_avltn_balance", "_CSETF-AVLTN-BALANCE", 2, 0, false);
    //declareFunction(myName, "_csetf_avltn_lower", "_CSETF-AVLTN-LOWER", 2, 0, false);
    //declareFunction(myName, "_csetf_avltn_higher", "_CSETF-AVLTN-HIGHER", 2, 0, false);
    //declareFunction(myName, "make_avl_tree_node", "MAKE-AVL-TREE-NODE", 0, 1, false);
    //declareFunction(myName, "print_avl_tree_node", "PRINT-AVL-TREE-NODE", 3, 0, false);
    //declareFunction(myName, "new_avl_tree_node", "NEW-AVL-TREE-NODE", 1, 3, false);
    //declareFunction(myName, "avl_tree_node_data", "AVL-TREE-NODE-DATA", 1, 0, false);
    //declareFunction(myName, "avl_tree_node_balance", "AVL-TREE-NODE-BALANCE", 1, 0, false);
    //declareFunction(myName, "avl_tree_node_lower", "AVL-TREE-NODE-LOWER", 1, 0, false);
    //declareFunction(myName, "avl_tree_node_higher", "AVL-TREE-NODE-HIGHER", 1, 0, false);
    //declareFunction(myName, "increment_avl_tree_node_balance", "INCREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false);
    //declareFunction(myName, "decrement_avl_tree_node_balance", "DECREMENT-AVL-TREE-NODE-BALANCE", 1, 1, false);
    //declareFunction(myName, "reset_avl_tree_node_balance", "RESET-AVL-TREE-NODE-BALANCE", 2, 0, false);
    //declareFunction(myName, "reset_avl_tree_node_lower", "RESET-AVL-TREE-NODE-LOWER", 2, 0, false);
    //declareFunction(myName, "reset_avl_tree_node_higher", "RESET-AVL-TREE-NODE-HIGHER", 2, 0, false);
    //declareFunction(myName, "avl_tree_node_has_lower_nodeP", "AVL-TREE-NODE-HAS-LOWER-NODE?", 1, 0, false);
    //declareFunction(myName, "avl_tree_node_has_higher_nodeP", "AVL-TREE-NODE-HAS-HIGHER-NODE?", 1, 0, false);
    //declareFunction(myName, "print_avl_tree_node_contents", "PRINT-AVL-TREE-NODE-CONTENTS", 1, 1, false);
    //declareFunction(myName, "copy_avl_tree_node", "COPY-AVL-TREE-NODE", 1, 0, false);
    //declareFunction(myName, "avl_tree_nodes_equalP", "AVL-TREE-NODES-EQUAL?", 2, 1, false);
    declareFunction(myName, "cfasl_output_object_avl_tree_node_method", "CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD", 2, 0, false);
    //declareFunction(myName, "cfasl_output_avl_tree_node", "CFASL-OUTPUT-AVL-TREE-NODE", 2, 0, false);
    //declareFunction(myName, "cfasl_input_avl_tree_node", "CFASL-INPUT-AVL-TREE-NODE", 1, 0, false); new $cfasl_input_avl_tree_node$UnaryFunction();
    return NIL;
  }

  public static final SubLObject init_binary_tree_file() {
    $dtp_btree$ = defconstant("*DTP-BTREE*", $sym0$BTREE);
    $btree_free_list$ = deflexical("*BTREE-FREE-LIST*", NIL);
    $btree_free_lock$ = deflexical("*BTREE-FREE-LOCK*", Locks.make_lock($str26$BTREE_resource_lock));
    $validate_btrees$ = defparameter("*VALIDATE-BTREES*", NIL);
    $btree_tags$ = defparameter("*BTREE-TAGS*", NIL);
    $btree_remove_debugging$ = defparameter("*BTREE-REMOVE-DEBUGGING*", NIL);
    $cfasl_opcode_btree$ = defconstant("*CFASL-OPCODE-BTREE*", NINETEEN_INTEGER);
    $cfasl_opcode_legacy_btree_low$ = defconstant("*CFASL-OPCODE-LEGACY-BTREE-LOW*", TWENTY_INTEGER);
    $cfasl_opcode_legacy_btree_high$ = defconstant("*CFASL-OPCODE-LEGACY-BTREE-HIGH*", $int68$21);
    $cfasl_opcode_legacy_btree_leaf$ = defconstant("*CFASL-OPCODE-LEGACY-BTREE-LEAF*", $int70$22);
    $btree_balance_vector_index$ = defparameter("*BTREE-BALANCE-VECTOR-INDEX*", ZERO_INTEGER);
    $btree_balance_vector$ = defparameter("*BTREE-BALANCE-VECTOR*", NIL);
    $dtp_avl_tree$ = defconstant("*DTP-AVL-TREE*", $sym73$AVL_TREE);
    $cfasl_opcode_avl_tree$ = defconstant("*CFASL-OPCODE-AVL-TREE*", $int100$80);
    $print_avl_tree_node_dataP$ = defparameter("*PRINT-AVL-TREE-NODE-DATA?*", T);
    $dtp_avl_tree_node$ = defconstant("*DTP-AVL-TREE-NODE*", $sym112$AVL_TREE_NODE);
    $cfasl_opcode_avl_tree_node$ = defconstant("*CFASL-OPCODE-AVL-TREE-NODE*", $int136$81);
    return NIL;
  }

  public static final SubLObject setup_binary_tree_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), Symbols.symbol_function($sym7$BTREE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$BT_TAG, $sym9$_CSETF_BT_TAG);
    Structures.def_csetf($sym10$BT_STATE, $sym11$_CSETF_BT_STATE);
    Structures.def_csetf($sym12$BT_LOWER, $sym13$_CSETF_BT_LOWER);
    Structures.def_csetf($sym14$BT_HIGHER, $sym15$_CSETF_BT_HIGHER);
    Equality.identity($sym0$BTREE);
    access_macros.register_macro_helper($sym35$DO_BTREE_INDEX_KEY, $sym37$DO_BTREE_INDEX);
    access_macros.register_macro_helper($sym36$DO_BTREE_INDEX_VALUE, $sym37$DO_BTREE_INDEX);
    access_macros.register_macro_helper($sym33$DO_BTREE, $sym37$DO_BTREE_INDEX);
    access_macros.register_macro_helper($sym47$DO_BTREE_LOWER, $sym33$DO_BTREE);
    access_macros.register_macro_helper($sym49$DO_BTREE_HIGHER, $sym33$DO_BTREE);
    cfasl.register_cfasl_input_function($cfasl_opcode_btree$.getGlobalValue(), $sym65$CFASL_INPUT_BTREE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_btree$.getGlobalValue(), Symbols.symbol_function($sym66$CFASL_OUTPUT_OBJECT_BTREE_METHOD));
    cfasl.register_cfasl_input_function($cfasl_opcode_legacy_btree_low$.getGlobalValue(), $sym67$CFASL_INPUT_LEGACY_BTREE_LOW);
    cfasl.register_cfasl_input_function($cfasl_opcode_legacy_btree_high$.getGlobalValue(), $sym69$CFASL_INPUT_LEGACY_BTREE_HIGH);
    cfasl.register_cfasl_input_function($cfasl_opcode_legacy_btree_leaf$.getGlobalValue(), $sym71$CFASL_INPUT_LEGACY_BTREE_LEAF);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), Symbols.symbol_function($sym80$AVL_TREE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym81$AVLT_ROOT, $sym82$_CSETF_AVLT_ROOT);
    Structures.def_csetf($sym83$AVLT_TEST, $sym84$_CSETF_AVLT_TEST);
    Structures.def_csetf($sym85$AVLT_SIZE, $sym86$_CSETF_AVLT_SIZE);
    Equality.identity($sym73$AVL_TREE);
    cfasl.register_cfasl_input_function($cfasl_opcode_avl_tree$.getGlobalValue(), $sym101$CFASL_INPUT_AVL_TREE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree$.getGlobalValue(), Symbols.symbol_function($sym102$CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), Symbols.symbol_function($sym119$AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym120$AVLTN_DATA, $sym121$_CSETF_AVLTN_DATA);
    Structures.def_csetf($sym122$AVLTN_BALANCE, $sym123$_CSETF_AVLTN_BALANCE);
    Structures.def_csetf($sym124$AVLTN_LOWER, $sym125$_CSETF_AVLTN_LOWER);
    Structures.def_csetf($sym126$AVLTN_HIGHER, $sym127$_CSETF_AVLTN_HIGHER);
    Equality.identity($sym112$AVL_TREE_NODE);
    cfasl.register_cfasl_input_function($cfasl_opcode_avl_tree_node$.getGlobalValue(), $sym137$CFASL_INPUT_AVL_TREE_NODE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_avl_tree_node$.getGlobalValue(), Symbols.symbol_function($sym138$CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD));
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$BTREE = makeSymbol("BTREE");
  public static final SubLSymbol $sym1$BTREE_P = makeSymbol("BTREE-P");
  public static final SubLList $list2 = list(makeSymbol("TAG"), makeSymbol("STATE"), makeSymbol("LOWER"), makeSymbol("HIGHER"));
  public static final SubLList $list3 = list(makeKeyword("TAG"), makeKeyword("STATE"), makeKeyword("LOWER"), makeKeyword("HIGHER"));
  public static final SubLList $list4 = list(makeSymbol("BT-TAG"), makeSymbol("BT-STATE"), makeSymbol("BT-LOWER"), makeSymbol("BT-HIGHER"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-BT-TAG"), makeSymbol("_CSETF-BT-STATE"), makeSymbol("_CSETF-BT-LOWER"), makeSymbol("_CSETF-BT-HIGHER"));
  public static final SubLSymbol $sym6$PRINT_BTREE = makeSymbol("PRINT-BTREE");
  public static final SubLSymbol $sym7$BTREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("BTREE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$BT_TAG = makeSymbol("BT-TAG");
  public static final SubLSymbol $sym9$_CSETF_BT_TAG = makeSymbol("_CSETF-BT-TAG");
  public static final SubLSymbol $sym10$BT_STATE = makeSymbol("BT-STATE");
  public static final SubLSymbol $sym11$_CSETF_BT_STATE = makeSymbol("_CSETF-BT-STATE");
  public static final SubLSymbol $sym12$BT_LOWER = makeSymbol("BT-LOWER");
  public static final SubLSymbol $sym13$_CSETF_BT_LOWER = makeSymbol("_CSETF-BT-LOWER");
  public static final SubLSymbol $sym14$BT_HIGHER = makeSymbol("BT-HIGHER");
  public static final SubLSymbol $sym15$_CSETF_BT_HIGHER = makeSymbol("_CSETF-BT-HIGHER");
  public static final SubLSymbol $kw16$TAG = makeKeyword("TAG");
  public static final SubLSymbol $kw17$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw18$LOWER = makeKeyword("LOWER");
  public static final SubLSymbol $kw19$HIGHER = makeKeyword("HIGHER");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$__BT_ = makeString("#<BT:");
  public static final SubLString $str22$_ = makeString("@");
  public static final SubLString $str23$_ = makeString(":");
  public static final SubLString $str24$_ = makeString(">");
  public static final SubLString $str25$__S_ = makeString("[~S]");
  public static final SubLString $str26$BTREE_resource_lock = makeString("BTREE resource lock");
  public static final SubLSymbol $kw27$FREE = makeKeyword("FREE");
  public static final SubLList $list28 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("BTREE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list29 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw30$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw31$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym32$SUBTREE = makeUninternedSymbol("SUBTREE");
  public static final SubLSymbol $sym33$DO_BTREE = makeSymbol("DO-BTREE");
  public static final SubLSymbol $sym34$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym35$DO_BTREE_INDEX_KEY = makeSymbol("DO-BTREE-INDEX-KEY");
  public static final SubLSymbol $sym36$DO_BTREE_INDEX_VALUE = makeSymbol("DO-BTREE-INDEX-VALUE");
  public static final SubLSymbol $sym37$DO_BTREE_INDEX = makeSymbol("DO-BTREE-INDEX");
  public static final SubLList $list38 = list(list(makeSymbol("VAR"), makeSymbol("BTREE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym39$STACK = makeUninternedSymbol("STACK");
  public static final SubLList $list40 = list(list(makeSymbol("QUOTE"), NIL));
  public static final SubLSymbol $sym41$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym42$COR = makeSymbol("COR");
  public static final SubLSymbol $sym43$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym44$CSETQ = makeSymbol("CSETQ");
  public static final SubLList $list45 = list(NIL);
  public static final SubLSymbol $sym46$LOWER = makeSymbol("LOWER");
  public static final SubLSymbol $sym47$DO_BTREE_LOWER = makeSymbol("DO-BTREE-LOWER");
  public static final SubLSymbol $sym48$HIGHER = makeSymbol("HIGHER");
  public static final SubLSymbol $sym49$DO_BTREE_HIGHER = makeSymbol("DO-BTREE-HIGHER");
  public static final SubLSymbol $sym50$PCOND = makeSymbol("PCOND");
  public static final SubLSymbol $sym51$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym52$CPUSH = makeSymbol("CPUSH");
  public static final SubLList $list53 = list(makeSymbol("LOWER"));
  public static final SubLList $list54 = list(makeSymbol("HIGHER"));
  public static final SubLSymbol $sym55$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym56$CPOP = makeSymbol("CPOP");
  public static final SubLString $str57$Binary_Tree__S_is_broken_before_i = makeString("Binary Tree ~S is broken before insert!");
  public static final SubLString $str58$Binary_Tree__S_is_broken_after_in = makeString("Binary Tree ~S is broken after insert!");
  public static final SubLString $str59$Binary_Tree__S_is_broken_before_r = makeString("Binary Tree ~S is broken before removal!");
  public static final SubLString $str60$Binary_Tree__S_is_broken_after_re = makeString("Binary Tree ~S is broken after removal!");
  public static final SubLSymbol $sym61$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym62$GATHER_BTREE_TAG = makeSymbol("GATHER-BTREE-TAG");
  public static final SubLString $str63$_S_info_will_be_lost_inserting__S = makeString("~S info will be lost inserting ~S into ~S");
  public static final SubLString $str64$The_tags__S_were_lost_from_tree__ = makeString("The tags ~S were lost from tree ~S");
  public static final SubLSymbol $sym65$CFASL_INPUT_BTREE = makeSymbol("CFASL-INPUT-BTREE");
  public static final SubLSymbol $sym66$CFASL_OUTPUT_OBJECT_BTREE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-BTREE-METHOD");
  public static final SubLSymbol $sym67$CFASL_INPUT_LEGACY_BTREE_LOW = makeSymbol("CFASL-INPUT-LEGACY-BTREE-LOW");
  public static final SubLInteger $int68$21 = makeInteger(21);
  public static final SubLSymbol $sym69$CFASL_INPUT_LEGACY_BTREE_HIGH = makeSymbol("CFASL-INPUT-LEGACY-BTREE-HIGH");
  public static final SubLInteger $int70$22 = makeInteger(22);
  public static final SubLSymbol $sym71$CFASL_INPUT_LEGACY_BTREE_LEAF = makeSymbol("CFASL-INPUT-LEGACY-BTREE-LEAF");
  public static final SubLSymbol $sym72$BTREE_BALANCE_INSERT_NODE = makeSymbol("BTREE-BALANCE-INSERT-NODE");
  public static final SubLSymbol $sym73$AVL_TREE = makeSymbol("AVL-TREE");
  public static final SubLSymbol $sym74$AVL_TREE_P = makeSymbol("AVL-TREE-P");
  public static final SubLList $list75 = list(makeSymbol("ROOT"), makeSymbol("TEST"), makeSymbol("SIZE"));
  public static final SubLList $list76 = list(makeKeyword("ROOT"), makeKeyword("TEST"), makeKeyword("SIZE"));
  public static final SubLList $list77 = list(makeSymbol("AVLT-ROOT"), makeSymbol("AVLT-TEST"), makeSymbol("AVLT-SIZE"));
  public static final SubLList $list78 = list(makeSymbol("_CSETF-AVLT-ROOT"), makeSymbol("_CSETF-AVLT-TEST"), makeSymbol("_CSETF-AVLT-SIZE"));
  public static final SubLSymbol $sym79$PRINT_AVL_TREE = makeSymbol("PRINT-AVL-TREE");
  public static final SubLSymbol $sym80$AVL_TREE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AVL-TREE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym81$AVLT_ROOT = makeSymbol("AVLT-ROOT");
  public static final SubLSymbol $sym82$_CSETF_AVLT_ROOT = makeSymbol("_CSETF-AVLT-ROOT");
  public static final SubLSymbol $sym83$AVLT_TEST = makeSymbol("AVLT-TEST");
  public static final SubLSymbol $sym84$_CSETF_AVLT_TEST = makeSymbol("_CSETF-AVLT-TEST");
  public static final SubLSymbol $sym85$AVLT_SIZE = makeSymbol("AVLT-SIZE");
  public static final SubLSymbol $sym86$_CSETF_AVLT_SIZE = makeSymbol("_CSETF-AVLT-SIZE");
  public static final SubLSymbol $kw87$ROOT = makeKeyword("ROOT");
  public static final SubLSymbol $kw88$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw89$SIZE = makeKeyword("SIZE");
  public static final SubLString $str90$__ = makeString("#<");
  public static final SubLSymbol $kw91$STREAM = makeKeyword("STREAM");
  public static final SubLString $str92$test__a_size__a = makeString("test=~a size=~a");
  public static final SubLSymbol $kw93$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym94$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $kw95$FORWARD = makeKeyword("FORWARD");
  public static final SubLSymbol $sym96$AVL_TREE_ITERATOR_DONE = makeSymbol("AVL-TREE-ITERATOR-DONE");
  public static final SubLSymbol $sym97$AVL_TREE_ITERATOR_NEXT = makeSymbol("AVL-TREE-ITERATOR-NEXT");
  public static final SubLSymbol $sym98$SBHL_AVL_TREE_ITERATOR_DONE = makeSymbol("SBHL-AVL-TREE-ITERATOR-DONE");
  public static final SubLSymbol $sym99$SBHL_AVL_TREE_ITERATOR_NEXT = makeSymbol("SBHL-AVL-TREE-ITERATOR-NEXT");
  public static final SubLInteger $int100$80 = makeInteger(80);
  public static final SubLSymbol $sym101$CFASL_INPUT_AVL_TREE = makeSymbol("CFASL-INPUT-AVL-TREE");
  public static final SubLSymbol $sym102$CFASL_OUTPUT_OBJECT_AVL_TREE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-AVL-TREE-METHOD");
  public static final SubLList $list103 = list(MINUS_ONE_INTEGER, ZERO_INTEGER, ONE_INTEGER);
  public static final SubLSymbol $sym104$_ = makeSymbol("<");
  public static final SubLSymbol $sym105$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym106$SBHL_DATE_ = makeSymbol("SBHL-DATE<");
  public static final SubLString $str107$Cyc_Time_feature_not_present = makeString("Cyc-Time feature not present");
  public static final SubLInteger $int108$_2 = makeInteger(-2);
  public static final SubLString $str109$AVL_tree__a_is_corrupt_ = makeString("AVL tree ~a is corrupt.");
  public static final SubLString $str110$AVL_tree__a_is_corrupt = makeString("AVL tree ~a is corrupt");
  public static final SubLList $list111 = list(makeSymbol("TREE"), makeSymbol("STACK"), makeSymbol("END"), makeSymbol("DIRECTION"));
  public static final SubLSymbol $sym112$AVL_TREE_NODE = makeSymbol("AVL-TREE-NODE");
  public static final SubLSymbol $sym113$AVL_TREE_NODE_P = makeSymbol("AVL-TREE-NODE-P");
  public static final SubLList $list114 = list(makeSymbol("DATA"), makeSymbol("BALANCE"), makeSymbol("LOWER"), makeSymbol("HIGHER"));
  public static final SubLList $list115 = list(makeKeyword("DATA"), makeKeyword("BALANCE"), makeKeyword("LOWER"), makeKeyword("HIGHER"));
  public static final SubLList $list116 = list(makeSymbol("AVLTN-DATA"), makeSymbol("AVLTN-BALANCE"), makeSymbol("AVLTN-LOWER"), makeSymbol("AVLTN-HIGHER"));
  public static final SubLList $list117 = list(makeSymbol("_CSETF-AVLTN-DATA"), makeSymbol("_CSETF-AVLTN-BALANCE"), makeSymbol("_CSETF-AVLTN-LOWER"), makeSymbol("_CSETF-AVLTN-HIGHER"));
  public static final SubLSymbol $sym118$PRINT_AVL_TREE_NODE = makeSymbol("PRINT-AVL-TREE-NODE");
  public static final SubLSymbol $sym119$AVL_TREE_NODE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("AVL-TREE-NODE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym120$AVLTN_DATA = makeSymbol("AVLTN-DATA");
  public static final SubLSymbol $sym121$_CSETF_AVLTN_DATA = makeSymbol("_CSETF-AVLTN-DATA");
  public static final SubLSymbol $sym122$AVLTN_BALANCE = makeSymbol("AVLTN-BALANCE");
  public static final SubLSymbol $sym123$_CSETF_AVLTN_BALANCE = makeSymbol("_CSETF-AVLTN-BALANCE");
  public static final SubLSymbol $sym124$AVLTN_LOWER = makeSymbol("AVLTN-LOWER");
  public static final SubLSymbol $sym125$_CSETF_AVLTN_LOWER = makeSymbol("_CSETF-AVLTN-LOWER");
  public static final SubLSymbol $sym126$AVLTN_HIGHER = makeSymbol("AVLTN-HIGHER");
  public static final SubLSymbol $sym127$_CSETF_AVLTN_HIGHER = makeSymbol("_CSETF-AVLTN-HIGHER");
  public static final SubLSymbol $kw128$DATA = makeKeyword("DATA");
  public static final SubLSymbol $kw129$BALANCE = makeKeyword("BALANCE");
  public static final SubLString $str130$__a_ = makeString("(~a)");
  public static final SubLString $str131$__Data______a = makeString("~%Data:    ~a");
  public static final SubLString $str132$__Balance___a = makeString("~%Balance: ~a");
  public static final SubLString $str133$__Lower_____a = makeString("~%Lower:   ~a");
  public static final SubLString $str134$__Higher____a = makeString("~%Higher:  ~a");
  public static final SubLString $str135$__ = makeString("~%");
  public static final SubLInteger $int136$81 = makeInteger(81);
  public static final SubLSymbol $sym137$CFASL_INPUT_AVL_TREE_NODE = makeSymbol("CFASL-INPUT-AVL-TREE-NODE");
  public static final SubLSymbol $sym138$CFASL_OUTPUT_OBJECT_AVL_TREE_NODE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-AVL-TREE-NODE-METHOD");

  //// Initializers

  public void declareFunctions() {
    declare_binary_tree_file();
  }

  public void initializeVariables() {
    init_binary_tree_file();
  }

  public void runTopLevelForms() {
    setup_binary_tree_file();
  }

}
