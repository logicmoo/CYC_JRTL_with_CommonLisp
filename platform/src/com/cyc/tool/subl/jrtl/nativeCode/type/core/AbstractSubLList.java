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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import java.util.ArrayList;
import java.util.List;

//// External Imports

public  abstract class AbstractSubLList
        extends AbstractSubLSequence
        implements SubLList, SubLSequence, SubLObject {
  
  //// Constructors
  
  //// Public Area
  
  // Utilities
  
  /** Method created to avoid casting */
  public final SubLList toList() {
    return this;
  }
  
  public SubLObject caar() { return first().first(); }
  
  public SubLObject cdar() { return first().rest(); }
  
  public SubLObject cadr() { return get(1); }
  
  public SubLObject cddr() { return nthCdr(2); }
  
  public SubLObject caddr() { return get(2); }
  
  public SubLObject cdddr() { return nthCdr(3); }
  
  public SubLObject cadddr() { return get(3); }
  
  public SubLObject cddddr() { return nthCdr(4); }
  
  public SubLObject eval(final SubLEnvironment env) {
    Values.resetMultipleValues();
    SubLObject operatorSymbol = first();
    if (operatorSymbol.isSymbol()) {
      SubLOperator operator = operatorSymbol.toSymbol().getFunction();
      if (operator.isFunction()) {
        return operator.getFunc().evalViaApply(this.toCons(), env);
      }
      if (operator.isSpecial()) {
        final SubLFunction func = operator.toSpecialOperator().getEvaluationFunction();
        final BinaryFunction binFunc = func.getBinaryFunction();
        if (binFunc != null) {
          return binFunc.processItem(toCons(), env);
        }
        return func.apply(this.toCons(), env);
      }
      if (operator.isMacroOperator()) {
        return operator.toMacro().getMacroExpander().
          apply(this.asConsList().toCons(), env).eval(env); //@hack asConsList() call
      }
      Errors.error(operatorSymbol + " does not have a function value.");
    } else if (SubLInterpretedFunction.isPossiblyLambdaExpression(operatorSymbol, true)) {
      final SubLInterpretedFunction lambda = SubLOperatorFactory.makeInterpretedFunction(operatorSymbol.toCons(), env);
      return lambda.evalViaApply(this.toCons(), env);
    }
    throw new InvalidSubLExpressionException(operatorSymbol + " is not an operator.");
  }
  
  public static String LIST_TYPE_NAME = "LIST";
  
  public String toTypeName() {
    return LIST_TYPE_NAME;
  }
  
  public boolean addItem(Object obj) {
    Errors.unimplementedMethod("AbstractSubLList.add()");
    return false;
  }
  
  public void add(int param, Object obj) {
    Errors.unimplementedMethod("AbstractSubLList.add()");
  }
  
  public SubLList adjoin(SubLObject item) {
    Errors.unimplementedMethod("AbstractSubLList.adjoin()");
    return SubLNil.NIL;
  }
  
  public SubLList adjoin(SubLObject item, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.adjoin()");
    return SubLNil.NIL;
  }
  
  public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.adjoin()");
    return SubLNil.NIL;
  }
  
  public SubLList allElementsButLast(int howMany, boolean isDestructive) {
     Errors.unimplementedMethod("AbstractSubLList.allElementsButLast()");
    return SubLNil.NIL;
  }
  
  public SubLList append(SubLList list, boolean isReverse) {
    Errors.unimplementedMethod("AbstractSubLList.append()");
    return SubLNil.NIL;
  }
  
  public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
    Errors.unimplementedMethod("AbstractSubLList.concatenate()");
    return SubLNil.NIL;
  }
  
  public boolean contains(Object obj) {
    Errors.unimplementedMethod("AbstractSubLList.contains()");
    return false;
  }
  
  public boolean containsAll(java.util.Collection collection) {
    Errors.unimplementedMethod("AbstractSubLList.containsAll()");
    return false;
  }
  
  public SubLList copyList() {
    Errors.unimplementedMethod("AbstractSubLList.copyList()");
    return SubLNil.NIL;
  }
  
  public SubLList copyTree() {
    Errors.unimplementedMethod("AbstractSubLList.copyTree()");
    return SubLNil.NIL;
  }
  
  public SubLList intersection(SubLList item, boolean isDestructive) {
    Errors.unimplementedMethod("AbstractSubLList.intersection()");
    return SubLNil.NIL;
  }
  
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.intersection()");
    return SubLNil.NIL;
  }
  
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.intersection()");
    return SubLNil.NIL;
  }
  
  public boolean isSubList(SubLList sublist) {
    Errors.unimplementedMethod("AbstractSubLList.isSubList()");
    return false;
  }
  
  public boolean isSubSet(SubLList list) {
    Errors.unimplementedMethod("AbstractSubLList.isSubSet()");
    return false;
  }
  
  public int listLength() {
    Errors.unimplementedMethod("AbstractSubLList.listLength()");
    return -1;
  }
  
  public SubLList listPrefix(SubLList postFix) {
    Errors.unimplementedMethod("AbstractSubLList.listPrefix()");
    return SubLNil.NIL;
  }
  
  public final SubLList member(SubLObject item) {
    return member(item, EQL_TEST);
  }
  
  public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
    SubLObject currentItem = null;
    SubLList result = SubLNil.NIL;
    SubLListListIterator iter = null;
    Resourcer resourcer = Resourcer.getInstance();
    SubLList curAssoc;
    try {
      iter = resourcer.acquireSubLListListIterator(this);
      while (iter.hasNext()) {
        curAssoc = iter.nextSubLObject().toList();
        if (SubLNil.NIL != test.processItem(item, key.processItem(curAssoc.first()))) {
          result = curAssoc;
          break;
        }
      }
    } finally {
      resourcer.releaseSubLListListIterator(iter);
    }
    return result;
  }
  
  public SubLList memberIf(BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.memberIf()");
    return SubLNil.NIL;
  }
  
  public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.memberIf()");
    return SubLNil.NIL;
  }
  
  public SubLObject nthCdr(int index) {
    return Errors.unimplementedMethod("AbstractSubLList.nthCdr()");
  }
  
  public Object remove(int param) {
    return Errors.unimplementedMethod("AbstractSubLList.remove()");
  }
  
  public boolean remove(Object obj) {
    Errors.unimplementedMethod("AbstractSubLList.remove()");
    return false;
  }
  
  public boolean removeAll(java.util.Collection collection) {
    Errors.unimplementedMethod("AbstractSubLList.removeAll()");
    return false;
  }
  
  abstract public SubLObject get(int i);
  abstract public void set(int index, SubLObject item);
  
 
  
  public boolean retainAll(java.util.Collection collection) {
    Errors.unimplementedMethod("AbstractSubLList.retainAll()");
    return false;
  }
  
  public SubLList setDifference(SubLList item, boolean isDestructive) {
    Errors.unimplementedMethod("AbstractSubLList.setDifference()");
    return SubLNil.NIL;
  }
  
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.setDifference()");
    return SubLNil.NIL;
  }
  
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.setDifference()");
    return SubLNil.NIL;
  }
  
  public SubLObject setDottedElement(SubLObject dottedElement) {
    return Errors.unimplementedMethod("AbstractSubLList.setDottedElement()");
  }
  
  public SubLCons setNth(SubLObject item, int index) {
    Errors.unimplementedMethod("AbstractSubLList.setNth()");
    return null;
  }
  
  public SubLList setXor(SubLList item, boolean isDestructive) {
    Errors.unimplementedMethod("AbstractSubLList.setXor()");
    return SubLNil.NIL;
  }
  
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.setXor()");
    return SubLNil.NIL;
  }
  
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.setXor()");
    return SubLNil.NIL;
  }
  
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
    Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
    return SubLNil.NIL;
  }
  
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
    return SubLNil.NIL;
  }
  
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
    return SubLNil.NIL;
  }
  
  public SubLList treeEqual(SubLList tree1, SubLList tree2) {
    Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
    return SubLNil.NIL;
  }
  
  public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
    return SubLNil.NIL;
  }
  
  public SubLList union(SubLList item, boolean isDestructive) {
    Errors.unimplementedMethod("AbstractSubLList.union()");
    return SubLNil.NIL;
  }
  
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
    Errors.unimplementedMethod("AbstractSubLList.union()");
    return SubLNil.NIL;
  }
  
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
    Errors.unimplementedMethod("AbstractSubLList.union()");
    return SubLNil.NIL;
  }
  
  public boolean isProper() {
    return last(0) == SubLNil.NIL;
  }
  
  public SubLCons setFirst(SubLObject first) {
    Errors.unimplementedMethod("AbstractSubLList.setFirst()");
    return null;
  }
  
  public SubLCons setRest(SubLObject rest) {
    Errors.unimplementedMethod("AbstractSubLList.setRest()");
    return null;
  }
  
  public String toString() {
    if (PrintLow.shouldPrintAtCurrentLevel()) {
      final SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
      try {
        if (this == SubLNil.NIL) { return "NIL"; }
        SubLListListIterator iter = null;
        Resourcer resourcer = Resourcer.getInstance();
        try {
          final StringBuilder buf = new StringBuilder("(");
          final boolean checkLength = PrintLow.controlPrintLength();
          final int printLength = PrintLow.maxPrintLength();
          int counter = 0;
          boolean terminatedEarly = false;
          iter = resourcer.acquireSubLListListIterator(this);
          while (iter.hasNext() && (!iter.isNextImproperElement())) {
            buf.append(iter.next());
            if (checkLength) {
              counter++;
              if (counter >= printLength) {
                buf.append(" ... ");
                terminatedEarly = true;
                break;
              }
            }
            if (iter.hasNext()) { buf.append(" "); }
          }
          if (!terminatedEarly && iter.isNextImproperElement()) {
            buf.append(" . ").append(iter.getDottedElement());
          }
          buf.append(")");
          return buf.toString();
        } finally {
          resourcer.releaseSubLListListIterator(iter);
        }
      } finally {
        PrintLow.maybeDecreasePrintLevel(oldLevel);
      }
    } else {
      return "( # )";
    }
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      SubLListListIterator iter = null;
      Resourcer resourcer = Resourcer.getInstance();
      int hashCode = 0;
      try {
        int index = 0;
        iter = resourcer.acquireSubLListListIterator(this);
        while (iter.hasNext() && (!iter.isNextImproperElement()) && (index++ < MAX_HASH_LENGTH)) {
          hashCode ^= iter.nextSubLObject().hashCode(currentDepth+1);
          index++;
        }
        if (iter.isNextImproperElement()) {
          hashCode ^= iter.getDottedElement().hashCode(currentDepth+1);
        }
        return hashCode;
      } finally {
        resourcer.releaseSubLListListIterator(iter);
      }
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public boolean equal(SubLObject obj) {
    if (this == obj) { return true; }
    if (obj == null) { return false; }
    if (!obj.isList()) { return false; }
    SubLList otherCons = obj.toList();
    SubLListListIterator iter1 = null;
    SubLListListIterator iter2 = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter1 = resourcer.acquireSubLListListIterator(this);
      iter2 = resourcer.acquireSubLListListIterator(otherCons);
      while (iter1.hasNext() && (!iter1.isNextImproperElement())) {
        if ((!iter2.hasNext()) || (iter2.isNextImproperElement())) {
          return false;
        }
        if (!iter1.nextSubLObject().equal(iter2.nextSubLObject())) {
          return false;
        }
      }
      if (iter1.isNextImproperElement()) {
        if (iter2.isNextImproperElement()) {
          return iter1.getDottedElement().equal(iter2.getDottedElement());
        }
        return false;
      } else if (iter2.hasNext()) {
        // iter1 is prefix of iter2 case
        return false;
      }
      // they will be equal at this point
      return true;
    } finally {
      resourcer.releaseSubLListListIterator(iter1);
      resourcer.releaseSubLListListIterator(iter2);
    }
  }
  
  public boolean equalp(SubLObject obj) {
    if (this == obj) { return true; }
    if (obj == null) { return false; }
    if (!obj.isList()) { return false; }
    SubLList otherCons = obj.toList();
    SubLListListIterator iter1 = null;
    SubLListListIterator iter2 = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter1 = resourcer.acquireSubLListListIterator(this);
      iter2 = resourcer.acquireSubLListListIterator(otherCons);
      while (iter1.hasNext() && (!iter1.isNextImproperElement())) {
        if (!iter2.hasNext()) {
          return false;
        }
        if (!iter1.nextSubLObject().equalp(iter2.nextSubLObject())) {
          return false;
        }
      }
      if (iter1.isNextImproperElement()) {
        if (iter2.isNextImproperElement()) {
          return iter1.getDottedElement().equalp(iter2.getDottedElement());
        }
        return false;
      } else if (iter2.hasNext()) {
        // iter1 is prefix of iter2 case
        return false;
      }
      // they will be equalp at this point
      return true;
    } finally {
      resourcer.releaseSubLListListIterator(iter1);
      resourcer.releaseSubLListListIterator(iter2);
    }
  }
  
  public boolean equals(Object obj) {
    if (this == obj) { return true; }
    if (obj == null) { return false; }
    SubLObject sublObj = (SubLObject)obj;
    if (!sublObj.isList()) { return false; }
    SubLList otherCons = sublObj.toList();
    SubLListListIterator iter1 = null;
    SubLListListIterator iter2 = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      iter1 = resourcer.acquireSubLListListIterator(this);
      iter2 = resourcer.acquireSubLListListIterator(otherCons);
      while (iter1.hasNext() && (!iter1.isNextImproperElement())) {
        if ((!iter2.hasNext()) || (iter2.isNextImproperElement())) {
          return false;
        }
        if (!iter1.next().equals(iter2.next())) {
          return false;
        }
      }
      if (iter1.isNextImproperElement()) {
        if (iter2.isNextImproperElement()) {
          return iter1.getDottedElement().equals(iter2.getDottedElement());
        }
        return false;
      } else if (iter2.hasNext()) {
        // iter1 is prefix of iter2 case
        return false;
      }
      // they should be equal at this point
      return true;
    } finally {
      resourcer.releaseSubLListListIterator(iter1);
      resourcer.releaseSubLListListIterator(iter2);
    }
  }
  
  public final SubLObject mapcar(SubLFunction functionTyped) {
    return mapcar(functionTyped, Resourcer.EMPTY_SUBL_OBJECT_ARRAY, true);
  }
  
  public final SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
    return mapcar(functionTyped, moreLists, true);
  }
  
  public final SubLObject mapcar(final SubLFunction functionTyped, final SubLObject[] moreLists, final boolean returnConsedResults) {
    if (this == SubLNil.NIL) { return SubLNil.NIL; }
    for (int i = 0, size = moreLists.length; i < size; i++) {
      if (moreLists[i] == SubLNil.NIL) {
        return SubLNil.NIL;
      }
    }
    final int mapArity = 1 + moreLists.length;
    if (mapArity == 1) {
      UnaryFunction func = UnaryFunction.makeInstance(functionTyped);
      return mapResult(func, returnConsedResults);
    } else if (mapArity == 2) {
      BinaryFunction func = BinaryFunction.makeInstance(functionTyped);
      SubLList listTyped2 = moreLists[0].toList();
      return mapResult(func, listTyped2, returnConsedResults);
    } else {
      return mapResult(functionTyped, moreLists, returnConsedResults);
    }
  }
 
//// Protected Area
  
//// Private Area
  
  private final SubLList mapResult(UnaryFunction function, boolean returnConsedResults) {
    SubLList result = SubLNil.NIL;
    for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest()) {
      final SubLObject curResult = function.processItem(cur.first());
      if (returnConsedResults) {
        result = SubLObjectFactory.makeCons(curResult, result);
      }
    }
    if (returnConsedResults) {
      return result.asConsList().reverse(true).toList();
    }
    return result;
  }
  
  private final SubLList mapResult(BinaryFunction function, SubLList list2, boolean returnConsedResults) {
    SubLList result = SubLNil.NIL;
    for (SubLObject cur = this, cur2 = list2; 
        (cur != SubLNil.NIL) && (cur2 != SubLNil.NIL) ; 
        cur = cur.rest(), cur2 = cur2.rest()) {
      final SubLObject curResult = function.processItem(cur.first(), cur2.first());
      if (returnConsedResults) {
        result = SubLObjectFactory.makeCons(curResult, result);
      }
    }
    if (returnConsedResults) {
      return result.asConsList().reverse(true).toList();
    }
    return result;
  }

  private final SubLList mapResult(SubLFunction function, SubLObject[] moreLists, boolean returnConsedResults) {
    ArrayList<SubLObject> results = new ArrayList<SubLObject>();
    SubLListListIterator[] iterators = new SubLListListIterator[1 + moreLists.length]; // @todo get rid of call to new -APB
    int iteratorCount = iterators.length;
    SubLObject[] args = null;
    Resourcer resourcer = Resourcer.getInstance();
    try {
      args = resourcer.acquireSubLObjectArray(iteratorCount);
      iterators[0] = resourcer.acquireSubLListListIterator(this);
      for (int i = 0, size = moreLists.length; i < size; i++) {
        iterators[i +  1] = resourcer.acquireSubLListListIterator(moreLists[i].toList());
      }
      SubLListListIterator iter = null;
      SubLObject curResult = null;
      while (true) {
        for (int i = 0; i < iteratorCount; i++) {
          iter = iterators[i];
          if (!iter.hasNext()) {
            return SubLObjectFactory.makeList(results);
          }
          if (iter.isNextImproperElement()) {
            Errors.error("Unexpected improper list: " + ((i == 0) ? this : moreLists[i-1]));
          }
          args[i] = iter.nextSubLObject();
        }
        curResult = Functions.funcall(function, args);
        if (results != null) {
          results.add(curResult);
        }
      }
    } finally {
      resourcer.releaseSubLObjectArray(args);
      for (int i = 0, size = iterators.length; i < size; i++) {
        resourcer.releaseSubLListListIterator(iterators[i]);
      }
    }
  }
  
  public final SubLOperator getFunction() { 
    if (!isCons()) {
      Errors.error(this + " is not of type: STREAM.");
      return null;
    }
    return SubLOperatorFactory.makeInterpretedFunction(this.toCons(),
      SubLEnvironment.currentEnvironment());
  }
  
  
  /** Return the value for INDICATOR in PLIST, or DEFAULT if not present */
  public final SubLObject getf(SubLObject indicator, SubLObject v_default) {
    // @todo get rid of duplication with conses_high...this version shoul prevail
    // @todo hand optimize this code
    if ((v_default == CommonSymbols.UNPROVIDED)) {
      v_default = SubLNil.NIL;
    }
    SubLObject next = SubLNil.NIL;
    SubLObject key = SubLNil.NIL;
    for (next = this, key = ConsesLow.car(next); (SubLNil.NIL == Types.sublisp_null(next)); next = next.rest().rest(), key = ConsesLow.car(next)) {
      if ((indicator == key)) {
        return next.second();
      }
    }
    return v_default;
  }

  /** Return a plist which has VALUE stored for INDICATOR in PLIST */
  public final SubLList putf(SubLObject indicator, SubLObject value) {
    // @todo get rid of duplication with conses_high...this version shoul prevail
    // @todo hand optimize this code
    SubLObject back = SubLNil.NIL;
    SubLObject next = SubLNil.NIL;
    SubLObject key = SubLNil.NIL;
    for (back = SubLNil.NIL, next = this, key = ConsesLow.car(next); (SubLNil.NIL == Types.sublisp_null(next)); back = ConsesLow.cdr(next), next = next.rest().rest(), key = ConsesLow.car(next)) {
      if ((indicator == key)) {
        ConsesLow.rplaca(ConsesLow.cdr(next), value);
        return this;
      }
    }
    if ((SubLNil.NIL != back)) {
      ConsesLow.rplacd(back, ConsesLow.list(indicator, value));
      return this;
    } else {
      return ConsesLow.listS(indicator, value, this);
    }
  }
  
  /** Return a plist which has no value stored for INDICATOR in PLIST */
  public final SubLList remf(SubLObject indicator) {
    // @todo get rid of duplication with conses_high...this version shoul prevail
    // @todo hand optimize this code
    SubLObject back = SubLNil.NIL;
    SubLObject next = SubLNil.NIL;
    SubLObject key = SubLNil.NIL;
    for (back = SubLNil.NIL, next = this, key = ConsesLow.car(next); (SubLNil.NIL == Types.sublisp_null(next)); back = ConsesLow.cdr(next), next = next.rest().rest(), key = ConsesLow.car(next)) {
      if ((indicator == key)) {
        if ((SubLNil.NIL != back)) {
          ConsesLow.rplacd(back, next.rest().rest());
          return this;
        } else {
          return next.rest().rest().toList();
        }
      }
    }
    return this;
  }

//// Internal Rep
  
//// Main
  
}
