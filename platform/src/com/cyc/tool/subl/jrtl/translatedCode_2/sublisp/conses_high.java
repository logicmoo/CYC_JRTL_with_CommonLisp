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

package  com.cyc.tool.subl.jrtl.translatedCode_2.sublisp;

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

public  final class conses_high extends SubLTranslatedFile {

  //// Constructor

  private conses_high() {}
  public static final SubLFile me = new conses_high();
  public static final String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high";

  //// Definitions

  /** Return CONS if its CAR and CDR are unchanged, else return a new cons. */
  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _recons(SubLObject car, SubLObject cdr, SubLObject cons) {
    if ((car.eql(cons.first())
         && cdr.eql(cons.rest()))) {
      return cons;
    } else {
      return cons(car, cdr);
    }
  }

  /** Return CONS after replacing its CAR and CDR. */
  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _ncons(SubLObject car, SubLObject cdr, SubLObject cons) {
    if ((!(car.eql(cons.first())))) {
      ConsesLow.rplaca(cons, car);
    }
    if ((!(cdr.eql(cons.rest())))) {
      ConsesLow.rplacd(cons, cdr);
    }
    return cons;
  }

  /** Return the number of cons cells required to implement LIST, or NIL if circular */
  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _cons_length(SubLObject list) {
    checkType(list, $sym0$LISTP);
    if ((NIL == list)) {
      return ZERO_INTEGER;
    } else if (list.rest().isAtom()) {
      return ONE_INTEGER;
    }
    {
      SubLObject slow = NIL;
      SubLObject fast = NIL;
      SubLObject length = NIL;
      for (slow = list.rest(), fast = cddr(list), length = TWO_INTEGER; (fast != slow); slow = slow.rest(), fast = cddr(fast), length = Numbers.add(TWO_INTEGER, length)) {
        if (fast.isAtom()) {
          return length;
        } else if (fast.rest().isAtom()) {
          return Numbers.add(ONE_INTEGER, length);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject caar(SubLObject list) {
    return list.first().first();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject cadr(SubLObject list) {
    return list.rest().first();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject cdar(SubLObject list) {
    return list.first().rest();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject cddr(SubLObject list) {
    return list.rest().rest();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _tree_equal_2(SubLObject tree1, SubLObject tree2) {
    if ((tree1.isAtom()
         && tree2.isAtom())) {
      return Equality.eql(tree1, tree2);
    } else if ((tree1.isCons()
         && tree2.isCons())) {
      {
        SubLObject rest_tree1 = NIL;
        SubLObject rest_tree2 = NIL;
        for (rest_tree1 = tree1, rest_tree2 = tree2; (!((rest_tree1.isAtom()
              || rest_tree2.isAtom()
              || (NIL == _tree_equal_2(rest_tree1.first(), rest_tree2.first()))))); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
        }
        return makeBoolean((rest_tree1.isAtom()
               && rest_tree2.isAtom()
               && (NIL != _tree_equal_2(rest_tree1, rest_tree2))));
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _tree_equal_3(SubLObject tree1, SubLObject tree2, SubLObject test) {
    if ((tree1.isAtom()
         && tree2.isAtom())) {
      return Functions.funcall(test, tree1, tree2);
    } else if ((tree1.isCons()
         && tree2.isCons())) {
      {
        SubLObject rest_tree1 = NIL;
        SubLObject rest_tree2 = NIL;
        for (rest_tree1 = tree1, rest_tree2 = tree2; (!((rest_tree1.isAtom()
              || rest_tree2.isAtom()
              || (NIL == _tree_equal_3(rest_tree1.first(), rest_tree2.first(), test))))); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
        }
        return makeBoolean((rest_tree1.isAtom()
               && rest_tree2.isAtom()
               && (NIL != _tree_equal_3(rest_tree1, rest_tree2, test))));
      }
    } else {
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject tree_equal(SubLObject tree1, SubLObject tree2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(EQL) != test)) {
      return _tree_equal_3(tree1, tree2, test);
    } else {
      return _tree_equal_2(tree1, tree2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject endp(SubLObject object) {
    checkType(object, $sym0$LISTP);
    return Types.sublisp_null(object);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject list_length(SubLObject list) {
    checkType(list, $sym0$LISTP);
    if ((NIL == list)) {
      return ZERO_INTEGER;
    } else if ((NIL == list.rest())) {
      return ONE_INTEGER;
    }
    {
      SubLObject slow = NIL;
      SubLObject fast = NIL;
      SubLObject length = NIL;
      for (slow = list.rest(), fast = cddr(list), length = TWO_INTEGER; (fast != slow); slow = slow.rest(), fast = cddr(fast), length = Numbers.add(TWO_INTEGER, length)) {
        if ((NIL == fast)) {
          return length;
        } else if ((NIL == fast.rest())) {
          return Numbers.add(ONE_INTEGER, length);
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject first(SubLObject list) {
    return list.first();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject second(SubLObject list) {
    return cadr(list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject third(SubLObject list) {
    return ConsesLow.nth(TWO_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject fourth(SubLObject list) {
    return ConsesLow.nth(THREE_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject fifth(SubLObject list) {
    return ConsesLow.nth(FOUR_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject sixth(SubLObject list) {
    return ConsesLow.nth(FIVE_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject seventh(SubLObject list) {
    return ConsesLow.nth(SIX_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject eighth(SubLObject list) {
    return ConsesLow.nth(SEVEN_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject ninth(SubLObject list) {
    return ConsesLow.nth(EIGHT_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject tenth(SubLObject list) {
    return ConsesLow.nth(NINE_INTEGER, list);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject rest(SubLObject list) {
    return list.rest();
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nthcdr(SubLObject n, SubLObject list) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(n, $sym2$FIXNUMP);
      checkType(list, $sym0$LISTP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if (n.isNegative()) {
          Errors.error($str3$_S_must_be_a_non_negative_integer, n);
        }
      }
      {
        SubLObject i = NIL;
        for (i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
          list = list.rest();
        }
      }
      return list;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject copy_list(SubLObject list) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == list)) {
        return NIL;
      }
      {
        SubLObject length = _cons_length(list);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(length.isInteger()))) {
            Errors.error($str4$COPY_LIST_called_on_a_circular_li);
          }
        }
        {
          SubLObject new_list = ConsesLow.make_list(length, NIL);
          SubLObject new_rest = NIL;
          SubLObject old_rest = NIL;
          SubLObject old_item = NIL;
          for (new_rest = new_list, old_rest = list, old_item = old_rest.first(); old_rest.rest().isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest.first()) {
            ConsesLow.rplaca(new_rest, old_item);
          }
          ConsesLow.rplaca(new_rest, old_item);
          if ((NIL != old_rest.rest())) {
            ConsesLow.rplacd(new_rest, old_rest.rest());
          }
          return new_list;
        }
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject copy_alist(SubLObject list) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == list)) {
        return list;
      }
      {
        SubLObject length = _cons_length(list);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(length.isInteger()))) {
            Errors.error($str5$COPY_ALIST_called_on_a_circular_l);
          }
        }
        {
          SubLObject new_list = ConsesLow.make_list(length, NIL);
          SubLObject new_rest = NIL;
          SubLObject old_rest = NIL;
          SubLObject old_item = NIL;
          for (new_rest = new_list, old_rest = list, old_item = old_rest.first(); old_rest.rest().isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest.first()) {
            if (old_item.isCons()) {
              ConsesLow.rplaca(new_rest, copy_list(old_item));
            } else {
              ConsesLow.rplaca(new_rest, old_item);
            }
          }
          if (old_item.isCons()) {
            ConsesLow.rplaca(new_rest, copy_list(old_item));
          } else {
            ConsesLow.rplaca(new_rest, old_item);
          }
          if ((NIL != old_rest.rest())) {
            ConsesLow.rplacd(new_rest, old_rest.rest());
          }
          return new_list;
        }
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject copy_tree(SubLObject object) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (object.isAtom()) {
        return object;
      } else {
        {
          SubLObject length = _cons_length(object);
          if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
            if ((!(length.isInteger()))) {
              Errors.error($str6$COPY_TREE_called_on_a_circular_li);
            }
          }
          {
            SubLObject new_list = ConsesLow.make_list(length, NIL);
            SubLObject new_rest = NIL;
            SubLObject old_rest = NIL;
            SubLObject old_item = NIL;
            for (new_rest = new_list, old_rest = object, old_item = old_rest.first(); old_rest.rest().isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest.first()) {
              ConsesLow.rplaca(new_rest, copy_tree(old_item));
            }
            ConsesLow.rplaca(new_rest, copy_tree(old_item));
            if ((NIL != old_rest.rest())) {
              ConsesLow.rplacd(new_rest, copy_tree(old_rest.rest()));
            }
            return new_list;
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject revappend(SubLObject list1, SubLObject list2) {
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    if ((NIL == list2)) {
      return Sequences.reverse(list1);
    } else if ((NIL == list1)) {
      return list2;
    }
    {
      SubLObject answer = list2;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        answer = cons(item, answer);
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nreconc(SubLObject list1, SubLObject list2) {
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    if ((NIL == list2)) {
      return Sequences.nreverse(list1);
    } else if ((NIL == list1)) {
      return list2;
    }
    {
      SubLObject next = list1.rest();
      SubLObject temp = NIL;
      list1 = ConsesLow.rplacd(list1, list2);
      for (; next.isCons(); ) {
        temp = next.rest();
        list1 = ConsesLow.rplacd(next, list1);
        next = temp;
      }
      return list1;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject ldiff(SubLObject list, SubLObject sublist) {
    checkType(list, $sym0$LISTP);
    if ((NIL == list)) {
      return NIL;
    } else if ((list == sublist)) {
      return NIL;
    }
    {
      SubLObject answer = cons(list.first(), NIL);
      SubLObject builder = answer;
      SubLObject temp = NIL;
      list = list.rest();
      for (; (!(((list == sublist)
            || (!(list.isCons()))))); ) {
        temp = cons(list.first(), NIL);
        builder = ConsesLow.rplacd(builder, temp);
        builder = builder.rest();
        list = list.rest();
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
    if (old.eql(tree)) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _subst_3(v_new, old, tree_car);
        SubLObject new_cdr = _subst_3(v_new, old, tree_cdr);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
    if ((NIL != Functions.funcall(test, old, tree))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _subst_4(v_new, old, tree_car, test);
        SubLObject new_cdr = _subst_4(v_new, old, tree_cdr, test);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
    if ((NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _subst_5(v_new, old, tree_car, test, key);
        SubLObject new_cdr = _subst_5(v_new, old, tree_cdr, test, key);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject subst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _subst_5(v_new, old, tree, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _subst_4(v_new, old, tree, test);
    } else {
      return _subst_3(v_new, old, tree);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
    if ((NIL != Functions.funcall(test, tree))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _subst_if_3(v_new, test, tree_car);
        SubLObject new_cdr = _subst_if_3(v_new, test, tree_cdr);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
    if ((NIL != Functions.funcall(test, Functions.funcall(key, tree)))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _subst_if_4(v_new, test, tree_car, key);
        SubLObject new_cdr = _subst_if_4(v_new, test, tree_cdr, key);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject subst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _subst_if_4(v_new, test, tree, key);
    } else {
      return _subst_if_3(v_new, test, tree);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsubst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
    if (old.eql(tree)) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _nsubst_3(v_new, old, tree_car);
        SubLObject new_cdr = _nsubst_3(v_new, old, tree_cdr);
        return _ncons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsubst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
    if ((NIL != Functions.funcall(test, old, tree))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _nsubst_4(v_new, old, tree_car, test);
        SubLObject new_cdr = _nsubst_4(v_new, old, tree_cdr, test);
        return _ncons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsubst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
    if ((NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _nsubst_5(v_new, old, tree_car, test, key);
        SubLObject new_cdr = _nsubst_5(v_new, old, tree_cdr, test, key);
        return _ncons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nsubst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nsubst_5(v_new, old, tree, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _nsubst_4(v_new, old, tree, test);
    } else {
      return _nsubst_3(v_new, old, tree);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsubst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
    if ((NIL != Functions.funcall(test, tree))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _nsubst_if_3(v_new, test, tree_car);
        SubLObject new_cdr = _nsubst_if_3(v_new, test, tree_cdr);
        return _ncons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsubst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
    if ((NIL != Functions.funcall(test, Functions.funcall(key, tree)))) {
      return v_new;
    } else if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _nsubst_if_4(v_new, test, tree_car, key);
        SubLObject new_cdr = _nsubst_if_4(v_new, test, tree_cdr, key);
        return _ncons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nsubst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nsubst_if_4(v_new, test, tree, key);
    } else {
      return _nsubst_if_3(v_new, test, tree);
    }
  }

  /** Above this length, sublis will call copy-list and then
use an iterative algorithm.  This may be consier but it will be
iterative instead of recursive, to avoid a stack overflow.
@see bug 18429 */
  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static SubLSymbol $sublis_watermark$ = null;

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _sublis_2(SubLObject alist, SubLObject tree) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if (entry.first().eql(tree)) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else if ((tree.isCons()
         && _cons_length(tree).numG($sublis_watermark$.getGlobalValue()))) {
      {
        SubLObject new_tree = copy_list(tree);
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _sublis_2(alist, tree_car));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _sublis_2(alist, tree_cdr));
            return new_tree;
          }
        }
        return new_tree;
      }
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _sublis_2(alist, tree_car);
        SubLObject new_cdr = _sublis_2(alist, tree_cdr);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _sublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, entry.first(), tree))) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else if ((tree.isCons()
         && _cons_length(tree).numG($sublis_watermark$.getGlobalValue()))) {
      {
        SubLObject new_tree = copy_list(tree);
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _sublis_3(alist, tree_car, test));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _sublis_3(alist, tree_cdr, test));
            return new_tree;
          }
        }
        return new_tree;
      }
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _sublis_3(alist, tree_car, test);
        SubLObject new_cdr = _sublis_3(alist, tree_cdr, test);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _sublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    {
      SubLObject tree_key = Functions.funcall(key, tree);
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, entry.first(), tree_key))) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else if ((tree.isCons()
         && _cons_length(tree).numG($sublis_watermark$.getGlobalValue()))) {
      {
        SubLObject new_tree = copy_list(tree);
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _sublis_4(alist, tree_car, test, key));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _sublis_4(alist, tree_cdr, test, key));
            return new_tree;
          }
        }
        return new_tree;
      }
    } else {
      {
        SubLObject tree_car = tree.first();
        SubLObject tree_cdr = tree.rest();
        SubLObject new_car = _sublis_4(alist, tree_car, test, key);
        SubLObject new_cdr = _sublis_4(alist, tree_cdr, test, key);
        return _recons(new_car, new_cdr, tree);
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject sublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _sublis_4(alist, tree, test, key);
    } else if ((NIL == alist)) {
      return tree;
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _sublis_3(alist, tree, test);
    } else {
      return _sublis_2(alist, tree);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsublis_2(SubLObject alist, SubLObject tree) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if (entry.first().eql(tree)) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _nsublis_2(alist, tree_car));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _nsublis_2(alist, tree_cdr));
            return tree;
          }
        }
        return tree;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
    {
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, entry.first(), tree))) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _nsublis_3(alist, tree_car, test));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _nsublis_3(alist, tree_cdr, test));
            return tree;
          }
        }
        return tree;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nsublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    {
      SubLObject tree_key = Functions.funcall(key, tree);
      SubLObject cdolist_list_var = alist;
      SubLObject entry = NIL;
      for (entry = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), entry = cdolist_list_var.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, entry.first(), tree_key))) {
            return entry.rest();
          }
        }
      }
    }
    if (tree.isAtom()) {
      return tree;
    } else {
      {
        SubLObject tree_cons = NIL;
        SubLObject tree_car = NIL;
        SubLObject tree_cdr = NIL;
        for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons.rest(); (NIL != tree_cons); tree_cons = tree_cons.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
          ConsesLow.rplaca(tree_cons, _nsublis_4(alist, tree_car, test, key));
          if ((!(tree_cdr.isList()))) {
            ConsesLow.rplacd(tree_cons, _nsublis_4(alist, tree_cdr, test, key));
            return tree;
          }
        }
        return tree;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nsublis_4(alist, tree, test, key);
    } else if ((NIL == alist)) {
      return tree;
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _nsublis_3(alist, tree, test);
    } else {
      return _nsublis_2(alist, tree);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _member_2(SubLObject item, SubLObject list) {
    {
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        if (item.eql(rest.first())) {
          return rest;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _member_3(SubLObject item, SubLObject list, SubLObject test) {
    {
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        if ((NIL != Functions.funcall(test, item, rest.first()))) {
          return rest;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _member_4(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
    {
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        if ((NIL != Functions.funcall(test, item, Functions.funcall(key, rest.first())))) {
          return rest;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject member(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _member_4(item, list, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _member_3(item, list, test);
    } else {
      return _member_2(item, list);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _member_if_2(SubLObject test, SubLObject list) {
    {
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        if ((NIL != Functions.funcall(test, rest.first()))) {
          return rest;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _member_if_3(SubLObject test, SubLObject list, SubLObject key) {
    {
      SubLObject rest = NIL;
      for (rest = list; (NIL != rest); rest = rest.rest()) {
        if ((NIL != Functions.funcall(test, Functions.funcall(key, rest.first())))) {
          return rest;
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject member_if(SubLObject test, SubLObject list, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _member_if_3(test, list, key);
    } else {
      return _member_if_2(test, list);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject tailp(SubLObject sublist, SubLObject list) {
    checkType(list, $sym0$LISTP);
    {
      SubLObject rest = NIL;
      for (rest = list; (!(rest.isAtom())); rest = rest.rest()) {
        if (sublist.eql(rest)) {
          return T;
        }
      }
      return Equality.eql(sublist, rest);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject adjoin(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list)) {
      return cons(item, NIL);
    }
    if ((key != Symbols.symbol_function(IDENTITY))) {
      return ((NIL != _member_4(Functions.funcall(key, item), list, test, key)) ? ((SubLObject) list) : cons(item, list));
    } else if ((test != Symbols.symbol_function(EQL))) {
      return ((NIL != _member_3(item, list, test)) ? ((SubLObject) list) : cons(item, list));
    } else {
      return ((NIL != _member_2(item, list)) ? ((SubLObject) list) : cons(item, list));
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _union_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject answer = list1;
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_2(item, answer))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _union_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject answer = list1;
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_3(item, answer, test))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _union_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject answer = list1;
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_4(Functions.funcall(key, item), answer, test, key))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject union(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return list2;
    } else if ((NIL == list2)) {
      return list1;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _union_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _union_3(list1, list2, test);
    } else {
      return _union_2(list1, list2);
    }
  }

  public static final class $union$BinaryFunction extends BinaryFunction {
    public $union$BinaryFunction() { super(extractFunctionNamed("UNION")); }
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return union(arg1, arg2, UNPROVIDED, UNPROVIDED); }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nunion_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject runner = last(list1, UNPROVIDED);
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_2(item, list1))) {
          runner = ConsesLow.rplacd(runner, cons(item, NIL));
          runner = runner.rest();
        }
      }
    }
    return list1;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nunion_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject runner = last(list1, UNPROVIDED);
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_3(item, list1, test))) {
          runner = ConsesLow.rplacd(runner, cons(item, NIL));
          runner = runner.rest();
        }
      }
    }
    return list1;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nunion_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject runner = last(list1, UNPROVIDED);
      SubLObject cdolist_list_var = list2;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_4(Functions.funcall(key, item), list1, test, key))) {
          runner = ConsesLow.rplacd(runner, cons(item, NIL));
          runner = runner.rest();
        }
      }
    }
    return list1;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nunion(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return list2;
    } else if ((NIL == list2)) {
      return list1;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nunion_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _nunion_3(list1, list2, test);
    } else {
      return _nunion_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _intersection_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL != _member_2(item, list2))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _intersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL != _member_3(item, list2, test))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _intersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL != _member_4(Functions.funcall(key, item), list2, test, key))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject intersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return NIL;
    } else if ((NIL == list2)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _intersection_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _intersection_3(list1, list2, test);
    } else {
      return _intersection_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nintersection_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL != _member_2(item, list2))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = answer.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL != _member_2(item, list2))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nintersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL != _member_3(item, list2, test))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = answer.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL != _member_3(item, list2, test))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nintersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL != _member_4(Functions.funcall(key, item), list2, test, key))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = back.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL != _member_4(Functions.funcall(key, item), list2, test, key))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nintersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return NIL;
    } else if ((NIL == list2)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nintersection_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _nintersection_3(list1, list2, test);
    } else {
      return _nintersection_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _set_difference_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_2(item, list2))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _set_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_3(item, list2, test))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _set_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_4(Functions.funcall(key, item), list2, test, key))) {
          answer = cons(item, answer);
        }
      }
      return answer;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject set_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return NIL;
    } else if ((NIL == list2)) {
      return list1;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _set_difference_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _set_difference_3(list1, list2, test);
    } else {
      return _set_difference_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nset_difference_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL == _member_2(item, list2))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = back.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL == _member_2(item, list2))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nset_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL == _member_3(item, list2, test))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = back.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL == _member_3(item, list2, test))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _nset_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject answer = NIL;
      {
        SubLObject rest = NIL;
        SubLObject item = NIL;
        for (rest = list1, item = rest.first(); (!(((NIL != answer)
              || (NIL == rest)))); rest = rest.rest(), item = rest.first()) {
          if ((NIL == _member_4(Functions.funcall(key, item), list2, test, key))) {
            answer = rest;
          }
        }
        if ((NIL == answer)) {
          return NIL;
        }
      }
      {
        SubLObject back = answer;
        SubLObject next = NIL;
        SubLObject item = NIL;
        for (next = back.rest(), item = next.first(); (NIL != next); next = next.rest(), item = next.first()) {
          if ((NIL == _member_4(Functions.funcall(key, item), list2, test, key))) {
            back = next;
          } else {
            ConsesLow.rplacd(back, next.rest());
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nset_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return NIL;
    } else if ((NIL == list2)) {
      return list1;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _nset_difference_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _nset_difference_3(list1, list2, test);
    } else {
      return _nset_difference_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject set_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return ConsesLow.append(set_difference(list1, list2, test, key), set_difference(list2, list1, test, key));
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject nset_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return ConsesLow.nconc(set_difference(list1, list2, test, key), set_difference(list2, list1, test, key));
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subsetp_2(SubLObject list1, SubLObject list2) {
    {
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_2(item, list2))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subsetp_3(SubLObject list1, SubLObject list2, SubLObject test) {
    {
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_3(item, list2, test))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _subsetp_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    {
      SubLObject cdolist_list_var = list1;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL == _member_4(Functions.funcall(key, item), list2, test, key))) {
          return NIL;
        }
      }
    }
    return T;
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject subsetp(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list1, $sym0$LISTP);
    checkType(list2, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == list1)) {
      return T;
    } else if ((NIL == list2)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _subsetp_4(list1, list2, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _subsetp_3(list1, list2, test);
    } else {
      return _subsetp_2(list1, list2);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject acons(SubLObject key, SubLObject datum, SubLObject alist) {
    return cons(cons(key, datum), alist);
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject pairlis(SubLObject keys, SubLObject data, SubLObject alist) {
    if ((alist == UNPROVIDED)) {
      alist = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(keys, $sym0$LISTP);
      checkType(data, $sym0$LISTP);
      {
        SubLObject rest_keys = NIL;
        SubLObject rest_data = NIL;
        for (rest_keys = keys, rest_data = data; (!(((NIL == rest_keys)
              || (NIL == rest_data)))); rest_keys = rest_keys.rest(), rest_data = rest_data.rest()) {
          alist = acons(rest_keys.first(), rest_data.first(), alist);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
          if ((!(((NIL == rest_keys)
                 && (NIL == rest_data))))) {
            Errors.error($str8$PAIRLIS_was_called_with_lists_of_);
          }
        }
        return alist;
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _assoc_2(SubLObject item, SubLObject alist) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if (item.eql(entry.first())) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _assoc_3(SubLObject item, SubLObject alist, SubLObject test) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, item, entry.first()))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _assoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, item, Functions.funcall(key, entry.first())))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject assoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(alist, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == alist)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _assoc_4(item, alist, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _assoc_3(item, alist, test);
    } else {
      return _assoc_2(item, alist);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject assoc_if(SubLObject predicate, SubLObject alist) {
    checkType(predicate, $sym1$FUNCTION_SPEC_P);
    checkType(alist, $sym0$LISTP);
    if ((NIL == alist)) {
      return NIL;
    }
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(predicate, entry.first()))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _rassoc_2(SubLObject item, SubLObject alist) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if (item.eql(entry.rest())) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _rassoc_3(SubLObject item, SubLObject alist, SubLObject test) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, item, entry.rest()))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject _rassoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(test, item, Functions.funcall(key, entry.rest())))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject rassoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(alist, $sym0$LISTP);
    checkType(test, $sym1$FUNCTION_SPEC_P);
    checkType(key, $sym1$FUNCTION_SPEC_P);
    if ((NIL == alist)) {
      return NIL;
    }
    if ((Symbols.symbol_function(IDENTITY) != key)) {
      return _rassoc_4(item, alist, test, key);
    } else if ((Symbols.symbol_function(EQL) != test)) {
      return _rassoc_3(item, alist, test);
    } else {
      return _rassoc_2(item, alist);
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 1938) 
  public static final SubLObject rassoc_if(SubLObject predicate, SubLObject alist) {
    checkType(predicate, $sym1$FUNCTION_SPEC_P);
    checkType(alist, $sym0$LISTP);
    if ((NIL == alist)) {
      return NIL;
    }
    {
      SubLObject rest = NIL;
      SubLObject entry = NIL;
      for (rest = alist, entry = rest.first(); (NIL != rest); rest = rest.rest(), entry = rest.first()) {
        if ((NIL != entry)) {
          if ((NIL != Functions.funcall(predicate, entry.rest()))) {
            return entry;
          }
        }
      }
      return NIL;
    }
  }

  /** Return the value for INDICATOR in PLIST, or DEFAULT if not present */
  @SubL(source = "sublisp/conses-high.lisp", position = 69351) 
  public static final SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject next = NIL;
      SubLObject key = NIL;
      for (next = plist, key = next.first(); (NIL != next); next = cddr(next), key = next.first()) {
        if ((indicator == key)) {
          return cadr(next);
        }
      }
      return v_default;
    }
  }

  /** Return a plist which has VALUE stored for INDICATOR in PLIST */
  @SubL(source = "sublisp/conses-high.lisp", position = 69735) 
  public static final SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value) {
    {
      SubLObject back = NIL;
      SubLObject next = NIL;
      SubLObject key = NIL;
      for (back = NIL, next = plist, key = next.first(); (NIL != next); back = next.rest(), next = cddr(next), key = next.first()) {
        if ((indicator == key)) {
          ConsesLow.rplaca(next.rest(), value);
          return plist;
        }
      }
      if ((NIL != back)) {
        ConsesLow.rplacd(back, list(indicator, value));
        return plist;
      } else {
        return listS(indicator, value, plist);
      }
    }
  }

  /** Return a plist which has no value stored for INDICATOR in PLIST */
  @SubL(source = "sublisp/conses-high.lisp", position = 70203) 
  public static final SubLObject remf(SubLObject plist, SubLObject indicator) {
    {
      SubLObject back = NIL;
      SubLObject next = NIL;
      SubLObject key = NIL;
      for (back = NIL, next = plist, key = next.first(); (NIL != next); back = next.rest(), next = cddr(next), key = next.first()) {
        if ((indicator == key)) {
          if ((NIL != back)) {
            ConsesLow.rplacd(back, cddr(next));
            return plist;
          } else {
            return cddr(next);
          }
        }
      }
      return plist;
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 70619) 
  public static final SubLObject last(SubLObject list, SubLObject n) {
    if ((n == UNPROVIDED)) {
      n = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(list, $sym0$LISTP);
      checkType(n, $sym2$FIXNUMP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if (n.isNegative()) {
          Errors.error($str9$LAST_called_with_negative_index_o, n);
        }
      }
      if ((NIL == list)) {
        return NIL;
      } else {
        {
          SubLObject seeker_start = list;
          SubLObject circular_seeker = NIL;
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
            if ((!(seeker_start.isCons()))) {
              return list;
            }
            seeker_start = seeker_start.rest();
          }
          circular_seeker = seeker_start;
          {
            SubLObject seeker = NIL;
            SubLObject back = NIL;
            for (seeker = seeker_start, back = list; seeker.isCons(); seeker = seeker.rest(), back = back.rest()) {
              if (circular_seeker.isCons()) {
                circular_seeker = circular_seeker.rest();
                if (circular_seeker.isCons()) {
                  circular_seeker = circular_seeker.rest();
                  if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                    if ((circular_seeker == back)) {
                      Errors.error($str10$LAST_called_on_circular_list);
                    }
                  }
                }
              }
            }
            return back;
          }
        }
      }
    }
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 72730) 
  public static final SubLObject butlast(SubLObject list, SubLObject n) {
    if ((n == UNPROVIDED)) {
      n = ONE_INTEGER;
    }
    return ldiff(list, last(list, n));
  }

  @SubL(source = "sublisp/conses-high.lisp", position = 72806) 
  public static final SubLObject nbutlast(SubLObject list, SubLObject n) {
    if ((n == UNPROVIDED)) {
      n = ONE_INTEGER;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(list, $sym0$LISTP);
      checkType(n, $sym2$FIXNUMP);
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if (n.isNegative()) {
          Errors.error($str11$NBUTLAST_called_with_negative_ind, n);
        }
      }
      if ((NIL == list)) {
        return NIL;
      } else {
        {
          SubLObject seeker_start = list;
          SubLObject circular_seeker = NIL;
          SubLObject i = NIL;
          for (i = ZERO_INTEGER; i.numL(n); i = Numbers.add(i, ONE_INTEGER)) {
            if ((!(seeker_start.isCons()))) {
              return NIL;
            }
            seeker_start = seeker_start.rest();
          }
          if ((!(seeker_start.isCons()))) {
            return NIL;
          } else {
            seeker_start = seeker_start.rest();
            circular_seeker = seeker_start;
            {
              SubLObject seeker = NIL;
              SubLObject back = NIL;
              for (seeker = seeker_start, back = list; seeker.isCons(); seeker = seeker.rest(), back = back.rest()) {
                if (circular_seeker.isCons()) {
                  circular_seeker = circular_seeker.rest();
                  if (circular_seeker.isCons()) {
                    circular_seeker = circular_seeker.rest();
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
                      if ((circular_seeker == back)) {
                        Errors.error($str12$NBUTLAST_called_on_circular_list);
                      }
                    }
                  }
                }
              }
              ConsesLow.rplacd(back, NIL);
              return list;
            }
          }
        }
      }
    }
  }

  public static final SubLObject declare_conses_high_file() {
    declareFunction("_recons", "_RECONS", 3, 0, false);
    declareFunction("_ncons", "_NCONS", 3, 0, false);
    declareFunction("_cons_length", "_CONS-LENGTH", 1, 0, false);
    declareFunction("caar", "CAAR", 1, 0, false);
    declareFunction("cadr", "CADR", 1, 0, false);
    declareFunction("cdar", "CDAR", 1, 0, false);
    declareFunction("cddr", "CDDR", 1, 0, false);
    declareFunction("_tree_equal_2", "_TREE-EQUAL-2", 2, 0, false);
    declareFunction("_tree_equal_3", "_TREE-EQUAL-3", 3, 0, false);
    declareFunction("tree_equal", "TREE-EQUAL", 2, 1, false);
    declareFunction("endp", "ENDP", 1, 0, false);
    declareFunction("list_length", "LIST-LENGTH", 1, 0, false);
    declareFunction("first", "FIRST", 1, 0, false);
    declareFunction("second", "SECOND", 1, 0, false);
    declareFunction("third", "THIRD", 1, 0, false);
    declareFunction("fourth", "FOURTH", 1, 0, false);
    declareFunction("fifth", "FIFTH", 1, 0, false);
    declareFunction("sixth", "SIXTH", 1, 0, false);
    declareFunction("seventh", "SEVENTH", 1, 0, false);
    declareFunction("eighth", "EIGHTH", 1, 0, false);
    declareFunction("ninth", "NINTH", 1, 0, false);
    declareFunction("tenth", "TENTH", 1, 0, false);
    declareFunction("rest", "REST", 1, 0, false);
    declareFunction("nthcdr", "NTHCDR", 2, 0, false);
    declareFunction("copy_list", "COPY-LIST", 1, 0, false);
    declareFunction("copy_alist", "COPY-ALIST", 1, 0, false);
    declareFunction("copy_tree", "COPY-TREE", 1, 0, false);
    declareFunction("revappend", "REVAPPEND", 2, 0, false);
    declareFunction("nreconc", "NRECONC", 2, 0, false);
    declareFunction("ldiff", "LDIFF", 2, 0, false);
    declareFunction("_subst_3", "_SUBST-3", 3, 0, false);
    declareFunction("_subst_4", "_SUBST-4", 4, 0, false);
    declareFunction("_subst_5", "_SUBST-5", 5, 0, false);
    declareFunction("subst", "SUBST", 3, 2, false);
    declareFunction("_subst_if_3", "_SUBST-IF-3", 3, 0, false);
    declareFunction("_subst_if_4", "_SUBST-IF-4", 4, 0, false);
    declareFunction("subst_if", "SUBST-IF", 3, 1, false);
    declareFunction("_nsubst_3", "_NSUBST-3", 3, 0, false);
    declareFunction("_nsubst_4", "_NSUBST-4", 4, 0, false);
    declareFunction("_nsubst_5", "_NSUBST-5", 5, 0, false);
    declareFunction("nsubst", "NSUBST", 3, 2, false);
    declareFunction("_nsubst_if_3", "_NSUBST-IF-3", 3, 0, false);
    declareFunction("_nsubst_if_4", "_NSUBST-IF-4", 4, 0, false);
    declareFunction("nsubst_if", "NSUBST-IF", 3, 1, false);
    declareFunction("_sublis_2", "_SUBLIS-2", 2, 0, false);
    declareFunction("_sublis_3", "_SUBLIS-3", 3, 0, false);
    declareFunction("_sublis_4", "_SUBLIS-4", 4, 0, false);
    declareFunction("sublis", "SUBLIS", 2, 2, false);
    declareFunction("_nsublis_2", "_NSUBLIS-2", 2, 0, false);
    declareFunction("_nsublis_3", "_NSUBLIS-3", 3, 0, false);
    declareFunction("_nsublis_4", "_NSUBLIS-4", 4, 0, false);
    declareFunction("nsublis", "NSUBLIS", 2, 2, false);
    declareFunction("_member_2", "_MEMBER-2", 2, 0, false);
    declareFunction("_member_3", "_MEMBER-3", 3, 0, false);
    declareFunction("_member_4", "_MEMBER-4", 4, 0, false);
    declareFunction("member", "MEMBER", 2, 2, false);
    declareFunction("_member_if_2", "_MEMBER-IF-2", 2, 0, false);
    declareFunction("_member_if_3", "_MEMBER-IF-3", 3, 0, false);
    declareFunction("member_if", "MEMBER-IF", 2, 1, false);
    declareFunction("tailp", "TAILP", 2, 0, false);
    declareFunction("adjoin", "ADJOIN", 2, 2, false);
    declareFunction("_union_2", "_UNION-2", 2, 0, false);
    declareFunction("_union_3", "_UNION-3", 3, 0, false);
    declareFunction("_union_4", "_UNION-4", 4, 0, false);
    declareFunction("union", "UNION", 2, 2, false); new $union$BinaryFunction();
    declareFunction("_nunion_2", "_NUNION-2", 2, 0, false);
    declareFunction("_nunion_3", "_NUNION-3", 3, 0, false);
    declareFunction("_nunion_4", "_NUNION-4", 4, 0, false);
    declareFunction("nunion", "NUNION", 2, 2, false);
    declareFunction("_intersection_2", "_INTERSECTION-2", 2, 0, false);
    declareFunction("_intersection_3", "_INTERSECTION-3", 3, 0, false);
    declareFunction("_intersection_4", "_INTERSECTION-4", 4, 0, false);
    declareFunction("intersection", "INTERSECTION", 2, 2, false);
    declareFunction("_nintersection_2", "_NINTERSECTION-2", 2, 0, false);
    declareFunction("_nintersection_3", "_NINTERSECTION-3", 3, 0, false);
    declareFunction("_nintersection_4", "_NINTERSECTION-4", 4, 0, false);
    declareFunction("nintersection", "NINTERSECTION", 2, 2, false);
    declareFunction("_set_difference_2", "_SET-DIFFERENCE-2", 2, 0, false);
    declareFunction("_set_difference_3", "_SET-DIFFERENCE-3", 3, 0, false);
    declareFunction("_set_difference_4", "_SET-DIFFERENCE-4", 4, 0, false);
    declareFunction("set_difference", "SET-DIFFERENCE", 2, 2, false);
    declareFunction("_nset_difference_2", "_NSET-DIFFERENCE-2", 2, 0, false);
    declareFunction("_nset_difference_3", "_NSET-DIFFERENCE-3", 3, 0, false);
    declareFunction("_nset_difference_4", "_NSET-DIFFERENCE-4", 4, 0, false);
    declareFunction("nset_difference", "NSET-DIFFERENCE", 2, 2, false);
    declareFunction("set_exclusive_or", "SET-EXCLUSIVE-OR", 2, 2, false);
    declareFunction("nset_exclusive_or", "NSET-EXCLUSIVE-OR", 2, 2, false);
    declareFunction("_subsetp_2", "_SUBSETP-2", 2, 0, false);
    declareFunction("_subsetp_3", "_SUBSETP-3", 3, 0, false);
    declareFunction("_subsetp_4", "_SUBSETP-4", 4, 0, false);
    declareFunction("subsetp", "SUBSETP", 2, 2, false);
    declareFunction("acons", "ACONS", 3, 0, false);
    declareFunction("pairlis", "PAIRLIS", 2, 1, false);
    declareFunction("_assoc_2", "_ASSOC-2", 2, 0, false);
    declareFunction("_assoc_3", "_ASSOC-3", 3, 0, false);
    declareFunction("_assoc_4", "_ASSOC-4", 4, 0, false);
    declareFunction("assoc", "ASSOC", 2, 2, false);
    declareFunction("assoc_if", "ASSOC-IF", 2, 0, false);
    declareFunction("_rassoc_2", "_RASSOC-2", 2, 0, false);
    declareFunction("_rassoc_3", "_RASSOC-3", 3, 0, false);
    declareFunction("_rassoc_4", "_RASSOC-4", 4, 0, false);
    declareFunction("rassoc", "RASSOC", 2, 2, false);
    declareFunction("rassoc_if", "RASSOC-IF", 2, 0, false);
    declareFunction("getf", "GETF", 2, 1, false);
    declareFunction("putf", "PUTF", 3, 0, false);
    declareFunction("remf", "REMF", 2, 0, false);
    declareFunction("last", "LAST", 1, 1, false);
    declareFunction("butlast", "BUTLAST", 1, 1, false);
    declareFunction("nbutlast", "NBUTLAST", 1, 1, false);
    return NIL;
  }

  public static final SubLObject init_conses_high_file() {
    $sublis_watermark$ = deflexical("*SUBLIS-WATERMARK*", $int7$68);
    return NIL;
  }

  public static final SubLObject setup_conses_high_file() {
        return NIL;
  }

  //// Internal Constants

  public static final SubLSymbol $sym0$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $sym1$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym2$FIXNUMP = makeSymbol("FIXNUMP");
  public static final SubLString $str3$_S_must_be_a_non_negative_integer = makeString("~S must be a non-negative integer");
  public static final SubLString $str4$COPY_LIST_called_on_a_circular_li = makeString("COPY-LIST called on a circular list");
  public static final SubLString $str5$COPY_ALIST_called_on_a_circular_l = makeString("COPY-ALIST called on a circular list");
  public static final SubLString $str6$COPY_TREE_called_on_a_circular_li = makeString("COPY-TREE called on a circular list");
  public static final SubLInteger $int7$68 = makeInteger(68);
  public static final SubLString $str8$PAIRLIS_was_called_with_lists_of_ = makeString("PAIRLIS was called with lists of different lengths");
  public static final SubLString $str9$LAST_called_with_negative_index_o = makeString("LAST called with negative index of ~S");
  public static final SubLString $str10$LAST_called_on_circular_list = makeString("LAST called on circular list");
  public static final SubLString $str11$NBUTLAST_called_with_negative_ind = makeString("NBUTLAST called with negative index of ~S");
  public static final SubLString $str12$NBUTLAST_called_on_circular_list = makeString("NBUTLAST called on circular list");

  //// Initializers

  public void declareFunctions() {
    declare_conses_high_file();
  }

  public void initializeVariables() {
    init_conses_high_file();
  }

  public void runTopLevelForms() {
    setup_conses_high_file();
  }

}
