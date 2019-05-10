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
import com.cyc.cycjava.cycl.hl_interface_infrastructure;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.meta_macros;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_macros;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.web_utilities;

public  final class iteration extends SubLTranslatedFile {

  //// Constructor

  private iteration() {}
  public static final SubLFile me = new iteration();
  public static final String myName = "com.cyc.cycjava.cycl.iteration";

  //// Definitions

  public static final class $iterator_native extends SubLStructNative {
    public SubLStructDecl getStructDecl() { return structDecl; }
    public SubLObject getField2() { return $state; }
    public SubLObject getField3() { return $done; }
    public SubLObject getField4() { return $next; }
    public SubLObject getField5() { return $finalize; }
    public SubLObject setField2(SubLObject value) { return $state = value; }
    public SubLObject setField3(SubLObject value) { return $done = value; }
    public SubLObject setField4(SubLObject value) { return $next = value; }
    public SubLObject setField5(SubLObject value) { return $finalize = value; }
    public SubLObject $state = NIL;
    public SubLObject $done = NIL;
    public SubLObject $next = NIL;
    public SubLObject $finalize = NIL;
    private static final SubLStructDeclNative structDecl =
    Structures.makeStructDeclNative($iterator_native.class, $sym0$ITERATOR, $sym1$ITERATOR_P, $list2, $list3, new String[] {"$state", "$done", "$next", "$finalize"}, $list4, $list5, $sym6$PRINT_ITERATOR);
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static SubLSymbol $dtp_iterator$ = null;

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject iterator_print_function_trampoline(SubLObject object, SubLObject stream) {
    Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22992");
    return NIL;
  }


  /** Returns an iterator for ALIST.
   Values returned are tuples of the form (<key> <value>). */
  @SubL(source = "cycl/iteration.lisp", position = 15666) 
  public static final SubLObject new_alist_iterator(SubLObject alist) {
    checkType(alist, $sym78$ALIST_P);
    return new_indirect_iterator(new_list_iterator(alist), $sym79$CONS_TO_TUPLE, UNPROVIDED);
  }


  /** Return an iterator that transforms the values from another ITERATOR.
   TRANSFORM is funcalled on each result from ITERATOR. */
  @SubL(source = "cycl/iteration.lisp", position = 23239) 
  public static final SubLObject new_indirect_iterator(SubLObject iterator, SubLObject transform, SubLObject finalize) {
    if ((transform == UNPROVIDED)) {
      transform = Symbols.symbol_function(IDENTITY);
    }
    if ((finalize == UNPROVIDED)) {
      finalize = $sym98$ITERATE_INDIRECT_FINALIZE;
    }
    checkType(iterator, $sym1$ITERATOR_P);
    checkType(transform, $sym65$FUNCTION_SPEC_P);
    return new_iterator(make_iterator_indirect_state(iterator, transform), $sym82$DEFAULT_ITERATOR_DONE_P, $sym99$ITERATE_INDIRECT_NEXT, finalize);
  }


  @SubL(source = "cycl/iteration.lisp", position = 23802) 
  public static final SubLObject make_iterator_indirect_state(SubLObject iterator, SubLObject transform) {
    {
      SubLObject current = iterator;
      return list(current, transform);
    }
  }


  @SubL(source = "cycl/iteration.lisp", position = 24069) 
  public static final SubLObject iterate_indirect_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject datum = state;
        SubLObject current = datum;
        SubLObject current_14 = NIL;
        SubLObject transform = NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list100);
        current_14 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list100);
        transform = current.first();
        current = current.rest();
        if ((NIL == current)) {
          thread.resetMultipleValues();
          {
            SubLObject next = iteration_next(current_14);
            SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL == valid)) {
              {
                SubLObject update = $kw17$DONE;
                ConsesLow.rplaca(state, update);
                ConsesLow.rplacd(state, NIL);
                return Values.values(NIL, state, T);
              }
            }
            if ((Symbols.symbol_function(IDENTITY) != transform)) {
              next = Functions.funcall(transform, next);
            }
            return Values.values(next, state, NIL);
          }
        } else {
          cdestructuring_bind.cdestructuring_bind_error(datum, $list100);
        }
      }
      return NIL;
    }
  }

  
  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject iterator_p(SubLObject object) {
    return ((object.getClass() == $iterator_native.class) ? ((SubLObject) T) : NIL);
  }

  public static final class $iterator_p$UnaryFunction extends UnaryFunction {
    public $iterator_p$UnaryFunction() { super(extractFunctionNamed("ITERATOR-P")); }
    public SubLObject processItem(SubLObject arg1) { return iterator_p(arg1); }
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject it_state(SubLObject object) {
    checkType(object, $sym1$ITERATOR_P);
    return object.getField2();
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject it_done(SubLObject object) {
    checkType(object, $sym1$ITERATOR_P);
    return object.getField3();
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject it_next(SubLObject object) {
    checkType(object, $sym1$ITERATOR_P);
    return object.getField4();
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject it_finalize(SubLObject object) {
    checkType(object, $sym1$ITERATOR_P);
    return object.getField5();
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject _csetf_it_state(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ITERATOR_P);
    return object.setField2(value);
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject _csetf_it_done(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ITERATOR_P);
    return object.setField3(value);
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject _csetf_it_next(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ITERATOR_P);
    return object.setField4(value);
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject _csetf_it_finalize(SubLObject object, SubLObject value) {
    checkType(object, $sym1$ITERATOR_P);
    return object.setField5(value);
  }

  @SubL(source = "cycl/iteration.lisp", position = 1840) 
  public static final SubLObject make_iterator(SubLObject arglist) {
    if ((arglist == UNPROVIDED)) {
      arglist = NIL;
    }
    {
      SubLObject v_new = new $iterator_native();
      SubLObject next = NIL;
      for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
        {
          SubLObject current_arg = next.first();
          SubLObject current_value = conses_high.cadr(next);
          SubLObject pcase_var = current_arg;
          if (pcase_var.eql($kw16$STATE)) {
            _csetf_it_state(v_new, current_value);
          } else if (pcase_var.eql($kw17$DONE)) {
            _csetf_it_done(v_new, current_value);
          } else if (pcase_var.eql($kw18$NEXT)) {
            _csetf_it_next(v_new, current_value);
          } else if (pcase_var.eql($kw19$FINALIZE)) {
            _csetf_it_finalize(v_new, current_value);
          } else {
            Errors.error($str20$Invalid_slot__S_for_construction_, current_arg);
          }
        }
      }
      return v_new;
    }
  }

  /** used to suppress initializing the lazy iterator while merely printing it */
  @SubL(source = "cycl/iteration.lisp", position = 1961) 
  private static SubLSymbol $within_print_iterator$ = null;

  /** Return a new iterator for incrementally iterating over objects in STATE.

STATE is a datastructure which is the initial state of the iteration.

DONE must be a unary function which when called on STATE returns non-nil 
iff the iteration is complete.

NEXT must be a unary function which when called on STATE returns three values :
[1] The next raw iteration item from the state
[2] The resulting updated state
[3] A non-nil value if the iteration halted prematurely (and we are thus done)

FINALIZE is a unary function which is applied to STATE when the iterator is
destroyed.  While it is not strictly necessary, by convention the output should
be non-NIL if and only if the finalization was successful.  NB: this function
should be robust about finalizing an already-finalized iterator. */
  @SubL(source = "cycl/iteration.lisp", position = 2564) 
  public static final SubLObject new_iterator(SubLObject state, SubLObject done, SubLObject next, SubLObject finalize) {
    if ((finalize == UNPROVIDED)) {
      finalize = Symbols.symbol_function($sym26$TRUE);
    }
    {
      SubLObject iterator = make_iterator(UNPROVIDED);
      _csetf_it_state(iterator, state);
      _csetf_it_done(iterator, done);
      _csetf_it_next(iterator, next);
      _csetf_it_finalize(iterator, finalize);
      return iterator;
    }
  }

  /** Return NIL iff ITERATOR has not yet been exhausted. */
  @SubL(source = "cycl/iteration.lisp", position = 3925) 
  public static final SubLObject iteration_done(SubLObject iterator) {
    checkType(iterator, $sym1$ITERATOR_P);
    return Functions.funcall(it_done(iterator), it_state(iterator));
  }

  @SubL(source = "cycl/iteration.lisp", position = 4116) 
  public static final SubLObject iteration_next_funcall(SubLObject next_func, SubLObject next_state) {
    {
      SubLObject pcase_var = next_func;
      if (pcase_var.eql($sym27$HL_STORE_ITERATOR_NEXT)) {
        return hl_interface_infrastructure.hl_store_iterator_next(next_state);
      } else if (pcase_var.eql($sym28$FILTER_ITERATOR_NEXT)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22956");
      } else if (pcase_var.eql($sym29$FILTER_ITERATOR_WITHOUT_VALUES_NEXT)) {
        return filter_iterator_without_values_next(next_state);
      } else {
        return Functions.funcall(next_func, next_state);
      }
    }
  }

  /** Return the next item in the iteration of ITERATOR.
The second value returned is non-nil iff the value returned is valid. */
  @SubL(source = "cycl/iteration.lisp", position = 4508) 
  public static final SubLObject iteration_next(SubLObject iterator) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(iterator, $sym1$ITERATOR_P);
      {
        SubLObject quitP = Functions.funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = NIL;
        SubLObject validP = NIL;
        if ((NIL == quitP)) {
          thread.resetMultipleValues();
          {
            SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            SubLObject raw_state = thread.secondMultipleValue();
            SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if ((NIL == halted_prematurely)) {
              next_item = raw_item;
              validP = T;
            }
          }
        }
        if ((next_state != it_state(iterator))) {
          _csetf_it_state(iterator, next_state);
        }
        return Values.values(next_item, validP);
      }
    }
  }

  /** Return the next item in the iteration of ITERATOR
   or INVALID-TOKEN if the return value is invalid.
   Unlike ITERATION-NEXT, only 1 value is returned. */
  @SubL(source = "cycl/iteration.lisp", position = 5218) 
  public static final SubLObject iteration_next_without_values(SubLObject iterator, SubLObject invalid_token) {
    if ((invalid_token == UNPROVIDED)) {
      invalid_token = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(iterator, $sym1$ITERATOR_P);
      {
        SubLObject quitP = Functions.funcall(it_done(iterator), it_state(iterator));
        SubLObject next_state = it_state(iterator);
        SubLObject next_item = NIL;
        SubLObject validP = NIL;
        if ((NIL == quitP)) {
          thread.resetMultipleValues();
          {
            SubLObject raw_item = iteration_next_funcall(it_next(iterator), next_state);
            SubLObject raw_state = thread.secondMultipleValue();
            SubLObject halted_prematurely = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            next_state = raw_state;
            if ((NIL == halted_prematurely)) {
              next_item = raw_item;
              validP = T;
            }
          }
        }
        if ((next_state != it_state(iterator))) {
          _csetf_it_state(iterator, next_state);
        }
        return ((NIL != validP) ? ((SubLObject) next_item) : invalid_token);
      }
    }
  }

  @SubL(source = "cycl/iteration.lisp", position = 6006) 
  public static final SubLObject iteration_next_without_values_macro_helper(SubLObject iterator, SubLObject invalid_token) {
    if ((invalid_token == UNPROVIDED)) {
      invalid_token = NIL;
    }
    return iteration_next_without_values(iterator, invalid_token);
  }

  @SubL(source = "cycl/iteration.lisp", position = 6217) 
  public static final SubLObject iteration_finalize(SubLObject iterator) {
    checkType(iterator, $sym1$ITERATOR_P);
    return Functions.funcall(it_finalize(iterator), it_state(iterator));
  }

  /** Apply FUNCTION to each object in the iteration of ITERATOR. */
  @SubL(source = "cycl/iteration.lisp", position = 10072) 
  public static final SubLObject map_iterator(SubLObject function, SubLObject iterator) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject done_var = NIL;
        while ((NIL == done_var)) {
          thread.resetMultipleValues();
          {
            SubLObject item = iteration_next(iterator);
            SubLObject valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid)) {
              Functions.funcall(function, item);
            }
            done_var = makeBoolean((NIL == valid));
          }
        }
      }
      return NIL;
    }
  }

  /** Return an iterator that will just return ITEM and halt. */
  @SubL(source = "cycl/iteration.lisp", position = 11909) 
  public static final SubLObject new_singleton_iterator(SubLObject item) {
    if ((NIL == item)) {
      return new_list_iterator(list(item));
    } else {
      return new_iterator(item, $sym67$NULL, $sym68$ITERATE_NON_NULL_SINGLETON_NEXT, UNPROVIDED);
    }
  }

  @SubL(source = "cycl/iteration.lisp", position = 12317) 
  public static final SubLObject iterate_non_null_singleton_next(SubLObject state) {
    return Values.values(state, NIL);
  }

  public static final class $iterate_non_null_singleton_next$UnaryFunction extends UnaryFunction {
    public $iterate_non_null_singleton_next$UnaryFunction() { super(extractFunctionNamed("ITERATE-NON-NULL-SINGLETON-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return iterate_non_null_singleton_next(arg1); }
  }

  public static final class $iterate_number_done$UnaryFunction extends UnaryFunction {
    public $iterate_number_done$UnaryFunction() { super(extractFunctionNamed("ITERATE-NUMBER-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22961"); }
  }

  /** Return T iff OBJECT is a list iterator */
  @SubL(source = "cycl/iteration.lisp", position = 14455) 
  public static final SubLObject list_iterator_p(SubLObject object) {
    return makeBoolean(((NIL != iterator_p(object))
           && (it_next(object) == $sym74$ITERATE_LIST_NEXT)));
  }

  /** Returns an iterator for the elements of LIST. */
  @SubL(source = "cycl/iteration.lisp", position = 14686) 
  public static final SubLObject new_list_iterator(SubLObject list) {
    checkType(list, $sym75$LISTP);
    return new_iterator(make_iterator_list_state(list), $sym76$ITERATE_LIST_DONE, $sym74$ITERATE_LIST_NEXT, UNPROVIDED);
  }

  /** Returns the list of elements that are sequenced through by ITERATOR. */
  @SubL(source = "cycl/iteration.lisp", position = 14911) 
  public static final SubLObject get_list_iterator_list(SubLObject iterator) {
    checkType(iterator, $sym77$LIST_ITERATOR_P);
    return it_state(iterator);
  }

  /** Return the remaining number of objects to iterate in LIST-ITERATOR */
  @SubL(source = "cycl/iteration.lisp", position = 15103) 
  public static final SubLObject list_iterator_size(SubLObject list_iterator) {
    return Sequences.length(get_list_iterator_list(list_iterator));
  }

  @SubL(source = "cycl/iteration.lisp", position = 15285) 
  public static final SubLObject make_iterator_list_state(SubLObject list) {
    return list;
  }

  @SubL(source = "cycl/iteration.lisp", position = 15469) 
  public static final SubLObject iterate_list_done(SubLObject state) {
    return Types.sublisp_null(state);
  }

  public static final class $iterate_list_done$UnaryFunction extends UnaryFunction {
    public $iterate_list_done$UnaryFunction() { super(extractFunctionNamed("ITERATE-LIST-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return iterate_list_done(arg1); }
  }

  @SubL(source = "cycl/iteration.lisp", position = 15536) 
  public static final SubLObject iterate_list_next(SubLObject state) {
    {
      SubLObject next = state.first();
      SubLObject update = state.rest();
      return Values.values(next, update);
    }
  }

  public static final class $iterate_list_next$UnaryFunction extends UnaryFunction {
    public $iterate_list_next$UnaryFunction() { super(extractFunctionNamed("ITERATE-LIST-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return iterate_list_next(arg1); }
  }

  public static final class $iterate_vector_next$UnaryFunction extends UnaryFunction {
    public $iterate_vector_next$UnaryFunction() { super(extractFunctionNamed("ITERATE-VECTOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22962"); }
  }

  /** Returns an iterator for HASH-TABLE.
   Values returned are tuples of the form (<key> <value>). */
  @SubL(source = "cycl/iteration.lisp", position = 18410) 
  public static final SubLObject new_hash_table_iterator(SubLObject hash_table) {
    checkType(hash_table, $sym87$HASH_TABLE_P);
    return new_iterator(make_iterator_hash_table_state(hash_table), $sym88$ITERATOR_HASH_TABLE_DONE, $sym89$ITERATOR_HASH_TABLE_NEXT, UNPROVIDED);
  }

  @SubL(source = "cycl/iteration.lisp", position = 19030) 
  public static final SubLObject make_iterator_hash_table_state(SubLObject hash_table) {
    {
      SubLObject current = hash_table_utilities.hash_table_keys(hash_table);
      return list(current, hash_table);
    }
  }

  @SubL(source = "cycl/iteration.lisp", position = 19503) 
  public static final SubLObject iterator_hash_table_done(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_10 = NIL;
      SubLObject hash_table = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list90);
      current_10 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list90);
      hash_table = current.first();
      current = current.rest();
      if ((NIL == current)) {
        return Types.sublisp_null(current_10);
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list90);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/iteration.lisp", position = 19654) 
  public static final SubLObject iterator_hash_table_next(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_11 = NIL;
      SubLObject hash_table = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list90);
      current_11 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list90);
      hash_table = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject datum_12 = current_11;
          SubLObject current_13 = datum_12;
          SubLObject next_key = NIL;
          SubLObject rest_keys = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current_13, datum_12, $list91);
          next_key = current_13.first();
          current_13 = current_13.rest();
          rest_keys = current_13;
          {
            SubLObject next_value = Hashtables.gethash(next_key, hash_table, UNPROVIDED);
            SubLObject next = list(next_key, next_value);
            SubLObject update = rest_keys;
            if ((NIL == update)) {
              ConsesLow.set_nth(ONE_INTEGER, state, $kw85$UNINITIALIZED);
            }
            ConsesLow.rplaca(state, update);
            return Values.values(next, state);
          }
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list90);
      }
    }
    return NIL;
  }

  /** Returns an iterator that sequences through the iterators in ITERATORS. */
  @SubL(source = "cycl/iteration.lisp", position = 27186) 
  public static final SubLObject new_iterator_iterator(SubLObject iterators) {
    checkType(iterators, $sym75$LISTP);
    if ((NIL == iterators)) {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22987");
    } else if ((NIL != list_utilities.singletonP(iterators))) {
      return iterators.first();
    } else {
      {
        SubLObject state = make_iterator_iterator_state(iterators);
        return new_iterator(state, $sym108$ITERATOR_ITERATOR_DONE, $sym109$ITERATOR_ITERATOR_NEXT, $sym110$ITERATOR_ITERATOR_FINALIZE);
      }
    }
  }

  @SubL(source = "cycl/iteration.lisp", position = 28030) 
  public static final SubLObject make_iterator_iterator_state(SubLObject iterators) {
    {
      SubLObject cdolist_list_var = iterators;
      SubLObject iterator = NIL;
      for (iterator = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), iterator = cdolist_list_var.first()) {
        checkType(iterator, $sym1$ITERATOR_P);
      }
    }
    return iterators;
  }

  /** Returns T IFF the iterators are exhausted.  STATE can be NIL when all
of the iterators have been processed, or can be a singleton or can be a list
of iterators. */
  @SubL(source = "cycl/iteration.lisp", position = 28177) 
  public static final SubLObject iterator_iterator_done(SubLObject state) {
    if ((NIL == state)) {
      return T;
    } else if (state.isCons()) {
      {
        SubLObject cdolist_list_var = state;
        SubLObject iterator = NIL;
        for (iterator = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), iterator = cdolist_list_var.first()) {
          if ((NIL == iteration_done(iterator))) {
            return NIL;
          }
        }
      }
      return T;
    } else {
      return iteration_done(state);
    }
  }

  public static final class $iterator_iterator_done$UnaryFunction extends UnaryFunction {
    public $iterator_iterator_done$UnaryFunction() { super(extractFunctionNamed("ITERATOR-ITERATOR-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return iterator_iterator_done(arg1); }
  }

  @SubL(source = "cycl/iteration.lisp", position = 28589) 
  public static final SubLObject iterator_iterator_next(SubLObject state) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject working_state = state;
        SubLObject next = NIL;
        SubLObject valid_nextP = NIL;
        SubLObject premature_endP = NIL;
        while ((!(((NIL != valid_nextP)
              || (NIL != premature_endP))))) {
          {
            SubLObject current = working_state.first();
            if ((NIL != iteration_done(current))) {
              working_state = working_state.rest();
              premature_endP = Types.sublisp_null(working_state);
            } else {
              thread.resetMultipleValues();
              {
                SubLObject value = iteration_next(current);
                SubLObject validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if ((NIL != validP)) {
                  next = value;
                  valid_nextP = T;
                }
              }
            }
          }
        }
        return Values.values(next, working_state, premature_endP);
      }
    }
  }

  public static final class $iterator_iterator_next$UnaryFunction extends UnaryFunction {
    public $iterator_iterator_next$UnaryFunction() { super(extractFunctionNamed("ITERATOR-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return iterator_iterator_next(arg1); }
  }

  public static final class $reusable_iterator_done$UnaryFunction extends UnaryFunction {
    public $reusable_iterator_done$UnaryFunction() { super(extractFunctionNamed("REUSABLE-ITERATOR-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22998"); }
  }

  public static final class $reusable_iterator_next$UnaryFunction extends UnaryFunction {
    public $reusable_iterator_next$UnaryFunction() { super(extractFunctionNamed("REUSABLE-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22999"); }
  }

  public static final class $reusable_iterator_cartesian_iterator_done$UnaryFunction extends UnaryFunction {
    public $reusable_iterator_cartesian_iterator_done$UnaryFunction() { super(extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22996"); }
  }

  public static final class $reusable_iterator_cartesian_iterator_next$UnaryFunction extends UnaryFunction {
    public $reusable_iterator_cartesian_iterator_next$UnaryFunction() { super(extractFunctionNamed("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT")); }
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 22997"); }
  }

  /** Return an iterator that filters each raw-value from another ITERATOR.
   RAW-VALUE is returned iff (apply FILTER-METHOD RAW-VALUE FILTER-ARGS) is non-nil.
   Unlike NEW-FILTER-ITERATOR, the INPUT-ITERATOR is iterated under the assumption that INVALID-TOKEN
   is used to indicated an invalid value rather than a second value. */
  @SubL(source = "cycl/iteration.lisp", position = 40224) 
  public static final SubLObject new_filter_iterator_without_values(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
    if ((filter_args == UNPROVIDED)) {
      filter_args = NIL;
    }
    if ((invalid_token == UNPROVIDED)) {
      invalid_token = NIL;
    }
    checkType(input_iterator, $sym1$ITERATOR_P);
    checkType(filter_method, $sym65$FUNCTION_SPEC_P);
    checkType(filter_args, $sym75$LISTP);
    return new_iterator(make_filter_iterator_without_values_state(input_iterator, filter_method, filter_args, invalid_token), $sym82$DEFAULT_ITERATOR_DONE_P, $sym29$FILTER_ITERATOR_WITHOUT_VALUES_NEXT, UNPROVIDED);
  }

  @SubL(source = "cycl/iteration.lisp", position = 41998) 
  public static final SubLObject make_filter_iterator_without_values_state(SubLObject input_iterator, SubLObject filter_method, SubLObject filter_args, SubLObject invalid_token) {
    {
      SubLObject current = input_iterator;
      return list(current, filter_method, filter_args, invalid_token);
    }
  }

  @SubL(source = "cycl/iteration.lisp", position = 43116) 
  public static final SubLObject filter_iterator_without_values_next(SubLObject state) {
    {
      SubLObject datum = state;
      SubLObject current = datum;
      SubLObject current_22 = NIL;
      SubLObject filter_method = NIL;
      SubLObject filter_args = NIL;
      SubLObject invalid_token = NIL;
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list138);
      current_22 = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list138);
      filter_method = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list138);
      filter_args = current.first();
      current = current.rest();
      cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list138);
      invalid_token = current.first();
      current = current.rest();
      if ((NIL == current)) {
        {
          SubLObject answer = NIL;
          SubLObject done = NIL;
          SubLObject invalid = NIL;
          while ((NIL == done)) {
            {
              SubLObject next = iteration_next_without_values(current_22, invalid_token);
              SubLObject valid = makeBoolean((next != invalid_token));
              if ((NIL != valid)) {
                if ((NIL != Functions.apply(filter_method, next, filter_args))) {
                  answer = next;
                  done = T;
                }
              } else {
                {
                  SubLObject update = $kw17$DONE;
                  ConsesLow.rplaca(state, update);
                  ConsesLow.rplacd(state, NIL);
                  done = T;
                  invalid = T;
                }
              }
            }
          }
          return Values.values(answer, state, invalid);
        }
      } else {
        cdestructuring_bind.cdestructuring_bind_error(datum, $list138);
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/iteration.lisp", position = 44726) 
  public static final SubLObject default_iterator_done_p(SubLObject state) {
    return Equality.eq($kw17$DONE, Sequences.elt(state, ZERO_INTEGER));
  }

  public static final class $default_iterator_done_p$UnaryFunction extends UnaryFunction {
    public $default_iterator_done_p$UnaryFunction() { super(extractFunctionNamed("DEFAULT-ITERATOR-DONE-P")); }
    public SubLObject processItem(SubLObject arg1) { return default_iterator_done_p(arg1); }
  }

  public static final SubLObject declare_iteration_file() {
    declareFunction(myName, "iterator_print_function_trampoline", "ITERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
    declareFunction(myName, "iterator_p", "ITERATOR-P", 1, 0, false); new $iterator_p$UnaryFunction();
    declareFunction(myName, "it_state", "IT-STATE", 1, 0, false);
    declareFunction(myName, "it_done", "IT-DONE", 1, 0, false);
    declareFunction(myName, "it_next", "IT-NEXT", 1, 0, false);
    declareFunction(myName, "it_finalize", "IT-FINALIZE", 1, 0, false);
    declareFunction(myName, "_csetf_it_state", "_CSETF-IT-STATE", 2, 0, false);
    declareFunction(myName, "_csetf_it_done", "_CSETF-IT-DONE", 2, 0, false);
    declareFunction(myName, "_csetf_it_next", "_CSETF-IT-NEXT", 2, 0, false);
    declareFunction(myName, "_csetf_it_finalize", "_CSETF-IT-FINALIZE", 2, 0, false);
    declareFunction(myName, "make_iterator", "MAKE-ITERATOR", 0, 1, false);
    declareFunction(myName, "print_iterator", "PRINT-ITERATOR", 3, 0, false);
    declareFunction(myName, "new_iterator", "NEW-ITERATOR", 3, 1, false);
    declareFunction(myName, "iteration_done", "ITERATION-DONE", 1, 0, false);
    declareFunction(myName, "iteration_next_funcall", "ITERATION-NEXT-FUNCALL", 2, 0, false);
    declareFunction(myName, "iteration_next", "ITERATION-NEXT", 1, 0, false);
    declareFunction(myName, "iteration_next_without_values", "ITERATION-NEXT-WITHOUT-VALUES", 1, 1, false);
    declareFunction(myName, "iteration_next_without_values_macro_helper", "ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER", 1, 1, false);
    declareFunction(myName, "iteration_finalize", "ITERATION-FINALIZE", 1, 0, false);
    declareFunction(myName, "iterator_type_name", "ITERATOR-TYPE-NAME", 1, 0, false);
    declareFunction(myName, "iteration_state_peek", "ITERATION-STATE-PEEK", 1, 0, false);
    declareFunction(myName, "iteration_next_peek", "ITERATION-NEXT-PEEK", 1, 0, false);
    declareMacro(myName, "do_iterator", "DO-ITERATOR");
    declareMacro(myName, "do_iterator_without_values", "DO-ITERATOR-WITHOUT-VALUES");
    declareMacro(myName, "do_iterator_without_values_internal", "DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
    declareMacro(myName, "do_n_iterator_objects", "DO-N-ITERATOR-OBJECTS");
    declareFunction(myName, "map_iterator", "MAP-ITERATOR", 2, 0, false);
    declareFunction(myName, "copy_iterator", "COPY-ITERATOR", 1, 1, false);
    declareFunction(myName, "iterator_value_list", "ITERATOR-VALUE-LIST", 1, 0, false);
    declareFunction(myName, "generic_producer", "GENERIC-PRODUCER", 2, 1, false);
    declareFunction(myName, "new_null_iterator", "NEW-NULL-ITERATOR", 0, 0, false);
    declareFunction(myName, "new_singleton_iterator", "NEW-SINGLETON-ITERATOR", 1, 0, false);
    declareFunction(myName, "iterate_non_null_singleton_next", "ITERATE-NON-NULL-SINGLETON-NEXT", 1, 0, false); new $iterate_non_null_singleton_next$UnaryFunction();
    declareFunction(myName, "new_integer_iterator", "NEW-INTEGER-ITERATOR", 0, 3, false);
    declareFunction(myName, "new_number_iterator", "NEW-NUMBER-ITERATOR", 0, 3, false);
    declareFunction(myName, "make_iterator_number_state", "MAKE-ITERATOR-NUMBER-STATE", 3, 0, false);
    declareFunction(myName, "iterate_number_done", "ITERATE-NUMBER-DONE", 1, 0, false); new $iterate_number_done$UnaryFunction();
    declareFunction(myName, "iterate_number_next", "ITERATE-NUMBER-NEXT", 1, 0, false);
    declareFunction(myName, "list_iterator_p", "LIST-ITERATOR-P", 1, 0, false);
    declareFunction(myName, "new_list_iterator", "NEW-LIST-ITERATOR", 1, 0, false);
    declareFunction(myName, "get_list_iterator_list", "GET-LIST-ITERATOR-LIST", 1, 0, false);
    declareFunction(myName, "list_iterator_size", "LIST-ITERATOR-SIZE", 1, 0, false);
    declareFunction(myName, "make_iterator_list_state", "MAKE-ITERATOR-LIST-STATE", 1, 0, false);
    declareFunction(myName, "iterate_list_done", "ITERATE-LIST-DONE", 1, 0, false); new $iterate_list_done$UnaryFunction();
    declareFunction(myName, "iterate_list_next", "ITERATE-LIST-NEXT", 1, 0, false); new $iterate_list_next$UnaryFunction();
    declareFunction(myName, "new_alist_iterator", "NEW-ALIST-ITERATOR", 1, 0, false);
    declareFunction(myName, "cons_to_tuple", "CONS-TO-TUPLE", 1, 0, false);
    declareFunction(myName, "new_vector_iterator", "NEW-VECTOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_iterator_vector_state", "MAKE-ITERATOR-VECTOR-STATE", 1, 0, false);
    declareFunction(myName, "iterate_vector_next", "ITERATE-VECTOR-NEXT", 1, 0, false); new $iterate_vector_next$UnaryFunction();
    declareFunction(myName, "new_vector_index_iterator", "NEW-VECTOR-INDEX-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_iterator_vector_index_state", "MAKE-ITERATOR-VECTOR-INDEX-STATE", 1, 0, false);
    declareFunction(myName, "iterate_vector_index_next", "ITERATE-VECTOR-INDEX-NEXT", 1, 0, false);
    declareFunction(myName, "new_hash_table_iterator", "NEW-HASH-TABLE-ITERATOR", 1, 0, false);
    declareFunction(myName, "new_hash_table_values_iterator", "NEW-HASH-TABLE-VALUES-ITERATOR", 1, 0, false);
    declareFunction(myName, "make_iterator_hash_table_state", "MAKE-ITERATOR-HASH-TABLE-STATE", 1, 0, false);
    declareFunction(myName, "iterator_hash_table_done", "ITERATOR-HASH-TABLE-DONE", 1, 0, false);
    declareFunction(myName, "iterator_hash_table_next", "ITERATOR-HASH-TABLE-NEXT", 1, 0, false);
    declareFunction(myName, "new_lazy_iterator", "NEW-LAZY-ITERATOR", 2, 0, false);
    declareFunction(myName, "lazy_iterator_uninitializedP", "LAZY-ITERATOR-UNINITIALIZED?", 1, 0, false);
    declareFunction(myName, "lazy_iterator_valid_uninitializedP", "LAZY-ITERATOR-VALID-UNINITIALIZED?", 1, 0, false);
    declareFunction(myName, "initialize_lazy_iterator", "INITIALIZE-LAZY-ITERATOR", 1, 0, false);
    declareFunction(myName, "lazy_iterator_done", "LAZY-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "lazy_iterator_next", "LAZY-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "new_indirect_iterator", "NEW-INDIRECT-ITERATOR", 1, 2, false);
    declareFunction(myName, "make_iterator_indirect_state", "MAKE-ITERATOR-INDIRECT-STATE", 2, 0, false);
    declareFunction(myName, "iterate_indirect_next", "ITERATE-INDIRECT-NEXT", 1, 0, false);
    declareFunction(myName, "iterate_indirect_finalize", "ITERATE-INDIRECT-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_factory_iterator", "NEW-FACTORY-ITERATOR", 1, 2, false);
    declareFunction(myName, "make_iterator_factory_state", "MAKE-ITERATOR-FACTORY-STATE", 2, 0, false);
    declareFunction(myName, "iterate_factory_next", "ITERATE-FACTORY-NEXT", 1, 0, false);
    declareFunction(myName, "iterate_factory_finalize", "ITERATE-FACTORY-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_iterator_iterator", "NEW-ITERATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "get_iterator_iterator_iterators", "GET-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
    declareFunction(myName, "make_iterator_iterator_state", "MAKE-ITERATOR-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "iterator_iterator_done", "ITERATOR-ITERATOR-DONE", 1, 0, false); new $iterator_iterator_done$UnaryFunction();
    declareFunction(myName, "iterator_iterator_next", "ITERATOR-ITERATOR-NEXT", 1, 0, false); new $iterator_iterator_next$UnaryFunction();
    declareFunction(myName, "iterator_iterator_finalize", "ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_rotating_iterator_iterator", "NEW-ROTATING-ITERATOR-ITERATOR", 1, 0, false);
    declareFunction(myName, "validate_iterators", "VALIDATE-ITERATORS", 1, 1, false);
    declareFunction(myName, "get_rotating_iterator_iterator_iterators", "GET-ROTATING-ITERATOR-ITERATOR-ITERATORS", 1, 0, false);
    declareFunction(myName, "make_rotating_iterator_iterator_state", "MAKE-ROTATING-ITERATOR-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "rotating_iterator_iterator_done", "ROTATING-ITERATOR-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "rotating_iterator_iterator_next", "ROTATING-ITERATOR-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "rotating_iterator_iterator_finalize", "ROTATING-ITERATOR-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_reusable_iterator", "NEW-REUSABLE-ITERATOR", 3, 1, false);
    declareFunction(myName, "reusable_iterator_done", "REUSABLE-ITERATOR-DONE", 1, 0, false); new $reusable_iterator_done$UnaryFunction();
    declareFunction(myName, "reusable_iterator_next", "REUSABLE-ITERATOR-NEXT", 1, 0, false); new $reusable_iterator_next$UnaryFunction();
    declareFunction(myName, "reusable_iterator_finalize", "REUSABLE-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_reusable_iterator_from_iterator", "NEW-REUSABLE-ITERATOR-FROM-ITERATOR", 1, 0, false);
    declareFunction(myName, "reusable_iterator_from_iterator_done", "REUSABLE-ITERATOR-FROM-ITERATOR-DONE", 1, 0, false);
    declareFunction(myName, "reusable_iterator_from_iterator_next", "REUSABLE-ITERATOR-FROM-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "reusable_iterator_from_iterator_finalize", "REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_reusable_list_iterator", "NEW-REUSABLE-LIST-ITERATOR", 1, 0, false);
    declareFunction(myName, "reset_reusable_iterator", "RESET-REUSABLE-ITERATOR", 1, 0, false);
    declareFunction(myName, "finish_reusable_iterator", "FINISH-REUSABLE-ITERATOR", 1, 0, false);
    declareMacro(myName, "do_reusable_iterator", "DO-REUSABLE-ITERATOR");
    declareFunction(myName, "map_reusable_iterator", "MAP-REUSABLE-ITERATOR", 2, 0, false);
    declareFunction(myName, "new_reusable_iterator_cartesian_iterator", "NEW-REUSABLE-ITERATOR-CARTESIAN-ITERATOR", 1, 0, false);
    declareFunction(myName, "reusable_iterator_cartesian_iterator_state", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-STATE", 1, 0, false);
    declareFunction(myName, "reusable_iterator_cartesian_iterator_done", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE", 1, 0, false); new $reusable_iterator_cartesian_iterator_done$UnaryFunction();
    declareFunction(myName, "all_iterators_doneP", "ALL-ITERATORS-DONE?", 1, 0, false);
    declareFunction(myName, "reusable_iterator_cartesian_iterator_next", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT", 1, 0, false); new $reusable_iterator_cartesian_iterator_next$UnaryFunction();
    declareFunction(myName, "reusable_iterator_cartesian_iterator_finalize", "REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE", 1, 0, false);
    declareFunction(myName, "new_filter_iterator", "NEW-FILTER-ITERATOR", 2, 1, false);
    declareFunction(myName, "new_filter_iterator_without_values", "NEW-FILTER-ITERATOR-WITHOUT-VALUES", 2, 2, false);
    declareFunction(myName, "new_filter_and_transform_iterator", "NEW-FILTER-AND-TRANSFORM-ITERATOR", 2, 1, false);
    declareFunction(myName, "make_filter_iterator_state", "MAKE-FILTER-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "make_filter_iterator_without_values_state", "MAKE-FILTER-ITERATOR-WITHOUT-VALUES-STATE", 4, 0, false);
    declareFunction(myName, "make_filter_and_tranform_iterator_state", "MAKE-FILTER-AND-TRANFORM-ITERATOR-STATE", 3, 0, false);
    declareFunction(myName, "filter_iterator_next", "FILTER-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "filter_iterator_without_values_next", "FILTER-ITERATOR-WITHOUT-VALUES-NEXT", 1, 0, false);
    declareFunction(myName, "filter_and_transform_iterator_next", "FILTER-AND-TRANSFORM-ITERATOR-NEXT", 1, 0, false);
    declareFunction(myName, "default_iterator_done_p", "DEFAULT-ITERATOR-DONE-P", 1, 0, false); new $default_iterator_done_p$UnaryFunction();
    declareFunction(myName, "test_iterate_once", "TEST-ITERATE-ONCE", 1, 0, false);
    declareFunction(myName, "test_iterate_all", "TEST-ITERATE-ALL", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_p", "XML-TOKEN-ITERATOR-P", 1, 0, false);
    declareFunction(myName, "xml_token_iterator_peek", "XML-TOKEN-ITERATOR-PEEK", 1, 0, false);
    return NIL;
  }

  public static final SubLObject init_iteration_file() {
    $dtp_iterator$ = defconstant("*DTP-ITERATOR*", $sym0$ITERATOR);
    $within_print_iterator$ = defparameter("*WITHIN-PRINT-ITERATOR*", NIL);
    return NIL;
  }

  public static final SubLObject setup_iteration_file() {
    // CVS_ID("Id: iteration.lisp 128434 2009-07-28 22:05:56Z goolsbey ");
    Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), $dtp_iterator$.getGlobalValue(), Symbols.symbol_function($sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE));
    Structures.def_csetf($sym8$IT_STATE, $sym9$_CSETF_IT_STATE);
    Structures.def_csetf($sym10$IT_DONE, $sym11$_CSETF_IT_DONE);
    Structures.def_csetf($sym12$IT_NEXT, $sym13$_CSETF_IT_NEXT);
    Structures.def_csetf($sym14$IT_FINALIZE, $sym15$_CSETF_IT_FINALIZE);
    Equality.identity($sym0$ITERATOR);
    access_macros.register_macro_helper($sym30$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER, $sym31$DO_ITERATOR_WITHOUT_VALUES_INTERNAL);
    access_macros.register_macro_helper($sym31$DO_ITERATOR_WITHOUT_VALUES_INTERNAL, $list51);
    return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$ITERATOR = makeSymbol("ITERATOR");
  public static final SubLSymbol $sym1$ITERATOR_P = makeSymbol("ITERATOR-P");
  public static final SubLList $list2 = list(makeSymbol("STATE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));
  public static final SubLList $list3 = list(makeKeyword("STATE"), makeKeyword("DONE"), makeKeyword("NEXT"), makeKeyword("FINALIZE"));
  public static final SubLList $list4 = list(makeSymbol("IT-STATE"), makeSymbol("IT-DONE"), makeSymbol("IT-NEXT"), makeSymbol("IT-FINALIZE"));
  public static final SubLList $list5 = list(makeSymbol("_CSETF-IT-STATE"), makeSymbol("_CSETF-IT-DONE"), makeSymbol("_CSETF-IT-NEXT"), makeSymbol("_CSETF-IT-FINALIZE"));
  public static final SubLSymbol $sym6$PRINT_ITERATOR = makeSymbol("PRINT-ITERATOR");
  public static final SubLSymbol $sym7$ITERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITERATOR-PRINT-FUNCTION-TRAMPOLINE");
  public static final SubLSymbol $sym8$IT_STATE = makeSymbol("IT-STATE");
  public static final SubLSymbol $sym9$_CSETF_IT_STATE = makeSymbol("_CSETF-IT-STATE");
  public static final SubLSymbol $sym10$IT_DONE = makeSymbol("IT-DONE");
  public static final SubLSymbol $sym11$_CSETF_IT_DONE = makeSymbol("_CSETF-IT-DONE");
  public static final SubLSymbol $sym12$IT_NEXT = makeSymbol("IT-NEXT");
  public static final SubLSymbol $sym13$_CSETF_IT_NEXT = makeSymbol("_CSETF-IT-NEXT");
  public static final SubLSymbol $sym14$IT_FINALIZE = makeSymbol("IT-FINALIZE");
  public static final SubLSymbol $sym15$_CSETF_IT_FINALIZE = makeSymbol("_CSETF-IT-FINALIZE");
  public static final SubLSymbol $kw16$STATE = makeKeyword("STATE");
  public static final SubLSymbol $kw17$DONE = makeKeyword("DONE");
  public static final SubLSymbol $kw18$NEXT = makeKeyword("NEXT");
  public static final SubLSymbol $kw19$FINALIZE = makeKeyword("FINALIZE");
  public static final SubLString $str20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");
  public static final SubLString $str21$__ = makeString("#<");
  public static final SubLSymbol $kw22$STREAM = makeKeyword("STREAM");
  public static final SubLString $str23$_DONE_ = makeString(" DONE ");
  public static final SubLString $str24$_ = makeString(" ");
  public static final SubLSymbol $kw25$BASE = makeKeyword("BASE");
  public static final SubLSymbol $sym26$TRUE = makeSymbol("TRUE");
  public static final SubLSymbol $sym27$HL_STORE_ITERATOR_NEXT = makeSymbol("HL-STORE-ITERATOR-NEXT");
  public static final SubLSymbol $sym28$FILTER_ITERATOR_NEXT = makeSymbol("FILTER-ITERATOR-NEXT");
  public static final SubLSymbol $sym29$FILTER_ITERATOR_WITHOUT_VALUES_NEXT = makeSymbol("FILTER-ITERATOR-WITHOUT-VALUES-NEXT");
  public static final SubLSymbol $sym30$ITERATION_NEXT_WITHOUT_VALUES_MACRO_HELPER = makeSymbol("ITERATION-NEXT-WITHOUT-VALUES-MACRO-HELPER");
  public static final SubLSymbol $sym31$DO_ITERATOR_WITHOUT_VALUES_INTERNAL = makeSymbol("DO-ITERATOR-WITHOUT-VALUES-INTERNAL");
  public static final SubLString $str32$_NEXT = makeString("-NEXT");
  public static final SubLList $list33 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list34 = list(makeKeyword("DONE"));
  public static final SubLSymbol $kw35$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $sym36$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");
  public static final SubLSymbol $sym37$CLET = makeSymbol("CLET");
  public static final SubLSymbol $sym38$DO_ITERATOR = makeSymbol("DO-ITERATOR");
  public static final SubLSymbol $sym39$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym40$VALID = makeUninternedSymbol("VALID");
  public static final SubLSymbol $sym41$UNTIL = makeSymbol("UNTIL");
  public static final SubLSymbol $sym42$CMULTIPLE_VALUE_BIND = makeSymbol("CMULTIPLE-VALUE-BIND");
  public static final SubLSymbol $sym43$ITERATION_NEXT = makeSymbol("ITERATION-NEXT");
  public static final SubLSymbol $sym44$PWHEN = makeSymbol("PWHEN");
  public static final SubLSymbol $sym45$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym46$COR = makeSymbol("COR");
  public static final SubLSymbol $sym47$CNOT = makeSymbol("CNOT");
  public static final SubLList $list48 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("INVALID-TOKEN"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list49 = list(makeKeyword("INVALID-TOKEN"), makeKeyword("DONE"));
  public static final SubLSymbol $kw50$INVALID_TOKEN = makeKeyword("INVALID-TOKEN");
  public static final SubLList $list51 = list(new SubLObject[] {makeSymbol("DO-ITERATOR-WITHOUT-VALUES"), makeSymbol("DO-FINAL-INDEX-FROM-SPEC"), makeSymbol("DO-GAF-ARG-INDEX"), makeSymbol("DO-PREDICATE-EXTENT-INDEX"), makeSymbol("DO-NART-ARG-INDEX"), makeSymbol("DO-FUNCTION-EXTENT-INDEX"), makeSymbol("DO-PREDICATE-RULE-INDEX"), makeSymbol("DO-ISA-RULE-INDEX"), makeSymbol("DO-QUOTED-ISA-RULE-INDEX"), makeSymbol("DO-GENLS-RULE-INDEX"), makeSymbol("DO-GENL-MT-RULE-INDEX"), makeSymbol("DO-EXCEPTION-RULE-INDEX"), makeSymbol("DO-PRAGMA-RULE-INDEX"), makeSymbol("DO-UNBOUND-PREDICATE-RULE-INDEX"), makeSymbol("DO-MT-INDEX"), makeSymbol("DO-OTHER-INDEX"), makeSymbol("DO-TERM-INDEX")});
  public static final SubLSymbol $sym52$ITERATOR_VAR = makeUninternedSymbol("ITERATOR-VAR");
  public static final SubLSymbol $sym53$DONE_VAR = makeUninternedSymbol("DONE-VAR");
  public static final SubLSymbol $sym54$TOKEN_VAR = makeUninternedSymbol("TOKEN-VAR");
  public static final SubLSymbol $sym55$VALID = makeUninternedSymbol("VALID");
  public static final SubLList $list56 = list(list(makeSymbol("VAR"), makeSymbol("N"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym57$COUNT = makeUninternedSymbol("COUNT");
  public static final SubLSymbol $sym58$NEW_DONE = makeUninternedSymbol("NEW-DONE");
  public static final SubLList $list59 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym60$__ = makeSymbol(">=");
  public static final SubLSymbol $sym61$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym62$CINC = makeSymbol("CINC");
  public static final SubLList $list63 = list(T);
  public static final SubLSymbol $sym64$COPY_TREE = makeSymbol("COPY-TREE");
  public static final SubLSymbol $sym65$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym66$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym67$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym68$ITERATE_NON_NULL_SINGLETON_NEXT = makeSymbol("ITERATE-NON-NULL-SINGLETON-NEXT");
  public static final SubLSymbol $sym69$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLSymbol $sym70$NUMBERP = makeSymbol("NUMBERP");
  public static final SubLSymbol $sym71$ITERATE_NUMBER_DONE = makeSymbol("ITERATE-NUMBER-DONE");
  public static final SubLSymbol $sym72$ITERATE_NUMBER_NEXT = makeSymbol("ITERATE-NUMBER-NEXT");
  public static final SubLList $list73 = list(makeSymbol("CURRENT"), makeSymbol("DELTA"), makeSymbol("END"));
  public static final SubLSymbol $sym74$ITERATE_LIST_NEXT = makeSymbol("ITERATE-LIST-NEXT");
  public static final SubLSymbol $sym75$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym76$ITERATE_LIST_DONE = makeSymbol("ITERATE-LIST-DONE");
  public static final SubLSymbol $sym77$LIST_ITERATOR_P = makeSymbol("LIST-ITERATOR-P");
  public static final SubLSymbol $sym78$ALIST_P = makeSymbol("ALIST-P");
  public static final SubLSymbol $sym79$CONS_TO_TUPLE = makeSymbol("CONS-TO-TUPLE");
  public static final SubLList $list80 = cons(makeSymbol("CAR"), makeSymbol("CDR"));
  public static final SubLSymbol $sym81$VECTORP = makeSymbol("VECTORP");
  public static final SubLSymbol $sym82$DEFAULT_ITERATOR_DONE_P = makeSymbol("DEFAULT-ITERATOR-DONE-P");
  public static final SubLSymbol $sym83$ITERATE_VECTOR_NEXT = makeSymbol("ITERATE-VECTOR-NEXT");
  public static final SubLList $list84 = list(makeSymbol("CURRENT"), makeSymbol("VECTOR"));
  public static final SubLSymbol $kw85$UNINITIALIZED = makeKeyword("UNINITIALIZED");
  public static final SubLSymbol $sym86$ITERATE_VECTOR_INDEX_NEXT = makeSymbol("ITERATE-VECTOR-INDEX-NEXT");
  public static final SubLSymbol $sym87$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLSymbol $sym88$ITERATOR_HASH_TABLE_DONE = makeSymbol("ITERATOR-HASH-TABLE-DONE");
  public static final SubLSymbol $sym89$ITERATOR_HASH_TABLE_NEXT = makeSymbol("ITERATOR-HASH-TABLE-NEXT");
  public static final SubLList $list90 = list(makeSymbol("CURRENT"), makeSymbol("HASH-TABLE"));
  public static final SubLList $list91 = cons(makeSymbol("NEXT-KEY"), makeSymbol("REST-KEYS"));
  public static final SubLSymbol $sym92$LAZY_ITERATOR_DONE = makeSymbol("LAZY-ITERATOR-DONE");
  public static final SubLSymbol $sym93$LAZY_ITERATOR_NEXT = makeSymbol("LAZY-ITERATOR-NEXT");
  public static final SubLList $list94 = list(makeSymbol("LAZY-ITERATOR"), makeSymbol("CONSTRUCTOR"), makeSymbol("ARG-FORMS"));
  public static final SubLString $str95$_A_is_not_a_well_formed_uninitial = makeString("~A is not a well formed uninitialized lazy iterator");
  public static final SubLSymbol $sym96$CYC_API_EVAL = makeSymbol("CYC-API-EVAL");
  public static final SubLSymbol $sym97$CONSP = makeSymbol("CONSP");
  public static final SubLSymbol $sym98$ITERATE_INDIRECT_FINALIZE = makeSymbol("ITERATE-INDIRECT-FINALIZE");
  public static final SubLSymbol $sym99$ITERATE_INDIRECT_NEXT = makeSymbol("ITERATE-INDIRECT-NEXT");
  public static final SubLList $list100 = list(makeSymbol("CURRENT"), makeSymbol("TRANSFORM"));
  public static final SubLSymbol $sym101$ITERATE_FACTORY_FINALIZE = makeSymbol("ITERATE-FACTORY-FINALIZE");
  public static final SubLSymbol $sym102$ITERATE_FACTORY_NEXT = makeSymbol("ITERATE-FACTORY-NEXT");
  public static final SubLSymbol $kw103$START = makeKeyword("START");
  public static final SubLList $list104 = list(makeSymbol("CURRENT"), makeSymbol("MODE"), makeSymbol("CONSTRUCTORS"), makeSymbol("DATA"));
  public static final SubLSymbol $kw105$CONSTRUCT = makeKeyword("CONSTRUCT");
  public static final SubLList $list106 = cons(makeSymbol("NEXT-CONSTRUCTOR"), makeSymbol("REST-CONSTRUCTORS"));
  public static final SubLSymbol $kw107$SUBITERATE = makeKeyword("SUBITERATE");
  public static final SubLSymbol $sym108$ITERATOR_ITERATOR_DONE = makeSymbol("ITERATOR-ITERATOR-DONE");
  public static final SubLSymbol $sym109$ITERATOR_ITERATOR_NEXT = makeSymbol("ITERATOR-ITERATOR-NEXT");
  public static final SubLSymbol $sym110$ITERATOR_ITERATOR_FINALIZE = makeSymbol("ITERATOR-ITERATOR-FINALIZE");
  public static final SubLSymbol $sym111$ROTATING_ITERATOR_ITERATOR_DONE = makeSymbol("ROTATING-ITERATOR-ITERATOR-DONE");
  public static final SubLSymbol $sym112$ROTATING_ITERATOR_ITERATOR_NEXT = makeSymbol("ROTATING-ITERATOR-ITERATOR-NEXT");
  public static final SubLSymbol $sym113$ROTATING_ITERATOR_ITERATOR_FINALIZE = makeSymbol("ROTATING-ITERATOR-ITERATOR-FINALIZE");
  public static final SubLString $str114$ = makeString("");
  public static final SubLString $str115$invalid_lazy_iterator_found_in_me = makeString("invalid lazy iterator found in meta-iterator ~A ~A");
  public static final SubLString $str116$in_make_rotating_iterator_iterato = makeString("in make-rotating-iterator-iterator-state");
  public static final SubLList $list117 = list(makeSymbol("INDEX"), makeSymbol("ITERATORS"));
  public static final SubLSymbol $kw118$INITIAL = makeKeyword("INITIAL");
  public static final SubLSymbol $sym119$REUSABLE_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-DONE");
  public static final SubLSymbol $sym120$REUSABLE_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-NEXT");
  public static final SubLSymbol $sym121$REUSABLE_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-FINALIZE");
  public static final SubLList $list122 = list(makeSymbol("REAL-STATE"), makeSymbol("QUEUE"), makeSymbol("MODE"), makeSymbol("DONE"), makeSymbol("NEXT"), makeSymbol("FINALIZE"));
  public static final SubLSymbol $kw123$REUSE = makeKeyword("REUSE");
  public static final SubLString $str124$Unknown_mode___a_ = makeString("Unknown mode: ~a.");
  public static final SubLSymbol $sym125$REUSABLE_ITERATOR_FROM_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-DONE");
  public static final SubLSymbol $sym126$REUSABLE_ITERATOR_FROM_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-NEXT");
  public static final SubLSymbol $sym127$REUSABLE_ITERATOR_FROM_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-FROM-ITERATOR-FINALIZE");
  public static final SubLList $list128 = list(list(makeSymbol("VAR"), makeSymbol("ITERATOR"), makeSymbol("&KEY"), makeSymbol("DONE"), list(makeSymbol("RESET"), T)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list129 = list(makeKeyword("DONE"), makeKeyword("RESET"));
  public static final SubLSymbol $kw130$RESET = makeKeyword("RESET");
  public static final SubLSymbol $sym131$RESET_REUSABLE_ITERATOR = makeSymbol("RESET-REUSABLE-ITERATOR");
  public static final SubLSymbol $sym132$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_DONE = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-DONE");
  public static final SubLSymbol $sym133$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_NEXT = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-NEXT");
  public static final SubLSymbol $sym134$REUSABLE_ITERATOR_CARTESIAN_ITERATOR_FINALIZE = makeSymbol("REUSABLE-ITERATOR-CARTESIAN-ITERATOR-FINALIZE");
  public static final SubLList $list135 = list(makeSymbol("REVERSE-ITERATORS"), makeSymbol("REVERSE-RESULT"));
  public static final SubLSymbol $sym136$FILTER_AND_TRANSFORM_ITERATOR_NEXT = makeSymbol("FILTER-AND-TRANSFORM-ITERATOR-NEXT");
  public static final SubLList $list137 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"));
  public static final SubLList $list138 = list(makeSymbol("CURRENT"), makeSymbol("FILTER-METHOD"), makeSymbol("FILTER-ARGS"), makeSymbol("INVALID-TOKEN"));
  public static final SubLSymbol $sym139$ITERATE_XML_TOKEN_NEXT = makeSymbol("ITERATE-XML-TOKEN-NEXT");
  public static final SubLSymbol $sym140$XML_TOKEN_ITERATOR_P = makeSymbol("XML-TOKEN-ITERATOR-P");

  //// Initializers

  public void declareFunctions() {
    declare_iteration_file();
  }

  public void initializeVariables() {
    init_iteration_file();
  }

  public void runTopLevelForms() {
    setup_iteration_file();
  }

}
