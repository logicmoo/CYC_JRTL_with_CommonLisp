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
//dm import com.cyc.cycjava_1.cycl.constant_handles;
//dm import com.cyc.cycjava_1.cycl.cycl_variables;
//dm import com.cyc.cycjava_1.cycl.dictionary;
//dm import com.cyc.cycjava_1.cycl.dictionary_utilities;
// //dm import com.cyc.cycjava_1.cycl.cyc_testing.generic_testing;
//dm import com.cyc.cycjava_1.cycl.hash_table_utilities;
//dm import com.cyc.cycjava_1.cycl.memoization_state;
//dm import com.cyc.cycjava_1.cycl.meta_macros;
//dm import com.cyc.cycjava_1.cycl.number_utilities;
//dm import com.cyc.cycjava_1.cycl.set;
//dm import com.cyc.cycjava_1.cycl.set_utilities;
//dm import com.cyc.cycjava_1.cycl.string_utilities;
//dm import com.cyc.cycjava_1.cycl.subl_macro_promotions;
//dm import com.cyc.cycjava_1.cycl.subl_macros;
//dm import com.cyc.cycjava_1.cycl.subl_promotions;
//dm import com.cyc.cycjava_1.cycl.utilities_macros;
//dm import com.cyc.cycjava_1.cycl.vector_utilities;

public  final class list_utilities extends SubLTranslatedFile {

  //// Constructor

  private list_utilities() {}
  public static final SubLFile me = new list_utilities();
  public static final String myName = "com.cyc.cycjava_1.cycl.list_utilities";

  //// Definitions

  /** the cutoff beyond which it's more efficient to use a hashtable
than an N^2 non-consing algorithm, used for the fast-* functions. */
  @SubL(source = "cycl/list-utilities.lisp", position = 623)
  public static SubLSymbol $magic_hashing_cutoff$ = null;

  /** Convert OBJECT to T or NIL */
  @SubL(source = "cycl/list-utilities.lisp", position = 1025)
  public static final SubLObject sublisp_boolean(SubLObject object) {
    return makeBoolean((NIL != object));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 1196)
  public static final SubLObject not_eq(SubLObject obj1, SubLObject obj2) {
    return makeBoolean((obj1 != obj2));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 2308)
  public static final SubLObject cdddr(SubLObject cons) {
    return conses_high.cddr(cons).rest();
  }

  public static final class $cadar$UnaryFunction extends UnaryFunction {
    public $cadar$UnaryFunction() { super(extractFunctionNamed("CADAR")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9052"); }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 2923)
  public static final SubLObject proper_subsetp(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return makeBoolean(((NIL != conses_high.subsetp(list1, list2, test, key))
           && (NIL == conses_high.subsetp(list2, list1, test, key))));
  }

  /** @return boolean; whether the length of SEQ is strictly less than N.
   @param count-dotted-list? whether (1 2 . 3) counts as length 2 or 3.
   If it is t, it counts as length 3, otherwise it counts as length 2. */
  @SubL(source = "cycl/list-utilities.lisp", position = 13865)
  public static final SubLObject lengthL(SubLObject seq, SubLObject n, SubLObject count_dotted_listP) {
    if ((count_dotted_listP == UNPROVIDED)) {
      count_dotted_listP = NIL;
    }
    if ((!(seq.isList()))) {
      return Numbers.numL(Sequences.length(seq), n);
    }
    {
      SubLObject tail = NIL;
      SubLObject i = NIL;
      for (tail = seq, i = ZERO_INTEGER; (!(i.numGE(n))); tail = tail.rest(), i = Numbers.add(i, ONE_INTEGER)) {
        if ((NIL == tail)) {
          return T;
        }
        if ((!(tail.isCons()))) {
          return ((NIL != count_dotted_listP) ? ((SubLObject) Numbers.numL(Numbers.add(i, ONE_INTEGER), n)) : T);
        }
      }
      return NIL;
    }
  }

  /** @return boolean; whether the length of SEQ is less than or equal to N.
   @param count-dotted-list? whether (1 2 . 3) counts as length 2 or 3.
   If it is t, it counts as length 3, otherwise it counts as length 2. */
  @SubL(source = "cycl/list-utilities.lisp", position = 14452)
  public static final SubLObject lengthLE(SubLObject seq, SubLObject n, SubLObject count_dotted_listP) {
    if ((count_dotted_listP == UNPROVIDED)) {
      count_dotted_listP = NIL;
    }
    return lengthL(seq, Numbers.add(n, ONE_INTEGER), count_dotted_listP);
  }

  /** @return boolean; whether the length of SEQ is exactly N.
   @param count-dotted-list? whether (1 2 . 3) counts as length 2 or 3.
   If it is t, it counts as length 3, otherwise it counts as length 2. */
  @SubL(source = "cycl/list-utilities.lisp", position = 14775)
  public static final SubLObject lengthE(SubLObject seq, SubLObject n, SubLObject count_dotted_listP) {
    if ((count_dotted_listP == UNPROVIDED)) {
      count_dotted_listP = NIL;
    }
    if ((!(seq.isList()))) {
      return Numbers.numE(Sequences.length(seq), n);
    }
    if ((!(((NIL != count_dotted_listP)
          || (NIL != dotted_list_p(seq)))))) {
      {
        SubLObject pcase_var = n;
        if (pcase_var.eql(ZERO_INTEGER)) {
          return Types.sublisp_null(seq);
        } else if (pcase_var.eql(ONE_INTEGER)) {
          return singletonP(seq);
        } else if (pcase_var.eql(TWO_INTEGER)) {
          return doubletonP(seq);
        } else if (pcase_var.eql(THREE_INTEGER)) {
          return tripleP(seq);
        }
      }
    }
    return makeBoolean(((NIL != lengthLE(seq, n, count_dotted_listP))
           && (NIL != lengthGE(seq, n, count_dotted_listP))));
  }

  /** @return boolean; whether the length of SEQ is strictly greater than N.
   @param count-dotted-list? whether (1 2 . 3) counts as length 2 or 3.
   If it is t, it counts as length 3, otherwise it counts as length 2. */
  @SubL(source = "cycl/list-utilities.lisp", position = 15792)
  public static final SubLObject lengthG(SubLObject seq, SubLObject n, SubLObject count_dotted_listP) {
    if ((count_dotted_listP == UNPROVIDED)) {
      count_dotted_listP = NIL;
    }
    return makeBoolean((NIL == lengthLE(seq, n, count_dotted_listP)));
  }

  /** @return boolean; whether the length of SEQ is greater than or equal to N.
   @param count-dotted-list? whether (1 2 . 3) counts as length 2 or 3.
   If it is t, it counts as length 3, otherwise it counts as length 2. */
  @SubL(source = "cycl/list-utilities.lisp", position = 16116)
  public static final SubLObject lengthGE(SubLObject seq, SubLObject n, SubLObject count_dotted_listP) {
    if ((count_dotted_listP == UNPROVIDED)) {
      count_dotted_listP = NIL;
    }
    return makeBoolean((NIL == lengthL(seq, n, count_dotted_listP)));
  }

  /** @return boolean; whether the first sequence is of greater length than the second sequence.
   @param seq1; a sequence.
   @parem seq2; a sequence.
   @owner sdevoy */
  @SubL(source = "cycl/list-utilities.lisp", position = 17843)
  public static final SubLObject greater_length_p(SubLObject seq1, SubLObject seq2) {
    if ((NIL == seq1)) {
      return NIL;
    } else if (seq1.isCons()) {
      if ((NIL == seq2)) {
        return T;
      } else if (seq2.isCons()) {
        {
          SubLObject sublist1 = NIL;
          SubLObject sublist2 = NIL;
          for (sublist1 = seq1, sublist2 = seq2; (!(((NIL == sublist1)
                || (NIL == sublist2)))); sublist1 = sublist1.rest(), sublist2 = sublist2.rest()) {
          }
          return makeBoolean(((NIL != sublist1)
                 && (NIL == sublist2)));
        }
      } else {
        return Numbers.numG(Sequences.length(seq1), Sequences.length(seq2));
      }
    } else {
      if ((NIL == seq2)) {
        return makeBoolean((!(Sequences.length(seq1).isZero())));
      } else {
        return lengthL(seq2, Sequences.length(seq1), UNPROVIDED);
      }
    }
  }

  /** @return boolean; whether the first sequence is of greater or equal length than the second sequence.
   @param seq1; a sequence.
   @parem seq2; a sequence.
   @owner sdevoy */
  @SubL(source = "cycl/list-utilities.lisp", position = 18496)
  public static final SubLObject greater_or_same_length_p(SubLObject seq1, SubLObject seq2) {
    if ((NIL == seq1)) {
      return makeBoolean(((NIL == seq2)
            || ((!(seq2.isCons()))
               && Sequences.length(seq2).isZero())));
    } else if (seq1.isCons()) {
      if ((NIL == seq2)) {
        return T;
      } else if (seq2.isCons()) {
        {
          SubLObject sublist1 = NIL;
          SubLObject sublist2 = NIL;
          for (sublist1 = seq1, sublist2 = seq2; (!(((NIL == sublist1)
                || (NIL == sublist2)))); sublist1 = sublist1.rest(), sublist2 = sublist2.rest()) {
          }
          return makeBoolean(((sublist1 == sublist2)
                || (NIL == sublist2)));
        }
      } else {
        return Numbers.numGE(Sequences.length(seq1), Sequences.length(seq2));
      }
    } else {
      if ((NIL == seq2)) {
        return T;
      } else {
        return lengthLE(seq2, Sequences.length(seq1), UNPROVIDED);
      }
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 20053)
  public static final SubLObject proper_list_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && (NIL == conses_high.last(object, UNPROVIDED).rest())));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 20230)
  public static final SubLObject dotted_list_p(SubLObject object) {
    return makeBoolean((object.isCons()
           && (NIL != conses_high.last(object, UNPROVIDED).rest())));
  }

  public static final class $dotted_list_p$UnaryFunction extends UnaryFunction {
    public $dotted_list_p$UnaryFunction() { super(extractFunctionNamed("DOTTED-LIST-P")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return dotted_list_p(arg1); }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 20319)
  public static final SubLObject non_dotted_list_p(SubLObject object) {
    return makeBoolean(((NIL == object)
          || (NIL != proper_list_p(object))));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 20412)
  public static final SubLObject dotted_length(SubLObject cons) {
    {
      SubLObject cdr = cons.rest();
      if ((!(cdr.isCons()))) {
        return ONE_INTEGER;
      } else {
        return Numbers.add(ONE_INTEGER, dotted_length(cdr));
      }
    }
  }

  /** This variable is only to be used below by the negated sequence and test functions */
  @SubL(source = "cycl/list-utilities.lisp", position = 24325)
  public static SubLSymbol $negated_test_func$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 24578)
  public static final SubLObject negated_test_func(SubLObject obj) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return makeBoolean((NIL == Functions.funcall($negated_test_func$.getDynamicValue(thread), obj)));
    }
  }

  public static final class $negated_test_func$UnaryFunction extends UnaryFunction {
    public $negated_test_func$UnaryFunction() { super(extractFunctionNamed("NEGATED-TEST-FUNC")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return negated_test_func(arg1); }
  }

  /** Negated version of REMOVE-IF */
  @SubL(source = "cycl/list-utilities.lisp", position = 24661)
  public static final SubLObject remove_if_not(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    if ((count == UNPROVIDED)) {
      count = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $negated_test_func$.currentBinding(thread);
          try {
            $negated_test_func$.bind(test, thread);
            ans = Sequences.remove_if($sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
          } finally {
            $negated_test_func$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Negated version of DELETE-IF */
  @SubL(source = "cycl/list-utilities.lisp", position = 24928)
  public static final SubLObject delete_if_not(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start, SubLObject end, SubLObject count) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    if ((count == UNPROVIDED)) {
      count = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $negated_test_func$.currentBinding(thread);
          try {
            $negated_test_func$.bind(test, thread);
            ans = Sequences.delete_if($sym66$NEGATED_TEST_FUNC, sequence, key, start, end, count);
          } finally {
            $negated_test_func$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  /** Negated version of FIND-IF */
  @SubL(source = "cycl/list-utilities.lisp", position = 25772)
  public static final SubLObject find_if_not(SubLObject test, SubLObject sequence, SubLObject key, SubLObject start, SubLObject end) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      {
        SubLObject ans = NIL;
        {
          SubLObject _prev_bind_0 = $negated_test_func$.currentBinding(thread);
          try {
            $negated_test_func$.bind(test, thread);
            ans = Sequences.find_if($sym66$NEGATED_TEST_FUNC, sequence, key, start, end);
          } finally {
            $negated_test_func$.rebind(_prev_bind_0, thread);
          }
        }
        return ans;
      }
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 26289)
  private static SubLSymbol $position_if_binary_lambda_func$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 26350)
  private static SubLSymbol $position_if_binary_lambda_arg2$ = null;

  /** Cons a new pair only if the CAR or CDR of CONS are not EQ to CAR and CDR.
   @see ncons for a destructive version of this. */
  @SubL(source = "cycl/list-utilities.lisp", position = 47290)
  public static final SubLObject recons(SubLObject car, SubLObject cdr, SubLObject cons) {
    if (((cons.first() == car)
         && (cons.rest() == cdr))) {
      return cons;
    } else {
      return cons(car, cdr);
    }
  }

  /** Return CONS after replacing its CAR and CDR.
  @see recons for a non-destructive version of this. */
  @SubL(source = "cycl/list-utilities.lisp", position = 47560)
  public static final SubLObject ncons(SubLObject car, SubLObject cdr, SubLObject cons) {
    if ((!(car.eql(cons.first())))) {
      ConsesLow.rplaca(cons, car);
    }
    if ((!(cdr.eql(cons.rest())))) {
      ConsesLow.rplacd(cons, cdr);
    }
    return cons;
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 47816)
  public static final SubLObject delete_first(SubLObject obj, SubLObject sequence, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return Sequences.delete(obj, sequence, test, Symbols.symbol_function(IDENTITY), ZERO_INTEGER, NIL, ONE_INTEGER);
  }

  /** A destructive version of @xref mapcar.
   WARNING: This will produce really funky behaviour if elements of LIST share list structure. */
  @SubL(source = "cycl/list-utilities.lisp", position = 48102)
  public static final SubLObject nmapcar(SubLObject function, SubLObject list) {
    {
      SubLObject partial_list = NIL;
      for (partial_list = list; (NIL != partial_list); partial_list = partial_list.rest()) {
        ConsesLow.rplaca(partial_list, Functions.funcall(function, partial_list.first()));
      }
    }
    return list;
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 48428)
  public static final SubLObject mapappend(SubLObject function, SubLObject list) {
    {
      SubLObject ans = NIL;
      SubLObject cdolist_list_var = list;
      SubLObject old = NIL;
      for (old = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), old = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_13 = Functions.funcall(function, old);
          SubLObject v_new = NIL;
          for (v_new = cdolist_list_var_13.first(); (NIL != cdolist_list_var_13); cdolist_list_var_13 = cdolist_list_var_13.rest(), v_new = cdolist_list_var_13.first()) {
            ans = cons(v_new, ans);
          }
        }
      }
      return Sequences.nreverse(ans);
    }
  }

  /** @param FUNCTION a unary function that returns a list.
   @param LIST a list, each of whose elements is a valid argument to FUNCTION.
   FUNCTION is applied to each element of LIST to get a new element X (which is also a list).
   Then we return the unique elements of X, concatenating over all elements of LIST.
   e.g. (define mapabs (list) (ret (mapcar 'abs list)))
        (mapunion 'mapabs '((1 2 3) (0 -1 -2))) -> (1 2 3 0) */
  @SubL(source = "cycl/list-utilities.lisp", position = 48591)
  public static final SubLObject mapunion(SubLObject function, SubLObject list, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject ans = NIL;
      SubLObject cdolist_list_var = list;
      SubLObject old = NIL;
      for (old = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), old = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_14 = Functions.funcall(function, old);
          SubLObject v_new = NIL;
          for (v_new = cdolist_list_var_14.first(); (NIL != cdolist_list_var_14); cdolist_list_var_14 = cdolist_list_var_14.rest(), v_new = cdolist_list_var_14.first()) {
            {
              SubLObject item_var = v_new;
              if ((NIL == conses_high.member(item_var, ans, test, Symbols.symbol_function(IDENTITY)))) {
                ans = cons(item_var, ans);
              }
            }
          }
        }
      }
      return Sequences.nreverse(ans);
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 49217)
  public static final SubLObject mapnunion(SubLObject function, SubLObject list, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject ans = NIL;
      SubLObject cdolist_list_var = list;
      SubLObject old = NIL;
      for (old = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), old = cdolist_list_var.first()) {
        ans = conses_high.nunion(Functions.funcall(function, old), ans, test, UNPROVIDED);
      }
      return ans;
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 49389)
  public static final SubLObject mapcar_product(SubLObject function, SubLObject list1, SubLObject list2) {
    {
      SubLObject ans = NIL;
      if (((NIL != list1)
           && (NIL != list2))) {
        {
          SubLObject cdolist_list_var = list1;
          SubLObject item1 = NIL;
          for (item1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item1 = cdolist_list_var.first()) {
            {
              SubLObject cdolist_list_var_15 = list2;
              SubLObject item2 = NIL;
              for (item2 = cdolist_list_var_15.first(); (NIL != cdolist_list_var_15); cdolist_list_var_15 = cdolist_list_var_15.rest(), item2 = cdolist_list_var_15.first()) {
                ans = cons(Functions.funcall(function, item1, item2), ans);
              }
            }
          }
        }
      }
      return Sequences.nreverse(ans);
    }
  }

  /** Returns a list consisting of the last item in LIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 50363)
  public static final SubLObject last1(SubLObject list) {
    {
      SubLObject rest = NIL;
      SubLObject next = NIL;
      for (rest = list, next = rest.rest(); (!(next.isAtom())); rest = next, next = rest.rest()) {
      }
      return rest;
    }
  }

  /** Returns the LIST with ITEM as the new last element.
LIST may be destructively modified. */
  @SubL(source = "cycl/list-utilities.lisp", position = 50755)
  public static final SubLObject nadd_to_end(SubLObject item, SubLObject list) {
    {
      SubLObject new_last_cons = cons(item, NIL);
      if ((NIL != list)) {
        {
          SubLObject old_last_cons = last1(list);
          ConsesLow.rplacd(old_last_cons, new_last_cons);
        }
      } else {
        list = new_last_cons;
      }
    }
    return list;
  }

  /** @return 0 list; all the elements of LIST which pass FUNC
   @return 1 list; all the elements of LIST which do not pass FUNC
   Otherwise, order is preserved. */
  @SubL(source = "cycl/list-utilities.lisp", position = 52026)
  public static final SubLObject partition_list(SubLObject list, SubLObject func) {
    {
      SubLObject head = NIL;
      SubLObject tail = NIL;
      SubLObject cdolist_list_var = list;
      SubLObject elem = NIL;
      for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
        if ((NIL != Functions.funcall(func, elem))) {
          head = cons(elem, head);
        } else {
          tail = cons(elem, tail);
        }
      }
      return Values.values(Sequences.nreverse(head), Sequences.nreverse(tail));
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 59160)
  public static final SubLObject find_all_if_not(SubLObject test, SubLObject seq, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject answer = NIL;
      SubLObject sequence_var = seq;
      SubLObject end_index = (sequence_var.isList() ? ((SubLObject) NIL) : Sequences.length(sequence_var));
      SubLObject element_num = ZERO_INTEGER;
      SubLObject sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var);
      while ((NIL == sequence_doneP)) {
        {
          SubLObject elt = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4774");
          if ((NIL == Functions.funcall(test, Functions.funcall(key, elt)))) {
            answer = cons(elt, answer);
          }
          sequence_var = Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 4770");
          element_num = Numbers.add(element_num, ONE_INTEGER);
          sequence_doneP = subl_macros.do_sequence_index_doneP(element_num, end_index, sequence_var);
        }
      }
      return Sequences.nreverse(answer);
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 59735)
  public static final SubLObject only_one(SubLObject list) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) {
        if ((NIL == singletonP(list))) {
          Errors.error($str87$_s_was_not_a_singleton, list);
        }
      }
      return list.first();
    }
  }

  /** Non-recursive function which returns a list of the non-nil atoms in TREE. */
  @SubL(source = "cycl/list-utilities.lisp", position = 60276)
  public static final SubLObject flatten(SubLObject tree) {
    {
      SubLObject stack = list(tree);
      SubLObject temp = NIL;
      SubLObject accumulator = NIL;
      while ((NIL != stack)) {
        temp = stack.first();
        stack = stack.rest();
        if (temp.isAtom()) {
          if ((NIL != temp)) {
            accumulator = cons(temp, accumulator);
          }
        } else {
          if ((NIL != temp.rest())) {
            stack = cons(temp.rest(), stack);
          }
          stack = cons(temp.first(), stack);
        }
      }
      return Sequences.nreverse(accumulator);
    }
  }

  /** return the first N elements of LIST */
  @SubL(source = "cycl/list-utilities.lisp", position = 61850)
  public static final SubLObject first_n(SubLObject n, SubLObject list) {
    return conses_high.ldiff(list, conses_high.nthcdr(n, list));
  }

  /** replace the Nth item of LIST with NEW (destructive)
   This is a safer version of @xref set-nth */
  @SubL(source = "cycl/list-utilities.lisp", position = 63966)
  public static final SubLObject nreplace_nth(SubLObject n, SubLObject v_new, SubLObject list) {
    checkType(n, $sym91$INTEGERP);
    checkType(list, $sym53$LISTP);
    if (n.numL(ZERO_INTEGER)) {
      return list;
    } else if (n.numG(Numbers.subtract(Sequences.length(list), ONE_INTEGER))) {
      return list;
    } else {
      {
        SubLObject sublist = conses_high.nthcdr(n, list);
        if (sublist.isCons()) {
          ConsesLow.rplaca(sublist, v_new);
        }
        return list;
      }
    }
  }

  /** replace the Nth item of LIST with NEW (nondestructive)
   @owner pace */
  @SubL(source = "cycl/list-utilities.lisp", position = 70556)
  public static final SubLObject replace_nth(SubLObject n, SubLObject v_new, SubLObject list) {
    return nreplace_nth(n, v_new, conses_high.copy_list(list));
  }

  /** @return list; a list of length NUM containing the integers START to NUM-1+START.
@note - The list returned by this function is cached, so unless you're sure it won't
be modified, use @xref NEW-NUM-LIST instead.
@note - If you're getting a list of numbers just to iterate over it, use @xref
DO-NUMBERS instead. */
  @SubL(source = "cycl/list-utilities.lisp", position = 74220)
  public static final SubLObject num_list(SubLObject num, SubLObject start) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    {
      SubLObject maybe_cached_list = num_list_cached(num, start);
      SubLObject okP = verify_num_list(maybe_cached_list, num, start);
      if ((NIL != okP)) {
        return maybe_cached_list;
      } else {
        Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9349");
        return num_list_cached(num, start);
      }
    }
  }

  /** @return list; a list of length NUM containing the integers START to NUM-1+START.
@note - The list returned by this function is NOT cached, so if you're sure it won't
be modified and you're going to be calling this a lot with the same arguments, use
@xref NUM-LIST or @xref DO-NUMBERS instead. */
  @SubL(source = "cycl/list-utilities.lisp", position = 74826)
  public static final SubLObject new_num_list(SubLObject num, SubLObject start) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    {
      SubLObject ans = NIL;
      SubLObject i = NIL;
      for (i = ZERO_INTEGER; i.numL(num); i = Numbers.add(i, ONE_INTEGER)) {
        ans = cons(Numbers.add(start, i), ans);
      }
      return Sequences.nreverse(ans);
    }
  }

  /** @return BOOLEAN; Is NUM-LIST a list of length LENGTH containing the integers START to LENGTH-1+START? */
  @SubL(source = "cycl/list-utilities.lisp", position = 75273)
  public static final SubLObject verify_num_list(SubLObject num_list, SubLObject length, SubLObject start) {
    {
      SubLObject badP = makeBoolean((!((num_list.isList()
             && length.isInteger()
             && start.isInteger()
             && (NIL != lengthE(num_list, length, UNPROVIDED))))));
      SubLObject list_var = NIL;
      SubLObject num = NIL;
      SubLObject i = NIL;
      for (list_var = num_list, num = list_var.first(), i = ZERO_INTEGER; (!(((NIL != badP)
            || (NIL == list_var)))); list_var = list_var.rest(), num = list_var.first(), i = Numbers.add(ONE_INTEGER, i)) {
        if ((!(num.eql(Numbers.add(i, start))))) {
          badP = T;
        }
      }
      return makeBoolean((NIL == badP));
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 75684)
  private static SubLSymbol $num_list_cached_caching_state$ = null;

  /** @return list; a list of length NUM containing the integers START to NUM-1+START.
@note - We cache this to save space, not time. */
  @SubL(source = "cycl/list-utilities.lisp", position = 75684)
  public static final SubLObject num_list_cached_internal(SubLObject num, SubLObject start) {
    return new_num_list(num, start);
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 75684)
  public static final SubLObject num_list_cached(SubLObject num, SubLObject start) {
    {
      SubLObject caching_state = $num_list_cached_caching_state$.getGlobalValue();
      if ((NIL == caching_state)) {
        caching_state = memoization_state.create_global_caching_state_for_name($sym93$NUM_LIST_CACHED, $sym94$_NUM_LIST_CACHED_CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int95$100);
      }
      {
        SubLObject sxhash = memoization_state.sxhash_calc_2(num, start);
        SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if ((collisions != $kw96$_MEMOIZED_ITEM_NOT_FOUND_)) {
          {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            for (collision = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), collision = cdolist_list_var.first()) {
              {
                SubLObject cached_args = collision.first();
                SubLObject results2 = conses_high.second(collision);
                if (num.eql(cached_args.first())) {
                  cached_args = cached_args.rest();
                  if (((NIL != cached_args)
                       && (NIL == cached_args.rest())
                       && start.eql(cached_args.first()))) {
                    return memoization_state.caching_results(results2);
                  }
                }
              }
            }
          }
        }
        {
          SubLObject results = Values.arg2(Values.resetMultipleValues(), Values.multiple_value_list(num_list_cached_internal(num, start)));
          memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(num, start));
          return memoization_state.caching_results(results);
        }
      }
    }
  }

  /** @return list; a list of length LENGTH containing the numbers 0 + START to LENGTH-1 + START. */
  @SubL(source = "cycl/list-utilities.lisp", position = 75917)
  public static final SubLObject numlist(SubLObject length, SubLObject start) {
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    return num_list(length, start);
  }

  /** An optimized form of (member? ITEM LIST #'eq) */
  @SubL(source = "cycl/list-utilities.lisp", position = 76479)
  public static final SubLObject member_eqP(SubLObject item, SubLObject list) {
    return subl_promotions.memberP(item, list, Symbols.symbol_function(EQ), UNPROVIDED);
  }

  /** An optimized form of (member? ITEM LIST #'equal) */
  @SubL(source = "cycl/list-utilities.lisp", position = 76723)
  public static final SubLObject member_equalP(SubLObject item, SubLObject list) {
    return subl_promotions.memberP(item, list, Symbols.symbol_function(EQUAL), UNPROVIDED);
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 85519)
  public static final SubLObject singletonP(SubLObject list) {
    return makeBoolean((list.isCons()
           && (NIL == list.rest())));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 85593)
  public static final SubLObject doubletonP(SubLObject list) {
    return makeBoolean((list.isCons()
           && (NIL != list.rest())
           && (NIL == conses_high.cddr(list))));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 85679)
  public static final SubLObject tripleP(SubLObject list) {
    return makeBoolean((list.isCons()
           && (NIL != conses_high.cddr(list))
           && (NIL == cdddr(list))));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 86251)
  public static final SubLObject duplicatesP(SubLObject list, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject ans = NIL;
      SubLObject element = NIL;
      SubLObject rest = NIL;
      for (element = list.first(), rest = list.rest(); (!(((NIL != ans)
            || (NIL == rest)))); element = rest.first(), rest = rest.rest()) {
        ans = conses_high.member(Functions.funcall(key, element), rest, test, key);
      }
      return ans;
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 86652)
  public static final SubLObject duplicates(SubLObject list, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject ans = NIL;
      SubLObject element = NIL;
      SubLObject rest = NIL;
      for (element = list.first(), rest = list.rest(); (NIL != rest); element = rest.first(), rest = rest.rest()) {
        if ((NIL != subl_promotions.memberP(Functions.funcall(key, element), rest, test, key))) {
          if ((NIL == subl_promotions.memberP(element, ans, UNPROVIDED, UNPROVIDED))) {
            ans = cons(element, ans);
          }
        }
      }
      return Sequences.nreverse(ans);
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 90773)
  public static final SubLObject multisets_equalP(SubLObject set1, SubLObject set2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject result = NIL;
      SubLObject doneP = NIL;
      if ((Sequences.length(set1) != Sequences.length(set2))) {
        doneP = T;
      }
      if ((NIL == doneP)) {
        {
          SubLObject cdolist_list_var = set1;
          SubLObject elem = NIL;
          for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
            if ((Sequences.count(elem, set1, test, UNPROVIDED, UNPROVIDED, UNPROVIDED) != Sequences.count(elem, set2, test, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
              doneP = T;
            }
          }
        }
      }
      if ((NIL == doneP)) {
        result = sets_equalP(set1, set2, test);
      }
      return result;
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 91166)
  public static final SubLObject sets_equalP(SubLObject set1, SubLObject set2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return makeBoolean((set1.equal(set2)
          || ((NIL != conses_high.subsetp(set1, set2, test, UNPROVIDED))
             && (NIL != conses_high.subsetp(set2, set1, test, UNPROVIDED)))));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 91317)
  public static final SubLObject fast_sets_equalP(SubLObject set1, SubLObject set2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    return makeBoolean(((NIL != fast_subsetP(set1, set2, test))
           && (NIL != fast_subsetP(set2, set1, test))));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 91467)
  public static final SubLObject fast_subsetP(SubLObject list1, SubLObject list2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != lengthL(list1, $magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))
           && (NIL != lengthL(list2, $magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)))) {
        return conses_high.subsetp(list1, list2, test, UNPROVIDED);
      } else {
        {
          SubLObject length1 = Sequences.length(list1);
          SubLObject length2 = Sequences.length(list2);
          if ((!(length1.numLE(length2)))) {
            return NIL;
          }
          {
            SubLObject hash2 = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8871");
            SubLObject cdolist_list_var = list1;
            SubLObject elem1 = NIL;
            for (elem1 = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem1 = cdolist_list_var.first()) {
              if ((NIL == Hashtables.gethash(elem1, hash2, UNPROVIDED))) {
                return NIL;
              }
            }
          }
          return T;
        }
      }
    }
  }

  /** like union only the result preserves the order of elements in the input sets */
  @SubL(source = "cycl/list-utilities.lisp", position = 93332)
  public static final SubLObject ordered_union(SubLObject set1, SubLObject set2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject tail = NIL;
      SubLObject cdolist_list_var = set2;
      SubLObject element = NIL;
      for (element = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
        if ((NIL == subl_promotions.memberP(element, set1, test, key))) {
          tail = cons(element, tail);
        }
      }
      return ConsesLow.append(set1, Sequences.nreverse(tail));
    }
  }

  /** Like @xref set-difference except the order of returned items is the same order as in LIST1. */
  @SubL(source = "cycl/list-utilities.lisp", position = 93873)
  public static final SubLObject ordered_set_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject result = NIL;
      SubLObject cdolist_list_var = list1;
      SubLObject element = NIL;
      for (element = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), element = cdolist_list_var.first()) {
        if ((NIL == subl_promotions.memberP(element, list2, test, key))) {
          result = cons(element, result);
        }
      }
      return Sequences.nreverse(result);
    }
  }

  /** Like @xref set-difference except not slow.
   @owner Pace */
  @SubL(source = "cycl/list-utilities.lisp", position = 94434)
  public static final SubLObject fast_set_difference(SubLObject list1, SubLObject list2, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if (((NIL != lengthLE(list1, $magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))
           && (NIL != lengthLE(list2, $magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED)))) {
        return conses_high.set_difference(list1, list2, test, UNPROVIDED);
      } else {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9111");
      }
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 99092)
  public static final SubLObject flip_alist(SubLObject alist) {
    return Mapping.mapcar($sym105$FLIP_CONS, alist);
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 99155)
  public static final SubLObject flip_cons(SubLObject cons) {
    return cons(cons.rest(), cons.first());
  }

  public static final class $flip_cons$UnaryFunction extends UnaryFunction {
    public $flip_cons$UnaryFunction() { super(extractFunctionNamed("FLIP-CONS")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return flip_cons(arg1); }
  }

  /** Return T iff evaluation of OBJECT necessarily returns OBJECT. */
  @SubL(source = "cycl/list-utilities.lisp", position = 102525)
  public static final SubLObject self_evaluating_form_p(SubLObject object) {
    return makeBoolean((object.isAtom()
           && ((NIL == object)
            || (T == object)
            || object.isKeyword()
            || (!(object.isSymbol())))));
  }

  /** Return an expression which, if evaluated, would return OBJECT. */
  @SubL(source = "cycl/list-utilities.lisp", position = 103095)
  public static final SubLObject quotify(SubLObject object) {
    if ((NIL != self_evaluating_form_p(object))) {
      return object;
    } else {
      return list($sym106$QUOTE, object);
    }
  }

  public static final class $quotify$UnaryFunction extends UnaryFunction {
    public $quotify$UnaryFunction() { super(extractFunctionNamed("QUOTIFY")); }
    @Override
    public SubLObject processItem(SubLObject arg1) { return quotify(arg1); }
  }

  /** Splice OBJECT into SORTED-LIST sorted by PREDICATE. */
  @SubL(source = "cycl/list-utilities.lisp", position = 104793)
  public static final SubLObject splice_into_sorted_list(SubLObject object, SubLObject sorted_list, SubLObject predicate, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(sorted_list, $sym53$LISTP);
    {
      SubLObject object_key = Functions.funcall(key, object);
      SubLObject back = NIL;
      SubLObject node = NIL;
      for (back = NIL, node = sorted_list; (NIL != node); back = node, node = node.rest()) {
        {
          SubLObject item = node.first();
          SubLObject item_key = Functions.funcall(key, item);
          if ((NIL != Functions.funcall(predicate, object_key, item_key))) {
            if ((NIL != back)) {
              ConsesLow.rplacd(back, cons(object, node));
            } else {
              sorted_list = cons(object, sorted_list);
            }
            return sorted_list;
          }
        }
      }
      if ((NIL != back)) {
        ConsesLow.rplacd(back, cons(object, node));
      } else {
        sorted_list = cons(object, sorted_list);
      }
      return sorted_list;
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 108824)
  public static final SubLObject tree_funcall_if(SubLObject test, SubLObject fn, SubLObject object, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((NIL != Functions.funcall(test, Functions.funcall(key, object)))) {
      Functions.funcall(fn, object);
    } else if (object.isCons()) {
      tree_funcall_if(test, fn, object.first(), key);
      tree_funcall_if(test, fn, object.rest(), key);
    }
    return NIL;
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 110694)
  private static SubLSymbol $remove_duplicates_eq_table$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 110853)
  private static SubLSymbol $remove_duplicates_eql_table$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 110932)
  private static SubLSymbol $remove_duplicates_equal_table$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 111015)
  private static SubLSymbol $remove_duplicates_equalp_table$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 111100)
  private static SubLSymbol $remove_duplicates_eq_table_lock$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 111202)
  private static SubLSymbol $remove_duplicates_eql_table_lock$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 111305)
  private static SubLSymbol $remove_duplicates_equal_table_lock$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 111412)
  private static SubLSymbol $remove_duplicates_equalp_table_lock$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 114114)
  public static final SubLObject fast_delete_duplicates(SubLObject sequence, SubLObject test, SubLObject key, SubLObject hashtable, SubLObject start, SubLObject end) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((hashtable == UNPROVIDED)) {
      hashtable = NIL;
    }
    if ((start == UNPROVIDED)) {
      start = ZERO_INTEGER;
    }
    if ((end == UNPROVIDED)) {
      end = NIL;
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(test, $sym83$FUNCTION_SPEC_P);
      if ((NIL != lengthLE(sequence, ONE_INTEGER, UNPROVIDED))) {
        return sequence;
      } else if ((NIL != lengthLE(sequence, $magic_hashing_cutoff$.getDynamicValue(thread), UNPROVIDED))) {
        return Sequences.delete_duplicates(sequence, test, key, start, end);
      } else if ((NIL != hashtable)) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9109");
      } else if ((NIL != Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 8903"))) {
        return Errors
				.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9110");
      } else {
        return Sequences.delete_duplicates(sequence, test, key, start, end);
      }
    }
  }

  /** @return the list FORTS with all duplicates removed */
  @SubL(source = "cycl/list-utilities.lisp", position = 115092)
  public static final SubLObject remove_duplicate_forts(SubLObject v_forts) {
    return fast_delete_duplicates(v_forts, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** @return listp; the list FORTS with all duplicates destructively removed */
  @SubL(source = "cycl/list-utilities.lisp", position = 115273)
  public static final SubLObject delete_duplicate_forts(SubLObject v_forts) {
    return fast_delete_duplicates(v_forts, Symbols.symbol_function(EQ), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
  }

  /** Deletes duplicates from SORTED-LIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 123415)
  public static final SubLObject delete_duplicates_sorted(SubLObject sorted_list, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    {
      SubLObject last_cons = sorted_list;
      SubLObject this_cons = sorted_list.rest();
      while ((NIL != this_cons)) {
        if ((NIL != Functions.funcall(test, this_cons.first(), last_cons.first()))) {
          ConsesLow.rplacd(last_cons, this_cons.rest());
        } else {
          last_cons = this_cons;
        }
        this_cons = this_cons.rest();
      }
    }
    return sorted_list;
  }

  /** Return T iff OBJECT is an association list. */
  @SubL(source = "cycl/list-utilities.lisp", position = 125045)
  public static final SubLObject alist_p(SubLObject object) {
    return Types.listp(object);
  }

  /** Return the value associated with KEY in ALIST (using TEST for key equality).
   Return DEFAULT if KEY is not present.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/list-utilities.lisp", position = 125486)
  public static final SubLObject alist_lookup(SubLObject alist, SubLObject key, SubLObject test, SubLObject v_default) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      if ((NIL != pair)) {
        return Values.values(pair.rest(), T);
      } else {
        return Values.values(v_default, NIL);
      }
    }
  }

  /** Return the value associated with KEY in ALIST (using TEST for key equality).
   Return DEFAULT if KEY is not present.
   Unlike ALIST-LOOKUP, only 1 value is returned. */
  @SubL(source = "cycl/list-utilities.lisp", position = 125874)
  public static final SubLObject alist_lookup_without_values(SubLObject alist, SubLObject key, SubLObject test, SubLObject v_default) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((v_default == UNPROVIDED)) {
      v_default = NIL;
    }
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      return ((NIL != pair) ? ((SubLObject) pair.rest()) : v_default);
    }
  }

  /** @return booleanp; whether KEY is a key in the association list ALIST */
  @SubL(source = "cycl/list-utilities.lisp", position = 129813)
  public static final SubLObject alist_has_keyP(SubLObject alist, SubLObject key, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    return subl_promotions.memberP(key, alist, test, Symbols.symbol_function($sym20$CAR));
  }

  /** Note that VALUE is associated with KEY in ALIST (using TEST for key equality).
   Return the resulting alist.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/list-utilities.lisp", position = 131013)
  public static final SubLObject alist_enter(SubLObject alist, SubLObject key, SubLObject value, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      if ((NIL != pair)) {
        ConsesLow.rplacd(pair, value);
      } else {
        alist = conses_high.acons(key, value, alist);
      }
      return Values.values(alist, sublisp_boolean(pair));
    }
  }

  /** Note that VALUE is associated with KEY in ALIST (using TEST for key equality).
   Return the resulting alist.
   Unlike ALIST-ENTER, only 1 value is returned. */
  @SubL(source = "cycl/list-utilities.lisp", position = 131433)
  public static final SubLObject alist_enter_without_values(SubLObject alist, SubLObject key, SubLObject value, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      if ((NIL != pair)) {
        ConsesLow.rplacd(pair, value);
      } else {
        alist = conses_high.acons(key, value, alist);
      }
    }
    return alist;
  }

  /** Delete any association for KEY in ALIST (using TEST for key equality).
   Return the resulting alist.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/list-utilities.lisp", position = 132765)
  public static final SubLObject alist_delete(SubLObject alist, SubLObject key, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      if ((NIL != pair)) {
        alist = delete_first(pair, alist, UNPROVIDED);
      }
      return Values.values(alist, sublisp_boolean(pair));
    }
  }

  /** Note that VALUE is in a list associated with KEY in ALIST (using TEST for key equality).
   Return the resulting alist.
   Return a second value of T iff KEY was found. */
  @SubL(source = "cycl/list-utilities.lisp", position = 134321)
  public static final SubLObject alist_push(SubLObject alist, SubLObject key, SubLObject value, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject pair = conses_high.assoc(key, alist, test, UNPROVIDED);
      if ((NIL != pair)) {
        ConsesLow.rplacd(pair, cons(value, pair.rest()));
      } else {
        alist = conses_high.acons(key, list(value), alist);
      }
      return Values.values(alist, sublisp_boolean(pair));
    }
  }

  /** Return a list of all the keys of ALIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 136170)
  public static final SubLObject alist_keys(SubLObject alist) {
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = alist;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject key = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
          key = current.first();
          current = current.rest();
          value = current;
          answer = cons(key, answer);
        }
      }
      return Sequences.nreverse(answer);
    }
  }

  /** Return a list of all the values of ALIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 136405)
  public static final SubLObject alist_values(SubLObject alist) {
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject answer = NIL;
      SubLObject cdolist_list_var = alist;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject key = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
          key = current.first();
          current = current.rest();
          value = current;
          answer = cons(value, answer);
        }
      }
      return Sequences.nreverse(answer);
    }
  }

  /** Return a copy of ALIST where the order of the keys have been optimized (sorted)
   via the preference PREDICATE. */
  @SubL(source = "cycl/list-utilities.lisp", position = 136643)
  public static final SubLObject alist_optimize(SubLObject alist, SubLObject predicate) {
    checkType(alist, $sym134$ALIST_P);
    return conses_high.copy_alist(Sort.stable_sort(conses_high.copy_list(alist), predicate, Symbols.symbol_function($sym20$CAR)));
  }

  /** Return a hashtable of all the (key . value) entries in ALIST.
   TEST is the equality test for keys in ALIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 138013)
  public static final SubLObject alist_to_hash_table(SubLObject alist, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject hashtable = Hashtables.make_hash_table(Sequences.length(alist), test, UNPROVIDED);
      SubLObject cdolist_list_var = alist;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject key = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
          key = current.first();
          current = current.rest();
          value = current;
          Hashtables.sethash(key, hashtable, value);
        }
      }
      return hashtable;
    }
  }

  /** Return a hashtable of all the (key . value) entries in ALIST
   using the value as the key and the key as the value.
   TEST is the equality test for values in ALIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 138382)
  public static final SubLObject alist_to_reverse_hash_table(SubLObject alist, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    checkType(alist, $sym134$ALIST_P);
    {
      SubLObject hashtable = Hashtables.make_hash_table(Sequences.length(alist), test, UNPROVIDED);
      SubLObject cdolist_list_var = alist;
      SubLObject cons = NIL;
      for (cons = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), cons = cdolist_list_var.first()) {
        {
          SubLObject datum = cons;
          SubLObject current = datum;
          SubLObject key = NIL;
          SubLObject value = NIL;
          cdestructuring_bind.destructuring_bind_must_consp(current, datum, $list142);
          key = current.first();
          current = current.rest();
          value = current;
          Hashtables.sethash(value, hashtable, key);
        }
      }
      return hashtable;
    }
  }

  /** Creates a new plist based on PLIST, but only including properties
which pass PRED. */
  @SubL(source = "cycl/list-utilities.lisp", position = 139635)
  public static final SubLObject filter_plist(SubLObject plist, SubLObject pred) {
    {
      SubLObject new_plist = NIL;
      SubLObject remainder = NIL;
      for (remainder = plist; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject property = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          if ((NIL != Functions.funcall(pred, property))) {
            new_plist = cons(property, new_plist);
            new_plist = cons(value, new_plist);
          }
        }
      }
      return Sequences.nreverse(new_plist);
    }
  }

  /** Place all of the values of list B onto list A destructively and return
   the resulting PLIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 142288)
  public static final SubLObject nmerge_plist(SubLObject plist_a, SubLObject plist_b) {
    checkType(plist_a, $sym151$PROPERTY_LIST_P);
    checkType(plist_b, $sym151$PROPERTY_LIST_P);
    if ((NIL == plist_b)) {
      return plist_a;
    }
    if ((NIL == plist_a)) {
      return conses_high.copy_list(plist_b);
    }
    {
      SubLObject remainder = NIL;
      for (remainder = plist_b; (NIL != remainder); remainder = conses_high.cddr(remainder)) {
        {
          SubLObject param = remainder.first();
          SubLObject value = conses_high.cadr(remainder);
          plist_a = conses_high.putf(plist_a, param, value);
        }
      }
    }
    return plist_a;
  }

  /** Place all of the values of list B onto a copy of list A and return
  the resulting PLIST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 142797)
  public static final SubLObject merge_plist(SubLObject plist_a, SubLObject plist_b) {
    return nmerge_plist(conses_high.copy_list(plist_a), plist_b);
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 147205)
  private static SubLSymbol $plistlist_sort_indicator$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 152834)
  public static final SubLObject any_in_list(SubLObject predicate, SubLObject list, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject ans = NIL;
      if (((key == Symbols.symbol_function(IDENTITY))
          || (key == IDENTITY))) {
        if ((NIL == ans)) {
          {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            for (item = csome_list_var.first(); (!(((NIL != ans)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {
              ans = Functions.funcall(predicate, item);
            }
          }
        }
      } else {
        if ((NIL == ans)) {
          {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            for (item = csome_list_var.first(); (!(((NIL != ans)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {
              ans = Functions.funcall(predicate, Functions.funcall(key, item));
            }
          }
        }
      }
      return ans;
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 153221)
  public static final SubLObject every_in_list(SubLObject predicate, SubLObject list, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject ans = NIL;
      if (((key == Symbols.symbol_function(IDENTITY))
          || (key == IDENTITY))) {
        if ((NIL == ans)) {
          {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            for (item = csome_list_var.first(); (!(((NIL != ans)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {
              ans = makeBoolean((NIL == Functions.funcall(predicate, item)));
            }
          }
        }
      } else {
        if ((NIL == ans)) {
          {
            SubLObject csome_list_var = list;
            SubLObject item = NIL;
            for (item = csome_list_var.first(); (!(((NIL != ans)
                  || (NIL == csome_list_var)))); csome_list_var = csome_list_var.rest(), item = csome_list_var.first()) {
              ans = makeBoolean((NIL == Functions.funcall(predicate, Functions.funcall(key, item))));
            }
          }
        }
      }
      return makeBoolean((NIL == ans));
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 154221)
  public static SubLSymbol $subseq_subst_recursive_answers$ = null;

  /** Return the first item in LIST which maximizes TEST */
  @SubL(source = "cycl/list-utilities.lisp", position = 158296)
  public static final SubLObject extremal(SubLObject list, SubLObject test, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    checkType(list, $sym53$LISTP);
    if ((NIL == list)) {
      return NIL;
    } else {
      {
        SubLObject best = list.first();
        SubLObject rest = list.rest();
        if (((key == Symbols.symbol_function(IDENTITY))
            || (key == IDENTITY))) {
          {
            SubLObject cdolist_list_var = rest;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
              if ((NIL != Functions.funcall(test, item, best))) {
                best = item;
              }
            }
          }
        } else {
          {
            SubLObject cdolist_list_var = rest;
            SubLObject item = NIL;
            for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
              if ((NIL != Functions.funcall(test, Functions.funcall(key, item), Functions.funcall(key, best)))) {
                best = item;
              }
            }
          }
        }
        return best;
      }
    }
  }

  /** Return T iff the position of ITEM1 in GUIDE-SEQ is less than that of ITEM2.
All objects not in the GUIDE-SEQ are considered to be after all those that are,
and are themselves considered equivalent by this test. */
  @SubL(source = "cycl/list-utilities.lisp", position = 163609)
  public static final SubLObject position_L(SubLObject item1, SubLObject item2, SubLObject guide_seq, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject position1 = Sequences.position(item1, guide_seq, test, key, UNPROVIDED, UNPROVIDED);
      SubLObject position2 = Sequences.position(item2, guide_seq, test, key, UNPROVIDED, UNPROVIDED);
      if (position1.isInteger()) {
        if (position2.isInteger()) {
          return Numbers.numL(position1, position2);
        } else {
          return T;
        }
      } else {
        return NIL;
      }
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 164194)
  private static SubLSymbol $sort_via_position_guide$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 164354)
  private static SubLSymbol $sort_via_position_test$ = null;

  /** Sort SEQ using GUIDE-SEQ as a positional guide.
Objects in GUIDE-SEQ appear in the order they are in GUIDE-SEQ.
Objects not in GUIDE-SEQ all appear after those that do. */
  @SubL(source = "cycl/list-utilities.lisp", position = 164406)
  public static final SubLObject sort_via_position(SubLObject seq, SubLObject guide_seq, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(seq, $sym63$SEQUENCEP);
      checkType(guide_seq, $sym63$SEQUENCEP);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $sort_via_position_guide$.currentBinding(thread);
          SubLObject _prev_bind_1 = $sort_via_position_test$.currentBinding(thread);
          try {
            $sort_via_position_guide$.bind(guide_seq, thread);
            $sort_via_position_test$.bind(test, thread);
            answer = Sort.sort(seq, $sym168$SORT_VIA_POSITION_EARLIER, key);
          } finally {
            $sort_via_position_test$.rebind(_prev_bind_1, thread);
            $sort_via_position_guide$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  /** Stably sort SEQ using GUIDE-SEQ as a positional guide.
Objects in GUIDE-SEQ appear in the order they are in GUIDE-SEQ.
Objects not in GUIDE-SEQ all appear after those that do. */
  @SubL(source = "cycl/list-utilities.lisp", position = 164919)
  public static final SubLObject stable_sort_via_position(SubLObject seq, SubLObject guide_seq, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      checkType(seq, $sym63$SEQUENCEP);
      checkType(guide_seq, $sym63$SEQUENCEP);
      {
        SubLObject answer = NIL;
        {
          SubLObject _prev_bind_0 = $sort_via_position_guide$.currentBinding(thread);
          SubLObject _prev_bind_1 = $sort_via_position_test$.currentBinding(thread);
          try {
            $sort_via_position_guide$.bind(guide_seq, thread);
            $sort_via_position_test$.bind(test, thread);
            answer = Sort.stable_sort(seq, $sym168$SORT_VIA_POSITION_EARLIER, key);
          } finally {
            $sort_via_position_test$.rebind(_prev_bind_1, thread);
            $sort_via_position_guide$.rebind(_prev_bind_0, thread);
          }
        }
        return answer;
      }
    }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 165453)
  public static final SubLObject sort_via_position_earlier(SubLObject item1, SubLObject item2) {
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      return position_L(item1, item2, $sort_via_position_guide$.getDynamicValue(thread), $sort_via_position_test$.getDynamicValue(thread), UNPROVIDED);
    }
  }

  public static final class $sort_via_position_earlier$BinaryFunction extends BinaryFunction {
    public $sort_via_position_earlier$BinaryFunction() { super(extractFunctionNamed("SORT-VIA-POSITION-EARLIER")); }
    @Override
    public SubLObject processItem(SubLObject arg1, SubLObject arg2) { return sort_via_position_earlier(arg1, arg2); }
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 165625)
  private static SubLSymbol $sort_via_test_function$ = null;

  @SubL(source = "cycl/list-utilities.lisp", position = 170450)
  public static final SubLObject safe_E(SubLObject object1, SubLObject object2) {
    if ((object1.isNumber()
         && object2.isNumber())) {
      return Numbers.numE(object1, object2);
    } else {
      return NIL;
    }
  }

  /** returns the median of a list, after sorting by SORT-PRED.
   It picks the larger if the median falls in the middle.
   @example (parametrized-median '(1 2 3 4 5) #'<) 3
   @example (parametrized-median '(4 1 2 5 3) #'<) 3
   @example (parametrized-median '(4 1 2 5)   #'<) 4
   @owner pace */
  @SubL(source = "cycl/list-utilities.lisp", position = 171886)
  public static final SubLObject parametrized_median(SubLObject list, SubLObject sort_pred) {
    {
      SubLObject sorted_list = Sort.sort(conses_high.copy_list(list), sort_pred, UNPROVIDED);
      SubLObject len = Sequences.length(sorted_list);
      SubLObject pos = Numbers.integerDivide(len, TWO_INTEGER);
      return ConsesLow.nth(pos, sorted_list);
    }
  }

  /** For the first sub-object in OBJECT (including OBJECT) that satisfies TEST applied to KEY of it and ITEM, return the sub-object.
@return 0 the found sub-object.
@return 1 T if a sub-object is found.
@owner jantos ;; added second return argument */
  @SubL(source = "cycl/list-utilities.lisp", position = 176901)
  public static final SubLObject tree_find(SubLObject item, SubLObject object, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      final SubLThread thread = SubLProcess.currentSubLThread();
      if ((NIL != Functions.funcall(test, item, Functions.funcall(key, object)))) {
        return Values.values(object, T);
      }
      if (object.isCons()) {
        {
          SubLObject list = NIL;
          SubLObject sub = NIL;
          for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
            thread.resetMultipleValues();
            {
              SubLObject ans = tree_find(item, sub, test, key);
              SubLObject foundP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != foundP)) {
                return Values.values(ans, foundP);
              }
            }
          }
          thread.resetMultipleValues();
          {
            SubLObject ans = tree_find(item, list.first(), test, key);
            SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != foundP)) {
              return Values.values(ans, foundP);
            }
          }
          if ((NIL != list.rest())) {
            thread.resetMultipleValues();
            {
              SubLObject ans = tree_find(item, list.rest(), test, key);
              SubLObject foundP = thread.secondMultipleValue();
              thread.resetMultipleValues();
              if ((NIL != foundP)) {
                return Values.values(ans, foundP);
              }
            }
          }
          return Values.values(NIL, NIL);
        }
      }
      return Values.values(NIL, NIL);
    }
  }

  /** Return T iff the non-nil ITEM is found in OBJECT (via EQ) */
  @SubL(source = "cycl/list-utilities.lisp", position = 177884)
  public static final SubLObject simple_tree_findP(SubLObject item, SubLObject object) {
    if ((item == object)) {
      return T;
    }
    if (object.isCons()) {
      {
        SubLObject list = NIL;
        SubLObject sub = NIL;
        for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
          {
            SubLObject foundP = simple_tree_findP(item, sub);
            if ((NIL != foundP)) {
              return T;
            }
          }
        }
        {
          SubLObject foundP = simple_tree_findP(item, list.first());
          if ((NIL != foundP)) {
            return T;
          }
        }
        if ((NIL != list.rest())) {
          {
            SubLObject foundP = simple_tree_findP(item, list.rest());
            if ((NIL != foundP)) {
              return T;
            }
          }
        }
        return NIL;
      }
    }
    return NIL;
  }

  /** Return T iff the non-nil ITEM is found in OBJECT (via EQUAL) */
  @SubL(source = "cycl/list-utilities.lisp", position = 178458)
  public static final SubLObject simple_tree_find_via_equalP(SubLObject item, SubLObject object) {
    if (item.equal(object)) {
      return T;
    }
    if (object.isCons()) {
      {
        SubLObject list = NIL;
        SubLObject sub = NIL;
        for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
          {
            SubLObject foundP = simple_tree_find_via_equalP(item, sub);
            if ((NIL != foundP)) {
              return T;
            }
          }
        }
        {
          SubLObject foundP = simple_tree_find_via_equalP(item, list.first());
          if ((NIL != foundP)) {
            return T;
          }
        }
        if ((NIL != list.rest())) {
          {
            SubLObject foundP = simple_tree_find_via_equalP(item, list.rest());
            if ((NIL != foundP)) {
              return T;
            }
          }
        }
        return NIL;
      }
    }
    return NIL;
  }

  /** Look for any of ITEMS in the tree OBJECT.  Return the first item found, or NIL if none found. */
  @SubL(source = "cycl/list-utilities.lisp", position = 179078)
  public static final SubLObject tree_find_any(SubLObject items, SubLObject tree, SubLObject test, SubLObject key) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    {
      SubLObject cdolist_list_var = items;
      SubLObject item = NIL;
      for (item = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), item = cdolist_list_var.first()) {
        if ((NIL != tree_find(item, tree, test, key))) {
          return item;
        }
      }
    }
    return NIL;
  }

  /** Obsolete -- use tree-find-if */
  @SubL(source = "cycl/list-utilities.lisp", position = 179357)
  public static final SubLObject cons_tree_find_if(SubLObject test, SubLObject object, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    return tree_find_if(test, object, key);
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 179515)
  public static final SubLObject tree_find_if(SubLObject test, SubLObject object, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((NIL != Functions.funcall(test, Functions.funcall(key, object)))) {
      return object;
    }
    if (object.isCons()) {
      {
        SubLObject ans = NIL;
        SubLObject list = NIL;
        SubLObject sub = NIL;
        for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
          ans = tree_find_if(test, sub, key);
          if ((NIL != ans)) {
            return ans;
          }
        }
        ans = tree_find_if(test, list.first(), key);
        if ((NIL != ans)) {
          return ans;
        }
        if ((NIL != list.rest())) {
          ans = tree_find_if(test, list.rest(), key);
        }
        return ans;
      }
    }
    return NIL;
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 182971)
  public static final SubLObject tree_count_if(SubLObject test, SubLObject object, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((NIL != Functions.funcall(test, Functions.funcall(key, object)))) {
      return ONE_INTEGER;
    }
    if (object.isCons()) {
      {
        SubLObject total = ZERO_INTEGER;
        SubLObject list = NIL;
        SubLObject sub = NIL;
        for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
          total = Numbers.add(total, tree_count_if(test, sub, key));
        }
        total = Numbers.add(total, tree_count_if(test, list.first(), key));
        if ((NIL != list.rest())) {
          total = Numbers.add(total, tree_count_if(test, list.rest(), key));
        }
        return total;
      }
    }
    return ZERO_INTEGER;
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 183994)
  public static final SubLObject tree_gather(SubLObject object, SubLObject predicate, SubLObject test, SubLObject key, SubLObject subs_tooP) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQL);
    }
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((subs_tooP == UNPROVIDED)) {
      subs_tooP = T;
    }
    return Sequences.nreverse(tree_gather_internal(object, predicate, test, key, subs_tooP, NIL));
  }

  @SubL(source = "cycl/list-utilities.lisp", position = 184172)
  public static final SubLObject tree_gather_internal(SubLObject object, SubLObject predicate, SubLObject test, SubLObject key, SubLObject subs_tooP, SubLObject so_far) {
    {
      SubLObject result = so_far;
      if ((NIL != Functions.funcall(predicate, Functions.funcall(key, object)))) {
        if ((NIL != test)) {
          {
            SubLObject item_var = object;
            if ((NIL == conses_high.member(item_var, result, test, Symbols.symbol_function(IDENTITY)))) {
              result = cons(item_var, result);
            }
          }
        } else {
          result = cons(object, result);
        }
        if ((NIL == subs_tooP)) {
          return result;
        }
      }
      if (object.isCons()) {
        {
          SubLObject list = NIL;
          SubLObject sub = NIL;
          for (list = object, sub = list.first(); list.rest().isCons(); list = list.rest(), sub = list.first()) {
            result = tree_gather_internal(sub, predicate, test, key, subs_tooP, result);
          }
          result = tree_gather_internal(list.first(), predicate, test, key, subs_tooP, result);
          if ((NIL != list.rest())) {
            result = tree_gather_internal(list.rest(), predicate, test, key, subs_tooP, result);
          }
        }
      }
      return result;
    }
  }

  /** if a and b are in LIST, and (TEST (KEY a) (KEY b)) is true, don't include b in the result */
  @SubL(source = "cycl/list-utilities.lisp", position = 189291)
  public static final SubLObject delete_subsumed_items(SubLObject list, SubLObject test, SubLObject key) {
    if ((key == UNPROVIDED)) {
      key = Symbols.symbol_function(IDENTITY);
    }
    if ((NIL == list)) {
      return NIL;
    } else {
      return Errors
			.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9081");
    }
  }

  /** Return a list of all possible distinct ordered lists of the elements in ELEMENTS.
By convention, (permute-list NIL) -> NIL.
By convention, if TEST is NIL, the check for duplicates is skipped. */
  @SubL(source = "cycl/list-utilities.lisp", position = 193274)
  public static final SubLObject permute_list(SubLObject elements, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQUAL);
    }
    if ((NIL == elements)) {
      return NIL;
    }
    {
      SubLObject number_of_elements = Sequences.length(elements);
      SubLObject result = NIL;
      if ((NIL == test)) {
        {
          SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
          SubLObject permutation = NIL;
          for (permutation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permutation = cdolist_list_var.first()) {
            result = cons(permute(elements, permutation), result);
          }
        }
      } else if (number_of_elements.numL(FIVE_INTEGER)) {
        {
          SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
          SubLObject permutation = NIL;
          for (permutation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permutation = cdolist_list_var.first()) {
            {
              SubLObject item_var = permute(elements, permutation);
              if ((NIL == conses_high.member(item_var, result, test, Symbols.symbol_function(IDENTITY)))) {
                result = cons(item_var, result);
              }
            }
          }
        }
      } else {
        {
          SubLObject cdolist_list_var = all_permutations(Sequences.length(elements));
          SubLObject permutation = NIL;
          for (permutation = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), permutation = cdolist_list_var.first()) {
            result = cons(permute(elements, permutation), result);
          }
        }
        result = fast_delete_duplicates(result, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
      }
      return result;
    }
  }

  /** Given a list of elements, return all permutations of the elements
@note Assumes no two elements are equal with respect to TEST. */
  @SubL(source = "cycl/list-utilities.lisp", position = 194743)
  public static final SubLObject permute_list_int(SubLObject elements, SubLObject test) {
    if ((test == UNPROVIDED)) {
      test = Symbols.symbol_function(EQ);
    }
    if ((NIL == elements)) {
      return NIL;
    } else if (elements.isAtom()) {
      return list(elements);
    } else if ((NIL == elements.rest())) {
      return list(elements);
    } else if ((NIL == elements.rest().rest())) {
      return list(elements, Sequences.reverse(elements));
    } else {
      {
        SubLObject perms = NIL;
        SubLObject cdolist_list_var = elements;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          {
            SubLObject cdolist_list_var_34 = permute_list_int(Sequences.remove(elem, elements, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED);
            SubLObject perm = NIL;
            for (perm = cdolist_list_var_34.first(); (NIL != cdolist_list_var_34); cdolist_list_var_34 = cdolist_list_var_34.rest(), perm = cdolist_list_var_34.first()) {
              perms = cons(cons(elem, perm), perms);
            }
          }
        }
        return perms;
      }
    }
  }

  /** Returns all permutations of the numbers from 0 to N-1.
   By convention, (all-permutations 0) -> (NIL). */
  @SubL(source = "cycl/list-utilities.lisp", position = 195360)
  public static final SubLObject all_permutations(SubLObject n) {
    if (n.numE(ZERO_INTEGER)) {
      return list(NIL);
    } else {
      return permute_list_int(num_list(n, UNPROVIDED), UNPROVIDED);
    }
  }

  /** e.g. (permute '(a b c) '(2 0 1)) -> (c a b)
   By convention, (permute X NIL) -> X. */
  @SubL(source = "cycl/list-utilities.lisp", position = 196381)
  public static final SubLObject permute(SubLObject list, SubLObject permutation) {
    if ((NIL != permutation)) {
      {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = permutation;
        SubLObject elem = NIL;
        for (elem = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), elem = cdolist_list_var.first()) {
          result = cons(ConsesLow.nth(elem, list), result);
        }
        return Sequences.nreverse(result);
      }
    } else {
      return list;
    }
  }

  /** @param l; listp: a list of lists
   @param fun; fboundp: an optional function to build the product
   @param start; listp: an optional seed for building the product
   @param test; fboundp (binary function) or nil
   @returns list: the cartesian product of the elements of l */
  @SubL(source = "cycl/list-utilities.lisp", position = 202736)
  public static final SubLObject cartesian_product(SubLObject l, SubLObject fun, SubLObject start, SubLObject test) {
    if ((fun == UNPROVIDED)) {
      fun = Symbols.symbol_function($sym13$CONS);
    }
    if ((start == UNPROVIDED)) {
      start = NIL;
    }
    if ((test == UNPROVIDED)) {
      test = NIL;
    }
    {
      SubLObject accum = list(start);
      if ((NIL != Symbols.fboundp(test))) {
        {
          SubLObject cdolist_list_var = l;
          SubLObject this_one = NIL;
          for (this_one = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), this_one = cdolist_list_var.first()) {
            accum = Errors
					.handleMissingMethodError("This call was replaced for LarKC purposes. Originally a method was called. Refer to number 9053");
          }
        }
      } else {
        {
          SubLObject cdolist_list_var = l;
          SubLObject this_one = NIL;
          for (this_one = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), this_one = cdolist_list_var.first()) {
            accum = cartesian_helper(this_one, accum, fun);
          }
        }
      }
      return nmapcar(Symbols.symbol_function($sym37$REVERSE), accum);
    }
  }

  /** takes two lists and returns the cartesian product.  fun generally should be #'cons */
  @SubL(source = "cycl/list-utilities.lisp", position = 203625)
  public static final SubLObject cartesian_helper(SubLObject a, SubLObject b, SubLObject fun) {
    {
      SubLObject accum = NIL;
      SubLObject cdolist_list_var = b;
      SubLObject b_er = NIL;
      for (b_er = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), b_er = cdolist_list_var.first()) {
        {
          SubLObject cdolist_list_var_35 = a;
          SubLObject a_er = NIL;
          for (a_er = cdolist_list_var_35.first(); (NIL != cdolist_list_var_35); cdolist_list_var_35 = cdolist_list_var_35.rest(), a_er = cdolist_list_var_35.first()) {
            accum = cons(Functions.funcall(fun, a_er, b_er), accum);
          }
        }
      }
      return Sequences.nreverse(accum);
    }
  }

  /** @param PRED; unary function
   Returns T if: - OBJECT is a non-dotted list, and
                 - PRED returns non-nil when applied to any item in OBJECT
   Otherwise, returns NIL. */
  @SubL(source = "cycl/list-utilities.lisp", position = 205555)
  public static final SubLObject list_of_type_p(SubLObject pred, SubLObject object) {
    if ((NIL != non_dotted_list_p(object))) {
      {
        SubLObject cdolist_list_var = object;
        SubLObject subobject = NIL;
        for (subobject = cdolist_list_var.first(); (NIL != cdolist_list_var); cdolist_list_var = cdolist_list_var.rest(), subobject = cdolist_list_var.first()) {
          if ((NIL == Functions.funcall(pred, subobject))) {
            return NIL;
          }
        }
        return T;
      }
    } else {
      return NIL;
    }
  }

  public static final SubLObject declare_list_utilities_file() {
    declareFunction("sublisp_boolean", "BOOLEAN", 1, 0, false);
    //declareFunction("not_boolean", "NOT-BOOLEAN", 1, 0, false);
    declareFunction("not_eq", "NOT-EQ", 2, 0, false);
    //declareFunction("not_eql", "NOT-EQL", 2, 0, false);
    //declareFunction("not_equal", "NOT-EQUAL", 2, 0, false);
    //declareFunction("not_equalp", "NOT-EQUALP", 2, 0, false);
    //declareFunction("not_assoc", "NOT-ASSOC", 2, 2, false);
    //declareFunction("not_consp", "NOT-CONSP", 1, 0, false);
    //declareFunction("eq_and_not_eq", "EQ-AND-NOT-EQ", 2, 0, false);
    //declareFunction("bull", "BULL", 2, 0, false);
    //declareFunction("caadr", "CAADR", 1, 0, false);
    //declareFunction("caddr", "CADDR", 1, 0, false);
    declareFunction("cdddr", "CDDDR", 1, 0, false);
    //declareFunction("cadddr", "CADDDR", 1, 0, false);
    //declareFunction("cadadr", "CADADR", 1, 0, false);
    //declareFunction("cadar", "CADAR", 1, 0, false); new $cadar$UnaryFunction();
    //declareFunction("cdadr", "CDADR", 1, 0, false);
    //declareFunction("snoc", "SNOC", 2, 0, false);
    //declareFunction("list_rotate_left", "LIST-ROTATE-LEFT", 1, 0, false);
    //declareFunction("list_rotate_right", "LIST-ROTATE-RIGHT", 1, 0, false);
    declareFunction("proper_subsetp", "PROPER-SUBSETP", 2, 2, false);
    //declareFunction("proper_subsetp_pre_sorted", "PROPER-SUBSETP-PRE-SORTED", 2, 2, false);
    //declareFunction("nth_cycling", "NTH-CYCLING", 2, 2, false);
    //declareMacro("pop_setq", "POP-SETQ");
    //declareMacro("pop_bind", "POP-BIND");
    //declareMacro("push_max_length", "PUSH-MAX-LENGTH");
    //declareMacro("cdolist_multiple", "CDOLIST-MULTIPLE");
    //declareMacro("cdolist_multiple_numbered", "CDOLIST-MULTIPLE-NUMBERED");
    //declareMacro("csome_multiple", "CSOME-MULTIPLE");
    //declareMacro("cdolist_numbered", "CDOLIST-NUMBERED");
    //declareMacro("cdolist_backward", "CDOLIST-BACKWARD");
    //declareMacro("cdolist_backward_numbered", "CDOLIST-BACKWARD-NUMBERED");
    //declareMacro("csome_numbered", "CSOME-NUMBERED");
    //declareMacro("cdolist_cycling", "CDOLIST-CYCLING");
    //declareMacro("cdolist_cycling_complex", "CDOLIST-CYCLING-COMPLEX");
    //declareMacro("do_tree_leaves", "DO-TREE-LEAVES");
    //declareFunction("args_from_arg_list", "ARGS-FROM-ARG-LIST", 1, 0, false);
    declareFunction("lengthL", "LENGTH<", 2, 1, false);
    declareFunction("lengthLE", "LENGTH<=", 2, 1, false);
    declareFunction("lengthE", "LENGTH=", 2, 1, false);
    //declareFunction("lengthsE", "LENGTHS=", 2, 1, false);
    declareFunction("lengthG", "LENGTH>", 2, 1, false);
    declareFunction("lengthGE", "LENGTH>=", 2, 1, false);
    //declareFunction("zero_length_p", "ZERO-LENGTH-P", 1, 0, false);
    //declareFunction("same_length_p", "SAME-LENGTH-P", 2, 0, false);
    //declareFunction("same_lengths_p", "SAME-LENGTHS-P", 1, 0, false);
    //declareFunction("longer_p", "LONGER-P", 2, 0, false);
    declareFunction("greater_length_p", "GREATER-LENGTH-P", 2, 0, false);
    declareFunction("greater_or_same_length_p", "GREATER-OR-SAME-LENGTH-P", 2, 0, false);
    //declareFunction("shorter_p", "SHORTER-P", 2, 0, false);
    //declareFunction("lesser_length_p", "LESSER-LENGTH-P", 2, 0, false);
    //declareFunction("lesser_or_same_length_p", "LESSER-OR-SAME-LENGTH-P", 2, 0, false);
    //declareFunction("empty_list_p", "EMPTY-LIST-P", 1, 0, false);
    //declareFunction("non_empty_list_p", "NON-EMPTY-LIST-P", 1, 0, false);
    declareFunction("proper_list_p", "PROPER-LIST-P", 1, 0, false);
    declareFunction("dotted_list_p", "DOTTED-LIST-P", 1, 0, false); new $dotted_list_p$UnaryFunction();
    declareFunction("non_dotted_list_p", "NON-DOTTED-LIST-P", 1, 0, false);
    declareFunction("dotted_length", "DOTTED-LENGTH", 1, 0, false);
    //declareFunction("dotted_last", "DOTTED-LAST", 1, 0, false);
    //declareFunction("dotted_butlast", "DOTTED-BUTLAST", 1, 0, false);
    //declareFunction("undot", "UNDOT", 1, 0, false);
    //declareFunction("add_to_dotted_end", "ADD-TO-DOTTED-END", 2, 0, false);
    //declareFunction("nadd_to_dotted_end", "NADD-TO-DOTTED-END", 2, 0, false);
    //declareFunction("ndot_last", "NDOT-LAST", 1, 0, false);
    //declareFunction("dot_last", "DOT-LAST", 1, 0, false);
    //declareFunction("possible_dotted_list_to_dotted_list", "POSSIBLE-DOTTED-LIST-TO-DOTTED-LIST", 1, 1, false);
    //declareFunction("list_non_dotted_through_n_p", "LIST-NON-DOTTED-THROUGH-N-P", 2, 0, false);
    declareFunction("negated_test_func", "NEGATED-TEST-FUNC", 1, 0, false); new $negated_test_func$UnaryFunction();
    declareFunction("remove_if_not", "REMOVE-IF-NOT", 2, 4, false);
    declareFunction("delete_if_not", "DELETE-IF-NOT", 2, 4, false);
    //declareFunction("substitute_if_not", "SUBSTITUTE-IF-NOT", 3, 4, false);
    //declareFunction("nsubstitute_if_not", "NSUBSTITUTE-IF-NOT", 3, 4, false);
    declareFunction("find_if_not", "FIND-IF-NOT", 2, 3, false);
    //declareFunction("position_if_not", "POSITION-IF-NOT", 2, 3, false);
    //declareFunction("position_if_binary_lambda", "POSITION-IF-BINARY-LAMBDA", 1, 0, false);
    //declareFunction("position_if_binary", "POSITION-IF-BINARY", 3, 3, false);
    //declareFunction("position_from_end", "POSITION-FROM-END", 2, 4, false);
    //declareFunction("tree_positions", "TREE-POSITIONS", 2, 2, false);
    //declareFunction("tree_position_bfs", "TREE-POSITION-BFS", 2, 1, false);
    //declareFunction("tree_position_dfs", "TREE-POSITION-DFS", 2, 1, false);
    //declareFunction("list_position", "LIST-POSITION", 2, 2, false);
    //declareFunction("tree_position_p", "TREE-POSITION-P", 1, 0, false);
    //declareFunction("tree_nested_nths", "TREE-NESTED-NTHS", 2, 0, false);
    //declareFunction("tree_nths", "TREE-NTHS", 2, 0, false);
    //declareFunction("has_nested_nth_p", "HAS-NESTED-NTH-P", 2, 0, false);
    //declareFunction("get_nested_nth", "GET-NESTED-NTH", 2, 1, false);
    //declareFunction("replace_nested_nth", "REPLACE-NESTED-NTH", 3, 0, false);
    //declareFunction("nreplace_nested_nth", "NREPLACE-NESTED-NTH", 3, 0, false);
    //declareFunction("remove_nested_nth", "REMOVE-NESTED-NTH", 2, 0, false);
    //declareFunction("delete_nested_nth", "DELETE-NESTED-NTH", 2, 0, false);
    //declareFunction("delete_nested_nth_internal", "DELETE-NESTED-NTH-INTERNAL", 2, 0, false);
    //declareFunction("tree_positions_int", "TREE-POSITIONS-INT", 3, 1, false);
    //declareFunction("tree_positions_dfs", "TREE-POSITIONS-DFS", 2, 1, false);
    //declareFunction("tree_positions_bfs", "TREE-POSITIONS-BFS", 2, 1, false);
    //declareFunction("containing_subtrees", "CONTAINING-SUBTREES", 2, 0, false);
    //declareFunction("tree_positions_if_dfs", "TREE-POSITIONS-IF-DFS", 2, 1, false);
    //declareFunction("tree_positions_if_bfs", "TREE-POSITIONS-IF-BFS", 2, 1, false);
    //declareFunction("tree_positions_if_dfs_int", "TREE-POSITIONS-IF-DFS-INT", 2, 1, false);
    //declareFunction("tree_position_if_bfs", "TREE-POSITION-IF-BFS", 2, 1, false);
    //declareFunction("tree_position_if_dfs", "TREE-POSITION-IF-DFS", 2, 1, false);
    //declareFunction("count_if_not", "COUNT-IF-NOT", 2, 3, false);
    //declareFunction("subst_if_not", "SUBST-IF-NOT", 3, 1, false);
    //declareFunction("nsubst_if_not", "NSUBST-IF-NOT", 3, 1, false);
    //declareFunction("member_if_not", "MEMBER-IF-NOT", 2, 1, false);
    //declareFunction("assoc_if_not", "ASSOC-IF-NOT", 2, 0, false);
    //declareFunction("rassoc_if_not", "RASSOC-IF-NOT", 2, 0, false);
    //declareFunction("assoc_all", "ASSOC-ALL", 2, 1, false);
    //declareFunction("assoc_push", "ASSOC-PUSH", 3, 1, false);
    //declareFunction("assoc_pushnew", "ASSOC-PUSHNEW", 3, 1, false);
    //declareFunction("dotted_assoc_push", "DOTTED-ASSOC-PUSH", 3, 1, false);
    //declareFunction("assoc_equal", "ASSOC-EQUAL", 2, 0, false);
    //declareFunction("assoc_subsumedP", "ASSOC-SUBSUMED?", 3, 0, false);
    //declareFunction("alist_extend", "ALIST-EXTEND", 2, 0, false);
    //declareFunction("make_alist", "MAKE-ALIST", 1, 1, false);
    //declareFunction("make_alist_from_keys_and_values", "MAKE-ALIST-FROM-KEYS-AND-VALUES", 2, 0, false);
    //declareFunction("make_pair_list", "MAKE-PAIR-LIST", 2, 0, false);
    //declareFunction("make_paired_lists", "MAKE-PAIRED-LISTS", 1, 0, false);
    //declareFunction("first_safe_for_atoms", "FIRST-SAFE-FOR-ATOMS", 1, 0, false);
    //declareMacro("first_of", "FIRST-OF");
    declareFunction("recons", "RECONS", 3, 0, false);
    declareFunction("ncons", "NCONS", 3, 0, false);
    declareFunction("delete_first", "DELETE-FIRST", 2, 1, false);
    //declareFunction("remove_first", "REMOVE-FIRST", 2, 1, false);
    declareFunction("nmapcar", "NMAPCAR", 2, 0, false);
    declareFunction("mapappend", "MAPAPPEND", 2, 0, false);
    declareFunction("mapunion", "MAPUNION", 2, 1, false);
    declareFunction("mapnunion", "MAPNUNION", 2, 1, false);
    declareFunction("mapcar_product", "MAPCAR-PRODUCT", 3, 0, false);
    //declareFunction("mapcar_unique", "MAPCAR-UNIQUE", 2, 1, false);
    declareFunction("last1", "LAST1", 1, 0, false);
    //declareFunction("add_to_end", "ADD-TO-END", 2, 0, false);
    declareFunction("nadd_to_end", "NADD-TO-END", 2, 0, false);
    //declareFunction("adjoin_to_end", "ADJOIN-TO-END", 2, 1, false);
    //declareFunction("nadjoin_to_end", "NADJOIN-TO-END", 2, 1, false);
    //declareFunction("add_to_end_if", "ADD-TO-END-IF", 2, 0, false);
    //declareFunction("nadd_to_end_if", "NADD-TO-END-IF", 2, 0, false);
    //declareFunction("nth_from_end", "NTH-FROM-END", 2, 0, false);
    //declareFunction("remove_from_end", "REMOVE-FROM-END", 2, 1, false);
    //declareFunction("remove_objects_from_list", "REMOVE-OBJECTS-FROM-LIST", 2, 1, false);
    declareFunction("partition_list", "PARTITION-LIST", 2, 0, false);
    //declareFunction("npartition_list", "NPARTITION-LIST", 2, 0, false);
    //declareFunction("partition_list_by_equality", "PARTITION-LIST-BY-EQUALITY", 2, 2, false);
    //declareFunction("partition_list_n_ways", "PARTITION-LIST-N-WAYS", 2, 0, false);
    //declareFunction("randomly_partition_list_n_ways", "RANDOMLY-PARTITION-LIST-N-WAYS", 2, 0, false);
    //declareFunction("split_list", "SPLIT-LIST", 2, 0, false);
    //declareFunction("random_element", "RANDOM-ELEMENT", 1, 0, false);
    //declareFunction("random_aref", "RANDOM-AREF", 1, 0, false);
    //declareFunction("random_n", "RANDOM-N", 2, 0, false);
    //declareFunction("random_remove_n", "RANDOM-REMOVE-N", 2, 0, false);
    //declareFunction("random_delete", "RANDOM-DELETE", 1, 0, false);
    //declareFunction("randomize_list", "RANDOMIZE-LIST", 1, 0, false);
    //declareFunction("randomize_vector", "RANDOMIZE-VECTOR", 1, 0, false);
    //declareFunction("randomize_vector_int", "RANDOMIZE-VECTOR-INT", 3, 0, false);
    //declareFunction("random_compare", "RANDOM-COMPARE", 2, 0, false);
    //declareFunction("thirdL", "THIRD<", 2, 0, false);
    //declareFunction("find_all", "FIND-ALL", 2, 2, false);
    //declareFunction("find_all_if", "FIND-ALL-IF", 2, 1, false);
    declareFunction("find_all_if_not", "FIND-ALL-IF-NOT", 2, 1, false);
    //declareFunction("all_positions", "ALL-POSITIONS", 2, 3, false);
    declareFunction("only_one", "ONLY-ONE", 1, 0, false);
    //declareFunction("last_one", "LAST-ONE", 1, 0, false);
    //declareFunction("penultimate_one", "PENULTIMATE-ONE", 1, 0, false);
    //declareFunction("cons_if", "CONS-IF", 2, 0, false);
    //declareFunction("list_if", "LIST-IF", 1, 0, false);
    //declareFunction("adjoin_if", "ADJOIN-IF", 2, 1, false);
    declareFunction("flatten", "FLATTEN", 1, 0, false);
    //declareFunction("insert_between_each", "INSERT-BETWEEN-EACH", 2, 0, false);
    //declareFunction("safe_nth", "SAFE-NTH", 2, 0, false);
    //declareFunction("nths", "NTHS", 2, 0, false);
    //declareFunction("every_nth", "EVERY-NTH", 2, 0, false);
    declareFunction("first_n", "FIRST-N", 2, 0, false);
    //declareFunction("first_n_percent", "FIRST-N-PERCENT", 2, 0, false);
    //declareFunction("first_n_if", "FIRST-N-IF", 3, 1, false);
    //declareFunction("first_2", "FIRST-2", 1, 0, false);
    //declareFunction("first_10", "FIRST-10", 1, 0, false);
    //declareFunction("last_n", "LAST-N", 2, 0, false);
    //declareFunction("nth_chunk_of_k", "NTH-CHUNK-OF-K", 3, 0, false);
    //declareFunction("delete_nth", "DELETE-NTH", 2, 0, false);
    //declareFunction("remove_nth", "REMOVE-NTH", 2, 0, false);
    //declareFunction("remove_last", "REMOVE-LAST", 1, 0, false);
    //declareFunction("remove_nths", "REMOVE-NTHS", 2, 0, false);
    //declareFunction("nreplace_last", "NREPLACE-LAST", 2, 0, false);
    declareFunction("nreplace_nth", "NREPLACE-NTH", 3, 0, false);
    //declareFunction("find_and_replace", "FIND-AND-REPLACE", 3, 1, false);
    //declareFunction("find_and_nreplace", "FIND-AND-NREPLACE", 3, 1, false);
    //declareFunction("find_first_and_nreplace", "FIND-FIRST-AND-NREPLACE", 3, 1, false);
    //declareFunction("ncollapse_n_from_pos", "NCOLLAPSE-N-FROM-POS", 4, 0, false);
    //declareFunction("ninsert_by_position", "NINSERT-BY-POSITION", 3, 0, false);
    //declareFunction("ninsert_randomly", "NINSERT-RANDOMLY", 2, 0, false);
    //declareFunction("ninsert_somewhere_before_and_after", "NINSERT-SOMEWHERE-BEFORE-AND-AFTER", 3, 1, false);
    //declareFunction("ninsert_somewhere_before", "NINSERT-SOMEWHERE-BEFORE", 3, 0, false);
    //declareFunction("ninsert_somewhere_before_or_at", "NINSERT-SOMEWHERE-BEFORE-OR-AT", 3, 0, false);
    //declareFunction("ninsert_somewhere_after", "NINSERT-SOMEWHERE-AFTER", 3, 0, false);
    //declareFunction("move_nth_to_front", "MOVE-NTH-TO-FRONT", 2, 0, false);
    //declareFunction("move_nth_to_position", "MOVE-NTH-TO-POSITION", 3, 0, false);
    //declareFunction("nmove_to_front", "NMOVE-TO-FRONT", 2, 1, false);
    //declareFunction("move_to_front", "MOVE-TO-FRONT", 2, 1, false);
    //declareFunction("nmove_to_end", "NMOVE-TO-END", 2, 0, false);
    //declareFunction("move_to_end", "MOVE-TO-END", 2, 0, false);
    declareFunction("replace_nth", "REPLACE-NTH", 3, 0, false);
    //declareFunction("replace_last", "REPLACE-LAST", 2, 0, false);
    //declareFunction("remove_duplicates_from_end", "REMOVE-DUPLICATES-FROM-END", 1, 4, false);
    //declareFunction("remove_duplicates_from_start", "REMOVE-DUPLICATES-FROM-START", 1, 4, false);
    //declareFunction("delete_duplicates_from_end", "DELETE-DUPLICATES-FROM-END", 1, 4, false);
    //declareFunction("delete_duplicates_from_start", "DELETE-DUPLICATES-FROM-START", 1, 4, false);
    //declareFunction("remove_null", "REMOVE-NULL", 1, 4, false);
    //declareFunction("remove_from_end_duplicates_and_those_wXkey", "REMOVE-FROM-END-DUPLICATES-AND-THOSE-W/KEY", 2, 4, false);
    //declareFunction("skipping_positions", "SKIPPING-POSITIONS", 2, 0, false);
    declareFunction("num_list", "NUM-LIST", 1, 1, false);
    declareFunction("new_num_list", "NEW-NUM-LIST", 1, 1, false);
    declareFunction("verify_num_list", "VERIFY-NUM-LIST", 3, 0, false);
    //declareFunction("clear_num_list_cached", "CLEAR-NUM-LIST-CACHED", 0, 0, false);
    //declareFunction("remove_num_list_cached", "REMOVE-NUM-LIST-CACHED", 2, 0, false);
    declareFunction("num_list_cached_internal", "NUM-LIST-CACHED-INTERNAL", 2, 0, false);
    declareFunction("num_list_cached", "NUM-LIST-CACHED", 2, 0, false);
    declareFunction("numlist", "NUMLIST", 1, 1, false);
    //declareFunction("tree_ancestor", "TREE-ANCESTOR", 2, 1, false);
    declareFunction("member_eqP", "MEMBER-EQ?", 2, 0, false);
    declareFunction("member_equalP", "MEMBER-EQUAL?", 2, 0, false);
    //declareFunction("member_equalpP", "MEMBER-EQUALP?", 2, 0, false);
    //declareFunction("nmemberP", "NMEMBER?", 2, 1, false);
    //declareFunction("nmember_eqP", "NMEMBER-EQ?", 2, 0, false);
    //declareFunction("nmember_eqlP", "NMEMBER-EQL?", 2, 0, false);
    //declareFunction("nmember_equalP", "NMEMBER-EQUAL?", 2, 0, false);
    //declareFunction("nmember_equalpP", "NMEMBER-EQUALP?", 2, 0, false);
    //declareFunction("nmember_funcallP", "NMEMBER-FUNCALL?", 3, 0, false);
    //declareFunction("nmember_success", "NMEMBER-SUCCESS", 3, 0, false);
    //declareFunction("intersectP", "INTERSECT?", 2, 2, false);
    //declareFunction("intersect_sortedP", "INTERSECT-SORTED?", 2, 2, false);
    //declareFunction("which_intersect_element_sorted", "WHICH-INTERSECT-ELEMENT-SORTED", 2, 2, false);
    //declareFunction("sorted_subsetp", "SORTED-SUBSETP", 2, 3, false);
    //declareFunction("sortedP", "SORTED?", 1, 1, false);
    //declareFunction("occurs_onceP", "OCCURS-ONCE?", 2, 1, false);
    //declareFunction("not_only_elementP", "NOT-ONLY-ELEMENT?", 2, 1, false);
    //declareFunction("occurs_at_least_n_timesP", "OCCURS-AT-LEAST-N-TIMES?", 3, 1, false);
    //declareFunction("occurs_exactly_n_timesP", "OCCURS-EXACTLY-N-TIMES?", 3, 1, false);
    //declareFunction("occurs_at_most_n_timesP", "OCCURS-AT-MOST-N-TIMES?", 3, 1, false);
    declareFunction("singletonP", "SINGLETON?", 1, 0, false);
    declareFunction("doubletonP", "DOUBLETON?", 1, 0, false);
    declareFunction("tripleP", "TRIPLE?", 1, 0, false);
    //declareFunction("list_of_length_p", "LIST-OF-LENGTH-P", 2, 1, false);
    //declareFunction("list_of_doubletonP", "LIST-OF-DOUBLETON?", 1, 0, false);
    //declareFunction("exactly_one_distinct_memberP", "EXACTLY-ONE-DISTINCT-MEMBER?", 1, 1, false);
    declareFunction("duplicatesP", "DUPLICATES?", 1, 2, false);
    //declareFunction("equal_duplicatesP", "EQUAL-DUPLICATES?", 1, 1, false);
    declareFunction("duplicates", "DUPLICATES", 1, 2, false);
    //declareFunction("duplicate_memberP", "DUPLICATE-MEMBER?", 2, 1, false);
    //declareFunction("list_starts_with_repeating_sequenceP", "LIST-STARTS-WITH-REPEATING-SEQUENCE?", 1, 3, false);
    //declareFunction("update_repeating_sequence", "UPDATE-REPEATING-SEQUENCE", 8, 0, false);
    declareFunction("multisets_equalP", "MULTISETS-EQUAL?", 2, 1, false);
    declareFunction("sets_equalP", "SETS-EQUAL?", 2, 1, false);
    declareFunction("fast_sets_equalP", "FAST-SETS-EQUAL?", 2, 1, false);
    declareFunction("fast_subsetP", "FAST-SUBSET?", 2, 1, false);
    //declareFunction("fast_subset_equalP", "FAST-SUBSET-EQUAL?", 2, 0, false);
    //declareFunction("fast_supersetP", "FAST-SUPERSET?", 2, 1, false);
    //declareFunction("fast_superset_equalP", "FAST-SUPERSET-EQUAL?", 2, 0, false);
    //declareFunction("sets_equal_equalP", "SETS-EQUAL-EQUAL?", 2, 0, false);
    //declareFunction("subsetp_equalP", "SUBSETP-EQUAL?", 2, 1, false);
    //declareFunction("supersetp", "SUPERSETP", 2, 2, false);
    //declareFunction("set_differenceP", "SET-DIFFERENCE?", 2, 2, false);
    //declareFunction("tree_set_equalP", "TREE-SET-EQUAL?", 2, 0, false);
    //declareFunction("ordered_merge", "ORDERED-MERGE", 2, 2, false);
    declareFunction("ordered_union", "ORDERED-UNION", 2, 2, false);
    //declareFunction("union_all", "UNION-ALL", 1, 2, false);
    declareFunction("ordered_set_difference", "ORDERED-SET-DIFFERENCE", 2, 2, false);
    //declareFunction("hash_set_difference", "HASH-SET-DIFFERENCE", 2, 1, false);
    declareFunction("fast_set_difference", "FAST-SET-DIFFERENCE", 2, 1, false);
    //declareFunction("partial_order_sort", "PARTIAL-ORDER-SORT", 2, 1, false);
    //declareFunction("list2vector", "LIST2VECTOR", 1, 0, false);
    //declareFunction("vector2list", "VECTOR2LIST", 1, 0, false);
    //declareFunction("list_without_repetition_p", "LIST-WITHOUT-REPETITION-P", 1, 2, false);
    //declareFunction("sequence_elements", "SEQUENCE-ELEMENTS", 2, 0, false);
    //declareFunction("set_difference_forts", "SET-DIFFERENCE-FORTS", 2, 0, false);
    //declareFunction("ordered_intersection", "ORDERED-INTERSECTION", 2, 2, false);
    //declareFunction("intersect_all", "INTERSECT-ALL", 1, 2, false);
    //declareFunction("fast_intersect_all", "FAST-INTERSECT-ALL", 1, 2, false);
    //declareFunction("safe_pairlis", "SAFE-PAIRLIS", 2, 0, false);
    declareFunction("flip_alist", "FLIP-ALIST", 1, 0, false);
    declareFunction("flip_cons", "FLIP-CONS", 1, 0, false); new $flip_cons$UnaryFunction();
    //declareFunction("flip_doubleton", "FLIP-DOUBLETON", 1, 0, false);
    //declareFunction("substitute_sequence", "SUBSTITUTE-SEQUENCE", 3, 0, false);
    //declareFunction("substitute_sequence_1", "SUBSTITUTE-SEQUENCE-1", 4, 0, false);
    //declareFunction("compare_lists", "COMPARE-LISTS", 2, 2, false);
    //declareFunction("unique_difference_among_lists", "UNIQUE-DIFFERENCE-AMONG-LISTS", 1, 0, false);
    //declareFunction("unique_difference_between_lists", "UNIQUE-DIFFERENCE-BETWEEN-LISTS", 2, 0, false);
    //declareFunction("list_subst", "LIST-SUBST", 3, 1, false);
    declareFunction("self_evaluating_form_p", "SELF-EVALUATING-FORM-P", 1, 0, false);
    //declareFunction("quote_form_p", "QUOTE-FORM-P", 1, 0, false);
    //declareFunction("non_side_effecting_form_p", "NON-SIDE-EFFECTING-FORM-P", 1, 0, false);
    declareFunction("quotify", "QUOTIFY", 1, 0, false); new $quotify$UnaryFunction();
    //declareFunction("unquotify", "UNQUOTIFY", 1, 0, false);
    //declareFunction("sort_adjoin", "SORT-ADJOIN", 2, 3, false);
    //declareFunction("sorted_add_to_list", "SORTED-ADD-TO-LIST", 3, 1, false);
    declareFunction("splice_into_sorted_list", "SPLICE-INTO-SORTED-LIST", 3, 1, false);
    //declareFunction("safe_splice_into_sorted_list", "SAFE-SPLICE-INTO-SORTED-LIST", 3, 1, false);
    //declareFunction("element_precedes_specified_othersP", "ELEMENT-PRECEDES-SPECIFIED-OTHERS?", 3, 2, false);
    //declareFunction("function_arglist_max_args", "FUNCTION-ARGLIST-MAX-ARGS", 1, 0, false);
    //declareFunction("function_arglist_min_args", "FUNCTION-ARGLIST-MIN-ARGS", 1, 0, false);
    //declareFunction("remove_self_binds", "REMOVE-SELF-BINDS", 1, 1, false);
    //declareFunction("self_bindP", "SELF-BIND?", 1, 1, false);
    //declareFunction("bind_for_var", "BIND-FOR-VAR", 2, 2, false);
    //declareFunction("remove_bind", "REMOVE-BIND", 2, 2, false);
    //declareFunction("extract_bindings", "EXTRACT-BINDINGS", 2, 0, false);
    //declareFunction("car_is_el_varP", "CAR-IS-EL-VAR?", 1, 0, false);
    //declareFunction("extract_binding_strings", "EXTRACT-BINDING-STRINGS", 2, 0, false);
    declareFunction("tree_funcall_if", "TREE-FUNCALL-IF", 3, 1, false);
    //declareFunction("tree_find_all_if", "TREE-FIND-ALL-IF", 2, 1, false);
    //declareFunction("tree_remove_all_if", "TREE-REMOVE-ALL-IF", 2, 1, false);
    //declareFunction("nswap_tree", "NSWAP-TREE", 3, 2, false);
    //declareFunction("swap_tree", "SWAP-TREE", 3, 2, false);
    //declareFunction("tree_find_all_nested_if", "TREE-FIND-ALL-NESTED-IF", 2, 1, false);
    //declareFunction("tree_find_all_nested_if_int", "TREE-FIND-ALL-NESTED-IF-INT", 3, 0, false);
    //declareFunction("hash_delete_duplicates", "HASH-DELETE-DUPLICATES", 1, 4, false);
    //declareFunction("hash_delete_duplicates_int", "HASH-DELETE-DUPLICATES-INT", 5, 0, false);
    //declareFunction("hash_remove_duplicates", "HASH-REMOVE-DUPLICATES", 1, 4, false);
    //declareFunction("fast_delete_duplicates_hashtable", "FAST-DELETE-DUPLICATES-HASHTABLE", 1, 0, false);
    declareFunction("fast_delete_duplicates", "FAST-DELETE-DUPLICATES", 1, 5, false);
    //declareFunction("fast_remove_duplicates", "FAST-REMOVE-DUPLICATES", 1, 5, false);
    declareFunction("remove_duplicate_forts", "REMOVE-DUPLICATE-FORTS", 1, 0, false);
    declareFunction("delete_duplicate_forts", "DELETE-DUPLICATE-FORTS", 1, 0, false);
    //declareFunction("hash_unique_elements", "HASH-UNIQUE-ELEMENTS", 2, 0, false);
    //declareFunction("unique_elements", "UNIQUE-ELEMENTS", 1, 1, false);
    //declareFunction("remove_all_n_icates", "REMOVE-ALL-N-ICATES", 2, 1, false);
    //declareFunction("nsort_intersection", "NSORT-INTERSECTION", 2, 2, false);
    //declareFunction("intersect_sorted", "INTERSECT-SORTED", 2, 2, false);
    //declareFunction("nintersect_sorted", "NINTERSECT-SORTED", 2, 2, false);
    //declareFunction("nintersect_sorted_destroy_first_only", "NINTERSECT-SORTED-DESTROY-FIRST-ONLY", 2, 2, false);
    //declareFunction("nintersect_sorted_int", "NINTERSECT-SORTED-INT", 4, 0, false);
    //declareFunction("sort_intersection", "SORT-INTERSECTION", 2, 2, false);
    //declareFunction("union_sorted", "UNION-SORTED", 2, 2, false);
    //declareFunction("nunion_sorted", "NUNION-SORTED", 2, 2, false);
    //declareFunction("union_sorted_int", "UNION-SORTED-INT", 5, 0, false);
    //declareFunction("union_of_intersecting_sorted_lists", "UNION-OF-INTERSECTING-SORTED-LISTS", 1, 2, false);
    //declareFunction("union_of_intersecting_sorted_lists_recursive", "UNION-OF-INTERSECTING-SORTED-LISTS-RECURSIVE", 4, 0, false);
    declareFunction("delete_duplicates_sorted", "DELETE-DUPLICATES-SORTED", 1, 1, false);
    //declareFunction("remove_duplicates_sorted", "REMOVE-DUPLICATES-SORTED", 1, 1, false);
    //declareFunction("position_wrt", "POSITION-WRT", 3, 3, false);
    //declareFunction("difference_sorted", "DIFFERENCE-SORTED", 2, 2, false);
    declareFunction("alist_p", "ALIST-P", 1, 0, false);
    declareFunction("alist_lookup", "ALIST-LOOKUP", 2, 2, false);
    declareFunction("alist_lookup_without_values", "ALIST-LOOKUP-WITHOUT-VALUES", 2, 2, false);
    //declareFunction("alist_nlookup_without_values", "ALIST-NLOOKUP-WITHOUT-VALUES", 2, 2, false);
    //declareFunction("alist_nlookup_eq", "ALIST-NLOOKUP-EQ", 2, 1, false);
    //declareFunction("alist_nlookup_eql", "ALIST-NLOOKUP-EQL", 2, 1, false);
    //declareFunction("alist_nlookup_equal", "ALIST-NLOOKUP-EQUAL", 2, 1, false);
    //declareFunction("alist_nlookup_equalp", "ALIST-NLOOKUP-EQUALP", 2, 1, false);
    //declareFunction("alist_nlookup_funcall", "ALIST-NLOOKUP-FUNCALL", 3, 1, false);
    //declareFunction("alist_nlookup_success", "ALIST-NLOOKUP-SUCCESS", 4, 0, false);
    declareFunction("alist_has_keyP", "ALIST-HAS-KEY?", 2, 1, false);
    //declareFunction("alist_has_valueP", "ALIST-HAS-VALUE?", 2, 1, false);
    //declareFunction("alist_reverse_lookup", "ALIST-REVERSE-LOOKUP", 2, 2, false);
    //declareFunction("alist_reverse_lookup_without_values", "ALIST-REVERSE-LOOKUP-WITHOUT-VALUES", 2, 2, false);
    declareFunction("alist_enter", "ALIST-ENTER", 3, 1, false);
    declareFunction("alist_enter_without_values", "ALIST-ENTER-WITHOUT-VALUES", 3, 1, false);
    //declareFunction("alist_capacity_enter_without_values", "ALIST-CAPACITY-ENTER-WITHOUT-VALUES", 4, 1, false);
    //declareFunction("alist_promote", "ALIST-PROMOTE", 2, 1, false);
    declareFunction("alist_delete", "ALIST-DELETE", 2, 1, false);
    //declareFunction("alist_delete_without_values", "ALIST-DELETE-WITHOUT-VALUES", 2, 1, false);
    //declareFunction("alist_remove", "ALIST-REMOVE", 2, 1, false);
    //declareFunction("alist_remove_without_values", "ALIST-REMOVE-WITHOUT-VALUES", 2, 1, false);
    declareFunction("alist_push", "ALIST-PUSH", 3, 1, false);
    //declareFunction("alist_pushnew", "ALIST-PUSHNEW", 3, 2, false);
    //declareFunction("alist_remove_from_value", "ALIST-REMOVE-FROM-VALUE", 3, 2, false);
    //declareMacro("pushnew_onto_alist", "PUSHNEW-ONTO-ALIST");
    //declareMacro("push_onto_alist", "PUSH-ONTO-ALIST");
    //declareMacro("enter_into_alist", "ENTER-INTO-ALIST");
    declareFunction("alist_keys", "ALIST-KEYS", 1, 0, false);
    declareFunction("alist_values", "ALIST-VALUES", 1, 0, false);
    declareFunction("alist_optimize", "ALIST-OPTIMIZE", 2, 0, false);
    //declareFunction("alist_E", "ALIST-=", 2, 2, false);
    //declareFunction("alist_subsumesP", "ALIST-SUBSUMES?", 2, 2, false);
    declareFunction("alist_to_hash_table", "ALIST-TO-HASH-TABLE", 1, 1, false);
    declareFunction("alist_to_reverse_hash_table", "ALIST-TO-REVERSE-HASH-TABLE", 1, 1, false);
    //declareFunction("sort_alist_by_keys", "SORT-ALIST-BY-KEYS", 2, 0, false);
    //declareFunction("sort_alist_by_values", "SORT-ALIST-BY-VALUES", 2, 0, false);
    //declareFunction("property_list_p", "PROPERTY-LIST-P", 1, 0, false);
    //declareFunction("non_empty_property_list_p", "NON-EMPTY-PROPERTY-LIST-P", 1, 0, false);
    declareFunction("filter_plist", "FILTER-PLIST", 2, 0, false);
    //declareFunction("prune_plist", "PRUNE-PLIST", 1, 1, false);
    //declareFunction("plist_of_type_p", "PLIST-OF-TYPE-P", 2, 0, false);
    //declareFunction("plist_of_value_type_p", "PLIST-OF-VALUE-TYPE-P", 2, 0, false);
    //declareFunction("make_plist", "MAKE-PLIST", 2, 0, false);
    //declareMacro("plist_enter", "PLIST-ENTER");
    //declareFunction("plist_lookup", "PLIST-LOOKUP", 2, 1, false);
    //declareMacro("plist_increment", "PLIST-INCREMENT");
    //declareMacro("plist_push", "PLIST-PUSH");
    //declareFunction("alist_to_plist", "ALIST-TO-PLIST", 1, 0, false);
    //declareFunction("plist_to_alist", "PLIST-TO-ALIST", 1, 0, false);
    declareFunction("nmerge_plist", "NMERGE-PLIST", 2, 0, false);
    declareFunction("merge_plist", "MERGE-PLIST", 2, 0, false);
    //declareFunction("sort_plist_by_properties", "SORT-PLIST-BY-PROPERTIES", 2, 0, false);
    //declareFunction("sort_plist_via_position", "SORT-PLIST-VIA-POSITION", 2, 1, false);
    //declareFunction("indicator_presentP", "INDICATOR-PRESENT?", 2, 0, false);
    //declareFunction("plist_has_keyP", "PLIST-HAS-KEY?", 2, 0, false);
    //declareFunction("member_plist_key_p", "MEMBER-PLIST-KEY-P", 2, 0, false);
    //declareFunction("non_nil_plist_valueP", "NON-NIL-PLIST-VALUE?", 2, 0, false);
    //declareFunction("get_property_with_defaults", "GET-PROPERTY-WITH-DEFAULTS", 3, 1, false);
    //declareFunction("augment_plist_with_defaults", "AUGMENT-PLIST-WITH-DEFAULTS", 2, 0, false);
    //declareFunction("plist_restricted_to_indicatorsP", "PLIST-RESTRICTED-TO-INDICATORS?", 2, 0, false);
    //declareFunction("maybe_putf", "MAYBE-PUTF", 3, 0, false);
    //declareFunction("plist_properties", "PLIST-PROPERTIES", 1, 0, false);
    //declareFunction("plist_keys", "PLIST-KEYS", 1, 0, false);
    //declareFunction("plist_values", "PLIST-VALUES", 1, 0, false);
    //declareFunction("plist_restricted_to_indicators", "PLIST-RESTRICTED-TO-INDICATORS", 2, 0, false);
    //declareFunction("plist_except", "PLIST-EXCEPT", 2, 0, false);
    //declareFunction("plistlist_if_getf", "PLISTLIST-IF-GETF", 3, 1, false);
    //declareFunction("plistlist_sort", "PLISTLIST-SORT", 3, 0, false);
    //declareFunction("plistlist_sort_key", "PLISTLIST-SORT-KEY", 1, 0, false);
    //declareFunction("sub_plistP", "SUB-PLIST?", 2, 1, false);
    //declareFunction("slow_plists_equalP", "SLOW-PLISTS-EQUAL?", 2, 1, false);
    //declareFunction("format_item_list", "FORMAT-ITEM-LIST", 1, 0, false);
    //declareFunction("print_plist_readably", "PRINT-PLIST-READABLY", 1, 1, false);
    //declareFunction("pretty_print_plist", "PRETTY-PRINT-PLIST", 1, 1, false);
    //declareFunction("pretty_print_alist", "PRETTY-PRINT-ALIST", 1, 1, false);
    //declareFunction("print_list_of_lists_as_table", "PRINT-LIST-OF-LISTS-AS-TABLE", 1, 1, false);
    //declareFunction("print_list_as_delimited_line", "PRINT-LIST-AS-DELIMITED-LINE", 1, 2, false);
    declareFunction("any_in_list", "ANY-IN-LIST", 2, 1, false);
    declareFunction("every_in_list", "EVERY-IN-LIST", 2, 1, false);
    //declareFunction("not_any_in_list", "NOT-ANY-IN-LIST", 2, 1, false);
    //declareFunction("not_every_in_list", "NOT-EVERY-IN-LIST", 2, 1, false);
    //declareFunction("plist_difference", "PLIST-DIFFERENCE", 2, 1, false);
    //declareFunction("list_subseq_subst_combos", "LIST-SUBSEQ-SUBST-COMBOS", 2, 0, false);
    //declareFunction("list_subseq_subst_combos_internal", "LIST-SUBSEQ-SUBST-COMBOS-INTERNAL", 3, 0, false);
    //declareFunction("greedy_list_subseq_subst", "GREEDY-LIST-SUBSEQ-SUBST", 2, 0, false);
    //declareFunction("greedy_list_subseq_subst_internal", "GREEDY-LIST-SUBSEQ-SUBST-INTERNAL", 3, 0, false);
    declareFunction("extremal", "EXTREMAL", 2, 1, false);
    //declareFunction("extremals", "EXTREMALS", 2, 1, false);
    //declareFunction("nth_rank_items", "NTH-RANK-ITEMS", 2, 2, false);
    //declareFunction("rerank", "RERANK", 2, 3, false);
    //declareFunction("powerset", "POWERSET", 1, 0, false);
    //declareFunction("subsets_of_size", "SUBSETS-OF-SIZE", 2, 0, false);
    //declareFunction("subsets_of_size_int", "SUBSETS-OF-SIZE-INT", 2, 0, false);
    declareFunction("position_L", "POSITION-<", 3, 2, false);
    declareFunction("sort_via_position", "SORT-VIA-POSITION", 2, 2, false);
    declareFunction("stable_sort_via_position", "STABLE-SORT-VIA-POSITION", 2, 2, false);
    declareFunction("sort_via_position_earlier", "SORT-VIA-POSITION-EARLIER", 2, 0, false); new $sort_via_position_earlier$BinaryFunction();
    //declareFunction("sort_via_test", "SORT-VIA-TEST", 2, 1, false);
    //declareFunction("stable_sort_via_test", "STABLE-SORT-VIA-TEST", 2, 1, false);
    //declareFunction("sort_via_test_earlier", "SORT-VIA-TEST-EARLIER", 2, 0, false);
    //declareFunction("sort_L", "SORT-<", 1, 1, false);
    //declareFunction("sort_G", "SORT->", 1, 1, false);
    //declareFunction("safe_sort_L", "SAFE-SORT-<", 1, 1, false);
    //declareFunction("safe_sort_G", "SAFE-SORT->", 1, 1, false);
    //declareFunction("sets_of_sets_L", "SETS-OF-SETS-<", 2, 1, false);
    //declareFunction("sets_L", "SETS-<", 2, 1, false);
    //declareFunction("set_L", "SET-<", 2, 1, false);
    //declareFunction("list_structure", "LIST-STRUCTURE", 1, 1, false);
    //declareFunction("list_structure_min", "LIST-STRUCTURE-MIN", 1, 0, false);
    //declareFunction("list_structure_L", "LIST-STRUCTURE-<", 2, 0, false);
    //declareFunction("tree_min", "TREE-MIN", 1, 0, false);
    //declareFunction("safe_tree_L", "SAFE-TREE-<", 2, 0, false);
    //declareFunction("safe_L", "SAFE-<", 2, 0, false);
    //declareFunction("safe_G", "SAFE->", 2, 0, false);
    //declareFunction("safe_GE", "SAFE->=", 2, 0, false);
    //declareFunction("safe_LE", "SAFE-<=", 2, 0, false);
    //declareFunction("safe_max", "SAFE-MAX", 1, 1, false);
    //declareFunction("safe_difference", "SAFE-DIFFERENCE", 2, 0, false);
    //declareFunction("safe_quotient", "SAFE-QUOTIENT", 2, 0, false);
    //declareFunction("safe_product", "SAFE-PRODUCT", 2, 0, false);
    //declareFunction("safe_sum", "SAFE-SUM", 2, 0, false);
    declareFunction("safe_E", "SAFE-=", 2, 0, false);
    //declareFunction("equalE", "EQUAL=", 2, 0, false);
    //declareFunction("tree_L", "TREE-<", 2, 2, false);
    //declareFunction("tree_lt_intP", "TREE-LT-INT?", 4, 0, false);
    declareFunction("parametrized_median", "PARAMETRIZED-MEDIAN", 2, 0, false);
    //declareFunction("shortest", "SHORTEST", 1, 0, false);
    //declareFunction("longest", "LONGEST", 1, 0, false);
    //declareFunction("cons_count", "CONS-COUNT", 1, 0, false);
    //declareFunction("tree_delete", "TREE-DELETE", 2, 2, false);
    //declareFunction("tree_map", "TREE-MAP", 2, 1, false);
    //declareFunction("tree_ntransform_if", "TREE-NTRANSFORM-IF", 3, 1, false);
    //declareFunction("tree_transform_if", "TREE-TRANSFORM-IF", 3, 1, false);
    //declareFunction("cons_tree_find", "CONS-TREE-FIND", 2, 2, false);
    declareFunction("tree_find", "TREE-FIND", 2, 2, false);
    declareFunction("simple_tree_findP", "SIMPLE-TREE-FIND?", 2, 0, false);
    declareFunction("simple_tree_find_via_equalP", "SIMPLE-TREE-FIND-VIA-EQUAL?", 2, 0, false);
    declareFunction("tree_find_any", "TREE-FIND-ANY", 2, 2, false);
    declareFunction("cons_tree_find_if", "CONS-TREE-FIND-IF", 2, 1, false);
    declareFunction("tree_find_if", "TREE-FIND-IF", 2, 1, false);
    //declareFunction("cons_tree_count", "CONS-TREE-COUNT", 2, 2, false);
    //declareFunction("tree_count", "TREE-COUNT", 2, 2, false);
    //declareFunction("tree_countG", "TREE-COUNT>", 3, 2, false);
    //declareFunction("tree_countGE", "TREE-COUNT>=", 3, 2, false);
    //declareFunction("tree_countL", "TREE-COUNT<", 3, 2, false);
    //declareFunction("tree_countLE", "TREE-COUNT<=", 3, 2, false);
    //declareFunction("tree_countE", "TREE-COUNT=", 3, 2, false);
    //declareFunction("tree_count_internal", "TREE-COUNT-INTERNAL", 5, 1, false);
    //declareFunction("simple_tree_count", "SIMPLE-TREE-COUNT", 2, 0, false);
    //declareFunction("simple_tree_count_recursive", "SIMPLE-TREE-COUNT-RECURSIVE", 3, 0, false);
    //declareFunction("cons_tree_count_if", "CONS-TREE-COUNT-IF", 2, 1, false);
    declareFunction("tree_count_if", "TREE-COUNT-IF", 2, 1, false);
    //declareFunction("tree_count_if_unique", "TREE-COUNT-IF-UNIQUE", 2, 1, false);
    //declareFunction("cons_tree_gather", "CONS-TREE-GATHER", 2, 3, false);
    declareFunction("tree_gather", "TREE-GATHER", 2, 3, false);
    declareFunction("tree_gather_internal", "TREE-GATHER-INTERNAL", 6, 0, false);
    //declareFunction("tree_gather_ordered", "TREE-GATHER-ORDERED", 2, 2, false);
    //declareFunction("tree_gather_ordered_subs", "TREE-GATHER-ORDERED-SUBS", 3, 0, false);
    //declareFunction("tree_gather_ordered_no_subs", "TREE-GATHER-ORDERED-NO-SUBS", 3, 0, false);
    //declareFunction("tree_substitute", "TREE-SUBSTITUTE", 3, 0, false);
    //declareFunction("tree_substitute_using_dictionary", "TREE-SUBSTITUTE-USING-DICTIONARY", 2, 0, false);
    //declareFunction("tree_splice", "TREE-SPLICE", 3, 0, false);
    //declareFunction("tree_gather_transformations", "TREE-GATHER-TRANSFORMATIONS", 3, 2, false);
    //declareFunction("remove_if_doesnt_include", "REMOVE-IF-DOESNT-INCLUDE", 2, 0, false);
    declareFunction("delete_subsumed_items", "DELETE-SUBSUMED-ITEMS", 2, 1, false);
    //declareFunction("delete_subsumed_items_internal", "DELETE-SUBSUMED-ITEMS-INTERNAL", 3, 0, false);
    //declareFunction("subsumedP", "SUBSUMED?", 4, 0, false);
    //declareFunction("subsumesP", "SUBSUMES?", 4, 0, false);
    //declareFunction("subsumesP_internal", "SUBSUMES?-INTERNAL", 4, 0, false);
    //declareFunction("remove_subsumed_items", "REMOVE-SUBSUMED-ITEMS", 2, 1, false);
    //declareFunction("cross_products", "CROSS-PRODUCTS", 1, 0, false);
    //declareFunction("map_pairs", "MAP-PAIRS", 3, 0, false);
    //declareFunction("fn_with_each", "FN-WITH-EACH", 3, 0, false);
    //declareFunction("indexed_products", "INDEXED-PRODUCTS", 1, 0, false);
    //declareFunction("explicate_permutations", "EXPLICATE-PERMUTATIONS", 1, 1, false);
    //declareFunction("untranslate_elements_from_tagged_sets", "UNTRANSLATE-ELEMENTS-FROM-TAGGED-SETS", 2, 1, false);
    //declareFunction("translate_elements_to_tagged_sets", "TRANSLATE-ELEMENTS-TO-TAGGED-SETS", 2, 0, false);
    declareFunction("permute_list", "PERMUTE-LIST", 1, 1, false);
    declareFunction("permute_list_int", "PERMUTE-LIST-INT", 1, 1, false);
    declareFunction("all_permutations", "ALL-PERMUTATIONS", 1, 0, false);
    //declareFunction("nsublis_permute", "NSUBLIS-PERMUTE", 3, 0, false);
    //declareFunction("sublis_permute", "SUBLIS-PERMUTE", 3, 0, false);
    declareFunction("permute", "PERMUTE", 2, 0, false);
    //declareFunction("random_permutation", "RANDOM-PERMUTATION", 1, 0, false);
    //declareFunction("choose_n_between", "CHOOSE-N-BETWEEN", 2, 0, false);
    //declareFunction("trigram_transform", "TRIGRAM-TRANSFORM", 2, 2, false);
    //declareFunction("chunk", "CHUNK", 2, 0, false);
    //declareFunction("get_arglist", "GET-ARGLIST", 1, 0, false);
    //declareFunction("get_documentation", "GET-DOCUMENTATION", 1, 0, false);
    //declareFunction("push_on_car", "PUSH-ON-CAR", 2, 0, false);
    //declareFunction("pop_and_reverse_car_and_push_on_cadr", "POP-AND-REVERSE-CAR-AND-PUSH-ON-CADR", 1, 0, false);
    declareFunction("cartesian_product", "CARTESIAN-PRODUCT", 1, 3, false);
    declareFunction("cartesian_helper", "CARTESIAN-HELPER", 3, 0, false);
    //declareFunction("cartesian_helper_with_test", "CARTESIAN-HELPER-WITH-TEST", 4, 0, false);
    //declareFunction("pick_two", "PICK-TWO", 1, 0, false);
    //declareMacro("mapexp", "MAPEXP");
    //declareFunction("recursive_member", "RECURSIVE-MEMBER", 2, 1, false);
    declareFunction("list_of_type_p", "LIST-OF-TYPE-P", 2, 0, false);
    //declareFunction("non_empty_list_of_type_p", "NON-EMPTY-LIST-OF-TYPE-P", 2, 0, false);
    //declareFunction("list_of_list_p", "LIST-OF-LIST-P", 1, 0, false);
    //declareFunction("list_of_keyword_p", "LIST-OF-KEYWORD-P", 1, 0, false);
    //declareFunction("string_list_p", "STRING-LIST-P", 1, 0, false);
    //declareFunction("symbol_list_p", "SYMBOL-LIST-P", 1, 0, false);
    //declareFunction("function_symbol_list_p", "FUNCTION-SYMBOL-LIST-P", 1, 0, false);
    //declareFunction("form_with_operator_p", "FORM-WITH-OPERATOR-P", 2, 0, false);
    //declareFunction("verify_operator", "VERIFY-OPERATOR", 2, 0, false);
    //declareFunction("verify_form_with_operator", "VERIFY-FORM-WITH-OPERATOR", 2, 0, false);
    //declareFunction("functor_in_expression_p", "FUNCTOR-IN-EXPRESSION-P", 2, 0, false);
    //declareFunction("functor_in_body_p", "FUNCTOR-IN-BODY-P", 2, 0, false);
    //declareFunction("variable_value_used_in_body_p", "VARIABLE-VALUE-USED-IN-BODY-P", 2, 0, false);
    //declareFunction("variable_value_used_in_expression_p", "VARIABLE-VALUE-USED-IN-EXPRESSION-P", 2, 0, false);
    //declareFunction("object_in_expression_p", "OBJECT-IN-EXPRESSION-P", 2, 0, false);
    //declareFunction("parse_to_list_of_strings", "PARSE-TO-LIST-OF-STRINGS", 1, 2, false);
    //declareFunction("tree_substitute_by_association", "TREE-SUBSTITUTE-BY-ASSOCIATION", 2, 3, false);
    //declareFunction("safe_read_delimited_list", "SAFE-READ-DELIMITED-LIST", 1, 2, false);
    //declareFunction("multi_sublis", "MULTI-SUBLIS", 2, 2, false);
    //declareFunction("multi_assoc", "MULTI-ASSOC", 2, 2, false);
    //declareFunction("valid_and_conformant_alist_p", "VALID-AND-CONFORMANT-ALIST-P", 1, 2, false);
    //declareFunction("histogram", "HISTOGRAM", 1, 3, false);
    //declareFunction("histogram_as_plist", "HISTOGRAM-AS-PLIST", 1, 3, false);
    //declareFunction("pretty_print_histogram", "PRETTY-PRINT-HISTOGRAM", 1, 0, false);
    //declareFunction("n_within", "N-WITHIN", 3, 0, false);
    //declareFunction("middle_sublist", "MIDDLE-SUBLIST", 2, 0, false);
    //declareFunction("categorize_list_elements", "CATEGORIZE-LIST-ELEMENTS", 2, 1, false);
    //declareFunction("rank_tuples", "RANK-TUPLES", 1, 0, false);
    //declareFunction("collate", "COLLATE", 1, 0, false);
    //declareFunction("list_with_first_p", "LIST-WITH-FIRST-P", 2, 0, false);
    return NIL;
  }

  public static final SubLObject init_list_utilities_file() {
    $magic_hashing_cutoff$ = defparameter("*MAGIC-HASHING-CUTOFF*", $int0$80);
    $negated_test_func$ = defparameter("*NEGATED-TEST-FUNC*", NIL);
    $position_if_binary_lambda_func$ = defparameter("*POSITION-IF-BINARY-LAMBDA-FUNC*", NIL);
    $position_if_binary_lambda_arg2$ = defparameter("*POSITION-IF-BINARY-LAMBDA-ARG2*", NIL);
    $num_list_cached_caching_state$ = deflexical("*NUM-LIST-CACHED-CACHING-STATE*", NIL);
    $remove_duplicates_eq_table$ = deflexical("*REMOVE-DUPLICATES-EQ-TABLE*", Hashtables.make_hash_table($int124$500, Symbols.symbol_function(EQ), UNPROVIDED));
    $remove_duplicates_eql_table$ = deflexical("*REMOVE-DUPLICATES-EQL-TABLE*", Hashtables.make_hash_table($int124$500, Symbols.symbol_function(EQL), UNPROVIDED));
    $remove_duplicates_equal_table$ = deflexical("*REMOVE-DUPLICATES-EQUAL-TABLE*", Hashtables.make_hash_table($int124$500, Symbols.symbol_function(EQUAL), UNPROVIDED));
    $remove_duplicates_equalp_table$ = deflexical("*REMOVE-DUPLICATES-EQUALP-TABLE*", Hashtables.make_hash_table($int124$500, Symbols.symbol_function(EQUALP), UNPROVIDED));
    $remove_duplicates_eq_table_lock$ = deflexical("*REMOVE-DUPLICATES-EQ-TABLE-LOCK*", Locks.make_lock($str125$remove_duplicates_eq_table_lock));
    $remove_duplicates_eql_table_lock$ = deflexical("*REMOVE-DUPLICATES-EQL-TABLE-LOCK*", Locks.make_lock($str126$remove_duplicates_eql_table_lock));
    $remove_duplicates_equal_table_lock$ = deflexical("*REMOVE-DUPLICATES-EQUAL-TABLE-LOCK*", Locks.make_lock($str127$remove_duplicates_equal_table_loc));
    $remove_duplicates_equalp_table_lock$ = deflexical("*REMOVE-DUPLICATES-EQUALP-TABLE-LOCK*", Locks.make_lock($str128$remove_duplicates_equalp_table_lo));
    $plistlist_sort_indicator$ = defparameter("*PLISTLIST-SORT-INDICATOR*", NIL);
    $subseq_subst_recursive_answers$ = defparameter("*SUBSEQ-SUBST-RECURSIVE-ANSWERS*", NIL);
    $sort_via_position_guide$ = defparameter("*SORT-VIA-POSITION-GUIDE*", NIL);
    $sort_via_position_test$ = defparameter("*SORT-VIA-POSITION-TEST*", NIL);
    $sort_via_test_function$ = defparameter("*SORT-VIA-TEST-FUNCTION*", NIL);
    return NIL;
  }

  public static final SubLObject setup_list_utilities_file() {
        memoization_state.note_globally_cached_function($sym93$NUM_LIST_CACHED);
    //generic_testing.define_test_case_table_int($sym110$SAFE_SPLICE_INTO_SORTED_LIST, list(new SubLObject[] {$kw111$TEST, Symbols.symbol_function(EQUAL), $kw112$OWNER, NIL, $kw113$CLASSES, NIL, $kw114$KB, $kw115$TINY, $kw116$WORKING_, T}), $list117);
    access_macros.define_obsolete_register($sym183$GET_ARGLIST, $list184);
    return NIL;
  }

  //// Internal Constants

  public static final SubLInteger $int0$80 = makeInteger(80);
  public static final SubLString $str1$nth_cycling__width_must_be_greate = makeString("nth-cycling: width must be greater than zero");
  public static final SubLString $str2$nth_cycling__width_must_be_less_t = makeString("nth-cycling: width must be less than or equal to list length");
  public static final SubLString $str3$nth_cycling__width_overruns_offse = makeString("nth-cycling: width overruns offset");
  public static final SubLList $list4 = list(makeSymbol("VAR"), makeSymbol("PLACE"));
  public static final SubLSymbol $sym5$PROGN = makeSymbol("PROGN");
  public static final SubLSymbol $sym6$CSETQ = makeSymbol("CSETQ");
  public static final SubLSymbol $sym7$FIRST = makeSymbol("FIRST");
  public static final SubLSymbol $sym8$CPOP = makeSymbol("CPOP");
  public static final SubLList $list9 = list(list(makeSymbol("VAR"), makeSymbol("PLACE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym10$CLET = makeSymbol("CLET");
  public static final SubLList $list11 = list(makeSymbol("ITEM"), makeSymbol("PLACE"), makeSymbol("MAX-LENGTH"));
  public static final SubLSymbol $sym12$CSETF = makeSymbol("CSETF");
  public static final SubLSymbol $sym13$CONS = makeSymbol("CONS");
  public static final SubLSymbol $sym14$FIRST_N = makeSymbol("FIRST-N");
  public static final SubLSymbol $sym15$_ = makeSymbol("-");
  public static final SubLList $list16 = list(ONE_INTEGER);
  public static final SubLList $list17 = list(list(makeSymbol("&REST"), makeSymbol("VAR-LIST-FORMS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list18 = list(makeSymbol("VAR"), makeSymbol("LISTFORM"));
  public static final SubLSymbol $sym19$CDR = makeSymbol("CDR");
  public static final SubLSymbol $sym20$CAR = makeSymbol("CAR");
  public static final SubLSymbol $sym21$NULL = makeSymbol("NULL");
  public static final SubLSymbol $sym22$CDO = makeSymbol("CDO");
  public static final SubLSymbol $sym23$CAND = makeSymbol("CAND");
  public static final SubLList $list24 = list(list(makeSymbol("NUMBER-VAR"), makeSymbol("&REST"), makeSymbol("VAR-LIST-FORMS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list25 = list(ZERO_INTEGER);
  public static final SubLSymbol $sym26$CDOLIST_MULTIPLE = makeSymbol("CDOLIST-MULTIPLE");
  public static final SubLSymbol $sym27$CINC = makeSymbol("CINC");
  public static final SubLList $list28 = list(list(makeSymbol("ENDVAR"), makeSymbol("&REST"), makeSymbol("VAR-LIST-FORMS")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str29$Malformed_csome_multiple_____S_wa = makeString("Malformed csome-multiple -- ~S was not a variable");
  public static final SubLSymbol $sym30$PUNLESS = makeSymbol("PUNLESS");
  public static final SubLSymbol $sym31$COR = makeSymbol("COR");
  public static final SubLList $list32 = list(list(makeSymbol("ELEM-VAR"), makeSymbol("NUMBER-VAR"), makeSymbol("LISTFORM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym33$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLSymbol $sym34$_ = makeSymbol("+");
  public static final SubLList $list35 = list(list(makeSymbol("VAR"), makeSymbol("LISTFORM")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym36$CDOLIST = makeSymbol("CDOLIST");
  public static final SubLSymbol $sym37$REVERSE = makeSymbol("REVERSE");
  public static final SubLSymbol $sym38$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLSymbol $sym39$1_ = makeSymbol("1-");
  public static final SubLSymbol $sym40$LENGTH = makeSymbol("LENGTH");
  public static final SubLList $list41 = list(list(makeSymbol("ELEM-VAR"), makeSymbol("NUMBER-VAR"), makeSymbol("LISTFORM"), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym42$LIST_VAR = makeUninternedSymbol("LIST-VAR");
  public static final SubLSymbol $sym43$CDOLIST_CYCLING_COMPLEX = makeSymbol("CDOLIST-CYCLING-COMPLEX");
  public static final SubLList $list44 = list(list(makeSymbol("VAR-LIST-FORMS"), makeSymbol("&OPTIONAL"), list(makeSymbol("SECONDARY-LISTS"), NIL)), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLString $str45$COUNTER = makeString("COUNTER");
  public static final SubLString $str46$_orig = makeString("-orig");
  public static final SubLString $str47$_cdr = makeString("-cdr");
  public static final SubLSymbol $sym48$NTH_CYCLING = makeSymbol("NTH-CYCLING");
  public static final SubLList $list49 = list(list(makeSymbol("LEAF-VAR"), makeSymbol("TREE"), makeSymbol("&KEY"), list(makeSymbol("LIST-TYPE"), list(makeSymbol("QUOTE"), makeSymbol("LISTP"))), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLList $list50 = list(makeKeyword("LIST-TYPE"), makeKeyword("DONE"));
  public static final SubLSymbol $kw51$ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");
  public static final SubLSymbol $kw52$LIST_TYPE = makeKeyword("LIST-TYPE");
  public static final SubLSymbol $sym53$LISTP = makeSymbol("LISTP");
  public static final SubLSymbol $kw54$DONE = makeKeyword("DONE");
  public static final SubLSymbol $sym55$SUBTREE_LIST_VAR = makeUninternedSymbol("SUBTREE-LIST-VAR");
  public static final SubLSymbol $sym56$CURRENT_SUBTREE_VAR = makeUninternedSymbol("CURRENT-SUBTREE-VAR");
  public static final SubLSymbol $sym57$NODE_VAR = makeUninternedSymbol("NODE-VAR");
  public static final SubLSymbol $sym58$LIST = makeSymbol("LIST");
  public static final SubLSymbol $sym59$DO_LIST = makeSymbol("DO-LIST");
  public static final SubLSymbol $sym60$PIF = makeSymbol("PIF");
  public static final SubLSymbol $sym61$CPUSH = makeSymbol("CPUSH");
  public static final SubLSymbol $sym62$_OPTIONAL = makeSymbol("&OPTIONAL");
  public static final SubLSymbol $sym63$SEQUENCEP = makeSymbol("SEQUENCEP");
  public static final SubLString $str64$ = makeString("");
  public static final SubLSymbol $kw65$DOT_FOR_DOTTED_LIST = makeKeyword("DOT-FOR-DOTTED-LIST");
  public static final SubLSymbol $sym66$NEGATED_TEST_FUNC = makeSymbol("NEGATED-TEST-FUNC");
  public static final SubLSymbol $sym67$POSITION_IF_BINARY_LAMBDA = makeSymbol("POSITION-IF-BINARY-LAMBDA");
  public static final SubLSymbol $sym68$PROPER_LIST_P = makeSymbol("PROPER-LIST-P");
  public static final SubLSymbol $sym69$NON_DOTTED_LIST_P = makeSymbol("NON-DOTTED-LIST-P");
  public static final SubLSymbol $sym70$NON_NEGATIVE_INTEGER_P = makeSymbol("NON-NEGATIVE-INTEGER-P");
  public static final SubLSymbol $kw71$DELETED = makeKeyword("DELETED");
  public static final SubLList $list72 = list(NIL);
  public static final SubLSymbol $kw73$DUMMY = makeKeyword("DUMMY");
  public static final SubLSymbol $sym74$TREE_POSITION_DFS = makeSymbol("TREE-POSITION-DFS");
  public static final SubLSymbol $sym75$TREE_POSITION_BFS = makeSymbol("TREE-POSITION-BFS");
  public static final SubLSymbol $sym76$LESSER_LENGTH_P = makeSymbol("LESSER-LENGTH-P");
  public static final SubLList $list77 = cons(makeSymbol("KEY"), makeSymbol("VALUE1"));
  public static final SubLString $str78$The_lists_of_keys_and_data_are_of = makeString("The lists of keys and data are of unequal length.");
  public static final SubLSymbol $sym79$DOUBLETON_ = makeSymbol("DOUBLETON?");
  public static final SubLList $list80 = list(makeSymbol("THING-ONE"), makeSymbol("THING-TWO"));
  public static final SubLString $str81$FIRST_OF_will_multiply_evaluate__ = makeString("FIRST-OF will multiply evaluate ~s");
  public static final SubLSymbol $sym82$FIF = makeSymbol("FIF");
  public static final SubLSymbol $sym83$FUNCTION_SPEC_P = makeSymbol("FUNCTION-SPEC-P");
  public static final SubLSymbol $sym84$POSITIVE_INTEGER_P = makeSymbol("POSITIVE-INTEGER-P");
  public static final SubLSymbol $sym85$NREVERSE = makeSymbol("NREVERSE");
  public static final SubLSymbol $sym86$VECTORP = makeSymbol("VECTORP");
  public static final SubLString $str87$_s_was_not_a_singleton = makeString("~s was not a singleton");
  public static final SubLSymbol $kw88$IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");
  public static final SubLSymbol $sym89$IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
  public static final SubLFloat $float90$0_01 = makeDouble(0.01);
  public static final SubLSymbol $sym91$INTEGERP = makeSymbol("INTEGERP");
  public static final SubLString $str92$Position_is_not_valid_for_the_siz = makeString("Position is not valid for the size of list.");
  public static final SubLSymbol $sym93$NUM_LIST_CACHED = makeSymbol("NUM-LIST-CACHED");
  public static final SubLSymbol $sym94$_NUM_LIST_CACHED_CACHING_STATE_ = makeSymbol("*NUM-LIST-CACHED-CACHING-STATE*");
  public static final SubLInteger $int95$100 = makeInteger(100);
  public static final SubLSymbol $kw96$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");
  public static final SubLSymbol $sym97$_ = makeSymbol("<");
  public static final SubLSymbol $sym98$__ = makeSymbol("<=");
  public static final SubLString $str99$Number_of_repetitions_must_be_gre = makeString("Number of repetitions must be greater than 1. Got ~S");
  public static final SubLSymbol $kw100$FAILED = makeKeyword("FAILED");
  public static final SubLSymbol $kw101$SUCCEEDED = makeKeyword("SUCCEEDED");
  public static final SubLSymbol $kw102$UPDATED = makeKeyword("UPDATED");
  public static final SubLSymbol $sym103$TREE_SET_EQUAL_ = makeSymbol("TREE-SET-EQUAL?");
  public static final SubLSymbol $sym104$FUNCTION_SYMBOL_P = makeSymbol("FUNCTION-SYMBOL-P");
  public static final SubLSymbol $sym105$FLIP_CONS = makeSymbol("FLIP-CONS");
  public static final SubLSymbol $sym106$QUOTE = makeSymbol("QUOTE");
  public static final SubLSymbol $sym107$STRING_ = makeSymbol("STRING=");
  public static final SubLSymbol $sym108$STRING_ = makeSymbol("STRING<");
  public static final SubLSymbol $sym109$SYMBOL_NAME = makeSymbol("SYMBOL-NAME");
  public static final SubLSymbol $sym110$SAFE_SPLICE_INTO_SORTED_LIST = makeSymbol("SAFE-SPLICE-INTO-SORTED-LIST");
  public static final SubLSymbol $kw111$TEST = makeKeyword("TEST");
  public static final SubLSymbol $kw112$OWNER = makeKeyword("OWNER");
  public static final SubLSymbol $kw113$CLASSES = makeKeyword("CLASSES");
  public static final SubLSymbol $kw114$KB = makeKeyword("KB");
  public static final SubLSymbol $kw115$TINY = makeKeyword("TINY");
  public static final SubLSymbol $kw116$WORKING_ = makeKeyword("WORKING?");
  public static final SubLList $list117 = list(list(list(ONE_INTEGER, NIL, makeSymbol("<")), list(ONE_INTEGER)), list(list(ONE_INTEGER, list(TWO_INTEGER), makeSymbol("<")), list(ONE_INTEGER, TWO_INTEGER)), list(list(TWO_INTEGER, list(ONE_INTEGER), makeSymbol("<")), list(ONE_INTEGER, TWO_INTEGER)), list(list(ONE_INTEGER, list(TWO_INTEGER, THREE_INTEGER), makeSymbol("<")), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(list(TWO_INTEGER, list(ONE_INTEGER, THREE_INTEGER), makeSymbol("<")), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(list(THREE_INTEGER, list(ONE_INTEGER, TWO_INTEGER), makeSymbol("<")), list(ONE_INTEGER, TWO_INTEGER, THREE_INTEGER)), list(list(makeString("xxx"), list(makeString("x"), makeString("xxxx")), makeSymbol("<"), makeSymbol("LENGTH")), list(makeString("x"), makeString("xxx"), makeString("xxxx"))));
  public static final SubLSymbol $sym118$_REST = makeSymbol("&REST");
  public static final SubLList $list119 = list(makeSymbol("&OPTIONAL"), makeSymbol("&REST"));
  public static final SubLList $list120 = cons(T, T);
  public static final SubLSymbol $sym121$CAR_IS_EL_VAR_ = makeSymbol("CAR-IS-EL-VAR?");
  public static final SubLString $str122$_s____s = makeString("~s = ~s");
  public static final SubLSymbol $kw123$TEMP = makeKeyword("TEMP");
  public static final SubLInteger $int124$500 = makeInteger(500);
  public static final SubLString $str125$remove_duplicates_eq_table_lock = makeString("remove-duplicates eq table lock");
  public static final SubLString $str126$remove_duplicates_eql_table_lock = makeString("remove-duplicates eql table lock");
  public static final SubLString $str127$remove_duplicates_equal_table_loc = makeString("remove-duplicates equal table lock");
  public static final SubLString $str128$remove_duplicates_equalp_table_lo = makeString("remove-duplicates equalp table lock");
  public static final SubLSymbol $sym129$HASH_TABLE_P = makeSymbol("HASH-TABLE-P");
  public static final SubLSymbol $kw130$NOT_UNIQUE = makeKeyword("NOT-UNIQUE");
  public static final SubLSymbol $kw131$UNIQUE = makeKeyword("UNIQUE");
  public static final SubLSymbol $sym132$TERM__ = makeSymbol("TERM-<");
  public static final SubLSymbol $sym133$SAFE__ = makeSymbol("SAFE-<");
  public static final SubLSymbol $sym134$ALIST_P = makeSymbol("ALIST-P");
  public static final SubLList $list135 = list(makeSymbol("ALIST-VAR"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("KEY-TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))), list(makeSymbol("VALUE-TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))));
  public static final SubLList $list136 = list(makeSymbol("FUNCTION"), EQL);
  public static final SubLSymbol $sym137$ALIST_PUSHNEW = makeSymbol("ALIST-PUSHNEW");
  public static final SubLList $list138 = list(makeSymbol("ALIST-VAR"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("KEY-TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))));
  public static final SubLSymbol $sym139$ALIST_PUSH = makeSymbol("ALIST-PUSH");
  public static final SubLList $list140 = list(makeSymbol("ALIST-VAR"), makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("QUOTE"), list(makeSymbol("FUNCTION"), EQL))));
  public static final SubLSymbol $sym141$ALIST_ENTER = makeSymbol("ALIST-ENTER");
  public static final SubLList $list142 = cons(makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLList $list143 = list(makeSymbol("PLIST"), makeSymbol("INDICATOR"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym144$PUTF = makeSymbol("PUTF");
  public static final SubLList $list145 = list(makeSymbol("PLIST"), makeSymbol("KEY"), makeSymbol("&KEY"), list(makeSymbol("INCREMENT"), ONE_INTEGER));
  public static final SubLList $list146 = list(makeKeyword("INCREMENT"));
  public static final SubLSymbol $kw147$INCREMENT = makeKeyword("INCREMENT");
  public static final SubLSymbol $sym148$PLIST_ENTER = makeSymbol("PLIST-ENTER");
  public static final SubLSymbol $sym149$PLIST_LOOKUP = makeSymbol("PLIST-LOOKUP");
  public static final SubLList $list150 = list(makeSymbol("PLIST"), makeSymbol("KEY"), makeSymbol("VALUE"));
  public static final SubLSymbol $sym151$PROPERTY_LIST_P = makeSymbol("PROPERTY-LIST-P");
  public static final SubLSymbol $kw152$NO_VALUE = makeKeyword("NO-VALUE");
  public static final SubLSymbol $sym153$PLISTLIST_SORT_KEY = makeSymbol("PLISTLIST-SORT-KEY");
  public static final SubLString $str154$_A_and__A = makeString("~A and ~A");
  public static final SubLSymbol $sym155$PRINC_TO_STRING = makeSymbol("PRINC-TO-STRING");
  public static final SubLString $str156$__ = makeString(", ");
  public static final SubLString $str157$__and_ = makeString(", and ");
  public static final SubLString $str158$_a_____a__ = makeString("~a -> ~a~%");
  public static final SubLSymbol $sym159$DOUBLE_FLOAT = makeSymbol("DOUBLE-FLOAT");
  public static final SubLSymbol $sym160$STR = makeSymbol("STR");
  public static final SubLString $str161$_a___4_2f__ = makeString("~a  ~4,2f~%");
  public static final SubLString $str162$_a___a__ = makeString("~a  ~a~%");
  public static final SubLSymbol $sym163$TO_STRING = makeSymbol("TO-STRING");
  public static final SubLString $str164$___ = makeString(" | ");
  public static final SubLList $list165 = list(makeSymbol("SUBST-INDEX"), makeSymbol("SUBST-LENGTH"), makeSymbol("SUBST-ITEM"));
  public static final SubLSymbol $sym166$PLUSP = makeSymbol("PLUSP");
  public static final SubLFloat $float167$0_5 = makeDouble(0.5);
  public static final SubLSymbol $sym168$SORT_VIA_POSITION_EARLIER = makeSymbol("SORT-VIA-POSITION-EARLIER");
  public static final SubLSymbol $sym169$SORT_VIA_TEST_EARLIER = makeSymbol("SORT-VIA-TEST-EARLIER");
  public static final SubLSymbol $sym170$_ = makeSymbol(">");
  public static final SubLSymbol $sym171$SAFE__ = makeSymbol("SAFE->");
  public static final SubLSymbol $sym172$SAFE_TREE__ = makeSymbol("SAFE-TREE-<");
  public static final SubLSymbol $sym173$SET__ = makeSymbol("SET-<");
  public static final SubLSymbol $sym174$NOT_CONSP = makeSymbol("NOT-CONSP");
  public static final SubLSymbol $sym175$LIST_STRUCTURE__ = makeSymbol("LIST-STRUCTURE-<");
  public static final SubLSymbol $sym176$FALSE = makeSymbol("FALSE");
  public static final SubLSymbol $sym177$_ = makeSymbol("=");
  public static final SubLSymbol $kw178$LESS = makeKeyword("LESS");
  public static final SubLSymbol $kw179$EQUAL = makeKeyword("EQUAL");
  public static final SubLSymbol $kw180$GREATER = makeKeyword("GREATER");
  public static final SubLSymbol $sym181$MAPCAR = makeSymbol("MAPCAR");
  public static final SubLList $list182 = listS(makeSymbol("ONE"), makeSymbol("TWO"), makeSymbol("THREE"), makeSymbol("REST"));
  public static final SubLSymbol $sym183$GET_ARGLIST = makeSymbol("GET-ARGLIST");
  public static final SubLList $list184 = list(makeSymbol("FUNCTION-SYMBOL-ARGLIST"));
  public static final SubLSymbol $kw185$DOCUMENTATION = makeKeyword("DOCUMENTATION");
  public static final SubLList $list186 = list(list(makeSymbol("RESULT"), makeSymbol("VAR"), makeSymbol("LIST")), makeSymbol("EXP"), makeSymbol("&BODY"), makeSymbol("BODY"));
  public static final SubLSymbol $sym187$KEYWORDP = makeSymbol("KEYWORDP");
  public static final SubLSymbol $sym188$SYMBOLP = makeSymbol("SYMBOLP");
  public static final SubLString $str189$Expected__S__got__S = makeString("Expected ~S, got ~S");
  public static final SubLString $str190$_S_was_not_a_form_with_operator__ = makeString("~S was not a form with operator ~S");
  public static final SubLSymbol $sym191$ATOM = makeSymbol("ATOM");
  public static final SubLSymbol $sym192$ASSOC = makeSymbol("ASSOC");
  public static final SubLSymbol $sym193$STRINGP = makeSymbol("STRINGP");
  public static final SubLSymbol $sym194$CATCH_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
  public static final SubLSymbol $sym195$NEW_DICTIONARY = makeSymbol("NEW-DICTIONARY");
  public static final SubLList $list196 = list(new SubLObject[] {makeSymbol("FIRST"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("FIFTH"), makeSymbol("SIXTH"), makeSymbol("SEVENTH"), makeSymbol("EIGHTH"), makeSymbol("NINTH"), makeSymbol("TENTH")});

  //// Initializers

  @Override
  public void declareFunctions() {
    declare_list_utilities_file();
  }

  @Override
  public void initializeVariables() {
    init_list_utilities_file();
  }

  @Override
  public void runTopLevelForms() {
    setup_list_utilities_file();
  }

}
