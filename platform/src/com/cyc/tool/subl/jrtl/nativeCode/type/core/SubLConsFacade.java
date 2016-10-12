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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

public class SubLConsFacade extends AbstractSubLSequence
		implements SubLObject, SubLSequence, SubLCons, SubLList, Cloneable {

	///// Constructors

	//// Internal Rep
	private SubLList list;

	//// SubLObject

	SubLConsFacade(SubLList list) {
		// @todo isConsFacade() to SubLObject
		if (list instanceof SubLConsFacade)
			Errors.error("Can't nest list facades.");
		this.list = list;
	}

	public SubLList addItem(SubLObject item) {
		return this.list.addItem(item);
	}

	public SubLList adjoin(SubLObject item) {
		return this.list.adjoin(item);
	}

	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		return this.list.adjoin(item, test);
	}

	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.list.adjoin(item, test, key);
	}

	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		return this.list.allElementsButLast(howMany, isDestructive);
	}

	public SubLList append(SubLList list, boolean isReverse) {
		SubLList result = list.append(list, isReverse);
		return result == list ? this : result;
	}

	public SubLList asArrayList() {
		SubLList result = this.list.asArrayList();
		// @todo isConsFacade() to SubLObject
		return result == this.list ? this : result instanceof SubLConsFacade ? result : new SubLConsFacade(result);
	}

	public SubLList asConsList() {
		SubLList result = this.list.asConsList();
		return result == this.list ? this : result;
	}

	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.list.assoc(item, test, key);
	}

	//// SubLList

	/** car */
	public SubLObject caar() {
		return this.list.caar();
	}

	public SubLObject cadddr() {
		return this.list.cadddr();
	}

	public SubLObject caddr() {
		return this.list.caddr();
	}

	public SubLObject cadr() {
		return this.list.cadr();
	}

	public boolean canFastHash() {
		return this.list.canFastHash();
	}

	public SubLObject cdar() {
		this.list = this.list.asConsList();
		return this.list.cdar();
	}

	public SubLObject cddddr() {
		this.list = this.list.asConsList();
		return this.list.cddddr();
	}

	public SubLObject cdddr() {
		return this.list.cdddr();
	}

	public SubLObject cddr() {
		this.list = this.list.asConsList();
		return this.list.cddr();
	}

	public Object clone() {
		return this.list.clone();
	}

	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		return this.list.concatenate(list, isDestructive, isReverse);
	}

	public SubLSequence concatenate(SubLObject[] sequences) {
		return this.list.concatenate(sequences);
	}

	public int consLength() {
		return this.list.toCons().consLength();
	}

	public SubLList copyList() {
		return this.list.copyList();
	}

	public SubLList copyTree() {
		return this.list.copyTree();
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.count(item, test, key, start, end);
	}

	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.countIf(test, key, start, end);
	}

	public SubLSequence delete(int startIndex, int endIndex) {
		SubLSequence result = this.list.delete(startIndex, endIndex);
		return result == this.list ? this : result;
	}

	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		SubLSequence result = this.list.deleteItems(itemsToDelete, count);
		return result == this.list ? this : result;
	}

	public boolean equal(SubLObject obj) {
		return this.list.equal(obj);
	}

	public boolean equalp(SubLObject obj) {
		return this.list.equalp(obj);
	}

	public boolean equals(Object obj) {
		return this.list.equals(obj);
	}

	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		SubLObject result = this.list.eval(env);
		if (result == this.list)
			return this;
		return SubLObjectFactory.wrapList(result);
	}

	public SubLSequence fill(SubLObject item, int start, int end) {
		return this.list.fill(item, start, end);
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.find(item, test, key, start, end);
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.findIf(test, key, start, end);
	}

	public SubLObject get(int index) {
		return this.list.get(index);
	}

	public SubLObject getDottedElement() {
		return this.list.getDottedElement();
	}

	public SubLObject getf(SubLObject indicator, SubLObject defaultValue) {
		return this.list.getf(indicator, defaultValue);
	}

	public SubLSymbol getType() {
		return Types.$dtp_cons$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.FOUR_INTEGER;
	}

	public int hashCode(int currentDepth) {
		return this.list.hashCode(currentDepth);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		return this.list.indexOfMismatch(otherSeq, test, key, start1, end1, start2, end2);
	}

	public SubLList intersection(SubLList item, boolean isDestructive) {
		return this.list.intersection(item, isDestructive);
	}

	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		return this.list.intersection(item, isDestructive, test);
	}

	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.list.intersection(item, isDestructive, test, key);
	}

	public boolean isArrayBased() {
		return this.list.isArrayBased();
	}

	public boolean isAtom() {
		return false;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return true;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return true;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	//// SEQUENCES

	public boolean isProper() {
		return this.list.isProper();
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return true;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSubList(SubLList sublist) {
		return this.list.isSubList(sublist);
	}

	public boolean isSubSet(SubLList list) {
		return list.isSubSet(list);
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject last(int n) {
		if (n > 0) {
			this.list = this.list.asConsList();
			SubLObject result = this.list.last(n);
			return result == this.list ? this : result;
		}
		return this.list.last(n);
	}

	public int listLength() {
		return this.list.listLength();
	}

	public SubLList listPrefix(SubLList postFix) {
		return this.list.listPrefix(postFix);
	}

	public SubLObject makeCopy() {
		return this.list.makeCopy();
	}

	public SubLObject makeDeepCopy() {
		return this.list.makeDeepCopy();
	}

	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		return this.list.makeSequenceFromJavaList(newBuf);
	}

	public SubLObject mapcar(SubLFunction functionTyped) {
		return this.list.mapcar(functionTyped);
	}

	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
		return this.list.mapcar(functionTyped, moreLists);
	}

	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) {
		return this.list.mapcar(functionTyped, moreLists, returnConsedResults);
	}

	// as sets
	public SubLList member(SubLObject item) {
		this.list = this.list.asConsList();
		return this.list.member(item);
	}

	public SubLList member(SubLObject item, BinaryFunction test) {
		this.list = this.list.asConsList();
		return this.list.member(item, test);
	}

	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		this.list = this.list.asConsList();
		return this.list.member(item, test, key);
	}

	public SubLList memberIf(BinaryFunction test) {
		this.list = this.list.asConsList();
		return this.list.memberIf(test);
	}

	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		this.list = this.list.asConsList();
		return this.list.memberIf(test, key);
	}

	public SubLObject nthCdr(int index) {
		if (index == 0)
			return this;
		this.list = this.list.asConsList();
		return this.list.nthCdr(index);
	}

	public SubLObject pop() {
		SubLObject result = this.list.pop();
		return result == this.list ? this : result;
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.positionOf(item, test, key, start, end);
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return this.list.positionOfIf(test, key, start, end);
	}

	public SubLCons push(SubLObject item) {
		return this.list.push(item);
	}

	public SubLCons pushNew(SubLObject item) {
		SubLCons result = this.list.pushNew(item);
		return result == this.list ? this : result;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		SubLCons result = this.list.pushNew(item, test);
		return result == this.list ? this : result;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		SubLCons result = this.list.pushNew(item, test, key);
		return result == this.list ? this : result;
	}

	public SubLList putf(SubLObject indicator, SubLObject value) {
		SubLList result = this.list.putf(indicator, value);
		return result == this.list ? this : result;
	}

	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return this.list.reduce(func, start, end, initialValue);
	}

	public SubLList remf(SubLObject indicator) {
		SubLList result = this.list.remf(indicator);
		return result == this.list ? this : result;
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		SubLSequence result = this.list.remove(item, isDestructive, test, key, start, end, count);
		return result == this.list ? this : result;
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		SubLSequence result = this.list.removeDuplicates(isDestructive, test, key, start, end);
		return result == this.list ? this : result;
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		SubLSequence result = this.list.removeIf(test, isDestructive, key, start, end, count);
		return result == this.list ? this : result;
	}

	public SubLSequence replace(SubLSequence seq2, int start1, int end1, int start2, int end2) {
		SubLSequence result = this.list.replace(seq2, start1, end1, start2, end2);
		return result == this.list ? this : result;
	}

	/** cdr */
	public SubLObject rest() {
		this.list = this.list.asConsList();
		return this.list.rest();
	}

	public SubLSequence reverse(boolean isDestructive) {
		SubLSequence result = this.list.reverse(isDestructive);
		return result == this.list ? this : result;
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return this.list.search(otherSeq, test, key, start1, end1, start2, end2);
	}

	public void set(int index, SubLObject newVal) {
		this.list.set(index, newVal);
	}

	public SubLList setDifference(SubLList item, boolean isDestructive) {
		return this.list.setDifference(item, isDestructive);
	}

	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		return this.list.setDifference(item, isDestructive, test);
	}

	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.list.setDifference(item, isDestructive, test, key);
	}

	public SubLObject setDottedElement(SubLObject dottedElement) {
		SubLObject result = this.list.setDottedElement(dottedElement);
		return result == this.list ? this : result.toList();
	}

	// destructive modification primitives
	public SubLCons setFirst(SubLObject first) {
		return this.list.setFirst(first);
	}

	public SubLCons setRest(SubLObject rest) {
		if (rest.isList()) {
			SubLList restList = rest.toList();
			if (restList != SubLNil.NIL) {
				this.list = SubLObjectFactory.makeCons(this.list.first(), SubLT.T);
				rest = restList.asConsList();
			}
			/*
			 * if (isArrayBased() && (!(restList.isArrayBased()))) { list =
			 * list.asConsList(); } else if ((!isArrayBased()) &&
			 * (restList.isArrayBased())) { restList = restList.asConsList(); }
			 */
		}
		SubLCons result = this.list.setRest(rest);
		return result == this.list ? this : result;
	}

	public SubLList setXor(SubLList item, boolean isDestructive) {
		return this.list.setXor(item, isDestructive);
	}

	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		return this.list.setXor(item, isDestructive, test);
	}

	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.list.setXor(item, isDestructive, test, key);
	}

	public int size() {
		return this.list.size();
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLSequence result = this.list.sort(isDestructive, pred, key);
		return result == this.list ? this : result;
	}

	public SubLSequence subSeq(int start, int end) {
		return this.list.subSeq(start, end);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		SubLSequence result = this.list.substitute(newItem, oldItem, isDestructive, test, key, start, end, count);
		return result == this.list ? this : result;
	}

	// substitutions
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		return this.list.substituteFromAList(alist, isDestructive);
	}

	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		return this.list.substituteFromAList(alist, isDestructive, test);
	}

	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.list.substituteFromAList(alist, isDestructive, test, key);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		SubLSequence result = this.list.substituteIf(newItem, test, isDestructive, key, start, end, count);
		return result == this.list ? this : result;
	}

	/** Method created to avoid casting */
	public SubLCons toCons() { // SubLCons
		return this;
	}

	public String toString() {
		return this.list.toString();
	}

	public SubLObject[] toSubLObjectArray() {
		return this.list.toSubLObjectArray();
	}

	public String toTypeName() {
		return this.list.toTypeName();
	}

	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		return this.list.treeEqual(tree1, tree2);
	}

	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		return this.list.treeEqual(tree1, tree2, test);
	}

	public SubLList union(SubLList item, boolean isDestructive) {
		return this.list.union(item, isDestructive);
	}

	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		return this.list.union(item, isDestructive, test);
	}

	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.list.union(item, isDestructive, test, key);
	}
}
