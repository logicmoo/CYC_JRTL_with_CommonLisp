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

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.List;

public  final class SubLConsFacade 
  extends AbstractSubLSequence
  implements SubLObject, SubLSequence, SubLCons, SubLList, Cloneable {
  
  ///// Constructors
  
  SubLConsFacade(SubLList list) {
    // @todo isConsFacade() to SubLObject
    if (list instanceof SubLConsFacade) {
      Errors.error("Can't nest list facades.");
    }
    this.list = list;
  }
  
  //// SubLObject
  
  public SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    SubLObject result = list.eval(env);
    if (result == list) { return this; }
    return SubLObjectFactory.wrapList(result);
  }
  public boolean equals(Object obj) { return list.equals(obj); }
  public boolean equal(SubLObject obj) { return list.equal(obj); }
  public boolean equalp(SubLObject obj) { return list.equalp(obj); }
  public final Object clone() { return list.clone(); }
  public final SubLObject makeCopy() { return list.makeCopy(); }
  public final SubLObject makeDeepCopy() { return list.makeDeepCopy(); }
  public int hashCode(int currentDepth) { return list.hashCode(currentDepth); }
  public String toTypeName() { return list.toTypeName(); }
  public String toString() { return list.toString(); }
  
  //// SubLList

  /** cdr */
  public SubLObject rest() { 
    list = list.asConsList();
    return list.rest(); 
  }
  /** car */
  public SubLObject caar() { return list.caar(); }
  public SubLObject cadr() { return list.cadr(); }
  public SubLObject cdar() { 
    list = list.asConsList();
    return list.cdar(); 
  }
  public SubLObject cddr() { 
    list = list.asConsList();
    return list.cddr(); 
  }
  public SubLObject caddr() { return list.caddr(); }
  public SubLObject cdddr() { return list.cdddr(); }
  public SubLObject cadddr() { return list.cadddr(); }
  public SubLObject cddddr() {
    list = list.asConsList();
    return list.cddddr(); 
  }
  
  public final int consLength() {
    return list.toCons().consLength();
  }
  
  public SubLObject mapcar(SubLFunction functionTyped) { 
    return list.mapcar(functionTyped); 
  }
  public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) { 
    return list.mapcar(functionTyped, moreLists); 
  }
  public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) { 
    return list.mapcar(functionTyped, moreLists, returnConsedResults); 
  }
  
  public boolean isProper() { return list.isProper(); }
  public SubLObject nthCdr(int index) {
    if (index == 0) { return this; }
    list = list.asConsList();
    return list.nthCdr(index); 
  }
  public SubLCons push(SubLObject item) { return list.push(item); }
  public SubLCons pushNew(SubLObject item) { 
    SubLCons result = list.pushNew(item); 
    return (result == list) ? this : result;
  }
  public SubLCons pushNew(SubLObject item, BinaryFunction test) { 
    SubLCons result = list.pushNew(item, test); 
    return (result == list) ? this : result;
  }
  public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) { 
    SubLCons result = list.pushNew(item, test, key); 
    return (result == list) ? this : result;
  }
  public SubLObject pop() { 
    SubLObject result = list.pop(); 
    return (result == list) ? this : result;
  }
  public SubLObject last(int n) { 
    if (n > 0) { 
      list = list.asConsList();
      SubLObject result = list.last(n); 
      return (result == list) ? this : result;
    }
    return list.last(n);
  }
  public SubLList append(SubLList list, boolean isReverse) { 
    SubLList result = list.append(list, isReverse); 
    return (result == list) ? this : result;
  }
  public SubLList copyList()  { return list.copyList(); }
  public SubLList copyTree() { return list.copyTree(); }
  public SubLList treeEqual(SubLList tree1, SubLList tree2) { return list.treeEqual(tree1, tree2); }
  public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) { return list.treeEqual(tree1, tree2, test); }
  public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) { return (this.list).concatenate(list, isDestructive, isReverse); }
  public SubLList allElementsButLast(int howMany, boolean isDestructive) { return list.allElementsButLast(howMany, isDestructive); }
  public SubLList listPrefix(SubLList postFix) { return list.listPrefix(postFix); }
  public int listLength() { return list.listLength(); }
  public int size() { return list.size(); }
  // substitutions
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive) { return list.substituteFromAList(alist, isDestructive); }
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) { return list.substituteFromAList(alist, isDestructive, test); }
  public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) { return list.substituteFromAList(alist, isDestructive, test, key); }
  // as sets
  public SubLList member(SubLObject item) { 
    list = list.asConsList();
    return list.member(item); 
  }
  public SubLList member(SubLObject item, BinaryFunction test) { 
    list = list.asConsList();
    return list.member(item, test); 
  }
  public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) { 
    list = list.asConsList();
    return list.member(item, test, key); 
  }
  public SubLList memberIf(BinaryFunction test) { 
    list = list.asConsList();
    return list.memberIf(test); 
  }
  public SubLList memberIf(BinaryFunction test, UnaryFunction key) { 
    list = list.asConsList();
    return list.memberIf(test, key); 
  }
  public boolean isSubList(SubLList sublist) { return list.isSubList(sublist); }
  public SubLList adjoin(SubLObject item) { return list.adjoin(item); }
  public SubLList adjoin(SubLObject item, BinaryFunction test) { return list.adjoin(item, test); }
  public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) { return list.adjoin(item, test, key); }
  public SubLList union(SubLList item, boolean isDestructive) { return list.union(item, isDestructive); }
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) { return list.union(item, isDestructive, test); }
  public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) { return list.union(item, isDestructive, test, key); }
  public SubLList intersection(SubLList item, boolean isDestructive) { return list.intersection(item, isDestructive); }
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) { return list.intersection(item, isDestructive, test); }
  public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) { return list.intersection(item, isDestructive, test, key); }
  public SubLList setDifference(SubLList item, boolean isDestructive) { return list.setDifference(item, isDestructive); }
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) { return list.setDifference(item, isDestructive, test); }
  public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) { return list.setDifference(item, isDestructive, test, key); }
  public SubLList setXor(SubLList item, boolean isDestructive) { return list.setXor(item, isDestructive); }
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) { return list.setXor(item, isDestructive, test); }
  public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) { return list.setXor(item, isDestructive, test, key); }
  public boolean isSubSet(SubLList list) { return list.isSubSet(list); }
  public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) { return list.assoc(item, test, key); }
  // destructive modification primitives
  public SubLCons setFirst(SubLObject first) { return list.setFirst(first); }
  public SubLCons setRest(SubLObject rest) { 
    if (rest.isList()) {
      SubLList restList = rest.toList();
      if (restList != SubLNil.NIL) {
        list = SubLObjectFactory.makeCons(list.first(), SubLT.T);
        rest = restList.asConsList();
      }
      /*if (isArrayBased() && (!(restList.isArrayBased()))) {
        list = list.asConsList();
      } else if ((!isArrayBased()) && (restList.isArrayBased())) {
        restList = restList.asConsList();
      }*/
    }
    SubLCons result = list.setRest(rest); 
    return (result == list) ? this : result;
  }
  public SubLObject setDottedElement(SubLObject dottedElement) { 
    SubLObject result = list.setDottedElement(dottedElement);
    return (result == list) ? this : result.toList();
  }
  public SubLObject getDottedElement() { return list.getDottedElement(); }
  public SubLObject[] toSubLObjectArray() { return list.toSubLObjectArray(); } 
  public SubLList asConsList() { 
    SubLList result = list.asConsList();
    return (result == list) ? this : result;
  }
  public SubLList asArrayList() { 
    SubLList result = list.asArrayList();
    // @todo isConsFacade() to SubLObject
    return (result == list) ? this : 
      ((result instanceof SubLConsFacade) ? result : new SubLConsFacade(result));
  }
  public boolean isArrayBased() { return list.isArrayBased(); }
  
  //// SEQUENCES
  
  public SubLSequence subSeq(int start, int end) { return list.subSeq(start, end); }
  public final SubLSequence reverse(boolean isDestructive) { 
    SubLSequence result = list.reverse(isDestructive); 
    return (result == list) ? this : result;
  }
  public final SubLSequence concatenate(SubLObject[] sequences) { return list.concatenate(sequences); }
  public final SubLSequence makeSequenceFromJavaList(List newBuf) { return list.makeSequenceFromJavaList(newBuf); }
  public final SubLObject get(int index) { return list.get(index); }
  public void set(int index, SubLObject newVal) { list.set(index, newVal); }
  public SubLList addItem(SubLObject item) { return list.addItem(item); }
  public final SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) { 
    return list.reduce(func, start, end, initialValue); 
  }
  public final SubLSequence fill(SubLObject item, int start, int end) { return list.fill(item, start, end); }
  public final SubLSequence remove(SubLObject item, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start, int end, int count) { 
    SubLSequence result = list.remove(item, isDestructive, test, key, start, end, count); 
    return (result == list) ? this : result;
  }
  public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start, int end, int count) { 
    SubLSequence result = list.removeIf(test, isDestructive, key, start, end, count);
    return (result == list) ? this : result;
  }
  public final SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start, int end) { 
    SubLSequence result = list.removeDuplicates(isDestructive, test, key, start, end);  
    return (result == list) ? this : result;
  }
  public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start, int end, int count) { 
    SubLSequence result = list.substitute(newItem, oldItem, isDestructive, test, key, start, end, count); 
    return (result == list) ? this : result;
  }
  public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start, int end, int count) { 
    SubLSequence result = list.substituteIf(newItem, test, isDestructive, key, start, end, count);
    return (result == list) ? this : result;
  }
  public final SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) { return list.find(item, test, key, start, end); }
  public final SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) { return list.findIf(test, key, start, end); }
  public final int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) { return list.positionOfIf(test, key, start, end); }
  public final int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) { return list.count(item, test, key, start, end); }
  public final int countIf(UnaryFunction test, UnaryFunction key, int start, int end) { return list.countIf(test, key, start, end); }
  public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2, int end2) { return list.indexOfMismatch(otherSeq, test, key, start1, end1, start2, end2); }
  public final int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2, int end2) { return list.search(otherSeq, test, key, start1, end1, start2, end2); }
  public final SubLSequence replace(SubLSequence seq2, int start1, int end1, int start2, int end2) { 
    SubLSequence result = list.replace(seq2, start1, end1, start2, end2); 
    return (result == list) ? this : result;
  }
  public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) { return list.positionOf(item, test, key, start, end); }
  public SubLSequence deleteItems(boolean[] itemsToDelete, int count) { 
    SubLSequence result = list.deleteItems(itemsToDelete, count);
    return (result == list) ? this : result;
  }
  public SubLSequence delete(int startIndex, int endIndex) { 
    SubLSequence result = list.delete(startIndex, endIndex);
    return (result == list) ? this : result;
  }
  public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
    SubLSequence result = list.sort(isDestructive, pred, key);
    return (result == list) ? this : result;
  }
  
  public SubLObject getf(SubLObject indicator, SubLObject defaultValue) { return list.getf(indicator, defaultValue); }
  
  public SubLList putf(SubLObject indicator, SubLObject value) {
    SubLList result = list.putf(indicator, value);
    return (result == list) ? this : result;
  }
  public SubLList remf(SubLObject indicator){
    SubLList result = list.remf(indicator);
    return (result == list) ? this : result;
  }
  
  public boolean canFastHash() { return list.canFastHash(); }
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_cons$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.FOUR_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLCons toCons() { // SubLCons
    return this;
  }
  
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return false; }
  public final boolean isCons() { return true; }
  public final boolean isList() { return true; }
  public final boolean isSequence() { return true; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Internal Rep
  private SubLList list;
}
