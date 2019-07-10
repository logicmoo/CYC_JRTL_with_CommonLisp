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
//dm import com.cyc.cycjava_1.cycl.binary_tree;
//dm import com.cyc.cycjava_1.cycl.cfasl;
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.iteration;
//dm import com.cyc.cycjava_1.cycl.list_utilities;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;

public  final class queues extends SubLTranslatedFile {

  //// Constructor

  private queues() {}
  public static final SubLFile me = new queues();
  public static final String myName = "com.cyc.cycjava_1.cycl.queues";

  //// Definitions

  public static final class $queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $num; }
    public SubLObject getField3() { return $elements; }
    public SubLObject getField4() { return $last; }
    public SubLObject setField2(SubLObject value) { return $num = value; }
    public SubLObject setField3(SubLObject value) { return $elements = value; }
    public SubLObject setField4(SubLObject value) { return $last = value; }
    public SubLObject $num = NIL;
    public SubLObject $elements = NIL;
    public SubLObject $last = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($queue_native.class, $sym0$QUEUE, $sym1$QUEUE_P, $list2, $list3, new String[] {"$num", "$elements", "$last"}, $list4, $list5, $sym6$PRINT_QUEUE);
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static SubLSymbol $dtp_queue$ = null;

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29899");
    return NIL;
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject queue_p(SubLObject object) {
    return ((object.getClass() == $queue_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $queue_p$UnaryFunction extends UnaryFunction {
    public $queue_p$UnaryFunction() { super(extractFunctionNamed("QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return queue_p(arg1); }
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject q_num(SubLObject object) {
    checkType(object, $sym1$QUEUE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject q_elements(SubLObject object) {
    checkType(object, $sym1$QUEUE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject q_last(SubLObject object) {
    checkType(object, $sym1$QUEUE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject _csetf_q_num(SubLObject object, SubLObject value) {
    checkType(object, $sym1$QUEUE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject _csetf_q_elements(SubLObject object, SubLObject value) {
    checkType(object, $sym1$QUEUE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject _csetf_q_last(SubLObject object, SubLObject value) {
    checkType(object, $sym1$QUEUE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 943) 
  public static final SubLObject make_queue(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $queue_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw14$NUM)) {
            _csetf_q_num(v_new, current_value);
          } else if (pcase_var.eql($kw15$ELEMENTS)) {
            _csetf_q_elements(v_new, current_value);
          } else if (pcase_var.eql($kw16$LAST)) {
            _csetf_q_last(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Return a new, empty queue. */
  @SubL(source = "cycl/queues.lisp", position = 1272) 
  public static final SubLObject create_queue() {
    return clear_queue(make_queue(UNPROVIDED));
  }

  /** Clear QUEUE and return it. */
  @SubL(source = "cycl/queues.lisp", position = 1382) 
  public static final SubLObject clear_queue(SubLObject queue) {
    checkType(queue, $sym1$QUEUE_P);
    _csetf_q_num(queue, ZERO_INTEGER);
    _csetf_q_elements(queue, NIL);
    _csetf_q_last(queue, NIL);
    return queue;
  }

  /** Return T iff QUEUE is empty. */
  @SubL(source = "cycl/queues.lisp", position = 1580) 
  public static final SubLObject queue_empty_p(SubLObject queue) {
    checkType(queue, $sym1$QUEUE_P);
    return Types.sublisp_null(q_elements(queue));
  }

  /** Return the number of elements in QUEUE. */
  @SubL(source = "cycl/queues.lisp", position = 1715) 
  public static final SubLObject queue_size(SubLObject queue) {
    checkType(queue, $sym1$QUEUE_P);
    return q_num(queue);
  }

  /** Add ITEM to end of QUEUE.  Returns QUEUE. */
  @SubL(source = "cycl/queues.lisp", position = 1998) 
  public static final SubLObject enqueue(SubLObject item, SubLObject queue) {
    {
      SubLObject new_cell = list(item);
      if ((NIL != queue_empty_p(queue))) {
        _csetf_q_elements(queue, new_cell);
      } else {
        ConsesLow.rplacd(q_last(queue), new_cell);
      }
      _csetf_q_num(queue, Numbers.add(q_num(queue), ONE_INTEGER));
      _csetf_q_last(queue, new_cell);
    }
    return queue;
  }

  /** Remove and return the first item in QUEUE. */
  @SubL(source = "cycl/queues.lisp", position = 2565) 
  public static final SubLObject dequeue(SubLObject queue) {
    checkType(queue, $sym1$QUEUE_P);
    if ((NIL == queue_empty_p(queue))) {
      {
        SubLObject elements = q_elements(queue);
        SubLObject item = elements.first();
        SubLObject rest = elements.rest();
        _csetf_q_num(queue, Numbers.subtract(q_num(queue), ONE_INTEGER));
        _csetf_q_elements(queue, rest);
        if ((NIL == rest)) {
          _csetf_q_last(queue, NIL);
        }
        return item;
      }
    }
    return NIL;
  }

  /** Remove all occurances of ITEM from QUEUE. Returns QUEUE. */
  @SubL(source = "cycl/queues.lisp", position = 3225) 
  public static final SubLObject remqueue(SubLObject item, SubLObject queue, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(queue, $sym1$QUEUE_P);
    {
      SubLObject last = q_last(queue);
      SubLObject back = NIL;
      SubLObject next = NIL;
      for (next = q_elements(queue); (NIL != next); next = next.rest()) {
        if ((NIL != Functions.funcall(test, next.first(), item))) {
          _csetf_q_num(queue, Numbers.subtract(q_num(queue), ONE_INTEGER));
          if ((next == last)) {
            _csetf_q_last(queue, back);
          }
          if ((next == q_elements(queue))) {
            _csetf_q_elements(queue, next.rest());
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        } else {
          back = next;
        }
      }
      return queue;
    }
  }

  /** Return the first item on QUEUE without perturbing the queue. */
  @SubL(source = "cycl/queues.lisp", position = 4692) 
  public static final SubLObject queue_peek(SubLObject queue) {
    checkType(queue, $sym1$QUEUE_P);
    return q_elements(queue).first();
  }

  @SubL(source = "cycl/queues.lisp", position = 5492) 
  public static final SubLObject do_queue_elements_queue_elements(SubLObject queue) {
    return q_elements(queue);
  }

  @SubL(source = "cycl/queues.lisp", position = 6381) 
  private static SubLSymbol $cfasl_wide_opcode_queue$ = null;

  public static final class $priority_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $num; }
    public SubLObject getField3() { return $max_size; }
    public SubLObject getField4() { return $rank_func; }
    public SubLObject getField5() { return $comp_func; }
    public SubLObject getField6() { return $tree; }
    public SubLObject setField2(SubLObject value) { return $num = value; }
    public SubLObject setField3(SubLObject value) { return $max_size = value; }
    public SubLObject setField4(SubLObject value) { return $rank_func = value; }
    public SubLObject setField5(SubLObject value) { return $comp_func = value; }
    public SubLObject setField6(SubLObject value) { return $tree = value; }
    public SubLObject $num = NIL;
    public SubLObject $max_size = NIL;
    public SubLObject $rank_func = NIL;
    public SubLObject $comp_func = NIL;
    public SubLObject $tree = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($priority_queue_native.class, $sym45$PRIORITY_QUEUE, $sym46$PRIORITY_QUEUE_P, $list47, $list48, new String[] {"$num", "$max_size", "$rank_func", "$comp_func", "$tree"}, $list49, $list50, $sym51$PRINT_P_QUEUE);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static SubLSymbol $dtp_priority_queue$ = null;

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject priority_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29898");
    return NIL;
  }

  public static final class $priority_queue_p$UnaryFunction extends UnaryFunction {
    public $priority_queue_p$UnaryFunction() { super(extractFunctionNamed("PRIORITY-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29901"); }
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject p_queue_num(SubLObject object) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.getField2();
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject p_queue_max_size(SubLObject object) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.getField3();
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject p_queue_rank_func(SubLObject object) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.getField4();
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject p_queue_comp_func(SubLObject object) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.getField5();
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject p_queue_tree(SubLObject object) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.getField6();
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject _csetf_p_queue_num(SubLObject object, SubLObject value) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject _csetf_p_queue_max_size(SubLObject object, SubLObject value) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject _csetf_p_queue_rank_func(SubLObject object, SubLObject value) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject _csetf_p_queue_comp_func(SubLObject object, SubLObject value) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject _csetf_p_queue_tree(SubLObject object, SubLObject value) {
    checkType(object, $sym46$PRIORITY_QUEUE_P);
    return object.setField6(value);
  }

  @SubL(source = "cycl/queues.lisp", position = 7613) 
  public static final SubLObject make_priority_queue(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $priority_queue_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw14$NUM)) {
            _csetf_p_queue_num(v_new, current_value);
          } else if (pcase_var.eql($kw63$MAX_SIZE)) {
            _csetf_p_queue_max_size(v_new, current_value);
          } else if (pcase_var.eql($kw64$RANK_FUNC)) {
            _csetf_p_queue_rank_func(v_new, current_value);
          } else if (pcase_var.eql($kw65$COMP_FUNC)) {
            _csetf_p_queue_comp_func(v_new, current_value);
          } else if (pcase_var.eql($kw66$TREE)) {
            _csetf_p_queue_tree(v_new, current_value);
          } else {
            Errors.error($str17$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** Create and return a new priority queue. */
  @SubL(source = "cycl/queues.lisp", position = 7995) 
  public static final SubLObject create_p_queue(SubLObject max_size, SubLObject rank_func, SubLObject comp_func) {
    if ((comp_func == UNPROVIDED)) {
      comp_func = Symbols.symbol_function($sym67$_);
    }
    {
      SubLObject pq = make_priority_queue(UNPROVIDED);
      _csetf_p_queue_num(pq, ZERO_INTEGER);
      _csetf_p_queue_max_size(pq, max_size);
      _csetf_p_queue_rank_func(pq, rank_func);
      _csetf_p_queue_comp_func(pq, comp_func);
      _csetf_p_queue_tree(pq, NIL);
      return pq;
    }
  }

  /** Return the number of elements in PRIORITY-QUEUE. */
  @SubL(source = "cycl/queues.lisp", position = 8367) 
  public static final SubLObject p_queue_size(SubLObject priority_queue) {
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    return p_queue_num(priority_queue);
  }

  /** Return T iff PRIORITY-QUEUE is empty. */
  @SubL(source = "cycl/queues.lisp", position = 8551) 
  public static final SubLObject p_queue_empty_p(SubLObject priority_queue) {
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    return Numbers.numE(p_queue_size(priority_queue), ZERO_INTEGER);
  }

  /** Return T iff PRIORITY-QUEUE is full. */
  @SubL(source = "cycl/queues.lisp", position = 8734) 
  public static final SubLObject p_queue_full_p(SubLObject priority_queue) {
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    return makeBoolean((p_queue_max_size(priority_queue).isFixnum()
           && p_queue_size(priority_queue).numE(p_queue_max_size(priority_queue))));
  }

  @SubL(source = "cycl/queues.lisp", position = 9006) 
  public static final SubLObject p_queue_best(SubLObject priority_queue) {
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    {
      SubLObject best = binary_tree.btree_find_best(p_queue_tree(priority_queue));
      if ((NIL != binary_tree.btree_p(best))) {
        return pq_collision_next(binary_tree.bt_state(best));
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/queues.lisp", position = 9481) 
  public static final SubLObject p_enqueue(SubLObject item, SubLObject priority_queue) {
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    {
      SubLObject bumpedP = p_queue_full_p(priority_queue);
      if ((NIL != bumpedP)) {
        {
          SubLObject worst = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29894");
          if ((NIL != Functions.funcall(p_queue_comp_func(priority_queue), Functions.funcall(p_queue_rank_func(priority_queue), item), Functions.funcall(p_queue_rank_func(priority_queue), worst)))) {
            {
              SubLObject bumped_item = p_dequeue(priority_queue, T);
              p_enqueue(item, priority_queue);
              return Values.values(priority_queue, bumpedP, bumped_item);
            }
          } else {
            return Values.values(priority_queue, bumpedP, item);
          }
        }
      } else {
        {
          SubLObject ans = binary_tree.btree_insert(item, Functions.funcall(p_queue_rank_func(priority_queue), item), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), Symbols.symbol_function($sym68$PQ_COLLISION_ENTER));
          if ((ans != p_queue_tree(priority_queue))) {
            _csetf_p_queue_tree(priority_queue, ans);
          }
          _csetf_p_queue_num(priority_queue, Numbers.add(p_queue_num(priority_queue), ONE_INTEGER));
          return Values.values(priority_queue, bumpedP, NIL);
        }
      }
    }
  }

  @SubL(source = "cycl/queues.lisp", position = 10480) 
  public static final SubLObject p_dequeue(SubLObject priority_queue, SubLObject worstP) {
    if ((worstP == UNPROVIDED)) {
      worstP = NIL;
    }
    checkType(priority_queue, $sym46$PRIORITY_QUEUE_P);
    if ((NIL == p_queue_empty_p(priority_queue))) {
      {
        SubLObject remove = ((NIL != worstP) ? ((SubLObject) Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29895")) : p_queue_best(priority_queue));
        SubLObject ans = binary_tree.btree_remove(remove, Functions.funcall(p_queue_rank_func(priority_queue), remove), p_queue_tree(priority_queue), p_queue_comp_func(priority_queue), Symbols.symbol_function($sym69$PQ_COLLISION_REMOVE), Symbols.symbol_function($sym70$PQ_COLLISION_EMPTY));
        if ((ans != p_queue_tree(priority_queue))) {
          _csetf_p_queue_tree(priority_queue, ans);
        }
        _csetf_p_queue_num(priority_queue, Numbers.subtract(p_queue_num(priority_queue), ONE_INTEGER));
        return remove;
      }
    }
    return NIL;
  }

  /** Returns the list within the queue implementation that results from entering
a new item which has the same key as others on this queue list. */
  @SubL(source = "cycl/queues.lisp", position = 12947) 
  public static final SubLObject pq_collision_enter(SubLObject item, SubLObject queue) {
    return list_utilities.nadd_to_end(item, queue);
  }

  public static final class $pq_collision_enter$BinaryFunction extends BinaryFunction {
    public $pq_collision_enter$BinaryFunction() { super(extractFunctionNamed("PQ-COLLISION-ENTER")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pq_collision_enter(arg1, arg2); }
  }

  /** Returns the next item within the queue implementation that is obtained from a
list of same-named keys. */
  @SubL(source = "cycl/queues.lisp", position = 13196) 
  public static final SubLObject pq_collision_next(SubLObject queue) {
    return queue.first();
  }

  /** Returns the list within the queue implementation that results from removing
an item which has the same key as others on this queue list. */
  @SubL(source = "cycl/queues.lisp", position = 13545) 
  public static final SubLObject pq_collision_remove(SubLObject item, SubLObject queue) {
    return list_utilities.delete_first(item, queue, UNPROVIDED);
  }

  public static final class $pq_collision_remove$BinaryFunction extends BinaryFunction {
    public $pq_collision_remove$BinaryFunction() { super(extractFunctionNamed("PQ-COLLISION-REMOVE")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return pq_collision_remove(arg1, arg2); }
  }

  /** Returns T iff the queue implementation list is empty, in the case where the
list would contain same-named keys for queue items. */
  @SubL(source = "cycl/queues.lisp", position = 13771) 
  public static final SubLObject pq_collision_empty(SubLObject queue) {
    return Types.sublisp_null(queue);
  }

  public static final class $pq_collision_empty$UnaryFunction extends UnaryFunction {
    public $pq_collision_empty$UnaryFunction() { super(extractFunctionNamed("PQ-COLLISION-EMPTY")); }
    public SubLObject processItem(SubLObject arg1) { return pq_collision_empty(arg1); }
  }

  public static final class $lazy_priority_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $ordered_items; }
    public SubLObject getField3() { return $new_items; }
    public SubLObject setField2(SubLObject value) { return $ordered_items = value; }
    public SubLObject setField3(SubLObject value) { return $new_items = value; }
    public SubLObject $ordered_items = NIL;
    public SubLObject $new_items = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($lazy_priority_queue_native.class, $sym78$LAZY_PRIORITY_QUEUE, $sym79$LAZY_PRIORITY_QUEUE_P, $list80, $list81, new String[] {"$ordered_items", "$new_items"}, $list82, $list83, $sym84$PRINT_LAZY_P_QUEUE);
  }

  @SubL(source = "cycl/queues.lisp", position = 14681) 
  public static SubLSymbol $dtp_lazy_priority_queue$ = null;

  @SubL(source = "cycl/queues.lisp", position = 14681) 
  public static final SubLObject lazy_priority_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29896");
    return NIL;
  }

  public static final class $lazy_priority_queue_p$UnaryFunction extends UnaryFunction {
    public $lazy_priority_queue_p$UnaryFunction() { super(extractFunctionNamed("LAZY-PRIORITY-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29872"); }
  }

  public static final class $locked_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $queue; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $queue = value; }
    public SubLObject $lock = NIL;
    public SubLObject $queue = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($locked_queue_native.class, $sym96$LOCKED_QUEUE, $sym97$LOCKED_QUEUE_P, $list98, $list99, new String[] {"$lock", "$queue"}, $list100, $list101, $sym102$DEFAULT_STRUCT_PRINT_FUNCTION);
  }

  @SubL(source = "cycl/queues.lisp", position = 17149) 
  public static SubLSymbol $dtp_locked_queue$ = null;

  @SubL(source = "cycl/queues.lisp", position = 17149) 
  public static final SubLObject locked_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    compatibility.default_struct_print_function(object, stream, ZERO_INTEGER);
    return NIL;
  }

  public static final class $locked_queue_p$UnaryFunction extends UnaryFunction {
    public $locked_queue_p$UnaryFunction() { super(extractFunctionNamed("LOCKED-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29883"); }
  }

  public static final class $locked_p_queue_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $lock; }
    public SubLObject getField3() { return $priority_queue; }
    public SubLObject setField2(SubLObject value) { return $lock = value; }
    public SubLObject setField3(SubLObject value) { return $priority_queue = value; }
    public SubLObject $lock = NIL;
    public SubLObject $priority_queue = NIL;
    public static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($locked_p_queue_native.class, $sym111$LOCKED_P_QUEUE, $sym112$LOCKED_P_QUEUE_P, $list113, $list114, new String[] {"$lock", "$priority_queue"}, $list115, $list116, $sym117$PRINT_LP_QUEUE);
  }

  @SubL(source = "cycl/queues.lisp", position = 19110) 
  public static SubLSymbol $dtp_locked_p_queue$ = null;

  @SubL(source = "cycl/queues.lisp", position = 19110) 
  public static final SubLObject locked_p_queue_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29897");
    return NIL;
  }

  public static final class $locked_p_queue_p$UnaryFunction extends UnaryFunction {
    public $locked_p_queue_p$UnaryFunction() { super(extractFunctionNamed("LOCKED-P-QUEUE-P")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 29874"); }
  }

  public static final SubLObject declare_queues_file() {
    declareFunction(myName, "queue_print_function_trampoline", "QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "queue_p", "QUEUE-P", 1, 0, false); new $queue_p$UnaryFunction();
    declareFunction(myName, "q_num", "Q-NUM", 1, 0, false);
    declareFunction(myName, "q_elements", "Q-ELEMENTS", 1, 0, false);
    declareFunction(myName, "q_last", "Q-LAST", 1, 0, false);
    declareFunction(myName, "_csetf_q_num", "_CSETF-Q-NUM", 2, 0, false);
    declareFunction(myName, "_csetf_q_elements", "_CSETF-Q-ELEMENTS", 2, 0, false);
    declareFunction(myName, "_csetf_q_last", "_CSETF-Q-LAST", 2, 0, false);
    declareFunction(myName, "make_queue", "MAKE-QUEUE", 0, 1, false);
    declareFunction(myName, "print_queue", "PRINT-QUEUE", 3, 0, false);
    declareFunction(myName, "create_queue", "CREATE-QUEUE", 0, 0, false);
    declareFunction(myName, "clear_queue", "CLEAR-QUEUE", 1, 0, false);
    declareFunction(myName, "queue_empty_p", "QUEUE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "queue_size", "QUEUE-SIZE", 1, 0, false);
    declareFunction(myName, "queue_elements", "QUEUE-ELEMENTS", 1, 0, false);
    declareFunction(myName, "enqueue", "ENQUEUE", 2, 0, false);
    declareFunction(myName, "enqueue_all", "ENQUEUE-ALL", 2, 0, false);
    declareFunction(myName, "dequeue", "DEQUEUE", 1, 0, false);
    declareFunction(myName, "requeue", "REQUEUE", 1, 0, false);
    declareFunction(myName, "remqueue", "REMQUEUE", 2, 1, false);
    declareFunction(myName, "remlast_queue", "REMLAST-QUEUE", 1, 0, false);
    declareFunction(myName, "queue_find", "QUEUE-FIND", 2, 2, false);
    declareFunction(myName, "queue_find_if", "QUEUE-FIND-IF", 2, 1, false);
    declareFunction(myName, "queue_peek", "QUEUE-PEEK", 1, 0, false);
    declareFunction(myName, "queue_peek_n", "QUEUE-PEEK-N", 2, 0, false);
    declareFunction(myName, "new_queue_iterator", "NEW-QUEUE-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_queue_elements", "DO-QUEUE-ELEMENTS");
    declareFunction(myName, "do_queue_elements_queue_elements", "DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS", 1, 0, false);
    declareMacro(myName, "do_queue_dequeue", "DO-QUEUE-DEQUEUE");
    declareFunction(myName, "queue_copy", "QUEUE-COPY", 1, 0, false);
    declareFunction(myName, "print_queue_contents", "PRINT-QUEUE-CONTENTS", 1, 1, false);
    declareFunction(myName, "cfasl_output_object_queue_method", "CFASL-OUTPUT-OBJECT-QUEUE-METHOD", 2, 0, false);
    declareFunction(myName, "cfasl_wide_output_queue", "CFASL-WIDE-OUTPUT-QUEUE", 2, 0, false);
    declareFunction(myName, "cfasl_output_queue_internal", "CFASL-OUTPUT-QUEUE-INTERNAL", 2, 0, false);
    declareFunction(myName, "cfasl_input_queue", "CFASL-INPUT-QUEUE", 1, 0, false);
    declareFunction(myName, "priority_queue_print_function_trampoline", "PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "priority_queue_p", "PRIORITY-QUEUE-P", 1, 0, false); new $priority_queue_p$UnaryFunction();
    declareFunction(myName, "p_queue_num", "P-QUEUE-NUM", 1, 0, false);
    declareFunction(myName, "p_queue_max_size", "P-QUEUE-MAX-SIZE", 1, 0, false);
    declareFunction(myName, "p_queue_rank_func", "P-QUEUE-RANK-FUNC", 1, 0, false);
    declareFunction(myName, "p_queue_comp_func", "P-QUEUE-COMP-FUNC", 1, 0, false);
    declareFunction(myName, "p_queue_tree", "P-QUEUE-TREE", 1, 0, false);
    declareFunction(myName, "_csetf_p_queue_num", "_CSETF-P-QUEUE-NUM", 2, 0, false);
    declareFunction(myName, "_csetf_p_queue_max_size", "_CSETF-P-QUEUE-MAX-SIZE", 2, 0, false);
    declareFunction(myName, "_csetf_p_queue_rank_func", "_CSETF-P-QUEUE-RANK-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_p_queue_comp_func", "_CSETF-P-QUEUE-COMP-FUNC", 2, 0, false);
    declareFunction(myName, "_csetf_p_queue_tree", "_CSETF-P-QUEUE-TREE", 2, 0, false);
    declareFunction(myName, "make_priority_queue", "MAKE-PRIORITY-QUEUE", 0, 1, false);
    declareFunction(myName, "print_p_queue", "PRINT-P-QUEUE", 3, 0, false);
    declareFunction(myName, "create_p_queue", "CREATE-P-QUEUE", 2, 1, false);
    declareFunction(myName, "p_queue_size", "P-QUEUE-SIZE", 1, 0, false);
    declareFunction(myName, "p_queue_empty_p", "P-QUEUE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "p_queue_full_p", "P-QUEUE-FULL-P", 1, 0, false);
    declareFunction(myName, "p_queue_best", "P-QUEUE-BEST", 1, 0, false);
    declareFunction(myName, "p_queue_worst", "P-QUEUE-WORST", 1, 0, false);
    declareFunction(myName, "p_enqueue", "P-ENQUEUE", 2, 0, false);
    declareFunction(myName, "p_dequeue", "P-DEQUEUE", 1, 1, false);
    declareMacro(myName, "do_priority_queue_elements", "DO-PRIORITY-QUEUE-ELEMENTS");
    declareFunction(myName, "do_priority_queue_elements_btree", "DO-PRIORITY-QUEUE-ELEMENTS-BTREE", 1, 0, false);
    declareFunction(myName, "p_queue_elements", "P-QUEUE-ELEMENTS", 1, 0, false);
    declareFunction(myName, "p_queue_find", "P-QUEUE-FIND", 2, 2, false);
    declareFunction(myName, "p_queue_find_if", "P-QUEUE-FIND-IF", 2, 1, false);
    declareFunction(myName, "pq_collision_enter", "PQ-COLLISION-ENTER", 2, 0, false); new $pq_collision_enter$BinaryFunction();
    declareFunction(myName, "pq_collision_next", "PQ-COLLISION-NEXT", 1, 0, false);
    declareFunction(myName, "pq_collision_last", "PQ-COLLISION-LAST", 1, 0, false);
    declareFunction(myName, "pq_collision_remove", "PQ-COLLISION-REMOVE", 2, 0, false); new $pq_collision_remove$BinaryFunction();
    declareFunction(myName, "pq_collision_empty", "PQ-COLLISION-EMPTY", 1, 0, false); new $pq_collision_empty$UnaryFunction();
    declareFunction(myName, "lazy_priority_queue_print_function_trampoline", "LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "lazy_priority_queue_p", "LAZY-PRIORITY-QUEUE-P", 1, 0, false); new $lazy_priority_queue_p$UnaryFunction();
    declareFunction(myName, "lazy_p_queue_ordered_items", "LAZY-P-QUEUE-ORDERED-ITEMS", 1, 0, false);
    declareFunction(myName, "lazy_p_queue_new_items", "LAZY-P-QUEUE-NEW-ITEMS", 1, 0, false);
    declareFunction(myName, "_csetf_lazy_p_queue_ordered_items", "_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS", 2, 0, false);
    declareFunction(myName, "_csetf_lazy_p_queue_new_items", "_CSETF-LAZY-P-QUEUE-NEW-ITEMS", 2, 0, false);
    declareFunction(myName, "make_lazy_priority_queue", "MAKE-LAZY-PRIORITY-QUEUE", 0, 1, false);
    declareFunction(myName, "print_lazy_p_queue", "PRINT-LAZY-P-QUEUE", 3, 0, false);
    declareFunction(myName, "new_lazy_priority_queue", "NEW-LAZY-PRIORITY-QUEUE", 1, 1, false);
    declareMacro(myName, "do_lazy_priority_queue_elements", "DO-LAZY-PRIORITY-QUEUE-ELEMENTS");
    declareFunction(myName, "lazy_priority_queue_size", "LAZY-PRIORITY-QUEUE-SIZE", 1, 0, false);
    declareFunction(myName, "lazy_priority_queue_empty_p", "LAZY-PRIORITY-QUEUE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "lazy_priority_queue_peek", "LAZY-PRIORITY-QUEUE-PEEK", 1, 0, false);
    declareFunction(myName, "lazy_priority_queue_elements", "LAZY-PRIORITY-QUEUE-ELEMENTS", 1, 0, false);
    declareFunction(myName, "lazy_priority_queue_add", "LAZY-PRIORITY-QUEUE-ADD", 2, 0, false);
    declareFunction(myName, "lazy_priority_queue_remove", "LAZY-PRIORITY-QUEUE-REMOVE", 1, 0, false);
    declareFunction(myName, "ensure_lazy_priority_queue_ordered", "ENSURE-LAZY-PRIORITY-QUEUE-ORDERED", 1, 0, false);
    declareFunction(myName, "locked_queue_print_function_trampoline", "LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "locked_queue_p", "LOCKED-QUEUE-P", 1, 0, false); new $locked_queue_p$UnaryFunction();
    declareFunction(myName, "locked_queue_lock", "LOCKED-QUEUE-LOCK", 1, 0, false);
    declareFunction(myName, "locked_queue_queue", "LOCKED-QUEUE-QUEUE", 1, 0, false);
    declareFunction(myName, "_csetf_locked_queue_lock", "_CSETF-LOCKED-QUEUE-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_locked_queue_queue", "_CSETF-LOCKED-QUEUE-QUEUE", 2, 0, false);
    declareFunction(myName, "make_locked_queue", "MAKE-LOCKED-QUEUE", 0, 1, false);
    declareFunction(myName, "create_locked_queue", "CREATE-LOCKED-QUEUE", 0, 0, false);
    declareFunction(myName, "clear_locked_queue", "CLEAR-LOCKED-QUEUE", 1, 0, false);
    declareFunction(myName, "locked_queue_empty_p", "LOCKED-QUEUE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "locked_queue_size", "LOCKED-QUEUE-SIZE", 1, 0, false);
    declareFunction(myName, "locked_queue_elements", "LOCKED-QUEUE-ELEMENTS", 1, 0, false);
    declareFunction(myName, "locked_enqueue", "LOCKED-ENQUEUE", 2, 0, false);
    declareFunction(myName, "locked_dequeue", "LOCKED-DEQUEUE", 1, 0, false);
    declareFunction(myName, "locked_p_queue_print_function_trampoline", "LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "locked_p_queue_p", "LOCKED-P-QUEUE-P", 1, 0, false); new $locked_p_queue_p$UnaryFunction();
    declareFunction(myName, "lp_queue_lock", "LP-QUEUE-LOCK", 1, 0, false);
    declareFunction(myName, "lp_queue_priority_queue", "LP-QUEUE-PRIORITY-QUEUE", 1, 0, false);
    declareFunction(myName, "_csetf_lp_queue_lock", "_CSETF-LP-QUEUE-LOCK", 2, 0, false);
    declareFunction(myName, "_csetf_lp_queue_priority_queue", "_CSETF-LP-QUEUE-PRIORITY-QUEUE", 2, 0, false);
    declareFunction(myName, "make_locked_p_queue", "MAKE-LOCKED-P-QUEUE", 0, 1, false);
    declareFunction(myName, "print_lp_queue", "PRINT-LP-QUEUE", 3, 0, false);
    declareFunction(myName, "create_lp_queue", "CREATE-LP-QUEUE", 2, 1, false);
    declareFunction(myName, "lp_queue_size", "LP-QUEUE-SIZE", 1, 0, false);
    declareFunction(myName, "lp_queue_empty_p", "LP-QUEUE-EMPTY-P", 1, 0, false);
    declareFunction(myName, "lp_queue_full_p", "LP-QUEUE-FULL-P", 1, 0, false);
    declareFunction(myName, "lp_queue_best", "LP-QUEUE-BEST", 1, 0, false);
    declareFunction(myName, "lp_queue_worst", "LP-QUEUE-WORST", 1, 0, false);
    declareFunction(myName, "lp_enqueue", "LP-ENQUEUE", 2, 0, false);
    declareFunction(myName, "lp_dequeue", "LP-DEQUEUE", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_queues_file() {
    $dtp_queue$ = defconstant("*DTP-QUEUE*", $sym0$QUEUE);
    $cfasl_wide_opcode_queue$ = defconstant("*CFASL-WIDE-OPCODE-QUEUE*", $int41$131);
    $dtp_priority_queue$ = defconstant("*DTP-PRIORITY-QUEUE*", $sym45$PRIORITY_QUEUE);
    $dtp_lazy_priority_queue$ = defconstant("*DTP-LAZY-PRIORITY-QUEUE*", $sym78$LAZY_PRIORITY_QUEUE);
    $dtp_locked_queue$ = defconstant("*DTP-LOCKED-QUEUE*", $sym96$LOCKED_QUEUE);
    $dtp_locked_p_queue$ = defconstant("*DTP-LOCKED-P-QUEUE*", $sym111$LOCKED_P_QUEUE);
    return NIL;
  }

  public static final SubLObject setup_queues_file() {
    // CVS_ID("Id: queues.lisp 128337 2009-07-16 16:57:29Z rck ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), Symbols.symbol_function($sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$Q_NUM, $sym9$_CSETF_Q_NUM);
    Structures.def_csetf($sym10$Q_ELEMENTS, $sym11$_CSETF_Q_ELEMENTS);
    Structures.def_csetf($sym12$Q_LAST, $sym13$_CSETF_Q_LAST);
    Equality.identity($sym0$QUEUE);
    access_macros.register_macro_helper($sym27$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS, $sym28$DO_QUEUE_ELEMENTS);
    cfasl.register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_queue$.getGlobalValue(), $sym42$CFASL_INPUT_QUEUE);
    Structures.register_method(cfasl.$cfasl_output_object_method_table$.getGlobalValue(), $dtp_queue$.getGlobalValue(), Symbols.symbol_function($sym43$CFASL_OUTPUT_OBJECT_QUEUE_METHOD));
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_priority_queue$.getGlobalValue(), Symbols.symbol_function($sym52$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym53$P_QUEUE_NUM, $sym54$_CSETF_P_QUEUE_NUM);
    Structures.def_csetf($sym55$P_QUEUE_MAX_SIZE, $sym56$_CSETF_P_QUEUE_MAX_SIZE);
    Structures.def_csetf($sym57$P_QUEUE_RANK_FUNC, $sym58$_CSETF_P_QUEUE_RANK_FUNC);
    Structures.def_csetf($sym59$P_QUEUE_COMP_FUNC, $sym60$_CSETF_P_QUEUE_COMP_FUNC);
    Structures.def_csetf($sym61$P_QUEUE_TREE, $sym62$_CSETF_P_QUEUE_TREE);
    Equality.identity($sym45$PRIORITY_QUEUE);
    access_macros.register_macro_helper($sym75$DO_PRIORITY_QUEUE_ELEMENTS_BTREE, $sym77$DO_PRIORITY_QUEUE_ELEMENTS);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_lazy_priority_queue$.getGlobalValue(), Symbols.symbol_function($sym85$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym86$LAZY_P_QUEUE_ORDERED_ITEMS, $sym87$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS);
    Structures.def_csetf($sym88$LAZY_P_QUEUE_NEW_ITEMS, $sym89$_CSETF_LAZY_P_QUEUE_NEW_ITEMS);
    Equality.identity($sym78$LAZY_PRIORITY_QUEUE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_locked_queue$.getGlobalValue(), Symbols.symbol_function($sym103$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym104$LOCKED_QUEUE_LOCK, $sym105$_CSETF_LOCKED_QUEUE_LOCK);
    Structures.def_csetf($sym106$LOCKED_QUEUE_QUEUE, $sym107$_CSETF_LOCKED_QUEUE_QUEUE);
    Equality.identity($sym96$LOCKED_QUEUE);
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_locked_p_queue$.getGlobalValue(), Symbols.symbol_function($sym118$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym119$LP_QUEUE_LOCK, $sym120$_CSETF_LP_QUEUE_LOCK);
    Structures.def_csetf($sym121$LP_QUEUE_PRIORITY_QUEUE, $sym122$_CSETF_LP_QUEUE_PRIORITY_QUEUE);
    Equality.identity($sym111$LOCKED_P_QUEUE);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$QUEUE = makeSymbol("QUEUE");
  public static final SubLSymbol $sym1$QUEUE_P = makeSymbol("QUEUE-P");
  public static final SubLList $list2 = list(makeSymbol("NUM"), makeSymbol("ELEMENTS"), makeSymbol("LAST"));
  public static final SubLList $list3 = list(makeKeyword("NUM"), makeKeyword("ELEMENTS"), makeKeyword("LAST"));
  public static final SubLList $list4 = list(makeSymbol("Q-NUM"), makeSymbol("Q-ELEMENTS"), makeSymbol("Q-LAST"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-Q-NUM"), makeSymbol("_CSETF-Q-ELEMENTS"), makeSymbol("_CSETF-Q-LAST"));
  public static final SubLSymbol $sym6$PRINT_QUEUE = makeSymbol("PRINT-QUEUE");
  public static final SubLSymbol $sym7$QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$Q_NUM = makeSymbol("Q-NUM");
  public static final SubLSymbol $sym9$_CSETF_Q_NUM = makeSymbol("_CSETF-Q-NUM");
  public static final SubLSymbol $sym10$Q_ELEMENTS = makeSymbol("Q-ELEMENTS");
  public static final SubLSymbol $sym11$_CSETF_Q_ELEMENTS = makeSymbol("_CSETF-Q-ELEMENTS");
  public static final SubLSymbol $sym12$Q_LAST = makeSymbol("Q-LAST");
  public static final SubLSymbol $sym13$_CSETF_Q_LAST = makeSymbol("_CSETF-Q-LAST");
  public static final SubLSymbol $kw14$NUM = makeKeyword("NUM");
  public static final SubLSymbol $kw15$ELEMENTS = makeKeyword("ELEMENTS");
  public static final SubLSymbol $kw16$LAST = makeKeyword("LAST");
  public static final SubLString $str17$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str18$__ = makeString("#<");
  public static final SubLSymbol $kw19$STREAM = makeKeyword("STREAM");
  public static final SubLString $str20$size_ = makeString("size=");
  public static final SubLSymbol $kw21$BASE = makeKeyword("BASE");
  public static final SubLList $list22 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list23 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw24$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw25$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym26$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym27$DO_QUEUE_ELEMENTS_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS-QUEUE-ELEMENTS");
  public static final SubLSymbol $sym28$DO_QUEUE_ELEMENTS = makeSymbol("DO-QUEUE-ELEMENTS");
  public static final SubLSymbol $sym29$Q = makeUninternedSymbol("Q");
  public static final SubLSymbol $sym30$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym31$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym32$COR = makeSymbol("COR");
  public static final SubLSymbol $sym33$QUEUE_EMPTY_P = makeSymbol("QUEUE-EMPTY-P");
  public static final SubLSymbol $sym34$WHILE = makeSymbol("WHILE");
  public static final SubLSymbol $sym35$CNOT = makeSymbol("CNOT");
  public static final SubLSymbol $sym36$DEQUEUE = makeSymbol("DEQUEUE");
  public static final SubLSymbol $sym37$CSETQ = makeSymbol("CSETQ");
  public static final SubLString $str38$__Queue_length____a = makeString("~%Queue length : ~a");
  public static final SubLString $str39$__Queue_contents__ = makeString("~%Queue contents :");
  public static final SubLString $str40$___s = makeString("~%~s");
  public static final SubLInteger $int41$131 = makeInteger(131);
  public static final SubLSymbol $sym42$CFASL_INPUT_QUEUE = makeSymbol("CFASL-INPUT-QUEUE");
  public static final SubLSymbol $sym43$CFASL_OUTPUT_OBJECT_QUEUE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-QUEUE-METHOD");
  public static final SubLString $str44$We_promised_to_write__A_elements_ = makeString("We promised to write ~A elements but wrote ~A.");
  public static final SubLSymbol $sym45$PRIORITY_QUEUE = makeSymbol("PRIORITY-QUEUE");
  public static final SubLSymbol $sym46$PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");
  public static final SubLList $list47 = list(makeSymbol("NUM"), makeSymbol("MAX-SIZE"), makeSymbol("RANK-FUNC"), makeSymbol("COMP-FUNC"), makeSymbol("TREE"));
  public static final SubLList $list48 = list(makeKeyword("NUM"), makeKeyword("MAX-SIZE"), makeKeyword("RANK-FUNC"), makeKeyword("COMP-FUNC"), makeKeyword("TREE"));
  public static final SubLList $list49 = list(makeSymbol("P-QUEUE-NUM"), makeSymbol("P-QUEUE-MAX-SIZE"), makeSymbol("P-QUEUE-RANK-FUNC"), makeSymbol("P-QUEUE-COMP-FUNC"), makeSymbol("P-QUEUE-TREE"));
  public static final SubLList $list50 = list(makeSymbol("_CSETF-P-QUEUE-NUM"), makeSymbol("_CSETF-P-QUEUE-MAX-SIZE"), makeSymbol("_CSETF-P-QUEUE-RANK-FUNC"), makeSymbol("_CSETF-P-QUEUE-COMP-FUNC"), makeSymbol("_CSETF-P-QUEUE-TREE"));
  public static final SubLSymbol $sym51$PRINT_P_QUEUE = makeSymbol("PRINT-P-QUEUE");
  public static final SubLSymbol $sym52$PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym53$P_QUEUE_NUM = makeSymbol("P-QUEUE-NUM");
  public static final SubLSymbol $sym54$_CSETF_P_QUEUE_NUM = makeSymbol("_CSETF-P-QUEUE-NUM");
  public static final SubLSymbol $sym55$P_QUEUE_MAX_SIZE = makeSymbol("P-QUEUE-MAX-SIZE");
  public static final SubLSymbol $sym56$_CSETF_P_QUEUE_MAX_SIZE = makeSymbol("_CSETF-P-QUEUE-MAX-SIZE");
  public static final SubLSymbol $sym57$P_QUEUE_RANK_FUNC = makeSymbol("P-QUEUE-RANK-FUNC");
  public static final SubLSymbol $sym58$_CSETF_P_QUEUE_RANK_FUNC = makeSymbol("_CSETF-P-QUEUE-RANK-FUNC");
  public static final SubLSymbol $sym59$P_QUEUE_COMP_FUNC = makeSymbol("P-QUEUE-COMP-FUNC");
  public static final SubLSymbol $sym60$_CSETF_P_QUEUE_COMP_FUNC = makeSymbol("_CSETF-P-QUEUE-COMP-FUNC");
  public static final SubLSymbol $sym61$P_QUEUE_TREE = makeSymbol("P-QUEUE-TREE");
  public static final SubLSymbol $sym62$_CSETF_P_QUEUE_TREE = makeSymbol("_CSETF-P-QUEUE-TREE");
  public static final SubLSymbol $kw63$MAX_SIZE = makeKeyword("MAX-SIZE");
  public static final SubLSymbol $kw64$RANK_FUNC = makeKeyword("RANK-FUNC");
  public static final SubLSymbol $kw65$COMP_FUNC = makeKeyword("COMP-FUNC");
  public static final SubLSymbol $kw66$TREE = makeKeyword("TREE");
  public static final SubLSymbol $sym67$_ = makeSymbol("<");
  public static final SubLSymbol $sym68$PQ_COLLISION_ENTER = makeSymbol("PQ-COLLISION-ENTER");
  public static final SubLSymbol $sym69$PQ_COLLISION_REMOVE = makeSymbol("PQ-COLLISION-REMOVE");
  public static final SubLSymbol $sym70$PQ_COLLISION_EMPTY = makeSymbol("PQ-COLLISION-EMPTY");
  public static final SubLList $list71 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("PRIORITY-QUEUE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym72$KEY_VAR = makeUninternedSymbol("KEY-VAR");
  public static final SubLSymbol $sym73$COLLISIONS_VAR = makeUninternedSymbol("COLLISIONS-VAR");
  public static final SubLSymbol $sym74$DO_BTREE_INDEX = makeSymbol("DO-BTREE-INDEX");
  public static final SubLSymbol $sym75$DO_PRIORITY_QUEUE_ELEMENTS_BTREE = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS-BTREE");
  public static final SubLSymbol $sym76$IGNORE = makeSymbol("IGNORE");
  public static final SubLSymbol $sym77$DO_PRIORITY_QUEUE_ELEMENTS = makeSymbol("DO-PRIORITY-QUEUE-ELEMENTS");
  public static final SubLSymbol $sym78$LAZY_PRIORITY_QUEUE = makeSymbol("LAZY-PRIORITY-QUEUE");
  public static final SubLSymbol $sym79$LAZY_PRIORITY_QUEUE_P = makeSymbol("LAZY-PRIORITY-QUEUE-P");
  public static final SubLList $list80 = list(makeSymbol("ORDERED-ITEMS"), makeSymbol("NEW-ITEMS"));
  public static final SubLList $list81 = list(makeKeyword("ORDERED-ITEMS"), makeKeyword("NEW-ITEMS"));
  public static final SubLList $list82 = list(makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("LAZY-P-QUEUE-NEW-ITEMS"));
  public static final SubLList $list83 = list(makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS"), makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS"));
  public static final SubLSymbol $sym84$PRINT_LAZY_P_QUEUE = makeSymbol("PRINT-LAZY-P-QUEUE");
  public static final SubLSymbol $sym85$LAZY_PRIORITY_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LAZY-PRIORITY-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym86$LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("LAZY-P-QUEUE-ORDERED-ITEMS");
  public static final SubLSymbol $sym87$_CSETF_LAZY_P_QUEUE_ORDERED_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-ORDERED-ITEMS");
  public static final SubLSymbol $sym88$LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("LAZY-P-QUEUE-NEW-ITEMS");
  public static final SubLSymbol $sym89$_CSETF_LAZY_P_QUEUE_NEW_ITEMS = makeSymbol("_CSETF-LAZY-P-QUEUE-NEW-ITEMS");
  public static final SubLSymbol $kw90$ORDERED_ITEMS = makeKeyword("ORDERED-ITEMS");
  public static final SubLSymbol $kw91$NEW_ITEMS = makeKeyword("NEW-ITEMS");
  public static final SubLString $str92$___S_new_ = makeString(" (~S new)");
  public static final SubLSymbol $sym93$_ = makeSymbol(">");
  public static final SubLList $list94 = list(list(makeSymbol("ITEM-VAR"), makeSymbol("LPQ"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym95$LAZY_PRIORITY_QUEUE_ELEMENTS = makeSymbol("LAZY-PRIORITY-QUEUE-ELEMENTS");
  public static final SubLSymbol $sym96$LOCKED_QUEUE = makeSymbol("LOCKED-QUEUE");
  public static final SubLSymbol $sym97$LOCKED_QUEUE_P = makeSymbol("LOCKED-QUEUE-P");
  public static final SubLList $list98 = list(makeSymbol("LOCK"), makeSymbol("QUEUE"));
  public static final SubLList $list99 = list(makeKeyword("LOCK"), makeKeyword("QUEUE"));
  public static final SubLList $list100 = list(makeSymbol("LOCKED-QUEUE-LOCK"), makeSymbol("LOCKED-QUEUE-QUEUE"));
  public static final SubLList $list101 = list(makeSymbol("_CSETF-LOCKED-QUEUE-LOCK"), makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE"));
  public static final SubLSymbol $sym102$DEFAULT_STRUCT_PRINT_FUNCTION = makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
  public static final SubLSymbol $sym103$LOCKED_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym104$LOCKED_QUEUE_LOCK = makeSymbol("LOCKED-QUEUE-LOCK");
  public static final SubLSymbol $sym105$_CSETF_LOCKED_QUEUE_LOCK = makeSymbol("_CSETF-LOCKED-QUEUE-LOCK");
  public static final SubLSymbol $sym106$LOCKED_QUEUE_QUEUE = makeSymbol("LOCKED-QUEUE-QUEUE");
  public static final SubLSymbol $sym107$_CSETF_LOCKED_QUEUE_QUEUE = makeSymbol("_CSETF-LOCKED-QUEUE-QUEUE");
  public static final SubLSymbol $kw108$LOCK = makeKeyword("LOCK");
  public static final SubLSymbol $kw109$QUEUE = makeKeyword("QUEUE");
  public static final SubLString $str110$Queue_Lock = makeString("Queue Lock");
  public static final SubLSymbol $sym111$LOCKED_P_QUEUE = makeSymbol("LOCKED-P-QUEUE");
  public static final SubLSymbol $sym112$LOCKED_P_QUEUE_P = makeSymbol("LOCKED-P-QUEUE-P");
  public static final SubLList $list113 = list(makeSymbol("LOCK"), makeSymbol("PRIORITY-QUEUE"));
  public static final SubLList $list114 = list(makeKeyword("LOCK"), makeKeyword("PRIORITY-QUEUE"));
  public static final SubLList $list115 = list(makeSymbol("LP-QUEUE-LOCK"), makeSymbol("LP-QUEUE-PRIORITY-QUEUE"));
  public static final SubLList $list116 = list(makeSymbol("_CSETF-LP-QUEUE-LOCK"), makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE"));
  public static final SubLSymbol $sym117$PRINT_LP_QUEUE = makeSymbol("PRINT-LP-QUEUE");
  public static final SubLSymbol $sym118$LOCKED_P_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LOCKED-P-QUEUE-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym119$LP_QUEUE_LOCK = makeSymbol("LP-QUEUE-LOCK");
  public static final SubLSymbol $sym120$_CSETF_LP_QUEUE_LOCK = makeSymbol("_CSETF-LP-QUEUE-LOCK");
  public static final SubLSymbol $sym121$LP_QUEUE_PRIORITY_QUEUE = makeSymbol("LP-QUEUE-PRIORITY-QUEUE");
  public static final SubLSymbol $sym122$_CSETF_LP_QUEUE_PRIORITY_QUEUE = makeSymbol("_CSETF-LP-QUEUE-PRIORITY-QUEUE");
  public static final SubLSymbol $kw123$PRIORITY_QUEUE = makeKeyword("PRIORITY-QUEUE");
  public static final SubLString $str124$_tree_ = makeString(" tree=");

  //// Initializers

  public void declareFunctions() {
    declare_queues_file();
  }

  public void initializeVariables() {
    init_queues_file();
  }

  public void runTopLevelForms() {
    setup_queues_file();
  }

}
