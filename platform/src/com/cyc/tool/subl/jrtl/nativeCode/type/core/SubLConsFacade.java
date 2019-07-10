//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.LispObject;

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
	SubLConsFacade(SubLList list) {
		if (list instanceof SubLConsFacade)
			Errors.error("Can't nest list facades.");
		this.list = list;
	}

	@Override
	public Cons toLispObject() {
		return (Cons)asConsList();
	}

	private SubLList list;

	@Override
	public SubLList addItem(SubLObject item) {
		return list.addItem(item);
	}

	@Override
	public SubLList adjoin(SubLObject item) {
		return list.adjoin(item);
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		return list.adjoin(item, test);
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return list.adjoin(item, test, key);
	}

	@Override
	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		return list.allElementsButLast(howMany, isDestructive);
	}

	@Override
	public SubLList append(SubLList list, boolean isReverse) {
		SubLList result = list.append(list, isReverse);
		return result == list ? this : result;
	}

	@Override
	public SubLList asArrayList() {
		SubLList result = list.asArrayList();
		return result == list ? this : result instanceof SubLConsFacade ? result : new SubLConsFacade(result);
	}

	@Override
	public SubLList asConsList() {
		SubLList result = list.asConsList();
		return result == list ? this : result;
	}

	@Override
	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return list.assoc(item, test, key);
	}

	@Override
	public SubLObject caar() {
		return list.caar();
	}

	@Override
	public SubLObject cadddr() {
		return list.cadddr();
	}

	@Override
	public LispObject caddr() {
		return (LispObject) list.caddr();
	}

	@Override
	public LispObject cadr() {
		return (LispObject) list.cadr();
	}

	@Override
	public boolean canFastHash() {
		return list.canFastHash();
	}

	@Override
	public SubLObject cdar() {
		list = list.asConsList();
		return list.cdar();
	}

	@Override
	public SubLObject cddddr() {
		list = list.asConsList();
		return list.cddddr();
	}

	@Override
	public SubLObject cdddr() {
		return list.cdddr();
	}

	@Override
	public LispObject cddr() {
		list = list.asConsList();
		return (LispObject) list.cddr();
	}

	@Override
	public Object clone() {
		return list.clone();
	}

	@Override
	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		return this.list.concatenate(list, isDestructive, isReverse);
	}

	@Override
	public SubLSequence concatenate(SubLObject[] sequences) {
		return list.concatenate(sequences);
	}

	@Override
	public int consLength() {
		return list.toCons().consLength();
	}

	@Override
	public SubLList copyList() {
		return list.copyList();
	}

	@Override
	public SubLList copyTree() {
		return list.copyTree();
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return list.count(item, test, key, start, end);
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return list.countIf(test, key, start, end);
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndex) {
		SubLSequence result = list.delete(startIndex, endIndex);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		SubLSequence result = list.deleteItems(itemsToDelete, count);
		return result == list ? this : result;
	}

	@Override
	public boolean equal(SubLObject obj) {
		return list.equal(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		return list.equalp(obj);
	}

	@Override
	public boolean lispEquals(Object obj) {
		return list.lispEquals(obj);
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		SubLObject result = list.eval(env);
		if (result == list)
			return this;
		return SubLObjectFactory.wrapList(result);
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		return list.fill(item, start, end);
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return list.find(item, test, key, start, end);
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return list.findIf(test, key, start, end);
	}

	@Override
	public SubLObject get(int index) {
		return list.get(index);
	}

	@Override
	public SubLObject getDottedElement() {
		return list.getDottedElement();
	}

	@Override
	public SubLObject getf(SubLObject indicator, SubLObject defaultValue) {
		return list.getf(indicator, defaultValue);
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_cons$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		return list.hashCode(currentDepth);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		return list.indexOfMismatch(otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive) {
		return list.intersection(item, isDestructive);
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		return list.intersection(item, isDestructive, test);
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return list.intersection(item, isDestructive, test, key);
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isArrayBased() {
		return list.isArrayBased();
	}

	@Override
	public boolean isAtom() {
		return false;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return true;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return true;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isProper() {
		return list.isProper();
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return true;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSubList(SubLList sublist) {
		return list.isSubList(sublist);
	}

	@Override
	public boolean isSubSet(SubLList list) {
		return list.isSubSet(list);
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public SubLObject last(int n) {
		if (n > 0) {
			list = list.asConsList();
			SubLObject result = list.last(n);
			return result == list ? this : result;
		}
		return list.last(n);
	}

	@Override
	public int listLength() {
		return list.listLength();
	}

	@Override
	public SubLList listPrefix(SubLList postFix) {
		return list.listPrefix(postFix);
	}

	@Override
	public SubLObject makeCopy() {
		return list.makeCopy();
	}

	@Override
	public SubLObject makeDeepCopy() {
		return list.makeDeepCopy();
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		return list.makeSequenceFromJavaList(newBuf);
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped) {
		return list.mapcar(functionTyped);
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
		return list.mapcar(functionTyped, moreLists);
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) {
		return list.mapcar(functionTyped, moreLists, returnConsedResults);
	}

	@Override
	public SubLList member(SubLObject item) {
		list = list.asConsList();
		return list.member(item);
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test) {
		list = list.asConsList();
		return list.member(item, test);
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		list = list.asConsList();
		return list.member(item, test, key);
	}

	@Override
	public SubLList memberIf(BinaryFunction test) {
		list = list.asConsList();
		return list.memberIf(test);
	}

	@Override
	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		list = list.asConsList();
		return list.memberIf(test, key);
	}

	@Override
	public SubLObject nthCdr(int index) {
		if (index == 0)
			return this;
		list = list.asConsList();
		return list.nthCdr(index);
	}

	@Override
	public SubLObject pop() {
		SubLObject result = list.pop();
		return result == list ? this : result;
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return list.positionOf(item, test, key, start, end);
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return list.positionOfIf(test, key, start, end);
	}

	@Override
	public SubLCons push(SubLObject item) {
		return list.push(item);
	}

	@Override
	public SubLCons pushNew(SubLObject item) {
		SubLCons result = list.pushNew(item);
		return result == list ? this : result;
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		SubLCons result = list.pushNew(item, test);
		return result == list ? this : result;
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		SubLCons result = list.pushNew(item, test, key);
		return result == list ? this : result;
	}

	@Override
	public SubLList putf(SubLObject indicator, SubLObject value) {
		SubLList result = list.putf(indicator, value);
		return result == list ? this : result;
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return list.reduce(func, start, end, initialValue);
	}

	@Override
	public SubLList remf(SubLObject indicator) {
		SubLList result = list.remf(indicator);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		SubLSequence result = list.remove(item, isDestructive, test, key, start, end, count);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		SubLSequence result = list.removeDuplicates(isDestructive, test, key, start, end);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		SubLSequence result = list.removeIf(test, isDestructive, key, start, end, count);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence replace(SubLSequence seq2, int start1, int end1, int start2, int end2) {
		SubLSequence result = list.replace(seq2, start1, end1, start2, end2);
		return result == list ? this : result;
	}

	@Override
	public SubLObject rest() {
		list = list.asConsList();
		return list.rest();
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		SubLSequence result = list.reverse(isDestructive);
		return result == list ? this : result;
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return list.search(otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public void set(int index, SubLObject newVal) {
		list.set(index, newVal);
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive) {
		return list.setDifference(item, isDestructive);
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		return list.setDifference(item, isDestructive, test);
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return list.setDifference(item, isDestructive, test, key);
	}

	@Override
	public SubLObject setDottedElement(SubLObject dottedElement) {
		SubLObject result = list.setDottedElement(dottedElement);
		return result == list ? this : result.toList();
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		return list.setFirst(first);
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		if (rest.isList()) {
			SubLList restList = rest.toList();
			if (restList != SubLNil.NIL) {
				list = SubLObjectFactory.makeCons(list.first(), SubLT.T);
				rest = restList.asConsList();
			}
		}
		SubLCons result = list.setRest(rest);
		return result == list ? this : result;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive) {
		return list.setXor(item, isDestructive);
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		return list.setXor(item, isDestructive, test);
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return list.setXor(item, isDestructive, test, key);
	}

	@Override
	public int size() {
		return list.size();
	}

	@Override
	public int size(int max) {
		return list.size();
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLSequence result = list.sort(isDestructive, pred, key);
		return result == list ? this : result;
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		return list.subSeq(start, end);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		SubLSequence result = list.substitute(newItem, oldItem, isDestructive, test, key, start, end, count);
		return result == list ? this : result;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		return list.substituteFromAList(alist, isDestructive);
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		return list.substituteFromAList(alist, isDestructive, test);
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return list.substituteFromAList(alist, isDestructive, test, key);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		SubLSequence result = list.substituteIf(newItem, test, isDestructive, key, start, end, count);
		return result == list ? this : result;
	}

	@Override
	public SubLCons toCons() {
		return this;
	}

	@Override
	public String printObjectImpl() {
		return list.printObject();
	}

	@Override
	public SubLObject[] toSubLObjectArray() {
		return list.toSubLObjectArray();
	}

	@Override
	public String toTypeName() {
		return list.toTypeName();
	}

	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		return list.treeEqual(tree1, tree2);
	}

	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		return list.treeEqual(tree1, tree2, test);
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive) {
		return list.union(item, isDestructive);
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		return list.union(item, isDestructive, test);
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return list.union(item, isDestructive, test, key);
	}
}
